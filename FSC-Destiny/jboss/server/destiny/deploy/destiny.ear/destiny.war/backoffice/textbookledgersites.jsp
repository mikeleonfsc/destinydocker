<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.common.LocaleHelper" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>


<%@page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.data.TextbookLedgerSiteValue"%>
<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@page import="org.apache.struts.util.ResponseUtils"%>
<%@page import="java.util.List"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.data.TextbookLedgerDistrictValue"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="com.follett.fsc.common.MessageHelper"%>



<%@page import="com.follett.fsc.common.CurrencyValue"%><base:messageBox strutsErrors="true"/>
<%
    TextbookLedgerForm form = (TextbookLedgerForm)request.getAttribute(TextbookLedgerForm.FORM_NAME);
	SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
	LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>


<base:form action="/backoffice/servlet/handletextbookledgerform.do">

<table id="<%=TextbookLedgerForm.TABLE_MAIN %>" border="0" width="95%" cellpadding="0" cellspacing="0">
<html:hidden property="<%=TextbookLedgerForm.PARAM_SITE_ID%>" />

    <% if (!form.isPrinterFriendly() &&  
            !(form.getStore().isStateContext() &&
            (form.getSelectedContext() == null )||"NO_DISTRICT".equals(form.getSelectedContext()))) { %>
    <tr>
        <td class="tdAlignRight">
            <base:link id="<%=TextbookLedgerForm.ID_PRINTER_FRIENDLY %>" href="<%=form.getPrinterFriendlyLink() %>" target="_blank">
                <base:image src="/buttons/small/printerfriendly.gif" alt="Printer Friendly"/>
            </base:link>
        </td>
    </tr>
    <% } %>


    <tr>
        <td>
<base:outlinedTableAndTabsWithinThere id="<%=TextbookLedgerForm.TABLE_MAIN%>" 
        borderColor='<%= (form.isPrinterFriendly() ? "" : "#c0c0c0") %>'
        selectedTab="<%=form.ALT_TAB%>" tabs="<%=TextbookLedgerByDateRangeForm.getTabs(store, form.isPrinterFriendly())%>">

    <% if (store.isStateContext()) { %>
    <tr>
        <td class="ColRow" align="center">
            <table id="<%=TextbookLedgerForm.TABLE_HEADER %>" width="100%" cellpadding="0" cellspacing="0">
            <tr>
                <td class="ColRowBold tdAlignRight">Ledger Summary for&nbsp;</td>
                <td width="1%" class="ColRowBold" nowrap>
                <base:selectDistrict 
                    name="<%=TextbookLedgerForm.FIELD_SELECTED_CONTEXT %>"
                    useArchive="true"
                    useSelectADistrict="true"
                    includeStateTextbookOffice="false"
                    submitOnChange="true"
                    selectedDistrictContext="<%=form.getSelectedContext() %>"
                    printerFriendly="<%=form.isPrinterFriendly() %>"
                    includeStatewide="true"
                />
                </td>
                <td class="ColRowBold"><%="&nbsp;on " +form.getPrintableDate()%></td>
            </tr>
            </table>
        </td>
    </tr>
    <% if  (form.isStateWide() && !form.isPrinterFriendly()) { %>
        <tr>
            <td class="tdAlignRight">
                <base:link href="/textbookledgerexcelservlet" target="_blank" ><base:image src="/buttons/large/extract.gif" alt="<%= TextbookLedgerForm.BUTTON_EXTRACT_ALT %>"/></base:link><br/>
            </td>
        </tr>
    <% } %>
    <% } else { %>
        <html:hidden property="<%=TextbookLedgerForm.FIELD_SELECTED_CONTEXT%>" value=""/>
        <tr>
            <td class="ColRowBold" align="center">
                Ledger Summary for <%= ResponseUtils.filter(store.getDistrictName()) %>
            </td>
        </tr>
        
    <% } %>
    <% if (form.getListDistricts() != null && !form.getListDistricts().isEmpty()) { %>
        <% if (store.isStateContext()) { %>
        <tr>
            <td><base:imageLine/></td>
        </tr>
        <% } %>
        
        <tr>
            <td>
                <table id="<%=TextbookLedgerForm.TABLE_DETAIL %>" width="100%" cellpadding="2" cellspacing="0">
                    <% if (form.isStateWide()) { %>
                     <tr>
                        <td class="ColRowBold tdAlignRight">Total</td>
                        <td class = "ColRow tdAlignRight"><%= lh.formatCurrency(new CurrencyValue(new Long(form.getStateWideTotal()), lh.getRegionFormatCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT) %></td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td colspan="3"><base:imageLine/></td>
                    </tr>
                    <% } %>
                    <%  List<TextbookLedgerDistrictValue> distList = form.getListDistricts();
                        for (int i = 0; i < distList.size(); i++) {
                            TextbookLedgerDistrictValue val = distList.get(i);
                            List<TextbookLedgerSiteValue> siteList = val.getSiteList();
                            long distTotal = val.getAmount();
                        if  (form.isStateWide()) { %>
                            <tr>
                                <td class = "TableHeading" colspan = "3"><%= val.getDistrictName() %></td>
                            </tr>
                        <% } %>
                        <tr>
                            <td class="SmallColHeading">Site</td>
                            <td class="SmallColHeading tdAlignRight">Current Balance</td>
                            <td class="SmallColHeading">&nbsp;</td>
                        </tr>
                    <%
                            request.setAttribute("flipper", Boolean.FALSE);
                            for (int j = 0; j < siteList.size(); j++) {
                                TextbookLedgerSiteValue rec = siteList.get(j);
                                
                    %>
                    <base:flipper key="flipper" >
                        <td class="ColRow">
                            <a name="<%=TextbookLedgerForm.ANCHOR_BASE%><%=rec.getStateSiteID()%>"></a>
                            <%= JSPHelper.filterHtmlAndNulls(rec.getSiteName()) %></td>
                        <td class="ColRow tdAlignRight"><base:localeCurrencyTag price="<%=new Long(rec.getAmount())%>" currencyCode="<%=lh.getRegionFormatCurrencyCharacterCode()%>"/></td>
                        <td class="tdAlignRight">
                            <% if (!form.isPrinterFriendly()) { %>
                                <base:link id="<%=(TextbookLedgerForm.LINK_DETAILS_PREFIX + rec.getStateSiteID()) %>" href="<%=form.getDisplaySiteLedgerLink(rec.getStateSiteID()) %>"><base:image src="/buttons/small/detailsover.gif" alt="<%= TextbookLedgerForm.ALT_DETAILS %>"/></base:link>
                            <% } else { %>
                                &nbsp;
                            <% } %>
                        </td>
                    </base:flipper>
                    <% } %>
                    <tr>
                        <td class="ColRowBold tdAlignRight"><%= (form.isStateWide() ? "District " : "") + "Total"%></td>
                        <%
                                String amountStr = lh.formatCurrency(new CurrencyValue(new Long(distTotal), lh.getRegionFormatCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT);
                        %>        
                        <td class="ColRow tdAlignRight"><%=amountStr%></td>
                        <td colspan="2">&nbsp;</td>
                    </tr>
                    <%  if  (form.isStateWide()) { %>
                    <tr>
                        <td colspan="3"><base:imageLine/></td>
                    </tr>
                    <% } %>
                <% } %>
                <% if (form.isStateWide()) { %>
                <tr>
                    <td class="ColRowBold tdAlignRight">Total</td>
                    <td class = "ColRow tdAlignRight"><%= lh.formatCurrency(new CurrencyValue(new Long(form.getStateWideTotal()), lh.getRegionFormatCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT) %></td>
                    <td>&nbsp;</td>
                </tr>
                <% } %>
                </table>
                
            </td>
        </tr>
    <% } %>
</base:outlinedTableAndTabsWithinThere>  

        </td>
    </tr>
</table>    <%--  MAIN --%>

</base:form>
