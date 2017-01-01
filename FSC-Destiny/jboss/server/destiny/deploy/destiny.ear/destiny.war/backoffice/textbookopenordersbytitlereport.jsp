<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.TextbookOpenOrdersByTitleReportForm" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.data.TextbookOpenOrdersByTitleReportJobParams" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.data.TextbookBaseReportJobParams" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag"%>
<%@page import="org.apache.struts.util.ResponseUtils"%>
<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>


<%@page import="com.follett.fsc.destiny.session.consortium.ejb.ConsortiumFacadeSpecs"%>
<base:messageBox strutsErrors="true"/>

    <SCRIPT LANGUAGE="javascript" TYPE="text/javascript">
    <!--
        function submitTheForm() {
            document.<%=TextbookOpenOrdersByTitleReportForm.FORM_NAME%>.submit();
        }
        function trapEnter(e) {
          var whichCode = (window.Event) ? e.which : e.keyCode;
          if (e.keyCode == 13) {
            return false;
          }
          return true;
        }
    // -->
    </SCRIPT>
<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
%>
<%
    TextbookOpenOrdersByTitleReportForm form = (TextbookOpenOrdersByTitleReportForm)request.getAttribute(TextbookOpenOrdersByTitleReportForm.FORM_NAME);
%>

<base:form action="/backoffice/servlet/handletextbookopenordersbytitlereportform.do">
<html:hidden property="<%=TextbookOpenOrdersByTitleReportForm.BUTTON_CHANGE_SUBMIT%>" value="0"/>
<html:hidden property="<%=TextbookOpenOrdersByTitleReportForm.FIELD_COLLECTION_TYPE%>" value='<%= String.valueOf(form.getCollectionType()) %>' />
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">

<base:outlinedTable id="<%=TextbookOpenOrdersByTitleReportForm.TABLE_MAIN %>" cellpadding="5" cellspacing="0" borderColor="#C0C0C0">
    <tr>
        <td colspan="2" class="TableHeading">
             <%=ResponseUtils.filter(form.getReportHeading())%>
        </td>
    </tr>

    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>

    <tr>
        <td class="ColRowBold tdAlignRight" valign="top">
            <nobr>Select &amp; sort by</nobr>
        </td>
        <td class="ColRow">
            <html:select onchange="javascript:submitTheForm()" property="<%=TextbookOpenOrdersByTitleReportForm.FIELD_SELECT_AND_SORT_BY%>">
                <html:option value="<%=TextbookOpenOrdersByTitleReportJobParams.SELECT_SORT_BY_TITLE%>">Title</html:option>
                <html:option value="<%=TextbookBaseReportJobParams.SELECT_SORT_BY_TEXTBOOK_STATEID%>">State/Textbook ID</html:option>
            </html:select>
            <% if (form.isSelectSortByTitle()) { %>
                &nbsp;<%= MessageHelper.formatMessage("textbookopenordersbytitlereport_from") %>&nbsp;
                <html:text property="<%=TextbookOpenOrdersByTitleReportForm.FIELD_SELECT_AND_SORT_BY_FROM%>" size="9" maxlength="<%=TextbookOpenOrdersByTitleReportForm.LENGTH_RANGE_FIELD%>"/>
                &nbsp;to&nbsp;
                <html:text property="<%=TextbookOpenOrdersByTitleReportForm.FIELD_SELECT_AND_SORT_BY_TO%>" size="9" maxlength="<%=TextbookOpenOrdersByTitleReportForm.LENGTH_RANGE_FIELD%>"/>
            <% }else{ %>
            &nbsp;is&nbsp;
                <html:text property="<%=TextbookOpenOrdersByTitleReportForm.FIELD_SELECT_AND_SORT_BY_STATE_TEXTBOOK_ID%>" size="9" maxlength="<%=TextbookOpenOrdersByTitleReportForm.LENGTH_RANGE_FIELD%>"/>
            <% } %>
        </td>
    </tr>
    <% if (form.isSelectSortByTitle()) { %>
    <tr>
        <td>&nbsp;</td>
        <td class="ColRow">
            <html:checkbox property="<%=TextbookOpenOrdersByTitleReportForm.FIELD_INCLUDE_TE%>">Include Teachers' Editions</html:checkbox>
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td class="ColRow">
            <html:checkbox property="<%=TextbookOpenOrdersByTitleReportForm.FIELD_INCLUDE_RK%>">Include Resource Kits</html:checkbox>
        </td>
    </tr>
        <% if( store.isStateRepositoryRunning() ) { %>    
            <tr>
                <td>&nbsp;</td>
                <td class="ColRow">
                    <html:checkbox property="<%=TextbookOpenOrdersByTitleReportForm.FIELD_INCLUDE_BUNDLES%>">Include Bundles</html:checkbox>
                </td>
            </tr>
        <% } %>
    <% } %>
    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top">
            <nobr>Show Orders created</nobr>
        </td>
        <td class="ColRow">
            <%= MessageHelper.formatMessage("textbookopenordersbytitlereport_from") %>&nbsp;
            <base:dateRange dateFrom="<%=form.getDateFrom()%>" dateTo="<%=form.getDateTo()%>" />        
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td>
            <base:reportButton />
        </td>
    </tr>
</base:outlinedTable>
</base:form>
<script language="javascript">
<!--
function submitDropDown() {
        document.<%=TextbookOpenOrdersByTitleReportForm.FORM_NAME%>.submit();
}

        function submitDropDownDistrict() {
                document.<%=TextbookOpenOrdersByTitleReportForm.FORM_NAME%>.<%=TextbookOpenOrdersByTitleReportForm.BUTTON_CHANGE_SUBMIT%>.value = '<%= TextbookOpenOrdersByTitleReportForm.SUBMIT_DISTRICT_CHANGED%>';
                document.<%=TextbookOpenOrdersByTitleReportForm.FORM_NAME%>.submit();
        }

    
// -->
</script>
