<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    BlockConfirmForm form = (BlockConfirmForm)request.getAttribute(BlockConfirmForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true"/>

<base:form action="/circulation/servlet/handleblockconfirmform.do" focus='<%=BlockConfirmForm.FIELD_USERNAME%>'>

    <html:hidden property="blockMessages"/>
    <html:hidden property="<%=BlockConfirmForm.OVERRIDE_USERDEFINED%>"/>
    <html:hidden property="actionBlocked"/>
    <html:hidden property="renewAll"/>
    <html:hidden property="currentPatronName"/>
    <html:hidden property="currentPatronBarcode"/>
    <html:hidden property="<%=BlockConfirmForm.PARAM_COLLECTION_TYPE%>"/>    
    <base:outlinedTable>
        <tr valign="top">
            <td>
                <base:messageBox showWarningIcon="false" showRedBorder="true">
                <tr>
                    <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                    <td valign="baseline" class="Error">
                            <logic:present name="circulation_servlet_BlockConfirmForm" property="actionBlocked" scope="request" >
                                <%= MessageHelper.formatMessage("blockconfirm_TransactionBlocked") %> <base:helpTag helpFileName="c_block_info_messages.htm"/>
                            </logic:present>
                            <bean:write property="blockMessages" name="<%=BlockConfirmForm.FORM_NAME%>" filter="false"/>
                            <%
                                if (form.isSSOOnly()) {
                            %>
                                <p align="center"><%=MessageHelper.formatMessage("blockconfirm_ToOverrideThisBlockEnterAnAuthorizedCode")%></p>
                            <%
                                } else {
                            %>
                                <p align="center"><%=MessageHelper.formatMessage("blockconfirm_ToOverrideThisBlockEnterAnAuthorizedUsersNameAnd")%></p>
                            <%
                                }
                            %>
                    </td>
                </tr>
                </base:messageBox>
            </td>
        </tr>
        <tr>
            <td>
                <table id="<%=BlockConfirmForm.TABLE_CONTROLS%>" align="center" border="0" cellspacing="5" cellpadding="0">
                <%
                    if (form.isSSOOnly()) {
                %>
                  <tr>
                    <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("blockconfirm_BlockOverrideCode") %></td>
                    <td>
                      <input type="password" name="<%=BlockConfirmForm.FIELD_BLOCKOVERRIDECODE%>" size="10" maxlength="8" autocomplete="off"/>                      
                    </td>
                  </tr>
                <% } else { %>
                  <tr>
                    <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("blockconfirm_UserName") %></td>
                    <td>
                      <input type="text" name="<%=BlockConfirmForm.FIELD_USERNAME%>" size="20" maxlength="20" autocomplete="off"/>                      
                    </td>
                  </tr>
                  <tr>
                    <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("blockconfirm_Password") %></td>
                    <td>
                        <input type="password" name="<%=BlockConfirmForm.FIELD_PASSWORD%>" size="20" maxlength="20" autocomplete="off"/>
                    </td>
                  </tr>
                <% } %>
                  <tr>
                    <td colspan="2" align="center" class="FormElement">
                      <base:genericButton src="/buttons/large/override.gif" alt='<%= MessageHelper.formatMessage("override") %>' name="<%= BlockConfirmForm.BUTTON_NAME_OVERRIDE %>" />
                      &nbsp;
                      <base:cancelButton name="<%= BlockConfirmForm.BUTTON_NAME_CANCEL %>" />
                    </td>
                  </tr>
                </table>
            </td>
        </tr>
    </base:outlinedTable>
</base:form>
