<%@page import="com.follett.fsc.destiny.entity.ejb3.ConfigSiteSpecs"%>
<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
 

<bean:define id="form" name="<%= AddHelpTicketNoteForm.FORM_NAME %>" type="com.follett.fsc.destiny.client.backoffice.servlet.AddHelpTicketNoteForm"/>

<base:messageBox strutsErrors="true"/>
  
<base:form action="/backoffice/servlet/handleaddhelpticketnoteform.do" focus="<%= AddHelpTicketNoteForm.FIELD_DESCRIPTION %>">
    <base:outlinedTable id="<%= AddHelpTicketNoteForm.TABLE_MAIN %>" width="300" borderColor="#C0C0C0" >
        <tr>
            <td>
                <table id="<%= AddHelpTicketNoteForm.TABLE_NOTE %>">
                    <tr>
                        <td class="TableHeading">
                            Add Note
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <img src="/images/icons/general/spacer.gif" width="20" height="1">
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td class="ColRow" align="left" id="<%= AddHelpTicketNoteForm.FIELD_DESCRIPTION%>">
                <textarea name="<%= AddHelpTicketNoteForm.FIELD_DESCRIPTION %>"rows="10" cols="50" maxlength="1000" autofocus="autofocus"><%= form.getDescription() %></textarea>
            </td>
            <td valign="top" class="mediumColHeading">
                <table border="0" cellpadding="0" cellspacing="0">
                    <tr>
                        <td align="center">
                            <base:genericButton src="/buttons/large/savenote.gif" name="<%= AddHelpTicketNoteForm.BUTTON_NAME_SAVE_NOTE %>" alt="<%= AddHelpTicketNoteForm.ALT_SAVE_BUTTON %>"/>
                        </td>
                    </tr>
                    <tr>
                        <td align="center">
                            <base:cancelButton name="<%= AddHelpTicketNoteForm.BUTTON_NAME_CANCEL%>"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </base:outlinedTable>
</base:form>
