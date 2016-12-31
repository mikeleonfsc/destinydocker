<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.PatronSitePatronDeleteForm" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>


<base:messageBox strutsErrors="true"/>

<%
    PatronSitePatronDeleteForm form = (PatronSitePatronDeleteForm)request.getAttribute(PatronSitePatronDeleteForm.FORM_NAME);
 %>

<br>

<base:form action="/backoffice/servlet/handlepatronsitepatrondeleteform.do">
    <html:hidden property="patronID"/>

        <%
            String message = null;
        %>
        <logic:equal name="<%= PatronSitePatronDeleteForm.FORM_NAME %>" property="<%= PatronSitePatronDeleteForm.PARAM_CAN_DELETE_PATRON %>" value="true">
            <% message = MessageHelper.formatMessage("patronsitepatrondelete_ThisPatronWillBeDeleted"); %>
        </logic:equal>
        <logic:equal name="<%= PatronSitePatronDeleteForm.FORM_NAME %>" property="<%= PatronSitePatronDeleteForm.PARAM_CAN_DELETE_PATRON %>" value="false">
            <% message = MessageHelper.formatMessage("patronsitepatrondelete_ThisPatronCannotBeDeleted"); %>
        </logic:equal>
        
        <base:messageBox showWarningIcon="true" message="<%=message%>">
            <bean:size id="numMsgs" name="<%= PatronSitePatronDeleteForm.FORM_NAME %>" property="confirmationMessages"/>
            <logic:notEqual name="numMsgs" value="0">
                <tr valign="top">
                    <td class="Error" colspan="2">
                            <logic:equal name="<%= PatronSitePatronDeleteForm.FORM_NAME %>" property="<%= PatronSitePatronDeleteForm.PARAM_DISPLAY_DELETE_ACTION_TEXT %>" value="true"><%=MessageHelper.formatMessage("patronsitepatrondelete_TheFollowingActionsWillBeTakenIfThisPatronIsDelete") %></logic:equal>
                            <ul>
                            <logic:iterate id="messages" name="<%= PatronSitePatronDeleteForm.FORM_NAME %>" property="confirmationMessages">
                                <li><%=messages%></li>
                            </logic:iterate>
                            
                            <%if (form.getAssociatedSiteNamesList().size() > 0) { %>
                            <ul>
                            <logic:iterate id="siteNames" name="<%= PatronSitePatronDeleteForm.FORM_NAME %>" property="associatedSiteNamesList">
                                <li><%=siteNames%></li>
                            </logic:iterate>
                            </ul>
                            <% } %>
                            </ul>
                    </td>
                </tr>
            </logic:notEqual>
            <logic:equal name="<%= PatronSitePatronDeleteForm.FORM_NAME %>" property="<%= PatronSitePatronDeleteForm.PARAM_CAN_DELETE_PATRON %>" value="true">
            <tr>
                <td align="center" class="ColRow" colspan="2">
                <%if (form.getAssociatedSiteNamesList().size() > 0) { %>
                    <b><%=MessageHelper.formatMessage("patronsitepatrondelete_IfYouContinueOnlyTheLocalSiteInformation") %></b>
                    <br/>
                <%} %>
                <%=MessageHelper.formatMessage("patronsitepatrondelete_AreYouSure") %></td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2">
                    <base:yesNo/>
                </td>
            </tr>
            </logic:equal>
            <logic:equal name="<%= PatronSitePatronDeleteForm.FORM_NAME %>" property="<%= PatronSitePatronDeleteForm.PARAM_CAN_DELETE_PATRON %>" value="false">
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2">
                    <html:cancel><%=MessageHelper.formatMessage("ok") %></html:cancel>
                </td>
            </tr>
            </logic:equal>
        </base:messageBox>

</base:form>



    <base:outlinedTable borderColor="#c0c0c0">
         <tr valign=top>
            <td>
                <table width="100%">
                    <tr>
                        <!-- box header and special information -->
                        <td class="ColRowBold"><%=MessageHelper.formatMessage("patronsitepatrondelete_PatronInformation") %></td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td>
            <!-- Box body. All unused cells must contain a non-breaking space to keep Netscape from closing it up -->
            <!-- the left column is sixty percent in width and the right forty percent, information should be placed accordingly -->
                <table id="PatronBox" cellpadding"2">
                    <tr>
                    <td>
                    <base:patronSearchResultDisplay displayButtons="false" printerFriendly="false" patronValue="<%=form.getSitePatronValue() %>"/>
                    </td>
                    </tr> 
                </table>
               <!-- end box body -->
            </td>
        </tr>
    </base:outlinedTable>


