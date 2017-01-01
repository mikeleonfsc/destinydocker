<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>

<base:messageBox strutsErrors="true"/>

<%
    ChooseInventoryLocationForm form = (ChooseInventoryLocationForm)request.getAttribute(ChooseInventoryLocationForm.FORM_NAME);
    String focus;
    if ( form.getCollectionType() == CollectionType.ASSET ) {
        focus = ChooseInventoryLocationForm.FIELD_SEARCH_STRING;
    } else {
        focus = null;
    }
%>
<base:form action="/backoffice/servlet/handlechooseinventorylocationform.do"
	focus="<%= focus %>">

    <html:hidden property="<%= ChooseInventoryLocationForm.PARAM_COLLECTION_TYPE%>"/>

<base:outlinedTable id="<%=ChooseInventoryLocationForm.TABLE_MAIN%>" borderColor='#C0C0C0'>

<tr>
	<td colspan="2" class="TableHeading"><%= MessageHelper.formatMessage("chooseinventorylocation_ChooseCurrentLocation") %></td>
</tr>
<% if ( form.getCollectionType() == CollectionType.ASSET) { %>
<tr>
	<td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("chooseinventorylocation_ScanALocationBarcode") %></td>
	<td>
    <html:text property="<%= ChooseInventoryLocationForm.FIELD_SEARCH_STRING %>" />	
    &nbsp;
    <base:goButton align="absbottom"/>
    </td>
</tr>
<% } %>
<tr>
	<td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("chooseinventorylocation_Location") %></td>
	<td>
         <bean:define id="locations" name="<%= ChooseInventoryLocationForm.FORM_NAME %>" property="locations"/>
		 <html:select property="<%= ChooseInventoryLocationForm.FIELD_LOCATIONID %>">
                    <html:options collection="locations" property="locationID"
                              labelProperty="name"/>
         </html:select>
	</td>
</tr>
<tr>
<td class="tdAlignRight">&nbsp;</td>
<td nowrap>
    <base:okButton/>&nbsp;&nbsp;
    <base:cancelButton/>
</td>
</tr>


</base:outlinedTable>
</base:form>

