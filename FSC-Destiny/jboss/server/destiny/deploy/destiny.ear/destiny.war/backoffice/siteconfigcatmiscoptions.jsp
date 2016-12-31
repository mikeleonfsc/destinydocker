<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.SiteConfigurationBaseForm" %>
<%@page import="com.follett.fsc.destiny.entity.ejb3.ConfigSiteSpecs"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.remote.data.UpdateConfigSiteDefaultsJobParams"%>
<%@page import="com.follett.fsc.destiny.util.vopac.DestinyQuestThemes"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>


<%
    SiteConfigurationBaseForm form = (SiteConfigurationBaseForm)request.getAttribute(SiteConfigurationBaseForm.FORM_NAME);
    boolean isInternational = UserContext.getMyContextLocaleHelper().isInternationalProduct();
%>


<tr>
    <td>
        <table id="<%=SiteConfigurationBaseForm.TABLE_MISC_SETTINGS%>" width="100%" cellpadding="5" cellspacing="0">
            <tr>
                <td class="TableHeading" valign="top">&nbsp;<%=MessageHelper.formatMessage("siteconfigcatmiscoptions_MiscellaneousSettings") %></td>
            </tr>
            <tr>
                <td><base:imageLine height="1" width="100%" /></td>
            </tr>
            <tr>
                <td class="ColRowBold">
                    <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_CAT_MISC_ALLOW_READING_LEVEL_AND_INTEREST_LEVEL_SEARCHES%>">
                        Support Reading Level and Interest Level Searches  
                   </html:checkbox>
                   <base:helpTag helpFileName="d_support_reading_interest_lvl_srch.htm"/>
                </td>
            </tr>
            <tr>
            <tr>
                <td class="ColRowBold">
                    <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_CAT_MISC_DEFAULT_BASIC_SEARCH_TO_SHOW_MORE%>">
                        By default, show limiter options in Basic Search  
                   </html:checkbox>
                   <base:helpTag helpFileName="d_limiter_options_basic_search.htm"/>
                </td>
            </tr>
            <tr>
                <td class="ColRowBold">
                    <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_CAT_MISC_CLEANUP_TITLE%>">
                        <%=MessageHelper.formatMessage("siteconfigcatmiscoptions_WhenTheLastCopyOfALibraryTitleIsDeletedRemoveThe") %>
                   </html:checkbox>
                   <base:helpTag helpFileName="d_delete_last_copy_deletes_title.htm"/>
                </td>
            </tr>
	       <logic:equal name="<%= SiteConfigurationBaseForm.FORM_NAME %>" property="displayBasicSearchData" value="true" >
                <tr>
                    <td><base:imageLine height="1" width="100%" /></td>
                </tr>
                <tr>
                    <td class="ColRowBold">
                        <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_CAT_MISC_STORE_BASIC_SEARCH_TERM_DATA%>"><%=MessageHelper.formatMessage("siteconfigcatmiscoptions_StoreSearchStatisticsDataFor") %>&nbsp;</html:checkbox>
                        <html:text property="<%=SiteConfigurationBaseForm.FIELD_CAT_MISC_STORE_BASIC_SEARCH_TERM_LENGTH%>" size="4" maxlength="2"/>
                        &nbsp;<%=MessageHelper.formatMessage("siteconfigcatmiscoptions_MonthsPriorToTheCurrentMonth") %>&nbsp;<base:helpTag helpFileName="d_store_basicsearch_data.htm"/>
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold">
                        <ul>
                        <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_CAT_MISC_ENABLE_SEARCH_SUGGESTIONS_IN_QUEST%>"><%=MessageHelper.formatMessage("siteconfigcatmiscoptions_EnableSearchSuggestionsInDestinyQuest") %></html:checkbox>
                         <base:helpTag helpFileName="d_dq_search_suggestions.htm"/>                         
                        </ul>
                    </td>
                </tr>
           </logic:equal>
            <tr>
                <td><base:imageLine height="1" width="100%" /></td>
            </tr>
            <tr>
                <td class="ColRowBold">
                    <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_CAT_MISC_SHOW_NEW_ARRIVALS%>"><%=MessageHelper.formatMessage("siteconfigcatmiscoptions_ShowNewArrivalsInDestinyQuest") %></html:checkbox>&nbsp;<base:helpTag helpFileName="d_dq_show_new_arrivals.htm"/>
                </td>
            </tr>
            <tr>
                <td class="ColRowBold">
                    <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_CAT_MISC_SKIP_LEADING_ARTICLES%>"><%=MessageHelper.formatMessage("siteconfigcatmiscoptions_IgnoreLeadingArticlesInSearchTermsWhenBrowsingForO") %></html:checkbox>&nbsp;<base:helpTag helpFileName="d_ignore_leading_articles.htm"/>
                </td>
            </tr>
            <% if (!isInternational) {%>
            <tr>
                <td><base:imageLine height="1" width="100%" /></td>
            </tr>
                <tr>
                    <td class="ColRowBold"><%=UpdateConfigSiteDefaultsJobParams.CONST_MISC_DEFAULT_QUEST_THEME %>:
                    &nbsp;<base:helpTag helpFileName="d_dq_theme.htm"/>
                    </td>
                </tr>
                <tr>
                   <td class="ColRow">
                        <c:forEach items="<%=DestinyQuestThemes.THEMES%>" var="theme">
                            &nbsp;&nbsp;<html:radio property="<%=SiteConfigurationBaseForm.FIELD_DEFAULT_QUEST_THEME%>" value="${theme.cssFolder}">
                            </html:radio>${theme.label}<br>
                        </c:forEach>
                   </td>
                </tr>
            <%} else {%>
                <html:hidden property="<%=SiteConfigurationBaseForm.FIELD_DEFAULT_QUEST_THEME%>" value="<%=DestinyQuestThemes.THEME_BLUEMAZE.getCssFolder() %>"/>
            <% } %>  
                <tr>
                    <td class="ColRowBold" colspan="2"><%=MessageHelper.formatMessage("siteconfigcatalog_ShowPatronPicturesToMyQuest") %>&nbsp;
                        <html:select property="<%= SiteConfigurationBaseForm.FIELD_DISPLAY_MYQUEST_PATRON_PICTURES %>" >
                            <html:option value="<%=String.valueOf( ConfigSiteSpecs.DISPLAY_MYQUEST_PATRON_PICTURES_ALWAYS) %>"><%=MessageHelper.formatMessage("siteconfigcatalog_ShowPatronPicturesToMyQuest_Always")%></html:option>
                            <html:option value="<%=String.valueOf(ConfigSiteSpecs.DISPLAY_MYQUEST_PATRON_PICTURES_FOR_FRIENDS) %>"><%=MessageHelper.formatMessage("siteconfigcatalog_ShowPatronPicturesToMyQuest_OnlyForFriends")%></html:option>
                            <html:option value="<%=String.valueOf(ConfigSiteSpecs.DISPLAY_MYQUEST_PATRON_PICTURES_NEVER) %>"><%=MessageHelper.formatMessage("siteconfigcatalog_ShowPatronPicturesToMyQuest_Never")%></html:option>
                        </html:select>
                    </td>
                </tr>    
                
            <tr>
                <td><base:imageLine height="1" width="100%" /></td>
            </tr>
            <tr>
               <td colspan = "2" class = "ColRowBold">
                  <html:checkbox property="<%= SiteConfigurationBaseForm.FIELD_CAT_MISC_SAFARI_DISPLAY_DIGITAL %>"><%= MessageHelper.formatMessage("siteconfigcatalog_DisplaySafariMontageResultsWithDigitalResources") %></html:checkbox> <base:helpTag helpFileName="d_display_safari_montage_titles.htm" /><br/>
                  <html:checkbox property="<%= SiteConfigurationBaseForm.FIELD_CAT_MISC_SAFARI_DISPLAY_TITLES %>"><%= MessageHelper.formatMessage("siteconfigcatalog_DisplaySafariMontageResultsWithTitles") %></html:checkbox>
               </td>
            </tr>
            <tr>
                <td><base:imageLine height="1" width="100%" /></td>
            </tr>
            <tr>
                <td class="ColRowBold">
                    <%=MessageHelper.formatMessage("siteconfigcatmiscoptions_WhereApplicableByDefaultSortSearchResultsBy", form.buildDefaultSearchSortCombobox()) %>
                    &nbsp;<base:helpTag helpFileName="d_sort_search_results.htm"/>
                </td>
            </tr>
    <% if (!isInternational) { %>            
            <tr>
                <td colspan="2"><base:imageLine height="1" width="100%" /></td>
            </tr>
            <tr>
                <td colspan="2" class="ColRowBold"><html:checkbox
                    property="<%=SiteConfigurationBaseForm.FIELD_ALLOW_WEB_PATH_EXPRESS_THEMES%>">
                    <%=MessageHelper.formatMessage("siteconfigcatmiscoptions_ShowWebPathExpressMonthlyThemes") %>
                </html:checkbox>&nbsp;<base:helpTag
                    helpFileName="d_webpath_suggestions_themes_spotlght.htm" />
                </td>
            </tr>
    <%} else {%>
    <html:hidden property="<%=SiteConfigurationBaseForm.FIELD_ALLOW_WEB_PATH_EXPRESS_THEMES%>"/>
    <%} %>            
            
        </table>
    </td>
</tr>
