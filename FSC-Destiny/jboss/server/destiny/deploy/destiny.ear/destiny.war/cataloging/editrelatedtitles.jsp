<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.URLHelper" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.HoldTitleGroupEntryValue" %>
<%@ page import="com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.util.ObjectHelper"%>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="org.apache.struts.action.ActionErrors" %>
<%@ page import="org.apache.struts.Globals" %>
<%@ page import="org.apache.struts.taglib.TagUtils"%>
<%@ page import="org.apache.struts.action.ActionMessages"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page import="com.follett.fsc.common.StringHelper"%>


<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<script language="JavaScript" type="text/javascript">
  <!--
  function trapEnterKey(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        document.<%=EditRelatedTitlesForm.FORM_NAME%>.<%=EditRelatedTitlesForm.PARAM_ENTER_KEY_PRESSED%>.value = "true";
        document.<%=EditRelatedTitlesForm.FORM_NAME%>.submit();
      }
    }
  
  // -->
</script>

<base:messageBox strutsErrors="true"/>
<bean:define id="form" name="form" type="com.follett.fsc.destiny.client.cataloging.servlet.EditRelatedTitlesForm"/>

<%

    String focusControl = EditRelatedTitlesForm.FIELD_FIND_TITLE;

    if (!form.isResultsListEmpty()) {
        // we don't want to focus on anything in the form if we've got results
        focusControl = "";
    }

%>


<base:form action="/cataloging/servlet/handleeditrelatedtitles.do" focus="<%=focusControl%>">
    <html:hidden property="<%= EditRelatedTitlesForm.PARM_CONFIRM_DELETED_ID%>"/>
    <html:hidden property="<%= EditRelatedTitlesForm.PARM_LAST_FIND_TITLE%>"/>
    <html:hidden property="<%= EditRelatedTitlesForm.PARM_HOLD_TITLE_GROUP_ID%>"/>
    <html:hidden property="<%= EditRelatedTitlesForm.PROP_HOLD_RESULT_LIST%>"/>
    <html:hidden property="<%= EditRelatedTitlesForm.PROP_HOLD_TITLE_LIST%>"/>
    <html:hidden property="<%= EditRelatedTitlesForm.PARM_GROUP_NAME%>"/>
    <html:hidden property="<%= EditRelatedTitlesForm.PARAM_ENTER_KEY_PRESSED%>"/>
<% if (!StringHelper.isEmpty(form.getConfirmDeleteMessage())) { %>

   <base:messageBox showRedBorder="true">
       <tr>
           <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
           <td class="ColRowBold" align="center"><%= ResponseUtils.filter(form.getConfirmDeleteMessage()) %></td>
       </tr>
       <tr>
            <td>&nbsp;</td>
            <td valign="baseline" align="center" class="ColRow">
                <base:yesNo buttonYesName="<%=EditRelatedTitlesForm.BUTTON_CONFIRM_DELETE%>" buttonNoName="<%=EditRelatedTitlesForm.BUTTON_DONOT_DELETE%>"/>
            </td>
       </tr>
   </base:messageBox>
<% } %>
<base:outlinedTableAndTabsWithinThere id="${form.constants.TABLE_EDIT_RELATED_TITLES}"  selectedTab="${form.constants.ID_TAB}" tabs="<%=UpdateTitlesNavigationForm.getTabs()%>" >
    <tr>
        <td class="ColRowBold">
            <%= MessageHelper.formatMessage("editrelatedtitles_FindTitlesFor0", ResponseUtils.filter(form.getGroupName())) %>
            &nbsp;
            <html:text property="<%=EditRelatedTitlesForm.FIELD_FIND_TITLE%>" size="30" onkeypress="return trapEnterKey(event);"/>
            &nbsp;
            <base:goButton absbottom="true"/>
        </td>
        <td align="right" valign="top">
            <base:genericButton src="/buttons/large/save.gif" name="<%=EditRelatedTitlesForm.BUTTON_SAVE %>"/>
            <base:genericButton src="/buttons/large/cancel.gif" name="<%=EditRelatedTitlesForm.BUTTON_CANCEL%>"/>
        </td>
    </tr>
    <% if (!form.isResultsListEmpty()) { %>
    <tr>
       <td colspan="2" height="100" valign="bottom">
         <base:imageLine/>
      </td>
    </tr>
    <tr>
        <td class="SectionHeader" colspan="2" id="<%=EditRelatedTitlesForm.ID_HEADING_TITLES_FOUND%>"><%=MessageHelper.formatMessage("editrelatedtitles_Titles")%></td>
    </tr>
    <tr>
        <td colspan="2">
            <table id="<%=EditRelatedTitlesForm.TABLE_TITLES_FOUND%>" cellpadding="3" cellspacing="0" border="0" width="100%">
                <tr>
                    <td class="ColRow"><%= MessageHelper.formatMessage("editrelatedtitles_Title") %></td>
                    <td class="ColRow"><%= MessageHelper.formatMessage("editrelatedtitles_Author") %></td>
                    <td class="ColRow"><%= MessageHelper.formatMessage("editrelatedtitles_Isbn") %></td>
                    <td class="ColRow"><base:imageSpacer width="50" height="1"/></td>
                </tr>
                <%
                    List<HoldTitleGroupEntryValue> list = form.getSearchResultsList();
                    Iterator iter = ObjectHelper.getIterator(list);
                    HoldTitleGroupEntryValue value = null;
                    while (iter.hasNext()) {
                        value = (HoldTitleGroupEntryValue) iter.next();
                    %>                    
                    <base:flipper key="titlesFound">
                        <td class="ColRow"><%= form.renderTitleLink(value)%></td>
                        <td class="ColRow"><%= ResponseUtils.filter(value.getAuthor()) %></td>
                        <td class="ColRow"><%= ResponseUtils.filter(value.getIsbn()) %></td>
                        <td class="tdAlignRight">
                            <base:genericButton name="<%=EditRelatedTitlesForm.BUTTON_ADD_PREFIX + value.getBibID() %>" alt='<%=MessageHelper.formatMessage("editrelatedtitles_AddThisTitle") %>' src="/buttons/large/add.gif" />
                        </td>
                    </base:flipper>
                    <% } %>
            </table>
        </td>
    </tr>
    <% } %>
    <tr>
       <td colspan="2" height="100" valign="bottom">
         <base:imageLine/>
      </td>
    </tr>
    <tr>
        <td class="SectionHeader" colspan="2" id="<%=EditRelatedTitlesForm.ID_HEADING_SELECTED%>"><%=MessageHelper.formatMessage("editrelatedtitles_SelectedTitles")%></td>
    </tr>
    <tr>
        <td colspan="2">
            <table id="<%=EditRelatedTitlesForm.TABLE_HOLD_GROUP_TITLES%>" cellpadding="3" cellspacing="0" border="0" width="100%">
                <% if (form.isHoldGroupTitlesListEmpty()) { %>
                    <tr><td class="ColRowBold" align="center">
                            <%= MessageHelper.formatMessage("editrelatedtitles_ThereAreNoTitlesInThisGroup") %>
                    </td></tr>
                <% } else { %>

    <!-- Write out hold group table rows -->                    
                     <%
                        List<HoldTitleGroupEntryValue> list = form.getHoldGroupTitlesList();
                        Iterator iter = ObjectHelper.getIterator(list);
                        HoldTitleGroupEntryValue value = null;
                        while (iter.hasNext()) {
                            value = (HoldTitleGroupEntryValue) iter.next();
                        %>                    
                        <base:flipper key="holdGroupTitles">
                            <td class="ColRow"><%= form.renderTitleLink(value)%></td>
                            <td class="ColRow"><%= ResponseUtils.filter(value.getAuthor()) %></td>
                            <td class="ColRow"><%= ResponseUtils.filter(value.getIsbn()) %></td>
                            <td class="tdAlignRight">
                                <base:genericButton name="<%=EditRelatedTitlesForm.BUTTON_DELETE_PREFIX + value.getBibID() %>" alt='<%=MessageHelper.formatMessage("editrelatedtitles_DeleteThisTitle") %>' src="/icons/general/delete.gif" />
                            </td>
                        </base:flipper>
                        <% } %>
                <% } %>
            </table>
        </td>
    </tr>
</base:outlinedTableAndTabsWithinThere>

</base:form>
 <SCRIPT LANGUAGE="javascript" TYPE="text/javascript">
    <!--
        function submitTheForm() {
            document.<%=EditRelatedTitlesForm.FORM_NAME%>.submit();
        }
    // -->
    </SCRIPT>
