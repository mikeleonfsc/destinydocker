<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.TransferRequestStatus" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    TransferRequestForm form = (TransferRequestForm)request.getAttribute(TransferRequestForm.FORM_NAME);
%>


<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handletransferrequestform.do">


    <%if ( !StringHelper.isEmpty(form.getAction()) ) { %>
        <html:hidden property="action"/>
        <html:hidden property="<%=TransferRequestForm.PARAM_TRANSFER_REQUEST_ID %>"/>
        <base:messageBox showRedBorder="true">
        <tr>
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td valign="baseline" class="Error">
                <p align="center"><%=form.gimmeActionMessage()%></p>
                <div align="center">
                    <base:yesNo/> 
                </div>
            </td>
        </tr>
        </base:messageBox>
    <%} %>
<logic:equal name="<%=TransferRequestForm.FORM_NAME %>" property="printerFriendly" value="false"> 
    <table width="95%">
        <tr>
            <td class="tdAlignRight">
                <a href="/cataloging/servlet/presenttransferrequestform.do?collectionType=1&printerFriendly=true" target="printerfriendly" id="<%=GenericForm.ID_PRINTER_FRIENDLY %>"><base:image 
                    align="absbottom" src="/buttons/small/printerfriendly.gif" alt="Printer Friendly"/>
                </a>
            </td>
        </tr>
    </table>
    <P>&nbsp;
</logic:equal>


    <base:outlinedTableAndTabsWithinThere 
        id="<%=TransferRequestForm.TABLE_MAIN%>" 
        selectedTab="<%=TransferRequestForm.ID_TAB%>" 
        tabs="<%=form.getTabs()%>">
       <tr>
            <td class="TableHeading">Textbook Copy Requests...</td>
            <td class="TableHeading tdAlignRight">&nbsp;
            <base:isNotDistrictUser>
            <logic:equal name="<%=TransferRequestForm.FORM_NAME %>" property="printerFriendly" value="false"> 
            <base:link page="/cataloging/servlet/presentfindtextbookform.do" id="<%=TransferRequestForm.ID_BUTTON_NEW_REQUEST %>"> 
            <base:image src="/buttons/large/newrequest.gif" alt="<%=TransferRequestForm.ALT_NEW_REQUEST%>"/>
            </base:link>
            </logic:equal>
            </base:isNotDistrictUser>
            </td>
       </tr>
       
       <base:isNotDistrictUser>

           <tr>
           <td colspan="2" width="100%">
           <table cellpadding="2" cellspacing= "0" width="100%" id="<%=TransferRequestForm.TABLE_REQUESTS_TO_DISTRICT %>">
           <tr>
           <base:sectionHeading tdContent="colspan='6'"  heading="<%=form.HEADING_REQUESTS_TO_DISTRICT %>" printerFriendly="<%=form.isPrinterFriendly() %>"/>
           </tr>
           <%form.outputSiteTable(out, form.TYPE_OUTGOING_REQUEST); %>
           </table>
           </td>
           </tr>
    
           <tr>
           <td colspan="2" width="100%">
           <table cellpadding="2" cellspacing= "0" width="100%" id="<%=TransferRequestForm.TABLE_REQUESTS_FROM_DISTRICT %>">
           <tr>
           <base:sectionHeading tdContent="colspan='6'" heading="<%=form.HEADING_REQUESTS_FROM_DISTRICT %>" printerFriendly="<%=form.isPrinterFriendly() %>"/>
           </tr>
           <%form.outputSiteTable(out, form.TYPE_INCOMING_REQUEST); %>
           
           </table>
           </td>
           </tr>
           
           <tr>
               <td colspan="2" width="100%">
                   <table cellpadding="2" cellspacing= "0" width="100%" id="<%=TransferRequestForm.TABLE_LEGEND %>">           
                       <tr>
                           <td colspan="2" width="100%">
           
                               <%form.outputLegend(out); %>
                            </td>
                        </tr>
                    </table>
               </td>
           </tr>           
       
       </base:isNotDistrictUser>
       
       <base:isDistrictUser>
           <tr>
           <td colspan="2" width="100%">
           <table cellpadding="2" cellspacing= "0" width="100%" id="<%=TransferRequestForm.TABLE_OPEN_REQUESTS %>">
           <tr>
           <base:sectionHeading tdContent="colspan='6'"  heading="<%=TransferRequestForm.HEADING_OPEN_REQUESTS %>" printerFriendly="<%=form.isPrinterFriendly() %>"/>
           </tr>
           <%form.outputDistrictTable(out, TransferRequestStatus.OPEN); %>
           </table>
           </td>
           </tr>
    
           <tr>
           <td colspan="2" width="100%">
           <table cellpadding="2" cellspacing= "0" width="100%" id="<%=TransferRequestForm.TABLE_PENDING_REQUESTS %>">
           <tr>
           <base:sectionHeading tdContent="colspan='6'" heading="<%=TransferRequestForm.HEADING_PENDING_REQUESTS %>" printerFriendly="<%=form.isPrinterFriendly() %>"/>
           </tr>
           <%form.outputDistrictTable(out, TransferRequestStatus.PENDING); %>
           
           </table>
           </td>
           </tr>
           
           <tr>
           <td colspan="2" width="100%">
           <table cellpadding="2" cellspacing= "0" width="100%" id="<%=TransferRequestForm.TABLE_COMPLETED_REQUESTS %>">
           <tr>
           <base:sectionHeading tdContent="colspan='6'" heading="<%=TransferRequestForm.HEADING_COMPLETED_REQUESTS %>" printerFriendly="<%=form.isPrinterFriendly() %>"/>
           </tr>
           <%form.outputDistrictTable(out, TransferRequestStatus.COMPLETE); %>
           </table>
           </td>
           </tr>
           
           <%form.outputLegend(out); %>

       </base:isDistrictUser>
       
       
       
       <tr>
    </base:outlinedTableAndTabsWithinThere>
</base:form>


