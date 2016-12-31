<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.VisualSearchResultsForm"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.BaseSearchResultsForm"%>
<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handlevisualsearchresultsform.do" styleId="keywordList">
<%
    request.setAttribute("parentFormName", "cataloging_servlet_VisualSearchResultsForm");
%>

<html:hidden property="nodeID"/>
<html:hidden property="buttonName"/>
<html:hidden property="<%=VisualSearchResultsForm.PARAM_CATEGORY_SEARCH%>"/>
<html:hidden property="<%=VisualSearchResultsForm.PARAM_PUBLIC_LIST_SEARCH%>"/>
<html:hidden property="<%=BaseSearchResultsForm.PARAM_DIGITAL_CONTENT_MODE%>"/>

<jsp:include page="/cataloging/basesearchresults.jsp" flush="true"/>

</base:form>
