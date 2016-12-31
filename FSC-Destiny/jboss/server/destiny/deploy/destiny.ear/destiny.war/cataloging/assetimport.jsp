<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.AssetImportForm" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>

<%
    AssetImportForm form = (AssetImportForm)request.getAttribute(AssetImportForm.FORM_NAME);
%>

<base:form action="/cataloging/servlet/handleassetimportform.do" enctype="multipart/form-data">
<html:hidden property="<%= AssetImportForm.PARM_ACTION %>"/>
<html:hidden property="<%=AssetImportForm.FIELD_CHANGED_SYMBOLOGY%>"/>

 <base:outlinedTableAndTabsWithinThere  selectedTab="<%=form.getSelectedTab()%>" tabs="<%=form.getAssetImportTabs()%>" id="<%=AssetImportForm.TABLE_OUTLINE_IMPORT_ASSET%>" borderColor="#c0c0c0" width="100%">
        <tr valign="top">
            <td class="TableHeading" colspan="3">
              <logic:equal name="<%=AssetImportForm.FORM_NAME%>" property="<%=AssetImportForm.PARM_ACTION%>" value="<%=AssetImportForm.ACTION_ADD_ONLY%>">
              		Import New and Updated Resources...
			  </logic:equal>
			  <logic:notEqual name="<%=AssetImportForm.FORM_NAME%>" property="<%=AssetImportForm.PARM_ACTION%>" value="<%=AssetImportForm.ACTION_ADD_ONLY%>">
              		Import Resource Updates...
			  </logic:notEqual>	
			</td>
        </tr>
		
		<logic:equal name="<%=AssetImportForm.FORM_NAME%>" property="<%=AssetImportForm.PARM_ACTION%>" value="<%=AssetImportForm.ACTION_UPDATE_ONLY%>">
           <tr>
              <td class=ColRowBold colSpan=2>Please&nbsp;note...</td>
           </tr>
           <tr>
           	  <td class=ColRow colSpan=3>
	           	  To match, resource records must have the same Destiny-generated 
				  control number. Only use this import option if 
				  you are importing updated resource and item records 
	              that were exported from <U>this</U> installation 
				  of Destiny. This import will not add any resources 
				  or items to your collection. 
			  </td>
		   </tr>

              <tr>
                 <td vAlign=top colSpan="3">
                    <base:imageLine height="1" width="100%" /> 
                 </td>
              </tr>
		</logic:equal>
        <logic:equal name="<%=AssetImportForm.FORM_NAME%>" property="<%=AssetImportForm.PARM_ACTION%>" value="<%=AssetImportForm.ACTION_ADD_ONLY%>">
 		<tr>
             <td colspan="3" class="FormLabel">Resource Matching</td>
        </tr>
        <tr>
            <td width="60">&nbsp;</td>
            <td colspan="2" class="FormLabel">If an incoming resource matches an existing resource:</td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td class="FormElement tdAlignRight">
                <html:radio property="<%=AssetImportForm.FIELD_SKIP_DUPLICATE_ASSETS%>" value="<%= AssetImportForm.VALUE_SKIP_ASSET%>"/>
            </td>
            
            <td class="ColRow">&nbsp;Skip the incoming resource</td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td class="FormElement tdAlignRight">
                <html:radio property="<%=AssetImportForm.FIELD_SKIP_DUPLICATE_ASSETS%>" value="<%= AssetImportForm.VALUE_REPLACE_ASSET%>"/>
            </td>
            <td class="ColRow">&nbsp;Overwrite the existing resource</td>
        </tr>
        <tr>
            <td colspan="4" class="FormLabel">Item Matching</td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td class="FormElement tdAlignRight">
                <html:radio property="<%=AssetImportForm.FIELD_SKIP_DUPLICATE_ITEMS%>" value="<%=AssetImportForm.VALUE_SKIP_ITEM%>"/>
            </td>
            <td class="ColRow">
                Skip the incoming item if it matches an existing item based on the resource identifier defined in your file (district identifier or barcode)
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td class="FormElement tdAlignRight">
                <html:radio property="<%=AssetImportForm.FIELD_SKIP_DUPLICATE_ITEMS%>" value="<%=AssetImportForm.VALUE_REPLACE_ITEM%>"/>
            </td>
            <td class="ColRow">
                Overwrite the existing item with the incoming item if the resource identifier defined in the file (district identifier or barcode) and the displayable resource name match
            </td>
        </tr>
            <tr>
                <td>&nbsp;</td>
                <td class="FormElement tdAlignRight">
                    <html:radio property="<%=AssetImportForm.FIELD_SKIP_DUPLICATE_ITEMS%>" value="<%=AssetImportForm.VALUE_ALWAYS_ADD_ITEM%>"/>
                </td>
                <td class="ColRow">
                    Always add the incoming item record and assign it the next available barcode
                </td>
            </tr>
                <base:isDistrictUser>
                    <html:hidden property="<%= AssetImportForm.FIELD_AUTO_ASSIGN_BARCODE %>"/>
                                 
                </base:isDistrictUser>
            <base:isNotDistrictUser>
            
                <tr>
                    <td colspan="2">&nbsp;</td>
                    <td colspan="1">
                        <table id="<%=AssetImportForm.TABLE_STARTING_BARCODE%>" width="100%" border="0" cellspacing="0" cellpadding="2">
                            <tr>
                                <td valign="top" width="123" class="ColRowBold">Starting Barcode</td>
                                <td class="ColRow">
                                   <html:radio property="<%=AssetImportForm.FIELD_AUTO_ASSIGN_BARCODE%>" value="false"
                                        onclick='<%="document." + AssetImportForm.FORM_NAME + "." + AssetImportForm.FIELD_STARTING_BARCODE + ".focus();"%>'/>
                                   <html:text property="<%=AssetImportForm.FIELD_STARTING_BARCODE%>" size="14" maxlength="14"
                                        onfocus='<%="document." + AssetImportForm.FORM_NAME + "." + AssetImportForm.FIELD_AUTO_ASSIGN_BARCODE + "[0].checked = true"%>'/><br>                        
                                   <base:link 
                                        permissions="<%=new Permission[] {Permission.BACK_OFFICE_CHANGE_SITE_PREFERENCES_ASSET}%>" 
                                        page="javascript:submitTheForm_ChangeSymbology()"
                                        collectionType="<%=form.getCollectionType() %>"
                                        appendCollectionType="false"
                                        showTextAlways="true">
                                        <%=form.getSymbologyText()%>
                                   </base:link>
                                </td>
                            </tr>
                            <tr>
                                <td>&nbsp;</td>
                                <td class="ColRow">
                                  <html:radio property="<%=AssetImportForm.FIELD_AUTO_ASSIGN_BARCODE%>" value="true"
                                        onclick='<%="document." + AssetImportForm.FORM_NAME + "." + AssetImportForm.FIELD_STARTING_BARCODE + ".value = \'\'"%>'/>
                                  Assign next barcode
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </base:isNotDistrictUser>
        </logic:equal>
 		<tr>
             <td colspan="2" class="FormLabel tdAlignRight" nowrap>Import File</td>
             <td><html:file property="<%=AssetImportForm.FIELD_UPLOAD_FILE%>" size="40"/></td>
        </tr>
         <tr valign="top">
             <td>&nbsp;</td>
             <td class="tdAlignRight"><html:checkbox property="<%=AssetImportForm.FIELD_BRIEF%>"></html:checkbox></td>
             <td class="ColRow">Limit the Job Summary details to errors and warnings (clear this option for a record of every resource in the import file).</td>
		 </tr>
         <tr>
             <td colspan="3" align="center" class="ColRowBold">
                 <base:showHideTag id="onAction">
                     <logic:equal name="<%=AssetImportForm.FORM_NAME%>" property="<%=AssetImportForm.PARM_ACTION%>" value="<%=AssetImportForm.ACTION_ADD_ONLY%>">
                         <base:genericButton
                             src="/buttons/large/preview2.gif"
                             alt="<%= AssetImportForm.ALT_PREVIEW_TEXT %>"
                             name="<%= AssetImportForm.BUTTON_PREVIEW %>"
                             onclick="hideElementonAction()"/>
                     </logic:equal>
            	     <base:genericButton
                         src="/buttons/large/importassets.gif"
                         alt="<%= AssetImportForm.ALT_SUBMIT_TEXT %>"
                         name="<%= AssetImportForm.BUTTON_IMPORT %>"
                         onclick="hideElementonAction()"/>
                     &nbsp; &nbsp;
                 </base:showHideTag>
             
             </td>
         </tr>
                        



  </base:outlinedTableAndTabsWithinThere>      




</base:form>


<SCRIPT LANGUAGE="javascript" TYPE="text/javascript">
<!--
    function submitTheForm_ChangeSymbology() {
        document.<%=AssetImportForm.FORM_NAME%>.<%=AssetImportForm.FIELD_CHANGED_SYMBOLOGY%>.value = "true";
        document.<%=AssetImportForm.FORM_NAME%>.submit();
    }
// -->
</SCRIPT>
<!-- end of page -->

