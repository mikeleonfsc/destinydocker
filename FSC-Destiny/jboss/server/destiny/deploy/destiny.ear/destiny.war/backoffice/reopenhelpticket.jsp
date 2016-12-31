<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.ReopenHelpTicketForm"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.BaseTitleDetailForm" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>

<%
    ReopenHelpTicketForm form = (ReopenHelpTicketForm)request.getAttribute(ReopenHelpTicketForm.FORM_NAME);
%>

<base:form action="/backoffice/servlet/handlereopenhelpticketform.do">
    <base:outlinedTable id="<%=ReopenHelpTicketForm.TABLE_MAIN%>" borderColor="#C0C0C0">
        <tr>
            <td class="TableHeading" colspan="3">Reopen Ticket</td>
        </tr>
        <tr>
            <td class="ColRowBold" align="right">
                * Description
            </td>
            <td class="ColRow" align="left">
                <textarea name="<%= ReopenHelpTicketForm.FIELD_DESCRIPTION %>" rows="2" cols="25" maxlength="255"><%= form.getDescription() %></textarea>
            </td>
            <td rowspan="2" valign="top" align="right">
                <table id="tableButtons">
                    <tr>
                        <td>
                            <base:saveButton name="<%= ReopenHelpTicketForm.BUTTON_SAVE %>" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <base:cancelButton name="<%= ReopenHelpTicketForm.BUTTON_CANCEL %>" />
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight">
                * Expected Completion:
            </td>                                
            <td class="ColRowBold tdAlignleft">
                <base:date 
                    buttonName = "<%= ReopenHelpTicketForm.BUTTON_EXPECTED_COMPLETION %>"
                    fieldName = "<%= ReopenHelpTicketForm.FIELD_COMPLETION_DATE %>"
                    dateValue = "<%=form.getCompletionDate()%>"
                    altText = "<%=ReopenHelpTicketForm.ALT_EXPECTED_COMPLETION%>"
                 />
            </td>                                
        </tr>
        <tr>
            <td colspan="3">
                <span class="Instruction"
                style="color: black; font-weight: lighter;"> * = required
                    field </span>
            </td>
        </tr>
    </base:outlinedTable>
</base:form>
