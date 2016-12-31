<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<% UpdateCallNumbersForm form = (UpdateCallNumbersForm)request.getAttribute(UpdateCallNumbersForm.FORM_NAME); %>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>


<c:set var="form" value="<%=request.getAttribute(UpdateCallNumbersForm.FORM_NAME)%>"/>
<bean:define id="javaForm" name="backoffice_servlet_UpdateCallNumbersForm" type="com.follett.fsc.destiny.client.backoffice.servlet.UpdateCallNumbersForm"/>

<base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handleupdatecallnumbersform.do" focus="${form.focusField}">
<html:hidden property="<%=UpdateCallNumbersForm.PARAM_CIRC_TYPE_ID %>"/>
<logic:equal name="<%=UpdateCallNumbersForm.FORM_NAME%>" property="<%=UpdateCallNumbersForm.PARAM_DISTRICT_MODE%>" value="true">
  <html:hidden property="<%=UpdateCallNumbersForm.PARAM_DISTRICT_MODE%>"/>
</logic:equal>

<base:outlinedTable borderColor ="#C0C0C0">
<tr>
  <td>
    <table id=<%= UpdateCallNumbersForm.TABLE_PATTERNS %> width="100%">
    <tr>
        <td colspan="2" class="ColHeading">
            <%= MessageHelper.formatMessage("updatecallnumbers_CirculationType") %>: ${form.circTypeName}

        </td>
    </tr>
    <tr>
        <td class="Instruction" colspan="2"><%= MessageHelper.formatMessage("updatecallnumbers_EnterAnyCallNumberPatternsThatAreUniqueToThis") %></td>
    </tr>
    <c:set var="i" value="0"/>
    <c:forEach var="pattern" items="${form.patterns}">
        <tr>
            <td class="ColRow tdAlignRight"><%= MessageHelper.formatMessage("updatecallnumbers_Pattern") %></td>
            <td>
                <input type="text" value="${pattern}" name="<%= UpdateCallNumbersForm.FIELD_PATTERN_PREFIX %>${i}" size="10" maxlength="30" />
            </td>
        </tr>
        <c:set var="i" value="${i + 1}"/>
    </c:forEach>
    <tr>
        <td>&nbsp;</td>
        <td>
            <base:genericButton src="/buttons/large/addpattern.gif" alt='<%= MessageHelper.formatMessage("addPattern") %>' name="<%= UpdateCallNumbersForm.BUTTON_ADD_PATTERN %>" />
        </td>
    </tr>
    </table>
  </td>
  <td class="tdAlignRight" valign="top">
    <table>
        <tr>
        <td class="tdAlignRight">
            <base:saveButton/><br><base:cancelButton/>
        </td>
        </tr>
    </table>
  </td>
</tr>

</base:outlinedTable>
</base:form>


