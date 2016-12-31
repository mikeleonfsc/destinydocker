<%@page import="com.follett.fsc.destiny.client.common.servlet.GenericForm"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@ page import="com.follett.fsc.destiny.util.DestinyConfigProperties" %>
<%@ page import="com.follett.fsc.destiny.client.consortium.servlet.*" %>


<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%><base:messageBox strutsErrors="true"/>

<c:set var="form" value="<%=request.getAttribute(ConsortiumLoginForm.FORM_NAME) %>"/>
<%
    ConsortiumLoginForm cLform = (ConsortiumLoginForm)request.getAttribute( ConsortiumLoginForm.FORM_NAME );
%>
<base:form action="/consortium/servlet/handleconsortiumloginform.do" focus="<%=ConsortiumLoginForm.FIELD_LOGIN_NAME %>" method="post">
<html:hidden property="<%=ConsortiumLoginForm.PARAM_PASSWORD_EXPIRED %>" />
<html:hidden property="<%=ConsortiumLoginForm.PARAM_PASSWORD_NOT_SECURE%>" />

<table border="0" cellspacing="0" cellpadding="3" align="center">
<c:if test="${!form.showingInsecurePasswordDistricts}">
<tr>
    <td class="ColRow" align="center">
    You must be a super administrator to update the members in this installation.
    </td>
</tr>
</c:if>
<tr>
    <td align="center">
        <table border="0" id="<%= ConsortiumLoginForm.TABLE_NAME %>">
        <c:if test="${!form.showingInsecurePasswordDistricts}">
        <tr>
            <td class="FormLabel tdAlignRight">
              User Name
            </td>
            <td class="tdAlignLeft">
              <input type="text" name="<%=ConsortiumLoginForm.FIELD_LOGIN_NAME%>" size="14" maxlength="20" autocomplete="off"/>              
            </td>
        </tr>
        </c:if>
        <c:choose>
            <c:when test="${form.passwordExpired || form.passwordNotSecure}" >
                <tr>
                    <td class="FormLabel tdAlignRight">
                        Current Password
                    </td>
                    <td class="tdAlignLeft">
                        <input type="password" name="<%=ConsortiumLoginForm.FIELD_PASSWORD%>" size="14" maxlength="60" autocomplete="off"/>                        
                    </td>
                </tr>
                <tr>
                    <td class="FormLabel tdAlignRight">
                        New Password
                    </td>
                    <td class="tdAlignLeft">
                        <input type="password" name="<%=ConsortiumLoginForm.FIELD_NEW_PASSWORD%>" size="14" maxlength="60" autocomplete="off"/>
                    </td>
                </tr>
                <tr>
                    <td class="FormLabel tdAlignRight">
                        Confirm New Password
                    </td>
                    <td class="tdAlignLeft">
                        <input type="password" name="<%=ConsortiumLoginForm.FIELD_CONFIRM_PASSWORD%>" size="14" maxlength="60" autocomplete="off"/>
                    </td>
                </tr>
            </c:when>
            <c:otherwise>
            <c:if test="${!form.showingInsecurePasswordDistricts}">
                <tr>
                    <td class="FormLabel tdAlignRight">
                        Password
                    </td>
                    <td class="tdAlignLeft">
                        <input type="password" name="<%=ConsortiumLoginForm.FIELD_PASSWORD%>" size="14" maxlength="60" autocomplete="off"/>
                    </td>
                </tr>
            </c:if>
            </c:otherwise>
        </c:choose>
        
        
        <% if (System.getProperty(DestinyConfigProperties.SKIP_JAVASCRIPT_CHECK) == null) { %>
            <noscript><tr><td colspan="2" align="center" class="FormLabel"><font color="#FF0000">You must enable JavaScript in your browser to log into Destiny.</font></td></tr></noscript>
        <% } %>
       <c:if test="${!form.showingInsecurePasswordDistricts}">
        <tr>
            <td colspan="2" align="center" class="FormElement">
                <% if (System.getProperty(DestinyConfigProperties.SKIP_JAVASCRIPT_CHECK) == null) { %>
                    <script type="text/javascript">
                    <%
                        String btnImage = UserContext.getMyContextLocaleHelper().getLocalizedImagePath("/buttons/large/login_submit.gif");
                    %>
                    <!--
                        document.write("<input type='image' id='<%=GenericForm.ID_LOGIN%>' name='<%= ConsortiumLoginForm.BUTTON_NAME_LOGIN %>' src='<%=btnImage%>' alt='<%= MessageHelper.formatMessage("logIn") %>'>");
                    //-->
                    </script>
                <% } else { %>
                    <base:genericButton name="<%= ConsortiumLoginForm.BUTTON_NAME_LOGIN %>" src='/buttons/large/login_submit.gif'
                        alt='<%= MessageHelper.formatMessage("logIn") %>'/>
                    
                <% } %>
                &nbsp;
                <base:cancelButton name="<%= ConsortiumLoginForm.BUTTON_NAME_CANCEL %>" />
            </td>
        </tr>
        </c:if>
        <tr>
            <td colspan="2" align="center" class="FormElement">
                <c:if test="${form.showingInsecurePasswordDistricts}">
                    <base:okButton/>
                </c:if>
            </td>
        </tr>
        </table>

    </td>
</tr>
</table>

</base:form>
