<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.client.common.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.HomeLinkSpecs"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<base:messageBox strutsErrors="true"/>
<%
EditHomeLinkForm form =
(EditHomeLinkForm)request.getAttribute(EditHomeLinkForm.FORM_NAME);
%>
<base:form action="/common/servlet/handleedithomelinkform.do" focus="<%=EditHomeLinkForm.FIELD_DISPLAYTEXT%>" method="post">
<html:hidden property="linkID"/>
<bean:define id="groupIDTypes" name="<%=EditHomeLinkForm.FORM_NAME%>" property="groupTypes"/>

<table border="0" cellspacing="0" cellpadding="3" align="center">
<tr>
    <td>
        <base:outlinedTable borderColor="#c0c0c0" id="siteTable" width="100%">
        <tr>
            <td class="FormLabel tdAlignRight" nowrap><%= MessageHelper.formatMessage("edithomelink_DisplayText") %></td>
            <td>
              <html:text property="<%=EditHomeLinkForm.FIELD_DISPLAYTEXT%>" size="30" maxlength='<%=""+HomeLinkSpecs.HOME_LINK_DESCRIPTION_MAX%>'/>
            </td>
        </tr>

        <tr>
            <td class="FormLabel tdAlignRight" nowrap><%= MessageHelper.formatMessage("edithomelink_URL") %></td>
            <td>
                <html:text property="<%=EditHomeLinkForm.FIELD_URL%>" size="30" maxlength='<%=""+HomeLinkSpecs.HOME_LINK_URL_LENGTH_MAX%>'/>
            </td>
        </tr>

        <tr>
            <td class="FormLabel tdAlignRight" nowrap><%= MessageHelper.formatMessage("edithomelink_Group") %></td>
            <td>
                <html:select property="<%=EditHomeLinkForm.FIELD_GROUPID%>">
                    <html:options collection="groupIDTypes" property="longID"
                                  labelProperty="stringDesc"/>
                </html:select>
            </td>
        </tr>

        </base:outlinedTable>
    </td>
</tr>
<tr>
    <td align="center" class="ColRowBold">
        <base:showHideTag id="onSave">
            <base:saveButton onclick="hideElementonSave()" name="<%= EditHomeLinkForm.BUTTON_NAME_SAVE %>"/>
            &nbsp;
            <base:cancelButton/>
        </base:showHideTag>
    </td>
</tr>
</table>

</base:form>

