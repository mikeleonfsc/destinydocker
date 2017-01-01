<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.ejb.InventoryFacadeSpecs" %>
<%@ page import="com.follett.fsc.destiny.util.URLHelper" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.InventoryStateCompletedDetailsForm"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>


<base:messageBox strutsErrors="true"/>

<%
    InventoryStateCompletedDetailsForm form = (InventoryStateCompletedDetailsForm)request.getAttribute(InventoryStateCompletedDetailsForm.FORM_NAME);
    boolean atState = (form.getStore().isStateContext() );
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>

<base:form action="/backoffice/servlet/handleinventorystatecompleteddetailsform.do">

<base:outlinedTable borderColor="#c0c0c0" id="<%=InventoryStateCompletedDetailsForm.TABLE_MAIN%>" width="100%">
<tr>
    <td class="TableHeading" colspan="6">
        <%=ResponseUtils.filter(form.getName()) %><%= MessageHelper.formatMessage("inventorystatecompleteddetails_Completed", form.getDateCompleted()) %>
    </td>
</tr>
<!-- District Row Header if we have data -->
<%
if(form.getListOfInventories().size() > 0 ){
%>
<%if (atState ) { %>
<tr>
    <td class="SmallColHeading" valign="bottom" colspan="2">
        <%= form.getDistrictResortLink(InventoryFacadeSpecs.SORT_PROGRESS_DETAILS_BY_NAME, "District")%>
    </td>
    <td class="SmallColHeading" valign="bottom">
        <%= form.getDistrictResortLink(InventoryFacadeSpecs.SORT_PROGRESS_DETAILS_BY_ACCOUNTED_FOR, "Accounted For")%>
    </td>
    <td class="SmallColHeading" valign="bottom">
        <%= form.getDistrictResortLink(InventoryFacadeSpecs.SORT_PROGRESS_DETAILS_BY_UNACCOUNTED_FOR, "Unaccounted For")%>
    </td>
    <td class="SmallColHeading" valign="bottom">
        <%= form.getDistrictResortLink(InventoryFacadeSpecs.SORT_PROGRESS_DETAILS_BY_CONSUMABLES_ADJUSTED, "Consumables Adjusted")%>
    </td>
    <td class="SmallColHeading" valign="bottom">
        &nbsp;
    </td>
</tr>
<%} %>
<!-- If district row has data iterate against it -->
<logic:iterate indexId="flipper" id="districtRow" name="<%=InventoryStateCompletedDetailsForm.FORM_NAME%>" property="listOfInventories" type="com.follett.fsc.destiny.session.backoffice.data.InventoryProgressDistrictRowVO">
    <%if ( atState ) { %>
        <tr <%=( ( (1 & flipper.intValue())==0)? "bgColor=\"#E8E8E8\"" : "" )%> >
            <td class="ColRowBold" valign="top" colspan="2"><%="<a name=" + districtRow.getAnchor() + "></a>" + ResponseUtils.filter( districtRow.getDistrictName() ) %></td>
                                        
            <td class="ColRow" valign="top">
            <%=districtRow.getFormattedTotalAccountedFor() %>
            </td>
            <td class="ColRow" valign="top">
            <%=districtRow.getFormattedTotalUnaccountedFor()%>
                <%if(districtRow.anySiteBilled() ) { %>
                <br><%= MessageHelper.formatMessage("inventorystatecompleteddetails_Billed", districtRow.getFormattedTotalEstimatedBillForMarkedLostSitesOnly()) %>
                <% } %>
            </td>
            <td class="ColRow" valign="top">
            <%=districtRow.getFormattedTotalConsumablesAdjusted()%>
            </td>
            <td class="SmallColRow" valign="top">
            <%
            if(districtRow.getDistrictName().equals(form.getExpandedDistrictName())){
                //show less
                %>
            <a class="DetailLink" href='<%=form.getLinkToForm(true, false) + "#" + districtRow.getAnchor()%>'><%= MessageHelper.formatMessage("inventorystatecompleteddetails_ShowLess") %>&nbsp;<img src='<%=UserContext.getMyContextLocaleHelper().getLocalizedImagePath("/icons/general/showless.gif")%>' border="0"></a> 
                <% 
            }else{
                //show more
                %>
            <a class="DetailLink" href='<%=form.getLinkToForm(true, false) +  "&expandedDistrictName=" + URLHelper.encodeURL(districtRow.getDistrictName()) + "#" + districtRow.getAnchor()%>'><%= MessageHelper.formatMessage("inventorystatecompleteddetails_ShowMore") %>&nbsp;<img src='<%=UserContext.getMyContextLocaleHelper().getLocalizedImagePath("/icons/general/showmore.gif")%>' border="0"></a> 
                <%
            }
            %>
            </td>
                                
        </tr>
     <%} %>
    <!-- if we're the expanded district, iterate through sites -->
    
    <%
        if(!atState || districtRow.getDistrictName().equals(form.getExpandedDistrictName())){
    %>
    <tr <%= ( (flipper.intValue() % 2 == 1)? "bgColor=\"#E8E8E8\"" : "" )%> >
        <td>&nbsp;</td>
        <td class="SmallColHeading" valign="bottom">
            <%= form.getSiteResortLink(InventoryFacadeSpecs.SORT_PROGRESS_DETAILS_BY_NAME, "Site")%>
        </td>
        <td class="SmallColHeading" valign="bottom">
            <%= form.getSiteResortLink(InventoryFacadeSpecs.SORT_PROGRESS_DETAILS_BY_ACCOUNTED_FOR, "Accounted For")%>
        </td>
        <td class="SmallColHeading" valign="bottom">
            <%= form.getSiteResortLink(InventoryFacadeSpecs.SORT_PROGRESS_DETAILS_BY_UNACCOUNTED_FOR, "Unaccounted For")%>
        </td>
        <td class="SmallColHeading" valign="bottom">
            <%= form.getSiteResortLink(InventoryFacadeSpecs.SORT_PROGRESS_DETAILS_BY_CONSUMABLES_ADJUSTED, "Consumables Adjusted")%>
        </td>
        <td class="SmallColHeading" valign="bottom">
            &nbsp;
        </td>
    </tr>
    <logic:iterate indexId="flipper2" id="siteRow" name="districtRow" property="listOfSites" type="com.follett.fsc.destiny.session.backoffice.data.InventoryProgressRowVO">
        <tr <%
            String bgColor = "";
            
            if( (1 & flipper2.intValue())==0){
                bgColor="bgColor=\"#E8E8E8\"";
            }
            //if the principal header is white... the subheader was changed to black so start the cycle in white
            if(flipper.intValue() % 2 == 1){
                bgColor = "";
            }    
            
            out.print(bgColor);
            %> >
            <td class="ColRow" bgColor="#FFFFFF">&nbsp;</td>
            <td class="ColRow" valign="top"><%=ResponseUtils.filter( siteRow.getSiteName() ) %></td>
            <td class="ColRow" valign="top"><%=form.gimmeFormattedNumber(siteRow.getApihValue().getAccountedFor())%></td>
            <td class="ColRow" valign="top"><%=form.gimmeFormattedNumber(siteRow.getApihValue().getUnaccountedFor())%><br>
                <%=form.gimmeFormattedPrice(siteRow.getApihValue().getEstimatedBilling(), siteRow.getApihValue().getCurrencyUnitID()) %>
            </td>
            <td class="ColRow" valign="top"><%=form.gimmeFormattedNumber(siteRow.getApihValue().getConsumablesAdjusted())%></td>
            <td class="SmallColHeading" valign="top">
                <%if ( Boolean.TRUE.equals(siteRow.getApihValue().getMarkedLost())) { %>
                <base:link page='<%= "/backoffice/servlet/presentexamineinventoryform.do?useArchived=true&partialID=" + siteRow.getApihValue().getPartialID()%>' id="<%=form.ID_PREFIX_EXAMINE + siteRow.getApihValue().getPartialID()%>">
                    <base:image src="/buttons/small/examine.gif" alt="<%=InventoryStateCompletedDetailsForm.ALT_EXAMINE %>"/>
                </base:link>
                <% } %>
            </td>
        </tr>
    </logic:iterate>
    <% } %>
</logic:iterate>
<%
}else{

%>
<tr>
    <td class="ColRow" colspan="7"><%= MessageHelper.formatMessage("inventorystatecompleteddetails_ThereAreNoInventoriesToDisplay") %></td>
</tr>
<%
}
%>
</base:outlinedTable>

</base:form>

