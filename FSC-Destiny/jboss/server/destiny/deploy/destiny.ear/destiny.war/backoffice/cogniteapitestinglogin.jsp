<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CopySpecs" %>
<%@ page import="com.follett.fsc.common.consortium.UserContext" %>                
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>


<%@page import="com.follett.fsc.destiny.util.Permission"%>


<%@page import="org.apache.struts.util.ResponseUtils"%>
<%@page import="com.follett.fsc.common.StringHelper"%><base:messageBox strutsErrors="true"/>

<%
    CogniteAPITestingForm form = (CogniteAPITestingForm)request.getAttribute(CogniteAPITestingForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
%>
<c:set var="form" value="<%=form %>"/>

<bean:define id="formTypes" name="<%=CogniteAPITestingForm.FORM_NAME%>" property="formTypes"/>

<base:form action="/backoffice/servlet/handlecogniteapitestingform.do">
<a id="topOfPage"/>
    <base:outlinedTable id="<%=CogniteAPITestingForm.TABLE_OAUTH_LOGIN %>">
        <tr>
            <td class="ColRowBold">Consumer:</td>
            <td>
                <html:select property="consumerID" onchange="submit()">
                    <html:optionsCollection property="consumerList" label="name" value="consumerId" />
                    <html:option value="<%=CogniteAPITestingForm.CONSUMER_ID_OTHER.toString() %>">Other...</html:option>
                </html:select>
            </td>
        </tr>
        <c:if test="<%=CogniteAPITestingForm.CONSUMER_ID_OTHER.equals(form.getConsumerID()) %>">
            <tr>
                <td>&nbsp;</td>
                <td colspan="3">
                    <table>
                        <tr>
                            <td class="ColRowBold">Consumer Key:</td>
                            <td><html:text property="<%=CogniteAPITestingForm.FIELD_UDEF_CONSUMER_KEY %>"></html:text></td>
                        </tr>
                        <tr>
                            <td class="ColRowBold">Consumer Secret:</td>
                            <td><html:text property="<%=CogniteAPITestingForm.FIELD_UDEF_CONSUMER_SECRET %>"></html:text></td>
                        </tr>
                    </table>
                </td>
            </tr>
        </c:if>
        <tr>
            <td class="ColRowBold">Destiny Login:</td>
            <td><html:text property="<%=CogniteAPITestingForm.FIELD_LOGINID %>"></html:text></td>
            <td rowspan="2" class="ColRowBold">- OR -</td>
            <td rowspan="2" class="ColRowBold">
                <table>
                    <tr>
                        <td class="ColRowBold" colspan="2">
                            User:
                            <html:select property="<%=CogniteAPITestingForm.FIELD_ACCESS_KEY %>" onchange="submit()">
                                <html:option value="">Select an authenticated user</html:option>
                                <html:optionsCollection property="userList" label="loginID" value="accessKey" />
                                <html:option value="<%=CogniteAPITestingForm.ACCESS_KEY_OTHER %>">Other...</html:option>
                            </html:select>
                        </td>
                    </tr>
                    <c:if test="<%=CogniteAPITestingForm.ACCESS_KEY_OTHER.equals(form.getAccessKey()) %>">
                        <tr>
                            <td class="ColRowBold">Access Token:</td>
                            <td><html:text property="<%=CogniteAPITestingForm.FIELD_UDEF_ACCESS_KEY %>"></html:text></td>
                        </tr>
                        <tr>
                            <td class="ColRowBold">Access Secret:</td>
                            <td><html:text property="<%=CogniteAPITestingForm.FIELD_UDEF_ACCESS_SECRET %>"></html:text></td>
                        </tr>
                    </c:if>
                </table>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold">Password:</td>
            <td><html:password property="<%=CogniteAPITestingForm.FIELD_PASSWORD %>"></html:password></td>
        </tr>
        <tr>
            <td colspan="4" align="center">
                <base:genericButton name="<%=CogniteAPITestingForm.BUTTON_LOGIN %>" src="/buttons/large/login_submit.gif" />
            </td>
        </tr>
        <% if (form.getExceptionString() != null) { %>
            <tr>
                <td id="EXCEPTION_DATA" colspan="4" class="ColRow">
                <%=form.getExceptionString() %>
                </td>
            </tr>
        <% } %>
    </base:outlinedTable>
</base:form>
