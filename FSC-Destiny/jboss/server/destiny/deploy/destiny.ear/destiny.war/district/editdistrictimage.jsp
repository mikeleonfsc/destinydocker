<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>

<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>

<base:messageBox strutsErrors="true"/>
<base:form action="/district/servlet/handleeditdistrictimageform.do" enctype="multipart/form-data" focus="<%= EditDistrictImageForm.FIELD_UPLOAD_FILE %>" method="post">
<html:hidden property="clearLogoOnSave"/>
<html:hidden property="previewFileName"/>
<html:hidden property="currentLogoFileName"/>
<html:hidden property="logo"/>
<%
    EditDistrictImageForm form = (EditDistrictImageForm)request.getAttribute(EditDistrictImageForm.FORM_NAME);
%>
    <base:outlinedTable borderColor="#C0C0C0" id="<%=EditDistrictImageForm.TABLE_IMAGE_EDIT%>"  width="100%">
        <tr>
            <td align="center" valign="top">
                <table id="<%=EditDistrictImageForm.TABLE_IMAGE_HOUSE %>">
                    <tr>
                        <td align="center" colspan="2">
                            <img name ="Image"
                            alt="Image" title="Image" 
                            src="<bean:write name="<%= EditDistrictImageForm.FORM_NAME %>" property="<%= EditDistrictImageForm.PARAM_IMAGE_URL %>"/>" 
                            width="<%= EditDistrictImageForm.IMAGE_WIDTH %>" height="<%= EditDistrictImageForm.IMAGE_HEIGHT %>" border="1">                     
                        </td>
                    </tr>
                    <tr>
                        <td class="ColRowBold tdAlignRight" >
                            New Image
                        </td>
                        <td>
                            <html:file property="<%= EditDistrictImageForm.FIELD_UPLOAD_FILE %>"/>
                            &nbsp;
                            <base:helpTag helpFileName="c_district_welcome_page.htm"/> 
                        </td>
                    </tr>
                    <tr>
                        <td align="center" colspan="2" class="ColRowBold">
                            <base:showHideTag id="Preview">
                                <base:genericButton name="<%= EditDistrictImageForm.BUTTON_NAME_PREVIEW %>" onclick="hideElementPreview()" alt="Preview" src="/buttons/large/preview2.gif"/>
                                &nbsp;
                                <base:genericButton name="<%= EditDistrictImageForm.BUTTON_NAME_CLEAR %>" alt="Clear" src="/buttons/large/clear.gif"/>
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
