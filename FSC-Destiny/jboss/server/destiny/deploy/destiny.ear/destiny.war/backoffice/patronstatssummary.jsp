<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.DestinyColors"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag"%>
<%@ page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@ page import="com.follett.fsc.common.StringHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
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
<%StringBuilder sbIDs = new StringBuilder(); %>
<base:form action="/backoffice/servlet/handlepatronstatssummaryform.do" onsubmit="doOnSubmit()" disableIntercepter="true">
<html:hidden property="librarySelected"/>
<input type="hidden" name="<%= PatronStatsSummaryForm.PARAM_PRINTER_FRIENDLY %>" value="">

<table id="<%=PatronStatsSummaryForm.TABLE_OUTER%>" width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr><td>
        <base:outlinedTableAndTabsWithinThere id="<%=PatronStatsSummaryForm.TABLE_CIRCS%>" hideBorderAndTabs="<%=form.isPrint() %>" selectedTab="<%=form.getSelectedTab()%>" tabs="<%=form.getTabs()%>" borderColor='#c0c0c0' width="100%" cellpadding="0" cellspacing="0">
            <tr>
                <td>
                    <logic:notEmpty name="form" property="list">
                    <bean:define id="list" name="backoffice_servlet_PatronStatsSummaryForm" property="list" type="TreeSet"/>
                    <bean:define id="totalRow" name="backoffice_servlet_PatronStatsSummaryForm" property="totalRow" type="StatisticsReportRow"/>
                        <table id="<%=PatronStatsSummaryForm.TABLE_PRINTER_FRIENDLY_HEADER%>" width="100%" border="0" cellspacing="0" cellpadding="2">
                            <tr>
                            <logic:equal name="backoffice_servlet_PatronStatsSummaryForm" property="print" value="false">
                                <td colspan="2" class="SmallColRow">
                                    [&nbsp;<a href="#customview"><%=MessageHelper.formatMessage("patronstatssummary_CustomizeSummary") %></a>&nbsp;]
                                    <base:helpTag helpFileName="t_customize_view_patron_stats_summary.htm"/>
                                </td>
                                <td class="SmallColRow tdAlignRight">
                                    <base:genericButton name="<%=PatronStatsSummaryForm.BUTTON_PRINTER_FRIENDLY %>" src="/buttons/small/printerfriendly.gif" alt='<%=MessageHelper.formatMessage("printable") %>' onclick="this.form.printerFriendlyClicked = true; return true;"></base:genericButton>
                                </td>
                            </logic:equal>
                            <logic:equal name="backoffice_servlet_PatronStatsSummaryForm" property="print" value="true">
                                <td class="MainHeader" align="center"><%= form.getPrinterFriendlyName() %></td>
                            </logic:equal>
                            </tr>
                        <logic:equal name="backoffice_servlet_PatronStatsSummaryForm" property="print" value="true">
                            <tr>
                                <td class="SmallColHeading" align="center">
                                <%=form.getPrinterFriendlyPageTitle() %>
                                </td>
                            </tr>
                            <tr>
                                <td class="SmallColHeading" align="center">
                                <%=form.getPrinterFriendlySubTitle() %>
                                </td>
                            </tr>
                        </logic:equal>
                        </table>
    
                        <table id="colheading1" width="100%" border="0" cellspacing="0" cellpadding="2">
                            <tr bgcolor="<%=DestinyColors.BACKGROUND%>">
                                <td class="InverseSmallColHeading" align="center" colspan="2"><%=MessageHelper.formatMessage("patronstatssummary_Patrons") %></td><%--TBD - this will need to be singular in last drill down level --%>
                                <td class="InverseSmallColHeading" align="center">&nbsp;</td> <%-- separator line --%>
                                <td class="InverseSmallColHeading" align="center" colspan="4"><bean:write name="<%= form.FORM_NAME %>" property="circulationHeading"/></td>
                            </tr>
                        </table>
    
                        <table id="<%=PatronStatsSummaryForm.TABLE_CONTENTS%>" width="100%" cellspacing="0" cellpadding="2" border="0">
                            <logic:iterate id="reportGroup" name="list" type="com.follett.fsc.destiny.session.backoffice.data.StatisticsReportGroup" indexId="groupIndex">
                                <tr>
                                <logic:equal name="groupIndex" value="0">
                                    <td class="SmallColHeading">
                                    <logic:notEmpty name="form" property="secondaryGroup">
                                       <%= ResponseUtils.filter(form.getPrimarySortTitle(reportGroup.getGroupName())) %>
                                    </logic:notEmpty>
                                    <logic:empty name="form" property="secondaryGroup">
                                        &nbsp;
                                    </logic:empty>
                                    </td>
                                    <td class="SmallColHeading">
                                        &nbsp;
                                    </td>
                                <% if (!form.isPrint()) { %>
                                    <td class="SmallColHeading" align="center" rowspan=<bean:write name="<%= form.FORM_NAME %>" property="rowCount"/> width="4" bgcolor="#FFFFFF" bordercolor="#E8E8E8" background="/images/icons/general/verticalline.gif">
                                        &nbsp;
                                    </td>
                                <% } %>
                                    <td class="SmallColHeading tdAlignRight"><%=MessageHelper.formatMessage("patronstatssummary_Today") %></td>
                                    <td class="SmallColHeading tdAlignRight"><%=MessageHelper.formatMessage("patronstatssummary_ThisMonth") %></td>
                                    <td class="SmallColHeading tdAlignRight"><%=MessageHelper.formatMessage("patronstatssummary_ThisYear") %></td>
                                    <td class="SmallColHeading tdAlignRight"><%=MessageHelper.formatMessage("patronstatssummary_Total") %></td>
                                </logic:equal>
    
                                <logic:notEqual name="groupIndex" value="0">
                                    <td class="SmallColHeading" colspan="2">
                                       <%= ResponseUtils.filter(form.getPrimarySortTitle(reportGroup.getGroupName())) %>
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
                                            <%-- not printing, so display the link --%>
                                            <logic:equal name="backoffice_servlet_PatronStatsSummaryForm" property="print" value="false">
                                                <base:link page="<%= form.getDrillInLink(detailRow.getSiteID(), reportGroup.getGroupName(), detailRow.getLabel(), detailRow.getLabelSortKey()) %>">
                                                    <bean:write name="detailRow" property="label"/>
                                                </base:link>
                                            </logic:equal>
                                
                                            <%-- printing, so do NOT display the link --%>
                                            <logic:equal name="backoffice_servlet_PatronStatsSummaryForm" property="print" value="true">
                                                    <bean:write name="detailRow" property="label"/>
                                            </logic:equal>
                                        </td>
                                        <td class="tdAlignRight">
                                            <base:numberPercentageReportCellTag name="detailRow" count="itemCount"/>
                                        </td>
                                        <td class="tdAlignRight">
                                           <base:numberPercentageReportCellTag name="detailRow" count="todayCircCount" percent="todayCircPercent"/>
                                        </td>
                                        <td class="tdAlignRight">
                                           <base:numberPercentageReportCellTag name="detailRow" count="thisMonthCircCount" percent="thisMonthCircPercent"/>
                                        </td>
                                        <td class="tdAlignRight">
                                            <base:numberPercentageReportCellTag name="detailRow" count="thisYearCircCount" percent="thisYearCircPercent"/>
                                        </td>
                                        <td class="tdAlignRight">
                                            <base:numberPercentageReportCellTag name="detailRow" count="totalCircCount" percent="totalCircPercent"/>
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
                                            <base:numberPercentageReportCellTag name="groupTotalRow" count="todayCircCount" countClass="ColRowBold" percent="todayCircPercent"/>
                                        </td>
                                        <td class="tdAlignRight">
                                            <base:numberPercentageReportCellTag name="groupTotalRow" count="thisMonthCircCount" countClass="ColRowBold" percent="thisMonthCircPercent"/>
                                        </td>
                                        <td class="tdAlignRight">
                                            <base:numberPercentageReportCellTag name="groupTotalRow" count="thisYearCircCount" countClass="ColRowBold" percent="thisYearCircPercent"/>
                                        </td>
                                        <td class="tdAlignRight">
                                            <base:numberPercentageReportCellTag name="groupTotalRow" count="totalCircCount" countClass="ColRowBold" percent="totalCircPercent"/>
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
                    </logic:notEmpty>
                    <logic:empty name="form" property="list">
                        <table id="NoResults" cellspacing="0" cellpadding="4" border="0" align="center" width="100%">
                            <tr>
                                <td class="ColRowBold" valign="top" align="center"><%=MessageHelper.formatMessage("patronstatssummary_BasedUponYourSelectionsThereIsNothingToReport") %></td>
                            </tr>
                        </table>
                    </logic:empty>
                </td>
            </tr>
        </base:outlinedTableAndTabsWithinThere>
    </td></tr>
    <tr><td class="ColRow" valign="top"><%=MessageHelper.formatMessage("patronstatssummary_NotePatronsWithMultipleSiteAssociations") %><br>&nbsp;
    </td></tr>
    <tr><td>
    <logic:equal name="backoffice_servlet_PatronStatsSummaryForm" property="print" value="true">
        <table id="<%=PatronStatsSummaryForm.TABLE_PRINTER_FRIENDLY_SUMMARY%>" cellspacing="0" cellpadding="4" border="0" align="center">
            <tr>
                <td align="center" class="Instruction">
                    <%=ResponseUtils.filter(form.getReportOptionsDescription())%>
                </td>
            </tr>
        </table>
    </logic:equal>
    <logic:equal name="backoffice_servlet_PatronStatsSummaryForm" property="print" value="false">
        <table id="CustomizeView" cellspacing="0" cellpadding="4" border="0" align="center">
            <tr>
                <td class="Instruction" colspan="3">
                    <base:link linkName="customview" /><%=MessageHelper.formatMessage("patronstatssummary_UseTheFollowingOptionsToCustomizeThisSummary") %></td>
            </tr>
            <tr>
                <td class="ColRowBold" colspan="2" valign="middle" nowrap>
                <bean:define id="userDefinedTypesList" name="<%=PatronStatsSummaryForm.FORM_NAME%>" property="userDefinedTypesList"/>
                <bean:define id="userDefinedTypesListWithBlank" name="<%=PatronStatsSummaryForm.FORM_NAME%>" property="userDefinedTypesListWithBlank"/>
                <%=MessageHelper.formatMessage("patronstatssummary_GroupBy") %>&nbsp;<html:select property="<%=PatronStatsSummaryForm.FIELD_GROUP_BY_PRIMARY_DROPDOWN%>">
                  <html:options collection="userDefinedTypesList" property="stringSortable"
                        labelProperty="stringItem"/></html:select>&nbsp;<%=MessageHelper.formatMessage("patronstatssummary_AndThenBy")%>&nbsp;<html:select property="<%=PatronStatsSummaryForm.FIELD_GROUP_BY_SECONDARY_DROPDOWN%>">
                  <html:options collection="userDefinedTypesListWithBlank" property="stringSortable"
                        labelProperty="stringItem"/></html:select>
                </td>
                <td valign="bottom">
                    <base:genericButton src="/buttons/large/update.gif" name="<%= PatronStatsSummaryForm.BUTTON_UPDATE %>" alt='<%= MessageHelper.formatMessage("update") %>' />
                </td>
            </tr>
            <tr>
                <td class="ColRowBold" colspan="3"><%=MessageHelper.formatMessage("patronstatssummary_OnlyIncludeTheFollowing") %></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td class="SmallColHeading"><%=MessageHelper.formatMessage("patronstatssummary_PatronTypes") %>
                &nbsp;<%=JSPHelper.renderButton("CheckAll", "/icons/general/selectallicon.gif", MessageHelper.formatMessage("patronstatssummary_SelectAll"), 
                    "return checkEm(patronTypesCheckboxTag, true)", true) %>
                    &nbsp;
                <%=JSPHelper.renderButton("CheckAll", "/icons/general/clearallicon.gif", MessageHelper.formatMessage("patronstatssummary_ClearAll"), 
                    "return checkEm(patronTypesCheckboxTag, false)", true) %>
                </td>
                <td class="SmallColHeading"><%=MessageHelper.formatMessage("patronstatssummary_Statuses") %></td>
            </tr>
            
            
            <tr>
                <td>&nbsp;</td>
                <td valign="top" class="ColRow">
                <% List<String> pTypeList = new ArrayList<String>();  %>
                    <logic:iterate id="patronType" name="<%=PatronStatsSummaryForm.FORM_NAME %>" property="patronTypesList"
                        type="com.follett.fsc.destiny.session.backoffice.data.StringWithSortableVO">
                        <html:multibox property="<%= PatronStatsSummaryForm.FIELD_SELECTED_PATRON_TYPES %>"
                            value="<%= patronType.getStringItem() %>">
                        </html:multibox><bean:write name="patronType" property="stringItem"/><br>
                    <%
                    StringBuffer tempPatronType = new StringBuffer();
                    tempPatronType.append("'");
                    tempPatronType.append(StringHelper.replaceAll(patronType.getStringItem(), "'", "\\'"));
                    tempPatronType.append("'");
                    pTypeList.add(tempPatronType.toString());
                    %>    
                    </logic:iterate>
                    <% sbIDs.append(MessageHelper.formatEnumeration(pTypeList)); %>
                </td>
                <td valign="top" class="ColRow">
                    <html:checkbox name="<%=PatronStatsSummaryForm.FORM_NAME %>" property="<%= PatronStatsSummaryForm.FIELD_INCLUDE_ACTIVE %>"><%=MessageHelper.formatMessage("patronstatssummary_Active") %></html:checkbox><br>
                    <html:checkbox name="<%=PatronStatsSummaryForm.FORM_NAME %>" property="<%= PatronStatsSummaryForm.FIELD_INCLUDE_RESTRICTED %>"><%=MessageHelper.formatMessage("patronstatssummary_Restricted") %></html:checkbox><br>
                    <html:checkbox name="<%=PatronStatsSummaryForm.FORM_NAME %>" property="<%= PatronStatsSummaryForm.FIELD_INCLUDE_INACTIVE %>"><%=MessageHelper.formatMessage("patronstatssummary_Inactive") %></html:checkbox><br>
                </td>
            </tr>
        </table>
    </logic:equal>
    <logic:equal name="<%=PatronStatsSummaryForm.FORM_NAME %>" property="print" value="true">
        <br><div align="center"><span class="Instruction"><%=MessageHelper.formatMessage("patronstatssummary_ReportGeneratedOn", form.getTimeOfGeneration(session))%>
        <br></span></div>
    </logic:equal>

    </td></tr>
    
    <logic:equal name="<%=PatronStatsSummaryForm.FORM_NAME %>" property="print" value="false">
        <tr>
            <td width="100%">
                <base:imageLine width="100%"/>
            </td>
        </tr>
        <tr><td align="center">
                <base:helpIcons buttonsToOutput="<%=new int[] {HelpIconsTag.ICON_SELECT_ALL, HelpIconsTag.ICON_CLEAR_ALL }%>" />
        </td></tr>
    </logic:equal>

    
</table> <!-- End of Outter Table -->


<SCRIPT LANGUAGE="JavaScript">
<!--
var patronTypesCheckboxTag = new Array(<%=sbIDs.toString()%>);//  End -->
</script>
<SCRIPT LANGUAGE="JavaScript">
<!--    

function checkEm(values, value)
{
var field = document.<%=PatronStatsSummaryForm.FORM_NAME %>.<%= PatronStatsSummaryForm.FIELD_SELECTED_PATRON_TYPES %>;
for ( j = 0; j < values.length; j++ ) {
  for (i = 0; i < field.length; i++)
    if ( field[i].value == values[j]) {
        field[i].checked = value;
        break;
    }
  }
return false;
}
//  End -->
</script>


</base:form>
