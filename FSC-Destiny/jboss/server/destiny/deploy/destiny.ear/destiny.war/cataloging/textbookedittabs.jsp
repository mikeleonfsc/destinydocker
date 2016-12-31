<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    TextbookEditForm form = (TextbookEditForm)request.getAttribute( TextbookEditForm.FORM_NAME );
%>


<html:hidden property="callingPage" />
<html:hidden property="duplicateBibID" />

<logic:equal name="<%=TextbookEditForm.FORM_NAME%>" property="changesMade" value="true">
    <tr>
        <td align="center">
            <TABLE id="<%= TextbookEditForm.TABLE_UNSAVED_CHANGES %>" border="1" cellpadding="0" cellspacing="6" bordercolor="#CC0000" width="100%" frame="above, below, lhs, rhs" rules="none">
                <TR>
                    <TD align="center">
                        <%=MessageBoxTag.getCAUTION_IMAGE_HTML()%>
                    </TD>
                    <TD align="center" class="Error">
                        Title has unsaved changes.
                    </TD>
                    <td class="ColRowBold tdAlignRight">
                        <br>
                        <base:showHideTag id="onSaveHeader">
                            <base:genericButton alt="Save Title" src="/buttons/large/savetitle.gif" onclick="hideElementonSaveHeader()" name="<%=TextbookEditForm.BUTTON_NAME_SAVE_TEXTBOOK%>"/>
                            <base:imageSpacer width="19" height="16"/>
                            <base:cancelButton name="<%=TextbookEditForm.BUTTON_NAME_CANCEL_TEXTBOOK%>"/>
                        </base:showHideTag>
                    </TD>
                </TR>
            </TABLE>
      </td>
    </tr>
    <tr>
        <td align="center" class="Error">
            &nbsp;
        </td>
    </tr>
</logic:equal>

<%
    String callingPage = request.getParameter(TextbookEditForm.PARAM_CALLING_PAGE);
    if ( StringHelper.isEmpty(callingPage) ) {
        callingPage = TextbookEditForm.TAB_TEXT_INFORMATION;
    }

%>
