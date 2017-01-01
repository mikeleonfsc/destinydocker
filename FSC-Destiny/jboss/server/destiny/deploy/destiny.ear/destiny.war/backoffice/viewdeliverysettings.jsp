<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.ViewDeliverySettingsForm" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib prefix="c" uri="/WEB-INF/jstl-core.tld" %>
<%@ taglib prefix="fn" uri="/WEB-INF/jstl-function.tld" %>

<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.ViewTextbookLoanPeriodsForm"%><SCRIPT LANGUAGE="JavaScript" type="text/javascript">
<!-- 
function selectAll(allCheckboxes) {
    if (allCheckboxes.length > 0){
        for (x = 0; x < allCheckboxes.length; x++) {
            allCheckboxes[x].checked = true;
        } 
     } else {
            allCheckboxes.checked = true;
    }
}
function clearAll(allCheckboxes) {
    if (allCheckboxes.length > 0){
        for (x = 0; x < allCheckboxes.length; x++) {
            allCheckboxes[x].checked = false;
        } 
     } else {
            allCheckboxes.checked = false;
    }
}
//-->
</script>

<% 
    ViewDeliverySettingsForm form = (ViewDeliverySettingsForm) request.getAttribute(ViewDeliverySettingsForm.FORM_NAME);
%>
<c:set var="form" value="<%=form %>"/>

<base:messageBox strutsErrors="true"/>
<base:messageBox filterMessage="false" message="${form.saveMessage}"/>

<base:form action="/backoffice/servlet/handleviewdeliverysettingsform.do">
    <table border="0" width="95%" cellpadding="0" cellspacing="0">

		<tr><td>
			<base:outlinedTableAndTabsWithinThere tabs="<%=ViewTextbookLoanPeriodsForm.getTabs(form.getCollectionType(), false) %>" selectedTab="<%=ViewTextbookLoanPeriodsForm.TAB_DELIVERY_SETTINGS %>" id="<%=ViewDeliverySettingsForm.TABLE_HEADER%>" borderColor="#C0C0C0" width="100%" cellpadding="2">
                <tr>
                    <td class="TableHeading">Sites that can search and book your materials</td>
                    <td class="tdAlignRight"><base:saveButton /></td>
                </tr>
                <tr>
                    <td class="ColRowBold">
                	   Bookings must be available&nbsp;
                       <html:text property="<%=ViewDeliverySettingsForm.FIELD_RESERVE_LEAD_TIME_IN_DAYS%>" size="2" maxlength="2"/>&nbsp;open days in advance of the requested shipping date.
            </td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td class="ColRowBold">Requests are delivered and picked up on the following days...</td>
                </tr>
                <tr>
                    <td colspan="2">
                        <table id="<%=ViewDeliverySettingsForm.TABLE_ZONES%>" border="0" width="100%">
                            <tr style="{border-bottom: 1px solid grey}">
                                <td width="70%" class="Instruction tdAlignRight">
                                    <base:image src="/icons/general/selectallicon.gif" width="20" height="15" alt="Select All"/>
                                    &nbsp;=&nbsp;Select All&nbsp;&nbsp;
                                </td>
                                <td class="Instruction" align="center">
                                    <base:image src="/icons/general/clearallicon.gif" width="17" height="15" alt="Clear All"/>
                                    &nbsp;=&nbsp;Clear All
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2"><base:imageLine width="100%" height="1" />
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <base:deliverySettings items="${form.schedules}" formName="<%=ViewDeliverySettingsForm.FORM_NAME%>"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <base:imageLine width="100%" height="1" />
                    </td>
                </tr>
                <tr>
                    <td align="center" colspan="2">
                        <base:saveButton />
                    </td>
                </tr>
		    </base:outlinedTableAndTabsWithinThere>
	  	</td></tr>
	</table>
</base:form>

