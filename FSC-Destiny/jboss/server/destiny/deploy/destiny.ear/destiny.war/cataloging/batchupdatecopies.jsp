<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@page import="com.follett.fsc.destiny.util.Barcode"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>



<%
    BatchUpdateForm form = (BatchUpdateForm)request.getAttribute(BatchUpdateForm.FORM_NAME);
%>
<bean:define id="conditions" name="<%= BatchUpdateForm.FORM_NAME %>" property="conditionOptions"/>
<bean:define id="locations" name="<%= BatchUpdateForm.FORM_NAME %>" property="locationsList"/>
<bean:define id="updateOptionDropdown1" name="<%= BatchUpdateForm.FORM_NAME %>" property="updateOptionDropdown1"/>
<bean:define id="updateOptionDropdown2" name="<%= BatchUpdateForm.FORM_NAME %>" property="updateOptionDropdown2"/>
<bean:define id="updateOptionDropdown3" name="<%= BatchUpdateForm.FORM_NAME %>" property="updateOptionDropdown3"/>
<bean:define id="categoryList" name="<%= BatchUpdateForm.FORM_NAME %>" property="categoryList"/>
<bean:define id="circTypeList" name="<%= BatchUpdateForm.FORM_NAME %>" property="circTypeList"/>

<script language="JavaScript" type="text/javascript">
<!--
function submitSiteChange() {
    document.<%=BatchUpdateForm.FORM_NAME%>.changedDropDown.value="true";    
    document.<%=BatchUpdateForm.FORM_NAME%>.submit();
}
//-->
 </script>
<base:messageBox strutsErrors="true"/>
<base:form action="/cataloging/servlet/handlebatchupdateform.do" enctype="multipart/form-data">
<html:hidden property="<%=BatchUpdateForm.PARAM_DISPLAY_DROPDOWN%>"/>
<input type="hidden" name="changedDropDown" />

<base:outlinedTableAndTabsWithinThere  width="100%" id="<%=UpdateCopiesBaseForm.TABLE_MAIN%>"  borderColor="#C0C0C0" selectedTab="<%=BatchUpdateForm.ID_TAB_BATCH_UPDATE%>" tabs="<%=form.getTabs()%>" >
<tr>
    <td>
        <table border="0" cellspacing="0" cellpadding="0" width="100%" id="<%=BatchUpdateForm.TABLE_HEADER%>">
            <tr>                    
                <%   
                    if (form.isDisplayDropdown()) { %>
                        <td class="TableHeading" colspan="2">
                                <%= MessageHelper.formatMessage("batchupdatecopies_UpdateTheFollowing") %>&nbsp;<html:select onchange="this.form.submit()" styleClass="TableHeading" property="<%=BatchUpdateForm.FIELD_COLLECTION_TYPE%>">
                                <html:option value="<%= String.valueOf(CollectionType.LIBRARY)%>"><%=CollectionType.getDisplayable(CollectionType.LIBRARY)%></html:option>
                                <html:option value="<%= String.valueOf(CollectionType.TEXTBOOK)%>"><%=CollectionType.DISPLAYABLE_TEXTBOOK%></html:option>
                            </html:select>&nbsp;<%= MessageHelper.formatMessage("batchupdatecopies_Information") %></td>
                 <% } else { %>
                        <td class="TableHeading" colspan="2">
                            <%= MessageHelper.formatMessage("batchupdatecopies_UpdateTheFollowingInformation",CollectionType.getDisplayable(form.getCollectionType())) %>
                        </td>
                 <% } %>
            </tr>

            <logic:equal name="<%=BatchUpdateForm.FORM_NAME%>" property="<%=BatchUpdateForm.FIELD_COLLECTION_TYPE%>" value="<%=String.valueOf(CollectionType.TEXTBOOK)%>">
                <tr>
                    <td>&nbsp;</td>
                    <td valign="top">
                        <table border="0" cellpadding="3" cellspacing="0" width="97%" id="<%=BatchUpdateForm.TABLE_DELETE_OR_UPDATE_COPY_ACTION%>">
                            <html:hidden property="deleteFrom"/>
                            <tr>
                                <td class="ColRowBold tdAlignRight"><nobr><html:radio property="<%=BatchUpdateForm.FIELD_UPDATE_MODE%>" value="<%=BatchUpdateForm.UPDATE_MODE_CONDITION%>"/><%= MessageHelper.formatMessage("batchupdatecopies_ConditionTo_selected_condition_option") %></nobr></td>
                                <td class="ColRowBold">
                                    <html:select property="<%=BatchUpdateForm.FIELD_COPY_CONDITION%>">
                                        <html:options collection="conditions" property="longID" labelProperty="stringDesc"/>
                                    </html:select>
                                </td>
                            </tr>
                            <tr>
                                <td class="ColRowBold tdAlignRight"><nobr><html:radio property="<%=BatchUpdateForm.FIELD_UPDATE_MODE%>" value="<%=BatchUpdateForm.UPDATE_MODE_LOCATION%>"/>&nbsp;<%= MessageHelper.formatMessage("batchupdatecopies_LocationTo_selected_location") %>&nbsp;</nobr></td>
                                <td class="ColRowBold">
                                    <html:select property="<%=BatchUpdateForm.FIELD_TEXTBOOK_LOCATION%>">
                                        <html:options collection="locations" property="locationID" labelProperty="name"/>
                                    </html:select>
                                    <base:spanIfAllowed permission="<%=Permission.CAT_MANAGE_LOCATIONS %>">
                                    &nbsp;
                                    <base:genericButton src="/buttons/large/other.gif" name="<%=BatchUpdateForm.BUTTON_LOCATION_OTHER%>" alt='<%= MessageHelper.formatMessage("other") %>'/>
                                    </base:spanIfAllowed>
                                </td>
                            </tr>
                            <tr>
                                <td class="ColRowBold tdAlignRight"><nobr><%= MessageHelper.formatMessage("batchupdatecopies_UploadFile") %></nobr></td>
                                <td class="ColRowBold"><html:file property="<%=BatchUpdateForm.FIELD_UPLOAD_FILE%>" size="40"/></td>
                            </tr>
                        </table>
                    </td>
                </tr>        
            </logic:equal>
        
            <logic:notEqual name="<%=BatchUpdateForm.FORM_NAME%>" property="<%=BatchUpdateForm.FIELD_COLLECTION_TYPE%>" value="<%=String.valueOf(CollectionType.TEXTBOOK)%>">
                <html:hidden property="<%=BatchUpdateForm.FIELD_TEXTBOOK_LOCATION%>"/>
                <html:hidden property="<%=BatchUpdateForm.FIELD_COPY_CONDITION%>"/>

                <base:isMediaSite showForMedia="false">
                    <% if (form.isDistrictCataloger() ) { %>
                        <tr>
                            <td colspan="2">&nbsp;</td>
                        </tr>
                        <tr>
                            <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("batchupdatecopies_Site_prompt") %>:&nbsp;</td>
                            <td>
                                <base:selectSite onChangeAction="submitSiteChange();"
                                                 includeFromDistrict="false"
                                                 useSelectASite="true"
                                                 selectedSiteID="<%=form.getSelectedSiteForDistrict() %>"
                                                 includeAllLibraries="false"
                                                 includeLibrarySites="true"
                                                 collectionType="<%=CollectionType.LIBRARY %>"
                                                 name="<%=UpdateCopiesBaseForm.FIELD_SELECTED_SITE_FOR_DISTRICT%>" />
                            </td>
                        </tr>
                    <% } %>
                </base:isMediaSite>
                <% if (form.isDisplayDropdowns()) {%>
                <tr>
                    <td colspan="2">            
                        <table border="0" cellspacing="0" cellpadding="1" width="100%" id="<%=BatchUpdateForm.TABLE_UPDATE_COPIES_DROPDOWNS %>">
                            <tr>
                                <td colspan="4">
                                    &nbsp;
                                </td>
                            </tr>                        
                            <% for (int i=1; i < 4; i++) { %>                                  
                                <tr>
                                    <td width="20%">
                                        &nbsp;
                                    </td>
                                    <td>
                                        <html:select style="width: 200px" onchange="this.form.submit()" property="<%=BatchUpdateForm.getFieldUpdateOption(i)%>">
                                            <html:options collection="<%=BatchUpdateForm.getFieldUpdateDropdownOption(i) %>" property="longID" labelProperty="stringDesc"/>
                                        </html:select>                            
                                    </td>
                                                        
                                    <logic:equal name="<%=BatchUpdateForm.FORM_NAME%>" property="<%=BatchUpdateForm.getFieldUpdateOption(i)%>" value="<%=String.valueOf(BatchUpdateForm.UPDATE_OPTION_VALUE_CATEGORY)%>">
                                    
                                        <% if (form.getCategoryList().size() > 0) { %>
                                            <td class="ColRowBold">&nbsp;<%= MessageHelper.formatMessage("batchupdatecopies_Of_selected_category_list_option") %>&nbsp;</td>
                                            <td  width="100%" >
                                                <html:select property="<%=(BatchUpdateForm.PARAM_CATEGORY_ID + i)%>">
                                                    <html:options collection="categoryList" property="longID" labelProperty="stringDesc"/>
                                                </html:select>
                                            </td>                                    
                                        <% } else { %>
                                            <td>
                                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                            </td>
                                            <td class="ColRowBold" width="100%" ><%= MessageHelper.formatMessage("batchupdatecopies_NoCategoriesDefined") %></td>
                                        <% } %>
                                    </logic:equal>
                                
                                    <logic:equal name="<%=BatchUpdateForm.FORM_NAME%>" property="<%=BatchUpdateForm.getFieldUpdateOption(i)%>" value="<%=String.valueOf(BatchUpdateForm.UPDATE_OPTION_VALUE_CIRC_TYPE)%>">
                                        <td class="ColRowBold">&nbsp;:&nbsp;</td>                            
                                        <td width="100%">
                                            <html:select property="<%=BatchUpdateForm.PARAM_CIRC_TYPE_ID%>">
                                                <html:options collection="circTypeList" property="longID" labelProperty="stringDesc"/>
                                            </html:select>
                                        </td>
                                    </logic:equal>
                                    
                                    <logic:equal name="<%=BatchUpdateForm.FORM_NAME%>" property="<%=BatchUpdateForm.getFieldUpdateOption(i)%>" value="<%=String.valueOf(BatchUpdateForm.UPDATE_OPTION_VALUE_CAll_NUMBER_PREFIX)%>">
                                        <td class="ColRowBold">&nbsp;:&nbsp;</td>                                
                                        <td width="100%">
                                            <html:text property="<%=BatchUpdateForm.FIELD_CALL_NUMBER_PREFIX %>"></html:text>
                                        </td>    
                                    </logic:equal>
                                    
                                </tr>
                           <% } %>
                            <tr>
                                <td colspan="4">
                                    &nbsp;
                                </td>
                            </tr>                             
                           </table>
                       </td>
                </tr>
                <%} %>
                <!-- barcode list vs resource list -->
                <tr>
                    <td colspan="2">
                     <table id="<%=BatchUpdateForm.TABLE_SELECT_COPIES %>" width="100%">
                      <tr>
                          <td>
                              &nbsp;
                          </td>
                          <td>
                            <base:TitleSelectionRange 
                                selectBy="<%=form.getSelectBy()%>" 
                                showBarcodeFileUploadButton="true"
                                selectByOnChangeFieldName="selectByChanged"
                                excludedOptions="<%=form.getExcludedOptions()%>"
                                showBookListItButton="false"
                                disableBookListOptionForDistrictUser="false"
                                formName ="<%=BatchUpdateForm.FORM_NAME %>"
                                selectedListIDFieldName = "<%=BatchUpdateForm.FIELD_SELECTED_LISTID %>"
                                />
                          </td>
                      </tr>
                      </table>
                    </td>
                </tr>                

            </logic:notEqual>
            
            <tr valign="top">
                <td valign="top" colspan="2" align="center" class="ColRowBold">
                    <%= GenericForm.getLastBackupDisplayMsg(true) %>
                </td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRowBold" colspan="2">
                    <base:showHideTag id="hideIt">
                    <base:genericButton onclick="hideElementhideIt()" src="/buttons/large/updatecopies.gif" name="<%=BatchUpdateForm.ID_BUTTON_UPDATE_COPIES%>" alt='<%=MessageHelper.formatMessage("update")%>'/>
                    </base:showHideTag>
                </td>
            </tr>
        </table>

    </td>
</tr>
</base:outlinedTableAndTabsWithinThere>
</base:form>

<jsp:include page="/circulation/setsound.jsp"/>
<logic:present name="<%=BatchUpdateForm.FORM_NAME%>" property="soundFile" scope="request" >
<script language="JavaScript" type="text/javascript">
<!--
setSound("<bean:write name="<%=BatchUpdateForm.FORM_NAME%>" property="soundFile"/>");
//-->
 </script>
</logic:present>
