<%@page import="com.follett.fsc.destiny.util.webpathsearch.WebPathResultSpecs"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.WPESearchForm" %>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.WPEBrowseForm"%>
<%@page import="com.follett.fsc.destiny.util.webpathsearch.WebPathSearch"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.WebPathSearchResultsForm"%>
<%@page import="com.follett.fsc.destiny.util.webpathsearch.WebPathBrowseBranch"%>
<%@page import="com.follett.fsc.destiny.util.webpathsearch.WebPathBrowseHeading"%>
<%@page import="com.follett.fsc.destiny.util.Permission"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>


<base:messageBox strutsErrors="true"/>

<%
    WPESearchForm form = (WPESearchForm)request.getAttribute(WPESearchForm.FORM_NAME);
%>

<c:set var="form" value="<%= form %>"/>
<c:set var="typeVS" value="<%=WPEBrowseForm.SEARCH_TYPE_VISUAL_SEARCH %>"/>
<c:set var="baseBranchImageURL" value="<%=WebPathSearch.getWebpathVisualSearchBranchGraphicsURL() %>"/>
<c:set var="baseHeadingImageURL" value="<%=WebPathSearch.getWebpathVisualSearchBranchGraphicsURL() %>"/>
<c:set var="baseThemeImageURL" value="<%=WebPathSearch.getBaseThemeAndSpotlightImageURL(form.getStore().getSiteCustomerNumber())%>"/>
<c:set var="fieldHeadingNumber" value="<%=WebPathSearchResultsForm.FIELD_HEADING_NUMBER %>"/>
<c:set var="displayTabs" value="<%=WebPathSearchResultsForm.DISPLAY_TABS_ON_WPE_RESULTS %>"/>
<c:set var="spotlightImageID" value="<%=WPESearchForm.PARAM_SPOTLIGHT_IMAGE_ID %>"/>

<base:form action="/cataloging/servlet/handlewpesearchform.do" focus="<%=WPESearchForm.FIELD_SEARCH_STRING%>">
<html:hidden property="<%=WPESearchForm.FIELD_SPOTLIGHT_ID %>"/>
<html:hidden property="<%=WPESearchForm.FIELD_THEME_ID %>"/>
<base:outlinedTableAndTabsWithinThere id="<%=WPESearchForm.TABLE_WPE_TABS%>" searchGroup="<%=WPESearchForm.SEARCH_GROUP%>" borderColor="#C0C0C0" 
	selectedTab="<%=WPESearchForm.ID_TAB_WPE_SEARCH%>" tabs="<%=WPESearchForm.tabsWPE%>" >
	<tr>
        <td colspan="2" align="center" width="100%">
    	    <table id="<%=WPESearchForm.TABLE_MAIN%>" border="0" cellpadding="0" cellspacing="0" align="center" width="100%">
    	        <tr align="center">
    	            <td class="FormLabel" valign="bottom">
    	                Find&nbsp;
    	            	<html:text property="<%=WPESearchForm.FIELD_SEARCH_STRING%>" size="60"/>
    					&nbsp;	           
    	                <base:genericButton
                            absbottom="true"    
                            src="/buttons/large/search.gif"
    	                    alt="<%=WPESearchForm.ALT_SUBMIT_TEXT%>"
    	                    name="<%=WPESearchForm.BUTTON_SEARCH%>"/>
    	            </td>
                    <td class="SmallColHeading tdAlignRight" valign="bottom">
                        <center>
                            <% if (form.isSMTPServerEnabled()) {%>
                                <base:spanIfAllowed  permission="<%=Permission.CAT_WEB_PATH_EXPRESS_SUBMIT_SUGGESTION %>">
                                    <base:link page="/cataloging/servlet/presentwpesuggestionform.do" id="<%=WPESearchForm.ID_LINK_SUBMIT_SUGGESTION %>">Submit a<br/>suggestion</base:link> 
                                </base:spanIfAllowed>
                            <%} %>
                        </center>
                    </td>
    	        </tr>
    		</table>
    	</td>
    </tr>
    <tr>
        <td align="center">
           <c:set var="theme" value="<%=form.getWPETheme() %>" />
           <c:set var="spotlight" value="<%=form.getWPESpotlight() %>" />
           <c:set var="browseDisplayedWithThemes" value="false" />
           
           <table cellspacing="20">
           <tr>
                <td valign="top" width="350">
           <% if (form.getWPETheme() != null && WebPathResultSpecs.MSG_FAILED_TO_GET_WPE_THEMES.equals(form.getWPETheme().getErrorMessage()) && form.getWPESpotlight() != null && WebPathResultSpecs.MSG_FAILED_TO_GET_WPE_SPOTLIGHT.equals(form.getWPESpotlight().getErrorMessage())) { %>
             <span class="ColRowBold"><%=WebPathResultSpecs.MSG_WPE_SERVICE_NOT_AVAILABLE %></span>
           <% } else { %>
                <c:if test="${! empty theme && empty theme.errorMessage}">
                <jsp:useBean id="theme" type="com.follett.fsc.destiny.util.webpathsearch.WebPathThemeResult" />
                        <table id="<%=WPESearchForm.TABLE_THEME %>" border="0" cellpadding="5" cellspacing="0">
                        <tr>
                            <td colspan="6">
                                <table id="<%=WPESearchForm.TABLE_THEME_HEADER %>" width="100%">
                                <tr>
                                    <td class="tdAlignRight">
                                        <c:choose>
                                            <c:when test="${! empty theme.prevThemeID }">
                                                <base:link href="/cataloging/servlet/presentwpesearchform.do?themeID=${theme.prevThemeID}&spotlightID=${form.spotlightID}" id="<%=WPESearchForm.ID_LINK_PREVIOUS %>">
                                                    <base:image src="/icons/general/previouslonger.gif" width="44" height="26" alt="Previous"/>
                                                </base:link>
                                            </c:when>
                                            <c:otherwise>
                                                <base:imageSpacer height="1" width="44" />
                                            </c:otherwise>
                                        </c:choose>
                                    </td>
                                    <td align="center">
                                        <c:choose>
                                            <c:when test="<%=form.isFilenameAURL(theme.getThemeImageFileName()) %>">
                                                <base:imagePassThrough onlineServiceURL="${theme.themeImageFileName}" width="226" height="84" />
                                            </c:when>
                                            <c:otherwise>
                                                <base:imagePassThrough onlineServiceURL="${baseThemeImageURL}${theme.themeImageFileName}" width="226" height="84" />
                                            </c:otherwise>
                                        </c:choose>
                                    </td>
                                    <td class="tdAlignLeft">
                                        <c:choose>
                                            <c:when test="${! empty theme.nextThemeID }">
                                                <base:link href="/cataloging/servlet/presentwpesearchform.do?themeID=${theme.nextThemeID}&spotlightID=${form.spotlightID}" id="<%=WPESearchForm.ID_LINK_NEXT %>">
                                                    <base:image src="/icons/general/nextlonger.gif" width="44" height="26" alt="Next" />
                                                </base:link>
                                            </c:when>
                                            <c:otherwise>
                                                <base:imageSpacer height="1" width="44" />
                                            </c:otherwise>
                                        </c:choose>                            
                                    </td>
                                </tr>
                                </table>
                            </td>
                        </tr>
                        <tr>
                        <c:forEach items="${theme.allBranchesAndHeadings}" var="branch" varStatus="branchStatus">
                            <jsp:useBean id="branch" type="java.lang.Object"/>                         
                            <td width="33%" align="center" valign="top">
                                <table cellpadding="0" border="0" cellspacing="0">
                                    <c:choose>
                                        <c:when test="<%= branch instanceof WebPathBrowseHeading %>">
                                            <tr>
                                                <td align="center">
                                                    <a href="/cataloging/servlet/presentwebpathsearchresultsform.do?${fieldHeadingNumber}=${branch.headingNumber}&${displayTabs}=true&type=<%=WPEBrowseForm.SEARCH_TYPE_VISUAL_SEARCH%>">
                                                        <base:imagePassThrough onlineServiceURL="${baseHeadingImageURL}${branch.imageFileName}" width="80" height="72" alt="${branch.heading}" />
                                                    </a>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td align="center" class="ColHeading">
                                                    <a href="/cataloging/servlet/presentwebpathsearchresultsform.do?${fieldHeadingNumber}=${branch.headingNumber}&${displayTabs}=true&type=<%=WPEBrowseForm.SEARCH_TYPE_VISUAL_SEARCH%>" id="<%=WPESearchForm.ID_BUTTON_FIND_IT + ((WebPathBrowseHeading)branch).getHeadingNumber() %>">${branch.heading}</a>
                                                </td>
                                            </tr>
                                        </c:when>
                                        <c:when test="<%= branch instanceof WebPathBrowseBranch %>">
                                            <tr>
                                                <td align="center">
                                                    <a href="/cataloging/servlet/handlewpebrowseform.do?type=${typeVS}&oid=${branch.oid}&type=<%=WPEBrowseForm.SEARCH_TYPE_VISUAL_SEARCH%>" id="<%=WPESearchForm.ID_LINK_BROWSE + ((WebPathBrowseBranch)branch).getOid() %>">
                                                        <base:imagePassThrough onlineServiceURL="${baseBranchImageURL}${branch.imageFileName}" 
                                                         width="80" height="72" alt="${branch.data}" />
                                                    </a>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td align="center" class="ColHeading">
                                                    ${branch.data}
                                                </td>
                                            </tr>
                                        </c:when>
                                        <c:otherwise>
                                            <tr><td>&nbsp;</td></tr>
                                        </c:otherwise>
                                    </c:choose>
                                    <tr>
                                        <td>
                                            &nbsp;
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </c:forEach>
                        </tr>
                       </table>
                </c:if>
                       <table id="Browse" border="0" cellpadding="5" cellspacing="0" align="center">
                           <tr>
                               <td colspan="6">
                                   <base:wpeBrowseTree/>
                               </td>
                           </tr>                            
                       </table>
                       <c:set var="browseDisplayedWithThemes" value="true" />
                   </td>
                    
                
                <c:if test="${! empty spotlight && empty spotlight.errorMessage}">
                <jsp:useBean id="spotlight" type="com.follett.fsc.destiny.util.webpathsearch.WebPathSpotlightResult" />
                    <td width="225" valign="top">
                        <base:outlinedTable id="<%=WPESearchForm.TABLE_SPOTLIGHT %>" borderColor="#C0C0C0" cellpadding="5">
                        <tr>
                            <td>
                                <c:choose>
                                    <c:when test="${! empty spotlight.prevSpotlightID }">
                                        <base:link href="/cataloging/servlet/presentwpesearchform.do?themeID=${form.themeID}&spotlightID=${spotlight.prevSpotlightID }" id="<%=WPESearchForm.ID_LINK_PREVIOUS %>">
                                            <base:image src="/icons/general/previous.gif" width="21" height="26" alt="Previous"/>
                                        </base:link>
                                    </c:when>
                                    <c:otherwise>
                                        <base:imageSpacer height="1" width="21" />
                                    </c:otherwise>
                                </c:choose>                                                
                            </td>
                            <td width="100%" align="center" class="FormHeading">
                                ${spotlight.title}
                            </td>
                            <td class="tdAlignRight">
                                <c:choose>
                                    <c:when test="${! empty spotlight.nextSpotlightID }">
                                        <base:link href="/cataloging/servlet/presentwpesearchform.do?themeID=${form.themeID}&spotlightID=${spotlight.nextSpotlightID }" id="<%=WPESearchForm.ID_LINK_NEXT %>">
                                            <base:image src="/icons/general/next.gif" width="21" height="26" alt="Next"/>
                                        </base:link>
                                    </c:when>
                                    <c:otherwise>
                                        <base:imageSpacer height="1" width="21" />
                                    </c:otherwise>
                                </c:choose>                                                
                            </td>
                        </tr>
                        <tr>
                            <td colspan="3" align="center">
                                <base:imageLine />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="3" align="center" class="ColRowBold">
                                ${spotlight.heading}
                            </td>
                        </tr>
                        <c:if test="${! empty spotlight.imageLinkFileName}">
                            <tr>
                                <td colspan="3" align="center">
                                    <c:if test="${! empty spotlight.imageFileName}">
                                        <a href="/cataloging/servlet/handlewpesearchform.do?${spotlightImageID}=${spotlight.spotlightID}" target="_blank">
                                    </c:if>
                                        <c:choose>
                                            <c:when test="<%=form.isFilenameAURL(spotlight.getImageLinkFileName()) %>">
                                                <base:imagePassThrough onlineServiceURL="${spotlight.imageLinkFileName}" width="150"/>
                                            </c:when>
                                            <c:otherwise>
                                                <base:imagePassThrough onlineServiceURL="${baseThemeImageURL}${spotlight.imageLinkFileName}" width="150" />
                                            </c:otherwise>
                                        </c:choose>
                                    <c:if test="${! empty spotlight.imageFileName}">
                                        </a>
                                    </c:if>
                                </td>
                            </tr>
                        </c:if>
                        <tr>
                            <td colspan="3" class="ColRow">
                                ${spotlight.description}
                            </td>
                        </tr>
                        <c:forEach items="${spotlight.externalLinks}" var="link">
                        <jsp:useBean id="link" type="com.follett.fsc.common.StringURLValue" />
                            <tr>
                                <td colspan="3" class="ColRow">
                                    <%=link.toHTML(WPESearchForm.MAX_DISPLAYABLE_LENGTH, "_blank") %>
                                </td>
                            </tr>
                        </c:forEach>
                        </base:outlinedTable>
                    </td>
                </c:if>  
          <% } %>
            <c:if test="${! browseDisplayedWithThemes}">
               <table id="Browse" border="0" cellpadding="5" cellspacing="0">
                   <tr>
                       <td colspan="6">
                           <base:wpeBrowseTree/>
                       </td>
                   </tr>                            
               </table>
            </c:if>
          </tr>
          </table>
          
          
        </td>    
    </tr>
</base:outlinedTableAndTabsWithinThere>

</base:form>


