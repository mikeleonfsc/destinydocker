<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LoginFacadeSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.ejb.*" %>
<%@ page import="com.follett.fsc.destiny.session.circulation.ejb.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="java.util.*" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>

<%
    CircReportDetailForm form = (CircReportDetailForm)request.getAttribute( CircReportDetailForm.FORM_NAME );

    ArrayList callNumberList = (ArrayList)form.getCallNumberList();

    SessionStoreProxy handle = SessionStoreProxy.getSessionStore( session, request );
    String siteName =  (String)handle.getProperty( LoginFacadeSpecs.SITE_DISPLAY_NAME );
    if (siteName == null) {
        siteName = "";
    }

%>


<table id="<%=CircReportDetailForm.TABLE_LINK%>" width="98%" border="0" cellspacing="0" cellpadding="2">
<tr>
    <td class="Instruction" valign="top"><%= form.getHeading() %></td>
    <td class="SmallColRow tdAlignRight" valign="top">
<%
if (!form.getPrint()) {
%>
        <base:link page='<%= form.getPrinterLink("/backoffice/servlet/presentcircreportdetailform.do")%>' target="printerFriendly" id="<%=CircReportDetailForm.ID_PRINTER_FRIENDLY %>"><base:image src="/buttons/small/printerfriendly.gif" alt='<%= MessageHelper.formatMessage("printable") %>' /></base:link>
<%
}
%>
    </td>
</tr>
</table>

<table id="<%=CircReportDetailForm.TABLE_DETAIL%>" width="98%" border="0" cellspacing="0" cellpadding="1">

<%
        if (callNumberList.size() == 0) {
%>
<tr>
    <td class="ColRowBold"><%= MessageHelper.formatMessage("circreportdetail_NoResultsFound") %></td>
</tr>
<%
        }

        String lastTitleAndAuthor = null;

        boolean isTemporaryRow = false;
        for (int index = 0; index < callNumberList.size(); index ++) {
            HashMap aRow = (HashMap) callNumberList.get( index );
            isTemporaryRow = (aRow.get(CollectionStatisticsReportSpecs.HASH_ISTEMPORARY) != null);
            StringBuffer titleAndAuthor = new StringBuffer();
            
            if (isTemporaryRow) {
                String tempTitleAndAuthor = "<strong>" 
                    + ResponseUtils.filter((String)aRow.get(CollectionStatisticsReportSpecs.HASH_TITLE)) 
                    + "</strong> "
                    + ResponseUtils.filter((String)aRow.get(CollectionStatisticsReportSpecs.HASH_AUTHOR));
                titleAndAuthor.append(MessageHelper.formatMessage("circreportdetail_0Temporary", tempTitleAndAuthor));
            } else {
                titleAndAuthor.append("<strong>");
                titleAndAuthor.append(ResponseUtils.filter((String)aRow.get(CollectionStatisticsReportSpecs.HASH_TITLE)));
                titleAndAuthor.append("</strong> ");
                titleAndAuthor.append(ResponseUtils.filter((String)aRow.get(CollectionStatisticsReportSpecs.HASH_AUTHOR)));
            }

            if (!titleAndAuthor.toString().equals(lastTitleAndAuthor)) {
%>
<tr>
    <td class="ColRow" colspan="9" bgcolor="#e8e8e8"><%= titleAndAuthor.toString() %></td>
</tr>
<tr>
    <td width="30">&nbsp;</td>
    <td class="SmallColHeading"><%= MessageHelper.formatMessage("circreportdetail_Call") %></td>
    <td class="SmallColHeading"><%= MessageHelper.formatMessage("circreportdetail_Barcode") %></td>
    <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("circreportdetail_Price") %></td>
    <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("circreportdetail_Today") %></td>
    <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("circreportdetail_ThisMonth") %></td>
    <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("circreportdetail_ThisYear") %></td>
    <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("circreportdetail_LastYear") %></td>
    <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("circreportdetail_Total") %></td>
</tr>
<%
            }
%>
<tr>
    <td>&nbsp;</td>
    <td class="ColRow"><%= ResponseUtils.filter((String)aRow.get(CollectionStatisticsReportSpecs.HASH_CALL_NUMBER)) %></td>
    <td class="ColRow"><%= ResponseUtils.filter((String)aRow.get(CollectionStatisticsReportSpecs.HASH_BARCODE_DISPLAYABLE)) %></td>
    <td class="ColRow tdAlignRight"><%= (String)aRow.get(CollectionStatisticsReportSpecs.HASH_PRICE) %></td>
    <td class="ColRow tdAlignRight"><%= (String)aRow.get(CollectionStatisticsReportSpecs.HASH_DAILY_CIRC) %></td>
    <td class="ColRow tdAlignRight"><%= (String)aRow.get(CollectionStatisticsReportSpecs.HASH_MONTHLY_CIRC) %></td>
    <td class="ColRow tdAlignRight"><%= (String)aRow.get(CollectionStatisticsReportSpecs.HASH_YEARLY_CIRC) %></td>
    <td class="ColRow tdAlignRight"><%= (String)aRow.get(CollectionStatisticsReportSpecs.HASH_LAST_YEAR_CIRC) %></td>
    <td class="ColRow tdAlignRight"><%= (String)aRow.get(CollectionStatisticsReportSpecs.HASH_TOTAL_CIRC) %></td>
</tr>

<%
            lastTitleAndAuthor = titleAndAuthor.toString();
        }
%>

</table>

<br>
<div align="center"><span class="Instruction"><%= MessageHelper.formatMessage("circreportdetail_NOTECopyDetailsDoesNotIncludeStatisticsForCopiesTh") %></span></div>
<br>
<div align="center"><span class="Instruction"><%= MessageHelper.formatMessage("circreportdetail_ReportGeneratedOn", form.getTimeOfGeneration( session )) %><br></span></div>

