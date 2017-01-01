<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
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
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>


<base:messageBox strutsErrors="true"/>

<%
    FundingSourceListForm form = (FundingSourceListForm)request.getAttribute(FundingSourceListForm.FORM_NAME);
%>

<base:form action="/backoffice/servlet/handlefundingsourcelistform.do">
<html:hidden property="<%= FundingSourceListForm.PARM_HIDE_TABS%>"/>

<logic:notEmpty  name="<%= FundingSourceListForm.FORM_NAME %>" property="<%=FundingSourceListForm.PARM_CONFIRM_DELETE_MESSAGE%>">
   <html:hidden property="<%= FundingSourceListForm.PARM_CONFIRM_DELETED_ID%>"/>
   <html:hidden property="<%= FundingSourceListForm.PARM_FROM_ASSET_ITEM_EDIT_FORM%>"/>

   <base:messageBox showRedBorder="true">
       <tr valign="center">
           <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
           <td class="ColRowBold" align="center"><%= ResponseUtils.filter(form.getConfirmDeleteMessage()) %></td>
       </tr>
       <tr>
            <td>&nbsp;</td>
            <td valign="baseline" align="center" class="ColRow">
                <base:yesNo buttonYesName="<%=FundingSourceListForm.BUTTON_CONFIRM_DELETE%>"/>
            </td>
       </tr>
   </base:messageBox>
   
 </logic:notEmpty>
<base:outlinedTableAndTabsWithinThere borderColor="#c0c0c0" id="<%=FundingSourceListForm.TABLE_OUTLINED%>" width="100%" selectedTab="<%=FundingSourceListForm.ID_TAB%>" tabs="<%=form.getTabs()%>">
	<tr>
		<td class="TableHeading"><%= MessageHelper.formatMessage("fundingsourcelist_UpdateFundingSources") %></td>
		<td class="tdAlignRight">
			<base:link page='<%="/backoffice/servlet/presentfundingsourceaddeditform.do?fromAssetItemEditForm="+form.isFromAssetItemEditForm()%>'>
			  <base:image src="/buttons/large/addsource.gif" alt='<%= MessageHelper.formatMessage("addSource") %>'/>
			</base:link>
		</td>
	</tr>
			
	<tr>
		<td width="100%">
			<base:imageLine height="1" width="100%" />
		</td>
		<td class="tdAlignRight">
			<base:genericButton name="<%=CancelButtonTag.BUTTON_NAME%>" src="/buttons/large/close.gif" alt='<%= MessageHelper.formatMessage("close") %>'/>
		</td>
	</tr>
			
	<tr>
		<td colspan="2">
			<table id=<%= FundingSourceListForm.TABLE_LIST %> width="100%" border="0" cellspacing="0" cellpadding="2">
			    <%
			    //List is a list of value objects
			    LongStringLookupList list = form.getResultList();
			    Iterator iter = ObjectHelper.getIterator(list);
			    LongStringLookup value = null;
			    while (iter.hasNext()) {
			        value = (LongStringLookup) iter.next();
			    %>
                    <base:flipper key="funsrc">
			            <td class="ColRow"><%= ResponseUtils.filter(value.getStringDesc())%></td>
						
			            <td class="ColRow tdAlignRight">
			                <base:link page='<%= "/backoffice/servlet/presentfundingsourceaddeditform.do?fundingSourceID=" + value.getLongID()%>'>
			                    <base:image src="/icons/general/edit.gif" width="19" height="16" alt='<%= MessageHelper.formatMessage("fundingsourcelist_Edit", ResponseUtils.filter(value.getStringDesc())) %>'/>
			                </base:link>
			                &nbsp;
			                <base:genericButton src="/icons/general/delete.gif" name="<%= FundingSourceListForm.BUTTON_DELETE_PREFIX + value.getLongID()%>" alt='<%= MessageHelper.formatMessage("fundingsourcelist_Delete", ResponseUtils.filter(value.getStringDesc())) %>'/>
			            </td>
			        </base:flipper>
			    <% } %>
			</table>
		</td>
	</tr>
</base:outlinedTableAndTabsWithinThere>
</base:form>

