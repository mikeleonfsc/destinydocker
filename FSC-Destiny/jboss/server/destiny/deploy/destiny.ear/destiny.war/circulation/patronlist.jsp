<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.BasePatronListForm" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@page import="org.apache.struts.util.ResponseUtils"%><table id="<%= BasePatronListForm.TABLE_PATRON_HITLIST %>" width="95%" align="center" cellspacing="0" cellpadding="4">
<%@page import="java.util.List"%>
<%
	String formName = request.getParameter("formName");
	boolean districtSearch = "true".equals(request.getParameter("districtSearch"));
	BasePatronListForm form = (BasePatronListForm)request.getAttribute(formName);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
%>
<%
	boolean labelOption = form.loadConfigSite(store);
    List listOfPatrons = form.getList();
	boolean isMedia = store.isMediaBookingUser();
    boolean isMiniDestiny = store.isMiniDestiny();
%>

<%@page import="com.follett.fsc.destiny.session.backoffice.data.SitePatronDisplayInfoVO"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.data.FindSitePatronValue"%>

    <%= BasePatronListForm.buildPatronListHeader(store, districtSearch) %>

    <logic:iterate indexId="flipper" id="row" name="<%= formName %>" property="list" 
        type="com.follett.fsc.destiny.session.backoffice.data.FindSitePatronValue">
        <base:flipper key="newStyle">
            <% SitePatronDisplayInfoVO dispVO = row.getSitePatronInfo().get(0);
                FindSitePatronValue copyOfRow = row;
                
                if (store.getSiteID().equals(dispVO.getSiteID())) {
                    dispVO.setSiteShortName("");
                }
                
            %>
            <td class="ColRow"><%= form.buildPatronLink(form.getURLAction(), copyOfRow, request, response) %></td>
            <base:td clazz="ColRow" filtered="true"><%=dispVO.getPatronBarcode()%></base:td>
            <%
                if (!isMiniDestiny) {
            %>
                <%
                    if (!isMedia) {
                %>  
                   <base:td clazz="ColRow" filtered="true"><%=districtSearch ? dispVO.getHomeroom() : (labelOption ? dispVO.getUserField1() : dispVO.getHomeroom())%></base:td>
                   <base:td clazz="ColRow" filtered="true"><%=districtSearch ? dispVO.getSiteShortName() : (labelOption ? dispVO.getUserField2() : copyOfRow.getGradeLevel())%></base:td>
                <%
                    } else {
                %>
                    <base:td clazz="ColRow" filtered="true"><%=dispVO.getUserField1()%></base:td>
                    <base:td clazz="ColRow" filtered="true"><%=districtSearch ? dispVO.getSiteShortName() : dispVO.getUserField2()%></base:td>
                <% } %>
            <% } %>
        </base:flipper>
    </logic:iterate>
</table>


