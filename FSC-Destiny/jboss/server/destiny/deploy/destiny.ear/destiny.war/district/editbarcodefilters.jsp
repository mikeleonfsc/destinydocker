<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.EditBarcodeFiltersForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    EditBarcodeFiltersForm form = (EditBarcodeFiltersForm)request.getAttribute(EditBarcodeFiltersForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true"/>

<base:form action="/district/servlet/handleeditbarcodefiltersform.do" method="post">
    <html:hidden property="siteID" />
    <html:hidden property="collectionTypeToEdit" />
    <br>
    <logic:present name="<%= EditBarcodeFiltersForm.FORM_NAME %>" property="<%= EditBarcodeFiltersForm.PARAM_COLLECTION_TYPE_TO_RESTORE %>">

        <base:messageBox showRedBorder="true">
            <tr valign="top">
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td class="ColRowBold">
                    The previous barcode filter appears below but has not yet been saved.
                </td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td valign="baseline" align="center" class="ColRowBold">
                Please verify that the filter is correct and then click Save to retain this change.
                </td>
            </tr>
        </base:messageBox>
    </logic:present>    
    
    
<table border="0" cellspacing="0" cellpadding="3" align="center" width="90%">
   <tr>
      <td width="100%" align="center">

    <base:outlinedTable borderColor="#c0c0c0" id="<%=EditBarcodeFiltersForm.TABLE_MAIN %>" width="50%">

         <tr valign="top">
            <td class="TableHeading" colspan="2">
                Edit Barcode Reconstruction Filters...
            </td>
        </tr>
          <tr valign="top">
            <td class="ColRowBold" colspan="2">Please note that modifying the barcode filter will reset the Percentage Verified for <%= form.getProductName() %> to zero.</td>
        </tr>
        
        
         
        <tr>
            <td>
                <textarea name="<%= EditBarcodeFiltersForm.FIELD_BARCODE_FILTER %>" wrap=off rows="10" cols="50"><%= form.getBarcodeFilter() %></textarea>
            </td>
            <td valign="top" class="ColRowBold tdAlignRight">
                <base:showHideTag id="onSave">
                    <base:saveButton onclick="hideElementonSave()" name="<%= EditBarcodeFiltersForm.BUTTON_SAVE%>"/><br>
                    <base:cancelButton /><br>
                    <base:genericButton src="/buttons/large/restore.gif" onclick="hideElementonSave()" name="<%= EditBarcodeFiltersForm.BUTTON_RESTORE%>" alt="<%= EditBarcodeFiltersForm.ALT_TEXT_RESTORE%>"/>
                </base:showHideTag>    
            </td>
        </tr>        
            
    </base:outlinedTable>
        </td>
    </tr>
</table>
</base:form>
