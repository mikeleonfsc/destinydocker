<%@ attribute type="java.lang.String" name="currentID" required="true" %>
<%@ attribute type="com.follett.fsc.destiny.session.cataloging.data.MyListRowVO" name="row" required="true" %>
<%@ attribute type="java.lang.String" name="updated" required="true" %>
<%@ attribute type="java.lang.String" name="hoverMaster" required="true" %>
<%@ attribute type="java.lang.String" name="hoverPrefix" required="true" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ tag language="java" %>
<jsp:useBean id="VopacSpecs" class="com.follett.fsc.destiny.client.vopac.servlet.VopacSpecs" />

<div id="${hoverPrefix}${currentID}" class="${VopacSpecs.CLASS_TITLE_HOVER} ${VopacSpecs.CLASS_HOVER}"
    onmouseover="${hoverMaster}.activate('<%=VopacSpecs.DIV_TITLE_IMAGE_PREFIX %>${currentID}', '${hoverPrefix}${currentID}')"
    onmouseout="${hoverMaster}.deactivate()">
    <div id="titleHoverModuleInner">
        <div id="titleHoverHeader">
            <h4>Quick Details</h4>
            <div id="<%=VopacSpecs.DIV_TITLE_HOVER_CLOSE_BUTTON %>" class="<%=VopacSpecs.CLASS_HOVER_CLOSE_BUTTON %>"><a id="<%=VopacSpecs.LINK_HOVER_CLOSE_BUTTON %>${currentID}" href="<%=VopacSpecs.DUMMY_ANCHOR_HREF %>" onclick="return false;"><base:emptyImage id="hoverCloseButtonImage" alt="Close" /></a></div>
        </div>
        
         <div class="<%=VopacSpecs.CLASS_HOVERGROUP_LEFT %>">
             <div id="<%=VopacSpecs.DIV_PUBLIC_LISTS_HOVER_NAME %>" ><c:out value="${row.name}"/></div>
             <div id="<%=VopacSpecs.DIV_PUBLIC_LISTS_HOVER_DESCRIPTION %>" ><c:out value="${row.description}"/></div>
             <div id="<%=VopacSpecs.DIV_PUBLIC_LISTS_HOVER_OWNER %>" ><c:out value="${row.owner}"/></div>
             <div id="<%=VopacSpecs.DIV_PUBLIC_LISTS_HOVER_UPDATED %>" ><c:out value="${updated}"/></div>
         </div>
         <div class="<%=VopacSpecs.CLASS_HOVERGROUP_RIGHT %>">
         </div>
         <div class="<%=VopacSpecs.CLASS_HOVERGROUP_BOTTOM %>">
            <p>
                <a href="<%=VopacSpecs.DUMMY_ANCHOR_HREF %>" 
                    class="control ${VopacSpecs.CLASS_HOVER_MORE} ${VopacSpecs.CLASS_TITLE_DETAIL_LINK}" 
                    id="${VopacSpecs.LINK_TITLE_HOVER_MORE_PREFIX}" onclick="return false;">More</a>
            </p>
         </div>
    </div>     
</div>