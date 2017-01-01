<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.PickLocationForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%@page import="com.follett.fsc.common.MessageHelper"%><base:messageBox strutsErrors="true"/>


<%
    PickLocationForm form = (PickLocationForm)request.getAttribute(PickLocationForm.FORM_NAME);
%>

<script language="JavaScript">
<!--
    function submitSiteChange() {
    	document.<%=PickLocationForm.FORM_NAME%>.submit();
    }
//-->
</script>


<logic:notPresent name="<%= PickLocationForm.FORM_NAME %>" property="<%=PickLocationForm.FIELD_PICK_SITE_ID%>">
    <base:messageBox showRedBorder="true">
    		<tr valign="top">
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td class="ColRowBold">
                    There are no locations to select.
                </td>
            </tr>
    </base:messageBox>
</logic:notPresent>


<base:form action="/circulation/servlet/handlepicklocationform.do">

<html:hidden name="<%= PickLocationForm.FORM_NAME %>" property="<%=PickLocationForm.PARAM_CIRC_ACROSS_DISTRICT %>" />

<table cellPadding=2 width="95%" border=0>
	<tr>
		<td class=TableHeading>Pick Location...</td>
        <td class="ColRowBold tdAlignRight">
			<logic:present name="<%= PickLocationForm.FORM_NAME %>" property="<%=PickLocationForm.FIELD_PICK_SITE_ID%>">
				<base:genericButton alt="Accept" src="/buttons/large/ok.gif" name="<%=PickLocationForm.BUTTON_OK %>"/>
			</logic:present>
			<base:genericButton alt="Cancel" src="/buttons/large/cancel.gif" name="<%=PickLocationForm.BUTTON_CANCEL %>"/>
		 </td>
	</tr>
	<logic:present name="<%= PickLocationForm.FORM_NAME %>" property="<%=PickLocationForm.FIELD_PICK_SITE_ID%>">
	    <tr>
			<td colSpan=2><IMG height=1 src="/images/icons/general/line.gif" width="100%" border=0></td>
		</tr>
		<logic:equal name="<%= PickLocationForm.FORM_NAME %>" property="<%=PickLocationForm.PARAM_CIRC_ACROSS_DISTRICT %>" value="true">
			<tr>
		    	<td class="ColRowBold tdAlignRight">Site</td>
				<td class="ColRow">
		            <base:selectSite 
		                name="<%= PickLocationForm.FIELD_PICK_SITE_ID %>" 
		                selectedSiteID='<%= ""+form.getPickSiteID() %>' 
		                onChangeAction="submitSiteChange();"
		                mode="<%=SelectSiteTag.MODE_LOCATION%>"
		            />
		        </td>
			</tr>
		</logic:equal>
		<logic:equal name="<%= PickLocationForm.FORM_NAME %>" property="<%=PickLocationForm.PARAM_CIRC_ACROSS_DISTRICT %>" value="false">
			<html:hidden name="<%= PickLocationForm.FORM_NAME %>" property="<%=PickLocationForm.FIELD_PICK_SITE_ID %>" />
		</logic:equal>
		<tr>
	    	<td class="ColRowBold tdAlignRight">Location</td>
	        <td>
	          <base:selectLocation name="<%= PickLocationForm.FIELD_PICK_LOCATION_ID %>"
	          	siteID="<%=form.getPickSiteID()%>" includeNone="false"/>
			</td>
		</tr>
	</logic:present>
</table>

</base:form>

