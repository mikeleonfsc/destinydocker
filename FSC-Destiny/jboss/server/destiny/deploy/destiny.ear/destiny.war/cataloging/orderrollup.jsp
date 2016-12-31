<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.OrderRollupForm" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<base:messageBox strutsErrors="true"/>

<%
    OrderRollupForm form = (OrderRollupForm)request.getAttribute(OrderRollupForm.FORM_NAME);
%>

<base:form action="/cataloging/servlet/handleorderrollupform.do">
	<html:hidden property="<%=OrderRollupForm.PARAM_DESCEND%>"/>
    
<base:outlinedTableAndTabsWithinThere id="<%=OrderRollupForm.TABLE_MAIN%>" selectedTab="<%=OrderRollupForm.TAB_ON_ORDER%>" tabs="<%=form.getTabs()%>" width="100%">
		<tr>
            <td class="TableHeading"><%= MessageHelper.formatMessage("orderrollup_AssetOrders") %></td>
		</tr>
<logic:equal name="<%= OrderRollupForm.FORM_NAME %>" property="<%= OrderRollupForm.PARAM_EMPTY_LIST %>" value="true">
        <tr>
        	<td class="ColRow" align="center">
			    <%= form.getNothingToReportMessage() %>
        	</td>
        </tr>    
</logic:equal>
<logic:equal name="<%= OrderRollupForm.FORM_NAME %>" property="<%= OrderRollupForm.PARAM_EMPTY_LIST %>" value="false">
    	<tr><td>
    		<%=form.outputLists() %>
        </td></tr>
</logic:equal>

</base:outlinedTableAndTabsWithinThere>
    
</base:form>

