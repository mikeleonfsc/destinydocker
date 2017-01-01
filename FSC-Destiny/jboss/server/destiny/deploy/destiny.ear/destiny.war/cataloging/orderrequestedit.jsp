<%@page import="com.follett.fsc.destiny.util.lookup.LongStringLookup"%>
<%@page language="java" %>
<%@page contentType="text/html; charset=UTF-8" %>
<%@page import="java.util.List"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%>
<%@page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@page import="com.follett.fsc.destiny.util.HTMLFilterHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.OrdersSpecs"%>
<%@ page import="com.follett.fsc.destiny.session.cataloging.ejb.AssetSearchFacadeSpecs"%>
<%@page import="com.follett.fsc.common.StringHelper" %>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.apache.struts.util.ResponseUtils"%>
<%@page import="com.follett.fsc.destiny.util.lookup.LongLongLookup"%>
<%@page import="com.follett.fsc.destiny.util.Barcode"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.BarcodeListTag"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.data.OrderTitleSearchVO"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.data.OrderTitleVO"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-format.tld" prefix="fmt" %>

<%
    OrderRequestEditForm form = (OrderRequestEditForm) request.getAttribute(OrderRequestEditForm.FORM_NAME);
    boolean haveResults = false;
    List<OrderTitleVO> searchResultListTextbooks = new ArrayList<OrderTitleVO>();
    List<OrderTitleVO> searchResultListNonTextbookResources = new ArrayList<OrderTitleVO>();
    
    int totalCounter = 0;

    SessionStoreProxy store = form.getStore();
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    OrderTitleSearchVO searchVO = form.getSearchResults();
    
    if (searchVO != null) {
        List<OrderTitleVO> recList = searchVO.getResults();
        haveResults = (recList != null) && (recList.size() > 0);
        
        for (OrderTitleVO rec : recList) {
            if (form.getCollectionType() == CollectionType.TEXTBOOK || rec.isTextbookAsset()) {
                searchResultListTextbooks.add(rec);    
            } else {
                searchResultListNonTextbookResources.add(rec);
            }
        }
    }
    String unsavedChangesStyle = "";
    if (form.isOrderEdited()) {
        unsavedChangesStyle = "visibility: show; display: block";
    } else {
        unsavedChangesStyle = "visibility: hidden; display: none";
    }
    String focusControl = form.getOverrideFocusControl();

    if (StringHelper.isEmptyOrWhitespace(focusControl) && !form.isReadOnly()) {
        focusControl = OrderRequestEditForm.FIELD_NAME;
    }
    
    
    List<OrderTitleVO> commonOrderList = form.getOrderVO().getTitleList();

    List<OrderTitleVO> orderListTextbooks = new ArrayList<OrderTitleVO>();
    List<OrderTitleVO> orderListNonTextbookResources = new ArrayList<OrderTitleVO>();

    for (OrderTitleVO rec : commonOrderList) {
        if (form.getCollectionType() == CollectionType.TEXTBOOK || rec.isTextbookAsset()) {
            orderListTextbooks.add(rec);    
        } else {
            orderListNonTextbookResources.add(rec);
        }
        totalCounter++;
    }     
    
%>

<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@page import="com.follett.fsc.common.TimestampHelper"%>
<%@page import="com.follett.fsc.destiny.session.common.HTMLHelper"%>
<%@page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.buttons.CloseButtonTag"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag"%>

<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="com.follett.fsc.common.MessageHelper"%><bean:define id="searchTypes" name="cataloging_servlet_OrderRequestEditForm" property="searchTypes"/>

<script language="JavaScript">
<!--
    function submitDropDown() {
        document.<%=OrderRequestEditForm.FORM_NAME%>.<%=OrderRequestEditForm.PARAM_DROPDOWN_SUBMITTED%>.value = "true";
        document.<%=OrderRequestEditForm.FORM_NAME%>.submit();
    }

    function submitOnTemplateChange() {
        document.<%=OrderRequestEditForm.FORM_NAME%>.<%=OrderRequestEditForm.FIELD_ASSET_TEMPLATE_TYPE_CHANGED%>.value = "true";
        document.<%=OrderRequestEditForm.FORM_NAME%>.submit();
    }

    function trapEnterKey(e, bibID) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (whichCode == 13) {
        if (bibID == -1) {
            whichCode = 10;
        } else {
            document.<%=OrderRequestEditForm.FORM_NAME%>.<%=OrderRequestEditForm.PARAM_WHERE_WAS_ENTER%>.value=bibID;                       
            document.<%=OrderRequestEditForm.FORM_NAME%>.<%=OrderRequestEditForm.FIELD_TRAP_ENTER_PRESSED%>.value = "true";
        }
      }
      return whichCode;
    }

    function showEdited(e) {
        var whichCode = (window.Event) ? e.which : e.keyCode;
        if (e.keyCode != 9) {
            document.<%=OrderRequestEditForm.FORM_NAME%>.<%=OrderRequestEditForm.PARAM_ORDER_EDITED%>.value = "true";
            if (document.layers) { //netscape
                window.document['divUnsavedChanges'].visibility = 'show';
                window.document['divUnsavedChanges'].display = 'block';
            } else if (document.all) { //ie
                document.all['divUnsavedChanges'].style.visibility = 'visible';
                document.all['divUnsavedChanges'].style.display = 'block';
            } else if (document.getElementById) { //other
                document.getElementById('divUnsavedChanges').style.visibility = 'visible';
                document.getElementById('divUnsavedChanges').style.display = 'block';
            }
            var whichCode = (window.Event) ? e.which : e.keyCode;
            if (e.keyCode == 13) {
                document.<%=OrderRequestEditForm.FORM_NAME%>.<%=OrderRequestEditForm.PARAM_WHERE_WAS_ENTER%>.value=-1;                       
                document.<%=OrderRequestEditForm.FORM_NAME%>.<%=OrderRequestEditForm.FIELD_TRAP_ENTER_PRESSED%>.value = "true";
            }
        }
        return whichCode;
    }
    function viewTitle(bibID) {
        document.<%=OrderRequestEditForm.FORM_NAME%>.<%=OrderRequestEditForm.PARAM_VIEW_BIB_ID%>.value = bibID;
        document.<%=OrderRequestEditForm.FORM_NAME%>.submit();
    }
    function viewStateTitle(bibID) {
        document.<%=OrderRequestEditForm.FORM_NAME%>.<%=OrderRequestEditForm.PARAM_VIEW_STATE_BIB_ID%>.value = bibID;
        document.<%=OrderRequestEditForm.FORM_NAME%>.submit();
    }
    function viewNotes() {
        document.<%=OrderRequestEditForm.FORM_NAME%>.<%=OrderRequestEditForm.PARAM_ORDER_NOTES_VIEW_LINK_PRESSED%>.value = "true";
        document.<%=OrderRequestEditForm.FORM_NAME%>.submit();
    }
    
    window.onload = function scrollToSelected(){
        var elem = document.getElementsByName("anchorOrderDetails");
        elem[0].scrollIntoView();
    }
    
//-->
</script>

<div id="divUnsavedChanges" style="<%=unsavedChangesStyle%>">
    <%
        String message = "Order has unsaved changes.</center>";
    %>
    <base:messageBox tableID="<%=OrderRequestEditForm.TABLE_ORDER_UNSAVED_CHANGES%>" showWarningIcon="true" filterMessage="false" message='<%=message%>'></base:messageBox>
</div>


<base:messageBox strutsErrors="true"/>
<base:form action="/cataloging/servlet/handleorderrequesteditform.do" styleId="keywordList" focus="<%=focusControl%>" enctype="multipart/form-data">
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true" name="trapEnterKey">
<html:hidden property="orderID"/>
<html:hidden property="<%=OrderRequestEditForm.PROPERTY_DISTRICT_SITE_DISPLAY%>"/>
<html:hidden property="<%=OrderRequestEditForm.PARAM_DROPDOWN_SUBMITTED%>"/>
<html:hidden property="<%=OrderRequestEditForm.PARAM_ORDER_NOTES_VIEW_LINK_PRESSED%>"/>
<html:hidden property="<%=OrderRequestEditForm.PARAM_ORDER_EDITED%>"/>
<html:hidden property="<%=OrderRequestEditForm.PARAM_VIEW_BIB_ID%>"/>
<html:hidden property="<%=OrderRequestEditForm.PARAM_VIEW_STATE_BIB_ID%>"/>
<html:hidden property="<%=OrderRequestEditForm.PARAM_WHERE_WAS_ENTER%>" value="0"/>
<html:hidden property="<%=OrderRequestEditForm.FIELD_TRAP_ENTER_PRESSED%>" value="false"/>
<html:hidden property="<%=OrderRequestEditForm.PARAM_APPROVED_ORDER_WITH_ALL_ZERO_QUANTITY_ORDERED%>"/>
<html:hidden property="<%=OrderRequestEditForm.PARAM_COLLECTION_TYPE%>" value="<%=String.valueOf(form.getCollectionType())%>" />
<html:hidden property="<%=OrderRequestEditForm.FIELD_ASSET_TEMPLATE_TYPE_CHANGED%>"/>

<%
    String bgColor = "#FFFFFF";
        if (!form.isPrinterFriendly()) {
            bgColor = FlipperTag.ROW_GRAY;
        }
%>
<%
    if (form.isDeleteConfirmation()) {
%>
        <html:hidden property="<%=OrderRequestEditForm.FIELD_BIB_ID_TO_DELETE%>"/>
        
        <base:messageBox tableID="<%=OrderRequestEditForm.TABLE_REMOVE_TITLE_MESSAGE_BOX%>" showRedBorder="true">
            <tr>
                <td valign="top">
                    <%=MessageBoxTag.getCAUTION_IMAGE_HTML()%>
                </td>
                <td class="ColRowBold">
                    Are you sure you want to remove &quot;<%=ResponseUtils.filter(form.getTitleToDelete())%>&quot; from this order?
                </td>
            </tr>
            <tr>
                <td align="center" class="ColRow" colspan="2">
                    <base:yesNo/>
                </td>
            </tr>
        </base:messageBox>
<%
    }
%>

<%
    if (form.showRestrictedMessage()) {
%>
        <base:messageBox tableID="<%=OrderRequestEditForm.TABLE_REMOVE_TITLE_MESSAGE_BOX%>" showRedBorder="true">
            <tr>
                <td valign="top" align="left">
                    <%=MessageBoxTag.getCAUTION_IMAGE_HTML()%>
                </td>
                <td class="ColRowBold">
                    Your site is currently restricted from sending orders.  Please contact the State Textbook Office. 
                </td>
            </tr>
        </base:messageBox>
<%
    }
%>

<%
    if (form.isDoOrderModifiedByAnotherUserMessage()) {
%>
        <html:hidden property="<%=OrderRequestEditForm.PARAM_DO_ORDER_MODIFIED_MESSAGE%>"/>
        <base:messageBox tableID="<%=OrderRequestEditForm.TABLE_ORDER_MODIFIED_MESSAGE_BOX%>" showRedBorder="true">
            <tr>
                <td valign="top">
                    <%=MessageBoxTag.getCAUTION_IMAGE_HTML()%>
                </td>
                <td class="ColRowBold">
                    This order has been modified by another user.
                </td>
            </tr>
            <tr>
                <td align="center" class="ColRow" colspan="2">
                    <base:okButton
                     name="<%=OrderRequestEditForm.BUTTON_ORDER_MODIFIED_OK%>"/>
                </td>
            </tr>
        </base:messageBox>
<%
    }
%>

<%
    if (form.isDoReviveMessage()) {
%>
        <html:hidden property="<%=OrderRequestEditForm.PARAM_DO_REVIVE_MESSAGE%>"/>
        <base:messageBox tableID="<%=OrderRequestEditForm.TABLE_REVIVE_ORDERS_MESSAGE_BOX%>" showRedBorder="true">
            <tr>
                <td valign="top">
                    <%=MessageBoxTag.getCAUTION_IMAGE_HTML()%>
                </td>
                <td class="ColRowBold">
                    Are you sure you want to revive this order?
                </td>
            </tr>
            <tr>
                <td align="center" class="ColRow" colspan="2">
                    <base:yesNo/>
                </td>
            </tr>
        </base:messageBox>
<%
    }
%>
<%
    if (form.isDoSaveSendMessage()) {
%>
        <html:hidden property="<%=OrderRequestEditForm.PARAM_DO_SAVE_SEND_MESSAGE%>"/>
        <base:messageBox tableID="<%=OrderRequestEditForm.TABLE_CERTIFY_ORDER_MESSAGE_BOX%>" showRedBorder="true">
            <tr>
                <td valign="top">
                    <%=MessageBoxTag.getCAUTION_IMAGE_HTML()%>
                </td>
                <td class="ColRowBold">
                    I certify that this order is in compliance with the Ordering Guidelines for the state.
                </td>
            </tr>
            <tr>
                <td align="center" class="ColRow" colspan="2">
                    <base:yesNo/>
                </td>
            </tr>
        </base:messageBox>
<%
    }
%>
<%
    if (form.getApprovalConfirmationMessage() != null) {
%>
        <base:messageBox tableID="<%=OrderRequestEditForm.TABLE_APPROVE_MESSAGE_BOX%>" showRedBorder="true">
            <tr>
                <td valign="top">
                    <%=MessageBoxTag.getCAUTION_IMAGE_HTML()%>
                </td>
                <td class="ColRowBold">
                    <%=form.getApprovalConfirmationMessage()%>
                </td>
            </tr>
            <%
                if (!form.isApprovalContainsBlanks()) {
            %>
                <tr>
                    <td align="center" class="ColRow" colspan="2">
                        <base:yesNo
                        buttonYesName="<%=OrderRequestEditForm.BUTTON_APPROVE_YES%>" 
                        buttonNoName="<%=OrderRequestEditForm.BUTTON_APPROVE_NO%>"/>
                    </td>
                </tr>
             <%
                 }
             %>
        </base:messageBox>                
<%
                    }
                %>
<%
    if (form.getCancelOrderConfirmationMessage() != null) {
%>
        <base:messageBox tableID="<%=OrderRequestEditForm.TABLE_CANCEL_ORDER_MESSAGE_BOX%>" showRedBorder="true">
            <tr>
                <td valign="top">
                    <%=MessageBoxTag.getCAUTION_IMAGE_HTML()%>
                </td>
                <td class="ColRowBold">
                    <%=form.getCancelOrderConfirmationMessage()%>
                </td>
            </tr>
            <%
                if (form.isAbleToCancelOrder()) {
            %>
                <tr>
                    <td align="center" class="ColRow" colspan="2">
                        <base:yesNo
                        buttonYesName="<%=OrderRequestEditForm.BUTTON_CANCEL_ORDER_YES%>" 
                        buttonNoName= "<%=OrderRequestEditForm.BUTTON_CANCEL_ORDER_NO%>"/>
                    </td>
                </tr>
             <%
                 }
             %>
        </base:messageBox>
<%
    }
%>
<%
    if (form.getDenyConfirmationMessage() != null) {
%>
        <base:messageBox tableID="<%=OrderRequestEditForm.TABLE_DENY_MESSAGE_BOX%>" showRedBorder="true">
        
                    <tr>
                        <td valign="top">
                            <%=MessageBoxTag.getCAUTION_IMAGE_HTML()%>
                        </td>
                        <td class="ColRowBold">
                            <%=form.getDenyConfirmationMessage()%>
                        </td>
                    </tr>
            <%
                if (form.isApprovedOrderWithAllZeroQuantityOrdered()) {
            %>
                <tr>
                    <td align="center" class="ColRowBold" colspan="2">
                        <%=OrderRequestEditForm.MSG_APPROVE_ZERO_QUANTITY_ORDERED_CONFIRMATION%>
                    </td>
                </tr>
            <%
                }
            %>
            <tr>
                <td align="center" class="ColRow" colspan="2">
                    <base:yesNo
                    buttonYesName="<%=OrderRequestEditForm.BUTTON_DENY_YES%>" 
                    buttonNoName="<%=OrderRequestEditForm.BUTTON_DENY_NO%>"/>
                </td>
            </tr>
        </base:messageBox>
<%
    }
%>

<c:if test="<%=!StringHelper.isEmpty(form.getOrderCompleteMessage())%>">
<base:messageBox showRedBorder="true">
       <tr>
           <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
           <td class="ColRowBold" align="center"><%=form.getOrderCompleteMessage()%></td>
       </tr>
</base:messageBox>
</c:if>

<base:outlinedTable id="<%=OrderRequestEditForm.TABLE_MAIN%>" borderColor="<%=bgColor%>" align="center" width="100%">
<% int tabOrder = 0; %>
    <tr>
        <td class="TableHeading" valign="top">
            <%=form.getPageTitle()%>
        </td>
    </tr>
    <%
        if (form.isPreorder() && form.isAbleToSaveAndSend()) {
    %>
        <tr>
            <td class="ColRow" valign="top">
               <font color="#CC0000">You may only submit one Pre-order. Please verify your order before sending to the State Textbook Office.</font>
            </td>
        </tr>
    <%
        }
    %>
    <%
        if (!StringHelper.isEmpty(form.getTotalCopiesOnBackorder())) {
    %>
        <tr>
            <td class="ColRow" valign="top">
                <b><%=form.getCollectionType() == CollectionType.ASSET ? "Number of items on backorder:" : "Number of copies on backorder:"%></b><font color="#CC0000">&nbsp;<%=form.getTotalCopiesOnBackorder()%></font>
                <%
                    if (store.isStateContext() || store.isAtDistrictWarehouse()) {
                %>
                &nbsp;&nbsp;<base:genericButton name="<%=OrderRequestEditForm.BUTTON_EDIT_BACKORDERS%>" src="/buttons/large/edit.gif" alt="Edit backorders"/>
                <%
                    }
                %>
            </td>
        </tr>
    <%
        }
    %>
    <%
        if (!StringHelper.isEmpty(form.getOrderVO().getOrderNumber())) {
    %>
        <tr>
            <td class="ColRow" valign="top">
                <b>Order #:</b>&nbsp;<%=form.getOrderVO().getOrderNumber()%>
            </td>
        </tr>
    <%
        }
    %>
    <%
        if (!StringHelper.isEmpty(form.getAddViewNoteLinkText())) {
    %>
        <tr>
            <td class="ColRow" valign="top">
                <base:image alt="View Note" src="/icons/general/notetransfer.gif"/>&nbsp;<a href="javascript:viewNotes();"><%=form.getAddViewNoteLinkText()%></a>
            </td>
        </tr>
    <%
        }
    %>
    <tr>
        <td class="TableHeading" colspan="2">
            <base:imageLine vspace="1" height="1" width="100%"/>
        </td>
    </tr>
    <%-- form fields go here --%>
    
    <tr>
        <td>
            <table id="<%=OrderRequestEditForm.TABLE_EDIT_FIELDS%>" align="center">
                <tr valign="top">
                    <td class="ColRowBold tdAlignRight" nowrap>
                        <%=form.isAbleToModifyOrder() ? "* " : ""%>Name
                    </td>
                    <td class="ColRow">
                        <c:choose>
                            <c:when test="<%=form.isAbleToModifyOrder()%>">
                                <html:text property="<%=OrderRequestEditForm.FIELD_NAME%>" size="21" maxlength="<%=String.valueOf(OrdersSpecs.MAX_LENGTH_NAME)%>" onkeypress="showEdited(event)" tabindex="1"/>
                            </c:when>
                            <c:otherwise>
                                <%=JSPHelper.filterHtmlAndNulls(form.getOrderVO().getName())%>
                                <html:hidden property="<%=OrderRequestEditForm.FIELD_NAME%>"/>
                            </c:otherwise>
                        </c:choose>
                    </td>
                    <td class="ColRow">
                        &nbsp;
                    </td>
                    <td class="ColRowBold tdAlignRight" nowrap>
                        Email
                    </td>
                    <td class="ColRow">
                        <c:choose>
                            <c:when test="<%=form.isAbleToModifyOrder()%>">
                                <html:text property="<%=OrderRequestEditForm.FIELD_EMAIL%>" size="21" maxlength="<%=String.valueOf(OrdersSpecs.MAX_LENGTH_EMAIL_ADDRESS)%>" onkeypress="showEdited(event)" tabindex="4"/>
                            </c:when>
                            <c:otherwise>
                                <%=JSPHelper.filterHtmlAndNulls(form.getOrderVO().getEmailAddress())%>
                                <html:hidden property="<%=OrderRequestEditForm.FIELD_EMAIL%>"/>
                            </c:otherwise>
                        </c:choose>
                    </td>
                </tr>
                <tr valign="top">
                    <td class="ColRowBold tdAlignRight" nowrap>
                        <%=form.isAbleToModifyOrder() ? "* " : ""%>Phone Number
                    </td>
                    <td class="ColRow">
                        <c:choose>
                            <c:when test="<%=form.isAbleToModifyOrder()%>">
                                <html:text property="<%=OrderRequestEditForm.FIELD_PHONE%>" size="21" maxlength="<%=String.valueOf(OrdersSpecs.MAX_LENGTH_PHONE)%>" onkeypress="showEdited(event)" tabindex="2"/>
                            </c:when>
                            <c:otherwise>
                                <%=JSPHelper.filterHtmlAndNulls(form.getOrderVO().getPhoneNumber())%>
                                <html:hidden property="<%=OrderRequestEditForm.FIELD_PHONE%>"/>
                            </c:otherwise>
                        </c:choose>
                    </td>
                    <td class="ColRow">
                        &nbsp;
                    </td>
                    <td class="ColRowBold tdAlignRight" nowrap>
                        Ship After
                    </td>
                    <td class="ColRow" >
                        <c:choose>
                            <c:when test="<%=form.isAbleToModifyOrder()%>">
                                <base:date onKeyPress="showEdited(event)"
                                    buttonName = "<%=OrderRequestEditForm.BUTTON_CHANGE_DATE%>"
                                    fieldName = "<%=OrderRequestEditForm.FIELD_SHIP_AFTER%>"
                                    dateValue = "<%=form.getShipAfter()%>"
                                    altText = "Change Ship After date"
                                    tabIndex = "5"
                                />
                            </c:when>
                            <c:otherwise>
                                <%=lh.formatDate(form.getOrderVO().getShipAfterDate())%>
                                <html:hidden property="<%=OrderRequestEditForm.FIELD_SHIP_AFTER%>"/>
                            </c:otherwise>
                        </c:choose>
                    </td>
                </tr>
                <tr valign="top">
                    <td class="ColRowBold tdAlignRight" nowrap>
                         <%=form.isFaxRequired() ? "* " : ""%>Fax
                    </td>
                    <td>
                        <span class="ColRow">
                        <c:choose>
                            <c:when test="<%=form.isAbleToModifyOrder()%>">
                                <html:text property="<%=OrderRequestEditForm.FIELD_FAX%>" size="21" maxlength="<%=String.valueOf(OrdersSpecs.MAX_LENGTH_FAX)%>" onkeypress="showEdited(event)" tabindex="3"/>
                            </c:when>
                            <c:otherwise>
                                <%=JSPHelper.filterHtmlAndNulls(form.getOrderVO().getFaxNumber())%>
                                <html:hidden property="<%=OrderRequestEditForm.FIELD_FAX%>"/>
                            </c:otherwise>
                        </c:choose>
                        </span>
                        <%
                            if (form.isAbleToModifyOrder()) {
                        %>
                        <br>
                        <span class="Instruction">* = Required</span>
                        <%
                            }
                        %>
                    </td>
                    <td class="ColRow">
                        &nbsp;
                    </td>
                <%
                    tabOrder = 6;
                    if (form.getOrderID() == null) {
                %>
                    <td class="ColRowBold tdAlignRight" nowrap>
                        Note
                    </td>
                    <td class="ColRow">
                        <html:textarea property="<%=OrderRequestEditForm.FIELD_NOTE%>" rows="2" cols="20" onkeypress="showEdited(event)" tabindex="<%=String.valueOf(tabOrder) %>"/>
                    </td>
                    <% tabOrder++; %>
                <%
                    } else {
                %>
                    <td class="ColRowBold tdAlignRight" nowrap>
                        &nbsp;
                    </td>
                    <td class="ColRow">
                        &nbsp;
                    </td>
                <%
                    }
                %>
                </tr>
            </table>
        </td>
        
        <td valign="top" class="tdAlignRight">
        <%
            if (!form.isPrinterFriendly()) {
                        boolean displayCancelButton = false;
        %>
        
            <table cellpadding="3">
                <c:if test="<%=form.isAbleToSaveAndSend() && form.gimmeSiteCanOrder()%>">
                    <%
                        displayCancelButton = true;
                    %>
                    <tr>
                        <td class="tdAlignRight">
                            <input type="image" tabindex="<%=String.valueOf(tabOrder) %>" align="bottom" src='<%=lh.getLocalizedImagePath("/buttons/large/saveandsend.gif")%>'  alt="<%=OrderRequestEditForm.ALT_SAVE_AND_SEND%>" title="<%=OrderRequestEditForm.ALT_SAVE_AND_SEND%>" name="<%=OrderRequestEditForm.BUTTON_SAVE_AND_SEND%>"/>
                        </td>
                        <% tabOrder++; %>
                    </tr>
                </c:if>
                <c:if test="<%=form.isAbleToApproveDeny() && !form.isReadOnly()%>">
                    <%
                        displayCancelButton = true;
                    %>
                    <tr>
                        <td class="tdAlignRight">
                            <input type="image" tabindex="<%=String.valueOf(tabOrder) %>" align="bottom" src='<%=lh.getLocalizedImagePath("/buttons/large/approve.gif")%>'  alt="<%=OrderRequestEditForm.ALT_APPROVE%>" title="<%=OrderRequestEditForm.ALT_APPROVE%>" name="<%=OrderRequestEditForm.BUTTON_APPROVE%>"/>
                        </td>
                        <% tabOrder++; %>
                    </tr>
                    <tr>
                        <td class="tdAlignRight">
                            <input type="image" tabindex="<%=String.valueOf(tabOrder) %>" align="bottom" src='<%=lh.getLocalizedImagePath("/buttons/large/denyall.gif")%>'  alt="<%=OrderRequestEditForm.ALT_DENY_ORDER%>" title="<%=OrderRequestEditForm.ALT_DENY_ORDER%>" name="<%=OrderRequestEditForm.BUTTON_DENY_ORDER%>"/>
                        </td>
                        <% tabOrder++; %>
                    </tr>
                </c:if>
                <c:if test="<%=form.isAbleToDeny() && !form.isReadOnly()%>">
                    <%
                        displayCancelButton = true;
                    %>
                    <tr>
                        <td class="tdAlignRight">
                            <input type="image" tabindex="<%=String.valueOf(tabOrder) %>" align="bottom"  src='<%=lh.getLocalizedImagePath("/buttons/large/denyall.gif")%>'  alt="<%=OrderRequestEditForm.ALT_DENY_ORDER%>" title="<%=OrderRequestEditForm.ALT_DENY_ORDER%>" name="<%=OrderRequestEditForm.BUTTON_DENY_ORDER%>"/>
                        </td>
                        <% tabOrder++; %>
                    </tr>
                </c:if>
               <c:if test="<%=form.isAllowRevive()%>">
                    <tr>
                        <td class="tdAlignRight">
                            <input type="image" tabindex="<%=String.valueOf(tabOrder) %>" align="bottom"  src='<%=lh.getLocalizedImagePath("/buttons/large/revive.gif")%>'  alt="<%=OrderRequestEditForm.ALT_REVIVE%>" title="<%=OrderRequestEditForm.ALT_REVIVE%>" name="<%=OrderRequestEditForm.BUTTON_REVIVE%>"/>
                        </td>
                        <% tabOrder++; %>
                    </tr>
                </c:if>
                <c:if test="<%=form.isAbleToSave()%>">
                    <%
                        displayCancelButton = true;
                    %>
                <tr>
                    <td class="tdAlignRight">
                        <input type="image" tabindex="<%=String.valueOf(tabOrder) %>" align="bottom" src='<%=lh.getLocalizedImagePath("/buttons/large/save.gif")%>' border="0" alt='<%=MessageHelper.formatMessage("save")%>' title='<%=MessageHelper.formatMessage("save")%>' name="<%=SaveButtonTag.BUTTON_NAME%>"/>
                    </td>
                    <% tabOrder++; %>
                </tr>
                </c:if>
                <tr>
                    <td class="tdAlignRight">
                        <%
                            if (displayCancelButton) {
                        %>
                            <input type="image" tabindex="<%=String.valueOf(tabOrder) %>" align="bottom" src='<%=lh.getLocalizedImagePath("/buttons/large/cancel.gif")%>' border="0" alt='<%=MessageHelper.formatMessage("cancel")%>' title='<%=MessageHelper.formatMessage("cancel")%>' name="<%=CancelButtonTag.BUTTON_NAME%>"/>
                        <%
                            } else {
                        %>
                            <input type="image" tabindex="<%=String.valueOf(tabOrder) %>" align="bottom" src='<%=lh.getLocalizedImagePath("/buttons/large/close.gif")%>' border="0" alt='<%=MessageHelper.formatMessage("close")%>' title='<%=MessageHelper.formatMessage("close")%>' name="<%=CloseButtonTag.BUTTON_NAME%>"/>
                        <%
                            }
                        %>
                        <% tabOrder++; %>
                    </td>
                   
                </tr>
                
               <%
                                   if (form.getOrderVO().getStatus() == OrdersSpecs.STATUS_RECEIVING
                                                   || form.getOrderVO().getStatus() == OrdersSpecs.STATUS_COMPLETED
                                                   || (store.isAtDistrictWarehouse() && form.getOrderVO().getStatus() == OrdersSpecs.STATUS_ON_ORDER)) {
                               %>
               <tr>
                <td class="tdAlignRight">
                  <input type="image" tabindex="<%=String.valueOf(tabOrder) %>" align="bottom" src='<%=lh.getLocalizedImagePath("/buttons/large/shipments.gif")%>'  alt="<%=OrderRequestEditForm.ALT_VIEW_SHIPMENTS%>" title="<%=OrderRequestEditForm.ALT_VIEW_SHIPMENTS%>" name="<%=OrderRequestEditForm.BUTTON_VIEW_SHIPMENTS%>"/>
                </td>
                <% tabOrder++; %>
                </tr>
               <%
                   }
               %>
                
                <c:if test="<%=form.isAbleToCancelOrder()%>">
                <tr>
                    <td class="tdAlignRight">
                        <input type="image" tabindex="<%=String.valueOf(tabOrder) %>" align="bottom"  src='<%=lh.getLocalizedImagePath("/buttons/large/cancelorder.gif")%>'  alt="<%=OrderRequestEditForm.ALT_CANCEL_ORDER%>" title="<%=OrderRequestEditForm.ALT_CANCEL_ORDER%>" name="<%=OrderRequestEditForm.BUTTON_CANCEL_ORDER%>"/>
                    </td>
                    <% tabOrder++; %>
                </tr>
                </c:if>
                
       <%
                           } else {
                       %>
            <tr>
                <td class="tdAlignRight">
                &nbsp;
                </td>
            </tr>
       <%
           }
       %>
           </table> 
        </td>
    </tr>
    <%
        if (!form.isReadOnly() && form.isAbleToAddTitles()) {
    %>
    <tr>
        <%
            String heading = "Select "
                            + (form.getCollectionType() == CollectionType.ASSET ? "Resources " : "Titles ")
                            + (form.isAllowRevive() ? "to Add" : "") + " to Order";
        %>
        <base:sectionHeading printerFriendly="false" heading="<%=heading%>" tdContent="width='100%' colSpan='2'"/>
    </tr>
    
    <logic:equal name="<%=OrderRequestEditForm.FORM_NAME%>" property="<%=OrderRequestEditForm.FIELD_TITLES_TO_ORDER%>" value='<%="" + OrderRequestEditForm.OPTION_CREATE_LIST%>'>
      <tr>
        <td colspan="2" valign="bottom">
          <table>
          <tr>
            <td>&nbsp;</td>
            <td class="ColRowBold" align="center">State ID</td>
            <td class="ColRowBold" align="center">Quantity</td>
            <td class="ColRowBold" align="center">&nbsp;</td>
        </tr>
        <tr>
            <td valign="bottom">
              <html:select property="<%=OrderRequestEditForm.FIELD_TITLES_TO_ORDER%>" onchange="submitDropDown()" styleClass="ColRowBold" tabindex="<%=String.valueOf(tabOrder) %>" >
                  <%
                      if (form.isPreorder()) {
                  %>
                  <html:option value="<%=String.valueOf(OrderRequestEditForm.OPTION_LIST_PROGRAMS)%>"><%=OrderRequestEditForm.OPTION_LIST_PROGRAMS_DISPLAYABLE%></html:option>
                  <%
                      } else {
                  %>
                  <html:option value="<%=String.valueOf(OrderRequestEditForm.OPTION_CREATE_LIST)%>"><%=OrderRequestEditForm.OPTION_CREATE_LIST_DISPLAYABLE%></html:option>
                  <%
                      }
                  %>
                  <html:option value="<%=String.valueOf(OrderRequestEditForm.OPTION_SEARCH_FOR_TITLES)%>"><%=OrderRequestEditForm.OPTION_SEARCH_FOR_TITLES_DISPLAYABLE%></html:option>
              </html:select>
            </td>
            <% tabOrder++; %>
            <td align="center"><html:text property="<%=OrderRequestEditForm.FIELD_SEARCH_STRING%>" size="21" onkeypress="trapEnterKey(event,0)" tabindex="<%=String.valueOf(tabOrder) %>" /></td>
            <% tabOrder++; %>
            <td align="center"><html:text property="<%=OrderRequestEditForm.FIELD_QUANTITY%>" size="4" maxlength="<%=String.valueOf(OrdersSpecs.MAX_LENGTH_ORDER_QUANTITY)%>" onkeypress="trapEnterKey(event,0)" tabindex="<%=String.valueOf(tabOrder) %>" /></td>
            <% tabOrder++; %>
            <td align="center" >
            <input type="image" tabindex="<%=String.valueOf(tabOrder) %>" align="bottom" src='<%=lh.getLocalizedImagePath("/buttons/small/add.gif")%>'  alt="<%=OrderRequestEditForm.ALT_ADD_TO_ORDER%>" title="<%=OrderRequestEditForm.ALT_ADD_TO_ORDER%>" name="<%=OrderRequestEditForm.BUTTON_ADD%>"   /></td>
            <% tabOrder++; %> 
        </tr>
      </table>
    </logic:equal>
    <logic:notEqual name="<%=OrderRequestEditForm.FORM_NAME%>" property="<%=OrderRequestEditForm.FIELD_TITLES_TO_ORDER%>" value='<%="" + OrderRequestEditForm.OPTION_CREATE_LIST%>'>
    <tr>
      <td colspan="2" valign="bottom" nowrap >
          <table><tr>
        <c:if test="<%=store.isStateRepositoryRunning()%>">
          <td>
          <html:select property="<%=OrderRequestEditForm.FIELD_TITLES_TO_ORDER%>" onchange="submitDropDown()" styleClass="ColRowBold" tabindex="<%=String.valueOf(tabOrder) %>" >
          <% tabOrder++; %> 
              <%
                   if (form.isPreorder()) {
               %>
              <html:option value="<%=String.valueOf(OrderRequestEditForm.OPTION_LIST_PROGRAMS)%>"><%=OrderRequestEditForm.OPTION_LIST_PROGRAMS_DISPLAYABLE%></html:option>
              <%
                  } else {
              %>
              <html:option value="<%=String.valueOf(OrderRequestEditForm.OPTION_CREATE_LIST)%>"><%=OrderRequestEditForm.OPTION_CREATE_LIST_DISPLAYABLE%></html:option>
              <%
                  }
              %>
              <html:option value="<%=String.valueOf(OrderRequestEditForm.OPTION_SEARCH_FOR_TITLES)%>"><%=OrderRequestEditForm.OPTION_SEARCH_FOR_TITLES_DISPLAYABLE%></html:option>
          </html:select>&nbsp;
          </td>
        </c:if>
        <c:if test="<%=!store.isStateRepositoryRunning()
                                    && form.getCollectionType() != CollectionType.ASSET%>"> 
           <td class="ColRowBold">Search for Titles:&nbsp;</td>
        </c:if>

        <logic:equal name="<%=OrderRequestEditForm.FORM_NAME%>" property="<%=OrderRequestEditForm.FIELD_TITLES_TO_ORDER%>" value='<%="" + OrderRequestEditForm.OPTION_SEARCH_FOR_TITLES%>'>
           <td class="ColRowBold">Find</td>
           <logic:equal name="<%=OrderRequestEditForm.FORM_NAME%>" property="<%=OrderRequestEditForm.FIELD_COLLECTION_TYPE%>" value='<%="" + CollectionType.ASSET%>'>
           <bean:define id="assets" name="<%=OrderRequestEditForm.FORM_NAME%>" property="assetTreeOptionList" />
           <td>
               <html:select property="<%=AddTitleSearchForm.FIELD_ASSET_TYPE%>" onchange="submitOnTemplateChange()">
                   <html:options collection="assets" property="longID" labelProperty="stringDesc"/>
               </html:select>
           </td>
           </logic:equal>
           
           <td class="ColRowBold"><html:text property="<%=OrderRequestEditForm.FIELD_SEARCH_STRING%>" size="21" onkeypress="trapEnterKey(event,0)" tabindex="<%=String.valueOf(tabOrder) %>" />            
            in &nbsp;
            </td>
            <% tabOrder++; %> 
            <td  class="ColRowBold">
            <html:select property="<%=OrderRequestEditForm.FIELD_SEARCH_TYPE%>" tabindex="<%=String.valueOf(tabOrder) %>">
                <html:options collection="searchTypes" property="stringCode" labelProperty="stringDesc"/>
            </html:select >&nbsp;
            </td>
            <% tabOrder++; %> 
            <td class="ColRowBold" >
              <input type="image" tabindex="<%=String.valueOf(tabOrder) %>" align="bottom" src='<%=lh.getLocalizedImagePath("/buttons/large/go.gif")%>' border="0" alt='<%=MessageHelper.formatMessage("go")%>' title='<%=MessageHelper.formatMessage("go")%>' name="<%=GoButtonTag.BUTTON_NAME%>"/>
            &nbsp;
            </td>
            <% tabOrder++; %> 
        </logic:equal>
        </tr></table>
      </td>
    </tr>
    </logic:notEqual>
  <%
      }

              if (form.isExecutedSearch()) {
  %>
    <tr>
      <td colspan="2" class="SmallColHeading">
        Searched <%=form.getSearchTypeAsString()%> for &quot;<%=JSPHelper.filterHtmlAndNulls(form.getSearchResults().getSearchTerm())%>&quot;
      </td>
    </tr>
    <tr>
      <td class="TableHeading" colspan="2">
          <IMG height="1" vspace="1" src="/icons/general/line.gif" width="100%">
      </td>
    </tr>
    <tr>
        <td colspan = "2">
            <table width = "100%" border="0" cellspacing="0" cellpadding="3" id="<%=OrderRequestEditForm.TABLE_SEARCH_RESULTS%>">
                <%
                    if (!haveResults) {
                %>
                <tr>
                    <td class="ColRow">No matches found.</td>
                </tr>
                
<!-- START view Non=Textbook Resources records only -->      
    <!-- START search result headings -->              
                <% } else {
                    if (searchResultListNonTextbookResources.size() > 0) { %>
                        <%=form.buildColumnHeadingSearchList(false) %>
                        <% LongStringLookup lsl = form.buildSearchResultRows(searchResultListNonTextbookResources, false, tabOrder); 
                           tabOrder = lsl.getLongID().intValue(); %>
                        <%=lsl.getStringDesc() %>
                    <% } %>
<!-- END view Non-Textbook Resources records only -->   
    <!-- START view Textbook or Textbook Resource records only -->   
        <!-- START search result headings -->          
                    <% if (searchResultListTextbooks.size() > 0) { %> 
                        <%=form.buildColumnHeadingSearchList(true) %>
                        <% LongStringLookup lsl = form.buildSearchResultRows(searchResultListTextbooks, true, tabOrder); 
                           tabOrder = lsl.getLongID().intValue(); %>
                        <%=lsl.getStringDesc() %>
                    <% } %>
   <!-- END view Textbook or Textbook Resource records only -->
                <% } %>           
            </table>
        </td>
    </tr>
<%
    } else if (form.getTitlesToOrder() == OrderRequestEditForm.OPTION_LIST_PROGRAMS
                && ((store.isStateContext() && form.getOrderVO().getStatus() == OrdersSpecs.STATUS_SUBMITTED) || (!store
                    .isStateContext()
                    && !store.isDistrictUser() && form.getOrderVO().getStatus() == OrdersSpecs.STATUS_UNSENT))) {
%>
        <jsp:include page="/cataloging/orderrequestedit_programlist.jsp"/>
<%
    }
%>
    <%
        if (form.getOrderVO().getTitleList().size() > 0) {
    %>
    <tr>
        <c:choose>
          <c:when test="<%=form.getCollectionType() == CollectionType.ASSET%>">
            <base:sectionHeading heading='<%=form.isAbleToAddTitles() ? "Order Details" : "Resources"%>' tdContent="colspan='2' width='100%'"/>
          </c:when>
          <c:otherwise>
            <base:sectionHeading heading='<%=form.isAbleToAddTitles() ? "Order Details" : "Titles"%>' tdContent="colspan='2' width='100%'"/>
          </c:otherwise>
        </c:choose>
    </tr>
    <tr>
        <td colspan = "2">
            <table width="100%" border="0" cellspacing="0" cellpadding="3" id="<%=OrderRequestEditForm.TABLE_SELECTED%>">
<!-- START view Non-Textbook Resource orders only -->  
    <!-- START order list headings-->                             
                <% if (orderListNonTextbookResources.size() > 0) { %>
                    <%=form.buildColumnHeading(false) %>
                    <% LongStringLookup lsl = form.buildOrderRows(orderListNonTextbookResources, false, tabOrder); 
                       tabOrder = lsl.getLongID().intValue(); %>
                    <%=lsl.getStringDesc() %>
                <% } %>
<!-- END view Non-Textbook Resource orders only -->   
    <!-- START view AssetTextbook orders only -->
        <!-- START order headings -->   
                <% if (orderListTextbooks.size() > 0) { %>
                    <%=form.buildColumnHeading(true) %>
                    <% LongStringLookup lsl = form.buildOrderRows(orderListTextbooks, true, tabOrder); 
                       tabOrder = lsl.getLongID().intValue(); %>
                    <%=lsl.getStringDesc() %>
                <% } %>
    <!-- END view AssetTextbook orders only -->            

                <%
                    boolean isOnOrder = form.getOrderVO().getStatus() == OrdersSpecs.STATUS_ON_ORDER;
                    boolean isSubmittedOrder = form.getOrderVO().getStatus() == OrdersSpecs.STATUS_SUBMITTED;
                    if (totalCounter > 0 && (isOnOrder || isSubmittedOrder)) {
                %>
                        <tr>
                            <td colspan='<%=form.isShowCurrentCopies() ? "7" : "5"%>' align="center" valign="top">
                                <base:imageSpacer height="1" width="1"/>
                            </td>
                            <td colspan="2" class="tdAlignRight" valign="top">
                                <base:imageLine width="100%"/>
                            </td>
                        </tr>  
                        <tr>
                            <td colspan='<%=form.isShowCurrentCopies() ? "8" : "6"%>' class="ColRowBold tdAlignRight" valign="top">
                                Total
                            </td>
                            <td class="ColRow tdAlignRight" valign="top">
                                <%=form.getTotalQuantityOrderedAmount()%>
                            </td>
                        </tr>                         
                    
                <% } %>

                
            </table>
            </td>
    </tr>
    <%
        }
    %>
</base:outlinedTable>
</base:form>
