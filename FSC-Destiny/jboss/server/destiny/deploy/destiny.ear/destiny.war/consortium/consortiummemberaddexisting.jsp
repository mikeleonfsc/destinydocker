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

    String formControl = "";
    if ( form.hasUnassignedDatabases() ) {
        formControl = ConsortiumMemberAddEditForm.FIELD_EDIT_CTX_NAME;
    }
%>

<base:form action="/consortium/servlet/handleconsortiummemberaddeditform.do" method="post" focus="<%=formControl %>">
<html:hidden property="<%= ConsortiumMemberAddEditForm.PARAM_ADD_TYPE %>" value="<%= ConsortiumMemberAddEditForm.TAB_EXISTING%>"/>
<table border="0" cellspacing="0" cellpadding="0" align="center" width="100%">
<tr align="center">
    <td>
        <base:outlinedTableAndTabsWithinThere align="center" selectedTab="<%=ConsortiumMemberAddEditForm.TAB_EXISTING%>" tabs="<%=ConsortiumMemberAddEditForm.tabs%>" borderColor="#c0c0c0" id="<%=ConsortiumMemberAddEditForm.TABLE_TABS %>" width="75%">
        <tr>
            <td class="TableHeading" colspan="2" ><%=form.getTabTitle() %></td>
        </tr>
        <tr>
            <td colspan="2" valign="top">
                <base:imageLine  />
            </td>
        </tr>
        <% if ( form.hasUnassignedDatabases() ) {%>        
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
                       	*Database
                    </td>
                    <td class="tdAlignLeft">
                        <%= form.getUnassignedDatabases() %>
                    </td>
                </tr>
                <tr>
                    <td class="FormLabel tdAlignRight">
                       	*Context Name
                    </td>
                    <td class="tdAlignLeft">
                      <html:text property="<%=ConsortiumMemberAddEditForm.FIELD_EDIT_CTX_NAME %>"  maxlength="80" size="30"/>
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
                            <base:saveButton onclick="hideElementonSave()"/>
                            &nbsp;
                            <base:cancelButton />
                        </base:showHideTag>                
                    </td>
                </tr>
            <% } else { %>
                    <tr>
                        <td colspan="2" align="center" class="FormLabel">                
                            No unassigned databases detected.
                        </td>
                    </tr>
             <%} %>
            
        </base:outlinedTableAndTabsWithinThere>
    </td>
</tr>
</table>

</base:form>
