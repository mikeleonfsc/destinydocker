<%@ attribute type="java.lang.String" name="currentID" required="true" %>
<%@ attribute type="com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord" name="record" required="true" %>
<%@ attribute type="java.lang.Boolean" name="isDraggable" required="true" %>
<%@ attribute type="java.lang.Boolean" name="renderXNextToImage" required="false" %>
<%@ attribute type="java.lang.Boolean" name="renderRecommendationIfAllowed" required="false" %>
<%@ attribute type="java.lang.Boolean" name="renderCitationIconNextToImage" required="false" %>
<%@ attribute type="java.lang.String" name="hoverMaster" required="true" %>
<%@ attribute type="java.lang.Boolean" name="isShelf" required="false" %>

<%@ tag language="java" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>
<%@ taglib uri="/WEB-INF/jstl-destiny.tld" prefix="d" %>
<%@ tag import="com.follett.fsc.destiny.util.Permission"%>
<%@ tag import="com.follett.fsc.destiny.util.marc.BibType"%>
<%@ tag import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>

<% 
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
%>

<jsp:useBean id="VopacSpecs" class="com.follett.fsc.destiny.client.vopac.servlet.VopacSpecs" />

<div id="<%=VopacSpecs.DIV_COVER_IMAGE_PREFIX %>${currentID}" class="<%=VopacSpecs.CLASS_COVER%>">
    <c:if test="${!isShelf}">
        <base:availabilityImage availability="${record.elementaryAvailabilityCode}" 
            currentID="${currentID}" 
            clazz="<%=VopacSpecs.CLASS_RESULT_STATUS %>"
         />
        <c:set var="onmousedown" value="return false;"/>
        <c:if test="${isDraggable}">
            <base:spanIfAllowed permission="<%=Permission.CAT_ACCESS_BOOKLIST %>">
                <c:set var="onmousedown" value="if (isMousedown(event)) window.dragMaster.startDrag('${VopacSpecs.DIV_TITLE_PEEK_PREFIX}${currentID}', ${record.recID}, ${currentID}); else return false"/>
            </base:spanIfAllowed>
        </c:if>
        
        <c:if test="${! empty hoverMaster}">
            <c:set var="mouseOverAction" value="${hoverMaster}.activate('${VopacSpecs.DIV_TITLE_IMAGE_PREFIX}${currentID}','${VopacSpecs.DIV_TITLE_HOVER_PREFIX}${currentID}')"/>
            <c:set var="mouseOutAction" value="${hoverMaster}.deactivate()"/>
        </c:if>
    </c:if>
    <div id="<%=VopacSpecs.DIV_TITLE_IMAGE_PREFIX %>${currentID}"
        onmousedown="${onmousedown}"
        onmouseover="${mouseOverAction}"
        onmouseout="${mouseOutAction}">
        <base:vopacCoverImage id="${VopacSpecs.DIV_TITLE_PEEK_PREFIX}${currentID}" forShelf="${isShelf}" htmlClass="${VopacSpecs.CLASS_COVERIMAGE} draggableBook ${VopacSpecs.CLASS_TITLE_DETAIL_LINK}" rec="${record}"/>
        <%-- Event Listener (Search Results): titledetailseventlisteners.jsp - titleDetailCoverImageListener --%>
        <%-- Event Listener (Shelves): titledetailseventlisteners.jsp - titleDetailCoverImageListener --%>
    </div>
    <c:if test="${!isShelf}">    
        <div id="<%=VopacSpecs.DIV_COVER_BADGE_IMAGE_PREFIX%>${currentID}" class="<%=VopacSpecs.CLASS_RESULT_MEDIA_BADGE%>">
            <base:bibTypeIcon rec="${record}"/>
        </div>
        <c:if test="${renderRecommendationIfAllowed}">
            <c:if test="<%=store.canDoAny(new Permission[] {Permission.CAT_RECOMMEND_TITLES_TO_OTHER_USERS, Permission.CAT_QUEST_USE_BOOK_CLUB})%>">
                <div id="<%=VopacSpecs.DIV_TITLE_REMOVE %>${currentID}" class="<%=VopacSpecs.CLASS_TITLE_REMOVE_IMAGE %>">
                    <div id="<%=VopacSpecs.DIV_RECOMMEND_TITLE%>${currentID}">
                        <base:emptyImage
                            id="${VopacSpecs.DIV_RECOMMEND_TITLE_IMAGE}${currentID}" 
                            alt="Send Recommendation"
                            styleClass="${VopacSpecs.CLASS_CONTROL} ${VopacSpecs.CLASS_RECOMMEND_TITLE}"
                        />
                    </div>
                </div>
            </c:if>
        </c:if>
        <c:if test="${renderXNextToImage}">
            <div id="<%=VopacSpecs.DIV_TITLE_REMOVE %>${currentID}" class="<%=VopacSpecs.CLASS_TITLE_REMOVE_IMAGE %>">
                <c:choose>
                <c:when test="${empty record.recommendationID}">
                    <base:emptyImage 
                        id="${VopacSpecs.DIV_TITLE_REMOVE_IMAGE}${currentID}" 
                        alt="Remove from list"
                        styleClass="${VopacSpecs.CLASS_CONTROL} ${VopacSpecs.CLASS_TITLE_REMOVE} ${VopacSpecs.CLASS_TITLE_REMOVE_TRIGGER}"
                    />
                </c:when>
                <c:otherwise>
                    <base:emptyImage 
                        id="${VopacSpecs.DIV_TITLE_REMOVE_IMAGE}${currentID}" 
                        alt="Delete this recommendation"
                        styleClass="${VopacSpecs.CLASS_CONTROL} ${VopacSpecs.CLASS_TITLE_REMOVE} ${VopacSpecs.CLASS_RECOMMENDATION_REMOVE_TRIGGER}"
                    />
                </c:otherwise>
                </c:choose>
                <%-- Event Listener: resourcelist.jsp - removeFromBookListAnimationListener --%>
                <c:if test="${renderCitationIconNextToImage}">
                    <c:if test="<%=BibType.BIBTYPE_BOOK == record.getBibType() || BibType.BIBTYPE_FILM == record.getBibType()%>">
                        <div id="<%=VopacSpecs.DIV_RESOURCE_LIST_CITATION_EDIT%>${currentID}">
                    <base:emptyImage 
                        id="${VopacSpecs.BUTTON_RESOURCE_LIST_CITATION_EDIT}${currentID}" 
                        alt="Edit Citation"
                        styleClass="${VopacSpecs.CLASS_CONTROL} ${VopacSpecs.CLASS_RESOURCE_LIST_CITATION_EDIT}"
                    />
                        <%-- Event Listener: resourcelist.jsp - bookListEditCitationListener --%>
                        </div>
                    </c:if>
                </c:if>
                <c:if test="${record.hasRecommendationComment}">
                    <div id="<%=VopacSpecs.DIV_RESOURCE_LIST_RECOMMENDATION_VIEW%>${record.recommendationID}">
                        <base:emptyImage 
                            id="${VopacSpecs.BUTTON_RESOURCE_LIST_RECOMMENDATION_VIEW}${record.recommendationID}" 
                            alt="Click for comments"
                            styleClass="${VopacSpecs.CLASS_CONTROL} ${VopacSpecs.CLASS_RESOURCE_LIST_RECOMMENDATION_VIEW} ${VopacSpecs.CLASS_RESOURCE_LIST_RECOMMENDATION_TRIGGER}" />
                    </div>
                </c:if>
            </div>
        </c:if>
    </c:if>
</div>
    
