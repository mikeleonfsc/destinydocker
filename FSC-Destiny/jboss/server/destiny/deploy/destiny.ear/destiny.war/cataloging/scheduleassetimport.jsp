<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.AssetImportScheduleListForm"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.ScheduleAssetImportForm"%>

<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@page import="com.follett.fsc.destiny.client.common.PageCalculator"%>
<%@page import="com.follett.fsc.destiny.client.common.servlet.BaseListForm"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.PatronSpecs"%>
<%@page import="com.follett.fsc.destiny.client.circulation.servlet.BasePatronListForm"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.AssetImportScheduleListForm"%>
<%@page import="com.follett.fsc.destiny.client.common.data.Tab"%>
<%@page import="com.follett.fsc.destiny.client.common.SitePatronHelper"%>
<%@page import="com.follett.fsc.destiny.client.backoffice.data.UpdatePatronHelper"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.AssetImportForm"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.BarcodeListTag"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="com.follett.fsc.destiny.client.common.servlet.BaseFileUploadForm"%>
<%@page import="com.follett.fsc.common.CalendarHelper"%>
<%@page import="com.follett.fsc.common.TimestampHelper"%>
<%@page import="com.follett.fsc.common.StringHelper"%>

<%
    ScheduleAssetImportForm form = (ScheduleAssetImportForm) request.getAttribute(ScheduleAssetImportForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);

    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    
    GregorianCalendar gc = (GregorianCalendar) GregorianCalendar.getInstance(lh.getLocale());
    int firstDay = gc.getFirstDayOfWeek(); // This should return things like Calendar.SUNDAY, starts at 1
    String[] daysOfTheWeek = CalendarHelper.getDays(true);
    String focusControl = "";
%>

<script language="JavaScript">
<!--
    window.focus();
    function submitFileChange() {
        document.<%=ScheduleAssetImportForm.FORM_NAME%>.<%=ScheduleAssetImportForm.FIELD_FILE_CHANGED%>.value = "true";
        document.<%=ScheduleAssetImportForm.FORM_NAME%>.submit();
    }
    
//-->
</script>

<base:form action="/cataloging/servlet/handlescheduleassetimportform.do" enctype="multipart/form-data" focus="<%=focusControl %>">
<base:messageBox strutsErrors="true"/>

<html:hidden property="<%= ScheduleAssetImportForm.FIELD_JOB_SPEC_ID %>" />
<html:hidden property="<%= ScheduleAssetImportForm.FIELD_FILE_CHANGED %>" />
<base:outlinedTableAndTabsWithinThere  selectedTab="<%=form.getSelectedTab()%>" tabs="<%=form.getTabs()%>" id="<%=AssetImportForm.TABLE_OUTLINE_IMPORT_ASSET%>" borderColor="#c0c0c0">
    <tr>
        <td class="TableHeading" id="<%=form.ID_PAGE_MAIN_HEADING_LABEL%>">
            <%=form.getFormHeading() %>
        </td>
    </tr>
    <tr>
        <td>
            <table id="<%=ScheduleAssetImportForm.EMBEDDED_TABLE%>" align="center" width="95%">
                <tr>
                    <td class="ColRowBold tdAlignRight" id="<%=form.ID_JOB_NAME_LABEL%>" nowrap="true">
                        <%=MessageHelper.formatMessage("scheduleassetimport_JobName")%>
                    </td>
                    <td id="<%=form.ID_JOB_NAME_EDIT_BOX%>">
                        <html:text property="<%=form.FIELD_CUSTOM_JOB_NAME %>" size="50" maxlength="128"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="2"><base:imageLine /></td>
                </tr> 
                <tr>
                    <td colspan="2" class="TableHeading2" id="<%=form.ID_XML_FILE_HEADING_LABEL%>" nowrap="true">
                        <%=MessageHelper.formatMessage("scheduleassetimport_ImportAssetItemsXMLFile")%>
                    </td>
                </tr>           
                <tr>
                    <td class="ColRowBold tdAlignRight" id="<%=form.ID_XML_FILE_DIRECTORY_LABEL%>" nowrap="true">
                        <%=MessageHelper.formatMessage("scheduleassetimport_ServerSideDirectory")%>
                    </td>
                    <td>
                        <html:text property="<%= ScheduleAssetImportForm.FIELD_XML_FILE_DIRECTORY %>" size="50" maxlength="256"/>
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight" id="<%=form.ID_XML_FILE_NAME_LABEL%>" nowrap="true">
                        <%=MessageHelper.formatMessage("scheduleassetimport_XmlFileName")%>
                    </td>
                    <td>
                        <html:text property="<%= ScheduleAssetImportForm.FIELD_XML_FILE_NAME %>" size="50" maxlength="256"/>
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight" id="<%=form.ID_XML_FILE_ENCODING_LABEL%>" nowrap="true">
                        <%=MessageHelper.formatMessage("scheduleassetimport_FileEncoding") %>
                    </td>
                    <td class="ColRow">
                        <%= form.getFileEncodingDisplayable() %>
                    </td>
                </tr>
                <tr>
                    <td class="Instruction">
                        <%=MessageHelper.formatMessage("scheduleassetimport_RequiredField") %>
                    </td>
                    <td class="ColRow tdAlignRight">
                        &nbsp;
                    </td>                 
                </tr>
                <tr>
                    <td colspan="2"><base:imageLine /></td>
                </tr> 
                <tr>
                    <td colspan="2" class="TableHeading2" id="<%=form.ID_JOB_SCHEDULE_HEADING_LABEL%>" nowrap="true">
                        <%=MessageHelper.formatMessage("scheduleassetimport_JobSchedule") %>
                    </td>
                </tr>                        
                <tr>
                    <td class="ColRowBold tdAlignRight" id="<%=form.ID_DAY_OF_THE_WEEK_LABEL%>">
                        &nbsp;
                    </td>
                    <td>
                        <table>
                            <tr>
                                <td class="ColRow" >
                                    <table>
                                    <% for (int x = 0; x < 7; x++) { %>
                                        <tr>
                                            <td>
                                                <html:checkbox property="<%=form.getPropertyForDay(x, firstDay)%>"><%=daysOfTheWeek[x] %></html:checkbox>
                                            </td>
                                        </tr>
                                    <% } %>
                                    </table>                               
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>            
                <tr>
                    <td class="ColRowBold tdAlignRight" id="<%=form.ID_TIME_LABEL%>">
                        <%=MessageHelper.formatMessage("scheduleassetimport_Time") %>
                    </td>
                    <td>
                         <html:text property="<%=form.FIELD_TIME_TO_RUN %>" size="12" maxlength="20"/>&nbsp;<span class="Instruction"><%=MessageHelper.formatMessage("scheduleassetimport_ExampleTimePm") %></span>
                    </td>
                </tr>    
                <tr>
                    <td colspan="2"><base:imageLine /></td>
                </tr> 
                <tr>
                    <td class="TableHeading2" colspan="2" id="<%=form.ID_JOB_OPTIONS_HEADING_LABEL%>" nowrap="true">
                        <%=MessageHelper.formatMessage("scheduleassetimport_JobOptions") %>
                    </td>
                </tr>                         
                <tr>
                    <td class="FormLabel" id="<%=form.ID_ASSET_MATCHING_LABEL%>" nowrap="true">
                        <%=MessageHelper.formatMessage("scheduleassetimport_AssetMatching") %>
                    </td>
                    <td class="ColRow tdAlignRight">
                        &nbsp;
                    </td>               
                </tr>
                <tr>
                    <td class="FormLabel" id="<%=form.ID_ASSET_MATCHING_INSTRUCTION_LABEL%>" colspan="2" nowrap="true">
                        <%=MessageHelper.formatMessage("scheduleassetimport_IfAnIncomingAssetMatchesAnExistingAsset") %>
                    </td>
                    <td class="ColRow tdAlignRight">
                        &nbsp;
                    </td>                 
                </tr>
                <tr>
                    <td class="FormElement tdAlignRight">
                        <html:radio property="<%=form.FIELD_SKIP_DUPLICATE_ASSETS%>" value="<%=form.VALUE_SKIP_ASSET%>"/>
                    </td>
                    <td class="FormElement" id="<%=form.ID_ASSET_MATCHING_SKIP_LABEL%>">
                        <%=MessageHelper.formatMessage("scheduleassetimport_SkipTheIncomingAsset") %>
                    </td>
                </tr>
                <tr>
                    <td class="FormElement tdAlignRight">
                        <html:radio property="<%=form.FIELD_SKIP_DUPLICATE_ASSETS%>" value="<%= form.VALUE_REPLACE_ASSET%>"/>
                    </td>
                    <td class="FormElement" id="<%=form.ID_ASSET_MATCHING_OVERWRITE_LABEL%>">
                        <%=MessageHelper.formatMessage("scheduleassetimport_OverwriteTheExistingAsset") %>
                    </td>
                </tr>
                <tr>
                    <td class="FormLabel" id="<%=form.ID_ITEM_MATCHING_LABEL%>" nowrap="true">
                        <%=MessageHelper.formatMessage("scheduleassetimport_ItemMatching") %>
                    </td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td class="FormElement tdAlignRight">
                        <html:radio property="<%=form.FIELD_SKIP_DUPLICATE_ITEMS%>" value="<%=form.VALUE_SKIP_ITEM%>"/>
                    </td>
                    <td class="FormElement" id="<%=form.ID_ITEM_MATCHING_SKIP_LABEL%>">
                        <%=MessageHelper.formatMessage("scheduleassetimport_SkipTheIncomingItemIfItMatchesAnExistingItemBasedOnTheAssetIdentifierDefinedInYourFileDistrictIdentifierOrBarcode") %>
                    </td>
                </tr>
                <tr>
                    <td class="FormElement tdAlignRight">
                        <html:radio property="<%=form.FIELD_SKIP_DUPLICATE_ITEMS%>" value="<%=form.VALUE_REPLACE_ITEM%>"/>
                    </td>
                    <td class="FormElement" id="<%=form.ID_ITEM_MATCHING_OVERWRITE_LABEL%>">
                        <%=MessageHelper.formatMessage("scheduleassetimport_OverwriteTheExistingItemWithTheIncomingItemIfTheAssetIdentifierDefinedInTheFileDistrictIdentifierOrBarcodeAndTheDisplayableAssetNameMatch") %>
                    </td>
                </tr>
                <tr>
                    <td class="FormElement tdAlignRight">
                        <html:radio property="<%=form.FIELD_SKIP_DUPLICATE_ITEMS%>" value="<%=form.VALUE_ALWAYS_ADD_ITEM%>"/>
                    </td>
                    <td class="FormElement" id="<%=form.ID_ITEM_MATCHING_ADD_LABEL%>">
                        <%=MessageHelper.formatMessage("scheduleassetimport_AlwaysAddTheIncomingItemRecordAndAssignItTheNextAvailableBarcode") %>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    <tr>
        <td align="center" class="ColRowBold">
            <base:showHideTag id="saveJob">
                <table id="tableButtons">
                    <tr>
                        <td class="tdAlignRight">
                            <base:saveButton onclick="hideElementsaveJob()" />
                        </td>
                        <td class="tdAlignLeft">
                            <base:cancelButton onclick="hideElementsaveJob()" />
                        </td>
                    </tr>
                </table>
            </base:showHideTag>
        </td>
    </tr>
    
</base:outlinedTableAndTabsWithinThere>

</base:form>

