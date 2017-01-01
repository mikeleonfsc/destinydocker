<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>



<%
    BatchDeleteForm form = (BatchDeleteForm)request.getAttribute(BatchDeleteForm.FORM_NAME);
%>


<base:messageBox strutsErrors="true"/>
<base:form action="/cataloging/servlet/handlebatchdeleteform.do" enctype="multipart/form-data">

<base:outlinedTableAndTabsWithinThere  width="100%" id="<%=UpdateCopiesBaseForm.TABLE_MAIN%>"  borderColor="#C0C0C0" selectedTab="<%=BatchDeleteForm.ID_TAB_BATCH_DELETE%>" tabs="<%=form.getTabs()%>" >
<tr>
    <td>
        <table border="0" cellspacing="0" cellpadding="0" width="100%" id="<%=BatchDeleteForm.TABLE_HEADER%>">
            <tr>
                <td class="TableHeading" colspan="2"><%= MessageHelper.formatMessage("batchdeletecopies_DeleteEveryCopyInTheFile") %></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td valign="top">
                    <table border="0" cellpadding="3" cellspacing="0" width="97%" id="<%=BatchDeleteForm.TABLE_DELETE_OR_UPDATE_COPY_ACTION%>">
                        <% if (form.isDistrictCataloger() ) { %>
                        <tr>
                            <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("batchdeletecopies_From") %>&nbsp;</td>
                            <td>
                                <base:selectSite selectedSiteID="<%=form.getSelectedSiteForDistrict() %>" includeAllLibraries="true" includeLibrarySites="true" collectionType="<%=CollectionType.LIBRARY %>" name="<%=UpdateCopiesBaseForm.FIELD_SELECTED_SITE_FOR_DISTRICT%>" />
                            </td>
                        </tr>
                        <% } %>
	                    <base:isMediaSite showForMedia="false">
    	                        <logic:equal name="<%=BatchDeleteForm.FORM_NAME%>" property="productModeBoth" value="true">
    	                        <tr>
    	                            <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("batchdeletecopies_FileContains") %></td>
    	                            <td class="ColRowBold">
    	                                <logic:equal name="<%=BatchDeleteForm.FORM_NAME%>" property="displayDropdown" value="true">
    	                                    <bean:define id="deleteOptions" name="<%= BatchDeleteForm.FORM_NAME %>" property="deleteOptions"/>
    	                                    <html:select property="<%= BatchDeleteForm.FIELD_DELETE_FROM %>">
    	                                        <html:options collection="deleteOptions" property="longID" labelProperty="stringDesc"/>
    	                                    </html:select>
    	                                </logic:equal>
    	    
    	                                <logic:equal name="<%=BatchDeleteForm.FORM_NAME%>" property="displayDropdown" value="false">
    	                                    <html:hidden property="deleteFrom"/>
    	                                    &nbsp;<bean:write name="<%=BatchDeleteForm.FORM_NAME%>" property="deleteFromDisplayable"/>
    	                                </logic:equal>
    	                            </td>
    	                        </tr>
    	                        </logic:equal>
	                        <logic:equal name="<%=BatchDeleteForm.FORM_NAME%>" property="productModeBoth" value="false">
	                            <html:hidden property="deleteFrom"/>
	                        </logic:equal>
	                    </base:isMediaSite>
	                    <base:isMediaSite showForMedia="true">                    
	                        <html:hidden property="deleteFrom" value='<%=""+BatchDeleteForm.DELETE_FROM_LIBARY%>'/>
	                    </base:isMediaSite>
	
	                    <tr>
	                        <td class="ColRowBold tdAlignRight"><nobr><%= MessageHelper.formatMessage("batchdeletecopies_UploadFile") %></nobr></td>
	                        <td class="ColRowBold"><html:file property="<%=BatchDeleteForm.FIELD_UPLOAD_FILE%>" size="40"/></td>
	                    </tr>
			            <tr>
			            	<td>&nbsp;
			            	</td>
					        <td class="ColRowBold">
					       		<html:checkbox property="<%=BatchDeleteForm.FIELD_TRACK_AS_WEEDED%>"/><%= MessageHelper.formatMessage("batchdeletecopies_TrackAsWeeded") %></td>
						</tr>                       
					</table>
                </td>
            </tr>
         
            <tr valign="top">
                <td valign="top" colspan="2" align="center" class="ColRowBold"><%= MessageHelper.formatMessage("batchdeletecopies_AllCopiesInTheUploadedFileWillBeDeletedRegardless") %><br>
                    <%= GenericForm.getLastBackupDisplayMsg(true) %>
                </td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRowBold" colspan="2">
                    <base:showHideTag id="hideIt">
                    <base:genericButton onclick="hideElementhideIt()" name="<%=BatchDeleteForm.ID_BUTTON_UPDATE_COPIES%>" alt='<%=MessageHelper.formatMessage("update")%>' src="/buttons/large/updatecopies.gif"/>
                    </base:showHideTag >
                </td>
            </tr>
        </table>

    </td>
</tr>
</base:outlinedTableAndTabsWithinThere>
</base:form>

<jsp:include page="/circulation/setsound.jsp"/>
<logic:present name="<%=BatchDeleteForm.FORM_NAME%>" property="soundFile" scope="request" >
<script language="JavaScript">
<!--
setSound("<bean:write name="<%=BatchDeleteForm.FORM_NAME%>" property="soundFile"/>");
//-->
 </script>
</logic:present>
