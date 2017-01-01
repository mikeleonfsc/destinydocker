<%@page import="com.follett.fsc.destiny.util.ThirdPartyVendorSpecs.Vendor"%>
<%@page import="com.follett.fsc.destiny.util.ThirdPartyVendorSpecs"%>
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
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<div id="viewTypeElem" class="viewTypeElem">

<%TitleDetailForm form = (TitleDetailForm) request
                .getAttribute(TitleDetailForm.FORM_NAME);
            int itemsInList = form.getTotalCount();
            int currentPage = PageCalculator.getCurrentPage(form);
            int itemsToSkip = PageCalculator.getFirstNumberInPage(currentPage,
                form.gimmeMaxRowsToDisplay(), itemsInList);
            int itemsToPrint = PageCalculator.getOnePastLastNumberInPage(
                currentPage, form.gimmeMaxRowsToDisplay(), itemsInList);
%>
<base:messageBox strutsErrors="true"/>

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
    <html:hidden property="<%=TitleDetailForm.FIELD_Z_RECORD%>"/>
    <html:hidden property="<%=TitleDetailForm.FIELD_Z_SOURCENAME%>"/>
    <html:hidden property="<%=TitleDetailForm.PARAM_BIB_WALKER_ID%>"/>
    <html:hidden property="<%=TitleDetailForm.PARAM_ELEMENTARY_MODE%>"/>

    <logic:present name="<%=TitleDetailForm.FORM_NAME%>"
        property="holdMessageHeader">
        <base:imageSpacer width="1" height="3" />
        <base:messageBox>
            <tr valign="top" align="center">
                <td class="ColRowBold" align="center"><bean:write name="<%=TitleDetailForm.FORM_NAME%>" property="holdMessageHeader" /></td>
            </tr>
            <logic:present name="<%=TitleDetailForm.FORM_NAME%>"
                property="holdMessage">
                <tr align="center">
                    <td class="ColRow" align="center"><bean:write name="<%=TitleDetailForm.FORM_NAME%>" property="holdMessage" /></td>
                </tr>
            </logic:present>
        </base:messageBox>
        <base:imageSpacer width="1" height="3" />
    </logic:present>

    <base:outlinedTable borderColor='#c0c0c0' width="100%" cellpadding="0">
    <tr>
        <td valign="top">

            <table id="<%=TitleDetailForm.TABLE_TITLE_OUTLINE%>" border="0" cellpadding="0" cellspacing="0" width="100%">
                <tr>
                    <td valign="top" width="100%">
                    <table id="<%=TitleDetailForm.TABLE_TITLE_COLLECTOR%>" width="100%"><tr><td valign="top">
						<table id="<%=TitleDetailForm.TABLE_TITLE_HEADER%>" border="0" cellpadding="0" cellspacing="0" width="100%">
                            <tr>
                                <td valign="top">
                                    <table id="<%=TitleDetailForm.TABLE_TITLE_PEEK%>" cellSpacing="0" cellPadding="0" width="100%" border="0">
                                    <tr>
                                        <td valign="top" align="center">
                                            <!-- TitlePeek image -->
                                            <%SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);%>
                                            <%=form.getTitlePeekLink(store, true)%>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td align="center" class="ColHeading" nowrap="nowrap">
                                            <%=form.getTitlePeekLink(store, false)%>
                                        </td>
                                    </tr>
                                    </table>
                                </td>
                                <td valign="top" width="100%">


                                    <!-- Title information -->
                                    <table id="<%=TitleDetailForm.TABLE_TITLE_DETAIL%>" cellpadding="2" cellspacing="0">
                                        <%=form.getTitleInformation()%>
                                    </table>

                                    <!-- Copy availability information (if not alliance) -->
                                    <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="externalRecord" value="false">
                                        <table id="<%=TitleDetailForm.TABLE_COPY_AVAIL%>" cellpadding="0" cellspacing="0" width="100%">
                                        <tr>
                                            <td colspan="3" align="center"><base:imageLine height="1" width="98%" vspace="2"/></td>
                                        </tr>
                                        <tr>
                                            <td align="left">
                                                <table id="<%=TitleDetailForm.TABLE_COPY_CALL_AND_SUBLOCATION%>" cellpadding="6" cellspacing="0">
                                                        <%form.outputCallAndSubLocationInfo(out, request);%>
                                                </table>
                                            </td>
                                            <td align="center">
                                                <table id="<%=TitleDetailForm.TABLE_COPIES_SUMMARY%>" cellpadding="6" cellspacing="0">
                                                    <tr>
                                                        <td class="ColRow">
                                                            <%=form.getElementaryAvailability()%>
                                                        </td>
                                                    </tr>
                                                </table>
                                            </td>
                                            <td width="33%">&nbsp;</td>
                                        </tr>
                                        </table>
                                    </logic:equal>

                                    <!-- Summary of notes -->
                                    <%=form.getNoteSummary()%>
                                    <%=form.get300a()%>
                                    <%=form.getLexile()%>
                                    <%=form.getFountasPinell()%>
                                    <%=form.getReadingGradeLevel()%>
                                    <%=form.getInterestGradeLevel()%>
									
									<!-- Review Summary -->
									<c:set var="reviewSummary" value="<%=form.getReviewSummary() %>"/>
									<c:if test="${reviewSummary.reviewAverage > 0}">
										<table id="<%= TitleDetailForm.TABLE_NOTES_SUMMARY %>" cellpadding="2" cellspacing="0" width="100%">
                                          <c:if test="<%= StringHelper.isEmpty(form.getNoteSummary())%>">
                                            <tr><td width="100%"><base:imageLine/></td></tr>
                                          </c:if>                                        
											<tr>
												<td class="SmallColHeading">
													<base:reviewStars value="${reviewSummary.reviewAverage}"/>
												</td>
											</tr>
										</table>
									</c:if>
                                </td>
                            </tr>
                            <!-- added not present for 7202 etg -->

                        </table> <!-- end of the titleHeader table-->
                    </td>
                </tr>
                <tr>
                <td>&nbsp;</td>
                </tr>
                <!-- populate reading program info -->
                <%=form.getReadingProgram_Elementary()%>
                <!-- populate webpath and 856 tag links -->
                <%=form.getWebTable_Elementary()%>
                <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="viewType" value='<%=""+TitleDetailForm.VIEW_TYPE_DETAILS%>'>

                    <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="displayTopLink" value="true">
                    <tr>
                        <td  class="SmallColRow tdAlignRight" vAlign="bottom">
                            <a class="DetailLink" href="#TheTop" id="<%=BaseTitleDetailForm.ID_TOP %>"><%= MessageHelper.formatMessage("titledetail_elem_Top") %></a>
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

                                <tr>
                                    <td align="center" class="Instruction" nowrap>
                                    <%if (form.getPreviousBibID() != null) {
                                %>
                                        <base:link page='<%= form.getPreviousRecordLink() %>' id="<%=BaseTitleDetailForm.ID_PREVIOUS_TITLE %>">
                                        <base:image align="top" src="/icons/general/previouslonger.gif" width="44" height="26"  alt='<%= MessageHelper.formatMessage("titledetail_elem_PreviousTitle") %>'/>
                                        </base:link>
                                    <%} else {
                            %>
                                        <base:imageSpacer width="44" height="26"/>
                                    <%}
                            %>
                                    <%if (form.getNextBibID() != null) {
                                %>
                                        <base:link page='<%= form.getNextRecordLink() %>' id="<%=BaseTitleDetailForm.ID_NEXT_TITLE %>">
                                        <base:image align="top" src="/icons/general/nextlonger.gif" width="44" height="26"  alt='<%=MessageHelper.formatMessage("titledetail_elem_NextTitle") %>'/>
                                        </base:link>
                                    <%} else {
                            %>
                                        <base:imageSpacer width="44" height="26"/>
                                    <%}
                            %>
                                    </td>
                                </tr>

                                <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="canDoBookList" value="true">
                                        <tr>
                                            <td colspan="2" align="center">
                                                <logic:notEqual name="<%=TitleDetailForm.FORM_NAME%>" property="addToMyListLink" value="">
                                                    <base:link page='<%= form.getAddToMyListLink() %>' id="<%=BaseTitleDetailForm.ID_ADD_TO_MYLIST %>">
                                                    <base:image src='/buttons/large/keep.gif' alt='<%=MessageHelper.formatMessage("keep")  %>' />
                                                    </base:link>
                                                </logic:notEqual>
                                                <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="addToMyListLink" value="">
                                                    <%=form.buildInMyListLink()%>
                                                </logic:equal>
                                            </td>
                                        </tr>
                                </logic:equal>
                                <%boolean outputNewLineAfterEBookImages = false;
                            %>
                                <logic:notEqual name="<%=TitleDetailForm.FORM_NAME%>" property="previewFollettEBookLink" value="">
                                <tr>
                                    <td align="center">
                                        <base:link page='<%= form.getPreviewFollettEBookLink() %>' target='_blank' id="<%=TitleDetailForm.ID_FOLLETT_EBOOK_CHECKOUT_ONLINE %>">
                                        <base:image src="/buttons/large/preview_elem.gif" alt='<%=MessageHelper.formatMessage("titledetail_elem_Look")%>'/>
                                        </base:link>
                                    </td>
                                    <%outputNewLineAfterEBookImages = true;
                            %>
                                </tr>
                                </logic:notEqual>
    
                                <logic:notEqual name="<%=TitleDetailForm.FORM_NAME%>" property="checkoutFollettEBookReadOnlineLink" value="">
                                <tr>
                                    <td align="center">
                                        <base:link page='<%= form.getCheckoutFollettEBookReadOnlineLink() %>' id="<%=TitleDetailForm.ID_READ_ONLINE %>">
                                        <base:image src="/buttons/large/checkout_elem.gif" alt='<%=MessageHelper.formatMessage("titledetail_elem_Borrow")%>'/>
                                        </base:link>
                                    </td>
                                    <%outputNewLineAfterEBookImages = true;
                            %>
                                </tr>
                                </logic:notEqual>
    
                                <%if (outputNewLineAfterEBookImages) {
                            %>
                                <tr>
                                    <td>
                                        <base:imageSpacer width="10" height="10"/>
                                    </td>
                                </tr>
                                <%}
                            %>
    
                                <logic:notEqual name="<%=TitleDetailForm.FORM_NAME%>" property="addHoldLink" value="">
                                <tr>
                                    <td align="center">
                                        <base:link page='<%= form.getAddHoldLink() %>' id="<%=TitleDetailForm.ID_HOLD_TITLE %>">
                                            <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="mediaCollectionType" value="false">
                                                <base:image src="/buttons/large/holditbig_elem.gif" alt='<%=MessageHelper.formatMessage("hold")%>'/>
                                            </logic:equal>
                                            <logic:equal name="<%=TitleDetailForm.FORM_NAME%>" property="mediaCollectionType" value="true">
                                                <base:image src="/buttons/large/bookit_elem.gif" name="<%=TitleDetailForm.ID_BOOK_TITLE %>" alt='<%=MessageHelper.formatMessage("titledetail_elem_BookIt")%>'/>
                                            </logic:equal>
                                        </base:link>
                                        <c:if test="<%=form.getBookSeriesLink() != null%>">
                                            <base:link page="<%=form.getBookSeriesLink()%>" id="<%=TitleDetailForm.ID_BOOK_SERIES %>">
                                                <base:image src="/buttons/large/bookseries_elem.gif" alt='<%=MessageHelper.formatMessage("titledetail_elem_BookSeries")%>'/>
                                            </base:link>
                                        </c:if>
                                    </td>
                                </tr>
                                </logic:notEqual>
                                
                                <logic:notEqual name="<%=TitleDetailForm.FORM_NAME%>" property="readItLink" value="">
                                    <tr>
                                        <td align="center">
                                            <base:link page="<%=form.getReadItLink()%>" target='_blank' id="<%=TitleDetailForm.ID_READ_FOLLETT_EBOOK %>">
                                             <c:choose>
                                                   <c:when test="<%=form.isFollettAudioBook()%>">
                                                        <base:image src="/buttons/large/play_elem.gif" alt='<%= MessageHelper.formatMessage("titleDetailsController_playIt") %>'/>
                                                  </c:when>
                                                  <c:otherwise>
                                                        <base:image src="/buttons/large/open_elem.gif" alt='<%= MessageHelper.formatMessage("titleDetailsController_readIt") %>'/>
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
                                                <base:image src="/buttons/large/open_elem.gif" alt='<%= MessageHelper.formatMessage("titleDetailsController_readIt") %>'/>
                                            </base:link>
                                        </td>
                                    </tr>
                                <% } else if (form.isShowNonFolletteBookButton()) { %>
                                    <logic:notEqual name="<%=TitleDetailForm.FORM_NAME%>" property="readItNonFollettLink" value="">
                                        <tr>
                                            <td align="center">
                                                <base:link page="<%=form.getReadItNonFollettLink()%>" target='_blank' id="<%=TitleDetailForm.ID_READ_NON_FOLLETT_EBOOK %>">
                                                    <base:image src="/buttons/large/open_elem.gif" alt='<%= MessageHelper.formatMessage("titleDetailsController_readIt") %>'/>
                                                </base:link>
                                            </td>
                                        </tr>
                                    </logic:notEqual>
                                <%} %>                                
                                <tr>
                                    <td class="tdAlignRight">
                                        <%=form.getExploreLinksForElementary()%>
                                    </td>
                                </tr>
                        </table>
                        </base:showHideTag>
                    </td>
                    </c:if>
                </tr>
                </table>
            </td>
        </tr>
</base:outlinedTable>
</base:form>
</div>

