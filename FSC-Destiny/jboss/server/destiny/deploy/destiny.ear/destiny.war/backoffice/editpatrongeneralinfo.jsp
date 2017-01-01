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
<%@page import="com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag"%>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@ page import="org.apache.struts.util.ResponseUtils"%>

<%@page import="com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.EmailSpecs"%>
<bean:define id="form" name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" type="com.follett.fsc.destiny.client.backoffice.servlet.EditPatronGeneralInfoForm" />
<bean:define id="gendersID" name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="genders"/>
<bean:define id="patronTypesID" name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="patronTypes"/>
<bean:define id="patronStatusesID" name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="patronStatuses"/>
<bean:define id="userLevelsList" name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="userLevels"/>
<bean:define id="manageReadingPathsOptions" name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="manageReadingPathsOptions"/>

<base:messageBox strutsErrors="true">
    <logic:equal name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="<%= EditPatronGeneralInfoForm.FIELD_SHOW_DUPLICATE_BARCODE_MESSAGE %>" value="true">
        <tr>
            <td><base:imageSpacer width="31" height="5"/></td>
            <td>                                    
                <base:patronSearchResultDisplay patronValue="<%=form.getDuplicateBarcodePatronValue() %>"  printerFriendly="false" displayButtons="false"/>
            </td>
        </tr>
    </logic:equal>
</base:messageBox>            


<%-- @include file="/common/trapenter.jsp" --%>
<%-- Delete this code and enable the above include after fixing compile jsp --%>
<script language="JavaScript">
<!--
    function trapEnter(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        return false;
      }
      return true;
    }
//-->
</script>


<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );

    LocaleHelper lh = UserContext.getMyContextLocaleHelper();

    String focus = "";
    if(form.getPage() == EditPatronGeneralInfoForm.PAGE_INDEX_GENERAL) {
        if((EditPatronGeneralInfoForm.ACTION_EDIT_SITE.equals(form.getAction()) | EditPatronGeneralInfoForm.ACTION_ATTACH.equals(form.getAction())) && (form.getAssignNextBarcode().equals(EditPatronGeneralInfoForm.RADIO_EXPLICIT_BARCODE))) {
            focus = EditPatronGeneralInfoForm.FIELD_BARCODE;
        } else {
            focus = EditPatronGeneralInfoForm.FIELD_LAST_NAME;
        }
    } else if (form.getPage() == EditPatronGeneralInfoForm.PAGE_INDEX_ADDRESS) {
        focus = EditPatronGeneralInfoForm.FIELD_ADDRESS_1_LINE1;
    } 
%>
<logic:equal name="<%=EditPatronGeneralInfoForm.FORM_NAME%>" property="patronPresent" value="true">
<base:form action="/backoffice/servlet/handleeditpatrongeneralinfoform.do" enctype="multipart/form-data" focus="<%= focus %>">
    <logic:equal name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="<%= EditPatronGeneralInfoForm.FIELD_SHOW_DELETE_MESSAGE %>" value="true">
        <base:messageBox showWarningIcon="true" message="<%=form.gimmeDisplayableDeleteMessage()%>">
            <tr valign="top">
                <td class="Error" colspan="2">
                    <bean:size id="numMsgs" name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="confirmationMessageList"/>
                    <logic:notEqual name="numMsgs" value="0">
                            <logic:equal name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="<%= EditPatronGeneralInfoForm.PARAM_CAN_DELETE_PATRON %>" value="true"><%= MessageHelper.formatMessage("editpatrongeneralinfo_TheFollowingActionsWillBeTakenIfThisPatronIsRemove") %></logic:equal>
                            <ul>
                            <logic:iterate id="messages" name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="confirmationMessageList">
                                <li><%= messages%></li>
                            </logic:iterate>
                            
                        </ul>
                    </logic:notEqual>
                </td>
            </tr>
            <logic:equal name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="showNeedReassignPreferred" value="true">
            <tr>
                <td>&nbsp;</td>
                <bean:define id="associatedList" name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="reassignPrimaryPatronList"/>
                <td class="ColRowBold" align="center"><%= MessageHelper.formatMessage("editpatrongeneralinfo_YouMustSelectANewPrimarySiteForThisPatron") %><html:select property="<%= EditPatronGeneralInfoForm.FIELD_REASSIGN_TO_ID %>">
                        <html:options collection="associatedList" property="longID" labelProperty="stringDesc"/>
                    </html:select>
                </td>
            </tr>
            </logic:equal>
            <logic:equal name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="<%= EditPatronGeneralInfoForm.PARAM_CAN_DELETE_PATRON %>" value="true">
            <tr>
                <td align="center" class="ColRow" colspan="2"><%= MessageHelper.formatMessage("editpatrongeneralinfo_AreYouSureYouWantToRemoveThisSiteAssociation") %></td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2">
                    <base:yesNo/>
                </td>
            </tr>
            </logic:equal>
        </base:messageBox>
    
    </logic:equal>
    <logic:equal name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="<%= EditPatronGeneralInfoForm.FIELD_SHOW_TRANSFER_MESSAGE %>" value="true">
        <base:messageBox showWarningIcon="true" message="<%=form.gimmeDisplayableTransferMessage()%>">
            <logic:equal name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="<%= EditPatronGeneralInfoForm.PARAM_CAN_TRANSFER_PATRON %>" value="true">
            <tr>
                <td align="center" class="ColRow" colspan="2"><%= MessageHelper.formatMessage("editpatrongeneralinfo_AreYouSureYouWantToTransferThisPatron") %></td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2">
                    <base:yesNo/>
                </td>
            </tr>
            </logic:equal>
        </base:messageBox>
    
    </logic:equal>
    
    <logic:equal name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="<%= EditPatronGeneralInfoForm.FIELD_SHOW_REPLACEMENT_MESSAGE %>" value="true">
        <base:messageBox showWarningIcon="true" message="<%= form.buildDuplicateDistrictIDMessage() %>">
            <tr>
                <td><base:imageSpacer width="31" height="5"/></td>
                <td>                                    
                    <base:patronSearchResultDisplay patronValue="<%=form.getDistrictPatronValue() %>" printerFriendly="false" displayButtons="false"/>
                </td>
            </tr>
            <logic:equal name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="<%= EditPatronGeneralInfoForm.FIELD_SHOW_REPLACEMENT_CONFIRMATION %>" value="true">
            <tr>
                <td><base:imageSpacer width="31" height="5"/></td>
                <td>
                    <span class="ColRowBold"><%= MessageHelper.formatMessage("editpatrongeneralinfo_WhatDoYouWantToDo") %></span>
                </td>
            </tr>
            <tr>
                <td><base:imageSpacer width="31" height="5"/></td>
                <td>
                    <span class="ColRow">
                        &nbsp;&nbsp;<html:radio property="<%=EditPatronGeneralInfoForm.FIELD_REPLACE_OPTION%>" value="true"><%= MessageHelper.formatMessage("editpatrongeneralinfo_UseThisPatronReplacingThePatronInformationEnteredB") %></html:radio>
                    </span>
                </td>
            </tr>
            <tr>
                <td><base:imageSpacer width="31" height="5"/></td>
                <td>
                    <span class="ColRow">
                        &nbsp;&nbsp;<html:radio property="<%=EditPatronGeneralInfoForm.FIELD_REPLACE_OPTION%>" value="false"><%= MessageHelper.formatMessage("editpatrongeneralinfo_GoBackToTheRecordAndModifyTheDistrictID") %></html:radio>
                    </span>
                </td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2">
                    <input type="submit" name="<%=EditPatronGeneralInfoForm.BUTTON_NAME_CONFIRM_REPLACE%>" value='<%=MessageHelper.formatMessage("ok")%>'>
                </td>
            </tr>
            </logic:equal>
        </base:messageBox>
    </logic:equal>
    <logic:equal name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="showConfirmation" value="true">
        <%
            String message = form.getConfirmMessage();
        %>
        <base:messageBox showWarningIcon="true" message="<%=message%>" filterMessage="false">
        <tr>
            <td>&nbsp;</td>
            <td align="center" class="ColRow"><%= MessageHelper.formatMessage("editpatrongeneralinfo_ClickYesToSaveYourChanges") %></td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td valign="baseline" align="center" class="ColRow">
				<base:yesButton/>
				<base:noButton name="<%=EditPatronGeneralInfoForm.BUTTON_NAME_NO%>"/>
            </td>
        </tr>
        </base:messageBox>

    </logic:equal>


<%--
This hidden input tells us the page number of each JSP. We'll eventually use
this property to do error checking on each form. We also MUST keep the hidden
"action" property. We don't need it for passing the action property through
the Patron Edit form (because the Patron Edit form has Session scope). However,
if we hit the Cancel button the Patron Lookup form will expect to see the
action property!
--%>
<base:isNotMacBrowser>
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=EditPatronGeneralInfoForm.BUTTON_ENTER%>">
</base:isNotMacBrowser>
<html:hidden property="<%= EditPatronGeneralInfoForm.FIELD_PAGE %>"/>
<html:hidden property="<%= EditPatronGeneralInfoForm.FIELD_ACTION %>"/>
<html:hidden property="<%= EditPatronGeneralInfoForm.FIELD_REPLACEMENT_PATRON_ID %>"/>
<html:hidden property="<%= EditPatronGeneralInfoForm.FIELD_ORIGINAL_SITEID %>"/>
<html:hidden property="<%= EditPatronGeneralInfoForm.FIELD_CLASS_XML_SECTION_IDS %>"/>
<html:hidden property="<%= EditPatronGeneralInfoForm.FIELD_STATUS_CLEARED %>"/>
<logic:equal name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="<%= EditPatronGeneralInfoForm.FIELD_DISTRICT_USER_ON_ATTACH_ACTION %>" value="true">
    <html:hidden property="<%= EditPatronGeneralInfoForm.FIELD_LAST_NAME %>"/>
    <html:hidden property="<%= EditPatronGeneralInfoForm.FIELD_FIRST_NAME %>"/>
    <html:hidden property="<%= EditPatronGeneralInfoForm.FIELD_MIDDLE_NAME %>"/>
    <html:hidden property="<%= EditPatronGeneralInfoForm.FIELD_NICKNAME %>"/>
    <html:hidden property="<%= EditPatronGeneralInfoForm.FIELD_DISTRICT_ID %>"/>
    <html:hidden property="<%= EditPatronGeneralInfoForm.FIELD_GENDER %>"/>
    <html:hidden property="<%= EditPatronGeneralInfoForm.FIELD_GRAD_YEAR %>"/>
    <html:hidden property="<%= EditPatronGeneralInfoForm.FIELD_GRADE_LEVEL %>"/>
    <html:hidden property="<%= EditPatronGeneralInfoForm.FIELD_EMAIL1 %>"/>
    <html:hidden property="<%= EditPatronGeneralInfoForm.FIELD_EMAIL2 %>"/>
    <html:hidden property="<%= EditPatronGeneralInfoForm.FIELD_LOGIN_ID %>"/>
    <html:hidden property="<%= EditPatronGeneralInfoForm.FIELD_PASSWORD %>"/>
    <html:hidden property="<%= EditPatronGeneralInfoForm.FIELD_CONFIRM_PASSWORD %>"/>
    <html:hidden property="<%= EditPatronGeneralInfoForm.PARAM_ASSIGNED_PASSWORD %>"/>
    <html:hidden property="<%= EditPatronGeneralInfoForm.FIELD_TEACHER %>"/>
</logic:equal>

<base:outlinedTableAndTabsWithinThere id="<%=EditPatronGeneralInfoForm.TABLE_PATRON_OUTLINE%>"  selectedTabID="<%=form.gimmeSelectedTabID()%>" selectedTab="<%=form.gimmeSelectedTab()%>" tabs="<%=form.gimmeTabs()%>" >
    <tr>
       <td class="tdAlignRight">
           <base:isNotMacBrowser>
               <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="Save Patron"  name="savePatronOnEnter">
           </base:isNotMacBrowser>
            <base:showHideTag id="topSaveButton">
           <base:saveButton onclick="hideButtonsWithinThere()"/>
           &nbsp;
            <c:if test="${form.showAddAdditionalSite}">
                <base:genericButton onclick="hideButtonsWithinThere()" name="<%= EditPatronGeneralInfoForm.BUTTON_NAME_ADD_SITE %>" alt='<%= MessageHelper.formatMessage("addAdditionalSite") %>' src="/buttons/large/addsite.gif"/>
               &nbsp;
           </c:if>
           <base:cancelButton onclick="hideButtonsWithinThere()"/>
            </base:showHideTag>
       </td>
    </tr>
    
    <c:choose>
       <c:when test="<%=form.getPage() == EditPatronGeneralInfoForm.PAGE_INDEX_GENERAL %>">
            <tr>
                <td>
                    <table id="<%= EditPatronGeneralInfoForm.TABLE_PATRON_EDIT_BOX %>" border="0" width="100%">
                        <c:if test="<%=form.getPage() == EditPatronGeneralInfoForm.PAGE_INDEX_GENERAL %>">
                        <tr>
                           <td class="Instruction"><%= MessageHelper.formatMessage("editpatrongeneralinfo_RequiredField") %></td>
                        </tr>
                        </c:if>
                       <tr>
                          <td colspan="4"><span class="TableHeading"><%= MessageHelper.formatMessage("editpatrongeneralinfo_PatronInformation") %></span> <span class="ColRow"><%=form.gimmeLastSaved() %></span></td>
                       </tr>
                        <logic:equal name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="<%= EditPatronGeneralInfoForm.FIELD_DISTRICT_USER_ON_ATTACH_ACTION %>" value="true">
                            <tr>
                               <td colspan="4">
                                    <base:patronSearchResultDisplay patronValue="<%=form.getDistrictPatronValue() %>" printerFriendly="false" displayButtons="false"/>
                               </td>
                            </tr>
                        </logic:equal>
                    
                        <logic:equal name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="<%= EditPatronGeneralInfoForm.FIELD_DISTRICT_USER_ON_ATTACH_ACTION %>" value="false">
                           <tr>
                              <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpatrongeneralinfo_LastName") %>&nbsp;</td>
                              <td>
                                 <html:text property="<%= EditPatronGeneralInfoForm.FIELD_LAST_NAME %>" size="20" maxlength="42" tabindex="1"/>
                              </td>
                              <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpatrongeneralinfo_FirstName") %></td>
                              <td>
                                 <html:text property="<%= EditPatronGeneralInfoForm.FIELD_FIRST_NAME %>" size="20" maxlength="42" tabindex="2"/>
                              </td>
                           </tr>
                           <tr>
                              <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpatrongeneralinfo_MiddleName") %>&nbsp;</td>
                              <td>
                                 <html:text property="<%= EditPatronGeneralInfoForm.FIELD_MIDDLE_NAME %>" size="20" maxlength="42" tabindex="3"/>
                              </td>
                              <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpatrongeneralinfo_Nickname") %></td>
                              <td>
                                 <html:text property="<%= EditPatronGeneralInfoForm.FIELD_NICKNAME %>" size="20" maxlength="30" tabindex="4"/>
                              </td>
                           </tr>
                           <tr><td colspan="3">&nbsp;</td></tr>
                           <tr>
                              <td class="FormLabel tdAlignRight">
                                <logic:equal name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="districtIDRequired" value="true">
                                *&nbsp;
                                </logic:equal>
                                <%=PatronSpecs.getDistrictIDPrompt() %>&nbsp;
                              </td>
                              <td>
                                 <html:text property="<%= EditPatronGeneralInfoForm.FIELD_DISTRICT_ID %>" size="20" maxlength="40" tabindex="5"/>
                              </td>
                              <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpatrongeneralinfo_Email1") %></td>
                              <td>
                                 <html:text property="<%= EditPatronGeneralInfoForm.FIELD_EMAIL1 %>" size="20" maxlength='<%="" + EmailSpecs.EMAIL_MAX_LENGTH %>' tabindex="21"/>
                              </td>
                           </tr>
                           <tr>
                              <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpatrongeneralinfo_Gender") %>&nbsp;</td>
                              <td>
                                  <html:select property="<%= EditPatronGeneralInfoForm.FIELD_GENDER %>" tabindex="6">
                                    <html:options collection="gendersID" property="stringCode"
                                                  labelProperty="stringDesc"/>
                                  </html:select>
                              </td>
                              <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpatrongeneralinfo_Email2") %></td>
                              <td>
                                 <html:text property="<%= EditPatronGeneralInfoForm.FIELD_EMAIL2 %>" size="20" maxlength='<%="" + EmailSpecs.EMAIL_MAX_LENGTH %>' tabindex="22"/>
                              </td>
                           </tr>
                           <tr>
                              <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpatrongeneralinfo_Birthdate") %>&nbsp;</td>
                              <td>
                                <html:text property="<%= EditPatronGeneralInfoForm.FIELD_BIRTH_DATE %>" size="10" maxlength="10" tabindex="7"/>
                              </td>
                              
                               <% if (store.canView(Permission.BACK_OFFICE_EDIT_PASSWORDS_LOGINS)) { %>
                                  <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpatrongeneralinfo_UserName") %></td>
                                  <td>
                                     <html:text property="<%= EditPatronGeneralInfoForm.FIELD_LOGIN_ID %>" size="20" maxlength="50" tabindex="23"/>
                                  </td>
                              <% } else { %>
                                  <td colspan="2">&nbsp;</td>
                              <% } %>
                           </tr>
                           <tr>
                              <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpatrongeneralinfo_GradYear") %>&nbsp;</td>
                              <td>
                                <html:text property="<%= EditPatronGeneralInfoForm.FIELD_GRAD_YEAR %>" size="10" maxlength="4" tabindex="8"/>
                              </td>
                              
                               <% if (store.canView(Permission.BACK_OFFICE_EDIT_PASSWORDS_LOGINS)) { %>
                                  <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpatrongeneralinfo_NewPassword") %></td>
                                  <td>
                                    <input type="password" name="<%=EditPatronGeneralInfoForm.FIELD_PASSWORD%>" size="20" maxlength="50" redisplay="true" tabindex="24" autocomplete="off" value='<%= form.getPassword() == null ? "" : form.getPassword() %>'/>
                                  </td>
                              <% } else { %>
                                  <td colspan="2">&nbsp;</td>
                              <% } %>
                              
                           </tr>
                           <tr>
                              <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpatrongeneralinfo_GradeLevel") %>&nbsp;</td>
                              <td>
                                <html:text property="<%= EditPatronGeneralInfoForm.FIELD_GRADE_LEVEL %>" size="10" maxlength="30" tabindex="9"/>
                              </td>
                               <% if (store.canView(Permission.BACK_OFFICE_EDIT_PASSWORDS_LOGINS)) { %>
                                  <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpatrongeneralinfo_ConfirmPassword") %></td>
                                  <td>
                                     <input type="password" name="<%=EditPatronGeneralInfoForm.FIELD_CONFIRM_PASSWORD%>" size="20" maxlength="50" redisplay="true" tabindex="25" autocomplete="off" value='<%= form.getConfirmPassword() == null ? "" : form.getConfirmPassword() %>'/>
                                  </td>
                              <% } else { %>
                                  <td colspan="2">&nbsp;</td>
                              <% } %>
                           </tr>
                           <tr><!-- could be ManageReadingPaths or IsTeaching or blank on left -->
                           <c:choose>
                            <c:when test="<%=form.isLibraryProductSupported() %>">
                                  <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpatrongeneralinfo_ManagesReadingPaths") %>&nbsp;</td>
                                  <td class="FormLabel">
	                                  <html:select property="<%= EditPatronGeneralInfoForm.FIELD_MANAGE_READING_PATHS %>" tabindex="10">
	                                    <html:options collection="manageReadingPathsOptions" property="stringCode"
	                                                  labelProperty="stringDesc"/>
	                                  </html:select>
                                  </td>
                             </c:when>
                            <c:when test="<%= !form.isLibraryProductSupported() && (form.isTextbookProductSupported() || form.isAssetProductSupported()) && !form.isFromUploadClassJobSummary() %>">
                                  <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpatrongeneralinfo_CurrentlyTeaching") %>&nbsp;</td>
                                  <td class="FormLabel">
                                        <html:hidden property="<%=EditPatronGeneralInfoForm.FIELD_MANAGE_READING_PATHS%>"/>
                                        <html:checkbox property="<%=EditPatronGeneralInfoForm.FIELD_TEACHER%>" tabindex="11"><%= MessageHelper.formatMessage("editpatrongeneralinfo_Yes") %></html:checkbox>
                                  </td>
                             </c:when>
                             <c:otherwise>
                                  <td colspan="2">
                                    &nbsp;
                                  </td>
                                <html:hidden property="<%=EditPatronGeneralInfoForm.FIELD_MANAGE_READING_PATHS%>"/>
                                <html:hidden property="<%=EditPatronGeneralInfoForm.FIELD_TEACHER%>"/>                                
                             </c:otherwise>
                           </c:choose>
                           <c:choose>
                            <c:when test="<%=form.isAssignedPassword() %>">
                                <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpatrongeneralinfo_PasswordAssigned") %></td>
                                <td class="ColRow">
                                    <html:checkbox property="<%=EditPatronGeneralInfoForm.FIELD_CLEAR_PASSWORD%>" tabindex="26"><%= MessageHelper.formatMessage("editpatrongeneralinfo_ClearPassword") %></html:checkbox>
                                </td>
                            </c:when>
                             <c:otherwise>
                                  <td colspan="2">
                                    &nbsp;
                                  </td>
                             </c:otherwise>
                            </c:choose>
                            </tr>
                            
                           <tr><!-- could be IsTeaching or blank on left -->
                           <c:choose>
                            <c:when test="<%=form.isLibraryProductSupported() && (form.isTextbookProductSupported() || form.isAssetProductSupported()) && !form.isFromUploadClassJobSummary() %>">
                                  <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpatrongeneralinfo_CurrentlyTeaching") %>&nbsp;</td>
                                  <td class="FormLabel">
                                        <html:checkbox property="<%=EditPatronGeneralInfoForm.FIELD_TEACHER%>" tabindex="12"><%= MessageHelper.formatMessage("editpatrongeneralinfo_Yes") %></html:checkbox>
                                  </td>
                             </c:when>
                             <c:otherwise>
                                  <td colspan="2">
                                    &nbsp;
                                  </td>
                             </c:otherwise>
                           </c:choose>
                              <td colspan="2">
                                &nbsp;
                              </td>
                            </tr>
                            
                         </logic:equal>
                     </table>
                </td>
             </tr>
             
           <tr>
              <td>
                 <jsp:include page="/backoffice/editsitepatroninfo.jsp" />
               </td>
            </tr>
                
             
       </c:when>
       <c:when test="<%=form.getPage() == EditPatronGeneralInfoForm.PAGE_INDEX_ADDRESS %>">
          <tr>
             <td>
                <table id="<%= EditPatronGeneralInfoForm.TABLE_PATRON_ADDRESS_BOX %>" border="0" width="100%">
                   <tr>
                      <td class="TableHeading" colspan="4"><%= MessageHelper.formatMessage("editpatrongeneralinfo_AddressInformation0", ResponseUtils.filter(form.gimmePatronAddressInfo())) %></td>
                   </tr>
                   <tr>
                      <td colspan="2" align="Center" class="FormLabel"><%= MessageHelper.formatMessage("editpatrongeneralinfo_PrimaryInformation") %></td>
                      <td colspan="2" align="Center" class="FormLabel"><%= MessageHelper.formatMessage("editpatrongeneralinfo_SecondaryInformation") %></td>
                   </tr>
                   <tr>
                      <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpatrongeneralinfo_Address") %>&nbsp;</td>
                      <td><html:text property="<%= EditPatronGeneralInfoForm.FIELD_ADDRESS_1_LINE1 %>" size="25" maxlength="42" tabindex="1"/></td>
                      <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpatrongeneralinfo_Address") %>&nbsp;</td>
                      <td><html:text property="<%= EditPatronGeneralInfoForm.FIELD_ADDRESS_2_LINE1 %>" size="25" maxlength="42" tabindex="8"/></td>
                   </tr>
                   <tr>
                      <td class="FormLabel tdAlignRight">&nbsp;</td>
                      <td><html:text property="<%= EditPatronGeneralInfoForm.FIELD_ADDRESS_1_LINE2 %>" size="25" maxlength="42" tabindex="2"/></td>
                      <td class="FormLabel tdAlignRight">&nbsp;</td>
                      <td><html:text property="<%= EditPatronGeneralInfoForm.FIELD_ADDRESS_2_LINE2 %>" size="25" maxlength="42" tabindex="9"/></td>
                   </tr>
                   <tr>
                      <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpatrongeneralinfo_City") %>&nbsp;</td>
                      <td><html:text property="<%= EditPatronGeneralInfoForm.FIELD_ADDRESS_1_CITY %>" size="25" maxlength="42" tabindex="3"/></td>
                      <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpatrongeneralinfo_City") %>&nbsp;</td>
                      <td><html:text property="<%= EditPatronGeneralInfoForm.FIELD_ADDRESS_2_CITY %>" size="25" maxlength="42" tabindex="10"/></td>
                   </tr>
                   <tr>
                      <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpatrongeneralinfo_StateProvince", "<br>") %>&nbsp;</td>
                      <td><html:text property="<%= EditPatronGeneralInfoForm.FIELD_ADDRESS_1_STATE %>" size="25" maxlength="42" tabindex="4"/></td>
                      <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpatrongeneralinfo_StateProvince", "<br>") %>&nbsp;</td>
                      <td><html:text property="<%= EditPatronGeneralInfoForm.FIELD_ADDRESS_2_STATE %>" size="25" maxlength="42" tabindex="11"/></td>
                   </tr>
                   <tr>
                      <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpatrongeneralinfo_PostalCode") %>&nbsp;</td>
                      <td><html:text property="<%= EditPatronGeneralInfoForm.FIELD_ADDRESS_1_ZIP %>" size="25" maxlength="20" tabindex="5"/></td>
                      <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpatrongeneralinfo_PostalCode") %>&nbsp;</td>
                      <td><html:text property="<%= EditPatronGeneralInfoForm.FIELD_ADDRESS_2_ZIP %>" size="25" maxlength="20" tabindex="12"/></td>
                   </tr>
                   <tr>
                      <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpatrongeneralinfo_Phone1") %>&nbsp;</td>
                      <td><html:text property="<%= EditPatronGeneralInfoForm.FIELD_ADDRESS_1_PRIMARY_PHONE %>" size="25" maxlength="30" tabindex="6"/></td>
                      <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpatrongeneralinfo_Phone1") %>&nbsp;</td>
                      <td><html:text property="<%= EditPatronGeneralInfoForm.FIELD_ADDRESS_2_PRIMARY_PHONE %>" size="25" maxlength="30" tabindex="13"/></td>
                   </tr>
                   <tr>
                      <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpatrongeneralinfo_Phone2") %>&nbsp;</td>
                      <td><html:text property="<%= EditPatronGeneralInfoForm.FIELD_ADDRESS_1_OTHER_PHONE %>" size="25" maxlength="30" tabindex="7"/></td>
                      <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpatrongeneralinfo_Phone2") %>&nbsp;</td>
                      <td><html:text property="<%= EditPatronGeneralInfoForm.FIELD_ADDRESS_2_OTHER_PHONE %>" size="25" maxlength="30" tabindex="14"/></td>
                   </tr>
                </table>
             </td>
          </tr>
       </c:when>
       <c:when test="<%=form.getPage() == EditPatronGeneralInfoForm.PAGE_INDEX_PICTURE %>">
          <tr>
             <td>
                <table id="<%= EditPatronGeneralInfoForm.TABLE_PATRON_PICTURE %>" border="0" width="100%">
                   <tr>
                      <td class="TableHeading" colspan="3"><%= MessageHelper.formatMessage("editpatrongeneralinfo_PatronPicture0", ResponseUtils.filter(form.gimmePatronAddressInfo())) %></td>
                   </tr>
                   <tr>
                        <td>
                            <base:outlinedTable id="<%= EditPatronGeneralInfoForm.TABLE_PATRON_PICTURE_CONTENT %>" width="100%">
                            <tr>
                                <td align="center">
                                   <img alt='<%= MessageHelper.formatMessage("editpatrongeneralinfo_PatronPicture") %>' name="Patron Picture" title='<%= MessageHelper.formatMessage("editpatrongeneralinfo_PatronPicture") %>' src='<bean:write name="<%= EditPatronGeneralInfoForm.FORM_NAME %>" property="imageURL"/>' height="<%= PatronSpecs.BIG_PICTURE_HEIGHT %>">
                                </td>
                            </tr>
                            <tr>
                                <td align="center" class='ColRowBold'>
                                    <%-- because there is a file upload is on this screen... --%>
                                    <base:showHideTag id="previewButton">
                                    <base:genericButton onclick="hideElementpreviewButton()" name="<%= EditPatronGeneralInfoForm.BUTTON_NAME_PREVIEW %>" alt='<%= MessageHelper.formatMessage("preview") %>' src="/buttons/large/preview2.gif"/>
                                    &nbsp;
                                    <base:genericButton onclick="hideElementpreviewButton()" name="<%= EditPatronGeneralInfoForm.BUTTON_NAME_CLEAR %>" alt='<%= MessageHelper.formatMessage("clear") %>' src="/buttons/large/clear.gif"/>
                                    </base:showHideTag>
                                </td>
                            </tr>
                            </base:outlinedTable>
                        </td>
                        <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpatrongeneralinfo_NewImage") %>
                        </td>                
                        <td class="FormLabel">
                            <html:file property="<%= EditPatronGeneralInfoForm.FIELD_UPLOAD_FILE %>"/>
                        </td>
                   </tr>
                </table>
             </td>
          </tr>
       </c:when>
       <c:otherwise>
       </c:otherwise>
    </c:choose>
    
    <tr>
       <td>
           <base:imageLine/>
       </td>
    </tr>
    <tr>
       <td class="tdAlignRight">
          <table>
             <tr>
                <td class="tdAlignRight">
                    <c:if test="${!form.fromUploadClassJobSummary}">
                    <base:spanIfAllowed permissions="<%= new Permission[] { Permission.BACK_OFFICE_GENERATE_REPORTS_PATRON, Permission.DISTRICT_CREATE_DISTRICT_REPORTS } %>">
                        <span class="ColRow"><html:checkbox property="<%=EditPatronGeneralInfoForm.FIELD_PRINT_LABEL_ON_SAVE%>"><%= MessageHelper.formatMessage("editpatrongeneralinfo_PrintLabelOnSave") %></html:checkbox></span>
                    </base:spanIfAllowed>
                    </c:if>
                    &nbsp;&nbsp;
                </td>
                <td class="tdAlignRight">
                   <base:isNotMacBrowser>
                       <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="Save Patron"  name="savePatronOnEnter">
                   </base:isNotMacBrowser>
                    <base:showHideTag id="bottomSaveButton">
                   <base:saveButton onclick="hideButtonsWithinThere()"/>
                   &nbsp;
                   
                    <c:if test="${form.showAddAdditionalSite}">
                        <base:genericButton onclick="hideButtonsWithinThere()" name="<%= EditPatronGeneralInfoForm.BUTTON_NAME_ADD_SITE %>" alt='<%= MessageHelper.formatMessage("addAdditionalSite") %>' src="/buttons/large/addsite.gif"/>
                       &nbsp;
                   </c:if>
                   
                   <base:cancelButton onclick="hideButtonsWithinThere()"/>
                    </base:showHideTag>
                </td>
                
             </tr>
          </table>
       </td>
    </tr>
    <% if (store.isDistrictPatronizer()){ %>
    <tr>
       <td>
           <base:imageLine/>
       </td>
    </tr>
    <tr>
        <td>
             <table border="0" width="100%">
                <tr>
                    <td>
                    <base:helpIcons buttonsToOutput="<%=new int[]{HelpIconsTag.ICON_PRIMARY_SITE_PATRON, HelpIconsTag.ICON_ADDITIONAL_SITE_PATRON} %>"/>
                    </td>
                </tr>   
            </table>
        </td>
   </tr>          
    <% } %>

    
</base:outlinedTableAndTabsWithinThere>

</base:form>
</logic:equal>

<script language="JavaScript" type="text/javascript">
  <!--
    function hideButtonsWithinThere() {
	  hideElementbottomSaveButton();
	  hideElementtopSaveButton();
    }
  // -->
</script>
