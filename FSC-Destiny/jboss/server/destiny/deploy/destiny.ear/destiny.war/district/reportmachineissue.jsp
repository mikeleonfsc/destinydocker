<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.district.data.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.filters.DestinyFilter" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.common.*" %>

<base:messageBox strutsErrors="true"/>

<%
    MachineChumpInfoForm form =
        (MachineChumpInfoForm)request.getAttribute("district_servlet_MachineChumpInfoForm");
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    boolean showFSCOnlyOptions = HTTPHelper.isInternalToFSC();
    String focusControl = MachineChumpInfoForm.FIELD_USER_NAME;
%>

<base:form action="/district/servlet/handlemachinechumpinfoform.do" focus="<%=focusControl%>">
    <table border="0" cellspacing="0" cellpadding="3" id="<%= MachineChumpInfoForm.TABLE_MAIN %>" width="100%">
        <tr>
            <td colspan = "2" align="center">
                Please supply the following information for the machine chumps
            </td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight">
                Your Name:
            </td>
            <td class = "ColRow">
                <html:text property="<%= MachineChumpInfoForm.FIELD_USER_NAME %>" size = "25"/>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight">
                User Logged In As:
            </td>
            <td class = "ColRow">
                <html:text property="<%= MachineChumpInfoForm.FIELD_ACCOUNT_LOGGED_IN %>" size = "25"/>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight">
                Site Logged Into:
            </td>
            <td class = "ColRow">
                <html:text property="<%= MachineChumpInfoForm.FIELD_SITE_NAME %>" size = "25"/>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight">
                Time of Error
            </td>
            <td class = "ColRow">
                <html:text property="<%= MachineChumpInfoForm.FIELD_TIME_OF_ERROR %>" size = "25"/>
            </td>
        </tr>
        <tr>
            <td class = "ColRowBold tdAlignRight" valign = "top">
                Cause of the Error (please be detailed)
            </td>
            <td class = "ColRow">
                <html:textarea property="<%= MachineChumpInfoForm.FIELD_CAUSE_OF_ERROR %>"
                               rows = "10" cols = "50">
                </html:textarea>
            </td>
        </tr>
        <tr>
            <td class = "ColRowBold tdAlignRight" valign = "top">
                JTrac entered? (enter jtrac number if you have it)
            </td>
            <td class = "ColRow">
                <html:text property="<%= MachineChumpInfoForm.FIELD_JTRAC_NUMBER %>" size = "25"/>
            </td>
        </tr>
        <tr>
            <td colspan = "2" align = "center">
                <html:submit>
                </html:submit>
            </td>
        </tr>
    </table>
</base:form>
