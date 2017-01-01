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
    TextbookUnassignBarcodesForm form = (TextbookUnassignBarcodesForm)request.getAttribute(TextbookUnassignBarcodesForm.FORM_NAME);
%>


<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handletextbookunassignbarcodesform.do" focus="<%=TextbookUnassignBarcodesForm.FIELD_STARTING_COPY_BARCODE%>">
<html:hidden property="<%=TextbookUnassignBarcodesForm.FIELD_BIBID%>"/>
<html:hidden property="<%=TextbookUnassignBarcodesForm.FIELD_STATE_TEXTBOOK%>"/>
<html:hidden property="<%=TextbookUnassignBarcodesForm.FIELD_RESET%>"/>
<html:hidden property="<%=TextbookUnassignBarcodesForm.FIELD_SITE_ID%>"/>
<html:hidden property="<%=TextbookUnassignBarcodesForm.FIELD_TITLE%>"/>
<html:hidden property="<%=TextbookUnassignBarcodesForm.PARAM_COPIES_WITH_BARCODES%>"/>


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

<base:outlinedTable borderColor='#c0c0c0' width="100%" id="<%=TextbookUnassignBarcodesForm.TABLE_MAIN%>">
   <tr>
        <td class="TableHeading" colSpan="2">
            Remove Barcodes from <bean:write name="<%=TextbookUnassignBarcodesForm.FORM_NAME%>" property="<%=TextbookUnassignBarcodesForm.FIELD_TITLE%>"/>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight"><%
            if (form.isStateTextbook()) {
        %>* <%
            }
        %>Copies with Barcodes</td>
        <td class="ColRow">
			<base:localeNumberTag number="<%=form.getCopiesWithBarcodes()%>"/>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">Quantity to Unassign</td>
        <td class="ColRow">
			<html:text name="<%=TextbookUnassignBarcodesForm.FORM_NAME%>" property="<%=TextbookUnassignBarcodesForm.FIELD_COPIES_TO_UNBARCODE%>" size="14" />
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">Starting with Barcode</td>
        <td class="ColRow">
            <html:text property="<%=TextbookUnassignBarcodesForm.FIELD_STARTING_COPY_BARCODE%>" size="17" maxlength='<%=""+CopySpecs.COPY_MAX_COPY_BARCODE_LENGTH%>'/>
        </td>
    </tr>

    <tr>
        <td class="ColRow tdAlignRight" >
            <base:genericButton name="<%=TextbookUnassignBarcodesForm.BUTTON_REMOVE%>" src="/buttons/large/remove_x.gif" alt="Remove"/>
        </td>
        <td class="ColRow" valign="top">
            <base:cancelButton/>
        </td>
    </tr>
    
    <% if (form.isStateTextbook()) { %>
    <tr>
        <td class="TableHeading" colspan="2" width="100%">
            <IMG height="1" vspace="1" src="/images/icons/general/line.gif" width="100%">
        </td>
    </tr>
    <tr>
        <td class="Instruction" colspan="2" align="center">
            * Count does not include copies that are part of a return.
        </td>
    </tr>
    <% } %>
</base:outlinedTable>
</base:form>


