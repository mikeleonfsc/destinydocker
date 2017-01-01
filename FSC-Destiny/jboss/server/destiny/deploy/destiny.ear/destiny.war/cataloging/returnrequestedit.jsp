<%@page language="java" %>
<%@page contentType="text/html; charset=UTF-8" %>
<%@page import="java.util.List"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%>
<%@page import="com.follett.fsc.destiny.util.HTMLFilterHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.data.ReturnTitleVO"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.ReturnsSpecs"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.data.ReturnTitleSearchVO"%>
<%@page import="com.follett.fsc.common.StringHelper" %>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.apache.struts.util.ResponseUtils"%>
<%@page import="com.follett.fsc.destiny.util.lookup.LongLongLookup"%>
<%@page import="com.follett.fsc.destiny.util.Barcode"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.BarcodeListTag"%>
<%@page import="com.follett.fsc.common.MessageHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-format.tld" prefix="fmt" %>

<%
    ReturnRequestEditForm form = (ReturnRequestEditForm)request.getAttribute(ReturnRequestEditForm.FORM_NAME);
    boolean isUnsentOrSubmitted = (form.getReturnVO().getStatus() == ReturnsSpecs.STATUS_UNSENT || form.getReturnVO().getStatus() == ReturnsSpecs.STATUS_SUBMITTED) && !form.isPrinterFriendly();
    boolean isDenied = form.getReturnVO().getStatus() == ReturnsSpecs.STATUS_DENIED;
    boolean isEditable = !form.getStore().isStateContext() && (form.getReturnVO().getStatus() == ReturnsSpecs.STATUS_UNSENT || form.getReturnVO().getStatus() == ReturnsSpecs.STATUS_SUBMITTED) && !form.isPrinterFriendly();
    boolean canModifyStateFields = form.getReturnVO().getStatus() == ReturnsSpecs.STATUS_SUBMITTED && !form.isPrinterFriendly();
    boolean isShowAdditionalHeader =  form.getReturnVO().getStatus() == ReturnsSpecs.STATUS_APPROVED || form.getReturnVO().getStatus() == ReturnsSpecs.STATUS_INWAREHOUSE || form.getReturnVO().getStatus() == ReturnsSpecs.STATUS_COMPLETED;
    String focusControl = form.getOverrideFocusControl();
    
    String unsavedChangesStyle = "";
    if (form.isOrderEdited() || (form.isSaveConfirmNeeded() && form.getErrors().size() == 0 && !form.isSaveAndSendConfirmation())) {
        unsavedChangesStyle = "visibility: show; display: block";
    } else {
        unsavedChangesStyle = "visibility: hidden; display: none";
    }
    
    if(StringHelper.isEmptyOrWhitespace(focusControl)) {
        if(form.isDeleteConfirmation() || form.isDenyBibAndReturnConfirmation() || form.isDenyBibConfirmation() || form.isCompletedConfirmation() || form.isInWarehouseReturnConfirmation() ||
            form.isDenyReturnConfirmation() || form.isReceiveWithoutBarcodesConfirmation() || form.isSaveAndSendConfirmation() || form.isPrinterFriendly()) {
            focusControl = "";
        } else {
            if(form.getStore().isStateContext() && 
                form.getStatus() == ReturnsSpecs.STATUS_INWAREHOUSE && form.isReceiveWithBarcode() && 
                form.getReturnVO().getTotalNumberOfCopiesWithBarcode() > 0) {
                if(form.getErrors().isEmpty()) {
                    focusControl = ReturnRequestEditForm.FIELD_RECEIVE_SCAN;
                }
            } else if(isEditable) {
                if(form.getTitlesToReturn() == ReturnRequestEditForm.OPTION_SEARCH_FOR_TITLES) {
                    focusControl = ReturnRequestEditForm.FIELD_SEARCH_STRING;
                } else {
                    focusControl = BarcodeListTag.FIELD_SCAN_ITEM;
                }
            } else if(canModifyStateFields) {
                focusControl = ReturnRequestEditForm.FIELD_NUM_BOXES;
            }
        }
    }
    boolean haveResults = false;
    ReturnTitleSearchVO searchVO = form.getSearchResults();
    if (searchVO != null) {
        List<ReturnTitleVO> recList = searchVO.getResults();
        haveResults = (recList != null) && (recList.size() > 0);
    }
%>


<%@page import="com.follett.fsc.destiny.entity.ejb3.EmailSpecs"%>
<bean:define id="searchTypes" name="cataloging_servlet_ReturnRequestEditForm" property="searchTypes"/>
<bean:define id="carrierList" name="<%= ReturnRequestEditForm.FORM_NAME %>" property="carrierList"/>

<base:messageBox strutsErrors="true"/>

<script language="JavaScript">
<!--
    function trapEnter(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        document.<%=ReturnRequestEditForm.FORM_NAME%>.<%=ReturnRequestEditForm.FIELD_TRAP_ENTER_PRESSED%>.value=true;
      }
      return true;
    }

  function submitDropDown() {
      document.<%=ReturnRequestEditForm.FORM_NAME%>.<%=ReturnRequestEditForm.PARAM_DROPDOWN_SUBMITTED%>.value = "true";
      document.<%=ReturnRequestEditForm.FORM_NAME%>.submit();
  }

  function hideElementApproveReturn() {
	    if (document.layers) { //netscape
	        window.document['divToHideApproveReturn'].visibility = 'none';
            window.document['divToHideApproveReturn'].display = 'none';
	        window.document['divToShowApproveReturn'].visibility = 'show';
            window.document['divToShowApproveReturn'].display = 'block';
	    } else if (document.all) { //ie
	        document.all['divToHideApproveReturn'].style.visibility = 'hidden';
            document.all['divToHideApproveReturn'].style.display = 'none';
	        document.all['divToShowApproveReturn'].style.visibility = 'visible';
            document.all['divToShowApproveReturn'].style.display = 'block';
	    } else if (document.getElementById) { //other
	        document.getElementById('divToHideApproveReturn').style.visibility = 'hidden';
            document.getElementById('divToHideApproveReturn').style.display = 'none';
	        document.getElementById('divToShowApproveReturn').style.visibility = 'visible';
            document.getElementById('divToShowApproveReturn').style.display = 'block';
	    }
	}
  function showEdited(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode != 9) {
          document.<%=ReturnRequestEditForm.FORM_NAME%>.<%=ReturnRequestEditForm.PARAM_ORDER_EDITED%>.value = "true";
          if (document.layers) { //netscape
              window.document['divUnsavedChanges'].visibility = 'show';
              window.document['divUnsavedChanges'].display = 'block';
          } else if (document.all) { //ie
              document.all['divUnsavedChanges'].style.visibility = 'visible';
              document.all['divUnsavedChanges'].style.display = 'block';
          } else if (document.getElementById) { //other
              document.getElementById('divUnsavedChanges').style.visibility = 'visible';
              document.getElementById('divUnsavedChanges').style.display = 'block';
          }
      }
  }
	  

//-->
</script>

<base:form action="/cataloging/servlet/handlereturnrequesteditform.do" styleId="keywordList" focus="<%=focusControl%>" enctype="multipart/form-data">
<% if (!form.isPrinterFriendly()) { %>
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">
<% } %>
<html:hidden property="<%= ReturnRequestEditForm.FIELD_TRAP_ENTER_PRESSED %>" value="false"/>
<html:hidden property="<%=ReturnRequestEditForm.FIELD_STATUS%>"/>
<html:hidden property="<%=ReturnRequestEditForm.FIELD_RECEIVE_WITH_BARCODE%>"/>
<html:hidden property="<%=ReturnRequestEditForm.PARAM_EXPAND_ID%>"/>
<html:hidden property="<%=ReturnRequestEditForm.PARAM_ORDER_EDITED%>"/>
<html:hidden property="<%=ReturnRequestEditForm.PARAM_JOB_ID%>"/>
<html:hidden property="<%=ReturnRequestEditForm.PARAM_SAVE_CONFIRM_NEEDED %>"/>
<html:hidden property="<%=ReturnRequestEditForm.PARAM_DROPDOWN_SUBMITTED %>"/>

<% if (form.isDeleteConfirmation()) { %>
        <html:hidden property="<%= ReturnRequestEditForm.FIELD_TITLE_INDEX_TO_DELETE %>"/>
        
        <base:messageBox showRedBorder="true">
            <tr>
                <td valign="top">
                    <%= MessageBoxTag.getCAUTION_IMAGE_HTML() %>
                </td>
                <td class="ColRowBold">
                    Are you sure you want to remove &quot;<%= ResponseUtils.filter(form.getTitleToDelete()) %>&quot; from this return?
                </td>
            </tr>
            <tr>
                <td align="center" class="ColRow" colspan="2">
                    <base:yesNo/>
                </td>
            </tr>
        </base:messageBox>
<% } else if (form.isInWarehouseReturnConfirmation()) { %>
        <base:messageBox showWarningIcon="true" filterMessage="false" message='<%="Verify the number of boxes received in the warehouse (RMA: " + form.getReturnVO().getRma() + ")." %>'>
            <tr>
                <td></td>
                <td align="center">
                    <table id="<%=ReturnRequestEditForm.TABLE_BOXES_RECEIVED %>">
                        <tr>
                            <td align="center" class="ColRowBold" colspan="1">
                                    Boxes Expected&nbsp;
                            </td>
                            <td align="center" class="ColRowBold" colspan="1">
                                    &nbsp;Received
                            </td>
                        </tr>
                        <tr>
                            <td align="center" class="ColRow" colspan="1">
                                    <%=form.getReturnVO().getNumberOfBoxes() %>&nbsp;
                            </td>
                            <td align="center" class="ColRow" colspan="1">
                                &nbsp;<input type="text" maxlength="3" size="5" align="absbottom" name="<%=ReturnRequestEditForm.FIELD_NUMBER_OF_BOXES_RECEIVED %>" value="<%=form.getReturnVO().getNumberOfBoxes()%>"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="center" class="ColRow" colspan="2">
                                <base:okCancel buttonOkName="<%=ReturnRequestEditForm.BUTTON_INWAREHOUSE_RETURN_YES %>"/>
                            </td>
                        </tr>
                    
                    </table>
                </td>
            </tr>
        </base:messageBox>
<% } else if (form.isReceiveWithoutBarcodesConfirmation()) { %>
    <% String message = form.getReceiveWithoutBarcodesConfirmationMessages();
    
        if(!StringHelper.isEmpty(message)) {
            message += "<br>";
        }
        message += "<center>Are you sure you want to receive the copies without barcodes for return (RMA: " + form.getReturnVO().getRma() + ")?</center>";
    %>
        <base:messageBox showWarningIcon="true" filterMessage="false" message="<%=message%>">
            <tr>
                <td align="center" class="ColRow" colspan="2">
                    <base:yesNo
                        buttonYesName="<%=ReturnRequestEditForm.BUTTON_RECEIVE_WITHOUT_BARCODES_YES %>"/>
                </td>
            </tr>
        </base:messageBox>
<% } else if (form.isSaveAndSendConfirmation()) { %>

        <base:messageBox showWarningIcon="true" filterMessage="false" message='<%= "Please confirm that the copies you are returning are packed in boxes and are ready to be picked up by the shipper.<br>Box count: " + form.getNumBoxes()%>'>
            <tr>
                <td align="center" class="ColRow" colspan="2">
                    <base:genericButton src = "/buttons/large/send.gif" name="<%=ReturnRequestEditForm.BUTTON_SAVE_AND_SEND_CONFIRMATION %>" alt="<%=ReturnRequestEditForm.ALT_SAVE_AND_SEND%>"/>                
                    <base:genericButton src = "/buttons/large/cancel.gif" name="<%=ReturnRequestEditForm.BUTTON_CANCEL_CONFIRM %>" alt="Cancel"/>
                </td>
            </tr>
        </base:messageBox>
<% } else if (form.isDenyReturnConfirmation()) { %>
        <base:messageBox showWarningIcon="true" filterMessage="false" message="Are you sure you want to deny this return?">
            <tr>
                <td align="center" class="ColRow" colspan="2">
                    <base:yesNo
                        buttonNoName="<%=ReturnRequestEditForm.BUTTON_DENY_RETURN_NO %>"
                        buttonYesName="<%=ReturnRequestEditForm.BUTTON_DENY_RETURN_YES %>"
                    />
                </td>
            </tr>
        </base:messageBox>
<% } else if (form.isCompletedConfirmation()) { %>
    <% String message = form.getReceiveWithoutBarcodesConfirmationMessages();
    
        if(!StringHelper.isEmpty(message)) {
            message += "<br>";
        }
        
        if(form.getReturnVO().getTotalNumberOfCopiesWithoutBarcode() > 0 && form.getJobID() == null) {
            message += "<center>Are you sure you want to receive copies without barcodes and complete return (RMA: " + form.getReturnVO().getRma() + ")?</center>";
        } else {
            message += "<center>Are you sure you want to complete return (RMA: " + form.getReturnVO().getRma() + ")?</center>";
        }
    %>
        <base:messageBox showWarningIcon="true" filterMessage="false" message="<%=message %>">
            <tr>
                <td align="center" class="ColRow" colspan="2">
                    <base:yesNo
                        buttonYesName="<%=ReturnRequestEditForm.BUTTON_COMPLETED_YES %>"/>
                </td>
            </tr>
        </base:messageBox>
<% } else if (form.isDenyBibConfirmation() || form.isDenyBibAndReturnConfirmation() ) { %>
        <html:hidden property="<%=ReturnRequestEditForm.FIELD_NAME%>"/>
        
        <%if (form.isDenyBibConfirmation()) { %>
            <base:messageBox showWarningIcon="true" filterMessage="false" message='<%= "Are you sure you want to deny \'" + form.getDenyBibTitle() + "\' for this return?"%>'>
            <tr>
                <td align="center" class="ColRow" colspan="2">
                    <base:yesNo
                        buttonNoName="<%=ReturnRequestEditForm.BUTTON_DENY_BIB_NO %>"
                        buttonYesName="<%=ReturnRequestEditForm.BUTTON_DENY_BIB_YES %>"
                    />
                </td>
            </tr>
        </base:messageBox>
        <%} else { 
            String message = "This is the last title to deny for this return. Denying this title will deny the return.<br/><center>Are you sure you want to deny this return?</center>";%>
            <base:messageBox showWarningIcon="true" filterMessage="false" message='<%= message %>'>
            <tr>
                <td align="center" class="ColRow" colspan="2">
                    <base:yesNo
                        buttonNoName="<%=ReturnRequestEditForm.BUTTON_DENY_RETURN_NO %>"
                        buttonYesName="<%=ReturnRequestEditForm.BUTTON_DENY_RETURN_YES %>"
                    />
                </td>
            </tr>
        </base:messageBox>
        <% } %>
<% } %>

<% if (!form.isPrinterFriendly()) { %>
    <div id="divUnsavedChanges" style="<%=unsavedChangesStyle%>">
      <%
          String message = "Return has unsaved changes.</center>";
      %>
      <base:messageBox showWarningIcon="true" filterMessage="false" message='<%=message%>' tableID=""></base:messageBox>
    </div>
 <% } %>

<logic:equal name="<%=ReturnRequestEditForm.FORM_NAME %>" property="printerFriendly" value="false"> 
    <table width="95%">
        <tr>
            <td class="tdAlignRight">
                <base:link href='<%="/cataloging/servlet/handlereturnrequesteditform.do?" + GenericForm.BUTTON_PRINTER_FRIENDLY + "=true"%>' target="printerFriendly" id="<%=GenericForm.ID_PRINTER_FRIENDLY %>">
                    <base:image src="/buttons/small/printerfriendly.gif" alt='<%=MessageHelper.formatMessage("printable") %>' />
                </base:link>&nbsp;
            </td>
        </tr>
    </table>
</logic:equal>

<%
String bgColor = "#FFFFFF";
if(!form.isPrinterFriendly()) {
    bgColor = FlipperTag.ROW_GRAY;
}
%>

<base:outlinedTable id="<%=ReturnRequestEditForm.TABLE_MAIN%>" borderColor="<%=bgColor %>" align="center">
   <tr>
        <td class="TableHeading" valign="top">
            <%=form.getReturnStatusAsString() %> Return
            <% if (form.getStore().isStateContext()) { %>
                for <%=ResponseUtils.filter(form.getReturnVO().getDistrictName()) %> - <%= ResponseUtils.filter(form.getReturnVO().getSiteNameFull()) %>
            <% } %>
        </td>
    </tr>
    <% if (isShowAdditionalHeader) {  %>
    <tr>
        <td class="ColRow" valign="top">
            <% if(form.getStore().isStateContext()) { %>
                <b>Site:</b>&nbsp;<%=form.getReturnVO().getSiteName() %><br/>
            <% } %>
            <b>RMA:</b>&nbsp;<%=form.getReturnVO().getRma() %>
        </td>
    </tr>
    <% } %> 
    <% if(!form.isPrinterFriendly()){  %>
        <%=form.getAddViewNoteLinkText() %>
    <% } %>
    <tr>
        <td class="TableHeading" colspan="2">
            <IMG height="1" vspace="1" src="/images/icons/general/line.gif" width="100%">
        </td>
    </tr>
    <%-- form fields go here --%>
    <tr>
        <td>
            <table id="<%= ReturnRequestEditForm.TABLE_EDIT_FIELDS%>" align="center">
                <tr valign="top">
                    <td class="ColRowBold tdAlignRight" nowrap>
                        <%=form.showSiteRequiredFlag() ? "*" : "" %> Name
                    </td>
                    <td class="ColRow">
                        <% if (isEditable) { %>
                            <html:text property="<%=ReturnRequestEditForm.FIELD_NAME%>" size="21" maxlength="128" onkeypress="showEdited(event)"/>
                        <% } else { %>
                            <%=JSPHelper.filterHtmlAndNulls(form.getName()) %>
                            <html:hidden property="<%=ReturnRequestEditForm.FIELD_NAME%>"/>
                        <% } %>
                    </td>
                </tr>
                <tr valign="top">
                    <td class="ColRowBold tdAlignRight" nowrap>
                        <%=form.showSiteRequiredFlag() ? "*" : "" %> Phone Number
                    </td>
                    <td class="ColRow">
                        <% if (isEditable) { %>
                            <html:text property="<%=ReturnRequestEditForm.FIELD_PHONE%>" size="21" maxlength="30" onkeypress="showEdited(event)"/>
                        <% } else { %>
                            <%=JSPHelper.filterHtmlAndNulls(form.getPhone()) %>
                            <html:hidden property="<%=ReturnRequestEditForm.FIELD_PHONE%>"/>
                        <% } %>
                    </td>
                </tr>
                <tr valign="top">
                    <td class="ColRowBold tdAlignRight" nowrap>
                        <%=form.showSiteRequiredFlag() ? "*" : "" %> Fax
                    </td>
                    <td class="ColRow">
                        <% if (isEditable) { %>
                            <html:text property="<%=ReturnRequestEditForm.FIELD_FAX%>" size="21" maxlength="30" onkeypress="showEdited(event)"/>
                        <% } else { %>
                            <%=JSPHelper.filterHtmlAndNulls(form.getFax()) %>
                            <html:hidden property="<%=ReturnRequestEditForm.FIELD_FAX%>"/>
                        <% } %>
                    </td>
                </tr>
                <tr valign="top">
                    <td class="ColRowBold tdAlignRight" nowrap>
                        Email
                    </td>
                    <td class="ColRow">
                        <% if (isEditable) { %>
                            <html:text property="<%=ReturnRequestEditForm.FIELD_EMAIL%>" size="21" maxlength='<%="" + EmailSpecs.EMAIL_MAX_LENGTH %>' onkeypress="showEdited(event)"/>
                        <% } else { %>
                            <%=JSPHelper.filterHtmlAndNulls(form.getEmail()) %>
                            <html:hidden property="<%=ReturnRequestEditForm.FIELD_EMAIL%>"/>
                        <% } %>
                    </td>
                </tr>
                <tr valign="top">
                    <td class="ColRowBold tdAlignRight" nowrap>
                        <%=form.showSiteRequiredFlag() ? "*" : "" %> Reason for Return
                    </td>
                    <td class="ColRow">
                        <% if (isEditable) { %>
                            <html:text property="<%=ReturnRequestEditForm.FIELD_REASON%>" size="21" maxlength="255" onkeypress="showEdited(event)"/>
                        <% } else { %>
                            <%=JSPHelper.filterHtmlAndNulls(form.getReason()) %>
                            <html:hidden property="<%=ReturnRequestEditForm.FIELD_REASON%>"/>
                        <% } %>
                    </td>
                </tr>
                <tr valign="top">
                    <td class="ColRowBold tdAlignRight" nowrap>
                        <% if(form.getStatus() == ReturnsSpecs.STATUS_APPROVED || 
                              form.getStatus() == ReturnsSpecs.STATUS_INWAREHOUSE || 
                              form.getStatus() == ReturnsSpecs.STATUS_COMPLETED) { %>
                            <%=form.showSiteRequiredFlag() || form.showStateRequiredFlag() ? "*" : "" %> # Boxes Expected
                        <% } else { %>
                            <%=form.showSiteRequiredFlag() || form.showStateRequiredFlag() ? "*" : "" %> # Boxes
                        <% } %>
                    <td class="ColRow">
                        <% if (isEditable || (form.getStore().isStateContext() && canModifyStateFields)) { %>
                            <html:text property="<%=ReturnRequestEditForm.FIELD_NUM_BOXES%>" size="3" maxlength="3" onkeypress="showEdited(event)"/>
                        <% } else { %>
                            <%=StringHelper.isEmptyOrWhitespace(form.getNumBoxes()) ? "" : form.getNumBoxes() %>
                            <html:hidden property="<%=ReturnRequestEditForm.FIELD_NUM_BOXES%>"/>
                        <% } %>
                    </td>
                </tr>
                <% if(form.getStatus() == ReturnsSpecs.STATUS_INWAREHOUSE || 
                      form.getStatus() == ReturnsSpecs.STATUS_COMPLETED) { %>
                        <tr valign="top">
                            <td class="ColRowBold tdAlignRight" nowrap>
                                # Boxes Received
                            <td class="ColRow">
                                <%=StringHelper.isEmptyOrWhitespace(form.getNumberOfBoxesReceived()) ? "" : form.getNumberOfBoxesReceived() %>
                            </td>
                        </tr>
                <% } %>
                <% if ((!isEditable || (form.getStore().isStateContext() && canModifyStateFields)) && (form.getStatus() != ReturnsSpecs.STATUS_DENIED && form.getStatus() != ReturnsSpecs.STATUS_UNSENT) && (!StringHelper.isEmptyOrWhitespace(form.getCarrierName()) || !form.isPrinterFriendly())) { %>
                    <tr valign="top">
                        <td class="ColRowBold tdAlignRight" nowrap>
                            <%=form.showStateRequiredFlag() ? "*" : "" %> Freight Carrier
                        </td>
                        <td class="ColRow">
                        <% if (form.getStore().isStateContext() && canModifyStateFields){ %>
                            <html:select property="<%=ReturnRequestEditForm.FIELD_CARRIER_ID%>" >
                                <html:options collection="carrierList" property="longID" labelProperty="stringDesc"/>
                            </html:select>
                            &nbsp;
                            <base:genericButton src="/buttons/large/other.gif" absbottom="true" name="<%=ReturnRequestEditForm.BUTTON_CARRIER_OTHER%>" alt="Other" />
                        <% } else {%>
                            <%=StringHelper.isEmptyOrWhitespace(form.getCarrierName()) ? "" : ResponseUtils.filter(form.getCarrierName()) %>
                        <% } %>
                        </td>
                    </tr>
                <% } %>
                <% if(form.getStatus() == ReturnsSpecs.STATUS_INWAREHOUSE || form.getStatus() == ReturnsSpecs.STATUS_COMPLETED) { %>
                    <tr>
                         <td class="ColRowBold tdAlignRight">
                            Copies Sent
                         </td>
                         <td class="ColRow">
                            <%=form.getReturnVO().getTotalNumberOfCopies() %>
                         </td>
                     </tr>
                    <tr>
                         <td class="ColRowBold tdAlignRight">
                            Copies Received
                         </td>
                         <td class="ColRow">
                            <%=form.getReturnVO().getTotalNumberOfCopiesReceived() %>
                         </td>
                     </tr>
                 <% } %>
                
                
                <% if(form.showSiteRequiredFlag() || form.showStateRequiredFlag()) { %>
                <tr>
                    <td>
                        &nbsp;
                    </td>
                    <td class="Instruction">
                        * = Required <%= form.showSiteRequiredFlag() ? "to send" : "to approve" %>
                    </td>
                </tr>
                <% } %>
            </table>
        </td>
        
        <td valign="top" class="tdAlignRight">
        <% if(!form.isPrinterFriendly()) { %>
            <table cellpadding="3">
            <% if (isEditable) { %>
                <tr>
                <td class="tdAlignRight">
                    <base:genericButton src="/buttons/large/saveandsend.gif" absbottom="true" alt="<%= ReturnRequestEditForm.ALT_SAVE_AND_SEND %>" name="<%= ReturnRequestEditForm.BUTTON_SAVE_AND_SEND %>"/>
                 </td>
                 </tr>
                 <% if(form.getStatus() == ReturnsSpecs.STATUS_UNSENT) { %>
                    <tr>
                        <td class="tdAlignRight">
                           <base:saveButton/>
                        </td>
                    </tr>
                 <% } %>
                 <tr>
                     <td class="tdAlignRight">
                        <base:cancelButton absbottom = "true" />
                     </td>
                 </tr>
            <% } else { %>
                <% if (form.getStatus() == ReturnsSpecs.STATUS_APPROVED && !form.isPrinterFriendly()) { %>
                    <tr>
                    <% if(form.getStore().isStateContext() ) { %>
                        <td class="tdAlignRight">
                            <base:genericButton src="/buttons/large/inwarehouse.gif" absbottom="true" alt="<%= ReturnRequestEditForm.ALT_INWAREHOUSE %>" name="<%= ReturnRequestEditForm.BUTTON_INWAREHOUSE_RETURN %>"/><br/>
                        </td>
                    <% } %>            
                    </tr>
                <% } %>
            <% } %>
            <% if (form.getStore().isStateContext() && canModifyStateFields) { %>
                
               <% if(form.isShowApproveButton()) { %>
                <tr>
                    <td class="ColRowBold tdAlignRight">
                    <div id="divToHideApproveReturn">
                        <base:genericButton src="/buttons/large/approve.gif" absbottom="true" alt="<%= ReturnRequestEditForm.ALT_APPROVE %>" name="<%= ReturnRequestEditForm.BUTTON_APPROVE %>" onclick="hideElementApproveReturn()"/>
                    </div>
                    <div id="divToShowApproveReturn" style="visibility: hidden; display: none">Please wait...</div>                    
                   </td>
               </tr>
               <% } %>
                <tr>
                    <td class="tdAlignRight">
                        <base:genericButton src="/buttons/large/denyall.gif" absbottom="true" alt="<%= ReturnRequestEditForm.ALT_DENY_ALL %>" name="<%= ReturnRequestEditForm.BUTTON_DENY_ALL %>"/>
                    </td>
                </tr>
                
                <tr>
                    <td class="tdAlignRight">
                        <%if(form.getStatus() == ReturnsSpecs.STATUS_SUBMITTED && form.getStore().isStateContext()) { %>
                            <base:genericButton src="/buttons/large/close.gif" absbottom="true" alt="<%= ReturnRequestEditForm.ALT_CLOSE %>" name="<%= ReturnRequestEditForm.BUTTON_CLOSE %>"/>
                        <% } else { %>
                            <base:cancelButton absbottom = "true"/>
                        <% } %>
                    </td>
                </tr>
            <%} else if (form.getStatus() == ReturnsSpecs.STATUS_INWAREHOUSE && form.getStore().isStateContext()){%>
                <tr >
                    <td class="tdAlignRight">
                    <% if(form.canShowCompletedButton()) { %>
                        <base:genericButton src="/buttons/large/completed.gif" absbottom="true" alt="<%= ReturnRequestEditForm.ALT_COMPLETED %>" name="<%= ReturnRequestEditForm.BUTTON_COMPLETED %>"/>
                    <% } %>
                   </td>
               </tr>
                <tr>
                    <td class="tdAlignRight">
                        <base:genericButton src="/buttons/large/rmareport.gif" absbottom="true" alt="<%= ReturnRequestEditForm.ALT_RUN_RMA_REPORT %>" name="<%= ReturnRequestEditForm.BUTTON_RUN_RMA_REPORT %>"/>
                    </td>
                </tr> 
                <tr>
                    <td class="tdAlignRight">
                        <base:closeButton withX="false"/>
                    </td>
                </tr> 
           <%} else if (form.getStore().isStateContext()) {%>
                <tr>
                    <td class="tdAlignRight">
                        <base:closeButton withX="false"/>
                    </td>
                </tr> 
           <%} else if (!form.getStore().isStateContext() && !isUnsentOrSubmitted) {%>
                <tr>
                    <td class="tdAlignRight">
                       <base:closeButton withX="false"/>
                    </td>
                </tr>
           <%} else { %>
                <tr>
                    <td class="tdAlignRight">
                    &nbsp;
                    </td>
                </tr>
           <%} %>
       <% } else { %>
            <tr>
                <td class="tdAlignRight">
                &nbsp;
                </td>
            </tr>
       <% } %>
           </table> 
        
       
        </td>
    </tr>
<% if (!form.isPrinterFriendly() && form.showCurrentlySelectedText()) { %>
    <tr>
        <td colspan="2" class="Instruction">
            This is the number of <b>boxes</b> that the shipper can expect to pick up. Do not put in the number of copies.
        </td>
    </tr>
    <tr>
        <base:sectionHeading printerFriendly="false" heading="Select Titles to Return" tdContent="width='100%' colSpan='2'"/>
    </tr>
    <tr>
        <td colspan="2" valign="bottom">
            <html:select property="<%=ReturnRequestEditForm.FIELD_TITLES_TO_RETURN %>" onchange="submitDropDown()" styleClass="ColRowBold">
                <html:option value="<%= String.valueOf(ReturnRequestEditForm.OPTION_SEARCH_FOR_TITLES) %>"><%=ReturnRequestEditForm.OPTION_SEARCH_FOR_TITLES_DISPLAYABLE%></html:option>
                <html:option value="<%= String.valueOf(ReturnRequestEditForm.OPTION_UPLOAD_BARCODES) %>"><%=ReturnRequestEditForm.OPTION_UPLOAD_BARCODES_DISPLAYABLE%></html:option>
            </html:select>&nbsp;
            
        <logic:equal name="<%=ReturnRequestEditForm.FORM_NAME%>" property="<%=ReturnRequestEditForm.FIELD_TITLES_TO_RETURN%>" value='<%= "" +ReturnRequestEditForm.OPTION_SEARCH_FOR_TITLES%>'>
            <span class="ColRowBold">Find&nbsp;<html:text property="<%=ReturnRequestEditForm.FIELD_SEARCH_STRING %>" size="21"/>
            in &nbsp;<html:select property="<%=ReturnRequestEditForm.FIELD_SEARCH_TYPE%>">
                <html:options collection="searchTypes" property="stringCode" labelProperty="stringDesc"/>
            </html:select>&nbsp;<base:goButton absbottom="true"/>&nbsp;</span>
          </td>
        </logic:equal>
        <logic:equal name="<%=ReturnRequestEditForm.FORM_NAME%>" property="<%=ReturnRequestEditForm.FIELD_TITLES_TO_RETURN%>" value='<%= "" +ReturnRequestEditForm.OPTION_UPLOAD_BARCODES%>'>
            <span class="ColRow">Maximum <%="" + form.getMaxBarcodes() %> barcodes per each list/file uploaded</span>
            </td>
        </logic:equal>
    </tr>
    <logic:equal name="<%=ReturnRequestEditForm.FORM_NAME%>" property="<%=ReturnRequestEditForm.FIELD_TITLES_TO_RETURN%>" value='<%= "" +ReturnRequestEditForm.OPTION_UPLOAD_BARCODES%>'>
        <tr>
        <td align="center">
           <base:barcodeList barcodeType="<%= Barcode.BARCODETYPE_TEXTBOOKCOPY %>"
               formName="<%=ReturnRequestEditForm.FORM_NAME%>"
               onKeyPress="showEdited(event)"/>
        </td>
        </tr>
        
        <tr>
            <td align="center">
                <base:showHideTag id="UploadBarcodeScans">
                    <base:genericButton src="/buttons/large/uploadscans.gif" absbottom="true" name="<%= ReturnRequestEditForm.BUTTON_UPLOAD_BARCODES %>" alt="Upload" onclick="hideElementUploadBarcodeScans()"/>
                </base:showHideTag>
            </td>
        </tr>
    </logic:equal>
    
    <% if (form.isExecutedSearch()) { %>
    <tr>
        <td colspan="2" class="SmallColHeading">
            Searched <%=form.getSearchTypeAsString() %> for &quot;<%=JSPHelper.filterHtmlAndNulls(form.getSearchResults().getSearchTerm()) %>&quot;
        </td>
    </tr>
    <tr>
        <td class="TableHeading" colspan="2">
            <IMG height="1" vspace="1" src="/images/icons/general/line.gif" width="100%">
        </td>
    </tr>
    <tr>
        <td colspan = "2">
            <table width = "100%" border = "0"  cellspacing = "0" id = "<%= ReturnRequestEditForm.TABLE_SEARCH_RESULTS %>">
                <% if (!haveResults) { %>
                <tr>
                    <td class="ColRow">
                        No matches found.
                    </td>
                </tr>
                <% } else { %>
                <tr>
                    <td class='SmallColHeading'>Title</td>
                    <td class='SmallColHeading'>ISBN<br/>Edition</td>
                    <td class='SmallColHeading'>State / Textbook ID<br/>Publisher</td>
                    <td class='SmallColHeading' align="center">Available<br/>Copies</td>
                    <td>&nbsp;</td>
                </tr>
                <%
                Iterator<ReturnTitleVO> iter = form.getSearchResults().getResults().iterator();
                int counter = 0;
                while (iter.hasNext()) {
                    ReturnTitleVO rec = iter.next();
                    if (counter % 2 == 0) {
                %>
                    <tr bgcolor="<%= FlipperTag.ROW_GRAY %>" width="100%">
                <% } else { %> 
                    <tr width="100%">
                <% } %>
                    <td class = "ColRow" valign="top">
                        <% if (form.isPrinterFriendly()) { %>
                            <%=JSPHelper.filterHtmlAndNulls(rec.getTitle()) %>
                        <% } else { %>
                            <a href="/cataloging/servlet/presenttextbookdetailform.do?bibID=<%=rec.getBibID() %>" id="<%=ReturnRequestEditForm.ID_LINK_TITLE_DETAIL + rec.getBibID() %>">
                                <%=JSPHelper.filterHtmlAndNulls(rec.getTitle()) %>
                            </a>
                        <% } %>
                    </td>
                    <td class = "ColRow"><%=rec.getDisplayableIsbn() %><br/><%=JSPHelper.filterHtmlAndNulls(rec.getEdition()) %></td>
                    <td class = "ColRow"><%=JSPHelper.filterHtmlAndNulls(rec.getStateTextbookID())%>
                    <br/><%=JSPHelper.filterHtmlAndNulls(rec.getPublisher()) %></td>
                    <td class = "ColRow" align="center" valign="top"><%=rec.getCopiesAvailable() %></td>
                    <td align="center" valign="top">
                    <% if (!form.isPrinterFriendly()) { %>
                        <% if (!rec.isSelected()) { %>
                            <base:genericButton src="/buttons/small/select.gif" absbottom="true" alt="<%= ReturnRequestEditForm.ALT_SELECT %>" name='<%= ReturnRequestEditForm.BUTTON_SELECT_PREFIX + rec.getBibID() %>'/>
                        <% } else { %>
                            <span class="SmallColHeading">Currently Selected</span><br/>
                            <base:genericButton src="/buttons/small/editsmall.gif" absbottom="true" alt="<%= ReturnRequestEditForm.ALT_EDIT %>" name='<%= ReturnRequestEditForm.BUTTON_EDIT_PREFIX + rec.getBibID() %>'/>
                        <% } %>
                    <% } else { %>
                        &nbsp;
                    <% } %>
                    </td>
                </tr>    
                <% counter++;
                    } %> 
                <% } %> 
            </table>
        </td>
    </tr>
<% } %>
<% } %>

<% if (form.getReturnVO().getNumberOfTitles() > 0 || (form.getReturnVO().getTitleList().size() > 0 && form.getStatus() == ReturnsSpecs.STATUS_DENIED)) { %>

        <% if (form.getStatus() == ReturnsSpecs.STATUS_INWAREHOUSE) {%>
            <logic:equal name="<%=ReturnRequestEditForm.FORM_NAME %>" property="printerFriendly" value="false"> 
            <%-- begin barcode option tab --%>
            <tr>
                <td class="ColRowBold" width="100%" colspan = "2"> 
                    <table id = "<%= ReturnRequestEditForm.TABLE_CHOOSE_RECEIVE_BARCODE_MODE %>"  border="1" frame="hSides" width="100%" style="border-collapse: collapse" bordercolor="#C0C0C0" cellspacing="1" cellpadding="2">
                        <tr>
                            <c:choose>
                                <c:when test = "<%= form.isReceiveWithBarcode()%>">
                                    <td class="ColRowBold" align="center" width="50%">
                                        <base:image src = "/icons/general/nextday.gif"/>&nbsp;<%=form.getStore().isStateContext() ? ReturnRequestEditForm.HEADER_WITH_BARCODES_STATE :  ReturnRequestEditForm.HEADER_WITH_BARCODES_SITE %>
                                    </td>
                                    <td class="ColRow" align="center" onclick = "changeReceivingMode(false); return false;">
                                        <a href = "" onclick = "changeReceivingMode(false); return false;" style = "text-decoration:none; color:black"><%=form.getStore().isStateContext() ? ReturnRequestEditForm.HEADER_WITHOUT_BARCODES_STATE : ReturnRequestEditForm.HEADER_WITHOUT_BARCODES_SITE %></a>
                                    </td>
                                </c:when>
                                <c:otherwise>
                                    <td class="ColRow" align="center" width="50%" onclick = "changeReceivingMode(true); return false;">
                                        <a href = "" onclick = "changeReceivingMode(true); return false;" style = "text-decoration:none; color:black"><%=form.getStore().isStateContext() ? ReturnRequestEditForm.HEADER_WITH_BARCODES_STATE : ReturnRequestEditForm.HEADER_WITH_BARCODES_SITE%></a>
                                    </td>
                                    <td class="ColRowBold" align="center">
                                        <base:image src = "/icons/general/nextday.gif"/>&nbsp;<%=form.getStore().isStateContext() ? ReturnRequestEditForm.HEADER_WITHOUT_BARCODES_STATE : ReturnRequestEditForm.HEADER_WITHOUT_BARCODES_SITE%>
                                    </td>                            
                                </c:otherwise>
                            </c:choose>
                        </tr>
                    </table>
                </td>
        <%-- end barcode option tab --%>
            </tr>
            </logic:equal>
            <logic:equal name="<%=ReturnRequestEditForm.FORM_NAME %>" property="printerFriendly" value="true">
            <tr>
                <td class="ColRowBold" width="100%" colspan = "2">
                    <%if(form.getStore().isStateContext()) { %>
                        <%if(form.isReceiveWithBarcode()) { %>
                            <%= ReturnRequestEditForm.HEADER_WITH_BARCODES_STATE %>
                        <% } else { %>
                            <%= ReturnRequestEditForm.HEADER_WITHOUT_BARCODES_STATE %>
                        <% } %>
                    <% } else { %>
                        <%if(form.isReceiveWithBarcode()) { %>
                            <%= ReturnRequestEditForm.HEADER_WITH_BARCODES_SITE %>
                        <% } else { %>
                            <%= ReturnRequestEditForm.HEADER_WITHOUT_BARCODES_SITE %>
                        <% } %>
                    <% } %>
                </td>
            </tr>
            </logic:equal> 
<a name="Hello"></a>                 
                <%if(form.isReceiveWithBarcode()) { %>
                    <%if(form.getReturnVO().getTotalNumberOfCopiesWithBarcode() > 0 && form.getStore().isStateContext() && !form.isPrinterFriendly()) { %>
                        <tr>
                            <td colspan="2" align="center">
                                <table>
                                    <tr>
                                        <td class="ColRowBold tdAlignRight" valign="center" nowrap>Scan or enter one-at-a-time</td>
                                        <td colspan="2" valign="center">
                                            <table border="0" cellspacing="0" cellpadding="0"><tr>
                                            <td>
                                            <span onKeyPress="return trapEnter(event);">
                                                <html:text property="<%= ReturnRequestEditForm.FIELD_RECEIVE_SCAN %>" size="20"/>
                                            </span>
                                            </td>
                                            <td valign="top">&nbsp;<base:genericButton src="/buttons/large/receivebig.gif" absbottom="true" name="<%= ReturnRequestEditForm.BUTTON_RECEIVE_SCAN %>" alt="Receive"/></td>
                                            </tr></table>
                                        </td>
                                    </tr>
                                    
                                    <tr valign="top">
                                        <td valign="top" class="ColRowBold tdAlignRight" nowrap>Or upload a file of barcodes</td>
                                        <td valign="top">
                                            <html:file property="<%= ReturnRequestEditForm.FIELD_UPLOAD_FILE %>" size="20"/>
                                            &nbsp;
                                        </td>
                                        <td class="ColRowBold" valign="middle">
                                        <base:showHideTag id="UploadScans">
                                                <base:genericButton src="/buttons/large/uploadscans.gif" absbottom="true" name="<%= ReturnRequestEditForm.BUTTON_UPLOAD %>" alt="Upload" onclick="hideElementUploadScans()"/>
                                        </base:showHideTag>
                                        </td>
                                    </tr>
                                 </table>
                            </td>
                        </tr>
                     <% } %>
                <% } %>
                <tr>
                    <td colspan="2" class="tdAlignRight">
                        <%if(form.getJobID() == null && !form.isReceiveWithBarcode() &&
                                form.getReturnVO().getTotalNumberOfCopiesWithoutBarcode() > 0 && 
                                form.getStore().isStateContext() && !form.isPrinterFriendly()) { %>
                        
                            <base:genericButton src="/buttons/large/receivebig.gif" alt="<%=ReturnRequestEditForm.ALT_RECEIVE_WITHOUT_BARCODES %>" name="<%= ReturnRequestEditForm.BUTTON_RECEIVE_WITHOUT_COPIES %>"/>
                        <% } %>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <table id="<%=ReturnRequestEditForm.TABLE_RECEIVED_ITEMS %>" width="100%" border="0" cellspacing="0" cellpadding="4">
                            <base:ReturnReceiveItem itemsWithBarcodes="<%=form.isReceiveWithBarcode()%>"
                            items="<%=form.getReturnVO().getTitleList()%>"
                            stateContext="<%=form.getStore().isStateContext() %>"
                            expandedID="<%=form.getExpandID() %>"
                            canReceiveUnbarcoded="<%=form.getJobID() == null %>"
                            formName="<%=ReturnRequestEditForm.FORM_NAME%>" />
                        </table>
                    </td>
                </tr>

    <% } else { %> <%-- all other status than in warehouse --%>



   <tr>
        <base:sectionHeading heading='<%=!form.showCurrentlySelectedText() ? "Returns" : "Currently Selected" %>' tdContent="colspan = '2' width = '100%'"></base:sectionHeading>
   </tr>
   <tr>
        <td colspan = "2">
            <table width = "100%" border = "0"  cellspacing="0" cellpadding="4" id="<%= ReturnRequestEditForm.TABLE_SELECTED %>">
             <tr>
                <td class='SmallColHeading'>&nbsp;</td>
                <td class='SmallColHeading'>&nbsp;</td>
                <td class='SmallColHeading'>&nbsp; </td>
                <td class='SmallColHeading'>&nbsp; </td>
                <% String copyStatus = "--Returning--"; 
                if(form.getStatus() == ReturnsSpecs.STATUS_COMPLETED) {
                    copyStatus = "--Received--";
                } %>
                <td class='SmallColHeading' align="center" colspan="2" valign="bottom"><%=copyStatus %></td>
                <td>&nbsp;</td>
            </tr>
            
            <tr>
                <td class='SmallColHeading'>Title</td>
                <td class='SmallColHeading'>ISBN<br/>Edition</td>
                <td class='SmallColHeading'>State / Textbook ID<br/>Publisher</td>
                
                <td class='SmallColHeading' align="center">&nbsp;</td>
                <td class='SmallColHeading' align="center">With<br/>Barcodes</td>
                <td class='SmallColHeading' align="center">Without<br/>Barcodes</td>
                <td>&nbsp;</td>
            </tr>
            <%
            Iterator<ReturnTitleVO> iter = form.getReturnVO().getTitleList().iterator();
            int counter = 0;
            int totalWith = 0;
            int totalWithout = 0;
            int totalWithReceived = 0;
            int totalWithoutReceived = 0;
            while (iter.hasNext()) {
                ReturnTitleVO rec = iter.next();
                
                if(rec.getStatus() != ReturnsSpecs.STATUS_BIB_DENIED || form.getStatus() != ReturnsSpecs.STATUS_COMPLETED) {
                    totalWith+= rec.getCopiesWithBarcode(form.getStatus() == ReturnsSpecs.STATUS_COMPLETED);
                    totalWithReceived+= rec.getCopiesWithBarcodeReceived();
                    if (rec.getCopiesWithoutBarcode() != null){
                        totalWithout+= rec.getCopiesWithoutBarcode().intValue();
                    }
                    if (rec.getCopiesWithoutBarcodeReceived() != null){
                        totalWithoutReceived += rec.getCopiesWithoutBarcodeReceived().intValue();
                    }
                    if (counter % 2 == 0) {
                    %>
                        <tr bgcolor="<%= FlipperTag.ROW_GRAY %>" valign="top" width="100%">
                    <% } else { %> 
                        <tr width="100%" valign="top">
                    <% } %>
                        <td class = "ColRow" valign="top">
                    <% if (form.isPrinterFriendly()) { %>
                        <%=JSPHelper.filterHtmlAndNulls(rec.getTitle()) %>
                    <% } else if (rec.isDeleted() && form.getStatus() != ReturnsSpecs.STATUS_COMPLETED) { %>
                        <%=JSPHelper.filterHtmlAndNulls(rec.getTitle()) %> <font color="#CC0000">(Removed)</font>
                     <% } else { %>
                        <a href="/cataloging/servlet/presenttextbookdetailform.do?bibID=<%=rec.getBibID() %>" id="<%=ReturnRequestEditForm.ID_LINK_TITLE_DETAIL + rec.getBibID() %>">
                            <%=JSPHelper.filterHtmlAndNulls(rec.getTitle()) %>
                        </a>
                     <% } %>
                        </td>
                        <td class = "ColRow"><%=JSPHelper.filterHtmlAndNulls(rec.getDisplayableIsbn())%><br/><%=JSPHelper.filterHtmlAndNulls(rec.getEdition())%></td>
                        <td class = "ColRow"><%=JSPHelper.filterHtmlAndNulls(rec.getStateTextbookID())%><br/><%=JSPHelper.filterHtmlAndNulls(rec.getPublisher())%></td>
                        <td class = "ColRow" align="center" valign="top">&nbsp;</td>
                    
                        <%  boolean displayInRed = false;
                            if(rec.getCopiesWithBarcode() == 0 && (rec.getCopiesWithoutBarcode() == null || rec.getCopiesWithoutBarcode().intValue() == 0)) {
                                displayInRed = true;                        
                            }
                        %>
                    <td class = "ColRow" align="center" valign="top">
                        <%if(displayInRed) { %>
                            <font color="#CC0000">
                        <% } %>
                            <%if(form.getStatus() == ReturnsSpecs.STATUS_COMPLETED) { %>
                                <%=rec.getCopiesWithBarcodeReceived() %>/<%=rec.getCopiesWithBarcode(true) %>
                            <% } else {%>
                                <%=rec.getCopiesWithBarcode() %>
                            <% } %>
                        <%if(displayInRed) { %>
                            </font>
                        <% } %>
                    </td>
                    <td class = "ColRow" align="center" valign="top">
                        <%if(displayInRed) { %>
                            <font color="#CC0000">
                        <% } %>
        
                        <%if(form.getStatus() == ReturnsSpecs.STATUS_COMPLETED) { %>
                            <%=rec.getCopiesWithoutBarcodeReceived() == null ? "0" : rec.getCopiesWithoutBarcodeReceived() %>/<%=rec.getCopiesWithoutBarcode() == null ? "0" : rec.getCopiesWithoutBarcode() %>
                        <% } else {%>
                            <%=rec.getCopiesWithoutBarcode() == null ? "0" : rec.getCopiesWithoutBarcode() %>
                        <% } %>
                        <%if(displayInRed) { %>
                            </font>
                        <% } %>
                    </td>
                    <td class = "SmallColHeading" align = "center" valign="top" nowrap="nowrap">
                        <table>
                    <% if (!form.isPrinterFriendly()) { %>
                        <% if (!rec.isDeleted()) { %>
                            <% if (rec.getStatus() == ReturnsSpecs.STATUS_BIB_DENIED) { %>
                                <tr align="center">
                                    <td>
                                        Denied
                                    </td>
                                </tr>
                                <% if(form.showViewButton(rec)) { %>
                                <tr align="center">
                                    <td>
                                        <base:genericButton src="/buttons/small/viewsmall.gif" absbottom="false" alt="<%= ReturnRequestEditForm.ALT_VIEW_COPIES %>" name='<%= ReturnRequestEditForm.BUTTON_VIEW_COPIES_PREFIX + rec.getBibID() %>'/>
                                    </td>
                                </tr>
                                <% } %>
                            <% } else { %>
                                <% if (form.getStore().isStateContext()){ %>
                                    <%if(canModifyStateFields) { %>
                                        <tr align="center">
                                            <td>
                                                <base:genericButton src="/buttons/small/deny.gif" absbottom="true" alt="<%= ReturnRequestEditForm.ALT_DENY %>" name='<%= ReturnRequestEditForm.BUTTON_DENY_PREFIX + rec.getBibID() %>'/>
                                            </td>
                                        </tr>
                                        <% if(form.showViewButton(rec)) { %>
                                        <tr align="center">
                                            <td>
                                                <base:genericButton src="/buttons/small/viewsmall.gif" absbottom="false" alt="<%= ReturnRequestEditForm.ALT_VIEW_COPIES %>" name='<%= ReturnRequestEditForm.BUTTON_VIEW_COPIES_PREFIX + rec.getBibID() %>'/>
                                            </td>
                                        </tr>
                                        <% } %>
                                    <% } else { %>
                                        <% if(rec.getStatus() != ReturnsSpecs.STATUS_BIB_UNKNOWN) { %>
                                        <tr align="center">
                                           <td>
                                                <%=form.getBibStatusAsString(rec.getStatus()) %>
                                            </td>
                                        </tr>
                                        <% } %>
                                        <% if(form.showViewButton(rec)) { %>
                                        <tr align="center">
                                            <td>
                                                <base:genericButton src="/buttons/small/viewsmall.gif" absbottom="false" alt="<%= ReturnRequestEditForm.ALT_VIEW_COPIES %>" name='<%= ReturnRequestEditForm.BUTTON_VIEW_COPIES_PREFIX + rec.getBibID() %>'/>
                                            </td>
                                        </tr>
                                        <% } %>
                                    <% } %>
                                <%} else { %>
                                    <%if(isEditable) { %>
                                        <% if (!rec.isDeleted()) { %>
                                            <tr align="center">
                                                <td class="SmallColHeading" nowrap>
                                                    <base:genericButton src="/icons/general/edit.gif" absbottom="true" alt="<%= ReturnRequestEditForm.ALT_EDIT %>" name='<%= ReturnRequestEditForm.BUTTON_EDIT_PREFIX + rec.getBibID() %>'/>
                                                    <base:genericButton src="/icons/general/x.gif" absbottom="true" alt="<%= ReturnRequestEditForm.ALT_REMOVE %>" name='<%= ReturnRequestEditForm.BUTTON_REMOVE_PREFIX + counter %>'/>
                                                </td>
                                            </tr>
                                        <% }  else {%>
                                            <tr align="center">
                                                <td class="SmallColHeading">
                                                    <base:genericButton src="/icons/general/x.gif" absbottom="true" alt="<%= ReturnRequestEditForm.ALT_REMOVE %>" name='<%= ReturnRequestEditForm.BUTTON_REMOVE_PREFIX + counter %>'/>
                                                </td>
                                            </tr>
                                         <% } %>
                                    <% } else { %>
                                        <% if(rec.getStatus() != ReturnsSpecs.STATUS_BIB_UNKNOWN) { %>
                                        <tr align="center">
                                            <td>
                                                <%=form.getBibStatusAsString(rec.getStatus()) %>
                                            </td>
                                        </tr align="center">
                                        <% } %>
                                        <% if(form.showViewButton(rec)) { %>
                                        <tr align="center">
                                            <td class="SmallColHeading">
                                                <base:genericButton src="/buttons/small/viewsmall.gif" absbottom="false" alt="<%= ReturnRequestEditForm.ALT_VIEW_COPIES %>" name='<%= ReturnRequestEditForm.BUTTON_VIEW_COPIES_PREFIX + rec.getBibID() %>'/>
                                            </td>
                                        </tr>
                                        <% } %>
                                    <% } %>                                
                                <%}  %>
                            <%}  %>
                        <%} else { %>
                            <% if ((form.getReturnVO().getStatus() == ReturnsSpecs.STATUS_SUBMITTED || 
                                   form.getReturnVO().getStatus() == ReturnsSpecs.STATUS_UNSENT) && !form.getStore().isStateContext()) { %>
                            <% // per AT 24181, deleted titles in submitted returns should still be removeable %>
                                <tr align="center">
                                    <td class="SmallColHeading">
                                        <base:genericButton src="/icons/general/x.gif" absbottom="true" alt="<%= ReturnRequestEditForm.ALT_REMOVE %>" name='<%= ReturnRequestEditForm.BUTTON_REMOVE_PREFIX + counter %>'/>
                                    </td>
                                </tr>
                            <%} else if(form.getReturnVO().getStatus() == ReturnsSpecs.STATUS_COMPLETED) { %>
                                    <% if(form.showViewButton(rec)) { %>
                                    <tr align="center">
                                        <td class="SmallColHeading">
                                            <base:genericButton src="/buttons/small/viewsmall.gif" absbottom="false" alt="<%= ReturnRequestEditForm.ALT_VIEW_COPIES %>" name='<%= ReturnRequestEditForm.BUTTON_VIEW_COPIES_PREFIX + rec.getBibID() %>'/>
                                        </td>
                                    </tr>
                                <% } %>
                            <% } %>
                        <%}  %>
                    <% } else if(form.isPrinterFriendly()) { %>
                        <% if (rec.getStatus() == ReturnsSpecs.STATUS_BIB_DENIED) { %>
                            <tr>
                                <td>
                                    Denied
                                </td>
                            </tr>
                        <% } else if(rec.getStatus() == ReturnsSpecs.STATUS_BIB_APPROVED) { %>
                            <tr>
                                <td>
                                    Approved
                                </td>
                            </tr>
                        <% } %>
                    <% } %>
                        </table>
                    </td>
                </tr> 
                <%      counter++;
                    } }
                %> 
                
                <%if(!isDenied) { %>
                <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td class = "ColRowBold">Total</td>
                    <td>&nbsp;</td>
                    <td align="center" class = "ColRowBold">
                        <%if(form.getStatus() == ReturnsSpecs.STATUS_COMPLETED) { %>
                            <%=totalWithReceived %>/<%=totalWith %>
                        <% } else {%>
                            <%=totalWith %>
                        <% } %>
                    </td>
                    <td align="center" class = "ColRowBold">
                        <%if(form.getStatus() == ReturnsSpecs.STATUS_COMPLETED) { %>
                            <%=totalWithoutReceived %>/<%=totalWithout %>
                        <% } else { %>
                            <%=totalWithout %>
                        <% } %>
                    </td>
                    <td>&nbsp;</td>
                </tr>
                <% } %>
                </table>
            </td>
        </tr>
        <logic:equal name="<%=ReturnRequestEditForm.FORM_NAME%>" property="printerFriendly" value="false"> 
            <% if(!form.getStore().isStateContext() && (form.getStatus() == ReturnsSpecs.STATUS_UNSENT || form.getStatus() == ReturnsSpecs.STATUS_SUBMITTED)) { %>    
                <tr>
                    <td colspan="2">
                        <base:imageLine/>
                    </td>
                </tr>     
                <tr align="center">
                    <td  colspan="2">
                        <base:helpIcons buttonsToOutput="<%= form.getHelpIcons() %>"/>
                    </td>
                </tr>
            <% } %>
        </logic:equal>
    <%} %> <%-- end if in warehouse status --%>    
<% } %>    
</base:outlinedTable>

<script language="javascript">
<!--
function changeReceivingMode(receivingWithBarcodes) {
    document.<%=ReturnRequestEditForm.FORM_NAME%>.<%=ReturnRequestEditForm.FIELD_RECEIVE_WITH_BARCODE%>.value = receivingWithBarcodes;        
    document.<%=ReturnRequestEditForm.FORM_NAME%>.submit();
}
function changeShowMoreLess(bibID) {
    document.<%=ReturnRequestEditForm.FORM_NAME%>.<%=ReturnRequestEditForm.PARAM_EXPAND_ID%>.value = bibID;        
    document.<%=ReturnRequestEditForm.FORM_NAME%>.submit();
}

// -->
</script>

</base:form>


