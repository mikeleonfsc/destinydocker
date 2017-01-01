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
    UpdatePatronAddAssociationsForm form = (UpdatePatronAddAssociationsForm)request.getAttribute(UpdatePatronAddAssociationsForm.FORM_NAME);
    Tab[] tabs = BasePatronListForm.getTabs(store);
%>



<%@page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag"%><base:messageBox strutsErrors="true"/>
<br>

<base:form action="/backoffice/servlet/handleupdatepatronaddassociationsform.do">
<html:hidden property="<%=UpdatePatronAddAssociationsForm.FIELD_SELECTION_CHANGED%>" value ="false"/>
<html:hidden property="<%=UpdatePatronAddAssociationsForm.FIELD_TO_SITE_CHANGED%>"/>
<html:hidden property="<%=UpdatePatronAddAssociationsForm.FIELD_FROM_SITE_CHANGED%>"/>

    <logic:equal name="<%=UpdatePatronAddAssociationsForm.FORM_NAME%>" property="<%= UpdatePatronAddAssociationsForm.PARAM_SHOW_CONFIRMATION%>" value="true">                   
         <% 
            String headerStr = form.buildConfirmationMessage();
            String[] messageText = null;
             messageText = new String[]{ MessageHelper.formatMessage("updatepatronaddassociations_ThisProcessIsNotReversible") , MessageHelper.formatMessage("updatepatronaddassociations_AreYouSure")};

        %>
        <base:confirmBox 
            showWarningIcon="true" filterMessage="false" showPleaseWait="true"
            header="<%=headerStr%>"
            messageText="<%=messageText%>"
            noName="<%=UpdatePatronAddAssociationsForm.BUTTON_CANCEL_UPDATE%>" 
            yesName="<%=UpdatePatronAddAssociationsForm.BUTTON_CONFIRM_UPDATE%>"/>
     </logic:equal>

<base:outlinedTableAndTabsWithinThere id="tableUpdatePatron" tabs="<%= tabs %>" selectedTabID="<%= IUpdatePatronForm.ID_TAB_TOP_UPDATE %>" selectedTab='<%=MessageHelper.formatMessage("updatepatronaddassociations_Update") %>' hideTabsWhenPrinterFriendly="true" borderColor="#C0C0C0" width="100%">
    <tr>
        <td class="TableHeading" colspan="2"><%= MessageHelper.formatMessage("updatepatronaddassociations_UpdatePatronAssociations") %></td>
    </tr>

	<tr>
        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("updatepatronaddassociations_ForEveryPatron") %></td>
        <td valign="top" valign="middle" >
            <table border="0" cellpadding="3" cellspacing="0" id="<%=UpdatePatronAddAssociationsForm.TABLE_FOR_EVERY %>">
            <tr>
			    <td class="ColRow tdAlignRight"><%= MessageHelper.formatMessage("updatepatronaddassociations_At") %></td>        
		    	<td class="ColRowBold">
	                <base:selectSite 
                        onChangeAction="changeFromSite()"
	                    selectedSiteID="<%= String.valueOf(form.getFromSiteID())%>"
	                	useSelectASite="true"
	                    name="<%=UpdatePatronAddAssociationsForm.FIELD_FROM_SITE_ID%>" 
	                    includeAllLibraries="false"
	                    includeLibrarySites="true"
	        			includeTextbookSites="true"
	        			includeMediaSites="false"
	        			includeAssetSites="true"
                        includeFromDistrict="false"
                        includeDistrictWarehouse="false"
	                    />
		          </td>	
              </tr>
              <% if ( form.getFromSiteID() != null && !form.getFromSiteID().equals(SelectSiteTag.BLANK_SITE)) { %>
                  <tr>
                  <td class="ColRow tdAlignRight"><%= MessageHelper.formatMessage("updatepatronaddassociations_Whose") %> </td>
                    <base:patronUpdateList
                        siteID ="<%=form.getFromSiteID() %>" 
                        formName="<%=form.FORM_NAME%>"
                        option="<%=form.getWhoseOption()%>"
                        optionName="<%=form.FIELD_WHOSE_OPTION%>" 
                        childOptionName="<%=form.FIELD_WHOSE_OPTION_VALUE%>"
                        childOption="<%=form.getWhoseOptionValue()%>"
                        selectionChangeFieldName="<%=form.FIELD_SELECTION_CHANGED%>"
                        selectionChangeFieldValue="true"
                        calendarImageFieldName=""
                        excludedOptions="<%=form.getExcludedOptions()%>"
                        childControlDescriptor="="
                        childControlDescriptorClass="ColRow"
                        allowAnyPatronTypeSelection="true"
                        onChildChangeScript="changeFromAccessLevel()"
                        printerFriendly="false"
                    />
                    
                 
                  <% if (form.showFromAssetGroup()) { %>
                 
                   <td class="ColRow">
                        <%= MessageHelper.formatMessage("updatepatronaddassociations_AndAssetGroupIs") %>
                        <%=form.buildFromAssetGroupList()%>
                         </td>
                    <%}%>
                        </tr>
               <%}%> 
              
               
              </table>
           </td>
    </tr>
    <tr>
        <td class="ColRow" colspan="2"><base:imageLine printerFriendly="<%=form.isPrinterFriendly() %>" width="98%" vspace="2"/></td>
    </tr>

    <tr>
	    <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("updatepatronaddassociations_AddAssociationTo") %></td>
        <td>
                    <base:selectSite 
                        onChangeAction="changeToSite()"
                        selectedSiteID="<%= String.valueOf(form.getToSiteID())%>"
                        useSelectASite="true"
                        name="<%=UpdatePatronAddAssociationsForm.FIELD_TO_SITE_ID%>" 
                        includeAllLibraries="false"
                        includeLibrarySites="true"
                        includeTextbookSites="true"
                        includeMediaSites="false"
                        includeAssetSites="true"
                        includeFromDistrict="false"
                        excludeThisSiteID="<%=form.getFromSiteID() %>"
                        includeDistrictWarehouse="false"
                        />
         </td>
    </tr>
    <% if ( form.getToSiteID() != null && !form.getToSiteID().equals(SelectSiteTag.BLANK_SITE) && form.isSiteExist(form.getToSiteID()) ) { %>
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top"><%= MessageHelper.formatMessage("updatepatronaddassociations_AndAssign") %></td>
        <td>
            <table border="0" cellpadding="3" cellspacing="0" id="<%=UpdatePatronAddAssociationsForm.TABLE_AND_ASSIGN %>">
            <tr>
                <td class="ColRowBold">
                    <%=form.buildPatronTypeList() %>
                </td> 
            </tr>
            <tr>
                  <td class="ColRow">
                    <%=form.buildAccessLevelsList() %>
            <% if (form.showAssetGroup()) { %>
                <%= MessageHelper.formatMessage("updatepatronaddassociations_AndAssetGroup") %>
                <%=form.buildAssetGroupList() %>
            <% } %>
                    </td>
                    </tr>
              
            </table>
        </td>
    </tr>        
    <%} %>    
    <tr valign="top" align="center">
        <td valign="top" colspan="2">
            <span class="Instruction"><%= MessageHelper.formatMessage("updatepatronaddassociations_IfThePatronBarcodeAlreadyExistsAtTheTargetSiteThe") %></span>
        </td>
    </tr>
    <tr valign="top">
        <td valign="top" colspan="2">
            <span class="ColRowBold"><%= GenericForm.getLastBackupDisplayMsg(true) %></span>
        </td>
    </tr>
    <tr>
        <td valign="baseline" align="center" class="ColRow" colspan="2">
            <base:genericButton name="<%=IUpdatePatronForm.BUTTON_UPDATE_PATRONS%>" alt='<%=MessageHelper.formatMessage("update")%>' src="/buttons/large/updatepatrons.gif"/>
        </td>
    </tr>
</base:outlinedTableAndTabsWithinThere>
</base:form>
<script language="JavaScript" type="text/javascript">
<!--
function changeFromAccessLevel() {
    document.<%=UpdatePatronAddAssociationsForm.FORM_NAME%>.submit();
}

function changeAccessLevel() {
    document.<%=UpdatePatronAddAssociationsForm.FORM_NAME%>.submit();
}

function changeFromSite() {
	document.<%=UpdatePatronAddAssociationsForm.FORM_NAME%>.<%=UpdatePatronAddAssociationsForm.FIELD_FROM_SITE_CHANGED%>.value = "<%=UpdatePatronAddAssociationsForm.SUBMIT_SITE_CHANGED%>";
	document.<%=UpdatePatronAddAssociationsForm.FORM_NAME%>.submit();
}

function changeToSite() {
    document.<%=UpdatePatronAddAssociationsForm.FORM_NAME%>.<%=UpdatePatronAddAssociationsForm.FIELD_TO_SITE_CHANGED%>.value = "<%=UpdatePatronAddAssociationsForm.SUBMIT_SITE_CHANGED%>";
    document.<%=UpdatePatronAddAssociationsForm.FORM_NAME%>.submit();
}
//-->
</script>
