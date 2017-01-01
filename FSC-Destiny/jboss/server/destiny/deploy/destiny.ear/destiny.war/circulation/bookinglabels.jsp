<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.BookingLabelsForm" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<bean:define id="stocks" name="<%= BookingLabelsForm.FORM_NAME %>" property="labelStocks"/>

<base:messageBox strutsErrors="true"/>

<%
    BookingLabelsForm form = (BookingLabelsForm)request.getAttribute(BookingLabelsForm.FORM_NAME);
%>

<base:form action="/circulation/servlet/handlebookinglabelsform.do">
<html:hidden property="<%=BookingLabelsForm.PARAM_PICK_LIST_ID%>"/>
<html:hidden property="<%=BookingLabelsForm.PARAM_KICK_OFF_SHIPPING_JOB%>"/>
<html:hidden property="<%=BookingLabelsForm.PARAM_INCLUDE_PACKING_LIST%>"/>
<html:hidden property="<%=BookingLabelsForm.PARAM_DELIVERY_METHOD%>"/>
<html:hidden property="<%=BookingLabelsForm.PARAM_COPIES_TO_PROCESS%>"/>

<base:outlinedTable id="<%=BookingLabelsForm.TABLE_MAIN%>" borderColor='#C0C0C0'>
    <tr>
        <td colspan="4" vAlign="top" class="TableHeading">
            Print Booking Labels for...
        </td>
        <td valign="top" class="ColRowBold">
            <base:reportButton/>
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td class="TableHeading2" colspan="3">
        <c:if test="<%=form.getPickListDate() != null%>">
        Items in the Pick List for <%=form.getPickListDate()%>
        </c:if></td>
        <td>&nbsp;</td>

    </tr>
    <tr>
        <td colspan="2">&nbsp;</td>
        <td class="ColRow tdAlignRight">
        Use label stock
        </td>
        <td>
          <html:select property="<%= BookingLabelsForm.FIELD_LABEL_STOCK %>">
            <html:options collection="stocks" property="longID"
                          labelProperty="stringDesc"/>
          </html:select>

        </td>
        <td>&nbsp;</td>
    </tr>
    <tr>
        <td colspan="2">&nbsp;</td>
        <td class="ColRow tdAlignRight">
        Start on label
        </td>
        <td>
            <html:text property="<%= BookingLabelsForm.FIELD_LABEL_START %>" maxlength="3" size="4"/>
        </td>
        <td>&nbsp;</td>
    </tr>
    <tr>
        <td colspan="2">&nbsp;</td>
        <td class="ColRow tdAlignRight">
        Printer offset
        </td>
        <td class="ColRow" valign="bottom">
            Horizontal:&nbsp;<html:text property="<%= BookingLabelsForm.FIELD_HORIZONTAL_OFFSET %>" maxlength="4" size="4"/>
            &nbsp;&nbsp;&nbsp;Vertical:&nbsp;<html:text property="<%= BookingLabelsForm.FIELD_VERTICAL_OFFSET %>" maxlength="4" size="4"/>
        </td>
        <td>&nbsp;</td>
    </tr>

</base:outlinedTable>
</base:form>
