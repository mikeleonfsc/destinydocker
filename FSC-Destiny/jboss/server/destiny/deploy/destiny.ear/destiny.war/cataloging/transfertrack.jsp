<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.*"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    TransferTrackForm form = (TransferTrackForm)request.getAttribute(TransferTrackForm.FORM_NAME);
%>

<%@page import="com.follett.fsc.destiny.util.Permission"%>

<%@page import="com.follett.fsc.destiny.session.cataloging.ejb.TransferTrackFacadeSpecs"%>
<%@page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.TransferSpecs"%>
<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.OrdersSpecs"%>



 
<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<style>
    :root {
        overflow-y: scroll !important;
    }
    
    .OrderNum {
        width: 80px;
        padding-right: .5em;
    }
    
</style>

<base:form action="/cataloging/servlet/handletransfertrackform.do">
    <html:hidden property="<%=TransferTrackForm.PARAM_SORT%>"/>
    <html:hidden property="<%=TransferTrackForm.PARAM_DESCEND%>"/>
    <html:hidden property="<%=TransferTrackForm.PARAM_CLEAR%>" value = "false"/>
    <html:hidden property="<%=GenericForm.FIELD_COLLECTION_TYPE%>"/>
    <html:hidden property="<%=TransferTrackForm.PARAM_SORTABLE_PURCHASE_ORDER%>"/>
    <html:hidden property="<%=TransferTrackForm.PARAM_DISPLAYABLE_PURCHASE_ORDER%>"/>
    <html:hidden property="<%=TransferTrackForm.PARAM_TRANSFER_TYPE%>"/>
    <html:hidden property="<%=TransferTrackForm.FIELD_CONTEXT_LIMITER_CHANGED %>" value="false"/>
    <html:hidden property="<%=TransferTrackForm.FIELD_HIDDEN_INCOMING %>" styleId = "hiddenIncomingTransfers"/>
    <html:hidden property="<%=TransferTrackForm.FIELD_HIDDEN_INCOMING_COMPLETE %>" styleId = "hiddenCompletedIncomingTransfers"/>
    <html:hidden property="<%=TransferTrackForm.FIELD_HIDDEN_OUTGOING %>" styleId = "hiddenOutgoingTransfers"/>
    <html:hidden property="<%=TransferTrackForm.FIELD_HIDDEN_OUTGOING_COMPLETE %>" styleId = "hiddenCompletedOutgoingTransfers"/>
    <html:hidden property="<%=TransferTrackForm.FIELD_HIDDEN_SITETOSITE %>" styleId = "hiddenSiteTransfers"/>
    <html:hidden property="<%=TransferTrackForm.FIELD_HIDDEN_SITETOSITE_COMPLETE %>" styleId = "hiddenCompletedSiteTransfers"/>
    <html:hidden property="<%=TransferTrackForm.FIELD_HIDDEN_DISCREPANCY %>" styleId = "hiddenDiscrepancies"/>
    
    <base:messageBox strutsErrors="true"/>
    
    <logic:equal name="<%= TransferTrackForm.FORM_NAME %>" property="<%= TransferTrackForm.PARAM_REMOVE_TRANSFER %>" value="true">
        <html:hidden property="<%= TransferTrackForm.PARAM_REMOVE_TRANSFER_ID %>" />
        <base:messageBox showRedBorder="true">
            <tr valign="top">
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td class="ColRowBold">
                    This <%=form.getTransactionDescription() %> will be deleted.
                </td>
            </tr>
            <tr valign="top">
                <td>&nbsp;</td>
                <td class="ColRowBold">
                    <bean:write name="<%= TransferTrackForm.FORM_NAME %>" property="<%= TransferTrackForm.PARAM_CONFIRMATION_MESSAGE%>"/>
                </td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td valign="baseline" align="center" class="ColRow">
                    Are you sure you want to delete this <%=form.getTransactionDescription() %>?<br>
                        <base:showHideTag id="onYes">
                            <base:yesButton onclick="hideElementonYes()"/>&nbsp;
                            <base:noButton/>
                        </base:showHideTag>
         
                </td>
            </tr>
        </base:messageBox>
    </logic:equal>



    <base:outlinedTableAndTabsWithinThere id="<%=TransferTrackForm.TABLE_MAIN%>" selectedTab="<%=TransferTrackForm.ID_TAB%>" tabs="<%=form.getTabs()%>">
       <tr>
            <td class="TableHeading"><%=form.getPageHeader() %></td>
       </tr>
        <logic:equal name="<%= TransferTrackForm.FORM_NAME %>" property="canDoReceiveByBarcodeList" value="true">
            <tr><td class="tdAlignRight">
            <% if (form.getCollectionType() == CollectionType.ASSET) {%>
                <base:genericButton src="/buttons/large/receivebarcodeditems.gif" absbottom="true" alt="<%= TransferTrackForm.ALT_RECEIVE_TEXTBOOKS_BY_BARCODE_LIST %>" name="<%= TransferTrackForm.ID_BUTTON_RECEIVE_TEXTBOOKS_BY_BARCODE_LIST %>"/>
            <% } else {%>
                <base:genericButton src="/buttons/large/receivebarcodedcopies.gif" absbottom="true" alt="<%= TransferTrackForm.ALT_RECEIVE_TEXTBOOKS_BY_BARCODE_LIST %>" name="<%= TransferTrackForm.ID_BUTTON_RECEIVE_TEXTBOOKS_BY_BARCODE_LIST %>"/>
            <% }%>
            </td></tr>
        </logic:equal>
    <logic:equal name="<%= TransferTrackForm.FORM_NAME %>" property="<%= TransferTrackForm.PARAM_EMPTY_LIST %>" value="true">
        <tr><td class="ColRowBold" align="center">
                <%= form.getNothingToReportMessage() %>
        </td></tr>    
    </logic:equal>
    <logic:equal name="<%= TransferTrackForm.FORM_NAME %>" property="<%= TransferTrackForm.PARAM_EMPTY_LIST %>" value="false">

        <%=form.outputLists() %>
    </logic:equal>
    
    <tr>
        <td><hr/></td>
    </tr>
    <logic:equal name="<%= TransferTrackForm.FORM_NAME %>" property="<%= TransferTrackForm.PARAM_EMPTY_LIST %>" value="false">
        <tr>
            <td>
                <table width = "99%" id = "legend">
                    <tr>
                        <%
                        String widther = form.getStore().isStateContext() ? "\"50%\"" : "\"33%\"";
                        if (form.isShowInventoryFlagInHelp() && form.getStore().isStateRepositoryRunning() && form.getCollectionType() == CollectionType.TEXTBOOK
                            && !form.getStore().isStateContext()) { 
                            widther = "\"25%\"";
                            %>
                            <td align = "center" class = "SmallColRow" width = <%=widther %>>
                                <img src = '<%=UserContext.getMyContextLocaleHelper().getLocalizedImagePath("/icons/general/flag.gif")%>' alt = "Inventory" title = "Inventory"> = Must receive to inventory collection
                            </td>
                        <% } %>
                        <td align = "center" class = "SmallColRow" width = <%=widther %>>
                           <img src = '<%=UserContext.getMyContextLocaleHelper().getLocalizedImagePath("/icons/general/notetransfer.gif")%>' alt = "View Notes" title = "View Notes"> = View Notes
                        </td>
                        <td align = "center" class = "SmallColRow" width = <%=widther %>><img src = '<%=UserContext.getMyContextLocaleHelper().getLocalizedImagePath("/icons/general/view.gif")%>' alt = "View" title = "View"> = View</td>
                        <base:isNotStateContext>
                            <td align = "center" class = "SmallColRow" width = <%=widther %>><img src = '<%=UserContext.getMyContextLocaleHelper().getLocalizedImagePath("/icons/general/no.gif")%>' alt = "Remove" title = "Remove"> = Remove</td>
                        </base:isNotStateContext>
                        
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td><hr/></td>
        </tr>
    </logic:equal>
    <% if (form.getTransferType() != TransferSpecs.TRANSFER_TYPE_ORDER) { %>
    <tr>
        <td class = "ColRowBold">
            <a name = "customize" style = "color:black">Customize View</a>
            <br/>
            <span class = "ColRow" style = "font-weight: normal">Use the following options to create a customized list.</span>
        </td>
    </tr>   
    <tr>
        <td><table>
            <tr>
                    <td class = "ColRowBold" width = '25%'><a name = "selectSite"></a>
                            View transfers created </td>
                    <td>   <html:select property = "viewXferDateLimiter">
                                <html:option value = "<%= TransferTrackFacadeSpecs.PARAM_AFTER_DATE %>"><%= TransferTrackForm.OPTION_AFTER_DATE %></html:option>
                                <html:option value = "<%= TransferTrackFacadeSpecs.PARAM_ON_DATE %>"><%= TransferTrackForm.OPTION_ON_DATE %></html:option>
                                <html:option value = "<%= TransferTrackFacadeSpecs.PARAM_BEFORE_DATE %>"><%= TransferTrackForm.OPTION_BEFORE_DATE %></html:option>
                            </html:select>&nbsp;
                            <base:date 
                                buttonName = "<%=TransferTrackForm.BUTTON_CHANGE_DATE%>"
                                fieldName = "<%=TransferTrackForm.FIELD_LIMIT_DATE%>"
                                dateValue = "<%=form.getLimitDate()%>"
                                altText = "Change Limiter Date"
                            />
                    </td> 
                </tr>
                <tr>
                    <td class = "ColRowBold">Limit to transfers from/to</td>
                    <td class = "ColRow">
                        <base:isStateContext>
                            <base:selectDistrict                                 
                                includeStateTextbookOffice="false"
                                includeStatewide="false" 
                                selectedDistrictContext="<%=form.getLimitDistrict()%>"
                                mustContainTextbookSites="true"  
                                useSelectAllDistricts="true"                                
                                useSelectADistrict="true"
                                onChangeAction="submitDropDownDistrict()" 
                                name="<%= TransferTrackForm.FIELD_LIMIT_DISTRICT %>" /> 
                           <br/>                            
                        </base:isStateContext>
                        <base:isNotStateContext>
                            <% if (form.getStore().isStateRepositoryRunning()
                                && !form.getSessionStore().isDistrictUser()
                                && form.getCollectionType() != CollectionType.ASSET) { %>
                                <base:selectDistrict                                 
                                    includeStateTextbookOffice="<%= form.getCollectionType() == CollectionType.TEXTBOOK %>"
                                    includeStatewide="false" 
                                    selectedDistrictContext="<%=form.getLimitDistrict()%>"
                                    mustContainTextbookSites="true"  
                                    useSelectADistrict="true"                                
                                    limitToMyDistirctContext="true"
                                    useSelectAllDistricts="false"
                                    onChangeAction="submitDropDownDistrict()" 
                                    name="<%= TransferTrackForm.FIELD_LIMIT_DISTRICT %>" /> 
                                <br/>                            
                            <% } %>
                        </base:isNotStateContext>
                        <% if( (form.getSessionStore().isDistrictUser() && !form.getSessionStore().isStateContext()) ||
                                (!form.getSessionStore().isStateRepositoryRunning()) ||
                                (form.getCollectionType() == CollectionType.ASSET) ||
                                (!StringHelper.isEmptyOrWhitespace(form.getLimitDistrict())
                                && !SelectDistrictTag.SELECT_A_DISTRICT_TEXT.equals(form.getLimitDistrict()) 
                                && !SelectDistrictTag.VALUE_ALL_DISTRICTS.equals(form.getLimitDistrict()) 
                                && !SelectDistrictTag.BLANK_SITE.equals(form.getLimitDistrict())
                                && !form.getStateRepositoryContextName().equals(form.getLimitDistrict()))) 
                        { %>
                            <base:selectSite 
                               useSelectASite="true"
                               name="<%= TransferTrackForm.FIELD_LIMIT_SITE %>" 
                               selectedSiteID="<%= form.getLimitSite() %>" 
                               mode="<%= form.getSessionStore().isStateContext() ? SelectSiteTag.MODE_GROUP_BY_SITE_TYPE_TEXTBOOK_ONLY : SelectSiteTag.MODE_DEFAULT %>"
                               includeLibrarySites="false"
                               includeTextbookSites="<%= form.getCollectionType() == CollectionType.TEXTBOOK %>"
                               includeMediaSites="false"
                               contextName="<%=form.getLimitDistrict()%>"
                               includeAssetSites="<%= form.getCollectionType() == CollectionType.ASSET %>"
                               includeAllSites="true"
                               excludeThisSiteID="<%=form.getStore().getSiteID() %>"
                               includeFromDistrict = "<%= !form.getSessionStore().isDistrictUser() %>"
                        />
                        <% } %>
                    </td> 
                </tr>
                <tr>
                    <td colspan = "3">
                        <table width = "100%" id="displayTable">
                        <% boolean firstRowDone = false;
                           if (!form.getStore().isDistrictUser() || form.getStore().isStateContext()) {
                                firstRowDone = true; 
                            %>
                        <tr>
                            <td><span class = "ColRowBold" style = "font-size:.8em">Display:</span></td>
                           <% if (!form.getStore().isStateContext()) { %>
                                <td class = "ColRow" nowrap = "nowrap"><html:checkbox property="<%= TransferTrackForm.PARAM_DISPLAY_INCOMING %>" styleId="di1"/> <label for="di1">Incoming Transfers</label></td>
                            <%} %>
                           <% if (!form.getStore().isStateContext()) { %>
                             <td class = "ColRow" nowrap = "nowrap"><html:checkbox property="<%= TransferTrackForm.PARAM_DISPLAY_INCOMING_COMPLETE %>" styleId = "di2"/> <label for="di2"> Completed Incoming Transfers</label></td>
                            <% } else { %>
                            <td class = "ColRow" nowrap = "nowrap"><html:checkbox property="<%= TransferTrackForm.PARAM_DISPLAY_OUTGOING %>" styleId = "do1"/>  <label for="do1">Outgoing Transfers</label></td>
                            <%} %>
                            <td class = "ColRow" nowrap = "nowrap"><% if (form.displayDiscrepancyCheckBox()) { %>
                              <html:checkbox property="<%= TransferTrackForm.PARAM_DISPLAY_DISCREPANCY %>" styleId = "dd"/> <label for="dd"> Discrepancies</label></td>
                              <% } else {  %>
                              &nbsp;
                              <% } %>
                            </td>
                                                        
                        </tr>
                        <% } %>
                        <tr>
                            <% if (firstRowDone) { %>
                                <td>&nbsp;</td>
                            <% } else { %>
                                <td nowrap = "nowrap"><span class = "ColRowBold" style = "font-size:.8em">Display:</span></td>
                            <% } %>
                           <% if (!form.getStore().isStateContext()) { %>
                              <td class = "ColRow" nowrap = "nowrap"><html:checkbox property="<%= TransferTrackForm.PARAM_DISPLAY_OUTGOING %>" styleId = "do1"/>  <label for="do1">Outgoing Transfers</label></td>
                            <td class = "ColRow" nowrap = "nowrap"><html:checkbox property="<%= TransferTrackForm.PARAM_DISPLAY_OUTGOING_COMPLETE %>" styleId = "do2"/>  <label for="do2">Completed Outgoing Transfers</label></td>
                            <% } %>
                            <td>&nbsp;</td>
                        </tr>
                        <% if (form.getStore().isDistrictUser() && !form.getStore().isStateContext()) { %>
                            <tr>
                                <td>&nbsp;</td>
                                <td class = "ColRow" nowrap = "nowrap"><html:checkbox property="<%= TransferTrackForm.PARAM_DISPLAY_SITETOSITE %>" styleId = "s2s1"/>  <label for="s2s1">Site Transfers</label></td>
                                <td class = "ColRow" nowrap = "nowrap"><html:checkbox property="<%= TransferTrackForm.PARAM_DISPLAY_SITETOSITE_COMPLETE %>" styleId = "s2s2"/>  <label for="s2s2">Completed Site Transfers</label></td>
                                <td>&nbsp;</td>
                            </tr>
                        <% } %>
                    </td>                                        
                </tr>
                <tr>
                    <td colspan = "3" align = "center">
                    <base:genericButton name="<%= TransferTrackForm.BUTTON_UPDATE_VIEW %>" 
                        src = "/buttons/large/update.gif" 
                        alt = "Update"
                        />
                    </td>
                </tr>        
            </table>
        </td>
    </tr>
    <% } %>
    </base:outlinedTableAndTabsWithinThere>
    
    <%= SectionHeadingTag.generateShowMoreLessJavascript() %>
    <script language = 'JavaScript'>
    <!--
       function submitDropDownDistrict() {
            document.<%=TransferTrackForm.FORM_NAME%>.<%=TransferTrackForm.FIELD_CONTEXT_LIMITER_CHANGED%>.value = 'true';
            document.<%=TransferTrackForm.FORM_NAME%>.action += "#selectSite";
            document.<%=TransferTrackForm.FORM_NAME%>.submit();
       }

       var img = document.getElementById("imageIncomingTransfers");
       if (<%= form.isHiddenIncoming() %> && img) {
           showMoreLess(img, "IncomingTransfers");
       }
       var img = document.getElementById("imageCompletedIncomingTransfers");
       if (<%= form.isHiddenIncomingComplete()%> && img  ) {
           showMoreLess(img, "CompletedIncomingTransfers");
       }
       var img = document.getElementById("imageOutgoingTransfers");
       if (<%= form.isHiddenOutgoing()%> && img  ) {
           showMoreLess(img, "OutgoingTransfers");
       }
       var img = document.getElementById("imageCompletedOutgoingTransfers");
       if (<%= form.isHiddenOutgoingComplete()%> && img  ) {
           showMoreLess(img, "CompletedOutgoingTransfers");
       }
       var img = document.getElementById("imageSiteTransfers");
       if (<%= form.isHiddenSiteToSite()%> && img  ) {
           showMoreLess(img, "SiteTransfers");
       }
       var img = document.getElementById("imageCompletedSiteTransfers");
       if (<%= form.isHiddenSiteToSiteComplete()%> && img  ) {
           showMoreLess(img, "CompletedSiteTransfers");
       }
       var img = document.getElementById("imageDiscrepancies");
       if (<%= form.isHiddenDiscrepancies()%> && img  ) {
           showMoreLess(img, "Discrepancies");
       }

       function updateURL(t, h) {            
            t.href += "&<%=TransferTrackForm.FIELD_HIDDEN_INCOMING %>=" + document.<%= TransferTrackForm.FORM_NAME %>.hiddenIncomingTransfers.value;
            t.href += "&<%=TransferTrackForm.FIELD_HIDDEN_INCOMING_COMPLETE %>=" + document.<%= TransferTrackForm.FORM_NAME %>.hiddenCompletedIncomingTransfers.value;
            t.href += "&<%=TransferTrackForm.FIELD_HIDDEN_OUTGOING %>=" + document.<%= TransferTrackForm.FORM_NAME %>.hiddenOutgoingTransfers.value;
            t.href += "&<%=TransferTrackForm.FIELD_HIDDEN_OUTGOING_COMPLETE %>=" + document.<%= TransferTrackForm.FORM_NAME %>.hiddenCompletedOutgoingTransfers.value;
            t.href += "&<%=TransferTrackForm.FIELD_HIDDEN_SITETOSITE %>=" + document.<%= TransferTrackForm.FORM_NAME %>.hiddenSiteTransfers.value;
            t.href += "&<%=TransferTrackForm.FIELD_HIDDEN_DISCREPANCY %>=" + document.<%= TransferTrackForm.FORM_NAME %>.hiddenDiscrepancies.value;
            t.href += "&<%=TransferTrackForm.FIELD_HIDDEN_SITETOSITE_COMPLETE %>=" + document.<%= TransferTrackForm.FORM_NAME %>.hiddenCompletedSiteTransfers.value;
            if (h) {
                t.href += "#" + h;
            }
        }
       
    // -->
    </script>
</base:form>


