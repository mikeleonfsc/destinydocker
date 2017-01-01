<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.session.cataloging.remote.data.ExportJobParameters" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.util.Barcode" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>
<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request); 
	ExportBibForm form = (ExportBibForm) request.getAttribute(ExportBibForm.FORM_NAME);
%>

<base:form action="/cataloging/servlet/handleexportbibform.do" enctype="multipart/form-data">

    <html:hidden property="<%=ExportBibForm.ATTRIBUTE_SHOW_DELETE_CONFIRMATION%>"/>
    <html:hidden property="<%=ExportBibForm.PARAM_MODE%>"/>
    <html:hidden property="fileLocation"/>
    
    <logic:equal name="<%= ExportBibForm.FORM_NAME %>" property="<%=ExportBibForm.ATTRIBUTE_SHOW_DELETE_CONFIRMATION%>" value="true">
<%
    String messageText = ExportBibForm.LIBRARY_MODE.equals(form.getMode()) ? 
            MessageHelper.formatMessage("exportbib_YouHaveChosenToDelete") : 
            "You have chosen to delete the exported textbooks" + (form.isIncludeCopyInfo() ? ", copies" : "") + " and supplements. All textbooks, copies and supplements that are exported will be deleted.";
    String collectionTypeVerbage = 
        ExportBibForm.LIBRARY_MODE.equals(form.getMode()) ? 
            "titles and copies" : 
            "textbooks" + (form.isIncludeCopyInfo() ? ", copies" : "") + " and supplements";
%>
        <base:messageBox showWarningIcon="true" message='<%=messageText +
            "<br><br>" +
            (form.isIncludeCopyInfo() ? "" :
                "NOTE: Since copy information is excluded, only titles without copies will be deleted.<br><br>") +
            GenericForm.getLastBackupDisplayMsg(true) +
            "<br><br>" + 
            MessageHelper.formatMessage("exportbib_DoYouWantToContinue")%>' filterMessage="false">
            <tr>
                <td valign="baseline" align="center" class="ColRowBold" colspan="2">
                    <base:showHideTag id="confirmDelete">
                        <html:submit property="<%=ExportBibForm.BUTTON_YES%>" onclick="hideElementconfirmDelete()"><%= MessageHelper.formatMessage("exportbib_Yes") %></html:submit>
                        <html:submit property="<%=ExportBibForm.BUTTON_NO%>"><%= MessageHelper.formatMessage("exportbib_No") %></html:submit>
                    </base:showHideTag>
                </td>
            </tr>
        </base:messageBox>
    </logic:equal>

    <base:outlinedTable id="<%=ExportBibForm.TABLE_OUTLINE_EXPORT_BIB%>" borderColor="#c0c0c0">
        <tr valign="top">
            <td class="TableHeading" colspan="2">
            <logic:equal name="<%=ExportBibForm.FORM_NAME %>" property="<%=ExportBibForm.PARAM_MODE%>" value="<%=ExportBibForm.LIBRARY_MODE%>"><%= MessageHelper.formatMessage("exportbib_ExportTitles") %></logic:equal>
            <logic:equal name="<%=ExportBibForm.FORM_NAME %>" property="<%=ExportBibForm.PARAM_MODE%>" value="<%=ExportBibForm.TEXTBOOK_MODE%>"><%= MessageHelper.formatMessage("exportbib_ExportTextbooks") %></logic:equal>
            </td>
        </tr>
        <tr>
        	<td nowrap><base:imageSpacer width="30" height="1"/></td>
        	<td>
        		<table id="<%=ExportBibForm.TABLE_SUB_MAIN%>">
	    			<logic:equal name="<%=ExportBibForm.FORM_NAME %>" property="<%=ExportBibForm.FIELD_DISTRICT_USER %>" value="true" scope="request" >        		
        			<tr>
                        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("exportbib_From") %></td>
        				<td nowrap class="ColRow">
        	    			<% if ( form.getExportType() != ExportJobParameters.EXPORT_TYPE_MYLIST && !store.isStateContext()) { %>        		
    	        				<base:selectSite 
    	        				    name="<%= ExportBibForm.FIELD_SITE_ID %>" 
    	        				    selectedSiteID="<%= form.getSiteID().toString() %>" 
    	        				    includeAllLibraries="true" 
    	        				    submitOnChange="true"
    	        				    includeLibrarySites='<%= ExportBibForm.LIBRARY_MODE.equals(form.getMode()) %>'
            			            includeTextbookSites='<%= ExportBibForm.TEXTBOOK_MODE.equals(form.getMode()) %>'
            			            includeMediaSites='<%= store.isMediaBookingUser() %>'
            			            includeAssetSites="false"
    	        				    />
    	        		    <% } else { %>
	        		            <html:hidden property="<%= ExportBibForm.FIELD_SITE_ID %>" value="0"/>
    	        		        <%=ResponseUtils.filter(store.getDistrictName())%>
    	        		    <% } %></td>
	        		</tr>
	        		<tr>
        				<td colspan="2">&nbsp;
        				</td>
        			</tr>
	        		</logic:equal>   
	        		    		
        			<tr>
                        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("exportbib_Select") %></td>
        				<td nowrap class="ColRowBold">
                            <bean:define id="exportTypeInfo" name="<%= ExportBibForm.FORM_NAME %>" property="<%=ExportBibForm.FIELD_EXPORT_TYPE_LIST%>"/>
                            <html:select property="<%= ExportBibForm.FIELD_EXPORT_TYPE %>" onchange="submit()">
                                <html:options collection="exportTypeInfo" property="longID" labelProperty="stringDesc"/>
                            </html:select>
                            
                            <logic:equal name="<%=ExportBibForm.FORM_NAME %>" property="<%= ExportBibForm.FIELD_EXPORT_TYPE %>" value='<%= "" + ExportJobParameters.EXPORT_TYPE_MYLIST %>'>
                            &nbsp;
                            <base:myListSelect 
                                name="<%=ExportBibForm.FIELD_SELECTED_LISTID%>" 
                                selectedMyListID="<%=form.getSelectedListID() %>" 
                                prompt="" 
                                publicList="false" 
                                submitOnChange="false" />
                            </logic:equal>
                            <logic:notEqual name="<%=ExportBibForm.FORM_NAME%>" property="<%=ExportBibForm.FIELD_EXPORT_TYPE%>" value='<%= "" +ExportJobParameters.EXPORT_TYPE_MYLIST%>'>
                               <html:hidden name="<%=ExportBibForm.FORM_NAME%>" property="<%=ExportBibForm.FIELD_SELECTED_LISTID%>"/>
                            </logic:notEqual>
                            
                            
                            
                             <%-- PUT MY CATEGORY COMBO HERE IF selector is by myCategory --%>
                            <logic:equal name="<%=ExportBibForm.FORM_NAME %>" property="<%= ExportBibForm.FIELD_EXPORT_TYPE %>" value='<%= "" + ExportJobParameters.EXPORT_TYPE_COPY_CATEGORY%>'>
                                <base:categorySelect name="<%= ExportBibForm.FIELD_SELECTED_CATEGORYID%>" siteID="<%= form.getSiteID() %>" collectionType="<%=form.getCollectionType()%>" selectedCategoryID="<%=form.getSelectedCategoryID()%>"/>
                                <input type="hidden" name="<%=ExportBibForm.FORM_NAME%>" value="<%=form.getSelectedCategoryID()%>"/>
                            </logic:equal>                
                            
	        			</td>
	        		</tr>

                    <logic:equal name="<%=ExportBibForm.FORM_NAME %>" property="<%= ExportBibForm.FIELD_EXPORT_TYPE %>" value='<%= "" + ExportJobParameters.EXPORT_TYPE_MYLIST %>'>
                    <tr>
                        <td>&nbsp;</td>
                        <td>
                           <base:genericButton src="/buttons/large/viewlist.gif" absbottom="true"
                               alt='<%= MessageHelper.formatMessage("viewList") %>'
                               name="<%= ExportBibForm.BUTTON_VIEW_LIST %>"/>
                        </td>   
                    </tr>
                    </logic:equal>

	    			<logic:equal name="<%=ExportBibForm.FORM_NAME %>" property="<%= ExportBibForm.FIELD_EXPORT_TYPE %>" value='<%= "" + ExportJobParameters.EXPORT_TYPE_BARCODE %>'>
	    			    <tr>
	    			        <td colspan="2">
	    			        <base:imageLine height="1" width="100%" />
	    			        </td>
	    			    </tr>
            			<tr>
                            <td class="ColRowBold tdAlignRight">&nbsp;</td>
            				<td nowrap>
                               <base:barcodeList barcodeType="<%=Barcode.BARCODETYPE_COPY %>" 
                                   formName="<%=ExportBibForm.FORM_NAME%>"/>
    	        			</td>
    	        		</tr>
	    			    <tr>
	    			        <td colspan="2">
	    			        <base:imageLine height="1" width="100%" />
	    			        </td>
	    			    </tr>
	        		</logic:equal>   

                    <logic:equal name="<%=ExportBibForm.FORM_NAME %>" property="<%=ExportBibForm.PARAM_MODE%>" value="<%=ExportBibForm.LIBRARY_MODE%>"> 
            			<tr>
                            <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("exportbib_Include") %></td>
            				<td nowrap class="ColRow">
                                <html:radio property="<%=ExportBibForm.FIELD_RECORD_TYPE%>" value="<%=ExportJobParameters.RECORD_TYPE_ALL%>"><%= MessageHelper.formatMessage("exportbib_AllRecords") %></html:radio>
    						</td>
            			</tr>
            			<tr>
                            <td class="ColRowBold tdAlignRight">&nbsp;</td>
            				<td nowrap class="ColRow">
                                <html:radio property="<%=ExportBibForm.FIELD_RECORD_TYPE%>" value="<%=ExportJobParameters.RECORD_TYPE_FULL%>"><%= MessageHelper.formatMessage("exportbib_FullRecordsOnly") %></html:radio>
    						</td>
            			</tr>
            			<tr>
                            <td class="ColRowBold tdAlignRight">&nbsp;</td>
            				<td nowrap class="ColRow">
                                <html:radio property="<%=ExportBibForm.FIELD_RECORD_TYPE%>" value="<%=ExportJobParameters.RECORD_TYPE_BRIEF%>"><%= MessageHelper.formatMessage("exportbib_BriefRecordsOnly") %></html:radio>
    						</td>
            			</tr>
            			<tr>
            				<td colspan="2">&nbsp;
            				</td>
            			</tr>
            			<tr>
                            <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("exportbib_Options") %></td>
            				<td nowrap class="ColRow">
                                <html:checkbox property="<%=ExportBibForm.FIELD_INCLUDE_COPY_INFO%>"><%= MessageHelper.formatMessage("exportbib_IncludeCopyInformation") %></html:checkbox>
    						</td>
            			</tr>
            			<logic:equal name="<%=ExportBibForm.FORM_NAME%>" property="<%=ExportBibForm.ATTRIBUTE_SHOW_DELETE_OPTION%>" value="true">
                			<tr>
                                <td class="ColRowBold tdAlignRight">&nbsp;</td>
                				<td nowrap class="ColRow">
                                    <html:checkbox property="<%=ExportBibForm.FIELD_DELETE_TITLES%>"><%= MessageHelper.formatMessage("exportbib_DeleteTitlesCopiesAfterExport") %></html:checkbox>
        						</td>
                			</tr>
                		</logic:equal>
                        <% if (!LocaleHelper.isInternationalProduct()) { %>
            			<tr>
            				<td colspan="2">&nbsp;
            				</td>
            			</tr>
            			<tr>
                                <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("exportbib_ExportFileFormat") %></td>
            				<td nowrap class="ColRow">
    							<html:radio property="<%=ExportBibForm.FIELD_FILE_FORMAT%>" value="<%=String.valueOf(ExportJobParameters.EXPORT_FILE_FORMAT_UTF8)%>">UTF-8</html:radio>
    						</td>
            			</tr>
            			<tr>
                                <td class="ColRowBold tdAlignRight">&nbsp;</td>
            				<td nowrap class="ColRow">
    							<html:radio property="<%=ExportBibForm.FIELD_FILE_FORMAT%>" value="<%=String.valueOf(ExportJobParameters.EXPORT_FILE_FORMAT_ANSEL)%>">ALA</html:radio>
    						</td>
            			</tr>
                        <% } else { %>
                            <html:hidden property="<%=ExportBibForm.FIELD_FILE_FORMAT%>"/>
                        <% } %>
                		
            		</logic:equal>
                    <logic:equal name="<%=ExportBibForm.FORM_NAME %>" property="<%=ExportBibForm.PARAM_MODE%>" value="<%=ExportBibForm.TEXTBOOK_MODE%>"> 
                        <tr>
                            <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("exportbib_Options") %></td>
                            <td nowrap class="ColRow">
                                <html:checkbox property="<%=ExportBibForm.FIELD_INCLUDE_COPY_INFO%>">Include copy information</html:checkbox>
                            </td>
                        </tr>
                        <logic:equal name="<%=ExportBibForm.FORM_NAME%>" property="<%=ExportBibForm.ATTRIBUTE_SHOW_DELETE_OPTION%>" value="true">
                            <tr>
                                <td class="ColRowBold tdAlignRight">&nbsp;</td>
                                <td nowrap class="ColRow">
                                    <html:checkbox property="<%=ExportBibForm.FIELD_DELETE_TITLES%>"><%= MessageHelper.formatMessage("exportbib_DeleteTitlesCopiesAfterExport") %></html:checkbox>
                                </td>
                            </tr>
                        </logic:equal>
                    </logic:equal>
        		</table>
        	</td>
        </tr>
        <tr>
            <td class="ColRow" colspan="2"><%= MessageHelper.formatMessage("exportbib_WhenTheProcessHasCompletedGoToTheJobManagerInThe") %></td>
        </tr>
        <tr>
            <td align="center" class="ColRowBold" colspan="2">
                <base:showHideTag id="hideIt">
                <base:genericButton onclick="hideElementhideIt()" src="/buttons/large/export.gif" name="<%= ExportBibForm.BUTTON_EXPORT %>" alt='<%= MessageHelper.formatMessage("export") %>'/>
                </base:showHideTag>
            </td>
        </tr>
    </base:outlinedTable>
</base:form>
