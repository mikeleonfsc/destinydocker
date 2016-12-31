<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.client.common.data.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="org.apache.log4j.*" %>
<%@ page import="org.apache.struts.util.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.common.TimestampHelper" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<%@ page isErrorPage="true" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%
    SystemErrorMessage message = (SystemErrorMessage)request.getAttribute(ActionHelper.SYSTEM_ERROR_MESSAGE);
    Throwable ex = (Throwable)request.getAttribute(ActionHelper.SYSTEM_EXCEPTION);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>

<head>
<title>System Unavailable</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />

<%-- Only show the stack trace to logged in users --%>
<% if (store.isUserLoggedIn()) { %>
    <script src="/common/prototype.js" type="text/javascript"></script>
    <script src="/common/builder.js" type="text/javascript"></script>

    <script>
    Event.observe(window, 'load', function() {
        Event.observe(document, 'keypress', function(e){
            var code;
            if (!e) var e = window.event;
            if (e.keyCode) {
              code = e.keyCode;
            } else if (e.which) {
              code = e.which;
            }
            var character = String.fromCharCode(code);
    
            if (character == 'e') {
                $('errorDetails').show();
            }
        });
    });
    </script>
<% } %>
<%-- Only show the stack trace to logged in users --%>


</head>

<%@page import="com.follett.fsc.destiny.util.DestinySystemProperties"%>
<html>
<%
    Timestamp now = TimestampHelper.getNow();
    String rightNow = lh.formatDateAndTime(now);

    if (message == null) {
        message = new SystemErrorMessage();

        message.setHeader("The system has encountered an error (" + rightNow + ").");
        message.setMessageLine1("Please try again.");
        message.setMessageLine2("If this condition persists, contact your System Administrator.");

        // Log out the stack trace since we have not had the chance to do this yet.
        Logger logCat = Logger.getLogger("com.follett.fsc.destiny.client.common.servlet.reportsystemcondition");
        logCat.error("Caught JSP Exception : ", exception);
        logCat.error("System exception : ", ex);
        Thread.dumpStack();
    }
%>
<body bgcolor="#FFFFFF" text="#000000" topmargin="0" leftmargin="0" rightmargin="0">
    <br/>
    <br/>
    <table border="0" width="100%">
    <tr><td width="100%" align="Center">
        <base:messageBox showRedBorder="true">
        <tr>
            <td valign="top">
                <%=MessageBoxTag.getCAUTION_IMAGE_HTML()%>
            </td>
            <td valign="baseline" align="center">
<%
                if (message != null) {
%>
                    <h2><b><%= message.getHeader() %></b></h2>
                    <br/>
                    <h3><%= message.getMessageLine1() %></h3>
                    <br/>
                    <h3><%= message.getMessageLine2() %></h3>
<%
                }
%>
            <br/>
            <% if (store.isServerAvailable()) { %>
                <% if (request.getParameter("site") != null) { %>
                    <a href="/common/welcome.jsp?site=<%= request.getParameter("site")%>"><%= MessageHelper.formatMessage("reportsystemcondition_Home") %></a>
                <% } else { %>
                    <a href="/common/welcome.jsp"><%= MessageHelper.formatMessage("reportsystemcondition_Home") %></a>
                <% } %>
                
                   &nbsp;&nbsp;<a href="javascript:history.back();"><%= MessageHelper.formatMessage("reportsystemcondition_Back") %></a>
            <% } %>


            </td>
        </tr>
        </base:messageBox>
    </td></tr>
     <% if (DestinySystemProperties.isShowMachineChumpLoggingLink()) { %>
    <tr>
        <td colspan = "3" align = "center"><base:link page = "/district/servlet/presentmachinechumpinfoform.do">Report an Issue to the Machine Chumps</base:link>
        </td>
    </tr>
    <% } %>
    </table>
    
    
    <%-- Only show the stack trace to logged in users --%>
    <% if (store.isUserLoggedIn()) { %>
        <div id="errorDetails" style="display:none">
        <%
            if (message.getHeader().indexOf("temporarily unavailable") == -1) {
                // if this is NOT a temporarily unavailabe message
                // issue, let's display the root exception down the page a bit...
    
                // now print the exception w/ an anchor
                out.println("<a name=\"detail\"></a>");
                if (ex != null) {
                    out.println("<pre>"+ResponseUtils.filter(StringHelper.stackTraceToString(ex))+"</pre>");
                } else {
                    out.println("Cause unknown. See server logs for more details.");
                }
            } %>
        </div>
    <% } %>
</body>
</html>
