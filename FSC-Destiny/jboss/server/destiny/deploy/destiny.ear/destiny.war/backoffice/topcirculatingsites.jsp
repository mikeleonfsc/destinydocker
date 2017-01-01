<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.TopCirculatingSitesForm" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-destiny.tld" prefix="d" %>


<base:messageBox strutsErrors="true"/>

<%
    TopCirculatingSitesForm form = (TopCirculatingSitesForm)request.getAttribute(TopCirculatingSitesForm.FORM_NAME);
%>

<c:set var="dForm" value="<%=request.getAttribute(TopCirculatingSitesForm.FORM_NAME)%>"/>
<base:form action="/backoffice/servlet/handletopcirculatingsitesform.do">

    <table id="<%=TopCirculatingSitesForm.TABLE_MAIN%>" width="100%" cellpadding="2">
        <tr>
            <td class="TableHeading">
            <bean:write name="<%= TopCirculatingSitesForm.FORM_NAME %>" property="pageHeader"/>
                <c:if test="<%= !form.isPrinterFriendly()%>">
                    <span class="Instruction">
                        <%= MessageHelper.formatMessage("topcirculatingsites_CustomizeView", "<a href=\"#controls\">", "</a>") %>
                    </span>
                </c:if>
            </td>
            <td class="tdAlignRight">
                &nbsp;
                <c:if test="<%= !form.isPrinterFriendly()%>">
                    <base:link target="printerFriendly" page="<%= form.getPrinterFriendlyLink() %>" id="<%=TopCirculatingSitesForm.ID_PRINTER_FRIENDLY %>"><base:image src="/buttons/small/printerfriendly.gif" alt='<%= MessageHelper.formatMessage("printable")%>' /></base:link>
                </c:if>
            </td>
        </tr>
    </table>
    <c:if test="<%=form.getSiteList() != null && ! form.getSiteList().isEmpty() %>">
        <table width="100%" id="<%= TopCirculatingSitesForm.TABLE_DATA %>" cellpadding="2" cellspacing="0">
            <tr>
                <c:choose>
                    <c:when test="<%=form.getGroupSites() == TopCirculatingSitesForm.PARAM_NOT_GROUPED %>">
                        <td align="center">&nbsp;</td>
                        <td class="SmallColHeading"><%= MessageHelper.formatMessage("topcirculatingsites_SiteName") %></td>
                    </c:when>
                    <c:otherwise>
                        <td class="SmallColHeading" colspan="2"><%= MessageHelper.formatMessage("topcirculatingsites_SiteName") %></td>
                    </c:otherwise>
                </c:choose>
                <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("topcirculatingsites_TotalPatrons") %></td>
                <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("topcirculatingsites_AverageCircsPatron") %></td>
                <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("topcirculatingsites_TotalCirculations") %></td>
            </tr>
            <c:set var="lastSiteType" value=""/>
            <c:set var="siteCount" value="1"/>
            <c:forEach var="siteRow" items="<%=form.getSiteList()%>" varStatus="siteRowIndex">
                <jsp:useBean id="siteRow" type="com.follett.fsc.destiny.session.backoffice.data.TopCirculatingSitesVO"/>
                <c:if test="<%=form.getGroupSites() == TopCirculatingSitesForm.PARAM_GROUPED %>">
                    <c:if test="${lastSiteType != siteRow.siteTypeDescription}">
                        <c:set var="siteCount" value="1"/>
                        <c:if test="${siteRowIndex.index > 0}">
                            <tr>
                                <td colspan="5" class="SmallColHeading">
                                    &nbsp;
                                </td>
                            </tr>
                        </c:if>
                        <tr>
                            <td colspan="5" class="SmallColHeading">
                                <base:imageSpacer width="2" height="5"/><c:out value="${siteRow.siteTypeDescription}" />
                            </td>
                        </tr>
                    </c:if>
                    <c:set var="lastSiteType" value="${siteRow.siteTypeDescription}"/>
                </c:if>
                <tr>
                    <td class="ColRowBold tdAlignRight"><base:imageSpacer width="4" height="5"/>${siteCount}.</td>
                    <td class="ColRow"><c:out value="${siteRow.siteName}" /></td>
                    <td class="ColRow tdAlignRight">${d:formatNumber(siteRow.totalPatrons)}</td>
                    <td class="ColRow tdAlignRight"><c:out value="${siteRow.circsPerPatron}" /></td>
                    <td class="ColRow tdAlignRight">${d:formatNumber(siteRow.totalCirculations)}</td>
                </tr>
                <c:set var="siteCount" value="${siteCount + 1}"/>
            </c:forEach>
        </table>
        <c:if test="<%=form.isPrinterFriendly()%>">
            <table id="<%=TopCirculatingSitesForm.TABLE_PRINTABLE_PARAMETERS%>" align="center">
                <tr><td>&nbsp;</td></tr>
                <tr>
                    <td class="ColRowBold">
                        <ul>
                            <li><%= MessageHelper.formatMessage("topcirculatingsites_SortBy0Order",form.getOrderByDisplayable(form.getOrderBy())) %></li> 
                            <li><%= MessageHelper.formatMessage("topcirculatingsites_ForThePast01", form.getTimeframeUnits(),form.getTimeframeSelectedDisplayable(form.getTimeframeSelected()))%></li> 
                            <li><%= MessageHelper.formatMessage("topcirculatingsites_BySiteType",form.getGroupSitesDisplayable(form.getGroupSites())) %></li> 
                        </ul>
                    </td>
                </tr>
                <tr><td>&nbsp;</td></tr>
                <tr>
                    <td align="center" class="Instruction">
                        <%= MessageHelper.formatMessage("topcirculatingsites_ReportGeneratedOn", form.getTimeOfGeneration()) %>
                    </td>
                </tr>
            </table>
        </c:if>
    </c:if>


<c:if test="<%= !form.isPrinterFriendly()%>">
    <a name="controls"></a>
    <table width="100%">
        <c:if test="<%=form.getSiteList() != null && ! form.getSiteList().isEmpty() %>">
            <tr><td>&nbsp;</td></tr>
            <tr>
                <td>
                    <base:imageLine/>
                </td>
            </tr>
            <tr><td>&nbsp;</td></tr>
        </c:if>
        <tr align="center">
            <td>
                <table id="<%= TopCirculatingSitesForm.TABLE_CONTROLS %>" cellpadding="2" cellspacing="0" align="center">
                    <tr>
                        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("topcirculatingsites_SortBy") %></td>
                        <td class="ColRowBold tdAlignLeft">
                                <bean:define id="sortByOptions" name="<%=TopCirculatingSitesForm.FORM_NAME %>" property="sortByOptions" />
                                <html:select property="<%= TopCirculatingSitesForm.FIELD_SORT_BY %>">
                                    <html:options collection="sortByOptions" property="longID" labelProperty="stringDesc"/>
                                </html:select>&nbsp;
                                <bean:define id="orderByOptions" name="<%=TopCirculatingSitesForm.FORM_NAME %>" property="orderByOptions" />
                                <html:select property="<%= TopCirculatingSitesForm.FIELD_ORDER_BY %>">
                                    <html:options collection="orderByOptions" property="longID" labelProperty="stringDesc"/>
                                </html:select>
                        </td>
                        <td class="ColRowBold" valign="top" rowspan="3">
                                <base:genericShowHideButton name="<%= TopCirculatingSitesForm.BUTTON_UPDATE %>"
                                    src="/buttons/large/update.gif"
                                    alt='<%= MessageHelper.formatMessage("update") %>'>
                                </base:genericShowHideButton>
                        </td>
                    </tr>
                    <tr>
                        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("topcirculatingsites_ForThePast") %></td>
                        <td class="tdAlignLeft" colspan="2">
                            <html:text property="<%= TopCirculatingSitesForm.FIELD_TIMEFRAME_UNITS %>" size="3" maxlength="2"></html:text>
                            <bean:define id="timeframeSelectedOptions" name="<%=TopCirculatingSitesForm.FORM_NAME %>" property="timeframeSelectedOptions" />
                            <html:select property="<%= TopCirculatingSitesForm.FIELD_TIMEFRAME_SELECTED %>">
                                <html:options collection="timeframeSelectedOptions" labelProperty="stringDesc" property="longID"/>
                            </html:select>
                        </td>
                    </tr>
                    <tr>
                        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("topcirculatingsites_GroupSites") %></td>
                        <td class="tdAlignLeft" colspan="2">
                            <bean:define id="groupOptions" name="<%=TopCirculatingSitesForm.FORM_NAME %>" property="groupOptions" />                                
                            <html:select property="<%= TopCirculatingSitesForm.FIELD_GROUP_SITES %>">
                                <html:options collection="groupOptions" property="longID" labelProperty="stringDesc"/>
                            </html:select>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
</c:if>
</base:form>
