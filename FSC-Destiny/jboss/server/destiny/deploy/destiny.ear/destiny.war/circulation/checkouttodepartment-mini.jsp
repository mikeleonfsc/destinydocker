<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.CheckoutToDepartmentForm" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.BaseCircForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag" %>
<%@ page import="com.follett.fsc.destiny.client.common.JSPHelper" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.CopyInfoMiniTag" %>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.*" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.jsptag.CircFindBoxMiniTag"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<base:messageBox strutsErrors="true"/>

<%
    CheckoutToDepartmentForm form = (CheckoutToDepartmentForm)request.getAttribute(CheckoutToDepartmentForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    String blockMessages = form.getBlockMessages();
	String focusControl;
	boolean hasSelectedDepartment = !CheckoutToDepartmentForm.SITE_DEPT_JOIN_CHOOSE_DEPARTMENT_VALUE.equals(form.getSiteDeptJoinID());
    if ( blockMessages == null && hasSelectedDepartment) {
        focusControl = CheckoutToDepartmentForm.FIELD_SEARCH_STRING;
    } else {
        // block messages are showing. we do not want a control to have focus
        // to prevent Return from submitting the form.
        focusControl = "";
    }
%>
<jsp:include page="/circulation/setsound.jsp"/>
<base:form action="/circulation/servlet/handlecheckouttodepartmentform.do" focus="<%=focusControl%>">

<html:hidden property="<%=CheckoutToDepartmentForm.PARAM_CURRENT_COPY_ID%>"/>
<html:hidden property="<%=CheckoutToDepartmentForm.PARAM_LOST_COPY_ID%>"/>
<html:hidden property="<%=CheckoutToDepartmentForm.PARAM_STOLEN_COPY_ID%>"/>
<html:hidden property="<%=CheckoutToDepartmentForm.PARAM_JS_ACTION%>"/>
<jsp:include page="/circulation/lostcopyprompt.jsp" flush="true" >
    <jsp:param name="FormName" value='<%=CheckoutToDepartmentForm.FORM_NAME%>'/>
    <jsp:param name="collectionType" value='<%="" + CollectionType.ASSET%>'/>
</jsp:include>
<jsp:include page="/circulation/stolencopyprompt.jsp" flush="true" >
    <jsp:param name="FormName" value='<%=CheckoutToDepartmentForm.FORM_NAME%>'/>
    <jsp:param name="collectionType" value='<%="" + CollectionType.ASSET%>'/>
</jsp:include>

<logic:present name="<%= CheckoutToDepartmentForm.FORM_NAME %>" property="<%=CheckoutToDepartmentForm.PARAM_TRANSFER_COPY_LIST%>">
    <base:imageSpacer width="1" height="3"/>
    <center>
    <base:messageBox>
    <base:transferOnScan formName="<%=CheckoutToDepartmentForm.FORM_NAME%>"></base:transferOnScan>
    </base:messageBox>
    </center>
</logic:present>

<%
    if ( blockMessages != null ) {
%>

<jsp:include page="/circulation/trapbarcodescan.jsp"/>
        <span onKeyPress="return trapBarcodeScan(event);">
                <br>
                <base:messageBox>
                <tr>
                    <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                    <td valign="baseline" class="Error">
                            <html:hidden property="blockMessages"/>
                            <html:hidden property="previousBarcode"/>
                                Transaction blocked:
                                <p align="center">Do you want to complete this transaction?</p>
                    </td>
                </tr>
                <tr><td colspan="2" align="center" class="Error">
						<base:yesNo
                                 buttonYesName="<%=CheckoutToDepartmentForm.BUTTON_CONFIRM_YES%>"
			                     buttonNoName="<%=CheckoutToDepartmentForm.BUTTON_CONFIRM_NO%>"
                                />
                </td></tr>
                </base:messageBox>
            <br>
        </span>

<%
    }
%>


<script language="JavaScript">
<!--
    function submitSiteChange() {
    	document.<%=CheckoutToDepartmentForm.FORM_NAME%>.<%=CheckoutToDepartmentForm.PARAM_JS_ACTION%>.value = <%=CheckoutToDepartmentForm.JS_ACTION_SITE_CHANGE%>;
    	document.<%=CheckoutToDepartmentForm.FORM_NAME%>.submit();
    }
    function submitSiteDeptJoinChange() {
    	document.<%=CheckoutToDepartmentForm.FORM_NAME%>.<%=CheckoutToDepartmentForm.PARAM_JS_ACTION%>.value = <%=CheckoutToDepartmentForm.JS_ACTION_SITE_DEPT_JOIN_CHANGE%>;
    	document.<%=CheckoutToDepartmentForm.FORM_NAME%>.submit();
    }
//-->

</script>

<%-- START OF TABLE_MINI_DROPDOWNS --%>
<table border="0" cellspacing="0" cellpadding="0" id="<%=CheckoutToDepartmentForm.TABLE_MINI_DROPDOWNS%>">
<%
    if ( !form.isHasDepartmentsToCheckOutTo() ) { %>
		<tr><td colspan="2" class="ColRowBold" align="center">
		There are no departments to select.
		</td></tr>
<%  } %>    
<%
    if ( blockMessages == null && form.isHasDepartmentsToCheckOutTo() ) {
%>
	<tr>
		<td><input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" 
			border="0" alt="" value="true" 
			name="<%=CheckoutToDepartmentForm.BUTTON_TRAP_ENTER%>"/></td>
	</tr>

	<tr>
		<td colspan="2" class="ColRowBold">
		<%if ( store.isDistrictCircAllowed(CollectionType.ASSET) ) { %>
                <base:selectSite 
                    name='<%= CheckoutToDepartmentForm.FIELD_PICK_SITE_ID %>'
                    selectedSiteID='<%=""+form.getPickSiteID() %>' 
                    useSelectASite='true'
                    includeLibrarySites="false"
    			    includeTextbookSites="false"
    			    includeMediaSites="false"
    			    includeAssetSites="true"
	                onChangeAction="submitSiteChange();"
	                mode="<%=SelectSiteTag.MODE_DEPARTMENT%>"
                    />
	    <% } else { %> 
			<html:hidden property="<%=CheckoutToDepartmentForm.FIELD_PICK_SITE_ID%>"/>
	    <% }  %>
	    <%=form.renderDepartmentDropDown() %>
    	</td>
    </tr>
<% } %>    
</table>
<%-- END OF TABLE_MINI_DROPDOWNS --%>

	<% if ( hasSelectedDepartment && blockMessages == null) { %>
	
<%-- START OF TABLE_MINI_FIND --%>
<table border="0" cellspacing="0" cellpadding="0" id="<%=CheckoutToDepartmentForm.TABLE_MINI_FIND%>">
	<tr><td colspan="2" class="ColRowBold" nowrap>
		Find&nbsp;
		<html:text property="<%= CheckoutToDepartmentForm.FIELD_SEARCH_STRING %>" />
		<%=JSPHelper.renderButton(BaseCircForm.BUTTON_ITEM, "/icons/general/items.gif", CircFindBoxMiniTag.ALT_FIND_ITEM)%>
	</td></tr>
</table>
<%-- END OF TABLE_MINI_FIND --%>
	<% }  %>

<%
 		CopyInfoBean cib = (CopyInfoBean)request.getAttribute("copyInfoBean");
        if (cib!=null) {
%>
			<table border="0" cellspacing="0" cellpadding="0" width="100%">
		        <tr>
		           <td><img src="/images/icons/general/line.gif" height="1" width="100%"></td>
		        </tr>
		    </table>
<%-- START OF TABLE_MINI_ITEM_INFO --%>
	<table border="0" cellspacing="0" cellpadding="0" id="<%=CheckoutToDepartmentForm.TABLE_MINI_ITEM_INFO%>">
				<tr>
				<td colspan="2">
                <base:copyInfoMini cib="<%=cib%>" displayMode="<%=CopyInfoMiniTag.COPY_INFO_DISPLAY_MODE_CHECK_OUT%>"/>
                </td>
                </tr>
     </table>
<%-- END OF TABLE_MINI_ITEM_INFO --%>
<%      } %>         

<%-- START OF TABLE_MAIN --%>
<table border="0" cellspacing="0" cellpadding="0" id="<%=CheckoutToDepartmentForm.TABLE_MAIN%>">

	<tr><td><input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" 
		border="0" alt="" value="true" 
		name="<%=CheckoutToDepartmentForm.BUTTON_TRAP_ENTER%>"/></td></tr>


	<tr><td><input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" 
		border="0" alt="" value="true" 
		name="<%=CheckoutToDepartmentForm.BUTTON_SITE_CHANGE_FOR_TEST_ONLY%>"/><input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" 
		border="0" alt="" value="true" 
		name="<%=CheckoutToDepartmentForm.BUTTON_SITE_DEPT_JOIN_CHANGE_FOR_TEST_ONLY%>"/></td></tr>
</table>    
</base:form>

<logic:present name="<%=CheckoutToDepartmentForm.FORM_NAME%>" property="soundFile" scope="request" >

<script language="JavaScript">
<!--
setSound("<bean:write name="circulation_servlet_CheckoutToDepartmentForm" property="soundFile"/>");
//-->
 </script>
</logic:present>
