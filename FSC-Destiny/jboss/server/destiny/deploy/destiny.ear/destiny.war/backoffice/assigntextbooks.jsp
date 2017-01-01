<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>


<base:messageBox strutsErrors="true"/>

<%
    AssignTextbooksForm form = (AssignTextbooksForm)request.getAttribute(AssignTextbooksForm.FORM_NAME);
%>

<br>

<base:form action="/backoffice/servlet/handleassigntextbooksform.do" focus="<%=AssignTextbooksForm.FIELD_SEARCH_STRING%>">
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=AssignTextbooksForm.BUTTON_TRAP_ENTER%>">

<html:hidden property="<%=AssignTextbooksForm.PARM_CLASS_NAME%>"/>
<html:hidden property="<%=AssignTextbooksForm.PARM_SECTION_INDEX%>"/>
<html:hidden property="<%=AssignTextbooksForm.PARM_DEPARTMENT_NAME%>"/>
<html:hidden property="<%=AssignTextbooksForm.PARM_CURRENT_SEARCH_STRING%>"/>
<html:hidden property="<%=AssignTextbooksForm.PARM_CURRENT_SEARCH_TYPE%>"/>
<html:hidden property="<%=AssignTextbooksForm.PARM_BIBID_TO_ASSIGN%>"/>
<html:hidden property="<%=AssignTextbooksForm.PARM_BIBID_TO_REMOVE%>"/>
<html:hidden property="<%=AssignTextbooksForm.PARM_BIBID_TO_CONFIRM%>"/>
<html:hidden property="<%=AssignTextbooksForm.PARM_TITLE_TO_ASSIGN_OR_REMOVE%>"/>

<logic:equal name="<%=AssignTextbooksForm.FORM_NAME%>" property="<%=AssignTextbooksForm.PARM_SHOW_INFO_MESSAGE%>" value="true" scope="request">
    <base:messageBox>
    <tr>
        <td valign="baseline" class="Error">Please note...<br/><%=form.getInfoMessage()%></td>
    </tr>
    </base:messageBox>
</logic:equal>

<logic:equal name="<%=AssignTextbooksForm.FORM_NAME%>" property="<%=AssignTextbooksForm.PARM_SHOW_REMOVE_CONFIRMATION%>" value="true" scope="request">
        <%                         
            String[] messageText = new String[]{"Are you sure you want to remove this title?"};                            
        %>
        <base:confirmBox showWarningIcon="false" filterMessage="false"
            header="Please note...<br/>Removing the textbook from this class will also remove it from the class's sections for this forecast report."           
            messageText="<%=messageText%>"
            yesName="<%=AssignTextbooksForm.BUTTON_CONFIRM_REMOVE_YES%>"
            noName="<%=AssignTextbooksForm.BUTTON_CONFIRM_REMOVE_NO%>"
        />       
</logic:equal>

<base:outlinedTable id="<%=AssignTextbooksForm.TABLE_UPDATE_CLASS%>" borderColor="#C0C0C0">
        
        <tr><td class="ColRowBold" colspan="3" width="100%">
        <bean:write 
            name="<%= AssignTextbooksForm.FORM_NAME %>" 
            property="header"/>
        </td></tr>
        
        <tr>
            <td class="ColRowBold" colspan="3" width="100%"><base:imageLine height="1" width="100%"/></td>
        </tr>
        
        <tr>
        <td colspan="2" valign="top">
           <table cellpadding="2" cellspacing="0" border="0" width="100%" id="<%=AssignTextbooksForm.TABLE_SEARCH %>">
                <tr>
                  <td class="ColRowBold" valign="top" width="10%" nowrap>Find Textbook</td>
                  
                  <td valign="top" class="ColRowBold" >
                     <html:text property="<%= AssignTextbooksForm.FIELD_SEARCH_STRING %>"  size="24"/>
                     in 
                     <%=form.outputTextbookDropdown()%>
                     <base:goButton absbottom="true"/>
                  </td>
           
                  <td valign="top" class="tdAlignRight">
                    <base:closeButton withX="true"/>
                  </td>
                </tr>          
           
                <tr>
                  <td>&nbsp;</td>
                  <td class="ColRow"><html:checkbox property="<%= AssignTextbooksForm.FIELD_ONLY_MY_SITE %>"/>Only my textbooks</td>
                </tr>
           </table>
        </td>
        </tr>
        
        <tr><td width="100%" colspan="3">
        <%=form.outputCurrentSearchList()%>
        </td></tr>


        <tr><td colspan="3" width="100%">
        <%=form.outputCurrentlyAssigned()%>
        </td></tr>
        
        <tr>
            <td width="100%" colspan="3" class="Instruction">
            * = Default textbook
            </td>
        </tr>
        
    </base:outlinedTable>
</base:form>


