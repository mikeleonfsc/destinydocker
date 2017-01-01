<%@page import="com.follett.fsc.destiny.session.cataloging.ejb.AssetTemplateAEDSpecs"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.SiteConfigurationCirculationSettingsForm" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.SiteConfigurationCatalogSettingsForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.data.UpdateConfigSiteDefaultsJobParams" %>
<%@ page import="com.follett.fsc.destiny.client.common.JSPHelper" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%@page import="com.follett.fsc.destiny.session.common.ejb.ILLDeliveryMethodType"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<jsp:include page="/circulation/setsound.jsp" />
<base:messageBox strutsErrors="true"/>

<%
    SiteConfigurationCirculationSettingsForm form = (SiteConfigurationCirculationSettingsForm)request.getAttribute(SiteConfigurationCirculationSettingsForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    UpdateConfigSiteDefaultsJobParams params = form.gimmeParams();
    boolean isInternational = UserContext.getMyContextLocaleHelper().isInternationalProduct();
%>

<base:form action="/district/servlet/handlesiteconfigurationcirculationsettingsform.do">
    <%  // only put DISTRICT MODE on if we are in district mode, otherwise bad things happen
    if (form.isDistrictMode() ) { %>
      <center><span class="ColRowBold"><%= GenericForm.getLastBackupDisplayMsg(false) %></span></center><br>
      <jsp:include page="/common/msdewarning.jsp" flush="true" />
      <html:hidden property="districtMode"/>    
    <% } %>

  <% // This table can't be less than 100% or the tabs will be misaligned %>
  <table align="center" width="95%">
    <tr>
        <td>
<base:outlinedTableAndTabsWithinThere id="<%=SiteConfigurationCatalogSettingsForm.TABLE_CATALOG_SETTINGS%>" selectedTab="<%=SiteConfigurationCirculationSettingsForm.TAB%>" tabs="<%=form.getTabs()%>" align="center" width="100%">
    <%-- start circulation option section --%> 
    <tr>
        <td class="TableHeading">
            Circulation Options...
        </td>
    </tr>
    <tr>
        <td>
            <base:imageLine height="1" width="100%"/>
        </td>
    </tr>
    <tr>
        <td>
            <table id="<%=SiteConfigurationCirculationSettingsForm.TABLE_DISTRICT_RESOURCES %>">
                <tr>
                    <td class="ColRowBold">
                        Loan Policies
                        <base:link page='<%="/backoffice/servlet/presentsiteconfigurationbaseform.do?districtMode=true&configModeID=" + UpdateConfigSiteDefaultsJobParams.SECTION_CIRC_RESOURCE_SHARING%>' id="<%=SiteConfigurationCirculationSettingsForm.ID_EDIT_LOAN_POLICIES%>">
                            <base:image src="/icons/general/edit_40.gif" width="40" height="16" alt="<%= SiteConfigurationCirculationSettingsForm.ALT_EDIT_LOAN_POLICIES%>"/>
                        </base:link>
                        
                    </td>
                </tr>
                <tr>
                    <td class="ColRow">
                        <ul>
                            <li>Allow library materials to circulate to all patrons in the district: <%=JSPHelper.gimmeBooleanAsText(params.isAllowDistrictCircs())%></li>
                            <li>Allow library materials to be renewed at the borrowing site: <%=JSPHelper.gimmeBooleanAsText(params.isAllowDistrictRenews())%></li>
                            <li>Library loan periods based on: <%= form.gimmeLibraryLoadPeriodTypeStr()%> Days</li>
                            <% if (!isInternational) {%>
                            <li>Allow textbooks to circulate to all patrons in the district: <%=JSPHelper.gimmeBooleanAsText(params.isAllowDistrictTextbookCircs())%></li>
                            <li>Alert during check out if patron has current check out of the same textbook: <%=JSPHelper.gimmeBooleanAsText(params.isAlertDuplicateTextbookCheckout())%></li>
                            <li>Set preferred Follett Classic textbook prefix to &quot;T&quot;: <%=JSPHelper.gimmeBooleanAsText(params.isPreferredFollettClassicTextbookPrefix())%></li>
                            <li>Allow resources to circulate to any patron/department/location in the district: <%=JSPHelper.gimmeBooleanAsText(params.isAllowDistrictAssetCircs())%></li>
                            <li>Alert during check out if patron already has current check out of the same resource: <%=JSPHelper.gimmeBooleanAsText(params.isAlertDuplicateAssetCheckout())%></li>
                            <li>Allow others sites to assign this site's software licenses to their resources: <%=JSPHelper.gimmeBooleanAsText(params.isAllowOtherSitesToAssignMyLicenses())%></li>
                            <li>Allow textbook checkout:
                                <ul>
                                <li>To Patron: <%=JSPHelper.gimmeBooleanAsText(params.isTextbookCircViewToPatron())%></li>
                                <li>By Class: <%=JSPHelper.gimmeBooleanAsText(params.isTextbookCircViewToClass())%></li>
                                <li>To Teacher: <%=JSPHelper.gimmeBooleanAsText(params.isTextbookCircViewToTeacher())%></li>
                                </ul>
                            </li>
                            <li>Allow consumable textbooks to be checked out: <%=JSPHelper.gimmeBooleanAsText(params.isAllowTextbookConsumableCheckout())%></li>
                            <li>Allow unbarcoded textbooks to be checked out by ISBN: <%=JSPHelper.gimmeBooleanAsText(params.isAllowTextbookCheckoutByISBN())%></li>
                            <li>Allow consumable resources to be checked out: <%=JSPHelper.gimmeBooleanAsText(params.isAllowConsumableResourcesToCheckout())%></li>
                            <li>Allow unbarcoded resources to be checked out : <%=JSPHelper.gimmeBooleanAsText(params.isAllowUnbarcodedResourcesToCheckout())%></li>
                            
                            <%} %>
                        </ul>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    
    <tr>
        <td>
        <base:imageLine height="1" width="100%"/>
        </td>
    </tr>
    
    <%-- start fine policies section --%> 
    <tr>
        <td>
            <table id="<%=SiteConfigurationCirculationSettingsForm.TABLE_FINE_POLICIES %>">
                <tr>
                    <td class="ColRowBold">
                    Fine Policies
                    <base:link page='<%="/backoffice/servlet/presentsiteconfigurationbaseform.do?districtMode=true&configModeID=" + UpdateConfigSiteDefaultsJobParams.SECTION_CIRC_FINE_POLICIES %>' id="<%=SiteConfigurationCirculationSettingsForm.ID_EDIT_FINE_POLICIES%>">
                        <base:image src="/icons/general/edit_40.gif" width="40" height="16" alt="<%= SiteConfigurationCirculationSettingsForm.ALT_EDIT_FINE_POLICIES%>"/>
                    </base:link>
                    </td>
                </tr>
                <tr>
                    <td class="ColRow">
                        <ul>
                            <li>Automatically calculate fines for overdue items: <%=JSPHelper.gimmeBooleanAsText(params.isAutoCalculateFines())%></li>
                            <li>Require explanation when waiving library fines: <%=JSPHelper.gimmeBooleanAsText(params.isRequireWaiveLibraryFineNote())%></li>
                            <li>Require explanation when issuing library refunds: <%=JSPHelper.gimmeBooleanAsText(params.isRequireRefundLibraryFineNote())%></li>
                            <li>Automatically create fines for lost library materials: <%=JSPHelper.gimmeBooleanAsText(params.isAutoCreateLostFineLibrary())%></li>
                            <% if ( params.getRefundDaysLibrary() == null ) { %>
                                <li>&quot;Lost&quot; library materials must be returned in a timely fashion to generate a refund: No</li>
                            <%} else {%>
                                <li>Calendar days from date &quot;lost&quot; before a paid library fine becomes non-refundable: <%=params.getRefundDaysLibrary().toString() %></li>
                            <% } %>
                            <% if (!isInternational) { %>
                                <li>Require explanation when waiving textbook fines: <%=JSPHelper.gimmeBooleanAsText(params.isRequireWaiveTextbookFineNote())%></li>
                                <li>Require explanation when issuing textbook refunds: <%=JSPHelper.gimmeBooleanAsText(params.isRequireRefundTextbookFineNote())%></li>
                                <li>Automatically create fines for lost textbooks: <%=JSPHelper.gimmeBooleanAsText(params.isAutoCreateLostFineTextbook())%></li>
                                <li>Create textbook fines using: <%=params.gimmeTextbookCreateFinesUsing()%></li>
                                <li>Prorate textbook fine amount based on copy condition: <%=JSPHelper.gimmeBooleanAsText(params.isProrateFineAmtBasedOnCpyCond())%></li>
                                <% if ( params.getRefundDaysTextbook() == null ) { %>
                                    <li>&quot;Lost&quot; textbooks must be returned in a timely fashion to generate a refund: No</li>
                                <%} else {%>
                                    <li>Calendar days from date &quot;lost&quot; before a paid textbook fine becomes non-refundable: <%=params.getRefundDaysTextbook().toString() %></li>
                                <% } %>
                                <li>Require explanation when waiving resource fines: <%=JSPHelper.gimmeBooleanAsText(params.isRequireWaiveAssetFineNote())%></li>
                                <li>Require explanation when issuing resource refunds: <%=JSPHelper.gimmeBooleanAsText(params.isRequireRefundAssetFineNote())%></li>
                                <li>Automatically create fines for lost resources: <%=JSPHelper.gimmeBooleanAsText(params.isAutoCreateLostFineAsset())%></li>
                                <li>Create resource fines using: <%=params.gimmeAssetCreateFinesUsing()%></li>
                                <li>Prorate resource fine amount: <%=JSPHelper.gimmeBooleanAsText(params.isAssetProrateFineAmtBasedOnDeprVal())%></li>

                                <% if(AssetTemplateAEDSpecs.isAllowResourceManagerTextbooks()) { %>
                                    <% if ( params.getRefundDaysResourceTextbook() == null ) { %>
                                        <li>&quot;Lost&quot; textbook resources must be returned in a timely fashion to generate a refund: No</li>
                                    <%} else {%>
                                        <li>Calendar days from date &quot;lost&quot; before a paid textbook resource fine becomes non-refundable: <%=params.getRefundDaysResourceTextbook().toString() %></li>
                                    <% } %>
                                <% } %>
                                
                            <% } %>
                        </ul>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    
    <tr>
        <td>
        <base:imageLine height="1" width="100%"/>
        </td>
    </tr>
    
    <%-- start hold/reserve policies section --%> 
    <tr>
        <td>
            <table id="<%=SiteConfigurationCirculationSettingsForm.TABLE_HOLD_RESERVE_POLICIES %>">
                <tr>
                    <td class="ColRowBold">
                    Hold/Reserve Policies
                    <base:link page='<%="/backoffice/servlet/presentsiteconfigurationbaseform.do?districtMode=true&configModeID=" + UpdateConfigSiteDefaultsJobParams.SECTION_CIRC_HOLD_POLICIES%>' id="<%=SiteConfigurationCirculationSettingsForm.ID_EDIT_HOLD_RESERVE_POLICIES%>">
                        <base:image src="/icons/general/edit_40.gif" width="40" height="16" alt="<%= SiteConfigurationCirculationSettingsForm.ALT_EDIT_HOLD_RESERVE_POLICIES%>"/>
                    </base:link>
                    </td>
                </tr>
                <tr>
                    <td class="ColRow">
                        <ul>
                            <li>Ready reservation <%=String.valueOf(params.getReserveLeadTime())%> open days in advance of the requested start date.</li>
                            <li>Automatically delete expired holds after <%=String.valueOf(params.getDeleteExpiredHoldsDays())%> calendar days: <%=JSPHelper.gimmeBooleanAsText(params.isDeleteExpiredHolds())%></li>
                            <li>Set the default interlibrary loan delivery method to: <%=ILLDeliveryMethodType.getDeliveryMethodType(params.getDefaultILLdeliveryMethod()).getDesc()%></li>
                        </ul>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    
    <tr>
        <td>
        <base:imageLine height="1" width="100%"/>
        </td>
    </tr>
    
    <%-- start symbology section --%>
    <tr>
        <td>
            <table id="<%=SiteConfigurationCirculationSettingsForm.TABLE_PREFERRED_BARCODE_SYMBOLOGIES %>">
                <tr>
                    <td class="ColRowBold">
                    Preferred Barcode Symbologies
                    <base:link page='<%="/backoffice/servlet/presentsiteconfigurationbaseform.do?districtMode=true&configModeID=" + UpdateConfigSiteDefaultsJobParams.SECTION_CIRC_BARCODE%>' id="<%=SiteConfigurationCirculationSettingsForm.ID_EDIT_PREFERRED_BARCODE_SYMBOLOGIES%>">
                        <base:image src="/icons/general/edit_40.gif" width="40" height="16" alt="<%= SiteConfigurationCirculationSettingsForm.ALT_EDIT_PREFERRED_BARCODE_SYMBOLOGIES%>"/>
                    </base:link>
                    </td>
                </tr>
                <tr>
                    <td class="ColRow">
                        <ul>
                            <li>Library Materials: <%=JSPHelper.gimmeBarcodeSymbologyStr(params.getLibrarySymbologyCode(), params.getLibrarySymbologyTotalLength())%></li>
                            <li>Patrons: <%=JSPHelper.gimmeBarcodeSymbologyStr(params.getPatronSymbologyCode(), params.getPatronSymbologyTotalLength())%></li>
                            <% if (!isInternational) { %>
                            <li>Textbooks: <%=JSPHelper.gimmeBarcodeSymbologyStr(params.getTextbookSymbologyCode(), params.getTextbookSymbologyTotalLength())%></li>
                            <li>Resources: <%=JSPHelper.gimmeBarcodeSymbologyStr(params.getAssetSymbologyCode(), params.getAssetSymbologyTotalLength())%></li>
                            <li>Locations: <%=JSPHelper.gimmeBarcodeSymbologyStr(params.getLocationSymbologyCode(), params.getLocationSymbologyTotalLength())%></li>
                            <%} %>
                        </ul>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    
    <tr>
        <td>
        <base:imageLine height="1" width="100%"/>
        </td>
    </tr>    
    <tr>
        <td>
            <table id="<%=SiteConfigurationCirculationSettingsForm.TABLE_PATRON_DISPLAY %>">
                <tr>
                    <td class="ColRowBold" colspan="2">
                    Patron Display
                    <base:link page='<%="/backoffice/servlet/presentsiteconfigurationbaseform.do?districtMode=true&configModeID=" + UpdateConfigSiteDefaultsJobParams.SECTION_CIRC_PATRON_DISPLAY%>' id="<%=SiteConfigurationCirculationSettingsForm.ID_EDIT_PATRON_DISPLAY%>">
                        <base:image src="/icons/general/edit_40.gif" width="40" height="16" alt="<%= SiteConfigurationCirculationSettingsForm.ALT_EDIT_PATRON_DISPLAY%>"/>
                    </base:link>
                    </td>
                </tr>
                <tr>
                    <td class="ColRow" colspan="2">
                        <ul>
                            <li>Display patron pictures by default: <%= JSPHelper.gimmeBooleanAsText((params.getDisplayPatronPictures() == 0)?false:true)%></li>
                            <li>When searching for patrons in Circulation Desk, display: <%= form.gimmeDefaultPatronLabelStr()%></li>
                            <li>Allow patrons to create their user name and password: <%= JSPHelper.gimmeBooleanAsText(params.isAllowUserCreateLogin())%></li>
                            <li>Customize/display user-defined patron fields as follows:</li>
                        </ul>
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>
                        <table id="<%=SiteConfigurationCirculationSettingsForm.TABLE_CIRCULATION_USERDEFINED%>">
                            <tr>
                                <td colspan="2">&nbsp;</td>
                                <td class="SmallColHeading" align="center">Display in Circulation</td>
                            </tr>    
                            <tr>
                                <td class="ColRow">User Defined 1:</td>
                                <td class="ColRow"><%=JSPHelper.gimmeFilteredString(params.getUserField1Prompt())%></td>
                                <td class="ColRow" align="center"><%=JSPHelper.gimmeBooleanAsText(params.isShowUserField1()) %></td>
                            </tr>    
                            <tr>
                                <td class="ColRow">User Defined 2:</td>
                                <td class="ColRow"><%=JSPHelper.gimmeFilteredString(params.getUserField2Prompt())%></td>
                                <td class="ColRow" align="center"><%=JSPHelper.gimmeBooleanAsText(params.isShowUserField2()) %></td>
                            </tr>
                            <tr>
                                <td class="ColRow">User Defined 3:</td>
                                <td class="ColRow"><%=JSPHelper.gimmeFilteredString(params.getUserField3Prompt())%></td>
                                <td class="ColRow" align="center"><%=JSPHelper.gimmeBooleanAsText(params.isShowUserField3()) %></td>
                            </tr>
                            <tr>
                                <td class="ColRow">User Defined 4:</td>
                                <td class="ColRow"><%=JSPHelper.gimmeFilteredString(params.getUserField4Prompt())%></td>
                                <td class="ColRow" align="center"><%=JSPHelper.gimmeBooleanAsText(params.isShowUserField4()) %></td>
                            </tr>
                            <tr>
                                <td class="ColRow">User Defined 5:</td>
                                <td class="ColRow"><%=JSPHelper.gimmeFilteredString(params.getUserField5Prompt())%></td>
                                <td class="ColRow" align="center"><%=JSPHelper.gimmeBooleanAsText(params.isShowUserField5()) %></td>
                            </tr>      
                        </table>
                    </td>
                    
                </tr>
                
            </table>
        </td>
    </tr>
    
    <tr>
        <td>
        <base:imageLine height="1" width="100%"/>
        </td>
    </tr>
    
    <%-- start circulation sounds section --%> 
    <tr>
        <td>
            <table id="<%=SiteConfigurationCirculationSettingsForm.TABLE_CIRCULATION_SOUNDS %>">
                <tr>
                    <td class="ColRowBold" colspan="3">
                        <a name="<%=SiteConfigurationCirculationSettingsForm.ANCHOR_NAME_CUSTOM_CIRC_SOUNDS%>"></a>Circulation Sounds
                    </td>
                </tr>
                <tr>
                    <% if( !StringHelper.isEmpty(form.getSoundFile())){%>
                         <script language="JavaScript">
                         <!--
                              setSound("<%=form.getSoundFile()%>");
                         //-->
                         </script>
                    <%} %>
                    <td class="ColRow tdAlignRight">All is well</td>
                    <td><base:genericButton name="<%=SiteConfigurationCirculationSettingsForm.BUTTON_PLAY_ALL_IS_WELL %>" src="/buttons/small/play.gif" alt="<%=SiteConfigurationCirculationSettingsForm.ALT_IMAGE_PLAY%>"/></td>
                    <td><base:link page="/backoffice/servlet/presentdistrictcustomcircsoundsform.do?districtMode=true&soundType=1" id="<%=SiteConfigurationCirculationSettingsForm.ID_IMAGE_CHANGE_ALL_IS_WELL%>">
                        <base:image src="/buttons/small/change.gif" alt="<%=SiteConfigurationCirculationSettingsForm.ALT_IMAGE_CHANGE_ALL_IS_WELL%>"/>
                    </base:link>
                    </td>
                </tr>
                <tr>
                    <td class="ColRow tdAlignRight">Attention needed</td>
                    <td><base:genericButton name="<%=SiteConfigurationCirculationSettingsForm.BUTTON_PLAY_ATTENTION_NEEDED %>" src="/buttons/small/play.gif" alt="<%=SiteConfigurationCirculationSettingsForm.ALT_IMAGE_PLAY%>"/></td>
                    <td><base:link page="/backoffice/servlet/presentdistrictcustomcircsoundsform.do?districtMode=true&soundType=2" id="<%=SiteConfigurationCirculationSettingsForm.ID_IMAGE_CHANGE_ATTN_NEEDED%>">
                        <base:image src="/buttons/small/change.gif" alt="<%=SiteConfigurationCirculationSettingsForm.ALT_IMAGE_CHANGE_ATTN_NEEDED%>"/>
                    </base:link>
                    </td>
                </tr>
                    <tr>
                        <td class="ColRow tdAlignRight">Fine/Overdue</td>
                        <td><base:genericButton name="<%=SiteConfigurationCirculationSettingsForm.BUTTON_PLAY_FINE_OVERDUE %>" src="/buttons/small/play.gif" alt="<%=SiteConfigurationCirculationSettingsForm.ALT_IMAGE_PLAY%>"/></td>
                        <td><base:link page="/backoffice/servlet/presentdistrictcustomcircsoundsform.do?districtMode=true&soundType=3" id="<%=SiteConfigurationCirculationSettingsForm.ID_IMAGE_CHANGE_FINE_OVERDUE%>">
                            <base:image src="/buttons/small/change.gif" alt="<%=SiteConfigurationCirculationSettingsForm.ALT_IMAGE_CHANGE_FINE_OVERDUE%>"/>
                        </base:link>
                        </td>
                    </tr>
                    <tr>
                        <td class="ColRow tdAlignRight">Hold/Reserve Ready</td>
                        <td><base:genericButton name="<%=SiteConfigurationCirculationSettingsForm.BUTTON_PLAY_HOLD_RESERVE_READY %>" src="/buttons/small/play.gif" alt="<%=SiteConfigurationCirculationSettingsForm.ALT_IMAGE_PLAY%>"/></td>
                        <td><base:link page="/backoffice/servlet/presentdistrictcustomcircsoundsform.do?districtMode=true&soundType=4" id="<%=SiteConfigurationCirculationSettingsForm.ID_IMAGE_CHANGE_HOLD_READY%>">
                            <base:image src="/buttons/small/change.gif" alt="<%=SiteConfigurationCirculationSettingsForm.ALT_IMAGE_CHANGE_HOLD_READY%>"/>
                        </base:link>
                        </td>
                    </tr>
            </table>
        </td>
    </tr>    
</base:outlinedTableAndTabsWithinThere>
</td>
</tr>
</table>
</base:form>

