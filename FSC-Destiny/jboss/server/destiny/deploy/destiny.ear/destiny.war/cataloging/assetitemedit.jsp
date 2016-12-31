<%@page import="com.follett.fsc.destiny.client.common.jsptag.BarcodeListDropDownTag"%>
<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.follett.fsc.common.StringHelper"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LookupSpecs"%>
<%@ page import="com.follett.fsc.destiny.util.Permission"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.jsptag.AssetUserDefinedFieldTag"%>
<%@ page import="com.follett.fsc.destiny.util.Barcode"%>
<%@ page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@ page import="com.follett.fsc.destiny.util.xml.AssetTemplateBaseSpecs"%>
<%@ page import="com.follett.fsc.destiny.session.cataloging.data.AssetTemplateFormFieldValue"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CopySpecs"%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.destiny.util.ObjectHelper"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator"%>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%-- @include file="/common/trapenter.jsp" --%>

<script language="JavaScript">
<!--    
    function trapEnter(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        return false;
      }
      return true;
    }
    
    function submitSiteTypeChange() {
        document.<%=AssetItemEditForm.FORM_NAME%>.changedSiteTypeDropDown.value="true";
        document.<%=AssetItemEditForm.FORM_NAME%>.changedDropDown.value="true";
        document.<%=AssetItemEditForm.FORM_NAME%>.submit();
    }
    
    function submitSiteChange() {
        document.<%=AssetItemEditForm.FORM_NAME%>.changedDropDown.value="true";
        document.<%=AssetItemEditForm.FORM_NAME%>.submit();
    }

    function setLicenseLimited() {
        document.<%=AssetItemEditForm.FORM_NAME%>.<%=AssetItemEditForm.FIELD_LICENSE_UNLIMITED%>[0].checked = true;
    }
    
    function setLicenseLimitedAndFocus() {
        document.<%=AssetItemEditForm.FORM_NAME%>.<%=AssetItemEditForm.FIELD_LICENSE_UNLIMITED%>[0].checked = true;
        setLicenseCountFocus();
    }
    
    function submitForm() {
        document.<%=AssetItemEditForm.FORM_NAME%>.changedDropDown.value="true";
        hideElementonSave();
        document.<%=AssetItemEditForm.FORM_NAME%>.submit();
    }
//-->
</script>

<bean:define id="conditions" name="<%=AssetItemEditForm.FORM_NAME%>" property="conditionOptions" />
<bean:define id="symbologies" name="<%=AssetItemEditForm.FORM_NAME%>" property="symbologyOptions" />
<bean:define id="form" name="<%=AssetItemEditForm.FORM_NAME%>" type="com.follett.fsc.destiny.client.cataloging.servlet.AssetItemEditForm" />
<bean:define id="displayModes" name="<%=AssetItemEditForm.FORM_NAME%>" property="displayModeOptions"/>
    
<c:set var="myForm" value='<%=request.getAttribute("cataloging_servlet_AssetItemEditForm")%>'/>

<base:messageBox strutsErrors="true" />

<%
    String focus = "";
    if (!form.isUnlimitedDigital() && form.isShowBarcode()) {
        if (form.isEditCopy()) {
           focus = AssetUserDefinedFieldTag.FIELD_NAME_PREFIX + AssetTemplateBaseSpecs.DEFAULT_TEMPLATE_FIELD_ID_BARCODE;            
        } else {
            if (AssetItemEditForm.OPTION_WITHOUT_BARCODES.equals(form.getAddWithBarcodeMode())) {
                focus = AssetItemEditForm.FIELD_NUMBER_OF_ITEMS;
            } else if (!AssetItemEditForm.RADIO_ASSIGN_NEXT_BARCODE.equals(form.getAssignNextBarcode())) {
                focus = AssetItemEditForm.FIELD_COPY_BARCODE;
            }
        }
    }
    boolean displayPrintCheckbox = false;
%>
<base:form action="/cataloging/servlet/handleassetitemeditform.do" focus="<%=focus%>" enctype="multipart/form-data">

    <%-- TODO: REMOVE HIDDENS - On a BLF we don't need to persist values as hidden properties because the BLF already persists them --%>
    <html:hidden property="copyID" />
    <html:hidden property="bibID" />
    <html:hidden property="updated" />
    <html:hidden property="title" />
    <html:hidden property="pageTitle" />
    <html:hidden property="action" />
    <html:hidden property="<%=AssetItemEditForm.FIELD_ORIGINAL_BARCODE%>" />
    <input type="hidden" name="changedBarcodeListDropDown"/>
    <input type="hidden" name="changedSiteTypeDropDown" />
    <input type="hidden" name="changedDropDown" />
    <input type="hidden" name="changedAddWithBarcodeMode"/>
    <html:hidden property="<%=AssetItemEditForm.PARAM_UNLIMITED_DIGITAL_BIBID%>"/>
    <html:hidden property="<%=AssetItemEditForm.PARAM_UNLIMITED_DIGITAL_SITEID%>"/>
    
    <logic:equal name="<%=AssetItemEditForm.FORM_NAME%>"
        property="<%=AssetItemEditForm.PARAM_SHOW_DUPLICATE_SERIAL_NUMBER_MESSAGE%>"
        value="true">
        <base:imageSpacer width="1" height="3"/>
        <base:messageBox showWarningIcon="true" message="This record may duplicate an existing resource.">
            <tr>
                <td><base:imageSpacer width="31" height="5"/></td>
                <td class="ColRow"><%=form.getDuplicateSerialMessage()%></td>
            </tr>
            <tr>
                <td><base:imageSpacer width="31" height="5"/></td>
                <td colspan="2">
                    <span class="ColRowBold">What do you want to do?</span>
                    <span class="ColRow">
                        <br>&nbsp;&nbsp;<input type="radio" <%if (StringHelper.isEmptyOrWhitespace(form.getEditOptions()) || form.getEditOptions().equals(AssetItemEditForm.RADIO_GO_BACK)){%> CHECKED <%}%> name="<%=AssetItemEditForm.FIELD_EDIT_OPTIONS%>" value="<%=AssetItemEditForm.RADIO_GO_BACK%>">Go back to this record and make further changes.
                        <br>&nbsp;&nbsp;<input type="radio" <%if (form.getEditOptions().equals(AssetItemEditForm.RADIO_SAVE_ANYWAY)){%> CHECKED <%}%> name="<%=AssetItemEditForm.FIELD_EDIT_OPTIONS%>" value="<%=AssetItemEditForm.RADIO_SAVE_ANYWAY%>">Save these changes anyway.<br>
                    </span>
                </td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2">
                    <input type="submit" name="<%=AssetItemEditForm.BUTTON_VALUE_OK%>" value="<%=AssetItemEditForm.BUTTON_VALUE_OK%>">
                </td>
            </tr>
        </base:messageBox>
    </logic:equal>    

    <logic:present name="<%=AssetItemEditForm.FORM_NAME%>"
        property="<%=AssetItemEditForm.PARAM_MOVE_SITE_MESSAGE%>">
           <%
               String[] messageText = new String[]{
                  Long.valueOf(CopySpecs.STATUS_CHECKED_OUT).equals(form.getCopyStatusAsLong()) ?
                      "Are you sure you want to move this item and check it in?":
                       "Are you sure you want to move this item?"};
           %>
        <base:confirmBox showWarningIcon="true"
            header=" ${myForm.moveSiteMessage}"           
            messageText="<%=messageText%>"
            yesName="<%=AssetItemEditForm.BUTTON_CONFIRM_MOVE_YES%>"
            noName="<%=AssetItemEditForm.BUTTON_CONFIRM_NO%>" />
    </logic:present>

    <logic:equal name="<%=AssetItemEditForm.FORM_NAME%>"
        property="<%=AssetItemEditForm.PARAM_SHOW_CHANGE_PO_MESSAGE%>"
        value="true">
        <base:messageBox showWarningIcon="true"
            header=" ${myForm.changePOMessage}"
            >
            <tr>
                <td>&nbsp;</td>
                <td><html:radio
                        property="<%=AssetItemEditForm.FIELD_UPDATE_ALL_ITEMS_PO%>"
                        value="true">&nbsp;<%=MessageHelper.formatMessage("AssetItemEditForm_PO_Update_AllItems")%></html:radio>
                </td>
            </tr>
            <tr>
            <td>&nbsp;</td>
                <td><html:radio
                        property="<%=AssetItemEditForm.FIELD_UPDATE_ALL_ITEMS_PO%>"
                        value="false">&nbsp;<%=MessageHelper.formatMessage("AssetItemEditForm_PO_Update_ThisItemOnly")%></html:radio>
                </td>
            </tr>
            <tr>
                <td class="ColRowBold" width="100%" align="center" colspan="2">
                    <base:yesNo />
                </td>
            </tr>
        </base:messageBox>
    </logic:equal>

    <logic:equal name="<%=AssetItemEditForm.FORM_NAME%>"
        property="showMultipleCopyAddConfirmation" value="true">
         <%
             String dupMessage = null;
             String extraDupMessage = null;
             String[] messageText = null;
             boolean hasDistrictID = !StringHelper.isEmpty(form.gimmeDistrictID());
             boolean hasSerial = !StringHelper.isEmpty(form.getSerialNumber());
             
             if ( hasSerial && hasDistrictID) {
                dupMessage = "Please note that the District Identifier and Serial Number specified will only be included in the first item added.";
             } else if ( hasSerial) {
                dupMessage = "Please note that the Serial Number specified will only be included in the first item added.";
             } else if ( hasDistrictID) {
                dupMessage = "Please note that the District Identifier specified will only be included in the first item added.";
             }
             
             if ( dupMessage != null && form.doesSerialNumberAlreadyExist() ) {
                 extraDupMessage = "The serial number specified is already assigned to another asset, adding these items will create a duplicate serial number.";
             }
             
             String message = "Are you sure you want to add these " +
                 (form.getAssetItemType() == CopySpecs.ASSET_ITEM_TYPE_KIT ? "kits" : "items") + "?";
             if (dupMessage != null) {
                 if ( extraDupMessage != null ) {
                    messageText = new String[]{dupMessage, extraDupMessage, message};
                 } else {
                    messageText = new String[]{dupMessage, message};
                 }
             } else {
                 messageText = new String[]{message};
             }
         %>
         <% if  (form.isAddNoteOnSave()) { %>
            <base:confirmBoxWithHistoricalNote showWarningIcon="true"
                showPleaseWait="true"
                header=" ${myForm.multipleCopyAddConfirmationMessage}"           
                messageText="<%=messageText%>" 
                yesName="<%=AssetItemEditForm.BUTTON_CONFIRM_YES%>"
                noName="<%=AssetItemEditForm.BUTTON_CONFIRM_NO%>" />
         <% } else { %>   
            <base:confirmBox showWarningIcon="true"
                showPleaseWait="true"
                header=" ${myForm.multipleCopyAddConfirmationMessage}"           
                messageText="<%=messageText%>" 
                yesName="<%=AssetItemEditForm.BUTTON_CONFIRM_YES%>"
                noName="<%=AssetItemEditForm.BUTTON_CONFIRM_NO%>" />
         <% } %>   
    </logic:equal>
    
    <logic:equal name="<%=AssetItemEditForm.FORM_NAME%>" property="<%= AssetItemEditForm.PARAM_UNLIMITED_DIGITAL_CONFIRMATION_MESSAGE %>" value="true">
          <%
            String[] messageTextUnlimited = new String[]{"Are you sure you want to create these items?"};
          %>
        <base:confirmBox showWarningIcon="true"
            showPleaseWait="true"
            header="An unlimited number of items will be created."           
            messageText="<%=messageTextUnlimited%>"
            yesName="<%=AssetItemEditForm.BUTTON_CONFIRM_YES%>"
            noName="<%=AssetItemEditForm.BUTTON_CONFIRM_NO%>" /> 
    </logic:equal>


    <table border="0" cellpadding="2" cellspacing="0" width="100%">
        <tr>
            <td>
            <table border="0" cellpadding="2" cellspacing="0" width="100%"
                id="<%=AssetItemEditForm.TABLE_MAIN_COPY_EDIT%>">
                <tr>
                    <td colspan="2"><%--
                 Don't do cellpadding here or else things will be off center
                 when either author or callnumber is empty.
            --%>
                    <table border="0" cellpadding="0" cellspacing="0"
                        align="center" id="<%=AssetItemEditForm.TABLE_HEADER%>">
                        <tr>
                            <td class="TableHeading" align="center" vAlign="top"
                                colspan="2"><!-- leave the image here, otherwise it drops the page too far down -->
                            <input type="image" src="/images/icons/general/spacer.gif"
                                width="1" height="1" border="0" alt=""
                                value="true"
                                name="<%=AssetItemEditForm.BUTTON_TRAP_ENTER_KEY%>">
                            <bean:write
                                name="<%=AssetItemEditForm.FORM_NAME%>"
                                property="<%=AssetItemEditForm.FIELD_FORMATTED_TITLE%>" /></td>
                        </tr>
                        <base:notEmpty name="<%=AssetItemEditForm.FORM_NAME%>" property="<%=AssetItemEditForm.FIELD_INSTRUCTIONAL_CLASSIFICATION%>">
                          <tr>
                              <td class="SmallColRow" align="center" colspan="2">
                              <bean:write name="<%=AssetItemEditForm.FORM_NAME%>" property="<%=AssetItemEditForm.FIELD_INSTRUCTIONAL_CLASSIFICATION%>"/></td>
                          </tr>
                        </base:notEmpty>
                    </table>
                    </td>
                </tr>
                <tr>
                    <td colspan="2"><base:imageLine height="1" width="100%" /></td>
                </tr>

                <%--************************* Disctrict User Fields ****************************--%>
                <base:isDistrictUser>
                    <logic:equal name="<%=AssetItemEditForm.FORM_NAME%>"
                        property="<%=AssetItemEditForm.PARAM_EDITING_IN_TRANSIT%>"
                        value="false">
                        <tr>
                            <td class="FormLabel tdAlignRight">Site Type</td>
                            <td class="FormElement"><base:selectSiteType
                                name="<%=form.FIELD_SITE_TYPE_ID%>"
                                selectedSiteTypeID="<%=form.getSiteTypeID()%>"
                                mode="<%=LookupSpecs.MODE_DISTRICT_USER_AECOPY_LIST%>"
                                includeForMediaSites="false"
                                includeForLibrarySites="false"
                                includeForTextbookSites="false"
                                includeForAssetSites="true"
                                onChangeAction="submitSiteTypeChange();" /></td>
                        </tr>
                        <tr>
                            <td class="FormLabel tdAlignRight">Site Name</td>
                            <td class="FormElement"><base:selectSite
                                name="<%=AssetItemEditForm.FIELD_COPY_SITE_ID%>"
                                selectedSiteID='<%=""+form.getCopySiteID()%>'
                                siteTypeID='<%=form.getSiteTypeID()%>'
                                onChangeAction="submitSiteChange();"
                                includeLibrarySites="false"
                                includeTextbookSites="false"
                                includeMediaSites="false"
                                includeAssetSites="true" /> <base:helpTag
                                helpFileName="d_choose_site_AM.htm" />
                            </td>
                        </tr>
                    </logic:equal>
                </base:isDistrictUser>
                <logic:equal name="<%=AssetItemEditForm.FORM_NAME%>"
                    property="actionAddOrDuplicate" value="false">
                    <%
                        if (!form.isConsumable() && !form.isNeverBarcode() && !form.isUnbarcoded()) {
                                displayPrintCheckbox = true;
                        }
                    %>
                </logic:equal>
                <%--************************* Start of Entry Fields ****************************--%>
                <logic:equal name="<%=AssetItemEditForm.FORM_NAME%>"
                    property="actionAddOrDuplicate" value="true">
                    <%
                        if (!form.isConsumable() && !form.isNeverBarcode() && !form.isResourceContainer()) {
                                displayPrintCheckbox = true;
                    %>    
                    <tr>
                        <td class = "ColRowBold tdAlignRight" valign="top">Add Items</td>
                        <td><html:select styleClass="ColRow" property = "<%=AssetItemEditForm.FIELD_ADD_WITH_BARCODE_MODE%>"
                                onchange = "this.form.changedAddWithBarcodeMode.value = true; this.form.submit(); return true;">
                                <html:option value = "<%=AssetItemEditForm.OPTION_WITH_BARCODES%>">with Barcodes</html:option>
                                <html:option value = "<%=AssetItemEditForm.OPTION_WITHOUT_BARCODES%>">without Barcodes</html:option>
                            </html:select>
                        </td>
                    </tr>
                    <% } else if (form.isResourceContainer()) {
                            displayPrintCheckbox = true;
                       }
                    %>
                    <logic:equal name="<%=AssetItemEditForm.FORM_NAME%>" property="digital" value="false">
                    <logic:equal name="<%=AssetItemEditForm.FORM_NAME%>" property="unbarcoded" value="true">
                        <logic:notEqual name="<%=AssetItemEditForm.FORM_NAME%>"
                            property="assetItemType"
                            value='<%=""+CopySpecs.ASSET_ITEM_TYPE_SOFTWARE_LICENSE%>'>
                        <%
                            displayPrintCheckbox = false;
                        %>
                            <tr>
                                <td valign = "top" class="ColRowBold tdAlignRight">*Number of Items</td>
                                <td valign='top'>
                                    <span onKeyPress="return trapEnter(event);" class="ColRow">
                                        <input type="text" name="<%= AssetItemEditForm.FIELD_NUMBER_OF_ITEMS %>" maxlength="5" size="7" value="<%=form.getNumberOfItems() %>"/>
                                    </span>
                                </td>
                            </tr>  
                        </logic:notEqual>
                    </logic:equal>
                    </logic:equal>
                    <% if (form.isDigital() || !form.isUnbarcoded()) { %>
                        <% if (form.getUnlimitedDigitalBibID() != null || form.unlimitedDigitalItemsAtSite()) { %>
                            <tr>
                                <td valign="top" class="ColRowBold tdAlignRight">*Number of Items</td>
                                <td valign="top" class="ColRow">Unlimited</td>
                                <html:hidden property="<%=AssetItemEditForm.FIELD_BARCODE_DISPLAY_MODE%>" value="<%=String.valueOf(BarcodeListDropDownTag.DISPLAY_MODE_UNLIMITED)%>"/>
                                <html:hidden property="<%=AssetItemEditForm.FIELD_NUMBER_OF_ITEMS%>" value=""/>
                            </tr>
                        <% } else { %>
                            <logic:notEqual name="<%=AssetItemEditForm.FORM_NAME%>"
                                property="assetItemType"
                                value='<%=""+CopySpecs.ASSET_ITEM_TYPE_SOFTWARE_LICENSE%>'>
        
                                <tr>
                                  <td valign="top" class="tdAlignRight">
                                  *<html:select styleClass="ColRowBold" 
                                        property="<%=AssetItemEditForm.FIELD_BARCODE_DISPLAY_MODE%>"
                                        onchange="this.form.changedBarcodeListDropDown.value=true; this.form.submit(); return false;">
                                    <html:options collection="displayModes" property="longID" labelProperty="stringDesc"/>
                                  </html:select>
                                  </td>
                                  <td nowrap valign="top">
                                      <base:barcodeListDropDown 
                                            numberOfCopies="<%=form.getNumberOfItems()%>"
                                            barcodeFilteringOn="<%=form.isFilteringOn()%>" 
                                            displayMode="<%=form.getBarcodeDisplayMode()%>"
                                            formName="<%=AssetItemEditForm.FORM_NAME%>"
                                            barcodeType="<%=Barcode.BARCODETYPE_ASSET_ITEM%>"
                                            collectionType="<%=CollectionType.ASSET %>"
                                            hideBarcodeEntryField="true"
                                            digitalMaterial="<%=form.isDigital() %>"
                                            />
                    
                                  </td>
                                </tr>
        
                             </logic:notEqual>
                        <% } %>
                <%
                    if (!form.isDigital() && (form.getAssetItemType() == CopySpecs.ASSET_ITEM_TYPE_SOFTWARE_LICENSE || form.getBarcodeDisplayMode() == BarcodeListDropDownTag.DISPLAY_MODE_NUM_COPIES)){
                        form.setBarcodeDisplayMode(BarcodeListDropDownTag.DISPLAY_MODE_NUM_COPIES);
                %>
                        <tr>
                            <td class="ColRowBold tdAlignRight">Starting Barcode</td>
                            <td nowrap>
                                <html:radio
                                    property="<%=AssetItemEditForm.FIELD_ASSIGN_NEXT_BARCODE%>"
                                    value="<%=AssetItemEditForm.RADIO_EXPLICIT_BARCODE%>"
                                    onclick='<%="document." + AssetItemEditForm.FORM_NAME + "." + AssetItemEditForm.FIELD_COPY_BARCODE + ".focus();"%>'>
                                </html:radio> 
                                <span
                                    onKeyPress="return trapEnter(event);" class="ColRow">
                                    <html:text
                                        property="<%=AssetItemEditForm.FIELD_COPY_BARCODE%>"
                                        size="17" maxlength='<%=""+CopySpecs.COPY_MAX_COPY_BARCODE_LENGTH%>'
                                        onfocus='<%="document." + AssetItemEditForm.FORM_NAME + "." + AssetItemEditForm.FIELD_ASSIGN_NEXT_BARCODE + "[0].checked = true"%>' 
                                    />
                                    <base:helpTag
                                        helpFileName="d_starting_barcode_AM.htm" 
                                    />
                                </span> 
                            <br>&nbsp;&nbsp; 
                            <%  String pageValue = "/cataloging/servlet/handleassetitemeditform.do?" + AssetItemEditForm.PARAM_SYMBOLOGY_CLICKED + "=true"; %>
                            
                            <span class="ColRow"> 
                                <base:link onclick='<%="document." + AssetItemEditForm.FORM_NAME + ".submit()"%>'  
                                    permission="<%=Permission.BACK_OFFICE_CHANGE_SITE_PREFERENCES_ASSET%>"                            
                                    page="<%=pageValue%>"
                                    showTextAlways="true"><%=form.getSymbologyText() == null ? "" : form.getSymbologyText()%>
                                </base:link> 
                            </span></td>
                        </tr>
                        <tr>
                            <td>&nbsp;</td>
                            <td class="ColRow">
                                <html:radio
                                    property="<%=AssetItemEditForm.FIELD_ASSIGN_NEXT_BARCODE%>"
                                    value="<%=AssetItemEditForm.RADIO_ASSIGN_NEXT_BARCODE%>"
                                    onclick='<%="document." + AssetItemEditForm.FORM_NAME + "." + AssetItemEditForm.FIELD_COPY_BARCODE + ".value = \'\'"%>'>
                                    Assign next barcode
                                </html:radio>
                            </td>
                        </tr>
                    <%
                        if (!form.isFilteringOn() && !(StringHelper.isEmpty(form.getNextDisplayableBC()))) {
                    %>
                    <tr>
                      <td>&nbsp;</td>
                      <td class="ColRow">
                          &nbsp;&nbsp;&nbsp;&nbsp;[Next: <%=form.getNextDisplayableBC()%>]
                      </td>
                    </tr>
                    <%
                        }
                    } %>
                <% } %>
                </logic:equal>
                <% if (form.getRedemptionCode() != null && form.isEditCopy()) { %>
                    <tr>
                        <td class="ColRowBold tdAlignRight">Redemption Code</td>
                        <td class="ColRow"><%= form.getRedemptionCode() %></td>
                    </tr>
                    <tr>
                        <td class="ColRowBold tdAlignRight">Expiration Date</td>
                        <td class="ColRow"><%= form.getRedemptionCodeExpiration() %></td>                    
                    </tr>   
                <% } %>                
                <%--************************* Redemption Code Reusable Field ****************************--%>
                <c:choose>
                    <c:when test="<%=form.isDigital() && form.getUnlimitedDigitalBibID() == null && !form.unlimitedDigitalItemsAtSite() 
                    && (ObjectHelper.isIntInArray(form.getBarcodeDisplayMode(), BarcodeListDropDownTag.DISPLAY_MODE_REDEMPTION_CODE_LIST, 
                        BarcodeListDropDownTag.DISPLAY_MODE_REDEMPTION_CODE_XML_FILE, BarcodeListDropDownTag.DISPLAY_MODE_REDEMPTION_CODE_LIST_FILE))%>">
                <tr>
                    <td class="ColRow tdAlignRight" />
                    <td class="ColRow">
                                <html:checkbox property="<%=AssetItemEditForm.FIELD_REDEMPTION_CODE_REUSABLE%>"><%= MessageHelper.formatMessage("AssetItemEditForm_CodesAreReusable") %></html:checkbox> 
                                <base:helpTag helpFileName="d_redemption_code_reusable_RM.htm" />
                            </td>
                        </tr>      
                    </c:when>
                    <c:when test="<%= form.getRedemptionCode() != null && form.isEditCopy() %>">
                        <tr>
                            <td class="ColRow tdAlignRight" />
                            <td class="ColRow">
                                <html:checkbox property="<%=AssetItemEditForm.FIELD_REDEMPTION_CODE_REUSABLE%>"><%= MessageHelper.formatMessage("AssetItemEditForm_Reusable") %></html:checkbox>
                                <base:helpTag helpFileName="d_redemption_code_reusable_RM.htm" />
                            </td>
                        </tr>                       
                            </c:when>
                            <c:otherwise>
                                <html:hidden property="<%=AssetItemEditForm.FIELD_REDEMPTION_CODE_REUSABLE%>" value="false"/>
                            </c:otherwise>
                        </c:choose>
                <%--************************* Iterating Asset User Defined Fields ****************************--%>          
                <logic:iterate id="reportRow" name="form" property="itemFields"
                    type="AssetTemplateFormFieldValue">
                    <%if (!reportRow.getAssetTemplateFieldID().equals(
                        new Long(AssetTemplateBaseSpecs.DEFAULT_TEMPLATE_FIELD_ID_BARCODE))
                        || form.isShowBarcode()) {

                        %>
                    <base:assetUserDefinedField fieldObjectName="reportRow"
                        editMode="<%=form.isEditCopy()%>"
                        assetItemType="<%=form.getAssetItemType()%>"
                        unlimitedDigital="<%=form.isUnlimitedDigital()%>"
                        bibID="<%= form.getBibID() %>"  />
                    <%}
                %>
                </logic:iterate>
                
                <% if ( request.getAttribute(AssetUserDefinedFieldTag.REQUEST_HAS_REQUIRED_FIELD) != null || form.isActionAddOrDuplicate()) { %>
                    <tr>
                        <td class="Instruction tdAlignRight">* = Required Field</td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td colSpan="2"><base:imageLine height="1" width="100%"/></td>
                    </tr>                        
                <% } %>
                <% if  (form.getComponentLink() != null) { %>
                    <tr>
                    <td>&nbsp;</td><td class="ColRow"><%= form.getComponentLink() %></td> 
                    </tr>
                    <tr>
                        <td colSpan="2"><base:imageLine height="1" width="100%"/></td>
                    </tr>
                <% } %>
            </table>
            <%--************************ End of Entry Fields ****************************--%>
            <% if (!form.isUnlimitedDigital() && (form.isViewCircNotes() || (form.isEditCopy() && form.isViewHistoryNotes()))) { %>
                <p class="TableHeading">Notes</p>
            <% } %>
            <logic:equal value="true" name="<%=AssetItemEditForm.FORM_NAME%>" property="viewCircNotes">
                <jsp:include page="/common/shownotes.jsp" flush="true">
                    <jsp:param name="formName" value='<%= AssetItemEditForm.FORM_NAME %>'/>
                </jsp:include>
                <br/>
            </logic:equal>
           <logic:equal value="true" name="<%=AssetItemEditForm.FORM_NAME%>" property="editCopy">
                <!-- Historical Notes -->
                <logic:equal value="true" name="<%=AssetItemEditForm.FORM_NAME%>" property="viewHistoryNotes">
                    <jsp:include page="/common/assethistoricalnotes.jsp" flush="true">
                        <jsp:param name="formName" value='<%= AssetItemEditForm.FORM_NAME %>'/>
                    </jsp:include>
                </logic:equal>
                <br/>
            </logic:equal>
        
            </td>
            
            <td valign="top">
            <base:showHideTag id="onSave" classForText="ColRowBold"> 
            <base:saveButton onclick="hideElementonSave()"
                name="<%= AssetItemEditForm.BUTTON_SAVE_COPY %>" /> <br>
            <% if (!form.isUnlimitedDigital()) { %>
                <base:spanIfAllowed
                    permissions="<%= new Permission[] { Permission.BACK_OFFICE_ADD_HISTORICAL_NOTES } %>">
                    <span class="SmallColHeading"><html:checkbox
                        property="<%=AssetItemEditForm.FIELD_ADD_NOTE_ON_SAVE%>">Add historical note</html:checkbox></span>
                    <br>
                </base:spanIfAllowed> 
            <% } %>
            <c:if test="<%=displayPrintCheckbox%>">    
            <base:spanIfAllowed
                permissions="<%= new Permission[] { Permission.BACK_OFFICE_GENERATE_REPORTS_ASSET, Permission.DISTRICT_CREATE_DISTRICT_REPORTS } %>">
                <span class="SmallColHeading"><html:checkbox
                    property="<%=AssetItemEditForm.FIELD_PRINT_LABEL_ON_SAVE%>">Print labels</html:checkbox></span>
                <br>
            </base:spanIfAllowed> 
            </c:if>
            <c:if test="<%=form.isBibHasComponents() && (form.isEditCopy())%>">
                <base:genericButton src="/buttons/large/components.gif" onclick="hideElementonSave()" alt="Components" name="<%= AssetItemEditForm.BUTTON_EDIT_COMPONENTS %>" />
                <br>
            </c:if>
            <base:cancelButton />
            </base:showHideTag></td>
        </tr>

    </table>

</base:form>
