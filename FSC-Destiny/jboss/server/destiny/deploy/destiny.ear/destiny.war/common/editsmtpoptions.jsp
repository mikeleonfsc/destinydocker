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

<%@page import="com.follett.fsc.destiny.client.common.servlet.EditSMTPOptionsForm"%>

<%@page import="com.follett.fsc.destiny.entity.ejb3.EmailSpecs"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.ConsortiumConfigSpecs"%>

<base:messageBox strutsErrors="true"/>
<%
EditSMTPOptionsForm form =
(EditSMTPOptionsForm)request.getAttribute(EditSMTPOptionsForm.FORM_NAME);
%>
<jsp:include page="/common/msdewarning.jsp" flush="true" />

<table align="center" width="95%"><tr><td>
<script language="JavaScript">
<!--
 function trapEnterKey(e,place) {
        var whichCode = (window.Event) ? e.which : e.keyCode;
        if (whichCode == 13) {
          if (place == 'test_server') {
              document.<%=EditSMTPOptionsForm.FORM_NAME%>.<%=EditSMTPOptionsForm.PARAM_WHERE_WAS_ENTER%>.value="test_server";                       
              document.<%=EditSMTPOptionsForm.FORM_NAME%>.<%=EditSMTPOptionsForm.FIELD_TRAP_ENTER_PRESSED%>.value = "true";
          } else if (place == 'test_email' ) {
              document.<%=EditSMTPOptionsForm.FORM_NAME%>.<%=EditSMTPOptionsForm.PARAM_WHERE_WAS_ENTER%>.value="test_email";                       
              document.<%=EditSMTPOptionsForm.FORM_NAME%>.<%=EditSMTPOptionsForm.FIELD_TRAP_ENTER_PRESSED%>.value = "true";
          } else {
              document.<%=EditSMTPOptionsForm.FORM_NAME%>.<%=EditSMTPOptionsForm.PARAM_WHERE_WAS_ENTER%>.value="save";                       
              document.<%=EditSMTPOptionsForm.FORM_NAME%>.<%=EditSMTPOptionsForm.FIELD_TRAP_ENTER_PRESSED%>.value = "true";
          }
        return whichCode;
      }
}
//-->
</script>

<base:form action="/common/servlet/handleeditsmtpoptionsform.do" focus="<%= EditSMTPOptionsForm.FIELD_SMTP_SERVER %>" method="post">
 <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true" name="<%=EditSMTPOptionsForm.BUTTON_TRAP_ENTER%>">
  <html:hidden property="<%=EditSMTPOptionsForm.PARAM_WHERE_WAS_ENTER%>"/>
  <html:hidden property="<%=EditSMTPOptionsForm.FIELD_TRAP_ENTER_PRESSED%>"/>
  <base:outlinedTable id="<%=EditSMTPOptionsForm.TABLE_DISTRICT_EDIT%>" align="center" width="100%" borderColor="#C0C0C0" >
    <tr>
        <td class="SectionHeader"><%= MessageHelper.formatMessage("editsmtpoptions_SMTPSettings") %></td>
    </tr>
    <tr>
        <td>
            <table id="<%=EditSMTPOptionsForm.TABLE_EMAIL_SETTINGS%>" border="0" cellspacing="0" cellpadding="6" align="center" width="90%">
                <tr>
                    <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editsmtpoptions_SMTPMailServerAddress") %></td>
                    <td colspan="2">
                        <html:text property="<%=EditSMTPOptionsForm.FIELD_SMTP_SERVER%>" onkeypress="trapEnterKey(event,'save')"
                        size="30" maxlength="128" /> &nbsp;&nbsp;&nbsp;
                        <span class="FormLabel">Port</span>
                        <html:text property="<%=EditSMTPOptionsForm.FIELD_SMTP_PORT%>" onkeypress="trapEnterKey(event,'save')"
                        size="5" maxlength="5" /> &nbsp;&nbsp;&nbsp;
                        <span class="FormLabel">Transport</span>
                         <select name="<%=EditSMTPOptionsForm.FIELD_TRANSPORT_PROTOCOL%>" id="<%=EditSMTPOptionsForm.FIELD_TRANSPORT_PROTOCOL%>" 
                                 onkeypress="trapEnterKey(event,'save')" >
                             <option value="<%=ConsortiumConfigSpecs.TRANSPORT_NONE %>" 
                                <%=((form.getTransport() == ConsortiumConfigSpecs.TRANSPORT_NONE) ? "selected=\"selected\"" : "")%> >plain text</option>
                             <option value="<%=ConsortiumConfigSpecs.TRANSPORT_SSL %>"
                                <%= ((form.getTransport() == ConsortiumConfigSpecs.TRANSPORT_SSL) ? "selected=\"selected\"" : "")%>>SSL</option>
                             <option value="<%=ConsortiumConfigSpecs.TRANSPORT_TLS %>"
                                <%= ((form.getTransport() == ConsortiumConfigSpecs.TRANSPORT_TLS) ? "selected=\"selected\"" : "")%>>TLS</option>
                         </select>
                    </td>
                </tr>
                <tr>
                    <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editsmtpoptions_AuthenticationUserID") %></td>
                    <td colspan="2"><html:text
                        property="<%=EditSMTPOptionsForm.FIELD_SMTP_USERNAME%>"
                        onkeypress="trapEnterKey(event,'save')"
                        size="20" maxlength="150" /></td>
                </tr>
                <tr>
                    <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editsmtpoptions_AuthenticationPassword") %></td>
                    <td class="ColRow" colspan="2">
                    <span style="vertical-align:top;">
                    <input type="password" name="<%=EditSMTPOptionsForm.FIELD_SMTP_PASSWORD%>" onkeypress="trapEnterKey(event,'test_server')" size="20" maxlength="150" autocomplete="off"/>
                    &nbsp;</span>
                        <span style="vertical-align:top;">
                        <base:genericButton
                        src="/buttons/large/testserver.gif"
                        name="<%= EditSMTPOptionsForm.BUTTON_NAME_TEST_SERVER %>"
                        alt='<%= MessageHelper.formatMessage("testServer") %>' />
                        </span>
                        <base:helpTag helpFileName="c_smtp_server.htm" /> 
                    </td>
                </tr>
                <tr>
                    <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editsmtpoptions_FromReplyToDisplayName") %></td>
                    <td colspan="2"><span style="vertical-align:top;"><html:text
                        property="<%=EditSMTPOptionsForm.FIELD_EMAIL_DEFAULT_REPLY_NAME%>"
                        onkeypress="trapEnterKey(event,'save')"
                        size="30" maxlength="128" /></span></td>
                </tr>
                <tr>
                    <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editsmtpoptions_FromReplyToEmail") %></td>
                    <td class="ColRow" colspan="2"><span style="vertical-align:top;"><html:text
                        property="<%=EditSMTPOptionsForm.FIELD_EMAIL_DEFAULT_REPLY_ADDRESS%>"
                        onkeypress="trapEnterKey(event,'test_email')"
                        size="30" maxlength='<%="" + EmailSpecs.EMAIL_MAX_LENGTH %>' /></span> 
                        &nbsp;
                        <span style="vertical-align:top;"><base:genericButton
                        src="/buttons/large/testemail.gif"
                        name="<%= EditSMTPOptionsForm.BUTTON_NAME_TEST_EMAIL %>"
                        alt='<%= MessageHelper.formatMessage("testEmail") %>' />
                        </span> 
                        <base:helpTag helpFileName="t_set_up_smtp_settings.htm" />
                    </td>
                </tr>
                <tr>
                    <td colspan="3" align="center" class="ColRowBold">
                    <base:saveButton />&nbsp;<base:cancelButton /></td>
                </tr>
            </table>
        </td>
    </tr>

                        <%-- end of SMTP Settings --%>
</base:outlinedTable>
</base:form>
</td></tr></table>
