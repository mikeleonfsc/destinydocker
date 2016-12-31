<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.client.common.*" %>
<%@ page import="java.sql.Time" %>
<%@ page import="java.lang.*" %>
<%@ page import="java.util.*" %>

<%
    ViewSessionStoreForm form = (ViewSessionStoreForm)request.getAttribute(ViewSessionStoreForm.FORM_NAME);


if (HTTPHelper.isViewSessionStore()) {
%>

<base:outlinedTable width="100%">
<TR>
<TD>
<TABLE cellpadding="3" cellspacing="0" border="1">
<%form.renderUserContext(out);%>
</TABLE>
</TD>
</TR>

<TR>
<TD>
<TABLE cellpadding="3" cellspacing="0" border="1">
<%form.renderSessionStore(out);%>
</TABLE>
</TD>
</TR>

<TR>
<TD>
<TABLE cellpadding="3" cellspacing="0" border="1">
<%form.renderPermissions(out);%>
</TABLE>
</TD>
</TR>
</base:outlinedTable>

<H1>Information About Your Request</H1>
<table border="1" cellspacing=\"0\">
<%


    out.println( "<tr><td colspan=\"2\" bgcolor=\"#CCCCFF\">Servlet Request Info</td></tr>" );
    out.println( "<tr><td>Parameters</td><td>" );
    out.println( "<table border=\"1\">" );
    Enumeration parameterNames = request.getParameterNames();
    String parm;
    String[] values;
    while ( parameterNames.hasMoreElements() ) {
        parm = (String)parameterNames.nextElement();
        values = request.getParameterValues( parm );
        for ( int n = 0; n < values.length; n++ ) {
            String str = values[n];
            byte[] bytes = str.getBytes();

            out.println( "<tr><td>" + parm + "</td><td>" + str + "</td></tr>");
            out.print("<tr colspan=\"2\"><td>Hex dump of above parameter using default encoding</td><td>");
            for (int i = 0; i < bytes.length; i++) {
              int value = bytes[i] & 0xFF;
              out.print(Integer.toHexString(value)+ " ");
            }
            out.print("</td></tr>");

        }
    }
    out.println( "</table>" );
    out.println( "</td></tr>" );

    out.println( "<tr><td>CharacterEncoding</td><td>" + request.getCharacterEncoding() + "</td></tr>" );
    out.println( "<tr><td>ContentLength</td><td>" + request.getContentLength() + "</td></tr>" );
    out.println( "<tr><td>ContentType</td><td>" + request.getContentType() + "</td></tr>" );
    out.println( "<tr><td>Protocol</td><td>" + request.getProtocol() + "</td></tr>" );
    out.println( "<tr><td>RemoteAddr</td><td>" + request.getRemoteAddr() + "</td></tr>" );
    out.println( "<tr><td>RemoteHost</td><td>" + request.getRemoteHost() + "</td></tr>" );
    out.println( "<tr><td>Scheme</td><td>" + request.getScheme() + "</td></tr>" );
    out.println( "<tr><td>ServerName</td><td>" + request.getServerName() + "</td></tr>" );
    out.println( "<tr><td>ServerPort</td><td>" + request.getServerPort() + "</td></tr>" );


    out.println( "<tr><td colspan=\"2\" bgcolor=\"#CCCCFF\">HTTP Servlet Request Info</td></tr>" );
    out.println( "<tr><td>Headers</td><td>" );
    out.println( "<table border=\"1\" cellspacing=\"0\">" );
    Enumeration headerNames = request.getHeaderNames();
    String h;
    while ( headerNames.hasMoreElements() ) {
        h = (String)headerNames.nextElement();
        out.println( "<tr><td>" + h + "</td><td>" + request.getHeader(h) + "</td></tr>" );
    }
    out.println( "</table>" );
    out.println( "</td></tr>" );

    out.println( "<tr><td>Cookies</td><td>" );
    out.println( "<table border=\"1\" cellspacing=\"0\">" );
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for ( int n = 0; n < cookies.length; n++ ) {
            out.println( "<tr><td>" + cookies[n].getName() + "</td><td>" );

            out.println( "<table border=\"1\">" );
            out.println( "<tr><td>Comment</td><td>" + cookies[n].getComment() + "</td></tr>" );
            out.println( "<tr><td>Domain</td><td>" + cookies[n].getDomain() + "</td></tr>" );
            out.println( "<tr><td>MaxAge</td><td>" + cookies[n].getMaxAge() + "</td></tr>" );
            out.println( "<tr><td>Path</td><td>" + cookies[n].getPath() + "</td></tr>" );
            out.println( "<tr><td>Secure</td><td>" + cookies[n].getSecure() + "</td></tr>" );
            out.println( "<tr><td>Value</td><td>" + cookies[n].getValue() + "</td></tr>" );
            out.println( "<tr><td>Version</td><td>" + cookies[n].getVersion() + "</td></tr>" );
            out.println( "</table>" );
            out.println( "</td></tr>" );
        }
    }
    out.println( "</table>" );
    out.println( "</td></tr>" );

    out.println( "<tr><td>AuthType</td><td>" + request.getAuthType() + "</td></tr>" );
    out.println( "<tr><td>Method</td><td>" + request.getMethod() + "</td></tr>" );
    out.println( "<tr><td>PathInfo</td><td>" + request.getPathInfo() + "</td></tr>" );
    out.println( "<tr><td>PathTranslated</td><td>" + request.getPathTranslated() + "</td></tr>" );
    out.println( "<tr><td>QueryString</td><td>" + request.getQueryString() + "</td></tr>" );
    out.println( "<tr><td>RemoteUser</td><td>" + request.getRemoteUser() + "</td></tr>" );
    out.println( "<tr><td>RequestedSessionId</td><td>" + request.getRequestedSessionId() + "</td></tr>" );
    out.println( "<tr><td>RequestURI</td><td>" + request.getRequestURI() + "</td></tr>" );
    out.println( "<tr><td>ServletPath</td><td>" + request.getServletPath() + "</td></tr>" );
    // getSession()
    out.println( "<tr><td>isRequestedSessionIdFromCookie</td><td>" + request.isRequestedSessionIdFromCookie() + "</td></tr>" );
    out.println( "<tr><td>isRequestedSessionIdFromUrl</td><td>" + request.isRequestedSessionIdFromUrl() + "</td></tr>" );
    out.println( "<tr><td>isRequestedSessionIdValid</td><td>" + request.isRequestedSessionIdValid() + "</td></tr>" );


    out.println( "<tr><td colspan=\"2\" bgcolor=\"#CCCCFF\">HTTP Session Info</td></tr>" );
    Date cTime = new Date( session.getCreationTime() );
    out.println( "<tr><td>CreationTime</td><td>" + cTime.toString() + "</td></tr>" );
    out.println( "<tr><td>Id</td><td>" + session.getId() + "</td></tr>" );
    Date aTime = new Date( session.getLastAccessedTime() );
    out.println( "<tr><td>LastAccessedTime</td><td>" + aTime.toString() + "</td></tr>" );
    out.println( "<tr><td>isNew</td><td>" + session.isNew() + "</td></tr>" );
%>
</table>


<% } %>
