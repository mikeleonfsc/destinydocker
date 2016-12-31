<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.EmailListForm" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<% EmailListForm form = (EmailListForm)request.getAttribute(EmailListForm.FORM_NAME); %>



<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<base:messageBox strutsErrors="true"/>

<br/>

<base:form action="/cataloging/servlet/handleemaillistform.do">

<html:hidden property="<%=EmailListForm.FIELD_LISTID%>"/>
<html:hidden property="<%=EmailListForm.FIELD_COLLECTION_TYPE%>"/>
<html:hidden property="<%=EmailListForm.FIELD_LIST_NAME%>"/>
<html:hidden property="<%=EmailListForm.PARAM_ORIG_DISPLAY_NAME%>"/>
<html:hidden property="<%=EmailListForm.PARAM_SITE_NAME%>"/>
<html:hidden property="<%=EmailListForm.PARAM_DIGITAL_CONTENT_MODE%>"/>

<base:outlinedTable id="<%=EmailListForm.TABLE_OUTLINE%>" borderColor="#C0C0C0">
    <tr>
        <td>
            <table id="<%=EmailListForm.TABLE_MAIN%>">
                <tr>
                    <td colspan="2" class="TableHeading"><%= MessageHelper.formatMessage("emaillist_RecipientInformation") %></td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("emaillist_DisplayName") %></td>
                    <td>
                        <html:text maxlength="80" property="<%=EmailListForm.FIELD_NAME%>"/>
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("emaillist_Email") %></td>
                    <td>
                        <html:text property="<%=EmailListForm.FIELD_EMAIL%>"/>
                        &nbsp;<base:helpTag helpFileName="d_email_list_resource.htm"/>
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("emaillist_Subject") %></td>
                    <td>
                        <html:text property="<%=EmailListForm.FIELD_SUBJECT%>" maxlength="30"/>
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight" valign="top"><%= MessageHelper.formatMessage("emaillist_Message") %></td>
                    <td>
                        <html:textarea property="<%=EmailListForm.FIELD_MESSAGE%>" rows="4" cols="50"><%= MessageHelper.formatMessage("emaillist_Test") %></html:textarea>
                    </td>
                </tr>
                <tr>
                    <td colspan="3" class="Instruction"><%= MessageHelper.formatMessage("emaillist_RequiredField") %></td>
                </tr>
            </table>
        </td>
        <td valign="top" class="tdAlignRight">
            <base:showHideTag id="HideIt">
                <base:genericButton absbottom="true" src="/buttons/large/send.gif"
                    alt='<%=MessageHelper.formatMessage("send")%>'
                    name="<%=EmailListForm.BUTTON_SEND%>" onclick="hideElementHideIt()"/>
                <p><base:cancelButton absbottom="true"/>
            </base:showHideTag>            
        </td>
    </tr>
</base:outlinedTable>
</base:form>

