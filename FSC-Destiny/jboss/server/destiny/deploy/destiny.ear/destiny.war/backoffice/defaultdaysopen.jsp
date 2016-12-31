<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>
<%@ page import="com.follett.fsc.common.CalendarHelper"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.DefaultDaysOpenForm"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>


<base:messageBox strutsErrors="true"/>

<%
    DefaultDaysOpenForm form = (DefaultDaysOpenForm)request.getAttribute(DefaultDaysOpenForm.FORM_NAME);
%>

<base:form action="/backoffice/servlet/handledefaultdaysopenform.do" >

<c:set var="bgcolor" value="#FFFFFF"/>
<c:set var="width" value="100%"/>

<c:if test="<%=form.isDistrictMode()%>">
    <html:hidden property="districtMode"/>
    <c:set var="bgcolor" value="#C0C0C0"/>
    <c:set var="width" value="90%"/>
</c:if>

<logic:equal name="backoffice_servlet_DefaultDaysOpenForm" property="displayConfirmation" value="true" scope="request" >
<br>
        <%                         
            String[] messageText = new String[]{
                MessageHelper.formatMessage("defaultdaysopen_AreYouSure")
            };
        
            String headerText = "<p align=\"Center\">" +
                MessageHelper.formatMessage("defaultdaysopen_TheseChangesWill", form.getTomorrowsDate()) +
                "</p>";
        %>
        <base:confirmBox showWarningIcon="true" filterMessage="false"
            header="<%=headerText%>"
            messageText="<%=messageText%>"
        />
<br>
</logic:equal>
<%
    String[] dayNames = CalendarHelper.getDays(true);
%>

<base:outlinedTable id="defaultDaysTable" borderColor="${bgcolor}" align="center" width="${width}">
    <tr>
        <td class="Instruction">
        <% if (form.isDistrictMode()) { %>
            <%= MessageHelper.formatMessage("defaultdaysopen_SelectTheDistrictDays") %>
        <% } else { %>
            <%= MessageHelper.formatMessage("defaultdaysopen_SelectTheSiteDays") %>
        <% } %>
        </td>
    </tr>
    <tr>
        <td class="ColRow" >
            &nbsp;<html:multibox property="<%=DefaultDaysOpenForm.FIELD_SELECTED_DAYS %>" name="backoffice_servlet_DefaultDaysOpenForm" value="<%=dayNames[0]%>"/><%=dayNames[0]%></td>
    </tr>
    <tr>
        <td class="ColRow" >
            &nbsp;<html:multibox property="<%=DefaultDaysOpenForm.FIELD_SELECTED_DAYS %>" name="backoffice_servlet_DefaultDaysOpenForm" value="<%=dayNames[1]%>"/><%=dayNames[1]%></td>
    </tr>
    <tr>
        <td class="ColRow" >
            &nbsp;<html:multibox property="<%=DefaultDaysOpenForm.FIELD_SELECTED_DAYS %>" name="backoffice_servlet_DefaultDaysOpenForm" value="<%=dayNames[2]%>"/><%=dayNames[2]%></td>
    </tr>
    <tr>
        <td class="ColRow" >
            &nbsp;<html:multibox property="<%=DefaultDaysOpenForm.FIELD_SELECTED_DAYS %>" name="backoffice_servlet_DefaultDaysOpenForm" value="<%=dayNames[3]%>"/><%=dayNames[3]%></td>
    </tr>
    <tr>
        <td class="ColRow" >
            &nbsp;<html:multibox property="<%=DefaultDaysOpenForm.FIELD_SELECTED_DAYS %>" name="backoffice_servlet_DefaultDaysOpenForm" value="<%=dayNames[4]%>"/><%=dayNames[4]%></td>
    </tr>
    <tr>
        <td class="ColRow" >
            &nbsp;<html:multibox property="<%=DefaultDaysOpenForm.FIELD_SELECTED_DAYS %>" name="backoffice_servlet_DefaultDaysOpenForm" value="<%=dayNames[5]%>"/><%=dayNames[5]%></td>
    </tr>
    <tr>
        <td class="ColRow" >
            &nbsp;<html:multibox property="<%=DefaultDaysOpenForm.FIELD_SELECTED_DAYS %>" name="backoffice_servlet_DefaultDaysOpenForm" value="<%=dayNames[6]%>"/><%=dayNames[6]%></td>
    </tr>
    <tr>
        <td class="ColRow">
                <base:saveButton />
                &nbsp;
                <base:cancelButton />
        </td>
    </tr>
</base:outlinedTable>
</base:form>
<br>
