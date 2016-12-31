<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.data.LedgerDateRangeJobParams"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.remote.data.BaseReportJobParams"%><base:messageBox strutsErrors="true"/>

<%
    TextbookLedgerByDateRangeForm form = (TextbookLedgerByDateRangeForm)request.getAttribute(TextbookLedgerByDateRangeForm.FORM_NAME);
%>
<base:form action="/backoffice/servlet/handletextbookledgerbydaterangeform.do">
<base:outlinedTableAndTabsWithinThere id="<%=TextbookLedgerByDateRangeForm.TABLE_MAIN%>" borderColor="#c0c0c0"
        selectedTab="<%=TextbookLedgerByDateRangeForm.ALT_TAB_DATE_RANGE%>" tabs="<%=form.getTabs(form.getStore(), false)%>">

<tr>
    <td class="TableHeading" colspan="2">Ledger Report by Date Range</td>
</tr>
<tr>
    <td class="ColRowBold tdAlignRight">Show</td>
    <td class="ColRow">
        <html:select property = "<%= TextbookLedgerByDateRangeForm.FIELD_ACTIVITY_TYPE %>" >
            <html:option value = "<%=String.valueOf(LedgerDateRangeJobParams.TYPE_ALL_ACTIVITY) %>"><%= LedgerDateRangeJobParams.ACTIVITY_TYPES_DESCRIPTION[0] %></html:option>
            <html:option value = "<%=String.valueOf(LedgerDateRangeJobParams.TYPE_MANUAL_CHARGES) %>"><%= LedgerDateRangeJobParams.ACTIVITY_TYPES_DESCRIPTION[1] %></html:option>
            <html:option value = "<%=String.valueOf(LedgerDateRangeJobParams.TYPE_MANUAL_CREDITS) %>"><%= LedgerDateRangeJobParams.ACTIVITY_TYPES_DESCRIPTION[2] %></html:option>
            <html:option value = "<%=String.valueOf(LedgerDateRangeJobParams.TYPE_SYSTEM_CHARGES) %>"><%= LedgerDateRangeJobParams.ACTIVITY_TYPES_DESCRIPTION[3] %></html:option>
            <html:option value = "<%=String.valueOf(LedgerDateRangeJobParams.TYPE_SYSTEM_CREDITS) %>"><%= LedgerDateRangeJobParams.ACTIVITY_TYPES_DESCRIPTION[4] %></html:option>
        </html:select>
    </td>
</tr>

<tr>
    <td class="ColRowBold tdAlignRight" nowrap="nowrap">Entered</td>
    <td class="ColRow">
        <base:dateRange 
            dateFrom="<%=form.getDateFrom()%>"
            dateTo="<%=form.getDateTo()%>"
            boldToText = "true"
        />
    </td>
</tr>


    <tr>
        <td class="ColRowBold tdAlignRight">Output as</td>
        <td><html:select property = "<%=TextbookLedgerByDateRangeForm.FIELD_OUTPUT_FORMAT%>">
                <html:option value = "<%=String.valueOf(BaseReportJobParams.EXPORT_TYPE_PDF)%>">PDF</html:option>        
                <html:option value = "<%=String.valueOf(BaseReportJobParams.EXPORT_TYPE_XLS)%>">Microsoft Excel</html:option>        
            </html:select>
        </td>
    </tr>

<tr>
    <td colspan="2"><base:imageLine/></td>
</tr>
<tr>
    <td colspan="2" align="center">
        <base:genericButton name="<%=TextbookLedgerByDateRangeForm.BUTTON_RUN_REPORT %>" src="/buttons/large/runreport.gif" alt="<%=TextbookLedgerByDateRangeForm.ALT_RUN_REPORT %>"/>
    </td>
</tr>
</base:outlinedTableAndTabsWithinThere>
</base:form>


        
