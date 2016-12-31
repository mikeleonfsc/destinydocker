<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.common.DistrictTabHelper"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>


<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
%>
<base:messageBox strutsErrors="true" />
<center><span class="ColRowBold"><%= GenericForm.getLastBackupDisplayMsg(false) %></span></center><br>
<jsp:include page="/common/msdewarning.jsp" flush="true" />
    <table align="center" width="95%">
        <tr><td>
            <base:outlinedTableAndTabsWithinThere id="<%=DistrictOptionsForm.TABLE_DISTRICT_OPTIONS%>" selectedTab="<%=SystemReportsForm.TAB_REPORTS%>" tabs="<%=DistrictTabHelper.getDisplayableTabs(store)%>" align="center" width="100%">
                <jsp:include page="/common/systemreportsguts.jsp" />
            </base:outlinedTableAndTabsWithinThere>
        </td></tr>
    </table>



