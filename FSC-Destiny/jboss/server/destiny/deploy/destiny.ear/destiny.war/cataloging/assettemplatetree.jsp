<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.AssetTemplateTreeForm" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.AddTitleNavigationForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.ImportAssetTemplatesForm"%>
<base:messageBox strutsErrors="true"/>

<%
    AssetTemplateTreeForm form = (AssetTemplateTreeForm)request.getAttribute(AssetTemplateTreeForm.FORM_NAME);
%>

<base:form action="/cataloging/servlet/handleassettemplatetreeform.do">
<html:hidden property="hasAssetTemplatesDefined"/>
<html:hidden property="<%=AssetTemplateTreeForm.PARAM_CLOSEDIDS_AS_STRING%>"/>

<%if (form.hasImportMessage() != null) { 
	if (form.hasImportMessage().booleanValue()) {%>
	
	<base:messageBox showRedBorder="true"> 
        <tr>
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td align="center" class="ColRowBold">
				Importing resource templates will delete all existing templates for the district.
            </td>
        </tr>
        <tr>
            <td class="ColRow" align="center" colspan="2">
				Would you like to proceed?
            </td>
        </tr>
        <tr>
			<td align="center" class="Instruction" colspan="2">
				You may want to print this page for your records before proceeding.
			</td>        
		</tr>
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:yesNo 
               		buttonYesName="<%=AssetTemplateTreeForm.BUTTON_IMPORT_YES%>"
                   	buttonNoName="<%=AssetTemplateTreeForm.BUTTON_IMPORT_NO%>"
           		/>
            </td>
        </tr>    
    </base:messageBox>	
	  <%}else{ %>
	<base:messageBox showRedBorder="true">
        <tr>
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td valign="baseline" class="Error">
                <p align="center">Unable to import templates. Resources currently exist in the district.</p>
            </td>
        </tr>
    </base:messageBox>
  
<%  form.setHasImportMessage(null);
	}
  }%>
  
  
  
<%if (form.getDeleteID() != null) { %>
<html:hidden property="deleteID"/>
	<% if (form.isOKToDelete()) { %>
	<base:messageBox showRedBorder="true">
        <tr>
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td valign="baseline" class="Error">
                <p align="center"><%=form.getDeleteMessage()%></p>
                <div align="center">
                    <base:yesNo 
                		buttonYesName="<%=AssetTemplateTreeForm.BUTTON_YES%>"
                    	buttonNoName="<%=AssetTemplateTreeForm.BUTTON_NO%>"
            		/>
                </div>
            </td>
        </tr>
    </base:messageBox>
    <% } else { %>
	<base:messageBox showRedBorder="true">
        <tr>
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td valign="baseline" class="Error">
                <p align="center"><%=form.getBlockDeleteMessage()%></p>
            </td>
        </tr>
    </base:messageBox>
    <% }
	 } %>

<br>
<base:outlinedTableAndTabsWithinThere id="<%=AssetTemplateTreeForm.TABLE_MAIN%>"  borderColor="#C0C0C0" selectedTab="<%=AssetTemplateTreeForm.ID_TAB%>" tabs="<%=AddTitleNavigationForm.getTabsAssetMode()%>" >
<tr>
	<td width="100%">
		<%form.outputList(out);%>
	</td>
</tr>	
<tr>
	<td width="100%">
		<base:imageLine height="2" width="100%" />
	</td>
</tr>
<tr>
	<td align="center" width="100%">
		<table id=<%=AssetTemplateTreeForm.TABLE_KEY%> align="center" width="100%" border="0" cellspacing="0" cellpadding="3">
			<tr valign="top">
				<td class="Instruction" align="center" valign="top">
					<base:image src="/icons/general/addtemplate.gif" width="40" height="16" alt="Add" /> = Add
				</td>
				<td class="Instruction" align="center" valign="top">
					<base:image src="/icons/general/duplicatetemplate.gif" width="40" height="16" alt="Duplicate" /> = Duplicate
				</td>
				<td class="Instruction" align="center" valign="top">
					<base:image src="/icons/general/edit.gif" width="19" height="16" alt="Edit" /> = Edit
				</td>
				<td class="Instruction" align="center" valign="top">
					<base:image src="/icons/general/delete.gif" width="19" height="16" alt="Delete" /> = Delete
				</td>
			</tr>
		</table>
	</td>
</tr>
<tr>
	<td width="100%">
		<base:imageLine height="2" width="100%" />
	</td>
</tr>
<tr>
	<td width="100%" class="ColRowBold tdAlignRight">
		<base:showHideTag id="onAction">
		    <base:genericButton
		      src="/buttons/large/updatecustomlists.gif"
		      alt="<%= AssetTemplateTreeForm.ALT_UPDATE_CUSTOM_LISTS %>"
		      name="<%= AssetTemplateTreeForm.BUTTON_CUSTOM_LISTS %>"
		      onclick="hideElementonAction()"/>
			&nbsp;
			<logic:equal name="<%= AssetTemplateTreeForm.FORM_NAME%>" property="hasAssetTemplatesDefined" value="true"> 
			    <base:genericButton
			      src="/buttons/large/movetemplates.gif"
			      alt="<%= AssetTemplateTreeForm.ALT_MOVE_TEMPLATE %>"
			      name="<%= AssetTemplateTreeForm.BUTTON_MOVE %>"
			      onclick="hideElementonAction()"/>
			</logic:equal>
            <logic:equal name="<%= AssetTemplateTreeForm.FORM_NAME%>" property="<%=AssetTemplateTreeForm.PARM_CAN_VIEW_ALL_ASSETS%>" value="true"> 
                &nbsp;
    		    <base:genericButton
    		      src="/buttons/large/importemplates.gif"
    		      alt="<%= AssetTemplateTreeForm.ALT_IMPORT_TEMPLATE %>"
    		      name="<%= AssetTemplateTreeForm.BUTTON_IMPORT %>"
    		      onclick="hideElementonAction()"/>
                &nbsp;
    		    <base:genericButton
    		      src="/buttons/large/exportemplates.gif"
    		      alt="<%= AssetTemplateTreeForm.ALT_EXPORT_TEMPLATE %>"
    		      name="<%= AssetTemplateTreeForm.BUTTON_EXPORT %>"
    		      onclick="hideElementonAction()"/>
            </logic:equal>
		</base:showHideTag>
	</td>
</tr>
<logic:equal name="<%= AssetTemplateTreeForm.FORM_NAME%>" property="<%=AssetTemplateTreeForm.PARM_CAN_VIEW_ALL_ASSETS%>" value="true">
    <tr>
        <td class="ColRow tdAlignRight">
            <%=ImportAssetTemplatesForm.getMessageAssetTemplateSamples()%>
        </td>               
    </tr>
</logic:equal>
</base:outlinedTableAndTabsWithinThere>
</base:form>

