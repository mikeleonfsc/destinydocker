<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.DepartmentEditForm"%>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    DepartmentEditForm form = (DepartmentEditForm)request.getAttribute(DepartmentEditForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
%>

<base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handledepartmenteditform.do" focus="<%= DepartmentEditForm.FIELD_DEPARTMENT_NAME %>">
    <jsp:include page="/common/msdewarning.jsp" flush="true" />
    
<html:hidden property="<%= DepartmentEditForm.PARAM_DEPARTMENT_ID %>"/>
<html:hidden property="<%= DepartmentEditForm.PARAM_DEPARTMENT_HEAD_ID %>"/>
<html:hidden property="<%= DepartmentEditForm.FIELD_LOCAL_SITE_ID %>"/>
<html:hidden property="<%= DepartmentEditForm.PARAM_DEPARTMENT_LOCAL_APPEARS %>"/>
<html:hidden property="<%= DepartmentEditForm.PARAM_INCLUDE_LOCAL_DEPARTMENTS %>"/>
<html:hidden property="<%= DepartmentEditForm.PARAM_LOCAL_CHECKBOX_CLICKED %>" value="false"/>
<html:hidden property="fromSiteConfig"/>
<!-- Always propagate a collection type, even though most forms will not use it -->
<html:hidden property="collectionType"/>

<script language="JavaScript" type="text/javascript">
  <!--
    function submitLocalCheckbox() {    
        document.<%=DepartmentEditForm.FORM_NAME%>.<%=DepartmentEditForm.PARAM_LOCAL_CHECKBOX_CLICKED%>.value = true;           
        document.<%=DepartmentEditForm.FORM_NAME%>.submit();
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

<base:outlinedTable id="<%=DepartmentEditForm.TABLE_OUTLINE_EDIT%>" borderColor="#C0C0C0">
    
     <tr>
            <td class="ColRowBold tdAlignRight">
                * Department Name
            </td>
            <td>
                <html:text property="<%= DepartmentEditForm.FIELD_DEPARTMENT_NAME %>" size="40" maxlength="50"/>
            </td>
            <td>
            <td valign="top" rowspan="3" class="ColRowBold">
                <base:showHideTag id="onSave">
                    <table border="0" cellspacing="0" cellpadding="0">
                    <tr>
                        <td class="tdAlignRight">
                            <base:saveButton onclick="hideElementonSave()" name="<%= DepartmentEditForm.BUTTON_NAME_SAVE %>" />
                        </td>
                    </tr>
                    <tr>
                        <td class="tdAlignRight">
                            <base:cancelButton name="<%= DepartmentEditForm.BUTTON_NAME_CANCEL %>" />
                        </td>
                    </tr>
                    </table>
                </base:showHideTag>
            </td>
     </tr>
     <base:isNotDistrictUser>
     <logic:equal name="<%= DepartmentEditForm.FORM_NAME %>" property="<%= DepartmentEditForm.PARAM_INCLUDE_LOCAL_DEPARTMENTS%>" value="true">
         <tr>
                <td class="tdAlignRight">
                    <logic:equal name="<%= DepartmentEditForm.FORM_NAME %>" property="<%= DepartmentEditForm.PARAM_DEPARTMENT_LOCAL_APPEARS %>" value="false"> 
                        <base:image src="/icons/general/check_19.gif"/>
                        <html:hidden property="<%=DepartmentEditForm.FIELD_DEPARTMENT_LOCAL%>"/>
                    </logic:equal>
                    <logic:equal name="<%= DepartmentEditForm.FORM_NAME %>" property="<%= DepartmentEditForm.PARAM_DEPARTMENT_LOCAL_APPEARS %>" value="true"> 
                        <html:checkbox  onclick="submitLocalCheckbox()" property="<%=DepartmentEditForm.FIELD_DEPARTMENT_LOCAL%>"/>
                    </logic:equal>
                </td>
                <td class="ColRowBold">
                    Local Department
                </td>
         </tr>
    </logic:equal>
     <logic:equal name="<%= DepartmentEditForm.FORM_NAME %>" property="<%= DepartmentEditForm.PARAM_INCLUDE_LOCAL_DEPARTMENTS%>" value="false">
        <html:hidden property="<%=DepartmentEditForm.FIELD_DEPARTMENT_LOCAL%>" value="false"/>
     </logic:equal>
    </base:isNotDistrictUser>
    <base:isDistrictUser>
        <html:hidden property="<%=DepartmentEditForm.FIELD_DEPARTMENT_LOCAL%>" value="false"/>
    </base:isDistrictUser>
     <logic:present name="<%= DepartmentEditForm.FORM_NAME %>" property="<%= DepartmentEditForm.FIELD_MESSAGE_ASSOCIATED%>">
        <tr>
            <td></td>
            <td class="ColRow">
                <bean:write name="<%= DepartmentEditForm.FORM_NAME %>" property="<%= DepartmentEditForm.FIELD_MESSAGE_ASSOCIATED%>" filter="false"/>
            </td>
        </tr>               
     </logic:present>
     <%if(!store.isDistrictTextbookCataloger()){ %>
        <% if(store.isAssetSite() && (form.isDepartmentLocal() || !form.isDepartmentLocalAppears()) && form.isIncludeLocalDepartments()) { %>
         <tr>
                <td class="ColRowBold tdAlignRight">
                    Head of Department
                </td>
                <td>
                    <table id="<%=DepartmentEditForm.TABLE_DEPARTMENT_HEAD%>" border="0" cellspacing="0" cellpadding="0"><tr>
                        <td valign="center" class="ColRow">
                            <bean:write name="<%= DepartmentEditForm.FORM_NAME %>" property="<%= DepartmentEditForm.FIELD_DEPARTMENT_HEAD_NAME %>" filter="true"/>
                        </td>
                        <td valign="center">
                            &nbsp;&nbsp;<base:genericButton src="/buttons/large/selectplus.gif" alt="<%= DepartmentEditForm.ALT_TEXT_DEPARTMENT_HEAD %>" name="<%= DepartmentEditForm.BUTTON_NAME_DEPARTMENT_HEAD %>" />
                        </td>
                        
                        <logic:present name="<%= DepartmentEditForm.FORM_NAME %>" property="<%= DepartmentEditForm.PARAM_DEPARTMENT_HEAD_ID %>">
                            <td valign="center">
                                &nbsp;&nbsp;<base:genericButton src="/buttons/large/clear.gif" alt="<%= DepartmentEditForm.ALT_TEXT_DEPARTMENT_HEAD_CLEAR %>" name="<%= DepartmentEditForm.BUTTON_NAME_DEPARTMENT_HEAD_CLEAR %>" />
                            </td>   
                        </logic:present>
                    </tr></table>
                </td>
         </tr>
         <% } %>
         <%} %>

</base:outlinedTable>
</base:form>
