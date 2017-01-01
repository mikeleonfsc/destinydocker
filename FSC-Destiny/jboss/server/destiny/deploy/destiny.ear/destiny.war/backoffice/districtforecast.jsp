<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.DistrictForecastForm" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-destiny.tld" prefix="d" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>

<base:messageBox strutsErrors="true"/>

<c:set var="form" value="<%=request.getAttribute(DistrictForecastForm.FORM_NAME)%>"/>
<base:form action="/backoffice/servlet/handledistrictforecastform.do">
    <html:hidden property="<%= DistrictForecastForm.PARAM_REAL_RESERVE %>"/>
    <logic:equal name="<%=DistrictForecastForm.FORM_NAME%>" property="confirmFinalize" value="true">
        <base:confirmBox
        header="Are you sure you want to finalize this forecast? You will not be able to edit the forecast after it has been finalized."          
        noName="<%=DistrictForecastForm.BUTTON_NO%>"
        yesName="<%=DistrictForecastForm.BUTTON_YES_FINALIZE%>"
        showWarningIcon="true"/>
    </logic:equal>
    <base:outlinedTable id="<%= DistrictForecastForm.TABLE_MAIN %>" borderColor='#C0C0C0' >
    
        <tr>
            <td class="TableHeading" valign = "center">
                ${form.pack.name}: ${d:formatDate(form.pack.startTime)} - ${d:formatDate(form.pack.endTime)}
            </td>
            <td class="tdAlignRight" rowspan="2">
                <table>
                    <tr>
                        <td class="tdAlignRight">
                            <c:if test="${form.editable}">
                                <base:genericButton name="<%= DistrictForecastForm.BUTTON_SAVE_AND_VIEW %>" src= "/buttons/large/saveandview.gif" alt="<%=DistrictForecastForm.ALT_SAVE_AND_VIEW %>"/>
                            </c:if>
                            <c:if test="${!form.editable}">
                                <base:genericButton name="<%= DistrictForecastForm.BUTTON_EDIT %>" src= "/buttons/large/edit.gif" alt="<%=DistrictForecastForm.ALT_EDIT %>"/>
                            </c:if>
                        </td>
                    </tr>
                    <c:if test="${!form.pack.containsUnfinishedForecasts && !form.editable && fn:length(form.departments) > 0}">
                        <tr>
                            <td class="tdAlignRight">
                                <base:genericButton name="<%=DistrictForecastForm.BUTTON_FINALIZE%>" src="/buttons/large/finalizepartial.gif" alt="<%=DistrictForecastForm.ALT_FINALIZE%>"/>
                            </td>
                        </tr>
                    </c:if>
                    <tr>
                        <c:if test="${form.editable}">
                            <td class="tdAlignRight">
                                <base:cancelButton/>
                            </td>
                        </c:if>
                        <c:if test="${!form.editable}">
                            <td class="tdAlignRight">
                                <base:closeButton withX="true"/>
                            </td>
                        </c:if>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td>
                <c:if test="${fn:length(form.departments) > 0}">
                <span class="ColRowBold">${form.viewString}</span>
                <span class="ColRow"><base:link page="/backoffice/servlet/presentforecastlimitersform.do">Change View</base:link></span>
                </c:if>
            </td>
        </tr>
        <c:if test="${form.viewLimited}">
            <tr>
                <td class="Instruction">
                    &nbsp;&nbsp;Please note, the District Reserve reflects the total amount for the entire forecast.
                </td>
            </tr>
        </c:if>
        <c:if test="${(form.editable && fn:length(form.departments) > 0) && !form.viewLimited }">
            <tr>
                <td colspan= "2">
                    <base:imageLine height="2"/>
                </td>
            </tr>
            <tr>
                <td class="SmallColHeading" colspan="2">
                    Adjust District Reserve...&nbsp;
                    <base:genericButton name="<%=DistrictForecastForm.BUTTON_UPDATE_RESERVE%>" 
                     src="/buttons/large/update.gif" alt="<%=DistrictForecastForm.ALT_UPDATE_DISTRICT_RESERVE%>" absbottom="true"/>               
                </td>
            </tr>
            <tr>
                <td colspan="2" class="SmallColHeading">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Set to
                    <html:text property="<%=DistrictForecastForm.FIELD_RESERVE_PERCENTAGE%>" size="3" maxlength="3" />
                    % of Requested Copies in this view
                    </td>
            </tr>
        </c:if>
        <c:set var="deptTableInc" value="0"/>
        <c:forEach var="dept" items="${form.departments}">
            <c:if test="${dept.displayable}">
                <tr>
                    <base:sectionHeading printerFriendly="false" heading="${dept.name}" tdContent="colspan='2' valign='middle'"/>
                </tr>
                <tr>
                    <td colspan="2">
                        <table id="<%= DistrictForecastForm.TABLE_DEPT%>_${deptTableInc}" width="100%" cellspacing="0" cellpadding="2">
                            <c:set var="useSpace" value="0"/>
                            <c:forEach var="textbook" items="${dept.textbooks}">
                               <c:if test="${textbook.displayable}">
                                    <c:if test="${useSpace == 1}">
                                        <tr>
                                            <td colspan="3">
                                                &nbsp;
                                            </td>
                                        </tr>
                                    </c:if>
                                    <c:if test="${useSpace == 0}">
                                        <c:set var="useSpace" value="1"/>
                                    </c:if>
                                    <tr>
                                        <td>
                                            <span class="ColRowBold">
                                                ${textbook.title}
                                            </span>
                                            <span class="ColRow">
                                                <c:if test="${fn:length(textbook.ISBN) > 0}">
                                                    (${textbook.ISBN})
                                                </c:if>
                                            </span>
                                        </td>
                                        <td class="ColRowBold tdAlignRight">
                                            District Peak Need &nbsp;&nbsp;
                                        </td>
                                        <td class="ColRowBold tdAlignRight">
                                            ${textbook.peakNeed}
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="2" class="SmallColRow tdAlignRight">
                                            <c:if test="${fn:length(textbook.peakRange) > 0}">
                                                (${textbook.peakRange})&nbsp;&nbsp;
                                            </c:if>
                                        </td>
                                        <td>&nbsp;</td>
                                    </tr>
                                    <tr>
                                        <td colspan="2" class="ColRowBold tdAlignRight" nowrap>
                                            Copies Needed &nbsp;&nbsp;
                                        </td>
                                        <td class="ColRowBold tdAlignRight" nowrap>
                                            ${d:formatNumber((textbook.totalCopies + textbook.districtReserve))}
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="2" class="SmallColHeading tdAlignRight">Requested&nbsp;&nbsp;</td>
                                        <td class="SmallColRow tdAlignRight">${d:formatNumber(textbook.totalCopies) } </td>
                                    </tr>
                                    <tr>
                                        <td colspan="2" class="SmallColHeading tdAlignRight">+ Reserve&nbsp;&nbsp;</td>
                                        <td class="SmallColRow tdAlignRight">${form.realReservePercentage}%</td>
                                    </tr>
                                    <tr>
                                        <td colspan="3">
                                            <table id="<%=DistrictForecastForm.TABLE_TEXTBOOK%>_${deptTableInc}_${textbook.bibID}" width="100%" cellspacing="0" cellpadding="0">
                                                <tr>
                                                    <td><base:imageSpacer width="20" height="1"/></td>
                                                    <td class="SmallColRow">&nbsp;</td>
                                                    <td class="SmallColHeading"  align="center">Copies Needed</td>
                                                    <td class="SmallColRow">&nbsp;</td>
                                                </tr>
                                                <tr>
                                                    <td><base:imageSpacer width="20" height="1"/></td>
                                                    <td class="TableHeading2">
                                                        District Reserve
                                                    </td>
                                                    <td class="ColRow" align="center">
                                                    ${d:formatNumber(textbook.districtReserve)}
                                                    </td>
                                                    <td class="ColRow">
                                                    &nbsp;
                                                    </td>
                                                </tr>
                                                <c:set var="flipper" value="false"/>
                                                <c:set var="trvalue" value="#E8E8E8"/>
                                                <c:forEach var="site" items="${textbook.sites}">
                                                    <c:if test="${site.displayable}">
                                                        <c:choose>
                                                            <c:when test="${flipper}">
                                                                <c:set var="flipper" value="false"/>
                                                                <c:set var="trvalue" value=""/>
                                                            </c:when>
                                                            <c:otherwise>
                                                                <c:set var="flipper" value="true"/>
                                                                <c:set var="trvalue" value="#E8E8E8"/>
                                                            </c:otherwise>
                                                        </c:choose>
                                                        
                                                        <tr bgcolor="${trvalue}">
                                                            <td><base:imageSpacer width="20" height="1"/></td>
                                                            <td class="ColRowBold" width="60%">
                                                            ${site.siteName}
                                                            </td>
                                                            <td class="ColRow" align="center">
                                                            ${d:formatNumber(site.totalCopies)}
                                                            </td>
                                                            <td class="SmallColRow">
                                                                <c:url var="url" value="${form.baseURL}">
                                                                    <c:param name="departmentID" value="${dept.departmentID}"/>
                                                                    <c:param name="bibID" value="${textbook.bibID}"/>
                                                                    <c:param name="siteID" value="${site.siteID}"/>
                                                                </c:url>
                                                            
                                                                <c:if test="${form.editable}">
                                                                    <c:if test="${site.showMore == true}">
                                                                        <a class="detailLink" href="${url}">Show&nbsp;Less&nbsp;<base:image src="/icons/general/showless.gif" /></a> 
                                                                    </c:if>
                                                                    <c:if test="${site.showMore == false}">
                                                                        <a class="detailLink" href="${url}">Show&nbsp;More&nbsp;<base:image src="/icons/general/showmore.gif" /></a> 
                                                                    </c:if>                                                
                                                                </c:if>
                                                            </td>
                                                        </tr>
                                                        <c:if test="${site.showMore == true && form.editable}">
                                                            <tr>
                                                                <td><base:imageSpacer width="20" height="1"/></td>
                                                                <td colspan="3">
                                                                    <table id="<%=DistrictForecastForm.TABLE_SITE%>_${deptTableInc}_${textbook.bibID}_${site.siteID}" width="100%" cellspacing="0" cellpadding="3">
                                                                    <tr>
                                                                        <td><base:imageSpacer width="20" height="1"/></td>
                                                                        <td class="SmallColHeading" valign="bottom">Class</td>
                                                                        <td class="SmallColHeading" valign="bottom" align="center" nowrap>Section #</td>
                                                                        <td class="SmallColHeading" align="center">Initial<br>Enrollment</td>
                                                                        <td class="SmallColHeading" align="center">Copies<br>Requested</td>
                                                                        <td class="SmallColHeading" align="center">Checkouts<br>Start</td>
                                                                        <td class="SmallColHeading" align="center">Textbooks<br>Due</td>
                                                                    </tr>
                                                                    <c:forEach var="clazz" items="${site.classes}" varStatus="classStatus">
                                                                        <c:set var="totalEnroll" value="0"/>
                                                                        <c:set var="totalRequest" value="0"/>
                                                                        <c:set var="totalApproved" value="0"/>
                                                                        <c:forEach var="section" items="${clazz.sections}" varStatus="sectionStatus">
                                                                            <tr>
                                                                                <td><base:imageSpacer width="20" height="1"/></td>
                                                                                <td class="ColRow">
                                                                                    <c:choose>
                                                                                        <c:when test="${!sectionStatus.first}">
                                                                                            &nbsp;
                                                                                        </c:when>
                                                                                        <c:otherwise>
                                                                                            ${clazz.name}
                                                                                        </c:otherwise>
                                                                                    </c:choose>
                                                                                </td>
                                                                                <td class="ColRow" align="center">
                                                                                    ${section.suffix}
                                                                                </td>
                                                                                <td class="ColRow" align="center">
                                                                                    ${d:formatNumber(section.initialEnrollment)}
                                                                                    <c:set var="totalEnroll" value="${totalEnroll + section.initialEnrollment}"/>
                                                                                </td>
                                                                                <td class="ColRow" align="center">
                                                                                    ${d:formatNumber(section.forecastedEnrollment)}
                                                                                    <c:set var="totalRequest" value="${totalRequest + section.forecastedEnrollment}"/>
                                                                                </td>
                                                                                <td class="ColRow" align="center">
                                                                                    ${d:formatDate(section.startTime)}
                                                                                </td>
                                                                                <td class="ColRow" align="center">
                                                                                    ${d:formatDate(section.endTime)}
                                                                                </td>
                                                                            </tr>
                                                                        </c:forEach>

                                                                        <c:if test="${!classStatus.last}">
                                                                        <tr>
                                                                            <td><base:imageSpacer width="20" height="1"/></td>                                                            
                                                                            <td colspan="6">
                                                                                <base:imageLine />
                                                                            </td>
                                                                        </tr>
                                                                        </c:if>                                                                            
                                                                    </c:forEach>
                                                                        <tr>
                                                                            <td colspan="2" class="ColRowBold tdAlignRight">Site Totals</td>
                                                                            <td>&nbsp;</td>
                                                                            <td class="ColRowBold" align="center">${d:formatNumber(site.totalInitialEnrollment)}</td>
                                                                            <td class="ColRowBold" align="center">${d:formatNumber(site.totalCopies)}</td>
                                                                            <td>&nbsp;</td>
                                                                        </tr>
                                                                        <tr>                                                                                                                                           
                                                                            <td colspan="2" class="ColRow tdAlignRight">
                                                                                <b>Site Peak Need</b> 
                                                                                <c:if test="${fn:length(site.peakRange) > 0}">
                                                                                    (${site.peakRange})
                                                                                </c:if>
                                                                            </td>
                                                                            <td>&nbsp;</td>
                                                                            <td>&nbsp;</td>
                                                                            <td class="ColRowBold" align="center">${d:formatNumber(site.peakNeed)}</td>
                                                                            <td>&nbsp;</td>
                                                                        </tr>
                                                                    </table>
                                                                </td>
                                                            </tr>
                                                        </c:if>
                                                    </c:if>                                                    
                                                </c:forEach>    <%-- sites --%>
                                            </table>
                                        </td>
                                    </tr>
                                </c:if>
                            </c:forEach>    <%-- textbooks --%>
                        </table>
                    </td>
                </tr>
                <c:set var="deptTableInc" value="${deptTableInc + 1}"/>
            </c:if>
        </c:forEach>    <%-- departments --%>
        <c:if test="${fn:length(form.departments) == 0}">
        <tr>
            <td colspan="2">
                <base:imageLine height="2"/>
            </td>
        </tr>
        <tr>
            <td colspan="2" class="ColRowBold" align="center">
            There are no textbooks in this forecast.
            </td>
        </tr>
        </c:if>
    </base:outlinedTable>
</base:form>

