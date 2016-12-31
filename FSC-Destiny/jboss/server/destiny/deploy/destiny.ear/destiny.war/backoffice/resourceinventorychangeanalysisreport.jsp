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
<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.ResourceInventoryChangeAnalysisReportForm"%>

<%@page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.remote.data.ResourceInventoryChangeAnalysisReportJobParams"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.ConfigSiteSpecs"%><

base:messageBox strutsErrors="true"/>


<%
    String formName = ResourceInventoryChangeAnalysisReportForm.FORM_NAME;
    String formAction = "/backoffice/servlet/handleresourceinventorychangeanalysisreportform.do";
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    ResourceInventoryChangeAnalysisReportForm form = (ResourceInventoryChangeAnalysisReportForm)request.getAttribute(formName);
%>

<bean:define id="sortByList" name="<%= ResourceInventoryChangeAnalysisReportForm.FORM_NAME %>" property="sortList"/>

<base:form action="<%=formAction%>" >

    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true" name="<%=ResourceInventoryChangeAnalysisReportForm.PARAM_ENTER_KEY_PRESSED%>">

    <html:hidden property="<%=ResourceInventoryChangeAnalysisReportForm.FIELD_SHOW_CHANGED%>" value="false"/>
    <base:isNotDistrictUser>
        <html:hidden property="<%=ResourceInventoryChangeAnalysisReportForm.FIELD_REPORT_SITE_ID%>"/>
    </base:isNotDistrictUser>

    <base:outlinedTable id="<%=ResourceInventoryChangeAnalysisReportForm.TABLE_MAIN%>" cellpadding="5" cellspacing="0" borderColor='#C0C0C0'>
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
                        name="<%=ResourceInventoryChangeAnalysisReportForm.FIELD_REPORT_SITE_ID%>" 
                        selectedSiteID="<%=form.getReportSiteSelection()%>"
                        includeForLibrarySites="false"
                        includeForTextbookSites="false"
                        includeForAssetSites="true" 
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
                    <html:select onchange="showChangedSubmit()" property="<%= ResourceInventoryChangeAnalysisReportForm.FIELD_SHOW%>">
                        <html:option value='<%="" + ResourceInventoryChangeAnalysisReportJobParams.REPORT_TYPE_SUMMARY %>'>Summary</html:option>
                        <html:option value='<%="" + ResourceInventoryChangeAnalysisReportJobParams.REPORT_TYPE_DETAIL %>'>Detail</html:option>
                    </html:select>
                <% } else { %>
                    Summary
                    <html:hidden property="<%=ResourceInventoryChangeAnalysisReportForm.FIELD_SHOW%>" value="<%= String.valueOf(ResourceInventoryChangeAnalysisReportJobParams.REPORT_TYPE_SUMMARY)%>"/>
                <% } %>
            </td>
        </tr>
        
        <tr>
            <td class="ColRowBold tdAlignRight" vAlign="top">Of Resource Type</td>
            <td vAlign="top" colspan="2">
                <base:assetTypesList formName="<%= ResourceInventoryChangeAnalysisReportForm.FORM_NAME%>"/>
            </td>
        </tr>
        
        <% if (form.getShow() == ResourceInventoryChangeAnalysisReportJobParams.REPORT_TYPE_DETAIL) { %>
            <tr>
                <td class="ColRowBold tdAlignRight" valign = "top">
                    Sort by
                </td>
                <td class="ColRow">
                    <html:select property="<%= ResourceInventoryChangeAnalysisReportForm.FIELD_SORTED_BY%>">
                        <html:options collection="sortByList" property="longID" labelProperty="stringDesc"/>
                    </html:select>
                </td>
            </tr> 
        <% } else { %>
            <html:hidden property="<%= ResourceInventoryChangeAnalysisReportForm.FIELD_SORTED_BY%>"/>
        <% } %> 
        
        <tr>
            <td class="ColRowBold tdAlignRight" valign = "top">
                Format
            </td>
            <td class="ColRow">
                <html:select property="<%= ResourceInventoryChangeAnalysisReportForm.FIELD_REPORT_FORMAT%>">
                    <html:option value='<%="" + ResourceInventoryChangeAnalysisReportForm.REPORT_FORMAT_PDF%>'>PDF</html:option>
                    <html:option value='<%="" + ResourceInventoryChangeAnalysisReportForm.REPORT_FORMAT_EXCEL %>'>Microsoft Excel</html:option>
                </html:select>
            </td>
        </tr>     
        
        <tr>
            <td colspan="2" class="ColRowBold" align="center">
                <table>
                    <tr>
                        <td>
                            <base:reportButton/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </base:outlinedTable>
</base:form>
<script language="JavaScript" type="text/javascript">
<!--
function showChangedSubmit() {
    document.<%=ResourceInventoryChangeAnalysisReportForm.FORM_NAME%>.<%=ResourceInventoryChangeAnalysisReportForm.FIELD_SHOW_CHANGED%>.value = "true";
    document.<%=ResourceInventoryChangeAnalysisReportForm.FORM_NAME%>.submit();
}
//-->
</script>
