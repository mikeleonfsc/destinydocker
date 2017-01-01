<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.util.lookup.LongStringLookupList" %>
<%@ page import="com.follett.fsc.destiny.util.lookup.LongStringLookup" %>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>

<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>


<script language="javascript">
<!--
function submitDropDown() {
        document.<%=CRWNewReportForm.FORM_NAME%>.<%=CRWNewReportForm.BUTTON_SUBMIT_CUSTOM_REPORT_TYPE%>.value = "true";
        document.<%=CRWNewReportForm.FORM_NAME%>.submit();
}
// -->
</script>

<bean:define id="form" name="<%=CRWNewReportForm.FORM_NAME%>" type="CRWNewReportForm"/>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    CRWNewReportForm crwForm = (CRWNewReportForm)request.getAttribute("backoffice_servlet_CRWNewReportForm");
%>
<base:form action="/backoffice/servlet/handlecrwnewreportform.do" enctype="multipart/form-data" focus="<%=CRWNewReportForm.FIELD_REPORT_TYPE %>">
<bean:define id="reportTypeList" name="<%=CRWNewReportForm.FORM_NAME%>" property="<%=CRWNewReportForm.FIELD_REPORT_TYPE_OPTIONS%>" type="com.follett.fsc.destiny.util.lookup.LongStringLookupList"/>
<bean:define id="reportBaseTypeList" name="<%=CRWNewReportForm.FORM_NAME%>" property="<%=CRWNewReportForm.FIELD_REPORT_BASE_TYPE_OPTIONS%>" type="com.follett.fsc.destiny.util.lookup.LongStringLookupList"/>
<input type="hidden" name="<%=CRWNewReportForm.BUTTON_SUBMIT_CUSTOM_REPORT_TYPE%>" value="false"/>


<jsp:include page="/backoffice/crw_cancelreport.jsp" flush="true"> 
    <jsp:param name="formName" value="<%=CRWNewReportForm.FORM_NAME%>"/>
</jsp:include>


<base:outlinedTable borderColor='#C0C0C0' cellpadding="0" id="<%=CRWNewReportForm.TABLE_MAIN_TABLE%>">
    <tr>
        <td width="100%">
            <table>
                <tr>
                    <td class="TableHeading" colspan="2"><%= MessageHelper.formatMessage("crw_initreport_ReportBuilder") %></td>
                </tr>
                <tr>
                    <td class="ColRow" colspan="3"><%= MessageHelper.formatMessage("crw_initreport_SelectTheTypeOfInformationOnWhichYouWishToReport") %></td>
                </tr>
                <tr>
                    <td>
                        <table id="<%=CRWNewReportForm.TABLE_MAIN_TABLE_LIBRARY_OPTIONS%>">
                            <tr>
                                <td valign="top" class="ColRowBold">
                                    <%
                                    LongStringLookupList options = crwForm.getReportBaseTypeOptions();
                                    if(options.size() > 1) {
                                    %>
                                        <html:select property="<%=CRWNewReportForm.FIELD_REPORT_BASE_TYPE%>" onchange="submitDropDown()">
                                            <html:options collection="reportBaseTypeList" property="longID" labelProperty="stringDesc"/>
                                        </html:select>
                                    <% 
                                    } else if(options.size() == 1){
                                        out.print(((LongStringLookup)options.get(0)).getStringDesc());
                                      %>
                                      <html:hidden  name="<%CRWNewReportForm.FORM_NAME%>" property="<%=CRWNewReportForm.FIELD_REPORT_BASE_TYPE%>" value="<%= ((LongStringLookup)options.get(0)).getLongID().toString()%>"/>
                                   <%
                                   } 
                                   %>
                                </td>
                                <td valign="top" class="ColRow">
                                    <html:select size="<%= String.valueOf(reportTypeList.size()) %>" property="<%=CRWNewReportForm.FIELD_REPORT_TYPE%>">
                                        <html:options collection="reportTypeList" property="longID" labelProperty="stringDesc"/>
                                    </html:select>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </table>
        </td>
        <td>
            <table>
                <tr>
                    <td class="tdAlignRight">
                        <base:genericButton src="/icons/general/nextlonger.gif" alt='<%=MessageHelper.formatMessage("crw_initreport_Next")%>' name="<%=CRWNewReportForm.BUTTON_NEXT%>"/>
                    </td>
                </tr>
                <tr>
                    <td class="tdAlignRight">
                        <base:cancelButton name="<%=CRWBaseForm.BUTTON_NAME_CANCEL %>" />
                    </td>
                </tr>
            </table>
        </td>
	</tr>
</base:outlinedTable>
</base:form>

