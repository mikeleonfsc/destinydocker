<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ page import="com.follett.fsc.destiny.client.consortium.servlet.*" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    ConsortiumNotificationForm form = (ConsortiumNotificationForm)request.getAttribute(ConsortiumNotificationForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true"/>

<base:form action="/consortium/servlet/handleconsortiumnotificationform.do" focus="message">
<html:hidden property="<%=GenericConsortiumAdminForm.KEY_SHOW_AASP_MESSAGE %>" />
    <logic:equal name="<%=ConsortiumNotificationForm.FORM_NAME%>" property="<%=GenericConsortiumAdminForm.KEY_SHOW_AASP_MESSAGE %>" value="true">
        <jsp:include page="/common/aaspmessagebox.jsp">
            <jsp:param name="formName" value="consortiumnotificationform"/>
            <jsp:param name="fromConsortium" value="true"/>
        </jsp:include>
    </logic:equal>

<base:outlinedTableAndTabsWithinThere id="<%=ConsortiumNotificationForm.TABLE_MAIN%>"  selectedTab="<%=ConsortiumNotificationForm.TAB%>" tabs="<%=ConsortiumTreeForm.tabs%>" align="center" width="100%">
    <tr>
        <td class="TableHeading2">
            Notify all users of the following...
        </td>
    </tr>
    <tr>
        <td align="center" class="ColRowBold">
            <html:textarea property="<%=ConsortiumNotificationForm.FIELD_MESSAGE%>" rows="5" cols="55"/>
            <br><br>
            <p>Selecting the Notify Users button will display your message on top of Destiny screens for all participants of your installation until Destiny is restarted.</p>
            <p>Select the Clear Notification button to turn off the notification (only necessary if Destiny is not restarted).</p>
        </td>
    </tr>
    <tr>
        <td align="center">
            <html:submit property="<%=ConsortiumNotificationForm.BUTTON_NAME_NOTIFY%>">Notify Users</html:submit>&nbsp;
            <html:submit property="<%=ConsortiumNotificationForm.BUTTON_NAME_CLEAR%>">Clear Notification</html:submit>
        </td>
    </tr>
</base:outlinedTableAndTabsWithinThere>

</base:form>
