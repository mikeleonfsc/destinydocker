<%@ attribute type="java.lang.Integer" name="sortOption" required="true" %>
<%@ attribute type="java.lang.Integer" name="dataSize" required="true" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ tag language="java" %>
<jsp:useBean id="VopacSpecs" class="com.follett.fsc.destiny.client.vopac.servlet.VopacSpecs"/>

<c:if test="${dataSize > 1}" >
<div id="${VopacSpecs.DIV_NARROWING_SORT_CONTROLS}">
    <span>
    Sorted by:
    <c:choose>
        <c:when test="${sortOption == VopacSpecs.NARROWING_SORT_ALPHA}">
            A-Z          
        </c:when>
        <c:otherwise>
            <a href="#" id="${VopacSpecs.LINK_NARROWING_SORT_ALPHA}" class="${VopacSpecs.CLASS_NARROWING_SORT_OPTION}" onclick="return false;">A-Z</a>
        </c:otherwise>
    </c:choose>
        |
    <c:choose>
        <c:when test="${sortOption == VopacSpecs.NARROWING_SORT_REVERSE_ALPHA}">
            Z-A          
        </c:when>
        <c:otherwise>
            <a href="#" id="${VopacSpecs.LINK_NARROWING_SORT_REVERSE_ALPHA}" class="${VopacSpecs.CLASS_NARROWING_SORT_OPTION}" onclick="return false;">Z-A</a>
        </c:otherwise>
    </c:choose>
        |
    <c:choose>
        <c:when test="${sortOption == VopacSpecs.NARROWING_SORT_MOST_HITS}">
            Most Hits          
        </c:when>
        <c:otherwise>
            <a href="#" id="${VopacSpecs.LINK_NARROWING_SORT_MOST_HITS}" class="${VopacSpecs.CLASS_NARROWING_SORT_OPTION}" onclick="return false;">Most Hits</a>
        </c:otherwise>
    </c:choose>
    </span>
</div>    
</c:if>
