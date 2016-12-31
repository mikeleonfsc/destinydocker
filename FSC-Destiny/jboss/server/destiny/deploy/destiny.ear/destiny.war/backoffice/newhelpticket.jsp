<%@page import="com.follett.fsc.destiny.entity.ejb3.ConfigSiteSpecs"%>
<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="com.follett.fsc.common.LocaleHelper"%>
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
 

<bean:define id="form" name="<%= NewHelpTicketForm.FORM_NAME %>" type="com.follett.fsc.destiny.client.backoffice.servlet.NewHelpTicketForm"/>

<%
    boolean printerFriendly = form.isPrinterFriendly();

    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>

<base:messageBox strutsErrors="true"/>
  
<base:form action="/backoffice/servlet/handlenewhelpticketform.do">

    <html:hidden property="<%=NewHelpTicketForm.PARAM_GO_TO_COPY_STATUS%>"/>

    <script language="JavaScript" type="text/javascript">
    <!--
    function submitForm() {    
        document.<%=NewHelpTicketForm.FORM_NAME%>.<%=NewHelpTicketForm.PARAM_GO_TO_COPY_STATUS%>.value = true;           
        document.<%=NewHelpTicketForm.FORM_NAME%>.submit();
        return false;
    }
    function submitAndChangeToServicingTeam() {
        document.<%=NewHelpTicketForm.FORM_NAME%>.<%=NewHelpTicketForm.FIELD_ASSIGNED_TYPE%>[0].checked = true;
        document.<%=NewHelpTicketForm.FORM_NAME%>.<%=NewHelpTicketForm.FIELD_SERVICING_TEAM_MEMBER_ID%>.selectedIndex = 0;
        document.<%=NewHelpTicketForm.FORM_NAME%>.submit();
        return false;
    }
    -->
    </script>

    <base:outlinedTable id="<%=NewHelpTicketForm.TABLE_MAIN%>" width="100%" borderColor="#C0C0C0" >
        <tr>
            <td>
                <table id="<%=NewHelpTicketForm.TABLE_LEFT_SIDE%>" width="100%">
                    <tr>
                        <td id="<%=NewHelpTicketForm.ID_ITEM%>" class="TableHeading" colspan="3">
                            *&nbsp;Item
                            <span id="showLessItemDetails" style="display:inline">
                                <input type="image" src='<%=lh.getLocalizedImagePath("/icons/general/showless.gif")%>' border="0" name="showLessItemDetails" value="false" onclick="return showMoreLess(0, 'ItemDetails')"/>
                            </span>
                            <span id="showMoreItemDetails" style="display:none">
                                <input type="image" src='<%=lh.getLocalizedImagePath("/icons/general/showmore.gif")%>' border="0" name="showMoreItemDetails" value="true" onclick="return showMoreLess(1, 'ItemDetails')"/>
                            </span> 
                            <base:genericButton name="<%=NewHelpTicketForm.BUTTON_SELECT_ASSET%>" src="/buttons/large/selectplus.gif" alt='<%=MessageHelper.formatMessage("select")%>'/>
                        </td>
                        <td class="ColRow">
                            Item submitted for repair <html:checkbox property="<%=NewHelpTicketForm.FIELD_SUBMIT_FOR_REPAIR%>" tabindex="35"/>
                        </td>
                    </tr>
                    <tr>
                        <td id="<%=NewHelpTicketForm.ID_ASSET_NAME%>" class="ColRowBold" colspan="4">
                            <%
                                if (form.getTitle() != null) {
                            %>
                                &nbsp;&nbsp;&nbsp;&nbsp;<bean:write name="<%=NewHelpTicketForm.FORM_NAME%>" property="title"/>
                            <%
                                }
                            %>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="4">
                            <%
                                if (form.getTitle() != null) {
                            %>
                                <div id="divItemDetails" style="display:block">
                                    <table width="100%" border="0">
                                        <tr>
                                            <td>
                                                <img src="/images/icons/general/spacer.gif" width="20" height="1">
                                            </td>
                                            <td>
                                                <table id="<%=NewHelpTicketForm.TABLE_SITE_NAME%>" width="100%">
                                                    <tr>
                                                        <td colspan="2" class="ColRowBold" align="center" id="<%=NewHelpTicketForm.ID_SITE_NAME%>">
                                                            <%
                                                                if (form.getStore().getSiteID() == ConfigSiteSpecs.SITE_ID_MY_DISTRICT)  {
                                                            %>
                                                                <bean:write name="<%=NewHelpTicketForm.FORM_NAME%>" property="siteName"/>
                                                            <%
                                                                }
                                                            %>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td class="ColRowBold tdAlignRight" id="<%=NewHelpTicketForm.ID_DEPARTMENT_LABEL%>">
                                                            Department: 
                                                        </td>
                                                        <td class="ColRow tdAlignLeft" id="<%=NewHelpTicketForm.ID_DEPARTMENT%>">
                                                            <bean:write name="<%=NewHelpTicketForm.FORM_NAME%>" property="departmentName"/>
                                                        </td>                                
                                                    </tr>
                                                    <tr>
                                                        <td class="ColRowBold tdAlignRight" id="<%=NewHelpTicketForm.ID_HOME_LOCATION_LABEL%>">
                                                            Home Location:
                                                        </td>
                                                        <td class="ColRow" align="left" id="<%=NewHelpTicketForm.ID_HOME_LOCATION%>">
                                                            <bean:write name="<%=NewHelpTicketForm.FORM_NAME%>" property="homeLocation"/>
                                                        </td>                                
                                                    </tr>
                                                    <tr>
                                                        <td class="ColRowBold tdAlignRight" id="<%=NewHelpTicketForm.ID_CUSTODIAN_LABEL%>">
                                                            Custodian:
                                                        </td>
                                                        <td class="ColRow" align="left" id="<%=NewHelpTicketForm.ID_CUSTODIAN%>">
                                                            <bean:write name="<%=NewHelpTicketForm.FORM_NAME%>" property="custodian"/>
                                                        </td>
                                                    </tr>
                                                </table>
                                            </td>
                                            <td>
                                                <img src="/images/icons/general/spacer.gif" width="20" height="1">                        
                                            </td>
                                            <td>
                                                <table id="<%=NewHelpTicketForm.TABLE_BARCODE%>" width="100%">
                                                    <tr>
                                                        <td align="right" class="ColRowBold tdAlignRight" id="<%=NewHelpTicketForm.ID_COPY_BARCODE_LABEL%>">
                                                            Barcode: 
                                                        </td>
                                                        <td align="left" class="ColRow" id="<%=NewHelpTicketForm.ID_COPY_BARCODE%>">
                                                            <%=form.buildAssetItemBarcodeLink(false)%>
                                                        </td>
                                                    </tr>    
                                                    <tr>
                                                        <td class="ColRowBold tdAlignRight" id="<%=NewHelpTicketForm.ID_DISTRICT_ID_LABEL%>">
                                                            District ID: 
                                                        </td>
                                                        <td align="left" class="ColRow" id="<%=NewHelpTicketForm.ID_DISTRICT_ID%>">
                                                            <bean:write name="<%=NewHelpTicketForm.FORM_NAME%>" property="districtID"/>
                                                        </td>
                                                    </tr>    
                                                    <tr>
                                                        <td class="ColRowBold tdAlignRight" id="<%=NewHelpTicketForm.ID_SERIAL_NUMBER_LABEL%>">
                                                            Serial Number:
                                                        </td>
                                                        <td align="left" class="ColRow" id="<%=NewHelpTicketForm.ID_SERIAL_NUMBER%>">
                                                            <bean:write name="<%=NewHelpTicketForm.FORM_NAME%>" property="serialNumber"/>
                                                        </td>
                                                    </tr>    
                                                </table>                    
                                            </td>
                                        </tr>
                                    </table>
                                </div>
                            <%
                                }
                            %>
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
                                            <table id="<%=NewHelpTicketForm.TABLE_PROBLEM%>" width="100%">
                                                <tr>
                                                    <td class="ColRowBold tdAlignRight"colspan="1" id="<%=NewHelpTicketForm.ID_TICKET_NUMBER_LABEL%>">
                                                        Ticket #:
                                                    </td>  
                                                    <td >
                                                        <table id="<%=NewHelpTicketForm.TABLE_TICKET_NUMBER%>">
                                                            <tr>
                                                                <td class="ColRow tdAlignLeft" colspan="1" id="<%=NewHelpTicketForm.ID_TICKET_NUMBER%>"></td>
                                                                <td class="ColRowBold tdAlignRight">
                                                                    <img src="/images/icons/general/spacer.gif" width="40" height="1">
                                                                    Priority:
                                                                </td>
                                                                <td align="left"> 
                                                                    <%=JSPHelper.renderDropDown(NewHelpTicketForm.FIELD_PRIORITY, null, HelpTicketSpecs.lookupHelpTicketPriorities(), new Long(form.getPriorityID()))%>
                                                                </td>
                                                                <td class="ColRowBold tdAlignRight">
                                                                    <img src="/images/icons/general/spacer.gif" width="5" height="1">
                                                                    Status:
                                                                </td>
                                                                <td align="left"> 
                                                                    <%=JSPHelper.renderDropDown(NewHelpTicketForm.FIELD_STATUS, null, HelpTicketSpecs.lookupHelpTicketStatuses(), form.getStatus())%>  
                                                                </td>
                                                            </tr>
                                                        </table>
                                                    </td>
                                                </tr>  
                                                <tr>
                                                     <td class="ColRowBold tdAlignRight" id="<%=NewHelpTicketForm.ID_SUMMARY_LABEL%>">
                                                        *&nbsp;Summary:
                                                    </td>
                                                    <td class="ColRow" colspan="2" align="left" id="<%=NewHelpTicketForm.ID_SUMMARY%>"> 
                                                        <textarea name="<%=NewHelpTicketForm.FIELD_SUMMARY%>" rows="2" cols="50" maxlength="255"><%=form.getSummary()%></textarea>                     
                                                    </td>                               
                                                </tr>
                                                <tr>
                                                    <td class="ColRowBold tdAlignRight" id="<%=NewHelpTicketForm.ID_DETAILS_LABEL%>">
                                                        Details:
                                                    </td>
                                                    <td class="ColRow" align="left" colspan="2" id="<%=NewHelpTicketForm.ID_DETAILS%>">
                                                        <textarea name="<%=NewHelpTicketForm.FIELD_DETAILS%>"rows="2" cols="50" maxlength="1000"><%=form.getDetails()%></textarea>                            
                                                    </td>                                
                                                </tr>
                                                <tr>
                                                    <td class="ColRowBold tdAlignRight" id="<%=NewHelpTicketForm.ID_ASSIGNED_TO_FIRST_LAST_NAME_LABEL%>">
                                                        Assigned to:
                                                    </td>                                
                                                    <td>
                                                        <table id="<%=NewHelpTicketForm.TABLE_ASSIGNED_TO%>" cellspacing="0" border="0" cellpadding="0">
                                                            <tr>
                                                                <td class="ColRow">
                                                                    <html:radio property="<%=NewHelpTicketForm.FIELD_ASSIGNED_TYPE%>" value="<%=NewHelpTicketForm.ASSIGNED_TYPE_SERVICING_TEAM%>">
                                                                        <%
                                                                        if (form.getTitle() == null) {
                                                                        %>
                                                                            Servicing team
                                                                        <%} else if (form.getServicingTeamList() == null || form.getServicingTeamList().size() == 0) {
                                                                    %>
                                                                    Servicing team : No servicing teams defined
                                                                        <%
                                                                        } else {
                                                                    %>
                                                                                Servicing team : <%=JSPHelper.renderDropDown(NewHelpTicketForm.FIELD_ASSIGNED_SERVICING_TEAM_SITE_JOIN_ID,"submitAndChangeToServicingTeam();" 
                                                                                    , form.getServicingTeamList(), form.getAssignedServicingTeamSiteJoinID())%>
                                                                                <%=JSPHelper.renderDropDown(NewHelpTicketForm.FIELD_SERVICING_TEAM_MEMBER_ID, null, form.getServicingTeamMemberList(), form.getServicingTeamMemberID())%>
                                                                        <% } %>  
                                                                    </html:radio>
                                                                    <br>
                                                                    <html:radio property="<%= NewHelpTicketForm.FIELD_ASSIGNED_TYPE %>" value="<%= NewHelpTicketForm.ASSIGNED_TYPE_INDIVIDUAL %>">
                                                                        Individual : 
                                                                        <span id="<%=NewHelpTicketForm.ID_ASSIGNED_TO_FIRST_LAST_NAME%>">
                                                                            <bean:write name="<%= NewHelpTicketForm.FORM_NAME %>" property="displayableAssignedToName" />
                                                                            <font color="#CC0000">
                                                                                <bean:write name="<%= NewHelpTicketForm.FORM_NAME %>" property="displayableAssignedToSiteName" />
                                                                            </font>
                                                                        </span>&nbsp;                            
                                                                        <% if (form.getAssignedPatronID() != null) { %>
                                                                            &nbsp;
                                                                            <base:genericButton name="<%= NewHelpTicketForm.BUTTON_CLEAR %>" src="/buttons/large/clear.gif" alt='<%= MessageHelper.formatMessage("clear") %>' />
                                                                        <% } %>
                                                                        <base:genericButton name="<%= NewHelpTicketForm.BUTTON_SELECT_ASSIGNED %>" src="/buttons/large/selectplus.gif" alt='<%= MessageHelper.formatMessage("select") %>' />
                                                                    </html:radio>
                                                                </td>
                                                                <td>
                                                                &nbsp;
                                                                </td>
                                                            </tr>                                        
                                                        </table>
                                                    </td>                                    
                                                </tr>
                                                <tr>
                                                    <td class="ColRowBold tdAlignRight">
                                                        Expected Completion:
                                                    </td>                                
                                                    <td class="ColRowBold tdAlignleft">
                                                        <base:date 
                                                            buttonName = "<%= NewHelpTicketForm.BUTTON_EXPECTED_COMPLETION %>"
                                                            fieldName = "<%= NewHelpTicketForm.FIELD_COMPLETION_DATE %>"
                                                            dateValue = "<%=form.getCompletionDate()%>"
                                                            altText = "<%=NewHelpTicketForm.ALT_EXPECTED_COMPLETION%>"
                                                         />
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
                                            <table id="<%= NewHelpTicketForm.TABLE_REQUESTOR %>" width="100%">
                                                <tr>
                                                    <td class="ColRowBold tdAlignRight" id="<%= NewHelpTicketForm.ID_REQUESTED_FIRST_LAST_NAME_LABEL %>">
                                                        *&nbsp;Name:
                                                    </td>
                                                    <td>
                                                        <table id="<%= NewHelpTicketForm.TABLE_REQUESTOR_DETAILS %>" cellspacing="0" border="0" cellpadding="0">
                                                            <tr>
                                                                <td class="ColRow tdAlignLeft" id="<%= NewHelpTicketForm.ID_REQUESTED_FIRST_LAST_NAME %>">
                                                                    <% if (StringHelper.isEmpty(form.getFirstLastName())) { %>
                                                                        <img src="/images/icons/general/spacer.gif" width="60" height="1">
                                                                    <% } %>                                                
                                                                    <bean:write name="<%= NewHelpTicketForm.FORM_NAME %>" property="firstLastName"/>
                                                                    <font color="#CC0000">
                                                                        <bean:write name="<%= NewHelpTicketForm.FORM_NAME %>" property="requestedPatronSiteName" />
                                                                    </font>
                                                                    &nbsp;
                                                                </td>                                
                                                                <td align="left">
                                                                    <base:genericButton name="<%= NewHelpTicketForm.BUTTON_SELECT_REQUESTED %>" src="/buttons/large/selectplus.gif" alt='<%= MessageHelper.formatMessage("select") %>' />                                                                    
                                                                </td> 
                                                                <td>
                                                                &nbsp;
                                                                </td>
                                                            </tr>                                        
                                                        </table>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td class="ColRowBold tdAlignRight" id="<%= NewHelpTicketForm.ID_EMAIL_LABEL %>">
                                                        Email:
                                                    </td>
                                                    <td class="ColRow tdAlignLeft" id="<%= NewHelpTicketForm.ID_EMAIL %>">
                                                        <html:text property="email" size="20" maxlength="200"/>
                                                    </td>                                
                                                </tr>
                                                <tr>
                                                    <td class="ColRowBold tdAlignRight" id="<%= NewHelpTicketForm.ID_PHONE_LABEL %>">
                                                        Phone:
                                                    </td>
                                                    <td class="ColRow tdAlignLeft" id="<%= NewHelpTicketForm.ID_PHONE %>">
                                                        <html:text property="phone" size="20" maxlength="30"/>
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
                        <td>
                            <span class="Instruction" style="color: black; font-weight: lighter;"> * = required field </span>
                        </td>
                    </tr>
                </table>
            </td>
            <td>
                <img src="/images/icons/general/spacer.gif" width="20" height="1">
            </td>
            <td valign="top">
                <table id="tableButtons">
                    <tr>
                        <td>
                            <base:saveButton name="<%= NewHelpTicketForm.BUTTON_SAVE %>" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <base:cancelButton name="<%= NewHelpTicketForm.BUTTON_CANCEL %>" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            &nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td>
                        &nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td>
                            &nbsp;
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
