<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ page import="com.follett.fsc.destiny.client.consortium.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.consortium.data.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    ConsortiumTreeForm form = (ConsortiumTreeForm)request.getAttribute(ConsortiumTreeForm.FORM_NAME);
	String focus = "";
	if (ConsortiumTreeForm.ACTION_DELETE_CONFIRM_BEFORE_PASSWORD_ENTERED.equals(form.getAction())) {
		focus = "password";
	}
%>


<%@page import="com.follett.fsc.destiny.entity.ejb3.ConsortiumMemberVO"%><base:messageBox strutsErrors="true"/>

    <%-- Added a new site. Tell them about it! --%>
    <logic:notEqual name="<%=ConsortiumTreeForm.FORM_NAME%>" property="newMemberUserName" value="">
    	<base:imageSpacer width="1" height="3"/>
        <base:messageBox>
            <tr align="center">
                <td class="ColRowBold" align="center">
                    <bean:write name="consortium_servlet_ConsortiumTreeForm" property="newMemberName" /> added to <bean:write name="consortium_servlet_ConsortiumTreeForm" property="consortiumName" />.
                </td>
            </tr>
            <tr align="center">
                <td class="ColRow" align="center">
                    Administrator User Name: <bean:write name="consortium_servlet_ConsortiumTreeForm" property="newMemberUserName" />
                </td>
            </tr>
            <tr align="center">
                <td class="ColRow" align="center">
                    Password: password
                </td>
            </tr>
        </base:messageBox>
    </logic:notEqual>



<logic:equal name="<%=ConsortiumTreeForm.FORM_NAME%>" property="action" value="<%=ConsortiumTreeForm.ACTION_DELETE_CONFIRM_BEFORE_PASSWORD_ENTERED%>">

<base:form action="/consortium/servlet/handleconsortiumtreeform.do" focus="<%=focus%>">
    <html:hidden property="editContextName"/>
    <html:hidden property="groupID"/>
    	<base:imageSpacer width="1" height="3"/>
        <base:messageBox showWarningIcon="true" filterMessage="true" message='<%=form.getConfirmationMemberName() + " will be removed from " + form.getConsortiumName() + "."%>'>
            <html:hidden property="action" value="<%=ConsortiumTreeForm.ACTION_DELETE_CONFIRM_AFTER_PASSWORD_ENTERED%>"/>
            <tr>
                <td align="center" class="ColRow" colspan="2">
                    This process will remove the specified participant from <%=ResponseUtils.filter(form.getConsortiumName())%>.  
                    It will not delete their data; however, users will not be able to access their installation.
                </td>
            </tr>
            <tr>
                <td align="center" class="ColRow" colspan="2">
                    <logic:equal name="consortium_servlet_ConsortiumTreeForm" property="invalidPassword" value="true">
                        <font color="#cc0000">Invalid password</font>
                    </logic:equal>
                    <logic:equal name="consortium_servlet_ConsortiumTreeForm" property="invalidPassword" value="false">
                        To continue, please enter the Super Administrator password:
                    </logic:equal>

                </td>
            </tr>
            <tr>
                <td align="center" class="ColRow" colspan="2">
                    <input type="password" name="<%=ConsortiumTreeForm.FIELD_PASSWORD%>" size="14" maxlength="20" autocomplete="off"/>
                </td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2">
                    <html:submit property="<%=SaveButtonTag.BUTTON_NAME %>">
                      OK
                    </html:submit>
                    <html:cancel>
                      Cancel
                    </html:cancel>
                </td>
            </tr>
        </base:messageBox>
    </base:form>

</logic:equal>

<logic:equal name="<%=ConsortiumTreeForm.FORM_NAME%>" property="action" value="<%=ConsortiumTreeForm.ACTION_DELETE_CONFIRM_AFTER_PASSWORD_ENTERED%>">
    <base:form action="/consortium/servlet/handleconsortiumtreeformunsecure.do">
        <html:hidden property="editContextName"/>
        <html:hidden property="groupID"/>

		<base:imageSpacer width="1" height="3"/>        
        
        <% 
            String message2 = "Are you really sure you want to delete " + form.getDeleteDescription() + " " + form.getConfirmationMemberName();
        
            if ( form.isJobRunning() ) {
                String message1 = "You cannot stop or reverse this process.<br><br>";
                String jobMessage = "One or more jobs are currently in progress at " + form.getDeleteDescription() + " " + form.getConfirmationMemberName();
                %>

                <base:messageBox showWarningIcon="true" message="<%=jobMessage %>">
                    <html:hidden property="action" value="<%=ConsortiumTreeForm.ACTION_DELETE_CONFIRMED%>"/>
                    <tr>
                        <td align="center" class="ColRow" colspan="2">
                            <%=message1 + message2 %>?
                        </td>                    
                    </tr>
                    <tr>
                        <td valign="baseline" align="center" class="ColRow" colspan="2" nowrap>
                            <base:yesNo/>
                        </td>
                    </tr>
                </base:messageBox>
        <%} else { %>
                <base:messageBox showWarningIcon="true" message="You cannot stop or reverse this process.">
                    <html:hidden property="action" value="<%=ConsortiumTreeForm.ACTION_DELETE_CONFIRMED%>"/>
                    <tr>
                        <td align="center" class="ColRow" colspan="2">
                            <%=message2 %>?
                        </td>
                    </tr>
                    <tr>
                        <td valign="baseline" align="center" class="ColRow" colspan="2" nowrap>
                            <base:yesNo/>
                        </td>
                    </tr>
                </base:messageBox>            
        <% } %>                
        
    </base:form>    
</logic:equal>


<base:form action="/consortium/servlet/handleconsortiumtreeform.do" method="post">
    <html:hidden property="<%=GenericConsortiumAdminForm.KEY_SHOW_AASP_MESSAGE %>" />
    <logic:equal name="<%=ConsortiumTreeForm.FORM_NAME%>" property="<%=GenericConsortiumAdminForm.KEY_SHOW_AASP_MESSAGE %>" value="true">
        <jsp:include page="/common/aaspmessagebox.jsp">
            <jsp:param name="formName" value="consortiumtreeform"/>
            <jsp:param name="fromConsortium" value="true"/>
        </jsp:include>
    </logic:equal>

<base:outlinedTableAndTabsWithinThere id="<%=ConsortiumTreeForm.TABLE_CONSORTIUM_HEADER%>" selectedTab="<%=ConsortiumTreeForm.TAB%>" tabs="<%=ConsortiumTreeForm.tabs%>" align="center" width="100%">
    <tr>
            <td class="ColRowBold" colspan="5" width="100%">
                <base:image src="/icons/general/consortium.gif" width="18" height="16"  alt="Home"/>
                &nbsp;<bean:write name="consortium_servlet_ConsortiumTreeForm" property="consortiumName"/>
            </td>
            <td class="tdAlignRight" nowrap>
                <base:link page="/consortium/servlet/presenteditconsortiumgroupform.do">
                    <base:image src="/icons/general/distaddtype.gif" width="40" height="16"  alt="<%= ConsortiumTreeForm.LINK_ADD_GROUP%>"/>
                </base:link>
            </td>
            <td class="tdAlignRight" nowrap>
                <base:link page="/consortium/servlet/presentconsortiummemberaddeditform.do?addType=New">
                    <base:image src="/icons/general/distadd.gif" width="40" height="16" alt="<%= ConsortiumTreeForm.LINK_ADD_MEMBER%>"/>
                </base:link>
            </td>
            <td class="tdAlignRight" nowrap>
                <base:link page="/consortium/servlet/presenteditconsortiumform.do">
                    <base:image src="/icons/general/edit_40.gif" width="40" height="16" alt='<%= "Edit " + ResponseUtils.filter(form.getConsortiumName())%>'/>
                </base:link>
            </td>
            <td class="tdAlignRight" nowrap>
                &nbsp;
            </td>
            
        </tr>
        
    <tr>
    <td colspan="9">
        <table id="<%=ConsortiumTreeForm.TABLE_TREE %>" width="100%" border="0" cellpadding="2" cellspacing="0">

        
        <%
            List memberList = form.getMembers();
            Long lastGroupID = null;
            ConsortiumMemberClientValue dtr;
            Iterator itr = memberList.iterator();

            while ( itr.hasNext() ) {
                dtr = (ConsortiumMemberClientValue) itr.next();
                Long groupID = dtr.getGroupID();

                if ( groupID != null && (lastGroupID == null || !groupID.equals(lastGroupID))) {
                    // output a new group

                    lastGroupID = dtr.getGroupID();
                    %>
                    <base:flipper key="consortiumtree">

                    <td>
                    	<base:imageSpacer width="18" height="1"/>
                    </td>
                    <td>
                        <base:image src="/icons/general/folderclosed.gif" width="18" height="16" alt="Group"/>
                    </td>
                    <td class="ColRowBold" colspan="2" width="100%">
                        <%= ResponseUtils.filter(dtr.getGroupName()) %>
                    </td>
                    <td colspan="2">
                        &nbsp;
                    </td>

                    <td>
                        &nbsp;
                    </td>
                    <td nowrap>
                        <base:link page='<%= "/consortium/servlet/presenteditconsortiumgroupform.do?" + ConsortiumTreeForm.PARM_GROUP_ID + "=" + dtr.getGroupID() %>'>
                            <base:image src="/icons/general/edit_40.gif" width="40" height="16"  alt='<%="Edit " +  ResponseUtils.filter(dtr.getGroupName()) %>'/>
                        </base:link>
                    </td>
                        <% if ( dtr.getName() == null ) {%>
                            <td>
                                <base:link page='<%= "/consortium/servlet/handleconsortiumtreeformunsecure.do?action="+ConsortiumTreeForm.ACTION_DELETE_CONFIRM_AFTER_PASSWORD_ENTERED+"&" + ConsortiumTreeForm.PARM_GROUP_ID + "=" + dtr.getGroupID() %>'>
                                    <base:image src="/icons/general/delete_40.gif" width="40" height="16" alt='<%= "Delete " + ResponseUtils.filter(dtr.getGroupName()) %>'/>
                                </base:link>
                            </td>
                        <% } else {%>
                            <td>
                                &nbsp;
                            </td>
                        <% } %>
                    </base:flipper>
            <%
               } // if group loop

               if ( dtr.getName() != null ) { %>
                    <base:flipper key="consortiumtree">
                    <td>
                    	<base:imageSpacer width="18" height="1"/>
                    </td>
                    <td valign="middle">
                        <% if ( dtr.getGroupID() == null ) { %>
                            <base:image src="/icons/general/disthome.gif" width="18" height="16" alt="Member"/>
                        <% } %>
                    </td>

                    <td class="ColRow" colspan="2" width="100%" valign="middle">
                        <% if ( dtr.getGroupID() != null ) {  %>
                            <base:image src="/icons/general/disthome.gif" width="18" height="16" alt="Member"/>&nbsp;
                        <% }%><B><%= ResponseUtils.filter(dtr.getName()) %></B>
                        <% if (dtr.isMemberDisabled()) { %>
                        <font color="#FF0000">(Disabled)</font>
                        <% } %>
                    </td>
                    <td colspan="3">
                        &nbsp;
                    </td>
                    <td nowrap>
                        <base:link page='<%= "/consortium/servlet/presentconsortiummemberaddeditform.do?editContextName=" + dtr.getConsortiumContextName()%>'>
                            <base:image src="/icons/general/edit_40.gif" width="40" height="16"  alt='<%= "Edit " + ResponseUtils.filter(dtr.getName()) %>'/>
                        </base:link>
                    </td>
                    <td nowrap>
                        <% if (!dtr.isStateRepository()) { %>
                        <base:link page='<%= "/consortium/servlet/handleconsortiumtreeform.do?action=" + ConsortiumTreeForm.ACTION_DELETE_CONFIRM_BEFORE_PASSWORD_ENTERED + "&editContextName=" + dtr.getConsortiumContextName() %>'>
                            <base:image src="/icons/general/delete_40.gif" width="40" height="16" alt='<%="Delete " + ResponseUtils.filter(dtr.getName()) %>'/>
                        </base:link>
                        <% } %>
                    </td>
                </base:flipper>


            <%
               } // if siteID != null
            }  // iterator loop
            %>

            <tr><td colspan="9">&nbsp;</td></tr>
            <tr>
                <td colspan="9" valign="top">
                    <base:imageLine/>
                </td>
            </tr>
        </table>
    </td>
    </tr>
    <tr>
        <td colspan="9" align="center">

            <table id="<%=ConsortiumTreeForm.TABLE_CONSORTIUM_LEGEND%>" border="0" width="100%" cellspacing="0" cellpadding="3" align="center">
            <tr valign="top">
                <td valign="top" class="Instruction" align="center">
                    <base:image src="/icons/general/distaddtype.gif" width="40" height="16"  alt="<%=ConsortiumTreeForm.LINK_ADD_GROUP %>"/>
                    = <%=ConsortiumTreeForm.LINK_ADD_GROUP %>
                </td>
                <td valign="top" class="Instruction" align="center">
                    <base:image src="/icons/general/distadd.gif" width="40" height="16"  alt="<%=ConsortiumTreeForm.LINK_ADD_MEMBER %>"/>
                    = <%=ConsortiumTreeForm.LINK_ADD_MEMBER %>
                </td>
                <td valign="top" class="Instruction" align="center">
                    <base:image src="/icons/general/edit_40.gif" width="40" height="16"  alt="Edit"/>
                    = Edit
                </td>
                <td valign="top" class="Instruction" align="center">
                    <base:image src="/icons/general/delete_40.gif" width="40" height="16"  alt="Delete"/>
                    = Delete
                </td>
            </tr>
            </table>

        </td>
    </tr>

  </base:outlinedTableAndTabsWithinThere>
</base:form>
