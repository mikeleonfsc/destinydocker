<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>

<bean:define id="form" name="<%=WebPathSupportingTitlesForm.FORM_NAME%>" type="WebPathSupportingTitlesForm"/>

<base:messageBox strutsErrors="true"/>


<base:form action="/cataloging/servlet/handlewebpathsupportingtitlesform.do">
<html:hidden property="searchString"/>
<html:hidden property="headingNumber"/>
<html:hidden property="gradeMap"/>
<html:hidden property="domainFilter"/>

<% request.setAttribute("parentFormName", WebPathSupportingTitlesForm.FORM_NAME); %>
<% request.setAttribute("wpeDisplayTabs", new Boolean(form.isDisplayTabs())); %>
<jsp:include page="/cataloging/basesearchresults.jsp" flush="true" />

</base:form>
