<%@page import="com.follett.fsc.destiny.util.ObjectHelper"%>
<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<%
    ResourceClassGroupsViewForm form = (ResourceClassGroupsViewForm) request.getAttribute(ResourceClassGroupsViewForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true"/>
<br>
<base:form action="/backoffice/servlet/handleresourceclassgroupsviewform.do">
<% if (!StringHelper.isEmpty(form.getDeleteGroupMessage())) { %>
   <html:hidden property="<%= ResourceClassGroupsViewForm.PARM_DELETE_GROUP_ID%>"/>   
   <base:messageBox>
       <tr>
           <td valign="baseline">
               <%=form.getDeleteGroupMessage() %>
               <div align="center">
                    <base:yesNo buttonNoName="<%=ResourceClassGroupsViewForm.BUTTON_CANCEL_DELETE%>" buttonYesName="<%=ResourceClassGroupsViewForm.BUTTON_CONFIRM_DELETE%>"/>
                </div>
           </td>
       </tr>
   </base:messageBox>
<% } %>  
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true" name="<%=ResourceClassGroupsViewForm.FIELD_TRAP_ENTER_PRESSED%>">
    <base:outlinedTableAndTabsWithinThere id="<%=ResourceClassGroupsViewForm.TABLE_MAIN%>" selectedTab="<%=UpdateClassesNavigationForm.TAB_RESOURCE_CLASS_GROUPS%>" tabs="<%=form.getTabs()%>" >
    <tr>
        <td>
            <table id="<%=ResourceClassGroupsViewForm.TABLE_PAGE_HEADER%>" border="0" cellpadding="2" style="border-collapse: collapse" width="100%" >
            <tr>
                <td class="TableHeading">Resource Class Groups</td>
            </tr>
            <tr>
                <td class="tdAlignCenter">
                    <html:text property="<%=ResourceClassGroupsViewForm.FIELD_GROUP_NAME%>" size="20" maxlength="100"/>
                    <base:genericButton name="<%=ResourceClassGroupsViewForm.BUTTON_NAME_ADD_GROUP%>" alt="<%=ResourceClassGroupsViewForm.ALT_ADD_GROUP%>" src="/buttons/large/addclassgroup.gif" absbottom="true"/>
                </td>
            </tr>
            </table>
        </td>
    </tr>
    <base:resourceClassGroupsList groupsList="<%=form.getGroupsList() %>" formName="<%=ResourceClassGroupsViewForm.FORM_NAME %>" 
        expandedGroupID="<%=form.getExpandedGroupID() %>" />
    </base:outlinedTableAndTabsWithinThere>
    
</base:form>
