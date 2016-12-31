<%@page import="com.follett.fsc.destiny.client.common.servlet.GenericForm"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@ page import="com.follett.fsc.destiny.util.DestinyConfigProperties" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>


<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.buttons.OkButtonTag"%>


<%@page import="com.follett.fsc.destiny.entity.ejb3.PatronSpecs"%>
<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%><c:set var="form" value="<%=request.getAttribute(DistrictLoginForm.FORM_NAME) %>"/>
<% String focus = "loginName"; %>
<c:if test="${ form.expiredSupport}">
    <% focus = ""; %>
</c:if>
<base:form action="/district/servlet/handledistrictloginform.do" focus="<%=focus %>" method="post">
<html:hidden property="<%=DistrictLoginForm.PARAM_PASSWORD_EXPIRED %>" />
<html:hidden property="<%=DistrictLoginForm.PARAM_INSECURE_SITES %>" />
<html:hidden property="<%=DistrictLoginForm.PARAM_PASSWORD_NOT_SECURE %>" />
<html:hidden property="<%=DistrictLoginForm.PARAM_GOTO_CIRCULATION_STATS_UPLOAD_AGREEMENT_SCREEN %>" />
<html:hidden property="<%=DistrictLoginForm.PARAM_GOTO_LICENSE_SCREEN %>" />
<html:hidden property="<%=DistrictLoginForm.PARAM_EXPIRED_SUPPORT_MESSAGE %>" />
<html:hidden property="<%=DistrictLoginForm.PARAM_EXPIRED_SUPPORT_MESSAGE_FLAG %>" />
<table border="0" cellspacing="0" cellpadding="3" align="center">
        <tr>
            <td>
                <base:messageBox strutsErrors="true"/>
            </td>
        </tr>

<tr>
    <td align="center">
        <table border="0" id="<%= DistrictLoginForm.TABLE_NAME %>">
        <c:if test="${!form.showingInsecurePasswordSites && !(form.passwordExpired || form.passwordNotSecure)&& !form.expiredSupport}">
        <tr>
            <td class="FormLabel tdAlignRight">
              User Name
            </td>
            <td>
              <html:text property="loginName" size="14" maxlength='<%="" + PatronSpecs.LENGTH_LOGINID %>'/>
            </td>
        </tr>
        </c:if>
        <c:if test="${!(!form.showingInsecurePasswordSites && !(form.passwordExpired || form.passwordNotSecure))}">
            <html:hidden property="<%=DistrictLoginForm.FIELD_LOGIN_NAME %>" />
        </c:if>
        <c:choose>
            <c:when test="${!form.expiredSupport && (form.passwordExpired || form.passwordNotSecure)}" >
                <tr>
                    <td class="FormLabel tdAlignRight">
                        Current Password
                    </td>
                    <td>
                        <input type="password" name="<%=DistrictLoginForm.FIELD_PASSWORD%>" size="14" maxlength="60" autocomplete="off"/>
                    </td>
                </tr>
                <tr>
                    <td class="FormLabel tdAlignRight">
                        New Password
                    </td>
                    <td>
                        <input type="password" name="<%=DistrictLoginForm.FIELD_NEW_PASSWORD%>" size="14" maxlength="60" autocomplete="off"/>
                    </td>
                </tr>
                <tr>
                    <td class="FormLabel tdAlignRight">
                        Confirm New Password
                    </td>
                    <td>
                        <input type="password" name="<%=DistrictLoginForm.FIELD_CONFIRM_PASSWORD%>" size="14" maxlength="60" autocomplete="off"/>
                    </td>
                </tr>
            </c:when>
            <c:otherwise>
            <c:if test="${!form.showingInsecurePasswordSites && !form.expiredSupport}">
                <tr>
                    <td class="FormLabel tdAlignRight">
                        Password
                    </td>
                    <td>
                        <input type="password" name="<%=DistrictLoginForm.FIELD_PASSWORD%>" size="14" maxlength="60" autocomplete="off"/>
                    </td>
                </tr>
            </c:if>
            </c:otherwise>
        </c:choose>
       <c:if test="${!form.showingInsecurePasswordSites && !form.expiredSupport}">
        
        <% if (System.getProperty(DestinyConfigProperties.SKIP_JAVASCRIPT_CHECK) == null) { %>
            <noscript><tr><td colspan="2" align="center" class="FormLabel"><font color="#FF0000">You must enable JavaScript in your browser to log into Destiny.</font></td></tr></noscript>
        <% } %>
        <tr>
            <td colspan="2" align="center" class="FormElement">
                <% if (System.getProperty(DestinyConfigProperties.SKIP_JAVASCRIPT_CHECK) == null) { %>
                    <script type="text/javascript">
                    <!--
                    <%
                    String btnImage = UserContext.getMyContextLocaleHelper().getLocalizedImagePath("/buttons/large/login_submit.gif");
                    %>
                    
                    document.write('<input type="image" id="<%=GenericForm.ID_LOGIN%>" name="<%= DistrictLoginForm.BUTTON_NAME_LOGIN %>" src="<%=btnImage%>" alt="Log In">');
                    //-->
                    </script>
                <% } else { %>
                    <base:genericButton name="<%= DistrictLoginForm.BUTTON_NAME_LOGIN %>" src='/buttons/large/login_submit.gif'
                        alt='<%= MessageHelper.formatMessage("logIn") %>'/>
                    
                <% } %>
            </td>
        </tr>
        </c:if>
        </table>
    </td>
</tr>
</table>
</base:form>
