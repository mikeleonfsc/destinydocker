<%@page import="org.apache.catalina.manager.JspHelper"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.ConfigSiteSpecs"%>
<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.HelpTicketSpecs" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.RoleSpecs"%>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
 

<bean:define id="form" name="<%= HelpTicketResolutionForm.FORM_NAME %>" type="com.follett.fsc.destiny.client.backoffice.servlet.HelpTicketResolutionForm"/>

<%
    boolean printerFriendly = form.isPrinterFriendly();

    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>

<base:messageBox strutsErrors="true"/>
  
<base:form action="/backoffice/servlet/handlehelpticketresolutionform.do">

    <html:hidden property="<%=HelpTicketResolutionForm.FIELD_SHOW_DUPLICATE_TICKET%>"/>

    <script language="JavaScript" type="text/javascript">
    <!--
    function enableDuplicateTicketDescription() { 
    	if (document.<%=HelpTicketResolutionForm.FORM_NAME%>.<%=HelpTicketResolutionForm.FIELD_SELECTED_RESOLUTION%>.value == <%= HelpTicketSpecs.RESOLUTION_TYPE_DUPLICATE %>) {
            document.<%=HelpTicketResolutionForm.FORM_NAME%>.<%=HelpTicketResolutionForm.FIELD_SHOW_DUPLICATE_TICKET%>.value = true;           
            document.<%=HelpTicketResolutionForm.FORM_NAME%>.submit();
    	} else if (document.<%=HelpTicketResolutionForm.FORM_NAME%>.<%=HelpTicketResolutionForm.FIELD_SHOW_DUPLICATE_TICKET%>.value == "true") {
            document.<%=HelpTicketResolutionForm.FORM_NAME%>.<%=HelpTicketResolutionForm.FIELD_SHOW_DUPLICATE_TICKET%>.value = false;           
            document.<%=HelpTicketResolutionForm.FORM_NAME%>.submit();
    	} 
        return false;
    }
    -->
    </script>

    <base:outlinedTable id="<%= HelpTicketResolutionForm.TABLE_MAIN %>" width="100%" borderColor="#C0C0C0" >
        <tr>
            <td>
                <table id="<%= HelpTicketResolutionForm.TABLE_RESOLUTION %>">
                    <tr>
                        <td class="TableHeading" colspan="2">
                            Resolution
                        </td>
                    </tr>
                    <tr>
                        <td class="ColRowBold tdAlignRight">
                            Resolution
                        </td>
                        <td>
                            <table width="100%">
                                <tr>
                                    <td>
                                        <%=JSPHelper.renderDropDown(HelpTicketResolutionForm.FIELD_SELECTED_RESOLUTION, "enableDuplicateTicketDescription()", form.getResolutions(), form.getSelectedResolution()) %>
                                    </td>
                                    <td>
                                        <input type="image" src='<%=lh.getLocalizedImagePath("/buttons/large/other.gif")%>' border="0" name="<%= HelpTicketResolutionForm.BUTTON_OTHER %>" value="<%= HelpTicketResolutionForm.BUTTON_OTHER %>" />
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                    <% if (form.isShowDuplicateTicketField()) { %>
                        <tr>
                            <td class="ColRowBold tdAlignRight">
                                Duplicate Ticket
                            </td>
                            <td class="ColRow tdAlignLeft">
                                <input type="text" name="<%= HelpTicketResolutionForm.FIELD_DUPLICATE_TICKET_NUMBER %>" value="<%= form.getDuplicateTicketNumber() %>"/>
                            </td>
                        </tr>
                    <% } %>
                    <tr>
                        <td class="ColRowBold tdAlignRight">
                            * Resolution Description
                        </td>
                        <td class="ColRow tdAlignLeft">
                            <textarea name="<%= HelpTicketResolutionForm.FIELD_RESOLUTION_DESCRIPTION %>"rows="3" cols="25" maxlength="1000"><%= form.getResolutionDescription() %></textarea>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" class="Instruction" style="color: black; font-weight: lighter;">
                            * Required Field
                        </td>
                    </tr>
                </table>
            </td>
            <td valign="top">
                <table id="<%= HelpTicketResolutionForm.TABLE_BUTTONS %>">
                    <tr>
                        <td>
                        &nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="image" src='<%=lh.getLocalizedImagePath("/buttons/large/save.gif")%>' border="0" name="<%= HelpTicketResolutionForm.BUTTON_SAVE %>" value="<%= HelpTicketResolutionForm.BUTTON_SAVE %>" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="image" src='<%=lh.getLocalizedImagePath("/buttons/large/cancel.gif")%>' border="0" name="<%= HelpTicketResolutionForm.BUTTON_CANCEL %>" value="<%= HelpTicketResolutionForm.BUTTON_CANCEL %>" />
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </base:outlinedTable>
</base:form>
