<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.*" %>
<%@ page import="org.apache.struts.util.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.PatronImportJob" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.PatronSpecs" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>


<base:messageBox strutsErrors="true"/>
<bean:define id="form" name="<%= ImportPatronsForm.FORM_NAME %>" type="com.follett.fsc.destiny.client.backoffice.servlet.ImportPatronsForm" />
<%

    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    String user5Prompt = ResponseUtils.filter((String) store.getProperty(LoginFacadeSpecs.PATRON_USER_DEFINED5));

%>

<base:form action="/backoffice/servlet/handleimportpatronsform.do" enctype="multipart/form-data">
    <base:outlinedTable id="<%=ImportPatronsForm.TABLE_IMPORT_PATRON_BOX%>" borderColor="#C0C0C0">
        <tr valign="top">
            <td>
                <table width="100%">
                <tr>
                    <td class="FormLabel" colspan="2"><%= MessageHelper.formatMessage("importpatrons_CompareEachIncoming") %> <html:select property="primaryID">
                            <html:option value="<%= String.valueOf(PatronImportJob.REQUIRED_FIELD_BARCODE) %>"><%= MessageHelper.formatMessage("importpatrons_Barcode") %></html:option>
                            <html:option value="<%= String.valueOf(PatronImportJob.REQUIRED_FIELD_PATRON_ID) %>"><%= MessageHelper.formatMessage("importpatrons_PatronID") %></html:option>
                        </html:select>
                        <%= MessageHelper.formatMessage("importpatrons_ToThePatronBarcodesInDestiny") %>
                        <base:helpTag helpFileName="d_import_patrons_id.htm"/>
                    </td>
                </tr>
                <tr>
                    <td class="FormLabel" colspan="2"><base:imageSpacer width="15" height="1"/><%= MessageHelper.formatMessage("importpatrons_Then") %></td>
                </tr>
                <tr>
                    <td class="FormLabel" colspan="2"><base:imageSpacer width="30" height="1"/><%= MessageHelper.formatMessage("importpatrons_IfNoMatchIsFoundAddANewPatronRecordAndIfNecessary") %>:</td>
                </tr>
                <logic:equal name="<%=ImportPatronsForm.FORM_NAME%>" property="districtIDRequired" value="false">
                <tr>
                    <td class="FormElement tdAlignRight">
                        <html:radio property="<%= ImportPatronsForm.FIELD_SEC_ID_STATUS %>" value="<%= PatronImportJob.MOVE_TO_UD5 %>"/>
                    </td>
                    <td class="ColRow"><%= MessageHelper.formatMessage("importpatrons_MoveTheUnusedIdentifierTo", user5Prompt) %></td>
                </tr>
                <tr>
                    <td class="FormElement tdAlignRight">
                        <html:radio property="<%= ImportPatronsForm.FIELD_SEC_ID_STATUS %>" value="<%= PatronImportJob.MOVE_TO_DISTRICT_ID %>"/>
                    </td>
                    <td class="ColRow"><%= MessageHelper.formatMessage("importpatrons_MoveTheUnusedIDTo", PatronSpecs.getDistrictIDPrompt()) %></td>
                </tr>
                <tr>
                    <td class="FormElement tdAlignRight">
                        <html:radio property="<%= ImportPatronsForm.FIELD_SEC_ID_STATUS %>" value="<%= PatronImportJob.MOVE_TO_BYE_BYE_LAND %>"/>
                    </td>
                    <td class="ColRow"><%= MessageHelper.formatMessage("importpatrons_DiscardTheUnusedIdentifier") %></td>
                </tr>
                </logic:equal>
                <logic:equal name="<%=ImportPatronsForm.FORM_NAME%>" property="districtIDRequired" value="true">
                <tr>
                    <td class="tdAlignRight">
                        <html:hidden property="<%= ImportPatronsForm.FIELD_SEC_ID_STATUS %>" value="<%= PatronImportJob.MOVE_TO_DISTRICT_ID %>"/>
                        &nbsp;
                    </td>
                    <td class="ColRow"><%= MessageHelper.formatMessage("importpatrons_MoveTheUnusedIdentifierTo", PatronSpecs.getDistrictIDPrompt()) %></td>
                </tr>
                </logic:equal>
                <tr>
                    <td class="FormLabel" colspan="2"><base:imageSpacer width="30" height="1"/><%= MessageHelper.formatMessage("importpatrons_IfAnIncomingPatronRecord") %></td>
                </tr>
                <tr>
                    <td class="FormElement tdAlignRight">
                        <html:radio property="replaceAction" value=
                            "<%= String.valueOf(PatronImportJob.IMPORT_REPLACE_VALUE_SKIP)%>"/>
                    </td>
                    <td class="ColRow"><%= MessageHelper.formatMessage("importpatrons_SkipTheIncomingPatronRecord") %></td>
                </tr>
                <tr>
                    <td class="FormElement tdAlignRight">
                        <html:radio property="replaceAction" value="<%= String.valueOf(PatronImportJob.IMPORT_REPLACE_VALUE_MERGE)%>"/>
                    </td>
                    <td class="ColRow"><%= MessageHelper.formatMessage("importpatrons_MergeTheIncomingRecordWithTheExistingRecord") %><base:helpTag helpFileName="d_import_patrons_merge.htm"/>
                    </td>
                </tr>
                <tr>
                    <td class="FormElement tdAlignRight">
                        <html:radio property="replaceAction" value="<%= String.valueOf(PatronImportJob.IMPORT_REPLACE_VALUE_REPLACE)%>"/>
                    </td>
                    <td class="ColRow"><%= MessageHelper.formatMessage("importpatrons_ReplaceTheExistingPatronRecord") %></td>
                </tr>
                <tr>
                    <td class="FormLabel tdAlignRight"><nobr><%= MessageHelper.formatMessage("importpatrons_ImportFile") %></nobr></td>
                    <td><html:file property="<%=ImportPatronsForm.FIELD_UPLOAD_FILE%>" size="40"/></td>
                </tr>

                <tr>
                    <td class="tdAlignRight" valign="top"><html:checkbox property="limitWarnings"/></td>
                    <td class="ColRow" valign="top"><%= MessageHelper.formatMessage("importpatrons_LimitTheJobSummaryDetailsToErrorsAndWarningsClearT") %></td>
                </tr>

                <tr>
                    <td colspan="2" align="center" class="ColRowBold">
                        <base:genericShowHideButton src="/buttons/large/importpatrons.gif" name="action" alt='<%= MessageHelper.formatMessage("import") %>' elementID="import"/>
                        <br>
                    </td>
                </tr>
                </table>
            </td>
        </tr>
    </base:outlinedTable>
</base:form>
