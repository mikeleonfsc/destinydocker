<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.InventoryStateProgressDetailsForm" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.ejb.InventoryFacadeSpecs" %>
<%@ page import="com.follett.fsc.destiny.util.URLHelper" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%@page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%><base:messageBox strutsErrors="true"/>

<%
    InventoryStateProgressDetailsForm form = (InventoryStateProgressDetailsForm)request.getAttribute(InventoryStateProgressDetailsForm.FORM_NAME);
%>

<base:form action="/backoffice/servlet/handleinventorystateprogressdetailsform.do">

<% if (form.getPartialIDToRevive() != null || form.getPartialIDToReset() != null || form.isFinalize()) { %>
    <html:hidden property="expandedDistrictName"/>
    <html:hidden property="sortByDistrict"/>
    <html:hidden property="sortDistrictColumn"/>
    <html:hidden property="sortPrevDistrictColumn"/>
    <html:hidden property="descendingDistrict"/>
    <html:hidden property="descendingPrevDistrict"/>
    <html:hidden property="sortSiteColumn"/>
    <html:hidden property="sortPrevSiteColumn"/>
    <html:hidden property="descendingSite"/>
    <html:hidden property="descendingPrevSite"/>
    <html:hidden property="statePartialID"/>
<%} %>


<% if (form.isFinalize()) { %>
    <base:messageBox>
    <tr>
        <td align="center" class="ColRowBold">This will finalize the inventory at <%=ResponseUtils.filter( form.getPartialInventoryName() )  %>.</td>
    </tr>
    <tr>
        <td class="ColRowBold">
            <%=form.gimmeFinalizationCounts() %>
        </td>
    </tr>
    <tr>
        <td align="center" class="ColRow" nowrap>
            <table id="<%=InventoryStateProgressDetailsForm.MARK_LOST_RADIO_HOUSE %>"><tr><td class="ColRow">
            <html:radio property="<%= InventoryStateProgressDetailsForm.FIELD_MARK_LOST %>" value="true"/><%= form.gimmeMarkLostMessage() %><br/>
            </td></tr>
            <tr><td class="ColRow">
            <html:radio property="<%= InventoryStateProgressDetailsForm.FIELD_MARK_LOST %>" value="false"/>Ignore them (do not process)
            </td></tr></table>
        </td>
    </tr>    
    <tr>
        <td align="center" class="ColRow">Are you sure you want to finalize this inventory?</td>
    </tr>
    <tr>
        <td align="center" class="ColRow">
            <base:yesNo/>
        </td>
    </tr>
    </base:messageBox>
    
    <html:hidden property="partialIDToFinalize"/>
    <html:hidden property="finalize"/>
<%} else { %>
    <html:hidden property="<%=InventoryStateProgressDetailsForm.FIELD_MARK_LOST %>"/>
<% }%>
<% if (form.getPartialIDToRevive() != null ) { %>
    <base:messageBox>
    <tr>
        <td align="center" class="ColRowBold">You should only revive this inventory if there is more work for <%=ResponseUtils.filter( form.getPartialInventoryName() )  %> to complete.</td>
    </tr>
    <html:hidden property="<%=InventoryStateProgressDetailsForm.PARAM_SCHEDULED_ENDDATE_IN_THE_PAST%>"/>
    <%if ( form.isScheduledEndDateInThePast() ) {%> 
    <tr>
        <td align="center" class="ColRowBold">Inventory Ends
        <base:date 
            fieldName="<%=InventoryStateProgressDetailsForm.FIELD_SCHEDULED_END_DATE %>"
            buttonName="<%=InventoryStateProgressDetailsForm.BUTTON_NEW_SCHEDULED_END_DATE %>"
            dateValue = "<%=form.getScheduledEndDate()%>"
            altText = "<%=InventoryStateProgressDetailsForm.ALT_CHANGE_SCHEDULED_END_DATE%>"
            />
        </td>
    </tr>
    <%} %>

    <tr>
        <td align="center" class="ColRow">Are you certain you want to revive this inventory?</td>
    </tr>
    <tr>
        <td align="center" >
            <base:yesNo/>
        </td>
    </tr>
    </base:messageBox>
    
    <html:hidden property="partialIDToRevive"/>
   
<% } %>
<% if (form.getPartialIDToReset() != null ) { %>
    <base:messageBox>
    <tr>
        <td align="center" class="ColRowBold">If you reset this inventory, <%=form.getPartialInventoryName() %> will be required to repeat their entire inventory.</td>
    </tr>
    <tr>
        <td align="center" class="ColRow">Are you certain you want to reset this inventory?</td>
    </tr>
    <tr>
        <td align="center" >
            <base:yesNo/>
        </td>
    </tr>
    </base:messageBox>
    
    <html:hidden property="<%=form.PARAM_PARTIAL_ID_TO_RESET %>"/>
   
<% } %>

<base:outlinedTable borderColor="#c0c0c0" id="<%=InventoryStateProgressDetailsForm.TABLE_MAIN%>" width="100%">

<tr>
    <td class="TableHeading" colspan="4">
        <%=ResponseUtils.filter(form.getName()) %> - Started <%=form.getDateStarted() %>
    </td>
    <td class="TableHeading">
        <base:link page='<%=form.getLinkToForm(true, true) +  "&finalize=true&partialInventoryName=" + URLHelper.encodeURL(form.gimmeSitesToApprove())%>'>
            <base:image src="/buttons/large/finalizeapproved.gif" alt="<%=InventoryStateProgressDetailsForm.ALT_FINALIZE_ALL_APPROVED %>"/>
        </base:link>
    </td>
</tr>
<!-- District Row Header if we have data -->
<%
if(form.getListOfInventories().size() > 0 ){
%>
<tr>
    <td class="SmallColHeading" valign="bottom" colspan="2">
        <%= form.getDistrictResortLink(InventoryFacadeSpecs.SORT_PROGRESS_DETAILS_BY_NAME, "District")%>
    </td>
    <td class="SmallColHeading" valign="bottom">
        <%= form.getDistrictResortLink(InventoryFacadeSpecs.SORT_PROGRESS_DETAILS_BY_STATUS, "Status")%>
    </td>
    <td class="SmallColHeading" valign="bottom">
        <%= form.getDistrictResortLink(InventoryFacadeSpecs.SORT_PROGRESS_DETAILS_BY_PERCENT_SCANNED, "% Scanned")%>
    </td>
    <td class="SmallColHeading" valign="bottom">
        &nbsp;
    </td>
</tr>
<!-- If district row has data iterate against it -->
<logic:iterate indexId="flipper" id="districtRow" name="<%=InventoryStateProgressDetailsForm.FORM_NAME%>" property="listOfInventories" type="com.follett.fsc.destiny.session.backoffice.data.InventoryProgressDistrictRowVO">
    <tr <%=( ( (1 & flipper.intValue())==0)? "bgColor=\"#E8E8E8\"" : "" )%> >
        <td class="ColRowBold" valign="top" colspan="2"><%="<a name=" + districtRow.getAnchor() + "></a>" + ResponseUtils.filter( districtRow.getDistrictName() ) %></td>
                                    
        <td valign="top">
            <span class="ColRowBold"><%=ResponseUtils.filter( districtRow.getStatus() ) %></span>
            <%if ( districtRow.getNumberOfApprovedInventories() > 0) { %> 
                <%="<br><span class=\"ColRow\">" + String.valueOf(districtRow.getNumberOfApprovedInventories()) + " Approved</span>" %>
            <% } %>
            <%if ( districtRow.getNumberOfBilledInventories() > 0) { %> 
                <%="<br><span class=\"ColRow\">" + String.valueOf(districtRow.getNumberOfBilledInventories()) + " Billed</span>" %>
            <% } %>
        </td>
        <td class="ColRow" valign="top"><%=form.getPercentScanned(districtRow.getTotalAccountedFor(), districtRow.getTotalUnaccountedFor())%></td>
        <td class="SmallColRow" valign="top">
        <%
        if(districtRow.getDistrictName().equals(form.getExpandedDistrictName())){
            //show less
            %>
            <a class="DetailLink" href='<%=form.getLinkToForm(true, false) + "#" + districtRow.getAnchor()%>'>Show Less&nbsp;<img src='<%=UserContext.getMyContextLocaleHelper().getLocalizedImagePath("/icons/general/showless.gif")%>' border="0"></a> 
            <% 
        }else{
            //show more
            %>
            <a class="DetailLink" href='<%=form.getLinkToForm(true, false) +  "&expandedDistrictName=" + URLHelper.encodeURL(districtRow.getDistrictName()) + "#" + districtRow.getAnchor()%>'>Show More&nbsp;<img src='<%=UserContext.getMyContextLocaleHelper().getLocalizedImagePath("/icons/general/showmore.gif")%>' border="0"></a> 
            <%
        }
        %>
        </td>
                            
    </tr>
    <!-- if we're the expanded district, iterate through sites -->
    <%
        if(districtRow.getDistrictName().equals(form.getExpandedDistrictName())){
    %>
    <tr <%= ( (flipper.intValue() % 2 == 1)? "bgColor=\"#E8E8E8\"" : "" )%> >
        <td>&nbsp;</td>
        <td class="SmallColHeading" valign="bottom">
            <%= form.getSiteResortLink(InventoryFacadeSpecs.SORT_PROGRESS_DETAILS_BY_NAME, "Site")%>
        </td>
        <td class="SmallColHeading" valign="bottom">
            <%= form.getSiteResortLink(InventoryFacadeSpecs.SORT_PROGRESS_DETAILS_BY_STATUS, "Status")%>
        </td>
        <td class="SmallColHeading" valign="bottom">
            <%= form.getSiteResortLink(InventoryFacadeSpecs.SORT_PROGRESS_DETAILS_BY_PERCENT_SCANNED, "% Scanned")%>
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
            <td class="ColRow" valign="top"><%=siteRow.getSiteLevelStatus()%></td>
            <td class="ColRow" valign="top"><%=form.getPercentScanned(siteRow.getApihValue().getAccountedFor(), siteRow.getApihValue().getUnaccountedFor())%></td>
            <td class="SmallColHeading" valign="top">
            <A name='<%="anchor_" + siteRow.getApihValue().getPartialID()%>'/>
            
                <% boolean buttonOut = false; %>
                <%
                    if (siteRow.isInventoryHasBeenFinished() && siteRow.getApihValue().getFinalizedDate() != null && Boolean.TRUE.equals(siteRow.getApihValue().getMarkedLost())) {
                %>
                    <base:link page='<%= "/backoffice/servlet/presentexamineinventoryform.do?useArchived=true&partialID=" + siteRow.getApihValue().getPartialID()%>'>
                        <base:image src="/buttons/small/examine.gif" alt="<%=InventoryStateProgressDetailsForm.ALT_EXAMINE %>"/>
                        <% buttonOut = true; %>
                    </base:link>
                <%
                } 
                %>
                <%
                    if (!siteRow.isInventoryHasBeenFinished() && siteRow.getApihValue().getApprovedDate() == null) {
                %>
                    <base:link page='<%= "/backoffice/servlet/presentinventorydetailsform.do?siteName="+URLHelper.encodeURL(siteRow.getSiteName())+"&viewingFromMemberStandpoint=true&collectionType="+ CollectionType.TEXTBOOK + "&inventoryID=" + siteRow.getApihValue().getPartialID()%>'>
                        <% if ( buttonOut ) { out.println("<br>"); }%>
                        <base:image src="/buttons/small/viewsmall_70.gif" alt="<%=InventoryStateProgressDetailsForm.ALT_VIEW %>"/>
                        <% buttonOut = true; %>
                    </base:link>
                    <%if(form.getStore().isStateContext() ){ %>
                        <base:link page='<%=form.getLinkToForm(true, true) + "&" + form.PARAM_PARTIAL_ID_TO_RESET + "=" + siteRow.getApihValue().getPartialID() + "&" + form.PARAM_RESET_SITE_NAME +"=" + ResponseUtils.filter( siteRow.getSiteName()) + "&partialInventoryName="+URLHelper.encodeURL(districtRow.getDistrictName() + " - " + siteRow.getSiteName())%>'>
                            <% if ( buttonOut ) { out.println("<br>"); }%>
                            <base:image src="/buttons/small/reset.gif" alt="<%=InventoryStateProgressDetailsForm.ALT_RESET %>"/>
                            <% buttonOut = true; %>
                        </base:link>
                    <%} 
                } 
                %>
                <%
                    if (siteRow.isInventoryHasBeenFinished() && siteRow.getApihValue().getFinalizedDate() == null) {
                %>
                    <base:showHideTag id='<%="buttonsHideExam" + siteRow.getApihValue().getPartialID() %>' showTextOnNewLine="false">
                        <base:link page='<%= "/backoffice/servlet/presentexamineinventoryform.do?partialID=" + siteRow.getApihValue().getPartialID()%>' >
                            <% if ( buttonOut ) { out.println("<br>"); }%>
                            <base:image src="/buttons/small/examine.gif" alt="<%=InventoryStateProgressDetailsForm.ALT_EXAMINE %>" onClick='<%="hideElementbuttonsHideExam" + siteRow.getApihValue().getPartialID()+"()" %>' />
                            <% buttonOut = true; %>
                        </base:link>
                    </base:showHideTag>
                    <br style="clear:both">
                    <% if ( siteRow.getApihValue().getApprovedDate() == null ) { %>
                    <base:showHideTag id='<%="buttonsHideApprove" + siteRow.getApihValue().getPartialID() %>' showTextOnNewLine="false">
                        <base:link page='<%=form.getLinkToForm(true, true) +  "&partialIDToApprove=" + siteRow.getApihValue().getPartialID()%>'>
                            <base:image src="/buttons/small/approve_70.gif" alt="<%=InventoryStateProgressDetailsForm.ALT_APPROVE %>" onClick='<%="hideElementbuttonsHideApprove" + siteRow.getApihValue().getPartialID()+"()" %>'/>
                        </base:link>
                    </base:showHideTag>
                        <br style="clear:both">
                    <% } else { %>
                    <base:showHideTag id='<%="buttonsHideFinal" + siteRow.getApihValue().getPartialID() %>' showTextOnNewLine="false">
                        <base:link page='<%=form.getLinkToForm(true, true) +  "&finalize=true&partialIDToFinalize=" + siteRow.getApihValue().getPartialID() +"&partialInventoryName="+URLHelper.encodeURL(districtRow.getDistrictName()
                                +" - " + siteRow.getSiteName())%>'>
                            <base:image src="/buttons/small/finalize.gif" alt="<%=InventoryStateProgressDetailsForm.ALT_FINALIZE %>" onClick='<%="hideElementbuttonsHideFinal" + siteRow.getApihValue().getPartialID()+"()" %>'/>
                        </base:link>
                    </base:showHideTag>
                    <br style="clear:both">
                    <% } %>
                    <base:showHideTag id='<%="buttonsHideRevive"+ siteRow.getApihValue().getPartialID() %>' showTextOnNewLine="false">
                        <base:link page='<%=form.getLinkToForm(true, true) 
                            +"&partialIDToRevive=" + siteRow.getApihValue().getPartialID()
                            +form.gimmeScheduledEndDateParm(siteRow)                                 
                            +"&partialInventoryName="+URLHelper.encodeURL(districtRow.getDistrictName()
                                +" - " + siteRow.getSiteName())%>'>
                            <base:image src="/buttons/small/revive.gif" alt="<%=InventoryStateProgressDetailsForm.ALT_REVIVE%>" onClick='<%="hideElementbuttonsHideRevive"+ siteRow.getApihValue().getPartialID() +"()" %>'/>
                        </base:link>
                    </base:showHideTag>
                <% } else { %>
                &nbsp;
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
    <td class="ColRow" colspan="7">
        There are no inventories to display.
    </td>
</tr>
<%
}
%>
</base:outlinedTable>

</base:form>

