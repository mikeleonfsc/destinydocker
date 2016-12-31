<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.destiny.util.ObjectHelper"%>
<%@ page import="com.follett.fsc.destiny.session.common.data.HomeroomAEDValue"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.HomeroomSpecs"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.jsptag.ScheduleReportTag" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>


<%
    SaveReportSetupForm form = (SaveReportSetupForm)request.getAttribute(SaveReportSetupForm.FORM_NAME);
%>

<c:set var="cform" value="<%=request.getAttribute(SaveReportSetupForm.FORM_NAME)%>"/>

<base:messageBox strutsErrors="true"/>

<script language="JavaScript">
<!--
    function trapEnter(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        document.<%=SaveReportSetupForm.FORM_NAME%>.<%=SaveReportSetupForm.FIELD_TRAP_ENTER_PRESSED%>.value=true;
      }
      return true;
    }
//-->
</script>

<base:form action="/backoffice/servlet/handlesavereportsetupform.do" focus="<%= SaveReportSetupForm.FIELD_REPORT_NAME %>">
    <html:hidden property="<%= ScheduleReportTag.CHANGE_IN_SCHEDULED_TAG %>"/>
    <html:hidden property="<%= SaveReportSetupForm.FIELD_TRAP_ENTER_PRESSED %>" value="false"/>
    <html:hidden property="<%= SaveReportSetupForm.FIELD_JOB_SPEC_TYPE %>"/>
    <html:hidden property="<%= SaveReportSetupForm.FIELD_JOB_SPEC_ID%>"/>
    <html:hidden property="<%= SaveReportSetupForm.FIELD_ACTION %>"/>
    <base:outlinedTable id="<%=SaveReportSetupForm.TABLE_MAIN%>" borderColor="#C0C0C0" width="95%">
        <tr>
            <td class="TableHeading" colspan="2">
                <%=MessageHelper.formatMessage("savereportsetup_SaveReportSetup",form.getReportTypeName()) %>
            </td>
        </tr>
        <tr>
            <td class="ColRow" colspan="2">
                <base:imageLine/>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("savereportsetup_Name") %></td>
            <td>
                <span onKeyPress="return trapEnter(event);">
                    <html:text property="<%= SaveReportSetupForm.FIELD_REPORT_NAME %>" size="40" maxlength="40"/>
                </span>
            </td>
        </tr>
        <tr>
            <td class="Instruction">&nbsp;</td>
            <td class="Instruction">
                <%=MessageHelper.formatMessage("savereportsetup_EnterAUniqueAndDescriptiveName",form.getReportTypeName()) %>
            </td>
        </tr>
        <c:if test="${cform.districtUser && !cform.stateContext && cform.reportPushable}">
            <tr>
                <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("savereportsetup_AvailableFor") %></td>
                <td>${cform.recipientList}</td>
            </tr>
        </c:if>
        <c:if test="${cform.scheduleable}">
            <base:scheduleReport formName="<%= SaveReportSetupForm.FORM_NAME %>"
                scheduleInterval="<%= form.getScheduleInterval() %>"
                scheduleDayOfTheWeek="<%= form.getScheduleDayOfWeek() %>"
                scheduleTimeOfDay="<%=form.getScheduleTimeOfDay() %>"
                />        
        </c:if>
        <tr>
            <td class="ColRow" colspan="2">
                <base:imageLine/>
            </td>
        </tr>
        <tr>
            <td class="TableHeading" colspan="2" align="center" nowrap>
                <table border="0" cellpadding="0" cellspacing="10">
                    <tr valign="top">
                        <td><base:saveButton/></td>
                        <td><base:genericShowHideButton alt='<%=MessageHelper.formatMessage("saveAndRun") %>' name="<%=SaveReportSetupForm.BUTTON_SAVE_AND_RUN%>" src="/buttons/large/saveandrun.gif"/></td>
                        <td><base:cancelButton/>
                    </tr>
                </table>
            </td>
        </tr>
    </base:outlinedTable>
</base:form>
