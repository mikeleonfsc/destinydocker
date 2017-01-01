<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<c:set var="form" value="<%=request.getAttribute(FineDetailsForm.FORM_NAME)%>"/>
<jsp:useBean id="form" type="com.follett.fsc.destiny.client.circulation.servlet.FineDetailsForm"/>

<base:outlinedTable borderColor="#c0c0c0" id="<%=FineDetailsForm.TABLE_MAIN%>" >
<tr>
<td valign="top" class="TableHeading">
  <bean:write name="<%= FineDetailsForm.FORM_NAME %>" property="patronHeader"/>
</td>
<td valign="top" class="tdAlignRight">
<% if (!form.isPrinterFriendly() ) {%>
    <base:link page="<%=form.getPrinterFriendlyPage()%>" target="printerFriendly" id="<%=FineDetailsForm.ID_PRINTER_FRIENDLY %>">
        <base:image src="/buttons/small/printerfriendly.gif" alt='<%=MessageHelper.formatMessage("printable") %>'/>
    </base:link>
<%} %>
</td>
</tr>

<tr>
<td colspan="2">
<table id=<%=FineDetailsForm.TABLE_FINE_HEADER%> border="0" cellpadding="3" cellspacing="0" width="100%">
<tr>
<td class="TableHeading" valign="top" colspan="3">
<span style="font-size: 0.8em">
  <bean:write name="<%= FineDetailsForm.FORM_NAME %>" property="fineDescription"/>
  <c:out value="${form.fineShortSiteName}"/>
</span>
</td>
<td class="ColRow tdAlignRight" valign="top" nowrap>
  <%= MessageHelper.formatMessage("finedetails_0Balance12", "<b>", "</b>", form.getFineBalance()) %>
</td>
</tr>

<logic:equal name="<%= FineDetailsForm.FORM_NAME %>" property="copyBasedFine" value="true">
    <tr>
        <logic:equal name="<%= FineDetailsForm.FORM_NAME %>" property="assetNonTextbookBasedFine" value="true">
            <td valign="top" colspan="2" class="tdAlignLeft">
              <bean:write name="<%= FineDetailsForm.FORM_NAME %>" property="title" filter="false"/>
              <bean:write name="<%= FineDetailsForm.FORM_NAME %>" property="barcode" filter="false"/>
            </td>
        </logic:equal>
        <logic:equal name="<%= FineDetailsForm.FORM_NAME %>" property="assetNonTextbookBasedFine" value="false">
            <td class="ColRow" valign="top">
              <bean:write name="<%= FineDetailsForm.FORM_NAME %>" property="materialType" filter="false"/>
            </td>
            <td valign="top">
              <bean:write name="<%= FineDetailsForm.FORM_NAME %>" property="title" filter="false"/>
              <bean:write name="<%= FineDetailsForm.FORM_NAME %>" property="barcode" filter="false"/>
            </td>
        </logic:equal>
        <td class="ColRowBold tdAlignRight" valign="top">
          <bean:write name="<%= FineDetailsForm.FORM_NAME %>" property="author"/>
        </td>
        <td class="ColRowBold tdAlignRight" valign="top">
          <bean:write name="<%= FineDetailsForm.FORM_NAME %>" property="callNumber" filter="false"/>
    </td>
    </tr>
</logic:equal>

</table>
</td>
</tr>

<tr>
<td colspan="2">
    <base:fineDetailsListOutput
        finesList="<%= form.getFineHistoryList() %>"
        showNote="<%= form.isShowFineNote() %>"
    />
</td>
</tr>

</base:outlinedTable>
