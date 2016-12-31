<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@page import="com.follett.fsc.destiny.client.common.PageCalculator"%>
<%@page import="com.follett.fsc.destiny.client.common.servlet.BaseListForm"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.PatronSpecs"%>
<%@page import="com.follett.fsc.destiny.client.circulation.servlet.BasePatronListForm"%>
<%@page import="com.follett.fsc.destiny.client.common.data.Tab"%>
<%@page import="com.follett.fsc.destiny.client.common.SitePatronHelper"%>
<%@page import="com.follett.fsc.destiny.client.backoffice.data.UpdatePatronHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.BarcodeListTag"%>
<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%>


<%@page import="com.follett.fsc.destiny.session.backoffice.data.BasePatronJobParams"%><base:messageBox strutsErrors="true"/>

<%
    UpdatePatronBatchDeleteForm form = (UpdatePatronBatchDeleteForm) request.getAttribute(UpdatePatronBatchDeleteForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);

    String focusControl = UpdatePatronBatchDeleteForm.FIELD_SEARCH_STRING;
    if ((form.isUploadFileOption())) {
        focusControl = BarcodeListTag.FIELD_SCAN_ITEM;
    } 
    if (form.isPrinterFriendly() || form.isShowConfirmation()) {
        focusControl = "";
    }
    
    Tab[] tabs = BasePatronListForm.getTabs(store);
%>
<br>

<base:form action="/backoffice/servlet/handleupdatepatronbatchdeleteform.do" enctype="multipart/form-data" focus="<%=focusControl%>">
    <logic:equal name='<%= UpdatePatronBatchDeleteForm.FORM_NAME %>' property="printerFriendly" value="false">
        <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=UpdatePatronBatchDeleteForm.BUTTON_TRAP_ENTER_KEY%>">
    </logic:equal>
    <html:hidden property="localRelativeFile" />
    <html:hidden property="localFileNameOnly" />

    <html:hidden property="<%=UpdatePatronBatchDeleteForm.PARAM_STORED_SEARCH_STRING%>"/>
    <input type="hidden" name="<%=form.FIELD_PATRON_LIST_DISPLAYED%>" value="<%=form.isPatronListDisplayed()%>" />
    <html:hidden property="action" />
    <html:hidden property="<%=UpdatePatronBatchDeleteForm.PARAM_PATRONS_LIST_OUT%>"/>
    <html:hidden property="<%=UpdatePatronBatchDeleteForm.PARAM_PATRON_ID%>"/>
    <html:hidden property="<%=UpdatePatronBatchDeleteForm.PARAM_PATRON_NAME%>"/>
    <html:hidden property="<%=UpdatePatronBatchDeleteForm.PARAM_PATRON_BARCODE%>"/>
    <html:hidden property="<%=UpdatePatronBatchDeleteForm.PARAM_PATRON_TYPE%>"/>

    <logic:equal name="<%=UpdatePatronBatchDeleteForm.FORM_NAME%>" property="<%= UpdatePatronBatchDeleteForm.PARAM_SHOW_CONFIRMATION%>" value="true">
        <html:hidden property="<%=UpdatePatronBatchDeleteForm.FIELD_DELETE_TRANSACTIONS%>"/>
        <html:hidden property="<%=IUpdatePatronForm.FIELD_DELETE_PATRONS_TYPE%>"/>
        <html:hidden property="<%=IUpdatePatronForm.FIELD_DELETE_MODE%>"/>
        <%=JSPHelper.renderHidden(BarcodeListTag.FIELD_BARCODE_LIST_HIDDEN, request.getParameter(BarcodeListTag.FIELD_BARCODE_LIST_HIDDEN))%>
        <base:messageBox showWarningIcon="true" message='<%= MessageHelper.formatMessage("updatepatronbatchdelete_ThisProcessCannotBeReversed") %>'>
        <tr align="center" width="100%">
            <td>&nbsp;</td>
            <td class="ColRowBold"><%=UpdatePatronHelper.getDeleteConfirmation(form.getDeleteMode())%></td>
        </tr>
        <tr>
            <td class="ColRowBold" width="100%" align="center" colspan="2">
                <base:yesNo />
            </td>
        </tr>
        </base:messageBox>
    </logic:equal>

    <logic:equal name="<%=UpdatePatronBatchDeleteForm.FORM_NAME%>" property="<%= UpdatePatronBatchDeleteForm.PARAM_SHOW_CONFIRMATION%>" value="false">
    <base:outlinedTableAndTabsWithinThere id="tableUpdatePatron" formName="<%= UpdatePatronBatchDeleteForm.FORM_NAME %>" tabs="<%= tabs %>" selectedTabID="<%=IUpdatePatronForm.ID_TAB_TOP_DELETE%>" selectedTab='<%=MessageHelper.formatMessage("updatepatronbatchdelete_Delete") %>' hideTabsWhenPrinterFriendly="true" borderColor="#C0C0C0" width="100%">
       <tr><td>
       <table id="<%=IUpdatePatronForm.TABLE_MAIN %>" width="100%">
        <tr>
            <td class="TableHeading" colspan="2">Delete Patron Information...</td>
        </tr>       
        <tr>
           <td class="ColRowBold tdAlignRight" width="30%"><%= MessageHelper.formatMessage("updatepatronbatchdelete_Delete") %></td>
           <td><%=UpdatePatronHelper.getDeleteModeDropDown(UpdatePatronBatchDeleteForm.FORM_NAME, form.isPrinterFriendly(), form.getDeleteMode(), form.getStore())%>
           </td>
        </tr>
        
        <logic:equal name='<%= UpdatePatronBatchDeleteForm.FORM_NAME %>' property="printerFriendly" value="false">
        <tr>
            <td class="ColRowBold tdAlignRight"  width="30%"><%= MessageHelper.formatMessage("updatepatronbatchdelete_BasedOn") %>&nbsp;</td>
            <td class="ColRow">
            <%=UpdatePatronHelper.getDeleteDropDown(UpdatePatronBatchDeleteForm.FORM_NAME, form.getDeletePatronsType())%>
            </td>
        </tr>
        </logic:equal>
        
        <logic:equal name="<%=UpdatePatronBatchDeleteForm.FORM_NAME%>" 
            property="<%= IUpdatePatronForm.FIELD_DELETE_MODE%>" 
            value="<%=String.valueOf(BasePatronJobParams.OPTION_DELETE_MODE_PATRONS) %>">
        
            <tr>
                <td class="TableHeading" colspan="2"><base:imageLine printerFriendly="<%=form.isPrinterFriendly() %>" width="98%" vspace="2" /></td>
            </tr>
            
            <logic:equal name='<%= UpdatePatronBatchDeleteForm.FORM_NAME %>' property="printerFriendly" value="true">
                <tr>
                    <td class="ColRow" colspan="2">
                    <%= MessageHelper.formatMessage("updatepatronbatchdelete_AllowPatronsToBeDeleted") %>:&nbsp;<%= form.isDeleteTransactions() ? 
                        MessageHelper.formatMessage("updatepatronbatchdelete_Yes") : 
                        MessageHelper.formatMessage("updatepatronbatchdelete_No") %>
                    </td>
                </tr>
            </logic:equal>
        </logic:equal>
        
        <logic:equal name='<%= UpdatePatronBatchDeleteForm.FORM_NAME %>' property="printerFriendly" value="false">
            <logic:equal name="<%=UpdatePatronBatchDeleteForm.FORM_NAME%>" 
                property="<%= IUpdatePatronForm.FIELD_DELETE_MODE%>" 
                value="<%=String.valueOf(BasePatronJobParams.OPTION_DELETE_MODE_PATRONS) %>">
            <tr>
                <td class="tdAlignRight" valign="top" width="30%">
                    <html:checkbox property="<%=UpdatePatronBatchDeleteForm.FIELD_DELETE_TRANSACTIONS%>"/>
                </td>
                <td valign="top" class="ColRow"><%= MessageHelper.formatMessage("updatepatronbatchdelete_AllowPatronsToBeDeletedEvenIfTheyHaveOutstanding") %></td>
            </tr>
            </logic:equal>
            
            
            <% if ( form.isUploadFileOption() ) { %>
            <tr>
                <td class="TableHeading" colspan="2"><base:imageLine printerFriendly="<%=form.isPrinterFriendly() %>" width="98%" vspace="2" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <base:barcodeList barcodeType="<%= Barcode.BARCODETYPE_PATRON %>"
                           formName="<%=UpdatePatronBatchDeleteForm.FORM_NAME%>"
                           forceListClear="<%=form.isForceClearBarcodeList()%>"/>
                </td>
            </tr>
            <% }  %>
        </logic:equal>
        
        <% if ( !form.isUploadFileOption() ) { %>
            <logic:equal name='<%= UpdatePatronBatchDeleteForm.FORM_NAME %>' property="printerFriendly" value="false">
                <tr>
                    <td colspan="2">
                       <base:imageLine printerFriendly="<%=form.isPrinterFriendly() %>" height="1" width="100%"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" width="100%" align="Center" >
                        <table border="0" cellpadding="0" cellspacing="0" width="100%" >
                            <tr>
                                <td class="ColRow"><%= MessageHelper.formatMessage("updatepatronbatchdelete_FindPatronRecordsWith") %>&nbsp;<html:text property="<%=UpdatePatronBatchDeleteForm.FIELD_SEARCH_STRING %>" size="20" maxlength="90"/>&nbsp;<%= MessageHelper.formatMessage("updatepatronbatchdelete_In") %>
                                    <base:selectPatronByType name="<%=UpdatePatronBatchDeleteForm.FIELD_SEARCH_TYPE %>" selected="<%=form.getSearchType()%>" onlyMyPatrons="true" siteID="<%=store.getSiteID()%>" returnAllEvenIfWeFindAMatchByBarcode="true"/>
                                    &nbsp;<base:genericButton src="/buttons/large/search.gif" alt='<%= MessageHelper.formatMessage("search") %>' name="<%= PatronLookupForm.BUTTON_SEARCH %>" absbottom="true" />
                                </td>
                            </tr>
                        </table>
                     </td>
                 </tr>
            </logic:equal>
             
            <%
             List patronsList = form.getPatronsList();
             if (patronsList != null && patronsList.size() > 0) {

                 int itemsInList = patronsList.size();
                 int currentPage = PageCalculator.getCurrentPage(form);
                 int itemsToSkip = PageCalculator.getFirstNumberInPage(currentPage, form.gimmeMaxRowsToDisplay(),
                     itemsInList);
                 int itemsToPrint = PageCalculator.getOnePastLastNumberInPage(currentPage,
                     form.gimmeMaxRowsToDisplay(), itemsInList);
             %>
             <logic:equal name='<%= UpdatePatronBatchDeleteForm.FORM_NAME %>' property="printerFriendly" value="false">
             <tr>
                <td colspan="2">
                    <table id="searchSummary" width="100%" cellspacing="0" cellpadding="2">
                        <tr>
                            <td class="ColRowBold">
                                <%=form.getSearchSummary()%>
                            </td>
                            <td class="tdAlignRight">
                                <base:link page="<%= form.buildPrinterFriendlyLink() %>" target="printerFriendly" id="<%=UpdatePatronBatchDeleteForm.ID_PRINTER_FRIENDLY %>"><base:image src="/buttons/small/printerfriendly.gif" alt='<%= MessageHelper.formatMessage("printable") %>'/></base:link>
                            </td>
                       </tr>
                       <tr>
                            <td class="SmallColHeading">
                                <a name="<%=BasePatronListForm.ANCHOR %>"></a>
                                <%=form.gimmeCurrentlySelectedCountMessage()%>
                            </td>
                            <td class="SmallColHeading tdAlignRight">
                               <base:pageListOutput formName="<%= UpdatePatronBatchDeleteForm.FORM_NAME %>" />
                            </td>
                            
                       </tr>
                         
                    </table>
                 </td>
             </tr>
            </logic:equal>
             <tr>
                <td colspan="2">
                <html:hidden property="page" value='<%= "" + currentPage %>' />
                
                    <table id=<%=UpdatePatronMergeDuplicatesForm.TABLE_PATRON_INFO_DETAIL%> width="100%" cellspacing="0" cellpadding="4" border="0">
                        <tr>
                            <td class="SmallColHeading"><%= MessageHelper.formatMessage("updatepatronbatchdelete_LastFirstMiddle") %></td>
                            <td class="SmallColHeading"><%= MessageHelper.formatMessage("updatepatronbatchdelete_Barcode") %></td>
                            <td class="SmallColHeading">
                                <%=PatronSpecs.getDistrictIDPrompt()%>
                            </td>
                            <base:isDistrictUser>
                                <td class="SmallColHeading"><%= MessageHelper.formatMessage("updatepatronbatchdelete_Site") %></td>
                            </base:isDistrictUser>
                            <td class="SmallColHeading"><%= MessageHelper.formatMessage("updatepatronbatchdelete_PatronType") %></td>
                            <td>&nbsp;</td>
                        </tr>
                        <logic:iterate offset='<%=""+itemsToSkip%>' length='<%=""+(itemsToPrint - itemsToSkip)%>' indexId="flipper" id="row" name="<%= UpdatePatronBatchDeleteForm.FORM_NAME %>" property="patronsList" type="com.follett.fsc.destiny.session.backoffice.data.FindSitePatronValue">
                            <tr valign="top" <%=( (!form.isPrinterFriendly() && (1 & flipper.intValue())==0)? "bgColor=\"#E8E8E8\"" : "" )%> >
                                <base:td clazz="ColRow" filtered="true"><%=form.getPatronName(row)%></base:td>
                                <base:td clazz="ColRow" filtered="true"><%=SitePatronHelper.getPatronBarcode(store, row, null)%></base:td>
                                <base:td clazz="ColRow" filtered="true"><%=row.getDistrictID()%></base:td>
                                <base:isDistrictUser>
                                    <base:td clazz="ColRow" filtered="true"><%=SitePatronHelper.getPatronSiteName(store, row, null)%></base:td>
                                 </base:isDistrictUser>
                                <base:td clazz="ColRow" filtered="true"><%=SitePatronHelper.getPatronTypeDescription(store, row, null)%></base:td>
                                <td class="SmallColHeading tdAlignRight"><%=form.getPatronLinks(row)%></td>
                            </tr>
                        </logic:iterate>
                    </table>
                </td>
            </tr>
            <logic:equal name='<%= UpdatePatronBatchDeleteForm.FORM_NAME %>' property="printerFriendly" value="false">
               <tr>
                    <td colspan="2" class="SmallColHeading tdAlignRight">
                       <base:pageListOutput formName="<%= UpdatePatronBatchDeleteForm.FORM_NAME %>" topOfPageLinks="false" />
                    </td>
                    
               </tr>
            </logic:equal>
    <%
    } else {
    %>
          <logic:equal name='<%= UpdatePatronBatchDeleteForm.FORM_NAME %>' property="printerFriendly" value="false">
             <tr>
                <td colspan="2">
                    <table id="searchSummary" width="100%" cellspacing="0" cellpadding="2">
                       <tr>
                            <td class="SmallColHeading">
                                <%=form.gimmeCurrentlySelectedCountMessage()%>
                            </td>
                            <td class="tdAlignRight">
                                <base:link page="<%= form.buildPrinterFriendlyLink() %>" target="printerFriendly" id="<%=UpdatePatronBatchDeleteForm.ID_PRINTER_FRIENDLY %>"><base:image src="/buttons/small/printerfriendly.gif" alt='<%= MessageHelper.formatMessage("printable") %>'/></base:link>
                            </td>
                       </tr>
                         
                    </table>
                 </td>
             </tr>
            </logic:equal>
    <% } %>                
             <tr>
                <td colspan="2">
                    <base:selectedPatronListOutput form="<%=form%>" />
                </td>
             </tr>
        <% }  %>
        <logic:equal name='<%= UpdatePatronBatchDeleteForm.FORM_NAME %>' property="printerFriendly" value="false">
            <tr>
            <td align="center" colspan="2" class="ColRowBold"><%=GenericForm.getLastBackupDisplayMsg(true)%>
            </td>
            </tr>
            <tr>
                <td colspan="2" align="center" class="ColRowBold">
                    <base:genericShowHideButton src="/buttons/large/deleteall.gif" name="<%=UpdatePatronBatchDeleteForm.BUTTON_DELETE_PATRONS%>" alt='<%=MessageHelper.formatMessage("delete")%>' elementID="deletePatrons"/>
                    <br>
                </td>
            </tr>
        </logic:equal>
        </table></td></tr>
    </base:outlinedTableAndTabsWithinThere>
</logic:equal>

</base:form>
