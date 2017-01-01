<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@page import="com.follett.fsc.destiny.session.backoffice.data.report.ReportEntrySpecs"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>


<%
    OverdueMaterialsReportForm form = (OverdueMaterialsReportForm)request.getAttribute("backoffice_servlet_OverdueMaterialsReportForm");
%>


<table id="<%= OverdueMaterialsReportForm.TABLE_OVERDUE_MATERIALS %>" cellpadding="2" cellspacing="0" border="0" width="100%">
    <tr>
        <td colspan="2" class="Instruction"><%= MessageHelper.formatMessage("overduematerialsreport_OverdueMaterialsByCallNumber") %></td>
        <td colspan="2" class="Instruction tdAlignRight">
            [&nbsp;<base:link id="<%=OverdueMaterialsReportForm.ID_BACK_TO_REPORT_LINK %>" page='<%="/backoffice/servlet/presentreportsform.do?l2m=Patron Reports&sideLink=true&currentTab=" + ReportEntrySpecs.TAB_PATRON%>'><%= MessageHelper.formatMessage("overduematerialsreport_BackToReport") %></base:link>&nbsp;]
        </td>
    </tr>
<%
    List results = form.getResultList();

    if (results.size() > 0) {
        for (int index = 0; index < results.size(); index ++) {
            OverdueMaterialsRecord rec = (OverdueMaterialsRecord)results.get(index);
%>
        <tr bgcolor="<%= OverdueMaterialsReportForm.COLOR_GRAY %>">
            <td class="ColRowBold" valign="top">
                <%= ResponseUtils.filter(rec.getCallNumber()) %>
            </td>
            <td valign="top">
                <span class="ColRowBold">
                    <%= ResponseUtils.filter(rec.getTitle()) %>
                </span>
                &nbsp;
                <span class="ColRow">
                    <%= ResponseUtils.filter(rec.getAuthor()) %>
                </span>
            </td>
            <td valign="top">
                <span class="ColRowBold"><%= MessageHelper.formatMessage("overduematerialsreport_Barcode") %></span>
                <span class="ColRow">
                    <%= ResponseUtils.filter(rec.getCopyBarcodeDisplayable()) %>
                </span>
            </td>
            <td valign="top">
                <span class="ColRowBold"><%= MessageHelper.formatMessage("overduematerialsreport_Price") %>:</span>
                <span class="ColRow">
                    <%= rec.getPrice() %>
                </span>
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td class="Instruction" valign="top">
                <%= ResponseUtils.filter(rec.getPatronName()) %>
<%
                String shortName = rec.getSiteName();
                if (!StringHelper.isEmpty(shortName)) {
%>
                    [<%= ResponseUtils.filter(shortName) %>]
<%
                }
%>(<%= MessageHelper.formatMessage("overduematerialsreport_BarcodeWithParens", ResponseUtils.filter(rec.getPatronBarcode())) %>)
            </td>
            <td class="Instruction" valign="top">
                <%= MessageHelper.formatMessage("overduematerialsreport_Borrowed") %>:
                <%= rec.getDateOut() %>
            </td>
            <td class="Instruction" valign="top">
                <%= MessageHelper.formatMessage("overduematerialsreport_Due") %>:
                <%= rec.getDateDue() %>
            </td>
        </tr>
<%
        }
    } else {
        // no results
%>
    <tr>
        <td class="ColRow" colspan="4" align="center" valign="top"><%= MessageHelper.formatMessage("overduematerialsreport_NoResults") %></td>
    </tr>
<%
    }
%>
    <tr>
        <td>&nbsp;</td>
    </tr>
    <tr>
        <td colspan="4" class="Instruction" align="center" valign="top">
            <%= MessageHelper.formatMessage("overduematerialsreport_ReportGeneratedOn", form.getTimeOfGeneration(session)) %>
        </td>
    </tr>
</table>
