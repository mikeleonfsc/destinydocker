<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.DistrictTabHelper"%>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    DistrictNotificationForm form = (DistrictNotificationForm)request.getAttribute(DistrictNotificationForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
%>

<base:messageBox strutsErrors="true"/>

    <logic:equal name="<%=DistrictNotificationForm.FORM_NAME%>" property="<%=GenericDistrictForm.KEY_SHOW_FOLLETT_SHELF_MESSAGE %>" value="true">
        <jsp:include page="/district/fsmessagebox.jsp">
            <jsp:param name="formName" value="districtnotificationform"/>
        </jsp:include>
    </logic:equal>

<base:form action="/district/servlet/handledistrictnotificationform.do" focus="message">
<html:hidden property="<%=GenericDistrictForm.KEY_SHOW_AASP_MESSAGE %>" />
    <logic:equal name="<%=DistrictNotificationForm.FORM_NAME%>" property="<%=GenericDistrictForm.KEY_SHOW_AASP_MESSAGE %>" value="true">
        <jsp:include page="/common/aaspmessagebox.jsp">
            <jsp:param name="formName" value="districtnotificationform"/>
        </jsp:include>
    </logic:equal>
<%
    String msg = GenericForm.getSQLAndAppServerTimeOutOfSyncMsg();
    if (msg != null) {
%>
    <center><span class="ColRowBold"><%= msg %></span></center><BR>
<%  } %>    
<center><span class="ColRowBold"><%= GenericForm.getLastBackupDisplayMsg(false) %></span></center><br>
<jsp:include page="/common/msdewarning.jsp" flush="true" />

<table align="center" width="95%"><tr><td>
<base:outlinedTableAndTabsWithinThere id="<%=DistrictNotificationForm.TABLE_MAIN%>"  selectedTab="<%=DistrictNotificationForm.TAB%>" tabs="<%=DistrictTabHelper.getDisplayableTabs(store)%>" align="center" width="100%">
    <tr>
        <td class="TableHeading2">
            Notify all users of the following...
        </td>
    </tr>
    <tr>
        <td align="center" class="ColRowBold">
            <html:textarea property="<%=DistrictNotificationForm.FIELD_MESSAGE%>" rows="5" cols="55"/>
            <br><br>
            <p>Selecting the Notify Users button will display your message on top of Destiny screens for all sites in your district until Destiny is restarted.</p>
            <p>Select the Clear Notification button to turn off the notification (only necessary if Destiny is not restarted).</p>
        </td>
    </tr>
    <tr>
        <td align="center">
            <html:submit property="<%=DistrictNotificationForm.BUTTON_NAME_NOTIFY%>">Notify Users</html:submit>&nbsp;
            <html:submit property="<%=DistrictNotificationForm.BUTTON_NAME_CLEAR%>">Clear Notification</html:submit>
        </td>
    </tr>
</base:outlinedTableAndTabsWithinThere>
</td></tr></table>

</base:form>
