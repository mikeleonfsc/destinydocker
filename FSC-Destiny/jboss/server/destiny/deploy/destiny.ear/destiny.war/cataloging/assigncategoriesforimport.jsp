<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.AssignCategoriesForImportForm" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.util.lookup.LongStringLookup" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>




<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>



<base:messageBox strutsErrors="true"/>
<bean:define id="form" name="cataloging_servlet_AssignCategoriesForImportForm" type="AssignCategoriesForImportForm"/>
<% form.resetFlipper(); %>
<base:form action="/cataloging/servlet/handleassigncategoriesforimportform.do">
<html:hidden property="<%=AssignCategoriesForImportForm.PARM_SITEID%>"/>
<table id="<%=AssignCategoriesForImportForm.TABLE_ASSIGN_CATS_CATEGORY%>" border="0" cellpadding="3" cellspacing="0">
<tr>

<%
    if (form.getCategoryList().size() > 0) {
%>
    <td class="SmallColHeading"><%= MessageHelper.formatMessage("assigncategoriesforimport_CategoryDescription") %></td>
    <td>&nbsp;</td>
    <td class="SmallColHeading"><%= MessageHelper.formatMessage("assigncategoriesforimport_Assigned") %></td>
<%
    } else {
        out.println("<td colspan=\"3\" align=\"center\" class=\"ColRowBold\">"+ MessageHelper.formatMessage("assigncategoriesforimport_ThereAreNoCategoriesForThisSite") +"</td>");
    }
%>
</tr>

<logic:iterate id="categoryItem" name="cataloging_servlet_AssignCategoriesForImportForm" property="categoryList" type="com.follett.fsc.destiny.util.lookup.LongStringLookup">
    <%= form.getFlipper() %>
        <td class="ColRow">
            <%= ResponseUtils.filter(categoryItem.getStringDesc() )%>
        </td>
        <td><base:imageSpacer width="100" height="1"/></td>
        <td align="center">
            <html:multibox property="<%= AssignCategoriesForImportForm.FIELD_SELECTED_CATEGORIES %>" >
            <%= categoryItem.getLongID().toString() %>
            </html:multibox>
        </td>
    </tr>
</logic:iterate>

<tr>
    <td class="ColRow" colspan="3">&nbsp;</td>
</tr>
<tr>
    <td colspan="3" align="center">
        <base:okButton/>
        &nbsp;
        <base:cancelButton/>
    </td>
</tr>


</table>
</base:form>
