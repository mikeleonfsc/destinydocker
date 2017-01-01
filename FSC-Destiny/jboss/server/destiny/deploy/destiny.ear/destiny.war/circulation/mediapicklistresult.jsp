<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    MediaPickListResultForm form = (MediaPickListResultForm)request.getAttribute( MediaPickListResultForm.FORM_NAME );
%>

<base:messageBox strutsErrors="true"/>
<base:form action="/circulation/servlet/handlemediapicklistresultform.do" focus="<%=form.getFocusControl()%>">
    <html:hidden property="<%=MediaPickListResultForm.PARAM_PICK_LIST_ID%>"/>
    <logic:equal name="<%=MediaPickListResultForm.FORM_NAME%>" property="confirmShowBox" value="true" scope="request" >
        <br>
        <base:messageBox showRedBorder="true">
        <tr>
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td valign="baseline" align="center">
                <span class="Error">All of the picked items in this list will be checked out for shipment.</span><br>
                <span class="ColRowBold"><html:checkbox property="<%=MediaPickListResultForm.FIELD_INCLUDE_BOOKING_LABELS%>" />Include Booking Labels</span><br>
                <span class="ColRowBold"><html:checkbox property="<%=MediaPickListResultForm.FIELD_INCLUDE_PACKING_LIST%>" />Include Packing Lists</span><br>
                <span class="ColRow">Are you certain you want to ship these items?</span>
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td align="center" class="ColRow">
            	<base:yesNo 
                        buttonNoName="<%=MediaPickListResultForm.BUTTON_NO%>"
                />
            </td>
        </tr>
        </base:messageBox>
        <br>
    </logic:equal>
    <logic:equal name="<%=MediaPickListResultForm.FORM_NAME%>" property="confirmShowBoxPickup" value="true" scope="request" >
        <br>
        <base:messageBox showRedBorder="true">
        <tr>
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td valign="baseline" align="center">
                <span class="Error">All of the picked items in this list will be held for patron pickup.</span><br>
                <span class="ColRowBold"><html:checkbox property="<%=MediaPickListResultForm.FIELD_INCLUDE_BOOKING_LABELS%>" />
                <logic:equal name="<%=MediaPickListResultForm.FORM_NAME%>" property="toBeShipped" value="true">
                    Include Booking Labels
                </logic:equal>
                <logic:equal name="<%=MediaPickListResultForm.FORM_NAME%>" property="toBeShipped" value="false">
                    Create Booking Labels
                </logic:equal>
                </span><br>
                <span class="ColRow">Are you certain you want to hold these items?</span>
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td align="center" class="ColRow">
            	<base:yesNo 
                        buttonNoName="<%=MediaPickListResultForm.BUTTON_NO%>"
                        buttonYesName="<%=MediaPickListResultForm.BUTTON_YES_PICKUP%>"
                />
            </td>
        </tr>
        </base:messageBox>
        <br>
    </logic:equal>
    
    <logic:present name="<%=MediaPickListResultForm.FORM_NAME%>" property="<%=MediaPickListResultForm.FIELD_MESSAGE%>">
        <br>
        <base:messageBox showRedBorder="<%=!StringHelper.isEmpty(form.getExtraMessages()) %>">
        <tr>
            <td colspan="2" class="ColRowBold"><bean:write name="<%=MediaPickListResultForm.FORM_NAME%>" property="<%=MediaPickListResultForm.FIELD_MESSAGE%>"/></td>
        </tr>
        <% if (!StringHelper.isEmpty(form.getExtraMessages())) { %>
        <tr>
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td class="ColRowBold"><%= form.getExtraMessages() %></td>
        </tr>
        <% } %>
        </base:messageBox>
        <br>
    </logic:present>
    
<% if (!form.getPickList().isEmpty() || !form.getToBePickedList().isEmpty()) { %>
    <base:outlinedTable borderColor="#c0c0c0" id="mediaBookings" width="100%">
<% if (!form.getToBePickedList().isEmpty() && (!form.isPrinterFriendly() || form.isPrintableTop())) { %>
		<logic:equal name="<%=MediaPickListResultForm.FORM_NAME%>" property="printerFriendly" value="false">
			<tr><td>
				<table id="<%=MediaPickListResultForm.TABLE_SCAN_PICKED_COPIES%>"  width="100%" border="0" cellpadding="5" cellspacing="0">
					<tr>
						<td class="ColRowBold" valign="top">
							Scan picked copies&nbsp;<html:text name="<%=MediaPickListResultForm.FORM_NAME%>" property="<%=MediaPickListResultForm.FIELD_BARCODE_SCAN%>"></html:text>
							&nbsp;<base:goButton align="absbottom"/>
						</td>
						<td class="tdAlignRight">
                            <a href="<%=form.getPrinterFriendlyLinkTop()%>" target="printerfriendly" id="<%=MediaPickListResultForm.ID_PRINTER_FRIENDLY %>">
                            <base:image align="absbottom" src="/buttons/small/printerfriendly.gif" alt="<%=MediaPickListResultForm.LINK_PRINTABLE%>"/></a>						
						</td>
					</tr>
				</table>
			</td></tr>
		</logic:equal>    
		<tr><td>
            <table id="<%=MediaPickListResultForm.TABLE_TO_BE_PICKED_LIST_HEADING%>"  width="100%" border="0" cellpadding="5" cellspacing="0">
                <tr> 
                    <td valign="top" class="TableHeading2">
						To be picked...
                    </td>
                </tr>
            </table>
        </td></tr>
		
		<tr><td>    
            <table id="<%=MediaPickListResultForm.TABLE_TO_BE_PICKED_LIST_BOOKINGS%>" width="100%" border="0" cellpadding="4" cellspacing="0">
                <tr>
                    <td class="SmallColHeading" nowrap colspan="5">
                        <logic:equal name="<%=MediaPickListResultForm.FORM_NAME%>" property="printerFriendly" value="false">
            		        <img border="0" src="/images/icons/general/line.gif" width="100%" height="1" hspace="0" vspace="1">
            		    </logic:equal>
        			</td>
                </tr>
                <tr>
                    <td class="SmallColHeading" nowrap>Call #</td>
                    <td class="SmallColHeading">Title</td>
                    <td class="SmallColHeading">Quantity</td>
                    <td class="SmallColHeading">Requested By</td>
                    <td class="SmallColHeading tdAlignRight">
                        &nbsp;
        			</td>
                </tr>

                <logic:iterate id="row" name="<%=MediaPickListResultForm.FORM_NAME %>" property="toBePickedList" type="com.follett.fsc.destiny.session.circulation.data.PickListItemVO">
                    <base:flipper key="mediapicklistresult">
                        <td valign="top" class="ColRow" nowrap><bean:write name="row" property="callNumber"/></td>
                        <td valign="top" class="ColRow"><bean:write name="row" property="title"/></td>
                        <td valign="top" class="ColRow"><bean:write name="row" property="quantity"/></td>
                        <td valign="top" class="ColRow"><bean:write name="row" property="shippingTo"/></td>
                        <td valign="top" class="ColRow tdAlignRight">
            			    <logic:equal name="<%=MediaPickListResultForm.FORM_NAME%>" property="printerFriendly" value="false">
                    			<logic:equal name="row" property="canDefer" value="true">
                    			    <%= JSPHelper.renderButton(MediaPickListResultForm.BUTTON_DEFER + row.getHoldID(), "/buttons/small/defer.gif", "Defer") %><br>
    	               			    <%= JSPHelper.renderButton(MediaPickListResultForm.BUTTON_UNAVAILABLE + row.getHoldID(), "/buttons/small/unavailable.gif", "Unavailable") %>
                    			</logic:equal>
                    			<logic:equal name="row" property="canDefer" value="false">
                    			    &nbsp;
                    			</logic:equal>
                            </logic:equal>
                            <logic:equal name="<%=MediaPickListResultForm.FORM_NAME%>" property="printerFriendly" value="true">
                            	&nbsp;
                            </logic:equal>
                		</td>
                    </base:flipper>
                </logic:iterate>
            </table>
        </td></tr>
<% } %>
<% if (!form.getPickList().isEmpty() && (!form.isPrinterFriendly() || !form.isPrintableTop())) { %>
        <tr><td>
            <table id="<%=MediaPickListResultForm.TABLE_PICK_LIST_HEADING%>"  width="100%" border="0" cellpadding="5" cellspacing="0">
                <tr> 
                    <td valign="top" class="TableHeading2">
                         <bean:write name="<%=MediaPickListResultForm.FORM_NAME%>" property="header"/>
                    </td>
                    <td valign="top" class="SmallColHeading tdAlignRight">
                        &nbsp;&nbsp;&nbsp;
                        <logic:equal name="<%=MediaPickListResultForm.FORM_NAME%>" property="printerFriendly" value="false">
                            <a href="<%=form.getPrinterFriendlyLink()%>" target="printerfriendly" id="<%=MediaPickListResultForm.ID_PRINTER_FRIENDLY %>">
                                <base:image src="/buttons/small/printerfriendly.gif" alt="<%=MediaPickListResultForm.LINK_PRINTABLE%>" align="absbottom"/></a>
                            &nbsp;&nbsp;
                                <logic:equal name="<%=MediaPickListResultForm.FORM_NAME%>" property="toBeShipped" value="true">
                                <base:genericButton src="/buttons/small/bookinglabels.gif" name="<%=MediaPickListResultForm.BUTTON_BOOKING_LABELS%>" alt="Booking Labels" absbottom="true"/>
                                &nbsp;&nbsp;
                                <base:genericButton src="/buttons/small/packinglist.gif" name="<%=MediaPickListResultForm.BUTTON_PACKING_LIST%>" alt="Packing List" absbottom="true"/>
                                &nbsp;&nbsp;
                                <base:genericButton src="/buttons/small/shipall.gif" name="<%=MediaPickListResultForm.BUTTON_SHIP%>" alt="Ship All" absbottom="true"/>
                                </logic:equal>
                                <logic:equal name="<%=MediaPickListResultForm.FORM_NAME%>" property="toBeShipped" value="false">
                                <base:genericButton src="/icons/general/holdforpickup.gif" name="<%=MediaPickListResultForm.BUTTON_HOLD_FOR_PICKUP%>" alt="Hold for pickup" absbottom="true"/>
                                </logic:equal>
                        </logic:equal>
        			</td>
                </tr>
            </table>
        </td></tr>
    
        <tr><td>    
            <table id="<%=MediaPickListResultForm.TABLE_PICK_LIST_BOOKINGS%>" width="100%" border="0" cellpadding="4" cellspacing="0">
                <tr>
                    <td class="SmallColHeading" nowrap colspan="5">
                        <logic:equal name="<%=MediaPickListResultForm.FORM_NAME%>" property="printerFriendly" value="false">
            		        <img border="0" src="/images/icons/general/line.gif" width="100%" height="1" hspace="0" vspace="1">
            		    </logic:equal>
        			</td>
                </tr>
                <tr>
                    <td class="SmallColHeading" nowrap>Call #</td>
                    <td class="SmallColHeading">Title</td>
                    <td class="SmallColHeading">Barcode</td>
                    <td class="SmallColHeading">Requested By</td>
                    <td class="SmallColHeading tdAlignRight">
                        &nbsp;
        			</td>
                </tr>

                <logic:iterate id="row" name="<%=MediaPickListResultForm.FORM_NAME %>" property="pickList" type="com.follett.fsc.destiny.session.circulation.data.PickListItemVO">
                  <base:flipper key="mediapicklistresult2">
                 
                    <td valign="top" class="ColRow" nowrap><bean:write name="row" property="callNumber"/></td>
                    <td valign="top" class="ColRow"><bean:write name="row" property="title"/></td>
                    <td valign="top" class="ColRow">
            			<logic:equal name="row" property="canDefer" value="false">
            			<font color="#cc0000">
            			</logic:equal>
                            <bean:write name="row" property="barcodeDisplayable"/>
            			<logic:equal name="row" property="canDefer" value="false">
            			</font>
            			</logic:equal>
                    </td>
                    <td valign="top" class="ColRow"><bean:write name="row" property="shippingTo"/></td>
                    <td valign="top" class="ColRow tdAlignRight">
        			    &nbsp;
                        <logic:equal name="<%=MediaPickListResultForm.FORM_NAME%>" property="printerFriendly" value="false">
                			<logic:equal name="row" property="canDefer" value="true">
                			     <%= 
                			         JSPHelper.renderButton(MediaPickListResultForm.BUTTON_DEFER + row.getHoldID(), "/buttons/small/defer.gif", "Defer")
                                %>
                			</logic:equal>
                        </logic:equal>
            		</td>
                </base:flipper>
                </logic:iterate>
            </table>
        </td></tr>
        
        <tr><td>
            <table id="<%=MediaPickListResultForm.TABLE_PICK_LIST_FOOTING%>"  width="100%" border="0" cellpadding="5" cellspacing="0">
                <tr> 
                    <td valign="top" class="SmallColHeading tdAlignRight">
                        &nbsp;&nbsp;&nbsp;
                        <logic:equal name="<%=MediaPickListResultForm.FORM_NAME%>" property="printerFriendly" value="false">
                        <a href="<%=form.getPrinterFriendlyLink()%>" target="printerfriendly" id="<%=MediaPickListResultForm.ID_PRINTER_FRIENDLY %>">
                            <base:image align="absbottom" src="/buttons/small/printerfriendly.gif" alt="<%=MediaPickListResultForm.LINK_PRINTABLE%>" /></a>
                        &nbsp;&nbsp;
                          <logic:equal name="<%=MediaPickListResultForm.FORM_NAME%>" property="toBeShipped" value="true">
                                <base:genericButton src="/buttons/small/bookinglabels.gif" name="<%=MediaPickListResultForm.BUTTON_BOOKING_LABELS%>" alt="Booking Labels" absbottom="true"/>
                                &nbsp;&nbsp;
                                  <base:genericButton src="/buttons/small/packinglist.gif" name="<%=MediaPickListResultForm.BUTTON_PACKING_LIST%>" alt="Packing List" absbottom="true"/>
                                &nbsp;&nbsp;
                                <base:genericButton src="/buttons/small/shipall.gif" name="<%=MediaPickListResultForm.BUTTON_SHIP%>" alt="Ship All" absbottom="true"/>
                                </logic:equal>
                                <logic:equal name="<%=MediaPickListResultForm.FORM_NAME%>" property="toBeShipped" value="false">
                                <base:genericButton src="/icons/general/holdforpickup.gif" name="<%=MediaPickListResultForm.BUTTON_HOLD_FOR_PICKUP%>" alt="Hold for pickup" absbottom="true"/>
                                </logic:equal>
                        </logic:equal>
        			</td>
                </tr>
            </table>
        </td></tr>
<% }  // end pick list size > 0 %>

    </base:outlinedTable>   
<% }  // end BOTH lists size > 0 %>
</base:form>

<logic:present name="<%=MediaPickListResultForm.FORM_NAME%>" property="<%=MediaPickListResultForm.PROPERTY_SOUND_FILE%>" scope="request">

<jsp:include page="/circulation/setsound.jsp"/>

<script language="JavaScript">
<!--
    setSound("<bean:write name="<%=MediaPickListResultForm.FORM_NAME%>" property="<%=MediaPickListResultForm.PROPERTY_SOUND_FILE%>"/>");
//-->
</script>

</logic:present>
