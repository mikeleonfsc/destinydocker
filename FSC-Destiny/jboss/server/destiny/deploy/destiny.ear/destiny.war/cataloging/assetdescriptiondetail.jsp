<%@page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs"%>
<%@page import="com.follett.fsc.destiny.util.xml.AssetTemplateBaseSpecs"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.AssetDescriptionDetailForm" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.session.cataloging.ejb.data.AssetDetailValue" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.common.StringStringLookup" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<base:messageBox strutsErrors="true"/>

<%
    AssetDescriptionDetailForm form = (AssetDescriptionDetailForm)request.getAttribute(AssetDescriptionDetailForm.FORM_NAME);
    AssetDetailValue adv = form.getAssetDetailValue();
%>

<base:form action="/cataloging/servlet/handleassetdescriptiondetailform.do">

    <html:hidden property="<%=AssetDescriptionDetailForm.PARAM_BIBID%>"/>
    <html:hidden property="<%=AssetDescriptionDetailForm.FIELD_WALKER_ID%>"/>
    <html:hidden property="<%=AssetDescriptionDetailForm.PARAM_TSQUARED_RECORD%>"/>
    <html:hidden property="<%=AssetDescriptionDetailForm.PARAM_PARENT_BIB_ID%>"/>
    <html:hidden property="<%=AssetDescriptionDetailForm.PARAM_SUPPLEMENT_STATUS%>"/>

<% if ( form.isConfirmDelete() ) { %>
    <base:messageBox showRedBorder="true"> 
        <tr>
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td align="center">
                <table border="0">
                <tr>
                    <td class="tdAlignLeft">
                    <span class="ColRowBold">
                <% if (!adv.isBibAssociatedWithOtherSites() || form.getStore().isDistrictUser()) { %>
                This resource will be permanently deleted from your district collection.
                <% } else { %>
                This resource will be removed from your site's collection only.
                <% } %>
                </span>
                <%=form.getDeleteConfirmation() %>
                    </td>
                </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td class="ColRow" align="center" colspan="2">
                Are you sure you want to proceed?
            </td>
        </tr>
        <tr>
            <td align="center" class="Instruction" colspan="2">
                You may want to print this page for your records before proceeding.
            </td>        
        </tr>
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:yesNo/>
            </td>
        </tr>    
    </base:messageBox>
<% } %>

<logic:equal name="<%=AssetDescriptionDetailForm.FORM_NAME%>" property="<%=AssetDescriptionDetailForm.FIELD_SHOW_DUPLICATE_MESSAGE%>" value="true">
    <html:hidden property="<%=AssetDescriptionDetailForm.FIELD_EXTERNAL_SOURCES_FORWARD%>"/>
    <base:imageSpacer width="1" height="3"/>
    <base:messageBox showWarningIcon="true" message="Saving will duplicate a textbook resource already in your database.  Are you sure you want to do this?">
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:yesNo 
                    buttonYesName="<%=AssetDescriptionDetailForm.BUTTON_NAME_OVERRIDE_DUPLICATE%>"
                    buttonNoName="<%=AssetDescriptionDetailForm.BUTTON_NAME_CANCEL_DUPLICATE%>"
                />
            </td>
        </tr>
    </base:messageBox>
</logic:equal>

<base:outlinedTableAndTabsWithinThere id="<%=AssetDescriptionDetailForm.TABLE_MAIN%>"  
    outputTSquaredIcon="<%=form.isTsquaredRecord() %>"
    alwaysOutputTabsEvenIfJustOne="true"  
    selectedTab="<%=form.getSelectedTab()%>" tabs="<%=form.getTabs()%>" >
<tr>
    <td valign="top" width="100%">
        <table width="100%">
        <tr>
        <td width="100%">
        <table id="<%=AssetDescriptionDetailForm.TABLE_MAIN_DETAILS%>" border="0" cellpadding="0" cellspacing="0" width="100%">
            <tr>
                <td valign="top">
                    <table id="<%=AssetDescriptionDetailForm.TABLE_ASSET_IMAGE%>" border="0" cellpadding="1" cellspacing="0">
                        <tr>
                            <td align="center">
                                <%=form.gimmeAssetImageURL() %>
                            </td>
                        </tr>
                        <tr>
                            <td class="TableHeading2" align="center">
                                <%=form.gimmeAssetImageCaptionHTML() %>
                            </td>
                        </tr>
                    </table>
                </td>
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
                        </tr>
                    </table>
                    <logic:equal name="<%=AssetDescriptionDetailForm.FORM_NAME%>" property="<%=AssetDescriptionDetailForm.PARAM_TSQUARED_RECORD%>" value="false">
                    <table id="<%=AssetDescriptionDetailForm.TABLE_COPY_AVAIL%>" cellpadding="0" cellspacing="0" width="100%">
                        <tr>
                            <td align="center"><base:imageLine width="98%" vspace="2"/></td>
                        </tr>
                        <tr>
                            <td align="center">
                                <table id="<%=AssetDescriptionDetailForm.TABLE_COPIES_SUMMARY%>" cellpadding="6" cellspacing="0">
                                    <tr>
                                        <%form.outputAvailabilityInfo(out, request);%>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                            <tr>
                                <td align="center">
                                    <%=form.getSupplementInfo(request)%>
                                        <logic:equal name="<%=AssetDescriptionDetailForm.FORM_NAME%>" property="canDoBookList" value="true">
                                                    <base:myListSelect name="<%= AssetDescriptionDetailForm.FIELD_LIST_ID %>" submitOnChange="true" prompt="Selected List:" dropDownClass="SmallColRow"/>&nbsp;
                                                    
                                                    <logic:notEqual name="<%=AssetDescriptionDetailForm.FORM_NAME%>" property="addToMyListLink" value="">
                                                        <base:link id="<%=AssetDescriptionDetailForm.ID_ADD_TO_MYLIST %>" page='<%= form.getAddToMyListLink() %>'>
                                                        <base:image src="/buttons/small/addtothislist.gif" alt="Add to this List" />
                                                        </base:link>
                                                    </logic:notEqual>
                                                    <logic:equal name="<%=AssetDescriptionDetailForm.FORM_NAME%>" property="addToMyListLink" value="">
                                                        <%= form.buildInMyListLink() %>
                                                    </logic:equal>
                                        </logic:equal>
                                </td>
                            </tr>
                        
                        <% if (!StringHelper.isEmpty(adv.getAssetTypeTreeDescriptionForTitleDetailsStringDashLongVersion())) { %>
                            <tr>
                                <td align="center"><base:imageLine width="98%" vspace="2"/></td>
                            </tr>
                            <tr>
                                <td class="ColRow">
                                    <%=adv.getAssetTypeTreeDescriptionForTitleDetailsStringDashLongVersion()%>
                                </td>
                            </tr>
                       <% } %>
                    </table>
                    </logic:equal>
                    <%
                        if (adv.getRequiredFieldList().size() > 0) {
                    %>
                    <table id="<%=AssetDescriptionDetailForm.TABLE_REQUIRED_FIELD_LIST_GRAPHICS %>" cellpadding="2" cellspacing="0" width="100%">
                            <tr><td colspan="2"><base:imageLine width="98%" vspace="2"/></td></tr>
                    </table>
                    <table id="<%=AssetDescriptionDetailForm.TABLE_REQUIRED_FIELD_LIST %>" cellpadding="2" cellspacing="0">                    
                        <%
                            List list = adv.getRequiredFieldList();
                            Iterator iter = list.iterator();
                            
                            while (iter.hasNext()) {
                                StringStringLookup field = (StringStringLookup)iter.next();
                                String name = field.getStringDesc();
                                String value = field.getStringCode();
                                if(form.shouldHideNamedField(name)) {
                                    continue;
                                }
                        %>
                        <tr>
                            <%=AssetDescriptionDetailForm.DETAIL_SPACER %>
                            <td class="ColRowBold tdAlignRight" valign="top"><%=ResponseUtils.filter(name)%></td>
                            <% if(AssetTemplateBaseSpecs.DEFAULT_TEMPLATE_FIELD_TEXTBOOK_ISBN_DISPLAYABLE.equals(name)) { %>
                                <td class="ColRow"><%=value%></td>
                            <% } else { %>
                                <td class="ColRow"><%=ResponseUtils.filter(value)%></td>
                            <% } %>
                        </tr>
                        <%
                            }
                        %>
                    </table> 
                    <%
                        }
                    %>
                    <%
                        if(form.canViewDescriptionDocumentation()) {
                    %>
                    <table id="viewDocumentation" cellpadding="2" cellspacing="0" width="100%">
                        <tbody>
                        <tr>
                            <td background="/images/icons/general/thickline.gif" nowrap="" valign="top">
                                <span class="ColRow">&nbsp;&nbsp;</span>
                                <span class="SectionHeader">
                                    Digital Content
                                </span>
                            </td>
                        </tr>
                        </tbody>
                    </table>   
                    <table id="viewDocumentationViewLink" cellpadding="2" cellspacing="0">
                        <tbody>
                        <tr>
                            <td valign="top"><img src="/images/icons/general/spacer.gif" width="20" height="1"></td>
                            <td class="ColRow">
                                <base:link page='<%=form.getUpdateDigitalLink()%>' id="<%= AssetDescriptionDetailForm.ID_VIEW_DESCRIPTION%>">
                                    <base:image src="/buttons/small/viewsmall.gif" alt="<%=AssetDescriptionDetailForm.ALT_VIEW_DESCRIPTION%>"/>
                                </base:link>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                    <%
                        }
                    %>
                    <%=form.getComponentsTable()%>
                   <% if (!form.isTextbookAsset() && form.canDisplayContainerCheckboxText())  {%>
                    <table id="resourceContainer" cellpadding="2" cellspacing="0">
                        <tbody>
                        <tr>
                            <td valign="top"><img src="/images/icons/general/spacer.gif" width="20" height="1"></td>
                            <td class="ColRowBold">This resource includes other items.</td>
                        </tr>
                        </tbody>
                    </table>
                    <% } %>
                </td>
            </tr>
        </table>
        </td>
        </tr>
        <logic:equal name="<%=AssetDescriptionDetailForm.FORM_NAME%>" property="displayTopLink" value="false">
            <tr>
                <td  class="SmallColRow tdAlignRight" vAlign="bottom" width="100%">
                    <a class="DetailLink" href="#TheTop">Top</a>
                </td>
            </tr>
        </logic:equal>
        </table>
        
    </td>
    <td class="tdAlignRight" valign="top">
        <table id="<%=AssetDescriptionDetailForm.TABLE_BUTTONS%>" border="0" cellpadding="3" cellspacing="0" >
            <logic:equal name="<%=AssetDescriptionDetailForm.FORM_NAME%>" property="<%=AssetDescriptionDetailForm.PARAM_TSQUARED_RECORD%>" value="true">
            <tr>
                <td>
                    <base:link permission='<%=Permission.CAT_ASSET_EDIT_ASSET%>' page='<%=form.getSaveTitleLink()%>' id="<%=AssetDescriptionDetailForm.BUTTON_VALUE_SAVE_RESOURCE%>">
                        <base:image src="/buttons/large/savetitle.gif" alt="<%=AssetDescriptionDetailForm.ALT_SAVE_RESOURCE%>"/>
                    </base:link>
                </td>
            </tr>
            <tr>
                <td>
                    <base:link permission='<%=Permission.CAT_ASSET_ADD_ASSET_ITEM%>' page='<%=form.getAddCopyLink()%>' id="<%= AssetDescriptionDetailForm.ID_ADD_ITEM%>">
                        <base:image src="/buttons/large/additem.gif" alt="<%=AssetDescriptionDetailForm.ALT_ADD_ITEM%>"/>
                    </base:link>
                </td>
            </tr>
            </logic:equal> 
            <logic:equal name="<%=AssetDescriptionDetailForm.FORM_NAME%>" property="<%=AssetDescriptionDetailForm.PARAM_TSQUARED_RECORD%>" value="false">
            <tr>
                <td>
                    <base:link permission='<%=Permission.CAT_ASSET_EDIT_ASSET%>' page='<%=form.getEditDescriptionLink()%>' id="<%= AssetDescriptionDetailForm.ID_EDIT_DESCRIPTION%>">
                        <base:image src="/buttons/large/edit.gif" alt="<%=AssetDescriptionDetailForm.ALT_EDIT_DESCRIPTION%>"/>
                    </base:link>
                </td>
            </tr>
            <% if(adv.getSupplement() == BibMasterSpecs.SUPPLEMENT_STATUS_NONE) { %> 
            <tr>
                <td>
                    <base:link permission='<%=Permission.CAT_ASSET_ADD_ASSET%>' page='<%=form.getDuplicateLink()%>' id="<%= AssetDescriptionDetailForm.ID_DUPLICATE_ASSET%>">
                        <base:image src="/buttons/large/duplicatetitle.gif" alt="<%=AssetDescriptionDetailForm.ALT_DUPLICATE_ASSET%>"/> 
                    </base:link>
                </td>
            </tr>
            <% } %>
            <tr>
                <td>
                    <% if (form.canDelete()) { %>
                        <base:link permission='<%=Permission.CAT_ASSET_DELETE_ASSET%>' page='<%=form.getDeleteDescriptionLink()%>' id="<%= AssetDescriptionDetailForm.ID_DELETE_DESCRIPTION%>">
                            <base:image src="/buttons/large/deletebig.gif" alt="<%=AssetDescriptionDetailForm.ALT_DELETE_DESCRIPTION%>"/>
                        </base:link>
                    <% } %>
                </td>
            </tr>
            <tr>
                <td><base:imageSpacer height="10" width="10"/></td>
            </tr>
            <% if (form.canAddCopy()) { %>
                <% if (form.isSoftwareTemplate()) { %>
                    <tr>
                        <td>
                            <base:link permission='<%=Permission.CAT_ASSET_ADD_ASSET_ITEM%>' page='<%=form.getAddItemLink(AssetDescriptionDetailForm.VIEW_TYPE_LICENSES)%>' id="<%= AssetDescriptionDetailForm.ID_ADD_LICENSE%>">
                                <base:image src="/buttons/large/addlicense.gif" alt="<%=AssetDescriptionDetailForm.ALT_ADD_LICENSE%>"/>
                            </base:link>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <base:link permission='<%=Permission.CAT_ASSET_ADD_ASSET_ITEM%>' page='<%=form.getAddItemLink(AssetDescriptionDetailForm.VIEW_TYPE_MEDIA)%>' id="<%= AssetDescriptionDetailForm.ID_ADD_MEDIA%>">
                                <base:image src="/buttons/large/addmedia.gif" alt="<%=AssetDescriptionDetailForm.ALT_ADD_MEDIA%>"/>
                            </base:link>
                        </td>
                    </tr>
                <% } else if (form.isKitTemplate()) { %>
                    <tr>
                        <td>
                            <base:link permission='<%=Permission.CAT_ASSET_ADD_ASSET_ITEM%>' page='<%=form.getAddItemLink(AssetDescriptionDetailForm.VIEW_TYPE_KIT)%>' id="<%= AssetDescriptionDetailForm.ID_ADD_KIT%>">
                                <base:image src="/buttons/large/addkit.gif" alt="<%=AssetDescriptionDetailForm.ALT_ADD_KIT%>"/>
                            </base:link>
                        </td>
                    </tr>
                <% } else { %>
                    <tr>
                        <td>
                            <base:link permission='<%=Permission.CAT_ASSET_ADD_ASSET_ITEM%>' page='<%=form.getAddItemLink(AssetDescriptionDetailForm.VIEW_TYPE_ITEMS)%>' id="<%= AssetDescriptionDetailForm.ID_ADD_ITEM%>">
                                <base:image src="/buttons/large/additem.gif" alt="<%=AssetDescriptionDetailForm.ALT_ADD_ITEM%>"/>
                            </base:link>
                        </td>
                    </tr>
                <% } %>
            <% } %>

            <tr>
                <td>
                    <base:link permissions='<%=new Permission[] { 
                        Permission.ASSET_DESCRIPTION_DOCUMENTATION_ADD_EDIT, Permission.ASSET_DESCRIPTION_DOCUMENTATION_DELETE}%>' 
                        page='<%=form.getUpdateDigitalLink()%>' id="<%= AssetDescriptionDetailForm.ID_UPDATE_DIGITAL_CONTENT%>">
                        <base:image src="/buttons/large/updatedigital_rm.gif" alt="<%=AssetDescriptionDetailForm.ALT_UPDATE_DIGITAL_CONTENT%>"/>
                    </base:link>
                </td>
            </tr>

            <tr>
                <td>
                    <base:link permission='<%= Permission.CAT_ASSET_EDIT_ASSET %>' page='<%= form.getAddImageLink() %>' id="<%= AssetDescriptionDetailForm.ID_ADD_IMAGE%>">
                        <base:image src="/buttons/large/addimage.gif" alt="<%=AssetDescriptionDetailForm.ALT_ADD_IMAGE%>"/>
                    </base:link>
                </td>
            </tr>
            <c:if test="<%= !StringHelper.isEmpty(form.getEditComponentsLink()) %>">
                <tr>
                    <td>
                        <base:link permission='<%= Permission.CAT_ASSET_EDIT_ASSET %>' page='<%= form.getEditComponentsLink() %>' id="<%=AssetDescriptionDetailForm.ID_LINK_EDIT_COMPONENTS%>">
                            <base:image src="/buttons/large/components.gif" alt="<%=AssetDescriptionDetailForm.LINK_EDIT_COMPONENTS%>"/>
                        </base:link>
                    </td>
                </tr>
            </c:if>
            <tr>
                <td class="Instruction" nowrap>
                <% if(form.getPreviousBibID() != null) { %>
                    <base:link page='<%= form.getPreviousRecordLink() %>' id="<%= AssetDescriptionDetailForm.ID_LINK_PREVIOUS_ASSET%>">
                    <base:image align="top" src="/icons/general/previouslonger.gif" width="44" height="26" alt="<%=AssetDescriptionDetailForm.LINK_PREVIOUS_ASSET%>"/>
                    </base:link>
                <% } else { %>
                    <base:imageSpacer height="26" width="44"/>
                <% } %>
                <% if(form.getNextBibID() != null) { %>
                    <base:link page='<%= form.getNextRecordLink() %>' id="<%= AssetDescriptionDetailForm.ID_LINK_NEXT_ASSET%>">
                    <base:image align="top" src="/icons/general/nextlonger.gif" width="44" height="26" alt="<%=AssetDescriptionDetailForm.LINK_NEXT_ASSET%>"/>
                    </base:link>
                <% } else { %>
                    <base:imageSpacer height="26" width="44"/>
                <% } %>
                </td>
            </tr>
            </logic:equal>
            
        </table>
    </td>
</tr>
</base:outlinedTableAndTabsWithinThere>
</base:form>
