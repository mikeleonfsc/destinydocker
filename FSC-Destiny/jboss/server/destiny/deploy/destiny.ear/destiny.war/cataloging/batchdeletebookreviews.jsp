<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>


<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%@page import="com.follett.fsc.destiny.client.common.PageCalculator"%>
<%@page import="com.follett.fsc.destiny.client.common.servlet.BaseListForm"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.PatronSpecs"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.BatchDeleteBookReviewsForm"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.UpdateTitlesNavigationForm"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.data.ReviewDeleteJobParams"%>
<%@page import="com.follett.fsc.destiny.client.circulation.servlet.BasePatronListForm"%>
<%@page import="com.follett.fsc.destiny.client.common.SitePatronHelper"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>



<%@page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%><base:messageBox strutsErrors="true"/>

<%
    BatchDeleteBookReviewsForm form = 
        (BatchDeleteBookReviewsForm) request.getAttribute(BatchDeleteBookReviewsForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
%>
<br>

<base:form action="/cataloging/servlet/handlebatchdeletebookreviewsform.do" focus="<%= BatchDeleteBookReviewsForm.FIELD_DATE_FROM %>">
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=BatchDeleteBookReviewsForm.BUTTON_TRAP_ENTER_KEY%>">

    <html:hidden property="<%=BatchDeleteBookReviewsForm.PARAM_STORED_SEARCH_STRING%>"/>
    <html:hidden property="action" />
    <html:hidden property="<%=BatchDeleteBookReviewsForm.PARAM_PATRONS_LIST_OUT%>"/>


    
        <c:if test="<%=form.isShowConfirmation()%>">
            <base:messageBox showWarningIcon="true" message="<%=form.gimmeConfirmationMessage()%>" filterMessage="false">
            <tr>
                <td class="ColRowBold" width="100%" align="center" colspan="2">
                    <base:yesNo />
                </td>
            </tr>
            </base:messageBox>
        </c:if>
        
            <base:outlinedTableAndTabsWithinThere id="mainTable"  selectedTab="<%=BatchDeleteBookReviewsForm.ID_TAB%>" tabs="<%=UpdateTitlesNavigationForm.getTabs()%>" cellpadding="2" >
                <tr>
                    <td colspan="2" class="TableHeading"><%= MessageHelper.formatMessage("batchdeletebookreviews_DeleteBookReviews") %></td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("batchdeletebookreviews_SubmittedFrom_date_and_date") %></td>
                    <td class="ColRowBold"> 
                        <base:dateRange
                            fromName ="<%=BatchDeleteBookReviewsForm.FIELD_DATE_FROM %>"
                                toName ="<%=BatchDeleteBookReviewsForm.FIELD_DATE_TO %>"
                                dateFrom="<%=form.getDateFrom()%>"
                                dateTo="<%=form.getDateTo()%>" />
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("batchdeletebookreviews_Containing") %></td>
                    <td>
                       <html:select property="<%=BatchDeleteBookReviewsForm.FIELD_CONTAINING%>">
                              <html:option value="<%=String.valueOf(ReviewDeleteJobParams.CONTAINING_ANYTHING)%>"><%= MessageHelper.formatMessage("batchdeletebookreviews_Anything") %></html:option>
                              <html:option value="<%=String.valueOf(ReviewDeleteJobParams.CONTAINING_RATINGS_ONLY)%>"><%= MessageHelper.formatMessage("batchdeletebookreviews_RatingsOnly") %></html:option>
                              <html:option value="<%=String.valueOf(ReviewDeleteJobParams.CONTAINING_COMMENTS)%>"><%= MessageHelper.formatMessage("batchdeletebookreviews_Comments") %></html:option>
                              <html:option value="<%=String.valueOf(ReviewDeleteJobParams.CONTAINING_DIGITAL_CONTENT)%>"><%= MessageHelper.formatMessage("batchdeletebookreviews_DigitalContent") %></html:option>
                        </html:select>
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("batchdeletebookreviews_ByPatrons") %></td>
                    <td>
                       <html:select property="<%=BatchDeleteBookReviewsForm.FIELD_BY_PATRONS%>" onchange="submit()">
                              <html:option value="<%=String.valueOf(ReviewDeleteJobParams.BY_PATRON_ANY)%>"><%= MessageHelper.formatMessage("batchdeletebookreviews_AnyPatron") %></html:option>
                              <html:option value="<%=String.valueOf(ReviewDeleteJobParams.BY_PATRON_INPUT_FILE)%>"><%= MessageHelper.formatMessage("batchdeletebookreviews_InThisList") %></html:option>
                              <html:option value="<%=String.valueOf(ReviewDeleteJobParams.BY_PATRON_GRADUATING_YEAR)%>"><%= MessageHelper.formatMessage("batchdeletebookreviews_GraduatingIn") %></html:option>
                              <html:option value="<%=String.valueOf(ReviewDeleteJobParams.BY_PATRON_NO_LONGER_AT_SITE)%>"><%= MessageHelper.formatMessage("batchdeletebookreviews_NoLongerAtThisSite") %></html:option>
                        </html:select>
                        &nbsp;
                        <c:if test="<%=form.getByPatrons() == ReviewDeleteJobParams.BY_PATRON_GRADUATING_YEAR%>">
                            <html:text property="<%=BatchDeleteBookReviewsForm.FIELD_GRADUATING_YEAR%>" size="4" maxlength="4"/>
                        </c:if>
                    </td>
                </tr>
                
                    <c:if test="<%=form.getByPatrons() == ReviewDeleteJobParams.BY_PATRON_INPUT_FILE%>">
                    <tr>
                        <td colspan="2" width="100%"><base:imageLine/></td>
                    </tr>
                    <tr>
                            <td colspan="2" width="100%" align="Center" >
                                <table border="0" cellpadding="0" cellspacing="0" width="100%" >
                                    <tr>
                                        <td class="ColRow">
                                            <%= MessageHelper.formatMessage("batchdeletebookreviews_FindPatronRecordsWith") %>
                                               &nbsp;<html:text property="<%=BatchDeleteBookReviewsForm.FIELD_SEARCH_STRING %>" size="20" maxlength="90"/>
                                             &nbsp;<%= MessageHelper.formatMessage("batchdeletebookreviews_In") %>
                                            <base:selectPatronByType name="<%=BatchDeleteBookReviewsForm.FIELD_SEARCH_TYPE %>" selected="<%=form.getSearchType()%>" onlyMyPatrons="true" siteID="<%=store.getSiteID()%>" returnAllEvenIfWeFindAMatchByBarcode="true"/>
                                            &nbsp;<base:genericButton src="/buttons/large/search.gif" alt='<%= MessageHelper.formatMessage("search") %>' name="<%= PatronLookupForm.BUTTON_SEARCH %>" absbottom="true"/>
                                        </td>
                                    </tr>
                                </table>
                             </td>
                         </tr> 
                            <%
                                 List patronsList = form.getPatronsList();
                                 if (patronsList != null && patronsList.size() > 0) {
                            
                                     int itemsInList = patronsList.size();
                                     int currentPage = PageCalculator.getCurrentPage(form);
                                     int itemsToSkip = PageCalculator.getFirstNumberInPage(currentPage, form.gimmeMaxRowsToDisplay(),
                                         itemsInList);
                                     int itemsToPrint = PageCalculator.getOnePastLastNumberInPage(currentPage,
                                         form.gimmeMaxRowsToDisplay(), itemsInList);
                            %>
                            
                             <tr>
                                <td colspan="2">
                                    <table id="searchSummary" width="100%" cellspacing="0" cellpadding="2">
                                        <tr>
                                            <td class="ColRowBold">
                                                <%=form.getSearchSummary()%>
                                            </td>
                                            <td class="tdAlignRight">
                                               &nbsp;
                                            </td>
                                       </tr>
                                       <tr>
                                        
                                            <td class="SmallColHeading">
                                            <a name="<%=BasePatronListForm.ANCHOR %>"></a>
                                                <%=form.gimmeCurrentlySelectedCountMessage()%>
                                            </td>
                                            <td class="SmallColHeading tdAlignRight">
                                               <base:pageListOutput formName="<%= BatchDeleteBookReviewsForm.FORM_NAME %>" />
                                            </td>
                                            
                                       </tr>
                                         
                                    </table>
                                 </td>
                             </tr>
            
                             <tr>
                                <td colspan="2">
                                <html:hidden property="page" value='<%= "" + currentPage %>' />
                                
                                    <table id="patronInfo" width="100%" cellspacing="0" cellpadding="4" border="0">
                                        <tr>
                                            <td class="SmallColHeading"><%= MessageHelper.formatMessage("batchdeletebookreviews_LastFirstMiddle") %></td>
                                            <td class="SmallColHeading"><%= MessageHelper.formatMessage("batchdeletebookreviews_Barcode") %></td>
                                            <td class="SmallColHeading">
                                                <%=PatronSpecs.getDistrictIDPrompt()%>
                                            </td>
                                            <base:isDistrictUser>
                                                <td class="SmallColHeading"><%= MessageHelper.formatMessage("batchdeletebookreviews_Site") %></td>
                                            </base:isDistrictUser>
                                            <td class="SmallColHeading"><%= MessageHelper.formatMessage("batchdeletebookreviews_PatronType") %></td>
                                        </tr>
                                        <logic:iterate offset='<%=""+itemsToSkip%>' length='<%=""+(itemsToPrint - itemsToSkip)%>' indexId="flipper" id="row" name="<%= BatchDeleteBookReviewsForm.FORM_NAME %>" property="patronsList" type="com.follett.fsc.destiny.session.backoffice.data.FindSitePatronValue">
                                            <tr valign="top" <%=( (!form.isPrinterFriendly() && (1 & flipper.intValue())==0)? "bgColor=\""+ FlipperTag.ROW_GRAY+"\"" : "" )%> >
                                                <base:td clazz="ColRow" filtered="true"><%=form.getPatronName(row)%></base:td>
                                                <base:td clazz="ColRow" filtered="true"><%=SitePatronHelper.getPatronBarcode(store, row, null)%></base:td>
                                                <base:td clazz="ColRow" filtered="true"><%=row.getDistrictID()%></base:td>
                                                <base:isDistrictUser>
                                                    <base:td clazz="ColRow" filtered="true"><%=SitePatronHelper.getPatronSiteName(store, row, null)%></base:td>
                                                 </base:isDistrictUser>
                                                <base:td clazz="ColRow" filtered="true"><%=SitePatronHelper.getPatronTypeDescription(store, row, null)%></base:td>
                                                <td class="SmallColHeading tdAlignRight"><%=form.getPatronLinks(row)%></td>
                                            </tr>
                                        </logic:iterate>
                                    </table>
                                </td>
                            </tr>
                               <tr>
                                    <td colspan="2" class="SmallColHeading tdAlignRight">
                                       <base:pageListOutput formName="<%= BatchDeleteBookReviewsForm.FORM_NAME %>" topOfPageLinks="false"/>
                                    </td>
                                    
                               </tr>
                            <%
                            } else {
                            %>
                                 <tr>
                                    <td colspan="2">
                                        <table id="searchSummary" width="100%" cellspacing="0" cellpadding="2">
                                           <tr>
                                                <td class="SmallColHeading">
                                                    <%=form.gimmeCurrentlySelectedCountMessage()%>
                                                </td>
                                           </tr>
                                             
                                        </table>
                                     </td>
                                 </tr>
                            <%
                            }
                            %>
                                            
                             <tr>
                                <td colspan="2">
                                    <base:selectedPatronListOutput form="<%=form%>" />
                                </td>
                             </tr>
                    </c:if>
    
                <tr>
                    <td align="center" colspan="2" class="ColRowBold">
                        <%=GenericForm.getLastBackupDisplayMsg(true)%>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center" class="ColRowBold">
                        <base:genericShowHideButton src="/buttons/large/deleteall.gif" name="<%=BatchDeleteBookReviewsForm.ID_BUTTON_DELETE_REVIEWS%>" alt='<%=MessageHelper.formatMessage("deleteAll")%>' elementID="<%=BatchDeleteBookReviewsForm.ID_BUTTON_DELETE_REVIEWS %>" />
                        <br>
                    </td>
                </tr>
                
            </base:outlinedTableAndTabsWithinThere>
     
</base:form>
