<%@page import="com.follett.fsc.destiny.session.circulation.data.HoldDeclinedNoteVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ page import="com.follett.fsc.destiny.util.URLHelper" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.common.LocaleHelper" %>
<%@ page import="com.follett.fsc.destiny.client.common.JSPHelper" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.HoldSpecs"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>
<%@ page import="com.follett.fsc.destiny.session.circulation.ejb.HoldFacadeSpecs"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%
    String type = request.getParameter("type");
    HoldViewAllForm form = (HoldViewAllForm)request.getAttribute(HoldViewAllForm.FORM_NAME);
    SessionStoreProxy store = form.getStore();
    Long siteID = store.getSiteID();
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>

<tr class="SmallColHeading">
    <td><%= MessageHelper.formatMessage("holdviewall-type1_Status") %></td>
    <td><%= MessageHelper.formatMessage("holdviewall-type1_Title") %></td>
    <% if (HoldViewAllForm.LIST_TYPE_MEDIA.equals(type)) { %>
    <td align="center">Quantity</td>
    <% } %>
    <td><%= MessageHelper.formatMessage("holdviewall-type1_Patron") %></td>
    <td><%= MessageHelper.formatMessage("holdviewall-type1_Requested") %></td>
    <td><%= MessageHelper.formatMessage("holdviewall-type1_Expires") %>
    <td>&nbsp;</td>
</tr>
<logic:iterate indexId="flipper" id="row" name="<%= HoldViewAllForm.FORM_NAME %>" property="<%= type %>" type="com.follett.fsc.destiny.session.circulation.data.HoldInfoVO">
<%
    String bgColor = "";
    if (flipper.intValue() % 2 == 0) {
        bgColor = "#E8E8E8";
    }
    
    String gotoApprovalURL = "/circulation/servlet/handleholdviewallform.do";
    gotoApprovalURL = URLHelper.addHREFParam(gotoApprovalURL, HoldViewAllForm.PARAM_ACTION, HoldViewAllForm.ACTION_GOTO_APPROVAL);
    gotoApprovalURL = URLHelper.addHREFParam(gotoApprovalURL, HoldViewAllForm.PARAM_HOLD_ID, row.getHoldID());
    gotoApprovalURL = form.appendFormParameters(gotoApprovalURL);
    
    String approveLinkID = HoldViewAllForm.ID_PREFIX_APPROVE + row.getHoldID();
    
    String viewPatronURL = "/circulation/servlet/handlepatroninfoform.do";
    viewPatronURL = URLHelper.addHREFParam(viewPatronURL, "patronID", row.getPatronID());
    viewPatronURL = URLHelper.addHREFParam(viewPatronURL, "refresh", "x");
    
    String holdQueueURL = "/circulation/servlet/presentholdqueueform.do";
    holdQueueURL = URLHelper.addHREFParam(holdQueueURL, "bibID", row.getBibID());
    
    String reserveInfo = "";
    if (row.getReserveStartDate() != null) {
        if (row.getDateExpired() != null) { 
	        reserveInfo = MessageHelper.formatMessage("holdviewall-type1_Reserved_start_date_To_expired_date_Copies", 
                row.getReserveStartDate(), row.getDateExpired(), new Long(row.getQuantity()));
        } else { 
            reserveInfo = MessageHelper.formatMessage("holdviewall-type1_Reserved_start_date_Copies", 
                lh.formatDate(row.getReserveStartDate()), new Long(row.getQuantity())) ;
        }
    }
%>
<tr class="ColRow" bgColor='<%= bgColor %>'>


<%-- ---------------------- STATUS ----------------------- --%> 
<td valign="top">
    <%
        boolean renderApprovalLink = false;
        boolean renderDeclineBookingLink = false;
        boolean renderDeclineILLLink = false;
    
        if (!form.isPrinterFriendly() &&
            HoldViewAllForm.LIST_TYPE_UNAPPROVED.equals(type)) {
            renderApprovalLink = true;
            renderDeclineBookingLink = false;
        }
       
       if (!form.isPrinterFriendly() && 
            HoldViewAllForm.LIST_TYPE_MEDIA.equals(type)) {

            if (!StringHelper.isEmpty(row.getDeclineNote())) {
                renderDeclineBookingLink = true;
            }
       }
       
       if (!form.isPrinterFriendly() && 
            HoldViewAllForm.LIST_TYPE_FILL_BY_OTHER_SITE.equals(type)) {

            renderDeclineILLLink = row.isHasDeclinedILLNotes();
       }
       
       if (renderApprovalLink) {
    %>
        <base:link showTextAlways="true" href="<%= gotoApprovalURL %>" permission="<%=Permission.CIRC_AED_HOLDS%>" id="<%=approveLinkID %>">
            <%= HoldFacadeSpecs.getHoldStatusDisplayable(row.getHoldStatusID()) %>
        </base:link>
    <% 
       } else if (renderDeclineBookingLink) {
           
        String declineBookingNoteURL = DeclinedNoteForm.FORM_URL_DECLINED_BOOKING;
        declineBookingNoteURL = URLHelper.addHREFParam(declineBookingNoteURL, HoldViewAllForm.PARAM_HOLD_ID, row.getHoldID());
    
    %>
        <base:link target="<%= DeclinedNoteForm.TARGET_DECLINED%>" showTextAlways="true" href="<%= declineBookingNoteURL %>">
            <%= HoldFacadeSpecs.getHoldStatusDisplayable(row.getHoldStatusID()) %>
        </base:link>
    <%
       } else if (renderDeclineILLLink) {
           
        String declineILLNoteURL = DeclinedNoteForm.FORM_URL_DECLINED_ILL;
        declineILLNoteURL = URLHelper.addHREFParam(declineILLNoteURL, HoldViewAllForm.PARAM_HOLD_ID, row.getHoldID());
           
    %>
        <%= HoldFacadeSpecs.getHoldStatusDisplayable(row.getHoldStatusID()) %>&nbsp;
        <base:link target="<%= DeclinedNoteForm.TARGET_DECLINED%>" showTextAlways="true" href="<%= declineILLNoteURL %>">
            <base:image src="/icons/general/balloon-box-left.gif" alt='<%= MessageHelper.formatMessage("holdviewall-type1_Notes") %>'/>
        </base:link>
    <%
       } else {
    %>
            <%= HoldFacadeSpecs.getHoldStatusDisplayable(row.getHoldStatusID()) %>
    <% } %>
</td>            
            
<%-- ---------------------- TITLE ----------------------- --%>
<td valign="top">
    <logic:equal name="<%=HoldViewAllForm.FORM_NAME%>" property="printerFriendly" value="true">
        <bean:write name="row" property="title"/>
    </logic:equal>
    <logic:equal name="<%=HoldViewAllForm.FORM_NAME%>" property="printerFriendly" value="false">
        <% if (HoldViewAllForm.LIST_TYPE_MEDIA.equals(type)) {%>    
            <bean:write name="row" property="title"/>
        <%}else{%>
            <%=form.getTitleDetailLink(row.getTitle(), row.getBibID())%>
        <%}%>
    </logic:equal>
    <logic:equal name="row" property="temporary" value="true">
        <logic:equal name="<%=HoldViewAllForm.FORM_NAME%>" property="printerFriendly" value="true">[<%= MessageHelper.formatMessage("holdviewall-type1_Temporary") %>]</logic:equal>
        <logic:equal name="<%=HoldViewAllForm.FORM_NAME%>" property="printerFriendly" value="false">
            <base:image src="/icons/materialtype/temp.gif" width="19" height="16" alt='<%= MessageHelper.formatMessage("holdviewall-type1_Temporary") %>'/>
        </logic:equal>
    </logic:equal>      
    
    <%String copyInfoStr= ""; %>
    <logic:notEmpty name="row" property="copyBarcode">
    <% 
        if (!StringHelper.isEmpty(row.getCopyCallNumber())) {
            copyInfoStr = MessageHelper.formatMessage("holdviewall-type1_Copy0CallNumber1", row.getCopyBarcodeDisplayable(), row.getCopyCallNumber());
        } else {
            copyInfoStr = MessageHelper.formatMessage("holdviewall-type1_Copy0", row.getCopyBarcodeDisplayable());
        }
    %>
    <%=org.apache.struts.util.ResponseUtils.filter(copyInfoStr) %>
    </logic:notEmpty>
    
    <% if (StringHelper.isEmpty(copyInfoStr) && !StringHelper.isEmpty(row.getCopyCallNumber())) {
            copyInfoStr = " / " + MessageHelper.formatMessage("holdviewall-type1_CallNumber0", row.getCopyCallNumber()); 
       } else {
            copyInfoStr = "";
       }
    %>
    <% if (HoldViewAllForm.LIST_TYPE_FILL_BY_LOCAL_SITE.equals(type)) {
           reserveInfo = (reserveInfo.length() > 0) ? (" / " + reserveInfo) : reserveInfo; 
    %>
	<font color="#CC0000">
		<%=MessageHelper.formatMessage("holdviewall-type1_ForSpace_site_reserveInfo_copyInfoStr", row.getRequestingSiteName()+reserveInfo+copyInfoStr )%>
        </font>
    <% } else if (HoldViewAllForm.LIST_TYPE_FILL_BY_OTHER_SITE.equals(type)
                && !StringHelper.isEmpty(row.getLendingSiteName())) { %>
        <% reserveInfo = (reserveInfo.length() > 0) ? (" / " + reserveInfo) : reserveInfo; %>
        <font color="#CC0000">
            <%=MessageHelper.formatMessage("holdviewall-type1_FromSpace_site_reserveInfo_copyInfoStr", row.getLendingSiteName()+reserveInfo+copyInfoStr) %>
        </font>
    <% } else if (reserveInfo.length() > 0) { %>
        <font color="#CC0000">
        <% if (HoldViewAllForm.LIST_TYPE_MEDIA.equals(type)) {
            if ( row.getDeliveryMethod() == HoldSpecs.DELIVERY_METHOD_PATRON_PICKUP ) {
                if (!form.isPrinterFriendly()) { 
                    reserveInfo += "&nbsp;" + JSPHelper.renderImage("/icons/general/patron.gif", 13, 18, MessageHelper.formatMessage("holdviewall-type1_Pickup"));
                } else {
                    reserveInfo += "&nbsp;" + MessageHelper.formatMessage("holdviewall-type1_Pickup");      
                }
            } else if ( row.getDeliveryMethod() == HoldSpecs.DELIVERY_METHOD_SHIP_IT){
                if (!form.isPrinterFriendly()) { 
                    reserveInfo += "&nbsp;" + JSPHelper.renderImage("/icons/general/truck.gif", 17, 14, MessageHelper.formatMessage("holdviewall-type1_Ship"));
                } else {
                    reserveInfo += "&nbsp;" + MessageHelper.formatMessage("holdviewall-type1_Ship");      
                }
            }
       } %>
        
        <%= "(" + reserveInfo + (HoldViewAllForm.LIST_TYPE_MEDIA.equals(type) ? "" : copyInfoStr) + ")" %>
        </font>
    <% } %>

    <% if (HoldViewAllForm.LIST_TYPE_FILL_BY_LOCAL_SITE.equals(type) ||
           HoldViewAllForm.LIST_TYPE_UNAPPROVED.equals(type)) { %>
    <logic:equal name="<%=HoldViewAllForm.FORM_NAME%>" property="printerFriendly" value="false">
        <base:link 
            href="<%=holdQueueURL%>"
            permission="<%=Permission.CIRC_VIEW_COPY_STATUS%>">
            <base:image src="/icons/general/view.gif" width="19" height="16" alt='<%=MessageHelper.formatMessage("holdviewall_ViewHoldsForThisTitle") %>'/>
        </base:link>
    </logic:equal>
    <% } %> 
</td>
            
<%-- ---------------------- QUANTITY (fill from HoldInfoVO) ----------------------- --%>
    <% if (HoldViewAllForm.LIST_TYPE_MEDIA.equals(type)) { %>
    <td align="center" valign="top"><bean:write name="row" property="quantity"/></td>
    <% } %>
    
<%-- ---------------------- PATRON ----------------------- --%>
<td valign="top">
    <bean:write name="row" property="patronName"/>
    <logic:notEmpty name="row" property="patronName">
        <logic:equal name="<%=HoldViewAllForm.FORM_NAME%>" property="printerFriendly" value="false">
            <base:link 
                href="<%= viewPatronURL%>"
                permission="<%=Permission.CIRC_VIEW_PATRON_STATUS%>">
                <base:image src="/icons/general/view.gif" width="19" height="16" alt='<%=MessageHelper.formatMessage("holdviewall-type1_View0", row.getPatronName())%>'/>
            </base:link>
        </logic:equal>
    </logic:notEmpty>
</td>
            
<%-- ---------------------- REQUESTED ----------------------- --%>
<td valign="top">
    <base:localeDateTag timestamp="<%=row.getDateRequested()%>"/>
</td>

<%-- ---------------------- EXPIRED ----------------------- --%>
<td valign="top">
    <base:localeDateTag timestamp="<%=row.getDateExpired()%>"/>
</td>
            
<%-- ---------------------- LINKS ----------------------- --%>

<logic:equal name="<%=HoldViewAllForm.FORM_NAME%>" property="printerFriendly" value="false">
    <td valign="top" class="tdAlignRight" nowrap="nowrap">
        <base:holdViewAllButtons row="<%=row%>" type="<%=type%>"/>
    </td>
</logic:equal>            
</tr>
 
</logic:iterate>
