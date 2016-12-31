<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*, java.util.TreeMap" %>
<%@ page import="com.follett.fsc.destiny.util.language.*" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>

<%@ taglib uri="/WEB-INF/destiny-util.tld" prefix="util" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );

    /**
     * Get the string name of the current top level menu item
     * Get the top level menu TreeMap from the session object
     */

    TreeMap menuTree = TopMenu.getMenuTree(application);
    UIState uistate = UIState.getUIState(request, application);

    Iterator topiterate = menuTree.values().iterator();
    TopMenu topmenuitem = null;
    int numTabs = 0;
    String contentURL;

    while (topiterate.hasNext()) {
        topmenuitem = (TopMenu) topiterate.next();
        contentURL = topmenuitem.getContentURL(store);
        if (contentURL != null) {
            numTabs++;
        }
    }
    topiterate = menuTree.values().iterator();

%>

<table border="0" cellpadding="0" cellspacing="0" id="tableTopLevelTabs" style="display:inline-table;">
  <tr id="navTabsMain">
  <%-- Interate over the top level menu array checking for the active item. --%>
  <%-- Refactor using struts:Interate tag --%>

<%
String tabActive = "";
while (topiterate.hasNext()) {
  tabActive = "";
  topmenuitem = (TopMenu) topiterate.next();
  contentURL = topmenuitem.getContentURL(store);
  if (contentURL != null) {
    if (topmenuitem.getName().equals(uistate.getTopMenuName())) {
      tabActive = " tabActive";
    }
    
  String altText = topmenuitem.getAltText();
%>
    <td nowrap class="clearfloatfix<%=tabActive%>">
        <base:link id="<%=topmenuitem.getName()%>" page='<%= URLHelper.addHREFParam(contentURL, TopMenu.TOPMENU_PARAM, topmenuitem.getName()) %>' >
            <span>
            <%= altText %>
            </span>
        </base:link>
    </td>
<%
  }  // end of if permissions OK
} // end of while loop
%>
  </tr>
</table>
