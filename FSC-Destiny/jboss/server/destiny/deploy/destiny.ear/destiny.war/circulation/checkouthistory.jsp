<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.client.common.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.marc.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.session.common.SortHelper"%>

<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="com.follett.fsc.common.MessageHelper"%>

<bean:define id="form" name="<%= CheckoutHistoryForm.FORM_NAME %>" type="com.follett.fsc.destiny.client.circulation.servlet.CheckoutHistoryForm"/>

<%
	SessionStoreProxy store = form.getStore();
%>

<base:messageBox strutsErrors="true"/>

<base:form action="/circulation/servlet/handlecheckouthistoryform.do" styleId="keywordList">
<html:hidden property="showingCopiesForPatrons"/>
<html:hidden property="collectionType"/>
<html:hidden property="rowID"/>
<html:hidden property="page"/>

	<base:outlinedTableAndTabsWithinThere tabValidator="<%=form%>"  id="<%=CheckoutHistoryForm.TABLE_CHECKOUT_HISTORY%>" selectedTabID="<%=form.getSelectedTabID() %>" selectedTab="<%=form.getSelectedTab()%>" tabs="<%=form.getTabs()%>" hideBorderWhenPrinterFriendly="true" hideTabsWhenPrinterFriendly="true" formName="<%= CheckoutHistoryForm.FORM_NAME %>" >

		<tr>
			<td class="TableHeading" colspan="4">
			    <bean:write name='<%= CheckoutHistoryForm.FORM_NAME %>' property="header" filter="false" />			    
                <logic:equal name="<%=CheckoutHistoryForm.FORM_NAME%>" property="showingCopiesForPatrons" value="false">
                    <logic:equal name="<%= CheckoutHistoryForm.FORM_NAME %>" property="temporaryCopy" value="true">
                        <logic:equal name='<%= CheckoutHistoryForm.FORM_NAME %>' property="printerFriendly" value="false">
                            <base:image src="/icons/materialtype/temp.gif" width="19" height="16" alt='<%=MessageHelper.formatMessage("checkouthistory_Temporary") %>'/>
                        </logic:equal>
                        <logic:equal name='<%= CheckoutHistoryForm.FORM_NAME %>' property="printerFriendly" value="true"
                            >[<%=MessageHelper.formatMessage("checkouthistory_Temporary") %>]
                        </logic:equal>
                    </logic:equal>
                </logic:equal>
			</td>
			
			<td class="ColRow tdAlignRight">
               <logic:equal name='<%= CheckoutHistoryForm.FORM_NAME %>' property="printerFriendly" value="false">
                    <base:link page="<%= form.getPrinterFriendlyLink() %>" target="printerFriendly" id="<%=CheckoutHistoryForm.ID_PRINTER_FRIENDLY %>"><base:image align="absbottom" src="/buttons/small/printerfriendly.gif" alt='<%= MessageHelper.formatMessage("printable") %>'/></base:link>
               </logic:equal>
			</td>
		</tr>
        <logic:equal name='<%= CheckoutHistoryForm.FORM_NAME %>' property="printerFriendly" value="false">
  		<tr>
			<td colspan="5" class="SmallColHeading tdAlignRight">
                <base:pageListOutput formName="<%=CheckoutHistoryForm.FORM_NAME%>" />
			</td>
		</tr>
        </logic:equal>
        <tr>
        	<td colspan="5"  class="TableHeading">
        	<span style="font-size: 0.8em">
                 <bean:write name='<%= CheckoutHistoryForm.FORM_NAME %>' property="subHeader"/>
        	</span>
        	</td>
        </tr>
        <% if (form.isShowingAssetAuditInfo() || form.isShowingTextbookAuditInfo()) { %>
        	<tr>
            <%if (form.getItemList().size() >0){ %>
                   <logic:equal name='<%= CheckoutHistoryForm.FORM_NAME %>' property="printerFriendly" value="false">
    	                <td class="SmallColHeading" colspan="3"><base:sortHeaderOutput description="Transaction" formName="<%= CheckoutHistoryForm.FORM_NAME %>" sort='<%= "" + SortHelper.SORTBYHISTORYTRANSACTION %>' /></td>
    	                <td class="SmallColHeading" align="center"><base:sortHeaderOutput description="Date" formName="<%= CheckoutHistoryForm.FORM_NAME %>" sort='<%= "" + SortHelper.SORTBYHISTORYDATE %>' /></td>
    	                <td class="SmallColHeading" align="center"><base:sortHeaderOutput description="Performed By" formName="<%= CheckoutHistoryForm.FORM_NAME %>" sort='<%= "" + SortHelper.SORTBYHISTORYOWNER %>' /></td>
                    </logic:equal>
                   <logic:equal name='<%= CheckoutHistoryForm.FORM_NAME %>' property="printerFriendly" value="true">
    		      		<td class="SmallColHeading" colspan="3">Transaction</td>
    		    	  	<td class="SmallColHeading" align="center">Date</td>
    			      	<td class="SmallColHeading" align="center">Performed By</td>
                   </logic:equal>
            <%} else { %>
                    <td colspan="5" class="ColRowBold" align="center">
                        There is no history for this copy.
                    </td>
              <%} %>
        	</tr>
        	
            <base:auditHistoryList collectionType="<%= form.getCollectionType()%>" historyList="<%=form.getItemList()%>" />
        <% } else { %>	
	        
			<tr>
				<% if ( form.getReturnValue().getCheckoutHistoryList().size() == 0 ) { %>
					<td colspan="5" class="ColRowBold" align="center">
	                 <bean:write name='<%= CheckoutHistoryForm.FORM_NAME %>' property="noHistoryMessage"/>
					</td>				
				<% } else { %>
			      	<td class="SmallColHeading" nowrap="nowrap">&nbsp;</td>
		            <logic:equal name="<%=CheckoutHistoryForm.FORM_NAME%>" property="showingCopiesForPatrons" value="true">
			      	  <td class="SmallColHeading">
		  	            <logic:equal name='<%= CheckoutHistoryForm.FORM_NAME %>' property="collectionType" value="<%= String.valueOf(BibMasterSpecs.COLLECTION_TYPE_ASSET)%>">
		  	            	Resource Name
		  	            </logic:equal>
		  	            <logic:notEqual name='<%= CheckoutHistoryForm.FORM_NAME %>' property="collectionType" value="<%= String.valueOf(BibMasterSpecs.COLLECTION_TYPE_ASSET)%>">
				      	  	<%=MessageHelper.formatMessage("checkouthistory_Title") %>
				      	</logic:notEqual>
			      	  </td>
			      	</logic:equal>
		            <logic:equal name="<%=CheckoutHistoryForm.FORM_NAME%>" property="showingCopiesForPatrons" value="false">
			            <logic:equal name="<%=CheckoutHistoryForm.FORM_NAME%>" property="collectionType" value="<%= String.valueOf(BibMasterSpecs.COLLECTION_TYPE_ASSET)%>">
			      	  <td class="SmallColHeading">User</td>
			      		</logic:equal>
			            <logic:notEqual name="<%=CheckoutHistoryForm.FORM_NAME%>" property="collectionType" value="<%= String.valueOf(BibMasterSpecs.COLLECTION_TYPE_ASSET)%>">
			      	  <td class="SmallColHeading"><%=MessageHelper.formatMessage("checkouthistory_Patron") %></td>
			      		</logic:notEqual>
			      	</logic:equal>
		      		<td class="SmallColHeading" align="center"><%=MessageHelper.formatMessage("checkouthistory_CheckedOut") %></td>
		    	  	<td class="SmallColHeading" align="center"><%=MessageHelper.formatMessage("checkouthistory_DueDate") %></td>
			      	<td class="SmallColHeading" align="center"><%=MessageHelper.formatMessage("checkouthistory_CheckedIn") %></td>
			      	<% } %>
	  		</tr>
	<!-- show patrons for copies detail -->
	        <logic:iterate id="item" name='<%=CheckoutHistoryForm.FORM_NAME%>' property="itemList" type="com.follett.fsc.destiny.session.circulation.data.CheckoutHistoryVO">
                <base:flipper key="checkouthistory">
        			<td width="8%" class="ColRowBold">
        			    <%-- Material Type ICON --%>
        			    <% boolean showIcon = 
        			    	(form.getCollectionType() != BibMasterSpecs.COLLECTION_TYPE_ASSET || item.isTextbookAsset()) &&
        			    	form.isShowingCopiesForPatrons(); %>
                        <% if (showIcon) { %>
            			    <%-- Material Type Link show icon for normal --%>
                            <logic:equal name='<%= CheckoutHistoryForm.FORM_NAME %>' property="printerFriendly" value="false">
                                <%=BibType.getBibTypeIcon(item.isStateOwned(), item.getBibType(), item.getBibSubTypeID(), form.getCollectionType(), Boolean.valueOf(item.isDistrictFollettEBookCopy()), null)%>
                            </logic:equal>
            			    <%-- Material Type text for printer friendly --%>
                            <logic:equal name='<%= CheckoutHistoryForm.FORM_NAME %>' property="printerFriendly" value="true">
                                <%  if  (item.isStateOwned()) { %>
                                [&nbsp;<%=BibType.ALT_STATE_OWNED%>&nbsp;]
                                <%  } %>
                			    [&nbsp;<%=BibType.getBibTypeALT(item.getBibType(), item.getBibSubTypeID())%>&nbsp;]
                            </logic:equal>
                        <% } else { %>
                            &nbsp;
                        <% } %>
        			</td>
        			<td>
        			<%-- show TITLE or PATRON NAME or DELETED MESSAGE --%>
                        <span class="ColRowBold">
                            <bean:write name="item" property="rowDescription" filter="true"/>
                        </span>
                        <logic:equal name="<%=CheckoutHistoryForm.FORM_NAME%>" property="showingCopiesForPatrons" value="true">
                            <logic:equal name='item' property="temporaryCopy" value="true">
                                <logic:equal name='<%= CheckoutHistoryForm.FORM_NAME %>' property="printerFriendly" value="false">
                                    <base:image src="/icons/materialtype/temp.gif" width="19" height="16" alt='<%=MessageHelper.formatMessage("checkouthistory_Temporary") %>'/>
                                </logic:equal>
                                <logic:equal name='<%= CheckoutHistoryForm.FORM_NAME %>' property="printerFriendly" value="true">
                                    <span class="ColRow">[<%=MessageHelper.formatMessage("checkouthistory_Temporary") %>]</span>
                                </logic:equal>
                            </logic:equal>
                        </logic:equal>
        			<%-- show (Copy: [SSN] T 5) or (PatronType: [SSN] P 6) (ssn is optional) --%>
                    <span class="SmallColRow">
                  	    <%=form.getViewStatusLink(item)%>
                    </span>
                    </td>
        			<td class="ColRow" align="center" width="11%">
                    	<bean:write name="item" property="checkedOut" filter="true" />
                    </td>
        			<td class="ColRow" align="center" width="11%">
                        <% if  (item.isConsumable()) { %>
                            &nbsp;
                        <% } else { %>                            
                    	  <bean:write name="item" property="dueDate" filter="true" />
                        <% } %>
                    </td>
        			<!-- <private boolean dateRed; -->
        			<td class="ColRow" align="center" width="11%">
            			<logic:equal name="item" property="dateRed" value="true">
            			     <font color="#cc0000">  
            			</logic:equal>
                        	<bean:write name="item" property="checkedIn" filter="false" />
            			<logic:equal name="item" property="dateRed" value="true">
            			     </font>
            			</logic:equal>
                    </td>
    	        </base:flipper>
	        </logic:iterate>
        <% } %>
<!-- end show patrons for copies detail -->

	</base:outlinedTableAndTabsWithinThere>

</base:form>
