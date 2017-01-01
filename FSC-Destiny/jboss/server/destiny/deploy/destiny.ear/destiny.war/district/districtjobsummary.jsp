<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>

<bean:define id="form" name="district_servlet_DistrictJobSummaryForm" type="com.follett.fsc.destiny.client.district.servlet.DistrictJobSummaryForm"/>

<base:form action="/district/servlet/handledistrictjobsummaryform.do">
    <base:showReport file='<%= form.getReportFileName() %>' />
</base:form>
