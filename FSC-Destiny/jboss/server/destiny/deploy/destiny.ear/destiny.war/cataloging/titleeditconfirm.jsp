<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%
    TitleEditForm form = (TitleEditForm)request.getAttribute(TitleEditForm.FORM_NAME);
%>
<logic:equal name="<%=TitleEditForm.FORM_NAME%>" property="duplicateFound" value="true">
    <base:imageSpacer width="1" height="3"/>
    <base:messageBox showWarningIcon="true" message='<%= MessageHelper.formatMessage("titleeditconfirm_ThisRecordMayDuplicateAnExistingMARCRecord") %>'>
        <tr>
            <td><base:imageSpacer width="31" height="5"/></td>
            <td class="ColRow"><%= form.getDuplicateInfo() %></td>
        </tr>
        <tr>
            <td><base:imageSpacer width="31" height="5"/></td>
            <td colspan="2">
                <span class="ColRowBold"><%= MessageHelper.formatMessage("titleeditconfirm_WhatDoYouWantToDo") %></span>
                <span class="ColRow">
                    <br>&nbsp;&nbsp;<html:radio property="<%=TitleEditForm.FIELD_EDIT_OPTION%>" value="<%=TitleEditForm.EDIT_OPTION_GO_BACK%>"><%= MessageHelper.formatMessage("titleeditconfirm_GoBackToThisRecordAndMakeFurtherChanges") %></html:radio>
                    <logic:equal name="<%=TitleEditForm.FORM_NAME%>" property="<%=TitleEditForm.FIELD_ACTION%>" value="<%=TitleEditForm.ACTION_CREATE%>">
                        <br>&nbsp;&nbsp;<html:radio property="<%=TitleEditForm.FIELD_EDIT_OPTION%>" value="<%=TitleEditForm.EDIT_OPTION_USE_EXISTING%>"><%= MessageHelper.formatMessage("titleeditconfirm_DiscardTheseChangesAndGoToTheExistingRecord") %></html:radio>
                        <br>&nbsp;&nbsp;<html:radio property="<%=TitleEditForm.FIELD_EDIT_OPTION%>" value="<%=TitleEditForm.EDIT_OPTION_SAVE_ANYWAY%>"><%= MessageHelper.formatMessage("titleeditconfirm_CreateADuplicateRecord") %></html:radio>
                    </logic:equal>
                    <logic:equal name="<%=TitleEditForm.FORM_NAME%>" property="allowSaveAnywaysOptions" value="true">
                        <br>&nbsp;&nbsp;<html:radio property="<%=TitleEditForm.FIELD_EDIT_OPTION%>" value="<%=TitleEditForm.EDIT_OPTION_SAVE_ANYWAY%>"><%= MessageHelper.formatMessage("titleeditconfirm_SaveTheseChangesAnyway") %></html:radio>
                    </logic:equal>
                </span>
            </td>
        </tr>
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <input type="submit" name="<%=TitleEditForm.BUTTON_NAME_CONFIRM%>" value="<%=TitleEditForm.BUTTON_VALUE_OK%>" id="<%=TitleEditForm.BUTTON_NAME_CONFIRM%>">
            </td>
        </tr>
    </base:messageBox>
</logic:equal>

