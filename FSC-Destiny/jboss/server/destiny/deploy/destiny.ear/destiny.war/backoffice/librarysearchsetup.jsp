<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>

<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>


<base:messageBox strutsErrors="true"/>

<%
    LibrarySearchSetupForm form = (LibrarySearchSetupForm)request.getAttribute(LibrarySearchSetupForm.FORM_NAME);
%>

<base:form action="/backoffice/servlet/handlelibrarysearchsetupform.do">

    <% if (form.isDistrictMode() ) { %>
        <html:hidden property="districtMode"/>    
    <% } %>    
<html:hidden property="selectBasic"/>
<html:hidden property="selectPower"/>
<html:hidden property="selectVisual"/>
<html:hidden property="selectCategories"/>
<html:hidden property="selectNumber"/>
<html:hidden property="selectBarcode"/>
<html:hidden property="selectBriefRecords"/>
<html:hidden property="roleID"/>
<html:hidden property="mode"/>
    <base:outlinedTable id="<%=LibrarySearchSetupForm.TABLE_CONFIGURE_SETTINGS%>" borderColor='#c0c0c0' width="100%" cellpadding="0">
        <tr>
            <td class="TableHeading" colspan="2"><%= MessageHelper.formatMessage("librarysearchsetup_ConfigureOrder", form.getMode()) %></td>
        </tr>
        <tr>
            <td nowrap><base:imageSpacer width="30" height="1"/></td>
            <td><table cellpadding="0" cellspacing="3" border="0" id="<%=LibrarySearchSetupForm.TABLE_VALUES%>">
                <tr>
                    <td class="ColRowBold" align="center" width="100"><%= MessageHelper.formatMessage("librarysearchsetup_Selected") %></td>
                    <td class="ColRowBold" width="150"><%= MessageHelper.formatMessage("librarysearchsetup_SearchTab") %></td>
                    <td class="ColRowBold"><%= MessageHelper.formatMessage("librarysearchsetup_Order") %></td>
                </tr>
                <%=form.getRows()%>
            </table>
        </td>
    </tr>
    <tr>
        <td align="center" colspan="2">
            <base:okButton name="<%= LibrarySearchSetupForm.BUTTON_NAME_SAVE %>" />
            <base:cancelButton name="<%= LibrarySearchSetupForm.BUTTON_NAME_CANCEL %>" />
        </td>
    </tr>
    </base:outlinedTable>
</base:form>



