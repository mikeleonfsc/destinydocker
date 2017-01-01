<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.DeletedAssetsForm" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.data.DeletedAssetsReportJobParams" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>

<% 
DeletedAssetsForm form = (DeletedAssetsForm)request.getAttribute("backoffice_servlet_DeletedAssetsForm");

%>
<base:form action="/backoffice/servlet/handledeletedassetsform.do">

<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=DeletedAssetsForm.BUTTON_TRAP_ENTER%>">

<base:outlinedTable id="<%=DeletedAssetsForm.TABLE_DELETEDASSETS_LABEL%>" borderColor='#C0C0C0' width="100%">
    <tr>
        <td colspan="2" class="TableHeading" nowrap>Deleted Resources
        </td>
    </tr>
   <tr>
            <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    
    <tr>
        
        <td class="ColRowBold tdAlignRight">
        Include items deleted...
        </td>
        <td class="ColRow" >
        &nbsp;
        </td>
                            
        
    </tr>
    
    
    <base:isDistrictUser>
    <tr>
        
        <td class="ColRowBold tdAlignRight">
        For
        </td>
         <td class="ColRow" >
                <base:selectSite 
                    submitOnChange="false" 
                    name="<%=DeletedAssetsForm.FIELD_REPORT_SITE_ID%>" 
                    selectedSiteID="<%=form.getReportSiteID().toString()%>" 
                    includeAllLibraries="true"
                    includeLibrarySites="false"
                    includeTextbookSites="false"
                    includeMediaSites="false"
                    includeAssetSites="true"
                    />
          </td>
                            
        
    </tr>
    </base:isDistrictUser>
    
    
    <tr>
        <td class="ColRowBold tdAlignRight">From</td>
         <td class="ColRowBold" valign="bottom" >
                <base:dateRange 
                    dateFrom="<%=form.getDateFrom()%>"
                    dateTo="<%=form.getDateTo()%>"
                />
        </td>
   
    </tr>
    
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top">
        Of Resource Type 
        </td>
        <td valign="top">
            <table>
            <tr>
                <td valign="top">
                <%= form.gimmeFormattedAssetTypeList()%> 
                </td>
                <td valign="top">
                <base:genericButton src="/buttons/large/update.gif" alt="Update Limiters" name="<%= DeletedAssetsForm.BUTTON_UPDATE_ASSETS %>" />
                </td>
                </tr>
            </table>
        </td>                   
        
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">Show</td>
            <td >
                <html:select property="<%= DeletedAssetsForm.FIELD_REPORT_TYPE %>">
                    <html:option value="<%=Integer.toString(DeletedAssetsReportJobParams.FORMAT_SUMMARY_ONLY)%>">Summary Only</html:option>
                    <html:option value="<%=Integer.toString(DeletedAssetsReportJobParams.FORMAT_DETAILS)%>">Details</html:option>
                    
                </html:select>
            </td>
        
    </tr>
    
    <tr>
            <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    
    
    
    <tr>
        <td colspan="2" align="center" class="ColRowBold">
            <base:reportButton/>
        </td>
    </tr>

</base:outlinedTable>

</base:form>
