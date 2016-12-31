<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.jsptag.FindLicenseTag" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ page import="com.follett.fsc.destiny.util.Barcode" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    BatchAssignLicensesForm form = (BatchAssignLicensesForm)request.getAttribute(BatchAssignLicensesForm.FORM_NAME);
	String selectedTAB = BatchAssignLicensesForm.TAB;
	String licenseLabel = BatchAssignLicensesForm.LABEL_ASSIGN_LICENSE;
	String formAction = "/cataloging/servlet/handlebatchassignlicensesform.do";
	String formName = BatchAssignLicensesForm.FORM_NAME;

	if (form == null) {
	    form = (BatchUpdateLicensesForm)request.getAttribute(BatchUpdateLicensesForm.FORM_NAME);
	    selectedTAB = BatchUpdateLicensesForm.TAB;
		licenseLabel = BatchUpdateLicensesForm.LABEL_ASSIGN_LICENSE;
		formAction = "/cataloging/servlet/handlebatchupdatelicensesform.do";
		formName = BatchUpdateLicensesForm.FORM_NAME;
	}
%>

<base:messageBox strutsErrors="true"/>
<base:form action="<%= formAction %>" enctype="multipart/form-data">

<base:outlinedTableAndTabsWithinThere id="<%=BatchAssignLicensesForm.TABLE_MAIN%>"  borderColor="#C0C0C0" selectedTab="<%=selectedTAB%>" tabs="<%=form.getSoftwareTabs()%>" >
<% if ( form instanceof BatchUpdateLicensesForm ) { %>
	<tr>
		<td>
			<base:findLicense name="<%= BatchUpdateLicensesForm.PARAM_SOFTWARE_ID %>"
				findType="<%= FindLicenseTag.FIND_TYPE_SOFTWARE%>"
				findLicenseLabel="<%= BatchUpdateLicensesForm.LABEL_UPGRADE_SOFTWARE%>"
				softwareLicenseID="<%= new Long[]{((BatchUpdateLicensesForm)form).getSoftwareID()}%>">
			</base:findLicense>
		</td>
	</tr>
	<tr>
		<td>
			<base:imageLine/>
	   	</td>
	</tr>
<% } %>
<tr>
	<td>
		<base:findLicense name="<%= BatchAssignLicensesForm.PARAM_SOFTWARE_LICENSE_ID %>"
			findType="<%= FindLicenseTag.FIND_TYPE_LICENSE%>"
			findLicenseLabel="<%= licenseLabel%>" 
			softwareLicenseID="<%= form.getLicenseID()%>">
		</base:findLicense>
	</td>
</tr>
<tr>
    <td>
        <table border="0" cellspacing="0" cellpadding="0" width="100%" id="<%=BatchAssignLicensesForm.TABLE_HEADER%>">
   		    <tr>
	        	<td colspan="2">
	        		<base:imageLine/>
	        	</td>
		    </tr>
            <tr>
                <td class="TableHeading" colspan="2">To these Items...</td>
            </tr>
            <tr>
            	<td colspan="2">&nbsp;</td>
            </tr>
            
            <tr>
               <td>&nbsp;</td>
               <td>
                  <base:barcodeList 
                      formName="<%=formName%>"
                      barcodeType="<%=Barcode.BARCODETYPE_ASSET_ITEM%>"/>
               </td>
            </tr>

   		    <tr>
   		        <td colspan="2">
	        		<base:imageLine/>
   		        </td>
   		    </tr>
   		    
 		    <base:spanIfAllowed permission="<%= Permission.BACK_OFFICE_ADD_HISTORICAL_NOTES %>">
				<tr>
	    		    <td class="ColRowBold tdAlignRight">Add historical note
	    		    </td>
	    		    <td>
	   		    		<table id="<%=BatchAssignLicensesForm.TABLE_HISTORICAL_NOTE%>" border="0" cellpadding="3" cellspacing="0">
	   		    			<tr>
					            <td>
					                &nbsp;<html:text property='<%= BatchAssignLicensesForm.FIELD_HISTORICAL_NOTE %>' maxlength="120" size="70"/>
					            </td>
					        </tr>
					    </table>
				    </td>
				</tr>

    		    <tr>
    		        <td colspan="2">
    		        <base:imageLine height="1" width="100%" />
    		        </td>
    		    </tr>
    		</base:spanIfAllowed>

            <tr valign="top">
                <td valign="top" colspan="2" align="center" class="ColRowBold">
                    <%= GenericForm.getLastBackupDisplayMsg(true) %>
                </td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRowBold" colspan="2">
                    <base:showHideTag id="hideIt">
					<base:genericButton onclick="hideElementhideIt()" src="/buttons/large/update.gif" name="<%=BatchAssignLicensesForm.BUTTON_UPDATE_SOFTWARE%>" alt="<%=BatchAssignLicensesForm.BUTTON_UPDATE_SOFTWARE_ALT_TEXT%>"/>
                    </base:showHideTag>
                </td>
            </tr>
        </table>
    </td>
</tr>
</base:outlinedTableAndTabsWithinThere>
</base:form>

