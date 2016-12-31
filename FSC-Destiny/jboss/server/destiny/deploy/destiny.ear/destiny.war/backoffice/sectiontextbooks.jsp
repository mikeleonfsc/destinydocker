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

<base:messageBox strutsErrors="true"/>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    SectionTextbooksForm form = (SectionTextbooksForm)request.getAttribute(SectionTextbooksForm.FORM_NAME);
%>
<script language="JavaScript">
<!--
    function trapEnterJS(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        document.<%=SectionTextbooksForm.FORM_NAME%>.<%=SectionTextbooksForm.FIELD_TRAP_ENTER_PRESSED%>.value=true;
        document.<%=SectionTextbooksForm.FORM_NAME%>.submit();
      }
      return true;
    }
    
    function changeToTitleSearch() {
        document.<%=SectionTextbooksForm.FORM_NAME%>.<%=SectionTextbooksForm.PARM_GROUP_SEARCH_MODE%>.value = "<%=SectionTextbooksForm.MODE_TITLE_SEARCH%>";
        document.<%=SectionTextbooksForm.FORM_NAME%>.submit();
    }
    
    function changeToGroupEdit() {
        document.<%=SectionTextbooksForm.FORM_NAME%>.<%=SectionTextbooksForm.PARM_GROUP_SEARCH_MODE%>.value = "<%=SectionTextbooksForm.MODE_GROUP_EDIT%>";
        document.<%=SectionTextbooksForm.FORM_NAME%>.submit();
    }
//-->
</script>

<br>

<base:form action="/backoffice/servlet/handlesectiontextbooksform.do" focus="<%=SectionBaseForm.FIELD_SEARCH_STRING%>">
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
<html:hidden property="<%=SectionTextbooksForm.PARM_LAST_GROUP_SEARCH_MODE%>"/>

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
                <p align="center"><%=form.getSelectedTextbookTitle() %> will no longer be a default textbook for this class.
                </p>
                </span>
                <span class="ColRow">
                <% if (bsVO.getNumberOfSectionsWithBib() > 0) { %>
                    This textbook is currently assigned to <%= bsVO.getNumberOfSectionsWithBib()%> of <%= bsVO.getTotalNumberOfSections()%> sections of this class.
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

if (form.getAssignmentState() == SectionBaseForm.ASSIGNMENT_STATE_CONFIRM_REMOVE_GROUP) {
%>
    <base:messageBox>
        <tr>
            <td valign="baseline" >
                <% SectionBibCountVO bsVO = form.getBibSectionCountVO(); %>
                <html:hidden property="<%=SectionBaseForm.PARM_ASSIGNMENT_STATE%>" value="<%=String.valueOf(SectionBaseForm.ASSIGNMENT_STATE_REMOVE_OK)%>"/>
                <span class="ColRowBold">
                <p align="center"><%=form.getDeleteGroupName() %> will no longer be associated with this class.
                </p>
                </span>
                <span class="ColRow">
                All textbooks in this group will also be removed from all sections of this class.
                <p align="center">Are you sure you want to remove this group? 
                </p>
                <div align="center">
                    <base:yesNo/>
                </div>
                </span>
            </td>
        </tr>
    </base:messageBox>
<% } %>

    <base:outlinedTable id="<%=SectionInfoForm.TABLE_UPDATE_CLASS%>" borderColor="#C0C0C0">
        
        <tr><td class="ColRowBold" valign="top" colspan="2" width="100%">
        <bean:write 
            name="<%= SectionTextbooksForm.FORM_NAME %>" 
            property="header"/>
        </td>
          <td valign="top" class="tdAlignRight">
             <base:okButton name="<%=SectionBaseForm.BUTTON_CLOSE%>"/>
          </td>
        </tr>
        
        <tr>
            <td class="ColRowBold" colspan="3" width="100%"><base:imageLine height="1" width="100%"/></td>
        </tr>
        <% if(store.isDistrictTextbookCataloger() && form.getSectionID() == null) {%>
        <tr>
            <td colspan="3">
                <table cellpadding="0" cellspacing="0" border="0">
                   <tr>
                      <td class="ColRowBold">Assign textbooks to class</td>
                      <td class="ColRow tdAlignLeft">
                        <html:radio property="<%=SectionTextbooksForm.PARM_GROUP_SEARCH_MODE%>" value="<%=String.valueOf(SectionTextbooksForm.MODE_TITLE_SEARCH)%>" onclick="changeToTitleSearch(); return false;"/>individually (each title is required)</td>
                      </td>
                   </tr>
                   <tr>
                      <td>&nbsp;</td>
                      <td class="ColRow" valign="bottom">
                        <html:radio property="<%=SectionTextbooksForm.PARM_GROUP_SEARCH_MODE%>" value="<%=String.valueOf(SectionTextbooksForm.MODE_GROUP_EDIT)%>" onclick="changeToGroupEdit(); return false;"/>as part of a group (only one title in the group is required)
                        
                        <logic:equal name="<%=SectionTextbooksForm.FORM_NAME %>" property="<%=SectionTextbooksForm.PARM_GROUP_SEARCH_MODE %>" value="<%=String.valueOf(SectionTextbooksForm.MODE_GROUP_EDIT)%>">
                           <br>&nbsp;&nbsp;&nbsp;&nbsp;<span onKeyPress="return trapEnterJS(event);"><html:text property="<%=SectionBaseForm.FIELD_GROUP_NAME%>" size="20" maxlength="100"/></span>
                           <base:genericButton name="<%=SectionBaseForm.BUTTON_NAME_ADD_GROUP %>" alt="<%=SectionBaseForm.ALT_ADD_GROUP %>" src="/buttons/large/addclassgroup.gif" absbottom="true"/>
                        </logic:equal>
                      </td>
                      <td>&nbsp;</td>
                   </tr>
                </table>
            </td>
        </tr>
        <% } %>
        <logic:equal name="<%=SectionTextbooksForm.FORM_NAME %>" property="<%=SectionTextbooksForm.PARM_GROUP_SEARCH_MODE %>" value="<%=String.valueOf(SectionTextbooksForm.MODE_TITLE_SEARCH)%>">
	    <tr>
	    <td colspan="2" valign="top">
	       <table cellpadding="2" cellspacing="0" border="0" width="100%">
        	    <tr>
        	      <td class="ColRowBold" valign="top" width="10%" nowrap="true">Find Textbook</td>
                  <td valign="top" class="ColRowBold" nowrap="true">
                     <span onKeyPress="return trapEnterJS(event);">
                     <html:text property="<%= SectionTextbooksForm.FIELD_SEARCH_STRING %>"  size="20"/>
                     </span>
                     in 
                     <%=form.outputTextbookDropdown()%>
                     <base:goButton absbottom="true"/>
        	      </td>
	       
	       	      <td valign="top" class="tdAlignRight">&nbsp;</td>
                </tr>
        	    <tr>
        	      <td>&nbsp;</td>
        	      <td class="ColRow">
                     <% if(!store.isDistrictTextbookCataloger()) {%>
                        <html:checkbox property="<%= SectionTextbooksForm.FIELD_ONLY_MY_SITE %>"/>Only my textbooks
                     <% } else {%>
                        &nbsp;
                        <html:hidden property="<%= SectionTextbooksForm.FIELD_ONLY_MY_SITE %>" value="false"/>
                     <% } %>
                  </td>
        	    </tr>
	       </table>
	    </td>
	    </tr>
        
        <tr><td width="100%" colspan="3">
        <%=form.outputCurrentSearchList()%>
        </td></tr>
        </logic:equal>      


        <tr><td colspan="3" width="100%">
        <%=form.outputCurrentlyAssigned(false)%>
        </td></tr>
        
        <tr>
            <td width="100%" colspan="3" class="Instruction">
            * = Default textbook
            </td>
        </tr>
        
    </base:outlinedTable>
</base:form>


