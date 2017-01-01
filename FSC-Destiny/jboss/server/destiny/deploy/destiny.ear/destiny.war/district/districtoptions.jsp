<%@page import="com.follett.fsc.destiny.client.common.CallAASPRegistrationServlet"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.DistrictTabHelper"%>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="com.follett.fsc.common.consortium.ContextManager"%>
<%@page import="com.follett.fsc.common.LocaleHelper"%>

<base:messageBox strutsErrors="true"/>

<%
    DistrictOptionsForm form = (DistrictOptionsForm)request.getAttribute(DistrictOptionsForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    String param ="";
%>

    <logic:equal name="<%=DistrictOptionsForm.FORM_NAME%>" property="<%=GenericDistrictForm.KEY_SHOW_FOLLETT_SHELF_MESSAGE %>" value="true">
        <jsp:include page="/district/fsmessagebox.jsp">
            <jsp:param name="formName" value="districtoptionsform"/>
        </jsp:include>
    </logic:equal>

<base:form action="/district/servlet/handledistrictoptionsform.do">
<html:hidden property="canRunDistrictCalendar"/>
<html:hidden property="<%=GenericDistrictForm.KEY_SHOW_AASP_MESSAGE %>" />
    <logic:equal name="<%=DistrictOptionsForm.FORM_NAME%>" property="<%=GenericDistrictForm.KEY_SHOW_AASP_MESSAGE %>" value="true">
        <jsp:include page="/common/aaspmessagebox.jsp">
            <jsp:param name="formName" value="districtoptionsform"/>
        </jsp:include>
    </logic:equal>

  <% // This table can't be less than 100% or the tabs will be misaligned %>
<%
    String msg = GenericForm.getSQLAndAppServerTimeOutOfSyncMsg();
    if (msg != null) {
%>
    <center><span class="ColRowBold"><%= msg %></span></center><BR>
<%  } %>    
<center><span class="ColRowBold"><%= GenericForm.getLastBackupDisplayMsg(false) %></span></center><br>
<jsp:include page="/common/msdewarning.jsp" flush="true" />
  <table align="center" width="95%"><tr><td>
<base:outlinedTableAndTabsWithinThere id="<%=DistrictOptionsForm.TABLE_DISTRICT_OPTIONS%>" selectedTab="<%=DistrictOptionsForm.TAB%>" tabs="<%=DistrictTabHelper.getDisplayableTabs(store)%>" align="center" width="100%">

    <tr>
		<td background="/images/icons/general/thickline.gif" height="18" width="100%" style="background-repeat:repeat-x;"  >
            &nbsp;<span class="SectionHeader">Access Levels </span>
        </td>
		<td height="18">
            <base:link page="/backoffice/servlet/presentviewaccesslevelsform.do?districtMode=true" id="<%=DistrictOptionsForm.ID_BUTTON_ACCESS_LEVELS %>">
                <base:image src="/buttons/large/edit.gif" alt="<%=DistrictOptionsForm.ALT_BUTTON_ACCESS_LEVELS %>" align="absbottom"/>
            </base:link>
        </td>
    </tr>
    <tr>
        <td class="ColRow">
            <ul><li><bean:write name="<%= DistrictOptionsForm.FORM_NAME %>" property="accessLevelsMessage"/></li></ul>
            <br>
        </td>
        <td class="ColRow tdAlignRight">&nbsp;</td>
    </tr>
    
    <% if(form.isCanRunFollettShelfAutoDiscover()) { %>
    <tr>
        <td background="/images/icons/general/thickline.gif" height="18" width="100%" style="background-repeat:repeat-x;" >
            &nbsp;<span class="SectionHeader">Connect to Follett Shelf</span>
        </td>
        <td height="18">
            <base:link page="/backoffice/servlet/presentautodiscoverfollettshelfform.do?districtMode=true" id="<%=DistrictOptionsForm.ID_BUTTON_AUTO_CONFIG_SHELF %>">
                <base:image src="/buttons/large/edit.gif" alt="<%=DistrictOptionsForm.ALT_BUTTON_AUTO_CONFIG_SHELF %>" align="absbottom"/>
            </base:link>
        </td>
    </tr>
    
    <tr>
        <td class="ColRow">
            <ul><li>Connect sites to Follett Shelf based on the Follett eBooks which currently exist in your district.</li></ul>
            <br>
        </td>
        <td class="ColRow tdAlignRight">&nbsp;</td>
    </tr>
    <% } %>
    
    <% if(form.isCanRunResourceManagerConversion()) { %>
    <tr>
        <td background="/images/icons/general/thickline.gif" height="18" width="100%" style="background-repeat:repeat-x;" >
            &nbsp;<span class="SectionHeader">Transition to Resource Manager</span>
        </td>
        <td height="18">
            <base:link page="/district/servlet/presentconverttoresourcemanagerform.do?districtMode=true" id="<%=DistrictOptionsForm.ID_BUTTON_CONVERT_TO_RM %>">
                <base:image src="/buttons/large/edit.gif" alt="<%=DistrictOptionsForm.ALT_BUTTON_CONVERT_TO_RM %>" align="absbottom"/>
            </base:link>
        </td>
    </tr>
    
    <tr>
        <td class="ColRow">
            <ul><li>Perform a check to determine if the system is ready to transition from Destiny Textbook Manager to Destiny Resource Manager.</li></ul>
            <br>
        </td>
        <td class="ColRow tdAlignRight">&nbsp;</td>
    </tr>
    <% } %>
    
    <tr>
        <td background="/images/icons/general/thickline.gif" height="18" width="100%" style="background-repeat:repeat-x;" >
            &nbsp;<span class="SectionHeader">District Calendar</span>
        </td>
        <% if(form.isCanRunDistrictCalendar()) { %>
            <td height="18">
                <base:link page="/backoffice/servlet/presentcalendarform.do?districtMode=true" id="<%=DistrictOptionsForm.ID_BUTTON_DISTRICT_CALENDAR %>">
                    <base:image src="/buttons/large/edit.gif" alt="<%=DistrictOptionsForm.ALT_BUTTON_DISTRICT_CALENDAR %>" align="absbottom"/>
                </base:link>
            </td>
        <% } else {%>
            <td background="/images/icons/general/thickline.gif" height="18" width="100%" style="background-repeat:repeat-x;" >
                &nbsp;
            </td>
        <% } %>
    </tr>
    <% if(!form.isCanRunDistrictCalendar()) { %>
    <tr>
        <td class="Instruction">
            The district calendar is disabled when there are no sites in the district.
        </td>
    </tr>
    <% } %>
    <tr>
        <td class="ColRow">
            <ul><li>Calendar can be set up here for the entire district, but can be managed by the sites.</li></ul>
            <br>
        </td>
        <td class="ColRow tdAlignRight">&nbsp;</td>
    </tr>
    
    <tr>
        <td background="/images/icons/general/thickline.gif" height="18" width="100%" style="background-repeat:repeat-x;" >
            &nbsp;<span class="SectionHeader">District &quot;Stop&quot; Words </span>
        </td>
        <td height="18">
            <base:link page="/district/servlet/presentstopwordscatalogform.do?districtMode=true" id="<%=DistrictOptionsForm.ID_BUTTON_STOP_WORDS %>">
                <base:image src="/buttons/large/edit.gif" alt="<%=DistrictOptionsForm.ALT_BUTTON_STOP_WORDS %>" align="absbottom"/>
            </base:link>
        </td>
    </tr>
    <tr>
        <td class="ColRow">
            <ul><li>Default &quot;stop&quot; words for searching by keywords are set here.</li></ul>
            <br>
        </td>
        <td class="ColRow tdAlignRight">&nbsp;</td>
    </tr>

    <tr>
		<td background="/images/icons/general/thickline.gif" height="18" width="100%" style="background-repeat:repeat-x;" >
            &nbsp;<span class="SectionHeader">Site Configuration Settings </span>
        </td>
		<td height="18">
            <base:link page="/district/servlet/presentsiteconfigurationcatalogsettingsform.do?districtMode=true" id="<%=DistrictOptionsForm.ID_BUTTON_SITE_CONFIG %>">
                <base:image src="/buttons/large/edit.gif" alt="<%=DistrictOptionsForm.ALT_BUTTON_SITE_CONFIG %>" align="absbottom"/>
            </base:link>
        </td>
    </tr>
    <tr>
        <td class="ColRow">
            <ul><li>Default Catalog and Circulation configuration options can be set and pushed from here, but are managed by the sites.</li></ul>
            <br>
        </td>
        <td class="ColRow tdAlignRight">&nbsp;</td>
    </tr>
    
    <tr>
        <td background="/images/icons/general/thickline.gif" height="18" width="100%" style="background-repeat:repeat-x;" >
            &nbsp;<span class="SectionHeader">One Search Database Information</span>
        </td>
        <td height="18">
            <base:link page="/district/servlet/presentonesearchdistrictpushform.do" id="<%=DistrictOptionsForm.ID_BUTTON_ONE_SEARCH_SETUP %>">
                <base:image src="/buttons/large/edit.gif" alt="<%=DistrictOptionsForm.ALT_BUTTON_ONE_SEARCH_DATABASE_SETUP %>" align="absbottom"/>
            </base:link>
        </td>
    </tr>
    
    <tr>
        <td class="ColRow">
            <ul><li>One Search database information can be setup here for the entire district, but can be managed by the sites.</li></ul>
            <br>
        </td>
        <td class="ColRow tdAlignRight">&nbsp;</td>
    </tr>
    
    <tr>
        <td background="/images/icons/general/thickline.gif" height="18" width="100%" style="background-repeat:repeat-x;" >
            &nbsp;<span class="SectionHeader">Patron Types and Library Circulation Types</span>
        </td>
        <td height="18">
            <base:link page="/backoffice/servlet/presentviewpatrontypeform.do?distMode=true&collectionType=0" id="<%=DistrictOptionsForm.ID_BUTTON_LIBRARY_POLICY_SETTINGS %>">
                <base:image src="/buttons/large/edit.gif" alt="<%=DistrictOptionsForm.ALT_BUTTON_LIBRARY_POLICY_SETTINGS %>" align="absbottom"/>
            </base:link>
        </td>
    </tr>
    <tr>
        <td class="ColRow">
            <ul><li>Default Patron Types and Library Circulation Types can be set and pushed from here, but are managed by the sites.</li></ul>
            <br>
        </td>
        <td class="ColRow tdAlignRight">&nbsp;</td>
    </tr>
<% if (!LocaleHelper.isInternationalProduct()) { %>    
    <tr>
        <td background="/images/icons/general/thickline.gif" height="18" width="100%" style="background-repeat:repeat-x;" >
            &nbsp;<span class="SectionHeader">Textbook Policies</span>
        </td>
        <td height="18">
            <base:link page="/backoffice/servlet/presentviewtextbookloanpoliciesform.do?distMode=true&collectionType=1" id="<%=DistrictOptionsForm.ID_BUTTON_TEXTBOOK_POLICY_SETTINGS %>">
                <base:image src="/buttons/large/edit.gif" alt="<%=DistrictOptionsForm.ALT_BUTTON_TEXTBOOK_POLICY_SETTINGS %>" align="absbottom"/>
            </base:link>
        </td>
    </tr>
    <tr>
        <td class="ColRow">
            <ul><li>Default Loan Policies and Loan Periods can be set and pushed from here, but are managed by the sites.</li></ul>
            <br>
        </td>
        <td class="ColRow tdAlignRight">&nbsp;</td>
    </tr>
    <tr>
        <td background="/images/icons/general/thickline.gif" height="18" width="100%" style="background-repeat:repeat-x;" >
            &nbsp;<span class="SectionHeader">Resource Policies</span>
        </td>
        <td height="18">
            <base:link page="/backoffice/servlet/presentviewtextbookloanperiodsform.do?collectionType=4&distMode=true" id="<%=DistrictOptionsForm.ID_BUTTON_RESOURCE_POLICY_SETTINGS %>">
                <base:image src="/buttons/large/edit.gif" alt="<%=DistrictOptionsForm.ALT_BUTTON_RESOURCE_POLICY_SETTINGS %>" align="absbottom"/>
            </base:link>
        </td>
    </tr>
    <tr>
        <td class="ColRow">
            <ul><li>Default Loan Periods can be set and pushed from here, but are managed by the sites.</li></ul>
            <br>
        </td>
        <td class="ColRow tdAlignRight">&nbsp;</td>
    </tr>
<% } %>    

    <tr>
		<td background="/images/icons/general/thickline.gif" height="18" width="100%" style="background-repeat:repeat-x;" >
            &nbsp;<span class="SectionHeader">Limit Tasks </span>
        </td>
		<td height="18">
            <base:link page="/district/servlet/presentdistrictlimittaskform.do" id="<%=DistrictOptionsForm.ID_BUTTON_LIMIT_TASKS %>">
                <base:image src="/buttons/large/edit.gif" alt="<%=DistrictOptionsForm.ALT_BUTTON_LIMIT_TASKS %>" align="absbottom"/>
            </base:link>
        </td>
    </tr>
    <tr>
        <td class="ColRow">
            <bean:write name="<%= DistrictOptionsForm.FORM_NAME %>" property="limitTasksMessage" filter="false"/>
            <br>
        </td>
        <td class="ColRow tdAlignRight">&nbsp;</td>
    </tr>

    <tr>
		<td background="/images/icons/general/thickline.gif" height="18" width="100%" style="background-repeat:repeat-x;" >
            &nbsp;<span class="SectionHeader">LDAP Servers </span>
        </td>
		<td height="18">
            <base:link page="/district/servlet/presentldapsetupform.do" id="<%=DistrictOptionsForm.ID_BUTTON_LDAP_SERVERS %>">
                <base:image src="/buttons/large/edit.gif" alt="<%=DistrictOptionsForm.ALT_BUTTON_LDAP_SERVERS %>" align="absbottom"/>
            </base:link>
        </td>
    </tr>
    <tr>
        <td class="ColRow">
            <ul><li><bean:write name="<%= DistrictOptionsForm.FORM_NAME %>" property="LDAPMessage" filter="false"/></li></ul>
            <br>
        </td>
        <td class="ColRow tdAlignRight">&nbsp;</td>
    </tr>
    <tr>
		<td background="/images/icons/general/thickline.gif" height="18" width="100%" style="background-repeat:repeat-x;" >
            &nbsp;<span class="SectionHeader">SMTP Settings</span>
        </td>
		<td height="18">
            <base:link page="/common/servlet/presenteditsmtpoptionsform.do" id="<%=DistrictOptionsForm.ID_BUTTON_SMTP_OPTIONS %>">
                <base:image src="/buttons/large/edit.gif" alt="<%=DistrictOptionsForm.ALT_BUTTON_SMTP_OPTIONS %>" align="absbottom"/>
            </base:link>
        </td>
    </tr>
    <tr>
        <td class="ColRow">
            <ul><li>Manage the SMTP Settings.</li></ul>
            <br>
        </td>
        <td class="ColRow tdAlignRight">&nbsp;</td>
    </tr>
    <% if(form.isSSOOnly()) { %>
    <tr>
        <td background="/images/icons/general/thickline.gif" height="18" width="100%" style="background-repeat:repeat-x;" >
            &nbsp;<span class="SectionHeader">Block Override Code</span>
        </td>
        <td height="18">
            <base:link page="/common/servlet/presenteditblockoverridecodeform.do" id="<%=DistrictOptionsForm.ID_BUTTON_BLOCKOVERRIDECODE_OPTIONS %>">
                <base:image src="/buttons/large/edit.gif" alt="<%=DistrictOptionsForm.ALT_BUTTON_BLOCKOVERRIDECODE_OPTIONS %>" align="absbottom"/>
            </base:link>
        </td>
    </tr>
    <tr>
        <td class="ColRow">
            <ul><li>The default Circulation Block Override Code can be set here, but can be managed by the sites.</li></ul>
            <br>
        </td>
        <td class="ColRow tdAlignRight">&nbsp;</td>
    </tr>    
    <% } %>
    <% if(!ContextManager.getContextManager().isInConsortiumMode()) { %>
        <tr>
            <td background="/images/icons/general/thickline.gif" height="18" width="100%" style="background-repeat:repeat-x;" >
                &nbsp;<span class="SectionHeader">Destiny Discover Settings</span>
            </td>
            <td height="18">
                <base:link page="/common/servlet/presenteditaaspoptionsform.do" id="<%=DistrictOptionsForm.ID_BUTTON_AASP_OPTIONS %>">
                    <base:image src="/buttons/large/edit.gif" alt="<%=DistrictOptionsForm.ALT_BUTTON_AASP_OPTIONS %>" align="absbottom"/>
                </base:link>
            </td>
        </tr>
        <tr>
            <td class="ColRow">
                <ul><li>Manage Destiny Discover Settings.</li></ul>
                <br>
            </td>
            <td class="ColRow tdAlignRight">&nbsp;</td>
        </tr>
    <% } %>
    
    <tr>
        <td background="/images/icons/general/thickline.gif" height="18" width="100%" style="background-repeat:repeat-x;" >
            &nbsp;<span class="SectionHeader">Digital Content Access</span>
        </td>
        <td height="18">
            <base:link page="/district/servlet/presentnetworkaccesssetupform.do" id="<%=DistrictOptionsForm.ID_BUTTON_NETWORK_ACCESS %>">
                <base:image src="/buttons/large/edit.gif" alt="<%=DistrictOptionsForm.ALT_BUTTON_NETWORK_ACCESS %>" align="absbottom"/>
            </base:link>
        </td>
    </tr>
    
    <tr>
        <td class="ColRow">
            <ul><li>As a default, all computers have access to digital content. Access to digital content can be granted and/or denied from here.</li></ul>
            <br>
        </td>
        <td class="ColRow tdAlignRight">&nbsp;</td>
    </tr>
    <tr>
		<td background="/images/icons/general/thickline.gif" height="18" width="100%" style="background-repeat:repeat-x;" >
            &nbsp;<span class="SectionHeader">Password Policies</span>
        </td>
		<td height="18">
            <base:link page="/common/servlet/presenteditpasswordpoliciesform.do" id="<%=DistrictOptionsForm.ID_BUTTON_PASSWORD_POLICIES %>">
                <base:image src="/buttons/large/edit.gif" alt="<%=DistrictOptionsForm.ALT_BUTTON_PASSWORD_POLICIES %>" align="absbottom"/>
            </base:link>
        </td>
    </tr>
    <tr>
        <td class="ColRow">
            <ul><li>Manage password policies.</li></ul>
            <br>
        </td>
        <td class="ColRow tdAlignRight">&nbsp;</td>
    </tr>
    <%-- Begin OAuth Consumer --%>
    <tr>
        <td background="/images/icons/general/thickline.gif" height="18" width="100%" style="background-repeat:repeat-x;" >
            &nbsp;<span class="SectionHeader">OAuth Consumers</span>
        </td>
        <td height="18">
            <base:link page="/district/servlet/presentoauthconsumerform.do" >
                <base:image src="/buttons/large/edit.gif" alt="<%=DistrictOptionsForm.ALT_BUTTON_OAUTH_CONSUMERS %>" align="absbottom"/>
            </base:link>
        </td>
    </tr>
    <tr>
        <td class="ColRow">
            <ul><li>Manage OAuth consumers.</li></ul>
            <br>
        </td>
        <td class="ColRow tdAlignRight">&nbsp;</td>
    </tr>
    <%-- End OAuth Consumer --%>
    <%--start server identity --%>
    
    <%--do not show for super admin --%>
     <% if (!store.isConsortiumAdmin()) { 
      //connection but not US endpoint 
       if( form.isAaspConnected() && !form.isUSEndpointConfigured()) {%>
        <tr>
        <td colspan="2" background="/images/icons/general/thickline.gif" height="18" width="100%" style="background-repeat:repeat-x;" >
             &nbsp;<span class="SectionHeader">Server Identity</span>
        </td>
    </tr>
    <tr>
        <td class="ColRow">
            <ul><li>Server Status: <%=form.getAaspRegistrationStatus() %>. &nbsp;&nbsp;&nbsp;Cannot determine server type due to invalid external URL/port.<br>
                        Please verify your <a href="/common/servlet/presenteditaaspoptionsform.do">Destiny Discover Settings</a></li></ul>
            <br>
        </td>
        <td class="ColRow tdAlignRight">&nbsp;</td>
    </tr>
     <% }
     
     else { 
         %>
    <tr>
        <td background="/images/icons/general/thickline.gif" height="18" width="100%" style="background-repeat:repeat-x;" >
            &nbsp;<span class="SectionHeader">Server Identity</span>
        </td>
       
        <% if( form.isAaspConnected()) {
                     // US is connected, launch registration servlet.
                      %>    
                      <td height="18">        
                    <base:link target="_blank" page="<%= CallAASPRegistrationServlet.buildReturnToUrl(request) %>" >
                        <base:image src="/buttons/large/edit.gif" alt="<%=DistrictOptionsForm.ALT_BUTTON_SERVER_IDENTITY %>" align="absbottom"/>
                    </base:link>
        </td>
                 
           <% } else { 
            //cant connect to AASP- 
           
                 %>
                    <td height="18">  
               <base:link page='<%= "?" + DistrictOptionsForm.BUTTON_EDIT_SERVER_IDENTITY + "="+ DistrictOptionsForm.PARAM_SHOW_AASP_NOT_REACHABLE %>' id="<%=DistrictOptionsForm.BUTTON_EDIT_SERVER_IDENTITY %>">
                <base:image src="/buttons/large/edit.gif" alt="<%=DistrictOptionsForm.ALT_BUTTON_SERVER_IDENTITY %>" align="absbottom"/>
            </base:link>
            
            
        </td>
            <% } %>
    <tr>
        <td class="ColRow">
            <ul><li>Server Status: <%=form.getAaspRegistrationStatus() %>.</li></ul>
            <br>
        </td>
        <td class="ColRow tdAlignRight">&nbsp;</td>
    </tr>
    </tr>
    
         <% } %>
      <% } %>
     
     

    <% if(store.isServerAdminLoggedIn() && ((UserContext.isInConsortium() && ContextManager.getContextManager().isInConsortiumMode()) || (!ContextManager.getContextManager().isInConsortiumMode()))) { %>
        <tr>
    		<td background="/images/icons/general/thickline.gif" height="18" width="100%" style="background-repeat:repeat-x;" >
                &nbsp;<span class="SectionHeader">Auto Update Settings</span>
            </td>
    		<td height="18">
                <base:link page="/common/servlet/presentscheduleautoupdateform.do" id="<%=DistrictOptionsForm.ID_BUTTON_AUTO_UPDATE_OPTIONS %>">
                    <base:image src="/buttons/large/edit.gif" alt="<%=DistrictOptionsForm.ALT_BUTTON_AUTO_UPDATE_OPTIONS %>" align="absbottom"/>
                </base:link>
            </td>
        </tr>
        <tr>
            <td class="ColRow">
                <ul><li>Manage the Auto Update Settings.</li></ul>
                <br>
            </td>
            <td class="ColRow tdAlignRight">&nbsp;</td>
        </tr>
    <% } %>
    <tr>
		<td colspan="2" background="/images/icons/general/thickline.gif" height="18" width="100%" style="background-repeat:repeat-x;" >
            &nbsp;<span class="SectionHeader">Downloads</span>
        </td>
    </tr>
    <tr>
        <td class="ColRow">
            <ul>
                <li>Commandline Utilities -- includes version of AssetImportConverter.exe,
                    UpdatePatrons.exe, UpdateClasses.exe, PatronImportConverter.exe,
                    ClassImportConverter.exe, ImportAssets.exe, ExportAssets.exe,
                    ImportFines.exe, ExportFines.exe, and TextbookTransfer.exe commandline utilities.
                    <base:link href="/CommandLineToolsDownloader" target="_blank">
                        <base:image name="<%=DistrictOptionsForm.ID_BUTTON_DOWNLOAD%>" src="/buttons/small/download.gif" align="bottom" alt="<%=DistrictOptionsForm.ALT_BUTTON_DOWNLOAD %>"></base:image>
                    </base:link>
                </li>
            </ul>
            <br>
        </td>
		<td>&nbsp;</td>
    </tr>


</base:outlinedTableAndTabsWithinThere>
</td></tr></table>

</base:form>


