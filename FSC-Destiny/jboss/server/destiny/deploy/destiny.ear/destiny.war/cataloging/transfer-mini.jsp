<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%@ page import="com.follett.fsc.destiny.util.Barcode" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<bean:define id="form" name="<%= TransferForm.FORM_NAME %>" type="com.follett.fsc.destiny.client.cataloging.servlet.TransferForm"/>

<base:messageBox strutsErrors="true"/>
<logic:equal name="<%= TransferForm.FORM_NAME %>" property="<%= TransferForm.PARAM_FILE_SUBMITTED %>" value="true">
    <center>
    <base:messageBox>
        <tr valign="top" align="center">
            <td class="ColRowBold" align="center">Your uploaded file has been sent to the Job Manager.</td>
        </tr>
    </base:messageBox>
    </center>
</logic:equal>

<base:form action="/cataloging/servlet/handletransferform.do" enctype="multipart/form-data">
    <html:hidden property="<%=TransferForm.PARAM_BARCODE_LIST_ONLY%>"/>
	<html:hidden property="<%=GenericForm.FIELD_COLLECTION_TYPE%>"/>
	
	<table cellspacing="0" cellpadding="0" border="0" id="<%=TransferForm.TABLE_MAIN%>" width="100%">
        <tr>
            <td class="FormLabel" nowrap>To<base:imageSpacer width="3" height="1"/>
                <base:selectSite
                    name='<%= TransferForm.FIELD_TO_SITEID %>'
                    selectedSiteID='<%=""+form.getToSiteID() %>' 
                    useSelectASite='true'
                    includeLibrarySites="false"
    			    includeTextbookSites="<%= form.getCollectionType() == CollectionType.TEXTBOOK %>"
    			    includeMediaSites="false"
    			    includeAssetSites="<%= form.getCollectionType() == CollectionType.ASSET %>"
                    excludeThisSiteID="<%=form.excludeMySite()%>"
                    />
            </td>
        </tr>
        <logic:equal name="<%=TransferForm.FORM_NAME%>" property="<%=TransferForm.PARAM_COLLECTION_TYPE%>" value='<%=CollectionType.ASSET + ""%>'>
            <tr>
                <td class="ColRowBold" valign="absbottom"><html:checkbox property="<%=TransferForm.FIELD_CREATE_PACKING_LIST%>">&nbsp;Create a packing list</html:checkbox>
                </td>
           </tr>
       </logic:equal>     
        
        <logic:equal name="<%= TransferForm.FORM_NAME %>" property="<%=TransferForm.PARAM_BARCODE_LIST_ONLY%>" value="false" scope="request" >
            <tr>
                <td class="FormLabel" nowrap>File<base:imageSpacer width="3" height="1"/><html:file property="<%= TransferForm.FIELD_UPLOAD_FILE %>" size="15"/></td>
            </tr>
            <tr>
            	<logic:equal name="<%= TransferForm.FORM_NAME %>" property="textbookProductType" value="true" scope="request">
                	<td align="center" class="Instruction"><%=form.buildMiniDestinyInstructions()%></td>
                </logic:equal>
            	<logic:equal name="<%= TransferForm.FORM_NAME %>" property="assetProductType" value="true" scope="request">
                	<td align="center" class="Instruction"><%=form.buildMiniDestinyInstructions()%></td>
                </logic:equal>
            </tr>
            <tr>
                <td align="center" class="FormElement">
    				<base:genericShowHideButton src="/buttons/large/uploadscans.gif" 
    				    name="<%=TransferForm.BUTTON_TRANSFER%>" 
    				    alt="<%=TransferForm.ALT_SUBMIT_TEXT%>" elementID="<%=TransferForm.BUTTON_TRANSFER%>"/>
                </td>
            </tr>
        </logic:equal>
        <logic:equal name="<%= TransferForm.FORM_NAME %>" property="<%=TransferForm.PARAM_BARCODE_LIST_ONLY%>" value="true" scope="request" >
            <tr>
            <td>
               <base:barcodeList barcodeType="<%=Barcode.BARCODETYPE_COPY %>"
                   formName="<%=TransferForm.FORM_NAME%>"
                   collectionType="<%=form.getCollectionType()%>" />
            </td>
            </tr>
            <tr>
                <td align="center" class="FormElement">
                <logic:equal name="<%= TransferForm.FORM_NAME %>" property="assetProductType" value="true" scope="request">
					<base:genericShowHideButton src="/buttons/large/transferitems.gif"
						name="<%= TransferForm.BUTTON_TRANSFER %>"
						alt="<%= TransferForm.ALT_SUBMIT_TEXT_ITEMS %>" elementID="<%= TransferForm.BUTTON_TRANSFER %>"/>
				</logic:equal>		
                <logic:equal name="<%= TransferForm.FORM_NAME %>" property="assetProductType" value="false" scope="request">
					<base:genericShowHideButton src="/buttons/large/transfercopies.gif"
						name="<%= TransferForm.BUTTON_TRANSFER %>"
						alt="<%= TransferForm.ALT_SUBMIT_TEXT %>" elementID="<%= TransferForm.BUTTON_TRANSFER %>"/>
				</logic:equal>		
                </td>
            </tr>
        </logic:equal>
    </table>
</base:form>
