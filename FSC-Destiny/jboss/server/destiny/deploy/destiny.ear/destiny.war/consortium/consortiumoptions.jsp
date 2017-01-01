<%@page import="com.follett.fsc.destiny.client.consortium.servlet.GenericConsortiumAdminForm"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@page import="com.follett.fsc.destiny.client.consortium.servlet.ConsortiumOptionsForm"%>
<%@page import="com.follett.fsc.destiny.client.consortium.servlet.ConsortiumTreeForm"%>
<base:messageBox strutsErrors="true"/>

<%
    ConsortiumOptionsForm form = (ConsortiumOptionsForm)request.getAttribute(ConsortiumOptionsForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
%>

<base:form action="/consortium/servlet/handleconsortiumoptionsform.do">
<html:hidden property="<%=GenericConsortiumAdminForm.KEY_SHOW_AASP_MESSAGE %>" />
    <logic:equal name="<%=ConsortiumOptionsForm.FORM_NAME%>" property="<%=GenericConsortiumAdminForm.KEY_SHOW_AASP_MESSAGE %>" value="true">
        <jsp:include page="/common/aaspmessagebox.jsp">
            <jsp:param name="formName" value="consortiumoptionsform"/>
            <jsp:param name="fromConsortium" value="true"/>
        </jsp:include>
    </logic:equal>

<base:outlinedTableAndTabsWithinThere id="<%=ConsortiumOptionsForm.TABLE_OPTIONS%>" selectedTab="<%=ConsortiumOptionsForm.TAB%>" tabs="<%=ConsortiumTreeForm.tabs%>" align="center" width="100%">
    <tr>
        <td background="/images/icons/general/thickline.gif" height="18" width="100%" style="background-repeat:repeat-x;" >
            &nbsp;<span class="SectionHeader">SMTP Settings</span>
        </td>
        <td height="18">
            <base:link page="/common/servlet/presenteditsmtpoptionsform.do" id="<%=DistrictOptionsForm.ID_BUTTON_SMTP_OPTIONS %>">
                <base:image src="/buttons/large/edit.gif" alt="<%=DistrictOptionsForm.ALT_BUTTON_SMTP_OPTIONS %>" align="absbottom"/>
            </base:link>
        </td>
    </tr>
    <tr>
        <td class="ColRow">
            <ul><li>Manage the SMTP Settings.</li></ul>
            <br>
        </td>
        <td class="ColRow tdAlignRight">&nbsp;</td>
    </tr>
    <tr>
        <td background="/images/icons/general/thickline.gif" height="18" width="100%" style="background-repeat:repeat-x;" >
            &nbsp;<span class="SectionHeader">Destiny Discover Settings</span>
        </td>
        <td height="18">
            <base:link page="/common/servlet/presenteditaaspoptionsform.do" id="<%=DistrictOptionsForm.ID_BUTTON_AASP_OPTIONS %>">
                <base:image src="/buttons/large/edit.gif" alt="<%=DistrictOptionsForm.ALT_BUTTON_AASP_OPTIONS %>" align="absbottom"/>
            </base:link>
        </td>
    </tr>
    <tr>
        <td class="ColRow">
            <ul><li>Manage Destiny Discover Settings.</li></ul>
            <br>
        </td>
        <td class="ColRow tdAlignRight">&nbsp;</td>
    </tr>
    <% if(store.isServerAdminLoggedIn()) { %>
        <tr>
            <td background="/images/icons/general/thickline.gif" height="18" width="100%" style="background-repeat:repeat-x;" >
                &nbsp;<span class="SectionHeader">Auto Update Settings</span>
            </td>
            <td height="18">
                <base:link page="/common/servlet/presentscheduleautoupdateform.do" id="<%=DistrictOptionsForm.ID_BUTTON_AUTO_UPDATE_OPTIONS %>">
                    <base:image src="/buttons/large/edit.gif" alt="<%=DistrictOptionsForm.ALT_BUTTON_AUTO_UPDATE_OPTIONS %>" align="absbottom"/>
                </base:link>
            </td>
        </tr>
        <tr>
            <td class="ColRow">
                <ul><li>Manage the Auto Update Settings.</li></ul>
                <br>
            </td>
            <td class="ColRow tdAlignRight">&nbsp;</td>
        </tr>
    <% } %>
</base:outlinedTableAndTabsWithinThere>
</base:form>

