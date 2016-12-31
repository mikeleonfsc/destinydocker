<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ page import="com.follett.fsc.destiny.session.common.HTMLHelper" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.destiny.session.cataloging.data.RecommendationClientValue"%>
<%@ page import="com.follett.fsc.destiny.session.common.data.MyQuestCommentObject"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>


<%
    RecommendationApprovalForm form = (RecommendationApprovalForm)request.getAttribute(RecommendationApprovalForm.FORM_NAME);
%>

<c:set var="recommendations" value="<%= form.getRecommendationsNeedingApproval() %>" />
<c:set var="comments" value="<%= form.getCommentsNeedingApproval() %>" />

<base:form action="/cataloging/servlet/handlerecommendationapprovalform.do">
<c:if test="<%=form.getDeleteRecommendationVO() != null%>">
    <html:hidden property="<%=RecommendationApprovalForm.PARAM_RECOMMENDATION_ID%>"/>
    <base:imageSpacer width="1" height="3"/>
    <base:messageBox showWarningIcon="true" message="<%= form.getDeleteMessageRecommendations(form.getDeleteRecommendationVO())%>"> 
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:yesNo/>
            </td>
        </tr>
    </base:messageBox>
</c:if>
<c:if test="<%=form.getDeleteCommentVO() != null%>">
    <html:hidden property="<%=RecommendationApprovalForm.PARAM_COMMENT_ID%>"/>
    <base:imageSpacer width="1" height="3"/>
    <base:messageBox showWarningIcon="true" message="<%= form.getDeleteMessageComments(form.getDeleteCommentVO())%>"> 
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:yesNo/>
            </td>
        </tr>
    </base:messageBox>
</c:if>
<br/>
<br/>
<base:outlinedTable id="<%= RecommendationApprovalForm.TABLE_RECOMMENDATIONS %>" cellpadding="2" cellspacing="0" width="100%" borderColor="#C0C0C0">
    <tr>
        <td class="TableHeading" colspan="2"><%= MessageHelper.formatMessage("recommendationapproval_RecommendationsNeedingApproval") %></td>
    </tr>
    <c:choose>
        <c:when test="${empty recommendations}">
            <tr>
                <td class="ColRowBold" align="center" colspan="2"><%= MessageHelper.formatMessage("recommendationapproval_ThereAreNoRecommendationsToApprove") %></td>
            </tr>
        </c:when> 
        <c:otherwise>
            <c:forEach items="${recommendations}" var="recommendation">
                <jsp:useBean id="recommendation" type="com.follett.fsc.destiny.session.cataloging.data.RecommendationClientValue"/>
                <tr>
                    <td width="100%" colspan="2">
                        <base:imageLine/>
                    </td>
                </tr>        
                <tr>
                    <td class="ColRowBold">
                        <%= form.getTitleDetailLink(recommendation.getTitle(), recommendation.getBibID()) %>
                    </td>
                    <td class="tdAlignRight" valign="top" rowspan="3">
                        <base:link href="<%=form.getApproveRecommendationLink(recommendation.getRecommendationID()) %>" id="<%=RecommendationApprovalForm.ACTION_APPROVE_RECOMMENDATION + recommendation.getRecommendationID() %>">
                            <base:image src="/buttons/small/approve_70.gif" alt='<%= MessageHelper.formatMessage("approve") %>'/>
                        </base:link><br/>
                        <base:spanIfAllowed permission="<%= Permission.CAT_RECOMMEND_TITLES_APPROVE_EDIT_DELETE %>">
                        <base:link href="<%=form.getEditRecommendationLink(recommendation.getRecommendationID()) %>" id="<%=RecommendationApprovalForm.ACTION_EDIT_RECOMMENDATION + recommendation.getRecommendationID() %>">
                            <base:image src="/buttons/small/editsmall.gif" alt='<%= MessageHelper.formatMessage("edit") %>'/>
                        </base:link><br/>
                        </base:spanIfAllowed>
                        <base:link href="<%=form.getDeleteRecommendationLink(recommendation.getRecommendationID()) %>" id="<%=RecommendationApprovalForm.ACTION_DELETE_RECOMMENDATION + recommendation.getRecommendationID() %>">
                            <base:image src="/buttons/small/delete_70.gif" alt='<%= MessageHelper.formatMessage("delete") %>'/>
                        </base:link>
                    </td>
                </tr>
                <tr>
                    <td class="ColRow">
                        <%= MessageHelper.formatMessage("recommendationapproval_To0", ResponseUtils.filter(recommendation.getToPatronVO().getPatronName())) %>
                        &nbsp;(<c:out value="${recommendation.toPatronVO.patronType}"/>:&nbsp;
                        <base:link permission="<%=Permission.CIRC_VIEW_PATRON_STATUS%>" showTextAlways="true" href="/circulation/servlet/handlepatroninfoform.do?patronID=${recommendation.toPatronVO.patronID}" id="<%=RecommendationApprovalForm.ID_PATRON_STATUS + recommendation.getToPatronVO().getPatronID() %>">
                            ${recommendation.toPatronVO.barcode}
                        </base:link>)
                    </td>
                </tr>
                <tr>
                    <td class="ColRow">
                        <c:choose>
                            <c:when test="${recommendation.fromPatronVO.patronID > 0}">
                                <%= MessageHelper.formatMessage("recommendationapproval_From0", ResponseUtils.filter(recommendation.getFromPatronVO().getPatronName())) %>
                                
                                <c:if test="${! recommendation.fromPatronVO.patronDeleted}">
                                    &nbsp;(<c:out value="${recommendation.fromPatronVO.patronType}"/>:&nbsp;
                                    <base:link permission="<%=Permission.CIRC_VIEW_PATRON_STATUS%>" showTextAlways="true" href="/circulation/servlet/handlepatroninfoform.do?patronID=${recommendation.fromPatronVO.patronID}" id="<%=RecommendationApprovalForm.ID_PATRON_STATUS + recommendation.getFromPatronVO().getPatronID() %>">
                                        ${recommendation.fromPatronVO.barcode}
                                    </base:link>)
                                </c:if>
                            </c:when>
                            <c:otherwise>
                                <%= MessageHelper.formatMessage("recommendationapproval_FromPatronDeleted") %>
                            </c:otherwise>
                        </c:choose>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" class="ColRow">
                        <c:out value="${recommendation.comments}"/>
                    </td>
                </tr>
            </c:forEach>
        </c:otherwise>
    </c:choose>
    
</base:outlinedTable>

<br/>
<base:outlinedTable id="<%= RecommendationApprovalForm.TABLE_COMMENTS %>" cellpadding="2" cellspacing="0" width="100%" borderColor="#C0C0C0">
    <tr>
        <td class="TableHeading" colspan="2"><%= MessageHelper.formatMessage("recommendationapproval_CommentsNeedingApproval") %></td>
    </tr>
    <c:choose>
        <c:when test="${empty comments}">
            <tr>
                <td class="ColRowBold" align="center" colspan="2"><%= MessageHelper.formatMessage("recommendationapproval_ThereAreNoCommentsToApprove") %></td>
            </tr>
        </c:when> 
        <c:otherwise>
            <c:forEach items="${comments}" var="comment">
                <jsp:useBean id="comment" type="com.follett.fsc.destiny.session.common.data.MyQuestCommentObject"/>
                <tr>
                    <td width="100%" colspan="2">
                        <base:imageLine/>
                    </td>
                </tr>        
                <tr>
                    <td class="ColRowBold">
                        <%= form.getTitleDetailLink(comment.getTitle(), comment.getBibID()) %>
                    </td>
                    <td class="tdAlignRight" valign="top" rowspan="3">
                        <base:link href="<%=form.getApproveCommentLink(comment.getCommentID()) %>" id="<%=RecommendationApprovalForm.ACTION_APPROVE_COMMENT + comment.getCommentID() %>">
                            <base:image src="/buttons/small/approve_70.gif" alt='<%= MessageHelper.formatMessage("approve") %>'/>
                        </base:link><br/>
                        <base:link href="<%=form.getHideCommentLink(comment.getCommentID()) %>" id="<%=RecommendationApprovalForm.ACTION_HIDE_COMMENT + comment.getCommentID() %>">
                            <base:image src="/buttons/small/hide.gif" alt='<%= MessageHelper.formatMessage("hide") %>'/>
                        </base:link><br/>
                        <base:link href="<%=form.getDeleteCommentLink(comment.getCommentID()) %>" id="<%=RecommendationApprovalForm.ACTION_DELETE_COMMENT + comment.getCommentID() %>">
                            <base:image src="/buttons/small/delete_70.gif" alt='<%= MessageHelper.formatMessage("delete") %>'/>
                        </base:link>
                    </td>
                </tr>
                <tr>
                    <td class="ColRow">
                        <%= MessageHelper.formatMessage("recommendationapproval_To0", comment.getToPatronVO().getPatronName()) %>
                        &nbsp;(<c:out value="${comment.toPatronVO.patronType}"/>:&nbsp;
                        <base:link permission="<%=Permission.CIRC_VIEW_PATRON_STATUS%>" showTextAlways="true" href="/circulation/servlet/handlepatroninfoform.do?patronID=${comment.toPatronVO.patronID}" id="<%=RecommendationApprovalForm.ID_PATRON_STATUS + comment.getToPatronVO().getPatronID() %>">
                            ${comment.toPatronVO.barcode}
                        </base:link>)
                    </td>
                </tr>
                <tr>
                    <td class="ColRow">
                        <c:choose>
                            <c:when test="${comment.fromPatronVO.patronID > 0}">
                                <%= MessageHelper.formatMessage("recommendationapproval_From0", comment.getFromPatronVO().getPatronName()) %>
                                
                                <c:if test="${! comment.fromPatronVO.patronDeleted}">
                                    &nbsp;(<c:out value="${comment.fromPatronVO.patronType}"/>:&nbsp;
                                    <base:link permission="<%=Permission.CIRC_VIEW_PATRON_STATUS%>" showTextAlways="true" href="/circulation/servlet/handlepatroninfoform.do?patronID=${comment.fromPatronVO.patronID}" id="<%=RecommendationApprovalForm.ID_PATRON_STATUS + comment.getFromPatronVO().getPatronID() %>">
                                        ${comment.fromPatronVO.barcode}
                                    </base:link>)
                                </c:if>
                            </c:when>
                            <c:otherwise>
                                <%= MessageHelper.formatMessage("recommendationapproval_FromPatronDeleted") %>
                            </c:otherwise>
                        </c:choose>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" class="ColRow">
                        <c:out value="${comment.data}"/>
                    </td>
                </tr>
            </c:forEach>
        </c:otherwise>
    </c:choose>
    
</base:outlinedTable>
</base:form>
