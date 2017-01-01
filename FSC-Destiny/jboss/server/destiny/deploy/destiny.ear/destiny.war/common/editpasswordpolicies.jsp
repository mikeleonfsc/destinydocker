<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@page import="com.follett.fsc.destiny.client.common.servlet.EditPasswordPoliciesForm"%><base:messageBox strutsErrors="true"/>
<% EditPasswordPoliciesForm form = (EditPasswordPoliciesForm)request.getAttribute(EditPasswordPoliciesForm.FORM_NAME); %>

  <table align="center" width="95%"><tr><td>

<base:form action="/common/servlet/handleeditpasswordpoliciesform.do" method="post">
  <base:outlinedTable id="<%=EditPasswordPoliciesForm.TABLE_POLICY_EDIT%>" align="center" width="100%" borderColor="#C0C0C0" >
    <tr>
        <td class="SectionHeader"><%= MessageHelper.formatMessage("editpasswordpolicies_PasswordPolicies") %></td>
    </tr>
    <tr>
        <td>
            <table id="<%=EditPasswordPoliciesForm.TABLE_PASSWORD_SETTINGS%>" border="0" cellspacing="0" cellpadding="3" align="center" >
                <tr>
                    <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpasswordpolicies_StrongPasswordRequired") %></td>
                    <td><html:checkbox property="<%=EditPasswordPoliciesForm.FIELD_STRONG_PASSWORD_REQUIRED%>"/> &nbsp;&nbsp;&nbsp;</td>
                </tr>
                <tr>
                    <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpasswordpolicies_LoginExpires") %></td>
                    <td class="FormLabel">                    	
                        <html:text property='<%= EditPasswordPoliciesForm.FIELD_LOGIN_EXPIRES_IN_DAYS%>' size='6' maxlength='3' /><%= MessageHelper.formatMessage("editpasswordpolicies_number_Days") %></td>
                </tr>
                <tr>
                    <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editpasswordpolicies_LoginAttemptsAllowed") %></td>
                    <td><html:select styleId="loginAttemptsAllowedSelector" property="<%=EditPasswordPoliciesForm.FIELD_LOGIN_ATTEMPTS_ALLOWED%>" onchange="toggleLockoutDelay();">
                            <html:option value="<%=EditPasswordPoliciesForm.UNDEFINED%>"><%= MessageHelper.formatMessage("editpasswordpolicies_Unlimited") %></html:option>
                            <html:option value="2">2</html:option>
                            <html:option value="3">3</html:option>
                            <html:option value="4">4</html:option>
                            <html:option value="5">5</html:option>
                        </html:select>
                    </td>
                </tr>
                <tr>
                    <td class="FormLabel tdAlignRight">
                    <div id="lockoutText" style="<%=form.getLockoutInitialState()%>"><%= MessageHelper.formatMessage("editpasswordpolicies_LoginLockoutDelay") %></div></td>
                     <td class="FormLabel" ><div id="lockoutField" style="<%=form.getLockoutInitialState()%>">
			             <html:text property='<%=EditPasswordPoliciesForm.FIELD_LOGIN_LOCKOUT_DELAY%>' size='6' maxlength='3' /><%= MessageHelper.formatMessage("editpasswordpolicies_number_Minutes") %></div></td> 
                </tr>      
                <tr>
                    <td colspan="3" align="center" class="ColRowBold">
                    <base:saveButton />&nbsp;<base:cancelButton /></td>
                </tr>
            </table>
        </td>
    </tr>
</base:outlinedTable>
<script type="text/javascript">
            function toggleLockoutDelay( ) {
                if (document.getElementById('loginAttemptsAllowedSelector').value == "<%=EditPasswordPoliciesForm.UNDEFINED%>"){
                	   document.getElementById('lockoutText').style.display = 'none';
                	   document.getElementById('lockoutField').style.display = 'none';
                } else {
                	   document.getElementById('lockoutText').style.display = 'block';
                	   document.getElementById('lockoutField').style.display = 'block';                	                          
                }    
            }     
</script>
</base:form>
</td></tr></table>
