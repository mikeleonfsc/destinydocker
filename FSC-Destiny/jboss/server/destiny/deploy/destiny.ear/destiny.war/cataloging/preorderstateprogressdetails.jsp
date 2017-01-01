<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.PreOrderStateProgressDetailsForm" %>
<%@ page import="com.follett.fsc.destiny.util.URLHelper" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.OrdersSpecs"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.ejb.data.StatePreorderViewHeadingVO"%>
<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%@page import="com.follett.fsc.destiny.session.cataloging.ejb.data.StatePreorderViewSiteVO"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.ejb.data.StatePreorderViewVO"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.common.CurrencyValue"%><base:messageBox strutsErrors="true"/>

<%
    PreOrderStateProgressDetailsForm form = (PreOrderStateProgressDetailsForm)request.getAttribute(PreOrderStateProgressDetailsForm.FORM_NAME);
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>
<base:form action="/cataloging/servlet/handlepreorderstateprogressdetailsform.do">
<script language="JavaScript" type="text/javascript">
<!--
function submitDropDown() {
    document.<%=PreOrderStateProgressDetailsForm.FORM_NAME%>.<%=PreOrderStateProgressDetailsForm.PARAM_CHANGED_GROUP_BY%>.value = "true";
    document.<%=PreOrderStateProgressDetailsForm.FORM_NAME%>.<%=PreOrderStateProgressDetailsForm.PARAM_SORT_BY_DISTRICT%>.value = "false";
    document.<%=PreOrderStateProgressDetailsForm.FORM_NAME%>.submit();
}
//-->
</script>

    <html:hidden property="displayInRed"/>
    <html:hidden property="changedGroupBy"/>
    <html:hidden property="expandedHeadingName"/>
    <html:hidden property="orderIDToRevive"/>
    <html:hidden property="doReviveMessage"/>
    <html:hidden property="orderIDToApprove"/>
    <html:hidden property="doFinalizeMessage"/>
    <html:hidden property="viewIDToApproveAll"/>
    <html:hidden property="doApproveMessage"/>
    <html:hidden property="doApproveAllMessage"/>
    <html:hidden property="sortByDistrict"/>
    <html:hidden property="sortDistrictColumn"/>
    <html:hidden property="sortPrevDistrictColumn"/>
    <html:hidden property="descendingDistrict"/>
    <html:hidden property="descendingPrevDistrict"/>
    <html:hidden property="sortSiteColumn"/>
    <html:hidden property="sortPrevSiteColumn"/>
    <html:hidden property="descendingSite"/>
    <html:hidden property="descendingPrevSite"/>
    <html:hidden property="showMoreLinkPressed"/>
    <html:hidden property="adoptionYear"/>

<% if (form.isDoReviveMessage()) { %>
        <html:hidden property="<%= PreOrderStateProgressDetailsForm.PARAM_DO_REVIVE_MESSAGE %>"/>
    <base:messageBox>
    <tr>
        <td align="center" class="ColRowBold">You should only revive this Pre-order if there is more work to be done for the site.</td>
    </tr>
    <tr>
        <td align="center" class="ColRow">Are you certain you want to revive this Pre-order?</td>
    </tr>
    <tr>
        <td align="center" >
            <base:yesNo/>
        </td>
    </tr>
    </base:messageBox>
    
    <html:hidden property="orderIDToRevive"/>
   
<% } %>
<% if (form.isDoApproveMessage()) { %>
        <base:messageBox showRedBorder="true">
            <tr>
                <td valign="top">
                    <%= MessageBoxTag.getCAUTION_IMAGE_HTML() %>
                </td>
                <% if( form.getUnmatchedValues() > 0 ) { %>
                <td align="center" class = "ColRowBold">
                Number of titles which have unmatched values from Quantity Requested to Quantity Ordered:<%=form.getUnmatchedValues() %>
                <br>Are you certain you want to approve this Pre-order?
                </td>
                <%} else {%>
                <td class="ColRowBold">
                    Are you certain you want to approve this Pre-order?
                </td>
                <%} %>
            </tr>
            <!-- todo make sure that the AMOUNT is NOT zero -->
                <tr>
                    <td align="center" class="ColRow" colspan="2">
                        <base:yesNo
                        buttonYesName="<%=PreOrderStateProgressDetailsForm.BUTTON_APPROVE_YES %>" 
                        buttonNoName="<%=PreOrderStateProgressDetailsForm.BUTTON_APPROVE_NO %>"/>
                    </td>
                </tr>
                
        </base:messageBox>
<% } %>
<% if (form.isDoApproveAllMessage()) { %>
        <base:messageBox showRedBorder="true">
            <tr>
                <td valign="top">
                    <%= MessageBoxTag.getCAUTION_IMAGE_HTML() %>
                </td>
                <td class="ColRowBold">
                    Are you certain that you want to approve all of the 'Submitted' Pre-orders for the selected 
                    <%= form.getGroupBy() == StatePreorderViewVO.DISPLAY_TYPE_DISTRICT ? " district" : " site type"%>?
                </td>
            </tr>
            <!-- todo make sure that the AMOUNT is NOT zero -->
                <tr>
                    <td align="center" class="ColRow" colspan="2">
                        <base:yesNo
                        buttonYesName="<%=PreOrderStateProgressDetailsForm.BUTTON_APPROVE_ALL_YES %>" 
                        buttonNoName="<%=PreOrderStateProgressDetailsForm.BUTTON_APPROVE_ALL_NO %>"/>
                    </td>
                </tr>
                
        </base:messageBox>
<% } %>
<% if (form.getApproveAllMessage() != null) { %>
        <base:messageBox showRedBorder="true">
            <tr>
                <td valign="top">
                    <%= MessageBoxTag.getCAUTION_IMAGE_HTML() %>
                </td>
                <td class="ColRowBold">
                    <%= form.getApproveAllMessage() %>
                </td>
            </tr>
        </base:messageBox>
<% } %>
<% if (form.isDoFinalizeMessage()) { %>
        <base:messageBox showRedBorder="true">
            <tr>
                <td valign="top">
                    <%= MessageBoxTag.getCAUTION_IMAGE_HTML() %>
                </td>
                <td class="ColRowBold" align="center">
                    <%= form.retrieveFinalizeConfirmationMessage()%>
                </td>
            </tr>
                <tr>
                    <td align="center" class="ColRow" colspan="2">
                        <base:yesNo
                        buttonYesName="<%=PreOrderStateProgressDetailsForm.BUTTON_FINALIZE_YES %>" 
                        buttonNoName="<%=PreOrderStateProgressDetailsForm.BUTTON_FINALIZE_NO %>"/>
                    </td>
                </tr>
                
        </base:messageBox>
<% } %>
<base:outlinedTableAndTabsWithinThere id="<%=PreOrderStateProgressDetailsForm.TABLE_MAIN%>" selectedTab="<%=PreOrderStateProgressDetailsForm.TAB_PRE_ORDER%>" tabs="<%=form.getTabs()%>" width="100%">
<%
if(form.getListOfPreOrderHeadings().size() > 0 ){
%>
<tr>
    <td class="TableHeading">
       Pre-orders for Adoption Year&nbsp;<%=form.getAdoptionYear()%>
    </td>

    <td class="TableHeading tdAlignRight">
    <%
         if(form.showFinalizeButton()){
    %>
        <base:genericButton src="/buttons/large/finalizepartial.gif"  absbottom="true" alt="<%= PreOrderStateProgressDetailsForm.ALT_FINALIZE_ALL_APPROVED %>" name="<%= PreOrderStateProgressDetailsForm.BUTTON_FINALIZE_ALL_APPROVED %>"/>
    <% } else { %>
          &nbsp;
    <% } %>
    </td>
</tr>
<tr>
    <td class="ColRowBold" valign="bottom" colspan="2">
        Group By&nbsp;
        <html:select property="<%=PreOrderStateProgressDetailsForm.FIELD_GROUP_BY %>" onchange="submitDropDown()">
            <html:option value='<%=""+StatePreorderViewVO.DISPLAY_TYPE_DISTRICT%>'>District</html:option>
            <html:option value='<%=""+StatePreorderViewVO.DISPLAY_TYPE_SITE_TYPE%>'>Site Type</html:option>
        </html:select>
    </td>
</tr>
<!-- District Row Header if we have data -->
<tr>
    <td width="100%" colspan="2">
        <table id=<%=PreOrderStateProgressDetailsForm.TABLE_GROUP_BY_LIST %> width="100%" cellpadding="5" cellspacing="0">
            <tr>
                <td class="SmallColHeading" valign="bottom">
                    <%= form.getDistrictResortLink(StatePreorderViewHeadingVO.SORT_DISPLAY_TEXT, 
                        form.getGroupBy() == StatePreorderViewVO.DISPLAY_TYPE_DISTRICT ? "District" : "Site Type")%>
                </td>
                <td class="SmallColHeading tdAlignRight" valign="bottom">
                    <%= form.getDistrictResortLink(StatePreorderViewHeadingVO.SORT_DISPLAY_STATUS, "Status")%>
                </td>
                <td class="SmallColHeading tdAlignRight" valign="bottom">
                    <%= form.getDistrictResortLink(StatePreorderViewHeadingVO.SORT_TOTAL_AMOUNT, "Amount")%>
                </td>
                <td class="SmallColHeading" valign="bottom">
                    &nbsp;
                </td>
            </tr>
            <!-- If district row has data iterate against it -->
        <logic:iterate indexId="flipper" id="headingRow" name="<%=PreOrderStateProgressDetailsForm.FORM_NAME%>" property="listOfPreOrderHeadings" type="com.follett.fsc.destiny.session.cataloging.ejb.data.StatePreorderViewHeadingVO">
            <%
                String additionalFontData = "";
                String additionalEndFontData = "";

                if(form.isDisplayInRed() && (headingRow.getTotalSitesApproved() != headingRow.getTotalSites())){ 
                    additionalFontData = "<font color=\"#CC0000\">";
                    additionalEndFontData = "</font>";
                }
            %>
            <base:flipper key="preorder">
                <td class="ColRowBold" valign="top" width="100%">
                    <%=additionalFontData + "<a name=" + headingRow.getViewID() + "></a>" + ResponseUtils.filter( headingRow.getDisplayText() ) + additionalEndFontData%>
                </td>
                                            
                <td class="tdAlignRight" valign="top">
                    <span class="ColRowBold"><%=additionalFontData + headingRow.getTotalSitesApproved()%>&nbsp;of&nbsp;<%= headingRow.getTotalSites()%>&nbsp;Approved<%=additionalEndFontData%></span>
                </td>
                <td class="ColRow tdAlignRight" valign="top"><%=additionalFontData + ResponseUtils.filter(lh.formatCurrency(new CurrencyValue(new Long(headingRow.getTotalAmount()), lh.getRegionFormatCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT)) + additionalEndFontData%></td>
                <td class="SmallColRow tdAlignRight" valign="top">
                <%
                if(headingRow.getViewID().equals(form.getExpandedHeadingName())){
                    //show less
                    %>
                    <a id="<%=PreOrderStateProgressDetailsForm.BUTTON_SHOW_LESS_PREFIX + headingRow.getViewID()%>"  class="DetailLink" href='<%=form.getLinkToForm(true, true, true) +
                        "#" + headingRow.getViewID()%>'>Show&nbsp;Less&nbsp;<img src='<%=lh.getLocalizedImagePath("/icons/general/showless.gif")%>' border="0"></a> 
                    <% 
                }else{
                    //show more
                    %>
                    <a id="<%=PreOrderStateProgressDetailsForm.BUTTON_SHOW_MORE_PREFIX + headingRow.getViewID()%>" class="DetailLink" href='<%=form.getLinkToForm(true, true, true) +  
                        "&expandedHeadingName=" + headingRow.getViewID() + "#" + headingRow.getViewID()%>'>Show&nbsp;More&nbsp;<img src='<%=lh.getLocalizedImagePath("/icons/general/showmore.gif")%>' border="0"></a> 
                    <%
                }
                %>
                </td>
                <td>
                    <%if(headingRow.getTotalSitesApproved() != headingRow.getTotalSites()){ %>
                        <base:genericButton src="/buttons/small/approveall.gif" absbottom="true" alt="<%= PreOrderStateProgressDetailsForm.ALT_APPROVE_ALL %>" name="<%= PreOrderStateProgressDetailsForm.BUTTON_APPROVE_ALL_PREFIX + headingRow.getViewID()%>"/>
                    <% } else {%>
                        &nbsp;
                    <% } %>
                </td>
            </base:flipper>
            <!-- if we're the expanded district, iterate through sites -->
            <%
                if(headingRow.getViewID().equals(form.getExpandedHeadingName())){
            %>
            <tr bgcolor="#FFFFFF" align="center">
                <td colspan="7" width="95%">
                    <table id=<%=PreOrderStateProgressDetailsForm.TABLE_SITE_LIST %> width="95%" cellpadding="4" cellspacing="0" border="0" align="center">
                        <tr>
                            <td class="SmallColHeading" valign="bottom">
                                <%= form.getSiteResortLink(StatePreorderViewSiteVO.SORT_SITE_NAME, "Site")%>
                            </td>
                            <td class="SmallColHeading" valign="bottom">
                                 Grades
                            </td>
                            <td class="SmallColHeading tdAlignRight" valign="bottom">
                                <%= form.getSiteResortLink(StatePreorderViewSiteVO.SORT_STATUS, "Status")%>
                            </td>
                            <td class="SmallColHeading tdAlignRight" valign="bottom">
                                <%= form.getSiteResortLink(StatePreorderViewSiteVO.SORT_AMOUNT, "Amount")%>
                            </td>
                            <td class="SmallColHeading" valign="bottom" colspan="2">
                                &nbsp;
                            </td>
                        </tr>
                    <logic:iterate indexId="flipper2" id="siteRow" name="<%=PreOrderStateProgressDetailsForm.FORM_NAME%>" property="listOfSites" type="com.follett.fsc.destiny.session.cataloging.ejb.data.StatePreorderViewSiteVO">
                        <base:flipper key="preorder2">
                            <%
                                additionalFontData = "";
                                additionalEndFontData = "";
        
                                if(form.isDisplayInRed() && !StatePreorderViewSiteVO.PREORDER_STATUS_APPROVED.equals(siteRow.getStatus())){ 
                                    additionalFontData = "<font color=\"#CC0000\">";
                                    additionalEndFontData = "</font>";
                                }                             
                            %>
                            <td class="ColRow" valign="top"><%=additionalFontData + ResponseUtils.filter( siteRow.getSiteName() ) + additionalEndFontData%></td>
                            <td class="ColRow" valign="top"><%=additionalFontData + siteRow.getGradeLevels() + additionalEndFontData%></td>
                            <td class="ColRow tdAlignRight" valign="top"><%=additionalFontData + siteRow.getStatus() + additionalEndFontData%></td>
                            <%
                            if( StatePreorderViewSiteVO.PREORDER_STATUS_UNSENT.equals(siteRow.getStatus()) ){
                            %>
                            <td class="ColRow tdAlignRight" valign="top">&nbsp;</td>
                            <% } else { %>
                            <td class="ColRow tdAlignRight" valign="top"><%=additionalFontData + ResponseUtils.filter(lh.formatCurrency(new CurrencyValue(new Long(siteRow.getTotalAmount()), lh.getRegionFormatCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT)) + additionalEndFontData%></td>
                            <%} %>
                            <td class="SmallColHeading" valign="top">
                            <A name='<%="anchor_" + siteRow.getSiteName()%>'></A>
                                <%
                                if( StatePreorderViewSiteVO.PREORDER_STATUS_UNSENT.equals(siteRow.getStatus()) || StatePreorderViewSiteVO.PREORDER_STATUS_APPROVED.equals(siteRow.getStatus()) || StatePreorderViewSiteVO.PREORDER_STATUS_SUBMITTED.equals(siteRow.getStatus())){
                                %>
                                    <base:link id="<%=PreOrderStateProgressDetailsForm.LINK_EXAMINE_PREFIX + siteRow.getPreorderID()%>" page='<%= "/cataloging/servlet/presentorderrequesteditform.do?orderID=" + siteRow.getPreorderID()%>'>
                                        <base:image src="/buttons/small/examine.gif" alt="<%=PreOrderStateProgressDetailsForm.ALT_EXAMINE %>"/>
                                    </base:link>
                                <%
                                } 
                                %>
                                <%
                                if( StatePreorderViewSiteVO.PREORDER_STATUS_SUBMITTED.equals(siteRow.getStatus())) {
                                %>
                                    <br>
                                    <base:genericButton src="/buttons/small/approve_70.gif" absbottom="true" alt="<%= PreOrderStateProgressDetailsForm.ALT_APPROVE %>" name="<%= PreOrderStateProgressDetailsForm.BUTTON_APPROVE_PREFIX + siteRow.getPreorderID()%>"/>
                                <%
                                } 
                                %>
                                <%
                                if( StatePreorderViewSiteVO.PREORDER_STATUS_SUBMITTED.equals(siteRow.getStatus()) || StatePreorderViewSiteVO.PREORDER_STATUS_APPROVED.equals(siteRow.getStatus())) {
                                %>
                                    <br>
                                    <base:genericButton src="/buttons/small/revive.gif"  absbottom="true" alt="<%= PreOrderStateProgressDetailsForm.ALT_REVIVE %>" name="<%= PreOrderStateProgressDetailsForm.BUTTON_REVIVE_PREFIX + siteRow.getPreorderID()%>"/>
                                <%
                                } 
                                %>
                            
                            </td>
                            <td>&nbsp;</td>
                        </base:flipper>
                    </logic:iterate>
                </table>
            <% } %>
        </logic:iterate>
     </table>
  </td>
</tr>
<%
}else{
    if(!StringHelper.isEmptyOrWhitespace(form.getAdoptionYear())){
%>
        <tr>
            <td class="ColRowBold" colspan="7">
                There are no Pre-orders in progress.
            </td>
        </tr>
<%
    } else {
%>
        <tr>
            <td class="ColRowBold" colspan="7">
                There are no Pre-orders in progress.
            </td>
        </tr>

<%
    }
}
%>
</base:outlinedTableAndTabsWithinThere>

</base:form>

