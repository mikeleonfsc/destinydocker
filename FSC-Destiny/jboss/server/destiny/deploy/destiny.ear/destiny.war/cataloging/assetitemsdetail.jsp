<%@page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.CopySpecs"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.AssetDescriptionDetailForm" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.BaseTitleDetailForm" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>

<%
    AssetDescriptionDetailForm form = (AssetDescriptionDetailForm)request.getAttribute(AssetDescriptionDetailForm.FORM_NAME);

    int numberOfColumns = form.numberOfColumns();
    int numberOfOnOrderColumns = form.numberOfOnOrderColumns();
    form.setViewingItemDocumentsIcon(false);
%>
<script language="JavaScript" type="text/javascript">
<!--
function changeGroupBy() {
    document.<%=AssetDescriptionDetailForm.FORM_NAME%>.<%=AssetDescriptionDetailForm.FIELD_ITEM_GROUP_BY_CHANGED%>.value = "true";
    document.<%=AssetDescriptionDetailForm.FORM_NAME%>.submit();
}

//-->
</script>
<base:form action="/cataloging/servlet/handleassetdescriptiondetailform.do">
<html:hidden property="<%=AssetDescriptionDetailForm.FIELD_ITEM_GROUP_BY_CHANGED%>" />
<html:hidden property="<%=AssetDescriptionDetailForm.PARAM_BIBID%>" />
<html:hidden property="<%=AssetDescriptionDetailForm.PARAM_BIB_WALKER_ID%>" />
<html:hidden property="<%=AssetDescriptionDetailForm.PARAM_UNLIMITED_BIBID%>"/>
<html:hidden property="<%=AssetDescriptionDetailForm.PARAM_UNLIMITED_SITEID%>"/>
<html:hidden property="<%=AssetDescriptionDetailForm.PARAM_DELETE_CODE_SITEID %>"/>
<logic:equal name="<%=AssetDescriptionDetailForm.FORM_NAME%>" property="<%=AssetDescriptionDetailForm.PARAM_ACTION%>" value="<%= AssetDescriptionDetailForm.ACTION_DELETED_UNLIMITED%>">
    <base:imageSpacer width="1" height="3"/>
    <base:messageBox showWarningIcon="true" message="Unlimited items will be removed.  Are you sure you want to do this?">
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:yesNo 
                    buttonYesName="<%=AssetDescriptionDetailForm.BUTTON_NAME_DELETE_UNLIMITED_YES%>"
                    buttonNoName="<%=AssetDescriptionDetailForm.BUTTON_NAME_DELETE_UNLIMITED_NO%>"
                />
            </td>
        </tr>
    </base:messageBox>
</logic:equal>
<logic:equal name="<%=AssetDescriptionDetailForm.FORM_NAME%>" property="<%=AssetDescriptionDetailForm.PARAM_ACTION%>" value="<%= AssetDescriptionDetailForm.ACTION_DELETE_CODES%>">
    <base:imageSpacer width="1" height="3"/>
    <base:messageBox showWarningIcon="true" message="<%= form.getConfirmDeleteCodesMessage() %>">
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:yesNo 
                    buttonYesName="<%=AssetDescriptionDetailForm.BUTTON_NAME_DELETE_CODES_YES%>"
                    buttonNoName="<%=AssetDescriptionDetailForm.BUTTON_NAME_DELETE_CODES_NO%>"
                />
            </td>
        </tr>
    </base:messageBox>
</logic:equal>
<base:outlinedTableAndTabsWithinThere id="<%=AssetDescriptionDetailForm.TABLE_MAIN%>"  selectedTab="<%=form.getSelectedTab()%>" tabs="<%=form.getTabs()%>">
    <tr>
        <td valign="top" width="100%">
            <table id="<%=AssetDescriptionDetailForm.TABLE_ASSETDETAILS%>" border="0" cellpadding="3" cellspacing="0" width="100%">
                <tr>
                    <logic:equal name="<%=AssetDescriptionDetailForm.FORM_NAME%>" property="textbookAsset" value="false">
                    <td class="TableHeading">
                        <bean:write name="<%= AssetDescriptionDetailForm.FORM_NAME %>" property="assetDescription"/>
                    </td>
                    </logic:equal>
                    <logic:equal name="<%=AssetDescriptionDetailForm.FORM_NAME%>" property="textbookAsset" value="true">
                       <%=form.renderTextbookAsset() %>
                    </logic:equal>
                    <td class="tdAlignRight">
                        <table border="0">
                            <tr>
                                <td>
                                <% if (form.canAddCopy()) { %>
                                    <base:link permission='<%= Permission.CAT_ASSET_ADD_ASSET_ITEM %>' page='<%= form.getAddItemLink() %>'  id='<%= form.getAddItemID() %>'>
                                        <logic:equal name="<%=AssetDescriptionDetailForm.FORM_NAME%>" property="viewType" value="<%=String.valueOf(AssetDescriptionDetailForm.VIEW_TYPE_ITEMS)%>">
                                            <base:image src="/buttons/large/additem.gif" alt="<%=AssetDescriptionDetailForm.ALT_ADD_ITEM%>" />
                                        </logic:equal>
                                        <logic:equal name="<%=AssetDescriptionDetailForm.FORM_NAME%>" property="viewType" value="<%=String.valueOf(AssetDescriptionDetailForm.VIEW_TYPE_LICENSES)%>">
                                            <base:image src="/buttons/large/addlicense.gif" alt="<%=AssetDescriptionDetailForm.ALT_ADD_LICENSE%>" />
                                        </logic:equal>
                                        <logic:equal name="<%=AssetDescriptionDetailForm.FORM_NAME%>" property="viewType" value="<%=String.valueOf(AssetDescriptionDetailForm.VIEW_TYPE_MEDIA)%>">
                                            <base:image src="/buttons/large/addmedia.gif" alt="<%=AssetDescriptionDetailForm.ALT_ADD_MEDIA%>" />
                                        </logic:equal>
                                        <logic:equal name="<%=AssetDescriptionDetailForm.FORM_NAME%>" property="viewType" value="<%=String.valueOf(AssetDescriptionDetailForm.VIEW_TYPE_KIT)%>">
                                            <base:image src="/buttons/large/addkit.gif" alt="<%=AssetDescriptionDetailForm.ALT_ADD_KIT%>" />
                                        </logic:equal>
                                    </base:link>
                                <% } %>    
                                </td>
                            </tr>
                            <tr>
                                <td class="Instruction" nowrap>
                                <% if(form.getPreviousBibID() != null) { %>
                                    <base:link page='<%= form.getPreviousRecordLink() %>' id="<%= AssetDescriptionDetailForm.ID_LINK_PREVIOUS_ASSET%>">
                                    <base:image align="top" src="/icons/general/previouslonger.gif" width="44" height="26" alt="<%=AssetDescriptionDetailForm.LINK_PREVIOUS_ASSET%>" />
                                    </base:link>
                                <% } else { %>
                                    <base:imageSpacer width="44" height="26" />
                                <% } %>
                                <% if(form.getNextBibID() != null) { %>
                                    <base:link page='<%= form.getNextRecordLink() %>' id="<%= AssetDescriptionDetailForm.ID_LINK_NEXT_ASSET%>">
                                    <base:image align="top" src="/icons/general/nextlonger.gif" width="44" height="26" alt="<%=AssetDescriptionDetailForm.LINK_NEXT_ASSET%>" />
                                    </base:link>
                                <% } else { %>
                                    <base:imageSpacer width="44" height="26"/>
                                <% } %>
                                </td>
                            </tr>
                            
                        </table>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    
    <tr>
        <td align="center">
            <base:imageLine height="1" width="100%" />
        </td>
    </tr>
<base:isNotDistrictUser>
    <tr>
        <td>
            <table id="<%=AssetDescriptionDetailForm.TABLE_LOCAL_ITEMS%>" cellspacing="0" width="100%" cellpadding="4" border="0">
                <tr>
                    <td class="TableHeading2" colspan="<%= numberOfColumns %>">
                    <bean:write name="<%= AssetDescriptionDetailForm.FORM_NAME %>" property="localCopyHeader"/>
                    <% if (form.getAssetDetailValue().isDigitalMaterial() && form.canRemoveCodes()) { %>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <base:link page="<%= form.getDeleteCodesURL(form.getStore().getSiteID()) %>" 
                        id="<%=AssetDescriptionDetailForm.ID_CLEAR_SITE_CODES + form.getStore().getSiteID() %>">
                            <base:image src="/buttons/large/clearcodes.gif" alt="Clear Redemption Codes"/>      
                        </base:link>
                    <% } %>
                    </td>
                </tr>
                <!-- Only display the group by drop down if we are on the items tab and we have items to group -->
                <% if (!form.getAssetDetailValue().isDigitalMaterial() && form.getViewType() == AssetDescriptionDetailForm.VIEW_TYPE_ITEMS 
                    && form.getAssetDetailValue().getLocalItemsTotal() > 0) { %>
                    <tr>
                        <td class="TableHeading2" colspan="<%= numberOfColumns %>">
                           Group by: 
                           <html:select property="<%=AssetDescriptionDetailForm.FIELD_ITEM_GROUP_BY %>" onchange="changeGroupBy()">
                                <html:option value="<%=String.valueOf(CopySpecs.ITEM_GROUP_BY_NONE)%>">-- None --</html:option>
                                <html:option value="<%=String.valueOf(CopySpecs.ITEM_GROUP_BY_DATE_ACQUIRED)%>">Date Acquired</html:option>
                                <html:option value="<%=String.valueOf(CopySpecs.ITEM_GROUP_BY_DEPARTMENT)%>">Department</html:option>
                                <html:option value="<%=String.valueOf(CopySpecs.ITEM_GROUP_BY_LOCATION)%>">Home Location</html:option>
                                <html:option value="<%=String.valueOf(CopySpecs.ITEM_GROUP_BY_STATUS)%>">Status</html:option>
                           </html:select>
                        </td>
                    </tr>
                <% } %>
                <!-- Only display the group list if we are on the items tab, we have a group by list, None is not selected -->
                <% if (form.getItemGroupBy() == CopySpecs.ITEM_GROUP_BY_NONE 
                    || form.getViewType() != AssetDescriptionDetailForm.VIEW_TYPE_ITEMS
                    || form.getAssetDetailValue().getAssetItemGroupList() == null) {
                        form.outputList(out, form.getAssetDetailValue().getLocalItems(), false); 
                   } else {
                        form.outputGroupedList(out);    
                   }
                %>
            </table>
        </td>
    </tr>

    <tr>
        <td align="center">
            <base:imageLine height="1" width="100%" />
        </td>
    </tr>
    
    <tr>
        <td>
            <table id="<%=AssetDescriptionDetailForm.TABLE_ON_ORDER_ITEMS%>" cellspacing="0" width="100%" cellpadding="4" border="0">
                <tr>
                    <td class="TableHeading2" colspan="<%= numberOfOnOrderColumns %>">
                    <bean:write name="<%= AssetDescriptionDetailForm.FORM_NAME %>" property="onOrderCopyHeader"/>
                    </td>
                </tr>
                <%= form.outputOnOrderList() %>
                <logic:equal name="<%=AssetDescriptionDetailForm.FORM_NAME%>" property="showCopyLevelHelp" value="true">       
                    <tr>
                        <td align="center" colspan="<%= numberOfOnOrderColumns %>">
                            <base:imageLine height="1" width="100%" />
                        </td>
                    </tr>                         
                    <tr>
                        <td colspan="<%= numberOfOnOrderColumns %>">
                            <base:helpIcons buttonsToOutput='<%= form.getHelpIcons() %>'/>
                        </td>
                    </tr>
                </logic:equal>
            </table>
        </td>
    </tr>

    
</base:isNotDistrictUser>   

<base:spanIfAllowed permission='<%= Permission.CAT_ASSET_SHOW_ALL_ASSETS %>'>
<base:isNotDistrictUser>   
    <tr>
        <td align="center">
            <base:imageLine height="1" width="100%" />
        </td>
    </tr>                         
</base:isNotDistrictUser>   
    
    <tr>
        <td>
            <A name="<%=BaseTitleDetailForm.ANCHOR_OFF_SITE_COPIES %>"></A>
            <table id="<%=AssetDescriptionDetailForm.TABLE_OFFSITE_ITEMS%>" cellspacing="0" width="100%" cellpadding="4" border="0">
                <tr>
                    <td class="TableHeading2" colspan="<%= numberOfColumns %>">
                    <base:isNotDistrictUser>
                        Off-site 
                    </base:isNotDistrictUser>
                    <bean:write name="<%=AssetDescriptionDetailForm.FORM_NAME%>" property="viewTypePluralDisplayable"/>
                    <base:isDistrictUser>
                    <% if (form.getAssetDetailValue().isDigitalMaterial() && form.isShowClearAllCodesForDistrict()) { %>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <base:link page="<%= form.getDeleteCodesURL(null) %>" id="<%=AssetDescriptionDetailForm.ID_CLEAR_ALL_DISTRICT_CODES %>">
                            <base:image src="/buttons/large/clearcodes.gif" alt="Clear all Redemption Codes"/>      
                        </base:link>
                    <% } %>
                    </base:isDistrictUser>
                    </td>
                </tr>
                <% if (form.getAssetDetailValue().isDigitalMaterial()) { %>
                    <% form.outputGroupedListForOffsiteDigital(out); %>
                <% } else { %>
                    <% form.outputList(out, form.getAssetDetailValue().getOffsiteItems(), true); %>
                <% } %>
            </table>
        </td>
    </tr>
    
<base:isDistrictUser>   
    <tr>
        <td align="center">
            <base:imageLine height="1" width="100%" />
        </td>
    </tr>                         
    <tr>
        <td>
            <table id="<%=AssetDescriptionDetailForm.TABLE_ON_ORDER_ITEMS%>" cellspacing="0" width="100%" cellpadding="4" border="0">
                <tr>
                    <td class="TableHeading2" colspan="<%= numberOfOnOrderColumns %>">
                    <bean:write name="<%= AssetDescriptionDetailForm.FORM_NAME %>" property="onOrderCopyHeader"/>
                    </td>
                </tr>
                <%=form.outputOnOrderList() %>
                <logic:equal name="<%=AssetDescriptionDetailForm.FORM_NAME%>" property="showCopyLevelHelp" value="true">       
                    <tr>
                        <td align="center" colspan="<%= numberOfOnOrderColumns %>">
                            <base:imageLine height="1" width="100%" />
                        </td>
                    </tr>                         
                    <tr>
                        <td colspan="<%= numberOfOnOrderColumns %>">
                            <base:helpIcons buttonsToOutput='<%= form.getHelpIcons() %>'/>
                        </td>
                    </tr>
                </logic:equal>                
            </table>
        </td>
    </tr>
</base:isDistrictUser>

</base:spanIfAllowed>

</base:outlinedTableAndTabsWithinThere>

</base:form>

