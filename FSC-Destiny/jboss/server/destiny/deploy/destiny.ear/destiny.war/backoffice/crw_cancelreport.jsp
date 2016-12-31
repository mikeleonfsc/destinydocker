<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.CRWBaseForm" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<c:set var="form" value='<%=request.getAttribute(request.getParameter("formName"))%>'/>

<c:if test="${form.showCancelYesNo}">
    <base:messageBox showRedBorder="true">
    <tr valign="top">
        <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
        <td class="ColRowBold" align="center">${form.cancelMessage}</td>
    </tr>
        <tr>
            <td>&nbsp;</td>
            <td valign="baseline" align="center" class="ColRow">
                <base:yesNo buttonNoName="<%=CRWBaseForm.BUTTON_CANCEL_NO %>"
                    buttonYesName="<%=CRWBaseForm.BUTTON_CANCEL_YES %>"/>
            </td>
        </tr>
    </base:messageBox>
</c:if>
