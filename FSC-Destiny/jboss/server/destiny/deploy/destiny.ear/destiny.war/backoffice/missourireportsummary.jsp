<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.DestinyColors"%>
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
<%@page import="com.follett.fsc.destiny.session.backoffice.ejb.MOReportsFacadeSpecs"%>
<%@page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%>
<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.common.MessageHelper"%>

<%
    MissouriReportSummaryForm form = (MissouriReportSummaryForm)request.getAttribute(MissouriReportSummaryForm.FORM_NAME);
%>

<table id="<%=MissouriReportSummaryForm.TABLE_HEADER%>" width="100%">
    <tr>
        <td class="tdAlignRight">
        <% if (!form.isPrinterFriendly()) { %>
            <base:link page="<%=form.getPrinterFriendlyLink() %>" target="printerFriendly" id="<%=MissouriReportSummaryForm.ID_PRINTER_FRIENDLY %>">
                <base:image src="/buttons/small/printerfriendly.gif" alt="Printer Friendly"/>
            </base:link>
        <% } else { %>
            &nbsp;
        <% } %>
        </td>
    </tr>
    <tr>
        <td class="TableHeading" align="center" width="100%"><%=MessageHelper.formatMessage("missourireportsummary_MissouriStateReport")%></td>
    </tr>
    <tr>
        <td class="ColRowBold" align="center">for <%=form.getSiteName()%></td>
    </tr>
    <tr>
        <td>&nbsp;</td>
    </tr>
</table>

<table id="<%=MissouriReportSummaryForm.TABLE_DATA%>" width="100%" cellspacing="0" cellpadding="2">
    <tr bgcolor="<%=DestinyColors.BACKGROUND%>">
        <td width="40%">&nbsp;</td>
        <td width="20%">&nbsp;</td>
        <td width="20%" class="ColRowBoldWhiteHyperlink tdAlignRight"><%=MessageHelper.formatMessage("missourireportsummary_Age")%></td>
        <td width="20%" class="ColRowBoldWhiteHyperlink tdAlignRight"><%=MessageHelper.formatMessage("missourireportsummary_Collection")%></td>
    </tr>
    <tr>
        <td width="40%">&nbsp;</td>
        <td width="20%">&nbsp;</td>
        <td width="20%" class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("missourireportsummary_AverageAge")%></td>
        <td width="20%" class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("missourireportsummary_CopyCount")%></td>
    </tr>
    <tr>
        <td width="40%" align="left">Fiction</td>
        <td width="20%">&nbsp;</td>
        <td width="20%" class="tdAlignRight"><%=form.gimmeAverageAgeCurrentAgeFictionStr()%>&nbsp;<span class="Instruction">[<%=form.gimmeAverageAgeFictionStr()%> yrs.]</span></td>
        <td width="20%" class="tdAlignRight"><%=form.gimmeCopyCountFiction()%></td>
    </tr>
    <tr bgcolor="<%=FlipperTag.ROW_GRAY%>">
        <td width="40%" align="left">Reference and Nonfiction</td>
        <td width="20%">&nbsp;</td>
        <td width="20%" class="tdAlignRight"><%=form.gimmeAverageAgeCurrentAgeReferenceAndNonFictionStr()%>&nbsp;<span class="Instruction">[<%=form.gimmeAverageAgeReferenceAndNonFictionStr()%> yrs.]</span></td>
        <td width="20%" class="tdAlignRight"><%=form.gimmeCopyCountReferenceAndNonFiction()%></td>
    </tr>
    <tr>
        <td width="40%" align="left">Visual</td>
        <td width="20%">&nbsp;</td>
        <td width="20%">&nbsp;</td>
        <td width="20%" class="tdAlignRight"><%=form.gimmeCopyCountVisual()%></td>
    </tr>
</table>
