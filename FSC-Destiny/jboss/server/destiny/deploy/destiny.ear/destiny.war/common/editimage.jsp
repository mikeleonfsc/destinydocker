<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>

<%@ page import="com.follett.fsc.destiny.client.common.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<base:messageBox strutsErrors="true"/>
<base:form action="/common/servlet/handleeditimageform.do" enctype="multipart/form-data" focus="<%= EditImageForm.FIELD_UPLOAD_FILE %>" method="post">
<html:hidden property="clearLogoOnSave"/>
<html:hidden property="previewFileName"/>
<html:hidden property="objectID"/>
<html:hidden property="originalFileName"/>
<html:hidden property="collectionType"/>
<%
    EditImageForm form = (EditImageForm)request.getAttribute(EditImageForm.FORM_NAME);
%>
	<base:outlinedTable borderColor="#C0C0C0" id="<%=EditImageForm.TABLE_IMAGE_EDIT%>"  width="100%">
        <tr>
            <td class="ColRow" colspan="2">           
                <b><%= MessageHelper.formatMessage("editimage_Description") %></b> <bean:write name="<%=EditImageForm.FORM_NAME%>" property="description"/>
            </td>
        </tr>
        <tr>
        	<td align="center" colspan="2">
        		<img height="1" src="/images/icons/general/line.gif" width="98%">
            </td>
        </tr>
        <tr>
        	<td align="center" valign="top">
        		<table id="<%=EditImageForm.TABLE_IMAGE_HOUSE %>">
        			<tr>
                    	<td align="center" colspan="2">
							<img name='<%=form.getImageCollectionType(true) + 
                            " Image"%>' 
                            alt='<%=form.getImageCollectionType(true) + 
                            " Image" %>' title='<%=form.getImageCollectionType(true) + " Image" %>'   src="<bean:write name="<%= EditImageForm.FORM_NAME %>" property="<%= EditImageForm.PARAM_IMAGE_URL %>"/>" width="<%= EditImageForm.IMAGE_WIDTH %>" height="<%= EditImageForm.IMAGE_HEIGHT %>" border="1">                    	
					    </td>
                	</tr>
                	<tr>
                    	<td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("editimage_NewImage") %></td>
	                    <td class="tdAlignLeft">
	                    	<html:file property="<%= EditImageForm.FIELD_UPLOAD_FILE %>"/>
                    	</td>
                	</tr>
                	<tr>
                		<td>&nbsp;</td>
                		<td class="Instruction">
				        <%= MessageHelper.formatMessage("editimage_TheSupportedFileFormatsFor_typeX_ImagesAreJpgPngAndGif",form.getImageCollectionType()) %>
                        </td>
                	</tr>
                    <% if ( form.getCollectionType() != CollectionType.MEDIA && form.getCollectionType() != CollectionType.LIBRARY ) { %>
                	<tr>
                		<td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("editimage_Caption") %></td>
	                    <td class="tdAlignLeft">
	                    	<html:text property="<%= EditImageForm.FIELD_CAPTION %>" size="30" maxlength='<%="" + BibMasterSpecs.MAX_IMAGE_CAPTION%>'/>
                    	</td>
                    </tr>
                    <% } %>
                    <tr>
                    	<td align="center" colspan="2" class="ColRowBold">
                            <base:showHideTag id="Preview">
                            	<base:genericButton name="<%= EditImageForm.BUTTON_NAME_PREVIEW %>" onclick="hideElementPreview()" alt='<%= MessageHelper.formatMessage("preview") %>' src="/buttons/large/preview2.gif"/>
                            	&nbsp;
                            	<base:genericButton name="<%= EditImageForm.BUTTON_NAME_CLEAR %>" alt='<%= MessageHelper.formatMessage("clear") %>' src="/buttons/large/clear.gif"/>
                            </base:showHideTag>
                    	</td>
	                </tr>
        		</table>
        	</td>
        	<td valign="top" class="ColRowBold tdAlignRight">
    	        <base:showHideTag id="Top">
    				<base:saveButton onclick="hideElementTop()"/><br><base:cancelButton/>
	            </base:showHideTag>
    	    </td>
        </tr>
	</base:outlinedTable>
</base:form>
