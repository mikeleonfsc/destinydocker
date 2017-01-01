<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.FindLicensesForm" %>
<%@ page import="com.follett.fsc.common.StringHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>

<%
    FindLicensesForm form = (FindLicensesForm)request.getAttribute(FindLicensesForm.FORM_NAME);
%>
<BR>
<base:form action="/cataloging/servlet/handlefindlicensesform.do" focus="<%=FindLicensesForm.FIELD_SEARCH_STRING%>" handleEnterKey="true">
<html:hidden property="<%=FindLicensesForm.PARAM_UPGRADE_MODE%>" />
<html:hidden property="<%=FindLicensesForm.PARAM_FIELD_NAME%>" />
<html:hidden property="<%=FindLicensesForm.PARAM_ORIG_BIBID%>" />

<base:outlinedTable borderColor="#c0c0c0" id="<%=FindLicensesForm.TABLE_MAIN%>">
<tr>
<td>

<table id="<%=FindLicensesForm.TABLE_HEADER%>" cellspacing="3" cellpadding="1" border="0">

	<% String notFoundMessage = form.getNoResultsMessage();
	        if (!StringHelper.isEmpty(notFoundMessage)) {%>
		     <tr><td colspan="2">
		         <base:messageBox filterMessage="false" showWarningIcon="false" message="<%=notFoundMessage%>"/>
		     </td></tr>
		<% } %>
	<tr>
		<td class="TableHeading" colspan="2">
			<logic:equal name="<%=FindLicensesForm.FORM_NAME%>" property="<%=FindLicensesForm.PARAM_UPGRADE_MODE%>" value="false">
				Find the Software License to assign...
			</logic:equal>
			<logic:equal name="<%=FindLicensesForm.FORM_NAME%>" property="<%=FindLicensesForm.PARAM_UPGRADE_MODE%>" value="true">
				Find the Software to upgrade...
			</logic:equal>
		</td>
	</tr>
	<tr>
		<td>
			<base:imageSpacer width="40" height="1" />
   		</td>
		<td class="ColRow">
			 <bean:define id="assetTypes" name="<%= FindLicensesForm.FORM_NAME %>" property="assetTypes"/>
			 <html:select property="<%= FindLicensesForm.FIELD_ASSET_TYPE %>">
	                    <html:options collection="assetTypes" property="longID"
	                              labelProperty="stringDesc"/>
	         </html:select>
		</td>
	</tr>
    <tr>
   		<td>
			<base:imageSpacer width="40" height="1" />
   		</td>
   		<td>
 		 <span onKeyPress="return trapEnterKey(event);">
			<html:text property="<%=FindLicensesForm.FIELD_SEARCH_STRING %>" size="30" maxlength="120"/>
		 </span>
         <base:goButton align="absbottom"/>
   		</td>
   	</tr>
	   	<%if(form.isDisplayOnlyMySoftwareCheckbox()){ %>
		   	<tr>
		   		<td>
					<base:imageSpacer width="40" height="1" />
		   		</td>
			   	<td class="ColRow">
					<html:checkbox property="<%=FindLicensesForm.FIELD_ONLY_MY_ASSETS%>">Only my software</html:checkbox>
				</td>  
			</tr> 
		<%} %>
</table>
</td>
</tr>

<logic:equal name="<%=FindLicensesForm.FORM_NAME%>" property="anySearchListsToDisplay" value="true">
<tr><td width="100%">	
  <table id="<%=FindLicensesForm.TABLE_COPY_FIND %>" width="95%" cellspacing="0" cellpadding="4">

    <logic:equal name="<%=FindLicensesForm.FORM_NAME%>" property="listFilledWithCopies" value="false">

		<jsp:include page="/common/titlelist.jsp">
		 	<jsp:param name="formName" value="<%=FindLicensesForm.FORM_NAME%>"/>
		  	<jsp:param name="showAvailability" value="false"/>
		  	<jsp:param name="neverShowAvailability" value="true"/>
		  	<jsp:param name="renderLineAboveEachRow" value="true"/>
		  	<jsp:param name="selectURL" value="<%=form.getSelectUrl()%>"/>
		</jsp:include>
	</logic:equal>
	

    <logic:equal name="<%=FindLicensesForm.FORM_NAME%>" property="listFilledWithCopies" value="true">
       <tr>
           <td colspan='<%=""+ (form.getColSpanForItems() - 1) %>' class="TableHeading2"><bean:write name="<%=FindLicensesForm.FORM_NAME%>" property="copyListTitle"/></td>
    		<td class="tdAlignRight">
			    <base:genericButton
			      src="/buttons/large/selectbig.gif"
			      alt="<%= FindLicensesForm.ALT_SELECT_TEXT %>"
			      name="<%= FindLicensesForm.BUTTON_SELECT %>"/>
    		</td>

       </tr>

	   <%=form.outputList(form.getList()) %>
	   
    	<tr>
    		<td colspan='<%=""+form.getColSpanForItems() %>' class="tdAlignRight">
			    <base:genericButton
			      src="/buttons/large/selectbig.gif"
			      alt="<%= FindLicensesForm.ALT_SELECT_TEXT %>"
			      name="<%= FindLicensesForm.BUTTON_SELECT %>"/>
    		</td>
    	</tr>
    		   
		</logic:equal>	
  </table>
</td></tr>            
</logic:equal>
</base:outlinedTable>

</base:form>

