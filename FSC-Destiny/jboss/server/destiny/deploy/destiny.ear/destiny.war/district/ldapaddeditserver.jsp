<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.LDAPAddEditServerForm" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.LdapSourceSpecs" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>


<bean:define id="form" name="<%=LDAPAddEditServerForm.FORM_NAME%>" type="LDAPAddEditServerForm"/>
<base:form action="/district/servlet/handleldapaddeditserverform.do" focus='<%=LDAPAddEditServerForm.FIELD_DISPLAY_NAME%>'>
<html:hidden property="<%=LDAPAddEditServerForm.PARAM_LDAP_SOURCE_ID%>" />
<html:hidden property="<%=LDAPAddEditServerForm.FIELD_ACTION%>" />
<bean:define id="sources" name="<%= LDAPAddEditServerForm.FORM_NAME %>" property="validAuthenticationMethods" />
<table width="100%">
    <tr>
        <td align="center">
            <base:outlinedTable id='<%= LDAPAddEditServerForm.TABLE_ADD_EDIT_SERVER %>' borderColor="#C0C0C0" width="95%">
                <tr>
                    <td class="TableHeading">
                        <bean:write name="<%=LDAPAddEditServerForm.FORM_NAME%>" property="pageHeaderTitle"/>
                    </td>
                    <td class="ColRowBold tdAlignRight">
                        <base:showHideTag id="onSave">
                            <base:saveButton onclick="hideElementonSave()"/>&nbsp;<base:cancelButton/>
                        </base:showHideTag>
                    </td>
                </tr>
                <tr>
                    <td class="FormLabel tdAlignRight">
                        User-Defined Display Name
                    </td>
                    <td class="ColRow tdAlignLeft">
                        <html:text property="<%=LDAPAddEditServerForm.FIELD_DISPLAY_NAME%>" size="55" maxlength="80"/>
                    </td>
                </tr>
                <tr>
                    <td class="FormLabel tdAlignRight">
                        Host Name / IP
                    </td>
                    <td class="ColRow tdAlignLeft">
                        <html:text property="<%=LDAPAddEditServerForm.FIELD_HOST_NAME%>" size="55" maxlength="128"/>
                    </td>
                </tr>
                <tr>
                    <td class="FormLabel tdAlignRight">
                        Port
                    </td>
                    <td class="ColRow tdAlignLeft">
                        <html:text property="<%=LDAPAddEditServerForm.FIELD_PORT%>" size="10" maxlength="5"/>
                    </td>
                </tr>
                <tr>
                    <td class="FormLabel tdAlignRight">
                        Distinguished Name (DN)
                    </td>
                    <td class="ColRow tdAlignLeft">
                        <html:text property="<%=LDAPAddEditServerForm.FIELD_DISTINGUISHED_NAME%>" size="80" maxlength="512"/>
                    </td>
                </tr>
                <tr>
                    <td class="FormLabel tdAlignRight">
                        Authentication
                    </td>
                
                    <td class="ColRowBold tdAlignLeft">
                        <html:select onchange="updateAuthPortOnChange()" property="<%=LDAPAddEditServerForm.FIELD_AUTHENTICATION_METHOD %>">
                            <html:options collection="sources" property="value" labelProperty="desc"/>
                        </html:select>
                    </td>
                </tr>               
            </base:outlinedTable>
        </td>
    </tr>
</table>

<script language="JavaScript">
<!--
    function updateAuthPortOnChange() {
             if ( document.district_servlet_LDAPAddEditServerForm.authenticationMethod.value == <%=LdapSourceSpecs.AUTHENTICATION_METHOD_SSL%> ) {
                    document.<%=LDAPAddEditServerForm.FORM_NAME%>.<%=LDAPAddEditServerForm.FIELD_PORT%>.value = <%=LDAPAddEditServerForm.DEFAULT_SSL_PORT%>;
             } else {
                    document.<%=LDAPAddEditServerForm.FORM_NAME%>.<%=LDAPAddEditServerForm.FIELD_PORT%>.value = <%=LDAPAddEditServerForm.DEFAULT_PORT%>;
             }

    }
//-->

</script>
</base:form>

