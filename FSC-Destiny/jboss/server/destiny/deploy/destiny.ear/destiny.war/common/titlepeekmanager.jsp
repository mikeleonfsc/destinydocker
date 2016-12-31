<%@ page language="java" %>
<%@ page import="com.follett.fsc.destiny.client.common.HTTPHelper" %>
<%@ page import="com.follett.fsc.destiny.util.data.RemoteLatch" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@page import="com.follett.fsc.destiny.client.common.servlet.TitlePeekManagerForm"%>

<%
    TitlePeekManagerForm form = (TitlePeekManagerForm) request.getAttribute(TitlePeekManagerForm.FORM_NAME);
%>
<html>
<head>
<title><%= MessageHelper.formatMessage("titlepeekmanager_TitlepeekManagerStats") %></title>
</head>
<body>
<base:form action="/common/servlet/handletitlepeekmanagerform.do">
<h1><%= MessageHelper.formatMessage("titlepeekmanager_TitlepeekManagerStats") %></h1>
<%=form.getTPMStats() %>
</base:form>
</body>
</html>
