<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8"  %>
<%@ page errorPage="/common/reportsystemcondition.jsp" %>
<%@ page buffer="512kb" %>
<%@ page import="com.follett.fsc.destiny.util.BaseException" %>
<%@ page import="org.apache.log4j.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*, java.util.TreeMap" %>
<%@ page import="org.apache.struts.action.Action, java.lang.Throwable" %>
<%@ taglib uri='/WEB-INF/struts-tiles.tld' prefix='template' %>
<%@ taglib uri="/WEB-INF/destiny-util.tld" prefix="util" %>
<%
    String contentname = request.getParameter("content");
    if (contentname == null ) {
        contentname = "/common/contentnotfound.jsp";
    }
%>

<%
    try {
%>
    <%@page import="org.apache.struts.Globals"%>
<template:insert template='/district/districttemplate.jsp' >
      <template:put name='scripts' content='/common/scripts.jsp' />
      <template:put name='breadcrumb' content='/common/breadcrumbs.jsp' />
      <template:put name='pagecontent' content='<%= contentname %>'/>
      <template:put name='footer' content='/common/footer.jsp' />
      <template:put name='pagelevelhelp' content='/common/pagelevelhelp.jsp' />
    </template:insert>
<%
    } catch (Exception ex ) {
        Logger logCat = Logger.getLogger( this.getClass() );

        ex.printStackTrace();
        logCat.error( "Exception in index.jsp displaying content " + contentname, ex );
        Throwable throwable = (Throwable)pageContext.getAttribute(Globals.EXCEPTION_KEY, PageContext.REQUEST_SCOPE);
        if (throwable != null) {
            System.out.println("\n\n\n*****************************\nThrowable found\n***********************\n\n\n");
            throwable.printStackTrace();
        } else {
            System.out.println("\n\n\n*****************************\nNo throwable object found!\n***********************\n\n\n");
        }
        throw new BaseException( "Exception in index.jsp displaying content " + contentname, ex );
    }
%>
