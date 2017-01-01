<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator"%>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>

<%@page import="com.follett.fsc.destiny.client.common.servlet.GenericForm"%>
<base:messageBox strutsErrors="true" />

<%
    SIFClassSynchronizationForm form =
        (SIFClassSynchronizationForm) request.getAttribute(SIFClassSynchronizationForm.FORM_NAME);
%>

<br>

<base:form action="/backoffice/servlet/handlesifclasssynchronizationform.do">
    <html:hidden property="<%=SIFClassSynchronizationForm.PARAM_DONOTCLEARCRUMBS%>" />
    <base:outlinedTableAndTabsWithinThere id="<%=SIFClassSynchronizationForm.TABLE_UPDATE_ONLY%>"
                                selectedTab="<%=UpdateClassesNavigationForm.TAB_UPDATE_ONLY%>"
                                tabs="<%=form.getTabs()%>">
        <tr>
            <td colspan="2" class="TableHeading">SIF Synchronization...</td>
        </tr>
        <base:isDistrictUser>
            <tr align="center">
                <td class="ColRowBold tdAlignRight" valign="top">In</td>
                <td class="ColRow">
                    <base:selectSiteAndSiteType selectedSiteID='<%= form.getUpdateSiteSelection().toString()%>'
                                                name="<%=SIFClassSynchronizationForm.FIELD_UPDATE_SITE_SELECTION%>"
                                                includeForLibrarySites="false"
                                                includeForTextbookSites="true"
                                                includeForAssetSites="false"
                                                includeDistrictWarehouseSiteType="false"
                                                />
                </td>
            </tr>
        </base:isDistrictUser>
        <base:isNotDistrictUser>
            <html:hidden property="<%=SIFClassSynchronizationForm.FIELD_UPDATE_SITE_SELECTION%>" />
        </base:isNotDistrictUser>
        <br>
        <tr>
            <td colspan="2" class="ColRowBold">
                The SIF Class Schedule Synchronization process updates the classes, sections, and enrollments at
                <base:isDistrictUser> 
                    the selected sites.
                </base:isDistrictUser>
                <base:isNotDistrictUser>
                    your site.
                </base:isNotDistrictUser>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center" class="ColRowBold">
                <%=GenericForm.getLastBackupDisplayMsg(true)%>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <base:genericButton src="/buttons/large/updatepatrons.gif"
                            name="<%=SIFClassSynchronizationForm.BUTTON_UPDATE_SITES%>"
                            alt="<%=SIFClassSynchronizationForm.ALT_TEXT_BUTTON_UPDATE_SITES%>"/>
            </td>
        </tr>
    </base:outlinedTableAndTabsWithinThere>
</base:form>
