<%@page import="com.follett.fsc.destiny.client.common.servlet.GenericForm"%>
<%@page import="com.follett.fsc.destiny.util.URLHelper"%>
<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>


<%
    ViewAssetTypesForm form = (ViewAssetTypesForm) request.getAttribute(ViewAssetTypesForm.FORM_NAME);
%>

<base:form action="/backoffice/servlet/handleviewassettypesform.do">

    <html:hidden property="<%=GenericForm.PARAM_COLLECTION_TYPE%>"/>
    <html:hidden property="action"/>
    <logic:equal name="<%=ViewAssetTypesForm.FORM_NAME%>" property="<%=ViewAssetTypesForm.PARAM_DISTRICT_MODE%>" value="true">
      <html:hidden property="<%=ViewAssetTypesForm.PARAM_DISTRICT_MODE%>"/>
    </logic:equal>

    <logic:equal name = "<%=ViewAssetTypesForm.FORM_NAME %>" property = "action" value = "push">
     <base:messageBox showRedBorder="true">
            <tr valign="center">
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td class="ColRowBold" align="center"><%= MessageHelper.formatMessage("viewpatrontype_YourCurrentDistrictSettingsWillBePushedTo") %>
                    <base:selectSiteAndSiteType 
                            name="<%= ViewAssetTypesForm.FIELD_SITE_LIMITER%>" 
                            selectedSiteID="<%=form.getSiteLimiter()%>"
                            includeForLibrarySites="false"
                            includeForTextbookSites="false"
                            includeForAssetSites="true"
                            includeDistrictWarehouse="false"
                        /></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td class="ColRow" align="center"><%= MessageHelper.formatMessage("viewpatrontype_ThisProcessCannotBeReversed") %></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td class="ColRow" align="center"><%= MessageHelper.formatMessage("viewpatrontype_AreYouSureYouWantToProceed") %></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td valign="baseline" align="center" class="ColRow">
                    <base:yesNo/>
                </td>
            </tr>
        </base:messageBox>   
    </logic:equal>


<br>
    <table align="center" border="0" width="95%" id="<%= ViewTextbookLoanPoliciesForm.TABLE_TEXTBOOK_POLICIES_TABS %>" cellpadding="0" cellspacing="0">


        <tr><td width="100%">
            <base:outlinedTableAndTabsWithinThere tabs="<%=ViewTextbookLoanPeriodsForm.getTabs(form.getCollectionType(), form.isDistMode()) %>" selectedTab="<%=ViewTextbookLoanPeriodsForm.TAB_ASSET_TYPES %>" borderColor="#C0C0C0" id="<%= ViewAssetTypesForm.TABLE_MAIN %>" width="100%" cellpadding="4" cellspacing="0">
                <tr>
                    <td class="ColRowBold" colspan=2>Define Policies for Departments / Home Locations</td>
                    <td class="tdAlignRight">
                        <base:link page="<%=form.gimmeEditLink()%>" id="<%= ViewAssetTypesForm.ID_EDIT_ASSET_TYPES %>">
                            <base:image src="/buttons/large/edit.gif" alt="<%= ViewAssetTypesForm.LINK_EDIT_ASSET_TYPES %>"/>
                        </base:link>
                        <% if (form.isDistMode()) {
                            String pushValuesLink = "/backoffice/servlet/handleviewassettypesform.do?action=push";
                            pushValuesLink = URLHelper.addHREFParam(pushValuesLink, ViewPatronTypeForm.PARAM_DISTRICT_MODE, "true");
                            %>
                                &nbsp;
                                <base:link page = "<%=pushValuesLink %>" collectionType = "<%=form.getCollectionType()%>"><base:image src = "/buttons/large/push.gif" name="<%=ViewAssetTypesForm.ID_PUSH%>" alt='<%= MessageHelper.formatMessage("push") %>' /></base:link>
                        
                        <% } %>
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold">Resource Type</td>
                    <td class="ColRowBold">Loan Period</td>
                    <td class="ColRowBold">&nbsp;</td>                    
                </tr>
				<%
					form.outputList(out);
				%>
            </base:outlinedTableAndTabsWithinThere>
        </td></tr>
    </table>
</base:form>


