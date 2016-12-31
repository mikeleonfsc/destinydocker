<%@page import="com.follett.fsc.destiny.session.cataloging.ejb.AssetTemplateAEDSpecs"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.SiteConfigBaseForm" %> 
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.SiteConfigCircForm" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.FineSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.SiteConfigurationBaseForm"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>


<jsp:include page="/circulation/setsound.jsp" />

<%
    SiteConfigCircForm form = (SiteConfigCircForm)request.getAttribute(SiteConfigCircForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    boolean canDoPatron = store.canDo(Permission.BACK_OFFICE_CHANGE_SITE_PREFERENCES_PATRON);
    boolean canDoAsset = store.canDo(Permission.BACK_OFFICE_CHANGE_SITE_PREFERENCES_ASSET);
    boolean canDoTextbook = store.canDo(Permission.BACK_OFFICE_CHANGE_SITE_PREFERENCES_TEXTBOOK);
    boolean canDoLibrary = store.canDo(Permission.BACK_OFFICE_CHANGE_SITE_PREFERENCES);
    boolean isInternationalProduct = LocaleHelper.isInternationalProduct();
%>

<bean:define id="labelOptions" name="<%= SiteConfigCircForm.FORM_NAME %>" property="<%= SiteConfigCircForm.FIELD_DEFAULT_USER_DEFINED_LABEL_OPTIONS %>"/>
<bean:define id="libraryLoanPeriodTypeOptions" name="<%= SiteConfigCircForm.FORM_NAME %>" property="<%= SiteConfigCircForm.FIELD_LIBRARY_LOAN_PERIOD_TYPE_OPTIONS %>"/>
<bean:define id="deliveryMethods" name="<%= SiteConfigCircForm.FORM_NAME %>" property="deliveryOptions"/>

<base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handlesiteconfigcircform.do">

<script language="JavaScript" type="text/javascript">
<!--
    function selectedAssetCreateFinesUsingAssetReplacementPrice() {
        // User selected "Create fines using replacement price from asset". When this button is selected, the depreciated value cannot
        // be used for the fine amount. Uncheck and disable the checkbox, and gray out the text for the choice.
        document.<%=SiteConfigCircForm.FORM_NAME%>.<%=SiteConfigCircForm.FIELD_ASSET_PRORATE_FINE_AMT_BASED_ON_DEPR_VAL%>.checked = false;
        document.<%=SiteConfigCircForm.FORM_NAME%>.<%=SiteConfigCircForm.FIELD_ASSET_PRORATE_FINE_AMT_BASED_ON_DEPR_VAL%>.disabled = true;
        document.getElementById("<%=SiteConfigCircForm.ID_ASSET_PRORATE_FINE_AMT_BASED_ON_DEPR_VAL_TEXT%>").style.color = "gray";
    }

    function selectedAssetCreateFinesUsingItemPurchasePrice() {
        // User selected "Create fines using purchase price from item". When this button is selected, then depreciated value
        // can be used for the fine amount. Enable the checkbox and change the color back to black on the text for the choice.
        document.<%=SiteConfigCircForm.FORM_NAME%>.<%=SiteConfigCircForm.FIELD_ASSET_PRORATE_FINE_AMT_BASED_ON_DEPR_VAL%>.disabled = false;
        document.getElementById("<%=SiteConfigCircForm.ID_ASSET_PRORATE_FINE_AMT_BASED_ON_DEPR_VAL_TEXT%>").style.color = "black";
    }
// -->
</script>

<html:hidden property="<%=SiteConfigCircForm.FIELD_LIBRARY_LOAN_PERIOD_TYPE_ORIGINAL%>"/>

<base:outlinedTableAndTabsWithinThere id="<%=SiteConfigCircForm.TABLE_MAIN%>"  borderColor="#C0C0C0" selectedTabID="<%=SiteConfigBaseForm.ID_TAB_CIRCULATION %>" selectedTab='<%=MessageHelper.formatMessage("siteconfigbase_TabCirculation") %>' tabs="<%=form.getTabs()%>"  width="100%">
    <c:set var="lineNeeded" value="false"/>
    <c:set var="saveButtonNeeded" value="true"/>
    <c:choose>
        <c:when test="<%=canDoLibrary && store.isLibraryProductSupported() && !store.isMediaBookingUser() && !store.isAtDistrictWarehouse()%>">
            <tr>
                <td class="TableHeading" valign="top"><%=MessageHelper.formatMessage("siteconfigcirc_LibraryOptions") %></td>
                <c:if test="${saveButtonNeeded}">
                    <td class="ColRowBold tdAlignRight">
                        <base:showHideTag id="onSave">
                            <base:saveButton onclick="hideElementonSave()"/>
                        </base:showHideTag>
                    </td>
                    <c:set var="saveButtonNeeded" value="false"/>
                </c:if>
            </tr>    
            <c:set var="lineNeeded" value="true"/>
            <tr>
                <td class="ColRowBold" colspan="2">
                    <html:checkbox property="<%=SiteConfigCircForm.FIELD_ALLOW_CIRC_TO_ALL_PATRONS%>"><%=MessageHelper.formatMessage("siteconfigcirc_AllowLibraryMaterialsToCirculateToAllPatronsInThe") %></html:checkbox>
                    <base:helpTag helpFileName="d_allow_to_circ_LM.htm"/>
                </td>
            </tr>
           <tr>
            <td class="ColRow" colspan="2">
                &nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox 
                property="<%=SiteConfigCircForm.FIELD_CIRC_ALLOW_LIB_RENEWS %>"/>
                    <%=MessageHelper.formatMessage("siteconfigcirc_AllowLibraryMaterialsToBeRenewedAtTheBorrowingSite") %>
                <base:helpTag helpFileName="d_allow_renewals_LM.htm"/>
            </td>
          </tr>
          <tr>
            <td class="ColRowBold" colspan="2"><%=MessageHelper.formatMessage("siteconfigcirc_CalculateLibraryLoanPeriodsBasedOn") + "&nbsp;"%><html:select property="<%= SiteConfigCircForm.FIELD_LIBRARY_LOAN_PERIOD_TYPE %>">
                        <html:options collection="libraryLoanPeriodTypeOptions" property="longID" labelProperty="stringDesc"/>
                    </html:select>
                <%= MessageHelper.formatMessage("siteconfigcirc_Days") %>
                <base:helpTag helpFileName="d_calculate_loan_periods_LM.htm"/>
            </td>
          </tr>
          
        <tr>
            <td class="ColRowBold">
                <html:checkbox property="<%=SiteConfigCircForm.FIELD_AUTO_CALC_FINES%>"><%=MessageHelper.formatMessage("siteconfigcirc_AutomaticallyCalculateFinesForOverdueItems") %></html:checkbox>
                <base:helpTag helpFileName="d_calculate_overdue_fines_LM.htm"/>
            </td>
        </tr>
         <tr>
            <td class="ColRowBold"> 
                <html:checkbox property="<%=SiteConfigCircForm.FIELD_REQUIRE_WAIVE_LIBRARY_FINE_NOTE%>"><%=MessageHelper.formatMessage("siteconfigcirc_RequireExplanationWhenWaivingLibraryFine") %></html:checkbox>
                <base:helpTag helpFileName="d_explain_waive_fine.htm"/>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold"> 
                <html:checkbox property="<%=SiteConfigCircForm.FIELD_REQUIRE_REFUND_LIBRARY_FINE_NOTE%>"><%=MessageHelper.formatMessage("siteconfigcirc_RequireExplanationWhenIssuingLibraryRefunds")%></html:checkbox>
                <base:helpTag helpFileName="d_explain_refund.htm"/>
            </td>
        </tr>
        
        <tr>
            <td class="ColRowBold"> 
                <html:checkbox property="<%=SiteConfigCircForm.FIELD_AUTO_CREATE_LOST_FINE_LIBRARY%>"><%=MessageHelper.formatMessage("siteconfigcirc_AutomaticallyCreateFineForLostLibraryMaterials") %></html:checkbox>
                <base:helpTag helpFileName="d_automatically_create_fine_for_lost_LM.htm"/>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold"> 
                <html:checkbox property="<%=SiteConfigCircForm.FIELD_REFUND_DAYS_LIBRARY_CHECKBOX%>"><%=MessageHelper.formatMessage("siteconfigcirc_LostLibraryMaterialsMustBeReturnedInATimelyFashionToGenerateARefund") %></html:checkbox>
                <base:helpTag helpFileName="d_lost_library_materials_refund_LM.htm"/>
            </td>
        </tr>
        <tr>
            <td class="ColRow"> 
                &nbsp;&nbsp;&nbsp;&nbsp;<%=MessageHelper.formatMessage("siteconfigcirc_CalendarDaysFromDateLostBeforeAPaidLibraryFineBecomesNonRefundable") %>&nbsp;
                <html:text property="<%=SiteConfigCircForm.FIELD_REFUND_DAYS_LIBRARY%>" size="3" maxlength="3"/>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold"> 
               <html:checkbox property="<%=SiteConfigCircForm.FIELD_DISPLAY_TITLEPEEK_IN_CHECKOUT_CHECKOUT%>"><%=MessageHelper.formatMessage("siteconfigcirc_DisplayTitlepeekInCheckoutInCheckout") %></html:checkbox>
                 <base:helpTag helpFileName="d_LM_titlepeek_site_config_chkout.htm"/>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold"> 
               <html:checkbox property="<%=SiteConfigCircForm.FIELD_DISPLAY_TITLEPEEK_IN_CHECKOUT_ITEMS_OUT%>"><%=MessageHelper.formatMessage("siteconfigcirc_DisplayTitlepeekInCheckoutInItemsOut") %></html:checkbox>
                 <base:helpTag helpFileName="d_LM_titlepeek_site_config_items_out.htm"/>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold"> 
               <html:checkbox property="<%=SiteConfigCircForm.FIELD_DISPLAY_TITLEPEEK_IN_CHECKIN%>"><%=MessageHelper.formatMessage("siteconfigcirc_DisplayTitlepeekInCheckin") %></html:checkbox>
                 <base:helpTag helpFileName="d_LM_titlepeek_site_config_chk_in.htm"/>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold"> 
               <html:checkbox property="<%=SiteConfigCircForm.FIELD_TURN_ON_READY_SCAN%>"><%=MessageHelper.formatMessage("siteconfigcirc_TurnOnReadyScanCheckIn") %></html:checkbox>
                 <base:helpTag helpFileName="d_LM_turn_on_ready_scan.htm"/>
            </td>
        </tr>
        
        </c:when>
        <c:otherwise>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_ALLOW_CIRC_TO_ALL_PATRONS%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_LIBRARY_LOAN_PERIOD_TYPE%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_CIRC_ALLOW_LIB_RENEWS%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_AUTO_CALC_FINES%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_REQUIRE_WAIVE_LIBRARY_FINE_NOTE%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_AUTO_CREATE_LOST_FINE_LIBRARY%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_REFUND_DAYS_LIBRARY_CHECKBOX%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_REFUND_DAYS_LIBRARY%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_REQUIRE_REFUND_LIBRARY_FINE_NOTE%>"/>
            
        </c:otherwise>
    </c:choose>

    <c:choose>
        <c:when test="<%=canDoTextbook && store.isTextbookProductSupported() && !isInternationalProduct %>">
           <c:if test="${lineNeeded}">
                <tr>
                  <td colspan="2"><base:imageLine height="3" width="100%"/></td>
                </tr>
            </c:if>
            <c:set var="lineNeeded" value="true"/>
            <tr>
                <td class="TableHeading" valign="top"><%=MessageHelper.formatMessage("siteconfigcirc_TextbookOptions") %></td>
                <c:if test="${saveButtonNeeded}">
                    <td class="ColRowBold tdAlignRight">
                        <base:showHideTag id="onSave">
                            <base:saveButton onclick="hideElementonSave()"/>
                        </base:showHideTag>
                    </td>
                    <c:set var="saveButtonNeeded" value="false"/>
                </c:if>
            </tr>
            <% if( !store.isAtDistrictWarehouse() ) { %>
            <tr>
                <td class="TableHeading2" valign="top">
                    <%=MessageHelper.formatMessage("siteconfigcirc_Circulation")%>
                </td>
            </tr>                
            <tr>
                <td class="ColRowBold" colspan="2"><%=MessageHelper.formatMessage("siteconfigcirc_AllowTextbooksToBeCheckedOut") %>&nbsp;<base:helpTag helpFileName="d_allow_textbooks_to_be_chkd_out_TM.htm"/>
                </td>
            </tr>
            <tr>
                <td class="ColRow" colspan="2">
                &nbsp;&nbsp;&nbsp;&nbsp;
                <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_ALLOW_TEXTBOOK_CIRC_TO_PATRON%>"><%=MessageHelper.formatMessage("siteconfigcirc_ToPatron") %></html:checkbox>
                </td>
            </tr>
            <tr>
                <td class="ColRow" colspan="2">
                &nbsp;&nbsp;&nbsp;&nbsp;
                <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_ALLOW_TEXTBOOK_CIRC_TO_CLASS%>"><%=MessageHelper.formatMessage("siteconfigcirc_ByClass") %></html:checkbox>
                </td>
            </tr>
            <tr>
                <td class="ColRow" colspan="2">
                &nbsp;&nbsp;&nbsp;&nbsp;
                <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_ALLOW_TEXTBOOK_CIRC_TO_TEACHER%>"><%=MessageHelper.formatMessage("siteconfigcirc_ToTeacher") %></html:checkbox>
                </td>
            </tr>
            <tr>
                <td class="ColRowBold" colspan="2">
                    <html:checkbox property="<%=SiteConfigCircForm.FIELD_ALLOW_TEXTBOOK_CONSUMABLE_CHECKOUT%>"><%=MessageHelper.formatMessage("siteconfigcirc_AllowConsumableTextbooksToBeCheckedOut")%></html:checkbox>
                    <base:helpTag helpFileName="d_allow_consumable_checkouts.htm"/>
                </td>
            </tr>
            <tr>
                <td class="ColRowBold" colspan="2">
                    <html:checkbox property="<%=SiteConfigCircForm.FIELD_ALLOW_TEXTBOOK_CHECKOUT_BY_ISBN%>"><%=MessageHelper.formatMessage("siteconfigcirc_AllowTextbookCheckoutByISBN")%></html:checkbox>
                    <base:helpTag helpFileName="d_allow_checkout_by_isbn.htm"/>
                </td>
            </tr>
            <tr>
                <td class="ColRowBold" colspan="2">
                    <html:checkbox property="<%=SiteConfigCircForm.FIELD_ALLOW_TEXTBOOK_CIRC_TO_ALL_PATRONS%>"><%=MessageHelper.formatMessage("siteconfigcirc_AllowTextbooksToCirculateToAllPatronsInTheDistrict") %></html:checkbox>
                    <base:helpTag helpFileName="d_allow_to_circ_TM.htm"/>
                </td>
            </tr>
            <tr>
                <td class="ColRowBold" colspan="2">
                    <html:checkbox property="<%=SiteConfigCircForm.FIELD_ALERT_DUPLICATE_TEXTBOOK_CHECKOUT%>"><%=MessageHelper.formatMessage("siteconfigcirc_AlertDuringCheckOutIfPatronAlreadyHasCurrentCheck") %></html:checkbox>
                    <base:helpTag helpFileName="d_alert_checkout_TM.htm"/>
                </td>
            </tr>
            
            <tr>
                <td class="TableHeading2" valign="top">
                    <%=MessageHelper.formatMessage("siteconfigcirc_Fines")%>
                </td>
            </tr>                
            <tr>
                <td class="ColRowBold">
                    <%if ( !store.isStateRepositoryRunning() ) { %> 
                        <html:checkbox property="<%=SiteConfigCircForm.FIELD_AUTO_CREATE_LOST_FINE_TEXTBOOK%>">
                             <%=MessageHelper.formatMessage("siteconfigcirc_AutomaticallyCreateFineForLostTextbookMaterials")%>
                        </html:checkbox>
                        <base:helpTag helpFileName="d_automatically_create_fine_for_lost_TM.htm"/>
                    <% } else { %>
                        <html:hidden property="<%=SiteConfigCircForm.FIELD_AUTO_CREATE_LOST_FINE_TEXTBOOK%>" value="true"/>
                    <% } %>
                </td>
            </tr>
            <tr>
                <td class="ColRowBold" colspan="2">
                    <%=MessageHelper.formatMessage("siteconfigcirc_CreateFinesUsing")%>&nbsp;<base:helpTag helpFileName="d_create_fines_TM.htm"/>
                </td>
            </tr>
            <tr>
                <td class="ColRow" colspan="2">
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <html:radio property="<%=SiteConfigCircForm.FIELD_CREATE_FINES_USING%>" value="<%=SiteConfigCircForm.RADIO_CREATE_FINES_USING_REPLACEMENT_PRICE_FROM_TITLE%>">
                        <%=MessageHelper.formatMessage("siteconfigcirc_ReplacementPriceFromTitle")%>
                    </html:radio>
                </td>
            </tr>
            <tr>
                <td class="ColRow" colspan="2">
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <html:radio property="<%=SiteConfigCircForm.FIELD_CREATE_FINES_USING%>" value="<%=SiteConfigCircForm.RADIO_CREATE_FINES_USING_PURCHASE_PRICE_FROM_COPY%>">
                        <%=MessageHelper.formatMessage("siteconfigcirc_PurchasePriceFromCopy")%>
                    </html:radio>
                </td>
            </tr>
            <tr>
                <td class="ColRowBold" colspan="2">
                    <html:checkbox property="<%=SiteConfigCircForm.FIELD_PRORATE_FINE_AMT_BASED_ON_CPY_COND%>">
                        <%=MessageHelper.formatMessage("siteconfigcirc_ProrateFineAmountBasedOnCopyCondition")%>
                    </html:checkbox>
                    <base:helpTag helpFileName="d_prorate_fine_TM.htm"/>
                </td>
            </tr>
            <tr>
                <td class="ColRowBold"> 
                    <html:checkbox property="<%=SiteConfigCircForm.FIELD_REFUND_DAYS_TEXTBOOK_CHECKBOX%>">&quot;Lost&quot; textbook materials must be returned in a timely fashion to generate a refund</html:checkbox>
                    <base:helpTag helpFileName="d_lost_library_materials_refund_TM.htm"/>
                </td>
            </tr>
            <tr>
                <td class="ColRow"> 
                    &nbsp;&nbsp;&nbsp;&nbsp;Calendar days from date &quot;lost&quot; before a paid textbook fine becomes non-refundable:&nbsp;
                    <html:text property="<%=SiteConfigCircForm.FIELD_REFUND_DAYS_TEXTBOOK%>" size="3" maxlength="3"/>
                </td>
            </tr>
            
        
             <tr>
                <td class="ColRowBold">
                    <html:checkbox property="<%=SiteConfigCircForm.FIELD_REQUIRE_WAIVE_TEXTBOOK_FINE_NOTE%>"><%= MessageHelper.formatMessage("siteconfigcirc_RequireExplanationWhenWaivingTextbookFine") %></html:checkbox>
                    <base:helpTag helpFileName="d_explain_waive_fine.htm"/>
                </td>
            </tr>
            
            <tr>
                <td class="ColRowBold"> 
                    <html:checkbox property="<%=SiteConfigCircForm.FIELD_REQUIRE_REFUND_TEXTBOOK_FINE_NOTE%>"><%=MessageHelper.formatMessage("siteconfigcirc_RequireExplanationWhenIssuingTextbookRefunds")%></html:checkbox>
                    <base:helpTag helpFileName="d_explain_refund.htm"/>
                </td>
            </tr>        
            <% } else { %>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_ALLOW_TEXTBOOK_CIRC_TO_ALL_PATRONS%>"/>        
            <html:hidden property="<%=SiteConfigurationBaseForm.FIELD_ALLOW_TEXTBOOK_CIRC_TO_PATRON%>"/>
            <html:hidden property="<%=SiteConfigurationBaseForm.FIELD_ALLOW_TEXTBOOK_CIRC_TO_CLASS%>"/>
            <html:hidden property="<%=SiteConfigurationBaseForm.FIELD_ALLOW_TEXTBOOK_CIRC_TO_TEACHER%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_ALLOW_TEXTBOOK_CONSUMABLE_CHECKOUT%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_ALERT_DUPLICATE_TEXTBOOK_CHECKOUT%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_AUTO_CREATE_LOST_FINE_TEXTBOOK%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_REFUND_DAYS_TEXTBOOK_CHECKBOX%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_REFUND_DAYS_TEXTBOOK%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_REQUIRE_WAIVE_TEXTBOOK_FINE_NOTE%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_REQUIRE_REFUND_TEXTBOOK_FINE_NOTE%>"/>        
            <% } %>
            
            <tr>
                <td class="TableHeading2" valign="top">
                    <%=MessageHelper.formatMessage("siteconfigcirc_FollettClassicPrefix")%>
                </td>
            </tr>                
            <tr>
                <td class="ColRowBold" colspan="2">
                    <html:checkbox property="<%=SiteConfigCircForm.FIELD_PREFERRED_FOLLET_CLASSIC_TO_T%>"><%=MessageHelper.formatMessage("siteconfigcirc_SetPreferredFollettClassicTextbook") %></html:checkbox>
                    <base:helpTag helpFileName="d_set_preferred_follett_classic_TM.htm"/>
                </td>
            </tr>
        </c:when>
        <c:otherwise>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_ALLOW_TEXTBOOK_CIRC_TO_ALL_PATRONS%>"/>        
            <html:hidden property="<%=SiteConfigurationBaseForm.FIELD_ALLOW_TEXTBOOK_CIRC_TO_PATRON%>"/>
            <html:hidden property="<%=SiteConfigurationBaseForm.FIELD_ALLOW_TEXTBOOK_CIRC_TO_CLASS%>"/>
            <html:hidden property="<%=SiteConfigurationBaseForm.FIELD_ALLOW_TEXTBOOK_CIRC_TO_TEACHER%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_ALLOW_TEXTBOOK_CONSUMABLE_CHECKOUT%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_ALERT_DUPLICATE_TEXTBOOK_CHECKOUT%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_AUTO_CREATE_LOST_FINE_TEXTBOOK%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_REFUND_DAYS_TEXTBOOK_CHECKBOX%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_REFUND_DAYS_TEXTBOOK%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_REQUIRE_WAIVE_TEXTBOOK_FINE_NOTE%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_PREFERRED_FOLLET_CLASSIC_TO_T%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_REQUIRE_REFUND_TEXTBOOK_FINE_NOTE%>"/>        
        </c:otherwise>
    </c:choose>
    
    <c:choose>
        <c:when test="<%=canDoAsset && store.isAssetSite() && !isInternationalProduct && !store.isAtDistrictWarehouse()%>">
            <c:if test="${lineNeeded}">
             <tr>
                <td colspan="2"><base:imageLine height="3" width="100%"/></td>
            </tr>
            </c:if>
            <c:set var="lineNeeded" value="true"/>
            <tr>
                <td class="TableHeading" valign="top"><%=MessageHelper.formatMessage("siteconfigcirc_AssetOptions") %></td>
                <c:if test="${saveButtonNeeded}">
                    <td class="ColRowBold tdAlignRight">
                        <base:showHideTag id="onSave">
                            <base:saveButton onclick="hideElementonSave()"/>
                        </base:showHideTag>
                    </td>
                    <c:set var="saveButtonNeeded" value="false"/>
                </c:if>
            </tr>
            
            <tr>
                <td class="ColRowBold" colspan="2"> 
                    <html:checkbox property="<%=SiteConfigCircForm.FIELD_ALLOW_CONSUMABLE_RESOURCES_TO_CHECKOUT%>"><%=MessageHelper.formatMessage("siteconfigcirc_AllowConsumableResourcesCheckout") %></html:checkbox>
                    <base:helpTag helpFileName="d_allow_consumable_chkout_rm.htm"/>
                </td>
            </tr>
            <tr>
                <td class="ColRowBold" colspan="2"> 
                    <html:checkbox property="<%=SiteConfigCircForm.FIELD_ALLOW_UNBARCODED_RESOURCES_TO_CHECKOUT%>"><%=MessageHelper.formatMessage("siteconfigcirc_AllowUnbarcodedResourcesCheckout") %></html:checkbox>
                    <base:helpTag helpFileName="d_allow_unbarcoded_chkout_rm.htm"/>
                </td>
            </tr>
            <tr>
                <td class="ColRowBold" colspan="2">
                    <html:checkbox property="<%=SiteConfigCircForm.FIELD_ALLOW_ASSET_CIRC_TO_ALL_PATRONS%>"><%=MessageHelper.formatMessage("siteconfigcirc_AllowAssetsToCirculateToAnyPatronDepartmentLocatio") %></html:checkbox>
                    <base:helpTag helpFileName="d_allow_to_circ_AM.htm"/>
                    
                </td>
            </tr>
            <tr>
                <td class="ColRowBold" colspan="2">
                    <html:checkbox property="<%=SiteConfigCircForm.FIELD_ALERT_DUPLICATE_ASSET_CHECKOUT%>"><%=MessageHelper.formatMessage("siteconfigcirc_AlertDuringCheckOutIfPatronHasCurrentResourceCheckedOut") %></html:checkbox>
                    <base:helpTag helpFileName="d_alert_checkout_rm.htm"/>
                </td>
            </tr>
            <tr>
                <td class="ColRowBold" colspan="2">
                    <html:checkbox property="<%=SiteConfigCircForm.FIELD_ALLOW_OTHER_SITES_LICENSE_ASSIGN%>"><%=MessageHelper.formatMessage("siteconfigcirc_AllowOtherSitesToAssignThisSitesSoftwareLicensesTo") %></html:checkbox>
                </td>
            </tr>
            <tr>
                <td class="ColRowBold"> 
                    <html:checkbox property="<%=SiteConfigCircForm.FIELD_AUTO_CREATE_LOST_FINE_ASSET%>"><%=MessageHelper.formatMessage("siteconfigcirc_AutomaticallyCreateFineForLostAssets") %></html:checkbox>
                    <base:helpTag helpFileName="d_automatically_create_fine_for_lost_AM.htm"/>
                </td>
            </tr>            
            <tr>
                <td class="ColRowBold" colspan="2">
                    <%=MessageHelper.formatMessage("siteconfigcirc_CreateFinesUsing")%>&nbsp;<base:helpTag helpFileName="d_create_fines_AM.htm"/>
                </td>
            </tr>
            <tr>
                <td class="ColRow" colspan="2">
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <html:radio property="<%=SiteConfigCircForm.FIELD_ASSET_CREATE_FINES_USING%>" value="<%=SiteConfigCircForm.RADIO_ASSET_CREATE_FINES_USING_REPLACEMENT_PRICE_FROM_ASSET%>"
                        onclick="selectedAssetCreateFinesUsingAssetReplacementPrice()">
                        <%=MessageHelper.formatMessage("siteconfigcirc_ReplacementPriceFromAsset")%>
                    </html:radio>
                </td>
            </tr>
            <tr>
                <td class="ColRow" colspan="2">
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <html:radio property="<%=SiteConfigCircForm.FIELD_ASSET_CREATE_FINES_USING%>" value="<%=SiteConfigCircForm.RADIO_ASSET_CREATE_FINES_USING_PURCHASE_PRICE_FROM_ITEM%>"
                        onclick="selectedAssetCreateFinesUsingItemPurchasePrice()">
                        <%=MessageHelper.formatMessage("siteconfigcirc_PurchasePriceFromItem")%>
                    </html:radio>
                </td>
            </tr>
            <tr>
                <td class="ColRowBold" colspan="2">
                    <% if (form.getAssetCreateFinesUsing() == FineSpecs.CREATE_FINES_USING_REPLACEMENT_PRICE_FROM_RESOURCE) { %>
                        <html:checkbox disabled="true" property="<%=SiteConfigCircForm.FIELD_ASSET_PRORATE_FINE_AMT_BASED_ON_DEPR_VAL%>">
                            <span id="<%=SiteConfigCircForm.ID_ASSET_PRORATE_FINE_AMT_BASED_ON_DEPR_VAL_TEXT%>" style="color:gray">
                                <%=MessageHelper.formatMessage("siteconfigcirc_ProrateFineAmountBasedOnDepreciatedValue")%>
                            </span>
                        </html:checkbox>
                    <% } else { %>
                        <html:checkbox property="<%=SiteConfigCircForm.FIELD_ASSET_PRORATE_FINE_AMT_BASED_ON_DEPR_VAL%>">
                            <span id="<%=SiteConfigCircForm.ID_ASSET_PRORATE_FINE_AMT_BASED_ON_DEPR_VAL_TEXT%>">
                                <%=MessageHelper.formatMessage("siteconfigcirc_ProrateFineAmountBasedOnDepreciatedValue")%>
                            </span>
                        </html:checkbox>
                    <% } %>
                    <base:helpTag helpFileName="d_prorate_fine_AM.htm"/>
                </td>
            </tr>
            <tr>
                <td class="ColRowBold"> 
                    <html:checkbox property="<%=SiteConfigCircForm.FIELD_REQUIRE_WAIVE_ASSET_FINE_NOTE%>"><%=MessageHelper.formatMessage("siteconfigcirc_RequireExplanationWhenWaivingAssetFine") %></html:checkbox>
                    <base:helpTag helpFileName="d_explain_waive_fine.htm"/>
                </td>
            </tr>            
            <tr>
                <td class="ColRowBold"> 
                    <html:checkbox property="<%=SiteConfigCircForm.FIELD_REQUIRE_REFUND_ASSET_FINE_NOTE%>"><%=MessageHelper.formatMessage("siteconfigcirc_RequireExplanationWhenIssuingAssetRefunds") %></html:checkbox>
                    <base:helpTag helpFileName="d_explain_refund.htm"/>
                </td>
            </tr>            
        <% if(AssetTemplateAEDSpecs.isAllowResourceManagerTextbooks()) { %>
            <tr>
                <td class="ColRowBold"> 
                    <html:checkbox property="<%=SiteConfigCircForm.FIELD_REFUND_DAYS_RESOURCE_TEXTBOOK_CHECKBOX%>">&quot;Lost&quot; textbook resources must be returned in a timely fashion to generate a refund</html:checkbox>
                    <base:helpTag helpFileName="d_lost_library_materials_refund_rm.htm"/>
                </td>
            </tr>
            <tr>
                <td class="ColRow"> 
                    &nbsp;&nbsp;&nbsp;&nbsp;Calendar days from date &quot;lost&quot; before a paid textbook resource fine becomes non-refundable:&nbsp;
                    <html:text property="<%=SiteConfigCircForm.FIELD_REFUND_DAYS_RESOURCE_TEXTBOOK%>" size="3" maxlength="3"/>
                </td>
            </tr>
        <% } else { %>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_REFUND_DAYS_RESOURCE_TEXTBOOK_CHECKBOX%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_REFUND_DAYS_RESOURCE_TEXTBOOK%>"/>
        <% } %>
        </c:when>
        <c:otherwise>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_ALLOW_ASSET_CIRC_TO_ALL_PATRONS%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_ALERT_DUPLICATE_ASSET_CHECKOUT%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_ALLOW_OTHER_SITES_LICENSE_ASSIGN%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_AUTO_CREATE_LOST_FINE_ASSET%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_REQUIRE_WAIVE_ASSET_FINE_NOTE%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_REQUIRE_REFUND_ASSET_FINE_NOTE%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_REFUND_DAYS_RESOURCE_TEXTBOOK_CHECKBOX%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_REFUND_DAYS_RESOURCE_TEXTBOOK%>"/>
        </c:otherwise>
    </c:choose>
    
    <c:if test="${lineNeeded}">
        <tr>
            <td colspan="2"><base:imageLine height="3" width="100%"/></td>
        </tr>
    </c:if>

    <c:choose>
        <c:when test="<%=canDoPatron && !store.isAtDistrictWarehouse()%>">
            <tr>
                <td class="TableHeading" valign="top"><%=MessageHelper.formatMessage("siteconfigcirc_Patrons") %></td>
                <c:if test="${saveButtonNeeded}">
                    <td class="ColRowBold tdAlignRight">
                        <base:showHideTag id="onSave">
                            <base:saveButton onclick="hideElementonSave()"/>
                        </base:showHideTag>
                    </td>
                    <c:set var="saveButtonNeeded" value="false"/>
                </c:if>
            </tr>
            <tr>
                <td class="ColRowBold" colspan="2">
                    <html:checkbox property="<%=SiteConfigCircForm.FIELD_DISPLAY_PICTURES%>"><%=MessageHelper.formatMessage("siteconfigcirc_DisplayPatronPictures") %></html:checkbox>
                </td>
            </tr>
            <tr>
                <td class="Instruction" colspan="2">
                    <c:choose>
                        <c:when test="<%=!store.isMediaBookingUser() %>">
                           <%=MessageHelper.formatMessage("siteconfigcirc_SelectThisOptionIfYouWouldLikePatronPicturesToAppear") %> 
                        </c:when>
                        <c:otherwise>
                            <%=MessageHelper.formatMessage("siteconfigcirc_SelectThisOptionIfYouWouldLikePatronPicturesAppearCirculation") %>
                        </c:otherwise>
                    </c:choose>
                </td>
            </tr>
            <tr>
                <td colspan="2"><base:imageLine height="1" width="100%"/></td>
            </tr>
            <tr>
                <td class="ColRowBold"><html:checkbox
                    property="<%=SiteConfigCircForm.FIELD_ALLOW_CREATE_OWN_LOGIN%>">
                        <%=MessageHelper.formatMessage("siteconfigcirc_AllowPatronsToCreateTheirUserNameAndPassword") %>
                    </html:checkbox>
                    &nbsp;<base:helpTag
                        helpFileName="d_patrons_create_their_username_pswrd.htm" />
                </td>
            </tr>
            <tr>
                <td colspan="2"><base:imageLine height="3" width="100%" /></td>
            </tr>
        </c:when>
        <c:otherwise>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_DISPLAY_PICTURES%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_ALLOW_CREATE_OWN_LOGIN%>"/>
        </c:otherwise>
    </c:choose>

    
    <c:choose>
        <c:when test="<%=canDoLibrary && store.isLibraryProductSupported() && !store.isAtDistrictWarehouse()%>">
            <tr>
                <td colspan="2">
                        <c:choose>
                            <c:when test="<%=!store.isMediaSite()%>">
                                <table id="<%=SiteConfigCircForm.TABLE_CIRC_CALCULATIONS_FINES%>" cellpadding="5">
                                <html:hidden property="<%=SiteConfigCircForm.FIELD_LOAN_PERIOD_BASED_ON%>"/>
                                <html:hidden property="<%=SiteConfigCircForm.FIELD_OVERDUE_TO_LOST_ENABLE_MEDIA%>"/>
                                </table>                                
                                <table id="<%=SiteConfigCircForm.TABLE_CIRC_CALCULATIONS_HOLDILL%>" cellpadding="5">
                                <tr>
                                    <td class="TableHeading" valign="top"><%=MessageHelper.formatMessage("siteconfigcirc_HoldsReserves") %></td>
                                    <c:if test="${saveButtonNeeded}">
                                        <td class="ColRowBold tdAlignRight">
                                            <base:showHideTag id="onSave">
                                                <base:saveButton onclick="hideElementonSave()"/>
                                            </base:showHideTag>
                                        </td>
                                        <c:set var="saveButtonNeeded" value="false"/>
                                    </c:if>
                                </tr>
                                <tr>
                                    <td class="ColRowBold"><%=MessageHelper.formatMessage("siteconfigcirc_ReadyReservations") %>&nbsp;<html:text property="<%=SiteConfigCircForm.FIELD_RESERVE_LEAD_TIME_IN_DAYS%>" size="2" maxlength="2"/>&nbsp;<%=MessageHelper.formatMessage("siteconfigcirc_OpenDaysInAdvanceOfTheRequested") %>
                                        <base:helpTag helpFileName="d_ready_reservations.htm"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="ColRowBold">
                                        <html:checkbox property="<%=SiteConfigCircForm.FIELD_DELETE_EXPIRED_HOLDS%>"><%=MessageHelper.formatMessage("siteconfigcirc_AutomaticallyDeleteExpiredHoldsAfter") %></html:checkbox>&nbsp;
                                        <html:text property="<%=SiteConfigCircForm.FIELD_DELETE_DAYS%>" size="2" maxlength="2"/>&nbsp;<%=MessageHelper.formatMessage("siteconfigcirc_CalendarDays") %>
                                        <base:helpTag helpFileName="d_automatically_delete_expired_holds_LM.htm"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="ColRowBold"><%=MessageHelper.formatMessage("siteconfigcirc_SetTheDefaultInterlibraryLoanDeliveryMethodTo") %>&nbsp;<html:select property="<%=SiteConfigCircForm.FIELD_DELIVERY_METHOD_TYPE_ILL%>" value ="<%=form.getDefaultILLdeliveryMethod()%>">
                                            <html:options collection="deliveryMethods" property="value" labelProperty="desc"/>
                                        </html:select>
                                        <base:helpTag helpFileName="d_default_interlibrary_loan_delivery_method.htm"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="ColRowBold">
                                        <html:checkbox property="<%=SiteConfigCircForm.FIELD_DAILY_EMAIL_REMINDER%>"><%=MessageHelper.formatMessage("siteconfigcirc_EnableOnceDailyEmailReminderForHoldsIll") %></html:checkbox>
                                    </td>
                                </tr>
                                 <tr>
                                    <td>
                                        <span class="ColRowBold" style="margin-left:35px"><%=MessageHelper.formatMessage("siteconfigcirc_EmailAddress")%>&nbsp;<html:text property="<%=SiteConfigCircForm.FIELD_DAILY_EMAIL_ADDRESSES%>" size="55" maxlength="200"/></span>
                                        <br/>
                                       <span class="Instruction" style="margin-left:150px"><%=MessageHelper.formatMessage("siteconfigcirc_AddMultipleAddressesByUsingSemicolon")%></span>
                                    </td>
                                </tr>
                                </table>
                            </c:when>
                            <c:otherwise>
                                <table id="<%=SiteConfigCircForm.TABLE_CIRC_CALCULATIONS_HOLDILL%>" cellpadding="5">
                                <html:hidden property="<%=SiteConfigCircForm.FIELD_RESERVE_LEAD_TIME_IN_DAYS%>"/>
                                <tr>
                                    <td class="TableHeading" valign="top"><%=MessageHelper.formatMessage("siteconfigcirc_HoldsReserves") %></td>
                                    <c:if test="${saveButtonNeeded}">
                                        <td class="ColRowBold tdAlignRight">
                                            <base:showHideTag id="onSave">
                                                <base:saveButton onclick="hideElementonSave()"/>
                                            </base:showHideTag>
                                        </td>
                                        <c:set var="saveButtonNeeded" value="false"/>
                                    </c:if>
                                </tr>
                                <tr>
                                    <td class="ColRowBold"><%=MessageHelper.formatMessage("siteconfigcirc_CalculateLoanPeriodsBasedOn") %>&nbsp;<html:select property="<%= SiteConfigCircForm.FIELD_LOAN_PERIOD_BASED_ON%>">
                                                 <html:option value="<%=String.valueOf(SiteConfigCircForm.OPTION_CALENDAR_DAYS)%>"><%=MessageHelper.formatMessage("siteconfigcirc_Calendar") %></html:option>
                                                 <html:option value="<%=String.valueOf(SiteConfigCircForm.OPTION_OPEN_DAYS)%>"><%=MessageHelper.formatMessage("siteconfigcirc_Open") %></html:option>
                                         </html:select>
                                         &nbsp;<%=MessageHelper.formatMessage("siteconfigcirc_Days")%>
                                         <base:helpTag helpFileName="d_calculate_loan_periods_MM.htm"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="ColRowBold">
                                        <html:checkbox property="<%=SiteConfigCircForm.FIELD_DELETE_EXPIRED_HOLDS%>"><%=MessageHelper.formatMessage("siteconfigcirc_AutomaticallyDeleteExpiredBookingsAfter") %></html:checkbox>&nbsp;
                                        <html:text property="<%=SiteConfigCircForm.FIELD_DELETE_DAYS%>" size="2" maxlength="2"/>&nbsp;<%=MessageHelper.formatMessage("siteconfigcirc_CalendarDays") %></td>
                                </tr>
                                <tr>
                                    <td class="ColRowBold">
                                        <html:checkbox property="<%=SiteConfigCircForm.FIELD_OVERDUE_TO_LOST_ENABLE_MEDIA%>"><%=MessageHelper.formatMessage("siteconfigcirc_MakeOverdueCopiesLostAfter") %></html:checkbox>&nbsp;
                                        <html:text property="<%=SiteConfigCircForm.FIELD_OVERDUE_TO_LOST_DAYS_MEDIA%>" size="3" maxlength="3"/>&nbsp;<%=MessageHelper.formatMessage("siteconfigcirc_CalendarDays") %>&nbsp;<base:helpTag helpFileName="d_overrdue_lost.htm"/>
                                    </td>
                                </tr>
                                
                                <tr>
                                    <td class="ColRowBold">
                                        <html:checkbox property="<%=SiteConfigCircForm.FIELD_ENABLE_CEILING_DATE%>"><%=MessageHelper.formatMessage("siteconfigcirc_EnableCeilingDateOf") %></html:checkbox>&nbsp;
                                  <base:date 
                                        buttonName = "<%=SiteConfigCircForm.BUTTON_CHANGE_CEILING_DATE%>"
                                        fieldName = "<%=SiteConfigCircForm.FIELD_CEILING_DUE_DATE%>"
                                        dateValue="<%=form.getReservesCeilingDate()%>"
                                        altText = '<%= MessageHelper.formatMessage("siteconfigcirc_ChangeCeilingDate") %>'
                                    />
                                  </td>
                               </tr>   
                                                            
                                </table>
                            </c:otherwise>
                        </c:choose>
                </td>
            </tr>
            <tr>
                <td colspan="2"><base:imageLine height="3" width="100%"/></td>
            </tr>                        
        </c:when>
        <c:otherwise>
            <c:if test="<%=store.isLibraryProductSupported()%>">
                <html:hidden property="<%=SiteConfigCircForm.FIELD_LOAN_PERIOD_BASED_ON%>"/>
            </c:if>
            
            <html:hidden property="<%=SiteConfigCircForm.FIELD_DELIVERY_METHOD_TYPE_ILL%>" value="<%=form.getDefaultILLdeliveryMethod() %>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_OVERDUE_TO_LOST_DAYS_MEDIA%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_OVERDUE_TO_LOST_ENABLE_MEDIA%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_DELETE_DAYS%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_DELETE_EXPIRED_HOLDS%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_RESERVE_LEAD_TIME_IN_DAYS%>"/>
        </c:otherwise>
    </c:choose>
    
    <%-- start symbology section --%> 
    <html:hidden property="<%=SiteConfigCircForm.FIELD_SYMBOLOGY_CHANGED%>" value=""/>    
    <tr>
        <c:if test="<%=!StringHelper.isEmpty(form.getSymbologyChanged()) %>">
            <a name="thefocus"></a>
        </c:if>
        <td class="TableHeading" colspan="2" valign="top"><%=MessageHelper.formatMessage("siteconfigcirc_PreferredBarcodeSymbologies") %>&nbsp;<base:helpTag helpFileName="d_barcode_symbologies.htm"/></td>
        <c:if test="${saveButtonNeeded}">
            <td class="ColRowBold tdAlignRight">
                <base:showHideTag id="onSave">
                    <base:saveButton onclick="hideElementonSave()"/>
                </base:showHideTag>
            </td>
            <c:set var="saveButtonNeeded" value="false"/>
        </c:if>
    </tr>    
    <tr>
        <td colspan="2">
            <table cellpadding="1" cellspacing="1" id="<%=SiteConfigCircForm.TABLE_BARCODE_SYMBOLOGIES%>">
                <c:choose>
                    <c:when test="<%=(canDoLibrary && form.getSymbologyLibrary() != Barcode.SYMBOLOGY_FOLLETT_CLASSIC)
                        || (canDoTextbook && form.getSymbologyTextbook () != Barcode.SYMBOLOGY_FOLLETT_CLASSIC)
                        || (canDoPatron && form.getSymbologyPatron () != Barcode.SYMBOLOGY_FOLLETT_CLASSIC)
                        || (canDoAsset && store.isAssetSite()) %>">
                        <tr valign="bottom">
                            <td colspan = "2">&nbsp;</td>
                            <td class = "SmallColHeading"><%=MessageHelper.formatMessage("siteconfigcirc_FixedCharacters") %></td>
                            <td class = "SmallColHeading"><%=MessageHelper.formatMessage("siteconfigcirc_TotalLength") %></td>
                            <td align = "center" class = "SmallColHeading"><%=MessageHelper.formatMessage("siteconfigcirc_Next") %></td>
                        </tr>                        
                    </c:when>
                    <c:otherwise>
                        <tr valign="bottom">
                            <td colspan = "4">&nbsp;</td>
                            <td align = "center" class = "SmallColHeading"><%=MessageHelper.formatMessage("siteconfigcirc_Next") %></td>
                        </tr>
                    </c:otherwise>
                </c:choose>
                
                <c:choose>
                    <c:when test="<%=canDoLibrary && form.isLibraryProductSupported()%>">
                        <tr>
                            <base:siteConfigSymbology formName="<%=form.FORM_NAME%>"
                                typeDescription='<%=form.isMediaBookingUser() ? MessageHelper.formatMessage("siteconfigcirc_MediaMaterials") : MessageHelper.formatMessage("siteconfigcirc_LibraryMaterials")%>'
                                optionName="<%=form.OPTION_SYMBOLOGY_LIBRARY_MATERIALS%>"
                                option="<%=form.getSymbologyLibrary()%>"
                                childOptionName="<%=form.OPTION_SYMBOLOGY_LIBRARY_MATERIALS_LENGTH%>"
                                childOption="<%=form.getSymbologyLibraryLen()%>"
                                fixedCharacters="<%=form.getSymbologyLibraryFixed()%>"
                                fixedCharactersName="<%=form.FIELD_SYMBOLOGY_LIBRARY_MATERIALS_FIXED%>"
                                nextHighestBarcode="<%=form.getNextLibraryBarcode()%>"
                            />
                        </tr>
                    </c:when>
                    <c:otherwise>
                        <html:hidden property="<%=SiteConfigCircForm.OPTION_SYMBOLOGY_LIBRARY_MATERIALS%>"/>
                        <html:hidden property="<%=SiteConfigCircForm.OPTION_SYMBOLOGY_LIBRARY_MATERIALS_LENGTH%>"/>
                        <html:hidden property="<%=SiteConfigCircForm.FIELD_SYMBOLOGY_LIBRARY_MATERIALS_FIXED%>"/>
                    </c:otherwise>
                </c:choose>

                <c:choose>
                    <c:when test="<%=canDoTextbook && form.isTextbookProductSupported() && !isInternationalProduct%>">
                        <tr>
                            <base:siteConfigSymbology formName="<%=form.FORM_NAME%>"
                                typeDescription='<%=MessageHelper.formatMessage("siteconfigcirc_Textbooks")%>'
                                optionName="<%=form.OPTION_SYMBOLOGY_TEXTBOOKS%>"
                                option="<%=form.getSymbologyTextbook()%>"
                                childOptionName="<%=form.OPTION_SYMBOLOGY_TEXTBOOKS_LENGTH%>"
                                childOption="<%=form.getSymbologyTextbookLen()%>"
                                fixedCharacters="<%=form.getSymbologyTextbookFixed()%>"
                                fixedCharactersName="<%=form.FIELD_SYMBOLOGY_TEXTBOOKS_FIXED%>"
                                nextHighestBarcode="<%=form.getNextTextbookBarcode()%>"
                            />
                        </tr>
                    </c:when>
                    <c:otherwise>
                        <html:hidden property="<%=SiteConfigCircForm.OPTION_SYMBOLOGY_TEXTBOOKS%>"/>
                        <html:hidden property="<%=SiteConfigCircForm.OPTION_SYMBOLOGY_TEXTBOOKS_LENGTH%>"/>
                        <html:hidden property="<%=SiteConfigCircForm.FIELD_SYMBOLOGY_TEXTBOOKS_FIXED%>"/>
                    </c:otherwise>
                </c:choose>

                <c:choose>
                    <c:when test="<%=canDoPatron && !store.isAtDistrictWarehouse()%>">
                        <tr>
                            <base:siteConfigSymbology formName="<%=form.FORM_NAME%>"
                                typeDescription='<%=MessageHelper.formatMessage("siteconfigcirc_Patrons")%>'
                                optionName="<%=form.OPTION_SYMBOLOGY_PATRONS%>"
                                option="<%=form.getSymbologyPatron()%>"
                                childOptionName="<%=form.OPTION_SYMBOLOGY_PATRONS_LENGTH%>"
                                childOption="<%=form.getSymbologyPatronLen()%>"
                                fixedCharacters="<%=form.getSymbologyPatronFixed()%>"
                                fixedCharactersName="<%=form.FIELD_SYMBOLOGY_PATRONS_FIXED%>"
                                nextHighestBarcode="<%=form.getNextPatronBarcode()%>"
                            />
                        </tr>
                    </c:when>
                    <c:otherwise>
                        <html:hidden property="<%=SiteConfigCircForm.OPTION_SYMBOLOGY_PATRONS%>"/>
                        <html:hidden property="<%=SiteConfigCircForm.OPTION_SYMBOLOGY_PATRONS_LENGTH%>"/>
                        <html:hidden property="<%=SiteConfigCircForm.FIELD_SYMBOLOGY_PATRONS_FIXED%>"/>
                    </c:otherwise>
                </c:choose>

                <c:choose>
                    <c:when test="<%=canDoAsset && store.isAssetSite() && !isInternationalProduct%>">
                        <tr>
                            <base:siteConfigSymbology formName="<%=form.FORM_NAME%>"
                                typeDescription='<%=MessageHelper.formatMessage("siteconfigcirc_Assets")%>'
                                optionName="<%=form.OPTION_SYMBOLOGY_ASSETS%>"
                                option="<%=form.getSymbologyAssets()%>"
                                childOptionName="<%=form.OPTION_SYMBOLOGY_ASSETS_LENGTH%>"
                                childOption="<%=form.getSymbologyAssetsLen()%>"
                                fixedCharacters="<%=form.getSymbologyAssetsFixed()%>"
                                fixedCharactersName="<%=form.FIELD_SYMBOLOGY_ASSETS_FIXED%>"
                                showClassicSymbologyOption="false"
                            />
                        </tr>
                        <tr>
                            <base:siteConfigSymbology formName="<%=form.FORM_NAME%>"
                                typeDescription='<%=MessageHelper.formatMessage("siteconfigcirc_Locations")%>'
                                optionName="<%=form.OPTION_SYMBOLOGY_LOCATIONS%>"
                                option="<%=form.getSymbologyLocations()%>"
                                childOptionName="<%=form.OPTION_SYMBOLOGY_LOCATIONS_LENGTH%>"
                                childOption="<%=form.getSymbologyLocationsLen()%>"
                                fixedCharacters="<%=form.getSymbologyLocationsFixed()%>"
                                fixedCharactersName="<%=form.FIELD_SYMBOLOGY_LOCATIONS_FIXED%>"
                                showClassicSymbologyOption="false"
                            />
                        </tr>
                    </c:when>
                    <c:otherwise>
                        <html:hidden property="<%=SiteConfigCircForm.OPTION_SYMBOLOGY_ASSETS%>"/>
                        <html:hidden property="<%=SiteConfigCircForm.OPTION_SYMBOLOGY_ASSETS_LENGTH%>"/>
                        <html:hidden property="<%=SiteConfigCircForm.FIELD_SYMBOLOGY_ASSETS_FIXED%>"/>
                        <html:hidden property="<%=SiteConfigCircForm.OPTION_SYMBOLOGY_LOCATIONS%>"/>
                        <html:hidden property="<%=SiteConfigCircForm.OPTION_SYMBOLOGY_LOCATIONS_LENGTH%>"/>
                        <html:hidden property="<%=SiteConfigCircForm.FIELD_SYMBOLOGY_LOCATIONS_FIXED%>"/>
                    </c:otherwise>
                </c:choose>
            </table>
        </td>
    </tr>
    <tr>
        <%if (!store.isAtDistrictWarehouse()) { %>
            <td colspan="2"><base:imageLine height="3" width="100%"/></td>
        <% } else { %>
            <td colspan="3"><base:imageLine height="3" width="100%"/></td>
        <% } %>
    </tr>
    <%-- end symbology section --%>
    
    <%-- start USER_DEFINED Fields section --%>
    <c:choose>
        <c:when test="<%= canDoPatron && !store.isAtDistrictWarehouse()%>">
            <tr>
                <td colspan="2">
                    <table id="<%=SiteConfigCircForm.TABLE_USER_DEFINED%>">
                        <tr>
                            <td class="TableHeading" colspan="2" valign="top"><%=MessageHelper.formatMessage("siteconfigcirc_CustomizeUserDefinedPatronFieldNames") %></td>
                            <c:if test="${saveButtonNeeded}">
                                <td class="ColRowBold tdAlignRight">
                                    <base:showHideTag id="onSave">
                                        <base:saveButton onclick="hideElementonSave()"/>
                                    </base:showHideTag>
                                </td>
                                <c:set var="saveButtonNeeded" value="false"/>
                            </c:if>
                        </tr>
                        <tr>
                            <td>
                                <span class="ColRowBold">
                                    &nbsp;&nbsp;<%=MessageHelper.formatMessage("siteconfigcirc_UserDefined1") %>&nbsp;&nbsp;
                                    <html:text property="<%=SiteConfigCircForm.FIELD_USER_DEFINED1%>" size="20" maxlength="20"/>
                                    &nbsp;&nbsp;
                                    <html:checkbox property="<%=SiteConfigCircForm.FIELD_SHOW_USER_DEFINED1%>"/>
                                </span>
                                <span class="Instruction"><%=MessageHelper.formatMessage("siteconfigcirc_DisplayInCirculationDesk") %></span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <span class="ColRowBold">&nbsp;&nbsp;<%=MessageHelper.formatMessage("siteconfigcirc_UserDefined2") %>&nbsp;&nbsp;
                                    <html:text property="<%=SiteConfigCircForm.FIELD_USER_DEFINED2%>" size="20" maxlength="20"/>
                                    &nbsp;&nbsp;
                                    <html:checkbox property="<%=SiteConfigCircForm.FIELD_SHOW_USER_DEFINED2%>"/>
                                </span>
                                <span class="Instruction"><%=MessageHelper.formatMessage("siteconfigcirc_DisplayInCirculationDesk") %></span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <span class="ColRowBold">&nbsp;&nbsp;<%=MessageHelper.formatMessage("siteconfigcirc_UserDefined3") %>&nbsp;&nbsp;
                                    <html:text property="<%=SiteConfigCircForm.FIELD_USER_DEFINED3%>" size="20" maxlength="20"/>
                                    &nbsp;&nbsp;
                                    <html:checkbox property="<%=SiteConfigCircForm.FIELD_SHOW_USER_DEFINED3%>"/>
                                </span>
                                <span class="Instruction"><%=MessageHelper.formatMessage("siteconfigcirc_DisplayInCirculationDesk") %></span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <span class="ColRowBold">&nbsp;&nbsp;<%=MessageHelper.formatMessage("siteconfigcirc_UserDefined4") %>&nbsp;&nbsp;
                                    <html:text property="<%=SiteConfigCircForm.FIELD_USER_DEFINED4%>" size="20" maxlength="20"/>
                                    &nbsp;&nbsp;
                                    <html:checkbox property="<%=SiteConfigCircForm.FIELD_SHOW_USER_DEFINED4%>"/>
                                </span>
                                <span class="Instruction"><%=MessageHelper.formatMessage("siteconfigcirc_DisplayInCirculationDesk") %></span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <span class="ColRowBold">&nbsp;&nbsp;<%=MessageHelper.formatMessage("siteconfigcirc_UserDefined5") %>&nbsp;&nbsp;
                                    <html:text property="<%=SiteConfigCircForm.FIELD_USER_DEFINED5%>" size="20" maxlength="20"/>
                                    &nbsp;&nbsp;
                                    <html:checkbox property="<%=SiteConfigCircForm.FIELD_SHOW_USER_DEFINED5%>"/>
                                </span>
                                <span class="Instruction"><%=MessageHelper.formatMessage("siteconfigcirc_DisplayInCirculationDesk") %></span>
                            </td>
                        </tr>
                        <c:if test="<%=!store.isMediaSite() %>">
                            <tr>
                                <td class="ColRowBold">&nbsp;&nbsp;<%=MessageHelper.formatMessage("siteconfigcirc_WhenSearchingForPatronsInCirculationDesk") %>&nbsp;&nbsp;
                                    <span class="ColRow">
                                       <html:select property="<%= SiteConfigCircForm.FIELD_DEFAULT_USER_DEFINED_LABEL %>">
                                         <html:options collection="labelOptions" property="longID" labelProperty="stringDesc"/>
                                       </html:select>
                                    </span>  
                                    &nbsp;<base:helpTag helpFileName="d_srch_results_for_patrons_circ_desk.htm"/>
                                </td>
                            </tr>
                        </c:if>
                    </table>
                </td>
            </tr>
        
            <tr>
                <td colspan="2"><base:imageLine height="3" width="100%"/></td>
            </tr>
        </c:when>
        <c:otherwise>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_USER_DEFINED1%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_SHOW_USER_DEFINED1%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_USER_DEFINED2%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_SHOW_USER_DEFINED2%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_USER_DEFINED3%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_SHOW_USER_DEFINED3%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_USER_DEFINED4%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_SHOW_USER_DEFINED4%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_USER_DEFINED5%>"/>
            <html:hidden property="<%=SiteConfigCircForm.FIELD_SHOW_USER_DEFINED5%>"/>
        </c:otherwise>
    </c:choose>
    <%-- end USER_DEFINED Fields section --%>
    <%-- start Block Override Code section --%>
    <% if (form.isDisplayBlockOverrideCodeSection()) { %>
    <tr>
        <td colspan="2">
        <html:hidden property="<%=SiteConfigCircForm.FIELD_DISTRICTBLOCKOVERRIDECODE%>"/>
            <table id="<%=SiteConfigCircForm.TABLE_BLOCKOVERRIDECODE%>">
                <tr>
                    <td class="TableHeading" valign="top" colspan="2"><%=MessageHelper.formatMessage("siteconfigcirc_BlockOverrideCode") %></td>
                </tr>
               <tr>
                   <td class="Instruction" colspan="2">
                       <%=MessageHelper.formatMessage("siteconfigcirc_ToDefineASiteSpecificBlockOverrideCodeEnterItInTheFieldBelow") %>
                   </td>
               </tr>
                <tr>
                    <td class="ColRowBold" align="right">
                        <%=MessageHelper.formatMessage("siteconfigcirc_DefaultCirculationBlockOverrideCode") %>
                    </td>
                    <td class="ColRow">
                        <%=form.getDistrictBlockOverrideCode() %>
                    </td>
               </tr>
                <tr>
                    <td class="ColRowBold" align="right">
                        <%=MessageHelper.formatMessage("siteconfigcirc_SiteCirculationBlockOverrideCode") %>
                    </td>
                    <td class="ColRow">
                        <html:text property="<%=SiteConfigCircForm.FIELD_SITEBLOCKOVERRIDECODE%>" size="10" maxlength="8" />
                    </td>
               </tr>
           </table>
        </td>
        <td class="ColRow tdAlignRight">&nbsp;</td>
    </tr>
        
    <tr>
        <td colspan="2"><base:imageLine height="3" width="100%"/></td>
    </tr>
    <% } %> 
    <%-- end Block Override Code section --%>
    
    <tr>
        <c:if test="<%=form.getSoundFile() != null%>">
            <script language="JavaScript">
            <!--
                setSound("<c:out value="<%=form.getSoundFile()%>"/>");
            //-->
             </script>
        </c:if>
        <td colspan="2">
            <table id="<%=SiteConfigCircForm.TABLE_CIRC_SOUNDS%>">
                <tr>
                    <td class="TableHeading" colspan="3" valign="top">
                        <a name="<%=SiteConfigCircForm.ANCHOR_NAME_CUSTOM_CIRC_SOUNDS%>"></a><%=MessageHelper.formatMessage("siteconfigcirc_CirculationSounds") %>
                        <base:helpTag helpFileName="d_circ_sounds.htm"/>
                        <c:if test="${saveButtonNeeded}">
                            <td class="ColRowBold tdAlignRight">
                                <base:showHideTag id="onSave">
                                    <base:saveButton onclick="hideElementonSave()"/>
                                </base:showHideTag>
                            </td>
                            <c:set var="saveButtonNeeded" value="false"/>
                        </c:if>
                    </td>
                </tr>
                <tr>
                    <td colspan="3">&nbsp;</td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("siteconfigcirc_AllIsWell") %></td>
                    <td><base:genericButton name="<%=SiteConfigCircForm.BUTTON_PLAY_ALL_IS_WELL %>" src="/buttons/small/play.gif" alt='<%=MessageHelper.formatMessage("play") %>'/></td>
                    <td><base:genericButton name="<%=SiteConfigCircForm.BUTTON_CHANGE_ALL_IS_WELL %>" src="/buttons/small/change.gif" alt='<%=MessageHelper.formatMessage("change")%>'/></td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("siteconfigcirc_AttentionNeeded") %></td>
                    <td><base:genericButton name="<%=SiteConfigCircForm.BUTTON_PLAY_ATTENTION_NEEDED %>" src="/buttons/small/play.gif" alt='<%=MessageHelper.formatMessage("play")%>'/></td>
                    <td><base:genericButton name="<%=SiteConfigCircForm.BUTTON_CHANGE_ATTENTION_NEEDED %>" src="/buttons/small/change.gif" alt='<%=MessageHelper.formatMessage("change")%>'/></td>
                </tr>
                <c:if test="<%=store.isLibrarySite() && !store.isMediaSite() %>">
                        <tr>
                            <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("siteconfigcirc_FineOverdue") %></td>
                            <td><base:genericButton name="<%=SiteConfigCircForm.BUTTON_PLAY_FINE_OVERDUE %>" src="/buttons/small/play.gif" alt='<%=MessageHelper.formatMessage("play")%>'/></td>
                            <td><base:genericButton name="<%=SiteConfigCircForm.BUTTON_CHANGE_FINE_OVERDUE %>" src="/buttons/small/change.gif" alt='<%=MessageHelper.formatMessage("change")%>'/></td>
                        </tr>
                        <tr>
                            <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("siteconfigcirc_HoldReserveReady") %></td>
                            <td><base:genericButton name="<%=SiteConfigCircForm.BUTTON_PLAY_HOLD_RESERVE_READY %>" src="/buttons/small/play.gif" alt='<%=MessageHelper.formatMessage("play")%>'/></td>
                            <td><base:genericButton name="<%=SiteConfigCircForm.BUTTON_CHANGE_HOLD_RESERVE_READY %>" src="/buttons/small/change.gif" alt='<%=MessageHelper.formatMessage("change")%>'/></td>
                        </tr>
                 </c:if>
            </table>
        </td>
    </tr>
    <%if (!store.isAtDistrictWarehouse()) { %> <!-- Line and bottom save are not needed for DistrictWarehouse because there are few options on page -->
        <tr>
            <td colspan="2"><base:imageLine height="3" width="100%" /></td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td class="ColRowBold tdAlignRight"><base:showHideTag id="onSave">
                <base:saveButton onclick="hideElementonSave()" />
            </base:showHideTag></td>
        </tr>
    <% } %>
</base:outlinedTableAndTabsWithinThere>
</base:form>
