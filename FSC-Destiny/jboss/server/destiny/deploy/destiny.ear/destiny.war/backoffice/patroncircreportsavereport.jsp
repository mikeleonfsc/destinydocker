<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.PatronCircReportForm" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.jsptag.ScheduleReportTag" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>



<bean:define id="form" name="<%=PatronCircReportForm.FORM_NAME%>" type="com.follett.fsc.destiny.client.backoffice.servlet.PatronCircReportForm"/>
<base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handlepatroncircreportform.do" focus="<%= form.getFocusName() %>">
<html:hidden property="currentPage" value="<%= String.valueOf(PatronCircReportForm.PAGE_SAVE_REPORT) %>"/>
<html:hidden property="<%= ScheduleReportTag.CHANGE_IN_SCHEDULED_TAG %>"/>
<html:hidden property="<%= form.FIELD_EDIT_SCHEDULE_ONLY %>"/>
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">

<base:outlinedTable id="PatronCircReportTable" borderColor='#C0C0C0'>
<logic:equal name="<%=PatronCircReportForm.FORM_NAME%>" property="<%= form.FIELD_EDIT_SCHEDULE_ONLY %>"  value="false">

    <tr>    
        <td colspan="2" align="center">
            <table id="wizardHeader">
                <tr>
                    <td class="Instruction" align="center" colspan="3">
                    <bean:write name="<%=PatronCircReportForm.FORM_NAME%>" property="subtitle"/>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight"><nobr><%=MessageHelper.formatMessage("patroncircreportsavereport_SaveAs") %></nobr></td>
        <td>
            <html:text property="reportName" size="50" maxlength="128"/>
        </td>
    </tr>
    <tr>
        <td class="Instruction">&nbsp;</td>
        <td class="Instruction"><%=MessageHelper.formatMessage("patroncircreportsavereport_EnterAUniqueAndDescriptiveNameForYourReportOrNotic") %><br><%=MessageHelper.formatMessage("patroncircreportsavereport_EGLstNotice") %></td>
    </tr>
</logic:equal>    
<logic:equal name="<%=PatronCircReportForm.FORM_NAME%>" property="<%= form.FIELD_EDIT_SCHEDULE_ONLY %>"  value="true">
    <tr>
        <td class="ColRowBold tdAlignRight"><nobr><%=MessageHelper.formatMessage("patroncircreportsavereport_ReportName") %></nobr></td>
        <td class="ColRow">
            <bean:write name="<%=PatronCircReportForm.FORM_NAME%>" property="reportName"/>
        </td>
    </tr>
</logic:equal>    
    
    <base:scheduleReport formName="<%= PatronCircReportForm.FORM_NAME %>"
        scheduleInterval="<%= form.getScheduleInterval() %>"
        scheduleDayOfTheWeek="<%= form.getScheduleDayOfWeek() %>"
        scheduleTimeOfDay="<%=form.getScheduleTimeOfDay() %>"
		scheduleShowSkipClosed="true"
        scheduleSkipClosed="<%=form.isSkipClosedCheckboxState() %>"
        scheduleDaysClosedNote="<%=form.getDaysClosedNote() %>"
        />
    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <tr>
        <td colspan="2" class="ColRowBold" align="center">
            <base:showHideTag id="onAction">
<logic:equal name="<%=PatronCircReportForm.FORM_NAME%>" property="<%= form.FIELD_EDIT_SCHEDULE_ONLY %>"  value="false">
            <base:genericButton src="/buttons/large/savesetup.gif" alt='<%=MessageHelper.formatMessage("saveSetup") %>' name="saveNewSetup" />
            &nbsp;
            <base:genericButton src="/buttons/large/saveandrun.gif" onclick="hideElementonAction()" alt='<%=MessageHelper.formatMessage("saveAndRun") %>' name="saveAndRun" />
</logic:equal>    
<logic:equal name="<%=PatronCircReportForm.FORM_NAME%>" property="<%= form.FIELD_EDIT_SCHEDULE_ONLY %>"  value="true">
            <base:saveButton name="saveNewSetup" />
            &nbsp;
            <base:cancelButton/>
</logic:equal>    
            </base:showHideTag>
        </td>
    </tr>
</base:outlinedTable>
</base:form>
