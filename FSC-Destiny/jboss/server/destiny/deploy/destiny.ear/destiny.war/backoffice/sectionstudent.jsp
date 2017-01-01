<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>

<base:messageBox strutsErrors="true"/>

<%SessionStoreProxy store = SessionStoreProxy
                .getSessionStore(request);
            SectionStudentForm form = (SectionStudentForm) request
                .getAttribute(SectionStudentForm.FORM_NAME);
            Long siteID = null;
            if (!form.isOnlyMySite()) {
                siteID = store.getSiteID();
            }
%>

<br>

<base:form action="/backoffice/servlet/handlesectionstudentform.do" focus="<%=SectionBaseForm.FIELD_SEARCH_STRING%>">
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=SectionBaseForm.BUTTON_TRAP_ENTER%>">
    <html:hidden property="<%=SectionBaseForm.PARM_SECTION_ID%>"/>
    <html:hidden property="<%=SectionBaseForm.PARM_CURRENT_SEARCH_STRING%>"/>
	<html:hidden property="<%=SectionBaseForm.PARM_CURRENT_SEARCH_TYPE%>"/>
	<html:hidden property="<%=SectionBaseForm.PARAM_ONLY_MY_PATRONS_CHANGED%>" value="false"/>

<script language="JavaScript" type="text/javascript">
<!--
function onlyMyPatronsChecked() {
    document.<%=SectionStudentForm.FORM_NAME%>.<%=SectionBaseForm.PARAM_ONLY_MY_PATRONS_CHANGED%>.value = "true";
    document.<%=SectionStudentForm.FORM_NAME%>.submit();
}

//-->
</script>


    <base:outlinedTable id="<%=SectionInfoForm.TABLE_UPDATE_CLASS%>" borderColor="#C0C0C0">
        
        <tr><td class="ColRowBold" colspan="3" width="100%">
        <bean:write 
            name="<%= SectionStudentForm.FORM_NAME %>" 
            property="header"/>
        </td></tr>
	   <tr>
	       <td background="/images/icons/general/thickline.gif" nowrap="nowrap" width="100%" colspan="3">
	           <span class="ColRow">&nbsp;</span><span class="SectionHeader">Estimate</span>
	       </td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight">Enrollment</td>
            <td width="100%"><html:text
                property="<%=SectionStudentForm.FIELD_ENROLLMENT_COUNT%>"
                size="5" maxlength="3" /></td>
            <td class="ColRowBold tdAlignRight"><base:showHideTag
                id="onSave">
                <base:okButton onclick="hideElementonSave()" name="<%=SectionStudentForm.BUTTON_CLOSE%>" />
            </base:showHideTag></td>
        </tr>

       <tr>
           <td background="/images/icons/general/thickline.gif" nowrap="nowrap" width="100%" colspan="3">
               <span class="ColRow">&nbsp;</span><span class="SectionHeader">Actual</span>
           </td>
        </tr>
	    <tr>
	      <td class="ColRowBold tdAlignRight" nowrap>Find Student</td>
          <td class="ColRowBold" colspan="2" width="100%">
             <html:text property="<%= SectionStudentForm.FIELD_SEARCH_STRING %>"  size="24"/>
             in 
             <base:selectPatronByType name="<%=SectionStudentForm.FIELD_SEARCH_TYPE%>" selected='<%="" + form.getSearchType()%>' onlyMyPatrons = "<%=form.isOnlyMySite()%>" returnAllEvenIfWeFindAMatchByBarcode="true"/>
             <base:goButton absbottom="true"/>
          </td>
        </tr>	       
	       
	    <tr>
	      <td>&nbsp;</td>
	      <td class="ColRow" colspan="2"><html:checkbox onclick="onlyMyPatronsChecked()" property="<%= SectionStudentForm.FIELD_ONLY_MY_SITE %>"/><%= form.getPatronCheckboxText() %></td>
	    </tr>

        <tr><td width="100%" colspan="3">
        <%=form.outputCurrentSearchList()%>
        </td></tr>


        <tr><td colspan="3" width="100%">
        <%=form.outputCurrentlyAssigned()%>
        </td></tr>
        
    </base:outlinedTable>
</base:form>


