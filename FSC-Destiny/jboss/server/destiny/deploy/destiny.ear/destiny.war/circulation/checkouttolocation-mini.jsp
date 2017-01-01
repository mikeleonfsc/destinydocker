<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.CheckoutToLocationForm" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.CopyInfoBean" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.CopyInfoMiniTag" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.jsptag.CircCheckedOutTag" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>

<%
    CheckoutToLocationForm form = (CheckoutToLocationForm)request.getAttribute(CheckoutToLocationForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    String blockMessages = form.getBlockMessages();
	String focusControl;
    if ( blockMessages == null) {
        focusControl = CheckoutToLocationForm.FIELD_SEARCH_STRING;
    } else {
        // block messages are showing. we do not want a control to have focus
        // to prevent Return from submitting the form.
        focusControl = "";
    }
%>
<jsp:include page="/circulation/setsound.jsp"/>

<script language="JavaScript">
<!--
    function submitSiteChange() {
    	document.<%=CheckoutToLocationForm.FORM_NAME%>.<%=CheckoutToLocationForm.PARAM_DROPDOWN_CHANGED_ACTION%>.value = <%=String.valueOf(CheckoutToLocationForm.DROPDOWN_CHANGED_SITE)%>;
    	document.<%=CheckoutToLocationForm.FORM_NAME%>.submit();
    }
//-->
</script>

<base:form action="/circulation/servlet/handlecheckouttolocationform.do" focus="<%=focusControl%>">


<html:hidden property="<%=CheckoutToLocationForm.PARAM_DROPDOWN_CHANGED_ACTION%>" value="0"/>
<html:hidden property="<%=CheckoutToLocationForm.PARAM_CURRENT_COPY_ID%>"/>
<html:hidden property="<%=CheckoutToLocationForm.PARAM_LOST_COPY_ID%>"/>
<html:hidden property="<%=CheckoutToLocationForm.PARAM_STOLEN_COPY_ID%>"/>
<jsp:include page="/circulation/lostcopyprompt.jsp" flush="true" >
    <jsp:param name="FormName" value='<%=CheckoutToLocationForm.FORM_NAME%>'/>
    <jsp:param name="collectionType" value='<%="" + CollectionType.ASSET%>'/>
</jsp:include>
<jsp:include page="/circulation/stolencopyprompt.jsp" flush="true" >
    <jsp:param name="FormName" value='<%=CheckoutToLocationForm.FORM_NAME%>'/>
</jsp:include>

<logic:present name="<%= CheckoutToLocationForm.FORM_NAME %>" property="<%=CheckoutToLocationForm.PARAM_TRANSFER_COPY_LIST%>">
    <base:imageSpacer width="1" height="3"/>
    <center>
    <base:messageBox>
    <base:transferOnScan formName="<%=CheckoutToLocationForm.FORM_NAME%>"></base:transferOnScan>
    </base:messageBox>
    </center>
</logic:present>

<%
    if ( blockMessages != null ) {
%>

<jsp:include page="/circulation/trapbarcodescan.jsp"/>
	    <html:hidden property="<%=CheckoutToLocationForm.FIELD_SEARCH_ONLY_MY_LOCATIONS%>" value='<%=""+store.isSearchLocalLocationsOnly()%>'/>

        <span onKeyPress="return trapBarcodeScan(event);">
                <br>
                <base:messageBox>
                <tr>
                    <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                    <td valign="baseline" class="Error">
                            <html:hidden property="<%=CheckoutToLocationForm.FIELD_SITE_ID%>"/>
                            <html:hidden property="<%=CheckoutToLocationForm.FIELD_LOCATION_ID%>"/>
                            <html:hidden property="blockMessages"/>
                            <html:hidden property="previousBarcode"/>
                                Transaction blocked:
                                <p align="center">Do you want to complete this transaction?</p>
                    </td>
                </tr>
                <tr><td colspan="2" align="center" class="Error">
						<base:yesNo
                                 buttonYesName="<%=CheckoutToLocationForm.BUTTON_CONFIRM_YES%>"
			                     buttonNoName="<%=CheckoutToLocationForm.BUTTON_CONFIRM_NO%>"
                                />
                </td></tr>
                </base:messageBox>
            <br>
        </span>

<%
    }
%>


<%-- START OF TABLE_MAIN --%>
<table id="<%=CheckoutToLocationForm.TABLE_MAIN%>" cellSpacing="1" cellPadding="0" width="95%" border="0">
<%
    if ( blockMessages == null ) {
%>
		<% if (form.isDistrictCircAllowed()) { %>
			<tr>
		    	<td class="ColRow">
		            <base:selectSite 
		                name="<%= CheckoutToLocationForm.FIELD_SITE_ID %>" 
		                selectedSiteID='<%= ""+form.getSiteID() %>' 
		                onChangeAction="submitSiteChange();"
		                mode="<%=SelectSiteTag.MODE_LOCATION%>"
		            />
		        </td>
			</tr>
		<% } else { %>
			<html:hidden name="<%= CheckoutToLocationForm.FORM_NAME %>" property="<%=CheckoutToLocationForm.FIELD_SITE_ID %>" />
		<% } %>
		<tr>
	    	<td class="ColRow">
	          <base:selectLocation name="<%= CheckoutToLocationForm.FIELD_LOCATION_ID %>"
	          	siteID="<%=form.getSiteID()%>" 
	          	selectedLocationID="<%=form.getLocationID()%>"
	          	truncateForMiniD="true"
	          	includeChooseLocation="true"/>
			</td>
		</tr>

	<tr><td>
        <base:circFindBoxMini
        	searchString="<%=form.getSearchString()%>" 
			findBoxLabel="Find"
			renderTeacherButton="false"
			renderGoButton="false"
			renderPatronButton="false"
			renderStudentButton="false"
			renderCopyButton="true" 
			collectionType="<%=form.getCollectionType()%>"
        />

    </td>
    </tr>
</table>
<%-- END OF TABLE_MAIN --%>

    <% if (store.isDistrictCircAllowed(CollectionType.ASSET)) {  %>
    	<html:hidden property="<%=CheckoutToLocationForm.FIELD_SEARCH_ONLY_MY_LOCATIONS%>" value="false"/>
	<% } else { %>    
    	<html:hidden property="<%=CheckoutToLocationForm.FIELD_SEARCH_ONLY_MY_LOCATIONS%>" value="true"/>
	<% } %>    
<% } %>    

    <%
        //************** This is code that applies to all screens ***************
        CopyInfoBean cib = (CopyInfoBean)request.getAttribute(CircCheckedOutTag.COPY_INFO_BEAN_ATTRIBUTE);
        if (cib!=null) {
%>
		<table border="0" cellpadding="0" cellspacing="0" width="100%">
	        <tr>
	           <td><img src="/images/icons/general/line.gif" height="1" width="100%"></td>
	        </tr>
	    </table>
<%-- START OF TABLE_MINI_ITEM_INFO --%>
<table id="<%=CheckoutToLocationForm.TABLE_MINI_ITEM_INFO%>" cellSpacing="1" cellPadding="0" width="95%" border="0">
			<tr>
				<td>
                <base:copyInfoMini cib="<%=cib%>" displayMode="<%=CopyInfoMiniTag.COPY_INFO_DISPLAY_MODE_CHECK_OUT%>"/>
                </td>
            </tr>
</table>
<%-- END OF TABLE_MINI_ITEM_INFO --%>
<%      } %>         

</base:form>

<logic:present name="<%=CheckoutToLocationForm.FORM_NAME%>" property="soundFile" scope="request" >

<script language="JavaScript">
<!--
setSound("<bean:write name="circulation_servlet_CheckoutToLocationForm" property="soundFile"/>");
//-->
 </script>
</logic:present>
