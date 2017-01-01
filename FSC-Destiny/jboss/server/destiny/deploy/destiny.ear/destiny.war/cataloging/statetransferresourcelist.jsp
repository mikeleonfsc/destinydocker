<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.StateTransferResourceListForm" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.TransferForm" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    StateTransferResourceListForm form = (StateTransferResourceListForm)request.getAttribute(StateTransferResourceListForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handlestatetransferresourcelistform.do">


<table width="100%" id="<%=StateTransferResourceListForm.TABLE_MAIN %>">
<tr>
    <td colspan="2" class="TableHeading">
        To <%= ResponseUtils.filter(form.getDistrictAndSiteName()) %>
    </td>
</tr>
<tr>
    <td>
        <base:myListSelect 
            name="<%= StateTransferResourceListForm.FIELD_LIST_ID %>"
            submitOnChange="true" 
            prompt="Selected List" 
            selectedMyListID="<%=form.getListID()%>"/>
    </td>
    <td class="tdAlignRight">
        <base:genericButton src="/buttons/large/close.gif" name="<%= StateTransferResourceListForm.BUTTON_CLOSE %>" alt="Close"/>
    </td>
</tr>

<tr>
    <td colspan="2">
         <base:imageLine width="100%" />
    </td>
</tr>
<% if (form.getList().size() > 0) { %>
<tr>
    <td colspan="2">
        <table id="<%=StateTransferResourceListForm.TABLE_LIST %>" width="100%"  border="0" cellpadding="2" cellspacing="0">
            <tr>
                <td class="SmallColHeading">Title</td>
                <td class="SmallColHeading" align="center">ISBN<br/>Edition</td>
                <td class="SmallColHeading" align="center">State / Textbook<br/>ID<br/>Publisher</td>
                <td class="SmallColHeading" align="center">Copies<br/>w/o<br/>barcodes</td>
                <td class="SmallColHeading" align="center">Send</td>
                <td class="tdAlignRight">
                    <% if (form.isCopiesWOBarcodesAvailable()) { %>
                        <base:genericButton src="/buttons/small/transferall.gif"
                            name="<%= StateTransferResourceListForm.BUTTON_TRANSFER_ALL %>" alt="<%= StateTransferResourceListForm.ALT_VIEW_TRANSFER_ALL %>"
                            absbottom="true"/>
                    <% } else { %>
                        &nbsp;
                    <% } %>
                </td>
            </tr>
             <logic:iterate indexId="count" id="rec" name="<%= StateTransferResourceListForm.FORM_NAME%>" property="list" type="com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord">
                 <%
                    if ( ( count & 1 ) == 0 ) {
                        out.println("<tr bgcolor=\"#E8E8E8\">");
                    }
                    else {
                        out.println("<tr>");
                    }
                 %>
                    <%= form.renderRecordRow(rec) %>
                </tr>
             </logic:iterate>
            <tr>
                <td colspan="5">&nbsp;</td>
                <td class="tdAlignRight">
                    <% if (form.isCopiesWOBarcodesAvailable()) { %>
                        <base:genericButton src="/buttons/small/transferall.gif"
                            name="<%= StateTransferResourceListForm.BUTTON_TRANSFER_ALL %>" alt="<%= StateTransferResourceListForm.ALT_VIEW_TRANSFER_ALL %>"
                            absbottom="true"/>
                    <% } else { %>
                        &nbsp;
                    <% } %>
                </td>
            </tr>
         </table>
    </td>
</tr>
<% } else { %>
<tr><td colspan="2" class="ColRow">
Your list is empty.
</td></tr>
<% } %>

</table>
</base:form>

