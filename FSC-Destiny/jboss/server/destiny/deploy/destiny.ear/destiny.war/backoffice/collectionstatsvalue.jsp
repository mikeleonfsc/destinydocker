<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.DestinyColors"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.ejb.CollectionStatisticsReportSpecs"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>


<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="com.follett.fsc.common.LocaleHelper"%><bean:define id="form" name="backoffice_servlet_CollectionStatsForm" type="CollectionStatsForm"/>
<bean:define id="list" name="backoffice_servlet_CollectionStatsForm" property="list" type="List"/>
<%
	SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>
<table id="<%= CollectionStatsForm.TABLE_VALUE_CONTENTS %>" width="100%" border="0" cellspacing="0" cellpadding="2">
    <tr bgcolor="<%=DestinyColors.BACKGROUND%>">
        <td class="InverseSmallColHeading" align="center">&nbsp;</td>
        <td class="InverseSmallColHeading" align="center" width="4">&nbsp;</td>
        <td class="InverseSmallColHeading" align="center" colspan="3"><%= MessageHelper.formatMessage("collectionstatsvalue_Value") %></td>
        <td class="InverseSmallColHeading" align="center" width="4">&nbsp;</td>
        <td class="InverseSmallColHeading" align="center" colspan="2"><%= MessageHelper.formatMessage("collectionstatsvalue_Circulations") %></td>
        <td class="InverseSmallColHeading" align="center" width="4">&nbsp;</td>
        <td class="InverseSmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("collectionstatsvalue_Collection") %></td>
    </tr>
    <tr>
        <td class="SmallColHeading" align="center"><%= MessageHelper.formatMessage("collectionstatsvalue_Range") %></td>
        <% if (!form.getPrint()) { %>
            <td class="SmallColHeading" align="center" rowspan=<bean:write name="<%= form.FORM_NAME %>" property="rowCount"/> width="4" bgcolor="#FFFFFF" bordercolor="#E8E8E8" background="/images/icons/general/verticalline.gif">
                &nbsp;
            </td>
        <% } else { %>
            <td class="SmallColHeading" align="center" width="4" bgcolor="#FFFFFF" bordercolor="#E8E8E8">
                &nbsp;
            </td>
        <% } %>
        <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("collectionstatsvalue_CopiesWPrices") %></td>
        <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("collectionstatsvalue_ActualValue") %></td>
        <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("collectionstatsvalue_EstimatedValue") %></td>
        <% if (!form.getPrint()) { %>
            <td class="SmallColHeading" align="center" rowspan=<bean:write name="<%= form.FORM_NAME %>" property="rowCount"/> width="4" bgcolor="#FFFFFF" bordercolor="#E8E8E8" background="/images/icons/general/verticalline.gif">
                &nbsp;
            </td>
        <% } else { %>
            <td class="SmallColHeading" align="center" width="4" bgcolor="#FFFFFF" bordercolor="#E8E8E8">
                &nbsp;
            </td>
        <% } %>
        <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("collectionstatsvalue_ThisYear") %></td>
        <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("collectionstatsvalue_Total") %></td>
        <% if (!form.getPrint()) { %>
            <td class="SmallColHeading" align="center" rowspan=<bean:write name="<%= form.FORM_NAME %>" property="rowCount"/> width="4" bgcolor="#FFFFFF" bordercolor="#E8E8E8" background="/images/icons/general/verticalline.gif">
                &nbsp;
            </td>
        <% } else { %>
            <td class="SmallColHeading" align="center" width="4" bgcolor="#FFFFFF" bordercolor="#E8E8E8">
                &nbsp;
            </td>
        <% } %>
        <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("collectionstatsvalue_CopyCount") %></td>
    </tr>

<logic:iterate id="reportRow" name="list" type="com.follett.fsc.destiny.session.backoffice.data.StatisticsReportRow" indexId="index">
    <logic:greaterThan name="<%= form.FORM_NAME %>" property="rowCount" value="<%= String.valueOf(index.intValue() + 1) %>">
    <tr>
        <td class="ColRow" align="center" nowrap>
<%
            // Only dewey ranges link.  Individual Dewey's, prefixes and Other, and temporary items do not link
            if (!form.getPrint() && (index.intValue() < 10) && !reportRow.isTemporary() && reportRow.getLabel().length() > 3) {
                String title = form.getDrillDownHintText(reportRow.getLabel());
%>
                <base:link title="<%= title %>" page='<%= form.getDrillDownLink(reportRow.getLabel()) %>'>
                    <%= ResponseUtils.filter(reportRow.getLabel()) %>
                </base:link>
<%
            } else {
                if (CollectionStatisticsReportSpecs.ID_RANGE_NO_CALL_NUMBER.equals(reportRow.getLabelID())) { %>
                    <%=ResponseUtils.filter(MessageHelper.formatMessage("CollectionStatsForm_NoCallNumber"))%>
             <% } else if (CollectionStatisticsReportSpecs.ID_RANGE_TEMPORARY.equals(reportRow.getLabelID())) { %>
                    <%=ResponseUtils.filter(MessageHelper.formatMessage("CollectionStatsForm_Temporary"))%>
             <% } else { %>
                    <%=ResponseUtils.filter(reportRow.getLabel())%>
<%              }
            }
%>
        </td>
        <base:collStatsReportRowTag range='<%=reportRow.getLabel()%>' rangeID='<%=reportRow.getLabelID()%>'>
        <% if (form.getPrint()) { %>
            <td>&nbsp;</td>
        <% } %>
        <td class="tdAlignRight">
            <base:collStatsReportCellTag count='<%=reportRow.getCopyCountWithPrice()%>' percent='<%=reportRow.getCopyCountWithPricePercent()%>' />
        </td>
        <td class="ColRow tdAlignRight">
        	<base:localeCurrencyTag price="<%=reportRow.getActualCopyPriceTotal()%>" currencyCode="<%=lh.getRegionFormatCurrencyCharacterCode()%>"/>
        </td>
        <td class="ColRow tdAlignRight">
            <base:localeCurrencyTag price="<%=reportRow.getEstimatedCopyPriceTotal()%>" currencyCode="<%=lh.getRegionFormatCurrencyCharacterCode()%>"/>
        </td>
        <% if (form.getPrint()) { %>
            <td>&nbsp;</td>
        <% } %>
        <td class="tdAlignRight">
            <base:collStatsReportCellTag count='<%=reportRow.getThisYearCircCount()%>' percent='<%=reportRow.getThisYearCircPercent()%>' />
        </td>
        <td class="tdAlignRight">
            <base:collStatsReportCellTag count='<%=reportRow.getTotalCircCount()%>' percent='<%=reportRow.getTotalCircPercent()%>' />
        </td>
        <% if (form.getPrint()) { %>
            <td>&nbsp;</td>
        <% } %>
        <td class="tdAlignRight">
            <base:collStatsReportCellTag count='<%=reportRow.getItemCount()%>' percent='<%=reportRow.getCopyPercent()%>' />
        </td>
        </base:collStatsReportRowTag>
    </tr>
    </logic:greaterThan>
    <%-- This is the TOTAL ROW (including the line separating it from the detailed data --%>
    <logic:lessEqual name="<%= form.FORM_NAME %>" property="rowCount" value="<%= String.valueOf(index.intValue() + 1) %>">
    <tr>
        <td class="ColRowBold" valign="top" align="center" colSpan="10"><base:imageLine width="100%" height="2"/></td>
    </tr>
    <tr>
        <td class="ColRow">
            &nbsp;
        </td>
        <td class="ColRow" width="4" >
            &nbsp;
        </td>
        <td class="tdAlignRight" nowrap>
            <span class="ColRow">
                <base:localeNumberTag number="<%=reportRow.getCopyCountWithPrice()%>"/>
            </span>
        </td>
        <td class="tdAlignRight" nowrap>
            <span class="ColRow">
                <base:localeCurrencyTag price="<%=reportRow.getActualCopyPriceTotal()%>" currencyCode="<%=lh.getRegionFormatCurrencyCharacterCode()%>"/>
            </span>
        </td>
        <td class="tdAlignRight" nowrap>
            <span class="ColRow">
                <base:localeCurrencyTag price="<%=reportRow.getEstimatedCopyPriceTotal()%>" currencyCode="<%=lh.getRegionFormatCurrencyCharacterCode()%>"/>
            </span>
        </td>
        <td class="ColRow" width="4">&nbsp;</td>
        <td class="tdAlignRight" nowrap>
            <span class="ColRow">
                <base:localeNumberTag number="<%=reportRow.getThisYearCircCount()%>"/>
            </span>
        </td>
        <td class="tdAlignRight" nowrap>
            <span class="ColRow">
                <base:localeNumberTag number="<%=reportRow.getTotalCircCount()%>"/>
            </span>
        </td>
        <td class="ColRow" width="4">
            &nbsp;
        </td>
        <td class="tdAlignRight" nowrap>
            <span class="ColRow">
                <base:localeNumberTag number="<%=reportRow.getItemCount()%>"/>
            </span>
        </td>
    </tr>
    </logic:lessEqual>
</logic:iterate>
    <tr><td class="ColRowBold" valign="top" align="center" colSpan="10">
        <base:imageLine width="100%" height="2"/>
    </td></tr>
    <tr><td class="SmallColRow" colspan="10"><%= MessageHelper.formatMessage("collectionstatsvalue_TheEstimatedValueOfEachRangeAssumesThatTheAverage") %></td></tr>
</table>
