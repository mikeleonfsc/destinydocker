<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*"%>

<base:messageBox strutsErrors="true"/>

<!-- ONLY display the table if there was results passed -->
<base:form action="/cataloging/servlet/handlebookseriesresultsform.do" styleId="keywordList">

<html:hidden property="<%= BookSeriesResultsForm.PARM_SEARCH_KEY %>"/>
<html:hidden property="<%= BookSeriesResultsForm.PARM_SEARCH_KEY_DISPLAYABLE %>"/>
<html:hidden property="<%= BookSeriesResultsForm.PARM_LAST_MEDIA_SITE_ID %>"/>
<html:hidden property="<%= BookSeriesResultsForm.PARM_AT_LEAST_ONE_AVAILABLE_COPY %>"/>

<% request.setAttribute("parentFormName", BookSeriesResultsForm.FORM_NAME); %>

<jsp:include page="/cataloging/basesearchresults.jsp" flush="true">
    <jsp:param name="formName" value="<%=BookSeriesResultsForm.FORM_NAME%>"/>
</jsp:include>
</base:form>
