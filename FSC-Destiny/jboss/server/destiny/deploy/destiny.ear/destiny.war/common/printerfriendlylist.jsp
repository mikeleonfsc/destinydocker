<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.*"%>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@ page import="com.follett.fsc.destiny.client.filters.VersionFilter"%>




<html:html>

<%
	SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    String formName = (String)request.getAttribute(GenericForm.PRINTER_FRIENDLY_CONTENT_FORM);
    BaseListForm form = (BaseListForm)request.getAttribute(formName);

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

<body bgcolor="#FFFFFF" class="<%=store.getStyleClass() %>">

<table id="searchSummary" cellspacing="0" cellpadding="2" >
<tr>
    <td>Hello!!
        <base:searchSummary searchType='<%=form.getSearchQuantityPrompt()%>'
            startOfSet  ='<%="" + ( itemsToSkip + 1 ) %>'
            endOfSet    = '<%="" + ( itemsToPrint )%>'
            totalInSet  = '<%="" + ( itemsInList )%>'
            tooManyHits = 'false' />
    </td>
</tr>
</table>

<!-- Now output the actual printable data -->
<% form.outputList(pageContext); %>


</body>
</html:html>
