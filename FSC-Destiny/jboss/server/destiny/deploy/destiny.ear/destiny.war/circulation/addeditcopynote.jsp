<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<base:messageBox strutsErrors="true"/>

<%
    AddEditCopyNoteForm form = (AddEditCopyNoteForm)request.getAttribute(AddEditCopyNoteForm.FORM_NAME);

    String focusControl = AddEditCopyNoteForm.FIELD_URGENT;
    if (form.getCollectionType() == CollectionType.ASSET) {
        focusControl = AddEditCopyNoteForm.FIELD_NOTE;
    }
%>

<base:form action="/circulation/servlet/handleaddeditcopynoteform.do" focus="<%=focusControl%>">
<html:hidden property="copyID" />
<html:hidden property="copyNoteID" />
<html:hidden property="collectionType" />

    <base:outlinedTable borderColor="#C0C0C0" id='<%= AddEditCopyNoteForm.TABLE_ADD_EDIT_COPY_NOTE %>' width="300">
        <tr valign="top">
            <logic:notEqual name='<%= AddEditCopyNoteForm.FORM_NAME %>' property="collectionType" value='<%= "" + CollectionType.ASSET %>'>
                <td class="ColRow">
                    <html:checkbox property='<%= AddEditCopyNoteForm.FIELD_URGENT%>'><base:image src="/icons/general/flag.gif" height="16" width="19"/><%= MessageHelper.formatMessage("addeditcopynote_DisplayThisNote") %></html:checkbox>
                </td>
                <td class="ColRow tdAlignRight">
                    <base:helpTag helpFileName="c_notes_make_use_LM_MM_TM_AM.htm"/>
                </td>
            </logic:notEqual>
            <logic:equal name='<%= AddEditCopyNoteForm.FORM_NAME %>' property="collectionType" value='<%= "" + CollectionType.ASSET %>'>
                <td class="ColRow">
                    <html:checkbox property='<%= AddEditCopyNoteForm.FIELD_URGENT%>'><base:image src="/icons/general/flag.gif" height="16" width="19"/><%= MessageHelper.formatMessage("addeditcopynote_ThisNoteDisplaysWheneverTheItemIsAccessed") %></html:checkbox>
                </td>
                <td class="ColRow tdAlignRight">
                    <base:helpTag helpFileName="c_notes_make_use_LM_MM_TM_AM.htm"/>
                </td>
            </logic:equal>
        </tr>
        <tr>
            <td>
                <html:textarea property='<%= AddEditCopyNoteForm.FIELD_NOTE %>' rows="10" cols="50"/>
            </td>
            <td valign="top" class="mediumColHeading tdAlignRight">
                <base:showHideTag id="onSave">
                    <base:genericButton src="/buttons/large/savenote.gif" onclick="hideElementonSave()" name="<%= AddEditCopyNoteForm.BUTTON_NAME_SAVE_NOTE%>" alt='<%= MessageHelper.formatMessage("saveNote") %>'/>
                    <base:cancelButton name="<%= AddEditCopyNoteForm.BUTTON_NAME_CANCEL%>"/>
                </base:showHideTag>
            </td>
        </tr>
    </base:outlinedTable>
</base:form>
