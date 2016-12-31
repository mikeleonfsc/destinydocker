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

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
	SiteAdministrationForm form = (SiteAdministrationForm)request.getAttribute(SiteAdministrationForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true"/>

<% // do we need the next 3 lines?? %>
<base:form action="/backoffice/servlet/handlesiteadministrationform.do">
    <logic:equal name="<%= SiteAdministrationForm.FORM_NAME %>" property="fromSiteConfig" value="true">
	    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">
	    <jsp:include page="/common/msdewarning.jsp" flush="true" />
    
	    <logic:equal name="<%= SiteAdministrationForm.FORM_NAME %>" property="action" value="<%= SiteAdministrationForm.ACTION_DELETE %>">
	        <html:hidden property="<%= SiteAdministrationForm.FIELD_DEPARTMENT_ID %>"/>
		    <logic:notEmpty name="<%= SiteAdministrationForm.FORM_NAME %>" property="blockReassignMessageText">
		        <base:messageBox showRedBorder="true">
			        <tr valign="center">
			            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
		                <td class="ColRowBold" align="center">
		                    <%= form.getBlockReassignMessageText() %>
		                </td>
		            </tr>
	       		</base:messageBox>
		    </logic:notEmpty>
		    <logic:empty name="<%= SiteAdministrationForm.FORM_NAME %>" property="blockReassignMessageText">
		        <base:messageBox showRedBorder="true">
		        <tr valign="center">
		            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
		
		            <logic:equal name="<%= SiteAdministrationForm.FORM_NAME %>" property="reassignNeeded" value="true">
		                <bean:define id="associatedList" name="<%= SiteAdministrationForm.FORM_NAME %>" property="<%= form.FIELD_REASSIGN_LIST %>"/>
		
		                <td class="ColRowBold" align="center">
		                    <%= form.getReassignMessageText() %>
		                    <html:select property="<%= SiteAdministrationForm.FIELD_REASSIGN_TO_ID %>">
		                        <html:options collection="associatedList" property="longID" labelProperty="stringDesc"/>
		                    </html:select>.
		                </td>
		            </tr>
		            <tr>
		                <td>&nbsp;</td>
		            </logic:equal>
		            <td class="ColRowBold" align="center">
						<bean:write name="<%= SiteAdministrationForm.FORM_NAME %>" property="<%= SiteAdministrationForm.FIELD_DELETE_PROMPT %>"/>
		            </td>
		        </tr>
		        <tr>
		            <td>&nbsp;</td>
		            <td valign="baseline" align="center" class="ColRow">
		                <base:yesNo 
                        buttonNoName="<%=SiteAdministrationForm.BUTTON_CONFIRM_DELETE_NO %>"
		                    buttonYesName="<%=SiteAdministrationForm.BUTTON_CONFIRM_DELETE%>"
		                />
		            </td>
		        </tr>
	       		</base:messageBox>
	   		</logic:empty>
	
	    </logic:equal>
    </logic:equal>
    

<!-- Always propagate a collection type, even though most forms will not use it -->
<html:hidden property="collectionType"/>
<html:hidden property="fromSiteConfig"/>
<html:hidden property="<%=SiteAdministrationForm.FIELD_DEPARTMENT_LOCAL%>"/>
<html:hidden property="<%=SiteAdministrationForm.FIELD_LOCAL_SITE_ID%>"/>



<%-- 
	The following code adjust the alignment of the table when 
	displayed from a location that doesn't support the level2menu.
--%>
<%
	ArrayList list = null;
	Iterator iter = null;
	LongStringLookup value = null;
	String message = null;
%>

<logic:equal name="<%= SiteAdministrationForm.FORM_NAME %>" property="fromSiteConfig" value="true">
  <base:outlinedTable id="<%=SiteAdministrationForm.TABLE_MAIN%>" borderColor="#C0C0C0" width="95%">
	
	<tr>
	    <td>
	        <table id="<%= SiteAdministrationForm.TABLE_EDIT %>" width="100%" border="0" cellspacing="0" cellpadding="2">
	            <% message = (String) request.getAttribute(SiteAdministrationForm.FIELD_MESSAGE);
	            if (message != null) {
	            %>
	            <tr>
	                <td colspan="2" class="ColRowBold" valign="top">
	                    <%=message%>
	                </td>
	            </tr>            
	            <%
	            }
	            %>
	            
				<TR>
                    <base:sectionHeading printerFriendly="false" heading="Department" tdContent="valign='top'"/>
	                <td class="ColHeading tdAlignRight" background="/images/icons/general/thickline.gif" nowrap>
                        <base:isNotDistrictUser>
                            <base:cancelButton/>
                        </base:isNotDistrictUser>
		        		<base:genericButton src="/buttons/large/adddepartment.gif" alt='<%=MessageHelper.formatMessage("siteadministration_AddDept") %>' name="<%= SiteAdministrationForm.BUTTON_ADD_DEPARTMENT %>" />
	        		</td>
				</TR>
	        </table>
	    </td>
	</tr>
	    <%
	    //List is a list of value objects
	    list = form.getResultList();
	    iter = ObjectHelper.getIterator((ArrayList)list.get(0)); // local departments
	    value = null;
        %>
	
    <base:isNotDistrictUser>
	<tr><td>
	    <table id=<%= SiteAdministrationForm.TABLE_LIST_LOCAL %> width="100%" border="0" cellspacing="0" cellpadding="2">
	    <tr><td colspan="3" class="TableHeading2">Local Departments</td></tr>
        <%        
	    if(!iter.hasNext()) {
	%>
	       <tr><td class="ColRowBold" colspan="3">There are no local departments selected.</td></tr>
	<%    
	    }
	    while (iter.hasNext()) {
	        value = (LongStringLookup) iter.next();
	    %>
            <base:flipper key="department2"> 
	            <td class="ColRow"><%= ResponseUtils.filter(value.getStringDesc())%></td>
				<td class="ColRow">&nbsp;</td>
	            <td class="ColRow tdAlignRight">
	                <base:link id="<%=SiteAdministrationForm.ID_EDIT_PREFIX + value.getLongID() %>" page='<%= "/backoffice/servlet/presentdepartmenteditform.do?action=" +  SiteAdministrationForm.ACTION_EDIT + "&departmentID=" + value.getLongID() + "&fromSiteConfig=" + form.isFromSiteConfig()+ "&departmentLocal=true" %>'>
	                    <base:image src="/icons/general/edit.gif" alt='<%="Edit " + ResponseUtils.filter(value.getStringDesc()) %>' width="19" height="16"/>
	                </base:link>
	                &nbsp;
	                <base:link id="<%=SiteAdministrationForm.ID_DELETE_PREFIX + value.getLongID() %>" page='<%= "/backoffice/servlet/handlesiteadministrationform.do?action=" +  SiteAdministrationForm.ACTION_DELETE + "&departmentID=" + value.getLongID() + "&fromSiteConfig=" + form.isFromSiteConfig() + "&" + SiteAdministrationForm.FIELD_DEPARTMENT_LOCAL + "=true" %>'>
	                    <base:image src="/icons/general/delete.gif" alt='<%="Delete " + ResponseUtils.filter(value.getStringDesc()) %>' width="19" height="16"/>
	                </base:link>
	            </td>
	        </base:flipper>
	    <% } %>
	    </table>
	    </td></tr>
		<tr>
		    <td>
		        <img height="1" src="/images/icons/general/thickline.gif" width="100%">
		    </td>
		</tr>
        </base:isNotDistrictUser>
		<tr>
			<td>
	    		<table id=<%= SiteAdministrationForm.TABLE_LIST %> width="100%" border="0" cellspacing="0" cellpadding="2">
                <base:isNotDistrictUser>
	    			<tr>
	    				<td class="TableHeading2">Additional Departments</td>
	    			</tr>
                </base:isNotDistrictUser>                    
	    <%
	    //List is a list of value objects
	    iter = ObjectHelper.getIterator((ArrayList)list.get(1)); // non-local departments
	    value = null;
	    if(!iter.hasNext()) {
	%>
	       <tr><td class="ColRowBold" colspan="3">There are no departments.</td></tr>
	<%    
	    }
	    while (iter.hasNext()) {
	        value = (LongStringLookup) iter.next(); %>
            <base:flipper key="departments">
	            <td class="ColRow"><%= ResponseUtils.filter(value.getStringDesc())%></td>
				<td class="ColRow">
				</td>
	            <td class="ColRow tdAlignRight">
	                <base:link id="<%=SiteAdministrationForm.ID_EDIT_PREFIX + value.getLongID() %>" page='<%= "/backoffice/servlet/presentdepartmenteditform.do?action=" +  SiteAdministrationForm.ACTION_EDIT + "&departmentID=" + value.getLongID() + "&fromSiteConfig=" + form.isFromSiteConfig()+ "&departmentLocal=false" + "&departmentLocalAppears=true" %>'>
	                    <base:image src="/icons/general/edit.gif" alt='<%="Edit " + ResponseUtils.filter(value.getStringDesc()) %>' width="19" height="16"/>
	                </base:link>
	                &nbsp;
	                <base:link id="<%=SiteAdministrationForm.ID_DELETE_PREFIX + value.getLongID() %>" page='<%= "/backoffice/servlet/handlesiteadministrationform.do?action=" +  SiteAdministrationForm.ACTION_DELETE + "&departmentID=" + value.getLongID() + "&fromSiteConfig=" + form.isFromSiteConfig() + "&" + SiteAdministrationForm.FIELD_DEPARTMENT_LOCAL + "=false" %>'>
	                    <base:image src="/icons/general/delete.gif" alt='<%="Delete " + ResponseUtils.filter(value.getStringDesc()) %>' width="19" height="16"/>
	                </base:link>
	            </td>
	        </base:flipper>
	    <% } %>
	    </table>
	    </td>
	</tr>
		<tr>                
			<td class="ColHeading tdAlignRight" nowrap>
                <base:isNotDistrictUser>
				    <base:cancelButton/>
                </base:isNotDistrictUser>                    
                <base:genericButton src="/buttons/large/adddepartment.gif" alt='<%=MessageHelper.formatMessage("siteadministration_AddDept") %>' name="<%= SiteAdministrationForm.BUTTON_ADD_DEPARTMENT %>" />
			</td>
		</tr>
	</base:outlinedTable>
</logic:equal>

<!-- ------------------  NOT FROM SITE CONFIG  ------------------------------------->
<logic:equal name="<%= SiteAdministrationForm.FORM_NAME %>" property="fromSiteConfig" value="false">
	<base:outlinedTable id="<%=EditDistrictForm.TABLE_DISTRICT_EDIT%>" borderColor="#C0C0C0" width="95%">
	
	<tr>
	    <td>
	        <table id="<%= SiteAdministrationForm.TABLE_EDIT %>" width="100%" border="0" cellspacing="0" cellpadding="2">
	            <% message = (String) request.getAttribute(SiteAdministrationForm.FIELD_MESSAGE);
	            if (message != null) {
	            %>
	            <tr>
	                <td colspan="2" class="ColRowBold" valign="top">
	                    <%=message%>
	                </td>
	            </tr>            
	            <%
	            }
	            %>
	            
				<tr>
	                <% if (store.isDistrictTextbookCataloger() || store.isDistrictAssetCataloger()|| !store.isDistrictUser()) {%>
                        <base:sectionHeading printerFriendly="false" heading="Department" tdContent="width='100%'"/>                    
		                <td class="ColHeading tdAlignRight" nowrap>
		                	<base:cancelButton/><base:genericButton src="/buttons/large/adddepartment.gif" alt='<%=MessageHelper.formatMessage("siteadministration_AddDept") %>' name="<%= SiteAdministrationForm.BUTTON_ADD_DEPARTMENT %>" />
		        		</td>
                    <% } else { %>
                        <base:sectionHeading printerFriendly="false" heading="Department" tdContent="width='100%' colspan='2'"/>                    
                    <% } %>
				</tr>
	        </table>
	    </td>
	</tr>
	
	<tr><td>
	    <table id=<%= SiteAdministrationForm.TABLE_LIST %> width="100%" border="0" cellspacing="0" cellpadding="2">
	    <tr><td class="TableHeading2">Additional Departments</td></tr>
	    <%
	    //List is a list of value objects
	    list = form.getResultList();
	    iter = ObjectHelper.getIterator((ArrayList)list.get(1)); // non-local departments
	    value = null;
	    while (iter.hasNext()) {
	        value = (LongStringLookup) iter.next();
	    %>
            <base:flipper key="addDepartments">
	            <td class="ColRow"><%= ResponseUtils.filter(value.getStringDesc())%></td>
				<td class="ColRow">
				</td>
	            <td class="ColRow tdAlignRight">
	                <base:link id="<%=SiteAdministrationForm.BUTTON_SELECT_DEPARTMENT_PREFIX + value.getLongID().toString() %>" page='<%= "/backoffice/servlet/handlesiteadministrationform.do?action=" +  SiteAdministrationForm.ACTION_SELECT_DEPT + "&departmentID=" + value.getLongID() + "&fromSiteConfig=" + form.isFromSiteConfig()+ "&departmentLocal=false&localSiteID=" + form.getLocalSiteID() %>'>
	                    <base:image alt='<%=MessageHelper.formatMessage("select") %>' src="/buttons/small/selectsmall.gif"/>
	                </base:link>
	            </td>
	        </base:flipper>
	    <% } %>
	    </table>
	    </td>
	</tr>
    <% if (store.isDistrictTextbookCataloger() || !store.isDistrictUser()) {%>
		<tr>                
			<td class="ColHeading tdAlignRight" nowrap>
				<base:cancelButton/><base:genericButton src="/buttons/large/adddepartment.gif" alt='<%=MessageHelper.formatMessage("siteadministration_AddDept") %>' name="<%= SiteAdministrationForm.BUTTON_ADD_DEPARTMENT %>" />
			</td>
		</tr>
    <% } %>
	</base:outlinedTable>
</logic:equal>
</base:form>
