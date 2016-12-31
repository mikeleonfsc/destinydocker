<%@page import="com.follett.fsc.destiny.entity.ejb3.SiteTypeSpecs"%>
<%@page import="com.follett.fsc.destiny.session.district.ejb.ConfigDistrictFacadeSpecs"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.ejb.InventoryFacadeSpecs" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.PartialInventoryHistorySpecs" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %> 
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%@ page import="com.follett.fsc.destiny.util.ObjectHelper" %> 

<%@page import="com.follett.fsc.destiny.util.Permission"%>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>


<base:messageBox strutsErrors="true"/>

<%
    InventoryStartForm form = (InventoryStartForm)request.getAttribute(InventoryStartForm.FORM_NAME);
%>
<base:form action="/backoffice/servlet/handleinventorystartform.do"
    focus="<%= form.getFocusString() %>" >
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">
    

<bean:define id="assetLimiterTypeOptionID" name="<%= InventoryStartForm.FORM_NAME %>" property="assetLimiterTypeOptions"/>
<html:hidden property="<%= InventoryStartForm.PARAM_COLLECTION_TYPE %>" />
<html:hidden property="<%= InventoryStartForm.BUTTON_NAME_ON_SUBMIT %>" value="false"/>
<html:hidden property="<%= InventoryStartForm.FIELD_CONTEXT_LIMITER_CHANGED %>" value="false"/>
<html:hidden property="<%= InventoryStartForm.FIELD_ASSET_LIMITER_CHANGED %>"/>
<html:hidden property="<%= InventoryStartForm.FIELD_SITETYPE_LIMITER_CHANGED %>"/>
<html:hidden property="<%= InventoryStartForm.FIELD_INVENTORY_TYPE_LIMITER_CHANGED %>" value="false"/>

<logic:equal name="<%= InventoryStartForm.FORM_NAME %>" property="action" value="<%= InventoryStartForm.ACTION_CONFIRM_INVENTORY%>">
    <base:messageBox showRedBorder="true">
        <%=form.getMessages() %>
        <tr>
            <td>&nbsp;</td>
            <td valign="baseline" align="center" class="ColRow">
                <base:yesNo
                    buttonNoName="<%=InventoryStartForm.BUTTON_CONFIRM_NO%>"
                />
            </td>
        </tr>
    </base:messageBox>
</logic:equal>

<base:outlinedTable id="<%= InventoryStartForm.TABLE_PARTIAL_INVENTORY%>" borderColor='#c0c0c0' width="97%" cellpadding="2" cellspacing="0">
    <tr>
        <td class="TableHeading">
        <%if(form.getCollectionType() == CollectionType.ASSET){ %>
            &nbsp;<%= MessageHelper.formatMessage("inventorystart_SpecifyTheAssetsToBeInventoried") %>
        <%}else{ %>
            &nbsp;<%= MessageHelper.formatMessage("inventorystart_SpecifyTheCopiesToBeInventoried") %>
        <%} %>
        </td>
    </tr>
        <tr>
            <td class="ColRow" align="center">
                &nbsp;
            </td>
        </tr>
    
        <tr>
            <td align="center">
                <table id="<%=InventoryStartForm.TABLE_PARTIAL_SELECTION%>">
                    <tr>
                        <td class="ColRowBold tdAlignRight" nowrap><%= MessageHelper.formatMessage("inventorystart_InventoryName") %></td>
                        <td class="tdAlignLeft">
                            <html:text property="<%=InventoryStartForm.FIELD_INVENTORY_NAME%>" size="30" maxlength="30"/>
                        </td>
                    </tr>
                    <base:isStateContext>
                        <tr>
                            <td class="ColRowBold tdAlignRight" nowrap><%= MessageHelper.formatMessage("inventorystart_For") %></td>
                            <td class="ColRow tdAlignLeft">
                               <base:selectDistrict                                 
                                includeStateTextbookOffice="true" 
                                selectedDistrictContext="<%=form.getDistrictContext()%>"
                                mustContainTextbookSites="true"  
                                useSelectAllDistricts="true"                                
                                useSelectADistrict="true"                                
                                onChangeAction="submitDropDownDistrict()" 
                                name="<%= InventoryStartForm.FIELD_DISTRICT_CONTEXT %>" />                            
                            </td>
                        </tr>

                        
                        <% if ( !SelectDistrictTag.BLANK_SITE.equals(form.getDistrictContext()) 
                            && form.getDistrictContext() != null 
                            && !form.isLocalStateTextbookOfficeInventory()) { %>
                            <tr>
                                <td class="ColRowBold tdAlignRight" nowrap><%= MessageHelper.formatMessage("inventorystart_SiteName") %></td>
                            <% if ( SelectDistrictTag.VALUE_ALL_DISTRICTS.equals(form.getDistrictContext()) ) { %>
                                   <td class="ColRow"><%= MessageHelper.formatMessage("inventorystart_AllSites") %></td>
                            <% } else { %>
                                   <td class="tdAlignLeft">
                                       <base:selectSite 
                                       useSelectASite="true"
                                       name="<%= InventoryStartForm.FIELD_SITE_LIMITER %>" 
                                       selectedSiteID="<%= String.valueOf(form.getSiteLimiterID()) %>" 
                                       mode="<%=SelectSiteTag.MODE_GROUP_BY_SITE_TYPE_TEXTBOOK_ONLY %>"
                                       includeLibrarySites="false"
                                       includeTextbookSites="true"
                                       includeMediaSites="false"
                                       contextName="<%=form.getDistrictContext()%>"
                                       includeAssetSites="false"
                                       includeAllSites="true"
                                       />
                                    </td>   
                                   
                            <% } %>
                            </tr>
                        <% } %>
                    </base:isStateContext>
                    
                    <base:isNotStateContext>
                        <base:isDistrictUser>
                            <tr>
                                <td class="ColRowBold tdAlignRight" nowrap><%= MessageHelper.formatMessage("inventorystart_For") %></td>
                                <td class="ColRow tdAlignLeft">
                                    <base:selectSiteAndSiteType 
                                    name="<%= InventoryStartForm.FIELD_SITE_LIMITER%>" 
                                    selectedSiteID="<%=form.getSiteLimiter()%>"
                                    includeForLibrarySites="false"
                                    includeForTextbookSites="<%=(form.getCollectionType() == CollectionType.TEXTBOOK) %>"
                                    includeForAssetSites="<%=(form.getCollectionType() == CollectionType.ASSET) %>"
                                    includeDistrictWarehouseSiteType="false"
                                    onChangeAction="siteLimiterTypeSelected()" />
                                </td>
                            </tr>
                        </base:isDistrictUser>
                    </base:isNotStateContext>
                </table>
                
                    <base:imageLine height="1" width="90%"/>
                
                <table id="<%=InventoryStartForm.TABLE_PARTIAL_SELECTION_ASSET_LIMITERS%>">
                    <%if(form.getCollectionType() == CollectionType.ASSET){ %>
                        <logic:equal name="<%= InventoryStartForm.FORM_NAME %>" property="<%=InventoryStartForm.FIELD_COPIES_WITH_BARCODES%>" value="true">
                            <tr>
                                <td class="ColRowBold tdAlignRight" nowrap><%= MessageHelper.formatMessage("inventorystart_LimitedTo") %></td>
                                <td class="ColRow tdAlignLeft" colspan="2">
                                    <html:select property="<%=form.FIELD_ASSET_LIMITER%>" onchange="assetLimiterTypeSelected()">
                                        <html:options collection="assetLimiterTypeOptionID" property="longID"
                                              labelProperty="stringDesc"/>
                                    </html:select>
                                </td>
                            </tr>
                        </logic:equal>
                    
                    <%
                        if (!new Long(InventoryFacadeSpecs.LIMITER_UNLIMITED).equals(form.getAssetLimiter())) {
                     %>
                        <tr>    
                            <td>
                                &nbsp;
                            </td>
                            <td valign="top">
                                <%=form.getFormattedLimiterList()%>
                            </td>
                            <td valign="top">
                                <base:genericButton src="/buttons/large/update.gif" alt='<%= MessageHelper.formatMessage("update") %>' name="<%= InventoryStartForm.BUTTON_UPDATE_LIMITERS %>" />
                            </td>                                   
                        </tr>
                    <% } %>
                     
                    <% } %>
                    <% if(form.getCollectionType() == CollectionType.ASSET){ %>
                        <tr>
                            <td colSpan="3">
                                <base:imageLine height="1" width="100%"/>
                            </td>
                        </tr>
                        <tr>
                            <td class="ColRowBold tdAlignRight" nowrap><%= MessageHelper.formatMessage("inventorystart_AssetTypes") %></td>
                            <td class="tdAlignLeft">
                                <%=form.getFormattedAssetTypeList()%>
                            </td>
                            <td>
                                <base:genericButton src="/buttons/large/update.gif" alt='<%= MessageHelper.formatMessage("update") %>' name="<%= InventoryStartForm.BUTTON_UPDATE_ASSET_TYPES %>" />
                            </td>   
                        </tr>
                        <tr>
                            <td colSpan="3">
                                <base:imageLine height="1" width="100%"/>
                            </td>
                        </tr>
                        <logic:equal name="<%= InventoryStartForm.FORM_NAME %>" property="<%=InventoryStartForm.FIELD_COPIES_WITH_BARCODES%>" value="true">
                            <tr>
                                <td class="ColRowBold tdAlignRight" nowrap><%= MessageHelper.formatMessage("inventorystart_PurchasePrice") %></td>
                                <td class="ColRow tdAlignLeft" colspan="2">
                                    <html:select property="purchasePriceMode">
                                          <html:option value="<%=String.valueOf(InventoryStartForm.RANGE_GREATER_THAN_OR_EQUAL_TO)%>"><%= MessageHelper.formatMessage("inventorystart_GreaterThanOrEqualTo") %></html:option>
                                          <html:option value="<%=String.valueOf(InventoryStartForm.RANGE_LESS_THAN)%>"><%= MessageHelper.formatMessage("inventorystart_LessThan") %></html:option>
                                    </html:select>&nbsp;<html:text property="purchasePrice" size="10" maxlength="10"/>
                                </td>
                            </tr>   
                        </logic:equal>                 
                    <% } %>
                    
                    <% if(ObjectHelper.isIntInArray(form.getCollectionType(),CollectionType.TEXTBOOK,CollectionType.ASSET)){ %>
                         <% if(form.getCollectionType() == CollectionType.TEXTBOOK){ %>   
                            <html:hidden property="<%= InventoryStartForm.FIELD_ASSET_LIMITER %>"/>
                             <%if(form.getStore().isStateRepositoryRunning() && !form.getStore().isStateContext()){ %>
                                <tr>    
                                    <td class="ColRowBold tdAlignRight" vAlign="top">
                                        <TABLE>
                                            <TR>
                                            <TD class="ColRowBold"><%= MessageHelper.formatMessage("inventorystart_LimitInventoryTo") %></td>
                                            </TR>
                                        </TABLE>
                                    </td>
                                    <td valign="top" class="ColRow">
                                        <html:select property="<%=InventoryStartForm.FIELD_INVENTORY_STATE_LIMITER%>">
                                            <html:option value="<%=String.valueOf(PartialInventoryHistorySpecs.PARTIAL_INVENTORY_STATE_LIMITER_ALL_COPIES)%>">
                                            <%=PartialInventoryHistorySpecs.getStateLimiterDisplayable(PartialInventoryHistorySpecs.PARTIAL_INVENTORY_STATE_LIMITER_ALL_COPIES)%>
                                            </html:option>
                                            <html:option value="<%=String.valueOf(PartialInventoryHistorySpecs.PARTIAL_INVENTORY_STATE_LIMITER_DISTRICT_OWNED_COPIES)%>">
                                            <%=PartialInventoryHistorySpecs.getStateLimiterDisplayable(PartialInventoryHistorySpecs.PARTIAL_INVENTORY_STATE_LIMITER_DISTRICT_OWNED_COPIES)%>
                                            </html:option>
                                            <html:option value="<%=String.valueOf(PartialInventoryHistorySpecs.PARTIAL_INVENTORY_STATE_LIMITER_STATE_OWNED_COPIES)%>">
                                            <%=PartialInventoryHistorySpecs.getStateLimiterDisplayable(PartialInventoryHistorySpecs.PARTIAL_INVENTORY_STATE_LIMITER_STATE_OWNED_COPIES)%>
                                            </html:option>
                                          
                                        </html:select>
                                    </td>
                                    <td valign="top">&nbsp;</td>       
                                </tr>
                                
                             <% } %>
                            <base:isNotDistrictUser> 
                                <logic:equal name="<%= InventoryStartForm.FORM_NAME %>" property="<%=InventoryStartForm.FIELD_COPIES_WITH_BARCODES%>" value="true">
                                    <tr>    
                                        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("inventorystart_Locations") %></td>
                                        <td  class="tdAlignLeft"><%=form.getFormattedLimiterList()%>
                                        </td>
                                        <td><base:genericButton src="/buttons/large/update.gif" alt='<%= MessageHelper.formatMessage("update") %>' name="<%= InventoryStartForm.BUTTON_UPDATE_LIMITERS %>" />
                                        </td>                                   
                                    </tr>
                                </logic:equal>
                            </base:isNotDistrictUser> 
                        <% } %>  
                        
                        <%if (form.getCollectionType() == CollectionType.TEXTBOOK || form.isTextbookResourceTypeOnlySelected()){ %> <!-- Textbook Resources: Adoption End Range -->
                            <tr>    
                                <td class="ColRowBold tdAlignRight" ><%= MessageHelper.formatMessage("inventorystart_AdditionalOptions") %></td>
                                <td class="ColRow  tdAlignLeft" colspan="2"><%= MessageHelper.formatMessage("inventorystart_AdoptionEndFrom") %>&nbsp;<html:text property="<%=InventoryStartForm.FIELD_ADOPTION_FROM%>" size="4" maxlength="4"/>&nbsp;<%= MessageHelper.formatMessage("inventorystart_To") %>
                                <html:text property="<%=InventoryStartForm.FIELD_ADOPTION_TO%>" size="4" maxlength="4"/>                                                        
                            </tr> 
                        <%} else { %>
                            <html:hidden property="<%=InventoryStartForm.FIELD_ADOPTION_FROM%>" value="" />
                            <html:hidden property="<%=InventoryStartForm.FIELD_ADOPTION_TO%>" value="" />
                        <% } %> 
                                               
                        <tr>
                            <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("inventorystart_Include") %></td>
                            <td class="ColRow tdAlignLeft" colspan="2">
                            <% if (form.getCollectionType() == CollectionType.ASSET) { %>
                                <html:checkbox property="<%=InventoryStartForm.FIELD_COPIES_WITH_BARCODES%>" onclick="copiesWithBarcodeSelected()"/>&nbsp;<%= MessageHelper.formatMessage("inventorystart_ItemsWithBarcodes") %></td>
                            <% } else { %>
                                <html:checkbox property="<%=InventoryStartForm.FIELD_COPIES_WITH_BARCODES%>" onclick="copiesWithBarcodeSelected()"/>&nbsp;<%= MessageHelper.formatMessage("inventorystart_CopiesWithBarcodes") %></td>
                            <% } %>
                        </tr>
                        <tr>
                            <td class="ColRowBold">&nbsp;</td>
                            <td class="ColRow tdAlignLeft" colspan="2">
                            <% if (form.getCollectionType() == CollectionType.ASSET) { %>
                                <html:checkbox property="<%=InventoryStartForm.FIELD_COPIES_WITHOUT_BARCODES%>"/>&nbsp;<%= MessageHelper.formatMessage("inventorystart_ItemsWithoutBarcodes") %></td>
                            <% } else { %>
                                <html:checkbox property="<%=InventoryStartForm.FIELD_COPIES_WITHOUT_BARCODES%>"/>&nbsp;<%= MessageHelper.formatMessage("inventorystart_CopiesWithoutBarcodes") %></td>
                            <% } %>
                        </tr>
                        <tr>
                            <td class="ColRowBold">&nbsp;</td>
                            <td class="ColRow tdAlignLeft" colspan="2">
                                <html:checkbox property="<%=InventoryStartForm.FIELD_CONSUMABLES%>"/>&nbsp;<%= MessageHelper.formatMessage("inventorystart_Consumables") %>&nbsp;<base:helpTag helpFileName="d_inventory_consumable.htm"/>
                            </td>
                        </tr>
                <% } else {%>
                        <tr>
                            <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("inventorystart_CallNumbersFrom") %></td>
                            <td class="ColRowBold tdAlignLeft" colspan="2">
                            <html:text property="<%=InventoryStartForm.FIELD_CALLNUMBER_FROM%>" size="20" maxlength="36"/>
                            <%= MessageHelper.formatMessage("inventorystart_To") %>
                            <html:text property="<%=InventoryStartForm.FIELD_CALLNUMBER_TO%>" size="20" maxlength="36"/>
                            </td>
                        </tr>
                        <tr>
                            <td class="Instruction" align="center" colspan="3"><%= MessageHelper.formatMessage("inventorystart_ToSpecifyACallNumberRangeEnterAtLeastTheFirst3Digi") %></td>
                        </tr>
                    <% }%>
                </table>
            </td>
        </tr>
        <% if( !ObjectHelper.isIntInArray(form.getCollectionType(),CollectionType.TEXTBOOK,CollectionType.ASSET) ){ %>
                <html:hidden property="<%= InventoryStartForm.FIELD_CHECKIN_ON_SCAN %>" value="true" />
                <html:hidden property="<%= InventoryStartForm.FIELD_COPIES_WITH_BARCODES %>" value="false" />
                <html:hidden property="<%= InventoryStartForm.FIELD_COPIES_WITHOUT_BARCODES %>" value="false" />
                <html:hidden property="<%= InventoryStartForm.FIELD_CONSUMABLES %>" value="false" />
        <%} %>

        <% if(form.getCollectionType()==CollectionType.LIBRARY){ %>
            <tr><td valign="middle" align="center"><base:imageLine height="1" width="90%"/></td></tr>
            <tr>
                <td>
                    <table id="<%=InventoryStartForm.TABLE_PARTIAL_SELECTION_CIRC_TYPE_LIMITERS%>" align="center">
                        <tr>
                            <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("inventorystart_CirculationTypes") %></td>
                            <td class="tdAlignLeft">
                                <base:circTypesList formName="<%=InventoryStartForm.FORM_NAME %>"/>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
        <% } %>
            
            
        <%if(ObjectHelper.isIntInArray(form.getCollectionType(),CollectionType.TEXTBOOK,CollectionType.ASSET)) { 
             if (form.isCopiesWithBarcodes() ) {
                 if ( !form.isLocalStateTextbookOfficeInventory() && !form.getStore().isAtDistrictWarehouse() && !form.selectedSiteIsADistrictWarehouse()) { %>
                    <tr><td valign="middle" align="center"><base:imageLine height="1" width="90%"/></td></tr>
                    <tr><td align="center">
                        <table>                    
                        <tr>
                            <td class="ColRowBold" colspan="3" align="center">
                                <% if (form.getCollectionType() == CollectionType.TEXTBOOK) { %>
                                    <%= MessageHelper.formatMessage("inventorystart_HandlingCheckedOutCopiesIWantTo") %>
                                <% } else { %>
                                    <%= MessageHelper.formatMessage("inventorystart_HandlingCheckedOutItemsIWantTo") %>
                                <% } %>
                            </td>
                        </tr>
                    
                        <tr>
                            <td class="ColRow" colspan="3">
                                <html:checkbox property="<%=InventoryStartForm.FIELD_INCLUDE_CHECKED_OUT_ITEMS%>"/>
                                <% if (form.getCollectionType() == CollectionType.TEXTBOOK) { %>
                                    <%= MessageHelper.formatMessage("inventorystart_IncludeCopiesThatAreCheckedOutMakeTheseCopiesUnacc") %>
                                <% } else { %>
                                    <%= MessageHelper.formatMessage("inventorystart_IncludeItemsThatAreCheckedOutMakeTheseItemsUnacc") %>
                                <% } %>
                            </td>
                        </tr>
                        <tr>
                            <td class="ColRow" colspan="3">
                                <html:checkbox property="<%=InventoryStartForm.FIELD_CHECKIN_ON_SCAN%>"/>
                                <% if (form.getCollectionType() == CollectionType.TEXTBOOK) { %>
                                    <%= MessageHelper.formatMessage("inventorystart_CheckInCurrentlyCheckedOutCopiesWhenScannedIntoInv") %>
                                <% } else { %>   
                                    <%= MessageHelper.formatMessage("inventorystart_CheckInCurrentlyCheckedOutItemsWhenScannedIntoInv") %>
                                <% } %>
                            </td>
                        </tr>
                        </table>
                        </td>
                    </tr>                    
                <% } else { %>
                    <html:hidden property="<%= InventoryStartForm.FIELD_CHECKIN_ON_SCAN %>" />
                    <html:hidden property="<%= InventoryStartForm.FIELD_INCLUDE_CHECKED_OUT_ITEMS %>" />
                <% } %>
                <tr><td valign="middle" align="center"><base:imageLine height="1" width="90%"/></td></tr>
                <tr>
                    <td align="center">
                        <table id="<%=InventoryStartForm.TABLE_COPIES_SEEEN %>">
                        <% if (form.getCollectionType() == CollectionType.ASSET) { %>
                            <tr>
                                <td  class="ColRowBold"><%= MessageHelper.formatMessage("inventorystart_AllItemsMeetingTheAboveCriteria") %></td>
                            </tr>
                            <tr>
                                <td class="ColRow" align="center" valign="bottom"><%= MessageHelper.formatMessage("inventorystart_ExceptForItemsThatHaveBeenSeen") %>&nbsp;
                                    <base:date 
                                        buttonName = "<%=InventoryStartForm.BUTTON_CHANGE_DATE%>"
                                        fieldName = "<%=InventoryStartForm.FIELD_UNACCOUNTED_FOR_SINCE%>"
                                        dateValue = "<%=form.getAccountedForSince()%>"
                                        altText = '<%=MessageHelper.formatMessage("inventorystart_ChangeUnaccountedForSinceDate")%>'/>
                                </td>
                            </tr>
                        <% } else { %>    
                            <tr>
                                <td class="ColRow" valign="bottom" style="padding-left:3em"><%= MessageHelper.formatMessage("inventorystart_CopiesWithBarcodesThatHaveBeenSeenOnOrAfter") %>&nbsp;<base:date 
                                        buttonName = "<%=InventoryStartForm.BUTTON_CHANGE_DATE%>"
                                        fieldName = "<%=InventoryStartForm.FIELD_UNACCOUNTED_FOR_SINCE%>"
                                        dateValue = "<%=form.getAccountedForSince()%>"
                                        altText = '<%=MessageHelper.formatMessage("inventorystart_ChangeUnaccountedForSinceDate")%>'/> <%= MessageHelper.formatMessage("inventorystart_DontNeedToBeScanned") %>
                                </td>
                            </tr>
                        <% } %>
                        </table>
                    </td>
                </tr>
            <%   } else { %> 
                 <html:hidden property="<%= InventoryStartForm.FIELD_CHECKIN_ON_SCAN %>" />
                 <html:hidden property="<%= InventoryStartForm.FIELD_INCLUDE_CHECKED_OUT_ITEMS %>" />
                <html:hidden property="<%= InventoryStartForm.FIELD_UNACCOUNTED_FOR_SINCE %>" />
            
             <%  } 
           } else { %>

                <tr><td valign="middle" align="center"><base:imageLine height="1" width="90%"/></td></tr>
                <tr>
                    <td align="center">
                        <table>
                            <tr>
                                <td  class="ColRowBold"><%= MessageHelper.formatMessage("inventorystart_AllCopiesMeetingTheAboveCriteria") %></td>
                            </tr>
                            <tr>
                                <td class="ColRow" align="center" valign="bottom"><%= MessageHelper.formatMessage("inventorystart_ExceptForCopiesThatHaveBeenSeen") %>&nbsp;
                                    <base:date 
                                        buttonName = "<%=InventoryStartForm.BUTTON_CHANGE_DATE%>"
                                        fieldName = "<%=InventoryStartForm.FIELD_UNACCOUNTED_FOR_SINCE%>"
                                        dateValue = "<%=form.getAccountedForSince()%>"
                                        altText = '<%=MessageHelper.formatMessage("inventorystart_ChangeUnaccountedForSinceDate")%>'/>
                                </td>
                            </tr>
                         </table>
                    </td>
                </tr>
            <% } %>
            <%if ( ObjectHelper.isIntInArray(form.getCollectionType(),CollectionType.TEXTBOOK,CollectionType.ASSET) ) { %>
                <tr><td valign="middle" align="center"><base:imageLine height="1" width="90%"/></td></tr>
                    <%if(form.isCopiesWithBarcodes() && form.getCollectionType() == CollectionType.ASSET){ %>
                    <tr><td align="center" class="ColRowBold">
                    <BR><%= MessageHelper.formatMessage("inventorystart_DuringThisInventoryIfTheLocationOfAnItemDoesNotMat") %></td></tr>
                    <%}else if( form.isCopiesWithBarcodes() && !form.isLocalStateTextbookOfficeInventory()){ %>
                    <tr><td class="ColRowBold" align="center"><%= MessageHelper.formatMessage("inventorystart_VerifyCopyLocation") %></td></tr>
                    <tr><td style="padding-left:3em" class="ColRow" align="center">
                    <%= MessageHelper.formatMessage("inventorystart_DuringThisInventoryYouCanSpecifyYour") %>
                    <BR/>
                    </td></tr>
                    <%} %>
                    <%if ((form.getCollectionType() == CollectionType.ASSET && form.isCopiesWithBarcodes() ) || (form.getCollectionType() == CollectionType.TEXTBOOK && form.isCopiesWithBarcodes() && !form.isLocalStateTextbookOfficeInventory()) ) { %>
                        <tr><td align="center" class="ColRowBold" align="center">
                            <html:select property="<%=InventoryStartForm.FIELD_INVENTORY_LOCATION_SPECIFICATION%>">
                                  <html:option value="<%=String.valueOf(InventoryFacadeSpecs.INVENTORY_OPTION_DO_NOTHING)%>"><%=MessageHelper.formatMessage("PartialInventorySelectionsForm_DoNothing")%></html:option>
                                  <html:option value="<%=String.valueOf(InventoryFacadeSpecs.INVENTORY_OPTION_ALERT_ONLY)%>"><%=MessageHelper.formatMessage("PartialInventorySelectionsForm_AlertButDoNothing")%></html:option>
                                  <html:option value="<%=String.valueOf(InventoryFacadeSpecs.INVENTORY_OPTION_PROMPT_FOR_CHANGE)%>"><%=MessageHelper.formatMessage("PartialInventorySelectionsForm_PromptForChange")%></html:option>
                                  <%if(form.getCollectionType() == CollectionType.ASSET){ %>
                                     <html:option value="<%=String.valueOf(InventoryFacadeSpecs.INVENTORY_OPTION_AUTO_CHANGE)%>"><%=MessageHelper.formatMessage("PartialInventorySelectionsForm_AutomaticallyChangeHomeLocation")%></html:option>
                                  <%}else{ %>
                                     <html:option value="<%=String.valueOf(InventoryFacadeSpecs.INVENTORY_OPTION_AUTO_CHANGE)%>"><%=MessageHelper.formatMessage("inventorystart_AutomaticallyChangeLocation")%></html:option>
                                  <%} %>
                            </html:select>
                        </td></tr>
                    <%} %>
           <%}%>  
           
           
           <base:isStateContext>
               <% if ( !form.isLocalStateTextbookOfficeInventory() ) { %>
                   <tr><td valign="middle" align="center"><base:imageLine height="1" width="90%"/></td></tr>
                   <tr>
                       <td align="center" class="ColRowBold"><%= MessageHelper.formatMessage("inventorystart_ScheduledEndDate") %>&nbsp;
                       <base:date 
                            buttonName = "<%=InventoryStartForm.BUTTON_CHANGE_SCHEDULED_END_DATE%>"
                            fieldName = "<%=InventoryStartForm.FIELD_SCHEDULED_END_DATE%>"
                            dateValue = "<%=form.getScheduledEndDate()%>"
                            altText = '<%=MessageHelper.formatMessage("inventorystart_ChangeUnaccountedForSinceDate")%>'/>
                    </td>
                   </tr>
               <% } else { %>
                <html:hidden property="<%= InventoryStartForm.FIELD_SCHEDULED_END_DATE %>" />
               <% } %>
           </base:isStateContext>
            
        <tr>
            <td class="ColRow" align="center">
                &nbsp;
            </td>
        </tr>
        <tr>
            <td class="FormLabel" align="center">
                <base:okButton/>
                &nbsp;
                <base:cancelButton/>
            </td>
        </tr>
</base:outlinedTable>

</base:form>
<script language="JavaScript" type="text/javascript">
<!--
function assetLimiterTypeSelected() {
    document.<%=InventoryStartForm.FORM_NAME%>.<%=InventoryStartForm.FIELD_ASSET_LIMITER_CHANGED%>.value = "true";
    document.<%=InventoryStartForm.FORM_NAME%>.submit();
}
function copiesWithBarcodeSelected() {
    document.<%=InventoryStartForm.FORM_NAME%>.submit();
}
function siteLimiterTypeSelected() {
    document.<%=InventoryStartForm.FORM_NAME%>.<%=InventoryStartForm.FIELD_SITETYPE_LIMITER_CHANGED%>.value = "true";
    document.<%=InventoryStartForm.FORM_NAME%>.submit();
}

function submitDropDownDistrict() {
    document.<%=InventoryStartForm.FORM_NAME%>.<%=InventoryStartForm.FIELD_CONTEXT_LIMITER_CHANGED%>.value = 'true';
    document.<%=InventoryStartForm.FORM_NAME%>.submit();
}

function dropDownInventoryType() {
        document.<%=InventoryStartForm.FORM_NAME%>.<%=InventoryStartForm.FIELD_INVENTORY_TYPE_LIMITER_CHANGED%>.value = 'true';
        document.<%=InventoryStartForm.FORM_NAME%>.submit();
}


//-->
</script>
