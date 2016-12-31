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

<%@page import="com.follett.fsc.common.MessageHelper"%><base:messageBox strutsErrors="true"/>
<%
    ZSourceListForm form = (ZSourceListForm)request.getAttribute(ZSourceListForm.FORM_NAME);
%>

<base:form action="/cataloging/servlet/handlezsourcelistform.do">

<html:hidden property="<%=ZSourceListForm.FIELD_SOURCEID_TO_DELETE%>" />

<%
    if (form.getSourceIDToDelete() != null && form.getZSourceToDelete() != null) {
        String message = MessageHelper.formatMessage("zsourcelist_AreYouSureYouWantToDelete0", form.getZSourceToDelete().getSourceName());
%>
    <base:messageBox showWarningIcon="false" message="<%=message%>"></td>
    <tr>
        <td class="ColRowBold" align="center">
            <base:yesNo 
                buttonYesName="<%=ZSourceListForm.BUTTON_CONFIRM_DELETE_YES%>"
                buttonNoName="<%=ZSourceListForm.BUTTON_CONFIRM_DELETE_NO%>"
            />
        </td>
    </tr>
    </base:messageBox>
<%
    }
%>
<base:outlinedTableAndTabsWithinThere id="<%=ZSourceListForm.TABLE_UPDATE_ZSOURCE%>"  selectedTab="<%=ZSourceListForm.ID_TAB%>" tabs="<%=AddTitleNavigationForm.getTabsLibraryMode()%>" >
<tr><td>
        <table id="<%= ZSourceListForm.TABLE_LIST %>" width="100%" cellspacing="0" cellpadding="3">
            <tr>
                <td vAlign=top class="TableHeading2"><%=MessageHelper.formatMessage("zsourcelist_UpdateZSources")%></td>
            </tr>
            <logic:notEqual name="<%= ZSourceListForm.FORM_NAME %>" property="zsourcesListSize" value="0">
                <tr>
                    <td class="SmallColHeading"><%=MessageHelper.formatMessage("zsourcelist_Source") %></a></td>
                    <td class="SmallColHeading"><%=MessageHelper.formatMessage("zsourcelist_DomainIP") %></td>
                    <td class="SmallColHeading"><%=MessageHelper.formatMessage("zsourcelist_Port") %></td>
                    <td class="SmallColHeading"><%=MessageHelper.formatMessage("zsourcelist_Database") %></td>
                    <td class="SmallColHeading">&nbsp;</td>
                </tr>
                <%
                    boolean useGray = true;
                %>
                <logic:iterate id="zSource" name="<%= ZSourceListForm.FORM_NAME %>" property="zsources" type="com.follett.fsc.destiny.entity.ejb3.ZSourceVO">
                <%
                    if (useGray) {
                        out.println("<tr bgcolor=\"#E8E8E8\">");
                    } else {
                        out.println("<tr>");
                    }
                    useGray = !useGray;
                %>
                        <td class="ColRow"><bean:write name="zSource" property="sourceName"/></td>
                        <td class="ColRow"><bean:write name="zSource" property="host"/></td>
                        <td class="ColRow"><bean:write name="zSource" property="port"/></td>
                        <td class="ColRow"><bean:write name="zSource" property="databaseName"/></td>
                        <td class="ColRow tdAlignRight">
                            <base:link page="<%=ZSourceListForm.getEditLink(zSource.getSourceID())%>" id="<%=ZSourceListForm.LINK_EDIT_PREFIX + zSource.getSourceID() %>">
                                <base:image src="/icons/general/edit.gif" alt='<%=MessageHelper.formatMessage("zsourcelist_EditZsource") %>'/>
                            </base:link>
                            &nbsp;&nbsp;
                            <base:link page="<%=ZSourceListForm.getDeleteLink(zSource.getSourceID())%>" id="<%=ZSourceListForm.LINK_DELETE_PREFIX + zSource.getSourceID() %>">
                                <base:image src="/icons/general/delete.gif" alt='<%=MessageHelper.formatMessage("zsourcelist_DeleteZsource") %>'/>
                            </base:link>
                        </td>
                    </tr>
                </logic:iterate>
            </logic:notEqual>
            <logic:equal name="<%= ZSourceListForm.FORM_NAME %>" property="zsourcesListSize" value="0">
                <tr>
                    <td class="ColRow" colspan="5"><%=MessageHelper.formatMessage("zsourcelist_NoZSourcesDefined") %></td>
                </tr>
            </logic:equal>
        </table>
    </td>
    <td valign="top" class="tdAlignRight">
        <table width="100%">
            <tr>
                <td valign="top" class="tdAlignRight">
                    <base:genericButton src="/buttons/large/addzsource.gif" name="<%=ZSourceListForm.BUTTON_ADD_ZSOURCE%>" alt='<%=MessageHelper.formatMessage("zsourcelist_AddZsource") %>'/>
                </td>
            </tr>
        </table>
    </td>
</tr>    
</base:outlinedTableAndTabsWithinThere>

</base:form>
