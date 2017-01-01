<%@page import="java.util.Iterator"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.session.cataloging.data.StateStandardsSearchVO" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.*"%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.webpath.clientjar.WPEConstants"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<bean:define id="form" name="<%=StateStandardsSupportingWebSitesForm.FORM_NAME%>" type="StateStandardsSupportingWebSitesForm"/>

<base:messageBox strutsErrors="true"/>

<%

String borderColor = "#c0c0c0";
if (form.isPrinterFriendly()) {
    borderColor = "#ffffff";
}
%>
<br>
<c:set var="wpeURL" value="<%=DestinySystemProperties.getWebPathExpressHostAndPort()%>"/>
<base:form action="/cataloging/servlet/handlestatestandardssupportingwebsitesform.do">
<html:hidden property="<%=StateStandardsSupportingWebSitesForm.FIELD_SS_OID%>"/>
<html:hidden property="<%=StateStandardsSupportingWebSitesForm.FIELD_SEARCH_ID%>"/>
<html:hidden property="<%=StateStandardsSupportingWebSitesForm.PARM_PAGE%>"/>
<html:hidden property="<%=StateStandardsSupportingWebSitesForm.PARM_TOTAL_COUNT%>"/>
<table id="<%=StateStandardsSupportingWebSitesForm.TABLE_MAIN%>" width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr>
        <td>
            <base:outlinedTableAndTabsWithinThere tabs="<%=form.getTabs() %>" selectedTab="<%=form.getSelectedTab() %>" borderColor="<%=borderColor%>" width="100%" cellpadding="0" id="<%=StateStandardsSupportingWebSitesForm.TABLE_DETAIL%>">
            <tr>
                <td>
                    <table id="<%=StateStandardsSupportingWebSitesForm.TABLE_PAGING_HEADER%>" width="100%">
                    <tr>
                        <td colspan="2">
                            <span class="ColRowBold">
                            Searching in <bean:write name="form" property="siteTypeDescription"/></span>&nbsp;
                            <logic:equal name="form" property="<%=StateStandardsSupportingWebSitesForm.FIELD_PRINTER_FRIENDLY%>" value="false">
                                <span class="SmallColRow">[<a href="/cataloging/servlet/handlestatestandardssupportingwebsitesform.do?action=refine" id="<%=StateStandardsSupportingWebSitesForm.ID_LINK_REFINE_SEARCH %>">Refine your search</a>]</span>
                            </logic:equal>
                        </td>
                        <td noWrap class="tdAlignRight" valign="top">
                            <logic:equal name="form" property="<%=StateStandardsSupportingWebSitesForm.FIELD_PRINTER_FRIENDLY%>" value="false">
                                <logic:notEqual name="form" property="totalCount" value="0">
                                    <a href='<bean:write name="<%=StateStandardsSupportingWebSitesForm.FORM_NAME%>" property="printerFriendlyLink" filter="false"/>' target="printerFriendly" id="<%=GenericForm.ID_PRINTER_FRIENDLY %>"><base:image alt="Printer Friendly" src="/buttons/small/printerfriendly.gif" align="absbottom"/></a>
                                </logic:notEqual>
                            </logic:equal>&nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <span class="ColRowBold">
                            <bean:write name="form" property="ssDescription"/> <bean:write name="form" property="ssNumber"/>
                            </span>
                            <span class="ColRow"><bean:write name="form" property="ssData" filter="false"/></span>
                        </td>
                            <td nowrap class="tdAlignRight" vAlign="bottom">
                            <logic:notEqual name="form" property="totalCount" value="0">
                                <logic:equal name="form" property="<%=StateStandardsSupportingWebSitesForm.FIELD_PRINTER_FRIENDLY%>" value="false">
                                	<base:myListSelect name='<%=StateStandardsSupportingWebSitesForm.FIELD_SELECTED_LIST_ID%>' 
                                		selectedMyListID="<%=form.getSelectedListID()%>"
                                		prompt='<%="Selected List:"  %>'
                                		submitOnChange="true"
                                		dropDownClass="SmallColRow"/>
                                    <%= form.getDisplayAddAllBooklist(StateStandardsSupportingWebSitesForm.FORM_NAME) %>
                                </logic:equal>
                           </logic:notEqual>
    						</td>
                    </tr>
                    <tr vAlign="bottom">
                        <logic:notEqual name="form" property="totalCount" value="0">
                            <td>
                                <base:searchSummary searchType="Web Sites" 
                                        startOfSet="<%=String.valueOf(form.getFirstHit())%>"
                                        endOfSet= "<%=String.valueOf(form.getHitsReturned() + form.getFirstHit() - 1)%>"
                                        totalInSet = "<%=String.valueOf(form.getHitsTotal())%>"
                                        tooManyHits = "false"/>                            
                            </td>
                            <td noWrap class="SmallColHeading tdAlignRight" colspan="2">
                                <logic:equal name="form" property="<%=StateStandardsSupportingWebSitesForm.FIELD_PRINTER_FRIENDLY%>" value="false">
                                    <base:pageListOutput formName="<%=StateStandardsSupportingWebSitesForm.FORM_NAME%>"/>
                                </logic:equal>
                            </td>
                        </logic:notEqual>
                          <% if (form.getErrors() == null || form.getErrors().size() == 0 )  { %>
                             <logic:equal name="form" property="totalCount" value="0">
                                <td>
                                    <base:messageBox showWarningIcon="false" message="No Web sites are currently aligned with this standard."/>
                                </td>
                            </logic:equal>
                          <% } %>
                    </tr>
                    </table>
                </td>
            </tr>
            <logic:notEqual name="form" property="totalCount" value="0">
                <tr>
                <td><base:imageLine height="2" width="100%"/></td>
                </tr>
                <% int count=0; %>
                <logic:iterate name="<%=StateStandardsSupportingWebSitesForm.FORM_NAME%>" property="<%=StateStandardsSupportingWebSitesForm.ATTRIBUTE_LIST%>" id="result" type="com.follett.fsc.destiny.util.statestandards.LinkDetailElement">
                <tr>
                    <td>
                        <%-- put this guy in his own td -- ie 8.0 had some issues with displaying --%>
						<a name='<%="anchor_" + count%>'/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <table width="100%" id="<%=StateStandardsSearchResultsForm.TABLE_KEYWORD_RESULTS + count%>">
                        <tr>
                            <td class="ColRow" colspan="4">
                                <logic:equal name="form" property="<%=StateStandardsSupportingWebSitesForm.FIELD_PRINTER_FRIENDLY%>" value="false">
                                     <a href="<%=result.buildForwardFromResult() %>" target="_blank"><%=result.getTitle() %></a>
                                </logic:equal>
                                <logic:equal name="form" property="<%=StateStandardsSupportingWebSitesForm.FIELD_PRINTER_FRIENDLY%>" value="true">
                                     <span class="ColRowBoldUnderline"><%=result.getTitle() %></span>
                                </logic:equal>
                            </td>
                            <td class="tdAlignRight">
                                <table border="0" cellpadding="0" cellspacing="0" id="<%=StateStandardsSearchResultsForm.TABLE_GRADES + count%>">
                                <tr> <td class="tdAlignRight" nowrap width="10%">
                               <span class="ColRowBold">
                                  Grade Level:
                                  <logic:equal name="form" property="<%=StateStandardsSupportingWebSitesForm.FIELD_PRINTER_FRIENDLY%>" value="false">
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
                                  <logic:equal name="form" property="<%=StateStandardsSupportingWebSitesForm.FIELD_PRINTER_FRIENDLY%>" value="true">
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
                            
                                </table>
                            </td>
                        </tr>
                        <tr>
                            <td class="ColRow" colspan="5"><bean:write name="result" property="description"/></td>
                        </tr>
                        <tr>
                            <td valign="top" class="ColRow"><%if ( !StringHelper.isEmptyOrWhitespace(result.getHeadingString())) { %><B>Topic:</B>&nbsp;<%=result.getHeadingString() %><%} else { out.println("&nbsp;"); }%> </td>
                            <td valign="top"><span class="ColRowBold"><%if ( !StringHelper.isEmptyOrWhitespace(result.getLanguageString())) { %>Language:&nbsp;</span><span class = "ColRow"><%=result.getLanguageString() %></span><%} else { out.println("&nbsp;"); }%> </td>
                            <logic:equal name="form" property="<%=StateStandardsSupportingWebSitesForm.FIELD_PRINTER_FRIENDLY%>" value="true">
                              <td valign="top"><span class="ColRowBold"><%if ( !StringHelper.isEmptyOrWhitespace(result.getFormatTypeString())) { %>Format Type:&nbsp;</span><span class = "ColRow"><%=result.getFormatTypeString() %></span><%} else { out.println("&nbsp;"); }%> </td>
                              <td valign="top"><span class="ColRowBold"><%if ( !StringHelper.isEmptyOrWhitespace(result.getSourceTypeString())) { %>Source Type:&nbsp;</span><span class = "ColRow"><%=result.getSourceTypeString() %></span><%} else { out.println("&nbsp;"); }%> </td>
                            </logic:equal>
                            <logic:equal name="form" property="<%=StateStandardsSupportingWebSitesForm.FIELD_PRINTER_FRIENDLY%>" value="false">
                                <td valign="top">
                                    <%if ( !StringHelper.isEmptyOrWhitespace(result.getFormatTypeString())) { 
                                              Iterator<String> itr = result.getFormatTypeList().iterator();
                                              while ( itr.hasNext()){
                                              String formatName = itr.next();
                          
                                    %>
                                        <% String url = "http://" + DestinySystemProperties.getWebPathExpressHostAndPort() + "/wpebrowse/images/icons/" + WPEConstants.descriptionToImage(formatName); %>
                                        <base:imagePassThrough onlineServiceURL="<%=url %>" alt="<%=formatName%>" width="24" height="24"/>
                                    <%        }%>
                                    &nbsp;&nbsp;&nbsp;
                                     <%    } else {
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
                                    <%        }
                                        } else {
                                        out.println("&nbsp;");
                                    }
                                    %>
                                </td>
                            </logic:equal>
                             <td  valign="top" class="tdAlignRight">
                            <% if (result.getRating() > 0 && !form.isPrinterFriendly()) { %>
                                <span class = "ColRowBold">User Rating: </span><base:reviewStars value="<%= result.getRating() %>"></base:reviewStars>
                            <% } else { %>
                                &nbsp;
                            <% } %>
                           </td>
                        </tr>
                        <tr>
                            <td colspan="4"><span class="ColRowBold">URL:</span>&nbsp;
                            <logic:equal name="form" property="<%=StateStandardsSupportingWebSitesForm.FIELD_PRINTER_FRIENDLY%>" value="false">
                                <a href="<%=result.buildForwardFromResult() %>" class="ColRow" target="_blank"><%=result.getDisplayURL() %></a>
                            </logic:equal>
                            <logic:equal name="form" property="<%=StateStandardsSupportingWebSitesForm.FIELD_PRINTER_FRIENDLY%>" value="true">
                                <span class="ColRowUnderline"><%=result.getDisplayURL() %></span>
                            </logic:equal>
                            </td>
                           	<base:addToBookList searchID='<%=form.getSearchID()%>' 
                                           itemID='<%=new Long(count)%>' inList='<%=result.isInSelectedList()%>'
                                           webSite="true"
                                           formName="<%=StateStandardsSupportingWebSitesForm.FORM_NAME%>"/>
                        </tr>
                        <tr>
                            <td colspan="5"><base:imageLine width="100%" height="2" /></td>
                        </tr>
                        </table>
                    </td>
                </tr>
                <% count++; %>
                </logic:iterate>
                <tr>
                    <td>
                        <!-- Hitlist Footer -->
                        <table width="100%" id="<%=StateStandardsSupportingWebSitesForm.TABLE_PAGING_FOOTER %>">
                            <tr>
                                <td>
                                    <base:searchSummary searchType="Web Sites" 
                                        startOfSet="<%=String.valueOf(form.getFirstHit())%>"
                                        endOfSet= "<%=String.valueOf(form.getHitsReturned() + form.getFirstHit() - 1)%>"
                                        totalInSet = "<%=String.valueOf(form.getHitsTotal())%>"
                                        tooManyHits = "false"/> 
                                </td>
                                <td class="SmallColHeading tdAlignRight">
                                    <logic:equal name="form" property="<%=StateStandardsSupportingWebSitesForm.FIELD_PRINTER_FRIENDLY%>" value="false">
                                        <base:pageListOutput formName="<%=StateStandardsSupportingWebSitesForm.FORM_NAME%>" topOfPageLinks="false"/>
                                    </logic:equal>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </logic:notEqual>
            </base:outlinedTableAndTabsWithinThere>
        </td>
    </tr>
</table>
</base:form>
