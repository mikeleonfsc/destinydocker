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


<base:messageBox strutsErrors="true"/>
<%
    EditMaterialTypeIconsForm form = (EditMaterialTypeIconsForm)request.getAttribute(EditMaterialTypeIconsForm.FORM_NAME);
%>
<base:form action="/cataloging/servlet/handleeditmaterialtypeiconsform.do">

<base:outlinedTableAndTabsWithinThere id="<%=EditMaterialTypeIconsForm.TABLE_EDIT_MATERIAL_TYPE_ICONS%>"  selectedTab="<%=EditMaterialTypeIconsForm.ID_TAB%>" tabs="<%=AddTitleNavigationForm.getTabsLibraryMode()%>" >
<tr><td>
        <table id="<%= EditMaterialTypeIconsForm.TABLE_LIST %>" width="100%" cellspacing="0" cellpadding="3" border="0">
            <tr valign="top">
                <td colspan="3" class="Instruction" align="center"><%= MessageHelper.formatMessage("editmaterialtypeicons_ClickTheIconYouWantToEdit") %></td>
            </tr>
            <tr>
                <td width="35%" class="TableHeading2 tdAlignRight"><%= MessageHelper.formatMessage("editmaterialtypeicons_Template") %></td>
                <td width="48%" class="TableHeading2" align="center"><%= MessageHelper.formatMessage("editmaterialtypeicons_StandardIcon") %></td>
                <td width="17%" align="center" class="TableHeading2" nowrap><%= MessageHelper.formatMessage("editmaterialtypeicons_ElementaryVisualSearchIcon") %></td>
            </tr>
            <%= form.getBibIconsRows() %>
        </table>
    </td>
</tr>    
</base:outlinedTableAndTabsWithinThere>

</base:form>
