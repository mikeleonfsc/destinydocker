<%@page import="com.follett.fsc.destiny.util.xml.AssetTemplateBaseSpecs"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.TransferSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.cataloging.data.TransferViewItem" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.*"%>
<%@ page import="com.follett.fsc.destiny.util.marc.BibType"%>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@page import="com.follett.fsc.destiny.util.marc.BibType"%>
<%@page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page import="java.util.*" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>




<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );
    LocaleHelper lh = UserContext.getMyContextLocaleHelper(); 
    TransferTrackViewForm form = (TransferTrackViewForm)request.getAttribute(TransferTrackViewForm.FORM_NAME);
    String focusControl = (form.isTransferPresent() && (form.isShowEitherReceiveAndTransferLink() || form.isActionReroute())) ? TransferTrackViewForm.FIELD_SEARCH_STRING : null;
    
    String copyDescription = form.getCollectionType() == CollectionType.ASSET ? "Items" : "Copies";
    
%>


<%@page import="com.follett.fsc.common.consortium.UserContext"%><script language="JavaScript" type="text/javascript">
  <!--
      
    function trapEnter(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        submitTypeTrapEnter();
        return false;
      }
      return true;
    }  
     function submitTypeTrapEnter() {
        document.<%=TransferTrackViewForm.FORM_NAME%>.<%=TransferTrackViewForm.FIELD_SUBMIT_TYPE%>.value = "<%=TransferTrackViewForm.SUBMIT_TYPE_TRAP_ENTER%>";
        document.<%=TransferTrackViewForm.FORM_NAME%>.submit();
    }
  // -->
</script>

<base:messageBox strutsErrors="true"/>

    <base:form action="/cataloging/servlet/handletransfertrackviewform.do" focus="<%=focusControl%>">
    <logic:equal name="<%=TransferTrackViewForm.FORM_NAME%>" property="transferPresent" value="true">
    <logic:equal name="<%=TransferTrackViewForm.FORM_NAME%>"  property="printerFriendly" value="false">
        <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" 
            border="0" alt="" value="true" 
            name="<%=TransferTrackViewForm.BUTTON_TRAP_ENTER%>"/>
    </logic:equal>
    <html:hidden property="<%=GenericForm.FIELD_COLLECTION_TYPE%>"/>
    <html:hidden property="<%=TransferTrackViewForm.FIELD_SUBMIT_TYPE%>" value=""/>
    <html:hidden property="<%=TransferTrackViewForm.FIELD_HOME_LOCATION_ID%>"/>
    <html:hidden property="<%=TransferTrackViewForm.FIELD_SITEDEPT_ID%>"/>
    <html:hidden property="<%=TransferTrackViewForm.FIELD_CUSTODIAN_ID%>"/>
    <html:hidden property="<%=TransferTrackViewForm.PARAM_ACTION_REROUTE%>"/>
    <html:hidden property="<%=TransferTrackViewForm.PARAM_REROUTED_SITE_ID%>"/>
    <html:hidden property="<%=TransferTrackViewForm.PARAM_TRANSFER_TYPE%>"/>
    <html:hidden property="<%=TransferTrackViewForm.PARAM_EXPANDED_ID%>"/>
    <html:hidden property="<%=TransferTrackViewForm.PARAM_EXPANDED_MODE%>"/>
    <html:hidden property="<%=TransferTrackViewForm.ATTRIBUTE_OLD_ACTION_MODE%>"/>
    <html:hidden property="<%=TransferTrackViewForm.PARAM_FORCE_STOP_JOB%>"/>
    <html:hidden property="<%=TransferTrackViewForm.PARAM_READ_ONLY%>"/>
    <input type="hidden" name="changedDistrictDropDown"/>
    <input type="hidden" name="changedSiteDropDown"/>

<%if ( form.getConfirmMessage() != null && !form.isConfirmIncompleteMessage()) { %>
    <html:hidden property="confirmMode"/>
        <br>
        <base:messageBox showRedBorder="true">
        <tr>
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td valign="baseline">
                    <p align="center">
                        <span class="Error"><%=form.getConfirmMessage()%></span>
                    </p>
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td class="ColRowBold">
                    <div align="center">
                        <base:showHideTag id="onYes">
                            <base:yesButton onclick="hideElementonYes()"/>&nbsp;<base:noButton name="<%=TransferTrackViewForm.BUTTON_NO%>"/>
                        </base:showHideTag>
                    </div>
            </td>
        </tr>
        
        </base:messageBox>
        <br>
<%}%>
<%if ( form.isConfirmIncompleteMessage()) { %>
    <html:hidden property="confirmMode"/>
        <br>
        <base:messageBox showRedBorder="true">
        <tr>
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td valign="baseline" class="ColRowBold" align="center">
                <%=form.getConfirmMessage()%>
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td valign="baseline" class="ColRow">
                <%if(form.getCountUnreceivedCopies() > 1) { %>
                    These copies
                <% } else { %>
                    This copy
                <% } %>
                will be marked lost in your inventory and your
                school will be charged unless you immediately notify the
                State Textbook Office of the shortage.
                <%=form.getIncompleteMessage() %>
            </td>
            
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td valign="baseline" class="ColRowBold">
                Are you sure you have not received
                <%if(form.getCountUnreceivedCopies() > 1) { %>
                    these copies?
                <% } else { %>
                    this copy?
                <% } %>
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td class="ColRowBold">
                    <div align="center">
                        <base:showHideTag id="onYes">
                            <base:yesButton onclick="hideElementonYes()"/>&nbsp;<base:noButton name="<%=TransferTrackViewForm.BUTTON_NO%>"/>
                        </base:showHideTag>
                    </div>
            </td>
        </tr>
        
        </base:messageBox>
        <br>
<%}%>


       <bean:define id="numReceivedItems" name="<%=TransferTrackViewForm.FORM_NAME%>" property="numReceivedItems"/>
       <html:hidden property="<%=TransferTrackViewForm.PARAM_TRANSFER_ID%>"/>
       
       <table id="<%=TransferTrackViewForm.TABLE_MAIN%>" cellSpacing="0" cellPadding="3" width="100%" border="0">
       <tr><td>
           <table id="<%=TransferTrackViewForm.TABLE_MAIN_HEADER%>" border="0" cellpadding="0" width="100%">
                <tr>
                    <td class="TableHeading" valign="top">
                        <bean:write name="cataloging_servlet_TransferTrackViewForm" property="pageHeaderDescription" />
                    </td>
                    <td class="TableHeading tdAlignRight" valign="top">
                    <logic:equal name="<%=TransferTrackViewForm.FORM_NAME%>"  property="printerFriendly" value="false">
                        <a href="<%=form.getPrinterFriendlyLink() %>" target="PrinterFriendly" id="<%=TransferTrackViewForm.ID_PRINTER_FRIENDLY %>"><base:image src="/buttons/large/printit.gif" alt="<%=form.ALT_TEXT_PRINT_IT %>"/></a>&nbsp;<logic:equal
                            property="showStopTransfer" name="<%=TransferTrackViewForm.FORM_NAME%>" value="true">
                        </logic:equal>
                    </logic:equal>
                    </td>
                </tr>
                
                <logic:equal name="<%=TransferTrackViewForm.FORM_NAME%>"  property="printerFriendly" value="false">
                    <% if (!form.isShowTransferStopping()){ %>
                        <%=form.getAddViewNoteLinkText() %>
                    <%} %>    
                </logic:equal>
                
                 
                <logic:notEmpty name="<%=TransferTrackViewForm.FORM_NAME%>"  property="orderNumber">
                    <tr id="orderNumberRow">
                        <td class="TableHeading2" valign="top" colspan="2">
                            Order #: <bean:write name="cataloging_servlet_TransferTrackViewForm" property="orderNumber" />
                        </td>
                    </tr>       
                </logic:notEmpty>   
                <tr>
                    <td class="ColRowBold" valign="top" align="center">
                        <%if(form.isTransferToState() && !form.isIncomingTransfer() && !form.isOutgoingTransferComplete()){%>
                              <base:messageBox showRedBorder="true">
                              <tr>
                                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                                <td>State transfers cannot be stopped.
                                </td>
                              </tr>
                              </base:messageBox> 
                        <% } else { %>
                              &nbsp;        
                        <% }  %>
                        <%if ( form.getConfirmMessage() == null && TransferSpecs.TRANSFER_TYPE_TRANSFER == form.getTransferType() && !form.isPendingDiscrepancy() ) {
                       
                            String message = "Once you start receiving " + copyDescription.toLowerCase() + " in this " + (form.isShipment()? "shipment" : "transfer") + ", " + 
                                             "<br>you are taking full responsibility for all of the " + copyDescription.toLowerCase() + ". " + 
                                             "<br>Please verify the content of the shipment before beginning.";
                             %>
                            <logic:equal name="<%=TransferTrackViewForm.FORM_NAME%>"  property="showResponsibilityMessageForReceivingTransfers" value="true">
                            <base:messageBox showRedBorder="true">
                                <tr valign="top">
                                    <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                                    <td>
                                    <%=message %>
                                    </td>
                                </tr>
                            </base:messageBox> 
                            </logic:equal>
                        <%} %>
                    </td>
                    <td valign="top" class="tdAlignRight">
                        <logic:equal name="<%=TransferTrackViewForm.FORM_NAME%>"  property="printerFriendly" value="false">
                            <%if(!form.isTransferToState()) { %>
                                <% if (form.isShowStopTransfer()) {%>
                                    <span class="TableHeading"><base:genericButton src="/buttons/large/stoptransfer.gif" name="<%= TransferTrackViewForm.BUTTON_STOP_TRANSFER %>" alt="Stop Transfer"/></span>
                                <% } else if (form.isShowTransferStopping()) { %>
                                    <span class="ColRow">This transfer is being stopped.</span>
                                <% } %>
                            <%}%>
                        </logic:equal>
                    </td>
                </tr>
            </table>
       </td>
    </tr>
    <%
        boolean resolveButtonsAtTop = false;
    
        if (form.getMissingItems(true).size() > 0 && form.getMissingItems(false).size() > 0 && form.isPendingDiscrepancy() && form.isStateRepository()) {
            resolveButtonsAtTop = true;
        }
    
        if (resolveButtonsAtTop) {
            
    %>
        <tr>
            <td class = "TableHeading2">Resolve Missing Copies: <%if (form.isStateRepository() && form.isPendingDiscrepancy() && !form.isPrinterFriendly()) {%>
                <base:genericButton name="<%=form.BUTTON_DELETE_ALL %>" src="/buttons/large/deleteall.gif"  alt="Delete All Missing Copies" absbottom="true"/>
                <% if (!form.isAllConsumables() ) { %>
                <base:genericButton name="<%=form.BUTTON_MARK_LOST %>" src="/buttons/large/marklost.gif"  alt="Mark Missing Copies Lost" absbottom="true"/>
                <% } %>
            <% } %>
            </td>
       </tr>
       <% } %>
    <bean:define id="numSentItems" name="<%=TransferTrackViewForm.FORM_NAME%>" property="numSentItems"/>

        <logic:equal name="<%=TransferTrackViewForm.FORM_NAME%>"  property="printerFriendly" value="false">
           <logic:notEqual name="numSentItems" value="0">
                <logic:equal property="collectionType" name="<%= TransferTrackViewForm.FORM_NAME%>" value="<%= String.valueOf(CollectionType.ASSET) %>" >
                   <logic:equal property="showReceiveLink" name="<%=TransferTrackViewForm.FORM_NAME%>" value="true">
                     <tr>
                         <td><base:imageLine height="1" width="100%"/></td>
                     </tr>              
                     <tr>
                        <td>
                           <table id="<%=TransferTrackViewForm.TABLE_SUB_HEADER%>" border="0" cellpadding="0" width="100%">         
                               <tr>
                                  <td class="ColRowBold" nowrap>
                                       Assign the following values to these <%= copyDescription.toLowerCase() %>:
                                       &nbsp; 
                                       <base:genericButton src="/buttons/large/assignto.gif" name="<%= TransferTrackViewForm.BUTTON_ASSIGN_TO %>" alt="Assign values"/>
                                       <logic:equal name="<%=TransferTrackViewForm.FORM_NAME%>"  property="clearButton" value="true">
                                          <base:genericButton src="/buttons/large/clear.gif" name="<%= TransferTrackViewForm.BUTTON_CLEAR_ASSIGN_TO %>" alt="Clear"/>
                                       </logic:equal>                           
                                  </td>
                               </tr>                
                               <tr>
                                  <td nowrap>
                                    <span class="ColRowBold">Custodian:</span>&nbsp;<span class="ColRow"><bean:write name="<%=TransferTrackViewForm.FORM_NAME%>" property="custodian" /></span>
                                  </td>
                               </tr>                
                               <tr>
                                  <td nowrap>
                                    <span class="ColRowBold">Home Location:</span>&nbsp;<span class="ColRow"><bean:write name="<%=TransferTrackViewForm.FORM_NAME%>" property="homeLocation" /></span>
                                  </td>                     
                               </tr>
                               <tr>
                                  <td nowrap>
                                    <span class="ColRowBold">Department:</span>&nbsp;<span class="ColRow"><bean:write name="<%=TransferTrackViewForm.FORM_NAME%>" property="department" /></span>
                                  </td>                     
                               </tr>                    
                           </table>
                        </td>
                    </tr>
        </logic:equal>
        </logic:equal>
        </logic:notEqual>
        </logic:equal>
        
        <logic:equal name="<%=TransferTrackViewForm.FORM_NAME%>" property="<%=TransferTrackViewForm.PARAM_ACTION_REROUTE%>" value="true">
        <tr>
                <td class="ColRowBold">To&nbsp;
                    <base:selectSite 
                        name="<%= TransferTrackViewForm.FIELD_REROUTE_SITE_ID%>" 
                        useSelectASite="true" 
                        includeAssetSites="<%=form.getCollectionType() == CollectionType.ASSET%>"
                        includeMediaSites="false"
                        includeLibrarySites="false"
                        includeTextbookSites="false"
                        excludeThisSiteID="<%=form.getReroutedSiteID()%>"
                        selectedSiteID="<%=String.valueOf(form.getRerouteSiteID())%>"
                    />
                </td>
            </tr>
        </logic:equal>
    
    <tr>
        <logic:equal name="<%=TransferTrackViewForm.FORM_NAME%>"  property="printerFriendly" value="false">
        <td><base:imageLine height="1" width="100%"/></td>
        </logic:equal>
        <logic:equal name="<%=TransferTrackViewForm.FORM_NAME%>"  property="printerFriendly" value="true">
        <td><hr></td>
        </logic:equal>
    </tr>
    
    <logic:notEqual name="numSentItems" value="0">
    
    <logic:equal property="showReceiveRerouteRadios" name="<%=TransferTrackViewForm.FORM_NAME%>" value="true">
    <tr>
        <td class="TableHeading2">
            <html:radio property="<%= TransferTrackViewForm.FIELD_ACTION_MODE %>" onclick="form.submit()" value='<%="" + TransferTrackViewForm.ACTION_MODE_RECEIVE%>' >
                    Receive Copies
            </html:radio>
            <html:radio property="<%= TransferTrackViewForm.FIELD_ACTION_MODE %>" onclick="form.submit()" value='<%="" + TransferTrackViewForm.ACTION_MODE_REROUTE%>' >
                    Reroute Copies
            </html:radio>
        </td> 
    </tr>
     <tr>
                <logic:equal name="<%=TransferTrackViewForm.FORM_NAME%>"
                    property="printerFriendly" value="false">
                    <td><base:imageLine height="1" width="100%" /></td>
                </logic:equal>
                <logic:equal name="<%=TransferTrackViewForm.FORM_NAME%>"
                    property="printerFriendly" value="true">
                    <td>
                    <hr>
                    </td>
                </logic:equal>
            </tr>
    </logic:equal>
    
    <logic:equal property="actionModeReroute" name="<%=TransferTrackViewForm.FORM_NAME%>" value="true">
    <tr>
        <td class="ColRowBold">
            <table id="<%=TransferTrackViewForm.TABLE_STATE_TEXTBOOK_REROUTE%>">
                <tr>
                    <td class="FormLabel tdAlignRight">
                        To
                    </td>
                    <td><base:selectDistrict
                        includeStateTextbookOffice="<%=!form.getStore().isStateContext()%>" 
                        useSelectADistrict="<%=com.follett.fsc.common.StringHelper.isEmpty(form.getDistrictContext())%>" 
                        selectedDistrictContext="<%=form.getDistrictContext() %>"
                        onChangeAction="this.form.changedDistrictDropDown.value=true; this.form.submit(); return false;" 
                        name="<%= TransferTrackViewForm.FIELD_DISTRICT_CONTEXT %>" /></td>
                    <td valign="middle">
                        <% if (com.follett.fsc.common.StringHelper.isEmpty(form.getDistrictContext())) { %>
                            <base:genericButton src="/buttons/small/rerouteall.gif" name="<%= TransferTrackViewForm.BUTTON_REROUTE_ALL %>" alt="<%= TransferTrackViewForm.ALT_TEXT_REROUTE_ALL %>"/>
                        <% } else { %>
                            &nbsp;
                        <% } %>
                    </td>
                </tr>
                <% if (!com.follett.fsc.common.StringHelper.isEmpty(form.getDistrictContext())) { %>
                    <tr>
                        <td class="FormLabel tdAlignRight">
                            &nbsp;
                        </td>
                        <td>
                            <base:selectSite 
                                name="<%= TransferTrackViewForm.FIELD_REROUTE_SITE_ID %>" 
                                selectedSiteID='<%= ""+form.getRerouteSiteID() %>'
                                mode='<%=SelectSiteTag.MODE_GROUP_BY_SITE_TYPE_TEXTBOOK_ONLY %>'
                                includeLibrarySites='false'
                                includeTextbookSites='true'
                                includeMediaSites='false'
                                excludeThisSiteID="<%=form.getExcludeSiteID()%>"                                
                                contextName='<%=form.getDistrictContext()%>'
                                includeAssetSites="false"
                                onChangeAction="this.form.changedSiteDropDown.value=true; this.form.submit(); return false;" 
                                useSelectASite="true" 
                                />
                        </td>
                        <td valign="middle">
                            <base:genericButton src="/buttons/small/rerouteall.gif" name="<%= TransferTrackViewForm.BUTTON_REROUTE_ALL %>" alt="<%= TransferTrackViewForm.ALT_TEXT_REROUTE_ALL %>"/>
                        </td>
                    </tr>            
                <% } else { %>
                    <html:hidden property="<%= TransferTrackViewForm.FIELD_SITE_ID %>"/>
                <% }  %>
            </table>
        </td> 
    </tr>
    </logic:equal>
    
   
    <logic:equal property="showEitherReceiveAndTransferLink" name="<%=TransferTrackViewForm.FORM_NAME%>" value="true">
    <tr>
       <td>
        <table id="<%=TransferTrackViewForm.TABLE_BARCODE_SEARCH%>" cellSpacing="0" cellPadding="4" width="100%">
            <tr>
                <td class="ColRowBold" nowrap>Scan or enter <%=copyDescription.toLowerCase() %> one-at-a-time</td>
                 <td class="ColRowBold">
                    <span onKeyPress="return trapEnter(event);">                
                         <html:text property="<%= TransferTrackViewForm.FIELD_SEARCH_STRING %>" size="20"/>
                    </span>
                </td>
                <logic:notEqual property="<%=TransferTrackViewForm.PARAM_ACTION_REROUTE %>" name="<%=TransferTrackViewForm.FORM_NAME%>" value="true">
                    <td class="ColRowBold" width="100%"><base:genericButton src="/buttons/large/receive.gif" name="<%= TransferTrackViewForm.BUTTON_SEARCH_AND_RECEIVE %>" alt="Search and receive"/></td>
                </logic:notEqual>
                <logic:equal property="<%=TransferTrackViewForm.PARAM_ACTION_REROUTE %>" name="<%=TransferTrackViewForm.FORM_NAME%>" value="true">
                    <td class="ColRowBold" width="100%"><base:genericButton src="/buttons/large/reroutebig.gif" name="<%= TransferTrackViewForm.BUTTON_SEARCH_AND_RECEIVE %>" alt="Reroute"/></td>
                </logic:equal>
            </tr>
            <tr>
                <td colspan="3" class="ColRow">Or
                <logic:equal property="<%=TransferTrackViewForm.PARAM_ACTION_REROUTE %>" name="<%=TransferTrackViewForm.FORM_NAME%>" value="true">
                    reroute
                </logic:equal>
                <logic:equal  property="showReceiveAndTransferLink" name="<%=TransferTrackViewForm.FORM_NAME%>" value="true">
                    receive &amp; transfer
                </logic:equal>
                <logic:equal  property="showReceiveLink" name="<%=TransferTrackViewForm.FORM_NAME%>" value="true">
                    receive
                </logic:equal>
                selected <%=copyDescription.toLowerCase() %> below...</td>
            </tr>
        </table>
       </td>
     </tr>
     </logic:equal>
     </logic:notEqual>
     <logic:notEqual name="numSentItems" value="0">
        <tr>
            <td>
                <table id="<%=TransferTrackViewForm.TABLE_SENT_HEADER%>" border="0" width="100%">
                    <tr>
                        <logic:equal property="showLostRemovedSection" name="<%=TransferTrackViewForm.FORM_NAME%>" value="false">
                            <td class="TableHeading2"><%=copyDescription %> Sent With Barcodes (<bean:write name="numSentItems"/>)</td>
                        </logic:equal>
                        <logic:equal property="showLostRemovedSection" name="<%=TransferTrackViewForm.FORM_NAME%>" value="true">
                            <td class="TableHeading2"><font color="#CC0000"><%=copyDescription %> Lost / Not Receivable (<bean:write name="numSentItems"/>)</font></td>
                        </logic:equal>
                    </tr>
                    <tr>
                        <td>
                            <table id="<%=TransferTrackViewForm.TABLE_SENT_DETAIL%>" cellSpacing="0" cellPadding="5" width="100%" border="0">
                               <% if (CollectionType.ASSET == form.getCollectionType() && form.getNotReceivedTransfersNonTextbook().size() > 0) { %>
                                   <tr>
                                       <td class="SmallColHeading" vAlign="bottom">Resource Description</td>
                                       <td class="SmallColHeading" vAlign="bottom">&nbsp;</td>
                                       <td class="SmallColHeading" vAlign="bottom">&nbsp;</td>
                                       <td class="SmallColHeading" vAlign="bottom">&nbsp;</td>
                                       <td class="SmallColHeading" vAlign="bottom">Custodian</td>
                                       <td class="SmallColHeading" vAlign="bottom">Items</td>
                                       <td class="Instruction" vAlign="top" noWrap align="right">                                         
                                           <logic:equal property="showReceiveLink" name="<%=TransferTrackViewForm.FORM_NAME%>" value="true">
                                               <% if (form.gimmeIsShowReceiveAllButton() ) { %>
                                                   <base:genericButton src="/buttons/small/receiveall.gif" name="<%= TransferTrackViewForm.BUTTON_RECEIVE_ALL %>" alt="<%= TransferTrackViewForm.ALT_TEXT_RECEIVE_ALL %>"/>
                                               <% } else { %>
                                                   &nbsp;
                                               <% } %> 
                                           </logic:equal>
                                           <logic:equal property="showReceiveAndTransferLink" name="<%=TransferTrackViewForm.FORM_NAME%>" value="true">
                                                <base:genericButton src="/buttons/small/receiveandtransferall.gif" name="<%= TransferTrackViewForm.BUTTON_RECEIVE_AND_TRANSFER_ALL %>" alt="<%= TransferTrackViewForm.ALT_TEXT_RECEIVE_AND_TRANSFER_ALL %>"/>
                                           </logic:equal>
                                           <logic:equal property="<%=TransferTrackViewForm.PARAM_ACTION_REROUTE%>" name="<%=TransferTrackViewForm.FORM_NAME%>" value="true">
                                                <base:genericButton src="/buttons/small/rerouteall.gif" name="<%= TransferTrackViewForm.BUTTON_REROUTE_ALL %>" alt="<%= TransferTrackViewForm.ALT_TEXT_REROUTE_ALL %>"/>
                                           </logic:equal>
                                           <logic:equal property="showEitherReceiveAndTransferLink" name="<%=TransferTrackViewForm.FORM_NAME%>" value="false">
                                               &nbsp;
                                           </logic:equal>
                                       </td>
                                   </tr>
                                   <base:TransferItem items="<%=form.getNotReceivedTransfersNonTextbook()%>"
                                                  extraLinkParameters="<%=form.getExtraLinkParameters() %>"
                                                  displayingLostItems="<%=form.isOutgoingTransferComplete()%>"
                                                  showReceiveButton="<%=form.isShowReceiveLink()%>"
                                                  showRerouteButton="<%=form.isActionReroute()%>"
                                                  showReceiveAndTransferButton="<%=form.isShowReceiveAndTransferLink()%>"
                                                  expandedID="<%=form.getExpandedID()%>"
                                                  expandedMode="<%=form.EXPANDED_MODE_SENT %>"
                                                  formName="<%=TransferTrackViewForm.FORM_NAME%>"/>
                               <% }
                                  if (CollectionType.TEXTBOOK == form.getCollectionType() || form.getNotReceivedTransfers().size() > 0) { %>
                                   <tr>
                                       <td class="SmallColHeading" vAlign="bottom"><%=CollectionType.ASSET == form.getCollectionType() ? "Textbook " : "" %>Title</td>
                                       <td class="SmallColHeading" vAlign="bottom">ISBN</td>
                                       <td class="SmallColHeading" vAlign="bottom">Publisher</td>
                                       <td class="SmallColHeading" vAlign="bottom">Copyright</td>
                                       <td class="SmallColHeading" vAlign="bottom"><%=CollectionType.ASSET == form.getCollectionType() ? "Custodian" : "&nbsp;" %></td>
                                       <td class="SmallColHeading" vAlign="bottom"><%=copyDescription %></td>
                                       <td class="Instruction" vAlign="top" noWrap align="right">                                         
                                           <logic:equal property="showReceiveLink" name="<%=TransferTrackViewForm.FORM_NAME%>" value="true">
                                               <% if (form.gimmeIsShowReceiveAllButton() ) { %>
                                                   <base:genericButton src="/buttons/small/receiveall.gif" name="<%= TransferTrackViewForm.BUTTON_RECEIVE_ALL %>" alt="<%= TransferTrackViewForm.ALT_TEXT_RECEIVE_ALL %>"/>
                                               <% } else { %>
                                                   &nbsp;
                                               <% } %> 
                                           </logic:equal>
                                           <logic:equal property="showReceiveAndTransferLink" name="<%=TransferTrackViewForm.FORM_NAME%>" value="true">
                                                <base:genericButton src="/buttons/small/receiveandtransferall.gif" name="<%= TransferTrackViewForm.BUTTON_RECEIVE_AND_TRANSFER_ALL %>" alt="<%= TransferTrackViewForm.ALT_TEXT_RECEIVE_AND_TRANSFER_ALL %>"/>
                                           </logic:equal>
                                           <logic:equal property="<%=TransferTrackViewForm.PARAM_ACTION_REROUTE%>" name="<%=TransferTrackViewForm.FORM_NAME%>" value="true">
                                                <base:genericButton src="/buttons/small/rerouteall.gif" name="<%= TransferTrackViewForm.BUTTON_REROUTE_ALL %>" alt="<%= TransferTrackViewForm.ALT_TEXT_REROUTE_ALL %>"/>
                                           </logic:equal>
                                           <logic:equal property="showEitherReceiveAndTransferLink" name="<%=TransferTrackViewForm.FORM_NAME%>" value="false">
                                               &nbsp;
                                           </logic:equal>
                                       </td>
                                   </tr>
                                   <base:TransferItem items="<%=form.getNotReceivedTransfers()%>"
                                                  extraLinkParameters="<%=form.getExtraLinkParameters() %>"
                                                  displayingLostItems="<%=form.isOutgoingTransferComplete()%>"
                                                  showReceiveButton="<%=form.isShowReceiveLink()%>"
                                                  showRerouteButton="<%=form.isActionReroute()%>"
                                                  showReceiveAndTransferButton="<%=form.isShowReceiveAndTransferLink()%>"
                                                  expandedID="<%=form.getExpandedID()%>"
                                                  expandedMode="<%=form.EXPANDED_MODE_SENT %>"
                                                  formName="<%=TransferTrackViewForm.FORM_NAME%>"/>
                               <% } %>
                               <tr>
                                   <td colspan="6" vAlign="bottom">&nbsp;</td>
                                   <td class="Instruction" vAlign="top" noWrap align="right">                                     
                                       <logic:equal property="showReceiveLink" name="<%=TransferTrackViewForm.FORM_NAME%>" value="true">
                                           <% if (form.gimmeIsShowReceiveAllButton() ) { %>
                                               <base:genericButton src="/buttons/small/receiveall.gif" name="<%= TransferTrackViewForm.BUTTON_RECEIVE_ALL %>" alt="<%= TransferTrackViewForm.ALT_TEXT_RECEIVE_ALL %>"/>
                                           <% } else { %> 
                                               &nbsp;
                                           <%} %>
                                       </logic:equal>
                                       <logic:equal property="showReceiveAndTransferLink" name="<%=TransferTrackViewForm.FORM_NAME%>" value="true">
                                            <base:genericButton src="/buttons/small/receiveandtransferall.gif" name="<%= TransferTrackViewForm.BUTTON_RECEIVE_AND_TRANSFER_ALL %>" alt="<%= TransferTrackViewForm.ALT_TEXT_RECEIVE_AND_TRANSFER_ALL %>"/>
                                       </logic:equal>
                                       <logic:equal property="<%=TransferTrackViewForm.PARAM_ACTION_REROUTE%>" name="<%=TransferTrackViewForm.FORM_NAME%>" value="true">
                                           <logic:equal property="<%=TransferTrackViewForm.PARAM_REROUTE_ALLOWED%>" name="<%=TransferTrackViewForm.FORM_NAME%>" value="true">
                                                <base:genericButton src="/buttons/small/rerouteall.gif" name="<%= TransferTrackViewForm.BUTTON_REROUTE_ALL %>" alt="<%= TransferTrackViewForm.ALT_TEXT_REROUTE_ALL %>"/>
                                           </logic:equal>
                                       </logic:equal>
                                           
                                       <logic:equal property="showEitherReceiveAndTransferLink" name="<%=TransferTrackViewForm.FORM_NAME%>" value="false">
                                            &nbsp;
                                       </logic:equal>
                                   </td>
                               </tr>
                            </table>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
        </logic:notEqual>
        
        
        <%
            boolean isTextbookTransferWithoutBarcodes = false;            
        %>
        <!-- Start of TEXTBOOK logic -->
        
<% if (!form.isWarehouseShipment()){ %>
        
        <logic:equal property="collectionType" name="<%= TransferTrackViewForm.FORM_NAME%>" value="<%= String.valueOf(CollectionType.TEXTBOOK) %>" >

            <%-- Start of Sent without Barcodes --%>        
            <%
            if (!form.getItemsSentWithoutBarcodes().isEmpty() || form.isTransferContainingNeedsBarcodeStatus() 
                || form.getMissingItemsWithoutBarcodes().size() > 0) {
                isTextbookTransferWithoutBarcodes = true;                 
                boolean hasUnknownBarcodeHeader = false;
                boolean hasWOBarcodeHeader = false;
                String prevType = null;
                boolean unknownBarcode = false;
                int flipper = 1;
            %>                                                     
            <logic:iterate id="row" name="<%=TransferTrackViewForm.FORM_NAME%>" property="itemsSentAndReceivedWithoutBarcode" type="TransferViewItem">                                            
    <%
    unknownBarcode = row.getID().endsWith(TransferViewItem.UNKNOWN_BARCODE_IDENTIFIER);
    String currentType = unknownBarcode ? TransferViewItem.UNKNOWN_BARCODE_IDENTIFIER : "";
    if (!currentType.equals(prevType)) {
        String headerString = "";
        if (unknownBarcode) {
            headerString = "Barcoded Copies Sent (" + lh.formatNumber(form.getNumSentItemsWithoutBarcodes(true)) + ")";
        } else {
            headerString = "Copies Sent Without Barcodes (" + lh.formatNumber(form.getNumSentItemsWithoutBarcodes(false)) + ")";
        }
        if (hasUnknownBarcodeHeader || hasWOBarcodeHeader) {
%>
                                    </table>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
                <tr>
                    <td>
                        <base:imageSpacer height="8" width="1"></base:imageSpacer>                                    
                        <base:imageLine height="2" width="100%"/>
                    </td>
                </tr>
                                
<% } %>
                <tr>
                    <td>
                        <table id="<%=TransferTrackViewForm.TABLE_SENT_WITHOUT_BARCODE_HEADER + currentType%>" border="0" width="100%">
                        
                            <tr>
                               <td class="TableHeading2"><%=headerString %></td>
                               <td class="tdAlignRight">
                                    <% if (unknownBarcode && !store.isStateContext() && !form.isPendingDiscrepancy() && (form.getReceivedTransfers(unknownBarcode).size() < form.getNumSentItemsWithoutBarcodes(unknownBarcode))) { %>
                                   <logic:equal name="<%=TransferTrackViewForm.FORM_NAME%>"  property="printerFriendly" value="false">
                                      <base:link permission='<%= Permission.CAT_RECEIVE_TEXTBOOK_COPIES_WITHOUT_BARCODES %>' page='<%=form.getReceiveAllUnknownBarcodeLink()%>'>
                                          <base:image src="/buttons/small/receiveall.gif" alt="<%=TransferTrackViewForm.ALT_TEXT_RECEIVE_ALL%>"/>
                                      </base:link>
                                  </logic:equal>
                                  <% } %>                                              
                               </td>
                            </tr>
                            <% if (form.getReceivedTransfers(unknownBarcode).size() > 0) { %>
                                <tr>
                                    <td class="TableHeading2" colspan="2">Copies Received (<%=form.getReceivedTransfers(unknownBarcode).size()%>)</td>
                                </tr>
                            <% } %>
                            
                            <% if (form.getMissingItems().size() > 0) { %>
                            
                            
                                <tr>
                                <% String whatHappenedToCopies = "";
                                if (((TransferViewItem)form.getMissingItems().get(0)).isLost()) {
                                    whatHappenedToCopies = "- Marked Lost"; 
                                } else if (((TransferViewItem)form.getMissingItems().get(0)).isCopyDeleted()) {
                                    whatHappenedToCopies = "- Deleted";
                                }
                                %>
                                    <td class="TableHeading2" colspan ="2" style="color:#CC0000">Copies Missing <%= whatHappenedToCopies %> (<%=form.getMissingItems(unknownBarcode).size()%>)
                                        &nbsp; &nbsp; <%if (form.isStateRepository() && form.isPendingDiscrepancy() && !resolveButtonsAtTop && (form.getMissingItems(unknownBarcode).size() > 0) && !form.isPrinterFriendly()) {%>
                                            <base:genericButton name="<%=form.BUTTON_DELETE_ALL %>" src="/buttons/large/deleteall.gif"  alt="Delete All Missing Copies" absbottom="true"></base:genericButton>
                                            <% if (!form.isAllConsumables()) { %>
                                                <base:genericButton name="<%=form.BUTTON_MARK_LOST %>" src="/buttons/large/marklost.gif"  alt="Mark Missing Copies Lost" absbottom="true"></base:genericButton>
                                        <%      }
                                          } else { %>
                                            &nbsp;
                                        <% } %>
                                    </td>
                                </tr>
                            <% } %>
                                
                            <tr>
                                <td colspan="2">                        
                                    <table id="<%=TransferTrackViewForm.TABLE_SENT_WITHOUT_BARCODE_DETAIL + currentType%>" cellSpacing="0" cellPadding="3" width="100%" border="0">
                                        <tr>
                                            <td class="SmallColHeading" vAlign="bottom">Title</td>
                                            <td class="SmallColHeading" vAlign="bottom">ISBN</td>
                                            <td class="SmallColHeading" vAlign="bottom">Publisher</td>
                                            <td class="SmallColHeading" vAlign="bottom">Copyright</td>
                                            <td>&nbsp;</td>
                                            <td class="SmallColHeading" vAlign="bottom" align="center">
                                                <%= store.isStateContext() ? "Copies Sent" : "Copies to Receive"%>
                                            </td>
                                            <td>&nbsp;</td>
                                        </tr>
<%
        if (unknownBarcode) {
            hasUnknownBarcodeHeader = true;
        } else {
            hasWOBarcodeHeader = true;
        }
        flipper = 0; 
    }
    prevType = currentType;
%>
                                                                   
                                                <%  
                                                    if ( ( flipper & 1 ) == 0 ) { %>
                                                    <tr bgcolor="#E8E8E8">
                                                <% } else { %>
                                                    <tr>
                                                <%
                                                    } 
                                                                                    
                                                        String bibIDorTitle = row.getID();
                                                        String imgIcons = null;
                                                        if (form.isPrinterFriendly()) {
                                                            imgIcons = BibType.getBibTypePrinterFriendlyDescriptions(row.getBibType(), null, row.isStateOwned()); 
                                                        } else {
                                                            imgIcons = BibType.getBibTypeIcon(row.isStateOwned(), row.getBibType(), null, form.getCollectionType(), null, null);
                                                        }
                                                        String stateTextbookID = StringHelper.isEmpty(row.getTextID()) ? "" : "(State ID: " + row.getTextID() + ")";
                                                        
                                                %>
                                                
                                                       <td class="ColRowBold" vAlign="top"><%= imgIcons %>  <bean:write name="row" property="title" /> <span style = "font-weight: normal">  <%= stateTextbookID %>  </span>     </td>
                                                       <td class="ColRow" vAlign="top" nowrap="nowrap">  <bean:write name="row" property="isbnDisplayable" /></td>
                                                       <td class="ColRow" vAlign="top">               <bean:write name="row" property="publisher" />      </td>
                                                       <td class="ColRow" vAlign="top">               <bean:write name="row" property="copyright"/>       </td>
                                                       <td>&nbsp;</td>
                                                       <td class="ColRow" vAlign="top" align="center"> <%= (lh.formatNumber(store.isStateContext() ? form.getNumSentItemsWithoutBarcodes(row) + form.getMissingItems(row.getBibID(), unknownBarcode).size() : form.getNumSentItemsWithoutBarcodes(row)))%>       </td>
                                                      
                                                       <td class="tdAlignRight">
                                                        
                                                           <% if (row.getCopyCount() > 0 && form.isShowReceiveAndRerouteLinks() && !form.isPendingDiscrepancy()) { 
                                                           %>        
                                                               <logic:equal name="<%=TransferTrackViewForm.FORM_NAME%>"  property="printerFriendly" value="false">
                                                                  <base:link permission='<%= Permission.CAT_RECEIVE_TEXTBOOK_COPIES_WITHOUT_BARCODES %>' id="receive" page='<%=form.getReceiveNoBarcodeLink(bibIDorTitle)%>'>
                                                                      <base:image src="/buttons/small/receivesmall.gif" alt="<%=TransferTrackViewForm.ALT_TEXT_RECEIVE_ONE%>"/>
                                                                  </base:link>                                                
                                                                  
                                                                  <br>                                                
                                                                  <% if (!unknownBarcode && (!row.isStateOwned() || form.isRerouteAllowed())) { %>
                                                                  <base:link permission='<%= Permission.CAT_RECEIVE_TEXTBOOK_COPIES_WITHOUT_BARCODES %>' id="reroute"  page='<%=form.getRerouteNoBarcodeLink(bibIDorTitle)%>'>
                                                                      <base:image src="/buttons/small/reroutesmall.gif" alt="<%=TransferTrackViewForm.ALT_TEXT_REROUTE_ONE%>"/>
                                                                  </base:link>
                                                                  <% } %>
                                                               </logic:equal>
                                                               <base:imageSpacer width="2" height="0"></base:imageSpacer>                                   
                                                           <% } else { %>                                       
                                                            <!--  <base:imageSpacer width="2" height="18"></base:imageSpacer>                                   
                                                               <br>
                                                               <base:imageSpacer width="2" height="18"></base:imageSpacer>                                   
                                                            -->
                                                           <% } %>
                                                       </td>
                                                    </tr>       
                                                    
                                                    <%
                                                        String flipper1Color = "#FFFFFF";
                                                        if (flipper % 2 == 0) {
                                                            flipper1Color = "#E8E8E8";
                                                        }
                                                        
                                                        Collection rcvdItemsWithBarcodes = form.getItemsWithBarcodesForBibID(bibIDorTitle); 
                                                        
                                                        if (rcvdItemsWithBarcodes.size() > 0 || form.getCountOfItemsWithNeedBarcodeStatus(bibIDorTitle) > 0 || form.getMissingItems(row.getBibID(), unknownBarcode).size() > 0) {  
                                                    %>
                                                    <tr>
                                                        <td colspan="2" bgcolor="<%= flipper1Color %>">
                                                            <table id='<%= TransferTrackViewForm.TABLE_RECEIVED_SECTION + "_" + bibIDorTitle%>' cellSpacing="0" cellPadding="0" width="100%" border="0">
                                                            
                                                            <% if (form.getCountOfItemsWithNeedBarcodeStatus(bibIDorTitle) > 0) { %>
                                                            
                                                            <tr bgcolor="<%= flipper1Color %>">
                                                                <td class="SmallColHeading" nowrap="nowrap"  colspan="6"> 
                                                                    Received - Barcodes not Assigned (<%= form.getCountOfItemsWithNeedBarcodeStatus(bibIDorTitle)%>)
                                                                </td>
                                                            </tr>
                                                            
                                                            <% } %>
                                                            <%if (rcvdItemsWithBarcodes.size() > 0) { %>
                                                                    <tr bgcolor="<%= flipper1Color %>">
                                                                        <td class="SmallColHeading" nowrap="nowrap">
                                                                            Received - Barcodes <%=unknownBarcode ? "Identified" : "Assigned"%> (<%= rcvdItemsWithBarcodes.size() %>)
                                                                        </td> 
                                                                        <td>
                                                                            <table>
                                                                                <tr>
                                                                                    <td class="SmallColHeading">
                                                                                        <%= form.getShowMoreLess(bibIDorTitle) %>
                                                                                    </td>
                                                                                </tr>
                                                                            </table>
                                                                        </td>
                                                                    </tr>
                                                            <% } %>
                                                            <% if (form.isShowBarcodeDetail(bibIDorTitle)) { %>
                                                                <tr>
                                                                    <td colspan="2">
                                                                        <table width="100%">
                                                                        <tr>
                                                                            <td>
                                                                                <table id="<%= TransferTrackViewForm.TABLE_BARCODE_TABLE %>" cellpadding="0" cellSpacing="0" width="100%">
                                                                                <tr>
                                                                                    <td width="100%" class="SmallColHeading">Barcode</td>
                                                                                    <td>&nbsp;</td>
                                                                                </tr>
                                                                                
                                                                                <%
                                                                                    int flipper2 = 1;
                                                                                    for (Iterator iter = rcvdItemsWithBarcodes.iterator(); iter.hasNext();) {
                                                                                        TransferViewItem item = (TransferViewItem) iter.next();
                                                                                        
                                                                                        String flipper2Color = "#E8E8E8";
                                                                                        if ((flipper2++) % 2 == 1) {
                                                                                            flipper2Color = "#FFFFFF";
                                                                                        }
                                                                                %>
                                                                                    
                                                                                    <tr bgcolor="<%= flipper2Color %>">
                                                                                        <td width="100%" class="ColRow">
                                                                                            <%= item.getCurrentCopyBarcodeDisplayable() %>
                                                                                        </td>
                                                                                        <td>
                                                                                            &nbsp;
                                                                                        </td>
                                                                                    </tr>
                                                                                <%
                                                                                    }
                                                                                %>
                                                                                
                                                                                <tr>
                                                                                    <td colspan="2">
                                                                                        <base:imageSpacer width="2" height="3"></base:imageSpacer>
                                                                                    </td>
                                                                                </tr>
                                                                                </table>
                                                                            </td>
                                                                        </tr>
                                                                        </table>
                                                                    </td>
                                                                  </tr>
                                                    <% } %>   
                                                            <%-- if (form.getCountOfItemsWithNeedBarcodeStatus(bibIDorTitle) == 0 && rcvdItemsWithBarcodes.size() == 0 ) { %>
                                                                <tr bgcolor="<%=flipper1Color %>">
                                                                    <td>&nbsp;</td>
                                                                </tr>
                                                            <% } --%>
                                                            <% if (form.getMissingItems(row.getBibID(), unknownBarcode).size() > 0) { %>
                                                                <tr bgcolor = "<%= flipper1Color %>">
                                                                    <td class = "SmallColHeading" nowrap = "nowrap" colspan = "6" >
                                                                        Copies Missing (<%= form.getMissingItems(row.getBibID(), unknownBarcode).size() %>)
                                                                    </td>
                                                                </tr>
                                                        <% } %>    
                                                            </table>
                                                        </td>
                                                        <td colspan="4" bgcolor="<%=flipper1Color %>">
                                                            &nbsp;
                                                        </td>
                                                    </tr>
                                                    <% } %>
                                                                                                    
                                                                                                    
                                                    
                                                <% flipper++; %>
                                        </logic:iterate>
                                    </table>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
            <%} %>
        </logic:equal> 
        <!-- End of TEXTBOOK logic --> 
        
            <!--  Start of ASSET logic -->
        <logic:equal property="collectionType" name="<%= TransferTrackViewForm.FORM_NAME%>" value="<%= String.valueOf(CollectionType.ASSET) %>" >
            <%-- Start of Sent without Barcodes --%> 
            <logic:equal name="<%=TransferTrackViewForm.FORM_NAME%>" property="displayUnbarcodedResources" value="true">       
            <%
                isTextbookTransferWithoutBarcodes = true;                 
                int flipper = 0;
                int numReceivedTransfers = form.getReceivedTransfers().size() + form.getReceivedTransfersNonTextbook().size();
            %>                                                     

                <tr>
                    <td>
                        <table id="<%=TransferTrackViewForm.TABLE_SENT_WITHOUT_BARCODE_HEADER%>" border="0" width="100%">
                            <tr>
                               <td class="TableHeading2">Items Sent Without Barcodes (<%=lh.formatNumber(form.getNumSentItemsWithoutBarcodesForResources())%>)</td>
                            </tr>
                            <% 
                            if (numReceivedTransfers > 0) { %>
                                <tr>
                                    <td class="TableHeading2">Items Received (<%=numReceivedTransfers%>)</td>
                                </tr>
                            <% } %>
                            <tr>
                                <td>                        
                                    <table id="<%=TransferTrackViewForm.TABLE_SENT_WITHOUT_BARCODE_DETAIL%>" cellSpacing="0" cellPadding="3" width="100%" border="0">
                                     <% if (form.getItemsSentAndReceivedWithoutBarcodeNonTextbook().size() > 0){  %>
                                        <tr>
                                            <td class="SmallColHeading" vAlign="bottom">Resource Description</td>
                                            <td>&nbsp;</td>
                                            <td>&nbsp;</td>
                                            <td>&nbsp;</td>
                                            <td class="SmallColHeading" vAlign="bottom">Custodian</td>
                                            <td class="SmallColHeading" vAlign="bottom" align="center">Items to Receive</td>
                                            <td>&nbsp;</td>
                                        </tr>
                                    <logic:iterate id="row" name="<%=TransferTrackViewForm.FORM_NAME%>" property="itemsSentAndReceivedWithoutBarcodeNonTextbook" type="TransferViewItem">
                                    <%  
                                    if ( ( flipper & 1 ) == 0 ) { %>
                                        <tr bgcolor="#E8E8E8">
                                    <% } else { %>
                                        <tr>
                                    <% } 
                                        String bibIDorTitle = row.getID();
                                    %> 
                                           <td class="ColRowBold" vAlign="top"><bean:write name="row" property="title" /></td>
                                           <td>&nbsp;</td>
                                           <td>&nbsp;</td>
                                           <td>&nbsp; </td>
                                           <td class="ColRow" vAlign="top"><bean:write name="row" property="custodian"/></td>
                                           <td class="ColRow" vAlign="top" align="center"> <%= (lh.formatNumber(form.getNumSentItemsWithoutBarcodes(row)))%></td>
                                           <td class="tdAlignRight">  
                                           <% if (row.getCopyCount() > 0 && form.isShowReceiveAndRerouteLinks() && !form.isPendingDiscrepancy()) { 
                                               %>        
                                                   <logic:equal name="<%=TransferTrackViewForm.FORM_NAME%>"  property="printerFriendly" value="false">
                                                      <base:link permission='<%= Permission.CAT_MANAGE_RECEIVE_ASSET_ITEMS_WITHOUT_BARCODES %>' id="receive" page='<%=form.getReceiveNoBarcodeLink(bibIDorTitle)%>'>
                                                          <base:image src="/buttons/small/receivesmall.gif" alt="<%=TransferTrackViewForm.ALT_TEXT_RECEIVE_ONE%>"/>
                                                      </base:link>  
                                                      <br>                                                
                                                      <base:link permission='<%= Permission.CAT_MANAGE_RECEIVE_ASSET_ITEMS_WITHOUT_BARCODES %>' id="reroute"  page='<%=form.getRerouteNoBarcodeLink(bibIDorTitle)%>'>
                                                          <base:image src="/buttons/small/reroutesmall.gif" alt="<%=TransferTrackViewForm.ALT_TEXT_REROUTE_ONE%>"/>
                                                      </base:link>  
                                                   </logic:equal>
                                                   <base:imageSpacer width="2" height="0"></base:imageSpacer>                                   
                                               <% } else { %>                                       
                                                <!--  <base:imageSpacer width="2" height="18"></base:imageSpacer>                                   
                                                   <br>
                                                   <base:imageSpacer width="2" height="18"></base:imageSpacer>                                   
                                                -->
                                               <% } %>
                                           </td>
                                        </tr>  
                                        <%
                                            String flipper1Color = "#FFFFFF";
                                            if (flipper % 2 == 0) {
                                                flipper1Color = "#E8E8E8";
                                            }
                                            
                                            Collection rcvdItemsWithBarcodes = form.getItemsWithBarcodesNonTextbookForBibID(bibIDorTitle); 
                                            
                                            if (rcvdItemsWithBarcodes.size() > 0 || form.getCountOfItemsWithNeedBarcodeStatus(bibIDorTitle) > 0) {  
                                        %>
                                        <tr>
                                            <td colspan="7" bgcolor="<%= flipper1Color %>">
                                                <table id='<%= TransferTrackViewForm.TABLE_RECEIVED_SECTION + "_" + bibIDorTitle%>' cellSpacing="0" cellPadding="0" width="100%" border="0">
                                                
                                                <% if (form.getCountOfItemsWithNeedBarcodeStatus(bibIDorTitle) > 0) { %>
                                                
                                                <tr bgcolor="<%= flipper1Color %>">
                                                    <td class="SmallColHeading" nowrap="nowrap"  colspan="6"> 
                                                        Received - Barcodes not Assigned (<%= form.getCountOfItemsWithNeedBarcodeStatus(bibIDorTitle)%>)
                                                    </td>
                                                </tr>
                                                
                                                <% } %>
                                                <%if (rcvdItemsWithBarcodes.size() > 0) { %>
                                                        <tr bgcolor="<%= flipper1Color %>">
                                                            <td class="SmallColHeading" nowrap="nowrap">
                                                                Received - Barcodes Assigned (<%= rcvdItemsWithBarcodes.size() %>)
                                                            </td> 
                                                            <td>
                                                                <table>
                                                                    <tr>
                                                                        <td class="SmallColHeading">
                                                                            <%= form.getShowMoreLess(bibIDorTitle) %>
                                                                        </td>
                                                                    </tr>
                                                                </table>
                                                            </td>
                                                        </tr>
                                                <% } %>
                                                <% if (form.isShowBarcodeDetail(bibIDorTitle)) { %>
                                                    <tr>
                                                        <td colspan="2">
                                                            <table width="100%">
                                                            <tr>
                                                                <td>
                                                                    <table id="<%= TransferTrackViewForm.TABLE_BARCODE_TABLE %>" cellpadding="0" cellSpacing="0" width="100%">
                                                                    <tr>
                                                                        <td width="100%" class="SmallColHeading">Barcode</td>
                                                                        <td>&nbsp;</td>
                                                                    </tr>
                                                                    
                                                                    <%
                                                                        int flipper2 = 1;
                                                                        for (Iterator iter = rcvdItemsWithBarcodes.iterator(); iter.hasNext();) {
                                                                            TransferViewItem item = (TransferViewItem) iter.next();
                                                                            
                                                                            String flipper2Color = "#E8E8E8";
                                                                            if ((flipper2++) % 2 == 1) {
                                                                                flipper2Color = "#FFFFFF";
                                                                            }
                                                                    %>
                                                                        
                                                                        <tr bgcolor="<%= flipper2Color %>">
                                                                            <td width="100%" class="ColRow">
                                                                                <%= item.getCurrentCopyBarcodeDisplayable() %>
                                                                            </td>
                                                                            <td>
                                                                                &nbsp;
                                                                            </td>
                                                                        </tr>
                                                                    <%
                                                                        }
                                                                    %>
                                                                    
                                                                    <tr>
                                                                        <td colspan="2">
                                                                            <base:imageSpacer width="2" height="3"></base:imageSpacer>
                                                                        </td>
                                                                    </tr>
                                                                    </table>
                                                                </td>
                                                            </tr>
                                                            </table>
                                                        </td>
                                                      </tr>
                                        <% } %>   
                                                <%-- if (form.getCountOfItemsWithNeedBarcodeStatus(bibIDorTitle) == 0 && rcvdItemsWithBarcodes.size() == 0 ) { %>
                                                    <tr bgcolor="<%=flipper1Color %>">
                                                        <td>&nbsp;</td>
                                                    </tr>
                                                <% } --%>
                                                </table>
                                                        </td>
                                                        <td colspan="7" bgcolor="<%=flipper1Color %>">
                                                            &nbsp;
                                                        </td>
                                                    </tr>
                                                    <% } %>
                                                                                                    
                                                                                                    
                                                    
                                                <% flipper++; %>  
                                    </logic:iterate>  <!-- End of Non-Textbook Resources -->                                      
                                    <% } 
                                       if (form.getItemsSentAndReceivedWithoutBarcode().size() > 0) { 
                                       flipper = 0;
                                       %>    
                                        <tr>
                                            <td class="SmallColHeading" vAlign="bottom">Textbook Title</td>
                                            <td class="SmallColHeading" vAlign="bottom">ISBN</td>
                                            <td class="SmallColHeading" vAlign="bottom">Publisher</td>
                                            <td class="SmallColHeading" vAlign="bottom">Copyright</td>
                                            <td class="SmallColHeading" vAlign="bottom">Custodian</td>
                                            <td class="SmallColHeading" vAlign="bottom" align="center">Items to Receive</td>
                                            <td>&nbsp;</td>
                                        </tr>
                                    <logic:iterate id="row" name="<%=TransferTrackViewForm.FORM_NAME%>" property="itemsSentAndReceivedWithoutBarcode" type="TransferViewItem">
                                    <%  
                                    if ( ( flipper & 1 ) == 0 ) { %>
                                        <tr bgcolor="#E8E8E8">
                                    <% } else { %>
                                        <tr>
                                    <%
                                        } 
                                                                        
                                            String bibIDorTitle = row.getID();
                                            String imgIcons = null;
                                            if (form.isPrinterFriendly()) {
                                                imgIcons = BibType.getBibTypePrinterFriendlyDescriptions(row.getBibType(), null, row.isStateOwned()); 
                                            } else {
                                                imgIcons = BibType.getBibTypeIcon(row.isStateOwned(), row.getBibType(), null, form.getCollectionType(), null, null);
                                            }
                                            String stateTextbookID = StringHelper.isEmpty(row.getTextID()) ? "" : "(State ID: " + row.getTextID() + ")";
                                            
                                    %>  
                                            <td class="ColRowBold" vAlign="top"><%= imgIcons %>  <bean:write name="row" property="title" /> <span style = "font-weight: normal">  <%= stateTextbookID %>  </span>     </td>
                                            <td class="ColRow" vAlign="top" nowrap="nowrap">  <bean:write name="row" property="isbnDisplayable" /></td>
                                            <td class="ColRow" vAlign="top">               <bean:write name="row" property="publisher" />      </td>
                                            <td class="ColRow" vAlign="top">               <bean:write name="row" property="copyright"/>       </td>
                                            <td class="ColRow" vAlign="top"><bean:write name="row" property="custodian"/></td>
                                            <td class="ColRow" vAlign="top" align="center"> 
                                                <%= (lh.formatNumber(form.getNumSentItemsWithoutBarcodes(row)))%>
                                            </td>
                                            <td class="tdAlignRight"> 
                                            <% if (row.getCopyCount() > 0 && form.isShowReceiveAndRerouteLinks() && !form.isPendingDiscrepancy()) { 
                                               %>        
                                                   <logic:equal name="<%=TransferTrackViewForm.FORM_NAME%>"  property="printerFriendly" value="false">
                                                      <base:link permission='<%= Permission.CAT_MANAGE_RECEIVE_ASSET_ITEMS_WITHOUT_BARCODES %>' id="receive" page='<%=form.getReceiveNoBarcodeLink(bibIDorTitle)%>'>
                                                          <base:image src="/buttons/small/receivesmall.gif" alt="<%=TransferTrackViewForm.ALT_TEXT_RECEIVE_ONE%>"/>
                                                      </base:link>   
                                                      <br>                                                
                                                      <base:link permission='<%= Permission.CAT_MANAGE_RECEIVE_ASSET_ITEMS_WITHOUT_BARCODES %>' id="reroute"  page='<%=form.getRerouteNoBarcodeLink(bibIDorTitle)%>'>
                                                          <base:image src="/buttons/small/reroutesmall.gif" alt="<%=TransferTrackViewForm.ALT_TEXT_REROUTE_ONE%>"/>
                                                      </base:link>                                             
                                                   </logic:equal>
                                                   <base:imageSpacer width="2" height="0"></base:imageSpacer>                                   
                                               <% } else { %>                                       
                                                <!--  <base:imageSpacer width="2" height="18"></base:imageSpacer>                                   
                                                   <br>
                                                   <base:imageSpacer width="2" height="18"></base:imageSpacer>                                   
                                                -->
                                               <% } %>
                                           </td>
                                        </tr>
                                        <%
                                            String flipper1Color = "#FFFFFF";
                                            if (flipper % 2 == 0) {
                                                flipper1Color = "#E8E8E8";
                                            }
                                            
                                            Collection rcvdItemsWithBarcodes = form.getItemsWithBarcodesForBibID(bibIDorTitle); 
                                            
                                            if (rcvdItemsWithBarcodes.size() > 0 || form.getCountOfItemsWithNeedBarcodeStatus(bibIDorTitle) > 0) {  
                                        %>
                                        <tr>
                                            <td colspan="5" bgcolor="<%= flipper1Color %>">
                                                <table id='<%= TransferTrackViewForm.TABLE_RECEIVED_SECTION + "_" + bibIDorTitle%>' cellSpacing="0" cellPadding="0" width="100%" border="0">
                                                
                                                <% if (form.getCountOfItemsWithNeedBarcodeStatus(bibIDorTitle) > 0) { %>
                                                
                                                <tr bgcolor="<%= flipper1Color %>">
                                                    <td class="SmallColHeading" nowrap="nowrap"  colspan="6"> 
                                                        Received - Barcodes not Assigned (<%= form.getCountOfItemsWithNeedBarcodeStatus(bibIDorTitle)%>)
                                                    </td>
                                                </tr>
                                                
                                                <% } %>
                                                <%if (rcvdItemsWithBarcodes.size() > 0) { %>
                                                        <tr bgcolor="<%= flipper1Color %>">
                                                            <td class="SmallColHeading" nowrap="nowrap">
                                                                Received - Barcodes Assigned (<%= rcvdItemsWithBarcodes.size() %>)
                                                            </td> 
                                                            <td>
                                                                <table>
                                                                    <tr>
                                                                        <td class="SmallColHeading">
                                                                            <%= form.getShowMoreLess(bibIDorTitle) %>
                                                                        </td>
                                                                    </tr>
                                                                </table>
                                                            </td>
                                                        </tr>
                                                <% } %>
                                                <% if (form.isShowBarcodeDetail(bibIDorTitle)) { %>
                                                    <tr>
                                                        <td colspan="2">
                                                            <table width="100%">
                                                            <tr>
                                                                <td>
                                                                    <table id="<%= TransferTrackViewForm.TABLE_BARCODE_TABLE %>" cellpadding="0" cellSpacing="0" width="100%">
                                                                    <tr>
                                                                        <td width="100%" class="SmallColHeading">Barcode</td>
                                                                        <td>&nbsp;</td>
                                                                    </tr>
                                                                    
                                                                    <%
                                                                        int flipper2 = 1;
                                                                        for (Iterator iter = rcvdItemsWithBarcodes.iterator(); iter.hasNext();) {
                                                                            TransferViewItem item = (TransferViewItem) iter.next();
                                                                            
                                                                            String flipper2Color = "#E8E8E8";
                                                                            if ((flipper2++) % 2 == 1) {
                                                                                flipper2Color = "#FFFFFF";
                                                                            }
                                                                    %>
                                                                        
                                                                        <tr bgcolor="<%= flipper2Color %>">
                                                                            <td width="100%" class="ColRow">
                                                                                <%= item.getCurrentCopyBarcodeDisplayable() %>
                                                                            </td>
                                                                            <td>
                                                                                &nbsp;
                                                                            </td>
                                                                        </tr>
                                                                    <%
                                                                        }
                                                                    %>
                                                                    
                                                                    <tr>
                                                                        <td colspan="2">
                                                                            <base:imageSpacer width="2" height="3"></base:imageSpacer>
                                                                        </td>
                                                                    </tr>
                                                                    </table>
                                                                </td>
                                                            </tr>
                                                            </table>
                                                        </td>
                                                      </tr>
                                        <% } %>   
                                                <%-- if (form.getCountOfItemsWithNeedBarcodeStatus(bibIDorTitle) == 0 && rcvdItemsWithBarcodes.size() == 0 ) { %>
                                                    <tr bgcolor="<%=flipper1Color %>">
                                                        <td>&nbsp;</td>
                                                    </tr>
                                                <% } --%> 
                                                </table>
                                                        </td>
                                                        <td colspan="4" bgcolor="<%=flipper1Color %>">
                                                            &nbsp;
                                                        </td>
                                                    </tr>
                                                    <% } %>
                                                                                                    
                                                                                                    
                                                    
                                                <% flipper++; %>                                          
                                        </logic:iterate> <!-- End of Textbook Resources -->
                                    <% } %>     
                                    </table>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </logic:equal>
        </logic:equal>         

        <!--  End of ASSET logic -->
        
        <% 
}
        // Textbooks without barcodes will have their own display logic due to 
        // the ability to receive textbooks withuout barcodes (status 109 - Needs Barcode).
        // The display logic for textbooks without barcodes is handled above.
        if (!isTextbookTransferWithoutBarcodes) { %>
            
            <%-- Received --%>
            <logic:notEqual name="numReceivedItems" value="0">
                <tr>
                    <td>
                        <table id="<%=TransferTrackViewForm.TABLE_RECEIVED_HEADER%>" width="100%" border="0">
                            <tr>
                                <td class="TableHeading2"><%=copyDescription %> Received (<bean:write name="numReceivedItems"/>)</td>
                            </tr>
                            <tr>
                                <td>
                                    <table id="<%=TransferTrackViewForm.TABLE_RECEIVED_DETAIL%>" cellSpacing="0" cellPadding="5" width="100%" border="0">
                                        <% if (CollectionType.ASSET == form.getCollectionType() && form.getReceivedTransfersNonTextbook().size() > 0) { %>
                                           <tr>
                                               <td class="SmallColHeading" vAlign="bottom">Resource Description</td>
                                               <td class="SmallColHeading" vAlign="bottom">&nbsp;</td>
                                               <td class="SmallColHeading" vAlign="bottom">&nbsp;</td>
                                               <td class="SmallColHeading" vAlign="bottom">&nbsp;</td>
                                               <td class="SmallColHeading" vAlign="bottom">Custodian</td>
                                               <td class="SmallColHeading" vAlign="bottom">Items</td>
                                               <td>&nbsp;</td>
                                           </tr>
                                           <base:TransferItem items="<%=form.getReceivedTransfersNonTextbook()%>" 
                                                  showReceiveButton="false" 
                                                  showReceiveAndTransferButton="false" 
                                                  expandedID="<%=form.getExpandedID()%>"
                                                  expandedMode="<%=form.EXPANDED_MODE_RCVD %>"
                                                  formName="<%=TransferTrackViewForm.FORM_NAME%>"/>
                                       <% }
                                          if (CollectionType.TEXTBOOK == form.getCollectionType() || form.getReceivedTransfers().size() > 0) { %>
                                           <tr>
                                               <td class="SmallColHeading" vAlign="bottom"><%=CollectionType.ASSET == form.getCollectionType() ? "Textbook " : "" %>Title</td>
                                               <td class="SmallColHeading" vAlign="bottom">ISBN</td>
                                               <td class="SmallColHeading" vAlign="bottom">Publisher</td>
                                               <td class="SmallColHeading" vAlign="bottom">Copyright</td>
                                               <td class="SmallColHeading" vAlign="bottom"><%=CollectionType.ASSET == form.getCollectionType() ? "Custodian" : "" %></td>
                                               <td class="SmallColHeading" vAlign="bottom"><%=copyDescription %></td>
                                               <td>&nbsp;</td>
                                           </tr>
                                           <base:TransferItem items="<%=form.getReceivedTransfers()%>" 
                                                  showReceiveButton="false" 
                                                  showReceiveAndTransferButton="false" 
                                                  expandedID="<%=form.getExpandedID()%>"
                                                  expandedMode="<%=form.EXPANDED_MODE_RCVD %>"
                                                  formName="<%=TransferTrackViewForm.FORM_NAME%>"/>
                                       <% } %>
                                    </table>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </logic:notEqual>
            <%-- Missing  --%>
            <% if (form.getMissingItems().size() > 0) { %>
                <tr>
                    <td>
                        <table id="<%=TransferTrackViewForm.TABLE_MISSING_HEADER%>" width="100%" border="0">
                            <tr>
                            <% String whatHappenedToCopies = "";
                                if (((TransferViewItem)form.getMissingItems().get(0)).isLost()) {
                                    whatHappenedToCopies = "- Marked Lost"; 
                                } else if (((TransferViewItem)form.getMissingItems().get(0)).isCopyDeleted()) {
                                    whatHappenedToCopies = "- Deleted";
                                }
                                %>
                                <td class="TableHeading2" style = "color:#CC0000">Copies Missing <%= whatHappenedToCopies %> (<%= form.getMissingItems().size() %>) &nbsp; &nbsp;
                                    <%if (form.isStateRepository() && form.isPendingDiscrepancy() && !resolveButtonsAtTop && !form.isPrinterFriendly()) {%>
                                            <base:genericButton name="<%=form.BUTTON_DELETE_ALL %>" src="/buttons/large/deleteall.gif"  alt="Delete All Missing Copies" absbottom="true"></base:genericButton>
                                            <% if (!form.isAllConsumables()) { %>
                                                <base:genericButton name="<%=form.BUTTON_MARK_LOST %>" src="/buttons/large/marklost.gif"  alt="Mark Missing Copies Lost" absbottom="true"></base:genericButton>
                                        <%      }
                                          } else { %>
                                            &nbsp;
                                        <% } %>
                                </td>
                            </tr>
                            <tr>
                                <td colspan = "2">
                                    <table id="<%=TransferTrackViewForm.TABLE_MISSING_DETAIL%>" cellSpacing="0" cellPadding="5" width="100%" border="0">
                                        <tr>
                                            <td class="SmallColHeading" vAlign="bottom">Title</td>
                                            <td class="SmallColHeading" vAlign="bottom">ISBN</td>
                                            <td class="SmallColHeading" vAlign="bottom">Publisher</td>
                                            <td class="SmallColHeading" vAlign="bottom">Copyright</td>
                                            <td class="SmallColHeading" vAlign="bottom">Copies</td>
                                        </tr>
                                        
                                        <base:TransferItem items="<%=form.getMissingItems()%>" 
                                                  showReceiveButton="false" 
                                                  showReceiveAndTransferButton="false" 
                                                  expandedID="<%=form.getExpandedID()%>"
                                                  expandedMode="<%=form.EXPANDED_MODE_MISSING %>"
                                                  formName="<%=TransferTrackViewForm.FORM_NAME%>"/>
                                    </table>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
            <% } %>
        <%} %>
        
        <% if (!form.isPrinterFriendly() &&
                 form.getCollectionType() == CollectionType.TEXTBOOK &&
                 form.getStateTransferID() != null &&
                 (!form.getItemsSentWithoutBarcodes().isEmpty() ||
                   form.isTransferContainingNeedsBarcodeStatus()) &&
                   form.getCountUnreceivedCopies() > 0 &&
                   !form.isPendingDiscrepancy() &&
                   !form.getStore().isStateContext()) {%>
                 <tr>
                    <td>
                       <table width="100%" id="<%=TransferTrackViewForm.TABLE_FOOTER%>">
                            <tr>
                                <td colspan="2">
                                    <base:imageLine/>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <span class="TableHeading2">Missing copies from this transfer?</span><br/>
                                    <span class="ColRow">Click Incomplete to close this transfer and record the discrepancy.
                                    <%=form.getIncompleteMessage() %>
                                </td>
                                <td class="tdAlignRight" valign="top">
                                    <base:genericButton src = "/buttons/large/incomplete.gif" name = "<%= TransferTrackViewForm.BUTTON_INCOMPLETE %>" alt = "Incomplete Transfer"/>
                                </td>
                            </tr>
                        </table>
                    </td>
                 </tr>
        <% } %>
       </table>                       
       </logic:equal>
</base:form>

<logic:present name="<%=form.FORM_NAME %>" property="soundFile" scope="request">

<jsp:include page="/circulation/setsound.jsp"/>

<script language="JavaScript">
<!--
    setSound("<bean:write name="<%=form.FORM_NAME %>" property="soundFile"/>");
//-->
</script>

</logic:present>

