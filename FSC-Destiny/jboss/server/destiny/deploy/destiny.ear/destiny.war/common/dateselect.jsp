<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.client.common.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<base:messageBox strutsErrors="true"/>

<base:form action="/common/servlet/handledateselectform.do">
<html:hidden property="<%=DateSelectForm.FIELD_STARTING_DATE%>" />
<html:hidden property="<%=DateSelectForm.FIELD_SELECTED_DATE%>" />
<html:hidden property="<%=DateSelectForm.FIELD_PRIMARY_KEY%>" />

<% DateSelectForm form = (DateSelectForm)request.getAttribute(DateSelectForm.FORM_NAME); %>

<table border="0" cellpadding="2" align="center" id="<%=DateSelectForm.TABLE_MAIN%>">
<tr>
    <td align="center">

        <%
            SessionStoreProxy store = SessionStoreProxy.getSessionStore(request.getSession(), request);
            Long siteID = store.getSiteID();
        %>
        <table>
        <tr>
        <td valign="top">

                </td>
                    </tr><tr>
                <td valign=\"top\">
                    <%=
                    form.getCalendar().create(form.getFirstOfMonth(), siteID, application, request, response, false, UserContext.isInConsortium() || form.isDistrictMode() || form.isConsortiumMode())
                    %>
                </td>
        </tr>
        </table>

    </td>
</tr>
<tr>
    <td colspan="2" align="center" class="ColRowBold">
    <%= MessageHelper.formatMessage("dateselect_SelectedDate") %>: <bean:write name="<%=DateSelectForm.FORM_NAME%>" property="formattedSelectedDate"/>
    </td>
</tr>
<% if( form.isShowYearWasFixed() ) { %>
<tr>
    <td colspan="2" align="center" class="Instruction">
    <%= MessageHelper.formatMessage("DateSelectForm_ModifiedDate") %>
    </td>
<% } %>

<tr>
    <td colspan="2" align="center" class="ColRowBold">
        <base:saveButton/>
        &nbsp;
        <base:cancelButton/>
    </td>
</tr>
</table>

</base:form>
