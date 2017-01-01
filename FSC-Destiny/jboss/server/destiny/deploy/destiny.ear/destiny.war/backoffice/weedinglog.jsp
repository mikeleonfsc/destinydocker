<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.WeedingLogForm" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%-- I18n Support --%>
<%@ taglib uri="/WEB-INF/jstl-format.tld" prefix="fmt"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>


<base:messageBox strutsErrors="true"/>

<%
    WeedingLogForm form = (WeedingLogForm)request.getAttribute(WeedingLogForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    
%>

<base:form action="/backoffice/servlet/handleweedinglogform.do">

<base:outlinedTable id="<%=WeedingLogForm.TABLE_MAIN%>" cellpadding="5" cellspacing="0" borderColor="#C0C0C0">
    <tr>
        <td colspan="2" class="TableHeading"><%= MessageHelper.formatMessage("weedinglog_WeedingLog") %></td>
    </tr>

    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>

    <tr>
        <td class="ColRowBold tdAlignRight" valign="bottom"><%= MessageHelper.formatMessage("weedinglog_List") %></td>
        <td class="ColRowBold" valign="bottom">
          <html:hidden property="<%=WeedingLogForm.FIELD_COLLECTION_TYPE%>"></html:hidden>
           <%= CollectionType.getDisplayable(form.getCollectionType()) %> <%= MessageHelper.formatMessage("weedinglog_CopiesRemoved") %>
        </td>
    </tr>

    <tr>
        <td class="ColRowBold tdAlignRight" valign="bottom"><%= MessageHelper.formatMessage("weedinglog_From") %></td>
        <td class="ColRowBold" valign="bottom">
            <base:dateRange 
            	dateFrom="<%=form.getDateFrom()%>"
            	dateTo="<%=form.getDateTo()%>"
            />
        </td>
    </tr>
    
	<%
    if (store.isDistrictUser()) {
    %>
    <tr>
	        <td class="ColRowBold tdAlignRight" valign="bottom"><%= MessageHelper.formatMessage("weedinglog_For") %></td>
	        <td class="ColRowBold" valign="bottom">
	            <base:selectSiteAndSiteType
	            	name="<%= WeedingLogForm.FIELD_REPORT_SITE_ID%>" 
	            	selectedSiteID="<%=form.getReportSiteID()%>"
	            	includeForLibrarySites="<%=BibMasterSpecs.COLLECTION_TYPE_LIBRARY == form.getCollectionType()%>"
	            	includeForTextbookSites="<%=BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK == form.getCollectionType()%>"
                    includeDistrictWarehouseSiteType="false"
	            />
	        </td>
	    </tr>
    <%}%>

    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <tr>
        <td class="ColRowBold" colspan="2" align="center"><base:reportButton/></td>
    </tr>
</base:outlinedTable>
</base:form>

