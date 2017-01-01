<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.LibraryStatisticsForm" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.ejb.*"%>
<%@ page import="com.follett.fsc.destiny.util.CollectionType"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="com.follett.fsc.common.CurrencyValue"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>



<logic:equal name="circulation_servlet_LibraryStatisticsForm" property="printerFriendly" value="false">
    <base:messageBox strutsErrors="true"/>
</logic:equal>

<%  
    LibraryStatisticsForm form = (LibraryStatisticsForm)request.getAttribute(LibraryStatisticsForm.FORM_NAME);

    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>
<logic:equal name="<%=LibraryStatisticsForm.FORM_NAME%>" property="formBusy" value="false">

<bean:define id="valueObject" name="<%=LibraryStatisticsForm.VALUE_OBJECT_LOCATION%>" type="com.follett.fsc.destiny.session.backoffice.data.LibraryStatisticsVO" />
<%
    String borderColor="#C0C0C0";
    int cellPadding = 5;
    
    if (form.getCollectionType() == CollectionType.LIBRARY && form.isSideLink()) {
        borderColor = "#c0c0c0";
        cellPadding = 0;
    } 
%>

<base:outlinedTableAndTabsWithinThere borderColor="<%=borderColor%>" width="100%" cellpadding="<%=cellPadding%>" tabs="<%=form.getTabs() %>" selectedTabID="<%=form.getSelectedTabID() %>" selectedTab="<%=form.getSelectedTab() %>">
<!-- Current Library Statistics -->
<tr><td>

    <table id="<%=LibraryStatisticsForm.TABLE_MAIN%>" width="100%" cellpadding="2">
    <tr>
        <td colspan="1" class="TableHeading">
        <% if (form.getCollectionType() == CollectionType.TEXTBOOK || form.getCollectionType() == CollectionType.ASSET) { %>
            <%= MessageHelper.formatMessage("librarystatistics_TextbookSnapshot") %>
        <% } else {%>
            <%= MessageHelper.formatMessage("librarystatistics_LibrarySnapshot") %>
        <% } %>
        </td>

        <td class="SmallColHeading tdAlignRight" valign="bottom">
            <logic:equal name="circulation_servlet_LibraryStatisticsForm" property="printerFriendly" value="false">
                <base:link id="<%=LibraryStatisticsForm.ID_PRINTER_FRIENDLY %>" target="printerFriendly" page="<%= form.getPrinterFriendlyLink() %>"><base:image src="/buttons/small/printerfriendly.gif" alt='<%=MessageHelper.formatMessage("printable") %>' /></base:link>
            </logic:equal>
        </td>
    </tr>
    <tr>
        <td valign="top">
            <!-- do the circulations table -->
            <table id="<%=LibraryStatisticsForm.TABLE_CIRCULATION_STATISTICS%>" cellpadding="5">
                <tr><td class="ColRowBold"><%= MessageHelper.formatMessage("librarystatistics_Circulations") %></td></tr>
                <tr>
                    <td class="ColRow">
                        <ul>
                            <li><%= MessageHelper.formatMessage("librarystatistics_CheckedOut", Long.valueOf(form.getStats().getCheckOuts())) %></li>
                            <ul><li><%= MessageHelper.formatMessage("librarystatistics_Overdue", Long.valueOf(form.getStats().getOverdues())) %></li></ul>
                            <li><%= MessageHelper.formatMessage("librarystatistics_Lost", Long.valueOf(form.getStats().getLost())) %></li>
                        </ul>
                    </td>
                </tr>
                <% if (form.getCollectionType() == CollectionType.LIBRARY) { %>
                <tr><td class="ColRowBold"><%= MessageHelper.formatMessage("librarystatistics_Holds") %></td></tr>
                <tr>
                    <td class="ColRow">
                        <ul>
                            <li><%= MessageHelper.formatMessage("librarystatistics_Ready", Long.valueOf(form.getStats().getHoldsReady())) %></li>
                            <li><%= MessageHelper.formatMessage("librarystatistics_Pending", Long.valueOf(form.getStats().getHoldsPending())) %></li>
                            <li><%= MessageHelper.formatMessage("librarystatistics_Expired", Long.valueOf(form.getStats().getHoldsExpired())) %></li>
                        </ul>
                    </td>
                </tr>
                <% } // end if not textbook %>
                <tr><td class="ColRowBold"><%= MessageHelper.formatMessage("librarystatistics_UnpaidFines") %></td></tr>
                <tr>
                    <td class="ColRow">
                        <ul>
                		<% if (form.getCollectionType() == CollectionType.LIBRARY) { %>
                            <li><%= MessageHelper.formatMessage("librarystatistics_Library", Long.valueOf(form.getStats().getFines())) %></li>
						<% } else { %>
                            <li><%= MessageHelper.formatMessage("librarystatistics_Textbook", Long.valueOf(form.getStats().getFines())) %></li>
						<% } %>
                        <ul><li><%= MessageHelper.formatMessage("librarystatistics_AmountDue", new CurrencyValue(valueObject.getFineAmountDue(), lh.getFineCurrencyCharacterCode())) %></li></ul>

                        <li><%= MessageHelper.formatMessage("librarystatistics_Other", Long.valueOf(form.getStats().getOtherFines())) %></li>
                        <ul><li><%= MessageHelper.formatMessage("librarystatistics_AmountDue", new CurrencyValue(valueObject.getOtherFineAmountDue(), lh.getFineCurrencyCharacterCode())) %></li></ul>
                        </ul>
                    </td>
                </tr>
            </table>
        </td>
        <td valign="top">
            <!-- do the cataloging table -->
            <table id="<%=LibraryStatisticsForm.TABLE_CATALOGING_STATISTICS%>" cellpadding="5">
                <tr><td class="ColRowBold"><%= MessageHelper.formatMessage("librarystatistics_Materials") %></td></tr>
                <tr>
                    <td class="ColRow">
                        <ul>
                            <li><%= MessageHelper.formatMessage("librarystatistics_Titles", Long.valueOf(form.getStats().getTitles())) %></li>
                            <% if (form.getCollectionType() == CollectionType.ASSET) { %>
                            <li><%= MessageHelper.formatMessage("librarystatistics_Items", Long.valueOf(form.getStats().getCopies())) %>
                            <% } else { %>
                            <li><%= MessageHelper.formatMessage("librarystatistics_Copies", Long.valueOf(form.getStats().getCopies())) %>
                            <% } %>
                            <% if (form.getCollectionType() == CollectionType.LIBRARY ) { %>
                            </li>
                            <li><%= MessageHelper.formatMessage("librarystatistics_TitlesWithoutCopies", Long.valueOf(form.getStats().getTitlesWithoutCopies())) %></li>
                            <% } // end if not textbook %>
                            <% if (form.getCollectionType() == CollectionType.TEXTBOOK || form.getCollectionType() == CollectionType.ASSET) { %>
                            <font size="1"><br><%= MessageHelper.formatMessage("librarystatistics_IncludesTeachersEditionsAndKits") %></font>
                            </li>
                            <% } // end if textbook %>
                        </ul>
                    </td>
                </tr>
                <tr><td class="ColRowBold"><%= MessageHelper.formatMessage("librarystatistics_Patrons") %></td></tr>
                <tr>
                    <td class="ColRow">
                        <ul>
                            <li><%= MessageHelper.formatMessage("librarystatistics_Total", Long.valueOf(form.getStats().getPatronsTotal())) %></li>
                            <ul>
                                <li><%= MessageHelper.formatMessage("librarystatistics_Active", Long.valueOf(form.getStats().getPatronsActive())) %></li>
                                <li><%= MessageHelper.formatMessage("librarystatistics_Restricted", Long.valueOf(form.getStats().getPatronsRestricted())) %></li>
                                <li><%= MessageHelper.formatMessage("librarystatistics_Inactive", Long.valueOf(form.getStats().getPatronsInactive())) %></li>
                            </ul>
                        </ul>
                    </td>
                </tr>
            </table>
        </td>
    </tr>

    <tr><td colspan="2">
    <logic:equal name="circulation_servlet_LibraryStatisticsForm" property="printerFriendly" value="false">
        <img src="/images/icons/general/line.gif" height="1" width="100%">
    </logic:equal>
    </td></tr>

    <logic:equal name="circulation_servlet_LibraryStatisticsForm" property="printerFriendly" value="false">
    <% if (form.getCollectionType() == CollectionType.ASSET){ %>
    <tr><td colspan="2" class ="TableHeading"><%= "Textbook Statistics Snapshots..." %></td></tr>
    <% } else { %>
    <tr><td colspan="2" class ="TableHeading"><%= MessageHelper.formatMessage("librarystatistics_StatisticsSnapshots") %></td></tr>
    <% } %>
        <!-- current/historical snapshot selection form  -->
        <tr>
            <td colspan="2" align="center">
                <base:form action="/circulation/servlet/handlelibrarystatisticsform.do">
                <html:hidden property="<%=LibraryStatisticsForm.PARAM_COLLECTION_TYPE%>"/>
                <html:hidden property="<%=LibraryStatisticsForm.FIELD_ACTION%>"/>
                <html:hidden property="<%=LibraryStatisticsForm.PARAM_SIDE_LINK%>"/>
                <table id="<%=LibraryStatisticsForm.TABLE_SNAPSHOT_FORM%>" border="0" cellpadding="2" cellspacing="0">
                    <tr>
                        <td class="ColRowBold tdAlignLeft"><%=MessageHelper.formatMessage("librarystatistics_ViewTodaysCheckouts")%>&nbsp;
                            <A href="/circulation/servlet/presentlibrarystatisticstodayscheckoutsform.do?collectionType=<%=form.getCollectionType()%>"   
                                target="<%=LibraryStatisticsForm.TARGET_NAME%>" id="<%=LibraryStatisticsForm.ID_TODAYS_STATS %>"><base:image align="absbottom" 
                                src="/buttons/large/go.gif" alt='<%=MessageHelper.formatMessage("go")%>'/>
                            </A>
                        </td>
                    </tr>
                    <% if (form.getCollectionType() == CollectionType.LIBRARY) { %>
                    <tr>
                        <td class="ColRowBold tdAlignLeft"><%=MessageHelper.formatMessage("librarystatistics_ViewTodaysCheckins")%>&nbsp;
                            <A href="/circulation/servlet/presentlibrarystatisticstodayscheckinsform.do?collectionType=<%=form.getCollectionType()%>"   
                                target="<%=LibraryStatisticsForm.TARGET_NAME%>" id="<%=LibraryStatisticsForm.ID_TODAYS_STATS_IN %>"><base:image align="absbottom" 
                                src="/buttons/large/go.gif" alt='<%=MessageHelper.formatMessage("go")%>'/>
                            </A>
                        </td>
                    </tr>
                    <% } %>
                    <tr>
                        <td class="ColRowBold tdAlignLeft"><%= MessageHelper.formatMessage("librarystatistics_ViewCurrentStatistics") %>&nbsp;
                            <A href="/circulation/servlet/presentlibrarystatisticscurrentform.do?collectionType=<%=form.getCollectionType()%>"   
                                target="<%=LibraryStatisticsForm.TARGET_NAME%>" id="<%=LibraryStatisticsForm.ID_CURRENT_STATS %>"><base:image align="absbottom" 
                                src="/buttons/large/go.gif" alt='<%=MessageHelper.formatMessage("go")%>'/>
                            </A>
                        </td>
                    </tr>
                    <tr>
                        <td class="ColRowBold tdAlignLeft">
                            <%= MessageHelper.formatMessage("librarystatistics_ViewStatisticsForTheLast") %>&nbsp;
                            <%=form.renderNumberDropDown()%>&nbsp;
                            <html:select property="<%=LibraryStatisticsForm.FIELD_TIMEFRAME_SELECTED%>">
                                <html:option value='<%=""+LibraryStatisticsFacadeSpecs.TIMEFRAME_SELECTED_YEARS%>'><%= MessageHelper.formatMessage("librarystatistics_Years") %></html:option>
                                <html:option value='<%=""+LibraryStatisticsFacadeSpecs.TIMEFRAME_SELECTED_MONTHS%>'><%= MessageHelper.formatMessage("librarystatistics_Months") %></html:option>
                                <html:option value='<%=""+LibraryStatisticsFacadeSpecs.TIMEFRAME_SELECTED_DAYS%>'><%= MessageHelper.formatMessage("librarystatistics_Days") %></html:option>
                                <html:option value='<%=""+LibraryStatisticsFacadeSpecs.TIMEFRAME_SELECTED_HOURS%>'><%= MessageHelper.formatMessage("librarystatistics_Hours") %></html:option>
                            </html:select>&nbsp;
                            <base:genericButton alt='<%=MessageHelper.formatMessage("go") %>' name="<%=LibraryStatisticsForm.BUTTON_VIEW_LAST%>" src="/buttons/large/go.gif" absbottom="true"/>
                        </td>
                    </tr>
                    <tr>
                        <td class="ColRowBold tdAlignLeft"><%= MessageHelper.formatMessage("librarystatistics_ViewStatisticsFrom") %>&nbsp;<base:dateRange 
                                dateFrom="<%=form.getDateFrom()%>"
                                dateTo="<%=form.getDateTo()%>"
                            />
                            <base:genericButton alt='<%=MessageHelper.formatMessage("go")%>' name="<%=LibraryStatisticsForm.BUTTON_VIEW_RANGE%>" src="/buttons/large/go.gif" absbottom="true"/>
                        </td>
                    </tr>
                </table>
                </base:form>
            </td>
        </tr>
    </logic:equal>

    </table> <!-- main table -->
</td></tr>
</base:outlinedTableAndTabsWithinThere>
</logic:equal>
<logic:equal name="circulation_servlet_LibraryStatisticsForm" property="printerFriendly" value="false">

<SCRIPT LANGUAGE="javascript" TYPE="text/javascript">
    <!--
    
        var action = document.<%=LibraryStatisticsForm.FORM_NAME%>.<%=LibraryStatisticsForm.FIELD_ACTION%>.value;     
        var collectionType = document.<%=LibraryStatisticsForm.FORM_NAME%>.collectionType.value;     
        if (action == '<%=LibraryStatisticsForm.ACTION_VIEW_LAST%>') {
            clickHistoricalStats(collectionType);
        } 

        else if (action == '<%=LibraryStatisticsForm.ACTION_VIEW_RANGE%>') {
            clickHistoricalStatsDateRange(collectionType);
        } 
    
        function clickHistoricalStats(collectionType) {
            //Set the variables dynamically based on the current values on the form
            var timeframeUnits = document.circulation_servlet_LibraryStatisticsForm.timeframeUnits.value;
            var timeframeSelected = document.circulation_servlet_LibraryStatisticsForm.timeframeSelected.value;

            //Build the URL based on the fields in the form
            var url = '/circulation/servlet/presentlibrarystatisticshistoricalform.do?timeframeUnits=' +
                timeframeUnits + '&timeframeSelected=' + timeframeSelected +
                '&collectionType=' + collectionType;

            //Open the new window
            window.open(url, '<%=LibraryStatisticsForm.TARGET_NAME%>').focus();
        }
        
        function clickHistoricalStatsDateRange(collectionType) {
            //Set the variables dynamically based on the current values on the form
            var timeframeUnits = 1;
            var timeframeSelected = <%=LibraryStatisticsFacadeSpecs.TIMEFRAME_SELECTED_USER_DEFINED%>;
            var dateFrom = document.circulation_servlet_LibraryStatisticsForm.dateFrom.value;
            var dateTo = document.circulation_servlet_LibraryStatisticsForm.dateTo.value;            

            //Build the URL based on the fields in the form
            var url = '/circulation/servlet/presentlibrarystatisticshistoricalform.do?timeframeUnits=' +
                timeframeUnits + '&timeframeSelected=' + timeframeSelected
                + '&dateFrom=' + dateFrom + '&dateTo=' + dateTo +
                '&collectionType=' + collectionType;

            //Open the new window
            window.open(url, '<%=LibraryStatisticsForm.TARGET_NAME%>').focus();
        }

    // -->
</SCRIPT>
</logic:equal>
