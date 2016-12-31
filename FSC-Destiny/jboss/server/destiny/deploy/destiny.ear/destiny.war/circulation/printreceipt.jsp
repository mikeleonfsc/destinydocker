<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.data.*" %>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.*" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%    PrintReceiptForm form = (PrintReceiptForm)request.getAttribute(PrintReceiptForm.FORM_NAME); %>

<logic:equal name="<%= PrintReceiptForm.FORM_NAME %>" property="validInformation" value="false">
    <base:messageBox showWarningIcon="true" message='<%= MessageHelper.formatMessage("printreceipt_InvalidStatePleaseCloseThisBrowserWindowAndPrint") %>'/>
</logic:equal>

<logic:equal name="<%= PrintReceiptForm.FORM_NAME %>" property="validInformation" value="true">
    <%= form.getHeader() %>
    <logic:equal name="<%= PrintReceiptForm.FORM_NAME %>" property="transactionsAvailable" value="false">
        <%= form.getNoTransactionsMessage() %>
    </logic:equal>
    <logic:equal name="<%= PrintReceiptForm.FORM_NAME %>" property="transactionsAvailable" value="true">
        <logic:equal name="<%= PrintReceiptForm.FORM_NAME %>" property="fineReceipt" value="true">
            <%= form.getFineTransactions() %>
            <%= form.getOutstandingFines() %>
        </logic:equal>
        <logic:equal name="<%= PrintReceiptForm.FORM_NAME %>" property="fineReceipt" value="false">
            <%= form.getFineTransactions() %>
            <%= form.getCheckouts() %>
            <%= form.getOutstandingFines() %>
            <%= form.getCollectionType() == CollectionType.LIBRARY ? form.getHoldsReserves() : "" %>
        </logic:equal>
    </logic:equal>
    <%= form.getFooter() %>

<script language="Javascript1.2">
<!--
window.print();  
//-->
</script>
</logic:equal>
