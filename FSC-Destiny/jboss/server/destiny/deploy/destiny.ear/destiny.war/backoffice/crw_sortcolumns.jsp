<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>

<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib prefix="c" uri="/WEB-INF/jstl-core.tld" %>
<%@ taglib prefix="fn" uri="/WEB-INF/jstl-function.tld" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>

<%
    CRWSortColumnsForm form = (CRWSortColumnsForm)request.getAttribute(CRWSortColumnsForm.FORM_NAME);
%>

<c:set var="selectedColumns" value="<%=form.getListOfSelectedColumns() %>"/>


<base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handlecrwsortcolumnsform.do" enctype="multipart/form-data">
<html:hidden name="<%=CRWSortColumnsForm.FORM_NAME%>" property="<%=CRWSortColumnsForm.PARAM_CURRENT_PAGE%>"/>
<html:hidden name="<%=CRWSortColumnsForm.FORM_NAME%>" property="<%=CRWSortColumnsForm.PARAM_FINAL_PAGE%>"/>
<html:hidden name="<%=CRWSortColumnsForm.FORM_NAME%>" property="<%=CRWSortColumnsForm.PARAM_JOB_SPEC_ID%>"/>
<html:hidden name="<%=CRWSortColumnsForm.FORM_NAME%>" property="<%=CRWSortColumnsForm.PARAM_DUPLICATE_REPORT%>"/>
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=CRWSortColumnsForm.BUTTON_TRAP_ENTER_KEY %>">

<jsp:include page="/backoffice/crw_cancelreport.jsp" flush="true"> 
    <jsp:param name="formName" value="<%=CRWSortColumnsForm.FORM_NAME%>"/>
</jsp:include>

<base:outlinedTable borderColor='#C0C0C0' cellpadding="0" id="<%=CRWSortColumnsForm.TABLE_MAIN_TABLE%>">

    <tr>
        <td>
            <table width="100%" cellspacing="0" id="<%=CRWSortColumnsForm.TABLE_TITLE_TABLE%>">
                <tr>
                    <td class="TableHeading">
                        <%=form.getHeader() %>
                    </td>
                    <td class="TableHeading tdAlignRight" rowspan="2" valign="top">
                        <table cellspacing="0" cellpadding="5">
                            <tr>
                                <td class="tdAlignRight" nowrap>
                                    <base:genericButton src="/icons/general/previouslonger.gif" alt='<%=MessageHelper.formatMessage("crw_sortcolumns_Previous")%>' name="<%=CRWSortColumnsForm.BUTTON_PREV%>"/>
                                    <base:genericButton src="/icons/general/nextlonger.gif" alt='<%=MessageHelper.formatMessage("crw_sortcolumns_Next")%>' name="<%=CRWSortColumnsForm.BUTTON_NEXT%>"/>
                                </td>
                            </tr>
                            <tr>
                                <td class="tdAlignRight">
                                    <base:cancelButton name="<%= CRWBaseForm.BUTTON_NAME_CANCEL %>" />
                                </td>
                            </tr>
                        </table>
                    </td>                    
                </tr>
                <tr>
                    <td>
                        <span class="ColRowBold">
                            <%=form.getCurrentStep() %>
                        </span>
                        <span class="ColRow"><%= MessageHelper.formatMessage("crw_sortcolumns_SpecifyTheOrderInWhichYouWantTheDetailsOfYourRepor") %></span>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" background="/images/icons/general/thickline.gif" valign="top">
                        &nbsp;&nbsp;<span class="SectionHeader"><%= MessageHelper.formatMessage("crw_sortcolumns_ReportDetails") %></span>
                    </td>
                </tr>
                <tr>
                    <c:choose>
                        <c:when test="${fn:length(selectedColumns) == 0}">
                            <td colspan="2" align="center" class="ColRowBold">
                                <br><%= MessageHelper.formatMessage("crw_sortcolumns_AllOfTheFieldsThatWereSelectedForThisReportHaveBee") %></td>
                        </c:when>
                        <c:otherwise>                
                            <td colspan="2">
                                <table border="0" cellspacing="0" cellpadding="4">
                                    <tr>
                                        <td>
                                            <img src="/images/icons/general/spacer.gif" border="0" width="35" height="1"/>
                                        </td>
                                        <td valign="top">
                                            <table border="0" cellspacing="0" cellpadding="4" id="<%=CRWSortColumnsForm.TABLE_SORT_OPTIONS_TABLE%>">
                                                <tr>
                                                    <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("crw_sortcolumns_SortBy") %></td>
                                                    <td class="ColRowBold">
                                                        <c:choose>
                                                            <c:when test="${fn:length(selectedColumns) == 1}">
                                                                ${selectedColumns[0].stringDesc}
                                                                <input type="hidden" name="<%= CRWSortColumnsForm.FIELD_SORTED_COLUMNS_1%>" value="${selectedColumns[0].stringCode}">
                                                            </c:when>
                                                            <c:otherwise>
                                                                <html:select property="<%=CRWSortColumnsForm.FIELD_SORTED_COLUMNS_1%>">
                                                                    <c:forEach var="option" items="${selectedColumns}">
                                                                        <html:option value="${option.stringCode}">${option.stringDesc}</html:option>
                                                                    </c:forEach>
                                                                </html:select>
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </td>
                                                    <td>
                                                        <html:select property="<%=CRWSortColumnsForm.FIELD_SORT_DIRECTION_1%>">
                                                            <html:option value="<%=CRWSortColumnsForm.ID_OPTION_ASCENDING%>"><%=MessageHelper.formatMessage("crw_sortcolumns_Ascending")%></html:option>
                                                            <html:option value="<%=CRWSortColumnsForm.ID_OPTION_DESCENDING%>"><%=MessageHelper.formatMessage("crw_sortcolumns_Descending")%></html:option>
                                                        </html:select>
                                                    </td>
                                                </tr>
                                                <c:if test="${fn:length(selectedColumns) > 1}">
                                                    <tr>
                                                        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("crw_sortcolumns_ThenBy") %></td>
                                                        <td>
                                                            <html:select property="<%=CRWSortColumnsForm.FIELD_SORTED_COLUMNS_2%>">
                                                                <html:option value="<%=CRWSortColumnsForm.OPTION_NONE%>"><%= MessageHelper.formatMessage("crw_sortcolumns_None") %></html:option>
                                                                <c:forEach var="option" items="${selectedColumns}">
                                                                    <html:option value="${option.stringCode}">${option.stringDesc}</html:option>
                                                                </c:forEach>
                                                            </html:select>
                                                        </td>
                                                        <td>
                                                            <html:select property="<%=CRWSortColumnsForm.FIELD_SORT_DIRECTION_2%>">
                                                                <html:option value="<%=CRWSortColumnsForm.ID_OPTION_ASCENDING%>"><%=MessageHelper.formatMessage("crw_sortcolumns_Ascending")%></html:option>
                                                                <html:option value="<%=CRWSortColumnsForm.ID_OPTION_DESCENDING%>"><%=MessageHelper.formatMessage("crw_sortcolumns_Descending")%></html:option>
                                                            </html:select>
                                                        </td>
                                                    </tr>
                                                </c:if>
                                                <c:if test="${fn:length(selectedColumns) > 2}">
                                                    <tr>
                                                        <td class="ColRowBold tdAlignRight">...<%= MessageHelper.formatMessage("crw_sortcolumns_AndFinallyBy") %></td>
                                                        <td>
                                                            <html:select property="<%=CRWSortColumnsForm.FIELD_SORTED_COLUMNS_3%>">
                                                                <html:option value="<%=CRWSortColumnsForm.OPTION_NONE%>"><%= MessageHelper.formatMessage("crw_sortcolumns_None") %></html:option>
                                                                <c:forEach var="option" items="${selectedColumns}">
                                                                    <html:option value="${option.stringCode}">${option.stringDesc}</html:option>
                                                                </c:forEach>
                                                            </html:select>
                                                        </td>
                                                        <td>
                                                            <html:select property="<%=CRWSortColumnsForm.FIELD_SORT_DIRECTION_3%>">
                                                                <html:option value="<%=CRWSortColumnsForm.ID_OPTION_ASCENDING%>"><%=MessageHelper.formatMessage("crw_sortcolumns_Ascending")%></html:option>
                                                                <html:option value="<%=CRWSortColumnsForm.ID_OPTION_DESCENDING%>"><%=MessageHelper.formatMessage("crw_sortcolumns_Descending")%></html:option>
                                                            </html:select>
                                                        </td>
                                                    </tr>
                                                </c:if>
                                            </table>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </c:otherwise>
                    </c:choose>
                </tr>
            </table>
        </td>
	</tr>
</base:outlinedTable>
</base:form>
