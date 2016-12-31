<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.session.cataloging.ejb.TitleAEDSpecs" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@page import="com.follett.fsc.destiny.client.common.servlet.ITransferOnScan"%>

<%@page import="com.follett.fsc.destiny.client.common.data.Tab"%><bean:define id="form" name="<%=TextbookDetailForm.FORM_NAME %>" type="com.follett.fsc.destiny.client.cataloging.servlet.TextbookDetailForm" />

<base:messageBox strutsErrors="true"/>

<script language="javaScript">
<!--
    window.focus();
// -->
</script>

<logic:equal name="<%=TextbookDetailForm.FORM_NAME%>" property="titlePresent" value="true">

<base:form action="/cataloging/servlet/handletextbookdetailform.do">
    <html:hidden property="<%=TextbookDetailForm.FIELD_SITE_TYPE_ID%>"/>
    <html:hidden property="<%=TextbookDetailForm.FIELD_BIBID%>"/>
    <html:hidden property="<%=TextbookDetailForm.FIELD_DELETE_FROM_DISTRICT%>"/>
    <html:hidden property="<%=TextbookDetailForm.PARAM_TSQUARED_RECORD%>"/>
    <html:hidden property="<%=TextbookDetailForm.FIELD_SUPPLEMENT_STATUS%>"/>
    <html:hidden property="<%=TextbookDetailForm.PARAM_PARENT_BIB_ID%>"/>
    <html:hidden property="<%=TextbookDetailForm.PARAM_BIB_WALKER_ID%>"/>
    <html:hidden property="<%=TextbookDetailForm.PARAM_UNLIMITED_BIBID%>"/>
    <html:hidden property="<%=TextbookDetailForm.PARAM_UNLIMITED_SITEID%>"/>

       <%-- Are we confirming a delete? --%>

<logic:equal name="<%=TextbookDetailForm.FORM_NAME%>" property="<%=TextbookDetailForm.PARAM_ACTION%>" value="<%= TextbookDetailForm.ACTION_DELETED_UNLIMITED%>">
    <base:imageSpacer width="1" height="3"/>
    <base:messageBox showWarningIcon="true" message="Unlimited copies will be removed.  Are you sure you want to do this?">
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:yesNo 
                    buttonYesName="<%=TextbookDetailForm.BUTTON_NAME_DELETE_UNLIMITED_YES%>"
                    buttonNoName="<%=TextbookDetailForm.BUTTON_NAME_DELETE_UNLIMITED_NO%>"
                />
            </td>
        </tr>
    </base:messageBox>
</logic:equal>
<logic:equal name="<%=TextbookDetailForm.FORM_NAME%>" property="<%=TextbookDetailForm.FIELD_SHOW_DUPLICATE_MESSAGE%>" value="true">
    <html:hidden property="<%=TextbookDetailForm.FIELD_EXTERNAL_SOURCES_FORWARD%>"/>
    <base:imageSpacer width="1" height="3"/>
    <base:messageBox showWarningIcon="true" message="Saving will duplicate a text book already in your database.  Are you sure you want to do this?">
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:yesNo 
                    buttonYesName="<%=TextbookDetailForm.BUTTON_NAME_OVERRIDE_DUPLICATE%>"
                    buttonNoName="<%=TextbookDetailForm.BUTTON_NAME_CANCEL_DUPLICATE%>"
                />
            </td>
        </tr>
    </base:messageBox>
</logic:equal>
<logic:equal name="<%=TextbookDetailForm.FORM_NAME%>" property="<%=TextbookDetailForm.FIELD_SHOW_BUNDLE_MESSAGE%>" value="true">
    <base:imageSpacer width="1" height="3"/>
    <base:messageBox showWarningIcon="true" message="Updating a title to a Bundle is irreversible.  Do you want to continue?">
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:yesNo 
                    buttonYesName="<%=TextbookDetailForm.BUTTON_NAME_BUNDLE_YES%>"
                    buttonNoName="<%=TextbookDetailForm.BUTTON_NAME_BUNDLE_NO%>"
                />
            </td>
        </tr>
    </base:messageBox>
</logic:equal>

<logic:present name="<%= TextbookDetailForm.FORM_NAME %>" property="<%=ITransferOnScan.PARAM_TRANSFER_COPY_LIST%>">
    <base:imageSpacer width="1" height="3"/>
    <center>
    <base:messageBox>
    <base:transferOnScan formName="<%=TextbookDetailForm.FORM_NAME%>"></base:transferOnScan>
    </base:messageBox>
    </center>
</logic:present>

    <logic:equal name="<%=TextbookDetailForm.FORM_NAME%>" property="<%=TextbookDetailForm.BUTTON_NAME_ACTION%>" value="<%=TextbookDetailForm.BUTTON_VALUE_CONFIRM_DELETE%>">
        <base:imageSpacer width="1" height="3"/>
        <base:messageBox showRedBorder="true">
        <html:hidden property="<%=TextbookDetailForm.FIELD_DELETE_BY_JOB%>"/>
            <tr valign="top">
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>

                <td class="ColRowBold"><bean:write name="<%=TextbookDetailForm.FORM_NAME%>" property="<%=TextbookDetailForm.FIELD_DELETE_CONFIRM_TEXTBOOK%>"/></td>
            </tr>
            <tr>
                <td valign="baseline" colspan="2" class="Error">
	                <%
	                    if (form.getConfirmationMessageList().size() > 0 ){
	                %>
	                    Please note the following:
	                <ul>
	                <logic:notEqual name="numMsgs" value="0">
	                    <logic:iterate id="messages" name="<%=TextbookDetailForm.FORM_NAME%>" property="<%=TextbookDetailForm.FIELD_CONFIRMATION_MESSAGES%>">
	                        <li><bean:write name="messages" /></li>
	                    </logic:iterate>
	                </logic:notEqual>
                    <logic:equal value="true" name="<%=TextbookDetailForm.FORM_NAME%>" property="titleIsInAnyMyList">

                        <logic:equal name="<%=TextbookDetailForm.FORM_NAME%>" property="<%=TextbookDetailForm.FIELD_DISTRICT_USER%>" value="false">
                            <li>This title is included in one or more user lists.</li>
                            <logic:equal value='<%="" + TitleAEDSpecs.SITE_BIB_STATUS_LOCAL_AND_OTHER_SITES%>' name="<%=TextbookDetailForm.FORM_NAME%>" property="siteBibStatus">
                                <li>The title will not be removed from user lists.</li>
                            </logic:equal>
                            <%
                                if (form.getSiteBibStatus() == TitleAEDSpecs.SITE_BIB_STATUS_ORPHANED || form.getSiteBibStatus() == TitleAEDSpecs.SITE_BIB_STATUS_LOCAL_SITE_ONLY) {
                            %>
                                <li>The title will be removed from all user lists.</li>
                            <% } %>
                        </logic:equal>

                        <logic:equal name="<%=TextbookDetailForm.FORM_NAME%>" property="<%=TextbookDetailForm.FIELD_DISTRICT_USER%>" value="true">
                            <li>The title will be removed from all user lists.</li>
                        </logic:equal>

                    </logic:equal>
	             
	                </ul>
	                <%
	                    }
	                %>

                </td>
            </tr>
             <% if (!form.isConsumable()) { %>
    	        <tr>
    	        	<td align="center" class="ColRowBold" colspan="2">
    	        		<html:checkbox property="<%=BaseTitleDetailForm.FIELD_TRACK_AS_WEEDED%>"/> 
    						Track any deleted copies as weeded
    	        	</td>
    	        </tr>
            <% } %>
            <tr>
                <td align="center" class="ColRow" colspan="2">Are you sure you want to proceed?</td>
            </tr>
            <tr>
                <td align="center" class="Instruction" colspan="2">You may want to print this page for your records before proceeding.</td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2">
                    <base:yesNo 
                        buttonYesName="<%=TextbookDetailForm.BUTTON_NAME_CONFIRM_DELETE_YES%>"
                        buttonNoName="<%=TextbookDetailForm.BUTTON_NAME_CONFIRM_DELETE_NO%>"
                    />
                </td>
            </tr>
        </base:messageBox>
        <base:imageSpacer width="1" height="3"/>
    </logic:equal>
    <logic:present name="<%=TextbookDetailForm.FORM_NAME%>" property="holdMessageHeader">
        <base:imageSpacer width="1" height="3"/>
        <base:messageBox>
            <tr valign="top" align="center">
                <td class="ColRowBold" align="center"><bean:write name="<%=TextbookDetailForm.FORM_NAME%>" property="holdMessageHeader"/></td>
            </tr>
    <logic:present name="<%=TextbookDetailForm.FORM_NAME%>" property="holdMessage">
            <tr align="center">
                <td class="ColRow" align="center"><bean:write name="<%=TextbookDetailForm.FORM_NAME%>" property="holdMessage"/></td>
            </tr>
    </logic:present>
        </base:messageBox>
        <base:imageSpacer width="1" height="3"/>
    </logic:present>
    
    <%
    Tab[] tabs = form.getTabs();
    String selectedTab = form.getSelectedTab();
    %>
<base:outlinedTableAndTabsWithinThere 
    outputTSquaredIcon="<%=form.isTsquaredRecord() %>"
    alwaysOutputTabsEvenIfJustOne="true" borderColor='#c0c0c0' 
    width="100%" cellpadding="0" 
    selectedTab="<%=selectedTab%>" tabs="<%=tabs%>">

    <!-- Only show this stuff if we are in MARC view or Title Detail view -->
    <logic:equal name="<%=TextbookDetailForm.FORM_NAME%>" property="viewType" value="0">
      <jsp:include page="/cataloging/textbookdetailtitletab.jsp" flush="true" />
    </logic:equal>

    <logic:equal name="<%=TextbookDetailForm.FORM_NAME%>" property="viewType" value="2">
      <jsp:include page="/cataloging/textbookdetailcopiestab.jsp" flush="true" />
    </logic:equal>

    <logic:equal name="<%=TextbookDetailForm.FORM_NAME%>" property="viewType" value="3">
      <jsp:include page="/cataloging/textbookdetailsupplementstab.jsp" flush="true" />
    </logic:equal>
</base:outlinedTableAndTabsWithinThere>

</base:form>
</logic:equal>

