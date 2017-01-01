<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.data.*" %>
<%@ page import="com.follett.fsc.common.consortium.UserContext" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<base:messageBox strutsErrors="true"/>

    <SCRIPT LANGUAGE="javascript" TYPE="text/javascript">
    <!--
        function submitTheForm() {
            document.<%=DistrictTextbookStatsForm.FORM_NAME%>.submit();
        }
    // -->
    </SCRIPT>


  <%
    DistrictTextbookStatsForm form = (DistrictTextbookStatsForm)request.getAttribute(DistrictTextbookStatsForm.FORM_NAME);
%>

<base:form action="/backoffice/servlet/handledistricttextbookstatsform.do">
<html:hidden property="<%=DistrictTextbookStatsForm.FIELD_JOB_SPEC_ID%>"/>
<html:hidden property="<%=DistrictTextbookStatsForm.FIELD_ACTION%>"/>
<html:hidden property="<%=DistrictTextbookStatsForm.PARAM_REPORT_NAME%>"/>
<base:outlinedTableAndTabsWithinThere id="<%=DistrictTextbookStatsForm.TABLE_MAIN%>" borderColor="#c0c0c0"
        selectedTab="<%=form.getLeftTab().getAltText()%>" selectedTabID="<%=form.getLeftTab().getName()%>" tabs="<%=form.getTabs()%>">
    <tr>
        <td colspan="2" class="TableHeading">
            List textbook information...
        </td>
    </tr>

    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>


    <tr>
        <td class="ColRowBold tdAlignRight" valign="top" >
            Report
        </td>
        <td class="ColRow">
            <html:select onchange="submitTheForm()" property="<%=DistrictTextbookStatsForm.FIELD_REPORT_TYPE%>">
                <html:option value='<%=""+TextbookConditionReportJobParams.REPORT_TYPE_CONDITION%>'>Condition</html:option>
                <html:option value='<%=""+TextbookConditionReportJobParams.REPORT_TYPE_STATUS%>'>Status</html:option>
            </html:select>
        </td>
    </tr>

    <% if (form.getStore().isDistrictUser()) {%>
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top">
            For
        </td>
        
        <td class="ColRow">
        <% if (UserContext.getMyThreadUserContext().getDistrictContext().isStateRepository()) {%>
            <%=DistrictTextbookStatsForm.REPORT_FOR_STATE_DESCRIPTION %>
            <html:hidden property="<%= DistrictTextbookStatsForm.FIELD_SITE_ID%>"/>
        <% } else{ %>
                <base:selectSiteAndSiteType 
                    name="<%= DistrictTextbookStatsForm.FIELD_SITE_ID%>" 
                    selectedSiteID="<%=form.getReportSiteID()%>"
                    includeForLibrarySites="false"
                    includeForTextbookSites="true"
                    includeDistrictWarehouseSiteType="false"
                />
        <% } %>
        </td>
    </tr>
     <%} %>
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top" >
            Calculate value using
        </td>
        <td class="ColRow">
            <html:select property="<%=DistrictTextbookStatsForm.FIELD_PRICE_MODE%>">
                <html:option value='<%=""+TextbookConditionReportJobParams.PRICE_MODE_CONDITION%>'>Conditioning adjustments</html:option>
                <html:option value='<%=""+TextbookConditionReportJobParams.PRICE_MODE_REPLACEMENT_PRICE%>'>Replacement price</html:option>
                <html:option value='<%=""+TextbookConditionReportJobParams.PRICE_MODE_BOTH%>'>Both</html:option>
            </html:select>
        </td>
    </tr>
   

    <tr>
        <td class="ColRowBold tdAlignRight" valign="top" >
            Include
        </td>
        <td class="ColRow">
            <html:select onchange="javascript:submitTheForm()" property="<%=DistrictTextbookStatsForm.FIELD_INCLUDE%>">
                <html:option value='<%=""+TextbookConditionReportJobParams.INCLUDE_SUMMARY%>'>Summary</html:option>
                <html:option value='<%=""+TextbookConditionReportJobParams.INCLUDE_BUDGET_CATEGORY%>'>Copy Budget Category</html:option>
                <html:option value='<%=""+TextbookConditionReportJobParams.INCLUDE_PUBLISHER%>'>Publisher</html:option>
                <html:option value='<%=""+TextbookConditionReportJobParams.INCLUDE_VENDOR%>'>Vendor</html:option>
            </html:select>
            
            <%if (form.getInclude() != TextbookConditionReportJobParams.INCLUDE_SUMMARY ) {%>
                <%= form.outputSecondaryDropdown(request) %>
            <% } %>
        </td>
    </tr>
    <logic:equal name='<%=DistrictTextbookStatsForm.FORM_NAME %>' property="<%=DistrictTextbookStatsForm.FIELD_REPORT_TYPE%>" value='<%=""+TextbookConditionReportJobParams.REPORT_TYPE_CONDITION%>' scope="request">
    <tr>
        <td class="ColRowBold tdAlignRight">Limit condition to</td>
        <td class="ColRow">
            <html:checkbox property="<%=DistrictTextbookStatsForm.FIELD_INCLUDE_NEW%>">New</html:checkbox>
            <html:checkbox property="<%=DistrictTextbookStatsForm.FIELD_INCLUDE_GOOD%>">Good</html:checkbox>
            <html:checkbox property="<%=DistrictTextbookStatsForm.FIELD_INCLUDE_FAIR%>">Fair</html:checkbox>
            <html:checkbox property="<%=DistrictTextbookStatsForm.FIELD_INCLUDE_POOR%>">Poor</html:checkbox>
            <html:checkbox property="<%=DistrictTextbookStatsForm.FIELD_INCLUDE_UNUSABLE%>">Unusable</html:checkbox>

            <html:hidden property="<%=DistrictTextbookStatsForm.FIELD_INCLUDE_AVAILABLE%>"/>
            <html:hidden property="<%=DistrictTextbookStatsForm.FIELD_INCLUDE_CHECKEDOUT%>"/>
            <html:hidden property="<%=DistrictTextbookStatsForm.FIELD_INCLUDE_OUTFORREPAIR%>"/>
            <html:hidden property="<%=DistrictTextbookStatsForm.FIELD_INCLUDE_LOST%>"/>
        </td>
    </tr>
    </logic:equal>
    <logic:equal name='<%=DistrictTextbookStatsForm.FORM_NAME %>' property="<%=DistrictTextbookStatsForm.FIELD_REPORT_TYPE%>" value='<%=""+TextbookConditionReportJobParams.REPORT_TYPE_STATUS%>' scope="request">
    <tr>
        <td class="ColRowBold tdAlignRight">Limit status to</td>
        <td class="ColRow">
            <html:hidden property="<%=DistrictTextbookStatsForm.FIELD_INCLUDE_NEW%>"/>
            <html:hidden property="<%=DistrictTextbookStatsForm.FIELD_INCLUDE_GOOD%>"/>
            <html:hidden property="<%=DistrictTextbookStatsForm.FIELD_INCLUDE_FAIR%>"/>
            <html:hidden property="<%=DistrictTextbookStatsForm.FIELD_INCLUDE_POOR%>"/>
            <html:hidden property="<%=DistrictTextbookStatsForm.FIELD_INCLUDE_UNUSABLE%>"/>
            
            <html:checkbox property="<%=DistrictTextbookStatsForm.FIELD_INCLUDE_AVAILABLE%>">Available</html:checkbox>
            <html:checkbox property="<%=DistrictTextbookStatsForm.FIELD_INCLUDE_CHECKEDOUT%>">Checked Out</html:checkbox>
            <html:checkbox property="<%=DistrictTextbookStatsForm.FIELD_INCLUDE_OUTFORREPAIR%>">Out for Repair</html:checkbox>
            <html:checkbox property="<%=DistrictTextbookStatsForm.FIELD_INCLUDE_LOST%>">Lost</html:checkbox>
        </td>
    </tr>
    </logic:equal>

    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>

    <tr>
        <td class="ColRowBold tdAlignRight">Show</td>
        <td class="ColRow">
            <html:checkbox property="<%=DistrictTextbookStatsForm.FIELD_SHOW_DETAILS%>">Title Details</html:checkbox>
        </td>
    </tr>

    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <tr>
        <td colspan="2" align="center">
            <table>
                <tr>
                    <c:choose>
                        <c:when test="<%=TextbookCopyListReportForm.ACTION_RUN.equals(form.getAction()) %>">
                            <td valign="top">
                                <base:genericButton name="<%=TextbookCopyListReportForm.BUTTON_SAVE_AND_RUN%>" alt="Save and Run Report" src="/buttons/large/saveandrun.gif"/>
                            </td>
                            <td>
                                <base:cancelButton/>
                            </td>
                        </c:when>
                        <c:otherwise>
                            <td valign="top">
                                <base:genericButton name="<%=TextbookCopyListReportForm.BUTTON_SAVE_SETUP%>" src="/buttons/large/savesetup.gif" alt="Save Report Setup"/>
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
