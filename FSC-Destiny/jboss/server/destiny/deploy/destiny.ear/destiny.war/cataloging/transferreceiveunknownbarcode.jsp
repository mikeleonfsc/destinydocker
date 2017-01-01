<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.TransferReceiveUnknownBarcodeForm" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%@ page import="com.follett.fsc.destiny.client.common.JSPHelper" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CopySpecs" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="org.apache.struts.util.ResponseUtils"%>
<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.TransferItemsVO"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.TransferItemsSpecs"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<base:messageBox strutsErrors="true"/>

<%
    TransferReceiveUnknownBarcodeForm form = (TransferReceiveUnknownBarcodeForm)request.getAttribute(TransferReceiveUnknownBarcodeForm.FORM_NAME);

    String focus = TransferReceiveUnknownBarcodeForm.FIELD_SCANNED_BARCODE;
    SessionStoreProxy store = form.getStore();
%>

<base:form action="/cataloging/servlet/handletransferreceiveunknownbarcodeform.do" focus="<%=focus%>" enctype="multipart/form-data">
    <html:hidden property="<%= TransferReceiveUnknownBarcodeForm.PARAM_BIB_ID%>"/>
    <html:hidden property="<%= TransferReceiveUnknownBarcodeForm.PARAM_TRANSFER_ID%>"/>
    <html:hidden property="<%= TransferReceiveUnknownBarcodeForm.PARAM_TITLE_FOR_BIB%>"/>
    <base:outlinedTable id="<%=TransferReceiveUnknownBarcodeForm.TABLE_MAIN %>" borderColor="#C0C0C0">
    <tr>
        <td>
            <table width="100%" id="<%=TransferReceiveUnknownBarcodeForm.TABLE_HEADER %>">
            <tr>
                <td class="TableHeading">Identify Copies from State Textbook Office (<%= UserContext.getMyContextLocaleHelper().formatDate(form.getTransferInfo().getTransferDate())%>)</td>
            </tr>
            <% if (!StringHelper.isEmpty(form.getTransferInfo().getPurchaseOrder())) { %>
                <tr>
                    <td>
                        <span class="ColRowBold">Order #: </span>
                        <span class="ColRow"><%= ResponseUtils.filter(form.getTransferInfo().getPurchaseOrder()) %></span>
                    </td>
                </tr>
            <% } %>
            <%if (form.getBibID() == null) { %>
            <tr>
                <td>
                    <span class="ColRowBold">Titles: </span>
                    <span class="ColRow"><%= form.gimmeTitleCount() %></span>
                </td>
            </tr>
            <% } else if (!StringHelper.isEmpty(form.getTransferInfo().getTitle())) { %>
            <tr>
                <td>
                    <span class="ColRowBold">Title: </span>
                    <span class="ColRow"><%= ResponseUtils.filter(form.getTransferInfo().getTitle()) %></span>
                </td>
            </tr>
            <% } %>
            <tr>
                <td>
                    <span class="ColRowBold">Total Copies: </span>
                    <span class="ColRow"><%= form.getTransferInfo().getAllTransferItemsValueList(null, false).size() %></span>
                </td>
            </tr>
            <tr>
                <td>
                    <span class="ColRowBold">Remaining Copies: </span>
                    <span class="ColRow"><%= form.getTransferInfo().getAllTransferItemsValueList(new Integer(TransferItemsSpecs.STATUS_SENT), false).size() %></span>
                </td>
            </tr>
            </table>
        </td>
    </tr>
    <tr><td background="/images/icons/general/thickline.gif"><span class="SectionHeader">Identify Copies</span></td></tr>
    <tr>
        <td>
            <table width="100%" >
            <tr>
                <td class="ColRowBold tdAlignRight">Scan or enter one-at-a-time</td>
                <td class="ColRow">
                    <html:text property="<%=TransferReceiveUnknownBarcodeForm.FIELD_SCANNED_BARCODE %>"/>
                </td>
                <td class="ColRow">
                    <base:showHideTag id="onReceive">
                        <base:genericButton onclick="hideElementonReceive()" name="<%=TransferReceiveUnknownBarcodeForm.BUTTON_RECEIVE%>" src="/buttons/large/receivebig.gif" alt="Receive"/>
                    </base:showHideTag>
                </td>
            </tr>
            <tr>
                <td class="ColRowBold tdAlignRight">Or upload a file of barcodes</td>
                <td class="ColRow">
                    <html:file property="<%=TransferReceiveUnknownBarcodeForm.FIELD_UPLOAD_FILE%>" size="25"/>
                </td>
                <td class="ColRow">
                    <base:showHideTag id="onUpload">
                        <base:genericButton onclick="hideElementonUpload()" name="<%=TransferReceiveUnknownBarcodeForm.BUTTON_UPLOAD%>" src="/buttons/large/uploadscans.gif" alt="Upload"/>
                    </base:showHideTag>
                </td>
            </tr>
            </table>
        </td>
    </tr>
    <% if (form.getTransferInfo().getAllTransferItemsValueList(new Integer(TransferItemsSpecs.STATUS_RECEIVED), false).size() > 0) { %>
    <tr><td background="/images/icons/general/thickline.gif"><span class="SectionHeader">Received</span></td></tr>
    <tr>
        <td>
            <table width="100%" id="<%=TransferReceiveUnknownBarcodeForm.TABLE_RECEIVED%>">
            <tr>
                <td class="SmallColHeading">Barcode</td>
                <% if (form.getBibID() == null) { %>
                    <td class="SmallColHeading">Title</td>
                    <td class="SmallColHeading">ISBN</td>
                <%} %>
            </tr>
            <% 
                Iterator<TransferItemsVO> iter = form.getTransferInfo().getAllTransferItemsValueList(new Integer(TransferItemsSpecs.STATUS_RECEIVED), false).iterator();
                int index = 0;
                while (iter.hasNext()) {
                    TransferItemsVO tiv = iter.next();
            %>
                <tr <%=FlipperTag.getBackgroundColor(index) %>>
                    <td class="ColRow"><%= ResponseUtils.filter(tiv.getFinalizedBarcode()) %></td>
                    <% if (form.getBibID() == null) { %>
                        <td class="ColRow"><%= ResponseUtils.filter(tiv.getTitle()) %></td>
                        <td class="ColRow"><%=StringHelper.ifNotEmptyElse(ResponseUtils.filter(tiv.getIsbn()), "") %></td>
                    <%} %>
                </tr>
                <% index ++; %>
            <% }%>
            </table>
        </td>
    </tr>
    <% } %>
    <tr><td background="/images/icons/general/thickline.gif">&nbsp;</td></tr>
    <tr>
        <td align="center">
            <base:cancelButton/>
        </td>
    </tr>
    </base:outlinedTable>
</base:form>

