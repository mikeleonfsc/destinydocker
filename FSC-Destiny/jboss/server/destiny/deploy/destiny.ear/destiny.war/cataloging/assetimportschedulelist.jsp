<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.AssetImportForm"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.AssetImportScheduleListForm"%>
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
<%@page import="com.follett.fsc.destiny.session.backoffice.data.PatronUpdateJobSpecRecord"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.BarcodeListTag"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<base:messageBox strutsErrors="true"/>

<%
    AssetImportScheduleListForm form = (AssetImportScheduleListForm) request.getAttribute(AssetImportScheduleListForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);

    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>

<base:form action="/cataloging/servlet/handleassetimportschedulelistform.do" enctype="multipart/form-data">
<html:hidden property="<%=form.PARAM_CONFIRM_DELETE_ID %>"/>

<% if (form.getConfirmDeleteID()!=null){ %>
    <base:messageBox showWarningIcon="true" message='<%=MessageHelper.formatMessage("assetschedulelist_TheFollowingJobWillBeDeleted0", form.getJobNameToDelete())%>' filterMessage="true">
            <tr>
                <td>&nbsp;</td>
                <td class="ColRowBold"><%=MessageHelper.formatMessage("assetschedulelist_AreYouSureYouWantToContinue") %></td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2"><base:yesNo/></td>
            </tr>
    </base:messageBox>
<% } %>

<base:outlinedTableAndTabsWithinThere width="100%" selectedTab="<%=form.getSelectedTab()%>" tabs="<%=form.getTabs()%>" id="<%=AssetImportForm.TABLE_OUTLINE_IMPORT_ASSET%>" borderColor="#c0c0c0">
    <tr>
        <td class="TableHeading" id="<%=form.ID_PAGE_HEADING %>"><%=MessageHelper.formatMessage("assetschedulelist_ScheduledPatronUpdates") %></td>
        <td class="tdAlignRight" height="18">
            <base:link page="/cataloging/servlet/presentscheduleassetimportform.do" showTextAlways='false' id="<%=form.ID_LINK_NEW_SCHEDULED_UPDATE%>">
                <base:image align="absbottom" src="/buttons/large/scheduleit.gif" alt='<%=MessageHelper.formatMessage("assetschedulelist_ScheduleIt")%>'/>
            </base:link>
        </td>
    </tr>
    <tr> 
    <% if (form.getJobSpecList() != null && form.getJobSpecList().size() > 0) { %> 
        <td colspan="2">      
            <table width="100%" cellspacing="0" cellpadding="3" id="<%=form.SUB_MAIN_TABLE %>">
                <tr valign="top" >
                    <% // Display item here %>
                    <td class="SmallColHeading" nowrap="true"><%=MessageHelper.formatMessage("assetschedulelist_Name") %></td>
                    <td class="SmallColHeading" nowrap="true"><%=MessageHelper.formatMessage("assetschedulelist_LastRun") %></td>
                    <td class="SmallColHeading" nowrap="true" colspan="2"><%=MessageHelper.formatMessage("assetschedulelist_NextRun") %></td>
                </tr>    
            
                <logic:iterate indexId="flipper" id="row" name="<%=form.FORM_NAME %>" property="jobSpecList" type="PatronUpdateJobSpecRecord">
                <tr valign="top" <%=(((1 & flipper.intValue())==0)? "bgColor=\"#E8E8E8\"" : "" )%> >
                    <% // Display item here %>
                    <td><span class="ColRow"><%=ResponseUtils.filter(row.getReportName())%></span>
                        <br>&nbsp;&nbsp;&nbsp;<span class="Instruction"><%=MessageHelper.formatMessage("assetschedulelist_CreatedBy0", row.getCreatorUserName()) %></span>
                    </td>
                    <td class="ColRow" nowrap="true"><%= form.buildJobViewLink(lh.formatDateAndTime(row.getLastRunTime()), row.getJobID()) %></td>
                    <td class="ColRow" nowrap="true"><%=lh.formatDateAndTime(row.getNextRunTime())%></td>
                    <td class="ColRow tdAlignRight" nowrap="true">
                        <base:genericButton src="/buttons/large/run.gif" name="<%=form.ID_PREFIX_RUN_JOB + row.getJobSpecID()%>" alt='<%=MessageHelper.formatMessage("run")%>'/>
                        <base:link page='<%= "/cataloging/servlet/presentscheduleassetimportform.do?jobSpecID=" + row.getJobSpecID()%>' id="<%=AssetImportScheduleListForm.ID_LINK_EDIT_SCHEDULED_UPDATE_PREFIX + row.getJobSpecID() %>">
                            <base:image src="/icons/general/edit.gif" alt="Edit"/>
                        </base:link>
                        &nbsp;
                        <base:genericButton src="/icons/general/delete.gif" name="<%=form.ID_PREFIX_DELETE_JOB + row.getJobSpecID()%>" alt="Delete"/>
                    </td>
                </tr>
                </logic:iterate>             
            </table>
        </td>
    <% } else { %>
        <td class="ColRowBold" align="center" colspan = "2" id="<%=form.ID_NO_SCHEDULED_IMPORTS_FOUND%>">
            <%=MessageHelper.formatMessage("assetschedulelist_NoScheduledAssetImportsFound")%>
        </td>
    <% } %>
    </tr>       
</base:outlinedTableAndTabsWithinThere>

</base:form>
