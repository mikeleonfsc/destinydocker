<%@page import="com.follett.fsc.destiny.session.circulation.ejb.data.FineDistrictDetailResult"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@page import="java.util.List"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.FineSpecs"%>
<%@page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="com.follett.fsc.common.MessageHelper"%>

<%
    TextbookFineDetailsForm form = (TextbookFineDetailsForm) request.getAttribute(TextbookFineDetailsForm.FORM_NAME);
    List<FineDistrictDetailResult> list = form.getResult();
    
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    
    int tableWidth = form.isLostReport() ? 6 : 7;
%>



<%@page import="com.follett.fsc.common.CurrencyValue"%><table width="100%" id="<%=TextbookFineDetailsForm.TABLE_MAIN %>">
    <tr>
        <td colspan="<%=tableWidth-1 %>" class="TableHeading"><%=form.getReportHeader()  %></td>
        <td class="tdAlignRight">
            <% if (!form.isPrinterFriendly()) { %>
                <base:link page="<%=form.getPrinterFriendlyLink() %>" target="printerFriendly" id="<%=TextbookFineDetailsForm.ID_PRINTER_FRIENDLY %>"><base:image src="/buttons/small/printerfriendly.gif" alt="Printer Friendly"/></base:link>
            <% } else { %>
                &nbsp;
            <% } %>
        </td>
    </tr>
    <tr><td colspan="2">&nbsp;</td></tr>
<%
    Long oldBibID = null;
    Long lostFineAmount = new Long(0);
    Long lostPaidAmount = new Long(0);
    Long lostWaivedAmount = new Long(0);
    Long lostOutstandingAmount = new Long(0);
    Long damagedFineAmount = new Long(0);
    Long damagedPaidAmount = new Long(0);
    Long damagedWaivedAmount = new Long(0);
    Long damagedOutstandingAmount = new Long(0);
    
    for (int index = 0; index < list.size(); index ++) {
        FineDistrictDetailResult row = list.get(index);

        int fineType = form.isLostReport() ? FineSpecs.INT_FINE_LOST : row.getFineType().intValue();
        String fineDesc = "";
        switch (fineType) {
            case FineSpecs.INT_FINE_LOST:
                fineDesc = "Lost";
                if (row.getFineAmount() != null) {
                    lostFineAmount = new Long(lostFineAmount.longValue() + row.getFineAmount().longValue());
                }
                if (row.getPaidAmount() != null) {
                    lostPaidAmount = new Long(lostPaidAmount.longValue() + row.getPaidAmount().longValue());
                }
                if (row.getWaivedAmount() != null) {
                    lostWaivedAmount = new Long(lostWaivedAmount.longValue() + row.getWaivedAmount().longValue());
                }
                if (row.getOutstandingAmount() != null) {
                    lostOutstandingAmount = new Long(lostOutstandingAmount.longValue() + row.getOutstandingAmount().longValue());
                }
                break;
            case FineSpecs.INT_FINE_DAMAGED:
                fineDesc = "Damaged";
                if (row.getFineAmount() != null) {
                    damagedFineAmount = new Long(damagedFineAmount.longValue() + row.getFineAmount().longValue());
                }
                if (row.getPaidAmount() != null) {
                    damagedPaidAmount = new Long(damagedPaidAmount.longValue() + row.getPaidAmount().longValue());
                }
                if (row.getWaivedAmount() != null) {
                    damagedWaivedAmount = new Long(damagedWaivedAmount.longValue() + row.getWaivedAmount().longValue());
                }
                if (row.getOutstandingAmount() != null) {
                    damagedOutstandingAmount = new Long(damagedOutstandingAmount.longValue() + row.getOutstandingAmount().longValue());
                }
                break;
            default:
                fineDesc = "Unknown";
                break;
        }
    
        if (!row.getBibID().equals(oldBibID)) {
%>
        <tr>
            <td colspan="<%=tableWidth %>" class="ColRowBold">
                <%=row.getTitle() %>
                <% if (row.getIsbn() != null) { %>
                &nbsp;&nbsp;&nbsp; <%=row.getIsbn() %>&nbsp;
                <% } %>
                <% if (row.getReplacementPrice() != null) { %>
                <%="(" + lh.formatCurrency(row.getReplacementPriceCurrencyValue(), LocaleHelper.CURRENCY_OPTION_DEFAULT) + ")"%>
                <% } %>
            </td>
        </tr>
        <tr>
            <td class="SmallColHeading tdAlignRight">Fine Date</td>
            <% if (!form.isLostReport()) { %>
            <td class="SmallColHeading tdAlignRight">Fine Type</td>
            <% } %>
            <td class="SmallColHeading tdAlignRight">Copy Barcode</td>
            <td class="SmallColHeading tdAlignRight">Fine Amount</td>
            <td class="SmallColHeading tdAlignRight">Paid</td>
            <td class="SmallColHeading tdAlignRight">Waived</td>
            <td class="SmallColHeading tdAlignRight">Outstanding</td>
        </tr>
<%            
        }
%>
    <tr>
        <td class="ColRow tdAlignRight"><%=lh.formatDate(row.getFineDate() )%></td>
        <% if (!form.isLostReport()) { %>
        <td class="ColRow tdAlignRight"><%=fineDesc %></td>
        <% } %>
        <td class="ColRow tdAlignRight"><%=row.getCopyBarcodeOrDeleted()%></td>
        <td class="ColRow tdAlignRight"><%=lh.formatCurrency(new CurrencyValue(row.getFineAmount(), lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT) %></td>
        <td class="ColRow tdAlignRight"><%=lh.formatCurrency(new CurrencyValue(row.getPaidAmount(), lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT) %></td>
        <td class="ColRow tdAlignRight"><%=lh.formatCurrency(new CurrencyValue(row.getWaivedAmount(), lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT) %></td>
        <td class="ColRow tdAlignRight"><%=lh.formatCurrency(new CurrencyValue(row.getOutstandingAmount(), lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT) %></td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td class="ColRow" colspan="6"><%= form.getPatronLostInfo(row) %></td>
    </tr>
<%       
        oldBibID = row.getBibID();
    }
%>
    <tr>
        <td colspan="<%=tableWidth %>"><base:imageLine/></td>
    </tr>
    <%
        Long totalFineAmount = new Long(lostFineAmount.longValue() + damagedFineAmount.longValue());
        Long totalPaidAmount = new Long(lostPaidAmount.longValue() + damagedPaidAmount.longValue());
        Long totalWaivedAmount = new Long(lostWaivedAmount.longValue() + damagedWaivedAmount.longValue());
        Long totalOutstandngAmount = new Long(lostOutstandingAmount.longValue() + damagedOutstandingAmount.longValue());
    %>
    <% if (!form.isLostReport()) { %>
    <tr>
        <td colspan="3" class="ColRowBold tdAlignRight">Lost Fines</td>
        <td class="ColRowBold tdAlignRight"><%=lh.formatCurrency(new CurrencyValue(lostFineAmount, lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT)%></td>
        <td class="ColRowBold tdAlignRight"><%=lh.formatCurrency(new CurrencyValue(lostPaidAmount, lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT)%></td>
        <td class="ColRowBold tdAlignRight"><%=lh.formatCurrency(new CurrencyValue(lostWaivedAmount, lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT)%></td>
        <td class="ColRowBold tdAlignRight"><%=lh.formatCurrency(new CurrencyValue(lostOutstandingAmount, lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT)%></td>
    </tr>
    <tr>
        <td colspan="3" class="ColRowBold tdAlignRight">Damaged Fines</td>
        <td class="ColRowBold tdAlignRight"><%=lh.formatCurrency(new CurrencyValue(damagedFineAmount, lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT)%></td>
        <td class="ColRowBold tdAlignRight"><%=lh.formatCurrency(new CurrencyValue(damagedPaidAmount, lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT)%></td>
        <td class="ColRowBold tdAlignRight"><%=lh.formatCurrency(new CurrencyValue(damagedWaivedAmount, lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT)%></td>
        <td class="ColRowBold tdAlignRight"><%=lh.formatCurrency(new CurrencyValue(damagedOutstandingAmount, lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT)%></td>
    </tr>
    <% } %>
    <tr>
        <% if (form.isLostReport()) { %>
        <td colspan="2" class="ColRowBold tdAlignRight">Totals</td>
        <% } else { %>
        <td colspan="3" class="ColRowBold tdAlignRight">Total Assessed Fines</td>
        <% } %>
        <td class="ColRowBold tdAlignRight"><%=lh.formatCurrency(new CurrencyValue(totalFineAmount, lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT)%></td>
        <td class="ColRowBold tdAlignRight"><%=lh.formatCurrency(new CurrencyValue(totalPaidAmount, lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT)%></td>
        <td class="ColRowBold tdAlignRight"><%=lh.formatCurrency(new CurrencyValue(totalWaivedAmount, lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT)%></td>
        <td class="ColRowBold tdAlignRight"><%=lh.formatCurrency(new CurrencyValue(totalOutstandngAmount, lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT)%></td>
    </tr>
</table>        
