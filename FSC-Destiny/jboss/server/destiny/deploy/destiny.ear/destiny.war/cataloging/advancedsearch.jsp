<%@page import="com.follett.fsc.destiny.util.marc.BibType"%>
<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>


<%@ page import="com.follett.fsc.destiny.client.common.data.*"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.session.common.*"%>
<%@ page import="com.follett.fsc.destiny.entity.AdvancedSearchQueryData"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.SiteTypeSpecs"%>
<%@ page import="com.follett.fsc.destiny.util.Permission"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.SearchHistorySpecs"%>
<%@ page import="java.util.*"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<bean:define id="powerSearchTypes" name="<%=AdvancedSearchForm.FORM_NAME%>" property="powerSearchTypesList" />
<bean:define id="advancedSearchOptions1" name="<%=AdvancedSearchForm.FORM_NAME%>" property="advancedSearchOptions1" />
<bean:define id="advancedSearchOptions2" name="<%=AdvancedSearchForm.FORM_NAME%>" property="advancedSearchOptions2" />
<bean:define id="advancedSearchOptions3" name="<%=AdvancedSearchForm.FORM_NAME%>" property="advancedSearchOptions3" />
<bean:define id="lexileCodeList" name="<%=AdvancedSearchForm.FORM_NAME%>" property="lexileCodeList" />
<bean:define id="fountasAndPinnellList" name="<%=AdvancedSearchForm.FORM_NAME%>" property="fountasAndPinnellList"/>
<bean:define id="materialTypesID" name="<%=AdvancedSearchForm.FORM_NAME%>" property="materialTypes" />
<bean:define id="subTypesID" name="<%=AdvancedSearchForm.FORM_NAME%>" property="subTypesList" />
<bean:define id="pubYearLimitersID" name="<%=AdvancedSearchForm.FORM_NAME%>" property="pubYearLimiters" />
<bean:define id="interestGradeLevelList" name="<%=AdvancedSearchForm.FORM_NAME%>" property="interestGradeLevelList"/>



<%AdvancedSearchForm form = (AdvancedSearchForm) request.getAttribute("cataloging_servlet_AdvancedSearchForm");
            SessionStoreProxy store = SessionStoreProxy.getSessionStore(
                session, request);
            List keywordList = (List) request.getAttribute("MyKeywordList");
            String focus = "";
            boolean haveResults = false;
            if (keywordList != null) {
                haveResults = (keywordList.size() > 0);
                if (!haveResults) {
                    focus = AdvancedSearchForm.FIELD_SEARCH_TERM_1;
                     if (!form.displayWebSitesTab() && !form.areThereAnyDigitalMediaTitles() && !form.isIncludeOnlineResources()) { %>
<table id='<%=BaseSearchResultsForm.TABLE_PAGING_HEADER%>' width="100%">
    <tr>
        <td class="ColRowBold"><bean:write
            name="cataloging_servlet_AdvancedSearchForm"
            property="searchDescription" /></td>
    </tr>
</table>
<%                  }
                }
            } else {
                // no keyword list (first came to screen)
                focus = AdvancedSearchForm.FIELD_SEARCH_TERM_1;
            }
            %>

<base:messageBox strutsErrors="true" />

<bean:define id="readingProgramOptions" type="java.util.Collection"
    name="<%= AdvancedSearchForm.FORM_NAME %>"
    property="<%= AdvancedSearchForm.PARAM_READING_PROGRAM_OPTIONS %>" />

<script language="JavaScript" type="text/javascript">
  <!--
    function submitDropDown() {
        document.<%=AdvancedSearchForm.FORM_NAME%>.<%=AdvancedSearchForm.PARAM_NAME_REDISPLAY%>.value = "true";
        document.<%=AdvancedSearchForm.FORM_NAME%>.submit();
    }

    function submitOneSearch() {
        document.<%=AdvancedSearchForm.FORM_NAME%>.<%=AdvancedSearchForm.PARAM_NAME_REDISPLAY%>.value = "true";
        document.<%=AdvancedSearchForm.FORM_NAME%>.<%=AdvancedSearchForm.PARAM_ONE_SEARCH_ANCHOR%>.value = "true";
        document.<%=AdvancedSearchForm.FORM_NAME%>.submit();
    }
  // -->
</script>

<base:form action="/cataloging/servlet/handleadvancedsearchform.do"
    focus="<%=focus%>">
    <input type="hidden" name="<%=AdvancedSearchForm.PARAM_NAME_REDISPLAY%>" value="false" />
    <input type="hidden" name="<%=AdvancedSearchForm.PARAM_ONE_SEARCH_ANCHOR%>" value="false" />
    <html:hidden property="<%=AdvancedSearchForm.PARAM_PREV_READING_PROGRAM_TYPE%>" />
    <html:hidden property="<%=AdvancedSearchForm.PARAM_OLD_STATE_OF_INCLUDE_ONLLINE_RESOURCES%>" />
    <html:hidden property="<%=AdvancedSearchForm.PARAM_DIGITAL_CONTENT_MODE%>" />


<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=form.BUTTON_TRAP_ENTER_KEY%>">

    <%request.setAttribute("parentFormName", AdvancedSearchForm.FORM_NAME); %>

    <jsp:include page="/cataloging/basesearchresults.jsp" flush="true" />

<% if ((keywordList == null || keywordList.size() == 0) && !form.isWebPathAvailable()) { %>

    <base:outlinedTableWithTabsForBaseSearch 
        id="<%=AdvancedSearchRedirectorForm.TABLE_LIBRARY_SEARCH_TABS%>"
        borderColor="#C0C0C0"
        selectedTab="<%=AdvancedSearchForm.ID_TAB_POWER_SEARCH%>"
        tabs="<%=(Tab[])store.getAdvanceSearchTabArray()%>" 
        top10Link="<%=form.getTopTenTitles()%>"
        searchGroup="<%=new Integer(SearchHistorySpecs.SEARCH_GROUP_LIBRARY) %>"
        >
        <tr>
            <td align="center">
            <table>
                <tr>
                    <td align="center">
                    <table id="<%=AdvancedSearchForm.TABLE_ADVANCED_SEARCH%>"
                        border="0" cellpadding="2" cellspacing="0">
                        <tr><td colspan="3" align="center"><table>
                        <tr>
                            <td class="FormLabel tdAlignRight"><html:select
                                property="<%= AdvancedSearchForm.FIELD_INDEX_TYPE_1 %>"
                                onchange="submitDropDown()">
                                <html:options collection="powerSearchTypes"
                                    property="stringCode"
                                    labelProperty="stringDesc" />
                            </html:select></td>
                            <td class="tdAlignLeft"><html:text
                                property="<%= AdvancedSearchForm.FIELD_SEARCH_TERM_1 %>"
                                size="40" maxlength="80" /></td>
                            <td class="tdAlignLeft"><html:select
                                property="<%= AdvancedSearchForm.FIELD_WORD_PHRASE_SELECT_1 %>">
                                <html:options
                                    collection="advancedSearchOptions1"
                                    property="stringCode"
                                    labelProperty="stringDesc" />
                            </html:select></td>
                        </tr>

                        <tr>
                            <td>&nbsp;</td>
                            <td align="center" class="FormLabel"><html:radio
                                property="<%= AdvancedSearchForm.FIELD_BOOLEAN_OPERATOR_1 %>"
                                value="<%= String.valueOf(AdvancedSearchQueryData.POWER_SEARCH_AND) %>"
                                onclick="submitDropDown()" /><%=MessageHelper.formatMessage("advancedsearch_And")%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <html:radio
                                property="<%= AdvancedSearchForm.FIELD_BOOLEAN_OPERATOR_1 %>"
                                value="<%= String.valueOf(AdvancedSearchQueryData.POWER_SEARCH_OR) %>"
                                onclick="submitDropDown()" /><%=MessageHelper.formatMessage("advancedsearch_Or")%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <html:radio
                                property="<%= AdvancedSearchForm.FIELD_BOOLEAN_OPERATOR_1 %>"
                                value="<%= String.valueOf(AdvancedSearchQueryData.POWER_SEARCH_NOT) %>"
                                onclick="submitDropDown()" /><%=MessageHelper.formatMessage("advancedsearch_Not")%>&nbsp;
                            </td>
                            <td><base:helpTag
                                helpFileName="d_boolean_and_or_not_power_srch.htm" /></td>
                        </tr>

                        <tr>
                            <td class="FormLabel tdAlignRight"><html:select
                                property="<%= AdvancedSearchForm.FIELD_INDEX_TYPE_2 %>"
                                onchange="submitDropDown()">
                                <html:options collection="powerSearchTypes"
                                    property="stringCode"
                                    labelProperty="stringDesc" />
                            </html:select></td>
                            <td class="tdAlignLeft"><html:text
                                property="<%= AdvancedSearchForm.FIELD_SEARCH_TERM_2 %>"
                                size="40" maxlength="80" /></td>
                            <td class="tdAlignLeft"><html:select
                                property="<%= AdvancedSearchForm.FIELD_WORD_PHRASE_SELECT_2 %>">
                                <html:options
                                    collection="advancedSearchOptions2"
                                    property="stringCode"
                                    labelProperty="stringDesc" />
                            </html:select></td>
                        </tr>

                        <tr>
                            <td>&nbsp;</td>
                            <td align="center" class="FormLabel"><html:radio
                                property="<%= AdvancedSearchForm.FIELD_BOOLEAN_OPERATOR_2 %>"
                                value="<%= String.valueOf(AdvancedSearchQueryData.POWER_SEARCH_AND) %>"
                                onclick="submitDropDown()" /><%=MessageHelper.formatMessage("advancedsearch_And")%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <html:radio
                                property="<%= AdvancedSearchForm.FIELD_BOOLEAN_OPERATOR_2 %>"
                                value="<%= String.valueOf(AdvancedSearchQueryData.POWER_SEARCH_OR) %>"
                                onclick="submitDropDown()" /><%=MessageHelper.formatMessage("advancedsearch_Or")%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <html:radio
                                property="<%= AdvancedSearchForm.FIELD_BOOLEAN_OPERATOR_2 %>"
                                value="<%= String.valueOf(AdvancedSearchQueryData.POWER_SEARCH_NOT) %>"
                                onclick="submitDropDown()" /><%=MessageHelper.formatMessage("advancedsearch_Not")%>
                            </td>
                            <td>&nbsp;</td>
                        </tr>

                        <tr>
                            <td class="FormLabel tdAlignRight"><html:select
                                property="<%= AdvancedSearchForm.FIELD_INDEX_TYPE_3 %>"
                                onchange="submitDropDown()">
                                <html:options collection="powerSearchTypes"
                                    property="stringCode"
                                    labelProperty="stringDesc" />
                            </html:select></td>
                            <td class="tdAlignLeft"><html:text
                                property="<%= AdvancedSearchForm.FIELD_SEARCH_TERM_3 %>"
                                size="40" maxlength="80" /></td>
                            <td class="tdAlignLeft"><html:select
                                property="<%= AdvancedSearchForm.FIELD_WORD_PHRASE_SELECT_3 %>">
                                <html:options
                                    collection="advancedSearchOptions3"
                                    property="stringCode"
                                    labelProperty="stringDesc" />
                            </html:select></td>
                        </tr>

                        </table></td></tr>


                        <tr>
                            <td colspan="3" align="center" class="FormLabel"><base:imageLine
                                width="100%" height="1" /></td>
                        </tr>
                        <tr>
                            <td colspan="3" class="TableHeading"><%= MessageHelper.formatMessage("advancedsearch_LimitYourSearchForTitles") %>&nbsp;
                            <base:helpTag
                                helpFileName="d_limit_your_srch_power_srch.htm" />
                            </td>
                        </tr>
                        <tr>
                            <td>&nbsp;</td>
                            <td colspan="2">
                            <table id="<%= AdvancedSearchForm.TABLE_LIMITERS %>"
                                cellpadding="6" cellspacing="0">
                                <base:searchLookin parentForm="<%=form%>"
                                    renderForAdvancedSearch="true" 
                                    javascriptSubmitFunctionName="submitDropDown()"/>
                                <tr>
                                    <td valign="top"
                                        class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("advancedsearch_MaterialType") %></td>
                                    <td class="tdAlignLeft"><html:select
                                        property="<%= AdvancedSearchForm.FIELD_MATERIAL_TYPE%>"
                                        onchange="submitDropDown()">
                                        <html:options
                                            collection="materialTypesID"
                                            property="stringCode"
                                            labelProperty="stringDesc" />
                                    </html:select></td>
                                </tr>
                                <% if ((form.getMaterialType() == BibType.BIBTYPE_EBOOK || form.getMaterialType() == BibType.BIBTYPE_RECORDING_NON_MUSICAL) && form.isFollettShelfIntegrated()){ %>
                                                <tr>
                                                <td>&nbsp;</td>
                                                <td class="ColRowBold">
                                                <html:checkbox property="<%=AdvancedSearchForm.FIELD_SEARCH_ONLY_FOLLETT_SHELF%>"/>
                                                 <% if (form.getMaterialType() == BibType.BIBTYPE_EBOOK){ %>
                                                    <%=MessageHelper.formatMessage("advancedsearch_LimitToFollettEbooks") %> 
                                                    <% } else if (form.getMaterialType() == BibType.BIBTYPE_RECORDING_NON_MUSICAL) {%>
                                                    <%=MessageHelper.formatMessage("advancedsearch_LimitToFollettAudiobooks") %> 
                                                  <%} %>
                                                </td>
                                                </tr>
                                            <%} %>
                                
                                <logic:equal name="<%= form.FORM_NAME %>" property="subTypesContainData" value="true">
                                    <tr>
                                        <td valign="top"
                                            class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("advancedsearch_Subtype") %></td>
                                        <td class="tdAlignLeft"><html:select
                                            property="<%= AdvancedSearchForm.FIELD_MATERIAL_SUB_TYPE%>">
                                            <html:options
                                                collection="subTypesID"
                                                property="longID"
                                                labelProperty="stringDesc" />
                                        </html:select></td>
                                    </tr>
                                </logic:equal>
                                
                                <tr>
                                    <td valign="top"
                                        class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("advancedsearch_PublicationYear") %></td>
                                    <td class="ColRow tdAlignLeft"><html:select
                                        property="<%= AdvancedSearchForm.FIELD_PUBYEAR_LIMITER%>">
                                        <html:options
                                            collection="pubYearLimitersID"
                                            property="stringCode"
                                            labelProperty="stringDesc" />
                                    </html:select>&nbsp; <html:text
                                        property="<%=AdvancedSearchForm.FIELD_PUBYEAR%>"
                                        size="5" maxlength="4" /></td>
                                </tr>
                                <% if (!store.isDistrictUser()) { %>
                                   <tr>
                                        <td 
                                            class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("advancedsearch_CallNumber") %></td>
                                        <td colspan="2"
                                            class="ColRow tdAlignLeft"><%= MessageHelper.formatMessage("advancedsearch_From") %>&nbsp;<html:text
                                            property="<%= AdvancedSearchForm.FIELD_CALL_NUMBER_RANGE_FROM %>"
                                            size="10" /> &nbsp;<%= MessageHelper.formatMessage("advancedsearch_To") %>&nbsp;<html:text
                                            property="<%= AdvancedSearchForm.FIELD_CALL_NUMBER_RANGE_TO %>"
                                            size="10" /></td>
                                   </tr>
                                <% } %>
                                <% if (! store.isMediaBookingUser() &&
                                       ! store.isDistrictUser() &&
                                         SiteTypeSpecs.SITE_TYPE_ID_MY_LIBRARY.equals(form.getSiteTypeID()) && 
                                       ! form.isIncludeMedia()) { %>
                                <tr>
                                    <td class="FormLabel tdAlignRight">
                                        <%= MessageHelper.formatMessage("advancedsearch_CirculationType") %>
                                    </td>
                                    <td class="tdAlignLeft">
                                        <base:circTypesList formName="<%= AdvancedSearchForm.FORM_NAME %>"/>
                                    </td>
                                </tr>
                                <% } %>
                                
                                <% if (!LocaleHelper.isInternationalProduct()) { %>
                                    <base:selectAward awardGroupID="<%=form.getAwardGroupID()%>" awardNameID="<%=form.getAwardNameID()%>" onchange="submitDropDown()" fromBasicSearch="false" helpFileName="d_find_award_winning_books_power_srch.htm" />
                                <% } %>

                                 <% if (store.isAllowReadingLevelAndInterestLevelSearches()) { %>
                                     <tr>
                                    <td class="FormLabel tdAlignRight">
                                        <%= MessageHelper.formatMessage("advancedsearch_ReadingLevel") %>
                                    </td>
                                    <td class="ColRow tdAlignLeft" >
                                    <%= MessageHelper.formatMessage("advancedsearch_From") %>&nbsp;<html:text property="<%= AdvancedSearchForm.FIELD_READING_GRADE_LEVEL_FROM %>" size="5" maxlength="4"/>
                                    &nbsp;<%= MessageHelper.formatMessage("advancedsearch_To") %>&nbsp;<html:text property="<%= AdvancedSearchForm.FIELD_READING_GRADE_LEVEL_TO %>" size="5" maxlength="4"/>
                                    </td>                                 
                                    </tr>

                                        <tr>
                                        <td class="FormLabel tdAlignRight" valign="top">
                                            <%= MessageHelper.formatMessage("advancedsearch_InterestLevel") %>
                                            </td>
                                            <td class="ColRow tdAlignLeft" >
                                            <%= MessageHelper.formatMessage("advancedsearch_From") %>&nbsp;
                                                <html:select property="<%= AdvancedSearchForm.FIELD_INTEREST_GRADE_LEVEL_FROM %>">
                                                    <html:options collection="interestGradeLevelList" property="longID"
                                                                  labelProperty="stringDesc"/>
                                                </html:select>&nbsp;&nbsp;<base:helpTag helpFileName="d_interest_grade_level_power_srch.htm"/>
                                                <br/><br/>
                                            <%= MessageHelper.formatMessage("advancedsearch_To") %>&nbsp;&nbsp;&nbsp;&nbsp;
                                                <html:select property="<%= AdvancedSearchForm.FIELD_INTEREST_GRADE_LEVEL_TO %>">
                                                    <html:options collection="interestGradeLevelList" property="longID"
                                                                  labelProperty="stringDesc"/>
                                                </html:select>
                                            </td>
                                        </tr>
                                    
                                <% } %>
                                <!-- ARRC goes here -->
                                <!-- Show only if reading programs enabled. -->
                                <%if (readingProgramOptions.isEmpty()
                        || store.isMediaBookingUser() || LocaleHelper.isInternationalProduct()) {
                        %>
                                <html:hidden
                                    property="<%= AdvancedSearchForm.FIELD_READING_PROGRAM_TYPE %>"
                                    value='<%= "" + AdvancedSearchForm.READING_PROGRAM_NONE %>' />
                                <%} else {
                        %>
                                <tr>
                                    <td colspan="3" align="center">
                                    <table
                                        id="<%=AdvancedSearchForm.TABLE_READING_PROGRAM_LEXILE%>"
                                        border="0" cellpadding="3"
                                        style="border-collapse: collapse">
                                        <tr>
                                            <td align="center"
                                                class="ColRowBold" nowrap><%= MessageHelper.formatMessage("advancedsearch_ReadingPrograms") %></td>
                                            <td class="tdAlignLeft"><html:select
                                                property="<%= AdvancedSearchForm.FIELD_READING_PROGRAM_TYPE %>"
                                                onchange="submitDropDown()">
                                                <html:options
                                                    collection="readingProgramOptions"
                                                    property="longID"
                                                    labelProperty="stringDesc" />
                                            </html:select></td>
                                            <td><base:image src="/icons/general/readingprogrambasic.gif"
                                                width="80" height="38"
                                                align="absbottom" /> <base:helpTag
                                                helpFileName="c_reading_programs.htm" />
                                            </td>
                                        </tr>
                                        <%if (form.getReadingProgramType() == AdvancedSearchForm.READING_PROGRAM_AR
                            || form.getReadingProgramType() == AdvancedSearchForm.READING_PROGRAM_RC) {
                            %>
                                        <tr>
                                            <% if (form.getReadingProgramType() == AdvancedSearchForm.READING_PROGRAM_AR) { %>
                                                 <td class="ColRowBold tdAlignRight" valign="bottom"><%= MessageHelper.formatMessage("advancedsearch_ARLevel") %></td>
                                             <%} else {%>
                                                  <td class="ColRowBold tdAlignRight" valign="bottom"><%= MessageHelper.formatMessage("advancedsearch_RCLevel") %></td>
                                             <%} %>
                                            <td valign="bottom" colspan="2"
                                                class="ColRow tdAlignLeft"><%= MessageHelper.formatMessage("advancedsearch_From") %>&nbsp;<html:text
                                                property="<%= AdvancedSearchForm.FIELD_READING_LEVEL_FROM %>"
                                                size="5" /> &nbsp;<%= MessageHelper.formatMessage("advancedsearch_To") %>&nbsp;<html:text
                                                property="<%= AdvancedSearchForm.FIELD_READING_LEVEL_TO %>"
                                                size="5" /></td>
                                        </tr>
                                        <tr>
                                            <td class="ColRowBold tdAlignRight"
                                                valign="bottom"><%= MessageHelper.formatMessage("advancedsearch_PointValue") %></td>
                                            <td valign="bottom" colspan="2"
                                                class="ColRow tdAlignLeft"><%= MessageHelper.formatMessage("advancedsearch_From") %>&nbsp;<html:text
                                                property="<%= AdvancedSearchForm.FIELD_POINT_VALUE_FROM %>"
                                                size="5" /> &nbsp;<%= MessageHelper.formatMessage("advancedsearch_To") %>&nbsp;<html:text
                                                property="<%= AdvancedSearchForm.FIELD_POINT_VALUE_TO %>"
                                                size="5" /></td>
                                        </tr>
                                        <%} else if (form.getReadingProgramType() == AdvancedSearchForm.READING_PROGRAM_LEXILE) {
                            %>
                                        <tr>
                                            <td class="ColRowBold tdAlignRight"
                                                valign="bottom"><%= MessageHelper.formatMessage("advancedsearch_LexileMeasure") %></td>
                                            <td valign="bottom" colspan="2"
                                                class="ColRow tdAlignLeft"><%= MessageHelper.formatMessage("advancedsearch_From") %>&nbsp;<html:text
                                                property="<%= AdvancedSearchForm.FIELD_LEXILE_FROM %>"
                                                size="5" maxlength="4" /> &nbsp;<%= MessageHelper.formatMessage("advancedsearch_To") %>&nbsp;<html:text
                                                property="<%= AdvancedSearchForm.FIELD_LEXILE_TO %>"
                                                size="5" maxlength="4" /></td>
                                        </tr>
                                        <tr>
                                            <td class="ColRowBold tdAlignRight"
                                                valign="bottom">&nbsp;</td>
                                            <td valign="bottom" colspan="2"
                                                class="ColRow tdAlignLeft"><html:select
                                                property="<%= AdvancedSearchForm.FIELD_LEXILE_CODE %>">
                                                <html:options
                                                    collection="lexileCodeList"
                                                    property="stringCode"
                                                    labelProperty="stringDesc" />
                                            </html:select></td>
                                        </tr>
                                        <% } else if (form.getReadingProgramType() == BasicSearchForm.READING_PROGRAM_FOUNTAS_AND_PINNELL) {  %>
                                        <tr>
                                            <td class="ColRowBold tdAlignRight" valign="bottom"><%= MessageHelper.formatMessage("advancedsearch_FountasPinnell") %></td>
                                            <td valign="bottom" colspan="2" class="ColRow tdAlignLeft">
                                                <%= MessageHelper.formatMessage("advancedsearch_From") %>&nbsp;
                                                <html:select property="<%= BasicSearchForm.FIELD_FOUNTAS_AND_PINNELL_FROM %>">
                                                    <html:options collection="fountasAndPinnellList" property="stringCode" labelProperty="stringDesc"/>
                                                </html:select>
                                                &nbsp;<%= MessageHelper.formatMessage("advancedsearch_To") %>&nbsp;
                                                <html:select property="<%= BasicSearchForm.FIELD_FOUNTAS_AND_PINNELL_TO %>">
                                                    <html:options collection="fountasAndPinnellList" property="stringCode" labelProperty="stringDesc"/>
                                                </html:select>
                                                </td>
                                            </tr>
                                        <%}
                    %>
                                    </table>
                                    </td>
                                </tr>
                                <%}
                    %>
                            </table>
                            </td>
                        </tr>
                            <logic:equal name="<%= form.FORM_NAME %>" property="<%= form.FIELD_DISPLAY_ONE_SEARCH %>" value="true">
                            
                            <base:spanIfAllowed
                                permissions="<%= new Permission[] { Permission.CAT_ONE_SEARCH } %>">
                            </table>
                            <table id="<%=AdvancedSearchForm.TABLE_ONLINE_RESOURCES_ENTRIES_TABLE %>">
                                <tr>
        
                                    <td colspan="3" align="center" class="FormLabel"><base:imageLine
                                        width="100%" height="1" /></td>
                                </tr>
                                <tr>
                                    <td colspan="3" align="center">
                                    <a name="<%=AdvancedSearchForm.ONE_SEARCH_ANCHOR %>"></a>
                                            <table id="<%=AdvancedSearchForm.TABLE_ONLINE_RESOURCES_CHECKBOXES_TABLE %>">
                                                <tr>
                                                    <td class="TableHeading"><html:checkbox
                                                        onclick="submitOneSearch()"
                                                        property="<%=AdvancedSearchForm.FIELD_INCLUDE_ONLINE_RESOURCES%>"></html:checkbox>
                                                    <%= MessageHelper.formatMessage("advancedsearch_IncludeOnlineResources") %>&nbsp;
                                                    </td>
                                                    <td><base:image src="/icons/general/onesearch.gif"
                                                        width="70" height="50" align="absbottom" />
                                                    </td>
                                                    <td valign="top"><base:helpTag
                                                        helpFileName="d_include_online_resources_power_srch.htm" />
                                                    </td>
                                                </tr>
                                            </table>
                                    </td>
                                </tr>
                                
                                <c:set var="form" value="<%=request.getAttribute(AdvancedSearchForm.FORM_NAME)%>"/>
                                
                                
                                <c:if test="${form.includeOnlineResources}">
                                <tr>
                                    <c:choose>
                                        <c:when test="${!empty form.oneSearchProcessMessage}">
                                            <td colspan="3" class="ColRowBold" align="Center">
                                            ${form.oneSearchProcessMessage}
                                            </td>
                                        </c:when>
                                        <c:otherwise>
                                            <td colspan="3">
                                        
                                            <table id="<%= form.TABLE_ONE_SEARCH_DATABASE_LIST %>" width="100%">
                                                <tr>
                                                    <td align="left" >
                                                        <a name="anchor"></a>
                                                        <base:genericButton name="<%= form.ID_BUTTON_SELECT_ALL%>" src="/buttons/small/selectall.gif" alt='<%= MessageHelper.formatMessage("selectAll") %>'/>&nbsp;&nbsp;
                                                        <base:genericButton name="<%= form.ID_BUTTON_CLEAR_ALL%>" src="/buttons/small/clearall.gif" alt='<%= MessageHelper.formatMessage("clearAll") %>'/>&nbsp;&nbsp;
                                                    </td>
                                                </tr>
                                                
                                                <c:set var="currentColumn" value="0"/>        
                                                <c:set var="nextColumn" value="0"/>                                                                                  
                                                <c:forEach var="database" items="${form.oneSearchDatabases}" varStatus="status">  
                                                    <c:if test="${currentColumn==0}">                                                
                                                            <c:choose> 
                                                                <c:when test="${empty database.value}"><%-- current database is a heading --%>
                                                                    <c:if test="${!status.first}">
                                                                        <tr>
                                                                            <td colspan="3" align="center" class="FormLabel"> 
                                                                                <base:imageLine></base:imageLine>  
                                                                            </td>
                                                                            <td/>
                                                                        </tr>
                                                                        <tr>
                                                                    </c:if> 
                                                                    <tr>                                                       
                                                                        <td align="left" width="50%" class="ColHeading">
                                                                            <base:imagePassThrough onlineServiceURL="${database.imageFile}" />  
                                                                            &nbsp;
                                                                            ${database.name}
                                                                         </td>
                                                                         <td/>
                                                                     </tr>
                                                                     <c:set var="nextColumn" value="0"/>                                                                 
                                                                </c:when>
                                                                <c:otherwise><%-- this is a search database --%>
                                                                    <tr>
                                                                         <td align="left" width="50%" class="ColRow">
                                                                             <c:if test="${database.checked}">
                                                                               <input type="checkbox" name="${database.value}"  value="on" checked="checked"/>
                                                                             </c:if>
                                                                             <c:if test="${!database.checked}">
                                                                               <input type="checkbox" name="${database.value}"  value="on"/>
                                                                             </c:if>
                                                                           ${database.name}  
                                                                         </td>                                                      
                                                                     <c:set var="nextColumn" value="1"/>                                                                 
                                                                </c:otherwise> 
                                                            </c:choose>
                                                    </c:if>                                                
                                                    <c:if test="${currentColumn==1}">  
                                                        <c:choose> 
                                                            <c:when test="${database.value==null}"><%--current database is a heading --%>
                                                                    <td>&nbsp;
                                                                    </td>
                                                                </tr>
                                                                <tr>
                                                                    <td colspan="3" align="center" class="FormLabel">
                                                                        <base:imageLine></base:imageLine>  
                                                                    </td>
                                                                    <td/>
                                                                </tr>     
                                                                <tr> 
                                                                    <td align="left" width="50%" class="ColHeading">
                                                                        <base:imagePassThrough onlineServiceURL="${database.imageFile}" />  
                                                                        &nbsp;
                                                                        ${database.name}
                                                                     </td>   
                                                                     <td/>
                                                                </tr>                                                                                                                                                                             
                                                            </c:when>
                                                            <c:otherwise><%-- this is a search database --%>   
                                                                     <td align="left" width="50%" class="ColRow">
                                                                             <c:if test="${database.checked}">
                                                                               <input type="checkbox" name="${database.value}"  value="on" checked="checked"/>
                                                                             </c:if>
                                                                             <c:if test="${!database.checked}">
                                                                               <input type="checkbox" name="${database.value}"  value="on"/>
                                                                             </c:if>
                                                                           ${database.name}  
                                                                     </td>     
                                                                </tr>                                                                                                                            
                                                            </c:otherwise>     
                                                        </c:choose>  
                                                        <c:set var="nextColumn" value="0"/>                                                                   
                                                    </c:if>                                                
                                                    <c:if test="${nextColumn == 0}">
                                                        <c:set var="currentColumn" value="0"/> 
                                                    </c:if>                                                
                                                    <c:if test="${nextColumn == 1}">
                                                        <c:set var="currentColumn" value="1"/> 
                                                    </c:if>                                                
                                                </c:forEach>     
                                            <tr>
                                                <td/>
                                                <td class="tdAlignRight">
                                                 <base:genericButton name="<%=AdvancedSearchForm.ID_BUTTON_SEARCH%>" src="/buttons/large/search.gif"  alt='<%= MessageHelper.formatMessage("search") %>'/>  
                                                </td>
                                            </tr>
                                        </table>
                                        </td>
                                        </c:otherwise>
                                    </c:choose>
                                </tr>
                            </c:if>
                        </base:spanIfAllowed>
                        </logic:equal>
                    </table>
                    </td>
                    <td valign="top">
                    <table cellspacing="0" cellpadding="2">
                        <tr>
                            <td class="tdAlignRight"><base:genericButton
                                src="/buttons/large/search.gif"
                                alt='<%= MessageHelper.formatMessage("search") %>'
                                name="<%= AdvancedSearchForm.ID_BUTTON_SEARCH %>" />
                            </td>
                        </tr>
                        <tr>
                            <td class="tdAlignRight"><base:genericButton
                                src="/buttons/large/clear.gif"
                                alt='<%= MessageHelper.formatMessage("clear") %>'
                                name="<%= AdvancedSearchForm.ID_BUTTON_CLEAR %>" />
                            </td>
                        </tr>
                    </table>
                    </td>
                </tr>
            </table>
            </td>
        </tr>
    </base:outlinedTableWithTabsForBaseSearch>

<% } else { %>
    <html:hidden property="<%=AdvancedSearchForm.FIELD_SEARCH_TERM_1%>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_INDEX_TYPE_1%>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_WORD_PHRASE_SELECT_1%>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_BOOLEAN_OPERATOR_1%>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_SEARCH_TERM_2%>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_INDEX_TYPE_2%>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_WORD_PHRASE_SELECT_2%>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_BOOLEAN_OPERATOR_2%>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_SEARCH_TERM_3%>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_INDEX_TYPE_3%>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_WORD_PHRASE_SELECT_3%>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_MATERIAL_TYPE%>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_PUBYEAR_LIMITER%>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_PUBYEAR%>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_READING_PROGRAM_TYPE%>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_READING_LEVEL_FROM%>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_READING_LEVEL_TO%>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_POINT_VALUE_FROM%>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_POINT_VALUE_TO%>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_LEXILE_FROM%>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_LEXILE_TO%>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_LEXILE_CODE%>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_FOUNTAS_AND_PINNELL_FROM %>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_FOUNTAS_AND_PINNELL_TO %>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_READING_GRADE_LEVEL_FROM %>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_READING_GRADE_LEVEL_TO %>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_INTEREST_GRADE_LEVEL_FROM %>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_INTEREST_GRADE_LEVEL_TO %>" />    
    <html:hidden property="<%=AdvancedSearchForm.FIELD_CALL_NUMBER_RANGE_FROM %>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_CALL_NUMBER_RANGE_TO %>" />    
    <html:hidden property="<%=AdvancedSearchForm.FIELD_INCLUDE_LIBRARY%>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_INCLUDE_MEDIA%>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_INCLUDE_ONLINE_RESOURCES%>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_SITE_ID%>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_MEDIA_SITE_ID%>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_SITE_TYPE_ID%>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_AWARD_GROUP%>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_AWARD_NAME%>" />
    <html:hidden property="<%=AdvancedSearchForm.FIELD_SHOWING_RESULTS%>" value="true"/>
<% } %>
</base:form>
