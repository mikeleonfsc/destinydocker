<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator"%>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*"%>


<%@page import="com.follett.fsc.destiny.util.Permission"%>
<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@page import="com.follett.fsc.common.MessageHelper"%><base:messageBox strutsErrors="true" />

<script language="JavaScript" type="text/javascript">
  <!--
   function openWindow(url,name,features) {
         var win = window.open(url,name,features);
   }
  // -->
</script>

<%
EnrichedContentSetupForm form = (EnrichedContentSetupForm)request.getAttribute(EnrichedContentSetupForm.FORM_NAME);
SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );
%>

<base:outlinedTableAndTabsWithinThere id="<%=EnrichedContentSetupForm.TABLE_MAIN%>"
    selectedTab="<%=EnrichedContentSetupForm.ID_TAB%>"
    tabs="<%=SearchSetupNavigationForm.getTabs(form.getSessionStore())%>" cellpadding="0">

<tr>
        <td class="TableHeading"><%=MessageHelper.formatMessage("enrichedcontentsetup_EnrichedContentSearchSetup") %></td>

        <td class="TableHeading">&nbsp;</td>
    </tr>
    <% if( store.canView(Permission.CAT_DIGITAL_RESOURCES_SETUP)&& form.canViewDigitalResources() ){ %>
    <tr>
        <td class="TableHeading" colspan="2">
        <base:imageLine height="1" width="100%" vspace="5" />
        </td>
    </tr>
        <tr>
            <td class="TableHeading2"><%=MessageHelper.formatMessage("enrichedcontentsetup_DigitalResourcesService") %>
            <base:helpTag helpFileName="t_set_up_digital_resources.htm"/>
            </td>
            <td class="TableHeading">
                <a id="<%=EnrichedContentSetupForm.LINK_EDIT_DATABASE%>" href="javascript:openWindow('<%= form.getDCPIEditURL() %>','<%=EnrichedContentSetupForm.PAGE_TITLE_DCPI%>','width=800,height=600,scrollbars=1')">
                    <base:image alt='<%=MessageHelper.formatMessage("enrichedcontentsetup_ConfigureDigitalResources") %>' src="/buttons/large/configure.gif" align="right"/>
                </a>
            </td>
        </tr>
        <tr>
            <td class="ColRow"><%=MessageHelper.formatMessage("enrichedcontentsetup_UseThisOptionToViewTheProvidersAndCollectionsYourSiteHasConfigured") %>
            <p>&nbsp;
            </td>
            <td>           
                <a href="/cataloging/servlet/presentsetupdcpiaccessform.do" id="<%=EnrichedContentSetupForm.ID_PERMISSIONS %>">
                    <base:image src="/buttons/large/permsnarrow.gif" alt='<%=MessageHelper.formatMessage("enrichedcontentsetup_ConfigurePermissions") %>' align="right"/>
                </a>
            </td>
        </tr>
    <%
        }
    %>
  <%
      if( store.canView(Permission.CAT_SETUP_ONE_SEARCH) && form.checkAllowOneSearch()){
  %>   
        
        <tr>
            <td class="TableHeading" colspan="2">
            <base:imageLine height="1" width="100%" vspace="5" />
            </td>
        </tr>
        <tr>
            <td class="TableHeading2">One Search Database Information
            <base:helpTag helpFileName="t_set_up_one_search.htm"/>
            </td>
            <td class="TableHeading">
               <a href="javascript:openWindow('<%=form.getOneSearchEditURL(true)%>','<%=EnrichedContentSetupForm.PAGE_TITLE_DATABASE%>','width=800,height=600,scrollbars=1')">
                <base:image src="/buttons/large/edit.gif" align="right" alt="<%=EnrichedContentSetupForm.LINK_EDIT_DATABASE%>"/>
              </a>
            </td>
        </tr>
        <tr>
            <td class="ColRow" colspan="2">Use this option to view the databases
            your site currently has configured, to edit configured databases, or to
            add new databases.
            <p>&nbsp;
            </td>
        </tr>
    
        <tr>
            <td class="TableHeading2">IP Verified Subscriptions</td>
            <td class="TableHeading">
              <a href="javascript:openWindow('<%=form.getOneSearchEditURL(false)%>','<%=EnrichedContentSetupForm.PAGE_TITLE_SUBSRIPTION%>','width=800,height=600')">
                <base:image src="/buttons/large/edit.gif" align="right" alt="<%=EnrichedContentSetupForm.LINK_EDIT_SUBSCRIPTON%>"/>
              </a>
            </td>
        </tr>
        <tr>
            <td class="ColRow" colspan="2">If you will be using IP verified
            subscriptions, enter the path to the FSCProxy.PL host script on your web
            server.
            <p>&nbsp;
            </td>
        </tr>
        
    <%} %>
      <% if( store.canView(Permission.CAT_SETUP_WEB_PATH_EXPRESS) && form.checkAllowWebPathExpressSearch()){ %>   
        <tr>
            <td class="TableHeading" colspan="2">
            <base:imageLine height="1" width="100%" vspace="5"/>
            </td>
        </tr>
    
        <tr>
            <td class="TableHeading2">WebPath Express Settings
            <base:helpTag helpFileName="t_set_up_webpath_express.htm"/>
            </td>
            <td class="TableHeading">
               <a href="javascript:openWindow('<%= form.getWPEEditURL()%>','<%=EnrichedContentSetupForm.WPE_PAGE_TITLE_SETUP%>','width=800,height=600,scrollbars=1')">
                <base:image src="/buttons/large/edit.gif" align="right" alt="<%=EnrichedContentSetupForm.LINK_EDIT_SETUP%>"/>
              </a>
            </td>
        </tr>
        <tr>
            <td class="ColRow" colspan="2">Use this option to determine students' default access to WebPath Express sites by grade level and ability to access other grade levels.
            </td>
        </tr>
    <%} %>
</base:outlinedTableAndTabsWithinThere>
