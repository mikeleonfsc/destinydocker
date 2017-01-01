<%@ page language="java" %> 
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>

<%@page import="com.follett.fsc.destiny.client.common.servlet.GenericForm"%>
<%@page import="com.follett.fsc.common.StringHelper"%>
<%@ page import="com.follett.fsc.destiny.util.ObjectHelper" %> 

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="com.follett.fsc.common.LocaleHelper"%>


<bean:define id="inventoryList" name="<%= InventoryForm.FORM_NAME %>" property="partialAssetInventoryList" />
<%
    InventoryForm form = (InventoryForm)request.getAttribute(InventoryForm.FORM_NAME);
    String inventoryType = null;
    String callNumberOrLocation = null;
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    String inventoryStartedMessage = null;
    boolean isFullAssetOrTextbookInventory = ( !form.isWithinPartialInventory() );
    String finalizeInventoryType = form.isStateInitiatedInventory() ?
        MessageHelper.formatMessage("inventory_StateTextbookOffice") :
        MessageHelper.formatMessage("inventory_District");
    String partialInventoryClose = MessageHelper.formatMessage("inventory_ThisWillFinalizeThisInventory");
    String areYouSureCloseInventory = MessageHelper.formatMessage("inventory_AreYouSureYouWantToFinalizeThisInventory");
  	Permission permToCheck = form.gimmePermissionToCheck();
	String finalizePartialInventoryString = MessageHelper.formatMessage("inventory_FinalizePartialInventory");
	
    switch (form.getCollectionType()) {
        case BibMasterSpecs.COLLECTION_TYPE_MEDIA:
            inventoryStartedMessage = MessageHelper.formatMessage("inventory_Inventory");
    		callNumberOrLocation = MessageHelper.formatMessage("inventory_CallNumber");
            break;
        case BibMasterSpecs.COLLECTION_TYPE_LIBRARY:
            inventoryStartedMessage = MessageHelper.formatMessage("inventory_LibraryInventory");
    		callNumberOrLocation = MessageHelper.formatMessage("inventory_CallNumber");
            break;
        case BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK:
            inventoryStartedMessage = MessageHelper.formatMessage("inventory_TextbookInventory");
    		callNumberOrLocation = MessageHelper.formatMessage("inventory_Location");
            break;
        case BibMasterSpecs.COLLECTION_TYPE_ASSET:
            inventoryStartedMessage = MessageHelper.formatMessage("inventory_AssetInventory");
    		callNumberOrLocation = MessageHelper.formatMessage("inventory_Location");
    		finalizePartialInventoryString = MessageHelper.formatMessage("inventory_FinalizeInventory");
            break;
    }
    if (form.isWithinPartialInventory()) {
        inventoryType = inventoryStartedMessage;
    } else {
        if (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK) {
        	if ( store.isDistrictUser() && store.isStateContext()) {
        	    inventoryType = MessageHelper.formatMessage("inventory_TextbookInventoryNoActiveStateInventories");
        	} else {
                inventoryType = MessageHelper.formatMessage("inventory_TextbookInventory");
        	}
        } else if (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_ASSET) {
        	if ( store.isDistrictUser() ) {
        	    inventoryType = MessageHelper.formatMessage("inventory_AssetInventoryNoActiveDistrictwideInventories");
        	} else {
                inventoryType = MessageHelper.formatMessage("inventory_AssetInventory");
        	}
        } else if (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_LIBRARY) {
            inventoryType = MessageHelper.formatMessage("inventory_LibraryInventory");
        } else {
            inventoryType = MessageHelper.formatMessage("inventory_Inventory");
        }
    }
    String focus = "";
    if (form.getAccountingMode() == InventoryForm.MODE_ACCOUNT_FOR_EACH_BARCODE || 
        !ObjectHelper.isIntInArray(form.getCollectionType(), CollectionType.TEXTBOOK, CollectionType.ASSET)) {
        focus = InventoryForm.FIELD_SCAN_BARCODE;
    }
    
    
    // !!! Solved this mess by simply putting in javascript to put the scrollbar to the top anytime the page reloads.
    
    // Need to hide focus whenever a message box is displayed or else the view can be skewed
    // in 800x600
    // boolean hideFocusOnMessageBox = form.isShowLocationAlertBox() ||  
    //    form.isFinalizePartialInventory() || form.isFinishPartialInventory() || form.isConfirmMarkAsLost() || 
    //    InventoryForm.ACTION_UPLOAD.equals(form.getAction())
    //    || form.getTransferCopyList() != null || 
    //    (form.getComponentList() != null && ! form.getComponentList().isEmpty());
   // if ( store.isStateContext() && !isFullAssetOrTextbookInventory && !form.isDistrictBasedInventory() && !hideFocusOnMessageBox ) {
        // do nothing    
   // } else {
    //    if (hideFocusOnMessageBox || isFullAssetOrTextbookInventory || store.isDistrictUser()) {
     //       focus = "";
      //  }
  // }
    
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>
<c:set var="form" value="<%=form %>"/>
<base:messageBox strutsErrors="true"/>

<%if (form.getUnfinishedTransferCount() > 0 && form.isStateInitiatedInventory())  {
    String message = "";
    
    if (!StringHelper.isEmptyOrWhitespace(message)) { 
        message += "<br/>";
    }
    int c = form.getUnfinishedTransferCount();
    message += MessageHelper.formatMessage("inventory_YouWillNotBeAbleToScanOrEnter",
        ResponseUtils.filter(form.getCurrentPartialInventoryVO().getEntityVO().getName()));
    message += "<br>";
    message += MessageHelper.formatMessage("inventory_IncomingTransfersToReceive", Long.valueOf(c));
    focus = "";
%>    
    <base:messageBox tableID="<%=InventoryForm.TABLE_STATE_WARNING %>">
        <tr valign="top">
            <td class="ColRowBold"><%= MessageHelper.formatMessage("inventory_StateTextbookInventoryInProgress") %></td>
        </tr>
        <tr valign="top">
            <td class="ColRow"><%=message %></td>
        </tr>
    </base:messageBox>
<%
}    
%>




<logic:equal name="backoffice_servlet_InventoryForm" property="action" value="<%= InventoryForm.ACTION_UPLOAD %>">
    <base:imageSpacer width="1" height="3"/>
    <center>
    <base:messageBox>
        <tr valign="top" align="center">
            <td class="ColRowBold" align="center"><%= MessageHelper.formatMessage("inventory_YourInventoryFileHasBeenSentToTheJobManagerAndWill") %></td>
        </tr>
    </base:messageBox>
    </center>
    <br>
</logic:equal>
<% 
    if ( ObjectHelper.isIntInArray(form.getCollectionType(), CollectionType.TEXTBOOK, CollectionType.ASSET)) {
       if ( (form.getErrors() == null || form.getErrors().size() == 0) && (URLHelper.buttonWasPressed(request, InventoryForm.BUTTON_FINALIZE_PARTIAL_INVENTORY) || URLHelper.buttonWasPressed(request, InventoryForm.BUTTON_FINISH_PARTIAL_INVENTORY))) {
           long uncountedTitles = form.getUnbarcodedInventoryInfo().getTotalTitlesNotCountedForInInventory();
           if (uncountedTitles > 0 ) { 
            form.setFinalizePartialInventory(false);
            form.setFinishPartialInventory(false);
            String headerMessage = MessageHelper.formatMessage("inventory_TitlesWithoutCounts", Long.valueOf(uncountedTitles));
            String detailMessage = MessageHelper.formatMessage("inventory_YouMustEnterANumberForThe");
            if ( form.getCollectionType() == CollectionType.ASSET) {
                headerMessage = MessageHelper.formatMessage("inventory_ResourcesWithoutCounts", Long.valueOf(uncountedTitles));
                detailMessage = MessageHelper.formatMessage("inventory_YouMustEnterANumberForThe_Asset");
            }
            %>
            <base:imageSpacer width="1" height="3"/>
            <center>
            <base:messageBox showWarningIcon="true" header="<%=headerMessage%>" message ="<%=detailMessage%>">
            </base:messageBox>
            </center>
            <br>
<%  }    
    } 
   }
%>
<base:form action="/backoffice/servlet/handleinventoryform.do" focus="<%= focus %>" enctype="multipart/form-data">

<c:if test="<%=form.isPrinterFriendly()%>">
<table width="100%" id=<%=InventoryForm.TABLE_COUNT_UNBARCODED_RESULTS %> border="0" cellspacing="0" cellpadding="2">
                            <tr>
                            <td class="SmallColHeading"><%=form.getTitleCount() %></td>
                            <td class="SmallColHeading">&nbsp;</td>
                            <td class="SmallColHeading tdAlignRight">
                            <%if (form.getPage() != -1 ) {
                                out.println(MessageHelper.formatMessage("inventory_Page", Long.valueOf(form.getPage() + 1)));
                            }
                            %>
                            </td>
                            </tr>
                            <tr>
                            <% if ( form.getCollectionType() != CollectionType.ASSET ) { %>
                                <td class="SmallColHeading"><%= MessageHelper.formatMessage("inventory_Title") %></td>
                                <td class="SmallColHeading" align="center"><%= MessageHelper.formatMessage("inventory_CopyCount") %></td>
                            <% } else { %>    
                                <td class="SmallColHeading"><%= MessageHelper.formatMessage("inventory_Asset") %></td>
                                <td class="SmallColHeading" align="center"><%= MessageHelper.formatMessage("inventory_ItemCount") %></td>
                            <% } %>                                
                            <td class="SmallColHeading" align="center"><%= MessageHelper.formatMessage("inventory_InventoryCount") %></td>                    
                            </tr>
                            <logic:iterate indexId="flipper" id="invenItem" name="<%=form.FORM_NAME%>" property="bibList" type="com.follett.fsc.destiny.session.backoffice.data.InventoryCopyCountUpdateVO">
                                <%
                                String userValue = form.gimmeBadData(invenItem.getRecID());
                                String additionalFontData = "";
                                String additionalEndFontData = "";
                                boolean showMatIcon = invenItem.getCollectionType() != CollectionType.ASSET || invenItem.isTextbookAsset();
                                %>
                                <%if (userValue != null) {
                                    additionalFontData = "<font color=\"#CC0000\" id=\"" + InventoryForm.RED_ROW
                                        + invenItem.getRecID() + "\">";
                                    additionalEndFontData = "</font>";
                                } %>
                                <tr <%=( ( (1 & flipper.intValue())==0)? "bgColor=\"#E8E8E8\"" : "" )%> >
                                <%if (userValue == null ) { 
                                     if (invenItem.getCopiesAccountedForFromDatabase() != null ) {
                                        userValue = invenItem.getCopiesAccountedForFromDatabase().toString(); 
                                    } else {
                                        userValue = "";
                                    } 
                                 }%>
                                   <td>
                                      <table width="100%" id="<%=InventoryForm.TABLE_COUNT_UNBARCODED_BIB_RESULT %>${invenItem.recID}" >
                                         <tr>
                                            <td class="ColRowBold">
                                            <% if (showMatIcon) { %>
                                                <base:bibTypeIcon rec="${invenItem}" printerFriendly="<%= form.isPrinterFriendly() %>"/>
                                            <% } %>
                                            <%=additionalFontData%>
                                            <c:out value="${invenItem.title}"/>
                                            <%=additionalEndFontData %> 
                                            <c:if test = "${invenItem.outOfAdoption}">
                                                <span style = "font-size: .75em;"><%= MessageHelper.formatMessage("inventory_OutOfAdoption") %></span>
                                            </c:if>                                        
                                            </td>
                                         </tr>
                                         <tr>
                                            <td class="ColRow">
                                                <c:out value="${invenItem.author}"/>
                                                <c:if test="${! empty invenItem.author}">
                                                    &nbsp;&nbsp;&nbsp;
                                                </c:if>
                                                <%=BibMasterSpecs.getDisplayableStandardNumberBasedOnLocale(invenItem.getDisplayableISBNOrISSN())%>
                                            </td>
                                         </tr>
                                         <tr>
                                            <td class="ColRow">
                                            <c:out value="${invenItem.publisher}"/>
                                            <c:if test="${! empty invenItem.publisher}">
                                                &nbsp;&nbsp;&nbsp;
                                            </c:if>
                                            <c:out value="${invenItem.pubYear}"/>
                                            </td>
                                         </tr>
                                         <c:if test="${! empty invenItem.stateTextID}">
                                         <tr>
                                            <td class="ColRow"><%=MessageHelper.formatMessage("inventory_StateTextbookID", invenItem.getStateTextID()) %></td>
                                         </tr>
                                         </c:if>
                                      </table>
                                   </td>
                                   <td class="ColRowBold" align="center">
                                     <%=additionalFontData%>
                                     <c:out value="${invenItem.copiesWithoutBarcodes}"/>
                                     <%=additionalEndFontData %>
                                   </td>
                                   <td class="ColRowBold" align="center">
                                    
                                       ${invenItem.copiesAccountedForFromDatabase}
                                   
                                    </td>
                                   
                                </tr>
                            </logic:iterate>
                            </table>
                            
</c:if> <!-- printer friendly -->
<c:if test="<%=!form.isPrinterFriendly()%>">



<c:if test="<%=form.getComponentList() != null && ! form.getComponentList().isEmpty() %>">
    <br>
    <base:messageBox showRedBorder="true">
    <tr>
        <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
        <td valign="baseline" class="Error">
            <html:hidden property="<%=InventoryForm.FIELD_COMPONENT_COPY_ID %>" />
            <html:hidden property="<%=InventoryForm.FIELD_PREVIOUS_BARCODE %>" />
            <bean:write name="<%= InventoryForm.FORM_NAME %>" property="<%=InventoryForm.FIELD_COMPONENT_INFO_HEADER %>"/> 
            <base:textbookComponentKit componentList="<%=form.getComponentList() %>"/>
        </td>
    </tr>
    </base:messageBox>
    
    <br>
</c:if>
<logic:present name="<%= InventoryForm.FORM_NAME %>" property="<%=InventoryForm.PARAM_TRANSFER_COPY_LIST%>">
    <base:imageSpacer width="1" height="3"/>
    <center>
    <base:messageBox>
    <base:transferOnScan formName="<%=InventoryForm.FORM_NAME%>"></base:transferOnScan>
    </base:messageBox>
    </center>
</logic:present>



    
    <logic:equal name="<%=InventoryForm.FORM_NAME%>" property="showLocationAlertBox" value="true">
	    <base:imageSpacer width="1" height="3"/>
		<html:hidden property="copyIDToUpdateLocation"/>
		<base:messageBox showRedBorder="true">
	        <tr>
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
	            <td align="center" class="ColRow">
	            <%=form.getUpdateLocationPrompt() %>
	            </td>
	        </tr>
	        
	        <tr>
	            <td valign="baseline" align="center" class="Instruction" colspan="2"><%= MessageHelper.formatMessage("inventory_YouMayWantToPrintThisPageForYourRecordsBeforeProce") %></td>
	        </tr>
	        <tr>
	            <td valign="baseline" align="center" class="ColRow" colspan="2">
	                <base:yesNo/>
	            </td>
	        </tr>
	    </base:messageBox>
	</logic:equal>   
    
    <html:hidden property="<%=InventoryForm.PARAM_COLLECTION_TYPE%>"/>
    <html:hidden property="<%= InventoryForm.BUTTON_NAME_ON_SUBMIT %>" value="false"/>
    <html:hidden property="<%= InventoryForm.FIELD_USER_CLICKED_VIEW_IN_PROGRESS %>" value="false"/>
    <html:hidden property="withinPartialInventory"/>
    <html:hidden property = "<%= InventoryForm.FIELD_ACCOUNTING_MODE %>" />
    <html:hidden property = "<%= InventoryForm.FIELD_OLD_ACCOUNTING_MODE %>" />
    <html:hidden property = "<%= InventoryForm.FIELD_OLD_INVENTORY_ID %>" value='<%="" + form.getAssetInventoryListID() %>'/>
    <html:hidden property="<%=InventoryForm.PARAM_ACTION %>" />
    <html:hidden property="<%=InventoryForm.PARAM_PAGE %>" />
    <html:hidden property="<%=InventoryForm.PARAM_OLD_PAGE %>" />
    <input type="hidden" name="<%=InventoryForm.PARAM_SAVE_ID %>" value='<%=""+form.getSaveID() %>'/>
    
    <logic:equal name="<%=InventoryForm.FORM_NAME%>" property="finishPartialInventory" value="true">
        <%String finalizeMsg;
            if ( form.isStateInitiatedInventory() ) {
                finalizeMsg = MessageHelper.formatMessage("inventory_YouAreIndicatingThatYouHaveFinishedYourPartOf");
            } else {
                finalizeMsg = MessageHelper.formatMessage("inventory_ByIndicatingThatYouAreFinishedWithYourPartInventory");
            }%>
        <base:messageBox showWarningIcon="true" message="<%=finalizeMsg %>">
            <tr>
                <td align="center" class="ColRow" colspan="2">
					<%=form.gimmeFinishMessage(finalizeInventoryType) %>
					<BR><%= MessageHelper.formatMessage("inventory_AreYouSureThatYouAreFinished") %></td>
            </tr>
            <tr>
                <td align="center" class="ColRow" colspan="2">
         <base:yesNo
             buttonYesName="<%=InventoryForm.BUTTON_FINISH_PARTIAL_INVENTORY_YES%>"
             buttonNoName="<%=InventoryForm.BUTTON_FINISH_PARTIAL_INVENTORY_NO%>"
         />
                </td>
            </tr>
        </base:messageBox>
        <br>
    </logic:equal>
    
    
    <logic:equal name="<%=InventoryForm.FORM_NAME%>" property="finalizePartialInventory" value="true">
    <input type="hidden" name="<%= InventoryForm.HIDDEN_ERROR_FLAG %>" value="yes">
    
        <%if (store.isStateContext() && form.isDistrictBasedInventory() ) { %>
            <base:messageBox showWarningIcon="true" message="<%=form.gimmeFinalizeSiteCount()%>">
                <tr>
                    <td class="ColRowBold" colspan="2">
                        <font color='#CC0000'><%= MessageHelper.formatMessage("inventory_PleaseNote") %>
                        <ul><li><%= MessageHelper.formatMessage("inventory_CopiesThatAreUnaccountedForWillNeMade") %></li>
                            <li><%= MessageHelper.formatMessage("inventory_ConsumablesThatAreUnaccountedForWillBeAdjustedBut") %></li>
                        </ul>
                        </font>
                    </td>
                </tr>
                <tr>
                    <td><base:imageSpacer width="25" height="1"/></td>
                    <td align="center" nowrap>
                        <table id="<%=InventoryForm.MARK_LOST_RADIO_HOUSE %>"><tr><td class="ColRow">
                        <% if (form.getCollectionType() == CollectionType.ASSET) { %>
                            <html:radio property="<%= InventoryForm.FIELD_MARK_LOST %>" value="true"/><%= MessageHelper.formatMessage("inventory_MarkLostDeleteConsumables") %><br/>
                        <% } else { %>
                            <html:radio property="<%= InventoryForm.FIELD_MARK_LOST %>" value="true"/><%= MessageHelper.formatMessage("inventory_MarkLostAdjustConsumables") %><br/>
                        <% } %>
                        </td></tr>
                        <tr><td class="ColRow">
                        <html:radio property="<%= InventoryForm.FIELD_MARK_LOST %>" value="false"/><%= MessageHelper.formatMessage("inventory_IgnoreThemDoNotProcess") %></td></tr></table>
                    </td>
                </tr>
                <tr>
                    <td align="center" class="ColRow" colspan="2">
                        <%=areYouSureCloseInventory %><BR><BR>
                        <base:yesNo
                            buttonYesName="<%=InventoryForm.BUTTON_FINALIZE_PARTIAL_INVENTORY_YES%>"
                            buttonNoName="<%=InventoryForm.BUTTON_FINALIZE_PARTIAL_INVENTORY_NO%>"
                        />
                    </td>
                </tr>
        
            </base:messageBox>        
        <%} else { %>
            <base:messageBox showWarningIcon="true" message="<%=partialInventoryClose%>">
            <% if ( !store.isDistrictUser() && !form.isThereAnyUnaccountedForCopies() ) { %>
                <tr>
                    <td align="center" class="ColRow" colspan="2">
                        <%=areYouSureCloseInventory %><BR><BR>
                        <html:hidden property="<%= InventoryForm.FIELD_MARK_LOST %>" value="false"/>
    
                        <base:yesNo
                            buttonYesName="<%=InventoryForm.BUTTON_FINALIZE_PARTIAL_INVENTORY_YES%>"
                            buttonNoName="<%=InventoryForm.BUTTON_FINALIZE_PARTIAL_INVENTORY_NO%>"
                        />
    
                    </td>
                </tr>
            <% }  else { %>
                <tr>
                    <td align="center" colspan="2">
                        <table id="<%= InventoryForm.TABLE_UNACCOUNTED_RESTART_CONFIRM%>" 
                        border="0" cellpadding="0">
                            <tr>
                                <td colspan="2" class="ColRowBold tdAlignLeft">
                                	<%=form.gimmeFinalizePartialInventoryString() %>
                                </td>
                            </tr>
                            <logic:equal name="<%=InventoryForm.FORM_NAME%>" 
                                property="showConfirmLostRadioButtons" value="true">
                                <tr>
                                    <td><base:imageSpacer width="25" height="1"/></td>
                                    <td class="ColRow tdAlignLeft" nowrap>
                                        <html:radio property="<%= InventoryForm.FIELD_MARK_LOST %>" value="true"/><%= form.gimmeMarkLostMessage() %><br/>
                                        <c:if test = "<%= ObjectHelper.isIntInArray(form.getCollectionType(), CollectionType.TEXTBOOK, CollectionType.ASSET) %>">
                                            <html:radio property="<%= InventoryForm.FIELD_MARK_LOST %>" value="false"/><%= MessageHelper.formatMessage("inventory_IgnoreThemDoNotProcess") %>
                                        </c:if>
                                        <c:if test = "<%= !ObjectHelper.isIntInArray(form.getCollectionType(), CollectionType.TEXTBOOK, CollectionType.ASSET) %>">
                                            <html:radio property="<%= InventoryForm.FIELD_MARK_LOST %>" value="false"/><%= MessageHelper.formatMessage("inventory_IgnoreThemDontMakeThem") %>
                                        </c:if>
                                    </td>
                                </tr>
                            </logic:equal>
                            <logic:equal name="<%=InventoryForm.FORM_NAME%>" 
                                property="showConfirmLostRadioButtons" value="false">
                              <html:hidden property="<%= InventoryForm.FIELD_MARK_LOST %>" value="false"/>
                            </logic:equal>
                        </table>
                    </td>
                </tr>
                <tr>
                    <td align="center" class="ColRow" colspan="2">
                        <BR><%=areYouSureCloseInventory %><BR><BR>
                        <base:yesNo
                            buttonYesName="<%=InventoryForm.BUTTON_FINALIZE_PARTIAL_INVENTORY_YES%>"
                            buttonNoName="<%=InventoryForm.BUTTON_FINALIZE_PARTIAL_INVENTORY_NO%>"
                        />
                    </td>
                </tr>
            <% } %>
            </base:messageBox>
         <% } %>
        <br>
    </logic:equal>
    <logic:equal name="<%=InventoryForm.FORM_NAME%>" property="<%=InventoryForm.FIELD_UNABLE_TO_FINALIZE%>" value="true">
        <base:messageBox showWarningIcon="true" message='<%= MessageHelper.formatMessage("inventory_UnableToFinalizeThisInventory") %>'>
            <tr><td class="ColRow" colspan="2"><%= MessageHelper.formatMessage("inventory_CertainOutgoingTransfers") %>&nbsp;<base:link page='<%= form.getStateInventoryBlockedLink() %>' target='<%=StateTextbookInventoryBlockedForm.TARGET_NAME%>' collectionType='<%=form.getCollectionType()%>' id="<%=form.ID_CLICK_HERE %>"><%= MessageHelper.formatMessage("inventory_ClickHere") %></base:link></td></tr>
        </base:messageBox>
    </logic:equal>
    
    <base:outlinedTableAndTabsWithinThere id="<%= InventoryBaseForm.TABLE_INVENTORY_MAIN %>" cellpadding="1" selectedTab="<%=form.getCurrentTab()%>" tabs="<%=form.getTabs()%>">
    <tr>
        <td width="100%">
        	<table id="outer" width="100%">
        		<tr>
        			<td valign="top" width="100%">
			            <table cellspacing="0" cellpadding="4" border="0" id="<%= InventoryForm.TABLE_INVENTORY_STARTED %>" width="100%">
			            	<tr>
			            		<td class="Instruction">
			            			&nbsp;&nbsp;[ 
			            			<base:link onclick="clickInProgressSubmit(); return false;" page="/backoffice/servlet/presentinventorylistform.do" collectionType="<%=form.getCollectionType()%>" id="<%=form.ID_VIEW_IN_PROGRESS_COMPLETED %>">
			            			<%= MessageHelper.formatMessage("inventory_ViewInProgressCompletedInventories") %>
			            			</base:link>
			            			]
			            		</td>
			            	</tr>
				            <tr>
				                <td valign="top">
				                <span class="ColRowBold">
				                    <logic:equal name="<%=InventoryForm.FORM_NAME%>" property="withinPartialInventory" value="false">
					                  	<%=inventoryType%>
					                </logic:equal>
					                <input type="image" width="1" height="1" src="/images/icons/general/spacer.gif" name="<%= InventoryForm.BUTTON_ADD_TO_INVENTORY %>">
				                </span>
				                </td>
				                <td valign="top" class="tdAlignRight">&nbsp;</td>
				            </tr>
			                <logic:equal name="<%=InventoryForm.FORM_NAME%>" property="withinPartialInventory" value="true">
				        	<tr>
				        		<td colspan="2" class="ColRowBold"><%=inventoryType%>&nbsp;
									<html:select property="<%=InventoryForm.FIELD_ASSET_INVENTORY_LIST_ID %>" onchange="dropDownSubmit();">
						            	<html:options collection="inventoryList" property="longID" labelProperty="stringDesc"/>
						            </html:select>
				        		</td>
				        	</tr>
				        	</logic:equal>
				            <tr>
                            <% if (form.isWithinPartialInventory()) {%>
                                <% if (!ObjectHelper.isIntInArray(form.getCollectionType(), CollectionType.TEXTBOOK, CollectionType.ASSET)) {%>
                                <td class="SmallColRow"> 
                                    <%=form.getPercentComplete() %>&nbsp;<base:genericButton absbottom="true" src="/buttons/small/refresh.gif" alt='<%= MessageHelper.formatMessage("refresh") %>' name="<%= InventoryForm.BUTTON_REFRESH_PERCENT%>" />
                                </td>
                                <%} else if(form.isIncludeWithBarcodes() || form.isDistrictBasedInventory()) {%>
                                <td class="SmallColRow">
                                    <base:showHideTag  id="hidePercentComplete"> 
                                    <%=form.getPercentComplete() %>&nbsp;<base:genericButton absbottom="true" src="/buttons/small/refresh.gif" alt='<%= MessageHelper.formatMessage("refresh") %>' name="<%= InventoryForm.BUTTON_REFRESH_PERCENT%>" />
                                    </base:showHideTag>
                                </td>
                                <%} %>
                            <%} %>
				            </tr>
                            <% if (form.getUnfinishedTransferCount() == 0 || !form.isStateInitiatedInventory()) { %>
                            <c:if test = "<%= ObjectHelper.isIntInArray(form.getCollectionType(), CollectionType.TEXTBOOK, CollectionType.ASSET)%>">
                                <tr>
                                <c:choose>
                                    <c:when test = "<%= form.getCollectionType() == CollectionType.TEXTBOOK %>">
                                        <td><table id = "<%= InventoryForm.TABLE_TEXTBOOK_COPY_COUNTS %>">
                                    </c:when> 
                                    <c:otherwise>
                                        <td><table id = "<%= InventoryForm.TABLE_ASSET_ITEM_COUNTS %>">
                                    </c:otherwise>
                                </c:choose>
                                            <c:if test = "<%= form.isIncludeWithoutBarcodes() || form.isIncludeConsumables()%>">
                                                <tr>
                                                    <td class="SmallColRow tdAlignRight"><%= form.gimmeCountsForUnbarcodedCopiesInInventory() %></td>
                                                    <c:choose>
                                                        <c:when test = "<%= form.getCollectionType() == CollectionType.TEXTBOOK %>">
                                                            <td class="SmallColRow"><%= MessageHelper.formatMessage("inventory_TitlesCounted") %></td>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <td class="SmallColRow"><%= MessageHelper.formatMessage("inventory_ResourcesCounted") %></td>
                                                        </c:otherwise>
                                                    </c:choose>                                                
                                                </tr>                        
                                            </c:if>                                            
                                        </table>
                                    </td>                                   
                                </tr>
                                <tr>
                                    <td class="ColRow">
                                        <logic:equal name="<%=InventoryForm.FORM_NAME %>" property="<%=InventoryForm.PRINTER_FRIENDLY_PARAM %>" value="false">
                                        <logic:equal name="<%=InventoryForm.FORM_NAME %>" property="showDetailLink" value="true">
                                            <base:showHideTag  id="hideShowDetails"> 
                                                <base:genericButton onclick="hideElementhideShowDetails()" src="/buttons/small/detailsover.gif" name="<%= InventoryForm.BUTTON_VIEW_DETAILS%>" alt='<%= MessageHelper.formatMessage("details") %>'/>
                                            </base:showHideTag>                                                
                                        </logic:equal>
                                        </logic:equal>
                                    </td>
                                </tr>
                            </c:if>
                            <% } %>
			          </table>
			  		</td>
			  		<td valign="top" class="tdAlignRight" width="100%">
			  			<table id="<%=InventoryForm.TABLE_BUTTON_HOUSE%>">
			                <logic:equal name="<%=InventoryForm.FORM_NAME%>" property="withinPartialInventory" value="false">
			                    <base:spanIfAllowed permission='<%= permToCheck %>'>
						  			<tr>
						                <td valign="top" class="tdAlignRight" nowrap>
			                        <base:isNotMacBrowser>
			                            <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true" name="<%= InventoryForm.BUTTON_ENTER_KEY %>">
			                        </base:isNotMacBrowser>
                                   <base:genericButton src="/buttons/large/startnew.gif" name="<%= InventoryForm.BUTTON_START_PARTIAL_INVENTORY %>" alt='<%= MessageHelper.formatMessage("startNew") %>'/>
                                    </td>
					             </tr>
                                 <% if (form.getCollectionType() == CollectionType.ASSET || form.getCollectionType() == CollectionType.LIBRARY || form.getCollectionType() == CollectionType.MEDIA || form.getCollectionType() == CollectionType.TEXTBOOK) {
                                        if ( !store.isDistrictUser() && form.hasLostCopies() ) { %>
                                         <tr>
                                            <td class="tdAlignRight">
                                                <base:genericButton src="/buttons/large/viewlost.gif" name="<%= InventoryForm.BUTTON_VIEW_LOST%>" alt='<%= MessageHelper.formatMessage("viewLost") %>'/>
                                            </td>
                                         </tr>
                                <%      }
                                    } %>                                 
					          </base:spanIfAllowed>
			                </logic:equal>
			                
			                
				                    <% if ( !isFullAssetOrTextbookInventory ) { %>
				                
					                    <tr>
					                        <td class="tdAlignRight">
					                        <base:spanIfAllowed permission='<%= permToCheck %>'>
                                            <base:genericButton src="/buttons/large/startnew.gif" name="<%= InventoryForm.BUTTON_NEW_INVENTORY %>" alt='<%= MessageHelper.formatMessage("startNew") %>'/>
                                            </base:spanIfAllowed>
				              	          </td>
					                    </tr>

			                            <base:spanIfAllowed permission='<%= permToCheck %>'>
                                        <logic:equal name="<%= InventoryForm.FORM_NAME%>" property="<%=InventoryForm.PARM_CAN_VIEW_ALL_ASSETS%>" value="true"> 
                                        
			                               <logic:equal name="<%=InventoryForm.FORM_NAME%>" property="withinPartialInventory" value="true">
				                                <logic:equal name="<%=InventoryForm.FORM_NAME%>" property="districtInitiatedInventory" value="false">                                                
    		    									<logic:equal name="<%=InventoryForm.FORM_NAME%>" property="showFinalizeButton" value="true">
    								                    <tr>
    								                        <td class="ColRowBold tdAlignRight">
                                                            <base:showHideTag  id="hideFinalize">
    			    										<base:genericButton onclick="hideElementhideFinalize()" src="/buttons/large/finalizepartial.gif" name="<%= InventoryForm.BUTTON_FINALIZE_PARTIAL_INVENTORY%>" alt='<%= MessageHelper.formatMessage("finalize") %>'/>
                                                            </base:showHideTag>
    			     										</td>
    			  										</tr>
    							                   	</logic:equal>
						                        </logic:equal>
						                   <logic:equal name="<%=InventoryForm.FORM_NAME%>" property="districtInitiatedInventory" value="true">
							                    <% if (form.getUnfinishedTransferCount() == 0 || !form.isStateInitiatedInventory()) { %>
                                                    <tr>
        						                        <td class="ColRowBold tdAlignRight">
                                                        <base:showHideTag  id="hideFinished"> 
        			    									<base:genericButton onclick="hideElementhideFinished()" src="/buttons/large/finished.gif" name="<%= InventoryForm.BUTTON_FINISH_PARTIAL_INVENTORY%>" alt='<%= MessageHelper.formatMessage("finished") %>'/>
                                                        </base:showHideTag>
        	     										</td>
        	  										</tr>
                                                <% } %>
							                </logic:equal>
                                        </logic:equal>
                                            
                                            <% if (!form.isDistrictBasedInventory() && form.getAccountingMode() == InventoryForm.MODE_ACCOUNT_FOR_UNBARCODED_COPIES && 
                                                    ObjectHelper.isIntInArray(form.getCollectionType(), CollectionType.TEXTBOOK, CollectionType.ASSET) ) {%>
                                            <tr>
                                                <td colspan = "3" class="tdAlignRight">
                                                    <base:link href="<%=form.gimmePrinterFriendylLink() %>" target="_blank" id="<%=GenericForm.ID_PRINTER_FRIENDLY %>">
                                                        <base:image src="/buttons/large/printit.gif" alt='<%= MessageHelper.formatMessage("printIt") %>' />
                                                    </base:link>&nbsp;
                                                </td>
                                            </tr>
                                             <tr>
                                                <td colspan = "3" class="SmallColHeading tdAlignRight">
                                                    <base:showHideTag id="saveTop">
                                                        <base:saveButton onclick="hideSaveElements()"/>
                                                    </base:showHideTag>
                                                </td>
                                            </tr>
                                            <% } %>
                                        
                                            
					                      </logic:equal>
						                    
					                   </base:spanIfAllowed>
		           		         <% } %>
                                 
                                 <base:isDistrictUser>
                                <% if (ObjectHelper.isIntInArray(form.getCollectionType(), CollectionType.TEXTBOOK, CollectionType.ASSET)) { %>
                                    <tr><td valign="top" class="tdAlignRight">
                                    <base:link page="/backoffice/servlet/presentdistrictlostreportform.do" id="<%=form.ID_DELETE_LOST %>">
                                        <base:image src="/buttons/large/deletelost.gif" alt='<%= MessageHelper.formatMessage("deleteLost") %>'/>
                                    </base:link>&nbsp;</td></tr>
                                <%} %>                                 
                                 </base:isDistrictUser>
		           		         <tr><td>&nbsp;</td></tr>
			  			</table>
			  		</td>
			  	</tr>
			  	</table>
	         </td>
            
	        </tr>
			<% if (!isFullAssetOrTextbookInventory && !form.isDistrictBasedInventory() && (form.getUnfinishedTransferCount() == 0 || !form.isStateInitiatedInventory())) { %>            
        <tr>
            <td>
            <table width="100%">
            <tr>
            <td class="ColRowBold" width="100%">
            <% if (ObjectHelper.isIntInArray(form.getCollectionType(), CollectionType.TEXTBOOK, CollectionType.ASSET)
                && ((form.isIncludeConsumables() || form.isIncludeWithoutBarcodes()) && form.isIncludeWithBarcodes())) { %>
                <table id = "<%= InventoryForm.TABLE_CHOOSE_ACCOUNTING_MODE %>"  border="1" frame="hSides" width="100%" style="border-collapse: collapse" bordercolor="#C0C0C0" cellspacing="1" cellpadding="3">
                    <tr>
                        <c:choose>
                            <c:when test = "<%= form.getAccountingMode() == InventoryForm.MODE_ACCOUNT_FOR_EACH_BARCODE %>">
                                <td class = "ColRowBold" align = "center" width = "50%"><base:image src = "/icons/general/nextday.gif"/>&nbsp;<%= MessageHelper.formatMessage("inventory_AccountForEachBarcode") %></td>
                                <% if  (form.getCollectionType() == CollectionType.TEXTBOOK) { %>
                                    <td class = "ColRow" align = "center"><a href = "" onclick = "changeAccountingMode(false); return false;" style = "text-decoration:none; color:black"><%= MessageHelper.formatMessage("inventory_CountCopiesWithoutBarcodes") %></a></td>
                                <% } else { %>
                                    <td class = "ColRow" align = "center"><a href = "" onclick = "changeAccountingMode(false); return false;" style = "text-decoration:none; color:black"><%= MessageHelper.formatMessage("inventory_CountItemsWithoutBarcodes") %></a></td>
                                <% } %>                                
                            </c:when>
                            <c:otherwise>
                                <td class = "ColRow" align = "center" width = "50%"><a href = "" onclick = "changeAccountingMode(true); return false;" style = "text-decoration:none; color:black"><%= MessageHelper.formatMessage("inventory_AccountForEachBarcode") %></a></td>
                                <% if  (form.getCollectionType() == CollectionType.ASSET) { %>
                                    <td class = "ColRowBold" align = "center"><base:image src = "/icons/general/nextday.gif"/>&nbsp;<%= MessageHelper.formatMessage("inventory_CountItemsWithoutBarcodes") %></td>
                                <% } else { %>
                                    <td class = "ColRowBold" align = "center"><base:image src = "/icons/general/nextday.gif"/>&nbsp;<%= MessageHelper.formatMessage("inventory_CountCopiesWithoutBarcodes") %></td>
                                <% } %>                                  
                            </c:otherwise>
                        </c:choose>
                    </tr>
                </table>
            <% } else {
                if (!ObjectHelper.isIntInArray(form.getCollectionType(), CollectionType.TEXTBOOK, CollectionType.ASSET) 
                    || form.isIncludeWithBarcodes()) { %>        
                    <table border="0" cellpadding="0" cellspacing="0" bordercolor="#111111" width="100%" >
                        <tr>
                            <base:sectionHeading printerFriendly="false" tdContent="" heading='<%= MessageHelper.formatMessage("inventory_AccountForEachBarcode") %>'/>
                        </tr>
                    </table>
                <% } else { %>
                    <table border="0" cellpadding="0" cellspacing="0" bordercolor="#111111" width="100%" >
                        <tr>
                        <% if  (form.getCollectionType() == CollectionType.ASSET) { %>
                            <base:sectionHeading printerFriendly="false" tdContent="" heading='<%= MessageHelper.formatMessage("inventory_CountItemsWithoutBarcodes") %>'/>
                        <% } else { %>
                            <base:sectionHeading printerFriendly="false" tdContent="" heading='<%= MessageHelper.formatMessage("inventory_CountCopiesWithoutBarcodes") %>'/>
                        <% } %>                           
                            
                        </tr>
                    </table>
                <% } 
            } %>
            </td>
            <td class="ColRow tdAlignRight" nowrap>
                <% if (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_LIBRARY || form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_MEDIA) { %>
                    <html:checkbox property='<%= InventoryForm.FIELD_CHECK_SHELF_ORDER%>'><%= MessageHelper.formatMessage("inventory_CheckShelfOrder") %></html:checkbox>
                <% } %>
            </td>
            </tr>
            </table>
            </td>
        </tr>
       
        <% if (form.isShowScanBarcode()) { %>
             <tr>
             <td>
            <table border="0" cellspacing="0" cellpadding="3" id="<%= InventoryForm.TABLE_ADD_BARCODES %>" width="100%">
            <base:isNotDistrictUser>
            <% if ((form.getCollectionType() == CollectionType.TEXTBOOK) || (form.getCollectionType() == CollectionType.ASSET) ) { %>
            <tr>
                <td class="ColRowBold tdAlignRight" valign="bottom" nowrap><%= MessageHelper.formatMessage("inventory_CurrentScanningLocation") %></td>
                <td class="ColRow" colspan="2" valign="bottom">
					<bean:write name="<%=InventoryForm.FORM_NAME%>" property="currentLocation"/>
				    <base:genericButton src="/buttons/large/update.gif" name="<%= InventoryForm.BUTTON_UPDATE_LOCATION %>" alt='<%= MessageHelper.formatMessage("update") %>'/>
				    <% if ( store.getCurrentInventoryLocationID(form.getCollectionType()) != null ) { %>
					    <base:genericButton src="/buttons/large/clear.gif" name="<%= InventoryForm.BUTTON_CLEAR_LOCATION %>" alt='<%= MessageHelper.formatMessage("clear") %>'/>
					<% } %>
                </td>
            </tr>
            <% } %>
            </base:isNotDistrictUser>
            <tr>
                <td class="ColRowBold tdAlignRight" valign="center" nowrap><%= MessageHelper.formatMessage("inventory_ScanOrEnterOneAtATime") %></td>
                <td colspan="2" valign="center">
                	<table border="0" cellspacing="0" cellpadding="0"><tr>
                    <td><html:text property="<%= InventoryForm.FIELD_SCAN_BARCODE %>" size="20"/></td>
					<td>&nbsp;<base:genericButton src="/buttons/large/accountfor.gif" name="<%= InventoryForm.BUTTON_ADD_TO_INVENTORY %>" alt='<%= MessageHelper.formatMessage("accountFor") %>'/></td>
					</tr></table>
                </td>
            </tr>
            <c:if test="${! form.uploadDisabled}">
                <tr>
                    <c:if test="${form.rfidBarcodeUploadEnabled}">
                        <td class="ColRowBold tdAlignRight" nowrap><%= MessageHelper.formatMessage("inventory_UploadAFileOfBarcodes") %></td>
                        <td>
                            <base:genericButton onclick="location.href='isb://uploadBarcodes?callback=onNewBarcodes';return false;" 
                            src="/buttons/large/uploadscans.gif" name="<%= InventoryForm.BUTTON_RFID_BARCODES%>" alt="Upload scans..."/>
                            <input type="hidden" name="<%= form.FIELD_RFID_BARCODES %>" id="<%= form.FIELD_RFID_BARCODES %>">
                            <script>
                                function onNewBarcodes(barcodes) {
                                	var form = document.<%=InventoryForm.FORM_NAME%>;
                                	var rfidBarcodes = document.getElementById("<%= form.FIELD_RFID_BARCODES %>");
                                	rfidBarcodes.value=barcodes;
                                	var rfidSubmit = document.createElement("input");
                                	rfidSubmit.type = "hidden";
                                	rfidSubmit.name = "<%= InventoryForm.BUTTON_RFID_BARCODES%>";
                                	rfidSubmit.value = "1";
                            	    form.appendChild(rfidSubmit);
                                	form.submit();
                                }
                            </script>
                        </td>
                    </c:if>
                    <c:if test="${! form.rfidBarcodeUploadEnabled}">
                    <td class="ColRowBold tdAlignRight" nowrap><%= MessageHelper.formatMessage("inventory_OrUploadAFileOfBarcodes") %></td>
                    <td>
                        <html:file property="<%= InventoryForm.FIELD_UPLOAD_FILE %>" size="20"/>
                        &nbsp;
                    </td>
                    <td class="ColRowBold">
                        <base:showHideTag id="UploadScans">
    					    <base:genericButton src="/buttons/large/uploadscans.gif" name="<%= InventoryForm.BUTTON_UPLOAD %>" alt='<%= MessageHelper.formatMessage("upload") %>' onclick="hideElementUploadScans()"/>
                        </base:showHideTag>
                    </td>
                    </c:if>
                </tr>
            </c:if>
            </table>

        </td>
    </tr>

    <%
    List titleList = form.getMostRecentlyAdded();
    if ((titleList != null) && (titleList.size() > 0)) {
    %>
        <tr>
            <td class="ColRowBold">
                <table border="0" cellpadding="0" cellspacing="0" bordercolor="#111111" width="100%">
                    <tr>
                        <base:sectionHeading printerFriendly="false" tdContent="" heading='<%= MessageHelper.formatMessage("inventory_MostRecentlyAccountedFor") %>'/>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td>
                <table width="100%" cellspacing="0" border="0" cellpadding="2" id="<%= InventoryForm.TABLE_RECENTLY_ADDED %>">
                    <tr>
					<% if(form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_LIBRARY ||
					      form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK ||
					      form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_MEDIA) { %>
                        <td class="SmallColHeading"><%= MessageHelper.formatMessage("inventory_Barcode") %></td>
                        <td class="SmallColHeading"><%=callNumberOrLocation%></td>
                        <td class="SmallColHeading"><%= MessageHelper.formatMessage("inventory_Author") %></td>
                        <td class="SmallColHeading"><%= MessageHelper.formatMessage("inventory_Title") %></td>
                    <% } else if (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_ASSET ) {%>
                        <td class="SmallColHeading"><%= MessageHelper.formatMessage("inventory_Barcode") %></td>
                        <td class="SmallColHeading"><%= MessageHelper.formatMessage("inventory_AssetName") %></td>
                        <td class="SmallColHeading"><%= MessageHelper.formatMessage("inventory_Location") %></td>
                    <% } %>
                     </tr>
                        <logic:iterate indexId="flipper" id="invenItem" name="<%=form.FORM_NAME%>" property="mostRecentlyAdded" type="com.follett.fsc.destiny.session.backoffice.data.InventoryItem">
                            <tr <%=( ( (1 & flipper.intValue())==0)? "bgColor=\"#E8E8E8\"" : "" )%> >
							<% if(form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_LIBRARY ||
							      form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK ||
							      form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_MEDIA) { %>
	                                <td class="ColRow" valign="top"><c:out value="${invenItem.barcodeDisplayable}"/></td>
	                                <td class="ColRow" valign="top"><c:out value="${invenItem.callNumberOrLocation}"/></td>
	                                <td class="ColRow" valign="top"><c:out value="${invenItem.author}"/></td>
	                                <td class="ColRow" valign="top"><c:out value="${invenItem.title}"/><c:if test = "${invenItem.outOfAdoption}"><span style = "font-size: .75em; color: #CC0000"><%= MessageHelper.formatMessage("inventory_OutOfAdoption") %></span></c:if></td>
                    		<% } else if (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_ASSET ) {%>
	                                <td class="ColRow" valign="top"><%= ResponseUtils.filter(invenItem.getBarcodeDisplayable()) %></td>
                                    <td class="ColRow" valign="top">
                                        <c:out value="${invenItem.title}"/>
                                        <c:if test = "${invenItem.outOfAdoption}">
                                            <span style = "font-size: .75em; color: #CC0000"><%= MessageHelper.formatMessage("inventory_OutOfAdoption") %></span>
                                        </c:if>  
                                    </td>
	                                <td class="ColRow" valign="top"><%= ResponseUtils.filter(invenItem.getCallNumberOrLocation()) %></td>
							<% } %>
                            </tr>
                        </logic:iterate>
                </table>
            </td>
        </tr>
        <% } %>
    <% } else if( ObjectHelper.isIntInArray(form.getCollectionType(), CollectionType.TEXTBOOK, CollectionType.ASSET)
            && form.getAccountingMode() == InventoryForm.MODE_ACCOUNT_FOR_UNBARCODED_COPIES ){ %>
            <tr>
            <td>
            <table border="0" cellpadding="0" cellspacing="0" bordercolor="#111111" width="100%" id="<%=InventoryForm.TABLE_COUNT_UNBARCODED_OUTER_RESULTS %>">
             <c:if test = "<%= form.getBibList().size() > 0 %>">               
                            <tr> 
                            <td class="SmallColHeading"><%=form.getTitleCount() %></td>
                            <td class="SmallColHeading tdAlignRight" colspan="2">
                            <logic:equal name="<%=InventoryForm.FORM_NAME %>" property="<%=InventoryForm.PRINTER_FRIENDLY_PARAM %>" value="false"> 
                                <%= form.buildPageLinks()%>
                            </logic:equal>
                            </td>
                            </tr>
                            <tr> 
                            <td colspan="3">&nbsp;</td>
                            </tr>
                        
                            <tr>
                            <td colspan="3">
                            
                            
                            <table width="100%" id=<%=InventoryForm.TABLE_COUNT_UNBARCODED_RESULTS %> border="0" cellspacing="0" cellpadding="2">
                            <tr>
                            <% if (form.getCollectionType() == CollectionType.ASSET ) {%>
                                <td class="SmallColHeading"><%= MessageHelper.formatMessage("inventory_Asset") %></td>
                                <td class="SmallColHeading" align="center"><%= MessageHelper.formatMessage("inventory_ItemCount") %></td>
                            <% } else { %>
                                <td class="SmallColHeading"><%= MessageHelper.formatMessage("inventory_Title") %></td>
                                <td class="SmallColHeading" align="center"><%= MessageHelper.formatMessage("inventory_CopyCount") %></td>                            
                            <% } %>
                            <td class="SmallColHeading" align="center"><%= MessageHelper.formatMessage("inventory_InventoryCount") %></td>                    
                            </tr>
                            <logic:iterate indexId="flipper" id="invenItem" name="<%=form.FORM_NAME%>" property="bibList" type="com.follett.fsc.destiny.session.backoffice.data.InventoryCopyCountUpdateVO">
                                <%
                                String userValue = form.gimmeBadData(invenItem.getRecID());
                                String additionalFontData = "";
                                String additionalEndFontData = "";
                                boolean showMatIcon = invenItem.getCollectionType() != CollectionType.ASSET || invenItem.isTextbookAsset();
                                %>
                                <%if (userValue != null) {
                                    additionalFontData = "<font color=\"#CC0000\" id=\"" + InventoryForm.RED_ROW
                                        + invenItem.getRecID() + "\">";
                                    additionalEndFontData = "</font>";
                                } %>
                                <tr <%=( ( (1 & flipper.intValue())==0)? "bgColor=\"#E8E8E8\"" : "" )%> >
                                <%if (userValue == null ) { 
                                     if (invenItem.getCopiesAccountedForFromDatabase() != null ) {
                                        userValue = invenItem.getCopiesAccountedForFromDatabase().toString(); 
                                     } else {
                                        userValue = "";
                                    } 
                                 }%>
                                   <td>
                                      <table width="100%" id="<%=InventoryForm.TABLE_COUNT_UNBARCODED_BIB_RESULT %>${invenItem.recID}" >
                                         <tr>
                                            <td class="ColRowBold">
                                            <% if (showMatIcon) { %>
                                                <base:bibTypeIcon rec="${invenItem}" printerFriendly="<%= form.isPrinterFriendly() %>"/>
                                            <% } %>
                                            <%=additionalFontData%>
                                            <c:out value="${invenItem.title}"/>
                                            <%=additionalEndFontData %>
                                            <c:if test = "${invenItem.outOfAdoption}">
                                                <span style = "font-size: .75em; color: #CC0000"><%= MessageHelper.formatMessage("inventory_OutOfAdoption") %></span>
                                            </c:if>  
                                            </td>
                                         </tr>
                                         <tr>
                                            <td class="ColRow">
                                                <c:out value="${invenItem.author}"/>
                                                <c:if test="${! empty invenItem.author}">
                                                    &nbsp;&nbsp;&nbsp;
                                                </c:if>
                                                <%=BibMasterSpecs.getDisplayableStandardNumberBasedOnLocale(invenItem.getDisplayableISBNOrISSN())%>
                                            </td>
                                         </tr>
                                         <tr>
                                            <td class="ColRow">
                                            <c:out value="${invenItem.publisher}"/>
                                            <c:if test="${! empty invenItem.publisher}">
                                                &nbsp;&nbsp;&nbsp;
                                            </c:if>
                                            <c:out value="${invenItem.pubYear}"/>
                                            </td>
                                         </tr>
                                         <c:if test="${! empty invenItem.stateTextID}">
                                         <tr>
                                            <td class="ColRow"><%= MessageHelper.formatMessage("inventory_StateTextbookID", invenItem.getStateTextID()) %></td>
                                         </tr>
                                         </c:if>
                                      </table>
                                   </td>
                                   <td class="ColRowBold" align="center">
                                     <%=additionalFontData%>
                                     <c:out value="${invenItem.copiesWithoutBarcodes}"/>
                                     <%=additionalEndFontData %>
                                   </td>
                                   <td class="ColRowBold" align="center">
                                    <logic:equal name="<%=InventoryForm.FORM_NAME %>" property="<%=InventoryForm.PRINTER_FRIENDLY_PARAM %>" value="false">
                                        
                                        <input type="text" name="<%=InventoryForm.FIELD_SCAN_REC_ID + invenItem.getRecID().toString()%>"
                                           size="6" maxlength="10" value="<%=userValue%>">
                                        
                                    </logic:equal>
                                    <logic:equal name="<%=InventoryForm.FORM_NAME %>" property="<%=InventoryForm.PRINTER_FRIENDLY_PARAM %>" value="true">
                                       ${invenItem.copiesAccountedForFromDatabase}
                                    </logic:equal>
                                    </td>
                                   
                                </tr>
                            </logic:iterate>
                            </table>
                            
                            
                            </td>
                            </tr>
                            <tr> 
                            <td class="SmallColHeading"><%=form.getTitleCount() %></td>
                            <td class="SmallColHeading tdAlignRight" colspan="2">
                            <logic:equal name="<%=InventoryForm.FORM_NAME %>" property="<%=InventoryForm.PRINTER_FRIENDLY_PARAM %>" value="false"> 
                                <%= form.buildPageLinks()%>
                            </logic:equal>
                            </td>
                            </tr> 
                       </c:if>
                       <c:if test = "<%= form.getBibList().size() == 0 %>">
                            <tr>
                                <% if (form.getCollectionType() == CollectionType.ASSET ) { %>
                                    <td class = "ColRowBold" align = 'center' width = '100%'><%= MessageHelper.formatMessage("inventory_ThereAreNoResourcesToCount") %></td>
                                <% } else { %>
                                    <td class = "ColRowBold" align = 'center' width = '100%'><%= MessageHelper.formatMessage("inventory_ThereAreNoTitlesToCount") %></td>
                                <% } %>
                            </tr>
                       </c:if>                            
                    </table>        
        </td>
   </tr>
   <% } //end of count unbarcoded for textbooks. %>
   
   <% } // within full asset inventory %>
	
	<tr>
	<td width="100%">
	<table width="100%" id="<%=InventoryForm.TABLE_FOOTER %>" cellpadding="3" cellspacing="0">

        <% if (form.isWithinPartialInventory()) {%>
		<tr>
			<td colspan="2"><base:imageLine height="1" width="100%"/></td>
		</tr>
        <% } %>
		<tr>
      	    <% if (form.isWithinPartialInventory()) {%>
       		<td class="SmallColRow"><%= MessageHelper.formatMessage("inventory_StartedBy", form.getStartedByUserName()) %>
       		    <%
       			String link = "/backoffice/servlet/presentpartialinventoryselectionsform.do?" + 
            		PartialInventorySelectionsForm.PARAM_PARTIAL_INVENTORY_ID + "=" + form.getTrueAssetInventoryListID() +
                    "&collectionType=" + form.getCollectionType() +
                    "&" + PartialInventorySelectionsForm.PARAM_DISTRICTINVENTORY + "=" + form.isDistrictBasedInventory()
                    ;
       			%>
       		    &nbsp;[ <base:link page="<%=link%>" 
                      	target="<%= InventoryForm.TARGET_PARTIAL_INVENTORY_VIEW_SELECTIONS%>" id="<%=form.ID_VIEW_SELECTIONS %>">
                       	<%= MessageHelper.formatMessage("inventory_ViewSelections") %>
                      	</base:link> ]
       		</td>
      		<% } else { %>
                <td class="ColRow">&nbsp;</td>
      		<% }  %>
            <% if (!form.isDistrictBasedInventory() && form.isWithinPartialInventory() && 
                ObjectHelper.isIntInArray(form.getCollectionType(), CollectionType.TEXTBOOK, CollectionType.ASSET) && 
                form.getAccountingMode() == InventoryForm.MODE_ACCOUNT_FOR_UNBARCODED_COPIES) { %>            
            <td class="SmallColHeading tdAlignRight">
                <base:showHideTag id="saveBottom">
                    <base:saveButton onclick="hideSaveElements()" />
                </base:showHideTag>
            </td>
            <% } else { %>
            <td class="SmallColHeading tdAlignRight">&nbsp;</td>
            <% } %>
		</tr>
	</table>
	</td>
	</tr>	
	

    </base:outlinedTableAndTabsWithinThere>
</c:if>    
    </base:form>


<logic:present name="backoffice_servlet_InventoryForm" property="soundFile" scope="request">

<jsp:include page="/circulation/setsound.jsp"/>

<script language="JavaScript">
<!--
    setSound("<bean:write name="backoffice_servlet_InventoryForm" property="soundFile"/>");
    toTop();
//-->
</script>
 
</logic:present>

<script language="javascript">
<!--
function dropDownSubmit() {
        hideSaveElements();
        document.<%=InventoryForm.FORM_NAME%>.<%=InventoryForm.BUTTON_NAME_ON_SUBMIT%>.value = "true";
        document.<%=InventoryForm.FORM_NAME%>.submit();
}

function clickInProgressSubmit() {
        hideSaveElements();
        document.<%=InventoryForm.FORM_NAME%>.<%=InventoryForm.FIELD_USER_CLICKED_VIEW_IN_PROGRESS%>.value = "true";
        document.<%=InventoryForm.FORM_NAME%>.submit();
}


function changeAccountingMode(accountForEach) {
    hideSaveElements();
    if (accountForEach) {
        document.<%=InventoryForm.FORM_NAME%>.<%=InventoryForm.FIELD_ACCOUNTING_MODE%>.value = "<%=InventoryForm.MODE_ACCOUNT_FOR_EACH_BARCODE%>";        
    } else {
        document.<%=InventoryForm.FORM_NAME%>.<%=InventoryForm.FIELD_ACCOUNTING_MODE%>.value = "<%=InventoryForm.MODE_ACCOUNT_FOR_UNBARCODED_COPIES%>";       
    }
    
    document.<%=InventoryForm.FORM_NAME%>.submit();
}

function hideSaveElements() {
    if(window.hideElementsaveTop) {
        window.hideElementsaveTop();
    }
    
    if(window.hideElementsaveBottom) {
        window.hideElementsaveBottom();
    }

    if(window.hideElementhideFinalize){
        window.hideElementhideFinalize();
    }
    if(window.hideElementhideFinished){
        window.hideElementhideFinished();
    }
}

function toTop()
{
    window.scrollTo(0, 0);
}

// -->
</script>
<%=form.buildJavaScriptForPageChangeAndHiding() %>
