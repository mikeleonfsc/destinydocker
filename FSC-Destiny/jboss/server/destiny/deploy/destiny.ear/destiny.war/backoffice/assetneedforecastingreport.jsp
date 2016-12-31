<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.AssetNeedForecastingReportForm"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator"%>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>
<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<base:messageBox strutsErrors="true" />

<%
    AssetNeedForecastingReportForm form = (AssetNeedForecastingReportForm)request.getAttribute(AssetNeedForecastingReportForm.FORM_NAME);
%>

<base:form action="/backoffice/servlet/handleassetneedforecastingreportform.do">

	<base:outlinedTable id="<%=AssetNeedForecastingReportForm.TABLE_MAIN%>" borderColor='#C0C0C0' width="100%">
		<tr>
			<td class="TableHeading" colSpan="3"><%= MessageHelper.formatMessage("assetneedforecastingreport_AssetNeedForecasting") %></td>
		</tr>
		<tr>
			<td colSpan="3"><base:imageLine height="1" width="100%"/></td>
		</tr>
		<tr>
			<td class="ColRowBold tdAlignRight">List items reaching end<br>
            of projected life...</td>
			<td class="ColRowBold" nowrap colspan="2"><%= MessageHelper.formatMessage("assetneedforecastingreport_From") %><base:dateRange dateFrom="<%=form.getDateFrom()%>" dateTo="<%=form.getDateTo()%>" />
			</td>
		</tr>
		<logic:equal name="<%= AssetNeedForecastingReportForm.FORM_NAME %>" property="districtUser" value="true">
			<tr>
				<td class="ColRowBold tdAlignRight" vAlign="top"><%= MessageHelper.formatMessage("assetneedforecastingreport_For") %></td>
				<td vAlign="top" colspan="2">
					<base:selectSiteAndSiteType 
		               	name="<%= AssetNeedForecastingReportForm.FIELD_SITE_LIMITER%>" 
		               	selectedSiteID="<%=form.getSiteLimiter()%>"
		               	includeForLibrarySites="false"
		               	includeForTextbookSites="false"
		               	includeForAssetSites="true"
		        	/>
				</td>
			</tr>
		</logic:equal>
		<tr>
			<td class="ColRowBold tdAlignRight" vAlign="top"><%= MessageHelper.formatMessage("assetneedforecastingreport_OfAssetType") %></td>
			<td vAlign="top" colspan="2">
		    	<base:assetTypesList formName="<%= AssetNeedForecastingReportForm.FORM_NAME%>"/>
			</td>
		</tr>
		<tr>
			<!-- turn on all checkboxes -->
			<td class="ColRowBold tdAlignRight" vAlign="top"><%= MessageHelper.formatMessage("assetneedforecastingreport_AndStatus") %></td>
			<td vAlign="top" class="ColRow">
				<html:checkbox property="<%=AssetNeedForecastingReportForm.FIELD_STATUS_APPROVED_FOR_DISPOSAL%>"></html:checkbox><%= MessageHelper.formatMessage("assetneedforecastingreport_ApprovedForDisposal") %></td>
			<td vAlign="top" class="ColRow">
                <html:checkbox property="<%=AssetNeedForecastingReportForm.FIELD_STATUS_NO_LONGER_IN_USE%>"></html:checkbox><%= MessageHelper.formatMessage("assetneedforecastingreport_NoLongerInUse") %></td>
			
		</tr>
		<tr>
			<td class="ColRowBold tdAlignRight" vAlign="top">&nbsp;</td>
			<td vAlign="top" class="ColRow">
				<html:checkbox property="<%=AssetNeedForecastingReportForm.FIELD_STATUS_AVAILABLE%>"></html:checkbox><%= MessageHelper.formatMessage("assetneedforecastingreport_Available") %></td>
		    <td vAlign="top" class="ColRow">
                <html:checkbox property="<%=AssetNeedForecastingReportForm.FIELD_STATUS_OUT_FOR_REPAIRS%>"></html:checkbox><%= MessageHelper.formatMessage("assetneedforecastingreport_OutForRepairs") %></td>
		</tr>
		<tr>
			<td class="ColRowBold tdAlignRight" vAlign="top">&nbsp;</td>
			<td vAlign=top class="ColRow">
				<html:checkbox property="<%=AssetNeedForecastingReportForm.FIELD_STATUS_AVAILABLE_FOR_PARTS%>"></html:checkbox><%= MessageHelper.formatMessage("assetneedforecastingreport_AvailableForParts") %></td>
		    <td vAlign="top" class="ColRow">
                <html:checkbox property="<%=AssetNeedForecastingReportForm.FIELD_STATUS_READY_FOR_DISPOSAL%>"></html:checkbox><%= MessageHelper.formatMessage("assetneedforecastingreport_ReadyForDisposal") %></td>
		</tr>
		<tr>
			<td class="ColRowBold tdAlignRight" vAlign="top">&nbsp;</td>
			<td vAlign="top" class="ColRow">
				<html:checkbox property="<%=AssetNeedForecastingReportForm.FIELD_STATUS_CHECKED_OUT%>"></html:checkbox><%= MessageHelper.formatMessage("assetneedforecastingreport_CheckedOut") %></td>
		    <td vAlign="top" class="ColRow">
				<html:checkbox property="<%=AssetNeedForecastingReportForm.FIELD_STATUS_RETIRED%>"></html:checkbox><%= MessageHelper.formatMessage("assetneedforecastingreport_Retired") %></td>
			
		</tr>
		<tr>
			<td class="ColRowBold tdAlignRight" vAlign="top">&nbsp;</td>
			<td vAlign="top" class="ColRow">
				<html:checkbox property="<%=AssetNeedForecastingReportForm.FIELD_STATUS_IN_TRANSIT%>"></html:checkbox><%= MessageHelper.formatMessage("assetneedforecastingreport_InTransit") %></td>
			<td vAlign="top" class="ColRow">
				<html:checkbox property="<%=AssetNeedForecastingReportForm.FIELD_STATUS_RETURNED_TO_VENDOR%>"></html:checkbox><%= MessageHelper.formatMessage("assetneedforecastingreport_ReturnedToVendor") %></td>
		</tr>
		<tr>
			<td class="ColRowBold tdAlignRight" vAlign="top">&nbsp;</td>
			<td vAlign="top" class="ColRow">
				<html:checkbox property="<%=AssetNeedForecastingReportForm.FIELD_STATUS_IN_USE%>"></html:checkbox><%= MessageHelper.formatMessage("assetneedforecastingreport_InUse") %></td>
			<td vAlign="top" class="ColRow">
				<html:checkbox property="<%=AssetNeedForecastingReportForm.FIELD_STATUS_STOLEN%>"></html:checkbox><%= MessageHelper.formatMessage("assetneedforecastingreport_Stolen") %></td>
		</tr>
        <tr>
            <td class="ColRowBold tdAlignRight" vAlign="top">&nbsp;</td>
            <td vAlign="top" class="ColRow">
                <html:checkbox property="<%=AssetNeedForecastingReportForm.FIELD_STATUS_LOST%>"></html:checkbox><%= MessageHelper.formatMessage("assetneedforecastingreport_Lost") %></td>
            <td vAlign="top" class="ColRow">
                &nbsp;
            </td>
        </tr>

		<tr>
        	<td class="ColRowBold tdAlignRight" nowrap><%= MessageHelper.formatMessage("assetneedforecastingreport_PurchasePrice") %></td>
	        <td class="ColRow" colspan="2">
	        	<html:select property="<%=AssetNeedForecastingReportForm.FIELD_PURCHASE_PRICE_MODE%>">
			          <html:option value="<%=String.valueOf(AssetNeedForecastingReportForm.RANGE_GREATER_THAN_OR_EQUAL_TO)%>"><%= MessageHelper.formatMessage("assetneedforecastingreport_GreaterThanOrEqualTo") %></html:option>
			          <html:option value="<%=String.valueOf(AssetNeedForecastingReportForm.RANGE_LESS_THAN)%>"><%= MessageHelper.formatMessage("assetneedforecastingreport_LessThan") %></html:option>
		        </html:select>
     			<html:text property="<%=AssetNeedForecastingReportForm.FIELD_PURCHASE_PRICE%>" size="10" maxlength="10"/>
	        </td>
		</tr>

		<tr>
    	<td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("assetneedforecastingreport_Show") %></td>
   		<td colspan="2">
   			<html:select property="<%= AssetNeedForecastingReportForm.FIELD_REPORT_TYPE %>">
               	<html:option value="<%=Integer.toString(AssetNeedForecastingReportForm.FORMAT_SUMMARY_ONLY)%>"><%= MessageHelper.formatMessage("assetneedforecastingreport_SummaryOnly") %></html:option>
				<html:option value="<%=Integer.toString(AssetNeedForecastingReportForm.FORMAT_DETAILS)%>"><%= MessageHelper.formatMessage("assetneedforecastingreport_Details") %></html:option>
               	
               </html:select>
   		</td>
		</tr>

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

