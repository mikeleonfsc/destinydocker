<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handleimportassettemplatesform.do" enctype="multipart/form-data">
    <table id="importAssetTemplatesBox" width="100%" border="0" cellspacing="0" cellpadding="2">
    	<tr>
			<td class="TableHeading" colspan="2">Import Resource Type Templates</td>    			
    	</tr>
        <tr>
    		<td colspan="2">
    		&nbsp;
    		</td>
        </tr>
    	<tr>
			<td class="ColRow" align="center" colspan="2">
                <%=ImportAssetTemplatesForm.getMessageAssetTemplateSamples()%>
            </td>    			
    	</tr>
        <tr>
    		<td colspan="2">
    		&nbsp;
    		</td>
        </tr>
        <tr>            
            <td class="FormLabel tdAlignRight" nowrap>Import File</td>
            <td><html:file property="<%=ImportAssetTemplatesForm.FIELD_UPLOAD_FILE%>" size="40"/></td>
        </tr>
        <tr>
    		<td colspan="2">
    		&nbsp;
    		</td>
        </tr>
	    <tr>
        	<td class="ColRowBold" align="center" colspan="2">
            	<%= GenericForm.getLastBackupDisplayMsg(true) %>
        	</td>
	    <tr>
        <tr>
            <td colspan="2" align="center" class="ColRowBold">
            <base:showHideTag id="onImport">
                <base:genericButton
                    src="/buttons/large/importemplates.gif"
                    alt="<%= ImportAssetTemplatesForm.ALT_SUBMIT_TEXT %>"
                    name="<%= ImportAssetTemplatesForm.BUTTON_IMPORT %>"
                    onclick="hideElementonImport()"/>
            </base:showHideTag>
            </td>
        </tr>
    </table> <!-- importassettemplatesbox -->
</base:form>
