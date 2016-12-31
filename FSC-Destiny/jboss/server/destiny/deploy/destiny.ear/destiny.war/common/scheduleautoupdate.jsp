<%@page import="com.follett.fsc.common.TimestampHelper"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@page import="com.follett.fsc.destiny.client.common.servlet.ScheduleAutoUpdateForm"%>

<%
    ScheduleAutoUpdateForm form = (ScheduleAutoUpdateForm)request.getAttribute(ScheduleAutoUpdateForm.FORM_NAME);
%>


<%@page import="com.follett.fsc.destiny.entity.ejb3.EmailSpecs"%>
<script language="JavaScript" type="text/javascript">
  <!--
        function showUpdateInfo() {
            //Build the URL based on the fields in the form
            var url = 'd:/deploy/fsc-destiny/autoupdate/updateinfo.html';

            //Open the new window
            window.open(url, 'Bibliography').focus();                   
        }
    // -->
</script>
<base:messageBox strutsErrors="true"/>
<jsp:include page="/common/msdewarning.jsp" flush="true" />
  <table align="center" width="95%"><tr><td>

<base:form action="/common/servlet/handlescheduleautoupdateform.do" focus="<%= ScheduleAutoUpdateForm.FIELD_SCHEDULE_EMAIL_ADDRESS %>" method="post">

    <logic:equal name="<%= ScheduleAutoUpdateForm.FORM_NAME %>" property="showConfirmDelete" value="true">
   <%     
            String[] messageText = new String[]{MessageHelper.formatMessage("scheduleautoupdate_AreYouSureYouWantToRemoveThisDestinyScheduled")};
     %>
        <base:confirmBox showWarningIcon="true"
            header="Remove Scheduled Destiny Update"
            messageText="<%=messageText%>"
            noName="<%=ScheduleAutoUpdateForm.BUTTON_NAME_NO %>"/>
    </logic:equal>

  <base:outlinedTable id="<%=ScheduleAutoUpdateForm.TABLE_SCHEDULE%>" align="center" width="100%" borderColor="#C0C0C0" >
    <tr>
        <td class="SectionHeader"><%= MessageHelper.formatMessage("scheduleautoupdate_KeepDestinyUpToDate") %></td>
    </tr>
    <% if(form.isUpdateAvailable()) { %>
    <tr>
        <td colspan="3">
            <table id="<%=ScheduleAutoUpdateForm.TABLE_NEW_SCHEDULE%>" align="center" frame="box" rules="none" style="border-collapse: collapse; border: 3px double #000000;" cellpadding="3" cellspacing="3">
                <tr>
                    <td class="ColRowBold" colspan="3">
                        <base:image src="/icons/general/caution.gif"/>
                            &nbsp;<%=form.getScheduledInformation() %>
                    </td>
                </tr>
                <tr><td colspan="3">&nbsp;</td></tr>
                <tr>
                    <td>&nbsp;</td>
                    <td class="Instruction" colspan="2">
                        <%= MessageHelper.formatMessage("defaulthours_HoursNote", TimestampHelper.addMinutes(TimestampHelper.getNow(true), 481), TimestampHelper.addMinutes(TimestampHelper.getNow(true), 961)) %>
                    </td>
                </tr>  
                <tr>
                    <td class="ColRow" valign="top" align="right">
                        <% if(form.isShowRemoveButton()) { %>
                            * <%= MessageHelper.formatMessage("scheduleautoupdate_RescheduleFor") %>
                        <% } else { %>
                            * <%= MessageHelper.formatMessage("scheduleautoupdate_ScheduleFor") %>
                        <% } %>
                    </td>
                    <td class="ColRow" valign="top">
                        <html:text property="<%=ScheduleAutoUpdateForm.FIELD_CURRENT_SCHEDULED_TIME%>" size="10" maxlength="150" />
                        <base:date 
                            buttonName = "<%=ScheduleAutoUpdateForm.BUTTON_CALENDAR%>"
                            fieldName = "<%=ScheduleAutoUpdateForm.FIELD_CURRENT_SCHEDULED_DATE%>"
                            dateValue = "<%=form.getCurrentUpdateScheduleDate()%>"
                            altText = '<%= MessageHelper.formatMessage("scheduleautoupdate_ChangeDateOfTransactions") %>'
                        />
                    </td>
                    <td valign="top" align="center">
                        <table id="<%=ScheduleAutoUpdateForm.TABLE_NEW_SCHEDULE_BUTTONS%>" cellpadding="0" cellspacing="0">
                            <tr>
                                <td align="center">
                                    <base:okButton absbottom="true"/>
                                </td>
                            </tr>
                            <% if(form.isShowRemoveButton()) { %>
                            <tr>
                                <td align="center">
                                    &nbsp;&nbsp;&nbsp;<base:genericButton absbottom="true" name="<%=ScheduleAutoUpdateForm.BUTTON_REMOVE_SCHEDULED_UPDATE %>" src="/buttons/large/remove.gif"/>
                               </td>
                            </tr>
                            <% } %>
                        </table>
                    </td>
                </tr>
            </table>
         </td>
     </tr>
    <% } %>
    
    <tr>
        <td>
            <table id="<%= ScheduleAutoUpdateForm.TABLE_EMAIL_SETTINGS%>" border="0" cellspacing="0" cellpadding="3" align="center" width="90%">
                <tr>
                    <td class="FormLabel tdAlignRight" nowrap><%= MessageHelper.formatMessage("scheduleautoupdate_EmailMeWhenUpdatesAreAvailableAndCompleted") %></td>
                    <td nowrap>
                        <html:text property="<%=ScheduleAutoUpdateForm.FIELD_SCHEDULE_EMAIL_ADDRESS%>" size="40" maxlength='<%="" + EmailSpecs.EMAIL_MAX_LENGTH %>' />&nbsp;
                        <base:genericButton src="/buttons/large/testemail.gif" name="<%= ScheduleAutoUpdateForm.BUTTON_NAME_TEST_EMAIL %>" alt='<%= MessageHelper.formatMessage("testEmail") %>' absbottom="true" />                        
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>
                        <SPAN class="Instruction"><%= MessageHelper.formatMessage("defaulthours_HoursNote", TimestampHelper.addMinutes(TimestampHelper.getNow(true), 481), TimestampHelper.addMinutes(TimestampHelper.getNow(true), 961)) %></SPAN>
                    </td>
                </tr>                
                <tr>
                    <td class="ColRow tdAlignRight">
                        <html:checkbox property="<%=ScheduleAutoUpdateForm.FIELD_ENABLE_AUTO_UPDATES%>"></html:checkbox>* <%= MessageHelper.formatMessage("scheduleautoupdate_EnableAutomaticUpdatesAt") %>
                    </td>
                    <td>
                        <html:text property="<%=ScheduleAutoUpdateForm.FIELD_SCHEDULED_TIME%>" size="10"/>&nbsp;
                    </td>
                </tr>
                <tr>
                    <td class="ColRow tdAlignRight" valign="top"><%= MessageHelper.formatMessage("scheduleautoupdate_On_daysOfWeek") %></td>
                    <td>
                        <table id="<%= ScheduleAutoUpdateForm.TABLE_SCHEDULE_DAYS%>" border="0" cellspacing="0" cellpadding="2">
                            <tr>
                                <td class="ColRow">
                                    <html:checkbox property="<%=ScheduleAutoUpdateForm.FIELD_SCHEDULED_MONDAYS%>"><%= MessageHelper.formatMessage("scheduleautoupdate_Mondays") %></html:checkbox>
                                </td>
                                <td class="ColRow">
                                    <html:checkbox property="<%=ScheduleAutoUpdateForm.FIELD_SCHEDULED_SATURDAYS%>"><%= MessageHelper.formatMessage("scheduleautoupdate_Saturdays") %></html:checkbox>
                                </td>
                            </tr>
                            <tr>
                                <td class="ColRow">
                                    <html:checkbox property="<%=ScheduleAutoUpdateForm.FIELD_SCHEDULED_TUESDAYS%>"><%= MessageHelper.formatMessage("scheduleautoupdate_Tuesdays") %></html:checkbox>
                                </td>
                                <td class="ColRow">
                                    <html:checkbox property="<%=ScheduleAutoUpdateForm.FIELD_SCHEDULED_SUNDAYS%>"><%= MessageHelper.formatMessage("scheduleautoupdate_Sundays") %></html:checkbox>
                                </td>
                            </tr>
                            <tr>
                                <td class="ColRow">
                                    <html:checkbox property="<%=ScheduleAutoUpdateForm.FIELD_SCHEDULED_WEDNESDAYS%>"><%= MessageHelper.formatMessage("scheduleautoupdate_Wednesdays") %></html:checkbox>
                                </td>
                                <td class="ColRow">
                                    &nbsp;
                                </td>
                            </tr>
                            <tr>
                                <td class="ColRow">
                                    <html:checkbox property="<%=ScheduleAutoUpdateForm.FIELD_SCHEDULED_THURSDAYS%>"><%= MessageHelper.formatMessage("scheduleautoupdate_Thursdays") %></html:checkbox>
                                </td>
                                <td class="ColRow">
                                    &nbsp;
                                </td>
                            </tr>
                            <tr>
                                <td class="ColRow">
                                    <html:checkbox property="<%=ScheduleAutoUpdateForm.FIELD_SCHEDULED_FRIDAYS%>"><%= MessageHelper.formatMessage("scheduleautoupdate_Fridays") %></html:checkbox>
                                </td>
                                <td class="ColRow">
                                    &nbsp;
                                </td>
                            </tr>
                         </table>
                    </td>
                </tr>
                <tr>
                    <td class="Instruction" colspan="2" align="center" nowrap>
                        * <%= MessageHelper.formatMessage("scheduleautoupdate_BeginningMinutesPriorToTheScheduled",form.getAutoUpdateSleepMinutes()) %>
                    </td>
                </tr>
            </table>
        </td>
        <td valign="top">
              
            <base:saveButton /><br><base:cancelButton /><br><%= form.getUpdateInformation() %>
        </td>
    </tr>
</base:outlinedTable>
</base:form>
</td></tr></table>
