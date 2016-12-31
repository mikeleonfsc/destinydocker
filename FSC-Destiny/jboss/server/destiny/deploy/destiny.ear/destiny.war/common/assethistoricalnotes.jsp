<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.AssetItemEditForm"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.CopyStatusForm" %>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.HistoricalNoteViewVO" %>

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
             name="<%= request.getParameter(CopyStatusForm.PARAM_FORM_NAME) %>"
             type="java.lang.Object" />

<table id="<%= CopyStatusForm.TABLE_COPY_HIST_NOTES %>" cellSpacing="0" cellPadding="2" width="81%">

    <%-- The copy editor requires different formatting and a submit image instead of
     a simple link to add notes.  Thus we provide an option to suppress the
     header and just render the notes themselves. --%>
<logic:notPresent parameter="<%= NotesListForm.PARAM_SUPRESS_DEFAULT_HEADER %>">
    <tr>
        <td class="ColRowBold" colspan="2"><%= MessageHelper.formatMessage("assethistoricalnotes_HistoricalNotes")%></td>
    </tr>
</logic:notPresent>

    <%
    boolean hasNotes = false;
    if(request.getParameter(CopyStatusForm.PARAM_FORM_NAME).equals(AssetItemEditForm.FORM_NAME)){
        hasNotes = ((AssetItemEditForm)form).getAssetHistoricalNotesForViewing().size()==0;
    }else{
        hasNotes = ((com.follett.fsc.destiny.client.circulation.servlet.CopyStatusForm)form).getAssetHistoricalNotesForViewing().size()==0;
    }
   if (hasNotes) {%>
    <tr>
        <td valign="top" align="center" class="SmallColHeading" colspan="3">
            <%= MessageHelper.formatMessage("assethistoricalnotes_ThereAreNoHistoricalNotesForThisItem") %>
        </td>
    </tr>
    <%} else {%>
        <tr>
            <td valign="top" class="ColRowBold tdAlignLeft">Date</td>
            <td valign="top" class="ColRowBold tdAlignLeft">User</td>
            <td valign="top" class="ColRowBold tdAlignLeft">Note</td>
        </tr>
    <logic:iterate name="form" property="assetHistoricalNotesForViewing" id="note" type="com.follett.fsc.destiny.session.circulation.data.HistoricalNoteViewVO">
        <base:flipper key="shownotes">
            <td valign="top" class="ColRow tdAlignLeft" style="width:120px">
                <%= HTMLHelper.filterHTMLConvertLineBreaks(note.getDisplayableDate()) %>
            </td>
            <td valign="top" class="ColRow tdAlignLeft" style="width:200px">
                <%= HTMLHelper.filterHTMLConvertLineBreaks(note.getUserName()+" ["+AssetItemEditForm.getSiteShortName(note.getUserSiteID())+"]") %>
            </td>
            <td valign="top" class="ColRow tdAlignLeft">
                <%= HTMLHelper.filterHTMLConvertLineBreaks(note.getNote()) %>
            </td>
        </base:flipper>
    </logic:iterate>
<%
    }
%>
</table>
 

