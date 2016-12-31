<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>



<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.*"%>
<%@ page import="com.follett.fsc.destiny.util.language.*"%>
<%@ page import="com.follett.fsc.destiny.util.Permission"%>
<%@ page import="com.follett.fsc.destiny.client.common.PageCalculator" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.BaseListForm" %>
<%@page import="com.follett.fsc.destiny.entity.AdvancedSearchQueryData"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%

Permission permissionsForBulkAdd[] = new Permission[]{Permission.CAT_BULK_ADD_TO_BOOKLIST, Permission.CAT_BULK_ADD_TO_BOOKLIST_TEXTBOOK,
    Permission.CAT_BULK_ADD_TO_BOOKLIST_ASSET};
String parentFormName = (String)request.getAttribute("parentFormName");
BaseSearchResultsForm form = (BaseSearchResultsForm)request.getAttribute(parentFormName);

VisualSearchResultsForm formVS = null;
if (VisualSearchResultsForm.FORM_NAME.equals(parentFormName)) {
	formVS = (VisualSearchResultsForm)request.getAttribute(VisualSearchResultsForm.FORM_NAME);
}

Boolean wpeDisplayTabs = (Boolean)request.getAttribute("wpeDisplayTabs");
form.buildNavigationLinks(wpeDisplayTabs);

int collectionType = form.getCollectionType();
String viewDupsAltText = form.getCollectionType() == CollectionType.ASSET  ? MessageHelper.formatMessage("booklist_ViewDuplicateAssets") : MessageHelper.formatMessage("booklist_ViewDuplicateTitles");
    // if the user klicked the keywords tab, we're going to show the tabbed result list
    // even if it is empty
    if (request.getAttribute("MyKeywordList") != null || form.isUserClickedKeywordsTab()) {
        int itemsInList = form.getTotalCount();
        int currentPage = PageCalculator.getCurrentPage(form);
        int itemsToSkip = PageCalculator.getFirstNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
        int itemsToPrint = PageCalculator.getOnePastLastNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
        boolean tooManyHits = form.isTooManyHits();
%>
<tr>
                    <td valign="top">
                        <html:hidden property="page" value='<%= Integer.toString(currentPage) %>' />
                        <html:hidden property="descend"/>
                        <html:hidden property="dateDescend"/>
                        <html:hidden property="relevanceDescend"/>
                        <html:hidden property="totalCount"/>
                        <html:hidden property="lastSort"/>
                        <html:hidden property="sort"/>
                        <html:hidden property="doTop10"/>
                        <html:hidden property="<%=BaseSearchResultsForm.PARM_DISPLAY_LIST_CONTROLS%>"/>
                        <html:hidden property="<%=BaseListForm.PARAM_SHOW_RELEVANCY%>"/>
                        <table id="<%= BaseSearchResultsForm.TABLE_PAGING_HEADER %>" width="100%">
                            <tr>
                                <% if (formVS != null) { %>
                                    <td width="70">
                                        <% formVS.buildVisualSearchButtonInfo(); %>
                                            <html:img src="<%=formVS.getSearchGraphic()%>" width="70" alt="<%=formVS.getSearchGraphicDescription()%>" vspace="0"/>
                                <% } else { %>
                                    <td>
                                        &nbsp;
                                <% } %>
                                </td>
                                <td class="TableHeading2">
                                    <bean:write name='<%=parentFormName%>' property="searchDescription"/>
                                </td>
                                <td class="tdAlignRight">
                            <% if ( itemsInList > 0 ) { %>
                                <logic:present name='<%= parentFormName %>' property="printerFriendlyLink">
                                    <base:link page="<%= form.getPrinterFriendlyLink() %>" target="printerFriendly"  id="<%=BaseSearchResultsForm.ID_PRINTER_FRIENDLY %>"><base:image src='/buttons/large/printerfriendly_elem.gif' alt='<%= MessageHelper.formatMessage("print") %>' align="absbottom"/></base:link>
                                    <base:imageSpacer width="1" height="5"/>
                                </logic:present>
                            <% } else { %>
                                &nbsp;
                            <% } %>
                                </td>
                            </tr>

                            <% if (itemsInList == 0) {%>
                            <tr><td colspan="3">
                                <base:messageBox filterMessage="false" showWarningIcon="false" message="<%=form.getNoResultsMessage()%>"/>
                            </td></tr>
                            <% } else { %>
                                <tr>
                                <td colspan="3"><base:imageLine height="2" width="100%"/></td>
                                </tr>
                                <tr valign="bottom">
                                    <td colspan="3">
                                      <table id="<%=BaseSearchResultsForm.TABLE_PAGING_NUMBER_HEADER %>" border="0" cellpadding="0" width="100%">
                                        <tr>
                                        <td width="44">
                                            <% if (!StringHelper.isEmpty(form.getLinkPreviousElementary())) { %>
                                                <base:link page='<%= form.getLinkPreviousElementary() %>' id="<%=BaseSearchResultsForm.ID_BUTTON_PREVIOUS %>">
                                                    <base:image align="top" src="/icons/general/previouslonger.gif" width="44" height="26"  alt='<%= MessageHelper.formatMessage("basesearchresultsdata_elem_Prev") %>'/>
                                                </base:link>
                                            <% } else { %>
                                                &nbsp;
                                            <% } %>
                                        </td>
                                        <td align="center">
                                        <base:searchSummary  searchType='<%=form.getSearchQuantityPrompt()%>' startOfSet='<%="" + ( itemsToSkip + 1 ) %>'
                                            endOfSet= '<%="" + ( itemsToPrint )%>'
                                            totalInSet = '<%="" + ( itemsInList )%>'
                                            tooManyHits = '<%= "" + ( tooManyHits ) %>'
                                            rowClass = "ColRowBold"
                                            />
                                        </td>

                                        <td class="tdAlignRight" width="44">
                                            <% if (!StringHelper.isEmpty(form.getLinkNextElementary())) { %>
                                                <base:link page='<%= form.getLinkNextElementary() %>' id="<%=BaseSearchResultsForm.ID_BUTTON_NEXT %>">
                                                    <base:image align="top" src="/icons/general/nextlonger.gif" width="44" height="26"  alt='<%= MessageHelper.formatMessage("basesearchresultsdata_elem_Next") %>'/>
                                                </base:link>
                                            <% } else { %>
                                                &nbsp;
                                            <% } %>
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
    								<jsp:include page="/common/titlelist_elem.jsp">
    									<jsp:param name="formName" value="<%=parentFormName%>"/>
    								</jsp:include>
                                <% } %>

                <%                  BookListForm booklistform;
                                    if (BookListForm.FORM_NAME.equals(parentFormName)) {
                                        booklistform = (BookListForm) form;
                                        // If we're on the BookList, display the empty and remove from BookList buttons
                %>
                                    <tr>
                                        <td class="tdAlignRight" colspan="2">
                                            <logic:equal name='<%= BookListForm.FORM_NAME %>' property="publicList" value="false">
                                                <% if(!booklistform.isPublicList() && !booklistform.isFromVisualSearch()) { %>
                                                    <br><base:imageSpacer width="1" height="5"/>
                                                    <base:genericButton name="<%=BookListForm.ID_BUTTON_REMOVE_ALL%>"  alt='<%= MessageHelper.formatMessage("removeAll") %>' src="/buttons/small/removeall.gif"/>
                                                <% } %>
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
                                <td width="44">
                                    <% if (!StringHelper.isEmpty(form.getLinkPreviousElementary())) { %>
                                        <base:link page='<%= form.getLinkPreviousElementary() %>' id="<%=BaseSearchResultsForm.ID_BUTTON_PREVIOUS %>">
                                            <base:image align="top" src="/icons/general/previouslonger.gif" width="44" height="26"  alt='<%= MessageHelper.formatMessage("basesearchresultsdata_elem_Prev") %>'/>
                                        </base:link>
                                    <% } else { %>
                                        &nbsp;
                                    <% } %>
                                </td>
                                <td align="center">
                                <base:searchSummary  searchType='<%=form.getSearchQuantityPrompt()%>' startOfSet='<%="" + ( itemsToSkip + 1 ) %>'
                                    endOfSet= '<%="" + ( itemsToPrint )%>'
                                    totalInSet = '<%="" + ( itemsInList )%>'
                                    tooManyHits = '<%= "" + ( tooManyHits ) %>'
                                    rowClass = "ColRowBold"
                                    />
                                </td>

                                <td class="tdAlignRight" width="44">
                                    <% if (!StringHelper.isEmpty(form.getLinkNextElementary())) { %>
                                        <base:link page='<%= form.getLinkNextElementary() %>' id="<%=BaseSearchResultsForm.ID_BUTTON_NEXT %>">
                                            <base:image align="top" src="/icons/general/nextlonger.gif" width="44" height="26"  alt='<%= MessageHelper.formatMessage("basesearchresultsdata_elem_Next") %>'/>
                                        </base:link>
                                    <% } else { %>
                                        &nbsp;
                                    <% } %>
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
                
