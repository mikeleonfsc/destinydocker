<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.lookup.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.session.district.ejb.ConfigDistrictFacadeSpecs" %>
<%@ page import="com.follett.fsc.destiny.util.Permission"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>
<%@ page import="java.util.List"%>
<%@ page import="com.follett.fsc.destiny.util.licensecheck.LicenseCheck"%>
<%@ page import="com.follett.fsc.common.StringHelper"%>

<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>


<bean:define id="form" name="<%=ReportMenuTabForm.FORM_NAME%>" type="ReportMenuTabForm"/>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request); 
    List items = form.getCustomReportList();
    
    Permission permissionsForNewCustomReport[] = form.getCreateCustomReportPermissions();

%>
<base:messageBox strutsErrors="true"/>

<logic:equal name="<%=ReportMenuTabForm.FORM_NAME%>" property="confirmDelete" value="true" >
    <base:form action="/backoffice/servlet/handlereportmenutabform.do">
    <html:hidden name="<%=ReportMenuTabForm.FORM_NAME%>" property="<%=ReportMenuTabForm.PARAMS_JOB_SPEC_ID%>"/>
    <html:hidden name="<%=ReportMenuTabForm.FORM_NAME%>" property="<%=ReportMenuTabForm.PARAM_PAGE%>"/>
        <base:imageSpacer width="1" height="3"/>
        <%
            String message = "";
            if (form.getDeleteSharedReportInfo() != null) {
                message = MessageHelper.formatMessage("reportmenu_custom_AreYouSureYouWantToDelete0DeletingThisReportWillAlsoRemoveItFrom1", form.getDeleteReportName(), form.getDeleteSharedReportInfo());
            } else {
                message = MessageHelper.formatMessage("reportmenu_custom_AreYouSureYouWantToDelete0", form.getDeleteReportName());
            }
        %>
        <base:messageBox showWarningIcon="true" message="<%=message%>">
            <% if (form.getNumberOfFavorites() > 0) { %>
            <tr><td valign="baseline" align="center" class="ColRow" colspan="2"><ul><li><%=MessageHelper.formatMessage("reportmenu_custom_UsersWithThisReport0", new Long(form.getNumberOfFavorites())) %></li></ul></td></tr>
            <% } %>
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2">
                    <base:yesNo 
                        buttonYesName="<%=ReportMenuTabForm.BUTTON_CONFIRM_DELETE%>"
                        buttonNoName="<%=ReportMenuTabForm.BUTTON_CANCEL_DELETE%>"
                    />
                </td>
            </tr>
        </base:messageBox>
    </base:form>
</logic:equal>

<base:outlinedTableAndTabsWithinThere cellpadding="2" width="100%" id="<%=ReportMenuTabForm.TABLE_NAME%>" selectedTab="<%=form.getCurrentTab()%>" tabs="<%=form.getTabs()%>" >
    <%if(form.showServerHealthReports()){ %>
        <jsp:include page="/common/systemreportsguts.jsp" />
    <% } %>
    <tr>
       <td background="/images/icons/general/thickline.gif" height="18" width="100%">&nbsp;<span class="SectionHeader"><%=MessageHelper.formatMessage("reportmenu_custom_ReportBuilder") %></span></td>
       <td class="tdAlignRight" height="18">
          <base:link page="/backoffice/servlet/presentcrwnewreportform.do" permissions='<%=permissionsForNewCustomReport%>' showTextAlways='false' id="<%=ReportMenuTabForm.ID_NEW_REPORT%>">
          <base:image align="absbottom" src="/buttons/large/newreport.gif" alt='<%= MessageHelper.formatMessage("newReport") %>'/>
          </base:link>
       </td>
    </tr>
    <% if (!UserContext.isInConsortium() && !UserContext.isMyContextStateRepository()) { %>
    <tr>    
       <td class="TableHeading">&nbsp;</td>
       <td class="tdAlignRight">
          <base:link page="/backoffice/servlet/presentcrwimportreportform.do" permissions='<%=permissionsForNewCustomReport%>' showTextAlways='false' id="<%=ReportMenuTabForm.ID_IMPORT%>">
          <base:image align="absbottom" src="/buttons/large/importsetup.gif" alt='<%= MessageHelper.formatMessage("importSetup") %>'/>
          </base:link>
       </td>
    </tr>
    <% } %>
    <% BooleanStringValue bsValue = ConfigDistrictFacadeSpecs.canDoLengthyTask(ConfigDistrictFacadeSpecs.LENGTHY_TASK_RUN_CUSTOM_REPORT);
    if (!bsValue.isBoolValue()) { %>
    <tr>
        <td class="Instruction" colspan="2">
            <%= bsValue.getMessage() %>
        </td>
    </tr>
    <% } %>
    <tr>
       <td colspan="2">
         <base:imageLine/>
      </td>
    </tr>     
    <tr>
       <td colspan="2" align="center">
         <table id="<%=ReportMenuTabForm.TABLE_NAME_LIST%>" cellpadding="3" cellspacing="0" width="100%">
            <base:customReportList permissions='<%=permissionsForNewCustomReport%>' items="<%=items%>" formName="<%=ReportMenuTabForm.FORM_NAME%>"/>
         </table>
      </td>
    </tr>     

  <%if(!items.isEmpty() && form.getHelpIcons()!=null){ %>
    <tr>
       <td colspan="2">
         &nbsp;
      </td>
    </tr>     
    <tr>
       <td colspan="2">
         <base:imageLine/>
      </td>
    </tr>     
      <tr align="center">
            <td  colspan="2">
              <base:helpIcons buttonsToOutput='<%= form.getHelpIcons() %>' breakAfterCells='4'/>
            </td>
      </tr>
  <%}%>
</base:outlinedTableAndTabsWithinThere>
