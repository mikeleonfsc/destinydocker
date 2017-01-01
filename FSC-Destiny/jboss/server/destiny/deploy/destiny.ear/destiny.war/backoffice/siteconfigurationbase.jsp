<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.SiteConfigurationBaseForm" %> 
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.data.UpdateConfigSiteDefaultsJobParams" %> 
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LookupSpecs" %> 
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %> 
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>



<%
    SiteConfigurationBaseForm form = (SiteConfigurationBaseForm)request.getAttribute(SiteConfigurationBaseForm.FORM_NAME);
    int configMode = form.getConfigModeID();
%>



<base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handlesiteconfigurationbaseform.do">
<html:hidden property="<%= SiteConfigurationBaseForm.FIELD_LIBRARY_LOAN_PERIOD_TYPE_ORIGINAL%>"/>
<html:hidden property="configModeID" />
    <%  // only put DISTRICT MODE on if we are in district mode, otherwise bad things happen
    if (form.isDistrictMode() ) { %>
      <center><span class="ColRowBold"><%= GenericForm.getLastBackupDisplayMsg(false) %></span></center><br>
      <jsp:include page="/common/msdewarning.jsp" flush="true" />
      <html:hidden property="districtMode"/>    
    <% } %>


<logic:equal name="<%= SiteConfigurationBaseForm.FORM_NAME %>" property="action" value="ConfirmPush">
        <base:messageBox showRedBorder="true">
        <tr valign="center">
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td class="ColRowBold" align="center"><%= form.gimmeConfirmPushMessage() %></td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td valign="baseline" align="center" class="ColRow">
                <base:yesNo/>
            </td>
        </tr>
        </base:messageBox>
    </logic:equal>


<base:outlinedTable id="<%=SiteConfigurationBaseForm.TABLE_MAIN%>"  borderColor="#C0C0C0" width="95%" align="center">

    <jsp:include page="<%=form.gimmeConfigModePage()%>" flush="true"/>
    <tr>
    <td>
    <table width="100%">
    
    <tr>
        <td>
            <base:imageLine height="1" width="100%"/>
        </td>
    </tr>
    <c:if test="<%=form.isDistrictMode()%>">
        <tr>
            <td class="ColRow" align="center">
                <%=form.getSaveInfoMessage()%>
            </td>
        </tr>
    </c:if>
    <tr>
        <td align="center" class="ColRow">
            <base:showHideTag id="onSave">
                <base:saveButton onclick="hideElementonSave()"/>
                <base:cancelButton/>
            </base:showHideTag>
        </td>
    </tr>
    <c:if test="<%=form.isDistrictMode() && form.canPushToSite()%>">
        <tr>
            <td>
                <base:imageLine height="1" width="100%"/>
            </td>
        </tr>
        <tr>
            <td class="Instruction" align="center">*<%=MessageHelper.formatMessage("siteconfigurationbase_ApplyTheseSettingsAt") %><base:selectSiteAndSiteType 
                        name="<%= SiteConfigurationBaseForm.FIELD_SITE_LIMITER%>" 
                        selectedSiteID="<%=form.getSiteLimiter()%>"
                        includeForLibrarySites="<%=form.canShowForLibrary() %>"
                        includeForTextbookSites="<%=form.canShowForTextbook() %>"
                        includeForAssetSites="<%=form.canShowForAsset() %>"
                        includeDistrictWarehouse="false"
                    />
                <base:genericButton src="/buttons/small/push.gif" alt='<%= MessageHelper.formatMessage("push") %>' 
                    name="<%= SiteConfigurationBaseForm.BUTTON_NAME_PUSH %>" />
            </td>
        </tr>
        <tr>
            <td class="Instruction" align="center">
                <%=MessageHelper.formatMessage("siteconfigurationbase_PushingConfigurationOptionsDoesNotSaveThem", "<b>", "</b>") %>
            </td>
        </tr>
        
    </c:if>
   </table>
  </td>
  </tr>
</base:outlinedTable>
</base:form>
