<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@page import="com.follett.fsc.destiny.client.district.servlet.NetworkAccessSetupForm"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@page import="com.follett.fsc.destiny.client.district.servlet.NetworkAccessEditForm"%>
<%@page import="com.follett.fsc.common.StringHelper"%><base:messageBox strutsErrors="true"/>

<%
    NetworkAccessSetupForm form = (NetworkAccessSetupForm)request.getAttribute(NetworkAccessSetupForm.FORM_NAME);
%>
<base:form action="/district/servlet/handlenetworkaccesssetupform.do">
<html:hidden property="<%=NetworkAccessSetupForm.PARAM_NETWORK_CONFIG_ID%>"/>
        <c:if test="<%=NetworkAccessSetupForm.PARAM_DELETE.equals(request.getParameter(NetworkAccessSetupForm.PARAM_ACTION))%>">
            <base:messageBox showWarningIcon="true" message="<%=form.gimmeConfirmationMessage()%>" filterMessage="false">
            <tr>
                <td class="ColRowBold" width="100%" align="center" colspan="2">
                    <base:yesNo />
                </td>
            </tr>
            </base:messageBox>
        </c:if>
    <table border="0" cellspacing="0" cellpadding="3" align="center" width="100%">
        <tr>
            <td align="center">
                <base:outlinedTable id="<%=NetworkAccessSetupForm.TABLE_MAIN%>" borderColor='#c0c0c0' width="95%" cellpadding="3">
                    <tr>
                        <td class="MainHeader tdAlignLeft">Configure District Digital Content Access 
                        </td>
                        <td class="ColRowBold tdAlignRight" nowrap>
                            &nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <table id="<%=NetworkAccessSetupForm.TABLE_CONFIGURED_ADDRESSES%>" width="100%">
                                <tr>
                                    <td class="ColRowBold tdAlignLeft">
                                        Currently Configured Addresses...
                                    </td>
                                    <td class="ColRow">&nbsp;</td>
                                </tr>                            
                     <logic:notEmpty name='<%=NetworkAccessSetupForm.FORM_NAME%>' property="<%=NetworkAccessSetupForm.FIELD_ADDRESS_LIST%>">
                         <tr>
                         
                            <td class="SmallColHeading" width="50%">
                                <%=NetworkAccessSetupForm.COLHEADING_IPADDRESS%>            
                            </td>
                            <td class="SmallColHeading" width="40%"><%=NetworkAccessSetupForm.COLHEADING_PERMISSION%></td>
                            <td class="tdAlignRight" width="10%">
                                <base:genericButton src="/buttons/large/addnew.gif" name="<%= NetworkAccessSetupForm.BUTTON_ADD_ADDRESS %>" alt="Add Address"/>
                            </td>
                         </tr>
                     </logic:notEmpty>
                     <logic:empty name='<%=NetworkAccessSetupForm.FORM_NAME%>' property="<%=NetworkAccessSetupForm.FIELD_ADDRESS_LIST%>">
                         <tr>
                             <td class="ColRow" align="center" colspan="4">There are no addresses configured. All addresses have access to digital content.</td>
                             <td class="tdAlignRight">
                                <base:genericButton src="/buttons/large/addnew.gif" name="<%= NetworkAccessSetupForm.BUTTON_ADD_ADDRESS %>" alt="Add Address"/>
                             </td>  
                         </tr>
                     </logic:empty> 
                     <% int flipper = 0; %>
                     <logic:iterate id="address" name='<%=NetworkAccessSetupForm.FORM_NAME%>' property="<%=NetworkAccessSetupForm.FIELD_ADDRESS_LIST%>" type="com.follett.fsc.destiny.session.district.data.NetworkConfigVO">
                         <% if ( ( flipper++ & 1 ) == 0 ) { %>
                             <tr class="ColRow" bgcolor="#E8E8E8">
                         <% } else { %>
                             <tr class="ColRow">
                         <% } %>
                         
                     
                        <td valign="top">
                            <bean:write name="address" property="ipPlusMask" filter="true" />
                        </td>
                        <td valign="top">
                            <bean:write name="address" property="displayableAllow" filter="true" />
                        </td>
                        <td class="tdAlignRight">
                            <base:link page='<%= "/district/servlet/presentnetworkaccesseditform.do?" + NetworkAccessSetupForm.PARAM_NETWORK_CONFIG_ID + "=" + address.getNetworkConfigID() %>'>
                                <base:image src="/icons/general/edit_40.gif" width="40" height="16"  alt="<%=NetworkAccessSetupForm.BUTTON_ALT_EDIT_IP %>"/>
                            </base:link>
                            <base:link page='<%= "/district/servlet/handlenetworkaccesssetupform.do?action=delete&" + NetworkAccessSetupForm.PARAM_NETWORK_CONFIG_ID + "=" + address.getNetworkConfigID() %>'>
                                <base:image src="/icons/general/delete_40.gif" width="40" height="16"  alt="<%=NetworkAccessSetupForm.BUTTON_ALT_DELETE_IP %>"/>
                            </base:link>
                        </td>               
                     </logic:iterate>
                            </table>
                        </td>
                    </tr>
                </base:outlinedTable>
            </td>
        </tr>
    </table>
</base:form>
