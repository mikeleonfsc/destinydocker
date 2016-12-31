<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.ConvertToResourceManagerForm"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.RoleSpecs"%>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>
<%@ page import="com.follett.fsc.destiny.client.common.JSPHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>



<%
    ConvertToResourceManagerForm form = (ConvertToResourceManagerForm)request.getAttribute(ConvertToResourceManagerForm.FORM_NAME);
%>
<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    String focus = "";
    if (ConvertToResourceManagerForm.ACTION_CONVERT_CONFIRM_BEFORE_PASSWORD_ENTERED.equals(form.getAction()) ) {
        focus = "password";
    }
%>
<base:messageBox strutsErrors="true"/>

<% if (form.getConvertOption() == (ConvertToResourceManagerForm.CONVERT_JOB)) { %>

    <logic:equal name="<%=ConvertToResourceManagerForm.FORM_NAME%>" property="action" value="<%=ConvertToResourceManagerForm.ACTION_CONVERT_CONFIRM_BEFORE_PASSWORD_ENTERED%>">
    <base:form action="/district/servlet/handleconverttoresourcemanagerform.do" focus="<%=focus%>">
            <base:imageSpacer width="1" height="3"/>
            <base:messageBox showWarningIcon="true" message="This process will transition your Textbook Manager data.">
                <html:hidden property="action" value="<%=ConvertToResourceManagerForm.ACTION_CONVERT_CONFIRM_AFTER_PASSWORD_ENTERED%>"/>
                 <html:hidden property="<%=ConvertToResourceManagerForm.FIELD_CONVERT_OPTION %>"/>
                    <tr>
                        <td align="center" class="ColRow" colspan="2">
                        <%= MessageHelper.formatMessage("converttoresourcemanager_ThisProcessCannotBeReversedBeforeProceedingYouShouldHaveACurrentBackupOfYourDatabase") %>
                        </td>
                    </tr>
                    <tr>
                        <td align="center" class="ColRow" colspan="2">
                            <logic:equal name="district_servlet_ConvertToResourceManagerForm" property="invalidPassword" value="true">
                                <font color="#cc0000">Invalid password</font>
                            </logic:equal>
                            <logic:equal name="district_servlet_ConvertToResourceManagerForm" property="invalidPassword" value="false">
                                To continue, please enter the district administrator's password:
                            </logic:equal>
                        </td>
                    </tr>
                    <tr>
                        <td align="center" class="ColRow" colspan="2">
                            <input type="password" name="password" size="14" maxlength="20" autocomplete="off"/>   
                        </td>
                    </tr>
                <tr>
                    <td valign="baseline" align="center" class="ColRow" colspan="2">
                        <html:submit property="submit">
                          OK
                        </html:submit>
                        <html:cancel>
                          Cancel
                        </html:cancel>
                    </td>
                </tr>
            </base:messageBox>
        </base:form>
    </logic:equal>

<% }%>


<base:form action="/district/servlet/handleconverttoresourcemanagerform.do">

      <br><center><span class="ColRowBold"><%= GenericForm.getLastBackupDisplayMsg(false) %></span></center><br>
      <jsp:include page="/common/msdewarning.jsp" flush="true" />
      <html:hidden property="<%=ConvertToResourceManagerForm.FIELD_CONFIRM_UPDATE %>"/>

    <logic:equal name="<%= ConvertToResourceManagerForm.FORM_NAME %>" property="<%=ConvertToResourceManagerForm.FIELD_CONFIRM_UPDATE %>" value="true">
        <base:messageBox showRedBorder="true">
            <tr valign="center">
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td class="ColRowBold"><%=form.gimmeUpdateConfirmMessage() %></td>
            </tr>
            <tr>
               <td>&nbsp;</td>

               <td class="ColRowBold">Are you sure you want to continue?</td>
            </tr>
            <tr>
               <td>&nbsp;</td>
               <td align="center">
                    <base:yesNo buttonNoName="<%=ConvertToResourceManagerForm.BUTTON_NAME_CONFIRM_UPDATE_NO %>" buttonYesName="<%= ConvertToResourceManagerForm.BUTTON_NAME_CONFIRM_UPDATE_YES %>" />
               </td>
            </tr>
        </base:messageBox>
    </logic:equal>


<base:outlinedTable id="<%=ConvertToResourceManagerForm.TABLE_MAIN_TABLE %>">
    <tr>
        <td class="TableHeading">Transition to Resource Manager</td>
    </tr>
    <% if(form.checkForFullConversionCompliance()) { %>
    <tr>
        <td class="ColRow tdAlignLeft">            
            Destiny Resource Manager is a universal system for managing all educational resources throughout a school district.
        </td>
    </tr>  
    <tr>
        <td class="ColRow tdAlignLeft">         
            This transition utility is designed to verify whether you can transition your textbook data (from Destiny Textbook Manager) into Destiny Resource Manager.
        </td>
    </tr>   
    <tr>
        <td class="ColRow tdAlignLeft">        
            This is a One Time, One Way transition. This process will move your textbook data into Resource Manager and cannot be reversed. This utility will transition all data records, their current status, as well as any administrative settings.
        </td>
    </tr>
    <tr>
        <td class="ColRow tdAlignLeft">
            This utility performs various checks to ensure a successful transition. For example; it will check if you have:
            <ul>
                <li>The correct licensing (a Destiny Resource Manager license at every Destiny Textbook Manager location),</li>
                <li>No open Resource or Textbook Inventories in process</li>
                <li>No Follett Classic barcodes beginning with a "T"</li>
            </ul>
        </td>
    </tr>
    <tr>
        <td class="ColRow tdAlignLeft">
            <b>Please note:</b> the following features that were in Destiny Textbook Manager are NOT in Destiny Resource Manager.
            <ul>
                <li>Forecasting</li>
                <li>Checkout to Class</li>
                <li>Checkout to Teacher</li>
                <li>Weeding report</li>
                <li>Saved reports</li>
                <li>Custom reports</li>
                <li>Multiple Currency Formats</li>
                <li>Upload textbook associations</li>
                <li>Follett Classic barcodes starting with "X" will be transitioned, but you will not be able to select Follett Classic as your preferred barcode symbology.</li>
            	<li>Follett Classic barcodes starting with "T" will not be transitioned.</li>
            </ul>
        </td>
    </tr>
        <% if (form.doHideConvertOptions()) { %>
            <html:hidden property="<%=ConvertToResourceManagerForm.FIELD_CONVERT_OPTION %>"/>
        <% } else if(DestinySystemProperties.isAllowResourceManagerConversion()) { %>
            <tr>
                <td class="ColRow tdAlignLeft">
                    <html:radio property="<%=ConvertToResourceManagerForm.FIELD_CONVERT_OPTION%>" value="<%=String.valueOf(ConvertToResourceManagerForm.CONVERT_PREVIEW)%>"> 
                        <b>Run transition in preview mode.</b><br>
                        <base:imageSpacer height="1" width="17"></base:imageSpacer>
                        This process will perform a check to determine whether the system is ready to transition from Destiny Textbook Manager to Destiny Resource Manager. <br>
                        <base:imageSpacer height="1" width="17"></base:imageSpacer>
                        No data will be changed during the check.</html:radio><br>
                    
                    <html:radio property="<%=ConvertToResourceManagerForm.FIELD_CONVERT_OPTION%>" value="<%=String.valueOf(ConvertToResourceManagerForm.CONVERT_JOB)%>"> 
                        <b>Run transition in full mode.</b><br>
                        <base:imageSpacer height="1" width="17"></base:imageSpacer>
                        This process will transition Textbook Manager data into Resource Manager.  <br>
                        <base:imageSpacer height="1" width="17"></base:imageSpacer>
                        Please make sure you have a current, valid backup prior to running the transition utility.
                    </html:radio>
                </td>
            </tr>
        <% } else { %>
            <html:hidden property="<%=ConvertToResourceManagerForm.FIELD_CONVERT_OPTION %>"/>
            <tr>
                <td class="ColRow tdAlignLeft" nowrap>
                        <b>Run transition in preview mode.</b><br>
                        <base:imageSpacer height="1" width="17"></base:imageSpacer>
                        This process will perform a check to determine whether the system is ready to transition from Destiny Textbook Manager to Destiny Resource Manager. <br>
                        <base:imageSpacer height="1" width="17"></base:imageSpacer>
                        No data will be changed during the check.<br><br>
                        <base:imageSpacer  height="1" width="17">
                        To run the full Transition from Destiny Textbook Manager to Destiny Resource Manager please contact us at 855-858-1963 and we will help you walk through the process. </base:imageSpacer><br> 
                        <base:imageSpacer  height="1" width="17"></base:imageSpacer>
                        Please run the transition in preview mode before you call to ensure you are ready. 
                </td>
            </tr>
        <% } %>
    <% } else { %>
      <html:hidden property="<%=ConvertToResourceManagerForm.FIELD_CONVERT_OPTION %>"/>
        <tr>
        <td class="ColRowBold" align="center">
            Destiny has determined that there are issues with your data.
            <br>
            As such, you only get to run the pre-flight check. 
        </td>
        </tr>
        <tr>
            <td class="ColRowBold" align="center">
                You will need to close all open textbook and resource inventories to transition your textbook data to Resource Manager
            </td>
        </tr>
        <% for(String msg : form.getNonComplianceMessages()) { %>
        <tr>
            <td class="ColRow" align="center">
                <%=msg %> 
            </td>
            </tr>
        <% } %>
    <% } %>
    <tr>
        <td class="tdAlignRight">
            <base:showHideTag id="onSave">
                <base:genericButton onclick="hideElementonSave()" absbottom="true" src="/buttons/large/go.gif" alt='<%= MessageHelper.formatMessage("go") %>' name="<%= ConvertToResourceManagerForm.BUTTON_NAME_RUN_UPDATE %>" />
            </base:showHideTag>
        </td>
    </tr>
    
</base:outlinedTable>
   
</base:form>
