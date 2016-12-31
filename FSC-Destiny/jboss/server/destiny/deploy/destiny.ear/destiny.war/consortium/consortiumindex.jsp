<!--base href="http://127.0.0.1"-->
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8"  %>
<%@ page errorPage="/common/reportsystemcondition.jsp" %>
<%@ page buffer="512kb" %>
<%@ page import="com.follett.fsc.destiny.util.BaseException" %>
<%@ page import="org.apache.log4j.*" %>
<%@ page import="org.apache.struts.action.Action, java.lang.Throwable" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.common.consortium.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LookupSpecs"%>
<%@ taglib uri='/WEB-INF/struts-tiles.tld' prefix='template' %>
<%@ taglib uri="/WEB-INF/destiny-util.tld" prefix="util" %>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );
    String ctxName = ContextManager.getContextManager().getDefaultDistrictContext().getContextName();
    UIState uistate = UIState.getUIState(request, application);
    String pageTitle = uistate.getPageTitle();
   

    String contentname = request.getParameter("content");
    if (contentname == null ) {
        contentname = "/common/contentnotfound.jsp";
    }

    try {
        if (store != null && store.isMiniDestiny()) { 
        
            ctxName = StringHelper.truncate(ctxName, LookupSpecs.MINID_SITE_NAME_MAX_DISPLAY, true);
        %>
            <%@page import="org.apache.struts.Globals"%>
<template:insert template='/common/minidestinytemplate.jsp' >
                <template:put name='pagetitle' content='<%= pageTitle %>' direct='true'/>
                <template:put name='sitename' content='<%= ctxName %>' direct='true'/>
                <template:put name='pagecontent' content='<%= contentname %>'/>
            </template:insert>
        <% 
        } else { 
        %>
            <template:insert template='/consortium/consortiumtemplate.jsp' >
                <template:put name='scripts' content='/common/scripts.jsp' />
                <template:put name='breadcrumb' content='/common/breadcrumbs.jsp' />
                <template:put name='outlinestarttable' content='/consortium/outlinestarttable.jsp' />
                <template:put name='pagecontent' content='<%= contentname %>'/>    
                <template:put name='outlineendtable' content='/consortium/outlineendtable.jsp' />
                <template:put name='footer' content='/common/footer.jsp' />
                <template:put name='pagelevelhelp' content='/common/pagelevelhelp.jsp' />
            </template:insert>   
        <%
        }
    } catch (Exception ex ) {
        Logger logCat = Logger.getLogger( this.getClass() );
        ex.printStackTrace();
        logCat.error( "Exception in consortiumindex.jsp displaying content " + contentname, ex );

        Throwable throwable = (Throwable)pageContext.getAttribute(Globals.EXCEPTION_KEY, PageContext.REQUEST_SCOPE);
        if (throwable != null) {
            System.out.println("\n\n\n*****************************\nThrowable found\n***********************\n\n\n");
            throwable.printStackTrace();
        } else {
            System.out.println("\n\n\n*****************************\nNo throwable object found!\n***********************\n\n\n");
        }
        throw new BaseException( "Exception in consortiumindex.jsp displaying content " + contentname, ex );
    }
%>
