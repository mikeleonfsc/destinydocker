<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.LDAPMappingsForm" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.LDAPEditMappingForm" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.util.URLHelper" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>

<%
    LDAPMappingsForm form = (LDAPMappingsForm)request.getAttribute(LDAPMappingsForm.FORM_NAME);
%>
<base:form action="/district/servlet/handleldapmappingsform.do">
    <html:hidden property="sort" />
    <table border="0" cellspacing="0" cellpadding="3" align="center" width="100%">
        <tr>
            <td align="center">
                <base:outlinedTable id="<%=LDAPMappingsForm.TABLE_MAIN%>" borderColor='#c0c0c0' width="95%" cellpadding="3">
                    <tr>
                        <td>
                            <table width="100%">
                                <tr>
                                     <td width="45%" class="MainHeader">LDAP Mappings</td>
                                     <td class="tdAlignRight">
                                        <base:genericButton src="/buttons/large/close.gif" name="<%= LDAPMappingsForm.BUTTON_CLOSE %>" alt="Close Mappings"/>   
                                    </td>
                                </tr>   
                                <tr>
                                    <td class="FormLabel tdAlignRight">
                                        Global Update Every Patron Type of
                                    </td>
                                    <td class="ColRow tdAlignLeft">
                                        <html:select property="<%= LDAPMappingsForm.FIELD_GENERIC_PATRON_TYPE %>">
                                          <html:options name="<%= LDAPMappingsForm.FORM_NAME %>" property="<%= LDAPMappingsForm.FIELD_GENERIC_PATRON_TYPE_LIST %>"/>
                                        </html:select>
                                      </td>
                                </tr>
                                <tr>
                                    <td class="FormLabel tdAlignRight">
                                        Change Primary LDAP Server to
                                    </td>
                                    <td class="ColRow tdAlignLeft">
                                        <bean:define id="sourceList"  name="<%= LDAPMappingsForm.FORM_NAME %>" property="<%= LDAPMappingsForm.FIELD_SERVER_LIST %>"/>
                                        <html:select property="<%= LDAPMappingsForm.FIELD_PRIMARY_SERVER_ID %>">
                                            <html:options collection="sourceList" property="ldapSourceID" labelProperty="displayName"/>
                                        </html:select>
                                    </td>
                                </tr>   
                                <tr>
                                    <td class="FormLabel tdAlignRight">
                                        Change Secondary LDAP Server to
                                    </td>
                                    <td class="ColRow tdAlignLeft">
                                        <bean:define id="sourceList"  name="<%= LDAPMappingsForm.FORM_NAME %>" property="<%= LDAPMappingsForm.FIELD_SERVER_LIST %>"/>
                                        <html:select property="<%= LDAPMappingsForm.FIELD_SECONDARY_SERVER_ID %>">
                                            <html:options collection="sourceList" property="ldapSourceID" labelProperty="displayName"/>
                                        </html:select>
                                    </td>
                                </tr>
                                <tr>
                                    <td align="center" colspan="2" valign="bottom" class="ColRowBold">
                                        <base:showHideTag id="onUpdate">
                                           <base:genericButton src="/buttons/large/update.gif" onclick="hideElementonUpdate()" name="<%= LDAPMappingsForm.BUTTON_UPDATE %>" alt="<%= LDAPMappingsForm.ALT_BUTTON_UPDATE %>" />
                                        </base:showHideTag>
                                    </td>
                                </tr>       
                                            
                            </table>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2"><base:imageLine/></td>
                    </tr>
                    <tr>
                        <td> 
                            <table id="<%=LDAPMappingsForm.TABLE_MAPPING_LIST%>" width="100%" cellspacing="0" cellpadding="1">
                                <tr>
                                    <td class="SmallColHeading tdAlignLeft">            
                                        <base:sortHeaderOutput description='<%=LDAPMappingsForm.COLHEADING_PATRON_TYPE%>' 
                                          formName="<%=LDAPMappingsForm.FORM_NAME%>" 
                                          sort='<%= "" + SortHelper.SORTBYPATRONTYPEDESCRIPTION %>' />
                                    </td>
                                    <td class="SmallColHeading tdAlignLeft">            
                                        <base:sortHeaderOutput description='<%=LDAPMappingsForm.COLHEADING_SITE_NAME%>' 
                                          formName="<%=LDAPMappingsForm.FORM_NAME%>" 
                                          sort='<%= "" + SortHelper.SORTBYSITENAME %>' />
                                    </td>
                                    <td class="SmallColHeading tdAlignLeft">            
                                        <base:sortHeaderOutput description='<%=LDAPMappingsForm.COLHEADING_PRI_SERVER%>'
                                          formName="<%=LDAPMappingsForm.FORM_NAME%>" 
                                          sort='<%= "" + SortHelper.SORTBYPRIMARYLDAPSERVERNAME %>' />
                                    </td>
                                    <td class="SmallColHeading tdAlignLeft">            
                                        <base:sortHeaderOutput description='<%=LDAPMappingsForm.COLHEADING_SEC_SERVER%>'
                                          formName="<%=LDAPMappingsForm.FORM_NAME%>" 
                                          sort='<%= "" + SortHelper.SORTBYSECONDARYLDAPSERVERNAME %>' />
                                    </td>
                                                                            
                                    <td class="tdAlignRight">&nbsp;</td>
                                </tr>
                                 <logic:iterate id="server" name='<%=LDAPMappingsForm.FORM_NAME%>' property="<%=LDAPMappingsForm.FIELD_MAPPINGS_LIST%>" type="com.follett.fsc.destiny.session.district.data.LdapMappingVO">
                                    <base:flipper key="ldapmaprap">
                                     
                                        <td class="tdAlignLeft ColRow">
                                            <bean:write name="server" property="patronTypeDescription" filter="false" />
                                        </td>
                                        <td class="tdAlignLeft ColRow">
                                            <bean:write name="server" property="siteName" filter="false" />
                                        </td>
                                        <td class="tdAlignLeft ColRow">
                                            <bean:write name="server" property="primaryServerDisplayName" filter="false" />
                                        </td>
                                        <td class="tdAlignLeft ColRow">
                                            <bean:write name="server" property="secondaryServerDisplayName" filter="false" />
                                        </td>
                                        <td class="tdAlignRight ColRow">
                                            <%  
                                                String link = URLHelper.addHREFParam("/district/servlet/presentldapeditmappingform.do", LDAPEditMappingForm.FIELD_PATRON_TYPE_ID, server.getPatronTypeID());
                                                       link = URLHelper.addHREFParam(link, LDAPEditMappingForm.FIELD_PATRON_TYPE_DESC, server.getPatronTypeDescription());
                                                       link = URLHelper.addHREFParam(link, LDAPEditMappingForm.FIELD_SITE_NAME, server.getSiteName());
                                                       link = URLHelper.addHREFParam(link, LDAPEditMappingForm.FIELD_PRIMARY_SERVER_ID, server.getPrimaryServerID());
                                                       link = URLHelper.addHREFParam(link, LDAPEditMappingForm.FIELD_SECONDARY_SERVER_ID, server.getSecondaryServerID());
                                            %>
                                            <base:link page="<%=link%>">
                                                <base:image src="/icons/general/edit_40.gif" width="40" height="16" alt='<%= "Edit " + ResponseUtils.filter(server.getPatronTypeDescription()) %>'/>
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



