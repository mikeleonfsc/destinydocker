<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>




<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>




<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handlecategoryeditform.do" focus="description1">

<html:hidden property="categoryID" />
<html:hidden property="isAdd" />

<table id="categoryEditTable" border="0" cellspacing="4" cellpadding="0">
    <logic:equal name="cataloging_servlet_CategoryEditForm" property="isAdd" value="true" >
        <tr>
            <td>&nbsp;</td>
            <td class="FormLabel"><%= MessageHelper.formatMessage("categoryedit_CategoryDescriptions") %></td>
        <tr>
    </logic:equal>
    <tr>
        <td class="FormLabel">
            <logic:equal name="cataloging_servlet_CategoryEditForm" property="isAdd" value="true" >1.</logic:equal>
            <logic:equal name="cataloging_servlet_CategoryEditForm" property="isAdd" value="false" ><%= MessageHelper.formatMessage("categoryedit_CategoryDescription") %></logic:equal>
        </td>
        <td class="ColRow" >
            <html:text property="description1" size="30" maxlength="30"/>
        </td>
    </tr>

<logic:equal name="cataloging_servlet_CategoryEditForm" property="isAdd" value="true" >
    <tr>
        <td class="FormLabel">2.</td>
        <td class="ColRow" >
            <html:text property="description2" size="30" maxlength="30"/>
        </td>
    </tr>
    <tr>
        <td class="FormLabel">3.</td>
        <td class="ColRow" >
            <html:text property="description3" size="30" maxlength="30"/>
        </td>
    </tr>
    <tr>
        <td class="FormLabel">4.</td>
        <td class="ColRow" >
            <html:text property="description4" size="30" maxlength="30"/>
        </td>
    </tr>
    <tr>
        <td class="FormLabel">5.</td>
        <td class="ColRow" >
            <html:text property="description5" size="30" maxlength="30"/>
        </td>
    </tr>
</logic:equal>
    <tr>
        <td colspan="2" class="ColRowBold" align="center">
            <base:showHideTag id="onSave">
                <base:saveButton onclick="hideElementonSave()" name="submit"/>
                &nbsp;
                <base:cancelButton />
            </base:showHideTag>
        </td>
    </tr>
</table>

</base:form>
