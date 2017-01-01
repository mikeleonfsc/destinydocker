<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.ExtractPatronInfoForm"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.data.ExtractPatronParams"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>


<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>


<base:messageBox strutsErrors="true"/>

<%
    ExtractPatronInfoForm form = (ExtractPatronInfoForm)request.getAttribute(ExtractPatronInfoForm.FORM_NAME);
%>
<base:form action="/backoffice/servlet/handleextractpatroninfoform.do">
<html:hidden property="<%=ExtractPatronInfoForm.PARAM_DROP_DOWN_CHANGE%>" value="false" />

<script language="JavaScript" type="text/javascript">
  <!--
    function submitDropDown() {
        document.<%=ExtractPatronInfoForm.FORM_NAME%>.<%=ExtractPatronInfoForm.PARAM_DROP_DOWN_CHANGE%>.value = "true";
        document.<%=ExtractPatronInfoForm.FORM_NAME%>.submit();
    }
  // -->
</script>


<base:outlinedTable id="<%=ExtractPatronInfoForm.TABLE_MAIN%>" borderColor='#C0C0C0'>

<tr>
	<td class="TableHeading"><%= MessageHelper.formatMessage("extractpatroninfo_ExtractPatronData") %></td>
</tr>

<tr>
    <td class="TableHeading">
        <IMG height="1" vspace="1" src="/images/icons/general/line.gif" width="100%">
    </td>
</tr>

<tr>
	<td class="ColRowBold">
        <%=form.gimmeDropDown()%>&nbsp;<%= MessageHelper.formatMessage("extractpatroninfo_From") %><% if ( form.getSelectBy() == ExtractPatronParams.SELECT_BY_HOMEROOM ) { %>
        <%=form.renderHomeroomDropDown(true) %>
        <% } else { %> 
        <html:text property="<%= ExtractPatronInfoForm.FIELD_SELECT_BY_START %>" />
        <% }%><%= MessageHelper.formatMessage("extractpatroninfo_To") %><% if ( form.getSelectBy() == ExtractPatronParams.SELECT_BY_HOMEROOM ) { %>
        <%=form.renderHomeroomDropDown(false) %>
        <% } else { %> 
        <html:text property="<%= ExtractPatronInfoForm.FIELD_SELECT_BY_END %>" />
        <% }%> 
	</td>
</tr>

<tr>
    <td class="TableHeading">
        <IMG height="1" vspace="1" src="/images/icons/general/line.gif" width="100%">
    </td>
</tr>

<tr>
<td align='center'><base:genericShowHideButton alt='<%= MessageHelper.formatMessage("extract") %>' name="<%=ExtractPatronInfoForm.BUTTON_EXTRACT %>" src="/buttons/large/extract.gif"/></td>
</tr>


</base:outlinedTable>
</base:form>

