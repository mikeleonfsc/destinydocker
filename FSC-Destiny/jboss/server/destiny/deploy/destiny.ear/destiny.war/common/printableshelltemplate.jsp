<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri='/WEB-INF/struts-tiles.tld' prefix='template' %>
<%@ page import="com.follett.fsc.destiny.util.DestinyColors"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@ page import="com.follett.fsc.destiny.client.filters.VersionFilter"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    String directionality = lh.getWebPageDirectionality();
%>

<html dir="<%=directionality%>" >
<!-- <template:get name='debuginfo'/> -->
<head>
<title><template:get name='pagetitle'/></title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />

<% SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
	String refreshContent = (String) request.getAttribute(DestinyRequestProcessor.REFRESH_CONTENT);
    if (refreshContent != null) {%>
      <META HTTP-EQUIV="Refresh" CONTENT="<%= refreshContent %>">
<% } %>

<link rel="stylesheet" type="text/css" href="<%=VersionFilter.getDestinyCSSVersionedFile() %>" />

</head>

<body class="<%=store.getStyleClass() %>" >

<table border="0" cellpadding="3" cellspacing="0" width="100%">
<%
    if (request.getAttribute("showBreadCrumbs") != null) {
%>
    <tr>
        <td colSpan="2" bgColor="<%=DestinyColors.BREADCRUMB_BACKGROUND%>">
            <jsp:include page="/common/breadcrumbs.jsp" flush="true" />
        </td>
    </tr>
<%
    }
%>

<!-- show the page content -->
<tr><td>
<template:get name='pagecontent'/>
</td></tr>

<!-- show copyright bar at bottom of page -->
    <template:get name='footer'/>

</table>
</body>
</html>
