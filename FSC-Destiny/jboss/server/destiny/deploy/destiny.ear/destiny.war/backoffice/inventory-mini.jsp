<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.CopyInfoMiniTag" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>

<%
    InventoryForm form = (InventoryForm)request.getAttribute(InventoryForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );
    
    String focus = InventoryForm.FIELD_SCAN_BARCODE;
    if (form.isDisableFocus()) {
        focus = "";
    }
%>

<base:messageBox strutsErrors="true"/>
<logic:equal name="backoffice_servlet_InventoryForm" property="action" value="<%= InventoryForm.ACTION_UPLOAD %>">
    <center>
    <base:messageBox>
        <tr valign="top" align="center">
            <td class="ColRowBold" align="center">Your uploaded file has been sent to the Job Manager.</td>
        </tr>
    </base:messageBox>
    </center>
</logic:equal>

<logic:equal name="<%=InventoryForm.FORM_NAME%>" property="invChooser" value="true">
<base:form action="/backoffice/servlet/handleinventoryform.do" enctype="multipart/form-data">
	<html:hidden property="<%=InventoryForm.PARAM_COLLECTION_TYPE%>"/>
	<html:hidden property="<%=InventoryForm.PARAM_UPLOAD_FILE%>"/>
	<html:hidden property="<%=InventoryForm.BUTTON_NAME_ON_SUBMIT%>"/>
	<html:hidden property="<%=InventoryForm.PARAM_INV_CHOOSER%>"/>

       
   <table border="0" cellpadding="2" style="border-collapse: collapse" width="220">
   <% if ( form.getPartialAssetInventoryList().size()==0 ) { %>
       <tr>
       	<td class="ColRow" align="center">There are no active inventories.</td>
       </tr>
   <% } else { %>
       <tr>
           <td class="FormLabel">Choose Inventory</td>
       </tr>
       <tr>
       	<td align="center">
        		<bean:define id="invList" name="<%= InventoryForm.FORM_NAME %>" property="partialAssetInventoryList" />
        		<html:select property="<%=InventoryForm.FIELD_ASSET_INVENTORY_LIST_ID %>" onchange="dropDownSubmit()">
         			<html:options collection="invList" property="longID" labelProperty="stringDesc"/>
         		</html:select>
        	</td>
       </tr>
		<tr>
			<td colspan="2" class="FormLabel" nowrap>
	   			<table border="0" id="<%= InventoryForm.TABLE_INVENTORY_STATS %>" cellpadding="0" style="border-collapse: collapse" width="100%">
	   				<tr>
                        <td class="SmallColHeading">Started by <%=ResponseUtils.filter(form.getStartedByUserName())%></td>
                        <td class="SmallColHeading tdAlignRight"><%=form.getPercentCompleteMiniD()%></td>
	   				</tr>
	   			</table>
			</td>
		</tr>
		<tr>
	  			<td colspan="2"><base:imageLine width="100%" height="1"/></td>
	  		</tr>
		<tr>
			<td align="center" class="ColRow">
                   <base:okButton/>
	           </td>
		</tr>
   <% } %>
	</table>
</base:form>
        
	<script language="JavaScript">
	<!--
	function dropDownSubmit() {
	        document.<%=InventoryForm.FORM_NAME%>.<%=InventoryForm.BUTTON_NAME_ON_SUBMIT%>.value = "true";
	       document.<%=InventoryForm.FORM_NAME%>.submit();
	}
	//-->
	</script>

</logic:equal>

<logic:equal name="<%=InventoryForm.FORM_NAME%>" property="invChooser" value="false">
    <logic:equal name="<%=InventoryForm.FORM_NAME%>" property="uploadFile" value="false">
        <base:form action="/backoffice/servlet/handleinventoryform.do" focus="<%= focus %>" enctype="multipart/form-data" handleEnterKey="true">
        <html:hidden property="<%=InventoryForm.PARAM_COLLECTION_TYPE%>"/>
        <html:hidden property="<%=InventoryForm.PARAM_UPLOAD_FILE%>"/>
        <html:hidden property="<%=InventoryForm.FIELD_ASSET_INVENTORY_LIST_ID%>"/>
        <html:hidden property="copyIDToUpdateLocation"/>
        
<logic:present name="<%=InventoryForm.FORM_NAME%>" property="<%=InventoryForm.PARAM_TRANSFER_COPY_LIST%>">
    <base:imageSpacer width="1" height="3"/>
    <center>
    <base:messageBox >
        <base:transferOnScan formName="<%=InventoryForm.FORM_NAME%>"/>
    </base:messageBox>
    </center>
    <br>
</logic:present>
        
        <logic:equal name="<%=InventoryForm.FORM_NAME%>" property="showLocationAlertBox" value="true">
		    <base:imageSpacer width="1" height="3"/>
		
			<base:messageBox>
		        <tr>
		            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
		            <td align="center" class="ColRow">
			            <%=form.getUpdateLocationPrompt() %>
		            </td>
		        </tr>
		        <tr>
		            <td valign="baseline" align="center" class="ColRow" colspan="2">
		                <base:yesNo/>
		            </td>
		        </tr>
		    </base:messageBox>
		</logic:equal>
        
        <table border="0" cellpadding="2" style="border-collapse: collapse" width="220" id="<%=InventoryForm.TABLE_STATE_WARNING %>">
        <% if (form.countOfLocations() > 0 && 
            (form.getUnfinishedTransferCount() == 0 || !form.isStateInitiatedInventory() ) &&
            (form.getCollectionType() == CollectionType.TEXTBOOK || form.getCollectionType() == CollectionType.ASSET) ) { %>
            <tr>
            	<td colspan="2" class="ColRowBold">Location&nbsp;
            		<base:selectLocation name="<%=InventoryForm.FIELD_MINID_LOCATION_ID%>" selectedLocationID="<%=form.getMiniDLocationID()%>" collectionType="<%=BibMasterSpecs.COLLECTION_TYPE_UNDEFINED%>" includeUnspecified="true" truncateForMiniD="true"/>
		        </td>
            </tr>
        <% } %>
        <% if (store.isStateContext() || form.getUnfinishedTransferCount() == 0 || !form.isStateInitiatedInventory()) { %>
            <tr>
        		<td colspan="2" class="FormLabel" nowrap>
                    Barcode <span onKeyPress="return trapEnterKey(event);"><html:text property="<%= InventoryForm.FIELD_SCAN_BARCODE %>" size="14"/><base:imageSpacer width="3" height="1"/><base:genericButton absbottom="true" src="/icons/general/accountforicon.gif" name="<%= InventoryForm.BUTTON_ADD_TO_INVENTORY %>" alt="Add to Inventory"/></span>
                </td>
            </tr>
        <% } else { %>
                <tr>
                    <td colspan = "2" class = "FormLabel">
                        <% int c = form.getUnfinishedTransferCount(); %>
                        You will not be able to scan or enter barcodes into inventory <%="\"" + ResponseUtils.filter(form.getCurrentPartialInventoryVO().getEntityVO().getName()) + "\""%> until all incoming transfers have been received.<br>
                        Incoming transfers to receive: <%=c %>
                    </td>
                </tr>
        <% }
           if (form.getLastScannedCIB() != null) {
        %>
    		<tr>
    			<td colspan="2" class="TableHeading2">
    			    <base:copyInfoMini cib="<%= form.getLastScannedCIB() %>" displayMode="<%= CopyInfoMiniTag.COPY_INFO_DISPLAY_MODE_INVENTORY %>"/>
    		    </td>
    		</tr>
        <% } else { %>
    		<tr>
    			<td colspan="2" class="FormLabel" nowrap>&nbsp;</td>
    		</tr>
        <% } %>
        	
    		<tr>
    			<td colspan="2"><base:imageLine width="100%" height="1"/></td>
    		</tr>
    		<tr>
    			<td colspan="2" class="FormLabel" nowrap>
	   			<table border="0" id="<%= InventoryForm.TABLE_INVENTORY_STATS %>" cellpadding="0" style="border-collapse: collapse" width="100%">
	   				<tr>
                        <td class="SmallColHeading">Started by <%=form.getStartedByUserName()%></td>
                        <td class="SmallColHeading tdAlignRight"><%=form.getPercentCompleteMiniD()%></td>
	   				</tr>
	   			</table>
    			</td>
    		</tr>
	        <logic:notEqual name="<%=InventoryForm.FORM_NAME%>" property="collectionType" value='<%="" + BibMasterSpecs.COLLECTION_TYPE_ASSET%>'>
	    		<tr>
	    		   <td class="SmallColRow" colspan="2">
	                    <% if (form.getCollectionType() != BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK) { %>
	                        <html:checkbox property='<%= InventoryForm.FIELD_CHECK_SHELF_ORDER%>'>Check shelf order</html:checkbox>
	                    <% } %>
	    		   </td>
	    		</tr>
    		</logic:notEqual>
        </table>
        </base:form>
        
        
		<script language="JavaScript">
		<!--
		function dropDownSubmit() {
		        document.<%=InventoryForm.FORM_NAME%>.<%=InventoryForm.BUTTON_NAME_ON_SUBMIT%>.value = "true";
		        document.<%=InventoryForm.FORM_NAME%>.submit();
		}
		//-->
		</script>

    </logic:equal>
    <logic:equal name="<%=InventoryForm.FORM_NAME%>" property="uploadFile" value="true">
        <base:form action="/backoffice/servlet/handleinventoryform.do" enctype="multipart/form-data">
        <html:hidden property="<%=InventoryForm.PARAM_COLLECTION_TYPE%>"/>
        <html:hidden property="<%=InventoryForm.PARAM_UPLOAD_FILE%>"/>
        <table cellspacing="0" cellpadding="0" border="0" id="<%= InventoryForm.TABLE_ADD_BARCODES %>" width="100%">
            <% if ( form.getPartialAssetInventoryList().size()==0 ) { %>
	            <tr>
	            	<td class="ColRow" align="center">There are no active inventories.</td>
	            </tr>
            <% } else { %>
	            <tr>
	            	<td>
		            	<bean:define id="invList" name="<%= InventoryForm.FORM_NAME %>" property="partialAssetInventoryList" />
		            	<html:select property="<%=InventoryForm.FIELD_ASSET_INVENTORY_LIST_ID %>">
			            	<html:options collection="invList" property="longID" labelProperty="stringDesc"/>
			            </html:select>
		            </td>
	            </tr>
	            <% if (form.countOfLocations() > 0 && 
                      (form.getCollectionType() == CollectionType.TEXTBOOK || form.getCollectionType() == CollectionType.ASSET)) { %>
		            <tr>
		            	<td class="ColRowBold">Location&nbsp;
		            		<base:selectLocation name="<%=InventoryForm.FIELD_MINID_LOCATION_ID%>" selectedLocationID="<%=form.getMiniDLocationID()%>" collectionType="<%=BibMasterSpecs.COLLECTION_TYPE_UNDEFINED%>" includeUnspecified="true" truncateForMiniD="true"/>
				        </td>
		            </tr>
		        <% } %>
	            <tr>
                    <td class="FormLabel" nowrap>File<base:imageSpacer width="3" height="1"/><html:file property="<%= InventoryForm.FIELD_UPLOAD_FILE %>" size="15"/></td>
	            </tr>
		            <tr>
		                <td align="center" class="Instruction"><%=form.buildMiniDestinyInstructions()%></td>
		            </tr>
	            <tr>
	                <td align="center" class="FormElement">
                        <base:genericShowHideButton src="/buttons/large/uploadscans.gif" name="<%=InventoryForm.BUTTON_UPLOAD%>" alt="Upload Transactions"/>
	                </td>
	            </tr>
            <% } %>
        </table>
        </base:form>
    </logic:equal>
</logic:equal>


<logic:present name="backoffice_servlet_InventoryForm" property="soundFile" scope="request">

<jsp:include page="/circulation/setsound.jsp"/>

<script language="JavaScript">
<!--
    setSound("<bean:write name="backoffice_servlet_InventoryForm" property="soundFile"/>");
//-->
</script>

</logic:present>
