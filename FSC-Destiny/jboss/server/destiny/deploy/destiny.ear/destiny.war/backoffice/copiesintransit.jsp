<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>


<base:messageBox strutsErrors="true"/>

<%
    String formName = CopiesInTransitForm.FORM_NAME;
    String formAction = "/backoffice/servlet/handlecopiesintransitform.do";
    CopiesInTransitForm form = (CopiesInTransitForm)request.getAttribute(formName);
%>


<base:form action="<%=formAction%>">
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true" name="trapEnterKey">
	<base:outlinedTable id="<%=CopiesInTransitForm.TABLE_PARAMETERS%>" borderColor='#C0C0C0'>
	    <tr>
	        <td colspan="2" class="TableHeading" nowrap>
	            <%=MessageHelper.formatMessage("copiesintransit_InTransitCopies")%>
	        </td>
	    </tr>
	    <tr>
	        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
	    </tr>
        <tr>
            <td class="ColRowBold tdAlignRight" valign="top"><%= MessageHelper.formatMessage("copiesintransit_For") %></td>
            <td class="ColRow">
                <base:selectSite 
                    submitOnChange="false" 
                    name="<%=CopiesInTransitForm.FIELD_REPORT_SITE_ID%>" 
                    selectedSiteID='<%= form.getReportSiteID().toString()%>'
                    includeLibrarySites="true"
        			includeTextbookSites="false"
        			includeMediaSites="false"
        			includeAssetSites="false"
        			includeAllLibraries="true"
        			/>
            </td>
        </tr>
	    <tr>
	        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
	    </tr>
	    <tr>
	        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("copiesintransit_ShippedDate") %></td>
	        <td class="ColRow"><%= MessageHelper.formatMessage("copiesintransit_From") %>&nbsp;<base:dateRange 
					dateFrom="<%=form.getDateFrom()%>"
					dateTo="<%=form.getDateTo()%>"
					hideButtonsForMac = "true"
				/>
            </td>
        </tr>
	    <tr>
	        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
	    </tr>
		<tr><td colspan="2" class="ColRowBold" align="center">
		    <base:reportButton/>
		</td></tr>
	</base:outlinedTable>
</base:form>
