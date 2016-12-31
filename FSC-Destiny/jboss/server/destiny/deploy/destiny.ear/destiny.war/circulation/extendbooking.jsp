<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>

<c:set var="cForm" value="<%=request.getAttribute(ExtendBookingForm.FORM_NAME)%>"/>

<bean:define id="extendBookingForm" name="<%=ExtendBookingForm.FORM_NAME %>" type="com.follett.fsc.destiny.client.circulation.servlet.ExtendBookingForm" />

<base:messageBox strutsErrors="true"/>

<script language="javaScript">
<!--
    window.focus();
    function submitCalendar(month, day, year)
    {
        //If the day is NULL, then submit the form with no day. This will
        //tell the servlet to advance/goback another month
        if (day != -1) {
            document.<%=ExtendBookingForm.FORM_NAME%>.<%=ExtendBookingForm.PARAM_DAY%>.value = day;
        }

        //Set the other params based on what was passed
        document.<%=ExtendBookingForm.FORM_NAME%>.<%=ExtendBookingForm.PARAM_MONTH%>.value = month;
        document.<%=ExtendBookingForm.FORM_NAME%>.<%=ExtendBookingForm.PARAM_YEAR%>.value  = year;

        //Submit the form - NOTE no name of the action.
        document.<%=ExtendBookingForm.FORM_NAME%>.<%=ExtendBookingForm.FIELD_SUBMIT_TYPE%>.value = "<%=ExtendBookingForm.SUBMIT_TYPE_CALENDAR%>";
        document.<%=ExtendBookingForm.FORM_NAME%>.submit();
    }
// -->
</script>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request.getSession(), request);
    ExtendBookingForm form = (ExtendBookingForm)request.getAttribute(ExtendBookingForm.FORM_NAME);
 %>

<base:form action="/circulation/servlet/handleextendbookingform.do">
	<html:hidden property="<%=ExtendBookingForm.FIELD_SUBMIT_TYPE%>"/>
    <html:hidden property="<%=ExtendBookingForm.FIELD_BIB_ID%>"/>
    <html:hidden property="<%=ExtendBookingForm.FIELD_COPY_ID%>"/>
    <html:hidden property="<%=ExtendBookingForm.FIELD_SITE_ID%>"/>
    <html:hidden property="<%=ExtendBookingForm.FIELD_TITLE%>"/>
    <html:hidden property="<%=ExtendBookingForm.FIELD_MEDIA_LOAN_PERIOD%>"/>
    <html:hidden property="<%=ExtendBookingForm.FIELD_EXTEND_DATE_FROM%>"/>
	<html:hidden property="currentDate"/>
	<html:hidden property="<%=ExtendBookingForm.PARAM_MONTH%>" value=""/>
	<html:hidden property="<%=ExtendBookingForm.PARAM_DAY%>" value=""/>
	<html:hidden property="<%=ExtendBookingForm.PARAM_YEAR%>" value=""/>
	<html:hidden property="<%=ExtendBookingForm.FIELD_TITLE_COLLECTION_TYPE%>"/>

    <base:outlinedTable borderColor="#C0C0C0" id="<%=ExtendBookingForm.TABLE_EXTEND_REQUEST%>" width="95%">
    
        <%-- ROW 1: Booking prompt and Save/Cancel buttons --%>
        <tr class="FormHeading">
            <td>
                <%="Booking" %>    
            </td>
            <td colspan="2" valign="top" class="ColRowBold tdAlignRight">
            <base:showHideTag id="saveBooking"> 
                <base:saveButton  
                    name="<%=ExtendBookingForm.BUTTON_SAVE_BOOKING%>" onclick="hideElementsaveBooking()" 
                    />&nbsp;
                <base:cancelButton  
                    name="<%=ExtendBookingForm.BUTTON_CANCEL%>" />
            </base:showHideTag>
            </td>
        </tr>

		<%-- ROW 2: Left-Column will be where we display the booking form;
		            Right-Column will be where we display the calendar --%>
        <tr>
            <td valign="top" width="100%">
                <table id="<%=ExtendBookingForm.TABLE_BOOKING%>" width="100%">
                    <tr> <!-- title info stuff -->
                        <td> <!-- icon -->
                            <bean:write property="<%=ExtendBookingForm.FIELD_BIB_MATERIAL_TYPE_IMG_TAG%>" name="<%=ExtendBookingForm.FORM_NAME%>" filter="false"/>
                        </td>
                        <td class="TableHeading"> <!-- bib title - 245 subfield a -->
                            <%=ResponseUtils.filter(extendBookingForm.getTitle())%>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td class="ColRowBold">
                            <%="Extend To" %>&nbsp;<html:text property="<%=DateRangeTag.FIELD_DATE_TO%>" size="9" maxlength="10"/>
                        </td>
                    </tr>
	                <tr>
                        <td></td>
	                    <td class="ColRow">
                            <%=form.buildMaxExtensionPeriodString()%> <%="Check the calendar for availability." %>
	                    </td>
	                </tr>
                    <% if (ObjectHelper.equals(store.getSiteID(), form.getSiteID())) { %>
				    <base:spanIfAllowed permission='<%= Permission.CIRC_OVERRIDE_MEDIA_POLICIES %>'>
				    <tr>
                        <td></td>
	   		            <td class="ColRow">
	   	    	            <html:checkbox name="<%=ExtendBookingForm.FORM_NAME%>" property="<%=ExtendBookingForm.FIELD_OVERRIDE_MEDIA_LOAN_PERIOD%>"/>Override media policy
	    	    	    </td>
	        	    </tr>
		            </base:spanIfAllowed>
                    <% } %>           
                </table>
            </td>
          
		    <%-- Calendar --%>
            <base:bookingCalendar formName="<%= ExtendBookingForm.FORM_NAME %>"/>
		</tr>
    </base:outlinedTable>
</base:form>
