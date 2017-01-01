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
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.EditBibTypeImageForm"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<base:messageBox strutsErrors="true"/>
<base:form action="/cataloging/servlet/handleeditbibtypeimageform.do" enctype="multipart/form-data" focus="<%= EditBibTypeImageForm.FIELD_UPLOAD_FILE %>" method="post">
<html:hidden property="previewFileName"/>
<html:hidden property="originalFileName"/>
<html:hidden property="bibTypeID"/>
<html:hidden property="elementary"/>
<html:hidden property="bibSubTypeID"/>
<%
EditBibTypeImageForm form = (EditBibTypeImageForm)request.getAttribute(EditBibTypeImageForm.FORM_NAME);
%>
	<base:outlinedTable borderColor="#C0C0C0" id="<%=EditBibTypeImageForm.TABLE_IMAGE_EDIT%>"  width="100%">
        <tr>
            <td class="TableHeading" colspan="2">           
                <b><%= MessageHelper.formatMessage("editbibtypeimage_EditIconForMaterialType0", form.getDescription()) %></b>
            </td>
        </tr>
        <tr>
        	<td align="center" colspan="2">
        		<img height="1" src="/images/icons/general/line.gif" width="98%">
            </td>
        </tr>
        <tr>
        	<td align="center" valign="top">
        		<table id="<%=EditBibTypeImageForm.TABLE_IMAGE_HOUSE %>">
        			<tr>
                    	<td align="center" colspan="2">
                        <%=form.getImageURL() %>
					    </td>
                	</tr>
                	<tr>
                    	<td width="40%" class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("editbibtypeimage_NewIcon") %></td>
	                    <td>
	                    	<html:file property="<%= EditBibTypeImageForm.FIELD_UPLOAD_FILE %>"/>
                    	</td>
                	</tr>
                	<tr>
                		<td class="Instruction" colspan="2" align="center">
	                        <%= MessageHelper.formatMessage("editbibtypeimage_TheUploadedFileMustBe", form.getDimensionsForUploadedImage()) %>
	                    </td>
                	</tr>
                    <tr>
                    	<td align="center" colspan="2" class="ColRowBold">
                            <base:showHideTag id="Preview">
                            	<base:genericButton name="<%= EditBibTypeImageForm.BUTTON_NAME_PREVIEW %>" onclick="hideElementPreview()" alt='<%= MessageHelper.formatMessage("preview") %>' src="/buttons/large/preview2.gif"/>
                            </base:showHideTag>
                    	</td>
	                </tr>
        		</table>
        	</td>
        	<td valign="top" class="ColRowBold tdAlignRight">
    	        <base:showHideTag id="Top">
    				<base:saveButton onclick="hideElementTop()"/><br/><base:cancelButton/><br/><base:genericButton name="<%= EditBibTypeImageForm.BUTTON_NAME_USE_DEFAULT %>" alt='<%=MessageHelper.formatMessage("useDefaults") %>' src="/buttons/large/usedefaults.gif"/>
	            </base:showHideTag>
    	    </td>
        </tr>
	</base:outlinedTable>
</base:form>
