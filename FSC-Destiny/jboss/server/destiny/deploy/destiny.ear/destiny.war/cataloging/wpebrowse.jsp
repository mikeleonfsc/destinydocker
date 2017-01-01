<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.WPEBrowseForm" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.WPESearchForm" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>

<%
    WPEBrowseForm form = (WPEBrowseForm)request.getAttribute(WPEBrowseForm.FORM_NAME);
    String selectedTab = WPEBrowseForm.ID_TAB_WPE_VISUAL_SEARCH;
%>

<base:form action="/cataloging/servlet/handlewpebrowseform.do">

<html:hidden property="<%=WPEBrowseForm.FIELD_SEARCH_TYPE%>"/>

<base:outlinedTableAndTabsWithinThere id="<%=WPESearchForm.TABLE_WPE_TABS%>"  borderColor="#C0C0C0" 
	selectedTab="<%=selectedTab%>" tabs="<%=WPESearchForm.tabsWPE%>" searchGroup="<%=new Integer(WPEBrowseForm.SEARCH_GROUP)%>">
	<tr><td>
    <base:wpeBrowseVisual/>
    </td></tr>
</base:outlinedTableAndTabsWithinThere>

</base:form>
