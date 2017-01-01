<%@ page language="java" %>
<%@ page contentType="text/javascript; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@page import="java.util.Map"%>
<%@page import="com.follett.fsc.destiny.client.quest.servlet.util.DiscoveryAgent"%>
<%@page import="com.follett.fsc.destiny.client.filters.CacheFilter"%>
<%
    Map<String,String> constants = DiscoveryAgent.getConstants();
%>
<c:forEach items="<%= constants %>" var="constant">var ${constant.key} = "${constant.value}";</c:forEach>