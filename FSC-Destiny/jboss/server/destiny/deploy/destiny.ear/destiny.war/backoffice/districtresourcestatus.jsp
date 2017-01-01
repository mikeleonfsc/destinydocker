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
            document.<%=DistrictResourceStatusForm.FORM_NAME%>.submit();
        }
    // -->
    </SCRIPT>


  <%
    DistrictResourceStatusForm form = (DistrictResourceStatusForm)request.getAttribute(DistrictResourceStatusForm.FORM_NAME);
%>

<base:form action="/backoffice/servlet/handledistrictresourcestatusform.do">
<base:outlinedTable id="<%=DistrictResourceStatusForm.TABLE_MAIN%>" borderColor="#c0c0c0">
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
            <html:select onchange="submitTheForm()" property="<%=DistrictResourceStatusForm.FIELD_REPORT_TYPE%>">
                <html:option value='<%=""+ResourceConditionReportJobParams.REPORT_TYPE_CONDITION%>'>Condition</html:option>
                <html:option value='<%=""+ResourceConditionReportJobParams.REPORT_TYPE_STATUS%>'>Status</html:option>
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
            <%=DistrictResourceStatusForm.REPORT_FOR_STATE_DESCRIPTION %>
            <html:hidden property="<%= DistrictResourceStatusForm.FIELD_SITE_ID%>"/>
        <% } else{ %>
                <base:selectSiteAndSiteType 
                    name="<%= DistrictResourceStatusForm.FIELD_SITE_ID%>" 
                    selectedSiteID="<%=form.getReportSiteID()%>"
                    includeForLibrarySites="false"
                    includeForTextbookSites="false"
                    includeForAssetSites="true"                    
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
            <html:select property="<%=DistrictResourceStatusForm.FIELD_PRICE_MODE%>">
                <html:option value='<%=""+ResourceConditionReportJobParams.PRICE_MODE_CONDITION%>'>Conditioning adjustments</html:option>
                <html:option value='<%=""+ResourceConditionReportJobParams.PRICE_MODE_REPLACEMENT_PRICE%>'>Replacement price</html:option>
                <html:option value='<%=""+ResourceConditionReportJobParams.PRICE_MODE_BOTH%>'>Both</html:option>
            </html:select>
        </td>
    </tr>
   

    <tr>
        <td class="ColRowBold tdAlignRight" valign="top" >
            Include
        </td>
        <td class="ColRow">
            <html:select onchange="javascript:submitTheForm()" property="<%=DistrictResourceStatusForm.FIELD_INCLUDE%>">
                <html:option value='<%=""+ResourceConditionReportJobParams.INCLUDE_SUMMARY%>'>Summary</html:option>
                <html:option value='<%=""+ResourceConditionReportJobParams.INCLUDE_BUDGET_CATEGORY%>'>Item Budget Category</html:option>
                <html:option value='<%=""+ResourceConditionReportJobParams.INCLUDE_PUBLISHER%>'>Publisher</html:option>
                <html:option value='<%=""+ResourceConditionReportJobParams.INCLUDE_VENDOR%>'>Vendor</html:option>
            </html:select>
            
            <%if (form.getInclude() != ResourceConditionReportJobParams.INCLUDE_SUMMARY ) {%>
                <%= form.outputSecondaryDropdown(request) %>
            <% } %>
        </td>
    </tr>
    <logic:equal name='<%=DistrictResourceStatusForm.FORM_NAME %>' property="<%=DistrictResourceStatusForm.FIELD_REPORT_TYPE%>" value='<%=""+ResourceConditionReportJobParams.REPORT_TYPE_CONDITION%>' scope="request">
    <tr>
        <td class="ColRowBold tdAlignRight">Limit condition to</td>
        <td class="ColRow">
            <html:checkbox property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_NEW%>">New</html:checkbox>
            <html:checkbox property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_GOOD%>">Good</html:checkbox>
            <html:checkbox property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_FAIR%>">Fair</html:checkbox>
            <html:checkbox property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_POOR%>">Poor</html:checkbox>
            <html:checkbox property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_USABLE%>">Usable</html:checkbox>
            <html:checkbox property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_UNUSABLE%>">Unusable</html:checkbox>        
            <html:checkbox property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_DAMAGED%>">Damaged</html:checkbox>

            <html:hidden property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_AVAILABLE%>"/>
            <html:hidden property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_CHECKED_OUT%>"/>
            <html:hidden property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_LOANED_OUT%>"/>
            <html:hidden property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_ON_ORDER%>"/>
            <html:hidden property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_OUT_FOR_REPAIR%>"/>
            <html:hidden property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_INCOMING_TRANSFERS%>"/>
            <html:hidden property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_LOST%>"/>
            <html:hidden property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_RETIRED%>"/>
            <html:hidden property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_STOLEN%>"/>
            <html:hidden property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_IN_USE%>"/>
            <html:hidden property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_NO_LONGER_IN_USE%>"/>
            <html:hidden property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_AVAILABLE_FOR_PARTS%>"/>
            <html:hidden property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_RETURN_TO_VENDOR%>"/>
            <html:hidden property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_READY_FOR_DISPOSAL%>"/>
            <html:hidden property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_APPROVED_FOR_DISPOSAL%>"/>  
        </td>
    </tr>
    </logic:equal>
    <logic:equal name='<%=DistrictResourceStatusForm.FORM_NAME %>' property="<%=DistrictResourceStatusForm.FIELD_REPORT_TYPE%>" value='<%=""+ResourceConditionReportJobParams.REPORT_TYPE_STATUS%>' scope="request">
    <tr>
        <td class="ColRowBold tdAlignRight">Limit status to</td>
        <td class="ColRow">
            <html:hidden property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_NEW%>"/>
            <html:hidden property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_GOOD%>"/>
            <html:hidden property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_FAIR%>"/>
            <html:hidden property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_POOR%>"/>
            <html:hidden property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_USABLE%>"/>
            <html:hidden property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_UNUSABLE%>"/>
            <html:hidden property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_DAMAGED%>"/>
            
            <html:checkbox property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_AVAILABLE%>">Available</html:checkbox>
            <html:checkbox property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_CHECKED_OUT%>">Checked Out</html:checkbox>
            <html:checkbox property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_LOANED_OUT%>">Loaned Out</html:checkbox>
            <html:checkbox property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_ON_ORDER%>">On Order</html:checkbox>
            <html:checkbox property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_OUT_FOR_REPAIR%>">Out for Repairs</html:checkbox>
            <html:checkbox property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_INCOMING_TRANSFERS%>">Incoming Transfers</html:checkbox>
            <html:checkbox property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_LOST%>">Lost</html:checkbox>
            <br/>
            <html:checkbox property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_RETIRED%>">Retired</html:checkbox>
            <html:checkbox property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_STOLEN%>">Stolen</html:checkbox>
            <html:checkbox property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_IN_USE%>">In Use</html:checkbox>
            <html:checkbox property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_NO_LONGER_IN_USE%>">No Longer in Use</html:checkbox>
            <html:checkbox property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_AVAILABLE_FOR_PARTS%>">Available for Parts</html:checkbox>
            <html:checkbox property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_RETURN_TO_VENDOR%>">Return to Vendor</html:checkbox>
            <html:checkbox property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_READY_FOR_DISPOSAL%>">Ready for Disposal</html:checkbox>
            <html:checkbox property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_APPROVED_FOR_DISPOSAL%>">Approved for Disposal</html:checkbox>            
        </td>
    </tr>
    </logic:equal>

    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>

    <tr>
        <td class="ColRowBold tdAlignRight">Show</td>
        <td class="ColRow">
            <html:checkbox property="<%=DistrictResourceStatusForm.FIELD_SHOW_DETAILS%>">Title Details</html:checkbox>
        </td>
    </tr>
        <% if (form.getStore().isDistrictUser()) {%>
    <tr>
        <td class="ColRowBold tdAlignRight"></td>
        <td class="ColRow">
            <html:checkbox property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_PAGE_BREAK%>">Include page breaks</html:checkbox>
        </td>
    </tr>
    <% } else {%>
        <html:hidden  property="<%=DistrictResourceStatusForm.FIELD_INCLUDE_PAGE_BREAK%>" />
     <% } %>  

    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
        <td class="ColRowBold" colspan="2" align="center">
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
