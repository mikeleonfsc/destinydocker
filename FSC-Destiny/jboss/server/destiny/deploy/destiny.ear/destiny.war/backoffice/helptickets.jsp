<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag"%>
<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.ejb.HelpTicketFacadeSpecs"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.HelpTicketSpecs" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.RoleSpecs"%>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<bean:define id="form" name="<%= HelpTicketsForm.FORM_NAME %>" type="com.follett.fsc.destiny.client.backoffice.servlet.HelpTicketsForm"/>
<bean:define id="locations" name="<%=HelpTicketsForm.FORM_NAME%>" property="homeLocationList" />
<bean:define id="fundingSources" name="<%=HelpTicketsForm.FORM_NAME%>" property="fundingSourceList" />
<bean:define id="departments" name="<%=HelpTicketsForm.FORM_NAME%>" property="departmentList" />

<%
    boolean printerFriendly = form.isPrinterFriendly();

    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>

<base:messageBox strutsErrors="true"/>
  
<base:form action="/backoffice/servlet/handlehelpticketsform.do">

    <html:hidden property="<%= HelpTicketsForm.FIELD_CONTEXT_LIMITER_CHANGED %>" value="false"/>
    <html:hidden property="<%= HelpTicketsForm.FIELD_HIDDEN_UNASSIGNED %>" styleId="hiddenUnassigned"/>
    <html:hidden property="<%= HelpTicketsForm.FIELD_HIDDEN_OPEN %>" styleId="hiddenOpen"/>
    <html:hidden property="<%= HelpTicketsForm.FIELD_HIDDEN_PENDING %>" styleId="hiddenPending"/>
    <html:hidden property="<%= HelpTicketsForm.FIELD_HIDDEN_CLOSED %>" styleId="hiddenClosed"/>
    <html:hidden property="<%= HelpTicketsForm.FIELD_ACTION_SITE_CHANGE %>" value="false"/>
    <html:hidden property="<%= HelpTicketsForm.PARAM_ENTER_KEY_PRESSED%>"/>
    <html:hidden property="<%= HelpTicketsForm.PARAM_SEARCH_TYPE_CHANGED%>" value="false"/>

<base:outlinedTableAndTabsWithinThere id="<%=HelpTicketsForm.TABLE_MAIN%>"  borderColor="#C0C0C0" selectedTab="<%=HelpTicketsForm.TAB_TRACK%>" selectedTabID="<%=form.getTabID()%>" tabs="<%=HelpTicketsForm.tabsForHelpTickets%>" >
    <tr>
        <td>
            <table border="0" width="100%">
                <tr>
                    <td align="left" class="TableHeading">
                        Help Tickets
                        <span style="font-size: .65em">
                            [ <a href="#customize">Customize View</a> ]
                        </span>
                    <% if ( (form.isUsingFilters() && HelpTicketsForm.TAB_TRACK.equals(form.getTab()))  || (form.isUsingClosedFilters() && HelpTicketsForm.TAB_ARCHIVE.equals(form.getTab())) ) { %>
                            <em class="ColRow narrowSearchMessaging">
                            <base:image src="/icons/general/exclamation-octagon-frame.png"/>&nbsp;
                            Limiters have been set...
                            </em>
                    <% } %>
                    </td>
                    <% if (HelpTicketsForm.TAB_TRACK.equals(form.getTab())) {%>
                        <td align="right">
                            <base:genericButton name="<%= HelpTicketsForm.BUTTON_NEW_TICKET %>" src="/buttons/large/newticket.gif" alt="<%= HelpTicketsForm.ALT_NEW_TICKET %>" />
                        </td>
                    <% } %>
                </tr>
            </table>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold">
            <% if (HelpTicketsForm.TAB_ARCHIVE.equals(form.getTab())) {%>
                <%= form.getFirstTimeResolutionPercentage() %>% <%= MessageHelper.formatMessage("helptickets_FirstTimeResolution") %>
            <% } %>
        </td>
    </tr>
    <% if (form.isDisplayNoTicketsMessage() && form.isUsingFilters() && HelpTicketsForm.ID_TAB_HELP_TICKETS_TRACK.equals(form.getTabID())) { %>
        <tr align="center">
            <td class="ColRowBold">
                No Help Tickets found.
            </td>    
        </tr>
    <%} else if (form.isDisplayNoTicketsMessage() && !form.isUsingFilters() && HelpTicketsForm.ID_TAB_HELP_TICKETS_TRACK.equals(form.getTabID())) { %>
        <tr align="center">
            <td class="ColRowBold">
                There are no Help Tickets.
            </td>    
        </tr>
    <% } else if (HelpTicketsForm.ID_TAB_HELP_TICKETS_TRACK.equals(form.getTabID())) { %>
        <base:helpTicketListVO tableName="<%= HelpTicketsForm.TABLE_UNASSIGNED_TICKETS %>" 
            formName="<%= HelpTicketsForm.FORM_NAME %>"
            listName="<%= HelpTicketsForm.NAME_UNASSIGNED %>"
            listStatusType="<%= HelpTicketSpecs.STATUS_UNASSIGNED %>"
            list="<%=form.getHelpTicketLists().getUnassignedList() %>"
            showSiteAsc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_SITE, HelpTicketSpecs.STATUS_UNASSIGNED, false) %>"
            showSiteDesc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_SITE, HelpTicketSpecs.STATUS_UNASSIGNED, true) %>"
            showAssetBarcodeAsc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_ASSET_BARCODE, HelpTicketSpecs.STATUS_UNASSIGNED, false) %>"
            showAssetBarcodeDesc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_ASSET_BARCODE, HelpTicketSpecs.STATUS_UNASSIGNED, true) %>"
            showCreatedOnAsc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_CREATED_ON, HelpTicketSpecs.STATUS_UNASSIGNED, false) %>"
            showCreatedOnDesc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_CREATED_ON, HelpTicketSpecs.STATUS_UNASSIGNED, true) %>"
            showRequestedByAsc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_REQUESTED_BY, HelpTicketSpecs.STATUS_UNASSIGNED, false) %>"
            showRequestedByDesc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_REQUESTED_BY, HelpTicketSpecs.STATUS_UNASSIGNED, true) %>"
            showAssignedToAsc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_ASSIGNED_TO, HelpTicketSpecs.STATUS_UNASSIGNED, false) %>"
            showAssignedToDesc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_ASSIGNED_TO, HelpTicketSpecs.STATUS_UNASSIGNED, true) %>"
            showIssueSummaryAsc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_ISSUE_SUMMARY, HelpTicketSpecs.STATUS_UNASSIGNED, false) %>"
            showIssueSummaryDesc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_ISSUE_SUMMARY, HelpTicketSpecs.STATUS_UNASSIGNED, true) %>"
            showTicketNumAsc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_TICKET_NUMBER, HelpTicketSpecs.STATUS_UNASSIGNED, false) %>"
            showTicketNumDesc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_TICKET_NUMBER, HelpTicketSpecs.STATUS_UNASSIGNED, true) %>"
            printable="<%= printerFriendly %>"
            sectionSortSiteURL="<%= form.gimmeSortSiteURL(HelpTicketSpecs.STATUS_UNASSIGNED) %>"                        
            sectionSortTicketNumURL="<%= form.gimmeSortTicketNumberURL(HelpTicketSpecs.STATUS_UNASSIGNED) %>"
            sectionSortCreatedOnURL="<%= form.gimmeSortCreatedOnURL(HelpTicketSpecs.STATUS_UNASSIGNED) %>"
            sectionSortAssetBarcodeURL="<%= form.gimmeSortAssetBarcodeURL(HelpTicketSpecs.STATUS_UNASSIGNED) %>"
            sectionSortAssignedToURL="<%= form.gimmeSortAssignedToURL(HelpTicketSpecs.STATUS_UNASSIGNED) %>"
            sectionSortRequestedByURL="<%= form.gimmeSortRequestedByURL(HelpTicketSpecs.STATUS_UNASSIGNED) %>"
            sectionSortIssueSummaryURL="<%= form.gimmeSortIssueSummaryURL(HelpTicketSpecs.STATUS_UNASSIGNED) %>"
            />
    
        <base:helpTicketListVO tableName="<%= HelpTicketsForm.TABLE_OPEN_TICKETS %>" 
            formName="<%= HelpTicketsForm.FORM_NAME %>"
            listName="<%= HelpTicketsForm.NAME_OPEN %>"
            listStatusType="<%= HelpTicketSpecs.STATUS_OPEN %>"
            list="<%=form.getHelpTicketLists().getOpenList() %>"
            showSiteAsc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_SITE, HelpTicketSpecs.STATUS_OPEN, false) %>"
            showSiteDesc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_SITE, HelpTicketSpecs.STATUS_OPEN, true) %>"
            showAssetBarcodeAsc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_ASSET_BARCODE, HelpTicketSpecs.STATUS_OPEN, false) %>"
            showAssetBarcodeDesc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_ASSET_BARCODE, HelpTicketSpecs.STATUS_OPEN, true) %>"
            showCreatedOnAsc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_CREATED_ON, HelpTicketSpecs.STATUS_OPEN, false) %>"
            showCreatedOnDesc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_CREATED_ON, HelpTicketSpecs.STATUS_OPEN, true) %>"
            showRequestedByAsc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_REQUESTED_BY, HelpTicketSpecs.STATUS_OPEN, false) %>"
            showRequestedByDesc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_REQUESTED_BY, HelpTicketSpecs.STATUS_OPEN, true) %>"
            showAssignedToAsc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_ASSIGNED_TO, HelpTicketSpecs.STATUS_OPEN, false) %>"
            showAssignedToDesc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_ASSIGNED_TO, HelpTicketSpecs.STATUS_OPEN, true) %>"
            showIssueSummaryAsc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_ISSUE_SUMMARY, HelpTicketSpecs.STATUS_OPEN, false) %>"
            showIssueSummaryDesc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_ISSUE_SUMMARY, HelpTicketSpecs.STATUS_OPEN, true) %>"
            showTicketNumAsc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_TICKET_NUMBER, HelpTicketSpecs.STATUS_OPEN, false) %>"
            showTicketNumDesc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_TICKET_NUMBER, HelpTicketSpecs.STATUS_OPEN, true) %>"
            printable="<%= printerFriendly %>"
            sectionSortSiteURL="<%= form.gimmeSortSiteURL(HelpTicketSpecs.STATUS_OPEN) %>"                        
            sectionSortTicketNumURL="<%= form.gimmeSortTicketNumberURL(HelpTicketSpecs.STATUS_OPEN) %>"
            sectionSortCreatedOnURL="<%= form.gimmeSortCreatedOnURL(HelpTicketSpecs.STATUS_OPEN) %>"
            sectionSortAssetBarcodeURL="<%= form.gimmeSortAssetBarcodeURL(HelpTicketSpecs.STATUS_OPEN) %>"
            sectionSortAssignedToURL="<%= form.gimmeSortAssignedToURL(HelpTicketSpecs.STATUS_OPEN) %>"
            sectionSortRequestedByURL="<%= form.gimmeSortRequestedByURL(HelpTicketSpecs.STATUS_OPEN) %>"
            sectionSortIssueSummaryURL="<%= form.gimmeSortIssueSummaryURL(HelpTicketSpecs.STATUS_OPEN) %>"
            />
            
        <base:helpTicketListVO tableName="<%= HelpTicketsForm.TABLE_PENDING_TICKETS %>" 
            formName="<%= HelpTicketsForm.FORM_NAME %>"
            listName="<%= HelpTicketsForm.NAME_PENDING %>"
            listStatusType="<%= HelpTicketSpecs.STATUS_PENDING %>"
            list="<%=form.getHelpTicketLists().getPendingList() %>"
            showSiteAsc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_SITE, HelpTicketSpecs.STATUS_PENDING, false) %>"
            showSiteDesc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_SITE, HelpTicketSpecs.STATUS_PENDING, true) %>"
            showAssetBarcodeAsc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_ASSET_BARCODE, HelpTicketSpecs.STATUS_PENDING, false) %>"
            showAssetBarcodeDesc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_ASSET_BARCODE, HelpTicketSpecs.STATUS_PENDING, true) %>"
            showCreatedOnAsc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_CREATED_ON, HelpTicketSpecs.STATUS_PENDING, false) %>"
            showCreatedOnDesc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_CREATED_ON, HelpTicketSpecs.STATUS_PENDING, true) %>"
            showRequestedByAsc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_REQUESTED_BY, HelpTicketSpecs.STATUS_PENDING, false) %>"
            showRequestedByDesc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_REQUESTED_BY, HelpTicketSpecs.STATUS_PENDING, true) %>"
            showAssignedToAsc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_ASSIGNED_TO, HelpTicketSpecs.STATUS_PENDING, false) %>"
            showAssignedToDesc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_ASSIGNED_TO, HelpTicketSpecs.STATUS_PENDING, true) %>"
            showIssueSummaryAsc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_ISSUE_SUMMARY, HelpTicketSpecs.STATUS_PENDING, false) %>"
            showIssueSummaryDesc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_ISSUE_SUMMARY, HelpTicketSpecs.STATUS_PENDING, true) %>"
            showTicketNumAsc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_TICKET_NUMBER, HelpTicketSpecs.STATUS_PENDING, false) %>"
            showTicketNumDesc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_TICKET_NUMBER, HelpTicketSpecs.STATUS_PENDING, true) %>"
            printable="<%= printerFriendly %>"
            sectionSortSiteURL="<%= form.gimmeSortSiteURL(HelpTicketSpecs.STATUS_PENDING) %>"                        
            sectionSortTicketNumURL="<%= form.gimmeSortTicketNumberURL(HelpTicketSpecs.STATUS_PENDING) %>"
            sectionSortCreatedOnURL="<%= form.gimmeSortCreatedOnURL(HelpTicketSpecs.STATUS_PENDING) %>"
            sectionSortAssetBarcodeURL="<%= form.gimmeSortAssetBarcodeURL(HelpTicketSpecs.STATUS_PENDING) %>"
            sectionSortAssignedToURL="<%= form.gimmeSortAssignedToURL(HelpTicketSpecs.STATUS_PENDING) %>"
            sectionSortRequestedByURL="<%= form.gimmeSortRequestedByURL(HelpTicketSpecs.STATUS_PENDING) %>"
            sectionSortIssueSummaryURL="<%= form.gimmeSortIssueSummaryURL(HelpTicketSpecs.STATUS_PENDING) %>"
            />
        <% if (form.getHelpTicketLists().isEmpty()) { %>
        <tr align="center">
            <td class="ColRowBold">
                No Help Tickets found. There are additional tickets that are archived.
            </td>    
        </tr>
        <% } else { %>
        <tr>
            <td align="center" width="100%">
                <base:imageLine height="1" width="100%" />
            </td>
        </tr>
        <% } %>

           
    <% } else if (HelpTicketsForm.ID_TAB_HELP_TICKETS_ARCHIVE.equals(form.getTabID())) { %>
<!--    <tr align="center">
            <td align="left" class="ColRowBold">
                <bean:write name="<%= HelpTicketsForm.FORM_NAME %>" property="closedPercentMessage"/>    
            </td>    
        </tr> 
-->        
            <base:helpTicketListVO tableName="<%= HelpTicketsForm.TABLE_CLOSED_TICKETS %>" 
                formName="<%= HelpTicketsForm.FORM_NAME %>"
                listName="<%= HelpTicketsForm.NAME_CLOSED %>"
                listStatusType="<%= HelpTicketSpecs.STATUS_CLOSED %>"
                list="<%=form.getClosedList() %>"
                showSiteAsc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_SITE, HelpTicketSpecs.STATUS_CLOSED, false) %>"
                showSiteDesc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_SITE, HelpTicketSpecs.STATUS_CLOSED, true) %>"
                showAssetBarcodeAsc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_ASSET_BARCODE, HelpTicketSpecs.STATUS_CLOSED, false) %>"
                showAssetBarcodeDesc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_ASSET_BARCODE, HelpTicketSpecs.STATUS_CLOSED, true) %>"
                showCreatedOnAsc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_CREATED_ON, HelpTicketSpecs.STATUS_CLOSED, false) %>"
                showCreatedOnDesc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_CREATED_ON, HelpTicketSpecs.STATUS_CLOSED, true) %>"
                showClosedOnAsc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_CLOSED_ON, HelpTicketSpecs.STATUS_CLOSED, false) %>"
                showClosedOnDesc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_CLOSED_ON, HelpTicketSpecs.STATUS_CLOSED, true) %>"
                showRequestedByAsc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_REQUESTED_BY, HelpTicketSpecs.STATUS_CLOSED, false) %>"
                showRequestedByDesc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_REQUESTED_BY, HelpTicketSpecs.STATUS_CLOSED, true) %>"
                showResolutionAsc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_RESOLUTION, HelpTicketSpecs.STATUS_CLOSED, false) %>"
                showResolutionDesc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_RESOLUTION, HelpTicketSpecs.STATUS_CLOSED, true) %>"
                showAssignedToAsc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_ASSIGNED_TO, HelpTicketSpecs.STATUS_CLOSED, false) %>"
                showAssignedToDesc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_ASSIGNED_TO, HelpTicketSpecs.STATUS_CLOSED, true) %>"
                showIssueSummaryAsc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_ISSUE_SUMMARY, HelpTicketSpecs.STATUS_CLOSED, false) %>"
                showIssueSummaryDesc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_ISSUE_SUMMARY, HelpTicketSpecs.STATUS_CLOSED, true) %>"
                showTicketNumAsc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_TICKET_NUMBER, HelpTicketSpecs.STATUS_CLOSED, false) %>"
                showTicketNumDesc="<%=form.showArrow(HelpTicketSpecs.SORT_BY_TICKET_NUMBER, HelpTicketSpecs.STATUS_CLOSED, true) %>"
                printable="<%= printerFriendly %>"
                sectionSortSiteURL="<%= form.gimmeSortSiteURL(HelpTicketSpecs.STATUS_CLOSED) %>"                        
                sectionSortTicketNumURL="<%= form.gimmeSortTicketNumberURL(HelpTicketSpecs.STATUS_CLOSED) %>"
                sectionSortCreatedOnURL="<%= form.gimmeSortCreatedOnURL(HelpTicketSpecs.STATUS_CLOSED) %>"
                sectionSortClosedOnURL="<%= form.gimmeSortClosedOnURL(HelpTicketSpecs.STATUS_CLOSED) %>"
                sectionSortAssetBarcodeURL="<%= form.gimmeSortAssetBarcodeURL(HelpTicketSpecs.STATUS_CLOSED) %>"
                sectionSortAssignedToURL="<%= form.gimmeSortAssignedToURL(HelpTicketSpecs.STATUS_CLOSED) %>"
                sectionSortRequestedByURL="<%= form.gimmeSortRequestedByURL(HelpTicketSpecs.STATUS_CLOSED) %>"
                sectionSortResolutionURL="<%= form.gimmeSortResolutionURL(HelpTicketSpecs.STATUS_CLOSED) %>"
                sectionSortIssueSummaryURL="<%= form.gimmeSortIssueSummaryURL(HelpTicketSpecs.STATUS_CLOSED) %>"
                />
        <% if (form.getClosedList().isEmpty()) { %>
        <tr align="center">
            <td class="ColRowBold">
                <% if (form.isUsingClosedFilters()) { %>
                No Archived Help Tickets found.
                <% } else { %>
                There are no Archived Help Tickets.
                <% } %>
            </td>    
        </tr>
        <% } else { %>
        <tr>
            <td align="center" width="100%">
                <base:imageLine height="1" width="100%" />
            </td>
        </tr>   
        <% } %>
    <% } %>
        <tr>
            <td width="100%">
                <base:helpIcons buttonsToOutput='<%= form.getHelpIcons() %>'/>
            </td>
        </tr>






<!--  Starting Search section   --> 
   
        
        <tr>
            <td align="center" width="100%">
                <base:imageLine height="1" width="100%" />
            </td>
        </tr>   
        <tr>
            <td>
                <table>    
                    <tr>
                        <td class = "ColRowBold" nowrap = "nowrap" colspan="2">
                            <a name = "customize" style = "color:black">Customize View</a>
                            <br/>
                            <span class = "ColRow" style = "font-weight: normal" >Use the following options to create a customized list.</span>
                        </td>
                    </tr>   
                     <tr>
                        <td colspan="2">
                            <table border="0" width="100%">
                                <tr>
                                    <td align="left" class="TableHeading">Search for Help Tickets</td>
                                </tr>
                            </table>
                        </td>
                    </tr>        
                    
                    <!--  Search selector -->
                    <tr>
                        <td class="ColRowBold tdAlignLeft" nowrap = "nowrap">
                            Find all Help Tickets where </td>
                        <td >
                            <table id="<%=HelpTicketsForm.TABLE_SEARCH_FIELDS%>">
                                <tr>
                                    <td>
                                        <select name="<%=HelpTicketsForm.FIELD_SEARCH_TYPE%>" onchange="onSearchTypeChange()">
                                            <optgroup label="Resource">                                          
                                                <option value="<%=HelpTicketSpecs.SEARCH_TYPE_DISPLAYABLE_NAME%>" <%= form.getSearchType() ==  HelpTicketSpecs.SEARCH_TYPE_DISPLAYABLE_NAME ? "SELECTED" : "" %>>Displayable Name</option>
                                            </optgroup>
                                            <optgroup label="Item">                                          
                                                <option value="<%=HelpTicketSpecs.SEARCH_TYPE_BARCODE%>" <%= form.getSearchType() ==  HelpTicketSpecs.SEARCH_TYPE_BARCODE ? "SELECTED" : "" %>>Barcode</option>
                                            </optgroup>
                                            <optgroup label="Ticket">                                          
                                                <option value="<%=HelpTicketSpecs.SEARCH_TYPE_TICKET_NUMBER%>" <%= form.getSearchType() ==  HelpTicketSpecs.SEARCH_TYPE_TICKET_NUMBER ? "SELECTED" : "" %>>Ticket #</option>
                                                <option value="<%=HelpTicketSpecs.SEARCH_TYPE_ISSUE_SUMMARY%>" <%= form.getSearchType() ==  HelpTicketSpecs.SEARCH_TYPE_ISSUE_SUMMARY ? "SELECTED" : "" %>>Issue Summary</option>
                                                <option value="<%=HelpTicketSpecs.SEARCH_TYPE_ISSUE_DETAILS%>" <%= form.getSearchType() ==  HelpTicketSpecs.SEARCH_TYPE_ISSUE_DETAILS ? "SELECTED" : "" %>>Issue Details</option>
                                            </optgroup>
                                        </select>
                                    </td>
                                    
                                    <td class="ColRow">
                                        <html:text
                                            property="<%=HelpTicketsForm.FIELD_KEYWORD_TEXT%>"
                                            size='<%= form.getSearchType() ==  HelpTicketSpecs.SEARCH_TYPE_TICKET_NUMBER ? "10" : "50" %>'
                                            maxlength='<%= form.getSearchType() ==  HelpTicketSpecs.SEARCH_TYPE_TICKET_NUMBER ? "10" : "50" %>'
                                            onkeydown="return trapEnterKey(event);" />
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                    
                    
                    
<!--  Starting Filtering section   -->   
                    
                    
                    
                    <% if(form.getSessionStore().isDistrictUser())
                    { %>
                    <tr>
                        <td class = "ColRowBold tdAlignLeft">Look in</td>
                        <td class = "ColRow">
                           <base:selectSite
                            name="<%= HelpTicketsForm.FIELD_LIMIT_SITE%>" 
                            selectedSiteID="<%=form.getLimitSite()%>"
                            includeDistrictName="true"
                            includeAllSites="false"
                            includeAllLibraries = "false"
                            includeLibrarySites = "false"
                            includeTextbookSites = "false"
                            includeAssetSites = "true"
                            includeDistrictWarehouse="false"
                            includeMediaSites="false"
                            useSelectASite = "false"
                            onChangeAction = "submitAndChangeToServicingTeamAndMember();"
                          />
                        </td> 
                    </tr>
                  <% } %>
                    <tr>
                        <td colspan="2" >
                            <table border="0" width="100%">
                                <tr>
                                    <td align="center" class="TableHeading">Limit your search for Help Tickets by</td>
                                </tr>
                            </table>
                        </td>
                    </tr>             
                   <tr>
                        <td class = "ColRowBold tdAlignLeft"><a name = "selectSite"></a>
                                Date Created 
                        </td>
                        <td>   <html:select property = "viewHelpTicketDateLimiter">
                                    <html:option value = "<%= HelpTicketFacadeSpecs.PARAM_AFTER_DATE %>"><%= HelpTicketsForm.OPTION_AFTER_DATE %></html:option>
                                    <html:option value = "<%= HelpTicketFacadeSpecs.PARAM_ON_DATE %>"><%= HelpTicketsForm.OPTION_ON_DATE %></html:option>
                                    <html:option value = "<%= HelpTicketFacadeSpecs.PARAM_BEFORE_DATE %>"><%= HelpTicketsForm.OPTION_BEFORE_DATE %></html:option>
                                </html:select>&nbsp;
                                <base:date 
                                    buttonName = "<%=HelpTicketsForm.BUTTON_CHANGE_DATE%>"
                                    fieldName = "<%=HelpTicketsForm.FIELD_LIMIT_DATE%>"
                                    dateValue = "<%=form.getLimitDate()%>"
                                    altText = "Change Limiter Date"
                                    onKeyPress="return trapEnterKey(event);"
                                />
                        </td> 
                    </tr>
                    <tr>
                        <td class="ColRowBold tdAlignLeft" id="<%=HelpTicketsForm.ID_ASSIGNED_TO_FIRST_LAST_NAME_LABEL%>">
                            Assigned to
                        </td>                                
                        <td>
                            <table id="<%=HelpTicketsForm.TABLE_ASSIGNED_TO%>" cellspacing="0" border="0" cellpadding="0">
                                <tr>
                                    <td class="ColRow">
                                        <html:radio property="<%=HelpTicketsForm.FIELD_ASSIGNED_TYPE%>" value="<%=HelpTicketSpecs.ASSIGNED_TYPE_SERVICING_TEAM%>">
                                            Servicing team :
                                            <%
                                            if (form.getServicingTeamList() == null || form.getServicingTeamList().size() == 0) {
                                            %>
                                                    No servicing teams defined
                                            <%
                                            } else {
                                            %>
                                                <%=JSPHelper.renderDropDown(HelpTicketsForm.FIELD_ASSIGNED_SERVICING_TEAM_SITE_JOIN_ID,"submitAndChangeToServicingTeam();" 
                                                    , form.getServicingTeamList(), form.getAssignedServicingTeamSiteJoinID())%>
                                                <%=JSPHelper.renderDropDown(HelpTicketsForm.FIELD_SERVICING_TEAM_MEMBER_ID, null, form.getServicingTeamMemberList(), form.getServicingTeamMemberID())%>
                                            <%
                                                }
                                            %>  
                                        </html:radio>
                                        <br>
                                        <html:radio property="<%= HelpTicketsForm.FIELD_ASSIGNED_TYPE %>" value="<%= HelpTicketSpecs.ASSIGNED_TYPE_INDIVIDUAL %>">
                                            Individual : 
                                            <span id="<%=HelpTicketsForm.ID_ASSIGNED_TO_FIRST_LAST_NAME%>"><bean:write name="<%= HelpTicketsForm.FORM_NAME %>" property="displayableAssignedToName"/></span>&nbsp;                            
                                            <%
                                                                            // using -1 because it doesn't recognize ServicingTeamSpecs.SERVICING_TEAM_SELECT_UNASSIGNED
                                                                            if ((form.getAssignedPatronID() != null) && (!form.getAssignedPatronID().equals( new Long(-1)))) {
                                                                        %>
                                                &nbsp;
                                                <base:genericButton name="<%= HelpTicketsForm.BUTTON_CLEAR %>" src="/buttons/large/clear.gif" alt='<%= MessageHelper.formatMessage("clear") %>' />
                                            <%
                                                }
                                            %>
                                            <base:genericButton name="<%= HelpTicketsForm.BUTTON_SELECT_ASSIGNED %>" src="/buttons/large/selectplus.gif" alt='<%= MessageHelper.formatMessage("select") %>' />
                                        </html:radio>
                                    </td>
                                    <td>
                                    &nbsp;
                                    </td>
                                </tr>                                        
                            </table>
                        </td>   
                    </tr>
                    <tr>
                        <td class="ColRowBold tdAlignLeft" nowrap="nowrap" id="<%= HelpTicketsForm.ID_REQUESTED_FIRST_LAST_NAME_LABEL %>">
                            Requested by
                        </td>
                        <td>
                            <table id="<%= HelpTicketsForm.TABLE_REQUESTOR_DETAILS %>" cellspacing="0" border="0" cellpadding="0">
                                <tr>
                                    <td class="ColRow tdAlignLeft" id="<%= HelpTicketsForm.ID_REQUESTED_FIRST_LAST_NAME %>">
                                        <%
                                            if (StringHelper.isEmpty(form.getDisplayableRequestedByName())) {
                                        %>
                                            <img src="/images/icons/general/spacer.gif" width="60" height="1">
                                        <%
                                            }
                                        %>                                                
                                        <bean:write name="<%= HelpTicketsForm.FORM_NAME %>" property="displayableRequestedByName"/>
                                    </td>                                
                                    <td align="left">
                                        <%
                                            if (form.getRequestedPatron() != null) {
                                        %>
                                            &nbsp;
                                            <base:genericButton name="<%= HelpTicketsForm.BUTTON_CLEAR_REQUESTED %>" src="/buttons/large/clear.gif" alt='<%= MessageHelper.formatMessage("clear") %>' />
                                        <%
                                            }
                                        %>
                                            &nbsp;<base:genericButton name="<%= HelpTicketsForm.BUTTON_SELECT_REQUESTED %>" src="/buttons/large/selectplus.gif" alt='<%= MessageHelper.formatMessage("select") %>' />
                                    </td> 
                                    <td>
                                    &nbsp;
                                    </td>
                                </tr>                                        
                            </table>
                        </td>
                    </tr>
                    
                    
<!-- new limiters -->
                <% if  (!form.getSessionStore().isDistrictUser() || (form.getSessionStore().isDistrictUser() && form.getSelectedSiteID() != null)) { %>
                    <tr>
                    <td class="ColRowBold tdAlignLeft" nowrap>Home Location</td>
                        <td valign="top" class="ColRow" align="left">
                            <html:select property="<%=HelpTicketsForm.FIELD_HOMELOCATION_ID%>">
                                <html:options collection="locations" property="longID" labelProperty="stringDesc" />
                            </html:select>
                         </td>  
                    </tr>
                    <tr>
                    <td class="ColRowBold tdAlignLeft" nowrap>Custodian</td>
                    <td>
                        <table id="<%=HelpTicketsForm.TABLE_CUSTODIAN%>" border="0" cellpadding="5" cellspacing="0">
                            <tr>
                                <td class="ColRow tdAlignLeft" nowrap width="1%"><%=form.getCustodianName() %></td>
                                <td valign="top" class="ColRow tdAlignLeft" width="1%">
                                    <input type="image" src='<%=lh.getLocalizedImagePath("/buttons/large/selectplus.gif")%>'
                                        name="<%=HelpTicketsForm.BUTTON_CUSTODIAN_SELECT%>"
                                        id="<%=HelpTicketsForm.BUTTON_CUSTODIAN_SELECT%>"
                                        alt="Select Custodian"
                                        title="Select Custodian" />
                                 </td>
                                 <% if  (form.getCustodianID() != null) { %>  
                                     <td class="ColRow"  align="left">
                                        <input type="image" src='<%=lh.getLocalizedImagePath("/buttons/large/clear.gif")%>' 
                                            name="<%=HelpTicketsForm.BUTTON_CUSTODIAN_CLEAR%>" 
                                            id="<%=HelpTicketsForm.BUTTON_CUSTODIAN_CLEAR%>" 
                                            alt="Clear Custodian"
                                             title="Clear Custodian" />
                                     </td>  
                                 <% } else { %>
                                     <td  align="left">&nbsp;</td>       
                                 <% } %>
                             </tr>
                        </table>
                    </td>
                </tr>  
    
                <tr>
                <td class="ColRowBold tdAlignLeft" nowrap>Funding Source</td>
                    <td valign="top" class="ColRow" align="left">
                        <html:select property="<%=HelpTicketsForm.FIELD_FUNDINGSOURCE_ID%>">
                            <html:options collection="fundingSources" property="longID" labelProperty="stringDesc"/>
                        </html:select>
                    </td>  
                </tr>
                <tr>
                <td class="ColRowBold tdAlignLeft" nowrap>Department</td>
                    <td valign="top" class="ColRow" align="left">
                        <html:select value="<%=form.getDepartmentIDAsString()%>" property="<%=HelpTicketsForm.FIELD_DEPARTMENT_ID%>">
                            <html:options collection="departments" property="longID" labelProperty="stringDesc"/>
                        </html:select>
                    </td>  
                </tr>
        <% } %>  
                               
      <% if (HelpTicketsForm.ID_TAB_HELP_TICKETS_TRACK.equals(form.getTabID())) { %>
                    
        <tr>
            <td valign="top" ><span class = "ColRowBold tdAlignLeft" style = "font-size:.8em">Display:</span></td>
            <td valign="top" "nowrap = "nowrap" style = "font-size:.8em" >
                <html:checkbox property="<%= HelpTicketsForm.PARAM_DISPLAY_OPEN_TICKETS %>" styleId = "di1"/> <label for="di1">open help tickets</label><br>
                <html:checkbox property="<%= HelpTicketsForm.PARAM_DISPLAY_PENDING_TICKETS %>" styleId = "di2"/>  <label for="di2">pending help tickets</label><br>
                <html:checkbox property="<%= HelpTicketsForm.PARAM_DISPLAY_UNASSIGNED_TICKETS %>" styleId = "do1"/>  <label for="do1">unassigned help tickets</label><br>
            </td>  
                                      
        </tr>
      <% } %>  
        
        <tr>
            <td colspan = "2" align = "center"><br>
            <base:genericButton name="<%= HelpTicketsForm.BUTTON_UPDATE_VIEW %>" 
                src = "/buttons/large/update.gif" 
                alt = "Update"
                />
            <base:genericButton name="<%=HelpTicketsForm.BUTTON_CLEAR_FORM%>"  
                src="/buttons/large/clear.gif"  
                alt="Clear All" 
               />
            </td>
        </tr>        
            </table>  
            </td>
            </tr>
    <!--  Ending Filtering section   -->         
 

</base:outlinedTableAndTabsWithinThere>


<%= SectionHeadingTag.generateShowMoreLessJavascript() %>
<script language="JavaScript">
<!--
    function submitDropDownDistrict() {
        document.<%=HelpTicketsForm.FORM_NAME%>.<%=HelpTicketsForm.FIELD_CONTEXT_LIMITER_CHANGED%>.value = 'true';
        document.<%=HelpTicketsForm.FORM_NAME%>.action += "#selectSite";
        document.<%=HelpTicketsForm.FORM_NAME%>.submit();
    }
    var img = document.getElementById("imageUnassigned");
    if (<%= form.isHiddenUnassigned()%> && img  ) {
        showMoreLess(img, "Unassigned");
    }
    var img = document.getElementById("imageOpen");
    if (<%= form.isHiddenOpen() %> && img) {
        showMoreLess(img, "Open");
    }
    var img = document.getElementById("imagePending");
    if (<%= form.isHiddenPending()%> && img  ) {
        showMoreLess(img, "Pending");
    }
    var img = document.getElementById("imageClosed");
    if (<%= form.isHiddenClosed()%> && img  ) {
        showMoreLess(img, "Closed");
    }    
    function updateURL(t, h) {            
        t.href += "&<%=HelpTicketsForm.FIELD_HIDDEN_UNASSIGNED %>=" + document.<%= HelpTicketsForm.FORM_NAME %>.hiddenUnassigned.value;
        t.href += "&<%=HelpTicketsForm.FIELD_HIDDEN_OPEN %>=" + document.<%= HelpTicketsForm.FORM_NAME %>.hiddenOpen.value;
        t.href += "&<%=HelpTicketsForm.FIELD_HIDDEN_PENDING %>=" + document.<%= HelpTicketsForm.FORM_NAME %>.hiddenPending.value;
        t.href += "&<%=HelpTicketsForm.FIELD_HIDDEN_CLOSED %>=" + document.<%= HelpTicketsForm.FORM_NAME %>.hiddenClosed.value;
        if (h) {
            t.href += "#" + h;
        }
    }
    function submitAndChangeToServicingTeam() {
        document.<%=HelpTicketsForm.FORM_NAME%>.<%=HelpTicketsForm.FIELD_ASSIGNED_TYPE%>[0].checked = true;
        document.<%=HelpTicketsForm.FORM_NAME%>.<%=HelpTicketsForm.FIELD_SERVICING_TEAM_MEMBER_ID%>.selectedIndex = 0;
        document.<%=HelpTicketsForm.FORM_NAME%>.submit();
        return false;
    }    
    function submitAndChangeToServicingTeamAndMember() {
            document.<%=HelpTicketsForm.FORM_NAME%>.<%=HelpTicketsForm.FIELD_ACTION_SITE_CHANGE%>.value = 'true';
            document.<%=HelpTicketsForm.FORM_NAME%>.<%=HelpTicketsForm.FIELD_SERVICING_TEAM_MEMBER_ID%>.selectedIndex = 0;
            document.<%=HelpTicketsForm.FORM_NAME%>.<%=HelpTicketsForm.FIELD_ASSIGNED_SERVICING_TEAM_SITE_JOIN_ID%>.selectedIndex = 0;
            document.<%=HelpTicketsForm.FORM_NAME%>.submit();
            return false;
        }
    function trapEnterKey(e)
    {
        // look for window.event in case event isn't passed in
        if (typeof e == 'undefined' && window.event) { e = window.event; }
        if (e.keyCode == 13)
        {
            document.<%=HelpTicketsForm.FORM_NAME%>.<%=HelpTicketsForm.PARAM_ENTER_KEY_PRESSED%>.value = "true";
            document.getElementById('updateView').click();
        }
    }
    
    function onSearchTypeChange() {
        document.<%=HelpTicketsForm.FORM_NAME%>.<%=HelpTicketsForm.PARAM_SEARCH_TYPE_CHANGED%>.value = "true";
        document.<%=HelpTicketsForm.FORM_NAME%>.submit();
    
    }
// -->
</script>

</base:form>
