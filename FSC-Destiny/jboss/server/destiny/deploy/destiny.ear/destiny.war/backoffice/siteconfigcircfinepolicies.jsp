<%@page import="com.follett.fsc.destiny.session.cataloging.ejb.AssetTemplateAEDSpecs"%>
<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.SiteConfigurationBaseForm"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.FineSpecs" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%><tr>

<%
    SiteConfigurationBaseForm form = (SiteConfigurationBaseForm)request.getAttribute(SiteConfigurationBaseForm.FORM_NAME);
%>

<script language="JavaScript" type="text/javascript">
<!--
    function selectedAssetCreateFinesUsingAssetReplacementPrice() {
        // User selected "Create fines using replacement price from asset". When this button is selected, the depreciated value cannot
        // be used for the fine amount. Uncheck and disable the checkbox, and gray out the text for the choice.
        document.<%=SiteConfigurationBaseForm.FORM_NAME%>.<%=SiteConfigurationBaseForm.FIELD_ASSET_PRORATE_FINE_AMT_BASED_ON_DEPR_VAL%>.checked = false;
        document.<%=SiteConfigurationBaseForm.FORM_NAME%>.<%=SiteConfigurationBaseForm.FIELD_ASSET_PRORATE_FINE_AMT_BASED_ON_DEPR_VAL%>.disabled = true;
        document.getElementById("<%=SiteConfigurationBaseForm.ID_ASSET_PRORATE_FINE_AMT_BASED_ON_DEPR_VAL_TEXT%>").style.color = "gray";
    }

    function selectedAssetCreateFinesUsingItemPurchasePrice() {
        // User selected "Create fines using purchase price from item". When this button is selected, then depreciated value
        // can be used for the fine amount. Enable the checkbox and change the color back to black on the text for the choice.
        document.<%=SiteConfigurationBaseForm.FORM_NAME%>.<%=SiteConfigurationBaseForm.FIELD_ASSET_PRORATE_FINE_AMT_BASED_ON_DEPR_VAL%>.disabled = false;
        document.getElementById("<%=SiteConfigurationBaseForm.ID_ASSET_PRORATE_FINE_AMT_BASED_ON_DEPR_VAL_TEXT%>").style.color = "black";
    }
// -->
</script>


<tr>
    <td>
    <table id="<%=SiteConfigurationBaseForm.TABLE_FINE_POLICIES%>" width="100%" cellpadding="5" cellspacing="0"> 
        <tr>
            <td class="TableHeading" valign="top">&nbsp;<%=MessageHelper.formatMessage("siteconfigcircfinepolicies_FinePolicies") %></td>
        </tr>

        <tr>
            <td><base:imageLine height="1" width="100%" /></td>
        </tr>
        <tr>
            <td class="ColRowBold"><html:checkbox
                property="<%=SiteConfigurationBaseForm.FIELD_CIRC_FINES_AUTO_CALCULATE%>"><%=MessageHelper.formatMessage("siteconfigcircfinepolicies_AutomaticallyCalculateFinesForOverdueItems") %><base:helpTag helpFileName="d_calculate_overdue_fines_LM.htm"/></html:checkbox>
            </td>
        </tr>
        <tr>
            <td><base:imageLine height="1" width="100%" /></td>
        </tr>
        <tr>
            <td class="ColRowBold"><html:checkbox
                property="<%=SiteConfigurationBaseForm.FIELD_CIRC_FINES_REQUIRE_WAIVE_LIBRARY%>"><%=MessageHelper.formatMessage("siteconfigcircfinepolicies_RequireExplanationWhenWaivingLibraryFine") %>&nbsp;<base:helpTag helpFileName="d_explain_waive_fine.htm"/></html:checkbox>
            </td>
        </tr>
        
        <tr>
            <td class="ColRowBold"> 
                <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_REQUIRE_REFUND_LIBRARY_FINE_NOTE%>"><%=MessageHelper.formatMessage("siteconfigcirc_RequireExplanationWhenIssuingLibraryRefunds")%></html:checkbox>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold"> 
                <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_AUTO_CREATE_LOST_FINE_LIBRARY%>">Automatically create fine for lost library materials&nbsp;<base:helpTag helpFileName="d_automatically_create_fine_for_lost_LM.htm"/></html:checkbox>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold"> 
                <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_REFUND_DAYS_LIBRARY_CHECKBOX%>">&quot;Lost&quot; library materials must be returned in a timely fashion to generate a refund&nbsp;<base:helpTag helpFileName="d_lost_library_materials_refund_LM.htm"/></html:checkbox>
            </td>
        </tr>
        <tr>
            <td class="ColRow"> 
                &nbsp;&nbsp;&nbsp;&nbsp;Calendar days from date &quot;lost&quot; before a paid library fine becomes non-refundable:&nbsp;
                <html:text property="<%=SiteConfigurationBaseForm.FIELD_REFUND_DAYS_LIBRARY%>" size="3" maxlength="3"/>
            </td>
        </tr>
        
        <% if (!UserContext.getMyContextLocaleHelper().isInternationalProduct()) { %>
        <tr>
            <td><base:imageLine height="1" width="100%" /></td>
        </tr>
        <tr>
            <td class="ColRowBold"><html:checkbox
                property="<%=SiteConfigurationBaseForm.FIELD_CIRC_FINES_REQUIRE_WAIVE_TEXTBOOK%>"><%=MessageHelper.formatMessage("siteconfigcircfinepolicies_RequireExplanationWhenWaivingTextbookFine") %>&nbsp;<base:helpTag helpFileName="d_explain_waive_fine.htm"/></html:checkbox>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold"> 
                <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_REQUIRE_REFUND_TEXTBOOK_FINE_NOTE%>"><%=MessageHelper.formatMessage("siteconfigcirc_RequireExplanationWhenIssuingTextbookRefunds")%></html:checkbox>
            </td>
        </tr>
        <% } else { %>
            <html:hidden property="<%=SiteConfigurationBaseForm.FIELD_CIRC_FINES_REQUIRE_WAIVE_TEXTBOOK%>"/>
            <html:hidden property="<%=SiteConfigurationBaseForm.FIELD_REQUIRE_REFUND_TEXTBOOK_FINE_NOTE%>"/>
        <%} %>
        
            <tr>
                <td class="ColRowBold"> 
                    <%if ( !form.getStore().isStateRepositoryRunning() ) { %> 
                        <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_AUTO_CREATE_LOST_FINE_TEXTBOOK%>">Automatically create fine for lost textbook materials&nbsp;<base:helpTag helpFileName="d_automatically_create_fine_for_lost_TM.htm"/></html:checkbox>
                    <% } else { %>
                        <html:hidden property="<%=SiteConfigurationBaseForm.FIELD_AUTO_CREATE_LOST_FINE_TEXTBOOK%>" value="true"/>
                    <% }  %>
                </td>
            </tr>
            <tr>
                <td class="ColRowBold" colspan="2">
                    <%=MessageHelper.formatMessage("siteconfigcircfinepolicies_CreateTextbookFinesUsing")%>&nbsp;<base:helpTag helpFileName="d_create_fines_TM.htm"/>
                </td>
            </tr>
            <tr>
                <td class="ColRow" colspan="2">
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <html:radio property="<%=SiteConfigurationBaseForm.FIELD_CREATE_FINES_USING%>" value="<%=SiteConfigurationBaseForm.RADIO_CREATE_FINES_USING_REPLACEMENT_PRICE_FROM_TITLE%>">
                        <%=MessageHelper.formatMessage("siteconfigcirc_ReplacementPriceFromTitle")%>
                    </html:radio>
                </td>
            </tr>
            <tr>
                <td class="ColRow" colspan="2">
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <html:radio property="<%=SiteConfigurationBaseForm.FIELD_CREATE_FINES_USING%>" value="<%=SiteConfigurationBaseForm.RADIO_CREATE_FINES_USING_PURCHASE_PRICE_FROM_COPY%>">
                        <%=MessageHelper.formatMessage("siteconfigcirc_PurchasePriceFromCopy")%>
                    </html:radio>
                </td>
            </tr>
            <tr>
                <td class="ColRowBold" colspan="2">
                    <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_PRORATE_FINE_AMT_BASED_ON_CPY_COND%>">
                        <%=MessageHelper.formatMessage("siteconfigcircfinepolicies_ProrateTextbookFineAmountBasedOnCopyCondition")%>
                    </html:checkbox>
                    <base:helpTag helpFileName="d_prorate_fine_TM.htm"/>
                </td>
            </tr>
            <tr>
                <td class="ColRowBold"> 
                    <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_REFUND_DAYS_TEXTBOOK_CHECKBOX%>">&quot;Lost&quot; textbook materials must be returned in a timely fashion to generate a refund&nbsp;<base:helpTag helpFileName="d_lost_library_materials_refund_TM.htm"/></html:checkbox>
                </td>
            </tr>
            <tr>
                <td class="ColRow"> 
                    &nbsp;&nbsp;&nbsp;&nbsp;Calendar days from date &quot;lost&quot; before a paid textbook fine becomes non-refundable:&nbsp;
                    <html:text property="<%=SiteConfigurationBaseForm.FIELD_REFUND_DAYS_TEXTBOOK%>" size="3" maxlength="3"/>
                </td>
            </tr>
            <tr>
                <td><base:imageLine height="1" width="100%" /></td>
            </tr>
        <tr>
            <td class="ColRowBold"><html:checkbox
                property="<%=SiteConfigurationBaseForm.FIELD_CIRC_FINES_REQUIRE_WAIVE_ASSET%>"><%=MessageHelper.formatMessage("siteconfigcircfinepolicies_RequireExplanationWhenWaivingAssetFine") %>&nbsp;<base:helpTag helpFileName="d_explain_waive_fine.htm"/></html:checkbox>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold"> 
                <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_REQUIRE_REFUND_ASSET_FINE_NOTE%>"><%=MessageHelper.formatMessage("siteconfigcirc_RequireExplanationWhenIssuingAssetRefunds")%></html:checkbox>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold"> 
                <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_AUTO_CREATE_LOST_FINE_ASSET%>"><%= MessageHelper.formatMessage("siteconfigcircfinepolicies_AutomaticallyCreateFineForLostAssets") %>&nbsp;<base:helpTag helpFileName="d_automatically_create_fine_for_lost_AM.htm"/></html:checkbox>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold" colspan="2">
                <%=MessageHelper.formatMessage("siteconfigcircfinepolicies_CreateAssetFinesUsing")%>&nbsp;<base:helpTag helpFileName="d_create_fines_AM.htm"/>
            </td>
        </tr>
        <tr>
            <td class="ColRow" colspan="2">
                &nbsp;&nbsp;&nbsp;&nbsp;
                <html:radio property="<%=SiteConfigurationBaseForm.FIELD_ASSET_CREATE_FINES_USING%>" value="<%=SiteConfigurationBaseForm.RADIO_ASSET_CREATE_FINES_USING_REPLACEMENT_PRICE_FROM_ASSET%>"
                    onclick="selectedAssetCreateFinesUsingAssetReplacementPrice()">
                    <%=MessageHelper.formatMessage("siteconfigcircfinepolicies_ReplacementPriceFromAsset")%>
                </html:radio>
            </td>
        </tr>
        <tr>
            <td class="ColRow" colspan="2">
                &nbsp;&nbsp;&nbsp;&nbsp;
                <html:radio property="<%=SiteConfigurationBaseForm.FIELD_ASSET_CREATE_FINES_USING%>" value="<%=SiteConfigurationBaseForm.RADIO_ASSET_CREATE_FINES_USING_PURCHASE_PRICE_FROM_ITEM%>"
                    onclick="selectedAssetCreateFinesUsingItemPurchasePrice()">
                    <%=MessageHelper.formatMessage("siteconfigcircfinepolicies_PurchasePriceFromItem")%>
                </html:radio>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold" colspan="2">
                <% if (form.getAssetCreateFinesUsing() == FineSpecs.CREATE_FINES_USING_REPLACEMENT_PRICE_FROM_RESOURCE) { %>
                    <html:checkbox disabled="true" property="<%=SiteConfigurationBaseForm.FIELD_ASSET_PRORATE_FINE_AMT_BASED_ON_DEPR_VAL%>">
                        <span id="<%=SiteConfigurationBaseForm.ID_ASSET_PRORATE_FINE_AMT_BASED_ON_DEPR_VAL_TEXT%>" style="color:gray">
                            <%=MessageHelper.formatMessage("siteconfigcircfinepolicies_ProrateAssetFineAmountBasedOnDepreciatedValue")%>
                        </span>
                    </html:checkbox>
                <% } else { %>
                    <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_ASSET_PRORATE_FINE_AMT_BASED_ON_DEPR_VAL%>">
                        <span id="<%=SiteConfigurationBaseForm.ID_ASSET_PRORATE_FINE_AMT_BASED_ON_DEPR_VAL_TEXT%>">
                            <%=MessageHelper.formatMessage("siteconfigcircfinepolicies_ProrateAssetFineAmountBasedOnDepreciatedValue")%>
                        </span>
                    </html:checkbox>
                <% } %>
                <base:helpTag helpFileName="d_prorate_fine_AM.htm"/>
            </td>
        </tr>
        <% if(AssetTemplateAEDSpecs.isAllowResourceManagerTextbooks()) { %>
            <tr>
                <td class="ColRowBold"> 
                    <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_REFUND_DAYS_RESOURCE_TEXTBOOK_CHECKBOX%>">&quot;Lost&quot; textbook resources must be returned in a timely fashion to generate a refund&nbsp;
                    <base:helpTag helpFileName="d_lost_library_materials_refund_rm.htm"/></html:checkbox>
                </td>
            </tr>
            <tr>
                <td class="ColRow"> 
                    &nbsp;&nbsp;&nbsp;&nbsp;Calendar days from date &quot;lost&quot; before a paid textbook resource fine becomes non-refundable:&nbsp;
                    <html:text property="<%=SiteConfigurationBaseForm.FIELD_REFUND_DAYS_RESOURCE_TEXTBOOK%>" size="3" maxlength="3"/>
                </td>
            </tr>
        <% } else { %>
            <html:hidden property="<%=SiteConfigurationBaseForm.FIELD_REFUND_DAYS_RESOURCE_TEXTBOOK_CHECKBOX%>"/>
            <html:hidden property="<%=SiteConfigurationBaseForm.FIELD_REFUND_DAYS_RESOURCE_TEXTBOOK%>"/>
        <% } %>
    </table>
    </td>
</tr>
