<%@ page language="java" %>
<%@ page contentType="text/javascript; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@page import="java.util.Map"%>
<%@page import="java.util.Properties"%>
<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="com.follett.fsc.common.LocaleHelper.PreferredLanguage"%>
<%
    //setup localehelper.  This is ripped directly from DestinyRequestProcessor.processPreprocess
    //this jsp is not rendered through the normal DestinyRequestProcessor..so we need to setup the localehelper ourselves.  TF/DW 
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    lh.setPreferredLanguage(LocaleHelper.stringToPreferredLanguage(store.getLanguage()));
    lh.setCurrentLocale(store.getCurrentLocale());

    Properties props = MessageHelper.getLanguagePropertiesForQuest();
%>
window._languageMap = $H({

<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%><c:forEach items="<%= props %>" var="constant" varStatus="index">
    "${constant.key}": "${constant.value}"<c:if test="${! index.last}">,</c:if>
</c:forEach>
});
