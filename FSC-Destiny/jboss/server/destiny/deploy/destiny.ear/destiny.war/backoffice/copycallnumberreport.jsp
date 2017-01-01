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
    <SCRIPT LANGUAGE="javascript" TYPE="text/javascript">
    <!--
        function submitTheForm() {
            document.<%=CopyCallNumberReportForm.FORM_NAME%>.submit();
        }
    // -->
    </SCRIPT>

<bean:define id="form" name="<%=CopyCallNumberReportForm.FORM_NAME%>" type="com.follett.fsc.destiny.client.backoffice.servlet.CopyCallNumberReportForm" />

<base:form action="/backoffice/servlet/handlecopycallnumberreportform.do">
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">

<base:outlinedTable id="<%=CopyCallNumberReportForm.TABLE_NAME%>" cellpadding="5" cellspacing="0" borderColor='#C0C0C0'>
    <tr>
        <td colspan="2" class="TableHeading">
            <logic:equal name="<%=CopyCallNumberReportForm.FORM_NAME %>" property="mediaBookingUser" value="false"><%= MessageHelper.formatMessage("copycallnumberreport_ListLibraryCopies") %></logic:equal>
            <logic:equal name="<%=CopyCallNumberReportForm.FORM_NAME %>" property="mediaBookingUser" value="true"><%= MessageHelper.formatMessage("copycallnumberreport_ListMediaCopies") %></logic:equal>
        </td>
    </tr>
    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>

    <logic:equal name="<%=CopyCallNumberReportForm.FORM_NAME %>" property="<%=CopyCallNumberReportForm.FIELD_DISCTRICT_USER%>" value="true"> 
        <tr>
            <td class="ColRowBold tdAlignRight" valign="top"><%= MessageHelper.formatMessage("copycallnumberreport_For") %></td>
            <td class="ColRow">
                <base:selectSite 
                    includeAllLibraries="false" 
                    name="<%=CopyCallNumberReportForm.FIELD_SITE_ID%>" 
                    selectedSiteID='<%= ""+form.getReportSiteID()%>'
                    includeLibrarySites="true"
        			includeTextbookSites="false"
        			includeAssetSites="false"
        			includeMediaSites="false"
        			
                    />
            </td>
        </tr>
    </logic:equal>
    <logic:equal name="<%=CopyCallNumberReportForm.FORM_NAME %>" property="<%=CopyCallNumberReportForm.FIELD_DISCTRICT_USER%>" value="false"> 
        <html:hidden property="<%=CopyCallNumberReportForm.FIELD_SITE_ID%>"/>
    </logic:equal>
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top"><%= MessageHelper.formatMessage("copycallnumberreport_Show") %></td>
        <td class="ColRow">
            <html:select onchange="javascript:submitTheForm()" property="<%=CopyCallNumberReportForm.FIELD_SHOW%>">
                <html:option value='<%=""+CopyCallNumberJobParams.SHOW_MODE_COPIES_WITH_CALL_NUMBER_PREFIXES%>'>
                    <%=CopyCallNumberJobParams.getShowModeDisplayable(CopyCallNumberJobParams.SHOW_MODE_COPIES_WITH_CALL_NUMBER_PREFIXES)%></html:option>
                <html:option value='<%=""+CopyCallNumberJobParams.SHOW_MODE_COPIES_WITH_DIFFERENT_CALL_NUMBERS%>'>
                    <%=CopyCallNumberJobParams.getShowModeDisplayable(CopyCallNumberJobParams.SHOW_MODE_COPIES_WITH_DIFFERENT_CALL_NUMBERS)%></html:option>
                <html:option value='<%=""+CopyCallNumberJobParams.SHOW_MODE_COPIES_WITHOUT_CALLNUMBERS%>'>
                    <%=CopyCallNumberJobParams.getShowModeDisplayable(CopyCallNumberJobParams.SHOW_MODE_COPIES_WITHOUT_CALLNUMBERS)%></html:option>
            </html:select>
        </td>
    </tr>
    <logic:notEqual name="<%= CopyCallNumberReportForm.FORM_NAME %>" property="<%=CopyCallNumberReportForm.FIELD_SHOW%>" value='<%= ""+CopyCallNumberJobParams.SHOW_MODE_COPIES_WITH_CALL_NUMBER_PREFIXES%>' scope="request" > 
        <tr>
            <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("copycallnumberreport_IncludeTitles") %></td>
            <td class="ColRow"><%= MessageHelper.formatMessage("copycallnumberreport_From") %>&nbsp;<html:text property="<%=CopyCallNumberReportForm.FIELD_FROM%>" size="20"/>
                &nbsp;<%=MessageHelper.formatMessage("copycallnumberreport_To") %>&nbsp;
                <html:text property="<%=CopyCallNumberReportForm.FIELD_TO%>" size="20"/>
            </td>
        </tr>
    </logic:notEqual>
    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <tr>
        <td class="ColRowBold" colspan="2" align="center"><base:reportButton/></td>
    </tr>
</base:outlinedTable>
</base:form>
