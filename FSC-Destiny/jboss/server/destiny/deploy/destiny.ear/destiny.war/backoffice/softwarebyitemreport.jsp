<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.SoftwareByItemReportForm" %>
<%@ page import="com.follett.fsc.destiny.util.Barcode" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<bean:define id="form" name="<%=SoftwareByItemReportForm.FORM_NAME%>" type="com.follett.fsc.destiny.client.backoffice.servlet.SoftwareByItemReportForm"/>

<base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handlesoftwarebyitemreportform.do" enctype="multipart/form-data">
	<base:outlinedTable id="<%=SoftwareByItemReportForm.TABLE_MAIN%>" borderColor='#C0C0C0'>
        <tr>
			<td class="TableHeading" vAlign="top"><%=SoftwareByItemReportForm.PAGE_TITLE%></td>
        </tr>
        <tr>
        	<td>
        		<base:imageLine/>
        	</td>
        </tr>

    <base:isDistrictUser>
		<tr>	        
	    	<td class="ColRowBold">
	    	For&nbsp;	    	 
	                <base:selectSite 
	                    selectedSiteID="<%= String.valueOf(form.getSiteID())%>"
	                	useSelectASite="<%=!form.getStore().isDistrictUser()%>"
	                    submitOnChange="false" 
	                    name="<%=SoftwareByItemReportForm.FIELD_SITE_ID%>" 
	                    includeAllLibraries="true"
	                    includeLibrarySites="false"
	        			includeTextbookSites="false"
	        			includeMediaSites="false"
	        			includeAssetSites="true"
	                    />
	          </td>	    	
	    </tr>
    </base:isDistrictUser>
        
        
        
        <tr>
        	<td class="ColRowBold">
        		Select by&nbsp;
                <html:select property="<%= SoftwareByItemReportForm.FIELD_SELECTED_BY %>"  onchange="this.form.submit();">
                    <html:option value='<%= "" + SoftwareByItemReportForm.PARAM_SELECT_BY_ASSET_TYPE%>'>Resource Types</html:option>
                    <html:option value='<%= "" + SoftwareByItemReportForm.PARAM_SELECT_BY_BARCODE%>'>Barcode List</html:option>
                </html:select>

        	</td>
        </tr>               
                
		<tr>
			<td>
			    <logic:equal name="<%= SoftwareByItemReportForm.FORM_NAME %>" property="<%= SoftwareByItemReportForm.FIELD_SELECTED_BY %>" value='<%= "" + SoftwareByItemReportForm.PARAM_SELECT_BY_BARCODE %>'>
	               <base:barcodeList 
	                   formName="<%=SoftwareByItemReportForm.FORM_NAME%>"
                       barcodeType="<%=Barcode.BARCODETYPE_ASSET_ITEM %>"/>

				</logic:equal>
			    <logic:notEqual name="<%= SoftwareByItemReportForm.FORM_NAME %>" property="<%= SoftwareByItemReportForm.FIELD_SELECTED_BY %>" value='<%= "" + SoftwareByItemReportForm.PARAM_SELECT_BY_BARCODE %>'>				
					<base:assetTypeSelector showAssignableTree="true" assetTree="<%=form.getAssetTypes()%>" selectedAssets="<%=form.getSelectedAssets()%>" />
				</logic:notEqual>
			</td>
		</tr>	
		<tr>
			<td>
        		<base:imageLine/>
		    </td>
		</tr>	
        <tr>
            <td align="center" class="ColRowBold">
             	<base:reportButton/>
            </td>
        </tr>
    </base:outlinedTable>
</base:form>
