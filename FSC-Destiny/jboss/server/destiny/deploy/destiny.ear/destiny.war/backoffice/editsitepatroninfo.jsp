<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.PatronSpecs" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag" %>
<%@page import="org.apache.struts.util.ResponseUtils"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag"%>

    
    <SCRIPT LANGUAGE="javascript" TYPE="text/javascript">
    <!--
        function submitTheForm() {
            document.<%=EditPatronGeneralInfoForm.FORM_NAME%>.<%=EditPatronGeneralInfoForm.FIELD_ACCESS_LEVEL_CHANGED%>.value = "true";
            document.<%=EditPatronGeneralInfoForm.FORM_NAME%>.submit();
        }
    // -->
    </SCRIPT>
    
<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>

<bean:define id="form" name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" type="com.follett.fsc.destiny.client.backoffice.servlet.EditPatronGeneralInfoForm" />
<bean:define id="patronTypesID" name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="patronTypes"/>
<bean:define id="patronStatusesID" name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="patronStatuses"/>
<bean:define id="userLevelsList" name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="userLevels"/>
<bean:define id="assetGroupList" name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="assetGroups"/>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );

%>
    <html:hidden property="<%=EditPatronGeneralInfoForm.FIELD_ACCESS_LEVEL_CHANGED%>"/>

    <table id="<%= EditPatronGeneralInfoForm.TABLE_SITE_PATRON_TABLE %>" border="0" width="100%">
      <tr>
         <td class="TableHeading" colspan="4"><%= MessageHelper.formatMessage("editsitepatroninfo_SiteInformation") %></td>
      </tr>
      
      
      <logic:equal name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="<%= EditPatronGeneralInfoForm.FLAG_DISPLAY_SITE_EDITOR %>" value="false">
           <logic:iterate id="sitePatron" name="<%=EditPatronGeneralInfoForm.FORM_NAME %>" property="findSitePatrons" type="com.follett.fsc.destiny.session.backoffice.data.SitePatronDisplayInfoVO">
           <tr>
              <td class="ColRow" colspan="3">
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <c:choose>
                    <c:when test="${sitePatron.preferredSite}">
                       <base:image src="/icons/general/home_red.gif" alt='<%=MessageHelper.formatMessage("editsitepatroninfo_PrimarySite") %>'/>
                    </c:when>
                    <c:otherwise>
                       <base:image src="/icons/general/offsite.gif" alt='<%=MessageHelper.formatMessage("editsitepatroninfo_AdditionalSite") %>'/>                                
                    </c:otherwise>
                </c:choose>
              &nbsp;
              <bean:write filter="true" name="sitePatron" property="siteName"/> (<bean:write name="sitePatron" filter="true" property="patronBarcode"/>) <bean:write filter="true" name="sitePatron" property="patronTypeDescription"/> 
              </td>
              <td class="tdAlignRight" nowrap>&nbsp;
                <base:link id="<%=EditPatronGeneralInfoForm.SITE_PATRON_PREFIX_EDIT + sitePatron.getSiteID() %>" page="<%=form.gimmeEditSitePatronLink(sitePatron.getSiteID())%>">
                    <base:image src="/buttons/large/edit.gif" alt='<%= MessageHelper.formatMessage("edit") %>' />
                </base:link>
                &nbsp;
                <base:genericButton name="<%= EditPatronGeneralInfoForm.BUTTON_NAME_TRANSFER + sitePatron.getSiteID() %>" alt='<%= MessageHelper.formatMessage("transfer") %>' src="/buttons/large/transferpatrons.gif"/>
                &nbsp;
                <base:link id="<%=EditPatronGeneralInfoForm.SITE_PATRON_PREFIX_REMOVE + sitePatron.getSiteID() %>" page="<%=form.gimmeRemoveSitePatronLink(sitePatron.getSiteID())%>">
                    <base:image src="/buttons/large/remove_x.gif" alt='<%= MessageHelper.formatMessage("remove") %>' />
                </base:link>
              </td>
           </tr>
           </logic:iterate>
      </logic:equal>
      <logic:equal name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="<%= EditPatronGeneralInfoForm.FLAG_DISPLAY_SITE_EDITOR %>" value="true">
            <logic:iterate id="sitePatron" name="<%=EditPatronGeneralInfoForm.FORM_NAME %>" property="sitePatrons" type="com.follett.fsc.destiny.entity.ejb3.SitePatronVO">
                <c:if test="${sitePatron.siteID == form.editingSiteID}">
                    <base:isDistrictUser>
                        <tr>
                            <c:if test="${form.displaySiteDropdown}">
                                <td class="FormLabel tdAlignRight">
                                <logic:equal name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="<%= EditPatronGeneralInfoForm.FIELD_DISTRICT_USER_ON_TRANSFER_ACTION %>" value="false">
                                    <c:choose>
                                        <c:when test="${sitePatron.preferredSite}">
                                           <base:image src="/icons/general/home_red.gif" alt='<%=MessageHelper.formatMessage("editsitepatroninfo_PrimarySite") %>'/>
                                        </c:when>
                                        <c:otherwise>
                                           <base:image src="/icons/general/offsite.gif" alt='<%=MessageHelper.formatMessage("editsitepatroninfo_AdditionalSite") %>'/>                                
                                        </c:otherwise>
                                    </c:choose>
                                </logic:equal>
                                <logic:equal name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="<%= EditPatronGeneralInfoForm.FIELD_DISTRICT_USER_ON_TRANSFER_ACTION %>" value="true"><%= MessageHelper.formatMessage("editsitepatroninfo_TransferTo") %>&nbsp;</logic:equal>
                                </td>
                                <td class="FormElement" colspan="3">
            
                                <base:selectSite 
                                    name='<%= EditPatronGeneralInfoForm.FIELD_SITEID %>' 
                                    submitOnChange="true" 
                                    selectedSiteID='<%=form.gimmeSelectedSiteID()%>'
                                    patronIDSiteLimiter='<%=form.getPatronID()%>'
                                    displaySitesWithPatron="false"
                                    includeLibrarySites="true"
                                    includeTextbookSites="true"
                                    includeMediaSites="<%=form.canDisplayMediaSites() %>"
                                    includeAssetSites="true"
                                    includeDistrictWarehouse="false"
                                    tabIndex = "30"
                                    mode="<%=SelectSiteTag.MODE_MEDIA%>"
                                    />
                                    <logic:notEqual name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="<%= EditPatronGeneralInfoForm.FIELD_ACTION %>" value="<%=EditPatronGeneralInfoForm.ACTION_CREATE %>">
                                    &nbsp;&nbsp;&nbsp;&nbsp;
                                    <c:choose>
                                        <c:when test="${sitePatron.preferredSite}">
                                           <base:image src="/icons/general/check.gif"/>&nbsp;<%=MessageHelper.formatMessage("editsitepatroninfo_PrimarySite") %>
                                        </c:when>
                                        <c:otherwise>
                                            <html:checkbox property="<%=EditPatronGeneralInfoForm.FIELD_MAKE_PRIMARY_SITE%>" tabindex="31"><%= MessageHelper.formatMessage("editsitepatroninfo_MakePrimarySite") %></html:checkbox>
                                            (All holds will be deleted)                                
                                        </c:otherwise>
                                    </c:choose>
                                    </logic:notEqual>
            
                                </td>
                          </c:if> 
    
                          <c:if test="${!form.displaySiteDropdown}">
                              <td class="FormLabel tdAlignRight">
                                <c:choose>
                                    <c:when test="${sitePatron.preferredSite}">
                                       <base:image src="/icons/general/home_red.gif" alt='<%=MessageHelper.formatMessage("editsitepatroninfo_PrimarySite") %>'/>
                                    </c:when>
                                    <c:otherwise>
                                       <base:image src="/icons/general/offsite.gif" alt='<%=MessageHelper.formatMessage("editsitepatroninfo_AdditionalSite") %>'/>                                
                                    </c:otherwise>
                                </c:choose>
                              &nbsp;
                              </td>
                           
                              <td class="ColRow" colspan="3"><%= form.gimmeEditingSiteName(sitePatron.getSiteID()) %>
                            <logic:notEqual name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="<%= EditPatronGeneralInfoForm.FIELD_ACTION %>" value="<%=EditPatronGeneralInfoForm.ACTION_CREATE %>">
                              &nbsp;&nbsp;&nbsp;
                            <c:choose>
                                <c:when test="${sitePatron.preferredSite}">
                                   <base:image src="/icons/general/check.gif"/>&nbsp;<%= MessageHelper.formatMessage("editsitepatroninfo_PrimarySite") %>
                                </c:when>
                                <c:otherwise>
                                    <c:if test="${!form.fromUploadClassJobSummary }">
                                        <html:checkbox property="<%=EditPatronGeneralInfoForm.FIELD_MAKE_PRIMARY_SITE%>" tabindex="31"><%= MessageHelper.formatMessage("editsitepatroninfo_MakePrimarySite") %></html:checkbox>                                
                                        (All holds will be deleted)                                
                                    </c:if>
                                </c:otherwise>
                            </c:choose>
                            </logic:notEqual>
                            <c:if test="${form.showAddAdditionalSite}">
                                &nbsp;
                                <base:genericButton name="<%= EditPatronGeneralInfoForm.BUTTON_NAME_TRANSFER + sitePatron.getSiteID() %>" alt='<%= MessageHelper.formatMessage("transfer") %>' src="/buttons/large/transferpatrons.gif"/>
                            </c:if>
                            
                              </td>
                          </c:if> 
                       </tr>
                   </base:isDistrictUser>
                   <tr>
                      <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editsitepatroninfo_Barcode") %>&nbsp;</td>
                      <td>
                        <logic:equal name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="showAssignNextBarcode" value="true">
                            <html:radio property="<%=EditPatronGeneralInfoForm.FIELD_ASSIGN_NEXT_BARCODE%>" value="<%=EditPatronGeneralInfoForm.RADIO_EXPLICIT_BARCODE%>"
                                onclick='<%="document." + EditPatronGeneralInfoForm.FORM_NAME + "." + EditPatronGeneralInfoForm.FIELD_BARCODE + ".focus();"%>' tabindex="32">
                            </html:radio>
                        </logic:equal>
                        <span onKeyPress="return trapEnter(event);">
                            <logic:equal name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="showAssignNextBarcode" value="true">
                                <html:text property="<%= EditPatronGeneralInfoForm.FIELD_BARCODE %>" size="20" maxlength="14"
                                    onfocus='<%="document." + EditPatronGeneralInfoForm.FORM_NAME + "." + EditPatronGeneralInfoForm.FIELD_ASSIGN_NEXT_BARCODE + "[0].checked = true"%>' tabindex="33"/>
                            </logic:equal>
                            <logic:equal name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="showAssignNextBarcode" value="false">
                                <html:text property="<%= EditPatronGeneralInfoForm.FIELD_BARCODE %>" size="20" maxlength="14" tabindex="33"/>
                            </logic:equal>
                        </span>
                      </td>
                      <td valign="top" class="FormLabel tdAlignRight" nowrap>
                      <bean:write filter="true" name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="userPrompt1" />&nbsp;
                      </td>
                      <td>
                      <html:text property="<%= EditPatronGeneralInfoForm.FIELD_USERFIELD_1 %>" size="25" maxlength="30" tabindex="40"/>
                      </td>
                   </tr>
                   <tr>
                      <td>
                         &nbsp;
                      </td>
                      <td class="ColRow">
                        <logic:equal name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="showAssignNextBarcode" value="true">
                            <html:radio property="<%=EditPatronGeneralInfoForm.FIELD_ASSIGN_NEXT_BARCODE%>" value="<%=EditPatronGeneralInfoForm.RADIO_ASSIGN_NEXT_BARCODE%>"
                                onclick='<%="document." + EditPatronGeneralInfoForm.FORM_NAME + "." + EditPatronGeneralInfoForm.FIELD_BARCODE + ".value = \'\'"%>' tabindex="34">
                                <%= MessageHelper.formatMessage("editsitepatroninfo_AssignNextBarcode") %>
                            </html:radio>
                            <%if(!StringHelper.isEmpty(form.getNextDisplayableBC())) { %>
                                <br>&nbsp;&nbsp;&nbsp;&nbsp;[<%= MessageHelper.formatMessage("editsitepatroninfo_NextBarcode", form.getNextDisplayableBC()) %>]
                            <% } %>
                        </logic:equal>
                        &nbsp;                              
                      </td>
                      <td valign="top" class="FormLabel tdAlignRight">
                      <bean:write filter="true" name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="userPrompt2" />&nbsp;
                      </td>
                      <td>
                      <html:text property="<%= EditPatronGeneralInfoForm.FIELD_USERFIELD_2 %>" size="25" maxlength="30" tabindex="41"/>
                      </td>
                   </tr>
                   <tr>
                      <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editsitepatroninfo_PatronType") %>&nbsp;</td>
                      <td class="FormElement">
                          <html:select property="<%= EditPatronGeneralInfoForm.FIELD_PATRON_TYPE_ID %>" tabindex="35">
                            <html:options collection="patronTypesID" property="longID"
                                          labelProperty="stringDesc"/>
                          </html:select>
                      </td>
                      <td valign="top" class="FormLabel tdAlignRight">
                      <bean:write filter="true" name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="userPrompt3" />&nbsp;
                      </td>
                      <td>
                      <html:text property="<%= EditPatronGeneralInfoForm.FIELD_USERFIELD_3 %>" size="25" maxlength="30" tabindex="42"/>
                      </td>
                   </tr>
                   <tr>
                      <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editsitepatroninfo_AccessLevel") %>&nbsp;</td>
                      <html:hidden property="<%=EditPatronGeneralInfoForm.FIELD_ASSET_TEMPLATE_GROUP_NAME%>"/>
                      
                      <% if (store.canView(Permission.BACK_OFFICE_EDIT_USER_ACCESS_LEVELS) || store.isDistrictUser()) { %>
                        <td class="FormElement">
                            <html:select onchange="javascript:submitTheForm()" property="<%= EditPatronGeneralInfoForm.FIELD_ACCESS_LEVEL_ID %>" tabindex="36">
                                <html:options collection="userLevelsList" property="longID" labelProperty="stringDesc"/>
                            </html:select>
                        </td>
                      <%} else { %>
                        <td class="ColRow">
                            <bean:write  filter="true" name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="accessLevelName"/>
                        </td>
                      <%} %>
                    
                      <td valign="top" class="FormLabel tdAlignRight">
                      <bean:write  filter="true" name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="userPrompt4" />&nbsp;
                      </td>
                      <td>
                      <html:text property="<%= EditPatronGeneralInfoForm.FIELD_USERFIELD_4 %>" size="25" maxlength="30" tabindex="43"/>
                      </td>
                   </tr>
                   <tr>
                      <td>&nbsp;</td>
                      <% if( !form.isEditingAssetSite() ) { %>
                        <td>&nbsp;</td>
                      <% }  else if (store.canView(Permission.BACK_OFFICE_EDIT_USER_ACCESS_LEVELS) || store.isDistrictUser()) { %>
                        <td class="FormElement">
                            <b>Resource Group:</b> <html:select property="<%= EditPatronGeneralInfoForm.FIELD_ASSET_TEMPLATE_GROUP_ID %>" tabindex="38">
                                <html:options collection="assetGroupList" property="longID" labelProperty="stringDesc"/>
                            </html:select>
                        </td>
                      <%} else { %>
                        <td class="ColRow">
                            <b>Resource Group:</b> <bean:write  filter="true" name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="assetTemplateGroupName"/>
                        </td>
                      <%} %>
                      
                      <td rowspan="2" valign="top" class="FormLabel tdAlignRight">
                      <bean:write filter="true" name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="userPrompt5" />&nbsp;
                      </td>
                      <td rowspan="2" valign="top">
                      <html:text property="<%= EditPatronGeneralInfoForm.FIELD_USERFIELD_5 %>" size="25" maxlength="30" tabindex="44"/>
                      </td>
                   </tr>
                   <tr>
                      <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editsitepatroninfo_Status") %>&nbsp;</td>
                      <td class="FormElement">
                      <html:select property="<%= EditPatronGeneralInfoForm.FIELD_STATUS %>" tabindex="37">
                        <html:options collection="patronStatusesID" property="statusCode"
                                      labelProperty="statusDesc"/>
                      </html:select>
                    </td>

                   </tr>
                   <tr>
                      <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editsitepatroninfo_CardExpires") %>&nbsp;</td>
                      <td>
                      <html:text property="<%= EditPatronGeneralInfoForm.FIELD_CARD_EXPIRES %>" size="10" maxlength="10" tabindex="38"/>
                      </td>
                      <td class="FormLabel" colspan="2"><%= MessageHelper.formatMessage("editsitepatroninfo_AcceptableUsePolicyOnFile") %>&nbsp;
                      <html:checkbox property="<%=EditPatronGeneralInfoForm.FIELD_ACCEPTABLE_USE_POLICY_ON_FILE%>" tabindex="45"> <%= MessageHelper.formatMessage("editsitepatroninfo_Yes") %></html:checkbox>
                      </td>
                   </tr>
                   <tr>
                      <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editsitepatroninfo_Homeroom") %>&nbsp;</td>
                      <td colspan="3">
                          <base:homeroomBySiteDropDown siteID="<%=form.getEditingSiteID() %>" 
                            currentSelection="<%=form.getHomeroomID() %>" 
                            showOnlyAssignedHomerooms="false"
                            tabIndex="39" 
                            fieldName="<%=EditPatronGeneralInfoForm.FIELD_HOMEROOM_ID %>"
                            displayNameForNoHomeroom='<%=MessageHelper.formatMessage("editsitepatroninfo_SelectAHomeroom") %>'/>
                            <base:isNotDistrictUser>
                                <base:spanIfAllowed permission="<%=Permission.BACK_OFFICE_SITE_ADMINISTRATION %>">
                                    &nbsp;
                                    <base:genericButton absbottom="true" 
                                    name="<%= EditPatronGeneralInfoForm.BUTTON_NAME_UPDATE_HOMEROOM %>" alt='<%= MessageHelper.formatMessage("other") %>' src="/buttons/large/other.gif"/>
                                </base:spanIfAllowed>
                            </base:isNotDistrictUser>
                      </td>
                    </tr>
                </c:if> 
            </logic:iterate>
      </logic:equal>
    </table>
