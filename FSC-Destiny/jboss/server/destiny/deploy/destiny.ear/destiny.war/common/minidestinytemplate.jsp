<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="template" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<%@ page import="com.follett.fsc.destiny.client.common.servlet.DestinyRequestProcessor"%>
<%@ page import="com.follett.fsc.common.StringHelper"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.UIState"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.MiniSiteMenuForm"%>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.ListSitesForm"%>
<%@ page import="com.follett.fsc.destiny.client.consortium.servlet.ListConsortiumMembersForm"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.InventoryForm"%>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%@ page import="com.follett.fsc.destiny.util.DestinyColors"%>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LoginFacadeSpecs"%>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LookupSpecs"%>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html:html>
<head>

<title><template:get name='pagetitle'/></title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css" href="/common/minidestiny.css" />

</head>

<%
    StringBuffer onLoad = new StringBuffer("");
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
    
    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );
    
    UIState uistate = UIState.getUIState(request, application);
    boolean shouldHideSiteName = (!store.isUserLoggedIn() || 
        ListSitesForm.FORM_NAME.equals(uistate.getFormName()) || 
        ListConsortiumMembersForm.FORM_NAME.equals(uistate.getFormName()) || 
        MiniSiteMenuForm.FORM_NAME.equals(uistate.getFormName()));
    String pageTitle = uistate.getPageTitle();
    
	GenericForm form = (GenericForm)request.getAttribute(uistate.getFormName());
    boolean displayMiniBackButton = form.isDisplayMiniBackButton();
    String miniDTableWidth = form.getMiniDestinyWidth();
%>
<body bgcolor="#ffffff" leftmargin="0" topmargin="0" marginheight="0" marginwidth="0" rightmargin="0">
<table border="0" cellpadding="2" cellspacing="0" width="100%" id="main">
	<tr bgcolor="<%=DestinyColors.BACKGROUND%>">
		<td class="InverseSmallColHeading">
    		<base:image  src="/icons/general/icon.gif" width="15" height="15" align="absmiddle"/> 
    		&nbsp;
    		<% if (ListSitesForm.FORM_NAME.equals(uistate.getFormName())) { %>    		
            <%= ResponseUtils.filter(StringHelper.truncate("Welcome to " + ListSitesForm.getDistrictName(request, session), LookupSpecs.MINID_SITE_NAME_MAX_DISPLAY, true)) %>
            <% } else if (ListConsortiumMembersForm.FORM_NAME.equals(uistate.getFormName())) { %>    		
            <%= ResponseUtils.filter(StringHelper.truncate("Welcome to " + ListConsortiumMembersForm.getConsortiumName(request, session), LookupSpecs.MINID_SITE_NAME_MAX_DISPLAY, true)) %>
            <% } else { %>
    		<template:get name='sitename'/>
            <% } %>
		</td>
	</tr>
	<tr>
		<td align="center">
		<table border="0" cellpadding="0" cellspacing="0" width="<%= miniDTableWidth %>">
    		<% if (!shouldHideSiteName) { %>
			<tr>
			    <td>
        			<table id="pageHeader" border="0" cellpadding="2" cellspacing="0" width="<%= miniDTableWidth %>">
        				<tr>
        					<td class="SmallColHeading"><%= pageTitle %></td>
        				</tr>
        			</table>
			    </td>
            </tr>
            <% } %>
            <tr>
                <td>
					<jsp:include page="/common/messagebox.jsp?icon=warning" flush="true" />

                    <!-- insert the main body of the document here -->
                    <template:get name='pagecontent'/>

                </td>
            </tr>
			<tr>
			    <td>
        			<!-- Page navigation starts here -->
        			<% if (store.isUserLoggedIn()) { %>
        			    <% String userName =  (String)store.getProperty( LoginFacadeSpecs.USER_DISPLAY_NAME ); %>
        			    
            			<table id="<%=MiniSiteMenuForm.TABLE_USER_FOOTER%>" border="0" cellpadding="2" cellspacing="0" width="100%">
            				<tr>
            					<td colspan="2" height="4" class="InverseSmallColHeading">
            						<base:imageLine height="1"/>
            					</td>
            				</tr>
            				<tr>
            					<td class="ColRow" nowrap>
            						<% if (displayMiniBackButton) { %>
	                                    <base:link page="<%=form.getMiniBackButtonURL()%>" >
		                                    <base:image src="/icons/general/back.gif" alt="<%=InventoryForm.BUTTON_ALT_BACK%>" 
		                                    	align="absbottom" width="18" height="16"/>
	                                    </base:link>
            						<% } %>
            						<% if ((store.isDestinyAdminLoggedIn() || store.isDistrictUserLoggedIn()) && form instanceof MiniSiteMenuForm) { %>
	                                    <base:link page="<%=((MiniSiteMenuForm)form).getListSitesButtonURL()%>" >
		                                    <base:image src="/icons/general/disthome.gif" alt="<%=MiniSiteMenuForm.BUTTON_ALT_HOME%>" 
		                                    	align="absbottom" width="18" height="16"/>
	                                    </base:link>
            						<% } %>
            						<% if (store.isConsortiumAdminLoggedIn() && form instanceof ListSitesForm) { %>
	                                    <base:link page="<%=((ListSitesForm)form).getListMembersButtonURL()%>" >
		                                    <base:image src="/icons/general/consortium.gif" alt="<%=ListSitesForm.BUTTON_ALT_HOME%>" 
		                                    	align="absbottom" width="18" height="16"/>
	                                    </base:link>
            						<% } %>
                            		<% if (!shouldHideSiteName) { %>
                                    <base:link page="/common/servlet/presentminisitemenuform.do" >
                                    <base:image src="/icons/general/home.gif" alt="<%=MiniSiteMenuForm.LINK_HOME%>" align="absbottom" 
                                        width="18" height="16"/>
                                    </base:link>
                					<% } else { %>
                    			    &nbsp;
                					<% } %>
            					</td>
            					<td class="ColRow tdAlignRight" nowrap><%= ResponseUtils.filter(com.follett.fsc.common.StringHelper.truncatePatronFirstMiddleLastName(userName)) %>
                                    <base:link id="<%=GenericForm.ID_LOGOUT%>" page="/common/servlet/logout.do?tm=" >
                                    <base:image src="/buttons/small/logout_mini.gif" alt="Log Out" align="absbottom"/>
                                    </base:link>
                                </td>
            				</tr>
            			</table>
            		<% } %>
        			<!-- Page navigation ends here -->
			    </td>
			</tr>
		</table>
		</td>
	</tr>
	<tr bgcolor="<%=DestinyColors.BACKGROUND%>">
<%
    String copyrightYear = (String) application.getAttribute(DestinyRequestProcessor.COPYRIGHT_YEAR_KEY);
%>

		<td class="PageFooter" align="center">&copy;<%= copyrightYear %> Follett School Solutions, Inc.</td>
	</tr>
</table>

</body>
</html:html>
