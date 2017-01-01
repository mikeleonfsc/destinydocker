<%@ attribute type="java.util.List" name="data" required="true" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-destiny.tld" prefix="fn" %>
<%@tag import="com.follett.fsc.destiny.entity.ejb3.VisualSearchSpecs"%>
<jsp:useBean id="VopacSpecs" class="com.follett.fsc.destiny.client.vopac.servlet.VopacSpecs"/>
<c:set var="TYPE_ELEMENT_LIST" value="<%=Integer.valueOf(VisualSearchSpecs.TYPE_ELEMENT_PUBLIC_LIST) %>" />
<c:set var="TYPE_ELEMENT_URL" value="<%=Integer.valueOf(VisualSearchSpecs.TYPE_ELEMENT_URL) %>" />
[
<c:if test="${empty data}">
    <c:set var="pageDom" >
        <div id="${VopacSpecs.DIV_VISUAL_SEARCH_PAGE}0" class="resultsWrapper">
            <span class="visualSearchMessage">No results found for this visual search.</span>
        </div>
    </c:set>
    "<c:out escapeXml="false" value="${fn:escapeQuotesAndRemoveNewLines(pageDom)}" />"
</c:if>
<c:forEach var="pageList" items="${data}" varStatus="status">
    <c:set var="pageDom" >
        <div id="${VopacSpecs.DIV_VISUAL_SEARCH_PAGE}${status.index}" class="resultsWrapper">
            <c:forEach items="${pageList}" var="node" varStatus="innerStatus">
                <div class="vsGroup">
                    <div class="vsGroupInner" vsNodeID="${node.nodeID}" vsNodeType="${node.nodeType}" vsDescription="<c:out value="${node.description}" />" vsImagePath="${node.imageName}"
                     <c:if test="${node.nodeType == TYPE_ELEMENT_LIST}">vsListID="${node.searchSyntax}"</c:if>
                     <c:if test="${! empty node.oneSearchDatabases}">vsOneSearch="true"</c:if>
                    >
                        <c:choose>
                            <c:when test="${node.nodeType == TYPE_ELEMENT_URL}">
                                <a href="/cataloging/servlet/handlevisualsearchdisplayform.do?nodeid=${node.nodeID}&fromQuest=true" target="vswindow" class=""><img class="vsThumbnail" src="${node.imageName}" alt="<c:out value="${node.description}" />" title="<c:out value="${node.description}" />" width="80" height="72" /></a>
                                <a href="/cataloging/servlet/handlevisualsearchdisplayform.do?nodeid=${node.nodeID}&fromQuest=true" target="vswindow" class=""><c:out value="${node.description}" /></a>
                            </c:when>
                            <c:otherwise>
                                <a href="#" class="" onclick="return false;"><img class="vsThumbnail" src="${node.imageName}" alt="<c:out value="${node.description}" />" title="<c:out value="${node.description}" />" width="80" height="72" /></a>
                                <a href="#" class="" onclick="return false;"><c:out value="${node.description}" /></a>
                            </c:otherwise>
                        </c:choose>
                    </div>
                </div>
            </c:forEach>
        </div>
    </c:set>
    "<c:out escapeXml="false" value="${fn:escapeQuotesAndRemoveNewLines(pageDom)}" />"
    <c:if test="${!status.last}">,</c:if>
</c:forEach>
]