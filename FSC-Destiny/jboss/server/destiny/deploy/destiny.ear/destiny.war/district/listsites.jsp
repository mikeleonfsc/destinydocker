<%@page import="com.follett.fsc.destiny.client.common.servlet.BaseHomeForm"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.SiteTypeSpecs"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.district.data.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.filters.DestinyFilter" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.common.*" %>


<%@page import="com.follett.fsc.destiny.client.common.servlet.GenericForm"%><base:messageBox strutsErrors="true"/>

<script language="JavaScript" type="Text/Javascript">
<!--
function addToFavorites(pagename, urladdress) {
   var startingURL = window.document.URL;
   for(x = 1; x < startingURL.length - 1; x++) {
      if(startingURL.charAt(x) == '/' && startingURL.charAt(x - 1) != '/' && startingURL.charAt(x + 1) != '/' ) {
         startingURL = startingURL.substring(0, x);
         break;
      }
   }
   if(startingURL.charAt(startingURL.length - 1) == '/') {
       startingURL = startingURL.substring(0, startingURL.length - 1);
   }
   startingURL = startingURL + urladdress;
   
   if(window.sidebar) {
      window.sidebar.addPanel(pagename, startingURL, "");
   } else if (window.external) {
      window.external.AddFavorite(startingURL, pagename)
   } else {
      alert("Sorry! Your browser doesn't support this function.");
   }
}
// --></script>

<%
    ListSitesForm form = (ListSitesForm)request.getAttribute("district_servlet_ListSitesForm");
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    boolean showEnhancedHomepage = form.isUseEnhancedDistrictHomepage();
    boolean showFSCOnlyOptions = HTTPHelper.isInternalToFSC();
%>

<table border="0" cellspacing="0" cellpadding="3"  id="siteList" width="100%">
<tr bgcolor="<%=DestinyColors.BACKGROUND%>">
    <td width="120" align="center">
        <%  if (showFSCOnlyOptions) {
                if (store.isDestinyAdminLoggedIn()) {
                    //Show district edit tree
                    %>
                    <base:link page="/district/servlet/presentdistricttreeform.do" id="<%=ListSitesForm.ID_LIST_ALL_MEMBERS_TREE%>">
                        <img border="0" src="<%=store.getDistrictImageName()%>" width="120" height="54" alt="<%=ListSitesForm.BUTTON_ALT_HOME%>" title="<%=ListSitesForm.BUTTON_ALT_HOME%>"/>
                    </base:link>
                    
                    <%
                } else {
                    %>
                    <img border="0" src="<%=store.getDistrictImageName()%>" width="120" height="54" alt="<%=ListSitesForm.BUTTON_ALT_HOME%>" title="<%=ListSitesForm.BUTTON_ALT_HOME%>"/>
                    <%
                }
            } else {
                %>
                <img border="0" src="<%=store.getDistrictImageName()%>" width="120" height="54" alt="<%=ListSitesForm.BUTTON_ALT_HOME%>" title="<%=ListSitesForm.BUTTON_ALT_HOME%>"/>
                <%
            }

            if (store.isConsortiumAdmin()) {
        %>             
                <base:link page="/consortium/servlet/presentlistconsortiummembersform.do" id="<%=ListSitesForm.ID_LIST_ALL_MEMBERS %>">
                    <base:image src="/template/listallmembers.gif" alt="<%=ListSitesForm.BUTTON_ALT_HOME%>"/>
                </base:link>
         <%
            }
        %>               
        
    </td>
    <td class="PageHeaderWhite" align="left" width="100%">Welcome to <%= ResponseUtils.filter(ListSitesForm.getDistrictName(request, session)) %></td>
    <% if (store != null && !store.isMemberDisabled()) { %>
           <td valign="top" class="PageHeaderWhite tdAlignRight" nowrap>
        <% if (request.getAttribute(DestinyFilter.ATTRIBUTE_DESTINY_FILTER_LOGIN_DENY_FROM_GUEST) == null) {
               if (store.isUserLoggedIn()) { %>
                   Current user: <%=(String) store.getProperty(LoginFacadeSpecs.USER_DISPLAY_NAME) %>
                   <base:link page="/common/servlet/logout.do?site=0" id="<%=GenericForm.ID_LOGOUT%>" >
                   <base:image src="/buttons/small/logout.gif" alt="Log Out" align="absbottom"/>
                   </base:link>
                   &nbsp;
                <% if (store.isDestinyAdminLoggedIn()) {
                       if (request.getAttribute(ListSitesForm.FORM_NAME) != null) { %>
                            <base:link page="/district/servlet/presentdistricttreeform.do" id="<%=ListSitesForm.ID_SETUP%>">
                            <base:image src="/buttons/small/setupsmall.gif" alt="<%=ListSitesForm.LINK_SETUP%>" align="absbottom"/>
                            </base:link>
                    <% }
                   }
                   if (store.isDistrictAccess()) {
                       if (request.getAttribute(ListSitesForm.FORM_NAME) != null) { %>
                            <base:link page="/district/servlet/presentdistrictuserredirectorform.do" id="<%=ListSitesForm.ID_DISTRICT%>">
                            <base:image src="/buttons/small/districtsmall.gif" alt="<%=ListSitesForm.LINK_DISTRICT%>" align="absbottom"/>
                            </base:link>
                    <% }
                   }
               } else { %>
                   <span class="PageHeaderWhite">District Users ...</span>
                   <base:link page="/district/servlet/presentdistrictloginform.do" id="<%=GenericForm.ID_LOGIN%>">
                   <base:image src="/buttons/small/login.gif" alt="Log In" align="absbottom"/>
                   </base:link>
                   &nbsp;
            <% } %>
               <base:spanIfAllowed permission="<%=Permission.BACK_OFFICE_DESTINY_HELP%>">
                    <base:destinyHelpLink permission="<%=Permission.BACK_OFFICE_DESTINY_HELP%>">
                    <base:image src="/buttons/small/destinyhelp.gif" alt='<%=MessageHelper.formatMessage("basicsearch_DestinyHelp")%>' align="absbottom"/>
                    </base:destinyHelpLink>
               </base:spanIfAllowed>
        <% } %>
           </td>
    </tr>
      <%
        if (form.showAASPRegistrationNag(store)) {
    %>
    <tr>
        <td>&nbsp;</td>
        <td colspan="2" align="center">
        <base:form action="/district/servlet/handlelistsitesform.do"  method="post">
                <base:messageBox showRedBorder="true">
                    <tr>
                        <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                        <td class="ColRowBold" align="center"><%=BaseHomeForm.AASP_VERIFY_NAG_MESSAGE %></td>
                    </tr>

                    <tr>
                        <td>&nbsp;</td>
                        <td valign="baseline" align="center" class="ColRow">
                            <base:link href="<%=form.gimmeAASPRegistrationLink() %>" target="_blank" id="<%=ListSitesForm.AASP_REGISTRATION_ID %>">
                                                        <base:image src="/buttons/large/registernow.gif" alt="<%=ListSitesForm.BUTTON_REGISTER_IDENTIFY%>"/>
                                                    </base:link>&nbsp;
                         
                     <base:genericButton src="/buttons/large/remindmelater.gif" name="<%=ListSitesForm.BUTTON_REGISTER_REMIND_LATER%>" alt="<%=ListSitesForm.BUTTON_REGISTER_REMIND_LATER_TEXT%>" />                       
                         
                        </td>
                    </tr>
                </base:messageBox>
         </base:form>
            </td>
    </tr>
    <%
        }
    %>
    
    <% if (showFSCOnlyOptions) { %>
    <tr>
        <td class="ColRow" align="center" colspan="3">
            <base:link page="/district/servlet/handledistrictloginform.do?districtMode=true&loginName=destinyadmin&password=password">
                Log in as DestinyAdmin
            </base:link>
        </td>
    </tr>
    <% } %>
    <tr>
    <td align="center" colspan="3">
    
    <% // Enhanced Homepage ================================================================================ %>    
    <% if (showEnhancedHomepage) { %>
    
                <table id="<%=ListSitesForm.TABLE_MASTER%>" cellpadding="3" cellspacing="0" width="100%">
                <tr>
                    <td width="25%" valign="top" align="left">
                
            <% // search field ================================================================================ %>    
                
                    <base:form action="/district/servlet/presentlistsitesform.do" focus="<%=ListSitesForm.FIELD_SEARCH_TERM%>" method="post">

                        <div class="FormLabel"><%= form.getSearchPrompt() %></div>
                    
                        <nobr><span style="white-space:nowrap;">
                            <html:text property="<%=ListSitesForm.FIELD_SEARCH_TERM %>" size="30" maxlength="30"/>&nbsp;
                            <base:genericButton absbottom="true" src="/buttons/large/go.gif" name="go" alt='<%=MessageHelper.formatMessage("go") %>' />
                        </span></nobr>
                        
                    </base:form>
                    
                    <br/>
                 
            <% // end of search field ================================================================================ %>    

                    <%  List<List> siteList = form.getWelcomeTree().getFullSiteTypeList();
                        StringBuilder siteIDs = new StringBuilder("[");
                        if ( siteList.size() > 0 ) {  
                            for(List<DistrictTreeReturn> currentList:siteList) { 
                                boolean first = true;
                                for(DistrictTreeReturn dtr:currentList) {
                                    if ( first ) {
                                        Long sid = dtr.getSiteTypeID();
                                        String siteID = (null == sid) ? "none" : String.valueOf(sid);
                                        String titleID = ListSitesForm.TABLE_LEFT_SITE_TYPE + "_" + siteID;
                                        String sectionID = ListSitesForm.TABLE_LEFT_SITES + "_" + siteID;
                                        if (siteIDs.length() > 1) {
                                            siteIDs.append(",");
                                        }
                                        siteIDs.append("\"");
                                        siteIDs.append(siteID);
                                        siteIDs.append("\"");
                                        
                                        first = false;
                                        %>
                            <TABLE border="1"  id="<%=titleID%>" cellpadding="2" cellspacing="0" style="border-collapse:collapse;" bordercolor="<%=DestinyColors.BACKGROUND%>" width="100%">
                                <tr bgcolor="<%=DestinyColors.BACKGROUND%>" class="ColRowBold" style="cursor:pointer">
                                    <td align="center" valign="middle" width="100%">
                                        <a href="#" onClick="ExpandCollapseSection('<%=sectionID%>');" id='<%=sectionID+"_onClick"%>' class="TitleLink">
                                            <div style="width:100%">
                                                <span id='<%=sectionID+"_icon"%>'><%=form.getDefaultIcon()%></span>
                                                <FONT color="#FFFFFF"><%=ResponseUtils.filter(dtr.getSiteTypeName())%></FONT>
                                            </div>
                                        </a>
                                    </td>
                                </tr><tr>
                                    <td align="left" id="<%=sectionID %>" style="<%=form.getDefaultHide()%>">
                            
                                        <% } // first %>
                                        
                                        <ul><li>
                                            <span class="ColRow">
                                        <% if (dtr.isInactiveSite()) {%>
                                            <%= ResponseUtils.filter(dtr.getSiteName()) %>
                                        <% } else { %>
                                            <base:link page='<%= "/common/welcome.jsp?site=" + dtr.getSiteID().toString() %>' >
                                                <%= ResponseUtils.filter(dtr.getSiteName()) %>
                                            </base:link>
                                            <a href="javascript:addToFavorites('Destiny - <%=ResponseUtils.filter(StringHelper.removeChars(dtr.getSiteName(), "\'")) %>', '<%=form.gimmeUrlForBookmark(dtr.getSiteID()) %>')"><base:image src="/icons/general/bookmark.gif" width="16" height="16" alt="Bookmark this Site"/></a>
                                        <% } %>
                                            </span>
                                        <% if (showFSCOnlyOptions && !dtr.isInactiveSite() && !SiteTypeSpecs.SITE_TYPE_ID_DISTRICT_WAREHOUSE.equals(dtr.getSiteTypeID())) { %>
                                                <span class="Instruction" style="float:right;">
                                                <base:link page='<%= "/common/welcome.jsp?site=" + dtr.getSiteID().toString() + "&userLoginName=admin" + dtr.getSiteID().toString() + "&userLoginPassword=password" %>' >
                                                    Admin<%=dtr.getSiteID().toString()%> 
                                                </base:link>
                                                </span>
            
                                         <% } %>
                                        </li></ul>
                                <% } // dtr %>
                                    </td>
                                </tr>
                            </table>
                            <br>
                <% } // currentList
                
                siteIDs.append("]");%>
                </td>

        <% }else{ %>
            <% siteIDs.append("]"); %>
        
            <div id="listSitesNoResultsMessage" class="FormLabel"><%=form.getNoResultsMessage()%></div>
        <% } %>
                <td><base:imageSpacer width="20" height="1"/></td>
                <td valign="top">
                    <jsp:include page="/common/basehome.jsp?fromDistrict=true">
                        <jsp:param name="formName" value="<%= ListSitesForm.FORM_NAME %>" />
                    </jsp:include>
                </td>
            </tr>
        </table>
        <script language="JavaScript" type="Text/Javascript">
            var siteIDs = <%=siteIDs.toString()%>;
            
            function ExpandCollapseSection(id) {
                if (typeof document.getElementById(id) != 'undefined') {
                    if (document.getElementById(id).style.display == 'none') {
                        document.getElementById(id).style.display = '';
                        document.getElementById(id+"_icon").innerHTML='<%=form.getShowLessIcon()%>';
                    }else{
                        document.getElementById(id).style.display = 'none';
                        document.getElementById(id+"_icon").innerHTML='<%=form.getShowMoreIcon()%>';
                    }
                }
                updateCookie();
            }
            function loadCookie() {
                var cookie=getCookie("<%=form.getContextCookieName()%>");
                
                if (typeof cookie != 'undefined' && cookie != "") {
                    var openSites=cookie.split(/,/);

                    for (var i=0; i < openSites.length; i++) {
                        var id="<%=ListSitesForm.TABLE_LEFT_SITES%>_" + openSites[i];
                        ExpandCollapseSection(id);
                    }
                }
                updateCookie();             
            }
            function updateCookie() {
                var openSites=[];
                for (var i=0; i < siteIDs.length; i++) {
                    var id="<%=ListSitesForm.TABLE_LEFT_SITES%>_" + siteIDs[i];
                    
                    if (!(document.getElementById(id).style.display == 'none')) {
                        openSites.push(siteIDs[i]);
                    }
                }
                setCookie("<%=form.getContextCookieName()%>", openSites.toString(), 365);
            }
            <%=form.getLoadCookie()%>
        </script>


        <% // End of Enhanced Homepage ================================================================================ %>
    <% }else{ %>
        <% // Original Strength HomePage ================================================================================ %>    
    
        <table id="<%=ListSitesForm.TABLE_MASTER%>" cellpadding="3" cellspacing="0" align="center" width="85%">
        <tr valign="top">
        
        <%
            //Get both lists here so that we can test the sizes
            List leftList = form.getWelcomeTree().getLeftSiteTypeList();
            List rightList = form.getWelcomeTree().getRightSiteTypeList();
            String theWidth = "50%"; //Default 2 columns, 50% it
            if (rightList.size() == 0) {
                //If there is no right list, make the width 100%
                theWidth = "100%";
            }
        
        if ( leftList.size() > 0 )  { %>
        
        <td width="<%= theWidth %>">
        
        <%  DistrictTreeReturn dtr;
            Iterator leftIterator = leftList.iterator();
            int index = 0;
        
            while ( leftIterator.hasNext() ) {
                List currentList = (List)leftIterator.next();
        
                Iterator leftSideIterator = currentList.iterator();
                boolean first = true;
                while ( leftSideIterator.hasNext() ) {
                    dtr = (DistrictTreeReturn) leftSideIterator.next();
                    if ( first ) {
                        first = false;
        
                        out.println("<TABLE border=\"1\" id=\"" + ListSitesForm.TABLE_LEFT_SITE_TYPE + "_" + index + "\" cellpadding=\"2\" cellspacing=\"0\" style=\"border-collapse: collapse\" bordercolor=\"" + DestinyColors.BACKGROUND + "\" width=\"100%\">");
                        out.println("<tr>");
                        out.println("<td width=\"100%\" align=\"center\" class=\"ColRowBold\" bgcolor=\"" + DestinyColors.BACKGROUND + "\">");
                        out.println("<FONT color=\"#FFFFFF\">");
                        out.println(ResponseUtils.filter(dtr.getSiteTypeName()));
                        out.println("</FONT>");
                        out.println("</td>");
                        out.println("</tr>");
                        out.println("<tr>");
                        out.println("<td width=\"100%\" align=\"center\">");
                        out.println("<table id=\"" + ListSitesForm.TABLE_LEFT_SITES + "_" + index + "\" cellPadding=\"2\" cellspacing=\"0\">");
                    } %>
                            <tr>
                                <td valign="bottom" class="tdAlignLeft">
                                <ul><li>
                                    <span class="ColRow">
                                <% if (dtr.isInactiveSite()) {%>
                                    <%= ResponseUtils.filter(dtr.getSiteName()) %>
                                <% } else { %>
                                    <base:link page='<%= "/common/welcome.jsp?site=" + dtr.getSiteID().toString() %>' >
                                        <%= ResponseUtils.filter(dtr.getSiteName()) %>
                                    </base:link>
                                    <a href="javascript:addToFavorites('Destiny - <%=ResponseUtils.filter(StringHelper.removeChars(dtr.getSiteName(), "\'")) %>', '<%=form.gimmeUrlForBookmark(dtr.getSiteID()) %>')"><base:image src="/icons/general/bookmark.gif" width="16" height="16" alt="Bookmark this Site"/></a>
                                <% } %>
                                    </span>
                                <% if (showFSCOnlyOptions && !dtr.isInactiveSite() && !SiteTypeSpecs.SITE_TYPE_ID_DISTRICT_WAREHOUSE.equals(dtr.getSiteTypeID())) { %>
                                    <table cellpadding="2" cellspacing="2" border="0">
                                    <tr>
                                        <td class="Instruction">
                                        <base:link page='<%= "/common/welcome.jsp?site=" + dtr.getSiteID().toString() + "&userLoginName=admin" + dtr.getSiteID().toString() + "&userLoginPassword=password" %>' >
                                            Admin<%=dtr.getSiteID().toString()%>
                                        </base:link>
                                        </td>
                                    </tr>
                                    </table>
                                <% } %>
                                </li></ul>
                                </td>
                            </tr>
                        <% } %>
                        </table>
                    </td>
                </tr>
                </table>
                <br>
            <%
            index++;
            } %>
        </td>
        
        <% } %>
        
        
        
        <% if ( rightList.size() > 0 )  { %>
        
        <td><base:imageSpacer width="20" height="1"/></td>
        <td width="50%">
        
        <%
            DistrictTreeReturn dtr;
            Iterator rightIterator = rightList.iterator();
            int index = 0;
        
            while ( rightIterator.hasNext() ) {
                List currentList = (List)rightIterator.next();
                Iterator rightSideIterator = currentList.iterator();
                boolean first = true;
                while ( rightSideIterator.hasNext() ) {
                    dtr = (DistrictTreeReturn) rightSideIterator.next();
                    if ( first ) {
                        first = false;
        
                        out.println("<TABLE border=\"1\" id=\"" + ListSitesForm.TABLE_RIGHT_SITE_TYPE + "_" + index + "\" cellpadding=\"2\" cellspacing=\"0\" style=\"border-collapse: collapse\" bordercolor=\"" + DestinyColors.BACKGROUND + "\" width=\"100%\">");
                        out.println("<tr>");
                        out.println("<td width=\"100%\" align=\"center\" class=\"ColRowBold\" bgcolor=\"" + DestinyColors.BACKGROUND + "\">");
                        out.println("<FONT color=\"#FFFFFF\">");
                        out.println(ResponseUtils.filter(dtr.getSiteTypeName()));
                        out.println("</FONT>");
                        out.println("</td>");
                        out.println("</tr>");
                        out.println("<tr>");
                        out.println("<td width=\"100%\" align=\"center\">");
                        out.println("<table id=\"" + ListSitesForm.TABLE_RIGHT_SITES + "_" + index + "\" cellPadding=\"2\" cellspacing=\"0\">");
                    }
                %>
                            <tr>
                                <td valign="bottom" class="tdAlignLeft">
                                <ul><li>
                                   <span class="ColRow">  
                                <% if (dtr.isInactiveSite()) {%>
                                    <%= ResponseUtils.filter(dtr.getSiteName()) %>
                                <% } else { %>
                                    <base:link page='<%= "/common/welcome.jsp?site=" + dtr.getSiteID().toString() %>' >
                                        <%= ResponseUtils.filter(dtr.getSiteName()) %>
                                    </base:link>
                                    <a href="javascript:addToFavorites('Destiny - <%=ResponseUtils.filter(StringHelper.removeChars(dtr.getSiteName(), "\'")) %>', '<%=form.gimmeUrlForBookmark(dtr.getSiteID()) %>')"><base:image src="/icons/general/bookmark.gif" width="16" height="16" alt="Bookmark this Site"/></a>
                                    
                                <% } %>
                                </span>
                                <% if (showFSCOnlyOptions && !dtr.isInactiveSite() && !SiteTypeSpecs.SITE_TYPE_ID_DISTRICT_WAREHOUSE.equals(dtr.getSiteTypeID())) { %>
                                    <table cellpadding="2" cellspacing="2" border="0">
                                    <tr>
                                        <td class="Instruction">
                                        <base:link page='<%= "/common/welcome.jsp?site=" + dtr.getSiteID().toString() + "&userLoginName=admin" + dtr.getSiteID().toString() + "&userLoginPassword=password" %>' >
                                            Admin<%=dtr.getSiteID().toString()%>
                                        </base:link>
                                        </td>
                                    </tr>
                                    </table>
                                <% } %>
        
                                </li></ul>
                                </td>
                            </tr>
        
                        <%
                    }
                    %>
                        </table>
                    </td>
                </tr>
                </table>
                <br>
            <%
            index++;
            } %>
        
        </td>
        
        <% } %>
        
        </tr>
        </table>
    
    <% } %>
    <% // End Homepages ================================================================================ %>    
    
    
    </td>
    </tr>
    <% if (!showEnhancedHomepage) { %>
    <tr>
        <td align="center" colspan="3"> 
        <% String districtWelcomeImageSrc = form.getDistrictWelcomeImage();
        if (!StringHelper.isEmptyOrWhitespace(districtWelcomeImageSrc)) {
        %>
        <img src="<%=districtWelcomeImageSrc %>">
        <% } %>
        </td>
    </tr>
    <% } %>
<% } else {  // disabled district %>
    </tr>
    <tr>
    <td>&nbsp;</td>
    <td colspan="2" align="center">
        <% 
            String message = System.getProperty(DestinySystemProperties.PROPERTY_DISABLED_DISTRICT_MESSAGE);
            
            if (message == null) {
                message = "Our records indicate your subscription has currently expired.<ul><li>Please contact Follett Customer Service at " +
                            System.getProperty(DestinyConfigProperties.PROPERTY_TECH_SUPPORT_PHONE_NUMBER_MESSAGE, "1-888-511-5114") + " for assistance.";
            }
        %>
        <base:messageBox header="<%= message %>" showWarningIcon="true" filterMessage="false"/>
    </td>
    </tr>
    </table>
<% } %>
<% if (DestinySystemProperties.isShowMachineChumpLoggingLink()) { %>
    <tr>
        <td colspan = "3" align = "center"><base:link page = "/district/servlet/presentmachinechumpinfoform.do">Report an Issue to the Machine Chumps</base:link>
        </td>
    </tr>
<% } %>
</table>
