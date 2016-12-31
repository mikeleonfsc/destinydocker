<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.DropdownListForm" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.FundingSourceListForm" %>
<%@ page import="com.follett.fsc.destiny.util.lookup.LongStringLookupList" %>
<%@ page import="com.follett.fsc.destiny.util.lookup.LongStringLookup" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.util.ObjectHelper"%>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>

<%
    DropdownListForm form = (DropdownListForm)request.getAttribute(DropdownListForm.FORM_NAME);
%>

<base:form action="/cataloging/servlet/handledropdownlistform.do">
<html:hidden property="<%= DropdownListForm.PARM_HIDE_TABS%>"/>

<logic:notEmpty  name="<%= DropdownListForm.FORM_NAME %>" property="<%=DropdownListForm.PARM_CONFIRM_DELETE_MESSAGE%>">
   <html:hidden property="<%= DropdownListForm.PARM_CONFIRM_DELETED_ID%>"/>
   <base:messageBox showRedBorder="true">
       <tr valign="center">
           <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
           <td class="ColRowBold"><%= form.getConfirmDeleteMessage() %></td>
       </tr>
 	   <tr>
       	    <td>&nbsp;</td>
       	    <td valign="baseline" align="center" class="ColRow">
           	    <base:yesNo buttonYesName="<%=DropdownListForm.BUTTON_CONFIRM_DELETE%>"/>
           	</td>
   	   </tr>
   </base:messageBox>
 </logic:notEmpty>
<base:outlinedTableAndTabsWithinThere borderColor="#c0c0c0" id="<%=DropdownListForm.TABLE_OUTLINED%>" width="100%" selectedTab="<%=DropdownListForm.ID_TAB%>" tabs="<%=form.getTabs()%>">
	<tr>
		<td class="TableHeading">
			<%= DropdownListForm.PAGE_TITLE %>
		</td>
		<td class="tdAlignRight">
			<base:link page="/cataloging/servlet/presentdropdownlistaddeditform.do" id="<%=DropdownListForm.BUTTON_ADD_DROPDOWN_LIST %>">
			  <base:image src="/buttons/large/addlist.gif"  alt="<%= DropdownListForm.ALT_ADD_DROPDOWN_LIST %>" />
			</base:link>&nbsp;
		</td>
	</tr>
			
	<tr>
		<td class="SmallColRow">
			A Dropdown List will not be used unless it contains at least one option.
		</td>
		<td class="tdAlignRight">&nbsp;</td>
	</tr>
			
	<tr>
		<td width="100%">
			<base:imageLine height="1" width="100%" />
		</td>
		<td class="tdAlignRight">
			<base:genericButton name="<%=CancelButtonTag.BUTTON_NAME%>" src="/buttons/large/close.gif" alt="Close"/>
		</td>
	</tr>
			
	<tr>
		<td colspan="2">
			<table id=<%= DropdownListForm.TABLE_LIST %> width="100%" border="0" cellspacing="0" cellpadding="2">
			    <%
			    //List is a list of value objects
			    LongStringLookupList list = form.getResultList();
			    Iterator iter = ObjectHelper.getIterator(list);
			    int flipper = 0;
			    LongStringLookup value = null;
			    while (iter.hasNext()) {
			        value = (LongStringLookup) iter.next();
			        if ( ( flipper & 1 ) == 0 ) {
			            %> 
			            <tr bgColor="#E8E8E8">
			            <%
			        }
			        else {
			            %> 
			            <tr>
			            <%
			        }
			        flipper++;
			    %>
			            <td class="ColRow"><%= ResponseUtils.filter(value.getStringDesc())%><%= ResponseUtils.filter(DropdownListForm.getOptionsDefinedString(value.getLongID())) %></td>
						
			            <td class="ColRow tdAlignRight">
			                <base:link page='<%= "/cataloging/servlet/presentdropdownlistaddeditform.do?dropdownListID=" + value.getLongID()%>' id="<%=DropdownListForm.ID_BUTTON_EDIT + value.getLongID() %>">
			                    <base:image src="/icons/general/edit.gif" alt='<%="Edit " + ResponseUtils.filter(value.getStringDesc()) %>' width="19" height="16"/>
			                </base:link>
			                &nbsp;
			                <base:genericButton src="/icons/general/delete.gif" name="<%= DropdownListForm.BUTTON_DELETE_PREFIX + value.getLongID()%>" alt='<%= "Delete " + value.getStringDesc() %>'/>
			            </td>
			        </tr>
			    <% } %>
			</table>
		</td>
	</tr>
</base:outlinedTableAndTabsWithinThere>
</base:form>

