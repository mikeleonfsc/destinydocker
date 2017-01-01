<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>

<%
    AddTransferResourcesRequestForm form = (AddTransferResourcesRequestForm)request.getAttribute(AddTransferResourcesRequestForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handleaddtransferresourcesrequestform.do" focus="<%=AddTransferResourcesRequestForm.FIELD_COPY_COUNT%>">
<html:hidden property="<%=AddTransferResourcesRequestForm.PARAM_BIB_ID %>" />
<html:hidden property="<%=AddTransferResourcesRequestForm.PARAM_BIB_TITLE %>" />

<base:outlinedTable borderColor="#C0C0C0" 
    id='<%= AddTransferResourcesRequestForm.TABLE_ADD_TRANSFER_REQUEST %>'>       
<tr>
<td>
<table id='<%= AddTransferResourcesRequestForm.TABLE_MAIN %>'>
            
    <tr>
        <td class="TableHeading" colspan="2">
            <bean:write name="<%=AddTransferResourcesRequestForm.FORM_NAME %>" property="<%=AddTransferResourcesRequestForm.PARAM_BIB_TITLE%>"/>
        </td>
    </tr>

    <tr>
        <td colspan="2">
            <base:imageLine/>
        </td>
    </tr>

    <tr>
        <td valign="top">
            <table id="<%=AddTransferResourcesRequestForm.TABLE_DATA%>">
            <tr>
                <td class="ColRowBold tdAlignRight" nowrap>
                    * # of Items
                </td>
                <td>
                    <html:text property='<%= AddTransferResourcesRequestForm.FIELD_COPY_COUNT %>' size="8" maxlength="4"/>
                </td>
            </tr>
            <tr>
                <td class="ColRowBold tdAlignRight" nowrap>
                    * Need by
                </td>
                <td>
                    <base:date 
					        buttonName = "<%=AddTransferResourcesRequestForm.BUTTON_CALENDAR%>"
					        fieldName = "<%=AddTransferResourcesRequestForm.FIELD_NEEDED_BY%>"
					        dateValue = "<%=form.getNeededByDate() %>"
					        altText = "Date items are needed"
					    />
                </td>
            </tr>
            <tr>    
                <td valign="top" class="ColRowBold tdAlignRight">
                    Note
                </td>        
                <td valign="top">
                    <html:textarea property='<%= AddTransferResourcesRequestForm.FIELD_NOTE %>' rows="10" cols="46"/>
                </td>
             </tr>
             </table>
        </td>
        <td valign="top">
            <table id="<%=AddTransferResourcesRequestForm.TABLE_BUTTON_HOUSE%>" cellpadding="0" cellspacing="0">
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
