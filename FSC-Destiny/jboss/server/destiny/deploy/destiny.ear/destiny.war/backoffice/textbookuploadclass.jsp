<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c"%>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm"%>
<%@ page import="com.follett.fsc.destiny.session.common.*"%>


<%@page import="com.follett.fsc.destiny.util.Permission"%><script language="JavaScript" type="text/javascript">
  <!--
    function submitDropDown() {
            document.<%=TextbookUploadClassForm.FORM_NAME%>.<%=TextbookUploadClassForm.BUTTON_CHANGE_SUBMIT%>.value = "true";
            document.<%=TextbookUploadClassForm.FORM_NAME%>.submit();
    }
  // -->
</script>

<base:messageBox strutsErrors="true" />

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    TextbookUploadClassForm form = (TextbookUploadClassForm) request.getAttribute(TextbookUploadClassForm.FORM_NAME);
%>

<br>
<script language="JavaScript">
<!--
    function trapEnter(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        return false;
      }
      return true;
    }
//-->
</script>

<base:form action="/backoffice/servlet/handletextbookuploadclassform.do"
    enctype="multipart/form-data">
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=TextbookUploadClassForm.BUTTON_TRAP_ENTER%>">

    <html:hidden property="localRelativeFile" />
    <html:hidden property="localFileNameOnly" />
    <html:hidden property="<%=TextbookUploadClassForm.PARAM_DONOTCLEARCRUMBS%>" />
    <html:hidden property="<%=TextbookUploadClassForm.BUTTON_CHANGE_SUBMIT%>" />

    <%-- Are we confirming an update? --%>
    <logic:equal name="backoffice_servlet_TextbookUploadClassForm"
        property="confirmUpdate" value="true">
        <html:hidden property="<%=TextbookUploadClassForm.FIELD_UPLOAD_TYPE%>" />
        <html:hidden property="<%=TextbookUploadClassForm.FIELD_LOAN_PERIOD_ID%>" />
        <html:hidden property="<%=TextbookUploadClassForm.FIELD_KEEP_EXISTING_SECTIONS%>" />
        <% 
            String msg = form.getUploadType() == form.UPLOAD_TYPE_CLASS_SCHEDULES 
                ? "The \"Update class schedules\" process is not reversible." 
                : "The \"Update textbook associations\" process is not reversible.";
        %>
        <base:imageSpacer width="1" height="3" />
        <base:messageBox showWarningIcon="true" message="<%= msg %>">
            <tr>
                <td align="center" class="ColRow" colspan="2">Do you have a
                current backup of your database?</td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:yesButton /> <base:noButton
                    name="<%=TextbookUploadClassForm.BUTTON_CONFIRM_NO%>" /></td>
            </tr>
        </base:messageBox>
    </logic:equal>

    <logic:equal name="backoffice_servlet_TextbookUploadClassForm"
        property="confirmUpdate" value="false">
        <base:outlinedTableAndTabsWithinThere
            id="<%=TextbookUploadClassForm.TABLE_UPLOAD_CLASS%>"
            selectedTab="<%=UpdateClassesNavigationForm.TAB_UPLOAD_CLASS%>"
            tabs="<%=form.getTabs()%>">
            <tr>
                 <% if (store.isTextbookProductSupported()) { %>
                    <td class="TableHeading">Upload Changes...</td>
                <% } else { %>
                    <td class="TableHeading">Upload Changes to Class Schedules</td>
                <% } %>
            </tr>

            <tr>
                 <% if (store.isTextbookProductSupported()) { %>
                    <td><html:select
                        property="<%= TextbookUploadClassForm.FIELD_UPLOAD_TYPE %>"
                        onchange="submitDropDown()">
                        <html:option
                            value="<%= String.valueOf(TextbookUploadClassForm.UPLOAD_TYPE_CLASS_SCHEDULES) %>">Class schedules</html:option>
                        <html:option
                            value="<%= String.valueOf(TextbookUploadClassForm.UPLOAD_TYPE_TEXTBOOK_ASSOC) %>">Textbook associations</html:option>
                    </html:select></td>
                <% } else { %>
                    <td>&nbsp;
                     <html:hidden property="<%= TextbookUploadClassForm.FIELD_UPLOAD_TYPE %>" value="<%= String.valueOf(TextbookUploadClassForm.UPLOAD_TYPE_CLASS_SCHEDULES) %>" />
                     </td>
                <% } %>
            </tr>

            <logic:equal name="<%= TextbookUploadClassForm.FORM_NAME %>"
                property="<%= TextbookUploadClassForm.FIELD_UPLOAD_TYPE %>"
                value="<%= String.valueOf(TextbookUploadClassForm.UPLOAD_TYPE_CLASS_SCHEDULES) %>">
                <tr>
                    <td vAlign="top" class="Instruction"> Upload
                    class schedules lets you add/update classes and
                    section information.
                    </td>
                </tr>
                <tr>
                    <td><base:imageLine/></td>
                </tr>
                <tr>
                    <td class="ColRowBold" align="center">Sections that are not included in the update file should be:</td>
                </tr>
                
                <tr>
                    <td align="center">
                        <table id="<%=TextbookUploadClassForm.TABLE_KEEP_OPTIONS%>">
                            <tr>
                                <td class="ColRow">
                                    <html:radio property="<%= TextbookUploadClassForm.FIELD_KEEP_EXISTING_SECTIONS %>" value="false">&nbsp;Removed</html:radio>
                                </td>
                            </tr>
                            <tr>
                                <td class="ColRow">
                                    <html:radio property="<%= TextbookUploadClassForm.FIELD_KEEP_EXISTING_SECTIONS %>" value="true">&nbsp;Retained</html:radio>
                                </td>
                            </tr>
                        </table>
                   </td>
                </tr>
                
                <tr>
                    <td><base:imageLine/></td>
                </tr>
                <tr>
                    <td class="ColRowBold" align="center">If section start and end dates are missing, use the dates from the following loan period:</td>
                </tr>
                
                <tr>
                    <td valign="bottom" align="center" class="ColRow" colspan="1">
                        <bean:define id="loanPeriods" name="<%= TextbookUploadClassForm.FORM_NAME %>" property="<%= TextbookUploadClassForm.FIELD_LOAN_PERIOD_LIST %>"/>

                        <html:select property="<%= TextbookUploadClassForm.FIELD_LOAN_PERIOD_ID %>">
                            <html:options collection="loanPeriods" property="systemDateID" labelProperty="displayableDescriptionWithStartAndEndDates"/>
                        </html:select>
                         <base:spanIfAllowed permissions="<%=new Permission[]{Permission.BACK_OFFICE_TEXTBOOK_AED_LOAN_POLICIES, Permission.BACK_OFFICE_ASSET_AED_LOAN_POLICIES}%>">
                            <base:genericButton src="/buttons/large/other.gif" absbottom="true" name="<%= TextbookUploadClassForm.BUTTON_NAME_OTHER_LOAN_PERIOD %>" alt="Other Loan Period"/>
                        </base:spanIfAllowed>
                    </td>
                </tr>
                <% if (form.duplicateLoanPeriodsExist()) { %>
                    <tr>
                        <td class = "ColRow" align = "center"><%= form.getDuplicateLoanPeriodMsg() %></td>
                    </tr>
                <% } %>
                <tr>
                    <td><base:imageLine/></td>
                </tr>

                <tr>
                    <td>
                     <span class="ColRowBold">Please note...</span> 
                        <span class="ColRow">
                        <ul>
                            <li>Your update file should contain a list of class and section information.</li>
                            <li>Existing classes and textbook associations will be retained.</li>
                        <base:isDistrictUser>
                            <li>Sites not included in the upload file will not be modified.</li>
                        </base:isDistrictUser> 
                            <li>New classes will be added.</li>
                            <li>Changes are NOT reversible.</li>
                            <li>Loan periods with duplicated class start and end dates may give you unexpected results.</li>
                        </ul>
                        </span>
                    </td>
                </tr>
            </logic:equal>

            <logic:equal name="backoffice_servlet_TextbookUploadClassForm"
                property="<%= TextbookUploadClassForm.FIELD_UPLOAD_TYPE %>"
                value="<%= String.valueOf(TextbookUploadClassForm.UPLOAD_TYPE_TEXTBOOK_ASSOC) %>">
                <tr>
                    <td vAlign="top" class="Instruction"> Upload
                    textbook associations lets you add/update/delete textbooks
                    assigned to classes and sections.
                    </td>
                </tr>
                <tr>
                    <td><span class="ColRowBold">Please note...</span>
                    <base:isDistrictUser>
                        <span class="ColRow">
                        <ul>
                            <li>Your update file should only contain your district's textbook associations.
                            <li>Sites not included in the upload file will not be modified.
                            <li>Any existing textbook associations not included in the xml will be retained.
                            <li>Changes are NOT reversible.
                        </ul>
                        </span>
                    </base:isDistrictUser>
                    <base:isNotDistrictUser>
                        <span class="ColRow">
                        <ul>
                            <li>Your update file should only contain your site's textbook associations.
                            <li>Any existing textbook associations not included in the xml will be retained.
                            <li>Changes are NOT reversible.
                        </ul>
                        </span>
                    </base:isNotDistrictUser>
                   </td>
                </tr>
            </logic:equal>

            <tr>
                <td align="center" class="ColRowBold">
                    <%=GenericForm.getLastBackupDisplayMsg(true)%>
                </td>
            </tr>
            <tr>
                <td align="center" class="ColRowBold">Update File&nbsp;
            <span onKeyPress="return trapEnter(event);">
                <html:file
                    property="<%=TextbookUploadClassForm.FIELD_UPLOAD_FILE%>"
                    size="40" />
            </span>
                </td>
            </tr>
            <tr>
                <td align="center" class="ColRowBold"><base:genericShowHideButton
                    src="/buttons/large/update.gif"
                    name="<%=TextbookUploadClassForm.BUTTON_UPDATE_CLASSES%>"
                    alt="<%=TextbookUploadClassForm.BUTTON_UPDATE_CLASSES_ALT_TEXT%>"
                    elementID="updatePatrons" /> <br>
                </td>
            </tr>
        </base:outlinedTableAndTabsWithinThere>
    </logic:equal>

</base:form>


