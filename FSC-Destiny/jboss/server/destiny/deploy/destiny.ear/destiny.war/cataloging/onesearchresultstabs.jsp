
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>

<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.OneSearchResultsForm" %>

<base:messageBox strutsErrors="true"/>

<c:set var="form" value="<%=request.getAttribute(OneSearchResultsForm.FORM_NAME)%>"/>
<jsp:useBean id="form" type="com.follett.fsc.destiny.client.cataloging.servlet.OneSearchResultsForm"/>

<base:outlinedTableAndTabsWithinThere tabs="<%=form.getTabs() %>" selectedTab="<%=form.getSelectedTab()%>" tabClass="<%=form.isElementaryMode() ? OneSearchResultsForm.TAB_CLASS_ELEMENTARY : null %>">
<tr><td>
<jsp:include page="onesearchresults.jsp"/>
</td></tr>
</base:outlinedTableAndTabsWithinThere>
