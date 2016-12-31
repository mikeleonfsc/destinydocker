<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.common.servlet.*, java.util.TreeMap" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/destiny-util.tld" prefix="util" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
	// ****************************************************************************
	// DEVELOPER NOTE: If adding a menu item edit the destiny-config.xml in WEB-INF 
	// ****************************************************************************
	
    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );

    /**
     * Get the string name of the current top level menu item
     * Get the string name of the current level2 menu item
     * Get the top level menu TreeMap from the session object
     * Get the TreeMap of the level2 menu relating to the current
     *   top level menu.
     */
    TreeMap menuTree = TopMenu.getMenuTree(application);
    UIState uistate = UIState.getUIState(request, application);

    Iterator topiterate = menuTree.values().iterator();
    TopMenu topmenuitem = null;

    Level2Menu[] level2menu = null;
    String topLevelMenuName = null;

    // write function that given a topmenu name will return a reference
    // to a level2Menu array.
    // Find level2Menu array by first finding the current topMenu item.
    while (topiterate.hasNext()) {
        topmenuitem = (TopMenu) topiterate.next();
        if (topmenuitem.getName().equals(uistate.getTopMenuName())) {
            level2menu = topmenuitem.getLevel2Menus();
            level2menu = topmenuitem.addLanguageButtons(level2menu, store);
            topLevelMenuName = topmenuitem.getName();
        }
    }

    /* If there are any level2 menu items to show for the selected top level menu */
    if (level2menu.length > 0 && !"Home".equalsIgnoreCase(topLevelMenuName) && !"TopLevelDashboard".equalsIgnoreCase(topLevelMenuName)) {
%>
    <!-- left navigation table cell, contains the level 2 navigation control menu -->
    <td width="120" valign="top" id="level2MenuContainer">
    <table id="Level2Menu" border="0" cellpadding="0" cellspacing="0">

    <%-- iterate over the level 2 menu TreeMap and check for the selected item.
    --%>
    <%-- refactor using the struts:iterate tag --%>
    <%

    boolean isActiveMenuSelected = false;
    for (int currMenu = 0; currMenu < level2menu.length; currMenu++ ) {
            if (level2menu[currMenu].hasPermission(store) && level2menu[currMenu].hasLanguageOkay(store, request) ) {
                if (level2menu[currMenu].getName().equals(uistate.getLevel2MenuName())) {
                    isActiveMenuSelected = true;
                    session.setAttribute(UIState.LAST_SELECTED_MENU_URL, HTTPHelper.encodeURL(level2menu[currMenu].getContentURL(), request, response));
                }

    %>
    <tr>   
      <!-- all on one line below to get rid of extra space -->
      <%= level2menu[currMenu].render(uistate.getLevel2MenuName(), request, response) %>
    </tr>
        <%
            }
        } // end of for loop
        if (!isActiveMenuSelected)
            uistate.setLevel2MenuName("");
        %>
    </table>

    </td>

    <td valign="top">
    <%
    } else {
    /* There are no level 2 menu items to show */
    %>
    <td valign="top" colspan="3">
    <%
    }
    %>

        <table border="0" cellspacing="0" cellpadding="0" width="100%">
        <tr>
          <!-- Spacer from menu to body content -->  
          <td><base:imageSpacer width="10" height="1"/></td>
            <td>
                <!-- end left navigation frame -->
                <!-- right frame, contains the main body of the document -->
