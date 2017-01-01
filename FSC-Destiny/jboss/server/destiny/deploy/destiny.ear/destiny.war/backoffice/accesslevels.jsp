<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.AccessLevelsForm" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.xml.*" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@page import="java.util.ArrayList"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag"%>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>

<%@page import="com.follett.fsc.destiny.session.common.HTMLHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%>

<base:messageBox strutsErrors="true"/>

<%
    AccessLevelsForm form = (AccessLevelsForm)request.getAttribute(AccessLevelsForm.FORM_NAME);
    String focusControl = AccessLevelsForm.FIELD_ACCESS_LEVEL_NAME;
    
    if (form.getRoleID() != null) {
        focusControl = AccessLevelsForm.FIELD_ACCESS_LEVEL_TIMEOUT;
    }
    
    if ( ! form.isDistrictMode() && form.isDistrictAccessLevelMode() ) {
        focusControl = "";
    }
    
%>

<base:form action="/backoffice/servlet/handleaccesslevelsform.do" focus="<%=focusControl %>">
    <logic:equal name="<%= AccessLevelsForm.FORM_NAME %>" property="<%= AccessLevelsForm.FIELD_IMPORTANT_INFO_WAS_PREVIOUSLY_CHECKED %>" value="true">
        <html:hidden property="<%= AccessLevelsForm.FIELD_IMPORTANT_INFO_WAS_PREVIOUSLY_CHECKED %>" value="true"/>
    </logic:equal>
<SCRIPT LANGUAGE="JavaScript">
<!--    
function checkEm(values, value)
{
var field = document.<%=AccessLevelsForm.FORM_NAME%>.<%=AccessLevelsForm.FIELD_CHECKED_PERMISSIONS%>;
for ( j = 0; j < values.length; j++ ) {
  for (i = 0; i < field.length; i++)
    if ( field[i].value == values[j]) {
        field[i].checked = value;
        break;
    }
  }
return false;
}
//  End -->
</script>
    
    <% if (form.isDistrictMode() ) { %>
        <html:hidden property="districtMode"/>    
    <% } %>    
	<table id="<%= AccessLevelsForm.TABLE_ACCESS_LEVEL_HEADING %>" width="100%">
		<tr>
			<td width="100%">
                <% if (form.isDistrictRole() ) { %>
                    <% if(form.isDistrictWarehouseMode()) { %>
        			    <nobr><span class="ColRowBold"><%= MessageHelper.formatMessage("accesslevels_DistrictWarehouseUserAccessLevel") %></span>
                    <% } else { %>
        			    <nobr><span class="ColRowBold"><%= MessageHelper.formatMessage("accesslevels_DistrictUserAccessLevel") %></span>
                    <% } %>
                <% } else { %>
                <nobr><span class="ColRowBold"><%= MessageHelper.formatMessage("accesslevels_AccessLevel") %></span>
                <% }  %>
			    <logic:equal name="<%= AccessLevelsForm.FORM_NAME %>" property="editRoleName" value="true">
                    <c:choose>
                        <c:when test="<%= ! form.isDistrictMode() && form.isDistrictAccessLevelMode() && !form.getStore().isMediaBookingUser()%>">
                            <span class="ColRowBold"><bean:write name="<%= AccessLevelsForm.FORM_NAME %>" property="<%= AccessLevelsForm.FIELD_ACCESS_LEVEL_NAME %>"/></span>
                        </c:when>
                        <c:otherwise>
			                <html:text property="<%= AccessLevelsForm.FIELD_ACCESS_LEVEL_NAME %>" size="30" maxlength="30"/>
                        </c:otherwise>
                    </c:choose>

			        </nobr>
			        <logic:equal name="<%= AccessLevelsForm.FORM_NAME %>" property="<%= AccessLevelsForm.FIELD_DEFAULT_ACCESS_LEVEL %>" value="true">
			            <html:hidden property="<%= AccessLevelsForm.FIELD_DEFAULT_ACCESS_LEVEL %>" value="true"/>
			            <base:image src="/icons/general/check_19.gif" width="19" height="16" alt='<%= MessageHelper.formatMessage("accesslevels_DefaultAccessLevel") %>'/><span class="Instruction">&nbsp;
                        <%= MessageHelper.formatMessage("accesslevels_DefaultAccessLevel") %></span>
			        </logic:equal>
			
                    <c:if test="<%= (!form.isDistrictRole() && (form.isDistrictMode() || ! form.isDistrictAccessLevelMode()) || form.getStore().isMediaBookingUser())%>">
    			        <logic:equal name="<%= AccessLevelsForm.FORM_NAME %>" property="<%= AccessLevelsForm.FIELD_DEFAULT_ACCESS_LEVEL %>" value="false">
    			            <nobr><span class="ColRow"><html:checkbox property="<%= AccessLevelsForm.FIELD_DEFAULT_ACCESS_LEVEL %>">&nbsp;
                            <%= MessageHelper.formatMessage("accesslevels_MakeThisTheDefault") %></html:checkbox></span></nobr>
    			        </logic:equal>
                    </c:if>
			        <nobr>
			            <br>
			            <!-- indent -->&nbsp;<base:imageSpacer width="18" height="1"/>
			            <span class="Instruction">
                        <%= MessageHelper.formatMessage("accesslevels_UserIsAutomaticallyLoggedOutAfterThisManyMinutes") %>
                        <c:choose>
                            <c:when test="<%= ! form.isDistrictMode() && form.isDistrictAccessLevelMode() && !form.getStore().isMediaBookingUser()%>">
                                <%= form.getAccessLevelTimeout() %>
                            </c:when>
                            <c:otherwise>
        			            &nbsp;<html:text property="<%= AccessLevelsForm.FIELD_ACCESS_LEVEL_TIMEOUT %>" size="5" maxlength="3"/>
                            </c:otherwise>
                        </c:choose>
			            </span>
			        </nobr>
			    </logic:equal>
			
			    <logic:equal name="<%= AccessLevelsForm.FORM_NAME %>" property="editRoleName" value="false">
			        <span class="ColRowBold"><bean:write name="<%= AccessLevelsForm.FORM_NAME %>" property="<%= AccessLevelsForm.FIELD_ACCESS_LEVEL_NAME %>"/></span>
			        </nobr>
			        <%focusControl = null;%>
			        <br>
			        <logic:equal name="<%= AccessLevelsForm.FORM_NAME %>" property="guestRole" value="true">
			            <span class="Instruction"> 
                        <%= MessageHelper.formatMessage("accesslevels_ScreenAndUserListAreAutomaticallyClearedAfterThisManyMinutes") %>
                        <c:choose>
                            <c:when test="<%= ! form.isDistrictMode() && form.isDistrictAccessLevelMode() && !form.getStore().isMediaBookingUser()%>">
                                <%= form.getAccessLevelTimeout() %>
                            </c:when>
                            <c:otherwise>
                                &nbsp;<html:text property="<%= AccessLevelsForm.FIELD_ACCESS_LEVEL_TIMEOUT %>" size="5" maxlength="3"/>
                            </c:otherwise>
                        </c:choose>
                        <br>
                        <%= MessageHelper.formatMessage("accesslevels_ThisRoleLetsYouDetermine") %>
			            </span>
			        </logic:equal>
			        <logic:equal name="<%= AccessLevelsForm.FORM_NAME %>" property="guestRole" value="false">
			            <span class="Instruction">
                        <logic:equal name="<%= AccessLevelsForm.FORM_NAME %>" property="primaryAdministratorRole" value="true">
                            <%= MessageHelper.formatMessage("accesslevels_ThisRoleActsAsATemplateForAllOtherAccessLevelsAtYourSite") %><br>
                        </logic:equal>
                        <logic:equal name="<%= AccessLevelsForm.FORM_NAME %>" property="primaryDistrictWarehouseAdministratorRole" value="true">
                            <%= MessageHelper.formatMessage("accesslevels_ThisRoleActsAsATemplateForAllOtherDistrictWarehouseAccessLevelsAtYourDistrictWarehouse") %><br>
                        </logic:equal>
			            <%= MessageHelper.formatMessage("accesslevels_UserIsAutomaticallyLoggedOutAfterThisManyMinutes") %>
                        <c:choose>
                            <c:when test="<%= ! form.isDistrictMode() && form.isDistrictAccessLevelMode() && !form.getStore().isMediaBookingUser()%>">
                                <%= form.getAccessLevelTimeout() %>
                            </c:when>
                            <c:otherwise>
                                &nbsp;<html:text property="<%= AccessLevelsForm.FIELD_ACCESS_LEVEL_TIMEOUT %>" size="5" maxlength="3"/>
                            </c:otherwise>
                        </c:choose><br>
			            </span>
			        </logic:equal>
			    </logic:equal>
			</td>
		
		    <td class="tdAlignRight" valign="top">
                <c:if test="<%= form.isDistrictMode() || ! form.isDistrictAccessLevelMode() || form.isMediaBookingUser() %>">
                    <base:saveButton name="<%=AccessLevelsForm.BUTTON_NAME_SAVE %>"/><br/>
                    <base:cancelButton/>
                </c:if>
		    </td>
		</tr>
	</table>
    
    

<br/>

<base:outlinedTableAndTabsWithinThere id="<%=AccessLevelsForm.TABLE_ACCESS_LEVELS%>" cellpadding="1" selectedTabID="<%=form.getCurrentTabID()%>" selectedTab="<%=form.getCurrentTab()%>" tabs="<%=form.gimmeTabs()%>" tabValidator="<%= form %>">
        <% if(form.getCurrentTabID().equals(AccessLevelsForm.ID_TAB_ASSETS)){ %>
            <% if (form.canViewAssetSetupButton()){ %>
                <tr><td colspan="2">&nbsp;</td></tr>
                <tr>
                <%if (form.canEditGroups()){ %>
                <td valign="top" colspan="2"><span class="ColRowBold">Resource Groups for this Access Level:</span>
                <base:genericButton name="<%=AccessLevelsForm.BUTTON_SETUP%>" src="/buttons/small/setup.gif" alt="Setup Resource Groups"/>
                    </td>
               <% } else { %>
                <td valign="top" colspan="2"><span class="ColRowBold">Resource Groups for this Access Level:</span>
                <base:genericButton name="<%=AccessLevelsForm.BUTTON_SETUP%>" src="/buttons/small/viewsmall.gif" alt="View Resource Groups"/>
                    </td>
               <%} %>
                </tr>
                
            <%} %>
            <tr>
            <td valign="top" colspan="2"><span class="ColRowBold">Default Resource Group:</span> <span class="ColRow"><%=JSPHelper.filterHtmlAndNulls(form.getDefaultAssetTemplateGroupForRole())%></span></td>
            </tr>
            <tr><td>&nbsp;</td></tr>
        <% } %>
        <% form.resetMaps(); %>
        <% 
            Iterator<RoleEditDisplayEntryElement> columnL = form.getLeftPageEntryListForCurrentTab().iterator();
        	Iterator<RoleEditDisplayEntryElement> columnR = form.getRightPageEntryListForCurrentTab().iterator();
        	while (columnL.hasNext() || columnR.hasNext()) {
         %>
                <base:flipper key="accesslevels">
         <%       
                RoleEditDisplayEntryElement leftEntry = columnL.hasNext() ? columnL.next() : null;
                RoleEditDisplayEntryElement rightEntry = columnR.hasNext() ? columnR.next() : null;
                
                out.println(form.renderPermissionEntry(leftEntry, true));
                out.println(form.renderPermissionEntry(rightEntry, false));  %>
                
                </base:flipper>
            	
        <%	}
        %>
        <%if ( form.gimmeShowClearAllSelectAll() ) { %>
            <tr>
            <td colspan="2">
                <base:imageLine/>
            </td>
            </tr>
            <tr>
            <td colspan="2">
            <%
            int buttons[] = new int[] {HelpIconsTag.ICON_SELECT_ALL, HelpIconsTag.ICON_CLEAR_ALL};
            %>
            <base:helpIcons buttonsToOutput="<%=buttons%>"/>
            </td>
            </tr>
        <%} %>
        
</base:outlinedTableAndTabsWithinThere>

<SCRIPT LANGUAGE="JavaScript">
<!--    
<%=form.gimmeJavascriptCheckStuff()%>
//  End -->
</script>

</base:form>
