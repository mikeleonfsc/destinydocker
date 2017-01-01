<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@page import="com.follett.fsc.destiny.client.circulation.servlet.CopyStatusForm"%>

<%
String formName = request.getParameter("FormName");
%>

<!-- stolen copies confirmation -->

<logic:equal name='<%= formName %>' property="confirmStolenCopies" value="true">
    <base:messageBox showRedBorder="true">
    <tr>
        <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
        <td valign="baseline" class="Error">
                <%= MessageHelper.formatMessage("stolencopyprompt_TheItemWillBeMarkedAsStolen") %><br>
        </td>
    </tr>
    <tr>
        <td align="center" class="ColRowBold" colspan="2">
            <base:showHideTag id="confirmStolen">
                <base:okButton name="<%= CopyStatusForm.BUTTON_NAME_MARK_STOLEN_OK %>" onclick="hideElementconfirmStolen()"/><base:cancelButton name="<%= CopyStatusForm.BUTTON_NAME_MARK_STOLEN_CANCEL %>" onclick="hideElementconfirmStolen()"/>
            </base:showHideTag>
        </td>
    </tr>
    </base:messageBox>
</logic:equal>
<!-- stolen copies confirmation -->

