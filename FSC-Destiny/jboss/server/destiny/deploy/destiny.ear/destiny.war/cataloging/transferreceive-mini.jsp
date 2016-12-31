<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.TransferReceiveForm"%>
<%@ page import="com.follett.fsc.common.StringHelper"%>
<%@ page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CopySpecs" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator"%>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>

<bean:define id="titleList" name="<%=TransferReceiveForm.FORM_NAME%>" property="miniDBarcodelessTitles"/>
<base:messageBox strutsErrors="true" />

<%
    TransferReceiveForm form = (TransferReceiveForm) request.getAttribute(TransferReceiveForm.FORM_NAME);
    boolean isFilterOn = form.isFilterOn();
%>

<base:form action="/cataloging/servlet/handletransferreceiveform.do" focus="<%=TransferReceiveForm.FIELD_STARTING_COPY_BARCODE%>">
  	<html:hidden property="<%=TransferReceiveForm.FIELD_BUDGET_CATEGORY_ID%>"/>
  	<html:hidden property="<%=TransferReceiveForm.FIELD_TRANSFER_ID%>"/>
  	<html:hidden property="<%=TransferReceiveForm.ATTRIBUTE_RECEIVED_COPIES%>"/>
  	<html:hidden property="<%=TransferReceiveForm.ATTRIBUTE_UNRECEIVED_COPIES%>"/>
	<html:hidden property="<%=TransferReceiveForm.PARAM_COLLECTION_TYPE%>"/>
    <html:hidden property="<%=TransferReceiveForm.PARAM_HOME_LOCATION_ID%>"/>
    <html:hidden property="<%=TransferReceiveForm.FIELD_STATE_TRANSFER%>"/>
    <html:hidden property="<%=TransferReceiveForm.FIELD_RECEIVE_TITLE%>"/>
    <html:hidden property="<%=TransferReceiveForm.PARAM_RECEIVE_AS_COPY_STATUS%>"/>
    <html:hidden property="previousMiniDBarcodelessTitleCount"/>
    <html:hidden property="<%=TransferReceiveForm.FIELD_HIDDEN_SUBMIT%>" value="false"/>
	
	<table id="<%=TransferReceiveForm.TABLE_MAIN%>" cellSpacing="0" cellPadding="2" width="100%" border="0">
	<tr>
		<td class="TableHeading2">
            <logic:equal name="<%=TransferReceiveForm.FORM_NAME%>" property="multiTitleBarcodeless" value="true">
                <html:select property="<%=TransferReceiveForm.FIELD_BIB_ID%>" onchange="dropDownSubmit()">
                    <html:options collection="titleList" property="bibID" labelProperty="title"/>
                </html:select>
            </logic:equal>
            
            <logic:equal name="<%=TransferReceiveForm.FORM_NAME%>" property="multiTitleBarcodeless" value="false">
			     <bean:write name="<%=TransferReceiveForm.FORM_NAME%>" property="receiveTitle"/>
                <html:hidden property="<%=TransferReceiveForm.FIELD_BIB_ID%>"/>
            </logic:equal>
		</td>
	</tr>
	<tr>
		<td class="SmallColHeading">
			Created
                <%
		    if (form.getCollectionType() == CollectionType.ASSET) {
		%>
                    <bean:write name="<%=TransferReceiveForm.FORM_NAME%>" property="transferDate"/> - Items: <%=form.getMiniDCopiesToReceive()%>
                <%
                    } else {
                %>
                    <bean:write name="<%=TransferReceiveForm.FORM_NAME%>" property="transferDate"/> - Copies: <%=form.getMiniDCopiesToReceive()%>
                <%
                    }
                %>
		</td>
	</tr>
	<tr>
		<td class="SmallColHeading" noWrap>
           <%
               if (form.getCollectionType() == CollectionType.ASSET) {
           %>
                Items Received: <bean:write name="<%=TransferReceiveForm.FORM_NAME%>" property="totalCopiesReceivedString"/></td>
           <%
               } else {
           %>
                Copies Received: <bean:write name="<%=TransferReceiveForm.FORM_NAME%>" property="totalCopiesReceivedString"/></td>
           <%
               }
           %>
	</tr>
	<tr>
		<td>
			<span class="ColRowBold">
				Receive <html:text disabled="<%=isFilterOn%>" name="<%=TransferReceiveForm.FORM_NAME%>" property="<%=TransferReceiveForm.FIELD_NUMBER_OF_COPIES_TO_PROCESS%>" size="3" />
			</span>
            <logic:equal name="<%=TransferReceiveForm.FORM_NAME%>" property="showPrintLabelsCheckbox" value="true">
    			<span class="SmallColHeading">
    		        <html:checkbox property="<%=TransferReceiveForm.FIELD_PRINT_LABELS%>"/>&nbsp;Print labels    
    		    </span>
            </logic:equal>
		</td>
	<tr>
		<td class="FormLabel" noWrap>
			Assign Barcodes
		</td>
	</tr>
	<tr>
		<td class="ColRow">
			&nbsp;
            <%
                if (!form.isStateTransfer()) {
            %>
            	<html:radio property="<%=TransferReceiveForm.FIELD_ASSIGN_NEXT_BARCODE%>" value="false" styleClass="ColRow"></html:radio>
            <%
                }
            %>
            Starting on &nbsp;<html:text property="<%=TransferReceiveForm.FIELD_STARTING_COPY_BARCODE%>" size="14" maxlength='<%=""+CopySpecs.COPY_MAX_COPY_BARCODE_LENGTH%>'/>
		</td>
	</tr>
    <% if (!form.isStateTransfer()) { %>
        <tr>
            <td class="ColRow">
    		   	&nbsp;
            	<html:radio disabled="<%=isFilterOn %>" property="<%=TransferReceiveForm.FIELD_ASSIGN_NEXT_BARCODE%>" value="true" styleClass="ColRow">
                	Use next available
                </html:radio>
            </td>
        </tr>
    <% } %>
	<tr>
		<td align="center">
			<base:receiveButton/>
		</td>
	</tr>
	</table>
</base:form>

<script language="JavaScript">
<!--
function dropDownSubmit() {
    document.<%=TransferReceiveForm.FORM_NAME%>.<%=TransferReceiveForm.FIELD_HIDDEN_SUBMIT%>.value = "true";
    document.<%=TransferReceiveForm.FORM_NAME%>.submit();
}
//-->
</script>
