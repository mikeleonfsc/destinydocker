<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@page import="com.follett.fsc.destiny.client.common.data.Tab"%>
<%@page import="com.follett.fsc.destiny.client.circulation.servlet.BasePatronListForm"%>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    UpdatePatronMoveFieldsForm form = (UpdatePatronMoveFieldsForm)request.getAttribute(UpdatePatronMoveFieldsForm.FORM_NAME);
    Tab[] tabs = BasePatronListForm.getTabs(store);
%>


<%@page import="com.follett.fsc.destiny.session.backoffice.data.PatronMoveFieldsJobParams.DestinationDataMode"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.data.PatronMoveFieldsJobParams"%><script language="JavaScript" type="text/javascript">
<!--
	function generateCheckReport(fieldID) {
	    //Build the URL based on the fields in the form
	    var url = '/backoffice/servlet/presentupdatepatronmovefieldscheckform.do?fieldID=' + fieldID;
	
	    //Open the new window
	    window.open(url, 'Check').focus();
	}
// -->
</script>
<base:messageBox strutsErrors="true"/>
<base:form action="/backoffice/servlet/handleupdatepatronmovefieldsform.do">

    <logic:equal name="<%=UpdatePatronMoveFieldsForm.FORM_NAME%>" property="<%= UpdatePatronMoveFieldsForm.PARAM_SHOW_CONFIRMATION%>" value="true">                   
         <% 
            String headerStr = form.buildConfirmationMessage();
            String additionalMessage = form.getAdditionalConfirmation();
            String[] messageText = null;
            if (!StringHelper.isEmpty(additionalMessage)) {
             messageText = new String[]{additionalMessage,MessageHelper.formatMessage("updatepatronmovefields_ThisProcessCannotBeReversed"),
                 MessageHelper.formatMessage("updatepatronmovefields_AreYouSure")};
            }
            else {
             messageText = new String[]{ MessageHelper.formatMessage("updatepatronmovefields_ThisProcessCannotBeReversed"),
                 MessageHelper.formatMessage("updatepatronmovefields_AreYouSure")};

            }
        %>
        <base:confirmBox 
            showWarningIcon="true" filterMessage="false" showPleaseWait="true"
            header="<%=headerStr%>"
            messageText="<%=messageText%>"
            noName="<%=UpdatePatronMoveFieldsForm.BUTTON_CANCEL_UPDATE%>" 
            yesName="<%=UpdatePatronMoveFieldsForm.BUTTON_CONFIRM_UPDATE%>"/>
     </logic:equal>

    <base:outlinedTableAndTabsWithinThere id="tableUpdatePatron" tabs="<%= tabs %>" selectedTabID="<%= IUpdatePatronForm.ID_TAB_MOVE_FIELDS %>" selectedTab='<%=MessageHelper.formatMessage("updatepatronmovefields_MoveFields") %>' hideTabsWhenPrinterFriendly="true" borderColor="#C0C0C0" width="100%">
            <tr>
                <td class="TableHeading" colspan="2"><%= MessageHelper.formatMessage("updatepatronmovefields_ForEveryPatron") %></td>
            </tr>

	    <base:isDistrictUser>
			<tr>
			    <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("updatepatronmovefields_In") %></td>        
		    	<td class="ColRowBold">
	                <base:selectSite 
	                    selectedSiteID="<%= String.valueOf(form.getSiteID())%>"
	                	useSelectASite="false"
	                    submitOnChange="true" 
	                    name="<%=UpdatePatronMoveFieldsForm.FIELD_SITE_ID%>" 
	                    includeAllLibraries="true"
	                    includeLibrarySites="true"
	        			includeTextbookSites="true"
	        			includeMediaSites="false"
	        			includeAssetSites="true"
	        			includeDistrictWarehouse="false"
	                    />
		          </td>	    	
		    </tr>
	    </base:isDistrictUser>
	    
            <tr>
			    <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("updatepatronmovefields_MoveDataFrom") %></td>
			    <td class="ColRowBold" valign="center"><%= form.buildMoveDataFromDropdownHTML() %>&nbsp;

	    		<base:isDistrictUser>
				<logic:equal name="<%= UpdatePatronMoveFieldsForm.FORM_NAME %>" property="<%= UpdatePatronMoveFieldsForm.FIELD_SITE_ID %>" value="<%=ConfigSiteSpecs.SITE_ID_MY_DISTRICT.toString()%>">
                    <base:image src="/buttons/large/check.gif" alt='<%=MessageHelper.formatMessage("check")%>' name="<%=UpdatePatronMoveFieldsForm.BUTTON_CHECK_FROM%>" onClick="<%= form.getFieldIDFromJavascript()%>"/>
				</logic:equal>
	    		</base:isDistrictUser>
			    </td>
            </tr>
            <tr>
			    <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("updatepatronmovefields_To") %></td>
			    <td class="ColRowBold" valign="center"><%= form.buildMoveDataToDropdownHTML() %>&nbsp;	    
	    		<base:isDistrictUser>
				<logic:equal name="<%= UpdatePatronMoveFieldsForm.FORM_NAME %>" property="<%= UpdatePatronMoveFieldsForm.FIELD_SITE_ID %>" value="<%=ConfigSiteSpecs.SITE_ID_MY_DISTRICT.toString()%>">
				<logic:equal name="<%= UpdatePatronMoveFieldsForm.FORM_NAME %>" property="<%= UpdatePatronMoveFieldsForm.PARAM_SHOW_CHECK_TO_BUTTON %>" value="true">
                    <base:image src="/buttons/large/check.gif" alt='<%=MessageHelper.formatMessage("check")%>' name="<%=UpdatePatronMoveFieldsForm.BUTTON_CHECK_TO%>" onClick="<%= form.getFieldIDToJavascript()%>"/>
			    </logic:equal>
				</logic:equal>
	    		</base:isDistrictUser>
			    </td>
            </tr>
            <tr>
            	<td>&nbsp;</td>
            	<td class="ColRow">
                    <br>
                    <html:checkbox property="<%=UpdatePatronMoveFieldsForm.FIELD_RESTORE_DEFAULT_LABEL%>"/>&nbsp;<%= MessageHelper.formatMessage("updatepatronmovefields_RestoreTheDefaultLabelForTheSourceField") %>
                    <br><br>
                </td>
            </tr>
            <tr>
            	<td class="ColRowBold tdAlignRight" valign="top" rowspan="3"><%=MessageHelper.formatMessage("updatepatronmovefields_Options")%></td>
            	<td class="ColRow">
                    <html:radio property="<%=UpdatePatronMoveFieldsForm.FIELD_DESTINATION_DATA_MODE %>" value="<%=new Integer(PatronMoveFieldsJobParams.DestinationDataMode.ABORT.ordinal()).toString() %>">
                        <%= MessageHelper.formatMessage(PatronMoveFieldsJobParams.DestinationDataMode.ABORT.getLabelKey()) %> 
                    </html:radio> 
                </td>
            </tr>  
            <tr>
                <td class="ColRow">
                    <html:radio property="<%=UpdatePatronMoveFieldsForm.FIELD_DESTINATION_DATA_MODE %>" value="<%=new Integer(PatronMoveFieldsJobParams.DestinationDataMode.SKIP.ordinal()).toString() %>">
                        <%= MessageHelper.formatMessage(PatronMoveFieldsJobParams.DestinationDataMode.SKIP.getLabelKey()) %> 
                    </html:radio> 
                </td>
            </tr>              
            <tr>
                <td class="ColRow">
                    <html:radio property="<%=UpdatePatronMoveFieldsForm.FIELD_DESTINATION_DATA_MODE %>" value="<%=new Integer(PatronMoveFieldsJobParams.DestinationDataMode.OVERWRITE.ordinal()).toString() %>">
                        <%= MessageHelper.formatMessage(PatronMoveFieldsJobParams.DestinationDataMode.OVERWRITE.getLabelKey()) %> 
                    </html:radio> 
                </td>
            </tr>                        
            <tr valign="top">
                <td valign="top" colspan="2">
                    <span class="ColRowBold"><%= GenericForm.getLastBackupDisplayMsg(true) %></span>
                </td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2">
                    <base:genericButton name="<%=IUpdatePatronForm.BUTTON_UPDATE_PATRONS%>" alt='<%=MessageHelper.formatMessage("update") %>' src="/buttons/large/updatepatrons.gif"/>
                </td>
            </tr>
            </base:outlinedTableAndTabsWithinThere>
</base:form>
