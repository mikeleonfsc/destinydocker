<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LookupSpecs" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CopySpecs" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.common.MessageHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%-- @include file="/common/trapenter.jsp" --%>
<%-- Delete CopyEditForm.TABLE_CATEGORIES code and enable the above include after fixing compile jsp --%>

<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%><script language="JavaScript">
<!--
    function trapEnter(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        return false;
      }
      return true;
    }       

    function submitSymbologyChange() {
        document.<%=CopyEditTextbookForm.FORM_NAME%>.submit();
    }
    
//-->
</script>


<bean:define id="conditions" name="<%=CopyEditTextbookForm.FORM_NAME%>" property="conditionOptions"/>
<bean:define id="displayModes" name="<%=CopyEditTextbookForm.FORM_NAME%>" property="displayModeOptions"/>
<bean:define id="symbologies" name="<%=CopyEditTextbookForm.FORM_NAME%>" property="symbologyOptions"/>
<bean:define id="budgetCategoryList" name="<%= CopyEditTextbookForm.FORM_NAME %>" property="budgetCategoryList"/>

<bean:define id="form" name="<%=CopyEditTextbookForm.FORM_NAME%>" type="com.follett.fsc.destiny.client.cataloging.servlet.CopyEditTextbookForm" />
<c:set var="myForm" value="<%=request.getAttribute(CopyEditTextbookForm.FORM_NAME)%>"/>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    boolean displayRequiredField = true;
    boolean displayPrintCheckbox = false;
    Permission permConfigSite = Permission.BACK_OFFICE_CHANGE_SITE_PREFERENCES_TEXTBOOK;
    Permission permForPrintLabel[] = 
    new Permission[] { Permission.BACK_OFFICE_GENERATE_REPORTS_TEXTBOOK, Permission.DISTRICT_CREATE_DISTRICT_REPORTS };
    boolean isBarcodeFilteringEnabled = form.isFilteringOn();
%>


<base:messageBox strutsErrors="true"/>
<%
    String focus = "";
%>
 <%
     if (!CopyEditTextbookForm.RADIO_UNLIMITED_LICENSE_YES.equals(form.getUnlimitedLicense())) {
         if (CopyEditForm.OPTION_WITHOUT_BARCODES.equals(form.getAddWithBarcodeMode()) && !form.isEditCopy()) {
            focus = CopyEditTextbookForm.FIELD_NUMBER_OF_COPIES;
         } else if (form.getBarcodeDisplayMode() == BarcodeListDropDownTag.DISPLAY_MODE_NUM_COPIES) { 
             if ( form.getOriginalCopyStatus() != CopySpecs.STATUS_IN_TRANSIT &&
          !CopyEditTextbookForm.RADIO_ASSIGN_NEXT_BARCODE.equals(form.getAssignNextBarcode())) {
                focus = CopyEditTextbookForm.FIELD_COPY_BARCODE;
             }
         }
     }
 %>
<base:form action="/cataloging/servlet/handlecopyedittextbookform.do" focus="<%=focus%>" enctype="multipart/form-data">

<html:hidden property="<%=CopyEditTextbookForm.PARAM_ORIGINAL_COPY_STATUS%>" />
<html:hidden property="<%=CopyEditTextbookForm.PARAM_ORIGINAL_COPY_BARCODE%>" />
<html:hidden property="copyID" />
<html:hidden property="bibID" />
<html:hidden property="updated" />
<html:hidden property="runJobAlways" />
<html:hidden property="<%=CopyEditTextbookForm.FIELD_STATE_BIB_AT_SITE_LEVEL%>"/>
<input type="hidden" name="changedSiteTypeDropDown"/>
<input type="hidden" name="changedSiteNameValue"/>
<input type="hidden" name="changedDistrictDropDown"/>
<input type="hidden" name="changedBarcodeListDropDown"/>
<input type="hidden" name="changedAddWithBarcodeMode"/>
<html:hidden property="<%=CopyEditTextbookForm.PARAM_UNLIMITED_BIBID%>"/>
<html:hidden property="<%=CopyEditTextbookForm.PARAM_UNLIMITED_SITEID%>"/>

<html:hidden property="title" />
<html:hidden property="author" />
<html:hidden property="originalSiteID" />
<html:hidden property="lastSiteID" />
<html:hidden property="pageTitle" />
<html:hidden property="action" />
<html:hidden property="actionBackup"/>

    <logic:equal name="<%=CopyEditTextbookForm.FORM_NAME%>" property="showMoveSiteMessage" value="true">
   <%
       String[] messageText = new String[]{"Are you sure you want to move this copy?"};
   %>
        <base:confirmBox showWarningIcon="true"
            header=" ${myForm.moveSiteMessage}"           
            messageText="<%=messageText%>" 
            yesName="<%=CopyEditTextbookForm.BUTTON_CONFIRM_YES%>"
            noName="<%=CopyEditTextbookForm.BUTTON_CONFIRM_NO%>" />
    </logic:equal>

    <logic:equal name="<%=CopyEditTextbookForm.FORM_NAME%>" property="<%= CopyEditTextbookForm.PARAM_UNLIMITED_CONFIRMATION_MESSAGE %>" value="true">
          <%
            String[] messageTextUnlimited = new String[]{"Are you sure you want to create these copies?"};
          %>
        <base:confirmBox showWarningIcon="true"
            showPleaseWait="true"
            header="An unlimited number of copies will be created."           
            messageText="<%=messageTextUnlimited%>"
            yesName="<%=CopyEditTextbookForm.BUTTON_CONFIRM_YES%>"
            noName="<%=CopyEditTextbookForm.BUTTON_CONFIRM_NO%>" /> 
    </logic:equal>

    <logic:equal name="<%=CopyEditTextbookForm.FORM_NAME%>" property="showMultipleCopyAddConfirmation" value="true">
          <%
              List<String> myMessages = new ArrayList<String>();
              
              if (form.isShowWrongBarcodeLengthConfirmationMessage()) {
                  myMessages.add(form.getWrongBarcodeLengthConfirmationMessage());        
              }
              if (form.isRunAsJob() && !CopyEditTextbookForm.RADIO_ASSIGN_NEXT_BARCODE.equals(form.getAssignNextBarcode()) && !form.isEmptyBarcode()){
                    myMessages.add("Barcodes already in use will be skipped.");
              }
              myMessages.add("Are you sure you want to add these copies?");
              
              String[] messageText = myMessages.toArray(new String[]{});
          %>
        <base:confirmBox showWarningIcon="true"
            showPleaseWait="true"
            header=" ${myForm.multipleCopyAddConfirmationMessage}"           
            messageText="<%=messageText%>"
            yesName="<%=CopyEditTextbookForm.BUTTON_CONFIRM_YES%>"
            noName="<%=CopyEditTextbookForm.BUTTON_CONFIRM_NO%>" /> 
    </logic:equal>

<%
    if (isBarcodeFilteringEnabled) { 
    if ( !CopyEditTextbookForm.OPTION_WITHOUT_BARCODES.equals(form.getAddWithBarcodeMode()) && !form.isConsumable() && !form.isNeverBarcode() ) {
%>
    
    <base:barcodeFilterWarning/>
<%
    }
   }
%>

<table border="0" cellpadding="2" cellspacing="0" width="100%">
  <tr>
    <td>
      <table border="0" cellpadding="2" cellspacing="0" width="100%" id="<%=CopyEditTextbookForm.TABLE_MAIN_COPY_EDIT%>">
        <tr>
          <td colspan="2">
            <%--
                 Don't do cellpadding here or else things will be off center
                 when either author or callnumber is empty.
            --%>
            <table border="0" cellpadding="0" cellspacing="0" align="center" id="<%=CopyEditTextbookForm.TABLE_HEADER%>">
              <tr>
                <td class="TableHeading" align="center" vAlign="top" colspan="2">
                <!-- leave the image here, otherwise it drops the page too far down -->
                <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=CopyEditTextbookForm.BUTTON_TRAP_ENTER_KEY%>">
                <bean:write name="<%=CopyEditTextbookForm.FORM_NAME%>" property="<%=CopyEditTextbookForm.FIELD_TITLE%>"/></td>
              </tr>
            <%-- We only display the author if they are not blank --%>
            <base:notEmpty name="<%=CopyEditTextbookForm.FORM_NAME%>" property="<%=CopyEditTextbookForm.FIELD_AUTHOR%>">
              <tr>
                  <td class="SmallColHeading tdAlignRight">Author&nbsp;&nbsp;</td>
                  <td class="SmallColRow"><bean:write name="<%=CopyEditTextbookForm.FORM_NAME%>" property="<%=CopyEditTextbookForm.FIELD_AUTHOR%>"/></td>
              </tr>
            </base:notEmpty>
            <base:notEmpty name="<%=CopyEditTextbookForm.FORM_NAME%>" property="<%=CopyEditTextbookForm.FIELD_INSTRUCTIONAL_CLASSIFICATION%>">
              <tr>
                  <td class="SmallColRow" align="center" colspan="2">
                  <bean:write name="<%=CopyEditTextbookForm.FORM_NAME%>" property="<%=CopyEditTextbookForm.FIELD_INSTRUCTIONAL_CLASSIFICATION%>"/></td>
              </tr>
            </base:notEmpty>
            </table>
          </td>
        </tr>
        <tr>
          <td colspan="2"><base:imageLine height="1" width="100%" /></td>
        </tr>
        
        
    <%-- START SITE TYPE / SITE DROP DOWN FUNCTIONALITY!--%>        
        
     <base:isDistrictUser>
        <base:isNotStateContext>
            <logic:equal name="<%=CopyEditTextbookForm.FORM_NAME%>" property="editInTransit" value="false">
                <tr>
		            <td class="FormLabel tdAlignRight">
                        Site Type
                    </td>
                    <td class="FormElement">
                        <base:selectSiteType name="<%=form.FIELD_SITE_TYPE_ID%>" 
                            selectedSiteTypeID="<%=form.getSiteTypeID()%>"  
                            mode="<%=LookupSpecs.MODE_DISTRICT_USER_AECOPY_LIST%>" 
                            includeForMediaSites="false" 
                            includeForLibrarySites="false" includeForTextbookSites="true"  
                            includeForAssetSites="false"
                            onChangeAction="this.form.changedSiteTypeDropDown.value=true; this.form.submit(); return false;" />
                    </td>
                </tr>
                <tr>
		          <td class="FormLabel tdAlignRight">
                    Site Name
                  </td>
                  <td class="FormElement">
                    <base:selectSite 
                        name="<%=CopyEditTextbookForm.FIELD_COPY_SITE_ID%>" 
                        selectedSiteID='<%=""+form.getCopySiteID()%>' 
                        siteTypeID='<%=form.getSiteTypeID()%>' 
                        includeLibrarySites='false'
                        includeTextbookSites='true'
                        includeMediaSites='false'
                        includeAssetSites="false"
                        onChangeAction="this.form.changedSiteNameValue.value = true;this.form.submit(); return false;"
                    />
                    <base:helpTag helpFileName="d_choose_site_TM.htm"/>
                  </td>
                </tr>
            </logic:equal>
            <html:hidden property="<%=CopyEditTextbookForm.FIELD_DISTRICT_CONTEXT%>"/>
        </base:isNotStateContext>
        <base:isStateContext>
            <html:hidden property="<%=CopyEditTextbookForm.FIELD_SITE_TYPE_ID%>"/>
            <c:choose>
                <c:when test="${myForm.editCopy}">
                <c:if test="${myForm.stateCopyAtSiteLevel}">
                    <tr>
                        <td class="FormLabel tdAlignRight">
                            District
                        </td>
                        <td class="ColRow"><bean:write name="<%=CopyEditTextbookForm.FORM_NAME%>" property="stateJoinDistrictName"/></td>
                    </tr>
                    <tr>
                        <td class="FormLabel tdAlignRight">
                            Site Name
                        </td>
                        <td class="ColRow"><bean:write name="<%=CopyEditTextbookForm.FORM_NAME%>" property="stateJoinSiteName"/></td>
                    </tr>
                </c:if>
                </c:when>
                <c:otherwise>
                
                <tr>
                    <td class="FormLabel tdAlignRight">
                        District
                    </td>
                    <td><base:selectDistrict 
                        useSelectADistrict="false" 
                        selectedDistrictContext="<%=form.getDistrictContext()%>"
                        onChangeAction="this.form.changedDistrictDropDown.value=true; this.form.submit(); return false;" 
                        name="<%=CopyEditTextbookForm.FIELD_DISTRICT_CONTEXT%>" /><td>
                </tr>
                <%
                    if (form.getDistrictContext() != null && !form.isStateRepository()) {
                %>
                <tr>
                    <td class="FormLabel tdAlignRight">
                        Site Name
                    </td>
                    <td>
                            <base:selectSite 
                                name="<%=CopyEditTextbookForm.FIELD_COPY_SITE_ID%>" 
                                selectedSiteID='<%=""+form.getCopySiteID()%>' 
                                siteTypeID='<%=form.getSiteTypeID()%>' 
                                mode='<%=SelectSiteTag.MODE_GROUP_BY_SITE_TYPE_TEXTBOOK_ONLY%>'
                                includeLibrarySites='false'
                                includeTextbookSites='true'
                                includeMediaSites='false'
                                contextName='<%=form.getDistrictContext()%>'
                                includeAssetSites="false"
                                onChangeAction="this.form.changedSiteNameValue.value = true;this.form.submit(); return false;"
                            />
                    </td>
                </tr>
                
                <%
                                    } else {
                                %>
                    <html:hidden property="<%=CopyEditTextbookForm.FIELD_COPY_SITE_ID%>"/>
                <%
                    }
                %>
                </c:otherwise>
            </c:choose>
        </base:isStateContext>      
     </base:isDistrictUser>
     <base:isNotDistrictUser>
        <html:hidden property="<%=CopyEditTextbookForm.FIELD_COPY_SITE_ID%>" />
     </base:isNotDistrictUser>

    <%-- END SITE TYPE / SITE DROP DOWN FUNCTIONALITY!--%>        

        <%
                    if (form.getCopyID() == null || new Long(0).equals(form.getCopyID())) {
                    if (!form.isConsumable() && !form.isNeverBarcode()) {
                        displayPrintCheckbox = true;
                %>    
            <tr>
                <td class = "ColRowBold tdAlignRight" valign="top">Add Copies</td>
                <td><html:select styleClass="ColRow" property = "<%=CopyEditTextbookForm.FIELD_ADD_WITH_BARCODE_MODE%>"
                        onchange = "this.form.changedAddWithBarcodeMode.value = true; this.form.submit(); return true;">
                        <html:option value = "<%=CopyEditTextbookForm.OPTION_WITH_BARCODES%>">with Barcodes</html:option>
                        <html:option value = "<%=CopyEditTextbookForm.OPTION_WITHOUT_BARCODES%>">without Barcodes</html:option>
                    </html:select>
                </td>
            </tr>
            <%
                } // !form.isConsumable() && !form.isNeverBarcode()
                
                   if (CopyEditTextbookForm.OPTION_WITHOUT_BARCODES.equals(form.getAddWithBarcodeMode()) || form.isConsumable() || form.isNeverBarcode()) { 
                        displayPrintCheckbox = false;
            %>
                <tr>
                    <td valign = "top" class="ColRowBold tdAlignRight">*Number of Copies</td>
                    <% if  (form.getUnlimitedBibID() == null && !form.unlimitedCopiesAtSite()) {%>
                        <td valign='top'><span onKeyPress="return trapEnter(event);" class="ColRow">
                        <%if ( form.isUnlimitedOptionAvailable()) { %>
                            <html:radio property="<%=CopyEditTextbookForm.FIELD_UNLIMITED_LICENSE%>" value="<%=CopyEditTextbookForm.RADIO_UNLIMITED_LICENSE_NO%>"
                            onclick='<%="document." + CopyEditTextbookForm.FORM_NAME + "." + CopyEditTextbookForm.FIELD_NUMBER_OF_COPIES + ".focus();"%>'>
                            </html:radio>
                            <input type="text" name="<%= CopyEditTextbookForm.FIELD_NUMBER_OF_COPIES %>" maxlength="5" size="7" value="<%=form.getNumberOfCopies()%>"
                            onfocus='<%="document." + CopyEditTextbookForm.FORM_NAME + "." + CopyEditTextbookForm.FIELD_UNLIMITED_LICENSE + "[0].checked = true"%>'/>
                        <% } else {%>
                            <input type="text" name="<%= CopyEditTextbookForm.FIELD_NUMBER_OF_COPIES %>" maxlength="5" size="7" value="<%=form.getNumberOfCopies()%>"/>
                        <% } %>
                             </span>
                        </td>
                    <% } else { %>
                        <td valign='top' class="ColRow">Unlimited</td>
                        <html:hidden property="<%=CopyEditTextbookForm.FIELD_UNLIMITED_LICENSE%>" value="<%=CopyEditTextbookForm.RADIO_UNLIMITED_LICENSE_YES%>"/>
                        <html:hidden property="<%=CopyEditTextbookForm.FIELD_NUMBER_OF_COPIES%>" value=""/>
                    <% } %>
                </tr>
                <%if ( form.isUnlimitedOptionAvailable() && form.getUnlimitedBibID() == null && !form.unlimitedCopiesAtSite()) { %>
                
                  <tr><td>&nbsp;</td>
                      <td class="ColRow">
                        <html:radio property="<%=CopyEditTextbookForm.FIELD_UNLIMITED_LICENSE%>" value="<%=CopyEditTextbookForm.RADIO_UNLIMITED_LICENSE_YES%>"
                            onclick='<%="document." + CopyEditTextbookForm.FORM_NAME + "." + CopyEditTextbookForm.FIELD_NUMBER_OF_COPIES + ".value = \'\'"%>'>
                        </html:radio>
                        Unlimited
                      </td>
                 </tr>      
                <% } %>
                
                <%if ( form.isShowBudgetCategoryAtAll()) { %>
                <tr>
                  <td class="FormLabel tdAlignRight">
                    Budget Category
                  </td>
                  <td class="ColRow">
                     
                    <% if (form.isBudgetCategoryStatic()) { %>
                        <html:hidden property="<%= CopyEditTextbookForm.FIELD_BUDGET_CATEGORY_ID %>"/>
                        <%= form.getCurrentBudgetCategory() %>
                    <% } else { %>
                        <html:select property="<%= CopyEditTextbookForm.FIELD_BUDGET_CATEGORY_ID %>">
                          <html:options collection="budgetCategoryList" property="longID" labelProperty="stringDesc"/>
                        </html:select>
                        &nbsp;
                        <base:genericButton absbottom="true" src="/buttons/large/other.gif" name="<%=CopyEditTextbookForm.BUTTON_BUDGET_CATEGORY_OTHER%>" alt="Other"/>
                    <% } %>
                  </td>
                </tr>
                <% } %>
                <tr>
                    <td class="ColRowBold tdAlignRight">Purchase Price</td>
                    <td class="ColRow">
                        <html:text property="<%= CopyEditTextbookForm.FIELD_PRICE %>" size="15" maxlength="15"/>
                    </td>
                </tr>
                <tr>
                    <td valign="top" class="ColRowBold tdAlignRight">Purchase Order Number</td>
                    <td valign="top" class="ColRow">
                        <html:text property="<%= CopyEditTextbookForm.FIELD_PURCHASE_ORDER_NUMBER %>" size="15" maxlength="80"/>
                    </td>
                </tr>
                <tr>
                    <td valign = "top" class="ColRowBold tdAlignRight">Status</td>
                    <td valign = "top" class = "ColRow">
                    <base:isDistrictUser>
                        <base:isNotStateContext>
                            <% // JTrac REG105-266 - For unlimited copies, status is a static field
                                if (!form.isUnlimitedCopiesAtAnySite() && !form.isStateBibAtSiteLevel() && !form.getCopyClientValue().isDigitalMaterial()) {
                            %>
                                <html:select property="<%=CopyEditTextbookForm.FIELD_COPY_STATUS_AS_LONG%>">
                                    <html:option value='<%=""+CopySpecs.STATUS_AVAILABLE%>'><%=MessageHelper.formatMessage(CopySpecs.KEY_STATUS_AVAILABLE)%></html:option>
                                    <html:option value='<%=""+CopySpecs.STATUS_IN_TRANSIT%>'><%=MessageHelper.formatMessage(CopySpecs.KEY_STATUS_IN_TRANSIT)%></html:option>
                                </html:select> 
                            <%
                                 } else {
                             %>
                                <%=MessageHelper.formatMessage(CopySpecs.KEY_STATUS_AVAILABLE)%>
                                <html:hidden property = "<%=CopyEditTextbookForm.FIELD_COPY_STATUS_AS_LONG%>" value = '<%=""+CopySpecs.STATUS_AVAILABLE%>'/>
                            <%
                                }
                            %>
                        </base:isNotStateContext>
                        <base:isStateContext>
                            <%
                                if (form.getDistrictContext() != null && !form.isStateRepository() && !form.getCopyClientValue().isDigitalMaterial()) {
                                    if ( form.isBundle() ) { %>
                                    <%=CopySpecs.getCopyStatusAsString(CopySpecs.STATUS_IN_TRANSIT)%>
                                    <html:hidden property = "<%=CopyEditTextbookForm.FIELD_COPY_STATUS_AS_LONG%>" value = '<%=""+CopySpecs.STATUS_IN_TRANSIT%>'/>
                            <%      } else {
                            %>
                                
                                <html:select property="<%=CopyEditTextbookForm.FIELD_COPY_STATUS_AS_LONG%>">
                                    <html:option value='<%=""+CopySpecs.STATUS_AVAILABLE%>'><%=MessageHelper.formatMessage(CopySpecs.KEY_STATUS_AVAILABLE)%></html:option>
                                    <html:option value='<%=""+CopySpecs.STATUS_IN_TRANSIT%>'><%=MessageHelper.formatMessage(CopySpecs.KEY_STATUS_IN_TRANSIT)%></html:option>
                                </html:select>
                            <%
                                    }
                                } else {
                            %>
                                <%=MessageHelper.formatMessage(CopySpecs.KEY_STATUS_AVAILABLE)%>
                                <html:hidden property = "<%=CopyEditTextbookForm.FIELD_COPY_STATUS_AS_LONG%>" value = '<%=""+CopySpecs.STATUS_AVAILABLE%>'/>
                            <%
                                }
                            %>
                        </base:isStateContext>
                   </base:isDistrictUser>
                   <base:isNotDistrictUser>
                        <%=MessageHelper.formatMessage(CopySpecs.KEY_STATUS_AVAILABLE)%>
                        <html:hidden property = "<%=CopyEditTextbookForm.FIELD_COPY_STATUS_AS_LONG%>" value = '<%=""+CopySpecs.STATUS_AVAILABLE%>'/> 
                   </base:isNotDistrictUser>
                    <%=form.getStatusInTransitFrom() %>
                    <base:helpTag helpFileName="d_copy_status_TM.htm"/>
                   </td>
                </tr>
                <tr>
                  <td class="Instruction tdAlignRight">* = Required Field</td>
                  <td class="ColRow">&nbsp;</td>
                </tr>
                
            <%
                } else {
            %>
            <tr>
              <td valign="top" class="tdAlignRight">
              *<html:select styleClass="ColRowBold" 
                    property="<%=CopyEditTextbookForm.FIELD_BARCODE_DISPLAY_MODE%>"
                    onchange="this.form.changedBarcodeListDropDown.value=true; this.form.submit(); return false;">
                <html:options collection="displayModes" property="longID" labelProperty="stringDesc"/>
              </html:select>
              </td>
              <td nowrap valign="top">
              <base:barcodeListDropDown 
                        numberOfCopies="<%=form.getNumberOfCopies()%>"
                        barcodeFilteringOn="<%=isBarcodeFilteringEnabled%>" 
                        displayMode="<%=form.getBarcodeDisplayMode()%>"
                        formName="<%=CopyEditTextbookForm.FORM_NAME%>"
                        barcodeType="<%=Barcode.BARCODETYPE_TEXTBOOKCOPY%>"
                        />

              </td>
            </tr>
            <%
                if (form.getBarcodeDisplayMode() == BarcodeListDropDownTag.DISPLAY_MODE_NUM_COPIES){
            %>
                <!-- for number of copies only  -->
                <tr>
                  <td class="ColRowBold tdAlignRight" valign="top">Starting Barcode</td>
                  <td class="ColRow" nowrap>
                    <logic:equal name="<%=CopyEditTextbookForm.FORM_NAME%>" property="showAutoAssignNextBarcode" value="true">
                        <html:radio property="<%=CopyEditTextbookForm.FIELD_ASSIGN_NEXT_BARCODE%>" value="<%=CopyEditTextbookForm.RADIO_EXPLICIT_BARCODE%>"
                            onclick='<%="document." + CopyEditTextbookForm.FORM_NAME + "." + CopyEditTextbookForm.FIELD_COPY_BARCODE + ".focus();"%>'>
                        </html:radio>
                    </logic:equal>
                    <span onKeyPress="return trapEnter(event);" class="ColRow">
                    <logic:equal name="<%=CopyEditTextbookForm.FORM_NAME%>" property="showAutoAssignNextBarcode" value="true">
                      <html:text property="<%=CopyEditTextbookForm.FIELD_COPY_BARCODE%>" size="17" maxlength='<%=""+CopySpecs.COPY_MAX_COPY_BARCODE_LENGTH%>'
                        onfocus='<%="document." + CopyEditTextbookForm.FORM_NAME + "." + CopyEditTextbookForm.FIELD_ASSIGN_NEXT_BARCODE + "[0].checked = true"%>'                   />
                    </logic:equal>
                    <logic:equal name="<%=CopyEditTextbookForm.FORM_NAME%>" property="showAutoAssignNextBarcode" value="false">
                      <html:text property="<%=CopyEditTextbookForm.FIELD_COPY_BARCODE%>" size="17" maxlength='<%=""+CopySpecs.COPY_MAX_COPY_BARCODE_LENGTH%>'/>
                    </logic:equal>
                      <logic:equal name="<%=CopyEditTextbookForm.FORM_NAME%>" property="showAutoAssignNextBarcode" value="true">
                        <base:helpTag helpFileName="d_starting_barcode_TM.htm"/>
                      </logic:equal>
                    </span>
                    <logic:equal name="<%=CopyEditTextbookForm.FORM_NAME%>" property="showSymbology" value="true">
                        <br>&nbsp;&nbsp;
                        <%
                            String pageValue = "/cataloging/servlet/handlecopyedittextbookform.do?" + CopyEditTextbookForm.PARAM_SYMBOLOGY + "=true";
                        %>
                        <base:link 
                            permission="<%=permConfigSite%>" 
                            page="<%=pageValue%>" 
                            disableLink="<%=form.checkForStateBibID()%>"
                            showTextAlways="true" 
                            onclick="submitSymbologyChange();"><%=form.getSymbologyText()%>
                        </base:link>
                    </logic:equal>
                  </td>
                </tr>
                <logic:equal name="<%=CopyEditTextbookForm.FORM_NAME%>" property="showAutoAssignNextBarcode" value="true">
                <tr>
                  <td>&nbsp;</td>
                  <td class="ColRow">
                      <html:radio 
                        disabled="<%=isBarcodeFilteringEnabled%>"                  
                        property="<%=CopyEditTextbookForm.FIELD_ASSIGN_NEXT_BARCODE%>" value="<%=CopyEditTextbookForm.RADIO_ASSIGN_NEXT_BARCODE%>"
                        onclick='<%="document." + CopyEditTextbookForm.FORM_NAME + "." + CopyEditTextbookForm.FIELD_COPY_BARCODE + ".value = \'\'"%>'>
                        Assign next barcode
                      </html:radio>
                  </td>
                </tr>
                <%
                    if (!isBarcodeFilteringEnabled && !(StringHelper.isEmpty(form.getNextDisplayableBC()))) {
                %>
                <tr>
                  <td>&nbsp;</td>
                  <td class="ColRow">
                      &nbsp;&nbsp;&nbsp;&nbsp;[Next: <%=form.getNextDisplayableBC()%>]
                  </td>
                </tr>
                <%
                    }
                %>
                </logic:equal>
            <%
                }
            %>
            <%
                }
            %>
        <%
            } else {
        %>
            <%
                if (form.isEditCopy() || !CopyEditTextbookForm.OPTION_WITHOUT_BARCODES.equals(form.getAddWithBarcodeMode())) {
            %>
            <%
                if(!(form.getCopyStatusAsLong().longValue() == CopySpecs.STATUS_IN_TRANSIT && form.getCopyBarcode() == null) ) {  
                     displayPrintCheckbox = true;
            %>
                <tr>
                <base:isStateContext>
                    <%
                        displayRequiredField = false;
                    %>
                </base:isStateContext>
                <%
                    if (form.getOriginalCopyStatus() == CopySpecs.STATUS_IN_TRANSIT) {
                            displayRequiredField = false;
                        }
                %>
                  <td class="ColRowBold tdAlignRight">
                  <%
                      if (displayRequiredField) {
                  %>
                  *
                  <%
                      }
                  %>                    
                    Barcode
                  </td>
                  <td class="ColRow" nowrap>
                    <logic:equal name="<%=CopyEditTextbookForm.FORM_NAME%>" property="showAutoAssignNextBarcode" value="true">
                      <html:radio property="<%=CopyEditTextbookForm.FIELD_ASSIGN_NEXT_BARCODE%>" value="<%=CopyEditTextbookForm.RADIO_EXPLICIT_BARCODE%>"
                        onclick='<%="document." + CopyEditTextbookForm.FORM_NAME + "." + CopyEditTextbookForm.FIELD_COPY_BARCODE + ".focus();"%>'>
                      </html:radio>
                    </logic:equal>
                    <span onKeyPress="return trapEnter(event);" class="ColRow">
                    
                    <logic:equal name="<%=CopyEditTextbookForm.FORM_NAME%>" property="showAutoAssignNextBarcode" value="true">
                      <%
                          if (form.getOriginalCopyStatus() == CopySpecs.STATUS_IN_TRANSIT) {
                      %>
                        <bean:write name="<%=CopyEditTextbookForm.FORM_NAME%>" property="<%=CopyEditTextbookForm.FIELD_COPY_BARCODE%>" />
                      <%
                          } else {
                      %>
                        <html:text property="<%=CopyEditTextbookForm.FIELD_COPY_BARCODE%>" size="17" maxlength='<%=""+CopySpecs.COPY_MAX_COPY_BARCODE_LENGTH%>'
                          onfocus='<%="document." + CopyEditTextbookForm.FORM_NAME + "." + CopyEditTextbookForm.FIELD_ASSIGN_NEXT_BARCODE + "[0].checked = true"%>'              />
                      <%
                          }
                      %>
                    </logic:equal>
                    <logic:equal name="<%=CopyEditTextbookForm.FORM_NAME%>" property="showAutoAssignNextBarcode" value="false">
                      <%
                          if (form.getOriginalCopyStatus() == CopySpecs.STATUS_IN_TRANSIT) {
                      %>
                        <bean:write name="<%=CopyEditTextbookForm.FORM_NAME%>" property="<%=CopyEditTextbookForm.FIELD_COPY_BARCODE%>" />
                      <%
                          } else {
                      %>
                        <html:text property="<%=CopyEditTextbookForm.FIELD_COPY_BARCODE%>" size="17" maxlength='<%=""+CopySpecs.COPY_MAX_COPY_BARCODE_LENGTH%>'/>
                      <%
                          }
                      %>
                    </logic:equal>
                    
                      <logic:equal name="<%=CopyEditTextbookForm.FORM_NAME%>" property="showAutoAssignNextBarcode" value="true">
                        <base:helpTag helpFileName="d_starting_barcode_TM.htm"/>
                      </logic:equal>
                    </span>                    
                  </td>
                </tr>
                <logic:equal name="<%=CopyEditTextbookForm.FORM_NAME%>" property="showSymbology" value="true">
                <tr>
                  <td>&nbsp;</td>
                  <td class="ColRow">
                      <html:radio 
                        disabled="<%=isBarcodeFilteringEnabled%>"                  
                        property="<%=CopyEditTextbookForm.FIELD_ASSIGN_NEXT_BARCODE%>" value="<%=CopyEditTextbookForm.RADIO_ASSIGN_NEXT_BARCODE%>"
                        onclick='<%="document." + CopyEditTextbookForm.FORM_NAME + "." + CopyEditTextbookForm.FIELD_COPY_BARCODE + ".value = \'\'"%>'>
                        Assign next barcode
                      </html:radio>
                  </td>
                </tr>
                </logic:equal>
            <%
                }    
                       }
                     }
            %>
         
    <%-- BEGIN COPY STATUS DROP DOWN --%>
 <%
             if (form.getUnlimitedBibID() == null && (form.isEditCopy() || !CopyEditTextbookForm.OPTION_WITHOUT_BARCODES.equals(form.getAddWithBarcodeMode()))) {
         %>
        <tr>
            <td class="ColRowBold tdAlignRight">Status</td>
            <%
                if (form.isStatusEditable()) {
            %>
                <td class="ColRow">
                    <html:select property="<%=CopyEditTextbookForm.FIELD_COPY_STATUS_AS_LONG%>">
                        <html:option value='<%=""+CopySpecs.STATUS_AVAILABLE%>'><%=MessageHelper.formatMessage(CopySpecs.KEY_STATUS_AVAILABLE)%></html:option>
                        <html:option value='<%=""+CopySpecs.STATUS_LOANED_OUT%>'><%=MessageHelper.formatMessage(CopySpecs.KEY_STATUS_LOANED_OUT)%></html:option>
                        <%
                            if (form.isStateRepositoryLocalCopy() && form.getCopyStatusAsLong().longValue() == CopySpecs.STATUS_LOST){
                        %>
                            <html:option value='<%=""+CopySpecs.STATUS_LOST%>'><%=MessageHelper.formatMessage(CopySpecs.KEY_STATUS_LOST)%></html:option>
                        <%
                            }
                        %>
                        <html:option value='<%=""+CopySpecs.STATUS_ON_ORDER%>'><%=MessageHelper.formatMessage(CopySpecs.KEY_STATUS_ON_ORDER)%></html:option>
                        <html:option value='<%=""+CopySpecs.STATUS_OUT_FOR_REPAIRS%>'><%=MessageHelper.formatMessage(CopySpecs.KEY_STATUS_OUT_FOR_REPAIRS)%></html:option>

                        <base:isDistrictUser>
                            <%
                                if (form.isAbleToBeInTransit()) {
                            %>
                                <html:option value='<%=""+CopySpecs.STATUS_IN_TRANSIT%>'><%=MessageHelper.formatMessage(CopySpecs.KEY_STATUS_IN_TRANSIT)%></html:option>
                            <% } %>
                        </base:isDistrictUser>
                        
                    </html:select>
                    <%=form.getStatusInTransitFrom() %>
                    <base:helpTag helpFileName="d_copy_status_TM.htm"/>
                </td>
              <% } else { %>
                <html:hidden property="<%= CopyEditTextbookForm.FIELD_COPY_STATUS_AS_LONG %>"/>
                <td class="ColRow">
                    <bean:write name="<%= CopyEditTextbookForm.FORM_NAME %>" property="<%= CopyEditTextbookForm.FIELD_COPY_STATUS %>"/>
                    <%=form.getStatusInTransitFrom() %>
                    <base:helpTag helpFileName="d_copy_status_TM.htm"/>
                </td>
              <% } %>
        </tr>
        
    <%-- END COPY STATUS DROP DOWN --%>              

        <%-- This is the textbook screen section --%>
        <tr>
          <td class="ColRowBold tdAlignRight">Condition</td>
          <td class="ColRow">
          <html:select property="<%=CopyEditTextbookForm.FIELD_COPY_CONDITION%>">
            <html:options collection="conditions" property="longID" labelProperty="stringDesc"/>
          </html:select>
          </td>
        </tr>
        
        <%boolean showLocation = !store.isDistrictUser() || !form.isEditInTransit(); 
        if ( store.isStateContext() && 
            (
                !UserContext.getMyContextName().equals(form.getDistrictContext()) ||
                form.isStateCopyAtSiteLevel()
             )
            ) {
            showLocation = false;
            %>
            <html:hidden value="" property="<%= CopyEditTextbookForm.FIELD_TEXTBOOK_LOCATION%>"/> 
            <%
        }
        %>
          <% if (showLocation) { %>
            <tr>
	          <td class="ColRowBold tdAlignRight">Location</td>
              <td class="ColRow">
              <base:selectLocation name="<%= CopyEditTextbookForm.FIELD_TEXTBOOK_LOCATION %>"
                siteID="<%=form.getCopySiteID()%>" includeNone="true" selectedLocationID="<%=form.getLocationID()%>"/>
              <base:spanIfAllowed permission='<%=Permission.CAT_MANAGE_LOCATIONS%>'>
              &nbsp;
	          <base:genericButton absbottom="true" src="/buttons/large/other.gif" name="<%=CopyEditTextbookForm.BUTTON_LOCATION_OTHER%>" alt="Other..."/>
              </base:spanIfAllowed>
              </td>
            </tr>
          <% } %>
        <%if ( form.isShowBudgetCategoryAtAll()) { %>
        <tr>
          <td class="FormLabel tdAlignRight">
            Budget Category
          </td>
          <td class="ColRow">
                <% if (form.isBudgetCategoryStatic()) { %>
                    <html:hidden property="<%= CopyEditTextbookForm.FIELD_BUDGET_CATEGORY_ID %>"/>
                    <%= form.getCurrentBudgetCategory() %>
                <% } else { %>
                    <html:select property="<%= CopyEditTextbookForm.FIELD_BUDGET_CATEGORY_ID %>">
                      <html:options collection="budgetCategoryList" property="longID" labelProperty="stringDesc"/>
                    </html:select>
                    &nbsp;
                    <base:genericButton absbottom="true" src="/buttons/large/other.gif" name="<%=CopyEditTextbookForm.BUTTON_BUDGET_CATEGORY_OTHER%>" alt="Other"/>
                <% } %>
          </td>
        </tr>
        <% } %>
        <tr>
          <td class="ColRowBold tdAlignRight">Date Acquired</td>
          <td class="ColRow">
            <html:text property="<%= CopyEditTextbookForm.FIELD_DATE_ADDED %>" size="15" maxlength="15"/>
            <base:helpTag helpFileName="d_date_added_LM_MM.htm"/>
          </td>
        </tr>
        <tr>
          <td class="ColRowBold tdAlignRight">Purchase Price</td>
          <td class="ColRow">
            <html:text property="<%= CopyEditTextbookForm.FIELD_PRICE %>" size="15" maxlength="15"/>
          </td>
        </tr>
        <tr>
          <td class="ColRowBold tdAlignRight">Purchase Order Number</td>
          <td class="ColRow">
            <html:text property="<%= CopyEditTextbookForm.FIELD_PURCHASE_ORDER_NUMBER %>" size="15" maxlength="80"/>
          </td>
        </tr>

        <% if ( displayRequiredField ) { %>
        <tr>
          <td class="Instruction tdAlignRight">* = Required Field</td>
          <td class="ColRow">&nbsp;</td>
        </tr>
        <% } %>

        <!-- Categories -->
        <tr>
            <td colspan="2"><base:imageLine height="1" width="100%" /></td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight">
                Copy Categories 
                <base:helpTag helpFileName="d_copy_categories_LM_MM.htm" />
            </td>
            <td class="FormLabel">
                <table width="100%" border="0" cellpadding="2" cellspacing="0" align="center" id="<%= CopyEditLibraryForm.TABLE_CATEGORIES %>">
                    <tr>
                        <td class="ColRow">
                            <bean:write name="<%= CopyEditTextbookForm.FORM_NAME %>" property="<%= CopyEditTextbookForm.FIELD_CATEGORIES %>" />
                        </td>
                        <td class="tdAlignRight">
                            <base:spanIfAllowed permission='<%=Permission.CAT_CREATE_ASSIGN_CATEGORIES_TEXTBOOK%>'>
                                <base:genericButton src="/buttons/large/update.gif" alt="Update Copy Categories"
                                    name="<%= CopyEditLibraryForm.BUTTON_UPDATE_CATEGORIES %>" 
                                />
                            </base:spanIfAllowed>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
                
        <base:spanIfAllowed permissions="<%=CopyEditTextbookForm.VIEW_NOTE_PERM%>" collectionType="<%=form.getCollectionType()%>">
        <tr>
          <td colspan="2"><base:imageLine height="1" width="100%"/></td>
        </tr>
        <tr>
          <td class="ColRowBold tdAlignRight" valign="top">
            Notes
            <base:helpTag helpFileName="c_notes_make_use_LM_MM_TM_AM.htm"/>
          </td>
          <td class="tdAlignRight">
            <base:spanIfAllowed permissions="<%=CopyEditTextbookForm.ADD_NOTE_PERM%>" collectionType="<%=form.getCollectionType()%>">
                <base:genericButton src="/buttons/large/addnote.gif" alt='<%= MessageHelper.formatMessage("addNote") %>' name="<%= CopyEditTextbookForm.BUTTON_ADD_NOTE %>"/><br/>
            </base:spanIfAllowed>
            <!-- Copy Notes -->
            <%--@todo Why can't we use the nice constants here?  We tried and it doesn't work --%>
            <jsp:include page="/common/shownotes.jsp?supressDefaultHeader" flush="true">
                <jsp:param name="formName" value="<%=CopyEditTextbookForm.FORM_NAME%>"/>
                <jsp:param name="suppressDefaultHeader" value="true"/>
            </jsp:include>
          </td>
        </tr>
        </base:spanIfAllowed>
<% } %>
    </table>
    </td>
    <td valign="top">
        <base:showHideTag id="onSave" classForText="ColRowBold">
            <!-- Save Copy & Cancel buttons go here -->
            <logic:equal name="<%=CopyEditTextbookForm.FORM_NAME%>" property="action" value="<%=CopyEditTextbookForm.ACTION_ADD%>">
                <base:genericButton src="/buttons/large/savecopies.gif" onclick="hideElementonSave()" alt="Save Copies" name="<%= CopyEditTextbookForm.BUTTON_SAVE_COPY %>" />
            </logic:equal>
            <logic:notEqual name="<%=CopyEditTextbookForm.FORM_NAME%>" property="action" value="<%=CopyEditTextbookForm.ACTION_ADD%>">
                <base:genericButton src="/buttons/large/savecopy.gif" onclick="hideElementonSave()" alt="Save Copy" name="<%= CopyEditTextbookForm.BUTTON_SAVE_COPY %>" />
            </logic:notEqual>
                <br>
            <c:if test="<%=!form.isStateBibAtSiteLevel() && (displayPrintCheckbox)%>">    
            <base:spanIfAllowed permissions="<%=permForPrintLabel%>">
                <span class="SmallColHeading"><html:checkbox property="<%=CopyEditTextbookForm.FIELD_PRINT_LABEL_ON_SAVE%>">Print labels</html:checkbox></span>
                <br>
            </base:spanIfAllowed>
            </c:if>
            <c:if test="<%=form.isBibHasComponents() && (form.isEditCopy())%>">
                <base:genericButton src="/buttons/large/components.gif" onclick="hideElementonSave()" alt="Components" name="<%= CopyEditTextbookForm.BUTTON_EDIT_COMPONENTS %>" />
                <br>
            </c:if>
            <base:cancelButton onclick="hideElementonSave()"/>
        </base:showHideTag>
    </td>
  </tr>
</table>

</base:form>
