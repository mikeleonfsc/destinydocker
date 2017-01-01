<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LoginFacadeSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.ejb.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>


<bean:define id="form" name="backoffice_servlet_CollectionStatsDistrictByLibraryForm" type="CollectionStatsDistrictByLibraryForm"/>
<bean:define id="list" name="backoffice_servlet_CollectionStatsDistrictByLibraryForm" property="list" type="Collection"/>
<bean:define id="totalRow" name="backoffice_servlet_CollectionStatsDistrictByLibraryForm" property="totalRow" type="StatisticsReportRow"/>

<table id="<%= CollectionStatsDistrictByLibraryForm.TABLE_VALUE_CONTENTS %>" width="100%" border="0" cellspacing="0" cellpadding="2">
    <tr bgcolor="<%=DestinyColors.BACKGROUND%>">
        <td class="InverseSmallColHeading" align="center">&nbsp;</td>
        <td class="InverseSmallColHeading" align="center" width="4">&nbsp;</td>
        <td class="InverseSmallColHeading" align="center" colspan="3"><%= MessageHelper.formatMessage("collectionstatsdistrictbylibraryvalue_Value") %></td>
        <td class="InverseSmallColHeading" align="center" width="4">&nbsp;</td>
        <td class="InverseSmallColHeading" align="center" colspan="2"><%= MessageHelper.formatMessage("collectionstatsdistrictbylibraryvalue_Circulations") %></td>
        <td class="InverseSmallColHeading" align="center" width="4">&nbsp;</td>
        <td class="InverseSmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("collectionstatsdistrictbylibraryvalue_Collection") %></td>
    </tr>
    <logic:iterate id="reportGroup" name="list" type="com.follett.fsc.destiny.session.backoffice.data.StatisticsReportGroup" indexId="groupIndex">
        <tr>
            <td class="SmallColHeading">
               <bean:write name="reportGroup" property="groupName"/>
            </td>
            <logic:equal name="groupIndex" value="0">
                <td class="SmallColHeading" align="center" rowspan=<bean:write name="<%= form.FORM_NAME %>" property="rowCount"/> width="4" bgcolor="#FFFFFF" bordercolor="#E8E8E8" background="/images/icons/general/verticalline.gif">
                    &nbsp;
                </td>
                <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("collectionstatsdistrictbylibraryvalue_CopiesWPrices") %></td>
                <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("collectionstatsdistrictbylibraryvalue_ActualValue") %></td>
                <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("collectionstatsdistrictbylibraryvalue_EstimatedValue") %></td>
                <td class="SmallColHeading" align="center" rowspan=<bean:write name="<%= form.FORM_NAME %>" property="rowCount"/> width="4" bgcolor="#FFFFFF" bordercolor="#E8E8E8" background="/images/icons/general/verticalline.gif">
                    &nbsp;
                </td>
                <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("collectionstatsdistrictbylibraryvalue_ThisYear") %></td>
                <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("collectionstatsdistrictbylibraryvalue_Total") %></td>
                <td class="SmallColHeading" align="center" rowspan=<bean:write name="<%= form.FORM_NAME %>" property="rowCount"/> width="4" bgcolor="#FFFFFF" bordercolor="#E8E8E8" background="/images/icons/general/verticalline.gif">
                    &nbsp;
                </td>
                <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("collectionstatsdistrictbylibraryvalue_CopyCount") %></td>
            </logic:equal>

            <logic:notEqual name="groupIndex" value="0">
                <td class="SmallColHeading tdAlignRight" colspan="9">
                   &nbsp;
                </td>
            </logic:notEqual>
        </tr>
       <logic:iterate id="detailRow" name="reportGroup" property="detailRows" type="com.follett.fsc.destiny.session.backoffice.data.StatisticsReportRow" indexId="detailIndex">
           <tr>
                <td class="ColRow">
                        &nbsp;
                    <%-- not printing, so display the link --%>
                    <logic:equal name="backoffice_servlet_CollectionStatsDistrictByLibraryForm" property="print" value="false">
                        <base:link page="<%= form.getSiteDrillInLink(detailRow.getSiteID()) %>">
                            <bean:write name="detailRow" property="label"/>
                        </base:link>
                    </logic:equal>

                    <%-- printing, so do NOT display the link --%>
                    <logic:equal name="backoffice_servlet_CollectionStatsDistrictByLibraryForm" property="print" value="true">
                            <bean:write name="detailRow" property="label"/>
                    </logic:equal>
                </td>
                <td class="tdAlignRight">
                   <base:numberPercentageReportCellTag name="detailRow" count="copyCountWithPrice" percent="copyCountWithPricePercent"/>
                </td>
                <td class="tdAlignRight" nowrap>
                    <base:priceFormatCellTag name="detailRow" price="actualCopyPriceTotal" priceClass="ColRow" currencyCode="currencyCode"/>
                </td>
                <td class="tdAlignRight" nowrap>
                    <base:priceFormatCellTag name="detailRow" price="estimatedCopyPriceTotal" priceClass="ColRow" currencyCode="currencyCode"/>
                </td>
                <td class="tdAlignRight">
                    <base:numberPercentageReportCellTag name="detailRow" count="thisYearCircCount" percent="thisYearCircPercent"/>
                </td>
                <td class="tdAlignRight">
                    <base:numberPercentageReportCellTag name="detailRow" count="totalCircCount" percent="totalCircPercent"/>
                </td>
                <td class="tdAlignRight">
                    <base:numberPercentageReportCellTag name="detailRow" count="itemCount" percent="copyPercent"/>
                </td>
           </tr>
       </logic:iterate>

       <%-- Output the summary for the library type group here <logic:notEmpty name="reportGroup" property="totalRow"/> </logic:notEmpty> --%>
       <% if (form.isGroupByLibraryType()) { %>
        <bean:define id="groupTotalRow" name="reportGroup" property="totalRow" type="StatisticsReportRow"/>
        <tr>
            <td class="SmallColHeading tdAlignRight">
               &nbsp;
            </td>
            <td class="tdAlignRight">
               <span class="SmallColHeading"><%= MessageHelper.formatMessage("collectionstatsdistrictbylibraryvalue_Total") %>&nbsp;</span>
               <base:numberPercentageReportCellTag name="groupTotalRow" count="copyCountWithPrice" countClass="ColRowBold" percent="copyCountWithPricePercent"/>
            </td>
            <td class="tdAlignRight" nowrap>
                <base:priceFormatCellTag name="groupTotalRow" price="actualCopyPriceTotal" priceClass="ColRowBold" currencyCode="currencyCode"/>
            </td>
            <td class="tdAlignRight" nowrap>
                <base:priceFormatCellTag name="groupTotalRow" price="estimatedCopyPriceTotal" priceClass="ColRowBold" currencyCode="currencyCode"/>
            </td>
            <td class="tdAlignRight">
                <base:numberPercentageReportCellTag name="groupTotalRow" count="thisYearCircCount" countClass="ColRowBold" percent="thisYearCircPercent"/>
            </td>
            <td class="tdAlignRight">
                <base:numberPercentageReportCellTag name="groupTotalRow" count="totalCircCount" countClass="ColRowBold" percent="totalCircPercent"/>
            </td>
            <td class="tdAlignRight">
                <base:numberPercentageReportCellTag name="groupTotalRow" count="itemCount" countClass="ColRowBold" percent="copyPercent"/>
            </td>
        </tr>
     <% } %>
    </logic:iterate>
    <tr>
        <td class="ColRowBold" valign="top" align="center" colSpan="10"><base:imageLine width="100%" height="2"/></td>
    </tr>
    <%-- write the Big Dog total row at the botton --%>
    <tr>
        <td class="SmallColHeading">
           <bean:write name="backoffice_servlet_CollectionStatsDistrictByLibraryForm" property="districtName"/>
        </td>
        <td class="SmallColHeading tdAlignRight">
           &nbsp;
        </td>
        <td class="tdAlignRight">
            <base:numberPercentageReportCellTag name="totalRow" count="copyCountWithPrice" countClass="ColRowBold"/>
        </td>
        <td class="tdAlignRight" nowrap>
            <base:priceFormatCellTag name="totalRow" price="actualCopyPriceTotal" priceClass="ColRowBold" currencyCode="currencyCode"/>
        </td>
        <td class="tdAlignRight" nowrap>
            <base:priceFormatCellTag name="totalRow" price="estimatedCopyPriceTotal" priceClass="ColRowBold" currencyCode="currencyCode"/>
        </td>
        <td class="SmallColHeading tdAlignRight">
           &nbsp;
        </td>
        <td class="tdAlignRight">
            <base:numberPercentageReportCellTag name="totalRow" count="thisYearCircCount" countClass="ColRowBold"/>
        </td>
        <td class="tdAlignRight">
            <base:numberPercentageReportCellTag name="totalRow" count="totalCircCount" countClass="ColRowBold"/>
        </td>
        <td class="SmallColHeading tdAlignRight">
           &nbsp;
        </td>
        <td class="tdAlignRight">
            <base:numberPercentageReportCellTag name="totalRow" count="itemCount" countClass="ColRowBold"/>
        </td>
    </tr>

    <tr><td class="ColRowBold" valign="top" align="center" colSpan="10">
        <base:imageLine width="100%" height="2"/>
    </td></tr>
    <tr><td class="SmallColRow" colspan="10"><%= MessageHelper.formatMessage("collectionstatsdistrictbylibraryvalue_TheEstimatedValueOfEachRangeAssumesThatTheAverageO") %></td></tr>
        <logic:equal name="backoffice_servlet_CollectionStatsDistrictByLibraryForm" property="print" value="true">
            <tr>
                <td class="ColRowBold" valign="top" align="center" colSpan="10"><base:imageLine width="100%" height="2"/></td>
            </tr>
            <tr>
                <td colspan="9" align="center" class="Instruction"><%= MessageHelper.formatMessage("collectionstatsdistrictbylibraryvalue_ReportGeneratedOn", form.getTimeOfGeneration(session))%></td>
            </tr>
        </logic:equal>

</table>
