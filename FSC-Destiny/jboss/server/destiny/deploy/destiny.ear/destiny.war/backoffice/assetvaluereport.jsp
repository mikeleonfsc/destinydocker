<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.AssetValueReportForm"%>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.data.AssetValueReportJobParams"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator"%>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>

<base:messageBox strutsErrors="true" />

<bean:define id="form" name="<%= AssetValueReportForm.FORM_NAME %>" type="com.follett.fsc.destiny.client.backoffice.servlet.AssetValueReportForm" />

<base:form action="/backoffice/servlet/handleassetvaluereportform.do">
    <html:hidden property="<%=AssetValueReportForm.FIELD_FISCAL_MONTH%>"/>
    <html:hidden property="<%=AssetValueReportForm.FIELD_REPORT_TYPE_CHANGED%>"/>

    <logic:equal name="<%= AssetValueReportForm.FORM_NAME %>" property="<%= AssetValueReportForm.FIELD_FISCAL_YEAR_END %>" value="false">
        <html:hidden property="<%=AssetValueReportForm.FIELD_STATUS_RETIRED%>"/>
    </logic:equal>
    
    <base:outlinedTable id="<%=AssetValueReportForm.TABLE_MAIN%>" borderColor='#C0C0C0' width="100%">
        <tr>
            <td class="TableHeading" colSpan="3">Resource Value</td>
        </tr>
        <tr>
            <td colSpan="3"><base:imageLine height="1" width="100%"/></td>
        </tr>
        <logic:equal name="<%= AssetValueReportForm.FORM_NAME %>" property="districtAssetCataloger" value="true">
            <tr>
                <td class="ColRowBold tdAlignRight" vAlign="top">For</td>
                <td vAlign="top" colspan="2">
                    <base:selectSiteAndSiteType 
                        name="<%= AssetValueReportForm.FIELD_SITE_LIMITER%>" 
                        selectedSiteID="<%=form.getSiteLimiter()%>"
                        includeForLibrarySites="false"
                        includeForTextbookSites="false"
                        includeForAssetSites="true"
                    />
                </td>
            </tr>
        </logic:equal>
        
        <tr>
            <td class="ColRow tdAlignRight">&nbsp;</td>
            <td class="ColRow" colspan="2"> 
            <html:radio property="<%= AssetValueReportForm.FIELD_FISCAL_YEAR_END %>" onclick="form.submit()" value="false">
                Current Collection Value
            </html:radio>
            </td>
        </tr>
        
        <tr>
            <td class="ColRow tdAlignRight">&nbsp;</td>
            <td class="ColRow" colspan="2"> 
                <html:radio property="<%= AssetValueReportForm.FIELD_FISCAL_YEAR_END %>" onclick="form.submit()" value="true">Depreciated Collection Value 
                for the Fiscal Year ending <bean:write name="<%= AssetValueReportForm.FORM_NAME %>" property="<%= AssetValueReportForm.FIELD_FISCAL_MONTH_DISPLAY %>" />
                    &nbsp;<html:text property="<%= AssetValueReportForm.FIELD_FISCAL_YEAR_TO_USE %>" size="6" maxlength="4"/>
                </html:radio>
            </td>
        </tr>
        
        <tr>
            <td class="ColRowBold tdAlignRight" vAlign="top">Of Resource Type</td>
            <td vAlign="top" colspan="2">
                <base:assetTypesList formName="<%= AssetValueReportForm.FORM_NAME%>"/>
            </td>
        </tr>

        <tr>
            <td class="ColRowBold tdAlignRight" vAlign="top">With Funding Source</td>
            <td vAlign="top" colspan="2">
                <base:fundingSourcesList formName="<%= AssetValueReportForm.FORM_NAME%>"/>
            </td>
        </tr>

        <tr>
            <!-- turn on all checkboxes -->
            <td class="ColRowBold tdAlignRight" vAlign="top">And Status</td>
            <td vAlign="top" class="ColRow">
            
                <html:checkbox property="<%=AssetValueReportForm.FIELD_STATUS_APPROVED_FOR_DISPOSAL%>"></html:checkbox>
                Approved for Disposal
            </td>
            <td vAlign="top" class="ColRow">
                <html:checkbox property="<%=AssetValueReportForm.FIELD_STATUS_NO_LONGER_IN_USE%>"></html:checkbox>
                No Longer in Use
            </td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight" vAlign="top">&nbsp;</td>
            <td vAlign="top" class="ColRow">
                <html:checkbox property="<%=AssetValueReportForm.FIELD_STATUS_AVAILABLE%>"></html:checkbox>
                Available
            </td>
            <td vAlign="top" class="ColRow">
                <html:checkbox property="<%=AssetValueReportForm.FIELD_STATUS_OUT_FOR_REPAIRS%>"></html:checkbox>
                Out for Repairs
            </td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight" vAlign="top">&nbsp;</td>
            <td vAlign=top class="ColRow">
                <html:checkbox property="<%=AssetValueReportForm.FIELD_STATUS_AVAILABLE_FOR_PARTS%>"></html:checkbox>
                Available for Parts
            </td>
            <td vAlign="top" class="ColRow">
                <html:checkbox property="<%=AssetValueReportForm.FIELD_STATUS_READY_FOR_DISPOSAL%>"></html:checkbox>
                Ready for Disposal
            </td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight" vAlign="top">&nbsp;</td>
            <td vAlign="top" class="ColRow">
                <html:checkbox property="<%=AssetValueReportForm.FIELD_STATUS_CHECKED_OUT%>"></html:checkbox>
                Checked Out
            </td>
            <td vAlign="top" class="ColRow">
                <logic:equal name="<%= AssetValueReportForm.FORM_NAME %>" property="<%= AssetValueReportForm.FIELD_FISCAL_YEAR_END %>" value="true">
                    <html:checkbox property="<%=AssetValueReportForm.FIELD_STATUS_RETIRED%>"></html:checkbox>
                    Retired
                </logic:equal>
                <logic:equal name="<%= AssetValueReportForm.FORM_NAME %>" property="<%= AssetValueReportForm.FIELD_FISCAL_YEAR_END %>" value="false">
                    <html:checkbox property="<%=AssetValueReportForm.FIELD_STATUS_RETURNED_TO_VENDOR%>"></html:checkbox>
                    Returned to Vendor
                </logic:equal>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight" vAlign="top">&nbsp;</td>
            <td vAlign="top" class="ColRow">
                <html:checkbox property="<%=AssetValueReportForm.FIELD_STATUS_IN_TRANSIT%>"></html:checkbox>
                In Transit
            </td>
            <td vAlign="top" class="ColRow">
                <logic:equal name="<%= AssetValueReportForm.FORM_NAME %>" property="<%= AssetValueReportForm.FIELD_FISCAL_YEAR_END %>" value="true">
                    <html:checkbox property="<%=AssetValueReportForm.FIELD_STATUS_RETURNED_TO_VENDOR%>"></html:checkbox>
                    Returned to Vendor
                </logic:equal>
                <logic:equal name="<%= AssetValueReportForm.FORM_NAME %>" property="<%= AssetValueReportForm.FIELD_FISCAL_YEAR_END %>" value="false">
                    <html:checkbox property="<%=AssetValueReportForm.FIELD_STATUS_STOLEN%>"></html:checkbox>
                    Stolen
                </logic:equal>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight" vAlign="top">&nbsp;</td>
            <td vAlign="top" class="ColRow">
                <html:checkbox property="<%=AssetValueReportForm.FIELD_STATUS_IN_USE%>"></html:checkbox>
                In Use
            </td>
            <td vAlign="top" class="ColRow">
                <logic:equal name="<%= AssetValueReportForm.FORM_NAME %>" property="<%= AssetValueReportForm.FIELD_FISCAL_YEAR_END %>" value="true">
                    <html:checkbox property="<%=AssetValueReportForm.FIELD_STATUS_STOLEN%>"></html:checkbox>
                    Stolen
                </logic:equal>
                <logic:equal name="<%= AssetValueReportForm.FORM_NAME %>" property="<%= AssetValueReportForm.FIELD_FISCAL_YEAR_END %>" value="false">
                    &nbsp;
                </logic:equal>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight" vAlign="top">&nbsp;</td>
            <td vAlign="top" class="ColRow">
                <html:checkbox property="<%=AssetValueReportForm.FIELD_STATUS_LOST%>"></html:checkbox>
                Lost
            </td>
            <td vAlign="top" class="ColRow">
                &nbsp;
            </td>
        </tr>


        <tr>
            <td class="ColRowBold tdAlignRight" nowrap>
                Purchase Price 
            </td>
            <td class="ColRow" colspan="2">
                <html:select property="<%=AssetValueReportForm.FIELD_PURCHASE_PRICE_MODE%>">
                      <html:option value="<%=String.valueOf(AssetValueReportForm.RANGE_GREATER_THAN_OR_EQUAL_TO)%>">Greater than or equal to</html:option>
                      <html:option value="<%=String.valueOf(AssetValueReportForm.RANGE_LESS_THAN)%>">Less than</html:option>
                </html:select>
                <html:text property="<%=AssetValueReportForm.FIELD_PURCHASE_PRICE%>" size="10" maxlength="10"/>
            </td>
        </tr>

        <tr>
            <td class="ColRowBold tdAlignRight" nowrap>
                Group by 
            </td>
            <td class="ColRow" colspan="2">
                <html:select property="<%=AssetValueReportForm.FIELD_GROUPBY%>">
                    <html:option value="<%=String.valueOf(AssetValueReportJobParams.GROUP_BY_ASSET_TYPE)%>">Resource Type</html:option>
                    <html:option value="<%=String.valueOf(AssetValueReportJobParams.GROUP_BY_DEPARTMENT)%>">Department</html:option>
                    <logic:equal name="<%= AssetValueReportForm.FORM_NAME %>" property="districtAssetCataloger" value="true">
                        <html:option value="<%=String.valueOf(AssetValueReportJobParams.GROUP_BY_SITE)%>">Site</html:option>
                    </logic:equal>
                </html:select>
            </td>
        </tr>

        <tr>
        <td class="ColRowBold tdAlignRight">Show</td>
        <td colspan="2">
            <html:select onchange="showHideRollUp()" property="<%= AssetValueReportForm.FIELD_REPORT_TYPE %>">
                <html:option value="<%=Integer.toString(AssetValueReportForm.FORMAT_SUMMARY_ONLY)%>">Summary Only</html:option>
                <logic:equal name="<%= AssetValueReportForm.FORM_NAME %>" property="districtAssetCataloger" value="true">
                    <html:option value="<%=Integer.toString(AssetValueReportForm.FORMAT_DETAILS)%>">Details</html:option>
                </logic:equal>
                <logic:equal name="<%= AssetValueReportForm.FORM_NAME %>" property="districtAssetCataloger" value="false">
                    <html:option value="<%=Integer.toString(AssetValueReportForm.FORMAT_DETAILS)%>">Itemize</html:option>
                </logic:equal>
            </html:select>
        </td>
        </tr>

        <% if ((AssetValueReportForm.FORMAT_SUMMARY_ONLY == form.getReportType()) || form.isDistrictAssetCataloger()) { %>
        <tr>
        <td class="ColRowBold tdAlignRight">Roll-up Values to the</td>
        <td colspan="2">
            <html:select property="<%= AssetValueReportForm.FIELD_ROLLUP %>">
                <html:option value="<%=Integer.toString(2)%>">2nd Resource Type Subgroup</html:option>
                <html:option value="<%=Integer.toString(3)%>">3rd Resource Type Subgroup</html:option>
                <html:option value="<%=Integer.toString(4)%>">4th Resource Type Subgroup</html:option>
                <html:option value="<%=Integer.toString(5)%>">5th Resource Type Subgroup</html:option>
            </html:select>
                <base:genericButton
                  src="/buttons/large/preview2.gif"
                  alt="<%= AssetValueReportForm.ALT_TEXT_PREVIEW %>"
                  name="<%= AssetValueReportForm.BUTTON_PREVIEW %>"
                  absbottom="true"
                  />
        </td>
        </tr>
        <% } %>

        <tr>
            <td colSpan="3"><base:imageLine height="1" width="100%"/></td>
        </tr>
        <tr>
            <td class="ColRowBold" align="middle" colSpan="3">
            <base:reportButton/>
            </td>
        </tr>
        
    </base:outlinedTable>

</base:form>
<script language="JavaScript" type="text/javascript">
<!--
function showHideRollUp() {
    document.<%=AssetValueReportForm.FORM_NAME%>.<%=AssetValueReportForm.FIELD_REPORT_TYPE_CHANGED%>.value = "true";
    document.<%=AssetValueReportForm.FORM_NAME%>.submit();
}

//-->
</script>
