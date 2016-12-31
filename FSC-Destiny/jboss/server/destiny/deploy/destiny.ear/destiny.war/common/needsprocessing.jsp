<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.util.CollectionType"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>

<%
    NeedsProcessingForm form = (NeedsProcessingForm)request.getAttribute(NeedsProcessingForm.FORM_NAME);
%>

<base:form action="/common/servlet/handleneedsprocessingform.do">

<br>
<br>
<base:outlinedTable id="<%=NeedsProcessingForm.TABLE_MAIN %>" cellspacing="0" cellpadding="4" width="95%" borderColor="#C0C0C0">
    <tr>
        <td colspan="2" class="TableHeading"><%= MessageHelper.formatMessage("needsprocessing_ProcessingNeeded") %></td>
    </tr>
    <tr>
        <td colspan="2">
            <base:imageLine/>
        </td>
    </tr>
    <% if (form.getHoldCount() > 0) { %> 
        <base:flipper key="flipper">
            <td class="ColRow">
                <%= MessageHelper.formatMessage("needsprocessing_HoldRequestsToProcess") %> <%=form.getHoldCount() %>
            </td>
            <td class="tdAlignRight">
                <base:link href="/circulation/servlet/presentholdviewallform.do?l2m=Holds%2FILL&holdSideLink=true&tm=Circulation" id="<%=NeedsProcessingForm.ID_VIEW_HOLD_ILL_REQUESTS %>">
                    <base:image src="/buttons/small/viewsmall.gif" alt='<%= MessageHelper.formatMessage("view") %>'/>
                </base:link>
            </td>
        </base:flipper> 
     <%} %>
     <%
         if (form.getRecommendationAndCommentCount() > 0) {
     %> 
        <base:flipper key="flipper">
            <td class="ColRow">
                <%=MessageHelper.formatMessage("needsprocessing_RecommendationsAndCommentsNeedingApproval", Long.valueOf(form.getRecommendationAndCommentCount()))%>
            </td>
            <td class="tdAlignRight">
                <base:link href="/cataloging/servlet/presentrecommendationapprovalform.do" id="<%=NeedsProcessingForm.ID_VIEW_RECOMMENDATIONS_AND_COMMENTS_TO_BE_PROCESSED %>">
                    <base:image src="/buttons/small/viewsmall.gif" alt='<%= MessageHelper.formatMessage("view") %>'/>
                </base:link>
            </td>    
        </base:flipper>
      <%} %>  
     <% if (form.getReviewCount() > 0) { %> 
        <base:flipper key="flipper">
            <td class="ColRow">
                <%= MessageHelper.formatMessage("needsprocessing_ReviewsNeedingApproval", Long.valueOf(form.getReviewCount())) %>
            </td>
            <td class="tdAlignRight">
                <base:link href="/cataloging/servlet/presentbibreviewapprovalform.do" id="<%=NeedsProcessingForm.ID_VIEW_REVIEWS_TO_BE_PROCESSED %>">
                    <base:image src="/buttons/small/viewsmall.gif" alt='<%= MessageHelper.formatMessage("view") %>'/>
                </base:link>
            </td>    
        </base:flipper>
      <%} %>  
     <% if (form.getWishListCount() > 0) { %> 
        <base:flipper key="flipper">
            <td class="ColRow">
                <%= MessageHelper.formatMessage("needsprocessing_NewWishList", Long.valueOf(form.getWishListCount())) %>
            </td>
            <td class="tdAlignRight">
                <base:link href="/cataloging/servlet/presentbibwishlistapprovalform.do" id="<%=NeedsProcessingForm.ID_VIEW_WISHES_TO_BE_PROCESSED %>">
                    <base:image src="/buttons/small/viewsmall.gif" alt='<%= MessageHelper.formatMessage("view") %>'/>
                </base:link>
            </td>    
        </base:flipper>
      <%} %>  
     <% if (form.getReportedAbusesCount() > 0) { %> 
        <base:flipper key="flipper">
            <td class="ColRow">
                <%= MessageHelper.formatMessage("needsprocessing_ReportedAbuses0", Long.valueOf(form.getReportedAbusesCount())) %>
            </td>
            <td class="tdAlignRight">
                <base:link href="/backoffice/servlet/presentreportabusesform.do" id="<%=NeedsProcessingForm.ID_VIEW_REPORTED_ABUSES_TO_BE_PROCESSED %>">
                    <base:image src="/buttons/small/viewsmall.gif" alt='<%= MessageHelper.formatMessage("view") %>'/>
                </base:link>
            </td>    
        </base:flipper>
      <%} %>  
     <% if (form.getTransferAssetCount() != null && form.getTransferAssetCount().getLongID().longValue() != 0) { %> 
        <base:flipper key="flipper">
            <td class="ColRow">
                <%= MessageHelper.formatMessage("needsprocessing_TransfersIncomingAssets", form.getTransferItemCount(CollectionType.ASSET)) %>
                (<%=form.getTransferCount(CollectionType.ASSET) %>)
            </td>
            <td class="tdAlignRight">
                <base:link href="/cataloging/servlet/presenttransfertrackform.do?l2m=Transfer%20Assets&collectionType=4&clear=false&tm=Catalog" id="<%=NeedsProcessingForm.ID_VIEW_ASSET_TRANSFERS_TO_BE_PROCESSED %>">
                    <base:image src="/buttons/small/viewsmall.gif" alt='<%= MessageHelper.formatMessage("view") %>'/>
                </base:link>
            </td>    
        </base:flipper>
      <%} %>  
     <% if (form.getTransferTextbookCount() != null && form.getTransferTextbookCount().getLongID().longValue() != 0) { %> 
        <base:flipper key="flipper">
            <td class="ColRow">
                <%= MessageHelper.formatMessage("needsprocessing_TransfersIncomingTextbooks", form.getTransferItemCount(CollectionType.TEXTBOOK)) %>
                (<%=form.getTransferCount(CollectionType.TEXTBOOK) %>)
            </td>
            <td class="tdAlignRight">
                <base:link href="/cataloging/servlet/presenttransfertrackform.do?l2m=Transfer%20Textbooks&collectionType=1&clear=false&tm=Catalog" id="<%=NeedsProcessingForm.ID_VIEW_TEXTBOOK_TRANSFERS_TO_BE_PROCESSED %>">
                    <base:image src="/buttons/small/viewsmall.gif" alt='<%= MessageHelper.formatMessage("view") %>'/>
                </base:link>
            </td>    
        </base:flipper>
      <%} %>  
     <% if (form.getTransferRequestsCount() != null 
         && (form.getTransferRequestsCount().getLongID().longValue() != 0 || form.getTransferRequestsCount().getLongVal().longValue() != 0)) { %> 
        <base:flipper key="flipper">
            <td class="ColRow">
                <%= MessageHelper.formatMessage("needsprocessing_TextbookTransferRequestsOpenRequests") %> <%= "" + form.getTransferRequestsCount().getLongID() %>
                <base:isDistrictUser>
                    ;&nbsp;<%= MessageHelper.formatMessage("needsprocessing_PendingRequests") %> <%= "" + form.getTransferRequestsCount().getLongVal() %>
                </base:isDistrictUser>
            </td>
            <td class="tdAlignRight">
                <base:link href="/cataloging/servlet/presenttransferrequestform.do?l2m=Transfer%20Textbooks&collectionType=1&clear=false&tm=Catalog" id="<%=NeedsProcessingForm.ID_VIEW_TRANSFER_REQUESTS_TO_BE_PROCESSED %>">
                    <base:image src="/buttons/small/viewsmall.gif" alt='<%= MessageHelper.formatMessage("view") %>'/>
                </base:link>
            </td>    
        </base:flipper>
     <%} %>
     <% if (form.getTransferResourcesRequestsCount() != null 
         && (form.getTransferResourcesRequestsCount().getLongID().longValue() != 0 || form.getTransferResourcesRequestsCount().getLongVal().longValue() != 0)) { %> 
        <base:flipper key="flipper">
            <td class="ColRow">
                <%= MessageHelper.formatMessage("needsprocessing_ResourceTransferRequestsOpenRequests") %> <%= "" + form.getTransferResourcesRequestsCount().getLongID() %>
                <base:isDistrictUser>
                    ;&nbsp;<%= MessageHelper.formatMessage("needsprocessing_PendingRequests") %> <%= "" + form.getTransferResourcesRequestsCount().getLongVal() %>
                </base:isDistrictUser>
            </td>
            <td class="tdAlignRight">
                <base:link href="/cataloging/servlet/presenttransferresourcesrequestform.do?l2m=Transfer%20Resources&collectionType=4&clear=false&tm=Catalog" id="<%=NeedsProcessingForm.ID_VIEW_TRANSFER_RESOURCES_REQUESTS_TO_BE_PROCESSED %>">
                    <base:image src="/buttons/small/viewsmall.gif" alt='<%= MessageHelper.formatMessage("view") %>'/>
                </base:link>
            </td>    
        </base:flipper>
     <%} %>
    <% if (form.getReturnsCount() > 0) { %> 
        <base:flipper key="flipper">
            <td class="ColRow">
                <%= MessageHelper.formatMessage("needsprocessing_ReturnsToProcess") %> <%=form.getReturnsCount() %>
            </td>
            <td class="tdAlignRight">
                <base:link href="/cataloging/servlet/presentreturnslistform.do?l2m=Transfer%20Textbooks&collectionType=1&clear=false&tm=Catalog" id="<%=NeedsProcessingForm.ID_VIEW_RETURNS %>">
                    <base:image src="/buttons/small/viewsmall.gif" alt='<%= MessageHelper.formatMessage("view") %>'/>
                </base:link>
            </td>
        </base:flipper> 
      <%} %>  
    <% if (form.getOrdersCountForAsset() > 0) { %> 
        <base:flipper key="flipper">
            <td class="ColRow">
                Resource Orders to process: <%=form.getOrdersCountForAsset() %>
            </td>
            <td class="tdAlignRight">
                <base:link id="<%=NeedsProcessingForm.ID_VIEW_RESOURCE_ORDERS %>" href="/cataloging/servlet/presentorderslistform.do?l2m=Resource%20Orders&collectionType=4&clear=false&tm=Catalog">
                    <base:image src="/buttons/small/viewsmall.gif" alt="View Orders"/>
                </base:link>
            </td>
        </base:flipper> 
      <%} %>  
    <% if (form.getBackOrdersCountForAsset() > 0) { %> 
        <base:flipper key="flipper">
            <td class="ColRow">
                Resource Backorders to process: <%=form.getBackOrdersCountForAsset() %>
            </td>
            <td class="tdAlignRight">
                <base:link id="<%=NeedsProcessingForm.ID_VIEW_RESOURCE_BACKORDERS %>" href="/cataloging/servlet/presentorderslistform.do?l2m=Resource%20Orders&collectionType=4&clear=false&tm=Catalog">
                    <base:image src="/buttons/small/viewsmall.gif" alt="View Backorders"/>
                </base:link>
            </td>
        </base:flipper> 
      <%} %>  
    <% if (form.getOrdersCountForTextbook() > 0) { %> 
        <base:flipper key="flipper">
            <td class="ColRow">
                Textbook Orders to process: <%=form.getOrdersCountForTextbook() %>
            </td>
            <td class="tdAlignRight">
                <base:link id="<%=NeedsProcessingForm.ID_VIEW_TEXTBOOK_ORDERS %>" href="/cataloging/servlet/presentorderslistform.do?l2m=Order%20Textbooks&collectionType=1&clear=false&tm=Catalog">
                    <base:image src="/buttons/small/viewsmall.gif" alt="View Orders"/>
                </base:link>
            </td>
        </base:flipper> 
      <%} %>  
    <% if (form.getBackOrdersCountForTextbook() > 0) { %> 
        <base:flipper key="flipper">
            <td class="ColRow">
                Textbook Backorders to process: <%=form.getBackOrdersCountForTextbook() %>
            </td>
            <td class="tdAlignRight">
                <base:link id="<%=NeedsProcessingForm.ID_VIEW_TEXTBOOK_BACKORDERS %>" href="/cataloging/servlet/presentorderslistform.do?l2m=Order%20Textbooks&collectionType=1&clear=false&tm=Catalog">
                    <base:image src="/buttons/small/viewsmall.gif" alt="View Backorders"/>
                </base:link>
            </td>
        </base:flipper> 
      <%} %>  
    <% if (form.getOrderShipmentsCount(CollectionType.TEXTBOOK) > 0) { %> 
        <base:flipper key="flipper">
            <td class="ColRow">
                Textbook Order Shipments to process: <%=form.getOrderShipmentsCount(CollectionType.TEXTBOOK) %>
            </td>
            <td class="tdAlignRight">
                <base:link id="<%=NeedsProcessingForm.ID_VIEW_TEXTBOOK_SHIPMENT_ORDERS %>" href="/cataloging/servlet/presentorderslistform.do?l2m=Order%20Textbooks&collectionType=1&clear=false&tm=Catalog">
                    <base:image src="/buttons/small/viewsmall.gif" alt="View Orders"/>
                </base:link>
            </td>
        </base:flipper> 
      <%} %>
    <% if (form.getOrderShipmentsCount(CollectionType.ASSET) > 0) { %> 
        <base:flipper key="flipper">
            <td class="ColRow">
                Resource Order Shipments to process: <%=form.getOrderShipmentsCount(CollectionType.ASSET) %>
            </td>
            <td class="tdAlignRight">
                <base:link id="<%=NeedsProcessingForm.ID_VIEW_RESOURCE_SHIPMENT_ORDERS %>" href="/cataloging/servlet/presentorderslistform.do?l2m=Resource%20Orders&collectionType=4&clear=false&tm=Catalog">
                    <base:image src="/buttons/small/viewsmall.gif" alt="View Orders"/>
                </base:link>
            </td>
        </base:flipper> 
      <%} %>      <% if (form.getTransferDiscrepanciesCount() > 0) { %> 
        <base:flipper key="flipper">
            <td class="ColRow">
                <%= MessageHelper.formatMessage("needsprocessing_TransferDiscrepanciesToProcess") %> <%=form.getTransferDiscrepanciesCount() %>
            </td>
            <td class="tdAlignRight">
                <base:link href="/cataloging/servlet/presenttransfertrackform.do?l2m=Transfer%20Textbooks&amp;collectionType=1&amp;clear=false" id="<%=NeedsProcessingForm.ID_VIEW_DISCREPANCIES %>">
                    <base:image src="/buttons/small/viewsmall.gif" alt='<%= MessageHelper.formatMessage("view") %>'/>
                </base:link>
            </td>
        </base:flipper> 
      <%} %>  
    <% if (form.getOrderDiscrepanciesCount() > 0) { %> 
        <base:flipper key="flipper">
            <td class="ColRow">
                Order Discrepancies to process: <%=form.getOrderDiscrepanciesCount() %>
            </td>
            <td class="tdAlignRight">
                <base:link href="/cataloging/servlet/presentorderslistform.do?l2m=Order%20Textbooks&collectionType=1&clear=false&tm=Catalog">
                    <base:image src="/buttons/small/viewsmall.gif" alt="View Discrepancies"/>
                </base:link>
            </td>
        </base:flipper> 
      <%} %>  
    <% if (form.getAssetDisposalCount() != null && (form.getAssetDisposalCount().getLongID().longValue() != 0)) { %>
        <base:flipper key="flipper">
            <td class="ColRow">
                <%= MessageHelper.formatMessage("needsprocessing_AssetsNeedingApprovalForDisposal") %> <%= "" + form.getAssetDisposalCount().getLongID() %>
            </td>
            <td class="tdAlignRight">
                <base:link href="/cataloging/servlet/presentassetapprovefordisposalform.do" id="<%=NeedsProcessingForm.ID_VIEW_ASSETS_NEEDING_APPROVAL_FOR_DISPOSAL %>">
                    <base:image src="/buttons/small/viewsmall.gif" alt='<%= MessageHelper.formatMessage("view") %>'/>
                </base:link>
            </td>
        </base:flipper> 
      <%} %>  
</base:outlinedTable>

</base:form>

