<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.TopCirculatingForm" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.TopPatronSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.BasicSearchForm"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-destiny.tld" prefix="d" %>


<script language="JavaScript" type="text/javascript">
  <!-- 
    function submitDropDown() 
    { 
        document.forms["circulation_servlet_TopCirculatingForm"].readingProgramUpdate.value = "true";
        document.forms["circulation_servlet_TopCirculatingForm"].submit();
    }
  //--> 
</script>
<base:messageBox strutsErrors="true"/>

<bean:define id="form" name="<%=TopCirculatingForm.FORM_NAME%>" type="com.follett.fsc.destiny.client.circulation.servlet.TopCirculatingForm"/>
<c:set var="form" value="<%=form %>" />
<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    String updateButtonAltText = MessageHelper.formatMessage("update");
    TopCirculatingForm topform = (TopCirculatingForm)request.getAttribute(TopCirculatingForm.FORM_NAME);
%>

<base:form action="/circulation/servlet/handletopcirculatingform.do">
<html:hidden property="<%= TopCirculatingForm.FIELD_VIEW_TYPE %>"/>
<html:hidden property="<%= TopCirculatingForm.BUTTON_READING_PROGRAM_UPDATE %>"/>
<html:hidden property="<%= TopCirculatingForm.PARAM_FROM_REPORTS %>"/>

<base:outlinedTableAndTabsWithinThere borderColor="#C0C0C0" width="100%" cellpadding="5" 
 tabs="${form.tabs}" selectedTab="${form.selectedTab}" selectedTabID="${form.selectedTabID}">
<tr>
    <td>

    <table id="<%=TopCirculatingForm.TABLE_MAIN%>" width="100%" cellpadding="2">
        <tr>
            <td class="TableHeading">
                <c:if test="${form.patronView}">
                    <%= MessageHelper.formatMessage("topcirculating_TopPatronStatistics") %>
                </c:if>
                <c:if test="${form.titleView}">
                    <%= form.getReportHeader() %>
                </c:if>
                <c:if test="${form.homeroomGradeLevelsView}">
                    <c:choose>
                        <c:when test="<%= topform.getHomeroomGradeLevelType() == TopPatronSpecs.CIRCULATION_TYPE_BY_HOMEROOMS %>">
                            <%= MessageHelper.formatMessage("topcirculating_TopHomeroomStatistics") %>
                        </c:when>
                        <c:otherwise>
                            <%= MessageHelper.formatMessage("topcirculating_TopGradeLevelStatistics") %>
                        </c:otherwise>
                    </c:choose>                    
                </c:if>
                
                <c:if test="${!form.printerFriendly}">
                    <span class="Instruction">
                        [ <a href="#controls"><%= MessageHelper.formatMessage("topcirculating_CustomizeView") %></a> ]
                    </span>
                </c:if>
            </td>
            <td class="tdAlignRight">
                &nbsp;
                <c:if test="${!form.printerFriendly}">
                    <base:link target="printerFriendly" id="<%=TopCirculatingForm.ID_PRINTER_FRIENDLY %>" page="<%= form.getPrinterFriendlyLink() %>"><base:image src="/buttons/small/printerfriendly.gif" alt='<%=MessageHelper.formatMessage("printable") %>' /></base:link>
                </c:if>
            </td>
        </tr>
        <tr><td colspan="2">
            <table width="100%" id="<%= TopCirculatingForm.TABLE_DATA %>" cellpadding="2" cellspacing="0">
                <c:if test="${form.titleView}">
                    <c:choose>
                        <c:when test="${empty form.titleList}">
                            <tr>
                                <td class="ColRowBold" colspan="6" align="center">
                                    <%=MessageHelper.formatMessage("topcirculating_BasedOnTheseOptionsThereIsNothingToDisplay") %>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr>
                                <td align="center">&nbsp;</td>
                                <td align="center">&nbsp;</td>
                                <td class="SmallColHeading"><%= MessageHelper.formatMessage("topcirculating_Title") %></td>
                                <td class="SmallColHeading"><%= MessageHelper.formatMessage("topcirculating_Author") %></td>
                                <td class="SmallColHeading"><%= MessageHelper.formatMessage("topcirculating_Call") %></td>
                                <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("topcirculating_Circulations") %></td>
                            </tr>
                            <c:forEach var="titleRow" items="${form.titleList}" varStatus="titleRowIndex">
                                <jsp:useBean id="titleRow" type="com.follett.fsc.destiny.session.backoffice.data.BibCircsVO"/>
                                <c:set var="bgColor" value="${titleRowIndex.index % 2 == 0 ? \"#E8E8E8\" : \"#FFFFFF\"}"/>
                                <tr bgColor="${bgColor}">
                                    <td class="ColRowBold tdAlignRight">${titleRowIndex.index + 1}.</td>
                                    <td align="center" class="ColRow" nowrap><base:bibTypeIcon rec="${titleRow.bibTypeKeywordRecord}" printerFriendly="${form.printerFriendly}"/></td>
                                    <td class="ColRow">
                                        <c:choose>
                                            <c:when test="${form.printerFriendly}">
                                                <c:out value="${titleRow.title}" />
                                            </c:when>
                                            <c:otherwise>
                                                <base:link styleClass="DetailLink" showTextAlways="true" permissions="<%= form.getSearchPermissions() %>" href='<%= "/cataloging/servlet/presenttitledetailform.do?bibID=" + titleRow.getBibID() %>'><c:out value="${titleRow.title}" /></base:link>
                                            </c:otherwise>
                                        </c:choose>
                                    </td>
                                    <td class="ColRow"><c:out value="${titleRow.author}" /></td>
                                    <td class="ColRow"><c:out value="${titleRow.callNumber}" /></td>
                                    <td class="ColRow tdAlignRight">${d:formatNumber(titleRow.circs)}</td>
                                </tr>
                            </c:forEach>
                        </c:otherwise>
                    </c:choose>
                    <c:if test="${form.printerFriendly}">
                        <tr>
                            <td colspan="6" align="center" width="100%">
                                <table id="<%=TopCirculatingForm.TABLE_PRINTABLE_PARAMETERS%>">
                                    <tr>
                                        <td class="ColRowBold tdAlignLeft">
                                            <ul>
                                                <li><% if (form.getTopOrBottomLimiter().equals(TopCirculatingForm.LIMITER_VALUE_TOP)) {%> 
                                                        <%= MessageHelper.formatMessage("topcirculating_ShowTheTop0Titles", 
                                                         Long.valueOf(new Integer(form.getTopCount()).longValue())) %>
                                                         <%} else { %>
                                                         <%= MessageHelper.formatMessage("topcirculating_ShowTheBottom0Titles", 
                                                         Long.valueOf(new Integer(form.getTopCount()).longValue())) %>
                                                         <%} %>
                                                </li> 
                                                <li><%= MessageHelper.formatMessage("topcirculating_ForThePast", form.getTimeframeUnits(), form.getTimeframeSelectedDisplayable(form.getTimeframeSelected())) %></li> 
                                                <c:if test="${form.includeInLibraryUse}">                                                 
                                                    <li><%= MessageHelper.formatMessage("topcirculating_IncludeCirculationsFromInLibraryUse") %></li>
                                                </c:if>
                                                <li><%= MessageHelper.formatMessage("topcirculating_IncludeBibType", ResponseUtils.filter(form.gimmeBibTypeDisplayable())) %></li>
                                                <%=form.gimmePrintableCallNumbers() %> 
                                                <%=form.gimmePrintableReadingProgramParameters() %> 
                                            </ul>
                                        </td>
                                    </tr>
                                    <tr/>
                                    <tr/>
                                    <tr>
                                        <td colspan="1" align="center" class="Instruction">
                                            <%= MessageHelper.formatMessage("topcirculating_ReportGeneratedOn_date", form.getTimeOfGeneration()) %>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                    </c:if>
                </c:if>
                <c:if test="${form.patronView}">
                    <c:choose>
                        <c:when test="${empty form.patronList}">
                            <tr>
                                <td class="ColRowBold" colspan="4" align="center">
                                    <%=MessageHelper.formatMessage("topcirculating_BasedOnTheseOptionsThereIsNothingToDisplay") %>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr>
                                <td align="center">&nbsp;</td>
                                <td class="SmallColHeading"><%= MessageHelper.formatMessage("topcirculating_Patron") %></td>
                                <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("topcirculating_Homeroom") %></td>
                                <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("topcirculating_Circulations") %></td>
                            </tr>
                            <c:forEach var="row" items="${form.patronList}" varStatus="rowIndex">
                                <jsp:useBean id="row" type="com.follett.fsc.destiny.session.circulation.data.TopPatronResultVO"/>
                                <c:set var="bgColor" value="${rowIndex.index % 2 == 0 ? \"#E8E8E8\" : \"#FFFFFF\"}"/>
                                <tr bgColor="${bgColor}">
                                    <td class="ColRowBold tdAlignRight">${rowIndex.index + 1}.</td>
                                    <td class="ColRow">
                                        <c:out value="${row.patronName}" />
                                        (<c:out value="${row.patronTypeDisplayable}"/>: 
                                        <c:choose>
                                            <c:when test="<%=!form.isPrinterFriendly() && store.canView(Permission.CIRC_VIEW_PATRON_STATUS)%>">
                                                <base:link permission="<%=com.follett.fsc.destiny.util.Permission.CIRC_VIEW_PATRON_STATUS %>" href='<%= "/circulation/servlet/handlepatroninfoform.do?patronID=" + row.getPatronID() %>'>${row.barcode}</base:link>)
                                            </c:when>
                                            <c:otherwise>
                                                ${row.barcode})
                                            </c:otherwise>
                                        </c:choose>
                                    </td>
                                    <td class="ColRow tdAlignRight"><c:out value="${row.homeRoom}" /></td>
                                    <td class="ColRow tdAlignRight">${d:formatNumber(row.circs)}</td>
                                </tr>
                            </c:forEach>
                        </c:otherwise>
                    </c:choose>
        	        <c:if test="${form.printerFriendly}">
                        <tr>
                            <td colspan="5" align="center">
                                <table id="<%=TopCirculatingForm.TABLE_PRINTABLE_PARAMETERS%>">
                                    <tr>
                                        <td class="ColRowBold tdAlignLeft">
                                            <ul>
                                                <li><%= MessageHelper.formatMessage("topcirculating_ShowTheTopPatrons", Long.valueOf(new Integer(form.getTopCount()).longValue()))%></li> 
                                                <li><%= MessageHelper.formatMessage("topcirculating_ForThePast", form.getTimeframeUnits(), form.getTimeframeSelectedDisplayable(form.getTimeframeSelected())) %></li>
                                                <li><%= MessageHelper.formatMessage("topcirculating_Grades", ResponseUtils.filter(form.getGradeOptionDisplayable())) %></li> 
                                                <li><%= MessageHelper.formatMessage("topcirculating_PatronTypes", form.getPatronTypeOptionDisplayable()) %></li> 
                                            </ul>
                                        </td>
                                    </tr>
                                    <tr/>
                                    <tr/>
                                    <tr>
                                        <td align="center" class="Instruction">
                                            <%= MessageHelper.formatMessage("topcirculating_ReportGeneratedOn_date",form.getTimeOfGeneration()) %>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                    </c:if>
                </c:if>
                <c:if test="${form.homeroomGradeLevelsView}">
                    <c:choose>
                        <c:when test="${empty form.homeroomGradeLevelList}">
                            <tr>
                                <td class="ColRowBold" colspan="5" align="center">
                                    <%=MessageHelper.formatMessage("topcirculating_BasedOnTheseOptionsThereIsNothingToDisplay") %>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr>
                                <td align="center">&nbsp;</td>
                                <td class="SmallColHeading">
                                    <c:choose>
                                        <c:when test="<%= topform.getHomeroomGradeLevelType() == TopPatronSpecs.CIRCULATION_TYPE_BY_HOMEROOMS %>">
                                            <%= MessageHelper.formatMessage("topcirculating_Homeroom") %>
                                        </c:when>
                                        <c:otherwise>
                                            <%= MessageHelper.formatMessage("topcirculating_GradeLevel") %>
                                        </c:otherwise>
                                    </c:choose>                    
                                </td>
                                <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("topcirculating_TotalPatrons") %></td>
                                <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("topcirculating_AverageCircsPatron") %></td>
                                <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("topcirculating_TotalCirculations") %></td>
                            </tr>
                            <c:forEach var="homeroomGradeLevelRow" items="${form.homeroomGradeLevelList}" varStatus="rowIndex">
                                <jsp:useBean id="homeroomGradeLevelRow" type="com.follett.fsc.destiny.session.circulation.data.TopHomeroomGradeLevelResultVO"/>
                                <c:set var="bgColor" value="${rowIndex.index % 2 == 0 ? \"#E8E8E8\" : \"#FFFFFF\"}"/>
                                <tr bgColor="${bgColor}">
                                    <td class="ColRowBold tdAlignRight">${rowIndex.index + 1}.</td>
                                    <td class="ColRow">
                                        <c:out value="${homeroomGradeLevelRow.displayType}" />
                                     </td>
                                    <td class="ColRow tdAlignRight"><c:out value="${d:formatNumber(homeroomGradeLevelRow.patrons)}" /></td>
                                    <td class="ColRow tdAlignRight"><c:out value="${homeroomGradeLevelRow.avgCircsPerPatron}" /></td>
                                    <td class="ColRow tdAlignRight"><c:out value="${d:formatNumber(homeroomGradeLevelRow.circs)}" /></td>
                                </tr>
                            </c:forEach>
                        </c:otherwise>
                    </c:choose>
                    <c:if test="${form.printerFriendly}">
                        <tr>
                            <td colspan="5" align="center">
                                <table id="<%=TopCirculatingForm.TABLE_PRINTABLE_PARAMETERS%>">
                                    <tr>
                                        <td class="ColRowBold tdAlignLeft">
                                            <ul>
                                                <li>
                                                <%if ( topform.getTopCount() == TopPatronSpecs.AMOUNT_TYPE_ALL) {
                                                    if ( topform.getHomeroomGradeLevelType() == TopPatronSpecs.CIRCULATION_TYPE_BY_HOMEROOMS) { %>
                                                        <%=MessageHelper.formatMessage("topcirculating_ShowAllHomerooms") %>
                                                    <% } else { %>
                                                        <%=MessageHelper.formatMessage("topcirculating_ShowAllGradeLevels") %>
                                                    <% } %>
                                                <% } else { %>
                                                    <% if ( topform.getHomeroomGradeLevelType() == TopPatronSpecs.CIRCULATION_TYPE_BY_HOMEROOMS) { %>
                                                        <%=MessageHelper.formatMessage("topcirculating_TopHomeroomsToShow0", Long.valueOf(topform.getTopCount())) %>
                                                    <% } else { %>
                                                        <%=MessageHelper.formatMessage("topcirculating_TopGradeLevelsToShow0", Long.valueOf(topform.getTopCount())) %>
                                                    <% } %>
                                                <% } %>
                                               </li> 
                                    <% String sortOrder = (form.isAscendingSort() ? MessageHelper.formatMessage("topcirculating_Ascending") : MessageHelper.formatMessage("topcirculating_Descending")); %>
                                    <li>
                                    <c:choose>
                                        <c:when test="<%= topform.getSortBy() == TopPatronSpecs.SORT_BY_TOTAL_CIRCULATIONS %>">
                                            <%= MessageHelper.formatMessage("topcirculating_SortedByTotalCirculations", sortOrder) %>
                                        </c:when>
                                        <c:otherwise>
                                            <%= MessageHelper.formatMessage("topcirculating_SortedByAverageCirculations", sortOrder) %>
                                        </c:otherwise>
                                    </c:choose>
                                    </li>
                                    <li><%= MessageHelper.formatMessage("topcirculating_ForThePast", form.getTimeframeUnits(), form.getTimeframeSelectedDisplayable(form.getTimeframeSelected())) %></li> 
                                    </ul>
                                    </td>
                                    </tr>
                                    <tr/>
                                    <tr/>
                                    <tr>
                                        <td colspan="1" align="center" class="Instruction">
                                            <%=MessageHelper.formatMessage("topcirculating_ReportGeneratedOn_date", form.getTimeOfGeneration())%>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                    </c:if>
                </c:if>
            </table>
        </td></tr>

    	<c:if test="${! form.printerFriendly}">
            <tr><td colspan="2">&nbsp;</td></tr>
            <tr>
            	<td colspan="2">
                    <a name="controls"></a>
        			<base:imageLine/>
            	</td>
            </tr>
            <tr>
            	<td colspan="2" align="center">
                    <table id="<%= TopCirculatingForm.TABLE_CONTROLS %>" cellpadding="4" cellspacing="0">
                        <tr>
                            <td class="ColRowBold tdAlignRight">
                                <%= MessageHelper.formatMessage("topcirculating_ShowThe") %> 
                                 <c:if test="${form.titleView}">
                                    <html:select property="<%= TopCirculatingForm .FIELD_TOP_OR_BOTTOM_LIMITER %>">
                                        <html:option value="<%=TopCirculatingForm.LIMITER_VALUE_TOP %>"><%= MessageHelper.formatMessage("topcirculating_Top") %></html:option>
                                        <html:option value="<%=TopCirculatingForm.LIMITER_VALUE_BOTTOM %>"><%= MessageHelper.formatMessage("topcirculating_Bottom") %></html:option>
                                    </html:select>
                                 </c:if>
                                 <c:if test="${form.patronView || form.homeroomGradeLevelsView}">
                                    <%= MessageHelper.formatMessage("topcirculating_Top") %>
                                 </c:if>
                            </td>
                            <td class="ColRowBold tdAlignLeft">
                                <bean:define id="topCountOptions" name="<%=TopCirculatingForm.FORM_NAME %>" property="topCountOptions" />
                                <html:select property="<%= TopCirculatingForm.FIELD_TOP_COUNT %>">
                                    <html:options collection="topCountOptions" property="longID" labelProperty="stringDesc"/>
                                </html:select>&nbsp;
                                <c:if test="${form.patronView}">
                                    <%= MessageHelper.formatMessage("topcirculating_Patrons") %>
                                </c:if>
                                <c:if test="${form.titleView}">
                                    <%= MessageHelper.formatMessage("topcirculating_Titles") %>
                                </c:if>
                                <c:if test="${form.homeroomGradeLevelsView}">
                                <bean:define id="homeroomGradeLevelOptions" name="<%=TopCirculatingForm.FORM_NAME %>" property="homeroomGradeLevelOptions" />
                                <html:select property="<%= TopCirculatingForm.FIELD_HOMEROOM_GRADE_LEVEL_TYPE %>">
                                    <html:options collection="homeroomGradeLevelOptions" labelProperty="stringDesc" property="longID"/>
                                </html:select>&nbsp;
                                </c:if>
                            </td>
                            <td class="ColRowBold tdAlignLeft" rowspan="2">
                                <base:genericShowHideButton name="<%= TopCirculatingForm.BUTTON_UPDATE %>"
                                                    src="/buttons/large/update.gif"
                                                    alt="<%= updateButtonAltText %>">
                                </base:genericShowHideButton>
                            </td>
                        </tr>
                        <c:if test="${form.homeroomGradeLevelsView}">
                        <tr>
                        <td valign="top" class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("topcirculating_SortBy") %></td>
                        <td class="tdAlignLeft">
                        <bean:define id="sortByOptions" name="<%=TopCirculatingForm.FORM_NAME %>" property="sortByOptions" />
                        <html:select property="<%= TopCirculatingForm.FIELD_SORT_BY %>">
                            <html:options collection="sortByOptions" labelProperty="stringDesc" property="longID"/>
                        </html:select>
                        <html:select property="<%= TopCirculatingForm.FIELD_ASCENDING_SORT %>">
                            <html:option value="true"><%= MessageHelper.formatMessage("topcirculating_Ascending") %></html:option>
                            <html:option value="false"><%= MessageHelper.formatMessage("topcirculating_Descending") %></html:option>
                        </html:select>
                        </td>
                        </tr>
                        </c:if>
                        <tr>
                            <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("topcirculating_ForThePastPrompt") %></td>
                            <td class="tdAlignLeft">
                                <html:text property="<%= TopCirculatingForm.FIELD_TIMEFRAME_UNITS %>" size="3" maxlength="2"></html:text>
                                <html:select property="<%= TopCirculatingForm.FIELD_TIMEFRAME_SELECTED %>">
                                <bean:define id="timeframeSelectedOptions" name="<%=TopCirculatingForm.FORM_NAME %>" property="timeframeSelectedOptions" />
                                    <html:options collection="timeframeSelectedOptions" labelProperty="stringDesc" property="longID"/>
                                </html:select>
                            </td>
                            <td>&nbsp;</td>
                        </tr>
                        <c:if test="${form.titleView}">
                            <tr>
                                <td>&nbsp;</td>
                                <td class="ColRow tdAlignLeft">
                                    <html:checkbox property='<%= TopCirculatingForm.FIELD_INCLUDE_IN_LIBRARY_USE%>'><%= MessageHelper.formatMessage("topcirculating_IncludeCirculationsFromInLibraryUse") %></html:checkbox>                                
                                </td>
                                <td>&nbsp;</td>
                            </tr>
                        </c:if>                        
                        <c:if test="${form.patronView}">
                            <tr>
                                <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("topcirculating_Include_gradeoptions") %></td>
                                <td class="tdAlignLeft">
                                    <bean:define id="gradeOptions" name="<%=TopCirculatingForm.FORM_NAME %>" property="gradeOptions" />                                
                                    <html:select property="<%= TopCirculatingForm.FIELD_GRADE %>">
                                        <html:options collection="gradeOptions" labelProperty="stringDesc" property="stringCode"/>
                                    </html:select>
                                </td>
                                <td>&nbsp;</td>
                            </tr>
                        </c:if>
                        <c:if test="${form.titleView}">
                            <tr>
                                <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("topcirculating_MaterialType") %></td>
                                <td class="tdAlignLeft">
                                    <bean:define id="bibTypeOptions" name="<%=TopCirculatingForm.FORM_NAME %>" property="bibTypeOptions" />                                
                                    <html:select property="<%= TopCirculatingForm.FIELD_BIB_TYPE %>">
                                        <html:options collection="bibTypeOptions" labelProperty="stringDesc" property="stringCode"/>
                                    </html:select>
                                </td>
                                <td>&nbsp;</td>
                            </tr>
                            <tr>
                                <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("topcirculating_CallNumbers") %></td>
                                <td class="ColRowBold tdAlignLeft"><html:text size="5" property="<%=TopCirculatingForm.FIELD_STARTING_CALL_NUMBER%>"/> <%=MessageHelper.formatMessage("topcirculating_to") %> <html:text size="5" property="<%=TopCirculatingForm.FIELD_ENDING_CALL_NUMBER %>"/></td>
                                <td class="ColRowBold tdAlignRight">&nbsp;</td>
                               
                           </tr>
                            <base:readingprogramlimiting
                                        formName="<%=TopCirculatingForm.FORM_NAME%>" />

                        </c:if>
                        <c:if test="${!form.titleView}">
                            <tr><td colspan="3" class="ColRowBold"><%= MessageHelper.formatMessage("topcirculating_OnlyIncludeTheFollowing") %></td></tr>
                            <tr><td>&nbsp;</td>
                                <td valign="top" class="tdAlignLeft"><base:patronTypesCheckbox printerFriendly="<%=form.isPrinterFriendly() %>"
                                    formName="<%=TopCirculatingForm.FORM_NAME%>" 
                                    siteID="<%=store.getSiteID() %>"/>
                                </td>
                                <td valign="top">
                                    <table>
                                        <tr>
                                            <td class="SmallColHeading"><%= MessageHelper.formatMessage("topcirculating_Statuses") %><br></td>
                                        </tr>
                                        <tr>
                                        <td valign="top" class="ColRow tdAlignLeft">
                                            <html:checkbox name="<%=TopCirculatingForm.FORM_NAME%>" property="<%= TopCirculatingForm.FIELD_INCLUDE_ACTIVE %>"><%= MessageHelper.formatMessage("topcirculating_Active") %></html:checkbox><br>
                                            <html:checkbox name="<%=TopCirculatingForm.FORM_NAME%>" property="<%= TopCirculatingForm.FIELD_INCLUDE_RESTRICTED %>"><%= MessageHelper.formatMessage("topcirculating_Restricted") %></html:checkbox><br>
                                            <html:checkbox name="<%=TopCirculatingForm.FORM_NAME%>" property="<%= TopCirculatingForm.FIELD_INCLUDE_INACTIVE %>"><%= MessageHelper.formatMessage("topcirculating_Inactive") %></html:checkbox><br>
                                        </td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                        </c:if>
                    </table>
                </td>
            </tr>
            
            <c:if test="${!form.titleView}">
            <tr>
                <td colspan="2" width="100%">
                    <base:imageLine width="100%"/>
                </td>
            </tr>
            <tr><td colspan="2" align="center">
                    <base:helpIcons buttonsToOutput="<%=new int[] {HelpIconsTag.ICON_SELECT_ALL, HelpIconsTag.ICON_CLEAR_ALL }%>" />
            </td></tr>
            </c:if>            
    	</c:if>  <!-- printer friendly -->
    </table> <!-- main table -->
    </td>
</tr>
</base:outlinedTableAndTabsWithinThere>
</base:form>
</logic:equal>



