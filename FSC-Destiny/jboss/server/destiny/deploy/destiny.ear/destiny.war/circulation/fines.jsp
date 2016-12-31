<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.PatronInfoBean" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@page import="com.follett.fsc.common.CurrencyValue"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>


<base:messageBox strutsErrors="true"/>

<SCRIPT LANGUAGE="javascript" TYPE="text/javascript">
<!--
    function submitTheForm() {
        document.<%=FineViewForm.FORM_NAME%>.<%=FineViewForm.PARAM_CHECKED_OFF_SITE_CHECKBOX%>.value = "true";
        document.<%=FineViewForm.FORM_NAME%>.submit();
    }
// -->
</SCRIPT>
<%
	FineViewForm form = (FineViewForm)request.getAttribute(FineViewForm.FORM_NAME);
	boolean owesMoney=(form.getTotalFinesAmount()) > 0;
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    String focusControl = FineViewForm.FIELD_SEARCH_STRING;
    if ( !form.isFineSidelink() ) {
        focusControl = null;
    }
    if (form.isDisplayRefundNote()){
        focusControl = FineViewForm.FIELD_REFUND_NOTE;
    }

    PatronInfoBean pib = BaseCircForm.createPatronInfoBean(store, form.getPatronID());
    request.setAttribute("patronInfoBean", pib);

    String newFineLink = "/circulation/servlet/presentfineaddform.do";
%>

<base:form action="/circulation/servlet/handlefineviewform.do" focus="<%=focusControl%>">
    <html:hidden property="fineSidelink"/>
    <html:hidden property="localFinesAmount"/>
    <html:hidden property="offsiteFinesAmount"/>
    <html:hidden property="<%= FineViewForm.PARAM_CHECKED_OFF_SITE_CHECKBOX %>" value = "false"/>
    <html:hidden property = "<%= FineViewForm.PARAM_ALLOW_DISTRICT_FINE_PAYMENT %>"/>
    <% if (form.isDisplayRefundMessage()) { %>
        <base:messageBox showRedBorder="true">
            <tr>
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td valign="baseline" class="Error">
                    <p align="center"><%=MessageHelper.formatMessage("fines_AreYouSureYouWantToClearTheFinerefund") %></p>
                    <% if(form.isPrintReceipt()) {%>
                        <p align="center"><%=MessageHelper.formatMessage("fines_NoteIfYouOnlyWantAReceiptAndKeepTheFinerefundSelectThePrintItButton") %></p>
                    <%}/** end if **/%>
                </td>
            </tr>
            <tr>
                <td align="center" colspan="2" class="ColRowBold">
                    <base:showHideTag id="confirmClearRefund"><html:submit property="<%=FineViewForm.BUTTON_CONFIRM_APPLY_REFUND%>" onclick="hideElementconfirmClearRefund()"><%= MessageHelper.formatMessage("yes") %></html:submit>&nbsp;<html:submit property="<%=FineViewForm.BUTTON_CANCEL_DELETE%>"><%= MessageHelper.formatMessage("no") %></html:submit></base:showHideTag>
                </td>
            </tr>
            </base:messageBox>       
    <% } else if (form.isDisplayRefundNote()) { %>
            <base:inputBox
                showWarningIcon="true" filterMessage="false" 
                header='<%=MessageHelper.formatMessage("fines_ExplanationForRefund") %>'
                inputBoxLength="60"
                inputBoxMaxLength="120"
                inputBoxName="<%=FineViewForm.FIELD_REFUND_NOTE%>"
            />    
    <%}%>
    
    <% if (form.isDeleteFine()) {
        Long fineID = form.getFineID();
    %>
        <input type="hidden" name="fineID" value="<%=fineID%>">
        <% if(form.isRefund(fineID)) {
        %>
            <base:messageBox showRedBorder="true">
            <tr>
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td valign="baseline" class="Error">
                    <p align="center"><%= MessageHelper.formatMessage("fines_ThisRefundWillBeDeleted") %></p>
                    <% if(form.getPayableFineCount()>0) {%>
                        <p align="center"><input type="checkbox" checked name="<%=FineViewForm.FIELD_APPLY_TO_FINES%>" value="true">
                        <% if (form.isAllowDistrictFinePayment()) { %>
                            <%= MessageHelper.formatMessage("fines_ApplyRefundToOutstandingFinesThatAre_local_and_or_offsite") %>&nbsp; 
                                <select name = "<%=FineViewForm.FIELD_REFUND_TARGET%>">
                                    <option value = "<%=FineViewForm.OPTION_REFUND_LOCAL %>"><%= MessageHelper.formatMessage("fines_Local") %></option>
                                    <option value = "<%=FineViewForm.OPTION_REFUND_OFFSITE %>"><%= MessageHelper.formatMessage("fines_LocalAndOffSite") %></option>
                                </select>
                        <% } else { %>
                            <html:hidden property = "<%=FineViewForm.FIELD_REFUND_TARGET%>" value = '<%="" + FineViewForm.OPTION_REFUND_LOCAL %>'/>
                            <%= MessageHelper.formatMessage("fines_ApplyRefundToOutstandingLocalFines") %>
                        <% } %></p>
                    <%}/** end if **/%>
                </td>
            </tr>
            <tr>
                <td align="center" colspan="2" class="ColRowBold">
                    <base:showHideTag id="confirmRefundDelete"><html:submit property="<%=FineViewForm.BUTTON_CONFIRM_DELETE_REFUND%>" onclick="hideElementconfirmRefundDelete()"><%= MessageHelper.formatMessage("fines_OK") %></html:submit>&nbsp;<html:submit property="<%=FineViewForm.BUTTON_CANCEL_DELETE%>"><%= MessageHelper.formatMessage("fines_Cancel") %></html:submit></base:showHideTag>
                </td>
            </tr>
            </base:messageBox>
        <% } else {%>
                <base:confirmBox
                showWarningIcon="true" 
                header='<%= MessageHelper.formatMessage("fines_AreYouSure") %>'
                yesName="<%=FineViewForm.BUTTON_CONFIRM_DELETE_FINE%>"
                noName="<%=FineViewForm.BUTTON_CANCEL_DELETE%>"
                />
    <% } /** end if **/
    } /** end if **/%>

    <logic:equal name="<%=FineViewForm.FORM_NAME%>" property="fineSidelink" value="true" scope="request">
        <table id="<%=FineViewForm.TABLE_FIND_SOMETHING%>" border="0" cellspacing="0" cellpadding="2">
            <tr>
                <td class="FormLabel"><%= MessageHelper.formatMessage("fines_FindPatron") %>&nbsp;</td>
                <td class="ColRow">
                    <html:text property="<%= FineViewForm.FIELD_SEARCH_STRING%>" maxlength="1000" />
                    &nbsp;
                    <base:goButton align="absBottom" />
                </td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td class="ColRow">
                    <% if (store.isDistrictCircAllowed(BibMasterSpecs.COLLECTION_TYPE_LIBRARY) || (store.isDistrictCircAllowed(BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK)) 
                          || (store.isDistrictCircAllowed(BibMasterSpecs.COLLECTION_TYPE_ASSET))) { %>
                        <html:checkbox property="<%=BaseCircForm.FIELD_SEARCH_ONLY_LOCAL_PATRONS%>"><%= MessageHelper.formatMessage("fines_OnlyMyPatrons") %></html:checkbox>
                    <% } else { %>
                        <html:hidden property="<%=BaseCircForm.FIELD_SEARCH_ONLY_LOCAL_PATRONS%>" value="true"/>
                    <% } %>
                    <base:patronLookup/>
                </td>
            </tr>
        </table>
        <br>
    </logic:equal>

<%  if (request.getAttribute("patronlist") != null) { %>
        <img src="/images/icons/general/line.gif" height="2" width="95%">
		<jsp:include page="/circulation/patronlist.jsp">
			<jsp:param name="formName" value="<%= FineViewForm.FORM_NAME %>"/>
			<jsp:param name="districtSearch" value='<%= "" + !form.isSearchLocalPatronsOnly() %>'/>
		</jsp:include>
    <br>
<%
    }
%>

<!-- Put patron receipt checkbox as hidden if we won't display it on the page -->


    <!-- begin main table -->
<%
    if (form.getPatronID() != null) {
%>
        <base:outlinedTable borderColor='#C0C0C0' id="outlinedTable" width="98%">
        <tr>
            <td>
                <base:circPatronInfo formName="<%=FineViewForm.FORM_NAME%>" infoBean="<%=form.getPib()%>" showPrintReceipt="false" collectionType="<%=form.getCollectionType()%>"/>
            </td>
        </tr>
        <tr valign="top">
            <td>
                <table id="<%=FineViewForm.TABLE_FINE_BOX_TITLE%>" width="100%" cellspacing="0" cellpadding="2">
                    <tr>
                         <!-- box header and special information -->
                        <base:sectionHeading printerFriendly="false" heading='<%=MessageHelper.formatMessage("fines_Fines") %>' tdContent="valign='top'"/>
                         
                        <td class="ColRow tdAlignRight" background="/images/icons/general/thickline.gif" valign="top">
                            <base:link id="<%=FineViewForm.ID_IMG_ADD_FINE %>" page="<%= newFineLink %>" permissions="<%=new Permission[] {Permission.CIRC_FINES_ADD_LIBRARY, Permission.CIRC_FINES_ADD_ASSET, Permission.CIRC_FINES_ADD_TEXTBOOK, Permission.CIRC_FINES_ADD_PATRON }%>"><base:image src="/buttons/large/addfine.gif" alt='<%=MessageHelper.formatMessage("addFine") %>'/></base:link>&nbsp;
                            <base:link page='<%="/circulation/servlet/presentpatronfinehistoryform.do?patronID=" + form.getPatronID() %>' id="<%=FineViewForm.ID_VIEW_HISTORY %>" permissions="<%=new Permission[] { Permission.CIRC_FINES_VIEW_LIBRARY, Permission.CIRC_FINES_VIEW_ASSET, Permission.CIRC_FINES_VIEW_TEXTBOOK, Permission.CIRC_FINES_VIEW_PATRON }%>"><base:image src="/buttons/large/viewhistory2.gif" alt='<%=MessageHelper.formatMessage("viewHistory") %>'/></base:link>
                            <% if (form.getTotalFinesAmount() != 0 || (form.getPayableRefundCount() > 0 && form.getPayableFineCount() > 0)) { %>
                            <base:link onclick="javascript:window.open('/circulation/servlet/presentprintreceiptform.do', 'printreceipt');" page='<%="/circulation/servlet/presentfineviewform.do?patronID=" + form.getPatronID() %>' id="<%=FineViewForm.ID_PRINT_RECEIPT %>" ><base:image src="/buttons/large/printit.gif" alt='<%=MessageHelper.formatMessage("fines_PrintReceiptOnly") %>'/></base:link>
                            <% } %>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td>
            <!-- Box body. All unused cells must contain a non-breaking space to keep Netscape from closing it up -->
            <!-- the left column is sixty percent in width and the right forty percent, information should be placed accordingly -->
                <table id="<%=FineViewForm.TABLE_FINE_BOX %>" cellpadding="2" cellspacing="0" border="0" width="100%">
                    <base:finesListOutput
                        finesList="<%= form.getFinesList() %>"
                        printerFriendly="false"
                        showEditDeleteButtons="true"
                        showTitles="true"
                        fineSideLink="<%= form.isFineSidelink() %>"
                        allowOffsiteFinePayment="<%=form.isAllowDistrictFinePayment() %>"/>
                    <logic:equal name="<%=FineViewForm.FORM_NAME%>" property="finesInList" value="true">
                    <base:spanIfAllowed permissions="<%= new Permission[] {Permission.CIRC_FINES_PAY_LIBRARY, Permission.CIRC_FINES_PAY_TEXTBOOK, Permission.CIRC_FINES_PAY_PATRON, Permission.CIRC_FINES_PAY_ASSET} %>" >
                        <tr>
                            <td colspan="6" class="ColRowBold">
    						<img border="0" src="/images/icons/general/line.gif" width="100%" height="2" vspace="4"></td>
                        </tr>
                        <!-- Amount total and payment text boxes -->
                        <tr>
                        <% if (form.isAllowDistrictFinePayment()) { %>
                            <td colspan = "2" class = "ColRow tdAlignRight"><html:checkbox property = "<%=FineViewForm.FIELD_INCLUDE_OFFSITE_FINES_IN_TOTALS %>" onclick="submitTheForm()" />&nbsp;<%= MessageHelper.formatMessage("fines_IncludeOffSiteFinesInTotals") %>&nbsp;&nbsp;<base:helpTag helpFileName="d_include_offsite_fines_in_total.htm"/></td>
                        <% } else { %>
                            <td colspan = "2"><html:hidden property = "<%= FineViewForm.FIELD_INCLUDE_OFFSITE_FINES_IN_TOTALS%>" value = "false"/>&nbsp;</td>
                        <% } %>     
                            <td colspan="2" class="ColRowBold tdAlignRight" nowrap><%= MessageHelper.formatMessage("fines_AmountPayable") %></td>
                            <td>&nbsp;</td>
                       </tr>
                       <tr>     
                            <td colspan = "3">&nbsp;</td>
                            <td class="ColRowBold tdAlignRight">
                            <%
                                if(form.getLocalFinesAmount()<0) {
                                    %><font color="#CC0000"><%
                                }
                           %><%=lh.formatCurrency(new CurrencyValue(form.getLocalFinesAmount(),
                               lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT)%><%
                                if(form.getLocalFinesAmount()<0) {
                                    %></font><%
                                }%>
                            </td>
                            <td class = "ColRow"><%= MessageHelper.formatMessage("fines_Local") %></td>
                        </tr>
                        <% if (form.isIncludeOffsiteTotals()) { %>
                           <tr>     
                                <td colspan = "3">&nbsp;</td>
                                <td class="ColRowBold tdAlignRight">
                                <%
                                    if(form.getOffsiteFinesAmount()<0) {
                                        %><font color="#CC0000"><%
                                    }
                               %><%=lh.formatCurrency(new CurrencyValue(form.getOffsiteFinesAmount(),
                                   lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT)%><%
                                    if(form.getOffsiteFinesAmount()<0) {
                                        %></font><%
                                    }%>
                                </td>
                                <td class = "ColRow"><%= MessageHelper.formatMessage("fines_OffSite") %></td>
                            </tr>
                            <tr>
                                <td colspan = "6"><base:imageLine width="100%" height = "1"/></td>
                            </tr>
                           <tr>     
                                <td colspan = "3">&nbsp;</td>
                                <td class="ColRowBold tdAlignRight">
                                <%
                                    if(form.getTotalFinesAmount()<0) {
                                        %><font color="#CC0000"><%
                                    }
                               %><%=lh.formatCurrency( new CurrencyValue(form.getTotalFinesAmount(),
                                   lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT)%><%
                                    if(form.getTotalFinesAmount()<0) {
                                        %></font><%
                                    }%>
                                </td>
                                <td class = "ColRow"><%= MessageHelper.formatMessage("fines_TotalAmount") %></td>
                            </tr>
                        <% } else { %>
                            <tr>
                                <td colspan = "6"><base:imageLine width="100%" height = "1"/></td>
                            </tr>
                        <% } %>
                        <% if(owesMoney) {%>
                            <tr>
                                <td colspan = "2">&nbsp;</td>
                                <td colspan = "2" class="ColRowBold tdAlignRight" nowrap><%= MessageHelper.formatMessage("fines_Pay") %>&nbsp; <html:text property="<%=FineViewForm.FIELD_PAY%>" size="10" maxlength="10"/></td>
                                <td>&nbsp;</td>
                            </tr>
                        <%} %>
                        <% if (form.getTotalFinesAmount() != 0 || (form.getPayableRefundCount() > 0 && form.getPayableFineCount() > 0)) { %>
                        <tr>
                            <td class="ColRow tdAlignRight" colspan="4" valign="top"><html:checkbox property="<%=FineViewForm.FIELD_PRINT_RECEIPT%>"><%= MessageHelper.formatMessage("fines_PrintReceipt") %></html:checkbox></td>
                            <td class="ColRowBold" align="center" valign="top">
                            <base:showHideTag id="onUpdate">
                            <%if(owesMoney) {%>
                                    <base:genericButton src="/buttons/large/update.gif" alt='<%= MessageHelper.formatMessage("update") %>' onclick="hideElementonUpdate()" name="<%=FineViewForm.BUTTON_APPLY%>"/>
                            <%} else  {%>
                                    <base:genericButton src="/buttons/large/update.gif" alt='<%= MessageHelper.formatMessage("update") %>' onclick="hideElementonUpdate()" name="<%=FineViewForm.BUTTON_APPLY_REFUND%>"/>
                            <% } %>
                            </base:showHideTag>
                            </td>
                            <td class="ColRow" valign="top">
                                &nbsp;
                            </td>
                        </tr>
                        <% } else { %>
                            <html:hidden property="<%=FineViewForm.FIELD_PRINT_RECEIPT%>"/>    
                        <% } %>
                    </base:spanIfAllowed>
                </logic:equal>
                
                <logic:equal name="<%=FineViewForm.FORM_NAME%>" property="finesInList" value="false">
                   <html:hidden property="<%=FineViewForm.FIELD_PRINT_RECEIPT%>"/>
                </logic:equal>                
                
                </table>
               <!-- end box body -->
            </td>
        </tr>
        </base:outlinedTable>
<%
    }   // end form.getPatronID() != null
    else { %>
       <html:hidden property="<%=FineViewForm.FIELD_PRINT_RECEIPT%>"/>
       <html:hidden property="<%=FineViewForm.FIELD_INCLUDE_OFFSITE_FINES_IN_TOTALS%>"/>
<% } %>

</base:form>

<% if(form.isShowReceiptsWindowFromFineAdd() || (form.isParamPrintReceipt() && !form.isCheckedOffSiteCheckbox())){
    form.setShowReceiptsWindowFromFineAdd(false);
    form.setParamPrintReceipt(false); %>
    
    <SCRIPT LANGUAGE="javascript" TYPE="text/javascript">
    <!--
        window.open('<%= PrintReceiptForm.FORM_URL %>', '<%= PrintReceiptForm.TARGET_NAME %>');
    // -->
    </SCRIPT>
    
<% } %>

