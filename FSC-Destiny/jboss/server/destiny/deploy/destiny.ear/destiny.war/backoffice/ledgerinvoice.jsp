<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LoginFacadeSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.ejb.*" %>
<%@ page import="com.follett.fsc.destiny.session.circulation.ejb.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="java.util.*" %>
<%@page import="com.follett.fsc.common.TimestampHelper"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.data.TextbookLedgerValue"%>
<%@page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    LedgerInvoiceForm form = (LedgerInvoiceForm)request.getAttribute(LedgerInvoiceForm.FORM_NAME );
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>


<%@page import="com.follett.fsc.common.CurrencyValue"%><table id="<%=LedgerInvoiceForm.TABLE_MAIN%>" width="98%" border="0" cellspacing="0" cellpadding="2">
<tr>
    <td class="FormHeading" valign="top" align="center">I N V O I C E</td>
</tr>
<tr>
    <td class="ColRow" align="center"><%=form.gimmeStateInformation()%></td>
</tr>
<tr>
    <td class="ColRow" align="center"><br/><%=UserContext.getMyContextLocaleHelper().formatDateAndTime(TimestampHelper.getNow()) %></td>
</tr>
<tr>
    <td class="ColRowBold">Textbook Manager</td>
</tr>
<tr>
    <td>
    <table id="<%=LedgerInvoiceForm.TABLE_SITE_INFO %>">
    <tr>
        <td class="ColRow"><%=form.gimmeSiteInformation()%></td>
    </tr>
    </table>
    </td>
</tr>
<tr>
    <td>&nbsp;</td>
</tr>
<tr>
    <td>
    <table width="90%" id="<%=LedgerInvoiceForm.TABLE_ENTRIES %>">
    <%
    if (form.getLedgerList().size() == 0){
        %>
        <tr>
            <td class="ColRowBold">
            There are no charges or credits to report.
            </td>
        </tr>
         <tr>
        <td colspan="3"><base:imageLine  /></td>
    </tr>
        <%} else {%>
    <tr>
        <td class="SmallColHeading">Description</td>
        <td class="SmallColHeading tdAlignRight">Amount&nbsp;&nbsp;&nbsp;</td>
    </tr>
    <%
            Iterator<TextbookLedgerValue> iter = form.getLedgerList().iterator();
            long totalAmount = 0;
            while (iter.hasNext()) {
                TextbookLedgerValue value = iter.next();
                totalAmount += value.getAmount();
        %>
        <!-- 
        <tr>
        
            <td class="ColRow"><%=value.getNote()==null? "": ResponseUtils.filter(value.getNote()) %></td>
            <td class="ColRow"><%= value.getFiscalYear() %></td>
            
            <td class="ColRow tdAlignRight"><%= lh.formatCurrency(new CurrencyValue(new Long(value.getAmount()), lh.getRegionFormatCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT)%><%if (value.getAmount() >= 0){%>&nbsp;<%}%></td>
        </tr>
        <%
            }
        %>
    <tr>
        <td colspan="2"><base:imageLine  /></td>
    </tr>
        
         -->
    <tr><td colspan="2">&nbsp;</td></tr>     
    <tr>
        <td class="ColRow">Lost and Damaged Textbooks</td>
        <td class="ColRow tdAlignRight"><%=lh.formatCurrency(new CurrencyValue(new Long(totalAmount), lh.getRegionFormatCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT)%><%if(totalAmount >= 0){%>&nbsp;<%}%>
        </td>
    </tr>
    <tr><td colspan="2">&nbsp;</td></tr>
    <tr>
        <td class="ColRowBold">Total Due:</td>
        <td class="ColRowBold tdAlignRight"><%=lh.formatCurrency(new CurrencyValue(new Long(totalAmount), lh.getRegionFormatCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT)%><%if(totalAmount >= 0){%>&nbsp;<%}%>
        </td>
    </tr>
    <%} %>
    </table>
    </td>
</tr>
<tr>
    <td>&nbsp;</td>
</tr>
<tr>
    <td><span class="ColRowBold">Note:</span> <span class="ColRow">Please make sure the school name and BEDS code appear on the check or check apron.</span></td>
</tr>
</table>
