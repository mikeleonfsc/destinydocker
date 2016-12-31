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

<bean:define id="programs" name="<%= SiteConfigurationBaseForm.FORM_NAME %>" property="<%= SiteConfigurationBaseForm.FIELD_READING_PROGRAMS_OPTIONS %>"/>

<tr>
    <td>
        <table id="<%=SiteConfigurationBaseForm.TABLE_READING_PROGRAMS%>" width="100%" cellpadding="5" cellspacing="0">
            <tr>
                <td class="TableHeading" valign="top">&nbsp;<%=MessageHelper.formatMessage("siteconfigcatreadingprogram_ReadingProgramSearches") %></td>
            </tr>
            <tr>
                <td><base:imageLine height="1" width="100%" /></td>
            </tr>
            <tr>
                <td class="ColRowBold" colspan="2"><%=MessageHelper.formatMessage("siteconfigcatreadingprogram_SupportedReadingProgramSearches") %>
                    <span class="ColRow">
                       <html:select property="<%= SiteConfigurationBaseForm.FIELD_READING_PROGRAM %>">
                         <html:options collection="programs" property="stringCode" labelProperty="stringDesc"/>
                       </html:select>
                    </span>  
                    &nbsp;<base:helpTag helpFileName="d_support_reading_interest_lvl_srch.htm"/>                        
                </td>     
            </tr>
            <tr>
                <td colspan="2"><base:imageLine height="1" width="100%"/></td>
            </tr>
            <tr>
                <td class="ColRowBold" colspan="2">
                    <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_CAT_USE_LEXILE%>"><%=MessageHelper.formatMessage("siteconfigcatreadingprogram_SupportLexileMeasureSearches") %></html:checkbox>
                    &nbsp;<base:helpTag helpFileName="d_support_lexile_search.htm"/>                        
                </td>
            </tr>
            <tr>
                <td colspan="2"><base:imageLine height="1" width="100%"/></td>
            </tr>
            <tr>
                <td class="ColRowBold" colspan="2">
                    <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_CAT_USE_FOUNTAS_AND_PINNELL%>"><%=MessageHelper.formatMessage("siteconfigcatreadingprogram_SupportFountasAndPinnellSearches") %></html:checkbox>
                    &nbsp;<base:helpTag helpFileName="d_support_fountas_search.htm"/>                        
                </td>
            </tr>
        </table>
    </td>
</tr>
