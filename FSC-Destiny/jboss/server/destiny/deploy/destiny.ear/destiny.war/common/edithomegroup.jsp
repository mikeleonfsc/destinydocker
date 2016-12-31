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
EditHomeGroupForm form =
(EditHomeGroupForm)request.getAttribute(EditHomeGroupForm.FORM_NAME);
%>
<base:form action="/common/servlet/handleedithomegroupform.do" focus="<%=EditHomeGroupForm.FIELD_GROUPNAME%>" method="post">
<html:hidden property="groupID"/>

<table border="0" cellspacing="0" cellpadding="3" align="center">
<tr>
    <td>
        <base:outlinedTable borderColor="#c0c0c0" id="<%=EditHomeGroupForm.TABLE_MAIN%>" width="100%">
        <tr>
            <td class="FormLabel tdAlignRight" nowrap><%= MessageHelper.formatMessage("edithomegroup_GroupName") %></td>
            <td>
              <html:text property="<%=EditHomeGroupForm.FIELD_GROUPNAME%>" size="30" maxlength="50"/>
            </td>
        </tr>

        <tr>
            <td class="FormLabel tdAlignRight" nowrap><%= MessageHelper.formatMessage("edithomegroup_SortOrder") %></td>
            <td>
                <html:text property="<%=EditHomeGroupForm.FIELD_SORTORDER%>" size="5" maxlength="2"/>
            </td>
        </tr>
        </base:outlinedTable>
    </td>
</tr>
<tr>
    <td align="center" class="ColRowBold">
        <base:showHideTag id="onSave">
            <base:saveButton onclick="hideElementonSave()" name="<%= EditHomeGroupForm.BUTTON_NAME_SAVE %>"/>
            &nbsp;
            <base:cancelButton/>
        </base:showHideTag>
    </td>
</tr>
</table>

</base:form>


