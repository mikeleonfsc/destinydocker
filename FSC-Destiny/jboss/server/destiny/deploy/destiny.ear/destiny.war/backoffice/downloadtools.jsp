<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.DownloadToolsForm"%>
<%@page import="com.follett.fsc.destiny.client.common.CommandLineToolsDownloader"%>
<%@page import="com.follett.fsc.destiny.util.Permission"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.destiny.util.FollettEBookSpecs"%>

<%
   DownloadToolsForm form = (DownloadToolsForm)request.getAttribute(DownloadToolsForm.FORM_NAME); 
%>






<base:messageBox strutsErrors="true"/>
<base:outlinedTable id="<%=DownloadToolsForm.TABLE_MAIN%>" borderColor='#C0C0C0' width="98%" cellpadding="5" cellspacing="0">
    <base:isMacBrowser>
        <tr>
            <base:sectionHeading tdContent="width='100%' valign='top'" heading="Patrons"/>
        </tr>
        <tr>
            <td class="ColRow">
            <%=MessageHelper.formatMessage("downloadtools_PatronImportConverter")%> -
            <base:link href='<%="/CommandLineToolsDownloader?" + CommandLineToolsDownloader.PARAM_ZIP_CONTENT + "=" + CommandLineToolsDownloader.DOWNLOAD_PATRON_IMPORT_CONVERTER_MAC %>' target="_blank">
                <base:image src="/buttons/small/download.gif" align="absbottom" alt='<%=MessageHelper.formatMessage("downloadtools_download")%>'/></base:link>
            <base:helpTag helpFileName="d_downloads_patron_import_converter.htm" />                    
            </td>
        </tr>
    </base:isMacBrowser>
    <base:isNotMacBrowser>
        <base:spanIfAllowed permission="<%= Permission.CAT_IMPORT_ASSET_ITEMS%>">
            <tr>
                <base:sectionHeading tdContent="width='100%' valign='top'" heading="Resources"/>
            </tr>
            
            <tr>
                <td class="ColRow">
                     <%=MessageHelper.formatMessage("downloadtools_AssetImportConverter") %> -
                    <base:link href='<%="/CommandLineToolsDownloader?" + CommandLineToolsDownloader.PARAM_ZIP_CONTENT + "=" + CommandLineToolsDownloader.DOWNLOAD_ASSET_IMPORT_CONVERTER %>' target="_blank">
                    <base:image src="/buttons/small/download.gif" align="absbottom" alt='<%=MessageHelper.formatMessage("downloadtools_download")%>'/>
                    </base:link>
                    <base:helpTag helpFileName="d_downloads_asset_import_converter.htm" />
                </td>
            </tr>
            <%--
             <tr>
                <td class="ColRow"><base:link href='<%="/CommandLineToolsDownloader?" + CommandLineToolsDownloader.PARAM_ZIP_CONTENT + "=" + CommandLineToolsDownloader.DOWNLOAD_EXPORT_ASSET %>' target="_blank">
                    <base:image src="/buttons/small/download.gif" align="absbottom" alt='<%=MessageHelper.formatMessage("downloadtools_download")%>'/></base:link> - Export Asset
                </td>
            </tr>
             --%>
            
             <tr>
                <td class="ColRow">
                <%=MessageHelper.formatMessage("downloadtools_ImportAsset") %> - <base:link href='<%="/CommandLineToolsDownloader?" + CommandLineToolsDownloader.PARAM_ZIP_CONTENT + "=" + CommandLineToolsDownloader.DOWNLOAD_IMPORT_ASSET %>' target="_blank">
                    <base:image src="/buttons/small/download.gif" align="absbottom" alt='<%=MessageHelper.formatMessage("downloadtools_download")%>'/></base:link>
                <base:helpTag helpFileName="d_downloads_import_asset.htm" />                      
                </td>
            </tr>
            
        </base:spanIfAllowed>
        
        
        <base:spanIfAllowed permission="<%= Permission.BACK_OFFICE_UPDATE_PATRONS%>">
            <tr>
                <base:sectionHeading tdContent="width='100%' valign='top'" heading="Patrons"/>
            </tr>
        
            <tr>
                <td class="ColRow">
                <%=MessageHelper.formatMessage("downloadtools_PatronImportConverter")%> -
                <base:link href='<%="/CommandLineToolsDownloader?" + CommandLineToolsDownloader.PARAM_ZIP_CONTENT + "=" + CommandLineToolsDownloader.DOWNLOAD_PATRON_IMPORT_CONVERTER %>' target="_blank">
                    <base:image src="/buttons/small/download.gif" align="absbottom" alt='<%=MessageHelper.formatMessage("downloadtools_download")%>'/></base:link>
                <base:helpTag helpFileName="d_downloads_patron_import_converter.htm" />                    
                </td>
            </tr>
        
            <tr>
                <td class="ColRow">
                <%=MessageHelper.formatMessage("downloadtools_UpdatePatrons")%> - 
                <base:link href='<%="/CommandLineToolsDownloader?" + CommandLineToolsDownloader.PARAM_ZIP_CONTENT + "=" + CommandLineToolsDownloader.DOWNLOAD_UPDATE_PATRONS %>' target="_blank">
                    <base:image src="/buttons/small/download.gif" align="absbottom" alt='<%=MessageHelper.formatMessage("downloadtools_download")%>'/></base:link>
                <base:helpTag helpFileName="d_downloads_update_patrons.htm" />                    
                </td>
            </tr>
        </base:spanIfAllowed>
        
        
        
        <base:spanIfAllowed permission="<%= Permission.BACK_OFFICE_AED_CLASSES%>">
            <tr>
                <base:sectionHeading tdContent="width='100%' valign='top'" heading="Textbooks"/>
            </tr>
            
            <tr>
                <td class="ColRow">
                <%=MessageHelper.formatMessage("downloadtools_ClassImportConverter") %> -
                <base:link href='<%="/CommandLineToolsDownloader?" + CommandLineToolsDownloader.PARAM_ZIP_CONTENT + "=" + CommandLineToolsDownloader.DOWNLOAD_CLASS_IMPORT_CONVERTER %>' target="_blank">
                    <base:image src="/buttons/small/download.gif" align="absbottom" alt='<%=MessageHelper.formatMessage("downloadtools_download")%>'/></base:link>
                <base:helpTag helpFileName="d_downloads_class_import_converter.htm" />                    
                </td>
            </tr>
        
            <tr>
                <td class="ColRow">
                <%=MessageHelper.formatMessage("downloadtools_TextbookTransfer")%> - 
                <base:link href='<%="/CommandLineToolsDownloader?" + CommandLineToolsDownloader.PARAM_ZIP_CONTENT + "=" + CommandLineToolsDownloader.DOWNLOAD_TEXTBOOK_TRANSFER %>' target="_blank">
                    <base:image src="/buttons/small/download.gif" align="absbottom" alt='<%=MessageHelper.formatMessage("downloadtools_download")%>'/></base:link>
                <base:helpTag helpFileName="d_downloads_textbook_transfer.htm" />
                </td>
            </tr>
            
            <tr>
                <td class="ColRow">
                <%=MessageHelper.formatMessage("downloadtools_UpdateClasses")%> - 
                <base:link href='<%="/CommandLineToolsDownloader?" + CommandLineToolsDownloader.PARAM_ZIP_CONTENT + "=" + CommandLineToolsDownloader.DOWNLOAD_UPDATE_CLASSES %>' target="_blank">
                    <base:image src="/buttons/small/download.gif" align="absbottom" alt='<%=MessageHelper.formatMessage("downloadtools_download")%>'/></base:link>
                <base:helpTag helpFileName="d_downloads_update_classes.htm" />                    
                </td>
            </tr>
        </base:spanIfAllowed>
    </base:isNotMacBrowser>        
</base:outlinedTable>
