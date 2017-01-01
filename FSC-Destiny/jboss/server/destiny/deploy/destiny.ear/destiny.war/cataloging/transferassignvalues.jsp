<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.buttons.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.*"%>
<%@ page import="com.follett.fsc.destiny.util.*" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    TransferAssignValuesForm form = (TransferAssignValuesForm)request.getAttribute(TransferAssignValuesForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handletransferassignvaluesform.do">
	<html:hidden property="<%=GenericForm.FIELD_COLLECTION_TYPE%>"/>
	<html:hidden property="<%=TransferAssignValuesForm.FIELD_CUSTODIAN_ID%>"/>
	<html:hidden property="<%=TransferAssignValuesForm.PARAM_NEVER_RETAIN_CURRENT_CUSTODIAN%>"/>
    <table id="<%=TransferAssignValuesForm.TABLE_MAIN%>" cellSpacing="0" cellPadding="3" width="100%" border="0">
        <tr>
        	<td>
            	<table id="<%=TransferAssignValuesForm.TABLE_MAIN_HEADER%>" border="0" cellpadding="0" width="100%">
					<tr>
						<td class="TableHeading" valign="top">
                      		For every item received, assign...
                    	</td>
					</tr>				
				</table>
       		</td>
    	</tr>
    	<tr>
			<td>
        		<table id="<%=TransferAssignValuesForm.TABLE_SUB_HEADER%>" border="0" cellpadding="2" width="95%">			
					<tr>
						<td class="ColRowBold tdAlignRight">
			  				Custodian
			  			</td>
			  			<td><table><tr>
			  				<logic:equal name="<%=TransferAssignValuesForm.FORM_NAME%>"  property="<%=TransferAssignValuesForm.PARAM_NEVER_RETAIN_CURRENT_CUSTODIAN%>" value="true">
				  				<html:hidden property="<%=TransferAssignValuesForm.RETAIN_CURRENT_CUSTODIAN%>" value="false"/>
			  				</logic:equal>
			  				<logic:equal name="<%=TransferAssignValuesForm.FORM_NAME%>"  property="<%=TransferAssignValuesForm.PARAM_NEVER_RETAIN_CURRENT_CUSTODIAN%>" value="false">
				  				<td class="ColRow"><html:radio name="<%=TransferAssignValuesForm.FORM_NAME%>" property="<%=TransferAssignValuesForm.RETAIN_CURRENT_CUSTODIAN%>" value="false"/></td>
			  				</logic:equal>
			  				<td class="ColRow"><bean:write name="<%=TransferAssignValuesForm.FORM_NAME%>" property="<%=TransferAssignValuesForm.PARAM_CUSTODIAN %>" /></td>
			  				<td class="ColRow"><base:genericButton src="/buttons/large/selectplus.gif" name="<%= TransferAssignValuesForm.BUTTON_CUSTODIAN_SELECT %>" alt="Select"/></td>
			  				<logic:equal name="<%=TransferAssignValuesForm.FORM_NAME%>"  property="clearButton" value="true">
			  					<td class="ColRow"><base:genericButton src="/buttons/large/clear.gif" name="<%= TransferAssignValuesForm.BUTTON_CUSTODIAN_CLEAR %>" alt="Clear"/></td>
			  				</logic:equal>
			  			</tr></table></td>
					</tr>    			
	  				<logic:equal name="<%=TransferAssignValuesForm.FORM_NAME%>"  property="<%=TransferAssignValuesForm.PARAM_NEVER_RETAIN_CURRENT_CUSTODIAN%>" value="false">
						<tr>
							<td class="ColRowBold" nowrap>
				  				&nbsp;
				  			</td>
				  			<td class="ColRow">
				  				<html:radio name="<%=TransferAssignValuesForm.FORM_NAME%>" property="<%=TransferAssignValuesForm.RETAIN_CURRENT_CUSTODIAN%>" value="true">Retain current custodian</html:radio>			  							
				  			</td>
						</tr>    
					</logic:equal>							
					<tr>
						<td class="ColRowBold tdAlignRight" nowrap>
							Home Location
						</td>
						<td class="ColRowBold" nowrap>
	                    	<base:selectLocation name="<%=TransferAssignValuesForm.FIELD_HOME_LOCATION_ID %>"
					          		includeNone="true" selectedLocationID="<%=form.getSelectedLocationID()%>"
					          		/>
							&nbsp;
							<base:spanIfAllowed permissions='<%= new Permission[]{ Permission.CAT_MANAGE_LOCATIONS} %>' collectionType="<%=form.getCollectionType()%>">
								<base:genericButton src="/buttons/large/other.gif" name="<%= TransferAssignValuesForm.BUTTON_LOCATION_OTHER %>" alt="Other" absbottom="true"/>
							</base:spanIfAllowed>
			  			</td>					
					</tr>    			
					<tr>
				    	<td class="ColRowBold tdAlignRight" nowrap>
				    		Department
						</td>
						<td class="ColRowBold" nowrap>
	                    	<base:selectDepartment  name="<%= TransferAssignValuesForm.FIELD_DEPARTMENT_ID%>"  includeNone="true" includeAll="false" includeOther="false" selectedDepartmentID="<%= form.getSelectedDepartmentID() %>"/>
			  									&nbsp;
							<base:spanIfAllowed permissions='<%= new Permission[]{ Permission.BACK_OFFICE_SITE_ADMINISTRATION} %>' collectionType="<%=form.getCollectionType()%>">
								<base:genericButton src="/buttons/large/other.gif" name="<%= TransferAssignValuesForm.BUTTON_DEPARTMENT_OTHER %>" alt="Other" absbottom="true"/>
							</base:spanIfAllowed>
			  			</td>
			  			
					</tr>
					<tr>
						<td class="ColRowBold" nowrap>
			  				&nbsp;
			  			</td>				
				    	<td class="ColRowBold" nowrap>
                            <base:showHideTag id="onOK">
				  			   <base:genericButton src="/buttons/large/ok.gif" onclick="hideElementonOK()" name="<%= TransferAssignValuesForm.BUTTON_OK %>" alt="OK"/>
                            </base:showHideTag>
						</td>						
					</tr>					
				</table>
			</td>
    	</tr>
    </table>
</base:form>


