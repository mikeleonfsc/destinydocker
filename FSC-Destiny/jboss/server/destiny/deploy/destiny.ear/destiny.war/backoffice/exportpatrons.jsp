<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>

<%
    ExportPatronsForm form = (ExportPatronsForm)request.getAttribute(ExportPatronsForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true"/>

<br>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );
%>

<base:form action="/backoffice/servlet/handleexportpatronsform.do">
    <base:outlinedTable borderColor="#C0C0C0" id="<%= IUpdatePatronForm.TABLE_MAIN %>" width="100%">
    <tr>
        <td class="TableHeading" colspan="2"><%= MessageHelper.formatMessage("exportpatrons_Export") %></td>
    </tr>
    	 <base:isDistrictUser>
    
                <tr>
                    <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("exportpatrons_From") %></td>
                    <td class="FormElement">

                    <base:selectSite 
                        name='<%= ExportPatronsForm.FIELD_SITEID %>' 
                        submitOnChange="true" 
                        selectedSiteID='<%=""+form.getSiteID()%>'
                        includeLibrarySites="true"
        			    includeTextbookSites="true"
        			    includeMediaSites="true"
        			    includeAssetSites="true"
		                mode="<%=SelectSiteTag.MODE_MEDIA%>"
                        includeDistrictWarehouse="false"
                        />

                    </td>
                </tr>
    	 </base:isDistrictUser>
    	 <base:isNotDistrictUser>
             <html:hidden property="<%= ExportPatronsForm.FIELD_SITEID %>" />
    	 </base:isNotDistrictUser>
    <tr>
        <td>&nbsp;</td>
        <td valign="top">
            <table border="0" cellpadding="3" cellspacing="0" id="<%=IUpdatePatronForm.TABLE_SUBMAIN%>">
            <tr>
                <td colspan="5" class="ColRowBold">
                    <html:radio property="<%=ExportPatronsForm.FIELD_LIMIT_ALL_PATRONS%>" value="true"><%= MessageHelper.formatMessage("exportpatrons_AllPatrons") %></html:radio>
                </td>
            </tr>
            <tr>
                <td class="ColRowBold" valign="top">
                    <html:radio property="<%=ExportPatronsForm.FIELD_LIMIT_ALL_PATRONS%>" value="false"><%= MessageHelper.formatMessage("exportpatrons_PatronsWhose") %></html:radio>
                </td>
                <input type="hidden" name="<%=form.FIELD_SELECTION_CHANGED%>"/>
                <td class="ColRowBold">
                    <base:patronUpdateList formName="<%=form.FORM_NAME%>"
                        siteID="<%=form.getSiteID()%>"
                        option="<%=form.getOption()%>"
                        optionName="<%=form.OPTION_LIST_NAME%>"
                        childOptionName="<%=form.CHILD_OPTION_LIST_NAME%>"
                        childOption="<%=form.getChildOption()%>"
                        selectionChangeFieldName="<%=form.FIELD_SELECTION_CHANGED%>"
                        selectionChangeFieldValue="1"
                        calendarImageFieldName="<%=form.FIELD_CALENDAR_IMAGE%>"
                        excludedOptions="<%=form.getExcludedOptions()%>"
                        allowExtraPatronTypeSelection="true"
                        showDateRange="true"
                        childOption2="<%=form.getChildOption2()%>"
                        childOptionName2="<%=form.CHILD_OPTION_LIST_2_NAME%>"
                        calendarImageFieldName2="<%=form.FIELD_CALENDAR_IMAGE2%>"
                        extraPatronTypeDropDownName="patronTypeID"
                        extraPatronTypeSelection="<%=form.getPatronTypeID()%>"
                        childControlDescriptor='<%=MessageHelper.formatMessage("exportpatrons_Is") %>'
                    />
                </td>
            </tr>
            </table>
        </td>
    </tr>
    <tr valign="top">
        <td valign="top" colspan="2">
            <span class="ColRowBold">&nbsp;</span>
        </td>
    </tr>
    <tr>
        <td valign="baseline" align="center" class="ColRowBold" colspan="2">
            <base:showHideTag id="onExport">
                <base:genericButton name="<%=form.BUTTON_EXPORT_PATRONS%>" alt='<%=MessageHelper.formatMessage("export") %>' onclick="hideElementonExport()" src="/buttons/large/export.gif"/>
            </base:showHideTag>
        </td>
    </tr>
    </base:outlinedTable>
</base:form>
