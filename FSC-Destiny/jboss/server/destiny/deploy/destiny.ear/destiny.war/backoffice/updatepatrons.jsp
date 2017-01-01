<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@page import="com.follett.fsc.destiny.client.common.data.Tab"%>
<%@page import="com.follett.fsc.destiny.client.circulation.servlet.BasePatronListForm"%>

<%
    UpdatePatronsForm form = (UpdatePatronsForm)request.getAttribute(UpdatePatronsForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true"/>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    Tab[] tabs = BasePatronListForm.getTabs(store);
%>

<br>

<base:form action="/backoffice/servlet/handleupdatepatronsform.do" enctype="multipart/form-data">

    <html:hidden property="localRelativeFile"/>
    <html:hidden property="localFileNameOnly"/>
    <%-- Are we confirming an update? --%>
    <logic:equal name="backoffice_servlet_UpdatePatronsForm" property="confirmUpdate" value="true">
        <html:hidden property="<%= UpdatePatronsForm.FIELD_DELETE_TRANSACTIONS %>"/>
        <base:imageSpacer height="3" width="1"/>
        <base:messageBox showWarningIcon="true" message='<%= MessageHelper.formatMessage("updatepatrons_TheUpdatePatronsProcessNotReversible") %>'>
            <tr>
                <td align="center" class="ColRow" colspan="2"><%= MessageHelper.formatMessage("updatepatrons_DoYouHaveACurrentBackupOfYourDatabase") %></td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2">
                    <base:yesButton/>
                    <base:noButton name="<%=UpdatePatronsForm.BUTTON_CONFIRM_NO%>"/>
                </td>
            </tr>
        </base:messageBox>
    </logic:equal>

    <logic:notEqual name="backoffice_servlet_UpdatePatronsForm" property="confirmUpdate" value="true">
        <base:outlinedTableAndTabsWithinThere id="tableUpdatePatron" tabs="<%= tabs %>" selectedTabID="<%= IUpdatePatronForm.ID_TAB_UPLOAD_CHANGES %>" selectedTab='<%=MessageHelper.formatMessage("updatepatrons_UploadChanges")%>' hideTabsWhenPrinterFriendly="true" borderColor="#C0C0C0" width="100%">
		            <tr valign="top">
		                <td valign="top" colspan="2">
		                    <span class="ColRow"><%= MessageHelper.formatMessage("updatepatrons_UpdatePatronsLetsYouAddNewPatronsAndHelpsYouKeep") %><br>
		                    </span>
		                    <span class="ColRowBold"><%= MessageHelper.formatMessage("updatepatrons_PleaseNote") %></span>
		                    <span class="ColRow">
		                    <ul>
		                    <li><%= MessageHelper.formatMessage("updatepatrons_YourUpdateFileShouldIncludeOnlyTheFieldsNeededFor") %></li>
		                    <li><%= MessageHelper.formatMessage("updatepatrons_IfTheRequiredFieldsOfPatronTypeAndAccessLevelAreBlankExistingDataWillBeRetainedOtherBlankFieldsWillClearExistingPatronInformation") %></li>
		                    <li><%= MessageHelper.formatMessage("updatepatrons_ChangesAreNotReversible") %></li>
		                    </ul>
		                    </span>
		                    <span class="ColRowBold"><%= GenericForm.getLastBackupDisplayMsg(true) %></span>
		                </td>
		            </tr>

		            <tr>
		                <td class="tdAlignRight" valign="top">
		                    <html:checkbox property="<%= UpdatePatronsForm.FIELD_DELETE_TRANSACTIONS %>"></html:checkbox>

		                </td>
		                <td class="ColRow" valign="top"><%= MessageHelper.formatMessage("updatepatrons_AllowPatronsToBeDeletedEvenIfTheyHaveOutstanding") %><base:helpTag helpFileName="t_allow_patrons_to_be_deleted.htm"/>
		                </td>
		            </tr>

		            <tr>
		                <td valign="top" class="ColRowBold tdAlignRight" nowrap>&nbsp;&nbsp;<%= MessageHelper.formatMessage("updatepatrons_UpdateFile") %></td>
		                <td>
		                    <html:file property="<%= UpdatePatronsForm.FIELD_UPLOAD_FILE %>"/>
		                </td>
		            </tr>


		            <tr>
		                <td valign="baseline" align="center" class="ColRowBold" colspan="2">
		                    <base:genericShowHideButton src="/buttons/large/updatepatrons.gif" name="<%= UpdatePatronsForm.BUTTON_UPDATE_PATRONS %>" alt='<%= MessageHelper.formatMessage("update") %>' elementID="updatePatrons"/>
		                </td>
		            </tr>
        </base:outlinedTableAndTabsWithinThere>
    </logic:notEqual>

</base:form>



