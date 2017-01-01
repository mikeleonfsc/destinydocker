<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.client.common.servlet.*"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<base:messageBox strutsErrors="true"/>
<%
EditHomeHeaderForm form =
(EditHomeHeaderForm)request.getAttribute(EditHomeHeaderForm.FORM_NAME);
%>
<base:form action="/common/servlet/handleedithomeheaderform.do" focus="<%=EditHomeHeaderForm.FIELD_TITLE%>" method="post">
<html:hidden property="headerID"/>

<table border="0" cellspacing="0" cellpadding="3" align="center">
<tr>
    <td>
        <base:outlinedTable borderColor="#c0c0c0" id="<%=EditHomeHeaderForm.TABLE_MAIN%>" width="100%">
        <tr>
            <td class="FormLabel tdAlignRight" nowrap><%= MessageHelper.formatMessage("edithomeheader_Title") %></td>
            <td>
              <html:text property="<%=EditHomeHeaderForm.FIELD_TITLE%>" size="30" maxlength="256"/>
            </td>
        </tr>

        <tr>
            <td valign="top" class="FormLabel tdAlignRight" nowrap><%= MessageHelper.formatMessage("edithomeheader_Body") %></td>
            <td>
                <html:textarea property="<%=EditHomeHeaderForm.FIELD_BODY%>" rows="10" cols="80"/>
            </td>
        </tr>
        </base:outlinedTable>
    </td>
</tr>
<tr>
    <td align="center" class="ColRowBold">
        <base:showHideTag id="onSave">
            <base:saveButton onclick="hideElementonSave()" name="<%= EditHomeHeaderForm.BUTTON_NAME_SAVE %>"/>
            &nbsp;
            <base:cancelButton />
        </base:showHideTag>
    </td>
</tr>
</table>

</base:form>

