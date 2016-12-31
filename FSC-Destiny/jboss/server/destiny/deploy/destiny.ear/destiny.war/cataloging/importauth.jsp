<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.*" %>
<%@ page import="com.follett.fsc.destiny.session.cataloging.remote.BibImportJob" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<% ImportAuthForm form = (ImportAuthForm)request.getAttribute(ImportAuthForm.FORM_NAME); %>



<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>



<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handleimportauthform.do" enctype="multipart/form-data">

    <base:outlinedTable id="<%=ImportAuthForm.TABLE_OUTLINE_IMPORT_AUTH%>">
        <tr valign="top">
            <td>
                <table width="100%" id="<%=ImportAuthForm.TABLE_IMPORT_AUTH%>">
                <tr>
                    <td class="FormLabel" colSpan="2"><%= MessageHelper.formatMessage("importauth_IfAnIncomingAuthorityHeading1XXMatchesAnExisting") %></td>
                </tr>
                <tr>
                    <td class="FormElement tdAlignRight">
                        <html:radio property="<%=ImportAuthForm.FIELD_DUPLICATE_ACTION%>" value="<%=ImportAuthForm.VALUE_MERGE%>"/>
                    </td>
                    <td class="ColRow"><%= MessageHelper.formatMessage("importauth_MergeTheRecords") %></td>
                </tr>
                <tr>
                    <td class="FormElement tdAlignRight">
                        <html:radio property="<%=ImportAuthForm.FIELD_DUPLICATE_ACTION%>" value="<%=ImportAuthForm.VALUE_REPLACE%>"/>
                    </td>
                    <td class="ColRow"><%= MessageHelper.formatMessage("importauth_ReplaceTheExistingRecordWithTheIncomingRecord") %></td>
                </tr>

                <tr>
                    <td class="FormElement tdAlignRight">
                        <html:radio property="<%=ImportAuthForm.FIELD_DUPLICATE_ACTION%>" value="<%=ImportAuthForm.VALUE_SKIP%>"/>
                    </td>
                    <td class="ColRow"><%= MessageHelper.formatMessage("importauth_SkipTheIncomingRecord") %></td>
                </tr>

                <tr>
                    <td class="FormLabel tdAlignRight" nowrap><%= MessageHelper.formatMessage("importauth_ImportFile") %></td>
                    <td><html:file property="<%=ImportAuthForm.FIELD_UPLOAD_FILE%>" size="40"/></td>
                </tr>

                <tr valign="top">
                    <td class="tdAlignRight"><html:checkbox property="<%=ImportAuthForm.FIELD_SUMMARY_BRIEF%>"></html:checkbox></td>
                    <td class="ColRow"><%= MessageHelper.formatMessage("importauth_LimitTheJobSummaryDetailsToErrorsAndWarningsClear") %></td>
                </tr>
                <tr>
                    <td colspan="2" align="center" class="ColRowBold">
                        <base:genericShowHideButton name="<%=ImportAuthForm.BUTTON_IMPORT%>" alt='<%= MessageHelper.formatMessage("import") %>' src="/buttons/large/importauthority.gif" elementID="import"/>
                    </td>
                </tr>
                </table>
            </td>
        </tr>
    </base:outlinedTable>
</base:form>
