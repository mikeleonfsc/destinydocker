<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@ page import="com.follett.fsc.common.StringStringLookup"%>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.CircPolicyWithDescriptionsValue"%>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb.*"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CircPolicySpecs"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CircPolicyVO"%>
<%@ page import="com.follett.fsc.common.StringHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<bean:define id="form" name="<%=EditAssetTemplatePermissionsForm.FORM_NAME%>" type="com.follett.fsc.destiny.client.backoffice.servlet.EditAssetTemplatePermissionsForm" />
<base:messageBox strutsErrors="true"/>
<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
%>


<base:form action="/backoffice/servlet/handleeditassettemplatepermissionsform.do" focus="<%=EditAssetTemplatePermissionsForm.FIELD_ASSET_LIMITER_NAME %>">
<html:hidden property="<%=EditAssetTemplatePermissionsForm.PARAMETER_ROLE_ID%>"/>
<html:hidden property="<%=EditAssetTemplatePermissionsForm.FIELD_ACCESS_LEVEL_NAME%>"/>
<html:hidden property="<%=EditAssetTemplatePermissionsForm.PARAM_DISTRICT_FLAG%>"/>

    <table id="<%= AccessLevelsForm.TABLE_ACCESS_LEVEL_HEADING %>" width="100%">
        <tr>
            <td width="100%">
                <nobr><span class="ColRowBold"><%= MessageHelper.formatMessage("accesslevels_AccessLevel") %></span>
                <span class="ColRowBold"><bean:write name="<%= EditAssetTemplatePermissionsForm.FORM_NAME %>" property="<%= EditAssetTemplatePermissionsForm.FIELD_ACCESS_LEVEL_NAME %>"/></span>
            </td>
        
            <td class="tdAlignRight" valign="top">
            <%if (form.isCanEditGroups()){ %>
                <base:saveButton onclick="hideElementonSave()"
                    name="<%= EditAssetTemplatePermissionsForm.BUTTON_NAME_SAVE %>" />
            <%} %>
                <base:cancelButton
                    name="<%= EditAssetTemplatePermissionsForm.BUTTON_NAME_CANCEL %>" />            
            </td>
        </tr>
        <tr>
            <td colspan="2" class="ColRowBold">
                &nbsp;&nbsp;&nbsp;&nbsp;Resource Group: <%if (form.isCanEditGroups()){ %> <html:text property="assetLimiterName" size="60" maxlength="60"/> <% } else { %> <%= form.getAssetLimiterName()%> <%} %>
            </td>
        </tr>
        <tr>
            <td colspan="2" class="ColRowBold">
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="<%=EditAssetTemplatePermissionsForm.FIELD_DEFAULT_GROUP%>" disabled="<%=form.disableDefaultCheckbox()%>">Make this the default</html:checkbox>
            </td>
        </tr>
        
    </table>

<br/>

<table width="100%">
    <tr>
        <td width="100%">
            <%
                form.outputList(out);
            %>
        </td>
    </tr>
    <tr>
        <td align="center" class="ColRowBold"><base:showHideTag id="onSave">
         <%if (form.isCanEditGroups()){ %>
                <base:saveButton onclick="hideElementonSave()"
                    name="<%= EditAssetTemplatePermissionsForm.BUTTON_NAME_SAVE %>" />
         <%} %>
                <base:cancelButton
                    name="<%= EditAssetTemplatePermissionsForm.BUTTON_NAME_CANCEL %>" />
            </base:showHideTag></td>
    </tr>
</table>

</base:form>
<logic:notEmpty name='<%= EditAssetTemplatePermissionsForm.FORM_NAME %>' property="currentSelectedTemplateID" >
<script>
<%if (form.getErrors().size() == 0) { %>
    location.hash='selectAll_<%=form.getCurrentSelectedTemplateID() %>';
<%}%>
</script>
</logic:notEmpty>
