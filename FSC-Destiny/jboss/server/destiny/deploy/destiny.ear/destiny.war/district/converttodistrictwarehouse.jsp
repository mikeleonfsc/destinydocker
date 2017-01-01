<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="com.follett.fsc.common.CurrencyValue"%>
<%@page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>

<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag"%>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LookupSpecs"%>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.ConvertToDistrictWarehouseForm"%>

<bean:define id="form" name="<%=ConvertToDistrictWarehouseForm.FORM_NAME%>" type="ConvertToDistrictWarehouseForm"/>
<% LocaleHelper lh = UserContext.getMyContextLocaleHelper(); %>
<base:messageBox strutsErrors="true"/>

<base:form action="/district/servlet/handleconverttodistrictwarehouseform.do">
<logic:equal name="<%= ConvertToDistrictWarehouseForm.FORM_NAME %>" property="<%=ConvertToDistrictWarehouseForm.PARM_CONFIRM_CONVERT_MESSAGE%>" value="true">
    <input type="hidden" name="<%=ConvertToDistrictWarehouseForm.PARM_CONFIRM_CONVERT_MESSAGE%>" value="true"/>
    <base:messageBox showRedBorder="true">
        <% if (form.blockMessage()) { %>
        <tr class="tdAlignCenter">
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td>
                <span class="ColRowBold"><%=form.getSiteName(form.getSiteID())%> cannot be converted at this time.</span><br> 
                <br>
                <% if (form.getSiteStatisticsVo().getNumCheckouts().longValue() > 0) { %>
                    <span class="ColRow">Checkouts currently exist and must be checked in.<br>
                    Checkouts: <%= form.getSiteStatisticsVo().getNumCheckouts()%></span><br>
                <% } %>
                <% if (form.getSiteStatisticsVo().getNumFines().longValue() > 0) { %>
                    <span class="ColRow">Fines currently exist and must be resolved.<br>
                        Fines: <%= form.getSiteStatisticsVo().getNumFines()%>/<nobr><%= lh.formatCurrency(new CurrencyValue(form.getSiteStatisticsVo().getSumFines(), lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT) %></nobr>
                    </span><br>
                <% } %>
                <% if (form.getSiteStatisticsVo().getNumCheckouts().longValue() > 0) { %>
                    <span class="ColRowBold"><br>Off-site checkouts for local patrons are not included in the totals.</span>
                <% } %>
                <span class="ColRowBold"><br>Note: Run the Current Checkouts/Fines report to list the outstanding transactions.</span> 
            </td>
        </tr>
        <% } else { %>
        <html:hidden property="siteID"/>
        <tr class="tdAlignCenter">
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td>
                <span class="ColRowBold">This process cannot be reversed.</span><br> 
                <br>
                <% if (form.getSiteStatisticsVo().isOnlyOneTextbookSiteExistsInDistrictAndYouWantToConvertIt()) { %>
                    <span class="ColRow"><%=form.getSiteName(form.getSiteID())%> is the only textbook site in your district. 
                    Once converted to the District Warehouse, this site will no longer be able to circulate textbooks, maintain patrons or classes. 
                    </span>
                    <br><br>
                <% } %>
                
                <% if (form.getSiteStatisticsVo().isOnlyOneResourceSiteExistsInDistrictAndYouWantToConvertIt()) { %>
                    <span class="ColRow"><%=form.getSiteName(form.getSiteID())%> is the only resource site in your district. 
                    Once converted to the District Warehouse, this site will no longer be able to circulate resources, maintain patrons or classes. 
                    </span>
                    <br><br>
                <% } %>
                
                <span class="ColRow">The current site contains information that will not be converted to the District Warehouse:<br>
                    Patrons:   <%=form.getSiteStatisticsVo().getNumPatrons()%></span><br>
                <% if (form.getSiteStatisticsVo().getNumHoldsReservesBookings().longValue() > 0) { %>
                    <span class="ColRow">Holds/Reserves/Bookings: <%= form.getSiteStatisticsVo().getNumHoldsReservesBookings()%></span><br>
                <% } %>
                <% if (form.getSiteStatisticsVo().getNumTextbookClassSections().longValue() > 0) { %>
                    <span class="ColRow">Class Sections: <%= form.getSiteStatisticsVo().getNumTextbookClassSections()%></span><br>
                <% } %>
                <br>
                <span class="ColRowBold">Are you sure you want to proceed?</span><br> 
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td valign="baseline" align="center" class="ColRow">
                <base:yesNo buttonYesName="<%=ConvertToDistrictWarehouseForm.BUTTON_CONFIRM_CONVERSION%>" buttonNoName="<%=ConvertToDistrictWarehouseForm.BUTTON_CANCEL_CONVERSION%>"/>
            </td>
        </tr>
        <% } %>
    </base:messageBox>
</logic:equal>
<base:outlinedTable id='<%= form.ID_MAIN_TABLE %>' borderColor="#C0C0C0" width="95%">
    <tr>
        <td class="TableHeading" colspan="2">
            <bean:write name="<%=form.FORM_NAME%>" property="pageHeaderTitle"/>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold" colspan="2" align="center">
            Select Site&nbsp;            
                        <base:selectSite 
                            selectedSiteID="<%= String.valueOf(form.getSiteID())%>"
                            useSelectASite="true"
                            submitOnChange="false" 
                            mode="<%=SelectSiteTag.MODE_GET_ONLY_TEXTBOOK_AND_OR_ASSET_ONLY_SITES%>"
                            name="<%=ConvertToDistrictWarehouseForm.FIELD_SITE_ID%>" 
                            includeAllLibraries="false"
                            includeLibrarySites="false"
                            includeTextbookSites="true"
                            includeMediaSites="false"
                            disabled="<%= form.isSiteControlDisabled() %>"  
                            includeAssetSites="true"/>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">
            <base:okButton />
        </td>
        <td class="ColRowBold">
            <base:cancelButton/>
        </td>
    </tr>
    <tr>
        <td align="center" colspan="2" class="ColRowBold">
            <%=GenericForm.getLastBackupDisplayMsg(true)%>
        </td>
    </tr>
</base:outlinedTable>
</base:form>
