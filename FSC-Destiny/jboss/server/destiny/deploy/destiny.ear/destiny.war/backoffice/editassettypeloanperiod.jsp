<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>


<%
    EditAssetTypeLoanPeriodForm form = (EditAssetTypeLoanPeriodForm) request.getAttribute(EditAssetTypeLoanPeriodForm.FORM_NAME);
%>

<br>

<base:form action="/backoffice/servlet/handleeditassettypeloanperiodform.do">

    <table border="0" width="95%" id="<%= ViewTextbookLoanPoliciesForm.TABLE_TEXTBOOK_POLICIES_TABS %>" cellpadding="0" cellspacing="0">
        <tr><td width="100%">
            <base:outlinedTable borderColor="#C0C0C0" id="<%= EditAssetTypeLoanPeriodForm.TABLE_MAIN %>" width="100%" cellpadding="4" cellspacing="0">

                <tr>
                    <td class="ColRowBold">Resource Type</td>
                    <td class="ColRowBold">Loan Period</td>
                    <td nowrap class="ColRowBold tdAlignRight">
                        <base:showHideTag id="onSave">
                            <base:saveButton onclick="hideElementonSave()" />&nbsp;
                            <base:cancelButton/>
                        </base:showHideTag>
                    </td>
                </tr>
                <%
                    form.outputList(out);
                %>
            </base:outlinedTable>
        </td></tr>
    </table>

</base:form>



