<%@ page import="com.follett.fsc.destiny.entity.ejb3.ConfigSiteSpecs"%>
<%@ page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@ page import="com.follett.fsc.common.StringHelper"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag"%>
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
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
 

<bean:define id="form" name="<%= EditHelpTicketForm.FORM_NAME %>" type="com.follett.fsc.destiny.client.backoffice.servlet.EditHelpTicketForm"/>

<% 
    boolean printerFriendly = form.isPrinterFriendly();

    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>

<base:messageBox strutsErrors="true"/>
  
<base:form action="/backoffice/servlet/handleedithelpticketform.do">

    <html:hidden property="<%=EditHelpTicketForm.PARAM_GO_TO_COPY_STATUS%>"/>

    <script language="JavaScript" type="text/javascript">
    <!--
    function submitForm() {    
        document.<%=EditHelpTicketForm.FORM_NAME%>.<%=EditHelpTicketForm.PARAM_GO_TO_COPY_STATUS%>.value = true;           
        document.<%=EditHelpTicketForm.FORM_NAME%>.submit();
        return false;
    }
    function submitAndChangeToServicingTeam() {
        document.<%=EditHelpTicketForm.FORM_NAME%>.<%=EditHelpTicketForm.FIELD_ASSIGNED_TYPE%>[0].checked = true;
        document.<%=EditHelpTicketForm.FORM_NAME%>.<%=EditHelpTicketForm.FIELD_SERVICING_TEAM_MEMBER_ID%>.selectedIndex = 0;
        document.<%=EditHelpTicketForm.FORM_NAME%>.submit();
        return false;
    }
    -->
    </script>

    <base:outlinedTable id="<%=EditHelpTicketForm.TABLE_MAIN%>" width="100%" borderColor="#C0C0C0" >
        <tr>
            <td>
                <table id="<%=EditHelpTicketForm.TABLE_LEFT_SIDE%>" width="100%">
                    <tr>
                        <td id="<%=EditHelpTicketForm.ID_ASSET_NAME%>" class="TableHeading" colspan="3" width="50%">
                            <logic:equal name="<%=EditHelpTicketForm.FORM_NAME%>" property="assetDeleted" value="true">
                                <bean:write name="<%=EditHelpTicketForm.FORM_NAME%>" property="title"/> <font color="#CC0000">(Removed)</font>
                            </logic:equal>
                            <logic:equal name="<%=EditHelpTicketForm.FORM_NAME%>" property="assetDeleted" value="false">
                                <bean:write name="<%=EditHelpTicketForm.FORM_NAME%>" property="title"/>
                            </logic:equal>
                            
                            <a href="#notes" style="text-decoration: none">
                                <img src='<%=lh.getLocalizedImagePath("/icons/general/note.gif")%>' border="0" id="<%=EditHelpTicketForm.ID_NOTES_ANCHOR%>" />
                            </a>
                            
                            <span id="showLessItemDetails" style="display:inline">
                                <input type="image" src='<%=lh.getLocalizedImagePath("/icons/general/showless.gif")%>' border="0" name="showLessItemDetails" value="false" onclick="return showMoreLess(0, 'ItemDetails')"/>
                            </span>
                            <span id="showMoreItemDetails" style="display:none">
                                <input type="image" src='<%=lh.getLocalizedImagePath("/icons/general/showmore.gif")%>' border="0" name="showMoreItemDetails" value="true" onclick="return showMoreLess(1, 'ItemDetails')"/>
                            </span>                            
                        </td>
                        <td class="ColRow" width="50%">
                            Item submitted for repair <html:checkbox property="<%=EditHelpTicketForm.FIELD_SUBMIT_FOR_REPAIR%>" tabindex="35" disabled="<%=form.isTicketClosed()%>"/>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="4">
                            <div id="divItemDetails" style="display:block">
                                <table width="100%" border="0">
                                    <tr>
                                        <td>
                                            <img src="/images/icons/general/spacer.gif" width="20" height="1">
                                        </td>
                                        <td>
                                            <table id="<%=EditHelpTicketForm.TABLE_SITE_NAME%>" width="100%">
                                                <tr>
                                                    <td colspan="2" class="ColRowBold" align="center" id="<%=EditHelpTicketForm.ID_SITE_NAME%>">
                                                        <%
                                                            if (form.getStore().getSiteID() == ConfigSiteSpecs.SITE_ID_MY_DISTRICT)  {
                                                        %>
                                                            <bean:write name="<%=EditHelpTicketForm.FORM_NAME%>" property="siteName"/>
                                                        <%
                                                            }
                                                        %>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td class="ColRowBold tdAlignRight" id="<%=EditHelpTicketForm.ID_DEPARTMENT_LABEL%>">
                                                        Department: 
                                                    </td>
                                                    <td class="ColRow tdAlignLeft" id="<%=EditHelpTicketForm.ID_DEPARTMENT%>">
                                                        <bean:write name="<%=EditHelpTicketForm.FORM_NAME%>" property="departmentName"/>
                                                    </td>                                
                                                </tr>
                                                <tr>
                                                    <td class="ColRowBold tdAlignRight" id="<%=EditHelpTicketForm.ID_HOME_LOCATION_LABEL%>">
                                                        Home Location:
                                                    </td>
                                                    <td class="ColRow" align="left" id="<%=EditHelpTicketForm.ID_HOME_LOCATION%>">
                                                        <bean:write name="<%=EditHelpTicketForm.FORM_NAME%>" property="homeLocation"/>
                                                    </td>                                
                                                </tr>
                                                <tr>
                                                    <td class="ColRowBold tdAlignRight" id="<%=EditHelpTicketForm.ID_CUSTODIAN_LABEL%>">
                                                        Custodian:
                                                    </td>
                                                    <td class="ColRow" align="left" id="<%=EditHelpTicketForm.ID_CUSTODIAN%>">
                                                        <bean:write name="<%=EditHelpTicketForm.FORM_NAME%>" property="custodian"/>
                                                    </td>
                                                </tr>
                                            </table>
                                        </td>
                                        <td>
                                            <img src="/images/icons/general/spacer.gif" width="20" height="1">                        
                                        </td>
                                        <td>
                                            <table id="<%=EditHelpTicketForm.TABLE_BARCODE%>" width="100%">
                                                <tr>
                                                    <td align="right" class="ColRowBold tdAlignRight" id="<%=EditHelpTicketForm.ID_COPY_BARCODE_LABEL%>">
                                                        Barcode: 
                                                    </td>
                                                    <td align="left" class="ColRow" id="<%=EditHelpTicketForm.ID_COPY_BARCODE%>">
                                                        <%=form.buildAssetItemBarcodeLink(form.isCopyDeleted())%>
                                                        <%
                                                            if (form.isCopyDeleted() && !form.isAssetDeleted()) {
                                                        %>
                                                        	<font color="#CC0000"> (Removed)</font>
                                                        <%
                                                            }
                                                        %>
                                                    </td>
                                                </tr>    
                                                <tr>
                                                    <td class="ColRowBold tdAlignRight" id="<%=EditHelpTicketForm.ID_DISTRICT_ID_LABEL%>">
                                                        District ID: 
                                                    </td>
                                                    <td align="left" class="ColRow" id="<%=EditHelpTicketForm.ID_DISTRICT_ID%>">
                                                        <bean:write name="<%=EditHelpTicketForm.FORM_NAME%>" property="districtID"/>
                                                    </td>
                                                </tr>    
                                                <tr>
                                                    <td class="ColRowBold tdAlignRight" id="<%=EditHelpTicketForm.ID_SERIAL_NUMBER_LABEL%>">
                                                        Serial Number:
                                                    </td>
                                                    <td align="left" class="ColRow" id="<%=EditHelpTicketForm.ID_SERIAL_NUMBER%>">
                                                        <bean:write name="<%=EditHelpTicketForm.FORM_NAME%>" property="serialNumber"/>
                                                    </td>
                                                </tr>    
                                            </table>                    
                                        </td>
                                    </tr>
                                </table>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td align="center" colspan="4">
                            <base:imageLine height="1" width="100%" />
                        </td>     
                    </tr>
                    <tr>
                        <td class="TableHeading" colspan="4">
                            Issue
                            <span id="showLessIssue" style="display:inline">
                                <input type="image" src='<%=lh.getLocalizedImagePath("/icons/general/showless.gif")%>' border="0" name="showLessIssue" value="false" onclick="return showMoreLess(0, 'Issue')"/>
                            </span>
                            <span id="showMoreIssue" style="display:none">
                                <input type="image" src='<%=lh.getLocalizedImagePath("/icons/general/showmore.gif")%>' border="0" name="showMoreIssue" value="true" onclick="return showMoreLess(1, 'Issue')"/>
                            </span>
                        </td>
                    </tr>               
                    <tr>
                        <td colspan="4">
                            <div id="divIssue" style="display:block">
                                <table width="100%" border="0">
                                    <tr>
                                        <td>
                                            <img src="/images/icons/general/spacer.gif" width="20" height="1">
                                        </td>                       
                                        <td colspan="3">
                                            <table id="<%=EditHelpTicketForm.TABLE_PROBLEM%>" width="100%">
                                                <tr>
                                                    <td class="ColRowBold tdAlignRight" id="<%=EditHelpTicketForm.ID_TICKET_NUMBER_LABEL%>">
                                                        Ticket #:
                                                    </td>  
                                                    <td>
                                                        <table id="<%=EditHelpTicketForm.TABLE_TICKET_NUMBER%>">
                                                            <tr>
                                                                <td class="ColRow tdAlignLeft" colspan="1" id="<%=EditHelpTicketForm.ID_TICKET_NUMBER%>">
                                                                    <bean:write name="<%=EditHelpTicketForm.FORM_NAME%>" property="ticketNumber"/>                            
                                                                </td>
                                                                <td class="ColRowBold tdAlignRight">
                                                                    <img src="/images/icons/general/spacer.gif" width="40" height="1">
                                                                    Priority:
                                                                </td>
                                                                <td class="ColRow tdAlignLeft" id="<%=EditHelpTicketForm.ID_PRIORITY%>"> 
                                                                    <logic:equal name="<%=EditHelpTicketForm.FORM_NAME%>" property="ticketClosed" value="false">
                                                                        <%=JSPHelper.renderDropDown(EditHelpTicketForm.FIELD_PRIORITY, null, HelpTicketSpecs.lookupHelpTicketPriorities(), new Long(form.getPriorityID()))%>
                                                                    </logic:equal>
                                                                    <logic:equal name="<%=EditHelpTicketForm.FORM_NAME%>" property="ticketClosed" value="true">
                                                                        <%=form.getPriorityDisplayable()%>
                                                                    </logic:equal>
                                                                </td>
                                                                <td class="ColRowBold tdAlignRight">
                                                                    <img src="/images/icons/general/spacer.gif" width="5" height="1">
                                                                    Status:
                                                                </td>
                                                                <td class="ColRow tdAlignLeft" id="<%=EditHelpTicketForm.ID_STATUS%>"> 
                                                                    <logic:equal name="<%=EditHelpTicketForm.FORM_NAME%>" property="ticketClosed" value="false">
                                                                        <%=JSPHelper.renderDropDown(EditHelpTicketForm.FIELD_STATUS, null, HelpTicketSpecs.lookupHelpTicketStatuses(), form.getStatus())%>  
                                                                    </logic:equal>
                                                                    <logic:equal name="<%=EditHelpTicketForm.FORM_NAME%>" property="ticketClosed" value="true">
                                                                        <%=form.getStatusDisplayable()%>
                                                                    </logic:equal>
                                                                </td>
                                                            </tr>
                                                        </table>
                                                    </td>
                                                </tr>  
                                                <tr>
                                                     <td class="ColRowBold tdAlignRight" id="<%=EditHelpTicketForm.ID_SUMMARY_LABEL%>" valign="top">
                                                        Summary:
                                                    </td>
                                                    <td class="ColRow" colspan="2" align="left" id="<%=EditHelpTicketForm.ID_SUMMARY%>"> 
                                                        <bean:write name="<%=EditHelpTicketForm.FORM_NAME%>" property="summary"/>                            
                                                    </td>                               
                                                </tr>
                                                <tr>
                                                    <td class="ColRowBold tdAlignRight" id="<%=EditHelpTicketForm.ID_DETAILS_LABEL%>" valign="top">
                                                        Details:
                                                    </td>
                                                    <td class="ColRow" align="left" colspan="2" id="<%=EditHelpTicketForm.ID_DETAILS%>">
                                                        <bean:write name="<%=EditHelpTicketForm.FORM_NAME%>" property="details"/>                            
                                                    </td>                                
                                                </tr>
                                                <tr>
                                                    <td class="ColRowBold tdAlignRight" id="<%=EditHelpTicketForm.ID_ASSIGNED_TO_FIRST_LAST_NAME_LABEL%>">
                                                        Assigned&nbsp;to:
                                                    </td>                                
                                                    <td>
                                                        <logic:equal name="<%= EditHelpTicketForm.FORM_NAME %>" property="ticketClosed" value="true">
                                                            <span id="<%=EditHelpTicketForm.ID_ASSIGNED_TO_FIRST_LAST_NAME%>" class="ColRow">
                                                                <%=form.gimmeDisplayableAssigned()%>
                                                            </span> 
                                                        </logic:equal>
                                                        <logic:equal name="<%= EditHelpTicketForm.FORM_NAME %>" property="ticketClosed" value="false">
                                                            <table id="<%=EditHelpTicketForm.TABLE_ASSIGNED_TO%>" cellspacing="0" border="0" cellpadding="0">
                                                                <tr>
                                                                    <td class="ColRow">
                                                                        <html:radio property="<%=EditHelpTicketForm.FIELD_ASSIGNED_TYPE%>" value="<%=EditHelpTicketForm.ASSIGNED_TYPE_SERVICING_TEAM%>">
                                                                            Servicing team :
                                                                            <%
                                                                            if (form.getServicingTeamList() == null || form.getServicingTeamList().size() == 0) {
                                                                        %>
                                                                                    No servicing teams defined
                                                                            <%
                                                                            } else {
                                                                        %>
                                                                                        <%=JSPHelper.renderDropDown(EditHelpTicketForm.FIELD_ASSIGNED_SERVICING_TEAM_SITE_JOIN_ID,"submitAndChangeToServicingTeam();" 
                                                                                            , form.getServicingTeamList(), form.getAssignedServicingTeamSiteJoinID())%>
                                                                                        <%=JSPHelper.renderDropDown(EditHelpTicketForm.FIELD_SERVICING_TEAM_MEMBER_ID, null, form.getServicingTeamMemberList(), form.getServicingTeamMemberID())%>
                                                                            <% } %>  
                                                                        </html:radio>
                                                                        <br>
                                                                        <html:radio property="<%= EditHelpTicketForm.FIELD_ASSIGNED_TYPE %>" value="<%= EditHelpTicketForm.ASSIGNED_TYPE_INDIVIDUAL %>">
                                                                            Individual : 
                                                                            <span id="<%=EditHelpTicketForm.ID_ASSIGNED_TO_FIRST_LAST_NAME%>">
                                                                            <bean:write name="<%= EditHelpTicketForm.FORM_NAME %>" property="displayableAssignedToName"/>                         
                                                                            <font color="#CC0000">
                                                                                <bean:write name="<%= EditHelpTicketForm.FORM_NAME %>" property="displayableAssignedToSiteName" />
                                                                            </font>
                                                                        </span>&nbsp;
                                                                            <% if (form.getAssignedPatronID() != null) { %>
                                                                                &nbsp;
                                                                                <base:genericButton name="<%= EditHelpTicketForm.BUTTON_CLEAR %>" src="/buttons/large/clear.gif" alt='<%= MessageHelper.formatMessage("clear") %>' />
                                                                            <% } %>
                                                                            <base:genericButton name="<%= EditHelpTicketForm.BUTTON_SELECT_ASSIGNED %>" src="/buttons/large/selectplus.gif" alt='<%= MessageHelper.formatMessage("select") %>' />
                                                                        </html:radio>
                                                                    </td>
                                                                    <td>
                                                                    &nbsp;
                                                                    </td>
                                                                </tr>                                        
                                                            </table>
                                                        </logic:equal>
                                                    </td>                                    
                                                </tr>
                                                <tr>
                                                    <td class="ColRowBold tdAlignRight">
                                                        Expected&nbsp;Completion:
                                                    </td>                                
                                                    <td class="ColRow tdAlignleft" id="<%=EditHelpTicketForm.ID_COMPLETION_DATE %>">
                                                        <logic:equal name="<%= EditHelpTicketForm.FORM_NAME %>" property="ticketClosed" value="false">
                                                             <base:date 
                                                                 buttonName = "<%= EditHelpTicketForm.BUTTON_EXPECTED_COMPLETION %>"
                                                                 fieldName = "<%= EditHelpTicketForm.FIELD_COMPLETION_DATE %>"
                                                                 dateValue = "<%=form.getCompletionDate()%>"
                                                                 altText = "<%=EditHelpTicketForm.ALT_EXPECTED_COMPLETION%>"
                                                             />
                                                        </logic:equal>
                                                        <logic:equal name="<%= EditHelpTicketForm.FORM_NAME %>" property="ticketClosed" value="true">
                                                            <%= form.getCompletionDate() %>
                                                        </logic:equal>    
                                                    </td>                                
                                                </tr>
                                            </table>
                                        </td>
                                    </tr>
                                </table>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td align="center" colspan="4">
                            <base:imageLine height="1" width="100%" />
                        </td>     
                    </tr>
                    <tr>
                        <td class="TableHeading" colspan="4">
                            Requestor Information
                            <span id="showLessRequestor" style="display:inline">
                                <input type="image" src='<%=lh.getLocalizedImagePath("/icons/general/showless.gif")%>' border="0" name="showLessRequestor" value="false" onclick="return showMoreLess(0, 'Requestor')"/>
                            </span>
                            <span id="showMoreRequestor" style="display:none">
                                <input type="image" src='<%=lh.getLocalizedImagePath("/icons/general/showmore.gif")%>' border="0" name="showMoreRequestor" value="true" onclick="return showMoreLess(1, 'Requestor')"/>
                            </span>
                        </td>
                    </tr>    
                    <tr>
                        <td colspan="4">
                            <div id="divRequestor" style="display:block">
                                <table width="100%" border="0">
                                    <tr>              
                                        <td>
                                            <img src="/images/icons/general/spacer.gif" width="20" height="1">
                                        </td>
                                        <td colspan="3">
                                            <table id="<%= EditHelpTicketForm.TABLE_REQUESTOR %>" width="100%">
                                                <tr>
                                                    <td class="ColRowBold tdAlignRight" id="<%= EditHelpTicketForm.ID_REQUESTED_FIRST_LAST_NAME_LABEL %>">
                                                        Name:
                                                    </td>
                                                    <td>
                                                        <table id="<%= EditHelpTicketForm.TABLE_REQUESTOR_DETAILS %>" cellspacing="0" border="0" cellpadding="0">
                                                            <tr>
                                                                <td class="ColRow tdAlignLeft" id="<%= EditHelpTicketForm.ID_REQUESTED_FIRST_LAST_NAME %>">
                                                                    <% if (StringHelper.isEmpty(form.getFirstLastName())) { %>
                                                                        <img src="/images/icons/general/spacer.gif" width="60" height="1">
                                                                    <% } %>                                                
                                                                    <bean:write name="<%= EditHelpTicketForm.FORM_NAME %>" property="firstLastName"/>
                                                                    <font color="#CC0000">
                                                                        <bean:write name="<%= EditHelpTicketForm.FORM_NAME %>" property="requestedPatronSiteName" />
                                                                    </font>
                                                                    <% if (form.isRequestedPatronDeleted()) { %>
                                                                        <font color="#CC0000"> (Removed)</font>
                                                                    <% } %>                                                                    
                                                                    &nbsp;
                                                                </td>                                
                                                                <td align="left">
                                                                    <logic:equal name="<%= EditHelpTicketForm.FORM_NAME %>" property="ticketClosed" value="false">
                                                                        <base:genericButton name="<%= EditHelpTicketForm.BUTTON_SELECT_REQUESTED %>" src="/buttons/large/selectplus.gif" alt='<%= MessageHelper.formatMessage("select") %>' />
                                                                    </logic:equal>                                                                    
                                                                </td> 
                                                                <td>
                                                                &nbsp;
                                                                </td>
                                                            </tr>                                        
                                                        </table>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td class="ColRowBold tdAlignRight" id="<%= EditHelpTicketForm.ID_EMAIL_LABEL %>">
                                                        Email:
                                                    </td>
                                                    <td class="ColRow tdAlignLeft" id="<%= EditHelpTicketForm.ID_EMAIL %>">
                                                        <logic:equal name="<%= EditHelpTicketForm.FORM_NAME %>" property="ticketClosed" value="false">
                                                            <html:text property="email"  size="20" maxlength="200"/>
                                                        </logic:equal>
                                                        <logic:equal name="<%= EditHelpTicketForm.FORM_NAME %>" property="ticketClosed" value="true">
                                                            <%= form.getEmailDisplayable() %>
                                                        </logic:equal>
                                                    </td>                                
                                                </tr>
                                                <tr>
                                                    <td class="ColRowBold tdAlignRight" id="<%= EditHelpTicketForm.ID_PHONE_LABEL %>">
                                                        Phone:
                                                    </td>
                                                    <td class="ColRow tdAlignLeft" id="<%= EditHelpTicketForm.ID_PHONE %>">
                                                        <logic:equal name="<%= EditHelpTicketForm.FORM_NAME %>" property="ticketClosed" value="false">
                                                            <html:text property="phone"  size="20" maxlength="30"/>
                                                        </logic:equal>
                                                        <logic:equal name="<%= EditHelpTicketForm.FORM_NAME %>" property="ticketClosed" value="true">
                                                            <%= form.getPhoneDisplayable() %>
                                                        </logic:equal>
                                                    </td>                                
                                                </tr>
                                            </table>
                                        </td>
                                    </tr>
                                </table>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td align="center" colspan="4">
                            <base:imageLine height="1" width="100%" />
                        </td>     
                    </tr>
                    <tr>
                        <td class="TableHeading" colspan="4">
                            Notes
                            <a id="notes"/>
                            <span id="showLessNotes" style="display:inline">
                                <input type="image" src='<%=lh.getLocalizedImagePath("/icons/general/showless.gif")%>' border="0" name="showLessNotes" value="false" onclick="return showMoreLess(0, 'Notes')"/>
                            </span>
                            <span id="showMoreNotes" style="display:none">
                                <input type="image" src='<%=lh.getLocalizedImagePath("/icons/general/showmore.gif")%>' border="0" name="showMoreNotes" value="true" onclick="return showMoreLess(1, 'Notes')"/>
                            </span>
                            <logic:equal name="<%= EditHelpTicketForm.FORM_NAME %>" property="ticketClosed" value="false">
                                &nbsp;&nbsp;&nbsp;&nbsp;
                                <input type="image" src='<%=lh.getLocalizedImagePath("/buttons/large/addnote.gif")%>' border="0" name="<%= EditHelpTicketForm.BUTTON_ADD_NOTE %>" value="<%= EditHelpTicketForm.BUTTON_ADD_NOTE %>" />
                            </logic:equal>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="4">
                            <div id="divNotes" style="display:block">
                                <table border="0" width="100%" id="<%= EditHelpTicketForm.TABLE_NOTES %>">
                                    <% if (form.getNotes().size() == 0) { %>
                                    <tr>
                                        <td class="ColRow">
                                            There are no notes to display.
                                        </td>
                                    </tr>
                                    <% } else {
                                        Iterator iter = ObjectHelper.getIterator(form.getNotes());
                                       while (iter.hasNext()) {
                                       HelpTicketHistoryValue vo = (HelpTicketHistoryValue) iter.next();
                                    %>
                                        <base:flipper key="helpticketnote">
                                            <td align="left" class="ColRow" width="15%" valign="top"><%= form.getNoteDateAndPerformedByUserHTML(vo) %></td>
                                            <td align="left" class="ColRow"><%= form.getNoteDescriptionHTML(vo) %></td>
                                        </base:flipper>
                                    <% } %>
                                    <% } %>
                                </table>
                            </div>
                        </td>
                    </tr>
                </table>
            </td>
            <td>
                <img src="/images/icons/general/spacer.gif" width="20" height="1">
            </td>
            <td valign="top">
                <table id="tableButtons">
                    <logic:equal name="<%= EditHelpTicketForm.FORM_NAME %>" property="ticketClosed" value="false">
                        <tr>
                            <td>
                                <base:saveButton name="<%= EditHelpTicketForm.BUTTON_SAVE %>" />
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <base:cancelButton name="<%= EditHelpTicketForm.BUTTON_CANCEL %>" />
                            </td>
                        </tr>
                    </logic:equal>
                    <logic:equal name="<%= EditHelpTicketForm.FORM_NAME %>" property="ticketClosed" value="true">
                        <tr>
                            <td>
                                <base:closeButton withX="true" name="<%= EditHelpTicketForm.BUTTON_CANCEL %>" />
                            </td>
                        </tr>

                    <logic:notEqual name="<%= EditHelpTicketForm.FORM_NAME %>" property="copyDeleted" value="true">
                        <tr>
                            <td>
                                <base:genericButton src="/buttons/large/reopen.gif" name="<%= EditHelpTicketForm.BUTTON_REOPEN %>" alt="<%= EditHelpTicketForm.ALT_REOPEN %>"/>
                            </td>
                        </tr>
                    </logic:notEqual>
                    </logic:equal>
                    <tr>
                        <td>
                        &nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <base:genericButton src="/buttons/large/viewhistory2.gif" name="<%= EditHelpTicketForm.BUTTON_VIEW_HISTORY %>" alt="<%= EditHelpTicketForm.ALT_VIEW_HISTORY %>"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </base:outlinedTable>
    
    <script language="JavaScript">
    <!--
    function showMoreLess(t, section) {
        var spanLess = document.getElementById('showLess' + section);
        var spanMore = document.getElementById('showMore' + section);
        var div = document.getElementById('div' + section);
        if (t == 0) {
            spanLess.style.display='none';
            spanMore.style.display='inline';
            div.style.display='none';
        } else {
            spanLess.style.display='inline';
            spanMore.style.display='none';
            div.style.display='block';
        }
        return false;
    }
    //-->
    </script>
    
</base:form>
