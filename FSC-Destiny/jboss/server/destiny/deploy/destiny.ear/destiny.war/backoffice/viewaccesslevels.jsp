<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.RoleSpecs"%>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>



<bean:define id="form" name="<%= ViewAccessLevelsForm.FORM_NAME %>" type="com.follett.fsc.destiny.client.backoffice.servlet.ViewAccessLevelsForm"/>
<bean:define id="userLevelsList" name="<%= ViewAccessLevelsForm.FORM_NAME %>" property="userLevels"/>
<bean:define id="groupList" name="<%= ViewAccessLevelsForm.FORM_NAME %>" property="<%=ViewAccessLevelsForm.PARAM_GROUP_LIST_JSP%>"/>
<base:messageBox strutsErrors="true"/>

<%
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();  
%>
  
<script language="javascript" type="text/javascript">
<!--
function doSubmitRadio() {
    document.forms["<%=ViewAccessLevelsForm.FORM_NAME %>"].submit();
}
-->
</script>

<base:form action="/backoffice/servlet/handleviewaccesslevelsform.do">
<html:hidden property="<%=ViewAccessLevelsForm.PARAM_NEW_ROLE_CHANGED%>"/>
<html:hidden property="<%=ViewAccessLevelsForm.PARAM_ROLE_DESCRIPTION%>"/>

    <%  // only put DISTRICT MODE on if we are in district mode, otherwise bad things happen
    if (form.isDistrictMode() ) { %>
      <center><span class="ColRowBold"><%= GenericForm.getLastBackupDisplayMsg(false) %></span></center><br>
      <jsp:include page="/common/msdewarning.jsp" flush="true" />
      <html:hidden property="districtMode"/>    
    <% } %>


    <html:hidden property="roleID"/>
    <html:hidden property="action"/>
    <logic:equal name="<%= ViewAccessLevelsForm.FORM_NAME %>" property="action" value="<%= form.ACTION_CONFIRM_PUSH %>">
        <base:messageBox showRedBorder="true">
            <tr valign="center">
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td class="ColRowBold" align="center"><%= MessageHelper.formatMessage("viewaccesslevels_YourCurrentAdministratorSettings") %> <base:selectSiteAndSiteType 
                            name="<%= ViewAccessLevelsForm.FIELD_SITE_LIMITER%>" 
                            selectedSiteID="true"
                            includeForLibrarySites="true"
                            includeForTextbookSites="true"
                            includeForAssetSites="true"
                            includeDistrictWarehouse="false"
                        /></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td class="ColRow" align="center">
                    <%= MessageHelper.formatMessage("viewaccesslevels_ThisProcessCannotBeReversed") %>
                </td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td class="ColRow" align="center">
                    <%= MessageHelper.formatMessage("viewaccesslevels_AreYouSureYouWant") %>
                </td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td valign="baseline" align="center" class="ColRow">
                    <base:yesNo/>
                </td>
            </tr>
        </base:messageBox>
    </logic:equal>
    
    <logic:equal name="<%= ViewAccessLevelsForm.FORM_NAME %>" property="action" value="<%= form.ACTION_CONFIRM_PUSH_ALL %>">
        <base:messageBox showRedBorder="true">
            <tr valign="center">
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td class="ColRowBold" align="center"><%= MessageHelper.formatMessage("viewaccesslevels_AllDistrictDefinedAccessLevelsWillBePushedTo") %> <base:selectSiteAndSiteType 
                            name="<%= ViewAccessLevelsForm.FIELD_SITE_LIMITER%>" 
                            selectedSiteID="true"
                            includeForLibrarySites="true"
                            includeForTextbookSites="true"
                            includeForAssetSites="true"
                            includeDistrictWarehouse="false"
                        /></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td class="ColRow" align="center">
                    <%= MessageHelper.formatMessage("viewaccesslevels_NoteSomeExistingAccessLevelsAndAssetGroupsWillBeOverwritten") %>
                </td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td class="ColRow" align="center">
                    <%= MessageHelper.formatMessage("viewaccesslevels_ThisProcessCannotBeReversed") %>
                </td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td class="ColRow" align="center">
                    <%= MessageHelper.formatMessage("viewaccesslevels_AreYouSureYouWant") %>
                </td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td valign="baseline" align="center" class="ColRow">
                    <base:yesNo/>
                </td>
            </tr>
        </base:messageBox>
    </logic:equal>
    <logic:equal name="<%= ViewAccessLevelsForm.FORM_NAME %>" property="action" value="<%=ViewAccessLevelsForm.ACTION_CONFIRM_DELETE %>">
        <base:messageBox showRedBorder="true">
            <% if (form.isLastRole()) { %>
                        <% if (form.isDistrictWarehouseRoleExists()) { %>
                <tr valign="left">
                    <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                    <td class="ColRowBold" align="left">
                            <%= MessageHelper.formatMessage("viewaccesslevels_PatronsUsingThisDistrictWarehouseAccessLevel0", Long.valueOf(form.getNumberOfPatrons())) %>
                    </td>
                </tr>
                        <% } %>
                <tr valign="left">
                    <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                    <td class="ColRowBold" align="left">
                        <% if (form.isDistrictWarehouseRoleExists()) { %>
                            <%= MessageHelper.formatMessage("viewaccesslevels_YouCannotDeleteYourLastDistrictWarehouseAccessLevel") %>
                        <% } else { %>
                            <%= MessageHelper.formatMessage("viewaccesslevels_YouCannotDeleteYourLast") %>
                        <% } %>
                    </td>
                </tr>
            <% } else { %>
                <tr valign="center">
                    <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                    <td class="ColRowBold" align="center">
                        <% if (form.isDistrictWarehouseRoleExists()) { %>
                            <%= MessageHelper.formatMessage("viewaccesslevels_TheDistrictWarehouseAccessLevelWillBeDeleted",  ResponseUtils.filter(form.getRoleDescription())) %>
                        <% } else { %>
                            <%= MessageHelper.formatMessage("viewaccesslevels_TheAccessLevelWillDeleted", ResponseUtils.filter(form.getRoleDescription())) %>
                        <% } %>
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>
                        <table border="0" align="center">
                            <% if (form.getNumberOfPatrons() > 0 && !form.getUserLevels().isEmpty()) { %>
                                <tr>
                                    <td class="ColRow">
                                        <ul>
                                            <li>
                                                <% if (form.isDistrictWarehouseRoleExists()) { %>
                                                    <%= MessageHelper.formatMessage("viewaccesslevels_PatronsUsingThisDistrictWarehouseAccessLevel0", Long.valueOf(form.getNumberOfPatrons())) %><br>
                                                    <%= MessageHelper.formatMessage("viewaccesslevels_ChangeTheAssignedDistrictWarehouseAccessLevelTo") %>
                                                <% } else { %>
                                                    <%= MessageHelper.formatMessage("viewaccesslevels_PatronsUsingThisAccessLevel0", Long.valueOf(form.getNumberOfPatrons())) %><br>
                                                    <%= MessageHelper.formatMessage("viewaccesslevels_ChangeTheAssignedAccessLevel") %>
                                                <% } %>
                                                <html:select property="<%=ViewAccessLevelsForm.FIELD_NEW_ROLE_ID%>" onchange="submitDropDownMode()">
                                                    <html:options collection="userLevelsList" property="longID" labelProperty="stringDesc"/>
                                                </html:select>
                                                <% if (form.isHasAssetPermissions()){ %>
                                                <br>
                                                    <%= MessageHelper.formatMessage("viewaccesslevels_ChangeTheAssignedAssetTemplateGroup") %>
                                                    <html:select property="<%=ViewAccessLevelsForm.FIELD_NEW_GROUP_ID%>">
                                                        <html:options collection="groupList" property="longID" labelProperty="stringDesc"  />
                                                    </html:select>
                                                <%} else { %>
                                                    <html:hidden property="<%=ViewAccessLevelsForm.FIELD_NEW_GROUP_ID%>"/>
                                                <%} %>
                                            </li>
                                        </ul>
                                    </td>
                                </tr>
                            <% } %>
                            <% if (form.isDefaultRole()) { %>
                                <tr>
                                    <td class="ColRow">
                                        <ul>
                                            <li>
                                                <%= MessageHelper.formatMessage("viewaccesslevels_ThisIsYourDefaultAccessLevel") %><br>
                                                <%= MessageHelper.formatMessage("viewaccesslevels_SelectNewDefault") %>
                                                <html:select property="<%= ViewAccessLevelsForm.FIELD_NEW_DEFAULT_ACCESS_LEVEL %>">
                                                    <html:options collection="userLevelsList" property="longID" labelProperty="stringDesc"/>
                                                </html:select>
                                            </li>
                                        </ul>
                                    </td>
                                </tr>
                            <% } %>
                        </table>
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td align="center" class="ColRow">
                        <% if (form.isDistrictWarehouseRoleExists()) { %>
                            <%= MessageHelper.formatMessage("viewaccesslevels_AreYouSureYouWantToDeleteThisDistrictWarehouseAccessLevel") %>
                        <% } else { %>
                            <%= MessageHelper.formatMessage("viewaccesslevels_AreYouSureYouWantToDeleteThisAccess") %>
                        <% } %>
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td valign="baseline" align="center" class="ColRow">
                        <base:yesNo/>
                    </td>
                </tr>
            <% } %>
        </base:messageBox>
    </logic:equal>
<table align="center" border="0" width="95%" cellpadding="0" cellspacing="0"><tr><td>
<base:outlinedTable borderColor="#C0C0C0" id="districtTabs" align="center" width="100%">
   <c:choose>
    <c:when test="<%= ViewAccessLevelsForm.ACTION_CONFIRM_SAVE.equals(form.getAction()) %>">
    <html:hidden property="<%=ViewAccessLevelsForm.FIELD_ACCESS_LEVEL_MODE%>"/> 
    <tr>
      <td align="center">
       <table>
       <tr>
       <td width="95%">
    
        <base:messageBox showRedBorder="true">
        <c:choose>
            <c:when test="<%= form.isDistrictAccessLevelMode() %>">
                <tr valign="center">
                    <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                    <td class="ColRowBold"><%= MessageHelper.formatMessage("viewaccesslevels_DistrictDefinedAccessLevelsWillBeAssigned") %></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>
                    <table border="0" align="center">                
                        <tr>
                            <td class="ColRow">
                                <ul>
                                    <li><%= MessageHelper.formatMessage("viewaccesslevels_ByChoosingThisOptionPrecedence") %></li>
                                    <li><%= MessageHelper.formatMessage("viewaccesslevels_AnyAccessLevelsDefinedAtTheSiteThatDoNotMatchDistrict") %></li>
                                    <li><%= MessageHelper.formatMessage("viewaccesslevels_SiteAdministratorsWillNotBeAbleToChange") %></li>
                                    <li><%= MessageHelper.formatMessage("viewaccesslevels_ThisIsReconfiguringYourEntireDistrict") %></li>
                                </ul>
                            </td>
                        </tr>
                    </table>
                    </td>
                </tr>
            </c:when>
            <c:otherwise>
                <tr valign="center">
                    <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                    <td class="ColRowBold"><%= MessageHelper.formatMessage("viewaccesslevels_DistrictDefinedAccessLevelsWillBeReplicated") %></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>
                    <table border="0" align="center">                
                        <tr>
                            <td class="ColRow">
                                <ul>
                                    <li><%= MessageHelper.formatMessage("viewaccesslevels_ByChoosingThisOptionReplicate") %></li>
                                    <li><%= MessageHelper.formatMessage("viewaccesslevels_SiteAdministratorsWillBeAbleToChange") %></li>
                                    <li><%= MessageHelper.formatMessage("viewaccesslevels_ThisIsReconfiguringYourEntireDistrict") %></li>
                                </ul>
                            </td>
                        </tr>
                    </table>
                    </td>
                </tr>
            </c:otherwise>
        </c:choose>
        <tr>
            <td>&nbsp;</td>
            <td align="center" class="ColRowBold"><%= MessageHelper.formatMessage("viewaccesslevels_ThisProcessCannotBeReversedBackup") %></td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td align="center" class="ColRowBold"><%= MessageHelper.formatMessage("viewaccesslevels_Proceed") %></td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td valign="baseline" align="center" class="ColRow">
                <base:yesNo/>
            </td>
        </tr>
        </base:messageBox>
        </td>
        </tr>
        </table>
       </td>
      </tr>
  </c:when>
  <c:otherwise>
  <tr>
   <td>
    <table id=<%= ViewAccessLevelsForm.TABLE_ACCESS_LEVEL %> width="100%" border="0" cellspacing="0" cellpadding="5">
    
    <logic:equal name="<%= ViewAccessLevelsForm.FORM_NAME %>" property="<%=ViewAccessLevelsForm.PARAM_DISTRICT_MODE %>" value="true">
    <tr>
       <td>
          <table width="100%" border="0" cellspacing="0" cellpadding="5">
             <tr>
                <td class="ColRow">
                   <html:radio property="<%=ViewAccessLevelsForm.FIELD_ACCESS_LEVEL_MODE%>" 
                      value="<%=ViewAccessLevelsForm.RADIO_SITE_ASSIGNED_ACCESS_LEVEL%>"
                      onclick="doSubmitRadio()"/>
                </td>
                <td class="ColRow">              
                      <%= MessageHelper.formatMessage("viewaccesslevels_SetupInitialAccessLevelsForUsersHereTheAccessLevelsWillBeAppliedToBnewbSitesExistingSitesWillContinueToUseTheAccessLevelsSetupInBackOfficeHoweverYouCanUpdateTheirAdministratorSettingsByClickingPushOrPushAllAccessLevelsToTheEntireDistrictASelectGroupOfSitesOrASingleSite") %>
                </td>
             </tr>    
             <tr>
                <td class="ColRow">
                   <html:radio property="<%=ViewAccessLevelsForm.FIELD_ACCESS_LEVEL_MODE%>" 
                      value="<%=ViewAccessLevelsForm.RADIO_DISTRICT_ASSIGNED_ACCESS_LEVEL%>"
                      onclick="doSubmitRadio()"/>
                </td> 
                <td class="ColRow">
                      <%= MessageHelper.formatMessage("viewaccesslevels_DistrictDefinedAccessLevelsWillBeAppliedTo") %>
                </td>
             </tr>
             <% if(form.isDistrictWarehouseExists()) { %>
                 <tr>
                    <td></td>
                    <td class="ColRow">
                        <%= MessageHelper.formatMessage("viewaccesslevels_NoteTheAboveOptionsDoNotApplyToTheDistrictWarehouseAccessLevels") %>
                    </td>
                 </tr>
             <% } %>
          </table>
          <html:hidden property="<%=ViewAccessLevelsForm.FIELD_LAST_DISTRICT_MODE %>" />
       </td>
       <c:choose>
          <c:when test="<%=form.isDistrictAccessModeSaveEnabled() %>">
             <td valign="top" class="SmallColRow">
              <base:showHideTag id="onSave">
                 <base:saveButton onclick="hideElementonSave()"/>
              </base:showHideTag>
              </td>
          </c:when>
          <c:otherwise>
             <td valign="bottom" class="SmallColRow">
              <% if (form.canDisplayPush()){ %>
               <base:genericButton src="/buttons/large/pushall.gif" alt='<%= MessageHelper.formatMessage("pushAll") %>' 
                                    name="<%= ViewAccessLevelsForm.BUTTON_NAME_PUSH_ALL %>" />
            <%} %>
            </td>
         </c:otherwise>
       </c:choose>
       </td>
    </tr>
    <tr>
       <td colspan="2" >
          <base:imageLine/>
       </td>
    </tr>
   
    </logic:equal>    
    <%
    RoleVO role = null;
    List roleList = form.getRoleList();
    Iterator iter = roleList.iterator();
	String districtParam = form.isDistrictMode() ? ("&" + ViewAccessLevelsForm.PARAM_DISTRICT_MODE + "=" + form.isDistrictMode()) : ""; 
    while (iter.hasNext()) {
        role = (RoleVO) iter.next();
        if ( form.disableThisRole(role) ) continue;

    %>  
        <base:flipper key="viewaccesslevels">
            <td><span class="ColRowBold"><%= ResponseUtils.filter(role.getRoleName()) %></span>
                <% if (role.isDistrictRole()) { %>
                    <% if (role.isDistrictWarehouseRole()) { %>
                        &nbsp;<span class="Instruction"><%= MessageHelper.formatMessage("viewaccesslevels_DistrictWarehouseAccessLevel") %></span>
                    <% } else { %>
                        &nbsp;<span class="Instruction"><%= MessageHelper.formatMessage("viewaccesslevels_DistrictAccessLevel") %></span>
                    <% } %>
                <%  } else if (role.isDefaultRole()) { %>
                        &nbsp;
                        <base:image src="/icons/general/check_19.gif" width="19" height="16" alt='<%= MessageHelper.formatMessage("viewaccesslevels_DefaultAccessLevel") %>'/> <span class="Instruction"><%= MessageHelper.formatMessage("viewaccesslevels_DefaultAccessLevel") %></span>
                <%  } %>
            </td>
            <td class="ColRow tdAlignRight" nowrap>
                <c:choose>
                    <c:when test="<%= ! form.isDistrictMode() && form.isDistrictAccessLevelMode()%>">
                        <base:link id='<%=ViewAccessLevelsForm.ID_VIEW_ROLE_PREFIX + role.getID()%>' page='<%= form.getEditLinkForRole(role) %>'
                            permission='<%= Permission.BACK_OFFICE_EDIT_USER_ACCESS_LEVELS %>'>
                            <base:image src="/icons/general/view.gif" alt='<%=MessageHelper.formatMessage("viewaccesslevels_View", ResponseUtils.filter(role.getRoleName()))%>' width="19" height="16"/>
                        </base:link>&nbsp;
                    </c:when>
                    <c:otherwise>
                        <% if(form.canDisplayPush() && RoleSpecs.ROLE_ADMINISTRATOR.equals(role.getRoleName()) && !role.isDistrictWarehouseRole()) { %>
                            <base:genericButton src="/buttons/small/push.gif" alt='<%= MessageHelper.formatMessage("push") %>' 
                                name="<%= ViewAccessLevelsForm.BUTTON_NAME_PUSH %>" />&nbsp;
                        <% } %>
                        <base:link id='<%=ViewAccessLevelsForm.ID_EDIT_ROLE_PREFIX + role.getID()%>' page='<%= form.getEditLinkForRole(role) %>'
                            permission='<%= Permission.BACK_OFFICE_EDIT_USER_ACCESS_LEVELS %>'>
                            <base:image src="/icons/general/edit.gif" alt='<%=MessageHelper.formatMessage("viewaccesslevels_Edit", ResponseUtils.filter(role.getRoleName()))%>' width="19" height="16"/>
                        </base:link>&nbsp;
                        <% if ( form.canDeleteRoleName(role.getRoleName())) { %>
                            <base:link id='<%=ViewAccessLevelsForm.ID_DELETE_ROLE_PREFIX + role.getID() %>' page='<%= "/backoffice/servlet/handleviewaccesslevelsform.do?action="+ViewAccessLevelsForm.ACTION_CONFIRM_DELETE+"&roleID=" + URLHelper.encodeURL(role.getID().toString()) +
                                "&" + ViewAccessLevelsForm.FIELD_ACCESS_LEVEL_MODE + "=" + form.getAccessLevelMode() +                                
                                "&" + ViewAccessLevelsForm.FIELD_LAST_DISTRICT_MODE + "=" + form.getLastDistrictMode() +                                
                                "&" + ViewAccessLevelsForm.PARAM_DISTRICT_ROLE + "=" + role.isDistrictRole() +                                
                                "&roleDescription=" + URLHelper.encodeURL(role.getRoleName()) + districtParam %>'
                                permission='<%= Permission.BACK_OFFICE_EDIT_USER_ACCESS_LEVELS %>'>
                                <base:image src="/icons/general/delete.gif" alt='<%=MessageHelper.formatMessage("viewaccesslevels_Delete", ResponseUtils.filter(role.getRoleName())) %>' width="19" height="16"/>
                            </base:link>
                        <% } else { %>
                            <base:imageSpacer height="16" width="19"/>
                        <% }%>
                    </c:otherwise>
                </c:choose>
            </td>
        </base:flipper>
    <% } %>
    </table>
    </td></tr>
    
     </c:otherwise>
   </c:choose>
</base:outlinedTable>
</td></tr></table>
</base:form>
<c:if test="<%= ! ViewAccessLevelsForm.ACTION_CONFIRM_SAVE.equals(form.getAction()) %>">
    <c:if test="<%= form.isDistrictMode() || ! form.isDistrictAccessLevelMode() %>">
        <DIV class="ColRowBold" align="center">
        <base:link id="<%=form.ID_BUTTON_ADD_ACCESS_LEVEL %>" page='<%= form.getAddRoleLink() %>' permission='<%= Permission.BACK_OFFICE_EDIT_USER_ACCESS_LEVELS %>'>
            <base:image src="/buttons/large/addaccesslevel.gif" alt='<%=MessageHelper.formatMessage("addAccessLevel") %>'/>
        </base:link>
        </DIV>
    </c:if>
</c:if>
<script language="JavaScript" type="text/javascript">
      <!--
        function submitDropDownMode() {
    	  document.<%=ViewAccessLevelsForm.FORM_NAME%>.<%=ViewAccessLevelsForm.PARAM_NEW_ROLE_CHANGED%>.value = 'true';
          document.<%=ViewAccessLevelsForm.FORM_NAME%>.submit();
        }
      // -->
</script>


