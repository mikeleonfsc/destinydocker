<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%
    OrderViewForm form = (OrderViewForm)request.getAttribute(OrderViewForm.FORM_NAME);
%>
<base:form action="/cataloging/servlet/handleorderviewform.do">
    
	<table id="<%=OrderViewForm.TABLE_MAIN%>" cellSpacing="0" cellPadding="3" width="100%" border="0">
       <tr>
       		<td>
	           <table id="<%=OrderViewForm.TABLE_MAIN_HEADER%>" border="0" cellpadding="0" width="100%">
					<tr>
						<td class="TableHeading" valign="top">
	                        <bean:write name="<%=OrderViewForm.FORM_NAME%>" property="<%=OrderViewForm.PARAM_HEADER%>" />
	                    </td>
						<td class="TableHeading tdAlignRight" valign="top">
						<logic:equal name="<%=OrderViewForm.FORM_NAME%>"  property="printerFriendly" value="false">
						<!--Had to put the printIt link and the stopIt tags on one line so the two images don't spread apart -->
	                        <a href="<%=form.getPrinterFriendlyLink() %>" target="PrinterFriendly" id="<%=OrderViewForm.ID_PRINTER_FRIENDLY %>"><base:image src="/buttons/large/printit.gif" alt="<%=form.ALT_TEXT_PRINT_IT %>" /></a>
	                    </logic:equal>
						</td>
					</tr>	
                    
                    <%if (form.isDisplaySentSection() && !form.getSessionStore().isDistrictUser()){ %>
                        <tr>
                            <td class="ColRowBold" valign="top" align="center">
                            <%  String message = MessageHelper.formatMessage("orderview_OnceYouStartReceivingItems");
                            %>
                                <base:messageBox showRedBorder="true">
                                    <tr valign="top">
                                        <logic:equal name="<%=OrderViewForm.FORM_NAME%>"  property="printerFriendly" value="false">
                                            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                                        </logic:equal>
                                        <td>
                                            <%=message %>
                                        </td>
                                    </tr>
                                </base:messageBox>                     
                            </td>
                        </tr>                    
                    <%} %>                   			
				</table>
       		</td>
    	</tr>
<%-- Sent --%>
    <logic:equal property="showLostRemovedSection" name="<%=OrderViewForm.FORM_NAME%>" value="true">
        <tr>
            <td>
                <table id="<%=OrderViewForm.TABLE_DETAIL_NOT_RECEIVABLE%>" cellSpacing="0" cellPadding="5" border="0" width="100%">
                    <tr>
                        <td class="TableHeading2" colspan="4"><font color="#CC0000"><%= MessageHelper.formatMessage("orderview_ItemsNotReceivable", Long.valueOf(Integer.valueOf(form.getQuantityNotReceivable()).longValue())) %></font></td>
                    </tr>
                    <tr>
                        <td class="SmallColHeading" vAlign="bottom"><%= MessageHelper.formatMessage("orderview_AssetName") %></td>
                        <td class="SmallColHeading" vAlign="bottom"><%= MessageHelper.formatMessage("orderview_Quantity") %></td>
                        <td class="SmallColHeading" vAlign="bottom"><%= MessageHelper.formatMessage("orderview_OrderedBy") %></td>
                        <td class="SmallColHeading tdAlignRight" vAlign="bottom">&nbsp;</td>
                    </tr>
                    <tr bgcolor="#E8E8E8">
                        <td class="ColRow" vAlign="top" noWrap><bean:write name="<%=OrderViewForm.FORM_NAME%>" property="<%=OrderViewForm.PARAM_TITLE%>" /></td>
                        <td class="ColRow" vAlign="top"><bean:write name="<%=OrderViewForm.FORM_NAME%>" property='<%=""+OrderViewForm.PARAM_QUANTITY_NOT_RECEIVABLE%>'/></td>
                        <td class="ColRow" vAlign="top" noWrap><bean:write name="<%=OrderViewForm.FORM_NAME%>" property="<%=OrderViewForm.PARAM_ORDERED_BY%>" /></td>
                        <td class="tdAlignRight"></td>
                    </tr>
                </table>
            </td>
        </tr>
            <td colspan="4">&nbsp;</td>
        <tr>
        </tr>
    </logic:equal>
    
	<logic:equal property="displaySentSection" name="<%=OrderViewForm.FORM_NAME%>" value="true">
    	<tr>
	        <td>
				<table id="<%=OrderViewForm.TABLE_DETAIL_SENT%>" cellSpacing="0" cellPadding="5" border="0" width="100%">
                    <tr>
                    	<td class="TableHeading2" colspan="4"><%=form.getItemsSentHeading()%> (<bean:write property="quantityReceivable" name="<%=OrderViewForm.FORM_NAME%>"/>)</td>
                    </tr>
	               <tr>
	                   <td class="SmallColHeading" vAlign="bottom"><%= MessageHelper.formatMessage("orderview_AssetName") %></td>
	                   <td class="SmallColHeading" vAlign="bottom"><%= MessageHelper.formatMessage("orderview_Quantity") %></td>
	                   <td class="SmallColHeading" vAlign="bottom"><%= MessageHelper.formatMessage("orderview_OrderedBy") %></td>
	                   <td class="SmallColHeading tdAlignRight" vAlign="bottom">&nbsp;</td>
	               </tr>
	               <tr bgcolor="#E8E8E8">
	                   <td class="ColRow" vAlign="top" noWrap><bean:write name="<%=OrderViewForm.FORM_NAME%>" property="<%=OrderViewForm.PARAM_TITLE%>" /></td>
	                   <td class="ColRow" vAlign="top"><bean:write name="<%=OrderViewForm.FORM_NAME%>" property='<%=""+OrderViewForm.PARAM_QUANTITY_RECEIVABLE%>'/></td>
	                   <td class="ColRow" vAlign="top" noWrap><bean:write name="<%=OrderViewForm.FORM_NAME%>" property="<%=OrderViewForm.PARAM_ORDERED_BY%>" /></td>
	  				   <td class="tdAlignRight">
	  										   
			  	<logic:equal name="<%=OrderViewForm.FORM_NAME%>"  property="printerFriendly" value="false">
			  		<logic:notEqual name="<%=OrderViewForm.FORM_NAME%>"  property="<%=OrderViewForm.PARAM_QUANTITY_RECEIVABLE%>" value="0">
			  			<logic:equal name="<%=OrderViewForm.FORM_NAME%>"  property="districtUser" value="false">
			  				<logic:equal name="<%=OrderViewForm.FORM_NAME%>"  property="<%=OrderViewForm.PARAM_CAN_RECEIVE%>" value="true">
								<base:link page='<%=form.getReceiveLink()%>' id="<%=OrderViewForm.ID_BUTTON_RECEIVE %>">
						        	<base:image src="/buttons/small/receivesmall.gif" alt="<%=OrderViewForm.ALT_TEXT_RECEIVE%>" />
						        </base:link>
	  						</logic:equal>
	  					</logic:equal>
		  				<logic:equal name="<%=OrderViewForm.FORM_NAME%>"  property="districtUser" value="true">
							<base:link page='<%=form.getRerouteLink()%>' id="<%=OrderViewForm.ID_BUTTON_REROUTE %>">
					        	<base:image src="/buttons/small/reroutesmall.gif" alt="<%=OrderViewForm.ALT_TEXT_REROUTE%>"/>
					        </base:link>
					        &nbsp;
							<base:link page='<%=form.getReceiveAndTransferLink()%>' id="<%=OrderViewForm.ID_BUTTON_TRANSFER %>">
					        	<base:image src="/buttons/small/receiveandtransfer.gif" alt="<%=OrderViewForm.ALT_TEXT_RECEIVE_AND_TRANSFER%>"/>
					        </base:link>
		   				</logic:equal>
		   			</logic:notEqual>
	  			</logic:equal>
			    		&nbsp;
				   		</td>
		   			</tr>
	            </table>
	        </td>
    	</tr>
    </logic:equal>
<%-- Received --%>
    <logic:notEqual property="quantityReceived" name="<%=OrderViewForm.FORM_NAME%>"  value="0">
        <tr>
            <td>
                <table id="<%=OrderViewForm.TABLE_DETAIL_RECEIVED%>" cellSpacing="0" cellPadding="5" width="100%" border="0">
                    <tr>
                        <td class="TableHeading2"><%= MessageHelper.formatMessage("orderview_ItemsReceived", Long.valueOf(Integer.valueOf(form.getQuantityReceived()).longValue())) %></td>
                    </tr>
                    <tr>
                        <td class="SmallColHeading" vAlign="bottom"><%= MessageHelper.formatMessage("orderview_Description") %></td>
                        <td class="SmallColHeading" vAlign="bottom"><%= MessageHelper.formatMessage("orderview_Barcode") %></td>
                        <td class="SmallColHeading" vAlign="bottom"><%= MessageHelper.formatMessage("orderview_Custodian") %></td>
                    </tr>
                    <base:OrderItem items="<%=form.getItemsReceived()%>"/>
                </table>
            </td>
        </tr>
    </logic:notEqual>
	</table>                          
</base:form>
