<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.CheckoutToLocationForm" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.CheckoutNavigationForm" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.client.common.JSPHelper" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.BaseCircForm" %>

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
    if ( blockMessages == null && !form.isConfirmLostCopies() && !form.isConfirmStolenCopies()) {
        focusControl = CheckoutToLocationForm.FIELD_SEARCH_STRING;
    } else {
        // block messages are showing. we do not want a control to have focus
        // to prevent Return from submitting the form.
        focusControl = "";
    }
%>
<jsp:include page="/circulation/setsound.jsp"/>
<base:form action="/circulation/servlet/handlecheckouttolocationform.do" focus="<%=focusControl%>">
<html:hidden property="<%=CheckoutToLocationForm.FIELD_LOCATION_ID%>"/>
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


<base:outlinedTableAndTabsWithinThere id="<%=CheckoutToLocationForm.TABLE_MAIN%>"  borderColor="#C0C0C0" selectedTab="<%=CheckoutToLocationForm.TAB%>" tabs="<%=form.gimmeAssetTabs()%>" >
<%
    if ( blockMessages == null ) {
%>
	<tr><td>
        <base:circFindBox
			searchString="<%=form.getSearchString()%>"
			findBoxLabel="Find"
			renderTeacherButton="false"
			renderGoButton="true"
			renderPatronButton="false"
			renderStudentButton="false"
			renderUpdateButton="false"
			renderCopyButton="false"
			renderAddTitleButton="false"
			textbookMode="false"
			collectionType="<%=form.getCollectionType()%>"
			searchLocalPatronsOnly="false"
			renderMyPatron="<%=false%>"
			renderFindItemButton="<%=(form.getLocationInfo() != null)%>"
			renderFindLocationButton="true"
            renderOnlySearchPatronDropDown="false"
            
        />
    </td>
	    <td>
	    	<base:link page="/circulation/servlet/presentpicklocationform.do">
                <base:image src="/buttons/large/picklocation.gif" alt="<%=CheckoutToLocationForm.ALT_TEXT_PICK_LOCATION%>"/>
	    	</base:link>    	
	    </td>
    </tr>
    <% if (store.isDistrictCircAllowed(CollectionType.ASSET)) {  %>
    <tr>
	    <td colspan="2" class="ColRow" nowrap>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=JSPHelper.renderCheckbox(CheckoutToLocationForm.FIELD_SEARCH_ONLY_MY_LOCATIONS, store.isSearchLocalLocationsOnly())%>&nbsp;Only my locations
	    </td>
    </tr>
	<% } else { %>    
    <html:hidden property="<%=CheckoutToLocationForm.FIELD_SEARCH_ONLY_MY_LOCATIONS%>" value="true"/>
	<% } %>    
<% } %>    
    <logic:present name="<%=CheckoutToLocationForm.FORM_NAME%>" property="locationHitList">
		<tr><td colspan='2' width="100%">	
	        <img src="/images/icons/general/line.gif" height="2" width="100%">
		</td></tr>            
		<tr><td colspan='2'>	
			<base:locationList locationList="<%=form.getLocationHitList()%>" districtWide="<%=!store.isSearchLocalLocationsOnly()%>"/>
	        <br>
		</td></tr>            
	</logic:present>
	
    <logic:present name="<%=CheckoutToLocationForm.FORM_NAME%>" property="list">
		<logic:equal name="<%=CheckoutToLocationForm.FORM_NAME%>" property="listFilledWithCopies" value="false">
	        <tr>
	            <td colspan="2"><IMG height="2" vspace="1" src="/images/icons/general/line.gif" width="95%"></td>
	        </tr>
		</logic:equal>
		<tr><td colspan='2'>	
            <table id="<%=BaseCircForm.TABLE_COPY_FIND %>" width="95%" cellspacing="0" cellpadding="4">
			    <logic:equal name="<%=CheckoutToLocationForm.FORM_NAME%>" property="listFilledWithCopies" value="false">
					<jsp:include page="/common/titlelist.jsp">
					 	<jsp:param name="formName" value="<%=CheckoutToLocationForm.FORM_NAME%>"/>
					  	<jsp:param name="showAvailability" value="true"/>
					</jsp:include>
				</logic:equal>
			    <logic:equal name="<%=CheckoutToLocationForm.FORM_NAME%>" property="listFilledWithCopies" value="true">
		                <tr>
		                    <td colspan="4" class="TableHeading2"><bean:write name="<%=CheckoutToLocationForm.FORM_NAME%>" property="title"/></td>
		                </tr>
						<jsp:include page="/circulation/circdeskcopylist.jsp">
						  <jsp:param name="formName" value="<%= CheckoutToLocationForm.FORM_NAME %>"/>
						</jsp:include>
				</logic:equal>
			</table>
		</td></tr>            
	</logic:present>
    
    <logic:present name="circulation_servlet_CheckoutToLocationForm" property="locationInfo">
		<tr><td colspan='2'>	
	        <img src="/images/icons/general/line.gif" height="2" width="100%">
		</td></tr>            
		<tr><td colspan='2'>	
			<base:locationInfo infoBean="<%=form.getLocationInfo()%>"/>
	        <br>
		</td></tr>            
	</logic:present>
	
	<tr><td colspan='2'>	
    <base:circCheckedOut formName="<%=CheckoutToLocationForm.FORM_NAME%>"/>
    </td></tr>
    
    <logic:present name="circulation_servlet_CheckoutToLocationForm" property="locationInfo">
		<tr><td colspan='2'>	
	        <base:circItemsOut formName="<%=CheckoutToLocationForm.FORM_NAME%>"/>
	    </td></tr>
	</logic:present>

</base:outlinedTableAndTabsWithinThere>
</base:form>

<logic:present name="<%=CheckoutToLocationForm.FORM_NAME%>" property="soundFile" scope="request" >

<script language="JavaScript">
<!--
setSound("<bean:write name="circulation_servlet_CheckoutToLocationForm" property="soundFile"/>");
//-->
 </script>
</logic:present>
