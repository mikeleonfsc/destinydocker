<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.CirculationStatsUploadAgreementForm" %>
<%@ page import="com.follett.fsc.destiny.client.filters.VersionFilter"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>
<%
CirculationStatsUploadAgreementForm form =
(CirculationStatsUploadAgreementForm)request.getAttribute(CirculationStatsUploadAgreementForm.FORM_NAME);
%>
<br>



<html:html>

<head>
<title><bean:write name="<%=CirculationStatsUploadAgreementForm.FORM_NAME%>" filter="false" property="pageTitle"/></title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <link rel="stylesheet" type="text/css" href="<%=VersionFilter.getDestinyCSSVersionedFile() %>" />

</head>

<body bgcolor="#FFFFFF" text="#000000" topmargin="0" leftmargin="0" rightmargin="0">
<base:form action="/common/servlet/handlecirculationstatsuploadagreementform.do">

<html:hidden property="<%= CirculationStatsUploadAgreementForm.PARAM_DISTRIBUTED_ADD%>"/>

<table align="center" border="0" cellspacing="5" cellpadding="0">
  <tr>
    <td align="center">
    
        <logic:present name="<%=CirculationStatsUploadAgreementForm.FORM_NAME%>" property="licenseText">
            <bean:write name="<%=CirculationStatsUploadAgreementForm.FORM_NAME%>" filter="false" property="licenseText"/>
        </logic:present>
    </td>
  </tr>
  <tr>
    <td align="center" class="FormLabel">
        <html:submit property="<%= CirculationStatsUploadAgreementForm.BUTTON_NAME_OPT_OUT_YES %>"><%= MessageHelper.formatMessage("circulationstatsuploadagreement_Yes") %></html:submit>
        &nbsp;
        <html:submit property="<%= CirculationStatsUploadAgreementForm.BUTTON_NAME_OPT_OUT_NO %>"><%= MessageHelper.formatMessage("circulationstatsuploadagreement_No") %></html:submit>
        &nbsp;
        <html:submit property="<%= CirculationStatsUploadAgreementForm.BUTTON_NAME_OPT_OUT_LATER %>"><%= MessageHelper.formatMessage("circulationstatsuploadagreement_RemindMeLater") %></html:submit>
    </td>
  </tr>
</table>
<table align="center" border="0" cellspacing="5" cellpadding="0">
  <tr>
    <td align="center">
    
        <logic:present name="<%=CirculationStatsUploadAgreementForm.FORM_NAME%>" property="copyrightText">
            <bean:write name="<%=CirculationStatsUploadAgreementForm.FORM_NAME%>" filter="false" property="copyrightText"/>
        </logic:present>
    </td>
  </tr>
</table>
</base:form>

</body>
</html:html>
