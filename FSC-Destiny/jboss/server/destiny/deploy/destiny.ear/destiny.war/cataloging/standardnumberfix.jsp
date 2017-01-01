<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>
    <SCRIPT LANGUAGE="javascript" TYPE="text/javascript">
    <!--
        function submitTheForm() {
            document.<%=StandardNumberFixForm.FORM_NAME%>.submit();
        }
    // -->
    </SCRIPT>

<bean:define id="form" name="<%=StandardNumberFixForm.FORM_NAME%>" type="com.follett.fsc.destiny.client.cataloging.servlet.StandardNumberFixForm" />

<base:form action="/cataloging/servlet/handlestandardnumberfix.do">
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">

<base:outlinedTableAndTabsWithinThere id="<%=StandardNumberFixForm.TABLE_STANDARD_NUMBER_FIX%>"  selectedTab="<%=StandardNumberFixForm.ID_TAB%>" tabs="<%=UpdateTitlesNavigationForm.getTabs()%>" >
    <tr>
        <td colspan="2" class="TableHeading">
            <base:isMediaSite showForMedia="false"><%= MessageHelper.formatMessage("standardnumberfix_ListLibraryTitles") %></base:isMediaSite>
            <base:isMediaSite showForMedia="true"><%= MessageHelper.formatMessage("standardnumberfix_ListMediaTitles") %></base:isMediaSite>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top">
            <nobr><%= MessageHelper.formatMessage("standardnumberfix_LocateTitlesWith") %></nobr>
        </td>
        <td class="ColRow">
            <html:select onchange="javascript:submitTheForm()" property="<%=StandardNumberFixForm.FIELD_SELECT_LOCATE_TITLES_WITH%>">
                <html:option value='<%="" + StandardNumberFixForm.DUPLICATE_STD_NUM%>'><%= MessageHelper.formatMessage("standardnumberfix_DuplicateStandardNumber") %></html:option>
                <html:option value='<%="" + StandardNumberFixForm.NO_STD_NUM%>'><%= MessageHelper.formatMessage("standardnumberfix_NoStandardNumbers") %></html:option>
            </html:select>
            <logic:equal name="<%=StandardNumberFixForm.FORM_NAME%>" property="<%=StandardNumberFixForm.FIELD_SHOW_SITE_LIST%>" value="true">
            <base:isMediaSite showForMedia="false">
                &nbsp;<%= MessageHelper.formatMessage("standardnumberfix_In") %>&nbsp;<base:selectSite 
                    submitOnChange="true" 
                    name="<%=StandardNumberFixForm.FIELD_FIX_SITE_ID%>"  
                    useMediaSites="false" 
                    includeAllLibraries="true" 
                    selectedSiteID='<%= form.getFixSiteID().toString()%>'
                    includeLibrarySites="true"
        			includeTextbookSites="false"
        			includeMediaSites="false"
        			includeAssetSites="false"
                    />
            </base:isMediaSite>
            <base:isMediaSite showForMedia="true">
                &nbsp;in&nbsp;<base:selectSite 
                    submitOnChange="true" 
                    name="<%=StandardNumberFixForm.FIELD_FIX_SITE_ID%>" 
                    useMediaSites="true" 
                    includeAllLibraries="true" 
                    selectedSiteID='<%= form.getFixSiteID().toString()%>'
                    includeLibrarySites="false"
        			includeTextbookSites="false"
        			includeMediaSites="true"
        			includeAssetSites="false"
                    />
            </base:isMediaSite>
            </logic:equal>
            <logic:equal name="<%=StandardNumberFixForm.FORM_NAME%>" property="<%=StandardNumberFixForm.FIELD_SHOW_SITE_LIST%>" value="false">
                <html:hidden property="<%=StandardNumberFixForm.FIELD_FIX_SITE_ID%>"/>
            </logic:equal>
        </td>
    </tr>
    
    <logic:equal name="<%=StandardNumberFixForm.FORM_NAME%>" property="<%=StandardNumberFixForm.FIELD_SELECT_LOCATE_TITLES_WITH%>" value='<%="" + StandardNumberFixForm.NO_STD_NUM%>'>
        <html:hidden property="<%=StandardNumberFixForm.FIELD_OPTION_LCCN%>"/>
        <html:hidden property="<%=StandardNumberFixForm.FIELD_OPTION_ISBN%>"/>
        <html:hidden property="<%=StandardNumberFixForm.FIELD_OPTION_ISSN%>"/>
        <tr>
            <td class="ColRowBold tdAlignRight" valign="top">
                <nobr><%= MessageHelper.formatMessage("standardnumberfix_IncludeCallNumbers") %></nobr>
            </td>
            <td class="ColRow">&nbsp;<%= MessageHelper.formatMessage("standardnumberfix_From") %>&nbsp;<html:text property="<%=StandardNumberFixForm.FIELD_CALL_NUMBER_RANGE_FROM%>" size="9" maxlength="30"/>
                &nbsp;<%=MessageHelper.formatMessage("standardnumberfix_To") %>&nbsp;
                <html:text property="<%=StandardNumberFixForm.FIELD_CALL_NUMBER_RANGE_TO%>" size="9" maxlength="30"/>
            </td>
        </tr>
        <tr>
            <td>
                &nbsp;
            </td>
            <td valign="top" class="Instruction"><%= MessageHelper.formatMessage("standardnumberfix_ToSpecifyACallNumberRangeEnterAtLeastTheFirst3") %></td>
        </tr>
    </logic:equal>
    <logic:equal name="<%=StandardNumberFixForm.FORM_NAME%>" property="<%=StandardNumberFixForm.FIELD_SELECT_LOCATE_TITLES_WITH%>" value='<%="" + StandardNumberFixForm.DUPLICATE_STD_NUM%>'>
        <html:hidden property="<%=StandardNumberFixForm.FIELD_CALL_NUMBER_RANGE_FROM%>"/>
        <html:hidden property="<%=StandardNumberFixForm.FIELD_CALL_NUMBER_RANGE_TO%>"/>
        <tr>
            <td class="ColRowBold tdAlignRight" valign="top"><%= MessageHelper.formatMessage("standardnumberfix_Include") %></td>
            <td class="ColRow">
                <html:checkbox property="<%=StandardNumberFixForm.FIELD_OPTION_LCCN%>"><%=MessageHelper.formatMessage("standardnumberfix_LCCNs")%></html:checkbox>
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td class="ColRow">
                <html:checkbox property="<%=StandardNumberFixForm.FIELD_OPTION_ISBN%>"><%=MessageHelper.formatMessage("standardnumberfix_ISBNs")%></html:checkbox>
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td class="ColRow">
                <html:checkbox property="<%=StandardNumberFixForm.FIELD_OPTION_ISSN%>"><%=MessageHelper.formatMessage("standardnumberfix_ISSNs")%></html:checkbox>
            </td>
        </tr>
    </logic:equal>        
    
    <tr>
        <td class="ColRow" colspan="2" align="center">
            <base:genericButton src="/buttons/large/findtitles.gif" alt='<%=MessageHelper.formatMessage("findTitles")%>' name="<%=StandardNumberFixForm.ID_BUTTON_FIND_TITLES%>"/>
        </td>
    </tr>
</base:outlinedTableAndTabsWithinThere>
</base:form>
