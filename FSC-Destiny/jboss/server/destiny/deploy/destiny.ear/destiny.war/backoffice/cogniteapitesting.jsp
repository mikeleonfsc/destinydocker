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
<c:set var="form" value="<%=form %>" />

<bean:define id="formTypes" name="<%=CogniteAPITestingForm.FORM_NAME%>" property="formTypes"/>

<base:form action="/backoffice/servlet/handlecogniteapitestingform.do">
<a id="oauthInfo"/>
    <base:outlinedTable id="<%=CogniteAPITestingForm.TABLE_OAUTH_INFO %>">
        <tr>
            <td class="ColRow">
                <table>
                    <tr>
                        <td class="ColRow" colspan="2">
                            Current Destiny User:
                            <c:choose>
                                <c:when test="${form.currentDestinyLoginID != null}">
                                    ${form.currentDestinyLoginID}
                                </c:when>
                                <c:otherwise>
                                    Guest
                                </c:otherwise>
                            </c:choose>
                        </td>
                    </tr>
                    <c:if test="${form.currentDestinyLoginID != null}">
                        <tr>
                            <td><base:imageSpacer height="1" width="30" /></td>
                            <td class="ColRow" >Token: ${form.accessToken.token}</td>
                        </tr>
                        <tr>
                            <td><base:imageSpacer height="1" width="30" /></td>
                            <td class="ColRow" >Secret: ${form.accessToken.secret}</td>
                        </tr>
                    </c:if>
                </table>
            </td>
            <td class="ColRow tdAlignRight" valign="top">
                <a href="/backoffice/servlet/presentcogniteapitestingform.do?login=true">OAuth Login</a>
                <c:if test="${form.currentDestinyLoginID != null}">
                    <a href="/backoffice/servlet/presentcogniteapitestingform.do?logout=true">Logout</a>
                </c:if>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <c:set var="consumer" value="<%=form.getConsumer() %>"/>
                <table>
                    <tr>
                        <td class="ColRow" colspan="2">Current Consumer: ${form.consumer.name}</td>
                    </tr>
                    <tr>
                        <td><base:imageSpacer height="1" width="30" /></td>
                        <td class="ColRow" >Key: ${form.consumer.key}</td>
                    </tr>
                    <tr>
                        <td><base:imageSpacer height="1" width="30" /></td>
                        <td class="ColRow" >Secret: ${form.consumer.secret}</td>
                    </tr>
                </table>
            </td>
        </tr>
    </base:outlinedTable>
<a id="topOfPage"/>
    <base:outlinedTable id="<%=CogniteAPITestingForm.TABLE_MAIN %>">
        <tr>
            <td class="ColRowBold" valign="top">
                <H2>Form type:
                <html:select onchange="submit()" property="<%=CogniteAPITestingForm.FIELD_FORM_TYPE %>">
                    <html:options collection="formTypes" property="stringCode"
                        labelProperty="stringDesc"/>
                </html:select>
                </H2>
            </td>
            <td class="ColRowBold" valign="top">
                Host <html:text property="<%=CogniteAPITestingForm.FIELD_HOST %>"/>
            </td>
        </tr>

        <tr>
            <td class="ColRow" align="center">
                <html:submit property="<%= CogniteAPITestingForm.BUTTON_EXECUTE %>" value="Execute"/>
                <html:select property="<%=CogniteAPITestingForm.FIELD_FORMAT %>">
                    <html:option value="<%=CogniteAPITestingForm.FORMAT_HTML_XML %>">HTML &amp; XML</html:option>
                    <html:option value="<%=CogniteAPITestingForm.FORMAT_JSON %>">JSON</html:option>
                </html:select>
                <%if (form.getExceptionString() != null) {%><a href="#errorStart">Exception</a><%}%>
            </td>
        </tr>
            <td class="ColRow" align="center">
                <html:submit property="<%= CogniteAPITestingForm.BUTTON_RESET %>" value="Reset Defaults"/>
            </td>
        </tr>
        <tr>
            <td>
                <% if(form.getWarnings()!=null) {%>
                <label id="<%= form.FIELD_WARNINGS %>" class="ColRowBold" style="color:#F00;"><%= form.getWarnings() %></label>
                <% } %>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <% for (int i = 0; i < form.getCurrentFormParams().length; i++) { %>
                    <p style="float:left;margin-right:2em">
                        <label for="<%= form.getCurrentFormParams()[i].name%>" class="ColRowBold">
                            <%= form.getCurrentFormParams()[i].prompt%><font color="#F00"><%if(form.getCurrentFormParams()[i].isRequired){%>*<%}%></font><br/>
                        </label>
                        <%= form.getCurrentFormParams()[i].renderHtml(form)%>
                    </p>
                <% } %>
            </td>
        </tr>
        
        <tr>
            <td colspan="2">
                <label class="ColRowBold" style="color:#F00;">*Required Field</label>
            </td>
        </tr>
        
        <tr>
            <td class="ColRow" align="center">
                <html:submit property="<%= CogniteAPITestingForm.BUTTON_EXECUTE %>" value="Execute"/>
                <html:select property="<%=CogniteAPITestingForm.FIELD_FORMAT %>">
                    <html:option value="<%=CogniteAPITestingForm.FORMAT_HTML_XML %>">HTML &amp; XML</html:option>
                    <html:option value="<%=CogniteAPITestingForm.FORMAT_JSON %>">JSON</html:option>
                </html:select>
                <%if (form.getExceptionString() != null) {%><a href="#errorStart">Exception</a><%}%>
            </td>
            <td class="ColRow" align="center">
                &nbsp;
            </td>
        </tr>

        <tr>
            <td colspan="2">
                <base:imageLine/>
            </td>
        </tr>
        <% if (!StringHelper.isEmptyOrWhitespace(form.getRequestURL())) { %>
        <tr>
            <td colspan="2">
                <b>URL:</b><%=ResponseUtils.filter(form.getRequestURL())%>
            </td>
        </tr>
        <% } %>
        <% if (form.getResponseCode() != null) { %>
        <tr>
            <td colspan="2">
                <b>Response Code: </b><label id="<%= CogniteAPITestingForm.LABEL_RESPONSE_CODE %>"><%=form.getResponseCode()%></label>
            </td>
        </tr>
        <% } %>
        <tr>
            <td colspan="2">
                <a id="htmlStart"/>
                <a href="#topOfPage">Top</a> <a href="#xmlStart">Xml</a> <%if (form.getExceptionString() != null) {%><a href="#errorStart">Exception</a><%}%>
            </td>
        </tr>

        <% if (form.getResultHTML() != null) { %>
            <tr>
                <th colspan="2" class="ColHeading">
                    Formatted HTML Output <span class="SmallColRow">(using template <%=form.getTemplatePath() %>)</span>
                </th>
            </tr>
            <tr>
                <td id="HTML_DATA" colspan="2" class="ColRow">
                <%=form.getResultHTML() %>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <base:imageLine/>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <a id="xmlStart"/>
                    <a href="#topOfPage">Top</a> <a href="#htmlStart">Html</a> <%if (form.getExceptionString() != null) {%><a href="#errorStart">Exception</a><%}%>
                </td>
            </tr>
        <% } else { %>
        <% }  %>

        <% if (form.getResultXML() != null) { %>
            <tr>
                <th colspan="2" class="ColHeading">
                    Formatted XML Output
                </th>
            </tr>
            <tr>
                <td id="XML_DATA" colspan="2" class="ColRow">
                <%=form.getResultXML() %>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <base:imageLine/>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <a id="jsonStart"/>
                    <a href="#topOfPage">Top</a> <a href="#htmlStart">Html</a> <a href="#xmlStart">Xml</a> <a href="#jsonStart">Json</a>
                </td>
            </tr>
        <% } else { %>
            <tr>
                <td colspan="2" class="ColRow">
                No XML output available.
                </td>
            </tr>
        <% }  %>
        <% if (form.getResultJSON() != null) { %>
            <tr>
                <th colspan="2" class="ColHeading">
                    Formatted JSON Output
                </th>
            </tr>
            <tr>
                <td id="JSON_DATA" colspan="2" class="ColRow">
                <%=form.getResultJSON() %>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <a href="#topOfPage">Top</a> <a href="#htmlStart">Html</a> <a href="#xmlStart">Xml</a> <a href="#jsonStart">Json</a>
                </td>
            </tr>
        <% } else { %>
            <tr>
                <td colspan="2" class="ColRow">
                No JSON output available.
                </td>
            </tr>
        <% }  %>
        <% if (form.getExceptionString() != null) { %>
            <tr>
                <th colspan="2" class="Error">
                    <a id="errorStart"/>
                    Error
                </th>
            </tr>
            <tr>
                <td id="EXCEPTION_DATA" colspan="2" class="ColRow">
                <%=form.getExceptionString() %>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <a href="#topOfPage">Top</a> <a href="#htmlStart">Html</a> <a href="#xmlStart">Xml</a> <%if (form.getExceptionString() != null) {%><a href="#errorStart">Exception</a><%}%>
                </td>
            </tr>
        <% } %>
    </base:outlinedTable>
</base:form>
