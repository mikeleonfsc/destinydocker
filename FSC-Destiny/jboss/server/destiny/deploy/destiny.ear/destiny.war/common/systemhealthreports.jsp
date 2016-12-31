<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.SystemHealthReportsForm" %>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<bean:define id="uptimeRanges" name="<%=SystemHealthReportsForm.FORM_NAME%>" property="uptimeRanges"/>

<%
    SystemHealthReportsForm form = (SystemHealthReportsForm) request.getAttribute(SystemHealthReportsForm.FORM_NAME);
    boolean requestResponseOrBandwidthReport = SystemHealthReportsForm.OPTION_REPORT_TYPE_REQUEST_RESPONSE.equals(form.getReportType()) || SystemHealthReportsForm.OPTION_REPORT_TYPE_BANDWIDTH.equals(form.getReportType());
    List dateButtonIDs = new ArrayList();
    if (requestResponseOrBandwidthReport) {
        dateButtonIDs.add("PrevDate");
        dateButtonIDs.add("NextDate");
    }
%>

<base:form action="/common/servlet/handlesystemhealthreportsform.do">
    <c:if test="<%=!SystemHealthReportsForm.OPTION_REPORT_TYPE_SERVER_UPTIME.equals(form.getReportType())%>">
        <html:hidden property="<%=SystemHealthReportsForm.FIELD_UPTIME_DATE%>"/>
    </c:if>
    <c:if test="<%=!SystemHealthReportsForm.OPTION_REPORT_TYPE_BROWSER.equals(form.getReportType())%>">
        <html:hidden property="<%=SystemHealthReportsForm.FIELD_DATE_RANGE%>"/>
    </c:if>
    <c:if test="<%=!SystemHealthReportsForm.OPTION_REPORT_TYPE_REQUEST_RESPONSE.equals(form.getReportType())%>">
        <html:hidden property="<%=SystemHealthReportsForm.FIELD_REQUEST_TYPE_TOTAL%>"/>
        <html:hidden property="<%=SystemHealthReportsForm.FIELD_REQUEST_TYPE_BACKOFFICE%>"/>
        <html:hidden property="<%=SystemHealthReportsForm.FIELD_REQUEST_TYPE_CATALOG%>"/>
        <html:hidden property="<%=SystemHealthReportsForm.FIELD_REQUEST_TYPE_QUEST%>"/>
        <html:hidden property="<%=SystemHealthReportsForm.FIELD_REQUEST_TYPE_CIRCULATION%>"/>
        <html:hidden property="<%=SystemHealthReportsForm.FIELD_REQUEST_TYPE_COGNITE%>"/>
        <html:hidden property="<%=SystemHealthReportsForm.FIELD_REQUEST_TYPE_STATIC%>"/>
        <html:hidden property="<%=SystemHealthReportsForm.FIELD_SHOW_STANDARD_DEVIATION%>"/>
        <html:hidden property="<%=SystemHealthReportsForm.FIELD_RESPONSE_TIME%>"/>
    </c:if>
    <c:if test="<%=!(SystemHealthReportsForm.OPTION_REPORT_TYPE_REQUEST_RESPONSE.equals(form.getReportType()) 
        || SystemHealthReportsForm.OPTION_REPORT_TYPE_BANDWIDTH.equals(form.getReportType()))%>">
        <html:hidden property="<%=SystemHealthReportsForm.FIELD_REPORT_DATE%>"/>
        <html:hidden property="<%=SystemHealthReportsForm.FIELD_START_TIME%>"/>
        <html:hidden property="<%=SystemHealthReportsForm.FIELD_START_AMPM%>"/>
        <html:hidden property="<%=SystemHealthReportsForm.FIELD_END_TIME%>"/>
        <html:hidden property="<%=SystemHealthReportsForm.FIELD_END_AMPM%>"/>
    </c:if>

<img src="/images/icons/general/spacer.gif" border="0" width="3" height="3"/>

<base:messageBox strutsErrors="true"/>

<base:outlinedTable align='center' borderColor='#C0C0C0' cellpadding="3" id="<%=SystemHealthReportsForm.TABLE_MAIN%>" >
    <tr height="50">
        <td class="TableHeading">
            System Health Reports
        </td>
    </tr>
    <tr>
        <td background="/images/icons/general/thickline.gif" nowrap>&nbsp;&nbsp;
            <span class="SectionHeader">&nbsp;Criteria&nbsp;</span>
        </td>
    </tr>
    <tr>        
        <td align="center">
            <table  cellpadding="3" id="<%=SystemHealthReportsForm.TABLE_CRITERIA%>">
                <tr>
                    <td class="ColRowBold tdAlignRight">
                        Report Type&nbsp;
                    </td>
                    <td>
                        <html:select property="<%=SystemHealthReportsForm.FIELD_REPORT_TYPE%>" onchange="javascript:submit()">
                            <html:option value="<%=SystemHealthReportsForm.OPTION_REPORT_TYPE_BROWSER%>">Browser Report</html:option>                        
                            <html:option value="<%=SystemHealthReportsForm.OPTION_REPORT_TYPE_BANDWIDTH%>">Bandwidth Report</html:option>                        
                            <html:option value="<%=SystemHealthReportsForm.OPTION_REPORT_TYPE_REQUEST_RESPONSE%>">Request/Response Report</html:option>                        
                            <html:option value="<%=SystemHealthReportsForm.OPTION_REPORT_TYPE_SERVER_UPTIME%>">Server Uptime Report</html:option>                        
                        </html:select>
                    </td>
                    <td class="ColRowBold">
                        &nbsp;<base:genericShowHideButton alt='<%=MessageHelper.formatMessage("systemheatlhreports_UpdateTheReport") %>' name="<%=SystemHealthReportsForm.BUTTON_UPDATE_REPORT%>" src="/buttons/large/updatereport.gif" elementIDs="<%=dateButtonIDs%>"/> 
                    </td>
                </tr>
                <c:if test="<%=SystemHealthReportsForm.OPTION_REPORT_TYPE_REQUEST_RESPONSE.equals(form.getReportType())%>">
                    <tr>
                        <td class="ColRowBold tdAlignRight">Request Type</td>
                        <td class="ColRow" colspan="2">
                            <html:checkbox property="<%=SystemHealthReportsForm.FIELD_REQUEST_TYPE_TOTAL%>">&nbsp;Total</html:checkbox>
                            <html:checkbox property="<%=SystemHealthReportsForm.FIELD_REQUEST_TYPE_BACKOFFICE%>">&nbsp;Back Office</html:checkbox>
                            <html:checkbox property="<%=SystemHealthReportsForm.FIELD_REQUEST_TYPE_CATALOG%>">&nbsp;Catalog</html:checkbox>
                            <html:checkbox property="<%=SystemHealthReportsForm.FIELD_REQUEST_TYPE_QUEST%>">&nbsp;Quest</html:checkbox>
                            <html:checkbox property="<%=SystemHealthReportsForm.FIELD_REQUEST_TYPE_CIRCULATION%>">&nbsp;Circulation</html:checkbox>
                            <html:checkbox property="<%=SystemHealthReportsForm.FIELD_REQUEST_TYPE_COGNITE%>">&nbsp;Cognite API</html:checkbox>
                            <html:checkbox property="<%=SystemHealthReportsForm.FIELD_REQUEST_TYPE_STATIC%>">&nbsp;Static Content</html:checkbox>
                        </td>
                    </tr>
                    <tr>
                        <td class="ColRowBold tdAlignRight">Show</td>
                        <td class="ColRow" colspan="2">
                            <html:radio property="<%=SystemHealthReportsForm.FIELD_RESPONSE_TIME%>" value='<%="" + SystemHealthReportsForm.RESPONSE_TIME_AVG%>'>Average Response Time</html:radio>
                            <html:radio property="<%=SystemHealthReportsForm.FIELD_RESPONSE_TIME%>" value='<%="" + SystemHealthReportsForm.RESPONSE_TIME_MEDIAN%>'>Median Response Time</html:radio>
                        </td>
                    </tr>
                    <tr align="center">
                        <td>&nbsp;</td>
                        <td class="ColRow" colspan="2">
                            <html:checkbox property="<%=SystemHealthReportsForm.FIELD_SHOW_STANDARD_DEVIATION%>"/>
                            Include Standard Deviation
                        </td>
                    </tr>
                </c:if>
                <c:if test="<%=requestResponseOrBandwidthReport%>">
                    <tr height="0">
                        <td colspan="3" height="0"></td>
                    </tr>
                    <tr>
                        <td class="ColRowBold tdAlignRight">
                            Date&nbsp;
                        </td>
                        <td class="ColRowBold" colspan="2">
                            <table id="<%=SystemHealthReportsForm.TABLE_DATE_SETTINGS%>" cellspacing="0" cellpadding="0">
                                <tr>
                                    <td>
                                        <base:dateWithPrevNextButtons onClick="hideElement()" altText="Choose a Date" altPrevText='<%=MessageHelper.formatMessage("systemheatlhreports_SelectPreviousDay") %>' altNextText='<%=MessageHelper.formatMessage("systemheatlhreports_SelectNextDay") %>' fieldName="<%=SystemHealthReportsForm.FIELD_REPORT_DATE%>" buttonName="<%=SystemHealthReportsForm.BUTTON_SELECTED_DATE%>" dateValue="<%=form.getReportDate()%>" buttonPrevName="<%=SystemHealthReportsForm.BUTTON_SELECT_PREVIOUS_DAY%>" buttonNextName="<%=SystemHealthReportsForm.BUTTON_SELECT_NEXT_DAY%>"/>
                                    </td>
                                    <td class="ColRowBold">
                                        &nbsp;From&nbsp;
                                        <html:text property="<%=SystemHealthReportsForm.FIELD_START_TIME%>" size="4" maxlength="5"/>
                                        <html:select property="<%=SystemHealthReportsForm.FIELD_START_AMPM%>">
                                            <html:option value="AM">AM</html:option>
                                            <html:option value="PM">PM</html:option>
                                        </html:select>
                                        &nbsp;To&nbsp;
                                        <html:text property="<%=SystemHealthReportsForm.FIELD_END_TIME%>" size="4" maxlength="5"/>
                                        <html:select property="<%=SystemHealthReportsForm.FIELD_END_AMPM%>">
                                            <html:option value="AM">AM</html:option>
                                            <html:option value="PM">PM</html:option>
                                        </html:select>
                                    </td>
                                </tr>
                            </table>
                        </td>  
                    </tr>
                </c:if>
                <c:if test="<%=SystemHealthReportsForm.OPTION_REPORT_TYPE_SERVER_UPTIME.equals(form.getReportType())%>">
                    <tr>
                        <td class="ColRowBold tdAlignRight">
                            Select Month&nbsp;
                        </td>
                        <td colspan="2">
                            <html:select property="<%=SystemHealthReportsForm.FIELD_UPTIME_DATE%>" onchange="javascript:submit()">
                                <html:options collection="uptimeRanges" property="stringCode"
                                              labelProperty="stringDesc"/>
                            </html:select>
                        </td>
                    </tr>
                </c:if>
                <c:if test="<%=SystemHealthReportsForm.OPTION_REPORT_TYPE_BROWSER.equals(form.getReportType())%>">
                    <tr>
                        <td class="ColRowBold tdAlignRight">
                            Date Range&nbsp;
                        </td>
                        <td colspan="2">
                            <html:select property="<%=SystemHealthReportsForm.FIELD_DATE_RANGE%>" onchange="javascript:submit()">
                                <html:option value="<%=SystemHealthReportsForm.OPTION_DATE_RANGE_ALL%>">All Dates</html:option>                        
                                <html:option value="<%=SystemHealthReportsForm.OPTION_DATE_RANGE_LAST_SEVEN_DAYS%>">Last Seven Days</html:option>                        
                                <html:option value="<%=SystemHealthReportsForm.OPTION_DATE_RANGE_CURRENT_MONTH%>">This Month</html:option>                        
                                <html:option value="<%=SystemHealthReportsForm.OPTION_DATE_RANGE_PREVIOUS_MONTH%>">Last Month</html:option>                        
                                <html:option value="<%=SystemHealthReportsForm.OPTION_DATE_RANGE_CURRENT_YEAR%>">This Year</html:option>                        
                                <html:option value="<%=SystemHealthReportsForm.OPTION_DATE_RANGE_PREVIOUS_YEAR%>">Last Year</html:option>                        
                            </html:select>
                        </td>
                    </tr>
                </c:if>
            </table>
        </td>
   </tr>
   <tr>
        <td background="/images/icons/general/thickline.gif" nowrap>&nbsp;&nbsp;
            <span class="SectionHeader">&nbsp;<%=form.getReportType() %>&nbsp;</span>
            <c:forEach var="imageMap" items="<%=form.getReportMaps()%>">
                ${imageMap}
            </c:forEach>
        </td>
  </tr>
  <c:forEach var="chart" items="<%=form.getReportCharts()%>" varStatus="index">
    <tr>
        <td align="center">
            <table cellspacing="0" id="<%=SystemHealthReportsForm.TABLE_GRAPH%>">
                <tr>
                    <td>
                        <img src="/displaychart?filename=${chart}" border="0" usemap="#${chart}"/>
                    </td>
                </tr>
                
                <c:if test="<%=SystemHealthReportsForm.OPTION_REPORT_TYPE_REQUEST_RESPONSE.equals(form.getReportType())%>">
                    <tr>
                        <td align="center">
                            <c:if test="${index.count == 1}">
                                <c:out value="<%=form.doRequestReportSummary()%>" escapeXml="false"/>
                            </c:if>
                            <c:if test="${index.count == 2}">
                                <c:out value="<%=form.doResponseReportSummary()%>" escapeXml="false"/>
                            </c:if>
                        </td>
                    </tr>
                </c:if>
                <c:if test="<%=SystemHealthReportsForm.OPTION_REPORT_TYPE_BROWSER.equals(form.getReportType())%>">
                    <tr>
                        <td align="center">
                                <c:out value="<%=form.doBrowserReportSummary()%>" escapeXml="false"/>
                        </td>
                    </tr>
                </c:if>
            </table>
            <br>
        </td>
    </tr>
  </c:forEach>
</base:outlinedTable>    
</base:form>
