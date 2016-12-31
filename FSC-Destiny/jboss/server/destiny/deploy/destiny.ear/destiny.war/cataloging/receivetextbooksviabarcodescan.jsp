<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.ReturnsSpecs"%>
<%@ page import="com.follett.fsc.destiny.util.marc.BibType"%>
<%@ page import="com.follett.fsc.common.StringHelper"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%
    ReceiveTextbooksViaBarcodeScanForm form = (ReceiveTextbooksViaBarcodeScanForm)request.getAttribute(ReceiveTextbooksViaBarcodeScanForm.FORM_NAME);
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>
<P>
<base:messageBox strutsErrors="true"/>

<script language="JavaScript">
<!--
    function trapEnter(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        document.<%=ReceiveTextbooksViaBarcodeScanForm.FORM_NAME%>.<%=ReceiveTextbooksViaBarcodeScanForm.FIELD_TRAP_ENTER_PRESSED%>.value=true;
      }
      return true;
    }
//-->
</script>

<base:form action="/cataloging/servlet/handlereceivetextbooksviabarcodescanform.do"
focus="<%=ReceiveTextbooksViaBarcodeScanForm.FIELD_BARCODE %>" >
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">
<html:hidden property="<%=ViewIncomingTransferRequestForm.FIELD_TRAP_ENTER_PRESSED %>" value="false"/>
<html:hidden property="<%= ReceiveTextbooksViaBarcodeScanForm.PARAM_FROM_ORDER%>"/>
<html:hidden property="<%= ReceiveTextbooksViaBarcodeScanForm.PARAM_COLLECTION_TYPE %>" value="<%= String.valueOf(form.getCollectionType()) %>" />

<% if (form.isFromOrder()) { %>
<table id="<%=ReceiveTextbooksViaBarcodeScanForm.TABLE_UNBARCODED_ATTENTION_TABLE%>">
    <tr>
        <td class="ColRowBold">
            <img name="instructionalImage" src='<%=lh.getLocalizedImagePath("/icons/general/caution.gif")%>' alt="Attention" align="absbottom" border="0"/>
            <a href="/cataloging/servlet/presentorderslistform.do?collectionType=<%=form.getCollectionType()%>">
            <c:choose>
              <c:when test="<%=form.getCollectionType() == CollectionType.ASSET%>">
                Unbarcoded items must be received through shipments.
              </c:when>
              <c:otherwise>
                Unbarcoded copies must be received through shipments.
              </c:otherwise>
            </c:choose>
            </a>
            <img name="truckImage" src='<%=lh.getLocalizedImagePath("/icons/general/truck.gif")%>' alt="View Shipments" align="absbottom" border="0"/>
        </td>
    </tr>
</table>
<% } %>

<base:outlinedTableAndTabsWithinThere id="<%=ReceiveTextbooksViaBarcodeScanForm.TABLE_FORM_TABLE%>" borderColor="#C0C0C0" 
    selectedTab="<%=ReceiveTextbooksViaBarcodeScanForm.ID_TAB%>" tabs="<%=ReceiveTextbooksViaBarcodeListForm.getTabs(form.isFromOrder(), form.getCollectionType())%>" >
<tr>
    <td class="TableHeading">
        <%=form.getPageTitle()%>
    </td>
</tr>
<tr>
    <td>
        <base:imageLine/>
    </td>
</tr>

<tr>
    <td>
        <span class="ColRowBold">
            <c:choose>
              <c:when test="<%=form.getCollectionType() == CollectionType.ASSET%>">
                Scan or enter items one-at-a-time
              </c:when>
              <c:otherwise>
                Scan or enter copies one-at-a-time
              </c:otherwise>
            </c:choose>
        </span>
        <span onKeyPress="return trapEnter(event);">
            <html:text property="<%= ReceiveTextbooksViaBarcodeScanForm.FIELD_BARCODE %>" size="20"/>
        </span>
        <base:genericButton src="/buttons/large/receive.gif"
            name="<%= ReceiveTextbooksViaBarcodeListForm.BUTTON_RECEIVE %>" alt="Receive by barcode" absbottom="true" />        
    </td>
</tr>
<% if(form.getScannedList() != null && form.getScannedList().size() > 0) { %>
<tr>
    <td>
        <base:imageLine/>
    </td>
</tr>
<tr>
    <td class="TableHeading2">
        <c:choose>
          <c:when test="<%=form.getCollectionType() == CollectionType.ASSET%>">
            Items Received
          </c:when>
          <c:otherwise>
            Copies Received
          </c:otherwise>
        </c:choose>
    </td>
</tr>
<tr>
    <td>
        <table width="100%" cellpadding="4" cellspacing="0" id="<%= ReceiveTextbooksViaBarcodeScanForm.TABLE_ID_TRANSACTION_LIST %>">
        <tr>
            <td class="SmallColHeading" valign="bottom">Barcode</td>
            <td class="SmallColHeading" valign="bottom"><%=form.getCollectionType() == CollectionType.ASSET ? "Resource" : "Title" %></td>
            <td class="SmallColHeading" valign="bottom">ISBN</td>
            <td class="SmallColHeading" valign="bottom">Received<br>From</td>
        </tr>
        <logic:iterate indexId="flipper" id="transferItem" name="<%=ReceiveTextbooksViaBarcodeScanForm.FORM_NAME%>" property="scannedList" type="com.follett.fsc.destiny.session.cataloging.remote.data.ReceiveTransferByBarcodeResult">
            <tr <%=( ( (1 & flipper.intValue())==0)? "bgColor=\"#E8E8E8\"" : "" )%> >
                <td class="ColRow" valign="top"><%=transferItem.getBarcode() %></td>
                <td class="ColRow" valign="top"><%=form.buildBibTypeIcon(transferItem) %>
                <%=transferItem.getTitle() %> 
                <% if (!StringHelper.isEmpty(transferItem.getStateTextbookID())) { %>
                    (State/Textbook ID: <%= transferItem.getStateTextbookID()%>)
               <% } %> </td>
               <td class="ColRow" valign="top">
                <% if (!StringHelper.isEmpty(transferItem.getIsbn())) { %>
                    <%=transferItem.getIsbn() %>
                <% } else { %>
                    &nbsp;
                <% } %>
                </td>
                <td class="ColRow" valign="top"><%=transferItem.getFromSourceName() %></td>
            </tr>
        </logic:iterate>
        </table>
    </td>
</tr>
<% } %>
</base:outlinedTableAndTabsWithinThere>
</base:form>

