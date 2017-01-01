<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@page import="com.follett.fsc.destiny.client.filters.VersionFilter"%>

<html>
<head>
    <title>Digital Resource Provider Error</title>
    <link rel="stylesheet" type="text/css" href="<%=VersionFilter.getDestinyCSSVersionedFile() %>" />
</head>
<body>
    <base:messageBox strutsErrors="true"/>
</body>
</html>
