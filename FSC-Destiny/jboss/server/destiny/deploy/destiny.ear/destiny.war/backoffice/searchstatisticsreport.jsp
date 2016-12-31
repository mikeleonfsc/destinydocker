<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.SearchStatisticsReportForm" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.ejb.SearchStatisticsReportFacadeSpecs"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>



<base:messageBox strutsErrors="true"/>
<bean:define id="form" name="<%= SearchStatisticsReportForm.FORM_NAME %>" type="com.follett.fsc.destiny.client.backoffice.servlet.SearchStatisticsReportForm"/>

<base:form action="/backoffice/servlet/handlesearchstatisticsreportform.do">
<bean:define id="showDetailsOptions" name="<%= SearchStatisticsReportForm.FORM_NAME %>" property="showDetailsOptions"/>   
<bean:define id="searchOptions" name="<%= SearchStatisticsReportForm.FORM_NAME %>" property="searchOptions"/> 
<bean:define id="resultsOptions" name="<%= SearchStatisticsReportForm.FORM_NAME %>" property="resultsOptions"/> 
<bean:define id="countOptions" name="<%= SearchStatisticsReportForm.FORM_NAME %>" property="countOptions"/> 
<bean:define id="stateOIDs" name="<%=SearchStatisticsReportForm.FORM_NAME%>" property="stateOIDList"/>
<base:outlinedTable id="<%=SearchStatisticsReportForm.TABLE_NAME%>" cellpadding="5" cellspacing="0" borderColor='#C0C0C0'>
    <tr>
        <td colspan="2" class="TableHeading"><%=MessageHelper.formatMessage("searchstatisticsreport_ListStatistics", form.getSearchModeAsString()) %></td>
    </tr>
    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>

    <tr>
        <td align="center" width="98%">
            <table id="<%=SearchStatisticsReportForm.TABLE_NAME_OPTIONS%>" border="0" cellpadding="3" cellspacing="6">
                <base:isDistrictUser>
                <tr>
                    <c:choose>
                    <c:when test="<%=SearchStatisticsReportFacadeSpecs.OCCURANCE_SEARCH_MODE_WPE == form.getSearchMode()%>">
                        <td class="ColRowBold"><%=MessageHelper.formatMessage("searchstatisticsreport_List") %></td>
                        <td class="ColRowBold tdAlignLeft">
                            <html:select property="<%= SearchStatisticsReportForm.FIELD_SHOW_DETAILS_OPTION %>" onchange="submit()">
                                <html:options collection="showDetailsOptions" property="longID" labelProperty="stringDesc"/>
                            </html:select>
                        </td>
                    </c:when>
                    <c:otherwise>
                        <html:hidden property="<%= SearchStatisticsReportForm.FIELD_SHOW_DETAILS_OPTION %>" value="<%= String.valueOf(SearchStatisticsReportForm.ID_OPTION_SHOW_DETAILS) %>"/>
                    </c:otherwise>
                    </c:choose>                    
                </tr>
                </base:isDistrictUser>
                <base:isNotDistrictUser>
                        <html:hidden property="<%= SearchStatisticsReportForm.FIELD_SHOW_DETAILS_OPTION %>" value="<%= String.valueOf(SearchStatisticsReportForm.ID_OPTION_SHOW_DETAILS) %>"/>
                </base:isNotDistrictUser>
                <tr>
                    <td class="ColRowBold"><%=MessageHelper.formatMessage("searchstatisticsreport_For") %></td>
                    <td class="ColRowBold  tdAlignLeft">
                        <html:select property="<%= SearchStatisticsReportForm.FIELD_SEARCH_OPTION %>">
                            <html:options collection="searchOptions" property="longID" labelProperty="stringDesc"/>
                        </html:select>
                        <c:choose>
                        <c:when test="<%=form.getSearchMode() == SearchStatisticsReportFacadeSpecs.OCCURANCE_SEARCH_MODE_STANDARDS %>">
                            <%=MessageHelper.formatMessage("searchstatisticsreport_SearchesOf") %> 
                            <html:select property="<%=SearchStatisticsReportForm.FIELD_RESULT_OPTION%>">
                                <html:options collection="stateOIDs" property="OID" labelProperty="name"/>
                            </html:select>
                        </c:when>
                        <c:otherwise>
                            <%=MessageHelper.formatMessage("searchstatisticsreport_Searches") %>
                            <html:select property="<%= SearchStatisticsReportForm.FIELD_RESULT_OPTION %>">
                                <html:options collection="resultsOptions" property="longID" labelProperty="stringDesc"/>
                            </html:select>
                        </c:otherwise>
                        </c:choose>
                    </td>
                </tr>
                <base:isNotDistrictUser>
                    <c:if test="<%=
                        SearchStatisticsReportFacadeSpecs.OCCURANCE_SEARCH_MODE_WPE == form.getSearchMode() ||
                        SearchStatisticsReportFacadeSpecs.OCCURANCE_SEARCH_MODE_STANDARDS == form.getSearchMode()                    
                        %>">
                        <tr>
                            <td class="ColRowBold"><%=MessageHelper.formatMessage("searchstatisticsreport_By") %></td>
                            <td class="tdAlignLeft">
                                <base:patronTypesList formName="<%=SearchStatisticsReportForm.FORM_NAME%>"/>
                            </td>
                        </tr>
                    </c:if>
                </base:isNotDistrictUser>
                <c:choose>
                    <c:when test="<%= !SearchStatisticsReportForm.ID_OPTION_SHOW_DETAILS_SITE_SUMMARY.equals(form.getShowDetailsOption()) %>"> 
                        <tr>
                            <td class="ColRowBold">&nbsp;</td>
                            <td class="ColRowBold tdAlignLeft"><%=MessageHelper.formatMessage("searchstatisticsreport_ShowTheTop") %><html:select property="<%= SearchStatisticsReportForm.FIELD_COUNT_OPTION %>">
                                    <html:options collection="countOptions" property="longID" labelProperty="stringDesc"/>
                                </html:select>
                                <b><c:out value='<%=SearchStatisticsReportFacadeSpecs.OCCURANCE_SEARCH_MODE_BASIC == form.getSearchMode() ?
                                    MessageHelper.formatMessage("searchstatisticsreport_SearchTerms") : 
                                        MessageHelper.formatMessage("searchstatisticsreport_TopicsTerms")%>'/></b>
                            </td>
                        </tr>
                    </c:when>
                    <c:otherwise>
                        <html:hidden property="<%= SearchStatisticsReportForm.FIELD_COUNT_OPTION %>" value="<%= String.valueOf(SearchStatisticsReportForm.ID_OPTION_COUNT_ALL) %>"/>
                    </c:otherwise>
                </c:choose>
                <tr>
                    <td class="ColRowBold">&nbsp;</td>
                    <td class="ColRowBold tdAlignLeft">&nbsp;<%=MessageHelper.formatMessage("searchstatisticsreport_From") %>&nbsp;<base:dateRange 
                        dateFrom="<%=form.getDateFrom()%>"
                        dateTo="<%=form.getDateTo()%>"
                        hideButtonsForMac = "true"/>
                    </td>
                </tr>
                <tr>
                    <td class="Instruction" colSpan="2" align="center">
                        <%=MessageHelper.formatMessage("searchstatisticsreport_StatisticsAreAvailableFrom", form.getSearchModeAsString(), form.getEarliestDateAvailable()) %>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    <tr>
        <td colspan="2" align="center" class="ColRowBold">
            <base:reportButton/>
        </td>
    </tr>
</base:outlinedTable>
</base:form>
