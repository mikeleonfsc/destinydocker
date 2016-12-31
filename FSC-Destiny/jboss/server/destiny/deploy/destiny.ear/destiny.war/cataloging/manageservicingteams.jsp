<%@ page import="com.follett.fsc.destiny.session.backoffice.data.ServicingTeamValue"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.ManageServicingTeamsForm"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.destiny.util.ObjectHelper"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.util.lookup.LongStringLookup" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.EditDistrictForm" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<bean:define id="form" name="<%= ManageServicingTeamsForm.FORM_NAME %>" type="com.follett.fsc.destiny.client.cataloging.servlet.ManageServicingTeamsForm"/>

<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handlemanageservicingteamsform.do">
    <logic:equal name="<%= ManageServicingTeamsForm.FORM_NAME %>" property="action" value="<%= ManageServicingTeamsForm.ACTION_DELETE %>">
        <logic:notEmpty name="<%= ManageServicingTeamsForm.FORM_NAME %>" property="blockMessageText">
            <base:messageBox showRedBorder="true">
                <tr valign="middle">
                    <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                    <td class="ColRowBold" align="center">
                        <%= form.getBlockMessageText() %>
                    </td>
                </tr>
            </base:messageBox>
        </logic:notEmpty>
        <logic:empty name="<%= ManageServicingTeamsForm.FORM_NAME %>" property="blockMessageText">
            <base:messageBox showRedBorder="true">
                <tr valign="center">
                    <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                    <td class="ColRowBold" align="center">Are you sure you want to delete "<%= form.getServicingTeamName() %>"?</td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td valign="baseline" align="center" class="ColRow">
                        <base:yesNo 
                            buttonYesName="<%= ManageServicingTeamsForm.BUTTON_CONFIRM_DELETE %>"
                            buttonNoName="<%= ManageServicingTeamsForm.BUTTON_CANCEL_DELETE %>"
                        />
                    </td>
                </tr>
            </base:messageBox>
        </logic:empty>
    </logic:equal>



  <base:outlinedTable id="<%=ManageServicingTeamsForm.TABLE_MAIN%>" borderColor="#C0C0C0" width="95%">
	<tr>
	    <td>
	        <table id="<%= ManageServicingTeamsForm.TABLE_EDIT %>" width="100%" border="0" cellspacing="0" cellpadding="2">
				<tr>
                    <base:sectionHeading printerFriendly="false" heading="Servicing Teams" tdContent="valign='top'"/>
	                <td class="ColHeading tdAlignRight" background="/images/icons/general/thickline.gif" nowrap>
                        <base:genericButton src="/buttons/large/closex.gif" alt="Close" name="<%= ManageServicingTeamsForm.BUTTON_CLOSE %>" />
                        <base:genericButton src="/buttons/large/addteam.gif" alt="Add new servicing team" name="<%= ManageServicingTeamsForm.BUTTON_ADD_SERVICING_TEAM %>" />
	        		</td>
				</tr>
	        </table>
	    </td>
	</tr>
    <tr>
        <td colspan="2">
            <table border="0" width="100%" cellspacing="0" cellpadding="2" id="<%= ManageServicingTeamsForm.TABLE_LIST%>">
                <tr>
                    <td class="TableHeading2">
                        <% if (!form.isDistrictView()) { %>
                            Local Servicing Teams
                        <% } else {%>
                            District Servicing Teams
                        <% } %>
                    </td>
                    <td class="TableHeading2" align="center">
                        Members Assigned
                    </td>
                </tr>
                <% if (form.getServicingTeamListValue().getLocalTeams().size() == 0) { %>
                    <tr>
                        <td class="ColRow">
                            <% if (form.isDistrictView()) { %>
                                There are no available servicing teams.
                            <% } else { %>
                                There are no available local servicing teams.
                            <% } %>
                        </td>
                    </tr>
                <% } else {
                    Iterator iter = ObjectHelper.getIterator(form.getServicingTeamListValue().getLocalTeams());
                    while (iter.hasNext()) {
                        ServicingTeamValue value = (ServicingTeamValue) iter.next();
                %>
                        <base:flipper key="localServicingTeam">
                            <td class="ColRow" valign="top"><%= ResponseUtils.filter(value.getName()) %></td>
                            <td class="ColRow" align= "center" valign="top"><%= value.getCount() %></td>
                            <td class="ColRow tdAlignRight"><%= form.getButtons(value, true) %></td>
                        </base:flipper>
                    <% } %>
                <% } %>
                
                    <tr>
                        <td>
                            <img src="/images/icons/general/spacer.gif" width="20" height="10">    
                        </td>
                    </tr>
                    <tr>
                        <td class="TableHeading2">
                            Additional Servicing Teams
                        </td>
                        <td class="TableHeading2">&nbsp;</td>
                    </tr>
                    <% if (form.getServicingTeamListValue().getAdditionalTeams().size() == 0) { %>
                        <tr>
                            <td class="ColRow">
                                There are no additional servicing teams.
                            </td>
                        </tr>
                    <% } else {
                        Iterator iter = ObjectHelper.getIterator(form.getServicingTeamListValue().getAdditionalTeams());
                        while (iter.hasNext()) {
                            ServicingTeamValue value = (ServicingTeamValue) iter.next();
                    %>
                        <base:flipper key="additionalServicingTeam" >
                            <td align="left" class="ColRow" valign="top"><%= ResponseUtils.filter(value.getName()) %></td>
                            <td class="ColRow" valign="top">&nbsp;</td>
                            <td align="right" class="ColRow"><%= form.getButtons(value, false) %></td>
                        </base:flipper>
                        <% } %>
                    <% } %>
            </table>
        </td>
    </tr>
    <tr>                
		<td class="ColHeading tdAlignRight" nowrap>
			<base:genericButton src="/buttons/large/closex.gif" alt="Close" name="<%= ManageServicingTeamsForm.BUTTON_CLOSE %>" />
            <base:genericButton src="/buttons/large/addteam.gif" alt="Add new servicing team" name="<%= ManageServicingTeamsForm.BUTTON_ADD_SERVICING_TEAM %>" />
		</td>
	</tr>
  </base:outlinedTable>
</base:form>
