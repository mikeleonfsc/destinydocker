<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.AssetTemplateFieldAEDForm" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.AssetTemplateSpecs" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<bean:define id="importanceList" type="java.util.Collection" name="<%= AssetTemplateFieldAEDForm.FORM_NAME %>" property="importanceList"/>
<bean:define id="dataTypeList" type="java.util.Collection" name="<%= AssetTemplateFieldAEDForm.FORM_NAME %>" property="dataTypeList"/>
<bean:define id="dropDownList" type="java.util.Collection" name="<%= AssetTemplateFieldAEDForm.FORM_NAME %>" property="dropDownList"/>

<base:messageBox strutsErrors="true"/>

<%
    AssetTemplateFieldAEDForm form = (AssetTemplateFieldAEDForm)request.getAttribute(AssetTemplateFieldAEDForm.FORM_NAME);
    String focus = form.getFieldType() == AssetTemplateSpecs.FIELD_TYPE_USER_DEFINED ?
    	AssetTemplateFieldAEDForm.FIELD_NAME : AssetTemplateFieldAEDForm.FIELD_IMPORTANCE;
%>

<script language="JavaScript" type="text/javascript">
  <!--
    function submitDropDown() {
        document.<%=AssetTemplateFieldAEDForm.FORM_NAME%>.submit();
    }
  // -->
</script>

<base:form action="/cataloging/servlet/handleassettemplatefieldaedform.do" focus="<%= focus %>">
<logic:equal name="<%= AssetTemplateFieldAEDForm.FORM_NAME %>" property="showDataTypeConfirmMessage" value="true">
	   <%     
            String[] messageText = new String[]{"Are you sure you want to change the data type of this field?"};
     %>
     <base:confirmBox showWarningIcon="true"
            header="<%=form.getDataTypeConfirmMessage()%>"
            messageText="<%=messageText%>"
            yesName="<%=AssetTemplateFieldAEDForm.BUTTON_CHANGE_DATA_TYPE_YES%>"
            noName="<%=AssetTemplateFieldAEDForm.BUTTON_CHANGE_DATA_TYPE_NO%>" />
            
    
</logic:equal>

	<base:outlinedTable cellspacing="0" cellpadding="3" width="95%" id="<%=AssetTemplateFieldAEDForm.TABLE_MAIN%>" borderColor="#C0C0C0">
		<tr>
			<td  class="TableHeading" valign="top" colspan="2"><%= form.getPageHeader() %></td>
			<td  class="TableHeading tdAlignRight" valign="top" width="100">
				<base:okButton/>
			</td>
		</tr>
		<tr>
			<td valign="top" colspan="2">
				<base:imageLine width="100%" height="1" />
			</td>
			<td valign="top">
				<base:cancelButton/>
			</td>
		</tr>
		<tr>
			<td class="ColRowBold tdAlignRight">Field Name</td>
			<td class="ColRow">
				<% if (form.getFieldType() == AssetTemplateSpecs.FIELD_TYPE_USER_DEFINED 
                    || form.getFieldType() == AssetTemplateSpecs.FIELD_TYPE_SYSTEM_DEFINED_NONFIXED_EDITABLE_NAME) { %>
					<html:text property="<%= AssetTemplateFieldAEDForm.FIELD_NAME %>" maxlength="30"/>
				<% } else { %>
					<bean:write name="<%=AssetTemplateFieldAEDForm.FORM_NAME%>" property="<%= AssetTemplateFieldAEDForm.FIELD_NAME %>"/>
				<% } %>
			</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td class="ColRowBold tdAlignRight">Data Type</td>
			<td class="ColRow">
				<% if (form.getFieldType() == AssetTemplateSpecs.FIELD_TYPE_USER_DEFINED) { %>
	                <html:select onchange="submitDropDown()" property="<%= AssetTemplateFieldAEDForm.FIELD_DATA_TYPE %>">
	                    <html:options collection="dataTypeList" property="longID" labelProperty="stringDesc"/>
	                </html:select>
				<% } else { %>
					<bean:write name="<%=AssetTemplateFieldAEDForm.FORM_NAME%>" property="dataTypeText"/>
				<% } %>
			</td>
			<td>&nbsp;</td>
		</tr>
		<logic:equal name="<%= AssetTemplateFieldAEDForm.FORM_NAME %>" property="<%= AssetTemplateFieldAEDForm.FIELD_DATA_TYPE %>" value='<%= "" + AssetTemplateSpecs.FIELD_DATA_TYPE_DROPDOWN %>'>
		<tr>
			<td class="ColRowBold tdAlignRight">&nbsp;</td>
			
			<td class="ColRow" valign="center">
				<table id="<%=AssetTemplateFieldAEDForm.TABLE_DROPDOWN%>" cellpadding="0" cellspacing="0" border="0">
					<tr>
						<td class="ColRow">
							<% if (form.getDropDownList() == null || form.getDropDownList().size() == 0) { %>
							-- Undefined --
							<html:hidden name="<%= AssetTemplateFieldAEDForm.FORM_NAME %>" property="<%= AssetTemplateFieldAEDForm.FIELD_DROPDOWN %>" value='<%= "" + AssetTemplateFieldAEDForm.DROPDOWN_NONE %>'/>
							<% } else { %>
			                <html:select property="<%= AssetTemplateFieldAEDForm.FIELD_DROPDOWN %>">
			                    <html:options collection="dropDownList" property="longID" labelProperty="stringDesc"/>
			                </html:select>
			                <% } %>
			           	</td>
			        	<td>
			                <base:genericButton absbottom="true" src="/buttons/large/other.gif" name="<%=AssetTemplateFieldAEDForm.BUTTON_DROPDOWN_OTHER %>" alt="Other..."/>
			           </td>
			        </tr>
			     </table>
		     </td>
		</tr>
		</logic:equal>		
		<logic:notEqual name="<%= AssetTemplateFieldAEDForm.FORM_NAME %>" property="<%= AssetTemplateFieldAEDForm.FIELD_DATA_TYPE %>" value='<%= "" + AssetTemplateSpecs.FIELD_DATA_TYPE_DROPDOWN %>'>
			<html:hidden name="<%= AssetTemplateFieldAEDForm.FORM_NAME %>" property="<%= AssetTemplateFieldAEDForm.FIELD_DROPDOWN %>" value='<%= "" + AssetTemplateFieldAEDForm.DROPDOWN_NONE %>'/>
	 	</logic:notEqual>
		<tr>
			<td class="ColRowBold tdAlignRight">Importance </td>
			<td class="ColRow">
                <html:select property="<%= AssetTemplateFieldAEDForm.FIELD_IMPORTANCE %>">
                    <html:options collection="importanceList" property="longID" labelProperty="stringDesc"/>
                </html:select>
			</td>
			<td>&nbsp;</td>
		</tr>
	</base:outlinedTable>

</base:form>

