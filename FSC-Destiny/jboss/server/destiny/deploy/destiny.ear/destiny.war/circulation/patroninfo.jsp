<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@ page import="java.util.*"%>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.util.*"%>
<%@ page import="com.follett.fsc.destiny.session.common.*"%>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.*"%>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.PatronInfoForm" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.TextbookClassSectionSpecs" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.PatronSpecs" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.HoldVO" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.jsptag.PatronInfoCustodianItemsTag" %>
<%@ page import="com.follett.fsc.common.LocaleHelper" %>
<%@ page import="com.follett.fsc.destiny.util.URLHelper" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@page import="com.follett.fsc.destiny.entity.ejb3.FollettEBookBookingVO"%>


<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<base:messageBox strutsErrors="true"/>
<bean:define id="form" name="<%= PatronInfoForm.FORM_NAME %>" type="PatronInfoForm"/>
<c:set var="form" value="<%=form%>"/>

<%
    //Do some stuff that is required throughout the entire JSP
//    PatronInfoForm form = (PatronInfoForm)request.getAttribute(PatronInfoForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    boolean userInfoOnly = form.isUserInfoOnly();
    Long patronID = form.getPatronID();
    String focusControl = form.gimmeFocusControl();  
    
    String editURL = "/backoffice/servlet/presenteditpatrongeneralinfoform.do?action=Edit";

    if (patronID!=null){
        editURL = URLHelper.addHREFParam(editURL, "patronID", patronID);
    }
    String blockMessages = (String) request.getAttribute("blocklist");
    %>


    <SCRIPT LANGUAGE="javascript" TYPE="text/javascript">
    <!--

        function printerFriendly() {
            //Set the variables dynamically based on the current values on the form
            var userInfoOnly = "<%=userInfoOnly%>";
            var phoneNumbers = "";
            var titles = "";
            if ( userInfoOnly == "false" ) {
                phoneNumbers = document.circulation_servlet_PatronInfoForm.showPhoneNumbers.checked;
                titles = document.circulation_servlet_PatronInfoForm.showTitles.checked;
            } else {
                titles = "true";
            }
            var siteID = <%= store.getSiteID() %>;
            var patronID = <%=patronID%>;

            //Build the URL based on the fields in the form
            var url = '/circulation/servlet/handlepatroninfoform.do?site=' + siteID;
            if ( userInfoOnly == "false" ) {
                url = url + '&showPhoneNumbers=' + phoneNumbers;
            }

            url = url + '&showTitles=' + titles;
            <% if ( form.getExpandedCustodianAssetBibID() != null) { %>
                var expandedBibID = <%= form.getExpandedCustodianAssetBibID() %>;
                url = url + "&<%=PatronInfoCustodianItemsTag.ID_BUTTON_CUSTODIAN_SHOW_MORE%>" + expandedBibID + ".x=" + expandedBibID;
            <% } %>
            url = url + '&printerFriendly=true' +
                '&userInfoOnly=' + userInfoOnly +
                '&patronID=' + patronID;

            //Open the new window
            window.open(url, 'printerFriendly').focus();
        }

    // -->
    </SCRIPT>


<jsp:include page="/circulation/renewallsummary.jsp"/>

<base:form action="/circulation/servlet/handlepatroninfoform.do" focus="<%=focusControl%>">
<html:hidden property="patronID" />
<html:hidden property="noteID" />
<html:hidden property="userInfoOnly" />
<html:hidden property="classID" />
<html:hidden property="collectionTypeForFines" />

<!-- delete hold confirmation -->
<%
    if (form.getHoldInfo() != null) {
        HoldVO hv = form.getHoldInfo().getHoldValue();
        String title = ResponseUtils.filter(form.getHoldInfo().getTitle());
%>
        <html:hidden property="holdID"/>
        <base:messageBox showRedBorder="true">
        <tr>
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td valign="baseline" class="Error" align="center">
                <% if  (hv.getReserveStartDate() == null) {%>
                    <%=MessageHelper.formatMessage("patroninfo_AreYouSureYou2", title)  %>
                <% } else { %>
                    <%=MessageHelper.formatMessage("patroninfo_AreYouSureYou", title, hv.getReserveStartDate(), hv.getExpireDate())  %>
                <% }  %>
                <div>
                    <base:yesNo 
                        buttonYesName="<%=PatronInfoForm.ACTION_CONFIRM_DELETE_HOLD%>"
                        buttonNoName="<%=PatronInfoForm.ACTION_CONFIRM_DELETE_HOLD_NO%>"
                    />
                </div>
            </td>
        </tr>
        </base:messageBox>
<%
    }
%>
<!-- delete Follett eBook booking confirmation -->
<%
    if (form.getFollettEBookBookingInfo() != null) {
        FollettEBookBookingVO theValue = form.getFollettEBookBookingInfo().getFollettEBookBookingValue();
        String title = ResponseUtils.filter(form.getFollettEBookBookingInfo().getTitle());
%>
        <html:hidden property="holdID"/>
        <base:messageBox showRedBorder="true">
        <tr>
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td valign="baseline" class="Error" align="center">
                <%=MessageHelper.formatMessage("patroninfo_AreYouSureYou", title, theValue.getDateFrom(), theValue.getDateTo())  %>
                <div>
                    <base:yesNo 
                        buttonYesName="<%=PatronInfoForm.ACTION_CONFIRM_DELETE_FOLLETT_EBOOK_BOOKING%>"
                        buttonNoName="<%=PatronInfoForm.ACTION_CONFIRM_DELETE_FOLLETT_EBOOK_BOOKING_NO%>"
                    />
                </div>
            </td>
        </tr>
        </base:messageBox>
<%
    }
%>
<!-- block confirmation -->
<%
    if ( (blockMessages != null) && (form.getBookingCopyBarcode() != null)) {
%>

        <br>
        <base:messageBox showRedBorder="true">
        <tr>
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td valign="baseline" class="Error">
                <bean:write name="<%=  PatronInfoForm.FORM_NAME %>" property="blockedCopy"/> <%= MessageHelper.formatMessage("patroninfo_TransactionBlocked", blockMessages) %>
                <html:hidden property="<%=BasePatronListForm.PARAM_BOOKING_CHECKOUT_BARCODE%>"/>
                <p align="center"><%= MessageHelper.formatMessage("patroninfo_DoYouWantToCompleteThisTransaction") %></p>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold" align="center" colspan="2">
                <base:showHideTag id="onBlock">
                <html:submit property="<%=BasePatronListForm.BUTTON_NAME_YES_BOOKING_CHECKOUT%>"  onclick="hideElementonBlock()"><%= MessageHelper.formatMessage("patroninfo_Yes") %></html:submit>&nbsp;<html:submit property="<%=PatronInfoForm.BUTTON_NAME_CANCEL_CHECKOUT%>"><%= MessageHelper.formatMessage("patroninfo_No") %></html:submit>
                </base:showHideTag>
            </td>
        </tr>
        </base:messageBox>
    <br>

<%
    }
    // need to handle when the patron can not override blocks
    // i.e. no permission or we are on My Info
%>
<!-- block confirmation -->
<%
    if ( (blockMessages != null) && (form.getCopyIDToRenew() != null || form.isRenewAll()) && !form.isUserInfoOnly()) {
%>

        <br>
        <base:messageBox showRedBorder="true">
        <tr>
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td valign="baseline" class="Error">
                <bean:write name="<%=  PatronInfoForm.FORM_NAME %>" property="blockedCopy"/> <%= MessageHelper.formatMessage("patroninfo_TransactionBlocked", blockMessages) %>
                <html:hidden property="copyIDToRenew"/>
                <html:hidden property="blockMessages"/>
                <html:hidden property="renewAll"/>
                <html:hidden property="renewAllIsTextbooks"/>
                <p align="center"><%= MessageHelper.formatMessage("patroninfo_DoYouWantToCompleteThisTransaction") %></p>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold" align="center" colspan="2">
                <base:showHideTag id="onBlock">
                <html:submit property="<%=PatronInfoForm.BUTTON_NAME_OVERRIDE_BLOCKS%>" onclick="hideElementonBlock()"><%= MessageHelper.formatMessage("patroninfo_Yes") %></html:submit>&nbsp;<html:submit property="<%=PatronInfoForm.BUTTON_NAME_CANCEL_CHECKOUT%>"><%= MessageHelper.formatMessage("patroninfo_No") %></html:submit>
                </base:showHideTag>
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

<!-- ILL CHECKOUT block confirmation -->
<%
    if ( (blockMessages != null) && (form.getCopyIDToCheckout() != null) && !form.isUserInfoOnly()) {
%>

        <br>
        <base:messageBox showRedBorder="true">
        <tr>
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td valign="baseline" class="Error">
                <bean:write name="<%=  PatronInfoForm.FORM_NAME %>" property="blockedCopy"/> <%= MessageHelper.formatMessage("patroninfo_TransactionBlocked", blockMessages) %>
                <html:hidden property="copyIDToCheckout"/>
                <html:hidden property="action"/>
                <html:hidden property="holdID"/>
                <html:hidden property="patronID"/>
                <html:hidden property="blockMessages"/>
                <p align="center"><%= MessageHelper.formatMessage("patroninfo_DoYouWantToCompleteThisTransaction") %></p>
                <div align="center">
                	<base:yesNo 
                        buttonYesName="<%=PatronInfoForm.ACTION_OVERRIDE_ILL_BLOCKS%>"
                        buttonNoName="<%=PatronInfoForm.ACTION_CANCEL_ILL_CHECKOUT%>"
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
<!-- END block ILL CHECKOUT confirmation -->

<!-- lost copies confirmation -->
<logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="confirmLostCopies" value="true">
<html:hidden property="defaultLostFineAmount" />
<html:hidden property="lostCopyID" />
    <base:messageBox showRedBorder="true">
    <tr>
        <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
        <td valign="baseline" class="Error">
                <%if ( !form.isLostButtonPressedForAssetCopy() ) { %>
                    <%= MessageHelper.formatMessage("patroninfo_TheCopyWillBeMarkedAsLost") %><br>
                <% } else { %>
                    <%= MessageHelper.formatMessage("patroninfo_TheItemWillBeMarkedAsLost") %><br>
                <% } %>  
                <% if ( form.isAllowLostFineEntry() &&  ! form.isMediaBookingUser() ) { %>
                    <bean:write name='<%= PatronInfoForm.FORM_NAME %>' property="patronDisplayName"/>
                    <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="visitor" value="true">
                        <font color="#cc0000">[<%= ResponseUtils.filter(form.getSiteShortName()) %>]</font>
                    </logic:equal>
                    <%= MessageHelper.formatMessage("patroninfo_BarcodeWillBeChargedAFineOf", form.getPatronBarcode())%>
                    <base:spanIfAllowed permission='<%=form.getPermissionForMakingACopyLostWithFine() %>'>
                        <html:text property="userLostFineAmount" size="10" maxlength="9"/>.
                        <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="stateFineScheduleApplied" value="true">
                            <!-- I18N DO NO LOCALIZE - Textbook Manager message -->
                            According to the state fine schedule, a percentage of <%=form.getStateFinePercentageDisplayable() %> was applied to the
                            original price of <bean:write name='<%= PatronInfoForm.FORM_NAME %>' property="stateFineOriginalPrice"/><logic:notPresent name='<%= PatronInfoForm.FORM_NAME %>' property ="stateInventoryYearUsed" >.</logic:notPresent>
                            <logic:present name='<%= PatronInfoForm.FORM_NAME %>' property ="stateInventoryYearUsed" >
                              based on Inventory year <bean:write name='<%= PatronInfoForm.FORM_NAME %>' property="stateInventoryYearUsed"/>.
                            </logic:present>
                        </logic:equal>
                        <%= MessageHelper.formatMessage("patroninfo_IfYouDoNotWantToAssessAFineSetTheFineAmountToZero") %>                    
                    </base:spanIfAllowed>
                    <base:spanIfNotAllowed permission='<%=form.getPermissionForMakingACopyLostWithFine() %>'>
                        <bean:write name='<%= PatronInfoForm.FORM_NAME %>' property="userLostFineAmount"/>.
                        <html:hidden property="userLostFineAmount"/>
                        <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="stateFineScheduleApplied" value="true">
                            <!-- I18N DO NO LOCALIZE - Textbook Manager message -->
                            According to the state fine schedule, a percentage of <%=form.getStateFinePercentageDisplayable() %> was applied to the
                            original price of <bean:write name='<%= PatronInfoForm.FORM_NAME %>' property="stateFineOriginalPrice"/><logic:notPresent name='<%= PatronInfoForm.FORM_NAME %>' property ="stateInventoryYearUsed" >.</logic:notPresent>
                            <logic:present name='<%= PatronInfoForm.FORM_NAME %>' property ="stateInventoryYearUsed" >
                              based on Inventory year <bean:write name='<%= PatronInfoForm.FORM_NAME %>' property="stateInventoryYearUsed"/>.
                            </logic:present>
                        </logic:equal>
                    </base:spanIfNotAllowed>
                <% } else { %>
                     <html:hidden property="userLostFineAmount" value="0.00"/>
                <% } %>
                <logic:notEmpty name='<%=PatronInfoForm.FORM_NAME %>' property="currencyCodeMessage">
                    <html:hidden property="currencyCodeMessage"/>
                    </td></tr><tr><td>&nbsp;</td><td valign="baseline" class="Error"><bean:write filter="false" name='<%= PatronInfoForm.FORM_NAME %>' property="currencyCodeMessage"/></td></tr><tr><td>&nbsp;</td><td>                               
                </logic:notEmpty>
                
                <base:showHideTag id="onLost">
                  <p align="center"><base:okButton name="<%= PatronInfoForm.BUTTON_NAME_MARK_LOST_OK %>" onclick="hideElementonLost()"/><base:cancelButton name="<%= PatronInfoForm.BUTTON_NAME_MARK_LOST_CANCEL %>"/></p>
                </base:showHideTag>
        </td>
    </tr>
    </base:messageBox>
</logic:equal>
<!-- lost copies confirmation -->

<!-- stolen copies confirmation -->
<logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="confirmStolenCopies" value="true">
<html:hidden property="stolenCopyID" />
    <base:messageBox showRedBorder="true">
    <tr>
        <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
        <td valign="baseline" class="Error"><%= MessageHelper.formatMessage("patroninfo_TheItemWillBeMarkedAsStolen") %><br><br>
          <base:showHideTag id="onStolen">
            <p align="center"><base:okButton name="<%= PatronInfoForm.BUTTON_NAME_MARK_STOLEN_OK %>" onclick="hideElementonStolen()"/><base:cancelButton name="<%= PatronInfoForm.BUTTON_NAME_MARK_STOLEN_CANCEL %>" onclick="hideElementonStolen()"/></p>
          </base:showHideTag>
        </td>
    </tr>
    </base:messageBox>
</logic:equal>
<!-- stolen copies confirmation -->

<!-- delete note confirmation -->
<logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="action" value="<%= PatronInfoForm.ACTION_DELETE_NOTE %>">
        <base:messageBox showWarningIcon="true" message='<%= MessageHelper.formatMessage("patroninfo_AreYouSureYouWantToDeleteThisNote") %>'>
            <tr>
                <td valign="baseline" align="center" class="ColRowBold" colspan="2">
                    <base:showHideTag id="onYes">
                        <html:submit property="<%=PatronInfoForm.ID_DELETE_NOTE_YES %>" onclick="hideElementonYes()"><%= MessageHelper.formatMessage("patroninfo_Yes") %></html:submit>
                        <html:cancel property="<%=PatronInfoForm.ID_DELETE_NOTE_NO %>"><%= MessageHelper.formatMessage("patroninfo_No") %></html:cancel>
                    </base:showHideTag>
                </td>
            </tr>
        </base:messageBox>
</logic:equal>
<!-- delete note confirmation -->

<c:if test="<%=form.getComponentList() != null && !form.getComponentList().isEmpty()%>">
    <br>
    <base:messageBox showRedBorder="true">
        <tr>
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td valign="baseline" class="Error">
                <html:hidden property="<%=PatronInfoForm.FIELD_COMPONENT_COPY_ID%>" /> 
                <html:hidden property="<%=PatronInfoForm.FIELD_CHECK_IN_BUTTON_PREFIX %>" />
                <base:textbookComponentKit componentList="<%=form.getComponentList()%>" />
            </td>
        </tr>
    </base:messageBox>
    <br>
</c:if>

<!-- show find box -->

<logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="userInfoOnly" value="false">
<logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="showFindBox" value="true">

    <html:hidden property="findBoxVisible" value="true" />
        <html:hidden property="<%=PatronInfoForm.FIELD_FROM_PATRON_INFO%>" value="true"/>
        <table id="<%=PatronInfoForm.TABLE_FIELDENTRY%>" border="0" cellspacing="0" cellpadding="2">
            <tr>
                <td class="FormLabel"><%= MessageHelper.formatMessage("patroninfo_FindPatron") %>&nbsp;</td>
                <td class="ColRow">
                    <html:text property="searchString" maxlength="1000"/>
                    &nbsp;
                    <base:goButton />
                </td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td class="ColRow">
                    <% if (form.isDistrictSearchAllowedForProductType()) { %>
                        <html:checkbox property="<%=PatronInfoForm.FIELD_SEARCH_ONLY_LOCAL_PATRONS%>"><%= MessageHelper.formatMessage("patroninfo_OnlyMyPatrons") %></html:checkbox>
                    <% } else { %>
                        <html:hidden property="<%=PatronInfoForm.FIELD_SEARCH_ONLY_LOCAL_PATRONS%>" value="true"/>
                    <% } %>
                    <base:patronLookup/>
                </td>
            </tr>

        </table>
    <br><br>
<%
    if (form.getList() != null) {
%>
        <img src="/images/icons/general/line.gif" height="2" width="100%">
		<jsp:include page="/circulation/patronlist.jsp">
			<jsp:param name="formName" value="<%= PatronInfoForm.FORM_NAME %>"/>
			<jsp:param name="districtSearch" value='<%= "" + !form.isSearchLocalPatronsOnly() %>'/>
		</jsp:include>
    <br>
<% } %>
</logic:equal>
</logic:equal>
<!-- show find box confirmation -->

<logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="patronDeleted" value="false" scope="request" >
<logic:present name='<%= PatronInfoForm.FORM_NAME %>' property="patronID">
    <logic:notEqual name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="true">
        <table cellSpacing=1 cellPadding=0 width="95%" bgColor=#c0c0c0 border=0>
            <tr>
                <td vAlign=top width="100%" bgColor=#ffffff>
    </logic:notEqual>

                <table id="detailedPatronTable" cellspacing="2" border="0" width="100%">
                    <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="userInfoOnly" value="false">
                        <tr valign="top">
                            <td class="TableHeading" colspan="4">
                                <bean:write name='<%= PatronInfoForm.FORM_NAME %>' property="patronHeading"/>
                            </td>
                            <td class="ColRow tdAlignRight">
                                <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="showPatronEditButton" value="true">
                                    <base:spanIfAllowed permission='<%= Permission.BACK_OFFICE_ADD_EDIT_PATRONS %>'>
                                      <base:link page='<%= editURL %>' id="<%=PatronInfoForm.ID_EDIT_PATRON %>">
                                          <base:image src="/buttons/small/editpatronsmall.gif" alt='<%=MessageHelper.formatMessage("editPatron") %>'/>
                                      </base:link>
                                    </base:spanIfAllowed>
                                </logic:equal>
                                <logic:notEqual name='<%= PatronInfoForm.FORM_NAME %>' property="showPatronEditButton" value="true">
                                        &nbsp;
                                </logic:notEqual>
                            </td>
                        </tr>
                        <tr>
                            <td class="SmallColHeading tdAlignRight" vAlign="top"><%= MessageHelper.formatMessage("patroninfo_Barcode") %></td>
                            <td class=ColRow vAlign="top">
                                <bean:write name='<%= PatronInfoForm.FORM_NAME %>' property="patronBarcode"/>&nbsp;
                                <logic:notEqual name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="true">
                                    <% if (!form.isUserInfoOnly()) { %><base:link id="<%=PatronInfoForm.ID_PRINT_LABEL %>" permission='<%=Permission.BACK_OFFICE_GENERATE_REPORTS_PATRON%>' page='<%="/backoffice/servlet/presentpatronlabelform.do?singleIDToPrint=" + form.getPatronID()%>'><base:image src="/buttons/small/printlabel.gif"  alt='<%=MessageHelper.formatMessage("printLabel") %>'/></base:link><% } %>
                                </logic:notEqual>
                            </td>
                            <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("patroninfo_Nickname") %></td>
                            <td class="ColRow"><bean:write name='<%= PatronInfoForm.FORM_NAME %>' property="nickname"/>&nbsp;</td>
                            <td class="Instruction" vAlign="top" align="middle" rowSpan="8">
                                <logic:notEqual name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="true">
                                <%-- patron picture only if defined --%>
                                <% if (form.getPatronPicture() != null) { %>
                                    <% if (store.getDisplayPatronPicture()) { %>
                                        <img name="Patron Picture" title ="<bean:write name='<%= PatronInfoForm.FORM_NAME %>' property="patronDisplayName"/>" alt="<bean:write name='<%= PatronInfoForm.FORM_NAME %>' property="patronDisplayName"/>" src="<bean:write name='<%= PatronInfoForm.FORM_NAME %>' property="patronPicture"/>" height="<%= PatronSpecs.BIG_PICTURE_HEIGHT %>" border="1">
                                            <base:link id="<%=PatronInfoForm.ID_HIDE_PICTURE %>" page='<%= form.getDisplayPictureLink(false) %>'><base:image src="/icons/general/hide.gif" width="11" height="9" align="top" alt='<%=MessageHelper.formatMessage("patroninfo_HidePicture")%>'/></base:link>
                                    <% } else { %>
                                            <base:link id="<%=PatronInfoForm.ID_SHOW_PICTURE %>" page='<%= form.getDisplayPictureLink(true) %>'><base:image src="/icons/general/show.gif" width="11" height="9" align="top" alt='<%=MessageHelper.formatMessage("patroninfo_ShowPicture")%>' /></base:link>
                                    <% }%>
                                <% } else { %>
                                    &nbsp;
                                <% } %>
                                </logic:notEqual>
                            </td>
                        </tr>
                        <tr vAlign="top">
                            <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("patroninfo_Status") %></td>
                            <td class="ColRow"><bean:write name='<%= PatronInfoForm.FORM_NAME %>' property="status"/>&nbsp;</td>
                            <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("patroninfo_GradeLevel") %></td>
                            <td class="ColRow"><bean:write name='<%= PatronInfoForm.FORM_NAME %>' property="gradeLevel"/>&nbsp;</td>
                        </tr>
                        <tr vAlign="top">
                            <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("patroninfo_Gender") %></td>
                            <td class="ColRow"><bean:write name='<%= PatronInfoForm.FORM_NAME %>' property="gender"/>&nbsp;</td>
                            <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("patroninfo_Homeroom") %></td>
                            <td class="ColRow"><bean:write name='<%= PatronInfoForm.FORM_NAME %>' property="homeroom"/>&nbsp;</td>
                        </tr>
                        <tr vAlign="top">
                            <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("patroninfo_CardExpires") %></td>
                            <td class="ColRow"><bean:write name='<%= PatronInfoForm.FORM_NAME %>' property="cardExpires"/>&nbsp;</td>
                            <td class="SmallColHeading tdAlignRight" vAlign="top">
                                <%=form.outputUDPrompt(0)%>&nbsp;</td>
                            <td class="ColRow" vAlign="top"><%=form.outputUDValue(0)%>&nbsp;</td>
                        </tr>
                        <tr vAlign="top">
                            <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("patroninfo_GradYear") %></td>
                            <td class="ColRow"><bean:write name='<%= PatronInfoForm.FORM_NAME %>' property="graduationYear"/>&nbsp;</td>
                            <td class="SmallColHeading tdAlignRight"><%=form.outputUDPrompt(1)%>&nbsp;</td>
                            <td class="ColRow"><%=form.outputUDValue(1)%>&nbsp;</td>
                        </tr>
                        <tr vAlign="top">
                            <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("patroninfo_Birthdate") %></td>
                            <td class="ColRow"><bean:write name='<%= PatronInfoForm.FORM_NAME %>' property="birthDate"/>&nbsp;</td>
                            <td class="SmallColHeading tdAlignRight"><%=form.outputUDPrompt(2)%>&nbsp;</td>
                            <td class="ColRow"><%=form.outputUDValue(2)%>&nbsp;</td>
                        </tr>
                        <tr vAlign="top">
                            <td class="SmallColHeading tdAlignRight"><%=PatronSpecs.getDistrictIDPrompt() %></td>
                            <td class="ColRow"><bean:write name='<%= PatronInfoForm.FORM_NAME %>' property="districtID"/>&nbsp;</td>
                            <td class="SmallColHeading tdAlignRight"><%=form.outputUDPrompt(3)%>&nbsp;</td>
                            <td class="ColRow"><%=form.outputUDValue(3)%>&nbsp;</td>
                        </tr>
                        <tr vAlign="top">
                            <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("patroninfo_AcceptableUsePolicyOnFile") %></td>
                            <td class="ColRow"><bean:write name='<%= PatronInfoForm.FORM_NAME %>' property="acceptableUsePolicyOnFile"/>&nbsp;</td>
                            <td class="SmallColHeading tdAlignRight"><%=form.outputUDPrompt(4)%>&nbsp;</td>
                            <td class="ColRow"><%=form.outputUDValue(4)%>&nbsp;</td>
                        </tr>
                    </logic:equal>

<!--Items out Table -->

<%
    if (form.isShowItemsOutSection()) {
%>
    <tr>
    <td colspan="5">
    <table cellpadding="0" cellspacing="0" id="<%=PatronInfoForm.TABLE_MASTER_ITEMS_OUTS%>" width="100%">
       <tr>
       <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="true">
           <td colSpan="5" class="ColRowBold"><%= MessageHelper.formatMessage("patroninfo_ItemsOut") %></td>
       </logic:equal>
       <logic:notEqual name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="true">
           <base:sectionHeading printerFriendly="false" heading='<%= MessageHelper.formatMessage("patroninfo_ItemsOut")  %>' tdContent="colSpan='4'"/>
            <td class="tdAlignRight" background="/images/icons/general/thickline.gif">
             <base:link id="<%=PatronInfoForm.ID_VIEW_HISTORY %>" permissions='<%=new Permission[] {Permission.CIRC_ACCESS_LIBRARY_CHECKOUT_HISTORY, Permission.CIRC_ACCESS_MEDIA_CHECKOUT_HISTORY, Permission.CIRC_ACCESS_TEXTBOOK_CHECKOUT_HISTORY, Permission.CIRC_ACCESS_ASSET_CHECKOUT_HISTORY} %>' page='<%="/circulation/servlet/presentcheckouthistoryform.do?useExistingCollectionType=false&showingCopiesForPatrons=true&rowID=" + form.getPatronID()%>'><base:image src="/buttons/large/viewhistory2.gif" alt='<%= MessageHelper.formatMessage("viewHistory") %>'/></base:link>
            </td>
       </logic:notEqual>
       </tr>
       
     <c:if test="${form.showItemsOutLibrary}">
	    <tr>
	        <td colspan="5">
	            <% request.setAttribute(CheckoutForm.ATTRIBUTE_CHECKED_OUT_ITEMS, form.getCheckouts()); %>
	            <base:patronInfoItemsOut
	                listCollectionType='<%="" + BibMasterSpecs.COLLECTION_TYPE_LIBRARY%>'/>
	        </td>
	    </tr>
        </c:if>

    <c:if test="${form.showItemsOutTextbook}">
        <tr>
            <td colspan="5">
                <% request.setAttribute(CheckoutForm.ATTRIBUTE_CHECKED_OUT_ITEMS, form.getTextbookCheckouts()); %>
                <base:patronInfoItemsOut
                    listCollectionType='<%="" + BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK%>'/>
            </td>
        </tr>
    </c:if>
    
    <c:if test="${form.showItemsOutAsset}">
        <tr>
            <td colspan="5">
                <% request.setAttribute(CheckoutForm.ATTRIBUTE_CHECKED_OUT_ITEMS, form.getAssetCheckouts()); %>
                <base:patronInfoItemsOut
                    listCollectionType='<%="" + BibMasterSpecs.COLLECTION_TYPE_ASSET%>'/>
            </td>
        </tr>
    </c:if>
    
    <c:if test="${form.showItemsOutMedia}">
        <tr>
            <td colspan="5">
                <% request.setAttribute(CheckoutForm.ATTRIBUTE_CHECKED_OUT_ITEMS, form.getMediaCheckouts()); %>
                <base:patronInfoItemsOut
                    listCollectionType='<%="" + BibMasterSpecs.COLLECTION_TYPE_MEDIA%>'/>
            </td>
        </tr>
    </c:if>

        <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="true">
            <tr><td colSpan="5"><hr></td></tr>
        </logic:equal>
    </table>
    </td>
    </tr>
<%
    }
%>
<!--End Items out Table -->

<!--Custodian Table -->
<%
    if (form.isShowCustodianSection()) {
%>
    <tr>
    <td colspan="5">
    <table cellpadding="0" cellspacing="0" id="<%=PatronInfoForm.TABLE_CUSTODIAN%>" width="100%">
       <tr>
       <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="true">
           <td colSpan="5" class="ColRowBold"><%= MessageHelper.formatMessage("patroninfo_Custodian") %></td>
       </logic:equal>
       <logic:notEqual name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="true">
           <base:sectionHeading printerFriendly="false" heading='<%= MessageHelper.formatMessage("patroninfo_Custodian")  %>' tdContent="colSpan='4'"/>
       </logic:notEqual>
       </tr>
       
       <tr>
           <td colspan="5">
               <% request.setAttribute(PatronInfoCustodianItemsTag.ATTRIBUTE_CUSTODIAN_ITEMS, form.getCustodianItems()); %>
               <base:patronInfoCustodianItems expandedBibID='<%=form.getExpandedCustodianAssetBibID()%>'/>
           </td>
       </tr>
        
    
       <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="true">
           <tr><td colSpan="5"><hr></td></tr>
       </logic:equal>
    </table>
    </td>
    </tr>
<%
    }
%>
<!--End Custodian Table -->

                    <!--Fines Table -->
                    <%if ( !form.isMediaBookingUser()) { %>
                        <%if (  (!form.isUserInfoOnly()
                                    && store.canDoAny(new Permission[] { Permission.CIRC_FINES_VIEW_LIBRARY, Permission.CIRC_FINES_VIEW_TEXTBOOK, Permission.CIRC_FINES_VIEW_PATRON, Permission.CIRC_FINES_VIEW_ASSET}  ) )
                                ||
                                (form.isUserInfoOnly()
                                    && store.canDoAny(Permissions.checker(store, new Permission[] { Permission.MANAGE_PATRONS_VIEW_OWN_STATUS }).setPatronID(form.getPatronID()))
                            ) )
                         { %>


                        <tr>
                            <td colSpan="5">
                                <table id="<%=PatronInfoForm.TABLE_FINES%>" cellSpacing=0 cellPadding=2 width="100%">
                                    <tr vAlign="top">
                            <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="false">
                                        <base:sectionHeading printerFriendly="false" heading='<%= MessageHelper.formatMessage("patroninfo_Fines") %>' tdContent="colSpan='2'"/>
                                        <td class="ColHeading tdAlignRight" colspan="2" background="/images/icons/general/thickline.gif" nowrap>
                                        <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="userInfoOnly" value="false">
	                                        <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="valideAEDFine" value="true">
	                                            <% if (form.getFines().size() == 0 ) { %>
	                                                <%-- If there are no fines, show New fine --%>
                                                        <base:link page="/circulation/servlet/presentfineaddform.do" permissions="<%=new Permission[] {Permission.CIRC_FINES_ADD_LIBRARY, Permission.CIRC_FINES_ADD_PATRON, Permission.CIRC_FINES_ADD_TEXTBOOK }%>" id="<%=PatronInfoForm.ID_IMG_ADD_FINE %>"><base:image src="/buttons/large/addfine.gif" alt='<%=MessageHelper.formatMessage("addFine") %>'/></base:link>
	                                            <% } else { %>
	                                                <%-- If there is at least one fine, show pay/update --%>
                                                    <base:link page="/circulation/servlet/presentfineviewform.do" id="<%=PatronInfoForm.ID_EDIT_FINES %>" permissions="<%=new Permission[] {Permission.CIRC_FINES_PAY_LIBRARY, Permission.CIRC_FINES_WAIVE_LIBRARY, Permission.CIRC_FINES_PAY_PATRON, Permission.CIRC_FINES_WAIVE_PATRON, 
                    Permission.CIRC_FINES_PAY_TEXTBOOK, Permission.CIRC_FINES_WAIVE_TEXTBOOK, Permission.CIRC_FINES_DELETE_LIBRARY, Permission.CIRC_FINES_DELETE_PATRON, Permission.CIRC_FINES_DELETE_TEXTBOOK}%>"><base:image src="/buttons/large/editfines.gif" alt='<%=MessageHelper.formatMessage("editFines") %>' /></base:link>
	                                            <% } %>
	                                        </logic:equal>
                                        <base:link page='<%="/circulation/servlet/presentpatronfinehistoryform.do?patronID=" + patronID %>' permissions="<%=new Permission[] {Permission.CIRC_FINES_VIEW_LIBRARY, Permission.CIRC_FINES_VIEW_TEXTBOOK, Permission.CIRC_FINES_VIEW_PATRON, Permission.CIRC_FINES_VIEW_ASSET}%>" id="<%=PatronInfoForm.ID_VIEW_PATRON_FINE_HISTORY %>"><base:image src="/buttons/large/viewhistory2.gif" alt='<%=MessageHelper.formatMessage("viewHistory") %>'/></base:link>
                                        </logic:equal>
                                        </td>
                            </logic:equal>
                            <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="true">
                                        <td class="ColRowBold" colSpan="4">
                                            <%= MessageHelper.formatMessage("patroninfo_Fines") %>
                                        </td>
                            </logic:equal>
                                    </tr>
                                <base:finesListOutput
                                    finesList="<%= form.getFines() %>"
                                    printerFriendly="<%= form.isPrinterFriendlyActive() %>"
                                    showEditDeleteButtons="false"
                                    showTitles="<%= form.isShowTitles() %>"
                                    fineSideLink="false"/>
                                <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="false">
                                    <tr><td colspan="4">&nbsp;</td></tr>
                                </logic:equal>
                                <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="true">
                                    <tr><td colSpan="4"><hr></td></tr>
                                </logic:equal>
                                </table>
                            </td>
                        </tr>
                        <% } %>
                    <% } %>
                <!-- Holds Table  -->
                <base:patronInfoHold printerFriendly="<%= form.isPrinterFriendlyActive() %>" patronIsVisitor="<%=form.isVisitor()%>"/>
                
                <!-- Recommended Titles -->
                <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="userInfoOnly" value="true">                
                    <%if(store.isLibrarySite() || store.isMediaSite()){ %>
                        <base:patronInfoRecommendation recommendations="<%=form.getRecommendations() %>" printerFriendly="<%= form.isPrinterFriendlyActive() %>" />
                    <% } %>
                </logic:equal>                    
                <!-- Current Transaction Summary -->

                    <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="userInfoOnly" value="false">
                    <tr>
                        <td colSpan="5">
                            <table id="currentTransactionSummary" cellSpacing=0 cellPadding=2 width="100%">
                                <tr>
                                <base:sectionHeading printerFriendly='<%=form.isPrinterFriendlyActive() %>' heading='<%=MessageHelper.formatMessage("patroninfo_CurrentTransactions") %>' tdContent="colSpan='4'"/>
                                </tr>
                                <tr>
                                    <td nowrap class="SmallColHeading"><%= MessageHelper.formatMessage("patroninfo_CheckedOut") %></td>
                                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("patroninfo_Overdue") %></td>
                                    <%if ( store.canDoAny(new Permission[] { Permission.CIRC_VIEW_HOLDS, Permission.CIRC_AED_HOLDS })) { %>
                                       <td nowrap class="SmallColHeading"><%= form.getCurrentTransactionsHoldsLabel() %></td>
                                    <% } else { %> 
                                         <td class="SmallColHeading">&nbsp;</td>
                                    <% } %>
                                    <%if ( store.canDoAny(new Permission[] { Permission.CIRC_FINES_VIEW_LIBRARY, 
                                        Permission.CIRC_FINES_VIEW_PATRON, Permission.CIRC_FINES_VIEW_TEXTBOOK })) { %>
                                        <td nowrap class="SmallColHeading"><%= form.getCurrentTransactionsFinesLabel() %></td>
                                    <% } else { %> 
                                        <td class="SmallColHeading">&nbsp;</td>
                                    <% } %>
                                </tr>
                                <bean:write name='<%= PatronInfoForm.FORM_NAME %>' filter="false" property="currentLibraryRow"/>
                                <bean:write name='<%= PatronInfoForm.FORM_NAME %>' filter="false" property="currentTextbookRow"/>
                                <bean:write name='<%= PatronInfoForm.FORM_NAME %>' filter="false" property="currentAssetRow"/>
                                <bean:write name='<%= PatronInfoForm.FORM_NAME %>' filter="false" property="currentMediaRow"/>
                                <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="true">
                                    <tr><td colSpan="4"><hr></td></tr>
                                </logic:equal>
                            </table>
                        </td>
                    </tr>
                    </logic:equal>
                    <!-- Circulation Statistics -->
                    <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="userInfoOnly" value="false">
                    <% if (form.isMediaBookingUser() || form.isLibraryProductViewable() ) { %>
                    <tr>
                        <td colSpan="5">
                            <table id="<%=PatronInfoForm.TABLE_AUDIT_STATISTICS %>" cellSpacing=0 cellPadding=2 width="100%">
                                <tr>
                                    <% if (form.isMediaBookingUser()) { %>
                                        <base:sectionHeading printerFriendly='<%=form.isPrinterFriendlyActive()%>' heading="Media Circulation Statistics" tdContent="colSpan='4'"/>
                                    <% } else { %>
                                        <base:sectionHeading printerFriendly='<%=form.isPrinterFriendlyActive()%>' heading='<%=MessageHelper.formatMessage("patroninfo_LibraryCirculationStatistics")%>' tdContent="colSpan='4'"/>
                                    <% } %>
                                </tr>
                                <tr>
                                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("patroninfo_Lifetime") %></td>
                                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("patroninfo_PreviousYear") %></td>
                                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("patroninfo_CurrentYear") %></td>
                                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("patroninfo_CurrentMonth") %></td>
                                </tr>
                                <tr>
                                    <td class="ColRow">&nbsp;<base:localeNumberTag number="<%= form.getStatsLifetime()%>"/></td>
                                    <td class="ColRow">&nbsp;<base:localeNumberTag number="<%= form.getStatsPreviousYear()%>"/></td>
                                    <td class="ColRow">&nbsp;<base:localeNumberTag number="<%= form.getStatsCurrentYear()%>"/></td>
                                    <td class="ColRow">&nbsp;<base:localeNumberTag number="<%= form.getStatsCurrentMonth()%>"/></td>
                                </tr>

    <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="true">
        <tr><td colSpan="4"><hr></td></tr>
    </logic:equal>
                            </table>
                        </td>
                    </tr>
                    <%}%>
                    </logic:equal>
                    <!-- Contact Information -->
                    <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="userInfoOnly" value="false">
                    <tr>
                        <td colSpan="5">
                            <table id="contactInformation" cellSpacing=0 cellPadding=2 width="100%">
                                <tr>
                                    <base:sectionHeading printerFriendly='<%=form.isPrinterFriendlyActive()%>' heading='<%=MessageHelper.formatMessage("patroninfo_ContactInformation")%>' tdContent="colSpan='5'"/>
                                </tr>
                                <tr>
                                    <td class="SmallColHeading" valign="top"><%= MessageHelper.formatMessage("patroninfo_Address1") %></td>
                                    <td class="ColRow" valign="top">
                                        <logic:iterate id="address1" name='<%= PatronInfoForm.FORM_NAME %>' property="address1" >
                                            <bean:write name="address1" /><br>
                                        </logic:iterate>
                                    </td>
                                    <td class="SmallColHeading" valign="top"><%= MessageHelper.formatMessage("patroninfo_Address2") %></td>
                                    <td class="ColRow" colspan="2" valign="top">
                                        <logic:iterate id="address2" name='<%= PatronInfoForm.FORM_NAME %>' property="address2" >
                                            <bean:write name="address2" /><br>
                                        </logic:iterate>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="SmallColHeading" valign="top"><%= MessageHelper.formatMessage("patroninfo_Email1") %></td>
                                    <td class="ColRow" valign="top">
<logic:notEqual name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="true">
                                        <a href="mailto:<bean:write name='<%= PatronInfoForm.FORM_NAME %>' property="email1"/>">
</logic:notEqual>
                                            <bean:write name='<%= PatronInfoForm.FORM_NAME %>' property="email1"/>
<logic:notEqual name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="true">
                                        </a>
</logic:notEqual>
                                    </td>
                                    <td class="SmallColHeading" valign="top"><%= MessageHelper.formatMessage("patroninfo_Email2") %></td>
                                    <td class="ColRow" colspan="2" valign="top">
<logic:notEqual name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="true">
                                        <a href="mailto:<bean:write name='<%= PatronInfoForm.FORM_NAME %>' property="email2"/>">
</logic:notEqual>
                                            <bean:write name='<%= PatronInfoForm.FORM_NAME %>' property="email2"/>
<logic:notEqual name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="true">
                                        </a>
</logic:notEqual>
                                    </td>
                                </tr>
    <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="true">
        <tr><td colSpan="5"><hr></td></tr>
    </logic:equal>
                            </table>
                        </td>
                    </tr><!-- contact information -->
                    </logic:equal>
<logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="userInfoOnly" value="false">
<logic:notEqual name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="true">
<% if ( store.canViewAny( new Permission[] { Permission.CIRC_VIEW_PATRON_NOTES,
    Permission.CIRC_AED_PATRON_NOTES } ) ) { %>
                    <tr>
                        <td colspan="5">
                            <table id="notes" cellSpacing=0 cellPadding=2 width="100%">
                                <%int notesColSpan = 2;%>
                                <tr>
                                    <base:sectionHeading printerFriendly='<%=form.isPrinterFriendlyActive()%>' heading='<%=MessageHelper.formatMessage("patroninfo_Notes") %>' tdContent="colSpan='2'"/>
    <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="false">
                                    <td class="ColRowBold tdAlignRight" background="/images/icons/general/thickline.gif" >
                                        <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="visitor" value="false">
                                            <base:link page="/circulation/servlet/presentaddeditpatronnoteform.do" id="<%=PatronInfoForm.ID_IMG_ADD_NOTE %>" permission='<%= Permission.CIRC_AED_PATRON_NOTES %>'><base:image src="/buttons/large/addnote.gif" alt='<%=MessageHelper.formatMessage("patroninfo_AddNote") %>'/></base:link>
                                        <%notesColSpan = 3;%>
                                        </logic:equal>
                                    </td>

    </logic:equal>
                                </tr>

                            <%
                            List notes = form.getNotesList();
                            if (notes.size() > 0) {
                                for (int index = 0; index < notes.size(); index ++) {
                                    NoteRecord rec = (NoteRecord)notes.get(index);

                                    if (index % 2 == 1) {
                                        out.print("<tr>");
                                    } else {
                                        out.print("<tr bgcolor='#E8E8E8'>");
                                    }
                                %>
                                        <td valign="top" class="ColRow">
                                    <%
                                    if (rec.isUrgencyFlag()) {
                                    %>
                                    <base:image src="/icons/general/flag.gif" width="19" height="16" alt='<%=MessageHelper.formatMessage("patroninfo_UrgentNote") %>'/>
                                    <%
                                    } else {
                                    %>
                                    &nbsp;
                                    <%
                                    }
                                    %>
                                    </td>
                                    <td class="ColRow" valign="top">
                                        <%= HTMLHelper.filterHTMLConvertLineBreaks(rec.getText()) %>
                                    </td>
                                    <td class="ColRow tdAlignRight" valign="top" NOWRAP>
                                        <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="visitor" value="false">
                                            <%
                                            String url = "/circulation/servlet/presentaddeditpatronnoteform.do?noteID=" + rec.getNoteID();
                                            %>
                                            <base:link page="<%= url %>" id="<%=PatronInfoForm.ID_LINK_EDIT_NOTE %>" permission='<%= Permission.CIRC_AED_PATRON_NOTES %>'><base:image src="/icons/general/edit.gif" width="19" height="16" alt='<%=MessageHelper.formatMessage("patroninfo_EditNote") %>'/></base:link>
                                            <%
                                            url = form.getDeleteNoteLink(rec.getNoteID());
                                            %>
                                            &nbsp;
                                            <base:link page="<%= url %>" id="<%=PatronInfoForm.ID_LINK_DELETE_NOTE %>" permission='<%= Permission.CIRC_AED_PATRON_NOTES %>'><base:image src="/icons/general/delete.gif" width="19" height="16" alt='<%=MessageHelper.formatMessage("patroninfo_DeleteNote") %>'/></base:link>
                                        </logic:equal>
                                    </td>
                                </tr>
                                <%
                                }
                            } else {
                                // notes.size() is zero (ie. no notes)
                            %>
                                <tr>
                                    <td valign="top" align="center" class="SmallColHeading" colspan='<%=""+notesColSpan%>'><%= MessageHelper.formatMessage("patroninfo_ThereAreNoNotesForThisPatron") %></td>
                                </tr>
                            <%
                            }
                            %>
    <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="false">
        <tr><td colSpan='<%=""+notesColSpan%>'>&nbsp;</td></tr>
    </logic:equal>
    <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="true">
        <tr><td colSpan='<%=""+notesColSpan%>'><hr></td></tr>
    </logic:equal>
                            </table>
                        </td>
                    </tr>
<% } %> <!-- Notes table -->
</logic:notEqual>
</logic:equal>
<logic:present name='<%= PatronInfoForm.FORM_NAME %>' property="textbookClassList">
                    <tr>
                        <td colspan="5">
                            <table id="<%= PatronInfoForm.TABLE_TEXTBOOK_CLASSES %>" cellSpacing=0 cellPadding=2 width="100%">
                                <tr>
    <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="false">
                                        <base:sectionHeading printerFriendly='<%=form.isPrinterFriendlyActive()%>' heading="Currently Teaching" tdContent="colSpan='8'"/>
                                </tr>
                                <tr>
                                    <td class="ColRowBold tdAlignRight" colspan="8">
                                        <% String updateClassLink = "/backoffice/servlet/presenttextbookclasssectionviewform.do?doNotClearCrumbs=true"; %>
                                        <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="visitor" value="false">
                                        <logic:notEqual name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="true">
                                            <base:link page="<%=updateClassLink%>"
                                                permission='<%= Permission.BACK_OFFICE_AED_CLASSES %>'><base:image
                                                src="/buttons/large/updateclass.gif"
                                                id="<%=PatronInfoForm.ID_UPDATE_CLASSES %>"
                                                alt='<%= MessageHelper.formatMessage("patroninfo_UpdateClass") %>'/></base:link>
                                        </logic:notEqual>
                                        </logic:equal>
                                    </td>

    </logic:equal>
    <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="true">
                                    <td colspan="8">&nbsp;</td>
                                    </tr>
                                    <tr>
                                    <td class="ColRowBold" colSpan="7"><%= MessageHelper.formatMessage("patroninfo_CurrentlyTeaching") %></td>
    </logic:equal>
                                </tr>

                            <%
                            List textbookClasses = form.getTextbookClassList();
                            if (textbookClasses.size() > 0) {
                                // print header line
                                %>
                                <tr>
                                <td align="center" class="SmallColHeading"><%= MessageHelper.formatMessage("patroninfo_Period") %></td>
                                <td class="SmallColHeading"><%= MessageHelper.formatMessage("patroninfo_Meets") %></td>
                                <td class="SmallColHeading"><%= MessageHelper.formatMessage("patroninfo_ClassName") %></td>
                                <td class="SmallColHeading"><%= MessageHelper.formatMessage("patroninfo_Starts") %></td>
                                <td class="SmallColHeading"><%= MessageHelper.formatMessage("patroninfo_TextbooksDue") %></td>
                                <td class="SmallColHeading" nowrap><%= MessageHelper.formatMessage("patroninfo_ItemsOutAssigned") %></td>
                                <td class="SmallColHeading" colspan="2">&nbsp;</td>
                                </tr>


                                <%
                                // print items
                                for (int index = 0; index < textbookClasses.size(); index ++) {
                                    TextbookClassFacadeValue rec = (TextbookClassFacadeValue)textbookClasses.get(index);

                                    if (index % 2 == 1) {
                                        out.print("<tr>");
                                    } else {
                                        out.print("<tr bgcolor='#E8E8E8'>");
                                    }
                                %>
                                    <td valign="top" align="center" class="ColRow">
                                        <%= (rec.isDefaultSection() ? "&nbsp;" : String.valueOf(rec.getPeriod())) %>
                                    </td>
                                    <td valign="top" class="ColRow">
                                        <%= TextbookClassSectionSpecs.convertDaysOfWeekToAbbreviation(rec)%>
                                    </td>
                                    <td valign="top" class="ColRow">
                                        <%= ResponseUtils.filter(rec.getClassName() + " [" + rec.getSiteShortName() + "]") %>
                                    </td>
                                    <td valign="top" class="ColRow">
                                        <%= lh.formatDate(rec.getStartDate()) %>
                                    </td>
                                    <td valign="top" class="ColRow">
                                        <%= lh.formatDate(rec.getTextbookDueDate()) %>
                                    </td>
                                    <td valign="top" class="ColRow" NOWRAP>
                                        <%=form.getItemsOutToTeacherLink(rec, store)%>&nbsp;/&nbsp;<%= MessageHelper.formatMessage("patroninfo_Copies", Long.valueOf(rec.getItemsReassignedToStudent())) %>
                                    </td>
                                    <td class="ColRow tdAlignRight" valign="top" NOWRAP>
                                    <c:choose>
                                        <c:when test="<%=store.getSiteID().equals(rec.getSiteID())%>">
                                        <logic:notEqual name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="true">
                                            <%
                                            String url = null;
                                            if (!rec.isDefaultSection()){ // don't let user edit or delete undefined class
                                                url = "/backoffice/servlet/presentclasssectionsummaryform.do?sectionID=" + rec.getTextbookClassSectionID() + "&patronID=" + rec.getTeacherPatronID();
                                            %>
                                                <base:link page="<%= url %>" permission='<%= form.getAEDClassPermissionBasedOnFormUse() %>'><base:image src="/icons/general/edit.gif" width="19" height="16" alt='<%= MessageHelper.formatMessage("patroninfo_EditClass") %>'/></base:link>
                                            <%
                                            }
                                            url = form.getTransferClassLink(rec.getTextbookClassSectionID());
                                            boolean hasItems = (rec.getItemsReassignedToStudent() + rec.getItemsOutToTeacher()) > 0;
                                            if (hasItems){
                                            %>
                                                </td>
                                                <!-- show transfer button on all classes with items out -->
                                                <td>
                                                   <base:link page="<%= url %>" permission='<%= form.getAEDClassPermissionBasedOnFormUse() %>'><base:image src="/icons/general/transferClass.gif" width="19" height="16"  alt='<%= MessageHelper.formatMessage("patroninfo_TransferAssignedCopies") %>'/></base:link>
                                        <%  } else { %>
                                                </td>
                                                <td>&nbsp;
                                        <%  }  %>
                                        </logic:notEqual>
                                        </c:when>
                                        <c:otherwise>
                                                </td><td>&nbsp;
                                        </c:otherwise>
                                    </c:choose>
                                    </td>
                                </tr>
                                <%
                                }
                            } else {
                                // textbookClasses.size() is zero (ie. no textbookClasses)
                            %>
                                <tr>
                                    <td valign="top" align="center" class="SmallColHeading" colspan="8"><%= MessageHelper.formatMessage("patroninfo_NoClassesAssigned") %></td>
                                </tr>
                            <%
                            }
                            %>
    <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="false">
        <tr><td colSpan="8">&nbsp;</td></tr>
    </logic:equal>
    <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="true">
        <tr><td colSpan="8"><hr></td></tr>
    </logic:equal>
                            </table>
                        </td>
                    </tr>
<!-- Textbook Classes table -->
</logic:present>

<logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="false">
    <%if(store.canDo(Permission.BACK_OFFICE_MODERATE_MYQUEST_CONVERSATIONS)){ %>
        <tr>
            <td colspan="5">
                <table id="questcomments" cellSpacing=0 cellPadding=2 width="100%">
                    <tr>
                        <base:sectionHeading printerFriendly='<%=form.isPrinterFriendlyActive()%>' heading='<%=MessageHelper.formatMessage("patroninfo_QuestComments") %>' tdContent="colSpan='2'"/>
                            <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="false">
                                    <td class="ColRowBold tdAlignRight" background="/images/icons/general/thickline.gif" >
                                        <base:link page='<%= "/circulation/servlet/presentmanagequestcommentsform.do?patronID="+patronID %>' id="<%=PatronInfoForm.ID_QUEST_COMMENTS %>" permission='<%= Permission.BACK_OFFICE_MODERATE_MYQUEST_CONVERSATIONS %>'>
                                            <base:image
                                                src="/buttons/large/manage.gif"
                                                alt='<%=MessageHelper.formatMessage("manage") %>'/>
                                        </base:link>
                                    </td>
                            </logic:equal>
                    </tr>
                </table>
             </td>
         </tr>
    <% } %>     
</logic:equal>    
        <tr>
            <td colspan="5">
                <br/>
            </td>
        </tr>
     

                    <!--Printer Friendly checkboxes and button -->
                    <logic:notEqual name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="true">
                            <td class="PageHeader tdAlignRight" colSpan="5">
                                <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="userInfoOnly" value="false">
                                    <html:checkbox property="showPhoneNumbers"><%= MessageHelper.formatMessage("patroninfo_ShowPhoneNumbers") %></html:checkbox>
                                    <html:checkbox property="showTitles"><%= MessageHelper.formatMessage("patroninfo_ShowTitlesForCopiesListed") %></html:checkbox>
                                </logic:equal>
                                <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="userInfoOnly" value="true">
                                    <html:hidden property="showTitles" value="on"/>
                                </logic:equal>

                                <logic:equal name='<%= PatronInfoForm.FORM_NAME %>' property="userInfoEmpty" value="false">
                                <% String altText =MessageHelper.formatMessage("printable") ; %>
                                    <a href="javascript:printerFriendly()" id="<%=PatronInfoForm.ID_PRINTER_FRIENDLY %>">
                                        <base:image src='/buttons/small/printerfriendly.gif' alt="<%=altText%>" />
                                    </a>
                                </logic:equal>
                            </td>
                        </tr>                         
                        <tr>
                            <td colspan="5">
                                <%form.outputLegend(out); %>
                            </td>
                        </tr>
                    </logic:notEqual>
                </table>
    <logic:notEqual name='<%= PatronInfoForm.FORM_NAME %>' property="printerFriendlyActive" value="true">
                </td>
            </tr>
        </table>
    </logic:notEqual>
</logic:present>
</logic:equal><%--This is the end of patron not delete --%>
<% if (form.isViewEstimateLinkPresent()){%>
<bean:write name='<%= PatronInfoForm.FORM_NAME %>' filter="false" property="viewEstimateJavaScriptMethod"/>
<%}%>

<% 
  if(form.isShowReceiptsWindowFromFineAdd()) {
    form.setShowReceiptsWindowFromFineAdd(false);%>
    
    <SCRIPT LANGUAGE="javascript" TYPE="text/javascript">
    <!--
        window.open('<%= PrintReceiptForm.FORM_URL %>', '<%= PrintReceiptForm.TARGET_NAME %>');
    // -->
    </SCRIPT>
    
<% } %>

</base:form>
