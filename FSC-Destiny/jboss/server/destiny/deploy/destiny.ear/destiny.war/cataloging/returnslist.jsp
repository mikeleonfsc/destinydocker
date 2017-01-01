<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.ReturnListVOTag"%>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-format.tld" prefix="fmt" %>
<%@ taglib uri="/WEB-INF/jstl-destiny.tld" prefix="d" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>

<%
    ReturnsListForm form = (ReturnsListForm)request.getAttribute(ReturnsListForm.FORM_NAME);
    boolean printerFriendly = form.isPrinterFriendly();
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>

<%@page import="com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.ejb.ReturnFacadeSpecs"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.ReturnsSpecs"%>
<%@page import="com.follett.fsc.common.MessageHelper"%>

<c:set var="form" value="<%=form%>" />

<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handlereturnslistform.do">
    <html:hidden property="returnID"/>
    <html:hidden property="<%= ReturnsListForm.FIELD_CONTEXT_LIMITER_CHANGED %>" value="false"/>
    <html:hidden property="<%=ReturnsListForm.FIELD_HIDDEN_UNSENT %>" styleId = "hiddenUnsentReturns"/>
    <html:hidden property="<%=ReturnsListForm.FIELD_HIDDEN_SUBMITTED %>" styleId = "hiddenSubmittedReturns"/>
    <html:hidden property="<%=ReturnsListForm.FIELD_HIDDEN_APPROVED %>" styleId = "hiddenApprovedReturns"/>
    <html:hidden property="<%=ReturnsListForm.FIELD_HIDDEN_COMPLETED %>" styleId = "hiddenCompletedReturns"/>
    <html:hidden property="<%=ReturnsListForm.FIELD_HIDDEN_DENIED %>" styleId = "hiddenDeniedReturns"/>
    <html:hidden property="<%=ReturnsListForm.FIELD_HIDDEN_INWAREHOUSE %>" styleId = "hiddenInWarehouseReturns"/>
    <html:hidden property="<%=ReturnsListForm.PARAM_OLD_LIMIT_DATE%>"/>
    <html:hidden property="<%=ReturnsListForm.PARAM_OLD_LIMIT_DISTRICT%>"/>
    <html:hidden property="<%=ReturnsListForm.PARAM_OLD_LIMIT_SITE%>"/>
    <html:hidden property="<%=ReturnsListForm.PARAM_OLD_LIMIT_VIEWXFERDATE%>"/>
    <html:hidden property="<%=ReturnsListForm.PARAM_SORT_STATUS%>"/>
    <html:hidden property="<%=ReturnsListForm.PARAM_SORT_TYPE   %>"/>
    <html:hidden property="<%=ReturnsListForm.PARAM_SORT_DESC%>"/>
<%
    if (form.isDeleteConfirmation()) {
        String message = null;
        if (!StringHelper.isEmpty(form.getCurrentRMANumber())) {
            message = "Are you sure you want to delete return" + form.getCurrentRMANumber() + "?";
        } else {
            message = "Are you sure you want to delete this return?";
        }
%>
    <html:hidden property="<%=ReturnsListForm.FIELD_DELETE_RETURN_ID %>"/>
        <base:messageBox showWarningIcon="true" filterMessage="false" message="<%=message%>">
            <tr>
                <td align="center" class="ColRow" colspan="2">
                    <base:yesNo buttonYesName="<%=ReturnsListForm.BUTTON_YES_DELETE %>"/>
                <td>
            </tr>
        </base:messageBox>
<%
    }
%>

<%
    if (form.isInWarehouseConfirmation()) {
%>
    <html:hidden property="<%=ReturnsListForm.FIELD_INWAREHOUSE_RETURN_ID %>"/>
    
        <base:messageBox showWarningIcon="true" filterMessage="false" message='<%="Verify the number of boxes received in the warehouse " + form.getCurrentRMANumber() + "." %>'>
            <html:hidden property="<%=ReturnsListForm.FIELD_CURRENT_RMA_NUMBER %>"/>
            <tr>
                <td></td>
                <td align="center">
                    <table id="<%=ReturnsListForm.TABLE_BOXES_RECEIVED %>">
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
                                    <%=form.getNumberOfBoxesExpected() %>&nbsp;
                            </td>
                            <td align="center" class="ColRow" colspan="1">
                                &nbsp;<input type="text" maxlength="3" size="5" align="absbottom" name="<%=ReturnsListForm.FIELD_NUMBER_OF_BOXES_RECEIVED %>" value="<%=form.getNumberOfBoxesExpected()%>"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="center" class="ColRow" colspan="2">
                                <base:okCancel buttonOkName="<%=ReturnsListForm.BUTTON_YES_INWAREHOUSE %>"/>
                            </td>
                        </tr>
                    
                    </table>
                </td>
            </tr>
        </base:messageBox>
<%  
    }
%>

<logic:equal name="<%=ReturnsListForm.FORM_NAME%>" property="printerFriendly" value="false"> 
    <table width="95%">
        <tr>
            <td class="tdAlignRight">
                <base:link target="printerFriendly" page="<%= form.getPrinterFriendlyLink() %>" onclick="updateURL(this)" id="<%=GenericForm.ID_PRINTER_FRIENDLY %>">
                    <base:image align="absbottom" src="/buttons/small/printerfriendly.gif" alt='<%=MessageHelper.formatMessage("printable") %>'/>
                </base:link>
            </td>
        </tr>
    </table>
    <P>&nbsp;
</logic:equal>


<base:outlinedTableAndTabsWithinThere hideBorderAndTabs="<%=printerFriendly%>" id="<%=ReturnsListForm.TABLE_MAIN%>" selectedTab="<%=ReturnsListForm.ID_TAB%>" tabs="<%=form.getTabs()%>" width="100%">
   <tr>
        <td>
        <table width="100%"><tr>
            <td class="TableHeading">
            Textbook Copy Returns
            <%if(!printerFriendly) { %>
                <span class="Instruction">[ <a href="#customize">Customize View</a> ]</span></td>
            <% } else {%>
                &nbsp;
            <% } %>
            </td>
            <td class="tdAlignRight">
        <%
            if (!printerFriendly) {
                if (!form.isStateContext()) {
        %>
                <a href = "/cataloging/servlet/presentreturnrequesteditform.do" id="<%=ReturnsListForm.ID_BUTTON_NEW_RETURN %>">
                    <base:image align="absbottom" src="/buttons/large/newreturn.gif" alt="<%=ReturnsListForm.ALT_NEW_RETURN%>"/>
                </a>
        <%
                } else {
        %>
                <base:link href='<%="/cataloging/servlet/presentreceivetextbooksviabarcodelistform.do?" + ReceiveTextbooksViaBarcodeListForm.PARAM_FROM_RETURNS + "=true"%>' id="<%=ReturnsListForm.ID_BUTTON_RECEIVE_TEXTBOOKS_BY_BARCODE_LIST %>">
                    <base:image src="/buttons/large/receive.gif" alt="<%=ReturnsListForm.ALT_RECEIVE_TEXTBOOKS_BY_BARCODE_LIST %>"/>
                </base:link>
        <%      }
            } else { %>
        &nbsp;
        <%
            }
        %>
        </td>
        </tr></table>
        </td>
   </tr>
   
   <%if (form.isAnythingToDisplay()){ %>
   <tr>
    <td colspan="2">
        <table width="100%">
            <tr><td width="100%">
               <base:returnListVOList tableName="<%= ReturnsListForm.TABLE_UNSENT_RETURNS %>" listName="Unsent Returns" sectionSortDateURL="<%=form.gimmeSortDateURL(ReturnsSpecs.STATUS_UNSENT) %>" sectionSortSiteURL="<%=form.gimmeSortSiteURL(ReturnsSpecs.STATUS_UNSENT) %>"
                        showInWarehouseButton="false" showViewButton="<%=form.isStateContext() %>" showDeleteButton="<%=!form.isStateContext() %>" showEditButton="<%=!form.isStateContext() %>"
                        showCarrier="false" showReasonForReturn="true" showRma="false" showSiteName="<%=form.isStateContext() %>" showCopyInformation="true" 
                        formName="<%=ReturnsListForm.FORM_NAME %>"
                        list="<%=form.getReturnItems().getUnsentList() %>"
                        showDateAsc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_DATE, ReturnsSpecs.STATUS_UNSENT, false) %>"         
                        showDateDesc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_DATE, ReturnsSpecs.STATUS_UNSENT, true) %>"         
                        showSiteAsc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_SITE, ReturnsSpecs.STATUS_UNSENT, false) %>"         
                        showSiteDesc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_SITE, ReturnsSpecs.STATUS_UNSENT, true) %>"
                        showStatusDateAsc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_STATUS_DATE, ReturnsSpecs.STATUS_UNSENT, false) %>"
                        showStatusDateDesc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_STATUS_DATE, ReturnsSpecs.STATUS_UNSENT, true) %>"
                        status= "<%=ReturnsSpecs.STATUS_UNSENT%>"
                        sectionSortStatusDateURL="<%=form.gimmeSortStatusDateURL(ReturnsSpecs.STATUS_UNSENT) %>"
                        printable="<%=printerFriendly %>"
                        showCopiesReceived="false"         
                        showRedIfZeroCopies="false"
                        />
                        
               <base:returnListVOList tableName="<%= ReturnsListForm.TABLE_SUBMITTED_RETURNS %>" listName="Submitted Returns" sectionSortDateURL="<%=form.gimmeSortDateURL(ReturnsSpecs.STATUS_SUBMITTED) %>" sectionSortSiteURL="<%=form.gimmeSortSiteURL(ReturnsSpecs.STATUS_SUBMITTED) %>"
                        showInWarehouseButton="false" showViewButton="false" showDeleteButton="<%=!form.isStateContext() %>" showEditButton="true"
                        showCarrier="false" showReasonForReturn="true" showRma="false" showSiteName="<%=form.isStateContext() %>" showCopyInformation="true" 
                        formName="<%=ReturnsListForm.FORM_NAME %>" 
                        list="<%=form.getReturnItems().getSubmittedList() %>"
                        showDateAsc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_DATE, ReturnsSpecs.STATUS_SUBMITTED, false) %>"         
                        showDateDesc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_DATE, ReturnsSpecs.STATUS_SUBMITTED, true) %>"         
                        showSiteAsc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_SITE, ReturnsSpecs.STATUS_SUBMITTED, false) %>"         
                        showSiteDesc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_SITE, ReturnsSpecs.STATUS_SUBMITTED, true) %>"   
                        showStatusDateAsc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_STATUS_DATE, ReturnsSpecs.STATUS_SUBMITTED, false) %>"
                        showStatusDateDesc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_STATUS_DATE, ReturnsSpecs.STATUS_SUBMITTED, true) %>"      
                        printable="<%=printerFriendly %>"         
                        showCopiesReceived="false"         
                        showRedIfZeroCopies="false"
                        status= "<%=ReturnsSpecs.STATUS_SUBMITTED%>"
                        sectionSortStatusDateURL="<%=form.gimmeSortStatusDateURL(ReturnsSpecs.STATUS_SUBMITTED) %>"
                        />
                        
               <base:returnListVOList tableName="<%= ReturnsListForm.TABLE_APPROVED_RETURNS %>" listName="Approved Returns" sectionSortDateURL="<%=form.gimmeSortDateURL(ReturnsSpecs.STATUS_APPROVED) %>" sectionSortSiteURL="<%=form.gimmeSortSiteURL(ReturnsSpecs.STATUS_APPROVED) %>"
                        showInWarehouseButton="<%=form.isStateContext() %>" showViewButton="true" showDeleteButton="false" showEditButton="false"
                        showCarrier="true" showReasonForReturn="false" showRma="true" showSiteName="<%=form.isStateContext() %>" showCopyInformation="true"
                        formName="<%=ReturnsListForm.FORM_NAME %>" 
                        list="<%=form.getReturnItems().getApprovedList() %>"
                        showDateAsc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_DATE, ReturnsSpecs.STATUS_APPROVED, false) %>"         
                        showDateDesc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_DATE, ReturnsSpecs.STATUS_APPROVED, true) %>"         
                        showSiteAsc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_SITE, ReturnsSpecs.STATUS_APPROVED, false) %>"         
                        showSiteDesc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_SITE, ReturnsSpecs.STATUS_APPROVED, true) %>"
                        showStatusDateAsc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_STATUS_DATE, ReturnsSpecs.STATUS_APPROVED, false) %>"
                        showStatusDateDesc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_STATUS_DATE, ReturnsSpecs.STATUS_APPROVED, true) %>"         
                        printable="<%=printerFriendly %>"
                        showCopiesReceived="false"         
                        showRedIfZeroCopies="<%=!form.getStore().isStateContext() %>"
                        status= "<%=ReturnsSpecs.STATUS_APPROVED%>"
                        sectionSortStatusDateURL="<%=form.gimmeSortStatusDateURL(ReturnsSpecs.STATUS_APPROVED) %>"
                        />
            
               <base:isNotStateContext>
               <base:returnListVOList tableName="<%= ReturnsListForm.TABLE_DENIED_RETURNS %>" listName="Denied Returns" sectionSortDateURL="<%=form.gimmeSortDateURL(ReturnsSpecs.STATUS_DENIED) %>" sectionSortSiteURL="<%=form.gimmeSortSiteURL(ReturnsSpecs.STATUS_DENIED) %>"
                        showInWarehouseButton="false" showViewButton="true" showDeleteButton="true" showEditButton="false"
                        showCarrier="false" showReasonForReturn="false" showRma="false" showSiteName="<%=form.isStateContext() %>" showCopyInformation="false"
                        formName="<%=ReturnsListForm.FORM_NAME %>" 
                        list="<%=form.getReturnItems().getDeniedList() %>"
                        showDateAsc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_DATE, ReturnsSpecs.STATUS_DENIED, false) %>"         
                        showDateDesc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_DATE, ReturnsSpecs.STATUS_DENIED, true) %>"         
                        showSiteAsc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_SITE, ReturnsSpecs.STATUS_DENIED, false) %>"         
                        showSiteDesc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_SITE, ReturnsSpecs.STATUS_DENIED, true) %>"   
                        showStatusDateAsc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_STATUS_DATE, ReturnsSpecs.STATUS_DENIED, false) %>"
                        showStatusDateDesc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_STATUS_DATE, ReturnsSpecs.STATUS_DENIED, true) %>"         
                        printable="<%=printerFriendly %>"         
                        showCopiesReceived="false"         
                        showRedIfZeroCopies="false"
                        status= "<%=ReturnsSpecs.STATUS_DENIED%>"
                        sectionSortStatusDateURL="<%=form.gimmeSortStatusDateURL(ReturnsSpecs.STATUS_DENIED) %>"
                        />
               </base:isNotStateContext>

               <base:returnListVOList tableName="<%= ReturnsListForm.TABLE_IN_WAREHOUSE_RETURNS %>" listName="In Warehouse Returns" sectionSortDateURL="<%=form.gimmeSortDateURL(ReturnsSpecs.STATUS_INWAREHOUSE) %>" sectionSortSiteURL="<%=form.gimmeSortSiteURL(ReturnsSpecs.STATUS_INWAREHOUSE) %>"
                        showInWarehouseButton="false" showViewButton="true" showDeleteButton="false" showEditButton="false"
                        showCarrier="true" showReasonForReturn="false" showRma="true" showSiteName="<%=form.isStateContext() %>" showCopyInformation="true"
                        formName="<%=ReturnsListForm.FORM_NAME %>" 
                        list="<%=form.getReturnItems().getInWarehouseList() %>"
                        showDateAsc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_DATE, ReturnsSpecs.STATUS_INWAREHOUSE, false) %>"         
                        showDateDesc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_DATE, ReturnsSpecs.STATUS_INWAREHOUSE, true) %>"         
                        showSiteAsc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_SITE, ReturnsSpecs.STATUS_INWAREHOUSE, false) %>"         
                        showSiteDesc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_SITE, ReturnsSpecs.STATUS_INWAREHOUSE, true) %>" 
                        showStatusDateAsc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_STATUS_DATE, ReturnsSpecs.STATUS_INWAREHOUSE, false) %>"
                        showStatusDateDesc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_STATUS_DATE, ReturnsSpecs.STATUS_INWAREHOUSE, true) %>"           
                        printable="<%=printerFriendly %>"         
                        showCopiesReceived="true"         
                        showRedIfZeroCopies="false"
                        showRunRMAReportButton="<%=form.isStateContext() %>"
                        status= "<%=ReturnsSpecs.STATUS_INWAREHOUSE%>"
                        sectionSortStatusDateURL="<%=form.gimmeSortStatusDateURL(ReturnsSpecs.STATUS_INWAREHOUSE) %>"
                        />

                <base:isNotStateContext>
                    <base:returnListVOList tableName="<%= ReturnsListForm.TABLE_COMPLETED_RETURNS %>" listName="Completed Returns" sectionSortDateURL="<%=form.gimmeSortDateURL(ReturnsSpecs.STATUS_COMPLETED) %>" sectionSortSiteURL="<%=form.gimmeSortSiteURL(ReturnsSpecs.STATUS_COMPLETED) %>"
                            showInWarehouseButton="false" showViewButton="true" showDeleteButton="true" showEditButton="false"
                            showCarrier="true" showReasonForReturn="false" showRma="true" showSiteName="<%=form.isStateContext() %>" showCopyInformation="true"
                            formName="<%=ReturnsListForm.FORM_NAME %>" 
                            list="<%=form.getReturnItems().getCompletedList() %>"
                            showDateAsc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_DATE, ReturnsSpecs.STATUS_COMPLETED, false) %>"         
                            showDateDesc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_DATE, ReturnsSpecs.STATUS_COMPLETED, true) %>"         
                            showSiteAsc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_SITE, ReturnsSpecs.STATUS_COMPLETED, false) %>"         
                            showSiteDesc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_SITE, ReturnsSpecs.STATUS_COMPLETED, true) %>" 
                            showStatusDateAsc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_STATUS_DATE, ReturnsSpecs.STATUS_COMPLETED, false) %>"
                            showStatusDateDesc="<%=form.showArrow(ReturnFacadeSpecs.SORT_BY_STATUS_DATE, ReturnsSpecs.STATUS_COMPLETED, true) %>"           
                            printable="<%=printerFriendly %>"         
                            showCopiesReceived="true"         
                            showRedIfZeroCopies="false"
                            status= "<%=ReturnsSpecs.STATUS_COMPLETED%>"
                            sectionSortStatusDateURL="<%=form.gimmeSortStatusDateURL(ReturnsSpecs.STATUS_COMPLETED) %>"
                            />
                </base:isNotStateContext>
           </td></tr>
           </table>
           </td>
           </tr>
  
    <logic:equal name="<%=ReturnsListForm.FORM_NAME%>" property="printerFriendly" value="false"> 
        <tr>
            <td colspan="2">
                <base:imageLine/>
            </td>
        </tr>     
        <tr align="center">
            <td  colspan="2">
                <table width = "90%">
                    <tr>
                        <td>
                            <base:helpIcons buttonsToOutput="<%= form.getHelpIcons() %>"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </logic:equal>
    <%} else { %>
        <tr>
            <td class="ColRowBold" colspan = "2" align="center">
            There are no returns to report.
            </td>
        </tr>
        
    <%} %>
  <tr>
       <td colspan="2">
         <base:imageLine/>
      </td>
    </tr>
    
    
    
    <tr>
        <td class = "ColRowBold">
            <%if(!printerFriendly) { %>
                <a name = "customize" style = "color:black">Customize View</a>&nbsp;                    
                <br/>
                <span class = "ColRow" style = "font-weight: normal">Use the following options to create a customized list.</span>
            <% } %>
            
        </td>
    </tr>   
    <tr>
        <td>
            <% if(printerFriendly) { %>
                <table align="center" id="<%= ReturnsListForm.TABLE_CUSTOMIZE_VIEW%>">
            <% } else { %>
                <table id="<%= ReturnsListForm.TABLE_CUSTOMIZE_VIEW%>">
            <% } %>
            <tr>
                    <td class = "ColRowBold" width = '25%' nowrap><a name = "selectSite"></a>
                            View Returns created</td>
                    <td class = "ColRow" >
                    <% if(!printerFriendly) { %>
                            <html:select property = "<%= ReturnsListForm.FIELD_DATE_LIMITER %>">
                                <html:option value = '<%= "" + ReturnFacadeSpecs.PARAM_AFTER_DATE %>'><%= ReturnsListForm.OPTION_AFTER_DATE %></html:option>
                                <html:option value = '<%= "" + ReturnFacadeSpecs.PARAM_ON_DATE %>'><%= ReturnsListForm.OPTION_ON_DATE %></html:option>
                                <html:option value = '<%= "" + ReturnFacadeSpecs.PARAM_BEFORE_DATE %>'><%= ReturnsListForm.OPTION_BEFORE_DATE %></html:option>
                            </html:select>&nbsp;
                            <base:date 
                                buttonName = "<%=ReturnsListForm.BUTTON_CHANGE_DATE%>"
                                fieldName = "<%=ReturnsListForm.FIELD_LIMIT_DATE%>"
                                dateValue = "<%=form.getLimitDate()%>"
                                altText = "Change Limiter Date"
                            />
                     <% } else { %>
                        <%=form.getCreatedAsString() %>
                     <% } %>
                  </td> 
                </tr>
                <base:isStateContext>
                <tr>
                    <td class = "ColRowBold" nowrap>Limit to Returns from</td>
                    <td class = "ColRow">
                            <base:selectDistrict 
                                includeStateTextbookOffice="false"
                                includeStatewide="false" 
                                selectedDistrictContext="<%=form.getLimitDistrict()%>"
                                mustContainTextbookSites="true"  
                                useSelectAllDistricts="true"
                                useSelectADistrict="false"
                                useUnlimitedText="true" 
                                onChangeAction="submitDropDownDistrict()"
                                printerFriendly="<%=printerFriendly %>" 
                                name="<%= ReturnsListForm.FIELD_LIMIT_DISTRICT %>" /> 
                    </td> 
                </tr>
                <% if( (!StringHelper.isEmptyOrWhitespace(form.getLimitDistrict())
                    && !SelectDistrictTag.VALUE_ALL_DISTRICTS.equals(form.getLimitDistrict()))) { %>
                <tr>
                    <td class="ColRowBold tdAlignRight">&nbsp;</td>
                    <td class="ColRow">
                            <base:selectSite 
                               useSelectASite="false"
                               name="<%= TransferTrackForm.FIELD_LIMIT_SITE %>" 
                               selectedSiteID="<%= form.getLimitSite() %>" 
                               mode="<%= form.getSessionStore().isStateContext() ? SelectSiteTag.MODE_GROUP_BY_SITE_TYPE_TEXTBOOK_ONLY : SelectSiteTag.MODE_DEFAULT %>"
                               includeLibrarySites="false"
                               includeTextbookSites="true"
                               includeMediaSites="false"
                               contextName="<%=form.getLimitDistrict()%>"
                               includeAssetSites="false"
                               includeAllSites="true"
                               includeFromDistrict = "false"
                               printerFriendly="<%=printerFriendly %>"
                        />
                    </td> 
                </tr>
                <% } %>
                
                </base:isStateContext>
                    <% if(!printerFriendly) { %>
                        <tr>
                            <td colspan = "3">
                            <table width="100%">
                                <tr>
                                    <td class="ColRowBold">
                                        <span style = "font-size:1em">Display:</span>
                                    </td>
                                    <td nowrap class="ColRow">
                                        <html:checkbox property="<%= ReturnsListForm.FIELD_DISPLAY_UNSENT %>" styleId="di1"/> <label for="di1">Unsent Returns</label>
                                    </td>
                                    <td nowrap class="ColRow">
                                        <html:checkbox property="<%= ReturnsListForm.FIELD_DISPLAY_SUBMITTED %>" styleId="di2"/> <label for="di2">Submitted Returns</label>
                                    </td>
                                    <td nowrap class="ColRow">
                                        <base:isNotStateContext>
                                            <html:checkbox property="<%= ReturnsListForm.FIELD_DISPLAY_DENIED %>" styleId="di4"/> <label for="di4">Denied Returns</label>
                                        </base:isNotStateContext>
                                        &nbsp;
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        &nbsp;
                                    </td>
                                    <td nowrap class="ColRow">
                                        <html:checkbox property="<%= ReturnsListForm.FIELD_DISPLAY_APPROVED %>" styleId="di3"/> <label for="di3">Approved Returns</label>
                                    </td>
                                    <td nowrap class="ColRow">
                                        <html:checkbox property="<%= ReturnsListForm.FIELD_DISPLAY_INWAREHOUSE %>" styleId="di5"/> <label for="di5">In Warehouse Returns</label>
                                    </td>
                                    <td nowrap class="ColRow">
                                        <base:isNotStateContext>
                                            <html:checkbox property="<%= ReturnsListForm.FIELD_DISPLAY_COMPLETED %>" styleId="di6"/> <label for="di6">Completed Returns</label>
                                        </base:isNotStateContext>
                                        &nbsp;
                                    </td>
                                 </tr>
                               </table>
                            </td>
                        </tr>
                    <% } else { %>
                            <html:hidden property="<%= ReturnsListForm.FIELD_DISPLAY_UNSENT %>" />
                            <html:hidden property="<%= ReturnsListForm.FIELD_DISPLAY_SUBMITTED %>" />
                            <html:hidden property="<%= ReturnsListForm.FIELD_DISPLAY_APPROVED %>" />
                            <html:hidden property="<%= ReturnsListForm.FIELD_DISPLAY_DENIED %>" />
                            <html:hidden property="<%= ReturnsListForm.FIELD_DISPLAY_INWAREHOUSE %>" />
                            <html:hidden property="<%= ReturnsListForm.FIELD_DISPLAY_COMPLETED %>" />
                    <% } %>       
                    
                <% if(!printerFriendly) { %>
                    <tr>
                        <td colspan = "3" align = "center"><input type = "image" name = "<%= TransferTrackForm.BUTTON_UPDATE_VIEW %>" src = '<%=lh.getLocalizedImagePath("/buttons/large/update.gif")%>' border = "0" alt = "Update" title = "Update" id="<%=ReturnsListForm.ID_BUTTON_UPDATE %>"/></td>
                    </tr>
                <% } %>        
            </table>
        </td>
    </tr>
</base:outlinedTableAndTabsWithinThere>

    <%= SectionHeadingTag.generateShowMoreLessJavascript() %>
    <script language = 'JavaScript'>
    <!--
        function submitDropDownDistrict() {
            document.<%=ReturnsListForm.FORM_NAME%>.<%=ReturnsListForm.FIELD_CONTEXT_LIMITER_CHANGED%>.value = 'true';
            document.<%=ReturnsListForm.FORM_NAME%>.action += "#selectSite";
            document.<%=ReturnsListForm.FORM_NAME%>.submit();
        }
    
       var img = document.getElementById("imageUnsentReturns");
       if (<%= form.isHiddenUnsent() %> && img) {
           showMoreLess(img, "UnsentReturns");
       }
       var img = document.getElementById("imageSubmittedReturns");
       if (<%= form.isHiddenSubmitted()%> && img  ) {
           showMoreLess(img, "SubmittedReturns");
       }
       var img = document.getElementById("imageApprovedReturns");
       if (<%= form.isHiddenApproved()%> && img  ) {
           showMoreLess(img, "ApprovedReturns");
       }
       var img = document.getElementById("imageDeniedReturns");
       if (<%= form.isHiddenDenied()%> && img  ) {
           showMoreLess(img, "DeniedReturns");
       }
       var img = document.getElementById("imageReceivedReturns");
       if (<%= form.isHiddenInWarehouse()%> && img  ) {
           showMoreLess(img, "ReceivedReturns");
       }
       var img = document.getElementById("imageCompletedReturns");
       if (<%= form.isHiddenInWarehouse()%> && img  ) {
           showMoreLess(img, "CompletedReturns");
       }

       function updateURL(t, h) {            
           t.href += "&<%=ReturnsListForm.FIELD_HIDDEN_UNSENT %>=" + document.<%= ReturnsListForm.FORM_NAME %>.hiddenUnsent.value;
           t.href += "&<%=ReturnsListForm.FIELD_HIDDEN_SUBMITTED %>=" + document.<%= ReturnsListForm.FORM_NAME %>.hiddenSubmitted.value;
           t.href += "&<%=ReturnsListForm.FIELD_HIDDEN_APPROVED %>=" + document.<%= ReturnsListForm.FORM_NAME %>.hiddenApproved.value;
           t.href += "&<%=ReturnsListForm.FIELD_HIDDEN_DENIED %>=" + document.<%= ReturnsListForm.FORM_NAME %>.hiddenDenied.value;
           t.href += "&<%=ReturnsListForm.FIELD_HIDDEN_INWAREHOUSE %>=" + document.<%= ReturnsListForm.FORM_NAME %>.hiddenInWarehouse.value;
           t.href += "&<%=ReturnsListForm.FIELD_HIDDEN_COMPLETED %>=" + document.<%= ReturnsListForm.FORM_NAME %>.hiddenCompleted.value;
           if (h) {
               t.href += "#" + h;
           }
       }
   // -->
    </script>
</base:form>
