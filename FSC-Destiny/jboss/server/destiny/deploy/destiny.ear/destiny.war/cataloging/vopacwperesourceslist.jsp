<%@page import="com.follett.fsc.destiny.util.ObjectHelper"%>
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
<%@ page import="com.follett.fsc.destiny.util.xml.BaseOnlineResourcesSpecs"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.BaseSearchResultsForm"%>
<%@page import="com.follett.fsc.destiny.util.DestinySystemProperties"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.webpath.clientjar.WPEConstants"%>



<c:set var="form" value="<%=request.getAttribute(BookListForm.FORM_NAME)%>"/>
<c:set var="wpeURL" value="<%=DestinySystemProperties.getWebPathExpressHostAndPort()%>"/>
<base:messageBox strutsErrors="true"/>

<tr><td colspan="2">
<table id="<%=BaseSearchResultsForm.TABLE_ONLINE_RESOURCES %>" border="0" cellspacing="0" cellpadding="0" width="100%">
<c:forEach var="resource" items="${form.list}">
<jsp:useBean id="resource" type="com.follett.fsc.destiny.session.cataloging.ejb.data.VopacWPECachedRecord"/>
<tr>
    <td class="ColRowBold" colspan="4">
        <c:choose>
            <c:when test="${form.printerFriendly}">
                <c:out value="${resource.element.title}"/>
            </c:when>
            <c:otherwise>
                <base:link styleClass="DetailLink" page="${resource.element.url}" target="other"><c:out value="${resource.element.title}"/></base:link>
            </c:otherwise>
        </c:choose>
    </td>
    <td class="tdAlignRight">
            <table id="<%=BaseSearchResultsForm.TABLE_GRADES %>" border="0" cellpadding="0" cellspacing="0">
            <tr>
                <td class="ColRowBold" vAlign="bottom"><%= MessageHelper.formatMessage("vopacwperesourceslist_GradeLevel") %></td>
                <td class="ColRowBold" vAlign="bottom">
                <c:choose>
                    <c:when test="${resource.element.gradeLevelPreKto2}">
                        <c:choose>
                            <c:when test="${form.printerFriendly}">   
                                &nbsp;<%=MessageHelper.formatMessage("vopacwperesourceslist_gradelevelPreKToTwo") %>
                            </c:when>
                            <c:otherwise>
                                <base:imagePassThrough onlineServiceURL="http://${wpeURL}/wpebrowse/images/icons/prek-2.gif"  width="32" height="32" alt='<%=MessageHelper.formatMessage("vopacwperesourceslist_gradelevelPreKToTwo") %>'/>
                            </c:otherwise>
                        </c:choose>
                    </c:when>
                    <c:otherwise>
                        <base:imageSpacer width="32" height="32"/>
                    </c:otherwise>
                </c:choose>     
                </td>
                
                <td class="ColRowBold" vAlign="bottom">
                <c:choose>
                    <c:when test="${resource.element.gradeLevel3to5}">
                        <c:choose>
                            <c:when test="${form.printerFriendly}">
                                &nbsp;<%=MessageHelper.formatMessage("vopacwperesourceslist_gradelevelThreeToFive") %>
                            </c:when>
                            <c:otherwise>
                                <base:imagePassThrough onlineServiceURL="http://${wpeURL}/wpebrowse/images/icons/3-5.gif"  width="32" height="32" alt='<%=MessageHelper.formatMessage("vopacwperesourceslist_gradelevelThreeToFive") %>'/>
                            </c:otherwise>
                        </c:choose>
                    </c:when>
                    <c:otherwise>
                        <base:imageSpacer width="32" height="32"/>
                    </c:otherwise>
                </c:choose>     
                </td>
                
                <td class="ColRowBold" vAlign="bottom">
                <c:choose>
                    <c:when test="${resource.element.gradeLevel6to8}">
                        <c:choose>
                            <c:when test="${form.printerFriendly}">
                                &nbsp;<%=MessageHelper.formatMessage("vopacwperesourceslist_gradelevelSixToEight") %>
                            </c:when>
                            <c:otherwise>
                                <base:imagePassThrough onlineServiceURL="http://${wpeURL}/wpebrowse/images/icons/6-8.gif"  width="32" height="32" alt='<%=MessageHelper.formatMessage("vopacwperesourceslist_gradelevelSixToEight") %>'/>
                            </c:otherwise>
                        </c:choose>
                    </c:when>
                    <c:otherwise>
                        <base:imageSpacer width="32" height="32"/>
                    </c:otherwise>
                </c:choose>            
                </td>
                
                <td class="ColRowBold" vAlign="bottom">
                <c:choose>
                    <c:when test="${resource.element.gradeLevel9to12}">
                        <c:choose>
                            <c:when test="${form.printerFriendly}">
                                &nbsp;<%=MessageHelper.formatMessage("vopacwperesourceslist_gradelevelNineToTwelve") %>
                            </c:when>
                            <c:otherwise>
                                <base:imagePassThrough onlineServiceURL="http://${wpeURL}/wpebrowse/images/icons/9-12.gif"  width="32" height="32" alt='<%=MessageHelper.formatMessage("vopacwperesourceslist_gradelevelNineToTwelve") %>'/>
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
    </td>
</tr>
<tr>
    <td class="ColRow" colspan="5"><c:out escapeXml="false" value="${resource.element.description}"/></td>
</tr>
    <tr>
        <td><span class="ColRowBold"><%= MessageHelper.formatMessage("vopacwperesourceslist_Topic") %></span>&nbsp;<span class="ColRow">
            <c:out value="${resource.element.headingString}"/>
        </span></td>
        <td><%if (!StringHelper.isEmpty(resource.getElement().getLanguage()) ) { %><span class="ColRowBold"><%=MessageHelper.formatMessage("vopacwperesourceslist_Language") %>&nbsp;</span><span class = "ColRow"><%=resource.getElement().getLanguage() %>&nbsp;</span><% } %></td>
        <td><%if (!StringHelper.isEmpty(resource.getElement().getLexileMeasure()) ) { %><span class="ColRowBold">&nbsp;<%=MessageHelper.formatMessage("vopacwperesourceslist_LexileMeasure") %>&nbsp;</span><span class = "ColRow"><%=resource.getElement().getLexileMeasure() %>&nbsp;</span><% } else { out.println("&nbsp;"); }%></td>
        <c:choose>
            <c:when test="${form.printerFriendly}">
          <td><span class="ColRowBold"><%if ( !StringHelper.isEmptyOrWhitespace(resource.getElement().getFormatTypeString())) { %>&nbsp;<%=MessageHelper.formatMessage("vopacwperesourceslist_FormatType") %>&nbsp;</span><span class = "ColRow"><%=resource.getElement().getFormatTypeString() %>&nbsp;</span><%} else { out.println("&nbsp;"); }%> </td>
          <td><span class="ColRowBold"><%if ( !StringHelper.isEmptyOrWhitespace(resource.getElement().getSourceTypeString())) { %>&nbsp;<%=MessageHelper.formatMessage("vopacwperesourceslist_SourceType") %>&nbsp;</span><span class = "ColRow"><%=resource.getElement().getSourceTypeString() %>&nbsp;</span><%} else { out.println("&nbsp;"); }%> </td>
            </c:when>
          <c:otherwise>
            <td>
                <%if ( !StringHelper.isEmptyOrWhitespace(resource.getElement().getFormatTypeString())) {
                     List<String> formatTypes = resource.getElement().getFormatTypeList();
                     Iterator<String> itr = formatTypes.iterator();
                      while ( itr.hasNext()) {
                      String formatName = itr.next();
                    %>
                    <% String url = "http://" + DestinySystemProperties.getWebPathExpressHostAndPort() + "/wpebrowse/images/icons/" + WPEConstants.descriptionToImage(formatName); %>
                    <base:imagePassThrough onlineServiceURL="<%=url %>" alt="<%=formatName%>" width="24" height="24"/>
                <%   }
                   } else {
                    out.println("&nbsp;");
                }
                %>
            </td>
            <td>
                <%if ( !StringHelper.isEmptyOrWhitespace(resource.getElement().getSourceTypeString())) { 
                     List<String> sourceTypes = resource.getElement().getSourceTypeList();
                     Iterator<String> itr = sourceTypes.iterator();
                      while ( itr.hasNext()) {
                      String sourceName = itr.next();                
                %>
                 <% String url = "http://" + DestinySystemProperties.getWebPathExpressHostAndPort() + "/wpebrowse/images/icons/" + WPEConstants.descriptionToImage(sourceName); %>
                    <base:imagePassThrough onlineServiceURL="<%=url %>" alt="<%=sourceName%>" width="24" height="24"/>
                <%   }
                   } else {
                    out.println("&nbsp;");
                }
                %>
            </td>
          </c:otherwise>
        </c:choose>
        
    </tr>
<tr>
    <td colspan="5">
        <table id="<%=BaseSearchResultsForm.TABLE_URL%>"  border="0" cellpadding="0" cellspacing="0" width="100%">
            <tr>
                <td><span class="SmallColHeading"><%= MessageHelper.formatMessage("vopacwperesourceslist_URL") %></span>&nbsp;
                <span class="SmallColRow">
                <c:choose>
                    <c:when test="${form.printerFriendly}">
                        <c:out value="${resource.displayableURL}"/>
                    </c:when>
                    <c:otherwise>
                        <base:link page="${resource.element.url}" target="other"><c:out value="${resource.displayableURL}"/></base:link>
                    </c:otherwise>
                </c:choose>    
                </span>
                </td>
                <td class="tdAlignRight">
                    <c:if test="${!form.printerFriendly && !form.publicList}">
                        <base:link
                                page="/cataloging/servlet/presentwebsitecitationform.do?resourceID=${resource.resourceListDetailID}"  
                                showTextAlways="true" id="<%=BookListForm.ID_BUTTON_EDIT_CITATION + resource.getResourceListDetailID() %>">
                            <base:image align="top" src="/buttons/small/citation.gif" alt='<%= MessageHelper.formatMessage("editCitation")  %>'/>
                        </base:link>&nbsp;
                    </c:if>
                </td>
            </tr>
        </table>
    </td>
</tr>
<tr>
    <td class="SmallColHeading" colspan="4">Source:&nbsp;
        <c:set var="onlineResourceTypeWebPath" value="<%=BaseOnlineResourcesSpecs.RESOURCE_TYPE_WPE%>"/>
        <c:choose>
            <c:when test="${resource.element.onlineResourceType == onlineResourceTypeWebPath}">
               <c:out value="<%=BaseOnlineResourcesSpecs.RESOURCE_TYPE_WPE_DISPLAY_NAME%>"/>
            </c:when>
            <c:otherwise>
               <c:out value="<%=BaseOnlineResourcesSpecs.RESOURCE_TYPE_STANDARDS_DISPLAY_NAME%>"/>
            </c:otherwise>
        </c:choose>    



    </td>
    <base:addToBookList itemID="${resource.resourceListDetailID}"
        webSite="true"
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
