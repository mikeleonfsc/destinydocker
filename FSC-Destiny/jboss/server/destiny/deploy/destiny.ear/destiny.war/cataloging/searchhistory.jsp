<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.SearchHistoryForm"%>

<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator"%>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>


<jsp:useBean id="SearchHistorySpecs" class="com.follett.fsc.destiny.entity.ejb3.SearchHistorySpecs"/>

<base:messageBox strutsErrors="true"/>

<c:set var="form" value="${requestScope.form}" />
<base:form action="/cataloging/servlet/handlesearchhistoryform.do">
<html:hidden property="${form.constants.PARAM_SEARCH_GROUP_ID}"/>
    <c:if test="${form.action == 'ConfirmDelete'}">
        <base:imageSpacer width="1" height="3"/>
        <base:messageBox message="${form.deleteDescription}">
            <tr>
                <td align="center" class="ColRow" colspan="2">
                    <%= MessageHelper.formatMessage("searchhistory_AreYouSureYouWantToDeleteTheseSarches") %>
                </td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2">
                    <base:yesNo
                         buttonYesName="<%=SearchHistoryForm.ID_BUTTON_ACTION_YES %>"
                         buttonNoName="<%=SearchHistoryForm.ID_BUTTON_ACTION_NO %>"
                    />
                </td>
            </tr>
        </base:messageBox>
    </c:if>
    <base:outlinedTable id="${form.constants.TABLE_SEARCH_HISTORY_OUTER}" width="100%" cellpadding="2" borderColor="#C0C0C0">
        <tr>
            <td colspan="2">
                <span class="TableHeading">
                    ${form.tableHeading}
                </span> 
                <c:if test="${!form.printerFriendly}">
                    <span class="SmallColRow">
                        [ <a href="#clearSearchHistoryAnchor" id="<%=SearchHistoryForm.ID_LINK_CLEAR_HISTORY %>"><%= MessageHelper.formatMessage("searchhistory_ClearSearchHistory") %></a> ]
                    </span>
                </c:if>
            </td>
            <td noWrap class="tdAlignRight" valign="top">
                <c:if test="${!form.printerFriendly}">
                    <a href="${form.printerFriendlyLink}" target="printerFriendly" id="<%=SearchHistoryForm.ID_PRINTER_FRIENDLY %>">
                        <base:image src="/buttons/large/printit.gif"  alt='<%= MessageHelper.formatMessage("printIt") %>'/>
                    </a>
                </c:if>
            </td>
        </tr>
        <tr>
            <td colspan="4" class="Instruction">
                ${form.searchRetainedText}
            </td>
        </tr>
        <tr>
            <td colspan="4">
                <base:imageLine height="1" width="100%" />
            </td>
        </tr>
        <tr>
            <td colspan="4">
                <table id="${form.constants.TABLE_SEARCH_HISTORY}" width="100%" cellpadding="5" cellspacing="0">
                    <tr class="SmallColHeading">
                        <td><%= MessageHelper.formatMessage("searchhistory_Search") %></td>
                        <td><%= MessageHelper.formatMessage("searchhistory_SearchType") %></td>
                        <td>
                            <c:if test="${form.searchGroupID != SearchHistorySpecs.SEARCH_GROUP_WEBPATH}">
                                <%= MessageHelper.formatMessage("searchhistory_AdditionalLimiters") %>
                            </c:if>
                        </td>
                        <td nowrap="nowrap"><%= MessageHelper.formatMessage("searchhistory_DateTimeSearched") %></td>
                    </tr>
                    <jsp:useBean id="form" type="com.follett.fsc.destiny.client.cataloging.servlet.SearchHistoryForm"/>
                    <c:forEach var="search" items="${form.searchHistory}" varStatus="status">
                        <jsp:useBean id="search" type="com.follett.fsc.destiny.session.cataloging.data.SearchHistoryClientValue"/>
                      <c:choose>
                         <c:when test="${status.count % 2 == 1}">
                            <tr bgcolor="#E8E8E8" valign="top" class="ColRow">
                         </c:when>
                         <c:otherwise>
                            <tr valign="top" class="ColRow">
                         </c:otherwise>
                      </c:choose>             
                      <!-- tr -->
                         <td>
                            <c:choose>
                                <c:when test="${!form.printerFriendly}">
                                    <c:choose>
                                        <c:when test="${search.searchType == SearchHistorySpecs.SEARCH_TYPE_VISUAL_WEBSITE}">
                                            <a class="DetailLink" href="<%=form.getSearchURL(search.getSearchType(), search.getSearchHistoryID())%>" target="vswindow" id="<%=SearchHistoryForm.ID_LINK_SEARCH + search.getSearchHistoryID() %>">
                                                ${search.searchDescription}
                                            </a>                         
                                        </c:when>
                                        <c:otherwise>
                                            <a class="DetailLink" href="<%=form.getSearchURL(search.getSearchType(), search.getSearchHistoryID())%>" id="<%=SearchHistoryForm.ID_LINK_SEARCH + search.getSearchHistoryID() %>">
                                                ${search.searchDescription}
                                            </a>                         
                                        </c:otherwise>
                                    </c:choose>
                                </c:when>
                                <c:otherwise>
                                    ${search.searchDescription}
                                </c:otherwise>
                            </c:choose>
                         </td>
                         <td>${search.searchTypeDisplayable}</td>
                         <td>
                            <c:if test="${form.searchGroupID != SearchHistorySpecs.SEARCH_GROUP_WEBPATH}">
                                ${search.limiters}
                            </c:if>                                                  
                         </td>
                         <td><%=form.getFormattedDate(search.getSearchDate())%></td>
                      </tr>
                    </c:forEach>                    
                </table>
            </td>
        </tr>
        <tr>
            <td colspan="4">
                <base:imageLine height="1" width="100%"/>
            </td>
        </tr>
        <c:if test="${!form.printerFriendly}">
            <tr >
                <td colspan="4" align="center">
                    <A name="clearSearchHistoryAnchor"></A>
                    <html:select property="${form.constants.FIELD_CLEAR_SEARCH_HISTORY}">
                        <html:option value="${form.constants.OPTION_CLEAR_SEARCH_HISTORY_CURRENT}">
                            <%= MessageHelper.formatMessage("searchhistory_CurrentSearchHistory") %>
                        </html:option>
                        <html:option value="${form.constants.OPTION_CLEAR_SEARCH_HISTORY_ALL}">
                            <%= MessageHelper.formatMessage("searchhistory_AllSearchHistories") %>
                        </html:option>
                    </html:select>
                    &nbsp;
                    <base:genericButton
                        absbottom="true" 
                        name="${form.constants.BUTTON_CLEAR}" 
                        src="/buttons/large/clear.gif"
                        alt='<%= MessageHelper.formatMessage("clear") %>'
                    />
                </td>
            </tr>
        </c:if>
    </base:outlinedTable>
</base:form>
