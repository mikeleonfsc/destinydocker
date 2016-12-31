<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CopySpecs" %>
<%@ page import="com.follett.fsc.destiny.client.common.JSPHelper" %>
<%@ page import="com.follett.fsc.common.StringHelper"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    AssetUnassignBarcodesForm form = (AssetUnassignBarcodesForm)request.getAttribute(AssetUnassignBarcodesForm.FORM_NAME);
%>


<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handleassetunassignbarcodesform.do" focus="<%=AssetUnassignBarcodesForm.FIELD_STARTING_COPY_BARCODE%>">
<html:hidden property="<%=AssetUnassignBarcodesForm.FIELD_BIBID%>"/>
<html:hidden property="<%=AssetUnassignBarcodesForm.FIELD_RESET%>"/>
<html:hidden property="<%=AssetUnassignBarcodesForm.FIELD_SITE_ID%>"/>
<html:hidden property="<%=AssetUnassignBarcodesForm.FIELD_TITLE%>"/>
<html:hidden property="<%=AssetUnassignBarcodesForm.PARAM_COPIES_WITH_BARCODES%>"/>


<%
    if (form.isShowConfirmation()) {
    String msg = "Barcodes to remove: " + form.getCopiesToUnbarcode() + "<br/>Starting barcode: " + 
                 form.getStartingCopyBarcode() + "<br/>Are you sure you want to proceed?";        
%>      
    <base:messageBox showWarningIcon="true" filterMessage="false" message="<%=msg%>">
        <tr>
            <td align="center" class="ColRow" colspan="2">
                <base:yesNo/>
            </td>
        </tr>
    </base:messageBox>
<%
    }
%>

<base:outlinedTable borderColor='#c0c0c0' width="100%" id="<%=AssetUnassignBarcodesForm.TABLE_MAIN%>">
   <tr>
        <td class="TableHeading" colSpan="2">
            Remove Barcodes from <bean:write name="<%=AssetUnassignBarcodesForm.FORM_NAME%>" property="<%=AssetUnassignBarcodesForm.FIELD_TITLE%>"/>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">Items with Barcodes</td>
        <td class="ColRow">
			<base:localeNumberTag number="<%=form.getCopiesWithBarcodes()%>"/>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">Quantity to Unassign</td>
        <td class="ColRow">
			<html:text name="<%=AssetUnassignBarcodesForm.FORM_NAME%>" property="<%=AssetUnassignBarcodesForm.FIELD_COPIES_TO_UNBARCODE%>" size="14" />
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">Starting with Barcode</td>
        <td class="ColRow">
            <html:text property="<%=AssetUnassignBarcodesForm.FIELD_STARTING_COPY_BARCODE%>" size="17" maxlength='<%=""+CopySpecs.COPY_MAX_COPY_BARCODE_LENGTH%>'/>
        </td>
    </tr>

    <tr>
        <td class="ColRow tdAlignRight" >
            <base:genericButton name="<%=AssetUnassignBarcodesForm.BUTTON_REMOVE%>" src="/buttons/large/remove_x.gif" alt="Remove"/>
        </td>
        <td class="ColRow" valign="top">
            <base:cancelButton/>
        </td>
    </tr>
</base:outlinedTable>
</base:form>


