<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.data.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>


<base:messageBox strutsErrors="true"/>
<bean:define id="form" name="<%=ExtractTransactionsReportForm.FORM_NAME%>" type="com.follett.fsc.destiny.client.backoffice.servlet.ExtractTransactionsReportForm" />

<base:form action="/backoffice/servlet/handleextracttransactionsreportform.do">
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">
<base:outlinedTable borderColor='#C0C0C0'>
    <tr>
        <td colspan="2" class="TableHeading"><%= MessageHelper.formatMessage("extracttransactionsreport_ExtractCopyTransactionData") %></td>
    </tr>
    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top"><%= MessageHelper.formatMessage("extracttransactionsreport_From") %></td>
        <td class="ColRowBold">
            <base:dateRange dateFrom="<%=form.getDateFrom()%>" dateTo="<%=form.getDateTo()%>"/>
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td class="ColRow">
            <html:checkbox property="<%=ExtractTransactionsReportForm.FIELD_INCLUDE_IN_LIB_USE%>"><%= MessageHelper.formatMessage("extracttransactionsreport_From_IncludeInLibraryUse") %></html:checkbox>
        </td>
    </tr>
    
    <logic:equal name='<%= ExtractTransactionsReportForm.FORM_NAME %>' property="showCheckbox" value="true" scope="request" >
    <tr>
        <td>&nbsp;</td>
        <td class="ColRow">
            <html:checkbox property="<%=ExtractTransactionsReportForm.FIELD_INCLUDE_PATRON_DATA%>"><%= MessageHelper.formatMessage("extracttransactionsreport_IncludeAssociatedPatronData") %></html:checkbox>
            <base:helpTag helpFileName="t_extract_transaction_data_include_patron_data.htm"/>            
        </td>
    </tr>
    </logic:equal>
    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <tr>
        <td colspan="2" align="center">
            <base:genericShowHideButton alt='<%= MessageHelper.formatMessage("extract") %>' name="<%=ExtractTransactionsReportForm.BUTTON_EXTRACT%>" src="/buttons/large/extract.gif"/>
        </td>
    </tr>
</base:outlinedTable>
</base:form>
