<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.WPESearchForm" %>
<%@ page import="com.follett.fsc.destiny.util.webpathsearch.WebPathSearch"%>
<%@page import="com.follett.fsc.destiny.client.filters.VersionFilter"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    WPESearchForm form = (WPESearchForm)request.getAttribute(WPESearchForm.FORM_NAME);
%>
<c:set var="form" value="<%= form %>"/>
<c:set var="baseThemeImageURL" value="<%=WebPathSearch.getBaseThemeAndSpotlightImageURL(form.getStore().getSiteCustomerNumber()) %>"/>


<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@page import="com.follett.fsc.common.MessageHelper"%><html>
<head>
    <title>${form.spotlightImageTitle}</title>
    <link rel="stylesheet" type="text/css" href="<%=VersionFilter.getDestinyCSSVersionedFile() %>" />
</head>

<script type="text/javascript">
// <!--
    function closeWindow() {
        window.close();
    }
// -->
</script>

<base:form action="/cataloging/servlet/handlewpesearchform.do">
<table id="<%=WPESearchForm.TABLE_SPOTLIGHT_IMAGE %>" cellpadding="10" width="100%">
    <tr>
        <td align="center" class="FormHeading">
            ${form.spotlightImageTitle}
        </td>
    </tr>
    <tr>
        <td align="center">
            <c:choose>
                <c:when test="<%=form.isFilenameAURL(form.getSpotlightImageFileName()) %>">
                    <base:imagePassThrough onlineServiceURL="${form.spotlightImageFileName}" />
                </c:when>
                <c:otherwise>
                    <base:imagePassThrough onlineServiceURL="${baseThemeImageURL}${form.spotlightImageFileName}" />
                </c:otherwise>
            </c:choose>
        </td>
    </tr>
    <tr>
        <td align="center">
            <%=JSPHelper.createImgTagBuilder("/buttons/large/closex.gif", MessageHelper.formatMessage("wpespotlightimage_Close")).andSetOnClick("closeWindow();").render() %>
        </td>
    </tr>
</table>
</base:form>
</html>
