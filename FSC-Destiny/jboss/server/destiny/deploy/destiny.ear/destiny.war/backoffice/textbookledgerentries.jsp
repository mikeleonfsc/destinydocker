<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.common.LocaleHelper" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>


<%@page import="com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.data.TextbookLedgerValue"%>
<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.destiny.session.common.HTMLHelper"%>
<%@page import="com.follett.fsc.destiny.util.URLHelper"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="com.follett.fsc.common.MessageHelper"%>



<%@page import="com.follett.fsc.common.CurrencyValue"%><base:messageBox strutsErrors="true"/>
<%
    TextbookLedgerForm form = (TextbookLedgerForm)request.getAttribute(TextbookLedgerForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>

<c:set var="store" value="<%=store %>" />


<base:form action="/backoffice/servlet/handletextbookledgerform.do">

<table id="<%=TextbookLedgerForm.TABLE_MAIN %>" border="0" width="95%" cellpadding="0" cellspacing="0">
<html:hidden property="<%=TextbookLedgerForm.PARAM_SITE_ID%>" />
<html:hidden property="<%= TextbookLedgerForm.FIELD_SELECTED_CONTEXT%>"/>
<html:hidden property="<%= TextbookLedgerForm.FIELD_ID_TO_DELETE %>"/>

    <% if (!form.isPrinterFriendly()) { %>
    <tr>
        <td class="tdAlignRight">
            <base:link id="<%=TextbookLedgerForm.ID_PRINTER_FRIENDLY %>" href="<%=form.getPrinterFriendlyLink() %>" target="_blank">
                <base:image src="/buttons/small/printerfriendly.gif" alt="Printer Friendly"/>
            </base:link>
        </td>
    </tr>
    <% } %>

    <% if (form.getIdToDelete() != null) { %>
        <base:messageBox showWarningIcon="true" message="Are you sure you want to delete this entry?" >
            <tr><td colspan = "2" align = "center"><base:yesNo></base:yesNo></td></tr>
        </base:messageBox>
    <% } %>

    <tr>
        <td>
<base:outlinedTable borderColor='<%= (form.isPrinterFriendly() ? "" : OutlinedTableTag.OUTLINE_GRAY) %>' id="<%=TextbookLedgerForm.TABLE_OUTER %>" width="100%">


    <tr>
        <td class="TableHeading"><%= JSPHelper.filterHtmlAndNulls(form.gimmePageTitle(false))%></td>
        <td class="tdAlignRight">
            <% if (!form.isPrinterFriendly()) { %>
                    <% if (store.isDistrictUser()) { %>
                    <c:if test="${store.stateContext}">
                        <base:genericButton name="<%= TextbookLedgerForm.BUTTON_ADJUST%>" 
                               src="/buttons/large/adjust.gif" alt="Adjust" />
                    </c:if><br>
                    <% } %>
                    <%
                        String invoiceURL = "/backoffice/servlet/presentledgerinvoiceform.do";
                        if(form.getSessionStore().isStateContext() || form.getStore().isDistrictTextbookCataloger()) {
                            invoiceURL = URLHelper.addHREFParam(invoiceURL, LedgerInvoiceForm.PARAM_STATE_SITE_ID, form.getSiteID());
                        } else {
                            invoiceURL = URLHelper.addHREFParam(invoiceURL, LedgerInvoiceForm.PARAM_SITE_ID, form.getSiteID());
                        }
                            
                    %>
                    <base:link href="<%=invoiceURL %>" target="_blank"><base:image src="/buttons/large/invoice.gif" alt="<%=TextbookLedgerForm.ALT_INVOICE %>"/></base:link>&nbsp;
                         
            <% } else { %>
                &nbsp;
            <% } %>
        </td>
    </tr>
    <tr>
        <td colspan="2"><base:imageLine/></td>
    </tr>
    <tr>
        <td colspan="2">
            <table id="<%=TextbookLedgerForm.TABLE_DETAIL %>" width="100%" cellspacing="0" cellpadding="2">
    <% if (form.getSiteLedger() != null && form.getSiteLedger().getList() == null || form.getSiteLedger().getList().isEmpty()) { %>
    <tr>
        <td colspan="5" class="ColRow">
            No ledger entries exist for this site.
        </td>
    </tr>
    <% } else { %>
        <tr>
            <td class="SmallColHeading">Description</td>
            <td class="SmallColHeading">Date</td>
            <td class="SmallColHeading tdAlignRight">Amount</td>
            <td class="SmallColHeading" align="center">School year</td>
            <td class="SmallColHeading">Notes</td>
            <td class="SmallColHeading">&nbsp;</td>
        </tr>
        <%
            long totalAmount = 0;
            for (int i = 0; i < form.getSiteLedger().getList().size(); i++) {
            TextbookLedgerValue rec = form.getSiteLedger().getList().get(i);
            totalAmount += rec.getAmount();
            String amountStr = "";
            if (rec.getAmount() < 0) {
                amountStr = "(";
            }
            amountStr += lh.formatCurrency(new CurrencyValue(new Long(Math.abs(rec.getAmount())), lh.getRegionFormatCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT);
            if (rec.getAmount() < 0) {
                amountStr += ")";
            } else {
                amountStr += "&nbsp;";
                
            }
        %>
        <base:flipper key="flipper">
            <td class="ColRow" valign="top"><%= JSPHelper.filterHtmlAndNulls(rec.getDescription()) %></td>
            <td class="ColRow" valign="top"><%= UserContext.getMyContextLocaleHelper().formatDate(rec.getDate()) %></td>
            <td class="ColRow tdAlignRight" valign="top"><%=amountStr%></td>
            <td class="ColRow" valign="top" align="center"><%=rec.getFiscalYear()%></td>
            <td class="ColRow" valign="top">
                <c:choose>
                    <c:when test="<%=rec.getLedgerID().equals(form.getShowMoreLedgerID()) %>">
                        <%= HTMLHelper.filterHTMLConvertLineBreaks(rec.getNote()) %>
                    </c:when>
                    <c:otherwise>
                        <%= JSPHelper.filterHtmlAndNulls(StringHelper.truncate(rec.getNote(), 100, true)) %>
                        
                        <c:if test="<%= ! form.isPrinterFriendly() && rec.getNote().length() > 100 %>">
                            <base:genericButton name="<%=TextbookLedgerForm.BUTTON_SHOW_MORE + rec.getLedgerID() %>" src="/buttons/small/showmore.gif" alt="Show more" />        
                        </c:if>
                    </c:otherwise>
                </c:choose>
            </td>
            <td class="ColRow">
                <% if (!form.isPrinterFriendly() && store.isStateContext() && rec.getInventoryPartialID() != null) { %>
                    <base:link page='<%= "/backoffice/servlet/presentexamineinventoryform.do?useArchived=true&partialID=" + rec.getInventoryPartialID()%>'>
                        <base:image src="/buttons/small/examine.gif" alt="<%=TextbookLedgerForm.ALT_EXAMINE %>"/>
                    </base:link>
                <% } else if (!form.isPrinterFriendly() && form.canEditAndDelete(rec)) { %>
                    <base:genericButton name="<%= TextbookLedgerForm.BUTTON_EDIT + rec.getLedgerID()%>" src="/buttons/small/editsmall.gif" alt = "Edit Adjustment"></base:genericButton>
                    <br/>
                    <base:genericButton name="<%= TextbookLedgerForm.BUTTON_DELETE + rec.getLedgerID()%>" src = "/buttons/small/delete_70.gif" alt="Delete Adjustment"></base:genericButton>
                <% } else { %>
                    &nbsp;
                <% } %>
            </td>
        </base:flipper>
        <% } %>
        <tr>
            <td class="ColRowBold tdAlignRight" colspan="2">Total</td>
    <%
            String amountStr = lh.formatCurrency(new CurrencyValue( new Long(totalAmount), lh.getRegionFormatCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT);
    %>        
            <td class="ColRow tdAlignRight"><%=amountStr%></td>
            <td colspan="2">&nbsp;</td>
        </tr>
<% } %>
    </table>    <%-- DETAIL --%>

</base:outlinedTable> <%--  OUTER --%>

        </td>
    </tr>
</table>    <%--  MAIN --%>

</base:form>
