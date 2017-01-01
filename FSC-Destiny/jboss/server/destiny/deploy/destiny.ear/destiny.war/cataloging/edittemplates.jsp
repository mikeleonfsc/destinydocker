<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.*"%>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<% EditTemplatesForm form = (EditTemplatesForm)request.getAttribute(EditTemplatesForm.FORM_NAME); %>



<base:messageBox strutsErrors="true"/>
<bean:define id="materialTypesID" name="<%=EditTemplatesForm.FORM_NAME%>" property="materialTypes"/>

<base:form action="/cataloging/servlet/handleedittemplatesform.do">

<base:outlinedTableAndTabsWithinThere id="<%=EditTemplatesForm.TABLE_EDIT_TEMPLATES%>"  selectedTab="<%=EditTemplatesForm.ID_TAB%>" tabs="<%=AddTitleNavigationForm.getTabsLibraryMode()%>" >
<tr><td>
        <table id="<%= EditTemplatesForm.TABLE_LIST %>" width="100%" cellspacing="0" cellpadding="3">
            <tr valign="top">
                <td class="TableHeading2 tdAlignRight"><%= MessageHelper.formatMessage("edittemplates_SelectMARCTemplate") %></td>
                <td width="250">
                	<html:select size="15" property="<%=EditTemplatesForm.FIELD_MATERIAL_TYPE%>">
                    	<html:options collection="materialTypesID" property="stringCode" labelProperty="stringDesc"/>
                	</html:select>
                </td>
                <td>
                    <base:genericButton name="<%=EditTemplatesForm.ID_BUTTON_EDIT%>" src="/buttons/large/edit2.gif" alt='<%= MessageHelper.formatMessage("edit") %>'/>
				</td>
            </tr>
        </table>
    </td>
</tr>    
</base:outlinedTableAndTabsWithinThere>

</base:form>
