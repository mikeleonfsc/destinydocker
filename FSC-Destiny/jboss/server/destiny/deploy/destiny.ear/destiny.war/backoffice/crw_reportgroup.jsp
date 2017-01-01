<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>

<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>


<%
    CRWReportGroupForm form = (CRWReportGroupForm)request.getAttribute(CRWReportGroupForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handlecrwreportgroupform.do" enctype="multipart/form-data">
<html:hidden name="<%=CRWReportGroupForm.FORM_NAME%>" property="<%=CRWReportGroupForm.PARAM_CURRENT_PAGE%>"/>
<html:hidden name="<%=CRWReportGroupForm.FORM_NAME%>" property="<%=CRWReportGroupForm.PARAM_FINAL_PAGE%>"/>
<html:hidden name="<%=CRWReportGroupForm.FORM_NAME%>" property="<%=CRWReportGroupForm.PARAM_JOB_SPEC_ID%>"/>
<html:hidden name="<%=CRWReportGroupForm.FORM_NAME%>" property="<%=CRWReportGroupForm.PARAM_DUPLICATE_REPORT%>"/>
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=CRWReportGroupForm.BUTTON_TRAP_ENTER_KEY %>">

<jsp:include page="/backoffice/crw_cancelreport.jsp" flush="true"> 
    <jsp:param name="formName" value="<%=CRWReportGroupForm.FORM_NAME%>"/>
</jsp:include>

<base:outlinedTable borderColor='#C0C0C0' cellpadding="0" id="<%=CRWReportGroupForm.TABLE_MAIN_TABLE%>" >
    <tr>
        <td>
            <table width="100%" cellspacing="0" id="<%=CRWReportGroupForm.TABLE_TITLE_TABLE%>">
                <tr>
                    <td class="TableHeading">
                        <%=form.getHeader() %>
                    </td>
                    <td class="TableHeading tdAlignRight" rowspan="2" valign="top">
                        <table cellspacing="0" cellpadding="5">
                            <tr>
                                <td class="tdAlignRight" nowrap>
                                    <base:genericButton src="/icons/general/previouslonger.gif" alt='<%=MessageHelper.formatMessage("crw_reportgroup_Previous")%>' name="<%=CRWReportGroupForm.BUTTON_PREV%>"/>
                                    <base:genericButton src="/icons/general/nextlonger.gif" alt='<%=MessageHelper.formatMessage("crw_reportgroup_Next")%>' name="<%=CRWReportGroupForm.BUTTON_NEXT%>"/>
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
                        <span class="ColRow"><%= MessageHelper.formatMessage("crw_reportgroup_IndicateHowYouWantTheInformationInYourReportToBeGr") %></span>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" background="/images/icons/general/thickline.gif" valign="top">
                        &nbsp;&nbsp;<span class="SectionHeader"><%= MessageHelper.formatMessage("crw_reportgroup_ReportGroupingLevels") %></span>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <table border="0" cellspacing="0" cellpadding="4">
                            <tr>
                                <td>
                                    <base:imageSpacer width="35" height="1"/>
                                </td>
                                <td valign="top">
                                    <table border="0" cellspacing="0" cellpadding="4" id="<%=CRWReportGroupForm.TABLE_GROUP_OPTIONS_TABLE%>">
                                        <tr>
                                            <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("crw_reportgroup_GroupBy") %></td>
                                            <td class="ColRowBold">
                                                <html:select property="<%=CRWReportGroupForm.FIELD_GROUP_COLUMNS_1%>">
                                                    <%=form.getOptionsForSelectedColumns1() %>
                                                </html:select>
                                            </td>
                                            <td>
                                                <html:select property="<%=CRWReportGroupForm.FIELD_GROUP_DIRECTION_1%>">
                                                    <html:option value="<%=CRWReportGroupForm.ID_OPTION_ASCENDING%>"><%=MessageHelper.formatMessage("crw_reportgroup_Ascending")%></html:option>
                                                    <html:option value="<%=CRWReportGroupForm.ID_OPTION_DESCENDING%>"><%=MessageHelper.formatMessage("crw_reportgroup_Descending")%></html:option>
                                                </html:select>
                                            </td>
                                        </tr>
                                        <% if (form.getNumberOfSelectedColumns() > 1){ %>
                                            <tr>
                                                <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("crw_reportgroup_ThenBy") %></td>
                                                <td>
                                                    <html:select property="<%=CRWReportGroupForm.FIELD_GROUP_COLUMNS_2%>">
                                                        <%=form.getOptionsForSelectedColumns2() %>
                                                    </html:select>
                                                </td>
                                                <td>
                                                    <html:select property="<%=CRWReportGroupForm.FIELD_GROUP_DIRECTION_2%>">
                                                        <html:option value="<%=CRWReportGroupForm.ID_OPTION_ASCENDING%>"><%=MessageHelper.formatMessage("crw_reportgroup_Ascending")%></html:option>
                                                        <html:option value="<%=CRWReportGroupForm.ID_OPTION_DESCENDING%>"><%=MessageHelper.formatMessage("crw_reportgroup_Descending")%></html:option>
                                                    </html:select>
                                                </td>
                                            </tr>
                                        <% } %>
                                        <% if (form.getNumberOfSelectedColumns() > 2){ %>
                                            <tr>
                                                <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("crw_reportgroup_AndFinallyBy") %></td>
                                                <td>
                                                    <html:select property="<%=CRWReportGroupForm.FIELD_GROUP_COLUMNS_3%>">
                                                        <%=form.getOptionsForSelectedColumns3() %>
                                                    </html:select>
                                                </td>
                                                <td>
                                                    <html:select property="<%=CRWReportGroupForm.FIELD_GROUP_DIRECTION_3%>">
                                                        <html:option value="<%=CRWReportGroupForm.ID_OPTION_ASCENDING%>"><%=MessageHelper.formatMessage("crw_reportgroup_Ascending")%></html:option>
                                                        <html:option value="<%=CRWReportGroupForm.ID_OPTION_DESCENDING%>"><%=MessageHelper.formatMessage("crw_reportgroup_Descending")%></html:option>
                                                    </html:select>
                                                </td>
                                            </tr>
                                        <% } %>
                                    </table>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </table>
        </td>
	</tr>
</base:outlinedTable>
</base:form>
