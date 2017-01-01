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
if (form == null) {
    form = (ResetPasswordForm)request.getAttribute(ResetPasswordForm.FORM_NAME);
}
%>

<%@page import="com.follett.fsc.destiny.entity.ejb3.EmailSpecs"%>
<c:set var="form" value="<%=form %>"/>
<base:messageBox strutsErrors="true"/>
<c:set var="modeCreate" value="<%=CreateAccountForm.MODE_CREATE_ACCOUNT %>"/>
<c:set var="modeReset" value="<%=CreateAccountForm.MODE_RESET_PASSWORD %>"/>
<br />
<base:form action="<%=form.getAction() %>" focus="<%= CreateAccountForm.FIELD_USERNAME %>">
<html:hidden property="page"/>
<html:hidden property="patronId"/>
<html:hidden property="firstLastName"/>
<table id="" border="0" cellspacing="0" cellpadding="0" align="center" width="100%">

<tr align="center">
    <td>
<base:outlinedTable  width="65%" id="<%= CreateAccountForm.TABLE_MAIN %>">
  <c:choose>
      <c:when test="${form.mode == modeReset}">
        <tr>
          <td class="FormHeading" colspan="2"><%= MessageHelper.formatMessage("createaccount_login_CreateYourNewPassword") %></td>
        </tr>
      </c:when>
      <c:otherwise>
        <tr>
          <td colspan="2" class="FormLabel">
            <%= MessageHelper.formatMessage("createaccount_login_CreateYourNewUserNameAndPassword") %>
          </td>
        </tr>
      </c:otherwise>
  </c:choose>
  <tr>
    <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("createaccount_login_Patron") %>:</td>
    <td class="ColRowBold"><c:out value="${form.firstLastName}" /></td>
  </tr>
  <tr>
    <td class="ColRowBold tdAlignRight">
        <%= MessageHelper.formatMessage("createaccount_login_UserName") %>
        <c:choose>
          <c:when test="${form.mode == modeReset}">
            :
          </c:when>
          <c:otherwise>
            *
          </c:otherwise>
        </c:choose>
    </td>
    <c:choose>
      <c:when test="${form.mode == modeReset}">
        <td class="ColRowBold">${form.patronValue.userValue.loginID}</td>
        <html:hidden property="<%= CreateAccountForm.FIELD_USERNAME %>" value="<%=form.getPatronValue().getUserValue().getLoginID() %>"/>
      </c:when>
      <c:otherwise>
        <td class="ColRowBold"><input type = "text" name="<%= CreateAccountForm.FIELD_USERNAME %>" value = "${form.userName}" size="30" maxlength="50" autocomplete = "off"/></td>
        
      </c:otherwise>
    </c:choose>
  </tr>
  <tr>
    <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("createaccount_login_Password") %> *</td>
    <td class="ColRowBold"><input type="password" name="<%= CreateAccountForm.FIELD_PASSWORD %>" size="30" maxlength="20"  autocomplete = "off"></td>
  </tr>
  <tr>
    <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("createaccount_login_ConfirmPassword") %> *</td>
    <td class="ColRowBold"><input type="password" name="<%= CreateAccountForm.FIELD_CONFIRM %>" size="30" maxlength="20"  autocomplete = "off"></td>
  </tr>
  <c:if test="${form.mode == modeCreate && ! form.patronHasExistingEmail}">
      <tr>
        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("createaccount_login_Email") %></td>
        <td class="ColRowBold"><input type = "text" name="<%= CreateAccountForm.FIELD_EMAIL %>" value = "${form.email}" size="30" maxlength='<%="" + EmailSpecs.EMAIL_MAX_LENGTH %>' autocomplete = "off"/></td>
      </tr>
  </c:if>
  <tr>
    <td colspan="2" class="ColRowBold tdAlignRight">
        <base:showHideTag>
            <base:saveButton onclick="hideElement()" /><base:cancelButton />
        </base:showHideTag>
    </td>
  </tr>
  <tr>
    <td colspan="2" class="Instruction">* = <%= MessageHelper.formatMessage("createaccount_login_RequiredField") %></td>
  </tr>
</base:outlinedTable>
</td></tr></table>
</base:form>
