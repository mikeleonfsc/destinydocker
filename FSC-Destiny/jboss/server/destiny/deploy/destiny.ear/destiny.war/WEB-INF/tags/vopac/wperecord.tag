<%@ attribute type="java.lang.String" name="currentID" required="true" %>
<%@ attribute type="com.follett.fsc.destiny.session.cataloging.ejb.data.VopacWPECachedRecord" name="record" required="true" %>
<%@ attribute type="java.lang.Boolean" name="isDraggable" required="true" %>
<%@ attribute type="java.lang.Boolean" name="renderXNextToImage" required="false" %>
<%@ attribute type="java.lang.Boolean" name="renderCitationIconNextToImage" required="false" %>
<%@ attribute type="java.lang.String" name="hoverMaster" required="true" %>

<%@ tag language="java" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>

<%@ tag import="com.follett.fsc.destiny.util.Permission"%>
<%@ tag import="com.follett.fsc.destiny.session.cataloging.ejb.data.VopacWPECachedRecord"%>

<jsp:useBean id="VopacSpecs" class="com.follett.fsc.destiny.client.vopac.servlet.VopacSpecs" />

<%-- ---------------------------------------------------------- --%>
<div id="<%=VopacSpecs.DIV_SEARCH_RESULT_PREFIX %>${currentID}" class="<%=VopacSpecs.CLASS_SEARCHRESULT %>">
    <div id="<%=VopacSpecs.DIV_COVER_IMAGE_PREFIX %>${currentID}" class="<%=VopacSpecs.CLASS_COVER%>">

        <c:set var="onmousedown" value=""/>
        <c:if test="${isDraggable}">
            <base:spanIfAllowed permission="<%=Permission.CAT_ACCESS_BOOKLIST %>">
                <c:set var="onmousedown" value="if (isMousedown(event)) window.dragMaster.startDrag('${VopacSpecs.DIV_TITLE_PEEK_PREFIX}${currentID}', ${record.recID}, ${currentID}); else return false"/>
            </base:spanIfAllowed>
        </c:if>
        
        <div id="<%=VopacSpecs.DIV_TITLE_IMAGE_PREFIX %>${currentID}"
            onmousedown="${onmousedown}"
            onmouseover="${hoverMaster}.activate('<%=VopacSpecs.DIV_TITLE_IMAGE_PREFIX %>${currentID}','${VopacSpecs.DIV_TITLE_HOVER_PREFIX}${currentID}')"
            onmouseout="${hoverMaster}.deactivate()">
            <a href="${record.element.url }" id="${VopacSpecs.LINK_TITLE_PREFIX}${currentID}" target="_blank">
                <base:vopacCoverImage id="${VopacSpecs.DIV_TITLE_PEEK_PREFIX}${currentID}"  
                    htmlClass="<%=VopacSpecs.CLASS_COVERIMAGE + " draggableBook"%>"
                    rec="${record.element}" />
            </a>
        </div>

        <c:if test="${renderXNextToImage}">
            <div id="<%=VopacSpecs.DIV_TITLE_REMOVE %>${currentID}" class="<%=VopacSpecs.CLASS_TITLE_REMOVE_IMAGE %>">
                <base:emptyImage 
                    id="${VopacSpecs.DIV_TITLE_REMOVE_IMAGE}${currentID}" 
                    alt="Remove from list"
                    styleClass="${VopacSpecs.CLASS_CONTROL} ${VopacSpecs.CLASS_TITLE_REMOVE} ${VopacSpecs.CLASS_TITLE_REMOVE_TRIGGER}"
                />
                <%-- Event Listener: resourcelist.jsp - removeFromBookListAnimationListener --%>
                <c:if test="${renderCitationIconNextToImage}">
                    <div id="<%=VopacSpecs.DIV_RESOURCE_LIST_CITATION_EDIT%>${currentID}">
                    <base:emptyImage 
                        id="${VopacSpecs.BUTTON_RESOURCE_LIST_CITATION_EDIT}${currentID}" 
                        alt="Edit Citation"
                        styleClass="${VopacSpecs.CLASS_CONTROL} ${VopacSpecs.CLASS_RESOURCE_LIST_CITATION_EDIT}"/>
                    
                    <%-- Event Listener: resourcelist.jsp - bookListEditCitationListener --%>
                    </div>
                </c:if>
            </div>
        </c:if>
    </div>
    <div id="<%=VopacSpecs.DIV_TITLE_INFO_PREFIX %>${currentID}" class="<%=VopacSpecs.CLASS_TITLEINFO %>" >
        <p id="<%=VopacSpecs.DIV_TITLE_PREFIX %>${currentID}" class="<%=VopacSpecs.CLASS_SEARCH_RESULT_TITLE %>"><a id="${VopacSpecs.LINK_SEARCH_RESULT_TITLE}${currentID}" href="${record.element.url}" target="_blank" class="<%=VopacSpecs.CLASS_SEARCH_RESULT_TITLE_LINK%>"><c:out escapeXml="false" value="${record.element.title}"/></a></p>
        <p id="<%=VopacSpecs.DIV_AUTHOR_PREFIX %>${currentID}" class="<%=VopacSpecs.CLASS_SEARCH_RESULT_AUTHOR%>">Topic: <c:out value="${record.firstTopic}"/></p>
    </div>
    <div style="display: none" class="recordID" value="${record.recID}"></div>
    <div style="display: none" class="currentID" value="${currentID}"></div>
</div>
