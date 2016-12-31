<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

    <table width="100%" id="<%=TextbookEditForm.TABLE_FOOTER%>">
        <tr>
            <td>
                <a href="#TheTop" ><base:image src="/icons/general/top.gif" height="16" width="19" alt="<%=TextbookEditForm.LINK_TOP_OF_PAGE%>"/></a>
            </td>
            <TD align="center" class="Error">
<logic:equal name="<%=TextbookEditForm.FORM_NAME%>" property="changesMade" value="true">
                Title has unsaved changes.
</logic:equal>
<logic:notEqual name="<%=TextbookEditForm.FORM_NAME%>" property="changesMade" value="true">
                &nbsp;
</logic:notEqual>
            </TD>
            <td class="ColRowBold tdAlignRight">
                <base:showHideTag id="onSaveFooter">
                    <base:genericButton alt="Save Title" src="/buttons/large/savetitle.gif" onclick="hideElementonSaveFooter()" name="<%=TextbookEditForm.BUTTON_NAME_SAVE_TEXTBOOK%>"/>
                    <base:imageSpacer width="19" height="16"/>
                    <base:cancelButton name="<%=TextbookEditForm.BUTTON_NAME_CANCEL_TEXTBOOK%>"/>
                </base:showHideTag>
            </TD>
        </TR>
    </TABLE>
