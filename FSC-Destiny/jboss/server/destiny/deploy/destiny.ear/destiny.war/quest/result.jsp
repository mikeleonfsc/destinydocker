<%@page import="com.follett.fsc.destiny.client.quest.servlet.QuestBootstrapForm"%><%@ page language="java" %>
<%@page import="com.follett.fsc.destiny.client.quest.servlet.QuestDAO"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%
    QuestDAO dao = (QuestDAO) request.getAttribute(QuestDAO.FORM_NAME);
    if (dao == null) {
        dao = (QuestDAO) request.getAttribute(QuestDAO.SECURE_FORM_NAME);
    }
    if (dao != null) {
%>
    <%= dao.getJson() %>
<% } else { 
    QuestBootstrapForm bootstrap = (QuestBootstrapForm) request.getAttribute(QuestBootstrapForm.FORM_NAME);
%>
    <%= bootstrap.getJson() %>
<% } %>
