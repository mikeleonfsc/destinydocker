<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c"%>


<%@ page import="com.follett.fsc.destiny.client.common.data.*"%>
<%@ page import="com.follett.fsc.destiny.session.cataloging.ejb.*"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.util.Permission"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.SearchHistorySpecs"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%
    NumberSearchForm form = (NumberSearchForm)request.getAttribute( NumberSearchForm.FORM_NAME );
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    
    String focusControl = NumberSearchForm.FIELD_SEARCH_TEXT;
    List keywordList = (List) request.getAttribute("MyKeywordList");
    boolean haveResults = (keywordList != null) && (keywordList.size() > 0);

    if (haveResults) {
        // we don't want to focus on anything in the form if we've got results
        focusControl = "";
    }
    request.setAttribute("parentFormName", "cataloging_servlet_NumberSearchForm");

    if (!StringHelper.isEmpty(form.getSearchText()) && !form.isFromInitialize() && !haveResults) {
%>
<br>
    <table width="100%">
    <tr>
        <td>
            <span class="ColRowBold">
            <bean:write name='<%=NumberSearchForm.FORM_NAME%>' property="searchDescription"/>
            </span>
        </td>
    </tr>
    </table>
<%
    }
%>

<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handlenumbersearchform.do" focus="<%=focusControl%>">

<jsp:include page="/cataloging/basesearchresults.jsp" flush="true" />

<% if (keywordList == null || keywordList.size() == 0) { %>

<base:outlinedTableWithTabsForBaseSearch id="<%=AdvancedSearchRedirectorForm.TABLE_LIBRARY_SEARCH_TABS%>"  
borderColor="#C0C0C0" 
selectedTab="<%=NumberSearchForm.ID_TAB_NUMBER_SEARCH%>" 
tabs="<%=(Tab[])store.getAdvanceSearchTabArray()%>" 
top10Link="<%=form.getTopTenTitles()%>"
searchGroup="<%=new Integer(SearchHistorySpecs.SEARCH_GROUP_LIBRARY) %>"
>
 <tr>
   <td align="center">
        <table id="<%=NumberSearchForm.TABLE_NUMBER_SEARCH%>" border="0" cellpadding="0" cellspacing="3" width="100%">
        <tr>
        	<td align="center">
        	<table>
        	<tr>
            <td class="FormLabel"><%= MessageHelper.formatMessage("numbersearch_Find") %>&nbsp;</td>
            <td class="FormLabel">
                <html:select property="<%= NumberSearchForm.FIELD_SEARCH_OPTION %>">
                       <!-- The type of searches available depend on the users permissions -->
                        <base:spanIfAllowed permission='<%= Permission.CAT_CALLNUMBER_SEARCH %>'>
                            <html:option value='<%= "" + KeywordSearchFacadeSpecs.TYPE_CALLNUMBER %>'><%= MessageHelper.formatMessage("numbersearch_CallNumber") %></html:option>
                        </base:spanIfAllowed>
                        <base:spanIfAllowed permission='<%= Permission.CAT_NUMBER_SEARCH %>'>
                            <html:option value='<%= "" + AllianceSearchFacadeSpecs.TYPE_LCCN %>'><%= MessageHelper.formatMessage("numbersearch_LCCN") %></html:option>
                            <html:option value='<%= "" + AllianceSearchFacadeSpecs.TYPE_ISBN %>'><%= MessageHelper.formatMessage("numbersearch_ISBN") %></html:option>
                            <html:option value='<%= "" + AllianceSearchFacadeSpecs.TYPE_ISSN %>'><%= MessageHelper.formatMessage("numbersearch_ISSN") %></html:option>
                            <html:option value='<%= "" + KeywordSearchFacadeSpecs.TYPE_CONTROLNUMBER %>'><%= MessageHelper.formatMessage("numbersearch_ControlNumber") %></html:option>
                        </base:spanIfAllowed>
                </html:select>&nbsp;
                <html:text property="<%= NumberSearchForm.FIELD_SEARCH_TEXT %>" size="25"/>
                &nbsp;

            </td>
            <td class="ColRow">
                &nbsp;
                <base:goButton name="<%= NumberSearchForm.BUTTON_GO %>"/>
            </td>
            </tr>
            </table>
            </td>
        </tr>
        <tr>
        <td align="center">
        <base:searchLookin 
            parentForm="<%=form%>"
            showLineAboveLookin="true" 
            renderForAdvancedSearch="false"/>
        </td>
        </tr>
        </table>

    </td>
</tr>
</base:outlinedTableWithTabsForBaseSearch>
<% } else {%>
<html:hidden property="<%= NumberSearchForm.FIELD_SEARCH_OPTION %>"/>
<html:hidden property="<%= NumberSearchForm.FIELD_SEARCH_TEXT %>"/>
<html:hidden property="<%=NumberSearchForm.FIELD_INCLUDE_LIBRARY%>" />
<html:hidden property="<%=NumberSearchForm.FIELD_INCLUDE_MEDIA%>" />
<html:hidden property="<%=NumberSearchForm.FIELD_MEDIA_SITE_ID%>" />
<html:hidden property="<%=NumberSearchForm.FIELD_SITE_ID%>" />
<html:hidden property="<%=NumberSearchForm.FIELD_SITE_TYPE_ID%>" />
<% } %>
</base:form>
