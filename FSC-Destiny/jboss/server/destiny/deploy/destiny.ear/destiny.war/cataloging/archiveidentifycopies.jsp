<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.util.marc.BibType"%>
<%@ page import="com.follett.fsc.commons.marc.stdnum.ISBN"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.session.cataloging.data.ReturnTitleVO"%>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.ReturnsSpecs"%>
<%@ page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@page import="com.follett.fsc.destiny.util.CollectionType"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-format.tld" prefix="fmt" %>

<%
    ArchiveIdentifyCopiesForm form  = (ArchiveIdentifyCopiesForm)request.getAttribute(ArchiveIdentifyCopiesForm.FORM_NAME);
    ArchiveIdentifyCopiesForm cForm = (ArchiveIdentifyCopiesForm)request.getAttribute(ArchiveIdentifyCopiesForm.FORM_NAME);
    ReturnTitleVO titleInfo = (ReturnTitleVO)cForm.getTitleInfo();
%>

<c:set var="form" value="<%=cForm%>" />

<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handlearchiveidentifycopiesform.do">
<html:hidden property = "<%= ArchiveIdentifyCopiesForm.PARAM_BIB_ID %>"/>
<html:hidden property = "<%= ArchiveIdentifyCopiesForm.PARAM_TRANSFER_ID %>"/>
<html:hidden property = "<%= ArchiveIdentifyCopiesForm.PARAM_RETURN_ID %>"/>


<c:if test = "${form.printerFriendly == false}">
    <table width="95%">
        <tr><td class="tdAlignRight"><a href="/cataloging/servlet/handlearchiveidentifycopiesform.do?transferID=${form.transferID}&returnID=${form.returnID}&printerFriendly=true&bibID=${form.bibID}" target="_blank" id="<%=GenericForm.ID_PRINTER_FRIENDLY %>"><base:image src="/buttons/small/printerfriendly.gif" alt='<%=MessageHelper.formatMessage("printable") %>'/></a></td></tr>
    </table>
</c:if>

<%
String bgColor = "#FFFFFF";
if(!cForm.isPrinterFriendly()) {
    bgColor = FlipperTag.ROW_GRAY;
}
%>

<base:outlinedTable id="<%=ArchiveIdentifyCopiesForm.TABLE_MAIN %>" borderColor="<%=bgColor %>">
    <tr>
        <td class = "ColRow"><span class = "TableHeading">
            <c:if test = "${form.printerFriendly == false}">
                <%=BibType.getBibTypeIcon(true, titleInfo.getBibType(), null, CollectionType.TEXTBOOK, null, null) %>
            </c:if>
            <c:if test = "${form.printerFriendly == true}">
                <%= BibType.getBibTypePrinterFriendlyDescriptions( titleInfo.getBibType(), null, true) %>
            </c:if>
            <%= titleInfo.getTitle() %></span><br/>
            <%= (StringHelper.isEmptyOrWhitespace(titleInfo.getDisplayableIsbn()) ? "" : MessageHelper.formatMessage("archiveidentifycopies_Isbn0", titleInfo.getDisplayableIsbn()) + "<br/>") %>
            <%= (StringHelper.isEmptyOrWhitespace(titleInfo.getStateTextbookID()) ? "" : MessageHelper.formatMessage("archiveidentifycopies_StatetextbookId0", titleInfo.getStateTextbookID()) + "<br/>") %>
        </td>
        <td>&nbsp;</td>
        <td class="tdAlignRight" valign="bottom">
            <c:if test = "${form.printerFriendly == false}">
                <base:closeButton/>
            </c:if>&nbsp;
        </td>
    </tr>
    <% if (cForm.getReturnID() != null && cForm.getStore().isStateContext() ) { %>
        <tr>
            <td colspan="3"><base:imageLine/></td>
        </tr>
        <tr>
            <td colspan="3">
                <table id="<%= ArchiveIdentifyCopiesForm.TABLE_DISPOSITION_COUNTS %>" width="100%">
                    <tr>
                        <td class="ColRowBold">&nbsp;</td>
                        <td class="ColRowBold" align="center"><%= MessageHelper.formatMessage("archiveidentifycopies_WithoutBarcodes") %></td>
                        <td class="ColRowBold" align="center"><%= MessageHelper.formatMessage("archiveidentifycopies_WithBarcodes") %></td>
                    </tr>
                    <tr>
                        <td class="ColRowBold"><%= MessageHelper.formatMessage("archiveidentifycopies_Sent") %></td>
                        <td class="ColRow" align="center"><%= titleInfo.getCopiesWithoutBarcode() %></td>
                        <td class="ColRow" align="center"><%= titleInfo.getCopiesWithBarcode() %></td>
                    </tr>
                    <tr>
                        <td class="ColRowBold"><%= MessageHelper.formatMessage("archiveidentifycopies_Publisher") %></td>
                        <td class="ColRow" align="center"><%= titleInfo.getReceivedPublisher() %></td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td class="ColRowBold"><%= MessageHelper.formatMessage("archiveidentifycopies_Stock") %></td>
                        <td class="ColRow" align="center"><%= titleInfo.getReceivedStock() %></td>
                        <td class="ColRow" align="center"><%= titleInfo.getBarcodedStock() %></td>
                    </tr>
                    <tr>
                        <td class="ColRowBold"><%= MessageHelper.formatMessage("archiveidentifycopies_Rebind") %></td>
                        <td class="ColRow" align="center"><%= titleInfo.getReceivedRebind() %></td>
                        <td class="ColRow" align="center"><%= titleInfo.getBarcodedRebind() %></td>
                    </tr>
                    <tr>
                        <td class="ColRowBold"><%= MessageHelper.formatMessage("archiveidentifycopies_Recycle") %></td>
                        <td class="ColRow" align="center"><%= titleInfo.getReceivedRecycle() %></td>
                        <td class="ColRow" align="center"><%= titleInfo.getBarcodedRecycle() %></td>
                    </tr>
                </table>
            </td>  
        </tr>
    <% } else if (cForm.getTransferID() != null) {%>
        <tr>
            <td colspan="3"><base:imageLine/></td>
        </tr>
        <tr>
            <td colspan="3">
                <table id="<%= ArchiveIdentifyCopiesForm.TABLE_DISPOSITION_COUNTS %>" width="100%">
                    <tr>
                        <td class="ColRowBold">&nbsp;</td>
                        <td class="ColRowBold" align="center"><%= MessageHelper.formatMessage("archiveidentifycopies_WithoutBarcodes") %></td>
                        <td class="ColRowBold" align="center"><%= MessageHelper.formatMessage("archiveidentifycopies_WithBarcodes") %></td>
                    </tr>
                    <tr>
                        <td class="ColRowBold"><%= MessageHelper.formatMessage("archiveidentifycopies_Sent") %></td>
                        <td class="ColRow" align="center"><%= titleInfo.getCopiesWithoutBarcode() %></td>
                        <td class="ColRow" align="center"><%= titleInfo.getCopiesWithBarcode() %></td>
                    </tr>
                    <tr>
                        <td class="ColRowBold"><%= MessageHelper.formatMessage("archiveidentifycopies_Lost") %></td>
                        <td class="ColRow" align="center"><%= titleInfo.getUnBarcodedLost() %></td>
                        <td class="ColRow" align="center"><%= titleInfo.getBarcodedLost() %></td>
                    </tr>
                    <tr>
                        <td class="ColRowBold"><%= MessageHelper.formatMessage("archiveidentifycopies_Deleted") %></td>
                        <td class="ColRow" align="center"><%= titleInfo.getUnBarcodedDeleted() %></td>
                        <td class="ColRow" align="center"><%= titleInfo.getBarcodedDeleted() %></td>
                    </tr>
                </table>
            </td>  
        </tr>
    
    <%} %>
    <% if  (titleInfo.getCopiesWithBarcode() > 0) { %>
        <tr>
            <base:sectionHeading heading="Copies" tdContent="colspan = '3' width = '100%'"/>
        </tr>
        <tr>
            <td colspan = "3">
                <table width = "100%" id="${form.constants.TABLE_COPIES}" cellspacing="0">
                    <tr>
                        <td class = "SmallColHeading"><%= MessageHelper.formatMessage("archiveidentifycopies_Barcode") %></td><td>&nbsp;</td>
                    </tr>
             <c:forEach var = "row" items = "${form.copyList}" varStatus = "status">
                        <jsp:useBean id = "row" type = "com.follett.fsc.destiny.session.cataloging.data.ReturnCopyVO"/>
                        <c:if test = "${status.count % 2 == 0}">
                            <tr>
                        </c:if>
                        <c:if test = "${status.count % 2 != 0 }">
                            <tr bgcolor = "<%= FlipperTag.ROW_GRAY %>">
                        </c:if>
                            <td>
                                <span class="ColRow">${row.barcode}</span>
                            </td>
                            <td>
                                <c:if test="${row.received == true}">
                                    <span class="SmallColHeading">&nbsp;&nbsp;&nbsp;&nbsp;<%=MessageHelper.formatMessage("archiveidentifycopies_Received0", cForm.getReturnStatusText(row)) %>
                                    </span>
                                </c:if>
                                <c:if test="${row.received == false}">
                                    <span class="SmallColHeading">&nbsp;&nbsp;&nbsp;&nbsp;<%=MessageHelper.formatMessage("archiveidentifycopies_NotReceived0", cForm.getTransferDeletedText(row)) %></span>
                                </c:if>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </td>
        </tr>
    <%} %>
    <tr>
        <td colspan = "3"><br/></td>
    </tr>
</base:outlinedTable>

</base:form>


