<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.PreventiveMaintenanceReportForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<bean:define id="siteLimiterID" name="<%= PreventiveMaintenanceReportForm.FORM_NAME %>" property="siteLimiterID" />
<bean:define id="selectByList" name="<%= PreventiveMaintenanceReportForm.FORM_NAME %>" property="selectByList" />

<base:messageBox strutsErrors="true"/>

<%
    PreventiveMaintenanceReportForm form = (PreventiveMaintenanceReportForm) request.getAttribute(PreventiveMaintenanceReportForm.FORM_NAME);
%>

<base:form action="/backoffice/servlet/handlepreventivemaintenancereportform.do">
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true" name="<%=PreventiveMaintenanceReportForm.TRAP_ENTER_KEY %>">

<base:outlinedTable id="<%= PreventiveMaintenanceReportForm.TABLE_PREVENTIVE_MAINTENANCE%>" borderColor='#c0c0c0' width="97%" cellpadding="0" cellspacing="2">
    <tr>
        <td class="TableHeading">Preventive Maintenance
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <base:imageLine height="1" width="100%"/>
        </td>
    </tr>

    <tr>
        <td align="center">                 
            <table id="<%=PreventiveMaintenanceReportForm.TABLE_SELECT_BY %>">
                <logic:equal name="<%=PreventiveMaintenanceReportForm.FORM_NAME%>" property="<%=PreventiveMaintenanceReportForm.PARAM_IS_DISTRICT_USER%>" value="true">
                    <tr>
                        <td class="ColRowBold tdAlignRight" nowrap>
                            For &nbsp;
                        </td>
                        <td class="ColRow">
                            <base:selectSite
                                name="<%=PreventiveMaintenanceReportForm.FIELD_SITE_LIMITER_ID%>"
                                selectedSiteID='<%="" + form.getSiteLimiterID()%>'
                                includeLibrarySites="false"
                                includeMediaSites="false"
                                includeTextbookSites="false"
                                includeAssetSites="true"
                                useSelectASite="false"
                                submitOnChange="false"
                            />
                        </td>
                    </tr>
                </logic:equal>
                <tr>
                    <td class="ColRowBold tdAlignRight" nowrap>
                        Select by &nbsp;
                    </td>
                    <td class="ColRow">
                        <html:select property="<%=PreventiveMaintenanceReportForm.FIELD_SELECT_BY%>" onchange="selectByChanged()">
                            <html:options collection="selectByList" property="longID" labelProperty="stringDesc" />
                        </html:select>
                    </td>
                </tr>
                <logic:equal name="<%=PreventiveMaintenanceReportForm.FORM_NAME%>" property="<%=PreventiveMaintenanceReportForm.FIELD_SELECT_BY%>" value='<%= "" + PreventiveMaintenanceReportForm.SELECT_BY_CUSTODIAN%>'>
                    <tr>
                        <td align="center">
                            <tr>
                                <td class="ColRowBold tdAlignRight" nowrap valign="top">
                                    Custodian &nbsp;
                                </td>
                                <td nowrap valign="top">
                                    <base:custodiansList formName="<%= PreventiveMaintenanceReportForm.FORM_NAME%>" tableWidth="100" />
                                </td>
                            </tr>
                            <tr>
                                <td vAlign="top" class="ColRow" colspan="2">
                                    <html:checkbox property="<%=PreventiveMaintenanceReportForm.FIELD_START_NEW_PAGE_FOR_EACH_CUSTODIAN%>"></html:checkbox>
                                    Start a new page for each custodian
                                </td>
                            </tr>
                            <tr>
                                <td vAlign="top" class="ColRow" colspan="2">
                                    <html:checkbox property="<%=PreventiveMaintenanceReportForm.FIELD_LIMIT_REPORT_TO_TODAY%>"></html:checkbox>
                                    Limit report to maintenance due today only
                                </td>
                            </tr>
                        </td>
                    </tr>
                </logic:equal>
                <logic:equal name="<%=PreventiveMaintenanceReportForm.FORM_NAME%>" property="<%=PreventiveMaintenanceReportForm.FIELD_SELECT_BY%>" value='<%= "" + PreventiveMaintenanceReportForm.SELECT_BY_DATE_RANGE%>'>
                    <tr>
                        <td align="center">
                            <tr>
                                <td class="ColRowBold" nowrap valign="top">
                                    Maintenance due
                                </td>
                                <td class="ColRow" nowrap valign="top">
                                <html:radio property="<%= PreventiveMaintenanceReportForm.FIELD_MAINTENANCE_DUE_TODAY %>" value="true">
                                    Today
                                </html:radio>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    &nbsp;
                                </td>
                                <td class="ColRow">
                                    <html:radio property="<%= PreventiveMaintenanceReportForm.FIELD_MAINTENANCE_DUE_TODAY %>" value="false">
                                        From &nbsp;                             
                                    </html:radio>
                                    <base:dateRange dateFrom="<%=form.getDateFrom()%>" dateTo="<%=form.getDateTo()%>" />
                                </td>
                            </tr>
                        </td>
                    </tr>
                </logic:equal>
            </table>
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <base:imageLine height="1" width="100%" />
        </td>
    </tr>
    <tr>
        <td align="center" class="ColRowBold">
            <base:reportButton/>
        </td>
    </tr>
</base:outlinedTable>
</base:form>
<script language="JavaScript" type="text/javascript">
<!--
function selectByChanged() {
    document.<%=PreventiveMaintenanceReportForm.FORM_NAME%>.submit();
}
//-->
</script>
