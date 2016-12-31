<%@page import="com.follett.fsc.destiny.client.common.servlet.EditBlockOverrideCodeForm"%>
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

<%@page import="com.follett.fsc.destiny.client.common.servlet.EditBlockOverrideCodeForm"%>
<base:messageBox strutsErrors="true"/>
<%
EditBlockOverrideCodeForm form =
(EditBlockOverrideCodeForm)request.getAttribute(EditBlockOverrideCodeForm.FORM_NAME);
%>

<table align="center" width="95%"><tr><td>

<base:form action="/common/servlet/handleeditblockoverridecodeform.do" focus="<%= EditBlockOverrideCodeForm.FIELD_BLOCKOVERRIDECODE %>">
  <base:outlinedTable id="<%=EditBlockOverrideCodeForm.TABLE_BLOCKOVERRIDECODE_EDIT%>" align="center" width="100%" borderColor="#C0C0C0" >
    <tr>
        <td>
            <table id="<%=EditBlockOverrideCodeForm.TABLE_BLOCKOVERRIDECODE%>" border="0" cellspacing="0" cellpadding="6" align="center" width="90%">
                <tr>
                    <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("Editblockoverridecode_BlockOverrideCode") %></td>
                    <td colspan="2"><html:text
                        property="<%=EditBlockOverrideCodeForm.FIELD_BLOCKOVERRIDECODE%>"
                        size="10" maxlength="8" /></td>
                    <td class="tdAlignRight">
                       <base:saveButton />&nbsp;<base:cancelButton />
                    </td>
                </tr>
            </table>
        </td>
    </tr>
  </base:outlinedTable>
</base:form>
</td></tr></table>
