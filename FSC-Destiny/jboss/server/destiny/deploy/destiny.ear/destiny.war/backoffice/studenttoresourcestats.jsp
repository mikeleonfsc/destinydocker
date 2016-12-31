<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.DateRangeTag" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.*" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag" %>
<%@page import="com.follett.fsc.destiny.entity.ejb3.ConfigSiteSpecs"%>

<%
    StudentToResourceStatsForm form = (StudentToResourceStatsForm)request.getAttribute(StudentToResourceStatsForm.FORM_NAME);
%>
<bean:define id="resourceSelectBy" name="<%= StudentToResourceStatsForm.FORM_NAME %>" property="<%= StudentToResourceStatsForm.FIELD_SELECT_BY_LIST %>"/>

<base:messageBox strutsErrors="true"/>
<br>

<base:form action="/backoffice/servlet/handlestudenttoresourcestatsform.do" focus="<%=DateRangeTag.FIELD_DATE_FROM%>">
    <html:hidden property="<%=StudentToResourceStatsForm.BUTTON_CHANGE_SUBMIT%>" value="0"/>
    <html:hidden property="<%=StudentToResourceStatsForm.FIELD_JOB_SPEC_ID%>"/>
    <html:hidden property="<%=StudentToResourceStatsForm.FIELD_ACTION%>"/>
    <html:hidden property="<%=StudentToResourceStatsForm.PARAM_REPORT_NAME%>"/>

    <base:outlinedTable id="<%=StudentToResourceStatsForm.TABLE_MAIN%>" borderColor='#C0C0C0'>
    <tr>
        <td class="TableHeading" colSpan="2">List Student to Resource Statistics....</td>
    </tr>
    <tr>
        <td colSpan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <tr>
        <td class="TableHeading tdAlignRight">Limit by:</td>
        <td>&nbsp;</td>
    </tr>
    <base:isDistrictUser>
        <% if (com.follett.fsc.common.consortium.UserContext.isMyContextStateRepository()) {%>
            <tr>
                <td class="ColRowBold tdAlignRight">
                    For
                </td>
                <td class="ColRow">
                   <base:selectDistrict 
                    includeStateTextbookOffice="false" 
                    selectedDistrictContext="<%=form.getDistrictContext()%>"
                    mustContainTextbookSites="false"  
                    useSelectADistrict="true" 
                    onChangeAction="submitDropDownDistrict()" 
                    name="<%= form.FIELD_DISTRICT_CONTEXT %>" />
                </td>
            </tr> 
                <%if(!StringHelper.isEmpty(form.getDistrictContext()) 
                    && !SelectDistrictTag.SELECT_A_DISTRICT_TEXT.equals(form.getDistrictContext()) 
                    && !SelectDistrictTag.BLANK_SITE.equals(form.getDistrictContext())
                 ){%>
                <tr>
                    <td class="ColRowBold tdAlignRight">&nbsp;</td>
                    <td colspan="2">
                        <base:selectSite 
                        useSelectASite="true"
                        name="<%= form.FIELD_REPORT_SITE_ID %>" 
                        selectedSiteID="<%= form.getReportSiteID()%>" 
                        mode="<%=SelectSiteTag.MODE_GROUP_BY_SITE_TYPE_TEXTBOOK_ONLY %>"
                        includeLibrarySites="false"
                        includeTextbookSites="false"
                        includeMediaSites="false"
                        contextName="<%=form.getDistrictContext()%>"
                        includeAssetSites="true"
                        includeAllSites="true"
                        onChangeAction="submitDropDown()"
                        />
                     </td>   
                </tr>
                <%} %>                   
        <%} else { %>
            <tr>
                <td class="ColRowBold tdAlignRight">
                    For
                </td>
                <td class="ColRow">
                    <base:selectSiteAndSiteType 
                    	name="<%= StudentToResourceStatsForm.FIELD_REPORT_SITE_ID%>" 
                    	selectedSiteID="<%=form.getReportSiteID()%>"
                    	includeForLibrarySites="false"
                    	includeForTextbookSites="false"
                        includeForAssetSites="true" 
                    	includeDistrictWarehouse="false"
                        includeAlternateSiteTypes="true"
                        includeOptGroups="true" 
                        onChangeAction="submitDropDown()"
                    />
                </td>
            </tr>
        <%} %>
    </base:isDistrictUser>
    <base:isNotDistrictUser>
    	<html:hidden property="<%=StudentToResourceStatsForm.FIELD_REPORT_SITE_ID%>"/>
    </base:isNotDistrictUser>
    
    <tr>
        <td class="ColRowBold tdAlignRight">Class Department</td>
        <td class="ColRow">
            <base:selectDepartment name="<%= StudentToResourceStatsForm.FIELD_DEPARTMENT_ID%>" siteID ="<%=ConfigSiteSpecs.SITE_ID_MY_DISTRICT%>" includeAll="true" includeOther="true" districtContext="<%=form.getDistrictContext() %>" selectedDepartmentID="<%= form.getDepartmentID() %>"/>
        </td>
    </tr>
    
    <tr>
            <td class="ColRowBold tdAlignRight" vAlign="top">Of Resource Type</td>
            <td vAlign="top" colspan="2">
                <base:assetTypesList formName="<%= StudentToResourceStatsForm.FORM_NAME%>"/>
            </td>
        </tr>
    
    <% if (form.isAllTemplatesAreTextbooks()){ %>
    <tr>
        <td class="ColRowBold tdAlignRight">Select</td>
        <td class="ColRow">
            <html:select property="<%= StudentToResourceStatsForm.FIELD_SELECT_BY%>" onchange="submitDropDown()" >
                <html:options collection="resourceSelectBy" property="stringCode" labelProperty="stringDesc"/>
            </html:select>
        </td>
    </tr>
    <logic:notEqual name="<%= StudentToResourceStatsForm.FORM_NAME %>" property="<%= StudentToResourceStatsForm.FIELD_SELECT_BY%>" value="<%= ListResourceSelectBy.ID_ALL.toString()%>">
    <tr>
        <logic:equal name="<%= StudentToResourceStatsForm.FORM_NAME %>" property="<%= StudentToResourceStatsForm.FIELD_SELECT_BY%>" value="<%= ListResourceSelectBy.ID_BY_TITLE.toString()%>">
            <td class="ColRowBold tdAlignRight">Title:</td>
        </logic:equal>
        <logic:equal name="<%= StudentToResourceStatsForm.FORM_NAME %>" property="<%= StudentToResourceStatsForm.FIELD_SELECT_BY%>" value="<%= ListResourceSelectBy.ID_BY_ISBN.toString()%>">
            <td class="ColRowBold tdAlignRight">ISBN:</td>
        </logic:equal>
        <td class="ColRow">
            <html:text property="<%= StudentToResourceStatsForm.FIELD_SELECT_TEXT%>" maxlength="30"/>
        </td>
    </tr>
    </logic:notEqual>
    <% } else { %>
    <tr>
        <td class="ColRowBold tdAlignRight">Select</td>
        <td class="ColRow">
            <html:select property="<%= StudentToResourceStatsForm.FIELD_SELECT_BY%>" onchange="submitDropDown()" >
                <html:options collection="resourceSelectBy" property="stringCode" labelProperty="stringDesc"/>
            </html:select>
        </td>
    </tr>
    <logic:equal name="<%= StudentToResourceStatsForm.FORM_NAME %>" property="<%= StudentToResourceStatsForm.FIELD_SELECT_BY%>" value="<%= ListResourceSelectBy.ID_BY_TITLE.toString()%>">
    <tr>
        <logic:equal name="<%= StudentToResourceStatsForm.FORM_NAME %>" property="<%= StudentToResourceStatsForm.FIELD_SELECT_BY%>" value="<%= ListResourceSelectBy.ID_BY_TITLE.toString()%>">
            <td class="ColRowBold tdAlignRight">Displayable Name/Title:</td>
        </logic:equal>
        <td class="ColRow">
            <html:text property="<%= StudentToResourceStatsForm.FIELD_SELECT_TEXT%>" maxlength="30"/>
        </td>
    </tr>
    </logic:equal>
    <% } %>
    <tr>
        <td class="ColRowBold tdAlignRight">Class starting on or after</td>
        
        <td class=ColRow>
	        <base:dateRange 
	        	dateFrom="<%=form.getDateFrom()%>"
	        	dateTo="<%=form.getDateTo()%>"
		        multiline="true"
		        promptClass="ColRowBold"
		        promptAlign="right"
		        promptTo="Class ending on or before"
		        fieldClass="ColRow"
		    />
        </td>
    </tr>
    <base:isNotDistrictUser>
    <tr>
        <td class="ColRowBold tdAlignRight">Show</td>
        <td class="ColRow">
        	<html:radio property="<%=StudentToResourceStatsForm.FIELD_SHOW_DISTRICT_SUMMARY%>" value="false"/>
            &nbsp;Site details
		</td>
    </tr>
    <tr>
    	<td>&nbsp;</td>
    	<td class="ColRow">
        	<html:radio property="<%=StudentToResourceStatsForm.FIELD_SHOW_DISTRICT_SUMMARY%>" value="true"/>
            &nbsp;District summary
        </td>    
    </tr>
    </base:isNotDistrictUser>
    <tr>
        <td colSpan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <tr>
        <TD class="ColRowBold" align="center" colSpan="2">
            <table>
                <tr>
                    <td align="center">
                       <base:reportButton/>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    </base:outlinedTable>
    
</base:form>


<script language="javascript">
<!--
function submitDropDown() {
        document.<%=StudentToResourceStatsForm.FORM_NAME%>.submit();
}

        function submitDropDownDistrict() {
                document.<%=StudentToResourceStatsForm.FORM_NAME%>.<%=StudentToResourceStatsForm.BUTTON_CHANGE_SUBMIT%>.value = '<%= StudentToResourceStatsForm.SUBMIT_DISTRICT_CHANGED%>';
                document.<%=StudentToResourceStatsForm.FORM_NAME%>.submit();
        }

    
// -->
</script>
