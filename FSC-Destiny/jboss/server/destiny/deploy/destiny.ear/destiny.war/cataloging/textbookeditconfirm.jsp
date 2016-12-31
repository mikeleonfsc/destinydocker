<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%
    TextbookEditForm form = (TextbookEditForm)request.getAttribute(TextbookEditForm.FORM_NAME);
%>
<logic:equal name="<%=TextbookEditForm.FORM_NAME%>" property="duplicateFound" value="true">
    <base:imageSpacer width="1" height="3"/>
    <base:messageBox showWarningIcon="true" message="This record may duplicate an existing textbook record.">
        <tr>
            <td><base:imageSpacer width="31" height="5"/></td>
            <td class="ColRow"><%= form.getDuplicateInfo() %></td>
        </tr>

        <tr>
            <td><base:imageSpacer width="31" height="5"/></td>
            <td colspan="2">
                <span class="ColRowBold">What do you want to do?</span>
                <span class="ColRow">
                    <br>&nbsp;&nbsp;<html:radio property="<%=TextbookEditForm.FIELD_EDIT_OPTION%>" value="<%=TextbookEditForm.EDIT_OPTION_GO_BACK%>">Go back to this record and make further changes.</html:radio>
                    <logic:notEqual name="<%=TextbookEditForm.FORM_NAME%>" property="<%=TextbookEditForm.PARAM_ACTION%>" value="<%=TextbookEditForm.PARAM_VALUE_EDIT%>">
                        <br>&nbsp;&nbsp;<html:radio property="<%=TextbookEditForm.FIELD_EDIT_OPTION%>" value="<%=TextbookEditForm.EDIT_OPTION_USE_EXISTING%>">Discard these changes and go to the existing record.</html:radio>
                        <br>&nbsp;&nbsp;<html:radio property="<%=TextbookEditForm.FIELD_EDIT_OPTION%>" value="<%=TextbookEditForm.EDIT_OPTION_SAVE_ANYWAY%>">Create a duplicate record.</html:radio>
                    </logic:notEqual>
                    <logic:equal name="<%=TextbookEditForm.FORM_NAME%>" property="<%=TextbookEditForm.PARAM_ACTION%>" value="<%=TextbookEditForm.PARAM_VALUE_EDIT%>">
                        <br>&nbsp;&nbsp;<html:radio property="<%=TextbookEditForm.FIELD_EDIT_OPTION%>" value="<%=TextbookEditForm.EDIT_OPTION_SAVE_ANYWAY%>">Save these changes anyway.</html:radio>
                    </logic:equal>
                </span>
            </td>
        </tr>
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <input type="submit" name="<%=TextbookEditForm.BUTTON_NAME_CONFIRM%>" value="<%=TextbookEditForm.BUTTON_VALUE_OK%>" id="<%=TextbookEditForm.BUTTON_NAME_CONFIRM%>">
            </td>
        </tr>
    </base:messageBox>
</logic:equal>

