<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@page import="com.follett.fsc.destiny.client.common.PageCalculator"%>
<%@page import="com.follett.fsc.destiny.client.common.servlet.BaseListForm"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.PatronSpecs"%>
<%@page import="com.follett.fsc.destiny.client.circulation.servlet.BasePatronListForm"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.data.PatronUpdateJobSpecRecord"%>
<%@page import="com.follett.fsc.destiny.client.common.data.Tab"%>
<%@page import="com.follett.fsc.destiny.client.common.SitePatronHelper"%>
<%@page import="com.follett.fsc.destiny.client.backoffice.data.UpdatePatronHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.BarcodeListTag"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%><base:messageBox strutsErrors="true"/>

<%
    PatronScheduleListForm form = (PatronScheduleListForm) request.getAttribute(PatronScheduleListForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);

    Tab[] tabs = BasePatronListForm.getTabs(store);
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>

<base:form action="/backoffice/servlet/handlepatronschedulelistform.do" enctype="multipart/form-data">
<html:hidden property="<%=PatronScheduleListForm.PARAM_CONFIRM_DELETE_ID %>"/>

    <%
        if (form.getConfirmDeleteID() != null) {
    %>
    <base:messageBox showWarningIcon="true" message='<%=MessageHelper.formatMessage("patronschedulelist_TheFollowingJobWillBeDeleted0", form.getJobNameToDelete())%>' filterMessage="true">
        <tr>
            <td>&nbsp;</td>
            <td class="ColRowBold"><%=MessageHelper.formatMessage("patronschedulelist_AreYouSureYouWantToContinue")%></td>
        </tr>
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:yesNo />
            </td>
        </tr>
    </base:messageBox>
    <%
        }
    %>
    <base:outlinedTableAndTabsWithinThere id="<%=PatronScheduleListForm.MAIN_TABLE %>" tabs="<%= tabs %>" selectedTabID="<%= IUpdatePatronForm.ID_TAB_SCHEDULE %>" selectedTab='<%=MessageHelper.formatMessage("patronschedulelist_Schedule")%>' hideTabsWhenPrinterFriendly="true" borderColor="#C0C0C0" width="100%">
        <tr>
            <td class="TableHeading"><%=MessageHelper.formatMessage("patronschedulelist_ScheduledPatronUpdates")%></td>
            <td class="tdAlignRight" height="18">
                <base:link page="/backoffice/servlet/presentschedulepatronupdateform.do" showTextAlways='false' id="<%=PatronScheduleListForm.ID_LINK_NEW_SCHEDULED_UPDATE%>">
                    <base:image align="absbottom" src="/buttons/large/scheduleit.gif" alt='<%=MessageHelper.formatMessage("patronschedulelist_ScheduleIt")%>' />
                </base:link>
            </td>
        </tr>
        <tr> 
        <%
            if (form.getJobSpecList() != null && form.getJobSpecList().size() > 0) {
        %>
            <td colspan="2">
                <table width="100%" cellspacing="0" cellpadding="3" id="<%=PatronScheduleListForm.TABLE_SUBMAIN%>">
                    <tr valign="top">
                        <td class="SmallColHeading" nowrap="true"><%=MessageHelper.formatMessage("patronschedulelist_Name")%></td>
                        <td class="SmallColHeading" nowrap="true"><%=MessageHelper.formatMessage("patronschedulelist_LastRun")%></td>
                        <td class="SmallColHeading" nowrap="true"><%=MessageHelper.formatMessage("patronschedulelist_NextRun")%></td>
                        <td class="SmallColHeading"></td>
                    </tr>
                    <logic:iterate indexId="flipper" id="row" name="<%=PatronScheduleListForm.FORM_NAME %>" property="jobSpecList" type="PatronUpdateJobSpecRecord">
                        <tr valign="top" <%=(((1 & flipper.intValue()) == 0) ? "bgColor=\"#E8E8E8\"" : "")%>>
                            <td><span class="ColRow"><%=ResponseUtils.filter(row.getReportName())%></span><br>&nbsp;&nbsp;&nbsp;<span class="Instruction"><%=MessageHelper.formatMessage("patronschedulelist_CreatedBy0", row.getCreatorUserName())%></span></td>
                            <td class="ColRow" nowrap="true"><%=form.buildJobViewLink(lh.formatDateAndTime(row.getLastRunTime()), row.getJobID())%></td>
                        <%
                            if (row.isDisabled()) {
                        %>
                            <td class="ColRow" style="color: #C00;" nowrap="true">
                                <%=MessageHelper.formatMessage("patronschedulelist_Disabled")%>
                            </td>
                        <%
                            } else {
                        %>
                            <td class="ColRow" nowrap="true"><%=lh.formatDateAndTime(row.getNextRunTime())%></td>
                        <%
                            }
                        %>
                            <td class="ColRow tdAlignRight" nowrap="true">
                                <base:genericButton src="/buttons/large/run.gif" name="<%= PatronScheduleListForm.ID_PREFIX_RUN_JOB + row.getJobSpecID()%>" alt='<%=MessageHelper.formatMessage("run")%>' />
                                <base:link page='<%= "/backoffice/servlet/presentschedulepatronupdateform.do?jobSpecID=" + row.getJobSpecID()%>' id="<%=PatronScheduleListForm.ID_LINK_EDIT_SCHEDULED_UPDATE_PREFIX + row.getJobSpecID() %>">
                                    <base:image src="/icons/general/edit.gif" alt='<%= MessageHelper.formatMessage("patronschedulelist_Edit") %>' />
                                </base:link> 
                                &nbsp; 
                                <base:genericButton src="/icons/general/delete.gif" name="<%= PatronScheduleListForm.ID_PREFIX_DELETE_JOB + row.getJobSpecID()%>" alt='<%=MessageHelper.formatMessage("patronschedulelist_Delete")%>' />
                            </td>
                        </tr>
                    </logic:iterate>
                </table>
            </td>
        <%
            } else {
        %>
            <td class="ColRowBold" align="center" colspan = "2">
                <%=MessageHelper.formatMessage("patronschedulelist_NoScheduledPatronUpdatesFound")%>
            </td>
        <%
            }
        %>
        </tr>       
    </base:outlinedTableAndTabsWithinThere>
</base:form>
