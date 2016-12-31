<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.LibraryStatisticsCurrentForm" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>
<%
    LibraryStatisticsCurrentForm form = (LibraryStatisticsCurrentForm)request.getAttribute(LibraryStatisticsCurrentForm.FORM_NAME);
    boolean isInternatinal = LocaleHelper.isInternationalProduct();
%>

<logic:equal name="<%= LibraryStatisticsCurrentForm.FORM_NAME %>" property="formBusy" value="false">

<bean:define id="valueObject" name="<%=LibraryStatisticsCurrentForm.VALUE_OBJECT_LOCATION%>" type="com.follett.fsc.destiny.session.backoffice.data.LibraryStatisticsVO" />

<table width="95%" cellpadding="5" id="<%=LibraryStatisticsCurrentForm.TABLE_MAIN%>">
    <tr><td class ="TableHeading"><%= form.getTableHeader()%></td></tr>
    <tr><td>
        <!-- historical table -->
        <table id="<%=LibraryStatisticsCurrentForm.TABLE_DETAIL%>" border=1 style="border-collapse: collapse" bordercolor="#C0C0C0" cellpadding="2" width="95%" frame="void" rules="rows, cols" cellspacing="0">
            <tr>
                <td class=SmallColHeading>&nbsp;</td>
                <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("librarystatisticscurrent_Today") %></td>
                <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("librarystatisticscurrent_ThisMonth") %></td>
                <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("librarystatisticscurrent_ThisYear") %></td>
            </tr>
            <tr>
                <td class=ColRowBold><%= MessageHelper.formatMessage("librarystatisticscurrent_TotalCirculations") %></td>
                <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricalTotalCircsToday())%>"/></td>
                <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricalTotalCircsMonthToDay())%>"/></td>
                <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricalTotalCircsCurrentSchoolYear())%>"/></td>
            </tr>
            <tr>
                <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("librarystatisticscurrent_CheckOuts") %></td>
                <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricalCheckOutsToday())%>"/></td>
                <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricalCheckOutsMonthToDay())%>"/></td>
                <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricalCheckOutsCurrentSchoolYear())%>"/></td>
            </tr>
            <% if (CollectionType.LIBRARY == form.getCollectionType()) { %>
                <tr>
                    <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("librarystatisticscurrent_InLibraryUse") %></td>
                    <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricalInLibraryUsageToday())%>"/></td>
                    <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricalInLibraryUsageMonthToDay())%>"/></td>
                    <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricalInLibraryUsageCurrentSchoolYear())%>"/></td>
                </tr>
            <% } // end if collection type is library %>
            <tr>
                <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("librarystatisticscurrent_Renewals") %></td>
                <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricalRenewalsToday())%>"/></td>
                <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricalRenewalsMonthToDay())%>"/></td>
                <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricalRenewalsCurrentSchoolYear())%>"/></td>
            </tr>
         <% if (!isInternatinal) { %>
            <tr>
                <td class="SmallColHeading tdAlignRight">*<%= MessageHelper.formatMessage("librarystatisticscurrent_FollettEbookCheckOuts") %></td>
                <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricaleBookCheckoutsToday())%>"/></td>
                <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricaleBookCheckoutsMonthToDay())%>"/></td>
                <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricaleBookCheckoutsCurrentSchoolYear())%>"/></td>
            </tr>
            <tr>
                <td class="SmallColHeading tdAlignRight">*<%= MessageHelper.formatMessage("librarystatisticscurrent_FollettEbooksReadOnline") %></td>
                <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricaleBookPreviewsToday())%>"/></td>
                <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricaleBookPreviewsMonthToDay())%>"/></td>
                <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricaleBookPreviewsCurrentSchoolYear())%>"/></td>
            </tr>
         <% } %>
            <% if (CollectionType.LIBRARY == form.getCollectionType()) { %>
                <tr>
                    <td class=ColRowBold><%= MessageHelper.formatMessage("librarystatisticscurrent_TotalHoldsPlaced") %></td>
                    <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricalHoldsPlacedToday())%>"/></td>
                    <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricalHoldsPlacedMonthToDay())%>"/></td>
                    <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricalHoldsPlacedCurrentSchoolYear())%>"/></td>
                </tr>
                <tr>
                    <td class=ColRowBold><%= MessageHelper.formatMessage("librarystatisticscurrent_RenewalsByPatrons") %></td>
                    <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricalRenewalsBySelfToday())%>"/></td>
                    <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricalRenewalsBySelfMonthToDay())%>"/></td>
                    <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricalRenewalsBySelfCurrentSchoolYear())%>"/></td>
                </tr>
                <tr>
                    <td class=ColRowBold><%= MessageHelper.formatMessage("librarystatisticscurrent_HoldsPlacedByPatrons") %></td>
                    <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricalHoldsBySelfToday())%>"/></td>
                    <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricalHoldsBySelfMonthToDay())%>"/></td>
                    <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricalHoldsBySelfCurrentSchoolYear())%>"/></td>
                </tr>
            <% } // end if collection type is library %>
            <logic:equal name="<%= LibraryStatisticsCurrentForm.FORM_NAME %>" property="districtCircs" value="true">
                <tr>
                    <td class=ColRowBold><%= MessageHelper.formatMessage("librarystatisticscurrent_CirculationsToOtherSchools") %></td>
                    <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricalVisitingPatronUseToday())%>"/></td>
                    <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricalVisitingPatronUseMonthToDay())%>"/></td>
                    <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricalVisitingPatronUseCurrentSchoolYear())%>"/></td>
                </tr>
                <% if (CollectionType.LIBRARY == form.getCollectionType()) { %>
                    <tr>
                        <td class=ColRowBold><%= MessageHelper.formatMessage("librarystatisticscurrent_HoldsForOtherSchools") %></td>
	                    <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricalHoldsForVisitingPatronsToday())%>"/></td>
	                    <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricalHoldsForVisitingPatronsMonthToDay())%>"/></td>
	                    <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%= new Long(form.getStats().getHistoricalHoldsForVisitingPatronsCurrentSchoolYear())%>"/></td>
                    </tr>
                <% } // end if collection type is library %>
            </logic:equal>
        </table>
    </td></tr>
    <% if (!isInternatinal) { %>
    <tr><td class="Instruction">* <%= MessageHelper.formatMessage("librarystatisticscurrent_StatisticsForEBooks") %>
    </td></tr>
    <% } %>
    <tr><td class="ColRow">
         <P>
         <%=form.getReportTimeFooter()%>
    </td></tr>
</table>
</logic:equal>
