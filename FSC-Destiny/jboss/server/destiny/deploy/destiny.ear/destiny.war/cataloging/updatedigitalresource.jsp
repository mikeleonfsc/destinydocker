<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>

<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.UpdateDigitalResourceForm"%>
<%@page import="com.follett.fsc.destiny.client.common.servlet.BaseFileUploadForm"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.DigitalResourceSpecs"%>
<%@page import="com.follett.fsc.common.StringHelper"%>

<bean:define id="form" name="<%=UpdateDigitalResourceForm.FORM_NAME%>" type="com.follett.fsc.destiny.client.cataloging.servlet.UpdateDigitalResourceForm" />

<base:messageBox strutsErrors="true"/>
<%
    String focus = "";
    if ((!form.isShowSaveWarning()) && (!form.isShowDeleteWarning())) {
        focus = UpdateDigitalResourceForm.FIELD_DIGITAL_CONTENT_NAME;        
    }
%>    
<base:form action="/cataloging/servlet/handleupdatedigitalresourceform.do" enctype="multipart/form-data" focus="<%= focus %>" method="post">
    <html:hidden property="<%=UpdateDigitalResourceForm.CHANGED_RESOURCE_TYPE%>" value="false"/>
    <% if (form.isShowSaveWarning()) { %>
        <base:messageBox>
            <tr>
                <td align="center" colspan="2">
                    <bean:write name="cataloging_servlet_UpdateDigitalResourceForm" property="digitalResourceAgreement" filter="false" />
                </td>
            </tr>
            <tr>
                <td align="center" class="ColRow" colspan="2"><%= MessageHelper.formatMessage("updatedigitalresource_AreYouSureYouWantToSaveThisDigitalContent") %></td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2">
                    <base:yesNo/>
                </td>
            </tr>
        </base:messageBox>
    <% } else {
           if (form.isShowDeleteWarning()) { %>
            <base:messageBox showWarningIcon="true" message='<%= MessageHelper.formatMessage("updatedigitalresource_AreYouSureYouWantToDeleteThe0DigitalContent", form.gimmeDelete856Description()) %>'>
                <tr>
                    <td valign="baseline" align="center" class="ColRow" colspan="2">
                        <base:yesNo/>
                    </td>
                </tr>
            </base:messageBox>
        <% } %>
        <base:outlinedTable borderColor="#C0C0C0" id="<%=UpdateDigitalResourceForm.TABLE_IMAGE_EDIT%>"  width="100%">
            <% if (!form.isShowDeleteWarning()) { %>
                <tr>
                    <td align="center" valign="top">
        		        <table id="<%=UpdateDigitalResourceForm.TABLE_IMAGE_HOUSE %>">
                	        <tr>
                    	        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("updatedigitalresource_DigitalContentName") %></td>
	                            <td class="tdAlignLeft">
	                    	        <html:text property="<%= UpdateDigitalResourceForm.FIELD_DIGITAL_CONTENT_NAME %>" size="30" maxlength='<%="" + DigitalResourceSpecs.MAX_SIZE_OF_DESCRIPTION%>'/>
                    	        </td>
                	        </tr>
                            <tr>
                                <td class="ColRowBold tdAlignRight">
                                    <% if ((form.getTitleEditForm() != null) ||
                                           (form.isDrlibadd()) ||
                                           ((form.getEdit856Index() != -1) && (UpdateDigitalResourceForm.OPTION_RESOURCE_TYPE_UPLOAD_FILE.equals(form.getResourceType())))) { %>
                                        *&nbsp;<%= MessageHelper.formatMessage("updatedigitalresource_UploadDigitalContent") %>
                                    <% } else if ((form.getEdit856Index() != -1) && (UpdateDigitalResourceForm.OPTION_RESOURCE_TYPE_RESOURCE_URL.equals(form.getResourceType()))) { %>
                                        *&nbsp;<%= MessageHelper.formatMessage("updatedigitalresource_ResourceURL") %>
                                    <% } else { %>
                                    *
                                        <html:select property="<%= UpdateDigitalResourceForm.FIELD_RESOURCE_TYPE %>" onchange="submitDropDownMode();">
                                            <html:option value="<%= UpdateDigitalResourceForm.OPTION_RESOURCE_TYPE_UPLOAD_FILE %>"><%= MessageHelper.formatMessage("updatedigitalresource_UploadDigitalContent") %></html:option>
                                            <html:option value="<%= UpdateDigitalResourceForm.OPTION_RESOURCE_TYPE_RESOURCE_URL %>"><%= MessageHelper.formatMessage("updatedigitalresource_ResourceURL") %></html:option>
                                        </html:select>
                                    <% } %>
                                </td>
                                <% if (form.OPTION_RESOURCE_TYPE_UPLOAD_FILE.equals(form.getResourceType())) { %>
                    		        <td class="tdAlignLeft">
    	                    	        <html:file property="<%= BaseFileUploadForm.FIELD_UPLOAD_FILE %>"/>
    	                            </td>
                                    <% if (!StringHelper.isEmpty(form.getTagFileName())) { %>
                                        </tr>
                        	            <tr>
                        	                <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("updatedigitalresource_CurrentFile") %></td>
    	                                    <td class="ColRow">
                                                <%= form.getTagFileName() %>
                            	            </td>
                                    <% } %>
                                <% } else { %>
                                    <td class="AlignLeft">
                                        <span onKeyPress="return trapEnter(event);">
                                            <html:text property="<%= UpdateDigitalResourceForm.FIELD_RESOURCE_URL %>" size="30" maxlength="1000"/>
                                        </span>
                                        <base:helpTag helpFileName="d_resource_url_title_TM.htm"/>
                                    </td>
                                    <tr>
                                        <td colspan="2" class="Instruction"><%= MessageHelper.formatMessage("titleeditresources_EnterACompleteURLIncludingTheProtocolEGHttpFtp") %></td>
                                <% } %>
                            </tr>
                            <% if ((form.getTitleEditForm() != null) || (form.isDrlibadd())) { %>
                                <tr>
                                    <td class="ColRowBold tdAlignRight" valign="top"><%= MessageHelper.formatMessage("updatedigitalresource_ExpirationDate") %></td>
                                    <td class="ColRowBold tdAlignLeft" valign="top">
                                        <base:showHideTag id="onDateChange">
                                            <base:date onClick="hideElementonDateChange()" buttonName="<%=form.BUTTON_EXPIRATION_DATE %>" dateValue="<%=form.getExpirationDate()%>"
                                                       fieldName="<%=form.FIELD_EXPIRATION_DATE %>"/>
                                        </base:showHideTag>
                                    </td>
                                </tr>
                            <% }  else { %>
                                <tr>
                                    <td>&nbsp;</td>
                                    <td class="ColRowBold tdAlignLeft">
                                        <input type="checkbox" name="<%= UpdateDigitalResourceForm.FIELD_ALLOW_MY_INFO_VIEW %>" value="on" <%= (form.isAllowMyInfoView()) ? "checked=\"checked\"" : "" %>/>&nbsp;
                                        <%= MessageHelper.formatMessage("updatedigitalresource_AllowPatronToViewInMyInfo") %>
                                    </td>
                                </tr>
                            <% } %>
                            <tr>
                    	        <td colspan="2" class="Instruction"><%= MessageHelper.formatMessage("updatedigitalresource_RequiredField") %></td>
	                        </tr>
        		        </table>
        	        </td>
        	        <td valign="top" class="ColRowBold tdAlignRight">
                        <base:showHideTag id="onSave">
                            <base:saveButton onclick="hideElementonSave()" name="<%= form.BUTTON_SAVE_DIGITAL_CONTENT%>" /><br>
                            <base:cancelButton/>
                        </base:showHideTag>
    	            </td>
                </tr>
            <% } %>
            <%
            // don't show the list if coming from title edit
            // or coming from the library add digital button
            if ((form.getTitleEditForm() == null && !form.isDrlibadd())) {
                List list = form.gimmeListOfDigitalResourceIDs();
                // only add the seperator line if we are not confirming a delete and we have a list to display
                if ((!form.isShowDeleteWarning()) && (list.size() > 0)) { %>
                    <tr>
                        <td colspan="2">
                            <base:imageLine height="1" width="100%"/>
                        </td>
                    </tr>
                <% } %>
                <tr>
                    <td align="center" valign="top" colspan="2">
                        <table id="<%=UpdateDigitalResourceForm.TABLE_856_LIST %>" width="100%" cellspacing="0" cellpadding="2">
                            <% if (list.size() > 0) { %>
                                <tr>
                                    <td>&nbsp;</td>
                                    <td align="center" class="ColRowBold"><%= MessageHelper.formatMessage("updatedigitalresource_DisplaysInMyInfo") %></td>
                                    <td>&nbsp;</td>
                                </tr>
                                <%
                                Iterator<Integer> itr = list.iterator();
                                while (itr.hasNext()) {
                                    int id = itr.next().intValue();
                                    if (form.canEditThis856(id)) {
                                        String editButton = UpdateDigitalResourceForm.createLink(UpdateDigitalResourceForm.LINK_PREFIX_EDIT_856, id);
                                        String deleteButton = UpdateDigitalResourceForm.createLink(UpdateDigitalResourceForm.LINK_PREFIX_DELETE_856, id); %>
                                        <base:flipper key="updatedigitalresource">
                                            <td class="ColRow" align="left">
                                                <%= form.get856TableEntry(id) %>
                                            </td>
                                            <td align="center">
                                                <% if (form.isAllowMyInfoView(id)) { %>
                                                    <base:image src="/icons/general/check.gif"/>
                                                <% } else { %>
                                                    &nbsp;
                                                <% } %>
                                            </td>
                                            <td nowrap class="tdAlignRight">
                                                <% if (form.isShowDeleteWarning()) { %>
                                                    &nbsp;
                                                <% } else { %>
                                                    <base:genericButton src="/icons/general/edit.gif" name="<%= editButton %>"
                                                                        alt='<%= MessageHelper.formatMessage("titleeditresources_EditElectronicResource") %>' />&nbsp;
                                                    <base:genericButton src="/icons/general/delete.gif" name="<%= deleteButton %>"
                                                                        alt='<%= MessageHelper.formatMessage("titleeditresources_DeleteElectronicResource") %>'/>
                                                <% } %>
                                            </td>
                                        </base:flipper>
                                    <%
                                    } // if (form.canEditThis856(id)) {
                                } // while (itr.hasNext()) {
                            } // if (list.size() > 0) {
                            %>
                        </table>
                    </td>
                </tr>
            <% } //if ((form.getTitleEditForm() == null && !form.isDrlibadd())) { %>
	    </base:outlinedTable>
    <% } // !if (form.isShowSaveWarning()) { %>
</base:form>

<script language="JavaScript" type="text/javascript">
<!--
    function submitDropDownMode() {
        document.<%=UpdateDigitalResourceForm.FORM_NAME%>.<%=UpdateDigitalResourceForm.CHANGED_RESOURCE_TYPE%>.value = true;
        document.<%=UpdateDigitalResourceForm.FORM_NAME%>.submit();
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
