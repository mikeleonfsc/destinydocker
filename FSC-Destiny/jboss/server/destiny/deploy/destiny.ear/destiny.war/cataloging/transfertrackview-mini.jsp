<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.CopyInfoMiniTag" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CopySpecs" %>
<%@ page import="com.follett.fsc.common.StringHelper"%>
<%@ page import="com.follett.fsc.destiny.util.CollectionType"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    TransferTrackViewForm form = (TransferTrackViewForm)request.getAttribute(TransferTrackViewForm.FORM_NAME);
%>

<script language="JavaScript" type="text/javascript">
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

<base:form action="/cataloging/servlet/handletransfertrackviewform.do" focus="<%=TransferTrackViewForm.FIELD_SEARCH_STRING%>">
	<html:hidden property="<%=GenericForm.FIELD_COLLECTION_TYPE%>"/>
    <bean:define id="numReceivedItems" name="<%=TransferTrackViewForm.FORM_NAME%>" property="numReceivedItems"/>
    <html:hidden property="<%=TransferTrackViewForm.PARAM_TRANSFER_ID%>"/>
    <html:hidden property="<%=TransferTrackViewForm.FIELD_SUBMIT_TYPE%>" value=""/>
       
    <table id="<%=TransferTrackViewForm.TABLE_MAIN%>" cellSpacing="0" cellPadding="0" width="100%" border="0">
    <tr>
       	<td>
           <table id="<%=TransferTrackViewForm.TABLE_MAIN_HEADER%>" border="0" cellpadding="0" width="100%">			
			<tr>
				<td class="SmallColHeading">
					Created
                    <%
				    if (form.getCollectionType() == CollectionType.ASSET) {
				%>
                        <bean:write name="<%=TransferTrackViewForm.FORM_NAME%>" property="transferDate"/> - Items: <%=form.getMiniDTotalCopiesReceived()%>
                    <%
                        } else {
                    %>
					   <bean:write name="<%=TransferTrackViewForm.FORM_NAME%>" property="transferDate"/> - Copies: <%=form.getMiniDTotalCopiesReceived()%>
                    <%
                        }
                    %>
				</td>
			</tr>
			
			<tr>
				<td class="SmallColHeading" valign="top">
                   <%
                       if (form.getCollectionType() == CollectionType.ASSET) {
                   %>
                       Items Received: <%=numReceivedItems%>
                   <%
                       } else {
                   %>
                       Copies Received: <%=numReceivedItems%>
                   <%
                       }
                   %>
                </td>
			</tr>				
			</table>
        </td>
    </tr>
    <tr>
    	<td>
	        <table id="<%=TransferTrackViewForm.TABLE_BARCODE_SEARCH%>" cellSpacing="0" cellPadding="4" width="100%">
	 	    <tr>
			    <td class="ColRowBold" nowrap>Barcode</td>
			    <td class="ColRowBold"><span onKeyPress="return trapEnter(event);"><html:text property="<%=TransferTrackViewForm.FIELD_SEARCH_STRING%>" maxlength='<%="" + CopySpecs.COPY_MAX_COPY_BARCODE_LENGTH%>' size="14"/></span></td>
			    <td width="100%"><base:genericButton src="/icons/general/accountforicon.gif" name="<%= TransferTrackViewForm.BUTTON_SEARCH_AND_RECEIVE %>" alt="Search and receive"/></td>
			</tr>
 			</table>
 			<logic:present name="<%= TransferTrackViewForm.FORM_NAME %>" property="lastScannedCIB">
 			<table id="<%=TransferTrackViewForm.TABLE_RECEIVED_DETAIL %>" cellSpacing="0" cellPadding="4" width="100%">
 				<tr>
 					<td class="TableHeading2" nowrap>
						<base:copyInfoMini cib="<%= form.getLastScannedCIB() %>" displayMode="<%= CopyInfoMiniTag.COPY_INFO_DISPLAY_MODE_INVENTORY %>"/>
 					</td>
 				</tr>
 			</table>
 			</logic:present>
	   </td>
    </tr>
	</table>
</base:form>
