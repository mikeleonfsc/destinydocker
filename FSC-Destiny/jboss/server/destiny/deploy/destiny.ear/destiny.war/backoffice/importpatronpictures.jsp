<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>

<%
    ImportPatronPicturesForm form = (ImportPatronPicturesForm)request.getAttribute(ImportPatronPicturesForm.FORM_NAME);
%>


<base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handleimportpatronpicturesform.do" enctype="multipart/form-data">
    <base:outlinedTable id="importPatronsBox" borderColor="#c0c0c0">
        <tr valign="top">
            <td class="FormLabel tdAlignRight">
                <nobr><%= MessageHelper.formatMessage("importpatronpictures_PictureZipFile") %></nobr>
            </td>
	        <td class="FormElement">
                <html:file property="<%= ImportPatronPicturesForm.FIELD_UPLOAD_FILE%>" size="40"/>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center" class="ColRowBold">
                <base:showHideTag id="hideIt">
                <base:genericButton onclick="hideElementhideIt()" name="action" alt='<%= MessageHelper.formatMessage("upload") %>' src="/buttons/large/uploadpictures.gif"/>
                </base:showHideTag>
                <br><br>
            </td>
        </tr>
    </base:outlinedTable>
</base:form>
