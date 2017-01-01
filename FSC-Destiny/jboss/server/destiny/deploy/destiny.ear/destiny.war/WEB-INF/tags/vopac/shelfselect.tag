<%@ attribute type="java.lang.Long" name="recID" required="true" %>
<%@ attribute type="java.lang.String" name="selectedShelf" required="true" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ tag language="java" %>
<%@ tag import="com.follett.fsc.destiny.util.Permission"%>

<%@tag import="com.follett.fsc.destiny.entity.ejb3.QuestMyQuestSpecs"%>
<jsp:useBean id="VopacSpecs" class="com.follett.fsc.destiny.client.vopac.servlet.VopacSpecs" />

<c:set var="shelf1Class" value=""/>
<c:set var="shelf2Class" value=""/>
<c:set var="shelf3Class" value=""/>
<c:set var="shelfSelectedStr" value="Select a Shelf"/>


<%-- Ideally, we should use the QuestShelfSpecs constants here, but we are unable to easily access them in JSPEL --%>
<c:choose>
    <c:when test="${empty selectedShelf}">
        <%-- do nothing --%>
    </c:when>
    <c:when test="${selectedShelf == '0'}">
        <c:set var="shelf1Class" value="selected"/>
        <c:set var="shelfSelectedStr" value="Have Read"/>
    </c:when>
    <c:when test="${selectedShelf == '1'}">
        <c:set var="shelf2Class" value="selected"/>
        <c:set var="shelfSelectedStr" value="Now Reading"/>
    </c:when>
    <c:when test="${selectedShelf == '2'}">
        <c:set var="shelf3Class" value="selected"/>
        <c:set var="shelfSelectedStr" value="Want to Read"/>
    </c:when>
</c:choose>

 <base:spanIfAllowed permission="<%=Permission.CAT_QUEST_USE_BOOK_CLUB %>">
    <div id="<%=VopacSpecs.CLASS_HOVER_SHELF_CONTROL %>" bibID="${recID}" class="<%=VopacSpecs.CLASS_HOVER_SHELF_CONTROL %>">
        <div id="<%=VopacSpecs.CLASS_HOVER_SHELF_HEADER %>" class="<%=VopacSpecs.CLASS_HOVER_SHELF_HEADER %>"><a href="#" onclick="return false;" id="<%=VopacSpecs.CLASS_HOVER_SHELF_SELECT %>" class="<%=VopacSpecs.CLASS_HOVER_SHELF_SELECT %>">${shelfSelectedStr}<em></em></a></div>
        <ul style="display:none" id="" class="">
            <li id="" shelfNumber="<%=QuestMyQuestSpecs.SHELF_HAVE_READ %>" class="<%=VopacSpecs.CLASS_HOVER_SHELF_OPTION%> ${shelf1Class}"><a href="#" id="" onclick="return false;" class=""><em>Have Read</em></a></li>
            <li id="" shelfNumber="<%=QuestMyQuestSpecs.SHELF_NOW_READING %>" class="<%=VopacSpecs.CLASS_HOVER_SHELF_OPTION%> ${shelf2Class}"><a href="#" id="" onclick="return false;" class=""><em>Now Reading</em></a></li>
            <li id="" shelfNumber="<%=QuestMyQuestSpecs.SHELF_WANT_TO_READ %>" class="<%=VopacSpecs.CLASS_HOVER_SHELF_OPTION%> ${shelf3Class}"><a href="#" id="" onclick="return false;" class=""><em>Want to Read</em></a></li>
        </ul>
    </div>
 </base:spanIfAllowed>
 
    