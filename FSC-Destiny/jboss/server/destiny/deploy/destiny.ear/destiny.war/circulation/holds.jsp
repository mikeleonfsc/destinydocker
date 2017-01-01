<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.PatronInfoBean" %>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.HoldForPatronValue" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.HoldSpecs" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>

<%
    HoldViewForm form = (HoldViewForm)request.getAttribute(HoldViewForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    PatronInfoBean pib = BaseCircForm.createPatronInfoBean(store, form.getPatronID());
    
    if ( pib != null && pib.isVisitor() && !store.isDistrictCircAllowed(CollectionType.LIBRARY) ) {
        pib = null;
        form.setPatronID(null);
        store.setCurrentPatronID(null);
    } else {
        request.setAttribute("patronInfoBean", pib);
    }

    String newHoldLink = "/circulation/servlet/presentnewholdform.do";
    newHoldLink = URLHelper.addHREFParam(newHoldLink, "patronID", form.getPatronID());

    String focusControl = "";  // default focus control to nothing
                               // only set when we have field to focus on
    if (form.getHoldSideLink()) {
    	focusControl = "searchString";
    }
    String editURL = "/backoffice/servlet/presentpatroneditform.do?action=Edit";
    if(!store.isDistrictUser()) {
        editURL = "/backoffice/servlet/presenteditpatrongeneralinfoform.do?action=Edit";
    }

    String blockMessages = (String) request.getAttribute("blocklist");
    if (blockMessages != null) {
        focusControl = null;
    } else if (form.getConfirmHoldDelete()) {
        focusControl = HoldViewForm.BUTTON_NAME_DELETE_HOLD;
    } else if (form.getConfirmFollettEBookBookingDelete()) {
        focusControl = HoldViewForm.BUTTON_NAME_DELETE_FOLLETT_EBOOK_BOOKING;
    }
%>
<base:form action="/circulation/servlet/handleholdviewform.do" focus="<%=focusControl%>">
    <html:hidden property="<%=BasePatronListForm.PARAM_HOLD_SIDE_LINK %>"/>
<c:set var="cForm" value="<%=request.getAttribute(HoldViewForm.FORM_NAME)%>"/>

<!-- block confirmation -->
<%
    if (blockMessages != null) {
%>
        <br>
        <base:messageBox showRedBorder="true">
        <tr>
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td valign="baseline" class="Error">
                <bean:write name="<%= HoldViewForm.FORM_NAME %>" property="blockedCopy"/> <%= MessageHelper.formatMessage("holds_TransactionBlocked") %><html:hidden property="copyCheckoutID"/>
                <html:hidden property="blockMessages"/>
                <html:hidden property="<%=BasePatronListForm.PARAM_BOOKING_CHECKOUT_BARCODE %>"/>
                <%= blockMessages%>
                <p align="center"><%= MessageHelper.formatMessage("holds_DoYouWantToCompleteThisTransaction") %></p>
                <div align="center">
                	<base:yesNo 
                        buttonYesName="<%=HoldViewForm.BUTTON_OVERRIDE_YES%>"
                        buttonNoName="<%=HoldViewForm.BUTTON_OVERRIDE_NO%>"
                    />
                </div>
            </td>
        </tr>
        </base:messageBox>
    <br>

<%
    }
    // need to handle when the patron can not override blocks
    // i.e. no permission or we are on My Info
%>
<!-- END block confirmation -->

<logic:present name="<%= HoldViewForm.FORM_NAME %>" property="holdMessageHeader">
        <base:imageSpacer width="1" height="3"/>
        <base:messageBox>
        <tr valign="top" align="center">
            <td class="ColRowBold" align="center"><bean:write name="<%=HoldViewForm.FORM_NAME%>" property="holdMessageHeader"/></td>
        </tr>
	<logic:present name="<%= HoldViewForm.FORM_NAME %>" property="holdMessage">
        <tr align="center">
            <td class="ColRow" align="center"><bean:write name="<%=HoldViewForm.FORM_NAME%>" property="holdMessage"/></td>
        </tr>
	</logic:present>
        </base:messageBox>
        <base:imageSpacer width="1" height="3"/>
</logic:present>

    <logic:equal name="<%=HoldViewForm.FORM_NAME%>" property="confirmHoldDelete" value="true" scope="request">
        <html:hidden property="holdDeleteID"/>
           <%     
            String[] messageText = null;
            if ( store.isMediaBookingUser() ) {
                messageText = new String[]{"Are you sure you want to delete this booking?"};
            } else {
                messageText = new String[]{MessageHelper.formatMessage("holds_AreYouSureYouWantToDeleteThisHold")};
            }
     %>
     <base:confirmBox 
                showWarningIcon="false" filterMessage="false"
                header="<%=form.getHoldStatusMessage()%>" 
                messageText="<%=messageText%>"   
                yesName="<%=HoldViewForm.BUTTON_NAME_DELETE_HOLD%>"
                noName="<%=HoldViewForm.BUTTON_NAME_CANCEL_DELETE_HOLD%>"/>        
    </logic:equal>

    <logic:equal name="<%=HoldViewForm.FORM_NAME%>" property="confirmFollettEBookBookingDelete" value="true" scope="request">
        <html:hidden property="holdDeleteID"/>
           <%     
            String[] messageText = null;
            if ( store.isMediaBookingUser() ) {
                messageText = new String[]{"Are you sure you want to delete this booking?"};
            } else {
                messageText = new String[]{MessageHelper.formatMessage("holds_AreYouSureYouWantToDeleteThisHold")};
            }
     %>
     <base:confirmBox 
                showWarningIcon="false" filterMessage="false"
                header="<%=form.getHoldStatusMessage()%>" 
                messageText="<%=messageText%>"   
                yesName="<%=HoldViewForm.BUTTON_NAME_DELETE_FOLLETT_EBOOK_BOOKING%>"
                noName="<%=HoldViewForm.BUTTON_NAME_CANCEL_DELETE_FOLLETT_EBOOK_BOOKING%>"/>        
    </logic:equal>

<logic:equal name="<%=HoldViewForm.FORM_NAME%>" property="<%=BasePatronListForm.PARAM_HOLD_SIDE_LINK %>" value="true" scope="request">
    <table width="95%" id="<%=HoldViewForm.TABLE_HEADER%>">
        <tr>
            <td>
                <table id="<%=HoldViewForm.TABLE_FINDSOMETHING%>" border="0" cellspacing="0" cellpadding="2">
                    <tr>
                        <td class="FormLabel"><%= MessageHelper.formatMessage("holds_FindPatron") %>&nbsp;</td>
                        <td class="ColRow">
                            <html:text property="<%=HoldViewForm.FIELD_SEARCH_STRING%>" maxlength="1000" />
                            &nbsp;<base:goButton align="absbottom" />
                        </td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td class="ColRow">
                            <% if (store.isDistrictCircAllowed(BibMasterSpecs.COLLECTION_TYPE_LIBRARY)) { %>
                                <html:checkbox property="<%=BaseCircForm.FIELD_SEARCH_ONLY_LOCAL_PATRONS%>"><%= MessageHelper.formatMessage("holds_OnlyMyPatrons") %></html:checkbox>
                            <% } else { %>
                                <html:hidden property="<%=BaseCircForm.FIELD_SEARCH_ONLY_LOCAL_PATRONS%>" value="true"/>
                            <% } %>
                            <base:patronLookup/>
                        </td>
                    </tr>
                </table>
            </td>
            <td class="tdAlignRight">
                <base:spanIfAllowed permissions="<%=new Permission[] {Permission.CIRC_VIEW_HOLDS, Permission.CIRC_AED_HOLDS}%>">
                <% if (store.isMediaBookingUser()) { %>
                    <a href="/circulation/servlet/presentmediabookingsform.do">
                    <base:image src="/buttons/large/allbookings.gif" alt="All Bookings" />
                <% } else { %>
                    <a href="/circulation/servlet/presentholdviewallform.do" id="<%=HoldViewForm.ID_VIEW_REQUESTS %>">
                    <base:image src="/buttons/large/viewallholds.gif" alt='<%=MessageHelper.formatMessage("viewRequests")%>'/>
                <% } %>
                </a>
                </base:spanIfAllowed>
            </td>
        </tr>
    </table>
    <br><br>
</logic:equal>

<%  if (request.getAttribute("patronlist") != null) { %>
        <img src="/images/icons/general/line.gif" height="2" width="95%">
		<jsp:include page="/circulation/patronlist.jsp">
			<jsp:param name="formName" value="<%= HoldViewForm.FORM_NAME %>"/>
			<jsp:param name="districtSearch" value='<%= "" + !form.isSearchLocalPatronsOnly() %>'/>
		</jsp:include>
	    <br>
        <c:if test="${cForm.nonLinkedPatronCount > 0}">
            <table width="95%" align="center">
                <tr>
                    <td class="Instruction"><%= MessageHelper.formatMessage("holds_ThisPatronBelongsToASiteThatCanNotBookMedia") %></td>
                </tr>
            </table>
            <br/>
        </c:if>
<% } %>
    <!--  begin main table -->
<%    
    PatronInfoBean pib1 = (PatronInfoBean)request.getAttribute("patronInfoBean");
    PatronInfoBean tib1 = (PatronInfoBean)request.getAttribute(CheckoutForm.PARAM_TEXTBOOK_TEACHER);
	if (pib1!=null || tib1!=null ) {    
%>	
    <base:outlinedTable cellpadding="0" width="95%" borderColor="#C0C0C0">
	<tr><td>
    <jsp:include page="/circulation/circinfo.jsp" flush="true">
    	<jsp:param name="hideBorderTable" value="true"/>
    	<jsp:param name="disableLinkHolds" value="true"/>
    </jsp:include>
	</td>
	</tr>
    <% if (store.isMediaBookingUser()) { %>
		<tr>
            <td class="tdAlignRight">
			    <% if (store.isMediaBookingUser()) { %>
	                <base:link page="<%= newHoldLink %>" permission='<%= Permission.CIRC_AED_HOLDS %>'>
                        <base:image src="/buttons/large/addbooking.gif" alt="Add Booking" />
			        </base:link>&nbsp;&nbsp;&nbsp;
	                <base:link page="/circulation/servlet/presentbooknowform.do" permission='<%= Permission.CIRC_AED_HOLDS %>'>
                        <base:image src="/buttons/large/booknow.gif" alt="Book Now" />
			        </base:link>
			    <% } %>
			</td>
		</tr>
	<% } %>
    <!-- end of included file -->

<%
    if (form.getPatronID() != null) {
%>
	<tr><td>
    <table width="100%">
        <tr valign="top">
            <td>
                <table id="<%=HoldViewForm.TABLE_HOLD_BOX_TITLE%>" width="100%">
                    <tr>
                        <!-- box header and special information -->
                        <% if (store.isMediaBookingUser()) { %>
                        	<base:sectionHeading printerFriendly="false" heading="Bookings" tdContent="width='100%'"/>
                        <% } else { %>
                            <base:sectionHeading printerFriendly="false" heading='<%=MessageHelper.formatMessage("holds_Holds") %>' tdContent="width='100%'"/>
                        <% } %>
                        <td class="ColRow tdAlignRight">
 	                    <% if (!store.isMediaBookingUser()) { %>
                            <base:link id="<%=HoldViewForm.ID_ADD_HOLD %>" page="<%= newHoldLink %>" permission='<%= Permission.CIRC_AED_HOLDS %>'>
                                <base:image src="/buttons/large/addhold.gif" alt='<%=MessageHelper.formatMessage("addHold") %>'/>
    		                </base:link>
	                    <% } %>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td>
                <table id="<%=HoldViewForm.TABLE_HOLD_DETAIL%>" cellpadding="3" cellspacing="0" border="0" width="100%">
                <logic:equal name='<%=HoldViewForm.FORM_NAME %>' property="holdsEmpty" value="false">
                    <!-- Must logic equal the list size for empty message-->
                    <tr>
                        <td class="ColRowBold">&nbsp;</td>
                        <td class="ColRowBold"><%= MessageHelper.formatMessage("holds_Title") %></td>
                        <td class="ColRowBold"><%= MessageHelper.formatMessage("holds_Requested") %></td>
                        <td align="center" class="ColRowBold"><%= MessageHelper.formatMessage("holds_Quantity") %></td>
                        <td class="ColRowBold" nowrap><%=MessageHelper.formatMessage("holds_Status") %> 
                            <% if (!store.isMediaBookingUser()) { %>
                                <base:helpTag helpFileName="r_hold_reserve_statuses.htm"/>
                            <% } else { %>
                                <base:helpTag helpFileName="r_booking_statuses.htm"/>
                            <% } %>
                        </td>
                        <td class="ColRow"><base:imageSpacer width="50" height="1"/></td>
                        <% if (store.isMediaBookingUser()) { %>      
                            <td/> 
                        <% } %>                          
                    </tr>
   <!-- Write out hold table rows -->                    
                    <logic:iterate id="holds" name='<%=HoldViewForm.FORM_NAME%>' property="holdList" type="com.follett.fsc.destiny.session.circulation.data.HoldForPatronValue">
                        <base:flipper key="holds">
                            <td valign="top" class="ColRow">
                                <bean:write name="holds" property="bibTypeIcon" filter="false" />
                            </td>
                            <td valign="top" class="ColRow">
                                <bean:write name="holds" property="title"/>
                                <logic:equal name="holds" property="tempTitle" value="true">
                                    <base:image src="/icons/materialtype/temp.gif" width="19" height="16"  alt='<%= MessageHelper.formatMessage("holds_Temporary") %>'/>
                                </logic:equal>
                            </td>
                            <td valign="top" class="ColRow">
                                <logic:notEqual name="holds" property="siteShortName" value="">
                                    [<font color="#cc0000"><bean:write name="holds" property="siteShortName"/></font>]
                                </logic:notEqual>

                                <logic:notPresent name="holds" property="copyID">
                                    <logic:notPresent name="holds" property="reserveStartDate">
                                        <%if(holds.getQuantity() > 1){%>
                                            <%= MessageHelper.formatMessage("holds_Multiple")%>
                                        <%} else { %>
                                            <%= MessageHelper.formatMessage("holds_AnyCopy") %>
                                        <%} %>
                                    </logic:notPresent>
                                </logic:notPresent>
                                <logic:present name="holds" property="copyID">
                                    <%if(holds.getQuantity() > 1){%>
                                        <%= MessageHelper.formatMessage("holds_Multiple")%>
                                    <%} else { %>
                                        <logic:present name="holds" property="copyBarcode">
                                            <bean:write name="holds" property="displayableCopyBarcode"/>
                                        </logic:present>
                                        <logic:notPresent name="holds" property="copyBarcode"><%= MessageHelper.formatMessage("holds_CopyInTransit") %></logic:notPresent>
                                    <%} %>
                                 
	                            </logic:present>

                                <logic:present name="holds" property="reserveStartDate">
                                    <%= MessageHelper.formatMessage("holds_ToRange", holds.getFormattedReserveStartDate(), holds.getFormattedExpireDate()) %>
                                </logic:present>
                            </td>
                            <td align="center" valign="top" class="ColRow"><bean:write name="holds" property="quantity"/></td>
                            <td valign="top" class="ColRow">
                                <c:choose>
                                    <c:when test="${!empty holds.declinedNote}">
                                        <%=form.buildDeclineNoteLink(holds.getHoldID()) %>
                                    </c:when>
                                    <c:when test="${!empty holds.unavailabeDate}">
                                        <%=form.buildUnavailableNoteLink(holds.getHoldID()) %>
                                    </c:when>
                                    <c:otherwise>
                                        <% if (holds.isHasDeclinedILLNotes()) {
                                            String declineILLNoteURL = DeclinedNoteForm.FORM_URL_DECLINED_ILL;
                                            declineILLNoteURL = URLHelper.addHREFParam(declineILLNoteURL, HoldViewAllForm.PARAM_HOLD_ID, holds.getHoldID());
                                        %>
                                            ${holds.displayableStatus}&nbsp;
                                            <base:link target="<%= DeclinedNoteForm.TARGET_DECLINED%>" showTextAlways="true" href="<%= declineILLNoteURL %>">
                                                <base:image src="/icons/general/balloon-box-left.gif" alt='<%= MessageHelper.formatMessage("holds_Notes") %>'/>
                                            </base:link>
                                        <%} else { %>
                                            ${holds.displayableStatus}
                                        <%} %>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                            <td class="tdAlignRight" valign="top" class="ColRow">
                                <% if (store.isMediaBookingUser() && holds.isReady() && holds.getDeliveryMethod() == HoldSpecs.DELIVERY_METHOD_PATRON_PICKUP && store.getSiteID().equals(holds.getHoldSiteID())) {
                                    String url = "/circulation/servlet/handleholdviewform.do";
                                    url = URLHelper.addHREFParam(url, BasePatronListForm.ACTION_BOOKING_PICKED_UP, Boolean.TRUE.toString());
                                    url = URLHelper.addHREFParam(url, BasePatronListForm.PARAM_BOOKING_CHECKOUT_COPYID, holds.getCopyID());
                                    url = URLHelper.addHREFParam(url, BasePatronListForm.PARAM_BOOKING_CHECKOUT_BARCODE, holds.getCopyBarcode());
                                    url = URLHelper.addHREFParam(url, BasePatronListForm.PARAM_HOLD_SIDE_LINK, new Boolean(form.getHoldSideLink()));
                                %>    
                                <base:link  page='<%=url%>'>      
                                    <base:image src="/icons/general/pickedup.gif" width="70" height="18" alt='<%=MessageHelper.formatMessage("basepatronlist_PickedUp")%>'/>
                                </base:link>                                                                 
                            <% } else { %>                              
                                  <logic:present name='<%=HoldViewForm.FORM_NAME%>' property="holdList">
    	                              <logic:equal name="holds" property="showILLCheckoutButton" value="true">
                                        <base:link permission="<%= Permission.CIRC_CHECKOUT %>"
                                        		   page="/circulation/servlet/handleholdviewform.do" 
                                                   name="holds" property="checkoutIllLink">
                                            <base:image src="/buttons/small/illcheckout.gif" alt='<%=MessageHelper.formatMessage("illCheckout")%>'/>
    	                                </base:link>
    	                              </logic:equal>
                                  </logic:present>
                                  
                                  <logic:equal name='<%=HoldViewForm.FORM_NAME %>' property="booking" value="false">
                                    <logic:notEqual name="holds" property="recordType" value="<%=Integer.toString(HoldForPatronValue.RECORD_TYPE_NOT_APPROVED)%>">
                                      <logic:equal name="holds" property="siteShortName" value="">
                                        <base:link page="/circulation/servlet/presentholdqueueform.do"
                                                   paramName="holds" paramId="bibID" paramProperty="bibID">
                                            <base:image src="/icons/general/view.gif" width="19" height="16" alt='<%=MessageHelper.formatMessage("holdview_ViewHoldsForThisTitle") %>'/>
                                        </base:link>
                                      </logic:equal>
                                    </logic:notEqual>
                                  </logic:equal>
    
    								<% if (form.showDeleteLinkForHolds(holds)) { %>
    								
    								  <!-- only show edit for media (but never for Follett eBook bookings) -->
                                     <logic:equal name="holds" property="follettEBookBooking" value="false">
        								<logic:equal name="holds" property="collectionType" value='<%=""+BibMasterSpecs.COLLECTION_TYPE_MEDIA%>'>
        									<base:link permission="<%= Permission.CIRC_AED_HOLDS%>" page="/cataloging/servlet/presentholdrequestform.do?" name="holds"
        										property="editLink">
                                                <base:image src = "/icons/general/edit.gif" width="19" height="16" alt="Edit this booking"/>      
        									</base:link> 
        								</logic:equal>
                                    </logic:equal>
    								  
                                      <base:link permission="<%= Permission.CIRC_AED_HOLDS%>" page="/circulation/servlet/handleholdviewform.do"
                                                   name="holds" property="deleteLink">
                                                   <% if (store.isMediaBookingUser()) { %>
                                                       <base:image src="/icons/general/delete.gif" width="19" height="16" alt="Delete this booking"/>
                                                   <% }else{ %>
                                                       <base:image src="/icons/general/delete.gif" width="19" height="16" alt='<%=MessageHelper.formatMessage("holdview_DeleteThisHold") %>'/>
                                                    <% } %>                                                       
                                       </base:link>
    	                            <% } %>    
                                </td>
                            <% } %>  
                        </base:flipper>
                    </logic:iterate>
                </logic:equal>
                <logic:equal name='<%=HoldViewForm.FORM_NAME%>' property="holdsEmpty" value="true">
                    <tr><td class="ColRowBold" align="center">
                            <% if (store.isMediaBookingUser()) { %>
                                There are no bookings for this patron
                            <% } else { %>
                                <%=MessageHelper.formatMessage("holds_ThereAreNoHoldsForThisPatron" ) %>
                            <% } %>
                    </td></tr>
                </logic:equal>
                </table>

               <!-- end box body -->
            </td>
        </tr>
    </table>
    </td></tr>
<%    }   // end form.getPatronID() != null %>
	</base:outlinedTable>
<%	} // end of if (pib!=null || tib !=null)%>	
</base:form>

