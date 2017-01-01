<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>

<%
response.setHeader("Cache-Control", "no-cache");  // the HTTP 1.1 way
response.setHeader("Pragma", "no-cache");  // the HTTP 1.0 way
%>

<HTML>
<BODY>
<H1>The HTTP headers from your request</H1>

<table border="1">
<%
    Enumeration headerNames = request.getHeaderNames();
    String h;
    while ( headerNames.hasMoreElements() ) {
        h = (String)headerNames.nextElement();
        out.println( "<tr><td>" + h + "</td><td>" + request.getHeader(h) + "</td></tr>" );
    }
%>
</table>

</BODY>
</HTML>
