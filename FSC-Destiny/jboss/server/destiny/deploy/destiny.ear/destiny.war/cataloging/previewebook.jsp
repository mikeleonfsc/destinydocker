<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.common.MessageHelper"%>



<%
    PreviewEBookForm form = (PreviewEBookForm)request.getAttribute(PreviewEBookForm.FORM_NAME);


    String focusControl = "";
    if(form.getAction().equals(PreviewEBookForm.BUTTON_VALUE_SHOW_EBOOK_GUEST_PASSWORD_MESSAGE)) {
        focusControl = PreviewEBookForm.FIELD_FOLLETT_EBOOK_GUEST_PASSWORD;
    }
%>


<base:form action="/cataloging/servlet/handlepreviewebookform.do" focus="<%=focusControl%>">

    <html:hidden property="<%=PreviewEBookForm.FIELD_BIB_ID%>"/>
    <html:hidden property="<%=PreviewEBookForm.FIELD_TEXTBOOK_MANAGER%>"/>


<!-- read online request error message -->
<% if (form.getMessage() != null) { %>
    <base:messageBox>
    <tr>
        <td class="ColRow">
            <%= form.getMessage() %>
        </td>
    </tr>
    </base:messageBox>
<% } %>

<!-- eBookGuestPassword prompt -->
<logic:equal name="<%=PreviewEBookForm.FORM_NAME%>"
    property="<%=PreviewEBookForm.PROPERTY_NAME_CHALLENGE_FOR_EBOOK_PASSWORD%>"
    value="true">
    <base:messageBox showRedBorder="true">
        <tr valign="top">
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td class="ColRowBold" align="center">
                <%= MessageHelper.formatMessage("previewebook_APasswordIsRequiredToReadThisEbookOnline") %>
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td align="center" class="ColRow">
                <%= MessageHelper.formatMessage("previewebook_ToContinuePleaseEnterThePasswordProvidedByYourAdministrator") %>
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td align="center">
                <html:text property="<%=PreviewEBookForm.FIELD_FOLLETT_EBOOK_GUEST_PASSWORD%>"
                           maxlength="50" size="20"/>
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td valign="baseline" align="center" class="ColRow">
                <base:okButton name="<%= PreviewEBookForm.BUTTON_NAME_CONFIRM_EBOOK_GUEST_PASSWORD %>" />
                <a href="javascript:window.close();" class="DetailLink" id="<%=PreviewEBookForm.ID_BUTTON_CLOSE %>"><base:image src="/buttons/large/cancel.gif" alt="<%=form.getButtonLabelConfirmEBookGuestPasswordCancel()%>" /></a>
            </td>
        </tr>
    </base:messageBox>
</logic:equal>
</base:form>
