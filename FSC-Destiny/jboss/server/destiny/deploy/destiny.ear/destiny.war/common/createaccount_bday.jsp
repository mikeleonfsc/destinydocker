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
String formName = CreateAccountForm.FORM_NAME;
CreateAccountForm form = (CreateAccountForm)request.getAttribute(formName);
if (form == null) {
    formName = ResetPasswordForm.FORM_NAME;
    form = (ResetPasswordForm)request.getAttribute(formName);
}
%>
<c:set var="form" value="<%=form %>"/>
<c:set var="modeCreate" value="<%=CreateAccountForm.MODE_CREATE_ACCOUNT %>"/>
<c:set var="modeReset" value="<%=CreateAccountForm.MODE_RESET_PASSWORD %>"/>
<base:messageBox strutsErrors="true"/>
<bean:define id="monthOptions" name="<%= formName %>" property="<%= CreateAccountForm.MONTH_OPTIONS %>" />
<bean:define id="dayOptions" name="<%= formName %>" property="<%= CreateAccountForm.DAY_OPTIONS %>" />
<bean:define id="yearOptions" name="<%= formName %>" property="<%= CreateAccountForm.YEAR_OPTIONS %>" />
<br />
<base:form action="<%=form.getAction() %>">
<html:hidden property="page"/>
<html:hidden property="patronId"/>
<table id="" border="0" cellspacing="0" cellpadding="0" align="center" width="100%">

<tr align="center">
    <td>
<base:outlinedTable  width="65%" id="<%= CreateAccountForm.TABLE_MAIN%>">
  <c:if test="${form.mode == modeReset}">
    <tr>
        <td class="FormHeading" colspan="2"><%= MessageHelper.formatMessage("createaccount_bday_ForgotPassword") %></td>
    </tr>
  </c:if>
  <tr>
    <td class="FormLabel tdAlignRight">
      <%= MessageHelper.formatMessage("createaccount_bday_Patron") %>:
    </td>
    <td class="FormLabel">
      <%= form.getFirstLastName() %>
    </td>
  </tr>
  <tr>
    <td class="FormLabel tdAlignRight">
      <%= MessageHelper.formatMessage("createaccount_bday_EnterYourBirthDate") %>:
    </td>
    <td class="FormLabel">
      <html:select property="<%= CreateAccountForm.FIELD_BIRTH_DATE_MONTH %>">
        <html:options collection="<%= CreateAccountForm.MONTH_OPTIONS %>" property="longID" labelProperty="stringDesc"/>
      </html:select>
      <html:select property="<%= CreateAccountForm.FIELD_BIRTH_DATE_DAY%>">
        <html:options collection="<%= CreateAccountForm.DAY_OPTIONS %>" property="longID" labelProperty="stringDesc"/>
      </html:select>
      <html:select property="<%= CreateAccountForm.FIELD_BIRTH_DATE_YEAR %>">
        <html:options collection="<%= CreateAccountForm.YEAR_OPTIONS %>" property="longID" labelProperty="stringDesc"/>
      </html:select>
    </td>
  </tr>
  <tr>
    <td colspan="2" align="center" class="ColRowBold">
        <base:showHideTag>
            <base:genericButton name="<%= CreateAccountForm.BUTTON_NEXT %>" src="/buttons/large/next.gif"  alt='<%= MessageHelper.formatMessage("next") %>' onclick="hideElement()" />
            <base:cancelButton/>
        </base:showHideTag>
    </td>
  </tr>
</base:outlinedTable>
</td></tr></table>
</base:form>
