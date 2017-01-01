<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>



<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request.getSession(), request);
    List messages = store.getMessages();
    String messageHeader = store.getMessageHeader();

    String iconParm = request.getParameter("icon");
    String iconToUse = null;
    String classToUse = "Error";
    String align = "center";
    boolean disableCautionIcon = store.isDisableCautionIcon();

    if ((iconParm!=null) && iconParm.toLowerCase().equals("warning")) {
        iconToUse = "/icons/general/caution.gif";
        align = null;   // Do not specify an align attribute for left-alignment
    }

    
    if ( messages != null && !messages.isEmpty() ) {
%>

    <base:messageBox showWarningIcon="false" showRedBorder="<%=(iconToUse != null && !disableCautionIcon) %>">
    <tr>
        <% if (iconToUse != null && !disableCautionIcon) { %>
            <td valign="top"><base:image align="middle" alt='<%= MessageHelper.formatMessage("messagebox_Message") %>' height="16" width="16" src="<%= iconToUse %>"/></td>
        <% } %>
        <% if (align != null) { %>
        <td valign="baseline" class="<%=classToUse%>" align="<%=align%>">
        <% } else { %>
        <td valign="baseline" class="<%=classToUse%>">
        <% } %>
            <%
            if (!StringHelper.isEmpty(messageHeader)) {
                out.print(messageHeader);
            }

            boolean listMode = (messages.size() > 1);

            Iterator itr = messages.iterator();
            
            while (itr.hasNext()) {
                if (listMode) {
                    out.println("<ul>");
                    String msgText = (String)itr.next();
                    
                    if (!StringHelper.startsWithIgnoresCase(msgText, "<li>")) {
                        out.println("<li>");
                        out.println(msgText);
                        out.println("</li>");
                    } else {
                        out.println(msgText);
                    }
                    
                    out.println("</ul>");
                }
                else {
                    out.println((String) itr.next());
                }
            }
            %>
        </td>
    </tr>
    </base:messageBox>
<%
}
%>

