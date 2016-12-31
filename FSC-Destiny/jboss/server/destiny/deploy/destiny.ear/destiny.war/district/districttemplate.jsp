<%@page import="com.follett.fsc.destiny.util.login.LoginSpecs"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri='/WEB-INF/struts-tiles.tld' prefix='template' %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.filters.DestinyFilter" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LoginFacadeSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.filters.VersionFilter"%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<html:html>

<head>
<%
    UIState uistate = UIState.getUIState(request, application);
    String pageTitle = uistate.getPageTitle();
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

<%
    StringBuffer onLoad = new StringBuffer("");

    //The window.location --> anchor tag was causing problems with HTTPUnit
    if (!com.follett.fsc.destiny.client.common.HTTPHelper.isFromHttpUnit(request)) {
        String anchor = (String) request.getAttribute("focus.anchor");
        if (anchor != null) {
            onLoad.append("onLoad='window.location=\"" + anchor + "\";");
        }
    }

    String focusFormName = (String) request.getAttribute("focus.formName");
    String focusProperty = (String) request.getAttribute("focus.property");
    if (focusFormName != null && focusProperty != null) {
        if (onLoad.length() > 0) {
            onLoad.append(" document.forms[\"" + focusFormName + "\"].elements[\"" + focusProperty + "\"].focus();");
        }
    }

    // Close off the onLoad event handler
    if (onLoad.length() > 0) {
        onLoad.append("'");
    }
%>


<body <%=onLoad%>>
<base:systemNotification/>

<table border="0" cellpadding="0" cellspacing="0" width="100%">
<tr bgcolor="<%=DestinyColors.BACKGROUND%>">
    <td class="PageHeaderStrongWhite" valign="top" width="50%">
        <%= ResponseUtils.filter(ListSitesForm.getDistrictName(request, session)) %>
        <br><br>
    </td>
    <td class="tdAlignRight" valign="top">
        <table id="UserHeader" border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td valign="top" class="PageHeaderWhite tdAlignRight" nowrap>
                <%
                  if (request.getAttribute(DestinyFilter.ATTRIBUTE_DESTINY_FILTER_LOGIN_DENY_FROM_GUEST) == null ){

                      SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );
                          if(store.isUserLoggedIn()) {
                %>
                      <%=(String) store.getProperty(LoginFacadeSpecs.USER_DISPLAY_NAME) %>
                      <base:link page="/common/servlet/logout.do?site=0" id="<%=GenericForm.ID_LOGOUT%>">
                      <base:image src="/buttons/small/logout.gif" alt="Log Out" align="absbottom" />
                      </base:link>
                <% } else { %>
                      District Users ...
                      <base:link page="/district/servlet/presentdistrictloginform.do" id="<%=GenericForm.ID_LOGIN%>">
                      <base:image src="/buttons/small/login.gif" alt="Log In" align="absbottom"/>
                      </base:link>
                <% } 
                %>
                <base:spanIfAllowed permission="<%=Permission.BACK_OFFICE_DESTINY_HELP%>">
                    <base:destinyHelpLink permission="<%=Permission.BACK_OFFICE_DESTINY_HELP%>">
                    <base:image src="/buttons/small/destinyhelp.gif" alt='<%=MessageHelper.formatMessage("basicsearch_DestinyHelp")%>' align="absbottom"/>
                    </base:destinyHelpLink>
                </base:spanIfAllowed>
                <%
                }
                %>
            </td>
        </tr>
        </table>
    </td>
</tr>
<tr class="navTabBaseBar">
    <td colspan="2">
        <template:get name='breadcrumb'/>
    </td>
</tr>
<tr class="navTabBaseBarShadow">
    <td colspan="2"><base:imageSpacer width="1" height="5"/></td>
</tr>
<tr>
    <td colspan="2">
        <table border="0" cellpadding="0" cellspacing="0" width="100%">
        <tr>
            <td>
                <template:get name='pagelevelhelp'/>
                <jsp:include page="/common/messagebox.jsp?icon=warning" flush="true" />
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
            <template:get name='footer'/>
        </table>
    </td>
</tr>

</table>

</body>
</html:html>
