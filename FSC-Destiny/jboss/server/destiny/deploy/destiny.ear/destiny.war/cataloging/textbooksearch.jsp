<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.util.*"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.SiteTypeSpecs" %>


<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%><bean:define id="searchOptions" name="cataloging_servlet_TextbookSearchForm" property="searchOptions"/>

<%
    TextbookSearchForm form = (TextbookSearchForm)request.getAttribute( TextbookSearchForm.FORM_NAME );
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);

    List keywordList = (List) request.getAttribute("MyKeywordList");
    boolean haveResults = (keywordList != null) && (keywordList.size() > 0);

    String focusControl = TextbookSearchForm.FIELD_KEYWORD_TEXT;

    if ( haveResults) {
        // we don't want to focus on anything in the form if we've got results or if we aren't displaying search criteria
        focusControl = "";
    }

    request.setAttribute("parentFormName", "cataloging_servlet_TextbookSearchForm");
%>

<base:messageBox strutsErrors="true"/>
<base:form action="/cataloging/servlet/handletextbooksearchform.do" styleId="keywordList" focus="<%=focusControl%>">
<jsp:include page="/cataloging/basesearchresults.jsp" flush="true" />

<base:outlinedTableWithTabsForBaseSearch 
    id="<%=AdvancedSearchRedirectorForm.TABLE_LIBRARY_SEARCH_TABS%>"  
    borderColor="#C0C0C0" 
    selectedTab="<%=TextbookSearchForm.ID_TAB_BASIC_SEARCH %>" 
    tabs="<%=TextbookNavigatorForm.getTabs(form.getSessionStore())%>" 
    top10Link="<%=null%>">
<tr><td valign="top" width="100%">
<a name="refinesearch"></a>
<html:hidden property="descend"/>
<html:hidden property="dateDescend"/>

    <table id="<%= TextbookSearchForm.TABLE_SEARCH_CRITERIA %>" border="0" cellpadding="2" cellspacing="0">
            <tr>
                <td class="FormLabel">
                    Find&nbsp;
                </td>
                <td class="ColRow" valign="bottom">
                    <html:select property="<%=TextbookSearchForm.FIELD_SEARCH_OPTION%>">
                        <html:options collection="searchOptions" property="stringCode" labelProperty="stringDesc"/>
                    </html:select>
                    <html:text property="<%=TextbookSearchForm.FIELD_KEYWORD_TEXT%>" size="41"/>
                    <base:goButton absbottom="true"  name="<%=TextbookSearchForm.BUTTON_GO%>"/>
                </td>
            </tr>
            <logic:equal name="<%= TextbookSearchForm.FORM_NAME %>" property="districtCataloger" value="false">
            <tr>
                <td class="FormLabel">
                    &nbsp;
                </td>
                <td valign="bottom">
                    <base:spanIfAllowed permission='<%= Permission.CAT_SEARCH_DISTRICT_TEXTBOOK %>'>
                        <span class="FormLabel">Look in:&nbsp;</span>
                            <base:selectSiteType
                                    name="<%=TextbookSearchForm.FIELD_SITE_TYPE_ID%>"
                                    selectedSiteTypeID="<%=form.getSiteTypeID()%>"
                                    mode="<%=LookupSpecs.MODE_SEARCH %>"
                                    includeForMediaSites="false" includeForLibrarySites="false"
                                    includeForTextbookSites="true"
                                    includeForAssetSites="false"
                                    />
                    </base:spanIfAllowed>
                    <base:spanIfNotAllowed permission='<%= Permission.CAT_SEARCH_DISTRICT_TEXTBOOK %>'>
                        <!-- I cannot search the district -->
                        <html:hidden property="<%= TextbookSearchForm.FIELD_SITE_TYPE_ID %>" value="<%=SiteTypeSpecs.SITE_TYPE_ID_MY_LIBRARY.toString()%>" />
                    </base:spanIfNotAllowed>
                </td>
            </tr>
            </logic:equal>
            <logic:equal name="<%= TextbookSearchForm.FORM_NAME %>" property="districtCataloger" value="true">
                <!-- I am a district cataloger -->
                <html:hidden property="<%= TextbookSearchForm.FIELD_SITE_TYPE_ID %>" value="<%=SiteTypeSpecs.SITE_TYPE_ID_ALL_LIBRARIES.toString()%>" />
            </logic:equal>
            <tr>
                <td>&nbsp;</td>
                <td class="ColRow">
                <html:checkbox property="<%=TextbookSearchForm.FIELD_TEACHERS_EDITION %>"></html:checkbox>Include Teachers' Editions&nbsp;&nbsp;&nbsp;
                <html:checkbox property="<%=TextbookSearchForm.FIELD_KITS %>"></html:checkbox>Include Resource Kits
                <% if(store.isStateRepositoryRunning()) { %>
                   &nbsp;&nbsp;&nbsp;<html:checkbox property="<%=TextbookSearchForm.FIELD_BUNDLES %>"></html:checkbox>Include Bundles
                <% } %>
                </td>
            </tr>
    </table>
    </td></tr>
    </base:outlinedTableWithTabsForBaseSearch>
</base:form>
