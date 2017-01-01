<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.*"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<%@ page import="java.util.*"%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.StringHelper"%>

<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<% CheckinForm form = (CheckinForm) request.getAttribute("circulation_servlet_CheckinForm"); %>

<% if (form.isOperateInAjaxMode()) { %>
    <!-- AJAXMode;CloseBoxId="CloseBoxTransactions" -->
<% } %>

<%
    if (form.getTransactionList().size() > 0) {
%>


<TABLE id="<%=CheckinForm.TABLE_TRANSACTION_LIST%>" border="0" cellpadding="0"
    cellspacing="0" style="border-collapse: collapse" bordercolor="#111111"
    width="97%">
    <TR>
        <TD colspan="5">
            <TABLE border="0" height="18" cellpadding="2" cellspacing="0"
                bordercolor="#111111" width="100%">
                <TR>
                    <base:sectionHeading printerFriendly="false"
                        heading='<%=MessageHelper.formatMessage("CheckinForm_MostRecentlyCheckedIn")%>'
                        tdContent="" />
                </TR>
            </TABLE>
        </TD>
    </TR>

    <%-- kick out two <TR>s of data for each element, plus a spacer line after --%>
    <%
        int lineCount = 1;
        LinkedList transactions = new LinkedList(form.getTransactionList());
            Iterator itr = transactions.iterator();
            boolean showImage = false;
            while (itr.hasNext()) {
                showImage = lineCount == 1;
    %>
    <%=form.formatTransaction((CheckinTransactionBean) itr.next(), request, response, showImage)%>

    <TR>
        <!-- separator line -->
        <TD colspan="5"><IMG src="/images/icons/general/line.gif"
            height="2" width="100%" vspace="4"></TD>
    </TR>
    <%
        lineCount++;
            }
    %>
</TABLE>

<% } %>


