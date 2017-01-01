<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.remote.data.InvoiceReconciliationJobParams"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%><base:messageBox strutsErrors="true"/>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>

<%
    InvoiceReconciliationForm form = (InvoiceReconciliationForm)request.getAttribute(InvoiceReconciliationForm.FORM_NAME);
%>
<base:form action="/backoffice/servlet/handleinvoicereconciliationform.do">
<base:outlinedTable id="<%=InvoiceReconciliationForm.TABLE_MAIN%>" width="95%" borderColor="<%= FlipperTag.ROW_GRAY %>">
<tr>
    <td class="TableHeading" colspan="2"><%= MessageHelper.formatMessage("invoicereconciliation_InvoiceReconciliation") %></td>
</tr>
<tr>
    <td class="ColRowBold tdAlignRight" nowrap="nowrap"><%= MessageHelper.formatMessage("invoicereconciliation_ChargesCreditsFrom") %></td>
    <td class="ColRow">
        <base:dateRange 
            dateFrom="<%=form.getDateFrom()%>"
            dateTo="<%=form.getDateTo()%>"
            boldToText = "true"
        />
    </td>
</tr>
<tr>
    <td class = "ColRowBold tdAlignRight" nowrap="nowrap"><%= MessageHelper.formatMessage("invoicereconciliation_For") %></td>
    <td class = "ColRow">
            <base:selectDistrict 
                includeStateTextbookOffice="false"
                includeStatewide="false" 
                selectedDistrictContext="<%=form.getLimitDistrict()%>"
                mustContainTextbookSites="true"  
                useSelectAllDistricts="true"
                useSelectADistrict="false"
                useUnlimitedText="false" 
                onChangeAction="submitForm()"
                printerFriendly="false" 
                useArchive="true"
                name="<%= InvoiceReconciliationForm.FIELD_LIMIT_DISTRICT %>" /> 
    </td> 
</tr>
<% if( (!StringHelper.isEmptyOrWhitespace(form.getLimitDistrict())
    && !SelectDistrictTag.VALUE_ALL_DISTRICTS.equals(form.getLimitDistrict()))) { %>
<tr>
    <td class="ColRowBold tdAlignRight">&nbsp;</td>
    <td class="ColRow">
            <base:selectSite 
               useSelectASite="false"
               name="<%= InvoiceReconciliationForm.FIELD_SITE_ID %>" 
               selectedSiteID="<%= form.getSiteID() == null ? null : String.valueOf(form.getSiteID()) %>" 
               mode="<%=SelectSiteTag.MODE_ARCHIVE%>"
               includeLibrarySites="false"
               includeTextbookSites="true"
               includeMediaSites="false"
               contextName="<%=form.getLimitDistrict()%>"
               includeAssetSites="false"
               includeAllSites="true"
               includeFromDistrict = "false"
               printerFriendly="false"
        />
    </td> 
</tr>
<% } %>

<tr>
    <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("invoicereconciliation_Show") %></td>
    <td class="ColRow">
        <html:select property = "<%= InvoiceReconciliationForm.FIELD_REPORT_TYPE %>" onchange="submitForm()">
            <html:option value = "<%=String.valueOf(InvoiceReconciliationJobParams.REPORT_TYPE_SUMMARY) %>"><%= MessageHelper.formatMessage("invoicereconciliation_Summary") %></html:option>
            <html:option value = "<%=String.valueOf(InvoiceReconciliationJobParams.REPORT_TYPE_NEW) %>"><%= MessageHelper.formatMessage("invoicereconciliation_TitleDetailsNew") %></html:option>
            <html:option value = "<%=String.valueOf(InvoiceReconciliationJobParams.REPORT_TYPE_USED) %>"><%= MessageHelper.formatMessage("invoicereconciliation_TitleDetailsUsed") %></html:option>
        </html:select>
    </td>
</tr>
<% if (form.getReportType() == InvoiceReconciliationJobParams.REPORT_TYPE_SUMMARY) { %>
    <tr>
        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("invoicereconciliation_OutputAs") %></td>
        <td><html:select property = "<%=InvoiceReconciliationForm.FIELD_OUTPUT_FORMAT%>">
                <html:option value = "<%=String.valueOf(InvoiceReconciliationJobParams.REPORT_FORMAT_PDF)%>">PDF</html:option>        
                <html:option value = "<%=String.valueOf(InvoiceReconciliationJobParams.REPORT_FORMAT_XLS)%>">Microsoft Excel</html:option>        
            </html:select>
        </td>
    </tr>
<% } %>
<tr>
    <td colspan="2"><base:imageLine/></td>
</tr>
<tr>
    <td colspan="2" align="center">
        <base:genericShowHideButton name="<%=InvoiceReconciliationForm.BUTTON_RUN_REPORT %>" src="/buttons/large/runreport.gif" alt='<%=MessageHelper.formatMessage("runReport") %>'/>
    </td>
</tr>
</base:outlinedTable>
</base:form>

<script language = 'JavaScript'>
<!--
    function submitForm() {
        document.<%=InvoiceReconciliationForm.FORM_NAME%>.submit();
    }
-->
</script>
        
