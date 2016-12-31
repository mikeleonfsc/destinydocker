<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@page import="com.follett.fsc.destiny.client.common.data.Tab"%>
<%@page import="com.follett.fsc.destiny.client.circulation.servlet.BasePatronListForm"%>

<%
    UpdatePatronGlobalUpdateForm form = (UpdatePatronGlobalUpdateForm)request.getAttribute(UpdatePatronGlobalUpdateForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    Tab[] tabs = BasePatronListForm.getTabs(store);
%>

<%@page import="com.follett.fsc.destiny.client.backoffice.data.UpdatePatronHelper"%><bean:define id="limitersID" name="<%= UpdatePatronGlobalUpdateForm.FORM_NAME %>" property="limiters"/>

<base:messageBox strutsErrors="true"/>

<br>

<base:form action="/backoffice/servlet/handleupdatepatronglobalupdateform.do">

    <logic:equal name="<%=UpdatePatronGlobalUpdateForm.FORM_NAME%>" property="<%= UpdatePatronGlobalUpdateForm.PARAM_SHOW_CONFIRMATION%>" value="true">
        <base:messageBox showWarningIcon="true" message='<%= MessageHelper.formatMessage("updatepatronglobalupdate_ThisProcessCannotBeReversed") %>'>
            <tr align="center" width="100%">
                <td>&nbsp;</td>
                <td class="ColRowBold"><%= MessageHelper.formatMessage("updatepatronglobalupdate_AreYouSureYouWantToProceed") %></td>
            </tr>
            <tr>
                <td class="ColRowBold" width="100%" align="center" colspan="2">
                    <base:yesNo 
                        buttonYesName="<%=UpdatePatronGlobalUpdateForm.BUTTON_CONFIRM_UPDATE%>"
                        buttonNoName="<%=UpdatePatronGlobalUpdateForm.BUTTON_CANCEL_UPDATE%>"
                    />
                </td>
            </tr>
        </base:messageBox>
    </logic:equal>

    <html:hidden property="<%= UpdatePatronGlobalUpdateForm.FIELD_SUBMIT_TYPE %>"/>
    <html:hidden property="<%= UpdatePatronGlobalUpdateForm.FIELD_ACCESS_LEVEL_MODIFIED %>"/>

    <base:outlinedTableAndTabsWithinThere id="tableUpdatePatron" tabs="<%= tabs %>" 
        selectedTabID="<%=IUpdatePatronForm.ID_TAB_TOP_UPDATE%>" selectedTab='<%=MessageHelper.formatMessage("updatepatronglobalupdate_Update")%>'
        borderColor="#C0C0C0" width="100%">
        <tr>
            <td class="TableHeading" colspan="2"><%= MessageHelper.formatMessage("updatepatronglobalupdate_UpdatePatrons") %></td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("updatepatronglobalupdate_BasedOn") %></td>
            <td class="ColRow"><%=UpdatePatronHelper.getUpdateDropDown(UpdatePatronGlobalUpdateForm.FORM_NAME, IUpdatePatronForm.ID_DROP_DOWN_GLOBAL_CRITERIA) %></td>
        </tr>
        <tr>
            <td class="ColRow" colspan="2"><base:imageLine width="98%" vspace="2"/></td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("updatepatronglobalupdate_ForEveryPatron") %></td>
            <td valign="top" valign="middle">
                <table border="0" cellpadding="3" cellspacing="0" id="<%=IUpdatePatronForm.TABLE_SUBMAIN%>">
                    <tr>
                        <td class="ColRow"><%= MessageHelper.formatMessage("updatepatronglobalupdate_Whose") %></td>
                        <td class="ColRow">
                            <html:select onchange="limiterTypeModified()" property="<%= UpdatePatronGlobalUpdateForm.FIELD_LIMITER_TYPE %>">
                                <html:options collection="limitersID" property="longID" labelProperty="stringDesc"/>
                            </html:select>
                        </td>
                        <td class="ColRow"><%= MessageHelper.formatMessage("updatepatronglobalupdate_Is") %></td>
                        <td class="ColRow"><%= form.buildLimiterTypeHTML() %></td>
                        <% if (form.showLimiterAssetGroup()) { %>
                            <td class="ColRow"><%= MessageHelper.formatMessage("updatepatronglobalupdate_AndAssetGroupIs") %></td>
                            <td class="ColRow"><%= form.buildLimiterAssetGroupList() %></td>
                        <% } %>
                    </tr>
                    <tr>
                        <td class="ColRow"><%= MessageHelper.formatMessage("updatepatronglobalupdate_Change") %></td>
                        <td class="ColRow">
                            <html:select onchange="modifierTypeModified()" property="<%= UpdatePatronGlobalUpdateForm.FIELD_MODIFIER_TYPE %>">
                                <html:options collection="limitersID" property="longID" labelProperty="stringDesc"/>
                            </html:select>
                        </td>
                        <td class="ColRow"><%= MessageHelper.formatMessage("updatepatronglobalupdate_To") %></td>
                        <td class="ColRow"><%= form.buildModifierTypeHTML() %></td>
                        <% if (form.showModifierAssetGroup()) { %>
                            <td class="ColRow"><%= MessageHelper.formatMessage("updatepatronglobalupdate_AndAssetGroupTo") %></td>
                            <td class="ColRow"><%= form.buildModifierAssetGroupList() %></td>
                        <% } %>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td class="ColRow" colspan="2"><base:imageLine width="98%" vspace="2"/></td>
        </tr>
        <tr valign="top">
            <td valign="top" colspan="2">
                <span class="ColRowBold"><%= GenericForm.getLastBackupDisplayMsg(true) %></span>
            </td>
        </tr>
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:genericButton name="<%=IUpdatePatronForm.BUTTON_UPDATE_PATRONS%>" alt='<%=MessageHelper.formatMessage("update")%>' src="/buttons/large/updatepatrons.gif"/>
            </td>
        </tr>
    </base:outlinedTableAndTabsWithinThere>
</base:form>

<script language="javascript">
<!--
function limiterTypeModified() {
    document.<%=UpdatePatronGlobalUpdateForm.FORM_NAME%>.<%=UpdatePatronGlobalUpdateForm.FIELD_SUBMIT_TYPE%>.value = "<%=UpdatePatronGlobalUpdateForm.SUBMIT_TYPE_LIMITER%>";
    document.<%=UpdatePatronGlobalUpdateForm.FORM_NAME%>.submit();
}
function modifierTypeModified() {
    document.<%=UpdatePatronGlobalUpdateForm.FORM_NAME%>.<%=UpdatePatronGlobalUpdateForm.FIELD_SUBMIT_TYPE%>.value = "<%=UpdatePatronGlobalUpdateForm.SUBMIT_TYPE_MODIFIER%>";
    document.<%=UpdatePatronGlobalUpdateForm.FORM_NAME%>.submit();
}
function limiterRoleModified() {
    document.<%=UpdatePatronGlobalUpdateForm.FORM_NAME%>.<%=UpdatePatronGlobalUpdateForm.FIELD_ACCESS_LEVEL_MODIFIED%>.value = "<%=UpdatePatronGlobalUpdateForm.LIMITER_ACCESS_LEVEL_MODIFIED%>";
    document.<%=UpdatePatronGlobalUpdateForm.FORM_NAME%>.submit();
}
function modifierRoleModified() {
    document.<%=UpdatePatronGlobalUpdateForm.FORM_NAME%>.<%=UpdatePatronGlobalUpdateForm.FIELD_ACCESS_LEVEL_MODIFIED%>.value = "<%=UpdatePatronGlobalUpdateForm.MODIFIER_ACCESS_LEVEL_MODIFIED%>";
    document.<%=UpdatePatronGlobalUpdateForm.FORM_NAME%>.submit();
}
// -->
</script>
