<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>


<%@page import="com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag"%>
<%@page import="com.follett.fsc.common.MessageHelper"%><base:messageBox strutsErrors="true"/>

<%
    TextbookLedgerAdjustmentForm form = (TextbookLedgerAdjustmentForm)request.getAttribute(TextbookLedgerAdjustmentForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
%>

<c:set var="form" value="<%=form %>" />
<c:set var="store" value="<%=store %>" />


<base:form action="/backoffice/servlet/handletextbookledgeradjustmentform.do" focus="<%=TextbookLedgerAdjustmentForm.FIELD_DESCRIPTION %>">
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true" name="trapEnterKey">
<html:hidden property="<%=TextbookLedgerAdjustmentForm.PARAM_SITE_ID %>"/>
<html:hidden property="<%=TextbookLedgerAdjustmentForm.PARAM_ID_TO_EDIT %>"/>

<base:outlinedTable borderColor="#C0C0C0" id="<%=TextbookLedgerAdjustmentForm.TABLE_MAIN %>" width="100%">
<tr>
    <td colspan="2" class="TableHeading">
        Adjustment for ${form.memberAndSiteName}
    </td>
</tr>
<tr>
    <td colspan="2">
        <base:imageLine width="100%" />
    </td>
</tr>
<tr>
    <td class="ColRowBold tdAlignRight">
        *Description
    </td>
    <td>
        <html:text property="<%=TextbookLedgerAdjustmentForm.FIELD_DESCRIPTION %>" size="50" maxlength="50" />
    </td>
</tr>
<tr>
    <td class="ColRowBold tdAlignRight">
        *Date
    </td>
    <td>
        <base:date 
            buttonName = "<%=TextbookLedgerAdjustmentForm.BUTTON_CHANGE_DATE%>"
            fieldName = "<%=TextbookLedgerAdjustmentForm.FIELD_CREATED_DATE%>"
            dateValue = "<%=form.getCreatedDate() %>"
            altText = "Change Created Date"
         />
    </td>
</tr>
<tr>
    <td class="ColRowBold tdAlignRight">
        *Amount
    </td>
    <td class="ColRowBold">
        <html:select property="<%=TextbookLedgerAdjustmentForm.FIELD_AMOUNT_TYPE %>">
            <html:option value="<%= String.valueOf(TextbookLedgerAdjustmentForm.AMOUNT_TYPE_CHARGE) %>">Charge</html:option>
            <html:option value="<%= String.valueOf(TextbookLedgerAdjustmentForm.AMOUNT_TYPE_CREDIT) %>">Credit</html:option>
        </html:select>
        &nbsp;
        <html:text property="<%=TextbookLedgerAdjustmentForm.FIELD_AMOUNT %>" size="15" maxlength="15" />
    </td>
</tr>
<tr>
    <td class="ColRowBold tdAlignRight">
        *School Year
    </td>
    <td>
        <html:text property="<%=TextbookLedgerAdjustmentForm.FIELD_FISCAL_YEAR %>" maxlength="4" size="4" />
    </td>
</tr>
<tr>
    <td class="ColRowBold tdAlignRight">
        *Notes
    </td>
    <td>
        <html:textarea cols="50" rows="3" property="<%=TextbookLedgerAdjustmentForm.FIELD_NOTES %>" />
    </td>
</tr>
<tr>
    <td class="ColRow">
        * = Required field
    </td>
    <td class="tdAlignRight">
        <table border="0" cellpadding="0" cellspacing="10">
            <tr valign="top">
               <base:showHideTag id="onSave">
                <td><base:saveButton onclick="hideElementonSave()" name="<%=SaveButtonTag.BUTTON_NAME%>"/></td>
                <td><base:cancelButton/></td>
               </base:showHideTag>
            </tr>
        </table>
    </td>
</tr>
</base:outlinedTable>

</base:form>
