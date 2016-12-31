<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%
    ListSitesForm form = (ListSitesForm)request.getAttribute("district_servlet_ListSitesForm");
%>


<base:form action="/district/servlet/handlelistsitesform.do" method="post">
<table border="0" cellspacing="0" cellpadding="3"  id="siteList" width="100%">
<%if (form.getStore() != null && !form.getStore().isMemberDisabled()){ %>
    <tr>
        <td class="FormLabel" align="center">Select your site</td>
    </tr>
    <tr>
        <base:isDistrictUserLoggedIn>
            <td align="center">
                <base:selectSite 
                    name='<%= ListSitesForm.FIELD_SITE_ID %>' 
                    submitOnChange="false" 
                    selectedSiteID='<%= form.getSiteID().toString()%>' 
                    siteTypeID="<%=null%>" 
                    includeAllLibraries="false" 
                    mode="<%=SelectSiteTag.MODE_MEDIA%>"
                    includeLibrarySites="true"
                    includeTextbookSites="true"
                    includeMediaSites="false"
                    includeAssetSites="true"
                    />
            </td>
        </base:isDistrictUserLoggedIn>
        <base:isNotDistrictUserLoggedIn>
            <td align="center">
                <base:selectSite 
                    name='<%= ListSitesForm.FIELD_SITE_ID %>' 
                    submitOnChange="false" 
                    selectedSiteID='<%= form.getSiteID().toString()%>' 
                    siteTypeID="<%=null%>" 
                    includeAllLibraries="false" 
                    mode="<%=SelectSiteTag.MODE_MEDIA%>"
                    includeLibrarySites="true"
                    includeTextbookSites="true"
                    includeMediaSites="true"
                    includeAssetSites="true"
                    />
            </td>
        </base:isNotDistrictUserLoggedIn>
    </tr>
    <tr>
        <td align="center">
            <base:okButton/>
        </td>
    </tr>
    <%} else { %>
    <tr>
    <td>&nbsp;</td>
    <td colspan="2" align="center">
        <% 
            String message = System.getProperty(DestinySystemProperties.PROPERTY_DISABLED_DISTRICT_MESSAGE);
            
            if (message == null) {
                message = "Our records indicate your subscription has currently expired.<ul><li>Please contact Follett Customer Service at " +
                            System.getProperty(DestinyConfigProperties.PROPERTY_TECH_SUPPORT_PHONE_NUMBER_MESSAGE, "1-888-511-5114") + "for assistance.";
            }
        %>
        <base:messageBox header="<%= message %>" showWarningIcon="true" filterMessage="false"/>
    </td>
    </tr>
    
    <%} %>
 </table>
</base:form>   
