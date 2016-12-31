<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.DropdownListAddEditForm" %>
<%@ page import="com.follett.fsc.destiny.util.lookup.LongStringLookupList" %>
<%@ page import="com.follett.fsc.destiny.util.lookup.LongStringLookup" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.util.ObjectHelper"%>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>

<%
    DropdownListAddEditForm form = (DropdownListAddEditForm)request.getAttribute(DropdownListAddEditForm.FORM_NAME);
%>

<base:form action="/cataloging/servlet/handledropdownlistaddeditform.do"focus="<%= DropdownListAddEditForm.FIELD_DROPDOWN_LIST_NAME %>">
   
<html:hidden property="<%=DropdownListAddEditForm.PARM_DROPDOWN_LIST_ID %>" />
<html:hidden property="<%=DropdownListAddEditForm.PARM_CONFIRM_DELETED_ID %>" />


<logic:notEmpty  name="<%= DropdownListAddEditForm.FORM_NAME %>" property="<%=DropdownListAddEditForm.PARM_CONFIRM_DELETE_MESSAGE%>">
   <base:messageBox showRedBorder="true">
       <tr valign="center">
           <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
           <td class="ColRowBold" align="center"><%= form.getConfirmDeleteMessage() %></td>
       </tr>
       <tr>
            <td>&nbsp;</td>
            <td valign="baseline" align="center" class="ColRow">
                <base:yesNo buttonYesName="<%=DropdownListAddEditForm.BUTTON_CONFIRM_DELETE%>"/>
            </td>
       </tr>
   </base:messageBox>
 </logic:notEmpty>
<base:outlinedTable borderColor="#c0c0c0" id="<%=DropdownListAddEditForm.TABLE_OUTLINED%>" width="100%">
	<tr>
		<td class="ColRowBold">
	        Dropdown List&nbsp;<html:text size="30" maxlength="30" property="<%=DropdownListAddEditForm.FIELD_DROPDOWN_LIST_NAME%>" />
		</td>
		<td rowspan="2" class="ColRowBold tdAlignRight">
            <base:showHideTag id="onSave">
                <base:saveButton onclick="hideElementonSave()"/><br><base:closeButton/>
            </base:showHideTag>
       </td>
	</tr>
	<tr>
		<td class="SmallColRow">
			A Dropdown List will not be used unless it contains at least one option.
		</td>
	</tr>
			
	<tr>
			<td colspan="2" width="100%">
				<base:imageLine height="1" width="100%" />
			</td>
	</tr>
			
	<tr>
		<td>
			<table id=<%= DropdownListAddEditForm.TABLE_LIST %> width="100%" border="0" cellspacing="0" cellpadding="2">
			    <%
			    //List is a list of value objects
			    LongStringLookupList list = form.getResultList();
			    Iterator iter = ObjectHelper.getIterator(list);
			    LongStringLookup value = null;
			    while (iter.hasNext()) {
			        value = (LongStringLookup) iter.next();
			    %>
                    <base:flipper key="ddlist">
			            <td class="ColRow"><%=ResponseUtils.filter(value.getStringDesc())%></td>
						
			            <td class="ColRow tdAlignRight">
			                <base:genericButton src="/icons/general/edit.gif" name="<%= DropdownListAddEditForm.BUTTON_EDIT_PREFIX + value.getLongID()%>" alt='<%= "Edit " + ResponseUtils.filter(value.getStringDesc()) %>'/>
			                &nbsp;
			                <base:genericButton src="/icons/general/delete.gif" name="<%= DropdownListAddEditForm.BUTTON_DELETE_PREFIX + value.getLongID()%>" alt='<%= "Delete " + ResponseUtils.filter(value.getStringDesc()) %>'/>
			            </td>
			        </base:flipper>
			    <% } %>
			</table>
		</td>
        <td valign="top" class="tdAlignRight">
            <base:genericButton src="/buttons/large/addoption.gif" name="<%= DropdownListAddEditForm.BUTTON_ADD_DROPDOWN_OPTION%>" alt="<%=DropdownListAddEditForm.ALT_ADD_OPTION %>"/>
        </td>
	</tr>
</base:outlinedTable>        
</base:form>

