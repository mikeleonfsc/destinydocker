<%@page import="com.follett.fsc.destiny.util.marc.BibType"%>
<%@page import="com.follett.fsc.destiny.session.circulation.data.TexbookTitleEntryValue"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.data.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag" %>
<%@ page import="com.follett.fsc.destiny.client.common.data.Tab"%>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.BasePatronListForm"%>
<%@page import="com.follett.fsc.destiny.client.common.servlet.GenericForm"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>



<%
    GlobalTextbookCheckinForm form = (GlobalTextbookCheckinForm) request.getAttribute(GlobalTextbookCheckinForm.FORM_NAME);
    SessionStoreProxy store = form.getStore();
    Tab[] tabs = BasePatronListForm.getTabs(store);
%>


<base:messageBox strutsErrors="true"/>
<base:form action="/backoffice/servlet/handleglobaltextbookcheckinform">
    <html:hidden property="<%= GlobalTextbookCheckinForm.PROP_SELECTED_TITLE_LIST%>"/>
    <html:hidden property="<%= GlobalTextbookCheckinForm.PROP_SEARCH_RESULT_LIST%>"/>
    <html:hidden property="<%= GlobalTextbookCheckinForm.PROP_SELECTED_BIB_ID_LIST%>"/>
    <html:hidden property="<%= GlobalTextbookCheckinForm.PARAM_ENTER_KEY_PRESSED%>"/>
<script language="JavaScript" type="text/javascript">
  <!--
 
  function trapEnterKey(e)
  {
      // look for window.event in case event isn't passed in
      if (typeof e == 'undefined' && window.event) { e = window.event; }
      if (e.keyCode == 13)
      {
          document.<%=GlobalTextbookCheckinForm.FORM_NAME%>.<%=GlobalTextbookCheckinForm.PARAM_ENTER_KEY_PRESSED%>.value = "true";
          document.getElementById('search').click();
          return true;
      }
  }
  // -->
</script>

<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey"/>
    <logic:equal name="<%=GlobalTextbookCheckinForm.FORM_NAME%>" property="<%=GlobalTextbookCheckinForm.PARAM_SHOW_CONFIRMATION%>" value="true">
        <%
            String countStr = form.gimmeConfirmMessageCount();
                    String[] messageText = new String[]{
                        countStr,
                        "Are you sure you want to proceed?"
                    };
        %>
        <base:confirmBox 
            showWarningIcon="true" filterMessage="false" showPleaseWait="true"
            header="All of your site's selected checked out copies will be checked in."
            messageText="<%=messageText%>"
            noName="<%=GlobalTextbookCheckinForm.BUTTON_CANCEL_CHECK_IN_TEXTBOOKS%>" 
            yesName="<%=GlobalTextbookCheckinForm.BUTTON_CONFIRM_CHECK_IN_TEXTBOOKS%>"/>
     </logic:equal>

    <base:outlinedTableAndTabsWithinThere id="<%=GlobalTextbookCheckinForm.TABLE_MAIN%>"
        tabs="<%=tabs%>"
        selectedTabID="<%=IUpdatePatronForm.ID_TAB_GLOBAL_TB_CHECKIN%>"
        selectedTab="Global Check In"
        hideTabsWhenPrinterFriendly="true" borderColor="#C0C0C0" width="100%">
        <tr>
            <td colspan="2" class="TableHeading"><%=MessageHelper.formatMessage("GlobalTextbookCheckIn_CheckinTextbook")%>
            </td>
        </tr>
        
        <tr>
        <td>&nbsp;</td>
            <td class="ColRow"><html:checkbox
                    property="<%=GlobalTextbookCheckinForm.FIELD_UNBARCODED_COPIES%>"><%=MessageHelper.formatMessage("GlobalTextbookCheckIn_Unbarcoded")%></html:checkbox>
            </td>
        </tr>
        <tr>
        <td>&nbsp;</td>
            <td class="ColRow"><html:checkbox
                    property="<%=GlobalTextbookCheckinForm.FIELD_BARCODED_COPIES%>"><%=MessageHelper.formatMessage("GlobalTextbookCheckIn_Barcoded")%></html:checkbox>
            </td>
        </tr>
       
    
        
        <!-- patrons associated with my site only or include offsite patrons at my site -->
        <tr>
            <td class="ColRowBold tdAlignRight" valign="top"><%=MessageHelper.formatMessage("GlobalTextbookCheckIn_AssociatedWith")%></td>
            <td class="ColRow"><html:select
                    property="<%=GlobalTextbookCheckinForm.FIELD_PATRONS_TO_HAVE_COPIES_CHECKIN%>">
                    <html:option
                        value='<%="" + GlobalTextbookCheckinJobParams.OPTION_ALL_PATRONS%>'>
                        <%=form.getOptionsDescription(GlobalTextbookCheckinJobParams.OPTION_ALL_PATRONS) %></html:option>
                    <html:option
                        value='<%="" + GlobalTextbookCheckinJobParams.OPTION_MY_PATRONS_ONLY%>'>
                        <%=form.getOptionsDescription(GlobalTextbookCheckinJobParams.OPTION_MY_PATRONS_ONLY)%></html:option>
                </html:select></td>
        </tr>
        <!-- patron limit by drop down (e.g. grad year, grade level, etc.) -->
         <tr>
           <td colspan="2" valign="bottom">
             <base:imageLine/>
          </td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight" valign="top">&nbsp;</td>
            <td class="ColRow"><html:checkbox
                    property="<%=GlobalTextbookCheckinForm.FIELD_LIMIT_WITH%>"><%=MessageHelper.formatMessage("GlobalTextbookCheckIn_With")%></html:checkbox>
                &nbsp; <html:select
                    property="<%=GlobalTextbookCheckinForm.FIELD_ASSOCIATED_FIELD%>">
                    <html:option
                        value='<%="" + GlobalTextbookCheckinJobParams.OPTION_TITLE%>'>
                        <%=form.getFieldDisplayableForSearchBy(GlobalTextbookCheckinJobParams.OPTION_TITLE)%></html:option>
                    <html:option
                        value='<%="" + GlobalTextbookCheckinJobParams.OPTION_ISBN%>'>
                        <%=form.getFieldDisplayableForSearchBy(GlobalTextbookCheckinJobParams.OPTION_ISBN)%></html:option>
                </html:select> 
                &nbsp;<html:text property="<%=GlobalTextbookCheckinForm.FIELD_ASSOCIATED_VALUE%>" size="25" onkeypress="return trapEnterKey(event);" />
                &nbsp;<base:genericButton src="/buttons/large/search.gif" alt='<%= MessageHelper.formatMessage("search")%>' name="<%= GlobalTextbookCheckinForm.BUTTON_SEARCH %>" />
                        
                    
                    </td>
        </tr>
        <!--Search results list -->        
                <% if (!form.isSearchResultsListEmpty()) { %>
        <tr>
           <td colspan="2" valign="bottom">
             <base:imageLine/>
          </td>
        </tr>
        <tr>
            <td class="SectionHeader" colspan="2" id="<%=GlobalTextbookCheckinForm.ID_HEADING_TITLES_FOUND%>"><%=MessageHelper.formatMessage("editrelatedtitles_Titles")%></td>
        </tr>
        <tr>
            <td colspan="2">
                <table id="<%=GlobalTextbookCheckinForm.ID_HEADING_TITLES_FOUND%>" cellpadding="3" cellspacing="0" border="0" width="100%">
                    <tr>
                        <td class="ColRow">Title</td>
                        <td class="ColRow">Author</td>
                        <td class="ColRow">ISBN</td>
                        <td class="ColRow"><base:imageSpacer width="50" height="1"/></td>
                    </tr>
                    <%
                        List<TexbookTitleEntryValue> list = form.getSearchResultsList();
                        Iterator iter = ObjectHelper.getIterator(list);
                        TexbookTitleEntryValue value = null;
                        while (iter.hasNext()) {
                            value = (TexbookTitleEntryValue) iter.next();
                        %>                    
                        <base:flipper key="titlesFound">
                            <td class="ColRow"><%=value.getIcons()%>&nbsp;<%= form.renderTitleLink(value)%></td>
                            <td class="ColRow"><%= ResponseUtils.filter(value.getAuthor()) %></td>
                            <td class="ColRow"><%= ResponseUtils.filter(value.getIsbn()) %></td>
                            <td class="tdAlignRight">
                                <base:genericButton name="<%=GlobalTextbookCheckinForm.BUTTON_ADD_PREFIX + value.getBibID() %>" alt='<%=MessageHelper.formatMessage("editrelatedtitles_AddThisTitle") %>' src="/buttons/large/selectplus.gif" />
                            </td>
                        </base:flipper>
                        <% } %>
                </table>
            </td>
        </tr>
        <% } %>
        <tr>
           <td colspan="2" height="20" valign="bottom">
             <base:imageLine/>
          </td>
        </tr>
        <tr>
            <td class="SectionHeader" colspan="2" id="<%=GlobalTextbookCheckinForm.ID_HEADING_SELECTED%>"><%=MessageHelper.formatMessage("editrelatedtitles_SelectedTitles")%></td>
        </tr>
        <tr>
            <td colspan="2">
                <table id="<%=GlobalTextbookCheckinForm.ID_HEADING_SELECTED%>" cellpadding="3" cellspacing="0" border="0" width="100%">
                    <% if (form.isSelectedTitlesListEmpty()) { %>
                        <tr><td class="ColRowBold" align="center">
                                <%= MessageHelper.formatMessage("GlobalTextbookCheckIn_ThereAreNoTitlesSelected") %>
                        </td></tr>
                    <% } else { %>
    
         <!--selected Titles list -->                   
                         <%
                            List<TexbookTitleEntryValue> list = form.getSelectedTitlesList();
                            Iterator iter = ObjectHelper.getIterator(list);
                            TexbookTitleEntryValue value = null;
                            while (iter.hasNext()) {
                                value = (TexbookTitleEntryValue) iter.next();
                            %>                    
                            <base:flipper key="holdGroupTitles">
                                <td class="ColRow"><%=value.getIcons()%>&nbsp;<%= form.renderTitleLink(value)%></td>
                                <td class="ColRow"><%= ResponseUtils.filter(value.getAuthor()) %></td>
                                <td class="ColRow"><%= ResponseUtils.filter(value.getIsbn()) %></td>
                                <td class="tdAlignRight">
                                    <base:genericButton name="<%=GlobalTextbookCheckinForm.BUTTON_DELETE_PREFIX + value.getBibID() %>" alt="Remove this title" src="/icons/general/delete.gif" />
                                </td>
                            </base:flipper>
                            <% } %>
                    <% } %>
                </table>
            </td>
        </tr>
        
        <tr>
            <td><span class="Instruction">* Consumables not included</span></td>
        </tr>        
        <tr valign="top" align="center">
            <td valign="top" colspan="2"><span class="ColRowBold"><%=GenericForm.getLastBackupDisplayMsg(true)%></span>
            </td>
        </tr>
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:genericButton src="/buttons/small/checkinwithcheckmark.gif"
                    name="<%=GlobalTextbookCheckinForm.BUTTON_CHECKIN%>"
                    alt='<%=MessageHelper.formatMessage("GlobalTextbookCheckIn_Checkin")%>' />
            </td>
        </tr>

    </base:outlinedTableAndTabsWithinThere>

</base:form>

