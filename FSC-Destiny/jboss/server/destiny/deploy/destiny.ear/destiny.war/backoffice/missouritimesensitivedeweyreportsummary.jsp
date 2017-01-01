<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.DestinyColors"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.data.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@page import="org.apache.struts.util.ResponseUtils"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.ejb.MOReportsFacadeSpecs"%>
<%@page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.data.MOTSDReportRowVO"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%>
<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.common.MessageHelper"%>

<%
    MissouriTimeSensitiveDeweyReportSummaryForm form = (MissouriTimeSensitiveDeweyReportSummaryForm)request.getAttribute(MissouriTimeSensitiveDeweyReportSummaryForm.FORM_NAME);
%>


<table id="<%=MissouriTimeSensitiveDeweyReportSummaryForm.TABLE_HEADER%>" width="100%">
<tr>
    <td class="tdAlignRight">
    <%
        if (!form.isPrinterFriendly()) {
    %>
        <base:link page="<%=form.getPrinterFriendlyLink() %>" target="printerFriendly" id="<%=MissouriTimeSensitiveDeweyReportSummaryForm.ID_PRINTER_FRIENDLY %>"><base:image src="/buttons/small/printerfriendly.gif" alt="Printer Friendly"/></base:link>
    <%
        } else {
    %>
        &nbsp;
    <%
        }
    %>
    </td>
</tr>
<tr>
    <td class="TableHeading" align="center" width="100%"><%=form.getPageTitle()%></td>
</tr>
<tr>
    <td class="ColRowBold" align="center">for <%=form.getReportVO().getSiteName()%> (Using Time-Sensitive Areas for <%=MOReportsFacadeSpecs.getDeweyCategoryAsString(form.getReportVO().getDeweyCategory())%>)</td>
</tr>
<tr>
    <td class="ColRow" align="center">Including the prefixes: <%=form.getDeweyPrefixes()%></td>
</tr>
<%
    if (form.getReportVO().getPrefixesWithoutDewey() != null && form.getReportVO().getPrefixesWithoutDewey().size() > 0) {
%>
<tr>
    <td class="ColRow" align="center">Including the prefixes without dewey numbers: <%=form.getNonDeweyPrefixes()%></td>
</tr>
<%
    }
%>
<tr>
    <td class="ColRow" align="center">Year threshold: <%=form.getYearThreshold()%></td>
</tr>
<tr>
    <td>&nbsp;</td>
</tr>
</table>

<table id="<%=MissouriTimeSensitiveDeweyReportSummaryForm.TABLE_DATA%>" width="100%" cellspacing="0" cellpadding="2">
<tr bgcolor="<%=DestinyColors.BACKGROUND%>">
    <td align="center" class="InverseSmallColHeading" >Dewey</td>
    <td class="InverseSmallColHeading tdAlignRight">Total Holdings</td>
    <td class="InverseSmallColHeading tdAlignRight">
            Holdings with Prefix
        <% if (form.getReportType() == MOReportsFacadeSpecs.REPORT_TYPE_REFERENCE) { %>
            <br>Holdings with Dewey only
            <br>(5 max per title)
        <% } %>
    </td>
    <td class="InverseSmallColHeading tdAlignRight"># Older</td>
    <td class="InverseSmallColHeading tdAlignRight"># Newer</td>
    <td class="InverseSmallColHeading tdAlignRight">% Newer</td>
</tr>
<% for (int index = 0; index < form.getReportVO().getRows().size(); index ++) {
        MOTSDReportRowVO row = form.getReportVO().getRows().get(index);
        
        String rowMarkup = row.isTimeSensitive() ? ("bgcolor=\"" + FlipperTag.ROW_GRAY + "\"") : "";
        String cellClassFirstColumn = row.isTimeSensitive() ? "ColRowBold" : "ColRow";
        String cellClassOtherColumns = row.isTimeSensitive() ? "ColRowBold tdAlignRight" : "ColRow tdAlignRight";
%>
<tr <%=rowMarkup %>>
    <td class="<%=cellClassFirstColumn %>" align="center"><%= row.isTimeSensitive() ? "* " : ""%><%= row.getLabel() %></td>
    <td class="<%=cellClassOtherColumns %>"><%= form.renderCell(row.getTotalHoldings(), index, MOReportsFacadeSpecs.DETAIL_COL_TOTAL_HOLDINGS) %></td>
    <td class="<%=cellClassOtherColumns %>"><%= form.renderCell(row.getHoldingsForPrefix(), index, MOReportsFacadeSpecs.DETAIL_COL_WITH_PREFIX) %></td>
    <td class="<%=cellClassOtherColumns %>"><%= form.renderCell(row.getOlderItemsCount(), index, MOReportsFacadeSpecs.DETAIL_COL_OLDER) %></td>
    <td class="<%=cellClassOtherColumns %>"><%= form.renderCell(row.getNewerItemsCount(), index, MOReportsFacadeSpecs.DETAIL_COL_NEWER) %></td>
    <td class="<%=cellClassOtherColumns %>"><%=row.getPercent() %></td>
</tr>
<% } %>
<tr>
    <td align="center" class="ColRowBold" colspan="6"><base:imageLine/></td>
</tr>

<tr>
    <td class="ColRowBold">Overall Totals</td>
    <td class="ColRowBold tdAlignRight"><%=form.getReportVO().getOverallTotals().getTotalHoldings() %></td>
    <td class="ColRowBold tdAlignRight"><%=form.getReportVO().getOverallTotals().getHoldingsForPrefix() %></td>
    <td class="ColRowBold tdAlignRight"><%=form.getReportVO().getOverallTotals().getOlderItemsCount() %></td>
    <td class="ColRowBold tdAlignRight"><%=form.getReportVO().getOverallTotals().getNewerItemsCount() %></td>
    <td class="ColRowBold tdAlignRight"><%=form.getReportVO().getOverallTotals().getPercent() %></td>
</tr>
<tr>
    <td class="ColRowBold" bgcolor="<%=FlipperTag.ROW_GRAY %>">* Time-Sensitive Totals</td>
    <td class="ColRowBold tdAlignRight" bgcolor="<%=FlipperTag.ROW_GRAY %>"><%=form.getReportVO().getTotalsForTime().getTotalHoldings() %></td>
    <td class="ColRowBold tdAlignRight" bgcolor="<%=FlipperTag.ROW_GRAY %>"><%=form.getReportVO().getTotalsForTime().getHoldingsForPrefix() %></td>
    <td class="ColRowBold tdAlignRight" bgcolor="<%=FlipperTag.ROW_GRAY %>"><%=form.getReportVO().getTotalsForTime().getOlderItemsCount() %></td>
    <td class="ColRowBold tdAlignRight" bgcolor="<%=FlipperTag.ROW_GRAY %>"><%=form.getReportVO().getTotalsForTime().getNewerItemsCount() %></td>
    <td class="ColRowBold tdAlignRight" bgcolor="<%=FlipperTag.ROW_GRAY %>"><%=form.getReportVO().getTotalsForTime().getPercent() %></td>
</tr>
</table>
