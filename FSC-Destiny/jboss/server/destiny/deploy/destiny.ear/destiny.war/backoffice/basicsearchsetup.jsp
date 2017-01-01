<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LoginFacade" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.session.circulation.ejb.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>

<base:messageBox strutsErrors="true"/>

<%
    BasicSearchSetupForm form = (BasicSearchSetupForm)request.getAttribute(BasicSearchSetupForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
%>

<base:form action="/backoffice/servlet/handlebasicsearchsetupform.do">

    <% if (form.isDistrictMode() ) { %>
        <html:hidden property="districtMode"/>    
    <% } %>    
    <html:hidden property="roleID"/>
    <base:outlinedTable id="<%=BasicSearchSetupForm.TABLE_CONFIGURE_SETTINGS%>" borderColor='#c0c0c0' width="100%" cellpadding="0">
        <tr>
            <td class="TableHeading" colspan="2"><%= MessageHelper.formatMessage("basicsearchsetup_ConfigureOrderAndAvailabilityOfBasicSearchOptions") %></td>
        </tr>
        <tr>
            <td nowrap><base:imageSpacer width="30" height="1"/></td>
            <td><table cellpadding="0" cellspacing="3" border="0" id="<%=BasicSearchSetupForm.TABLE_VALUES%>">
                <tr>
                    <td class="ColRowBold" align="center" width="100"><%= MessageHelper.formatMessage("basicsearchsetup_Available") %></td>
                    <td class="ColRowBold" width="150"><%= MessageHelper.formatMessage("basicsearchsetup_SearchType") %></td>
                    <td class="ColRowBold"><%= MessageHelper.formatMessage("basicsearchsetup_Order") %></td>
                </tr>
                <tr>
                    <td align="center">
                        <html:checkbox property="<%=BasicSearchSetupForm.FIELD_ALLOW_KEYWORD%>"></html:checkbox>
                    </td>
                    <td class="ColRow"><%= MessageHelper.formatMessage("basicsearchsetup_KeywordSearch") %></td>
                    <td>
                        <html:text property="<%=BasicSearchSetupForm.FIELD_ORDER_KEYWORD%>" size="4" maxlength="1"/>
                    </td>
                </tr>
                <tr>
                    <td align="center">
                        <html:checkbox property="<%=BasicSearchSetupForm.FIELD_ALLOW_TITLE%>"></html:checkbox>
                    </td>
                    <td class="ColRow"><%= MessageHelper.formatMessage("basicsearchsetup_TitleSearch") %></td>
                    <td>
                        <html:text property="<%=BasicSearchSetupForm.FIELD_ORDER_TITLE%>" size="4" maxlength="1"/>
                    </td>
                </tr>
                <tr>
                    <td align="center">
                        <html:checkbox property="<%=BasicSearchSetupForm.FIELD_ALLOW_AUTHOR%>"></html:checkbox>
                    </td>
                    <td class="ColRow"><%= MessageHelper.formatMessage("basicsearchsetup_AuthorSearch") %></td>
                    <td>
                        <html:text property="<%=BasicSearchSetupForm.FIELD_ORDER_AUTHOR%>" size="4" maxlength="1"/>
                    </td>
                </tr>
                <tr>
                    <td align="center">
                        <html:checkbox property="<%=BasicSearchSetupForm.FIELD_ALLOW_SUBJECT%>"></html:checkbox>
                    </td>
                    <td class="ColRow"><%= MessageHelper.formatMessage("basicsearchsetup_SubjectSearch") %></td>
                    <td>
                        <html:text property="<%=BasicSearchSetupForm.FIELD_ORDER_SUBJECT%>" size="4" maxlength="1"/>
                    </td>
                </tr>
                <tr>
                    <td align="center">
                        <html:checkbox property="<%=BasicSearchSetupForm.FIELD_ALLOW_SERIES%>"></html:checkbox>
                    </td>
                    <td class="ColRow"><%= MessageHelper.formatMessage("basicsearchsetup_SeriesSearch") %></td>
                    <td>
                        <html:text property="<%=BasicSearchSetupForm.FIELD_ORDER_SERIES%>" size="4" maxlength="1"/>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    <tr>
        <td align="center" colspan="2">
            <base:okButton name="<%= BasicSearchSetupForm.BUTTON_NAME_SAVE %>" />
            <base:cancelButton name="<%= BasicSearchSetupForm.BUTTON_NAME_CANCEL %>" />
        </td>
    </tr>
    </base:outlinedTable>
</base:form>



