<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>


<%
    BlockConfirmForm form = (BlockConfirmForm)request.getAttribute(BlockConfirmForm.FORM_NAME);
%>

<base:form action="/circulation/servlet/handleblockconfirmform.do" focus='<%=BlockConfirmForm.FIELD_USERNAME%>'>

    <html:hidden property="blockMessages"/>
    <html:hidden property="<%=BlockConfirmForm.OVERRIDE_USERDEFINED%>"/>
    <html:hidden property="actionBlocked"/>
    <html:hidden property="renewAll"/>
    <html:hidden property="currentPatronName"/>
    <html:hidden property="currentPatronBarcode"/>
    <html:hidden property="<%=BlockConfirmForm.PARAM_COLLECTION_TYPE%>"/>    
    
    <% 
        String message = ResponseUtils.filter(form.getCurrentPatronName());
        if ( !StringHelper.isEmpty(form.getCurrentPatronBarcode() ) ) {
            message += " (Barcode: " + ResponseUtils.filter(form.getCurrentPatronBarcode()) + ")";
        }
        message += " - Transaction blocked" +
            "<p align=\"center\">Enter authorized user's name &amp; password.</p>";
    %>
    <base:messageBox showWarningIcon="true" message="<%=message%>" filterMessage="false">
    <tr>
        <td colspan="2">
            <table align="center" border="0" cellspacing="1" cellpadding="2">
              <tr>
                <td class="FormLabel tdAlignRight">User&nbsp;Name</td>
                <td class="FormElement">
                    <input type="text" name="<%=BlockConfirmForm.FIELD_USERNAME%>" size="15" maxlength="20" autocomplete="off"/>
                </td>
              </tr>
              <tr>
                <td class="FormLabel tdAlignRight">Password</td>
                <td class="FormElement">
                    <input type="password" name="<%=BlockConfirmForm.FIELD_PASSWORD%>" size="15" maxlength="20" autocomplete="off"/>
                </td>
              </tr>
              <tr>
                <td colspan="2" align="center" class="FormElement" nowrap>
                  <base:genericButton src="/buttons/large/override.gif" alt="Override" name="<%= BlockConfirmForm.BUTTON_NAME_OVERRIDE %>" />
                  <base:cancelButton name="<%= BlockConfirmForm.BUTTON_NAME_CANCEL %>" />
                </td>
              </tr>
            </table>
        </td>
    </tr>
    </base:messageBox>
</base:form>
