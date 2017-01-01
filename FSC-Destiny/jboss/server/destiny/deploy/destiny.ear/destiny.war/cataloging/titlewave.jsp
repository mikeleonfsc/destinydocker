<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.*"%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.StringHelper"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<bean:define id="form" name="<%=TitlewaveForm.FORM_NAME%>" type="TitlewaveForm"/>

<base:messageBox strutsErrors="true"/>
<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request); 
%>
<br>
<base:form action="/cataloging/servlet/handletitlewaveform.do">
<html:hidden property="<%=TitlewaveForm.PARAM_CHANGE_PASSWORD %>"/>
<table id="<%=TitlewaveForm.TABLE_MAIN%>" width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr>
        <td>
            <table id="<%=TitlewaveForm.TABLE_DETAIL%>" border="0" cellspacing="0" cellpadding="3" align="center">
                <% if(!form.isChangePassword()){%>
                <tr>
                    <td class="ColRow" align="center" colspan="2">
                    <p>
                        <%=MessageHelper.formatMessage("titlewave_YouHaveNotConfiguredDestinyToCommunicateWithFollettTitlewave") + "<br/>" %>
                        <%=MessageHelper.formatMessage("titlewave_ToContinuePleaseEnterYourUsernameAndPasswordAndClickSave") %>                        
                    </p>
                    </td>
                </tr>
                <%} %>
                <tr>
                    <td class="FormLabel tdAlignRight" width="50%">
                        <%=MessageHelper.formatMessage("titlewave_TitlewaveUsername") %>
                    </td>
                    <td class="FormLabel" nowrap valign="middle">
                        <html:text property="<%=form.FIELD_TITLEWAVE_LOGIN%>" size="24" maxlength="100"/>
                    </td>
                </tr>
                <tr>
                    <td class="FormLabel tdAlignRight" width="50%">
                        <%=MessageHelper.formatMessage("titlewave_TitlewavePassword") %>
                    </td>
                    <td class="FormLabel" nowrap valign="middle">
                        <html:password property="<%=form.FIELD_TITLEWAVE_PASSWORD%>" size="24" maxlength="20"/>
                    </td>
                </tr>     
                <tr>
                    <td class="FormLabel" align="center" colspan="2">
                        <base:saveButton name="<%= TitlewaveForm.BUTTON_SAVE%>" />
                        <% if(form.isChangePassword()){%>
                            &nbsp;&nbsp;<base:cancelButton name="<%= TitlewaveForm.BUTTON_CANCEL%>"/>
                        <%} %>
                    </td>
                </tr>     
            </table>                    
        </td>
    </tr>
</table>
</base:form>
