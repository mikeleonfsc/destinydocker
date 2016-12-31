<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.DropdownListOptionAddEditForm" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%@page import="org.apache.struts.util.ResponseUtils"%><base:messageBox strutsErrors="true"/>

<%
    DropdownListOptionAddEditForm form = (DropdownListOptionAddEditForm)request.getAttribute(DropdownListOptionAddEditForm.FORM_NAME);
%>

<base:form action="/cataloging/servlet/handledropdownlistoptionaddeditform.do" focus="<%= DropdownListOptionAddEditForm.FIELD_DROPDOWN_LIST_OPTION_NAME %>">
<html:hidden property="<%=DropdownListOptionAddEditForm.PARAM_DROPDOWN_LIST_ID%>"/>
<html:hidden property="<%=DropdownListOptionAddEditForm.PARAM_DROPDOWN_LIST_OPTION_ID%>"/>
<base:outlinedTable borderColor="#c0c0c0" id="<%=DropdownListOptionAddEditForm.TABLE_OUTLINE%>" width="100%">
<tr>
	<td>
		<span class="ColRowBold">Dropdown List: <%= ResponseUtils.filter(form.getDropdownListName()) %></span><br><br>            
        <base:imageLine height="1" width="100%" /><br><br>
		<span class="ColRowBold">Option</span>&nbsp;
		<span class="ColRow"><html:text property="<%= DropdownListOptionAddEditForm.FIELD_DROPDOWN_LIST_OPTION_NAME %>" size="50" maxlength="50"/></span>
	</td>
	<td class="ColRowBold tdAlignRight">
        <base:showHideTag id="onSave">
    		<table id="<%=DropdownListOptionAddEditForm.TABLE_BUTTONS%>">
    			<tr>
    				<td><base:saveButton onclick="hideElementonSave()" name="<%= DropdownListOptionAddEditForm.BUTTON_SAVE %>"/></td>
    			</tr>
    		 	<tr>
    				<td><base:cancelButton name="<%= DropdownListOptionAddEditForm.BUTTON_CANCEL %>"/></td>
    			</tr>
    		</table> 	
        </base:showHideTag>
	</td>
</tr>
</base:outlinedTable>

</base:form>

