<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ page import="com.follett.fsc.destiny.util.URLHelper" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.common.LocaleHelper" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.HoldSpecs"%>
<%@ page import="com.follett.fsc.destiny.session.circulation.ejb.HoldFacadeSpecs"%>
<%@page import="com.follett.fsc.destiny.session.circulation.data.HoldDeclinedNoteVO"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<bean:define id="form" name="<%= HoldViewAllForm.FORM_NAME %>" type="HoldViewAllForm"/>

<%
    String type = request.getParameter("type");
    SessionStoreProxy store = form.getStore();
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>
<tr class="SmallColHeading">
    <td><%= MessageHelper.formatMessage("holdviewall-type3_Status") %></td>
    <td><%= MessageHelper.formatMessage("holdviewall-type3_Patron") %></td>
    <td><%= MessageHelper.formatMessage("holdviewall-type3_Title") %></td>
    <td><%= MessageHelper.formatMessage("holdviewall-type3_Requested") %></td>
    <td><%= MessageHelper.formatMessage("holdviewall-type3_Expires") %></td>
    <td>&nbsp;<%= MessageHelper.formatMessage("holdviewall-type3_Priority") %></td>
</tr>
<logic:iterate indexId="flipper" id="row" name="<%= HoldViewAllForm.FORM_NAME %>" property="<%= type %>" type="com.follett.fsc.destiny.session.circulation.data.HoldInfoVO">
<%
    String bgColor = "";
    if (flipper.intValue() % 2 == 0) {
        bgColor = "#E8E8E8";
    }
    
    String viewPatronURL = "/circulation/servlet/handlepatroninfoform.do";
    viewPatronURL = URLHelper.addHREFParam(viewPatronURL, "patronID", row.getPatronID());
    viewPatronURL = URLHelper.addHREFParam(viewPatronURL, "refresh", "x");
    
    String holdQueueURL = "/circulation/servlet/presentholdqueueform.do";
    holdQueueURL = URLHelper.addHREFParam(holdQueueURL, "bibID", row.getBibID());
%>
<tr class="ColRow" bgColor='<%= bgColor %>'>

<%-- ---------------------- STATUS ----------------------- --%> 
<td valign="top">
    <%= HoldFacadeSpecs.getHoldStatusDisplayable(row.getHoldStatusID()) %>
</td>
<%-- ---------------------- PATRON ----------------------- --%> 
<td valign="top">
    <bean:write name="row" property="patronName"/>
    <logic:notEmpty name="row" property="patronName">
        <logic:equal name="<%=HoldViewAllForm.FORM_NAME%>" property="printerFriendly" value="false">
            <base:link 
                href="<%= viewPatronURL%>"
                permission="<%=Permission.CIRC_VIEW_PATRON_STATUS%>">
                <base:image src="/icons/general/view.gif" width="19" height="16" alt='<%=MessageHelper.formatMessage("holdviewall-type3_View0", row.getPatronName())%>'/>
            </base:link>
        </logic:equal>
    </logic:notEmpty>
</td>            
            
<%-- ---------------------- TITLE ----------------------- --%>
<%
    boolean showCallNumber = true;
    boolean showQueueOrder = false;
    
    if (HoldViewAllForm.LIST_TYPE_PENDING.equals(type)) {
        // if this is the pending list, we show the queue order for holds
       if (row.getReserveStartDate() == null) {
           showQueueOrder = true;
       }
    }
    
    if (StringHelper.isEmpty(row.getCopyCallNumber())) {
        // never show a blank callnumber!
        showCallNumber = false;
    }
    
    String copyInfoStr = "";
    
    if ((row.getReserveStartDate() != null) &&
        (row.getCopyID() == null)) {
        // do nothing
    } else {
        String copyBarcode = row.getCopyBarcodeDisplayable();
        
        if (StringHelper.isEmpty(copyBarcode)) {
            // Copy barcode is blank, then we show ANY (call # should already be blank)
            if (row.getCopyStatus() == com.follett.fsc.destiny.entity.ejb3.CopySpecs.STATUS_IN_TRANSIT) {
                copyBarcode = MessageHelper.formatMessage("holdviewall-type3_InTransit");
            } else {
                copyBarcode = MessageHelper.formatMessage("holdviewall-type3_Any");
            }
        }
        
        String callNumber = "";
        String queueOrder = "";
        String quantity = "";
        if (showCallNumber) {
            callNumber = " / " + MessageHelper.formatMessage("holdviewall-type3_CallNumber0", row.getCopyCallNumber());
        }
        if (showQueueOrder) {
            queueOrder = " / " + MessageHelper.formatMessage("holdviewall-type3_0InQueue", row.getOrderInQueue());
        }
        if(row.getQuantity()>1){
            quantity = " / " + MessageHelper.formatMessage("holdviewall-type3_Copies0", new Long(row.getQuantity()));
            copyInfoStr = MessageHelper.formatMessage("holdviewall-type3_CopyMultiples012", callNumber, queueOrder, quantity);
        }else{
            copyInfoStr = MessageHelper.formatMessage("holdviewall-type3_Copy012", copyBarcode, callNumber, queueOrder);
        }
    }
    
    String reserveInfo = "";
    if (row.getReserveStartDate() != null) {
        if (row.getDateExpired() != null) { 
	        reserveInfo = MessageHelper.formatMessage("holdviewall-type3_Reserved0To1", row.getReserveStartDate(), row.getDateExpired());
        } else {
      	    reserveInfo = MessageHelper.formatMessage("holdviewall-type3_Reserved0", row.getReserveStartDate()) ;
        }
        
        if (row.getCopyID() == null) {
            reserveInfo += " / " + MessageHelper.formatMessage("holdviewall-type3_Copies0", new Long(row.getQuantity()));
        }
        if (StringHelper.isEmpty(copyInfoStr) && showCallNumber) {
            reserveInfo += " / " + MessageHelper.formatMessage("holdviewall-type3_CallNumber0", row.getCopyCallNumber());
        }
    }
%>
<td valign="top">
    <logic:equal name="<%=HoldViewAllForm.FORM_NAME%>" property="printerFriendly" value="true">
        <bean:write name="row" property="title"/>
    </logic:equal>
    <logic:equal name="<%=HoldViewAllForm.FORM_NAME%>" property="printerFriendly" value="false">
        <%=form.getTitleDetailLink(row.getTitle(), row.getBibID())%>
    </logic:equal>

    <logic:equal name="row" property="temporary" value="true">
        <logic:equal name="<%=HoldViewAllForm.FORM_NAME%>" property="printerFriendly" value="true">[<%= MessageHelper.formatMessage("holdviewall-type3_Temporary") %>]</logic:equal>
        <logic:equal name="<%=HoldViewAllForm.FORM_NAME%>" property="printerFriendly" value="false">
            <base:image src="/icons/materialtype/temp.gif" width="19" height="16" alt='<%= MessageHelper.formatMessage("holdviewall-type3_Temporary") %>'/>
        </logic:equal>
    </logic:equal>

    <%=ResponseUtils.filter(copyInfoStr) %>
    
    <logic:present name="row" property="reserveStartDate">
        <font color="#CC0000">
            (<%=reserveInfo%>)
        </font>
    </logic:present>
    
    <logic:equal name="<%=HoldViewAllForm.FORM_NAME%>" property="printerFriendly" value="false">
        <base:link 
            href="<%=holdQueueURL%>"
            permission="<%=Permission.CIRC_VIEW_COPY_STATUS%>"
            id="<%=HoldViewAllForm.ID_PREFIX_BIB_HOLD + row.getBibID()%>">
            <base:image src="/icons/general/view.gif" width="19" height="16" alt='<%=MessageHelper.formatMessage("holdviewall_ViewHoldsForThisTitle")  %>'/>
        </base:link>
    </logic:equal>
</td>
            
<%-- ---------------------- REQUESTED ----------------------- --%>
<td valign="top">
    <base:localeDateTag timestamp="<%=row.getDateRequested()%>"/>
</td>
            
<%-- ---------------------- EXPIRED ----------------------- --%>
<td valign="top">
    <base:localeDateTag timestamp="<%=row.getDateExpired()%>"/>
</td>
            
<%-- ---------------------- PRIORITY ----------------------- --%>

<td valign="top">
    <%=com.follett.fsc.destiny.entity.ejb3.HoldSpecs.getHoldPriorityString(row.getPriority()) %>
</td>

<%-- ---------------------- LINKS ----------------------- --%>

<logic:equal name="<%=HoldViewAllForm.FORM_NAME%>" property="printerFriendly" value="false">
    <td valign="top" class="tdAlignRight" nowrap="nowrap">
        <base:holdViewAllButtons row="<%=row%>" type="<%=type%>"/>
    </td>
</logic:equal>

</tr>
</logic:iterate>
