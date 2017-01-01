<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.util.BarcodeHelper"%>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>



<%@page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%><bean:define id="searchTypesList" name="<%=ReceiveCopiesForm.FORM_NAME%>" property="searchTypesList"/>

<%
    ReceiveCopiesForm form = (ReceiveCopiesForm)request.getAttribute(ReceiveCopiesForm.FORM_NAME);
    
    int numCopies = form.getCopiesList().size();
    SessionStoreProxy store = form.getSessionStore();
    
    String focus = ReceiveCopiesForm.FIELD_SEARCH_STRING;
    if (form.isFiltered()) {
    	focus = "";
    }
%>

<base:messageBox strutsErrors="true"/>
<base:form action="/cataloging/servlet/handlereceivecopiesform.do" focus="<%=focus%>">

<% if (form.isShowDeleteConfirmation()) { 
    	String barcode = form.getCopyBarcodeForDelete();
    	if (barcode == null) {
    		barcode = "";
    	} else {
    		barcode = ResponseUtils.filter(BarcodeHelper.getTruncatedBarcode(barcode)) + " ";
    	}
%>
	<html:hidden property="<%=ReceiveCopiesForm.FIELD_COPY_ID%>"/>
	<base:messageBox>
	<tr>
		<td align="center" class="ColRowBold">
            <%=MessageHelper.formatMessage("receivecopies_ThisCopyBarcodeWillBeDeleted", barcode)%>
		</td>
	</tr>
	<tr>
		<td align="center" class="ColRow"><%=MessageHelper.formatMessage("receivecopies_AreYouSureYouWantToDeleteThisCopy")%></td>
	</tr>
	<tr>
		<td align="center" class="SmallColRow"><%=MessageHelper.formatMessage("receivecopies_YouMayWantToPrintThisPageForYourRecordsBeforeProceeding") %></td>
	</tr>
	<tr>
		<td align="center" class="ColRow"><base:yesNo/></td>
	</tr>
	</base:messageBox>
<% } %>

<base:outlinedTableAndTabsWithinThere width="100%" id="<%=UpdateCopiesBaseForm.TABLE_MAIN%>"  borderColor="#C0C0C0" selectedTab="<%=ReceiveCopiesForm.ID_TAB_RECEIVE%>" tabs="<%=form.getTabs()%>" >
<tr>
    <td>
        <table border="0" cellspacing="0" cellpadding="0" width="100%" id="<%=ReceiveCopiesForm.TABLE_HEADER%>">
            <tr>
                <td class="TableHeading" colspan="2"><%=MessageHelper.formatMessage("receivecopies_ReceiveLibraryCopiesInTransit") %></td>
            </tr>
            <% if (!form.isFiltered()) { %>
            <tr>
				<td>
					<table border="0">
						<tr>
							<td class="ColRowBold">
								<%=MessageHelper.formatMessage("receivecopies_Find") %>
				                <html:select property="<%= ReceiveCopiesForm.FIELD_SEARCH_TYPE %>" >
				                    <html:options collection="searchTypesList" property="longID" labelProperty="stringDesc"/>
				                </html:select>
				            </td>
		                	<td>
		                		<html:text property="<%= ReceiveCopiesForm.FIELD_SEARCH_STRING%>" size="35" maxlength="80"/>
		                	</td>
		                	<td>
		                		<base:goButton/>
		                	</td>
		               </tr>
		            </table>
		        </td>            
            </tr>
            <tr>
            	<td colspan="2">&nbsp;</td>
            </tr>
            <% } %>
            
            <% if (form.isFiltered()) { %>
            <tr>
            	<td colspan="2">
		            <base:imageLine height="1" width="100%"/>
		        </td>
            </tr>
            <tr>
            	<td class="ColRowBold" colspan="2"><%= form.buildSearchForString() %></td>
            </tr>
            <tr>
            	<td colspan="2" class="ColRow">[<base:link href="/cataloging/servlet/presentreceivecopiesform.do" id="<%=ReceiveCopiesForm.ID_LINK_REFINE_YOUR_SEARCH %>"><%=MessageHelper.formatMessage("receivecopies_RefineYourSearch") %> </base:link>]</td>
            </tr>
            <tr>
            	<td colspan="2">&nbsp;</td>
            </tr>
            <% } %>
            
            <% if (form.getCopiesList().size() > 0) { %>
            <tr>
            	<td colspan="2">
		            <base:imageLine height="1" width="100%"/>
		        </td>
            </tr>
            <tr>
            	<td colspan="2" class="SmallColRow"><%=MessageHelper.formatMessage("receivecopies_CopiesNumcopiesOutOfNumcopies", new Long(numCopies), new Long(numCopies)) %></td>
            </tr>
            <tr>
            	<td colspan="2">
            		<table id="<%=ReceiveCopiesForm.TABLE_COPIES%>" border="0" cellspacing="0" cellpadding="5" width="100%">
            		<tr>
            			<td class="SmallColHeading"><%=MessageHelper.formatMessage("receivecopies_Title") %></td>
            			<td class="SmallColHeading"><%=MessageHelper.formatMessage("receivecopies_Author")%></td>
            			<td class="SmallColHeading"><%=MessageHelper.formatMessage("receivecopies_CallNumber")%></td>
            			<td class="SmallColHeading"><%=MessageHelper.formatMessage("receivecopies_Barcode")%></td>
            			<td class="SmallColHeading"><%=MessageHelper.formatMessage("receivecopies_Shipped")%></td>
            			<td class="SmallColHeading">&nbsp;</td>
            			<td class="SmallColHeading">&nbsp;</td>
            		</tr>
			        <logic:iterate indexId="flipper" id="row" name="<%= ReceiveCopiesForm.FORM_NAME %>" property="copiesList" type="com.follett.fsc.destiny.session.cataloging.ejb.data.CopyInfoValue">
			        	<tr valign="top" <%=( ( (1 & flipper.intValue())==0)? "bgColor=\""+FlipperTag.ROW_GRAY+"\"" : "" )%> >
			                <base:td clazz="ColRow" filtered="true"><%=row.getTitle()%></base:td>
			                <base:td clazz="ColRow" filtered="true"><%=row.getAuthor()%></base:td>
			                <base:td clazz="ColRow" filtered="true"><%=row.getCopyValue().getCallNumber()%></base:td>
			                <base:td clazz="ColRow" filtered="true"><%=BarcodeHelper.getTruncatedBarcode(row.getCopyValue().getCopyBarcode())%></base:td>
			                <base:td clazz="ColRow" filtered="true"><%=UserContext.getMyContextLocaleHelper().formatDate(row.getCopyValue().getCreated()) %></base:td>
			                <td><%=form.buildReceiveLink(row)%></td>
			                <td><%=form.buildDeleteLink(row)%></td>
			            </tr>
			        </logic:iterate>
            		</table>
            	</td>
            </tr>
            <% } else { %>
            <tr>
            	<td colspan="2" class="ColRowBold"><%=MessageHelper.formatMessage("receivecopies_NoMatchesFound")%></td>
            </tr>
            <% } %>
        </table>

    </td>
</tr>
</base:outlinedTableAndTabsWithinThere>
</base:form>
