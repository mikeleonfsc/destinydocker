<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<bean:define id="fromList" name="<%=ReceiveItemsTrackForm.FORM_NAME%>" property="fromList"/>
<bean:define id="sentList" name="<%=ReceiveItemsTrackForm.FORM_NAME%>" property="sentList"/>

<%
    ReceiveItemsTrackForm form = (ReceiveItemsTrackForm)request.getAttribute(ReceiveItemsTrackForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true"/>
<base:form action="/cataloging/servlet/handlereceiveitemstrackform.do">
<html:hidden property="<%=ReceiveItemsTrackForm.FIELD_HIDDEN_SUBMIT%>"/>
<html:hidden property="<%=ReceiveItemsTrackForm.FIELD_COLLECTION_TYPE%>"/>

<table id="<%=ReceiveItemsTrackForm.TABLE_MAIN %>" border="0" cellpadding="2" style="border-collapse: collapse" width="220">
	<tr>
	    <td colspan="2" class="FormLabel">Incoming
        <% if (form.getCollectionType() == CollectionType.ASSET) { %>
            Resources
        <% } else { %>
            Textbooks
        <% } %>
        </td>
	</tr>
			
	<logic:empty name="<%=ReceiveItemsTrackForm.FORM_NAME%>" property="<%=ReceiveItemsTrackForm.PARAM_FROM_LIST%>">
		<tr>
			<td class="ColRow" colspan="2">
				There are no 
                <% if (form.getCollectionType() == CollectionType.ASSET) { %>
                resources
                <% } else { %>
                textbooks
                <% } %>
                to receive.
			</td>
		</tr>
	</logic:empty>
	<logic:notEmpty name="<%=ReceiveItemsTrackForm.FORM_NAME%>" property="<%=ReceiveItemsTrackForm.PARAM_FROM_LIST%>">	
		<tr>
			<td class="FormLabel tdAlignRight">From</td>
			<td>
				<html:select property="<%=ReceiveItemsTrackForm.FIELD_SELECTED_MEMBER_AND_SITE_ID%>" onchange="dropDownSubmit()">
					<html:options collection="fromList" property="stringCode" labelProperty="stringDesc"/>
				</html:select>
			</td>
		</tr>
		<tr>
			<td class="FormLabel tdAlignRight">Created</td>
			<td>
				<html:select property="<%=ReceiveItemsTrackForm.FIELD_TRANSFER_ID%>">
					<html:options collection="sentList" property="longID" labelProperty="stringDesc"/>
				</html:select>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center"><base:goButton/></td>
		</tr>
	</logic:notEmpty>
	
</table>
</base:form>

<script language="JavaScript">
<!--
function dropDownSubmit() {
	document.<%=ReceiveItemsTrackForm.FORM_NAME%>.<%=ReceiveItemsTrackForm.FIELD_HIDDEN_SUBMIT%>.value = "true";
	document.<%=ReceiveItemsTrackForm.FORM_NAME%>.submit();
}
//-->
</script>
