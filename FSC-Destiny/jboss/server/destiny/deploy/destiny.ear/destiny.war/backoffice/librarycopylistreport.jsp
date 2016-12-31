<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.data.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.*" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>


<%
    LibraryCopyListReportForm form = (LibraryCopyListReportForm)request.getAttribute(LibraryCopyListReportForm.FORM_NAME);
%>

<SCRIPT LANGUAGE="javascript" TYPE="text/javascript">
<!--
    function submitTheForm() {
        document.<%=LibraryCopyListReportForm.FORM_NAME%>.submit();
    }
// -->
</SCRIPT>

<base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handlelibrarycopylistreportform.do">
<html:hidden property="<%=LibraryCopyListReportForm.FIELD_JOB_SPEC_ID%>"/>
<html:hidden property="<%=LibraryCopyListReportForm.FIELD_ACTION%>"/>
<html:hidden property="<%=LibraryCopyListReportForm.PARAM_REPORT_NAME%>"/>
<html:hidden property="<%=LibraryCopyListReportForm.FIELD_SELECTED_LIST_ID%>"/>

<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">

<base:outlinedTableAndTabsWithinThere borderColor="#c0c0c0" id="<%=LibraryCopyListReportForm.TABLE_LIBRARY_TITLE_COPY_LIST_REPORT%>" selectedTab="<%=form.getLeftTab().getAltText()%>" selectedTabID="<%=form.getLeftTab().getName() %>" tabs="<%=form.getTabs()%>">
    <tr>
        <td colspan="2" class="TableHeading">
            <%=ResponseUtils.filter(form.getReportHeading())%>
        </td>
    </tr>
    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>

    <base:isDistrictUser>
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top"><%= MessageHelper.formatMessage("librarycopylistreport_For") %></td>
        <td class="ColRow">
            <base:selectSite 
                includeAllLibraries="true" 
                submitOnChange="true" 
                name="<%=LibraryCopyListReportForm.FIELD_SITE_ID%>" 
                selectedSiteID='<%= form.getReportSiteID().toString()%>'
                includeLibrarySites="true"
                includeTextbookSites="false"
                includeMediaSites="false"
                includeAssetSites="false"
                />
        </td>
    </tr>
    <tr>
        <td>
            &nbsp;
        </td>
        <td class="Instruction"><%= MessageHelper.formatMessage("librarycopylistreport_IfYouDoNotSelectASpecificSiteYourOutputWillBeLimit") %></td>
    </tr>
    </base:isDistrictUser>
    <base:isNotDistrictUser>
        <html:hidden property="<%=LibraryCopyListReportForm.FIELD_SITE_ID%>"/>
    </base:isNotDistrictUser>

    <tr>
        <td class="ColRowBold tdAlignRight" valign="top">
            <nobr><%= MessageHelper.formatMessage("librarycopylistreport_SelectBy") %></nobr>
        </td>
        <td class="ColRow">
            <html:select onchange="javascript:submitTheForm()" property="<%=LibraryCopyListReportForm.FIELD_SELECT_AND_SORT_BY%>">
                <html:option value="<%=LibraryTitleCopyReportJobParams.SELECT_SORT_BY_TITLE%>"><%= MessageHelper.formatMessage("librarycopylistreport_Title") %></html:option>
                <logic:notEqual name="<%=LibraryCopyListReportForm.FORM_NAME%>" property="<%=BaseCopyListReportForm.FIELD_SITE_ID%>" value="<%=ConfigSiteSpecs.SITE_ID_MY_DISTRICT.toString()%>">
                    <% if (!form.isMediaBookingUser()) { %>
                      <html:option value="<%=LibraryTitleCopyReportJobParams.SELECT_SORT_BY_CIRCTYPE%>"><%= MessageHelper.formatMessage("librarycopylistreport_CirculationType") %></html:option>
                    <% } %>
                </logic:notEqual>
                <html:option value="<%=LibraryTitleCopyReportJobParams.SELECT_SORT_BY_CATEGORY%>"><%= MessageHelper.formatMessage("librarycopylistreport_Category") %></html:option>
                <html:option value="<%=LibraryTitleCopyReportJobParams.SELECT_SORT_BY_DATE_COPY_ADDED%>"><%= MessageHelper.formatMessage("librarycopylistreport_DateCopiesAdded") %></html:option>
                <html:option value="<%=LibraryTitleCopyReportJobParams.SELECT_SORT_BY_DATE_TITLE_ADDED%>"><%= MessageHelper.formatMessage("librarycopylistreport_DateTitleAdded") %></html:option>
                <html:option value="<%=LibraryTitleCopyReportJobParams.SELECT_SORT_BY_DATE_TITLE_UPDATED%>"><%= MessageHelper.formatMessage("librarycopylistreport_DateTitleUpdated") %></html:option>
                <c:choose>
                    <c:when test="<%=form.getSelectedListID() != null%>">
                        <html:option value="<%=LibraryTitleCopyReportJobParams.SELECT_SORT_BY_RESOURCE_LIST%>"><%= MessageHelper.formatMessage("librarycopylistreport_List") %></html:option>
                    </c:when>
                    <c:otherwise>
                        <c:choose>
                            <c:when test="<%=form.isMediaBookingUser()%>">
                                <base:spanIfAllowed useCanDo="true" permission="<%=Permission.CAT_ACCESS_BOOKLIST_MEDIA%>">
                                    <html:option value="<%=LibraryTitleCopyReportJobParams.SELECT_SORT_BY_RESOURCE_LIST%>"><%= MessageHelper.formatMessage("librarycopylistreport_List") %></html:option>
                                </base:spanIfAllowed>
                            </c:when>
                            <c:otherwise>
                                <base:spanIfAllowed useCanDo="true" permission="<%=Permission.CAT_ACCESS_BOOKLIST%>">
                                    <html:option value="<%=LibraryTitleCopyReportJobParams.SELECT_SORT_BY_RESOURCE_LIST%>"><%= MessageHelper.formatMessage("librarycopylistreport_List") %></html:option>
                                </base:spanIfAllowed>
                            </c:otherwise>
                        </c:choose>                
                    </c:otherwise>
                </c:choose>
            </html:select>
            <logic:equal name="<%=LibraryCopyListReportForm.FORM_NAME%>" property="<%=BaseCopyListReportForm.FIELD_SELECT_AND_SORT_BY%>" value="<%=LibraryTitleCopyReportJobParams.SELECT_SORT_BY_TITLE%>">
                &nbsp;<%=MessageHelper.formatMessage("librarycopylistreport_From") %>&nbsp;
                <html:text property="<%=LibraryCopyListReportForm.FIELD_SELECT_AND_SORT_BY_FROM%>" size="9" maxlength="<%=LibraryCopyListReportForm.LENGTH_RANGE_FIELD%>"/>
                &nbsp;<%=MessageHelper.formatMessage("librarycopylistreport_To") %>&nbsp;
                <html:text property="<%=LibraryCopyListReportForm.FIELD_SELECT_AND_SORT_BY_TO%>" size="9" maxlength="<%=LibraryCopyListReportForm.LENGTH_RANGE_FIELD%>"/>
            </logic:equal>

            <logic:equal name="<%=LibraryCopyListReportForm.FORM_NAME%>" property="<%=BaseCopyListReportForm.FIELD_SELECT_AND_SORT_BY%>" value="<%=LibraryTitleCopyReportJobParams.SELECT_SORT_BY_RESOURCE_LIST%>">
                <base:myListSelect name="<%= LibraryCopyListReportForm.FIELD_INCLUDE_VALUE%>" prompt="&nbsp;" publicList="false" selectedMyListID="<%=form.getIncludeValue()%>" additionalListID="<%=form.getSelectedListID()%>"/>
                <base:isDestinyAdminNotLoggedIn>
                    <base:genericButton name="<%=LibraryCopyListReportForm.BUTTON_VIEW_LIST%>" src="/buttons/large/viewlist.gif" 
                        alt='<%= MessageHelper.formatMessage("viewList") %>' absbottom="true"></base:genericButton>
                </base:isDestinyAdminNotLoggedIn>
            </logic:equal>
            <logic:equal name="<%=LibraryCopyListReportForm.FORM_NAME%>" property="showDateField" value="true">
                <html:select property="<%=LibraryCopyListReportForm.FIELD_DATE_MODE%>">
                    <html:option value='<%="" + LibraryTitleCopyReportJobParams.DATE_MODE_AFTER_THE_DATE%>'><%= MessageHelper.formatMessage("librarycopylistreport_AfterTheDate") %></html:option>
                    <html:option value='<%="" + LibraryTitleCopyReportJobParams.DATE_MODE_ON_THIS_DATE%>'><%= MessageHelper.formatMessage("librarycopylistreport_OnTheDate") %></html:option>
                    <html:option value='<%="" + LibraryTitleCopyReportJobParams.DATE_MODE_BEFORE_THE_DATE%>'><%= MessageHelper.formatMessage("librarycopylistreport_BeforeTheDate") %></html:option>
                </html:select>
                &nbsp;:&nbsp;
                <base:date 
                    buttonName = "<%=LibraryCopyListReportForm.BUTTON_CALENDAR%>"
                    fieldName = "<%=LibraryCopyListReportForm.FIELD_DATE_FIELD%>"
                    dateValue = "<%=form.getDateField()%>"
                />
            </logic:equal>
        </td>
    </tr>
    <logic:equal property="showInclude" name="<%=LibraryCopyListReportForm.FORM_NAME%>" value="true">
        <tr>
            <td class="ColRowBold tdAlignRight" valign="top"><%= MessageHelper.formatMessage("librarycopylistreport_Include") %></td>
            <td class="ColRow">
                <c:choose>
                    <c:when test="<%=LibraryTitleCopyReportJobParams.SELECT_SORT_BY_CATEGORY.equals(form.getSelectAndSortBy())%>">
                        <base:categorySelect name="<%=LibraryCopyListReportForm.FIELD_INCLUDE_VALUE%>" 
                         collectionType="<%=form.getCollectionType()%>" siteID="<%=form.getReportSiteID()%>"
                         showAllOptionText="true" showDistrictCategories="<%= form.getStore().isDistrictUser() %>"
                         selectedCategoryID="<%=form.getIncludeValue() %>" />
                    </c:when>
                    <c:otherwise>
                        <bean:define id="includeOptions" name="<%= LibraryCopyListReportForm.FORM_NAME %>" property="includeOptions"/>
                        <html:select property="<%=LibraryCopyListReportForm.FIELD_INCLUDE_VALUE%>">
                            <html:options collection="includeOptions" property="longID" labelProperty="stringDesc"/>
                        </html:select>
                    </c:otherwise>
                </c:choose>
            </td>
        </tr>
    </logic:equal>
    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top">
            <nobr><%= MessageHelper.formatMessage("librarycopylistreport_ShowTitles") %></nobr>
        </td>
        <td class="ColRow">
            <html:select onchange="javascript:submitTheForm()" property="<%=LibraryCopyListReportForm.FIELD_SHOW_DETAILS_FOR%>">
                <html:option value="<%=LibraryTitleCopyReportJobParams.SHOW_DETAILS_TITLES_ONLY%>"><%= MessageHelper.formatMessage("librarycopylistreport_Only") %></html:option>
                <html:option value="<%=LibraryTitleCopyReportJobParams.SHOW_DETAILS_ALL_COPIES%>"><%= MessageHelper.formatMessage("librarycopylistreport_WithAllCopies") %></html:option>
                <html:option value="<%=LibraryTitleCopyReportJobParams.SHOW_DETAILS_AVAILABLE_COPIES%>"><%= MessageHelper.formatMessage("librarycopylistreport_WithAvailableCopies") %></html:option>
                <html:option value="<%=LibraryTitleCopyReportJobParams.SHOW_DETAILS_CHECKED_OUT_COPIES%>"><%= MessageHelper.formatMessage("librarycopylistreport_WithCheckedOutCopies") %></html:option>
                <html:option value="<%=LibraryTitleCopyReportJobParams.SHOW_DETAILS_COPIES_LOANED_OUT%>"><%= MessageHelper.formatMessage("librarycopylistreport_WithCopiesLoanedOut") %></html:option>
                <% if (!form.isMediaBookingUser()) { %>
                  <html:option value="<%=LibraryTitleCopyReportJobParams.SHOW_DETAILS_ALL_COPIES_ON_HOLD%>"><%= MessageHelper.formatMessage("librarycopylistreport_WithCopiesOnHold") %></html:option>
                <% } %>
                <html:option value="<%=LibraryTitleCopyReportJobParams.SHOW_DETAILS_COPIES_ON_ORDER%>"><%= MessageHelper.formatMessage("librarycopylistreport_WithCopiesOnOrder") %></html:option>
                <html:option value="<%=LibraryTitleCopyReportJobParams.SHOW_DETAILS_COPIES_OUT_FOR_REPAIRS%>"><%= MessageHelper.formatMessage("librarycopylistreport_WithCopiesOutForRepairs") %></html:option>
                <% if (!form.isMediaBookingUser()) { %>
                <html:option value="<%=LibraryTitleCopyReportJobParams.SHOW_DETAILS_COPIES_IN_TRANSIT%>"><%= MessageHelper.formatMessage("librarycopylistreport_WithCopiesInTransit") %></html:option>
                <% } %>
                <html:option value="<%=LibraryTitleCopyReportJobParams.SHOW_DETAILS_LOST_COPIES%>"><%= MessageHelper.formatMessage("librarycopylistreport_WithLostCopies") %></html:option>
            </html:select>
        </td>
    </tr>
    <logic:notEqual name="<%=LibraryCopyListReportForm.FORM_NAME%>" property="<%=LibraryCopyListReportForm.FIELD_SHOW_DETAILS_FOR%>" value="<%=LibraryTitleCopyReportJobParams.SHOW_DETAILS_TITLES_ONLY%>" scope="request">
        <tr>
            <td class="ColRowBold tdAlignRight" valign="top"><nobr><%= MessageHelper.formatMessage("librarycopylistreport_Include") %></nobr></td>
            <td>
                <table id="<%=LibraryCopyListReportForm.TABLE_INCLUDE_CATEGORIES%>"border="0" cellpadding="0" width="100%">
                   <c:choose>
                       <c:when test="<%= form.getStore().isDistrictUser() %>">
                            <tr>
                                <td class="ColRow">
                                    <html:checkbox property="<%=LibraryCopyListReportForm.FIELD_INCLUDE_CATEGORIES%>"><%= MessageHelper.formatMessage("librarycopylistreport_CategoriesSite") %></html:checkbox>
                                </td>
                            </tr>
                            <tr>
                                <td class="ColRow">
                                    <html:checkbox property="<%=LibraryCopyListReportForm.FIELD_INCLUDE_DISTRICT_CATEGORIES%>"><%= MessageHelper.formatMessage("librarycopylistreport_CategoriesDistrict") %></html:checkbox>
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                             <tr>
                                <td class="ColRow">
                                    <html:checkbox property="<%=LibraryCopyListReportForm.FIELD_INCLUDE_CATEGORIES%>"><%= MessageHelper.formatMessage("librarycopylistreport_Categories") %></html:checkbox>
                                </td>
                             </tr>
                        </c:otherwise>
                    </c:choose>
                        
                    <tr>
                        <td class="ColRow">
                            <html:checkbox property="<%=LibraryCopyListReportForm.FIELD_INCLUDE_CIRC_STATS%>" onclick="javascript:submitTheForm()"><%= MessageHelper.formatMessage("librarycopylistreport_CirculationStatistics") %></html:checkbox>
                        </td>
                    </tr>
                    <logic:equal name="<%=LibraryCopyListReportForm.FORM_NAME%>" property="<%=LibraryCopyListReportForm.FIELD_INCLUDE_CIRC_STATS%>" value="true" scope="request">
                    <tr>
                        <td>
                            <table id="<%=LibraryCopyListReportForm.TABLE_CIRC_STATS%>" width="100%">
                                <tr>
                                    <td class="tdAlignRight" width="35">
                                        <html:checkbox property="<%=LibraryCopyListReportForm.FIELD_ONLY_SHOW_CIRCULATED_COPIES%>"/>
                                    </td>
                                    <td class="ColRow"><%= MessageHelper.formatMessage("librarycopylistreport_OnlyShowCopiesThatCirculated") %></td>
                                </tr>
                                <tr>
                                    <td>&nbsp;</td>
                                    <td class="ColRow">
                                        <html:select property="<%=LibraryCopyListReportForm.FIELD_LIMIT_TO_CIRC_OPERATOR%>">
                                            <html:option value='<%=""+LibraryTitleCopyReportJobParams.LIMITTOCIRC_OPERATOR_MORE_THAN%>'><%= MessageHelper.formatMessage("librarycopylistreport_MoreThan") %></html:option>
                                            <html:option value='<%=""+LibraryTitleCopyReportJobParams.LIMITTOCIRC_OPERATOR_EQUALS%>'><%= MessageHelper.formatMessage("librarycopylistreport_EqualTo") %></html:option>
                                            <html:option value='<%=""+LibraryTitleCopyReportJobParams.LIMITTOCIRC_OPERATOR_LESS_THAN%>'><%= MessageHelper.formatMessage("librarycopylistreport_LessThan") %></html:option>
                                        </html:select>&nbsp;&nbsp;<html:text property="<%=LibraryCopyListReportForm.FIELD_LIMIT_TO_CIRC_TIMES%>" size="3" maxlength="3"/>&nbsp;
                                        <html:select property="<%=LibraryCopyListReportForm.FIELD_LIMIT_TO_CIRC_TIMEFRAME%>">
                                            <html:option value='<%=""+LibraryTitleCopyReportJobParams.LIMITTOCIRC_TIMEFRAME_THIS_MONTH%>'><%= MessageHelper.formatMessage("librarycopylistreport_ThisMonth") %></html:option>
                                            <html:option value='<%=""+LibraryTitleCopyReportJobParams.LIMITTOCIRC_TIMEFRAME_THIS_YEAR%>'><%= MessageHelper.formatMessage("librarycopylistreport_ThisYear") %></html:option>
                                            <html:option value='<%=""+LibraryTitleCopyReportJobParams.LIMITTOCIRC_TIMEFRAME_TOTAL%>'><%= MessageHelper.formatMessage("librarycopylistreport_Total") %></html:option>
                                        </html:select>
                                    </td>
                                </tr>
                            </table>                        
                        </td>
                    </tr>
                    </logic:equal>
                    <logic:equal name="<%=LibraryCopyListReportForm.FORM_NAME%>" property="<%=LibraryCopyListReportForm.FIELD_INCLUDE_CIRC_STATS%>" value="false" scope="request">
                        <html:hidden property="<%=LibraryCopyListReportForm.FIELD_ONLY_SHOW_CIRCULATED_COPIES%>" value="false"/>
                        <html:hidden property="<%=LibraryCopyListReportForm.FIELD_LIMIT_TO_CIRC_OPERATOR%>" value="1"/>
                        <html:hidden property="<%=LibraryCopyListReportForm.FIELD_LIMIT_TO_CIRC_TIMES%>" value="0"/>
                        <html:hidden property="<%=LibraryCopyListReportForm.FIELD_LIMIT_TO_CIRC_TIMEFRAME%>" value="0"/>
                    </logic:equal>
                </table>
            </td>
        </tr>
    </logic:notEqual>
    <logic:equal name="<%=LibraryCopyListReportForm.FORM_NAME%>" property="<%=LibraryCopyListReportForm.FIELD_SHOW_DETAILS_FOR%>" value="<%=LibraryTitleCopyReportJobParams.SHOW_DETAILS_TITLES_ONLY%>" scope="request">
        <html:hidden property="<%=LibraryCopyListReportForm.FIELD_INCLUDE_CATEGORIES%>" value="false"/>
        <html:hidden property="<%=LibraryCopyListReportForm.FIELD_INCLUDE_CIRC_STATS%>" value="false"/>
        <html:hidden property="<%=LibraryCopyListReportForm.FIELD_ONLY_SHOW_CIRCULATED_COPIES%>" value="false"/>
        <html:hidden property="<%=LibraryCopyListReportForm.FIELD_LIMIT_TO_CIRC_OPERATOR%>" value="1"/>
        <html:hidden property="<%=LibraryCopyListReportForm.FIELD_LIMIT_TO_CIRC_TIMES%>" value="0"/>
        <html:hidden property="<%=LibraryCopyListReportForm.FIELD_LIMIT_TO_CIRC_TIMEFRAME%>" value="0"/>
    </logic:equal>
        <tr>
            <td colspan="2"><base:imageLine height="1" width="100%"/></td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight" valign="top">
                <nobr><%= MessageHelper.formatMessage("librarycopylistreport_OutputAs") %></nobr>
            </td>
            <td class="ColRow">
                <html:select property="<%=LibraryCopyListReportForm.FIELD_OUTPUT_TYPE%>">
                    <html:option value='<%="" + LibraryTitleCopyReportJobParams.EXPORT_TYPE_PDF%>'>PDF</html:option>
                    <html:option value='<%="" + LibraryTitleCopyReportJobParams.EXPORT_TYPE_XLS%>'>Microsoft Excel</html:option>
                </html:select>
            </td>
        </tr>
    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <tr>
        <td colspan="3" align="center">
            <table>
                <tr>
                    <c:choose>
                        <c:when test="<%=LibraryCopyListReportForm.ACTION_RUN.equals(form.getAction()) %>">
                            <td valign="top">
                                <base:genericButton name="<%=LibraryCopyListReportForm.BUTTON_SAVE_AND_RUN%>" alt='<%=MessageHelper.formatMessage("saveAndRun")%>' src="/buttons/large/saveandrun.gif"/>
                            </td>
                            <td>
                                <base:cancelButton/>
                            </td>
                        </c:when>
                        <c:otherwise>
                            <td valign="top">
                                <base:genericButton name="<%=LibraryCopyListReportForm.BUTTON_SAVE_SETUP%>" src="/buttons/large/savesetup.gif" alt='<%=MessageHelper.formatMessage("saveSetup")%>'/>
                            </td>
                            <td>
                                <base:reportButton/>
                            </td>
                        </c:otherwise>
                    </c:choose>                    
                </tr>
            </table>
        </td>
    </tr>
</base:outlinedTableAndTabsWithinThere>
</base:form>
