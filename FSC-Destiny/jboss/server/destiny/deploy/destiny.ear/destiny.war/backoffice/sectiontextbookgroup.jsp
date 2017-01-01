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
    SectionTextbookGroupForm form = (SectionTextbookGroupForm)request.getAttribute(SectionTextbookGroupForm.FORM_NAME);
%>
<script language="JavaScript">
<!--
    function trapEnterJS(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        document.<%=SectionTextbookGroupForm.FORM_NAME%>.<%=SectionTextbookGroupForm.FIELD_TRAP_ENTER_PRESSED%>.value=true;
        document.<%=SectionTextbookGroupForm.FORM_NAME%>.submit();
      }
      return true;
    }
//-->
</script>

<br>

<base:form action="/backoffice/servlet/handlesectiontextbookgroupform.do" focus="<%=SectionBaseForm.FIELD_SEARCH_STRING%>">
    <html:hidden property="<%= SectionBaseForm.FIELD_TRAP_ENTER_PRESSED %>" value="false"/>
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=SectionBaseForm.BUTTON_TRAP_ENTER%>">

<html:hidden property="<%=SectionBaseForm.PARM_SECTION_ID%>"/>
<html:hidden property="<%=SectionBaseForm.PARM_CURRENT_SEARCH_STRING%>"/>
<html:hidden property="<%=SectionBaseForm.PARM_CURRENT_SEARCH_TYPE%>"/>
<html:hidden property="<%=SectionBaseForm.PARM_CLASS_ID%>"/>
<html:hidden property="<%=SectionBaseForm.PARM_ASSIGN_TO_CLASSID%>"/>
<html:hidden property="<%=SectionBaseForm.PARM_REMOVE_FROM_ID%>"/>
<html:hidden property="<%=SectionBaseForm.PARM_CLASS_GROUP_ID%>"/>

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
                <p align="center">Group "<%=form.getSelectedTextbookTitle() %>" will no longer be a default textbook for this class.
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
<% } %>

    <base:outlinedTable id="<%=SectionInfoForm.TABLE_UPDATE_CLASS%>" borderColor="#C0C0C0">
        
        <tr><td class="ColRowBold" colspan="3" width="100%">
        <bean:write 
            name="<%= SectionTextbookGroupForm.FORM_NAME %>" 
            property="header"/>
        </td></tr>
        
	    <tr>
	        <td class="ColRowBold" colspan="3" width="100%"><base:imageLine height="1" width="100%"/></td>
	    </tr>
	    
	    <tr>
	    <td colspan="2" valign="top">
	       <table cellpadding="2" cellspacing="0" border="0" width="100%">
        	    <tr>
        	      <td class="ColRowBold" valign="top" width="10%" nowrap="true">Find Textbook</td>
                  <td valign="top" class="ColRowBold" nowrap="true">
                     <span onKeyPress="return trapEnterJS(event);">
                     <html:text property="<%= SectionTextbookGroupForm.FIELD_SEARCH_STRING %>"  size="20"/>
                     </span>
                     in 
                     <%=form.outputTextbookDropdown()%>
                     <base:goButton absbottom="true"/>
        	      </td>
	       
	       	      <td valign="top" class="tdAlignRight">
                     <base:okButton name="<%=SectionBaseForm.BUTTON_CLOSE%>"/>
	              </td>
                </tr>
	       
        	    <tr>
        	      <td>&nbsp;</td>
        	      <td class="ColRow">
                     <% if(!store.isDistrictTextbookCataloger()) {%>
                        <html:checkbox property="<%= SectionTextbookGroupForm.FIELD_ONLY_MY_SITE %>"/>Only my textbooks
                     <% } else {%>
                        &nbsp;
                        <html:hidden property="<%= SectionTextbookGroupForm.FIELD_ONLY_MY_SITE %>" value="false"/>
                     <% } %>
                  </td>
        	    </tr>
	       </table>
	    </td>
	    </tr>
        
        <tr><td width="100%" colspan="3">
        <%=form.outputCurrentSearchList()%>
        </td></tr>


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


