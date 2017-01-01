<%@ page language="java" %><%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*"%><%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%  SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);  BookListForm form = (BookListForm)request.getAttribute(BookListForm.FORM_NAME); %>
<%= BookListForm.processTextFile(form.gimmeAllTitleList(), form.getSearchDescription(), form.getCollectionType()) %>
