
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>



<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.*"%>
<%@ page import="com.follett.fsc.destiny.util.language.*"%>
<%@ page import="com.follett.fsc.destiny.util.Permission"%>
<%@ page import="com.follett.fsc.destiny.client.common.PageCalculator" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.BaseListForm" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%
String parentFormName = (String)request.getAttribute("parentFormName");
BaseSearchResultsForm form = (BaseSearchResultsForm)request.getAttribute(parentFormName);
Boolean wpeDisplayTabs = (Boolean)request.getAttribute("wpeDisplayTabs");
    // if the user klicked the keywords tab, we're going to show the tabbed result list
    // even if it is empty
    if (request.getAttribute("MyKeywordList") != null || form.isUserClickedKeywordsTab()) {
        int itemsInList = form.getTotalCount();
        int currentPage = PageCalculator.getCurrentPage(form);
        int itemsToSkip = PageCalculator.getFirstNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
        int itemsToPrint = PageCalculator.getOnePastLastNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
        boolean tooManyHits = form.isTooManyHits();
        
        
        boolean showBookListDropdown = true;
        
        // booklist form has it's own permission checking, so let's trust it
        if (!BookListForm.FORM_NAME.equals(parentFormName)) {
            // basesearchresultsform can check the permissions on each entry
            if ( StringHelper.isEmpty(BaseSearchResultsForm.getAllBibIDsFromList(
                form.getStore(), form.getList()))) {
                showBookListDropdown = false;
            }
        }
        
%>

                
<%@page import="com.follett.fsc.destiny.entity.AdvancedSearchQueryData"%>
               <tr>
                    <td valign="top">
                        <html:hidden property="page" value='<%= Integer.toString(currentPage) %>' />
                        <html:hidden property="descend"/>
                        <html:hidden property="dateDescend"/>
                        <html:hidden property="relevanceDescend"/>
                        <html:hidden property="totalCount"/>
                        <html:hidden property="lastSort"/>
                        <html:hidden property="doTop10"/>
                        <html:hidden property="<%=BaseSearchResultsForm.PARM_DISPLAY_LIST_CONTROLS%>"/>
                        <html:hidden property="<%=BaseListForm.PARAM_SHOW_RELEVANCY%>"/>
                        <table id="<%= BaseSearchResultsForm.TABLE_PAGING_HEADER %>" width="100%">
                            <tr>
                            <% BookListForm bookListForm = (BookListForm.FORM_NAME.equals(parentFormName)) ? (BookListForm)form : null;
                               if (BookListForm.isBookListFormNotVisualSearch(form)){ %>
                                <td class="ColRowBold" colspan="2">
                                    <base:myListAction publicList="<%= bookListForm.isPublicList() %>" digitalContentMode="<%= form.getDigitalContentMode() == AdvancedSearchQueryData.SEARCH_DIGITAL_RESOURCES_ALL %>" mergeTitlesButtonDisplayable="<%= bookListForm.hasMergeCheckBoxesPresent() %>" selectedItem="<%= new Integer(bookListForm.getListAction()) %>" fieldName="<%= bookListForm.FIELD_LIST_ACTION %>" collectionType="<%=form.getCollectionType()%>" />
                                </td>
                            <% } else { %>
                                <td colspan="2">
                                    <span class="ColRowBold">
                                    <bean:write name='<%=parentFormName%>' property="searchDescription"/>
                                    </span>
                                </td>
                            <% } %>
                                <td class="tdAlignRight">
                            <% if ( itemsInList > 0 ) { %>
                                <logic:present name='<%= parentFormName %>' property="printerFriendlyLink">
                                    <base:link page="<%= form.getPrinterFriendlyLink() %>" target="printerFriendly" id="<%=BaseSearchResultsForm.ID_PRINTER_FRIENDLY %>"><base:image src='/buttons/small/printerfriendly.gif' alt='<%= MessageHelper.formatMessage("printable") %>' align="absbottom"/> </base:link>
                                    <base:imageSpacer width="1" height="5"/>
                                </logic:present>
                            <% } else { %>
                                &nbsp;
                            <% } %>
                                </td>
                            </tr>
                            <tr>
                                <td nowrap valign="top" colspan="3">
                                    <table id="<%= BaseSearchResultsForm.TABLE_RESULT_ACTIONS %>" border="0" cellspacing="0" cellpadding="0" width="100%">
                                        <tr>
                                            <td>
                                                <% boolean outputWishListLink = false;
                                                    if (form instanceof CategorySearchResultsForm) { %>
                                                    <base:link collectionType="<%=form.getCollectionType() %>" page="<%= form.getLinkFollowingDescURL() %>" permissions="<%= new Permission[]{Permission.CAT_CREATE_ASSIGN_CATEGORIES, Permission.CAT_CREATE_ASSIGN_CATEGORIES_ASSET, Permission.CAT_CREATE_ASSIGN_CATEGORIES_TEXTBOOK} %>" id="<%=BaseSearchResultsForm.ID_BUTTON_ADD_TO_CATEGORY %>"><base:image src="/buttons/small/addtocategory.gif" alt='<%= MessageHelper.formatMessage("addToThisCategory") %>'/></base:link>
                                                <% } else { %>
                                                    <% if ( !StringHelper.isEmpty(form.getLinkFollowingDescText()) && !form.isDoTop10() ) {%>
                                                        <span class="SmallColRow">[<%=MessageHelper.formatMessage("basesearchresultsdata_NotWhatYoureLookingFor")%> <a href="<%= form.getLinkFollowingDescURL()%>" id="<%=BaseSearchResultsForm.ID_LINK_REFINE_SEARCH %>">
                                                        <bean:write name='<%=parentFormName%>' property="linkFollowingDescText"/></a><%=form.getBrowseLinkText()%>]</span>
                                                     <% outputWishListLink = true;
                                                       } %>
                                                <% } %>
                                            </td>
                                            <td class="tdAlignRight">

                                                <% if (outputWishListLink && itemsInList <= 0 
                                                    && form.getSessionStore().canDo(Permission.CAT_ADD_TO_BIB_WISH_LIST)
                                                    && (form.getCollectionType() == CollectionType.LIBRARY || 
                                                        form.getCollectionType() == CollectionType.MEDIA ||    
                                                        form.getCollectionType() == CollectionType.UNDEFINED) ) {
                                                        String linkForWishList = "/cataloging/servlet/presentbibwishlistaddform.do";
                                                        linkForWishList = URLHelper.addHREFParam(linkForWishList, BibWishListAddForm.PROPERTY_NEW_TITLE_WISH, "true" );
                                                        linkForWishList = URLHelper.addHREFParam(linkForWishList, BibWishListAddForm.PROPERTY_NEW_TITLE_SEARCH_TERM, form.getSearchDescription() );        
                                                  %>
                                                        <span class="SmallColRow">[<a href="<%=linkForWishList%>" id="<%=BaseSearchResultsForm.ID_LINK_ADD_TO_WISHLIST %>"><%= MessageHelper.formatMessage("basesearchresultsdata_AddToWishList") %></a>]</span>                                                        
                                                  <%  } else {                                                     
                                                        if (form.isDisplayListControls() && form.isOkayToDisplayMyListAndAddButton() && showBookListDropdown) { 
                                                            boolean isFromVisualSearch  = BookListForm.isBookListFormVisualSearch(form);
                                                            String fieldName = (isFromVisualSearch) ? BookListForm.PARAM_VISUALSEARCH_LIST_TO_ID : BaseSearchResultsForm.FIELD_LIST_ID;
                                                            Long intialListID = (isFromVisualSearch) ? ((BookListForm)form).getVisualSearchToListID() : form.getListID();
                                                        %>
                                                            <base:myListSelect name="<%= fieldName %>" selectedMyListID="<%= intialListID %>" submitOnChange="true" prompt='<%=MessageHelper.formatMessage("basesearchresultsdata_SelectedList")  %>' dropDownClass="SmallColRow"/>
                                                        <% } %>
                                                        &nbsp;
                                                        <% if (form.isOkayToDisplayMyListAndAddButton()) { %>
                                                            <%= form.getDisplayAddAllBooklist(parentFormName) %>
                                                        <% } 
                                                    } %>
                                            </td>
                                        </tr>
                                    </table>
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
                            <tr><td>
                            <% if(form.getTransferCopyList() != null){ %>
                                    <base:imageSpacer width="1" height="3"/>
                                    <center>
                                    <base:messageBox>
                                    <base:transferOnScan formName="<%=parentFormName%>"></base:transferOnScan>
                                    </base:messageBox>
                                    </center>
                            <%}else{ %>
                                <base:messageBox filterMessage="false" showWarningIcon="false" message='<%="<ul>" + form.getNoResultsMessage() + "</ul>"%>'/>
                            <% } %>
                            </td></tr>
                            <% } else { %>
                                <tr>
                                <td colspan="3"><base:imageLine height="2" width="100%"/></td>
                                </tr>
                                <tr valign="bottom">
                                    <td colspan="3">
                                      <table id="<%=BaseSearchResultsForm.TABLE_PAGING_NUMBER_HEADER %>" border="0" cellpadding="0" width="100%">
                                        <tr>
                                        <td>
                                        <base:searchSummary searchType='<%=form.getSearchQuantityPrompt()%>' startOfSet='<%="" + ( itemsToSkip + 1 ) %>'
                                            endOfSet= '<%="" + ( itemsToPrint )%>'
                                            totalInSet = '<%="" + ( itemsInList )%>'
                                            tooManyHits = '<%= "" + ( tooManyHits ) %>'
                                            />
                                        </td>

                                        <td>
                                            <% if (! (form.isDoTop10() || form.getCollectionType() == CollectionType.ONESEARCH)) { %>
                                                <span class="SmallColHeading"><%= MessageHelper.formatMessage("basesearchresultsdata_SortBy") %> </span>
                                                <%= form.gimmeOwnerDrawSortComboBox()%>
                                                <base:genericButton src="/buttons/small/smallgo.gif" absbottom="true" alt='<%=MessageHelper.formatMessage("go")%>' name="<%= BaseSearchResultsForm.BUTTON_CHANGE_SORT %>" />
                                            <% } else { %>
                                                &nbsp;
                                            <% } %>
                                        </td>
    
                                        <td class="SmallColHeading tdAlignRight">
                                            <base:pageListOutput formName="<%=parentFormName%>" displayTabs="<%=(wpeDisplayTabs != null ? wpeDisplayTabs.booleanValue() : false)%>" />
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

                <%                  if (BookListForm.FORM_NAME.equals(parentFormName) && BookListForm.isBookListFormNotVisualSearch(form)) {
                                        // If we're on the BookList, display the empty and remove from BookList buttons
                %>
                                    <tr>
                                        <td class="tdAlignRight" colspan="3">
                                            <logic:equal name='<%= BookListForm.FORM_NAME %>' property="publicList" value="false">
                                                <br><base:imageSpacer width="1" height="5"/>
                                                <c:if test="<%= ((BookListForm) form).hasMergeCheckBoxesPresent() %>">
                                                    <base:genericButton name="<%=BookListForm.BUTTON_VALUE_SELECT_PAGE%>" alt='<%= MessageHelper.formatMessage("selectPage") %>' src="/buttons/small/selectpage.gif"/><BR>
                                                </c:if>
                                                <base:genericButton name="<%=BookListForm.ID_BUTTON_REMOVE_ALL%>"  alt='<%= MessageHelper.formatMessage("removeAll") %>' src="/buttons/small/removeall.gif"/>
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
                                        <base:searchSummary searchType='<%=form.getSearchQuantityPrompt()%>' startOfSet='<%="" + ( itemsToSkip + 1 ) %>'
                                            endOfSet= '<%="" + ( itemsToPrint )%>'
                                            totalInSet = '<%="" + ( itemsInList )%>'
                                            tooManyHits = '<%="" + ( tooManyHits )%>'
                                            />
                                    </td>
                                    <td class="SmallColHeading tdAlignRight">
                                        <base:pageListOutput formName='<%=parentFormName%>' topOfPageLinks="false" displayTabs="<%=(wpeDisplayTabs != null ? wpeDisplayTabs.booleanValue() : false)%>"/>
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
                
