<%@page import="com.follett.fsc.common.StringHelper"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LoginFacadeSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.session.circulation.ejb.*" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>

<bean:define id="list" name="backoffice_servlet_CollectionStatsDistrictByLibraryForm" property="list" type="Collection"/>

<base:messageBox strutsErrors="true"/>
<%
    CollectionStatsDistrictByLibraryForm form = (CollectionStatsDistrictByLibraryForm)request.getAttribute(CollectionStatsDistrictByLibraryForm.FORM_NAME); 
    SessionStoreProxy handle = SessionStoreProxy.getSessionStore( session, request );
    String siteName =  (String)handle.getProperty( LoginFacadeSpecs.SITE_DISPLAY_NAME );
    if (siteName == null) {
        siteName = "";
    }
%>

<base:form action="/backoffice/servlet/handlecollectionstatsdistrictbylibraryform.do">
<html:hidden property="<%=CollectionStatsDistrictByLibraryForm.FIELD_SELECTED_TAB %>"/>

<%-- Yes there is a reason we did this funky thing with the closing '>'s.  Prevents gaps in the tabs. --%>
    <base:outlinedTableAndTabsWithinThere hideBorderAndTabs="<%=form.isPrint() %>" id="<%=CollectionStatsDistrictByLibraryForm.TABLE_TABS %>" width="100%" selectedTabID="<%= form.getSelectedTab() %>" selectedTab="<%= form.getSelectedTab() %>" tabs="<%=form.getTabs() %>">
        <tr><td>
        <% if (!CollectionStatsDistrictByLibraryForm.ID_TAB_BATCH.equals(form.getSelectedTab())) { %>
            <table id="<%=CollectionStatsDistrictByLibraryForm.TABLE_PRINTER_FRIENDLY_HEADER%>" width="100%" border="0" cellspacing="0" cellpadding="2">
            <% if (!form.isBlankReport()) { %>
                <% if ( !form.isPrint() ) { %>
                <tr>
                    <td class="SmallColRow">
                        <html:checkbox property="<%= CollectionStatsDistrictByLibraryForm.FIELD_GROUP_BY_LIBRARY_TYPE %>" onclick="this.form.submit()"><%= MessageHelper.formatMessage("collectionstatsdistrictbylibraryframe_GroupSitesByType") %></html:checkbox>
                    </td>
                    <td class="SmallColRow tdAlignRight">
                    <base:spanIfNotAllowed permission='<%=Permission.DISTRICT_CREATE_DISTRICT_REPORTS%>'>
                        <logic:equal name="backoffice_servlet_CollectionStatsDistrictByLibraryForm" property="<%= CollectionStatsDistrictByLibraryForm.FIELD_SELECTED_TAB %>" value="<%= String.valueOf(CollectionStatsDistrictByLibraryForm.ID_TAB_CIRCULATION) %>" ><%= MessageHelper.formatMessage("collectionstatsdistrictbylibraryframe_DeweyStuff") %></logic:equal>
                    </base:spanIfNotAllowed>
                    &nbsp;</td>
                    <td class="SmallColRow tdAlignRight">
                        <base:link page='<%= form.getPrinterLink("/backoffice/servlet/handlecollectionstatsdistrictbylibraryform.do")%>' target="printerFriendly" id="<%=CollectionStatsDistrictByLibraryForm.ID_PRINTER_FRIENDLY %>"><base:image src="/buttons/small/printerfriendly.gif" alt='<%=MessageHelper.formatMessage("printable") %>' />
                        </base:link>
                    </td>
                <% } else { %>
                    <td class="MainHeader" align="center"><%=siteName%></td>
                </tr>
                <% } %>
                <% if (!StringHelper.isEmptyOrWhitespace(form.getBatchMessage())) { %> 
                <tr>
                    <td class="ColRowBold" align="center" colspan="3">
                        <%=form.getBatchMessage() %>
                    </td>
                </tr>
                <% } %>
                <% if (form.isPrint()) { %>
                <tr>
                    <td class="SmallColHeading" align="center">
                    <%=form.getPrinterFriendlyPageTitle() %>
                    </td>
                </tr>
                <tr>
                    <td class="ColRow" align="center">
                    <%=form.getPrinterFriendlySubTitle() %>
                    </td>
                </tr>
                <% } %>
    
            <% } %>
            </table>
        
        <% } %>

        <% if (CollectionStatsDistrictByLibraryForm.ID_TAB_CIRCULATION.equals(form.getSelectedTab())) { %>
            <% if (!form.isBlankReport()) { %>
                <jsp:include page="/backoffice/collectionstatsdistrictbylibrarycirc.jsp" flush="true"/>
            <% } %>
        <% } else if (CollectionStatsDistrictByLibraryForm.ID_TAB_AGE.equals(form.getSelectedTab())) { %>
            <% if (!form.isBlankReport()) { %>
                <jsp:include page="/backoffice/collectionstatsdistrictbylibraryage.jsp" flush="true"/>
            <% } %>
        <% } else if (CollectionStatsDistrictByLibraryForm.ID_TAB_VALUE.equals(form.getSelectedTab())) { %>
            <% if (!form.isBlankReport()) { %>
                <jsp:include page="/backoffice/collectionstatsdistrictbylibraryvalue.jsp" flush="true"/>
            <% } %>
        <% } else if (CollectionStatsDistrictByLibraryForm.ID_TAB_BATCH.equals(form.getSelectedTab())) { %>
            <jsp:include page="/backoffice/collectionstatsdistrictbylibrarybatch.jsp" flush="true"/>
        <% } %>
        </td></tr>
    </base:outlinedTableAndTabsWithinThere>

</base:form>
