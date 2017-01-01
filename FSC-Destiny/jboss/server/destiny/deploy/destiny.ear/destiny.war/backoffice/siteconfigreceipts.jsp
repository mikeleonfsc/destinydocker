<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb.*"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.ConfigSiteSpecs"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%-- I18n Support --%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ page import="com.follett.fsc.common.MessageHelper"%>


<%
    SiteConfigReceiptsForm form = (SiteConfigReceiptsForm)request.getAttribute(SiteConfigReceiptsForm.FORM_NAME);
    boolean isInternationalProduct = UserContext.getMyContextLocaleHelper().isInternationalProduct();
%>

<%@page import="com.follett.fsc.destiny.entity.ejb3.EmailSpecs"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.ejb.NotificationEmailFacadeSpecs"%>


<%@page import="com.follett.fsc.common.consortium.UserContext"%><script language="JavaScript">
<!--
    function trapEnterKey(e, ctrl) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (whichCode == 13) {
        if (bibID == -1) {
            whichCode = 10;
        } else {
            document.<%=SiteConfigReceiptsForm.FORM_NAME%>.<%=SiteConfigReceiptsForm.PARAM_WHERE_WAS_ENTER%>.value=ctrl;                       
            document.<%=SiteConfigReceiptsForm.FORM_NAME%>.<%=SiteConfigReceiptsForm.FIELD_TRAP_ENTER_PRESSED%>.value = "true";
        }
      }
      return whichCode;
    }

      
//-->
</script>

<base:messageBox strutsErrors="true"/>


<base:form action="/backoffice/servlet/handlesiteconfigreceiptsform.do" focus="<%=SiteConfigReceiptsForm.FIELD_SHOW_PATRON_NAME_BARCODE%>">
    <c:if test="<%= SiteConfigReceiptsForm.ACTION_DELETE_EMAIL.equals(form.getAction()) %>">

         <base:confirmBox showWarningIcon="true" filterMessage="false"
            header='<%=MessageHelper.formatMessage("siteconfigreceipts_DeleteTheFollowingRefundNotification")%>'           
            messageText="<%=form.buildConfirmDeleteMessage()%>"
            yesName="<%=SiteConfigReceiptsForm.BUTTON_CONFIRM_DELETE%>"
            noName="<%=SiteConfigReceiptsForm.BUTTON_CONFIRM_DELETE_NO%>"
          />
    </c:if>
    
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">
    <html:hidden property="siteID" />
    <html:hidden property="<%=SiteConfigReceiptsForm.PARAM_WHERE_WAS_ENTER%>" value="0"/>
    <html:hidden property="<%=SiteConfigReceiptsForm.FIELD_TRAP_ENTER_PRESSED%>" value="false"/>
    <html:hidden property="<%=SiteConfigReceiptsForm.PARAM_EMAIL_ID%>"/>
    <% if(isInternationalProduct){ %>
        <html:hidden property = "<%=SiteConfigReceiptsForm.FIELD_EMAIL_PRODUCT_TYPE %>" value = "<%= NotificationEmailFacadeSpecs.PARAM_PT_LIB %>" />
   <%} %>
    
    <jsp:include page="/common/msdewarning.jsp" flush="true" />
    
    <base:outlinedTableAndTabsWithinThere id="<%=SiteConfigReceiptsForm.TABLE_OUTER%>"  borderColor="#C0C0C0" selectedTab="<%=SiteConfigReceiptsForm.ID_TAB_RECEIPTS%>" tabs="<%=form.getTabs()%>" cellpadding="2" width="100%">
        <tr>
            <td width="100%">
                <table id="<%=SiteConfigReceiptsForm.TABLE_MAIN%>" width="100%">
                    <tr>
			<td colspan="2" class="TableHeading"><%=MessageHelper.formatMessage("siteconfigreceipts_WhenPrintingReceipts") %></td>
                    </tr>
                    <tr>
			<td width="18%" class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("siteconfigreceipts_Show") %></td>
			<td class="ColRow">
			    <html:checkbox property="<%=SiteConfigReceiptsForm.FIELD_SHOW_PATRON_NAME_BARCODE%>"><%=MessageHelper.formatMessage("siteconfigreceipts_PatronNameAndBarcode") %></html:checkbox>
                        </td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
            <td class="ColRow">
                <html:checkbox property="<%=SiteConfigReceiptsForm.FIELD_SHOW_HOMEROOM%>"><%=MessageHelper.formatMessage("siteconfigreceipts_Homeroom") %></html:checkbox>
                        </td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
			<td class="ColRow">
			    <html:checkbox property="<%=SiteConfigReceiptsForm.FIELD_SHOW_TITLES%>"><%=MessageHelper.formatMessage("siteconfigreceipts_Titles") %></html:checkbox>
                        </td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
			<td class="ColRow"><%=MessageHelper.formatMessage("siteconfigreceipts_ReceiptHeader") %></td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
			<td class="ColRow">
                            <html:text property="<%=SiteConfigReceiptsForm.FIELD_RECEIPT_HEADER%>" size="62" maxlength="38"/>
                        </td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
			<td class="ColRow"><%=MessageHelper.formatMessage("siteconfigreceipts_SpecialNote") %></td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
			<td class="ColRow">
                            <html:textarea cols="62" rows="2" property="<%=SiteConfigReceiptsForm.FIELD_RECEIPT_NOTE%>"/>
                        </td>
                    </tr>
                    <tr>
			<td width="18%" class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("siteconfigreceipts_Format") %></td>
			<td class="ColRow">
                <html:radio property="<%=SiteConfigReceiptsForm.FIELD_RECEIPT_FORMAT%>" value="<%=String.valueOf(ConfigSiteSpecs.RECEIPT_FORMAT_WIDE)%>"><%=MessageHelper.formatMessage("siteconfigreceipts_LaserInkJetPrinter") %></html:radio>
                        </td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
			<td class="ColRow">
                <html:radio property="<%=SiteConfigReceiptsForm.FIELD_RECEIPT_FORMAT%>" value="<%=String.valueOf(ConfigSiteSpecs.RECEIPT_FORMAT_40COLUMN)%>"><%=MessageHelper.formatMessage("siteconfigreceipts_FollettReceiptPrinter40Characters") %></html:radio>
                        </td>
                    </tr>
                </table>
            </td>
            <td valign="top">
                <base:showHideTag id="onSave">
                    <base:saveButton onclick="hideElementonSave()"/>
                </base:showHideTag>
            </td>
        </tr>
        <logic:equal name="<%= SiteConfigReceiptsForm.FORM_NAME %>" property="<%= SiteConfigReceiptsForm.PARAM_DISPLAY_REFUND_SECTION%>" value="true">
           <tr>
              <td colspan="2"><base:imageLine height="3" /></td>
           </tr>
           <tr>
              <td class="TableHeading">
                  <%=MessageHelper.formatMessage("siteconfigreceipts_WhenARefundIsGeneratedNotify") %>
              </td>
              <td class="tdAlignRight">
                  <base:genericButton name="<%=SiteConfigReceiptsForm.BUTTON_ADD_EMAIL %>" alt="Add new email" src="/buttons/large/add.gif" absbottom="true"/>
              </td>
           </tr>
           <tr>
              <td colspan="2">
                 <table id="<%=SiteConfigReceiptsForm.TABLE_NOTIFY%>" width="100%">
                    
                    <logic:equal name="<%= SiteConfigReceiptsForm.FORM_NAME %>" property="<%= SiteConfigReceiptsForm.PARAM_DISPLAY_PRODUCT_DROPDOWN%>" value="true">
                    <% if(!isInternationalProduct){ %>
                        <tr>
                            <td width="18%" class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("siteconfigreceipts_Product") %></td>
                            <td>
                                <html:select property = "<%=SiteConfigReceiptsForm.FIELD_EMAIL_PRODUCT_TYPE %>">
                                    <html:option value = "<%= NotificationEmailFacadeSpecs.PARAM_PT_SELECT %>">-- Select a product --</html:option>
                                    <html:option value = "<%= NotificationEmailFacadeSpecs.PARAM_PT_LIB %>">Library</html:option>
                                    <html:option value = "<%= NotificationEmailFacadeSpecs.PARAM_PT_TB %>">Textbook</html:option>
                                    <html:option value = "<%= NotificationEmailFacadeSpecs.PARAM_PT_BOTH %>">Library/Textbook</html:option>
                                </html:select>                        
                            </td>
                       </tr>
                   <%}%>
                   </logic:equal>
                   <tr>
                        <td width="18%" class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("siteconfigreceipts_Name") %></td>
                        <td>
                        <html:text onkeypress="trapEnterKey(event, '1')" property="<%=SiteConfigReceiptsForm.FIELD_EMAIL_NAME%>" size="40" maxlength="80"/>
                        </td>
                   </tr>
                   <tr>
                        <td width="18%" class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("siteconfigreceipts_Email") %></td>
                        <td>
                          <html:text onkeypress="trapEnterKey(event, '2')" property="<%=SiteConfigReceiptsForm.FIELD_EMAIL_ADDRESS%>" size="40" maxlength='<%="" + EmailSpecs.EMAIL_MAX_LENGTH %>'/>
                          &nbsp;<base:genericButton absbottom="true" src="/buttons/large/testemail.gif" name="<%= SiteConfigReceiptsForm.BUTTON_TEST_EMAIL %>" alt="Test Email"/>
                        </td>
                   </tr>
                 </table>
              </td>
           </tr>
            <logic:equal name="<%= SiteConfigReceiptsForm.FORM_NAME %>" property="<%= SiteConfigReceiptsForm.PARAM_DISPLAY_EMAIL_LIST%>" value="true">
               <tr>
                  <td colspan="2"><base:imageLine/></td>
               </tr>
               <tr>
                  <td colspan="2" class="TableHeading2"><%=MessageHelper.formatMessage("siteconfigreceipts_CurrentlyConfiguredEmail") %></td>
               </tr>
               <tr>
                  <td colspan="2">
                     <table width="100%" id="<%=SiteConfigReceiptsForm.TABLE_EMAIL_LIST %>" cellspacing="0" cellpadding="2">
                        <tr>
                            <% if(!isInternationalProduct){ %>
                                <td class="SmallColHeading"><%= MessageHelper.formatMessage("siteconfigreceipts_Product") %></td>
                            <% } %>
                            <td class="SmallColHeading"><%= MessageHelper.formatMessage("siteconfigreceipts_Name") %></td>
                            <td class="SmallColHeading"><%= MessageHelper.formatMessage("siteconfigreceipts_Email") %></td>
                            <td class="SmallColHeading">&nbsp;</td>
                        </tr>
                        <logic:iterate indexId="flipper" id="rowSelected" name="<%=SiteConfigReceiptsForm.FORM_NAME%>" property="<%=SiteConfigReceiptsForm.PARAM_EMAIL_LIST%>" type="com.follett.fsc.destiny.entity.ejb3.NotificationEmailVO">
                            <tr valign="top" <%=( ( (1 & flipper.intValue())==0)? "bgColor=\"#E8E8E8\"" : "" )%> >
                                <%=form.renderEmailEntry(rowSelected)%>
                            </tr>
                        </logic:iterate>
                     </table>
                  </td>
               </tr>
            </logic:equal>
        </logic:equal>
        
    </base:outlinedTableAndTabsWithinThere>

</base:form>
