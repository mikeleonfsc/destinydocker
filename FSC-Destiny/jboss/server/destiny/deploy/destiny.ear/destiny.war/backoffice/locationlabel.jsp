
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.LocationLabelForm" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.BaseLabelForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<bean:define id="stocks" name="<%= LocationLabelForm.FORM_NAME %>" property="stockList"/>
<bean:define id="fromList" name="<%= LocationLabelForm.FORM_NAME %>" property="fromList"/>
<bean:define id="toList" name="<%= LocationLabelForm.FORM_NAME %>" property="toList"/>

<base:messageBox strutsErrors="true"/>

<%
    LocationLabelForm form = (LocationLabelForm)request.getAttribute(LocationLabelForm.FORM_NAME);
%>

<base:form action="/backoffice/servlet/handlelocationlabelform.do">
<html:hidden property="districtUser"/>

<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=BaseLabelForm.BUTTON_TRAP_ENTER%>">
<table id="<%=LocationLabelForm.TABLE_MAIN%>" cellpadding="0" cellspacing="0" width="95%">
 <tr>
 <td width="100%">
<base:outlinedTable id="<%=LocationLabelForm.TABLE_LOCATION_LABEL%>" borderColor='#C0C0C0' width="100%">
    <tr>
        <td class="TableHeading" >
            Print Location barcodes...
        </td>
        <td>
            &nbsp;
        </td>
    </tr>
    <logic:equal name="backoffice_servlet_LocationLabelForm" property="districtUser" value="true" scope="request" >
    <tr>
        <td class="ColRowBold tdAlignRight" nowrap>
        For
        </td>
        <td nowrap>
        <base:selectSite 
            name='<%= BaseLabelForm.FIELD_SITE_ID %>' 
            selectedSiteID='<%=form.getSiteID().toString() %>' 
            submitOnChange="true" 
            includeAllLibraries='false'
            includeLibrarySites="false"
            includeTextbookSites="false"
            includeMediaSites="false"
            mode="<%=SelectSiteTag.MODE_MEDIA%>"
            includeAssetSites="true"
            />
        </td>
    </tr>
    </logic:equal>
    <logic:equal name="backoffice_servlet_LocationLabelForm" property="districtUser" value="false" scope="request" >
        <html:hidden property="siteID"/>
    </logic:equal>
    <tr>
        <td class ="ColRowBold tdAlignRight" nowrap>
            Select by Location
        </td>
        <td class="ColRow" nowrap>
            From
            <html:select property="<%= LocationLabelForm.FIELD_LOCATION_SELECT_FROM %>">
                <html:options collection="fromList" property="longID"
                              labelProperty="stringDesc"/>
            </html:select> 
            &nbsp;to&nbsp;
            <html:select property="<%= LocationLabelForm.FIELD_LOCATION_SELECT_TO %>">
                <html:options collection="toList" property="longID"
                              labelProperty="stringDesc"/>
            </html:select> 
        </td>
    <tr>
        <td class ="ColRowBold tdAlignRight" nowrap>
            Format for
        </td>
        <td colspan="5" class="ColRow">
            <html:radio property="<%=LocationLabelForm.FIELD_FORMATTED_FOR%>" value="<%=LocationLabelForm.OPTION_BARCODE_LABELS%>">Barcode labels</html:radio>
        </td>
    </tr>
    <tr>
        <td>
            &nbsp;
        </td>
        <td class="ColRow" nowrap>
            &nbsp;&nbsp;&nbsp;&nbsp;Use label stock
            <html:select property="<%= BaseLabelForm.FIELD_LABEL_STOCK %>">
                <html:options collection="stocks" property="stringCode"
                              labelProperty="stringDesc"/>
            </html:select>
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td class="ColRow" nowrap>
            &nbsp;&nbsp;&nbsp;&nbsp;Start on label
            <html:text property="<%= BaseLabelForm.FIELD_LABEL_START %>" maxlength="3" size="4"/>
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td class="ColRow" nowrap>
            &nbsp;&nbsp;&nbsp;&nbsp;Printer offset -
            Horizontal:&nbsp;<html:text property="<%= BaseLabelForm.FIELD_HORIZONTAL_OFFSET %>" maxlength="4" size="4"/>
            &nbsp;&nbsp;&nbsp;Vertical:&nbsp;
            <html:text property="<%= BaseLabelForm.FIELD_VERTICAL_OFFSET %>" maxlength="4" size="4"/>
        </td>
    </tr>
        <td class ="ColRowBold tdAlignRight" nowrap>
            &nbsp;
        </td>
        <td colspan="5" class="ColRow">
            <html:radio property="<%=LocationLabelForm.FIELD_FORMATTED_FOR%>" value="<%=LocationLabelForm.OPTION_PAPER %>">8.5" x 11" paper</html:radio>
        </td>
    <tr>
        <td colspan="2" align="center" class="ColRowBold">
            <base:reportButton/>
        </td>
    </tr>

</base:outlinedTable>
</td>
</tr>
</table>
</base:form>
