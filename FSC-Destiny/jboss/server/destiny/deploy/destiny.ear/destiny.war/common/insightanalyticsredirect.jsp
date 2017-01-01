<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c"%>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn"%>
<%@page import="com.follett.fsc.destiny.client.common.servlet.InsightAnalyticsRedirectForm"%>
<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@page import="com.follett.fsc.common.LocaleHelper"%>

<base:messageBox strutsErrors="true"/> 
<%
	InsightAnalyticsRedirectForm form = (InsightAnalyticsRedirectForm) request.getAttribute(InsightAnalyticsRedirectForm.FORM_NAME);
%>

<div id = "mainBody" style = "display:none">
<base:form action="/common/servlet/handleinsightanalyticsredirectform.do">
<html:hidden property="<%=InsightAnalyticsRedirectForm.PARAM_DA_URL %>" />
    <base:outlinedTable borderColor="#c0c0c0" id="<%=InsightAnalyticsRedirectForm.TABLE_MAIN %>">
        <tr>
            <td class="TableHeading">
                <%= "Destiny Analytics" %>
            </td>
        <tr>
        <tr>
            <td class="ColRow">
                Analytics is designed to provide an interactive experience to explore and report information with dynamic dashboards and 
                visualizations, turning information into insight. For more information, please visit 
                <base:link id="<%=InsightAnalyticsRedirectForm.LINK_HELP %>" target="_blank" 
                href="http://destinyanalyticshelp.follettsoftware.com">our help</base:link> page.
            </td>
        </tr>       
        <tr>
            <td align="center" class="ColRowBold">
                <base:link id="<%=InsightAnalyticsRedirectForm.LINK_TO_DA %>" href="<%=form.gimmeEnterDestinyAnalyticsURL() %>">Access Destiny Analytics</base:link>
            </td>
        </tr>
    </base:outlinedTable>
</base:form>
</div>
<noscript>
    <div align = "center">
        <base:messageBox message='<%= "You must enable JavaScript to use Destiny Analytics" %>' showWarningIcon="true"/>
    </div>
</noscript>         
<script type="text/javascript">
<!--
    var div = document.getElementById("mainBody");
    div.style.display = "block";
    
    var daURL = document.getElementsByName("daURL")[0].value;
    if (daURL && 0 != daURL.length) {
    	window.open(daURL,"_blank");
    }
//-->
</script>
