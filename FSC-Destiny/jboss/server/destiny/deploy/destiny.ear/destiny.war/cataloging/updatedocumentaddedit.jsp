<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.UpdateDocumentAddEditForm"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.BaseFileUploadForm"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator"%>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>
<%@page import="com.follett.fsc.common.StringHelper"%>

<base:messageBox strutsErrors="true" />

<%
    UpdateDocumentAddEditForm form = (UpdateDocumentAddEditForm)request.getAttribute(UpdateDocumentAddEditForm.FORM_NAME);
%>

<base:form action="/cataloging/servlet/handleupdatedocumentaddeditform.do" enctype="multipart/form-data" focus="<%=UpdateDocumentAddEditForm.FIELD_DOCUMENT_NAME%>">
    <html:hidden property="<%= UpdateDocumentAddEditForm.PARM_ACTION %>" />
    <html:hidden property="<%= UpdateDocumentAddEditForm.PARM_COPY_ID %>" />
    <html:hidden property="<%= UpdateDocumentAddEditForm.PARM_BIB_ID %>" />
    <html:hidden property="<%= UpdateDocumentAddEditForm.PARM_EDIT_MODE %>" />
    <html:hidden property="<%= UpdateDocumentAddEditForm.PARM_DOCUMENT_ID %>" />
    <html:hidden property="<%=UpdateDocumentAddEditForm.CHANGED_RESOURCE_TYPE%>"
        value="false" />

    <base:outlinedTable borderColor="#c0c0c0" width="100%">
    <tr>
            <td align="center" valign="top">
                <table>
       <tr>
            <td class="FormLabel tdAlignRight" nowrap><%= MessageHelper.formatMessage("updatedocumentaddedit_DigitalContentName") %></td>
            <td><html:text
                    property="<%=UpdateDocumentAddEditForm.FIELD_DOCUMENT_NAME%>"
                    size="30" maxlength="30" /></td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight">* <html:select
                    property="<%= UpdateDocumentAddEditForm.FIELD_RESOURCE_TYPE %>"
                    onchange="submitDropDownMode();">
                    <html:option
                        value="<%= UpdateDocumentAddEditForm.OPTION_RESOURCE_TYPE_UPLOAD_FILE %>"><%= MessageHelper.formatMessage("UpdateDocumentAddEditForm_UploadDigitalContent") %></html:option>
                    <html:option
                        value="<%= UpdateDocumentAddEditForm.OPTION_RESOURCE_TYPE_RESOURCE_URL %>"><%= MessageHelper.formatMessage("UpdateDocumentAddEditForm_ResourceURL") %></html:option>
                </html:select>
            </td>
            <% if (form.OPTION_RESOURCE_TYPE_UPLOAD_FILE.equals(form.getResourceType())) { %>
            <td class="tdAlignLeft"><html:file
                    property="<%= BaseFileUploadForm.FIELD_UPLOAD_FILE %>" /></td>
            <% } else { %>
            <td class="AlignLeft"><span
                onKeyPress="return trapEnter(event);"> <html:text
                        property="<%= UpdateDocumentAddEditForm.FIELD_RESOURCE_URL %>"
                        size="30" maxlength="1000" />
            </span> <base:helpTag helpFileName="d_resource_url_title_TM.htm" /></td>
        <tr>
            <td></td>
            </td>
            <td colspan="2" class="Instruction"><%= MessageHelper.formatMessage("titleeditresources_EnterACompleteURLIncludingTheProtocolEGHttpFtp") %></td>
            <% } %>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td class="ColRowBold tdAlignLeft"><input type="checkbox"
                name="<%= UpdateDocumentAddEditForm.FIELD_ALLOW_MY_INFO_VIEW %>"
                value="on"
                <%= (form.isAllowMyInfoView()) ? "checked=\"checked\"" : "" %> />&nbsp;
                <%= MessageHelper.formatMessage("updateDocumentAddEditForm_AllowPatronToViewInMyInfo") %>
            </td>
        </tr>
        <tr>
            <td colspan="3" class="SmallColRow"><%= MessageHelper.formatMessage("updatedocumentaddedit_RequiredField") %></td>
            
        </tr>
        </table>
            </td>
            <td valign="top"  class="ColRowBold tdAlignRight"><base:showHideTag
                    id="hideSave">
                    <base:saveButton onclick="hideElementhideSave()" />
                    <br>
                    <base:cancelButton />
              </base:showHideTag></td>
              </tr>
        
    </base:outlinedTable>
</base:form>
<script language="JavaScript" type="text/javascript">
<!--
    function submitDropDownMode() {
        document.<%=UpdateDocumentAddEditForm.FORM_NAME%>.<%=UpdateDocumentAddEditForm.CHANGED_RESOURCE_TYPE%>.value = true;
        document.<%=UpdateDocumentAddEditForm.FORM_NAME%>.submit();
    }
    function trapEnter(e) {
        var whichCode = (window.Event) ? e.which : e.keyCode;
        if (e.keyCode == 13) {
            return false;
        }
        return true;
    }
    // -->
</script>

<!-- end of page -->
