<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>

<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.PreviewDueDatesForm" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.LibraryStatisticsForm" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CircPolicySpecs"%>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.*"%>
<%@ page import="com.follett.fsc.common.StringHelper"%>
<%@ page import="java.util.*"%>
<%@ page import="com.follett.fsc.common.*" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.common.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page import="com.follett.fsc.common.CurrencyValue"%>

<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<bean:define id="form" name="<%= PreviewDueDatesForm.FORM_NAME %>" type="PreviewDueDatesForm"/>

<base:messageBox strutsErrors="true"/>
<%    
//PreviewDueDatesForm form = (PreviewDueDatesForm)request.getAttribute(PreviewDueDatesForm.FORM_NAME); 
    SessionStoreProxy store = form.getStore();
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>
<bean:define id="patronTypes" name="<%=form.FORM_NAME %>" property="patronTypes"/>
<%--<bean:define id="valueObject" name="<%=PreviewDueDatesForm.VALUE_OBJECT_LOCATION%>" type="com.follett.fsc.destiny.session.circulation.data.PreviewDueDatesVO" />--%>
<base:form action="/circulation/servlet/handlepreviewduedatesform.do">

<html:hidden property="<%=PreviewDueDatesForm.PARAM_FROM_CHECKOUT_PATRON_TYPE%>"/>

<base:outlinedTableAndTabsWithinThere borderColor='#c0c0c0' width="100%" cellpadding="0" cellspacing="0" tabs="<%=form.getTabs() %>" selectedTabID="<%=form.getSelectedTabID() %>" selectedTab="<%=form.getSelectedTab() %>">
    <tr><td width="100%">
        <table id="<%=PreviewDueDatesForm.TABLE_MAIN%>" width="100%" cellpadding="2">
            <tr>
                <td class="TableHeading"><%= MessageHelper.formatMessage("previewduedates_DueDatesForItemsCheckedOutTodayTo") %></td>
            </tr>
            <tr>
                <td class="ColRowBold"><%= MessageHelper.formatMessage("previewduedates_PatronType") %>&nbsp;<html:select property="<%=form.FIELD_PATRON_TYPE%>" onchange="patronTypeSelected()">
                        <html:options collection="patronTypes" property="longID" labelProperty="stringDesc"/>
                    </html:select>
                </td>
            </tr>
            <tr>
                <td>
                    <table id="<%=PreviewDueDatesForm.TABLE_CIRC_TYPES%>" width="100%" cellpadding="0" cellspacing="0">
                        <tr>
                            <td class="SmallColHeading"><%= MessageHelper.formatMessage("previewduedates_CirculationType") %></td>
                            <td class="SmallColHeading"><%= MessageHelper.formatMessage("previewduedates_LoanPeriod") %></td>
                            <td class="SmallColHeading"><%= MessageHelper.formatMessage("previewduedates_DueDate") %></td>
                            <td class="SmallColHeading"><%= MessageHelper.formatMessage("previewduedates_GraceDate") %></td>
                            <td class="SmallColHeading"><%= MessageHelper.formatMessage("previewduedates_FineIncrement") %></td>
                        </tr>
                        <logic:iterate id="node" name="circulation_servlet_PreviewDueDatesForm" property="circTypes" type="com.follett.fsc.destiny.session.backoffice.data.CircPoliciesForPreviewDueDatesValue">
                            <base:flipper key="preview">
                                <td class="ColRow">
                                    <%= ResponseUtils.filter(node.getCircTypeDescription()) %>
                                </td>
                                <td class="ColRow">
                                    <%if (node.getPeriodType() == CircPolicySpecs.PERIOD_TYPE_DAILY) { 
                                        out.println(MessageHelper.formatMessage("previewduedates_Days", node.getLoanPeriod()));
                                     } else if (node.getPeriodType() == CircPolicySpecs.PERIOD_TYPE_HOURLY) { 
                                        out.println(MessageHelper.formatMessage("previewduedates_Hours", node.getLoanPeriod()));
                                     } else {
                                         out.println(MessageHelper.formatMessage("previewduedates_Fixed"));
                                     }%>
                                </td>
                                <td class="ColRow">
                                <% 
                                    if (node.isDueDateModified()) {
                                %>
                                <font color="#CC0000">
                                <%
                                    }
                                %>
                                <% if (node.getPeriodType() != CircPolicySpecs.PERIOD_TYPE_HOURLY) { %>
                                    <%= lh.formatDate(node.getDueDate()) %>
                                <% } else { %>
                                    <% 
                                    if (node.isDueDateModified()) {
                                    %>
                                        <%= lh.formatDate(node.getDueDate()) %>
                                    <% } else { %>
                                        <%= lh.formatTime(node.getDueDate()) %>
                                    <% } %>
                                <% } %>
                                <%
                                    if (node.isDueDateModified()) {
                                %>
                                </font>
                                <%
                                    }
                                %>
                                </td>
                                <td class="ColRow">
                                    <% if (node.getPeriodType() != CircPolicySpecs.PERIOD_TYPE_HOURLY) { %>
                                        <%
                                            if (node.isGraceDateModified()) {
                                        %>
                                        <font color="#CC0000">
                                        <%
                                            }
                                        %>
                                            <%= lh.formatDate(node.getGraceDate()) %>
                                        <%
                                            if (node.isGraceDateModified()) {
                                        %>
                                        </font>
                                        <%
                                            }
                                        %>
                                    <% } else {
                                        out.println((node.getGracePeriod() == 0) ? MessageHelper.formatMessage("previewduedates_None") : MessageHelper.formatMessage("previewduedates_Today"));
                                    } %>
                                </td>
                                <td class="ColRow">
                                  <%= MessageHelper.formatMessage("previewduedates_fine_cost_PerDay", new CurrencyValue(node.getFineIncrement(), lh.getFineCurrencyCharacterCode())) %>
                                </td>
                            </base:flipper>
                        </logic:iterate>
                        <tr>
                            <td colspan="5">
                                <base:imageSpacer width="1" height="10"/>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table> <!-- main table -->
    </td></tr>
</base:outlinedTableAndTabsWithinThere>
</base:form>
<script language="javascript">
<!--
function patronTypeSelected() {
        document.<%=PreviewDueDatesForm.FORM_NAME%>.submit();
}
-->
</script>
