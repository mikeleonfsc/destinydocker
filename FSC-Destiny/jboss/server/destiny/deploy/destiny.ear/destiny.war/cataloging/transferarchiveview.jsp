<%@page language="java" %>
<%@page contentType="text/html; charset=UTF-8" %>
<%@page import="java.util.List"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%>
<%@page import="com.follett.fsc.destiny.util.HTMLFilterHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.data.ReturnTitleVO"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.ReturnsSpecs"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.data.ReturnTitleSearchVO"%>
<%@page import="com.follett.fsc.common.StringHelper" %>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.apache.struts.util.ResponseUtils"%>
<%@page import="com.follett.fsc.destiny.util.lookup.LongLongLookup"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.data.TransferArchiveViewVO"%>
<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@page import="com.follett.fsc.common.MessageHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-format.tld" prefix="fmt" %>

<%
    TransferArchiveViewForm form = (TransferArchiveViewForm)request.getAttribute(TransferArchiveViewForm.FORM_NAME);
    
    boolean haveResults = false;
    SessionStoreProxy store = form.getStore();
    if (form.getTitleList() != null) {
        List<ReturnTitleVO> recList = form.getTitleList();
        haveResults = (recList != null) && (recList.size() > 0);
    }
    boolean deniedReturn = (form.getReturnID() != null && form.getReturnVO().getStatus() == ReturnsSpecs.STATUS_DENIED);
%>


<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handletransferarchiveviewform.do" styleId="keywordList">
<% if (!form.isPrinterFriendly()) { %>
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">
<% } %>
<html:hidden property="<%=TransferArchiveViewForm.PARAM_TRANSFER_ID%>"/>
<html:hidden property="<%=TransferArchiveViewForm.PARAM_RETURN_ID%>"/>


<logic:equal name="<%=TransferArchiveViewForm.FORM_NAME %>" property="<%= GenericForm.PRINTER_FRIENDLY_PARAM %>" value="false"> 
    <table width="95%">
        <tr>
            <td class="tdAlignRight">
                <base:link href='<%="/cataloging/servlet/handletransferarchiveviewform.do?" + GenericForm.BUTTON_PRINTER_FRIENDLY + "=true&" + TransferArchiveViewForm.PARAM_RETURN_ID + "=" + form.getReturnID() + "&" + TransferArchiveViewForm.PARAM_TRANSFER_ID + "=" + form.getTransferID()%>' target="printerFriendly" id="<%=GenericForm.ID_PRINTER_FRIENDLY %>">
                    <base:image src="/buttons/small/printerfriendly.gif" alt="Printer Friendly" />
                </base:link>&nbsp;
            </td>
        </tr>
    </table>
</logic:equal>

<%
String bgColor = "#FFFFFF";
if(!form.isPrinterFriendly()) {
    bgColor = FlipperTag.ROW_GRAY;
}
%>

<base:outlinedTable id="<%=TransferArchiveViewForm.TABLE_MAIN%>" borderColor="<%=bgColor %>">
   <tr>
        <td class="TableHeading" valign="top">
            <% if (form.getTransferID() != null) { %>
                Completed Transfer <%= ResponseUtils.filter(form.getTransferVO().getFromOrTo()) %>
            <% } else if (form.getReturnID() != null) { %>
                <% if(form.getReturnVO().getStatus() == ReturnsSpecs.STATUS_DENIED) { %>
                Denied Return
                <% } else { %>
                Completed Return
                <% }  %>
                <% if (store.isStateContext()) { %>
                    for <%=ResponseUtils.filter(form.getReturnVO().getDistrictName()) %> - <%= ResponseUtils.filter(form.getReturnVO().getSiteNameFull()) %>
                <% } %>
            <% } %>
        </td>
        <td class="tdAlignRight" valign="top">
            <% if (!form.isPrinterFriendly()) { %>
                <base:closeButton withX="false"/>
            <% } else  { %>
                &nbsp; 
            <% } %>
        </td>
    </tr>
    <tr>
        <td class="ColRow" valign="top" colspan="2">
            <% if (form.getTransferID() != null) { %>
                <% if(!StringHelper.isEmptyOrWhitespace(form.getTransferVO().getOrderNumber())) { %>
                    <b>Order Number:</b>&nbsp;<%=form.getTransferVO().getOrderNumber() %>
                <% } %>
            <% } else if (form.checkReturnHasRma()) { %>
                    <b>RMA:</b>&nbsp;<%=form.getReturnVO().getRma() %>
            <% } else { %>
                &nbsp;
            <% } %>
        </td>
    </tr>
<logic:equal name="<%=TransferArchiveViewForm.FORM_NAME %>" property="<%= GenericForm.PRINTER_FRIENDLY_PARAM %>" value="false">
    <%=form.getViewNoteLinkText() %>
</logic:equal>    


<% if (form.getReturnID() != null) { %>
    <tr>
        <td class="TableHeading" colspan="2">
            <IMG height="1" vspace="1" src="/images/icons/general/line.gif" width="100%">
        </td>
    </tr>
    
    <tr>
        <td colspan="2">
            <table id="<%=TransferArchiveViewForm.TABLE_RETURN_FIELDS %>" width="100%">
                <tr valign="top">
                    <td class="ColRowBold tdAlignRight" nowrap>
                         Name
                    </td>
                    <td class="ColRow">
                        <%=JSPHelper.filterHtmlAndNulls(form.getReturnVO().getName()) %>
                    </td>
                </tr>
                <tr valign="top">

                    <td class="ColRowBold tdAlignRight" nowrap>
                         Phone Number
                    </td>
                    <td class="ColRow">
                        <%=JSPHelper.filterHtmlAndNulls(form.getReturnVO().getPhoneNumber()) %>    
                    </td>
                </tr>
                <tr valign="top">
                    <td class="ColRowBold tdAlignRight" nowrap>
                         Fax
                    </td>
                    <td class="ColRow">
                        <%=JSPHelper.filterHtmlAndNulls(form.getReturnVO().getFaxNumber()) %>    
                    </td>
                </tr>
                <tr valign="top">
                    <td class="ColRowBold tdAlignRight" nowrap>
                        Email
                    </td>
                    <td class="ColRow">
                        <%=JSPHelper.filterHtmlAndNulls(form.getReturnVO().getEmail()) %>    
                    </td>
                </tr>
                <tr valign="top">
                    <td class="ColRowBold tdAlignRight" nowrap>
                         Reason for Return
                    </td>
                    <td class="ColRow">
                        <%=JSPHelper.filterHtmlAndNulls(form.getReturnVO().getReasonForReturn()) %>    
                    </td>
                </tr>
            <% if (form.getReturnVO().getStatus() != ReturnsSpecs.STATUS_DENIED) { %>
                <tr valign="top">
                    <td class="ColRowBold tdAlignRight" nowrap>
                         # Boxes Expected
                    </td>
                    <td class="ColRow">
                        <%=form.getReturnVO().getNumberOfBoxes() == null ? "" : form.getReturnVO().getNumberOfBoxes().toString() %>    
                    </td>
                </tr>
                <tr valign="top">
                    <td class="ColRowBold tdAlignRight" nowrap>
                         # Boxes Received
                    </td>
                    <td class="ColRow">
                        <%=form.getReturnVO().getNumberOfBoxesReceived() == null ? "" : form.getReturnVO().getNumberOfBoxesReceived().toString() %>    
                    </td>
                </tr>
                <tr valign="top">
                    <td class="ColRowBold tdAlignRight" nowrap>
                         Freight Carrier
                    </td>
                    <td class="ColRow">
                        <%=JSPHelper.filterHtmlAndNulls(form.getReturnVO().getCarrierName()) %>    
                    </td>
                </tr>
                <tr>
                     <td class="ColRowBold tdAlignRight">
                        Copies Sent
                     </td>
                     <td class="ColRow">
                        <%=form.getReturnVO().getTotalNumberOfCopies() %>
                     </td>
                 </tr>
                <tr>
                     <td class="ColRowBold tdAlignRight">
                        Copies Received
                     </td>
                     <td class="ColRow">
                        <%=form.getReturnVO().getTotalNumberOfCopiesReceived() %>
                     </td>
                 </tr>
                <% } %>
            </table>
        </td>
    </tr>

<% } %>



    <tr>
        <td class="TableHeading" colspan="2">
            <IMG height="1" vspace="1" src="/images/icons/general/line.gif" width="100%">
        </td>
    </tr>
    <tr>
        <td colspan = "2">
            <table width = "100%" border = "0"  cellpadding="4" cellspacing="0" id = "<%= TransferArchiveViewForm.TABLE_SEARCH_RESULTS %>">
                <% if (!haveResults) { %>
                <tr>
                    <td class="ColRow">
                        No matches found.
                    </td>
                </tr>
                <% } else { %>
                <tr>
                    <td class='SmallColHeading'>&nbsp;</td>
                    <td class='SmallColHeading'>&nbsp;</td>
                    <td class='SmallColHeading'>&nbsp;</td>
                    <% if(!deniedReturn) { %>
                        <td class='SmallColHeading' align="center" valign="bottom" colspan="3" nowrap>-- Received --</td>
                        <td>&nbsp;</td>
                    <% } %>
                </tr>
                <tr>
                    <td class='SmallColHeading'>Title</td>
                    <td class='SmallColHeading'>ISBN<br/>Edition</td>
                    <td class='SmallColHeading'>State&nbsp;/&nbsp;Textbook&nbsp;ID<br/>Publisher</td>
                    <% if(!deniedReturn) { %>
                        <td class='SmallColHeading' align="center">Copies<br/>Sent</td>
                        <td class='SmallColHeading' align="center">With<br/>Barcodes</td>
                        <td class='SmallColHeading' align="center">Without<br/>Barcodes</td>
                        <td>&nbsp;</td>
                    <% } %>
                </tr>
                <%
                Iterator<ReturnTitleVO> iter = form.getTitleList().iterator();
                int counter = 0;
                int totalAvailable = 0;
                int totalBarcoded = 0;
                int totalBarcodedReceived = 0;
                long totalUnbarcoded = 0;
                long totalUnBarcodedReceived = 0;
                while (iter.hasNext()) {
                    ReturnTitleVO rec = iter.next();
                    totalAvailable += rec.getCopiesAvailable();
                    totalBarcoded += rec.getCopiesWithBarcode();
                    totalBarcodedReceived += rec.getCopiesWithBarcodeReceived();
                    totalUnbarcoded += rec.getCopiesWithoutBarcode() == null ? 0 : rec.getCopiesWithoutBarcode().longValue();
                    totalUnBarcodedReceived += rec.getCopiesWithoutBarcodeReceived() == null ? 0 : rec.getCopiesWithoutBarcodeReceived().longValue();
                    if (counter % 2 == 0) {
                %>
                    <tr bgcolor="<%= FlipperTag.ROW_GRAY %>" width="100%">
                <% } else { %> 
                    <tr width="100%">
                <% } %>
                    <td class = "ColRow" valign="top">
                        <% if (form.isPrinterFriendly() || rec.isArchived()) { %>
                            <%=JSPHelper.filterHtmlAndNulls(rec.getTitle()) %>
                        <% } else { %>
                            <a href="/cataloging/servlet/presenttextbookdetailform.do?bibID=<%=rec.getBibID() %>">
                                <%=JSPHelper.filterHtmlAndNulls(rec.getTitle()) %>
                            </a>
                        <% } %>
                    </td>
                    <td class = "ColRow"><%=JSPHelper.filterHtmlAndNulls(rec.getDisplayableIsbnStrippedOfPrefix()) %><br/><%=JSPHelper.filterHtmlAndNulls(rec.getEdition()) %></td>
                    <td class = "ColRow"><%=JSPHelper.filterHtmlAndNulls(rec.getStateTextbookID())%>
                    <br/><%=JSPHelper.filterHtmlAndNulls(rec.getPublisher()) %></td>
                    <% if(!deniedReturn) { %>
                        
                        <td class = "ColRow" align="center" valign="top"><%=rec.getCopiesAvailable() %></td>
                        <td class = "ColRow" align="center" valign="top">
                            <% if  (rec.getCopiesWithBarcode() != rec.getCopiesWithBarcodeReceived()) { %>
                                <font color="#CC0000"><%=""+rec.getCopiesWithBarcodeReceived() %>/<%=""+rec.getCopiesWithBarcode() %></font>
                            <% }  else {%>
                                <%=""+rec.getCopiesWithBarcodeReceived() %>/<%=""+rec.getCopiesWithBarcode() %>
                            <% } %>
                        </td>
                        <td class = "ColRow" align="center" valign="top">
                            <%
                                int copiesWithoutBarcode = rec.getCopiesWithoutBarcode() == null ? 0 : rec.getCopiesWithoutBarcode().intValue();
                                int copiesWithoutBarcodeReceived = rec.getCopiesWithoutBarcodeReceived() == null ? 0 : rec.getCopiesWithoutBarcodeReceived().intValue();
                                if  (copiesWithoutBarcode != copiesWithoutBarcodeReceived) { %>
                                <font color="#CC0000"><%=""+copiesWithoutBarcodeReceived %>/<%=""+copiesWithoutBarcode %></font>
                            <% }  else {%>
                                <%=""+copiesWithoutBarcodeReceived %>/<%=""+copiesWithoutBarcode %>
                            <% } %>
                        </td>
                        <td align="center" valign="top">
                            <% if ((rec.getCopiesWithBarcode() > 0 || form.getTransferID() != null || store.isStateContext()) && !form.isPrinterFriendly()) { %>
                            <base:genericButton src="/buttons/small/viewsmall.gif" absbottom="true" alt="<%= TransferArchiveViewForm.ALT_VIEW %>" name='<%= TransferArchiveViewForm.BUTTON_VIEW_PREFIX + rec.getBibID() %>'/>
                            <% } else { %>
                                &nbsp;
                            <% } %>
                        </td>
                    <% } %>
                </tr>    
                <% counter++;
                    } %> 
                <% if(!deniedReturn) { %>
                <tr>
                    <td colspan="2">&nbsp;</td>
                    <td class="ColRowBold">Total</td>
                    <td class="ColRowBold" align="center"><%= String.valueOf(totalAvailable) %></td>    
                    <td class="ColRowBold" align="center"><%= String.valueOf(totalBarcodedReceived) %>/<%=String.valueOf(totalBarcoded) %></td>    
                    <td class="ColRowBold" align="center"><%= String.valueOf(totalUnBarcodedReceived) %>/<%= String.valueOf(totalUnbarcoded) %></td>
                </tr>    
                <% } %> 
            <% } %> 
            </table>
        </td>
    </tr>
</base:outlinedTable>

</base:form>


