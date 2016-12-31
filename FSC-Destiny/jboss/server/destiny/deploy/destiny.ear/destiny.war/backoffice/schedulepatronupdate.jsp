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
<%@page import="com.follett.fsc.destiny.client.common.data.Tab"%>
<%@page import="com.follett.fsc.destiny.client.common.SitePatronHelper"%>
<%@page import="com.follett.fsc.destiny.client.backoffice.data.UpdatePatronHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.BarcodeListTag"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="com.follett.fsc.destiny.client.common.servlet.BaseFileUploadForm"%>

<%
    SchedulePatronUpdateForm form = (SchedulePatronUpdateForm) request.getAttribute(SchedulePatronUpdateForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);

    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    
    GregorianCalendar gc = (GregorianCalendar) GregorianCalendar.getInstance(lh.getLocale());
    int firstDay = gc.getFirstDayOfWeek(); // This should return things like Calendar.SUNDAY, starts at 1
    String[] daysOfTheWeek = CalendarHelper.getDays(true);
    String focusControl = "";
    if( !form.isPrinterFriendly()){
        focusControl = SchedulePatronUpdateForm.FIELD_CUSTOM_JOB_NAME;
    }
%>

<script language="JavaScript">
<!--
    window.focus();
    function submitFileChange() {
        document.<%=SchedulePatronUpdateForm.FORM_NAME%>.<%=SchedulePatronUpdateForm.FIELD_FILE_CHANGED%>.value = "true";
        document.<%=SchedulePatronUpdateForm.FORM_NAME%>.submit();
    }
    
//-->
</script>

<%@page import="com.follett.fsc.common.CalendarHelper"%>
<%@page import="com.follett.fsc.common.TimestampHelper"%>
<%@page import="com.follett.fsc.common.StringHelper"%><bean:define id="fileEncodingDisplayable" name="<%=form.FORM_NAME%>" property="fileEncodingDisplayable"/>
<base:form action="/backoffice/servlet/handleschedulepatronupdateform.do" enctype="multipart/form-data" focus="<%=focusControl %>">
<base:messageBox strutsErrors="true"/>

<html:hidden property="<%= SchedulePatronUpdateForm.FIELD_JOB_SPEC_ID %>" />
<html:hidden property="<%= SchedulePatronUpdateForm.FIELD_FILE_CHANGED %>" value="false" />
<base:outlinedTable borderColor='#c0c0c0' width="100%" cellpadding="0" id="<%=SchedulePatronUpdateForm.MAIN_TABLE %>">
    <tr>
        <td class="TableHeading">
            <%=form.getFormHeading() %>
        </td>
    </tr>
    <tr>
        <td rowspan=2>
            <table width="95%" align="center">
                <tr>
                    <td class="ColRowBold tdAlignRight">
                        <%=MessageHelper.formatMessage("schedulepatronupdate_JobName") %>
                    </td>
                    <td>
                         <html:text property="<%= SchedulePatronUpdateForm.FIELD_CUSTOM_JOB_NAME %>" size="50" maxlength="128"/>
                    </td>
                    <td align="center" class="ColRowBold" rowspan="3">
                        <base:showHideTag id="saveJob">
                            <table id="tableButtons">
                                <tr>
                                    <td class="tdAlignRight">
                                        <base:saveButton onclick="hideElementsaveJob()" />
                                    </td>
                                    <td class="tdAlignLeft">
                                        <base:cancelButton onclick="hideElementsaveJob()" />
                                    </td>
                </tr>
                            </table>
                        </base:showHideTag>
                    </td>
                </tr><tr>
                    <td colspan="2"><base:imageLine /></td>
                </tr><tr>
                    <td colspan="2">
                        <span class="TableHeading2">*<%= MessageHelper.formatMessage("schedulepatronupdate_PatronDataFileInformation") %></span>
                    </td>
                </tr><tr style="margin-right:.5em;">
                    <td class="ColRowBold tdAlignLeft">
                            <html:radio style="position:relative;right:-1em;" property="<%= SchedulePatronUpdateForm.FIELD_FILE_SOURCE%>" value="<%= SchedulePatronUpdateForm.SOURCE_MODE_DIRECTORY%>"></html:radio>
                            <span style="float:right"><%=MessageHelper.formatMessage("schedulepatronupdate_Directory") %></span>
                    </td><td class="tdAlignLeft">
                            <html:text property="<%= SchedulePatronUpdateForm.FIELD_CSV_FILE_DIRECTORY %>" size="50" maxlength="256"/>
                    </td>
                 </tr><tr class="ColRowBold tdAlignLeft">
                    <td>
                            <html:radio style="position:relative;right:-1em;" property="<%= SchedulePatronUpdateForm.FIELD_FILE_SOURCE%>" value="<%=SchedulePatronUpdateForm.SOURCE_MODE_SFTP%>"></html:radio>
                            <span style="float:right">SFTP URL</span>
                    </td><td class="tdAlignLeft">
                            <html:text property="<%= SchedulePatronUpdateForm.FIELD_SFTP_SERVER_URL %>" size="50" maxlength="256"/>
                            <span style="position:relative;bottom:-2em;">
                                <base:genericButton
                                src="/buttons/large/testserver.gif"
                                name="<%= SchedulePatronUpdateForm.BUTTON_NAME_TEST_SERVER %>"
                                alt='<%= MessageHelper.formatMessage("testServer") %>' />
                            </span>
                    </td>
                 </tr><tr class="ColRowBold tdAlignRight">
                    <td>
                            <%=MessageHelper.formatMessage("schedulepatronupdate_UserName")%><br>
                    </td><td class="tdAlignLeft">
                            <html:text property="<%= SchedulePatronUpdateForm.FIELD_SFTP_USERNAME %>" size="50" maxlength="256"/>
                    </td>
                 </tr><tr class="ColRowBold tdAlignRight">
                    <td>
                            <%=MessageHelper.formatMessage("schedulepatronupdate_Password")%>
                    </td><td class="tdAlignLeft">
                            <html:password property="<%= SchedulePatronUpdateForm.FIELD_SFTP_PASSWORD %>" size="50" maxlength="256"/>
                    </td>
                  </tr><tr><td>&nbsp;</td><td><base:imageLine/></td>
                  </tr><tr> 
                    <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("schedulepatronupdate_FileName") %></td>
                    <td><html:text property="<%= SchedulePatronUpdateForm.FIELD_CSV_FILE_NAME %>" size="50" maxlength="256"/></td>
                  </tr><tr>
                    <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("schedulepatronupdate_FileEncoding") %></td>
                    <td class="ColRow">
                        <%= form.getFileEncodingDisplayable() %>
                   </td>
                </tr><tr>
                    <td colspan="2"><base:imageLine /></td>
                </tr> 
                <tr>                    
                <td colspan="2">
                        <span class="TableHeading2"><%= MessageHelper.formatMessage("schedulepatronupdate_ChangePropertiesFile") %></span>
                        <% if(form.getPropertiesFileContent() != null) { %>
                            <base:genericButton name="<%=SchedulePatronUpdateForm.BUTTON_EDIT_UPDATE_PATRON_PROPERTIES %>" src="/buttons/large/edit.gif" alt='<%=MessageHelper.formatMessage("schedulepatronupdate_EditPropertiesFile") %>'/>
                        <% } %>
                </td>
                </tr>
                                
                <tr>
                    <td class="ColRowBold tdAlignRight">                        
                        <%= (form.getJobSpecID()==null) ? 
                               MessageHelper.formatMessage("schedulepatronupdate_PropertiesFile") :                                                               
                               MessageHelper.formatMessage("schedulepatronupdate_ChangePropertiesFile") %>
                    </td>
                    <td class="ColRow">
                        <% if  (StringHelper.isEmptyOrWhitespace(form.getSelectedPropertiesFile())) { %>
                            <html:file property="<%= BaseFileUploadForm.FIELD_UPLOAD_FILE %>" size="50" maxlength="256" onchange="submitFileChange()"/>
                            <% } else { %>
                            <%= form.getSelectedPropertiesFile() %>
                            <% } %>
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight">
                        &nbsp;
                    </td>
                    <td class="Instruction">
                        <% if(form.isMac()) { %>
                            <%= MessageHelper.formatMessage("schedulepatronupdate_DownloadThe0PatronImportConverter1ForMacOsX", 
                                    "<a href=\"/backoffice/servlet/presentschedulepatronupdateform.do?"+SchedulePatronUpdateForm.PARAM_DOWNLOAD_PIC_MAC+"=true\" id="+SchedulePatronUpdateForm.ID_PIC_DOWNLOAD_MAC+">",
                                    "</a>"
                                )
                            %>
                        <% } else { %>
                            <%= MessageHelper.formatMessage("schedulepatronupdate_DownloadThe0PatronImportConverter1ForWindows", 
                                    "<a href=\"/backoffice/servlet/presentschedulepatronupdateform.do?"+SchedulePatronUpdateForm.PARAM_DOWNLOAD_PIC+"=true\" id="+SchedulePatronUpdateForm.ID_PIC_DOWNLOAD+">",
                                    "</a>"
                                )
                            %>
                        <% } %>
                    </td>
                </tr>  
                <% if ((form.getJobSpecID()==null)) { %> 
                    <tr>
                      <td class="ColRow tdAlignRight">&nbsp;</td>
                      <td class="Instruction"><%=MessageHelper.formatMessage("schedulepatronupdate_RequiredField") %></td>                 
                    </tr>
                <% } %>                
                
                <logic:notEmpty name="<%=SchedulePatronUpdateForm.FORM_NAME%>" property="<%=SchedulePatronUpdateForm.FIELD_JOB_SPEC_ID %>">        
                <tr>
                    <td class="ColRowBold tdAlignRight">
                        &nbsp;
                    </td>
                    <td class="Instruction">
                        <%= MessageHelper.formatMessage("schedulepatronupdate_DownloadThe0PropertiesFile1",
                            "<a href=\""+form.getPropsFileDownloadURL()+ "\" id=\""+SchedulePatronUpdateForm.ID_PROPERTIES_DOWNLOAD+"\">",
                            "</a>"
                            )
                        %>
                    </td>
                </tr>    
                </logic:notEmpty>
                <tr>
                    <td colspan="2"><base:imageLine /></td>
                </tr> 
                <tr>
                    <td colspan="2">
                        <span class="TableHeading2"><%= MessageHelper.formatMessage("schedulepatronupdate_JobSchedule") %></span>
                    </td>
                </tr>                        
                <tr>
                    <td class="ColRowBold tdAlignRight" valign="top">
                        <%= MessageHelper.formatMessage("schedulepatronupdate_Update") %>
                    </td>
                    <td>
                        <table>
                            <tr>
                                <td class="Instruction">
                                    <%=MessageHelper.formatMessage("schedulepatronupdate_SelectTheTypeOfUpdateToRun") %>
                                </td>
                            </tr>
                               <tr>
                                    <td class="ColRow" >
                                        <table cellpadding = "2">
                                        <% for (int x = 0; x < 7; x++) { %>
                                            <tr>
                                                <td><%=daysOfTheWeek[x] %></td>
                                                <td><html:radio property="<%=form.getPropertyForDay(x, firstDay)%>" value = "<%= SchedulePatronUpdateForm.RUN_TYPE_NONE %>" ><%= MessageHelper.formatMessage("schedulepatronupdate_None") %></html:radio></td>
                                                <td><html:radio property="<%=form.getPropertyForDay(x, firstDay)%>" value = "<%= SchedulePatronUpdateForm.RUN_TYPE_FULL %>"><%= MessageHelper.formatMessage("schedulepatronupdate_Full") %></html:radio></td>
                                                <td><html:radio property="<%=form.getPropertyForDay(x, firstDay)%>" value = "<%= SchedulePatronUpdateForm.RUN_TYPE_INC %>"><%= MessageHelper.formatMessage("schedulepatronupdate_Incremental") %></html:radio></td>
                                            </tr>
                                        <% } %>
                                        </table>                               
                                    </td>
                                </tr>
                         </table>
                    </td>
                </tr>            
                <tr>
                    <td class="tdAlignRight">
                        <span class="ColRowBold"><%=MessageHelper.formatMessage("schedulepatronupdate_Time") %></span>
                    </td>
                    <td>
                         <html:text property="<%= SchedulePatronUpdateForm.FIELD_TIME_TO_RUN %>" size="12" maxlength="20"/>&nbsp;<span class="Instruction"><%= MessageHelper.formatMessage("schedulepatronupdate_ExampleTimes01", TimestampHelper.addMinutes(TimestampHelper.getNow(true), 481), TimestampHelper.addMinutes(TimestampHelper.getNow(true), 961)) %></span>
                    </td>
                </tr>    
                <tr>
                    <td>
                        &nbsp;
                    </td>
                    <td class="ColRow">
                        <html:checkbox property="<%= SchedulePatronUpdateForm.FIELD_DISABLED %>"/>
                         <%=MessageHelper.formatMessage("schedulepatronupdate_DisablePatronUpdate") %>
                    </td>
                </tr>    
                <tr>
                    <td colspan="2"><base:imageLine /></td>
                </tr> 
                <tr>
                    <td colspan="2">
                        <span class="TableHeading2"><%= MessageHelper.formatMessage("schedulepatronupdate_PatronUpdateJobOptions") %></span>
                    </td>
                </tr>                         
                <tr>
                    <td class="ColRowBold tdAlignRight">
                        &nbsp;
                    </td>
                    <td class="ColRow">
                         <html:checkbox property="<%= SchedulePatronUpdateForm.FIELD_DELETE_WITH_TRANSACTIONS %>"/>
                         <%=MessageHelper.formatMessage("schedulepatronupdate_AllowPatronsWithOutstandingTransactionsToBeDeleted") %> 
                    </td>
                </tr>            
                <tr>
                    <td class="ColRowBold tdAlignRight">
                        &nbsp;
                    </td>
                    <td class="ColRow">
                         <html:checkbox property="<%= SchedulePatronUpdateForm.FIELD_LIMIT_TO_ERRORS %>"/>
                         <%=MessageHelper.formatMessage("schedulepatronupdate_LimitJobSummaryToErrorsAndWarnings") %>
                    </td>
                </tr>            
                <tr>
                    <td class = "ColRowBold tdAlignRight">&nbsp;</td>
                    <td class = "ColRow">
                         <html:checkbox property="<%= SchedulePatronUpdateForm.PARAM_DELETE_PREVIOUS_JOBS %>"/>
                         <%= MessageHelper.formatMessage("schedulepatronupdate_DeletePreviouslyRunJobs") %><br/>
                         <base:imageSpacer width="25" height="1"/><%= MessageHelper.formatMessage("schedulepatronupdate_NumberOfJobsToKeep") %> <html:text property="<%= SchedulePatronUpdateForm.PARAM_DELETE_PREVIOUS_JOBS_COUNT %>" size = "3" maxlength = "2"/>
                    </td>
                </tr>
            </table>
        </td>

    </tr>
    
</base:outlinedTable>

</base:form>
