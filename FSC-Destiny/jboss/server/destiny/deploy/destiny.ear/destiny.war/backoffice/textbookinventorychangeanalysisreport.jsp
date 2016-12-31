<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.data.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@page import="org.apache.struts.util.ResponseUtils"%>
<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.TextbookInventoryChangeAnalysisReportForm"%>

<%@page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.remote.data.InventoryChangeAnalysisReportJobParams"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.ConfigSiteSpecs"%><

base:messageBox strutsErrors="true"/>


<%
    String formName = TextbookInventoryChangeAnalysisReportForm.FORM_NAME;
    String formAction = "/backoffice/servlet/handletextbookinventorychangeanalysisreportform.do";
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    TextbookInventoryChangeAnalysisReportForm form = (TextbookInventoryChangeAnalysisReportForm)request.getAttribute(formName);
%>

<base:form action="<%=formAction%>" >

    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true" name="<%=TextbookInventoryChangeAnalysisReportForm.PARAM_ENTER_KEY_PRESSED%>">

    <html:hidden property="<%=TextbookInventoryChangeAnalysisReportForm.FIELD_ACTION%>"/>
    <html:hidden property="<%=TextbookInventoryChangeAnalysisReportForm.PARAM_REPORT_NAME%>"/>
    <html:hidden property="<%=TextbookInventoryChangeAnalysisReportForm.PARAM_MIN_ALLOWED_DATE%>"/>
    <html:hidden property="<%=TextbookInventoryChangeAnalysisReportForm.FIELD_JOB_SPEC_ID%>"/>
    <html:hidden property="<%=TextbookInventoryChangeAnalysisReportForm.FIELD_SHOW_CHANGED%>" value="false"/>
    <base:isNotDistrictUser>
        <html:hidden property="<%=TextbookInventoryChangeAnalysisReportForm.FIELD_REPORT_SITE_ID%>"/>
    </base:isNotDistrictUser>

    <base:outlinedTableAndTabsWithinThere id="<%=TextbookInventoryChangeAnalysisReportForm.TABLE_MAIN%>" borderColor='#C0C0C0' selectedTab="<%=form.getLeftTab().getAltText()%>" selectedTabID="<%=form.getLeftTab().getName() %>" tabs="<%=form.getTabs()%>">
        <tr>
            <td colspan="2" class="TableHeading" nowrap>
                <%=ResponseUtils.filter(form.getReportHeading())%>
            </td>
        </tr>
        <base:isDistrictUser>
        <tr>
            <td class="ColRowBold tdAlignRight" valign = "top" width = "25%">
                For
            </td>
            <td class="ColRow" width = "35%" nowrap>
                    <base:selectSiteAndSiteType 
                        name="<%=TextbookInventoryChangeAnalysisReportForm.FIELD_REPORT_SITE_ID%>" 
                        selectedSiteID="<%=form.getReportSiteSelection()%>"
                        includeForLibrarySites="false"
                        includeForTextbookSites="true" 
                        includeDistrictWarehouse="true"
                        includeAlternateSiteTypes="true"
                        includeOptGroups="true" 
                        districtName="All Sites"
                        onChangeAction="showChangedSubmit()"
                    />
            </td>
        </tr>
        </base:isDistrictUser>
        <tr>
            <td class="ColRowBold tdAlignRight">
                Report on changes
            </td>
            <td class="ColRow">
                From <base:dateRange
                    dateFrom="<%=form.getDateFrom() %>"
                    dateTo="<%=form.getDateTo() %>"
                    multiline="false" promptTo="to"/>
            </td>
        </tr>      
        <tr>
            <td colspan="2">
                <base:imageLine/>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight" valign = "top">
                Show
            </td>
            <td class="ColRow">
                <% if (form.isDisplayDetailedOption()) { %>
                    <html:select onchange="showChangedSubmit()" property="<%= TextbookInventoryChangeAnalysisReportForm.FIELD_SHOW%>">
                        <html:option value='<%="" + InventoryChangeAnalysisReportJobParams.REPORT_TYPE_SUMMARY %>'>Summary</html:option>
                        <html:option value='<%="" + InventoryChangeAnalysisReportJobParams.REPORT_TYPE_DETAIL %>'>Detail</html:option>
                    </html:select>
                <% } else { %>
                    Summary
                    <html:hidden property="<%=TextbookInventoryChangeAnalysisReportForm.FIELD_SHOW%>" value="<%= String.valueOf(InventoryChangeAnalysisReportJobParams.REPORT_TYPE_SUMMARY)%>"/>
                <% } %>
            </td>
        </tr>
        <% if (form.getShow() == InventoryChangeAnalysisReportJobParams.REPORT_TYPE_DETAIL) { %>
            <tr>
                <td class="ColRowBold tdAlignRight" valign = "top">
                    Sort by
                </td>
                <td class="ColRow">
                    <html:select property="<%= TextbookInventoryChangeAnalysisReportForm.FIELD_SORTED_BY%>">
                        <html:option value='<%="" + InventoryChangeAnalysisReportJobParams.SORT_BY_TITLE%>'>Title</html:option>
                        <html:option value='<%="" + InventoryChangeAnalysisReportJobParams.SORT_BY_CHANGES%>'>Type of Change</html:option>
                    </html:select>
                </td>
            </tr> 
        <% } else { %>
            <html:hidden property="<%= TextbookInventoryChangeAnalysisReportForm.FIELD_SORTED_BY%>"/>
        <% } %> 
        
        <tr>
            <td class="ColRowBold tdAlignRight" valign = "top">
                Format
            </td>
            <td class="ColRow">
                <html:select property="<%= TextbookInventoryChangeAnalysisReportForm.FIELD_REPORT_FORMAT%>">
                    <html:option value='<%="" + TextbookInventoryChangeAnalysisReportForm.REPORT_FORMAT_PDF%>'>PDF</html:option>
                    <html:option value='<%="" + TextbookInventoryChangeAnalysisReportForm.REPORT_FORMAT_EXCEL %>'>Microsoft Excel</html:option>
                </html:select>
            </td>
        </tr>     
        
        <tr>
            <td colspan="2" class="ColRowBold" align="center">
                <table>
                    <tr>
                        <c:choose>
                            <c:when test="<%=CollectionStatsHistoricalForm.ACTION_RUN.equals(form.getAction()) %>">
                                <td valign="top">
                                    <base:genericButton name="<%=TextbookInventoryChangeAnalysisReportForm.BUTTON_SAVE_AND_RUN%>" alt="Save and Run Report" src="/buttons/large/saveandrun.gif"/>
                                </td>
                                <td>
                                    <base:cancelButton/>
                                </td>
                            </c:when>
                            <c:otherwise>
                                <td valign="top">
                                    <base:genericButton name="<%=TextbookInventoryChangeAnalysisReportForm.BUTTON_SAVE_SETUP%>" src="/buttons/large/savesetup.gif" alt="Save Report Setup"/>
                                </td>
                                <td>
                                    <base:reportButton/>
                                </td>
                            </c:otherwise>
                        </c:choose>                    
                    </tr>
                </table>
            </td>
        </tr>
    </base:outlinedTableAndTabsWithinThere>
</base:form>
<script language="JavaScript" type="text/javascript">
<!--
function showChangedSubmit() {
    document.<%=TextbookInventoryChangeAnalysisReportForm.FORM_NAME%>.<%=TextbookInventoryChangeAnalysisReportForm.FIELD_SHOW_CHANGED%>.value = "true";
    document.<%=TextbookInventoryChangeAnalysisReportForm.FORM_NAME%>.submit();
}
//-->
</script>
