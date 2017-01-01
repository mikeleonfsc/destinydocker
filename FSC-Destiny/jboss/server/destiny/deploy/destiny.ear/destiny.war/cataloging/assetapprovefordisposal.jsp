<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ page import="com.follett.fsc.destiny.session.common.HTMLHelper" %>
<%@ page import="java.text.DateFormat" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%
    AssetApproveForDisposalForm form = (AssetApproveForDisposalForm)request.getAttribute(AssetApproveForDisposalForm.FORM_NAME);
%>

<%@page import="org.apache.struts.util.ResponseUtils"%>

<%@page import="com.follett.fsc.common.StringHelper"%><c:set var="items" value="<%= form.getAvailableCopies() %>" />

<base:messageBox strutsErrors="true"/>
<base:form action="/cataloging/servlet/handleassetapprovefordisposalform.do">

<c:if test="<%=form.getDeleteAssetDisposalVO() != null%>">
    <html:hidden property="<%=AssetApproveForDisposalForm.PARAM_COPY_ID%>"/>
    <base:imageSpacer width="1" height="3"/>
    <base:messageBox showWarningIcon="true" message='<%= "Item" + (form.getDeleteAssetDisposalVO().getCopyBarcode() == null ? "" : " " + form.getDeleteAssetDisposalVO().getCopyBarcode()) + " will be deleted."%>'>
        <tr>
            <td align="center" class="ColRow" colspan="2">
                Are you sure you want to delete this item?
            </td>
        </tr>
        <tr>
            <td align="center" class="Instruction" colspan="2">You may want to print this page for your records before proceeding.</td>
        </tr>
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:yesNo/>
            </td>
        </tr>
    </base:messageBox>
</c:if>
<br/>
<br/>

<base:outlinedTable id="<%= AssetApproveForDisposalForm.TABLE_APPROVE_FOR_DISPOSAL %>" cellpadding="2" cellspacing="0" width="100%" borderColor="#C0C0C0">
    <tr>
        <td class="TableHeading colspan="2"">
            Resources Needing Approval for Disposal
        </td>
    </tr>
    <c:choose>
        <c:when test="${empty items}">
            <tr><td colspan="2">&nbsp;</td></tr>
            <tr>
                <td class="ColRowBold" align="center" colspan="2">There are no more resource disposals to approve.</td>
            </tr>
        </c:when> 
        <c:otherwise>
            <tr>
                <td width="100%" colspan="2">
                    <base:imageLine/>
                </td>
            </tr>
            <tr>
                <td width="100%" class="tdAlignRight" colspan="2">
                    <base:link href="<%=form.getSelectAllLink() %>" id="<%=AssetApproveForDisposalForm.ID_SELECT_ALL%>">
                        <base:image src="/buttons/small/selectall_opaque.gif" alt="<%=AssetApproveForDisposalForm.ALT_SELECT_ALL %>"/>
                    </base:link>
                    <base:link href="<%=form.getClearAllLink() %>" id="<%=AssetApproveForDisposalForm.ID_CLEAR_ALL%>">
                        <base:image src="/buttons/small/clearall_opaque.gif" alt="<%=AssetApproveForDisposalForm.ALT_CLEAR_ALL %>"/>
                    </base:link>
                </td>
            </tr>
            <tr><td>
            <table id="<%= AssetApproveForDisposalForm.TABLE_ASSET_DETAIL %>" cellpadding="2" cellspacing="0" width="100%">  
            <c:forEach items="${items}" var="item">
                <jsp:useBean id="item" type="com.follett.fsc.destiny.session.cataloging.ejb.data.AssetDisposalVO"/>
                <tr>
                    <td class="ColRowBold">
                        <%= form.getTitleDetailLink(item.getBibTitle(), item.getBibID(), item.getSiteShortName()) %>
                    </td>
                    <td class="tdAlignRight" valign="top" rowspan="3">
                        <base:link href="<%=form.getApproveLink(item.getCopyID()) %>" id="<%= AssetApproveForDisposalForm.ID_APPROVE_PREFIX + item.getCopyID()%>">
                            <base:image src="/buttons/small/approve_70.gif" alt="<%=AssetApproveForDisposalForm.ALT_APPROVE %>"/>
                        </base:link><base:spanIfAllowed permission="<%= Permission.CAT_ASSET_EDIT_ASSET_ITEM %>"><br/>
                        <base:link href="<%=form.getDeclineLink(item.getCopyID()) %>" id="<%= AssetApproveForDisposalForm.ID_DECLINE_PREFIX + item.getCopyID()%>">
                            <base:image src="/buttons/small/decline.gif" alt="<%=AssetApproveForDisposalForm.ALT_DECLINE %>"/>
                        </base:link></base:spanIfAllowed><base:spanIfAllowed permission="<%= Permission.CAT_ASSET_DELETE_ASSET_ITEM %>"><br/>
                        <base:link href="<%=form.getDeleteLink(item.getCopyID()) %>" id="<%= AssetApproveForDisposalForm.ID_DELETE_PREFIX + item.getCopyID()%>">
                            <base:image src="/buttons/small/delete_70.gif" alt="<%=AssetApproveForDisposalForm.ALT_DELETE %>"/>
                        </base:link></base:spanIfAllowed>
                    </td>
                </tr>
                <tr>
                    <td class="ColRow" colspan="2">
                        <span class="ColRowBold">Barcode:</span>&nbsp;<%= item.getCopyBarcode() == null ? "" : item.getCopyBarcode() %>
                    </td>
                </tr>
                <tr>
                    <td class="ColRow" colspan="2">
                        <span class="ColRowBold">Custodian:</span>&nbsp;<%= item.getCustodianName() %>
                    </td>
                </tr>
                <tr>
                    <td class="ColRow">
                        <% if (StringHelper.isEmptyOrWhitespace(item.getDistrictID())) { %>
                            &nbsp;
                        <% } else { %>
                            <span class="ColRowBold">District ID:</span>&nbsp;<%= item.getDistrictID() %>
                        <% } %>
                    </td>
                    <td class="ColRowBold tdAlignRight" nowrap>
                        <base:assetDisposalMultipleCheckbox itemVO="<%= item %>" checked="<%= form.isCheckboxChecked(item.getCopyID()) %>" displayText="Select to approve" checkBoxName="<%= AssetApproveForDisposalForm.CHECKBOX_PREFIX %>"/>
                    </td>
                </tr>
                <tr><td colspan="2">&nbsp;</td></tr>
            </c:forEach>
            </td></tr>
            </table>
            <tr>
                <td width="100%" colspan="2">
                    <base:imageLine/>
                </td>
            </tr>
            <tr>
                <td width="100%" class="tdAlignRight" colspan="2">
                    <base:link href="<%=form.getSelectAllLink() %>">
                        <base:image src="/buttons/small/selectall_opaque.gif" alt="<%=AssetApproveForDisposalForm.ALT_SELECT_ALL %>"/>
                    </base:link>
                    <base:link href="<%=form.getClearAllLink() %>">
                        <base:image src="/buttons/small/clearall_opaque.gif" alt="<%=AssetApproveForDisposalForm.ALT_CLEAR_ALL %>"/>
                    </base:link>
                </td>
            </tr>
            <tr>
                <td width="100%" class="tdAlignRight" colspan="2">
                    <base:genericButton name="<%=AssetApproveForDisposalForm.BUTTON_APPROVE_SELECTED %>"
                           src="/buttons/small/approveselected.gif"
                           alt="<%=AssetApproveForDisposalForm.ALT_APPROVE_SELECTED %>"/>
                </td>
            </tr>
        </c:otherwise>
    </c:choose>
    
</base:outlinedTable>
</base:form>
