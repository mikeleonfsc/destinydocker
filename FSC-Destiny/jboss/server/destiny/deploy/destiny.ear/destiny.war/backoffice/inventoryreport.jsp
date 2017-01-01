
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.common.LocaleHelper" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.InventoryItem" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.ejb.InventoryFacadeSpecs" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.BaseSearchResultsForm" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.util.URLHelper" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.client.common.PageCalculator" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.BaseListForm"%>
<%@ page import="com.follett.fsc.destiny.util.BarcodeHelper"%>


<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>


<br>
<base:messageBox strutsErrors="true"/>

<bean:define id="optionList" name="<%= InventoryReportForm.FORM_NAME %>" property="sortOptionsList" />
<bean:define id="form" name="<%= InventoryReportForm.FORM_NAME %>" type="com.follett.fsc.destiny.client.backoffice.servlet.InventoryReportForm"/>
<%
    SessionStoreProxy store = form.getSessionStore();
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    List reportList = form.getReportList();
    int itemsInList = reportList.size();
    int itemsToSkip = 0;
    int itemsToPrint = itemsInList;
%>
<base:form action="/backoffice/servlet/handleinventoryreportform.do" styleId="keywordList">

<html:hidden property="descend"/>
<html:hidden property="lastSortOrder"/>
<html:hidden property="<%=InventoryReportForm.PARAM_COLLECTION_TYPE%>"/>
<html:hidden property="<%=InventoryReportForm.FIELD_ASSET_INVENTORY_LIST_ID%>"/>
<html:hidden property="<%=InventoryReportForm.PARAM_WITHIN_PARTIAL_INVENTORY%>"/>
<html:hidden property="<%=InventoryReportForm.PARAM_REPORT_TYPE%>"/>

<table id="TableSoWholePageDislpays" width="100%">
<tr>
<td  width="100%">

<logic:equal name="<%= InventoryReportForm.FORM_NAME %>" property="showResetLostMessage" value="true">
    <base:messageBox showRedBorder="true">
        <tr valign="top">
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td class="ColRowBold">
                <bean:write name="<%= InventoryReportForm.FORM_NAME %>" property="resetLostMessage"/>
            </td>
        </tr>
        <tr>
            <% if (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_ASSET) { %>
            <td align="center" class="ColRow" colspan="2"><%= MessageHelper.formatMessage("inventoryreport_AreYouSureYouWantToResetTheseLostItems") %></td>
            <% } else { %>
            <td align="center" class="ColRow" colspan="2"><%= MessageHelper.formatMessage("inventoryreport_AreYouSureYouWantToResetTheseLostCopies") %></td>
            <% } %>
        </tr>
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:yesNo 
                    buttonYesName="<%=InventoryReportForm.BUTTON_CONFIRM_YES%>"
                    buttonNoName="<%=InventoryReportForm.BUTTON_CONFIRM_NO%>"
                />
            </td>
        </tr>
    </base:messageBox>
</logic:equal>

<logic:equal name="<%= InventoryReportForm.FORM_NAME %>" property="showDeleteLostMessage" value="true">
    <base:messageBox showRedBorder="true">
        <tr valign="top">
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td class="ColRowBold">
                <bean:write name="<%= InventoryReportForm.FORM_NAME %>" property="deleteLostMessage"/>
            </td>
        </tr>
        <tr>
            <td align="center" class="ColRow" colspan="2"><%= MessageHelper.formatMessage("inventoryreport_ThisProcessCannotBeReversedAreYouSureYouWantToProc") %></td>
        </tr>
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:yesNo 
                    buttonYesName="<%=InventoryReportForm.BUTTON_CONFIRM_DELETE_YES%>"
                    buttonNoName="<%=InventoryReportForm.BUTTON_CONFIRM_DELETE_NO%>"
                />
            </td>
        </tr>
    </base:messageBox>
</logic:equal>

<c:if test="<%=form.getComponentList() != null && ! form.getComponentList().isEmpty() %>">
    <br>
    <base:messageBox showRedBorder="true">
    <tr>
        <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
        <td valign="baseline" class="Error">
            <html:hidden property="<%=InventoryReportForm.FIELD_COMPONENT_COPY_ID %>" />
            <html:hidden property="<%=InventoryReportForm.FIELD_PREVIOUS_BARCODE %>" />
            <bean:write name="<%= InventoryReportForm.FORM_NAME %>" property="<%=InventoryReportForm.FIELD_COMPONENT_INFO_HEADER %>"/> 
            <base:textbookComponentKit componentList="<%=form.getComponentList() %>"/>
        </td>
    </tr>
    </base:messageBox>
    
    <br>
</c:if>
 
    <table id="outlinedTable" width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#C0C0C0">
        <tr>
            <td bgcolor="#FFFFFF" valign="top" width="100%">
                       <table id= "<%=InventoryReportForm.TABLE_SORT_AND_INFO_TABLE %>" width="100%" cellpadding="" cellspacing="5">
                            <tr>
                                <td class="SmallColHeading" valign="bottom">
                                    &nbsp;
                                </td>
                                <logic:equal name="backoffice_servlet_InventoryReportForm" property="printerFriendly" value="false">
                                    <td>
                                       &nbsp; 
                                    </td>
                                    <td class="tdAlignRight">
                                        <% if ( form.getRecordCount() > 0 ) { %>
                                            <base:link page="<%= form.getPrinterFriendlyLink() %>" target="printerFriendly" id="<%=InventoryReportForm.ID_PRINTER_FRIENDLY %>"><base:image align="absbottom" src="/buttons/small/printerfriendly.gif" alt='<%= MessageHelper.formatMessage("printable") %>'/></base:link>
                                        <% } else { %>
                                            &nbsp;
                                        <% } %>
                
                                    </td>
                                </logic:equal>
                            </tr>
                            <!-- row of sort by and go button -->
                            <%if (reportList != null && reportList.size()>0) {
                                        itemsInList = reportList.size();
                                        int currentPage = PageCalculator.getCurrentPage(form);
                                        itemsToSkip = PageCalculator.getFirstNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
                                        itemsToPrint = PageCalculator.getOnePastLastNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
                                    
                            %>
                            <tr> 
                                 <td width="35%">
                                    <%-- print "Copies 1 - 25 out of 52" --%>
                                    <base:searchSummary searchType="<%=form.gimmeInventoryPromptDescription() %>"
                                    startOfSet = '<%=String.valueOf(itemsToSkip+1)%>'
                                    endOfSet   = '<%=String.valueOf(itemsToPrint)%>'
                                    totalInSet = '<%=String.valueOf(itemsInList)%>'
                                    />
                                </td>
                                <td class="SmallColHeading">
                                    <logic:equal name="backoffice_servlet_InventoryReportForm" property="printerFriendly" value="false">
                                          <%= MessageHelper.formatMessage("inventoryreport_Sortby") %>
                                        <html:select property="<%=InventoryReportForm.PARAM_COMBO_SORT %>">
                                            <html:options collection="optionList" property="longID" labelProperty="stringDesc"/>
                                        </html:select>
                                          <base:genericButton src="/buttons/small/smallgo.gif" absbottom="true" alt='<%= MessageHelper.formatMessage("go") %>' name="<%= BaseSearchResultsForm.BUTTON_CHANGE_SORT %>" />
                                    </logic:equal>
                                </td>
                                
                                <td class="SmallColHeading tdAlignRight">
                                <logic:equal name="backoffice_servlet_InventoryReportForm" property="printerFriendly" value="false">
                                    <base:pageListOutput formName="<%= form.FORM_NAME %>" />
                                </logic:equal>
                                </td>
                            </tr>                                                                    
                                    
                            <%}%>
                            
                            <!-- closing row of sort by and go button -->
                            <!-- opening main table of inventory -->
                            <tr>
                                <td colspan="3">&nbsp;
                                    <table border="0" cellspacing="0" cellpadding="3" id="<%=InventoryReportForm.TABLE_INVENTORY_REPORT %>" width="100%">
                                        <% if (InventoryReportForm.REPORT_TYPE_LOST_ITEMS.equals(form.getReportType())) { %>
                                        <tr>
                                            <td colspan = "8">
                                                <table border="0" cellspacing="0" cellpadding="0" id="<%= InventoryReportForm.TABLE_INVENTORY_HEADER %>" width="100%">
                                                    
                                                    
                                                    <logic:equal name="backoffice_servlet_InventoryReportForm" property="printerFriendly" value="false">
                                                        <tr>
                                                            <td colspan="3" class="Instruction"><%=form.getInstructionalText()%><br><br></td>
                                                        </tr>
                                                        <tr>
                                                            <td colspan="3" width="100%"><base:imageLine height="2" width="100%"/></td>
                                                        </tr>
                                                    </logic:equal>
                                                </table>
                                            </td>
                                        </tr>
                                        <% } %>
                                        <tr>
                                            <% if (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK) { %>
                                                <% if (InventoryReportForm.REPORT_TYPE_LOST_ITEMS.equals(form.getReportType())) { %>
                                                    <td class="SmallColHeading" valign="bottom"><%= MessageHelper.formatMessage("inventoryreport_BarcodeHeading") %></td>
                                                    <td class="SmallColHeading" valign="bottom"><%= MessageHelper.formatMessage("inventoryreport_LocationHeading") %></td>
                                                    <td class="SmallColHeading" valign="bottom"><%= MessageHelper.formatMessage("inventoryreport_AuthorHeading") %></td>
                                                    <td class="SmallColHeading" valign="bottom"><%= MessageHelper.formatMessage("inventoryreport_TitleHeading") %></td>
                                                    <td class="SmallColHeading" valign="bottom">&nbsp;</td>
                                                    <td class="SmallColHeading" valign="bottom"><%= MessageHelper.formatMessage("inventoryreport_MarkedLost") %></td>
                                              <%} else {//not lost%>
                                                    <td align="center" colspan="6">
                                                    <base:imageLine height="1" width="100%"/>
                                                    </td>
                                                <% } %>
                                            <% } else if (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_ASSET) { %>
                                                <% if (InventoryReportForm.REPORT_TYPE_LOST_ITEMS.equals(form.getReportType())) { %>
                                                    <td class="SmallColHeading" valign="bottom"><%= MessageHelper.formatMessage("inventoryreport_BarcodeHeading") %></td>
                                                    <td class="SmallColHeading" valign="bottom"><%= MessageHelper.formatMessage("inventoryreport_AssetName") %></td>
                                                    <td class="SmallColHeading" valign="bottom"><%= MessageHelper.formatMessage("inventoryreport_LocationHeading") %></td>
                                                    <td class="SmallColHeading" valign="bottom"><%= MessageHelper.formatMessage("inventoryreport_Price") %></td>
                                                    <td class="SmallColHeading" valign="bottom">&nbsp;</td>
                                                    <td class="SmallColHeading" valign="bottom"><%= MessageHelper.formatMessage("inventoryreport_MarkedLost") %></td>
                                                <%} else {//not lost%>
                                                    <td align="center" colspan="6">
                                                    <base:imageLine height="1" width="100%"/>
                                                    </td>
                                                <% } %>
                                            <% } else if ((form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_LIBRARY) ||
                                                          (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_MEDIA)) { %>
                                                <% if (InventoryReportForm.REPORT_TYPE_LOST_ITEMS.equals(form.getReportType())) { %>
                                                    <td class="SmallColHeading" valign="bottom"><%= MessageHelper.formatMessage("inventoryreport_BarcodeHeading") %></td>
                                                    <td class="SmallColHeading" valign="bottom"><%= MessageHelper.formatMessage("inventoryreport_CallNumberHeading") %></td>
                                                    <td class="SmallColHeading" valign="bottom"><%= MessageHelper.formatMessage("inventoryreport_AuthorHeading") %></td>
                                                    <td class="SmallColHeading" valign="bottom"><%= MessageHelper.formatMessage("inventoryreport_TitleHeading") %></td>
                                                    <td class="SmallColHeading" valign="bottom">&nbsp;</td>
                                                    <td class="SmallColHeading" valign="bottom"><%= MessageHelper.formatMessage("inventoryreport_MarkedLost") %></td>
                                                 <% } else { %>
                                                    <td align="center" colspan="6">
                                                    <base:imageLine height="1" width="100%"/>
                                                    </td>
                                                 <% } %>
                                             <% } %>
                                            <td colspan="2">&nbsp;</td>
                                        </tr>
                                        <%
                                        
                                        Iterator iter = reportList.iterator();
                                        InventoryItem invenItem;
                                        int flipper = 0;
                                        int counter = -1;
                                        
                                        while (iter.hasNext() && counter+1 < itemsToPrint) {
                                            counter++;
                                            invenItem = (InventoryItem) iter.next();
                                            if(counter >= itemsToSkip){
                                                Long copyID = invenItem.getCopyID();
                                                if(!InventoryReportForm.REPORT_TYPE_LOST_ITEMS.equals(form.getReportType())){
                                                    out.println("<tr>");
                                                }else{
                                                    if ( ( flipper & 1 ) == 0 ) {
                                                        out.println("<tr bgColor=\"#E8E8E8\">");
                                                    }
                                                    else {
                                                        out.println("<tr>");
                                                    }
                                                }
                                                flipper++;
                                                if (
                                                    InventoryReportForm.REPORT_TYPE_LOST_ITEMS.equals(form.getReportType()) && (
                                                    (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK ) ||
                                                    (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_LIBRARY) ||
                                                    (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_MEDIA) )) { %>
                                                        
                                                        <td class="ColRow" valign="top"><%= ResponseUtils.filter( invenItem.getBarcode() == null ? "" : BarcodeHelper.getTruncatedBarcode(invenItem.getBarcode())) %></td>
                                                        <td class="ColRow" valign="top"><%= ResponseUtils.filter(invenItem.getCallNumberOrLocation()) %></td>
                                                        <td class="ColRow" valign="top"><%= ResponseUtils.filter(invenItem.getAuthor()) %></td>
                                                        <td class="ColRow" valign="top"><%= ResponseUtils.filter(invenItem.getTitle()) %></td>
                                                        <td class="ColRow" valign="top">
                                                            <% if (invenItem.isTemporary()) { %>
                                                                <base:image src="/icons/materialtype/temp.gif" width="19" height="16" alt='<%= MessageHelper.formatMessage("inventoryreport_Temporary") %>'/>
                                                            <% } else { %>
                                                                &nbsp;
                                                            <% } %>
                                                        </td>
                                                        <td class="ColRow" valign="top"><%= lh.formatDate(invenItem.getDateLastAccountedFor()) %> </td>
                                                        
                                                        <td class="Instruction tdAlignRight" valign="top" nowrap>
                                                            <logic:equal name="backoffice_servlet_InventoryReportForm" property="printerFriendly" value="false">
                                                                <% if (invenItem.getBarcode() != null && !form.isDisableFoundLink()) { %>
                                                                     [ <base:link page="<%=form.getFoundLink(invenItem.getBarcode())%>" id="<%=form.ID_PREFIX_FOUND + copyID %>"><%= MessageHelper.formatMessage("inventoryreport_Found")%></base:link> ]
                                                                <% } %>
                                                        </td>
                                                        <td class="Instruction" valign="top" nowrap>
                                                                <% if (InventoryReportForm.REPORT_TYPE_LOST_ITEMS.equals(form.getReportType())) { %>
                                                                    <% if ((invenItem.getStateCopyID() == null || store.isStateContext())&& !invenItem.isTemporary() && form.isDeleteCopyPermission()) { %>
                                                                        [ <base:link page="<%=form.getDeleteLink(copyID)%>" id="<%=form.ID_PREFIX_DELETE + copyID %>"><%= MessageHelper.formatMessage("inventoryreport_Delete") %></base:link> ]
                                                                   <% } %>
                                                                 <% } else { %>
                                                                        [ <base:link page="<%=form.getMarkLostLink(copyID)%>" id="<%=form.ID_PREFIX_MARK_LOST + copyID %>"><%= MessageHelper.formatMessage("inventoryreport_MarkLost") %></base:link> ]
                                                                    <% } %>
                                                            </logic:equal>
                                                            &nbsp;
                                                        </td>
                                                        
                                                <% }else if (
                                                    form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_ASSET && 
                                                    InventoryReportForm.REPORT_TYPE_LOST_ITEMS.equals(form.getReportType())){%>
                                                    <td class="ColRow" valign="top"><%= ResponseUtils.filter(invenItem.getBarcode() == null ? "" : BarcodeHelper.getTruncatedBarcode(invenItem.getBarcode())) %></td>
                                                    <td class="ColRow" valign="top"><%= ResponseUtils.filter(invenItem.getTitle()) %></td>
                                                    <td class="ColRow" valign="top"><%= ResponseUtils.filter(invenItem.getCallNumberOrLocation()) %></td>
                                                    <td class="ColRow" valign="top"><%= ResponseUtils.filter(invenItem.getFormattedPrice()) %></td>
                                                    <td class="ColRow" valign="top">
                                                        <% if (invenItem.isTemporary()) { %>
                                                            <base:image src="/icons/materialtype/temp.gif" width="19" height="16" alt='<%= MessageHelper.formatMessage("inventoryreport_Temporary") %>'/>
                                                    <% } else { %>
                                                        &nbsp;
                                                    <% } %>
                                                     </td>
                                                    <td class="ColRow" valign="top"><%= lh.formatDate(invenItem.getDateLastAccountedFor()) %> </td>
                                                    
                                                    <td class="Instruction" valign="top" nowrap>
                                                        <logic:equal name="backoffice_servlet_InventoryReportForm" property="printerFriendly" value="false">
                                                            <% if (invenItem.getBarcode() != null && !form.isDisableFoundLink()) { %>
                                                              [ <base:link page="<%=form.getFoundLink(invenItem.getBarcode())%>" id="<%=form.ID_PREFIX_FOUND + copyID %>"><%= MessageHelper.formatMessage("inventoryreport_Found") %></base:link> ]
                                                            <% } %>
                                                            <% if (InventoryReportForm.REPORT_TYPE_LOST_ITEMS.equals(form.getReportType())) { %>
                                                                <% if (!invenItem.isTemporary() && form.isDeleteCopyPermission() ) { %>
                                                                    [ <base:link page="<%=form.getDeleteLink(copyID)%>" id="<%=form.ID_PREFIX_DELETE + copyID %>"><%= MessageHelper.formatMessage("inventoryreport_Delete") %></base:link> ]
                                                                   <% } %>
                                                                 <% } else { %>
                                                                    [ <base:link page="<%=form.getMarkLostLink(copyID)%>" id="<%=form.ID_PREFIX_MARK_LOST + copyID %>"><%= MessageHelper.formatMessage("inventoryreport_MarkLost")%></base:link> ]
                                                                <% } %>
                                                        </logic:equal>
                                                        &nbsp;
                                                    </td>                                                   
                                                    
                                                <%   } else if (
                                                    form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_ASSET && 
                                                    !InventoryReportForm.REPORT_TYPE_LOST_ITEMS.equals(form.getReportType())) { %>
                                                    <td class="ColRow" valign="top" alight="left">
                                                        <%if(!StringHelper.isEmpty(invenItem.getFileName()) && !invenItem.isLegacyTextbookCover()){ %>
                                                        <base:image localize="false" src="<%=URLHelper.getAssetPictureURL(invenItem.getFileName())%>" alt='<%= MessageHelper.formatMessage("inventoryreport_AssetImage") %>'/>
                                                        <%}else if(!StringHelper.isEmpty(invenItem.getFileName()) && invenItem.isLegacyTextbookCover()){ %>
                                                        <base:image localize="false" src="<%=URLHelper.getTextbookPictureURL(invenItem.getFileName())%>" alt='<%= MessageHelper.formatMessage("inventoryreport_AssetImage") %>'/>
                                                        <%}else{ %>
                                                         &nbsp; 
                                                        <%} %>
                                                    </td>
                                                    
                                                    <td  valign="top" width="80%" >
                                                         <table border="0" cellspacing="0" cellpadding="0" id="<%= InventoryReportForm.TABLE_ASSET_INFO %><%= counter %>"  width="100%">
                                                               <tr>
                                                                    <td class="ColRowBold" valign="top" ><%= ResponseUtils.filter(invenItem.getTitle()) %>
                                                                    </td>
                                                                </tr>
                                                                <tr>    
                                                                    <td class="ColRow" valign="top" >Barcode: 
                                                                    <%if (!StringHelper.isEmpty(invenItem.getBarcode()))  {
                                                                        out.println(ResponseUtils.filter( BarcodeHelper.getTruncatedBarcode(invenItem.getBarcode())));
                                                                    } %>
                                                                    
                                                                    </td>
                                                                </tr>   
                                                               <% if(invenItem.getCallNumberOrLocation()!=null && !invenItem.getCallNumberOrLocation().equals("") ){%>
                                                                <tr>
                                                                    <td class="ColRow" valign="top" ><%= MessageHelper.formatMessage("inventoryreport_Location", ResponseUtils.filter(invenItem.getCallNumberOrLocation())) %>
                                                                    </td>
                                                                </tr>   
                                                               <% }%>
                                                               <% if(invenItem.getFormattedPrice()!=null && !invenItem.getFormattedPrice().equals("") ){%>
                                                               <tr>
                                                                   <td class="ColRow" valign="top" ><%= MessageHelper.formatMessage("inventoryreport_PurchasePrice") %> <%= ResponseUtils.filter(invenItem.getFormattedPrice()) %>
                                                                   </td>
                                                               </tr>
                                                               <%}%>
                                                         </table>
                                                    </td>
                                                    
                                                    <td class="tdAlignRight" valign="top" width="20%">
                                                         <table border="0" cellspacing="0" cellpadding="0" id="<%= InventoryReportForm.TABLE_ASSET_LINKS %><%= counter %>"  width="100%">
                                                             <tr>
                                                                <td class="ColRow tdAlignLeft" valign="top" ><%= MessageHelper.formatMessage("inventoryreport_LastSeen", invenItem.getDateLastAccountedFor()) %>
                                                                </td>
                                                                
                                                                
                                                             </tr>
                                                             <tr>
                                                                <td class="Instruction" valign="top" nowrap>
                                                                    <logic:equal name="backoffice_servlet_InventoryReportForm" property="printerFriendly" value="false">
                                                                    <%if ( !form.isDisableFoundLink() ) { %>
                                                                    [ <base:link page="<%=form.getFoundLink(invenItem.getBarcode())%>" id="<%=form.ID_PREFIX_FOUND + copyID %>"><%= MessageHelper.formatMessage("inventoryreport_Found") %></base:link> ]
                                                                    <% } %>
                                                                    <% if (InventoryReportForm.REPORT_TYPE_LOST_ITEMS.equals(form.getReportType())) { %>
                                                                        <% if (!invenItem.isTemporary() && form.isDeleteCopyPermission()) { %>
                                                                            [ <base:link page="<%=form.getDeleteLink(copyID)%>" id="<%=form.ID_PREFIX_DELETE + copyID %>"><%= MessageHelper.formatMessage("inventoryreport_Delete") %></base:link> ]
                                                                        <% } %>
                                                                    <% } else { %>
                                                                            [ <base:link page="<%=form.getMarkLostLink(copyID)%>" id="<%=form.ID_PREFIX_MARK_LOST + copyID %>"><%= MessageHelper.formatMessage("inventoryreport_MarkLost") %></base:link> ]
                                                                    <% } %>
                                                                    </logic:equal>
                                                                    &nbsp;
                                                                </td>
                                                             </tr>
                                                         </table>
                                                    </td>
                                                    
                                                    <td class="ColRow" valign="top">&nbsp;</td>
                                            <!-- asset type finish --> 
                                            <!-- textbook start -->
                                                <%   } else if (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK 
                                                        && !InventoryReportForm.REPORT_TYPE_LOST_ITEMS.equals(form.getReportType())) { %>
                                                    <td class="ColRow" valign="top" alight="left">
                                                         &nbsp; 
                                                    </td>
                                                    
                                                    <td valign="top" width="80%" >
                                                         <table border="0" cellspacing="0" cellpadding="0" id="<%= InventoryReportForm.TABLE_ASSET_INFO %><%= counter %>"  width="100%">
                                                               <tr>
                                                                    <td class="ColRowBold" valign="top" ><%= ResponseUtils.filter(invenItem.getTitle()) %>
                                                                    </td>
                                                                </tr>
                                                                <tr>    
                                                                    <td class="ColRow" valign="top" ><%= MessageHelper.formatMessage("inventoryreport_Barcode", ResponseUtils.filter(BarcodeHelper.getTruncatedBarcode(invenItem.getBarcode()))) %>
                                                                    </td>
                                                                </tr>   
                                                               <% if(invenItem.getCallNumberOrLocation()!=null && !invenItem.getCallNumberOrLocation().equals("") ){%>
                                                                <tr>
                                                                    <td class="ColRow" valign="top" > <%= MessageHelper.formatMessage("inventoryreport_Location", ResponseUtils.filter(invenItem.getCallNumberOrLocation())) %>
                                                                    </td>
                                                                </tr>   
                                                               <% }%>
                                                         </table>
                                                    </td>
                                                    <td class="tdAlignRight" valign="top" width="20%">
                                                         <table border="0" cellspacing="0" cellpadding="0" id="<%= InventoryReportForm.TABLE_ASSET_LINKS %><%= counter %>"  width="100%">
                                                         <tr>
                                                            <td class="ColRow tdAlignLeft" valign="top" ><%= MessageHelper.formatMessage("inventoryreport_LastSeen", invenItem.getDateLastAccountedFor()) %>
                                                            </td>
                                                         </tr>
                                                         <tr>
                                                            <td class="Instruction" valign="top" nowrap>
                                                                <logic:equal name="backoffice_servlet_InventoryReportForm" property="printerFriendly" value="false">
                                                                <%if ( !form.isDisableFoundLink() ) {%>
                                                                    [ <base:link page="<%=form.getFoundLink(invenItem.getBarcode())%>" id="<%=form.ID_PREFIX_FOUND + copyID %>"><%= MessageHelper.formatMessage("inventoryreport_Found") %></base:link> ]
                                                                <% } %>
                                                                <% if (InventoryReportForm.REPORT_TYPE_LOST_ITEMS.equals(form.getReportType())) { %>
                                                                    <% if (!invenItem.isTemporary() && form.isDeleteCopyPermission()) { %>
                                                                        [ <base:link page="<%=form.getDeleteLink(copyID)%>" id="<%=form.ID_PREFIX_DELETE + copyID %>"><%= MessageHelper.formatMessage("inventoryreport_Delete") %></base:link> ]
                                                                    <% } %>
                                                                <% } else { %>
                                                                        [ <base:link page="<%=form.getMarkLostLink(copyID)%>" id="<%=form.ID_PREFIX_MARK_LOST + copyID %>"><%= MessageHelper.formatMessage("inventoryreport_MarkLost") %></base:link> ]
                                                                <% } %>
                                                                </logic:equal>
                                                                &nbsp;
                                                            </td>
                                                         </tr>
                                                    </table>
                                                    </td>
                                                    
                                                    <td class="ColRow" valign="top">&nbsp;</td>
                                                <% } else if (!InventoryReportForm.REPORT_TYPE_LOST_ITEMS.equals(form.getReportType())) { %>
                                                    <td class="ColRow" valign="top" alight="left">&nbsp;</td>
                                                    
                                                    <td valign="top" width="80%" >
                                                         <table border="0" cellspacing="0" cellpadding="0" id="<%= InventoryReportForm.TABLE_ASSET_INFO %><%= counter %>"  width="100%">
                                                                <tr>
                                                                    <td class="ColRowBold" valign="top" ><%= ResponseUtils.filter(invenItem.getTitle()) %>
                                                                        <% if (invenItem.isTemporary()) { %>
                                                                            &nbsp;&nbsp;<base:image src="/icons/materialtype/temp.gif" width="19" height="16" alt='<%= MessageHelper.formatMessage("inventoryreport_Temporary") %>'/>
                                                                        <% } %>
                                                                    </td>
                                                                </tr>
                                                                <% if ( !StringHelper.isEmpty(invenItem.getAuthor() ) )  { %>
                                                                    <tr>    
                                                                        <td class="ColRow" valign="top" ><%= MessageHelper.formatMessage("inventoryreport_Author", ResponseUtils.filter(invenItem.getAuthor())) %>
                                                                        </td>
                                                                    </tr>   
                                                                <% } %>
                                                               <% if(!StringHelper.isEmpty(invenItem.getCallNumberOrLocation())){%>
                                                                <tr>
                                                                    <td class="ColRow" valign="top" ><%= MessageHelper.formatMessage("inventoryreport_CallNumber", ResponseUtils.filter(invenItem.getCallNumberOrLocation())) %>
                                                                    </td>
                                                                </tr>   
                                                               <% }%>
                                                                
                                                                <tr>    
                                                                    <td class="ColRow" valign="top" ><%= MessageHelper.formatMessage("inventoryreport_Barcode", ResponseUtils.filter(BarcodeHelper.getTruncatedBarcode(invenItem.getBarcode()))) %>
                                                                    </td>
                                                                </tr>   
                                                         </table>
                                                    </td>
                                                    
                                                    <td class="tdAlignRight" valign="top" width="20%">
                                                         <table border="0" cellspacing="0" cellpadding="0" id="<%= InventoryReportForm.TABLE_ASSET_LINKS %><%= counter %>"  width="100%">
                                                             <tr>
                                                                <td class="ColRow tdAlignLeft" valign="top" ><%= MessageHelper.formatMessage("inventoryreport_LastSeen", invenItem.getDateLastAccountedFor()) %>
                                                                </td>
                                                                
                                                                
                                                             </tr>
                                                             <tr>
                                                                <td class="Instruction" valign="top" nowrap>
                                                                    <logic:equal name="backoffice_servlet_InventoryReportForm" property="printerFriendly" value="false">
                                                                    <% if ( !form.isDisableFoundLink() ) {%>
                                                                    [ <base:link page="<%=form.getFoundLink(invenItem.getBarcode())%>" id="<%=form.ID_PREFIX_FOUND + copyID %>"><%= MessageHelper.formatMessage("inventoryreport_Found") %></base:link> ]
                                                                    <% } %>
                                                                    <% if (InventoryReportForm.REPORT_TYPE_LOST_ITEMS.equals(form.getReportType())) { %>
                                                                        <% if (!invenItem.isTemporary() && form.isDeleteCopyPermission()) { %>
                                                                            [ <base:link page="<%=form.getDeleteLink(copyID)%>" id="<%=form.ID_PREFIX_DELETE + copyID %>"><%= MessageHelper.formatMessage("inventoryreport_Delete") %></base:link> ]
                                                                        <% } %>
                                                                    <% } else { %>
                                                                            [ <base:link page="<%=form.getMarkLostLink(copyID)%>" id="<%=form.ID_PREFIX_MARK_LOST + copyID %>"><%= MessageHelper.formatMessage("inventoryreport_MarkLost") %></base:link> ]
                                                                    <% } %>
                                                                    </logic:equal>
                                                                    &nbsp;
                                                                </td>
                                                             </tr>
                                                         </table>
                                                    </td>
                                                    
                                                    <td class="ColRow" valign="top">
                                                    &nbsp;
                                                    </td>                                                
                                                <% } %><!-- library type finish --> 
                                            </tr>
                                            <% 
                                            if(!InventoryReportForm.REPORT_TYPE_LOST_ITEMS.equals(form.getReportType())){
                                            %>
                                                <tr>
                                                    <td align="center" colspan="6">
                                                        <base:imageLine height="1" width="100%"/>
                                                    </td>
                                                </tr>
                                                
                                                
                                            <% 
                                            }
                                            %>
                                     
                                 <%    } %><!-- end of if paging for the asset and Not lost items-->    
                                 <%}%><!--  end of while -->
                              </table>
                              </td>
                            </tr>
                            
                            
                            
                            <!-- closing the main table for inventory -->
                            <!-- closing row of table of info  -->
                            <tr>
                                <td >
                                <base:searchSummary searchType="<%=form.gimmeInventoryPromptDescription() %>"
                                startOfSet = '<%=String.valueOf(itemsToSkip+1)%>'
                                endOfSet   = '<%=String.valueOf(itemsToPrint)%>'
                                totalInSet = '<%=String.valueOf(itemsInList)%>'
                                />
                                </td>
                                <td>&nbsp;
                                </td>
                                <td class="SmallColHeading tdAlignRight">
                                <logic:equal name="backoffice_servlet_InventoryReportForm" property="printerFriendly" value="false">
                                    <base:pageListOutput formName="<%= form.FORM_NAME %>"  topOfPageLinks="false" />
                                </logic:equal>
                                </td>
                            </tr>
                   </table>
                       <!-- end body table (sortAndInfoTable) -->
                    </td>
               </tr>
        </table>
        <!-- outlinedTable -->

        <!-- end border table -->
        <br>
     <!-- closing id="outlinedTable" -->
     

<% if (InventoryReportForm.REPORT_TYPE_LOST_ITEMS.equals(form.getReportType()) && !form.isPrinterFriendly()) { %>
    <table border="0" cellspacing="0" cellpadding="0" id="<%= InventoryReportForm.TABLE_INVENTORY_FOOTER %>" width="100%">
        <tr>
            <td colspan="2" width="100%"><base:imageLine height="2" width="100%" vspace="3"/></td>
        </tr>
        <tr>
            <td class="SmallColHeading" valign="bottom">
                <bean:write name="<%= InventoryReportForm.FORM_NAME %>" property="resetMarkedMessage"/>
                
                &nbsp;
                <base:date 
                    buttonName = "<%=InventoryReportForm.BUTTON_MARK_LOST_DATE%>"
                    fieldName = "<%=InventoryReportForm.FIELD_MARK_LOST_DATE%>"
                    dateValue = "<%=form.getLostDate()%>"
                    altText = '<%= MessageHelper.formatMessage("inventoryreport_ChangeMarkLostDate") %>'
                />                
            </td>
            <td class="tdAlignRight">
                <base:genericButton src="/buttons/large/resetlost.gif" absbottom="true" alt='<%= MessageHelper.formatMessage("resetLost") %>' name="<%= InventoryReportForm.BUTTON_RESET_LOST %>" />
            </td>
        </tr>
        <%-- @todo CB - Resource Lost Item Delete Job for next release --%>
        <% if (form.getCollectionType() != BibMasterSpecs.COLLECTION_TYPE_ASSET) { %>
        <logic:equal name="backoffice_servlet_InventoryReportForm" property="deleteCopyPermission" value="true">
            <tr>
                <td colspan="2" width="100%"><base:imageLine height="2" width="100%" vspace="3"/></td>
            </tr>
            <tr>
                <td class="SmallColHeading" valign="bottom">
                    <bean:write name="<%= InventoryReportForm.FORM_NAME %>" property="deleteMarkedMessage"/>
                    
                    &nbsp;
                    <base:date 
                        buttonName = "<%=InventoryReportForm.BUTTON_DELETE_LOST_DATE%>"
                        fieldName = "<%=InventoryReportForm.FIELD_DELETE_LOST_DATE%>"
                        dateValue = "<%=form.getDeleteDate()%>"
                        altText = '<%= MessageHelper.formatMessage("inventoryreport_SetDeleteOnBeforeDate") %>'
                    />                            
                </td>
                <td class="tdAlignRight">
                    <base:genericButton src="/buttons/large/deleteall.gif" absbottom="true" alt='<%= MessageHelper.formatMessage("deleteAll") %>' name="<%= InventoryReportForm.BUTTON_DELETE_LOST %>" />
                </td>
            </tr>
            
            <tr>
                <td class="SmallColHeading" valign="bottom">
                <%if ( form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK && !store.isStateContext() && store.isStateRepositoryRunning() ) { 
                    out.println(MessageHelper.formatMessage("inventoryreport_StateOwnedCopies")); 
                }%>
                </td>
                <td class="tdAlignRight">&nbsp;
                </td>
            </tr>
            
        </logic:equal>
        <% } %>
        
    </table>
<% } %>


<br>
<logic:equal name="backoffice_servlet_InventoryReportForm" property="printerFriendly" value="false">
    <a href="#TheTop"><base:image src="/icons/general/top.gif" height="16" width="19" alt='<%= MessageHelper.formatMessage("inventoryreport_TopOfPage") %>'/></a>
</logic:equal>

    <a name="<%=InventoryReportForm.ANCHOR_CALENDAR_RETURN%>"></a>
</td>
</tr>
</table>
</base:form>
