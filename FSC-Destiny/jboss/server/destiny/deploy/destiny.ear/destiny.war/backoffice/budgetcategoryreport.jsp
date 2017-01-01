<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.BudgetCategoryReportForm" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.remote.data.BudgetCategoryReportJobParams"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.remote.data.BaseReportJobParams"%>
<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag"%>


<base:messageBox strutsErrors="true"/>


<%
    String formAction = "/backoffice/servlet/handlebudgetcategoryreportform.do";
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    BudgetCategoryReportForm form = (BudgetCategoryReportForm)request.getAttribute(BudgetCategoryReportForm.FORM_NAME);
%>

<base:form action="<%=formAction%>" >
    <html:hidden property="<%=BudgetCategoryReportForm.FIELD_SELECT_BY_DROPDOWN_CHANGED %>" value="false"/>
    <script language="JavaScript" type="text/javascript">
    
  <!--
    function submitForm() {    
        document.<%=BudgetCategoryReportForm.FORM_NAME%>.<%=BudgetCategoryReportForm.FIELD_SELECT_BY_DROPDOWN_CHANGED%>.value = true;           
        document.<%=BudgetCategoryReportForm.FORM_NAME%>.submit();
    }
  // -->
    </script>
    
    
    <base:outlinedTable id="<%=BudgetCategoryReportForm.TABLE_MAIN%>" borderColor='#C0C0C0' width="100%">
        <tr>
            <td colspan="2" class="TableHeading">Budget Category...</td>
        </tr>
        
        <tr>
            <td colspan="2" class="ColRow" width="100%"><base:imageLine/></td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight" valign="top">Show</td>
            <td class="ColRow" valign="top" ><html:radio onclick="submitForm()" property="<%=BudgetCategoryReportForm.FIELD_REPORT_TYPE %>" value='<%="" +  BudgetCategoryReportJobParams.REPORT_TYPE_BUDGET_AMOUNTS%>'/>
                Budget Amounts for 
                <html:select property = "<%=BudgetCategoryReportForm.FIELD_FISCAL_YEAR%>">
                    <html:option value = "<%=String.valueOf(BudgetCategoryReportJobParams.FISCAL_YEAR_CURRENT)%>">current fiscal year</html:option>        
                    <html:option value = "<%=String.valueOf(BudgetCategoryReportJobParams.FISCAL_YEAR_NEXT)%>">next fiscal year</html:option>        
                </html:select><br>
                    <html:radio onclick="submitForm()" property="<%=BudgetCategoryReportForm.FIELD_REPORT_TYPE %>" value='<%="" +  BudgetCategoryReportJobParams.REPORT_TYPE_SUBMITTED_PRE_ORDERS%>'/>
                    Submitted Pre-orders<br>
                    <html:radio onclick="submitForm()" property="<%=BudgetCategoryReportForm.FIELD_REPORT_TYPE %>" value='<%="" +  BudgetCategoryReportJobParams.REPORT_TYPE_SITES_WITHOUT_PREORDERS%>'/>
                    Sites without Submitted Pre-orders<br>
            </td>
        </tr> 

        <tr>
            <td class="ColRowBold tdAlignRight">Limit to Orders from</td>
            <td class="ColRow">

            <base:selectDistrict 
                includeStateTextbookOffice="false"
                includeStatewide="false" 
                selectedDistrictContext="<%=form.getLimitDistrict()%>"
                mustContainTextbookSites="true"  
                useSelectAllDistricts="true"
                useSelectADistrict="false"
                useUnlimitedText="true" 
                onChangeAction='<%=(form.getReportType() == BudgetCategoryReportJobParams.REPORT_TYPE_SITES_WITHOUT_PREORDERS) ? "" : "submitForm()" %>'
                printerFriendly="false" 
                useArchive="true"
                name="<%= BudgetCategoryReportForm.FIELD_LIMIT_DISTRICT %>" /> 

            </td>
        </tr> 
        
        
<% if(
    form.getReportType() != BudgetCategoryReportJobParams.REPORT_TYPE_SITES_WITHOUT_PREORDERS &&
    (!StringHelper.isEmptyOrWhitespace(form.getLimitDistrict())
    && !SelectDistrictTag.VALUE_ALL_DISTRICTS.equals(form.getLimitDistrict()))) { %>
<tr>
    <td class="ColRowBold tdAlignRight">&nbsp;</td>
    <td class="ColRow">
            <base:selectSite 
               useSelectASite="false"
               name="<%= BudgetCategoryReportForm.FIELD_SITE_ID %>" 
               selectedSiteID="<%= form.getSiteID() == null ? null : String.valueOf(form.getSiteID()) %>" 
               mode="<%=SelectSiteTag.MODE_ARCHIVE%>"
               includeLibrarySites="false"
               includeTextbookSites="true"
               includeMediaSites="false"
               contextName="<%=form.getLimitDistrict()%>"
               includeAssetSites="false"
               includeAllSites="true"
               includeFromDistrict = "false"
               printerFriendly="false"
        />
    </td> 
</tr>
<% } %>
        
    <%if ( form.getReportType() != BudgetCategoryReportJobParams.REPORT_TYPE_SITES_WITHOUT_PREORDERS ) { %>
        <tr>
            <td class="ColRowBold tdAlignRight">Sort by</td>
            <td><html:select property = "<%=BudgetCategoryReportForm.FIELD_SORT_BY%>">
                    <html:option value = "<%=String.valueOf(BudgetCategoryReportJobParams.SORT_BY_BUDGET_CATEGORY)%>">Budget Category</html:option>        
                    <html:option value = "<%=String.valueOf(BudgetCategoryReportJobParams.SORT_BY_PROGRAM)%>">Program</html:option>        
                    <html:option value = "<%=String.valueOf(BudgetCategoryReportJobParams.SORT_BY_SITE_TYPE)%>">Site Type</html:option>        
                </html:select>
            </td>
        </tr>
    <% } %> 
        <tr>
            <td class="ColRowBold tdAlignRight">Format as</td>
            <td><html:select property = "<%=BudgetCategoryReportForm.FIELD_OUTPUT_FORMAT%>">
                    <html:option value = "<%=String.valueOf(BaseReportJobParams.EXPORT_TYPE_PDF)%>">PDF</html:option>        
                    <html:option value = "<%=String.valueOf(BaseReportJobParams.EXPORT_TYPE_XLS)%>">Microsoft Excel</html:option>        
                </html:select>
            </td>
        </tr> 
        <tr>
            <td colspan="2" class="ColRow" width="100%"><base:imageLine/></td>
        </tr>
        <tr>
        <td class="ColRow" align="center" colspan="2">
            <base:showHideTag id="onAction">
                <base:reportButton/>
            </base:showHideTag>
        </td>
        </tr>
    </base:outlinedTable>    
</base:form>
