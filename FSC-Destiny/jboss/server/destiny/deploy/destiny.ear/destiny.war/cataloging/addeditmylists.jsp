<%@page import="org.apache.struts.util.ResponseUtils"%>
<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.AddEditMyListsForm"%>
<%@ page import="com.follett.fsc.destiny.util.Permission"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator"%>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>

<script language="JavaScript" type="text/javascript">
  <!--
  function trapEnterKey(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        document.<%=AddEditMyListsForm.FORM_NAME%>.<%=AddEditMyListsForm.PARAM_ENTER_KEY_PRESSED%>.value = "true";
        document.<%=AddEditMyListsForm.FORM_NAME%>.submit();
      }
    }
  
  // -->
</script>

<base:messageBox strutsErrors="true" />

<%
AddEditMyListsForm form = (AddEditMyListsForm)request.getAttribute(AddEditMyListsForm.FORM_NAME);
%>
<script language="JavaScript" type="text/javascript">
<!--
function onlyMyPatronsChecked() {
    document.<%=AddEditMyListsForm.FORM_NAME %>.<%=AddEditMyListsForm.PARAM_ONLY_MY_PATRONS_CHANGED%>.value = "true";
    document.<%=AddEditMyListsForm.FORM_NAME%>.submit();
}

//-->
</script>
<base:form action="/cataloging/servlet/handleaddeditmylistsform.do" focus="<%=form.getFocus() %>">
	<html:hidden property="<%= AddEditMyListsForm.FIELD_LIST_ID %>" />
	<html:hidden property="<%= AddEditMyListsForm.FIELD_COPY_LIST_ID %>" />
    <html:hidden property="<%= AddEditMyListsForm.PARM_LAST_SEARCH_STRING%>"/>
    <html:hidden property="<%= AddEditMyListsForm.PARM_LAST_SEARCH_TYPE%>"/>
    <html:hidden property="<%= AddEditMyListsForm.PARAM_ENTER_KEY_PRESSED%>"/>
    <html:hidden property="<%= AddEditMyListsForm.PROP_CURRENT_SEARCH_LIST%>"/>
    <html:hidden property="<%= AddEditMyListsForm.PROP_CURRENTLY_ASSIGNED_OWNERS_LIST%>"/>  
    <html:hidden property="<%= AddEditMyListsForm.PARAM_SHOW_ONLY_MY_PATRONS %>"/>  
    <html:hidden property="<%= AddEditMyListsForm.PARAM_ONLY_MY_PATRONS_CHANGED%>" value="false"/>
	<base:outlinedTable borderColor="#c0c0c0" id="<%=AddEditMyListsForm.TABLE_MAIN%>" >
	<tr>
	    <td vAlign=top width="100%" bgColor=#ffffff colspan="2">
    		<table id="<%=AddEditMyListsForm.TABLE_LIST %>" cellSpacing=0 cellPadding=3 width="100%" border=0>
    			<tr>
    				<td colspan="3" class="TableHeading">
    				    <%= ResponseUtils.filter(form.getPageTitle()) %>
    				</td>
    			</tr>
    			<tr>
    				<td>
    					<table>
    						<tr>
    							<td class="ColRowBold tdAlignRight">
    							    <%= MessageHelper.formatMessage("addeditmylists_Name") %>  
    							</td>
    							<td>
    							    <html:text name="<%=AddEditMyListsForm.FORM_NAME%>" property="<%=AddEditMyListsForm.FIELD_NAME%>" size="20" maxlength="<%=AddEditMyListsForm.LEN_NAME_FIELD_STR%>"/>
    							</td>
    						</tr>
                            
                            <% if (!form.isDistrictUser() && form.getStore().canDo(Permission.CAT_CREATE_MULTIPLE_MYLISTS) && form.getStore().canDo(Permission.CAT_PUBLISH_MYLISTS)) { %>
                                <tr>
                                    <td>&nbsp;
                                    </td>
                                    <td class="ColRow">
                                        <html:checkbox name="<%=AddEditMyListsForm.FORM_NAME%>" property="<%=AddEditMyListsForm.FIELD_PUBLIC_LIST%>"/><%= MessageHelper.formatMessage("addeditmylists_MakeThisListPublicLocally") %>
                                        <base:helpTag helpFileName="d_make_list_public_LM_MM_Legal.htm" />                                        
                                    </td>
                                </tr> 
                            <% } else { %>
                                <html:hidden property="<%=AddEditMyListsForm.FIELD_PUBLIC_LIST %>" />
                            <% } %>
                            <% if (!form.isDistrictUser() && form.getStore().canDo(Permission.CAT_CREATE_MULTIPLE_MYLISTS) 
                                && form.getStore().canDo(Permission.CAT_PUBLISH_MYLISTS) 
                                && form.getStore().canDo(Permission.CAT_PUBLISH_MYLISTS_DISTRICT) ) { %>
                                <tr>
                                    <td>&nbsp;
                                    </td>
                                    <td class="ColRow">
                                        <base:imageSpacer height="1" width="15"></base:imageSpacer>
                                        <html:checkbox name="<%=AddEditMyListsForm.FORM_NAME%>" property="<%=AddEditMyListsForm.FIELD_DISTRICT_PUBLIC%>"/>
                                        <%= MessageHelper.formatMessage("addeditmylists_MakeThisListPublicAcrossTheDistrict") %>
                                    </td>
                                </tr> 
                            <% } else { %>
                                <html:hidden property="<%=AddEditMyListsForm.FIELD_DISTRICT_PUBLIC %>" />
                            <% } %>
                            
                            <tr>
    							<td valign="top" class="ColRowBold tdAlignRight">
    								<%= MessageHelper.formatMessage("addeditmylists_Description") %>  
    							</td>
    							<td>
    								<html:textarea name="<%=AddEditMyListsForm.FORM_NAME%>" property="<%=AddEditMyListsForm.FIELD_DESCRIPTION%>" cols="40" rows="4"/>
    							</td>
    						</tr>
    						<tr>
    						<td>&nbsp;</td>
    							<td class="Instruction">
    							<%= MessageHelper.formatMessage("addeditmylists_RequiredField") %>
    							</td>
    						</tr>
    					</table>
    				</td>
    				<td valign="top" class="ColRowBold">
    					<base:showHideTag  id="hideSave">
    						<table>
    							<tr>	
    								<td class="tdAlignRight" valign="top">
    									<base:saveButton onclick="hideElementhideSave()"/>
    								</td>
    							</tr>
    							<tr>
    								<td class="tdAlignRight" valign="top">
    									<base:cancelButton/>
    								</td>
    							</tr>
    						</table>
    					</base:showHideTag>
    				</td>
    			</tr>
    		</table>
		</td>
	</tr>
    <% if (form.getStore().canDo(Permission.CAT_SHARE_BOOKLIST_OWNERSHIP)) { %>
        <tr>
            <td background="/images/icons/general/thickline.gif" nowrap="nowrap" width="100%" colspan="2">
                <span class="ColRow">&nbsp;</span>
                <span class="SectionHeader">
                    <%= MessageHelper.formatMessage("addeditmylists_AddCoowners") %>
                </span>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight" nowrap><%= MessageHelper.formatMessage("addeditmylists_FindPatron") %></td>
            <td class="ColRowBold" width="100%">
                <html:text property="searchString" size="24" maxlength="90" onkeypress="return trapEnterKey(event);"/>&nbsp;<%=MessageHelper.formatMessage("patronlookup_In") %>&nbsp;
                <base:selectPatronByType name="<%=AddEditMyListsForm.FIELD_SEARCH_TYPE%>" selected="<%=form.getSearchType()%>" onlyMyPatrons = "<%=form.isOnlyMyPatrons() %>" returnAllEvenIfWeFindAMatchByBarcode="true"/>
                <base:goButton absbottom="true"/>
            </td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td class="ColRow">
        <% if (form.isShowOnlyMyPatronsCheckbox()) { %>
           <html:checkbox property="<%= AddEditMyListsForm.FIELD_ONLY_MY_PATRONS %>" onclick="onlyMyPatronsChecked()"/><%=MessageHelper.formatMessage("patronlookup_OnlyMyPatrons") %><% } else if (form.isShowOnlyMyPatrons()) { %>
               &nbsp;
           <html:hidden property="<%= AddEditMyListsForm.FIELD_ONLY_MY_PATRONS %>" value="false"/>
        <% } else { %>
            &nbsp;
            <html:hidden property="<%= AddEditMyListsForm.FIELD_ONLY_MY_PATRONS %>" value="true"/>
        <% } %>
          </td>
        </tr>
        <tr>
            <td width="100%" colspan="2">
                <%=form.outputCurrentSearchList()%>
            </td>
        </tr>
        <tr><td>&nbsp;</td></tr>
    <% } %>          
    <tr>
        <td colspan="2" width="100%">
            <%=form.outputCurrentlyAssigned()%>
        </td>
    </tr>
</base:outlinedTable>
</base:form>

