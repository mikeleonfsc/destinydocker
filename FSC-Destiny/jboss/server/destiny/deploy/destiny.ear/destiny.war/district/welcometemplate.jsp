<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="template" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LoginFacadeSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.common.LocaleHelper" %>
<%@page import="com.follett.fsc.destiny.client.filters.VersionFilter"%>
<%@ page import="com.follett.fsc.destiny.session.cmd.VersionInfo"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="java.util.Date"%>
<%@ page import="com.follett.fsc.destiny.util.login.LoginSpecs" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html:html>


<head>
<%
    UIState uistate = UIState.getUIState(request, application);
    String pageTitle = uistate.getPageTitle();
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    VersionInfo info = VersionInfo.getInstance();
%>
<title><%= ResponseUtils.filter(pageTitle) %></title>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<link REL="shortcut icon" HREF="/images/destiny.ico" TYPE="image/x-icon">
<link rel="stylesheet" type="text/css" href="<%=VersionFilter.getDestinyCSSVersionedFile() %>" />

<template:get name='scripts'/>

<script language="JavaScript">
<!--
var trackAnalytics = <%= LoginSpecs.isTrackAnalytics() %>;
if (typeof trackAnalytics !== 'undefined') {
    if (trackAnalytics === true) {
        // Google Analytics - Specific Follett Software Account 
        (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
        (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
        m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
        })(window,document,'script','//www.google-analytics.com/analytics.js','ga');
        
        if (isDevelopmentServer()) {
            ga('create', 'UA-39868263-7', {'cookieDomain': 'none'}); //Development Google Analytics
        } else {
            ga('create', 'UA-39868263-6'); //Production Google Analytics
        }
        ga('send', 'pageview', { 'page': getWorkingUrl() });
   } 
}
//-->
</script>

</head>

<body>
<base:systemNotification/>
<table border="0" cellpadding="0" cellspacing="0" width="100%">

<%
if (request.getAttribute(DistrictJobSummaryForm.DISABLE_TOP_BANNER) == null ) {
%>
<tr class="basicUpperBar">
    <td class="tdAlignRight" valign="top">
        <table width="100%" id="BreadCrumbs" border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td class="SmallFixedInverse"></td>
        </tr>
        </table>
    </td>
</tr>
<% } %>

<tr>
    <td colspan="2">
        <table border="0" cellpadding="0" cellspacing="0" width="100%">
        <tr>
            <td>
                <template:get name='pagecontent'/>
            </td>
        </tr>
        </table>
    </td>
</tr>
<tr>
    <td colspan="2">
        <table border="0" cellpadding="0" cellspacing="0" width="100%">
        <tr>
            <td><br></td>
        </tr>
        <tr id="footerMain" class="mainFooter">
            <td colSpan="3" align="center" height="18">
                <span id="footerCopyright" class="PageFooter">&copy;<%= (String) application.getAttribute(DestinyRequestProcessor.COPYRIGHT_YEAR_KEY) %></span>
                <!-- onclick req for safari 2.0 -->
                <base:link onclick="window.open('/backoffice/servlet/presentaboutform.do', '_aboutBox', 'status=1, toolbar=1, scrollbars=1')" page="/backoffice/servlet/presentaboutform.do" target="_aboutBox">
                    <span id="footerCompany" class="PageFooter">Follett School Solutions, Inc.</span>
                </base:link>
                &nbsp;&nbsp;<span id="footerReleaseInfo" class="PageFooter"><%=info.getReleaseTag()%></span>
                &nbsp;&nbsp;<span id="footerDateTime" class="PageFooter"><%=lh.formatDateAndTimeWithTimeZone(new Date(System.currentTimeMillis()))%></span> 
            </td>
          </tr>
        </table>
    </td>
</tr>

</table>

</body>
</html:html>
