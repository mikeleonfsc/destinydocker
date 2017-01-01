<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.data.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@page import="org.apache.struts.util.ResponseUtils"%>

<%
    MissouriTimeSensitiveDeweyReportsForm form = (MissouriTimeSensitiveDeweyReportsForm)request.getAttribute(MissouriTimeSensitiveDeweyReportsForm.FORM_NAME);
%>

<%@page import="com.follett.fsc.destiny.session.backoffice.ejb.MOReportsFacadeSpecs"%>
<%@page import="com.follett.fsc.destiny.util.CollectionType"%>

<base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handlemissouritimesensitivedeweyreportsform.do">
    <base:outlinedTableAndTabsWithinThere id="<%=MissouriTimeSensitiveDeweyReportsForm.TABLE_MAIN%>" tabs="<%=form.getTabs()%>" selectedTab="<%=form.getSelectedTab()%>">
    <tr>
        <td class="TableHeading">Missouri State Reports</td>
    </tr>
    <tr>
        <td width="100%">
            <table id="<%=MissouriTimeSensitiveDeweyReportsForm.TABLE_OPTIONS%>" width="100%">
                <% if (form.getStore().isDistrictUser()) { %>
                    <tr>
                        <td class="ColRowBold tdAlignRight" valign="top">Site</td>
                        <td><base:selectSite selectedSiteID='<%="" + form.getApplyToSiteID() %>' name="<%=MissouriTimeSensitiveDeweyReportsForm.FIELD_APPLY_TO_SITEID %>" collectionType="<%=CollectionType.LIBRARY %>"  onChangeAction="submit()"/></td>
                    </tr>
                <% } else { %>
                    <html:hidden property="<%=MissouriTimeSensitiveDeweyReportsForm.FIELD_APPLY_TO_SITEID %>"/>
                <% } %>
                <tr>
                    <td class="ColRowBold tdAlignRight">Type of report</td>
                    <td class="ColRow">
                        <html:select property="<%=MissouriTimeSensitiveDeweyReportsForm.FIELD_REPORT_TYPE%>" onchange="submit()">
                              <html:option value="<%=String.valueOf(MOReportsFacadeSpecs.REPORT_TYPE_SELECT)%>">-- Select Report --</html:option>
                              <html:option value="<%=String.valueOf(MOReportsFacadeSpecs.REPORT_TYPE_PROFESSIONAL)%>"><%=MOReportsFacadeSpecs.REPORT_NAME_PROFESSIONAL%></html:option>
                              <html:option value="<%=String.valueOf(MOReportsFacadeSpecs.REPORT_TYPE_VISUAL)%>"><%=MOReportsFacadeSpecs.REPORT_NAME_VISUAL%></html:option>
                              <html:option value="<%=String.valueOf(MOReportsFacadeSpecs.REPORT_TYPE_REFERENCE)%>"><%=MOReportsFacadeSpecs.REPORT_NAME_REFERENCE%></html:option>
                        </html:select>
                    </td>
                </tr>
                <% if (form.getReportType() == MOReportsFacadeSpecs.REPORT_TYPE_SELECT) { %>
                <html:hidden property="<%=MissouriTimeSensitiveDeweyReportsForm.FIELD_YEAR_THRESHOLD %>"/>
                <html:hidden property="<%=MissouriTimeSensitiveDeweyReportsForm.FIELD_DEWEY_CATEGORY%>"/>
                <% } else { %>
                <tr>
                    <td class="ColRowBold tdAlignRight" valign="top">Older and Newer counts based on</td>
                    <td valign="top"><span class="ColRow"><html:text property="<%=MissouriTimeSensitiveDeweyReportsForm.FIELD_YEAR_THRESHOLD %>" size="2" maxlength="2"/></span> <span class="ColRowBold">year threshold</span></td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight">Time-Sensitive Dewey Decimal Category</td>
                    <% if (form.getReportType() == MOReportsFacadeSpecs.REPORT_TYPE_PROFESSIONAL) { %>
                    <html:hidden property="<%=MissouriTimeSensitiveDeweyReportsForm.FIELD_DEWEY_CATEGORY%>"/>
                    <td class="ColRow">All Dewey Decimal Categories</td>
                    <% } else { %>
                    <td class="ColRow" valign="top">
                        <html:select property="<%=MissouriTimeSensitiveDeweyReportsForm.FIELD_DEWEY_CATEGORY%>">
                              <html:option value="<%=String.valueOf(MOReportsFacadeSpecs.DEWEY_CAT_PREK3_6)%>"><%=MOReportsFacadeSpecs.DEWEY_CAT_PREK3_6_STRING%></html:option>
                              <html:option value="<%=String.valueOf(MOReportsFacadeSpecs.DEWEY_CAT_MIDDLE)%>"><%=MOReportsFacadeSpecs.DEWEY_CAT_MIDDLE_STRING%></html:option>
                              <html:option value="<%=String.valueOf(MOReportsFacadeSpecs.DEWEY_CAT_HIGH)%>"><%=MOReportsFacadeSpecs.DEWEY_CAT_HIGH_STRING%></html:option>
                              <html:option value="<%=String.valueOf(MOReportsFacadeSpecs.DEWEY_CAT_K12)%>"><%=MOReportsFacadeSpecs.DEWEY_CAT_K12_STRING%></html:option>
                        </html:select>
                    </td>
                    <% } %>
                </tr>
                <tr>
                    <td colspan="2"><base:imageLine/></td>
                </tr>
                <tr>
                    <td class="ColRow" align="center" colspan="2"><base:reportButton/></td>
                </tr>
                <tr>
                    <td colspan="2"><base:imageLine/></td>
                </tr>
                <% } %>
            </table>
        </td>
    </tr>
    <% if (form.getReportType() != MOReportsFacadeSpecs.REPORT_TYPE_SELECT) { %>
    <tr>
        <td width="100%">
            <table id="<%=MissouriTimeSensitiveDeweyReportsForm.TABLE_PREFIXES%>" width="100%">
                <tr>
                    <td class="ColRowBold"><% if (form.getReportType() == MOReportsFacadeSpecs.REPORT_TYPE_REFERENCE) { %>*<%} %>This report includes:</td>
                </tr>
                <tr>
                    <td valign="top"><span class="ColRow">Dewey items with the following prefix(es):</span>
                    <span class="ColRow"><%=form.getIncludeDeweyPrefixes() %></span></td>
                </tr>
                <tr>
                    <td valign="top"><span class="ColRow">Non-Dewey items with the following prefix(es):</span>
                        <span class="ColRow"><%=form.getIncludeNonDeweyPrefixes() %></span></td>
                </tr>
                <% if (form.getReportType() == MOReportsFacadeSpecs.REPORT_TYPE_REFERENCE) { %>
                <tr>
                    <td class="ColRow">Dewey items without a prefix</td>
                </tr>
                <tr>
                    <td><base:imageLine/></td>
                </tr>
                <tr>
                    <td class="Instruction">*No more than 5 copies of any one title may be counted</td>
                </tr>
                <% } %>
            </table>
        </td>
    </tr>
    <% } %>
    </base:outlinedTableAndTabsWithinThere>
</base:form>
