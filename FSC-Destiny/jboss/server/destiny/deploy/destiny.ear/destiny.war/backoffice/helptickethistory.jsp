<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm"%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
 

<bean:define id="form" name="<%= HelpTicketHistoryForm.FORM_NAME %>" type="com.follett.fsc.destiny.client.backoffice.servlet.HelpTicketHistoryForm"/>

<% 
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>

<base:form action="/backoffice/servlet/handlehelptickethistoryform.do">

    <base:outlinedTable id="<%=HelpTicketHistoryForm.TABLE_MAIN%>" width="100%" borderColor="#C0C0C0" hideBorderWhenPrinterFriendlyForOutlinedTable='<%=Boolean.valueOf(request.getParameter("printerFriendly"))%>' >
        <html:hidden property="printerFriendly" value="true"/>
        <tr>
            <td class="TableHeading" id="<%= HelpTicketHistoryForm.ID_TICKET_NUMBER %>">Help Ticket : <%= form.getHelpTicketNumber() %></td>
            <td class="tdAlignRight">
        <% if( !Boolean.valueOf(request.getParameter("printerFriendly")).booleanValue() ) { %>
                <base:link target="printerFriendly" page="<%= form.getPrinterFriendlyLink() %>" id="<%=GenericForm.ID_PRINTER_FRIENDLY %>">
                    <base:image align="absbottom" src="/buttons/small/printerfriendly.gif" alt='<%=MessageHelper.formatMessage("printable") %>'/>
                </base:link>
        <% } %>
            </td>
        </tr>
        <tr>
            <td class="SectionHeader" id="<%= HelpTicketHistoryForm.ID_TITLE %>">Help Ticket History</td>
        </tr>
        <tr>
            <td width="100%">
                <table id="<%= HelpTicketHistoryForm.TABLE_HISTORY %>" width="100%">
                <tr>
                <% if( !Boolean.valueOf(request.getParameter("printerFriendly")).booleanValue() ) { %>
                    <td class="SmallColHeading" align="left" nowrap>
                        <c:if test="<%= form.getSort() != HelpTicketHistoryForm.SORTBY_TRANSACTION_ASC %>">
                            <a href="/backoffice/servlet/handlehelptickethistoryform.do?sort=<%= HelpTicketHistoryForm.SORTBY_TRANSACTION_ASC %>&helpTicketID=<%=form.getHelpTicketID() %>&printerFriendly=<%=Boolean.valueOf(request.getParameter("printerFriendly"))%>">Transaction</a>
                        </c:if>
                        <c:if test="<%= form.getSort() == HelpTicketHistoryForm.SORTBY_TRANSACTION_DESC %>">
                            <img src='<%=lh.getLocalizedImagePath("/icons/general/descend.gif")%>' alt="<%= HelpTicketHistoryForm.ALT_SORTED_DESCENDING %>" />
                        </c:if> 
                        <c:if test="<%= form.getSort() == HelpTicketHistoryForm.SORTBY_TRANSACTION_ASC %>">
                            <a href="/backoffice/servlet/handlehelptickethistoryform.do?sort=<%= HelpTicketHistoryForm.SORTBY_TRANSACTION_DESC %>&helpTicketID=<%=form.getHelpTicketID() %>&printerFriendly=<%=Boolean.valueOf(request.getParameter("printerFriendly"))%>">Transaction</a>
                            <img src='<%=lh.getLocalizedImagePath("/icons/general/ascend.gif")%>' alt="<%= HelpTicketHistoryForm.ALT_SORTED_ASCENDING %>" />
                        </c:if>
                    </td>
                    <td class="SmallColHeading" align="center" nowrap>
                        <c:if test="<%= form.getSort() != HelpTicketHistoryForm.SORTBY_DATE_DESC %>">
                            <a href="/backoffice/servlet/handlehelptickethistoryform.do?sort=<%= HelpTicketHistoryForm.SORTBY_DATE_DESC %>&helpTicketID=<%=form.getHelpTicketID() %>&printerFriendly=<%=Boolean.valueOf(request.getParameter("printerFriendly"))%>">Date</a>
                        </c:if>
                        <c:if test="<%= form.getSort() == HelpTicketHistoryForm.SORTBY_DATE_ASC %>">
                            <img src='<%=lh.getLocalizedImagePath("/icons/general/ascend.gif")%>' alt="<%= HelpTicketHistoryForm.ALT_SORTED_ASCENDING %>" />
                        </c:if> 
                        <c:if test="<%= form.getSort() == HelpTicketHistoryForm.SORTBY_DATE_DESC %>">
                            <a href="/backoffice/servlet/handlehelptickethistoryform.do?sort=<%= HelpTicketHistoryForm.SORTBY_DATE_ASC %>&helpTicketID=<%=form.getHelpTicketID() %>&printerFriendly=<%=Boolean.valueOf(request.getParameter("printerFriendly"))%>">Date</a>
                            <img src='<%=lh.getLocalizedImagePath("/icons/general/descend.gif")%>' alt="<%= HelpTicketHistoryForm.ALT_SORTED_DESCENDING %>" />
                        </c:if>
                    </td>
                    <td class="SmallColHeading" align="center" nowrap>
                        <c:if test="<%= form.getSort() != HelpTicketHistoryForm.SORTBY_PERFORMED_BY_ASC %>">
                            <a href="/backoffice/servlet/handlehelptickethistoryform.do?sort=<%= HelpTicketHistoryForm.SORTBY_PERFORMED_BY_ASC %>&helpTicketID=<%=form.getHelpTicketID() %>&printerFriendly=<%=Boolean.valueOf(request.getParameter("printerFriendly"))%>">Performed By</a>
                        </c:if>
                        <c:if test="<%= form.getSort() == HelpTicketHistoryForm.SORTBY_PERFORMED_BY_DESC %>">
                            <img src='<%=lh.getLocalizedImagePath("/icons/general/descend.gif")%>' alt="<%= HelpTicketHistoryForm.ALT_SORTED_DESCENDING %>" />
                        </c:if> 
                        <c:if test="<%= form.getSort() == HelpTicketHistoryForm.SORTBY_PERFORMED_BY_ASC %>">
                            <a href="/backoffice/servlet/handlehelptickethistoryform.do?sort=<%= HelpTicketHistoryForm.SORTBY_PERFORMED_BY_DESC %>&helpTicketID=<%=form.getHelpTicketID() %>&printerFriendly=<%=Boolean.valueOf(request.getParameter("printerFriendly"))%>">Performed By</a>
                            <img src='<%=lh.getLocalizedImagePath("/icons/general/ascend.gif")%>' alt="<%= HelpTicketHistoryForm.ALT_SORTED_ASCENDING %>" />
                        </c:if>
                    </td>
                    <% } else { %>
                        <td class="SmallColHeading">Transaction</td>
                        <td class="SmallColHeading" align="center">Date</td>
                        <td class="SmallColHeading" align="center">Performed By</td>
                    <% } %>
                </tr>
                
<% Iterator iter = ObjectHelper.getIterator(form.getHelpTicketHistory());
   while (iter.hasNext()) {
   HelpTicketHistoryValue vo = (HelpTicketHistoryValue) iter.next();
%>
        <% if( Boolean.valueOf(request.getParameter("printerFriendly")).booleanValue() ) { %>
                <tr>
                    <td align="left"><%= form.getTransactionHTML(vo) %></td>
                    <td class="ColRow" align="center" valign="top"><%= form.getDateHTML(vo) %></td>
                    <td class="ColRow" align="center" valign="top"><%= form.getPerformedByHTML(vo) %></td>
                </tr>
        <% } %>
        <% if( !Boolean.valueOf(request.getParameter("printerFriendly")).booleanValue() ) { /* base:flipper contains partial while loop */%>
                <base:flipper key="helptickethistory">
                    <td align="left"><%= form.getTransactionHTML(vo) %></td>
                    <td class="ColRow" align="center" valign="top"><%= form.getDateHTML(vo) %></td>
                    <td class="ColRow" align="center" valign="top"><%= form.getPerformedByHTML(vo) %></td>
                </base:flipper>
        <% } %>
<% } %>

                </table>
            </td>
        </tr>
    </base:outlinedTable>

</base:form>
