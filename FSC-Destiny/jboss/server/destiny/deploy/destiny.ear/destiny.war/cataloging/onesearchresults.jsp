
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>

<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.OneSearchResultsForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>


<c:set var="form" value="<%=request.getAttribute(OneSearchResultsForm.FORM_NAME)%>"/>
<jsp:useBean id="form" type="com.follett.fsc.destiny.client.cataloging.servlet.OneSearchResultsForm"/>
<base:form action="/cataloging/servlet/presentonesearchresultsform.do" >
<html:hidden property="<%=OneSearchResultsForm.HIDDEN_SEARCH_STRING%>"/>
<html:hidden property="<%=OneSearchResultsForm.HIDDEN_DISPLAY_STRING%>"/>
<html:hidden property="<%=OneSearchResultsForm.HIDDEN_PAGE_INDEX%>"/>
<html:hidden property="<%=OneSearchResultsForm.HIDDEN_SEARCH_ID%>"/>
<html:hidden property="<%=OneSearchResultsForm.PARAM_MODE%>"/>
<html:hidden property="<%=OneSearchResultsForm.HIDDEN_SHOW_ID%>"/>
<table width="100%" border="0" cellpadding="0" cellspacing="0">
<tr>
    <td>
        <table id="<%=OneSearchResultsForm.TABLE_PAGING_HEADER%>" width="100%">
        <tr>
            <td>
	           <c:if test="${form.pageIndex == 1}">
                    <span class="ColRowBold">One Search results for ${form.displayString}</span>
                    <c:if test="${!form.printerFriendly && form.displayString == null}">
                        &nbsp;<span class="SmallColRow">[<a href="${form.refineLink}" id="<%=OneSearchResultsForm.ID_LINK_REFINE_SEARCH %>">Refine your search</a>]</span>
                    </c:if>
                </c:if>
            </td>
            <td noWrap class="tdAlignRight" valign="top">
                 <c:if test="${!form.printerFriendly}">
                    <a href="${form.printerFriendlyLink}" target="printerFriendly" id="<%=OneSearchResultsForm.ID_PRINTER_FRIENDLY %>"><base:image alt="Printer Friendly" src="/buttons/small/printerfriendly.gif" align="absbottom"/></a>
                </c:if>&nbsp;
            </td>
        </tr>
        
        <tr vAlign="bottom">
            <td>
               <c:if test="${form.pageIndex == 1}">
                    <c:choose>
                        <c:when test="${fn:length(form.results) > 0}">
                            <span class="ColRow">
                                Databases searched: ${fn:length(form.results)}
                            </span>
                        </c:when>
                        <c:otherwise>
                            <base:messageBox filterMessage="false" showWarningIcon="false" message="<%=form.getNoResultsMessage()%>"/>
                        </c:otherwise>
                    </c:choose>
                </c:if>&nbsp;
            </td>
            
            <td class="tdAlignRight">
                <c:if test="${form.displayListControls}">
                    <base:myListSelect name="<%= OneSearchResultsForm.FIELD_LIST_ID %>" 
                     selectedMyListID="<%=form.getListID()%>" submitOnChange="true" 
                     prompt='<%="Selected List:"  %>' 
                     dropDownClass="SmallColRow"/>
                </c:if>
            </td>
        </tr>
        </table>
    </td>
</tr>
<tr>
    <td width="95%">    
        <base:imageLine/>
    </td>
</tr>

<tr>
    <td>                                                          

        <c:forEach var="database" items="${form.results}" varStatus="status">
        <jsp:useBean id="database" type="com.follett.fsc.destiny.util.onesearch.OneSearchSearchResultElement"/>        
            <c:url var="baseurl" value="/cataloging/servlet/presentonesearchresultsform.do"/>
            <a name="<%=OneSearchResultsForm.ANCHOR_ONE_SEARCH%><c:out value="${status.index}"></c:out>"></a>
            <table id="<%=OneSearchResultsForm.TABLE_SEARCH_RESULTS_PREFIX%>${status.index}" width="100%">
                <tr>
	               <c:choose>
                      <c:when test="${!form.printerFriendly}">
                        <td align="center" width="20%">  
                                <c:if test="${form.pageIndex == 1}">
                                    <c:choose>
                                        <c:when test="${form.showID != status.index}">
                                            <c:url var="url" value="${baseurl}">
                                                <c:param name="showID" value="${status.index}"/>
                                                <c:param name="action" value="<%=OneSearchResultsForm.ACTION_SHOW%>"/>
                                                <c:param name="searchString" value="${form.searchString}"/>
                                                <c:param name="searchID" value="${form.searchID}"/>
                                                <c:param name="mode" value="${form.mode}"/>
                                            </c:url>
                                            <base:link href="${url}">
                                                <img border="0" 
                                                src="<c:out value="<%=JSPHelper.getPassthroughImageURL(database.getImageSource())%>" 
                                                default="/icons/general/logo.png"/>"><br>

                                                <base:image alt="<%=OneSearchResultsForm.ALT_SHOW%>" src="/buttons/large/show.gif"/>
                                            </base:link>
                                        </c:when>
                                        <c:otherwise>
                                            <c:url var="url" value="${baseurl}">
                                                <c:param name="action" value="<%=OneSearchResultsForm.ACTION_HIDE%>"/>
                                                <c:param name="searchString" value="${form.searchString}"/>
                                                <c:param name="searchID" value="${form.searchID}"/>
                                                <c:param name="hideID" value="${status.index}"/>
                                                <c:param name="mode" value="${form.mode}"/>
                                            </c:url>
                                            <base:link href="${url}">
                                                 <img border="0" 
                                                src="<c:out value="<%=JSPHelper.getPassthroughImageURL(database.getImageSource())%>" 
                                                default="/icons/general/logo.png"/>"><br>
                                                <base:image alt="<%=OneSearchResultsForm.ALT_HIDE%>" src="/buttons/large/hide.gif"/>
                                            </base:link>
                                        </c:otherwise>
                                    </c:choose>
                            </c:if>
                        </td>
                        <td>
                      </c:when>
                      <c:otherwise>
                        <td colspan="2">
                      </c:otherwise>
                   </c:choose>
                
                
                    	<table id="<%=OneSearchResultsForm.TABLE_TRANSLATOR_DESCRIPTION_PREFIX%>${status.index}">
	                        <tr>
	                        	<td>
                                    <c:if test="${form.pageIndex == 1}">
    			                        <span class="ColRowBold">
    			                            <c:if test="${!form.printerFriendly}">
    			                                <base:link href="${database.linkHref}" target="_blank" styleClass="DetailLink">
    			                                ${database.translatorName}
    			                                </base:link>
    			                            </c:if>
    			                            <c:if test="${form.printerFriendly}">
    			                                ${database.translatorName}
    			                            </c:if>
    			                        </span>
                                    </c:if>
		                        </td>
	                        </tr>
                            <c:if test="${form.pageIndex == 1}">
    	                        <tr>
    	                        	<td class="ColRowBold">
    	                        	Found ${database.totalRecords} results for "${database.searchString}"
    	                        	</td>
                            	</tr>
    	                        <tr>
    	                        	<td>
    	                        		<span class="SmallColRow">    
    	                            		${database.blurbage}
    		                        	</span>
    	                        	</td>
                            	</tr>
                            </c:if>
                        </table>
                    </td>
                </tr>
                <c:if test="${form.showID == status.index || form.pageIndex > 1}">
                    <c:if test="${fn:length(database.errorMessage) > 0}">
                        <tr>
                            <td class="ColRowBold" colspan="2">
                                <font color="#cc0000">${database.errorMessage}</font>
                            </td>
                        </tr>
                    </c:if>
                    <c:if test="${fn:length(database.remapEntries) > 0}">
                        <c:forEach var="entry" items="${database.remapEntries}">
                            <tr>
                                <td class="ColRowBold" colspan="2">
                                    ${entry.before}  search is not available for this database. ${entry.after} search performed instead. 
                                </td>
                            </tr>
                        </c:forEach>
                    </c:if>
                    <c:if test="${fn:length(database.remapOperatorEntries) > 0}">
                        <c:forEach var="entry" items="${database.remapOperatorEntries }">
                            <tr>
                                <td class="ColRowBold" colspan="2">
                                    Search operator ${entry.before} is not available for this database. Operator ${entry.after} used instead. 
                                </td>
                            </tr>
                        </c:forEach>
                    </c:if>
                    <c:if test="${fn:length(database.warningMessage) > 0}">
                        <tr>
                            <td class="ColRowBold" colspan="2">
                                ${database.warningMessage}
                            </td>
                        </tr>
                    </c:if>
                    <tr>
                        <td class="ColRowBold" colspan="2">
                            <c:choose>
                                <c:when test="${database.noRecords == 'true'}">
                                    No results were returned for "${database.searchString}"
                                </c:when>
                                <c:otherwise>
                                    Showing Results ${database.beginningRecord} - ${database.endingRecord} of ${database.totalRecords} for ${database.searchString}
                                </c:otherwise>
                            </c:choose>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <table id="<%=OneSearchResultsForm.TABLE_SEARCH_RESULTS_LINKS%>" width="100%" cellspacing = "0" cellpadding="0">
                                <c:set var="trvalue" value = "bgColor=\"#E8E8E8\"" />
                                <c:set var="activeDatabase" value="${form.activeDatabase}"/>
                                <c:forEach var="result" items="${activeDatabase.results}" varStatus="resultIndex">
                                    <tr ${trvalue} >
                                        <td class="ColRowBold" valign="top">
                                            <a name="anchor_<c:out value="${resultIndex.count - 1}"></c:out>"></a>
                                            ${result.recordNumber}.&nbsp;&nbsp;
                                        </td>
                                        <td class="ColRowBold">
                                            <c:if test="${!form.printerFriendly}">
                                            <c:choose>
                                                    <c:when test="${fn:length(result.linkTarget) == 0}">
                                                    <a href="${result.linkHref}" target="_blank">${result.title}</a>
                                                </c:when>
                                                <c:when test='${result.linkTarget == "NONE"}'>
                                                    <a href="${result.linkHref}">${result.title}</a>
                                                </c:when>
                                                <c:otherwise>
                                                    <a href="${result.linkHref}" target="${result.linkTarget}">${result.title}</a>
                                                </c:otherwise>
                                            </c:choose>
                                            </c:if>
                                            <c:if test="${form.printerFriendly}">
                                                ${result.title}
                                            </c:if>
                                        </td>
                                        
                                        <base:addToBookList searchID="${form.searchID}" sortID="${form.showID}" 
                                            itemID="${resultIndex.count - 1}" inList="${result.inSelectedList}"
                                            oneSearch="true"
                                            align="left"
                                            formName="<%= OneSearchResultsForm.FORM_NAME %>"/>
                                    </tr>
                                    <tr ${trvalue}>
                                        <td>&nbsp;</td>
                                        <td class="ColRow" colspan="2">
                                            <c:if test="${fn:length(result.author) >0}">
                                                ${result.author}<br>
                                            </c:if>
                                            <c:if test="${fn:length(result.citation) >0}">
                                                ${result.citation}<br>
                                            </c:if>
                                            <c:if test="${fn:length(result.publisherName) >0}">
                                                ${result.publisherName}<br>
                                            </c:if>
                                            <c:if test="${fn:length(result.itemComputerSize) >0}">
                                                ${result.itemComputerSize}<br>
                                            </c:if>
                                            <c:if test="${fn:length(result.edition) >0}">
                                                ${result.edition}<br>
                                            </c:if>
                                            <c:if test="${fn:length(result.volume) >0}">
                                                ${result.volume}<br>
                                            </c:if>
                                            <c:if test="${fn:length(result.issue) >0}">
                                                ${result.issue}<br>
                                            </c:if>
                                            <c:if test="${fn:length(result.numberOfPages) >0}">
                                                ${result.numberOfPages}<br>
                                            </c:if>
                                            <c:if test="${fn:length(result.numberOfColorImages) >0}">
                                                ${result.numberOfColorImages}<br>
                                            </c:if>
                                            <c:if test="${fn:length(result.numberOfBWImages) >0}">
                                                ${result.numberOfBWImages}<br>
                                            </c:if>
                                            <c:if test="${fn:length(result.startingPage) >0}">
                                                ${result.startingPage}<br>
                                            </c:if>
                                            <c:if test="${fn:length(result.description) >0}">
                                                ${result.description}<br>
                                                ${result.date}
                                            </c:if>
                                        </td>
                                    </tr>
                                    <c:choose>
                                        <c:when test="${fn:length(trvalue) > 0}">
                                            <c:set var="trvalue" value = "" />
                                        </c:when>
                                        <c:otherwise>
                                            <c:set var="trvalue" value = "bgColor=\"#E8E8E8\"" />
                                        </c:otherwise>
                                    </c:choose>
                                </c:forEach>
                            </table>
                        </td>
                    </tr>
                    <c:if test="${!form.printerFriendly}">
                        <c:if test="${fn:length(database.otherLinksEntries) > 0}">
                            <c:forEach var="otherLink" items="${database.otherLinksEntries}">
                                <c:url var="nexturl" value="${baseurl}">
                                    <c:param name="showID" value="${form.showID}"/>
                                    <c:param name="searchID" value="${form.searchID}"/>
                                    <c:param name="mode" value="${form.mode}"/>
                                    <c:param name="searchString" value="${form.searchString}"/>
                                    <c:param name="action" value="<%=OneSearchResultsForm.ACTION_NEXT%>"/>
                                    <c:param name="pageIndex" value="${form.pageIndex}"/>
                                    <c:param name="linkName" value="${otherLink.linkName}"/>
                                </c:url>
                                <tr>
                                    <td align="center" width="100%" colspan="2">
                                        <span class="ColRowBold">
                                            <base:link href="${nexturl}">
                                            [ See results for ${otherLink.linkDescription} ]
                                            </base:link>
                                        </span>
                                    </td>
                                </tr>
                            </c:forEach>
                        </c:if>
                    
                    <tr>
                        <td align="center" width="100%" colspan="2">
                            <c:if test="${database.beginningRecord > 1}">
                                <base:link href="${form.previousLink}" id="<%=OneSearchResultsForm.ID_LINK_PREVIOUS %>">
                                    <base:image src="/icons/general/previous.gif" alt="<%= OneSearchResultsForm.ALT_PREVIOUS%>"/>
                                </base:link>
                            </c:if>
                            <c:if test="${fn:length(database.nextPageEntries) > 0}">
                                <c:forEach var="nextPage" items="${database.nextPageEntries}" varStatus="npstatus">
                                    <c:if test="${npstatus.first}">
                                        <c:url var="nexturl" value="${baseurl}">
                                            <c:param name="showID" value="${form.showID}"/>
                                            <c:param name="searchID" value="${form.searchID}"/>
                                            <c:param name="mode" value="${form.mode}"/>
                                            <c:param name="searchString" value="${form.searchString}"/>
                                            <c:param name="action" value="<%=OneSearchResultsForm.ACTION_NEXT%>"/>
                                            <c:param name="pageIndex" value="${form.pageIndex}"/>
                                            <c:param name="linkName" value="${nextPage.linkName}"/>
                                        </c:url>
                                        <base:link href="${nexturl}" id="<%=OneSearchResultsForm.ID_LINK_NEXT %>">
                                            <base:image src="/icons/general/next.gif" alt="<%= OneSearchResultsForm.ALT_NEXT%>"/>
                                        </base:link>
                                    </c:if>
                                </c:forEach>
                            </c:if>
                        </td>
                    </tr>
                    </c:if>
                </c:if>
            </table>
            
            <br>
            <base:imageLine/>
        </c:forEach>
    </td>
</tr>

<c:if test="${!form.resultsComplete}">
    <c:if test="${!form.printerFriendly}">
        <tr>
            <td align="center" class="ColRowBold">
                <base:image src="/icons/general/zprogress.gif"/>
                &nbsp;Searching Online Resources...&nbsp;
                <base:genericButton name="<%=OneSearchResultsForm.BUTTON_GET_RESULTS%>" src="/buttons/large/getresults.gif"  alt="Get Results" />
            </td>
        </tr>
    </c:if>        
</c:if>        
</table>
</base:form>
