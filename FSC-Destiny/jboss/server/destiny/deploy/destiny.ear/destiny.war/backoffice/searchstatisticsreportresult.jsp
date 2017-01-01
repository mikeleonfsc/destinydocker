<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.SearchStatisticsReportForm"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.SearchStatisticsReportResultForm" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.SearchStatisticsReportResultsVO"%>
<%@ page import="com.follett.fsc.destiny.session.backoffice.ejb.SearchStatisticsReportFacadeSpecs"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>



<base:messageBox strutsErrors="true"/>

<% SearchStatisticsReportResultForm form = (SearchStatisticsReportResultForm) request.getAttribute(SearchStatisticsReportResultForm.FORM_NAME);%>

<base:form action="/backoffice/servlet/handlesearchstatisticsreportresultform.do">   

<% if (form.isDisplayPrinterFriendly()) { %>
<script language="JavaScript" type="text/javascript">
<!--
       window.open('<%=form.getPrinterFriendlyPage()%>',
           '<%=SearchStatisticsReportResultForm.TARGET_NAME%>').focus();
//-->
</script>
<% } %>

<html:hidden property="<%=SearchStatisticsReportResultForm.PARAM_SHOW_CHECKBOX_RELATED_BUTTONS %>" />
<html:hidden property="<%=SearchStatisticsReportResultForm.PARAM_DATE_TO %>" />
<html:hidden property="<%=SearchStatisticsReportResultForm.PARAM_DATE_FROM %>" />
<html:hidden property="<%=SearchStatisticsReportResultForm.PARAM_DATE_RANGE %>" />
<html:hidden property="<%=SearchStatisticsReportResultForm.PARAM_COUNT_OPTION %>" />
<html:hidden property="<%=SearchStatisticsReportResultForm.PARAM_RESULT_OPTION %>" />
<html:hidden property="<%=SearchStatisticsReportResultForm.PARAM_SEARCH_OPTION %>" />
<html:hidden property="<%=SearchStatisticsReportForm.PARAM_SEARCH_MODE %>" />
<html:hidden property="<%=SearchStatisticsReportForm.PARAM_PATRON_TYPES %>" />
<html:hidden property="<%=SearchStatisticsReportResultForm.PARAM_PATRON_TYPE_DESCRIPTIONS %>" />
<html:hidden property="<%=SearchStatisticsReportResultForm.PARAM_SHOW_DETAILS_OPTION %>" />

<base:outlinedTable id="<%=SearchStatisticsReportResultForm.TABLE_NAME%>" cellpadding="5" cellspacing="0" borderColor='#C0C0C0'>
    <tr>
        <td class="TableHeading">
            <%=form.getPageTitle()%>
        </td>
        <td class="tdAlignRight">
            <% if (!form.isPrinterFriendly()) { %>
                <base:genericButton src="/buttons/small/printerfriendly.gif"
                       alt='<%=MessageHelper.formatMessage("printable") %>'
                       name="<%=SearchStatisticsReportResultForm.BUTTON_PRINTER_FRIENDLY%>"/>
            <% } %>
        </td>
    </tr>
    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>

    <tr>
        <td align="center" width="70%" colspan="2">
            <table id="<%=SearchStatisticsReportResultForm.TABLE_REPORT_OPTIONS%>" width="%100">
                <tr align="center">
                    <td class="TableHeading2">
                        <bean:write name="<%= SearchStatisticsReportResultForm.FORM_NAME %>"
                              property="siteName"/>
                    </td>
                </tr>
                <tr>
                </tr>
                <tr align="center">
                    <td class="ColRow">
                        <bean:write name="<%= SearchStatisticsReportResultForm.FORM_NAME %>"
                                    property="searchOptions"/>
                    </td>
                </tr>
                <tr align="center">
                    <td class="ColRow">
                        <bean:write name="<%= SearchStatisticsReportResultForm.FORM_NAME %>"
                                    property="searchTermsCount"/>
                    </td>
                </tr>
                <tr align="center">
                    <td class="ColRow">
                        <bean:write name="<%= SearchStatisticsReportResultForm.FORM_NAME %>"
                                    property="dateRange"/>
                    </td>
                </tr>
                <logic:notEmpty name="<%= SearchStatisticsReportResultForm.FORM_NAME %>"
                                property="patronTypeDescriptions">
                    <tr align="center">
                        <td class="ColRow">
                           <%=MessageHelper.formatMessage("searchstatisticsreportresult_PatronTypes0", form.getPatronTypeDescriptions()) %>
                        </td>
                    </tr>
                </logic:notEmpty>
                <tr>
                    <td colSpan="2">&nbsp;</td>
                </tr>                    
            </table>            
            <%long total = 0;
            LocaleHelper lh = UserContext.getMyContextLocaleHelper();
            %>
  
            <logic:notEmpty name="<%= SearchStatisticsReportResultForm.FORM_NAME %>" property="results">
                <table id="<%=SearchStatisticsReportResultForm.TABLE_RESULTS%>" width="100%" cellspacing="0">
                    <tr>
                        <td class="SmallColHeading">
                            &nbsp;
                        </td>
                        <td class="SmallColHeading">
                            <%=form.buildFirstRowHeader()%>
                        </td>
                        <td class="SmallColHeading" align="center"><%=MessageHelper.formatMessage("searchstatisticsreportresult_NumberOfSearches") %></td>
                        <td align="center">
                            <% if ((SearchStatisticsReportFacadeSpecs.OCCURANCE_SEARCH_MODE_WPE ==
                                       form.getSearchMode()) &&
                                   (form.isSMTPServerEnabled()) &&
                                   (form.canSubmitWPESuggestion()) &&
                                   (!form.isPrinterFriendly()) &&
                                   (form.isShowCheckboxRelatedButtons())) { %>
                                <base:link page="<%=form.getSelectAllPage()%>" id="<%=SearchStatisticsReportResultForm.BUTTON_SELECT_ALL %>">
                                    <base:image name="<%=SearchStatisticsReportResultForm.BUTTON_SELECT_ALL%>" 
                                                src="/buttons/small/selectall_opaque.gif" 
                                                alt='<%=MessageHelper.formatMessage("selectAll")%>' />
                                </base:link>
                                &nbsp;
                                <base:link page="<%=form.getClearAllPage()%>" id="<%=SearchStatisticsReportResultForm.BUTTON_CLEAR_ALL %>">
                                    <base:image name="<%=SearchStatisticsReportResultForm.BUTTON_CLEAR_ALL%>" 
                                                src="/buttons/small/clearall_opaque.gif" 
                                                alt='<%=MessageHelper.formatMessage("clearAll")%>' />
                                </base:link>
                            <% } else { %>
                                &nbsp;
                            <% } %>
                        </td>
                    </tr>
                    <logic:iterate indexId="flipper" id="row"
                                   name="<%= SearchStatisticsReportResultForm.FORM_NAME %>"
                                   property="results"
                                   type="com.follett.fsc.destiny.session.backoffice.data.SearchStatisticsReportResultsVO">
                        <tr <%= (((!form.isPrinterFriendly()) && ((1 & flipper.intValue()) == 0)) ?
                            "bgColor=\"#E8E8E8\"" : "")%> >
                            <td class="ColRow tdAlignRight">
                                <%=(flipper.intValue() + 1)%>.
                            </td>
                            <base:td clazz="ColRow" filtered="true">
                                <c:choose>
                                    <c:when test="<%=SearchStatisticsReportFacadeSpecs.OCCURANCE_SEARCH_MODE_WPE == form.getSearchMode()
                                        && SearchStatisticsReportFacadeSpecs.OPTION_SHOW_SITE_SUMMARY == form.getShowDetailsOption().intValue()%>">
                                        <%=row.getSiteName()%>
                                    </c:when>
                                    <c:otherwise>
                                        <%=row.getSearchTerm()%>
                                    </c:otherwise>
                                </c:choose>
                            </base:td>
                            <td class="ColRow" align="center">
                                <% total += row.getNumberOfSearches().longValue(); %>
                                <%=row.getNumberOfSearches(lh)%>
                            </td>
                            <td class="ColRow" align="center">
                                <% if ((SearchStatisticsReportFacadeSpecs.OCCURANCE_SEARCH_MODE_WPE !=
                                           form.getSearchMode()) ||
                                       (!form.isSMTPServerEnabled()) ||
                                       (!form.canSubmitWPESuggestion()) ||
                                       (row.getCheckboxStatus().equals(
                                           SearchStatisticsReportResultsVO.
                                               CHECKBOX_STATUS_HAS_RESULTS_CHECKBOX_NOT_PRESENT))) { %>
                                    &nbsp;
                                <% } else {
                                       if (row.getCheckboxStatus().equals(
                                           SearchStatisticsReportResultsVO.
                                               CHECKBOX_STATUS_HAS_NO_RESULTS_CHECKBOX_IS_CHECKED)) {
                                           if (!form.isPrinterFriendly()) { %>
                                            <input type="checkbox"
                                                   name="<%=form.FIELD_SUGGESTION_CHECKBOX_PREFIX +
                                                       flipper.intValue()%>"
                                                   value="on" checked="checked"/>
                                        <% } %><%=MessageHelper.formatMessage("searchstatisticsreportresult_IncludeAsSuggestion") %><% } else {
                                           if (!form.isPrinterFriendly()) { %>
                                            <input type="checkbox"
                                                   name="<%=form.FIELD_SUGGESTION_CHECKBOX_PREFIX +
                                                       flipper.intValue()%>"
                                                   value="on" />
                                            <%=MessageHelper.formatMessage("searchstatisticsreportresult_IncludeAsSuggestion") %>
                                        <% }
                                       }
                                   } %>
                            </td>
                        </tr>
                        <% if (!row.getLimitersUsed().isEmpty()) { %>
                            <tr <%= (((!form.isPrinterFriendly()) && ((1 & flipper.intValue()) == 0)) ?
                                "bgColor=\"#E8E8E8\"" : "")%> >
                                <td class="Instruction">
                                    &nbsp;
                                </td>
                                <base:td clazz="Instruction">
                                    <%=MessageHelper.formatMessage("searchstatisticsreportresult_LimitersUsed",
                                        "<b>", "</b>", MessageHelper.formatEnumeration(row.getLimitersUsed()))%>
                                </base:td>
                                <td class="ColRow" align="center">
                                    &nbsp;
                                </td>
                                <td class="ColRow" align="center">
                                    &nbsp;
                                </td>
                            </tr>
                        <% } %>
                    </logic:iterate>   
                    <% if (SearchStatisticsReportFacadeSpecs.OCCURANCE_SEARCH_MODE_STANDARDS == form.getSearchMode() ||
                        SearchStatisticsReportFacadeSpecs.OCCURANCE_SEARCH_MODE_WPE == form.getSearchMode()) {%>
                    <tr>
                        <td class="ColRow">&nbsp;</td>
                        <td class="ColRowBold">&nbsp;<%=MessageHelper.formatMessage("searchstatisticsreportresult_Total") %></td>
                        <td class="ColRowBold" align="center"><%=lh.formatNumber(total)%></td>
                        <td class="ColRow">&nbsp;</td>
                    </tr>
                    <% } %>
                    <tr>
                        <td>
                            &nbsp;
                        </td>
                        <td>
                            &nbsp;
                        </td>
                        <td>
                            &nbsp;
                        </td>
                        <td align="center">
                            <% if ((SearchStatisticsReportFacadeSpecs.OCCURANCE_SEARCH_MODE_WPE ==
                                       form.getSearchMode()) &&
                                   (form.isSMTPServerEnabled()) &&
                                   (form.canSubmitWPESuggestion()) &&
                                   (!form.isPrinterFriendly()) &&
                                   (form.isShowCheckboxRelatedButtons())) { %>
                                <base:link page="<%=form.getSelectAllPage()%>" id="<%=SearchStatisticsReportResultForm.BUTTON_SELECT_ALL %>">
                                    <base:image name="<%=SearchStatisticsReportResultForm.BUTTON_SELECT_ALL%>" 
                                                src="/buttons/small/selectall_opaque.gif" 
                                                alt='<%=MessageHelper.formatMessage("selectAll")%>' />
                                </base:link>
                                &nbsp;
                                <base:link page="<%=form.getClearAllPage()%>" id="<%=SearchStatisticsReportResultForm.BUTTON_CLEAR_ALL %>">
                                    <base:image name="<%=SearchStatisticsReportResultForm.BUTTON_CLEAR_ALL%>" 
                                                src="/buttons/small/clearall_opaque.gif" 
                                                alt='<%=MessageHelper.formatMessage("clearAll")%>' />
                                </base:link>
                            <% } else { %>
                                &nbsp;
                            <% } %>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            &nbsp;
                        </td>
                        <td>
                            &nbsp;
                        </td>
                        <td>
                            &nbsp;
                        </td>
                        <td class="tdAlignRight">
                            <%if ((SearchStatisticsReportFacadeSpecs.OCCURANCE_SEARCH_MODE_WPE ==
                                       form.getSearchMode()) &&
                                   (form.isSMTPServerEnabled()) &&
                                   (form.canSubmitWPESuggestion()) &&
                                  (!form.isPrinterFriendly()) &&
                                  (form.isShowCheckboxRelatedButtons())) { %>
                                <base:genericButton src="/buttons/large/submit.gif"
                                                    alt='<%=MessageHelper.formatMessage("submit")%>'
                                                    name="<%=SearchStatisticsReportResultForm.BUTTON_SUBMIT%>"/>
                                &nbsp;
                            <% } else { %>
                                &nbsp;
                            <% } %>
                        </td>
                    </tr>
                </table>
            </logic:notEmpty>
            <logic:empty name="<%= SearchStatisticsReportResultForm.FORM_NAME %>" property="results">
                <tr>
                    <td class="ColRowBold" align="center" colSpan="2"><%=MessageHelper.formatMessage("searchstatisticsreportresult_BasedOnYourSelectionsThereIsNothingToDisplay") %></td>
                </tr>
            </logic:empty>
        </td>
    </tr>
    <logic:equal name="<%= SearchStatisticsReportResultForm.FORM_NAME %>"
                 property="printerFriendly" value="false">
        <tr>
            <td colspan="2"><base:imageLine height="1" width="100%"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <base:okButton/>
            </td>
        </tr>
    </logic:equal>
</base:outlinedTable>
</base:form>
