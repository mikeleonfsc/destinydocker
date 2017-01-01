<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.BarcodeListForm" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ page import="com.follett.fsc.destiny.util.Barcode" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@page import="com.follett.fsc.common.MessageHelper"%>

<base:messageBox strutsErrors="true"/>

<%
    BarcodeListForm form = (BarcodeListForm)request.getAttribute(BarcodeListForm.FORM_NAME);
%>

<base:form action="/backoffice/servlet/handlebarcodelistform.do">

    <html:hidden property="<%=BarcodeListForm.BUTTON_CHANGE_SUBMIT%>" value="<%= String.valueOf(BarcodeListForm.SUBMIT_MODE_NONE)%>"/>
    <html:hidden property="<%=BarcodeListForm.FIELD_CHANGED_SYMBOLOGY%>" value="false"/>
    <html:hidden property="<%=BarcodeListForm.PARAM_BARCODE_TYPE%>"/>
    <html:hidden property="<%=BarcodeListForm.PARAM_COLLECTION_TYPE%>"/>

<base:outlinedTable id="<%=BarcodeListForm.TABLE_MAIN%>" borderColor='#c0c0c0' width="100%" cellpadding="4" cellspacing="1">
    <tr>
        <td colspan="2" class="TableHeading" nowrap="nowrap">
            <%= MessageHelper.formatMessage("barcodelist_ListBarcodes", form.getTypeForHeader(false)) %>
        </td>
    </tr>
    
    <tr>
        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("barcodelist_Select") %></td>
        
        <td class="ColRow">
        <% if (form.isAbleToRunUnused()) { %>
            <html:select property="<%=BarcodeListForm.FIELD_BARCODE_MODE%>" onchange="submitDropDownMode()">
	           <html:option value="<%= String.valueOf(BarcodeListForm.BARCODE_MODE_USED)%>"><%=MessageHelper.formatMessage("barcodelist_UsedBarcodeNumbers")%></html:option>
	           <html:option value="<%= String.valueOf(BarcodeListForm.BARCODE_MODE_UNUSED)%>"><%=MessageHelper.formatMessage("barcodelist_UnusedBarcodeNumbers")%></html:option>
            </html:select>
        <% } else { %>
            <html:hidden property="<%=BarcodeListForm.FIELD_BARCODE_MODE%>" value="<%= String.valueOf(BarcodeListForm.BARCODE_MODE_USED)%>"/>
            <%= MessageHelper.formatMessage("barcodelist_UsedBarcodeNumbers") %>
        <% } %>
            &nbsp;
            <base:link permission="<%=form.getConfigSitePermission()%>"    
            page="javascript:submitTheForm_ChangeSymbology()" showTextAlways="true" appendCollectionType="false">
                <%=form.getSymbologyText()%>
            </base:link>
        </td>    
    </tr>

    <% if (form.getBarcodeMode() == BarcodeListForm.BARCODE_MODE_USED) { %>
    	<tr>
            <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("barcodelist_Range") %></td>
            <td class="ColRow" nowrap="nowrap">
                <html:text property="<%= BarcodeListForm.FIELD_RANGE_FROM%>" maxlength="<%=String.valueOf(Barcode.MAX_LENGTH_SUPPORTED_SYMBOLOGIES)%>"/>
                <%= MessageHelper.formatMessage("barcodelist_To") %>
    			<html:text property="<%= BarcodeListForm.FIELD_RANGE_TO%>" maxlength="<%=String.valueOf(Barcode.MAX_LENGTH_SUPPORTED_SYMBOLOGIES)%>"/>
            </td>
        </tr>
    <% } else { %>
        <tr><td></td>
            <td>
                <table>
                 <tr>
                    <td class="ColRowBold"><html:radio property="<%= BarcodeListForm.FIELD_REPORT_TYPE %>" value="<%= BarcodeListForm.REPORT_TYPE_NUMBER_OF_BARCODES %>"><%= MessageHelper.formatMessage("barcodelist_NumberOfBarcodes") %></html:radio></td>
                    <td><html:text property="<%= BarcodeListForm.FIELD_BARCODE_COUNT%>" size="3" maxlength="3"/></td>
                 </tr>
     
                <tr>
                    <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("barcodelist_StartingOnBarcode") %>&nbsp;</td>
                    <td>
                        <html:text property="<%= BarcodeListForm.FIELD_RANGE_FROM%>" maxlength="<%=String.valueOf(Barcode.MAX_LENGTH_SUPPORTED_SYMBOLOGIES)%>"/>
                    </td>
                </tr>
              </table>
           </td>
        </tr>
        <tr><td colspan="2"><br></td></tr>
        <tr><td></td>
            <td class="ColRowBold">
                <html:radio property="<%= BarcodeListForm.FIELD_REPORT_TYPE %>" value="<%= BarcodeListForm.REPORT_TYPE_BARCODE_RANGE %>"><%= MessageHelper.formatMessage("barcodelist_BarcodeRange") %></html:radio>
                <html:text property="<%= BarcodeListForm.FIELD_UNUSED_BARCODE_RANGE_FROM%>"  maxlength="<%=String.valueOf(Barcode.MAX_LENGTH_SUPPORTED_SYMBOLOGIES)%>"/>&nbsp;<%= MessageHelper.formatMessage("barcodelist_To") %>&nbsp;
                <html:text property="<%= BarcodeListForm.FIELD_UNUSED_BARCODE_RANGE_TO%>"  maxlength="<%=String.valueOf(Barcode.MAX_LENGTH_SUPPORTED_SYMBOLOGIES)%>"/>
            </td>
        </tr>
        <tr><td colspan = "2"><br/></td></tr>
        <tr>
            <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("barcodelist_Display") %></td>
            <td>
                <html:select property = "<%= BarcodeListForm.FIELD_DISPLAY_OPTION %>">
                     <html:option value = "<%= BarcodeListForm.DISPLAY_OPTION_BARCODE_RANGE %>"><%= MessageHelper.formatMessage("barcodelist_ConsecutiveBarcodesAsARange") %></html:option>
                     <html:option value = "<%= BarcodeListForm.DISPLAY_OPTION_BARCODE_ALL %>"><%= MessageHelper.formatMessage("barcodelist_AllBarcodes") %></html:option>
                </html:select>
            </td>
        </tr>
    <% } %>

    <tr>
        <td colspan="2" class="ColRowBold" nowrap="nowrap" align="center">
            <base:showHideTag id="onAction">
                <base:genericButton src="/buttons/large/runreport.gif" onclick="hideElementonAction()" alt='<%= MessageHelper.formatMessage("runReport") %>' name="<%=BarcodeListForm.BUTTON_RUN%>" />
            </base:showHideTag>
        </td>
    </tr>
   
</base:outlinedTable>

</base:form>

<script language="JavaScript" type="text/javascript">
      <!--
        function submitDropDownMode() {
            document.<%=BarcodeListForm.FORM_NAME%>.<%=BarcodeListForm.BUTTON_CHANGE_SUBMIT%>.value = '<%= BarcodeListForm.SUBMIT_MODE_CHANGED%>';
            document.<%=BarcodeListForm.FORM_NAME%>.submit();
        }
        function submitTheForm_ChangeSymbology() {
            document.<%=BarcodeListForm.FORM_NAME%>.<%=BarcodeListForm.FIELD_CHANGED_SYMBOLOGY%>.value = "true";
            document.<%=BarcodeListForm.FORM_NAME%>.submit();
        }
      // -->
</script>
