<%@page import="com.follett.fsc.destiny.client.common.jsptag.AssetTypesListTag"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.ResourceOpenOrdersByTitleReportForm" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.data.ResourceOpenOrdersByTitleReportJobParams" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.data.ResourceBaseReportJobParams" %>
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
            document.<%=ResourceOpenOrdersByTitleReportForm.FORM_NAME%>.submit();
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
    ResourceOpenOrdersByTitleReportForm form = (ResourceOpenOrdersByTitleReportForm)request.getAttribute(ResourceOpenOrdersByTitleReportForm.FORM_NAME);
%>

<base:form action="/backoffice/servlet/handleresourceopenordersbytitlereportform.do">
<html:hidden property="<%=ResourceOpenOrdersByTitleReportForm.BUTTON_CHANGE_SUBMIT%>" value="0"/>
<html:hidden property="<%=ResourceOpenOrdersByTitleReportForm.FIELD_COLLECTION_TYPE%>" value='<%= String.valueOf(form.getCollectionType()) %>' />
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">

<base:outlinedTable id="<%=ResourceOpenOrdersByTitleReportForm.TABLE_MAIN %>" cellpadding="5" cellspacing="0" borderColor="#C0C0C0">
    <tr>
        <td colspan="2" class="TableHeading">
             <%=ResponseUtils.filter(form.getReportHeading())%>
        </td>
    </tr>

    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    
               
                <tr>
                    <td class="ColRowBold tdAlignRight" nowrap valign="top">
                        Resource Types
                    </td>
                    <td nowrap valign="top" >
                        <base:assetTypesList tableWidth="10" formName="<%= ResourceOpenOrdersByTitleReportForm.FORM_NAME%>" />
                    </td>
                </tr>

    <tr>
    
        <% if (form.isSearchOnlyResources() || !form.isTextbookTemplateAvailable() ) { %>
            <td class="ColRowBold tdAlignRight" valign="top">
                <nobr>Select &amp; sort by Displayable Name</nobr>
            </td>
        <% } else { %>
            <td class="ColRowBold tdAlignRight" valign="top">
                <nobr>Select &amp; sort by</nobr>
            </td>
        <% } %>
        
        <td class="ColRow">
        <% if (form.isSearchOnlyTextbooks()){ %>
            <html:select onchange="javascript:submitTheForm()" property="<%=ResourceOpenOrdersByTitleReportForm.FIELD_SELECT_AND_SORT_BY%>">
                <html:option value="<%=ResourceOpenOrdersByTitleReportJobParams.SELECT_SORT_BY_TITLE%>">Title</html:option>
                <html:option value="<%=ResourceBaseReportJobParams.SELECT_SORT_BY_TEXTBOOK_STATEID%>">State/Textbook ID</html:option>
            </html:select>
        <% } else if (form.isSearchOnlyResources() || !form.isTextbookTemplateAvailable()) { %>
            <html:hidden property="<%=ResourceOpenOrdersByTitleReportForm.FIELD_SELECT_AND_SORT_BY%>" value="<%=ResourceOpenOrdersByTitleReportJobParams.SELECT_SORT_BY_TITLE%>" />
        <% } else {%>
            <html:select onchange="javascript:submitTheForm()" property="<%=ResourceOpenOrdersByTitleReportForm.FIELD_SELECT_AND_SORT_BY%>">
                <html:option value="<%=ResourceOpenOrdersByTitleReportJobParams.SELECT_SORT_BY_TITLE%>">Displayable Name/Title</html:option>
                <html:option value="<%=ResourceBaseReportJobParams.SELECT_SORT_BY_TEXTBOOK_STATEID%>">State/Textbook ID</html:option>
            </html:select>
        <% } %>
            
        <% if (form.isSelectSortByTitle()) { %>
            &nbsp;<%= MessageHelper.formatMessage("textbookopenordersbytitlereport_from") %>&nbsp;
            <html:text property="<%=ResourceOpenOrdersByTitleReportForm.FIELD_SELECT_AND_SORT_BY_FROM%>" size="9" maxlength="<%=ResourceOpenOrdersByTitleReportForm.LENGTH_RANGE_FIELD%>"/>
            &nbsp;to&nbsp;
            <html:text property="<%=ResourceOpenOrdersByTitleReportForm.FIELD_SELECT_AND_SORT_BY_TO%>" size="9" maxlength="<%=ResourceOpenOrdersByTitleReportForm.LENGTH_RANGE_FIELD%>"/>
        <% }else{ %>
        &nbsp;is&nbsp;
            <html:text property="<%=ResourceOpenOrdersByTitleReportForm.FIELD_SELECT_AND_SORT_BY_STATE_TEXTBOOK_ID%>" size="9" maxlength="<%=ResourceOpenOrdersByTitleReportForm.LENGTH_RANGE_FIELD%>"/>
        <% } %>
            
        
        </td>
    </tr>
    <% if (form.isSelectSortByTitle() && !form.isSearchOnlyResources() && form.isTextbookTemplateAvailable()) { %>
    <tr>
        <td>&nbsp;</td>
        <td class="ColRow">
            <html:checkbox property="<%=ResourceOpenOrdersByTitleReportForm.FIELD_INCLUDE_TE%>">Include Teachers' Editions</html:checkbox>
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td class="ColRow">
            <html:checkbox property="<%=ResourceOpenOrdersByTitleReportForm.FIELD_INCLUDE_RK%>">Include Resource Kits</html:checkbox>
        </td>
    </tr>
    <% } else { %>
        <html:hidden property="<%=ResourceOpenOrdersByTitleReportForm.FIELD_INCLUDE_TE%>" value="off" />
        <html:hidden property="<%=ResourceOpenOrdersByTitleReportForm.FIELD_INCLUDE_RK%>" value="off" />
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
        document.<%=ResourceOpenOrdersByTitleReportForm.FORM_NAME%>.submit();
}

        function submitDropDownDistrict() {
                document.<%=ResourceOpenOrdersByTitleReportForm.FORM_NAME%>.<%=ResourceOpenOrdersByTitleReportForm.BUTTON_CHANGE_SUBMIT%>.value = '<%= ResourceOpenOrdersByTitleReportForm.SUBMIT_DISTRICT_CHANGED%>';
                document.<%=ResourceOpenOrdersByTitleReportForm.FORM_NAME%>.submit();
        }

    
// -->
</script>
