<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.DistrictForecastedVSActualForm" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.BaseTitleDetailForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-destiny.tld" prefix="d" %>

<base:messageBox strutsErrors="true"/>

<c:set var="form" value="<%=request.getAttribute(DistrictForecastedVSActualForm.FORM_NAME)%>"/>
<% int siteTableCounter = 0; %>
<jsp:useBean id="form" type="com.follett.fsc.destiny.client.backoffice.servlet.DistrictForecastedVSActualForm"/>  
<base:outlinedTable id="<%=DistrictForecastedVSActualForm.TABLE_MAIN%>" borderColor='#C0C0C0' cellpadding="0">
    <tr>
        <td>
            <table id="<%=DistrictForecastedVSActualForm.TABLE_FORECAST_TITLE%>" cellpadding="2" cellspacing="0" border="0" width="100%">
                <tr>
                    <td class="TableHeading">
                        ${form.forecastTitle}
                    </td>
                    <td class="tdAlignRight">
                        <c:if test="${!form.printerFriendly}">
                            <base:link page='<%="/backoffice/servlet/presentdistrictforecastedvsactualform.do?" + DistrictForecastedVSActualForm.PARAM_PRINTER_FRIENDLY + "=true&" + DistrictForecastedVSActualForm.PARAM_DISTRICT_FORECAST_ID + "=" + form.getDistrictForecastID()%>' target="printerFriendly" id="<%=DistrictForecastedVSActualForm.ID_PRINTER_FRIENDLY %>"><base:image align="absbottom" src="/buttons/small/printerfriendly.gif" alt="Printer Friendly"/></base:link>
                        </c:if>
                   </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                </tr>
            </table>
        </td>
    </tr>
    <tr>
        <td>
            <table id="<%=DistrictForecastedVSActualForm.TABLE_FORECAST_DEPARTMENT%>" cellSpacing="0" cellPadding="0" width="100%" border="0">
                <c:forEach var="dept" items="${form.guiPack.departments}">
                    <tr>
                        <base:sectionHeading heading="${dept.name}" printerFriendly="false" tdContent="colspan='6'"/>
                    </tr>
                    <c:forEach var="textbook" items="${dept.textbooks}" varStatus="status">
                        <jsp:useBean id="textbook" type="com.follett.fsc.destiny.session.backoffice.data.ForecastedVSActualGUIDistrictTextbooksVO"/>
                        <tr bgcolor="<c:if test="${(status.count % 2) == 1}">#E8E8E8</c:if>">
                            <td class="SmallColHeading" width="40%">Textbook</td>
                            <td class="SmallColHeading" align="center" width="24%">Beginning</td>
                            <td class="SmallColHeading" align="center" width="11%">Peak Need</td>
                            <td class="SmallColHeading" align="center">Current Inventory</td>
                            <td class="SmallColHeading" align="center" width="3%">&nbsp;</td>
                        </tr>
                        <tr bgcolor="<c:if test="${(status.count % 2) == 1}">#E8E8E8</c:if>">
                            <td valign="top" width="40%">
                               <span class="ColRowBold">
                                   <c:choose>
                                        <c:when test="${!form.printerFriendly}"> 
                                           <base:link page='<%="/cataloging/servlet/presenttextbookdetailform.do?" + BaseTitleDetailForm.PARAMETER_VIEW_TYPE + "=" + BaseTitleDetailForm.VIEW_TYPE_DETAILS + "&" + BaseTitleDetailForm.FIELD_BIBID + "=" + textbook.getBibID()%>'>
                                                ${textbook.title}
                                           </base:link>
                                        </c:when>
                                        <c:otherwise>${textbook.title}</c:otherwise>
                                    </c:choose>
                               </span>
                               <c:if test="${fn:length(textbook.ISBN) > 0}">
                                   <br>
                                   <span class="SmallColRow">&nbsp;&nbsp;&nbsp;(<%=ResponseUtils.filter(textbook.getISBN()) %>)</span>
                               </c:if>
                            </td>
                            <td valign="top" class="ColRow" align="center" width="24%">
                                ${d:formatDate(textbook.earliestStartDate)}
                            </td>
                            <td valign="top" class="ColRow" align="center" width="11%">
                               ${d:formatNumber(textbook.peakNeed)}
                            </td>
                            <td valign="top" class="ColRow" align="center">
                                <c:choose>
                                    <c:when test="${!form.printerFriendly}">
                                        <base:link page='<%="/cataloging/servlet/presenttextbookdetailform.do?" + BaseTitleDetailForm.PARAMETER_VIEW_TYPE +"=" + BaseTitleDetailForm.VIEW_TYPE_COPIES + "&" + BaseTitleDetailForm.FIELD_BIBID + "=" + textbook.getBibID()%>'>
                                           ${d:formatNumber(textbook.inventoryCopies)}
                                        </base:link>
                                    </c:when>
                                    <c:otherwise>
                                        ${d:formatNumber(textbook.inventoryCopies)}
                                    </c:otherwise>
                                </c:choose>
                            </td>
                            <td valign="top" align="center" width="3%">
                                &nbsp;
                            </td>
                        </tr>
                        <tr bgcolor="<c:if test="${(status.count % 2) == 1}">#E8E8E8</c:if>">
                            <td valign="top" colspan="6" class="tdAlignRight">
                                <table border="0" width="95%" cellspacing="0" cellpadding="2" id="<%=DistrictForecastedVSActualForm.TABLE_SITE_INFO + siteTableCounter %>">
                                <%siteTableCounter++; %>
                                    <tr>
                                        <td class="SmallColHeading"><base:imageSpacer width="20" height="1"/></td>
                                        <td class="SmallColHeading">&nbsp;</td>
                                        <td class="SmallColHeading" align="center"><b>Peak Need</b></td>
                                        <td class="SmallColHeading" align="center">Current Inventory</td>
                                        <td class="SmallColRow" width="4">&nbsp;</td>
                                    </tr>
                                    <c:forEach var="site" items="${textbook.sites}">
                                        <tr>
                                            <td class="SmallColHeading tdAlignRight"><base:imageSpacer width="20" height="1"/></td>
                                            <td class="ColRowBold" width="60%">${site.siteName}
                                            <td class="ColRow" align="center">${d:formatNumber(site.totalNeed)}</td>
                                            <td class="ColRow" align="center">${d:formatNumber(site.currentInventory)}</td>
                                        </tr>
                                    </c:forEach>
                                    <tr>
                                        <td class="SmallColHeading tdAlignRight">&nbsp;</td>
                                        <td class="SmallColHeading">
                                            <p>&nbsp;</p>
                                        </td>
                                        <td class="SmallColHeading tdAlignRight">&nbsp;</td>
                                        <td class="SmallColHeading tdAlignRight">&nbsp;</td>
                                        <td class="SmallColHeading tdAlignRight" width="4">&nbsp;</td>
                                        <td class="SmallColHeading tdAlignRight">&nbsp;</td>
                                    </tr>
                                </table>
                            </td>
                        </tr>            
                    </c:forEach>
                </c:forEach>
            </table>
        </td>
    </tr>
</base:outlinedTable>

