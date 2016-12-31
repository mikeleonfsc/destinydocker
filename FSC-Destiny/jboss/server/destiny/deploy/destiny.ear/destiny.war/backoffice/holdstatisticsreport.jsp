<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.data.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>



<base:messageBox strutsErrors="true"/>
<bean:define id="form" name="<%=HoldStatisticsReportForm.FORM_NAME%>" type="com.follett.fsc.destiny.client.backoffice.servlet.HoldStatisticsReportForm" />
<bean:define id="selectByList" name="backoffice_servlet_HoldStatisticsReportForm" property="selectByList"/>
<bean:define id="comparisonList" name="backoffice_servlet_HoldStatisticsReportForm" property="comparisonList"/>


<script language="JavaScript" type="text/javascript">
  <!--
    function submitDropDown() {
            document.<%=HoldStatisticsReportForm.FORM_NAME%>.submit();
    }
  // -->
</script>

<base:form action="/backoffice/servlet/handleholdstatisticsreportform.do">
    <base:outlinedTable borderColor="#C0C0C0">
        <tr><td>
            <table id="<%=HoldStatisticsReportForm.TABLE_HOLD_STATISTICS_MAIN%>" border="0" cellpadding="3" cellspacing="0">
               <tr>
                  <td colspan="3" class="TableHeading">
                    <logic:equal name="<%= HoldStatisticsReportForm.FORM_NAME %>" property="mediaBookingUser" value="false" scope="request"><%= MessageHelper.formatMessage("holdstatisticsreport_ListLibraryHoldStatistics") %></logic:equal>
                    <logic:equal name="<%= HoldStatisticsReportForm.FORM_NAME %>" property="mediaBookingUser" value="true" scope="request"><%= MessageHelper.formatMessage("holdstatisticsreport_ListBookingStatistics") %></logic:equal>
                  </td>
               </tr> 
                
                <tr>
                    <td colspan="3">
                        <base:imageLine height="1" width="100%"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <base:imageSpacer width="65" height="1"/>
                    </td>
                    <td class="ColRowBold tdAlignRight">
                        <nobr><%=MessageHelper.formatMessage("holdstatisticsreport_SelectBy") %></nobr>
                    </td>
                    <td width="100%" class="ColRow">
                        <html:select property="selectByID" onchange="submitDropDown()">
                            <html:options collection="selectByList" property="longID" labelProperty="stringDesc"/>
                        </html:select>
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td width="100%" class="ColRow"><%= MessageHelper.formatMessage("holdstatisticsreport_From") %>&nbsp;<html:text property="<%=HoldStatisticsReportForm.FIELD_SELECT_BY_FROM%>"/>
                        &nbsp;<%=MessageHelper.formatMessage("holdstatisticsreport_To") %>&nbsp;
                            <html:text property="<%=HoldStatisticsReportForm.FIELD_SELECT_BY_TO%>"/>
                    </td>
                </tr>
                <logic:equal name="<%=HoldStatisticsReportForm.FORM_NAME%>" property="<%=HoldStatisticsReportForm.FIELD_SELECT_BY_ID%>" value='<%= ""+HoldStatisticsReportJobParams.SELECT_BY_CALL_NUMBER %>'>
                    <tr>
                        <td colspan="3" class="Instruction"><%= MessageHelper.formatMessage("holdstatisticsreport_ToSpecifyACallNumberRangeEnterAtLeastTheFirst3Digi") %></td>
                    </tr>
                </logic:equal>
                
                <tr>
                    <td colspan="3">
                        <base:imageLine height="1" width="100%"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <base:imageSpacer width="65" height="1"/>
                    </td>
                    <td class="ColRowBold tdAlignRight">
                    
                        <logic:equal name="<%= HoldStatisticsReportForm.FORM_NAME %>" property="mediaBookingUser" value="false" scope="request">
                        <nobr><%=MessageHelper.formatMessage("holdstatisticsreport_IncludeTitlesWithHoldsThisYear")%></nobr>
                        </logic:equal>
                        <logic:equal name="<%= HoldStatisticsReportForm.FORM_NAME %>" property="mediaBookingUser" value="true" scope="request">
                        <nobr><%=MessageHelper.formatMessage("holdstatisticsreport_IncludeTitlesWithBookingsThisYear")%></nobr>
                        </logic:equal>                    
                    </td>
                    <td width="100%" class="ColRow">
                        <html:select property="<%=HoldStatisticsReportForm.FIELD_COMPARISON_ID%>">
                            <html:options collection="comparisonList" property="longID" labelProperty="stringDesc"/>
                        </html:select>
                        &nbsp;<html:text property="<%=HoldStatisticsReportForm.FIELD_NUM_HOLDS%>" size="3" maxlength="3"/>
                        
                    </td>
                </tr>
                
                <tr>
                    <td colspan="3">
                        <base:imageLine height="1" width="100%"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="3" align="center" class="ColRowBold">
                        <base:reportButton/>
                    </td>
                </tr>
            </table>
        </td></tr> 
    </base:outlinedTable>
</base:form>

