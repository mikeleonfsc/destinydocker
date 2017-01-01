<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.ExportAssetsForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %> 

<base:messageBox strutsErrors="true"/>

<%
    ExportAssetsForm form = (ExportAssetsForm)request.getAttribute(ExportAssetsForm.FORM_NAME);
%>

<base:form action="/cataloging/servlet/handleexportassetsform.do">


<logic:equal name="<%= ExportAssetsForm.FORM_NAME %>" property="<%= ExportAssetsForm.PARAM_CONFIRM%>" value="true">
    
       <%     
            String[] messageText = new String[]{GenericForm.getLastBackupDisplayMsg(true), "Do you want to continue?"};
     %>
    
    <base:confirmBox showWarningIcon="true" filterMessage="false"
            header="You have chosen to delete the exported resources.  All resources that are exported will be deleted."           
            messageText="<%=messageText%>"
            noName="<%=ExportAssetsForm.BUTTON_CONFIRM_NO%>" 
    />          
</logic:equal>



<base:outlinedTable id="<%= ExportAssetsForm.TABLE_OUTLINE_TABLE%>" borderColor='#c0c0c0' width="97%" cellpadding="5" cellspacing="0">
    <tr>
        <td class="TableHeading">
            &nbsp;Export Resources...
        </td>
    </tr>
    
	<tr>
		<td align="center">
			<table border="0">
                <logic:equal name="<%= ExportAssetsForm.FORM_NAME %>" property="districtAssetCataloger" value="true">
				<tr>
					<td class="ColRowBold tdAlignRight">From</td>
				    <td class="tdAlignLeft">
			            <base:selectSite 
			                name="<%= ExportAssetsForm.FIELD_SITE_ID %>" 
			                selectedSiteID='<%= String.valueOf(form.getSiteID()) %>' 
			                includeLibrarySites="false"
			        		includeTextbookSites="false"
			        		includeMediaSites="false"
			        		includeAssetSites="true"
			        		includeAllLibraries="true"
			            />
				    </td>
				</tr>
                </logic:equal>
				<tr>
				   	<td class="ColRowBold tdAlignRight" nowrap>
				       	Resource Types&nbsp; 
				    </td>
				    <td class="tdAlignLeft">
					    <table id="<%= ExportAssetsForm.TABLE_ASSET_TYPES%>">
					    	<tr>
							    <td>
							    	<%=form.getFormattedAssetTypeList()%>
							    </td>
							    <td>
                                    <base:genericButton src="/buttons/large/update.gif" 
							    		   alt="Update Resource Types" name="<%= ExportAssetsForm.BUTTON_UPDATE_ASSET_TYPES %>"/>
							    </td>
							</tr>
						</table>
					</td>	
				</tr>
				<tr>
					<td>
						&nbsp;
					</td>
					<td class="ColRow tdAlignLeft">
			        	<html:checkbox property="<%= ExportAssetsForm.FIELD_DELETE_AFTER_EXPORT%>"/>&nbsp;Delete resources after export
				    </td>
				</tr>
			</table>
		</td>
	</tr>

	<tr>
		<td class="ColRow">
			When the process has completed, go to the Job Manager in the Back Office to view a summary of the export and to download the file.
		</td>
	</tr>

	<tr>
		<td align="center" class="ColRowBold">
            <base:showHideTag id="onExport">
	        <base:genericButton name="<%=ExportAssetsForm.BUTTON_EXPORT%>" onclick="hideElementonExport()" alt="<%=ExportAssetsForm.ALT_TEXT_BUTTON_EXPORT%>" src="/buttons/large/exportassets.gif"/>			
            </base:showHideTag>
		</td>
	</tr>	
	
</base:outlinedTable>

</base:form>

