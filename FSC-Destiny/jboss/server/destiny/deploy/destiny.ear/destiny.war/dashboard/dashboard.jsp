<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>


<%@ page import="com.follett.fsc.destiny.client.common.data.*"%>
<%@ page import="com.follett.fsc.destiny.session.common.*"%>
<%@ page import="java.util.*"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page import="com.follett.fsc.destiny.client.dashboard.servlet.DashboardForm"%>
<%@page import="com.follett.fsc.destiny.util.dashboard.DashboardGizmoDefinition"%>



<c:set var="form" value="<%=request.getAttribute(DashboardForm.FORM_NAME)%>"/>
<jsp:useBean id="form" type="com.follett.fsc.destiny.client.dashboard.servlet.DashboardForm"/>


<base:form action="/dashboard/servlet/handledashboardform.do">

<table width="100%" cellspacing="0" cellpadding="0">

 
    <tr>
        <td align="right" colspan="2">
            <base:genericButton src="/buttons/large/configure.gif" name="<%=DashboardForm.BUTTON_CONFIGURE_DASHBOARD %>"/>
        </td>
    </tr>
    <tr><td><base:imageSpacer width="10" height="20"/></td></tr>
    <tr>
        <td>
            <table width="100%" cellspacing="1" cellpadding="1" class="tableWithThinBorder">
                <tr>
                    <c:forEach var="gizmo" items="${form.gizmoList}" varStatus="status">
                       <jsp:useBean id="gizmo" type="com.follett.fsc.destiny.util.dashboard.DashboardGizmoDefinition"/>
                       <td valign="top" style="border: 1px solid #c0c0c0" width="50%">
                          <a name="<%=DashboardForm.GIZMO_ANCHOR%>${gizmo.id}"></a>                       
                          <base:dashboardRenderer graphToRender="${gizmo.id}" siteID="${form.siteID}" forceRefresh="${form.forceRefresh}" />
                       </td>
                       <c:if test="${status.index % 2 == 1}">
                          <c:out value="</tr><tr>" escapeXml="false"/>
                       </c:if>
                    </c:forEach>
                </tr>
            </table>
        </td>
    </tr>
</table>
</base:form>
