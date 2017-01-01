<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.CreateHelpTicketForm"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.BaseTitleDetailForm" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>

<%
    CreateHelpTicketForm form = (CreateHelpTicketForm)request.getAttribute(CreateHelpTicketForm.FORM_NAME);
%>

<base:form action="/cataloging/servlet/handlecreatehelpticketform.do">
    <base:outlinedTable id="<%=CreateHelpTicketForm.TABLE_MAIN%>" borderColor="#C0C0C0">
        <tr>
            <td>
                <table id="<%=CreateHelpTicketForm.TABLE_ASSET_DETAILS%>" border="0" cellpadding="3" cellspacing="0" width="100%">
                    <tr>
                        <td class="TableHeading">
                            <table border="0">
                                <tr>
                                    <td>
                                        <bean:write name="<%= CreateHelpTicketForm.FORM_NAME %>" property="assetDescription"/>
                                        <bean:write name="<%= CreateHelpTicketForm.FORM_NAME %>" property="barcodeWithParenthesis"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <span class="ColRow" style="color: black; font-weight: normal;">
                                            <b>Serial Number: </b>
                                            <bean:write name="<%= CreateHelpTicketForm.FORM_NAME %>" property="serialNumber"/>
                                            &nbsp;
                                            <b>Home Location: </b>
                                            <bean:write name="<%= CreateHelpTicketForm.FORM_NAME %>" property="homeLocation"/>
                                        </span>
                                    </td>
                                </tr>
                            </table>
                        </td>
                        <td class="tdAlignRight">
                            <table border="0">
                                <tr>
                                    <td>
                                        <base:genericButton src="/buttons/large/saveandsend.gif" name="<%= CreateHelpTicketForm.BUTTON_SAVE_AND_SEND %>" alt="<%= CreateHelpTicketForm.ALT_SAVE_AND_SEND %>"  />
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <base:cancelButton/>
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td align="center">
                <base:imageLine height="1" width="100%" />
            </td>
        </tr>
        <tr>
            <td>
                <table border="0" cellpadding="3" cellspacing="0" width="100%">
                    <tr class="TableHeading">
                        <td align="center" width="50%">
                            Issue
                        </td>
                        <td align="center" width="50%">
                            Contact Information
                        </td>
                    </tr>
                    <tr>
                        <td width="50%">
                            <table border="0" cellpadding="3" cellspacing="0" width="100%">
                                <tr>
                                    <td class="ColRowBold" align="right">
                                        * Problem Summary
                                    </td>
                                    <td class="ColRow" align="left">
                                        <textarea name="<%= CreateHelpTicketForm.FIELD_SUMMARY %>" rows="2" cols="25" maxlength="255"><%= form.getSummary() %></textarea>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="ColRowBold" align="right">
                                        Details
                                    </td>
                                    <td class="ColRow" align="left">
                                        <textarea name="<%= CreateHelpTicketForm.FIELD_DETAILS %>"rows="2" cols="25" maxlength="1000"><%= form.getDetails() %></textarea>
                                    </td>
                                </tr>
                                <tr>
                                    <td colspan="2"></td>
                                </tr>
                            </table>
                        </td>
                        <td width="50%">
                            <table id="<%=CreateHelpTicketForm.ID_PATRON_TABLE %>" border="0" cellpadding="3" cellspacing="0" width="100%">
                                <tr>
                                    <td class="ColRowBold" id="<%=CreateHelpTicketForm.ID_NAME_LABEL %>" align="right" width="40%" style="padding-right: 20px">
                                        * Name
                                    </td>
                                    <td class="ColRow" id="<%= CreateHelpTicketForm.ID_FIRST_LAST_NAME %>" width="30%">
                                        <label id="<%= CreateHelpTicketForm.FIELD_FIRST_LAST_NAME %>"><%= form.getFirstLastName() %></label> 
                                    </td>
                                    <td align="left">
                                        <!-- District users and those with patron search hallpass permission can change requestor -->
                                        <logic:equal name="<%= CreateHelpTicketForm.FORM_NAME %>" property="showSelect" value="true">
                                            <base:genericButton alt="<%= CreateHelpTicketForm.ALT_SELECT %>" name="<%= CreateHelpTicketForm.BUTTON_SELECT %>" src="/buttons/large/selectplus.gif" />
                                        </logic:equal>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="ColRowBold" id="<%=CreateHelpTicketForm.ID_EMAIL_LABEL %>" align="right" style="padding-right: 20px">
                                        Email
                                    </td>
                                    <td class="ColRow" colspan="2">
                                        <input type="text" name="<%= CreateHelpTicketForm.FIELD_EMAIL %>" maxlength="200" size="16" value="<%= form.getEmail() %>"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="ColRowBold" id="<%=CreateHelpTicketForm.ID_PHONE_LABEL %>" align="right" style="padding-right: 20px">
                                        Phone
                                    </td>
                                    <td colspan="2">
                                        <input class="ColRow" type="text" name="<%= CreateHelpTicketForm.FIELD_PHONE %>" maxlength="30" size="16" value="<%= form.getPhone() %>"/>
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td>
                <span class="Instruction"
                style="color: black; font-weight: lighter;"> * = required
                    field </span>
            </td>
        </tr>
    </base:outlinedTable>
</base:form>
