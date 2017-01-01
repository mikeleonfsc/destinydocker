<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-destiny.tld" prefix="d" %>

<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.data.Tab" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.CopyCategoryFacadeSpecs"%>
<%@ page import="com.follett.fsc.destiny.session.cataloging.ejb.data.CopyCategoryValue"%>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%
    CategoryListForm form = (CategoryListForm)request.getAttribute(CategoryListForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
%>

<c:set var="dForm" value="<%=request.getAttribute(CategoryListForm.FORM_NAME)%>"/>
<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handlecategorylistform.do" focus="<%=form.gimmeFocusField()%>" handleEnterKey="true">
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=CategoryListForm.BUTTON_TRAP_ENTER_KEY%>">
<html:hidden property="<%=CategoryListForm.PARAM_CATEGORY_ID %>" value='<%=form.getCategoryID() == null ? "" : form.getCategoryID().toString() %>' />
<html:hidden property="<%=CategoryListForm.PARAM_COLLECTION_TYPE %>" value="<%=String.valueOf(form.getCollectionType())  %>" />
<html:hidden property="<%=CategoryListForm.FIELD_EDIT_CATEGORY_MODE%>" value="<%=String.valueOf(form.isEditCategoryMode()) %>" />
<html:hidden property="<%=CategoryListForm.PARAM_COPY_CATEGORY_SORT%>" value="<%=String.valueOf(form.getSort()) %>" />
<html:hidden property="<%=CategoryListForm.PARAM_COPY_CATEGORY_DESCEND%>" value="<%=String.valueOf(form.isDescend()) %>" />
    <logic:equal name="cataloging_servlet_CategoryListForm" property="action" value="ConfirmDelete">
        <html:hidden property="categoryID" />
        <base:imageSpacer width="1" height="3"/>
        <base:messageBox message='<%= MessageHelper.formatMessage("categorylist_The0CategoryWillBeDeleted", form.getCategoryToDeleteDescription())%>' >
            <tr>
                <td align="center" class="ColRow">
                    <bean:write name="cataloging_servlet_CategoryListForm" property="extendedDeleteDescription" filter="false"/>
                </td>
            </tr>
            <tr>
                <td align="center" class="ColRow"><%= MessageHelper.formatMessage("categorylist_AreYouSureYouWantToDeleteThisCategory") %></td>
            </tr>

            <tr>
                <td valign="baseline" align="center" class="ColRow">
                    <base:yesNo
                         buttonYesName="actionYes"
                         buttonNoName="actionNo"
                    />
                </td>
            </tr>
        </base:messageBox>
    </logic:equal>


    <bean:define id="categoryList" name="cataloging_servlet_CategoryListForm"
        property="categoryList" type="java.util.ArrayList" />

    <base:outlinedTableWithTabsForBaseSearch 
    id="<%=AdvancedSearchRedirectorForm.TABLE_LIBRARY_SEARCH_TABS%>"  
    borderColor="#C0C0C0" 
    selectedTab="<%=form.gimmeSelectedTab() %>" 
    tabs="<%=form.gimmeTabs()%>" 
    top10Link="<%=form.getTopTenTitles()%>">
<tr>
<td valign="top" width="100%">
    <!-- if the user doesn't have rights to the add category field, don't show the table -->
    <%if(form.gimmeFocusField() != null){ %>
        <table id="<%=CategoryListForm.TABLE_ADD_EDIT_AND_BUTTONS_CATEGORY%>" width="100%">
            <tr>
            <td valign="top">
                <table id="<%=CategoryListForm.TABLE_ADD_CATEGORY%>" border="0" cellpadding="2" cellspacing="0">
                    <tr>
                        <td class="ColRowBold tdAlignRight">
                            <%=form.gimmeTextFieldPrompt() %>&nbsp;
                        </td>
                        <td nowrap="nowrap">
                            <span onKeyPress="return trapEnterKey(event);">
                                <c:choose>
                                    <c:when test="<%=CollectionType.ASSET == form.getCollectionType()%>">
                                        <html:text property="<%= CategoryListForm.FIELD_CATEGORY_DESCRIPTION %>" size="40"  maxlength="40"/>
                                    </c:when>
                                    <c:otherwise>
                                        <html:text property="<%= CategoryListForm.FIELD_CATEGORY_DESCRIPTION %>" size="30"  maxlength="30"/>
                                    </c:otherwise>
                                </c:choose>
                            </span>
                       </td> 
                    </tr>
                    <tr>
                        <td><input type="image" src="/images/icons/general/spacer.gif" height=27 width=1 name="I1" tabindex="-1"></td>
                        
                        <td class="ColRow" nowrap="nowrap">
                            <c:choose>
                                <c:when test="<%=! store.isDistrictUser() %>">
                                    <html:checkbox property="<%=CategoryListForm.FIELD_RESTRICTED_CATEGORY%>"><%= MessageHelper.formatMessage("categorylist_Restricted") %></html:checkbox> 
                                    <% if (form.getCollectionType() == CollectionType.ASSET) { %>
                                    <base:helpTag helpFileName="d_restrict_item_category_AM.htm"/>
                                    <% } else { %>
                                    <base:helpTag helpFileName="d_restrict_copy_category_LM_TM_MM.htm"/>
                                    <% } %>
                                </c:when>
                                <c:otherwise>
                                    <html:hidden property="<%=CategoryListForm.FIELD_RESTRICTED_CATEGORY%>" value="false"/>
                                </c:otherwise>
                            </c:choose>
                        </td>
                    </tr>
                </table>
             </td>
             <td valign="top" class="tdAlignRight">
                <table id="<%=CategoryListForm.TABLE_BUTTON_HOUSE%>" width="100%" border="0" cellpadding="2" cellspacing="0">
                    <tr>
                        <td>
                            <base:saveButton name="<%=SaveButtonTag.BUTTON_NAME %>"/>
                        </td>        
                    </tr>
                    <tr>
                        <td>
                            <% if(form.isEditCategoryMode() ) { %>
                              <base:cancelButton/>
                             <% } %>
                        </td>
                    </tr>
                    
                </table>
            </td>
            </tr>
       </table>
    <%} %>
    
</td>
</tr>
    <tr>
        <base:sectionHeading heading="<%=form.getSectionHeader() %>"/>
    </tr>
    <tr>
    </tr>
    <tr>
        <td>
<% if ( form.haveCategoryToDisplay() ) { %>
    <table id="<%=CategoryListForm.TABLE_CATEGORY_LIST%>" border="0" cellpadding="2" cellspacing="0" align="center" width="100%">
        <tr>
            <td class="SmallColHeading">
            
                <base:sortHeaderOutput collectionType="<%=form.getCollectionType()%>" description='<%=MessageHelper.formatMessage("categorylist_Name") %>' formName="<%= CategoryListForm.FORM_NAME %>" sort='<%=String.valueOf(CopyCategoryFacadeSpecs.SORT_CATEGORY_DESCRIPTION) %>' />            
            </td>
            <td class="SmallColHeading" align="center">
                <c:if test="<%=! store.isDistrictUser() %>">                
                    <base:spanIfAllowed 
                    permissions='<%=new Permission[] { 
                        Permission.CAT_CREATE_ASSIGN_CATEGORIES, Permission.CAT_CREATE_ASSIGN_CATEGORIES_TEXTBOOK, Permission.CAT_CREATE_ASSIGN_CATEGORIES_ASSET }%>'
                        collectionType='<%=form.getCollectionType() %>'>
                    
                    <base:sortHeaderOutput collectionType="<%=form.getCollectionType()%>"  
                    description='<%=MessageHelper.formatMessage("categorylist_Restricted") %>'
                    formName="<%= CategoryListForm.FORM_NAME %>" sort='<%=String.valueOf(CopyCategoryFacadeSpecs.SORT_RESTRICTED) %>' />            
                    </base:spanIfAllowed>
                </c:if>
            </td>
            <td class="SmallColHeading" align="center">
                <base:sortHeaderOutput collectionType="<%=form.getCollectionType()%>"  
                  description='<%=(form.getCollectionType() == CollectionType.ASSET) ?
                    MessageHelper.formatMessage("categorylist_Items") :
                    MessageHelper.formatMessage("categorylist_Copies")%>'
                formName="<%= CategoryListForm.FORM_NAME %>" 
                sort='<%=String.valueOf(CopyCategoryFacadeSpecs.SORT_NUMBER_OF_COPIES) %>' />            
            </td>
            <td class="SmallColHeading">
                &nbsp;
            </td>
        </tr>
        <logic:iterate id="node" name="cataloging_servlet_CategoryListForm" property="categoryList" type="CopyCategoryValue">
        <% if ( form.isShowCatsWithNoCopies() || node.getCopyCount() > 0 ) {
        %>
             <base:flipper key="categorylist">
                <td class="ColRowBold">
                    <% if ( node.getCopyCount() > 0 ) { %>
                        <base:link styleClass="DetailLink" page='<%= form.getViewCopiesURL(node) %>' collectionType="<%=form.getCollectionType()%>" permissions="<%=new Permission[]{Permission.CAT_CATEGORY_SEARCH, Permission.CAT_TEXTBOOK_SEARCH, Permission.CAT_ASSET_SEARCH_ASSETS}%>" showTextAlways='true' id="<%=CategoryListForm.ID_LINK_VIEW_COPIES + node.getCategoryID() %>">
                            <bean:write name="node" property="description"/>
                        </base:link>
                        <c:if test="<%= form.canDoSearch() %>">
                            &nbsp;
                            <base:link page='<%= form.getViewCopiesURL(node) %>' collectionType="<%=form.getCollectionType()%>" showTextAlways='true' id="<%=CategoryListForm.ID_LINK_VIEW_COPIES + node.getCategoryID() %>">
                                <base:image src="/buttons/small/viewsmall.gif" alt='<%= MessageHelper.formatMessage("view")   %>' align="absbottom"/>                                
                            </base:link>
                        </c:if>
                    <% } else { %>
                        <bean:write name="node" property="description"/>
                    <%   }
                    %>
                </td>
                <td class="ColRow" align="center">
                    <c:if test="<%=! store.isDistrictUser() && node.isRestricted() %>">  
                        <base:image alt='<%= MessageHelper.formatMessage("categorylist_Restricted") %>' src="/icons/general/check.gif"/>
                    </c:if>
                </td>
                <td class="ColRow" align="center">
                    ${d:formatNumber(node.copyCount)}
                </td>
                <td class="tdAlignRight" nowrap="nowrap">
                    <base:link page='<%= form.getCopyCategoryURL(node) %>' permission='<%=form.getPermission() %>' id='<%=node.getAddToCategoryID() %>'>
                        <base:image width="19" src="/icons/general/plus.gif" alt='<%= MessageHelper.formatMessage("categorylist_AddToThisCategory") %>' align="absbottom"/>                                
                    </base:link>
                    &nbsp;
                    <base:link page='<%= form.getEditURL(node) %>' permission='<%=form.getPermission()%>' id='<%=node.getEditID() %>'>
                        <base:image src="/icons/general/edit.gif" alt='<%=MessageHelper.formatMessage("categorylist_Edit", ResponseUtils.filter(node.getDescription()) )%>' align="absbottom"/>                                
                    </base:link>
                    <c:if test="<%= form.getCollectionType() != CollectionType.ASSET || (form.getCollectionType() == CollectionType.ASSET && form.isCanViewAllAssets()) %>">  
                        &nbsp;
                        <base:link page='<%= form.getDeleteURL(node) %>' permission='<%=form.getPermission()%>' id='<%=node.getDeleteID() %>'>
                            <base:image src="/icons/general/delete.gif" alt='<%= MessageHelper.formatMessage("categorylist_Delete", ResponseUtils.filter(node.getDescription()) ) %>' align="absbottom"/>                                
                        </base:link>
                    </c:if>
                </td>
            </base:flipper>
        <%} %>
        </logic:iterate>
        <base:spanIfAllowed permission="<%= form.getPermission() %>">
            <tr>
                <td colspan="4">
                    <img src="/images/icons/general/line.gif" height="1" width="100%">
                </td>
            </tr>
            <tr>
                <td colspan="4">
                    <base:helpIcons buttonsToOutput="<%= form.getHelpIcons() %>" collectionType="<%= form.getCollectionType() %>"/>
                </td>
            </tr>
        </base:spanIfAllowed>
    </table>
<% } else { %>
    <table id="<%=CategoryListForm.TABLE_CATEGORY_LIST%>" border="0" cellpadding="2" cellspacing="0">
        <tr>
            <td class="ColRow" align="center">
                <%= MessageHelper.formatMessage("categorylist_ThereAreNoCategoriesDefinedForYour") %>
            </td>
            <td/>
        </tr>
    </table>
<% } %>

        </td>
    </tr>
    
</base:outlinedTableWithTabsForBaseSearch>
</base:form>
