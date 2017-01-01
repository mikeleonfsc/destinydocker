<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    String type = request.getParameter("type");
    HoldViewAllForm form = (HoldViewAllForm)request.getAttribute(HoldViewAllForm.FORM_NAME);
	
	String sectionImageAlt = "";

	String helpFileName = "c_manage_requests.htm";
	
	boolean printMe = false;
	
	if (HoldViewAllForm.HEADER_TYPE_UNAPPROVED.equals(type)) {
    	helpFileName = "d_unapproved offsite requests.htm";
		sectionImageAlt = MessageHelper.formatMessage("holdviewall-sectionheader_UnapprovedRequests");
		
		printMe = form.getUnapprovedList().size() > 0 && 
			(form.isIncludeUnapproved() || form.isIncludeReserved());
    } else if (HoldViewAllForm.HEADER_TYPE_LOCAL.equals(type)) {
		sectionImageAlt = MessageHelper.formatMessage("holdviewall-sectionheader_LocalRequests");
    	helpFileName = "c_manage_requests.htm";
		
		printMe = (form.getLocalExpired().size() > 0) ||
				  (form.getLocalPending().size() > 0) ||
				  (form.getLocalReadyForPatron().size() > 0) ||
				  (form.getLocalToBePulledList().size() > 0);
    } else if (HoldViewAllForm.HEADER_TYPE_ILL.equals(type)) {
    	sectionImageAlt = MessageHelper.formatMessage("holdviewall-sectionheader_ILLRequests");
    	helpFileName = "c_ILL_requests_LM.htm";
    	
    	printMe = (form.getFillByOtherSiteList().size() > 0 ||
    			  form.getFillByLocalSiteList().size() > 0) && form.isIncludeILL();
    } else if (HoldViewAllForm.HEADER_TYPE_MEDIA.equals(type)) {
    	sectionImageAlt = MessageHelper.formatMessage("holdviewall-sectionheader_MediaRequests");
    	helpFileName = "d_media_requests.htm";
    	
    	printMe = form.getMediaList().size() > 0 && form.isIncludeMedia();
    } else if (HoldViewAllForm.HEADER_TYPE_FOLLETT_EBOOK_MEDIA.equals(type)) {
        sectionImageAlt = MessageHelper.formatMessage("holdviewall-sectionheader_FollettEBookMediaRequests");
        helpFileName = "d_follett_ebook_media_requests.htm";
        printMe = form.getFollettEBookMediaList().size() > 0 && form.isIncludeMedia();
    }
%>

<% if (printMe) { %>

<logic:equal name="<%=HoldViewAllForm.FORM_NAME%>" property="printerFriendly" value="false">
	<% if (!StringHelper.isEmpty(sectionImageAlt)) { %>
		<tr>
		    <td background="/images/icons/general/thickline.gif" height="18" nowrap>
                <span class='SectionHeader'><%=sectionImageAlt %></span>
		        <base:helpTag helpFileName="<%=helpFileName%>"/>
		    </td>
		</tr>
	<% } %>
</logic:equal>
<logic:notEqual name="<%=HoldViewAllForm.FORM_NAME%>" property="printerFriendly" value="false">
	<% if (!StringHelper.isEmpty(sectionImageAlt)) { %>
		<tr>
		    <td nowrap class="TableHeading">
		        <%=sectionImageAlt%>
		    </td>
		</tr>
	<% } %>
</logic:notEqual>    

<% } %>	<%-- printMe --%>
