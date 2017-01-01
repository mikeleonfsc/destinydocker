<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.URLHelper" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.ExamineInventoryForm"%>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.EstimatedBillingRowVO"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>

<%
    ExamineInventoryForm form = (ExamineInventoryForm)request.getAttribute(ExamineInventoryForm.FORM_NAME);
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    String printerLink = "/backoffice/servlet/presentexamineinventoryform.do?useArchived="+form.isUseArchived() + "&partialID=" + form.getPartialID() + "&printerFriendly=true";
    String borderColor = !form.isPrinterFriendly() ? "#C0C0C0" : "#FFFFFF"; 
%>



<%@page import="com.follett.fsc.common.CurrencyValue"%><base:messageBox strutsErrors="true"/>

<%
if (!form.isPrinterFriendly()) {
%>
<table border="0" width="95%">
<tr>
    <td class="tdAlignRight">
    <base:link page="<%= printerLink %>" target="printerFriendly" id="<%=ExamineInventoryForm.ID_PRINTER_FRIENDLY %>"><base:image src="/buttons/small/printerfriendly.gif" alt='<%= MessageHelper.formatMessage("printable")%>'/></base:link>
    </td>
</tr>
</table>
<%
}
%>

<base:outlinedTable borderColor="<%=borderColor %>" id="<%=ExamineInventoryForm.TABLE_MAIN %>">
<tr>
    <td colspan="6" class="TableHeading">
        <%=ResponseUtils.filter(form.getReportVO().getInventoryName()) %>
        <% if (form.getStore().isStateContext()) { %>
        (<%=ResponseUtils.filter(form.getReportVO().getDistrictName()) %> / <%=ResponseUtils.filter(form.getReportVO().getSiteName()) %>)
        <% } %>
    </td>
</tr>
<tr>
    <% if ( form.isPrinterFriendly() ) { %>
    <td colspan="6"><hr></td>
    <% } else { %>
    <td colspan="6"><base:imageLine/></td>
    <% } %>
</tr>
<tr>
    <td class="SmallColHeading"><%= MessageHelper.formatMessage("examineinventory_Title") %></td>
    <td class="SmallColHeading"><%= MessageHelper.formatMessage("examineinventory_StateID") %></td>
    <td class="SmallColHeading"><%= MessageHelper.formatMessage("examineinventory_ISBN") %></td>
    <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("examineinventory_Expected") %></td>
    <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("examineinventory_Short") %></td>
    <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("examineinventory_EstimatedBill") %></td>
</tr>
<% for (int index = 0; index < form.getReportVO().getTitles().size(); index ++) {
    EstimatedBillingRowVO row = form.getReportVO().getTitles().get(index);
    %>

<base:flipper key="examineForm">
    <td valign="top" class="ColRow">
        <% if (row.isConsumable()) { %>
            <%= MessageHelper.formatMessage("examineinventory_0Consumable", ResponseUtils.filter(row.getTitle())) %>
        <% } else { %>
            <%= ResponseUtils.filter(row.getTitle())%>
        <% } %>
    </td>
    <td valign="top" class="ColRow"><%= row.getTextID() != null ? ResponseUtils.filter(row.getTextID()) : "" %></td>
    <td valign="top" class="ColRow"><%= row.getIsbn() != null ? row.getIsbn() : "" %></td>
    <td valign="top" class="ColRow tdAlignRight"><%= lh.formatNumber(row.getCopiesExpected())%></td>
    <td valign="top" class="ColRow tdAlignRight"><%= lh.formatNumber(row.getCopiesShort())%></td>
    <td valign="top" class="ColRow tdAlignRight">
        <%= lh.formatCurrency(new CurrencyValue(new Long(row.getAmountBilled()), lh.getRegionFormatCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT)%>
    </td>
</base:flipper>
<% }%>
<tr>
    <td colspan="4" class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("examineinventory_Total") %></td>
    <td class="ColRowBold tdAlignRight"><%=lh.formatNumber(form.getReportVO().getTotalCopiesShort()) %></td>
    <td class="ColRowBold tdAlignRight"><%=lh.formatCurrency(new CurrencyValue(new Long(form.getReportVO().getTotalBilled()), lh.getRegionFormatCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT) %></td>
</tr>

<tr>
    <td colspan="3"  class="Instruction"><%= MessageHelper.formatMessage("examineinventory_ShortMayIncludeCopies") %></td>
</tr>


</base:outlinedTable>
