<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.AssignLoanPeriodForm" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<% AssignLoanPeriodForm form = (AssignLoanPeriodForm)request.getAttribute(AssignLoanPeriodForm.FORM_NAME); %>



<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<base:messageBox strutsErrors="true"/>

<bean:define id="optionList" name="<%=AssignLoanPeriodForm.FORM_NAME%>" property="circTypeList" />

<base:form action="/cataloging/servlet/handleassignloanperiodform.do">
    <html:hidden property="<%=AssignLoanPeriodForm.FIELD_BIB_ID%>"/>
	
	<table width="100%" border="0" id="<%=AssignLoanPeriodForm.TABLE_MAIN%>">
        <tr>
			<td colspan="2" class="TableHeading" valign="top" align="center"> 
			    <bean:write name="cataloging_servlet_AssignLoanPeriodForm" property="title" />
			</td>
			<td class="ColRowBold" valign="top" align="center" rowspan="4">
                <base:showHideTag id="onSave">
				    <base:saveButton onclick="hideElementonSave()"/><br><base:cancelButton/>
                </base:showHideTag>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<base:imageLine height="2" width="100%" />
			</td>
		</tr>		
		<tr>
			<td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("assignloanperiod_LoanPeriod") %></td>
			<td>
				<html:select property="<%=AssignLoanPeriodForm.FIELD_SELECTED_ID%>">
	            	<html:options collection="optionList" property="longID" labelProperty="stringDesc"/>
	            </html:select>
			</td>
		</tr>
		<tr>
			<td colspan="2" class="ColRow" align="center">
				<bean:write name="cataloging_servlet_AssignLoanPeriodForm" property="defaultMessage" />
			</td>
		</tr>		
	</table>
</base:form>

