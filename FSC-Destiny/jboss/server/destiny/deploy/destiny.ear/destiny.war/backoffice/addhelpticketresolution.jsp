<%@page import="com.follett.fsc.destiny.entity.ejb3.HelpTicketResolutionVO"%>
<%@page import="com.follett.fsc.destiny.util.lookup.LongStringLookup"%>
<%@page import="org.apache.catalina.manager.JspHelper"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.ConfigSiteSpecs"%>
<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.HelpTicketSpecs" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.RoleSpecs"%>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
 

<bean:define id="form" name="<%= AddHelpTicketResolutionForm.FORM_NAME %>" type="com.follett.fsc.destiny.client.backoffice.servlet.AddHelpTicketResolutionForm"/>

<% boolean printerFriendly = form.isPrinterFriendly(); %>

<base:messageBox strutsErrors="true"/>

<script language="JavaScript">
<!--
    function trapEnter(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        return false;
      }
      return true;
    }
//-->
</script>

<base:form action="/backoffice/servlet/handleaddhelpticketresolutionform.do" focus="<%= AddHelpTicketResolutionForm.FIELD_RESOLUTION_NAME %>">
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">
    <jsp:include page="/common/msdewarning.jsp" flush="true" />
    
    <!-- If I am editing, I need a hidden field -->
    <logic:equal name="<%= AddHelpTicketResolutionForm.FORM_NAME %>" property="editing" value="true">
        <html:hidden property="<%= AddHelpTicketResolutionForm.FIELD_HELP_TICKET_RESOLUTION_ID %>"/>
        <html:hidden property="<%= AddHelpTicketResolutionForm.PARAM_ACTION %>"/>
    </logic:equal>    
    
    <logic:equal name="<%= AddHelpTicketResolutionForm.FORM_NAME %>" property="action" value="<%= AddHelpTicketResolutionForm.ACTION_DELETE %>">
        <logic:notEmpty name="<%= AddHelpTicketResolutionForm.FORM_NAME %>" property="blockReassignMessageText">
            <base:messageBox showRedBorder="true">
                <tr valign="middle">
                    <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                    <td class="ColRowBold" align="center">
                        <%= form.getBlockReassignMessageText() %>
                    </td>
                </tr>
            </base:messageBox>
        </logic:notEmpty>
        <logic:empty name="<%= AddHelpTicketResolutionForm.FORM_NAME %>" property="blockReassignMessageText">
            <base:messageBox showRedBorder="true">
            <tr valign="center">
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
    
                <logic:equal name="<%= AddHelpTicketResolutionForm.FORM_NAME %>" property="reassignNeeded" value="true">
                    <bean:define id="associatedList" name="<%= AddHelpTicketResolutionForm.FORM_NAME %>" property="<%= AddHelpTicketResolutionForm.FIELD_REASSIGN_LIST %>"/>
    
                    <td class="ColRowBold" align="center">
                        <%= form.getReassignMessageText() %>
                        <html:select property="<%= AddHelpTicketResolutionForm.FIELD_REASSIGN_TO_ID %>" >
                            <html:options collection="associatedList" property="longID" labelProperty="stringDesc" />
                        </html:select>
                    </td>
                    </tr>
                    <tr>
                    <td>&nbsp;</td>
                </logic:equal>
                <td class="ColRowBold" align="center">Are you sure you want to delete "<bean:write name="<%= AddHelpTicketResolutionForm.FORM_NAME %>" property="<%= AddHelpTicketResolutionForm.FIELD_CONFIRMATION_NAME %>"/>"?</td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td valign="baseline" align="center" class="ColRow">
                    <base:yesNo 
                        buttonYesName="<%= AddHelpTicketResolutionForm.BUTTON_CONFIRM_DELETE %>"
                        buttonNoName="<%= AddHelpTicketResolutionForm.BUTTON_CANCEL_DELETE %>"
                    />
                </td>
            </tr>
            </base:messageBox>
        </logic:empty>
    </logic:equal>
    
    <%-- 
        The following code adjust the alignment of the table when 
        displayed from a location that doesn't support the level2menu.
    --%>
    <base:outlinedTable id="<%= AddHelpTicketResolutionForm.TABLE_MAIN %>" borderColor="#C0C0C0" width="100%">
    <tr>
        <td>
            <table id=<%= AddHelpTicketResolutionForm.TABLE_EDIT %> width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td class="ColRowBold tdAlignRight">
                    <logic:equal name="<%= AddHelpTicketResolutionForm.FORM_NAME %>" property="editing" value="false">
                        Add Resolution&nbsp;
                    </logic:equal>
                    <logic:equal name="<%= AddHelpTicketResolutionForm.FORM_NAME %>" property="editing" value="true">
                        Edit Resolution&nbsp;
                    </logic:equal>
                    </td>
                    
                    <td>
                        <html:text property="<%= AddHelpTicketResolutionForm.FIELD_RESOLUTION_NAME %>" size="40" maxlength="<%= form.getResolutionNameMaxLength() %>"/>
                    </td>
                    
                    <td align="center" class="ColRowBold">
                        <base:showHideTag id="onSave">                    
                            <base:saveButton onclick="hideElementonSave()" name="<%= AddHelpTicketResolutionForm.BUTTON_SAVE %>" />
                            <br/>
                            <base:cancelButton name="<%= AddHelpTicketResolutionForm.BUTTON_CANCEL %>" />
                        </base:showHideTag>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    <tr>
        <td>
            <base:imageLine height="1" width="100%"/>
        </td>
    </tr>
    <tr>
        <td>
            <table width="100%">
                <tr>
                    <td class="TableHeading">
                        Current Resolutions...
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    <tr>
        <td>
            <table id=<%= AddHelpTicketResolutionForm.TABLE_RESOLUTION_LIST %> width="100%" border="0" cellspacing="0" cellpadding="2">
            <%
            //List is a list of value objects
            List<LongStringLookup> list = form.getResolutions();
            Iterator iter = ObjectHelper.getIterator(list);
            LongStringLookup value = null;
            while (iter.hasNext()) {
                value = (LongStringLookup) iter.next();
            %>
                <base:flipper key="addhelpticketresolution">
                    <td class="ColRow">
                        <%= ResponseUtils.filter(value.getStringDesc())%>
                    </td>
                    <td class="ColRow tdAlignRight">
                    <% if (!HelpTicketSpecs.DEFAULT_RESOLUTIONS.contains(value.getLongID())) { %>
                        <base:link id="<%= AddHelpTicketResolutionForm.ID_EDIT_PREFIX + value.getLongID() %>"  page='<%= "/backoffice/servlet/handleaddhelpticketresolutionform.do?action=" +  AddHelpTicketResolutionForm.ACTION_EDIT + "&helpTicketResolutionID=" + value.getLongID() %>'>
                            <base:image src="/icons/general/edit.gif" width="19" height="16" alt='<%="Edit " + ResponseUtils.filter(value.getStringDesc()) %>'/>
                        </base:link>
                        &nbsp;
                        <base:link id="<%= AddHelpTicketResolutionForm.ID_DELETE_PREFIX + value.getLongID() %>" page='<%= "/backoffice/servlet/handleaddhelpticketresolutionform.do?action=" +  AddHelpTicketResolutionForm.ACTION_DELETE + "&helpTicketResolutionID=" + value.getLongID() %>'>
                            <base:image src="/icons/general/delete.gif" width="19" height="16" alt='<%="Delete " + ResponseUtils.filter(value.getStringDesc()) %>'/>
                        </base:link>
                    <% } %>    
                    </td>
                </base:flipper>
            <% } %>
            </table>
        </td>
    </tr>
    </base:outlinedTable>
</base:form>
