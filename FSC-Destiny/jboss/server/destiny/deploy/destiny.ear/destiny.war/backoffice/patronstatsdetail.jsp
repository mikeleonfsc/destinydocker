<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LoginFacadeSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.session.circulation.ejb.*" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>


<base:messageBox strutsErrors="true"/>

<bean:define id="form" name="backoffice_servlet_PatronStatsDetailForm" type="PatronStatsDetailForm"/>
<bean:define id="list" name="backoffice_servlet_PatronStatsDetailForm" property="list" type="ArrayList"/>
<bean:define id="rowCount" name="backoffice_servlet_PatronStatsDetailForm" property="rowCount" type="Integer"/>

<base:form action="/backoffice/servlet/presentpatronstatsdetailform.do" target="printerFriendly" disableIntercepter="true">

    <html:hidden property="reportSiteID" />
    <html:hidden property="primaryGroup" />
    <html:hidden property="primaryGroupData" />
    <html:hidden property="secondaryGroup" />
    <html:hidden property="secondaryGroupData" />
    <html:hidden property="includeActive" />
    <html:hidden property="includeInactive" />
    <html:hidden property="includeRestricted" />
    <html:hidden property="librarySelected" />
    <input type="hidden" name="<%=PatronStatsDetailForm.PARAM_PRINTER_FRIENDLY %>" value="on">
    <c:forEach var="patronType" items="<%= form.getPatronTypeLimiter() %>">
        <c:set var="patronTypeEscaped"><c:out value="${patronType}" escapeXml="true"></c:out></c:set>
        <input type="hidden" name="patronTypeLimiter" value="${patronTypeEscaped}">
    </c:forEach>

    <table id="<%=PatronStatsDetailForm.TABLE_OUTER%>" width="100%" border="0" style="border-collapse: collapse" bordercolor="#111111" cellspacing="0" cellpadding="0">
        <tr>
            <td>
                <table id="<%=PatronStatsDetailForm.TABLE_PRINTER_FRIENDLY_HEADER%>" width="100%" border="0" cellspacing="0" cellpadding="2">
                    <tr>
                    <logic:equal name="backoffice_servlet_PatronStatsDetailForm" property="print" value="true">
                        <td class="MainHeader" align="center"><bean:write name="<%= form.FORM_NAME %>" property="siteName"/></td>
                    </tr>
                    <tr>
                        <td class="SmallColHeading" align="center"><%=MessageHelper.formatMessage("patronstatsdetail_PatronStatistics") %></td>
                    </tr>
                    <tr>
                        <td class="ColRow" align="center">
                        <bean:write name="<%= form.FORM_NAME %>" property="printerFriendlySubTitle"/>
                        </td>
                    </tr>
                    </logic:equal>
                    <logic:notEqual name="backoffice_servlet_PatronStatsDetailForm" property="print" value="true">
                        <TD class=Instruction vAlign=top><bean:write name="<%= form.FORM_NAME %>" property="pageTitle"/></TD>
                        <td class="SmallColRow tdAlignRight">
                            <base:genericButton name="<%=PatronStatsDetailForm.BUTTON_PRINTER_FRIENDLY %>" src="/buttons/small/printerfriendly.gif" alt='<%=MessageHelper.formatMessage("printable") %>' />
                        </td>
                    </tr>
                    </logic:notEqual>
                </table>

                <table id="colheading1" width="100%" border="0" cellspacing="0" cellpadding="2">
                    <tr bgColor="<%=DestinyColors.BACKGROUND%>">
                        <TD class="InverseSmallColHeading" align="center" width="30%"><%=MessageHelper.formatMessage("patronstatsdetail_Patron") %></TD>
                        <TD class="InverseSmallColHeading" align="center">&nbsp;</TD>
                        <TD class="InverseSmallColHeading" align="center" colspan="4" width="80%"><bean:write name="<%= form.FORM_NAME %>" property="circulationHeading"/> </TD>
                    </tr>
                </table>

                <table id="<%=PatronStatsDetailForm.TABLE_CONTENTS%>" width="100%" cellspacing="0" cellpadding="2" border="0">
                    <tr>
                        <td class="SmallColHeading" colspan="2">
                           &nbsp;
                        </td>
                        <td class="SmallColHeading tdAlignRight"><%=MessageHelper.formatMessage("patronstatsdetail_Today") %></td>
                        <td class="SmallColHeading tdAlignRight"><%=MessageHelper.formatMessage("patronstatsdetail_ThisMonth") %></td>
                        <td class="SmallColHeading tdAlignRight"><%=MessageHelper.formatMessage("patronstatsdetail_ThisYear") %></td>
                        <td class="SmallColHeading tdAlignRight"><%=MessageHelper.formatMessage("patronstatsdetail_Total") %></td>
                    </tr>
                    <logic:iterate id="detailRow" name="list" type="com.follett.fsc.destiny.session.backoffice.data.PatronDetailStatisticsReportRow" indexId="detailIndex">
               <%-- Output the summary for the library type group here </logic:notEmpty> --%>
               <%-- <logic:notEmpty name="detailRow" property="patronName"/>--%>
               <% if (detailRow.getPatronBarcode() != null) { %>
                    <tr>
                        <td colspan="2">
                            <span class="ColRowBold"><bean:write name="detailRow" property="patronName"/></span><span class="ColRow"> (<bean:write name="detailRow" property="patronType"/>: <bean:write name="detailRow" property="patronBarcode"/>)</span>
                        </td>
                        <td class="tdAlignRight">
                            <base:numberPercentageReportCellTag name="detailRow" count="todayCircCount" countClass="ColRow"/>
                        </td>
                        <td class="tdAlignRight">
                            <base:numberPercentageReportCellTag name="detailRow" count="thisMonthCircCount" countClass="ColRow"/>
                        </td>
                        <td class="tdAlignRight">
                            <base:numberPercentageReportCellTag name="detailRow" count="thisYearCircCount" countClass="ColRow"/>
                        </td>
                        <td class="tdAlignRight">
                            <base:numberPercentageReportCellTag name="detailRow" count="totalCircCount" countClass="ColRow"/>
                        </td>
                    </tr>
                    <%-- </logic:notEmpty>
                    <logic:empty name="detailRow" property="patronName"/>--%>
                <% } else { %>
                    <tr>
                        <td class="ColRowBold" valign="top" align="center" colSpan="9"><base:imageLine width="100%" height="2"/></td>
                    </tr>
                    <tr>
                        <td class="ColRowBold"><%=MessageHelper.formatMessage("patronstatsdetail_Patrons", Long.valueOf(Integer.valueOf(form.getRowCount()).longValue()))%></td>
                        <td class="ColRowBold tdAlignRight"><bean:write name="<%= form.FORM_NAME %>" property="circulationHeading"/>:</td>

                        <td class="tdAlignRight">
                            <base:numberPercentageReportCellTag name="detailRow" count="todayCircCount" countClass="ColRowBold"/>
                        </td>
                        <td class="tdAlignRight">
                            <base:numberPercentageReportCellTag name="detailRow" count="thisMonthCircCount" countClass="ColRowBold"/>
                        </td>
                        <td class="tdAlignRight">
                            <base:numberPercentageReportCellTag name="detailRow" count="thisYearCircCount" countClass="ColRowBold"/>
                        </td>
                        <td class="tdAlignRight">
                            <base:numberPercentageReportCellTag name="detailRow" count="totalCircCount" countClass="ColRowBold"/>
                        </td>
                    </tr>
                    <tr>
                        <td class="ColRowBold" valign="top" align="center" colSpan="9"><base:imageLine width="100%" height="2"/></td>
                    </tr>
                    <%-- </logic:empty>--%>
                <% } %>
                    </logic:iterate>
                </table><!-- End of content table -->
                <br>

                <table id="<%=PatronStatsDetailForm.TABLE_SUMMARY%>" cellspacing="0" cellpadding="4" border="0" align="center">
                <tr>
                <td class="Instruction" align="center">
                <bean:write name="<%= form.FORM_NAME %>" property="reportOptionsDescription"/>
                </td>
                </tr>
                </table>

                <logic:equal name="backoffice_servlet_PatronStatsDetailForm" property="print" value="true">
                    <div align="center"><span class="Instruction"><%=MessageHelper.formatMessage("patronstatsdetail_ReportGeneratedOn", form.getTimeOfGeneration(session)) %>
					<br></span></div>
                </logic:equal>
            </td>
        </tr>
    </table>

</base:form>
