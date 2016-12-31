<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.LDAPEditMappingForm" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>

<%
    LDAPEditMappingForm form = (LDAPEditMappingForm)request.getAttribute(LDAPEditMappingForm.FORM_NAME);
%>

<base:form action="/district/servlet/handleldapeditmappingform.do">
    <html:hidden property="<%=LDAPEditMappingForm.FIELD_PATRON_TYPE_ID%>" />
    <html:hidden property="<%=LDAPEditMappingForm.FIELD_PATRON_TYPE_DESC%>" />
    <html:hidden property="<%=LDAPEditMappingForm.FIELD_SITE_NAME%>" />
    <table border="0" cellspacing="0" cellpadding="3" align="center" width="100%">
        <tr>
            <td align="center">
                <base:outlinedTable id="<%=LDAPEditMappingForm.TABLE_MAIN%>" borderColor='#c0c0c0' width="95%" cellpadding="3">
                    <tr>
                        <td class="MainHeader">Edit Mapping - 
                            <bean:write name="<%=LDAPEditMappingForm.FORM_NAME%>" property="<%=LDAPEditMappingForm.FIELD_PATRON_TYPE_DESC%>" filter="false"/>
                            ( <bean:write name="<%=LDAPEditMappingForm.FORM_NAME%>" property="<%=LDAPEditMappingForm.FIELD_SITE_NAME%>" filter="false" /> )
                        </td>
                        <td class="ColRowBold tdAlignRight" nowrap>
                            <base:showHideTag id="onSave">
                                <base:saveButton onclick="hideElementonSave()"/>&nbsp;<base:cancelButton/>
                            </base:showHideTag>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center">
                            <table id="<%=LDAPEditMappingForm.TABLE_SERVERS%>">
                                <tr>
                                    <td class="FormLabel tdAlignRight">
                                        Primary LDAP Server
                                    </td>
                                    <td class="ColRow">
                                        <bean:define id="sourceList"  name="<%= LDAPEditMappingForm.FORM_NAME %>" property="<%= LDAPEditMappingForm.FIELD_SERVER_LIST %>"/>
                                        <html:select property="<%= LDAPEditMappingForm.FIELD_PRIMARY_SERVER_ID %>">
                                            <html:options collection="sourceList" property="ldapSourceID" labelProperty="displayName"/>
                                        </html:select>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="FormLabel tdAlignRight">
                                        Secondary LDAP Server
                                    </td>
                                    <td class="ColRow" colspan="2">
                                        <bean:define id="sourceList"  name="<%= LDAPEditMappingForm.FORM_NAME %>" property="<%= LDAPEditMappingForm.FIELD_SERVER_LIST %>"/>
                                        <html:select property="<%= LDAPEditMappingForm.FIELD_SECONDARY_SERVER_ID %>">
                                            <html:options collection="sourceList" property="ldapSourceID" labelProperty="displayName"/>
                                        </html:select>
                                    </td>
                                </tr>
                                <tr><td colspan="2">&nbsp;</td></tr>
                            </table>
                        </td>
                    </tr>
                </base:outlinedTable>
            </td>
        </tr>
    </table>
</base:form>
