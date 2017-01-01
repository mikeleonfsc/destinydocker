<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.LdapSourceSpecs" %>
<%@ page import="com.follett.fsc.destiny.client.common.data.Tab"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    
%>
<base:messageBox strutsErrors="true"/>
<base:form action="/district/servlet/handleldapsetupform.do">
    <html:hidden property="<%=LDAPSetupForm.FIELD_LDAP_SOURCE_ID%>"/>

    <logic:equal name="<%=LDAPSetupForm.FORM_NAME%>" property="action" value="ConfirmDelete">
        <base:imageSpacer width="1" height="3"/>
        <base:messageBox message='<%= "The LDAP Server will be deleted." %>'>
            <tr>
                <td align="center" class="ColRow">Are you sure you want to delete this server?</td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRow">
                    <base:yesNo/>
                </td>
            </tr>
        </base:messageBox>
    </logic:equal>
    <table border="0" cellspacing="0" cellpadding="3" align="center" width="100%">
    <tr>
        <td align="center">
    
            <base:outlinedTable id="<%=LDAPSetupForm.TABLE_LDAP_SETUP%>" borderColor="#C0C0C0" width="95%">
            <tr>
               <td class="MainHeader">LDAP Setup</td>
               <td class="tdAlignRight">
                    <base:genericButton src="/buttons/large/editmapping.gif" name="<%= LDAPSetupForm.BUTTON_MAPPINGS %>" alt="Edit Mappings"/>   
               </td>
            </tr>
            <tr>
                <td colspan="2"><base:imageLine/></td>
            </tr>
            
            <tr>
               <td colspan="2">
                  <table id="<%=LDAPSetupForm.TABLE_SERVER_LIST%>" width="100%" cellspacing="0" cellpadding="1">
                     <logic:notEmpty name='<%=LDAPSetupForm.FORM_NAME%>' property="<%=LDAPSetupForm.FIELD_LDAP_SERVER_LIST%>">
                         <tr>
                         
                            <td class="SmallColHeading tdAlignLeft">            
                                <base:sortHeaderOutput description='<%=LDAPSetupForm.COLHEADINGS_DISPLAY_NAME%>'
                                      formName="<%=LDAPSetupForm.FORM_NAME%>" 
                                      sort='<%= "" + SortHelper.SORTBYLDAPSERVERNAME %>' />
                            </td>
                
                            <td class="SmallColHeading tdAlignLeft">Host Name</td>
                            <td class="SmallColHeading tdAlignLeft">Port</td>
                            <td class="SmallColHeading tdAlignLeft">Authentication</td>
                            <td class="tdAlignRight">
                                <base:genericButton src="/buttons/large/addserver.gif" name="<%= LDAPSetupForm.BUTTON_ADD_SERVER %>" alt="Add Server"/>
                            </td>
                         </tr>
                     </logic:notEmpty>
                     <logic:empty name='<%=LDAPSetupForm.FORM_NAME%>' property="<%=LDAPSetupForm.FIELD_LDAP_SERVER_LIST%>">
                         <tr>
                             <td class="ColRow" align="center" colspan="4">There are no LDAP servers configured.</td>
                             <td class="tdAlignRight">
                                <base:genericButton src="/buttons/large/addserver.gif" name="<%= LDAPSetupForm.BUTTON_ADD_SERVER %>" alt="Add Server"/>
                             </td>  
                         </tr>
                     </logic:empty> 
                     <logic:iterate id="server" name='<%=LDAPSetupForm.FORM_NAME%>' property="<%=LDAPSetupForm.FIELD_LDAP_SERVER_LIST%>" type="com.follett.fsc.destiny.entity.ejb3.LdapSourceVO">
                        <base:flipper key="ldapsetup">
                        <td valign="top" class="ColRow tdAlignLeft" >
                            <bean:write name="server" property="displayName" filter="true" />
                        </td>
                        <td valign="top" class="ColRow tdAlignLeft">
                            <bean:write name="server" property="hostName" filter="true" />
                        </td>
                        <td valign="top" class="ColRow tdAlignLeft">
                            <bean:write name="server" property="port" filter="true" />
                        </td>
                        <td valign="top" class="ColRow tdAlignLeft">
                            <% 
                               String[] authentication = LdapSourceSpecs.AuthEnumType.getDescArray();
                               out.print(authentication[server.getAuthenticationMethod()]);     
                            %>
                        </td>
                        <td class="tdAlignRight">
                            <base:link page='<%= "/district/servlet/presentldapaddeditserverform.do?action=edit&" + LDAPAddEditServerForm.PARAM_LDAP_SOURCE_ID + "=" + server.getLdapSourceID() %>'>
                                <base:image src="/icons/general/edit_40.gif" width="40" height="16"  alt='<%="Edit " + ResponseUtils.filter(server.getDisplayName()) %>'/>
                            </base:link>
                            <base:link page='<%= "/district/servlet/handleldapsetupform.do?action=delete&" + LDAPSetupForm.FIELD_LDAP_SOURCE_ID + "=" + server.getLdapSourceID() %>'>
                                <base:image src="/icons/general/delete_40.gif" width="40" height="16"  alt='<%="Delete " + ResponseUtils.filter(server.getDisplayName()) %>'/>
                            </base:link>
                        </td>               
                        </base:flipper>
                     </logic:iterate>
                  </table>
               </td>
            </tr>
            
            </base:outlinedTable>
            
        </td>
    </tr>
    </table>
</base:form>
        
        
