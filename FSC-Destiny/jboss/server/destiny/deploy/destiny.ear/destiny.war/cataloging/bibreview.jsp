<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="com.follett.fsc.common.StringHelper"%>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>
<%@ page import="java.util.Locale"%>
<%@ page import="com.follett.fsc.destiny.session.cataloging.ejb.data.BibReviewValueList"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>



<%
    TitleDetailForm form = (TitleDetailForm)request.getAttribute(TitleDetailForm.FORM_NAME);
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    BibReviewValueList reviews = form.getReviews();
%>


<c:set var="reviews" value="<%= form.getReviews() %>" />
<c:set var="form" value="<%=request.getAttribute(TitleDetailForm.FORM_NAME)%>"/>

<table id="<%= TitleDetailForm.TABLE_BIB_REVIEWS %>" cellpadding="5" cellspacing="0" border="0" width="100%">
<c:choose>
<c:when test="<%= form.getReviews().getTotalReviews() == 0%>">
    <tr>
        <td width="100%" align="center" class="ColRowBold">
            <%= MessageHelper.formatMessage("bibreview_ThereAreNoReviewsForThisTitle")    %>
        </td>
    </tr>
</c:when>
<c:otherwise>

    <tr>
        <td>
            <table id="<%= TitleDetailForm.TABLE_REVIEW_SUMMARY %>" border="0">
                <tr>
                    <td class="ColRowBold">
                        <%=MessageHelper.formatMessage("bibreview_AverageReview")  %>&nbsp;
                        <base:reviewStars value="${reviews.averageTotal}"/>
                    </td>
                </tr>
                <tr>
                    <td class="SmallColHeading">
                        <%= MessageHelper.formatMessage("bibreview_TotalNumberOfReviews",  Long.valueOf(Integer.valueOf(form.getReviews().getTotalReviews()).longValue()))%>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    <c:if test="${! empty reviews.reviewsWithoutComments}">
        <tr>
            <td width="100%">
                <base:imageLine/>
            </td>
        </tr>
        <tr>
            <td width="100%">
                <table id="<%= TitleDetailForm.TABLE_REVIEWS_NO_COMMENTS %>" border="0" width="100%">
                    <tr>
                        <td class="ColRowBold" colspan="2">
                            <base:reviewStars value="${reviews.averageWithoutComments}"/>
                            <%=MessageHelper.formatMessage("bibreview_ReviewsWithoutContents")   %>
                        </td>
                        <td class="SmallColRow tdAlignRight">
                            <c:choose>
                                <c:when test="<%=form.isShowAllReviews() %>">
                                    <a href="<%=form.getShowLessMoreReviewLink() %>" class="DetailLink" id="<%=TitleDetailForm.ID_SHOW_LESS %>">
                                        <%=MessageHelper.formatMessage("bibreview_ShowLess") %>&nbsp;<base:image src="/icons/general/showless.gif"  alt='<%= MessageHelper.formatMessage("bibreview_ShowLess") %>'/>
                                    </a>
                                </c:when>
                                <c:otherwise>
                                    <a href="<%=form.getShowLessMoreReviewLink() %>" class="DetailLink" id="<%=TitleDetailForm.ID_SHOW_MORE %>">
                                        <%=MessageHelper.formatMessage("bibreview_ShowMore") %>&nbsp;<base:image src="/icons/general/showmore.gif"  alt='<%= MessageHelper.formatMessage("bibreview_ShowMore") %>'/>
                                    </a>
                                </c:otherwise>
                                </c:choose>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="3" class="SmallColHeading">
                            <%= MessageHelper.formatMessage("bibreview_TotalReviewsWithout0", new Long(reviews.getTotalWithoutComments()))  %>
                        </td>
                    </tr>
                    <c:if test="<%=form.isShowAllReviews() %>">
                        <c:forEach items="${reviews.reviewsWithoutComments}" var="reviewNoComments">
                            <jsp:useBean id="reviewNoComments" type="com.follett.fsc.destiny.session.cataloging.ejb.data.BibReviewValue"/>
                            <tr>
                                <td>&nbsp;&nbsp;&nbsp;</td>
                                <td>
                                    <span class="ColRowBold"><base:reviewStars value="${reviewNoComments.rating}"/>&nbsp;<%= lh.formatDate(reviewNoComments.getCreated()) %></span>
                                    <c:if test="${! empty reviewNoComments.reviewerName}" >
                                        <br>
                                        <span class="ColRow"><%=MessageHelper.formatMessage("bibreview_By_reviewer_name", reviewNoComments.getReviewerName()) %></span>
                                    </c:if>
                                </td>
                                <td class="tdAlignRight">
                                    <c:if test="<%= form.getStore().getSiteID().equals(reviewNoComments.getSiteID()) %>">
                                        <base:link permission="<%= Permission.CAT_APPROVE_DELETE_LIBRARY_REVIEWS %>" href='<%= form.getDeleteReviewLink() + "&reviewID=" + reviewNoComments.getReviewID() %>' id="<%=TitleDetailForm.ID_DELETE_REVIEW + reviewNoComments.getReviewID() %>">
                                            <base:image src="/buttons/small/delete_70.gif" alt='<%= MessageHelper.formatMessage("delete") %>'/>
                                        </base:link>
                                    </c:if>
                                </td>
                            </tr>
                            <c:if test="<%=!StringHelper.isEmpty(reviewNoComments.getEditedByPatronName()) %>">
                                <tr>
                                    <td colspan="3" class="SmallFixed tdAlignRight">
                                        <%=MessageHelper.formatMessage("bibreview_ThisReviewWasModifiedBy_patron_name", reviewNoComments.getEditedByPatronName()) %>
                                    </td>
                                </tr> 
                            </c:if>          
                        </c:forEach>
                    </c:if>
                </table>
            </td>
        </tr>
    </c:if>
    <tr>
        <td width="100%">
            <table id="<%= TitleDetailForm.TABLE_REVIEWS_WITH_COMMENTS %>" border="0" width="100%">
                <c:forEach items="${reviews.reviewsWithComments}" var="review">
                    <jsp:useBean id="review" type="com.follett.fsc.destiny.session.cataloging.ejb.data.BibReviewValue"/>
                    <tr>
                        <td colspan="2" width="100%">
                            <base:imageLine/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <span class="ColRowBold"><base:reviewStars value="${review.rating}"/>&nbsp;<%= lh.formatDate(review.getCreated()) %></span>
                            <c:if test = "${!empty review.reviewerName || !empty review.fileDisplayName}">
                                <br/>
                            </c:if>
                            <c:if test="${! empty review.reviewerName}">
                                <span class="ColRow"><%=MessageHelper.formatMessage("bibreview_By_reviewer_name",review.getReviewerName())%></span>                                
                            </c:if> 
                            <c:if test="${! empty review.fileDisplayName && form.displayingDigitalContent}">
                                <span class="ColRow"><base:link showTextAlways = "true" href = "<%= form.getDigitalContentLink(review.getFileName()) %>" target="_blank"><%=ResponseUtils.filter(review.getFileDisplayName())%></base:link></span>                                
                            </c:if>                             
                        </td>
                        <td class="tdAlignRight">
                            <c:if test="<%= form.getStore().getSiteID().equals(review.getSiteID()) %>">
                                <base:link permission="<%= Permission.CAT_APPROVE_DELETE_LIBRARY_REVIEWS %>" href='<%= form.getDeleteReviewLink() + "&reviewID=" + review.getReviewID() %>' id="<%=TitleDetailForm.ID_DELETE_REVIEW + review.getReviewID() %>">
                                    <base:image src="/buttons/small/delete_70.gif" alt='<%= MessageHelper.formatMessage("delete") %>'/>
                                </base:link>
                            </c:if>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" class="ColRow">
                            <c:out value="${review.comment}"/>
                        </td>
                    </tr>
                    <c:if test="<%=!StringHelper.isEmpty(review.getEditedByPatronName()) %>">
                        <tr>
                            <td colspan="2" class="SmallFixed tdAlignRight">
                                <%=MessageHelper.formatMessage("bibreview_ThisReviewWasModifiedBy_patron_name", review.getEditedByPatronName()) %>
                            </td>
                        </tr> 
                    </c:if>                   
                </c:forEach>
            </table>
        </td>
    </tr>
</c:otherwise>    
</c:choose>
</table>
