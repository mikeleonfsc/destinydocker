<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    TitleEditForm form = (TitleEditForm)request.getAttribute( TitleEditForm.FORM_NAME );
%>
    <html:hidden property="findHeadingTagID" />
    <html:hidden property="findHeadingTagNumber" />

<% if (form.isChangesMade() && form.getErrors().size() == 0) { %>
    <tr>
        <td align="center">
            <TABLE id="<%= TitleEditForm.TABLE_UNSAVED_CHANGES %>" align="center" width="100%" frame="box" rules="none" bordercolor="#CC0000" cellpadding="3" cellspacing="1" style="border: 1px single #CC0000;">
                <TR>
                    <TD align="center">
                        <%=MessageBoxTag.getCAUTION_IMAGE_HTML()%>
                    </TD>
                    <TD align="center" class="Error">
                        <%= MessageHelper.formatMessage("titleedittabs_TitleHasUnsavedChanges") %>
                    </TD>
                    <td class="ColRowBold tdAlignRight">
                        <SCRIPT language=javascript>
                        <!--
                        function synchPunctuationButtonsExtra() {
                            document.cataloging_servlet_TitleEditForm.checkPunctuationOnSave.checked = document.cataloging_servlet_TitleEditForm.checkPunctuationOnSaveExtra.checked;
                        }
                        -->
                        </script>                    
                        <html:checkbox onclick="synchPunctuationButtonsExtra()" name="<%=TitleEditForm.FORM_NAME%>" property="<%=TitleEditForm.CHECK_PUNCTUATION_ON_SAVE_EXTRA%>"><%= MessageHelper.formatMessage("titleedittabs_CheckPunctuationOnSave") %></html:checkbox>
                        <br>
                        <base:showHideTag id="onSaveHeader">
                            <base:genericButton alt='<%= MessageHelper.formatMessage("saveTitle") %>' src="/buttons/large/savetitle.gif" onclick="hideElementonSaveHeader()" name="<%=TitleEditForm.BUTTON_NAME_SAVE_TITLE %>" />
                            <base:imageSpacer width="19" height="16"/>
                            <base:cancelButton name="<%=TitleEditForm.BUTTON_NAME_CANCEL_TITLE %>" />
                        </base:showHideTag>
                    </TD>
                </TR>
            </TABLE>
      </td>
    </tr>
    <tr>
        <td align="center" class="Error">
            &nbsp;
        </td>
    </tr>
<% } %>


<%
	String callingPage = request.getParameter("callingPage");
    if ( StringHelper.isEmpty(callingPage) ) {
        callingPage = "briefInformation";
    }

%>
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value='<%= MessageHelper.formatMessage("saveTitle") %>'  name="saveTitleOnEnter">
