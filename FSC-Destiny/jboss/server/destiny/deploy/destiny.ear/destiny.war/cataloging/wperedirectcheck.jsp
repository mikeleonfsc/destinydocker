<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.WPERedirectCheckForm"%>

<%
    WPERedirectCheckForm form = (WPERedirectCheckForm)request.getAttribute(WPERedirectCheckForm.FORM_NAME);
%>

<base:form action="/cataloging/servlet/handlewperedirectcheckform.do">
  <base:outlinedTable borderColor="#c0c0c0" id="<%=WPERedirectCheckForm.TABLE_OUTLINED%>" align="center" width="90%">
    <tr>
        <td class="TableHeading">
            <%=form.gimmePageTitle() %>
        </td>
    </tr>
    <tr>
        <td align="center" class="FormLabel" nowrap>
        This website is currently unavailable. Please try again later.
        <!--  %= MessageHelper.formatMessage("wperedirectcheck_WebSiteNoLongerActive") %--></td>
    </tr>

    <tr>
        <td align="center">
            <base:genericButton onclick="JavaScript:window.close()" alt="Close" name="Close" src="/buttons/large/close.gif"/>
        </td>
    </tr>
</base:outlinedTable>
</base:form>
