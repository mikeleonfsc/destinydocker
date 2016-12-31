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
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>


<% 
    FineHistoryReportForm form = (FineHistoryReportForm) request.getAttribute(FineHistoryReportForm.FORM_NAME);
    SessionStoreProxy store = form.getStore();
    boolean includeFinesLabelWritten = false;
    String includeFinesLabel = MessageHelper.formatMessage("finehistoryreport_IncludeFinesFor");
%>

<base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handlefinehistoryreportform.do">

<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">
<html:hidden property="<%=FineHistoryReportForm.FIELD_ACTION%>"/>
<html:hidden property="<%=FineHistoryReportForm.FIELD_JOB_SPEC_ID%>"/>
<html:hidden property="<%=FineHistoryReportForm.PARAM_REPORT_NAME%>"/>

<base:outlinedTableAndTabsWithinThere id="<%=FineHistoryReportForm.TABLE_MAIN%>" cellpadding="5" cellspacing="0" borderColor='#C0C0C0' selectedTab="<%=form.getLeftTab().getAltText()%>" selectedTabID="<%=form.getLeftTab().getName() %>" tabs="<%=form.getTabs()%>">
    <tr>
        <td colspan="2" class="TableHeading">
            <%=form.getReportHeading()%>
        </td>
    </tr>
    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <% if( store.isLibrarySite() ) { %>
    <tr>
        <td class="ColRowBold tdAlignRight"><%=includeFinesLabel %></td>
        <% includeFinesLabelWritten = true; %>
        <td class="ColRow">
            <html:checkbox name="<%=FineHistoryReportForm.FORM_NAME%>" property="<%= FineHistoryReportForm.FIELD_LIBRARY_MATERIAL %>"><%= MessageHelper.formatMessage("finehistoryreport_LibraryMaterials") %></html:checkbox>
        </td>  
    </tr>
    <%
        includeFinesLabelWritten = true;
    } %>
    <% if( store.isTextbookSite() ) { %>
    <tr>
        <td class="ColRowBold tdAlignRight"><%=((includeFinesLabelWritten) ? "&nbsp;" : includeFinesLabel)%></td>
        <% includeFinesLabelWritten = true; %>
        </td>
        <td class="ColRow">
            <html:checkbox name="<%=FineHistoryReportForm.FORM_NAME%>" property="<%= FineHistoryReportForm.FIELD_TEXTBOOK %>"><%= MessageHelper.formatMessage("finehistoryreport_Textbooks") %></html:checkbox>
        </td>
    </tr>
    <% } %>
    <% if( store.isAssetSite() ) { %>
    <tr>
        <td class="ColRowBold tdAlignRight"><%=(includeFinesLabelWritten) ? "&nbsp;" : includeFinesLabel %></td>
        <% includeFinesLabelWritten = true; %>
        <td class="ColRow">
            <html:checkbox name="<%=FineHistoryReportForm.FORM_NAME%>" property="<%= FineHistoryReportForm.FIELD_ASSET %>"><%= MessageHelper.formatMessage("finehistoryreport_Assets") %></html:checkbox>
        </td>
    </tr>
    <% } %>
    <tr>
        <td class="ColRowBold tdAlignRight"><%=(includeFinesLabelWritten) ? "&nbsp;" : includeFinesLabel %></td>
        <% includeFinesLabelWritten = true; %>
        <td class="ColRow">
            <html:checkbox name="<%=FineHistoryReportForm.FORM_NAME%>" property="<%= FineHistoryReportForm.FIELD_PATRON_SPECIFIC %>"><%= MessageHelper.formatMessage("finehistoryreport_PatronSpecific") %></html:checkbox>
        </td>   
    </tr>
    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("finehistoryreport_ForTransactionsOccurring") %></td>    
        <td class="ColRow"><html:radio name="<%=FineHistoryReportForm.FORM_NAME%>" property="<%=FineHistoryReportForm.FIELD_TRANSACTION_SCOPE%>" value="<%=Integer.toString(FineHistoryReportForm.SCOPE_TODAY)%>"/><%= MessageHelper.formatMessage("finehistoryreport_Today") %></td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">
            &nbsp;
        </td>
        <td class="ColRow"><html:radio name="<%=FineHistoryReportForm.FORM_NAME%>" property="<%=FineHistoryReportForm.FIELD_TRANSACTION_SCOPE%>" value="<%=Integer.toString(FineHistoryReportForm.SCOPE_CUSTOM)%>"/>
            <%= MessageHelper.formatMessage("finehistoryreport_From") %>&nbsp;
            <base:dateRange 
				dateFrom="<%=form.getDateFrom()%>"
				dateTo="<%=form.getDateTo()%>"
				hideButtonsForMac = "true"
			/>
        </td>
    </tr>
    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top"><%= MessageHelper.formatMessage("finehistoryreport_SortBy") %></td>
        <td class="ColRow">
            <html:select property="<%=FineHistoryReportForm.FIELD_SORT_BY%>">
                <html:option value='<%=""+FineHistoryCashFlowJobParams.SORT_BY_DATE%>'>
                    <%=FineHistoryCashFlowJobParams.getSortByDisplayable(FineHistoryCashFlowJobParams.SORT_BY_DATE)%></html:option>
                <html:option value='<%=""+FineHistoryCashFlowJobParams.SORT_BY_PATRON%>'>
                    <%=FineHistoryCashFlowJobParams.getSortByDisplayable(FineHistoryCashFlowJobParams.SORT_BY_PATRON)%></html:option>
                <html:option value='<%=""+FineHistoryCashFlowJobParams.SORT_BY_REASON%>'>
                    <%=FineHistoryCashFlowJobParams.getSortByDisplayable(FineHistoryCashFlowJobParams.SORT_BY_REASON)%></html:option>
                <html:option value='<%=""+FineHistoryCashFlowJobParams.SORT_BY_PERFORMEDBY%>'>
                    <%=FineHistoryCashFlowJobParams.getSortByDisplayable(FineHistoryCashFlowJobParams.SORT_BY_PERFORMEDBY)%></html:option>
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
                        <c:when test="<%=FineHistoryReportForm.ACTION_RUN.equals(form.getAction()) %>">
                            <td valign="top">
                                <base:genericButton name="<%=FineHistoryReportForm.BUTTON_SAVE_AND_RUN%>" alt='<%=MessageHelper.formatMessage("saveAndRun")%>' src="/buttons/large/saveandrun.gif"/>
                            </td>
                            <td>
                                <base:cancelButton/>
                            </td>
                        </c:when>
                        <c:otherwise>
                            <td valign="top">
                                <base:genericButton name="<%=FineHistoryReportForm.BUTTON_SAVE_SETUP%>" src="/buttons/large/savesetup.gif" alt='<%=MessageHelper.formatMessage("saveSetup")%>'/>
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
