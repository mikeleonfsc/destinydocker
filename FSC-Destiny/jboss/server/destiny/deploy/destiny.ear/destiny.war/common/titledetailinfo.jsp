<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.TitleDetailForm"%>
<%@page import="com.follett.fsc.destiny.session.common.ejb.LoginFacadeSpecs"%>
<%@page import="com.follett.fsc.destiny.util.URLHelper"%>
<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@page import="com.follett.fsc.destiny.util.ObjectHelper"%>
<%@page import="com.follett.fsc.common.consortium.ContextManager"%>



<%
    String contextName = request.getParameter("context");
    Long siteID = ObjectHelper.makeLongFromObject(request.getParameter("site"));
    Long bibID = ObjectHelper.makeLongFromObject(request.getParameter("bibID"));
    String url = null;
    if ( ContextManager.getContextManager().isInConsortiumMode() ) {
        if ( contextName == null ) {
            // error... must provide a context name
            url = "/common/welcome.jsp";
        }
    }
    
    if ( bibID == null ) {
        // error.... must provide a bib id
        url = "/common/welcome.jsp";
    }
    
    if ( siteID == null ) {
        // error ... must provide a site id
        url = "/common/welcome.jsp";
    }
    if ( url == null ) {
        url = URLHelper.addHREFParam("/cataloging/servlet/presenttitledetailform.do", TitleDetailForm.FIELD_SITE_ID, siteID);
        url = URLHelper.addHREFParam(url, TitleDetailForm.FIELD_BIBID, bibID);
    }
    %>

<jsp:forward page="<%=url %>" />



