<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.util.marc.BibType"%>
<%@ page import="com.follett.fsc.commons.marc.stdnum.ISBN"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%>
<%@ page import="com.follett.fsc.common.StringHelper" %>
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
    ReturnsIdentifyCopiesForm form = (ReturnsIdentifyCopiesForm)request.getAttribute(ReturnsIdentifyCopiesForm.FORM_NAME);

    String focus = ReturnsIdentifyCopiesForm.FIELD_BARCODE;
    if (form.isPrinterFriendly() || form.isViewOnly()) {
        focus = "";
    }
    
    boolean viewOnly = form.isViewOnly();
%>

<%@page import="org.apache.struts.util.ResponseUtils"%>

<%@page import="com.follett.fsc.destiny.entity.ejb3.ReturnsSpecs"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.data.ReturnTitleVO"%>
<c:set var="form" value="<%=form%>" />

<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handlereturnsidentifycopiesform.do" focus="<%=focus %>">
 <%if (!form.isPrinterFriendly()){ %>
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">
 <%} %>
<html:hidden property = "bibID"/>
<html:hidden property = "${form.constants.PARAM_ADDED_TITLE}"/>

<% if (form.getConfirmationMode() == ReturnsIdentifyCopiesForm.CONFIRM_DELETE) { %>
    <html:hidden property = "${form.constants.FIELD_COPY_INDEX_TO_DELETE}"/>
    <html:hidden property = "confirmationMode"/>
    <base:messageBox showRedBorder="true">
        <tr>
            <td valign="top">
                <%= MessageBoxTag.getCAUTION_IMAGE_HTML() %>
            </td>
            <td class="ColRowBold">
                <%= MessageHelper.formatMessage("returnsidentifycopies_AreYouSureYouWantToRemoveCopy",ResponseUtils.filter(form.getCopyBarcodeToDelete())) %>
            </td>
        </tr>
        <tr>
            <td align="center" class="ColRow" colspan="2">
                <base:yesNo/>
            <td>
        </tr>
    </base:messageBox>
<% } else if (form.getConfirmationMode() == ReturnsIdentifyCopiesForm.CONFIRM_TRANSFER_RECEIVE) { %>
    <html:hidden property = "confirmationMode"/>
    <html:hidden property="<%=ReturnsIdentifyCopiesForm.FIELD_LOCAL_BARCODE %>"/>
    <base:messageBox showRedBorder="true">
        <tr>
            <td valign="top">
                <%=MessageBoxTag.getCAUTION_IMAGE_HTML() %>
            </td>
            <td class="ColRowBold"><%= MessageHelper.formatMessage("returnsidentifycopies_PleaseNote") %></td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td class="ColRowBold">
                <%= form.getReceiveMessage() %>
            <td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td class="ColRowBold" align="center"><%= MessageHelper.formatMessage("returnsidentifycopies_DoYouWantToReceiveThisCopy") %></td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td align="center">
                <base:yesNo/>
            </td>
        </tr>
    </base:messageBox>
<% } %>

<c:if test = "${form.printerFriendly == false}">
    <table width="95%">
        <tr><td class="tdAlignRight"><a href="/cataloging/servlet/handlereturnsidentifycopiesform.do?numCopies=${form.numCopies}&printerFriendly=true&bibID=${form.bibID}&viewOnly=${form.viewOnly}" target="_blank" id="<%=GenericForm.ID_PRINTER_FRIENDLY %>"><base:image src="/buttons/small/printerfriendly.gif" alt="Printer Friendly"/></a></td></tr>
    </table>
</c:if>
<base:outlinedTable id="<%=ReturnsIdentifyCopiesForm.TABLE_MAIN %>" borderColor="<%=FlipperTag.ROW_GRAY %>">
    
    <c:if test="${form.viewOnly == false}">
        <tr>
            <td class="TableHeading"><%= MessageHelper.formatMessage("returnsidentifycopies_IdentifyCopies") %></td>
            <td>&nbsp;</td>
            <td class="tdAlignRight" valign = "bottom">
                <c:if test = "${form.printerFriendly == false}">
                        <base:okButton/>
                </c:if>
            </td>
        </tr>
    </c:if>
    <tr>
        <td class = "ColRow"><span class = "TableHeading">
            <c:if test = "${form.printerFriendly == false}">
                <%=BibType.getBibTypeIcon((form.getTitleInfo().getStateBibID() != null), form.getTitleInfo().getBibType(), null, CollectionType.TEXTBOOK, null, null) %>
            </c:if>
            <c:if test = "${form.printerFriendly == true}">
                <%= BibType.getBibTypePrinterFriendlyDescriptions( form.getTitleInfo().getBibType(), null, (form.getTitleInfo().getStateBibID() != null)) %>
            </c:if>
            <%= form.getTitleInfo().getTitle() %></span><br/>
            <%= (StringHelper.isEmptyOrWhitespace(form.getTitleInfo().getDisplayableIsbn()) ? "" : "ISBN: " + form.getTitleInfo().getDisplayableIsbn() + "<br/>") %>
            <%= (StringHelper.isEmptyOrWhitespace(form.getTitleInfo().getStateTextbookID()) ? "" : "State/Textbook ID: " + form.getTitleInfo().getStateTextbookID() + "<br/>") %>
        </td>
        <td>&nbsp;</td>
        <td class="tdAlignRight" valign = "top">
            <c:if test="${form.viewOnly == true && form.printerFriendly == false}">
                <base:closeButton/>
            </c:if>
            <c:if test="${form.printerFriendly == true && form.viewOnly == false}">
                &nbsp;
            </c:if>
        </td>
    </tr>
    <%if(!form.isViewOnly()) { %>
        <tr>
            <td colspan = "3"><base:imageLine/></td>
        </tr>
        <tr>
            <td colspan = "3">
                <table width="100%" id="${form.constants.TABLE_ACTION}">
                <tr>
                    <td>&nbsp;</td>
                    <c:if test = "${form.printerFriendly == false}">
                        <td>&nbsp;</td>
                    </c:if>
                    <td class="ColRowBold" valign="bottom"><%= MessageHelper.formatMessage("returnsidentifycopies_Available") %></td>
                </tr>
                <tr>
                    <c:if test = "${form.printerFriendly == false}">
                        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("returnsidentifycopies_ScanOrEnterBarcodes") %></td>
                        <td><html:text property="<%=ReturnsIdentifyCopiesForm.FIELD_BARCODE %>" size = "25" maxlength = "50"/>&nbsp;<base:goButton absbottom="true"/></td>
                    </c:if>
                    <c:if test = "${form.printerFriendly == true}">
                        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("returnsidentifycopies_CopiesWithBarcodes") %></td>
                    </c:if>
                    <td class = "ColRow"><%= form.getCopiesAvailableWithBarcode() %></td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("returnsidentifycopies_CopiesWithoutBarcodes") %></td>
                    <c:if test = "${form.printerFriendly == false}">
                        <td><html:text property="<%=ReturnsIdentifyCopiesForm.FIELD_NUM_COPIES %>" disabled="<%= (form.getCopiesAvailableWithoutBarcode() > 0 ? false : true) %>" size="3"  maxlength="3"/></td>
                    </c:if>
                    <td class = "ColRow"><%= form.getCopiesAvailableWithoutBarcode() %></td>
                </tr>
                </table>
            </td>
        </tr>
    <% } %>
    <c:if test="${fn:length(form.copiesIdentified) > 0}">
    <tr>
        <c:if test = "${form.viewOnly == false}">
            <base:sectionHeading heading="Copies Identified" tdContent="colspan = '3' width = '100%'"/>
        </c:if>
        <c:if test = "${form.viewOnly == true}">
            <base:sectionHeading heading="Copies" tdContent="colspan = '3' width = '100%'"/>
        </c:if>
    </tr>
    <tr>
        <td colspan = "3">
            <table width = "100%" id="${form.constants.TABLE_COPIES}" cellspacing="0">
                <tr>
                    <td class = "SmallColHeading"><%= MessageHelper.formatMessage("returnsidentifycopies_Barcode") %></td>
                    <td class="tdAlignRight">&nbsp;</td>
                </tr>
                <c:forEach var = "row" items = "${form.copiesIdentified}" varStatus = "status">
                   <base:flipper key="idcopies">
                     <td>
                        <span class="ColRow">${row.barcode}</span>
                        <c:choose>
                            <c:when test="${row.deleted && row.received == false}">
                                <font color="#CC0000"><span class="ColRow">(<%= MessageHelper.formatMessage("returnsidentifycopies_Removed") %>)</span></font>
                            </c:when>
                            <c:otherwise>
                                <% if(((ReturnTitleVO)form.getTitleInfo()).getStatus() == ReturnsSpecs.STATUS_BIB_DENIED) { %>
                                    <font color="#CC0000"><span class="ColRow">(<%= MessageHelper.formatMessage("returnsidentifycopies_Denied") %>)</span></font>
                                <% } %>
                            </c:otherwise>
                        </c:choose>
                        <% if(form.getStatus() == ReturnsSpecs.STATUS_COMPLETED) { %>
                        <c:choose>
                            <c:when test="${row.received == true}">
                                <span class="SmallColHeading">&nbsp;&nbsp;&nbsp;&nbsp;<%= MessageHelper.formatMessage("returnsidentifycopies_Received") %></span>
                            </c:when>
                            <c:otherwise>
                                <span class="SmallColHeading">&nbsp;&nbsp;&nbsp;&nbsp;<%= MessageHelper.formatMessage("returnsidentifycopies_NotReceived") %></span>
                            </c:otherwise>
                        </c:choose>
                         <% } %>
                      </td>
                      <c:if test = "${form.printerFriendly == false && form.viewOnly == false}">
                        <td class="tdAlignRight"><base:genericButton src="/buttons/small/remove_60.gif" name="${form.constants.BUTTON_REMOVE}${status.index}" alt = "<%= ReturnsIdentifyCopiesForm.ALT_REMOVE %>"/></td>
                      </c:if>
                      <c:if test = "${form.printerFriendly == true && form.viewOnly == false}">
                        <td>&nbsp;</td>
                      </c:if>
                    </base:flipper>
                </c:forEach>
            </table>
        </td>
    </tr>
    </c:if>
    <tr>
        <td colspan = "3"><br/></td>
    </tr>
</base:outlinedTable>
</base:form>
