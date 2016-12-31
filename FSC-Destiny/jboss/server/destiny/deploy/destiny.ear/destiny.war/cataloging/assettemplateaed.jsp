<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.AssetTemplateAEDForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.AssetTemplateSpecs" %>
<%@ page import="com.follett.fsc.destiny.util.xml.AssetTemplateBaseSpecs" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<base:messageBox strutsErrors="true"/>

<%
    AssetTemplateAEDForm form = (AssetTemplateAEDForm)request.getAttribute(AssetTemplateAEDForm.FORM_NAME);
%>

<base:form action="/cataloging/servlet/handleassettemplateaedform.do" focus="<%=form.getFocusControl()%>">
<html:hidden property="<%= AssetTemplateAEDForm.PARM_LEAF_NODE %>"/>
<html:hidden property="<%= AssetTemplateAEDForm.PARM_ORIGINAL_ASSIGN_TO %>"/>

<%if (form.getDeleteID() != null) { 
           
            String[] messageText = new String[]{"Are you sure you want to delete this field?"};
    
%>

            <base:confirmBox showWarningIcon="true" filterMessage="false"
            header="<%=form.getDeleteMessage()%>"
            messageText="<%=messageText%>"
            yesName="<%=AssetTemplateAEDForm.BUTTON_DELETE_YES%>"
            noName="<%=AssetTemplateAEDForm.BUTTON_DELETE_NO%>" />
            
	
<% } %>

<script language="JavaScript" type="text/javascript">
  <!--
    function submitLocalCheckbox() {
            document.<%=AssetTemplateAEDForm.FORM_NAME%>.submit();
    }
  // -->
</script>

<base:outlinedTable id="<%= AssetTemplateAEDForm.TABLE_MAIN %>" width="100%" borderColor="#C0C0C0">
    <tr valign="top">
        <td class="SmallColHeading">
        	<bean:write name="<%= AssetTemplateAEDForm.FORM_NAME %>" property="ancestorsAsString"/>
	    </td>
        <td class="ColRowBold tdAlignRight" rowspan="2">
            <base:showHideTag id="onSave">
           	    <base:saveButton onclick="hideElementonSave()"/><br><base:cancelButton/>
            </base:showHideTag>
	    </td>
	</tr>
    <tr valign="top">
    	<td class="TableHeading">
    		<% if (form.getIsTextbookAsset()) {	%>
            Resource Type: <%= form.getTemplateName() %>
            <% } else {  %>
            Resource Type: <%= form.getTemplateNameHTML()%>
    		<% } %>
        
		</td>
	</tr>
    <c:if test="<%= form.areAssetKitsEnabled() && AssetTemplateAEDForm.areAssetKitsEnabled() && form.isLeafNode() && !form.isAssignedTo() && !form.isMaintenanceEnabled() %>">
        <tr valign="top">
            <td class="ColRow">
                <html:checkbox property="<%= AssetTemplateAEDForm.FIELD_KIT %>" onclick="submitLocalCheckbox()"> Make Resource Kit</html:checkbox>
            </td>
        </tr>
    </c:if>
    <c:if test="<%=!form.isKit()%>">
          <%  if (!form.getIsTextbookAsset()) {
    	       if (!form.isRootAssetTemplate()) {
        		if (!form.canEditAssignTo()) { %>
        			<html:hidden property="<%= AssetTemplateAEDForm.FIELD_ASSIGNED_TO %>" value="on"/>
        		    <tr valign="top">
        		    	<td class="ColRow" colspan="2">
        		    		<base:image src="/icons/general/check_19.gif" width="19" height="16" align="absbottom"/> Represents software that can be assigned to...&nbsp;<base:helpTag helpFileName="d_asset_template_software.htm"/>
        				</td>
        			</tr>
        		    <tr valign="top">
        		    	<td class="ColRow" colspan="2">
        		    		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&quot;<%= ResponseUtils.filter(form.getTemplateAEDValue().getAssignedToAssetTemplateName()) %>&quot;
        				</td>
        			</tr>
        		<% } else {  %>
        		    <tr valign="top">
        		    	<td class="ColRow" colspan="2">
        		    		<html:checkbox property="<%= AssetTemplateAEDForm.FIELD_ASSIGNED_TO %>" onclick="submitLocalCheckbox()">Represents software that can be assigned to...</html:checkbox>&nbsp;<base:helpTag helpFileName="d_asset_template_software.htm"/>
        				</td>
        			</tr>
        			<% if (form.isAssignedTo()) { %>
        			    <tr valign="top">
        			    	<td class="ColRow" colspan="2">
        			    		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<base:selectAssetTemplate name="<%= AssetTemplateAEDForm.FIELD_TEMPLATE_ASSIGNED_TO_ID %>" onchange="submitLocalCheckbox()" selectedTemplateID="<%= form.getTemplateAssignedToID()%>"/>
        					</td>
        				</tr>
        			<% }
        		 }
    	   } 
    	} else { %>
            <tr valign="top">
                <td class="ColRow" colspan="2">
                   <%= form.getRepresentsTextbooksIcon()%> 
                   <%= AssetTemplateAEDForm.IS_TEXTBOOK_ASSET_DISPLAYABLE%>  
                </td>
            </tr> 
        <%}%>
    </c:if>       
    <c:if test="<%=!form.isAssignedTo() && !form.isKit()%>">
        <tr valign="top">
            <td class="ColRow">
                <html:checkbox property="<%= AssetTemplateAEDForm.FIELD_MAINTENANCE_ENABLED %>" onclick="submitLocalCheckbox()"> Schedule preventive maintenance</html:checkbox>
            </td>
        </tr>
        <logic:equal name="<%=AssetTemplateAEDForm.FORM_NAME%>" property="<%=AssetTemplateAEDForm.FIELD_MAINTENANCE_ENABLED %>" value="true">
            <tr>
                <td class="ColRow" nowrap>
                    &nbsp;&nbsp;&nbsp;&nbsp;Send email notification to custodian every&nbsp;
                    <html:text property="<%=AssetTemplateAEDForm.FIELD_MAINTENANCE_INTERVAL%>" size="3" maxlength="3"/>&nbsp;
                    <%=JSPHelper.renderDropDown(AssetTemplateAEDForm.FIELD_MAINTENANCE_UNIT_DROPDOWN, null, form.getMaintenanceUnitDropDownValues(), form.getMaintenanceUnitDropdown()) %>
                </td>
            </tr>
            <tr>
                <td class="ColRow" nowrap>
                    &nbsp;&nbsp;&nbsp;&nbsp;Maintenance description&nbsp;<html:text property="<%=AssetTemplateAEDForm.FIELD_MAINTENANCE_DESCRIPTION%>" size="50" maxlength="50"/>
                </td>
            </tr>            
        </logic:equal>
    </c:if>
    <!------------------------------------ Servicing Teams ----------------------------->
    <tr valign="top">
        <td class="ColRow">
            <html:checkbox property="<%= AssetTemplateAEDForm.FIELD_ASSIGN_REPAIR_RESPONSIBILITY_ENABLED %>" onclick="submitLocalCheckbox()"> Assign repair responsibility</html:checkbox>
        </td>
    </tr>
    <logic:equal name="<%=AssetTemplateAEDForm.FORM_NAME%>" property="<%=AssetTemplateAEDForm.FIELD_ASSIGN_REPAIR_RESPONSIBILITY_ENABLED %>" value="true">
        <tr>
            <td>
                <table>
                    <tr>
                        <td class="ColRow" nowrap align="right">
                            &nbsp;&nbsp;&nbsp;&nbsp;Servicing Team:&nbsp;
                        </td>
                        <% if (form.getServicingTeamList() == null || form.getServicingTeamList().size() <= 1) { %>
                            <td class="ColRowBold">
                                <% if (form.isDistrictUser()) {%>
                                    No servicing teams defined
                                 <% } else { %>
                                    No local servicing teams defined
                                <% } %>
                            </td>
                        <% } else { %>
                            <td>
                                <%= JSPHelper.renderDropDown(AssetTemplateAEDForm.FIELD_SERVICING_TEAM_ID, null, form.getServicingTeamList(), form.getServicingTeamID()) %>
                            </td>
                        <% } %>
                        <td class="ColRow">
                            <base:genericButton src="/buttons/large/other.gif" name="<%= AssetTemplateAEDForm.BUTTON_SERVICING_TEAM_OTHER %>" alt="Other" absbottom="true"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </logic:equal>
    <logic:equal name="<%=AssetTemplateAEDForm.FORM_NAME%>" property="<%=AssetTemplateAEDForm.FIELD_ASSIGN_REPAIR_RESPONSIBILITY_ENABLED %>" value="false">
        <tr>
            <td class="ColRow" nowrap id=<%= AssetTemplateAEDForm.ID_FIELD_SERVICING_TEAM_TEXT %>>
                &nbsp;&nbsp;&nbsp;&nbsp;Servicing Team: <bean:write name="<%= AssetTemplateAEDForm.FORM_NAME %>" property="<%= AssetTemplateAEDForm.FIELD_SERVICING_TEAM_TEXT %>"/>&nbsp;
            </td>
        </tr>
    </logic:equal>
    
    
    <html:hidden property="<%= AssetTemplateAEDForm.FIELD_PARENT_TRANSFER_CHECKED_OUT_ITEMS %>" />
    <% if (!form.isRootAssetTemplate()) {%>
        <tr valign="top">
               <td class="ColRow" colspan="2">
         <%
         if(form.isParentTransferCheckedOutItems()){
             //image with the transferred checked
         %>
            <base:image src="/icons/general/check_19.gif" width="19" height="16" align="absbottom"/> Checked out items will be transferred when patron is transferred
         <%
         }else{
             //checkbox...checked or not depending on the property...
         %>
            <html:checkbox property="<%= AssetTemplateAEDForm.FIELD_TRANSFER_CHECKED_OUT_ITEMS %>" > Checked out items will be transferred when patron is transferred</html:checkbox>
         <%}%>
         <base:helpTag helpFileName="t_transfer_chckd_items_patron_transfer_AM.htm"/>               
              </td>
        </tr>
    <%}else{%>
    <html:hidden property="<%= AssetTemplateAEDForm.FIELD_TRANSFER_CHECKED_OUT_ITEMS %>" />
    <%}%>
	<tr>
		<td colspan="2">
			<table  cellpadding="2" cellspacing="0" id="<%= AssetTemplateAEDForm.TABLE_DEPRECIATION_INFO%>" width="100%">
				<tr>
					<td colspan="2">
						<span class="TableHeading2">Depreciation Information</span>
						<span class="SmallColRow"><%=form.getDepreciationInheritedFrom()%></span>
					</td>
				</tr>
				<tr bgcolor="#E8E8E8">
				<logic:empty name="<%=AssetTemplateAEDForm.FORM_NAME%>" property="<%=AssetTemplateAEDForm.PARM_DEPRECIABLE_LIFE%>">
					<td class="ColRowBold">
						- Undefined -
					</td>
				</logic:empty>
				<logic:notEmpty name="<%=AssetTemplateAEDForm.FORM_NAME%>" property="<%=AssetTemplateAEDForm.PARM_DEPRECIABLE_LIFE%>">
					<td class="ColRow">
						<b>Depreciable Life:</b>
						<%=form.getDepreciableLife()%> years
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Depreciation Convention:</b>
						<%=form.getDepreciationConvention()%> 
					</td>
				</logic:notEmpty>
					
					<td>
						<base:genericButton src="/icons/general/edit.gif" alt="<%=AssetTemplateAEDForm.ALT_EDIT_DEPRECIATION%>" name="<%=AssetTemplateAEDForm.BUTTON_NAME_EDIT_DEPRECIATION%>" />
					</td>
				</tr>
			</table>
		</td>
	</tr>
	
	<tr>
		<td colspan="2">
			<base:imageLine height="2" width="100%" />
		</td>
	</tr>
		
	<tr>
		<td colspan="2">
			<table  cellpadding="2" cellspacing="0" id="<%= AssetTemplateAEDForm.TABLE_DISPLAYABLE_NAME%>" width="100%">
				<tr>
					<td colspan="5">
						<span class="TableHeading2">Displayable Name</span><%= form.getCompositeInheritedFromName() %>
					</td>
				</tr>
				<tr>
					<td class="SmallColHeading">Field 1</td>
                    <% if (form.getIsTextbookAsset()) { %>
                        <td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td>
                    <% } else {  %>
					   <td class="SmallColHeading">Field 2</td>
					   <td class="SmallColHeading">Field 3</td>
					   <td class="SmallColHeading">Field 4</td>
                    <% } %>
					<td>&nbsp;</td>
				</tr>
				<tr bgcolor="#E8E8E8">
					<td class="ColRowBold"><%= form.getComposite1FieldName() %></td>
                    <% if (form.getIsTextbookAsset()) { %>
                       <td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td>
                    <% } else {  %>
				       <td class="ColRowBold"><%= form.getComposite2FieldName() %></td>
					   <td class="ColRowBold"><%= form.getComposite3FieldName() %></td>
					   <td class="ColRowBold"><%= form.getComposite4FieldName() %></td>
					   <td>
						<base:genericButton src="/icons/general/edit.gif" alt="<%=AssetTemplateAEDForm.ALT_EDIT_DISPLAYABLE%>" name="<%=AssetTemplateAEDForm.BUTTON_NAME_EDIT_DISPLAYABLE%>" />
					   </td>
                    <% } %>
				</tr>
			</table>
		</td>
	</tr>
	
	<tr>
		<td colspan="2">
			<base:imageLine height="2" width="100%" />
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<table  cellpadding="2" cellspacing="0" id="<%= AssetTemplateAEDForm.TABLE_FIELDS_DESCRIPTION%>" width="100%">
				<tr>
					<td class="TableHeading2" valign="bottom">General Resource Description Fields</td>
					<td class="SmallColHeading" valign="bottom">&nbsp;</td>
					<td class="SmallColHeading" valign="bottom">&nbsp;</td>
					<td class="SmallColHeading tdAlignRight" valign="bottom">
						<%= form.getAddFieldButton(AssetTemplateSpecs.FIELD_TEMPLATE_TYPE_DESCRIPTION) %>
					</td>
				</tr>
				<tr>
					<td class="SmallColHeading">Field Name</td>
					<td class="SmallColHeading">Data Type</td>
					<td class="SmallColHeading">Importance</td>
					<td class="SmallColHeading">Added by... </td>
				</tr>
			    <logic:iterate id="field" name="<%= AssetTemplateAEDForm.FORM_NAME %>" property="descriptionFieldList" type="com.follett.fsc.destiny.session.cataloging.ejb.data.AssetTemplateFieldAEDValue">
                    <base:flipper key="assettemplate">
						<td class="ColRowBold"><bean:write name="field" property="fieldName" /></td>
						<td class="ColRow"><%=form.getDataTypeDescription(field)%></td>
						<td class="ColRow"><%=form.getImportance(field)%></td>
						<td class="SmallColRow">
							<%= form.getButtonsOrOwningTemplate(field) %>
						</td>
					</base:flipper>
				</logic:iterate>
			</table>
		</td>
	</tr>

	<tr>
		<td colspan="2">
			<base:imageLine height="2" width="100%" />
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<table id="<%= AssetTemplateAEDForm.TABLE_FIELDS_ITEM%>" cellpadding="2" cellspacing="0" width="100%">
				<tr>
					<td class="TableHeading2" valign="bottom">
						<% if (form.isAssignedTo()) { %>
						License/Media Fields
						<% } else { %>
						Item-Specific Fields
						<% } %>
					</td>
					<td class="SmallColHeading" valign="bottom">&nbsp;</td>
					<td class="SmallColHeading" valign="bottom">&nbsp;</td>
					<td class="SmallColHeading tdAlignRight" valign="bottom">
						<%= form.getAddFieldButton(AssetTemplateSpecs.FIELD_TEMPLATE_TYPE_ITEM) %>
					</td>
				</tr>
				<tr>
					<td class="SmallColHeading">Field Name</td>
					<td class="SmallColHeading">Data Type</td>
					<td class="SmallColHeading">Importance</td>
					<td class="SmallColHeading">Added by... </td>
				</tr>
			    <logic:iterate id="field" name="<%= AssetTemplateAEDForm.FORM_NAME %>" property="itemFieldList" type="com.follett.fsc.destiny.session.cataloging.ejb.data.AssetTemplateFieldAEDValue">
			    	<% if (field.getFieldID() == null || ((form.isAssignedTo() && form.isSoftware()) || !AssetTemplateBaseSpecs.isSoftwareOnlyVisible(field.getFieldID().intValue()))) {
			        %>
                        <base:flipper key="assettemplate2">
						<td><span  class="ColRowBold"><bean:write name="field" property="fieldName" /></span>
						<% if (form.isAssignedTo() && form.isSoftware() && field.getFieldID() != null) {
						    String suffix = AssetTemplateBaseSpecs.getSuffix(field.getFieldID().intValue());
						    if (!StringHelper.isEmpty(suffix)) {
						%>
								<span class="ColRow">
									<%= suffix %>
								</span>
						<%		}
							}
						%>
						</td>
						<td class="ColRow"><%=form.getDataTypeDescription(field)%></td>
						<td class="ColRow"><%=form.getImportance(field)%></td>
						<td class="SmallColRow">
							<%= form.getButtonsOrOwningTemplate(field) %>
						</td>
					</base:flipper>
				<% } %>
				</logic:iterate>
			</table>
		</td>
	</tr>

</base:outlinedTable>
</base:form>
