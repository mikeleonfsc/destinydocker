<%@page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c"%>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.UniversalDiscoveryWelcomeForm"%>
<%@page import="com.follett.fsc.common.MessageHelper"%>

<base:messageBox strutsErrors="true"/>
<%
    String formName = (String)request.getAttribute(UniversalDiscoveryWelcomeForm.ATTRIBUTE_FORM_NAME);
    UniversalDiscoveryWelcomeForm form = (UniversalDiscoveryWelcomeForm)request.getAttribute(formName);
%>

<%
    if (form.isInvalidBrowser()) {
%>
    <base:messageBox showRedBorder="true">
        <tr valign="left">
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td class="ColRowBold" align="left">
        <% if (form.isIeCompatibilityMode()) { %>
        <%= MessageHelper.formatMessage("universaldiscoverywelcome_YourBrowserIsInCompatibilityModeAndDoesNotMeetTheRequirementsToAccessThisFeaturePleaseTurnOffCompatibilityMode") %>
        <% } else { %>
                    <%= MessageHelper.formatMessage("universaldiscoverywelcome_YourBrowserDoesNotMeetTheRequirementsToAccessThisFeature") %>
                    <base:destinyHelpLink page="<%= UniversalDiscoveryWelcomeForm.HELP_LINK_BROWSER_SPECS %>">
                    <%= MessageHelper.formatMessage("universaldiscoverywelcome_PleaseReviewTheMinimumBrowserRequirements") %>
                    </base:destinyHelpLink>
        <% } %>
                </td>
        </tr>
    </base:messageBox>
<%        
    } else  {
%>
<div id = "mainBody" style = "display:none">
<base:form action="<%= form.getParentFormAction() %>">
<html:hidden property="<%=UniversalDiscoveryWelcomeForm.PARAM_RETURNING_FROM_UD %>" />
<html:hidden property="<%=UniversalDiscoveryWelcomeForm.PARAM_ERROR_ACCESSING_US %>" />
    <base:outlinedTable borderColor="#c0c0c0" id="<%=UniversalDiscoveryWelcomeForm.TABLE_MAIN %>">
        <tr>
            <td class="TableHeading">
                Destiny Discover
            </td>
        </tr>
        <tr>
            <td class="ColRow">
                Destiny Discover is your gateway to all your educational resources including Books, eBooks, Databases and Websites. For more information, please visit <base:link id="<%=UniversalDiscoveryWelcomeForm.LINK_HELP %>" target="_blank" href="http://universalsearchhelp.follettsoftware.com">our help</base:link> page.
                <%-- @todo RS/ES Add this link - This link needs to be versioned so it will point to the correct place --%>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold" align="center">
                <base:link id="<%=UniversalDiscoveryWelcomeForm.LINK_TO_UD %>" href="<%=form.getEnterUniversalDiscoveryURL() %>">Access Destiny Discover</base:link>
            </td>
        </tr>
    </base:outlinedTable>
</base:form>
</div>
<noscript>
    <div align = "center">
        <base:messageBox message='<%= MessageHelper.formatMessage("universaldiscoverywelcome_YouMustEnableJavascriptToUseDestinyDiscover") %>' showWarningIcon="true"/>
    </div>
</noscript> 
<script type="text/javascript">
<!--
    var div = document.getElementById("mainBody");
    div.style.display = "block";
    var returnFromUD = document.getElementsByName("returningFromUD")[0].value;
    var error = document.getElementsByName("errorAccessingUS")[0].value;
    if (returnFromUD == "false" && error == "false") {
    	document.<%=UniversalDiscoveryWelcomeForm.FORM_NAME%>.submit();
    }
//-->
</script>
<%
    }
%>

