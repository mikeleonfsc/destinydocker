<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.LicenseAgreementForm" %>
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
LicenseAgreementForm form =
(LicenseAgreementForm)request.getAttribute(LicenseAgreementForm.FORM_NAME);
%>
<br>


<html:html>

<head>
<title><bean:write name="<%=LicenseAgreementForm.FORM_NAME%>" filter="false" property="pageTitle"/></title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    
    <link rel="stylesheet" type="text/css" href="<%=VersionFilter.getDestinyCSSVersionedFile() %>" />

</head>

<body bgcolor="#FFFFFF" text="#000000" topmargin="0" leftmargin="0" rightmargin="0">
<base:form action="/common/servlet/handlelicenseagreementform.do">

<html:hidden property="<%= LicenseAgreementForm.PARAM_DISTRIBUTED_ADD%>"/>

<table align="center" border="0" cellspacing="5" cellpadding="0">
  <tr>
    <td>
        <logic:present name="<%=LicenseAgreementForm.FORM_NAME%>" property="licenseText">
            <bean:write name="<%=LicenseAgreementForm.FORM_NAME%>" filter="false" property="licenseText"/>
        </logic:present>
    </td>
  </tr>
  <tr>
    <td class="FormLabel tdAlignRight">
        <logic:equal name="common_servlet_LicenseAgreementForm" property="readOnly" value="true" scope="request" >
            <html:submit property="<%= LicenseAgreementForm.BUTTON_NAME_READ_LATER %>"><%= MessageHelper.formatMessage("licenseagreement_Close") %></html:submit>
        </logic:equal>
        <logic:notEqual name="common_servlet_LicenseAgreementForm" property="readOnly" value="true" scope="request" >
            <html:submit property="<%= LicenseAgreementForm.BUTTON_NAME_ACCEPT %>"><%= MessageHelper.formatMessage("licenseagreement_IAccept") %></html:submit>
            &nbsp;
            <html:submit property="<%= LicenseAgreementForm.BUTTON_NAME_READ_LATER %>"><%= MessageHelper.formatMessage("licenseagreement_ReadLater") %></html:submit>
        </logic:notEqual>
    </td>
  </tr>
</table>

</base:form>

</body>
</html:html>
