<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.Barcode" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.BarcodeListTag"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.ReturnsSpecs"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%
    ReceiveTextbooksViaBarcodeListForm form = (ReceiveTextbooksViaBarcodeListForm)request.getAttribute(ReceiveTextbooksViaBarcodeListForm.FORM_NAME);
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>
<P>
<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handlereceivetextbooksviabarcodelistform.do"
focus="<%=BarcodeListTag.FIELD_SCAN_ITEM %>" 
styleId="keywordList" enctype="multipart/form-data">

<html:hidden property="<%= ReceiveTextbooksViaBarcodeListForm.PARAM_FROM_RETURNS%>"/>
<html:hidden property="<%= ReceiveTextbooksViaBarcodeListForm.PARAM_FROM_ORDER%>"/>
<html:hidden property="<%= ReceiveTextbooksViaBarcodeListForm.PARAM_COLLECTION_TYPE %>" value="<%= String.valueOf(form.getCollectionType()) %>" />


<% if (form.isFromOrder()) { %>
<table id="<%=ReceiveTextbooksViaBarcodeListForm.TABLE_UNBARCODED_ATTENTION_TABLE%>">
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

<base:outlinedTableAndTabsWithinThere id="<%=ReceiveTextbooksViaBarcodeListForm.TABLE_FORM_TABLE%>" borderColor="#C0C0C0" 
    selectedTab="<%=ReceiveTextbooksViaBarcodeListForm.ID_TAB%>" tabs="<%=ReceiveTextbooksViaBarcodeListForm.getTabs(form.isFromOrder(), form.getCollectionType())%>" >

<TR>
    <TD class="TableHeading">
        <%=form.getPageTitle()%>
    </TD>
</TR>
<TR>
    <TD>
        <base:imageLine/>
    </TD>
</TR>

<tr>
    <td>
       <base:barcodeList barcodeType="<%=Barcode.BARCODETYPE_COPY %>" 
           formName="<%=ReceiveTextbooksViaBarcodeListForm.FORM_NAME%>"/>
    </td>
</tr>


<TR>
    <TD>
        <base:imageLine/>
    </TD>
</TR>

<TR>
    <TD align="center" class="ColRow">
<% if (form.getStore().isStateContext()) { %>
        <c:choose>
          <c:when test="<%=form.getCollectionType() == CollectionType.ASSET%>">
            Items go to
          </c:when>
          <c:otherwise>
            Copies go to
          </c:otherwise>
        </c:choose>
        <html:select property="<%=ReceiveTextbooksViaBarcodeListForm.FIELD_RETURN_PALLET_TYPE%>">
        <html:option value="-1">-- Select --</html:option>
        <html:option value="<%=String.valueOf(ReturnsSpecs.STATUS_COPY_REMOVED_STOCK)%>">Stock</html:option>
        <html:option value="<%=String.valueOf(ReturnsSpecs.STATUS_COPY_REMOVED_REBIND)%>">Rebind</html:option>
        <html:option value="<%=String.valueOf(ReturnsSpecs.STATUS_COPY_REMOVED_RECYCLED)%>">Recycle</html:option>
    </html:select>
    <br/>
    <br/>
<% } else { %>
    <html:hidden property="<%= ReceiveTextbooksViaBarcodeListForm.FIELD_RETURN_PALLET_TYPE%>" value="<%=String.valueOf(ReturnsSpecs.STATUS_COPY_REMOVED_STOCK)%>"/>
<% } %>
        <base:showHideTag  id="hideReceive">
        <base:genericButton onclick="hideElementhideReceive()" src="/buttons/large/receive.gif" name="<%= ReceiveTextbooksViaBarcodeListForm.BUTTON_RECEIVE %>" alt="Receive by barcode" />
        </base:showHideTag>
    </TD>
</TR>
</base:outlinedTableAndTabsWithinThere>
</base:form>

