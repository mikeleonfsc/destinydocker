<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LoginFacadeSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.DisplayableCalendar" %>
<%@ page import="com.follett.fsc.common.CalendarHelper" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.CalendarForm"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="com.follett.fsc.common.MiscHelper"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>


<bean:define id="dayString" name="backoffice_servlet_CalendarForm" property="displayClosedDays" scope="request" type="java.lang.String" />
<bean:define id="form" name="backoffice_servlet_CalendarForm" scope="request" type="com.follett.fsc.destiny.client.backoffice.servlet.CalendarForm" />

<%

    DisplayableCalendar calendarBean = new DisplayableCalendar();

    // Get the default year for the cases where the year is not supplied
    String year = form.getYear();

    //Save off the next and previous years based on the year
    String prevYear = "" + (MiscHelper.stringToInteger(year) - 1);
    String nextYear = "" + (MiscHelper.stringToInteger(year) + 1);

    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request.getSession(), request);
    Long siteID = (Long)store.getProperty(LoginFacadeSpecs.SITE_ID);

    boolean districtMode = false;
    String borderColor = "#FFFFFF";
    
    if(new Long(0).equals(siteID)) {
        districtMode = true;
        borderColor = "#c0c0c0";
    }
    
%>
<base:outlinedTable borderColor="<%= borderColor %>" align="center" id="CalendarYear">
<% if(districtMode) { %>
<tr>
    <td colspan="3" class="TableHeading"><%= MessageHelper.formatMessage("calendaryear_DistrictCalendar") %></td>
</tr>
<% } %>
<tr>
    <td colspan="3" align="center">
        <table id="CalendarYearHeader">
        <tr>
            <td class="ColRow">
                <% if(districtMode) { %>
                    <base:link page='<%= "/backoffice/servlet/districtcalendaryear.do?districtMode=true&year=" + prevYear %>'>&lt;&lt;</base:link>
                <% } else { %>
                    <base:link page='<%= "/backoffice/servlet/calendaryear.do?year=" + prevYear %>'>&lt;&lt;</base:link>
                <% } %>
                &nbsp;</td>
            <td class="MainHeader"><%=year%></td>
            <td class="ColRow">&nbsp;
                <% if(districtMode) { %>
                    <base:link page='<%= "/backoffice/servlet/districtcalendaryear.do?districtMode=true&year=" + nextYear %>'  >&gt;&gt;</base:link>
                <% } else { %>
                    <base:link page='<%= "/backoffice/servlet/calendaryear.do?year=" + nextYear %>'  >&gt;&gt;</base:link>
                <% } %>
                </td>
        </tr>
        </table>
    </td>
</tr>
<tr>
    <td colspan="3">
        <table width="100%" dir="ltr" >
        <tr>
            <td Class="Instruction">
            
            <% String distFlag = "";
               if(districtMode) { 
                 distFlag = "?districtMode=true";               
               }
            %>
            <% if (StringHelper.isEmpty(dayString)) { %>
                <base:link page='<%="/backoffice/servlet/presentdefaultdaysopenform.do" + distFlag%>' title='<%= MessageHelper.formatMessage("calendaryear_EditDefaultClosedDays") %>'></base:link>
            <% } else { %>
                <%= MessageHelper.formatMessage("calendaryear_Closed") %>
                <base:link page='<%= "/backoffice/servlet/presentdefaultdaysopenform.do" + distFlag %>' title='<%= MessageHelper.formatMessage("calendaryear_EditDefaultClosedDays") %>'>
                    <bean:write name="form" property="displayClosedDays" />
                </base:link>
            <% } %>
            </td>
            <td class="Instruction tdAlignRight">
            <% if(!districtMode) { %>
                <%= MessageHelper.formatMessage("calendaryear_Hours") %> <base:link page="/backoffice/servlet/presentdefaulthoursform.do" title='<%= MessageHelper.formatMessage("calendaryear_EditOperationalHours") %>'>
                    <bean:write name="form" property="displayHours" />
                </base:link>
            <% } else { %>
                &nbsp;
            <% } %>
            </td>

        </table>
    </td>
</tr>
<tr>
    <td class="Instruction">
        <% if (CalendarHelper.getCurrentYear().intValue() != Integer.parseInt(year)) { %>
                <% if(districtMode) { %>
                    <base:link page='<%= "/backoffice/servlet/districtcalendaryear.do?districtMode=true&year=" + CalendarHelper.getCurrentYear()%>' title='<%= MessageHelper.formatMessage("calendaryear_CurrentYear") %>'><%= MessageHelper.formatMessage("calendaryear_CurrentYear") %></base:link>
                <% } else { %>
                    <base:link page='<%= "/backoffice/servlet/calendaryear.do?year=" + CalendarHelper.getCurrentYear() %>' title='<%= MessageHelper.formatMessage("calendaryear_CurrentYear") %>'><%= MessageHelper.formatMessage("calendaryear_CurrentYear") %></base:link>
                <% } %>
        <% } else { %>
            &nbsp;
        <% } %>
    </td>
    <td colspan="2" class="Instruction tdAlignRight"><%= MessageHelper.formatMessage("calendaryear_ShadedClosed") %></td>
</tr>
<tr>
<td valign="top">

<%

    GregorianCalendar calendar = CalendarHelper.getCalendar();
    calendar.set(Integer.parseInt(year), 0, 1);

    //Loop through every month of that year (assuming 12 months)
    for (int index = 1; index <= 12; index++) {
        //End the TD and start a new one
%>
        </td>
<%
        //This is for 3 columns
        if ((index % 3) == 1) {
%>
            </tr><tr>
<%        }
%>
        <td valign="top" align="center">

    <%= calendarBean.create(calendar, siteID, application, request, response, false, districtMode) %>
<%
    }
%>
    </td>
</tr>
</base:outlinedTable>
