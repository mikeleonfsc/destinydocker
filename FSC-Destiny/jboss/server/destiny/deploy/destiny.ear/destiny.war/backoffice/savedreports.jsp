<%@page language="java" %>
<%@page contentType="text/html; charset=UTF-8" %>
<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.BaseSaveableReportForm"%>
<%@page import="com.follett.fsc.destiny.session.common.lookup.*" %>
<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@page import="com.follett.fsc.destiny.session.backoffice.data.BaseJobSpecRecord"%>
<%@page import="com.follett.fsc.destiny.session.district.ejb.ConfigDistrictFacadeSpecs" %>
<%@page import="com.follett.fsc.destiny.entity.ejb3.JobSpecSpecs"%>
<%@page import="com.follett.fsc.common.LocaleHelper" %>
<%@page import="com.follett.fsc.destiny.util.Permission"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="com.follett.fsc.common.StringHelper"%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>

<%@taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@taglib uri="/WEB-INF/jstl-destiny.tld" prefix="dfn" %>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>


<c:set var="form" value="${requestScope.form}"/>
<jsp:useBean id="form" type="com.follett.fsc.destiny.client.backoffice.servlet.BaseSaveableReportForm"/>

<base:form action="${form.handleURL}">

    <c:if test="${!empty form.confirmDelete}">
        <html:hidden property="<%=BaseSaveableReportForm.FIELD_ACTION%>"/>    
        <html:hidden property="<%=BaseSaveableReportForm.FIELD_JOB_SPEC_ID%>"/>    
        <html:hidden property="<%=BaseSaveableReportForm.PARAM_SORT_TYPE%>"/>    
        <html:hidden property="<%=BaseSaveableReportForm.PARAM_SORT_DESCENDING%>"/>    
        <base:imageSpacer width="1" height="3"/>        
        <base:messageBox showWarningIcon="true" message="${form.confirmDelete}">
            <% if (form.getNumberOfFavorites() > 0) { %>
                    <tr><td valign="baseline" align="center" class="ColRow" colspan="2"><ul><li><%=MessageHelper.formatMessage("savedreports_UsersWithThisReport", new Long(form.getNumberOfFavorites())) %></li></ul></td></tr>
            <% } %>        
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2">
                    <base:yesNo 
                        buttonYesName="<%=BaseSaveableReportForm.BUTTON_CONFIRM_DELETE%>"
                        buttonNoName="<%=BaseSaveableReportForm.BUTTON_CANCEL_DELETE%>"
                    />
                </td>
            </tr>
        </base:messageBox>
    </c:if>

    <base:outlinedTableAndTabsWithinThere cellpadding="2" width="100%" id="<%=BaseSaveableReportForm.TABLE_MAIN%>" selectedTab='<%= MessageHelper.formatMessage("savedreports_SavedReports") %>' selectedTabID="<%=BaseSaveableReportForm.TAB_RIGHT %>" tabs="<%=form.getTabs()%>">
        <tr>
            <td class="TableHeading"><%=MessageHelper.formatMessage("savedreports_SavedReportsFor0", form.getReportTypeName())%></td>
        </tr>
        <tr>
            <td>
                <base:imageLine/>
            </td>
        </tr>
        <c:choose>
            <c:when test="${empty form.savedReportsList}">
                <tr>
                    <td class="ColRowBold" align="center"><%=MessageHelper.formatMessage("savedreports_ThereAreNoSavedReports") %></td>
                </tr>
            </c:when>
            <c:otherwise>
                <tr>
                    <td>
                        <table id="<%=BaseSaveableReportForm.TABLE_SAVED_REPORTS%>" cellpadding="5" cellspacing="0" width="100%">
                            <tr>
                                <td class="SmallColHeading"><%=form.getSortLink(MessageHelper.formatMessage("savedreports_Name"), JobSpecSpecs.JOB_SPEC_SORT_BY_NAME, BaseSaveableReportForm.ID_SORT_NAME)%></td>
                                <td class="SmallColHeading"><%=form.getSortLink(MessageHelper.formatMessage("savedreports_CreatedBy"), JobSpecSpecs.JOB_SPEC_SORT_BY_CREATED_BY, BaseSaveableReportForm.ID_SORT_CREATED_BY)%></td>
                                <td class="SmallColHeading"><%=form.getSortLink(MessageHelper.formatMessage("savedreports_LastRun"), JobSpecSpecs.JOB_SPEC_SORT_BY_LAST_RUN, BaseSaveableReportForm.ID_SORT_LAST_RUN)%></td>
                                <td class="SmallColHeading tdAlignRight">&nbsp;</td>
                            </tr>
                            <c:forEach var="report" items="${form.savedReportsList}" varStatus="status">
                                <jsp:useBean id="report" type="com.follett.fsc.destiny.session.backoffice.data.BaseJobSpecRecord"/>
                                <tr bgcolor="${status.count % 2 == 0 ? '' : '#E8E8E8'}">
                                    <td class="ColRow" valign="top">
                                        <c:if test="${report.favoriteReport}">
                                           <base:image align="absbottom" src="/icons/general/favorite.gif"/>
                                        </c:if>
                                        <c:out value="${report.reportName}"/>
                                    </td>
                                    <td class="ColRow" valign="top"><c:out value="${report.creatorUserName}"/></td>
                                    <td class="ColRow" valign="top"><%=form.getJobViewLink(report)%></td>
                                    <td class="ColRow tdAlignRight" valign="top" NOWRAP>
                                        <c:if test="<%=!form.getStore().isDestinyAdminLoggedIn() && 
                                            !form.getStore().isConsortiumAdminLoggedIn() && 
                                            form.getStore().isUserLoggedIn(request) && !report.isFavoriteReport()%>">
                                        
                                            <c:url var="AddFavorite" value="${form.handleURL}">
                                                <c:param name="<%=BaseSaveableReportForm.FIELD_ACTION%>" value="<%=BaseSaveableReportForm.ACTION_MAKE_FAVORITE%>"/>
                                                <c:param name="<%=BaseSaveableReportForm.FIELD_JOB_SPEC_ID%>" value="${report.jobSpecID}"/>
                                                <c:param name="<%=BaseSaveableReportForm.PARAM_FROM_SAVED_REPORTS%>" value="true"/>
                                            </c:url>
                                            <base:link href="${AddFavorite}" id="addToFavorites_${report.jobSpecID}">
                                                <base:image src="/icons/general/addtofavorites.gif" alt='<%= MessageHelper.formatMessage("savedreports_AddToFavorites")%>'/>
                                            </base:link>
                                            &nbsp;
                                        </c:if>
                                        <c:url var="runURL" value="${form.handleURL}">
                                            <c:param name="<%=BaseSaveableReportForm.FIELD_ACTION%>" value="<%=BaseSaveableReportForm.ACTION_RUN%>"/>
                                            <c:param name="<%=BaseSaveableReportForm.FIELD_JOB_SPEC_ID%>" value="${report.jobSpecID}"/>
                                            <c:param name="<%=BaseSaveableReportForm.PARAM_FROM_SAVED_REPORTS%>" value="true"/>
                                        </c:url>
                                        <base:link href="${runURL}" id="run_${report.jobSpecID}">
                                            <base:image src="/buttons/large/run.gif" alt='<%= MessageHelper.formatMessage("run")%>'/>
                                        </base:link>
                                        &nbsp;
                                        <c:url var="editURL" value="${form.handleURL}">
                                            <c:param name="<%=BaseSaveableReportForm.FIELD_ACTION%>" value="<%=BaseSaveableReportForm.ACTION_EDIT%>"/>
                                            <c:param name="<%=BaseSaveableReportForm.FIELD_JOB_SPEC_ID%>" value="${report.jobSpecID}"/>
                                            <c:param name="<%=BaseSaveableReportForm.PARAM_FROM_SAVED_REPORTS%>" value="true"/>
                                        </c:url>
                                        <base:link href="${editURL}" id="editSavedReport_${report.jobSpecID}">
                                            <base:image src="/icons/general/edit.gif" width="19" height="16" alt='<%= MessageHelper.formatMessage("savedreports_EditSavedReport") %>'/>
                                        </base:link>
                                        &nbsp;
                                        <c:url var="duplicateURL" value="${form.handleURL}">
                                            <c:param name="<%=BaseSaveableReportForm.FIELD_ACTION%>" value="<%=BaseSaveableReportForm.ACTION_DUPLICATE%>"/>
                                            <c:param name="<%=BaseSaveableReportForm.FIELD_JOB_SPEC_ID%>" value="${report.jobSpecID}"/>
                                            <c:param name="<%=BaseSaveableReportForm.PARAM_FROM_SAVED_REPORTS%>" value="true"/>
                                        </c:url>
                                        <base:link href="${duplicateURL}" id="duplicateSavedReport_${report.jobSpecID}">
                                            <base:image src="/icons/general/duplicatereport.gif" width="19" height="16" alt='<%= MessageHelper.formatMessage("savedreports_DuplicateSavedReport") %>'/>
                                        </base:link>
                                        &nbsp;
                                        <c:url var="deleteURL" value="${form.handleURL}">
                                            <c:param name="<%=BaseSaveableReportForm.FIELD_ACTION%>" value="<%=BaseSaveableReportForm.ACTION_DELETE%>"/>
                                            <c:param name="<%=BaseSaveableReportForm.FIELD_JOB_SPEC_ID%>" value="${report.jobSpecID}"/>
                                            <c:param name="<%=BaseSaveableReportForm.PARAM_SORT_TYPE%>" value="${form.sortType}"/>
                                            <c:param name="<%=BaseSaveableReportForm.PARAM_SORT_DESCENDING%>" value="${form.sortDescending}"/>
                                        </c:url>
                                        <base:link href="${deleteURL}" id="deleteSavedReport_${report.jobSpecID}">
                                            <base:image src="/icons/general/delete.gif" width="19" height="16" alt='<%= MessageHelper.formatMessage("savedreports_DeleteSavedReport") %>' />
                                        </base:link>
                                    </td>
                                </tr>
                            </c:forEach>
                        </table>
                   </td>
                </tr>     
            </c:otherwise>
        </c:choose>
    
        <tr>
           <td>
             <base:imageLine/>
          </td>
        </tr>     
        <tr>
            <td  align="center">
              <base:helpIcons buttonsToOutput="<%=form.getHelpIcons()%>"/>
            </td>
        </tr>
    </base:outlinedTableAndTabsWithinThere>
</base:form>
