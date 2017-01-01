<%@ attribute type="java.lang.String" name="currentID" required="true" %>
<%@ attribute type="com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord" name="record" required="true" %>
<%@ attribute type="java.lang.Boolean" name="isDraggable" required="true" %>
<%@ attribute type="java.lang.Boolean" name="renderXNextToImage" required="false" %>
<%@ attribute type="java.lang.Boolean" name="renderRecommendationIfAllowed" required="false" %>
<%@ attribute type="java.lang.Boolean" name="renderCitationIconNextToImage" required="false" %>
<%@ attribute type="java.lang.Boolean" name="renderRenewNextToImage" required="false" %>
<%@ attribute type="java.lang.Boolean" name="renderBarcodeDueDate" required="false" %>
<%@ attribute type="java.lang.Boolean" name="hideAuthor" required="false" %>
<%@ attribute type="java.lang.String" name="hoverMaster" required="true" %>
<%@ attribute type="com.follett.fsc.destiny.session.common.SessionStoreProxy" name="store" required="false" %>

<%@ tag language="java" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>
<%@ taglib uri="/WEB-INF/jstl-destiny.tld" prefix="d" %>
<%@ taglib tagdir="/WEB-INF/tags/vopac" prefix="vopac" %>
<%@ tag import="com.follett.fsc.destiny.session.cataloging.ejb.KeywordSearchFacadeSpecs"%>
<%@ tag import="com.follett.fsc.destiny.util.Permission"%>
<%@ tag import="com.follett.fsc.common.StringHelper"%>
<%@ tag import="com.follett.fsc.destiny.util.marc.BibType"%>
<%@ tag import="com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord"%>
<%@tag import="com.follett.fsc.destiny.client.quest.reusabletemplates.HitListRecordTemplate"%>

<jsp:useBean id="VopacSpecs" class="com.follett.fsc.destiny.client.vopac.servlet.VopacSpecs" />
<div id="<%=VopacSpecs.DIV_SEARCH_RESULT_PREFIX %>${currentID}" class="<%=VopacSpecs.CLASS_SEARCHRESULT %>">
    <vopac:coverimage record="${record}" isDraggable="${isDraggable}" hoverMaster="${hoverMaster}" currentID="${currentID}" renderRecommendationIfAllowed="${renderRecommendationIfAllowed}" renderCitationIconNextToImage="${renderCitationIconNextToImage}" renderXNextToImage="${renderXNextToImage}"/>
    <div id="<%=VopacSpecs.DIV_TITLE_INFO_PREFIX %>${currentID}" class="<%=VopacSpecs.CLASS_TITLEINFO %>" >
        <p id="<%=VopacSpecs.DIV_TITLE_PREFIX %>${currentID}" class="<%=VopacSpecs.CLASS_SEARCH_RESULT_TITLE %>"><a href="<%=VopacSpecs.DUMMY_ANCHOR_HREF %>" class="searchResultsTitleLink <%=HitListRecordTemplate.CLASS_TITLE_DETAIL_LINK%>" onclick="return false;"><c:out value="${record.shortTitle}"/></a></p>

        <c:choose>
            <c:when test="${renderBarcodeDueDate}">
                  <p id="<%=VopacSpecs.DIV_COPY_BARCODE_PREFIX %>${currentID}" 
                  class="<%=VopacSpecs.CLASS_SEARCH_RESULT_BARCODE%>">
                  <nobr>(<c:out value="${record.truncatedCopyBarcode}"/>)</nobr></p>
                  <c:choose>
                      <c:when test="${d:isBeforeNow(record.dueDate)}">
                          <p id="<%=VopacSpecs.DIV_DUE_DATE_PREFIX %>${currentID}" 
                          class="<%=VopacSpecs.CLASS_SEARCH_RESULT_DUE_DATE_NORMAL%>">
                          Due <c:out value="${d:formatDueDate(record.dueDate)}"/></p>
                      </c:when>
                      <c:otherwise>
                          <p id="<%=VopacSpecs.DIV_DUE_DATE_PREFIX %>${currentID}" 
                          class="<%=VopacSpecs.CLASS_SEARCH_RESULT_DUE_DATE_OVERDUE%>">
                          Due <c:out value="${d:formatDueDate(record.dueDate)}"/></p>
                      </c:otherwise>
                  </c:choose>
            </c:when>
            <c:when test="${!empty record.recommendationID}">
                <p id="<%=VopacSpecs.DIV_RECOMMENDATION_FROM_PATRON_PREFIX %>${currentID}" class="<%=VopacSpecs.CLASS_SEARCH_RESULT_RECOMMENDATION_FROM_PATRON%>">Recommended by:<br/>
                    <c:choose>
                        <c:when test="${record.hasRecommendationComment}">
                            <a class="<%=VopacSpecs.CLASS_RESOURCE_LIST_RECOMMENDATION_TRIGGER%>" href="#" alt="Click for comments" title="Click for comments" onclick="return false;"><em><c:out value="${record.recommender}"/></em></a>
                        </c:when>
                        <c:otherwise>
                            <em><c:out value="${record.recommender}"/></em>
                        </c:otherwise>
                    </c:choose>                    
                </p>
                <p id="<%=VopacSpecs.DIV_RECOMMENDATION_DATE_PREFIX %>${currentID}" class="<%=VopacSpecs.CLASS_SEARCH_RESULT_RECOMMENDATION_DATE%>"><c:out value="${d:formatDate(record.dateRecommended)}"/></p>
            </c:when>
            <c:otherwise>
                <c:if test="${fn:length(record.shortAuthor) > 0 && !hideAuthor}">
                  <p id="<%=VopacSpecs.DIV_AUTHOR_PREFIX %>${currentID}" class="<%=VopacSpecs.CLASS_SEARCH_RESULT_AUTHOR%>"><c:out value="${record.shortAuthor}"/></p>
                </c:if>
                <c:if test="${fn:length(record.callNumber) > 0}">
                  <p id="<%=VopacSpecs.DIV_CALLNUMBER_PREFIX %>${currentID}" class="<%=VopacSpecs.CLASS_SEARCH_RESULT_CALLNUMBER%>"><c:out value="${record.callNumber}"/></p>
                </c:if>
             </c:otherwise>
        </c:choose>
    </div>
    <c:if test="${renderRenewNextToImage}">
        <c:if test="${record.renewable }">
        <base:spanIfAllowed permission="<%=Permission.CIRC_RENEW_OWN_ITEMS %>">
            <div id="<%=VopacSpecs.DIV_TITLE_RENEW %>${currentID}" class="<%=VopacSpecs.CLASS_TITLE_RENEW_IMAGE %>">
                <a href="<%=VopacSpecs.DUMMY_ANCHOR_HREF %>" onclick="return false;">
                <base:emptyImage 
                alt="Renew"
                styleClass="${VopacSpecs.CLASS_CONTROL} ${VopacSpecs.CLASS_TITLE_RENEW}"
                id="${VopacSpecs.DIV_TITLE_RENEW_IMAGE}${currentID}"
                />
                </a>

            </div>
        </base:spanIfAllowed>
        </c:if>
        <c:if test="${fn:length(record.follettEBookURL) > 0 }">
            <div id="<%=VopacSpecs.DIV_TITLE_CHECKOUT_EBOOK %>${currentID}" class="<%=VopacSpecs.CLASS_TITLE_CHECKOUT_EBOOK_IMAGE %>">
                <c:choose>
                    <c:when test="${record.follettEBookCheckoutMethod == 1}">
                        <input 
                            onmousedown="window.open('${record.follettEBookURL}', 'checkoutEbookOnline');" 
                            type="button" 
                            id="${VopacSpecs.BUTTON_MY_INFO_EBOOK_READ_ONLINE}${currentID}" 
                            name="${VopacSpecs.BUTTON_MY_INFO_EBOOK_READ_ONLINE}${currentID}" 
                            value="Read Online" 
                            class="<%=HitListRecordTemplate.CLASS_MY_INFO_EBOOK_READ_ONLINE%>"/>
                    </c:when>
                    <c:otherwise>
                         <input 
                            onmousedown="window.open('${record.follettEBookURL}', 'checkoutEbook');" 
                            type="button" 
                            id="${VopacSpecs.BUTTON_MY_INFO_EBOOK_DOWNLOAD}${currentID}" 
                            name="${VopacSpecs.BUTTON_MY_INFO_EBOOK_DOWNLOAD}${currentID}" 
                            value="Download" 
                            class="<%=HitListRecordTemplate.CLASS_MY_INFO_EBOOK_DOWNLOAD%>"/>
                    </c:otherwise>
                </c:choose>
            </div>
        </c:if>
    </c:if>
    <div style="display: none" class="copyID" value="${record.copyID}"></div>
    <div style="display: none" class="recordID" value="${record.recID}"></div>
    <div style="display: none" class="shelfNumber" value="${record.shelfNumber}"></div>
    <div style="display: none" class="currentID" value="${currentID}"></div>
    <div style="display: none" class="bibType" value="${record.bibType}"></div>
    <div style="display: none" class="recommendationID" value="${record.recommendationID}"></div>
</div>
