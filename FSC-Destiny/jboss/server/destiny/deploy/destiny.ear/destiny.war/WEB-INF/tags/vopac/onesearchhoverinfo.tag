<%@ attribute type="java.lang.String" name="currentID" required="true" %>
<%@ attribute type="com.follett.fsc.destiny.session.cataloging.ejb.data.OnlineResourcesListValue" name="record" required="true" %>
<%@ attribute type="java.lang.Boolean" name="canAddToBooklist" required="true" %>
<%@ attribute type="java.lang.String" name="hoverMaster" required="true" %>
<%@ tag language="java" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ tag import="com.follett.fsc.destiny.util.Permission"%>
<jsp:useBean id="VopacSpecs" class="com.follett.fsc.destiny.client.vopac.servlet.VopacSpecs" />

<div id="${VopacSpecs.DIV_TITLE_HOVER_PREFIX}${currentID}" class="${VopacSpecs.CLASS_TITLE_HOVER} ${VopacSpecs.CLASS_HOVER}"
    onmouseover="${hoverMaster}.activate('<%=VopacSpecs.DIV_TITLE_IMAGE_PREFIX %>${currentID}', '${VopacSpecs.DIV_TITLE_HOVER_PREFIX}${currentID}')"
    onmouseout="${hoverMaster}.deactivate()">
<div id="titleHoverModuleInner">
    <div id="titleHoverHeader">
        <h4>Quick Details</h4>
        <div id="<%=VopacSpecs.DIV_TITLE_HOVER_CLOSE_BUTTON %>" class="<%=VopacSpecs.CLASS_HOVER_CLOSE_BUTTON %>"><a id="<%=VopacSpecs.LINK_HOVER_CLOSE_BUTTON %>${currentID}" href="<%=VopacSpecs.DUMMY_ANCHOR_HREF %>" onclick="return false;"><base:emptyImage id="hoverCloseButtonImage" alt="Close" /></a></div>
    </div>
    
     <div class="<%=VopacSpecs.CLASS_HOVERGROUP_LEFT %>">
         <div id="<%=VopacSpecs.DIV_TITLE_HOVER_TITLE %>" class="<%=VopacSpecs.CLASS_HOVER_TITLE %>" ><a id="<%=VopacSpecs.DIV_TITLE_HOVER_WPE_ANCHOR %>" href="${record.url}" target="_blank"><c:out escapeXml="false" value="${record.shortTitle}"/></a></div>
         Database: <div id="<%=VopacSpecs.DIV_TITLE_HOVER_AUTHOR %>" class="<%=VopacSpecs.CLASS_HOVER_AUTHOR %>"><c:out value="${record.databaseSearch}"/></div>
     </div>
     <div class="<%=VopacSpecs.CLASS_HOVERGROUP_RIGHT %>">
         <%-- Event Listener: searchresultsdetail.jsp - closeHoverListener --%>
         <base:spanIfAllowed permission="<%=Permission.CAT_ACCESS_BOOKLIST %>">
             <c:if test="${canAddToBooklist}">
                <div id="<%=VopacSpecs.DIV_TITLE_HOVER_IN_BOOKLIST %>" class="<%=VopacSpecs.CLASS_HOVER_IN_BOOKLIST %>" style="<%=VopacSpecs.STYLE_DISPLAY_NONE %>">
                    In your list
                </div>
                <div id="<%=VopacSpecs.DIV_TITLE_HOVER_ADD_TO_BOOKLIST %>" class="<%=VopacSpecs.CLASS_HOVER_ADDTO_BOOKLIST %>" style="<%=VopacSpecs.STYLE_DISPLAY_NONE %>">
                    <input type="button" id="<%=VopacSpecs.BUTTON_TITLE_HOVER_ADD_TO_BOOKLIST %>" class="<%=VopacSpecs.CLASS_ADD_TO_LIST %>" value="Add to List"/>
                    <%-- EventListener: booklist.jsp - addBookToListFromHoverListener--%>
                </div>
             </c:if>
         </base:spanIfAllowed>
     </div>
     <div class="<%=VopacSpecs.CLASS_HOVERGROUP_BOTTOM %>">
     <% String summaryDivClass =VopacSpecs.CLASS_HOVER_SUMMARY;%>
     <c:if test="${empty record.synopsis}">
          <%summaryDivClass = "";%>
     </c:if>
        <div id="<%=VopacSpecs.DIV_TITLE_HOVER_SUMMARY %>" class="<%=summaryDivClass %>"><p><c:out value="${record.synopsis}" escapeXml="false"/></p></div>
     </div>
</div>     
</div>