<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>

<%@ page isErrorPage="true" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<head>
<title><%= MessageHelper.formatMessage("unsupporteddevice_UnsupportedDevice") %></title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/common/minidestiny.css" />

</head>
<body bgcolor="#FFFFFF" text="#000000" topmargin="0" leftmargin="0" rightmargin="0">
    <br/>
    <br/>
    <br/>
    <br/>
    <br/>
    <table border="0" width="100%">
    <tr><td width="100%" align="Center">
        <base:messageBox showRedBorder="true">
        <tr>
            <td valign="top">
                <%=MessageBoxTag.getCAUTION_IMAGE_HTML()%>
            </td>
            <td valign="baseline" align="center" class="ColRowBold"><%= MessageHelper.formatMessage("unsupporteddevice_YourDeviceIsNotSupportedByDestiny") %></td>
        </tr>
        </base:messageBox>
    </td></tr>
    </table>
</body>
