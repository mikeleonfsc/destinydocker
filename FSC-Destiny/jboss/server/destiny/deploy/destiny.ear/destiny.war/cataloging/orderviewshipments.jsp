<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.OrdersSpecs"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    OrderViewShipmentsForm form = (OrderViewShipmentsForm)request.getAttribute(OrderViewShipmentsForm.FORM_NAME);
    SessionStoreProxy store = form.getSessionStore();
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>

<%@page import="com.follett.fsc.common.StringHelper"%>

<%@page import="org.apache.struts.util.ResponseUtils"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.data.ShipmentInfoVO"%>
<%@page import="com.follett.fsc.destiny.util.URLHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.data.OrderBibShipmentVO"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%>
<%@page import="com.follett.fsc.destiny.util.marc.BibType"%>
<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="java.util.List"%>


<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="com.follett.fsc.common.CurrencyValue"%><base:messageBox strutsErrors="true"/>
<base:form action="/cataloging/servlet/handleorderviewshipmentsform.do">
<html:hidden name="<%=OrderViewShipmentsForm.FORM_NAME%>" property="<%=OrderViewShipmentsForm.PARAM_ORDER_NOTES_VIEW_LINK_PRESSED%>" value="false"/>
<html:hidden property="<%=OrderViewShipmentsForm.PARAM_CONFIRM_MODE %>"/>
<html:hidden property="<%=OrderViewShipmentsForm.PARAM_LAST_SHOW_MORE_ID %>"/>
<html:hidden property="<%=OrderViewShipmentsForm.PARAM_COLLECTION_TYPE%>" value="<%=String.valueOf(form.getCollectionType())%>" />

<logic:equal name="<%=OrderViewShipmentsForm.FORM_NAME%>" property="<%=OrderViewShipmentsForm.PARAM_CONFIRM_MODE%>" value="<%= String.valueOf(OrderViewShipmentsForm.CONFIRM_MODE_LOST) %>">
        <base:messageBox showRedBorder="true">
        <tr>
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td valign="baseline" class="ColRowBold" align="center">
                <%=form.gimmeMarkLostCopiesMessage() %>

            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td class="ColRowBold">
                    <div align="center">
                        <base:showHideTag id="onYes">
                            <base:yesButton onclick="hideElementonYes()"/>&nbsp;<base:noButton name="<%=OrderViewShipmentsForm.BUTTON_NO%>"/>
                        </base:showHideTag>
                    </div>
            </td>
        </tr>
        </base:messageBox>
</logic:equal>
<logic:equal name="<%=OrderViewShipmentsForm.FORM_NAME%>" property="<%=OrderViewShipmentsForm.PARAM_CONFIRM_MODE%>" value="<%=String.valueOf(OrderViewShipmentsForm.CONFIRM_MODE_DELETE_ALL) %>">
        <base:messageBox showRedBorder="true">
        <tr>
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td valign="baseline" class="ColRowBold" align="center">
                <%=form.gimmeDeleteCopiesMessage() %>

            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td class="colRowBold">
                    <div align="center">
                        <base:showHideTag id="onYes">
                            <base:yesButton onclick="hideElementonYes()"/>&nbsp;<base:noButton name="<%=OrderViewShipmentsForm.BUTTON_NO%>"/>
                        </base:showHideTag>
                    </div>
            </td>
        </tr>
        </base:messageBox>
</logic:equal>
<logic:equal name="<%=OrderViewShipmentsForm.FORM_NAME%>" property="<%=OrderViewShipmentsForm.PARAM_CONFIRM_MODE%>" value="<%=String.valueOf(OrderViewShipmentsForm.CONFIRM_MODE_REVIVE_SHIPMENT) %>">
        <base:messageBox showRedBorder="true">
        <tr>
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td valign="baseline" class="ColRowBold" align="center">
                Are you sure you want to revive this shipment that was marked as incomplete?
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td class="colRowBold">
                    <div align="center">
                        <base:showHideTag id="onYes">
                            <base:yesButton onclick="hideElementonYes()"/>&nbsp;<base:noButton name="<%=OrderViewShipmentsForm.BUTTON_NO%>"/>
                        </base:showHideTag>
                    </div>
            </td>
        </tr>
        </base:messageBox>
</logic:equal>
<logic:equal name="<%=OrderViewShipmentsForm.FORM_NAME%>" property="<%=OrderViewShipmentsForm.PARAM_CONFIRM_MODE%>" value="<%=String.valueOf(OrderViewShipmentsForm.CONFIRM_MODE_INCOMPLETE) %>">
        <base:messageBox showRedBorder="true">
        <tr>
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td valign="baseline" class="ColRowBold" align="center">
                This shipment has unreceived copies.
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td valign="baseline" align="center" class="ColRow">
                All unreceived copies will be marked lost in your inventory and your
                school will be charged unless you immediately notify the
                State Textbook Office of the shortage.
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td valign="baseline" class="ColRowBold" align="center">
                Are you sure you want to mark this shipment as incomplete?
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td class="colRowBold">
                    <div align="center">
                        <base:showHideTag id="onYes">
                            <base:yesButton onclick="hideElementonYes()"/>&nbsp;<base:noButton name="<%=OrderViewShipmentsForm.BUTTON_NO%>"/>
                        </base:showHideTag>
                    </div>
            </td>
        </tr>
        
        </base:messageBox>
        <br>
</logic:equal>

<script language="JavaScript">
<!--
    function viewNotes() {
        document.<%=OrderViewShipmentsForm.FORM_NAME%>.<%=OrderViewShipmentsForm.PARAM_ORDER_NOTES_VIEW_LINK_PRESSED%>.value = "true";
        document.<%=OrderViewShipmentsForm.FORM_NAME%>.submit();
    }
      
//-->
</script>


	<table id="<%=OrderViewShipmentsForm.TABLE_MAIN%>" cellSpacing="0" cellPadding="3" width="100%" border="0">
    <tr>
        <td class="TableHeading" valign="top">
            Shipments<%=store.isDistrictUser() || store.isAtDistrictWarehouse() ? (" for " + ResponseUtils.filter((store.isStateContext()?(form.getVo().getDistrictName() + " - "):"") + form.getVo().getSiteName())) : "" %>
        </td>
        <td>
            &nbsp;
        </td>
    </tr>
    <%if(!StringHelper.isEmpty(form.getVo().getOrderVO().getOrderNumber())){ %>
        <tr>
            <td class="ColRow" valign="top">
                <b>Order #:</b>&nbsp;<%=form.getVo().getOrderVO().getOrderNumber() %>
            </td>
            <td class="tdAlignRight">
                <base:closeButton absbottom = "true"/>
            </td>
        </tr>
    <% } %>
    <%if(form.isBackordered()){ %>
        <tr>
            <td class="ColRowBold" valign="top">
                <base:image name="instructionalImage" src="/icons/general/caution.gif" alt="Attention" align="absbottom"/>
                <a href=<%="/cataloging/servlet/handleorderviewshipmentsform.do?" + OrderViewShipmentsForm.PARAM_BACKORDERED_LINK + "=true"%>>This order has backordered items.</a>
            </td>
        </tr>
    <% } %>
    <%if(!StringHelper.isEmpty(form.getAddViewNoteLinkText())){ %>
        <tr>
            <td class="ColRow" valign="top">
                <base:image src="/icons/general/notetransfer.gif"/>&nbsp;<a href="javascript:viewNotes();"><%=form.getAddViewNoteLinkText() %></a>
            </td>
            <td>
                &nbsp;
            </td>
        </tr>
        <tr><td class="Instruction" colspan="2">&nbsp;</td></tr>
    <%} %>
     <%if(!store.isStateRepositoryRunning() && store.isAtDistrictWarehouse() && 
            (form.getVo().getOrderVO().getStatus() ==  OrdersSpecs.STATUS_ON_ORDER || form.isBackordered())){ %>
       <tr>
          <td class="ColRow" valign="top">&nbsp;
           </td>       
          <td class="tdAlignRight">
            <input type="image" align="bottom" src='<%=lh.getLocalizedImagePath("/buttons/large/addshipment.gif")%>'  alt="<%= OrderViewShipmentsForm.ALT_ADD_SHIPMENT %>" title="<%= OrderViewShipmentsForm.ALT_ADD_SHIPMENT %>" name="<%= OrderViewShipmentsForm.BUTTON_ADD_SHIPMENT %>"/>
          </td>
       </tr>
    <%} %>
    
    <%if(form.getVo().getShipments().size() > 0) { %>
    <tr>
        <td background="/images/icons/general/thickline.gif" nowrap colspan="2" width="100%" valign="top">
            <span class="colRow">&nbsp;&nbsp;</span><span class="SectionHeader">&nbsp;Shipments&nbsp;</span>
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <table cellspacing="0" cellpadding="3" id="<%=OrderViewShipmentsForm.TABLE_SHIPMENTS %>" width="100%">
            <%int flipper = 0; %>
                <tr valign="top" class="SmallColHeading">
                    <td nowrap>
                        <a id="<%=OrderViewShipmentsForm.LINK_DATE_SHIPPED %>" href="/cataloging/servlet/handleorderviewshipmentsform.do?sortDesc=<%=Boolean.toString(!form.isSortDesc()) %>" >Date Shipped
                        <% if (form.isSortDesc()) { %>
                            <img src="<%=lh.getLocalizedImagePath("/icons/general/descend.gif")%> border="0"></a>
                        <% } else { %>
                            <img src="<%=lh.getLocalizedImagePath("/icons/general/ascend.gif")%> border="0"></a>
                        <% } %>
                    </td>
                    <%if(store.isStateRepositoryRunning()){ %>
                        <td>Carrier</td>
                        <td>Tracking<br/>Number</td>
                        <td>Weight</td>
                    <%} else { %>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                    <% } %> 
                    <td class="tdAlignRight">Value</td>                   
                    <td>&nbsp;</td>
                </tr>
                    <% Iterator<ShipmentInfoVO> itr = form.getVo().getShipments().iterator(); 
                        while(itr.hasNext()){
                            ShipmentInfoVO siVO = itr.next();
                            String fontStart = "";
                            String fontEnd = "";
                            boolean showCopyResolution = siVO.checkAnyShipmentsIncomplete();
                            if(store.isStateContext() && showCopyResolution && form.checkForUnresolvedShipment(siVO.getShipmentVO().getShipmentID())) {
                                fontStart = "<font color=\"#CC0000\">";
                                fontEnd = "</font>";
                            }
                    %>
                <tr <%=(flipper++%2==0)?("bgcolor=\"" + FlipperTag.ROW_GRAY)+ "\"":""%> class="ColRow">
                    <td id="<%=OrderViewShipmentsForm.TABLE_CELL_ID_PREFIX_SHIPMENT + siVO.getShipmentVO().getShipmentID() %>"><%= fontStart + lh.formatDate(siVO.getShipmentVO().getCreated()) + fontEnd %></td>
                    <%if(store.isStateRepositoryRunning()){ %>
                        <td><%= fontStart + JSPHelper.filterHtmlAndNulls(siVO.getCarrierName(),true) + fontEnd %></td>
                        <td><%= fontStart + JSPHelper.filterHtmlAndNulls(siVO.getShipmentVO().getTrackingNumber(),true) + fontEnd %></td>
                        <td><%= fontStart + JSPHelper.filterHtmlAndNulls(siVO.getShipmentVO().getWeight(),true) + fontEnd %></td>
                     <%} else { %>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                     <% } %>
                    <td class="tdAlignRight"><%= fontStart + lh.formatCurrency(new CurrencyValue(new Long(siVO.getValueAmount()), lh.getRegionFormatCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT) + fontEnd %></td>
                    <td class="ColRow tdAlignRight" width="200"> 
                        <%if(siVO.getShipmentVO().getShipmentID().equals(form.getShowMoreID())){ %>
                            <a class="DetailLink" id="<%=OrderViewShipmentsForm.LINK_SHOW_LESS%>" 
                                href="/cataloging/servlet/handleorderviewshipmentsform.do?showMoreTransferID=&showMoreBibID=&showMoreID=">
                                Show Less&nbsp;<img src='<%=lh.getLocalizedImagePath("/icons/general/showless.gif")%>' border="0">
                             </a>
                        <%} else { %>                        
                            <a class="DetailLink" id="<%=OrderViewShipmentsForm.LINK_SHOW_MORE_PREFIX + siVO.getShipmentVO().getShipmentID()%>" 
                                href="/cataloging/servlet/handleorderviewshipmentsform.do?showMoreID=<%=siVO.getShipmentVO().getShipmentID() %>#anchorShipment" >
                                Show More&nbsp;<img src='<%=lh.getLocalizedImagePath("/icons/general/showmore.gif")%>' border="0">
                            </a>
                        <%} %>
                    <% if (store.isAtDistrictWarehouse()) { %>
                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<base:genericButton name="<%=OrderViewShipmentsForm.BUTTON_PRINT_PACKING_LIST + siVO.getShipmentVO().getShipmentID() %>" src="/icons/general/runrma.gif"  alt="Print Packing List"/>
                    <% } %>
                </tr>
                <%if(siVO.getShipmentVO().getShipmentID().equals(form.getShowMoreID())){%>
                    <tr>
                        <td colspan="6" align="center">
                            <a name="anchorShipment"></a>
                            <table cellspacing="0" cellpadding="3" id="<%=OrderViewShipmentsForm.TABLE_SHOW_MORE %>" width="95%">
                                <tr class="SmallColHeading">
                                   <td colspan="3">&nbsp;</td>
                                   <td colspan="2" align="center"><nobr>-- Shipped/Received --</nobr></td>
                                   <td>&nbsp;</td>
                                </tr>
                                <tr valign="top" class="SmallColHeading">
                                   <td>
                                   <%=form.getCollectionType() == CollectionType.ASSET ? "Resource/Price" : "Title/Price" %>
                                   </td>
                                   <td align="center" >Ordered</td>
                                   <% if (store.isStateRepositoryRunning()) { %>
                                    <td align="center" >Canceled</td>
                                   <% } else { %>
                                    <td >&nbsp;</td>
                                   <% } %>
                                   <td align="center" >Barcoded</td>
                                   <td align="center" >Unbarcoded</td>
                                   <td class="tdAlignRight">Value</td>
                                </tr>
                                
                                <%Iterator<OrderBibShipmentVO> itr2 = siVO.getOrderBibShipmentList().iterator();
                                int flipper2 = 0;
                                boolean showIncompleteButton = false;
                                while(itr2.hasNext()){
                                    OrderBibShipmentVO bibVO = itr2.next();%>
                                    <tr <%=(flipper2%2==0)?("bgcolor=\"" + FlipperTag.ROW_GRAY)+ "\"":""%> class="ColRow" valign="top">
                                        <td>
                                        <% if(form.getCollectionType() == CollectionType.TEXTBOOK || bibVO.isTextbookResource()) {%>
                                            <%= BibType.getBibTypeIcon(store.isStateRepositoryRunning(), bibVO.getBibType(), null, form.getCollectionType(), null, null) %>
                                        <% } %>
                                        <a id="<%=OrderViewShipmentsForm.LINK_ID_VIEW_TITLE + bibVO.getBibID() %>" href="/cataloging/servlet/<%=form.getCollectionType() == CollectionType.ASSET ? "presentassetdescriptiondetailform.do" : "presenttextbookdetailform.do" %>?bibID=<%=bibVO.getBibID()%>">
                                            <%=JSPHelper.filterHtmlAndNulls(bibVO.getTitle())%></a>
                                            <% if (!StringHelper.isEmpty(bibVO.getStateTextbookID())) { %>
                                            <%= "(State ID: " + bibVO.getStateTextbookID() + ")" %>
                                            <% } %>
                                            <br/>
                                            <%=lh.formatCurrency(new CurrencyValue(bibVO.getReplacementPrice(), lh.getRegionFormatCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_ZERO_BECOMES_BLANK) %>
                                        </td>
                                        <td align="center" ><%=lh.formatNumber(bibVO.getQuantityOrdered()) %></td>
                                        <% if (store.isStateRepositoryRunning()) { %>
                                            <td align="center" ><%=lh.formatNumber(bibVO.getQuantityCancelled()) %></td>
                                        <% } else { %>
                                            <td >&nbsp;</td>
                                        <% } %>
                                        <td align="center" >
                                            <%=lh.formatNumber(bibVO.getQuantityShipped())%>/<%=lh.formatNumber(bibVO.getQuantityReceived())%><br/>
                                            <% if (form.showIncompleteBarcodedMessage(bibVO)) { %>
                                                <nobr><font color="#cc0000"><%=bibVO.getQuantityIncomplete() %> missing</font>
                                            <% } else if (form.showReceiveBarcodedCopies(bibVO)) { %>
                                                <% showIncompleteButton = true; %>
                                                <% if (store.isStateRepositoryRunning()){ %>
                                                    <a href='<%= "/cataloging/servlet/presenttransferreceiveunknownbarcodeform.do?transferID=" + bibVO.getTransferID() + "&collectionType=" + String.valueOf(form.getCollectionType()) + "&bibID=" + bibVO.getBibID()%>' id="<%=OrderViewShipmentsForm.TABLE_CELL_ID_PREFIX_RECEIVE_BARCODED_COPIES + bibVO.getBibID()%>">
                                                <% } else { %>
                                                    <a href='<%= "/cataloging/servlet/presenttransfertrackviewform.do?transferID=" + bibVO.getTransferID() + "&collectionType=" + String.valueOf(form.getCollectionType()) + "&transferType=0"%>' id="<%=OrderViewShipmentsForm.TABLE_CELL_ID_PREFIX_RECEIVE_BARCODED_COPIES + bibVO.getBibID()%>">
                                                 <%} %>
                                                <base:image align="absbottom" src="/buttons/small/receivesmall.gif" alt="<%=OrderViewShipmentsForm.ALT_RECEIVE%>"/>
                                                </a>
                                            <% } %>
                                        </td>
                                        <td align="center" >
                                            <%=lh.formatNumber(bibVO.getQuantityShippedNoBarcode())%>/<%=lh.formatNumber(bibVO.getQuantityReceivedNoBarcode())%><br/>
                                            <% if (form.showIncompleteUnbarcodedMessage(bibVO)) { %>
                                                <nobr><font color="#cc0000"><%=bibVO.getQuantityIncompleteNoBarcode() %> missing</font>
                                            <% } else if (form.showReceiveUnbarcodedCopies(bibVO)) { %>
                                                <% showIncompleteButton = true; %>
                                                <a href='<%= "/cataloging/servlet/presenttransferreceiveform.do?transferID=" + bibVO.getTransferID() + "&collectionType=" + String.valueOf(form.getCollectionType()) + "&bibID=" + bibVO.getBibID()%>' id="<%=OrderViewShipmentsForm.TABLE_CELL_ID_PREFIX_RECEIVE_UNBARCODED_COPIES + bibVO.getBibID()%>">
                                                <base:image align="absbottom" src="/buttons/small/receivesmall.gif" alt="<%=OrderViewShipmentsForm.ALT_RECEIVE%>"/>
                                                </a>
                                            <% } %>
                                        </td>
                                        <td class="tdAlignRight">
                                            <%=lh.formatCurrency(new CurrencyValue(new Long(bibVO.getValueAmount()), lh.getRegionFormatCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT) %>
                                        </td>
                                    </tr>
                                    <% if (bibVO.getQuantityReceivedWhichNowHaveBarcodes() != null && bibVO.getQuantityReceivedWhichNowHaveBarcodes().longValue() > 0) { %>
                                    <tr bgcolor="<%=(flipper2%2==0)?(FlipperTag.ROW_GRAY):""%>">
                                        <td class="SmallColHeading" nowrap="nowrap">
                                            Received - Barcodes (<%= bibVO.getQuantityReceivedWhichNowHaveBarcodes() %>)
                                        </td> 
                                        <td colspan="5">
                                            <table>
                                                <tr>
                                                    <%if(bibVO.getTransferID() != null && bibVO.getTransferID().equals(form.getShowMoreTransferID()) && bibVO.getBibID().equals(form.getShowMoreBibID())) { %>
                                                        <td align="center" class="SmallColHeading"><a class="DetailLink" id="<%=OrderViewShipmentsForm.LINK_SHOW_LESS_BARCODES%>" href="/cataloging/servlet/handleorderviewshipmentsform.do?showMoreTransferID=&showMoreBibID=&showMoreID=<%=form.getShowMoreID() %>">Show Less&nbsp;<img src='<%=lh.getLocalizedImagePath("/icons/general/showless.gif")%>' border="0"></a></td>
                                                    <%} else { %>                        
                                                        <td align="center" class="SmallColHeading"><a class="DetailLink" id="<%=OrderViewShipmentsForm.LINK_SHOW_MORE_BARCODES_PREFIX + bibVO.getBibID()%>" href="/cataloging/servlet/handleorderviewshipmentsform.do?showMoreID=<%=form.getShowMoreID() %>&showMoreTransferID=<%=bibVO.getTransferID()%>&showMoreBibID=<%=bibVO.getBibID()%>#anchorBarcodes">Show More&nbsp;<img src='<%=lh.getLocalizedImagePath("/icons/general/showmore.gif")%>' border="0"></a></td>
                                                    <%} %>
                                                </tr>
                                            </table>
                                        </td>
                                    </tr>
                                    <% } %>
                                    <% if(bibVO.getTransferID() != null && bibVO.getTransferID().equals(form.getShowMoreTransferID()) && bibVO.getBibID().equals(form.getShowMoreBibID())) { %>
                                        <% flipper2++; %>
                                        <tr bgcolor="">
                                            <td><a name="anchorBarcodes"></a>
                                                <table id="<%=OrderViewShipmentsForm.TABLE_BARCODES %>" width="100%" cellspacing="0" cellpadding="0">
                                                    <tr bgcolor="<%=(flipper2%2==0)?(FlipperTag.ROW_GRAY):""%>">
                                                        <td class="SmallColHeading">Barcodes</td>
                                                    </tr>
                                                <% List<String> receivedBarcodes = form.getReceivedBarcodedItems(bibVO.getTransferID(), bibVO.getBibID()); %>
                                                <% for (Iterator iter = receivedBarcodes.iterator(); iter.hasNext();) { %>
                                                    <% flipper2++; %>
                                                    <tr bgcolor="<%=(flipper2%2==0)?(FlipperTag.ROW_GRAY):"#FFFFFF"%>">
                                                        <td class="ColRow">
                                                            <%=ResponseUtils.filter((String)iter.next()) %>
                                                        </td>
                                                    </tr>
                                                <% } %>
                                                </table>
                                            </td>
                                            <td colspan="5">&nbsp;</td>
                                        </tr>
                                    <% } %>
                                    <% flipper2++; %>
                                <% } %>
                                <% if(showIncompleteButton) { %>
                                    <% if(store.isStateRepositoryRunning()) { %>
                                    <tr>
                                        <td colspan="5">
                                            <span class="TableHeading2">Missing copies from this shipment?</span><br/>
                                            <span class="ColRow">Click Incomplete to close this shipment and record the discrepancy.
                                            <%=form.getIncompleteMessage() %>
                                        </td>
                                        <td>
                                            <base:genericButton src = "/buttons/large/incomplete.gif" name = "<%= OrderViewShipmentsForm.BUTTON_INCOMPLETE %>" alt = "Incomplete Shipment"/>
                                        </td>
                                    </tr>
                                    <% } %>
                                <% } else if (showCopyResolution || form.checkDisplayCopiesDeletedOrLost()) { %>
                                    <% if(!StringHelper.isEmpty(form.gimmeTransferResolutionMessage())) { %>
                                        <tr>
                                            <td colspan="6" class="TableHeading2">
                                                <font color="#cc0000"><%=form.gimmeTransferResolutionMessage()%></font>
                                            </td>
                                        </tr>
                                    <% } else if (store.isStateContext()) { %>
                                        <tr>
                                            <td colspan="6" class="TableHeading2">
                                                Resolve Missing Copies: 
                                                <base:genericButton name="<%=OrderViewShipmentsForm.BUTTON_DELETE_ALL %>" src="/buttons/large/deleteall.gif"  alt="Delete All Missing Copies" absbottom="true"/>                                        
                                                <% if (!form.isAllConsumables() ) { %>
                                                    <base:genericButton name="<%=OrderViewShipmentsForm.BUTTON_MARK_LOST %>" src="/buttons/large/marklost.gif"  alt="Mark Missing Copies Lost" absbottom="true"/>
                                                <% } %>
                                                <base:genericButton name="<%=OrderViewShipmentsForm.BUTTON_REVIVE_SHIPMENT %>" src="/buttons/large/revive.gif"  alt="Revive Shipment" absbottom="true"/>
                                            </td>
                                        </tr>
                                    <% } %>
                                <% } %>
                            </table>
                        </td>
                    </tr>
                    <% flipper = flipper2; %>
                    <%} %>
                <%} %>
                <tr>
                    <td colspan="6">
                        <IMG height="1" vspace="1" src="/images/icons/general/line.gif" width="100%">
                    </td>
                </tr>
                <tr>
                    <td colspan="4" class="ColRowBold tdAlignRight">Order Total</td>
                    <td class="ColRow tdAlignRight" width="10%">
                        <%=lh.formatCurrency(new CurrencyValue(new Long(form.getVo().getValueAmount()), lh.getRegionFormatCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT) %>
                    </td>
                    <td>&nbsp;</td>
                </tr>                                
            </table>
        </td>
    </tr>
     <%} else {%>
     <tr>
        <td align="center" class="ColRowBold">
            There are no shipments to report.
        </td>
    </tr>
    <% } %>
    
	</table>                          
</base:form>

