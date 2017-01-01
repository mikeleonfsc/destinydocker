<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<bean:define id="stocks" name="<%= UnusedPatronBarcodeForm.FORM_NAME %>" property="stockList"/>
<bean:define id="symbologies" name="<%= UnusedPatronBarcodeForm.FORM_NAME %>" property="symbologyOptions"/>

<base:messageBox strutsErrors="true"/>

<%
    UnusedPatronBarcodeForm form = (UnusedPatronBarcodeForm)request.getAttribute("backoffice_servlet_UnusedPatronBarcodeForm");
    boolean isInternational = UserContext.getMyContextLocaleHelper().isInternationalProduct();
%>

<base:form action="/backoffice/servlet/handleunusedpatronbarcodeform.do">
<html:hidden property="<%=CopyLabelForm.FIELD_CHANGED_SYMBOLOGY%>" value="false"/>

<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=BaseLabelForm.BUTTON_TRAP_ENTER%>">
<html:hidden property="symbologyText" />
    <logic:equal name="<%= UnusedPatronBarcodeForm.FORM_NAME %>" property="showConfirmationMessage" value="true">
        <html:hidden property="showConfirmationMessage" />
        <base:messageBox showRedBorder="true">
            <tr valign="top">
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td class="ColRowBold">
                    <bean:write name="<%= UnusedPatronBarcodeForm.FORM_NAME %>"
                    	property="<%=UnusedPatronBarcodeForm.FIELD_BARCODES_TO_PRINT%>"/> <%= MessageHelper.formatMessage("unusedpatronbarcode_UnusedPatronsBarcode") %><br>
                </td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td valign="baseline" align="center" class="ColRow"><%= MessageHelper.formatMessage("unusedpatronbarcode_AreYouSureYouWantToGenerateTheseLabels") %><br>
                    <base:yesNo 
                        buttonYesName="<%=UnusedPatronBarcodeForm.BUTTON_CONFIRM_YES%>"
                        buttonNoName="<%=UnusedPatronBarcodeForm.BUTTON_CONFIRM_NO%>"
                    />
                </td>
            </tr>
        </base:messageBox>
    </logic:equal>



<base:outlinedTableAndTabsWithinThere tabs="<%= form.getTabs() %>" selectedTab="<%= PatronLabelForm.ID_TAB_UNUSED_BARCODES %>" id="<%=UnusedPatronBarcodeForm.TABLE_PATRON_LABEL%>" borderColor='#C0C0C0' width="100%">

    <tr>
        <td colspan="2" class="TableHeading" nowrap>
            <%= MessageHelper.formatMessage("unusedpatronbarcode_PrintUnusedPatronBarcodes") %>
        </td>
    </tr>

    <logic:equal name="backoffice_servlet_UnusedPatronBarcodeForm" property="districtUser" value="true" scope="request" >
    <tr>
        <td class="ColRowBold tdAlignRight" nowrap><%= MessageHelper.formatMessage("unusedpatronbarcode_For") %></td>
        <td nowrap>
        <base:selectSite 
            name="<%= BaseLabelForm.FIELD_SITE_ID %>" 
            selectedSiteID="<%=form.getSiteID().toString() %>" 
            includeAllLibraries="false" submitOnChange="true"
            includeLibrarySites="true"
        	includeTextbookSites="true"
        	includeMediaSites="true"
        	includeAssetSites="true"
            includeDistrictWarehouse="false"
            mode="<%=SelectSiteTag.MODE_MEDIA%>"
            />
        </td>
    </tr>
    </logic:equal>

    <tr>
        <td class="ColRowBold tdAlignRight" nowrap>*<%= MessageHelper.formatMessage("unusedpatronbarcode_NumberOfBarcodes") %></td>
        <td class="ColRow" nowrap>
            <html:text property="<%=UnusedPatronBarcodeForm.FIELD_BARCODES_TO_PRINT%>" maxlength="3" size="6"/>
        </td>
    </tr>

    <tr>
        <td class="ColRowBold tdAlignRight" valign="top" nowrap>*<%= MessageHelper.formatMessage("unusedpatronbarcode_StartingBarcode") %></td>
        <td class="ColRow" nowrap>
            <% String pageURL = "/backoffice/servlet/handleunusedpatronbarcodeform.do?" + form.FIELD_CHANGED_SYMBOLOGY + "=true"; %>
            <html:text property="<%= UnusedPatronBarcodeForm.FIELD_STARTING_BARCODE %>" maxlength="14" size="17"/>
            <base:link permission="<%=Permission.BACK_OFFICE_CHANGE_SITE_PREFERENCES_PATRON%>" 
                page="javascript:submitTheForm_ChangeSymbology()" 
                appendCollectionType="false"
                showTextAlways="true">
                <%=form.getSymbologyText()%>
            </base:link>
        </td>
    </tr>

    <tr>
        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("unusedpatronbarcode_UseLabelStock") %></td>
        <td class="ColRow" nowrap>
            <html:select property="<%= BaseLabelForm.FIELD_LABEL_STOCK %>">
                <html:options collection="stocks" property="stringCode"
                              labelProperty="stringDesc"/>
            </html:select>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("unusedpatronbarcode_StartOnLabel") %></td>
        <td class="ColRow" nowrap>
            <html:text property="<%= BaseLabelForm.FIELD_LABEL_START %>" maxlength="3" size="4"/>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("unusedpatronbarcode_PrinterOffset") %></td>
        <td  nowrap="true" class="ColRow"><%= MessageHelper.formatMessage("unusedpatronbarcode_Horizontal") %>&nbsp;:<html:text property="<%= BaseLabelForm.FIELD_HORIZONTAL_OFFSET %>" maxlength="4" size="4"/>
            &nbsp;&nbsp;&nbsp;<%= MessageHelper.formatMessage("unusedpatronbarcode_Vertical") %>:&nbsp;
            <html:text property="<%= BaseLabelForm.FIELD_VERTICAL_OFFSET %>" maxlength="4" size="4"/>
        </td>
    </tr>
    
<!-- don't put this html in if we reached here from add or edit copies or items --->
<%if(!form.arrivedAtViaAddOrEdit()){ %>
    <tr>
        <td colspan = "2" align="center">
            <table >
                <tr><td colspan="2" align="center" class="ColRowBold"><%=MessageHelper.formatMessage("unusedpatronbarcode_InAdditionToAdjustingYourPrinterOffsets")%></td></tr>
            <% if (!isInternational) { %>
                <tr><td colspan="2" align="center" class="ColRow"><%=BaseLabelForm.getMessageAligningBarcodesForAssistance()%></td></tr>
            <% } %>
            </table>
        </td>
    </tr>
<%}%>     

    <tr>
        <td class="SmallColRow" colspan="2">* = <%= MessageHelper.formatMessage("unusedpatronbarcode_RequiredField") %></td>
    </tr>

    <tr>
        <td colspan="2" align="center" class="ColRowBold">
            <base:reportButton/>
        </td>
    </tr>

</base:outlinedTableAndTabsWithinThere>
</base:form>
<SCRIPT LANGUAGE="javascript" TYPE="text/javascript">
<!--
    function submitTheForm_ChangeSymbology() {
        document.<%=UnusedPatronBarcodeForm.FORM_NAME%>.<%=UnusedPatronBarcodeForm.FIELD_CHANGED_SYMBOLOGY%>.value = "true";
        document.<%=UnusedPatronBarcodeForm.FORM_NAME%>.submit();
    }
// -->
</SCRIPT>
