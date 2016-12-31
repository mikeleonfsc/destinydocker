<%@page import="org.apache.struts.util.ResponseUtils"%>
<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%    DeclinedNoteForm form = (DeclinedNoteForm)request.getAttribute(DeclinedNoteForm.FORM_NAME); %>

	<TABLE  id="<%=DeclinedNoteForm.TABLE_HOLD_NOTE%>" cellSpacing=0 cellPadding=3 width="100%" border=0>
		<TR>
			<TD class="TableHeading"><%= form.formatPageTitle() %></TD>
		</TR>
		<TR>
			<td class="ColRow">
<%
    if (form.getHoldNote() != null) {
%>
            &nbsp;&nbsp;<bean:write name="<%=DeclinedNoteForm.FORM_NAME%>" property="<%=DeclinedNoteForm.FIELD_HOLD_NOTE%>" />
<%
    } else if (form.getDeclinedILLNotes() != null) {
%>

        <table  id="<%=DeclinedNoteForm.TABLE_DECLINED_ILL_NOTES%>" cellSpacing=4 cellPadding=3 border=0>
            <tr>
                <td class="ColHeading"><%= MessageHelper.formatMessage("declinednote_DateAmpTime") %></td>
                <td class="ColHeading"><%= MessageHelper.formatMessage("declinednote_DeclinedAt") %></td>
                <td class="ColHeading"><%= MessageHelper.formatMessage("declinednote_DeclinedBy") %></td>
                <td class="ColHeading"><%= MessageHelper.formatMessage("declinednote_Reason") %></td>
            </tr>
            <logic:iterate id="note" name='<%=DeclinedNoteForm.FORM_NAME%>' property="declinedILLNotes" type="com.follett.fsc.destiny.session.circulation.data.HoldDeclinedNoteVO">
                <tr>
                    <td><%=ResponseUtils.filter(note.getDeclinedDateTimeString()) %></td>
                    <td><%=ResponseUtils.filter(note.getSiteName()) %></td>
                    <td><%=ResponseUtils.filter(note.getDeclinedByUserName()) %></td>
                    <td><%=ResponseUtils.filter(note.getDeclinedNote()) %></td>
                </tr>
            </logic:iterate>
        </table>
<%
    }
%>
			</TD>
		</TR>
		<TR>
            <TD valign="top" align="center">
            	<br/>
            	<br/>
                <a href="javascript:window.close();" class="detailLink"><base:image src="/buttons/large/close.gif" alt='<%= MessageHelper.formatMessage("close") %>'/></a>
            </TD>
		</TR>
	</TABLE>
