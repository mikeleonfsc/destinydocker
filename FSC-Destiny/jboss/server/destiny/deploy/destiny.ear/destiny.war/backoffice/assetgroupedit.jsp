<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.destiny.util.ObjectHelper"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.util.lookup.LongStringLookup" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.EditDistrictForm" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.AssetTemplateGroupValue"%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    AssetGroupEditForm form = (AssetGroupEditForm)request.getAttribute(AssetGroupEditForm.FORM_NAME);
%>

    <base:messageBox strutsErrors="true"/>
<bean:define id="groupList" name="<%= AssetGroupEditForm.FORM_NAME %>" property="groups"/>


<base:form action="/backoffice/servlet/handleassetgroupeditform.do">
  <%if (form.isLastGroup()) { %>
        <base:messageBox showRedBorder="true">
         <tr valign="left">
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td class="ColRowBold" align="left"><%= MessageHelper.formatMessage("assetgroupedit_YouCannotDeleteYourLast") %></td>
        </tr>
        </base:messageBox>
  <%} else {%>
  <logic:equal name="<%= AssetGroupEditForm.FORM_NAME %>" property="action" value="<%=AssetGroupEditForm.ACTION_DELETE %>">
        <base:messageBox showRedBorder="true">
                <tr valign="center">
                    <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                    <td class="ColRowBold" align="center"><%= MessageHelper.formatMessage("AssetGroupEdit_TheAssetGroupWillDeleted", ResponseUtils.filter(form.getGroupName()) ) %></td>
                </tr>
                <%
                long patrons = form.getPatronsForGroup();
                if (patrons > 0) {
                %>
                <tr><td valign="top"></td></tr>
                <tr>
                <td>&nbsp;</td>
                    <td class="ColRow">
                    
                        <ul>
                            <li>
                                    <%= MessageHelper.formatMessage("assettemplategroupedit_PatronsUsingThisAssetTemplateGroup", Long.valueOf(form.getPatronsForGroup())) %><br>
                                    <%= MessageHelper.formatMessage("assettemplategroupedit_ChangeTheAssignedAssetTemplateGroup") %> <html:select property="<%=AssetGroupEditForm.FIELD_REPLACEMENT_GROUP_ID%>">
                                    <html:options collection="groupList" property="longID" labelProperty="stringDesc"/>
                                    </html:select>
                            </li>
                        </ul>
                    </td>
                </tr>
                <%
                } %>
                <% if (form.isDefaultGroup()) { %>
               <tr>
               <td>&nbsp;</td>
                    <td class="ColRow">
                        <ul>
                            <li><%= MessageHelper.formatMessage("assettemplategroupedit_ThisIsYourDefaultAssetTemplateGroup") %><br>
                            <%= MessageHelper.formatMessage("assettemplategroupedit_SelectNewDefault") %> <html:select property="<%= AssetGroupEditForm.FIELD_NEW_DEFAULT_GROUP_ID %>">
                                <html:options collection="groupList" property="longID" labelProperty="stringDesc"/>
                                </html:select>
                            </li>
                        </ul>
                    </td>
                </tr>
                
                <% } %>
                
                 <tr>
                    <td>&nbsp;</td>
                    <td align="center" class="ColRow"><%= MessageHelper.formatMessage("assettemplategroupedit_AreYouSureYouWantToDeleteThisAssetTemplateGroup") %></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td valign="baseline" align="center" class="ColRow">
                        <base:yesNo/>
                    </td>
                </tr>
                
        </base:messageBox>
    </logic:equal>
    <%} %>
<%
    Collection<AssetTemplateGroupValue> list = null;
    Iterator<AssetTemplateGroupValue> iter = null;
    AssetTemplateGroupValue value = null;
    String message = null;
%>
  <html:hidden property="<%= AssetGroupEditForm.FIELD_ROLE_ID %>"/>  
  <html:hidden property="<%= AssetGroupEditForm.FIELD_GROUP_ID %>"/>  
  <html:hidden property="<%= AssetGroupEditForm.PARAM_DISTRICT_FLAG %>"/>  
  <html:hidden property="<%= AssetGroupEditForm.PARAM_CAN_EDIT_GROUPS%>"/>  
  <base:outlinedTable id="<%=AssetGroupEditForm.TABLE_MAIN%>" borderColor="#C0C0C0" width="95%">
        
    
                <TR>
                    <base:sectionHeading printerFriendly="false" heading='<%=form.getRoleName() + ": Resource Groups&nbsp;" %>' tdContent="valign='top'"/>
                    <td colspan="2" class="ColHeading tdAlignRight" background="/images/icons/general/thickline.gif" nowrap>
                        <% if (form.isCanEditGroups() && !form.isAdministratorGroup()){ %>
                            <base:genericButton src="/buttons/large/addresourcegroup.gif" alt='<%= MessageHelper.formatMessage("AssetGroupEditForm_AddAssetTemplateGroup") %>' name="<%= AssetGroupEditForm.BUTTON_ADD_ASSET_TEMPLATE_GROUP %>" />
                        <%} %>
                    </td>
                </TR>
         <% if (form.isCanEditGroups() && !form.isAdministratorGroup()){ %>
         <tr>
             <td class="ColRow">
             The Default Resource Group is automatically assigned to all patrons with this Access Level. You can assign any other Resource Groups created for this level by updating patron records.
             </td>
         </tr>
         <%} %>
 
        <%
        //List is a list of value objects
        list = form.getResultList();
        iter = list.iterator();
        value = null;
        %>
 
        <%        
        if(!iter.hasNext()) {
    %>
           <tr><td class="ColRowBold" colspan="3">There are no Resource Groups.</td></tr>
    <%    
        }
        while (iter.hasNext()) {
            value = iter.next();
        %>
            <base:flipper key="assetTemplateGroup"> 
                <td ><span class="ColRowBold"><%= ResponseUtils.filter(value.getGroupName())%></span> <% if (value.isDefaultGroup()){ %><base:image src="/icons/general/check_19.gif" width="19" height="16" alt='<%= MessageHelper.formatMessage("AssetGroupEditForm_DefaultAccessLevel") %>'/> <span class="Instruction">&nbsp;
                        <%= MessageHelper.formatMessage("AssetGroupEditForm_DefaultAccessLevel") %></span><%} %></td>
                <td class="ColRow">&nbsp;</td>
                <td class="ColRow tdAlignRight">
                 <% if (form.isCanEditGroups()){ %>
                    <base:link id="<%=AssetGroupEditForm.ID_EDIT_PREFIX + value.getAssetemplateGroupID() %>" page='<%=form.getEditLink(value)%>'>
                        <base:image src="/icons/general/edit.gif" alt='<%="Edit " + ResponseUtils.filter(value.getGroupName()) %>' width="19" height="16"/>
                    </base:link>
                    &nbsp;
                        <% if (!form.isAdministratorGroup()){ %>
                        <base:link id="<%=AssetGroupEditForm.ID_DELETE_PREFIX + value.getAssetemplateGroupID() %>" page='<%= form.getDeleteLink(value) %>'>
                            <base:image src="/icons/general/delete.gif" alt='<%="Delete " + ResponseUtils.filter(value.getGroupName()) %>' width="19" height="16"/>
                        </base:link>
                        <%} %>
                    <%} else { %>
                     <base:link id="<%=AssetGroupEditForm.ID_VIEW_PREFIX + value.getAssetemplateGroupID() %>" page='<%= form.getViewLink(value) %>'>
                        <base:image src="/icons/general/view.gif" alt='<%="View " + ResponseUtils.filter(value.getGroupName()) %>' width="19" height="16"/>
                    </base:link>
                    <%} %>
                </td>
            </base:flipper>
        <%} %>
        
         <TR>
                    <td colspan="3" class="ColHeading tdAlignRight" background="/images/icons/general/thickline.gif" nowrap>
                    <% if (form.isCanEditGroups() && !form.isAdministratorGroup()){ %>
                        <base:genericButton src="/buttons/large/addresourcegroup.gif" alt='<%= MessageHelper.formatMessage("AssetGroupEditForm_AddAssetTemplateGroup") %>' name="<%= AssetGroupEditForm.BUTTON_ADD_ASSET_TEMPLATE_GROUP %>" />
                        <%} %>
                    </td>
                </TR>

    </base:outlinedTable>
</base:form>
