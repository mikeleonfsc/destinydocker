<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="template" %>
<%@ page import="com.follett.fsc.destiny.util.DestinyColors"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.TitleDetailForm"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.BasicSearchForm"%>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.ListSitesForm"%>
<%@ page import="org.apache.log4j.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.common.consortium.ContextManager"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>
<%@ page import="com.follett.fsc.destiny.client.filters.VersionFilter"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    String directionality = lh.getWebPageDirectionality();

%>
<html dir="<%=directionality%>">
<!-- <template:get name='debuginfo'/> -->
<head>
<!-- html:base/ -->
<title><template:get name='pagetitle'/></title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta property="og:title" content='Found '<%= (request.getAttribute(TitleDetailForm.FORM_NAME) != null ? ((TitleDetailForm)request.getAttribute(TitleDetailForm.FORM_NAME)).getTitle() : "") %>' in Destiny Library Manager&reg;!'/>
<meta property="og:image" content='<%=lh.getLocalizedImagePath("/template/cognite_default_cover_large.png")%>'/>
<link rel="image_src" href='<%=lh.getLocalizedImagePath("/template/cognite_default_cover_large.png")%>'/>
<link REL="shortcut icon" HREF="/images/destiny.ico" TYPE="image/x-icon">
<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    store.clearProductViewList();
    store.getProductViewList();

    String refreshContent = (String) request.getAttribute(DestinyRequestProcessor.REFRESH_CONTENT);
    if (refreshContent != null) {%>
      <META HTTP-EQUIV="Refresh" CONTENT="<%= refreshContent %>">
<% } %>

<link rel="stylesheet" type="text/css" href="<%=VersionFilter.getDestinyCSSVersionedFile() %>" />
<style type="text/css">
    <template:get name='inlineStyleBlock'/>
</style>

<template:get name='scripts'/>

</head>

<%-- The following block allows for us to scroll the window to defined anchor
     positions in a document after page load
--%>
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

<body class="<%=store.getStyleClass() %>" <%=onLoad%>>
<base:systemNotification/>

<base:link linkName="TheTop"/>
<!-- begin tab level Navigation controls -->
<table id="masterHeaderTable" border="0" cellpadding="0" cellspacing="0" width="100%">
<tr bgcolor="<%=DestinyColors.BACKGROUND%>">
    <td valign="top" align="center" class="PageHeader" width="120">
        <%
            boolean correctMachine = HTTPHelper.isInternalToFSC();
            String altText = "";
            
            if (correctMachine) {
                if ( ContextManager.getContextManager().isInConsortiumMode() ) {
                    String ctxName = UserContext.getMyContextName();
                    if ( store.isDistrictUserLoggedIn() ) {        
                        out.print("<a href=\"/district/servlet/presentlistsitesform.do?districtMode=true\" id=\""+ListSitesForm.getListAllSitesText()+"\">");
                    } else {                            
                        out.print("<a href=\"/common/welcome.jsp?context=" + ctxName + "\" id=\""+ListSitesForm.getListAllSitesText()+"\">");
                    }
                } else {                   
                    if ( store.isDistrictUserLoggedIn() && store.isSiteAccess()) {        
                        out.print("<a href=\"/district/servlet/presentlistsitesform.do?districtMode=true\" id=\""+ListSitesForm.getListAllSitesText()+"\">");
                    } else {                    
                        out.print("<a href=\"/common/welcome.jsp\" id=\""+ListSitesForm.getListAllSitesText()+"\">");
                    }
                }
                
                altText = "ContextName = " + ResponseUtils.filter(UserContext.getMyThreadUserContext().getContextName()) + 
                    ", SiteID = " + store.getSiteID();
            }
        %>


        <img width="120" border="0" src="<template:get name='logoFileName'/>" height="54" alt="<%=altText %>" title="<%=altText %>">

        <%
            if (correctMachine) {
                out.print("</a>");
            }

            if (store.isDistrictUserLoggedIn() && store.isSiteAccess()) {
                String link = "/district/servlet/presentlistsitesform.do?districtMode=true";
        %>
                <base:link page="<%=link%>" id="<%=ListSitesForm.ID_LIST_ALL_SITES %>">
                    <base:image src="/template/listallsites.gif" alt="<%=ListSitesForm.getListAllSitesText()%>"></base:image>
                </base:link>
         <%
            }
            if (store.isDestinyAdminLoggedIn()) {
                String link = "/common/welcome.jsp";
                if (ContextManager.getContextManager().isInConsortiumMode() ) {
                    link += "?context=" + UserContext.getMyContextName();
                }
        %>
                <base:link page="<%=link%>" id="<%=ListSitesForm.ID_LIST_ALL_SITES %>">
                    <base:image src="/template/listallsites.gif" alt="<%=ListSitesForm.getListAllSitesText()%>"></base:image>
                </base:link>
         <%
            }
        %>        
    </td>
    
    <td width="100%" colspan="2" valign="bottom">
<table id="<%= BasicSearchForm.TABLE_MENU_INFO %>" border="0" cellpadding="0" cellspacing="0" width="100%" class="mainMenuTable">

  <tr><!-- row 1 -->
    <td colspan="2">
    </td>
  </tr>
  <tr><!-- row 2 -->
   <td></td>
  </tr>
  <tr><!-- row 3 -->
   <td class="Instruction">
        <template:get name='processingNeeded'/>
         <template:get name='follettNews'/>
   </td>
</tr>

</table>
</td>

    </tr>
</table>

<table id="masterTable" border="0" cellpadding="0" cellspacing="0" width="100%">
   <!-- begin color bar to tie the tabs to the secondary menu -->
      <tr>
        <td colspan="3">
            <table width="100%" cellspacing="0" cellpadding="0" border="0">
                <tr class="navTabBaseBar">
                  <template:get name='topline'/>
                 </tr>
            </table>
        </td>
      </tr>
      <tr class="navTabBaseBarShadow">
        <td width="120"><base:imageSpacer width="1" height="5"/></td>
        <td><base:imageSpacer width="1" height="5"/></td>
      </tr>
  <!-- end color bar -->
  <!-- end level one navigation tabs -->
  <tr>
    <td colspan="3">
        <table width="100%" cellspacing="0" cellpadding="0" border="0">
            <tr>

    <!-- begin level two navigation control menu -->
    <td width="120" valign="top" id="level2MenuContainer"></td>
    <td valign="top" colspan="3">
        <table border="0" cellspacing="0" cellpadding="0" width="100%">
        <tr>
          <!-- Spacer from menu to body content -->  
          <td><base:imageSpacer width="10" height="1"/></td>
            <td>    
    <%-- When we get back from level2menu, we have an open TD tag that
         may contain a colspan if no level2menu is present --%>
    <!-- end level two navigation control menu -->
    <!-- right frame td created by level2menu since the width is only provided if
    a menu exists.  This cell contains the main body of the document -->
    <!-- begin context navigation controls - nested in the upper right corner of the body -->
        <!-- begin Bread Crumbs -->
            <table border="0" width="98%">
                <tr><td>
                    <%-- If we have exceptions, currently we do not show the breadcrumbs --%>
                    <base:handleExceptions>

                    <template:get name='pagelevelhelp'/>
                    <jsp:include page="/common/messagebox.jsp?icon=warning" flush="true" />
                    <!-- insert the main body of the document here -->
                    <template:get name='pagecontent'/>
                    </base:handleExceptions>
                    
                    
                    </td></tr>
                </table>
            </td></tr>
            </table>
            <!-- end main body -->
        </td><%-- The start tag for this TD is set in level2menu--%>
    <!-- end right frame -->
                 </tr>
            </table>
        </td>

    </tr>
    <!-- begin footer -->
    <template:get name='footer'/>
    
</table>
</body>
</html>
