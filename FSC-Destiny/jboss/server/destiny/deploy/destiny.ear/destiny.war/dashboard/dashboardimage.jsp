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
<%@page import="com.follett.fsc.destiny.client.dashboard.servlet.DashboardImageForm"%>

<%
   DashboardImageForm form = (DashboardImageForm) request.getAttribute(DashboardImageForm.FORM_NAME);
%>



<base:form action="/dashboard/servlet/handledashboardimageform.do">
    <base:dashboardRenderer graphToRender="<%=form.getGizmoID() %>" siteID="<%=form.getSiteID() %>" zoomFactor="<%=form.getZoomFactor() %>" hideShowRefresh="true" fromZoom="true" />                       
</base:form>
