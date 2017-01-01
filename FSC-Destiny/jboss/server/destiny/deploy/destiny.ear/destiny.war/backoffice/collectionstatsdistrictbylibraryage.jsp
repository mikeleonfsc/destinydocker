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


<table id="<%=CollectionStatsDistrictByLibraryForm.TABLE_AGE_CONTENTS%>" width="100%" border="0" cellspacing="0" cellpadding="2">
    <tr bgcolor="<%=DestinyColors.BACKGROUND%>">
        <td class="InverseSmallColHeading" align="center">&nbsp;</td>
        <td class="InverseSmallColHeading" align="center" width="4">&nbsp;</td>
        <td class="InverseSmallColHeading" align="center" colspan="2"><%= MessageHelper.formatMessage("collectionstatsdistrictbylibraryage_Age") %></td>
        <td class="InverseSmallColHeading" align="center" width="4">&nbsp;</td>
        <td class="InverseSmallColHeading" align="center" colspan="2"><%= MessageHelper.formatMessage("collectionstatsdistrictbylibraryage_Circulations") %></td>
        <td class="InverseSmallColHeading" align="center" width="4">&nbsp;</td>
        <td class="InverseSmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("collectionstatsdistrictbylibraryage_Collection") %></td>
    </tr>
        <logic:iterate id="reportGroup" name="list" type="com.follett.fsc.destiny.session.backoffice.data.StatisticsReportGroup" indexId="groupIndex">
            <tr>
                <td class="SmallColHeading">
                   <bean:write name="reportGroup" property="groupName"/>
                </td>
                <logic:equal name="groupIndex" value="0">
                    <% if (!form.isPrint()) { %>
                        <td class="SmallColHeading" align="center" rowspan=<bean:write name="<%= form.FORM_NAME %>" property="rowCount"/> width="4" bgcolor="#FFFFFF" bordercolor="#E8E8E8" background="/images/icons/general/verticalline.gif">
                            &nbsp;
                        </td>
                    <% } else { %>
                        <td class="SmallColHeading" align="center" width="4" bgcolor="#FFFFFF" bordercolor="#E8E8E8">
                            &nbsp;
                        </td>
                    <% } %>
                    <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("collectionstatsdistrictbylibraryage_CopiesWDates") %></td>
                    <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("collectionstatsdistrictbylibraryage_AverageAge") %></td>
                    <% if (!form.isPrint()) { %>
                        <td class="SmallColHeading" align="center" rowspan=<bean:write name="<%= form.FORM_NAME %>" property="rowCount"/> width="4" bgcolor="#FFFFFF" bordercolor="#E8E8E8" background="/images/icons/general/verticalline.gif">
                            &nbsp;
                        </td>
                    <% } else { %>
                        <td class="SmallColHeading" align="center" width="4" bgcolor="#FFFFFF" bordercolor="#E8E8E8">
                            &nbsp;
                        </td>
                    <% } %>
                    <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("collectionstatsdistrictbylibraryage_ThisYear") %></td>
                    <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("collectionstatsdistrictbylibraryage_Total") %></td>
                    <% if (!form.isPrint()) { %>
                        <td class="SmallColHeading" align="center" rowspan=<bean:write name="<%= form.FORM_NAME %>" property="rowCount"/> width="4" bgcolor="#FFFFFF" bordercolor="#E8E8E8" background="/images/icons/general/verticalline.gif">
                            &nbsp;
                        </td>
                    <% } else { %>
                        <td class="SmallColHeading" align="center" width="4" bgcolor="#FFFFFF" bordercolor="#E8E8E8">
                            &nbsp;
                        </td>
                    <% } %>
                    <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("collectionstatsdistrictbylibraryage_CopyCount") %></td>
                </logic:equal>

                <logic:notEqual name="groupIndex" value="0">
                    <td class="SmallColHeading tdAlignRight" colspan="8">
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
                    <% if (form.isPrint()) { %>
                        <td>&nbsp;</td>
                    <% } %>
                    <td class="tdAlignRight">
                       <base:numberPercentageReportCellTag name="detailRow" count="copyCountWithAge" percent="copyCountWithAgePercent"/>
                    </td>
                    <td class="tdAlignRight">
                        <span class="ColRow"
                            ><logic:present name="detailRow" property="averagePubDate"><bean:write name="detailRow" property="averagePubDate"/></logic:present
                            ><logic:notPresent name="detailRow" property="averagePubDate">-</logic:notPresent
                            >&nbsp;</span
                        ><span class="SmallColRow"
                            ><logic:present name="detailRow" property="averageAge"><%= MessageHelper.formatMessage("collectionstatsdistrictbylibraryage_Yrs", Long.valueOf(detailRow.getAverageAge())) %></logic:present
                            ><logic:notPresent name="detailRow" property="averageAge"><%= MessageHelper.formatMessage("collectionstatsdistrictbylibraryage_YrsNone") %></logic:notPresent
                        ></span>
                    </td>
                    <% if (form.isPrint()) { %>
                        <td>&nbsp;</td>
                    <% } %>
                    <td class="tdAlignRight">
                        <base:numberPercentageReportCellTag name="detailRow" count="thisYearCircCount" percent="thisYearCircPercent"/>
                    </td>
                    <td class="tdAlignRight">
                        <base:numberPercentageReportCellTag name="detailRow" count="totalCircCount" percent="totalCircPercent"/>
                    </td>
                    <% if (form.isPrint()) { %>
                        <td>&nbsp;</td>
                    <% } %>
                    <td class="tdAlignRight">
                        <base:numberPercentageReportCellTag name="detailRow" count="itemCount" percent="copyPercent"/>
                    </td>

               </tr>
           </logic:iterate>

           <%-- Output the summary for the library type group here --%>
           <% if (form.isGroupByLibraryType()) { %> <%-- this fails! <logic:equal name="backoffice_servlet_CollectionStatsDistrictByLibraryForm" property="groupByLibraryType" value="true"/> --%>
            <bean:define id="groupTotalRow" name="reportGroup" property="totalRow" type="StatisticsReportRow"/>
            <tr>
                <td class="ColRow">
                   &nbsp;
                </td>
                    <% if (form.isPrint()) { %>
                        <td>&nbsp;</td>
                    <% } %>
                <td class="tdAlignRight">

                    <base:numberPercentageReportCellTag name="groupTotalRow" count="copyCountWithAge" percent="copyCountWithAgePercent" countClass="ColRowBold"/>
                </td>
                <td class="tdAlignRight">
                    <span class="ColRowBold"
                        ><logic:present name="groupTotalRow" property="averagePubDate"><bean:write name="groupTotalRow" property="averagePubDate"/></logic:present
                        ><logic:notPresent name="groupTotalRow" property="averagePubDate">-</logic:notPresent
                        >&nbsp;</span
                    ><span class="SmallColRow"
                        ><logic:present name="groupTotalRow" property="averageAge"><%= MessageHelper.formatMessage("collectionstatsdistrictbylibraryage_Yrs", Long.valueOf(groupTotalRow.getAverageAge())) %></logic:present
                        ><logic:notPresent name="groupTotalRow" property="averageAge"><%= MessageHelper.formatMessage("collectionstatsdistrictbylibraryage_YrsNone") %></logic:notPresent
                    ></span>
                </td>
                    <% if (form.isPrint()) { %>
                        <td>&nbsp;</td>
                    <% } %>
                <td class="tdAlignRight">
                    <base:numberPercentageReportCellTag name="groupTotalRow" count="thisYearCircCount" percent="thisYearCircPercent" countClass="ColRowBold"/>
                </td>
                <td class="tdAlignRight">
                    <base:numberPercentageReportCellTag name="groupTotalRow" count="totalCircCount" percent="totalCircPercent" countClass="ColRowBold"/>
                </td>
                    <% if (form.isPrint()) { %>
                        <td>&nbsp;</td>
                    <% } %>
                <td class="tdAlignRight">
                    <base:numberPercentageReportCellTag name="groupTotalRow" count="itemCount" percent="copyPercent" countClass="ColRowBold"/>
                </td>

            </tr>
         <% } %> <%-- </logic:equal> --%>
        </logic:iterate>
        <tr>
            <td class="ColRowBold" valign="top" align="center" colSpan="9"><base:imageLine width="100%" height="2"/></td>
        </tr>
        <%-- write the Big Dog total row at the botton --%>
        <tr>
            <td class="SmallColHeading">
               <bean:write name="backoffice_servlet_CollectionStatsDistrictByLibraryForm" property="districtName"/>
            </td>
            <td class="ColRow" width="4">
                &nbsp;
            </td>
            <td class="tdAlignRight">
                <base:numberPercentageReportCellTag name="totalRow" count="copyCountWithAge" countClass="ColRowBold"/>
            </td>
            <td class="tdAlignRight">
                <span class="ColRowBold"
                    ><logic:present name="totalRow" property="averagePubDate"><bean:write name="totalRow" property="averagePubDate"/></logic:present
                    ><logic:notPresent name="totalRow" property="averagePubDate">-</logic:notPresent
                    >&nbsp;</span
                ><span class="SmallColRow"
                    ><logic:present name="totalRow" property="averageAge"><%= MessageHelper.formatMessage("collectionstatsdistrictbylibraryage_Yrs", Long.valueOf(totalRow.getAverageAge())) %></logic:present
                    ><logic:notPresent name="totalRow" property="averageAge"><%= MessageHelper.formatMessage("collectionstatsdistrictbylibraryage_YrsNone") %></logic:notPresent
                ></span>
            </td>
            <td class="ColRow" width="4">
                &nbsp;
            </td>
            <td class="tdAlignRight">
                <base:numberPercentageReportCellTag name="totalRow" count="thisYearCircCount" countClass="ColRowBold"/>
            </td>
            <td class="tdAlignRight">
                <base:numberPercentageReportCellTag name="totalRow" count="totalCircCount" countClass="ColRowBold"/>
            </td>
            <td class="ColRow" width="4">
                &nbsp;
            </td>
            <td class="tdAlignRight">
                <base:numberPercentageReportCellTag name="totalRow" count="itemCount" countClass="ColRowBold"/>
            </td>
        </tr>
        <logic:equal name="backoffice_servlet_CollectionStatsDistrictByLibraryForm" property="print" value="true">
            <tr>
                <td class="ColRowBold" valign="top" align="center" colSpan="9"><base:imageLine width="100%" height="2"/></td>
            </tr>
            <tr>
                <td colspan="9" align="center" class="Instruction"><%= MessageHelper.formatMessage("collectionstatsdistrictbylibraryage_ReportGeneratedOn", form.getTimeOfGeneration(session)) %></td>
            </tr>
        </logic:equal>
<%-- end of age big dog total --%>
        </table>
