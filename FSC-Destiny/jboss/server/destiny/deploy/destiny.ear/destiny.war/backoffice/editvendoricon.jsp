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
<%@page import="com.follett.fsc.common.MessageHelper"%>

<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.EditVendorIconForm"%><base:messageBox strutsErrors="true"/>
<base:form action="/backoffice/servlet/handleeditvendoriconform.do" enctype="multipart/form-data" focus="<%= EditVendorIconForm.FIELD_UPLOAD_FILE %>" method="post">
<html:hidden property="previewFileName"/>
<html:hidden property="<%=EditVendorIconForm.PARAM_ORIGINAL_FILE_NAME%>"/>
<html:hidden property="<%=EditVendorIconForm.PARAM_VENDOR_NAME%>"/>
<html:hidden property="<%=EditVendorIconForm.PARAM_ELEMENTARY%>"/>
<%
    EditVendorIconForm form = (EditVendorIconForm)request.getAttribute(EditVendorIconForm.FORM_NAME);
%>
	<base:outlinedTable borderColor="#C0C0C0" id="<%=EditVendorIconForm.TABLE_IMAGE_EDIT%>"  width="100%">
        <tr>
            <td class="TableHeading" colspan="2">           
                <b><%=MessageHelper.formatMessage("editvendoricon_UpdateIconFor")%> "<bean:write name="<%=EditVendorIconForm.FORM_NAME%>" property="vendorName"/>"</b>
            </td>
        </tr>
        <tr>
        	<td align="center" colspan="2">
                <base:imageLine height="1" width="98%"/>
            </td>
        </tr>
        <tr>
        	<td align="center" valign="top">
        		<table id="<%=EditVendorIconForm.TABLE_IMAGE_HOUSE %>">
        			<tr>
                    	<td align="center" colspan="2">
                            <table id="<%=EditVendorIconForm.TABLE_IMAGE_HOUSE_INNER %>" border="1" style="border-collapse: collapse">
        			          <tr>
                                <td>
                                    <%=form.getImageURL() %>
        					    </td>
                    	       </tr>
                            </table>
                        </td>
                    </tr>
                	<tr>
                    	<td width="40%" class="ColRowBold tdAlignRight">
	                        <%=MessageHelper.formatMessage("editvendoricon_NewIcon")%> 
	                    </td>
	                    <td>
	                    	<html:file property="<%= EditVendorIconForm.FIELD_UPLOAD_FILE %>"/>
                    	</td>
                	</tr>
                	<tr>
                		<td class="Instruction" colspan="2" align="center">
	                        <%=MessageHelper.formatMessage("editvendoricon_TheUploadedFileMustBeIngifFormatTheUploadedImageShouldBe0PixelsIfItIsLargerItWillBeResized",form.getDimensionsForUploadedImage())%> 
	                    </td>
                	</tr>
                    <tr>
                    	<td align="center" colspan="2" class="ColRowBold">
                            <base:showHideTag id="Preview">
                            	<base:genericButton name="<%= EditVendorIconForm.BUTTON_NAME_PREVIEW %>" onclick="hideElementPreview()" alt='<%= MessageHelper.formatMessage("preview") %>' src="/buttons/large/preview2.gif"/>
                            </base:showHideTag>
                    	</td>
	                </tr>
        		</table>
        	</td>
        	<td valign="top" class="ColRowBold tdAlignRight">
    	        <base:showHideTag id="Top">
    				<base:saveButton onclick="hideElementTop()"/><br/><base:cancelButton/><br/>
	            </base:showHideTag>
    	    </td>
        </tr>
	</base:outlinedTable>
</base:form>
