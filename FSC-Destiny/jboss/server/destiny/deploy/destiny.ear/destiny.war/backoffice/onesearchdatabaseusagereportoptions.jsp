<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.OneSearchDatabaseUsageReportOptionsForm"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
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
    OneSearchDatabaseUsageReportOptionsForm form = (OneSearchDatabaseUsageReportOptionsForm)request.getAttribute(OneSearchDatabaseUsageReportOptionsForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    
%>

<base:form action="/backoffice/servlet/handleonesearchdatabaseusagereportoptionsform.do">

<base:outlinedTable id="<%=OneSearchDatabaseUsageReportOptionsForm.TABLE_MAIN%>" cellpadding="5" cellspacing="0" borderColor="#C0C0C0">
    <tr>
        <td colspan="2" class="TableHeading"><%= MessageHelper.formatMessage("onesearchdatabaseusagereportoptions_OneSearchDatabaseUsage") %></td>
    </tr>

    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>

    <tr>
        <td class="ColRowBold tdAlignRight" valign="bottom"><%= MessageHelper.formatMessage("onesearchdatabaseusagereportoptions_From") %></td>
        <td class="ColRowBold" valign="bottom">
            <base:dateRange 
                monthFrom="<%=form.getDateFromMonth()%>"
                yearFrom="<%=form.getDateFromYear()%>"
                monthTo="<%=form.getDateToMonth()%>"
                yearTo="<%=form.getDateToYear()%>"
                selectType="MonthYear"
            />
            
            <% if (form.isForwardToOneSearch()) { %>
                <script language="JavaScript" type="text/javascript" id="<%= OneSearchDatabaseUsageReportOptionsForm.SCRIPT_ID%>">window.open('<%= form.getForwardLink() %>','','width=800,height=600,scrollbars=1');</script>
            <% } %>
            
        </td>
    </tr>
    
    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <tr>
        <td class="ColRowBold" colspan="2" align="center"><base:reportButton/></td>
    </tr>
</base:outlinedTable>
</base:form>

