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
<%@page import="com.follett.fsc.destiny.session.backoffice.data.MOReportTitleListRowVO"%>
<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@page import="com.follett.fsc.destiny.util.BarcodeHelper"%>
<%@page import="com.follett.fsc.common.MessageHelper"%>

<table id="<%=MissouriTimeSensitiveDeweyReportDetailForm.TABLE_HEADER%>" width="100%">

<%
    MissouriTimeSensitiveDeweyReportDetailForm form = (MissouriTimeSensitiveDeweyReportDetailForm)request.getAttribute(MissouriTimeSensitiveDeweyReportDetailForm.FORM_NAME);
%>

<tr>
    <td class="tdAlignRight">
    <%
        if (!form.isPrinterFriendly()) {
    %>
        <base:link page="<%=form.getPrinterFriendlyLink() %>" target="printerFriendly" id="<%=MissouriTimeSensitiveDeweyReportDetailForm.ID_PRINTER_FRIENDLY %>"><base:image src="/buttons/small/printerfriendly.gif" alt="Printer Friendly"/></base:link>
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
    <td class="TableHeading" id="<%=MissouriTimeSensitiveDeweyReportDetailForm.TABLE_HEADER%>" align="center" width="100%"><%=MOReportsFacadeSpecs.getCollectionHeadingFromType(form.getReportVO().getReportType())%> Title List</td>
</tr>
<tr>
    <td class=SmallColHeading align="center">Sorted by Call Number</td>
</tr>
<tr>
    <td>&nbsp;</td>
</tr>
</table>

<table id="<%=MissouriTimeSensitiveDeweyReportDetailForm.TABLE_DATA%>" width="100%" cellspacing="0" cellpadding="4">
<tr bgcolor="<%=DestinyColors.BACKGROUND%>">
    <td align="center" class="InverseSmallColHeading">Count</td>
    <td class="InverseSmallColHeading">Barcode</td>
    <td class="InverseSmallColHeading">Call Number</td>
    <td class="InverseSmallColHeading">Title</td>
    <td class="InverseSmallColHeading">Author</td>
    <td class="InverseSmallColHeading">Pub.<br/>Year</td>
</tr>
<% for (int index = 0; index < form.getTitleList().size(); index ++) {
        MOReportTitleListRowVO row = form.getTitleList().get(index);
        
        String rowMarkup = (index%2==0) ? "" : ("bgcolor=\"" + FlipperTag.ROW_GRAY + "\"");
%>
<tr <%=rowMarkup %>>
    <td class="ColRow" align="center"><%= (index+1) %></td>
    <td class="ColRow" nowrap><%= JSPHelper.filterHtmlAndNulls(BarcodeHelper.getTruncatedBarcode(row.getBarcode())) %></td>
    <td class="ColRow"><%= JSPHelper.filterHtmlAndNulls(row.getCallNumber()) %></td>
    <td class="ColRow"><%= JSPHelper.filterHtmlAndNulls(row.getTitle()) %></td>
    <td class="ColRow"><%= JSPHelper.filterHtmlAndNulls(row.getAuthor()) %></td>
    <td class="ColRow"><%= JSPHelper.filterHtmlAndNulls(row.getPubYear()) %></td>
</tr>
<% } %>
</table>
