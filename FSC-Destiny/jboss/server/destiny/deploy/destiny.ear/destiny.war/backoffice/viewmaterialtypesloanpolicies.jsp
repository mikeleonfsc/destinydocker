<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.ViewMaterialTypesLoanPoliciesForm" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%-- I18n Support --%>
<%@ taglib uri="/WEB-INF/jstl-format.tld" prefix="fmt"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>



<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.ViewTextbookLoanPeriodsForm"%><base:messageBox strutsErrors="true"/>

<%
    ViewMaterialTypesLoanPoliciesForm form = (ViewMaterialTypesLoanPoliciesForm)request.getAttribute(ViewMaterialTypesLoanPoliciesForm.FORM_NAME);
%>

<base:form action="/backoffice/servlet/handleviewmaterialtypesloanpoliciesform.do">
    <table border="0" width="95%" cellpadding="0" cellspacing="0">

		<tr><td>
			<base:outlinedTableAndTabsWithinThere tabs="<%=ViewTextbookLoanPeriodsForm.getTabs(form.getCollectionType(), false) %>" selectedTab="<%=ViewTextbookLoanPeriodsForm.TAB_MATERIAL_TYPES %>" id="<%=ViewMaterialTypesLoanPoliciesForm.TABLE_MAIN_MEDIA_POLICIES%>" borderColor="#C0C0C0" width="100%" cellpadding="2">
			    <logic:equal name="<%=ViewMaterialTypesLoanPoliciesForm.FORM_NAME%>" property="editMode" value="true">
					<tr>
						<td colspan="2" class="ColRowBold tdAlignRight"><base:showHideTag id="onSave"><base:saveButton onclick="hideElementonSave()"/>&nbsp;<base:cancelButton/></base:showHideTag></td>
					</tr>
			    </logic:equal>
			    <logic:equal name="<%=ViewMaterialTypesLoanPoliciesForm.FORM_NAME%>" property="editMode" value="false">
					<tr>
						<td colspan="2" class="tdAlignRight">
							<base:link page="/backoffice/servlet/presentviewmaterialtypesloanpoliciesform.do?editMode=true">
              					<base:image src="/buttons/large/edit.gif" alt='<%=MessageHelper.formatMessage("edit")%>' vspace="3" />
              				</base:link>
              			</td>
              		</tr>
              	</logic:equal>
				<tr>
					<td class="ColRowBold"><%= MessageHelper.formatMessage("viewmaterialtypesloanpolicies_MaterialType") %></td>
					<td class="ColRowBold"><%= MessageHelper.formatMessage("viewmaterialtypesloanpolicies_LoanPeriod") %></td>
				</tr>
				<% form.outputMaterialTypeList(out); %>
		    </base:outlinedTableAndTabsWithinThere>
	  	</td></tr>
	</table>
</base:form>

