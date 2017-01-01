<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.WPESuggestionForm" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>

<br/>

<base:form action="/cataloging/servlet/handlewpesuggestionform.do" focus="<%=WPESuggestionForm.FIELD_EMAIL_RETURN%>">


<base:outlinedTable id="<%=WPESuggestionForm.TABLE_OUTLINE%>" borderColor="#C0C0C0">
    <tr>
        <td>
            <table id="<%=WPESuggestionForm.TABLE_MAIN%>">
                <tr>
                    <td colspan="2" class="TableHeading">
                        Submit a WebPath Express Suggestion 
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight">* Your Email</td>
                    <td>
                        <html:text property="<%=WPESuggestionForm.FIELD_EMAIL_RETURN%>"/>
                        &nbsp;<base:helpTag helpFileName="t_email_webpath_express_suggestions.htm"/>
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight" valign="top">
                        * Message
                    </td>
                    <td><html:textarea property="<%=WPESuggestionForm.FIELD_MESSAGE%>" rows="4" cols="50"></html:textarea></td>
                </tr>
                <tr>
                    <td colspan="2" class="Instruction">
                        * = required field
                    </td>
                </tr>
            </table>
        </td>
        <td valign="top" class="tdAlignRight">
            <base:showHideTag id="HideIt">
                <base:genericButton absbottom="true" src="/buttons/large/send.gif"
                    alt="<%=WPESuggestionForm.ALT_TEXT_SEND%>"
                    name="<%=WPESuggestionForm.BUTTON_SEND%>" onclick="hideElementHideIt()"/>
                <p><base:cancelButton absbottom="true"/>
            </base:showHideTag>            
        </td>
    </tr>
</base:outlinedTable>
</base:form>

