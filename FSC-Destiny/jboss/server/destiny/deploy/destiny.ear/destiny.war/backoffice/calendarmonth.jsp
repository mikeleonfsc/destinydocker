<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LoginFacadeSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.DisplayableCalendarBig" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.CalendarForm"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>
<%@ page import="com.follett.fsc.common.CalendarHelper"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>

<%
    CalendarForm form = (CalendarForm)request.getAttribute(CalendarForm.FORM_NAME);

    DisplayableCalendarBig calendarBean = new DisplayableCalendarBig();

    calendarBean.setDefaultHours(form.getDisplayHours());
    calendarBean.setDefaultDaysClosed(form.getDisplayClosedDays());
    // Get the default year for the cases where the year is not supplied
    String year = form.getYear();

    // Get the default month for the cases where the month is not supplied
    String month = form.getMonth();

    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request.getSession(), request);
    Long siteID = (Long)store.getProperty(LoginFacadeSpecs.SITE_ID);
    boolean districtMode = false;
    
    if( new Long(0).equals(siteID)) {
        districtMode = true;
    }
%>

<%
    GregorianCalendar calendar = CalendarHelper.getCalendar();
    calendar.set(Integer.parseInt(year), Integer.parseInt(month), 1);
    
%>
<% if(districtMode) { %>
    
<table id="<%=DisplayableCalendarBig.TABLE_DISTRICT_OUTER %>" width="100%">
        <tr>
            <td align="center">
                <base:outlinedTable borderColor="#c0c0c0" id="<%=DisplayableCalendarBig.TABLE_DISTRICT_INNER %>" width="90%">
                    <tr>
                        <td class="TableHeading"><%= MessageHelper.formatMessage("calendarmonth_DistrictCalendar") %></td>
                    </tr>
                    <tr>
                        <td align="center" width="50%">
                            <%= calendarBean.create(calendar, siteID, application, request, response, districtMode) %>
                        </td>
                    </tr>
                </base:outlinedTable>
            </td>
        </tr>
    </table>
<% } else {%>
<br>
    <%= calendarBean.create(calendar, siteID, application, request, response, districtMode) %>
<br>
<% } %>
