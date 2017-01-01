<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.BasePatronJobParams" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@page import="com.follett.fsc.destiny.client.common.data.Tab"%>
<%@page import="com.follett.fsc.destiny.client.circulation.servlet.BasePatronListForm"%>


<%@page import="com.follett.fsc.destiny.client.backoffice.data.UpdatePatronHelper"%>
<bean:define id="allPatronTypesID" name="<%= UpdatePatronGlobalDeleteForm.FORM_NAME %>" property="allPatronTypes"/>
<bean:define id="limitersID" name="<%= UpdatePatronGlobalDeleteForm.FORM_NAME %>" property="limiters"/>
<%
    UpdatePatronGlobalDeleteForm form = (UpdatePatronGlobalDeleteForm)request.getAttribute(UpdatePatronGlobalDeleteForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    Tab[] tabs = BasePatronListForm.getTabs(store);
%>

<base:messageBox strutsErrors="true"/>
<base:form action="/backoffice/servlet/handleupdatepatronglobaldeleteform.do">
    <logic:equal name="<%=UpdatePatronGlobalDeleteForm.FORM_NAME%>" property="<%= UpdatePatronGlobalDeleteForm.PARAM_SHOW_CONFIRMATION%>" value="true">
        <base:messageBox showWarningIcon="true" message='<%= MessageHelper.formatMessage("updatepatronglobaldelete_ThisProcessCannotBeReversed") %>'>
        <tr align="center" width="100%">
            <td>&nbsp;</td>
            <td class="ColRowBold"><%=UpdatePatronHelper.getDeleteConfirmation(form.getDeleteMode())%></td>
        </tr>
        <tr>
            <td class="ColRowBold" width="100%" align="center" colspan="2">
                <base:yesNo 
                    buttonYesName="<%=UpdatePatronGlobalDeleteForm.BUTTON_CONFIRM_UPDATE%>"
                    buttonNoName="<%=UpdatePatronGlobalDeleteForm.BUTTON_CANCEL_UPDATE%>"
                />
            </td>
        </tr>
        </base:messageBox>
    </logic:equal>

    <html:hidden property="<%= UpdatePatronGlobalDeleteForm.FIELD_SUBMIT_TYPE %>"/>
    <base:outlinedTableAndTabsWithinThere id="tableUpdatePatron1" tabs="<%= tabs %>" selectedTabID="<%= IUpdatePatronForm.ID_TAB_TOP_DELETE %>" selectedTab='<%=MessageHelper.formatMessage("updatepatronglobaldelete_TabDelete")%>' hideTabsWhenPrinterFriendly="true" borderColor="#C0C0C0" width="100%">
    <tr><td>
       <table id="<%=IUpdatePatronForm.TABLE_MAIN %>" width="100%">
    <tr>
        <td class="TableHeading" colspan="2"><%=MessageHelper.formatMessage("updatepatronglobaldelete_DeletePatronInformation") %></td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight" width="30%"><%= MessageHelper.formatMessage("updatepatronglobaldelete_Delete") %></td>
        <td><%=UpdatePatronHelper.getDeleteModeDropDown(UpdatePatronGlobalDeleteForm.FORM_NAME, false, form.getDeleteMode(), form.getStore())%></td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight" width="30%"><%= MessageHelper.formatMessage("updatepatronglobaldelete_BasedOn") %>&nbsp;</td>
        <td class="ColRow"><%=UpdatePatronHelper.getDeleteDropDown(UpdatePatronGlobalDeleteForm.FORM_NAME, IUpdatePatronForm.ID_DROP_DOWN_GLOBAL_CRITERIA) %></td>
    </tr>
    <logic:equal name="<%=UpdatePatronGlobalDeleteForm.FORM_NAME%>" 
        property="<%= IUpdatePatronForm.FIELD_DELETE_MODE%>" 
        value="<%=String.valueOf(BasePatronJobParams.OPTION_DELETE_MODE_PATRONS) %>">
    <tr>
        <td class="TableHeading" colspan="2"><base:imageLine width="98%" vspace="2" /></td>
    </tr>
    <tr>
        <td class="tdAlignRight" valign="top" width="30%">
            <html:checkbox property="<%=UpdatePatronGlobalDeleteForm.FIELD_DELETE_TRANSACTIONS%>"/>
        </td>
        <td valign="top" class="ColRow"><%= MessageHelper.formatMessage("updatepatronglobaldelete_AllowPatronsToBeDeletedEvenIfTheyHaveOutstanding") %></td>
    </tr>
    </logic:equal>
    <tr>
        <td class="TableHeading" colspan="2"><base:imageLine width="98%" vspace="2" /></td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight" valign="middle" width="30%"><%= MessageHelper.formatMessage("updatepatronglobaldelete_ForEveryPatron") %></td>
        <td valign="top">
            <table border="0" cellpadding="3" cellspacing="0" id="<%=IUpdatePatronForm.TABLE_SUBMAIN%>">
            <tr>
                <td class="ColRow"><%= MessageHelper.formatMessage("updatepatronglobaldelete_Whose") %></td>
                <td class="ColRow">
                    <html:select onchange="limiterTypeModified()" property="<%= UpdatePatronGlobalDeleteForm.FIELD_LIMITER_TYPE %>">
                        <html:options collection="limitersID" property="longID"
                                      labelProperty="stringDesc"/>
                    </html:select>
                    <%=MessageHelper.formatMessage("updatepatronglobaldelete_Is") %>
                    <%= form.buildLimiterTypeHTML() %>
                </td>
            </tr>
            <%
              if (form.getLimiterType() == BasePatronJobParams.OPTION_GRAD_YEAR ||
                  form.getLimiterType() == BasePatronJobParams.OPTION_GRADE_LEVEL ||
                  form.getLimiterType() == BasePatronJobParams.OPTION_HOMEROOM ||
                  form.getLimiterType() == BasePatronJobParams.OPTION_EXPIRATION_DATE) {
            %>
                <tr>
                    <td colspan="2" class="ColRow"><%= MessageHelper.formatMessage("updatepatronglobaldelete_AndPatronTypeIs") %>&nbsp;<html:select property="<%= UpdatePatronGlobalDeleteForm.FIELD_PATRON_TYPE_ID %>">
                            <html:options collection="allPatronTypesID" property="longID"
                                          labelProperty="stringDesc"/>
                        </html:select>
                    </td>
                </tr>
            <%
                }
            %>
            </table>
        </td>
    </tr>
    <tr>
        <td class="TableHeading" colspan="2"><base:imageLine width="98%" vspace="2" /></td>
    </tr>
    <tr valign="top" align="center">
        <td valign="top" colspan="2">
            <span class="ColRowBold"><%= GenericForm.getLastBackupDisplayMsg(true) %></span>
        </td>
    </tr>
    <tr>
        <td valign="baseline" align="center" class="ColRow" colspan="2">
            <base:showHideTag id="Preview">
                <logic:equal name="<%=UpdatePatronGlobalDeleteForm.FORM_NAME%>" property="<%= IUpdatePatronForm.FIELD_DELETE_MODE%>" value="<%=String.valueOf(BasePatronJobParams.OPTION_DELETE_MODE_PATRONS) %>">
                    <base:genericButton onclick="hideElementPreview()" src="/buttons/large/preview2.gif" name="<%=IUpdatePatronForm.BUTTON_PREVIEW_DELETE_PATRONS%>" alt='<%=MessageHelper.formatMessage("preview")%>'/>
    			</logic:equal>
                <base:genericButton src="/buttons/large/deleteall.gif" name="<%=IUpdatePatronForm.BUTTON_DELETE_PATRONS%>" alt='<%=MessageHelper.formatMessage("delete")%>'/>
            </base:showHideTag>
        </td>
    </tr>
    </table>
    </td>
    </tr>
    </base:outlinedTableAndTabsWithinThere>
</base:form>

<script language="javascript">
<!--
function limiterTypeModified() {
        document.<%=UpdatePatronGlobalDeleteForm.FORM_NAME%>.<%=UpdatePatronGlobalDeleteForm.FIELD_SUBMIT_TYPE%>.value = "<%=UpdatePatronGlobalDeleteForm.SUBMIT_TYPE_LIMITER%>";
        document.<%=UpdatePatronGlobalDeleteForm.FORM_NAME%>.submit();
}
function deleteModeModified() {
        document.<%=UpdatePatronGlobalDeleteForm.FORM_NAME%>.<%=IUpdatePatronForm.FIELD_CHANGED_DELETE_MODE%>.value = "true";
        document.<%=UpdatePatronGlobalDeleteForm.FORM_NAME%>.submit();
}
// -->
</script>
