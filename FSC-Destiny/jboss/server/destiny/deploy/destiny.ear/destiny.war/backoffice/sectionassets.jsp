<%@page import="com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.AddTitleSearchForm"%>
<%@page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<base:messageBox strutsErrors="true"/>


<%@page import="java.util.List"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%>
<%@page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@page import="com.follett.fsc.destiny.util.HTMLFilterHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@ page import="com.follett.fsc.destiny.session.cataloging.ejb.AssetSearchFacadeSpecs"%>
<%@page import="com.follett.fsc.common.StringHelper" %>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.apache.struts.util.ResponseUtils"%>
<%@page import="com.follett.fsc.destiny.util.lookup.LongLongLookup"%>
<%@page import="com.follett.fsc.destiny.util.Barcode"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.BarcodeListTag"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.ejb.TextbookClassesFacadeSpecs"%>

<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-format.tld" prefix="fmt" %>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    SectionAssetsForm form = (SectionAssetsForm)request.getAttribute(SectionAssetsForm.FORM_NAME);
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>
<script language="JavaScript">
<!--
   function trapEnterJS(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        document.<%=SectionAssetsForm.FORM_NAME%>.<%=SectionAssetsForm.FIELD_TRAP_ENTER_PRESSED%>.value=true;
        document.<%=SectionAssetsForm.FORM_NAME%>.submit();
      }
      return true;
    }
    
    function changeToTitleSearch() {
        document.<%=SectionAssetsForm.FORM_NAME%>.<%=SectionAssetsForm.PARM_GROUP_SEARCH_MODE%>.value = "<%=SectionAssetsForm.MODE_TITLE_SEARCH%>";
        document.<%=SectionAssetsForm.FORM_NAME%>.submit();
    }
    
    function changeToGroupAssign() {
        document.<%=SectionAssetsForm.FORM_NAME%>.<%=SectionAssetsForm.PARM_GROUP_SEARCH_MODE%>.value = "<%=SectionAssetsForm.MODE_GROUP_ASSIGN%>";
        document.<%=SectionAssetsForm.FORM_NAME%>.submit();
    }
    
    function submitOnTemplateChange() {
        document.<%=SectionAssetsForm.FORM_NAME%>.<%=SectionBaseForm.FIELD_ASSET_TEMPLATE_TYPE_CHANGED%>.value = "true";
        document.<%=SectionAssetsForm.FORM_NAME%>.submit();
    }
    
    function onSearchTypeChange() {
        document.<%=SectionAssetsForm.FORM_NAME%>.<%=SectionBaseForm.FIELD_SEARCH_TYPE_CHANGED%>.value = "true";
<%--         document.<%=SectionAssetsForm.FORM_NAME%>.submit(); --%>
    
    }
//-->
</script>

<br>

<base:form action="/backoffice/servlet/handlesectionassetsform.do" focus="<%=SectionBaseForm.FIELD_SEARCH_STRING%>">
    <html:hidden property="<%= SectionBaseForm.FIELD_TRAP_ENTER_PRESSED %>" value="false"/>
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=SectionBaseForm.BUTTON_TRAP_ENTER%>">

<html:hidden property="<%=SectionBaseForm.PARM_SECTION_ID%>"/>
<html:hidden property="<%=SectionBaseForm.PARM_CURRENT_SEARCH_STRING%>"/>
<html:hidden property="<%=SectionBaseForm.PARM_CURRENT_SEARCH_TYPE%>"/>
<html:hidden property="<%=SectionBaseForm.PARM_CLASS_ID%>"/>
<html:hidden property="<%=SectionBaseForm.PARM_ASSIGN_TO_CLASSID%>"/>
<html:hidden property="<%=SectionBaseForm.PARM_REMOVE_FROM_ID%>"/>
<html:hidden property="<%=SectionBaseForm.PARM_EXPANDED_GROUP%>"/>
<html:hidden property="<%=SectionBaseForm.PARM_DELETE_GROUP%>"/>
<html:hidden property="<%=SectionAssetsForm.PARM_LAST_GROUP_SEARCH_MODE%>"/>
<html:hidden property="<%=SectionBaseForm.FIELD_ASSET_TEMPLATE_TYPE_CHANGED%>"/>
<html:hidden property="<%=SectionBaseForm.FIELD_SEARCH_TYPE_CHANGED%>"/>

<% if (form.getAssignmentState() == SectionBaseForm.ASSIGNMENT_STATE_CONFIRM_ASSIGN) { %>
    <base:messageBox>
        <tr>
            <td valign="baseline">
                <html:hidden property="<%=SectionBaseForm.PARM_ASSIGNMENT_STATE%>" value="<%=String.valueOf(SectionBaseForm.ASSIGNMENT_STATE_ASSIGN_OK)%>"/>
                <span class="ColRowBold">
                <p align="center">Assign <%=form.getSelectedTextbookTitle() %> as default for future sections.
                </p>
                </span>
                <span class="ColRow">
                <p align="center"><html:checkbox property="<%=SectionBaseForm.FIELD_AFFECT_EXISTING_SECTIONS%>" />
                    Also add to all existing class sections.
                </p>
                <div align="center">
                <base:showHideTag id="onConfirmDefault">
                    <base:okButton onclick="hideElementonConfirmDefault()"/>
                </base:showHideTag>
                </div>
                </span>
            </td>
        </tr>
    </base:messageBox>
<%
}

if (form.getAssignmentState() == SectionBaseForm.ASSIGNMENT_STATE_CONFIRM_REMOVE) {
%>
    <base:messageBox>
        <tr>
            <td valign="baseline" >
                <% SectionBibCountVO bsVO = form.getBibSectionCountVO(); %>
                <html:hidden property="<%=SectionBaseForm.PARM_ASSIGNMENT_STATE%>" value="<%=String.valueOf(SectionBaseForm.ASSIGNMENT_STATE_REMOVE_OK)%>"/>
                <span class="ColRowBold">
                <p align="center"><%=form.getSelectedTextbookTitle() %> will no longer be a default resource for this class.
                </p>
                </span>
                <span class="ColRow">
                <% if (bsVO.getNumberOfSectionsWithBib() > 0) { %>
                    This resource is currently assigned to <%= bsVO.getNumberOfSectionsWithBib()%> of <%= bsVO.getTotalNumberOfSections()%> sections of this class.
                    <p align="center"><html:checkbox property="<%=SectionBaseForm.FIELD_AFFECT_EXISTING_SECTIONS%>" />
                        Also remove from all existing class sections.
                <% } %>
                <p align="center">Are you sure you want to remove this title? 
                </p>
                <div align="center">
                    <base:yesNo/>
                </div>
                </span>
            </td>
        </tr>
    </base:messageBox>
<%
}
if (!StringHelper.isEmpty(form.getRemoveGroupMessage())) { %>
   <html:hidden property="<%= SectionAssetsForm.PARM_REMOVE_GROUP_ID%>"/>   
   <base:messageBox>
       <tr>
           <td valign="baseline">
               <%=form.getRemoveGroupMessage() %>
               <div align="center">
                    <base:yesNo buttonNoName="<%=SectionAssetsForm.BUTTON_CANCEL_REMOVE_GROUP%>" buttonYesName="<%=SectionAssetsForm.BUTTON_CONFIRM_REMOVE_GROUP%>"/>
                </div>
           </td>
       </tr>
   </base:messageBox>
<% } %>  

    <base:outlinedTable id="<%=SectionInfoForm.TABLE_UPDATE_CLASS%>" borderColor="#C0C0C0">
        
        <tr><td class="ColRowBold" valign="top" colspan="2" width="100%">
        <bean:write 
            name="<%= SectionAssetsForm.FORM_NAME %>" 
            property="header"/>
        </td>
          <td valign="top" class="tdAlignRight">
             <base:okButton name="<%=SectionBaseForm.BUTTON_CLOSE%>"/>
          </td>
        </tr>
        
        <tr>
            <td class="ColRowBold" colspan="3" width="100%"><base:imageLine height="1" width="100%"/></td>
        </tr>
         <% if(store.isDistrictAssetCataloger() && form.getSectionID() == null) {%>
        <tr>
            <td colspan="3">
                <table cellpadding="0" cellspacing="0" border="0">
                   <tr>
                      <td class="ColRowBold">Assign resources to class</td>
                      <td class="ColRow tdAlignLeft">
                        <html:radio property="<%=SectionAssetsForm.PARM_GROUP_SEARCH_MODE%>" value="<%=String.valueOf(SectionAssetsForm.MODE_TITLE_SEARCH)%>" onclick="changeToTitleSearch(); return false;"/>individually (each resource is required)</td>
                      </td>
                   </tr>
                   <tr>
                      <td>&nbsp;</td>
                      <td class="ColRow" valign="bottom">
                        <html:radio property="<%=SectionAssetsForm.PARM_GROUP_SEARCH_MODE%>" value="<%=String.valueOf(SectionAssetsForm.MODE_GROUP_ASSIGN)%>" onclick="changeToGroupAssign(); return false;"/>as part of a group (only one resource in the group is required)
                      </td>
                      <td>&nbsp;</td>
                   </tr>
                </table>
            </td>
        </tr>
        <logic:equal name="<%=SectionAssetsForm.FORM_NAME %>" property="<%=SectionAssetsForm.PARM_GROUP_SEARCH_MODE %>" value="<%=String.valueOf(SectionAssetsForm.MODE_GROUP_ASSIGN)%>">
            <% if (form.getUnassignedGroupsList().size() > 0) { %>
               <base:resourceClassGroupsList groupsList="<%=form.getUnassignedGroupsList() %>" formName="<%=SectionAssetsForm.FORM_NAME %>" 
                    expandedGroupID="<%=form.getExpandedGroupID() %>" classID="<%=form.getClassID()  %>" groupSearchMode="<%=form.getGroupSearchMode() %>" 
                    showAssignButton="true" />
            <% } else { %>
                <tr>
                  <td align="center" class="ColRow"> 
                      <br/>No resource class groups available for this class. <br/> 
                  </td> 
                </tr>   
            <% } %>
        </logic:equal>
         <% } %>
<!-- Resource search section -->        
<!--         <tr><td>Resource search section </td></tr> -->
	    <tr>
        <td colspan="2" valign="top">
        <table cellpadding="0" cellspacing="2" border="0" >
            <logic:equal name="<%=SectionAssetsForm.FORM_NAME %>" property="<%=SectionAssetsForm.PARM_GROUP_SEARCH_MODE %>" value="<%=String.valueOf(SectionAssetsForm.MODE_TITLE_SEARCH)%>">
                
                <td class="ColRowBold" valign="top" nowrap="true">Find </td>
                
                <bean:define id="assets" name="<%=SectionAssetsForm.FORM_NAME%>" property="assetTreeOptionList" />
                    <% if (form.isDisplayDropdown()) { %>
                        <td valign="top" >
                        &nbsp;
                            <html:select property="<%=SectionAssetsForm.FIELD_ASSET_TEMPLATE_ID%>" onchange="submitOnTemplateChange()">
                                <html:options collection="assets" property="longID" labelProperty="stringDesc"/>
                            </html:select>
                    <% } else { %>
                       <td class="ColRowBold" valign="top">
                            <%= form.getAssetTreeOptionList().getString(0)%>
                        <html:hidden property="<%= SectionAssetsForm.FIELD_ASSET_TEMPLATE_ID %>"/>
                           
                    <%} %>
                    &nbsp;
                </td>
                <td class="ColRowBold">
                    <html:text property="<%=SectionAssetsForm.FIELD_SEARCH_STRING%>" size="21" onkeypress="trapEnterJS(event)" tabindex="${tabOrder}" />  
                   in <%=form.outputAssetDropdown()%>
                </td>
                <c:set var="tabOrder" value="${tabOrder + 1}" /> 
                <td class="ColRowBold" >
                  <input type="image" tabindex="${tabOrder}" align="bottom" src='<%=lh.getLocalizedImagePath("/buttons/large/go.gif")%>' border="0" alt='<%=MessageHelper.formatMessage("go")%>' title='<%=MessageHelper.formatMessage("go")%>' name="<%=GoButtonTag.BUTTON_NAME%>"/>
                &nbsp;
                </td>
                <c:set var="tabOrder" value="${tabOrder + 1}" /> 
                                <tr>
                  <td>&nbsp;</td>
                  <td>&nbsp;</td>
                  <td class="ColRow">
                     <% if(!store.isDistrictAssetCataloger()) {%>
                        <html:checkbox property="<%= SectionAssetsForm.FIELD_ONLY_MY_SITE %>"/>Only my resources
                     <% } else {%>
                        &nbsp;
                        <html:hidden property="<%= SectionAssetsForm.FIELD_ONLY_MY_SITE %>" value="false"/>
                     <% } %>
                  </td>
                </tr>
            </logic:equal>     
        </table>
	    </td>
	    </tr>

        
        <tr><td width="100%" colspan="3">
        <%=form.outputCurrentAssetSearchList()%>
        </td></tr>

        <tr><td colspan="3" width="100%">
        <%=form.outputCurrentlyAssignedAssets()%>
        </td></tr>

       <base:resourceClassGroupsList groupsList="<%=form.getAssignedGroupsList() %>" formName="<%=SectionAssetsForm.FORM_NAME %>" 
            expandedGroupID="<%=form.getExpandedGroupID() %>" classID="<%=form.getClassID() %>" groupSearchMode="<%=form.getGroupSearchMode() %>" 
            showRemoveButton="true" />
        
    </base:outlinedTable>
</base:form>


