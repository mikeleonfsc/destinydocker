<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@page import="com.follett.fsc.destiny.session.backoffice.data.report.BaseReportEntry"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.data.report.ReportEntrySpecs"%>
<%@ page import="com.follett.fsc.common.StringHelper"%>

<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>



<%@page import="com.follett.fsc.destiny.session.backoffice.data.report.FollettShelfReportEntry"%><script language="JavaScript" type="text/javascript">
  <!--
   function openWindow(url,name,features) {
         var win = window.open(url,name,features);
   }
  // -->
</script>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request); 
    ReportsForm form = (ReportsForm)request.getAttribute(ReportsForm.FORM_NAME);
    int tab = form.getCurrentTab();
    int functionalArea = -1;
    int showHideCounter = 1;
%>

<%@page import="com.follett.fsc.destiny.session.district.ejb.ConfigDistrictFacadeSpecs"%>
<%@page import="com.follett.fsc.destiny.session.common.lookup.BooleanStringValue"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.data.report.OneSearchReportEntry"%>
<base:outlinedTable id="<%=ReportsForm.TABLE_NAME%>" borderColor="#c0c0c0" width="100%">
    <c:forEach items="<%= ReportEntrySpecs.REPORTS %>" var="report">
        <jsp:useBean id="report" type="com.follett.fsc.destiny.session.backoffice.data.report.BaseReportEntry"/>
        <c:if test="<%= report.getTab() == tab %>">
            <c:if test="<%= report.isVisible(store) %>">
                <c:if test="<%= report.getFunctionalArea() != functionalArea %>">
                    <% functionalArea = report.getFunctionalArea(); %>
                    <tr><td class="TableHeading" colspan="2"><%= ReportEntrySpecs.getFunctionalAreaDescription(functionalArea) %></td></tr>
                </c:if>
                <tr>
                    <td>
                        <base:imageSpacer width="25" height="1"/>
                    </td>
                    <% BooleanStringValue bsValue = null; %> 
                    <c:if test="<%= report.getLengthyTask() != ConfigDistrictFacadeSpecs.LENGTHY_TASK_NONE %>">
                        <% bsValue = ConfigDistrictFacadeSpecs.canDoLengthyTask(report.getLengthyTask()); %>
                    </c:if>
                    <td>
                        <c:choose>
                            <c:when test="<%= bsValue == null || bsValue.isBoolValue() %>">
                                <span class="ColRow">
                                    <%-- This is ungood and kludgy. If you have a problem with it, please fix it. CN/MH 1/8/2009 --%>
                                    <c:choose>
                                       <c:when test="<%= (report instanceof FollettShelfReportEntry) %>">
                                            <a id="<%=report.getId()%>" href="javascript:openWindow('<%= report.getUrlFromStore(store) %>','','width=800,height=600,scrollbars=1')">
                                                <%=report.getName()%></a>&nbsp;-&nbsp;<%= report.getDescription() %>
                                        </c:when>
                                        <c:otherwise>
                                            <c:if test="<%= report.isWrapShowHide()%>">
                                                <%
                                                String divName = "ShowHide" + showHideCounter;
                                                String jsName = "hideElement" + divName + "()";
                                                showHideCounter++;
                                                %>
                                                <base:showHideTag id="<%=divName%>">
                                                    <% showHideCounter++; %>
                                                    <base:link onclick="<%=jsName %>"  page="<%= report.getUrl() %>">
                                                        <%= report.getName() %>
                                                    </base:link>&nbsp;-&nbsp;<%= report.getDescription() %>
                                                </base:showHideTag>
                                            </c:if>
                                            <c:if test="<%= !report.isWrapShowHide()%>">
                                                <c:choose>
                                                    <c:when test="<%= report.isOpenInNewTab() %>">
                                                        <base:link id="<%=report.getId()%>" page="<%= report.getUrlFromStore(store) %>" target="_blank">
                                                            <%= report.getName() %>
                                                        </base:link>&nbsp;-&nbsp;<%= report.getDescription() %>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <base:link id="<%=report.getId()%>" page="<%= report.getUrl() %>">
                                                            <%= report.getName() %>
                                                        </base:link>&nbsp;-&nbsp;<%= report.getDescription() %>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:if>
                                        </c:otherwise>
                                    </c:choose>
                                </span>
                            </c:when>
                            <c:otherwise>
                                <span class="ColRowUnderline"><%= report.getName() %></span><span class="ColRow">&nbsp;-&nbsp;<%= report.getDescription() %></span>
                            </c:otherwise>
                        </c:choose>
                        <span class="ColRow">
                            <a name="<%= report.getId()%>" id='<%=ReportsForm.ID_DETAIL_LINK_PREFIX + report.getId() %>' href="<%=form.getShowMoreLessURL(report.getId())%>" class="DetailLink">
                                <% if (!StringHelper.isEmptyOrWhitespace(form.getShowMoreReport()) 
                                    && report.getId().equalsIgnoreCase(form.getShowMoreReport())) { %>
                                        <base:image src="/buttons/small/showless.gif" alt='<%=MessageHelper.formatMessage("less") %>' align="bottom"/>
                                <% } else { %>
                                        <base:image src="/buttons/small/showmore.gif" alt='<%=MessageHelper.formatMessage("more") %>' align="bottom"/>
                                <% } %>
                            </a>
                        </span>
                        <c:if test="<%= bsValue != null && !bsValue.isBoolValue() %>">
                            <span class="Instruction">
                                <br>
                                <base:imageSpacer width="20" height="1"/>
                                <%= bsValue.getMessage() %>
                            </span>
                        </c:if>
                    </td>
                </tr>
                    <% if (!StringHelper.isEmptyOrWhitespace(form.getShowMoreReport()) 
                            && report.getId().equalsIgnoreCase(form.getShowMoreReport())) { %>
                        <tr>
                            <td>
                                <base:imageSpacer width="25" height="1"/>
                            </td>
                            <td class="Instruction">
                                <%=report.getMoreDetails() %>
                            </td>
                        </tr>
                    <% } %>
            </c:if>        
        </c:if>
    </c:forEach>
</base:outlinedTable>
