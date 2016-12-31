<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page
    import="com.follett.fsc.destiny.client.backoffice.servlet.SiteConfigCatalogForm"%>
<%@ page import="com.follett.fsc.destiny.session.common.*"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.ConfigSiteSpecs"%>
<%@ page import="com.follett.fsc.destiny.util.*"%>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.data.UpdateConfigSiteDefaultsJobParams"%>
<%@ page import="com.follett.fsc.destiny.util.vopac.DestinyQuestThemes"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.SiteConfigurationBaseForm"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>


<%
    SiteConfigCatalogForm form = (SiteConfigCatalogForm) request.getAttribute(SiteConfigCatalogForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    boolean isInternationalProduct = UserContext.getMyContextLocaleHelper().isInternationalProduct();
    boolean canDoTextbook = store.canDo(Permission.BACK_OFFICE_CHANGE_SITE_PREFERENCES_TEXTBOOK);
    boolean canDoLibrary = store.canDo(Permission.BACK_OFFICE_CHANGE_SITE_PREFERENCES);
%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.SiteConfigurationBaseForm"%>
<bean:define id="checkDeweyDiffs" name="<%=SiteConfigCatalogForm.FORM_NAME%>"
    property="<%=SiteConfigCatalogForm.FIELD_INVENTORY_DIFFERENCES_IN_DEWEY_OPTIONS%>" />
<bean:define id="shelfListOption" name="<%=SiteConfigCatalogForm.FORM_NAME%>"
    property="<%=SiteConfigCatalogForm.FIELD_INVENTORY_CHECK_SHELF_ORDER_OPTIONS%>" />
    
<c:set var="form" value="<%=form %>"/>

<base:messageBox strutsErrors="true" />

<%--  

!!!!!!!!!!!!!!!!!!Warning!!!!!!!!!!!!!!

If you add a new field to this form, beaware you'll need to add it to the set of hiddens down at the bottom of this 
jsp. 

--%>


<base:form action="/backoffice/servlet/handlesiteconfigcatalogform.do">
    <html:hidden property="<%=SiteConfigCatalogForm.FIELD_IS_AWARDS_WINNERS%>" />
    <html:hidden property="<%=SiteConfigCatalogForm.FIELD_ANCHOR%>" />
    <html:hidden property="<%=SiteConfigCatalogForm.FIELD_OLD_SAFARI_DISPLAY_DIGITAL %>" />
    <html:hidden property="<%=SiteConfigCatalogForm.FIELD_OLD_SAFARI_DISPLAY_TITLES %>" />
    <html:hidden
        property="<%=SiteConfigCatalogForm.FIELD_ORIGINAL_STATISTICS_ENABLED%>" />

    <c:if test="<%=form.isResetAllPatrons()%>">
        <base:messageBox>
            <tr>
                <td valign="baseline" align="center" class="ColRowBold">
                <%=form.buildResetConfirmMessage()%><br>
                <%=MessageHelper.formatMessage("siteconfigcatalog_Proceed") %></td>
            </tr>
            <tr>
                <td align="center" class="ColRow"><base:yesNo
                    buttonYesName="<%=SiteConfigCatalogForm.BUTTON_RESET_ALL_PATRONS_YES%>"
                    buttonNoName="<%=SiteConfigCatalogForm.BUTTON_RESET_ALL_PATRONS_NO%>" />
                </td>
            </tr>
        </base:messageBox>
    </c:if>

    <c:if test="<%=form.isConfirmSaveWithoutStatistics()%>">
        <tr>
            <td><base:messageBox>
                <tr>
                    <td valign="baseline" align="center" class="ColRowBold"><%=MessageHelper.formatMessage("siteconfigcatalog_DisablingThisFeatureWillRemoveALLStoredSearchStati") %></td>
                </tr>
                <tr>
                    <td valign="baseline" align="center" class="ColRow"><%=MessageHelper.formatMessage("siteconfigcatalog_AreYouSureYouWantToContinue") %></td>
                </tr>
                <tr>
                    <td align="center" class="ColRow"><base:yesNo
                        buttonYesName="<%=SiteConfigCatalogForm.BUTTON_SAVE_WITHOUT_STATISTICS_YES%>"
                        buttonNoName="<%=SiteConfigCatalogForm.BUTTON_SAVE_WITHOUT_STATISTICS_NO%>" />
                    </td>
                </tr>
            </base:messageBox></td>
        </tr>
    </c:if>

    <base:outlinedTableAndTabsWithinThere id="<%=SiteConfigCatalogForm.TABLE_MAIN%>"
        borderColor="#C0C0C0"
        selectedTab='<%=MessageHelper.formatMessage("siteconfigbase_TabCatalog") %>'
        selectedTabID="<%=SiteConfigCatalogForm.ID_TAB_CATALOG%>"
        tabs="<%=form.getTabs()%>" width="100%">
        <tr>
            <td class="TableHeading" valign="top"><%=MessageHelper.formatMessage("siteconfigcatalog_CatalogOptions") %></td>
            <td class="ColRowBold tdAlignRight"><base:showHideTag
                id="onSaveTwo">
                <base:saveButton onclick="hideElementonSaveTwo()" />
            </base:showHideTag></td>
        </tr>
        <c:choose>
            <c:when
                test="<%=canDoLibrary && store.isLibraryProductSupported()%>">
                <tr>
                    <td colspan="2" class="TableHeading2" valign="top">
                        <%=MessageHelper.formatMessage("siteconfigcatalog_CatalogMaintenance")%>
                    </td>
                </tr>                
                <tr>
                    <td class="ColRow" colspan="2"><html:checkbox
                        property="<%=SiteConfigCatalogForm.FIELD_CLEANUP_TITLES%>">
                        <c:choose>
                            <c:when test="<%=!store.isMediaBookingUser()%>">
                                <%=MessageHelper.formatMessage("siteconfigcatalog_WhenTheLastCopyOfALibraryTitleIsDeleted") %>   
                            </c:when>
                            <c:otherwise>
                                <%=MessageHelper.formatMessage("siteconfigcatalog_WhenTheLastCopyOfATitleIsDeleted") %>
                            </c:otherwise>
                        </c:choose>
                    </html:checkbox> <base:helpTag
                        helpFileName="d_delete_last_copy_deletes_title.htm" />
                    </td>
                </tr>     
                <tr>
                    <td colspan="2"><base:imageLine height="3"
                        width="100%" /></td>
                </tr>
                <tr>
                    <td colspan="2" class="TableHeading2" valign="top">
                    <c:choose>
                        <c:when test="<%=!store.isMediaBookingUser()%>">
                            <%=MessageHelper.formatMessage("siteconfigcatalog_LibraryInventoryOptions")%>
                        </c:when>
                        <c:otherwise>
                            <%=MessageHelper.formatMessage("siteconfigcatalog_InventoryOptions")%>
                        </c:otherwise>                        
                    </c:choose>    
                    </td>
                </tr>                
                <tr>
                    <td class="ColRow" colspan="2"><c:choose>
                        <c:when test="<%=!store.isMediaBookingUser()%>">
                            <%=MessageHelper.formatMessage("siteconfigcatalog_DuringLibraryInventoriesCheckShelf") %> 
                        </c:when>
                        <c:otherwise>
                            <%=MessageHelper.formatMessage("siteconfigcatalog_DuringInventoriesCheckShelfOrderBasedOn") %> 
                        </c:otherwise>
                    </c:choose> <span class="ColRow"> <html:select
                        property="<%=SiteConfigCatalogForm.FIELD_INVENTORY_CHECK_SHELF_ORDER%>">
                        <html:options collection="shelfListOption"
                            property="longID" labelProperty="stringDesc" />
                    </html:select>&nbsp;<base:helpTag
                        helpFileName="d_check_shelf_order.htm" />
                    </span></td>
                </tr>

                <tr>
                    <td class="ColRow" colspan="2"><%=MessageHelper.formatMessage("siteconfigcatalog_AlsoCheckForDifferencesBetweenDeweyNumbers") %> <span
                        class="ColRow"> <html:select
                        property="<%=SiteConfigCatalogForm.FIELD_INVENTORY_DIFFERENCES_IN_DEWEY%>">
                        <html:options collection="checkDeweyDiffs"
                            property="longID" labelProperty="stringDesc" />
                    </html:select>&nbsp;<base:helpTag
                        helpFileName="d_dewey_number_difference.htm" />
                    </span></td>
                </tr>              
                <c:if test="<%=!store.isMediaSite()%>">
                    <tr>
                        <td colspan="2"><base:imageLine height="3"
                            width="100%" /></td>
                    </tr>
                    <tr>
                        <td colspan="2" class="TableHeading2" valign="top">
                        <%=MessageHelper.formatMessage("siteconfigcatalog_DestinyQuestOptions")%>
                        </td>
                    </tr>
                    <% if (!isInternationalProduct) {%>
                        <tr>
                            <td colspan="2" class="ColRow"><%=UpdateConfigSiteDefaultsJobParams.CONST_MISC_DEFAULT_QUEST_THEME%>:
                            &nbsp;<base:helpTag
                                helpFileName="d_dq_theme.htm" />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" class="ColRow"><c:forEach items="<%=DestinyQuestThemes.THEMES%>" var="theme">
                                &nbsp;&nbsp;<html:radio
                                    property="<%=SiteConfigCatalogForm.FIELD_DEFAULT_QUEST_THEME%>"
                                    value="${theme.cssFolder}">
                                </html:radio>${theme.label}<br>
                            </c:forEach></td>
                        </tr>
                    <% } %>     
                    <c:if test="<%=!store.isMediaSite()%>">
                        <tr>
                            <td class="ColRow" colspan="2"><html:checkbox
                                property="<%=SiteConfigCatalogForm.FIELD_QUEST_SHOW_NEW_ARRIVALS %>">
                                <%=MessageHelper.formatMessage("siteconfigcatalog_ShowNewArrivalsInDestinyQuest") %>
                            </html:checkbox>
                            <base:helpTag helpFileName="d_dq_show_new_arrivals.htm" />
                            </td>
                        </tr>
                    </c:if>  
                    <tr>
                        <td class="ColRow" colspan="2"><%= MessageHelper.formatMessage("siteconfigcatalog_ShowPatronPicturesToMyQuest") %>&nbsp;
                            <html:select property="<%= SiteConfigCatalogForm.FIELD_DISPLAY_MYQUEST_PATRON_PICTURES %>" >
                                <html:option value="<%=String.valueOf( ConfigSiteSpecs.DISPLAY_MYQUEST_PATRON_PICTURES_ALWAYS) %>"><%=MessageHelper.formatMessage("siteconfigcatalog_ShowPatronPicturesToMyQuest_Always")%></html:option>
                                <html:option value="<%=String.valueOf(ConfigSiteSpecs.DISPLAY_MYQUEST_PATRON_PICTURES_FOR_FRIENDS) %>"><%=MessageHelper.formatMessage("siteconfigcatalog_ShowPatronPicturesToMyQuest_OnlyForFriends")%></html:option>
                                <html:option value="<%=String.valueOf(ConfigSiteSpecs.DISPLAY_MYQUEST_PATRON_PICTURES_NEVER) %>"><%=MessageHelper.formatMessage("siteconfigcatalog_ShowPatronPicturesToMyQuest_Never")%></html:option>
                            </html:select>
                            <base:helpTag helpFileName="d_mq_show_patron_pictures.htm" />
                        </td>
                    </tr>                
                </c:if>                
                <tr>
                    <td colspan="2"><base:imageLine height="3"
                        width="100%" /></td>
                </tr>
                <c:choose>
                    <c:when test="<%=!store.isMediaBookingUser() && !isInternationalProduct%>">
                        <tr>
                            <td colspan="2" class="TableHeading2" valign="top">
                                <%=MessageHelper.formatMessage("siteconfigcatalog_LanguageSupport")%>
                            </td>
                        </tr>                    
                        <tr>
                            <td colspan="2">
                            <table cellpadding="1" id="<%=SiteConfigCatalogForm.TABLE_LANGUAGE_BOX %>">
                                <tr>
                                    <td class="ColRow">
                                    <%=MessageHelper.formatMessage("siteconfigcatalog_AllowGuestsAndPatronsToViewSelectPagesIn") %>
                                    </td>
                                </tr>
                                <%-- do not make a function call for the check box on submits. I had mucho problems with ats on them - etg --%>
                                <tr>
                                    <td class="ColRow">&nbsp;&nbsp; 
                                        <a name="theLanguageFocus"></a><html:checkbox
                                        property="<%=SiteConfigCatalogForm.FIELD_ALLOW_FRENCH%>"
                                        onclick="document.backoffice_servlet_SiteConfigCatalogForm.anchor.value = '1';
                                            document.backoffice_servlet_SiteConfigCatalogForm.submit();">
                                            <%=MessageHelper.formatMessage("siteconfigcatalog_French") %>
                                        </html:checkbox></td>
                                </tr>
                                <tr>
                                    <td class="ColRow">&nbsp;&nbsp; <html:checkbox
                                        property="<%=SiteConfigCatalogForm.FIELD_ALLOW_SPANISH%>"
                                        onclick="document.backoffice_servlet_SiteConfigCatalogForm.anchor.value = '1';
                                            document.backoffice_servlet_SiteConfigCatalogForm.submit();">
                                            <%=MessageHelper.formatMessage("siteconfigcatalog_Spanish") %>
                                        </html:checkbox></td>
                                </tr>
                                <tr>
                                    <td class="ColRow">
                                    &nbsp;&nbsp;<%=MessageHelper.formatMessage("siteconfigcatalog_ByDefaultDisplaySelectPagesIn") %> <%=form.buildEnglishFrenchSpanishOPACLanguageCombobox()%> &nbsp;<base:helpTag
                                        helpFileName="d_languagesupport_choices.htm" />
                                    </td>
                                </tr>
                            </table>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2"><base:imageLine height="3"
                                width="100%" /></td>
                        </tr>
                    </c:when>
                    <c:otherwise>
                        <html:hidden
                            property="<%=SiteConfigCatalogForm.FIELD_DEFAULT_LANGUAGE%>" />
                        <html:hidden
                            property="<%=SiteConfigCatalogForm.FIELD_ALLOW_FRENCH%>" />
                        <html:hidden
                            property="<%=SiteConfigCatalogForm.FIELD_ALLOW_SPANISH%>" />
                    </c:otherwise>
                </c:choose>                
                <tr>
                    <td colspan="2" class="TableHeading2" valign="top">
                        <c:choose>
                            <c:when test="<%=!store.isMediaBookingUser()%>">
                                <%=MessageHelper.formatMessage("siteconfigcatalog_LibraryTitleDisplaySettings")%> 
                            </c:when>
                            <c:otherwise>
                                <%=MessageHelper.formatMessage("siteconfigcatalog_TitleDisplaySettings")%> 
                            </c:otherwise>
                        </c:choose> 
                    </td>
                </tr>                    
                <tr>
                    <td class="ColRow" colspan="2"><%= MessageHelper.formatMessage("siteconfigcatalog_ArrangeDisplayRecordSectionsAsFollows") %>&nbsp;<base:helpTag
                        helpFileName="d_title_details_limit_sort.htm" />
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                    <table id="<%=SiteConfigCatalogForm.TABLE_TITLE_DETAIL%>">
                        <tr>
                            <td>&nbsp;&nbsp;</td>
                            <td class=SmallColHeading>&nbsp;</td>
                            <td class=SmallColHeading align="center"><%=MessageHelper.formatMessage("siteconfigcatalog_Order") %></td>
                            <td class=SmallColHeading align="center"><%=MessageHelper.formatMessage("siteconfigcatalog_AlwaysShow") %></td>

                        </tr>
                        <tr>
                            <td>&nbsp;&nbsp;</td>
                            <td class="ColRow tdAlignRight"><%=MessageHelper.formatMessage("siteconfigcatalog_Explore") %></td>
                            <td><html:text
                                property="<%=SiteConfigCatalogForm.FIELD_TITLE_DETAILS_EXPLORE_ORDER%>"
                                size="4" maxlength="1" /></td>
                            <td align="center"><html:checkbox
                                property="<%=SiteConfigCatalogForm.FIELD_TITLE_DETAILS_EXPLORE_SHOW_ALWAYS%>" /></td>
                        </tr>
                        <c:if test="<%=!store.isMediaSite()%>">
                            <tr>
                                <td>&nbsp;&nbsp;</td>
                                <td class="ColRow tdAlignRight"><%=MessageHelper.formatMessage("siteconfigcatalog_QuizInfo") %></td>
                                <td><html:text
                                    property="<%=SiteConfigCatalogForm.FIELD_TITLE_DETAILS_QUIZ_ORDER%>"
                                    size="4" maxlength="1" /></td>
                                <td align="center"><html:checkbox
                                    property="<%=SiteConfigCatalogForm.FIELD_TITLE_DETAILS_QUIZ_SHOW_ALWAYS%>" /></td>
                            </tr>
                        </c:if>
                        <tr>
                            <td>&nbsp;&nbsp;</td>
                            <td class="ColRow tdAlignRight"><%=MessageHelper.formatMessage("siteconfigcatalog_PublicationInfo") %></td>
                            <td><html:text
                                property="<%=SiteConfigCatalogForm.FIELD_TITLE_DETAILS_PUB_ORDER%>"
                                size="4" maxlength="1" /></td>
                            <td align="center"><html:checkbox
                                property="<%=SiteConfigCatalogForm.FIELD_TITLE_DETAILS_PUB_SHOW_ALWAYS%>" /></td>
                        </tr>

                        <tr>
                            <td>&nbsp;&nbsp;</td>
                            <td class="ColRow tdAlignRight"><%=MessageHelper.formatMessage("siteconfigcatalog_AdditionalInfo") %></td>
                            <td><html:text
                                property="<%=SiteConfigCatalogForm.FIELD_TITLE_DETAILS_ADD_INFO_ORDER%>"
                                size="4" maxlength="1" /></td>
                            <td align="center"><html:checkbox
                                property="<%=SiteConfigCatalogForm.FIELD_TITLE_DETAILS_ADD_INFO_SHOW_ALWAYS%>" /></td>
                        </tr>
                        <c:if test="<%=form.isAllowAwardWinners()%>">
                            <tr>
                                <td>&nbsp;&nbsp;</td>
                                <td class="ColRow tdAlignRight"><%=MessageHelper.formatMessage("siteconfigcatalog_Awards") %></td>
                                <td><html:text
                                    property="<%=SiteConfigCatalogForm.FIELD_TITLE_DETAILS_AWARDS_ORDER%>"
                                    size="4" maxlength="1" /></td>
                                <td align="center"><html:checkbox
                                    property="<%=SiteConfigCatalogForm.FIELD_TITLE_DETAILS_AWARDS_SHOW_ALWAYS%>" /></td>
                            </tr>
                        </c:if>
                    </table>
                    </td>
                </tr>
                <c:if test="<%=!store.isMediaSite()%>">
                    <tr>
                        <td colspan="2"><base:imageLine height="1"
                            width="100%" /></td>
                    </tr>
                    <c:choose>
                        <c:when test="<%=isInternationalProduct%>">
                            <tr>
                                <td class="ColRowBold" colspan="2"><%=MessageHelper.formatMessage("siteconfigcatalog_LibraryReviews") %>&nbsp;
                                <html:select property="<%= SiteConfigCatalogForm.FIELD_INCLUDE_REVIEWER_NAME_IN_REVIEW %>" >
                                    <html:option value='<%= "" +ConfigSiteSpecs.DISPLAY_REVIEW_NAME_OPTION_DO_NOT_SHOW%>'><%=MessageHelper.formatMessage("siteconfigcatalog_DontIncludeTheReviewersName") %></html:option>
                                    <html:option value='<%= "" +ConfigSiteSpecs.DISPLAY_REVIEW_NAME_OPTION_SHOW_FULL_NAME%>'><%=MessageHelper.formatMessage("siteconfigcatalog_IncludeTheReviewersFullName") %></html:option>
                                </html:select>
                                
                                <base:helpTag
                                    helpFileName="d_include_reviewer_name.htm" />
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr>
                                <td class="ColRow" colspan="2"><%=MessageHelper.formatMessage("siteconfigcatalog_LibraryReviews") %>&nbsp;
                                <html:select property="<%= SiteConfigCatalogForm.FIELD_INCLUDE_REVIEWER_NAME_IN_REVIEW %>" >
                                    <html:option value='<%= "" +ConfigSiteSpecs.DISPLAY_REVIEW_NAME_OPTION_DO_NOT_SHOW%>'><%=MessageHelper.formatMessage("siteconfigcatalog_DontIncludeTheReviewersName") %></html:option>
                                    <html:option value='<%= "" +ConfigSiteSpecs.DISPLAY_REVIEW_NAME_OPTION_SHOW_FULL_NAME%>'><%=MessageHelper.formatMessage("siteconfigcatalog_IncludeTheReviewersFullName") %></html:option>
                                    <html:option value='<%= "" +ConfigSiteSpecs.DISPLAY_REVIEW_NAME_OPTION_SHOW_FIRST_NAME_LAST_INITIAL%>'><%=MessageHelper.formatMessage("siteconfigcatalog_IncludeTheReviewersFirstNameLastInitial") %></html:option>
                                    <html:option value='<%= "" +ConfigSiteSpecs.DISPLAY_REVIEW_NAME_OPTION_SHOW_INITIALS%>'><%=MessageHelper.formatMessage("siteconfigcatalog_IncludeTheReviewersInitialsOnly") %></html:option>
                                </html:select>
                                
                                <base:helpTag
                                    helpFileName="d_include_reviewer_name.htm" />
                                </td>
                            </tr>
                        </c:otherwise>
                    </c:choose>
                </c:if>

                <% if (!LocaleHelper.isInternationalProduct() && !form.checkForFollettShelf()) { %>
                <tr>
                    <td colspan="2"><base:imageLine height="1"
                        width="100%" /></td>
                </tr>
                <tr>
                    <td>
                        <table id="<%=SiteConfigurationBaseForm.TABLE_PREVIEW_EBOOK_GUEST_PASSWORD%>">
                            <tr>
                                <td class="ColRow">
                                    <%=MessageHelper.formatMessage("siteconfigcatalog_ToReadEbooksOnlineGuestsMustEnterThePassword") %>&nbsp;
                                    <html:text property="<%=SiteConfigCatalogForm.FIELD_PREVIEW_EBOOKS_GUEST_PASSWORD %>" maxlength="50" size="20"/>&nbsp;
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
                <% } %>
                
                <tr>
                    <td colspan="2"><base:imageLine height="3" width="100%" /></td>
                </tr>
                <tr>
                    <td colspan="2" class="TableHeading2" valign="top">
                        <%=MessageHelper.formatMessage("siteconfigcatalog_QuizLevelBasedSearches")%>
                    </td>
                </tr>
                <c:if test="<%=!store.isMediaBookingUser()%>">
                    <c:if test="<%=!isInternationalProduct%>">
                        <tr>
                            <td class="ColRow" colspan="2"><html:checkbox
                                property="<%=SiteConfigCatalogForm.FIELD_USE_ACCELERATED_READER%>">Support Accelerated Reader Searches</html:checkbox>
                            <base:helpTag
                                helpFileName="d_support_ar_search.htm" />
                            </td>
                        </tr>
                        <tr>
                            <td class="ColRow" colspan="2"><html:checkbox
                                property="<%=SiteConfigCatalogForm.FIELD_USE_FOUNTAS_AND_PINNELL%>"><%=MessageHelper.formatMessage("siteconfigcatalog_SupportFountasAndPinnellSearches") %></html:checkbox>
                            <base:helpTag
                                helpFileName="d_support_fountas_search.htm" />
                            </td>
                        </tr>
                        <tr>
                            <td class="ColRow" colspan="2"><html:checkbox
                                property="<%=SiteConfigCatalogForm.FIELD_USE_LEXILE%>"><%=MessageHelper.formatMessage("siteconfigcatalog_SupportLexileMeasureSearches") %></html:checkbox>
                            <base:helpTag
                                helpFileName="d_support_lexile_search.htm" />
                            </td>
                        </tr>
                        <tr>
                            <td class="ColRow" colspan="2"><html:checkbox
                                property="<%=SiteConfigCatalogForm.FIELD_USE_READING_COUNTS%>">Support Reading Counts! Searches</html:checkbox>
                            <base:helpTag
                                helpFileName="d_support_rc_search.htm" />
                            </td>
                        </tr>
                    </c:if>
                </c:if>
                <tr>
                    <td class="ColRow" colspan="2"><html:checkbox
                        property="<%=SiteConfigCatalogForm.FIELD_ALLOW_READING_LEVEL_AND_INTEREST_LEVEL_SEARCHES%>"><%=MessageHelper.formatMessage("siteconfigcatalog_SupportReadingLevelAndInterestLevelSearches") %></html:checkbox>
                    <base:helpTag
                        helpFileName="d_support_reading_interest_lvl_srch.htm" />
                    </td>
                </tr>

                <tr>
                    <td colspan="2"><base:imageLine height="3" width="100%" /></td>
                </tr>
                <tr>
                    <td colspan="2" class="TableHeading2" valign="top">
                        <%=MessageHelper.formatMessage("siteconfigcatalog_SearchSettings")%>
                    </td>
                </tr>
                <logic:equal name="<%=SiteConfigCatalogForm.FORM_NAME%>"
                    property="displayBasicSearchData" value="true">
                    <tr>
                        <td class="ColRow" colspan="2"><html:checkbox
                            property="<%=SiteConfigCatalogForm.FIELD_CAT_MISC_STORE_BASIC_SEARCH_TERM_DATA%>">
                            <%=MessageHelper.formatMessage("siteconfigcatalog_StoreSearchStatisticsDataFor") %>&nbsp;
                        </html:checkbox> <html:text
                            property="<%=SiteConfigCatalogForm.FIELD_CAT_MISC_STORE_BASIC_SEARCH_TERM_LENGTH%>"
                            size="4" maxlength="2" /> &nbsp;<%=MessageHelper.formatMessage("siteconfigcatalog_MonthsPriorToTheCurrentMonth") %>&nbsp;
                            <base:helpTag helpFileName="d_store_basicsearch_data.htm" />
                        </td>
                    </tr>
                    <c:if test="<%=!store.isMediaSite()%>">
                        <tr>
                            <td class="ColRow" colspan="2">
                            <ul>
                                <html:checkbox property="<%=SiteConfigCatalogForm.FIELD_ENABLE_SEARCH_SUGGESTIONS_IN_QUEST%>">
                                    <%=MessageHelper.formatMessage("siteconfigcatalog_EnableSearchSuggestionsInDestinyQuest") %>
                                </html:checkbox>
                                &nbsp;
                                <base:helpTag helpFileName="d_dq_search_suggestions.htm" />
                            </ul>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <ul>
                                    <html:hidden property="<%=SiteConfigCatalogForm.FIELD_FILTER_SEARCH_SUGGESTIONS_IN_QUEST%>" />
                                    <table id="<%=SiteConfigCatalogForm.TABLE_FILTERED_WORDS%>">
                                        <tr>                    
                                            <td class="ColRow tdAlignRight">
                                                <ul>
                                                    <%=MessageHelper.formatMessage("siteconfigcatalog_FilterSearchSuggestions") %>&nbsp;
                                                </ul>
                                            </td>
                                            <td>
                                                <table id=<%=SiteConfigCatalogForm.TABLE_SELECTION_FILTERED_WORDS_FOR_AUTO_SUGGEST%> 
                                                    cellspacing="0" cellpadding="0">                                        
                                                    <tr>
                                                        <td class="ColRow">         
                                                            <c:choose>
                                                                <c:when test="<%=form.isFilterSearchSuggestionsInQuest()%>">
                                                                    <%=MessageHelper.formatMessage("siteconfigcatalog_Filtered") %>      
                                                                </c:when>
                                                                <c:otherwise>
                                                                    <%=MessageHelper.formatMessage("siteconfigcatalog_Unfiltered") %>    
                                                                </c:otherwise>
                                                            </c:choose>
                                                        </td>
                                                        <td valign="middle" class="tdAlignRight">    
                                                            <base:genericButton name="<%=SiteConfigCatalogForm.BUTTON_UPDATE_FILTERED_WORDS %>"
                                                                src="/buttons/large/update.gif" alt='<%=MessageHelper.formatMessage("update") %>'/>
                                                        </td>
                                                    </tr>
                                                </table>                                        
                                            </td>  
                                        </tr>                                      
                                    </table>
                                </ul>
                            </td>    
                        </tr>                        
                    </c:if>
                </logic:equal>
                <tr>
                    <td class="ColRow" colspan="2"><html:checkbox
                        property="<%=SiteConfigCatalogForm.FIELD_DEFAULT_BASIC_SEARCH_TO_SHOW_MORE%>"><%=MessageHelper.formatMessage("siteconfigcatalog_ByDefaultShowLimiterOptionsInBasicSearch")%></html:checkbox>
                        <base:helpTag
                        helpFileName="d_limiter_options_basic_search.htm" />
                    </td>
                </tr>
                <tr>
                    <td class="ColRow" colspan="2"><html:checkbox
                        property="<%=SiteConfigCatalogForm.FIELD_SKIP_LEADING_ARTICLES%>">
                        <%=MessageHelper.formatMessage("siteconfigcatalog_IgnoreLeadingArticlesInSearchTermsWhenBrowsing") %>
                    </html:checkbox>&nbsp;<base:helpTag
                        helpFileName="d_ignore_leading_articles.htm" />
                    </td>
                </tr>
                <tr>
                    <td colspan="2"><base:imageLine height="3" width="100%" /></td>
                </tr>
                <tr>
                    <td colspan="2" class="TableHeading2" valign="top">
                        <%= MessageHelper.formatMessage("siteconfigcatalog_SearchResultSettings") %>
                    </td>
                </tr>
                <tr>
                    <td colspan = "2" class = "ColRow">
                        <html:checkbox property="<%= SiteConfigCatalogForm.FIELD_SAFARI_DISPLAY_DIGITAL %>"><%= MessageHelper.formatMessage("siteconfigcatalog_DisplaySafariMontageResultsWithDigitalResources") %></html:checkbox> <base:helpTag helpFileName="d_display_safari_montage_titles.htm" /><br/>
                        <html:checkbox property="<%= SiteConfigCatalogForm.FIELD_SAFARI_DISPLAY_TITLES %>"><%= MessageHelper.formatMessage("siteconfigcatalog_DisplaySafariMontageResultsWithTitles") %></html:checkbox>
                    </td>
                </tr>
                <tr>
                    <td class="ColRow" colspan="2"><%=MessageHelper.formatMessage("siteconfigcatalog_WhereApplicableByDefaultSortSearchResultsBy") %>
                    <%=form.buildDefaultSearchSortCombobox()%>
                    &nbsp;<base:helpTag
                        helpFileName="d_sort_search_results.htm" />
                    </td>
                </tr>
                <tr>
                    <td colspan="2">&nbsp;&nbsp;&nbsp; <base:genericButton
                        name="<%=SiteConfigCatalogForm.BUTTON_RESET_ALL_PATRONS%>"
                        src="/buttons/small/resetallpatrons.gif"
                        alt='<%=MessageHelper.formatMessage("resetAllPatrons")  %>' />
                    </td>
                </tr>
                
                <c:if test="<%=!store.isMediaSite()%>">
                    <tr>                                 
                        <td colspan="2" class="ColRow"><%=MessageHelper.formatMessage("siteconfigcatalog_DisplayVisualSearchResultsUsing") %>&nbsp;<base:helpTag
                            helpFileName="d_display_visual_search_results.htm" />
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" class="ColRow">&nbsp;&nbsp;<html:radio
                            property="<%=SiteConfigCatalogForm.FIELD_VISUAL_SEARCH_DISPLAY%>"
                            value="<%=SiteConfigCatalogForm.RADIO_STANDARD_VISUAL_INTERFACE%>">
                        </html:radio><%=MessageHelper.formatMessage("siteconfigcatalog_StandardInterface") %><br>
                        &nbsp;&nbsp;<html:radio
                            property="<%=SiteConfigCatalogForm.FIELD_VISUAL_SEARCH_DISPLAY%>"
                            value="<%=SiteConfigCatalogForm.RADIO_STANDARD_ELEMENTARY_INTERFACE%>">
                        </html:radio><%=MessageHelper.formatMessage("siteconfigcatalog_ElementaryInterface") %></td>
                    </tr>
                </c:if>
               <c:if test="<%=!store.isMediaBookingUser()%>">
                    <tr>
                        <td colspan="2"><base:imageLine height="3" width="100%" /></td>
                    </tr>                
                    <tr>
                        <td colspan="2" class="TableHeading2">
                            <%=MessageHelper.formatMessage("siteconfigcatalog_Top10Titles")%>
                            <base:helpTag helpFileName="d_top_10_titles.htm" />
                        </td>
                    </tr>
                    
                    <tr>
                        <td colspan="2" class="ColRow">
                            <a name="theTop10Focus"></a><html:checkbox property="<%=SiteConfigCatalogForm.FIELD_SHOW_TOP_10 %>" 
                             onclick="document.backoffice_servlet_SiteConfigCatalogForm.anchor.value = '2';
                             document.backoffice_servlet_SiteConfigCatalogForm.submit();"><%=MessageHelper.formatMessage("siteconfigcatalog_ShowTop10InCatalogAndDestinyQuest") %></html:checkbox>
                        </td>
                    </tr>
                    
                    <c:if test="${form.showTop10}">
                        <tr>
                            <td colspan="2" class="ColRow">
                                <ul>
                                    <html:checkbox property="<%=SiteConfigCatalogForm.FIELD_TOP_10_INCLUDE_INLIBRARY %>"><%=MessageHelper.formatMessage("siteconfigcatalog_CountInLibraryUseCirculations")%></html:checkbox>
                                </ul>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <ul>
                                    <table>
                                        <tr>
                                            <td class="ColRow tdAlignRight">
                                                <%=MessageHelper.formatMessage("siteconfigcatalog_CountCirculationsOfThesePatronTypes")%>
                                             </td>
                                             <td>
                                                <base:patronTypesList formName="<%= SiteConfigCatalogForm.FORM_NAME %>"/>
                                            </td>
                                        </tr>
                                    </table>
                                </ul>
                            </td>    
                        </tr>
                        <tr>
                            <td colspan="2">
                                <ul>
                                    <table>
                                        <tr>
                                            <td class="ColRow tdAlignRight">
                                                <%=MessageHelper.formatMessage("siteconfigcatalog_CountCirculationsOfTheseMaterialTypes")%>
                                             </td>
                                             <td>
                                                <base:materialTypeList formName="<%= SiteConfigCatalogForm.FORM_NAME %>"/>
                                            </td>
                                        </tr>
                                    </table>
                                </ul>
                            </td>    
                        </tr>
                        <tr>
                            <td colspan="2" class="ColRow">
                                <ul>
                                    <html:checkbox property="<%=SiteConfigCatalogForm.FIELD_TOP_10_LIMIT_BY_CALL_NUMBER %>"><%=MessageHelper.formatMessage("siteconfigcatalog_CountCirculationsOfThisCallNumberRange")%>&nbsp;</html:checkbox>
                                    <%=MessageHelper.formatMessage("siteconfigcatalog_From")%>&nbsp;<html:text property="<%=SiteConfigCatalogForm.FIELD_TOP_10_CALL_NUMBER_START_RANGE%>" size="9" maxlength="10"/>&nbsp;
                                    <%=MessageHelper.formatMessage("siteconfigcatalog_To")%>&nbsp;<html:text property="<%=SiteConfigCatalogForm.FIELD_TOP_10_CALL_NUMBER_END_RANGE%>" size="9" maxlength="10"/>&nbsp;
                                    <%=MessageHelper.formatMessage("siteconfigcatalog_DisplayedAs")%>&nbsp;<html:text property="<%=SiteConfigCatalogForm.FIELD_TOP_10_CALL_NUMBER_DESC%>" size="15" maxlength="20"/> 
                                </ul>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" class="Instruction">
                            <ul><%=MessageHelper.formatMessage("siteconfigcatalog_ToSpecifyACallNumberRangeEnterAtLeastTheFirstDigitsOfEachDeweyNumberOrACompleteCallNumberPrefix")%></ul>
                            </td>
                        </tr>
                    </c:if>                
                 </c:if>                
                <c:if test="<%=form.checkWebPathExpressEnabledForSite() && !isInternationalProduct%>">
                    <tr>
                        <td colspan="2"><base:imageLine height="3" width="100%" /></td>
                    </tr>
                    <tr>
                        <td colspan="2" class="TableHeading2">
                            <%=MessageHelper.formatMessage("siteconfigcatalog_WebPathExpressOptions")%>
                        </td>
                    </tr>                
                    <tr>
                        <td colspan="2" class="ColRow"><html:checkbox
                            property="<%=SiteConfigCatalogForm.FIELD_ALLOW_WEB_PATH_THEMES%>">
                            <%=MessageHelper.formatMessage("siteconfigcatalog_ShowWebPathExpressMonthlyThemes") %>
                        </html:checkbox>&nbsp;<base:helpTag
                            helpFileName="d_webpath_suggestions_themes_spotlght.htm" />
                        </td>
                    </tr>
                </c:if>
            </c:when>
            <c:when test="<%=canDoTextbook && store.isTextbookProductSupported()%>">
                <tr>
                    <td class="ColRowBold" colspan="2"><html:checkbox
                        property="<%=SiteConfigCatalogForm.FIELD_SKIP_LEADING_ARTICLES%>">
                        <%=MessageHelper.formatMessage("siteconfigcatalog_IgnoreLeadingArticlesInSearchTermsWhenBrowsing") %>
                    </html:checkbox>&nbsp;<base:helpTag
                        helpFileName="d_ignore_leading_articles.htm" />
                    </td>
                </tr>

                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_USE_ACCELERATED_READER%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_USE_READING_COUNTS%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_USE_LEXILE%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_CLEANUP_TITLES%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_INVENTORY_CHECK_SHELF_ORDER%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_INVENTORY_DIFFERENCES_IN_DEWEY%>" />
                
                
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_DEFAULT_QUEST_THEME%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_QUEST_SHOW_NEW_ARRIVALS%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_DISPLAY_MYQUEST_PATRON_PICTURES%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TITLE_DETAILS_EXPLORE_ORDER%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TITLE_DETAILS_EXPLORE_SHOW_ALWAYS%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TITLE_DETAILS_QUIZ_ORDER%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TITLE_DETAILS_QUIZ_SHOW_ALWAYS%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TITLE_DETAILS_PUB_ORDER%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TITLE_DETAILS_PUB_SHOW_ALWAYS%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TITLE_DETAILS_ADD_INFO_ORDER%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TITLE_DETAILS_ADD_INFO_SHOW_ALWAYS%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TITLE_DETAILS_AWARDS_ORDER%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TITLE_DETAILS_AWARDS_SHOW_ALWAYS%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_USE_FOUNTAS_AND_PINNELL%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_ALLOW_READING_LEVEL_AND_INTEREST_LEVEL_SEARCHES %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_CAT_MISC_STORE_BASIC_SEARCH_TERM_DATA %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_CAT_MISC_STORE_BASIC_SEARCH_TERM_LENGTH %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_ENABLE_SEARCH_SUGGESTIONS_IN_QUEST %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_DEFAULT_BASIC_SEARCH_TO_SHOW_MORE %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_VISUAL_SEARCH_DISPLAY %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TOP_10_INCLUDE_INLIBRARY %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TOP_10_LIMIT_BY_CALL_NUMBER %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_ALLOW_WEB_PATH_THEMES %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_ALLOW_FRENCH %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_ALLOW_SPANISH %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_DEFAULT_LANGUAGE %>" />
                
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_SHOW_TOP_10 %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TOP_10_INCLUDE_INLIBRARY %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TOP_10_LIMIT_BY_CALL_NUMBER %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TOP_10_CALL_NUMBER_START_RANGE %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TOP_10_CALL_NUMBER_END_RANGE %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TOP_10_CALL_NUMBER_DESC %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_PREVIEW_EBOOKS_GUEST_PASSWORD %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_INCLUDE_REVIEWER_NAME_IN_REVIEW %>" />
            </c:when>

            <c:otherwise>
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_USE_ACCELERATED_READER%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_USE_READING_COUNTS%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_USE_LEXILE%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_SKIP_LEADING_ARTICLES%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_CLEANUP_TITLES%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_INVENTORY_CHECK_SHELF_ORDER%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_INVENTORY_DIFFERENCES_IN_DEWEY%>" />
                
                
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_DEFAULT_QUEST_THEME%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_QUEST_SHOW_NEW_ARRIVALS%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_DISPLAY_MYQUEST_PATRON_PICTURES%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TITLE_DETAILS_EXPLORE_ORDER%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TITLE_DETAILS_EXPLORE_SHOW_ALWAYS%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TITLE_DETAILS_QUIZ_ORDER%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TITLE_DETAILS_QUIZ_SHOW_ALWAYS%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TITLE_DETAILS_PUB_ORDER%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TITLE_DETAILS_PUB_SHOW_ALWAYS%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TITLE_DETAILS_ADD_INFO_ORDER%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TITLE_DETAILS_ADD_INFO_SHOW_ALWAYS%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TITLE_DETAILS_AWARDS_ORDER%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TITLE_DETAILS_AWARDS_SHOW_ALWAYS%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_USE_FOUNTAS_AND_PINNELL%>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_ALLOW_READING_LEVEL_AND_INTEREST_LEVEL_SEARCHES %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_CAT_MISC_STORE_BASIC_SEARCH_TERM_DATA %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_CAT_MISC_STORE_BASIC_SEARCH_TERM_LENGTH %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_ENABLE_SEARCH_SUGGESTIONS_IN_QUEST %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_DEFAULT_BASIC_SEARCH_TO_SHOW_MORE %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_VISUAL_SEARCH_DISPLAY %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TOP_10_INCLUDE_INLIBRARY %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TOP_10_LIMIT_BY_CALL_NUMBER %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_ALLOW_WEB_PATH_THEMES %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_ALLOW_FRENCH %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_ALLOW_SPANISH %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_DEFAULT_LANGUAGE %>" />
                
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_SHOW_TOP_10 %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TOP_10_INCLUDE_INLIBRARY %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TOP_10_LIMIT_BY_CALL_NUMBER %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TOP_10_CALL_NUMBER_START_RANGE %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TOP_10_CALL_NUMBER_END_RANGE %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_TOP_10_CALL_NUMBER_DESC %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_PREVIEW_EBOOKS_GUEST_PASSWORD %>" />
                <html:hidden property="<%=SiteConfigCatalogForm.FIELD_INCLUDE_REVIEWER_NAME_IN_REVIEW %>" />
            </c:otherwise>
        </c:choose>
        <%if (!store.isAtDistrictWarehouse()) { %> <!-- Line and bottom save are not needed for DistrictWarehouse because there are few options on page -->
        <tr>
            <td colspan="2"><base:imageLine height="3" width="100%" /></td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td class="ColRowBold tdAlignRight"><base:showHideTag id="onSave">
                <base:saveButton onclick="hideElementonSave()" />
            </base:showHideTag></td>
        </tr>
        <% } %>
        
    </base:outlinedTableAndTabsWithinThere>
</base:form>
