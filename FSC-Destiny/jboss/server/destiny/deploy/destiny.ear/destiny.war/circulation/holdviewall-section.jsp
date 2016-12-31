<%@ page language="java" %>     
<%@ page contentType="text/html; charset=UTF-8" %> 
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LoginFacadeSpecs" %>
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
    SessionStoreProxy store = form.getStore();
    boolean printerFriendly = form.isPrinterFriendly();
	
	String tableName = "";
	String sectionSubHeading = "";
	String sectionHelpURL = "";
	String typeJSP = "";
	
	boolean isRender = true;
	
	if (HoldViewAllForm.LIST_TYPE_UNAPPROVED.equals(type)) {
    	tableName = HoldViewAllForm.TABLE_UNAPPROVED;
        
		typeJSP = "holdviewall-type1.jsp";
		
		// since reserves could also be unapproved, we need to also key this guy off of that flag
		isRender = form.isIncludeUnapproved() || form.isIncludeReserved();
    } else if (HoldViewAllForm.LIST_TYPE_FILL_BY_LOCAL_SITE.equals(type)) {
    	tableName = HoldViewAllForm.TABLE_ILL_FILL_BY_ME;
		sectionSubHeading = MessageHelper.formatMessage("holdviewall-section_ToBeFilledBy",ResponseUtils.filter((String)store.getProperty(LoginFacadeSpecs.SITE_DISPLAY_NAME)));
		typeJSP = "holdviewall-type1.jsp";
		isRender = form.isIncludeILL();
    } else if (HoldViewAllForm.LIST_TYPE_FILL_BY_OTHER_SITE.equals(type)) {
    	tableName = HoldViewAllForm.TABLE_ILL_FILL_BY_OTHER;
		sectionSubHeading = MessageHelper.formatMessage("holdviewall-section_ToBeFilledByOtherSites");
		typeJSP = "holdviewall-type1.jsp";
		isRender = form.isIncludeILL();
    } else if (HoldViewAllForm.LIST_TYPE_MEDIA.equals(type)) {
    	tableName = HoldViewAllForm.TABLE_MEDIA_REQUESTS;
		typeJSP = "holdviewall-type1.jsp";
		isRender = form.isIncludeMedia();
    } else if (HoldViewAllForm.LIST_TYPE_FOLLETT_EBOOK_MEDIA.equals(type)) {
        tableName = HoldViewAllForm.TABLE_FOLLETT_EBOOK_MEDIA_REQUESTS;
        typeJSP = "holdviewall-follettebook.jsp";
        isRender = form.isIncludeMedia();
    } else if (HoldViewAllForm.LIST_TYPE_TO_BE_PULLED.equals(type)) {
    	tableName = HoldViewAllForm.TABLE_LOCAL_TO_BE_PULLED;
		sectionSubHeading = MessageHelper.formatMessage("holdviewall-section_LocalMaterialsToBePulled");
		typeJSP = "holdviewall-type2.jsp";
		sectionHelpURL = "d_local_materials_to_be_pulled.htm";
		isRender = form.isIncludeReserved() || form.isIncludeReady();
    } else if (HoldViewAllForm.LIST_TYPE_PENDING.equals(type)) {
    	tableName = HoldViewAllForm.TABLE_LOCAL_PENDING;
		sectionSubHeading = MessageHelper.formatMessage("holdviewall-section_LocalMaterialsPending");		
		typeJSP = "holdviewall-type3.jsp";
		sectionHelpURL = "d_local materials pending.htm";
		isRender = form.isIncludeReserved() || form.isIncludePending();		
    } else if (HoldViewAllForm.LIST_TYPE_EXPIRED.equals(type)) {
    	tableName = HoldViewAllForm.TABLE_LOCAL_EXPIRED;
		sectionSubHeading = MessageHelper.formatMessage("holdviewall-section_LocalMaterialsExpired");
		typeJSP = "holdviewall-type3.jsp";       
        sectionHelpURL = "d_local materials expired.htm";        
		isRender = form.isIncludeReserved() || form.isIncludeExpired();		
    } else if (HoldViewAllForm.LIST_TYPE_READY_FOR_PATRON.equals(type)) {
    	tableName = HoldViewAllForm.TABLE_LOCAL_READY_FOR_PATRON;
		sectionSubHeading = MessageHelper.formatMessage("holdviewall-section_LocalMaterialsReadyForPatron");
		typeJSP = "holdviewall-type3.jsp";
		sectionHelpURL = "d_local_materials_ready_for_patron.htm";
		isRender = form.isIncludeReserved() || form.isIncludeReady();		
    }
%>

<bean:size id="listSize" name="<%=HoldViewAllForm.FORM_NAME%>" property="<%=type%>"/>
<logic:notEqual name="listSize" value="0">
	<% if ( isRender ) { %>
		<% if (!StringHelper.isEmpty(sectionSubHeading)) { %>
		<tr>
		    <td class="TableHeading2" align="center" nowrap>            
		        <%=sectionSubHeading%>
		        <% if (!printerFriendly && !StringHelper.isEmpty(sectionHelpURL)) { %>
		        	<base:helpTag helpFileName="<%= sectionHelpURL %>"/>
		        <% } %>
		    </td>
		</tr>
		<% } %>
		<tr>
			<td>
			    <table id="<%=tableName %>" cellSpacing="0" cellPadding="2" width="100%" border="0" style="border-collapse: collapse">
					<jsp:include page="<%=typeJSP%>">
						<jsp:param name="type" value="<%=type%>"/>
					</jsp:include>
				</table>
		    </td>
		</tr>
	<% } %>
</logic:notEqual>	<%-- size == 0 --%>
