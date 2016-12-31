<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.InventoryListForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.BaseListForm" %>
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
    InventoryListForm form = (InventoryListForm)request.getAttribute(InventoryListForm.FORM_NAME);
%>

<base:form action="/backoffice/servlet/handleinventorylistform.do">
<html:hidden property="<%=InventoryListForm.PARAM_TAB%>"/>
<html:hidden property="<%=BaseListForm.PARM_SORT%>"/>
<html:hidden property="<%=BaseListForm.PARM_DESCEND%>"/>
<html:hidden property="<%=BaseListForm.PARM_PAGE%>"/>
<html:hidden property='<%="collectionType"%>'/>



<logic:present name="<%=InventoryListForm.FORM_NAME%>" property="<%=InventoryListForm.PARAM_PARTIAL_INVENTORY_ID%>">
	    <base:imageSpacer width="1" height="3"/>
		<html:hidden property="<%=InventoryListForm.PARAM_PARTIAL_INVENTORY_ID%>"/>
		<html:hidden property="<%=InventoryListForm.PARAM_DISTRICT_INVENTORY%>"/>
		<base:messageBox showRedBorder="true">
	        <tr>
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
	            <td align="center" class="ColRowBold">
	            <%= MessageHelper.formatMessage("inventorylist_AreYouSureYouWantToRemove",
	                form.getDeleteName()) %>
                </td>
	        </tr>
	        
	        <tr>
	            <td valign="baseline" align="center" class="ColRow" colspan="2">
	                <base:yesNo/>
	            </td>
	        </tr>
	    </base:messageBox>
	</logic:present>



<base:outlinedTableAndTabsWithinThere id="<%=InventoryListForm.TABLE_MAIN%>"  
    selectedTabID="<%=form.gimmeSelectedTabID()%>"
	selectedTab="<%=form.gimmeSelectedTab()%>" 
	tabs="<%=form.gimmeTabs()%>" >
	
<tr>
<td width="100%" class="SmallColHeading tdAlignRight">
     <base:pageListOutput formName="<%=InventoryListForm.FORM_NAME%>"/>
</td>
</tr>
<tr>
<td width="100%">
<%form.outputList(out); %>
</td>
</tr>
</base:outlinedTableAndTabsWithinThere>
</base:form>

