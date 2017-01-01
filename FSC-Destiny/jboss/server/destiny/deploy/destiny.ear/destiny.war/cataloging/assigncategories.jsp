<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.AssignCategoriesForm" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>


<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>



<%@page import="com.follett.fsc.destiny.util.CollectionType"%>


<%@page import="com.follett.fsc.common.StringHelper"%>

<base:messageBox strutsErrors="true"/>
<base:form action="/cataloging/servlet/handleassigncategoriesform.do" focus="<%=AssignCategoriesForm.FIELD_ADD_CATEGORY_DESCRIPTION%>" handleEnterKey="true">
<html:hidden property="collectionType"/>
<html:hidden property="fromAssetItemEditForm"/>
<html:hidden property="fromGlobalUpdateAssetForm"/>
<html:hidden property="fromBatchUpdateAssetForm"/>
<html:hidden property="fromIndividualUpdateAssetForm"/>

<%
    AssignCategoriesForm form = (AssignCategoriesForm)request.getAttribute(AssignCategoriesForm.FORM_NAME);

    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>

<c:set var="form" value="<%=request.getAttribute(AssignCategoriesForm.FORM_NAME) %>"/>
<span onKeyPress="return trapEnterKey(event);">
<base:outlinedTable id="<%=AssignCategoriesForm.TABLE_MAIN%>" borderColor="#C0C0C0" cellpadding="6" cellspacing="1">
    <tr>
        <td>
            <table id="addCategory" width="100%" cellpadding="0" cellspacing="0">
                <tr>
                    <td class="ColRowBold tdAlignRight">
                         <%= MessageHelper.formatMessage("assigncategories_AddCategory", form.getCopyItemDisplayable()) %>&nbsp;
                    </td>
                    <td>
                        <html:text property="<%=AssignCategoriesForm.FIELD_ADD_CATEGORY_DESCRIPTION%>" size="40" maxlength="30"/>
                        <base:genericButton name="<%=AssignCategoriesForm.BUTTON_ADD_CATEGORY %>" alt='<%= MessageHelper.formatMessage("add") %>' src="/buttons/small/add.gif" absbottom="true"/>
                    </td>
                    <td class="tdAlignRight">
                        <base:okButton/>
                    </td>    
                </tr>
                <tr>
                    <td valign="top" class="tdAlignRight">
                        &nbsp;
                    </td>
                    <td class="ColRow" valign="top">
                        <c:choose>
                            <c:when test="${form.store.districtUser}">
                                <html:hidden property="<%=AssignCategoriesForm.FIELD_ADD_CATEGORY_RESTRICTED%>" value="false"/>
                            </c:when>
                            <c:otherwise>
                                <html:checkbox property="<%=AssignCategoriesForm.FIELD_ADD_CATEGORY_RESTRICTED%>"/><%= MessageHelper.formatMessage("assigncategories_Restricted") %>
                                <% if (form.getCollectionType() == CollectionType.ASSET) { %>
                                <base:helpTag helpFileName="d_restrict_item_category_AM.htm"/>
                                <% } else { %>
                                <base:helpTag helpFileName="d_restrict_copy_category_LM_TM_MM.htm"/>
                                <% } %>
                            </c:otherwise>
                        </c:choose>
                    </td>
                    <td valign="top" class="tdAlignRight">
                        &nbsp;
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    <tr>
        <td nowrap="nowrap" height="18" background="/images/icons/general/thickline.gif">
            <span class="SectionHeader">
                ${form.collectionTypeCategoriesHeading}
            </span>
        </td>
    </tr>
    <tr>
        <td class="Instruction" colspan="3">
        <% String  copyItemDisplayable= form.getCopyItemDisplayable().toLowerCase() ;%>
         <%= MessageHelper.formatMessage("assigncategories_YouMustSaveTheToPreserveChanges", copyItemDisplayable) %>
        </td>
    </tr>
    <tr>
        <td colspan="3">
            <table id="<%=AssignCategoriesForm.TABLE_CATEGORY_LIST%>" width="100%" cellspacing="3">
                <c:choose>
                <c:when test="${! empty form.categoryList}"> 
                    <tr>
                        <td class="SmallColHeading"><%= MessageHelper.formatMessage("assigncategories_Name") %></td>
                        <td class="SmallColHeading" align="center">
                            <c:choose>
                                <c:when test="${form.store.districtUser}">
                                    &nbsp;
                                </c:when>
                                <c:otherwise>
                                    <%= MessageHelper.formatMessage("assigncategories_Restricted") %>
                                </c:otherwise>
                            </c:choose>
                        </td>
                        <% if( !form.isFromBatchUpdateAssetForm() && !form.isFromGlobalUpdateAssetForm() && !form.isFromIndividualUpdateAssetForm()) { %>
                            <td class="SmallColHeading" align="center"><%= MessageHelper.formatMessage("assigncategories_Assigned") %></td>
                        <% } %>
                    </tr>
                    <c:forEach var="category" items="${form.categoryList}">
                        <tr>
                            <td colspan="3">
                                <base:imageLine/>
                            </td>
                        </tr>                
                        <tr>
                            <td class="ColRowBold">
                                <c:out value="${category.description}" escapeXml="true"/>
                            </td>
                            <td align="center">
                                <c:choose>
                                    <c:when test="${! form.store.districtUser && category.restricted}">
                                        <base:image src="/icons/general/check.gif"/>
                                    </c:when>
                                    <c:otherwise>
                                        &nbsp;
                                    </c:otherwise>
                                </c:choose>
                            </td>
                            <% if( !form.isFromBatchUpdateAssetForm() && !form.isFromGlobalUpdateAssetForm() && !form.isFromIndividualUpdateAssetForm() ) { %>
                                <td align="center">
                                    <html:multibox property="<%= AssignCategoriesForm.FIELD_SELECTED_CATEGORIES %>" >
                                        ${category.description}
                                    </html:multibox>
                                </td>
                            <% } %>
                        </tr>                
                    </c:forEach>
                </c:when>
                <c:otherwise>
                    <tr>
                        <td class="Instruction"><%= MessageHelper.formatMessage("assigncategories_ThereAreNoCategoriesDefinedForYourCollection") %></td>
                    </tr>
                </c:otherwise>
                </c:choose>
            </table>
        </td>
    </tr>
</base:outlinedTable>
</span>
</base:form>
