<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.session.backoffice.ejb.InventoryFacadeSpecs"%>
<%@ page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.util.ObjectHelper" %> 

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>


<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    PartialInventorySelectionsForm form = (PartialInventorySelectionsForm)request.getAttribute(PartialInventorySelectionsForm.FORM_NAME);
    String includeHeader = "Include";
    
    boolean assetSite = form.getCollectionType() == CollectionType.ASSET;
%>


<TABLE id="<%=PartialInventorySelectionsForm.TABLE_MAIN%>" cellSpacing=0 cellPadding=5 width="100%" border=0>
    <TR>
      <TD class="TableHeading">
        
		<%= form.gimmeCollectionTypeMode() %> <%=MessageHelper.formatMessage("partialinventoryselections_Inventory") %> - 
		<bean:write name="<%= PartialInventorySelectionsForm.FORM_NAME %>" property="<%= PartialInventorySelectionsForm.FIELD_DESCRIPTION %>"/>
         - <%=MessageHelper.formatMessage("partialinventoryselections_Started") %> 
   		<bean:write name="<%= PartialInventorySelectionsForm.FORM_NAME %>" property="<%= PartialInventorySelectionsForm.FIELD_STARTED_DATE %>"/>
      </TD>
    </TR>
    
    <TR>
      <TD class="ColRow"><%=MessageHelper.formatMessage("partialinventoryselections_StartedBy", form.getStartedByName()) %>
      </TD>
    </TR>
    
    <TR>
      <TD>
    	<table id="<%=PartialInventorySelectionsForm.TABLE_PARTIAL_LIMITERS%>" border="0" cellpadding="5" width="100%" style="border-collapse: collapse">
             <%if(form.isShowLimiterLine()) { %>
        			<tr bgColor="<%= form.getNextColor(true) %>">
        			    <td class="ColRowBold">
           		           <bean:write name="<%= PartialInventorySelectionsForm.FORM_NAME %>" property="<%= PartialInventorySelectionsForm.FIELD_LIMITER_TYPE_NAME %>"/>
        				</td>
        			    <td class="ColRow">
           		           <bean:write name="<%= PartialInventorySelectionsForm.FORM_NAME %>" property="<%= PartialInventorySelectionsForm.FIELD_LIMITERS %>"/>
        				
        					<br />
                            <% if( !store.isAtDistrictWarehouse() && !form.selectedSiteIsADistrictWarehouse()) {%>
                                <I>
            					<logic:equal name="<%= PartialInventorySelectionsForm.FORM_NAME %>" property="<%= PartialInventorySelectionsForm.FIELD_INCLUDE_CHECKED_OUT_ITEMS %>" value="true"><%=MessageHelper.formatMessage("partialinventoryselections_Including") %></logic:equal>
            					<logic:notEqual name="<%= PartialInventorySelectionsForm.FORM_NAME %>" property="<%= PartialInventorySelectionsForm.FIELD_INCLUDE_CHECKED_OUT_ITEMS %>" value="true"><%=MessageHelper.formatMessage("partialinventoryselections_Excluding") %></logic:notEqual>
            					<%=MessageHelper.formatMessage("partialinventoryselections_CheckedOutItems") %>
                                </I>
                            <%} %>
        				</td>
        			</tr>
            <%} %>
			
            <% if (form.getCollectionType() == CollectionType.ASSET) { %>
            <% boolean switchColor = true; %>
    			<tr bgColor="<%= form.getNextColor(true) %>">
    			    <td class="ColRowBold"><%=MessageHelper.formatMessage("partialinventoryselections_AssetTypes") %></td>
    				<td class="ColRow">
       					<bean:write name="<%= PartialInventorySelectionsForm.FORM_NAME %>" property="<%= PartialInventorySelectionsForm.FIELD_ASSET_LIMITERS %>"/>
       				</td>	
    			</tr>
                <% if (form.isTextbookResourceTypeOnlySelected()) {%>
                <tr bgColor="<%= form.getNextColor(true) %>">
                    <td class="ColRowBold"><%=MessageHelper.formatMessage("partialinventoryselections_AdoptionYear") %></td >
                    <td class="ColRow"><%= form.getAdoptionYearDescription() %></td>
                </tr>     
                <% } %>           
    			
    			<% if (form.isCopyWithBarcodes()) { %>
        			<tr bgColor="<%= form.getNextColor(true) %>">
        			    <td class="ColRowBold"><%=MessageHelper.formatMessage("partialinventoryselections_PurchasePrice") %></td>
        				<td class="ColRow">
        			   		<bean:write name="<%= PartialInventorySelectionsForm.FORM_NAME %>" property="<%= PartialInventorySelectionsForm.FIELD_PRICE_LIMIT_BY_AND_PRICE %>"/>
        				</td>
        			</tr>
                <% } %>
                
                <% if (form.isCopyWithBarcodes()) { %>
                    <tr bgColor="<%= form.getNextColor(switchColor) %>">
                        <td class="ColRowBold"><%=MessageHelper.formatMessage("partialinventoryselections_Include") %></td >
                        <td class="ColRow"><%=MessageHelper.formatMessage("partialinventoryselections_ItemsWithBarcodes") %></td>
                    </tr>
                    <% includeHeader = "";
                        switchColor = false;
                    } %>    
                <% if  (form.isCopyWithoutBarcodes()) { %>
                    <tr bgColor="<%= form.getNextColor(switchColor) %>">
                        <td class="ColRowBold"><%= includeHeader %></td >
                        <td class="ColRow"><%=MessageHelper.formatMessage("partialinventoryselections_ItemsWithoutBarcodes") %></td>
                    </tr>
                    <% includeHeader = "";
                         switchColor = false;
                } %>    
                <% if  (form.isConsumables()) { %>
                    <tr bgColor="<%= form.getNextColor(switchColor) %>">
                        <td class="ColRowBold"><%= includeHeader %></td >
                        <td class="ColRow"><%=MessageHelper.formatMessage("partialinventoryselections_Consumables") %></td>
                    </tr>
                    <% includeHeader = "";
                    } %>
            <% } %>
            <%if(form.getCollectionType() == CollectionType.TEXTBOOK && store.isStateRepositoryRunning()){%>
                <tr bgColor="<%= form.getNextColor(true) %>">
                        <td class="ColRowBold"><%=MessageHelper.formatMessage("partialinventoryselections_LimitedInventoryTo") %></td>
                        <td class="ColRow">
                            <%=form.getStateLimiterStr()%>
                        </td>
                </tr>
           <%}%>
            
             <% if (form.getCollectionType() == CollectionType.TEXTBOOK) { 
                            boolean switchColor = true; 
              %>
            
                    <tr bgColor="<%= form.getNextColor(true) %>">
                        <td class="ColRowBold"><%=MessageHelper.formatMessage("partialinventoryselections_AdoptionYear") %></td >
                        <td class="ColRow"><%= form.getAdoptionYearDescription() %></td>
                    </tr>
                        <% if  (form.isCopyWithBarcodes()) { 
                        %>
                            <tr bgColor="<%= form.getNextColor(switchColor) %>">
                                <td class="ColRowBold"><%=MessageHelper.formatMessage("partialinventoryselections_Include") %></td >
                                <td class="ColRow"><%=MessageHelper.formatMessage("partialinventoryselections_CopiesWithBarcodes") %></td>
                            </tr>
                            <% includeHeader = "";
                                switchColor = false;
                            } %>    
                        <% if  (form.isCopyWithoutBarcodes()) { %>
                            <tr bgColor="<%= form.getNextColor(switchColor) %>">
                                <td class="ColRowBold"><%= includeHeader %></td >
                                <td class="ColRow"><%=MessageHelper.formatMessage("partialinventoryselections_CopiesWithoutBarcodes") %></td>
                            </tr>
                            <% includeHeader = "";
                                 switchColor = false;
                        } %>    
                        <% if  (form.isConsumables()) { %>
                            <tr bgColor="<%= form.getNextColor(switchColor) %>">
                                <td class="ColRowBold"><%= includeHeader %></td >
                                <td class="ColRow"><%=MessageHelper.formatMessage("partialinventoryselections_Consumables") %></td>
                            </tr>
                            <% includeHeader = "";
                            } %>
            <%} %>             
            <%if( form.isShowLimiterLine() && form.isCopyWithBarcodes()) {%>
    			<tr bgColor="<%= form.getNextColor(true) %>">
    			    <td class="ColRowBold">
                        <% if (assetSite) { %>
                        <%=MessageHelper.formatMessage("partialinventoryselections_ActionForMisplacedItems") %>
                        <% } else { %>
                        <%=MessageHelper.formatMessage("partialinventoryselections_ActionForMisplacedCopies") %>
                        <% } %> 
					</td>
    				<td class="ColRow">
    			   		<bean:write name="<%= PartialInventorySelectionsForm.FORM_NAME %>" property="<%= PartialInventorySelectionsForm.FIELD_MISPLACED_ITEMS %>"/>
    				</td>
    			</tr>
            <%} %>	
            		
            <%if( (form.getCollectionType() == CollectionType.LIBRARY) || (form.getCollectionType() == CollectionType.MEDIA) ) {
                
            %>
                <tr bgColor="<%= form.getNextColor(true) %>">
                    <td class="ColRowBold"><%=MessageHelper.formatMessage("partialinventoryselections_CallNumbers") %></td>
                    <td class="ColRow">
                        <bean:write name="<%= PartialInventorySelectionsForm.FORM_NAME %>" property="<%= PartialInventorySelectionsForm.FIELD_CALLNUMBERS %>"/>
                    </td>
                </tr>
                
                <tr bgColor="<%= form.getNextColor(false) %>">
                    <td class="ColRowBold"><%=MessageHelper.formatMessage("partialinventoryselections_CirculationTypes") %></td>
                    <td class="ColRow">
                        <bean:write name="<%= PartialInventorySelectionsForm.FORM_NAME %>" property="<%= PartialInventorySelectionsForm.FIELD_CIRC_TYPE_LIMITERS %>"/>
                    </td>
                </tr>
            <%} %>  

            <%if  ( !ObjectHelper.isIntInArray(form.getCollectionType(), CollectionType.TEXTBOOK, CollectionType.ASSET) || 
                    ( ObjectHelper.isIntInArray(form.getCollectionType(), CollectionType.TEXTBOOK, CollectionType.ASSET) && form.isCopyWithBarcodes())){%>
    			<tr bgColor="<%= form.getNextColor(true) %>">
                    <td class="ColRowBold">&nbsp;</td>
    				<td class="ColRow">
                        <% if (assetSite) { %>
                            <%=MessageHelper.formatMessage("partialinventoryselections_ItemsSeenOnOrAfter0DoNotNeedToBeAccountedFor", form.getDateAccountedFor()) %>
                        <% } else { %>
                            <%=MessageHelper.formatMessage("partialinventoryselections_CopiesSeenOnOrAfter0DoNotNeedToBeAccountedFor", form.getDateAccountedFor()) %>
                        <% } %> 
                    </td>
    			</tr>
            <%} %>
            
            <%if  (form.isShowActionForScannedCopies() && !store.isAtDistrictWarehouse() && !form.selectedSiteIsADistrictWarehouse()){%>
                <tr bgColor="<%= form.getNextColor(true) %>">
                        <td class="ColRowBold">
                            <% if (assetSite) { %>
                                <%= MessageHelper.formatMessage("partialinventoryselections_ActionForScannedCheckedOutItems") %>
                            <% } else { %>
                                <%= MessageHelper.formatMessage("partialinventoryselections_ActionForScannedCheckedOutCopies") %>
                            <% } %>
                        </td>
                        <td class="ColRow">
                            <% if (form.isCheckInOnScan()) { %>
                                <% if (assetSite) { %>
                                    <%= MessageHelper.formatMessage("partialinventoryselections_CheckInScannedItemsThatAreCheckedOut") %>
                                <% } else { %>
                                    <%= MessageHelper.formatMessage("partialinventoryselections_CheckInScannedCopiesThatAreCheckedOut") %>
                                <% } %>
                            <% } else { %>
                                <% if (assetSite) { %>
                                    <%= MessageHelper.formatMessage("partialinventoryselections_DoNotCheckInScannedItemsThatAreCheckedOut") %>
                                <% } else { %>
                                    <%= MessageHelper.formatMessage("partialinventoryselections_DoNotCheckInScannedCopiesThatAreCheckedOut") %>
                                <% } %>
                            <% } %>
                        </td>
                </tr>
           <%}%>   
                                      
            <%if  (form.getScheduledEndDate() != null){%>
                <tr bgColor="<%= form.getNextColor(true) %>">
                        <td class="ColRowBold"><%=MessageHelper.formatMessage("partialinventoryselections_InventoryEnds") %></td>
                        <td class="ColRow">
                            <%=form.getScheduledEndDate() %>
                        </td>
                </tr>
           <%}%>                              


		</table>
      </TD></TR>
    </TABLE>
