<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.CopyWithoutBarcodeMaintenanceForm"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.CopyWithoutBarcodeDeleteForm"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.CopyWithoutBarcodeLostForm"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.CopyWithoutBarcodeFoundForm"%>
<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.destiny.util.CollectionType"%>


<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%
    CopyWithoutBarcodeMaintenanceForm form = (CopyWithoutBarcodeMaintenanceForm)request.getAttribute(CopyWithoutBarcodeDeleteForm.FORM_NAME);
    String action = "/cataloging/servlet/handlecopywithoutbarcodedeleteform.do";
    if  (form == null) {
        form = (CopyWithoutBarcodeMaintenanceForm)request.getAttribute(CopyWithoutBarcodeLostForm.FORM_NAME);
        action = "/cataloging/servlet/handlecopywithoutbarcodelostform.do";
    }
    if  (form == null) {
        form = (CopyWithoutBarcodeMaintenanceForm)request.getAttribute(CopyWithoutBarcodeFoundForm.FORM_NAME);
        action = "/cataloging/servlet/handlecopywithoutbarcodefoundform.do";
    }
%>
<base:messageBox strutsErrors="true"/>

<base:form action="<%=action%>" focus="<%=CopyWithoutBarcodeMaintenanceForm.FIELD_COPIES_TO_PROCESS%>" method="post">
<html:hidden property="<%= CopyWithoutBarcodeMaintenanceForm.PARAM_SITE_ID %>"/>
<html:hidden property="<%= CopyWithoutBarcodeMaintenanceForm.PARAM_STATE_SITE_ID %>"/>
<html:hidden property="<%= CopyWithoutBarcodeMaintenanceForm.PARAM_COPY_STATUS %>"/>
<html:hidden property="<%= CopyWithoutBarcodeMaintenanceForm.PARAM_BIB_ID %>"/>
<html:hidden property="<%= CopyWithoutBarcodeMaintenanceForm.PARAM_COLLECTION_TYPE %>"/>

    <% if (form.isDoConfirm()) { %>
    <base:confirmBox showWarningIcon="true" filterMessage="false"
            header="<%=form.getConfirmHeader()%>"           
            messageText="<%=form.getConfirmText()%>" 
            noName="<%=CopyWithoutBarcodeMaintenanceForm.BUTTON_CONFIRM_NO %>"
            yesName="<%=CopyWithoutBarcodeMaintenanceForm.BUTTON_CONFIRM_YES %>"
            showPleaseWait="true"
    />  
    <% } %>        


    <base:outlinedTable id="<%=CopyWithoutBarcodeMaintenanceForm.TABLE_MAIN%>" cellpadding="5" cellspacing="0" width="100%" borderColor="#C0C0C0">
        <tr>
            <td class="TableHeading" colspan="2"><%=form.getPageTitle()%></td>
        </tr>
        <tr>
          <td colspan="2">
            <table id="<%=CopyWithoutBarcodeMaintenanceForm.TABLE_SECONDARY%>" align="center" border="0" cellpadding="0" cellspacing="0">
                <tr>
                    <td class="TableHeading2" colspan="2" align="center" valign="top">
                        <%=form.getBibTitle()%>
                    </td>
                </tr>
                <%if (!StringHelper.isEmpty(form.getAuthor())) { %>
                    <tr>
                        <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("copywithoutbarcodemaintenance_Author") %>&nbsp;&nbsp;</td>
                        <td class="SmallColRow"><%=form.getAuthor()%></td>
                    </tr>
               <% } %>
            </table>
          </td>
        </tr>
        <tr>
          <td colspan="2"><img src="/images/icons/general/line.gif" border="0" height="1" width="100%"></td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight">
                <% if (form.isUnknownBarcode()) { %>
				<%= MessageHelper.formatMessage("copywithoutbarcodemaintenance_CopiesWithUnidentifiedBarcodes") %>
                <% } else { %>
                    <% if (CollectionType.ASSET == form.getCollectionType()) { %>
				        <%=MessageHelper.formatMessage("copywithoutbarcodemaintenance_ItemsWithoutBarcodes") %>
                    <% } else { %>
                        <%=MessageHelper.formatMessage("copywithoutbarcodemaintenance_CopiesWithoutBarcodes") %>
                    <% } %>                 
                <% } %>
            </td>
            <td class="ColRow">
                <%=form.getTotalCopies()%>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight">
                <% if (CollectionType.ASSET == form.getCollectionType()) { %>
                    <%= MessageHelper.formatMessage("copywithoutbarcodemaintenance_ItemsTo",form.getActionDescription()) %>
                <% } else { %>
                    <%= MessageHelper.formatMessage("copywithoutbarcodemaintenance_CopiesTo",form.getActionDescription()) %>
                <% } %>
            </td>
            <td class="ColRow">
                <input  name="<%=CopyWithoutBarcodeMaintenanceForm.FIELD_COPIES_TO_PROCESS%>" size="14" maxlength="4" value="<%=form.getCopiesToProcess()%>" type="text">
            </td>
        </tr>
            <tr>
                <td class="ColRow tdAlignRight">
                    <base:genericButton
                      src="<%=form.getActionButtonImage()%>"
                      alt="<%=form.getPageTitle()%>"
                      name="<%=CopyWithoutBarcodeMaintenanceForm.BUTTON_PROCESS%>"
                      />
                </td>
                <td class="ColRow" valign="top">
                    <base:cancelButton/>
                </td>
            </tr>
    </base:outlinedTable>
</base:form>
