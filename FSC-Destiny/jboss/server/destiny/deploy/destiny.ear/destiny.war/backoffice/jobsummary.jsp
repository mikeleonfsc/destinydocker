<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.*" %>
<%@ page import="java.util.*" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%-- I18n Support --%>
<%@ taglib uri="/WEB-INF/jstl-format.tld" prefix="fmt"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>


<base:messageBox strutsErrors="true"/>
<jsp:include page="/common/messagebox.jsp?icon=warning" flush="true" />
<bean:define id="form" name="backoffice_servlet_JobSummaryForm" type="com.follett.fsc.destiny.client.backoffice.servlet.JobSummaryForm"/>

<base:form action="/backoffice/servlet/handlejobsummaryform.do">
    <base:showReport file='<%= form.getReportFileName() %>' />
</base:form>
