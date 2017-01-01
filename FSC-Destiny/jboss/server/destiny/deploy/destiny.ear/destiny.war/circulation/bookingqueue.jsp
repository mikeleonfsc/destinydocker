<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>

<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>


<bean:define id="formBean" name="<%=BookingQueueForm.FORM_NAME%>" scope="request" type="com.follett.fsc.destiny.client.circulation.servlet.BookingQueueForm" />

<base:form action="/circulation/servlet/handlebookingqueueform.do">
    <html:hidden property="bibID"/>

    <logic:equal name="<%=BookingQueueForm.FORM_NAME%>" 
        property="showConfirmation" value="true" scope="request">
        <html:hidden property="holdID"/>
        <base:messageBox showWarningIcon="false" showRedBorder="true">
            <tr valign="top">
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
               <td class="ColRowBold">
                    <p align="center">
                        <bean:write name="<%=BookingQueueForm.FORM_NAME%>" property="declineMessage" filter="false"/>
                    	<br/><br/>
                    	Reason <html:textarea property='<%= BookingQueueForm.FIELD_DECLINED_NOTE %>' rows="2" cols="50"/>
                    </p>
               </td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2">
                    <base:yesNo
                        buttonYesName="<%=BookingQueueForm.BUTTON_DECLINE_YES%>"
                        buttonNoName="<%=BookingQueueForm.BUTTON_DECLINE_NO%>"
                    />
                </td>
            </tr>
        </base:messageBox>
    </logic:equal>
    

    <base:outlinedTable id="<%=BookingQueueForm.TABLE_BOOKINGS_BOX%>" borderColor="#c0c0c0">
        <tr valign="top">
            <td>
                <table id="<%=BookingQueueForm.TABLE_TITLE_BOX%>" width="100%">
                    <tr><!-- box header and special information -->
                        <td class="ColRowBold" valign="top">All pending bookings for...</td>
                        <td class="tdAlignRight">
        	                <base:link page="<%= formBean.getNewHoldLink() %>" permission='<%= Permission.CIRC_AED_HOLDS %>'>
        			            <base:image  src="/buttons/large/addbooking.gif" alt="<%=BookingQueueForm.LINK_ADD_BOOKING%>"/>
        			        </base:link>&nbsp;&nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td class="TableHeading" ><bean:write name="<%=BookingQueueForm.FORM_NAME%>" property="title"/></td>
                        <td class="ColRow tdAlignRight"><bean:write name="<%=BookingQueueForm.FORM_NAME%>" property="availability"/></td>
                    </tr>
                </table>
            </td>
        </tr>
        
        <base:pendingBookingsListOutput buttonName="<%=BookingQueueForm.BUTTON_DECLINE%>" bookings="<%=formBean.getBookings()%>"/>
        
        
    </base:outlinedTable>
</base:form>
