<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.LibraryStatisticsForm" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.ejb.*"%>
<%@ page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.ResourceLostFinesReportForm"%>
<%@ page import="com.follett.fsc.common.LocaleHelper" %>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page import="com.follett.fsc.destiny.session.circulation.ejb.data.FineDistrictReportResult"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.ResourceFineDetailsForm"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>



<base:messageBox strutsErrors="true"/>

<%    ResourceLostFinesReportForm form = (ResourceLostFinesReportForm)request.getAttribute(ResourceLostFinesReportForm.FORM_NAME); 
      FineDistrictReportResult vo = form.gimmeSiteResult();  
      
      String bgColor = "#FFFFFF";
      if(!form.isPrinterFriendly()) {
        bgColor = FlipperTag.ROW_GRAY;
      }

%>


<base:form action="/backoffice/servlet/handleresourcelostfinesreportform.do">

<html:hidden property="<%=ResourceLostFinesReportForm.PARAM_LAST_FROM_DATE%>"/>
<html:hidden property="<%=ResourceLostFinesReportForm.PARAM_LAST_TO_DATE%>"/>

<base:outlinedTable borderColor="<%= bgColor %>" id='<%= ResourceLostFinesReportForm.TABLE_MAIN %>' width="100%">

    <tr>
        <td colspan="2">
            <table id="<%=ResourceLostFinesReportForm.TABLE_MAIN_HEADER%>" width="100%" cellpadding="2">
                <tr>
                    <td colspan="1" class="TableHeading">
                        <%= form.gimmeDateHeaderMessage() %> 
                    </td>
                    <td class="SmallColHeading tdAlignRight" valign="bottom">
                        <logic:equal name='<%= ResourceLostFinesReportForm.FORM_NAME %>' property="printerFriendly" value="false">
                                 <base:link page='<%= form.buildPrinterFriendlyLink("/backoffice/servlet/handleresourcelostfinesreportform.do") %>' target="printerFriendly" id="<%=ResourceLostFinesReportForm.ID_PRINTER_FRIENDLY %>"><base:image src='/buttons/small/printerfriendly.gif' alt="Printer Friendly" align="absbottom"/></base:link>
                        </logic:equal>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    <tr>
        <td valign="top">
            <!-- left side -->
            <table id="<%=ResourceLostFinesReportForm.TABLE_LOST%>" cellpadding="5">
                <tr><td class="ColRowBold">Lost Resources</td></tr>
                <tr>
                    <td class="ColRow">
                        <ul>
                            <li>Items: <%=form.getDetailLink(vo, ResourceFineDetailsForm.ACTION_LOST)%></li>
                            <li>Replacement Value: <%=form.gimmeRegionPriceFormat(vo.getReplacementValue())  %></li>
                        </ul>
                    </td>
                </tr>
            </table>
        </td>
        <td valign="top">
            <!-- right side -->
            <table id="<%=ResourceLostFinesReportForm.TABLE_DAMAGED%>" cellpadding="5">
                <tr><td class="ColRowBold">Total Assessed Fines</td></tr>
                <tr>
                    <td class="ColRow">
                        <ul>
                            <li>Total: <%=form.getDetailLink(vo, ResourceFineDetailsForm.ACTION_LOST_AND_DAMAGED)%></li>
                        </ul>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
 <tr>
     <td colspan="2" align="center"><base:imageLine height="1" width="100%" vspace="2"/></td>    
 </tr>
 <tr>
        <td valign="top">
            <!-- left side -->
            <table id="<%=ResourceLostFinesReportForm.TABLE_LOST_DETAIL%>" cellpadding="5">
                <tr><td class="ColRowBold">Lost Fines</td></tr>
                <tr>
                    <td class="ColRow">
                        <ul>
                            <li>Fines: <%=form.gimmeCommatizeFormat(vo.getLostFineCount()) %>
                                <ul>
                                    <li>Paid: <%=form.gimmePriceFormat(vo.getLostPaid())  %></li>
                                    <li>Waived: <%=form.gimmePriceFormat(vo.getLostWaived()) %> </li>
                                    <li>Outstanding: <%=form.gimmePriceFormat(vo.getLostOutstanding()) %> </li>
                                </ul> 
                            </li>
                        </ul>
                    </td>
                </tr>
            </table>
        </td>
        <td valign="top">
            <!-- right side -->
            <table id="<%=ResourceLostFinesReportForm.TABLE_DAMAGED_DETAIL%>" cellpadding="5">
                <tr><td class="ColRowBold">Damaged Fines</td></tr>
                <tr>
                    <td class="ColRow">
                        <ul>
                            <li>Fines: <%=form.gimmeCommatizeFormat(vo.getDamagedFineCount()) %>
                                <ul>
                                    <li>Paid: <%=form.gimmePriceFormat(vo.getDamagedPaid())  %></li>
                                    <li>Waived: <%=form.gimmePriceFormat(vo.getDamagedWaived()) %> </li>
                                    <li>Outstanding: <%=form.gimmePriceFormat(vo.getDamagedOutstanding()) %> </li>
                                </ul> 
                            </li>
                        </ul>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    <tr>
        <td colspan="2">
        </td>
    </tr>
 <tr>
     <td colspan="2" align="center"><base:imageLine height="1" width="100%" vspace="2"/></td>    
 </tr>
 <logic:equal name='<%= ResourceLostFinesReportForm.FORM_NAME %>' property="printerFriendly" value="false">
     <tr>
          <td colspan="2" class="TableHeading">
                        Lost Resources and Fines... 
          </td>
     </tr>

     <tr>
        <td colspan="2" align="center" class="ColRowBold">
        <table>
        <tr>
            <td align="right">Of Resource Type&nbsp;&nbsp;&nbsp;</td>
            <td align="left"><base:assetTypesList formName="<%= ResourceLostFinesReportForm.FORM_NAME%>"/></td>
        </tr>
        </table>
     </tr>

     <tr>
        <td colspan="2" align="center" class="ColRowBold">&nbsp;&nbsp;&nbsp;from&nbsp;
                <base:dateRange 
                    dateFrom="<%=form.getDateFrom()%>"
                    dateTo="<%=form.getDateTo()%>"
                />
                <base:genericButton alt="<%=ResourceLostFinesReportForm.ALT_UPDATE%>" name="<%=ResourceLostFinesReportForm.BUTTON_VIEW_RANGE %>" src="/buttons/large/update.gif" absbottom="true"/>
        </td>
     </tr>
     
     <tr>
     <td colspan="2" align="center"><base:imageLine height="1" width="100%" vspace="2"/></td>    
    </tr>
     <tr>
            <td colspan="2" align="center" class="ColRow">
                <base:genericButton alt="<%=ResourceLostFinesReportForm.ALT_RUNREPORT%>" name="<%=ResourceLostFinesReportForm.BUTTON_RUN_REPORT %>" src="/buttons/large/runreport.gif" absbottom="true"/>
                <html:checkbox property="<%= ResourceLostFinesReportForm.FIELD_LIMIT_TO_LOST_RESOURCES %>">
                            <%= MessageHelper.formatMessage("resourcelostfinesreportsite_LimitToResourcesCurrentlyInLostStatus") %></html:checkbox>
            </td>
    </tr>
    <tr><td colspan="2" align="center" class="ColRow"><%= MessageHelper.formatMessage("resourcelostfinesreport_excludeDamagedFines") %></td></tr>
    </logic:equal>
    </base:outlinedTable>      

</base:form>
