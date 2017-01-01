<%@page import="java.util.Iterator"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@ page import="com.follett.fsc.destiny.util.Permission"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.WebPathSearchResultsForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.BaseListForm"%>
<%@ page import="com.follett.fsc.common.StringHelper"%>
<%@ page import="com.follett.fsc.destiny.util.DestinySystemProperties"%>
<%@ page import="com.follett.fsc.destiny.util.URLHelper"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm"%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@page import="com.follett.fsc.webpath.clientjar.WPEConstants"%>

<bean:define id="form" name="cataloging_servlet_WebPathSearchResultsForm" type="com.follett.fsc.destiny.client.cataloging.servlet.WebPathSearchResultsForm"/>

<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/presentwebpathsearchresultsform.do" method="post">
<%
String borderColor="#C0C0C0";
if (form.isPrinterFriendly()) {
    borderColor="#FFFFFF";
}
%>

<c:set var="wpeURL" value="<%=DestinySystemProperties.getWebPathExpressHostAndPort()%>"/>

<html:hidden property="searchString" />
<html:hidden property="searchID" />
<html:hidden property="headingNumber" />
<html:hidden property="wpPage" />
<html:hidden property="wpTotalCount" />
<html:hidden property="displayTabs" />
<html:hidden property="<%=WebPathSearchResultsForm.PARAM_TAB_TYPE %>" />
<html:hidden property="page" />
<html:hidden property="totalCount" />
<html:hidden property="<%= WebPathSearchResultsForm.PARAM_ADD_LIMITERS_VISIBLE %>" />
<% if (!form.isAddLimitersVisible()) { %>
    <html:hidden property="<%= WebPathSearchResultsForm.FIELD_FORMAT_LIMITER %>" />
    <html:hidden property="<%= WebPathSearchResultsForm.FIELD_TOPIC_LIMITER %>" />
    <html:hidden property="<%= WebPathSearchResultsForm.FIELD_SOURCE_LIMITER %>" />
    <html:hidden property="<%= WebPathSearchResultsForm.FIELD_LANGUAGE_LIMITER %>" />
    <html:hidden property="<%= WebPathSearchResultsForm.FIELD_LEXILE_LIMITER %>" />
    <html:hidden property="<%= WebPathSearchResultsForm.FIELD_DOMAIN_FILTER %>" />
    <html:hidden property="<%= WebPathSearchResultsForm.FIELD_GRADE_MAP %>" />
<% } %>
<table id="<%=WebPathSearchResultsForm.TABLE_MAIN%>" width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr>
        <td>
            <base:outlinedTableAndTabsWithinThere tabs="<%=form.getTabs() %>" selectedTab="<%=form.getSelectedTab() %>" tabClass="<%=form.getTabClass() %>" borderColor="<%=borderColor%>" width="100%" cellpadding="0" id="<%=WebPathSearchResultsForm.TABLE_WPE_TABS%>">
            
                <tr>
                    <td>
                        <table id="<%=WebPathSearchResultsForm.TABLE_PAGING_HEADER%>" width="100%">
                        <tr>
                            <td colspan="4">
                                <table id="<%=WebPathSearchResultsForm.TABLE_PAGING_HEADER%>_inset" width="100%">
                                    <tr>
                                        <td>
                                            <span class="ColRowBold">WebPath Express results for (<bean:write name="<%=WebPathSearchResultsForm.FORM_NAME%>" property="displayableHeadingTextForJSP"/>)</span>
                                            <logic:equal name="<%=WebPathSearchResultsForm.FORM_NAME%>" property="<%=WebPathSearchResultsForm.FIELD_PRINTER_FRIENDLY%>" value="false">
                                                <logic:equal name="<%=WebPathSearchResultsForm.FORM_NAME%>" property="<%=WebPathSearchResultsForm.FIELD_TEXT_SEARCH%>" value="true">
                                                    &nbsp;<span style="white-space:nowrap" class="SmallColRow"><%=form.gimmeRefineLink()%></span>
                                                </logic:equal>
                                                <logic:lessEqual name="<%=WebPathSearchResultsForm.FORM_NAME%>" property="<%=WebPathSearchResultsForm.PARAM_TAB_TYPE%>" value="2">
                                                    &nbsp;<span style="white-space:nowrap" class="SmallColRow"><%=form.gimmeBrowseLink()%></span>
                                                </logic:lessEqual>
                                                <logic:equal name="<%=WebPathSearchResultsForm.FORM_NAME%>" property="<%=WebPathSearchResultsForm.FIELD_EMPTY_SEARCH%>" value="false">
                                                    <base:imageSpacer width="31" height="5"/><span style="white-space:nowrap" class="SmallColRow"><%=form.gimmeLimitersLink()%></span>
                                                </logic:equal>
                                            </logic:equal>
                                        </td>
                                        <td noWrap width = "175px" class="tdAlignRight" valign="top">
                                            <logic:equal name="<%=WebPathSearchResultsForm.FORM_NAME%>" property="<%=WebPathSearchResultsForm.FIELD_PRINTER_FRIENDLY%>" value="false">
                                                <logic:notEqual name="<%=WebPathSearchResultsForm.FORM_NAME%>" property="<%=BaseListForm.PARM_TOTAL_COUNT%>" value="0">
                                                    <a href='<bean:write name="<%=WebPathSearchResultsForm.FORM_NAME%>" property="printerFriendlyLink" filter="false"/>' target="printerFriendly" id="<%=GenericForm.ID_PRINTER_FRIENDLY %>"><base:image alt="Printer Friendly" src="/buttons/small/printerfriendly.gif" align="absbottom"/></a>
                                                </logic:notEqual>
                                            </logic:equal>&nbsp;
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                        <logic:equal name="<%=WebPathSearchResultsForm.FORM_NAME%>" property="<%=WebPathSearchResultsForm.FIELD_PRINTER_FRIENDLY%>" value="false">
                            <logic:equal name="<%=WebPathSearchResultsForm.FORM_NAME%>" property="<%=WebPathSearchResultsForm.FIELD_EMPTY_SEARCH%>" value="false">
                                <% if (form.isAddLimitersVisible()) { %>
                                <tr>
                                    <td class="tdAlignLeft" colspan="4" >
                                        <div style="margin-top: 10px;">
                                            <table width="100%" id = "<%= WebPathSearchResultsForm.TABLE_LIMITERS %>">
                                                <tr>
                                                    <td class = "tdAlignRight"><span class="SmallColHeading">Format</span></td>
                                                    <td class = "tdAlignLeft"><%= form.getFormatLimiterSelect() %></td>
                                                    <td width = "25px">&nbsp;</td>
                                                    <td class = "tdAlignRight"><span class="SmallColHeading">Grade level</span></td>
                                                    <td class = "tdAlignLeft"><%= form.getGradeLevelLimiterSelect() %></td>
                                                    <td width = "25px">&nbsp;</td>
                                                    <td class = "tdAlignRight"><span class="SmallColHeading">Domain</span></td>
                                                    <td class = "tdAlignLeft"><%= form.getDomainLimiterSelect() %></td>
                                                    <td width = "25px">&nbsp;</td>
                                               </tr>
                                               <tr>
                                                    <td class = "tdAlignRight"><span class="SmallColHeading">Source</span></td>
                                                    <td class = "tdAlignLeft"><%= form.getSourceLimiterSelect() %></td>
                                                    <td width = "25px">&nbsp;</td>
                                                    <td class = "tdAlignRight"><span class="SmallColHeading">Lexile</span></td>
                                                    <td class = "tdAlignLeft"><%= form.getLexileLimiterSelect() %></td>
                                                    <td width = "25px">&nbsp;</td>
                                                    <td class = "tdAlignRight"><span class="SmallColHeading">Language</span></td>
                                                    <td class = "tdAlignLeft"><%= form.getLanguageLimiterSelect() %></td>
                                                    <td width = "25px">&nbsp;</td>
                                               </tr>
                                               <tr>
                                                    <td class = "tdAlignRight"><span class="SmallColHeading"><%= form.getTopicLimiterCaption() %></span></td>
                                                    <td class = "tdAlignLeft" colspan="4"><%= form.getTopicLimiterSelect() %></td>
                                                    <td width = "25px">&nbsp;</td>
                                               </tr>
                                               <tr>
                                                    <td>&nbsp;</td>
                                                    <td>
                                                        <logic:equal name="<%=WebPathSearchResultsForm.FORM_NAME%>" property="<%=WebPathSearchResultsForm.FIELD_PRINTER_FRIENDLY%>" value="false">
                                                            <base:genericButton src="/buttons/large/getresults.gif" absbottom="true"  alt='<%= MessageHelper.formatMessage("go") %>' name="<%= WebPathSearchResultsForm.BUTTON_GO %>" />
                                                        </logic:equal>
                                                    </td>
                                               </tr>
                                            </table>
                                        </div>
                                    </td>
                                </tr>
                                <% } %>
                            </logic:equal>
                        </logic:equal> <%-- end of printer friendly --%>
                        <tr>
                            <td class="tdAlignRight" colspan="4">
                                <logic:equal name="<%=WebPathSearchResultsForm.FORM_NAME%>" property="<%=WebPathSearchResultsForm.FIELD_PRINTER_FRIENDLY%>" value="false">
                                    <logic:notEqual name="<%=WebPathSearchResultsForm.FORM_NAME%>" property="<%=BaseListForm.PARM_TOTAL_COUNT%>" value="0">
                                        <base:spanIfAllowed
                                        permission="<%=form.getStore().isMediaBookingUser() ? Permission.CAT_ACCESS_BOOKLIST_MEDIA : Permission.CAT_ACCESS_BOOKLIST %>">
                                        <base:myListSelect name="<%= WebPathSearchResultsForm.FIELD_LIST_ID %>" 
                                         selectedMyListID="<%=form.getListID()%>" submitOnChange="true" 
                                         prompt='<%="Selected List:"  %>' 
                                         dropDownClass="SmallColRow"/>
                                         <%= form.getDisplayAddAllBooklist(WebPathSearchResultsForm.FORM_NAME) %>
                                         </base:spanIfAllowed>
                                   </logic:notEqual>
                                </logic:equal>&nbsp; 
                            </td>
                        </tr>
                        <tr vAlign="bottom">
                            <logic:equal name="<%=WebPathSearchResultsForm.FORM_NAME%>" property="<%=WebPathSearchResultsForm.FIELD_EMPTY_SEARCH%>" value="false">
                                <td colspan="2" width="25%" nowrap="nowrap" valign="middle">
                                    <base:searchSummary searchType="Displaying" 
                                        startOfSet="<%=String.valueOf(form.getFirstHit())%>"
                                        endOfSet= "<%=String.valueOf(form.getHitsReturned() + form.getFirstHit() - 1)%>"
                                        totalInSet = "<%=String.valueOf(form.getHitsTotal())%>"
                                        tooManyHits = "false"/>
                                </td>
                                
                            
                            
                                <td width="40%" valign="middle">
                                <logic:equal name="<%=WebPathSearchResultsForm.FORM_NAME%>" property="<%=WebPathSearchResultsForm.FIELD_PRINTER_FRIENDLY%>" value="true">
                                    <%if (!StringHelper.isEmptyOrWhitespace(form.getTopicLimiter()) ) { %>
                                    <span class="SmallColHeading">Topic: <%=form.getTopicLimiter()%></span>&nbsp;
                                    <% } %>
                                    <span class="SmallColHeading">Grade Level: <%=form.getGradeLevelDesc()%></span>&nbsp;
                                    <%if (!StringHelper.isEmptyOrWhitespace(form.getDomainFilter()) ) { %>
                                    <span class="SmallColHeading">Domain: <%=form.getDomainFilter()%></span>&nbsp;
                                    <% } %>
                                    <%if (!StringHelper.isEmptyOrWhitespace(form.getFormatLimiter()) ) { %>
                                    <span class="SmallColHeading">Format: <%=form.getFormatLimiter()%></span>&nbsp;
                                    <% } %>
                                    <%if (!StringHelper.isEmptyOrWhitespace(form.getLexileLimiter()) ) { %>
                                    <span class="SmallColHeading">Lexile: <%=form.getLexileLimiter()%></span>&nbsp;
                                    <% } %>
                                    <%if (!StringHelper.isEmptyOrWhitespace(form.getSourceLimiter()) ) { %>
                                    <span class="SmallColHeading">Source: <%=form.getSourceLimiter()%></span>&nbsp;
                                    <% } %>
                                    <%if (!StringHelper.isEmptyOrWhitespace(form.getLanguageLimiter()) ) { %>
                                    <span class="SmallColHeading">Language: <%=form.getLanguageLimiter()%></span>&nbsp;
                                    <% } %>
                                </logic:equal>
                                    &nbsp;
                                </td>
                            </logic:equal>

                            <% if (form.getErrors() == null || form.getErrors().size() == 0 )  { %>
                                <logic:equal name="<%=WebPathSearchResultsForm.FORM_NAME%>" property="<%=WebPathSearchResultsForm.FIELD_EMPTY_SEARCH%>" value="true">
                                    <td align="center" class="ColRowBold" colspan="2" nowrap="nowrap">
                                        No matches found. 
                                        <% if (form.getResultAltTermsList().size() > 0) {%>
                                            Did you mean "<%=form.getAlternateTermsLink() %>"?
                                        <base:goButton absbottom="true"/>
                                            <br>
                                            <br>
                                            If no, please try using other search terms.
                                        <% } else { %>
                                            Please try using other search terms.
                                        <% } %>
                                    </td>
                                </logic:equal>
                                <% } %>
                            <td nowrap="nowrap" class="SmallColHeading tdAlignRight" width="35%"  valign="middle">
                                <logic:equal name="form" property="<%=WebPathSearchResultsForm.FIELD_PRINTER_FRIENDLY%>" value="false">
                                    <logic:equal name="<%=WebPathSearchResultsForm.FORM_NAME%>" property="<%=WebPathSearchResultsForm.FIELD_EMPTY_SEARCH%>" value="false">
                                        <base:pageListOutput formName="<%=WebPathSearchResultsForm.FORM_NAME%>" displayTabs="<%=form.isDisplayTabs()%>"/>
                                    </logic:equal>
                                </logic:equal>&nbsp;
                            </td>
                        </tr>
                        
                        </table>
                    </td>
                </tr>
                <tr>
                    <td>
                    <logic:equal name="<%=WebPathSearchResultsForm.FORM_NAME%>" property="<%=WebPathSearchResultsForm.FIELD_EMPTY_SEARCH%>" value="false">
                    <logic:equal name="<%=WebPathSearchResultsForm.FORM_NAME%>" property="<%=WebPathSearchResultsForm.FIELD_PRINTER_FRIENDLY%>" value="false">
                        <base:imageLine height="2" width="100%"/>
                    </logic:equal>
                    </logic:equal>
                    </td>
                </tr>
                
                <logic:iterate indexId="index" name="<%=WebPathSearchResultsForm.FORM_NAME%>" property="<%=WebPathSearchResultsForm.ATTRIBUTE_LIST%>" id="result" type="com.follett.fsc.destiny.util.webpathsearch.WebPathResultElement">
                <tr>
                    <td>
                        <a name='<%= "anchor_" + index %>'></a>
                        <table width="100%" id="<%=WebPathSearchResultsForm.TABLE_KEYWORD_RESULTS + index%>">
                        <tr>
                            <td class="ColRow">
                               <logic:equal name="form" property="<%=WebPathSearchResultsForm.FIELD_PRINTER_FRIENDLY%>" value="false">
                                   <a href="<%=result.buildForwardFromResult() %>" target="_blank"><%=result.getTitle() %></a>
                               </logic:equal>
                               <logic:equal name="form" property="<%=WebPathSearchResultsForm.FIELD_PRINTER_FRIENDLY%>" value="true">
                                   <span class="ColRowBoldUnderline"><%=result.getTitle() %></span>
                               </logic:equal>
                            </td>
                            <td class="tdAlignRight" nowrap width="10%">
                               <span class="ColRowBold">
                                  Grade Level:
                                  <logic:equal name="form" property="<%=WebPathSearchResultsForm.FIELD_PRINTER_FRIENDLY%>" value="false">
                                      &nbsp;
                                      <logic:equal name="result" property="gradeLevelPreKto2" value="true">
                                        <base:imagePassThrough onlineServiceURL="http://${wpeURL}/wpebrowse/images/icons/prek-2.gif"  width="32" height="32" alt="PreK-2"/>
                                      </logic:equal>
                                      <logic:equal name="result" property="gradeLevelPreKto2" value="false">
                                        <base:imageSpacer width="32" height="32"/>
                                      </logic:equal>
                                      
                                      <logic:equal name="result" property="gradeLevel3to5" value="true">
                                        <base:imagePassThrough onlineServiceURL="http://${wpeURL}/wpebrowse/images/icons/3-5.gif"  width="32" height="32" alt="3-5"/>
                                      </logic:equal>
                                      <logic:equal name="result" property="gradeLevel3to5" value="false">
                                        <base:imageSpacer width="32" height="32"/>
                                      </logic:equal>
                                      
                                      <logic:equal name="result" property="gradeLevel6to8" value="true">
                                        <base:imagePassThrough onlineServiceURL="http://${wpeURL}/wpebrowse/images/icons/6-8.gif"  width="32" height="32" alt="6-8"/>
                                      </logic:equal>
                                      <logic:equal name="result" property="gradeLevel6to8" value="false">
                                        <base:imageSpacer width="32" height="32"/>
                                      </logic:equal>

                                      <logic:equal name="result" property="gradeLevel9to12" value="true">
                                        <base:imagePassThrough onlineServiceURL="http://${wpeURL}/wpebrowse/images/icons/9-12.gif"  width="32" height="32" alt="9-12"/>
                                      </logic:equal>
                                      <logic:equal name="result" property="gradeLevel9to12" value="false">
                                        <base:imageSpacer width="32" height="32"/>
                                      </logic:equal>
                                  </logic:equal>
                                  <logic:equal name="form" property="<%=WebPathSearchResultsForm.FIELD_PRINTER_FRIENDLY%>" value="true">
                                      <logic:equal name="result" property="gradeLevelPreKto2" value="true">
                                        &nbsp;PreK-2
                                      </logic:equal>
                                      <logic:equal name="result" property="gradeLevel3to5" value="true">
                                        &nbsp;3-5
                                      </logic:equal>
                                      <logic:equal name="result" property="gradeLevel6to8" value="true">
                                        &nbsp;6-8
                                      </logic:equal>
                                      <logic:equal name="result" property="gradeLevel9to12" value="true">
                                        &nbsp;9-12
                                      </logic:equal>
                                  </logic:equal>
                               </span>
                            </td>
                        </tr>
                        <tr>
                           <td colspan="2">
                                <span class="ColRow"><%=result.getDescription() %></span>
                           </td>
                        </tr>
                        <tr>
                           <td>
                                <table width="100%" id="<%=WebPathSearchResultsForm.TABLE_SEARCH_RESULT_INFO + index%>">
                                    <tr>
                                        <td valign="top"><span class="ColRowBold"><% if (!StringHelper.isEmptyOrWhitespace(result.getHeadingString())) { %>Topic:&nbsp;</span><span class="ColRow"><%=result.getHeadingString() %>&nbsp;</span><%} else { out.println("&nbsp;"); }%> </td>
                                        <td valign="top"><span class="ColRowBold">&nbsp;Language:&nbsp;</span><span class = "ColRow"><%=result.getLanguageString() %>&nbsp;</span></td>
                                        <logic:equal name="form" property="<%=WebPathSearchResultsForm.FIELD_PRINTER_FRIENDLY%>" value="true">
                                            <td valign="top"><span class="ColRowBold"><%if ( !StringHelper.isEmptyOrWhitespace(result.getLexileMeasure())) { %>&nbsp;Lexile:&nbsp;</span><span class = "ColRow"><%=result.getLexileMeasure() %>&nbsp;</span><%} else { out.println("&nbsp;"); }%> </td>
                                            <td valign="top"><span class="ColRowBold"><%if ( !StringHelper.isEmptyOrWhitespace(result.getFormatTypeString())) { %>&nbsp;Format Type:&nbsp;</span><span class = "ColRow"><%=result.getFormatTypeString() %>&nbsp;</span><%} else { out.println("&nbsp;"); }%> </td>
                                            <td valign="top"><span class="ColRowBold"><%if ( !StringHelper.isEmptyOrWhitespace(result.getSourceTypeString())) { %>&nbsp;Source Type:&nbsp;</span><span class = "ColRow"><%=result.getSourceTypeString() %>&nbsp;</span><%} else { out.println("&nbsp;"); }%> </td>                                            
                                        </logic:equal>
                                        <logic:equal name="form" property="<%=WebPathSearchResultsForm.FIELD_PRINTER_FRIENDLY%>" value="false">
                                            <td valign="top">
                                                <span class="ColRowBold">
                                                <%if ( !StringHelper.isEmptyOrWhitespace(result.getLexileMeasure())) { %>&nbsp;Lexile:&nbsp;</span><span class = "ColRow"><%=result.getLexileMeasure() %>&nbsp;</span>
                                                <%} else { out.println("&nbsp;"); }%> 
                                            </td>
                                            <td valign="top">
                                            <%if ( !StringHelper.isEmptyOrWhitespace(result.getFormatTypeString())) { 
                                                Iterator<String> itr = result.getFormatTypeList().iterator();
                                                  while ( itr.hasNext()){
                                                  String formatName = itr.next();
                                              %>
                                                <% String url = "http://" + DestinySystemProperties.getWebPathExpressHostAndPort() + "/wpebrowse/images/icons/" + WPEConstants.descriptionToImage(formatName); %>
                                                <base:imagePassThrough onlineServiceURL="<%=url %>" alt="<%=formatName%>" width="24" height="24"/>
                                              <%   } %>
                                                  &nbsp;&nbsp;&nbsp;
                                             <% } else {
                                                out.println("&nbsp;");
                                            }
                                            %>
                                            </td>
                                            <td valign="top">
                                            <%if ( !StringHelper.isEmptyOrWhitespace(result.getSourceTypeString())) { 
                                                Iterator<String> itr = result.getSourceTypeList().iterator();
                                                  while ( itr.hasNext()){
                                                  String sourceName = itr.next();
                                            %>
                                             <% String url = "http://" + DestinySystemProperties.getWebPathExpressHostAndPort() + "/wpebrowse/images/icons/" + WPEConstants.descriptionToImage(sourceName); %>
                                                <base:imagePassThrough onlineServiceURL="<%=url %>" alt="<%=sourceName%>" width="24" height="24"/>
                                            <%    }
                                                } else {
                                                out.println("&nbsp;");
                                            }
                                            %>
                                            </td>                                       
                                        </logic:equal>
                                    </tr>
                                </table>
                           </td>
                           <td class = "tdAlignRight">
                            <% if (result.getRating() > 0 && !form.isPrinterFriendly()) { %>
                                <span class="ColRowBold">User Rating: </span><base:reviewStars value="<%= result.getRating() %>"></base:reviewStars>
                            <% } else { %>
                                &nbsp;
                            <% } %>
                           </td>
                        </tr>
                        <tr>
                           <td>
                               <span class="ColRowBold">URL:&nbsp;</span>
                               <logic:equal name="form" property="<%=WebPathSearchResultsForm.FIELD_PRINTER_FRIENDLY%>" value="false">
                                   <a href="<%=result.buildForwardFromResult() %>" class="ColRow" target="_blank"><%=result.getDisplayURL() %></a>
                               </logic:equal>
                               <logic:equal name="form" property="<%=WebPathSearchResultsForm.FIELD_PRINTER_FRIENDLY%>" value="true">
                                   <span class="ColRowUnderline"><%=result.getDisplayURL() %></span>
                               </logic:equal>
                           </td>
                                <base:addToBookList searchID="<%=form.getSearchID()%>" 
                                    sortID="<%=new Long(WebPathSearchResultsForm.LIST_SORT_ID)%>" 
                                    itemID="<%=new Long(index.longValue())%>" inList="<%=result.isInSelectedList() %>"
                                    webSite="true"
                                    formName="<%= WebPathSearchResultsForm.FORM_NAME %>"/>
                           <td>
                           </td>
                        </tr>
                        <tr>
                           <td colspan="2">
                              <logic:equal name="<%=WebPathSearchResultsForm.FORM_NAME%>" property="<%=WebPathSearchResultsForm.FIELD_PRINTER_FRIENDLY%>" value="false">
                                  <base:imageLine width="100%" height="2"/>
                              </logic:equal>
                              <logic:equal name="<%=WebPathSearchResultsForm.FORM_NAME%>" property="<%=WebPathSearchResultsForm.FIELD_PRINTER_FRIENDLY%>" value="true">
                                  &nbsp;
                              </logic:equal>
                           </td>
                        </tr>
                        </table>
                    </td>
                </tr>
                </logic:iterate>
                
                <tr>
                    <td>
                        <!-- Hitlist Footer -->
                        <table width="100%" id="<%=WebPathSearchResultsForm.TABLE_PAGING_FOOTER %>">
                            <tr>
                                <td>
                                    <logic:equal name="<%=WebPathSearchResultsForm.FORM_NAME%>" property="<%=WebPathSearchResultsForm.FIELD_EMPTY_SEARCH%>" value="false">
                                        <base:searchSummary searchType="Displaying" 
                                            startOfSet="<%=String.valueOf(form.getFirstHit())%>"
                                            endOfSet= "<%=String.valueOf(form.getHitsReturned() + form.getFirstHit() - 1)%>"
                                            totalInSet = "<%=String.valueOf(form.getHitsTotal())%>"
                                            tooManyHits = "false"/>
                                    </logic:equal>
                                    <logic:equal name="<%=WebPathSearchResultsForm.FORM_NAME%>" property="<%=WebPathSearchResultsForm.FIELD_EMPTY_SEARCH%>" value="true">
                                        &nbsp;
                                    </logic:equal>
                                </td>
                                <td noWrap class="SmallColHeading tdAlignRight">
                                    <logic:equal name="form" property="<%=WebPathSearchResultsForm.FIELD_PRINTER_FRIENDLY%>" value="false">
                                        <logic:equal name="<%=WebPathSearchResultsForm.FORM_NAME%>" property="<%=WebPathSearchResultsForm.FIELD_EMPTY_SEARCH%>" value="false">
                                            <base:pageListOutput formName="<%=WebPathSearchResultsForm.FORM_NAME%>" topOfPageLinks="false" displayTabs="<%=form.isDisplayTabs()%>"/>
                                        </logic:equal>
                                    </logic:equal>&nbsp;
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </base:outlinedTableAndTabsWithinThere>
        </td>
    </tr>
</table>
</base:form>
