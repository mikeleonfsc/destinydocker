<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%
    UpdatePatronMoveFieldsCheckForm form = (UpdatePatronMoveFieldsCheckForm)request.getAttribute(UpdatePatronMoveFieldsCheckForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true"/>
<br>

<base:outlinedTable borderColor="#C0C0C0" id="<%= UpdatePatronMoveFieldsCheckForm.TABLE_MAIN %>" width="100%">
	<tr>
		<td class="TableHeading" colspan="2"><%= form.buildTableHeading() %></td>
		<td class="tdAlignRight"><a href="javascript:window.close();"><base:image src="/buttons/large/close.gif" alt='<%= MessageHelper.formatMessage("close") %>'/></a></td>
	</tr>
	<tr>
		<td align="center" colspan="3">
		<base:messageBox showWarningIcon="false" message="<%= form.buildMessage() %>">
		</base:messageBox>
		</td>
	</tr>
	<tr>
		<td class="SmallColHeading"><%= MessageHelper.formatMessage("updatepatronmovefieldscheck_FieldName") %></td>
		<td class="ColRowBold"><%= MessageHelper.formatMessage("updatepatronmovefieldscheck_Site") %></td>
		<td></td>
	</tr>
       <logic:iterate id="item" name='<%=UpdatePatronMoveFieldsCheckForm.FORM_NAME%>' property="<%= UpdatePatronMoveFieldsCheckForm.PROPERTY_FIELD_LIST %>" type="com.follett.fsc.destiny.session.backoffice.data.PatronMoveFieldsValue">
        <base:flipper key="updatepatronmovefieldscheck">
  			<td class="ColRow">
              	<bean:write name="item" property="fieldName" filter="true" />
              </td>
  			<td class="ColRow">
              	<bean:write name="item" property="siteName" filter="true" />
			</td>
			<td>&nbsp;</td>
        </base:flipper>
      	</logic:iterate>
</base:outlinedTable>
