<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.TitleEditForm" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.jsptag.MarcEditLineTag"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<script language="JavaScript">
<!--
    function findHeadingForTag(tagNumber, tagID)
    {
        document.forms["cataloging_servlet_TitleEditForm"].elements["findHeadingTagID"].value = tagID;
        document.forms["cataloging_servlet_TitleEditForm"].elements["findHeadingTagNumber"].value = tagNumber;

        //Submit the form
        document.forms["cataloging_servlet_TitleEditForm"].submit();
    }
  //-->
</script>

<base:messageBox strutsErrors="true"/>
<%
    TitleEditForm form = (TitleEditForm)request.getAttribute( TitleEditForm.FORM_NAME );
%>

<base:form action="/cataloging/servlet/handletitleeditform.do" focus="uniformTitle">
<INPUT type="hidden" name="page" value="5">
<!-- space this similar to brief page -->
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">

<html:hidden property="archiveMaterialType" />
<html:hidden property="changesMade" />

<table border="0" width="95%" id="<%=TitleEditForm.TABLE_EASY_EDIT_TABS%>" cellpadding="0" cellspacing="0">

  <jsp:include page="/cataloging/titleedittabs.jsp" flush="true">
      <jsp:param name="callingPage" value="addedEntries"/>
  </jsp:include>

    <tr><td>
<% // This table can't be less than 100% or the tabs will be misaligned %>
      <base:outlinedTableAndTabsWithinThere borderColor='#C0C0C0' width="100%" selectedTab="<%=form.getSelectedTab()%>" tabs="<%=form.getTabs() %>">
        <tr><td>
        <table id="<%=TitleEditForm.TABLE_ADDED_ENTRIES_PAGE%>" width="100%">
            <tr>
                <td colspan="2">
                    <span class="FormLabel"><%= MessageHelper.formatMessage("titleeditaddedentries_Title") %>&nbsp;</span>
                    <span class="ColRow"><%=form.gimmeFullTitle() %></span>
                </td>
               <td class="tdAlignRight">
                    <base:genericButton 
                        name="<%=TitleEditForm.BUTTON_NAME_MARC_EDITOR%>" 
                        src="/buttons/large/usemarceditor.gif" 
                        alt='<%= MessageHelper.formatMessage("useMarcEditor") %>' absbottom="true"
                    />
               </td>
            </tr>
            <tr>
              <td colspan="3">
                <base:imageLine height="1" width="100%"/>
              </td>
            </tr>
            <tr>
                <td colspan="3" class="FormLabel"><%= MessageHelper.formatMessage("titleeditaddedentries_AlternateTitles") %></td>
            </tr>
            <tr>
               <td>&nbsp;</td>
               <td colspan="2" class="Instruction"><%= MessageHelper.formatMessage("titleeditaddedentries_LeadingArticle") %></td>
            </tr>
            <tr>
                <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("titleeditaddedentries_UniformTitle") %></td>
                <td colspan="2">
                    <html:text property="<%=TitleEditForm.FIELD_UNIFORM_TITLE_ARTICLE%>" size="4" maxlength="8"/>
                    <html:text maxlength="1000" size="60" property="<%=TitleEditForm.FIELD_UNIFORM_TITLE%>"/>
                    <base:helpTag helpFileName="d_subjects_title_LM.htm"/>
                </td>
            </tr>
            <tr>
                <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("titleeditaddedentries_VaryingForm") %></td>
                <td colspan="2">
                    <html:text maxlength="1000" size="60" property="<%=TitleEditForm.FIELD_VARYING_FORM%>"/>
                    <base:helpTag helpFileName="d_title_title_LM.htm"/>
                </td>
            </tr>
            <tr>
               <td>&nbsp;</td>
               <td colspan="2" class="Instruction"><%= MessageHelper.formatMessage("titleeditaddedentries_LeadingArticle") %></td>
            </tr>
            <tr>
                <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("titleeditaddedentries_SeriesUniformTitle") %></td>
                <td colspan="2">
                    <html:text property="<%=TitleEditForm.FIELD_SERIES_UNIFORM_TITLE_ARTICLE%>" size="4" maxlength="8"/>
                    <html:text maxlength="1000" size="60" property="<%=TitleEditForm.FIELD_SERIES_UNIFORM_TITLE%>"/>
                    <base:helpTag helpFileName="d_series_uniform_title_title_LM.htm"/>
                </td>
            </tr>

            <tr>
              <td colspan="3">
                <base:imageLine height="1" width="100%"/>
              </td>
            </tr>
            <tr>
                <td class="FormLabel" colspan="3"><%= MessageHelper.formatMessage("titleeditaddedentries_CoAuthorsIllustratorsEditorsEtc") %></td>
            </tr>
            <tr>
                <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("titleeditaddedentries_Name") %></td>
                <td>
                    <html:text maxlength="1000" size="48" property="<%=TitleEditForm.FIELD_ADDED_ENTRY_NAME%>"/>
                    <base:helpTag helpFileName="d_co-author_name_LM_MM.htm"/>
                </td>
                <td class="MediumColHeading" rowspan="3">
                    <base:showHideTag id="onAction">
                        <base:genericButton src="/buttons/large/update.gif" onclick="hideElementonAction()" name="<%=TitleEditForm.BUTTON_NAME_UPDATE_ADDED_ENTRY%>" alt='<%= MessageHelper.formatMessage("update") %>'/><br>
                        <% String jsString = "javascript:findHeadingForTag(\"700\", \"" + form.getEditAddedEntryIndex() + "\")"; %>
                        <a href='<%=jsString%>' id="<%=MarcEditLineTag.ID_FIND_HEADING %>"><base:image src="/buttons/large/findheading.gif" onClick="hideElementonAction()" alt='<%=MessageHelper.formatMessage("findHeading")%>'/></a>
                    </base:showHideTag>
                </td>
            </tr>
            <tr>
                <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("titleeditaddedentries_Dates") %></td>
                <td><html:text maxlength="1000" size="48" property="<%=TitleEditForm.FIELD_ADDED_ENTRY_DATES%>"/>
                    <base:helpTag helpFileName="d_dates_title_LM.htm"/>
                </td>
            </tr>
            <tr>
                <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("titleeditaddedentries_Role") %></td>
                <td>
                    <html:text maxlength="1000" size="48" property="<%=TitleEditForm.FIELD_ADDED_ENTRY_ROLE%>"/>
                    <base:helpTag helpFileName="d_role_title_LM.htm"/>
                    <logic:notEqual name="<%=TitleEditForm.FORM_NAME%>" property="editAddedEntryIndex" value="-1">
                        <base:cancelButton name="<%=TitleEditForm.BUTTON_NAME_CANCEL_ADDED_ENTRY%>"/>
                    </logic:notEqual>
                </td>
            </tr>
            <tr><td colspan="2">
            <table id="<%=TitleEditForm.TABLE_ADDED_ENTRY_LIST%>" width="100%" cellspacing="0" cellpadding="2">
                <logic:equal name="<%=TitleEditForm.FORM_NAME%>" property="addedEntriesEmpty" value="true">
                    <tr>
                        <td class="FormLabel" colspan="3" align="center"><%= MessageHelper.formatMessage("titleeditaddedentries_ThereAreNoAddedEntriesForThisTitle") %></td>
                    </tr>
                </logic:equal>
                <logic:equal name="<%=TitleEditForm.FORM_NAME%>" property="addedEntriesEmpty" value="false">
                    <tr>
                        <td class="ColRowBold"><%= MessageHelper.formatMessage("titleeditaddedentries_Name") %></td>
                        <td class="ColRowBold"><%= MessageHelper.formatMessage("titleeditaddedentries_Dates") %></td>
                        <td class="ColRowBold"><%= MessageHelper.formatMessage("titleeditaddedentries_Role") %></td>
                        <td>&nbsp;</td>
                    </tr>
    <%
                    List list = form.getListOfIDs(700);
                    Iterator itr = list.iterator();

                    while ( itr.hasNext()) {
                        int id = (( Integer) itr.next()).intValue();

                        if (form.getEditAddedEntryIndex() != id && form.canEditThisAddedEntry(id)) {
                            String editButton = "editAddedEntry" + (StringHelper.rightMost( "0000" + id, 4 ));
                            String deleteButton = "deleteAddedEntry" + (StringHelper.rightMost( "0000" + id, 4 ));
    %>
                            <base:flipper key="titleeditaddedentries">
                                <%= form.getAddedEntryTableEntry(id) %>
                                <td NOWRAP>
                                    <base:genericButton src="/icons/general/edit.gif" name="<%= editButton %>" alt='<%= MessageHelper.formatMessage("titleeditaddedentries_EditAddedEntry") %>'/>&nbsp;<base:genericButton src="/icons/general/delete.gif" name="<%= deleteButton %>" alt='<%= MessageHelper.formatMessage("titleeditaddedentries_DeleteAddedEntry") %>'/>
                                </td>
                            </base:flipper>
    <%
                        }
                    }
    %>
                </logic:equal>
            </table>
            </td></tr>
        </table>
        </td></tr>
      </base:outlinedTableAndTabsWithinThere>
  </td></tr>
    <tr>
        <td>
        <jsp:include page="/cataloging/titlefooter.jsp"/>
        </td>
    </tr>
</table>

</base:form>
