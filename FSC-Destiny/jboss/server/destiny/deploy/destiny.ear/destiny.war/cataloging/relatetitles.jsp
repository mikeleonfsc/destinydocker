<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@page import="com.follett.fsc.destiny.session.circulation.data.HoldInformationValue"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.URLHelper" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.HoldTitleGroupValue" %>
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
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>

<script language="JavaScript" type="text/javascript">
  <!--
  function trapEnterKey(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        document.<%=RelateTitlesForm.FORM_NAME%>.<%=RelateTitlesForm.PARAM_ENTER_KEY_PRESSED%>.value = "true";
        document.<%=RelateTitlesForm.FORM_NAME%>.submit();
      }
    }
  
  // -->
</script>

<bean:define id="form" name="form" type="com.follett.fsc.destiny.client.cataloging.servlet.RelateTitlesForm"/>
<base:form action="/cataloging/servlet/handlerelatetitles.do" focus="<%=RelateTitlesForm.FIELD_NEW_GROUP_NAME_TOP%>">
    <html:hidden property="<%= RelateTitlesForm.PARAM_ENTER_KEY_PRESSED%>"/>
<% if (!StringHelper.isEmpty(form.getConfirmDeleteMessage())) { %>
   <html:hidden property="<%= RelateTitlesForm.PARM_CONFIRM_DELETED_ID%>"/>   

   <base:messageBox showRedBorder="true">
       <tr>
           <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
           <td class="ColRowBold" align="center"><%= ResponseUtils.filter(form.getConfirmDeleteMessage()) %></td>
       </tr>
       <tr>
            <td>&nbsp;</td>
            <td valign="baseline" align="center" class="ColRow">
                <base:yesNo buttonNoName="<%=RelateTitlesForm.BUTTON_CANCEL_DELETE%>" buttonYesName="<%=RelateTitlesForm.BUTTON_CONFIRM_DELETE%>"/>
            </td>
       </tr>
   </base:messageBox>
<% } %>  

<c:if test="<%=!form.getHoldsProcessedList().isEmpty()%>">
<base:messageBox showRedBorder="true">
       <tr>
           <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
           <td class="ColRowBold" align="center"><%=MessageHelper.formatMessage("relatetitles_TheModificationsToThisGroupHaveReadiedHolds")%></td>
       </tr>
    <% for(HoldInformationValue holdMsg : form.getHoldsProcessedList()) { %>
            <tr valign="top" align="center">
                <td>&nbsp;</td>
                <td class="ColRow" align="center"><%=form.formatHoldMessage(holdMsg)%></td>
            </tr>
    <% } %>
</base:messageBox>
</c:if>

    
<base:outlinedTableAndTabsWithinThere id="${form.constants.TABLE_RELATE_TITLES}"  selectedTab="${form.constants.ID_TAB}" tabs="<%=UpdateTitlesNavigationForm.getTabs()%>" >
    <tr>
        <td class="TableHeading">
            <%=MessageHelper.formatMessage("relatetitles_RelateTitlesToFulfillHolds") %>
        </td>
        <td width="200" valign="top" class="ColRowBold" nowrap align="right">
            <%= MessageHelper.formatMessage("relatetitles_EnterNewGroupName") %>
        </td>
        <td width="1" valign="top"> 
            <html:text property="<%=RelateTitlesForm.FIELD_NEW_GROUP_NAME_TOP%>" size="20" maxlength="100"/>
        </td>
        <td width="1" valign="top">
            <base:genericButton name="<%=RelateTitlesForm.BUTTON_ADD %>" alt='<%=MessageHelper.formatMessage("add") %>' src="/buttons/large/add.gif"/>
        </td>
    </tr>
    <tr>
        <td colspan="4">
            <table id="<%=RelateTitlesForm.TABLE_HOLD_GROUPS%>" cellpadding="3" cellspacing="0" border="0" width="100%">
                <% if (form.isHoldGroupsEmpty()) { %>
                    <tr><td class="ColRowBold" align="center">
                            <%= MessageHelper.formatMessage("relatetitles_ThereAreNoGroupsDefined") %>
                    </td></tr>
                <% } else { %>
                    <!-- Must logic equal the list size for empty message-->
                    <tr>
                        <td class="ColRowBold"><%= MessageHelper.formatMessage("relatetitles_GroupName") %></td>
                        <td class="ColRowBold"><%= MessageHelper.formatMessage("relatetitles_Quantity") %></td>
                        <td class="ColRow"><base:imageSpacer width="50" height="1"/></td>                         
                    </tr>
    <!-- Write out hold group table rows -->                    
                     <%
                        List<HoldTitleGroupValue> list = form.getHoldGroupsList();
                        Iterator iter = ObjectHelper.getIterator(list);
                        HoldTitleGroupValue value = null;
                        while (iter.hasNext()) {
                            value = (HoldTitleGroupValue) iter.next();
                        %>                    
                        <base:flipper key="holdGroups">
                            <td class="ColRow"><%= ResponseUtils.filter(value.getName())%></td>
                            <td class="ColRow"><%= value.getTitles().size() %></td>
                            <td class="tdAlignRight">
                                <base:genericButton name="<%=RelateTitlesForm.BUTTON_EDIT_PREFIX + value.getHoldTitleGroupID() %>" alt='<%=MessageHelper.formatMessage("relatetitles_EditThisGroup") %>' src="/icons/general/edit.gif" />
                            &nbsp;
                                <base:genericButton name="<%=RelateTitlesForm.BUTTON_DELETE_PREFIX + value.getHoldTitleGroupID() %>" alt='<%=MessageHelper.formatMessage("relatetitles_DeleteThisGroup") %>' src="/icons/general/delete.gif" />
                            </td>
                        </base:flipper>
                        <% } %>
                <% } %>
            </table>
        </td>
    </tr>
    <tr>
       <td colspan="4" height="100" valign="bottom">
         <base:imageLine/>
      </td>
    </tr>
    <tr>
        <td class="TableHeading">&nbsp;</td>
        <td width="200" valign="top" class="ColRowBold" nowrap align="right">
            <%= MessageHelper.formatMessage("relatetitles_EnterNewGroupName") %>
        </td>
        <td width="1" valign="top"> 
            <html:text property="<%=RelateTitlesForm.FIELD_NEW_GROUP_NAME_BOTTOM%>" size="20"/>
        </td>
        <td width="1" valign="top">
            <base:genericButton name="<%=RelateTitlesForm.BUTTON_ADD %>" alt='<%=MessageHelper.formatMessage("add") %>' src="/buttons/large/add.gif"/>
        </td>
    </tr>
    <tr>
       <td colspan="4" valign="bottom">
         <base:imageLine/>
      </td>
    </tr>     
    <tr>
        <td  align="center" colspan="2">
          <base:helpIcons buttonsToOutput="<%=form.getHelpIcons()%>"/>
        </td>
    </tr>
</base:outlinedTableAndTabsWithinThere>

</base:form>
 <SCRIPT LANGUAGE="javascript" TYPE="text/javascript">
    <!--
        function submitTheForm() {
            document.<%=RelateTitlesForm.FORM_NAME%>.submit();
        }
    // -->
    </SCRIPT>
