<%@page language="java" %>
<%@page contentType="text/html; charset=UTF-8" %>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%>
<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.OrderNotesViewForm"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.data.OrderNoteClientVO"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.OrderNoteVO"%>
<%@page import="org.apache.struts.util.ResponseUtils"%>

<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    OrderNotesViewForm form = (OrderNotesViewForm) request.getAttribute(OrderNotesViewForm.FORM_NAME);
    SessionStoreProxy store = form.getStore();
    String focusControl = "";
    if ( !form.isReadOnly() ) {
        focusControl = OrderNotesViewForm.FIELD_NOTE; 
    }
%>


<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.OrderNotesViewForm.Note"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%><base:form action="/cataloging/servlet/handleordernotesviewform.do" focus="<%=focusControl%>" enctype="multipart/form-data">
<html:hidden property="<%= OrderNotesViewForm.PARAM_ORDER_ID %>"/>
<html:hidden property="<%= OrderNotesViewForm.PARAM_TRANSFER_TYPE %>"/>

<base:outlinedTable id="<%=OrderNotesViewForm.TABLE_MAIN%>" borderColor="<%=FlipperTag.ROW_GRAY%>" align="center" width="100%">
    <% if (!form.isReadOnly()) { %>
        <tr>
            <td class="TableHeading" valign="top" colspan="2">
                Notes
            </td>
        </tr>
        <tr>
            <td class="ColRow">
                <html:textarea property="<%=OrderNotesViewForm.FIELD_NOTE%>" rows="2" cols="40"/>
                <base:genericButton src="/buttons/small/add.gif" absbottom="false" alt="<%=OrderNotesViewForm.ALT_ADD_NOTE%>" name="<%=OrderNotesViewForm.BUTTON_ADD%>"/>
            </td>
            <td class="tdAlignRight">
                <base:closeButton absbottom="true" withX="true"/>
            </td>
        </tr>
    <% } else { %>
        <tr>
            <td class="TableHeading" valign="top">
                Notes
            </td>
            <td class="tdAlignRight">
                <base:closeButton absbottom="true" withX="true"/>
            </td>
        </tr>
    <% } %>
<%  if(form.getNotes().size() > 0) {%>    
    <tr>
        <td class="TableHeading" colspan="2">
            <base:imageLine/>
        </td>
    </tr>
<% } %>    
<%
    Iterator<OrderNotesViewForm.Note> iter = form.getNotes().iterator();
    int counter = 0;
    while (iter.hasNext()) {
       Note rec = iter.next();
       if (counter % 2 == 0) {
%>
    <tr bgcolor="<%=FlipperTag.ROW_GRAY%>" width="100%">
<%     } else { %> 
    <tr width="100%">
<%     } %>
        <td class="ColRow" colspan="2">
        <b><%=UserContext.getMyContextLocaleHelper().formatDate(rec.getCreated()) %> - <%= ResponseUtils.filter(rec.getSiteName()) %></b> (<%= ResponseUtils.filter(rec.getUserName()) %>): <%= ResponseUtils.filter(rec.getNoteText()) %>
        </td>
    </tr>
    <% counter++; %>
<% } %>
    </tr>
</base:outlinedTable>
</base:form>
