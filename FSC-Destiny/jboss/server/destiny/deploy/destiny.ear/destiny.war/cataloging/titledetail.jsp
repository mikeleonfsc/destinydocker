<%@page import="com.follett.fsc.destiny.util.ThirdPartyVendorSpecs.Vendor"%>
<%@page import="com.meterware.httpunit.javascript.JavaScript.Form"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserLoggedInTag"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.session.cataloging.ejb.TitleAEDSpecs" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.client.common.PageCalculator" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.HoldInformationValue"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>

<SCRIPT language=javascript>
<!--
    function showQuizRows()
    {
        document.forms["cataloging_servlet_TitleDetailForm"].elements["hideLocalQuizzes"].value = "false";
        document.forms["cataloging_servlet_TitleDetailForm"].elements["clickedShowLocalQuizzes"].value = "true";

        //Submit the form
        document.forms["cataloging_servlet_TitleDetailForm"].submit();
    }
-->
</script>
<%
    TitleDetailForm form = (TitleDetailForm)request.getAttribute(TitleDetailForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    boolean isInternational = lh.isInternationalProduct();
    
int itemsInList = form.getTotalCount();
int currentPage = PageCalculator.getCurrentPage(form);
int itemsToSkip = PageCalculator.getFirstNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
int itemsToPrint = PageCalculator.getOnePastLastNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
%>

<base:messageBox strutsErrors="true"/>

<logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="titlePresent" value="true">

<base:form action="/cataloging/servlet/handletitledetailform.do">
<c:set var="form" value="<%=request.getAttribute(TitleDetailForm.FORM_NAME)%>"/>
    <html:hidden property="<%=TitleDetailForm.FIELD_SITE_TYPE_ID%>"/>
    <html:hidden property="<%=TitleDetailForm.FIELD_SITE_ID%>"/>

    <html:hidden property="<%=TitleDetailForm.FIELD_INCLUDE_LIBRARY%>"/>
    <html:hidden property="<%=TitleDetailForm.FIELD_INCLUDE_MEDIA%>"/>
    <html:hidden property="<%=TitleDetailForm.FIELD_MEDIA_SITE_ID%>"/>

    <html:hidden property="<%=TitleDetailForm.FIELD_BIBID%>"/>
    <html:hidden property="<%=TitleDetailForm.PARAM_CURRENT_BIB_ID%>"/>
    <html:hidden property="<%=TitleDetailForm.FIELD_ALLIANCE_RECORD%>"/>
    <html:hidden property="<%=TitleDetailForm.FIELD_ALLIANCE_AV_RECORD%>"/>
    <html:hidden property="<%=TitleDetailForm.FIELD_Z_RECORD%>"/>
    <html:hidden property="<%=TitleDetailForm.FIELD_Z_SOURCENAME%>"/>
    <html:hidden property="<%=TitleDetailForm.PARAM_BIB_WALKER_ID%>"/>
    <html:hidden property="<%=TitleDetailForm.PARAM_ELEMENTARY_MODE%>"/>
    <html:hidden property="<%=TitleDetailForm.PARAM_HIDE_LOCAL_QUIZZES%>"/>
    <html:hidden property="<%=TitleDetailForm.PARAM_CLICKED_SHOW_LOCAL_QUIZZES%>"/>
    
<%-- Are we confirming an allow duplicate title? --%>
<logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="<%=TitleDetailForm.FIELD_SHOW_DUPLICATE_MESSAGE%>" value="true">
    <html:hidden property="<%=TitleDetailForm.FIELD_EXTERNAL_SOURCES_FORWARD%>"/>
    <base:imageSpacer width="1" height="3"/>
    <base:messageBox showWarningIcon="true" message='<%= MessageHelper.formatMessage("titledetail_SavingWillDuplicateATitleAlreadyInYourDatabaseAre") %>'>
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:yesNo 
                    buttonYesName="<%=TitleDetailForm.BUTTON_NAME_OVERRIDE_DUPLICATE%>"
                    buttonNoName="<%=TitleDetailForm.BUTTON_NAME_CANCEL_DUPLICATE%>"
                />
            </td>
        </tr>
    </base:messageBox>
</logic:equal>

<%-- Are we confirming a review delete? --%>
<c:if test="<%=form.getDeleteReviewVO() != null%>">
    <html:hidden property="<%=TitleDetailForm.PARAM_REVIEW_ID%>"/>
    <html:hidden property="<%=TitleDetailForm.PARAM_SHOW_ALL_REVIEWS%>"/>
    <base:imageSpacer width="1" height="3"/>
    <base:messageBox showWarningIcon="true" message='<%=MessageHelper.formatMessage("titledetail_AreYouCertainYouWantToDeleteReview",form.getDeleteReviewVO().getReviewerName(),form.getTitleQuoted()) %>'>
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:yesNo 
                    buttonYesName="<%=TitleDetailForm.BUTTON_NAME_CONFIRM_DELETE_REVIEW%>"
                    buttonNoName="<%=TitleDetailForm.BUTTON_NAME_CANCEL_DELETE_REVIEW%>"
                />
            </td>
        </tr>
    </base:messageBox>
</c:if>
<c:if test="<%=!form.getHoldMessages().isEmpty()%>">
<base:messageBox>
    <logic:iterate id="holdMsg" name="<%=TitleDetailForm.FORM_NAME%>" property="holdMessages" type="com.follett.fsc.destiny.client.cataloging.data.HoldMessage">
            <tr valign="top" align="center">
                <td class="ColRowBold" align="center"><%=holdMsg.header %></td>
            </tr>
            <tr align="center">
                <td class="ColRow" align="center"><%=holdMsg.body %></td>
            </tr>
    </logic:iterate>
</base:messageBox>
</c:if>

<c:if test="<%=!form.getHoldsProcessedList().isEmpty()%>">
<base:messageBox showRedBorder="true">
       <tr>
           <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
           <td class="ColRowBold" align="center"><%=MessageHelper.formatMessage("relatetitles_TheModificationsToThisGroupHaveReadiedHolds")%></td>
       </tr>
    <% for(HoldInformationValue holdMsg : form.getHoldsProcessedList()) { %>
            <tr valign="top" align="center">
                <td>&nbsp;</td>
                <td class="ColRow" align="center"><%=form.formatHoldMessage(holdMsg)%></td>
            </tr>
    <% } %>
</base:messageBox>
</c:if>

<%-- Are we confirming a delete? --%>
    <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="<%=TitleDetailForm.BUTTON_NAME_ACTION%>" value="<%=TitleDetailForm.BUTTON_VALUE_CONFIRM_DELETE%>">
        <base:imageSpacer width="1" height="3"/>
        <base:messageBox showRedBorder="true">
            <tr valign="top">
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>

                <td class="ColRowBold"><bean:write name="<%=TitleDetailForm.FORM_NAME%>" property="<%=TitleDetailForm.FIELD_DELETE_CONFIRM_TITLE%>"/></td>
            </tr>
            <tr valign="top">
                <td colspan="2">

                    <bean:size id="numMsgs" name="<%=TitleDetailForm.FORM_NAME%>" property="<%=TitleDetailForm.FIELD_CONFIRMATION_MESSAGES%>"/>
                    <% String header = MessageHelper.formatMessage("titledetail_PleaseNoteTheFollowing") + "<ul>"; %>

                    <table border="0" align="center" width="100%">
                    <tr>
                        <td valign="baseline" class="Error">
                        <logic:notEqual name="numMsgs" value="0">
                            <logic:iterate id="messages" name="<%=TitleDetailForm.FORM_NAME%>" property="confirmationMessages">
                                <%=header%>
                                <%header="";%>
                                <li><bean:write name="messages" /></li>
                            </logic:iterate>
                        </logic:notEqual>
                        <logic:equal value="true" name="<%=TitleDetailForm.FORM_NAME%>" property="titleIsInAnyMyList">

                            <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="<%=TitleDetailForm.FIELD_DISTRICT_USER%>" value="false">
                                <%=header%>
                                <%header="";%>
                                <li><%= MessageHelper.formatMessage("titledetail_ThisTitleIsIncludedInOneOrMoreUserLists") %></li>
                                <logic:equal value='<%="" + TitleAEDSpecs.SITE_BIB_STATUS_LOCAL_AND_OTHER_SITES%>' name="<%=TitleDetailForm.FORM_NAME%>" property="siteBibStatus">
                                    <li><%= MessageHelper.formatMessage("titledetail_TheTitleWillNotBeRemovedFromUserLists") %></li>
                                </logic:equal>
                            </logic:equal>

                            <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="<%=TitleDetailForm.FIELD_DISTRICT_USER%>" value="true">
                                <%=header%>
                                <%header="";%>
                                <li><%= MessageHelper.formatMessage("titledetail_TheTitleWillBeRemovedFromAllUserLists") %></li>
                            </logic:equal>

                        </logic:equal>
                        
                         <c:choose>
                         <c:when test="${form.singleSite == true}">  
                            <html:hidden property="<%=TitleDetailForm.FIELD_DELETE_FROM_DISTRICT%>" value="true"/>
                         </c:when>
                        <c:otherwise>
                            <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="<%=TitleDetailForm.FIELD_DISTRICT_USER%>" value="false">
                                <logic:equal value='<%="" + TitleAEDSpecs.SITE_BIB_STATUS_LOCAL_SITE_ONLY%>' name="<%=TitleDetailForm.FORM_NAME%>" property="siteBibStatus">
                                    <logic:equal value="false" name="<%=TitleDetailForm.FORM_NAME%>" property="temporaryTitle">
                                    <%=header%>
                                    <%header="";%>
                                        <li>
                                            <% if ( form.isMediaBookingUser() ) { %>
                                            <%= MessageHelper.formatMessage("titledetail_ThisIsTheOnlySiteInTheDistrictUsingThisTitle") %>
                                            <% } else { %>
                                            <%= MessageHelper.formatMessage("titledetail_ThisIsTheOnlyLibraryInTheDistrictUsingThisTitle") %> 
                                            <% } %>
                                    </logic:equal>
                                    <table border="0" id="<%=TitleDetailForm.TABLE_DELETE_OPTIONS%>">
                                        <logic:equal value="false" name="<%=TitleDetailForm.FORM_NAME%>" property="temporaryTitle">
                                            <tr>
                                                <td valign="baseline"><html:radio property="<%=TitleDetailForm.FIELD_DELETE_FROM_DISTRICT%>" value="false"/></td>
                                                <td valign="baseline"> 
                                                    <% if (!form.isMediaBookingUser() ) {%>
                                                    <%= MessageHelper.formatMessage("titledetail_RemoveThisTitleFromThisLibrarysCollectionOnly") %> 
                                                    <% } else { %>
                                                    <%= MessageHelper.formatMessage("titledetail_RemoveThisTitleFromThisCollectionOnly") %> </td>
                                                    <% } %>
                                            </tr>
                                            <logic:equal value="true" name="<%=TitleDetailForm.FORM_NAME%>" property="titleIsInAnyMyList">
                                            <tr>
                                                <td valign="baseline">&nbsp;</td>
                                                <td valign="baseline"><%= MessageHelper.formatMessage("titledetail_TheTitleWillNotBeRemovedFromUserLists") %></td>
                                            </tr>
                                            </logic:equal>
                                        </logic:equal>

                                        <logic:equal value="false" name="<%=TitleDetailForm.FORM_NAME%>" property="temporaryTitle">
                                            <tr>
                                                <td valign="baseline"><html:radio property="<%=TitleDetailForm.FIELD_DELETE_FROM_DISTRICT%>" value="true"/></td>
                                                <td valign="baseline"><%= MessageHelper.formatMessage("titledetail_PermanentlyDeleteThisTitleFromTheDistrictCatalog") %></td>
                                            </tr>
                                            <logic:equal value="true" name="<%=TitleDetailForm.FORM_NAME%>" property="titleIsInAnyMyList">
                                            <tr>
                                                <td valign="baseline">&nbsp;</td>
                                                <td valign="baseline"><%= MessageHelper.formatMessage("titledetail_TheTitleWillBeRemovedFromAllUserLists") %></td>
                                            </tr>
                                            </logic:equal>
                                        </logic:equal>

                                        <logic:equal value="true" name="<%=TitleDetailForm.FORM_NAME%>" property="temporaryTitle">
                                            <html:hidden property="<%=TitleDetailForm.FIELD_DELETE_FROM_DISTRICT%>"/>
                                        </logic:equal>
                                    </table>
                                    <logic:equal value="false" name="<%=TitleDetailForm.FORM_NAME%>" property="temporaryTitle">
                                        </li>
                                    </logic:equal>
                                </logic:equal>
                            </logic:equal>
                           </c:otherwise>
                           </c:choose>
                        </ul></td></tr>
                    </table>
                </td>
            </tr>
            <tr>
                <td align="center" class="ColRowBold" colspan="2">
                    <html:checkbox property="<%=BaseTitleDetailForm.FIELD_TRACK_AS_WEEDED%>"/><%= MessageHelper.formatMessage("titledetail_TrackAnyDeletedCopiesAsWeeded") %></td>
            </tr>

            <tr>
                <td align="center" class="ColRow" colspan="2"><%= MessageHelper.formatMessage("titledetail_AreYouSureYouWantToProceed") %></td>
            </tr>
            <tr>
                <td align="center" class="Instruction" colspan="2"><%= MessageHelper.formatMessage("titledetail_YouMayWantToPrintThisPageForYourRecordsBefore") %></td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2">
                    <base:yesNo 
                        buttonYesName="<%=TitleDetailForm.BUTTON_NAME_CONFIRM_DELETE_YES%>"
                        buttonNoName="<%=TitleDetailForm.BUTTON_NAME_CONFIRM_DELETE_NO%>"
                    />
                </td>
            </tr>
        </base:messageBox>
        <base:imageSpacer width="1" height="3"/>
    </logic:equal>
    <%-- Are we confirming a convert to RDA? --%>
    <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="<%=TitleDetailForm.BUTTON_NAME_ACTION%>" value="<%=TitleDetailForm.BUTTON_VALUE_CONFIRM_CONVERT_RDA%>">
        <base:imageSpacer width="1" height="3"/>
        <base:messageBox showRedBorder="true">
            <tr valign="top">
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>

                <td class="ColRowBold"><%= MessageHelper.formatMessage("titledetail_AreYouSureYouWantToChangeThisRecordToRdaFormat") %></td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2">
                    <base:yesNo 
                        buttonYesName="<%=TitleDetailForm.BUTTON_NAME_CONFIRM_CONVERT_RDA_YES%>"
                        buttonNoName="<%=TitleDetailForm.BUTTON_NAME_CONFIRM_CONVERT_RDA_NO%>"
                    />
                </td>
            </tr>
        </base:messageBox>
        <base:imageSpacer width="1" height="3"/>
    </logic:equal>
        
    <logic:present name="<%=TitleDetailForm.FORM_NAME%>" property="holdMessageHeader">
        <base:imageSpacer width="1" height="3"/>
        <base:messageBox>
            <tr valign="top" align="center">
                <td class="ColRowBold" align="center"><bean:write name="<%=TitleDetailForm.FORM_NAME%>" property="holdMessageHeader"/></td>
            </tr>
    <logic:present name="<%=TitleDetailForm.FORM_NAME%>" property="holdMessage">
            <tr align="center">
                <td class="ColRow" align="center"><bean:write name="<%=TitleDetailForm.FORM_NAME%>" property="holdMessage"/></td>
            </tr>
    </logic:present>
        </base:messageBox>
        <base:imageSpacer width="1" height="3"/>
    </logic:present>

<table width="95%" id="<%=TitleDetailForm.TABLE_MARC_DISPLAY_TABS%>" border="0" cellpadding="0" cellspacing="0">

    <tr>
        <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="<%=TitleDetailForm.FIELD_ALLIANCE_RECORD%>" value="true">
            <td class="SmallFixed" valign="bottom" nowrap><base:image src="/icons/general/aplus.gif" width="20" height="16" alt='<%= MessageHelper.formatMessage("titledetail_RecordFromAlliancePlusOnline") %>'/>&nbsp;
            <%=MessageHelper.formatMessage("titledetail_ThisRecordIsFromAlliancePlusOnline")%></td>
        </logic:equal>
        <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="<%=TitleDetailForm.FIELD_ALLIANCE_AV_RECORD%>" value="true">
            <td class="SmallFixed" valign="bottom" nowrap><base:image src="/icons/general/av.gif" width="20" height="16" alt='<%= MessageHelper.formatMessage("titledetail_RecordFromAllianceAV") %>'/>&nbsp;
            <%=MessageHelper.formatMessage("titledetail_ThisRecordIsFromAllianceAV")%></td>
        </logic:equal>
        <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="<%=TitleDetailForm.FIELD_Z_RECORD%>" value="true">
            <td class="SmallFixed" valign="bottom" nowrap><base:image src="/icons/general/zrecord.gif" alt='<%= MessageHelper.formatMessage("titledetail_RecordFrom0", form.getZsourceName())%>' width="16" height="18" />&nbsp;
            <%=MessageHelper.formatMessage("titledetail_ThisRecordIsFromZ", form.getZsourceName())%></td>
        </logic:equal>

        <base:spanIfAllowed permission='<%=Permission.CAT_VIEW_MARC_FORMAT%>'>
            <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="externalRecord" value="false">
                <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="viewType" value='<%=""+TitleDetailForm.VIEW_TYPE_MARC%>'>
                    <%= form.writeLastModifiedAndAdded() %>
                </logic:equal>
            </logic:equal>
        </base:spanIfAllowed>

        <!-- property ViewType: -->
        <!-- value 0 = Title -->
        <!-- value 1 = Marc -->
        <!-- value 2 = Copies -->

        <!-- Title Detail Tabs -->

    </tr>
        <tr><td colspan="2">

<base:outlinedTableAndTabsWithinThere borderColor='#c0c0c0' width="100%" cellpadding="0" selectedTab="<%=form.getSelectedTab()%>" tabs="<%=form.getTabs()%>">
    <tr>
        <td valign="top">

        <!-- Only show this stuff if we are in MARC view or Title Detail view -->
        <logic:notEqual name="<%=TitleDetailForm.FORM_NAME%>" property="viewType" value='<%=""+TitleDetailForm.VIEW_TYPE_COPIES%>'>
            <table id="<%=TitleDetailForm.TABLE_TITLE_OUTLINE%>" border="0" cellpadding="0" cellspacing="0" width="100%">
                <tr>
                    <td valign="top" width="100%">
                    <table id="<%=TitleDetailForm.TABLE_TITLE_COLLECTOR%>" width="100%"><tr><td valign="top">
                    <c:choose>
                        <c:when test="<%=form.getViewType() == TitleDetailForm.VIEW_TYPE_DETAILS %>">
                            <table id="<%=TitleDetailForm.TABLE_TITLE_HEADER%>" border="0" cellpadding="0" cellspacing="0" width="100%">
                                <tr>
                                    <td valign="top">
                                        <table id="<%=TitleDetailForm.TABLE_TITLE_PEEK%>" cellSpacing="0" cellPadding="0" width="100%" border="0">
                                        <tr>
                                            <td valign="top" align="center">
                                                <!-- TitlePeek image -->
                                                <%=form.getTitlePeekLink(store, true)%>
    
                                                <!-- Spine Label table - only if NOT alliance or Z39.50 -->
                                                <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="showSpineLabel" value="true">
                                                    <table id="<%=TitleDetailForm.TABLE_SPINE_LABEL%>" border="1" cellpadding="5" width="100%" cellspacing="0" bordercolor="#c0c0c0" style="BORDER-COLLAPSE: collapse">
                                                        <tr>
                                                            <td class="TableHeading2" align="center">
                                                                <!-- Spine Label -->
                                                                <%= ResponseUtils.filter(form.getSpineLabelCallNumber()) %>
                                                            </td>
                                                        </tr>
                                                    </table>
                                                </logic:equal>
                                                <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="showSpineLabel" value="false">
                                                    &nbsp;
                                                </logic:equal>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td align="center" class="SmallColHeading" nowrap="nowrap">
                                                <%=form.getTitlePeekLink(store, false)%>
                                            </td>
                                        </tr>
                                        </table>
                                    </td>
                                    <td valign="top" width="100%">
    
    
                                        <!-- Title information -->
                                        <table id="<%=TitleDetailForm.TABLE_TITLE_DETAIL%>" cellpadding="2" cellspacing="0">
                                            <%= form.getTitleInformation() %>
                                        </table>
    
                                        <!-- Copy availability information (if not alliance) -->
                                        <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="showAvailabilityInfo" value="true">
    
                                             <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="districtUser" value="true">
                                                <table id="<%=TitleDetailForm.TABLE_COPY_AVAIL%>" cellpadding="0" cellspacing="0" width="100%">
                                                <tr>
                                                    <td colspan="2" align="center"><base:imageLine height="1" width="98%" vspace="2"/></td>
                                                </tr>
                                                <tr>
                                                    <td colspan="2" align="center">
                                                        <table id="<%=TitleDetailForm.TABLE_COPIES_SUMMARY%>" cellpadding="6" cellspacing="0">
                                                            <tr>
                                                                <%form.outputAvailabilityInfo(out, request);%>
                                                            </tr>
                                                        </table>
                                                    </td>
                                                </tr>
                                                </table>
                                            </logic:equal>
                                             <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="districtUser" value="false">
                                                <table id="<%=TitleDetailForm.TABLE_COPY_AVAIL%>" cellpadding="0" cellspacing="0" width="100%">
                                                <tr>
                                                    <td colspan="3" align="center"><base:imageLine height="1" width="98%" vspace="2"/></td>
                                                </tr>
                                                <tr>
                                                   <td align="left">
                                                    <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="showCallNumber" value="true">
                                                        <table id="<%=TitleDetailForm.TABLE_COPY_CALL_AND_SUBLOCATION%>" cellpadding="6" cellspacing="0">
                                                                <%form.outputCallAndSubLocationInfo(out, request);%>
                                                        </table>
                                                    </logic:equal>
                                                </td>
                                                <td align="center">
                                                    <table id="<%=TitleDetailForm.TABLE_COPIES_SUMMARY%>" cellpadding="6" cellspacing="0">
                                                            <%form.outputAvailabilityInfo(out, request);%>
                                                    </table>
                                                </td>
                                                <td width="30%">&nbsp;</td>
                                                </tr>
                                                </table>
                                            </logic:equal>
                                        </logic:equal>
                                        <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="showAvailabilityInfo" value="false">
                                            <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="showCallNumber" value="true">
                                                <table id="<%=TitleDetailForm.TABLE_COPY_AVAIL%>" cellpadding="0" cellspacing="0" width="100%">
                                                    <tr>
                                                        <td colspan="2" align="center"><base:imageLine height="1" width="98%" vspace="2"/></td>
                                                    </tr>
                                                    <tr>
                                                        <td align="left">
                                                            <table id="<%=TitleDetailForm.TABLE_COPY_CALL_AND_SUBLOCATION%>" cellpadding="6" cellspacing="0">
                                                                    <%form.outputCallAndSubLocationInfo(out, request);%>
                                                            </table>
                                                        </td>
                                                    </tr>
                                                </table>
                                            </logic:equal>
                                        </logic:equal>
    
                                        <!-- Summary of notes -->
                                        <%= form.getNoteSummary() %>
                                        
                                        <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="shelfBib" value="false">
                                            <!-- Review Summary -->
                                            <c:set var="reviewSummary" value="<%=form.getReviewSummary() %>"/>
                                            <c:if test="${reviewSummary.reviewAverage > 0}">
                                                <table id="<%= TitleDetailForm.TABLE_REVIEW_SUMMARY %>" cellpadding="2" cellspacing="0" width="100%">
                                                  <c:if test="<%= StringHelper.isEmpty(form.getNoteSummary())%>">
                                                    <tr><td width="100%"><base:imageLine/></td></tr>
                                                  </c:if>                                        
                                                    <tr>
                                                        <td class="SmallColHeading">
                                                            <base:reviewStars value="${reviewSummary.reviewAverage}"/>&nbsp;
                                                            (<base:link href="<%= form.getReviewLink() %>" id="<%=TitleDetailForm.ID_REVIEWS_COUNT %>">
                                                                <%= form.getReviewLinkString() %>
                                                            </base:link>)
                                                        </td>
                                                    </tr>
                                                </table>
                                            </c:if>
                                        </logic:equal>
                                    </td>
                                </tr>
                                <!-- added not present for 7202 etg -->
    
                                <logic:notPresent name="<%=TitleDetailForm.FORM_NAME%>" property="<%= TitleDetailForm.PARAM_CURRENT_BIB_ID %>">
                                <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="canDoBookList" value="true">
                                    <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="externalRecord" value="false">
                                        <tr>
                                            <td colspan="2" align="center">
                                                <base:myListSelect name="<%= TitleDetailForm.FIELD_LIST_ID %>" submitOnChange="true" prompt='<%=MessageHelper.formatMessage("titledetail_SelectedList") %>' dropDownClass="SmallColRow"/>&nbsp;
                                                
                                                <logic:notEqual name="<%=TitleDetailForm.FORM_NAME%>" property="addToMyListLink" value="">
                                                    <base:link page='<%= form.getAddToMyListLink() %>' id="<%=TitleDetailForm.ID_ADD_TO_MYLIST %>">
                                                    <base:image src='/buttons/small/addtothislist.gif' alt='<%= MessageHelper.formatMessage("addToThisList")  %>' />
                                                    </base:link>
                                                </logic:notEqual>
                                                <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="addToMyListLink" value="">
                                                    <%= form.buildInMyListLink() %>
                                                </logic:equal>
                                            </td>
                                        </tr>
                                    </logic:equal>
                                </logic:equal>
                                </logic:notPresent>
                            </table> <!-- end of the titleHeader table-->
                    </td>
                </tr>
                <tr>
                    <td valign="top">
                     
                        <%=form.getDetailsNavTable()%>
                        
                        <!-- populate title details -->

                       <%=form.getTitleDetails()%>
                            
                        </c:when>
                        <c:when test="<%=form.getViewType() == TitleDetailForm.VIEW_TYPE_MARC %>">
                        <table  id="<%=TitleDetailForm.TABLE_MARC_VIEW_HEADER%>" border="0" width="100%" cellpadding="2" cellspacing="0">
                            <tr>
                                <td>
                                    <table id="<%=TitleDetailForm.TABLE_TITLE_DETAIL%>" cellpadding="2" cellspacing="0">
                                        <%= form.getTitleInformation() %>
                                    </table>
                                </td>
                            </tr>
                            <!-- added not present for 7202 etg -->

                            <logic:notPresent name="<%=TitleDetailForm.FORM_NAME%>" property="<%= TitleDetailForm.PARAM_CURRENT_BIB_ID %>">
                            <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="canDoBookList" value="true">
                                <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="externalRecord" value="false">
                                    <tr>
                                        <td colspan="2" align="center">
                                            <base:myListSelect name="<%= TitleDetailForm.FIELD_LIST_ID %>" submitOnChange="true" prompt='<%=MessageHelper.formatMessage("titledetail_SelectedList") %>' dropDownClass="SmallColRow"/>&nbsp;
                                            
                                            <logic:notEqual name="<%=TitleDetailForm.FORM_NAME%>" property="addToMyListLink" value="">
                                                <base:link page='<%= form.getAddToMyListLink() %>' id="<%=TitleDetailForm.ID_ADD_TO_MYLIST %>">
                                                <base:image src="/buttons/small/addtothislist.gif" alt='<%=MessageHelper.formatMessage("addToThisList") %>'/>
                                                </base:link>
                                            </logic:notEqual>
                                            <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="addToMyListLink" value="">
                                                <%= form.buildInMyListLink() %>
                                            </logic:equal>
                                        </td>
                                    </tr>
                                </logic:equal>
                            </logic:equal>
                            </logic:notPresent>
                            <tr>
                                <td colspan="2" align="center"><base:imageLine height="1" width="98%" vspace="2"/></td>
                            </tr>
                            <tr>
                                <td>
                                    <table id="<%=TitleDetailForm.TABLE_MARC_VIEW%>">
                                      <jsp:include page="/cataloging/marctagview.jsp" flush="true">
                                        <jsp:param name="myForm" value="<%=TitleDetailForm.FORM_NAME%>"/>
                                      </jsp:include>
                                    </table>
                                </td>
                            </tr>
                        </table>                        
                        </c:when>
                        <c:when test="<%=form.getViewType() == TitleDetailForm.VIEW_TYPE_REVIEWS %>">
                        <table id="<%=TitleDetailForm.TABLE_REVIEW_HEADER%>" border="0" width="100%" cellpadding="2" cellspacing="0">
                            <tr>
                                <td>
                                    <table id="<%=TitleDetailForm.TABLE_TITLE_DETAIL%>" cellpadding="2" cellspacing="0">
                                        <%= form.getTitleInformation() %>
                                    </table>
                                </td>
                                <td nowrap class="tdAlignRight">
                                    <table>
                                        <tr>
                                            <td class="tdAlignRight">
                                                <c:if test="<%= TitleAEDSpecs.SITE_BIB_STATUS_LOCAL_AND_OTHER_SITES == form.getSiteBibStatus() || TitleAEDSpecs.SITE_BIB_STATUS_LOCAL_SITE_ONLY == form.getSiteBibStatus() %>">
                                                    <base:link permission='<%= Permission.CAT_SUBMIT_LIBRARY_REVIEWS %>' page='<%= form.getAddReviewLink() %>' id="<%=TitleDetailForm.ID_ADD_REVIEW %>">
                                                        <base:image src="/buttons/large/addreview.gif" alt='<%= MessageHelper.formatMessage("addReview") %>'/>
                                                    </base:link>
                                                </c:if>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="tdAlignRight">
                                                <nobr>
                                                  <% if(form.getPreviousBibID() != null) { %>
                                                     <base:link page='<%= form.getPreviousRecordLink() %>' id="<%=TitleDetailForm.ID_PREVIOUS_TITLE %>">
                                                        <base:image align="top" src="/icons/general/previouslonger.gif" width="44" height="26"  alt='<%= MessageHelper.formatMessage("titledetail_PreviousTitle") %>'/>
                                                     </base:link>
                                                   <% } else { %>
                                                     <base:imageSpacer width="44" height="26"/>
                                                   <% } %>
                                                   <% if(form.getNextBibID() != null) { %>
                                                      <base:link page='<%= form.getNextRecordLink() %>' id="<%=TitleDetailForm.ID_NEXT_TITLE %>">
                                                        <base:image align="top" src="/icons/general/nextlonger.gif" width="44" height="26"  alt='<%= MessageHelper.formatMessage("titledetail_NextTitle") %>'/>
                                                      </base:link>
                                                   <% } else { %>
                                                      <base:imageSpacer width="44" height="26"/>
                                                   <% } %>
                                                </nobr>
                                            </td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2" align="center"><base:imageLine height="1" width="98%" vspace="2"/></td>
                            </tr>
                            <tr>
                                <td colspan="2">
                                    <jsp:include page="/cataloging/bibreview.jsp" flush="true">
                                        <jsp:param name="myForm" value="<%=TitleDetailForm.FORM_NAME%>"/>
                                    </jsp:include>
                                </td>
                            </tr>                            
                        </table>
                        </c:when>
                    </c:choose>
                    </td>
                </tr>
                <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="viewType" value='<%=""+TitleDetailForm.VIEW_TYPE_DETAILS%>'>

                    <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="displayTopLink" value="true">
                    <tr>
                        <td  class="SmallColRow tdAlignRight" vAlign="bottom">
                            <a class="DetailLink" href="#TheTop"><%=MessageHelper.formatMessage("titledetail_Top")  %></a>
                        </td>
                    </tr>
                    </logic:equal>

                </logic:equal>
                </table>
                    <c:if test="<%= form.getViewType() != TitleDetailForm.VIEW_TYPE_REVIEWS %>">
                    <td valign="top" class="ColRowBold tdAlignRight">
                        <!-- Action Button table -->
                        <base:showHideTag id="onSave">
                        <table id="<%=TitleDetailForm.TABLE_ACTION_ICONS%>" border="0" cellpadding="2" cellspacing="0">
                        <c:choose>
                        <c:when test="<%=!form.showReplaceWishListItemButton() %>">

                            <logic:present name="<%=TitleDetailForm.FORM_NAME%>" property="<%= TitleDetailForm.PARAM_CURRENT_BIB_ID %>">
                                <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="<%= TitleDetailForm.FIELD_ALLIANCE_RECORD %>" value="true">
                                    <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="mediaSearchInLibrarySite" value="false">
                                        <tr>
                                            <td class="tdAlignRight">
                                                    <base:link page='<%= form.getReconReplaceLink() %>' id="<%=TitleDetailForm.ID_RECON_REPLACE %>">
                                                <base:image src="/buttons/large/replace.gif" alt='<%= MessageHelper.formatMessage("replace") %>'/>
                                                    </base:link>
                                            </td>
                                        </tr>
                                    </logic:equal>
                                </logic:equal>

                                <tr>
                                    <td class="tdAlignRight">
                                         <base:closeButton withX="true" name="<%=TitleDetailForm.BUTTON_NAME_RECON_CLOSE %>"/>
                                   </td>
                                </tr>
                            </logic:present>
                            <logic:notPresent name="<%=TitleDetailForm.FORM_NAME%>" property="<%= TitleDetailForm.PARAM_CURRENT_BIB_ID %>">
                                <base:spanIfAllowed permissions='<%=new Permission[]{Permission.CAT_ADD_TITLES, Permission.CAT_DUPLICATE_TITLES, Permission.CAT_EDIT_TITLES, Permission.CAT_DELETE_TITLES}%>'>
                                    <logic:notEqual name="<%=TitleDetailForm.FORM_NAME%>" property="saveTitleLink" value="">
                                        <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="mediaSearchInLibrarySite" value="false">
                                            <tr>
                                                <td class="tdAlignRight">
                                                        <base:link page='<%= form.getSaveTitleLink() %>' id="<%=TitleDetailForm.ID_SAVE_TITLE %>">
                                                    <base:image src="/buttons/large/savetitle.gif" onClick="hideElementonSave()" alt='<%=MessageHelper.formatMessage("saveTitle") %>'/>
                                                        </base:link>
                                                </td>
                                            </tr>
                                        </logic:equal>
                                    </logic:notEqual>
    
    
                                    <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="externalRecord" value="false">
                                        <logic:notEqual name="<%=TitleDetailForm.FORM_NAME%>" property="editLink" value="">
                                            <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="mediaSearchInLibrarySite" value="false">
                                                <tr>
                                                    <td class="tdAlignRight">
                                                                <base:link permission='<%= Permission.CAT_EDIT_TITLES %>' page='<%= form.getEditLink() %>' id="<%=TitleDetailForm.ID_EDIT_TITLE %>">
                                                        <base:image src="/buttons/large/edittitle.gif" alt='<%=MessageHelper.formatMessage("editTitle")%>'/>
                                                                </base:link>
                                                    </td>
                                                </tr>
                                            </logic:equal>
                                        </logic:notEqual>
    
                                        <logic:notEqual name="<%=TitleDetailForm.FORM_NAME%>" property="convertRdaLink" value="">
                                            <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="mediaSearchInLibrarySite" value="false">
                                                <tr>
                                                    <td class="tdAlignRight">
                                                                <base:link permission='<%= Permission.CAT_EDIT_TITLES %>' page='<%= form.getConvertRdaLink() %>' id="<%=TitleDetailForm.ID_CONVERT_RDA %>">
                                                        <base:image src="/buttons/large/convertToRDA.gif" alt='<%=MessageHelper.formatMessage("titledetail_ConvertToRda") %>'/>
                                                                </base:link>
                                                    </td>
                                                </tr>
                                            </logic:equal>
                                        </logic:notEqual>
                                        <logic:notEqual name="<%=TitleDetailForm.FORM_NAME%>" property="duplicateLink" value="">
                                            <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="mediaSearchInLibrarySite" value="false">
                                                <tr>
                                                    <td class="tdAlignRight">
                                                                <base:link permission='<%= Permission.CAT_DUPLICATE_TITLES %>' page='<%= form.getDuplicateLink() %>' id="<%=TitleDetailForm.ID_DUPLICATE_TITLE %>">
                                                        <base:image src="/buttons/large/duplicatetitle.gif" alt='<%=MessageHelper.formatMessage("duplicateTitle")%>'/>
                                                                </base:link>
                                                    </td>
                                                </tr>
                                            </logic:equal>
                                        </logic:notEqual>
    
                                        <logic:notEqual name="<%=TitleDetailForm.FORM_NAME%>" property="deleteLink" value="">
                                            <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="mediaSearchInLibrarySite" value="false">
                                                <tr>
                                                    <td class="tdAlignRight">
                                                            <base:link page='<%= form.getDeleteLink() %>' id="<%=TitleDetailForm.ID_DELETE_TITLE %>">
                                                        <base:image src="/buttons/large/deletetitle.gif" alt='<%=MessageHelper.formatMessage("deleteTitle")%>'/>
                                                            </base:link>
                                                    </td>
                                                </tr>
                                            </logic:equal>
                                        </logic:notEqual>
                                        
                                        <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="mediaSite" value="true">
                                            <tr>
                                                <td class="tdAlignRight">
                                                    <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="bibAssociated" value="true">
                                                        <base:link permission='<%=Permission.BACK_OFFICE_AED_MEDIA_POLICIES%>' page='<%= form.getAddLoanPeriodLink() %>' id="<%=TitleDetailForm.ID_ADD_LOAN_PERIOD %>">
                                                        <base:image src="/buttons/large/addloanperiod.gif" alt='<%=MessageHelper.formatMessage("addLoanPeriod")%>'/>
                                                        </base:link>
                                                    </logic:equal>
                                                </td>
                                            </tr>
                                        </logic:equal>
    
                                        <tr>
                                            <td>
                                                <base:imageSpacer width="10" height="10"/>
                                            </td>
                                        </tr>
                                    </logic:equal>
                                </base:spanIfAllowed>

                                <% boolean outputButton = false; %>
                                <base:spanIfAllowed permission='<%=Permission.CAT_ADD_COPIES%>'>
                                    <logic:notEqual name="<%=TitleDetailForm.FORM_NAME%>" property="addCopyLink" value="">
                                        <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="mediaSearchInLibrarySite" value="false">
                                            <tr>
                                                <td class="tdAlignRight">
                                                    <%outputButton = true;%>
                                                    <base:link page='<%= form.getAddCopyLink() %>' id="<%=TitleDetailForm.ID_ADD_COPIES %>">
                                                    <base:image src="/buttons/large/addcopies.gif" alt='<%=MessageHelper.formatMessage("addCopies")%>'/>
                                                    </base:link>
                                                </td>
                                            </tr>
                                        </logic:equal>
                                    </logic:notEqual>
                                </base:spanIfAllowed>
    

                                <c:if test="<%= form.showAddToWishListButton() %>">
                                    <base:spanIfAllowed permission='<%=Permission.CAT_ADD_TO_BIB_WISH_LIST%>'>
                                        <tr>
                                            <td class="tdAlignRight">
                                                <%outputButton = true;%>
                                                <base:link page='<%= form.getWishlistLink() %>' id="<%=TitleDetailForm.ID_ADD_TO_WISH_LIST %>">
                                                <base:image src="/buttons/large/addtowishlist.gif" alt='<%=MessageHelper.formatMessage("addToWishList")%>'/>
                                                </base:link>
                                            </td>
                                        </tr>
                                    </base:spanIfAllowed>            
                                </c:if>
                                <c:if test="<%= form.showRecommendToOthers() %>">
                                    <base:spanIfAllowed permission='<%=Permission.CAT_RECOMMEND_TITLES_TO_OTHER_USERS%>'>
                                        <tr>
                                            <td class="tdAlignRight">
                                                <%outputButton = true;%>
                                                 <base:link page='<%="/cataloging/servlet/presentrecommendtitleform.do?bibID=" + form.getBibID()%>' id="<%=TitleDetailForm.ID_RECOMMEND_TITLE %>">
                                                     <base:image src="/buttons/large/recommendtitle.gif" 
                                                            alt='<%= MessageHelper.formatMessage("recommend") %>'/>
                                                </base:link>
                                            </td>
                                        </tr>
                                    </base:spanIfAllowed>            
                                </c:if>
                                
                                
                                <base:spanIfAllowed permission='<%=Permission.CAT_EDIT_TITLES%>'>
                                    <c:if test="<%= form.showUpdateImageButton() %>">
                                        <tr>
                                            <td class="tdAlignRight">
                                                <base:link page='<%="/common/servlet/presenteditimageform.do?objectID=" + form.getBibID()%>' id="<%=TitleDetailForm.ID_MEDIA_IMAGE %>">
                                                <base:image src="/buttons/large/updateimage.gif" alt='<%=MessageHelper.formatMessage("image") %>'/>
                                                </base:link>
                                            </td>
                                        </tr>
                                    </c:if>
                                </base:spanIfAllowed>
                                <base:spanIfAllowed permission='<%=Permission.CAT_UPDATE_READING_PROGRAM%>'>
                                    <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="mediaCollectionType" value="false">
                                        <logic:notEqual name="<%=TitleDetailForm.FORM_NAME%>" property="editReadingProgramLink" value="">
                                            <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="mediaSearchInLibrarySite" value="false">
                                                <tr>
                                                    <td class="tdAlignRight">
                                                        <%outputButton = true;%>
                                                        <base:link page='<%= form.getEditReadingProgramLink() %>' id="<%=TitleDetailForm.ID_EDIT_QUIZ_INFO %>">
                                                        <base:image src="/buttons/large/readingprogram.gif" alt='<%=MessageHelper.formatMessage("editQuizInfo") %>'/>
                                                        </base:link>
                                                    </td>
                                                </tr>
                                            </logic:equal>
                                        </logic:notEqual>
                                    </logic:equal>
                                </base:spanIfAllowed>

                                <base:spanIfAllowed permission='<%=Permission.CAT_AED_SITE_SPECIFIC_SUBJECTS%>'>
                                <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="mediaCollectionType" value="false">
                                <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="temporaryTitle" value="false">
                                <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="<%=TitleDetailForm.FIELD_ALLIANCE_RECORD%>" value="false">
                                <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="externalRecord" value="false">
                                    <tr>
                                        <td class="tdAlignRight">
                                            <%outputButton = true;%>
                                            <base:link page='<%= form.getSiteSpecificSubjectLink() %>' id="<%=TitleDetailForm.ID_SITE_SPECIFIC_SUBJECT %>">
                                            <base:image src="/buttons/large/sitesubjects.gif" alt='<%=MessageHelper.formatMessage("siteSubjects") %>'/>
                                            </base:link>
                                        </td>
                                    </tr>
                                </logic:equal>
                                </logic:equal>
                                </logic:equal>    
                                </logic:equal>
                                </base:spanIfAllowed>

                                <base:spanIfAllowed permission='<%=Permission.CAT_AED_SITE_SPECIFIC_WEBINFO%>'>
                                <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="localEbook" value="true">
                                    <tr>
                                        <td class="tdAlignRight">
                                            <%outputButton = true;%>
                                            <base:link page='<%= form.getSiteSpecificWebInfoLink() %>' id="<%=TitleDetailForm.ID_SITE_SPECIFIC_WEB_INFO %>">
                                            <base:image src="/buttons/large/sitewebinfo.gif" alt='<%=MessageHelper.formatMessage("titledetail_LocalWebSites")%>'/>
                                            </base:link>
                                        </td>
                                    </tr>
                                </logic:equal>
                                </base:spanIfAllowed>

                                <base:spanIfAllowed collectionType="<%=form.gimmeDetailValueCollectionType() %>" permissions="<%= new Permission[] { Permission.CAT_AED_DIGITAL_RESOURCES, Permission.CAT_AED_TEXTBOOK_DIGITAL_RESOURCES } %>">
                                <c:if test="<%= form.showDigitalResourcesButton() %>">
                                    <tr>
                                        <td class="tdAlignRight">
                                            <%outputButton = true;%>
                                            <base:link page='<%= form.gimmeUpdateDigitalResourcesLink() %>' id='<%=TitleDetailForm.ID_DIGITAL_RESOURCES %>'>
                                            <base:image src="/buttons/large/digitalresources.gif" alt='<%=MessageHelper.formatMessage("addDigitalContent") %>'/>
                                            </base:link>
                                        </td>
                                    </tr>
                                </c:if>
                                </base:spanIfAllowed>

                                <% if ( outputButton ) { %>
                                <tr>
                                    <td>
                                        <base:imageSpacer width="10" height="10"/>
                                    </td>
                                </tr>
                                <% } %>
    
                                <% boolean outputNewLineAfterEBookImages = false; %>
                                <logic:notEqual name="<%=TitleDetailForm.FORM_NAME%>" property="previewFollettEBookLink" value="">
                                <tr>
                                    <td class="tdAlignRight">
                                        <base:link page='<%= form.getPreviewFollettEBookLink() %>' target='_blank' id='<%=TitleDetailForm.ID_READ_ONLINE %>'>
                                        <base:image src="/buttons/large/ebook_read_online.gif" alt='<%= MessageHelper.formatMessage("titledetail_ReadOnline") %>'/> 
                                        </base:link>
                                    </td>
                                    <% outputNewLineAfterEBookImages = true; %>
                                </tr>
                                </logic:notEqual>
                                
                                <base:spanIfAllowed collectionType="<%=CollectionType.LIBRARY %>" permissions="<%=TitleDetailForm.CHECKOUT_EBOOK_PERMS %>">
    
                                <logic:notEqual name="<%=TitleDetailForm.FORM_NAME%>" property="checkoutFollettEBookReadOnlineLink" value="">
                                <tr>
                                    <td class="tdAlignRight">
                                        <table id="<%=TitleDetailForm.TABLE_EBOOK_CHECKOUT%>" border="0" cellpadding="2" cellspacing="0">
                                            <base:spanIfAllowed collectionType="<%=CollectionType.LIBRARY %>" permission="<%=Permission.CIRC_SELF_CHECKOUT_FOLLETT_EBOOKS_ONLINE %>">
                                            <tr>
                                                <td align="center">
                                                    <base:link page='<%= form.getCheckoutFollettEBookReadOnlineLink() %>' id='<%=TitleDetailForm.ID_FOLLETT_EBOOK_CHECKOUT_ONLINE %>'>
                                                    <base:image src="/buttons/large/checkout_ebook.gif" alt='<%= MessageHelper.formatMessage("titledetail_CheckOutOnline") %>'/>
                                                    </base:link>
                                                </td>
                                            </tr>
                                            </base:spanIfAllowed>
                                            <% outputNewLineAfterEBookImages = true; %>
                                        </table>
                                    </td>
                                </tr>
                                </logic:notEqual>
                                </base:spanIfAllowed>
                                
                                <% if ( outputNewLineAfterEBookImages ) { %>
                                <tr>
                                    <td>
                                        <base:imageSpacer width="10" height="10"/>
                                    </td>
                                </tr>
                                <% } %>
    
                                <logic:notEqual name="<%=TitleDetailForm.FORM_NAME%>" property="addHoldLink" value="">
                                <tr>
                                    <td class="tdAlignRight">
                                        <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="mediaCollectionType" value="false">
                                            <base:link page='<%= form.getAddHoldLink() %>' id="<%=TitleDetailForm.ID_HOLD_TITLE %>">
                                                <base:image src="/buttons/large/holditbig.gif" alt='<%= MessageHelper.formatMessage("holdIt") %>'/> 
                                            </base:link>
                                        </logic:equal>
                                        <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="mediaCollectionType" value="true">
                                            <% if (!form.isFollettEbook()) { %>
                                                <base:link page='<%= form.getAddHoldLink() %>' id="<%=TitleDetailForm.ID_BOOK_TITLE %>">
                                                    <base:image src="/buttons/large/bookit.gif" alt='<%= MessageHelper.formatMessage("titledetail_BookIt") %>'/>
                                                </base:link>
                                            <% } %>
                                        </logic:equal>
                                        <c:if test="<%=form.getBookSeriesLink() != null%>">
                                            <base:link page="<%=form.getBookSeriesLink()%>" id="<%=TitleDetailForm.ID_BOOK_SERIES %>">
                                                <base:image src="/buttons/large/bookseries.gif" alt='<%= MessageHelper.formatMessage("titledetail_BookSeries") %>'/>
                                            </base:link>
                                        </c:if>
                                    </td>
                                </tr>
                                </logic:notEqual>
                                
                                <logic:notEqual name="<%=TitleDetailForm.FORM_NAME%>" property="readItLink" value="">
                                    <tr>
                                        <td class="tdAlignRight">
                                            <base:link page="<%=form.getReadItLink()%>" target='_blank' id="<%=TitleDetailForm.ID_READ_FOLLETT_EBOOK %>">
                                             <c:choose>
                                                <c:when test="<%=form.isFollettAudioBook()%>">
                                                 <base:image src="/buttons/large/play.gif" alt='<%= MessageHelper.formatMessage("titleDetailsController_playIt") %>'/>
                                               </c:when>
                                              <c:otherwise>
                                                   <base:image src="/buttons/large/open.gif" alt='<%= MessageHelper.formatMessage("titleDetailsController_readIt") %>'/>
                                                </c:otherwise>
                                            </c:choose>
                                           </base:link>
                                        </td>
                                    </tr>
                                </logic:notEqual>
                                 <% if (form.isThirdPartyVendorRecord() && !form.isDistrictUser()) { %>
                                    <tr>
                                        <td class="tdAlignRight">
                                             <base:link page="<%=form.gimmeVendorURL()%>" target='_blank' id="<%=TitleDetailForm.ID_THIRD_PARTY_VENDOR %>">
                                                <base:image src="/buttons/large/open.gif" alt='<%= MessageHelper.formatMessage("titleDetailsController_readIt") %>'/>
                                            </base:link>
                                        </td>
                                    </tr>
                                <% } else if (form.isShowNonFolletteBookButton()) { //not a shelf or overdrive record, standard ebook %>
                                <logic:notEqual name="<%=TitleDetailForm.FORM_NAME%>" property="readItNonFollettLink" value="">
                                    <tr>
                                        <td class="tdAlignRight">
                                            <base:link page="<%=form.getReadItNonFollettLink()%>" target='_blank' id="<%=TitleDetailForm.ID_READ_NON_FOLLETT_EBOOK %>">
                                                <base:image src="/buttons/large/open.gif" alt='<%= MessageHelper.formatMessage("titleDetailsController_readIt") %>'/>
                                            </base:link>
                                        </td>
                                    </tr>
                                </logic:notEqual>
                                <%} %>
                                
                                
                                <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="selectedTab" value="<%=form.ID_DETAILED_VIEW%>">
                                    <% if (!form.isAllianceRecord() && !form.isAllianceAVRecord() && !form.isZrecord() && !form.isTemporaryTitle() && form.isBibAssociated()) { %>
                                        <base:spanIfAllowed collectionType="<%=CollectionType.LIBRARY %>" permission="<%=Permission.ABLE_TO_POST_TO_SOCIAL_MEDIA_SITES %>" >
                                        <tr>
                                            <td>
                                                <base:imageSpacer width="10" height="10"/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="tdAlignRight">
                                                <!-- AddThis Button BEGIN -->
                                                <div class="addthis_toolbox addthis_default_style addthis_32x32_style" addthis:url=<%=form.getMediaURL()%>>
                                                    <a class="addthis_button_facebook" id="facebook"></a>
                                                    <a class="addthis_button_twitter" id="twitter" addthis:title="<%= form.getTitleTruncatedForTwitter() %>"></a>
                                                </div>
                                                <% if (System.getProperty(DestinyConfigProperties.PROPERTY_DISABLE_ADD_THIS) == null){ //need to turn off as it errors when running AT's %>
                                                    <script type="text/javascript" src="https://s7.addthis.com/js/250/addthis_widget.js#pubid=ra-4f2ffb8101228953"></script>
                                                <% } %>
                                                <!-- AddThis Button END -->
                                            </td>
                                        </tr>
                                        </base:spanIfAllowed>
                                    <% } %>
                                </logic:equal>
                                <tr>
                                    <td class="Instruction" nowrap>
                                    <% if(form.getPreviousBibID() != null) { %>
                                        <base:link page='<%= form.getPreviousRecordLink() %>' id="<%=TitleDetailForm.ID_PREVIOUS_TITLE %>">
                                        <base:image align="top" src="/icons/general/previouslonger.gif" width="44" height="26"  alt='<%= MessageHelper.formatMessage("titledetail_PreviousTitle") %>'/>
                                        </base:link>
                                    <% } else { %>
                                        <base:imageSpacer width="44" height="26"/>
                                    <% } %>
                                    <% if(form.getNextBibID() != null) { %>
                                        <base:link page='<%= form.getNextRecordLink() %>' id="<%=TitleDetailForm.ID_NEXT_TITLE %>">
                                        <base:image align="top" src="/icons/general/nextlonger.gif" width="44" height="26"  alt='<%= MessageHelper.formatMessage("titledetail_NextTitle") %>'/>
                                        </base:link>
                                    <% } else { %>
                                        <base:imageSpacer width="44" height="26"/>
                                    <% } %>
                                    </td>
                                </tr>
                                
                            </logic:notPresent>
                            
                        </c:when>
                        <c:otherwise>
                            <tr>
                                 <td class="tdAlignRight">
                                      <base:link page='<%= form.getReplaceWishListItemLink() %>' id="<%=TitleDetailForm.ID_UPDATE_WISH_LIST_TITLE %>">
                                      <base:image src="/buttons/large/updatewishlist.gif" alt='<%= MessageHelper.formatMessage("update") %>'/>
                                      </base:link>
                                 </td>
                            </tr>
                        </c:otherwise>
                        
                        </c:choose>
                            

                        </table>
                        </base:showHideTag>


                    </td>
                    </c:if>
                </tr>

                </table>
        </logic:notEqual>

        <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="viewType" value='<%=""+TitleDetailForm.VIEW_TYPE_COPIES%>'>
            <!-- mini-Title information -->
            <table width="100%" cellpadding="2" cellspacing="0">
                <tr>
                    <td valign="top">
                        <table id="<%=TitleDetailForm.TABLE_TITLE_DETAIL_ON_COPIES_TAB%>" cellpadding="2" cellspacing="0">
                            <%= form.getTitleInformation() %>
                         </table>
                    </td>
                    
                    
                    
                    <td class="tdAlignRight" valign="top">
                        <table id="<%=TitleDetailForm.TABLE_ACTION_ICONS%>" cellpadding="2" cellspacing="0">
                            
                            <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="externalRecord" value="false">
                            
                                <logic:present name="<%=TitleDetailForm.FORM_NAME%>" property="<%= TitleDetailForm.PARAM_CURRENT_BIB_ID %>">
                                    <tr>
                                        <td class="tdAlignRight">
                                             <base:closeButton withX="true" name="<%=TitleDetailForm.BUTTON_NAME_RECON_CLOSE %>"/>
                                       </td>
                                    </tr>
                                </logic:present>
                                <logic:notPresent name="<%=TitleDetailForm.FORM_NAME%>" property="<%= TitleDetailForm.PARAM_CURRENT_BIB_ID %>">
                                    <base:spanIfAllowed permission='<%=Permission.CAT_ADD_COPIES%>'>
                                        <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="mediaSearchInLibrarySite" value="false">
                                            <tr>
                                                <td>
                                                    <%= form.getAddCopyLinkForCopiesTab() %>
                                                </td>
                                            </tr>
                                        </logic:equal>
                                    </base:spanIfAllowed>
                                </logic:notPresent>
                            </logic:equal>
                            <tr>
                                <td nowrap>
                                    <% if(form.getPreviousBibID() != null) { %>
                                        <base:link page='<%= form.getPreviousRecordLink() %>' id="<%=TitleDetailForm.ID_PREVIOUS_TITLE %>">
                                        <base:image align="top" src="/icons/general/previouslonger.gif" width="44" height="26"  alt='<%= MessageHelper.formatMessage("titledetail_PreviousTitle") %>'/>
                                        </base:link>
                                    <% } else { %>
                                        <base:imageSpacer width="44" height="26"/>
                                    <% } %>
                                    <% if(form.getNextBibID() != null) { %>
                                        <base:link page='<%= form.getNextRecordLink() %>' id="<%=TitleDetailForm.ID_NEXT_TITLE %>">
                                        <base:image align="top" src="/icons/general/nextlonger.gif" width="44" height="26"  alt='<%= MessageHelper.formatMessage("titledetail_NextTitle") %>'/>
                                        </base:link>
                                    <% } else { %>
                                        <base:imageSpacer width="44" height="26"/>
                                    <% } %>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><base:imageLine height="1" width="100%"/></td>
                </tr>
            </table>
        </logic:equal>

            </td>
        </tr>


<logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="viewType" value='<%=""+TitleDetailForm.VIEW_TYPE_COPIES%>'>
    <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="externalRecord" value="false">
        <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="mediaSearchInLibrarySite" value="false">
            <tr>
                <td>
                    <A NAME="copyTable"></A>
                    <table id="<%=TitleDetailForm.TABLE_COPY_ITEMS%>" cellspacing="0" width="100%" cellpadding="4" border="0">
                        <tr>
                            <td class="TableHeading2" colspan="6"><%= ResponseUtils.filter(form.getLocalCopyTableHeader(request)) %></td>
                        </tr>

                        <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="districtUser" value="true">
                        <logic:notEqual name="<%=TitleDetailForm.FORM_NAME%>" property="totalCount" value="0">
                            <tr>
                                <td colspan="3">
                                     <base:searchSummary searchType='<%=MessageHelper.formatMessage("titledetail_Copies") %>' 
                                        startOfSet="<%=String.valueOf(itemsToSkip + 1)%>"
                                        endOfSet= "<%=String.valueOf(itemsToPrint)%>"
                                        totalInSet = "<%=String.valueOf(itemsInList)%>"
                                        tooManyHits = "false"/>
                                </td>
                                <td noWrap colspan="3" class="SmallColHeading tdAlignRight">
                                    <base:pageListOutput formName="<%=TitleDetailForm.FORM_NAME%>"/>
                                </td>
                            </tr>
                        </logic:notEqual>
                        </logic:equal>

                        <base:listOutput formName="<%=TitleDetailForm.FORM_NAME%>" />
                    </table>
                </td>
            </tr>
        </logic:equal>
            <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="<%=TitleDetailForm.FIELD_DISTRICT_USER%>" value="false">
                <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="mediaSearchInLibrarySite" value="false">
                    <tr>
                        <td colspan="2">
                            <base:imageLine height="1" width="100%"/>
                        </td>
                    </tr>
                </logic:equal>
                <tr>
                    <td>
                    <A name="<%=BaseTitleDetailForm.ANCHOR_OFF_SITE_COPIES %>"></A>
                        <table id="<%=TitleDetailForm.TABLE_OFFSITE_COPY_ITEMS%>" cellspacing="0" width="100%" cellpadding="4" border="0">
                            <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="seeOffsiteCopies" value="true">
                                <tr>
                                    <td class="TableHeading2" colspan="5">
                                        <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="mediaSearchInLibrarySite" value="false">
                                            <%= MessageHelper.formatMessage("titledetail_OffSite") %>
                                        </logic:equal>
                                        <%= MessageHelper.formatMessage("titledetail_Copies") %>
                                    </td>
                                    <td>&nbsp;</td>
                                </tr>
                                <logic:notEqual name="<%=TitleDetailForm.FORM_NAME%>" property="totalCount" value="0">
                                    <tr>
                                        <td>
                                             <base:searchSummary searchType='<%=MessageHelper.formatMessage("titledetail_Copies") %>' 
                                                startOfSet="<%=String.valueOf(itemsToSkip + 1)%>"
                                                endOfSet= "<%=String.valueOf(itemsToPrint)%>"
                                                totalInSet = "<%=String.valueOf(itemsInList)%>"
                                                tooManyHits = "false"/>
                                        </td>
                                        <td class="SmallColHeading">&nbsp;</td>
                                        <td noWrap colspan="4" class="SmallColHeading tdAlignRight">
                                            <base:pageListOutput formName="<%=TitleDetailForm.FORM_NAME%>"/>
                                        </td>
                                    </tr>
                                </logic:notEqual>
                                <base:listOutput formName="<%=TitleDetailForm.FORM_NAME%>" />
                                <logic:notEqual name="<%=TitleDetailForm.FORM_NAME%>" property="totalCount" value="0">
                                    <tr>
                                        <td>
                                             <base:searchSummary searchType='<%=MessageHelper.formatMessage("titledetail_Copies") %>' 
                                                startOfSet="<%=String.valueOf(itemsToSkip + 1)%>"
                                                endOfSet= "<%=String.valueOf(itemsToPrint)%>"
                                                totalInSet = "<%=String.valueOf(itemsInList)%>"
                                                tooManyHits = "false"/>
                                       </td>
                                       <td class="SmallColHeading">&nbsp;</td>
                                        <td noWrap colspan="4" class="SmallColHeading tdAlignRight">
                                            <base:pageListOutput formName="<%=TitleDetailForm.FORM_NAME%>"/>
                                        </td>
                                    </tr>
                                </logic:notEqual>
                            </logic:equal>
                        </table>
                   </td>
                </tr>
            </logic:equal> <!-- end if not district user -->
    </logic:equal> <!-- end if not alliance record -->
</logic:equal> <!-- end if not copy view -->


</base:outlinedTableAndTabsWithinThere>
</td></tr></table>
</base:form>
</logic:equal>
