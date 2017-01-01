<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.*" %>
<%@ page import="com.follett.fsc.common.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb.*"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.*"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs"%>

<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.session.cataloging.ejb.KeywordSearchFacadeSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.PatronInfoBean" %>

<%@ page import="com.follett.fsc.destiny.client.common.CopyHelper"%>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>


<%@page import="com.follett.fsc.destiny.entity.ejb3.SiteTypeSpecs"%><base:messageBox strutsErrors="true"/>
<bean:define id="deliveryMethods" name="<%= NewHoldForm.FORM_NAME %>" property="deliveryOptions"/>
<bean:define id="searchScopeOptions" name="<%= NewHoldForm.FORM_NAME %>" property="searchScopeOptions"/>
<bean:define id="searchTypeOptions" name="<%= NewHoldForm.FORM_NAME %>" property="searchTypeOptions"/>
<bean:define id="searchTypeOptionsHoldILL" name="<%= NewHoldForm.FORM_NAME %>" property="searchTypeOptionsHoldILL"/>

<%
    NewHoldForm form = (NewHoldForm)request.getAttribute(NewHoldForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    boolean quantityWritten = false;
%>
<script language="javaScript">
<!--
   function submitCalendar(month, day, year)
    {
        //If the day is NULL, then submit the form with no day. This will
        //tell the servlet to advance/goback another month
        if (day != -1) {
            document.<%=NewHoldForm.FORM_NAME%>.<%=NewHoldForm.PARAM_DAY%>.value = day;
        }

        //Set the other params based on what was passed
        document.<%=NewHoldForm.FORM_NAME%>.<%=NewHoldForm.PARAM_MONTH%>.value = month;
        document.<%=NewHoldForm.FORM_NAME%>.<%=NewHoldForm.PARAM_YEAR%>.value = year;

        //Submit the form - NOTE no name of the action.
        document.<%=NewHoldForm.FORM_NAME%>.<%=NewHoldForm.FIELD_SUBMIT_TYPE%>.value = "<%=NewHoldForm.SUBMIT_TYPE_CALENDAR%>";
        document.<%=NewHoldForm.FORM_NAME%>.submit();
    }
    
    function submitHoldOrReserveDropDown()
    {
        document.<%=NewHoldForm.FORM_NAME%>.<%=NewHoldForm.BUTTON_CHANGE_HOLD_OR_RESERVE%>.value = "true";
        document.<%=NewHoldForm.FORM_NAME%>.submit();
    }
    function submitAnyOrSpecificDropDown()
    {
        document.<%=NewHoldForm.FORM_NAME%>.<%=NewHoldForm.BUTTON_CHANGE_ANY_OR_SPECIFIC%>.value = "true";
        document.<%=NewHoldForm.FORM_NAME%>.submit();
    }
    function submitSiteOrParticipatingDropDown()
    {
        document.<%=NewHoldForm.FORM_NAME%>.<%=NewHoldForm.BUTTON_CHANGE_SITE_OR_PARTICIPATING%>.value = "true";
        document.<%=NewHoldForm.FORM_NAME%>.submit();
    }
// -->
</script>

<base:form action="/circulation/servlet/handlenewholdform.do" focus="<%=NewHoldForm.FIELD_SEARCH_STRING%>">

<c:set var="cForm" value="<%=request.getAttribute(NewHoldForm.FORM_NAME)%>"/>
<c:set var="collectionTypeLibrary" value="<%=CollectionType.LIBRARY %>"/>
<c:set var="optionHold" value="<%=NewHoldForm.OPTION_HOLD_VALUE%>"/>
<c:set var="optionReserve" value="<%=NewHoldForm.OPTION_RESERVED_VALUE%>"/>
<c:set var="optionSpecificCopy" value="<%=NewHoldForm.OPTION_SPECIFIC_COPY%>"/>
<c:set var="collectionTypeMedia" value="<%=CollectionType.MEDIA%>"/>
<c:set var="siteTypeMyLibrary" value="<%=SiteTypeSpecs.SITE_TYPE_ID_MY_LIBRARY%>"/>

<html:hidden property="<%=NewHoldForm.FIELD_BIBID%>"/>
<html:hidden property="<%=NewHoldForm.PARAM_PREV_BIBID%>"/>
<html:hidden property="<%=NewHoldForm.FIELD_PATRONID%>"/>
<html:hidden property="<%=NewHoldForm.FIELD_HIDDEN_FIND_TITLE_BASED%>"/>
<html:hidden property="bibTitle"/>
<html:hidden property="selectedSiteID"/>
<html:hidden property="currentDate"/>
<html:hidden property="<%=NewHoldForm.FIELD_SUBMIT_TYPE%>"/>
<html:hidden property="<%=NewHoldForm.FIELD_SITE_CHANGED%>"/>
<html:hidden property="<%=NewHoldForm.FIELD_MEDIA_DELIVERY_METHOD_CHANGED%>"/>
<html:hidden property="<%=NewHoldForm.PARAM_ORIGINAL_MEDIA_SITE_ID%>"/>
<% if (!form.isShowingDeliveryMethod()) { %>
<html:hidden property="<%=NewHoldForm.FIELD_DELIVERY_METHOD_TYPE_ILL%>"/>
<% } %>

<input type="hidden" name="<%=NewHoldForm.BUTTON_CHANGE_HOLD_OR_RESERVE%>" value="false"/>
<input type="hidden" name="<%=NewHoldForm.BUTTON_CHANGE_ANY_OR_SPECIFIC%>" value="false"/>
<input type="hidden" name="<%=NewHoldForm.BUTTON_CHANGE_SITE_OR_PARTICIPATING%>" value="false"/>
<input type="hidden" name="<%=HoldRequestForm.PARAM_MONTH%>" value="">
<input type="hidden" name="<%=HoldRequestForm.PARAM_DAY%>" value="">
<input type="hidden" name="<%=HoldRequestForm.PARAM_YEAR%>" value="">
<input type="hidden" name="<%=NewHoldForm.PARAM_MEDIA_SEARCH_TERM%>" value="">
<logic:equal name="<%=NewHoldForm.FORM_NAME%>" property="blockCondition" value="true" scope="request">
    <base:messageBox showRedBorder="true">
    <tr>
        <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
        <td valign="baseline" class="Error"><center><ul>
        <%=MessageHelper.formatMessage("NewHoldForm_PatronHasExceededTheMaximumHolds")%>
        </ul></center>
            <p align="center"><%= MessageHelper.formatMessage("newholds_AreYouSureYouWantToRequestThisHold") %></p>
            <div align="center">
                <base:yesNo 
                    buttonYesName="<%=NewHoldForm.BUTTON_OVERRIDE_BLOCK%>"
                    buttonNoName="<%=NewHoldForm.BUTTON_CANCEL_BLOCK%>"
                />
            </div>
        </td>
    </tr>
    </base:messageBox>
</logic:equal>

<logic:present name="<%=NewHoldForm.FORM_NAME%>" property="holdMessageHeader">
    <base:imageSpacer width="1" height="3"/>
    <base:messageBox>
        <tr valign="top" align="center">
            <td class="ColRowBold" align="center"><bean:write name="<%=NewHoldForm.FORM_NAME%>" property="holdMessageHeader"/></td>
        </tr>
    <logic:present name="<%=NewHoldForm.FORM_NAME%>" property="holdMessage">
        <tr align="center">
            <td class="ColRow" align="center"><bean:write name="<%=NewHoldForm.FORM_NAME%>" property="holdMessage"/></td>
        </tr>
    </logic:present>
    </base:messageBox>
    <base:imageSpacer width="1" height="3"/>
</logic:present>


<table border="0" cellspacing="0" cellpadding="0" id="<%=NewHoldForm.TABLE_FIND_TITLE%>">
    <tr>
        <td class="FormLabel">
            <logic:equal name="<%= NewHoldForm.FORM_NAME %>" property="findTitleBased" value="false" scope="request">
                <%= MessageHelper.formatMessage("newholds_FindPatron") %>&nbsp;<html:hidden property="<%= NewHoldForm.FIELD_SEARCH_TYPE %>" value="<%= String.valueOf(KeywordSearchFacadeSpecs.TYPE_TITLE) %>"/>
            </logic:equal>
            <logic:equal name="<%= NewHoldForm.FORM_NAME %>" property="findTitleBased" value="true" scope="request">
             <!-- isShowSearchTypeList checks if it is a media booking or not, if statement could be changed for improving hold/ILL searching -->
                <% if (form.isShowSearchTypeList()) { %>
                    <%= MessageHelper.formatMessage("newholds_Find") %>&nbsp;<html:select property="<%= NewHoldForm.FIELD_SEARCH_TYPE %>" value="<%= form.getSearchType().toString()%>">
                        <html:options collection="searchTypeOptions" property="longID" labelProperty="stringDesc"/>
                    </html:select>&nbsp;
                <% } else { %>
                    <%= MessageHelper.formatMessage("newholds_Find") %>&nbsp;<html:select property="<%= NewHoldForm.FIELD_SEARCH_TYPE %>" value="<%= form.getSearchType().toString()%>">
                        <html:options collection="searchTypeOptionsHoldILL" property="longID" labelProperty="stringDesc"/>
                    </html:select>&nbsp;
                <% } %>
            </logic:equal>
        </td>
        <td>
            <html:text property="<%=NewHoldForm.FIELD_SEARCH_STRING%>"/>
        </td>
        <% if (form.isShowSearchScopeList()) { %>
            <td class="FormLabel">&nbsp;<%= MessageHelper.formatMessage("newholds_In") %>&nbsp;</td>
            <td>
                <html:select  property="<%= NewHoldForm.FIELD_SEARCH_SCOPE %>"  value="<%= form.getSearchScope().toString()%>">
                    <html:options collection="searchScopeOptions" property="longID"
                              labelProperty="stringDesc"/>
                </html:select>
            </td>
        <% } else { %>
            <td></td>
            <td>
                <html:hidden property="<%= NewHoldForm.FIELD_SEARCH_SCOPE %>" value="<%= SiteTypeSpecs.SITE_TYPE_ID_MY_LIBRARY.toString() %>"/>
            </td>
        <% } %>
        <td nowrap>
            &nbsp;
            <base:goButton/>
            <base:imageSpacer width="30" height="1"/>
            <base:cancelButton/>
        </td>
    </tr>
    <logic:equal name="<%= NewHoldForm.FORM_NAME %>" property="findTitleBased" value="false" scope="request">
    <tr>
        <td colspan="5" class="ColRow">
            &nbsp;&nbsp;
            <% if (store.isDistrictCircAllowed(BibMasterSpecs.COLLECTION_TYPE_LIBRARY)) { %>
                <html:checkbox property="<%=BaseCircForm.FIELD_SEARCH_ONLY_LOCAL_PATRONS%>"><%= MessageHelper.formatMessage("newholds_OnlyMyPatrons") %></html:checkbox>
            <% } else { %>
                <html:hidden property="<%=BaseCircForm.FIELD_SEARCH_ONLY_LOCAL_PATRONS%>" value="true"/>
            <% } %>
            <base:patronLookup/>
        </td>
    </tr>
    </logic:equal>
</table>

<br>
<%  if (request.getAttribute("copylist") != null && !form.isMediaBookingUser()) {
    request.setAttribute("parentFormName", "circulation_servlet_NewHoldForm");
%>
        <jsp:include page="/circulation/holdillsearchresultsdata.jsp" flush="true"/>
<%
    } else if (request.getAttribute("copylist") != null && form.isMediaBookingUser()){
    //This is to fix media bookings as bookings only touch on the newholds.jsp at a couple places.
%>

<br>
    <table id="<%=NewHoldForm.TABLE_COPY_FIND%>" width="100%" cellspacing="0" cellpadding="2">
        <% if (form.isShowSearchTypeList()) { %>
        <tr>
            <td colspan="2" class="ColRowBold"><%= form.buildMediaSearchTermMessage() %></td>
        </tr>
        <% } %>
        <tr>
            <td colspan="2"><IMG height="2" vspace="1" src="/images/icons/general/line.gif" width="100%"></td>
        </tr>

        <jsp:include page="/common/titlelist.jsp">
            <jsp:param name="formName" value="<%= NewHoldForm.FORM_NAME %>"/>
            <jsp:param name="showAvailability" value="true"/>
            <jsp:param name="quantity" value="<%= form.getQuantity() %>"/>
        </jsp:include>
    </table>
    <br>
<% } %>

<br>

<%  if (request.getAttribute("patronlist") != null) { %>
        <jsp:include page="/circulation/patronlist.jsp">
            <jsp:param name="formName" value="<%= NewHoldForm.FORM_NAME %>"/>
            <jsp:param name="districtSearch" value='<%= "" + !form.isSearchLocalPatronsOnly() %>'/>
        </jsp:include>
        <br>
    <c:if test="${cForm.nonLinkedPatronCount > 0}">
            <table width="95%" align="center">
                <tr>
                    <td class="Instruction">* <%= MessageHelper.formatMessage("newholds_ThisPatronBelongsToASiteThatCanNotBookMediaFromThisSiteDueToDeliverySettings") %></td>
                </tr>
            </table>
            <br/>
        </c:if>
<% } %>


<%
    PatronInfoBean pib = (PatronInfoBean)request.getAttribute("patronInfoBean");
if ((pib != null)) {
    	if(form.isCanViewHiddens()){
%>
<table cellSpacing="1" cellPadding="0" width="95%" bgColor="#c0c0c0" border="0">
    <tr>
        <td valign="top" width="100%" bgColor="#ffffff">
        <jsp:include page="/circulation/circinfo.jsp" flush="true" >
            <jsp:param name="hideBorderTable" value="true"/>
            <jsp:param name="disableLinkHolds" value="true"/>
            <jsp:param name="useAbbreviatedView" value="true"/>
        </jsp:include>
   

<logic:equal name="<%= NewHoldForm.FORM_NAME %>" property="dataAvailable" value="true" scope="request">

    <table id="<%=NewHoldForm.TABLE_HOLD_TITLE%>" width="100%">
        <tr>
            <td colspan="7">
                <table border="0" cellpadding="2" cellspacing="0" width="100%">
                <tr>
                    <base:sectionHeading printerFriendly="false" heading='<%=MessageHelper.formatMessage("newholds_Requesting") %>' tdContent="width='100%'"/>                    
                </tr>
                </table>
            </td>
        </tr>        
        <tr class="ColRowBold">
            <c:choose>
                <c:when test="${cForm.holdOrReserve != optionHold || cForm.titleCollectionType == collectionTypeMedia}">
                    <td class="FormHeading" colspan="2"><%= MessageHelper.formatMessage("newholds_From_site") %>
                        <c:choose>
                            <c:when test="<%= form.isDisplaySiteComboBox() %>">
                                <bean:define id="sites" name="<%=NewHoldForm.FORM_NAME%>" property="<%=NewHoldForm.PARAM_SITES%>"/>
                                <html:select property="<%=NewHoldForm.FIELD_SITE_ID%>" onchange="siteSelected()">
                                        <html:options collection="sites" property="longID" labelProperty="stringDesc"/>
                                </html:select>  
                                </c:when>
                                <c:otherwise>
                                    <bean:write property="<%=NewHoldForm.PARAM_DEFAULT_SITE_NAME%>" name="<%=NewHoldForm.FORM_NAME%>" filter="true"/>
                                    <html:hidden property="<%=NewHoldForm.FIELD_SITE_ID%>"/>    
                                </c:otherwise>
                        </c:choose>
                        &nbsp;
                        <%if((form.getTitleCollectionType() == CollectionType.MEDIA) && !form.isFollettEBook()){ %>
                            <bean:define id="deliveryTypes" name="<%=NewHoldForm.FORM_NAME%>" property="<%=NewHoldForm.PARAM_MEDIA_DELIVERY_TYPES%>"/>
                            <html:select property="<%=NewHoldForm.FIELD_MEDIA_DELIVERY_TYPE%>" onchange="deliveryMethodSelected();">
                                    <html:options collection="deliveryTypes" property="longID" labelProperty="stringDesc"/>
                            </html:select>  
                        <%} %>                      
                    </td>
                </c:when>
                <c:otherwise>
                    <td>
                        <html:hidden property="<%=NewHoldForm.FIELD_SITE_ID%>"/>    
                    </td>
                </c:otherwise>
            </c:choose>
            <td colspan="2" valign="top" class="ColRowBold tdAlignRight" nowrap>
                &nbsp;
            </td>
        </tr>
        <c:if test="${cForm.showingDeliveryMethod}">
            <tr>
                <td class="ColRowBold" colspan="2"><%= MessageHelper.formatMessage("newholds_DeliveryMethod") %>&nbsp;<html:select property="<%=NewHoldForm.FIELD_DELIVERY_METHOD_TYPE_ILL%>" value ='<%=form.getDeliveryMethodTypeILL() + ""%>'>
                        <html:options collection="deliveryMethods" property="value" labelProperty="desc"/>
                    </html:select>
                </td>
            </tr>
        </c:if>
        <tr>
        
        <!-- This <choose> is to prevent the 'request expires' field from wrapping for holds.  -->
        <c:choose>
            <c:when test="${cForm.titleCollectionType == collectionTypeMedia || 
                    (cForm.titleCollectionType == collectionTypeLibrary && cForm.holdOrReserve == optionReserve)}">
                <td  valign="top" width="100%">                    
            </c:when>                 
            <c:otherwise>
                <td colspan="2" valign="top" width="100%">                    
            </c:otherwise>
        </c:choose>

            <table id="<%=NewHoldForm.TABLE_HOLD_OR_RESERVE%>" width="100%">
              <tr> <!-- title info stuff -->
                <td> <!-- icon -->
                  <bean:write property="bibMaterialTypeImgTag" name="<%=NewHoldForm.FORM_NAME%>" filter="false"/>
                </td>
                <td class="TableHeading2"> <!-- bib title - 245 subfield a -->
                  <%=ResponseUtils.filter(form.getTitle())%>
                   <logic:equal name="<%= NewHoldForm.FORM_NAME %>" property="temporaryCopy" value="true" scope="request">
                    <base:image src="/icons/materialtype/temp.gif" width="19" height="16" alt='<%= MessageHelper.formatMessage("newholds_Temporary") %>'/>
                   </logic:equal>
                </td>
              </tr>
              <tr>
                <td></td>
                <td class="ColRow"> <!-- bib author - 245 subfield c-->
                  <%=ResponseUtils.filter(form.getAuthor())%>
                </td>
              </tr>
            <c:if test="${cForm.titleCollectionType != collectionTypeMedia}">
                  <tr>
                    <td></td>
                    <td class="ColRowBold">
                      <html:select property="<%=NewHoldForm.FIELD_SELECT_HOLD_OR_RESERVE%>" onchange="submitHoldOrReserveDropDown()">
                        <html:option value="<%=NewHoldForm.OPTION_HOLD_VALUE%>"><%= MessageHelper.formatMessage("newholds_AsSoonAsPossible") %></html:option>
                        <html:option value="<%=NewHoldForm.OPTION_RESERVED_VALUE%>"><%= MessageHelper.formatMessage("newholds_ReserveForSpecificDate") %></html:option>
                      </html:select>
                    </td>
                  </tr>
                  <c:if test="${cForm.holdOrReserve == optionHold}">
                      <% List list = form.getCopiesForTitleList(); %>
                      <c:choose>
                        <c:when test="${fn:length(cForm.copiesForTitleList) == 0}">
                            <!-- Set some required hidden fields  -->
                            <html:hidden property="<%=NewHoldForm.FIELD_SELECT_PRIORITY%>"/>
                            <html:hidden property="<%=NewHoldForm.FIELD_EXPIRES_DISPLAYABLE%>"/>
                                   <input type="hidden" name="<%=NewHoldForm.FIELD_ANYCOPY%>" value="anyCopy"/>   
                        </c:when>
                        <c:otherwise>
                          <!-- There was at least one copy avail locally  -->
                          <tr>
                            <td>&nbsp;</td>
                            <td>
                                <table border="0" id="<%=NewHoldForm.TABLE_NEW_REQUEST%>" cellspacing="0" cellpadding="4" width="100%">
                                    <tr>  <!-- Priority Stuff -->
                                        <td class="ColRow" colspan="5">
                                            &nbsp;&nbsp;<%= MessageHelper.formatMessage("newholds_Priority") %>&nbsp;<%=DisplayFormatter.getHoldPrioritySelectBox(form.getSelectPriority().intValue())%>
                                            &nbsp;&nbsp;&nbsp;
                                            <%= MessageHelper.formatMessage("newholds_RequestExpires") %>&nbsp;
                                            <base:date 
                                                buttonName = "<%=NewHoldForm.BUTTON_CHANGE_DATE%>"
                                                fieldName = "<%=NewHoldForm.FIELD_EXPIRES_DISPLAYABLE%>"
                                                dateValue = "<%=form.getExpiresDisplayable()%>"
                                                altText = '<%= MessageHelper.formatMessage("newholds_ChangeRequestExpirationDate") %>'
                                            />
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="5" class="ColRow">&nbsp;&nbsp;
                                        <html:select property = "<%=NewHoldForm.FIELD_ANY_OR_SPECIFIC_COPY%>" onchange="submitAnyOrSpecificDropDown()"> 
                                        <html:option value = "<%=NewHoldForm.OPTION_ANY_COPY%>"><%= MessageHelper.formatMessage("newholds_AnyCopy") %></html:option>
                                        <c:if test="${cForm.isLocalSite}">
                                            <html:option value = "<%=NewHoldForm.OPTION_SPECIFIC_COPY%>"><%= MessageHelper.formatMessage("newholds_SpecificCopy") %></html:option>
                                        </c:if>
                                        </html:select>
                                        </td>
                                    </tr>
                                    <c:choose>
                                        <c:when test="${(cForm.anyOrSpecificCopy == optionSpecificCopy) && (cForm.isLocalSite)}">
                                            <c:if test="${cForm.isAnyCopiesForTitle}">
                                                <tr>
                                                    <td class="SmallColHeading">&nbsp;</td>
                                                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("newholds_Call") %></td>
                                                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("newholds_Barcode") %></td>
                                                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("newholds_Status") %></td>
                                                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("newholds_Description") %></td>
                                                </tr>
                                                <%
                                                    for ( int itr = 0; itr < list.size(); itr++ ) {
                                                        HashMap map = ( HashMap ) list.get( itr );
                                                %>
                                                        <tr valign="top">
                                                <%
                                                        String barcode = (String)map.get("COPYBARCODE");
                                                        
                                                        barcode = StringHelper.isEmpty(barcode) ? "" : barcode;
                                                        
                                                        barcode = BarcodeHelper.getTruncatedBarcode(barcode);
                
                                                        String callNumber = (String)map.get("CALLNUMBER");
                                                        callNumber = StringHelper.isEmpty(callNumber) ? "" : callNumber;
                                                %>
                                                    <td class="ColHeading">
                                                        <% String copyParm = ( ( Long ) map.get( "COPYID" ) ).toString(); %>
                                                        &nbsp;&nbsp;<html:radio property="<%=NewHoldForm.FIELD_ANYCOPY%>" value="<%=copyParm%>" />
                                                    </td>
                                                    <td class="ColRow">
                                                        <%=ResponseUtils.filter(callNumber)%>&nbsp;
                                                    </td>
                                                    <td class="ColRow">
                                                        <%=ResponseUtils.filter(barcode)%>&nbsp;
                                                    </td>
                                                    <td class="ColRow">
                                                        <%=ResponseUtils.filter(
                                                            CopySpecs.getCopyStatusAsString(
                                                                (Long) map.get( "STATUS" ) ) )%>&nbsp;
                                                    </td>
                                                    <td class="ColRow">
                                                        <%=ResponseUtils.filter( CopyHelper.formatAllDescEnums( map ) )%>&nbsp;
                                                    </td>
                                                </tr>
                
                                                <% } %>
                                            </c:if>
                                        </c:when>
                                        <c:otherwise>
                                            <html:hidden value="<%=NewHoldForm.OPTION_ANY_COPY %>" property = "<%=NewHoldForm.FIELD_ANYCOPY%>"></html:hidden>
                                        </c:otherwise>
                                        </c:choose>
                                   </table>
                             </td>
                          </tr>
                        </c:otherwise>
                      </c:choose>
                  </c:if> <%-- ending for if "As soon as possible" is selected --%>
             </c:if> <%-- above is for when NOT a media booking type hold --%>
    
            <c:choose>
                <c:when test="${cForm.titleCollectionType == collectionTypeMedia || 
                    (cForm.titleCollectionType == collectionTypeLibrary && cForm.holdOrReserve == optionReserve) ||
                    (cForm.holdOrReserve == optionHold && cForm.canHoldMultipleCopiesForPatron && cForm.anyOrSpecificCopy != optionSpecificCopy && cForm.copiesOwned > 1 && cForm.searchScope == siteTypeMyLibrary)}">
                  <tr>
                    <td></td>
                    <td class="ColRowBold">
    					<%= MessageHelper.formatMessage("newholds_CopiesOwned0", Long.valueOf(form.getCopiesOwned())) %>
                        <base:helpTag helpFileName="d_holds_new_hold_req_copies_def.htm"/>
                    </td>
                  </tr>
                  <tr>
                    <td></td>
                     <td class="ColRowBold">
                       <c:choose>
                        <c:when test="${cForm.titleCollectionType == collectionTypeMedia}">
                            <%= MessageHelper.formatMessage("newholds_Book") %>
                        </c:when>
                        <c:when test="${cForm.holdOrReserve == optionHold}">
                            <%= MessageHelper.formatMessage("newholds_Hold") %>
                        </c:when>
                        <c:otherwise>
                            <%= MessageHelper.formatMessage("newholds_Reserve") %>
                        </c:otherwise>
                       </c:choose>
                       <%if(form.isFollettEBook()){%>&nbsp;1<%}else{ %>
                           &nbsp;<html:text property="<%=HoldRequestForm.FIELD_QUANTITY%>" size="2" maxlength="2"/>
                           <c:if test="${cForm.titleCollectionType == collectionTypeMedia || cForm.holdOrReserve == optionReserve}">
                                &nbsp;<base:genericButton absbottom="true" src="/buttons/small/refreshcalendar.gif" name="<%= NewHoldForm.BUTTON_REFRESH_CALENDAR %>" alt='<%=MessageHelper.formatMessage("newholds_RefreshCalendar") %>'/>
                           </c:if>
                           <%quantityWritten=true; %>
                       <%} %>
                     </td>
                  </tr>
                  <c:if test="${cForm.titleCollectionType == collectionTypeMedia || cForm.holdOrReserve == optionReserve}">
                      <tr>
                        <td></td>
                        <td class="ColRowBold">
                          <html:hidden property="<%=NewHoldForm.FIELD_SELECT_HOLD_OR_RESERVE%>" value="<%=NewHoldForm.OPTION_RESERVED_VALUE%>"/>
                          <%= MessageHelper.formatMessage("newholds_From") %>&nbsp;<html:text property="<%=DateRangeTag.FIELD_DATE_FROM%>" size="9" maxlength="10"/>&nbsp;<%= MessageHelper.formatMessage("newholds_To") %>&nbsp;<html:text property="<%=DateRangeTag.FIELD_DATE_TO%>" size="9" maxlength="10"/>
                       </td>
                     </tr>
                  </c:if>
                  <c:if test="${cForm.titleCollectionType == collectionTypeMedia}">
                      <tr>
                        <td/>
                        <td class="ColRow"><%=form.buildMaxLoanPeriodString()%>
                        </td>
                      </tr>
                      <base:spanIfAllowed permission='<%= Permission.CIRC_OVERRIDE_MEDIA_POLICIES %>'>
                      <c:if test="${cForm.isLocalSite}">
                      <tr>
                        <td/>
                        <td class="ColRow">
                          <html:checkbox name="<%=NewHoldForm.FORM_NAME%>" property="<%=NewHoldForm.FIELD_OVERRIDE_MEDIA_LOAN_PERIOD%>"/><%= MessageHelper.formatMessage("newholds_OverrideMediaPolicy") %></td>
                      </tr>
                    </c:if>
                    </base:spanIfAllowed>
                  </c:if>
                  </c:when>
              </c:choose>
              <c:if test="${(cForm.titleCollectionType == collectionTypeLibrary && cForm.holdOrReserve != optionReserve && !cForm.canHoldMultipleCopiesForPatron)}">
                <html:hidden property="<%=HoldRequestForm.FIELD_QUANTITY%>" />
                <html:hidden property="<%=HoldRequestForm.FIELD_COPIES_OWNED%>" />
               <%quantityWritten=true; %>
              </c:if>
            </table>
          </td>
          <c:if test="${cForm.titleCollectionType == collectionTypeMedia || 
                    (cForm.titleCollectionType == collectionTypeLibrary && cForm.holdOrReserve == optionReserve)}">
            <base:bookingCalendar formName="<%= NewHoldForm.FORM_NAME %>" patronID="<%= pib.getPatronID() %>"/>
       
          
          </c:if>
          
          <tr>
          <td colspan="3" align="center">
                <base:showHideTag id="onSaveTop">
                <base:saveButton onclick="hideElementonSaveTop()" name="<%= HoldRequestForm.BUTTON_SAVE_HOLD %>"/>
                <base:cancelButton/>
                </base:showHideTag>
          </td>
          </tr>
          
    </table>
</logic:equal> <!-- dataAvailable==true -->

        </td>
    </tr>
</table> <!-- end border table -->

<%}
} %> <!-- END: There was no patron on the request -->


<% if ( !quantityWritten ) {%>
    <html:hidden property="<%=HoldRequestForm.FIELD_QUANTITY%>"/>
<% } %>

</base:form>
<script language="JavaScript" type="text/javascript">
<!--

function siteSelected() {
    document.<%=NewHoldForm.FORM_NAME%>.<%=NewHoldForm.FIELD_SITE_CHANGED%>.value = "true";
    document.<%=NewHoldForm.FORM_NAME%>.submit();
}

function deliveryMethodSelected() {
    document.<%=NewHoldForm.FORM_NAME%>.<%=NewHoldForm.FIELD_MEDIA_DELIVERY_METHOD_CHANGED%>.value = "true";
    document.<%=NewHoldForm.FORM_NAME%>.submit();
}

//-->
</script>
