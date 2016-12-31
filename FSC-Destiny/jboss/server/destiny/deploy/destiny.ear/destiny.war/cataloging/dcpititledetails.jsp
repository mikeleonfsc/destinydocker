<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c"%>

<%@page import="com.follett.fsc.destiny.client.common.TitlePeekManager"%>
<%@page import="org.apache.struts.util.ResponseUtils"%>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    DCPITitleDetailsForm form = (DCPITitleDetailsForm)request.getAttribute(DCPITitleDetailsForm.FORM_NAME);
%>

<% if(form.isElementaryMode()){ %>

<%@page import="com.follett.fsc.commons.string.StringHelper"%>
<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@page import="com.follett.fsc.destiny.util.Permission"%><div id="viewTypeElem" class="viewTypeElem">
<% } %>

<base:form action="/cataloging/servlet/handledcpititledetailsform.do">
    <c:set var="form"
        value="<%=request.getAttribute(DCPITitleDetailsForm.FORM_NAME)%>" />
    <html:hidden property="<%=DCPITitleDetailsForm.PARAM_DCPI_SITE_ID%>"/>

<%-- Are we confirming a review delete? --%>
<c:if test="<%=form.getDeleteReviewVO() != null%>">
    <html:hidden property="<%=DCPITitleDetailsForm.PARAM_REVIEW_ID%>"/>
    <html:hidden property="<%=DCPITitleDetailsForm.PARAM_SHOW_ALL_REVIEWS%>"/>
    <base:imageSpacer width="1" height="3"/>
    <base:messageBox showWarningIcon="true" message='<%=MessageHelper.formatMessage("titledetail_AreYouCertainYouWantToDeleteReview",form.getDeleteReviewVO().getReviewerName(),form.getTitleQuoted()) %>'>
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:yesNo 
                    buttonYesName="<%=DCPITitleDetailsForm.BUTTON_NAME_CONFIRM_DELETE_REVIEW%>"
                    buttonNoName="<%=DCPITitleDetailsForm.BUTTON_NAME_CANCEL_DELETE_REVIEW%>"
                />
            </td>
        </tr>
    </base:messageBox>
</c:if>

        
    <base:outlinedTableAndTabsWithinThere borderColor='#c0c0c0' width="100%" cellpadding="0" selectedTab="<%=form.getSelectedTab()%>" tabs="<%=form.getTabs()%>">
        <logic:equal name="<%=DCPITitleDetailsForm.FORM_NAME%>" property="viewType" value='<%=""+DCPITitleDetailsForm.VIEW_TYPE_DETAILS%>'>
        <tr>
            <td colspan="2" valign="top">
            <table id="<%=TitleDetailForm.TABLE_TITLE_COLLECTOR%>" width="100%">
                <tr>
                    <td valign="top">
                    <table id="<%=TitleDetailForm.TABLE_TITLE_HEADER%>"
                        border="0" cellpadding="0" cellspacing="0" width="100%">
                        <tr>
                            
                            <td valign="top" width="100%">
                            
                                <!-- Title information -->
                                <table id="<%=TitleDetailForm.TABLE_TITLE_DETAIL%>"
                                    cellpadding="2" cellspacing="0" width="100%">
                                    <tr>
                                        <td valign="top">
                                            <% if (!StringHelper.isEmptyOrWhitespace(form.getRecordIconPathLarge())) {%>
                                                <img src="<%=JSPHelper.getPassthroughImageURL(form.getRecordIconPathLarge()) %>" 
                                                     alt="<%=ResponseUtils.filter(form.getTitle()) %>" 
                                                     title="<%=ResponseUtils.filter(form.getTitle()) %>">
                                            <%} else {%>
                                                &nbsp;
                                            <%} %>
                                        </td>
                                        <td width="100%">    
                                        <!-- Title information -->
                                        <table cellpadding="2" cellspacing="0" width="100%">
                                            <tr>
                                                <td valign="top">
                                                    <nobr>
                                                        <!--  Provider Icon -->
                                                        <% if(form.getProvider() != null && 
                                                            ((form.isElementaryMode() && form.getProvider().getIconPathLarge() != null) || 
                                                                (!form.isElementaryMode() && form.getProvider().getIconPathSmall() != null))){ %>
                                                            <img name="<%= DCPITitleDetailsForm.HTML.PROVIDER_ICON_IMG_NAME %>" 
                                                                        src="<%=JSPHelper.getDigitalResourcesProviderImageLink(form.getProvider(), store.getSiteCustomerNumber(), !form.isElementaryMode(), TitlePeekManager.IMAGE_APPID_DESTINY)%>"
                                                                        alt="<%=ResponseUtils.filter(form.getProvider().getName()) %>"
                                                                        title="<%=ResponseUtils.filter(form.getProvider().getName()) %>"/>
                                                         <% } %>
                                                        <!-- BibType Icon -->
                                                        <%= form.getTypeIcon() %>
                                                    </nobr>
                                                </td>
                                                <td id="<%= DCPITitleDetailsForm.HTML.TITLE_ID %>" class="TableHeading" valign="top"
                                                    width="100%">
                                                     <% if(!StringHelper.isEmpty(form.getTitle())){ %>
                                                        <%= form.getTitle() %>
                                                     <% } %>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>&nbsp;</td>
                                                <td id="<%= DCPITitleDetailsForm.HTML.AUTHOR_ID %>" class="TableHeading2">
                                                <% if(!StringHelper.isEmpty(form.getAuthor())){ %>
                                                    <%= form.getAuthor() %>
                                                <% } %>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>&nbsp;</td>
                                                <td id="<%= DCPITitleDetailsForm.HTML.SERIES_ID %>" class="TableHeading2">
                                                    <%= form.getSeries() %>
                                                </td>
                                            </tr>
                                            
                                            
                                            <!-- Review Summary -->
                                            <c:set var="reviewSummary" value="<%=form.getReviewSummary() %>"/>
                                            <c:if test="${reviewSummary.reviewAverage > 0}">
                                            <tr>
                                                <td colspan="2" align="center"><base:imageLine height="1" width="98%" vspace="2"/></td>
                                            </tr>
                                            <tr>
                                                <td class="tdAlignLeft">
                                                    <table id="<%= DCPITitleDetailsForm.TABLE_NOTES_SUMMARY %>" cellpadding="2" cellspacing="0" width="100%">
                                                        <tr>
                                                            <td class="SmallColHeading">
                                                                <base:reviewStars value="${reviewSummary.reviewAverage}"/>&nbsp;
                                                                <% if (!form.isElementaryMode()) { %>
                                                                    (<base:link href="<%= form.getReviewLink() %>" id="<%=DCPITitleDetailsForm.ID_REVIEWS_COUNT %>">
                                                                        <%= form.getReviewLinkString() %>              
                                                                    </base:link>)
                                                                <% } %>
                                                            </td>
                                                        </tr>
                                                    </table>
                                                </td>
                                            </tr>
                                            </c:if>
                                            
                                            
                                            <% if(form.isElementaryMode()){ %>
                                            <tr>
                                                <td colspan="2" class="ColRow" align="center">
                                                    <b><a id="<%= DCPITitleDetailsForm.HTML.VIEW_IT_NOW_ID %>" href="/cataloging/servlet/presentdcpiredirectform.do?recordGUID=<%= form.getTitleDetail().getRecordGUID() %><%= (form.getDcpiSiteID()!=null)? "&dcpiSiteID="+form.getDcpiSiteID() : "" %>" target="_blank"><%= MessageHelper.formatMessage("dcpititledetails_ViewItNow") %></a></b>
                                                </td>
                                            </tr>
                                            <% } %>
                                            
                                            <% if(!StringHelper.isEmpty(form.getSummary())){ %>
                                                <tr>
                                                    <td colspan="2">
                                                        <base:imageLine/>
                                                    </td>
                                                </tr>
                                            <% } %>
                                            
                                            <tr>
                                                <td id="<%= DCPITitleDetailsForm.HTML.SUMMARY_ID %>" colspan="2" class="ColRow">
                                                    <!-- Summary of notes --> 
                                                    <% if(!StringHelper.isEmpty(form.getSummary())){ %>
                                                        <%= form.getSummary() %>
                                                    <% } %>
                                                </td>
                                            </tr>
                                            
                                            <% if(form.isElementaryMode() && !StringHelper.isEmpty(form.getSummary())){ %>
                                                <tr>
                                                    <td colspan="2">
                                                        <base:imageLine/>
                                                    </td>
                                                </tr>
                                            <% } %>
                                            
                                            <tr>
                                                <% if(form.isElementaryMode()){ %>
                                                    <td colspan="2" class="ColRow">                    
                                                        <%  String elemLength = form.getTitleDetail().getExtent();
                                                            if(!StringHelper.isEmpty(elemLength)){ %>
                                                                <b><%= MessageHelper.formatMessage("dcpititledetails_Length") %>:</b> 
                                                                <%= elemLength %>
                                                        <% } %>
                                                        
                                                        <%  String renderedGradeLevel = ResponseUtils.filter(form.getTitleDetail().getInterestGradeLevel());
                                                            if(!StringHelper.isEmpty(renderedGradeLevel)){ %>
                                                                <br>
                                                                <b><%= MessageHelper.formatMessage("dcpititledetails_GradeLevel") %>:</b>
                                                                <%= renderedGradeLevel %>
                                                        <% } %>
                                                    </td>
                                                <% } else { %>   
                                                    <td colspan="2" class="ColRow" align="center"> 
                                                        <b><a id="<%= DCPITitleDetailsForm.HTML.VIEW_IT_NOW_ID %>" href="/cataloging/servlet/presentdcpiredirectform.do?recordGUID=<%= form.getTitleDetail().getRecordGUID() %><%= (form.getDcpiSiteID()!=null)? "&dcpiSiteID="+form.getDcpiSiteID() : "" %>" target="_blank"><%= MessageHelper.formatMessage("dcpititledetails_ViewItNow") %></a></b>
                                                    </td>
                                                <% } %>
                                            </tr>
                                        </table>
                                    </td></tr>
                                    
                                    <% if(!form.isElementaryMode()){ %>
                                        <logic:equal name="<%=DCPITitleDetailsForm.FORM_NAME%>" property="canDoBookList" value="true">              
                                            <tr>
                                                <td colspan="2" align="center">
                                                    <base:myListSelect name="<%= DCPITitleDetailsForm.FIELD_LIST_ID %>" submitOnChange="true" prompt='<%= MessageHelper.formatMessage("dcpititledetails_SelectedList") %>' dropDownClass="SmallColRow"/>&nbsp;
                                                    <logic:notEqual name="<%=DCPITitleDetailsForm.FORM_NAME%>" property="inSelectedList" value="true">
                                                        <base:link page='<%= form.renderAddToMyListLink() %>'>
                                                        <base:image src="/buttons/small/addtothislist.gif" alt='<%= MessageHelper.formatMessage("dcpititledetails_AddToThisList") %>'/>
                                                        </base:link>
                                                    </logic:notEqual>
                                                    <logic:equal name="<%=DCPITitleDetailsForm.FORM_NAME%>" property="inSelectedList" value="true">
                                                        <%= form.renderInMyListLink() %>
                                                    </logic:equal>
                                                </td>
                                            </tr>
                                        </logic:equal>
                                    
                                        <% 
                                            String audienceTable = form.renderAudienceTable();
                                            String pubInfoTable = form.renderPubInformationTable();
                                            String exploreTable = form.renderExploreTable();
                                        %>
                                        <tr><td colspan="2">
                                        <table id="<%= DCPITitleDetailsForm.HTML.DETAILS_NAV_ID %>"
                                               cellpadding="2" cellspacing="0" width="100%">
                                            <tr>
                                                <td class="SmallColRow tdAlignRight" vAlign="bottom">
                                                    <% if(audienceTable != null){ %>
                                                        <a class="DetailLink" href='<%= "#"+DCPITitleDetailsForm.HTML.ANCHOR_AUDIENCE_NAME %>'>
                                                            <%= MessageHelper.formatMessage("dcpititledetails_Audience") %>
                                                        </a>
                                                        <% if(exploreTable != null || pubInfoTable != null){ %>
                                                            &nbsp;|&nbsp;
                                                        <% }
                                                       } %>
                                                    
                                                    <% if(pubInfoTable != null){ %>
                                                        <a class="DetailLink" href='<%= "#"+DCPITitleDetailsForm.HTML.ANCHOR_PUBINFO_NAME %>'>
                                                            <%= MessageHelper.formatMessage("dcpititledetails_PublicationInfo") %>
                                                        </a>
                                                        <% if(exploreTable != null){ %>
                                                            &nbsp;|&nbsp;
                                                        <% }
                                                       } %>
                                                    
                                                    <% if(exploreTable != null){ %>
                                                        <a class="DetailLink" href='<%= "#"+DCPITitleDetailsForm.HTML.ANCHOR_EXPLORE_NAME %>'>
                                                            <%= MessageHelper.formatMessage("dcpititledetails_Explore") %>
                                                        </a>
                                                    <% } %>
                                                </td>
                                            </tr>
                                        </table>
                                        </td></tr>
                                        
                                        <!-- Audience -->
                                        <% if(audienceTable != null){ %>
                                            <tr><td colspan="2">
                                                <%= audienceTable %>
                                            </td></tr>
                                        <% } %>
                                        
                                        <!-- Pub info -->
                                        <% if(pubInfoTable != null){ %>
                                            <tr><td colspan="2">
                                                <%= pubInfoTable %>
                                            </td></tr>
                                        <% } %>
                                        
                                        <!-- Explore info -->
                                        <% if(exploreTable != null){ %>
                                            <tr><td colspan="2">
                                                <%= exploreTable %>
                                            </td></tr>
                                        <% } %>
                                        
                                        <tr>
                                            <td class="SmallColRow tdAlignRight" vAlign="bottom" colspan="2">
                                                <a class="DetailLink" href="#TheTop"><%=MessageHelper.formatMessage("dcpititledetails_Top") %></a>
                                            </td>
                                        </tr>
                                    <% } %>
                                </table>
                                </td>
                                
                                <% if(form.isElementaryMode() && form.isCanDoBookList()){ %>
                                    <td valign="top" class="ColRowBold tdAlignRight">
                                        <table id="<%=TitleDetailForm.TABLE_ACTION_ICONS%>" border="0" cellpadding="2" cellspacing="0">
                                            <tr>
                                                <td colspan="2" align="center">
                                                    <logic:notEqual name="<%=DCPITitleDetailsForm.FORM_NAME%>" property="inSelectedList" value="true">
                                                        <base:link page='<%= form.renderAddToMyListLink() %>'>
                                                            <base:image src="/buttons/large/keep.gif" alt='<%=MessageHelper.formatMessage("dcpititledetails_AddToThisList")%>' />
                                                        </base:link>
                                                    </logic:notEqual>
                                                    
                                                    <logic:equal name="<%=DCPITitleDetailsForm.FORM_NAME%>" property="inSelectedList" value="true">
                                                        <%= form.renderInMyListLink() %>
                                                    </logic:equal>
                                                </td>
                                            </tr>
                                        </table>
                                    </td>
                                <% } %>
                            </tr>
                            </table>
                        </td>
                        </tr>
                    </table>
                    <!-- end of the titleHeader table-->
                    </td>
                </tr>
        </logic:equal>
        <logic:equal name="<%=DCPITitleDetailsForm.FORM_NAME%>" property="viewType" value='<%=""+DCPITitleDetailsForm.VIEW_TYPE_REVIEWS%>'>
            <tr>
                <td colspan="2" valign="top">
                    <table id="<%=DCPITitleDetailsForm.TABLE_REVIEW_HEADER%>" border="0" width="100%" cellpadding="2" cellspacing="0">
                        <tr>
                            <td class="TableHeading">
                                <table id="<%=DCPITitleDetailsForm.TABLE_TITLE_DETAIL%>" cellpadding="2" cellspacing="0" border="0">
                                    <tr>
                                        <td><%= form.getTitle() %></td>
                                    </tr>
                                </table>
                            </td>
                            <td nowrap class="tdAlignRight">
                                <table border="0">
                                    <tr>
                                        <td class="tdAlignRight">
                                            <% if (form.getDcpiSiteID() == null ||  form.getDcpiSiteID().equals(store.getSiteID())) { %>
                                            
                                                <base:link permission='<%= Permission.CAT_SUBMIT_LIBRARY_REVIEWS %>' page='<%= form.getAddReviewLink() %>' id="<%=DCPITitleDetailsForm.ID_ADD_REVIEW %>">
                                                    <base:image src="/buttons/large/addreview.gif" alt='<%= MessageHelper.formatMessage("addReview") %>'/>
                                                </base:link>
                                            <% } %>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" align="center"><base:imageLine height="1" width="98%" vspace="2"/></td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <jsp:include page="/cataloging/dcpireview.jsp" flush="true"/>
                            </td>
                        </tr>                            
                    </table>
                </td>
            </tr>
        </logic:equal>
        
    </base:outlinedTableAndTabsWithinThere>
</base:form>

<% if(form.isElementaryMode()){ %>
</div>
<% } %>
