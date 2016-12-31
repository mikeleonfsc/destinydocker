<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ page import="com.follett.fsc.destiny.session.common.HTMLHelper" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>



<%
    BibReviewApprovalForm form = (BibReviewApprovalForm)request.getAttribute(BibReviewApprovalForm.FORM_NAME);
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>
<script language="JavaScript" type="text/javascript">
<!--

    function openWindow(url,name,features) {
       var win = window.open(url,name,features);
    }
// -->
</script>



<%@page import="com.follett.fsc.commons.string.StringHelper"%><c:set var="reviews" value="<%= form.getReviewsNeedingApproval() %>" />
<c:set var="form" value="<%= request.getAttribute(BibReviewApprovalForm.FORM_NAME) %>" />

<base:form action="/cataloging/servlet/handlebibreviewapprovalform.do">
<html:hidden property="<%=BibReviewApprovalForm.PARAM_FOLLETTSHELF_REVIEW_URL%>"/>
<c:if test="<%=form.getDeleteReviewVO() != null%>">
    <html:hidden property="<%=BibReviewApprovalForm.PARAM_REVIEW_ID%>"/>
    <base:imageSpacer width="1" height="3"/>
    <base:messageBox showWarningIcon="true" message='<%= MessageHelper.formatMessage("bibreviewapproval_AreYouCertainYouWantToDelete",form.getDeleteReviewVO().getReviewerName().trim() ,form.getDeleteReviewVO().getBibTitle())%>'>
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:yesNo/>
            </td>
        </tr>
    </base:messageBox>
</c:if>
<br/>
<br/>
<base:outlinedTable id="<%= BibReviewApprovalForm.TABLE_BIB_REVIEWS %>" cellpadding="2" cellspacing="0" width="100%" borderColor="#C0C0C0">
    <tr>
        <td class="TableHeading" colspan="2"><%= MessageHelper.formatMessage("bibreviewapproval_ReviewsNeedingApproval") %></td>
    </tr>
    <% if ((form.getReviewsNeedingApproval() == null || form.getReviewsNeedingApproval().size() == 0) && StringHelper.isEmpty(form.getFollettShelfReviewURL())) { %>
            <tr>
                <td class="ColRowBold" align="center" colspan="2"><%= MessageHelper.formatMessage("bibreviewapproval_ThereAreNoReviewsToApprove") %></td>
            </tr>
    <% } else { %>
            <% if (!StringHelper.isEmptyOrWhitespace(form.getFollettShelfReviewURL()) && form.canShowFollettShelfLink() &&  form.getReviewsNeedingApproval().size() > 0) { %>
                <tr>
                    <td width="100%" colspan="2">
                        <base:imageLine/>
                    </td>
                </tr>           
                <tr>
                    <td class="ColRowBold">
                        <br><a id="<%=BibReviewApprovalForm.ID_FOLLETTSHELF %>" href="javascript:openWindow('<%=form.getFollettShelfReviewURL() %>','','width=800,height=600,scrollbars=1')">
                        <%= MessageHelper.formatMessage("bibreviewapproval_ApproveFollettshelfReviews0", String.valueOf(form.getNumberOfReviews())) %></a>
                    </td>
                </tr>   
           <% } %>    
            <c:forEach items="${reviews}" var="review">
                <jsp:useBean id="review" type="com.follett.fsc.destiny.session.cataloging.ejb.data.BibReviewValue"/>
                <tr>
                    <td width="100%" colspan="2">
                        <base:imageLine/>
                    </td>
                </tr>        
                <tr>
                    <td class="ColRowBold">
                        <%= form.getTitleDetailLink(review) %>
                    </td>
                    <td class="tdAlignRight" valign="top" rowspan="3">
                        <base:link href="<%=form.getApproveReviewLink(review.getReviewID()) %>" id="<%=BibReviewApprovalForm.ID_APPROVE + review.getReviewID() %>">
                            <base:image src="/buttons/small/approve_70.gif" alt='<%= MessageHelper.formatMessage("approve") %>'/>
                        </base:link><br/>
                        <base:spanIfAllowed permission="<%= Permission.CAT_EDIT_LIBRARY_REVIEW_COMMENTS %>">
                        <base:link href="<%=form.getEditReviewLink(review.getReviewID()) %>" id="<%=BibReviewApprovalForm.ID_EDIT + review.getReviewID() %>">
                            <base:image src="/buttons/small/editsmall.gif" alt='<%= MessageHelper.formatMessage("edit") %>'/>
                        </base:link><br/>
                        </base:spanIfAllowed>
                        <base:link href="<%=form.getDeleteReviewLink(review.getReviewID()) %>"  id="<%=BibReviewApprovalForm.ID_DELETE + review.getReviewID() %>">
                            <base:image src="/buttons/small/delete_70.gif" alt='<%= MessageHelper.formatMessage("delete") %>'/>
                        </base:link>
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold">
                        <base:reviewStars value="${review.rating}"/>&nbsp;
                        <%= lh.formatDate(review.getCreated()) %>
                    </td>
                </tr>
                <tr>
                    <td class="ColRow">
                        <%= MessageHelper.formatMessage("bibreviewapproval_By0", ResponseUtils.filter(review.getReviewerName())) %>
                        <c:if test="${! review.patronDeleted}">
                            &nbsp;(<c:out value="${review.reviewerPatronType}"/>:&nbsp;
                            <base:link permission="<%=Permission.CIRC_VIEW_PATRON_STATUS%>" showTextAlways="true" href="/circulation/servlet/handlepatroninfoform.do?patronID=${review.reviewerPatronID}" id="<%=BibReviewApprovalForm.ID_VIEW_PATRON + review.getReviewerPatronID() %>">
                                ${review.reviewerBarcode}
                            </base:link>)
                        </c:if> &nbsp; &nbsp;
                        <c:if test = "${ !empty review.fileDisplayName }">
                            <c:choose>
                                <c:when test="${form.displayingDigitalContent}">
                                    
                                    <base:link showTextAlways = "true" href = "<%= form.getDigitalContentLink(review.getFileName()) %>" target="_blank" id="<%=BibReviewApprovalForm.ID_VIEW_FILE + review.getReviewID() %>"><%=ResponseUtils.filter(review.getFileDisplayName())%></base:link>
                                </c:when>
                                <c:otherwise>
                                   <%= MessageHelper.formatMessage("bibreviewapproval_DigitialContentNotViewable") %>                            
                                </c:otherwise>
                            </c:choose>
                        </c:if>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" class="ColRow">
                        <c:out value="${review.comment}"/>
                    </td>
                </tr>
            </c:forEach>
        <% } %>
        <% if (!StringHelper.isEmptyOrWhitespace(form.getFollettShelfReviewURL()) && form.canShowFollettShelfLink() ) { %>
            <tr>
                <td width="100%" colspan="2">
                    <base:imageLine/>
                </td>
            </tr>           
            <tr>
                <td class="ColRowBold">
                    <br><a id="<%=BibReviewApprovalForm.ID_FOLLETTSHELF %>" href="javascript:openWindow('<%=form.getFollettShelfReviewURL() %>','','width=800,height=600,scrollbars=1')">
                    <%= MessageHelper.formatMessage("bibreviewapproval_ApproveFollettshelfReviews0", String.valueOf(form.getNumberOfReviews())) %></a>
                </td>
            </tr>   
       <% } %>      
    
</base:outlinedTable>
</base:form>
