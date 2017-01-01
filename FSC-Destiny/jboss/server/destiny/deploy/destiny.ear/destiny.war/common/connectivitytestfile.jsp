<%@ page language="java" %>
<%@page import="com.follett.fsc.destiny.client.common.servlet.ConnectivityTestForm"%>
<%@ page contentType="application/FSC-Destiny-Connectivity; charset=UTF-8" %>
<% ConnectivityTestForm form = (ConnectivityTestForm) request.getAttribute(ConnectivityTestForm.FORM_NAME); %>
<%= form.getTestFileContent() %>
