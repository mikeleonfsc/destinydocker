<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c"%>



<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.data.Tab" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.SearchHistorySpecs"%>

<%@ page import="java.util.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<base:messageBox strutsErrors="true"/>

<%
    BarcodeSearchForm form = (BarcodeSearchForm)request.getAttribute( "cataloging_servlet_BarcodeSearchForm" );
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    
    List keywordList = (List) request.getAttribute("MyKeywordList");
    request.setAttribute("parentFormName", "cataloging_servlet_BarcodeSearchForm");

%>

<base:form action="/cataloging/servlet/handlebarcodesearchform.do" focus="barcodeText">

<jsp:include page="/cataloging/basesearchresults.jsp" flush="true" />

<% if (keywordList == null || keywordList.size() == 0) { %>

       <base:outlinedTableWithTabsForBaseSearch 
       id="<%=AdvancedSearchRedirectorForm.TABLE_LIBRARY_SEARCH_TABS%>"  
       borderColor="#C0C0C0" selectedTab="<%=BarcodeSearchForm.ID_TAB_BARCODE_SEARCH%>" 
       tabs="<%=(Tab[])store.getAdvanceSearchTabArray()%>" 
       top10Link="<%=form.getTopTenTitles()%>"
       searchGroup="<%=new Integer(SearchHistorySpecs.SEARCH_GROUP_LIBRARY) %>"
       >
         <tr>
           <td align="center">
                <table id=<%=BarcodeSearchForm.TABLE_BARCODE_SEARCH%> border="0" cellpadding="0" cellspacing="0">
                    <tr>
                        <td class="FormLabel"><%= MessageHelper.formatMessage("barcodesearch_Find") %></td>
                        <td>
                            &nbsp;
                            <html:text property="<%=BarcodeSearchForm.FIELD_BARCODE_TEXT%>" size="25"/>
                        </td>
                        <td>
                            &nbsp;
                            <base:goButton/>
                        </td>
                        <td>
                            &nbsp;
                            <base:helpTag helpFileName="t_search_by_barcode_LM_MM.htm"/>
                        </td>
                    </tr>
                </table>
           </td>
         </tr>
       </base:outlinedTableWithTabsForBaseSearch>
<% } else { %>
    <html:hidden property="<%=BarcodeSearchForm.FIELD_BARCODE_TEXT%>" />
<% } %>
</base:form>


