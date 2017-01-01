<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.PatronDeleteForm" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>



<base:messageBox strutsErrors="true"/>

<%
    PatronDeleteForm form = (PatronDeleteForm)request.getAttribute(PatronDeleteForm.FORM_NAME);
%>

<br>

<base:form action="/backoffice/servlet/handlepatrondeleteform.do">
    <html:hidden property="patronID"/>

        <%
            String message = null;
        %>
        <logic:equal name="<%= PatronDeleteForm.FORM_NAME %>" property="<%= PatronDeleteForm.PARAM_CAN_DELETE_PATRON %>" value="true">
            <% message = MessageHelper.formatMessage("patrondelete_ThisPatronWillBeDeleted"); %>
        </logic:equal>
        <logic:equal name="<%= PatronDeleteForm.FORM_NAME %>" property="<%= PatronDeleteForm.PARAM_CAN_DELETE_PATRON %>" value="false">
            <% message = MessageHelper.formatMessage("patrondelete_ThisPatronCannotBeDeleted"); %>
        </logic:equal>
        
        <base:messageBox showWarningIcon="true" message="<%=message%>">
            <tr valign="top">
                <td class="Error" colspan="2">
                    <bean:size id="numMsgs" name="backoffice_servlet_PatronDeleteForm" property="confirmationMessages"/>
                    <logic:notEqual name="numMsgs" value="0">
                            <logic:equal name="<%= PatronDeleteForm.FORM_NAME %>" property="<%= PatronDeleteForm.PARAM_CAN_DELETE_PATRON %>" value="true"><%=MessageHelper.formatMessage("patrondelete_TheFollowingActionsWillBeTakenIfThisPatronIsDelete") %></logic:equal>
                            <ul>
                            <logic:iterate id="messages" name="backoffice_servlet_PatronDeleteForm" property="confirmationMessages">
                                <li><%=messages%></li>
                            </logic:iterate>
                            </ul>
                    </logic:notEqual>
                </td>
            </tr>
            <logic:equal name="<%= PatronDeleteForm.FORM_NAME %>" property="<%= PatronDeleteForm.PARAM_CAN_DELETE_PATRON %>" value="true">
            <tr>
                <td align="center" class="ColRow" colspan="2"><%=MessageHelper.formatMessage("patrondelete_AreYouSureYouWantToDeleteThisPatron") %></td>
            </tr>
            <tr>
                <td align="center" class="Instruction" colspan="2"><%=MessageHelper.formatMessage("patrondelete_YouMayWantToPrintThisPageForYourRecords") %></td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2">
                    <base:yesNo/>
                </td>
            </tr>
            </logic:equal>
            <logic:equal name="<%= PatronDeleteForm.FORM_NAME %>" property="<%= PatronDeleteForm.PARAM_CAN_DELETE_PATRON %>" value="false">
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
                        <td class="ColRowBold"><%=MessageHelper.formatMessage("patrondelete_PatronInformation") %></td>
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
                        <td class="ColRowBold"><%=MessageHelper.formatMessage("patrondelete_Name") %></td>
                        <td class="ColRow"><bean:write name="backoffice_servlet_PatronDeleteForm" property="patronDisplayName"/></td>
                        <td class="ColRow"><base:imageSpacer width="100" height="1"/></td>
                        <td class="ColRowBold"><%=MessageHelper.formatMessage("patrondelete_Type") %></td>
                        <td class="ColRow"><bean:write name="backoffice_servlet_PatronDeleteForm" property="patronType"/></td>
                    </tr>
                    <tr>
                        <td class="ColRowBold"><%=MessageHelper.formatMessage("patrondelete_Barcode") %></td>
                        <td class="ColRow" colspan="4"><bean:write name="backoffice_servlet_PatronDeleteForm" property="patronBarcode"/></td>
                    </tr>

                </table>
               <!-- end box body -->
            </td>
        </tr>
    </base:outlinedTable>


