<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<% ManageSubjectsForm form = (ManageSubjectsForm)request.getAttribute(ManageSubjectsForm.FORM_NAME); %>




<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handlemanagesubjectsform.do">

    <logic:equal name="<%=ManageSubjectsForm.FORM_NAME%>" property="deleteConfirmation" value="true">
           <%     
            String[] messageText = new String[]{MessageHelper.formatMessage("managesubjects_PleaseVerifyThatYouHaveACurrentBackup") ,MessageHelper.formatMessage("managesubjects_AreYouSureYouWantToContinue")};
            %>
                    <base:confirmBox showWarningIcon="true" filterMessage="false"
                    header='<%= MessageHelper.formatMessage("managesubjects_AllSelectedSubjectHeadingsWillBeDeleted") %>'           
                    messageText="<%=messageText%>"
                    yesName="<%=ManageSubjectsForm.BUTTON_DELETE_CONFIRMATION%>"
                    noName="<%=ManageSubjectsForm.BUTTON_DELETE_CANCEL%>"
                  />
        
    </logic:equal>
    <base:outlinedTable borderColor="#c0c0c0">
        <tr>
            <td class="ColRowBold"><%= MessageHelper.formatMessage("managesubjects_DiscardTheFollowingSubjectHeadings") %></td>
        </tr>
        <tr>
            <td class="ColRow">
                <html:checkbox property="<%=ManageSubjectsForm.CHECKBOX_SEARS%>"><%= MessageHelper.formatMessage("managesubjects_SearsSubjectHeadings") %></html:checkbox>
            </td>
        </tr>
        <tr>
            <td class="ColRow">
                <html:checkbox property="<%=ManageSubjectsForm.CHECKBOX_LC%>"><%= MessageHelper.formatMessage("managesubjects_LibraryOfCongressSubjectHeadings") %></html:checkbox>
            </td>
        </tr>
        <tr>
            <td class="ColRow">
                <html:checkbox property="<%=ManageSubjectsForm.CHECKBOX_LC_CHILDREN%>"><%= MessageHelper.formatMessage("managesubjects_LCSubjectHeadingsForChildrensLiteratureLCAC") %></html:checkbox>
            </td>
        </tr>
        <tr>
            <td class="ColRow">
                <html:checkbox property="<%=ManageSubjectsForm.CHECKBOX_CANADIAN%>"><%= MessageHelper.formatMessage("managesubjects_CanadianSubjectHeadings") %></html:checkbox>
            </td>
        </tr>
        <tr>
            <td class="ColRow">
                <html:checkbox property="<%=ManageSubjectsForm.CHECKBOX_LOCAL%>"><%= MessageHelper.formatMessage("managesubjects_LocalSubjectHeadings") %></html:checkbox>
            </td>
        </tr>
        <tr>
            <td class="ColRow">
                <html:checkbox property="<%=ManageSubjectsForm.CHECKBOX_OTHER%>"><%= MessageHelper.formatMessage("managesubjects_OtherSources") %></html:checkbox>
            </td>
        </tr>
        <tr>
            <td><base:imageLine height="1" width="100%" /></td>
        </tr>
        <tr>
            <td class="ColRow">
                <html:checkbox property="<%=ManageSubjectsForm.CHECKBOX_GLOBAL_DELETE %>"><%= MessageHelper.formatMessage("managesubjects_WhenSaveIsClickedRemoveAllSubjectHeadingsFromThe") %></html:checkbox>
            </td>
        </tr>
        <tr>
            <td align="center">
                <base:saveButton name="<%=ManageSubjectsForm.BUTTON_NAME_SAVE %>" />
            </td>
        </tr>

    </base:outlinedTable>
</base:form>
