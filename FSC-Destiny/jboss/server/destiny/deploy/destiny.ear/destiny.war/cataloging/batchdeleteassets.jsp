<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.SoftwareByItemReportForm" %>
<%@ page import="com.follett.fsc.destiny.util.Barcode" %>

<%@ page import="com.follett.fsc.destiny.util.Permission" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    BatchDeleteAssetsForm form = (BatchDeleteAssetsForm)request.getAttribute(BatchDeleteAssetsForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true"/>
<base:form action="/cataloging/servlet/handlebatchdeleteassetsform.do" enctype="multipart/form-data">

<base:outlinedTableAndTabsWithinThere id="<%=UpdateCopiesBaseForm.TABLE_MAIN%>"  borderColor="#C0C0C0" selectedTab="<%=BatchDeleteAssetsForm.ID_TAB_BATCH_DELETE%>" tabs="<%=form.getAssetTabs()%>" >
<tr>
    <td>
        <table border="0" cellspacing="0" cellpadding="0" width="100%" id="<%=BatchDeleteAssetsForm.TABLE_HEADER%>">
            <tr>
                <td class="TableHeading" colspan="2">Delete Resources...</td>
            </tr>
            <tr>
            	<td colspan="2">&nbsp;</td>
            </tr>
            
	    <base:isDistrictUser>
			<tr>
			    <td>&nbsp;</td>        
		    	<td class="ColRowBold">
		    	For&nbsp;	    	 
		                <base:selectSite 
		                    selectedSiteID="<%= String.valueOf(form.getSiteID())%>"
		                	useSelectASite="true"
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
	        	<td colspan="2">
	        		<base:imageLine/>
	        	</td>
		    </tr>
            
            <tr>
               <td>&nbsp;</td>
               <td>
                  <base:barcodeList 
                      formName="<%=BatchDeleteAssetsForm.FORM_NAME%>"
                      barcodeType="<%=Barcode.BARCODETYPE_ASSET_ITEM%>"/>

               </td>
            </tr>

   		    <tr>
   		        <td colspan="2">
	        		<base:imageLine/>
   		        </td>
   		    </tr>
   		    
			<base:spanIfAllowed permission="<%=Permission.CAT_ASSET_DELETE_ASSET%>">
			<tr>
				<td valign="top"><html:checkbox property="<%= BatchDeleteAssetsForm.FIELD_DELETE_ASSET_DESCRIPTION %>"></html:checkbox></td>
				<td class="ColRowBold" valign="top">When the last item of a resource is deleted, remove the resource from this collection.</td>
   		    </tr>    		

   		    <tr>
   		        <td colspan="2">
	        		<base:imageLine/>
   		        </td>
   		    </tr>
   		    </base:spanIfAllowed>

            <tr valign="top">
                <td valign="top" colspan="2" align="center" class="ColRowBold">
                    <%= GenericForm.getLastBackupDisplayMsg(true) %>
                </td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRowBold" colspan="2">
                    <base:showHideTag id="hideIt">
					<base:genericButton onclick="hideElementhideIt()" src="/buttons/large/deletebig.gif" name="<%=BatchDeleteAssetsForm.BUTTON_DELETE%>" alt="<%=BatchDeleteAssetsForm.BUTTON_DELETE_ALT_TEXT%>"/>
                    </base:showHideTag>
                </td>
            </tr>
        </table>

    </td>
</tr>
</base:outlinedTableAndTabsWithinThere>
</base:form>

