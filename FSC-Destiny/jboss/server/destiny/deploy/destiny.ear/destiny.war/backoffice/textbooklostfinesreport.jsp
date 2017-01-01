<%@page import="com.follett.fsc.destiny.util.DestinyColors"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.LibraryStatisticsForm" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.ejb.*"%>
<%@ page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.TextbookLostFinesReportForm"%>
<%@ page import="com.follett.fsc.common.LocaleHelper" %>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.TextbookFineDetailsForm"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>



<base:messageBox strutsErrors="true"/>

<%    TextbookLostFinesReportForm form = (TextbookLostFinesReportForm)request.getAttribute(TextbookLostFinesReportForm.FORM_NAME); 
        long totalNumberOfCopies = 0;
        long totalReplacementValue = 0;
        long totalLostPaid = 0;
        long totalLostWaived = 0;
        long totalLostOutstanding = 0;
        long totalDamagedPaid = 0;
        long totalDamagedWaived = 0;
        long totalDamagedOutstanding = 0;
        long totalFines = 0;

        String borderLeft = "border-left-style: solid; border-left-width: 1px; border-left-color: #E8E8E8;";
        String borderBottom = "border-bottom-style: solid; border-bottom-width: 1px; border-bottom-color: #E8E8E8;";
        String borderRight = "border-right-style: solid; border-right-width: 1px; border-right-color: #E8E8E8;";

        String bgColor = "#FFFFFF";
        if(!form.isPrinterFriendly()) {
            bgColor = FlipperTag.ROW_GRAY;
        }
%>



<base:form action="/backoffice/servlet/handletextbooklostfinesreportform.do">

<html:hidden property="<%=TextbookLostFinesReportForm.PARAM_LAST_FROM_DATE%>"/>
<html:hidden property="<%=TextbookLostFinesReportForm.PARAM_LAST_TO_DATE%>"/>


<base:outlinedTable borderColor="<%= bgColor %>" id='<%= TextbookLostFinesReportForm.TABLE_OUTER %>' width="100%">

    <tr>
        <td>
            <table id="<%=TextbookLostFinesReportForm.TABLE_MAIN_HEADER%>" width="100%" cellpadding="2">
                <tr>
                    <td class="Instruction">
                        <%= form.gimmeDateHeaderMessage() %> 
                    </td>
                    <td class="SmallColHeading tdAlignRight" valign="bottom">
                        <logic:equal name='<%= TextbookLostFinesReportForm.FORM_NAME %>' property="printerFriendly" value="false">
                            <td class="tdAlignRight">
                                 <base:link page='<%= form.buildPrinterFriendlyLink("/backoffice/servlet/handletextbooklostfinesreportform.do") %>' target="printerFriendly" id="<%=TextbookLostFinesReportForm.ID_PRINTER_FRIENDLY %>"><base:image src='/buttons/small/printerfriendly.gif' alt="Printer Friendly" align="absbottom"/></base:link>
                            </td>
                        </logic:equal>
                    </td>
                </tr>
            </table>
        </td>
      </tr>
      <tr>
        <td>
          <table  id="<%=TextbookLostFinesReportForm.TABLE_MAIN %>" frame="void" rules="all" cellspacing="0" cellpadding="3" align="center" bordercolor="#C0C0C0" width="100%" border="1">
               <tr bgcolor="<%=DestinyColors.BACKGROUND%>">
                    <td align="center" class="InverseSmallColHeading" valign="top">
                        &nbsp; 
                    </td>
                    <td align="center" colspan="2"  class="InverseSmallColHeading" valign="top">
                        Lost Textbooks
                    </td>
                    <td align="center" colspan="3" class="InverseSmallColHeading" valign="top">
                        Lost Fines
                    </td>
                    <td align="center" colspan="3" class="InverseSmallColHeading" valign="top">
                       Damaged Fines
                    </td>
                    <td align="center" class="InverseSmallColHeading" valign="top">
                        &nbsp;
                    </td>
             </tr>   
             <tr bgcolor="<%=DestinyColors.BACKGROUND%>">
                    <td class="InverseSmallColHeading" valign="top">
                       Site
                    </td>
                    <td align="center" class="InverseSmallColHeading" valign="top">
                        Copies
                    </td>
                    <td align="center" class="InverseSmallColHeading" valign="top">
                        Replacement Value
                    </td>
                    <td align="center" class="InverseSmallColHeading" valign="top">
                       Paid
                    </td>
                    <td align="center" class="InverseSmallColHeading" valign="top">
                        Waived
                    </td>
                    <td align="center" class="InverseSmallColHeading" valign="top">
                        Outstanding
                    </td>
                    <td align="center" class="InverseSmallColHeading" valign="top">
                       Paid
                    </td>
                    <td align="center" class="InverseSmallColHeading" valign="top">
                        Waived
                    </td>
                    <td align="center" class="InverseSmallColHeading" valign="top">
                        Outstanding
                    </td>
                    <td align="center" class="InverseSmallColHeading" valign="top">
                        Total Fines
                    </td>
             </tr>   
             <logic:iterate indexId="count" id="vo" name="<%= TextbookLostFinesReportForm.FORM_NAME%>" property="results" type="com.follett.fsc.destiny.session.circulation.ejb.data.FineDistrictReportResult">
                 <%
                    if ( ( count & 1 ) == 0 ) {
                    %>
                        <tr bgcolor="#E8E8E8">
                    <% } else { %>
                        <tr>
                    <% }
                     totalNumberOfCopies += vo.getNumberOfCopies();
                     totalReplacementValue += vo.getReplacementValue();
                     totalLostPaid += vo.getLostPaid();
                     totalLostWaived += vo.getLostWaived();
                     totalLostOutstanding += vo.getLostOutstanding();
                     totalDamagedPaid += vo.getDamagedPaid();
                     totalDamagedWaived += vo.getDamagedWaived();
                     totalDamagedOutstanding += vo.getDamagedOutstanding();
                     totalFines += vo.getTotalFines();
                    
                 %>
                    <td class="ColRow" style="<%= borderLeft %>"><%=vo.getSiteName()%></td>
                    <td class="ColRow tdAlignRight"><%=form.getDetailLink(vo, TextbookFineDetailsForm.ACTION_LOST)%></td>
                    <td class="ColRow tdAlignRight"><%=form.gimmeRegionPriceFormat(vo.getReplacementValue())  %></td>
                    <td class="ColRow tdAlignRight"><%=form.gimmePriceFormat(vo.getLostPaid())  %></td>
                    <td class="ColRow tdAlignRight"><%=form.gimmePriceFormat(vo.getLostWaived())  %></td>
                    <td class="ColRow tdAlignRight"><%=form.gimmePriceFormat(vo.getLostOutstanding())  %></td>
                    <td class="ColRow tdAlignRight"><%=form.gimmePriceFormat(vo.getDamagedPaid())  %></td>
                    <td class="ColRow tdAlignRight"><%=form.gimmePriceFormat(vo.getDamagedWaived())  %></td>
                    <td class="ColRow tdAlignRight"><%=form.gimmePriceFormat(vo.getDamagedOutstanding())  %></td>
                    <td class="ColRow tdAlignRight" style="<%= borderRight %>"><%=form.getDetailLink(vo, TextbookFineDetailsForm.ACTION_LOST_AND_DAMAGED)%></td>
                </tr>
             </logic:iterate>
             <tr>
                <td class="ColRowBold" style="<%= borderLeft + borderBottom %>">District Total</td>
                <td class="ColRowBold tdAlignRight" style="<%= borderBottom %>"><%=form.gimmeCommatizeFormat(totalNumberOfCopies) %></td>
                <td class="ColRowBold tdAlignRight" style="<%= borderBottom %>"><%=form.gimmeRegionPriceFormat(totalReplacementValue)  %></td>
                <td class="ColRowBold tdAlignRight" style="<%= borderBottom %>"><%=form.gimmePriceFormat(totalLostPaid)%></td>
                <td class="ColRowBold tdAlignRight" style="<%= borderBottom %>"><%=form.gimmePriceFormat(totalLostWaived)%></td>
                <td class="ColRowBold tdAlignRight" style="<%= borderBottom %>"><%=form.gimmePriceFormat(totalLostOutstanding)%></td>
                <td class="ColRowBold tdAlignRight" style="<%= borderBottom %>"><%=form.gimmePriceFormat(totalDamagedPaid)%></td>
                <td class="ColRowBold tdAlignRight" style="<%= borderBottom %>"><%=form.gimmePriceFormat(totalDamagedWaived)%></td>
                <td class="ColRowBold tdAlignRight" style="<%= borderBottom %>"><%=form.gimmePriceFormat(totalDamagedOutstanding)%></td>
                <td class="ColRowBold tdAlignRight" style="<%= borderBottom + borderRight %>"><%=form.gimmePriceFormat(totalFines)%></td>
             </tr>
        </table>
    </td>
    <logic:equal name='<%= TextbookLostFinesReportForm.FORM_NAME %>' property="printerFriendly" value="false">
        <tr>
            <td colspan="1" class="TableHeading">
                <a name="<%=TextbookLostFinesReportForm.ANCHOR_DATES%>"></a><br/>Lost Textbooks and Fines...
            </td>
        </tr>
   
        <tr>
            <td colspan="2" align="center" class="ColRowBold">&nbsp;&nbsp;&nbsp;from&nbsp;
                <base:dateRange 
                        dateFrom="<%=form.getDateFrom()%>"
                        dateTo="<%=form.getDateTo()%>"
                />
                <base:genericButton alt="<%=TextbookLostFinesReportForm.ALT_UPDATE%>" name="<%=TextbookLostFinesReportForm.BUTTON_VIEW_RANGE %>" src="/buttons/large/update.gif" absbottom="true"/>
            </td>
        </tr>
         <tr>
     <td colspan="2" align="center"><base:imageLine height="1" width="100%" vspace="2"/></td>    
 </tr>
        <tr>
            <td colspan="2" align="center" class="ColRow">
                <base:genericButton alt="<%=TextbookLostFinesReportForm.ALT_RUNREPORT%>" name="<%=TextbookLostFinesReportForm.BUTTON_RUN_REPORT %>" src="/buttons/large/runreport.gif" absbottom="true"/>
                <html:checkbox property="<%= TextbookLostFinesReportForm.FIELD_LIMIT_TO_LOST_TEXTBOOKS %>">
                            <%= MessageHelper.formatMessage("textbooklostfinesreport_LimitToTextbooksCurrentlyInLostStatus") %></html:checkbox>
            </td>
        </tr>
        <tr><td colspan="2" align="center" class="ColRow"><%= MessageHelper.formatMessage("textbooklostfinesreport_excludeDamagedFines") %></td></tr>
    </logic:equal>            
    </base:outlinedTable>
</base:form>
