<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.BrowseAssetsForm" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.AssetSearchNavigationForm" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LookupSpecs" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ page import="java.util.List" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>

<%
    BrowseAssetsForm form = (BrowseAssetsForm)request.getAttribute(BrowseAssetsForm.FORM_NAME);
    List keywordList = (List) request.getAttribute("MyKeywordList");
    boolean haveResults = (keywordList != null) && (keywordList.size() > 0);

    request.setAttribute("parentFormName", "cataloging_servlet_BrowseAssetsForm");
%>

<base:form action="/cataloging/servlet/handlebrowseassetsform.do" styleId="keywordList">

	<jsp:include page="/cataloging/basesearchresults.jsp" flush="true" />
	<a name="refinesearch"></a>
	<html:hidden property="descend"/>
	<html:hidden property="dateDescend"/>
	<html:hidden property="lastSort"/>
	<html:hidden property="<%=BrowseAssetsForm.FIELD_SITETYPE_CHANGED%>"/>
	<html:hidden property="<%=BrowseAssetsForm.FIELD_ASSET_TEMPLATE_ID%>"/>
	<html:hidden property="<%=BrowseAssetsForm.PARAM_SELECT_ONLY%>"/>
	<html:hidden property="<%=BrowseAssetsForm.PARAM_TO_RETURN%>"/>
	<html:hidden property="<%=BrowseAssetsForm.PARAM_CLOSEDIDS_AS_STRING%>"/>

	<base:outlinedTableAndTabsWithinThere id="<%=BrowseAssetsForm.TABLE_MAIN%>"  borderColor="#C0C0C0" selectedTab="<%=BrowseAssetsForm.TAB%>" selectedTabID="<%=AssetSearchNavigationForm.ID_TAB_BROWSE_ASSETS%>" tabs="<%=AssetSearchNavigationForm.getTabs(form.getSessionStore(),form.getSelectOnly())%>" >

		<base:spanIfAllowed permission="<%=Permission.CAT_ASSET_SEARCH_ALL_ASSET_SITES%>">	
			<tr>
				<td class="ColRowBold">Look in</td>
	    		<td>
	    			<base:isDistrictUser>
				                <base:selectSiteAndSiteType 
			                	name="<%= BrowseAssetsForm.FIELD_SITE_LIMITER%>" 
			                	selectedSiteID="<%=form.getSiteLimiter()%>"
			                	includeForLibrarySites="false"
			                	includeForTextbookSites="false"
			                	includeForAssetSites="true"
            					onChangeAction="siteTypeSelected()" />
					</base:isDistrictUser>
					<base:isNotDistrictUser>
						<base:selectSiteType
								name="<%=BrowseAssetsForm.FIELD_SITE_TYPE_ID%>"
								selectedSiteTypeID="<%=form.getSiteTypeID()%>"
								mode="<%=LookupSpecs.MODE_SEARCH_INCLUDE_UNASSIGNED %>"
			     				includeForMediaSites="false" 
			       				includeForLibrarySites="false" 
			       				includeForTextbookSites="false"
			       				includeForAssetSites="true"
			       				onChangeAction="siteTypeSelected()" />   
					</base:isNotDistrictUser>			       				         					
	    		</td>
			</tr>
			
			

			
		</base:spanIfAllowed>
	
        <tr>
			<td colspan="2" class="TableHeading" vAlign="top">For all resources under...</td>
        </tr>
		<tr>
			<td  colspan="2" width="100%">
			     <base:assetTypeSelector linkBase="<%=form.getLinkBase()%>" supressCheckboxesAndButtons="true" assetTree="<%=form.getAssetTree()%>" selectedAssets="<%=form.getAvailableTemplatesMap()%>" showCollapsibleTree="true" closedTemplateIDList="<%=form.getClosedTemplateIDList()%>"/>
			</td>
		</tr>	

	</base:outlinedTableAndTabsWithinThere>
</base:form>


<script language="JavaScript" type="text/javascript">
	<!--
	
	function siteTypeSelected() {
	    document.<%=BrowseAssetsForm.FORM_NAME%>.<%=BrowseAssetsForm.FIELD_SITETYPE_CHANGED%>.value = "true";
	    document.<%=BrowseAssetsForm.FORM_NAME%>.submit();
	}
	
	//-->
</script>

