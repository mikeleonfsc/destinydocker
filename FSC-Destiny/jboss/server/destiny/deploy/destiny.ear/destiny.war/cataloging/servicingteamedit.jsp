<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.ServicingTeamEditForm"%>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    ServicingTeamEditForm form = (ServicingTeamEditForm)request.getAttribute(ServicingTeamEditForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
%>

<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handleservicingteameditform.do">
    
<html:hidden property="<%= ServicingTeamEditForm.PARAM_SERVICING_TEAM_HEAD_ID %>"/>
<html:hidden property="<%= ServicingTeamEditForm.PARAM_SERVICING_TEAM_SITE_JOIN_ID %>"/>
<html:hidden property="<%= ServicingTeamEditForm.PARAM_SERVICING_TEAM_ID %>"/>
<html:hidden property="<%= ServicingTeamEditForm.PARM_LAST_SEARCH_STRING%>"/>
<html:hidden property="<%= ServicingTeamEditForm.PARM_LAST_SEARCH_TYPE%>"/>
<html:hidden property="<%= ServicingTeamEditForm.PARAM_ENTER_KEY_PRESSED%>"/>
<html:hidden property="<%= ServicingTeamEditForm.PROP_CURRENT_SEARCH_LIST%>"/>
<html:hidden property="<%= ServicingTeamEditForm.PROP_CURRENTLY_ASSIGNED_MEMBERS_LIST%>"/>  
<html:hidden property="<%= ServicingTeamEditForm.PARAM_SHOW_ONLY_MY_PATRONS %>"/>  
<html:hidden property="<%= ServicingTeamEditForm.PARAM_INCLUDE_MEDIA_PATRONS_OVERRIDE %>"/>  
<html:hidden property="<%= ServicingTeamEditForm.PARAM_ONLY_MY_PATRONS_CHANGED%>" value="false"/>

<script language="JavaScript" type="text/javascript">
  <!--
    function submitLocalCheckbox() {    
        document.<%=ServicingTeamEditForm.FORM_NAME%>.submit();
    }
  // -->
</script>
<script language="JavaScript" type="text/javascript">
  <!--
 
  function trapEnterKey(e)
  {
      // look for window.event in case event isn't passed in
      if (typeof e == 'undefined' && window.event) { e = window.event; }
      if (e.keyCode == 13)
      {
          document.<%=ServicingTeamEditForm.FORM_NAME%>.<%=ServicingTeamEditForm.PARAM_ENTER_KEY_PRESSED%>.value = "true";
          document.getElementById('buttonSave').click();
      }
  }
  // -->
</script>

<table>
    <tr>
        <td class="Instruction" >
            &nbsp; &nbsp;* = Required Field
        </td>
    </tr>
</table>

<base:outlinedTable id="<%=ServicingTeamEditForm.TABLE_OUTLINE_EDIT%>" borderColor="#C0C0C0">
    <tr>
        <td >
           <table> 
             <tr>
                 <td nowrap="nowrap" class="ColRowBold tdAlignRight">
                        * Servicing Team Name
                 </td>
                 <td nowrap="nowrap">
                        <html:text property="<%= ServicingTeamEditForm.FIELD_SERVICING_TEAM_NAME %>" size="40" maxlength="50" onkeypress="return trapEnterKey(event);"/>
                 </td>
             </tr>
             <base:isNotDistrictUser>
             <tr>
                 <td class="tdAlignRight">
                    <logic:equal name="<%= ServicingTeamEditForm.FORM_NAME %>" property="<%= ServicingTeamEditForm.PARAM_SHOW_LOCAL_IMAGE %>" value="true"> 
                        <base:image src="/icons/general/check_19.gif"/>
                        <html:hidden property="<%=ServicingTeamEditForm.FIELD_LOCAL_TEAM %>"/>
                        <td class="ColRowBold">
                            Local Servicing Team
                        </td>
                    </logic:equal>
                    <logic:equal name="<%= ServicingTeamEditForm.FORM_NAME %>" property="<%= ServicingTeamEditForm.PARAM_SHOW_LOCAL_CHECKBOX %>" value="true"> 
                        <html:checkbox  onclick="submitLocalCheckbox()" property="<%=ServicingTeamEditForm.FIELD_LOCAL_TEAM %>"/>
                        <td class="ColRowBold">
                            Local Servicing Team
                        </td>
                    </logic:equal>
                 </td>
             </tr>
            </base:isNotDistrictUser>
            <base:isDistrictUser>
                <html:hidden property="<%=ServicingTeamEditForm.FIELD_LOCAL_TEAM %>" value="false"/>
            </base:isDistrictUser>
        
             <% if( store.isDistrictUser() || form.isLocalTeam() ) { %>
                 <tr>
                     <td  nowrap="nowrap" class="ColRowBold tdAlignRight">
                            Head of Servicing Team
                     </td>
                     <td>
                         <table id="<%=ServicingTeamEditForm.TABLE_SERVICING_TEAM_HEAD %>" border="0" cellspacing="0" cellpadding="0">
                             <tr>
                                <td valign="center" class="ColRow">
                                    <bean:write name="<%= ServicingTeamEditForm.FORM_NAME %>" property="headName" filter="true"/>
                                    <% if( form.isTeamHeadOffsite() ) { %>
                                        <font color="#CC0000">[<bean:write name="<%= ServicingTeamEditForm.FORM_NAME %>" property="siteNameForHead" filter="true"/>]</font>
                                    <% }  %> 
                                </td>
                                    <logic:notPresent name="<%= ServicingTeamEditForm.FORM_NAME %>" property="<%= ServicingTeamEditForm.PARAM_SERVICING_TEAM_HEAD_ID %>">
                                        <td valign="center">
                                            &nbsp;&nbsp;<base:genericButton src="/buttons/large/selectplus.gif" alt="<%= ServicingTeamEditForm.ALT_TEXT_HEAD_SELECT %>" name="<%= ServicingTeamEditForm.BUTTON_NAME_SELECT %>" />
                                        </td>
                                   </logic:notPresent>
                                    
                                    <logic:present name="<%= ServicingTeamEditForm.FORM_NAME %>" property="<%= ServicingTeamEditForm.PARAM_SERVICING_TEAM_HEAD_ID %>">
                                        <td valign="center">
                                            &nbsp;&nbsp;<base:genericButton src="/buttons/large/clear.gif" alt="<%= ServicingTeamEditForm.ALT_TEXT_HEAD_CLEAR %>" name="<%= ServicingTeamEditForm.BUTTON_NAME_HEAD_CLEAR %>" />
                                        </td>   
                                   </logic:present>
                             </tr>
                         </table>
                     </td>
                 </tr>
             <% }  %>   
               
            </table> 
        </td>
        <td valign="top" align="right" class="ColRowBold">
            <base:showHideTag id="onSave">
                <table border="0" cellspacing="0" cellpadding="0">
                    <tr>
                        <td class="tdAlignRight">
                            <base:saveButton onclick="hideElementonSave()" name="<%= ServicingTeamEditForm.BUTTON_NAME_SAVE %>" />
                        </td>
                    </tr>
                    <tr>
                        <td class="tdAlignRight">
                            <base:cancelButton name="<%= ServicingTeamEditForm.BUTTON_NAME_CANCEL %>" />
                        </td>
                    </tr>
                </table>
            </base:showHideTag>
        </td>
    </tr>
     <% if( store.isDistrictUser() || form.isLocalTeam() ) { %>  
    <tr>
        <td background="/images/icons/general/thickline.gif" nowrap="nowrap" width="100%" colspan="2">
            <span class="ColRow">&nbsp;</span>
            <span class="SectionHeader">
                <%= MessageHelper.formatMessage("ManageServicingTeamsForm_AddMembers") %>
            </span>
        </td>
    </tr>
    <tr> 
        <td>
        <table>                
        
        <tr>
            <td class="ColRowBold tdAlignRight" nowrap ><%= MessageHelper.formatMessage("ManageServicingTeamsForm_FindPatron") %></td>
            <td class="ColRowBold" width="100%">
                <html:text property="searchString" size="24" maxlength="90" onkeypress="return trapEnterKey(event);"/>&nbsp;<%=MessageHelper.formatMessage("patronlookup_In") %>&nbsp;
                <base:selectPatronByType name="<%=ServicingTeamEditForm.FIELD_SEARCH_TYPE%>" selected="<%=form.getSearchType()%>" onlyMyPatrons = "<%=form.isOnlyMyPatrons() %>" returnAllEvenIfWeFindAMatchByBarcode="true"/>
                <base:goButton absbottom="true"/>
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td class="ColRow">
            <% if (form.isShowOnlyMyPatronsCheckbox()) { %>
               <html:checkbox property="<%= ServicingTeamEditForm.FIELD_ONLY_MY_PATRONS %>" onclick="onlyMyPatronsChecked()"/><%=MessageHelper.formatMessage("patronlookup_OnlyMyPatrons") %><% } else if (form.isShowOnlyMyPatrons()) { %>
                   &nbsp;
               <html:hidden property="<%= ServicingTeamEditForm.FIELD_ONLY_MY_PATRONS %>" value="false"/>
            <% } else { %>
                &nbsp;
                <html:hidden property="<%= ServicingTeamEditForm.FIELD_ONLY_MY_PATRONS %>" value="true"/>
            <% } %>
            </td>
        </table>
        </tr>
        </td>
    </tr>
    
    <tr>
        <td width="100%" colspan="2">
            <%=form.outputCurrentSearchList()%>
        </td>
    </tr>
    <tr>
        <td colspan="2" width="100%">
            <%=form.outputCurrentlyAssigned()%>
        </td>
    </tr>  
     <% }  %> 
                                             
</base:outlinedTable>
</base:form>
