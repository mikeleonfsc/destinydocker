<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib prefix="c" uri="/WEB-INF/jstl-core.tld" %>

<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.*"%>
<%@ page import="com.follett.fsc.destiny.util.xml.BaseOnlineResourcesSpecs"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.BaseSearchResultsForm"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.WebSiteCitationForm"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.ejb.data.OnlineResourcesListValue"%>
<%@ page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.webpath.clientjar.WPEConstants"%>

<!-- Begin onlineresourceslist.jsp -->
<% BookListForm form = (BookListForm)request.getAttribute(BookListForm.FORM_NAME); %>





<c:set var="form" value="<%=request.getAttribute(BookListForm.FORM_NAME)%>"/>
<base:messageBox strutsErrors="true"/>

<c:set var="typeOneSearch" value="<%=BaseOnlineResourcesSpecs.RESOURCE_TYPE_ONE_SEARCH %>"/>
<c:set var="typeStandards" value="<%=BaseOnlineResourcesSpecs.RESOURCE_TYPE_STANDARDS %>"/>
<c:set var="typeWebPath" value="<%=BaseOnlineResourcesSpecs.RESOURCE_TYPE_WPE %>"/>
<c:set var="wpeURL" value="<%=DestinySystemProperties.getWebPathExpressHostAndPort()%>"/>

<tr><td colspan="2">
<table id="<%=BaseSearchResultsForm.TABLE_ONLINE_RESOURCES %>" border="0" cellspacing="0" cellpadding="0" width="100%">
<c:forEach var="resource" items="${form.list}">
<jsp:useBean id="resource" type="com.follett.fsc.destiny.session.cataloging.ejb.data.OnlineResourcesListValue"/>
<tr>
    <td class="ColRowBold" colspan="4">
        <c:choose>
            <c:when test="${form.printerFriendly}">
                <c:out value="${resource.title}"/>
            </c:when>
            <c:otherwise>
                <c:choose>
                    <c:when test="${resource.onlineResourceType == typeStandards || resource.onlineResourceType == typeWebPath}">
                    <a href="<%=resource.buildForwardFromResult() %>" target="_blank"><%=resource.getTitle() %></a>
                    </c:when>
                    <c:otherwise>
                     <base:link styleClass="DetailLink" page="${resource.url}" target="other" id="<%=BookListForm.ID_LINK_ONLINE_TITLE + resource.getResourceID() %>"><c:out value="${resource.title}"/></base:link>
                    </c:otherwise>
                </c:choose>
            </c:otherwise>
        </c:choose>
    </td>
    <td class="tdAlignRight">
    <c:choose>
        <c:when test="${resource.onlineResourceType == typeStandards || resource.onlineResourceType == typeWebPath}">
            <table id="<%=BaseSearchResultsForm.TABLE_GRADES %>" border="0" cellpadding="0" cellspacing="0">
            <tr>
                <td class="ColRowBold" vAlign="bottom"><%= MessageHelper.formatMessage("onlineresourceslist_GradeLevel") %></td>
                <td class="ColRowBold" vAlign="bottom" nowrap>
                <c:choose>
                    <c:when test="${resource.gradeLevelPreKto2}">
                        <c:choose>
                            <c:when test="${form.printerFriendly}">
                                &nbsp;<%=MessageHelper.formatMessage("onlineresourceslist_gradeLevelPreKToTwo") %>
                            </c:when>
                            <c:otherwise>
                                <base:imagePassThrough onlineServiceURL="http://${wpeURL}/wpebrowse/images/icons/prek-2.gif"  width="32" height="32" alt='<%=MessageHelper.formatMessage("onlineresourceslist_gradeLevelPreKToTwo") %>'/>
                            </c:otherwise>
                        </c:choose>
                    </c:when>
                    <c:otherwise>
                        <base:imageSpacer width="32" height="32"/>
                    </c:otherwise>
                </c:choose>
                </td>
                <td class="ColRowBold" vAlign="bottom" nowrap>
                 <c:choose>
                    <c:when test="${resource.gradeLevel3to5}">
                        <c:choose>
                            <c:when test="${form.printerFriendly}">
                                &nbsp;<%=MessageHelper.formatMessage("onlineresourceslist_gradeLevelThreeToFive") %>
                            </c:when>
                            <c:otherwise>
                                <base:imagePassThrough onlineServiceURL="http://${wpeURL}/wpebrowse/images/icons/3-5.gif" width="32" height="32" alt='<%=MessageHelper.formatMessage("onlineresourceslist_gradeLevelThreeToFive") %>'/>
                            </c:otherwise>
                        </c:choose>
                    </c:when>
                    <c:otherwise>
                        <base:imageSpacer width="32" height="32"/>
                    </c:otherwise>
                </c:choose>
                </td>
                
                <td class="ColRowBold" vAlign="bottom" nowrap>
                <c:choose>
                    <c:when test="${resource.gradeLevel6to8}">
                        <c:choose>
                            <c:when test="${form.printerFriendly}">
                                &nbsp;<%=MessageHelper.formatMessage("onlineresourceslist_gradeLevelSixToEight") %>
                            </c:when>
                            <c:otherwise>
                                <base:imagePassThrough onlineServiceURL="http://${wpeURL}/wpebrowse/images/icons/6-8.gif"  width="32" height="32" alt='<%=MessageHelper.formatMessage("onlineresourceslist_gradeLevelSixToEight") %>'/>
                            </c:otherwise>
                        </c:choose>
                    </c:when>
                    <c:otherwise>
                        <base:imageSpacer width="32" height="32"/>
                    </c:otherwise>
                </c:choose>            
                </td>
                
                <td class="ColRowBold" vAlign="bottom" nowrap>
                <c:choose>
                    <c:when test="${resource.gradeLevel9to12}">
                        <c:choose>
                            <c:when test="${form.printerFriendly}">
                                &nbsp;&nbsp;<%=MessageHelper.formatMessage("onlineresourceslist_gradeLevelNineToTwelve") %>
                            </c:when>
                            <c:otherwise>
                                <base:imagePassThrough onlineServiceURL="http://${wpeURL}/wpebrowse/images/icons/9-12.gif"  width="32" height="32" alt='<%=MessageHelper.formatMessage("onlineresourceslist_gradeLevelNineToTwelve") %>'/>
                            </c:otherwise>
                        </c:choose>
                    </c:when>
                    <c:otherwise>
                        <base:imageSpacer width="32" height="32"/>
                    </c:otherwise>
                </c:choose>            
                </td>
            </tr>
            </table>        
        </c:when>
        <c:otherwise>
            &nbsp;
        </c:otherwise>
    </c:choose>
    </td>
</tr>
<tr>
    <td class="ColRow" colspan="5"><c:out escapeXml="false" value="${resource.synopsis}"/></td>
</tr>
<c:if test="${resource.onlineResourceType == typeStandards || resource.onlineResourceType == typeWebPath}">
    <tr>
        <td valign="top"><span class="ColRowBold"><%= MessageHelper.formatMessage("onlineresourceslist_Topic") %></span>&nbsp;<span class="ColRow">
            <c:out value="${resource.topic}"/>
        </span></td>
        <td valign="top"><%if (!StringHelper.isEmpty(resource.getLanguage()) ) { %><span class="ColRowBold">&nbsp;<%=MessageHelper.formatMessage("onlineresourceslist_Language") %>&nbsp;</span><span class = "ColRow"><%=resource.getLanguage() %>&nbsp;</span><% } else { out.println("&nbsp;"); }%> </td>
        <td valign="top"><%if (!StringHelper.isEmpty(resource.getLexileMeasure()) ) { %><span class="ColRowBold">&nbsp;<%=MessageHelper.formatMessage("onlineresourceslist_LexileMeasure") %>&nbsp;</span><span class = "ColRow"><%=resource.getLexileMeasure() %>&nbsp;</span><% } else { out.println("&nbsp;"); }%></td>
         <c:choose>
            <c:when test="${form.printerFriendly}">
          <td valign="top"><span class="ColRowBold"><%if ( !StringHelper.isEmptyOrWhitespace(resource.getFormatType())) { %>&nbsp;<%=MessageHelper.formatMessage("onlineresourceslist_FormatType") %>&nbsp;</span><span class = "ColRow"><%=resource.getFormatType() %>&nbsp;</span><%} else { out.println("&nbsp;"); }%> </td>
          <td valign="top"><span class="ColRowBold"><%if ( !StringHelper.isEmptyOrWhitespace(resource.getSourceType())) { %>&nbsp;<%=MessageHelper.formatMessage("onlineresourceslist_SourceType") %>&nbsp;</span><span class = "ColRow"><%=resource.getSourceType() %>&nbsp;</span><%} else { out.println("&nbsp;"); }%> </td>
            </c:when>
          <c:otherwise>
            <td valign="top">
                <%if ( !StringHelper.isEmptyOrWhitespace(resource.getFormatType())) { 
                     List<String> formatTypes = ObjectHelper.parseDelimitedList(resource.getFormatType(), String.class, ',');
                     Iterator<String> itr = formatTypes.iterator();
                      while ( itr.hasNext()) {
                      String formatName = itr.next();
                %>
                    <% String url = "http://" + DestinySystemProperties.getWebPathExpressHostAndPort() + "/wpebrowse/images/icons/" + WPEConstants.descriptionToImage(formatName); %>
                    <base:imagePassThrough onlineServiceURL="<%=url %>" alt="<%=formatName%>" width="24" height="24"/>
                <%    } %>
                   &nbsp;&nbsp;&nbsp;
                <%   } else {
                    out.println("&nbsp;");
                }
                %>
            </td>
            <td valign="top">
                <%if ( !StringHelper.isEmptyOrWhitespace(resource.getSourceType())) { 
                      List<String> sourceTypes = ObjectHelper.parseDelimitedList(resource.getSourceType(), String.class, ',');
                      Iterator<String> itr = sourceTypes.iterator();
                      while ( itr.hasNext()) {
                      String sourceName = itr.next();
                %>
                     <% String url = "http://" + DestinySystemProperties.getWebPathExpressHostAndPort() + "/wpebrowse/images/icons/" + WPEConstants.descriptionToImage(sourceName); %>
                        <base:imagePassThrough onlineServiceURL="<%=url %>" alt="<%=sourceName%>" width="24" height="24"/>
                    <% }
                    } else {
                    out.println("&nbsp;");
                }
                %>
            </td>
          </c:otherwise>
        </c:choose>
    </tr>
</c:if>
<tr>
    <td colspan="5">
        <table id="<%=BaseSearchResultsForm.TABLE_URL%>"  border="0" cellpadding="0" cellspacing="0" width="100%">
            <tr>
                <td><span class="SmallColHeading"><%= MessageHelper.formatMessage("onlineresourceslist_URL") %></span>&nbsp;
                <span class="SmallColRow">
                <c:choose>
                    <c:when test="${form.printerFriendly}">
                        <c:out value="${resource.targetUrl}"/>
                    </c:when>
                    <c:otherwise>
                        <c:choose>
                        <c:when test="${resource.onlineResourceType == typeStandards || resource.onlineResourceType == typeWebPath}">
                            <a href="<%=resource.buildForwardFromResult() %>" id="<%=BookListForm.ID_LINK_ONLINE_URL + resource.getResourceID() %>" target="_blank"><%=resource.getTargetUrl() %></a>
                        </c:when>
                        <c:otherwise>
                            <base:link page="${resource.url}" target="other" id="<%=BookListForm.ID_LINK_ONLINE_URL + resource.getResourceID() %>"><c:out value="${resource.targetUrl}"/></base:link>
                        </c:otherwise>
                        </c:choose>
                    </c:otherwise>
                </c:choose>    
                </span>
                <c:if test="${resource.databaseSubscriptionRequired}">
                    <span class="SmallColHeading">&nbsp;</span>
                </c:if>
                </td>
                <td class="tdAlignRight">
                    <c:if test="${!form.printerFriendly && !form.publicList}">
                        <base:link
                            page="/cataloging/servlet/presentwebsitecitationform.do?resourceID=${resource.resourceID}"  
                            showTextAlways="true" id="<%=BookListForm.ID_BUTTON_EDIT_CITATION + resource.getResourceID() %>">
                        <base:image align="top" src="/buttons/small/citation.gif" alt='<%=MessageHelper.formatMessage("editCitation") %>'/>
                        </base:link>&nbsp;
                    </c:if>
                </td>
            </tr>
        </table>
    </td>
</tr>
<c:if test="${resource.onlineResourceType == typeOneSearch}">
    <tr>
        <td colspan="5" class="SmallColHeading">
            <%= MessageHelper.formatMessage("onlineresourceslist_DatabaseSearched", resource.getDatabaseSearch()) %>
        </td>
    </tr>
</c:if>
<tr>
    <td class="SmallColHeading" colspan="4">
        <%= MessageHelper.formatMessage("onlineresourceslist_Source", resource.getDisplayableType()) %>
    </td>
        <base:addToBookList itemID="${resource.resourceID}"
        oneSearch="<%= form.getCollectionType() == CollectionType.ONESEARCH %>"
        webSite="<%= form.getCollectionType() == CollectionType.WPE %>"
        inList='<%= form.isOnlineResourceInList((OnlineResourcesListValue)pageContext.getAttribute("resource")) %>'
        formName="<%= BookListForm.FORM_NAME %>"/>
</tr>
<tr>
    <td colspan="5">
        <c:choose>
	       <c:when test="${form.printerFriendly}">
            &nbsp;
           </c:when>
            <c:otherwise>
                <base:imageLine width="100%" height="2" />
            </c:otherwise>
        </c:choose>
    </td>
</tr>
</c:forEach>
</table>
</td></tr>
<!-- End onlineresourceslist.jsp -->
