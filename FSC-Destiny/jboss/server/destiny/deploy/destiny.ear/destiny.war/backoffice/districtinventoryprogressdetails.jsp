<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.DistrictInventoryProgressDetailsForm" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%@ page import="com.follett.fsc.destiny.session.common.SortHelper" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.InventoryProgressRowVO" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%@page import="org.apache.struts.util.ResponseUtils"%>
<base:messageBox strutsErrors="true"/>

<%
    DistrictInventoryProgressDetailsForm form = (DistrictInventoryProgressDetailsForm)request.getAttribute(DistrictInventoryProgressDetailsForm.FORM_NAME);
%>

<base:form action="/backoffice/servlet/handledistrictinventoryprogressdetailsform.do">

<% if (form.getPartialIDToRevive() != null) { %>
    <base:messageBox>
    <tr>
        <td align="center" class="ColRowBold">You should only revive this inventory if there is more work for <%=form.getSiteNameToRevive() %> to complete.</td>
    </tr>
    <tr>
        <td align="center" class="ColRow">Are you certain you want to revive this inventory?</td>
    </tr>
    <tr>
        <td align="center" >
            <base:yesNo/>
        </td>
    </tr>
    </base:messageBox>
	<html:hidden property="<%=DistrictInventoryProgressDetailsForm.PARAM_PARTIALID_TO_REVIVE%>"/>
<% } %>

	<html:hidden property="<%=DistrictInventoryProgressDetailsForm.PARAM_INVENTORY_ID%>"/>
	<html:hidden property="<%=DistrictInventoryProgressDetailsForm.PARAM_SORT%>"/>
	<html:hidden property="<%=DistrictInventoryProgressDetailsForm.PARAM_DESCEND%>"/>
	<html:hidden property="<%=DistrictInventoryProgressDetailsForm.PARAM_COLLECTION_TYPE%>"/>

<base:outlinedTable id="<%=DistrictInventoryProgressDetailsForm.TABLE_MAIN%>" borderColor='#C0C0C0'>
		<tr>
            <td width="100%" class="SmallColHeading tdAlignRight">
				<base:pageListOutput formName="<%=DistrictInventoryProgressDetailsForm.FORM_NAME%>"/>
			</td>
		</tr>
	  	<tr>
           
	        <td class="TableHeading"><%=ResponseUtils.filter(form.getName()) %> - Started <%=form.getDateStarted()%> </td>
	    </tr>
	    <tr>
	        <td>
				<%=form.generateDetails()%>
			</td>
	    </tr>
		
	    
    </base:outlinedTable>
</base:form>

