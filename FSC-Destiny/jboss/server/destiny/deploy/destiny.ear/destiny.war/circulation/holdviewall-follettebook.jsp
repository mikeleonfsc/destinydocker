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

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<%
    String type = request.getParameter("type");
    HoldViewAllForm form = (HoldViewAllForm)request.getAttribute(HoldViewAllForm.FORM_NAME);
	SessionStoreProxy store = form.getStore();
    Long siteID = store.getSiteID();
	LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>


<tr class="SmallColHeading">
    <td>Status</td>
    <td>Title</td>
    <td align="center">Quantity</td>
    <td>Patron</td>
    <td>Requested</td>
    <td>&nbsp;</td>
</tr>
<logic:iterate indexId="flipper" id="row" name="<%= HoldViewAllForm.FORM_NAME %>" property="<%= type %>" type="com.follett.fsc.destiny.session.circulation.data.FollettEBookBookingInfoVO">
<%
	String bgColor = "";
	if (flipper.intValue() % 2 == 0) {
		bgColor = "#E8E8E8";
	}
		
	String viewPatronURL = "/circulation/servlet/handlepatroninfoform.do";
	viewPatronURL = URLHelper.addHREFParam(viewPatronURL, "patronID", row.getPatronID());
	viewPatronURL = URLHelper.addHREFParam(viewPatronURL, "refresh", "x");
	
	String bookingInfo = "Reserved ";
    bookingInfo += lh.formatDate(row.getDateFrom());
    bookingInfo += " to ";
    bookingInfo += lh.formatDate(row.getDateTo());
    bookingInfo += " / Copies: 1";
%>
<tr class="ColRow" bgColor='<%= bgColor %>'>


<%-- ---------------------- STATUS ----------------------- --%> 
<td valign="top">
    <bean:write name="row" property="bookingStatus" />
</td>            
            
<%-- ---------------------- TITLE ----------------------- --%>
<td valign="top">
    <bean:write name="row" property="title"/>
    <font color="#CC0000">
        <%= "(" + bookingInfo + ")" %>
    </font>
</td>
            
<%-- ---------------------- QUANTITY ----------------------- --%>
<td align="center" valign="top">1</td>
    
<%-- ---------------------- PATRON ----------------------- --%>
<td valign="top">
	<bean:write name="row" property="patronName"/>
	<logic:notEmpty name="row" property="patronName">
		<logic:equal name="<%=HoldViewAllForm.FORM_NAME%>" property="printerFriendly" value="false">
			<base:link 
				href="<%= viewPatronURL%>"
				permission="<%=Permission.CIRC_VIEW_PATRON_STATUS%>">
				<base:image src="/icons/general/view.gif" width="19" height="16" alt='<%="View " + row.getPatronName()%>'/>
			</base:link>
	    </logic:equal>
    </logic:notEmpty>
</td>
            
<%-- ---------------------- REQUESTED ----------------------- --%>
<td valign="top">
	<base:localeDateTag timestamp="<%=row.getDatePlaced()%>"/>
</td>
            
<%-- ---------------------- LINKS ----------------------- --%>

<logic:equal name="<%=HoldViewAllForm.FORM_NAME%>" property="printerFriendly" value="false">
	<td valign="top" class="tdAlignRight" nowrap="nowrap">
		<base:follettEBookBookingViewAllButtons row="<%=row%>"/>
	</td>
</logic:equal>            
</tr>
 
</logic:iterate>
