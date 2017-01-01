<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<%@page import="com.follett.fsc.destiny.client.district.servlet.DistrictEditUserForm" %>
<%@page import="com.follett.fsc.destiny.entity.ejb3.PatronSpecs"%>
<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    DistrictEditUserForm form = (DistrictEditUserForm)request.getAttribute(DistrictEditUserForm.FORM_NAME);
%>


<%@page import="com.follett.fsc.common.LocaleHelper"%>
<bean:define id="districtRoleTypes" name="<%=DistrictEditUserForm.FORM_NAME%>" property="districtRoleTypesList" />
<bean:define id="districtWarehouseRoleTypes" name="<%=DistrictEditUserForm.FORM_NAME%>" property="districtWarehouseRoleTypesList" />

<base:messageBox strutsErrors="true"/>

<base:form action="/district/servlet/handledistrictedituserform.do" focus="userName" method="post">
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=DistrictEditUserForm.BUTTON_TRAP_ENTER%>">
    <html:hidden property="userID" />
    <html:hidden property="breadcrumbText" />
    <html:hidden property="encryptedPassword" />
    <input type="hidden" name="<%=DistrictEditUserForm.PARAM_NAME_REDISPLAY%>" value="false">
    <input type="hidden" name="<%=DistrictEditUserForm.PARAM_NAME_DISTRICT_WAREHOUSE_REDISPLAY%>" value="false">
    <html:hidden property="<%=DistrictEditUserForm.FIELD_SITE_ACCESS_OLD%>" />
    <html:hidden property="<%=DistrictEditUserForm.FIELD_DISTRICT_WAREHOUSE_ACCESS_OLD%>" />
    <input type="hidden" name="<%=DistrictEditUserForm.PARAM_ACCESS_LEVEL_CHANGED%>" value="false">
    <input type="hidden" name="<%=DistrictEditUserForm.PARAM_ACCESS_TYPE_CHANGED%>" value="false">


<script language="JavaScript" type="text/javascript">
  <!--
    function submitSiteAccess() {
        document.<%=DistrictEditUserForm.FORM_NAME%>.<%=DistrictEditUserForm.PARAM_NAME_REDISPLAY%>.value = "true";
        document.<%=DistrictEditUserForm.FORM_NAME%>.submit();
    }
  
    function submitAccessTypeChange() {
    	 document.<%=DistrictEditUserForm.FORM_NAME%>.<%=DistrictEditUserForm.PARAM_ACCESS_TYPE_CHANGED%>.value = "true";
         document.<%=DistrictEditUserForm.FORM_NAME%>.submit();
    }

    function submitDistrictWarehouseAccess() {
        document.<%=DistrictEditUserForm.FORM_NAME%>.<%=DistrictEditUserForm.PARAM_NAME_DISTRICT_WAREHOUSE_REDISPLAY%>.value = "true";
        document.<%=DistrictEditUserForm.FORM_NAME%>.submit();
    }
    
    function submitAccessLevelChanged() {
    	document.<%=DistrictEditUserForm.FORM_NAME%>.<%=DistrictEditUserForm.PARAM_ACCESS_LEVEL_CHANGED%>.value = "true";
    	document.<%=DistrictEditUserForm.FORM_NAME%>.submit();
    }

  // -->
</script>

<table border="0" cellspacing="0" cellpadding="3" align="center">
<tr>
    <td>
        <base:outlinedTable borderColor="#c0c0c0" id="siteTable" width="100%">

        <tr>
            <td class="FormLabel tdAlignRight">
                User&nbsp;Name
            </td>
            <td>
                <%-- Make this 10 a constant when the user entity comes into being --%>
                <html:text property="<%=DistrictEditUserForm.FIELD_USER_NAME %>" size="10" maxlength='<%=""+PatronSpecs.LENGTH_LOGINID %>'/>
            </td>
        </tr>

        <logic:notEqual name="district_servlet_DistrictEditUserForm" property="userID" value="0">
        <tr>
            <td class="FormLabel tdAlignRight">
                Current&nbsp;Password
            </td>
            <td>
                <input type="password" name="<%=DistrictEditUserForm.FIELD_CURRENT_PASSWORD%>" size="10" autocomplete="off" value='<%= form.getCurrentPassword() == null ? "" : form.getCurrentPassword() %>'/>                
            </td>
        </tr>
        </logic:notEqual>


        <tr>
            <td class="FormLabel tdAlignRight">
                New&nbsp;Password
            </td>
            <td>
                <input type="password" name="<%=DistrictEditUserForm.FIELD_PASSWORD%>" size="10" autocomplete="off" value='<%= form.getPassword() == null ? "" : form.getPassword() %>'/>
            </td>
        </tr>

        <tr>
            <td class="FormLabel tdAlignRight">
                Confirm&nbsp;Password
            </td>
            <td>
                <input type="password" name="<%=DistrictEditUserForm.FIELD_CONFIRM_PASSWORD%>" size="10" autocomplete="off" value='<%= form.getConfirmPassword() == null ? "" : form.getConfirmPassword() %>'/>
            </td>
        </tr>
        <base:isNotStateContext>
        <tr>
            <td class="FormLabel tdAlignRight">
                &nbsp;
            </td>
            <td class="ColRow"><html:checkbox property="<%=DistrictEditUserForm.CHECKBOX_CATALOGING_ADMIN%>"  onclick="submitAccessTypeChange()" />
            Manage Library Materials for the District
            </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight">
                &nbsp;
            </td>
            <td class="ColRow">&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="<%=DistrictEditUserForm.CHECKBOX_DISTRICT_BATCH_REQUEST%>"  onclick="submitAccessTypeChange()" />
                Create District Collections Stats by Library via Batch Request
                <base:helpTag helpFileName="d_LM_dist_collections_batch.htm"/>
            </td>
        </tr>
    <% if (!LocaleHelper.isInternationalProduct()) { %>
        <tr>
            <td class="FormLabel tdAlignRight">
                &nbsp;
            </td>
            <td class="ColRow"><html:checkbox property="<%=DistrictEditUserForm.CHECKBOX_TEXTBOOK_ADMIN%>"  onclick="submitAccessTypeChange()" />
            Manage Textbooks for the District
            </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight">
                &nbsp;
            </td>
            <td class="ColRow">&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="<%=DistrictEditUserForm.CHECKBOX_TEXTBOOK_DASHBOARD%>" onclick="submitAccessTypeChange()" />
            Display Textbook Dashboard
            </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight">
                &nbsp;
            </td>
            <td class="ColRow"><html:checkbox property="<%=DistrictEditUserForm.CHECKBOX_ASSET_ADMIN%>" onclick="submitAccessTypeChange()" />
            Manage Resources for the District
            </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight">
                &nbsp;
            </td>
            <td class="ColRow">&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="<%=DistrictEditUserForm.CHECKBOX_ASSET_DASHBOARD%>" onclick="submitAccessTypeChange()" />
            Display Resource Dashboard
            </td>
        </tr>
    <% } %>

        <tr>
            <td class="FormLabel tdAlignRight">
                &nbsp;
            </td>
            <td class="ColRow"><html:checkbox property="<%=DistrictEditUserForm.CHECKBOX_PATRON_ADMIN%>" onclick="submitAccessTypeChange()" />
            Manage Patrons for the District
            </td>
        </tr>

        <tr>
            <td class="FormLabel tdAlignRight">
                &nbsp;
            </td>
            <td class="ColRow"><html:checkbox property="<%=DistrictEditUserForm.CHECKBOX_REPORT_ADMIN%>" onclick="submitAccessTypeChange()" />
                Create Reports for the District
            </td>
        </tr>
        
        <tr>
            <td class="FormLabel tdAlignRight">
                &nbsp;
            </td>
            <td class="ColRow"><html:checkbox property="<%=DistrictEditUserForm.CHECKBOX_SITE_ACCESS%>" onclick="submitSiteAccess()" />
                Allow site access
                <base:helpTag helpFileName="d_district_user_site_access.htm"/>
            </td>
        </tr>
        
        <logic:equal name="<%=DistrictEditUserForm.FORM_NAME %>" property="<%=DistrictEditUserForm.CHECKBOX_SITE_ACCESS%>" value="true"> 
        <tr>
            <td class="FormLabel tdAlignRight">
                &nbsp;
            </td>
            <td class="FormLabel">
                &nbsp;&nbsp;&nbsp;&nbsp;
                <html:select
                                        property="<%= DistrictEditUserForm.FIELD_DISTRICT_ROLE_ID %>"
                                        onchange="submitAccessLevelChanged()">
                                        <html:options
                                            collection="districtRoleTypes"
                                            property="longID"
                                            labelProperty="stringDesc" />
                                    </html:select> <base:genericButton absbottom="true" name="<%=DistrictEditUserForm.BUTTON_OTHER %>" src="/buttons/large/other.gif" alt="<%=DistrictEditUserForm.ALT_OTHER_ACCESS_LEVEL%>"/>
            </td>
        </tr>
        <tr>
                <td class="FormLabel tdAlignRight">
                    &nbsp;
                </td>
                <td class="FormLabel">
                    &nbsp;&nbsp;&nbsp;&nbsp;
                   
                    <% if (form.showAssetGroup()) { %>
                        <%=form.buildAssetGroupList() %>
                    <% } %>
                </td>
        </tr>
        </logic:equal>
        
        <logic:equal name="<%=DistrictEditUserForm.FORM_NAME %>" property="<%=DistrictEditUserForm.PARAM_DISPLAY_DISTRICT_WAREHOUSE_PERMISSION%>" value="true"> 
            <tr>
                <td class="FormLabel tdAlignRight">
                    &nbsp;
                </td>
                <td class="ColRow"><html:checkbox property="<%=DistrictEditUserForm.CHECKBOX_DISTRICT_WAREHOUSE_ACCESS%>" onclick="submitDistrictWarehouseAccess()" />
                    Access District Warehouse
                    <base:helpTag helpFileName="d_district_warehouse_access.htm"/>
                </td>
            </tr>
            
            <logic:equal name="<%=DistrictEditUserForm.FORM_NAME %>" property="<%=DistrictEditUserForm.CHECKBOX_DISTRICT_WAREHOUSE_ACCESS%>" value="true"> 
            <tr>
                <td class="FormLabel tdAlignRight">
                    &nbsp;
                </td>
                <td class="FormLabel">
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <html:select
                        property="<%= DistrictEditUserForm.FIELD_DISTRICT_WAREHOUSE_ROLE_ID %>">
                        <html:options
                            collection="districtWarehouseRoleTypes"
                            property="longID"
                            labelProperty="stringDesc" />
                    </html:select>            
                    <base:genericButton absbottom="true" name="<%=DistrictEditUserForm.BUTTON_OTHER_DISTRICT_WAREHOUSE %>" src="/buttons/large/other.gif" alt="<%=DistrictEditUserForm.ALT_OTHER_ACCESS_LEVEL%>"/>
                </td>
            </tr>
            </logic:equal>
        </logic:equal>
        
        </base:isNotStateContext>
        <base:isStateContext>
        <tr>
            <td class="FormLabel tdAlignRight">
                &nbsp;
            </td>
            <td class="ColRow"><html:checkbox property="<%=DistrictEditUserForm.CHECKBOX_TEXTBOOK_ADMIN%>" />
            Manage Textbooks for the State
            </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight">
                &nbsp;
            </td>
            <td class="ColRow"><html:checkbox property="<%=DistrictEditUserForm.CHECKBOX_REPORT_ADMIN%>" />
                Create Reports for the State
            </td>
        </tr>
        
        
        </base:isStateContext>

        <tr>
            <td colspan="2" align="center" class="ColRowBold">
                <base:showHideTag id="onSave">
                   <base:saveButton onclick="hideElementonSave()"/>&nbsp;<base:cancelButton/>
                </base:showHideTag>
            </td>
        </tr>
        </base:outlinedTable>
        </td>
    </tr>
</table>

</base:form>
