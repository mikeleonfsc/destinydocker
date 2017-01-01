<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib prefix="c" uri="/WEB-INF/jstl-core.tld" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.*"%>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@ page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>


<%@page import="com.follett.fsc.destiny.session.cataloging.ejb.data.VopacLimiterSet"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.BookListForm"%>
<%@page import="com.follett.fsc.destiny.client.filters.VersionFilter"%>
<%@page import="com.follett.fsc.destiny.entity.AdvancedSearchQueryData"%>

<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.BaseSearchResultsForm"%>
<%
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    String directionality = lh.getWebPageDirectionality();
%>

<html dir="<%=directionality%>" >

<%
	SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    String formName = (String)request.getAttribute(GenericForm.PRINTER_FRIENDLY_CONTENT_FORM);
    BaseListForm form = (BaseListForm)request.getAttribute(formName);
    
    int digitalContentMode = AdvancedSearchQueryData.SEARCH_TITLE_RECORDS_AND_DIGITAL_RESOURCES_LOCAL;
    if (form instanceof BaseSearchResultsForm) {
        digitalContentMode = ((BaseSearchResultsForm) form).getDigitalContentMode();
    }

    int itemsInList = form.getTotalCount();
    int currentPage = PageCalculator.getCurrentPage(form);
    int itemsToSkip = PageCalculator.getFirstNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
    int itemsToPrint = PageCalculator.getOnePastLastNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
%>

<head>
    <title><%= form.getPageTitle() %></title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <link rel="stylesheet" type="text/css" href="<%=VersionFilter.getDestinyCSSVersionedFile() %>" />
</head>

<body bgcolor="#FFFFFF" class="<%=store.getStyleClass()%>">
<div id="viewTypeElem" class='<%=form.isElementaryMode() ? "viewTypeElem": "" %>'>

<table id="searchSummary" cellspacing="0" cellpadding="2" width="100%">
<% if (form.isVopac() && form instanceof BookListForm) { %>
    <tr>
        <td class="TableHeading">
            <c:out value="<%=((BookListForm)form).getReportTitle()%>"/>
        </td>
    </tr>
<% } %>
<tr>
    <% if (form.isElementaryMode()) { %>
    <td align="center">
        <base:searchSummary searchType='<%=form.getSearchQuantityPrompt()%>'
            startOfSet  ='<%="" + ( itemsToSkip + 1 ) %>'
            endOfSet    = '<%="" + ( itemsToPrint )%>'
            totalInSet  = '<%="" + ( itemsInList )%>'
            tooManyHits = 'false'
            rowClass = "ColRowBold" />
     <% } else { %>
    <td>
        <base:searchSummary searchType='<%=form.getSearchQuantityPrompt()%>'
            startOfSet  ='<%="" + ( itemsToSkip + 1 ) %>'
            endOfSet    = '<%="" + ( itemsToPrint )%>'
            totalInSet  = '<%="" + ( itemsInList )%>'
            tooManyHits = 'false' />
     <% } %>
    </td>
</tr>
</table>

<!-- Now output the actual printable data -->
<% if (form.getCollectionType() == CollectionType.ONESEARCH || form.getCollectionType() == CollectionType.WPE) { %>
    <% if (form.isVopac() && form.getStore().getVopacSearchType() == VopacLimiterSet.WPE) { %>
	   <jsp:include page="/cataloging/vopacwperesourceslist.jsp"/>
    <% } else { %>
	   <jsp:include page="/cataloging/onlineresourceslist.jsp"/>
    <% } %>
<% } else { %>
    <% if (form.isElementaryMode()) { %>
    	<jsp:include page="/common/titlelist_elem.jsp">
    		<jsp:param name="formName" value="<%=formName%>"/>
    	</jsp:include>
    <% } else { %>
    	<jsp:include page="/common/titlelist.jsp">
    		<jsp:param name="formName" value="<%=formName%>"/>
    	</jsp:include>
    <% } %>
<% } %>
</div>
</body>
</html>
