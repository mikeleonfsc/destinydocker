<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<%@ page import="com.follett.fsc.destiny.client.consortium.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag" %>

<base:messageBox strutsErrors="true"/>

<%
    ConsortiumMemberAddEditForm form = (ConsortiumMemberAddEditForm) request.getAttribute(ConsortiumMemberAddEditForm.FORM_NAME);
%>

<base:form action="/consortium/servlet/handleconsortiummemberaddeditform.do" method="post" focus="<%=ConsortiumMemberAddEditForm.FIELD_DISTRICT_NAME %>">
<html:hidden property="customerNumber" />
<html:hidden property="editContextName" />
<html:hidden property="database" />



<table border="0" cellspacing="0" cellpadding="0" align="center">
<tr>
    <td>
        <base:outlinedTable borderColor="#c0c0c0" id="consortiumTable" width="100%">
            <tr>
                <td class="FormLabel tdAlignRight">
                    *Name
                </td>
                <td class="ColRow tdAlignLeft">
                    <logic:equal name="<%=ConsortiumMemberAddEditForm.FORM_NAME%>" property="<%=ConsortiumMemberAddEditForm.PARAM_STATE_REPOSITORY %>" value="true">
                        <%= form.getDistrictName() %>
                        <html:hidden property="<%=ConsortiumMemberAddEditForm.FIELD_DISTRICT_NAME %>"/>
                    </logic:equal>
                    <logic:equal name="<%=ConsortiumMemberAddEditForm.FORM_NAME%>" property="<%=ConsortiumMemberAddEditForm.PARAM_STATE_REPOSITORY %>" value="false">
                        <html:text property="<%=ConsortiumMemberAddEditForm.FIELD_DISTRICT_NAME %>" maxlength="80" size="30"/>
                    </logic:equal>
                    &nbsp;&nbsp;
                    <logic:equal name="<%=ConsortiumMemberAddEditForm.FORM_NAME%>" property="<%=ConsortiumMemberAddEditForm.PARAM_ALLOW_DISABLE_MEMBER%>" value="true">
                        <html:checkbox property="<%= ConsortiumMemberAddEditForm.FIELD_DISABLED%>">Disabled</html:checkbox>
                    </logic:equal>
                    <logic:equal name="<%=ConsortiumMemberAddEditForm.FORM_NAME%>" property="<%=ConsortiumMemberAddEditForm.PARAM_ALLOW_DISABLE_MEMBER%>" value="false">
                        <html:hidden property="<%= ConsortiumMemberAddEditForm.FIELD_DISABLED%>"/>
                    </logic:equal>
                </td>
            </tr>
            <tr>
                <td class="FormLabel tdAlignRight">
                   	Group
                </td>
                <td class="tdAlignLeft">
                  <%=form.getGroupDropDown() %>
                </td>
            </tr>
            <tr>
                <td class="FormLabel tdAlignRight">
                   	Database 
                </td>
                <td class="ColRow tdAlignLeft">
                  <%= form.getDatabase() %>
                </td>
            </tr>
            <tr>
                <td class="FormLabel tdAlignRight">
                   	Context Name 
                </td>
                <td class="ColRow tdAlignLeft">
                  <%= form.getEditContextName() %>
                </td>
            </tr>
            <tr>
                <td colspan="2" class="Instruction">
                    * = Required Field
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center" class="ColRowBold">
                    <base:showHideTag id="onSave">
                        <base:saveButton onclick="hideElementonSave()" name="<%=SaveButtonTag.BUTTON_NAME %>"/>
                        &nbsp;
                        <base:cancelButton/>
                    </base:showHideTag>                
                </td>
            </tr>
        </base:outlinedTable>
    </td>
</tr>
</table>

</base:form>
