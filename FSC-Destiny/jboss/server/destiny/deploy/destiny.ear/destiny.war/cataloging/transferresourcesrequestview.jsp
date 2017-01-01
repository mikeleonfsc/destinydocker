<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.cataloging.ejb.data.TransferRequestClientVO" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.common.LocaleHelper" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.jsptag.TransferRequestNotesTag" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.TransferRequestStatus" %>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>

<%
    TransferResourcesRequestViewForm form = (TransferResourcesRequestViewForm)request.getAttribute(TransferResourcesRequestViewForm.FORM_NAME);
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    boolean dataOutputted = false;
%>


<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handletransferresourcesrequestviewform.do" focus="<%=form.getFocus()%>">
<logic:equal name="<%=TransferResourcesRequestViewForm.FORM_NAME %>" property="<%=TransferResourcesRequestViewForm.PARM_CONFIRM %>" value="true"> 
        <%
            String message = "";       
            if ( TransferResourcesRequestViewForm.CONFIRM_SEND.equals(form.getConfirmAction()) ) {
                message = form.getConfirmationMessageForSend();
                
            } else if ( TransferResourcesRequestViewForm.CONFIRM_COMPLETE.equals(form.getConfirmAction()) ) {
                message = "Are you sure you want to complete this request?";
            }
        %>
        <br>
        <table align="center" width="90%">
            <tr>
                <td align="center" width="60%">                    
                    <base:messageBox showRedBorder="true">                
                        <tr>
                            <td class="tdAlignRight" valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%>&nbsp;</td>
                            <td class="tdAlignLeft Error" valign="top">
                                    <%=message %>
                                   <br><br>
                                   Note <html:textarea property='<%= TransferResourcesRequestViewForm.FIELD_NOTE %>' rows="2" cols="50"/>
                            </td>
                            <td class="tdAlignRight" valign="top">
                                <base:imageSpacer width="16" height="16"/>                                
                                &nbsp;&nbsp;&nbsp;&nbsp;
                            </td>                                        
                        </tr>
                        <tr>
                            <td>
                                &nbsp;
                            </td>                            
                            <td valign="baseline" align="center" class="ColRow" colspan="2">
                                <base:yesNo/>
                            </td> 
                        </tr>                           
                    </base:messageBox>
                </td>
            </tr>
        </table>
</logic:equal>

<html:hidden property="<%=TransferResourcesRequestViewForm.PARM_CONFIRM_ACTION %>" />
<html:hidden property="<%=TransferResourcesRequestViewForm.PARAM_TRANSFER_REQUEST_ID %>" />
<html:hidden property="<%=TransferResourcesRequestViewForm.PARAM_COLLECTION_TYPE %>" />
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=TransferResourcesRequestViewForm.BUTTON_TRAP_ENTER_KEY%>">

<table width="100%">
<tr><td class="tdAlignRight">
    <% if (!form.isPrinterFriendly() ) {%>
        <base:link page="<%=form.getPrinterFriendlyPage()%>" target="printerFriendly" id="<%=TransferResourcesRequestViewForm.ID_PRINTER_FRIENDLY %>">
            <base:image src="/buttons/small/printerfriendly.gif" alt="Printer Friendly"/>
        </base:link>
    <%} %>
</td></tr></table>

<base:outlinedTable borderColor="#C0C0C0" 
    id='<%= TransferResourcesRequestViewForm.TABLE_ADD_TRANSFER_REQUEST %>'>       
<tr>
<td>
<table width="100%" id='<%= TransferResourcesRequestViewForm.TABLE_MAIN %>'>
            
    <tr>
        <td valign="top">
        <table id='<%= TransferResourcesRequestViewForm.TABLE_BIB_INFO %>'>
        <tr>
            <td class="TableHeading" colspan="2">
                <% if (form.isTextbookAsset()) { %>
                    <base:bibTypeIcon rec="<%=form.getMaterialType()%>" printerFriendly="<%= form.isPrinterFriendly() %>"  > 
                    </base:bibTypeIcon>
                <%} %>
                <bean:write name="<%=TransferResourcesRequestViewForm.FORM_NAME %>" property="<%= TransferResourcesRequestViewForm.PARM_BIB_TITLE%>"/>
            </td>
         </tr>
         <% if (form.getBibIsbn() != null) { %>
         <tr>
            <td class="ColRow" colspan="2" >
                <base:imageSpacer width="20" height="1"/><bean:write filter="false" name="<%=TransferResourcesRequestViewForm.FORM_NAME %>" property="<%= TransferResourcesRequestViewForm.PARM_BIB_ISBN%>"/>
            </td>
         </tr>
         <%} %>
         <tr>
            <td class="ColRowBold" colspan="2" >
                <base:imageSpacer width="20" height="1" printerFriendly="<%=form.isPrinterFriendly()%>"/><bean:write name="<%=TransferResourcesRequestViewForm.FORM_NAME %>" property="<%= TransferResourcesRequestViewForm.PARM_NUMBER_NEEDED%>"/>
                <% if (form.getOriginalRequestNote() != null || (form.getNoteResponses() != null && !form.getNoteResponses().isEmpty()) ) { %>
                    <logic:equal name="<%=TransferResourcesRequestViewForm.FORM_NAME %>" property="<%=TransferResourcesRequestViewForm.PARM_PRINTER_FRIENDLY %>" value="false"> 
                        <a href='<%= "#" + TransferRequestNotesTag.NOTES_ANCHOR %>'>
                            <base:image src="/icons/general/notetransfer.gif"  alt="<%=TransferResourcesRequestViewForm.ALT_TEXT_VIEW_NOTE%>" />
                        </a>
                    </logic:equal>
                <% } %>
            </td>
         </tr>
        </table>
        </td>
        <td valign="top" class="tdAlignRight">
            <table>
                <tr>        
                    <logic:equal name="<%=TransferResourcesRequestViewForm.FORM_NAME %>" property="<%=TransferResourcesRequestViewForm.PARM_PRINTER_FRIENDLY %>" value="false"> 
                        <td class="tdAlignRight" valign="top">  
                            <base:closeButton withX="true"/>
                        </td>
                    </logic:equal>
                </tr>
                <tr>        
                    <td class="tdAlignRight">
                    <% if( !form.isPrinterFriendly() && form.isDistrictUser() && !TransferRequestStatus.COMPLETE.equals(form.getTransferRequestStatus()) )  { %>
                                <base:genericButton
                                    src="/buttons/large/completed.gif" alt="<%= TransferResourcesRequestViewForm.ALT_COMPLETED%>"
                                    name="<%= TransferResourcesRequestViewForm.BUTTON_COMPLETED %>" />
                    <% } %>
                    </td>
                </tr>
             </table>
        </td>             
    </tr>
    <tr>
        <td colspan="2">
            <base:imageLine/>
        </td>
    </tr>

    <!-- OUTSTANDING REQUESTS -->
    <%if ( !form.getOutstandingRequests().isEmpty() ) {%>
        <tr>
        <td colspan="2" width="100%">
        <table  cellpadding="3" cellspacing="0" width="100%" id="<%=TransferResourcesRequestViewForm.TABLE_OUTSTANDING_REQUESTS %>">
            <tr>
            <td class="ColRowBold" colspan="3">
            Outstanding item requests: <%=form.getOutstandingCopyCount() %>
            </td>
            </tr>
            <tr>
                <td class="SmallColHeading">Site</td>
                <td class="SmallColHeading tdAlignRight"># of items</td>
                <td class="SmallColHeading">&nbsp;</td>
            </tr>
            <logic:iterate id="vo" name="<%=TransferResourcesRequestViewForm.FORM_NAME%>"
                property="<%=TransferResourcesRequestViewForm.PARM_OUTSTANDING_REQUESTS %>"
                type="TransferRequestClientVO">
                <%dataOutputted = true; %>
                <base:flipper key="outstanding">
                    <td class="ColRow">
                    <%=ResponseUtils.filter(vo.getSupplierSiteName()) %>                
                    &nbsp;(<%=lh.formatDate(vo.getSupplierDate()) %>)
                    </td>
                    <td class="ColRow tdAlignRight">
                    <%=lh.formatNumber(vo.getCopiesRequestedFromSite().longValue())%>
                    </td>
                    <td class="ColRow">&nbsp;
                    </td>
                </base:flipper>
            </logic:iterate>
        </table>
        </td>
        </tr>
    <% } %>
    
    
    
    
    <!-- COMPLETED REQUESTS -->
    <%if ( !form.getCompletedRequests().isEmpty() ) {%>
        <%if ( dataOutputted ) {%>
            <tr>
                <td colspan="2">
                    <base:imageLine/>
                </td>
            </tr>
        <% }%> 


        <tr>
        <td colspan="2" width="100%">
        <table cellpadding="3" cellspacing="0" width="100%" id="<%=TransferResourcesRequestViewForm.TABLE_COMPLETED_REQUESTS %>">
            <tr>
            <td class="ColRowBold" colspan="3">
            Completed Requests (Items sent: <%=form.getCompletedCopyCount() %>)
            </td>
            </tr>
            <tr>
                <td class="SmallColHeading">Site</td>
                <td class="SmallColHeading tdAlignRight">Items Sent</td>
                <td class="SmallColHeading">&nbsp;</td>
            </tr>
            <logic:iterate id="vo" name="<%=TransferResourcesRequestViewForm.FORM_NAME%>"
                property="<%=TransferResourcesRequestViewForm.PARM_COMPLETED_REQUESTS %>"
                type="TransferRequestClientVO">
                <%dataOutputted = true; %>
                <base:flipper key="completed">
                    <td class="ColRow">
                    <%=ResponseUtils.filter(vo.getSupplierSiteName()) %>                
                    &nbsp;(<%=lh.formatDate(vo.getSupplierDate()) %>)
                    </td>
                    <td class="ColRow tdAlignRight">
                    <%=lh.formatNumber(vo.getCopiesPromisedFromSite().longValue())%>
                    </td>
                    <td class="ColRow">
                        <%  if  (form.isNoteInResponseList(vo.getSupplierSiteID()) && !form.isPrinterFriendly()) { %>
                            <a href='<%= "#" + TransferRequestNotesTag.NOTES_SITE_ANCHOR + vo.getSupplierSiteID() %>' > 
                            <base:image src="/icons/general/notetransfer.gif"  alt="<%=ViewIncomingTransferRequestForm.ALT_TEXT_VIEW_NOTE%>" />
                             </a>
                        <% } %>
                    </td>
                </base:flipper>
            </logic:iterate>
        </table>
        </td>
        </tr>
    
    <% }%> 
    
    <!-- AVAILABLE SITES -->
    <base:isDistrictUser>
    <%if ( !TransferRequestStatus.COMPLETE.equals(form.getTransferRequestStatus()) && !form.getAvailableSites().isEmpty() ) { %>

        <%if ( dataOutputted) {%>
        <tr>
            <td colspan="2">
                <base:imageLine/>
            </td>
        </tr>
        <% } %>


        <tr>
        <td colspan="2" width="100%">
        <table cellpadding="3" cellspacing="0" width="100%" id="<%=TransferResourcesRequestViewForm.TABLE_AVAILABLE_SITES %>">
            <tr>
                <td class="ColRowBold" colspan="2">
                Available Items
                </td>
                <td class="ColRow tdAlignRight">
                    <logic:equal name="<%=TransferResourcesRequestViewForm.FORM_NAME %>" property="<%=TransferResourcesRequestViewForm.PARM_PRINTER_FRIENDLY %>" value="false"> 
                        <base:genericButton absbottom="true" src="/buttons/large/send.gif"
                            alt="<%=TransferResourcesRequestViewForm.ALT_TEXT_SEND%>"
                            name="<%=TransferResourcesRequestViewForm.BUTTON_SEND%>"/>
                    </logic:equal>
                </td>
            </tr>
            <tr>
                <td class="Instruction" colspan="3">Send requests to one or more sites to fulfill the need at <%= form.getOriginalRequestingSiteName()%>.</td>
            <tr>
                <td class="SmallColHeading">Sites with items</td>
                <td class="SmallColHeading">Available items</td>
                <td class="SmallColHeading" align="center">Request</td>
            </tr>
            <logic:iterate id="vo" name="<%=TransferResourcesRequestViewForm.FORM_NAME%>"
                property="<%=TransferResourcesRequestViewForm.PARM_AVAILABLE_SITES %>"
                type="TransferRequestClientVO">
                <base:flipper key="availableSites">
                    <td class="ColRow">
                    <%= ResponseUtils.filter(vo.getSupplierSiteName()) %>
                    </td>
                    <td class="ColRow">
                        <%= form.getCopyAvailability(vo) %>
                    </td>
                    <td class="ColRow" align="center">
                        <logic:equal name="<%=TransferResourcesRequestViewForm.FORM_NAME %>" property="<%=TransferResourcesRequestViewForm.PARM_PRINTER_FRIENDLY %>" value="false"> 
                           <input type="text" name="<%= TransferResourcesRequestViewForm.FIELD_COPIES_PREFIX + vo.getSupplierSiteID() %>"
                                size="3" maxlength="4" value="<%= form.getRequestedValue(vo.getSupplierSiteID())%>"/> 
                        </logic:equal>
                        <logic:equal name="<%=TransferResourcesRequestViewForm.FORM_NAME %>" property="<%=TransferResourcesRequestViewForm.PARM_PRINTER_FRIENDLY %>" value="true">
                            <%= form.getRequestedValue(vo.getSupplierSiteID())%>
                        </logic:equal> 
                    </td>
                </base:flipper>
            </logic:iterate>
        </table>
        </td>
        </tr>
   
    <% } else { 
            if ( TransferRequestStatus.OPEN.equals(form.getTransferRequestStatus()) ) {
    %>     
                <tr>
                    <td align="center" colspan="2" class="ColRowBold">
                        <br>
                        There are no sites with requestable items.
                        <br>
                    </td>
                </tr>
        <%  }
       }%>
    </base:isDistrictUser>
    
    
    <tr>
        <td colspan="2">
            <base:transferRequestNotes  originalRequest="<%=form.getOriginalRequestNote()%>" responses="<%=form.getNoteResponses()%>"  printerFriendly="<%= form.isPrinterFriendly() %>"/>
        </td>
    </tr>

    <tr>
        <logic:equal name="<%=TransferResourcesRequestViewForm.FORM_NAME %>" property="<%=TransferResourcesRequestViewForm.PARM_PRINTER_FRIENDLY %>" value="false">
            <td  colspan="2" class="SmallColRow tdAlignRight" vAlign="bottom">
                <a class="DetailLink" href="#TheTop">Top</a>
            </td>
        </logic:equal>
    </tr>
</table></td></tr>
</base:outlinedTable>
</base:form>
