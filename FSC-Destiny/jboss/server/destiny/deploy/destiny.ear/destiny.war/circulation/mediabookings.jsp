<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.*"%>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.circulation.jsptag.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.*"%>
<%@ page import="com.follett.fsc.destiny.util.*"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>

<%
    MediaBookingsForm form = (MediaBookingsForm)request.getAttribute(MediaBookingsForm.FORM_NAME);
%>

<base:form action="/circulation/servlet/handlemediabookingsform.do">

    <logic:equal name="<%=MediaBookingsForm.FORM_NAME%>" property="confirmShowBox" value="true" scope="request" >
        <br>
        <base:messageBox showRedBorder="true">
        <tr>
            <html:hidden property="<%=MediaBookingsForm.PARAM_BOOKING_ID%>"/>
            <html:hidden property="<%=MediaBookingsForm.PARAM_PICKLIST_ID%>"/>
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td valign="top" class="Error">
                    <p align="center">
                        <bean:write name="<%=MediaBookingsForm.FORM_NAME%>" property="confirmMessage" filter="false"/>
						<logic:notPresent name="<%=MediaBookingsForm.FORM_NAME%>" property="actionPickListID" scope="request" >
                        	<br/><br/>
                        	Reason <html:textarea property='<%= MediaBookingsForm.FIELD_DECLINED_NOTE %>' rows="2" cols="50"/>
                    	</logic:notPresent>
                    </p>
                    <div align="center">
                    	<base:yesNo 
                    		buttonYesName="<%=MediaBookingsForm.BUTTON_YES%>"
                        	buttonNoName="<%=MediaBookingsForm.BUTTON_NO%>"
                		/>
                    </div>
            </td>
        </tr>
        </base:messageBox>
        <br>
    </logic:equal>
    
    <logic:equal name="<%=MediaBookingsForm.FORM_NAME%>" property="confirmShowBoxBlock" value="true" scope="request" >
        <br>
        <base:messageBox showRedBorder="true">
        <tr>
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td valign="baseline" class="Error">
                <bean:write name="<%= MediaBookingsForm.FORM_NAME %>" property="blockedCopy"/> Transaction blocked:
                <html:hidden property="<%=MediaBookingsForm.PARAM_BOOKING_ID %>"/>
                <html:hidden property="blockMessages"/>
                <%= form.getBlockMessages()%>
                <p align="center">Do you want to complete this transaction?</p>
                <div align="center">
                    <base:yesNo 
                        buttonYesName="<%=MediaBookingsForm.BUTTON_OVERRIDE_YES%>"
                        buttonNoName="<%=MediaBookingsForm.BUTTON_OVERRIDE_NO%>"
                    />
                </div>
            </td>
        </tr>
        </base:messageBox>
    <br>
  </logic:equal>
<!-- END block confirmation -->

<logic:equal name="<%=MediaBookingsForm.FORM_NAME%>" property="printerFriendly" value="false">
    <logic:equal name="<%=MediaBookingsForm.FORM_NAME%>" property="<%=MediaBookingsForm.PARAM_SHOW_MSG_ATTENTION_REQUIRED%>" value="true" scope="request" >
        <base:messageBox showRedBorder="true">
            <tr>
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td valign="baseline" class="Error">
                    <bean:write name="<%= MediaBookingsForm.FORM_NAME %>" property="<%=MediaBookingsForm.PARAM_MSG_ATTENTION_REQUIRED%>"/>
                </td>
            </tr>
        </base:messageBox>
    </logic:equal>
</logic:equal>
    
<logic:present name="<%=MediaBookingsForm.FORM_NAME%>" property="holdMessageHeader">
        <base:imageSpacer width="1" height="3"/>
        <base:messageBox>
        <tr valign="top" align="center">
            <td class="ColRowBold" align="center"><bean:write name="<%=MediaBookingsForm.FORM_NAME%>" property="holdMessageHeader"/></td>
        </tr>
	<logic:present name="<%=MediaBookingsForm.FORM_NAME%>" property="holdMessage">
        <tr align="center">
            <td class="ColRow" align="center"><bean:write name="<%=MediaBookingsForm.FORM_NAME%>" property="holdMessage"/></td>
        </tr>
	</logic:present>
        </base:messageBox>
        <base:imageSpacer width="1" height="3"/>
</logic:present>

    <base:outlinedTable borderColor="#c0c0c0" id="mediaBookings" width="100%">
        <logic:equal name="<%=MediaBookingsForm.FORM_NAME%>" property="printerFriendly" value="false">
        <tr><td colspan="2" class="tdAlignRight"> 
            <table id="topHeader" cellpadding="5" cellspacing="0" border="0">
              <tr>
                <td><span class="Instruction">[ <a href="#Customize">Customize Bookings View</a> ]</span></td>
                <td>
                    <base:link page='/circulation/servlet/presentmediapicklistform.do' permission="<%=Permission.CIRC_AED_HOLDS%>">
                        <base:image align="absbottom" src="/buttons/small/createpicklist.gif" alt="<%=MediaBookingsForm.LINK_CREATE_PICK_LIST%>"/>
                    </base:link>
                </td>                    
                <td>
                    <a href="/circulation/servlet/presentmediabookingsform.do?printerFriendly=true" target="printerfriendly" id="<%=MediaBookingsForm.ID_PRINTER_FRIENDLY %>"><base:image 
                        align="absbottom" src="/buttons/small/printerfriendly.gif" alt="<%=MediaBookingsForm.LINK_PRINTABLE%>"/>
                    </a>
                </td>
              </tr>   
            </table>
        </td></tr>
        </logic:equal>
        
        <logic:equal name="<%=MediaBookingsForm.FORM_NAME%>" property="anythingToShow" value="false">
            <tr><td colspan="2"><table id="nothingToShow">
                <tr><td class="ColRowBold">
                     Based on your selections, there is nothing to display.                   
                </td></tr>
            </table></td></tr>
        </logic:equal>

        <base:mediaBookingsListOutput type="<%=MediaBookingsListOutputTag.TYPE_PICK_LISTS%>"/>
        <base:mediaBookingsListOutput type="<%=MediaBookingsListOutputTag.TYPE_PATRON_PICKUP%>"/>
        <base:mediaBookingsListOutput type="<%=MediaBookingsListOutputTag.TYPE_PROCESSING_DUE_TODAY%>"/>
        <base:mediaBookingsListOutput type="<%=MediaBookingsListOutputTag.TYPE_PROCESSING_PAST_DUE%>"/>
        <base:mediaBookingsListOutput type="<%=MediaBookingsListOutputTag.TYPE_PENDING_REQUESTS%>"/>
        <base:mediaBookingsListOutput type="<%=MediaBookingsListOutputTag.TYPE_UNAVAILABLE_ITEMS%>"/>
        <base:mediaBookingsListOutput type="<%=MediaBookingsListOutputTag.TYPE_EXPIRED_REQUESTS%>"/>
        <base:mediaBookingsListOutput type="<%=MediaBookingsListOutputTag.TYPE_DECLINED_REQUESTS%>"/>
        
        <logic:equal name="<%=MediaBookingsForm.FORM_NAME%>" property="printerFriendly" value="false">
            <logic:equal name="<%=MediaBookingsForm.FORM_NAME%>" property="anyBookingsToShow" value="true">
                <tr>
                    <td colspan="5">
                        <img src="/images/icons/general/line.gif" height="1" width="100%">
                    </td>
                </tr>
                <tr>
                    <td colspan="5">
                        <base:helpIcons buttonsToOutput='<%= MediaBookingsForm.HELP_ICONS %>' collectionType='<%= CollectionType.MEDIA %>'/>
                    </td>
                </tr>
            </logic:equal>
        </logic:equal>
        
        <base:mediaBookingsListOutput type="<%=MediaBookingsListOutputTag.TYPE_FOLLETT_EBOOK_BOOKINGS%>"/>
            
        <logic:equal name="<%=MediaBookingsForm.FORM_NAME%>" property="printerFriendly" value="false">
            <tr><td colspan="5" background="/images/icons/general/thickline.gif" height="18" nowrap="nowrap">
                &nbsp;
            </td></tr>
            
            <tr><td><base:imageSpacer width="20" height="1"/><base:link linkName="Customize" /></td>
                <td>
                <table id="<%=MediaBookingsForm.TABLE_MEDIA_BOOKING_OPTIONS%>" cellpadding="2" cellspacing="0" border="0">
                    <tr>
                        <td colspan="3" class="SmallColHeading">Customize Bookings View
                            <base:helpTag helpFileName="d_media_declined_requests.htm"/>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="3" class="SmallColRow">Use the following options to create a customized bookings list.</td>
                    </tr>
                    <tr>
                        <td colspan="3" class="ColRow">&nbsp;</td>
                    </tr>
                    <tr>
                        <td class="ColRowBold tdAlignRight">Include bookings that are: </td>
                        <td class="ColRow">
                            <html:checkbox property="<%=MediaBookingsForm.FIELD_PICKED%>"/> Picked
                            <base:helpTag helpFileName="d_media_pick_lists.htm"/>
                        </td>
                        <td class="ColRow"><base:genericButton src="/buttons/large/update.gif" name="<%=MediaBookingsForm.BUTTON_UPDATE%>" alt="Update"/></td>
                    </tr>
                    <tr>
                        <td class="ColRowBold tdAlignRight">&nbsp;</td>
                        <td class="ColRow">
                            <html:checkbox property="<%=MediaBookingsForm.FIELD_PATRON_PICKUP%>"/> Patron Pickup
                            <base:helpTag helpFileName="d_media_patron_pickup.htm"/>
                        </td>                            
                        <td class="ColRow">&nbsp;</td>
                    </tr>
                    <tr>
                        <td class="ColRowBold tdAlignRight">&nbsp;</td>
                        <td class="ColRow">
                            <html:checkbox property="<%=MediaBookingsForm.FIELD_DUETODAY%>"/> Due Today
                            <base:helpTag helpFileName="d_media_processing_due_today.htm"/>
                        </td>                            
                        <td class="ColRow">&nbsp;</td>
                    </tr>
                    <tr>
                        <td class="ColRowBold tdAlignRight">&nbsp;</td>
                        <td class="ColRow">
                            <html:checkbox property="<%=MediaBookingsForm.FIELD_PASTDUE%>"/> Past Due
                            <base:helpTag helpFileName="d_media_processing_past_due.htm"/>
                        </td>
                        <td class="ColRow">&nbsp;</td>
                    </tr>
                    <tr>
                        <td class="ColRowBold tdAlignRight">&nbsp;</td>
                        <td class="ColRow"><html:checkbox property="<%=MediaBookingsForm.FIELD_PENDING%>"/> Pending&nbsp;&nbsp;
                            <html:select property="<%=MediaBookingsForm.FIELD_PENDING_OPTION%>">
                                <html:option value='<%="" + BookingsListParamsVO.PENDING_TYPE_ALL%>'>All</html:option>
                                <html:option value='<%="" + BookingsListParamsVO.PENDING_TYPE_TOMORROW%>'>Tomorrow</html:option>
                                <html:option value='<%="" + BookingsListParamsVO.PENDING_TYPE_WITHIN_WEEK%>'>Within a Week</html:option>
                            </html:select>
                            <base:helpTag helpFileName="d_media_pending_requests.htm"/>
                        </td>
                        <td class="ColRow">&nbsp;</td>
                    </tr>
                    <tr>
                        <td class="ColRowBold tdAlignRight">&nbsp;</td>
                        <td class="ColRow">
                            <html:checkbox property="<%=MediaBookingsForm.FIELD_UNAVAILABLE%>"/> Unavailable
                            <base:helpTag helpFileName="d_media_unavailable_items.htm"/>
                        </td>
                        <td class="ColRow">&nbsp;</td>
                    </tr>
                    <tr>
                        <td class="ColRowBold tdAlignRight">&nbsp;</td>
                        <td class="ColRow">
                            <html:checkbox property="<%=MediaBookingsForm.FIELD_EXPIRED%>"/> Expired
                            <base:helpTag helpFileName="d_media_expired_requests.htm"/>
                        </td>
                        <td class="ColRow">&nbsp;</td>
                    </tr>
                    <tr>
                        <td class="ColRowBold tdAlignRight">&nbsp;</td>
                        <td class="ColRow">
                            <html:checkbox property="<%=MediaBookingsForm.FIELD_DECLINED%>"/> Declined
                            <base:helpTag helpFileName="d_media_declined_requests.htm"/>
                        </td>
                        <td class="ColRow">&nbsp;</td>
                    </tr>
                </table>
            </td></tr>
        </logic:equal>
    </base:outlinedTable>   
</base:form>

