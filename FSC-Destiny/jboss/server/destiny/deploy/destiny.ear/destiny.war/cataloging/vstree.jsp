<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.VisualSearchSpecs" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%
VisualSearchTreeForm form = (VisualSearchTreeForm)request.getAttribute(VisualSearchTreeForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handlevisualsearchtreeform.do">
    <html:hidden property="nodeID"/>
       <%-- Are we confirming a delete? --%>
    <logic:equal name="cataloging_servlet_VisualSearchTreeForm" property="action" value="ConfirmDelete">
        <base:imageSpacer width="1" height="3"/>
        <base:messageBox showRedBorder="true">
            <tr valign="top">
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td class="ColRowBold"><%= MessageHelper.formatMessage("vstree_TheButtonWillBeDeleted", form.getConfirmationMessage()) %></td>
            </tr>
            <tr>
                <td align="center" class="ColRow" colspan="2"><%= MessageHelper.formatMessage("vstree_AreYouSureYouWantToDeleteThisButtonAndAllOfIts") %></td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2">
                    <base:yesNo 
                    />
                </td>
            </tr>
        </base:messageBox>
    </logic:equal>
</base:form>

<base:outlinedTableAndTabsWithinThere tabs="<%=SearchSetupNavigationForm.getTabs(form.getSessionStore())%>" selectedTab="<%=VisualSearchTreeForm.ID_TAB%>">
<tr><td>
<table border="0" cellspacing="0" cellpadding="3" width="100%">
<tr>
    <td>
        <table id="vstree" border="0" cellspacing="0" cellpadding="0" width="100%">
        <tr class="class">
        <td class="ColRowBold">
        <base:image src="/icons/general/home.gif" width="18" height="16" alt='<%= MessageHelper.formatMessage("vstree_Home") %>'/>&nbsp;<%= MessageHelper.formatMessage("vstree_VisualSearchHome") %></td>
        <td class="Instruction">
            <base:link page="/cataloging/servlet/presentvisualsearcheditform.do?parentID=0" id="<%=VisualSearchTreeForm.ID_LINK_ADD_SEARCH_TO_HOME %>">
                <base:image src="/icons/general/vsaddbutton.gif" width="40" height="16" alt='<%=MessageHelper.formatMessage("vstree_AddASearchOrURLToVisualSearchHome")%>'/>
            </base:link>

            <base:link page="/cataloging/servlet/presentvisualsearcheditform.do?parentID=0&isGroup=true" id="<%=VisualSearchTreeForm.ID_LINK_ADD_GROUP_TO_HOME %>">
                <base:image src="/icons/general/vsaddgroup.gif" width="40" height="16" alt='<%=MessageHelper.formatMessage("vstree_AddAGroupToVisualSearchHome")%>'/>
            </base:link>
        </td>
        </tr>
        <logic:iterate id="node" name="cataloging_servlet_VisualSearchTreeForm" property="flatList" type="com.follett.fsc.destiny.client.cataloging.data.VisualSearchItem">
            <base:flipper key="vstree">
                <%-- DO NOT change the line breaks on any of these lines of this TD.  If you
                     do, it will break acceptance test test00145_DisplayVisualTree and others --%>
                <logic:equal name="node" property="nodeType" value="0"><td class="ColRowBold"></logic:equal>
                <logic:notEqual name="node" property="nodeType" value="0"><td class="ColRow"></logic:notEqual>
                    <% for (int index = 0; index < node.getIndentLevel() + 1; index++) { %><base:imageSpacer width="25" height="1"/><% } %>
                    <logic:equal name="node" property="nodeType" value="0"><base:image src="/icons/general/folderclosed.gif" width="18" height="16" alt='<%= MessageHelper.formatMessage("vstree_Group") %>'/></logic:equal>
                    <logic:notEqual name="node" property="nodeType" value="0">
                        <logic:equal name="node" property="nodeType" value='<%="" + VisualSearchSpecs.TYPE_ELEMENT_SEARCH%>'><base:image src="/icons/general/find_18.gif" width="18" height="16" alt='<%= MessageHelper.formatMessage("vstree_Search") %>'/></logic:equal>
                        <logic:equal name="node" property="nodeType" value='<%="" + VisualSearchSpecs.TYPE_ELEMENT_URL%>'><base:image src="/icons/general/vsurl.gif" width="18" height="16" alt='<%= MessageHelper.formatMessage("vstree_URL") %>'/></logic:equal>
                        <logic:equal name="node" property="nodeType" value='<%="" + VisualSearchSpecs.TYPE_ELEMENT_CATEGORY%>'><base:image src="/icons/general/find_18.gif" width="18" height="16" alt='<%= MessageHelper.formatMessage("vstree_CategorySearch") %>'/></logic:equal>
                        <logic:equal name="node" property="nodeType" value='<%="" + VisualSearchSpecs.TYPE_ELEMENT_PUBLIC_LIST%>'><base:image src="/icons/general/find_18.gif" width="18" height="16" alt='<%= MessageHelper.formatMessage("vstree_PublicList") %>'/></logic:equal>
                    </logic:notEqual>
                    <bean:write name="node" property="description"/>
                </td>
                <td class="Instruction" valign="bottom" nowrap>
                    <base:link page='<%= node.getEditURL() %>' id="<%=VisualSearchTreeForm.ID_LINK_EDIT + node.getNodeID() %>">
                        <base:image src="/icons/general/edit_40.gif" alt='<%= MessageHelper.formatMessage("vstree_Edit", node.getDescription()) %>' width="40" height="16" />
                    </base:link>&nbsp;

                    <base:link page='<%= node.getDeleteURL() %>' id="<%=VisualSearchTreeForm.ID_LINK_DELETE + node.getNodeID() %>">
                        <base:image src="/icons/general/delete_40.gif" width="40" height="16" alt='<%=MessageHelper.formatMessage("vstree_Delete", node.getDescription()) %>'/>
                    </base:link>&nbsp;

                    <logic:equal name="node" property="nodeType" value="0">
                        <base:link page='<%= node.getAddButtonURL() %>' id="<%=VisualSearchTreeForm.ID_LINK_ADD_SEARCH + node.getNodeID() %>">
                            <base:image src="/icons/general/vsaddbutton.gif" width="40" height="16" alt='<%=MessageHelper.formatMessage("vstree_AddASearchOrURLTo", node.getDescription()) %>'/>
                        </base:link>&nbsp;

                        <base:link page='<%= node.getAddSubGroupURL() %>' id="<%=VisualSearchTreeForm.ID_LINK_ADD_SUBGROUP + node.getNodeID() %>">
                            <base:image src="/icons/general/vsaddgroup.gif" width="40" height="16" alt='<%=MessageHelper.formatMessage("vstree_AddASubgroupTo",node.getDescription())  %>'/>
                        </base:link>
                    </logic:equal>
                </td>
            </base:flipper>
        </logic:iterate>
        </table>

    <td>
        <base:imageSpacer width="15" height="1"/>
    </td>
    <td valign="top">
        <table id="legendTable" border="1" bordercolor="Black" cellspacing="0" cellpadding="3">
        <tr>
            <td>
                <table border="0" cellspacing="0" cellpadding="3">
                <tr valign="top">
                    <td valign="top">
                        <base:image src="/icons/general/vsaddbutton.gif" width="40" height="16" alt='<%= MessageHelper.formatMessage("vstree_AddASearchOrURL") %>'/>
                    </td>
                    <td class="Instruction">
                        =
                    </td>
                    <td class="Instruction"><%= MessageHelper.formatMessage("vstree_AddASearch") %></td>
                </tr>
                <tr valign="top">
                    <td valign="top">
                        <base:image src="/icons/general/vsaddgroup.gif" width="40" height="16" alt='<%= MessageHelper.formatMessage("vstree_AddAGroup") %>'/>
                    </td>
                    <td class="Instruction">
                        =
                    </td>
                    <td class="Instruction"><%= MessageHelper.formatMessage("vstree_AddAGroup") %></td>
                </tr>
                <tr valign="top">
                    <td valign="top">
                        <base:image src="/icons/general/edit_40.gif" width="40" height="16" alt='<%= MessageHelper.formatMessage("vstree_EditItem") %>'/>
                    </td>
                    <td class="Instruction">
                        =
                    </td>
                    <td class="Instruction"><%= MessageHelper.formatMessage("vstree_EditItem") %></td>
                </tr>
                <tr valign="top">
                    <td valign="top">
                        <base:image src="/icons/general/delete_40.gif" width="40" height="16" alt='<%= MessageHelper.formatMessage("vstree_DeleteItem") %>'/>
                    </td>
                    <td class="Instruction">
                        =
                    </td>
                    <td class="Instruction"><%= MessageHelper.formatMessage("vstree_DeleteItem") %></td>
                </tr>
                </table>
            </td>
        </tr>
        </table>

    </td>
</tr>
</table>
</td></tr>
</base:outlinedTableAndTabsWithinThere>
