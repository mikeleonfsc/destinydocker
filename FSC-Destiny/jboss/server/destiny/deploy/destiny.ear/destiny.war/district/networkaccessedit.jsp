<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@page import="com.follett.fsc.destiny.client.district.servlet.NetworkAccessEditForm"%>
<c:set var="form" value="<%=request.getAttribute(NetworkAccessEditForm.FORM_NAME)%>"/>
<base:messageBox strutsErrors="true"/>

<base:form action="/district/servlet/handlenetworkaccesseditform.do" focus="<%=NetworkAccessEditForm.FIELD_IP_1%>">
<html:hidden property="<%=NetworkAccessEditForm.PARAM_NETWORK_CONFIG_ID%>"/>
    <table border="0" cellspacing="0" cellpadding="3" align="center" width="100%">
        <tr>
            <td align="center">
                <base:outlinedTable id="<%=NetworkAccessEditForm.TABLE_MAIN%>" borderColor='#c0c0c0' width="95%" cellpadding="3">
                    <tr>
                        <td class="TableHeading tdAlignLeft">
                            Define Access
                        </td>
                        <td class="ColRowBold tdAlignRight">
                            <base:showHideTag id="onSave">
                                <base:saveButton onclick="hideElementonSave()"/>&nbsp;<base:cancelButton/>
                            </base:showHideTag>
                        </td>
                    </tr>
                    <tr>
                        <td class="ColRowBold tdAlignRight">
                        <html:select property="<%=NetworkAccessEditForm.FIELD_GRANT%>">
                            <html:option value="true">Grant</html:option>
                            <html:option value="false">Deny</html:option>
                        </html:select>
                        &nbsp;access to
                        </td>
                        <td class="ColRow tdAlignLeft">
                            <html:radio property="<%=NetworkAccessEditForm.FIELD_RANGE%>" value="false" onclick="form.submit()">
                                Single computer
                            </html:radio>
                        </td>
                    </tr>
                    <tr>
                        <td class="ColRow tdAlignRight">&nbsp;</td>
                        <td class="ColRow tdAlignLeft">
                            <html:radio property="<%=NetworkAccessEditForm.FIELD_RANGE%>" value="true" onclick="form.submit()">
                                Group of computers
                            </html:radio>
                        </td>
                    </tr>
                    <tr>
                         <td class="ColRowBold tdAlignRight">
                            IP Address
                         </td>
                         <td class="ColRow tdAlignLeft">
                            <html:text size="3" maxlength="3" property="<%=NetworkAccessEditForm.FIELD_IP_1%>"/>&nbsp;.&nbsp;
                            <html:text size="3" maxlength="3" property="<%=NetworkAccessEditForm.FIELD_IP_2%>"/>&nbsp;.&nbsp;                            
                            <html:text size="3" maxlength="3" property="<%=NetworkAccessEditForm.FIELD_IP_3%>"/>&nbsp;.&nbsp;                            
                            <html:text size="3" maxlength="3" property="<%=NetworkAccessEditForm.FIELD_IP_4%>"/>&nbsp;
                            <base:helpTag helpFileName="<%=NetworkAccessEditForm.HELP_IP_ADDRESS%>" />                            
                         </td>
                    </tr>
                    <c:if test="${form.range}">
                        <tr>
                             <td class="ColRowBold tdAlignRight">
                                Subnet Mask
                             </td>
                             <td class="ColRow tdAlignLeft">
                                <html:text size="3" maxlength="3" property="<%=NetworkAccessEditForm.FIELD_MASK_1%>"/>&nbsp;.&nbsp;
                                <html:text size="3" maxlength="3" property="<%=NetworkAccessEditForm.FIELD_MASK_2%>"/>&nbsp;.&nbsp;                            
                                <html:text size="3" maxlength="3" property="<%=NetworkAccessEditForm.FIELD_MASK_3%>"/>&nbsp;.&nbsp;                            
                                <html:text size="3" maxlength="3" property="<%=NetworkAccessEditForm.FIELD_MASK_4%>"/>&nbsp;                            
                                <base:helpTag helpFileName="<%=NetworkAccessEditForm.HELP_SUBNET_MASK%>" />                            
                             </td>
                        </tr>                        
                    </c:if>                        
                </base:outlinedTable>
            </td>
        </tr>
    </table>
</base:form>
