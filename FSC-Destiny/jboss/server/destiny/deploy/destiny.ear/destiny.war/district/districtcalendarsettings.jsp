<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>

<%
    DistrictCalendarSettingsForm form = (DistrictCalendarSettingsForm)request.getAttribute("district_servlet_DistrictCalendarSettingsForm");
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
%>
<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<base:messageBox strutsErrors="true"/>

<base:form action="/district/servlet/handledistrictcalendarsettingsform.do" method="post">
<html:hidden property="<%= DistrictCalendarSettingsForm.PARM_MONTH %>"/>
<html:hidden property="<%= DistrictCalendarSettingsForm.PARM_DAY %>"/>
<html:hidden property="<%= DistrictCalendarSettingsForm.PARM_YEAR %>"/>
        <base:outlinedTable borderColor="#c0c0c0" id="<%=DistrictCalendarSettingsForm.DISTRICT_CALENDAR_SETTINGS_TABLE %>" width="100%">
        <tr>
            <td class="TableHeading tdAlignRight">
                <base:saveButton/><br>
                <base:cancelButton/>
            </td>
        </tr>
        <tr>
            <td class="TableHeading" nowrap>
                <%= form.gimmeFormattedDate() %>
            </td>
        </tr>
        <tr>
            <td colspan="6" valign="top">
                <img src="/images/icons/general/line.gif" border="0" width="100%" height="1">
            </td>
        </tr>
        <tr>
            <td class="TableHeading2" nowrap>
                Current Site Settings
            </td>
        </tr>
        <%= form.getDisplayString() %>
        </base:outlinedTable>

</base:form>
