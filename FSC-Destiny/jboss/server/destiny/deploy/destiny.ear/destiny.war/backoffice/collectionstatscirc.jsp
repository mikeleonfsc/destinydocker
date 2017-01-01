<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LoginFacadeSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.session.circulation.ejb.*" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.ejb.CollectionStatisticsReportSpecs"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>

<bean:define id="form" name="backoffice_servlet_CollectionStatsForm" type="CollectionStatsForm"/>
<bean:define id="list" name="backoffice_servlet_CollectionStatsForm" property="list" type="List"/>

        <table id="colheading1" width="100%" border="0" cellspacing="0" cellpadding="2">
            <tr bgcolor="<%=DestinyColors.BACKGROUND%>">
                <td class="InverseSmallColHeading" align="center">&nbsp;</td>
                <td class="InverseSmallColHeading" align="center">&nbsp;</td>
                <td class="InverseSmallColHeading" align="center" colspan="4"><%= MessageHelper.formatMessage("collectionstatscirc_Circulations") %></td>
                <td class="InverseSmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("collectionstatscirc_Collection") %></td>
            </tr>
        </table>

        <table id="<%=CollectionStatsForm.TABLE_CIRC_CONTENTS%>" width="100%" cellspacing="0" cellpadding="2" border="0">
            <tr>
                <td class="SmallColHeading">&nbsp;</td>
                <td class="SmallColHeading" align="center"><%= MessageHelper.formatMessage("collectionstatscirc_Range") %></td>
                <% if (!form.getPrint()) { %>
                    <td class="SmallColHeading" align="center" rowspan=<bean:write name="<%= form.FORM_NAME %>" property="rowCount"/> width="4" bgcolor="#FFFFFF" bordercolor="#E8E8E8" background="/images/icons/general/verticalline.gif">
                        &nbsp;
                    </td>
                <% } else { %>
                    <td class="SmallColHeading" align="center" width="4" bgcolor="#FFFFFF" bordercolor="#E8E8E8">
                        &nbsp;
                    </td>
                <% } %>
                <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("collectionstatscirc_Today") %></td>
                <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("collectionstatscirc_ThisMonth") %></td>
                <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("collectionstatscirc_ThisYear") %></td>
                <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("collectionstatscirc_Total") %></td>
                <% if (!form.getPrint()) { %>
                    <td class="SmallColHeading" align="center" rowspan=<bean:write name="<%= form.FORM_NAME %>" property="rowCount"/> width="4" bgcolor="#FFFFFF" bordercolor="#E8E8E8" background="/images/icons/general/verticalline.gif">
                        &nbsp;
                    </td>
                <% } else { %>
                    <td class="SmallColHeading" align="center" width="4" bgcolor="#FFFFFF" bordercolor="#E8E8E8">
                        &nbsp;
                    </td>
                <% } %>
                <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("collectionstatscirc_CopyCount") %></td>
            </tr>
        <logic:iterate id="reportRow" name="list" type="com.follett.fsc.destiny.session.backoffice.data.StatisticsReportRow" indexId="index">
            <logic:greaterThan name="<%= form.FORM_NAME %>" property="rowCount" value="<%= String.valueOf(index.intValue() + 1) %>">
            <%
                boolean thisRowIsDewey = index.intValue() < 10;
            %>
                    <tr>
                        <td class="ColRow" align="center">
                            <% if ( (!form.getPrint()) &&
                                    (form.getDataMode().intValue() != CollectionStatsForm.USER_DISTRICT_VIEWING_DISTICT)) { %>
                                <html:multibox property="<%=CollectionStatsForm.FIELD_SELECTED_RANGES%>" >
                                    <%=reportRow.getCopyDetailRangeKey()%>
                                </html:multibox>
                            <% } else { %>
                                &nbsp;
                            <% } %>
                        </td>

                        <td class="ColRow" align="center">
            <%
                        // Only dewey ranges link.  Individual Dewey's, prefixes and Other, and temporary items do not link
                        if (!form.getPrint()
                                && thisRowIsDewey
                                && !reportRow.isTemporary()
                                && reportRow.getLabel().length() > 3
                                ){
                            String title = form.getDrillDownHintText(reportRow.getLabel());
            %>
                            <base:link title="<%=title%>" page='<%= form.getDrillDownLink(reportRow.getLabel())%>'>
                                <%=ResponseUtils.filter(reportRow.getLabel())%>
                           </base:link>
            <%          } else {  
                            if (CollectionStatisticsReportSpecs.ID_RANGE_NO_CALL_NUMBER.equals(reportRow.getLabelID())) { %>
                                <%=ResponseUtils.filter(MessageHelper.formatMessage("CollectionStatsForm_NoCallNumber"))%>
                         <% } else if (CollectionStatisticsReportSpecs.ID_RANGE_TEMPORARY.equals(reportRow.getLabelID())) { %>
                                <%=ResponseUtils.filter(MessageHelper.formatMessage("CollectionStatsForm_Temporary"))%>
                         <% } else { %>
                                <%=ResponseUtils.filter(reportRow.getLabel())%>
            <%              }
                        } %>


                        </td>
                        <base:collStatsReportRowTag range='<%=reportRow.getLabel()%>'
                            rangeID='<%=reportRow.getLabelID()%>'
                            enableLink='<%= ((!form.getPrint()) && (form.getDataMode().intValue() != CollectionStatsForm.USER_DISTRICT_VIEWING_DISTICT))%>'
                            startDewey='<%=reportRow.getFromDeweyNormalizedKey()%>'
                            endDewey='<%=reportRow.getToDeweyNormalizedKey()%>'
                            temporary='<%=reportRow.isTemporary()%>'
                            groupByPrefix='<%=form.isGroupByPrefix() %>'
                            reportSiteID='<%=form.getReportSiteID()%>'>
                        <% if (form.getPrint()) { %>
                            <td>&nbsp;</td>
                        <% } %>
                        <td class="tdAlignRight" nowrap="nowrap">
                            <base:collStatsReportCellTag count='<%=reportRow.getTodayCircCount()%>' percent='<%=reportRow.getTodayCircPercent()%>' columnID='<%=BaseCircReportForm.CIRCULATION_REPORT_TODAY%>' />
                        </td>
                        <td class="tdAlignRight" nowrap="nowrap">
                            <base:collStatsReportCellTag count='<%=reportRow.getThisMonthCircCount()%>' percent='<%=reportRow.getThisMonthCircPercent()%>' columnID='<%=BaseCircReportForm.CIRCULATION_REPORT_THIS_MONTH%>' />
                        </td>
                        <td class="tdAlignRight" nowrap="nowrap">
                            <base:collStatsReportCellTag count='<%=reportRow.getThisYearCircCount()%>' percent='<%=reportRow.getThisYearCircPercent()%>'  columnID='<%=BaseCircReportForm.CIRCULATION_REPORT_THIS_YEAR%>' />
                        </td>
                        <td class="tdAlignRight" nowrap="nowrap">
                            <base:collStatsReportCellTag count='<%=reportRow.getTotalCircCount()%>' percent='<%=reportRow.getTotalCircPercent()%>'  columnID='<%=BaseCircReportForm.REPORT_COLUMN_CIRC_TOTAL%>' />
                        </td>
                        <% if (form.getPrint()) { %>
                            <td>&nbsp;</td>
                        <% } %>
                        <td class="tdAlignRight" nowrap="nowrap">
                            <base:collStatsReportCellTag count='<%=reportRow.getItemCount()%>' percent='<%=reportRow.getCopyPercent()%>'  columnID='<%=BaseCircReportForm.REPORT_COLUMN_COPY_COUNT%>' />
                        </td>
                        </base:collStatsReportRowTag>
                    </tr>
                </logic:greaterThan>
                <%-- This is the TOTAL ROW (including the line separating it from the detailed data --%>
                <logic:lessEqual name="<%= form.FORM_NAME %>" property="rowCount" value="<%= String.valueOf(index.intValue() + 1) %>">
                <tr>
                    <td class="ColRowBold" valign="top" align="center" colSpan="9"><base:imageLine width="100%" height="2"/></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td width='4'>&nbsp;</td>
                    <base:collStatsReportRowTag range='<%=reportRow.getLabel()%>'
                        rangeID='<%=reportRow.getLabelID()%>'
                        enableLink='<%= ((!form.getPrint()) && (form.getDataMode().intValue() != CollectionStatsForm.USER_DISTRICT_VIEWING_DISTICT))%>'
                        totalsRow='true'
                        startDewey='<%=new Long(form.getStartDewey())%>'
                        endDewey='<%=new Long(form.getEndDewey())%>'
                        groupByPrefix='<%=form.isGroupByPrefix() %>'
                        reportSiteID='<%=form.getReportSiteID()%>'>
                    <td class="tdAlignRight" nowrap="nowrap">
                        <base:collStatsReportCellTag count='<%=reportRow.getTodayCircCount()%>' percent='<%=reportRow.getTodayCircPercent()%>' columnID='<%=BaseCircReportForm.CIRCULATION_REPORT_TODAY%>' />
                    </td>
                    <td class="tdAlignRight" nowrap="nowrap">
                        <base:collStatsReportCellTag count='<%=reportRow.getThisMonthCircCount()%>' percent='<%=reportRow.getThisMonthCircPercent()%>' columnID='<%=BaseCircReportForm.CIRCULATION_REPORT_THIS_MONTH%>' />
                    </td>
                    <td class="tdAlignRight" nowrap="nowrap">
                        <base:collStatsReportCellTag count='<%=reportRow.getThisYearCircCount()%>' percent='<%=reportRow.getThisYearCircPercent()%>'  columnID='<%=BaseCircReportForm.CIRCULATION_REPORT_THIS_YEAR%>' />
                    </td>
                    <td class="tdAlignRight" nowrap="nowrap">
                        <base:collStatsReportCellTag count='<%=reportRow.getTotalCircCount()%>' percent='<%=reportRow.getTotalCircPercent()%>'  columnID='<%=BaseCircReportForm.REPORT_COLUMN_CIRC_TOTAL%>' />
                    </td>
                    <td width='4'>&nbsp;</td>
                    <td class="tdAlignRight" nowrap="nowrap">
                        <base:collStatsReportCellTag count='<%=reportRow.getItemCount()%>' percent='<%=reportRow.getCopyPercent()%>'  columnID='<%=BaseCircReportForm.REPORT_COLUMN_COPY_COUNT%>' />
                    </td>
                    </base:collStatsReportRowTag>
                </tr>
                </logic:lessEqual>
            </logic:iterate>
            <tr>
                <td class="Instruction" colspan="9"><%= MessageHelper.formatMessage("collectionstatscirc_NOTETheCollectionStatisticsSummaryReportIncludesSt") %></td>
            </tr>
            <tr>
                <td class="ColRowBold" valign="top" align="center" colSpan="9"><base:imageLine width="100%" height="2"/></td>
            </tr>
        </table>
<%-- From here down is the Customize Copy View section with all controls --%>
<br>
    <%
        if ((!form.getPrint()) && (form.getDataMode().intValue() != CollectionStatsForm.USER_DISTRICT_VIEWING_DISTICT)) {
    %>
        <table id=<%=CollectionStatsForm.TABLE_CUSTOMIZE_COPY_VIEW%> cellspacing="0" cellpadding="4" border="0" align="center">
            <tr>
                <td class="SmallColHeading" colspan="3" nowrap><base:link linkName="<%= CollectionStatsForm.ANCHOR_CUSTOMIZE_COPY_VIEW %>" /><%= MessageHelper.formatMessage("collectionstatscirc_CustomizeCopyView") %>
                <% if ( !form.getPrint() ) { %>
                    <base:helpTag helpFileName="t_customize_copy_view_collection_stats_report.htm"/>
                <% } %>
                </td>
            </tr>
            <tr>
                <td class="Instruction" colspan="3"><%= MessageHelper.formatMessage("collectionstatscirc_UseTheFollowingOptionsToCreateACustomizedCopyCircu") %></td>
            </tr>
            <tr>
                <td class="ColHeading" colspan="3"><%= MessageHelper.formatMessage("collectionstatscirc_ViewCopyDetails") %></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td class="ColRow"><%= MessageHelper.formatMessage("collectionstatscirc_CallNumbers") %></td>
                <td class="ColRow" nowrap>
                <html:radio property="<%=CollectionStatsForm.FIELD_CALL_NUMBER_RANGE%>" value="<%=CollectionStatsForm.CIRCULATION_REPORT_DISPLAYED%>"><%= MessageHelper.formatMessage("collectionstatscirc_RangesDisplayedInTheSummaryAbove") %></html:radio>
                <base:helpTag helpFileName="t_select_call_number_range_collection_stats_report.htm"/>
                </td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td class="ColRow" nowrap><html:radio property="<%=CollectionStatsForm.FIELD_CALL_NUMBER_RANGE%>" value="<%=BaseCircReportForm.CIRCULATION_REPORT_SELECTED%>"><%= MessageHelper.formatMessage("collectionstatscirc_RangesSelectedAbove") %></html:radio></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td class="ColRow"><html:radio property="<%=CollectionStatsForm.FIELD_CALL_NUMBER_RANGE%>" value="<%=BaseCircReportForm.CIRCULATION_REPORT_ALL%>"><%= MessageHelper.formatMessage("collectionstatscirc_AllRangesAndPrefixesInTheCollection") %></html:radio></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td class="ColRow"><%= MessageHelper.formatMessage("collectionstatscirc_Circulations") %></td>
                <td class="ColRow">
                <html:radio property="<%=CollectionStatsForm.FIELD_DATE_LIMIT_TYPE%>" value="<%=BaseCircReportForm.CIRCULATION_REPORT_ANY%>"><%= MessageHelper.formatMessage("collectionstatscirc_AtAnyTime") %></html:radio>
                <base:helpTag helpFileName="t_select_date_range_collection_stats_report.htm"/>
                </td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td class="ColRow"><html:radio property="<%=CollectionStatsForm.FIELD_DATE_LIMIT_TYPE%>" value="<%=BaseCircReportForm.CIRCULATION_REPORT_PRESET%>"></html:radio>
                        <html:select property="<%=CollectionStatsForm.FIELD_DATE_SEARCH_TYPE%>">
                        <html:option value="<%=BaseCircReportForm.CIRCULATION_REPORT_TODAY %>"><%= MessageHelper.formatMessage("collectionstatscirc_Today") %></html:option>
                        <html:option value="<%=BaseCircReportForm.CIRCULATION_REPORT_THIS_MONTH %>"><%= MessageHelper.formatMessage("collectionstatscirc_ThisMonth") %></html:option>
                        <html:option value="<%=BaseCircReportForm.CIRCULATION_REPORT_LAST_MONTH %>"><%= MessageHelper.formatMessage("collectionstatscirc_LastMonth") %></html:option>
                        <html:option value="<%=BaseCircReportForm.CIRCULATION_REPORT_THIS_YEAR %>"><%= MessageHelper.formatMessage("collectionstatscirc_ThisYear") %></html:option>
                        <html:option value="<%=BaseCircReportForm.CIRCULATION_REPORT_LAST_YEAR %>"><%= MessageHelper.formatMessage("collectionstatscirc_LastYear") %></html:option>
                        </html:select>
                </td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
		        <td class="ColRow" valign="bottom">
                    <html:radio property="<%=CollectionStatsForm.FIELD_DATE_LIMIT_TYPE%>" value="<%=BaseCircReportForm.CIRCULATION_REPORT_USERDEFINED%>"></html:radio>
                    <%= MessageHelper.formatMessage("collectionstatscirc_From") %> 
                    <base:dateRange 
		            	dateFrom="<%=form.getDateFrom()%>"
		            	dateTo="<%=form.getDateTo()%>"
		            />
		        </td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td class="ColRow"><%= MessageHelper.formatMessage("collectionstatscirc_NumberOfCirculations") %></td>
                <td class="ColRow"><html:radio property="<%=CollectionStatsForm.FIELD_CIRCS_LIMIT%>" value="<%=BaseCircReportForm.CIRCULATION_REPORT_ANY%>"><%= MessageHelper.formatMessage("collectionstatscirc_AnyNumberOfTimes","<nobr>","</nobr> <nobr>","</nobr>") %> </html:radio></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td class="ColRow"><html:radio property="<%=CollectionStatsForm.FIELD_CIRCS_LIMIT%>" value="<%=BaseCircReportForm.CIRCULATION_REPORT_PRESET%>"></html:radio>
                        <html:select property="<%=CollectionStatsForm.FIELD_CIRC_SEARCH_TYPE%>">
                        <html:option value="<%=BaseCircReportForm.CIRCULATION_REPORT_LESS_THAN %>"><%= MessageHelper.formatMessage("collectionstatscirc_LessThan") %></html:option>
                        <html:option value="<%=BaseCircReportForm.CIRCULATION_REPORT_MORE_THAN %>"><%= MessageHelper.formatMessage("collectionstatscirc_MoreThan") %></html:option>
                        </html:select>
                        <html:text property="<%=CollectionStatsForm.FIELD_CIRC_NUMBER%>" size="7" maxlength="7"/><%= MessageHelper.formatMessage("collectionstatscirc_Times") %></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td class="ColRow"><%= MessageHelper.formatMessage("collectionstatscirc_GroupedOn") %></td>
                <td class="ColRow" >
                <html:radio property="<%=CollectionStatsForm.FIELD_SORT_ON%>" value="<%=BaseCircReportForm.CIRCULATION_REPORT_PREFIX%>"><%= MessageHelper.formatMessage("collectionstatscirc_CallNumberPrefix") %></html:radio>
                <base:helpTag helpFileName="d_group_by_collection_stats_report.htm"/>
                </td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td class="ColRow" ><html:radio property="<%=CollectionStatsForm.FIELD_SORT_ON%>" value="<%=BaseCircReportForm.CIRCULATION_REPORT_DEWEY%>"><%= MessageHelper.formatMessage("collectionstatscirc_DeweyCallNumber") %></html:radio></td>
            </tr>
            <tr>
                <td class="ColRowBold" colspan="3" align="center">
                    <base:showHideTag id="hideViewDetails">
                    <base:genericButton onclick="hideElementhideViewDetails()" src="/buttons/large/viewdetails.gif" alt='<%= MessageHelper.formatMessage("viewDetails") %>' name="<%= CollectionStatsForm.BUTTON_VIEW_DETAILS %>" />
                    </base:showHideTag >
                </td>
            </tr>
        </table>
    <%  }  else { %>
        <div align="center"><span class="Instruction"><%= MessageHelper.formatMessage("collectionstatscirc_ReportGeneratedOn", form.getTimeOfGeneration(session)) %><br></span></div>
    <%  } %>

