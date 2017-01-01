<%@page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.jsptag.TransferRequestNotesTag" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.TransferRequestStatus" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="com.follett.fsc.common.LocaleHelper"%>
<script language="JavaScript">
<%
    ViewIncomingTransferResourcesRequestForm form = (ViewIncomingTransferResourcesRequestForm)request.getAttribute(ViewIncomingTransferResourcesRequestForm.FORM_NAME);
    String focus = "";
    if ( TransferRequestStatus.OPEN.equals(form.getSupplierStatus()) ) {
        focus = ViewIncomingTransferResourcesRequestForm.FIELD_COPY_COUNT;
    }
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>


<!--
    function trapEnter(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        document.<%=ViewIncomingTransferResourcesRequestForm.FORM_NAME%>.<%=ViewIncomingTransferResourcesRequestForm.FIELD_TRAP_ENTER_PRESSED%>.value=true;
      }
      return true;
    }
//-->
</script>

<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handleviewincomingtransferresourcesrequestform.do" focus="<%=focus%>">
<% if (!form.isPrinterFriendly()) { %>
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">
<% } %>

<html:hidden property="<%=ViewIncomingTransferResourcesRequestForm.FIELD_TRAP_ENTER_PRESSED %>" value="false"/>
<html:hidden property="<%=ViewIncomingTransferResourcesRequestForm.PARAM_TRANSFER_REQUEST_ID %>" />
<html:hidden property="<%=ViewIncomingTransferResourcesRequestForm.PARAM_BIB_TITLE %>" />
<html:hidden property="<%=ViewIncomingTransferResourcesRequestForm.PARAM_BIB_ISBN %>" />
<html:hidden property="<%=ViewIncomingTransferResourcesRequestForm.PARAM_NEEDED_BY %>" />
<html:hidden property="<%=ViewIncomingTransferResourcesRequestForm.PARAM_COPIES_REQUESTED %>" />
<html:hidden property="<%=ViewIncomingTransferResourcesRequestForm.PARAM_REQUESTING_SITE_NAME %>" />
<html:hidden property="<%=ViewIncomingTransferResourcesRequestForm.PARAM_COPIES_OWNED_AT_SITE %>" />
<html:hidden property="<%=ViewIncomingTransferResourcesRequestForm.PARAM_SUPPLIER_STATUS_AS_LONG %>" />
<html:hidden property="<%=ViewIncomingTransferResourcesRequestForm.PARAM_COLLECTION_TYPE %>" />

<table width="100%">
<tr><td class="tdAlignRight">
    <% if ( !TransferRequestStatus.OPEN.equals(form.getSupplierStatus()) && !form.isPrinterFriendly()) {%>
        <base:link page="<%=form.getPrinterFriendlyPage()%>" target="printerFriendly" id="<%=ViewIncomingTransferResourcesRequestForm.ID_PRINTER_FRIENDLY %>">
            <base:image src="/buttons/small/printerfriendly.gif" alt="Printer Friendly"/>
        </base:link>
    <%} %>
</td></tr></table>

<base:outlinedTable borderColor="#C0C0C0" 
    id='<%= ViewIncomingTransferResourcesRequestForm.TABLE_ADD_TRANSFER_REQUEST %>'>       
<tr>
<td>
<table width="100%" id='<%= ViewIncomingTransferResourcesRequestForm.TABLE_MAIN %>'>
            
    <tr>
        <td class="TableHeading"  valign="top">
        <table id='<%= ViewIncomingTransferResourcesRequestForm.TABLE_BIB_INFO %>'>
        <tr>
            <td class="TableHeading">
               <% if(form.isTextbookAsset()) { %>
                    <base:bibTypeIcon rec="<%=form.getMaterialType()%>"  printerFriendly="<%= form.isPrinterFriendly() %>"  >  > 
                    </base:bibTypeIcon>
                <%} %>
            </td>
            <td class="TableHeading"> 
                <bean:write name="<%=ViewIncomingTransferResourcesRequestForm.FORM_NAME %>" property="<%=ViewIncomingTransferResourcesRequestForm.PARAM_BIB_TITLE%>"/>
            </td>
         </tr>
         <tr>
            <td class="ColRow" colspan="2" >
                <bean:write filter="false" name="<%=ViewIncomingTransferResourcesRequestForm.FORM_NAME %>" property="<%=ViewIncomingTransferResourcesRequestForm.PARAM_BIB_ISBN%>"/>
            </td>
         </tr>
        </table>
        </td>
    <% if( !form.isPrinterFriendly() ) { %>
            <td class="tdAlignRight" valign="top">  
                <base:closeButton withX="true"/>
            </td>
     <%} %>
    </tr>
        <tr>
            <td colspan="2">
                <base:imageLine/>
            </td>
        </tr>
    
    <% if ( TransferRequestStatus.COMPLETE.equals(form.getRequestStatus()) ) { %>
        <tr>
            <td class="MediumColHeading">
            &nbsp;</td>
        </tr>
        <tr>
            <td class="MediumColHeading" align="center" colspan="2">
            <%= MessageHelper.formatMessage("viewincomingtransferrequest_RequestMarkedCompletedBy", form.getRequestedUserName(), UserContext.getMyContextLocaleHelper().formatDate(form.getSupplierDate())) %>
            </td>
        </tr>
        <tr>
            <td class="MediumColHeading">
            &nbsp;</td>
        </tr>
   <% } else if ( TransferRequestStatus.COMPLETE.equals(form.getSupplierStatus()) ) { %>
                <tr>
                    <td class="MediumColHeading">
                    &nbsp;</td>
                </tr>
                <tr>
                    <td class="MediumColHeading" align="center" colspan="2">
                   <%= MessageHelper.formatMessage("viewincomingtransferresourcesrequest_ItemsSentTo", form.getRequestingSiteName(), form.getCopiesPromisedFromSite()) %>
                    </td>
                </tr>
                 <tr>
                    <td class="MediumColHeading">
                    &nbsp;</td>
                    </tr>

    <% } 
    
    if ( TransferRequestStatus.OPEN.equals(form.getSupplierStatus()) ) {  %>

        <tr>
            <td class="ColRowBold" colspan="2">
            <%= MessageHelper.formatMessage("viewincomingtransferresourcesrequest_ItemsNeededByPlaceByDate", form.getRequestingSiteName(), form.getNeededBy(), form.getCopiesRequestedFromSite()) %>
            
                <% if (form.getOriginalRequestNote() != null && form.getOriginalRequestNote().getNote() != null){ %>
                        <a href='<%= "#" + TransferRequestNotesTag.NOTES_ANCHOR %>' > 
                        <base:image src="/icons/general/notetransfer.gif"  alt="<%=ViewIncomingTransferResourcesRequestForm.ALT_TEXT_VIEW_NOTE%>" />
                         </a>
                <% }  %>
            </td>
        </tr>
 
        <tr>
            <td valign="top">
                <table id="<%=ViewIncomingTransferResourcesRequestForm.TABLE_DATA%>">
                <tr>
                    <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("viewincomingtransferrequest_IWillSend") %></td>
                    <td class="ColRow">
                        <span onKeyPress="return trapEnter(event);">
                            <html:text property='<%= ViewIncomingTransferResourcesRequestForm.FIELD_COPY_COUNT %>' size="8" maxlength="4"/>
                        </span>
                        &nbsp;&nbsp;&nbsp;
                        <base:genericButton absbottom="true" src="/buttons/large/send.gif"
                            alt="<%=ViewIncomingTransferResourcesRequestForm.ALT_TEXT_SEND%>"
                            name="<%=ViewIncomingTransferResourcesRequestForm.BUTTON_SEND%>"/>
                    </td>
                </tr>
                <tr>
                    <td>
                    </td>
                    <td class="Instruction" ><%= MessageHelper.formatMessage("viewincomingtransferrequest_IfUnableToSendTheNumberRequestedPleaseIndicateThe") %></td>
                </tr>
                <tr>    
                    <td valign="top" class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("viewincomingtransferrequest_Note") %></td>        
                    <td valign="top">
                        <html:textarea property='<%= ViewIncomingTransferResourcesRequestForm.FIELD_NOTE %>' rows="10" cols="50"/>
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

        <tr>
            <td class="Instruction" colspan="2"><%= MessageHelper.formatMessage("viewincomingtransferrequest_RequiredField") %></td>
        </tr>
    <% } %>
    <tr>
        <td colspan="2">
            <base:transferRequestNotes  originalRequest="<%=form.getOriginalRequestNote()%>" responses="<%=form.getNoteResponses()%>" printerFriendly="<%=form.isPrinterFriendly()%>"/>
        </td>
    </tr>
    <% if(! form.isPrinterFriendly() ) { %>
    <tr>
        <td  colspan="2" class="SmallColRow tdAlignRight" vAlign="bottom">
            <a class="DetailLink" href="#TheTop"><%= MessageHelper.formatMessage("viewincomingtransferrequest_Top") %></a>
        </td>
    </tr>
    <% } %>
</table></td></tr>
</base:outlinedTable>
</base:form>
