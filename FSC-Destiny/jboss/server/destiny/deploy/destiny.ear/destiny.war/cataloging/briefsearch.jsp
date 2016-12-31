<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c"%>


<%@ page import="com.follett.fsc.destiny.client.common.data.*"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.util.*"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.SiteTypeSpecs" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.SearchHistorySpecs"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%
    BriefSearchForm form = (BriefSearchForm)request.getAttribute( "cataloging_servlet_BriefSearchForm" );
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    
    List keywordList = (List) request.getAttribute("MyKeywordList");
    boolean haveResults = false;
    if ( keywordList != null ) {
        haveResults = (keywordList.size() > 0);
        if (!haveResults) {
%>
        <table id='<%=BaseSearchResultsForm.TABLE_PAGING_HEADER%>' width="100%">
        <tr>
            <td class="ColRowBold">
                <bean:write name="cataloging_servlet_BriefSearchForm" property="searchDescription"/>
            </td>
        </tr>
        </table>
    <%
        }
    }
    %>

<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handlebriefsearchform.do" focus="callnumberFrom">
<% request.setAttribute("parentFormName", BriefSearchForm.FORM_NAME); %>

<jsp:include page="/cataloging/basesearchresults.jsp" flush="true" />

<% if (keywordList == null || keywordList.size() == 0) { %>

   <base:outlinedTableWithTabsForBaseSearch 
   id="<%=AdvancedSearchRedirectorForm.TABLE_LIBRARY_SEARCH_TABS%>"  
   borderColor="#C0C0C0" selectedTab="<%=BriefSearchForm.ID_TAB_BRIEF_SEARCH%>" 
   tabs="<%=(Tab[])store.getAdvanceSearchTabArray()%>" 
   top10Link="<%=form.getTopTenTitles()%>"
  searchGroup="<%=new Integer(SearchHistorySpecs.SEARCH_GROUP_LIBRARY) %>"   
   >
     <tr>
       <td>
            <table id="<%=BriefSearchForm.TABLE_BRIEF_SEARCH%>" border="0" cellpadding="2" cellspacing="0">
              <tr>
                <td class="FormLabel" colspan="2"><%= MessageHelper.formatMessage("briefsearch_FindBriefRecords") %></td>
              </tr>
              <tr>
                  <td class="FormLabel tdAlignRight" nowrap>&nbsp;<%= MessageHelper.formatMessage("briefsearch_find_brief_records_FromCallNumber_callnumber_to_callnumber") %></td>
                  <td class="FormLabel">
                                <html:text property="<%=BriefSearchForm.FIELD_CALLNUMBER_FROM%>" size="10" maxlength="20"/>
                                &nbsp;<%= MessageHelper.formatMessage("briefsearch_To") %>&nbsp;
                                <html:text property="<%=BriefSearchForm.FIELD_CALLNUMBER_TO%>" size="10" maxlength="20"/>
                        <logic:equal name="<%= BriefSearchForm.FORM_NAME %>" property="districtCataloger" value="false">
                            <base:spanIfAllowed permission='<%= Permission.CAT_SEARCH_DISTRICT %>'>
                               	<% if ( store.isMediaBookingUser() ) {%>
                        	       	<logic:equal name="<%= BriefSearchForm.FORM_NAME %>" property="displayMediaDropDown" value="true">
                	                    &nbsp;<%= MessageHelper.formatMessage("briefsearch_In") %>&nbsp;
                                        <bean:define id="mediaSiteList" name="<%= BriefSearchForm.FORM_NAME %>" property="mediaSiteList"/>
                			            <html:select property="<%= BriefSearchForm.FIELD_SITE_ID %>">
                                            <html:options collection="mediaSiteList" property="siteID" labelProperty="siteName"/>
                                        </html:select>
                        	       	</logic:equal>
                                    &nbsp;
                        	       	<html:hidden property="siteTypeID"/>
                               	<% } %>
                               	<% if ( !store.isMediaBookingUser() ) { %>
                                    &nbsp; <%= MessageHelper.formatMessage("briefsearch_In") %>&nbsp;
                                    <base:selectSiteType
                                                name="<%=form.FIELD_SITE_TYPE_ID%>"
                                                selectedSiteTypeID="<%=form.getSiteTypeID()%>"
                                                mode="<%=LookupSpecs.MODE_SEARCH %>"
                                                includeForMediaSites="false" includeForLibrarySites="true" includeForTextbookSites="false" includeForAssetSites="false"/>
                                    &nbsp;
                                    <base:spanIfNotAllowed permission='<%= Permission.CAT_SEARCH_DISTRICT %>'>
                                        <!-- I cannot search the district so default the selection to My Library-->
                                        <html:hidden property="<%= BriefSearchForm.FIELD_SITE_TYPE_ID %>" value="<%= SiteTypeSpecs.SITE_TYPE_ID_MY_LIBRARY.toString() %>" />
                                    </base:spanIfNotAllowed>
                               	<% } %>
                            </base:spanIfAllowed>
                        </logic:equal>
                        <logic:equal name="<%= BriefSearchForm.FORM_NAME %>" property="districtCataloger" value="true">
                            <!-- I am a district cataloger -->
                            <html:hidden property="<%= BriefSearchForm.FIELD_SITE_TYPE_ID %>" value="<%= SiteTypeSpecs.SITE_TYPE_ID_ALL_LIBRARIES.toString() %>" />
                        </logic:equal>

                    &nbsp;
                    <base:goButton name="<%= BriefSearchForm.ID_BUTTON_SEARCH %>" absbottom="true"/>
                  </td>
              </tr>
             <tr>
               <td>
                   &nbsp;
               </td>
                <td class="Instruction">
                  <%= MessageHelper.formatMessage("briefsearch_ToSpecifyACallNumberRangeEnterAtLeastTheFirstDigits") %></td>
             </tr>
             </table>
        </td>
    </tr>
    </base:outlinedTableWithTabsForBaseSearch>
<% } else { %>
       <html:hidden property="<%=BriefSearchForm.FIELD_CALLNUMBER_FROM%>"/>
	   <html:hidden property="<%=BriefSearchForm.FIELD_CALLNUMBER_TO%>"/>
	   <html:hidden property="<%= BriefSearchForm.FIELD_SITE_TYPE_ID %>"/>
<% }%>
</base:form>
