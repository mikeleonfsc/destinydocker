<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.net.*" %>
<%@ page import="com.follett.fsc.destiny.util.URLHelper" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.DistrictTabHelper"%>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    DistrictUsersForm form = (DistrictUsersForm)request.getAttribute(DistrictUsersForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
%>

<base:messageBox strutsErrors="true"/>

    <logic:equal name="<%=DistrictUsersForm.FORM_NAME%>" property="<%=GenericDistrictForm.KEY_SHOW_FOLLETT_SHELF_MESSAGE %>" value="true">
        <jsp:include page="/district/fsmessagebox.jsp">
            <jsp:param name="formName" value="districtusersform"/>
        </jsp:include>
    </logic:equal>

    <logic:equal name="<%=DistrictUsersForm.FORM_NAME%>" property="<%=GenericDistrictForm.KEY_SHOW_AASP_MESSAGE %>" value="true">
        <base:form action="/district/servlet/handledistrictusersform.do">
        	<html:hidden property="<%=GenericDistrictForm.KEY_SHOW_AASP_MESSAGE %>" />
        	<jsp:include page="/common/aaspmessagebox.jsp">
            	<jsp:param name="formName" value="districtusersform"/>
        	</jsp:include>
        </base:form>
    </logic:equal>
<logic:equal name="district_servlet_DistrictUsersForm" property="action" value="delete">
	<base:form action="/district/servlet/handledistrictusersform.do">
        <html:hidden property="userID"/>
        <html:hidden property="action" value="confirmDelete"/>

        <base:imageSpacer width="1" height="3"/>
        
        <base:messageBox showWarningIcon="false" showRedBorder="true">
            <tr valign="top">
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td class="ColRowBold">
                    <logic:equal name="district_servlet_DistrictUsersForm" property="showBookListWarning" value="true">
                        <ul><li>This user's List will be emptied.</li></ul><br>
                    </logic:equal>
                    Are you sure you want to delete user '<bean:write name="district_servlet_DistrictUsersForm" property="deleteUserName" />'?
                </td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2">
                    <base:yesNo/>
                </td>
            </tr>
        </base:messageBox>
	</base:form>
</logic:equal>


  <% // This table can't be less than 100% or the tabs will be misaligned %>
<%
    String msg = GenericForm.getSQLAndAppServerTimeOutOfSyncMsg();
    if (msg != null) {
%>
    <center><span class="ColRowBold"><%= msg %></span></center><BR>
<%  } %>    
<center><span class="ColRowBold"><%= GenericForm.getLastBackupDisplayMsg(false) %></span></center><br>
<jsp:include page="/common/msdewarning.jsp" flush="true" />
  <table align="center" width="95%"><tr><td>
  <base:outlinedTableAndTabsWithinThere id="districtTabs" selectedTab="<%=DistrictUsersForm.TAB%>" tabs="<%=DistrictTabHelper.getDisplayableTabs(store)%>" align="center" width="100%">
    <tr>
    <td>
        <table id="districtUsers" width="100%" border="0" cellpadding="2" cellspacing="0">

        <tr>
            <td class="ColRowBold" colspan="4">
                <base:image src="/icons/general/distadminhome.gif" width="18" height="16"  alt="Home"/>
                &nbsp;Destiny Administrator
            </td>
            <td class="tdAlignRight">
                <base:link page="/district/servlet/presentdistrictedituserform.do" id="<%=DistrictUsersForm.ID_ADD_USER %>">
                    <base:image src="/icons/general/distadminadd.gif" width="40" height="16"  alt="Add a User"/>
                </base:link>
            </td>
            <td>
                <base:link page="/district/servlet/presenteditdistrictadminform.do" id="<%=DistrictUsersForm.ID_EDIT_DESTINY_ADMINISTRATOR %>">
                    <base:image src="/icons/general/edit_40.gif" width="40" height="16" alt="Edit Destiny Administrator"/>
                </base:link>
            </td>
        </tr>





        <% int flipper = 0; %>

        <logic:iterate id="userList" name="district_servlet_DistrictUsersForm" property="userList" type="com.follett.fsc.destiny.util.lookup.LongStringLookup">
        <%
            if ( ( flipper & 1 ) == 0 ) {
                out.println("<tr bgcolor=\"#E8E8E8\">");
            }
            else {
                out.println("<tr>");
            }
            flipper++;
        %>

                <td>
                    <base:imageSpacer width="25" height="1"/>
                </td>
                <td>
                    <base:image src="/icons/general/distadminfolder.gif" width="18" height="16" alt="User"/>
                </td>
                <td class="ColRow" colspan="2">
                    <bean:write name="userList" property="stringDesc"/>
                </td>
                <td>
                    &nbsp;
                </td>

                <td>
                    <base:link page='<%= "/district/servlet/presentdistrictedituserform.do?userID=" + userList.getLongID() %>'>
                        <base:image src="/icons/general/edit_40.gif" width="40" height="16" alt='<%="Edit " + ResponseUtils.filter(userList.getStringDesc()) %>'/>
                    </base:link>
                    <base:link page='<%= "/district/servlet/handledistrictusersform.do?action=delete&userID=" + userList.getLongID() + "&deleteUserName=" + URLHelper.encodeURL(userList.getStringDesc()) %>'>
                        <base:image src="/icons/general/delete_40.gif" width="40" height="16"  alt='<%= "Delete " + ResponseUtils.filter(userList.getStringDesc()) %>'/>
                    </base:link>
                </td>
            </tr>
        </logic:iterate>

        <tr>
            <td colspan="6" valign="top">
                <base:imageLine/>
            </td>
        </tr>
        </table>
    </td>
    </tr>
    <tr>
        <td colspan="6" align="center">

            <table id="legendTable" border="0" width="100%" cellspacing="0" cellpadding="3" align="center">
            <tr valign="top">
                <td valign="top" class="Instruction" align="center">
                    <base:image src="/icons/general/distadminadd.gif" width="40" height="16"  alt="Add a District User"/>
                    = Add District User
                </td>
                <td valign="top" class="Instruction" align="center">
                    <base:image src="/icons/general/edit_40.gif" width="40" height="16" alt="Edit District User"/>
                    = Edit District User
                </td>
                <td valign="top" class="Instruction" align="center">
                    <base:image src="/icons/general/delete_40.gif" width="40" height="16" alt="Delete District User"/>
                    = Delete District User
                </td>
            </tr>
            </table>

        </td>
    </tr>

    </table>
  </base:outlinedTableAndTabsWithinThere>
  </td></tr></table>

