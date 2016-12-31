<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@ page import="org.apache.struts.util.*" %>

<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CopyVO" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CopySpecs" %>
<%@ page import="com.follett.fsc.destiny.util.URLHelper" %>
<%@ page import="com.follett.fsc.common.*" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%@page import="com.follett.fsc.destiny.entity.AdvancedSearchQueryData"%>



<%
    String formName = request.getParameter("formName");
	String quantity = request.getParameter(HoldRequestForm.FIELD_QUANTITY);
	boolean showAvailability = false;
	if ( request.getParameter("showAvailability") != null ) {
		showAvailability = "true".equals(request.getParameter("showAvailability"));
	}
	boolean neverShowAvailability = false;
	if ( request.getParameter("neverShowAvailability") != null ) {
		neverShowAvailability = "true".equals(request.getParameter("neverShowAvailability"));
	}

	boolean renderLineAboveEachRow = false;
	String renderValue = request.getParameter("renderLineAboveEachRow");
	if ( renderValue != null ) {
		renderLineAboveEachRow = "true".equals(renderValue);
	}

	String selectURL = request.getParameter("selectURL");

	BaseSearchResultsForm form = (BaseSearchResultsForm)request.getAttribute(formName);
	SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    
    boolean digitalResourceMode = false;
    digitalResourceMode = form.getDigitalContentMode() == AdvancedSearchQueryData.SEARCH_DIGITAL_RESOURCES_ALL;
%>

<logic:equal name="<%= formName %>" property="printerFriendly" value="false">
<% if (form instanceof VisualSearchResultsForm) { %>
    <html:hidden property="nodeID"/>
<% } %>
<html:hidden property="<%=BaseListForm.PARAM_SHOW_AR_ELEMENTARY %>"/>
<html:hidden property="<%=BaseListForm.PARAM_SHOW_RC_ELEMENTARY %>"/>
<html:hidden property="<%=BaseListForm.PARAM_SHOW_LEXILE_ELEMENTARY %>"/>
</logic:equal>

<logic:equal name="<%= formName %>" property="printerFriendly" value="true">
<table width="100%" id="keywordTable" border="0" cellpadding="2" cellspacing="0">
</logic:equal>
<logic:iterate indexId="count" id="rec" name="<%= formName %>" property="list" type="com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord">
    <logic:equal name="<%= formName %>" property="printerFriendly" value="false">
		<% if(renderLineAboveEachRow) { %>
        <tr>
        	<td colspan="2">
				<base:imageLine height="2" vspace="1" />
            </td>
    	</tr>
	    <% } %>
    </logic:equal>
    <tr>
	<td class="ColRow" valign="top">
		<base:titleImage rec="<%= rec %>" printerFriendly="<%= form.isPrinterFriendly() %>"/>
	</td>
	<td valign="top" width="100%">		
        <% if ( rec.getRelevancePercentage() != null ) { %>
            <!--REL=<%=rec.getRelevancePercentage().toString()%>-->
        <% } %>

		<table id="<%= BaseSearchResultsForm.TABLE_HIT_LIST_ROW_INFO + count %>" border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse" bordercolor="#111111" width="100%">
			<tr>
				<td class="ColRowBold" valign="top" colspan="4">
					<a name='<%= "anchor_" + rec.getRecID() %>'></a>
                    <a name="<%=BaseTitleDetailForm.ANCHOR_TO_GO_TO_ON_RESTORE + rec.getRecID()%>"></a>
					<base:titleDetailHover
                        rec="<%= rec %>"
                        formName="<%= formName %>"
                        printerFriendly="<%= form.isPrinterFriendly() %>"
                        quantity="<%= quantity %>"
                        digitalResourceMode="<%= digitalResourceMode %>"
                        elementaryMode="true"/>
				</td>
			</tr>
			<tr>
				<td class="ColRow" valign="top" nowrap>
                    <c:choose>
                        <c:when test="<%= rec.getCollectionType() != BibMasterSpecs.COLLECTION_TYPE_ASSET %>">
    						&nbsp;&nbsp;
    						<base:bibTypeIcon rec="<%= rec %>" printerFriendly="<%= form.isPrinterFriendly() %>" elementaryMode="true"/>
                            &nbsp;
                        </c:when>
                        <c:otherwise>
                            &nbsp;
                        </c:otherwise>
                    </c:choose>
                </td>
                <td class="ColRow" valign="top" width="100%">
					<% if (!store.isMediaBookingUser() && form!=null && form.isRenderMediaLocationInfo()) { 
					    if ( rec.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_MEDIA) {
					        out.print("<B>");
							if ( store.getMediaSiteCount() > 1) {
							    out.print(ResponseUtils.filter(store.getMediaSiteTypeDescription()));
							} else {
							    out.print(ResponseUtils.filter(store.getMediaSiteBrowseName()));
							}
							out.println("</B>");
					    }
					} %>
                    <%if(digitalResourceMode){  %>
                        <%=SearchResultsOutputListRenderer.getFilteredString(rec.getPublisher(), false)%>
                        <% if (! StringHelper.isEmptyOrWhitespace(rec.getPubYear())) { %>
                            <%= "(" + SearchResultsOutputListRenderer.getFilteredString(rec.getPubYear(), false) + ")" %>
                        <% } %>
                    <% } else { %>
                        <%=SearchResultsOutputListRenderer.getFilteredString(rec.getAuthor(), false)%>
                    <% } %>
                </td>
                <td class="ColRow" valign="top" nowrap>
                    <base:callNumber rec="<%= rec %>" printerFriendly="<%= form.isPrinterFriendly() %>" hideCallNumber="<%= form.isHideCallNumber() %>" fromElem="<%= true %>"/>
                    <br>
                    <%=(rec.getSubLocation()== null? "" : rec.getSubLocation())%>
                </td>
                <td>&nbsp;</td>
            </tr>
            <base:readingProgramInfo rec="<%=rec%>" showRC="<%=form.isShowRCElementary()%>" showAR="<%=form.isShowARElementary()%>"/>
            <base:readingAndInterestGradeLevelInfo rec="<%=rec%>"/>
            <% if (form.isShowLexileElementary()) { %>
             <base:lexileInfo rec="<%=rec%>"/>
            <% } %>
            <% if (form.isShowFountasPinnellElementary()) { %>
             <base:fountasPinnellInfo rec="<%=rec%>"/>
            <% } %>
            <% if (rec.isDigitalMediaRecord()) { %>
                <tr>
                    <td class="ColRow">&nbsp;</td>
                    <td class="ColRow" colspan="3"><%= SearchResultsOutputListRenderer.getFilteredString(rec.getSummary(), false) %></td>
                </tr>
            <% } %>
        	</table>
      	</td>
        <td>
            <table id="<%=BaseSearchResultsForm.TABLE_HIT_LIST_ROW_CONTROL_STATUS  + count%>">
               <% for(String row : form.buildControlStatusTableRows(rec,pageContext)) { %>
                    <tr>
                    <%= row %>
                    </tr>
               <% } %>
            </table>
        </td>
    </tr>
	<logic:equal name="<%= formName %>" property="printerFriendly" value="false">
		<% if(!renderLineAboveEachRow) { %>
        <tr>
        	<td colspan="3">
				<base:imageLine height="2" vspace="1" />
            </td>
     	</tr>
	    <% } %>
	</logic:equal>
    </logic:iterate>
<logic:equal name="<%= formName %>" property="printerFriendly" value="true">
</table>
</logic:equal>
