<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>



<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>


<bean:define id="holdRequestForm" name="<%=HoldRequestForm.FORM_NAME %>" type="com.follett.fsc.destiny.client.cataloging.servlet.HoldRequestForm" />

<base:messageBox strutsErrors="true"/>

<%if(!holdRequestForm.isCanPlaceBooking()){ %>

 <base:messageBox showWarningIcon="true" message='<%=MessageHelper.formatMessage("holdrequest_UnableToPlaceBookingForThisTitle")%>'/>
       

<%} else { %>

<script language="javaScript">
<!--
    window.focus();
    function submitCalendar(month, day, year)
    {
        //If the day is NULL, then submit the form with no day. This will
        //tell the servlet to advance/goback another month
        if (day != -1) {
            document.<%=HoldRequestForm.FORM_NAME%>.<%=HoldRequestForm.PARAM_DAY%>.value = day;
        }

        //Set the other params based on what was passed
        document.<%=HoldRequestForm.FORM_NAME%>.<%=HoldRequestForm.PARAM_MONTH%>.value = month;
        document.<%=HoldRequestForm.FORM_NAME%>.<%=HoldRequestForm.PARAM_YEAR%>.value  = year;

        //Submit the form - NOTE no name of the action.
        document.<%=HoldRequestForm.FORM_NAME%>.<%=HoldRequestForm.FIELD_SUBMIT_TYPE%>.value = "<%=HoldRequestForm.SUBMIT_TYPE_CALENDAR%>";
        document.<%=HoldRequestForm.FORM_NAME%>.submit();
    }
    
    function submitHoldOrReserveDropDown()
    {
        document.<%=HoldRequestForm.FORM_NAME%>.<%=HoldRequestForm.BUTTON_CHANGE_HOLD_OR_RESERVE%>.value = "true";
        document.<%=HoldRequestForm.FORM_NAME%>.submit();
    }
// -->
</script>

<logic:present name="<%=HoldRequestForm.FORM_NAME%>" property="holdMessageHeader">
    <base:imageSpacer width="1" height="3"/>
    <base:messageBox>
        <tr valign="top" align="center">
            <td class="ColRowBold" align="center"><bean:write name="<%=HoldRequestForm.FORM_NAME%>" property="holdMessageHeader"/></td>
        </tr>
        <logic:present name="<%=HoldRequestForm.FORM_NAME%>" property="holdMessage">
        <tr align="center">
            <td class="ColRow" align="center"><bean:write name="<%=HoldRequestForm.FORM_NAME%>" property="holdMessage"/></td>
        </tr>
        </logic:present>
    </base:messageBox>
    <base:imageSpacer width="1" height="3"/>
</logic:present>

<%
    HoldRequestForm form = (HoldRequestForm)request.getAttribute(HoldRequestForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request.getSession(), request);
    Long patronID = store.getLoggedInPatronID();
    if (form.isEditingMediaHold()) {
        patronID = form.getPatronIDForMediaHoldToEdit();
    }
    boolean quantityWritten = false;
%>

<base:form action="/cataloging/servlet/handleholdrequestform.do">
    <c:set var="cForm" value="<%=request.getAttribute(HoldRequestForm.FORM_NAME)%>"/>
    <c:set var="optionHold" value="<%=HoldRequestForm.OPTION_HOLD_VALUE%>"/>
    <c:set var="optionReserve" value="<%=HoldRequestForm.OPTION_RESERVED_VALUE%>"/>
    <c:set var="collectionTypeMedia" value="<%=CollectionType.MEDIA%>"/>
    <html:hidden property="<%= HoldRequestForm.FIELD_SUBMIT_TYPE %>"/>
    <html:hidden property="<%=HoldRequestForm.FIELD_BIBID%>"/>
    <html:hidden property="<%=HoldRequestForm.PARAM_PATRON_SITEID%>"/>
    <html:hidden property="<%=HoldRequestForm.FIELD_MEDIA_DELIVERY_METHOD_CHANGED%>"/>
    <html:hidden property="<%=HoldRequestForm.PARAM_MEDIA_HOLD_ID_TO_EDIT%>"/>
    <html:hidden property="<%=HoldRequestForm.PARAM_PATRON_ID_FOR_MEDIA_HOLD_TO_EDIT%>"/>
    <html:hidden property="currentDate"/>
    <html:hidden property="<%=HoldRequestForm.PARAM_ORIGINAL_MEDIA_SITE_ID%>"/>
    <html:hidden property="<%=HoldRequestForm.FIELD_RESERVE_ONLY%>"/>
    <input type="hidden" name="<%=HoldRequestForm.BUTTON_CHANGE_HOLD_OR_RESERVE%>" value="false"/>
    <input type="hidden" name="<%=HoldRequestForm.PARAM_MONTH%>" value="">
    <input type="hidden" name="<%=HoldRequestForm.PARAM_DAY%>" value="">
    <input type="hidden" name="<%=HoldRequestForm.PARAM_YEAR%>" value="">

    <base:outlinedTable id="<%=HoldRequestForm.TABLE_HOLD_REQUEST%>" borderColor="#c0c0c0" width="95%">
    <tr>
    <td>
    <table cellpadding="2" width="100%" cellspacing ="0">
        <tr class="TableHeading">
    <%
        String colSpan = "2";
    %>
<c:if test="${cForm.holdOrReserve == optionReserve || cForm.titleCollectionType == collectionTypeMedia}">
    <%
        colSpan = "3";
    %>
</c:if>
      <base:sectionHeading printerFriendly="false" 
            heading='<%=MessageHelper.formatMessage("holdrequest_Requesting")  %>' 
            tdContent='<%="width=\'100%\' colspan=\'" + colSpan + "\'"%>'/>
        </tr>
<c:if test="${cForm.holdOrReserve == optionReserve || cForm.titleCollectionType == collectionTypeMedia}">
        <tr>
          <td class="ColRowBold"><%= MessageHelper.formatMessage("holdrequest_From") %>
<logic:equal name="<%=HoldRequestForm.FORM_NAME%>" property="<%=HoldRequestForm.PARAM_DISPLAY_SITE_COMBO_BOX%>" value="false">
            <bean:write property="<%=HoldRequestForm.PARAM_DEFAULT_SITE_NAME%>" name="<%=HoldRequestForm.FORM_NAME%>" filter="true"/>
            <html:hidden property="<%=HoldRequestForm.FIELD_SITE_ID%>"/>
</logic:equal> 
<logic:equal name="<%=HoldRequestForm.FORM_NAME%>" property="<%=HoldRequestForm.PARAM_DISPLAY_SITE_COMBO_BOX%>" value="true">
            <bean:define id="mediaSites" name="<%=HoldRequestForm.FORM_NAME%>" property="<%=HoldRequestForm.PARAM_SITES%>"/>
            <html:select property="<%= HoldRequestForm.FIELD_SITE_ID %>" onchange="this.form.submit(); return false;">
                <html:options collection="mediaSites" property="longID" labelProperty="stringDesc"/>
            </html:select>
</logic:equal>
                <%if((form.getTitleCollectionType() == CollectionType.MEDIA) && !form.isFollettEBook()){%>
                    <c:choose>
                    <c:when test="${cForm.editingMediaHold == false}">
                        <bean:define id="deliveryTypes" name="<%=HoldRequestForm.FORM_NAME%>" property="<%=HoldRequestForm.PARAM_MEDIA_DELIVERY_TYPES%>"/>
                        <html:select property="<%=HoldRequestForm.FIELD_MEDIA_DELIVERY_TYPE%>" onchange="deliveryMethodSelected();">
                            <html:options collection="deliveryTypes" property="longID" labelProperty="stringDesc"/>
                        </html:select>
                    </c:when>
                    <c:otherwise>
                        <%=form.gimmeMediaDeliveryTypeDisplay()%>
                        <html:hidden property="<%=HoldRequestForm.FIELD_MEDIA_DELIVERY_TYPE%>"/>    
                    </c:otherwise>
                </c:choose>
                <%} %>
          </td>
<c:if test="${cForm.holdOrReserve == optionReserve || cForm.titleCollectionType == collectionTypeMedia}">
          <td>&nbsp;</td>
</c:if>
          <td>&nbsp;</td>            
        </tr>
</c:if>
        <tr>
          <td valign="top" width="100%">
            <table id="<%=HoldRequestForm.TABLE_HOLD_OR_RESERVE%>" width="100%">
              <tr> <!-- title info stuff -->
                <td> <!-- icon -->
                  <bean:write property="bibMaterialTypeImgTag" name="<%=HoldRequestForm.FORM_NAME%>" filter="false"/>
                </td>
                <td class="TableHeading"> <!-- bib title - 245 subfield a -->
                  <%=ResponseUtils.filter(holdRequestForm.getTitle())%>
                </td>
              </tr>
              <tr>
                <td></td>
                <td class="ColRow"> <!-- bib author-->
                  <%=ResponseUtils.filter(holdRequestForm.getAuthor())%>
                </td>
              </tr>
<logic:notEqual name="<%=HoldRequestForm.FORM_NAME%>" property="<%= HoldRequestForm.FIELD_TITLE_COLLECTION_TYPE %>" value='<%="" + CollectionType.MEDIA%>'>
              <c:choose>
                  <c:when test="${cForm.canPlaceReservesForSelf && !cForm.reserveOnly}">
                      <tr>
                        <td></td>
                        <td class="ColRowBold">
                          <html:select property="<%=HoldRequestForm.FIELD_SELECT_HOLD_OR_RESERVE%>" onchange="submitHoldOrReserveDropDown()">
                            <html:option value="<%=HoldRequestForm.OPTION_HOLD_VALUE%>"><%= MessageHelper.formatMessage("holdrequest_AsSoonAsPossible") %></html:option> 
                            <html:option value="<%=HoldRequestForm.OPTION_RESERVED_VALUE%>"><%= MessageHelper.formatMessage("holdrequest_ReserveForSpecificDate") %> </html:option>
                          </html:select>
                        </td>
                      </tr>
                  </c:when>
                  <c:otherwise>
                      <html:hidden property="<%=HoldRequestForm.FIELD_SELECT_HOLD_OR_RESERVE%>"/>
                  </c:otherwise>
              </c:choose>
</logic:notEqual>
<logic:equal name="<%=HoldRequestForm.FORM_NAME%>" property="<%= HoldRequestForm.FIELD_TITLE_COLLECTION_TYPE %>" value='<%="" + CollectionType.MEDIA%>'>
              <html:hidden property="<%=HoldRequestForm.FIELD_SELECT_HOLD_OR_RESERVE%>" value="<%=HoldRequestForm.OPTION_RESERVED_VALUE%>"/>
</logic:equal>
              <c:if test="${cForm.holdOrReserve == optionReserve || cForm.titleCollectionType == collectionTypeMedia || (cForm.holdOrReserve == optionHold && cForm.canHoldMultipleCopiesForSelf) && cForm.copiesOwned > 1 }">
              <tr>
                <td></td>
                <td class="ColRowBold">
                    <%=form.buildCopiesOwnedString()%>
                    <base:helpTag helpFileName="d_holds_new_hold_req_copies_def.htm"/>
                </td>
              </tr>
              <tr>
                <td></td>
                <td class="ColRowBold">
                <logic:equal name="<%=HoldRequestForm.FORM_NAME%>" property="<%= HoldRequestForm.PARAM_EDITING_MEDIA_HOLD %>" value="true">
                    <%=form.buildBookCopiesString()%>
                    <html:hidden property="<%=HoldRequestForm.FIELD_QUANTITY%>"/>
                    <% quantityWritten = true; %>
                </logic:equal>
                <logic:equal name="<%=HoldRequestForm.FORM_NAME%>" property="<%= HoldRequestForm.PARAM_EDITING_MEDIA_HOLD %>" value="false">
                    <logic:notEqual name="<%=HoldRequestForm.FORM_NAME%>" property="<%= HoldRequestForm.FIELD_TITLE_COLLECTION_TYPE %>" value='<%="" + CollectionType.MEDIA%>'>
                        <logic:equal name="<%=HoldRequestForm.FORM_NAME%>" property="<%= HoldRequestForm.FIELD_SELECT_HOLD_OR_RESERVE%>" value="hold">
                            <%= MessageHelper.formatMessage("holdrequest_Hold") %>
                        </logic:equal>
                        <logic:notEqual name="<%=HoldRequestForm.FORM_NAME%>" property="<%= HoldRequestForm.FIELD_SELECT_HOLD_OR_RESERVE%>" value="hold">
                            <%= MessageHelper.formatMessage("holdrequest_Reserve") %>
                        </logic:notEqual>
                    </logic:notEqual>                    
                    <logic:equal name="<%=HoldRequestForm.FORM_NAME%>" property="<%= HoldRequestForm.FIELD_TITLE_COLLECTION_TYPE %>" value='<%="" + CollectionType.MEDIA%>'>
                        <%= MessageHelper.formatMessage("holdrequest_Book") %>
                    </logic:equal>
                    
                    <logic:equal name="<%=HoldRequestForm.FORM_NAME%>" property="<%= HoldRequestForm.PARAM_FOLLETT_EBOOK %>" value="false">
                        &nbsp;<html:text property="<%=HoldRequestForm.FIELD_QUANTITY%>" size="2" maxlength="2"/>
                        <% quantityWritten = true; %>
                        <c:if test="${cForm.holdOrReserve == optionReserve || cForm.titleCollectionType == collectionTypeMedia}">
                            &nbsp;<base:genericButton src="/buttons/small/refreshcalendar.gif" name="<%= HoldRequestForm.BUTTON_REFRESH_CALENDAR %>"  alt='<%= MessageHelper.formatMessage("holdrequest_RefreshCalendar") %>' absbottom="true" />
                        </c:if>
                    </logic:equal>
                    <logic:equal name="<%=HoldRequestForm.FORM_NAME%>" property="<%= HoldRequestForm.PARAM_FOLLETT_EBOOK %>" value="true">&nbsp;1</logic:equal>
                </logic:equal>
                </td>
              </tr>
              <c:if test="${cForm.holdOrReserve == optionReserve || cForm.titleCollectionType == collectionTypeMedia}">
                  <tr>
                    <td></td>
                    <td class="ColRowBold">
                    <%= MessageHelper.formatMessage("holdrequest_From") %>&nbsp;<html:text property="<%=DateRangeTag.FIELD_DATE_FROM%>" size="9" maxlength="10"/>&nbsp;<%=MessageHelper.formatMessage("holdrequest_To")%>&nbsp; <html:text property="<%=DateRangeTag.FIELD_DATE_TO%>" size="9" maxlength="10"/>
                    </td>
                  </tr>
              </c:if>
<logic:equal name="<%=HoldRequestForm.FORM_NAME%>" property="<%= HoldRequestForm.FIELD_TITLE_COLLECTION_TYPE %>" value='<%="" + CollectionType.MEDIA%>'>
              <tr>
                <td/>
                <td class="ColRow"><%=form.buildMaxLoanPeriodString()%>
                </td>
              </tr>
              <base:spanIfAllowed permission='<%= Permission.CIRC_OVERRIDE_MEDIA_POLICIES %>'>
              <% if (ObjectHelper.equals(store.getSiteID(), form.getSiteID())) { %>
              <tr>
                <td/>
                <td class="ColRow">
                  <html:checkbox name="<%=HoldRequestForm.FORM_NAME%>" property="<%=HoldRequestForm.FIELD_OVERRIDE_MEDIA_LOAN_PERIOD%>"/><%= MessageHelper.formatMessage("holdrequest_OverrideMediaPolicy") %>
                </td>
              </tr>
              <% } %>
              </base:spanIfAllowed>
</logic:equal>
              </c:if>
            </table>
          </td>
          
      <c:choose>
          <c:when test="${cForm.holdOrReserve == optionReserve || cForm.titleCollectionType == collectionTypeMedia}">
              <base:bookingCalendar formName="<%= HoldRequestForm.FORM_NAME %>" patronID="<%= patronID %>"/>
          </c:when>
          <c:otherwise>
              <% if (!quantityWritten) { %>
                  <html:hidden property="<%=HoldRequestForm.FIELD_QUANTITY%>"/>
              <% } %>
          </c:otherwise>
      </c:choose>
    <tr>
        <td align='center' colspan='2' nowrap>
            <base:showHideTag id="onSaveTop">
                <base:saveButton onclick="hideElementonSaveTop()" name="<%= HoldRequestForm.BUTTON_SAVE_HOLD %>" />
                <base:cancelButton name="<%= HoldRequestForm.BUTTON_CANCEL %>"/>
            </base:showHideTag>      
        </td>
    </tr>
    
    </table>
    </td>
    </tr>
    </base:outlinedTable>
<script language="JavaScript" type="text/javascript">
<!--
function deliveryMethodSelected() {
    document.<%=HoldRequestForm.FORM_NAME%>.<%=HoldRequestForm.FIELD_MEDIA_DELIVERY_METHOD_CHANGED%>.value = "true";
    document.<%=HoldRequestForm.FORM_NAME%>.submit();
}

//-->
</script>
</base:form>
<%} %>

