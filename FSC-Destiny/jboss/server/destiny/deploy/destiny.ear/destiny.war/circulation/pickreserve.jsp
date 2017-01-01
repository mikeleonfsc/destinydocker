<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.PickReserveForm"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.HoldSpecs"%>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ page import="com.follett.fsc.destiny.util.BarcodeHelper" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator"%>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>

<script language="javascript">
<!--
function submitDropDown() {
        document.<%=PickReserveForm.FORM_NAME%>.<%=PickReserveForm.BUTTON_SUBMIT_DELIVERY_METHOD%>.value = "true";
        document.<%=PickReserveForm.FORM_NAME%>.submit();
}
// -->
</script>

<base:messageBox strutsErrors="true" />

<%
PickReserveForm form = (PickReserveForm) request.getAttribute(PickReserveForm.FORM_NAME);
String focus = null;
if ( form.isPrinterFriendly() ) {
    focus = "";    
} else {
    focus = PickReserveForm.FIELD_SEARCH_STRING;
}

%>

<c:set var="form" value="<%=request.getAttribute(PickReserveForm.FORM_NAME)%>"/>
<c:set var="unspecifiedDeliveryMethod" value="<%= HoldSpecs.DELIVERY_METHOD_UNASSIGNED %>"/>
<base:form action="/circulation/servlet/handlepickreserveform.do"  focus="<%=focus%>">
<bean:define id="optionList" name="<%=PickReserveForm.FORM_NAME%>" property="optionList" />
<html:hidden property="<%=PickReserveForm.FIELD_QUANTITY %>"/>
<html:hidden property="<%=PickReserveForm.PARAM_HOLD_ID %>"/>
<html:hidden property="<%=PickReserveForm.BUTTON_SUBMIT_DELIVERY_METHOD %>"/>
<logic:equal name="<%=PickReserveForm.FORM_NAME%>" property="printerFriendly" value="false">
    <base:outlinedTable id="<%= PickReserveForm.TABLE_MAIN %>" width="100%" borderColor="#C0C0C0">
        <tr>
            <td bgcolor="#ffffff" valign="top" width="100%">
                <table id="<%= PickReserveForm.TABLE_HEADER %>" cellpadding="5" cellspacing="0" width="100%">
                    <tr>
                        <td class="ColRowBold" valign="top"><%= MessageHelper.formatMessage("pickreserve_ToBePicked") %></td>
                        <td class="ColRowBold tdAlignRight" vAlign="top">
                            <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=PickReserveForm.BUTTON_TRAP_ENTER%>">
                            <base:saveButton />&nbsp;<base:cancelButton/>
                        </td>
                    </tr>   
                    <tr>
                        <td class="TableHeading">
                            <bean:write name="<%=PickReserveForm.FORM_NAME%>" property="<%=PickReserveForm.FIELD_TITLE %>"/>
                                <base:genericButton name="<%=PickReserveForm.BUTTON_VIEW_TITLE%>" alt='<%= MessageHelper.formatMessage("details") %>' src="/buttons/small/detailsover.gif"/>
                        </td>
                        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("pickreserve_QuantityRemaining", form.getQuantity()) %>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" class="ColRowBold" valign="top"><%= MessageHelper.formatMessage("pickreserve_ScanPickedCopies") %>&nbsp;<html:text property="<%=PickReserveForm.FIELD_SEARCH_STRING%>" />&nbsp;<base:goButton align="absbottom" />
                        </td>
                    </tr>
                    <tr>
                        <td class="TableHeading2" valign="top"><%= MessageHelper.formatMessage("pickreserve_For0", form.getPatronDisplayable()) %>
                            <base:spanIfAllowed permission="<%=Permission.CIRC_VIEW_PATRON_STATUS%>">
                                <base:genericButton name="<%=PickReserveForm.BUTTON_VIEW_PATRON%>" alt='<%=MessageHelper.formatMessage("pickreserve_View0", form.getPatronDisplayable())%>' src="/icons/general/view.gif"/>
                            </base:spanIfAllowed>
                        </td>
                        <td class="SmallColHeading tdAlignRight" valign="top">
                                <base:link href="${form.printerFriendlyLink}" target="_blank" id="<%=PickReserveForm.ID_PRINTER_FRIENDLY %>">
                                    <base:image src="/buttons/small/printerfriendly.gif" alt='<%= MessageHelper.formatMessage("printable") %>' />
                                </base:link>
                         </td>
                    </tr>
                    <c:if test="${form.displayDeliveryMethod}">
                        <tr>
                            <td class="ColRowBold" colspan="2">
                            <%= MessageHelper.formatMessage("pickreserve_DeliveryMethod") %>&nbsp;
                                <c:choose>
                                    <c:when test="${form.deliveryMethod == unspecifiedDeliveryMethod || form.displayDeliveryMethodDropdown}">
                                        <html:select property="<%=PickReserveForm.FIELD_DELIVERY_METHOD%>" onchange="submitDropDown()">
                                            <html:options collection="optionList" property="longID" labelProperty="stringDesc"/>
                                        </html:select>
                                        <html:hidden property="<%=PickReserveForm.FIELD_DISPLAY_DELIVERY_METHOD_DROP_DOWN%>" value="true"/>
                                    </c:when>
                                    <c:otherwise>
                                        ${form.deliveryMethodDisplayable} 
                                         <html:hidden property="<%=PickReserveForm.FIELD_DELIVERY_METHOD%>"/>
                                         <html:hidden property="<%=PickReserveForm.FIELD_DISPLAY_DELIVERY_METHOD_DROP_DOWN%>" value="false"/>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                        </tr>
                        <tr>
                            <td class="Instruction"><%= MessageHelper.formatMessage("pickreserve_TheDeliveryMethodSelectedAppliesToAllCopiesInThe") %></td>
                        </tr>
                    </c:if>
                </table>
            </td>
        </tr>
        <tr>
            <td>
                <table id="<%=PickReserveForm.TABLE_RESULTS %>" border="0" cellpadding="4" cellspacing="0" width="100%">
                        <tr>
                            <td class="SmallColHeading" colspan="3" nowrap="nowrap">
                                <img height="2" src="/images/icons/general/line.gif" width="100%">
                            </td>
                        </tr>
                        <c:choose>
                            <c:when test="${! empty form.results}">
                                <tr>
                                    <td class="SmallColHeading" nowrap="nowrap"><%= MessageHelper.formatMessage("pickreserve_Call") %></td>
                                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("pickreserve_Title") %></td>
                                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("pickreserve_Barcode") %></td>
                                </tr>
                            </c:when>
                            <c:otherwise>
                                <tr>
                                    <td class="ColRow" nowrap="nowrap" colspan="3"><%= MessageHelper.formatMessage("pickreserve_NoCopiesHaveBeenPicked") %></td>
                                </tr>
                            </c:otherwise>
                        </c:choose>
                        <c:forEach var="copy" items="${form.results}" varStatus="status">
                        <jsp:useBean id="copy" type="com.follett.fsc.destiny.entity.ejb3.CopyVO"/>
                             <c:choose>
                                 <c:when test="${status.count % 2 == 1}">
                                    <tr bgcolor="#E8E8E8" class="ColRow">
                                 </c:when>
                                 <c:otherwise>
                                    <tr class="ColRow">
                                 </c:otherwise>
                             </c:choose>       
                                <td nowrap="nowrap" valign="top"><c:out value="${copy.callNumber}"/></td>
                                <td valign="top"><c:out value="${form.title}"/></td>
                                <td valign="top"><c:out value="<%=BarcodeHelper.getTruncatedBarcode(copy.getCopyBarcode())%>"/></td>
                            </tr>
                        </c:forEach>
                </table>
            </td>
        </tr>
    </base:outlinedTable>
</logic:equal>
<logic:equal name="<%=PickReserveForm.FORM_NAME%>" property="printerFriendly" value="true">
    <table id="<%=PickReserveForm.TABLE_RESULTS %>" border="0" cellpadding="4" cellspacing="0" width="100%">
        <c:if test="${form.displayDeliveryMethod}">
            <tr>
                <td class="ColRow" colspan="3">
                    <b><%= MessageHelper.formatMessage("pickreserve_DeliveryMethod") %></b>&nbsp;${form.deliveryMethodDisplayable}
                </td>
            </tr>
        </c:if>
        <c:choose>
            <c:when test="${! empty form.results}">
                <tr>
                    <td class="SmallColHeading" nowrap="nowrap"><%= MessageHelper.formatMessage("pickreserve_Call") %></td>
                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("pickreserve_Title") %></td>
                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("pickreserve_Barcode") %></td>
                </tr>
            </c:when>
            <c:otherwise>
                <tr>
                    <td class="ColRow" nowrap="nowrap" colspan="3"><%= MessageHelper.formatMessage("pickreserve_NoCopiesHaveBeenPicked") %></td>
                </tr>
            </c:otherwise>
        </c:choose>
        <c:forEach var="copy" items="${form.results}" varStatus="status">
            <tr class="ColRow">
                <td nowrap="nowrap" valign="top"><c:out value="${copy.callNumber}"/></td>
                <td valign="top"><c:out value="${form.title}"/></td>
                <td valign="top"><c:out value="${copy.copyBarcode}"/></td>
            </tr>
        </c:forEach>
    </table>
</logic:equal>  
</base:form>

