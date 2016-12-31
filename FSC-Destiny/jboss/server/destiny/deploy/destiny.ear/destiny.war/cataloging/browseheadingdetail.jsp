<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*"%>

<base:messageBox strutsErrors="true"/>

<!-- ONLY display the table if there was results passed -->
<base:form action="/cataloging/servlet/handlebrowseheadingdetailform.do" styleId="keywordList">

<html:hidden property="<%= BrowseHeadingDetailForm.PARM_SEARCH_KEY %>"/>
<html:hidden property="<%= BrowseHeadingDetailForm.PARM_SEARCH_DISPLAYABLE %>"/>
<html:hidden property="<%= BrowseHeadingDetailForm.PARM_SEARCH_TYPE %>"/>
<html:hidden property="<%= BrowseHeadingDetailForm.PARM_SITE_TYPE_ID %>"/>
<html:hidden property="<%= BrowseHeadingDetailForm.PARM_SITE_ID %>"/>
<html:hidden property="<%= BrowseHeadingDetailForm.PARM_FROM_TITLE_DETAILS %>"/>
<html:hidden property="<%=BaseSearchResultsForm.FIELD_INCLUDE_LIBRARY %>"/>
<html:hidden property="<%=BaseSearchResultsForm.FIELD_INCLUDE_MEDIA %>"/>
<html:hidden property="<%=BaseSearchResultsForm.FIELD_MEDIA_SITE_ID %>"/>
<html:hidden property="<%=BaseSearchResultsForm.FIELD_AWARD_NAME %>"/>
<html:hidden property="<%=BrowseHeadingDetailForm.PARM_TERM_1 %>"/>
<html:hidden property="<%=BrowseHeadingDetailForm.PARM_TERM_2 %>"/>
<html:hidden property="<%=BrowseHeadingDetailForm.PARM_TERM_3 %>"/>
<html:hidden property="<%=BrowseHeadingDetailForm.PARM_SEARCH_TYPE %>"/>

<% request.setAttribute("parentFormName", "cataloging_servlet_BrowseHeadingDetailForm"); %>

<jsp:include page="/cataloging/basesearchresults.jsp" flush="true" />

</base:form>
