<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page errorPage="/common/reportsystemcondition.jsp" %>

<%@ page import="com.follett.fsc.destiny.util.BaseException" %>
<%@ page import="org.apache.log4j.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*, java.util.TreeMap" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.*" %>
<%@ page import="org.apache.struts.action.Action, java.lang.Throwable" %>

<%@ taglib uri='/WEB-INF/struts-tiles.tld' prefix='template' %>
<%@ taglib uri="/WEB-INF/destiny-util.tld" prefix="util" %>

<%
    UIState uistate = UIState.getUIState(request, application);
    String pageTitle = uistate.getPageTitle();

    String siteName = "";
    String debuginfo = "";
    String logoFileName = "";
    String contentname = request.getParameter("content");
    if (contentname == null ) {
        contentname = "/common/contentnotfound.jsp";
        /* /base/initial.jsp */
    }

    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );
    if (store != null) {
        siteName =  (String)store.getProperty( LoginFacadeSpecs.SITE_DISPLAY_NAME );
        if (siteName == null) {
            siteName = "";
        }
        logoFileName = store.getLogoFileName();
    } else {
        siteName = "Session store was returned as null ";
    }
%>
<%@ page buffer="512kb" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<template:insert template='/common/shelltemplate.jsp' >
  <template:put name='scripts' content='/common/scripts.jsp' />
  <template:put name='pagetitle' content='<%= pageTitle %>' direct='true'/>
  <template:put name='logoFileName' content='<%= logoFileName %>' direct='true'/>
  <template:put name='sitename' content='<%= siteName %>' direct='true'/>
  <template:put name='debuginfo' content='<%= debuginfo %>' direct='true'/>
  <template:put name='persistentmenu' content='/common/persistentmenu.jsp' />
  <template:put name='topline' content='/common/topline.jsp' />
  <template:put name='toplevelmenu' content='/common/toplevelmenu.jsp' />
  <template:put name='processingNeeded' content='/common/processingNeeded.jsp' />
  <template:put name='follettNews' content='/common/folletNews.jsp' />
  <template:put name='level2menu' content='/common/level2menu.jsp' />
  <template:put name='pagecontent' content='<%= contentname %>'/>
  <template:put name='footer' content='/common/footer.jsp' />
  <template:put name='pagelevelhelp' content='/common/pagelevelhelp.jsp' />
</template:insert>
