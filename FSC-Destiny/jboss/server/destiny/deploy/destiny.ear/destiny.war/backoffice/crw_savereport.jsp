<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.common.consortium.UserContext" %>

<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib prefix="c" uri="/WEB-INF/jstl-core.tld" %>
<%@ taglib prefix="fn" uri="/WEB-INF/jstl-function.tld" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>


<bean:define id="form" name="<%=CRWSaveReportForm.FORM_NAME%>" type="CRWSaveReportForm"/>

<base:messageBox strutsErrors="true"/>


<base:form action="/backoffice/servlet/handlecrwsavereportform.do" enctype="multipart/form-data" focus="<%=CRWSaveReportForm.FIELD_REPORT_NAME %>">
<html:hidden name="<%=CRWSaveReportForm.FORM_NAME%>" property="<%=CRWSaveReportForm.PARAM_JOB_SPEC_ID%>"/>
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=CRWSaveReportForm.BUTTON_TRAP_ENTER_KEY %>">


<jsp:include page="/backoffice/crw_cancelreport.jsp" flush="true"> 
    <jsp:param name="formName" value="<%=CRWSaveReportForm.FORM_NAME%>"/>
</jsp:include>

<base:outlinedTable borderColor='#C0C0C0' cellpadding="0" id="<%=CRWSaveReportForm.TABLE_MAIN_TABLE%>" >

    <tr>
        <td class="TableHeading">
            ${form.header}
        </td>
        <td class="TableHeading tdAlignRight" rowspan="3" valign="top">
            <table border="0" cellspacing="0" cellpadding="5">
                <tr>
                    <td class="tdAlignRight">
                        <base:genericButton src="/icons/general/previouslonger.gif" alt='<%=MessageHelper.formatMessage("crw_savereport_Previous")%>' name="<%=CRWNewReportForm.BUTTON_PREV%>"/>&nbsp;
                        <base:imageSpacer width="44" height="26" ></base:imageSpacer>
                    </td>
                </tr>
            	<logic:equal name="<%=CRWSaveReportForm.FORM_NAME%>" property="<%=CRWSaveReportForm.PARAM_CAN_RUN%>" value="true">
                <tr>
                    <td class="tdAlignRight">
                        <base:genericButton src="/buttons/large/saveandrun.gif" alt='<%=MessageHelper.formatMessage("saveAndRun")%>' name="<%=CRWSaveReportForm.BUTTON_SAVE_AND_RUN%>"/>
                    </td>
                </tr>
                </logic:equal>
                <tr>
                    <td class="tdAlignRight">
                       <base:saveButton/>
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
                ${form.currentStep}
            </span>
            <span class="ColRow"><%= MessageHelper.formatMessage("crw_savereport_EnterAUniqueNameAndADescriptionOptionalForYourRepo") %></span>
        </td>    
    </tr>
    <tr>
        <td valign="top">
            <table border="0" cellspacing="1" cellpadding="3">
                <tr>
                    <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("crw_savereport_Name") %></td>
                    <td><html:text property="<%=CRWSaveReportForm.FIELD_REPORT_NAME %>" size="30" maxlength="30"/><td>
                </tr>
                <c:if test="${form.districtUser && !form.stateContext}">
                    <tr>
                        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("crw_savereport_AvailableFor") %></td>
                        <td>${form.recipientList}</td>
                    </tr>
                </c:if>
                <tr>
                    <td class="ColRowBold tdAlignRight" valign="top"><%= MessageHelper.formatMessage("crw_savereport_Description") %></td>
                    <td valign="top">
                    <html:textarea property="<%=CRWSaveReportForm.FIELD_REPORT_DESCRIPTION %>" rows="10" cols="48"/>
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight" valign="top">
                    &nbsp;</td>
                    <td valign="top" class="Instruction"><%= MessageHelper.formatMessage("crw_savereport_RequiredField") %></td>
                </tr>
            </table>
        </td>
    </tr>
</base:outlinedTable>
</base:form>
