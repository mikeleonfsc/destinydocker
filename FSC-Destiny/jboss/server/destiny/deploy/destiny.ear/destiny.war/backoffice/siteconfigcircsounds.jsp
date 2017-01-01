<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.SiteConfigurationBaseForm" %> 

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>


<%
    SiteConfigurationBaseForm form = (SiteConfigurationBaseForm)request.getAttribute(SiteConfigurationBaseForm.FORM_NAME);
%>


<tr>
    <td>
        <table id="<%=SiteConfigurationBaseForm.TABLE_CIRC_SOUNDS%>" width="100%" cellpadding="5" cellspacing="0"> 
            <tr>
                <td colspan = "3" class="TableHeading" valign="top"><%=MessageHelper.formatMessage("siteconfigcircsounds_ChangeSound", form.gimmeCircSoundToChange()) %></td>
            </tr>
        <table id="<%=SiteConfigurationBaseForm.TABLE_CIRC_SOUNDS%>"> 
            <tr>
                <td><%=MessageHelper.formatMessage("siteconfigcircsounds_WELCOMETOCIRCSOUNDS") %></td>
            </tr>
        </table>
    </td>
</tr>
