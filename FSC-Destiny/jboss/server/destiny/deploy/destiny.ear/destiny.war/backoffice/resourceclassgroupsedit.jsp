<%@page import="com.follett.fsc.common.StringHelper"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*" %>
<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>

<base:messageBox strutsErrors="true"/>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    ResourceClassGroupsEditForm form = (ResourceClassGroupsEditForm)request.getAttribute(ResourceClassGroupsEditForm.FORM_NAME);
%>
<script language="JavaScript">
<!--
    function trapEnterJS(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        document.<%=ResourceClassGroupsEditForm.FORM_NAME%>.<%=ResourceClassGroupsEditForm.FIELD_TRAP_ENTER_PRESSED%>.value=true;
        document.<%=ResourceClassGroupsEditForm.FORM_NAME%>.submit();
      }
      return true;
    }
    function submitOnTemplateChange() {
        document.<%=ResourceClassGroupsEditForm.FORM_NAME%>.<%=ResourceClassGroupsEditForm.FIELD_ASSET_TEMPLATE_TYPE_CHANGED%>.value=true;
        document.<%=ResourceClassGroupsEditForm.FORM_NAME%>.submit();
    }
//-->
</script>

<br>

<base:form action="/backoffice/servlet/handleresourceclassgroupseditform.do" focus="<%=ResourceClassGroupsEditForm.FIELD_SEARCH_STRING%>">
    <html:hidden property="<%= ResourceClassGroupsEditForm.FIELD_TRAP_ENTER_PRESSED %>" value="false"/>
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=ResourceClassGroupsEditForm.BUTTON_TRAP_ENTER%>">

<html:hidden property="<%=ResourceClassGroupsEditForm.PARM_CURRENT_SEARCH_STRING%>"/>
<html:hidden property="<%=ResourceClassGroupsEditForm.PARM_CURRENT_SEARCH_TYPE%>"/>
<html:hidden property="<%=ResourceClassGroupsEditForm.PARM_CLASS_GROUP_ID%>"/>
<html:hidden property="<%=ResourceClassGroupsEditForm.FIELD_ASSET_TEMPLATE_TYPE_CHANGED%>"/>
<% if (!StringHelper.isEmpty(form.getDeleteBibMessage())) { %>
   <html:hidden property="<%= ResourceClassGroupsEditForm.PARM_REMOVE_FROM_ID%>"/>   
   <base:messageBox>
       <tr>
           <td valign="baseline">
               <%=form.getDeleteBibMessage() %>
               <div align="center">
                    <base:yesNo buttonNoName="<%=ResourceClassGroupsEditForm.BUTTON_CANCEL_DELETE%>" buttonYesName="<%=ResourceClassGroupsEditForm.BUTTON_CONFIRM_DELETE%>"/>
                </div>
           </td>
       </tr>
   </base:messageBox>
<% } %>
    <base:outlinedTable id="<%=ResourceClassGroupsEditForm.TABLE_UPDATE_GROUP%>" borderColor="#C0C0C0">
        
        <tr><td class="ColRowBold" valign="top" colspan="2" width="100%">
        <bean:write 
            name="<%= ResourceClassGroupsEditForm.FORM_NAME %>" 
            property="header"/>
        </td>
          <td valign="top" class="tdAlignRight">
             <base:okButton name="<%=ResourceClassGroupsEditForm.BUTTON_CLOSE%>"/>
          </td>
        </tr>
        
	    <tr>
	        <td class="ColRowBold" colspan="3" width="100%"><base:imageLine height="1" width="100%"/></td>
	    </tr>
	    
	    <tr>
	    <td colspan="3" valign="top">
	       <table cellpadding="0" cellspacing="2" border="0" >
        	    <tr>
        	      <td class="ColRowBold" valign="top" nowrap="true">Find </td>
                
                <bean:define id="assets" name="<%=ResourceClassGroupsEditForm.FORM_NAME%>" property="assetTreeOptionList" />
                    <% if (form.isDisplayDropdown()) { %>
                        <td valign="top" >
                        &nbsp;
                            <html:select property="<%=ResourceClassGroupsEditForm.FIELD_ASSET_TEMPLATE_ID%>" onchange="submitOnTemplateChange()">
                                <html:options collection="assets" property="longID" labelProperty="stringDesc"/>
                            </html:select>
                    <% } else { %>
                       <td class="ColRowBold" valign="top">
                            <%= form.getAssetTreeOptionList().getString(0)%>
                        <html:hidden property="<%= ResourceClassGroupsEditForm.FIELD_ASSET_TEMPLATE_ID %>"/>
                           
                    <%} %>
                    &nbsp;
                </td>
                <td class="ColRowBold">
                    <html:text property="<%=ResourceClassGroupsEditForm.FIELD_SEARCH_STRING%>" size="21" onkeypress="trapEnterJS(event)" tabindex="${tabOrder}" />  
                   in <%=form.outputAssetDropdown()%>
                   <base:goButton absbottom="true"/>
                </td>
                </tr>
	       </table>
	    </td>
	    </tr>
        
        <tr><td width="100%" colspan="3">
        <%=form.outputCurrentAssetSearchList() %>
        </td></tr>


        <tr><td colspan="3" width="100%">
        <%=form.outputCurrentlyAssignedAssets()%>
        </td></tr>
        
    </base:outlinedTable>
</base:form>


