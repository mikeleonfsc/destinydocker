<%@page import="com.follett.fsc.destiny.util.marc.BibType"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c"%>


<%@ page import="com.follett.fsc.destiny.client.common.data.*"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.data.*"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.jsptag.SearchLookinTag"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.SiteTypeSpecs" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.SearchHistorySpecs"%>

<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="java.util.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%
    BasicSearchForm form = (BasicSearchForm)request.getAttribute( BasicSearchForm.FORM_NAME );
//    int currentPage = PageCalculator.getCurrentPage(form);

    List keywordList = (List) request.getAttribute("MyKeywordList");
    boolean haveResults = (keywordList != null) && (keywordList.size() > 0);

    boolean displaySearchCriteria = false;
    if ((keywordList == null && !form.isUserClickedKeywordsTab()) || form.isRedisplay()) {
        displaySearchCriteria = true;
    }

    String focusControl = BasicSearchForm.FIELD_KEYWORD_TEXT;

    if ( !displaySearchCriteria || haveResults) {
        // we don't want to focus on anything in the form if we've got results or if we aren't displaying search criteria
        focusControl = "";
    }

    request.setAttribute("parentFormName", "cataloging_servlet_BasicSearchForm");
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
%>

<bean:define id="readingProgramOptions" type="java.util.Collection" name="<%= BasicSearchForm.FORM_NAME %>" property="<%= BasicSearchForm.PARAM_READING_PROGRAM_OPTIONS %>"/>
<bean:define id="lexileCodeList" name="<%=BasicSearchForm.FORM_NAME%>" property="lexileCodeList"/>
<bean:define id="fountasAndPinnellList" name="<%=BasicSearchForm.FORM_NAME%>" property="fountasAndPinnellList"/>
<bean:define id="interestGradeLevelList" name="<%=BasicSearchForm.FORM_NAME%>" property="interestGradeLevelList"/>
<bean:define id="materialTypesID" name="<%=BasicSearchForm.FORM_NAME%>"property="materialTypes" />
<base:messageBox strutsErrors="true"/>

<script language="JavaScript" type="text/javascript">
  <!--
    function submitDropDown() {
        document.<%=BasicSearchForm.FORM_NAME%>.<%=BasicSearchForm.PARAM_NAME_REDISPLAY%>.value = "true";
        document.<%=BasicSearchForm.FORM_NAME%>.submit();
    }
  
    function showMore() {
	    document.<%=BasicSearchForm.FORM_NAME%>.<%=BaseSearchResultsForm.PARAM_SHOW_LIMITER_OPTIONS%>.value = "true";
        document.<%=BasicSearchForm.FORM_NAME%>.<%=BasicSearchForm.PARAM_NAME_REDISPLAY%>.value = "true";
	    document.<%=BasicSearchForm.FORM_NAME%>.submit();
	}
  
    function showLess() {
	    document.<%=BasicSearchForm.FORM_NAME%>.<%=BaseSearchResultsForm.PARAM_SHOW_LIMITER_OPTIONS%>.value = "false";
        document.<%=BasicSearchForm.FORM_NAME%>.<%=BasicSearchForm.PARAM_NAME_REDISPLAY%>.value = "true";
	    document.<%=BasicSearchForm.FORM_NAME%>.submit();
	}
  
  // -->
</script>

<base:form action="/cataloging/servlet/handlebasicsearchform.do" styleId="keywordList" focus="<%=focusControl%>">
<html:hidden property="<%=BasicSearchForm.PARAM_SEARCH_TYPE%>"/>
<input type="hidden" name="<%=BasicSearchForm.PARAM_NAME_REDISPLAY%>" value="false"/>
<html:hidden property="<%=BaseSearchResultsForm.PARAM_SHOW_LIMITER_OPTIONS %>"/>
<html:hidden property="<%=BaseSearchResultsForm.PARAM_DIGITAL_CONTENT_MODE %>"/>

<% if (!form.isRedisplay()) { %>
<jsp:include page="/cataloging/basesearchresults.jsp" flush="true" />
<% } %>


<%--- If do not have a result list (or if the user specifically clicked keyword tab)
     then we will allow the user to search --%>
<% if (!displaySearchCriteria) {
 %>
    <html:hidden property="keywordText"/>
    <html:hidden property="siteTypeID"/>
    <html:hidden property="siteID"/>
    <html:hidden property="<%=BaseSearchResultsForm.FIELD_INCLUDE_LIBRARY %>"/>
    <html:hidden property="<%=BaseSearchResultsForm.FIELD_INCLUDE_MEDIA %>"/>
    <html:hidden property="<%=BaseSearchResultsForm.FIELD_MEDIA_SITE_ID %>"/>
    <html:hidden property="<%= BasicSearchForm.FIELD_READING_PROGRAM_TYPE %>"/>
    <html:hidden property="<%= BasicSearchForm.FIELD_READING_LEVEL_FROM %>"/>
    <html:hidden property="<%= BasicSearchForm.FIELD_READING_LEVEL_TO %>"/>
    <html:hidden property="<%= BasicSearchForm.FIELD_POINT_VALUE_FROM %>"/>
    <html:hidden property="<%= BasicSearchForm.FIELD_POINT_VALUE_TO %>"/>
    <html:hidden property="<%= BasicSearchForm.FIELD_LEXILE_FROM %>"/>
    <html:hidden property="<%= BasicSearchForm.FIELD_LEXILE_TO %>"/>
    <html:hidden property="<%= BasicSearchForm.FIELD_FOUNTAS_AND_PINNELL_FROM %>"/>
    <html:hidden property="<%= BasicSearchForm.FIELD_FOUNTAS_AND_PINNELL_TO %>"/>
    <html:hidden property="<%= BasicSearchForm.FIELD_READING_GRADE_LEVEL_FROM %>" />
    <html:hidden property="<%= BasicSearchForm.FIELD_READING_GRADE_LEVEL_TO %>" />
    <html:hidden property="<%= BasicSearchForm.FIELD_INTEREST_GRADE_LEVEL_FROM %>" />
    <html:hidden property="<%= BasicSearchForm.FIELD_INTEREST_GRADE_LEVEL_TO %>" />
    <html:hidden property="<%= BasicSearchForm.FIELD_LEXILE_CODE %>"/>
    <html:hidden property="<%= BasicSearchForm.FIELD_AWARD_GROUP %>"/>
    <html:hidden property="<%= BasicSearchForm.FIELD_AWARD_NAME %>"/>
    <html:hidden property="<%= BasicSearchForm.FIELD_MATERIAL_TYPE %>"/>    
    <html:hidden property="<%= BasicSearchForm.FIELD_SEARCH_ONLY_FOLLETT_SHELF %>"/>    
    
    <!-- show the search criteria  -->
<% } else {  
       int numberOfButtons = form.getButtonOrder().size();
       //Colspan is invalid if its zero dude
       int colSpan = (numberOfButtons == 0 ? 1 : numberOfButtons);
    %>
    <base:outlinedTableWithTabsForBaseSearch id="<%=AdvancedSearchRedirectorForm.TABLE_LIBRARY_SEARCH_TABS%>"  
    borderColor="#C0C0C0" selectedTab='<%=BasicSearchForm.ID_TAB_BASIC_SEARCH%>' 
    tabs="<%=(Tab[])store.getAdvanceSearchTabArray()%>" 
    top10Link="<%=form.getTopTenTitles()%>" 
    searchGroup="<%=new Integer(SearchHistorySpecs.SEARCH_GROUP_LIBRARY) %>" >
    <tr>   
         <td>
              <!-- Start of the search criteria table -->
              <table id="<%= BasicSearchForm.TABLE_SEARCH_CRITERIA %>" border="0" cellpadding="0" cellspacing="0" align="center">
                <tr align="center">
                            <td class="FormLabel" align="center" colspan="<%= colSpan %>">
                            <table id="<%= BasicSearchForm.TABLE_SEARCH_PROMPT %>" cellpadding="2" align="center" cellspacing="0" border="0">
                            <tr>
            <td class="TableHeading tdAlignRight">
                    <%      String text = form.getKeywordText();
                            if ( text.length() > 0) { %>
                <a name="refinesearch"></a><%= MessageHelper.formatMessage("basicsearch_RefineSearch") %>&nbsp;
    <%      } else { %><%= MessageHelper.formatMessage("basicsearch_Find") %>&nbsp;
                    <%      }  %>
                            </td>
                            <td>
                        <html:text property="<%= BasicSearchForm.FIELD_KEYWORD_TEXT %>" size="70" maxlength="500"/>
                    </td>
                    <td>
                        <base:link title='<%=MessageHelper.formatMessage("basicsearch_ResetAll") %>' cssClass="ColRow" id="searchPromptResetControl" href='<%="/cataloging/servlet/presentbasicsearchform.do?" + BasicSearchForm.PARAM_RESET_LIMITERS + "=true" %>' >
                            <base:image alt='<%=MessageHelper.formatMessage("basicsearch_ResetAll") %>' src="/icons/general/reset.gif"/>
                            <%=MessageHelper.formatMessage("basicsearch_ResetAll") %>     
                        </base:link> 
                    </td>
                </tr>
             </table>            
             <!-- End of the search criteria table -->
        </td>
    </tr>
    <tr>
        <td colspan="<%= colSpan %>" class="ColRow">&nbsp;</td>
    </tr>
        <logic:equal name="<%= BasicSearchForm.FORM_NAME %>" property="districtCataloger" value="true">
            <!-- I am a district cataloger -->
            <html:hidden property="<%= BasicSearchForm.FIELD_SITE_TYPE_ID %>" value="<%= SiteTypeSpecs.SITE_TYPE_ID_ALL_LIBRARIES.toString() %>" />
        </logic:equal>
    <tr align="center">
        <logic:iterate id="button" name="<%=BasicSearchForm.FORM_NAME%>" property="buttonOrder" type="com.follett.fsc.destiny.client.cataloging.data.BasicSearchButtonOrderVO">
            <td>
                    <base:genericButton src='<%="/buttons/large/" + button.getImageName()%>' alt="<%=button.getAltText()%>" name="<%=button.getButtonName()%>"/>
            </td>
        </logic:iterate>
        <%-- If there are no buttons (possible), spit out blank td's --%>
        <% if (numberOfButtons == 0){ %>
            <td>&nbsp;</td>
        <% } %>
    </tr>                 
    <!-- Narrowing Limiters -->
    <tr>
        <td colspan="<%= colSpan %>">
                <div id="narrowSearch">
                    <div class="narrowSearchHeader">                                   
                        <span class="showMoreLessControl">
                            <logic:equal name="<%= BasicSearchForm.FORM_NAME %>" property="<%=BaseSearchResultsForm.PARAM_SHOW_LIMITER_OPTIONS%>" value="true">
                                <base:link title='<%=MessageHelper.formatMessage("basicsearch_ShowLess") %>' id="<%=BasicSearchForm.ID_LINK_SHOW_LESS %>" cssClass="SmallColRow" href="#" onclick="showLess()">
                                    <%=MessageHelper.formatMessage("basicsearch_ShowLess") %>
                                    <base:image alt='<%=MessageHelper.formatMessage("basicsearch_ShowLess") %>' src="/icons/general/arrow_tri_up.gif"/>                                
                                </base:link>                                                                
                            </logic:equal>
                            <logic:equal name="<%= BasicSearchForm.FORM_NAME %>" property="<%=BaseSearchResultsForm.PARAM_SHOW_LIMITER_OPTIONS%>" value="false">
                                <base:link title='<%=MessageHelper.formatMessage("basicsearch_ShowMore") %>' id="<%=BasicSearchForm.ID_LINK_SHOW_MORE %>" cssClass="SmallColRow" href="#" onclick="showMore()">
                                    <%=MessageHelper.formatMessage("basicsearch_ShowMore") %>
                                    <base:image alt='<%=MessageHelper.formatMessage("basicsearch_ShowMore") %>' src="/icons/general/arrow_tri_down.gif"/>
                                </base:link>  
                            </logic:equal>                                
                        </span>                        
                        <h3 class="ColRowBold">         
                            <%=MessageHelper.formatMessage("basicsearch_NarrowYourSearchTo") %>
                        </h3> 
                    </div>     
          
                    <% if (form.hasLimiterChanges()) { %>
                    
                        <div class="ColRow narrowSearchMessaging">
                            <em>
                                <base:image src="/icons/general/exclamation-octagon-frame.png"/>&nbsp;
                                <%=MessageHelper.formatMessage("basicsearch_LimitersHaveBeenSet") %>
                            </em>
                        </div>
                    <% } %>
                    <% String style="display:none"; %>
                    <logic:equal name="<%= BasicSearchForm.FORM_NAME %>" property="<%=BaseSearchResultsForm.PARAM_SHOW_LIMITER_OPTIONS%>" value="true">                    
                        <% style="display:block"; %>
                    </logic:equal>
                    <table id="hidderTable" width="99%">
                    <tr>
                    <td style="<%=style %>">                 
                        <table id="<%= BasicSearchForm.TABLE_NARROWING_LIMITERS %>" cellpadding="0" cellspacing="0" align="center">  
                                <tr>
                                    <td colspan="<%= colSpan %>">
                                       <base:searchLookin 
                                        parentForm="<%=form%>"
                                        showLineAboveLookin="false"  
                                        renderForAdvancedSearch="false"/>
                                    </td>
                                </tr>
                                
                                <tr>
                                    <td colspan="<%= colSpan %>" align="center">
                                        <table id="<%=BasicSearchForm.TABLE_SEARCH_MATERIAL_TYPE%>" border="0" cellpadding="3" style="border-collapse: collapse">
                                            <tr>
                                                <td align="center" class="ColRowBold" nowrap>
                                                <%=MessageHelper.formatMessage("basicsearch_MaterialType") %>
                                                </td>
                                                <td>
                                                     <html:select
                                                        property="<%= AdvancedSearchForm.FIELD_MATERIAL_TYPE%>" onchange="submitDropDown()" >
                                                        <html:options
                                                            collection="materialTypesID"
                                                            property="stringCode"
                                                            labelProperty="stringDesc"
                                                            
                                                             />
                                                     </html:select>
                                                </td>
                                                <td>&nbsp;</td>
                                            </tr>
                                            <% if ((form.getMaterialType() == BibType.BIBTYPE_EBOOK || form.getMaterialType() == BibType.BIBTYPE_RECORDING_NON_MUSICAL) && form.isFollettShelfIntegrated()){ %>
                                                <tr>
                                                <td>&nbsp;</td>
                                                <td class="ColRowBold">
                                                <html:checkbox property="<%=AdvancedSearchForm.FIELD_SEARCH_ONLY_FOLLETT_SHELF%>"/>
                                                <% if (form.getMaterialType() == BibType.BIBTYPE_EBOOK){ %>
                                                <%=MessageHelper.formatMessage("basicsearch_LimitToFolletteBooks") %> 
                                                <% } else if (form.getMaterialType() == BibType.BIBTYPE_RECORDING_NON_MUSICAL) {%>
                                                <%=MessageHelper.formatMessage("basicsearch_LimitToFollettAudiobooks") %> 
                                                    <%} %>
                                                </td>
                                                </tr>
                                            <%} %>
                                        </table>
                                    </td>
                                </tr>                     
                                <base:selectAward awardGroupID="<%=form.getAwardGroupID()%>" awardNameID="<%=form.getAwardNameID()%>" onchange="submitDropDown()" fromBasicSearch="true" colSpan="<%=colSpan%>" helpFileName="d_find_award_winning_books.htm" />
                                    <% if ( form.getStore().isAllowReadingLevelAndInterestLevelSearches() ) { %>
                                        <tr>
                                            <td colspan="<%= colSpan %>" align="center">
                                                <table id="<%=BasicSearchForm.TABLE_READING_GRADE_LEVEL%>" border="0" cellpadding="3" style="border-collapse: collapse">
                                                    <tr>
                <td align="center" class="ColRowBold"><%= MessageHelper.formatMessage("basicsearch_ReadingLevel") %></td>
                                                        <td valign="bottom" colspan="2" class="ColRow">
                    <%=MessageHelper.formatMessage("basicsearch_From")%>&nbsp;<html:text property="<%= BasicSearchForm.FIELD_READING_GRADE_LEVEL_FROM %>" size="5" maxlength="4"/>
                    &nbsp;<%=MessageHelper.formatMessage("basicsearch_To")%>&nbsp;<html:text property="<%= BasicSearchForm.FIELD_READING_GRADE_LEVEL_TO %>" size="5" maxlength="4"/>
                                                        </td>            
                                                    </tr>
                                                </table>
                                            </td>
                                        </tr>            

                                        <tr>
                                            <td colspan="<%= colSpan %>" align="center">
                                                <table id="<%=BasicSearchForm.TABLE_INTEREST_GRADE_LEVEL%>" border="0" cellpadding="3" style="border-collapse: collapse">
                                                    <tr>
                                                        <td align="center" class="ColRowBold" nowrap>
                                                        <%=MessageHelper.formatMessage("basicsearch_InterestLevel") %>
                                                        </td>
                                                        <td class="ColRow">
                                                            <%=MessageHelper.formatMessage("basicsearch_From") %>&nbsp;
                                                            <html:select property="<%= BasicSearchForm.FIELD_INTEREST_GRADE_LEVEL_FROM %>">
                                                            <html:options collection="interestGradeLevelList" property="longID"
                                                                labelProperty="stringDesc"/>
                                                            </html:select>
                                                            &nbsp;<%=MessageHelper.formatMessage("basicsearch_To") %>&nbsp;
                                                            <html:select property="<%= BasicSearchForm.FIELD_INTEREST_GRADE_LEVEL_TO %>">
                                                            <html:options collection="interestGradeLevelList" property="longID"
                                                                labelProperty="stringDesc"/>
                                                            </html:select>&nbsp;&nbsp;<base:helpTag helpFileName="d_find_titles_reading_interest_levels.htm"/>
                                                        </td>
                                                    </tr>
                                                </table>
                                            </td>
                                        </tr>

                                    <% } %>                     
             
        <% if (readingProgramOptions.isEmpty() || LocaleHelper.isInternationalProduct()) { %>
                                        <html:hidden property="<%= BasicSearchForm.FIELD_READING_PROGRAM_TYPE %>" value='<%= "" + BasicSearchForm.READING_PROGRAM_NONE %>'/>
                                    <% } else { %>                     
                                            <tr>
                                                <td colspan="<%= colSpan %>" align="center">                                     
                                                    <table id="<%=BasicSearchForm.TABLE_READING_PROGRAM_LEXILE%>" border="0" cellpadding="3" style="border-collapse: collapse">
                                                        <tr>
                            <td align="center" class="ColRowBold" nowrap><%= MessageHelper.formatMessage("basicsearch_ReadingPrograms") %></td>
                                                            <td>
                                                                <html:select property="<%= BasicSearchForm.FIELD_READING_PROGRAM_TYPE %>" onchange="submitDropDown()">
                                                                    <html:options collection="readingProgramOptions" property="longID" labelProperty="stringDesc"/>
                                                                </html:select>
                                                            </td>
                                                            <td>
                            <base:image src="/icons/general/readingprogrambasic.gif" width="80" height="38" align="absbottom" />
                                                            &nbsp;<base:helpTag helpFileName="t_find_books_in_reading_programs.htm"/></td>
                                                        </tr>     
            <!-- BEGINNING OF READING PROGRAM IF LOOP -->                                                                
            <% if (form.getReadingProgramType() == BasicSearchForm.READING_PROGRAM_AR || form.getReadingProgramType() == BasicSearchForm.READING_PROGRAM_RC) {  %> 
                <tr>
                    <% if (form.getReadingProgramType() == BasicSearchForm.READING_PROGRAM_AR) { %>
                                     <td class="ColRowBold tdAlignRight" valign="bottom"><%= MessageHelper.formatMessage("basicsearch_ARLevel") %></td>
                     <%} else {%>
                                      <td class="ColRowBold tdAlignRight" valign="bottom"><%= MessageHelper.formatMessage("basicsearch_RCLevel") %></td>
                     <%} %>
                    <td valign="bottom" colspan="2" class="ColRow">
                                    <%= MessageHelper.formatMessage("basicsearch_From") %>&nbsp;<html:text property="<%= BasicSearchForm.FIELD_READING_LEVEL_FROM %>" size="5"/>
                                    &nbsp;<%= MessageHelper.formatMessage("basicsearch_To") %>&nbsp;<html:text property="<%= BasicSearchForm.FIELD_READING_LEVEL_TO %>" size="5"/>
                    </td>
                </tr>
                <tr>
                                <td class="ColRowBold tdAlignRight" valign="bottom"><%= MessageHelper.formatMessage("basicsearch_PointValue") %></td>
                    <td valign="bottom" colspan="2" class="ColRow">
                                    <%= MessageHelper.formatMessage("basicsearch_From") %>&nbsp;<html:text property="<%= BasicSearchForm.FIELD_POINT_VALUE_FROM %>" size="5"/>
                                    &nbsp;<%= MessageHelper.formatMessage("basicsearch_To") %>&nbsp;<html:text property="<%= BasicSearchForm.FIELD_POINT_VALUE_TO %>" size="5"/>
                    </td>
                </tr>
            <% } else if (form.getReadingProgramType() == BasicSearchForm.READING_PROGRAM_LEXILE) { %>
                <tr>
                                <td class="ColRowBold tdAlignRight" valign="bottom"><%= MessageHelper.formatMessage("basicsearch_LexileMeasure") %></td>
                    <td valign="bottom" colspan="2" class="ColRow">
                                    <%= MessageHelper.formatMessage("basicsearch_From") %>&nbsp;<html:text property="<%= BasicSearchForm.FIELD_LEXILE_FROM %>" size="5" maxlength="4"/>
                                    &nbsp;<%= MessageHelper.formatMessage("basicsearch_To") %>&nbsp;<html:text property="<%= BasicSearchForm.FIELD_LEXILE_TO %>" size="5" maxlength="4"/>
                    </td>
                </tr>
                <tr>
                                <td class="ColRowBold tdAlignRight" valign="bottom">&nbsp;</td>
                    <td valign="bottom" colspan="2" class="ColRow">
                    <html:select property="<%= BasicSearchForm.FIELD_LEXILE_CODE %>">
                        <html:options collection="lexileCodeList" property="stringCode"
                                      labelProperty="stringDesc"/>
                    </html:select>
                    </td>
                </tr>
            <% } else if (form.getReadingProgramType() == BasicSearchForm.READING_PROGRAM_FOUNTAS_AND_PINNELL) {  %>
                <tr>
                                <td class="ColRowBold tdAlignRight" valign="bottom"><%= MessageHelper.formatMessage("basicsearch_FountasPinnell") %></td>
                    <td valign="bottom" colspan="2" class="ColRow">
                                <%= MessageHelper.formatMessage("basicsearch_From") %>&nbsp;
                    <html:select property="<%= BasicSearchForm.FIELD_FOUNTAS_AND_PINNELL_FROM %>">
                        <html:options collection="fountasAndPinnellList" property="stringCode"
                                      labelProperty="stringDesc"/>
                    </html:select>
                                &nbsp;<%= MessageHelper.formatMessage("basicsearch_To") %>&nbsp;
                    <html:select property="<%= BasicSearchForm.FIELD_FOUNTAS_AND_PINNELL_TO %>">
                        <html:options collection="fountasAndPinnellList" property="stringCode"
                                      labelProperty="stringDesc"/>
                    </html:select>
                    </td>
                </tr>
            <% } %>
            <!-- END OF READING PROGRAM IF LOOP -->
                                    </table> <!-- TABLE_READING_PROGRAM_LEXILE -->                
                                </td>
                            </tr>                     
                        <% } %>                     
                </table>  <!-- TABLE_NARROWING_LIMITERS -->
                </td>
                </tr>
                </table> <!--  hidder table -->                  
            </div>                 
        </td>
    </tr>
    </table> <!--  end of BasicSearchForm.TABLE_SEARCH_CRITERIA  -->            
    </base:outlinedTableWithTabsForBaseSearch>
<% } %><!-- if display search criteria --> 

</base:form>
