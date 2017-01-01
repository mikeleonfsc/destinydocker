<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>

<%
    AddTransferRequestForm form = (AddTransferRequestForm)request.getAttribute(AddTransferRequestForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handleaddtransferrequestform.do" focus="<%=AddTransferRequestForm.FIELD_COPY_COUNT%>">
<html:hidden property="<%=AddTransferRequestForm.PARAM_BIB_ID %>" />
<html:hidden property="<%=AddTransferRequestForm.PARAM_BIB_TITLE %>" />

<base:outlinedTable borderColor="#C0C0C0" 
    id='<%= AddTransferRequestForm.TABLE_ADD_TRANSFER_REQUEST %>'>       
<tr>
<td>
<table id='<%= AddTransferRequestForm.TABLE_MAIN %>'>
            
    <tr>
        <td class="TableHeading" colspan="2">
            <%=form.getDistrictOrStateIcon() %>
            <bean:write name="<%=AddTransferRequestForm.FORM_NAME %>" property="<%=AddTransferRequestForm.PARAM_BIB_TITLE%>"/>
        </td>
    </tr>

    <tr>
        <td colspan="2">
            <base:imageLine/>
        </td>
    </tr>

    <tr>
        <td valign="top">
            <table id="<%=AddTransferRequestForm.TABLE_DATA%>">
            <tr>
                <td class="ColRowBold tdAlignRight" nowrap>
                    * # of Copies
                </td>
                <td>
                    <html:text property='<%= AddTransferRequestForm.FIELD_COPY_COUNT %>' size="8" maxlength="4"/>
                </td>
            </tr>
            <tr>
                <td class="ColRowBold tdAlignRight" nowrap>
                    * Need by
                </td>
                <td>
                    <base:date 
					        buttonName = "<%=AddTransferRequestForm.BUTTON_CALENDAR%>"
					        fieldName = "<%=AddTransferRequestForm.FIELD_NEEDED_BY%>"
					        dateValue = "<%=form.getNeededByDate() %>"
					        altText = "Date copies are needed"
					    />
                </td>
            </tr>
            <tr>    
                <td valign="top" class="ColRowBold tdAlignRight">
                    Note
                </td>        
                <td valign="top">
                    <html:textarea property='<%= AddTransferRequestForm.FIELD_NOTE %>' rows="10" cols="46"/>
                </td>
             </tr>
             </table>
        </td>
        <td valign="top">
            <table id="<%=AddTransferRequestForm.TABLE_BUTTON_HOUSE%>" cellpadding="0" cellspacing="0">
            <tr>
            <td>
                <base:saveButton/>
            </td>
            </tr>
            <tr>
            <td>
                <base:cancelButton/>
            </td>
            </tr>
            </table>
        </td>                     
    </tr>
    <tr>
        <td class="Instruction" colspan="2">
            <%=form.getLegends() %>
        </td> 
    </tr>
</table></td></tr>
</base:outlinedTable>
</base:form>
