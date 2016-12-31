<%@page import="com.follett.fsc.destiny.client.common.servlet.GenericForm"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.LoginForm" %>


<base:messageBox strutsErrors="true"/>

<br>

<%
  String url = "/common/servlet/handleloginform.do";
%>

<base:form action='<%= url %>' focus="<%=LoginForm.FIELD_LOGIN%>">
<html:hidden property="<%=LoginForm.FIELD_REASON%>"/>
<html:hidden property="<%=LoginForm.FIELD_FROM_LOGIN_LINK%>"/>
<table align="center" border="0" cellspacing="2" cellpadding="0">
  <tr>
    <td class="FormLabel tdAlignRight" nowrap>
      User Name
    </td>
    <td>
      <input type="text" name="<%=LoginForm.FIELD_LOGIN%>" size="20" maxlength="50" autocomplete="off"/>
    </td>
  </tr>
  <tr>
    <td class="FormLabel tdAlignRight">
    Password
    </td>
    <td>
        <input type="password" name="<%=LoginForm.FIELD_PASSWORD%>" size="20" maxlength="50" autocomplete="off"/>
    </td>
  </tr>
  <tr>
    <td colspan="2" align="center" class="FormElement">
      <base:genericButton src="/buttons/large/login_submit.gif" alt="Log In" name="<%= LoginForm.BUTTON_NAME_LOGIN %>" />
    </td>
  </tr>
</table>
</base:form>
