<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%
    RequestTestForm form = (RequestTestForm)request.getAttribute(RequestTestForm.FORM_NAME);
%>

<base:outlinedTable width="100%">
<TR>
    <TD>
        <TABLE cellpadding="3" cellspacing="0" border="1">
            <%form.processRequest(out);%>
        </TABLE>
    </TD>
</TR>
</base:outlinedTable>
