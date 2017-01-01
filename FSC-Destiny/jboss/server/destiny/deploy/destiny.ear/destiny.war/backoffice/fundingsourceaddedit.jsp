<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.FundingSourceAddEditForm" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>

<base:messageBox strutsErrors="true"/>

<%
    FundingSourceAddEditForm form = (FundingSourceAddEditForm)request.getAttribute(FundingSourceAddEditForm.FORM_NAME);
%>

<base:form action="/backoffice/servlet/handlefundingsourceaddeditform.do" focus="<%= FundingSourceAddEditForm.FIELD_FUNDING_SOURCE_NAME %>">
<html:hidden property="<%=FundingSourceAddEditForm.FIELD_FUNDING_SOURCE_ID%>"/>
<html:hidden property="<%= FundingSourceAddEditForm.PARM_FROM_ASSET_ITEM_EDIT_FORM%>"/>
<base:outlinedTable borderColor="#c0c0c0" id="<%=FundingSourceAddEditForm.TABLE_OUTLINE%>" width="100%">
<tr>
	<td>
		<span class="ColRowBold"><%= MessageHelper.formatMessage("fundingsourceaddedit_FundingSource") %></span>&nbsp;
		<span class="ColRow"><html:text property="<%= FundingSourceAddEditForm.FIELD_FUNDING_SOURCE_NAME %>" size="50" maxlength="50"/></span>
	</td>
	<td class="ColRowBold tdAlignRight">
        <base:showHideTag id="onSave">
    		<table id="<%=FundingSourceAddEditForm.TABLE_BUTTONS%>">
    			<tr>
    				<td><base:saveButton onclick="hideElementonSave()" name="<%= FundingSourceAddEditForm.BUTTON_SAVE %>"/></td>
    			</tr>
    		 	<tr>
    				<td><base:cancelButton name="<%= FundingSourceAddEditForm.BUTTON_CANCEL %>"/></td>
    			</tr>
    		</table>
        </base:showHideTag> 	
	</td>
</base:outlinedTable>

</base:form>

