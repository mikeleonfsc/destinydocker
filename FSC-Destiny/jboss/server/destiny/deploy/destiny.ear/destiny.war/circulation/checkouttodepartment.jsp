<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.CheckoutToDepartmentForm" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.CheckoutNavigationForm" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.BaseCircForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag" %>
<%@ page import="com.follett.fsc.destiny.client.common.JSPHelper" %>
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
	boolean hasADepartment = !CheckoutToDepartmentForm.SITE_DEPT_JOIN_CHOOSE_DEPARTMENT_VALUE.equals(form.getSiteDeptJoinID());
    if ( blockMessages == null && hasADepartment && !form.isConfirmLostCopies() && !form.isConfirmStolenCopies()) {
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
                <base:messageBox showRedBorder="true">
                <tr>
                    <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                    <td valign="baseline" class="Error">
                            <html:hidden property="blockMessages"/>
                            <html:hidden property="previousBarcode"/>
                                Transaction blocked: <base:helpTag helpFileName="c_block_info_messages.htm"/>
                                <%= blockMessages%>
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



<base:outlinedTableAndTabsWithinThere id="<%=CheckoutToDepartmentForm.TABLE_MAIN%>"  borderColor="#C0C0C0" selectedTab="<%=CheckoutToDepartmentForm.TAB%>" tabs="<%=form.gimmeAssetTabs()%>" >
<%
    if ( !form.isHasDepartmentsToCheckOutTo() ) { %>
	<tr><td colspan="2" class="ColRowBold" align="center">
	There are no departments to select.
	</td></tr>
<% } %>    
<%
    if ( blockMessages == null && form.isHasDepartmentsToCheckOutTo() ) {
%>
	<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" 
		border="0" alt="" value="true" 
		name="<%=CheckoutToDepartmentForm.BUTTON_TRAP_ENTER%>"/>

	<tr><td colspan="2" class="ColRowBold">
		<%if ( store.isDistrictCircAllowed(CollectionType.ASSET) ) { %>
			Site
	            <base:selectSite 
	                name="<%= CheckoutToDepartmentForm.FIELD_PICK_SITE_ID %>" 
	                selectedSiteID='<%= ""+form.getPickSiteID() %>' 
	                onChangeAction="submitSiteChange();"
	                mode="<%=SelectSiteTag.MODE_DEPARTMENT%>"
	            />
		    &nbsp;&nbsp;&nbsp;
	    <% } else { %> 
			<html:hidden property="<%=CheckoutToDepartmentForm.FIELD_PICK_SITE_ID%>"/>
	    <% }  %>
  	    Department
	    <%=form.renderDepartmentDropDown() %>
    </td>
    
    </tr>
<% } %>    

	<% if ( hasADepartment && blockMessages == null) { %>
		<tr><td colspan="2" class="ColRowBold" nowrap>
			Find Item
            <html:text property="<%= CheckoutToDepartmentForm.FIELD_SEARCH_STRING %>" />
			<%=JSPHelper.renderButton(BaseCircForm.BUTTON_ITEM, "/buttons/large/finditem.gif", CheckoutToDepartmentForm.ALT_FIND_ITEM)%>
		</td></tr>
	<% }  %>
    <logic:present name="<%=CheckoutToDepartmentForm.FORM_NAME%>" property="list">
		<logic:equal name="<%=CheckoutToDepartmentForm.FORM_NAME%>" property="listFilledWithCopies" value="false">
	        <tr>
	            <td colspan="2"><IMG height="2" vspace="1" src="/images/icons/general/line.gif" width="95%"></td>
	        </tr>
		</logic:equal>
		<tr><td colspan='2'>	
            <table id="<%=BaseCircForm.TABLE_COPY_FIND %>" width="95%" cellspacing="0" cellpadding="4">
			    <logic:equal name="<%=CheckoutToDepartmentForm.FORM_NAME%>" property="listFilledWithCopies" value="false">
					<jsp:include page="/common/titlelist.jsp">
					 	<jsp:param name="formName" value="<%=CheckoutToDepartmentForm.FORM_NAME%>"/>
					  	<jsp:param name="showAvailability" value="true"/>
					</jsp:include>
				</logic:equal>
			    <logic:equal name="<%=CheckoutToDepartmentForm.FORM_NAME%>" property="listFilledWithCopies" value="true">
		                <tr>
		                    <td colspan="4" class="TableHeading2"><bean:write name="<%=CheckoutToDepartmentForm.FORM_NAME%>" property="title"/></td>
		                </tr>
						<jsp:include page="/circulation/circdeskcopylist.jsp">
						  <jsp:param name="formName" value="<%= CheckoutToDepartmentForm.FORM_NAME %>"/>
						</jsp:include>
				</logic:equal>
			</table>
		</td></tr>            
	</logic:present>
    
    <logic:present name="<%=CheckoutToDepartmentForm.FORM_NAME%>" property="departmentInfo">
		<tr><td colspan='2'>	
	        <img src="/images/icons/general/line.gif" height="2" width="100%">
		</td></tr>            
		<tr><td colspan='2'>	
			<base:departmentInfo infoBean="<%=form.getDepartmentInfo()%>"/>
	        <br>
		</td></tr>            
	</logic:present>
	
	<tr><td colspan='2'>	
    <base:circCheckedOut formName="<%=CheckoutToDepartmentForm.FORM_NAME%>"/>
    </td></tr>
    
    <logic:present name="<%=CheckoutToDepartmentForm.FORM_NAME%>" property="departmentInfo">
		<tr><td colspan='2'>	
	        <base:circItemsOut formName="<%=CheckoutToDepartmentForm.FORM_NAME%>"/>
	    </td></tr>
	</logic:present>

</base:outlinedTableAndTabsWithinThere>
<input type="image" name="<%=CheckoutToDepartmentForm.BUTTON_SITE_CHANGE_FOR_TEST_ONLY%>" id="<%=CheckoutToDepartmentForm.BUTTON_SITE_CHANGE_FOR_TEST_ONLY%>" src="/images/icons/general/spacer.gif" alt="" title="">&nbsp;
<input type="image" name="<%=CheckoutToDepartmentForm.BUTTON_SITE_DEPT_JOIN_CHANGE_FOR_TEST_ONLY%>" id="<%=CheckoutToDepartmentForm.BUTTON_SITE_DEPT_JOIN_CHANGE_FOR_TEST_ONLY%>" src="/images/icons/general/spacer.gif" alt="" title="">&nbsp;
</base:form>

<logic:present name="<%=CheckoutToDepartmentForm.FORM_NAME%>" property="soundFile" scope="request" >

<script language="JavaScript">
<!--
setSound("<bean:write name="circulation_servlet_CheckoutToDepartmentForm" property="soundFile"/>");
//-->
</script>

</logic:present>
