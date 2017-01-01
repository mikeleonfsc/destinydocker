<%@page import="com.follett.fsc.destiny.util.xml.AssetTemplateBaseSpecs"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.AssetDescriptionEditForm" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.AssetDescriptionDetailForm" %>
<%@ page import="com.follett.fsc.destiny.session.cataloging.data.*" %>
<%@ page import="com.follett.fsc.destiny.util.lookup.LongStringLookup" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CopySpecs" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<bean:define id="form" name="<%=AssetDescriptionEditForm.FORM_NAME%>" type="AssetDescriptionEditForm"/>
<bean:define id="assets" name="<%=AssetDescriptionEditForm.FORM_NAME%>" property="assetTreeOptionList" />

<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handleassetdescriptioneditform.do" focus="<%=form.gimmeFocus()%>">
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true" name="trapEnterKey">
<input type="hidden" name="<%=AssetDescriptionEditForm.BUTTON_CHANGE_SUBMIT%>" value="false"/>

<%
    if (form.getDuplicateMessage() != null) {
%>
<html:hidden property="<%=AssetDescriptionEditForm.PARAM_DUP_BIB_ID%>"/>
<html:hidden property="<%=AssetDescriptionEditForm.FIELD_ISBN_COUNT%>"/>
    <base:imageSpacer width="1" height="3"/>
    <base:messageBox showWarningIcon="true" message="This record may duplicate an existing resource record.">
        <tr>
            <td><base:imageSpacer width="31" height="5"/></td>
            <td class="ColRow"><%=form.getDuplicateMessage()%></td>
        </tr>
        <tr>
            <td><base:imageSpacer width="31" height="5"/></td>
            <td colspan="2">
                <span class="ColRowBold">What do you want to do?</span>
                <span class="ColRow">
                    <br>&nbsp;&nbsp;<html:radio property="<%=AssetDescriptionEditForm.FIELD_EDIT_OPTION%>" value="<%=AssetDescriptionEditForm.EDIT_OPTION_GO_BACK%>">Go back to this record and make further changes.</html:radio>
                    <%
                        if (!AssetDescriptionEditForm.ACTION_DUPLICATE.equals(form.getAction())) {
                    %>
                        <br>&nbsp;&nbsp;<html:radio property="<%=AssetDescriptionEditForm.FIELD_EDIT_OPTION%>" value="<%=AssetDescriptionEditForm.EDIT_OPTION_USE_EXISTING%>">Discard these changes and go to the existing record.</html:radio>
                        <br>&nbsp;&nbsp;<html:radio property="<%=AssetDescriptionEditForm.FIELD_EDIT_OPTION%>" value="<%=AssetDescriptionEditForm.EDIT_OPTION_SAVE_ANYWAY%>">Create a duplicate record.</html:radio>
                    <%
                        }
                    %>
                    <logic:equal name="<%=AssetDescriptionEditForm.FORM_NAME%>" property="allowSaveAnywaysOptions" value="true">
                        <br>&nbsp;&nbsp;<html:radio property="<%=AssetDescriptionEditForm.FIELD_EDIT_OPTION%>" value="<%=AssetDescriptionEditForm.EDIT_OPTION_SAVE_ANYWAY%>">Save these changes anyway.</html:radio>
                    </logic:equal>
                </span>
            </td>
        </tr>
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <input type="submit" name="<%=AssetDescriptionEditForm.BUTTON_NAME_CONFIRM_SAVE%>" value="<%=AssetDescriptionEditForm.BUTTON_VALUE_OK%>">
            </td>
        </tr>
    </base:messageBox>
<%
    }
%>
<logic:equal name="<%=AssetDescriptionEditForm.FORM_NAME%>" property="<%=AssetDescriptionEditForm.FIELD_SHOW_ADD_CONTAINER_MESSAGE%>" value="true">
    <base:imageSpacer width="1" height="3"/>
    <base:messageBox showWarningIcon="true" message="This process cannot be reversed.  Do you want instances of this resource to include other items?">
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:yesNo 
                    buttonYesName="<%=AssetDescriptionEditForm.BUTTON_NAME_MAKE_RESOURCE_CONTAINER%>"
                    buttonNoName="<%=AssetDescriptionEditForm.BUTTON_NAME_CANCEL_MAKE_RESOURCE_CONTAINER%>"
                />
            </td>
        </tr>
    </base:messageBox>
</logic:equal>



<html:hidden property="<%=AssetDescriptionEditForm.FIELD_ACTION%>"/>
<html:hidden property="<%=AssetDescriptionEditForm.PARAM_LAST_MODIFIED%>"/>
<html:hidden property="<%=AssetDescriptionEditForm.PARAM_BIBID%>"/>
<base:outlinedTable id="<%=AssetDescriptionEditForm.TABLE_MAIN%>"  borderColor="#C0C0C0">
	<tr>
		<td class="ColRowBold">
			Resource Type&nbsp;
            <%
                if (form.getAssetTreeOptionList().size() > 1) {
            %>
				<html:select property="<%=AssetDescriptionEditForm.FIELD_ASSET_TYPE%>" onchange="submitDropDown()">
	            	<html:options collection="assets" property="longID" labelProperty="stringDesc"/>
	            </html:select>
            <%
                } else {
                	out.println(((LongStringLookup)form.getAssetTreeOptionList().get(0)).getStringDesc());
                   }
            %>
		</td>
	</tr>

<tr>
<td><base:imageLine height="2" width="95%" /></td>
</tr>
<tr>
<td>
<table id="<%=AssetDescriptionEditForm.TABLE_DETAILS%>" width="100%" cellpadding="3" cellspacing="0">

<%
    boolean didDrawLine = false;
%>
<logic:iterate id="reportRow" name="form" property="allAssetFields" type="AssetTemplateFormFieldValue">
		<%
		    if (!didDrawLine && !form.isDisplayableNameField(reportRow)) {
					didDrawLine = true;
		%>
			<tr>
				<td colspan="2">
					<base:imageLine/>
				</td>
			</tr>
		<%
		    }
            if (form.isTextbookAsset() && AssetTemplateBaseSpecs.DEFAULT_TEMPLATE_FIELD_ID_DESCRIPTION == reportRow.getAssetTemplateFieldID().intValue()) {
		%>
            <html:hidden property="UDFIELD_1" value=""/>
        <% } else { %>
		    <base:assetUserDefinedField fieldObjectName="reportRow" assetItemType="<%=CopySpecs.ASSET_ITEM_TYPE_DEFAULT%>" bibID="<%=form.PARAM_VALUE_ADD.equals(form.getAction()) ? null : form.getBibID() %>" />
        <% } %>
</logic:iterate>	
        <% if (!form.canDisplayContainerCheckbox() && form.isResourceContainer()) { %>
            <html:hidden property="<%=AssetDescriptionEditForm.FIELD_RESOURCE_CONTAINER%>" value="on"/>
         <% } else if (!form.canDisplayContainerCheckbox() && !form.isResourceContainer()) {%>
            <html:hidden property="<%=AssetDescriptionEditForm.FIELD_RESOURCE_CONTAINER%>" value="off"/>
         <% } %>
         
        <% if (form.canDisplayContainerCheckbox()) { %>
            <tr>
                <td class="ColRow tdAlignRight"><html:checkbox property="<%= AssetDescriptionEditForm.FIELD_RESOURCE_CONTAINER%>"></html:checkbox></td>
                <td class="ColRow">Includes other items <base:helpTag helpFileName="d_resource_container_AM.htm" /></td>
            </tr>
        <% } else if (form.canDisplayContainerCheckboxText())  {%>
            <tr>
                <td class="ColRow tdAlignRight">&nbsp;</td>
                <td class="ColRowBold">This resource includes other items. <base:helpTag helpFileName="d_resource_container_AM.htm" /></td>
            </tr>
         <% } %>

	<tr>
	<td class="Instruction" colspan="2">
	   * = Required Field
	</td>
	</tr>
</table>
</td>
</tr>
</base:outlinedTable>
<table id="<%=AssetDescriptionEditForm.TABLE_FOOTER%>" width="100%">
        <tr>
            <td>
                <a href="#TheTop" ><base:image src="/icons/general/top.gif" height="16" width="19" alt="<%=AssetDescriptionEditForm.LINK_TOP_OF_PAGE%>"/></a>
            </td>
            <td class="tdAlignRight">
                <base:saveButton name="<%=AssetDescriptionEditForm.BUTTON_NAME_SAVE_ASSET%>"/>
                <base:imageSpacer width="19" height="1"/>
                <base:cancelButton name="<%=AssetDescriptionEditForm.BUTTON_NAME_CANCEL_ASSET%>"/>
            </TD>
        </TR>

</table>

<script language="JavaScript" type="text/javascript">
  <!--
    function submitDropDown() {
            document.<%=AssetDescriptionEditForm.FORM_NAME%>.<%=AssetDescriptionEditForm.BUTTON_CHANGE_SUBMIT%>.value = "true";
            document.<%=AssetDescriptionEditForm.FORM_NAME%>.submit();
    }
  // -->
</script>
</base:form>

