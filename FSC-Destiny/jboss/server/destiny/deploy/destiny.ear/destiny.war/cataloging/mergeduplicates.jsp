<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.UpdateTitlesNavigationForm"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.MergeDuplicatesForm"%>

<script type="text/javascript">
    function uncheckAuthor() {
        document.<%=MergeDuplicatesForm.FORM_NAME%>.<%=MergeDuplicatesForm.FIELD_MATCH_IGNORE_AUHOR%>.checked = false;
    }

    function selectStrict() {
        document.<%=MergeDuplicatesForm.FORM_NAME%>.<%=MergeDuplicatesForm.FIELD_MATCH_TYPE_RELAXED%>[0].click();
    }
</script>

<base:messageBox strutsErrors="true"/>

<%
    MergeDuplicatesForm form = 
        (MergeDuplicatesForm) request.getAttribute(MergeDuplicatesForm.FORM_NAME);
%>
<br>

<base:form action="/cataloging/servlet/handlemergeduplicates.do">
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=MergeDuplicatesForm.BUTTON_TRAP_ENTER_KEY%>">
    
        <c:if test="<%=form.isShowConfirmation()%>">
            <base:messageBox showWarningIcon="true" message="<%=form.gimmeConfirmationMessage()%>" filterMessage="false">
            <tr>
                <td class="ColRowBold" width="100%" align="center" colspan="2">
                    <base:yesNo />
                </td>
            </tr>
            </base:messageBox>
        </c:if>
        
            <base:outlinedTableAndTabsWithinThere id="mainTable"  selectedTab="<%=MergeDuplicatesForm.ID_TAB%>" tabs="<%=UpdateTitlesNavigationForm.getTabs()%>" cellpadding="2" cellspacing="2">
                <tr>
                    <td colspan="2" class="TableHeading"><%= MessageHelper.formatMessage("mergeduplicates_MergeDuplicateLibraryTitles") %></td>
                </tr>
                <tr>
                     <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("mergeduplicates_For") %></td>
                     <td>
                        <base:selectSite 
                        submitOnChange="false" 
                        name="<%=MergeDuplicatesForm.FIELD_SITE_DROPDOWN%>" 
                        selectedSiteID="<%=form.getSiteDropDown().toString()%>" 
                        includeAllLibraries="true"
                        includeLibrarySites="true"
                        includeTextbookSites="false"
                        includeMediaSites="false"
                        includeAssetSites="false"
                        />
                     </td>
                 </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("mergeduplicates_LastUpdated") %></td>
                    <td> <base:date 
                                    buttonName = "<%=MergeDuplicatesForm.BUTTON_CHANGE_FROM_DATE%>"
                                    fieldName = "<%=MergeDuplicatesForm.FIELD_FROM_DATE%>"
                                    dateValue="<%=form.getFromDate()%>"
                                    altText = '<%= MessageHelper.formatMessage("mergeduplicates_ChangeFromDate") %>'
                                />
                            <span class="ColRow"><%= MessageHelper.formatMessage("mergeduplicates_To") %></span> 
                     <base:date 
                                    buttonName = "<%=MergeDuplicatesForm.BUTTON_CHANGE_TO_DATE%>"
                                    fieldName = "<%=MergeDuplicatesForm.FIELD_TO_DATE%>"
                                    dateValue="<%=form.getToDate()%>"
                                    altText = '<%= MessageHelper.formatMessage("mergeduplicates_ChangeToDate") %>'
                                />
                    </td>
                </tr>
                <tr>
                    <td colspan="2" width="100%"><base:imageLine/></td>
                </tr>
                <tr>                
                    <td colspan="2" class="ColRowBold"><%= MessageHelper.formatMessage("mergeduplicates_TitleMatching") %><base:helpTag helpFileName="d_import_match_LM.htm"/>
                    </td>
                </tr>
                <tr>                
                    <td class="tdAlignRight">
                        <html:radio property="<%=MergeDuplicatesForm.FIELD_MATCH_TYPE_RELAXED%>" value="false"/>
                    </td>
                    <td class="ColRow">
                        <b><%= MessageHelper.formatMessage("mergeduplicates_Strict") %></td>
                </tr>
                <tr>                
                    <td class="tdAlignRight">
                    </td>
                    <td class="ColRow">
                        &nbsp;<html:checkbox property="<%=MergeDuplicatesForm.FIELD_MATCH_IGNORE_AUHOR%>" onclick="selectStrict()"/><%= MessageHelper.formatMessage("mergeduplicates_RemoveTheAuthorRequirementFromTheStrictMatching") %></td>
                </tr>
                <tr>
                    <td class="tdAlignRight">
                        <html:radio property="<%=MergeDuplicatesForm.FIELD_MATCH_TYPE_RELAXED%>" value="true" onclick="uncheckAuthor()"/>
                    </td>                
                    <td class="ColRow">
                         <b><%= MessageHelper.formatMessage("mergeduplicates_Relaxed") %></td>
                </tr>
                <tr>
                    <td colspan="2" width="100%"><base:imageLine/></td>
                </tr>
                <tr>
                    <td align="center" colspan="2" class="ColRowBold">
                        <%=GenericForm.getLastBackupDisplayMsg(true)%>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center" class="ColRowBold">
                        <base:genericShowHideButton src="/buttons/large/merge.gif" 
                        name="<%=MergeDuplicatesForm.BUTTON_MERGE_RECORDS%>" 
                        alt='<%=MessageHelper.formatMessage("merge")%>' 
                        elementID="mergeRecords"/>
                        <br>
                    </td>
                </tr>
                
            </base:outlinedTableAndTabsWithinThere>
     
</base:form>
