<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>



<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%
    String parentFormName = (String)request.getAttribute("parentFormName");
    BaseSearchResultsForm form = (BaseSearchResultsForm)request.getAttribute(parentFormName);

     String viewTypeElem = "";
     if (form.isElementaryMode() && !CategorySearchResultsForm.FORM_NAME.equals(parentFormName)) {
         viewTypeElem = "viewTypeElem";
     }
    
    // if the user klicked the keywords tab, we're going to show the tabbed result list
    // even if it is empty
    if (request.getAttribute("MyKeywordList") != null || form.isUserClickedKeywordsTab()) {
        int itemsInList = form.getTotalCount();
        if ( itemsInList > 0 || form.isUserClickedKeywordsTab() || request.getAttribute(AdvancedSearchForm.SHOW_RESULTS_ALWAYS) != null) {
%>
<div id="viewTypeElem" class="<%=viewTypeElem%>">
<html:hidden property="<%=BaseSearchResultsForm.FIELD_DO_NOT_SAVE_SEARCH_HISTORY %>"/>
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=form.BUTTON_TRAP_ENTER_KEY%>">

<table width="95%" id="<%=form.TABLE_KEYWORD_RESULTS%>" border="0" cellpadding="0" cellspacing="0">
    <tr>
        <td colspan="1">
            <base:outlinedTableAndTabsWithinThere tabs="<%=form.getTabs() %>" selectedTab="<%=form.getSelectedTab() %>" tabClass="<%=form.getTabClass() %>" borderColor="#c0c0c0" width="100%" cellpadding="0">
              <%if (BookSeriesResultsForm.FORM_NAME.equals(parentFormName)) { %>
                <jsp:include page="/cataloging/basebookseriesresultsdata.jsp" flush="true"/>
              <% } else { 
                    if (form.isElementaryMode() && !CategorySearchResultsForm.FORM_NAME.equals(parentFormName)) { %>
                        <jsp:include page="/cataloging/basesearchresultsdata_elem.jsp" flush="true"/>
                    <% } else { %>
                        <jsp:include page="/cataloging/basesearchresultsdata.jsp" flush="true"/>
                    <% } 
                 } %>
            </base:outlinedTableAndTabsWithinThere>
        </td>
    </tr>
</table>
</div>
<%

        }
    }
%>
