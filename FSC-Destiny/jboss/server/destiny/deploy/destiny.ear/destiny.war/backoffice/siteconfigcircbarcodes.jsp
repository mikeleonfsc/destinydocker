<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.SiteConfigurationBaseForm" %> 

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<%
    SiteConfigurationBaseForm form = (SiteConfigurationBaseForm)request.getAttribute(SiteConfigurationBaseForm.FORM_NAME);
    int configMode = form.getConfigModeID();
%>



<html:hidden property="<%=SiteConfigurationBaseForm.FIELD_SYMBOLOGY_CHANGED%>" value=""/>   
<tr>
    <td width="100%">
        <table id="<%=SiteConfigurationBaseForm.TABLE_BARCODES%>" width="100%"> 
        <tr>
            <td colspan = "3" class="TableHeading" valign="top">&nbsp;<%=MessageHelper.formatMessage("siteconfigcircbarcodes_PreferredBarcodeSymbologies") %>&nbsp;<base:helpTag helpFileName="d_barcode_symbologies.htm"/></td>
        </tr>

        <tr>
            <td colspan = "3"><base:imageLine height="1" width="100%" /></td>
        </tr>
        <tr>
        <td colspan="3">
        <table id="<%=SiteConfigurationBaseForm.TABLE_BARCODES_DETAIL%>"> 
            <tr valign="bottom">
                <td colspan = "2">&nbsp;</td>
                <td class = "SmallColHeading"><%=MessageHelper.formatMessage("siteconfigcircbarcodes_TotalLength") %></td>
            </tr>                        
            <tr>
                <base:siteConfigSymbology formName="<%=SiteConfigurationBaseForm.FORM_NAME%>"
                    typeDescription='<%=MessageHelper.formatMessage("siteconfigcircbarcodes_LibraryMaterials") %>'
                    optionName="librarySymbologyCode"
                    option="<%=form.getLibrarySymbologyCode()%>"
                    childOptionName="librarySymbologyTotalLength"
                    childOption="<%=form.getLibrarySymbologyTotalLength()%>"
                    fixedCharacters=""
                    fixedCharactersName=""
                    districtMode="true"
                />
            </tr>
            <tr>
                <base:siteConfigSymbology formName="<%=SiteConfigurationBaseForm.FORM_NAME%>"
                    typeDescription='<%=MessageHelper.formatMessage("siteconfigcircbarcodes_Patrons") %>'
                    optionName="patronSymbologyCode"
                    option="<%=form.getPatronSymbologyCode()%>"
                    childOptionName="patronSymbologyTotalLength"
                    childOption="<%=form.getPatronSymbologyTotalLength()%>"
                    fixedCharacters=""
                    fixedCharactersName=""
                    districtMode="true"
                />
            </tr>            
            <% if (!UserContext.getMyContextLocaleHelper().isInternationalProduct()) { %>
            <tr>
                <base:siteConfigSymbology formName="<%=SiteConfigurationBaseForm.FORM_NAME%>"
                    typeDescription='<%=MessageHelper.formatMessage("siteconfigcircbarcodes_Textbooks") %>'
                    optionName="textbookSymbologyCode"
                    option="<%=form.getTextbookSymbologyCode()%>"
                    childOptionName="textbookSymbologyTotalLength"
                    childOption="<%=form.getTextbookSymbologyTotalLength()%>"
                    fixedCharacters=""
                    fixedCharactersName=""
                    districtMode="true"
                />
            </tr>
            <tr>
                <base:siteConfigSymbology formName="<%=SiteConfigurationBaseForm.FORM_NAME%>"
                    typeDescription='<%=MessageHelper.formatMessage("siteconfigcircbarcodes_Assets") %>'
                    optionName="assetSymbologyCode"
                    option="<%=form.getAssetSymbologyCode()%>"
                    childOptionName="assetSymbologyTotalLength"
                    childOption="<%=form.getAssetSymbologyTotalLength()%>"
                    fixedCharacters=""
                    fixedCharactersName=""
                    districtMode="true"
                    showClassicSymbologyOption="false"
                />
            </tr>
            <tr>
                <base:siteConfigSymbology formName="<%=SiteConfigurationBaseForm.FORM_NAME%>"
                    typeDescription='<%=MessageHelper.formatMessage("siteconfigcircbarcodes_Locations") %>'
                    optionName="locationSymbologyCode"
                    option="<%=form.getLocationSymbologyCode()%>"
                    childOptionName="locationSymbologyTotalLength"
                    childOption="<%=form.getLocationSymbologyTotalLength()%>"
                    fixedCharacters=""
                    fixedCharactersName=""
                    districtMode="true"
                    showClassicSymbologyOption="false"
                />
            </tr>
            <% } else { %>
                <html:hidden property="textbookSymbologyCode"/>
                <html:hidden property="assetSymbologyCode"/>
                <html:hidden property="locationSymbologyCode"/>
            <% } %>
         </table>
         </td>
         </tr>
        </table>
    </td>
</tr>    
