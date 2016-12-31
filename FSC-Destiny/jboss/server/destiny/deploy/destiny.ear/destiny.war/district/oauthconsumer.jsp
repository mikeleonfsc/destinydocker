<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.DistrictTabHelper"%>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-format.tld" prefix="fmt" %>


<%@page import="com.follett.fsc.destiny.client.district.servlet.OAuthConsumerForm"%>

<base:messageBox strutsErrors="true"/>

<%
    OAuthConsumerForm form = (OAuthConsumerForm)request.getAttribute(OAuthConsumerForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    String focusField = (Boolean.TRUE.equals(form.getDeleteMode()) ? OAuthConsumerForm.BUTTON_DONT_CONFIRM_DELETE : OAuthConsumerForm.FIELD_NAME);
%>
<c:set var="form" value="<%= form %>" />

<script language="JavaScript">
<!--
    function trapEnter(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        document.<%=OAuthConsumerForm.FORM_NAME%>.<%=OAuthConsumerForm.FIELD_TRAP_ENTER_PRESSED%>.value=true;
      }
      return true;
    }
//-->
</script>

<base:form action="/district/servlet/handleoauthconsumerform.do" focus="<%= focusField %>">

    <html:hidden property="<%= OAuthConsumerForm.FIELD_TRAP_ENTER_PRESSED %>" value="false"/>

    <html:hidden property="<%= OAuthConsumerForm.PARAM_CONSUMER_ID %>"/>
    <html:hidden property="<%= OAuthConsumerForm.PARAM_EDIT_MODE %>"/>
    
    <c:if test="${form.deleteMode}">
        <base:messageBox showWarningIcon="true" message="Deleting OAuth consumer:">
            <c:if test="${form.numberUsersToDelete > 0}">
                <tr>
                    <td>&nbsp;</td>
                    <td class="ColRowBold" align="center"><ul><li>Warning: About to delete a consumer with number of authenticated users: <fmt:formatNumber  value="${form.numberUsersToDelete}"/></li></ul></td>
                </tr>
            </c:if>
            <tr>
                <td>&nbsp;</td>
                <td class="ColRowBold" align="center">Are you sure you want to delete the consumer "<c:out value="${form.nameToDelete}"/>"?</td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td valign="baseline" align="center" class="ColRow">
                    <base:yesNo buttonYesName="<%=OAuthConsumerForm.BUTTON_CONFIRM_DELETE%>" buttonNoName="<%=OAuthConsumerForm.BUTTON_DONT_CONFIRM_DELETE %>"/>
                </td>
            </tr>
        </base:messageBox>
    </c:if>
    
    <c:if test="${form.recentlyAddedConsumer != null}">
        <base:messageBox header="OAuth consumer added..." showWarningIcon="true" message="Consumer ${form.recentlyAddedConsumer.name} has been added. Please configure the consumer application with the following information.">
            <tr>
                <td>&nbsp;</td>
                <td>
                    <table id="<%= OAuthConsumerForm.TABLE_ADD_CONSUMER_ALERT %>">
                        <tr>
                            <td class="ColRowBold tdAlignRight">Consumer Key:</td>
                            <td class="ColRow">${form.recentlyAddedConsumer.key}</td>
                        </tr>
                        <tr>
                            <td class="ColRowBold tdAlignRight">Consumer Secret:</td>
                            <td class="ColRow">${form.recentlyAddedConsumer.secret}</td>
                        </tr>
                    </table>
                </td>
            </tr>
        </base:messageBox>
    </c:if>
    <base:outlinedTable borderColor="#C0C0C0" width="95%" align="center">
        <tr>
            <td>
                <table id="<%= OAuthConsumerForm.TABLE_EDIT %>" width="80%" align="center">
                    <tr>
                        <td class="ColRowBold tdAlignRight">
                            <c:choose>
                                <c:when test="${form.editMode}">Edit Consumer</c:when>
                                <c:otherwise>Add Consumer</c:otherwise>
                            </c:choose>
                            </td>
                        <td>
                            <span onKeyPress="return trapEnter(event);">
                                <html:text maxlength="255" size="50" property="<%= OAuthConsumerForm.FIELD_NAME %>" />
                            </span>
                        </td>
                        <td class="tdAlignRight">
                            <base:saveButton />
                            <c:choose>
                                <c:when test="${form.editMode}">
                                    <base:cancelButton />
                                </c:when>
                                <c:otherwise>
                                    <base:closeButton withX="true" />
                                </c:otherwise>
                            </c:choose>
                        </td>
                    </tr>
                </table>
                <br><base:imageLine /><br>
                <table id="<%= OAuthConsumerForm.TABLE_DISPLAY %>" width="95%" align="center" cellspacing="0">
                    <tr><td class="TableHeading" colspan="5">Current Consumers...</td></tr>
                    <c:choose>
                        <c:when test="${empty form.consumers}">
                            <tr><td class="ColRowBold" colspan="5" align="center">No consumers are defined.</td></tr>
                        </c:when>
                        <c:otherwise>
                            <tr>
                                <th class="ColRowBold">Name</th>
                                <th class="ColRowBold">Consumer Key</th>
                                <th class="ColRowBold">Consumer Secret</th>
                                <th class="ColRowBold"># Users</th>
                                <th>&nbsp;</th>
                            </tr>
                            <c:forEach items="${form.consumers}" var="consumer" varStatus="idx">
                                <c:set var="editConsumerAltText">Edit <c:out value="${consumer.name}"/></c:set>
                                <c:set var="deleteConsumerAltText">Delete <c:out value="${consumer.name}"/></c:set>
                                <base:flipper key="ConsumerAED">
                                    <td class="ColRow"><c:out value="${consumer.name}" /></td>
                                    <td class="ColRow" align="center">${consumer.key}</td>
                                    <td class="ColRow" align="center">${consumer.secret}</td>
                                    <td class="ColRow tdAlignRight"><fmt:formatNumber  value="${consumer.numUsers}"/></td>
                                    <td class="tdAlignRight" nowrap="nowrap">
                                        &nbsp;&nbsp;&nbsp;
                                        <base:link href="/district/servlet/presentoauthconsumerform.do?editMode=true&consumerId=${consumer.consumerId}" >
                                            <base:image width="19" height="16" src="/icons/general/edit.gif" alt="${editConsumerAltText}" />
                                        </base:link>
                                        <base:link href="/district/servlet/presentoauthconsumerform.do?deleteMode=true&consumerId=${consumer.consumerId}">
                                            <base:image width="19" height="16" src="/icons/general/delete.gif" alt="${deleteConsumerAltText}" />
                                        </base:link>
                                    </td>
                                </base:flipper>
                            </c:forEach>
                        </c:otherwise>
                    </c:choose>
                </table>
            </td>
        </tr>
    </base:outlinedTable>
</base:form>

