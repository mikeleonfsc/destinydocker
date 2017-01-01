<%@page import="com.follett.fsc.destiny.client.common.jsptag.BarcodeListTag"%>
<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.BarcodeListDropDownTag"%>
<%@page import="com.follett.fsc.destiny.util.Barcode"%>
<%@page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.AssetAddBarcodeListForm" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%-- @include file="/common/trapenter.jsp" --%>

<script language="JavaScript">
<!--    
    function trapEnter(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        return false;
      }
      return true;
    }
//-->
</script>

<base:messageBox strutsErrors="true"/>

<%
    AssetAddBarcodeListForm form = (AssetAddBarcodeListForm)request.getAttribute(AssetAddBarcodeListForm.FORM_NAME);


%>


<base:form action="/cataloging/servlet/handleassetaddbarcodelistform.do" focus="<%= AssetAddBarcodeListForm.FORM_NAME%>">

<html:hidden property="<%= AssetAddBarcodeListForm.PARAM_SITE_ID %>"/>
<html:hidden property="<%= AssetAddBarcodeListForm.PARAM_BIB_ID %>"/>
<html:hidden property="<%= AssetAddBarcodeListForm.PARAM_FORMATTED_TITLE %>"/>


<base:outlinedTable id="<%=AssetAddBarcodeListForm.TABLE_MAIN%>" borderColor="#C0C0C0">	
    <tr>
        <td width="100%">
            <table border="0" cellpadding="2" cellspacing="0" width="100%"
                id="<%=AssetAddBarcodeListForm.TABLE_BARCODES%>">

                <tr>
                    <td colspan="2"><%--
                 Don't do cellpadding here or else things will be off center
                 when either author or callnumber is empty.
            --%>
                    <table border="0" cellpadding="0" cellspacing="0"
                        align="center" id="<%=AssetAddBarcodeListForm.TABLE_HEADER%>">
                        <tr>
                            <td class="TableHeading" align="center" vAlign="top"
                                colspan="5"><!-- leave the image here, otherwise it drops the page too far down -->
                            <input type="image" src="/images/icons/general/spacer.gif"
                                width="1" height="1" border="0" alt=""
                                value="true"
                                name="<%=AssetAddBarcodeListForm.BUTTON_TRAP_ENTER_KEY%>">
                            <bean:write
                                name="<%=AssetAddBarcodeListForm.FORM_NAME%>"
                                property="<%=AssetAddBarcodeListForm.PARAM_FORMATTED_TITLE%>" /></td>
                        </tr>
                    </table>
                    </td>
                </tr>
                <tr>
                    <td colspan="2"><base:imageLine height="1" width="100%" /></td>
                </tr>
                
                

            	<tr>
                <td class="ColRowBold" align="right" valign="top" >
                <logic:equal name="<%=AssetAddBarcodeListForm.FORM_NAME%>" property="redemptionCode" value="false">
                    List of Barcodes
                </logic:equal>
                <logic:equal name="<%=AssetAddBarcodeListForm.FORM_NAME%>" property="redemptionCode" value="true">
                    List of Redemption Codes
                </logic:equal>
                </td>
                  <td nowrap valign="top">
                      <base:barcodeListDropDown 
                            barcodeFilteringOn="<%=form.isFilteringOn()%>" 
                            displayMode="<%=form.getMode()%>"
                            formName="<%=AssetAddBarcodeListForm.FORM_NAME%>"
                            barcodeType="<%=Barcode.BARCODETYPE_ASSET_ITEM%>"
                            collectionType="<%=CollectionType.ASSET %>"
                            />
                  </td>
            	</tr>
                </table>
            </td>
            <td>
             <table border="0" cellpadding="2" cellspacing="0" width="100%"
                id="<%=AssetAddBarcodeListForm.TABLE_BUTTONS%>">
                
                <tr>
                    <td valign="top">
                    <base:showHideTag id="onSave" classForText="ColRowBold"> 
                    <base:saveButton onclick="hideElementonSave()"
                        name="<%= AssetAddBarcodeListForm.BUTTON_SAVE_LIST %>" /> 
                      <br>
                    <base:cancelButton />
                    </base:showHideTag></td>
                
                </tr>
                </table>
            </td>
            
            </tr>
    
</base:outlinedTable>
</base:form>

    
