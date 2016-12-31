<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.MoveAssetTemplatesForm" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>

<%
    MoveAssetTemplatesForm form = (MoveAssetTemplatesForm)request.getAttribute(MoveAssetTemplatesForm.FORM_NAME);
%>

<base:form action="/cataloging/servlet/handlemoveassettemplatesform.do">

    <logic:equal name="<%= MoveAssetTemplatesForm.FORM_NAME %>" property="showConfirmation" value="true">
        <base:messageBox>
        <tr>
            <td valign="baseline" class="ColRowBold">
                <p align="center">Are you certain that you want to move the "<%=form.getTemplateName() %>" template and any subgroups that it may contain?</p>
                <div align="center">
                    <base:yesNo/>
                </div>
            </td>
        </tr>
        </base:messageBox>
    </logic:equal>

<base:outlinedTable borderColor="#c0c0c0" cellspacing="1" id="<%=MoveAssetTemplatesForm.TABLE_MAIN %>">
	<tr>
		<td class="TableHeading" colspan="2">
			Move this Template...
		</td>
		<td class="TableHeading tdAlignRight">
		    <base:genericButton
		      src="/buttons/large/movetemplates.gif"
		      alt="<%= MoveAssetTemplatesForm.ALT_MOVE_TEMPLATE %>"
		      name="<%= MoveAssetTemplatesForm.BUTTON_MOVE %>"
	      	/>
		</td>
	</tr>
	<tr>
		<td class="ColRowBold">
		<base:imageSpacer width="40" height="1" /></td>
		<td>
			<base:selectAssetTemplate
				name="<%= MoveAssetTemplatesForm.FIELD_TEMPLATE_ID %>"
				selectedTemplateID="<%= form.getTemplateID()%>"
				excludeRootAsset="true"
			/>
		<td class="tdAlignRight">
			<base:closeButton withX="true"/>
		</td>
	</tr>
	<tr>
		<td class="ColRowBold">
			&nbsp;
		</td>
		<td class="ColRow">
			...and any subgroups it contains
		</td>
		<td class="ColRow">
			&nbsp;
		</td>
	</tr>
	<tr>
		<td class="TableHeading" colspan="3">
			To a position under this Template...
		</td>
	</tr>
	<tr>
		<td class="ColRowBold tdAlignRight">
			&nbsp;
		</td>
		<td>
			<base:selectAssetTemplate
				name="<%= MoveAssetTemplatesForm.FIELD_PARENT_TEMPLATE_ID %>"
				selectedTemplateID="<%= form.getParentTemplateID()%>"
				showChooseTemplateOption="true"
                excludeKit="true"
			/>
		</td>
		<td>
			&nbsp;
		</td>
	</tr>
	<tr>
		<td colspan="3" align="center">
			<base:imageLine/>
		</td>
	</tr>
	
	<tr>
		<td colspan="3">
			<base:assetTypeSelector assetTree="<%=form.getAssetTree()%>" supressCheckboxesAndButtons="true"/>
		</td>
	</tr>
</base:outlinedTable>

</base:form>

