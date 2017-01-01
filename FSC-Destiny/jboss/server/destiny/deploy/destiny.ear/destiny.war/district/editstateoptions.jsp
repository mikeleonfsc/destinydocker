<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.DistrictTabHelper"%>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%
            SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
            EditStateOptionsForm form = (EditStateOptionsForm) request.getAttribute(EditStateOptionsForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true"/>
<center><span class="ColRowBold"><%=EditStateOptionsForm.getLastBackupDisplayMsg(false)%></span></center><br>
<jsp:include page="/common/msdewarning.jsp" flush="true" />
  <table align="center" width="95%"><tr><td>

<base:form action="/district/servlet/handleeditstateoptionsform.do" method="post">
  <base:outlinedTableAndTabsWithinThere id="<%=EditStateOptionsForm.TABLE_DISTRICT_EDIT%>" selectedTab="<%=EditStateOptionsForm.TAB%>" tabs="<%=DistrictTabHelper.getDisplayableTabs(store)%>" align="center" width="100%">
    <%-- start of State Fine Schedule Table --%>
    <tr>
        <td colspan="2" background="/images/icons/general/thickline.gif" height="18" width="100%">
            &nbsp;<span class="SectionHeader">State Fines Schedule</span>
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <table id="<%=EditStateOptionsForm.TABLE_STATE_FINE_SCHEDULE%>" border="0" cellspacing="0" cellpadding="3" align="center" width="400">
                <tr>
                    <td class="ColRowBold">If copy's age is</td>
                    <td class="ColRowBold">Percentage applied will be</td>
                </tr>
                <logic:iterate indexId="count" id="scheduleEntry" name="<%= EditStateOptionsForm.FORM_NAME %>" property="fineScheduleList" type="com.follett.fsc.destiny.util.lookup.LongStringLookup">
                    <tr>
                        <td class="ColRow" valign="top">
                            <%= scheduleEntry.getStringDesc() %>
                        </td>
                        <td class="ColRow" valign="top">
                            <%= scheduleEntry.getLongID().toString() %>%
                        </td>
                    </tr>
                </logic:iterate>
                <tr>
                    <td colspan="2">&nbsp;</td>
                </tr>
                <tr>
                    <td colspan="2" class="ColRow">* An age of 0 years denotes within current school year.</td>
                </tr>
                <tr>
                    <td colspan="2">&nbsp;</td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight">Contract month:</td><td class="ColRow"><%= form.getFineScheduleMonth() %></td>
                </tr>
            </table>
        </td>
    </tr>

    <tr><td>&nbsp;</td></tr>

    <%-- start of SMTP Settings --%>
    <tr>
        <td background="/images/icons/general/thickline.gif" height="18" width="100%">
            &nbsp;<span class="SectionHeader">SMTP Settings</span>
        </td>
        <td height="18">
            <base:link page="/common/servlet/presenteditsmtpoptionsform.do?districtMode=true" id="<%=EditStateOptionsForm.ID_BUTTON_SMTP_OPTIONS %>">
                <base:image src="/buttons/large/edit.gif" alt="<%=EditStateOptionsForm.ALT_BUTTON_SMTP_OPTIONS %>" align="absbottom"/>
            </base:link>
        </td>
    </tr>
    <%-- start of Password Policies --%>
    <tr>
        <td background="/images/icons/general/thickline.gif" height="18" width="100%">
            &nbsp;<span class="SectionHeader">Password Policies</span>
        </td>
        <td height="18">
            <base:link page="/common/servlet/presenteditpasswordpoliciesform.do" id="<%=DistrictOptionsForm.ID_BUTTON_PASSWORD_POLICIES %>">
                <base:image src="/buttons/large/edit.gif" alt="<%=DistrictOptionsForm.ALT_BUTTON_PASSWORD_POLICIES %>" align="absbottom"/>
            </base:link>
        </td>
    </tr>
    <tr>
        <td class="ColRow">
            <ul><li>Manage password policies.</li></ul>
            <br>
        </td>
        <td class="ColRow tdAlignRight">&nbsp;</td>
    </tr>
</base:outlinedTableAndTabsWithinThere>
</base:form>
</td></tr></table>
