<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.ReportMenuTabForm"%>

<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%
    GenericForm form = (GenericForm) request.getAttribute(SystemReportsForm.FORM_NAME);
    if (form == null) {
        form = (GenericForm) request.getAttribute(ReportMenuTabForm.FORM_NAME);
    }
%>

<c:set var="form" value="<%=form %>" />

<tr>
        <td background="/images/icons/general/thickline.gif" height="18" width="100%">
            <span class="SectionHeader">&nbsp;<%= MessageHelper.formatMessage("systemreportsguts_SystemHealthReports") %>&nbsp;</span>
        </td>
        <td height="18">
            <base:link page="/common/servlet/presentsystemhealthreportsform.do">
                <base:image src="/buttons/large/runreport.gif" name="<%=SystemReportsForm.BUTTON_NEW_SYSTEM_HEALTH_REPORT %>" alt='<%=MessageHelper.formatMessage("runReport") %>' align="absbottom"/>
            </base:link>
        </td>
    </tr>
    <tr>
        <td class="Instruction">
            <%= MessageHelper.formatMessage("systemreportsguts_ThisOptionLetsYouSee") %>
            <br>
            <c:choose>
                <c:when test="${form.perfDataUploading}">
                    <%= MessageHelper.formatMessage("systemreportsguts_Sending") %>
                </c:when>
                <c:otherwise>
                     <%= MessageHelper.formatMessage("systemreportsguts_NotSending") %>
                </c:otherwise>
            </c:choose>
            <%= MessageHelper.formatMessage("systemreportsguts_DestinyServeStatisticalInformation") %>
            <base:link href="/common/servlet/presentsystemhealthreportoptionsform.do">
                    <base:image src="/icons/general/edit.gif" alt='<%=MessageHelper.formatMessage("systemreportsguts_EditReportOptions") %>' align="bottom"/>
            </base:link>
            <br>
            <br>
        </td>
        <td class="ColRow tdAlignRight">&nbsp;</td>
    </tr>
