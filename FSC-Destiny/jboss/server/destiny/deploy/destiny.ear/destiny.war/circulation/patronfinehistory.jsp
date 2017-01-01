<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.common.MessageHelper"%>

<% PatronFineHistoryForm form = (PatronFineHistoryForm) request.getAttribute(PatronFineHistoryForm.FORM_NAME);%>

<base:outlinedTableAndTabsWithinThere id="<%=PatronFineHistoryForm.TABLE_MAIN%>" selectedTabID="<%=form.getSelectedTabID()%>" selectedTab="<%=form.getSelectedTab()%>" tabs="<%=form.getTabs()%>" >
<tr>
<td valign="top" class="TableHeading">
  <bean:write name="<%= PatronFineHistoryForm.FORM_NAME %>" property="patronHeader"/>
</td>
<td valign="top" class="tdAlignRight">
<% if (!form.isPrinterFriendly() ) {%>
    <base:link page="<%=form.getPrinterFriendlyPage()%>" target="printerFriendly" id="<%=PatronFineHistoryForm.ID_PRINTER_FRIENDLY %>">
        <base:image src="/buttons/small/printerfriendly.gif" alt='<%=MessageHelper.formatMessage("printable") %>' />
    </base:link>
<%} %>
</td>
</tr>

<tr>
<td colspan="2">
<table width="100%" id="<%=PatronFineHistoryForm.TABLE_FINES%>" border="0" cellpadding="3" cellspacing="0">
    <base:finesHistoryListOutput
        finesList="<%= form.getFinesList() %>"
        printerFriendly="<%=form.isPrinterFriendly()%>"
	/>
</table>
</td>
</tr>
</base:outlinedTableAndTabsWithinThere>
