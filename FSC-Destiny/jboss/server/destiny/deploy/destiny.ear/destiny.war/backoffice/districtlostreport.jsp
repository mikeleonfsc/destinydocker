
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>

<%@page import="java.util.List"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.data.InventoryLostCountsVO"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.follett.fsc.destiny.util.Permission"%>
<%@page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="com.follett.fsc.destiny.client.common.servlet.GenericForm"%>
<br>

<base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handledistrictlostreportform.do">

<% 
DistrictLostReportForm form = (DistrictLostReportForm)request.getAttribute(DistrictLostReportForm.FORM_NAME);
List<InventoryLostCountsVO> listOfLostCounts = form.getListOfLostCounts();
String lostText = form.getStore().isStateContext() ? "lost and billed" : "lost"; 
String capLostText = form.getStore().isStateContext() ? "Lost and Billed" : "Lost"; 
%>

<table id="TableSoWholePageDislpays" width="100%">
<tr>
<td  width="100%">
    <table width="100%">
        <tr><td class="TableHeading">Show the number of copies "<%=lostText%>" for...</td></tr>
    </table>

    <logic:equal name="<%= DistrictLostReportForm.FORM_NAME %>" property="showDeleteLostMessage" value="true">
        <base:messageBox showRedBorder="true">
            <tr valign="top">
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td class="ColRowBold">
                    <bean:write name="<%= DistrictLostReportForm.FORM_NAME %>" property="deleteLostMessage"/>
                </td>
            </tr>
            <tr>
                <td align="center" class="ColRow" colspan="2">This process cannot be reversed. Are you sure you want to proceed?</td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2">
                    <base:yesNo 
                        buttonYesName="<%=DistrictLostReportForm.BUTTON_CONFIRM_DELETE_YES%>"
                        buttonNoName="<%=DistrictLostReportForm.BUTTON_CONFIRM_DELETE_NO%>"
                    />
                </td>
            </tr>
        </base:messageBox>
    </logic:equal>
    
    
    <logic:equal name="<%= DistrictLostReportForm.FORM_NAME %>" property="printerFriendly" value="false">
        <base:isStateContext>
            <table id="<%=DistrictLostReportForm.TABLE_DISTRICT_SITE_SELECTION%>">
            <tr>
                <td class="ColRowBold tdAlignRight" nowrap>
                    District 
                </td>
                <td class="ColRow">
                   <base:selectDistrict                                 
                    includeStateTextbookOffice="true" 
                    selectedDistrictContext="<%=form.getDistrictContext()%>"
                    mustContainTextbookSites="true"  
                    useSelectAllDistricts="true"                                
                    useSelectADistrict="false"                                
                    onChangeAction="submitDropDownDistrict()" 
                    name="<%= DistrictLostReportForm.FIELD_DISTRICT_CONTEXT %>" />                            
                </td>
            </tr>
    
            
            <% 
            
            if ( !UserContext.getMyContextName().equals(form.getDistrictContext())) { %>
                <tr>
                    <td class="ColRowBold tdAlignRight" nowrap>
                        Site Name
                    </td>
                <% if ( SelectDistrictTag.VALUE_ALL_DISTRICTS.equals(form.getDistrictContext()) ) { %>
                       <td class="ColRow">All Sites</td>
                <% } else { %>
                       <td>
                           <base:selectSite 
                           onChangeAction="submitDropDownSite()"
                           useSelectASite="false"
                           name="<%= DistrictLostReportForm.FIELD_SITE_LIMITER %>" 
                           selectedSiteID="<%= String.valueOf(form.getSiteLimiterID()) %>" 
                           mode="<%=SelectSiteTag.MODE_GROUP_BY_SITE_TYPE_TEXTBOOK_ONLY %>"
                           includeLibrarySites="false"
                           includeTextbookSites="true"
                           includeMediaSites="false"
                           contextName="<%=form.getDistrictContext()%>"
                           includeAssetSites="false"
                           includeAllSites="true"
                           />
                        </td>   
                       
                <% } %>
                </tr>
            <% } %>
            </table>
        </base:isStateContext>
        <base:isNotStateContext>
            <table id="<%=DistrictLostReportForm.TABLE_DISTRICT_SITE_SELECTION%>">
            <tr>
                <td class="ColRowBold tdAlignRight" nowrap>
                    Site Name 
                </td>
                <td class="ColRow">
                    <base:selectSiteAndSiteType 
                    name="<%= DistrictLostReportForm.FIELD_SITE_LIMITER%>" 
                    selectedSiteID="<%=form.getSiteLimiter()%>"
                    includeForLibrarySites="false"
                    includeForTextbookSites="true"
                    includeForAssetSites="false"
                    includeDistrictWarehouseSiteType="false"
                    onChangeAction="siteLimiterTypeSelected()" />
                </td>
            </tr>
            </table>
        </base:isNotStateContext>
   </logic:equal>
   <logic:equal name="<%= DistrictLostReportForm.FORM_NAME %>" property="printerFriendly" value="true">
        <table>
            <base:isStateContext>
                <tr>
                    <td class="ColRowBold tdAlignRight" nowrap>
                        District 
                    </td>
                    <td class="ColRow">
                        <%= form.getPrintableDistrictLimiter() %>
                    </td>
                </tr>
                <% if ( !UserContext.getMyContextName().equals(form.getDistrictContext())) { %>
                    <tr>
                        <td class="ColRowBold tdAlignRight" nowrap>
                            Site Name 
                        </td>
                        <td class="ColRow">
                            <%= form.getPrintableSiteNameLimiter() %>
                        </td>
                    </tr>
                <% } %>
            </base:isStateContext>
            <base:isNotStateContext>
            <tr>
                <td class="ColRowBold tdAlignRight" nowrap>
                    Site Name 
                </td>
                <td class="ColRow">
                    <%= form.getPrintableSiteNameLimiter() %>
                </td>
            </tr>
            </base:isNotStateContext>
        </table>
   </logic:equal>
    
    <logic:equal name="<%= DistrictLostReportForm.FORM_NAME %>" property="printerFriendly" value="false">
        <table width="100%" id="<%= DistrictLostReportForm.TABLE_PRINTER_FRIENDLY%>">
        <tr>
        <td width="100%" class="Instruction">
          To delete "<%=lostText%>" copies, use the option at the end of this list.
        </td>
        <td class="tdAlignRight">
                <base:link href="<%=form.gimmePrinterFriendlyLink() %>" target="printerFriendly" id="<%=DistrictLostReportForm.ID_PRINTER_FRIENDLY %>">
                    <base:image src="/buttons/small/printerfriendly.gif" alt="Printer Friendly" />
                </base:link>&nbsp;
        </td>
        </tr>
        </table>
    </logic:equal>
    
    <% 
        String borderColor = form.isPrinterFriendly()? "#ffffff": "#C0C0C0";
    %>
    <base:outlinedTable borderColor="<%=borderColor%>" id='<%= DistrictLostReportForm.TABLE_LOST_INFORMATION %>' width="100%">
       <%
       if ( listOfLostCounts.isEmpty() ) { %>
        <tr>
            <td class="ColRowBold" align="center">There are no <%=lostText%> copies.</td>
        </tr>
       <%} else { %>
        <tr>
            <td class="SmallColHeading"><%=(form.getStore().isStateContext())?"Date \"Billed\"" : "Marked \"Lost\"" %></td>
            <td class="SmallColHeading">Copies</td>
       </tr>
       <%
       Iterator<InventoryLostCountsVO> itr = listOfLostCounts.iterator();
       while (itr.hasNext() ) {
           InventoryLostCountsVO vo = itr.next();
       %>       
            <base:flipper key="lostCount">
                <td class="ColRow">
                    <%=vo.getDateLostAsString()%> 
                </td>
                <td class="ColRow">
                    <%=vo.getCountAsString()%> 
                </td>
            </base:flipper>
       
       <% } 
       }%>
    </base:outlinedTable>

<logic:equal name="<%= DistrictLostReportForm.FORM_NAME %>" property="printerFriendly" value="false">
    
    <% if (!listOfLostCounts.isEmpty() ) {%>
        <base:spanIfAllowed permission="<%=Permission.CAT_DELETE_TEXTBOOK_COPIES %>" collectionType="<%=CollectionType.TEXTBOOK %>">
            <table width="100%">
            <tr>
                <td class="SmallColHeading" valign="bottom">
                    Delete all copies marked "<%=lostText%>" on or before
                    &nbsp;
                    <base:date 
                        buttonName = "<%=DistrictLostReportForm.BUTTON_CALENDAR_DELETE_LOST_DATE%>"
                        fieldName = "<%=DistrictLostReportForm.FIELD_DELETE_LOST_DATE%>"
                        dateValue = "<%=form.getDeleteDate()%>"
                        altText = "Set Delete On/Before Date"
                    />                            
                </td>
                <td class="tdAlignRight">
                    <base:genericButton src="/buttons/large/deleteall.gif" absbottom="true" alt="Delete lost" name="<%= DistrictLostReportForm.BUTTON_DELETE_LOST %>" />
                </td>
            </tr>
            </table>
        </base:spanIfAllowed>
    
    <BR>
    <a href="#TheTop"><base:image src="/icons/general/top.gif" height="16" width="19" alt="Top of page"/></a>
    <%} %>
</logic:equal>
<script language="JavaScript" type="text/javascript">
<!--
function siteLimiterTypeSelected() {
    document.<%=DistrictLostReportForm.FORM_NAME%>.submit();
}

function submitDropDownDistrict() {
    document.<%=DistrictLostReportForm.FORM_NAME%>.submit();
}

function submitDropDownSite() {
    document.<%=DistrictLostReportForm.FORM_NAME%>.submit();
}


//-->
</script>



</td>
</tr>
</table>
</base:form>
