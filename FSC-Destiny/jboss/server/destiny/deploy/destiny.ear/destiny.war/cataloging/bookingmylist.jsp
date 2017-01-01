<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs"%>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.PatronInfoBean" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>

<c:set var="cForm" value="<%=request.getAttribute(BookingMyListForm.FORM_NAME)%>"/>

<script language="javaScript">
<!--
    window.focus();
    function submitCalendar(month, day, year)
    {
        //If the day is NULL, then submit the form with no day. This will
        //tell the servlet to advance/goback another month
        if (day != -1) {
            document.<%=BookingMyListForm.FORM_NAME%>.<%=BookingMyListForm.PARAM_DAY%>.value = day;
        }

        //Set the other params based on what was passed
        document.<%=BookingMyListForm.FORM_NAME%>.<%=BookingMyListForm.PARAM_MONTH%>.value = month;
        document.<%=BookingMyListForm.FORM_NAME%>.<%=BookingMyListForm.PARAM_YEAR%>.value  = year;

        //Submit the form - NOTE no name of the action.
        document.<%=BookingMyListForm.FORM_NAME%>.<%=BookingMyListForm.FIELD_SUBMIT_TYPE%>.value = "<%=BookingMyListForm.SUBMIT_TYPE_CALENDAR%>";
        document.<%=BookingMyListForm.FORM_NAME%>.submit();
    }
// -->
</script>

<%
 BookingMyListForm form = (BookingMyListForm)request.getAttribute(BookingMyListForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    
    String focusControl = "";  // default focus control to nothing
                               // only set when we have field to focus on
    if (form.isPatronSearchable()) {
	    PatronInfoBean pib = BaseCircForm.createPatronInfoBean(store, form.getPatronID());
	    request.setAttribute("patronInfoBean", pib);

   		focusControl = form.FIELD_SEARCH_STRING;
    }

%>

<base:messageBox strutsErrors="true"/>    

<base:form action="/cataloging/servlet/handlebookingmylistform.do" focus="<%=focusControl%>">

<html:hidden property="<%= BookingMyListForm.PARAM_LIST_ID %>"/>
<html:hidden property="<%= BookingMyListForm.FIELD_SUBMIT_TYPE %>"/>
<html:hidden property="<%= BookingMyListForm.PARAM_PATRON_ID_FOR_MEDIA_HOLD %>"/>
<html:hidden property="<%= BookingMyListForm.PARAM_PATRON_SITEID %>"/>
<html:hidden property="<%=BookingMyListForm.FIELD_MEDIA_DELIVERY_METHOD_CHANGED%>"/>
<html:hidden property="<%=BookingMyListForm.PARAM_IS_BOOKING_FROM_SERIES%>"/>
<input type="hidden" name="<%=BookingMyListForm.PARAM_MONTH%>" value="">
<input type="hidden" name="<%=BookingMyListForm.PARAM_DAY%>" value="">
<input type="hidden" name="<%=BookingMyListForm.PARAM_YEAR%>" value="">
<% if(form.isBookingFromSeries()) {%>
    <html:hidden property="<%= BookingMyListForm.FIELD_MEDIA_SITE_ID %>"/>
<% } %>

<%PatronInfoBean pib1 = (PatronInfoBean)request.getAttribute("patronInfoBean"); %>

 <%if(form.isPatronSearchable()){%>
	<table id="<%=BookingMyListForm.TABLE_FINDSOMETHING%>" border="0" cellspacing="0" cellpadding="2">
       <tr>
           <td class="FormLabel">
               Find Patron&nbsp;
           </td>
           <td class="ColRow">
               <html:text property="<%=BookingMyListForm.FIELD_SEARCH_STRING%>" />
               &nbsp;<base:goButton align="absBottom" />
           </td>
       </tr>
       <tr>
           <td>&nbsp;</td>
           <td class="ColRow">
               <% if (store.isDistrictCircAllowed(BibMasterSpecs.COLLECTION_TYPE_LIBRARY)) { %>
                   <html:checkbox property="<%=BaseCircForm.FIELD_SEARCH_ONLY_LOCAL_PATRONS%>">Only my patrons</html:checkbox>
                <% } else { %>
                    <html:hidden property="<%=BaseCircForm.FIELD_SEARCH_ONLY_LOCAL_PATRONS%>" value="true"/>
                <% } %>
                <base:patronLookup/>
            </td>
       </tr>
	</table>
  <%}%>
	<%
    
	if (request.getAttribute("patronlist") != null) { %>
        <base:imageLine height="2" width="95%" />
		<jsp:include page="/circulation/patronlist.jsp">
			<jsp:param name="formName" value="<%= BookingMyListForm.FORM_NAME %>"/>
			<jsp:param name="districtSearch" value='<%= "" + !form.isSearchLocalPatronsOnly() %>'/>
		</jsp:include>
	    <br>
            <c:if test="${cForm.nonLinkedPatronCount > 0}">
            <table width="95%" align="center">
                <tr>
                    <td class="Instruction">
                        * This patron belongs to a site that can not book media.
                    </td>
                </tr>
            </table>
            <br/>
        </c:if>
<% }%>
	
	
	

	<%if(!form.isPatronSearchable() || (pib1 != null && form.isPatronSearchable())) { %>
    	<base:outlinedTable id="<%=BookingMyListForm.TABLE_HOLD_REQUEST%>" borderColor="#c0c0c0" width="95%">
  	    <%if( pib1 != null && form.isPatronSearchable() ){%>
    		<tr><td>
    			<jsp:include page="/circulation/circinfo.jsp" flush="true">
	    		<jsp:param name="hideBorderTable" value="true"/>
    			<jsp:param name="disableLinkHolds" value="true"/>
                <jsp:param name="useAbbreviatedView" value="true"/>
	    	</jsp:include>
			</td>
			</tr>
		<%} %>
		<tr>
			<td width="100%">
				<table id="<%=BookingMyListForm.TABLE_BOOKING_MY_LIST%>" width="100%">
					<tr>
						<base:sectionHeading printerFriendly="false" 
                            heading='<%="Requesting"  %>' 
                            tdContent='<%="width=\'100%\' colspan=\'3\'"%>'/>
					</tr>
					<tr>
						<td class="TableHeading" valign="top" colSpan="2">From
								<%if(form.getAllMediaSites() != null && form.getAllMediaSites().size() > 1 && !form.isBookingFromSeries()) {%>
									 <bean:define id="mediaSites" name="<%=BookingMyListForm.FORM_NAME%>" property="<%=BookingMyListForm.PARAM_ALL_MEDIA_SITES%>"/>
										<html:select property="<%= BookingMyListForm.FIELD_MEDIA_SITE_ID %>" onchange="this.form.submit(); return false;">
						                	<html:options collection="mediaSites" property="siteID" labelProperty="siteName"/>
									    </html:select>
						          		 
								 <%}else{ %>
								 <%=ResponseUtils.filter(form.getMediaSiteName()) %>
								 <%} %>
                                                                  
                                <bean:define id="deliveryTypes" name="<%=BookingMyListForm.FORM_NAME%>" property="<%=BookingMyListForm.PARAM_MEDIA_DELIVERY_TYPES%>"/>
                                <html:select property="<%=BookingMyListForm.FIELD_MEDIA_DELIVERY_TYPE%>" onchange="deliveryMethodSelected();">
                                        <html:options collection="deliveryTypes" property="longID" labelProperty="stringDesc"/>
                                </html:select>  
						</td>
								
						<td class="tdAlignRight" valign="top" colspan="2">
							&nbsp;
        				</td>
					</tr>
					<tr>
						<td valign="top" width="100%">
							<table id="<%= BookingMyListForm.TABLE_CALENDAR_AREA %>" width="100%">
								<tr>
									<td class="TableHeading2"> 
									Titles in list: <%=form.getQuantityCopies()%>
                                    <br>&nbsp;
									</td>
								</tr>
								<tr>
									<td class="ColRowBold">
									Book 1 copy each
									</td>
								</tr>		
								<tr>
									<td class="ColRowBold">
									From&nbsp;<html:text property="<%=DateRangeTag.FIELD_DATE_FROM%>" size="9" maxlength="10"/>&nbsp;to&nbsp;<html:text property="<%=DateRangeTag.FIELD_DATE_TO%>" size="9" maxlength="10"/>
									</td>
								</tr>		
								<tr>
									<td class="ColRow">
										<%=form.buildMaxLoanPeriodString()%>
									</td>
								</tr>		
  							    <base:spanIfAllowed permission='<%= Permission.CIRC_OVERRIDE_MEDIA_POLICIES %>'>
    			                <% if (ObjectHelper.equals(store.getSiteID(), form.getMediaSiteID())) { %>
								<tr>
									<td class="ColRow">
										<html:checkbox name="<%=BookingMyListForm.FORM_NAME%>" property="<%=BookingMyListForm.FIELD_OVERRIDE_MEDIA_LOAN_PERIOD%>"/>Override media policy
									</td>
								</tr>
								<% } %>
								</base:spanIfAllowed>
							</table>
						</td>
						<!-- Calendar -->
          					<%if(pib1 != null || !form.isPatronSearchable() ){
          					 %>
          						<base:bookingCalendar formName="<%= BookingMyListForm.FORM_NAME %>" patronID="<%= pib1 != null ? pib1.getPatronID() : store.getLoggedInPatronID() %>"/>
          					 <%} else {%>
								<td valign="top" colspan="2">
									&nbsp;
		          				</td>
          					 <% } %>
                    </tr>
				</table>
			</td>
		</tr>	
		<tr>
            <td align='center' colSpan='2'>
                <base:showHideTag id="onSave">
                    <base:saveButton onclick="hideElementonSave()"/>
                    <base:cancelButton/>
                </base:showHideTag>
             </td>
          </tr>
    </base:outlinedTable>
	<%} %>
</base:form>
<script language="JavaScript" type="text/javascript">
<!--

function deliveryMethodSelected() {
    document.<%=BookingMyListForm.FORM_NAME%>.<%=BookingMyListForm.FIELD_MEDIA_DELIVERY_METHOD_CHANGED%>.value = "true";
    document.<%=BookingMyListForm.FORM_NAME%>.submit();
}

//-->
</script>

