<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.MyFavoritesForm"%>

<%@page import="com.follett.fsc.destiny.session.common.lookup.BooleanStringValue"%>
<%@page import="com.follett.fsc.destiny.session.district.ejb.ConfigDistrictFacadeSpecs"%>
<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>



<%@page import="com.follett.fsc.common.StringHelper"%><base:messageBox strutsErrors="true"/>
<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request); 
    MyFavoritesForm form = (MyFavoritesForm)request.getAttribute(MyFavoritesForm.FORM_NAME);
%>
<c:set var="form" value="<%= form %>"/>
<base:form action="/backoffice/servlet/handlemyfavoritesform.do">

<base:outlinedTable id="<%=MyFavoritesForm.TABLE_MAIN%>" borderColor='#C0C0C0'>
<% boolean showTheCSVExportOption = false; %>
<% if (showTheCSVExportOption) { %>
    <tr>
      <td class="ColRowBold" colspan="4">
      <html:checkbox property="<%= MyFavoritesForm.FIELD_WANTS_CSV_FILES %>"
                      onclick="document.backoffice_servlet_MyFavoritesForm.submit();">
         &nbsp;<%=MessageHelper.formatMessage("myfavorites_IncludeOptionForCommaseparatedFileOutputCsvForPdfReports") %>   
      </html:checkbox>
      </td>
    </tr>
<% } %>
<tr>
    <td colspan="4" background="/images/icons/general/thickline.gif" height="18" width="100%"><span class="SectionHeader">&nbsp;<%= MessageHelper.formatMessage("myfavorites_MyFavoriteReports") %>&nbsp;</span></td>
</tr>
<c:choose>
<c:when test="${empty form.favorites}">
<tr>
    <td class="ColRowBold" align="center"><%= MessageHelper.formatMessage("myfavorites_NoReportsHaveBeenMarkedAsFavorites") %></td>
</tr>    
</c:when>
<c:otherwise>
    <c:if test="${form.customReportInFavorites}">
        <% BooleanStringValue bsValue = ConfigDistrictFacadeSpecs.canDoLengthyTask(ConfigDistrictFacadeSpecs.LENGTHY_TASK_RUN_CUSTOM_REPORT, true); %>
        <c:if test="<%= !StringHelper.isEmpty(bsValue.getMessage())%>">
        <tr>
            <td class="Instruction" colspan="4">
                <%= bsValue.getMessage() %>
            </td>
        </tr>
        </c:if>
    </c:if>
<tr>
    <td class="SmallColHeading"><%= MessageHelper.formatMessage("myfavorites_Name") %></td>
    <td class="SmallColHeading"><%= MessageHelper.formatMessage("myfavorites_CreatedBy") %></td>
    <td class="SmallColHeading"><%= MessageHelper.formatMessage("myfavorites_LastRun") %></td>
    <td class="SmallColHeading">&nbsp;</td>
</tr>
<c:forEach var="report" items="${form.favorites}" varStatus="row">
<jsp:useBean id="report" type="com.follett.fsc.destiny.session.backoffice.data.BaseJobSpecRecord"/>
<c:choose>
    <c:when test="${row.index % 2 == 0}">
        <tr bgcolor="#E8E8E8">
    </c:when>
    <c:otherwise>
        <tr>
    </c:otherwise>
</c:choose>
    <td class="ColRowBold">
        <c:if test="<%=report.isSharedReport() && !form.getStore().isDistrictUser() %>">
            <base:image align="absbottom" src="/icons/general/disthome.gif"></base:image>&nbsp;
        </c:if>
        <c:out value="${report.reportName}"/>
    </td>
    <td class="ColRow"><c:out value="${report.creatorUserID != null ? report.creatorUserName : ''}"/></td>
    <td class="ColRow"><%= form.getJobViewLink(report) %></td>
    <td class="ColRow tdAlignRight"><%= form.getButtons(report) %></td>
</tr>
</c:forEach>
<tr align="center">
    <td colspan="4"><base:helpIcons buttonsToOutput='<%= form.getHelpIcons() %>'/></td>
</tr>
</c:otherwise>
</c:choose>

</base:outlinedTable>

</base:form>
