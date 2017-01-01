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
    StudentToTextbookStatsForm form = (StudentToTextbookStatsForm)request.getAttribute(StudentToTextbookStatsForm.FORM_NAME);
%>
<bean:define id="textbookSelectBy" name="<%= StudentToTextbookStatsForm.FORM_NAME %>" property="<%= StudentToTextbookStatsForm.FIELD_SELECT_BY_LIST %>"/>

<base:messageBox strutsErrors="true"/>
<br>

<base:form action="/backoffice/servlet/handlestudenttotextbookstatsform.do" focus="<%=DateRangeTag.FIELD_DATE_FROM%>">
    <html:hidden property="<%=StudentToTextbookStatsForm.BUTTON_CHANGE_SUBMIT%>" value="0"/>
    <html:hidden property="<%=StudentToTextbookStatsForm.FIELD_JOB_SPEC_ID%>"/>
    <html:hidden property="<%=StudentToTextbookStatsForm.FIELD_ACTION%>"/>
    <html:hidden property="<%=StudentToTextbookStatsForm.PARAM_REPORT_NAME%>"/>

    <base:outlinedTableAndTabsWithinThere id="<%=StudentToTextbookStatsForm.TABLE_MAIN%>" borderColor='#C0C0C0' selectedTab="<%=form.getLeftTab().getName()%>" tabs="<%=form.getTabs()%>">
    <tr>
        <td class="TableHeading" colSpan="2">List Student to Textbook Statistics....</td>
    </tr>
    <tr>
        <td colSpan="2"><base:imageLine height="1" width="100%"/></td>
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
                    mustContainTextbookSites="true"  
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
                        includeTextbookSites="true"
                        includeMediaSites="false"
                        contextName="<%=form.getDistrictContext()%>"
                        includeAssetSites="false"
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
                    	name="<%= StudentToTextbookStatsForm.FIELD_REPORT_SITE_ID%>" 
                    	selectedSiteID="<%=form.getReportSiteID()%>"
                    	includeForLibrarySites="false"
                    	includeForTextbookSites="true" 
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
    	<html:hidden property="<%=StudentToTextbookStatsForm.FIELD_REPORT_SITE_ID%>"/>
    </base:isNotDistrictUser>
    
    <tr>
        <td class="ColRowBold tdAlignRight">Department</td>
        <td class="ColRow">
            <base:selectDepartment name="<%= StudentToTextbookStatsForm.FIELD_DEPARTMENT_ID%>" siteID ="<%=ConfigSiteSpecs.SITE_ID_MY_DISTRICT%>" includeAll="true" includeOther="true" districtContext="<%=form.getDistrictContext() %>" selectedDepartmentID="<%= form.getDepartmentID() %>"/>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">Select</td>
        <td class="ColRow">
            <html:select property="<%= StudentToTextbookStatsForm.FIELD_SELECT_BY%>" onchange="submitDropDown()" >
                <html:options collection="textbookSelectBy" property="stringCode" labelProperty="stringDesc"/>
            </html:select>
        </td>
    </tr>

    <logic:notEqual name="<%= StudentToTextbookStatsForm.FORM_NAME %>" property="<%= StudentToTextbookStatsForm.FIELD_SELECT_BY%>" value="<%= ListTextbookSelectBy.ID_ALL.toString()%>">
    <tr>
        <logic:equal name="<%= StudentToTextbookStatsForm.FORM_NAME %>" property="<%= StudentToTextbookStatsForm.FIELD_SELECT_BY%>" value="<%= ListTextbookSelectBy.ID_BY_TITLE.toString()%>">
            <td class="ColRowBold tdAlignRight">Title:</td>
        </logic:equal>
        <logic:equal name="<%= StudentToTextbookStatsForm.FORM_NAME %>" property="<%= StudentToTextbookStatsForm.FIELD_SELECT_BY%>" value="<%= ListTextbookSelectBy.ID_BY_ISBN.toString()%>">
            <td class="ColRowBold tdAlignRight">ISBN:</td>
        </logic:equal>
        <td class="ColRow">
            <html:text property="<%= StudentToTextbookStatsForm.FIELD_SELECT_TEXT%>" maxlength="30"/>
        </td>
    </tr>
    </logic:notEqual>
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
        	<html:radio property="<%=StudentToTextbookStatsForm.FIELD_SHOW_DISTRICT_SUMMARY%>" value="false"/>
            &nbsp;Site details
		</td>
    </tr>
    <tr>
    	<td>&nbsp;</td>
    	<td class="ColRow">
        	<html:radio property="<%=StudentToTextbookStatsForm.FIELD_SHOW_DISTRICT_SUMMARY%>" value="true"/>
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
                    <c:choose>
                        <c:when test="<%=StudentToTextbookStatsForm.ACTION_RUN.equals(form.getAction()) %>">
                            <td valign="top">
                                <base:genericButton name="<%=StudentToTextbookStatsForm.BUTTON_SAVE_AND_RUN%>" alt="Save and Run Report" src="/buttons/large/saveandrun.gif"/>
                            </td>
                            <td>
                                <base:cancelButton/>
                            </td>
                        </c:when>
                        <c:otherwise>
                            <td valign="top">
                                <base:genericButton name="<%=StudentToTextbookStatsForm.BUTTON_SAVE_SETUP%>" src="/buttons/large/savesetup.gif" alt="Save Report Setup"/>
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


<script language="javascript">
<!--
function submitDropDown() {
        document.<%=StudentToTextbookStatsForm.FORM_NAME%>.submit();
}

        function submitDropDownDistrict() {
                document.<%=StudentToTextbookStatsForm.FORM_NAME%>.<%=StudentToTextbookStatsForm.BUTTON_CHANGE_SUBMIT%>.value = '<%= StudentToTextbookStatsForm.SUBMIT_DISTRICT_CHANGED%>';
                document.<%=StudentToTextbookStatsForm.FORM_NAME%>.submit();
        }

    
// -->
</script>
