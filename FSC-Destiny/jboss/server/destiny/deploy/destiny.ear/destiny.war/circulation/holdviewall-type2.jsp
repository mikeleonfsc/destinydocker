<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ page import="com.follett.fsc.destiny.util.URLHelper" %>
<%@ page import="com.follett.fsc.common.LocaleHelper" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<%
    HoldViewAllForm form = (HoldViewAllForm)request.getAttribute(HoldViewAllForm.FORM_NAME);
    String type = request.getParameter("type");
    SessionStoreProxy store = form.getStore();
    Long siteID = store.getSiteID();
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>

<tr class="SmallColHeading">
    <td><%= MessageHelper.formatMessage("holdviewall-type2_CallNumber") %></td>
    <td><%= MessageHelper.formatMessage("holdviewall-type2_Title") %></td>
    <td><%= MessageHelper.formatMessage("holdviewall-type2_Patron") %></td>
    <td><%= MessageHelper.formatMessage("holdviewall-type2_Priority") %></td>
    <td>&nbsp;</td>
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
    
    String copyOrReserveInfo = "";
    if (row.getReserveStartDate() != null) {  
        if (row.getDateExpired() != null) {
	        copyOrReserveInfo = MessageHelper.formatMessage("holdviewall-type2_Reserved0To1Copies2", row.getReserveStartDate(), row.getDateExpired(), new Long(row.getQuantity()));
        } else {
  		    copyOrReserveInfo = MessageHelper.formatMessage("holdviewall-type2_Reserved0Copies1", row.getReserveStartDate(), new Long(row.getQuantity())) ;
        }
    } else {
        if(row.getQuantity()>1){
            copyOrReserveInfo = MessageHelper.formatMessage("holdviewall-type2_CopyMultiplesCopies0", new Long(row.getQuantity()));
        }else {
            copyOrReserveInfo = MessageHelper.formatMessage("holdviewall-type2_Copy0", row.getCopyBarcodeDisplayable()) ;
            //copyOrReserveInfo = MessageHelper.formatMessage("holdviewall-type2_Copy0Copies1", row.getCopyBarcodeDisplayable(), new Long(row.getQuantity()));
        }
    }
%>
<tr class="ColRow" bgColor='<%= bgColor %>'>
<%-- ---------------------- CALL # ----------------------- --%>
<td valign="top">
    <bean:write name="row" property="copyCallNumber"/>
</td>
            
<%-- ---------------------- TITLE ----------------------- --%>
<td valign="top">
    <logic:equal name="<%=HoldViewAllForm.FORM_NAME%>" property="printerFriendly" value="true">
        <bean:write name="row" property="title"/>
    </logic:equal>
    <logic:equal name="<%=HoldViewAllForm.FORM_NAME%>" property="printerFriendly" value="false">
        <%=form.getTitleDetailLink(row.getTitle(), row.getBibID())%>
    </logic:equal>

    <font color="#CC0000">
        <%=copyOrReserveInfo %>
    </font>
    
    <logic:equal name="<%=HoldViewAllForm.FORM_NAME%>" property="printerFriendly" value="false">
        <base:link 
            href="<%=holdQueueURL%>"
            permission="<%=Permission.CIRC_VIEW_COPY_STATUS%>">
            <base:image src="/icons/general/view.gif" width="19" height="16" alt='<%=MessageHelper.formatMessage("holdviewall_ViewHoldsForThisTitle")  %>'/>
        </base:link>
    </logic:equal>
</td>
            
<%-- ---------------------- PATRON ----------------------- --%>
<td valign="top">
    <bean:write name="row" property="patronName"/>
    <logic:notEmpty name="row" property="patronName">
        <logic:equal name="<%=HoldViewAllForm.FORM_NAME%>" property="printerFriendly" value="false">
            <base:link 
                href="<%= viewPatronURL%>"
                permission="<%=Permission.CIRC_VIEW_PATRON_STATUS%>">
                <base:image src="/icons/general/view.gif" width="19" height="16" alt='<%=MessageHelper.formatMessage("holdviewall-type2_View0", row.getPatronName())%>'/>
            </base:link>
        </logic:equal>
  </logic:notEmpty>  
</td>
            
<%-- ---------------------- PRIORITY ----------------------- --%>
<td valign="top">
    <%=com.follett.fsc.destiny.entity.ejb3.HoldSpecs.getHoldPriorityString(row.getPriority()) %>
</td>
            
<%-- ---------------------- LINKS ----------------------- --%>
<logic:equal name="<%=HoldViewAllForm.FORM_NAME%>" property="printerFriendly" value="false">
    <td valign="top" class="tdAlignRight">
        <base:holdViewAllButtons row="<%=row%>" type="<%=type%>"/>
    </td>
</logic:equal>

</tr>
</logic:iterate>
