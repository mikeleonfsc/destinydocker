<%@page import="org.apache.struts.util.ResponseUtils"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.ejb.AssetTemplateAEDSpecs"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%@ page import="com.follett.fsc.destiny.client.common.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.PageCalculator" %>
<%@ page import="com.follett.fsc.destiny.util.*"%>
<%@ page import="com.follett.fsc.destiny.util.xml.AssetXML"%>
<%@ page import="com.follett.fsc.destiny.client.common.data.Tab" %>
<%@ page import="com.follett.fsc.common.*" %>
<%@ page import="com.follett.fsc.destiny.util.marc.*"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<bean:define id="searchOptions" name="<%= AddTitleSearchForm.FORM_NAME %>" property="searchOptions"/>
<bean:define id="searchMaterials" name="<%= AddTitleSearchForm.FORM_NAME %>" property="searchMaterials"/>
<bean:define id="sortOptions" name="<%= AddTitleSearchForm.FORM_NAME %>" property="sortOptions"/>

<base:messageBox strutsErrors="true"/>

<%
    AddTitleSearchForm form = (AddTitleSearchForm)request.getAttribute(AddTitleSearchForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    String focusControl = "";
    
    if (form.getTotalCount() == 0 || form.isInInitializeData()) {
        focusControl = AddTitleSearchForm.FIELD_KEYWORD_TEXT; // only set when we have no results
    }
    int itemsInList = form.getTotalCount(); // if nonzero, paint results
    int currentPage = PageCalculator.getCurrentPage(form);
    
%>
<!-- ONLY display the table if there was results passed -->

<base:form action="/cataloging/servlet/handleaddtitlesearchform.do" styleId="keywordSearch" focus="<%=focusControl%>">
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">

<html:hidden property="<%=AddTitleSearchForm.FIELD_COLLECTION_TYPE%>" value='<%= String.valueOf(form.getCollectionType()) %>' />
<html:hidden property="<%=AddTitleSearchForm.PARAM_PARENT_BIBID%>"/>
<html:hidden property="<%=AddTitleSearchForm.PARAM_BIB_WISHLIST_ID%>"/>
<html:hidden property="<%=AddTitleSearchForm.PARAM_SUPPLEMENT_STATUS%>"/>
<html:hidden property="<%=AddTitleSearchForm.FIELD_ORIGINAL_KEYWORD_TEXT%>"/>
<html:hidden property="<%=AddTitleSearchForm.FIELD_ASSET_TEMPLATE_TEXTBOOK%>"/>
<html:hidden property="<%=AddTitleSearchForm.FIELD_ASSET_TEMPLATE_TYPE_CHANGED%>"/>
<html:hidden property="action" value="<%= AddTitleSearchForm.ACTION_SEARCH %>"/>
<html:hidden property="lastSortType"  value="<%= form.getLastSortType() %>"/>
<html:hidden property="descend" value="<%= String.valueOf(form.isDescend()) %>" />
<html:hidden property="dateDescend" value="<%= String.valueOf(form.isDateDescend()) %>" />
<html:hidden property="flrEBooksOfferDisabled" value="true" />

        <logic:greaterThan name='<%= AddTitleSearchForm.FORM_NAME %>' property='<%= AddTitleSearchForm.PARM_TOTAL_COUNT %>' value="0">
            <html:hidden property="page" value='<%= "" + currentPage %>' />
            <html:hidden property="totalCount"/>
        </logic:greaterThan>
        
<%
Tab[] tabs = null;
if (form.getCollectionType() == CollectionType.LIBRARY ||
    form.getCollectionType() == CollectionType.ASSET) {
    tabs = form.getTabs();
}
%>

<base:outlinedTableAndTabsWithinThere id="<%=AddTitleSearchForm.TABLE_ADD_TITLE%>"  borderColor="#C0C0C0" selectedTab="<%=AddTitleSearchForm.ID_TAB%>" tabs="<%=tabs%>" >
<tr>
<td>
<%

    if (request.getAttribute("MyKeywordList") != null) {

        int itemsToSkip = PageCalculator.getFirstNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
        int itemsToPrint = PageCalculator.getOnePastLastNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
        boolean tooManyHits = form.isTooManyHits();

        // If we have results OR pending ZSearches, display a result.
        if (itemsInList > 0 || form.isZSearchesPending()) {
%>
            <table id='<%=BaseSearchResultsForm.TABLE_PAGING_HEADER%>' width="100%">
            <tr>
                <td class="ColRowBold" colspan="2">
                <logic:equal name='<%= AddTitleSearchForm.FORM_NAME %>' property="<%=AddTitleSearchForm.FIELD_COLLECTION_TYPE%>" value='<%="" + BibMasterSpecs.COLLECTION_TYPE_ASSET%>'>
                    <logic:equal name='<%= AddTitleSearchForm.FORM_NAME %>' property="<%=AddTitleSearchForm.FIELD_ASSET_TEMPLATE_TEXTBOOK%>" value="false">
                    <%=MessageHelper.formatMessage("addtitlesearch_SearchedForAssetNames", form.getSearchAssetTypeDescription(), form.getSearchOptionDescription(), form.getKeywordText()) %> 
                </logic:equal>
                    <logic:equal name='<%= AddTitleSearchForm.FORM_NAME %>' property="<%=AddTitleSearchForm.FIELD_ASSET_TEMPLATE_TEXTBOOK%>" value="true">
                     <%=MessageHelper.formatMessage("addtitlesearch_XWithTheYZ", form.getMaterialTypeDescription(), form.getSearchOptionDescription(), form.getKeywordText()) %>
                    </logic:equal> 
                </logic:equal>
                <logic:notEqual name='<%= AddTitleSearchForm.FORM_NAME %>' property="<%=AddTitleSearchForm.FIELD_COLLECTION_TYPE%>" value='<%="" + BibMasterSpecs.COLLECTION_TYPE_ASSET%>'>
                    <% if  (!form.isSearchAll()) { %>
                        <%=BibType.getBibTypeIcon(Integer.parseInt(form.getSearchMaterial()), false, null, null, form.getCollectionType(), null, null) %>
                    <% } %>
                     <%=MessageHelper.formatMessage("addtitlesearch_XWithTheYZ", form.getMaterialTypeDescription(), form.getSearchOptionDescription(), form.getKeywordText()) %>
                </logic:notEqual>
                </td>
                <td class="Instruction tdAlignRight">
                    <base:spanIfAllowed permission='<%=Permission.CAT_ADD_TITLES_AFTER_SEARCH%>'>
                        <%= MessageHelper.formatMessage("addtitlesearch_NothingMatches")%><br>
                        <base:genericButton src="<%=form.getNoSearchImage() %>" name="addTheTitle"/>
                    </base:spanIfAllowed>
                    <base:spanIfNotAllowed permission='<%=Permission.CAT_ADD_TITLES_AFTER_SEARCH%>'>
                        &nbsp;
                    </base:spanIfNotAllowed>
                </td>
            </tr>

            <logic:greaterThan name='<%= AddTitleSearchForm.FORM_NAME %>' property='<%= AddTitleSearchForm.PARM_TOTAL_COUNT %>' value="0">

                <tr>
                    <td>
                        <base:searchSummary searchType="<%=form.getSummaryPrefix()%>" startOfSet='<%="" + ( itemsToSkip + 1 ) %>'
                            endOfSet= '<%="" + ( itemsToPrint )%>'
                            totalInSet = '<%="" + ( itemsInList )%>'
                            tooManyHits = '<%= "" + ( tooManyHits ) %>'
                            />
                    </td>
                    <td align="center">
                        <span class="SmallColHeading"><%= MessageHelper.formatMessage("addtitlesearch_SortBy") %> </span>
                        <html:select property="<%=AddTitleSearchForm.COMBO_SORT%>" styleClass="SmallColRow">
                            <html:options collection="sortOptions" property="stringCode" labelProperty="stringDesc"/>
                        </html:select>
                        <base:genericButton src="/buttons/small/smallgo.gif" absbottom="true" alt='<%= MessageHelper.formatMessage("go") %>' name="<%=AddTitleSearchForm.ID_BUTTON_GO %>"/>
                    </td>
                    <td class="SmallColHeading tdAlignRight">
                        <base:pageListOutput formName="cataloging_servlet_AddTitleSearchForm" />
                    </td>
                </tr>

            </logic:greaterThan>

            </table> <!-- BaseSearchResultsForm.TABLE_PAGING_HEADER -->

            <logic:greaterThan name='<%= AddTitleSearchForm.FORM_NAME %>' property='<%= AddTitleSearchForm.PARM_TOTAL_COUNT %>' value="0">
                <base:imageLine height="2" width="100%"/>
                <table id="keywordTable" width="100%" cellspacing="0" cellpadding="4">
    <%
                    int sequence = 0;
    %>
                    <logic:iterate id="rec" name="<%= AddTitleSearchForm.FORM_NAME %>" property="list" type="com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord">
                        <%
                            String imgSrc = "/" + rec.getSourceTypeImageName();
                            String imgAlt = rec.getSourceTypeImageDescription();
                        %>
                        <tr>
                             <td class="ColRow" valign="top">
                                <base:titleImage rec="<%= rec %>" printerFriendly="<%= form.isPrinterFriendly() %>"/>
                            </td>
                            <td width="100%" valign="top" id="<%= (BaseSearchResultsForm.TABLE_HIT_LIST_ROW_INFO_CELL + sequence) %>" >
                                <table id="<%= (BaseSearchResultsForm.TABLE_HIT_LIST_ROW_INFO + sequence) %>" border="0" width="100%" cellpadding="0" cellspacing="0">
                                    <tr>
                                        <td class = "ColRowBold" colspan="3">
                                            <%= form.outputTitleAndDetail(request, response, rec) %>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td nowrap>
                                            <base:imageSpacer width="15" height="1"/>
                                            <base:image src="<%=imgSrc %>" alt="<%=imgAlt %>"/>
                                            <% if  (form.isSearchAll()) { %>
                                                <base:bibTypeIcon rec="<%= rec %>"></base:bibTypeIcon>
                                            <%   } %>
                                            <base:imageSpacer width="15" height="1"/>
                                        </td>
                                        <td class="ColRow" colspan="2" width="100%">
                                            <logic:notEqual name="rec" property="collectionType" value='<%=""+BibMasterSpecs.COLLECTION_TYPE_ASSET%>'>
                                                <bean:write name="rec" property="author" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                <bean:write name="rec" property="displayableLCCN" />&nbsp;&nbsp;&nbsp;&nbsp;
                                                <%=BibMasterSpecs.getDisplayableStandardNumberBasedOnLocale(rec.getDisplayableISBNOrISSN())%>&nbsp;&nbsp;
                                                <%if (rec.getReplacementPrice() != null) {%>
                                                    &nbsp;&nbsp;<%=lh.formatCurrency(rec.getReplacementPriceCurrencyValue(), LocaleHelper.CURRENCY_OPTION_DEFAULT) %>
                                                <%} %>
                                            </logic:notEqual>
                                            <logic:equal name="rec" property="collectionType" value='<%=""+BibMasterSpecs.COLLECTION_TYPE_ASSET%>'>
                                                <bean:write name="rec" property="assetTypeDescription"/>
                                            </logic:equal>
                                        </td>
                                    </tr>
                                    <% if (rec.getCollectionType() == CollectionType.ASSET) { %>
                                        <% if (AssetTemplateAEDSpecs.isTemplateForTextbooks(rec.getAssetTemplateID())) { %>
                                            <tr>
                                                <td>&nbsp;</td>
                                                <td class="ColRow" valign="top" width="100%">
                                                    <base:bibTypeIcon rec="<%=rec%>" printerFriendly="<%=form.isPrinterFriendly()%>"/>
                                                    &nbsp;
                                                    <%=SearchResultsOutputListRenderer.getFilteredString(rec.getAuthor(), false)%>
                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=SearchResultsOutputListRenderer.getFilteredString(BibMasterSpecs.getDisplayableStandardNumberBasedOnLocale(rec.getDisplayableISBNOrISSN()), true)%>
                                                    <% if (rec.getReplacementPrice() != null) { %>
                                                        &nbsp;&nbsp;<%=lh.formatCurrency(rec.getReplacementPriceCurrencyValue(), LocaleHelper.CURRENCY_OPTION_DEFAULT)%>
                                                    <% } %>
                                                </td>
                                            </tr>
                                            
                                            <% if(!StringHelper.isEmpty(rec.getPublisher()) || !StringHelper.isEmpty(rec.getPubYear()) || !StringHelper.isEmpty(rec.getEdition())) { %>
                                                <tr>
                                                    <td>&nbsp;</td>
                                                    <td class="ColRow">
                                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                        <% if ( !StringHelper.isEmpty(rec.getPublisher()) ) { %>
                                                            <%=ResponseUtils.filter(rec.getPublisher())%>&nbsp;
                                                        <% } %> 
                                                        <% if ( !StringHelper.isEmpty(rec.getPubYear()) ) { %>
                                                            <%=ResponseUtils.filter(rec.getPubYear())%>&nbsp;
                                                        <% } %> 
                                                        <% if ( !StringHelper.isEmpty(rec.getEdition()) ) { %>
                                                            <%=ResponseUtils.filter(rec.getEdition())%>
                                                        <% } %> 
                                                                
                                                    </td>
                                                </tr>
                                            <% } %>
                                            
                                            <% if (form.hasAdoptionInfo(rec)) { %>
                                                <tr>
                                                    <td>&nbsp;</td>
                                                    <td class="ColRow">
                                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                        <% if(!StringHelper.isEmpty(rec.getAdoptionState())) { %>
                                                            State Adopted: <%=ResponseUtils.filter(rec.getAdoptionState()) %>&nbsp;
                                                        <% } %>
                                                        <% if(!StringHelper.isEmpty(rec.getAdoptionDistrict())) { %>
                                                            District Adopted: <%=ResponseUtils.filter(rec.getAdoptionDistrict()) %>&nbsp;
                                                        <% } %>
                                                        <% if(!StringHelper.isEmpty(rec.getAdoptionEnds())) { %>
                                                            Adoption Ends: <%=ResponseUtils.filter(rec.getAdoptionEnds()) %>&nbsp;
                                                        <% } %>
                                                                
                                                    </td>
                                                </tr>
                                            <% } %>
                                            
                                            
                                            <%if (! StringHelper.isEmpty(rec.getStateTextID()) ||
                                                  ! StringHelper.isEmpty(rec.getGradeLevel())){ %>                                              
                                                <tr class="ColRow">
                                                    <td>&nbsp;</td>
                                                    <td width="100%">
                                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                        <%if (! StringHelper.isEmpty(rec.getStateTextID())) { %>
                                                            <%= MessageHelper.formatMessage("addtitlesearch_StateTextbookID", rec.getStateTextID()) %>&nbsp;
                                                       <% } %>
                                                       <%if (! StringHelper.isEmpty(rec.getGradeLevel())) { %>
                                                            <%= MessageHelper.formatMessage("addtitlesearch_Grades", rec.getGradeLevel()) %>
                                                       <% } %>
                                                    </td>
                                                </tr>
                                            <% } %>
                                            <%if (! StringHelper.isEmpty(rec.getAdditionalInfo())) { %>
                                                <tr class="ColRow">
                                                    <td>&nbsp;</td>
                                                    <td>
                                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                        <bean:write name="rec" property="additionalInfo" />
                                                    </td>
                                                </tr>
                                           <%} %>
                                            
                                        <% } %>
                                    
                                    <% } else if (! StringHelper.isEmpty(rec.getPublisher260a()) ||
                                          ! StringHelper.isEmpty(rec.getPublisher()) ||
                                          ! StringHelper.isEmpty(rec.getPubYear())   ||
                                          ! StringHelper.isEmpty(rec.getSourceName()) ||
                                          ! StringHelper.isEmpty(rec.getEdition()) ||
                                          ! StringHelper.isEmpty(rec.getExtent()) ||
                                          ! (rec.getTextbookSupplementStatus() == BibMasterSpecs.SUPPLEMENT_STATUS_TEACHERS_EDITION &&
                                              rec.getTextbookSupplementStatus() == BibMasterSpecs.SUPPLEMENT_STATUS_KIT)) { %>
                                        <tr>
                                            <td class="SmallColHeading" align="Center">
                                                <bean:write name="rec" property="sourceName" /><logic:notEmpty name="rec" property="sourceName">&nbsp;</logic:notEmpty>
                                            </td>
                                            <td class="ColRow" width="100%">
                                                <bean:write name="rec" property="publisher260a" /><logic:notEmpty name="rec" property="publisher260a">&nbsp;</logic:notEmpty>
                                                <bean:write name="rec" property="publisher" /><logic:notEmpty name="rec" property="publisher">&nbsp;</logic:notEmpty>
                                                <bean:write name="rec" property="pubYear" /><logic:notEmpty name="rec" property="pubYear">.</logic:notEmpty>&nbsp;
                                                <bean:write name="rec" property="edition" /><logic:notEmpty name="rec" property="edition">&nbsp;</logic:notEmpty>
                                                <bean:write name="rec" property="extent" />
                                            </td>
                                            <td class="ColRowBold tdAlignRight" NOWRAP>
                                                <% if (rec.getTextbookSupplementStatus() == BibMasterSpecs.SUPPLEMENT_STATUS_TEACHERS_EDITION) {%>
                                                    <%= MessageHelper.formatMessage("addtitlesearch_TeacherEdition") %>
                                                <% } else if (rec.getTextbookSupplementStatus() == BibMasterSpecs.SUPPLEMENT_STATUS_KIT) {%>
                                                    <%= MessageHelper.formatMessage("addtitlesearch_ResourceKit") %>
                                                <% } else { %>
                                                    &nbsp;
                                                <% } %>
                                             </td>   
                                        </tr>
                                    <% } %>
                                    <% if (rec.getCollectionType() != CollectionType.ASSET && form.hasAdoptionInfo(rec)) { %>
                                    <tr>
                                        <td>&nbsp;</td>
                                        <td>
                                        
                                            <table id="<%= (AddTitleSearchForm.TABLE_ROW_ADOPTION_INFO + sequence) %>" width="100%" cellspacing="0" cellpadding="0">
                                                <tr>
                                                    <td class="ColRow">
                                                        <%=form.getAdoptionColumn(0, rec) %>
                                                    </td>
                                                    <td class="ColRow">
                                                        <%=form.getAdoptionColumn(1, rec) %>
                                                    </td>
                                                    <td class="ColRow">
                                                        <%=form.getAdoptionColumn(2, rec) %>
                                                    </td>
                                                </tr>
                                            </table>
                                        </td>
                                        <td>&nbsp;</td>
                                    </tr>
                                    <% } %>
                                    <logic:notEqual name="rec" property="collectionType" value='<%=""+BibMasterSpecs.COLLECTION_TYPE_ASSET%>'>
                                        <%if (! StringHelper.isEmpty(rec.getStateTextID()) ||
                                              ! StringHelper.isEmpty(rec.getGradeLevel())){ %>                                              
                                            <tr class="ColRow">
                                                <td>&nbsp;&nbsp;</td>
                                                <td colspan="2" width="100%">
                                                    <%if (! StringHelper.isEmpty(rec.getStateTextID())) { %>
                                                        <%= MessageHelper.formatMessage("addtitlesearch_StateTextbookID", rec.getStateTextID()) %>&nbsp;
                                                   <% } %>
                                                   <%if (! StringHelper.isEmpty(rec.getGradeLevel())) { %>
                                                        <%= MessageHelper.formatMessage("addtitlesearch_Grades", rec.getGradeLevel()) %>
                                                   <% } %>
                                                </td>
                                            </tr>
                                        <% } %>
                                        <%if (! StringHelper.isEmpty(rec.getAdditionalInfo())) { %>
                                            <tr class="ColRow">
                                                <td>&nbsp;</td>
                                                <td>
                                                    <bean:write name="rec" property="additionalInfo" />
                                                </td>
                                            </tr>
                                       <%} %>
                                    </logic:notEqual>
                                </table>  <!-- BaseSearchResultsForm.TABLE_HIT_LIST_ROW_INFO -->
                            </td>
                            <td valign="top" id="<%= (BaseSearchResultsForm.TABLE_HIT_LIST_ROW_CONTROL_STATUS_CELL + sequence) %>" >
                                <table id="<%= (BaseSearchResultsForm.TABLE_HIT_LIST_ROW_CONTROL_STATUS + (sequence++)) %>" border="0" cellpadding="0" cellspacing="0">
                                  <tr><td><!-- placeholder --></td></tr>
                                </table>
                            </td>
                        </tr>
                        <tr>
                            <td width="100%" colspan="2">
                                <base:imageLine height="2" width="100%"/>
                            </td>
                        </tr>
                    </logic:iterate>

                <!-- end the table now... -->
                </table> <!-- keywordTable -->


            </logic:greaterThan>

            <logic:lessEqual name='<%= AddTitleSearchForm.FORM_NAME %>' property='<%= AddTitleSearchForm.PARM_TOTAL_COUNT %>' value="0">
                <table id="<%= AddTitleSearchForm.TABLE_NO_MATCHES %>" width="100%" cellspacing="0" cellpadding="4">
                    <tr>
                        <td class="ColRowBold" align="center">
                            <%= MessageHelper.formatMessage("addtitlesearch_NoMatchesSoFar") %>
                        </td>
                    </tr>
                </table> <!-- AddTitleSearchForm.TABLE_NO_MATCHES -->
            </logic:lessEqual>

            <table width="100%" cellspacing="0" cellpadding="4" id="<%= BaseSearchResultsForm.TABLE_PAGING_FOOTER %>">

            <logic:greaterThan name='<%= AddTitleSearchForm.FORM_NAME %>' property='<%= AddTitleSearchForm.PARM_TOTAL_COUNT %>' value="0">

                <tr>
                    <td>
                        <base:searchSummary searchType="<%=form.getSummaryPrefix()%>" startOfSet='<%="" + ( itemsToSkip + 1 ) %>'
                            endOfSet= '<%="" + ( itemsToPrint )%>'
                            totalInSet = '<%="" + ( itemsInList )%>'
                            tooManyHits = '<%="" + ( tooManyHits )%>'
                            />
                    </td>
                    <td class="SmallColHeading tdAlignRight">
                        <base:pageListOutput formName="cataloging_servlet_AddTitleSearchForm" topOfPageLinks="false" />
                    </td>
                </tr>

            </logic:greaterThan>

            <logic:equal name='<%= form.FORM_NAME %>' property="ZSearchesPending" value="true">
                <tr>
                    <td colspan="2" align="Center" class="ColRowBold">
                        <base:image src="/icons/general/zprogress.gif" alt='<%= MessageHelper.formatMessage("addtitlesearch_Searching") %>'/>
                        <%= MessageHelper.formatMessage("addtitlesearch_SearchingSources") %>&nbsp;&nbsp;&nbsp;
                        <base:genericButton src="/buttons/large/getzresults.gif" name="<%=AddTitleSearchForm.BUTTON_GET_Z_RESULTS%>" alt='<%= MessageHelper.formatMessage("getZresults") %>'/>
                    </td>
                </tr>
            </logic:equal>
            
        </table> <!-- BaseSearchResultsForm.TABLE_PAGING_FOOTER -->

<%
        }
    }
%>

<table id='<%=AddTitleSearchForm.TABLE_FOOTER%>' width="100%" border="0" cellpadding="0" cellspacing="0">
    <tr>
        <td>
            <table id='<%=AddTitleSearchForm.TABLE_FOOTER_SEARCH%>' border="0" cellspacing="0" cellpadding="2">
                <tr>
                    <logic:notEqual name="<%=AddTitleSearchForm.FORM_NAME%>" property="<%=AddTitleSearchForm.FIELD_COLLECTION_TYPE%>" value='<%= "" + BibMasterSpecs.COLLECTION_TYPE_ASSET%>'>    
                        <td class="FormLabel">
                           <%= MessageHelper.formatMessage("addtitlesearch_Find") %>
                        </td>
                        <td>
                            <html:select property="<%=AddTitleSearchForm.FIELD_SEARCH_MATERIAL%>">
                                <html:options collection="searchMaterials" property="stringCode" labelProperty="stringDesc"/>
                            </html:select>
                        </td>
                        <td class="ColRow">
                            <%= MessageHelper.formatMessage("addtitlesearch_With") %>
                        </td>
                        <td>
                            <html:select property="<%=AddTitleSearchForm.FIELD_SEARCH_OPTION%>">
                                <html:options collection="searchOptions" property="stringCode" labelProperty="stringDesc"/>
                            </html:select>
                        </td>
                        <td>           
                            <% if ((itemsInList > 0 || form.isZSearchesPending()) && form.getCollectionType() == CollectionType.TEXTBOOK) { %>  
                                <html:text property="<%=AddTitleSearchForm.FIELD_KEYWORD_TEXT%>" size="12"/>
                            <% } else { %>
                                <html:text property="<%=AddTitleSearchForm.FIELD_KEYWORD_TEXT%>" size="60"/>
                            <% } %>
                        
                        </td>
                        <td valign="bottom" class="ColRow">
                            <br><base:showHideTag id="onSave">
                                <base:goButton align="absbottom" onclick="hideElementonSave()" />
                            </base:showHideTag>
                        </td>
                    </logic:notEqual>
                    <logic:equal name="<%=AddTitleSearchForm.FORM_NAME%>" property="<%=AddTitleSearchForm.FIELD_COLLECTION_TYPE%>" value='<%= "" + BibMasterSpecs.COLLECTION_TYPE_ASSET%>'>    
                        <bean:define id="assets" name="<%= AddTitleSearchForm.FORM_NAME %>" property="assetTreeOptionList" />
                        <td>
                            <table id='<%=AddTitleSearchForm.TABLE_SUB_FOOTER_SEARCH%>' border="0" cellspacing="0" cellpadding="2">
                            <tr>
                                <td class="FormLabel tdAlignRight">
                                    <%= MessageHelper.formatMessage("addtitlesearch_FindAll") %>
                                </td>
                                <% if (form.getAssetTreeOptionList().size() > 1) { %>
                                    <td colspan="2">
                                    <table><tr><td>
                                        <html:select property="<%=AddTitleSearchForm.FIELD_ASSET_TYPE %>" onchange="submitOnTemplateChange()">
                                            <html:options collection="assets" property="longID" labelProperty="stringDesc"/>
                                        </html:select>
                                     </td></tr></table>
                                    </td>
                                <% } else { %>
                                    <td class="ColRow tdAlignLeft" colspan="2">
                                        <%= form.getAssetTreeOptionList().getString(0) %>
                                    </td>
                                <% } %>
                                
                            </tr>
                            <logic:equal name="<%=AddTitleSearchForm.FORM_NAME%>" property="<%=AddTitleSearchForm.FIELD_ASSET_TEMPLATE_TEXTBOOK%>" value="false">    
                            
                            <tr valign="top">
                                <td class="FormLabel tdAlignRight">
                                    <%= MessageHelper.formatMessage("addtitlesearch_WhereAssetName") %>
                                </td>
                                <td nowrap>
                                      <table><tr>
                                           <td  valign="top">
                                                <html:select property="<%=AddTitleSearchForm.FIELD_SEARCH_OPTION%>">
                                                    <html:options collection="searchOptions" property="stringCode" labelProperty="stringDesc"/>
                                                </html:select>                                  
                                                <html:text property="<%=AddTitleSearchForm.FIELD_KEYWORD_TEXT%>" maxlength="<%=String.valueOf(AssetXML.MAX_LENGTH_TEXT)%>" size="60"/>
                                           </td>
                                           <td valign="bottom" class="ColRow">
                                                <base:showHideTag id="onSave">
                                                    <base:goButton align="absbottom" onclick="hideElementonSave()" />
                                                </base:showHideTag>
                                            </td>
                                        </tr></table>
                                </td>
                                <td></td>
                            </tr>
                            </logic:equal>
                            <logic:equal name="<%=AddTitleSearchForm.FORM_NAME%>" property="<%=AddTitleSearchForm.FIELD_ASSET_TEMPLATE_TEXTBOOK%>" value="true">
                                <tr valign="top">
                                    <td>
                                        <html:select property="<%=AddTitleSearchForm.FIELD_SEARCH_MATERIAL%>">
                                            <html:options collection="searchMaterials" property="stringCode" labelProperty="stringDesc"/>
                                        </html:select>
                                        &nbsp;<span class="FormLabel"><%= MessageHelper.formatMessage("addtitlesearch_With") %></span>
                                    </td>
                                    <td>
                                        <html:select property="<%=AddTitleSearchForm.FIELD_SEARCH_OPTION%>">
                                            <html:options collection="searchOptions" property="stringCode" labelProperty="stringDesc"/>
                                        </html:select>
                                        &nbsp;
                                        <html:text property="<%=AddTitleSearchForm.FIELD_KEYWORD_TEXT%>" maxlength="<%=String.valueOf(AssetXML.MAX_LENGTH_TEXT)%>" size="60"/>
                                    </td>
                                    <td valign="bottom" class="ColRow">
                                        <base:showHideTag id="onSave">
                                            <base:goButton align="absbottom" onclick="hideElementonSave()" />
                                        </base:showHideTag>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="FormLabel tdAlignRight">
                                        &nbsp;
                                    </td>
                                    <td class="ColRow" valign="bottom" colspan="2" nowrap>
                                        <html:checkbox property="<%=AddTitleSearchForm.FIELD_LIMIT_TO_ADOPTION_BY_STATE%>"/>
                                        <%= MessageHelper.formatMessage("addtitlesearch_LimitTRecordsToThoseAdoptedByMyState", "<sup>2</sup>") %> 
                                    </td>
                                </tr>
                            
                            </logic:equal>    
                            </table>
                        </td>
                    </logic:equal>
                </tr>
                <% if (form.getCollectionType() == CollectionType.TEXTBOOK) {%>
                <tr>
                    <td class="FormLabel tdAlignRight">
                        &nbsp;
                    </td>
                    <td class="ColRow" valign="bottom" colspan="5" nowrap>
                        <html:checkbox property="<%=AddTitleSearchForm.FIELD_LIMIT_TO_ADOPTION_BY_STATE%>"/>
                        <%= MessageHelper.formatMessage("addtitlesearch_LimitTRecordsToThoseAdoptedByMyState", "<sup>2</sup>") %> 
                    </td>
                </tr>
                <% } %>
            </table> <!-- AddTitleSearchForm.TABLE_FOOTER_SEARCH -->
        </td>
        <%
            if (itemsInList > 0 || form.isZSearchesPending()) { 
        %>  
                <td class="Instruction tdAlignRight">
                    <base:spanIfAllowed permission='<%=form.getPermissionForAddTitleAfterSearch()%>'>
                        <%= MessageHelper.formatMessage("addtitlesearch_NothingMatches") %><br><base:genericButton src="<%=form.getNoSearchImage()%>" name="addTheTitle"/>
                    </base:spanIfAllowed>                
                    <base:spanIfNotAllowed permission='<%=Permission.CAT_ADD_TITLES_AFTER_SEARCH%>'>
                        &nbsp;
                    </base:spanIfNotAllowed>                    
                </td>
        <% } else { %>
                
                <% 
                Permission permission = form.getPermissionForAddTitleNoSearch();
                %>
                <base:spanIfAllowed permission='<%=permission%>'>
                    <td class="Instruction tdAlignRight">
                        <%= MessageHelper.formatMessage("addtitlesearch_Nonexistent") %><br><base:genericButton src="<%=form.getNoSearchImage()%>" name="<%=AddTitleSearchForm.ID_LINK_ADD_TITLE %>"/>
                    </td>
                </base:spanIfAllowed>
                <td class="tdAlignRight">
                    &nbsp;
                </td>
         <% } %>
    </tr>
        <logic:equal name="<%=AddTitleSearchForm.FORM_NAME%>" property="<%=AddTitleSearchForm.PARM_ADD_TITLE_BANNER_DISPLAYABLE%>" value="true">
            <tr>
                <td colspan="2">
                    <base:imageLine height="1" width="100%" vspace="6"/>
                </td>        
            </tr>
            <tr>
                <% if (!UserContext.getMyContextLocaleHelper().isInternationalProduct() && form.isAddTitleBannerDisplayable()) { %>
                <logic:notEqual name="<%=AddTitleSearchForm.FORM_NAME%>" property="<%=AddTitleSearchForm.FIELD_COLLECTION_TYPE%>" value='<%= "" + BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK%>'>
                    <td class="SmallFixed" align="center" colspan="2">
                        <%= MessageHelper.formatMessage("addtitlesearch_LookingForTitlesToSupportYourCurriculumCheckOut") %> <br>
                        <base:link target="titlewave" href="/common/servlet/presenttitlewaveredirectform.do" id="<%=AddTitleSearchForm.ID_LINK_TITLEWAVE %>"><base:image src="/icons/general/FLRbanner.gif" alt='<%= MessageHelper.formatMessage("addtitlesearch_Titlewave") %>' vspace="1"/> </base:link>
                    </td>
                </logic:notEqual>
                <% } %>
    
                <logic:equal name="<%=AddTitleSearchForm.FORM_NAME%>" property="<%=AddTitleSearchForm.FIELD_COLLECTION_TYPE%>" value='<%= "" + BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK%>'>
                    <td class="SmallFixed" align="center" colspan="2">
                       <%= MessageHelper.formatMessage("addtitlesearch_LookingForTitlesToSupportYourCurriculumCheckOut") %><br>
                        <base:link target="titlewave" href="<%=form.getFESTextbookURL()%>" id="<%=AddTitleSearchForm.ID_LINK_FES %>"><base:image src="/icons/general/fesbanner.png" alt='<%= MessageHelper.formatMessage("addtitlesearch_FollettEducationalServices") %>' vspace="1"/> </base:link>
                    </td>
                </logic:equal>
            </tr>
            
            <%if ( store.canDo(Permission.DISTRICT_VIEW_ACCESS_ONLINE_STORE) && DestinySystemProperties.isShowOnlineStore() && !UserContext.getMyContextLocaleHelper().isInternationalProduct()){ %>
                <tr><td class="ColRow"> &nbsp; </td></tr>
                <tr>
                   <td class="SmallFixed" align="center" colspan="2">
                       <base:link page="<%=GenericForm.gimmeECommerceLink(store)%>" target="_blank" id="<%=AddTitleSearchForm.ID_LINK_SHOPFOLLETTSOFTWARE %>">
                          <base:image src="/icons/general/DestinyExpress.gif"  alt='<%= MessageHelper.formatMessage("addtitlesearch_ShopFollettSoftware") %>' align="absbottom"/>
                       </base:link>
                   </td>
                </tr>
            <%}%>
            
        </logic:equal>
        <logic:equal name="<%=AddTitleSearchForm.FORM_NAME%>" property="<%=AddTitleSearchForm.PARM_ADD_TITLE_BANNER_DISPLAYABLE%>" value="false">
        <tr><td> &nbsp; </td></tr>
        </logic:equal>
    
</table> <!-- AddTitleSearchForm.TABLE_FOOTER -->

</td>
</tr>
</base:outlinedTableAndTabsWithinThere>
</base:form>

<script language="JavaScript" type="text/javascript">
<!--
function submitOnTemplateChange() {
    document.<%=AddTitleSearchForm.FORM_NAME%>.<%=AddTitleSearchForm.FIELD_ASSET_TEMPLATE_TYPE_CHANGED%>.value = "true";
    document.<%=AddTitleSearchForm.FORM_NAME%>.submit();
}

//-->
</script>

<%-- dump out any -++ failure messages so AT's can look for them as well as customer support --%>
<!-- <%=request.getSession().getAttribute(AddTitleSearchForm.ATTR_ALLIANCE_SEARCH_MESSAGE)%> -->

