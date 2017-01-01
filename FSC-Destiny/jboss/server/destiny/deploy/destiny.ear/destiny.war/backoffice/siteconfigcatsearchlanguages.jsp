<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.SiteConfigurationBaseForm" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>


<%
    SiteConfigurationBaseForm form = (SiteConfigurationBaseForm)request.getAttribute(SiteConfigurationBaseForm.FORM_NAME);
%>


<html:hidden property="languageChange" value="false" />

<tr>
    <td>
        <table id="<%=SiteConfigurationBaseForm.TABLE_LANGUAGES%>" width="100%" cellpadding="5" cellspacing="0">
            <tr>
                <td class="TableHeading" valign="top">&nbsp;<%=MessageHelper.formatMessage("siteconfigcatsearchlanguages_SupportedSearchLanguages") %></td>
            </tr>
            <tr>
                <td><base:imageLine height="1" width="100%" /></td>
            </tr>
            <tr>
                <td class="ColRowBold"><%=MessageHelper.formatMessage("siteconfigcatsearchlanguages_AllowGuestsAndPatronsToViewSelectPagesIn") %>&nbsp;:<base:helpTag helpFileName="d_languagesupport_choices.htm"/>
                </td>
            </tr>
            <tr>
                <td class="ColRowBold">
                    &nbsp;&nbsp;
                    <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_CAT_ALLOW_FRENCH%>" 
                        onclick="document.backoffice_servlet_SiteConfigurationBaseForm.languageChange.value = 'true';
                        document.backoffice_servlet_SiteConfigurationBaseForm.submit();"><%=MessageHelper.formatMessage("siteconfigcatsearchlanguages_French") %></html:checkbox>
                </td>
            </tr>
            <tr>
                <td class="ColRowBold">
                    &nbsp;&nbsp;
                    <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_CAT_ALLOW_SPANISH%>" 
                        onclick="document.backoffice_servlet_SiteConfigurationBaseForm.languageChange.value = 'true';
                        document.backoffice_servlet_SiteConfigurationBaseForm.submit();"><%=MessageHelper.formatMessage("siteconfigcatsearchlanguages_Spanish") %></html:checkbox>
                </td>
            </tr>
            <tr>
                <td class="ColRowBold">
                    <a name="theLanguageFocus"></a>
                    &nbsp;&nbsp;<%=MessageHelper.formatMessage("siteconfigcatsearchlanguages_ByDefaultDisplaySelectPages", form.buildEnglishFrenchSpanishOPACLanguageCombobox()) %>
                </td>
            </tr>
        </table>
    </td>
</tr>
