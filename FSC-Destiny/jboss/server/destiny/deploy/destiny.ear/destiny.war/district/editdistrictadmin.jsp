<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>


<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.buttons.OkButtonTag"%>

<%@page import="com.follett.fsc.destiny.entity.ejb3.EmailSpecs"%>
<base:messageBox strutsErrors="true"/>

<%
    EditDistrictAdminForm form = (EditDistrictAdminForm) request.getAttribute(EditDistrictAdminForm.FORM_NAME);
%>

<base:form action="/district/servlet/handleeditdistrictadminform.do" focus="<%= form.getFocus() %>" method="post">
<logic:equal name="<%=EditDistrictAdminForm.FORM_NAME%>" property="<%=EditDistrictAdminForm.PARAM_CONFIRM_CONSORTIUM_ADMIN_PASSWORD%>" value="true">

    <html:hidden property="<%=EditDistrictAdminForm.PARAM_CONFIRM_CONSORTIUM_ADMIN_PASSWORD%>"/>
        <base:imageSpacer width="1" height="3"/>
        <base:messageBox showWarningIcon="true" filterMessage="true" message='The password for Destiny Administrator will be changed.'>
            <tr>
                <td align="center" class="ColRow" colspan="2">
                   To continue, please enter the Super Administrator password:
                </td>
            </tr>
            <tr>
                <td align="center" class="ColRow" colspan="2">
                    <input type="password" name="<%=EditDistrictAdminForm.FIELD_PASSWORD%>" size="14" maxlength="20" autocomplete="off"/>
                </td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2">
                    <html:submit property="<%=OkButtonTag.BUTTON_NAME %>">
                      OK
                    </html:submit>
                    <html:cancel>
                      Cancel
                    </html:cancel>
                </td>
            </tr>
        </base:messageBox>
</logic:equal>

<logic:equal name="<%=EditDistrictAdminForm.FORM_NAME%>" property="<%=EditDistrictAdminForm.PARAM_CONFIRM_CONSORTIUM_ADMIN_PASSWORD%>" value="false">

<table border="0" cellspacing="0" cellpadding="3" align="center">
<tr>
    <td>
        <base:outlinedTable id="<%=EditDistrictAdminForm.TABLE_MASTER %>" borderColor="#c0c0c0" width="100%">
                <tr>
                    <td class="FormLabel tdAlignRight">
                        User Name
                    </td>
                    <td class="ColRow">
                      destinyadmin
                    </td>
                </tr>
            <%
            SessionStoreProxy store = form.getStore();
            if (!store.isConsortiumAdminLoggedIn()) {
            %>
                <tr>
                    <td class="FormLabel tdAlignRight">
                        Current Password
                    </td>
                    <td>
                        <input type="password" name="<%=EditDistrictAdminForm.FIELD_PASSWORD%>" size="14" maxlength="20" autocomplete="off"/>
                    </td>
                </tr>
            <%} %>
            <tr>
                <td class="FormLabel tdAlignRight">
                    New Password
                </td>
                <td>
                    <input type="password" name="<%=EditDistrictAdminForm.FIELD_NEW_PASSWORD%>" size="14" maxlength="20" autocomplete="off"/>
                </td>
            </tr>
            <tr>
                <td class="FormLabel tdAlignRight">
                    Confirm New Password
                </td>
                <td>
                    <input type="password" name="<%=EditDistrictAdminForm.FIELD_CONFIRM_PASSWORD%>" size="14" maxlength="20" autocomplete="off"/>
                </td>
            </tr>
            <tr><td colspan="2"><base:imageLine/></td></tr>
            <tr>
                <td class="FormLabel tdAlignRight">
                    Contact Name
                </td>
                <td>
                  <html:text property="<%=EditDistrictAdminForm.FIELD_CONTACT_NAME%>" size="25" maxlength="80"/>
                </td>
            </tr>
            
            <tr>
                <td class="FormLabel tdAlignRight">
                    Phone Number
                </td>
                <td>
                  <html:text property="<%=EditDistrictAdminForm.FIELD_PHONE_NUMBER%>" size="20" maxlength="40"/>
                </td>
            </tr>
            
            <tr>
                <td class="FormLabel tdAlignRight">
                    Email
                </td>
                <td>
                  <html:text property="<%=EditDistrictAdminForm.FIELD_EMAIL%>" size="20" maxlength='<%="" + EmailSpecs.EMAIL_MAX_LENGTH %>'/>
                </td>
            </tr>
            <tr><td colspan="2" class="ColRow"><font color="#cc0000">Please verify that the Destiny Administrator's contact information is accurate and up-to-date.</font></td></tr>            
            
        </base:outlinedTable>
    </td>
</tr>
<tr>
    <td align="center" class="ColRowBold">
        <base:showHideTag id="onSave">
            <base:saveButton onclick="hideElementonSave()" name="submit"/>
            &nbsp;
            <base:cancelButton/>
        </base:showHideTag>
    </td>
</tr>
</table>
</logic:equal>

</base:form>
