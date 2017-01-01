<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.SiteConfigurationCatalogSettingsForm" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.data.UpdateConfigSiteDefaultsJobParams" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.JSPHelper" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.common.consortium.LanguageType" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%@page import="com.follett.fsc.destiny.entity.ejb3.ConfigSiteSpecs"%>
<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<%@page import="com.follett.fsc.destiny.util.FollettEBookSpecs"%><base:messageBox strutsErrors="true"/>

<%
    SiteConfigurationCatalogSettingsForm form = (SiteConfigurationCatalogSettingsForm)request.getAttribute(SiteConfigurationCatalogSettingsForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    UpdateConfigSiteDefaultsJobParams params = form.gimmeParams();
    boolean isInternational = UserContext.getMyContextLocaleHelper().isInternationalProduct();
%>

<base:form action="/district/servlet/handlesiteconfigurationcatalogsettingsform.do">
<html:hidden property="districtMode" />

  <% // This table can't be less than 100% or the tabs will be misaligned %>
<center><span class="ColRowBold"><%= GenericForm.getLastBackupDisplayMsg(false) %></span></center><br>
<jsp:include page="/common/msdewarning.jsp" flush="true" />
  <table align="center" width="95%"><tr><td>
<base:outlinedTableAndTabsWithinThere id="<%=SiteConfigurationCatalogSettingsForm.TABLE_CATALOG_SETTINGS%>" selectedTab="<%=SiteConfigurationCatalogSettingsForm.TAB%>" tabs="<%=form.getTabs()%>" align="center" width="100%">

 <tr>
    <td class="TableHeading">
        Catalog Options...
    </td>
 </tr>
 <% if (!isInternational) {%>
 <tr>
    <td>
        <base:imageLine height="1" width="100%"/>
    </td>
 </tr>
 <!-- Reading Program Searches -->
 <tr>
    <td>
        <table id="<%=SiteConfigurationCatalogSettingsForm.TABLE_READING_PROGRAM_SEARCHES %>">
            <tr>
                <td class="ColRowBold">
                    Reading Program Searches
                    <base:link page='<%="/backoffice/servlet/presentsiteconfigurationbaseform.do?districtMode=true&configModeID=" + UpdateConfigSiteDefaultsJobParams.SECTION_CAT_READING_PROGRAMS%>' id="<%=SiteConfigurationCatalogSettingsForm.ID_EDIT_CAT_READING_PROGRAMS%>">
                        <base:image src="/icons/general/edit_40.gif" width="40" height="16" alt="<%= SiteConfigurationCatalogSettingsForm.ALT_EDIT_CAT_READING_PROGRAMS%>"/>
                    </base:link>
                    
                </td>
            </tr>
            <tr>
                <td class="ColRow">
                    <ul>
                        <li>Supported Reading Program Searches: <%=params.getDisplayableReadingProgram()%></li>
                        <li>Support Lexile Measure Searches: <%=JSPHelper.gimmeBooleanAsText(params.isUseLexile())%></li>
                        <li>Support Fountas and Pinnell Searches: <%=JSPHelper.gimmeBooleanAsText(params.isUseFountasAndPinnell())%></li>
                    </ul>
                </td>
            </tr>
        </table>
    </td>
    </tr>
<%} %>    
     <tr>
        <td>
            <base:imageLine height="1" width="100%"/>
        </td>
     </tr>
    
    <!-- Library Title Display Settings -->
    <tr>
    <td>
        <table id="<%=SiteConfigurationCatalogSettingsForm.TABLE_LIBRARY_TITLE_DISPLAY_SETTINGS %>">
            <tr>
                <td class="ColRowBold">
                    Library Title Display Settings
                    <base:link page='<%="/backoffice/servlet/presentsiteconfigurationbaseform.do?districtMode=true&configModeID=" + UpdateConfigSiteDefaultsJobParams.SECTION_CAT_LIBRARY_TITLE%>' id="<%=SiteConfigurationCatalogSettingsForm.ID_EDIT_CAT_LIBRARY_TITLE%>">
                        <base:image src="/icons/general/edit_40.gif" width="40" height="16" alt="<%= SiteConfigurationCatalogSettingsForm.ALT_EDIT_CAT_LIBRARY_TITLE%>"/>
                    </base:link>
                    
                </td>
            </tr>
            <tr>
                <td class="ColRow">
                    <ul>
                        <li>Library reviews: <%=ConfigSiteSpecs.getDisplayReviewNameOptionAsString(params.getDisplayReviewNameOption())%></li>
                        <li>Display Visual Search results using: <%=params.getDisplayableVisualSearch()%></li>
                    <% if (!isInternational && !form.checkForFollettShelf()) {%>
                        <li>To read eBooks online, Guests must enter the password:&nbsp;
                            <%= (StringHelper.isEmptyOrWhitespace(params.getEBookGuestPassword())) ?
                                "Password not required" : params.getEBookGuestPassword() %>
                        </li>
                    <% } %>
                        <li>Arrange/display Title Detail sections as follows:</li>
                    </ul>
                </td>
            </tr>
            <tr>
                <td>
                    <table id="<%=SiteConfigurationCatalogSettingsForm.TABLE_TITLE_DETAIL_SECTION_ORDER%>">
                        <tr>
                            <td>&nbsp;</td>
                            <td class="SmallColHeading" align="center">Order</td>
                            <td class="SmallColHeading" align="center">Always Show</td>
                        </tr>    
                        <tr>
                            <td class="ColRow tdAlignRight">Explore</td>
                            <td class="ColRow" align="center"><%="" + params.getDetailExploreOrder()%></td>
                            <td class="ColRow" align="center"><%=JSPHelper.gimmeBooleanAsText(params.isDetailExploreAlwaysShow()) %></td>
                        </tr>    
                        <tr>
                            <td class="ColRow tdAlignRight">Quiz Info</td>
                            <td class="ColRow" align="center"><%="" + params.getDetailQuizInfoOrder()%></td>
                            <td class="ColRow" align="center"><%=JSPHelper.gimmeBooleanAsText(params.isDetailQuizInfoAlwaysShow()) %></td>
                        </tr>
                        <tr>
                            <td class="ColRow tdAlignRight">Publication Info</td>
                            <td class="ColRow" align="center"><%="" + params.getDetailPublicationInfoOrder()%></td>
                            <td class="ColRow" align="center"><%=JSPHelper.gimmeBooleanAsText(params.isDetailPublicationInfoAlwaysShow()) %></td>
                        </tr>
                        <tr>
                            <td class="ColRow tdAlignRight">Additional Info</td>
                            <td class="ColRow" align="center"><%="" + params.getDetailAdditionalInfoOrder()%></td>
                            <td class="ColRow" align="center"><%=JSPHelper.gimmeBooleanAsText(params.isDetailAdditionalInfoAlwaysShow()) %></td>
                        </tr>
                        <logic:equal name="<%= SiteConfigurationCatalogSettingsForm.FORM_NAME %>" property="awardsEnabled" value="true" >
                        <tr>
                            <td class="ColRow tdAlignRight">Awards</td>
                            <td class="ColRow" align="center"><%="" + params.getDetailAwardsOrder()%></td>
                            <td class="ColRow" align="center"><%=JSPHelper.gimmeBooleanAsText(params.isDetailAwardsAlwaysShow()) %></td>
                        </tr>
                        </logic:equal>      
                    </table>
                </td>
                
            </tr>
        </table>
    </td>
    </tr>
<% if (!isInternational) { %>    
     <tr>
        <td>
            <base:imageLine height="1" width="100%"/>
        </td>
     </tr>
    <tr>
    <td>
        <table id="<%=SiteConfigurationCatalogSettingsForm.TABLE_SUPPORTED_SEARCH_LANGUAGES %>">
            <tr>
                <td class="ColRowBold">
                    Supported Search Languages
                    <base:link page='<%="/backoffice/servlet/presentsiteconfigurationbaseform.do?districtMode=true&configModeID=" + UpdateConfigSiteDefaultsJobParams.SECTION_CAT_SEARCH_LANGUAGES%>' id="<%=SiteConfigurationCatalogSettingsForm.ID_SUPPORTED_SEARCH_LANGUAGES%>">
                        <base:image src="/icons/general/edit_40.gif" width="40" height="16" alt="<%= SiteConfigurationCatalogSettingsForm.ALT_SUPPORTED_SEARCH_LANGUAGES%>"/>
                    </base:link>
                    
                </td>
            </tr>
            <tr>
                <td class="ColRow">
                    <ul>
                        <li>English:&nbsp;Yes&nbsp;<%=params.getLanguageDefaultDisplayable(LanguageType.ENGLISH) %></li>
                        <li>French:&nbsp;<%=JSPHelper.gimmeBooleanAsText(params.isAllowFrench())%>&nbsp;<%=params.getLanguageDefaultDisplayable(LanguageType.FRENCH) %></li>
                        <li>Spanish:&nbsp;<%=JSPHelper.gimmeBooleanAsText(params.isAllowSpanish())%>&nbsp;<%=params.getLanguageDefaultDisplayable(LanguageType.SPANISH) %></li>
                    </ul>
                </td>
            </tr>
        </table>
    </td>
    </tr>
<%} %>    
     <tr>
        <td>
            <base:imageLine height="1" width="100%"/>
        </td>
     </tr>
    <tr>
    <td>
        <table id="<%=SiteConfigurationCatalogSettingsForm.TABLE_LIBRARY_INVENTORY_OPTIONS %>">
            <tr>
                <td class="ColRowBold">
                    Library Inventory Options
                    <base:link page='<%="/backoffice/servlet/presentsiteconfigurationbaseform.do?districtMode=true&configModeID=" + UpdateConfigSiteDefaultsJobParams.SECTION_CAT_INVENTORY%>' id="<%=SiteConfigurationCatalogSettingsForm.ID_LIBRARY_INVENTORY_OPTIONS%>">
                        <base:image src="/icons/general/edit_40.gif" width="40" height="16" alt="<%= SiteConfigurationCatalogSettingsForm.ALT_LIBRARY_INVENTORY_OPTIONS%>"/>
                    </base:link>
                    
                </td>
            </tr>
            <tr>
                <td class="ColRow">
                    <ul>
                        <li>Shelf order verified based on: <%=params.getInventoryCheckShelfOrderDisplayable() %></li>
                        <li>Identify variances between Dewey Numbers: <%=params.getInventoryDifferencesInDeweyDisplayable() %></li>
                    </ul>
                </td>
            </tr>
        </table>
    </td>
    </tr>
     <tr>
        <td>
            <base:imageLine height="1" width="100%"/>
        </td>
     </tr>
    <tr>
    <td>
        <table id="<%=SiteConfigurationCatalogSettingsForm.TABLE_MISCELLANEOUS_SETTINGS %>">
            <tr>
                <td class="ColRowBold">
                    Miscellaneous Settings
                    <base:link page='<%="/backoffice/servlet/presentsiteconfigurationbaseform.do?districtMode=true&configModeID=" + UpdateConfigSiteDefaultsJobParams.SECTION_CAT_MISCELLANEOUS%>' id="<%=SiteConfigurationCatalogSettingsForm.ID_MISCELLANEOUS_SETTINGS%>">
                        <base:image src="/icons/general/edit_40.gif" width="40" height="16" alt="<%= SiteConfigurationCatalogSettingsForm.ALT_MISCELLANEOUS_SETTINGS%>"/>
                    </base:link>
                    
                </td>
            </tr>
            <tr>
                <td class="ColRow">
                    <ul>
                        <li>Support Reading Level and Interest Level Searches: <%=JSPHelper.gimmeBooleanAsText(params.isAllowReadingLevelAndInterestLevelSearches()) %></li>
                        <li>By default, show limiter options in Basic Search: <%=JSPHelper.gimmeBooleanAsText(params.isDefaultBasicSearchToShowMore()) %></li>
                        <li>When the last copy of a library title is deleted, remove the title from this library's collection: <%=JSPHelper.gimmeBooleanAsText(params.isCleanupTitleOnCopyDelete()) %></li>
                        <logic:equal name="<%= SiteConfigurationCatalogSettingsForm.FORM_NAME %>" property="displayBasicSearchData" value="true" >
                            <li>Store search statistics data for <%=params.getStoreBasicSearchTermLength() %> months prior to the current month: <%=JSPHelper.gimmeBooleanAsText( params.isStoreBasicSearchTermData()) %></li>
                            <ul>
                            <li>Enable search suggestions in Destiny Quest: <%=JSPHelper.gimmeBooleanAsText( params.isEnableSearchSuggestionsInQuest()) %></li>
                            </ul>
                        </logic:equal>
                        <li><%= SiteConfigurationCatalogSettingsForm.CONST_MISC_INCLUDE_NEW_ARRIVALS_IN_QUEST %>: <%=JSPHelper.gimmeBooleanAsText( params.isIncludeNewArrivalsInQuest()) %></li>
                        <li>Ignore leading articles in search terms when browsing for (or reporting on) titles: <%=JSPHelper.gimmeBooleanAsText( params.isSkipLeadingArticlesInSearchTerms()) %></li>
                        <% if (!isInternational) { %>
                        <li><%= UpdateConfigSiteDefaultsJobParams.CONST_MISC_DEFAULT_QUEST_THEME %>: <%=params.getDisplayableDefaultQuestTheme()%></li>
                        <%} %>
                        <li>Safari Montage Results display with: <%= ConfigSiteSpecs.SAFARI_SORT_SETTINGS[params.getSafariDisplayFlag()] %></li>
                        <li>Where applicable, by default, sort search results by: <%= params.getDefaultSearchSortOrderDisplayable() %></li>
                        <% if (!isInternational) { %>
                        <li>Show WebPath Express monthly themes and Spotlights: <%=JSPHelper.gimmeBooleanAsText( params.isAllowWebPathExpressThemes()) %></li>
                        <%} %>
                    </ul>
                </td>
            </tr>
        </table>
    </td>
    </tr>
 
</base:outlinedTableAndTabsWithinThere>

</base:form>

