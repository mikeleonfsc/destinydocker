<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.session.cataloging.data.StateStandardsSearchVO" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.PageCalculator" %>
<%@ page import="com.follett.fsc.destiny.util.*"%>

<bean:define id="form" name="<%=StateStandardsSupportingTitlesForm.FORM_NAME%>" type="StateStandardsSupportingTitlesForm"/>

<base:messageBox strutsErrors="true"/>


<base:form action="/cataloging/servlet/handlestatestandardssupportingtitlesform.do">
<html:hidden property="<%=StateStandardsSupportingTitlesForm.FIELD_SSOID%>"/>
<html:hidden property="<%=StateStandardsSupportingTitlesForm.FIELD_STORED_PAGE%>"/>
<html:hidden property="<%=StateStandardsSupportingTitlesForm.FIELD_STORED_TOTAL_COUNT%>"/>
<% request.setAttribute("parentFormName", StateStandardsSupportingTitlesForm.FORM_NAME); %>
<jsp:include page="/cataloging/basesearchresults.jsp" flush="true" />

</base:form>
