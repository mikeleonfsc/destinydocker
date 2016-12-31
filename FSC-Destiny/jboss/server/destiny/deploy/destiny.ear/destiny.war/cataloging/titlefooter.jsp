<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

    <table width="100%" id="<%=TitleEditForm.TABLE_FOOTER%>">
        <tr>
            <td>
                <a href="#TheTop" ><base:image src="/icons/general/top.gif" height="16" width="19" alt='<%=MessageHelper.formatMessage("titleedit_TopOfPage")%>'/></a>
            </td>
            
            <TD align="center" class="Error">
            	<logic:equal name="<%=TitleEditForm.FORM_NAME%>" property="editTemplates" value="true">
                    <base:genericButton alt='<%= MessageHelper.formatMessage("useDefaults") %>' src="/buttons/large/usedefaults.gif" name="<%=TitleEditForm.BUTTON_USE_DEFAULTS%>"/>
            	</logic:equal>
            	<logic:notEqual name="<%=TitleEditForm.FORM_NAME%>" property="editTemplates" value="true">
					<logic:equal name="<%=TitleEditForm.FORM_NAME%>" property="changesMade" value="true"><%= MessageHelper.formatMessage("titlefooter_TitleHasUnsavedChanges") %></logic:equal>
					<logic:notEqual name="<%=TitleEditForm.FORM_NAME%>" property="changesMade" value="true">
	                	&nbsp;
					</logic:notEqual>            
            	</logic:notEqual>
            </TD>
            
            <td class="ColRowBold tdAlignRight">
                <logic:notEqual name="<%=TitleEditForm.FORM_NAME%>" property="editTemplates" value="true">
                    <logic:equal name="<%=TitleEditForm.FORM_NAME%>" property="changesMade" value="true">
                        <SCRIPT language=javascript>
                        <!--
                        function synchPunctuationButtons() {
                            document.cataloging_servlet_TitleEditForm.checkPunctuationOnSaveExtra.checked = document.cataloging_servlet_TitleEditForm.checkPunctuationOnSave.checked;
                        }
                        -->
                        </script>                    
                        <html:checkbox onclick="synchPunctuationButtons()" name="<%=TitleEditForm.FORM_NAME%>" property="<%=TitleEditForm.CHECK_PUNCTUATION_ON_SAVE%>"><%= MessageHelper.formatMessage("titlefooter_CheckPunctuationOnSave") %></html:checkbox>
                    </logic:equal>
                    <logic:equal name="<%=TitleEditForm.FORM_NAME%>" property="changesMade" value="false">
                        <html:checkbox name="<%=TitleEditForm.FORM_NAME%>" property="<%=TitleEditForm.CHECK_PUNCTUATION_ON_SAVE%>"><%= MessageHelper.formatMessage("titlefooter_CheckPunctuationOnSave") %></html:checkbox>
                    </logic:equal>
                </logic:notEqual>
                <base:showHideTag id="onSaveFooter">
                    <logic:equal name="<%=TitleEditForm.FORM_NAME%>" property="editTemplates" value="true">
                        <base:saveButton onclick="hideElementonSaveFooter()" name="<%=TitleEditForm.BUTTON_NAME_SAVE_TEMPLATE%>"/>
                    </logic:equal>
                    <logic:notEqual name="<%=TitleEditForm.FORM_NAME%>" property="editTemplates" value="true">
                        <base:genericButton alt='<%= MessageHelper.formatMessage("saveTitle") %>' src="/buttons/large/savetitle.gif" onclick="hideElementonSaveFooter()" name="<%=TitleEditForm.BUTTON_NAME_SAVE_TITLE%>"/>
                    </logic:notEqual>
                    <base:imageSpacer width="19" height="16"/>
                    <base:cancelButton name="<%=TitleEditForm.BUTTON_NAME_CANCEL_TITLE%>"/>
                </base:showHideTag>
            </TD>
        </TR>
    </TABLE>


<%-- dump out any alliance failure messages so AT's can look for them as well as customer support --%>
<!-- <%=request.getSession().getAttribute(AddTitleSearchForm.ATTR_ALLIANCE_SEARCH_MESSAGE)%> -->
