<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="java.util.*" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>

<base:messageBox strutsErrors="true"/>

<%
    CollectionStatsForm form = (CollectionStatsForm)request.getAttribute(CollectionStatsForm.FORM_NAME);
%>
<bean:define id="list" name="backoffice_servlet_CollectionStatsForm" property="list" type="ArrayList"/>

<base:form action="/backoffice/servlet/handlecollectionstatsform.do">
<html:hidden property="startDewey"/>
<html:hidden property="endDewey"/>
<html:hidden property="<%=CollectionStatsForm.FIELD_SELECTED_TAB %>"/>
<html:hidden property="<%= CollectionStatsForm.PARAM_REPORT_SITE_ID %>"/>
<html:hidden property="<%= CollectionStatsForm.FIELD_DATA_MODE %>"/>

<base:outlinedTableAndTabsWithinThere id="content" width="100%" selectedTabID="<%=form.getSelectedTab() %>" selectedTab="<%=form.getSelectedTab() %>" tabs="<%=form.getTabs() %>" hideBorderAndTabs="<%=form.getPrint() %>">
    <tr>
    <td>
    <table id="linktable" width="100%" border="0" cellspacing="0" cellpadding="2">
    <tr>
        <% if ( !form.getPrint() ) { %>
            <td class="SmallColRow" nowrap>
                <html:checkbox property="<%= CollectionStatsForm.FIELD_GROUP_BY_PREFIX %>" onclick="this.form.submit()"><%= MessageHelper.formatMessage("collectionstatsframe_GroupCallNumbersBasedOnThePrefix") %></html:checkbox>
                <base:helpTag helpFileName="d_group_call_numbers_collection_stats_report.htm"/>
            </td>
            <td class="SmallColRow tdAlignRight" nowrap>
            <% if (form.getDataMode().intValue() != CollectionStatsForm.USER_DISTRICT_VIEWING_DISTICT) { %>
                <logic:equal name="backoffice_servlet_CollectionStatsForm" property="<%= CollectionStatsForm.FIELD_SELECTED_TAB %>" value="<%= CollectionStatsForm.ID_TAB_CIRCULATION %>" >
                    [&nbsp;<A href="#<%= CollectionStatsForm.ANCHOR_CUSTOMIZE_COPY_VIEW %>"><%= MessageHelper.formatMessage("collectionstatsframe_CustomizeCopyView") %></A>&nbsp;]
                </logic:equal>
            <% } %>
            &nbsp;</td>
            <td class="SmallColRow tdAlignRight">
                <base:link page='<%= form.getPrinterLink("/backoffice/servlet/handlecollectionstatsform.do")%>' target="printerFriendly" id="<%=CollectionStatsForm.ID_PRINTER_FRIENDLY %>"><base:image src="/buttons/small/printerfriendly.gif" alt='<%=MessageHelper.formatMessage("printable") %>' /></base:link>
            </td>
        <% } else { %>
            <td class="MainHeader" align="center"><%=request.getParameter(CollectionStatsForm.PARAM_REPORT_SITE_NAME)%></td>
        <% } %>
    </tr>
    <% if (form.getPrint()) { %>
        <tr>
            <td class="SmallColHeading" align="center">
            <%=form.getPrinterFriendlyPageTitle() %>
            </td>
        </tr>
        <tr>
            <td class="ColRow" align="center">
            <%=form.getPrinterFriendlySubTitle() %>
            </td>
        </tr>
    <% } %>
    </table>

<% if (CollectionStatsForm.ID_TAB_CIRCULATION.equals(form.getSelectedTab())) { %>
    <jsp:include page="/backoffice/collectionstatscirc.jsp" flush="true"/>
<% } else if (CollectionStatsForm.ID_TAB_AGE.equals(form.getSelectedTab())) { %>
    <jsp:include page="/backoffice/collectionstatsage.jsp" flush="true"/>
<% } else if (CollectionStatsForm.ID_TAB_VALUE.equals(form.getSelectedTab())) { %>
    <jsp:include page="/backoffice/collectionstatsvalue.jsp" flush="true"/>
<% } %>
    </td></tr>
</base:outlinedTableAndTabsWithinThere>

</base:form>
