<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.OrderListVOTag"%>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%
    OrdersListForm form = (OrdersListForm)request.getAttribute(OrdersListForm.FORM_NAME);
    boolean printerFriendly = form.isPrinterFriendly();
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>

<%@page import="com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.ejb.OrderFacadeSpecs"%>


<%@page import="com.follett.fsc.destiny.entity.ejb3.OrdersSpecs"%>

<%@page import="com.follett.fsc.common.consortium.UserContext"%><c:set var="form" value="<%=form%>" />

<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handleorderslistform.do">
<html:hidden property="<%=OrdersListForm.FIELD_CONTEXT_LIMITER_CHANGED %>" value="false"/>
<html:hidden property="<%=OrdersListForm.FIELD_HIDDEN_UNSENT %>" styleId="hiddenUnsent"/>
<html:hidden property="<%=OrdersListForm.FIELD_HIDDEN_SUBMITTED %>" styleId="hiddenSubmitted"/>
<html:hidden property="<%=OrdersListForm.FIELD_HIDDEN_ON_ORDER %>" styleId="hiddenOnOrder"/>
<html:hidden property="<%=OrdersListForm.FIELD_HIDDEN_DENIED %>" styleId="hiddenDenied"/>
<html:hidden property="<%=OrdersListForm.FIELD_HIDDEN_RECEIVING %>" styleId="hiddenShipped"/>
<html:hidden property="<%=OrdersListForm.FIELD_HIDDEN_BACKORDERED %>" styleId="hiddenBackordered"/>
<html:hidden property="<%=OrdersListForm.PARAM_SORT_STATUS%>"/>
<html:hidden property="<%=OrdersListForm.PARAM_SORT_RECEIVING_TYPE%>"/>
<html:hidden property="<%=OrdersListForm.PARAM_SORT_TYPE   %>"/>
<html:hidden property="<%=OrdersListForm.PARAM_SORT_DESC%>"/>
<html:hidden property="<%= OrdersListForm.FIELD_HIDDEN_PREORDER %>" />
<html:hidden property="<%= OrdersListForm.PARAM_COLLECTION_TYPE %>" value="<%= String.valueOf(form.getCollectionType()) %>" />

<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">

<%
    if (form.isDeleteConfirmation()) {
        String type = "order";
        if(form.isCurrentPreorder()) {
            type = "pre-order";
        }
        
        String message = "Are you sure you want to delete this " + type + "?";
%>
        <html:hidden property="<%=OrdersListForm.FIELD_DELETE_ORDER_ID %>"/>
        <base:messageBox showWarningIcon="true" filterMessage="false" message="<%=message%>">
            <tr>
                <td align="center" class="ColRow" colspan="2">
                    <base:yesNo buttonYesName="<%=OrdersListForm.BUTTON_YES_DELETE %>"/>
                </td>
            </tr>
        </base:messageBox>
<%
    }
%>

<base:outlinedTableAndTabsWithinThere id="<%=OrdersListForm.TABLE_MAIN%>" selectedTab="<%=OrdersListForm.TAB_TRACK%>" tabs="<%=form.getTabs()%>" width="100%">
    <tr>
        <td>
        <table width="100%" id="<%=OrdersListForm.TABLE_PAGE_TITLE%>" >
        <tr>
            <td class="TableHeading">
            <%= (form.getCollectionType() == CollectionType.ASSET ? "Order Resources" : "Order Textbooks")  %>
            <%if(!printerFriendly) { %>
                <span class="Instruction">[ <a href="#customize">Customize View</a> ]</span></td>
            <% } else {%>
                &nbsp;
            <% } %>
            </td>
            <td class="tdAlignRight">
            <% if (form.isDisplayNewOrderButton()) { %>
                <base:genericButton src="/buttons/large/neworder.gif" absbottom="true" alt="<%= OrdersListForm.ALT_NEW_ORDER %>" name="<%= OrdersListForm.BUTTON_NEW_ORDER %>"/>
            <% } else { %>
                &nbsp;
            <% } %>
            </td>
        </tr>
    <% if (form.getPreOrderEndDate() != null) { %>
        <tr>
            <td class="ColRow" >
                <font color="#CC0000">State Textbook Pre-order period is open. You must submit your Pre-order by <%= form.getPreOrderEndDate() %>.</font>
            </td>
            <td class="tdAlignRight">
            <% if (form.isDisplayPreOrderButton()) { %>
                <base:genericButton src="/buttons/large/preorder.gif" absbottom="true" alt="<%= OrdersListForm.ALT_PRE_ORDER %>" name="<%= OrdersListForm.BUTTON_PREORDER %>"/>
            <% } else { %>
                &nbsp;
            <% } %>
            </td>
        </tr>
        <% if (!form.isAnythingToDisplay()){ %>
        <tr><td colspan="2"><base:imageLine/></td></tr>
        <% } %>
    <% } %>
    <% if (form.isDisplayReceiveButton()) { %>
        <tr>
            <td class="ColRowBold">
                Unbarcoded <%= (form.getCollectionType() == CollectionType.ASSET ? "items" : "copies")  %> must be received through shipments.
                            </td>
            <td class="tdAlignRight">
            <% if (form.getCollectionType() == CollectionType.ASSET) {%>
                <base:genericButton src="/buttons/large/receivebarcodeditems.gif" absbottom="true" alt="<%= OrdersListForm.ALT_RECEIVE %>" name="<%= OrdersListForm.BUTTON_RECEIVE %>"/>
            <% } else {%>
                <base:genericButton src="/buttons/large/receivebarcodedcopies.gif" absbottom="true" alt="<%= OrdersListForm.ALT_RECEIVE %>" name="<%= OrdersListForm.BUTTON_RECEIVE %>"/>
            <% }%>
            </td>
        </tr>
    <% } %>
    
        </table>
        </td>
    </tr>
    
    <% if (form.isAnythingToDisplay()){ %>
    <tr>
        <td colspan="2">
            <table width="100%" id="<%=OrdersListForm.TABLE_LISTS%>">
                <tr><td width="100%">
                    <base:orderListVOList tableName="<%= OrdersListForm.TABLE_UNSENT_ORDERS %>" 
                        formName="<%= OrdersListForm.FORM_NAME %>"
                        listName="Unsent"
                        listStatusType="<%= OrdersSpecs.STATUS_UNSENT %>"
                        list="<%=form.getOrdersLists().getUnsentList() %>"
                        listCollectionType="<%=form.getCollectionType() %>"
                        showDateAsc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_DATE, OrdersSpecs.STATUS_UNSENT, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"         
                        showDateDesc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_DATE, OrdersSpecs.STATUS_UNSENT, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"
                        showSiteAsc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_SITE, OrdersSpecs.STATUS_UNSENT, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"
                        showSiteDesc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_SITE, OrdersSpecs.STATUS_UNSENT, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"      
                        printable="<%=printerFriendly %>"
                        sectionSortDateURL="<%=form.gimmeSortDateURL(OrdersSpecs.STATUS_UNSENT, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"
                        sectionSortSiteURL="<%=form.gimmeSortSiteURL(OrdersSpecs.STATUS_UNSENT, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"
                        sectionSortStatusDateURL="<%=form.gimmeSortStatusDateURL(OrdersSpecs.STATUS_UNSENT, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"
                        />
              
                    <base:orderListVOList tableName="<%= OrdersListForm.TABLE_SUBMITTED_ORDERS %>" 
                        formName="<%= OrdersListForm.FORM_NAME %>"
                        listName="Submitted"
                        listStatusType="<%= OrdersSpecs.STATUS_SUBMITTED %>"
                        list="<%=form.getOrdersLists().getSubmittedList() %>"
                        listCollectionType="<%=form.getCollectionType() %>"
                        showDateAsc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_DATE, OrdersSpecs.STATUS_SUBMITTED, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"         
                        showDateDesc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_DATE, OrdersSpecs.STATUS_SUBMITTED, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"
                        showStatusDateAsc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_STATUS_DATE, OrdersSpecs.STATUS_SUBMITTED, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"
                        showStatusDateDesc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_STATUS_DATE, OrdersSpecs.STATUS_SUBMITTED, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"      
                        showSiteAsc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_SITE, OrdersSpecs.STATUS_SUBMITTED, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"
                        showSiteDesc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_SITE, OrdersSpecs.STATUS_SUBMITTED, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"      
                        printable="<%=printerFriendly %>"
                        sectionSortDateURL="<%=form.gimmeSortDateURL(OrdersSpecs.STATUS_SUBMITTED, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"
                        sectionSortSiteURL="<%=form.gimmeSortSiteURL(OrdersSpecs.STATUS_SUBMITTED, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"
                        sectionSortStatusDateURL="<%=form.gimmeSortStatusDateURL(OrdersSpecs.STATUS_SUBMITTED, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"
                        />
 
                    <base:isNotStateContext>
                    <base:orderListVOList tableName="<%= OrdersListForm.TABLE_DENIED_ORDERS %>" 
                        formName="<%= OrdersListForm.FORM_NAME %>"
                        listName="Denied"
                        listStatusType="<%= OrdersSpecs.STATUS_DENIED %>"
                        list="<%=form.getOrdersLists().getDeniedList() %>"
                        listCollectionType="<%=form.getCollectionType() %>"
                        showDateAsc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_DATE, OrdersSpecs.STATUS_DENIED, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"         
                        showDateDesc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_DATE, OrdersSpecs.STATUS_DENIED, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"
                        showStatusDateAsc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_STATUS_DATE, OrdersSpecs.STATUS_DENIED, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"
                        showStatusDateDesc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_STATUS_DATE, OrdersSpecs.STATUS_DENIED, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"      
                        showSiteAsc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_SITE, OrdersSpecs.STATUS_DENIED, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"
                        showSiteDesc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_SITE, OrdersSpecs.STATUS_DENIED, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"                        
                        printable="<%=printerFriendly %>"
                        sectionSortDateURL="<%=form.gimmeSortDateURL(OrdersSpecs.STATUS_DENIED, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"
                        sectionSortSiteURL="<%=form.gimmeSortSiteURL(OrdersSpecs.STATUS_DENIED, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"
                        sectionSortStatusDateURL="<%=form.gimmeSortStatusDateURL(OrdersSpecs.STATUS_DENIED, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"
                        />
                    </base:isNotStateContext>
             
                    <base:orderListVOList tableName="<%= OrdersListForm.TABLE_ON_ORDER_ORDERS %>" 
                        formName="<%= OrdersListForm.FORM_NAME %>"
                        listName="On Order"
                        listStatusType="<%= OrdersSpecs.STATUS_ON_ORDER %>"
                        list="<%=form.getOrdersLists().getOnOrderList() %>"
                        listCollectionType="<%=form.getCollectionType() %>"
                        showDateAsc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_DATE, OrdersSpecs.STATUS_ON_ORDER, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"         
                        showDateDesc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_DATE, OrdersSpecs.STATUS_ON_ORDER, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"
                        showStatusDateAsc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_STATUS_DATE, OrdersSpecs.STATUS_ON_ORDER, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"
                        showStatusDateDesc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_STATUS_DATE, OrdersSpecs.STATUS_ON_ORDER, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"      
                        showSiteAsc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_SITE, OrdersSpecs.STATUS_ON_ORDER, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"
                        showSiteDesc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_SITE, OrdersSpecs.STATUS_ON_ORDER, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"      
                        showOrderNumAsc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_ORDER_NUMBER, OrdersSpecs.STATUS_ON_ORDER, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"
                        showOrderNumDesc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_ORDER_NUMBER, OrdersSpecs.STATUS_ON_ORDER, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"      
                        printable="<%=printerFriendly %>"
                        sectionSortDateURL="<%=form.gimmeSortDateURL(OrdersSpecs.STATUS_ON_ORDER, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"
                        sectionSortSiteURL="<%=form.gimmeSortSiteURL(OrdersSpecs.STATUS_ON_ORDER, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"
                        sectionSortStatusDateURL="<%=form.gimmeSortStatusDateURL(OrdersSpecs.STATUS_ON_ORDER, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"
                        sectionSortOrderNumURL="<%=form.gimmeSortOrderNumURL(OrdersSpecs.STATUS_ON_ORDER, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) %>"
                        />
                        
                    <% if (form.isDisplayBackordered()){ %>    
                    <base:orderListVOList tableName="<%= OrdersListForm.TABLE_BACKORDERED_ORDERS %>" 
                        formName="<%= OrdersListForm.FORM_NAME %>"
                        listName="Backordered"
                        listStatusType="<%= OrdersSpecs.STATUS_RECEIVING %>"                        
                        list="<%=form.getOrdersLists().getBackorderedList() %>"
                        listCollectionType="<%=form.getCollectionType() %>"
                        printable="<%=printerFriendly %>"
                        showDateAsc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_DATE, OrdersSpecs.STATUS_RECEIVING, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_BACKORDERED) %>"         
                        showDateDesc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_DATE, OrdersSpecs.STATUS_RECEIVING, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_BACKORDERED) %>"
                        showStatusDateAsc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_STATUS_DATE, OrdersSpecs.STATUS_RECEIVING, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_BACKORDERED) %>"
                        showStatusDateDesc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_STATUS_DATE, OrdersSpecs.STATUS_RECEIVING, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_BACKORDERED) %>"      
                        showSiteAsc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_SITE, OrdersSpecs.STATUS_RECEIVING, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_BACKORDERED) %>"
                        showSiteDesc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_SITE, OrdersSpecs.STATUS_RECEIVING, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_BACKORDERED) %>"      
                        showOrderNumAsc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_ORDER_NUMBER, OrdersSpecs.STATUS_RECEIVING, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_BACKORDERED) %>"
                        showOrderNumDesc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_ORDER_NUMBER, OrdersSpecs.STATUS_RECEIVING, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_BACKORDERED) %>"      
                        showBackorderedHasAvailableAsc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_BACKORDERED_HAS_AVAILABLE, OrdersSpecs.STATUS_RECEIVING, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_BACKORDERED) %>"
                        showBackorderedHasAvailableDesc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_BACKORDERED_HAS_AVAILABLE, OrdersSpecs.STATUS_RECEIVING, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_BACKORDERED) %>"      
                        sectionSortDateURL="<%=form.gimmeSortDateURL(OrdersSpecs.STATUS_RECEIVING, OrderFacadeSpecs.SORT_RECEIVING_STATUS_BACKORDERED) %>"
                        sectionSortSiteURL="<%=form.gimmeSortSiteURL(OrdersSpecs.STATUS_RECEIVING, OrderFacadeSpecs.SORT_RECEIVING_STATUS_BACKORDERED) %>"
                        sectionSortStatusDateURL="<%=form.gimmeSortStatusDateURL(OrdersSpecs.STATUS_RECEIVING, OrderFacadeSpecs.SORT_RECEIVING_STATUS_BACKORDERED) %>"
                        sectionSortOrderNumURL="<%=form.gimmeSortOrderNumURL(OrdersSpecs.STATUS_RECEIVING, OrderFacadeSpecs.SORT_RECEIVING_STATUS_BACKORDERED) %>"   
                        sectionSortBackorderedHasAvailableURL="<%=form.gimmeSortBackorderedHasAvailableURL(OrdersSpecs.STATUS_RECEIVING, OrderFacadeSpecs.SORT_RECEIVING_STATUS_BACKORDERED) %>"                                              
                        />
                    <% } %>

                    <% if (form.isDisplayReceiving()){ %>                            
                    <base:orderListVOList tableName="<%= OrdersListForm.TABLE_RECEIVING_ORDERS %>" 
                        formName="<%= OrdersListForm.FORM_NAME %>"
                        listName="Shipped"
                        listStatusType="<%= OrdersSpecs.STATUS_RECEIVING %>"                        
                        list="<%=form.getOrdersLists().getReceivingList() %>"
                        listCollectionType="<%=form.getCollectionType() %>"
                        printable="<%=printerFriendly %>"
                        showDateAsc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_DATE, OrdersSpecs.STATUS_RECEIVING, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_SHIPPED) %>"         
                        showDateDesc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_DATE, OrdersSpecs.STATUS_RECEIVING, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_SHIPPED) %>"
                        showStatusDateAsc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_STATUS_DATE, OrdersSpecs.STATUS_RECEIVING, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_SHIPPED) %>"
                        showStatusDateDesc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_STATUS_DATE, OrdersSpecs.STATUS_RECEIVING, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_SHIPPED) %>"      
                        showSiteAsc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_SITE, OrdersSpecs.STATUS_RECEIVING, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_SHIPPED) %>"
                        showSiteDesc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_SITE, OrdersSpecs.STATUS_RECEIVING, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_SHIPPED) %>"      
                        showOrderNumAsc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_ORDER_NUMBER, OrdersSpecs.STATUS_RECEIVING, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_SHIPPED) %>"
                        showOrderNumDesc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_ORDER_NUMBER, OrdersSpecs.STATUS_RECEIVING, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_SHIPPED) %>"      
                        sectionSortDateURL="<%=form.gimmeSortDateURL(OrdersSpecs.STATUS_RECEIVING, OrderFacadeSpecs.SORT_RECEIVING_STATUS_SHIPPED) %>"
                        sectionSortSiteURL="<%=form.gimmeSortSiteURL(OrdersSpecs.STATUS_RECEIVING, OrderFacadeSpecs.SORT_RECEIVING_STATUS_SHIPPED) %>"
                        sectionSortStatusDateURL="<%=form.gimmeSortStatusDateURL(OrdersSpecs.STATUS_RECEIVING, OrderFacadeSpecs.SORT_RECEIVING_STATUS_SHIPPED) %>"
                        sectionSortOrderNumURL="<%=form.gimmeSortOrderNumURL(OrdersSpecs.STATUS_RECEIVING, OrderFacadeSpecs.SORT_RECEIVING_STATUS_SHIPPED) %>"                                               
                        />
                    <% } %>

               </td></tr>
            </table>
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <base:imageLine/>
        </td>
    </tr>     
    <tr align="center">
        <td colspan="2">
            <base:helpIcons buttonsToOutput="<%= form.getHelpIcons() %>"/>
        </td>
    </tr>
    <% } else { %>
        <tr>
            <td class="ColRowBold" colspan = "2" align="center">
            There are no orders to report.
            </td>
        </tr>
    <% } %>
    
     <tr>
       <td colspan="2">
         <base:imageLine/>
      </td>
    </tr>
    
    <tr>
        <td class = "ColRowBold">
            <%if(!printerFriendly) { %>
                <a name = "customize" style = "color:black">Customize View</a>&nbsp;
                <br/>
                <span class = "ColRow" style = "font-weight: normal">Use the following options to create a customized list.
                <br/>Note: Select the Archive tab to view completed orders.</span>
            <% } %>
            
        </td>
    </tr>   
    <tr>
        <td>
            <% if(printerFriendly) { %>
                <table align="center" id="<%= OrdersListForm.TABLE_CUSTOMIZE_VIEW%>">
            <% } else { %>
                <table id="<%= OrdersListForm.TABLE_CUSTOMIZE_VIEW%>">
            <% } %>
            <tr>
                    <td class = "ColRowBold" width = '25%' nowrap><a name = "selectSite"></a>
                            View Orders created</td>
                    <td class = "ColRow" >
                    <% if(!printerFriendly) { %>
                            <html:select property = "<%= OrdersListForm.FIELD_DATE_LIMITER %>">
                                <html:option value = '<%= "" + OrdersSpecs.PARAM_AFTER_DATE %>'><%= OrdersListForm.OPTION_AFTER_DATE %></html:option>
                                <html:option value = '<%= "" + OrdersSpecs.PARAM_ON_DATE %>'><%= OrdersListForm.OPTION_ON_DATE %></html:option>
                                <html:option value = '<%= "" + OrdersSpecs.PARAM_BEFORE_DATE %>'><%= OrdersListForm.OPTION_BEFORE_DATE %></html:option>
                            </html:select>&nbsp;
                            <base:date 
                                buttonName = "<%=OrdersListForm.BUTTON_CHANGE_DATE%>"
                                fieldName = "<%=ReturnsListForm.FIELD_LIMIT_DATE%>"
                                dateValue = "<%=form.getLimitDate()%>"
                                altText = "Change Limiter Date"
                            />
                            
                     <% } else { %>
                        <%=form.getCreatedAsString() %>
                     <% } %>
                  </td>
                </tr>
    
    
    <% if(!printerFriendly) { %>
        <base:isStateContext>
        <tr>
            <td class="ColRowBold" nowrap>Limit to Orders from</td>
            <td class="ColRow">
                    <base:selectDistrict 
                        includeStateTextbookOffice="false"
                        includeStatewide="false" 
                        selectedDistrictContext="<%=form.getLimitDistrict()%>"
                        mustContainTextbookSites="true"  
                        useSelectAllDistricts="true"
                        useSelectADistrict="false"
                        useUnlimitedText="true" 
                        onChangeAction="submitDropDownDistrict()"
                        printerFriendly="<%=printerFriendly %>" 
                        name="<%= OrdersListForm.FIELD_LIMIT_DISTRICT %>" /> 
            </td> 
        </tr>
        <% if((!StringHelper.isEmptyOrWhitespace(form.getLimitDistrict()) && !SelectDistrictTag.VALUE_ALL_DISTRICTS.equals(form.getLimitDistrict()))) { %>
        <tr>
            <td class="ColRowBold tdAlignRight">&nbsp;</td>
            <td class="ColRow">
                    <base:selectSite 
                       useSelectASite="false"
                       name="<%= OrdersListForm.FIELD_LIMIT_SITE %>" 
                       selectedSiteID="<%= form.getLimitSite() %>" 
                       mode="<%= form.getSessionStore().isStateContext() ? SelectSiteTag.MODE_GROUP_BY_SITE_TYPE_TEXTBOOK_ONLY : SelectSiteTag.MODE_DEFAULT %>"
                       includeLibrarySites="false"
                       includeTextbookSites="true"
                       includeDistrictWarehouse="false"
                       includeMediaSites="false"
                       contextName="<%=form.getLimitDistrict()%>"
                       includeAssetSites="false"
                       includeAllSites="true"
                       includeFromDistrict = "false"
                       printerFriendly="<%=printerFriendly %>"
                />
            </td> 
        </tr>
        <% } %>
        </base:isStateContext>
        <base:isNotStateContext>
        <% if (form.getSessionStore().isDistrictUser() || form.getSessionStore().isAtDistrictWarehouse()) { %>
        <tr>
            <td class="ColRowBold tdAlignRight">Limit to Orders from</td>
            <td class="ColRow">
                    <base:selectSite 
                       useSelectASite="false"
                       name="<%= OrdersListForm.FIELD_LIMIT_SITE %>" 
                       selectedSiteID="<%= form.getLimitSite() %>" 
                       mode="<%=SelectSiteTag.MODE_GROUP_BY_SITE_TYPE_ASSET_OR_TEXTBOOK_ONLY%>"
                       includeLibrarySites="false"
                       includeTextbookSites="<%=form.getCollectionType() == CollectionType.TEXTBOOK%>"
                       includeDistrictWarehouse="false"
                       includeMediaSites="false"
                       contextName="<%=UserContext.getMyThreadUserContext().getContextName()%>"
                       includeAssetSites="<%=form.getCollectionType() == CollectionType.ASSET%>"
                       includeAllSites="true"
                       includeFromDistrict = "false"
                       printerFriendly="<%=printerFriendly %>"
                />
            </td> 
        </tr>
        <% } %>
        </base:isNotStateContext>
        <tr>
            <td colspan = "3">
            <table width="100%">
                <tr>
                    <td class="ColRowBold">
                        <span style = "font-size:1em">Display:</span>
                    </td>
                    <td nowrap class="ColRow">
                        <html:checkbox property="<%= OrdersListForm.FIELD_DISPLAY_UNSENT %>" styleId="di1"/> <label for="di1">Unsent</label>
                    </td>
                    <td nowrap class="ColRow">
                        <html:checkbox property="<%= OrdersListForm.FIELD_DISPLAY_SUBMITTED %>" styleId="di2"/> <label for="di2">Submitted</label>
                    </td>
                    <base:isNotStateContext>
                        <td nowrap class="ColRow">
                            <html:checkbox property="<%= OrdersListForm.FIELD_DISPLAY_DENIED %>" styleId="di4"/> <label for="di4">Denied</label>
                        </td>
                    </base:isNotStateContext>
                    <base:isStateContext>
                        <td>
                            &nbsp;
                        </td>
                    </base:isStateContext>
                </tr>
                <tr>
                    <td>
                        &nbsp;
                    </td>
                    <td nowrap class="ColRow">
                        <html:checkbox property="<%= OrdersListForm.FIELD_DISPLAY_ON_ORDER %>" styleId="di3"/> <label for="di3">On Order</label>
                    </td>
                    <td nowrap class="ColRow">
                        <html:checkbox property="<%= OrdersListForm.FIELD_DISPLAY_BACKORDERED %>" styleId="di5"/> <label for="di5">Backordered</label>
                    </td>
                    <td nowrap class="ColRow">
                        <html:checkbox property="<%= OrdersListForm.FIELD_DISPLAY_RECEIVING %>" styleId="di5"/> <label for="di5">Shipped</label>
                    </td>
                 </tr>
               </table>
            </td>
        </tr>
    <% } else { %>
            <html:hidden property="<%= OrdersListForm.FIELD_DISPLAY_UNSENT %>" />
            <html:hidden property="<%= OrdersListForm.FIELD_DISPLAY_SUBMITTED %>" />
            <html:hidden property="<%= OrdersListForm.FIELD_DISPLAY_BACKORDERED %>" />
            <html:hidden property="<%= OrdersListForm.FIELD_DISPLAY_ON_ORDER %>" />
            <html:hidden property="<%= OrdersListForm.FIELD_DISPLAY_DENIED %>" />
            <html:hidden property="<%= OrdersListForm.FIELD_DISPLAY_RECEIVING %>" />
    <% } %>       
    
<% if(!printerFriendly) { %>
    <tr>
        <td colspan = "3" align = "center"><input type = "image" name = "<%= OrdersListForm.BUTTON_UPDATE_VIEW %>" src = '<%=lh.getLocalizedImagePath("/buttons/large/update.gif")%>' border = "0" alt = "Update" title = "Update"/></td>
    </tr>
<% } %>  
</base:outlinedTableAndTabsWithinThere>

<%= SectionHeadingTag.generateShowMoreLessJavascript() %>
<script language="JavaScript">
<!--
    function submitDropDownDistrict() {
        document.<%=OrdersListForm.FORM_NAME%>.<%=OrdersListForm.FIELD_CONTEXT_LIMITER_CHANGED%>.value = 'true';
        document.<%=OrdersListForm.FORM_NAME%>.action += "#selectSite";
        document.<%=OrdersListForm.FORM_NAME%>.submit();
    }
    var img = document.getElementById("imageUnsent");
    if (<%= form.isHiddenUnsent() %> && img) {
        showMoreLess(img, "Unsent");
    }
    var img = document.getElementById("imageSubmitted");
    if (<%= form.isHiddenSubmitted()%> && img  ) {
        showMoreLess(img, "Submitted");
    }
    var img = document.getElementById("imageDenied");
    if (<%= form.isHiddenDenied()%> && img  ) {
        showMoreLess(img, "Denied");
    }
    var img = document.getElementById("imageOnOrder");
    if (<%= form.isHiddenOnOrder()%> && img  ) {
        showMoreLess(img, "OnOrder");
    }
    var img = document.getElementById("imageShipped");
    if (<%= form.isHiddenReceiving()%> && img  ) {
        showMoreLess(img, "Shipped");
    }
    var img = document.getElementById("imageBackordered");
    if (<%= form.isHiddenBackordered()%> && img  ) {
        showMoreLess(img, "Backordered");
    }

    function updateURL(t, h) {            
        t.href += "&<%=OrdersListForm.FIELD_HIDDEN_UNSENT %>=" + document.<%= OrdersListForm.FORM_NAME %>.hiddenUnsent.value;
        t.href += "&<%=OrdersListForm.FIELD_HIDDEN_SUBMITTED %>=" + document.<%= OrdersListForm.FORM_NAME %>.hiddenSubmitted.value;
        t.href += "&<%=OrdersListForm.FIELD_HIDDEN_ON_ORDER %>=" + document.<%= OrdersListForm.FORM_NAME %>.hiddenOnOrder.value;
        t.href += "&<%=OrdersListForm.FIELD_HIDDEN_DENIED %>=" + document.<%= OrdersListForm.FORM_NAME %>.hiddenDenied.value;
        t.href += "&<%=OrdersListForm.FIELD_HIDDEN_RECEIVING %>=" + document.<%= OrdersListForm.FORM_NAME %>.hiddenShipped.value;
        t.href += "&<%=OrdersListForm.FIELD_HIDDEN_BACKORDERED %>=" + document.<%= OrdersListForm.FORM_NAME %>.hiddenBackordered.value;
        if (h) {
            t.href += "#" + h;
        }
    }
// -->
</script>
</base:form>
