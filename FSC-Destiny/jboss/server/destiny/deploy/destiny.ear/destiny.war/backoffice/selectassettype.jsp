<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<bean:define id="form" name="<%=SelectAssetTypeForm.FORM_NAME%>" type="com.follett.fsc.destiny.client.backoffice.servlet.SelectAssetTypeForm"/>

<base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handleselectassettypeform.do">
    <html:hidden property="<%=SelectAssetTypeForm.FIELD_ASSET_TYPE_LIMITER%>"/>

	<base:outlinedTable borderColor='#C0C0C0'>
        <tr>
			<td class="TableHeading" vAlign="top">Select Resource Types...</td>
        </tr>
		<tr>
			<td width="100%">
			     <base:assetTypeSelector assetTree="<%=form.getAssetTree()%>" selectedAssets="<%=form.getSelectedAssetTemplate()%>"  />
			</td>
		</tr>	
		<tr>
			<td>
				<base:imageLine height="1" width="95%"/>
		    </td>
		</tr>	
        <tr>
            <td align="center" class="ColRow">
                <base:okButton name="<%= SelectAssetTypeForm.BUTTON_OK %>" />
            </td>
        </tr>
    </base:outlinedTable>
</base:form>
 
