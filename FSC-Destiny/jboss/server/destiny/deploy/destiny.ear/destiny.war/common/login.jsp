<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ page import="com.follett.fsc.destiny.util.DestinyColors"%>
<%@ page import="com.follett.fsc.destiny.util.RandomHelper"%>
<%@ page import="com.follett.fsc.destiny.client.common.SSOServiceHelper"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.LoginForm" %>
<%@ page import="com.follett.fsc.destiny.client.filters.DestinyFilter" %>
<%@ page import="com.follett.fsc.destiny.util.DestinyConfigProperties" %>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@ page import="java.util.HashMap"%>

<base:messageBox strutsErrors="true"/>

<c:set var="form" value="<%=request.getAttribute(LoginForm.FORM_NAME) %>"/>

<br>

<%
    LoginForm form = (LoginForm)request.getAttribute(LoginForm.FORM_NAME);
if (request.getAttribute(DestinyFilter.ATTRIBUTE_DESTINY_FILTER_LOGIN_DENY_FROM_GUEST) == null ) {

  String url = "/common/servlet/handleloginform.do";
  String focus = LoginForm.FIELD_LOGIN;
  
  if(form.isPasswordNotSecure()) {
      focus = LoginForm.FIELD_PASSWORD;
  }
  
  if(form.isShowSupportExpiredMessage()) {
      focus = "";
  }
  
%>

<base:form action='<%= url %>' focus="<%=focus%>">
<html:hidden property="<%=LoginForm.FIELD_REASON%>"/>
<html:hidden property="<%=LoginForm.FIELD_FROM_LOGIN_LINK%>"/>
<html:hidden property="<%=LoginForm.PARAM_PASSWORD_EXPIRED %>" />
<html:hidden property="<%=LoginForm.PARAM_PASSWORD_NOT_SECURE%>" />
<html:hidden property="<%=LoginForm.PARAM_RESET_GUEST %>"/>
<html:hidden property="<%=LoginForm.PARAM_GOTO_INVENTORY_SCREEN %>"/>
<html:hidden property="<%=LoginForm.PARAM_SHOW_SUPPORT_EXPIRED_MESSAGE %>"/>
<html:hidden property="<%=LoginForm.PARAM_EXPIRED_SUPPORT_MESSAGE %>"/>
<html:hidden property="<%=LoginForm.PARAM_EXPIRED_SUPPORT_FLAG %>"/>
<html:hidden property="<%=LoginForm.MIXED_MODE_BUT_USE_DESTINY_LOGIN %>"/>

<logic:equal name="<%= LoginForm.FORM_NAME %>" property="<%=LoginForm.PARAM_SHOW_SUPPORT_EXPIRED_MESSAGE%>" value="true">
    <base:imageSpacer width="1" height="3"/>
    <base:messageBox showWarningIcon="true" message='<%= MessageHelper.formatMessage("login_PleaseNoteTheFollowingLicenseInformation") %>'>
        <tr>
            <td><base:imageSpacer width="31" height="5"/></td>
            <td class="ColRow"><%= form.getExpiredSupportMessage()%></td>
        </tr>
        <tr>
            <td><base:imageSpacer width="31" height="5"/></td>
            <td>
                <span class="ColRow">
                    <br>&nbsp;&nbsp;<html:checkbox property='<%= LoginForm.FIELD_DONT_REMIND%>'><%= MessageHelper.formatMessage("login_DontRemindMeAgain") %></html:checkbox> 
                </span>
            </td>
        </tr>
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <input type="submit" name="<%=LoginForm.BUTTON_VALUE_OK%>" value="<%=LoginForm.BUTTON_VALUE_OK%>">
            </td>
        </tr>
    </base:messageBox>
</logic:equal>

<logic:equal name="<%= LoginForm.FORM_NAME %>" property="showMixedScreen" value="true">
<table id="" border="0" cellspacing="0" cellpadding="0" align="center" width="100%"><tr align="center"><td>
        <base:outlinedTable borderColor="#c0c0c0" width="65%" id="<%= LoginForm.TABLE_NAME %>">
        <tr >
        <td style = "font-weight: bold;font-size: 1.8em;color: <%=DestinyColors.BACKGROUND%>;">
            Log in Using...
        </td>
        </tr>
        <tr>
        <td>
            <!-- start mixed buttons -->
                <%= form.getMixedLoginButtons() %>
            <!-- end mixed Buttons -->
        </base:outlinedTable>
</td>
</tr>
</table>
</logic:equal>

<logic:equal name="<%= LoginForm.FORM_NAME %>" property="showMixedScreen" value="false">
<table id="" border="0" cellspacing="0" cellpadding="0" align="center" width="100%"><tr align="center"><td>
    <logic:equal name="<%= LoginForm.FORM_NAME %>" property="<%=LoginForm.PARAM_SHOW_SUPPORT_EXPIRED_MESSAGE%>" value="false">
        <base:outlinedTable  width="65%" id="<%= LoginForm.TABLE_NAME %>">
          <tr>
            <td class="FormLabel tdAlignRight" width="50%">
              <%= MessageHelper.formatMessage("login_UserName") %>:
            </td>
            <td class="tdAlignLeft">
                <input type="text" value="<%=form.getSecureString()%>" name="<%=LoginForm.FIELD_LOGIN%>" size="20" maxlength="50" autocomplete="off"/>
            </td>
          </tr>
            <c:choose>
                <c:when test="${form.passwordExpired || form.passwordNotSecure}" >
                  <tr>
                    <td class="FormLabel tdAlignRight" width="50%">
                        <%= MessageHelper.formatMessage("login_CurrentPassword") %>:
                    </td>
                    <td class="tdAlignLeft">
                        <input type="password" name="<%=LoginForm.FIELD_PASSWORD%>" size="20" maxlength="60" autocomplete="off"/>
                    </td>
                  </tr>
                  <tr>
                    <td class="FormLabel tdAlignRight">
                        <%= MessageHelper.formatMessage("login_NewPassword") %>:
                    </td>
                    <td class="tdAlignLeft">
                        <input type="password" name="<%=LoginForm.FIELD_NEW_PASSWORD%>" size="20" maxlength="60" autocomplete="off"/>
                    </td>
                  </tr>
                  <tr>
                    <td class="FormLabel tdAlignRight">
                        <%= MessageHelper.formatMessage("login_ConfirmNewPassword") %>:
                    </td>
                    <td class="tdAlignLeft">
                        <input type="password" name="<%=LoginForm.FIELD_CONFIRM_PASSWORD%>" size="20" maxlength="60" autocomplete="off"/>
                    </td>
                  </tr>
                </c:when>
                <c:otherwise>
                  <tr>
                    <td class="FormLabel tdAlignRight">
                        <%= MessageHelper.formatMessage("login_Password") %>:
                    </td>
                    <td class="tdAlignLeft">
                        <input type="password" name="<%=LoginForm.FIELD_PASSWORD%>" size="20" maxlength="60" autocomplete="off"/>
                    </td>
                  </tr>
                </c:otherwise>
            </c:choose>
          
          <% if (System.getProperty(DestinyConfigProperties.SKIP_JAVASCRIPT_CHECK) == null) { %>
             <noscript><tr><td colspan="2" align="center" class="FormLabel"><font color="#FF0000"><%= MessageHelper.formatMessage("login_YouMustEnableJavaScriptInYourBrowser") %></font></td></tr></noscript>
          <% } %>
        
          <c:if test="${!form.passwordExpired && form.store.allowUserCreateLogin && !form.store.atDistrictWarehouse}">
              <tr>    
                <td align="center" class="ColRow">
                    &nbsp;
                </td>
                <td class="ColRow tdAlignLeft">
                    <a href="/common/servlet/presentresetpasswordform.do" id="<%=LoginForm.ID_FORGOT_PASSWORD %>"><%= MessageHelper.formatMessage("login_ForgotPassword") %></a>
                </td>
              </tr>
          </c:if>
          <tr>
            <td colspan="2" align="center" class="FormElement">
                <% if (System.getProperty(DestinyConfigProperties.SKIP_JAVASCRIPT_CHECK) == null) { %>
                    <script type="text/javascript">
                    <%
                    String btnImage = UserContext.getMyContextLocaleHelper().getLocalizedImagePath("/buttons/large/login_submit.gif");
                    %>
                    
                    <!--
                        altText = '<%= MessageHelper.formatMessage("logIn") %>';
                        imgSrc = '<%=btnImage%>';
                        document.write('<input type="image" name="submit" src="' + imgSrc + '" alt="' + altText + '">');
                    //-->
                    </script>
                <% } else { %>
                    <base:genericButton name="submit" src='/buttons/large/login_submit.gif'
                        alt='<%= MessageHelper.formatMessage("logIn") %>'/>
                <% } %>
                    <logic:equal name="<%= LoginForm.FORM_NAME %>" property="showCancelButton" value="true">
                          &nbsp;
                          <base:cancelButton/>
                      </logic:equal>
            </td>
          </tr>
            <% if (form.getStore().isAllowUserCreateLogin() && !form.getStore().isAtDistrictWarehouse()) {%>
          <tr>
            <td colspan="2" align="center" class="ColRow">
                 <p>
                 Don't have an account? <a href="/common/servlet/presentcreateaccountform.do" id="<%=LoginForm.ID_CREATE_NEW_ACCOUNT %>">Create new account</a>
                 </p>
            </td>
          </tr>
          <% } %>
        </base:outlinedTable>
    </logic:equal>
</td></tr></table>
</logic:equal>
</base:form>

<% } %>
