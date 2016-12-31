<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*" %>
<%@ page import="com.follett.fsc.common.LocaleHelper" %>
<%@ page import="com.follett.fsc.destiny.util.DestinyConfigProperties" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page import="com.follett.fsc.destiny.session.cmd.VersionInfo"%>

<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="java.util.Date"%>

<%
    String copyrightYear = (String) application.getAttribute(DestinyRequestProcessor.COPYRIGHT_YEAR_KEY);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    VersionInfo info = VersionInfo.getInstance();
%>

<tr id="footerMain" class="mainFooter">
    <td colSpan="3" align="center" height="18">
    <span id="footerCopyright" class="PageFooter">&copy;<%= copyrightYear %></span>
    <% if (!"true".equals(request.getAttribute("printableIndex"))) { %>
        <!-- onclick req for safari 2.0 -->
        <base:link onclick="window.open('/backoffice/servlet/presentaboutform.do', '_aboutBox', 'menubar=1, status=1, toolbar=1, scrollbars=1')" page="/backoffice/servlet/presentaboutform.do" target="_aboutBox">
        <span id="footerCompany" class="PageFooter">Follett School Solutions, Inc.</span>
        </base:link>
    <% } else { %>
        <span id="footerCompany" class="PageFooter">Follett School Solutions, Inc.</span>
    <% } %>
      &nbsp;&nbsp;<span id="footerReleaseInfo" class="PageFooter"><%=info.getReleaseTag()%></span>
      &nbsp;&nbsp;<span id="footerDateTime" class="PageFooter" dir=<%=UserContext.getMyContextLocaleHelper().getWebPageDirectionality()%>><%=lh.formatDateAndTimeWithTimeZone(new Date(System.currentTimeMillis()))%></span>
    </td>
    <!-- end footer -->
  </tr>
