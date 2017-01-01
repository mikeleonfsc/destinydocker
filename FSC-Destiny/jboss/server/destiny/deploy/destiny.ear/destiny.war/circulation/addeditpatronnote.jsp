<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%
    AddEditPatronNoteForm form = (AddEditPatronNoteForm)request.getAttribute(AddEditPatronNoteForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true"/>

<base:form action="/circulation/servlet/handleaddeditpatronnoteform.do">
    <html:hidden property='<%= AddEditPatronNoteForm.FIELD_NOTE_ID%>' />

    <base:outlinedTable borderColor="#C0C0C0" id='<%= AddEditPatronNoteForm.TABLE_ADD_EDIT_PATRON_NOTE %>' width="300">
        <tr valign="top">
            <td class="ColRow">
                <html:checkbox property='<%= AddEditPatronNoteForm.FIELD_URGENT%>'><base:image src="/icons/general/flag.gif"  height="16" width="19"/><%= MessageHelper.formatMessage("addeditpatronnote_DisplayThisNote") %></html:checkbox>
            </td>
            <td class="ColRow tdAlignRight">
                <base:helpTag helpFileName="c_notes_make_use_LM_MM_TM_AM.htm"/>
            </td>
        </tr>
        <tr>
            <td>
                <html:textarea property='<%= AddEditPatronNoteForm.FIELD_NOTE %>' rows="10" cols="50"/>
            </td>
            <td valign="top" class="ColRowBold tdAlignRight">
                <base:showHideTag id="onSave">
                    <base:genericButton src="/buttons/large/savenote.gif" onclick="hideElementonSave()" name="<%= AddEditPatronNoteForm.BUTTON_NAME_SAVE_NOTE%>" alt='<%= MessageHelper.formatMessage("saveNote") %>'/>
                    <base:cancelButton/>
                </base:showHideTag>
            </td>
        </tr>
    </base:outlinedTable>
</base:form>
