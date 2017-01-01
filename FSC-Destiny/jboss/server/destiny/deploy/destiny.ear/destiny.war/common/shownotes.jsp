<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.AssetItemEditForm"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.CopyStatusForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.NotesListForm" %>
<%@ page import="com.follett.fsc.destiny.session.common.HTMLHelper" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.CopyEditForm" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<bean:define id="form"
             name="<%= request.getParameter(NotesListForm.PARAM_FORM_NAME) %>"
             type="com.follett.fsc.destiny.client.common.servlet.NotesListForm" />

<%
int collectionType = form.getCollectionType();
%>

<table id="<%= NotesListForm.TABLE_NOTES %>" cellSpacing="0" cellPadding="2" width="98%">

<%-- The copy editor for LM and TM requires a different format, so don't display the header --%>
<logic:notPresent parameter="<%= NotesListForm.PARAM_SUPRESS_DEFAULT_HEADER %>">
    <tr>
        <td class="ColRowBold" colspan="2"><%= MessageHelper.formatMessage("shownotes_Notes") %></td>
        <td class="ColRowBold tdAlignRight" colspan="2" NOWRAP>
            <base:spanIfAllowed permissions='<%= CopyEditForm.ADD_NOTE_PERM %>' collectionType="<%=collectionType%>">
                <base:genericButton src="/buttons/large/addnote.gif" alt='<%= MessageHelper.formatMessage("addNote") %>' name="<%= NotesListForm.BUTTON_ADD_NOTE %>"/>
            </base:spanIfAllowed>
        </td>
    </tr>
</logic:notPresent>
<logic:present parameter="<%= NotesListForm.PARAM_SUPRESS_DEFAULT_HEADER %>">
    <%-- This prevents off-by-one madness for common acceptance test helpers. --%>
    <tr></tr>
</logic:present>
<%
    if (form.getNotesList().isEmpty()) {
%>
    <tr>
        <td valign="top" align="center" class="SmallColHeading" colspan="3">
        <% if (collectionType == CollectionType.ASSET) { %>
            <%= MessageHelper.formatMessage("shownotes_ThereAreNoNotesForThisItem") %>
        <% } else { %>
            <%= MessageHelper.formatMessage("shownotes_ThereAreNoNotesForThisCopy") %>
        <% } %>
        </td>
    </tr>

<%
    } else {
%>

    <logic:iterate name="form" property="notesList" id="note" type="com.follett.fsc.destiny.entity.ejb3.CopyNoteVO">
        <base:flipper key="shownotes">
            <td valign="top" class="ColRow">
                <logic:equal name="note" property="urgent" value="true">
                    <base:image src="/icons/general/flag.gif" width="19" height="16" alt='<%= MessageHelper.formatMessage("shownotes_CirculationFlag") %>'/>
                </logic:equal> 
                
                <logic:equal name="note" property="urgent" value="false">
                    &nbsp;
                </logic:equal>
            </td>

            <td valign="top" class="ColRow tdAlignLeft" width="100%">
                <%= HTMLHelper.filterHTMLConvertLineBreaks(note.getNoteText()) %>
            </td>
            <td valign="top" class="ColRow">
                <base:spanIfAllowed permissions='<%= CopyEditForm.ADD_NOTE_PERM %>' collectionType="<%=collectionType%>">
                  <base:genericButton src="/icons/general/edit.gif" alt='<%= MessageHelper.formatMessage("copystatus_EditNote") %>'
                      name='<%= NotesListForm.ACTION_EDIT_NOTE + note.getCopyNoteID() %>' />
                </base:spanIfAllowed>
            </td>

            <td valign="top" class="ColRow">
                <base:spanIfAllowed permissions='<%= CopyEditForm.ADD_NOTE_PERM %>' collectionType="<%=collectionType%>">
                  <base:genericButton src="/icons/general/delete.gif" alt='<%= MessageHelper.formatMessage("copystatus_DeleteNote") %>'
                      name='<%= NotesListForm.ACTION_DELETE_NOTE + note.getCopyNoteID() %>'/>
                </base:spanIfAllowed>
            </td>
        </base:flipper>
    </logic:iterate>
<%
    }
%>
</table>

