<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page errorPage="/common/reportsystemcondition.jsp" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="org.apache.log4j.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*, java.util.TreeMap" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.*" %>
<%@ taglib uri='/WEB-INF/struts-tiles.tld' prefix='template' %>
<%@ taglib uri="/WEB-INF/destiny-util.tld" prefix="util" %>
<%
    response.setHeader("Cache-Control", "no-cache");  // the HTTP 1.1 way
    response.setHeader("Pragma", "No-cache");  // the HTTP 1.0 way
    response.setDateHeader("Expires", 1);

    UIState uistate = UIState.getUIState(request, application);
    String pageTitle = uistate.getPageTitle();
    request.setAttribute("printableIndex", "true");

    String siteName = "";
    String debuginfo = "";
    String contentname = request.getParameter("content");
    if (contentname == null ) {
        contentname = "/common/contentnotfound.jsp";
        /* /base/initial.jsp */
    }
    
    SessionStoreProxy handle = SessionStoreProxy.getSessionStore( session, request );
    if (handle != null) {
        siteName =  (String)handle.getProperty( LoginFacadeSpecs.SITE_DISPLAY_NAME );
        if (siteName == null) {
            siteName = "";
        }

    } else {
        siteName = "Session store handle was returned as null ";
    }
%>
<%@ page buffer="512kb" %>



<%
try {
%>
<template:insert template='/common/printableshelltemplate.jsp' >
  <template:put name='pagetitle' content='<%= pageTitle %>' direct='true'/>
  <template:put name='sitename' content='<%= siteName %>' direct='true'/>
  <template:put name='topline' content='/common/topline.jsp'/>
  <template:put name='debuginfo' content='<%= debuginfo %>' direct='true'/>
  <template:put name='pagecontent' content='<%= contentname %>'/>
  <template:put name='footer' content='' />
</template:insert>
<%
} catch (Exception ex ) {
    Logger logCat = Logger.getLogger( this.getClass() );

    ex.printStackTrace();
    logCat.error( "Exception in printableindex.jsp displaying content " + contentname, ex );

    throw new BaseException( "Exception in printableindex.jsp displaying content " + contentname, ex );
}
%>

