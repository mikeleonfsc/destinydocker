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

<%@page import="com.follett.fsc.destiny.client.common.servlet.EditAASPOptionsForm"%>

<%@page import="com.follett.fsc.destiny.entity.ejb3.EmailSpecs"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.ConsortiumConfigSpecs"%>

<base:messageBox strutsErrors="true"/>
<%
EditAASPOptionsForm form =
(EditAASPOptionsForm)request.getAttribute(EditAASPOptionsForm.FORM_NAME);
%>
<jsp:include page="/common/msdewarning.jsp" flush="true" />

<table align="center" width="95%"><tr><td>
<script language="JavaScript">
<!--
 function trapEnterKey(e,place) {
        var whichCode = (window.Event) ? e.which : e.keyCode;
        if (whichCode == 13) {
            document.<%=EditAASPOptionsForm.FORM_NAME%>.<%=EditAASPOptionsForm.FIELD_TRAP_ENTER_PRESSED%>.value = "true";
        return whichCode;
      }
}
//-->
</script>

<base:form action="/common/servlet/handleeditaaspoptionsform.do" method="post">
 <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true" name="<%=EditAASPOptionsForm.BUTTON_TRAP_ENTER%>">
  <base:outlinedTable id="<%=EditAASPOptionsForm.TABLE_MAIN%>" align="center" width="100%" borderColor="#C0C0C0" >
    <tr>
        <td class="SectionHeader">Destiny Discover Settings</td>
    </tr>
    <tr>
        <td>
            <table id="<%=EditAASPOptionsForm.TABLE_SETTINGS%>" border="0" cellspacing="0" cellpadding="15" align="center">
                <tr>
                    <td class="FormLabel">Protocol
                        <html:select property="<%=EditAASPOptionsForm.FIELD_PROTOCOL%>" onkeypress="trapEnterKey(event,'save')">
                            <html:option value="false">http:</html:option>
                            <html:option value="true">https:</html:option>
                        </html:select>
                    </td>
                    <td class="FormLabel">Destiny Server External Address
                        <html:text property="<%=EditAASPOptionsForm.FIELD_HOST_NAME%>" onkeypress="trapEnterKey(event,'save')"
                        size="30" maxlength="128" /> 
                    </td>
                    <td class="FormLabel">Port
                        <html:text property="<%=EditAASPOptionsForm.FIELD_HOST_PORT%>" onkeypress="trapEnterKey(event,'save')"
                        size="5" maxlength="5" />
                    </td>
                </tr>
                <tr>
                    <td colspan="3" align="center" class="ColRowBold">
                    <base:saveButton />&nbsp;<base:cancelButton /></td>
                </tr>
            </table>
        </td>
    </tr>
    <%-- end of AASP Settings --%>
</base:outlinedTable>
</base:form>
</td></tr></table>
