<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LoginFacadeSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.session.circulation.ejb.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.StringWithSortableVO" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>



<base:messageBox strutsErrors="true"/>

<bean:define id="form" name="backoffice_servlet_PatronStatsSummaryForm" type="PatronStatsSummaryForm"/>

<script type="text/javascript">
function doOnSubmit() {
    var form = document.<%=PatronStatsSummaryForm.FORM_NAME %>;
    var printerFriendlyHidden = document.<%=PatronStatsSummaryForm.FORM_NAME %>.<%= PatronStatsSummaryForm.PARAM_PRINTER_FRIENDLY %>;
    if (form.printerFriendlyClicked) {
        form.printerFriendlyClicked = false;
        form.target="printerFriendly";
        printerFriendlyHidden.value = "on";
    } else {
        form.target = "";
        printerFriendlyHidden.value = "";
    }
}
</script>

<base:form action="/backoffice/servlet/handlepatronstatssummaryform.do" onsubmit="doOnSubmit()" disableIntercepter="true">

<html:hidden property="<%= PatronStatsSummaryForm.FIELD_GROUP_BY_PRIMARY_DROPDOWN_DATA %>"/>
<html:hidden property="<%= PatronStatsSummaryForm.FIELD_GROUP_BY_PRIMARY_DROPDOWN %>"/>
<html:hidden property="<%= PatronStatsSummaryForm.FIELD_GROUP_BY_SECONDARY_DROPDOWN %>"/>
<html:hidden property="<%= PatronStatsSummaryForm.FIELD_GROUP_BY_PRIMARY_DROPDOWN_DATA %>"/>
<html:hidden property="<%= PatronStatsSummaryForm.FIELD_GROUP_BY_SECONDARY_DROPDOWN_DATA %>"/>
<html:hidden property="<%= PatronStatsSummaryForm.FIELD_INCLUDE_ACTIVE %>"/>
<html:hidden property="<%= PatronStatsSummaryForm.FIELD_INCLUDE_RESTRICTED %>"/>
<html:hidden property="<%= PatronStatsSummaryForm.FIELD_INCLUDE_INACTIVE %>"/>
<html:hidden property="<%= PatronStatsSummaryForm.FIELD_LIBRARY_SELECTED %>"/>
<input type="hidden" name="<%= PatronStatsSummaryForm.PARAM_PRINTER_FRIENDLY %>" value="">

<%-- html:hidden property="<%= PatronStatsSummaryForm.FIELD_SELECTED_PATRON_TYPES %>"/ --%>
<%  String[] patronTypes = form.getPatronTypeLimiter();
    for (int i = 0; i < patronTypes.length; i++ ) {
        %>
        <html:hidden property="<%= PatronStatsSummaryForm.FIELD_SELECTED_PATRON_TYPES %>" value="<%=patronTypes[i]%>"/>
        <%
    }
    %>
    <table id="<%=PatronStatsSummaryForm.TABLE_OUTER%>" width="99%" border="0" cellspacing="0" cellpadding="0">
        <tr><td>
        <logic:notEmpty name="form" property="list">
            <bean:define id="list" name="backoffice_servlet_PatronStatsSummaryForm" property="list" type="TreeSet"/>
            <bean:define id="totalRow" name="backoffice_servlet_PatronStatsSummaryForm" property="totalRow" type="StatisticsReportRow"/>

        <table id="content" width="100%" border="1" bordercolor="#C0C0C0" cellspacing="0" cellpadding="0">
            <tr>
            <td>
            <table id="<%=PatronStatsSummaryForm.TABLE_PRINTER_FRIENDLY_HEADER%>" width="100%" border="0" cellspacing="0" cellpadding="2">
            <tr>
            <logic:equal name="backoffice_servlet_PatronStatsSummaryForm" property="print" value="false">
                <td class="SmallColRow">
                    <html:checkbox property="<%= PatronStatsSummaryForm.FIELD_GROUP_BY_LIBRARY_TYPE_CHECKBOX %>" onclick="this.form.submit()">
                        <%=MessageHelper.formatMessage("patronstatssummarybylibrary_GroupSitesByType") %>
                        <base:helpTag helpFileName="d_group_sites_by_type.htm"/>
                    </html:checkbox>
                </td>
                <td class="SmallColRow">
                    <html:checkbox property="<%= PatronStatsSummaryForm.FIELD_SHOW_ALL_LIBRARIES %>" onclick="this.form.submit()">
                        <%=MessageHelper.formatMessage("patronstatssummarybylibrary_ShowAllSites") %>
                        <base:helpTag helpFileName="d_show_all_sites.htm"/>
                    </html:checkbox>
                </td>
                <td class="SmallColRow tdAlignRight">
                    <base:genericButton name="<%=PatronStatsSummaryForm.BUTTON_PRINTER_FRIENDLY %>" src="/buttons/small/printerfriendly.gif" alt='<%=MessageHelper.formatMessage("printable") %>' onclick="this.form.printerFriendlyClicked = true;" />
                </td>
            </logic:equal>
            <logic:equal name="backoffice_servlet_PatronStatsSummaryForm" property="print" value="true">
                <td class="MainHeader" align="center"><%= form.getPrinterFriendlyName() %></td>
            </logic:equal>
            </tr>
            <logic:equal name="backoffice_servlet_PatronStatsSummaryForm" property="print" value="true">
            <tr>
                <td class="SmallColHeading" align="center">
                <bean:write name="<%= form.FORM_NAME %>" property="printerFriendlyPageTitle"/>
                </td>
            </tr>
            <tr>
                <td class="ColRow" align="center">
                <bean:write name="<%= form.FORM_NAME %>" property="printerFriendlySubTitle"/>
                </td>
            </tr>
            </logic:equal>

            </table>

            <table id="colheading1" width="100%" border="0" cellspacing="0" cellpadding="2">
                <tr bgcolor="<%=DestinyColors.BACKGROUND%>">
                    <td class="InverseSmallColHeading" colspan="2"><bean:write name="<%= form.FORM_NAME %>" property="pageTitle"/></td>
                    <td class="InverseSmallColHeading" align="center">&nbsp;</td> <%-- separator line --%>
                    <td class="InverseSmallColHeading" align="center" colspan="4"><bean:write name="<%= form.FORM_NAME %>" property="circulationHeading"/></td>
                </tr>
            </table>

            <table id="<%=PatronStatsSummaryForm.TABLE_CONTENTS%>" width="100%" cellspacing="0" cellpadding="2" border="0">

            <logic:iterate id="reportGroup" name="list" type="com.follett.fsc.destiny.session.backoffice.data.StatisticsReportGroup" indexId="groupIndex">
                <tr>
                    <logic:equal name="groupIndex" value="0">
                        <td class="SmallColHeading">
                            <logic:equal name="backoffice_servlet_PatronStatsSummaryForm" property="groupByLibraryType" value="true">
                               <%= form.getPrimarySortTitle(reportGroup.getGroupName()) %>
                            </logic:equal>
                            <logic:equal name="backoffice_servlet_PatronStatsSummaryForm" property="groupByLibraryType" value="false">
                                &nbsp;
                            </logic:equal>
                        </td>
                        <td class="SmallColHeading">
                            &nbsp;
                        </td>
                        <% if (!form.isPrint()) { %>
                        <td class="SmallColHeading" align="center" rowspan=<bean:write name="<%= form.FORM_NAME %>" property="rowCount"/> width="4" bgcolor="#FFFFFF" bordercolor="#E8E8E8" background="/images/icons/general/verticalline.gif">
                            &nbsp;
                        </td>
                        <% } %>
                        <td class="SmallColHeading tdAlignRight"><%=MessageHelper.formatMessage("patronstatssummarybylibrary_Today") %></td>
                        <td class="SmallColHeading tdAlignRight"><%=MessageHelper.formatMessage("patronstatssummarybylibrary_ThisMonth") %></td>
                        <td class="SmallColHeading tdAlignRight"><%=MessageHelper.formatMessage("patronstatssummarybylibrary_ThisYear") %></td>
                        <td class="SmallColHeading tdAlignRight"><%=MessageHelper.formatMessage("patronstatssummarybylibrary_Total") %></td>
                    </logic:equal>

                    <logic:notEqual name="groupIndex" value="0">
                        <td class="SmallColHeading" colspan="2">
                           <%= form.getPrimarySortTitle(reportGroup.getGroupName()) %>
                        </td>
                        <td class="SmallColHeading tdAlignRight" colspan="4">
                           &nbsp;
                        </td>
                    </logic:notEqual>
                </tr>
              <logic:iterate id="detailRow" name="reportGroup" property="detailRows" type="com.follett.fsc.destiny.session.backoffice.data.StatisticsReportRow" indexId="detailIndex">
                   <tr>
                        <td class="ColRow">
                            &nbsp;

                            <%-- if NOT printing AND Some counts, show as link --%>
<%                          if (detailRow.getItemCount().longValue() > 0 && !form.isPrint()) {
%>                              <base:link page="<%= form.getDrillInLink(detailRow.getSiteID(), reportGroup.getGroupName(), detailRow.getLabel(), detailRow.getLabelSortKey()) %>">
                                    <bean:write name="detailRow" property="label"/>
                                </base:link>
<%                          } else { %> <%-- if printing or no counts, dont show link --%>
                                <bean:write name="detailRow" property="label"/>
<%                          } %>

                        </td>
                        <td class="tdAlignRight">
                            <base:numberPercentageReportCellTag name="detailRow" count="itemCount"/>
                        </td>
                        <td class="tdAlignRight">
                           <base:numberPercentageReportCellTag name="detailRow" count="todayCircCount"/>
                        </td>
                        <td class="tdAlignRight">
                           <base:numberPercentageReportCellTag name="detailRow" count="thisMonthCircCount"/>
                        </td>
                        <td class="tdAlignRight">
                            <base:numberPercentageReportCellTag name="detailRow" count="thisYearCircCount"/>
                        </td>
                        <td class="tdAlignRight">
                            <base:numberPercentageReportCellTag name="detailRow" count="totalCircCount"/>
                        </td>

                   </tr>
               </logic:iterate>

               <%-- Output the summary for the library type group here <logic:notEmpty name="reportGroup" property="totalRow"/> </logic:notEmpty> --%>
               <% if (list.size() > 1) { %>
                <bean:define id="groupTotalRow" name="reportGroup" property="totalRow" type="StatisticsReportRow"/>
                    <tr>
                        <td class="SmallColHeading tdAlignRight">
                           &nbsp;
                        </td>
                        <td class="tdAlignRight">
                            <base:numberPercentageReportCellTag name="groupTotalRow" count="itemCount" countClass="ColRowBold"/>
                        </td>
                        <td class="tdAlignRight">
                            <base:numberPercentageReportCellTag name="groupTotalRow" count="todayCircCount" countClass="ColRowBold" />
                        </td>
                        <td class="tdAlignRight">
                            <base:numberPercentageReportCellTag name="groupTotalRow" count="thisMonthCircCount" countClass="ColRowBold"/>
                        </td>
                        <td class="tdAlignRight">
                            <base:numberPercentageReportCellTag name="groupTotalRow" count="thisYearCircCount" countClass="ColRowBold"/>
                        </td>
                        <td class="tdAlignRight">
                            <base:numberPercentageReportCellTag name="groupTotalRow" count="totalCircCount" countClass="ColRowBold"/>
                        </td>
                    </tr>
             <% } %>
            </logic:iterate>
            <tr>
                <td class="ColRowBold" valign="top" align="center" colSpan="9"><base:imageLine width="100%" height="2"/></td>
            </tr>
            <%-- write the Big Dog total row at the botton --%>
            <tr>
                <td class="SmallColHeading">
                   &nbsp;
                </td>
                <td class="tdAlignRight">
                    <base:numberPercentageReportCellTag name="totalRow" count="itemCount" countClass="ColRowBold"/>
                </td>
                <logic:equal name="backoffice_servlet_PatronStatsSummaryForm" property="print" value="false">
                    <td class="SmallColHeading tdAlignRight">
                       &nbsp;
                    </td>
                </logic:equal>
                <td class="tdAlignRight">
                    <base:numberPercentageReportCellTag name="totalRow" count="todayCircCount" countClass="ColRowBold"/>
                </td>
                <td class="tdAlignRight">
                    <base:numberPercentageReportCellTag name="totalRow" count="thisMonthCircCount" countClass="ColRowBold"/>
                </td>
                <td class="tdAlignRight">
                    <base:numberPercentageReportCellTag name="totalRow" count="thisYearCircCount" countClass="ColRowBold"/>
                </td>
                <td class="tdAlignRight">
                    <base:numberPercentageReportCellTag name="totalRow" count="totalCircCount" countClass="ColRowBold"/>
                </td>
            </tr>
        </table>
        </td></tr>
        </table> <!-- End of content table -->
<br>
        </logic:notEmpty>
        <logic:empty name="form" property="list">
            <table id="NoResults" cellspacing="0" cellpadding="4" border="0" align="center" width="100%">
                <tr>
                    <td class="ColRowBold" valign="top" align="center"><%=MessageHelper.formatMessage("patronstatssummarybylibrary_BasedUponYourSelectionsThereIsNothingToReport") %></td>
                <tr>
                    <td class="ColRowBold" valign="top" align="center"><base:imageLine width="100%" height="2"/></td>
                </tr>
            </table>
        </logic:empty>

        <div><span class="ColRow"><%=MessageHelper.formatMessage("patronstatssummarybylibrary_NotePatronsWithMultipleSiteAssociations") %></span></div>

        <div align="center"><span class="Instruction"><bean:write name="<%= form.FORM_NAME %>" property="reportOptionsDescription"/> </span></div>

        <logic:equal name="backoffice_servlet_PatronStatsSummaryForm" property="print" value="true">
            <br><div align="center"><span class="Instruction"><%=MessageHelper.formatMessage("patronstatssummarybylibrary_ReportGeneratedOn0", form.getTimeOfGeneration(session))%><br></span></div>
        </logic:equal>
    </td>
    </tr>
</table>

</base:form>
