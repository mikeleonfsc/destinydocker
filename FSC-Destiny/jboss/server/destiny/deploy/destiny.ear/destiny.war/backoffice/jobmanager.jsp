<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.DistrictTabHelper"%>
<%@ page import="com.follett.fsc.destiny.client.common.PageCalculator" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.BaseListForm" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.data.*" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag"%>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>




<bean:define id="jobNameListValues" name="<%= JobManagerForm.FORM_NAME %>" property="jobNameList"/>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    JobManagerForm form = (JobManagerForm)request.getAttribute(JobManagerForm.FORM_NAME);
    
    int numberOfExtraColumns = 0;
    
    if (form.isShowBatchDeleteOptions()) {
        numberOfExtraColumns = 1;
    }
%>

<base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handlejobmanagerform.do">
  
    <%  // only put DISTRICT MODE on if we are in district mode, otherwise bad things happen
    if (form.isDistrictMode() ) { 
        String msg = GenericForm.getSQLAndAppServerTimeOutOfSyncMsg();
        if (msg != null) {
        %>
            <center><span class="ColRowBold"><%= msg %></span></center><BR>
        <%  } %>    
        <center><span class="ColRowBold"><%= GenericForm.getLastBackupDisplayMsg(false) %></span></center><br>
        <jsp:include page="/common/msdewarning.jsp" flush="true" />
    <% } %>

    <html:hidden property="jobID"/>
    <html:hidden property="pressedEnter"/>
    <html:hidden property="action"/>
    <html:hidden property="page"/>    
    <html:hidden property="statusOnSubmit"/>
    <html:hidden property="<%=JobManagerForm.FIELD_BATCH_DELETE_OPTIONS_CHANGE %>" value="false" />
    <html:hidden property="<%=JobManagerForm.FIELD_REPORT_MANAGER %>"/>
    <%  // only put DISTRICT MODE on if we are in district mode, otherwise bad things happen
        if (form.isDistrictMode() ) { %>
        <html:hidden property="districtMode"/>
    <% } else  if (form.isConsortiumContextMode() ) { %>
        <html:hidden property="consortiumContextMode"/>
    <% } %>
    
    <% if ( form.getMessageHeader() != null ) { %>
        <base:messageBox showWarningIcon="true" message="<%=form.getMessageHeader()%>" filterMessage="false">
        <tr><td>&nbsp;</td><td class="ColRow"><%=MessageHelper.formatMessage("jobmanager_Job0", ResponseUtils.filter(form.getJobName())) %></td></tr>
        <% if (form.getJobSubmitted() != null) { %>
        <tr><td>&nbsp;</td><td class="ColRow"><%=MessageHelper.formatMessage("jobmanager_Submitted0", form.getJobSubmitted()) %></td></tr>
        <% } %>
        <%-- iterate all messages out --%>
        <%
           List tagList = form.getMessageContents();
           Iterator itr = tagList.iterator();

           while (itr.hasNext()) {
                String row = (String) itr.next();
                out.println("<tr><td>&nbsp;</td>");
                out.println("<td class=\"ColRow\" align=\"center\">");
                out.println(row);
                out.println("</td></tr>");
           }
        %>
        <tr>
            <td>&nbsp;</td>
            <td valign="baseline" align="center" class="ColRow">
        <%
        String viewLink = form.getViewLink();
        if (!StringHelper.isEmpty(viewLink) && !"&nbsp;".equals(viewLink) ) {
            // surround the viewlink w/ brackets
            out.println("[&nbsp;" + viewLink + "&nbsp;]&nbsp;");
        }
        %>
        <%
        if (form.ACTION_DELETE.equals(form.getAction())) { %>
            <html:submit property="<%= form.BUTTON_CONFIRM_DELETE %>" value='<%=MessageHelper.formatMessage("jobmanager_DeleteJob") %>'/>
            <html:cancel value='<%=MessageHelper.formatMessage("jobmanager_Cancel") %>'/>
        <%
        } else if (!StringHelper.isEmpty(form.getAction())) { %>
            <base:yesNo/>
        <%
        } %>
    
                </td>
            </tr>
        </base:messageBox>
    <%
    } %>

    <%
    if (form.ACTION_BATCH_DELETE.equals(form.getAction())) { %>
        <base:messageBox showWarningIcon="true" message='<%= MessageHelper.formatMessage("jobmanager_TheSelectedJobsWillBeDeleted") %>' filterMessage="false">
        <tr><td colspan="2" class="ColRow" align="center"><%= MessageHelper.formatMessage("jobmanager_AnyJobsThatAreCurrentlyRunning") %></td></tr>
        <tr><td colspan="2" class="ColRow" align="center" nowrap>
            <base:yesNo/>
        </td></tr>
        </base:messageBox>
    <%
    } %>


<base:outlinedTableAndTabsWithinThere id="districtTabs" selectedTab="<%=JobManagerForm.ID_TAB%>" tabs="<%=form.getTabs()%>" align="center" width="100%">
    <tr>
    <td>


<table id="joblist" cellpadding="3" cellspacing="0" border="0" width="100%">
  <logic:equal name="backoffice_servlet_JobManagerForm" property="emptyHitList" value="false">

  <tr>
  <td colspan="2">
  
<%
    List hitList = form.getHitList();
    Iterator itr = hitList.iterator();
    int itemsInList = form.getTotalCount();
    int currentPage = PageCalculator.getCurrentPage(form);
    int itemsToSkip = PageCalculator.getFirstNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
    if ( itemsToSkip + 1 > itemsInList ) {
        itemsToSkip = 0;
    }
    int itemsToPrint = PageCalculator.getOnePastLastNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
%>
        
     <base:searchSummary searchType='<%=MessageHelper.formatMessage("jobmanager_Jobs") %>' startOfSet="<%=String.valueOf(itemsToSkip + 1)%>"
        endOfSet= "<%=String.valueOf(itemsToPrint)%>"
        totalInSet = "<%=String.valueOf(itemsInList)%>"
        tooManyHits = "false"/>
        
  </td>
  <td class="SmallColHeading"><A href="<%=form.getRefreshLink()%>" id="<%=JobManagerForm.ID_LINK_REFRESH %>"><%= MessageHelper.formatMessage("jobmanager_RefreshList") %></A></td>
  <td colspan="<%=String.valueOf(4 + numberOfExtraColumns) %>" class="SmallColHeading tdAlignRight"> 
     <base:pageListOutput formName="<%=JobManagerForm.FORM_NAME%>"/>
  </td>
  </tr>
  
    <tr>
        <td colspan="<%=String.valueOf(7 + numberOfExtraColumns) %>" align="center">
            <base:imageLine height="2" width="100%"/>
        </td>
    </tr>
  
    <tr>
        <logic:equal name="backoffice_servlet_JobManagerForm" property="showBatchDeleteOptions" value="true">
        <td align="center" nowrap>
            <base:genericButton src="/icons/general/selectallicon.gif" onclick="processCheckboxes(true); return false;" alt='<%=MessageHelper.formatMessage("jobmanager_SelectAll")%>' name="<%=JobManagerForm.BUTTON_SELECT_ALL%>" />
            <base:genericButton src="/icons/general/clearallicon.gif" onclick="processCheckboxes(false); return false;" alt='<%=MessageHelper.formatMessage("jobmanager_ClearAll")%>' name="<%=JobManagerForm.BUTTON_CLEAR_ALL%>" />
        </td>
        </logic:equal>
    
      <td class="SmallColHeading"><%= MessageHelper.formatMessage("jobmanager_Job") %></td>
      <td class="SmallColHeading"><%if (!form.isReportManager()) { %><%= MessageHelper.formatMessage("jobmanager_SubmittedBy") %><%} %></td>
      <td class="SmallColHeading"><%if (!form.isReportManager()) { %><%= MessageHelper.formatMessage("jobmanager_Started") %><%}%></td>
      <% if (form.isDistrictMode()) { %>
          <td class="SmallColHeading"><%= MessageHelper.formatMessage("jobmanager_Status") %>&nbsp;<base:helpTag helpFileName="d_viewing_job_summaries_district.htm"/></td>
      <% } else if (form.isConsortiumContextMode()) { %>
          <td class="SmallColHeading"><%= MessageHelper.formatMessage("jobmanager_Status") %>&nbsp;<base:helpTag helpFileName="d_viewing_job_summaries_district.htm"/></td>
      <% } else { %>
          <td class="SmallColHeading"><%= MessageHelper.formatMessage("jobmanager_Status") %></td>
      <% } %>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    
<%

    while (itr.hasNext()) {
        JobManagerClientVO clientVO = (JobManagerClientVO) itr.next(); %>
        <base:flipper  key="jobmanager">
<%
        if (form.isShowBatchDeleteOptions()) {
            String checkboxText;
            Long jobID = clientVO.getJobID();
            
            if (clientVO.isShowDeleteCheckbox() && (jobID != null)) {
                checkboxText = JSPHelper.renderCheckbox(JobManagerForm.CHECKBOX_GROUP_DELETE,
                    form.isCheckboxChecked(jobID), jobID.toString(), "processCheckbox()");
            } else {
                checkboxText = "&nbsp;";
            }
            
            out.println("<td class=\"ColRow\" align=\"center\" valign=\"top\">" + checkboxText + "</td>");
        }

        out.println("<td class=\"ColRow\" valign=\"top\">");
        out.println(ResponseUtils.filter(clientVO.getJobName()));
        if ( form.isDistrictMode() && clientVO.getSiteShortName() != null ) {
            out.println("<BR>");
            out.println("[" + ResponseUtils.filter(clientVO.getSiteShortName()) + "]");
        }
        out.println("</td>");

        // Colrow removed because on inherited div within form
        out.println("<td valign=\"top\">");
        if ( form.isReportManager() ) {
            out.println("&nbsp;");
        } else {
            out.println(clientVO.getSubmitterName());
        }
        out.println("</td>");

        out.println("<td class=\"ColRow\" valign=\"top\">");
        if ( form.isReportManager() ) {
            out.println("&nbsp;");
        } else {
            out.println(clientVO.getJobStartTime());
        }
        out.println("</td>");

        // ColRow removed because on inherited div within form
        out.println("<td valign=\"top\" jobStatus=\"");
        out.println(clientVO.getJobStatus());
        out.println("\">");
        out.println(clientVO.getDisplayableStatus());
        if ( form.isDistrictMode() || form.isConsortiumContextMode() ) {
           if ( !StringHelper.isEmpty(clientVO.getElapsedTime())) {
              out.println("<div class=\"Instruction\">");
              out.println(clientVO.getElapsedTime());
              out.println("</div>");
           }
        }
        out.println("</td>");

        out.println("<td class=\"ColRow\" valign=\"top\">");
        out.println(clientVO.getLinkView());
        out.println("</td>");

        out.println("<td class=\"ColRow\" valign=\"top\">");
        out.println(clientVO.getLinkStartStop());
        out.println("</td>");

        out.println("<td class=\"ColRow\" valign=\"top\">");
        out.println(clientVO.getLinkDelete());
        out.println("</td>");
%>        
    </base:flipper>
<%  } %>
  <tr>
  <td colspan="2">
     <base:searchSummary searchType='<%=MessageHelper.formatMessage("jobmanager_Jobs") %>' startOfSet="<%=String.valueOf(itemsToSkip + 1)%>"
        endOfSet= "<%=String.valueOf(itemsToPrint)%>"
        totalInSet = "<%=String.valueOf(itemsInList)%>"
        tooManyHits = "false"/>
  </td>
  <td class="SmallColHeading"><A href="<%=form.getRefreshLink()%>" id="<%=JobManagerForm.ID_LINK_REFRESH %>"><%= MessageHelper.formatMessage("jobmanager_RefreshList") %></A></td>
  <td colspan="<%=String.valueOf(4 + numberOfExtraColumns) %>" class="SmallColHeading tdAlignRight"> 
     <base:pageListOutput formName="<%=JobManagerForm.FORM_NAME%>"  topOfPageLinks="false" />
  </td>
  </tr>

    <tr>
        <td colspan="<%=String.valueOf(7 + numberOfExtraColumns) %>" align="center">
            <base:imageLine height="2" width="100%"/>
        </td>
    </tr>

<input type="image" src="/images/icons/general/spacer.gif" width="0" height="0" border="0" alt="" value="true"  name="<%=JobManagerForm.BUTTON_TRAP_ENTER%>">
  <logic:equal name="backoffice_servlet_JobManagerForm" property="showBatchDeleteOptions" value="true">
    
    <tr>
        <td colspan="8">
            <a name="batchDeleteOptionsFocus"></a>
            <table id="<%= JobManagerForm.TABLE_BATCH_DELETE_OPTIONS %>" cellpadding="3" cellspacing="0" border="0" width="100%">
                <tr>
                    <td class="TableHeading"><%= MessageHelper.formatMessage("jobmanager_DeleteJobs") %></td>
                    <td colspan="3">&nbsp;</td>
                    <td class="tdAlignRight"><base:genericButton src="/buttons/large/deletebig.gif" name="<%= JobManagerForm.BUTTON_BATCH_DELETE %>" alt='<%= MessageHelper.formatMessage("delete")%>' /></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td colspan="3" class="ColRowBold" nowrap>
                        <html:radio property="<%=JobManagerForm.FIELD_DELETE_TYPE%>" value="<%=String.valueOf(JobManagerForm.DELETE_TYPE_ALL_SELECTED)%>"><%= MessageHelper.formatMessage("jobmanager_AllSelectedOnThisPage") %></html:radio>
                    </td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td colspan="3" class ="ColRowBold" nowrap>
                        <html:radio property="<%=JobManagerForm.FIELD_DELETE_TYPE%>" value="<%=String.valueOf(JobManagerForm.DELETE_TYPE_DATE_AND_OR_NAME)%>"><%= MessageHelper.formatMessage("jobmanager_BasedOn") %>&nbsp;</html:radio>
                        <html:select property="<%=JobManagerForm.FIELD_DELETE_MODE%>" onchange="submitDeleteMode()">
                            <html:option value="<%= String.valueOf(JobManagerForm.DELETE_MODE_DATE_ONLY)%>"><%=MessageHelper.formatMessage("jobmanager_DateStarted")%></html:option>
                            <html:option value="<%= String.valueOf(JobManagerForm.DELETE_MODE_NAME_ONLY)%>"><%=MessageHelper.formatMessage("jobmanager_JobName")%></html:option>
                            <html:option value="<%= String.valueOf(JobManagerForm.DELETE_MODE_DATE_AND_NAME)%>"><%=MessageHelper.formatMessage("jobmanager_DateStartedAndJobName")%></html:option>
                        </html:select>
                    </td>
                    <td>&nbsp;</td>
                </tr>
                <% if (form.getDeleteMode() != JobManagerForm.DELETE_MODE_NAME_ONLY) { %>
                <tr>
                    <td width="50%">&nbsp;</td>
                    <td><base:imageSpacer height="1" width="16"/></td>
                    <td colspan="1" nowrap>
                        <span class="ColRow"><%= MessageHelper.formatMessage("jobmanager_StartedOnOrBefore") %></span>
                        <span onKeyPress="return trapEnter(event);">
                        <base:date 
                            buttonName = "<%=JobManagerForm.BUTTON_DATE%>"
                            fieldName = "<%=JobManagerForm.FIELD_DATE_TO_DELETE_FROM%>"
                            dateValue = "<%=form.getDateToDeleteFrom()%>"
                            altText = '<%= MessageHelper.formatMessage("jobmanager_ChangeDate")%>'
                            disableDateButtons = "false"
                        />
                        </span>
                    </td>
                    <td>&nbsp;</td>
                    <td width="50%">&nbsp;</td>
                </tr>
                <% } %>
                <% if (form.getDeleteMode() != JobManagerForm.DELETE_MODE_DATE_ONLY) { %>
                <tr>
                    <td width="50%">&nbsp;</td>
                    <td><img src="/images/icons/general/spacer.gif" border="0" width="16" height="1"/></td>
                    <td colspan="1" nowrap class="ColRow"><%= MessageHelper.formatMessage("jobmanager_Name") %>&nbsp;<html:select property="<%= JobManagerForm.FIELD_JOB_NAME %>">
                            <html:options collection="jobNameListValues" property="stringCode"
                                labelProperty="stringDesc"/>
                        </html:select>
                    </td>
                    <td>&nbsp;</td>
                    <td width="50%">&nbsp;</td>
                </tr>
                <% } else { %>
                    <html:hidden property="<%= JobManagerForm.FIELD_JOB_NAME %>"/>
                <% } %>
                
                <tr>
                    <td colspan="5" align="center">
                        <base:imageLine height="2" width="100%"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="5" align="center">
                    <base:helpIcons buttonsToOutput="<%=new int[] {HelpIconsTag.ICON_SELECT_ALL, HelpIconsTag.ICON_CLEAR_ALL }%>" />
                    </td>
                </tr>
            </table>
        </td>
    </tr>  
                </logic:equal>
  
            </logic:equal>
            <logic:equal name="backoffice_servlet_JobManagerForm" property="emptyHitList" value="true">
                <tr><td class="ColRowBold" align="center"><%= MessageHelper.formatMessage("jobmanager_ThereAreNoJobsPresentlyAvailable") %></td></tr>
                <tr>
                    <td class="SmallColHeading" align="center"><A href="<%=form.getRefreshLink()%>" id="<%=JobManagerForm.ID_LINK_REFRESH %>"><%= MessageHelper.formatMessage("jobmanager_RefreshList") %></A></td>
                </tr>
            </logic:equal>
            </table>    


        </td>
    </tr>
</base:outlinedTableAndTabsWithinThere>
</base:form>

<script language="JavaScript" type="text/javascript">
<!--
    function trapEnter(e) {
	    var whichCode = (window.Event) ? e.which : e.keyCode;
	    if (e.keyCode == 13) {
	        document.<%=JobManagerForm.FORM_NAME%>.pressedEnter.value="true";
	        document.<%=JobManagerForm.FORM_NAME%>.submit();
	        return true;
        }
	    return true;
    }

    function submitDeleteMode() {
    	document.<%=JobManagerForm.FORM_NAME%>.batchDeleteOptionsChange.value = 'true';
        document.<%=JobManagerForm.FORM_NAME%>.submit();
    }

    function processCheckbox() {
        document.<%=JobManagerForm.FORM_NAME%>.<%=JobManagerForm.FIELD_DELETE_TYPE%>[0].checked = true;
    }

    function processCheckboxes(isChecked) {
        var checkboxGroup = document.<%=JobManagerForm.FORM_NAME%>.<%=JobManagerForm.CHECKBOX_GROUP_DELETE%>;
        if (checkboxGroup != undefined ) {
            if (checkboxGroup.length != undefined) {
                for (i = 0; i < checkboxGroup.length; i++) {
                    checkboxGroup[i].checked = isChecked ;
                }
            } else {
                checkboxGroup.checked = isChecked;
            }
    
            processCheckbox();
        }
    }
// -->
</script>
