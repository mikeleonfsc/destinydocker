<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.*"%>
<%@ page import="com.follett.fsc.destiny.util.Permission"%>
<%@ page import="com.follett.fsc.destiny.client.common.PageCalculator" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%

String parentFormName = (String)request.getAttribute("parentFormName");
BookSeriesResultsForm form = (BookSeriesResultsForm)request.getAttribute(parentFormName);
Boolean wpeDisplayTabs = (Boolean)request.getAttribute("wpeDisplayTabs");

    if (request.getAttribute("MyKeywordList") != null || form.isUserClickedKeywordsTab()) {
        int itemsInList = form.getTotalCount();
        boolean tooManyHits = form.isTooManyHits();
%>
                <tr>
                    <td valign="top">
                        <html:hidden property="<%=BaseSearchResultsForm.PARM_DISPLAY_LIST_CONTROLS%>"/>
                        <table id="<%= BaseSearchResultsForm.TABLE_PAGING_HEADER %>" width="100%">
                            <tr>
                                <td colspan="3">
                                    <span class="ColRowBold">
                                    <bean:write name='<%=parentFormName%>' property="searchDescription"/>
                                    </span>
                                </td>
                            </tr>
                            <tr>
                                <td class="ColRowBold" colspan="2">
                                    <%= MessageHelper.formatMessage("basebookseriesresultsdata_BookFrom_siteinfo") %>
                                    <bean:define id="sites" name="<%=BookSeriesResultsForm.FORM_NAME%>" property="<%=BookSeriesResultsForm.PARM_SITES%>"/>
                                    <% if (form.getSites().size() > 1) { %>
                                        <html:select property="<%=BookSeriesResultsForm.FIELD_SITE_ID%>">
                                                <html:options collection="sites" property="longID" labelProperty="stringDesc"/>
                                        </html:select>  
                                        <base:goButton absbottom="true" />
                                    <% } else if (form.getSites().size() == 1) { %>
                                           <html:hidden property="<%=BookSeriesResultsForm.FIELD_SITE_ID%>"/>
                                           <%=form.getSites().getString(0) %>
                                    <% } %>
                                </td>
                                <td class="tdAlignRight">
                                    <base:okButton/>
                                    <base:cancelButton/>
                                </td>
                            </tr>
                            <base:notEmpty name='<%=parentFormName%>' property="extraSearchDescription">
                            <tr>
                                <td colspan="2">
                                    <bean:write name='<%=parentFormName%>' property="extraSearchDescription" filter="false"/>
                                </td>
                                <td>
                                    &nbsp;
                                </td>
                            </tr>
                            </base:notEmpty>
                            <% if (itemsInList == 0) {%>
                            <tr><td><base:messageBox filterMessage="false" showWarningIcon="false" message="<%=form.getNoResultsMessage()%>"/></td>
                            </tr>
                            <% } else { %>
                                <tr><td colspan="3"><base:imageLine height="2" width="100%"/></td>
                                </tr>
                                <tr valign="bottom">
                                    <td colspan="3">
                                      <table id="<%=BaseSearchResultsForm.TABLE_PAGING_NUMBER_HEADER %>" border="0" cellpadding="0" width="100%">
                                        <tr>
                                        <td>
                                        <base:searchSummary  searchType='<%=form.getSearchQuantityPrompt()%>' startOfSet="1"
                                            endOfSet= '<%="" + ( itemsInList )%>'
                                            totalInSet = '<%="" + ( itemsInList )%>'
                                            tooManyHits = '<%= "" + ( tooManyHits ) %>'
                                            />
                                        </td>

                                        <td class="tdAlignRight" colspan="2">
                                            <% if (form.hasAtLeastOneCheckbox()) {%>
                                                <base:genericButton name="<%=BookSeriesResultsForm.BUTTON_SELECT_ALL%>" 
                                                    alt="<%=BookSeriesResultsForm.ALT_SELECT_ALL%>"
                                                    src="/buttons/small/selectall_opaque.gif"/>
                                                <base:genericButton name="<%=BookSeriesResultsForm.BUTTON_CLEAR_ALL%>" 
                                                    alt="<%=BookSeriesResultsForm.ALT_CLEAR_ALL%>"
                                                    src="/buttons/small/clearall_opaque.gif"/>
                                            <% } else { %>
                                                &nbsp;
                                            <% }%>
                                        </td>
                                        </tr>
                                     </table>
                                     </td>
                                </tr>
                                <tr>
                                <td colspan="3"><base:imageLine height="2" width="100%" /></td>
                                </tr>
                            </table> <!-- TABLE_PAGING_HEADER -->

                            <logic:equal name="<%= parentFormName %>" property="printerFriendly" value="false">
                                <table id="keywordTable" width="100%" cellspacing="0" cellpadding="2">
                            </logic:equal>

                                <!-- This is the main hitlist -->
                                <% if (BookListForm.FORM_NAME.equals(parentFormName) && (form.getCollectionType() == CollectionType.ONESEARCH || form.getCollectionType() == CollectionType.WPE)) { %>
                                    <jsp:include page="/cataloging/onlineresourceslist.jsp"/>
                                <% } else { %>
                                    <jsp:include page="/common/titlelist.jsp">
                                        <jsp:param name="formName" value="<%=parentFormName%>"/>
                                    </jsp:include>
                                <% } %>

                <%                  if (BookListForm.FORM_NAME.equals(parentFormName)) {
                                        // If we're on the BookList, display the empty and remove from BookList buttons
                %>
                                    <tr>
                                        <td class="tdAlignRight" colspan="2">
                                            <logic:equal name='<%= BookListForm.FORM_NAME %>' property="publicList" value="false">
                                                <br><base:imageSpacer width="1" height="5"/>
                                                <base:genericButton name="<%=BookListForm.ID_BUTTON_REMOVE_ALL%>" alt='<%= MessageHelper.formatMessage("removeAll") %>' src="/buttons/small/removeall.gif"/>
                                            </logic:equal>
                                        </td>
                                    </tr>
                <%
                                    }
                                %>

                            <logic:equal name="<%= parentFormName %>" property="printerFriendly" value="false">
                                </table>
                            </logic:equal>
                            
                            <!-- Hitlist Footer -->
                            <table width="100%" id="<%= BaseSearchResultsForm.TABLE_PAGING_FOOTER %>">
                                <tr>
                                    <td>
                                        <base:searchSummary searchType='<%=form.getSearchQuantityPrompt()%>' startOfSet="1"
                                            endOfSet= '<%="" + ( itemsInList )%>'
                                            totalInSet = '<%="" + ( itemsInList )%>'
                                            tooManyHits = '<%= "" + ( tooManyHits ) %>'
                                            />
                                    </td>
                                    <td class="tdAlignRight" colspan="2">
                                        <% if (form.hasAtLeastOneCheckbox()) {%>
                                            <base:genericButton name="<%=BookSeriesResultsForm.BUTTON_SELECT_ALL%>" 
                                                alt="<%=BookSeriesResultsForm.ALT_SELECT_ALL%>"
                                                src="/buttons/small/selectall_opaque.gif"/>
                                            <base:genericButton name="<%=BookSeriesResultsForm.BUTTON_CLEAR_ALL%>" 
                                                alt="<%=BookSeriesResultsForm.ALT_CLEAR_ALL%>"
                                                src="/buttons/small/clearall_opaque.gif"/>
                                        <% } else { %>
                                            &nbsp;
                                        <% } %>
                                    </td>
                                </tr>
                                <tr> 
                                    <td align="center" colspan="3">
                                        <base:okButton/>
                                        <base:cancelButton/>
                                    </td>
                                </tr>
<%
                            }   //if (itemsInList > 0)
%>
                        </table>
                    </td>
                </tr>
<%
    }
%>                
