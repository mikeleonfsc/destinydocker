<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.util.lookup.LongStringLookup"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.Collection"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%-- I18n Support --%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ page import="com.follett.fsc.common.MessageHelper"%>


<%
	SiteAdministrationViewForm form = (SiteAdministrationViewForm)request.getAttribute(SiteAdministrationViewForm.FORM_NAME);
%>


<base:messageBox strutsErrors="true"/>


	<base:outlinedTableAndTabsWithinThere id="<%=SiteAdministrationViewForm.TABLE_MAIN%>" 
    borderColor="#C0C0C0" 
    selectedTabID="<%=SiteConfigBaseForm.ID_TAB_SITE_ADMINISTRATION %>"
    selectedTab='<%=MessageHelper.formatMessage("siteconfigbase_TabSiteAdministration")%>' 
    tabs="<%=form.getTabs()%>"  width="95%">

    <!-- User is at the district warehouse but does not have the permissions for what they could possibly see on this screen -->
    <% if (form.isDisplayAddPermissionMessageForManageLocations()) { %>
        <tr>
            <td class="ColRowBold">
                Logged in user does not have access to Manage Locations. 
            </td>
        </tr>
    <% } %>


<!--  PRINCIPAL  -->


    <% if (form.isCanSeePrincipal()){ %>
    <TR>
    <TD>
        <TABLE id="<%=SiteAdministrationViewForm.TABLE_PRINCIPAL%>" border="0" cellpadding="2" cellspacing="0">
        <tr>
        <td class="ColRowBold">
        <%LongStringLookup lsl = form.getPrincipalInfo(); %>
        <%=MessageHelper.formatMessage("siteadministrationview_Principal") %>
        <base:helpTag helpFileName="d_principal_AM.htm"/>
		&nbsp;&nbsp;
        <base:link 
            page='<%="/backoffice/servlet/presentpatronselectform.do?"
                    + PatronSelectForm.PARAM_TO_RETURN + "=" + SiteAdministrationViewForm.PARAM_PRINCIPAL_PATRON_ID%>' id="<%=SiteAdministrationViewForm.ID_SELECT_PRINCIPAL %>">
        <base:image        
             src="/buttons/large/selectplus.gif" alt='<%=MessageHelper.formatMessage("select") %>' />							
        </base:link>
		<%if (lsl.getLongID() != null) { %>
				&nbsp;&nbsp;
        <base:link page="/backoffice/servlet/presentsiteadministrationviewform.do?clearPrincipal=true" id="<%=SiteAdministrationViewForm.ID_CLEAR_PRINCIPAL %>">
        <base:image       
             src="/buttons/large/clear.gif" alt='<%=MessageHelper.formatMessage("clear") %>' />                          
        </base:link>
		<%} %>
        </TD>
        </TR>

        <tr>
        <td class="ColRow">
        <ul><li><%=ResponseUtils.filter(lsl.getStringDesc()) %></li></ul>
        </TD>
        </TR>
        </TABLE>
    </TD></TR>
    <% } %>


<!--  DEPARTMENTS  -->


    <% if (form.isCanSeeDepartment()){ %>
    <TR>
    <TD>
        <TABLE id="<%=SiteAdministrationViewForm.TABLE_DEPARTMENTS%>" border="0" cellpadding="2" cellspacing="0">
        <tr>
        <td class="ColRowBold"><%=MessageHelper.formatMessage("siteadministrationview_Departments") %><base:link page=
            '<%="/backoffice/servlet/presentsiteadministrationform.do?" + SiteAdministrationForm.PARAM_FROM_SITE_CONFIG + "=true"%>' id="<%=SiteAdministrationViewForm.ID_EDIT_DEPARTMENTS %>">
            <base:image src="/icons/general/edit.gif" width="19" height="16" alt='<%=MessageHelper.formatMessage("siteadministrationview_EditDepartments") %>'/>
        </base:link>
        </TD>
        </TR>
        
        
        <% List departmentList = (List) form.getDepartmentList().get(0); 
           if (departmentList.isEmpty()) { %>
           <tr>
           <td class="ColRow" align="center"><%=MessageHelper.formatMessage("siteadministrationview_ThereAreNoLocalDepartmentsAssociatedWithYourSite") %></td>
           </tr>
        <% } else {
        %>
           <tr>
           <td class="ColRow"><%=MessageHelper.formatMessage("siteadministrationview_Total", new Long(Integer.valueOf(departmentList.size()).longValue()))%>
           </td>
           </tr>
        <%       
           } 
        %>
        </TABLE>
    </TD></TR>
    <% } %>

<!--  HOMEROOMS  -->

    <% if (form.isCanSeeHomerooms()){ %>
    <TR>
    <TD>
        <TABLE id="<%=SiteAdministrationViewForm.TABLE_HOMEROOM%>" border="0" cellpadding="2" cellspacing="0">
        <tr>
        <td Class="ColRowBold"><%=MessageHelper.formatMessage("siteadministrationview_PatronHomerooms") %>&nbsp;<base:link page="/backoffice/servlet/presenthomeroomaedform.do" id="<%=SiteAdministrationViewForm.ID_EDIT_HOMEROOMS %>">
            <base:image src="/icons/general/edit.gif" width="19" height="16" alt='<%=MessageHelper.formatMessage("siteadministrationview_EditHomerooms") %>'/>
        </base:link>
        </TD>
        </TR>
        <% List homeroomList = form.getHomeroomList(); 
           if (homeroomList.isEmpty()) { %>
           <tr>
           <td class="ColRow" align="center"><%=MessageHelper.formatMessage("siteadministrationview_ThereAreNoHomeroomsAssociatedWithYourSite") %></td>
           </tr>
        <% } else {
        %>
           <tr>
           <td class="ColRow"><%=MessageHelper.formatMessage("siteadministrationview_Total", new Long(Integer.valueOf(homeroomList.size()).longValue()))%>
           </td>
           </tr>
        <%       
           } 
        %>
        </TABLE>
    </TD></TR>
    <% } %>


<!--  MATERIAL LOCATIONS  -->

	
    <% if (form.isCanSeeManageLocations()){ %>
    <TR>
    <TD>
        <TABLE id="<%=SiteAdministrationViewForm.TABLE_LOCATIONS%>" border="0" cellpadding="2" cellspacing="0">
        <tr>
        <td Class="ColRowBold"><%=MessageHelper.formatMessage("siteadministrationview_HomeLocations") %>&nbsp;<base:link page='<%="/backoffice/servlet/presentlocationaedform.do?" + LocationAEDForm.PARAM_FROM_SITE_CONFIG + "=true"%>' id="<%=SiteAdministrationViewForm.ID_EDIT_LOCATIONS %>" >
            <base:image src="/icons/general/edit.gif" width="19" height="16" alt='<%=MessageHelper.formatMessage("siteadministrationview_EditLocations")%>'/>
        </base:link>
        </TD>
        </TR>
        <% Collection locationList = form.getLocationList(); 
           if (locationList.isEmpty()) { %>
           <tr>
           <td class="ColRow" align="center"><%=MessageHelper.formatMessage("siteadministrationview_ThereAreNoHomeLocationsAssociatedWithYourSite") %></td>
           </tr>
        <% } else {
        %>
           <tr>
           <td class="ColRow"><%=MessageHelper.formatMessage("siteadministrationview_Total", new Long(Integer.valueOf(locationList.size()).longValue())) %>
           </td>
           </tr>
        <%       
           }
        %>
        </TABLE>
    </TD></TR>
    <% } %>
    
<% if (form.isCanSeeLibraryVendors()){ %>
<!--  LIBRARY VENDORS  -->
	
    <TR>
    <TD>
        <TABLE id="<%=SiteAdministrationViewForm.TABLE_LIBRARY_VENDOR%>" border="0" cellpadding="2" cellspacing="0">
        <tr>
        <td Class="ColRowBold">
        <%if(form.isMediaBookingUser()){ %>
            <%=MessageHelper.formatMessage("siteadministrationview_MediaVendors") %>&nbsp;
            <%} else {%>
            <%=MessageHelper.formatMessage("siteadministrationview_LibraryVendors") %>&nbsp;
        <%} %>
        <%if(form.isMediaBookingUser()){ %>
            <base:link page='<%="/backoffice/servlet/presentlibraryvendorform.do?" + LibraryVendorForm.PARAM_SITEID + "=" + form.getSiteID()%>' id="<%=SiteAdministrationViewForm.ID_EDIT_MEDIA_VENDORS %>">
                <base:image src="/icons/general/edit.gif" width="19" height="16" alt='<%=MessageHelper.formatMessage("siteadministrationview_EditMediaVendors")%>'/>
            </base:link>
        <%}else{ %>
            <base:link page='<%="/backoffice/servlet/presentlibraryvendorform.do?" + LibraryVendorForm.PARAM_SITEID + "=" + form.getSiteID()%>' id="<%=SiteAdministrationViewForm.ID_EDIT_LIBRARY_VENDORS %>">
                <base:image src="/icons/general/edit.gif" width="19" height="16" alt='<%=MessageHelper.formatMessage("siteadministrationview_EditLibraryVendors") %>'/>
            </base:link>
        <%} %>
            
        </TD>
        </TR>
        <% Collection libraryVendorList = form.getLibraryVendorList(false); 
           if (libraryVendorList.isEmpty()) { %>
           <tr>
           <td class="ColRow" align="center">
        <%if(form.isMediaBookingUser()){ %>
           <%=MessageHelper.formatMessage("siteadministrationview_ThereAreNoMediaVendors") %>
        <%}else{ %>
           <%=MessageHelper.formatMessage("siteadministrationview_ThereAreNoLibraryVendors") %>
        <%} %>
           </td>
           </tr>
        <% } else {
        %>
           <tr>
           <td class="ColRow"><%=MessageHelper.formatMessage("siteadministrationview_Total", new Long(Integer.valueOf(libraryVendorList.size()).longValue())) %>
           </td>
           </tr>
        <%       
           }
        %>
        </TABLE>
    </TD></TR>
<% } %>    
	</base:outlinedTableAndTabsWithinThere>


