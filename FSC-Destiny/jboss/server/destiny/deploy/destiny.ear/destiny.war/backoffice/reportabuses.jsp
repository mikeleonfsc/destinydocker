<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ page import="com.follett.fsc.destiny.session.common.HTMLHelper" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="java.text.DateFormat" %>
<%@page import="com.follett.fsc.destiny.util.HTMLFilterHelper"%>
<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="org.apache.struts.util.ResponseUtils"%>
<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.ReportAbusesForm"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>

<%
    ReportAbusesForm form = (ReportAbusesForm)request.getAttribute(ReportAbusesForm.FORM_NAME);
%>

<c:set var="reportedAbuses" value="<%= form.getReportedAbuses() %>" />

<base:form action="/backoffice/servlet/handlereportabusesform.do">
<logic:equal name="<%=ReportAbusesForm.FORM_NAME %>" property="<%=ReportAbusesForm.PARAM_PRINTER_FRIENDLY %>" value="false">
<c:if test="<%=form.getReportedAbuseToDeleteReporter() != null%>">
    <html:hidden property="<%=ReportAbusesForm.PARAM_ABUSE_ID_TO_DELETE%>"/>
    <base:imageSpacer width="1" height="3"/>
    <base:messageBox showWarningIcon="true" message='<%= MessageHelper.formatMessage("reportabuses_RemoveAbuseReportWarningMessage0", form.getReportedAbuseToDeleteReporter())%>'>
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:yesNo/>
            </td>
        </tr>
    </base:messageBox>
</c:if>
</logic:equal>
<br/>
<br/>
<base:outlinedTable id="<%= ReportAbusesForm.TABLE_REPORTED_ABUSES %>" cellpadding="2" cellspacing="0" width="100%" borderColor="#C0C0C0">
    <tr>
        <td class="TableHeading">
            <%= MessageHelper.formatMessage("reportabuses_ReportedAbuses")%>
        </td>
        <td class="tdAlignRight">
            <logic:equal name="<%=ReportAbusesForm.FORM_NAME %>" property="<%=ReportAbusesForm.PARAM_PRINTER_FRIENDLY %>" value="false">
                <base:link page='<%="/backoffice/servlet/presentreportabusesform.do?" + ReportAbusesForm.PARAM_PRINTER_FRIENDLY + "=true"%>' target="printerFriendly"><base:image align="absbottom" src="/buttons/large/printit.gif" alt="<%=GenericForm.getPrintItAltText()%>"/></base:link>
            </logic:equal>
        </td>
    </tr>
    <c:choose>
        <c:when test="${empty reportedAbuses}">
            <tr>
                <td class="ColRowBold" align="center" colspan="2"><%= MessageHelper.formatMessage("reportabuses_NoAbusesMessage")%></td>
            </tr>
        </c:when> 
        <c:otherwise>
            <%int i = 0; %>
            <c:forEach items="${reportedAbuses}" var="reportedAbuse">
                <jsp:useBean id="reportedAbuse" type="com.follett.fsc.destiny.session.backoffice.data.ReportAbuseClientVO"/>
                <logic:equal name="<%=ReportAbusesForm.FORM_NAME %>" property="<%=ReportAbusesForm.PARAM_PRINTER_FRIENDLY %>" value="false">
                    <tr>
                        <td width="100%" colspan="2">
                            <base:imageLine/>
                        </td>
                    </tr>
                </logic:equal>        
                <tr>
                    <td class="ColRowBold">
                    <a name="<%= ReportAbusesForm.ANCHOR_REPORT_ABUSE + reportedAbuse.getAbuseID() %>"></a>
                        <logic:equal name="<%=ReportAbusesForm.FORM_NAME %>" property="<%=ReportAbusesForm.PARAM_PRINTER_FRIENDLY %>" value="false">
                            <% if (reportedAbuse.getBibID() == null){ %>
                                &nbsp;
                            <%} else { %>
                                <%= form.getTitleDetailLink(reportedAbuse.getBibTitle(), reportedAbuse.getBibID()) %>
                            <%} %>
                        </logic:equal>                        
                        <logic:equal name="<%=ReportAbusesForm.FORM_NAME %>" property="<%=ReportAbusesForm.PARAM_PRINTER_FRIENDLY %>" value="true">
                            <% if (reportedAbuse.getBibID() == null){ %>
                                &nbsp;
                            <% } else { %>
                                <%= HTMLFilterHelper.filter(reportedAbuse.getBibTitle())%>
                            <% } %>
                        </logic:equal>                        
                    </td>
                    <td class="tdAlignRight" valign="top">
                        <logic:equal name="<%=ReportAbusesForm.FORM_NAME %>" property="<%=ReportAbusesForm.PARAM_PRINTER_FRIENDLY %>" value="false">
                            <base:link href="<%=form.getDeleteReportedAbuseLink(reportedAbuse) %>" id='<%= ReportAbusesForm.PARAM_ABUSE_ID_TO_DELETE + "_" + reportedAbuse.getAbuseID() %>'>
                                <base:image src="/buttons/small/closereport.gif" alt='<%= MessageHelper.formatMessage("reportabuses_RemoveAbuseReport")%>'/>
                            </base:link>                            
                        </logic:equal>
                    </td>
                </tr>
                <tr bgColor="#E8E8E8">
                    <td colspan="2">
                       <%=form.getReportedAbuseInfo(reportedAbuse, i++) %>
                    </td>
                </tr>
            </c:forEach>
        </c:otherwise>
    </c:choose>
    
</base:outlinedTable>
</base:form>
