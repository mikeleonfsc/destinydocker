<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.PatronSpecs" %>

<script type="text/javascript">
    function uncheckAuthor() {
        document.<%=ImportSiteForm.FORM_NAME%>.<%=ImportSiteForm.FIELD_MATCHING_IGNORE_AUTHOR%>.checked = false;
    }

    function selectStrict() {
        document.<%=ImportSiteForm.FORM_NAME%>.<%=ImportSiteForm.FIELD_MATCHING_LIBRARY_RULES%>[0].click();
    }
</script>

<bean:define id="siteIDs" name="<%=ImportSiteForm.FORM_NAME%>" property="siteIDList"/>
<bean:define id="districtIDOptions" name="<%=ImportSiteForm.FORM_NAME%>" property="districtIDOptions"/>

<base:messageBox strutsErrors="true"/>
<%
    ImportSiteForm form = (ImportSiteForm)request.getAttribute(ImportSiteForm.FORM_NAME);
%>

<base:form action="/district/servlet/handleimportsiteform.do" enctype="multipart/form-data" method="post">
<logic:equal name="<%= ImportSiteForm.FORM_NAME %>" property="<%=ImportSiteForm.PARM_CONFIRM_IMPORT_MESSAGE%>" value="false">
    <input type="hidden" name="<%=ImportSiteForm.PARM_CONFIRM_IMPORT_MESSAGE%>" value="true"/>
   <base:messageBox showRedBorder="true">
       <tr valign="center">
           <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
           <td class="ColRowBold">
                You have selected to require District ID's for patron records.<br><br>
                If any incoming patrons in this site import do not have a unique district 
                identifier, you may experience a severe loss of data during this import. 
                Patrons without a unique district identifier will be skipped. All statistics, 
                holds, fines and checkouts for patrons that are skipped will be lost. 
                All copies checked out to skipped patrons will also be marked as lost.<br><br> 
                Either verify that all incoming patron records contain a unique district 
                identifier or turn off the District ID requirement before importing this site.<br><br> 
                Do you want to continue with the site import?<br> 
           </td>
       </tr>
       <tr>
            <td>&nbsp;</td>
            <td valign="baseline" align="center" class="ColRow">
                <base:yesNo buttonYesName="<%=ImportSiteForm.BUTTON_CONFIRM_IMPORT%>" buttonNoName="<%=ImportSiteForm.BUTTON_CANCEL_IMPORT%>"/>
            </td>
       </tr>
   </base:messageBox>
 </logic:equal>
<logic:equal name="<%= ImportSiteForm.FORM_NAME %>" property="<%=ImportSiteForm.PARM_CONFIRM_IMPORT_MESSAGE%>" value="true">
    <input type="hidden" name="<%=ImportSiteForm.BUTTON_CHANGE_SUBMIT%>" value="false"/>
    <html:hidden property="importNewSite"/>
    <input type="hidden" name="<%=ImportSiteForm.PARM_CONFIRM_IMPORT_MESSAGE%>" value="true"/>
    <base:outlinedTableAndTabsWithinThere width="97%" id="<%=ImportSiteForm.TABLE_SITE_IMPORT_TABS%>" borderColor='#C0C0C0' tabs="<%=form.getTabs()%>" selectedTab="<%=form.getSelectedTab()%>">
        <tr><td>
        <table border="0" cellspacing="0" cellpadding="3" align="center">
            <tr>
                <td class="TableHeading">
                    <%=form.getImportHeadingText()%>
                </td>
            </tr>
            <tr>
                <td>
                    <base:outlinedTable borderColor="#c0c0c0" id="siteTable" width="100%">
                        <logic:equal name="<%=ImportSiteForm.FORM_NAME%>" property="importNewSite" value="true">
                            <tr>
                                <td class="FormLabel tdAlignRight">
                                    Site&nbsp;Type
                                </td>
                                <td>
                                    <base:selectSiteType name="<%=form.FIELD_SITE_TYPE_ID%>" selectedSiteTypeID="<%=form.getSiteTypeID()%>"  mode="<%=LookupSpecs.MODE_EDIT%>" includeForMediaSites="false" includeForLibrarySites="true" includeForTextbookSites="true" includeForAssetSites="false"/>
                                </td>
                            </tr>
                        </logic:equal>
                        <logic:equal name="<%=ImportSiteForm.FORM_NAME%>" property="importNewSite" value="false">
                            <logic:equal name="<%=ImportSiteForm.FORM_NAME%>" property="siteListEmpty" value="false">
                            <tr>
                                <td class="FormLabel tdAlignRight">
                                    Site&nbsp;Name
                                </td>
                                <td>
                                <html:select property="<%=ImportSiteForm.FIELD_SELECT_SITE%>" onchange="submitDropDown()">
                                    <html:options collection="siteIDs" property="longID" labelProperty="stringDesc"/>
                                </html:select>
                                </td>
                            </tr>
                            <tr>
                                <td class="FormLabel tdAlignRight">
                                    Import&nbsp;Type
                                </td>
                                <td class="ColRow">
                                    <bean:write name="<%=ImportSiteForm.FORM_NAME%>" property="importTypeDescription" /><%= !form.isTextbookManagerAllowed() ? " *" : ""  %>
                                </td>
                            </tr>
                            </logic:equal>
                            <logic:equal name="<%=ImportSiteForm.FORM_NAME%>" property="siteListEmpty" value="true">
                            <tr>
                                <td class="FormLabel tdAlignRight">
                                    Import&nbsp;Type
                                </td>
                                <td class="ColRow">
                                    No sites available for import.<%= !form.isTextbookManagerAllowed() ? " *" : ""  %>
                                </td>
                            </tr>
                            </logic:equal>
                            <logic:equal name="<%=ImportSiteForm.FORM_NAME%>" property="<%=ImportSiteForm.PARM_TEXTBOOK_MANAGER_ALLOWED%>" value="false">
                                <tr>
                                <td colspan="2" class="Instruction">
                                    &nbsp;&nbsp;&nbsp;&nbsp;* Unable to add Textbook Manager. Textbook Resources already exist.
                                </td>
                                </tr>
                            </logic:equal>
                        </logic:equal>
                        <logic:equal name="<%=ImportSiteForm.FORM_NAME%>" property="districtIDRequired" value="true">
                        <tr>
                            <td class="ColRow tdAlignRight">
                                Copy
                            </td>
                            <td class="ColRow">
                                <html:select property="<%=ImportSiteForm.FIELD_MOVE_DISTRICT_ID%>" >
                                    <html:options collection="districtIDOptions" property="longID" labelProperty="stringDesc"/>
                                </html:select> to <%=PatronSpecs.getDistrictIDPrompt() %>
                            </td>
                        </tr>
                        </logic:equal>
                        
                        
                        
                        <%-- start library matching--%>
                        <% if(form.isShowLibraryMatching() ) { %>
                               
                        <tr>
                            <td colspan="2"> <base:imageLine/></td>
                        </tr>
                        <tr>
                            <td class="FormLabel tdAlignRight">
                                Library Title Matching
                            </td>
                            <td>
                               &nbsp;
                            </td>
                        </tr>
                        <tr>
                            <td>&nbsp;</td>
                            <td class="ColRow">
                                <html:radio property="<%=ImportSiteForm.FIELD_MATCHING_LIBRARY_RULES%>" value="false"/>
                                <b>Strict</b> - Standard numbers, titles, material types, authors, and publication dates must match
                            </td>
                        </tr>
                        <tr>
                            <td>&nbsp;</td>
                            <td class="ColRow">
                                &nbsp;&nbsp;&nbsp;
                                <html:checkbox property="<%=ImportSiteForm.FIELD_MATCHING_IGNORE_AUTHOR%>" onclick="selectStrict()"/>
                                &nbsp;Remove the author requirement from the strict matching rules
                            </td>
                        </tr>
                        <tr>
                            <td>&nbsp;</td>
                            <td class="ColRow">
                                <html:radio property="<%=ImportSiteForm.FIELD_MATCHING_LIBRARY_RULES%>" value="true" onclick="uncheckAuthor()"/>
                                <b>Relaxed</b> - If no standard number is found, allow matches based on title, material type, author, and publication date
                            </td>
                        </tr>
                        <tr>
                            <td>&nbsp;</td>
                            <td class="ColRowBold">
                                If an incoming title matches an existing title:
                            </td>
                        </tr>
                        <tr>
                            <td>&nbsp;</td>
                            <td class="ColRow">
                                <html:radio property="<%=ImportSiteForm.FIELD_SKIP_DUPLICATE_LIBRARY_TITLES%>" value="<%= ImportBibForm.VALUE_REPLACE_TITLE%>"/>
                                &nbsp;
                                Replace the existing title
                            </td>
                        </tr>
                        <tr>
                            <td>&nbsp;</td>
                            <td class="ColRow">
                                <html:radio property="<%=ImportSiteForm.FIELD_SKIP_DUPLICATE_LIBRARY_TITLES%>" value="<%= ImportBibForm.VALUE_SKIP_TITLE%>"/>
                                &nbsp;
                                Skip the incoming title
                            </td>
                        </tr>
                        <tr>
                             <td>&nbsp;</td>
                            <td class="ColRow">
                                <html:radio property="<%=ImportSiteForm.FIELD_SKIP_DUPLICATE_LIBRARY_TITLES%>" value="<%=ImportBibForm.VALUE_ALWAYS_ADD_TITLE%>"/>
                            &nbsp;
                            Always add the incoming title (may cause duplicate titles; Strict Matching will be used)
                        </tr>
                     <% } %>
                        
                        
                        <%-- start textbook matching--%>
                     <% if(form.isShowTextbookMatching()) { %>    
                        <tr>
                            <td colspan="2"> <base:imageLine/></td>
                        </tr>
                        <tr>
                            <td class="FormLabel tdAlignRight">
                                Textbook Title Matching<%= !form.isTextbookManagerAllowed() ? " *" : ""  %>
                            </td>
                            <td>
                               &nbsp;
                            </td>
                        </tr>
                           <% if(form.isTextbookManagerAllowed()) { %>
                            <tr>
                                <td>&nbsp;</td>
                                <td class="ColRow">
                                    <html:radio property="<%=ImportSiteForm.FIELD_MATCHING_TEXTBOOK_RULES%>" value="false"/>
                                    <b>Strict</b> - ISBNs, titles, material types, authors, and publication dates must match                            
                                </td>
                            </tr>
                            <tr>
                                <td>&nbsp;</td>
                                <td class="ColRow">
                                    <html:radio property="<%=ImportSiteForm.FIELD_MATCHING_TEXTBOOK_RULES%>" value="true"/>
                                    <b>Relaxed</b> - If no ISBN is found, allow matches based on title, material type, author, and publication date                            
                                </td>
                            </tr>
                            <tr>
                                <td>&nbsp;</td>
                                <td class="ColRowBold">
                                    If an incoming title matches an existing title:
                                </td>
                            </tr>
                            <tr>
                                <td>&nbsp;</td>
                                <td class="ColRow">
                                    <html:radio property="<%=ImportSiteForm.FIELD_SKIP_DUPLICATE_TEXTBOOK_TITLES%>" value="<%= ImportBibForm.VALUE_REPLACE_TITLE%>"/>
                                    &nbsp;
                                    Replace the existing title
                                </td>
                            </tr>
                            <tr>
                                <td>&nbsp;</td>
                                <td class="ColRow">
                                    <html:radio property="<%=ImportSiteForm.FIELD_SKIP_DUPLICATE_TEXTBOOK_TITLES%>" value="<%= ImportBibForm.VALUE_SKIP_TITLE%>"/>
                                    &nbsp;
                                    Skip the incoming title
                                </td>
                            </tr>
                            
                           <% } else { %>
                            <tr>
                                <td colspan="2" class="Instruction">
                                    &nbsp;&nbsp;&nbsp;&nbsp;* Unable to add Textbook Manager. Textbook Resources already exist.
                                </td>
                            </tr>
                           <% } %>
                       <% } %>
                        
                         <%-- start import file--%>
                         <tr>
                            <td colspan="2"> <base:imageLine/></td>
                        </tr>
                        <tr>
                            <td class="FormLabel tdAlignRight">
                                Site file to import
                            </td>
                            <td>
                                <html:file property="<%= ImportSiteForm.FIELD_UPLOAD_FILE %>"/>
                            </td>
                        </tr>
                        
                        
                    </base:outlinedTable>
                </td>
            </tr>
            <logic:equal name="<%=ImportSiteForm.FORM_NAME%>" property="importNewSiteMode" value="false">
                <logic:equal name="<%=ImportSiteForm.FORM_NAME%>" property="siteListEmpty" value="false">
                <tr>
                    <td align="center" class="ColRowBold">
    	                <base:showHideTag id="onImport">
                            <logic:equal name="<%=ImportSiteForm.FORM_NAME%>" property="showSubmitButton" value="true">
                                <base:genericButton src="/buttons/large/importsite2.gif" name="<%= ImportSiteForm.BUTTON_NAME_IMPORT %>" alt="Import" onclick="hideElementonImport()"/>
    		                    &nbsp;
                            </logic:equal>
    						<base:cancelButton/>
    	                </base:showHideTag>
                    </td>
                </tr>
                </logic:equal>
            </logic:equal>
            <logic:equal name="<%=ImportSiteForm.FORM_NAME%>" property="importNewSiteMode" value="true">
                <tr>
                    <td align="center" class="ColRowBold">
    	                <base:showHideTag id="onImport">
                            <logic:equal name="<%=ImportSiteForm.FORM_NAME%>" property="showSubmitButton" value="true">
                                <base:genericButton src="/buttons/large/importsite2.gif" name="<%= ImportSiteForm.BUTTON_NAME_IMPORT %>" alt="Import" onclick="hideElementonImport()"/>
    	                        &nbsp;
                            </logic:equal>
    						<base:cancelButton/>
    	                </base:showHideTag>
                    </td>
                </tr>
            </logic:equal>
        </table>
        </td></tr>
    </base:outlinedTableAndTabsWithinThere>
</logic:equal>

</base:form>

<script language="javascript">
<!--
function submitDropDown() {
        document.<%=ImportSiteForm.FORM_NAME%>.<%=ImportSiteForm.BUTTON_CHANGE_SUBMIT%>.value = "true";
        document.<%=ImportSiteForm.FORM_NAME%>.submit();
}
// -->
</script>
