<%@ attribute type="java.lang.String" name="currentID" required="true" %>
<%@ attribute type="com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord" name="record" required="true" %>
<%@ attribute type="java.lang.Boolean" name="canAddToBooklist" required="true" %>
<%@ attribute type="java.lang.String" name="hoverMaster" required="true" %>
<%@ taglib tagdir="/WEB-INF/tags/vopac" prefix="vopac" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ tag language="java" %>
<%@ tag import="com.follett.fsc.destiny.util.Permission"%>
<%@ tag import="com.follett.fsc.destiny.client.common.jsptag.ReviewStarsTag"%>
<%@tag import="com.follett.fsc.destiny.entity.ejb3.QuestMyQuestSpecs"%>

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
         <div id="<%=VopacSpecs.DIV_TITLE_HOVER_TITLE %>" class="<%=VopacSpecs.CLASS_HOVER_TITLE %>" ><c:out value="${record.shortTitle}"/></div>
         <div id="<%=VopacSpecs.DIV_TITLE_HOVER_AUTHOR %>" class="<%=VopacSpecs.CLASS_HOVER_AUTHOR %>"><c:out value="${record.shortAuthor}"/></div>
         <div id="<%=VopacSpecs.DIV_TITLE_HOVER_REVIEWS %>" class="<%=VopacSpecs.CLASS_HOVER_REVIEWS %>"><base:reviewStars starType="<%=ReviewStarsTag.STAR_TYPE_SMALL_QUEST %>" value="${record.reviewAverage}" hideOnZero="true" /></div>
     <base:safariMontageLink printerFriendly="false" rec="${record}" rowAndCellOpen="<div id=\"${VopacSpecs.DIV_TITLE_HOVER_SAFARI_MONTAGE_LINK}\">" rowAndCellClose="</div>"></base:safariMontageLink>           
         <div id="titleHoverAvailabilityGroup">
             <div id="<%=VopacSpecs.DIV_TITLE_HOVER_AVAILABILITY_LOCAL %>" class="<%=VopacSpecs.CLASS_HOVER_AVAILABILITY_LOCAL %>"><c:out escapeXml="false" value="${record.hoverHighLevelAvailabilityLocalStatusString}"/></div>
             <div id="<%=VopacSpecs.DIV_TITLE_HOVER_AVAILABILITY_OFFSITE %>" class="<%=VopacSpecs.CLASS_HOVER_AVAILABILITY_OFFSITE %>"><c:out escapeXml="false" value="${record.hoverHighLevelAvailabilityOffSiteStatusString}"/></div>
         </div>            
         <div id="titleHoverReadingProgramGroup">
             <div id="<%=VopacSpecs.DIV_TITLE_HOVER_QUIZ_INFO %>" class="<%=VopacSpecs.CLASS_HOVER_QUIZ_INFO %>"><base:readingProgramInfo rec="${record}" vopacSearchRecord="true"/></div>
             <div id="<%=VopacSpecs.DIV_TITLE_HOVER_LEXILE %>" class="<%=VopacSpecs.CLASS_HOVER_LEXILE %>"><base:lexileInfo rec="${record}" vopacSearchRecord="true"/></div>
             <div id="<%=VopacSpecs.DIV_TITLE_HOVER_FP %>" class="<%=VopacSpecs.CLASS_HOVER_FP %>"><base:fountasPinnellInfo rec="${record}" vopacSearchRecord="true"/></div>
         </div>         
         <div id="<%=VopacSpecs.DIV_TITLE_HOVER_YEAR %>" class="<%=VopacSpecs.CLASS_HOVER_YEAR %>">
           <c:if test="${! empty record.pubYear}"><span class="titleHoverBold">Year:&nbsp;</span><c:out value="${record.pubYear}"/>&nbsp;</c:if><c:if test="${! empty record.extent}"><c:if test="${empty record.pubYear}"><span class="titleHoverBold">Length:&nbsp;</span></c:if>(<c:out value="${record.extent}"/>)</c:if>
         </div>
     </div>
     <div class="<%=VopacSpecs.CLASS_HOVERGROUP_RIGHT %>">
         <%-- Event Listener: searchresultsdetail.jsp - closeHoverListener --%>
         <div id="<%=VopacSpecs.DIV_TITLE_HOVER_CALL_NUMBER %>" class="<%=VopacSpecs.CLASS_HOVER_CALL_NUMBER %>"><c:out value="${record.callNumber}"/></div>
         <div id="<%=VopacSpecs.DIV_TITLE_HOVER_MATERIAL_TYPE %>" class="<%=VopacSpecs.CLASS_HOVER_MATERIAL_TYPE %>"><base:bibTypeIcon rec="${record}" elementaryMode="true" /></div>
         <vopac:shelfselect recID="${record.recID}" selectedShelf="${record.shelfNumber}" />
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
     <c:if test="${empty record.summary}">
          <%summaryDivClass = "";%>
     </c:if>
        <div id="<%=VopacSpecs.DIV_TITLE_HOVER_SUMMARY %>" class="<%=summaryDivClass %>"><p><c:out value="${record.summary}"/> <a href="<%=VopacSpecs.DUMMY_ANCHOR_HREF %>" class="control ${VopacSpecs.CLASS_HOVER_MORE} ${VopacSpecs.CLASS_TITLE_DETAIL_LINK}" id="${VopacSpecs.LINK_TITLE_HOVER_MORE_PREFIX}" onclick="return false;">More</a></p></div>
        <%-- Event Listener: searchresultsdetail.jsp - titleDetailHoverLinkListener --%>
     </div>
</div>     
</div>