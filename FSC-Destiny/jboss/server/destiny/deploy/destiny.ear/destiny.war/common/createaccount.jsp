<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@page import="com.follett.fsc.destiny.client.common.servlet.CreateAccountForm"%>
<%@page import="com.follett.fsc.destiny.client.common.servlet.ResetPasswordForm"%>
<%
CreateAccountForm form = (CreateAccountForm)request.getAttribute(CreateAccountForm.FORM_NAME);
String focusField = CreateAccountForm.FIELD_LAST_NAME;
if (form == null) {
    form = (ResetPasswordForm)request.getAttribute(ResetPasswordForm.FORM_NAME);
    focusField = CreateAccountForm.FIELD_USERNAME;
}
%>
<c:set var="form" value="<%=form %>"/>
<c:set var="modeCreate" value="<%=CreateAccountForm.MODE_CREATE_ACCOUNT %>"/>
<c:set var="modeReset" value="<%=CreateAccountForm.MODE_RESET_PASSWORD %>"/>
<base:messageBox strutsErrors="true"/>
<br />
<base:form action="<%=form.getAction() %>" focus="<%= focusField %>">
<html:hidden property="page"/>
<table id="" border="0" cellspacing="0" cellpadding="0" align="center" width="100%">

<tr align="center">
    <td>
<base:outlinedTable width="60%" id="<%= CreateAccountForm.TABLE_MAIN %>">
  <c:if test="${form.mode == modeReset}">
    <tr>
        <td class="FormHeading" colspan="2"><%= MessageHelper.formatMessage("createaccount_ForgotPassword") %></td>
    </tr>
  </c:if>
  <tr>
  <c:choose>
    <c:when test="${form.mode == modeReset}">
        <td class="FormLabel tdAlignRight">
          <%= MessageHelper.formatMessage("createaccount_EnterYourUserName") %>:
        </td>
        <td class="FormLabel tdAlignLeft">
            <input type = "text"  name="<%= CreateAccountForm.FIELD_USERNAME %>" maxlength="42" value = "${form.userName}" autocomplete = "off"/>
        </td>
    </c:when>
    <c:otherwise>
        <td class="FormLabel tdAlignRight">
          <%= MessageHelper.formatMessage("createaccount_EnterYourLastName") %>:
        </td>
        <td class="FormLabel tdAlignLeft">
            <input type = "text" name="<%= CreateAccountForm.FIELD_LAST_NAME %>" value = "${form.lastName}" maxlength="42" autocomplete = "off"/>
        </td>
    </c:otherwise>
  </c:choose>
  </tr>
  <tr>
    <td class="FormLabel tdAlignRight">
      <%= MessageHelper.formatMessage("createaccount_EnterYourBarcode") %>:
    </td>
    <td class="FormLabel tdAlignLeft">
        <input type = "text" name="<%= CreateAccountForm.FIELD_BARCODE %>" value = "${form.barcode}" maxlength="14" autocomplete = "off">
    </td>
  </tr>
  <tr>
    <td colspan="2" align="center" class="ColRowBold">
        <base:showHideTag>
            <base:genericButton name="<%= CreateAccountForm.BUTTON_NEXT %>" src="/buttons/large/next.gif"  alt='<%= MessageHelper.formatMessage("next") %>' onclick="hideElement()"/>
            <base:cancelButton />
        </base:showHideTag>
    </td>
  </tr>
</base:outlinedTable>
</td></tr></table>
</base:form>
