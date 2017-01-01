<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.SiteConfigurationBaseForm" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.ConfigSiteSpecs"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@page import="com.follett.fsc.destiny.util.FollettEBookSpecs"%>

<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>


<%
    SiteConfigurationBaseForm form = (SiteConfigurationBaseForm)request.getAttribute(SiteConfigurationBaseForm.FORM_NAME);
    boolean isInternational = UserContext.getMyContextLocaleHelper().isInternationalProduct();
%>


<tr>
    <td>
        <table id="<%=SiteConfigurationBaseForm.TABLE_TITLE_DISPLAY%>" width="100%" cellpadding="5" cellspacing="0">
            <tr>
                <td class="TableHeading" valign="top">&nbsp;<%=MessageHelper.formatMessage("siteconfigcatlibrarytitle_LibraryTitleDisplaySettings") %></td>
            </tr>
            <tr>
                <td><base:imageLine height="1" width="100%" /></td>
            </tr>
        <% if (isInternational) { %>
            <tr>
                <td class="ColRowBold"><%=MessageHelper.formatMessage("siteconfigcatlibrarytitle_LibraryReviews") %>&nbsp;<html:select property="<%= SiteConfigurationBaseForm.FIELD_CAT_INCLUDE_PATRON_FOR_REVIEW %>" >
                            <html:option value='<%= "" +ConfigSiteSpecs.DISPLAY_REVIEW_NAME_OPTION_DO_NOT_SHOW%>'><%=MessageHelper.formatMessage("siteconfigcatlibrarytitle_DontIncludeTheReviewersName") %></html:option>
                            <html:option value='<%= "" +ConfigSiteSpecs.DISPLAY_REVIEW_NAME_OPTION_SHOW_FULL_NAME%>'><%=MessageHelper.formatMessage("siteconfigcatlibrarytitle_IncludeTheReviewersFullName") %></html:option>
                        </html:select>
                        
                        <base:helpTag
                            helpFileName="d_include_reviewer_name.htm" />
                </td>
            </tr>
        <% } else { %>
            <tr>
                <td class="ColRowBold"><%=MessageHelper.formatMessage("siteconfigcatlibrarytitle_LibraryReviews") %>&nbsp;<html:select property="<%= SiteConfigurationBaseForm.FIELD_CAT_INCLUDE_PATRON_FOR_REVIEW %>" >
                            <html:option value='<%= "" +ConfigSiteSpecs.DISPLAY_REVIEW_NAME_OPTION_DO_NOT_SHOW%>'><%=MessageHelper.formatMessage("siteconfigcatlibrarytitle_DontIncludeTheReviewersName") %></html:option>
                            <html:option value='<%= "" +ConfigSiteSpecs.DISPLAY_REVIEW_NAME_OPTION_SHOW_FULL_NAME%>'><%=MessageHelper.formatMessage("siteconfigcatlibrarytitle_IncludeTheReviewersFullName") %></html:option>
                            <html:option value='<%= "" +ConfigSiteSpecs.DISPLAY_REVIEW_NAME_OPTION_SHOW_FIRST_NAME_LAST_INITIAL%>'><%=MessageHelper.formatMessage("siteconfigcatlibrarytitle_IncludeTheReviewersFirstNameLastInitial") %></html:option>
                            <html:option value='<%= "" +ConfigSiteSpecs.DISPLAY_REVIEW_NAME_OPTION_SHOW_INITIALS%>'><%=MessageHelper.formatMessage("siteconfigcatlibrarytitle_IncludeTheReviewersInitialsOnly") %></html:option>
                        </html:select>
                        
                        <base:helpTag
                            helpFileName="d_include_reviewer_name.htm" />
                </td>
            </tr>
        <% } %>
            <tr>
                <td><base:imageLine height="1" width="100%" /></td>
            </tr>
            <tr>
                <td class="ColRowBold"><%=MessageHelper.formatMessage("siteconfigcatlibrarytitle_DisplayVisualSearchResultsUsing") %>&nbsp;<base:helpTag helpFileName="d_display_visual_search_results.htm"/></td>
            </tr>
            <tr>
               <td class="ColRow">
                    &nbsp;&nbsp;<html:radio property="<%=SiteConfigurationBaseForm.FIELD_CAT_VISUAL_SEARCH_DISPLAY%>" value="<%=SiteConfigurationBaseForm.RADIO_STANDARD_VISUAL_INTERFACE%>">
                    </html:radio><%=MessageHelper.formatMessage("siteconfigcatlibrarytitle_StandardInterface") %><br>
                    &nbsp;&nbsp;<html:radio property="<%=SiteConfigurationBaseForm.FIELD_CAT_VISUAL_SEARCH_DISPLAY%>" value="<%=SiteConfigurationBaseForm.RADIO_STANDARD_ELEMENTARY_INTERFACE%>">
                    </html:radio><%=MessageHelper.formatMessage("siteconfigcatlibrarytitle_ElementaryInterface") %>
               </td>
            </tr>
            <tr>
                <td><base:imageLine height="1" width="100%" /></td>
            </tr>
            <tr>
                <td class="ColRowBold"><%=MessageHelper.formatMessage("siteconfigcatlibrarytitle_ArrangeDisplayRecordSectionsAsFollows") %>&nbsp;<base:helpTag helpFileName="d_title_details_limit_sort.htm"/></td>
            </tr>
            <tr>
                <td>            
                    <table id="<%=SiteConfigurationBaseForm.TABLE_TITLE_DETAIL%>">
                        <tr>
                            <td>&nbsp;&nbsp;</td>
                            <td class=SmallColHeading>&nbsp;</td>
                            <td class=SmallColHeading align="center"><%=MessageHelper.formatMessage("siteconfigcatlibrarytitle_Order") %></td>
                            <td class=SmallColHeading align="center"><%=MessageHelper.formatMessage("siteconfigcatlibrarytitle_AlwaysShow") %></td>
                        
                        </tr>
                        <tr>
                            <td>&nbsp;&nbsp;</td>
                            <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("siteconfigcatlibrarytitle_Explore") %></td>
                            <td><html:text property="<%=SiteConfigurationBaseForm.FIELD_CAT_DETAIL_EXPLORE_ORDER%>" size="4" maxlength="1"/></td>
                            <td align="center"><html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_CAT_DETAIL_EXPLORE_SHOW%>"/></td>
                        </tr>
                         <tr>
                            <td>&nbsp;&nbsp;</td>
                            <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("siteconfigcatlibrarytitle_QuizInfo") %></td>
                            <td><html:text property="<%=SiteConfigurationBaseForm.FIELD_CAT_DETAIL_QUIZ_INFO_ORDER%>" size="4" maxlength="1"/></td>
                            <td align="center"><html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_CAT_DETAIL_QUIZ_INFO_SHOW%>"/></td>
                        </tr>
                         <tr>
                            <td>&nbsp;&nbsp;</td>
                            <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("siteconfigcatlibrarytitle_PublicationInfo") %></td>
                            <td><html:text property="<%=SiteConfigurationBaseForm.FIELD_CAT_DETAIL_PUBLICATION_INFO_ORDER%>" size="4" maxlength="1"/></td>
                            <td align="center"><html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_CAT_DETAIL_PUBLICATION_INFO_SHOW%>"/></td>
                        </tr>
                        
                         <tr>
                            <td>&nbsp;&nbsp;</td>
                            <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("siteconfigcatlibrarytitle_AdditionalInfo") %></td>
                            <td><html:text property="<%=SiteConfigurationBaseForm.FIELD_CAT_DETAIL_ADDITIONAL_INFO_ORDER%>" size="4" maxlength="1"/></td>
                            <td align="center"><html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_CAT_DETAIL_ADDITIONAL_INFO_SHOW%>"/></td>
                        </tr>
                        <c:if test="<%=form.isAllowAwardWinners()%>">
                             <tr>
                                <td>&nbsp;&nbsp;</td>
                                <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("siteconfigcatlibrarytitle_Awards") %></td>
                                <td><html:text property="<%=SiteConfigurationBaseForm.FIELD_CAT_DETAIL_AWARDS_ORDER%>" size="4" maxlength="1"/></td>
                                <td align="center"><html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_CAT_DETAIL_AWARDS_SHOW%>"/></td>
                            </tr>
                        </c:if>
                    </table>
                </td>
             </tr>
         <% if (!isInternational && !form.checkForFollettShelf()) {%>
            <tr>
                <td><base:imageLine height="1" width="100%" /></td>
            </tr>
            <tr>
                <td class="ColRowBold"><%=MessageHelper.formatMessage("siteconfigcatlibrarytitle_ToReadEbooksOnlineGuestsMustEnterThePassword") %>&nbsp;<html:text property="<%=SiteConfigurationBaseForm.FIELD_CAT_DETAIL_PREVIEW_EBOOKS_GUEST_PASSWORD %>" maxlength="50" size="20"/>&nbsp;
                </td>
            </tr>
         <% } %>
        </table>
    </td>
</tr>
