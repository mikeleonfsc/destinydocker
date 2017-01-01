<%@page import="com.follett.fsc.destiny.session.cataloging.ejb.TextbookSearchFacadeSpecs"%>
<%@page import="com.follett.fsc.destiny.util.xml.AssetTemplateBaseSpecs"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.ejb.AssetSearchFacadeSpecs"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.AddTitleSearchForm"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag" %>
<%@ page import="com.follett.fsc.destiny.session.common.churchill.DestinyJob" %>
<%@ page import="com.follett.fsc.common.consortium.ContextManager" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.util.Barcode" %>
<%@ page import="java.util.Iterator"%>
<%@ page import="java.util.List"%>
<%@ page import="com.follett.fsc.destiny.session.cataloging.data.TransferSearchRecord"%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.destiny.util.lookup.LongLongLookup"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>


<%
    TransferForm form = (TransferForm)request.getAttribute(TransferForm.FORM_NAME);
%>

<% if (!form.isPrinterFriendly()) { %>

<base:messageBox strutsErrors="true"/>
<% } %>

<base:form action="/cataloging/servlet/handletransferform.do" enctype="multipart/form-data">

<html:hidden property = "<%= TransferForm.PARAM_LAST_BIBID %>" />
<html:hidden property = "<%= TransferForm.PARAM_LAST_COUNT_SELECTED %>" />
<html:hidden property = "<%= TransferForm.PARAM_WHERE_WAS_ENTER %>" />
<html:hidden property = "<%= TransferForm.FIELD_ASSET_TEMPLATE_TYPE_CHANGED %>" />

<input type="hidden" name="<%=TransferForm.PARAM_ENTER_PRESSED%>" />


<% if (form.isPrinterFriendly()) { %>

    <%  if (form.getCollectionType() == CollectionType.TEXTBOOK) { %>  
        <table width = "100%">
        <tr>
            <td colspan = "3">
                <% List<TransferSearchRecord> list = form.getFoundTitles();
                 if (!list.isEmpty()) {%>
                <table id = "<%= TransferForm.TABLE_TITLE_SEARCH_RESULTS %>" border="0" cellpadding="4" cellspacing="0" width = "100%">
                    <tr>
                        <td class = "SmallColHeading">Title</td>
                        <td align = "center" class = "SmallColHeading">Available to<br/>Transfer</td>
                        <td align = "center" class = "SmallColHeading"># to<br/>Transfer</td>
                        <td>&nbsp;</td>
                    </tr>
                    <% 
                        Iterator it = list.iterator();
                        boolean firstRow = true;
                        while (it.hasNext()) {
                            out.print(form.formatTitleInfo((TransferSearchRecord)it.next(), false, firstRow));
                            firstRow = false;
                        }
                    %>                    
                </table>
                <% } %>
            </td>                            
        </tr>
         <tr>
            <td colspan = "3">
                <%
                    List<TransferSearchRecord> list2 = form.getCurrentlySelectedTitles();
                    if (list2.size() > 0) {
                %>
                <table id = "<%= TransferForm.TABLE_TITLE_CURRENTLY_SELECTED %>" border="0" cellpadding="4" cellspacing="0" width = "100%">
                    <tr>
                        <td background="/images/icons/general/thickline.gif" nowrap width='100%' colspan = "4">&nbsp;&nbsp;<span class = "SectionHeader" >&nbsp;&nbsp;Currently Selected&nbsp;&nbsp;</span></td>
                    </tr>
                    <tr>
                        <td class = "SmallColHeading">Title</td>
                        <td align = "center" class = "SmallColHeading">Available to<br/>Transfer</td>
                        <td align = "center" class = "SmallColHeading"># to<br/>Transfer</td>
                        <td>&nbsp;</td>
                    </tr>
                    <% 
                        Iterator it2 = list2.iterator();
                        boolean firstRow = true;
                        while (it2.hasNext()) {
                            out.print(form.formatTitleInfo((TransferSearchRecord)it2.next(), true, firstRow));
                            firstRow = false;
                        }
                    %>
                </table>
                <% } %>
            </td>
        </tr>    
    </table>        
    <% } %>
    
    <%  if (form.getCollectionType() == CollectionType.ASSET) { %>  
        <table width = "100%">
 <tr> 
                                <td colspan = "3">
                                    <% List<TransferSearchRecord> foundResourceList = form.getFoundResourceTitles(false);
                                       if (!foundResourceList.isEmpty()) { %>
                                    <table id = "<%= TransferForm.TABLE_TITLE_SEARCH_RESULTS_RESOURCES %>" border="0" cellpadding="4" cellspacing="0" width = "100%">
                                        <tr>
                                            <td class = "SmallColHeading">Resource Description</td>
                                            <td align = "center" class = "SmallColHeading">Available to<br/>Transfer</td>
                                            <td align = "center" class = "SmallColHeading"># to<br/>Transfer</td>
                                            <td align = "center" class = "SmallColHeading">&nbsp;</td>
                                        </tr>
                                        <% 
                                            Iterator it = foundResourceList.iterator();
                                            boolean firstRow = true;
                                            while (it.hasNext()) {
                                                out.print(form.formatTitleInfo((TransferSearchRecord)it.next(), false, firstRow));
                                                firstRow = false;
                                            }
                                        %>
                                    <% } %>


                                    <% List<TransferSearchRecord> foundResourceTextbookList = form.getFoundResourceTitles(true);
                                       if (!foundResourceTextbookList.isEmpty()) { %>
                                       
                                       <% if (foundResourceList.isEmpty()) {  %>
                                    <table id = "<%= TransferForm.TABLE_TITLE_SEARCH_RESULTS_RESOURCES %>" border="0" cellpadding="4" cellspacing="0" width = "100%">
                                     <% } %>
                                        <tr>
                                            <td class = "SmallColHeading">Textbook Title</td>
                                            <td align = "center" class = "SmallColHeading">Available to<br/>Transfer</td>
                                            <td align = "center" class = "SmallColHeading"># to<br/>Transfer</td>
                                            <td align = "center" class = "SmallColHeading">&nbsp;</td>
                                        </tr>
                                        <% 
                                            Iterator it = foundResourceTextbookList.iterator();
                                            boolean firstRow = true;
                                            while (it.hasNext()) {
                                                out.print(form.formatTitleInfo((TransferSearchRecord)it.next(), false, firstRow));
                                                firstRow = false;
                                            }
                                        %>
                                    <% } %>
                                    <% if (!foundResourceTextbookList.isEmpty() || !foundResourceList.isEmpty()) { %>
                                    </table>
                                    <% } %>
                                </td>                            
                            </tr>
                            
                             <tr>
                                <td colspan = "3">
                                    <%
                                        List<TransferSearchRecord> selectedResourceList = form.getCurrentlySelectedResourceTitles(false);
                                        if (!selectedResourceList.isEmpty()) {
                                    %>
                                    <table id = "<%= TransferForm.TABLE_TITLE_CURRENTLY_SELECTED_RESOURCES %>" border="0" cellpadding="4" cellspacing="0" width = "100%">
                                        <tr>
                                            <td background="/images/icons/general/thickline.gif" nowrap width='100%' colspan = "4">&nbsp;&nbsp;<span class = "SectionHeader" >&nbsp;&nbsp;Currently Selected&nbsp;&nbsp;</span></td>
                                        </tr>
                                        <tr>
                                            <td class = "SmallColHeading">Resource Description</td>
                                            <td align = "center" class = "SmallColHeading">Available to<br/>Transfer</td>
                                            <td align = "center" class = "SmallColHeading"># to<br/>Transfer</td>
                                            <td align = "center" class = "SmallColHeading">&nbsp;</td>
                                        </tr>
                                        <% 
                                            Iterator it2 = selectedResourceList.iterator();
                                            boolean firstRow = true;
                                            while (it2.hasNext()) {
                                                out.print(form.formatTitleInfo((TransferSearchRecord)it2.next(), true, firstRow));
                                                firstRow = false;
                                            }
                                        %>
                                   
                                    <% } %>

                                    <%
                                        List<TransferSearchRecord> selectedResourceTextbookList = form.getCurrentlySelectedResourceTitles(true);
                                        if (!selectedResourceTextbookList.isEmpty()) {
                                    %>
                                    <% if (selectedResourceList.isEmpty()) {  %>
                                    <table id = "<%= TransferForm.TABLE_TITLE_CURRENTLY_SELECTED_RESOURCES %>" border="0" cellpadding="4" cellspacing="0" width = "100%">
                                        <tr>
                                            <td background="/images/icons/general/thickline.gif" nowrap width='100%' colspan = "4">&nbsp;&nbsp;<span class = "SectionHeader" >&nbsp;&nbsp;Currently Selected&nbsp;&nbsp;</span></td>
                                        </tr>
                                    <% } %>
                                        <tr>
                                            <td class = "SmallColHeading">Textbook Title</td>
                                            <td align = "center" class = "SmallColHeading">Available to<br/>Transfer</td>
                                            <td align = "center" class = "SmallColHeading"># to<br/>Transfer</td>
                                            <td align = "center" class = "SmallColHeading">&nbsp;</td>
                                        </tr>
                                        <% 
                                            Iterator it2 = selectedResourceTextbookList.iterator();
                                            boolean firstRow = true;
                                            while (it2.hasNext()) {
                                                out.print(form.formatTitleInfo((TransferSearchRecord)it2.next(), true, firstRow));
                                                firstRow = false;
                                            }
                                        %>
                                    <% } %>
                                    <% if (!selectedResourceList.isEmpty() || !selectedResourceTextbookList.isEmpty()) {  %>
                                    </table>
                                    <% } %>
                                </td>  
                            </tr>  
                 
                 
                   
    </table>        
    <% } %>
<% } else { %>

<% if(!form.getSessionStore().isStateContext()){
//original not state transfer
%>
    <html:hidden property="<%=TransferForm.BUTTON_CHANGE_SUBMIT%>" value="0"/>
    <html:hidden property="<%=GenericForm.FIELD_COLLECTION_TYPE%>"/>
    
    <logic:equal name="<%=TransferForm.FORM_NAME%>" property="<%=TransferForm.PARAM_SHOW_CONFIRMATION%>" value="true">
        <base:messageBox showRedBorder="true">
        <tr>
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td valign="baseline" class="Error">
                <p align="center"><%=form.gimmeConfirmationMessage()%></p>
                <div align="center">
                    <base:yesNo/> 
                </div>
            </td>
        </tr>
        </base:messageBox>
    </logic:equal>
        <base:outlinedTableAndTabsWithinThere id="<%=TransferForm.TABLE_MAIN_OUTER%>" selectedTab="<%=TransferForm.ID_TAB%>" tabs="<%=form.getTabs()%>">
       
        
         <tr>
            <td>
            <table id="<%=TransferForm.TABLE_MAIN%>" width="100%" border="0" cellspacing="0" cellpadding="4">
                <tr>
                <td colspan="2" class="TableHeading">Transfer <%=CollectionType.getDisplayablePlural(form.getCollectionType()) %>...</td>
                </tr>

                <base:isDistrictUser>
                    <tr>
                    <td class="ColRowBold tdAlignRight">From</td>
                    <td class="ColRowBold">
                        <logic:equal name="<%=TransferForm.FORM_NAME%>" property="<%=TransferForm.FIELD_TRANSFER_BY%>" value='<%= "" +TransferForm.TRANSFER_BY_FILE%>'>
                            <%=form.getDistrictName() %>    
                        </logic:equal>
                        <logic:notEqual name="<%=TransferForm.FORM_NAME%>" property="<%=TransferForm.FIELD_TRANSFER_BY%>" value='<%= "" +TransferForm.TRANSFER_BY_FILE%>'>
                               <base:selectSite 
                                name='<%= TransferForm.FIELD_FROM_SITEID %>'
                                selectedSiteID='<%= ""+form.getFromSiteID() %>' 
                                useSelectASite='true'
                                submitOnChange="true"
                                onChangeAction="submitDropDownSite()"
                                mode='<%= form.getSelectSiteDropdownMode() %>' 
                                collectionType='<%= form.getCollectionType()%>'
                                />                            
                        </logic:notEqual>
                    </td>
                    </tr>
                </base:isDistrictUser>
                
                <logic:notEqual name="<%=TransferForm.FORM_NAME%>" property="<%=TransferForm.FIELD_TRANSFER_BY%>" value='<%= "" +TransferForm.TRANSFER_BY_FILE%>'>
                    <tr>
                    <td class="ColRowBold tdAlignRight">To</td>
                    <td class="ColRowBold">
                    <% if (form.getCollectionType() == CollectionType.TEXTBOOK
                        && form.getSessionStore().isStateRepositoryRunning()
                        && form.getStore().isStateContext()
                        && !form.getSessionStore().isDistrictUser()
                        ){ %>
                        <base:selectDistrict 
                            includeStateTextbookOffice="false" 
                            selectedDistrictContext="<%=form.getDistrictContext()%>"
                            mustContainTextbookSites="true"  
                            useSelectADistrict="true" 
                            limitToMyDistirctContext="true"
                            onChangeAction="submitDropDownDistrict()" 
                            name="<%= TransferForm.FIELD_DISTRICT_CONTEXT %>" />
                    <% } else { %>
                        <base:selectSite 
                            name='<%= TransferForm.FIELD_TO_SITEID %>'
                            selectedSiteID='<%=""+form.getToSiteID() %>' 
                            useSelectASite='true'
                            mode="<%= form.getSelectSiteDropdownMode() %>"
                            excludeThisSiteID="<%=form.excludeMySite()%>"
                            collectionType='<%= form.getCollectionType()%>'
                            />
                    <% } %>
                    </td>
                    </tr>
                    <% if(form.getCollectionType() == CollectionType.TEXTBOOK
                        && !StringHelper.isEmpty(form.getDistrictContext()) 
                        && !SelectDistrictTag.SELECT_A_DISTRICT_TEXT.equals(form.getDistrictContext()) 
                        && !SelectDistrictTag.BLANK_SITE.equals(form.getDistrictContext())
                        && !form.getStateRepositoryContextName().equals(form.getDistrictContext())
                        && !form.getSessionStore().isDistrictUser()
                        && form.getStore().isStateContext()
                        ) { %>
                    <tr>
                        <td class="ColRowBold tdAlignRight">&nbsp;</td>
                        <td colspan="2">
                            <base:selectSite 
                                useSelectASite="true"
                                name="<%= TransferForm.FIELD_TO_SITEID %>" 
                                selectedSiteID="<%= String.valueOf(form.getToSiteID()) %>" 
                                mode="<%=SelectSiteTag.MODE_GROUP_BY_SITE_TYPE_TEXTBOOK_ONLY %>"
                                includeLibrarySites="false"
                                includeTextbookSites="true"
                                includeMediaSites="false"
                                contextName="<%=form.getDistrictContext()%>"
                                excludeThisSiteID="<%=form.excludeMySite()%>"
                                includeAssetSites="false"
                                includeDistrictWarehouse="true"
                                />
                         </td>   
                    </tr>
                    <%} %> 
                </logic:notEqual>                
                <tr>
                
                    <td class="ColRowBold tdAlignRight">Transfer</td>
                    <td class="ColRowBold">
                        <% if (form.isShowTransferByDropdown(true)) { %>
                            <html:select property="<%=TransferForm.FIELD_TRANSFER_BY%>" onchange="submitDropDownMode()">
                                <html:option value='<%= "" +TransferForm.TRANSFER_BY_BARCODE%>'>by Barcode</html:option>
                                <% if (form.isShowTransferByDropdown(false)) { %>
                                    <html:option value='<%= "" +TransferForm.TRANSFER_BY_LIST%>'>from List</html:option>
                                <% } %>
                                <c:if test="<%= form.isAllowTransferByFile() %>">
                                    <html:option value='<%= "" +TransferForm.TRANSFER_BY_FILE%>'>from Transfer File</html:option>
                                </c:if>
                                
                                <c:if test="<%= !SelectSiteTag.BLANK_SITE.equals(form.getFromSiteID()) && !form.getSessionStore().isDistrictUser() %>">
                                    <c:choose>
                                        <c:when test="<%=form.getCollectionType() == CollectionType.ASSET%>">
                                            <html:option value='<%= "" +TransferForm.TRANSFER_BY_CATEGORY%>'>by Item Category</html:option>
                                        </c:when>
                                        <c:otherwise>
                                            <html:option value='<%= "" +TransferForm.TRANSFER_BY_CATEGORY%>'>by Copy Category</html:option>
                                        </c:otherwise>
                                    </c:choose>
                                </c:if> 
                                <c:if test = "<%= form.getCollectionType() == CollectionType.ASSET %>" >                               
                                    <html:option value = '<%= "" + TransferForm.TRANSFER_BY_COPY_COUNT %>'>by Item Count</html:option>
                                </c:if>
                                <c:if test = "<%= form.getCollectionType() == CollectionType.TEXTBOOK %>" >                               
                                    <html:option value = '<%= "" + TransferForm.TRANSFER_BY_COPY_COUNT %>'>by Copy Count</html:option>
                                </c:if>
                            </html:select>
                            &nbsp;
                            <c:choose>
                                <c:when test="<%=form.getTransferBy() == TransferForm.TRANSFER_BY_LIST  && !form.isPrinterFriendly()%>">
                                    <base:myListSelect 
                                        name="<%=TransferForm.FIELD_SELECTED_LIST_ID%>" 
                                        selectedMyListID="<%=form.getSelectedListID() %>" 
                                        prompt="" 
                                        publicList="false" 
                                        submitOnChange="false" />
                                    <html:hidden name="<%=TransferForm.FORM_NAME%>" property="<%=TransferForm.FIELD_SELECTED_CATEGORY_ID%>"/>
                                </c:when>
                                <c:when test="<%=form.getTransferBy() == TransferForm.TRANSFER_BY_CATEGORY && !form.isPrinterFriendly()%>">
                                    <base:categorySelect name="<%= TransferForm.FIELD_SELECTED_CATEGORY_ID%>" siteID="<%= form.getFromSiteID() %>" collectionType="<%=form.getCollectionType()%>" selectedCategoryID="<%=form.getSelectedCategoryID()%>"/>
                                    <html:hidden name="<%=TransferForm.FORM_NAME%>" property="<%=TransferForm.FIELD_SELECTED_LIST_ID%>"/>
                                </c:when>
                                <c:otherwise>
                                    <html:hidden name="<%=TransferForm.FORM_NAME%>" property="<%=TransferForm.FIELD_SELECTED_CATEGORY_ID%>"/>
                                    <html:hidden name="<%=TransferForm.FORM_NAME%>" property="<%=TransferForm.FIELD_SELECTED_LIST_ID%>"/>
                                </c:otherwise>
                            </c:choose>
                    <% } else { %>
                        <html:hidden property="<%=TransferForm.FIELD_TRANSFER_BY%>" value='<%= "" +TransferForm.TRANSFER_BY_BARCODE%>'/>
                        by Barcode
                    <% } %>
                </td>
            </tr>
            <logic:equal name="<%=TransferForm.FORM_NAME%>" property="<%=TransferForm.FIELD_TRANSFER_BY%>" value='<%= "" +TransferForm.TRANSFER_BY_LIST%>'>
                <tr>
                    <td>&nbsp;</td>
                    <td>
                        <base:genericButton src="/buttons/large/viewlist.gif" absbottom="true"
                            alt='<%= MessageHelper.formatMessage("viewList") %>'
                            name="<%= TransferForm.BUTTON_VIEW_LIST %>" />
                    </td>
                </tr>
            </logic:equal>
                <logic:equal name="<%=TransferForm.FORM_NAME%>" property="<%=TransferForm.FIELD_COLLECTION_TYPE%>" value='<%=CollectionType.ASSET + ""%>'>
                    <tr>
                        <td>&nbsp;</td>
                        <td class="ColRowBold" valign="absbottom"><html:checkbox property="<%=TransferForm.FIELD_CREATE_PACKING_LIST%>">&nbsp;Create a packing list</html:checkbox>
                        </td>
                   </tr>
               </logic:equal> 
               <logic:equal name = "<%=TransferForm.FORM_NAME%>" property="<%=TransferForm.FIELD_COLLECTION_TYPE%>" value='<%=CollectionType.TEXTBOOK + ""%>'>    
                    <logic:notEqual name = "<%=TransferForm.FORM_NAME%>" property="<%=TransferForm.FIELD_TRANSFER_BY%>" value='<%="" + TransferForm.TRANSFER_BY_FILE%>'>
                        <tr>
                            <td class="ColRowBold tdAlignRight">Order #</td>
                            <td><html:text property = "<%=TransferForm.FIELD_ORDERNUM %>" size = "25" maxlength = "80"/></td>
                        </tr>
                    </logic:notEqual>
               </logic:equal>
                <tr>
                    <td colspan="3">
                    <base:imageLine height="1" width="100%"/>
                    </td>
                </tr>
                            
                <logic:equal name="<%=TransferForm.FORM_NAME%>" property="<%=TransferForm.FIELD_TRANSFER_BY%>" value='<%= "" +TransferForm.TRANSFER_BY_BARCODE%>'>
                    <tr>
                    <td>&nbsp;</td>
                    <td>
                       <base:barcodeList barcodeType="<%= Barcode.BARCODETYPE_COPY %>"
                           formName="<%=TransferForm.FORM_NAME%>"/>
                    </td>
                    </tr>
    
                    <tr>
                        <td colspan="2">
                        <base:imageLine height="1" width="100%"/>
                        </td>
                    </tr>
                </logic:equal>                
                <logic:equal name="<%=TransferForm.FORM_NAME%>" property="<%=TransferForm.FIELD_TRANSFER_BY%>" value='<%= "" +TransferForm.TRANSFER_BY_COPY_COUNT%>'>
                    <logic:equal name="<%=TransferForm.FORM_NAME%>" property="<%=TransferForm.PARAM_DISPLAY_TITLE_SEARCH%>" value="true">
                    
                    <tr>
                    
                   <% if (form.getCollectionType() == CollectionType.TEXTBOOK ){ %>
                        <td class="ColRowBold"  align="right" nowrap="true">Find by</td>
                   <% } %>  
                   <% if (form.getCollectionType() == CollectionType.ASSET ){ %>
                        <td class="ColRowBold"  align="right" nowrap="true">Find </td>
                   <% } %>  
                    
                    <td class="ColRowBold" nowrap="true">
                        <bean:define id="assets" name="cataloging_servlet_TransferForm" property="assetTreeOptionList" />
                         <% if (form.getCollectionType() == CollectionType.ASSET ){ %>        
                            <% if (form.isDisplayDropdown()) { %>
                                
                                    <html:select property="<%=TransferForm.FIELD_TEMPLATE_ID%>" onchange="submitOnTemplateChange()">
                                        <html:options collection="assets" property="longID" labelProperty="stringDesc"/>
                                    </html:select>
                            <% } else { %>
                                    <%= form.getAssetTreeOptionList().getString(0)%>
                                <html:hidden property="<%= TransferForm.FIELD_TEMPLATE_ID %>"/>
                                   
                            <%} %>
                                &nbsp; by
                         <% } %>     
                         <% if (form.getCollectionType() == CollectionType.TEXTBOOK ){ %>
                             <html:select property="<%=TransferForm.FIELD_SEARCH_BY%>" onchange="clearSearchField()">
                                     <html:option value='<%= "" +TransferForm.SEARCH_BY_TITLE%>'>Textbook title</html:option>
                                     <html:option value='<%= "" +TransferForm.SEARCH_BY_ISBN%>'>ISBN</html:option>
                                     <html:option value='<%= "" +TransferForm.SEARCH_BY_STATE_ID%>'>State/Textbook ID</html:option>
                                </html:select>
                                    <html:text onkeypress="return trapEnterKey(event, 0);" maxlength = "255" size = "20" property = "<%= TransferForm.FIELD_SEARCH_CRITERIA %>" ></html:text>&nbsp;
                                    <base:goButton absbottom="true" />
                        <% } %>    
                        <!-- Asset search here -->      
                     
                        <% if (form.getCollectionType() == CollectionType.ASSET && !form.getAssetTemplateID().equals(new Long(AssetTemplateBaseSpecs.DEFAULT_TEMPLATE_ID_TEXTBOOK_NODE))){ %>
                                     <html:select property="<%=TransferForm.FIELD_SEARCH_BY%>" onchange="clearSearchField()">
                                         <html:option value='<%= "" +AssetSearchFacadeSpecs.SEARCH_TYPE_KEYWORD%>'>All</html:option>
                                         <html:option value='<%= "" +AssetSearchFacadeSpecs.SEARCH_TYPE_NAME%>'>Displayable Name</html:option>
                                         <html:option value='<%= "" +AssetSearchFacadeSpecs.SEARCH_TYPE_DISTRICT_ID%>'>District ID</html:option>
                                         <html:option value='<%= "" +AssetSearchFacadeSpecs.SEARCH_TYPE_PURCHASE_ORDER%>'>Purchase Order #</html:option>
                                         <html:option value='<%= "" +AssetSearchFacadeSpecs.SEARCH_TYPE_SERIAL_NUMBER%>'>Serial Number</html:option>
                                    </html:select>
                                        <html:text onkeypress="return trapEnterKey(event, 0);" maxlength = "255" size = "20" property = "<%= TransferForm.FIELD_SEARCH_CRITERIA %>" ></html:text>&nbsp;
                                        <base:goButton absbottom="true" />
                        <% } %>    
                        <% if (form.getCollectionType() == CollectionType.ASSET && form.getAssetTemplateID().equals(new Long(AssetTemplateBaseSpecs.DEFAULT_TEMPLATE_ID_TEXTBOOK_NODE))){ %>
                                     <html:select property="<%=TransferForm.FIELD_SEARCH_BY%>" onchange="clearSearchField()">
                                         <html:option value='<%= "" +AssetSearchFacadeSpecs.SEARCH_TYPE_TEXTBOOK_TITLE%>'>Title</html:option>
                                         <html:option value='<%= "" +AssetSearchFacadeSpecs.SEARCH_TYPE_ISBN%>'>ISBN</html:option>
                                         <html:option value='<%= "" +AssetSearchFacadeSpecs.SEARCH_TYPE_AUTHOR%>'>Author</html:option>
                                         <html:option value='<%= "" +AssetSearchFacadeSpecs.SEARCH_TYPE_ADDITIONAL_INFO%>'>Additional Information</html:option>
                                         <html:option value='<%= "" +AssetSearchFacadeSpecs.SEARCH_TYPE_STATE_TEXTBOOK_ID%>'>State/Textbook ID</html:option>
                                    </html:select>
                                        <html:text onkeypress="return trapEnterKey(event, 0);" maxlength = "255" size = "20" property = "<%= TransferForm.FIELD_SEARCH_CRITERIA %>" ></html:text>&nbsp;
                                        <base:goButton absbottom="true" />
                        <% } %>   
                        </td>
                    </tr> 

                        
                    </logic:equal>
                    <logic:equal name="<%=TransferForm.FORM_NAME%>" property="<%=TransferForm.PARAM_DISPLAY_TITLE_SEARCH%>" value="false">
                        <tr>
                            <td class="ColRowBold" colspan="3" align="center">Select a site from which to transfer</td>
                        </tr> 
                    </logic:equal>                     
                        <tr>
                            <c:if test = "<%= !StringHelper.isEmptyOrWhitespace(form.getSearchCriteria()) %>">
                                <td class = "ColRowBold" colspan="2">Searched for "<%= form.getSearchCriteria() %>"</td>
                            </c:if>
                            <c:if test = "<%= StringHelper.isEmptyOrWhitespace(form.getSearchCriteria()) %>">
                                <td class = "ColRowBold" colspan = "2">&nbsp;</td>                        
                            </c:if>
                            <td class="tdAlignRight">
                                    <base:link page='<%= form.buildPrinterFriendlyLink("/cataloging/servlet/handletransferform.do") %>' target="printerFriendly" id="<%=GenericForm.ID_PRINTER_FRIENDLY %>"><base:image src='/buttons/small/printerfriendly.gif' alt="Printer Friendly" align="absbottom"/></base:link>
                            </td>
                        </tr>
                        <tr>                           
                            <td class="SmallColHeading" colspan="2">
                            <c:if test = "<%= form.getCurrentlySelectedTitles().size() > 0 && form.getCollectionType() == CollectionType.TEXTBOOK %>" >
                                Titles currently selected: <%= form.getCurrentlySelectedTitles().size() %>                         
                            </c:if>
                            <c:if test = "<%= form.getCurrentlySelectedTitles().size() > 0 && form.getCollectionType() == CollectionType.ASSET %>" >
                                Resources currently selected: <%= form.getCurrentlySelectedTitles().size() %>                         
                            </c:if>
                            <c:if test = "<%= form.getCurrentlySelectedTitles().size() == 0 %>" >
                                &nbsp;
                            </c:if>
                            </td>    
                            <td class="ColRowBold tdAlignRight">
                                 <logic:equal name="<%= TransferForm.FORM_NAME %>" property="assetProductType" value="true" scope="request">
                                    <base:genericShowHideButton src="/buttons/large/transferitems.gif" 
                                        name="<%= TransferForm.BUTTON_TRANSFER_ITEMS %>" 
                                        alt="<%= TransferForm.ALT_SUBMIT_TEXT_ITEMS %>"
                                        elementID="<%= TransferForm.BUTTON_TRANSFER_ITEMS %>"/>                                
                                </logic:equal>
                                <logic:equal name="<%= TransferForm.FORM_NAME %>" property="assetProductType" value="false" scope="request">                        
                                    <base:genericShowHideButton src="/buttons/large/transfercopies.gif" 
                                        name="<%= TransferForm.BUTTON_TRANSFER %>" 
                                        alt="<%= TransferForm.ALT_SUBMIT_TEXT %>"
                                        elementID="<%= TransferForm.BUTTON_TRANSFER %>"/>  
                                </logic:equal> 
                            </td>
                        </tr>
                        <c:if test = "<%= form.getFoundTitles().size() > 0 %>">   
                            <tr>
                                <td class = "SmallColHeading tdAlignRight" colspan = "3"  nowrap = "nowrap"><%= form.buildPageLinks() %></td>
                            </tr>             
                        </c:if>
                         <%  if (form.getCollectionType() == CollectionType.TEXTBOOK) { %>                       
                            <tr> 
                                <td colspan = "3">
                                    <% List<TransferSearchRecord> list = form.getFoundTitles();
                                       if (!list.isEmpty()) { %>
                                    <table id = "<%= TransferForm.TABLE_TITLE_SEARCH_RESULTS %>" border="0" cellpadding="4" cellspacing="0" width = "100%">
                                        <tr>
                                            <td class = "SmallColHeading">Title</td>
                                            <td align = "center" class = "SmallColHeading">Available to<br/>Transfer</td>
                                            <td align = "center" class = "SmallColHeading"># to<br/>Transfer</td>
                                            <td class="SmallColHeading tdAlignRight">&nbsp;</td>
                                        </tr>
                                        <% 
                                            Iterator it = list.iterator();
                                            boolean firstRow = true;
                                            while (it.hasNext()) {
                                                out.print(form.formatTitleInfo((TransferSearchRecord)it.next(), false, firstRow));
                                                firstRow = false;
                                            }
                                        %>
                                        <tr>
                                            <td colspan = "3">&nbsp;</td>
                                            <td class="SmallColHeading tdAlignRight" nowrap = "nowrap"><%= form.buildPageLinks() %></td>
                                        </tr>
                                    </table>
                                    <% } %>
                                </td>                            
                            </tr>
    
                             <tr>
                                <td colspan = "3">
                                    <%
                                        List<TransferSearchRecord> list2 = form.getCurrentlySelectedTitles();
                                        if (list2.size() > 0) {
                                    %>
                                    <table id = "<%= TransferForm.TABLE_TITLE_CURRENTLY_SELECTED %>" border="0" cellpadding="4" cellspacing="0" width = "100%">
                                        <tr>
                                            <td background="/images/icons/general/thickline.gif" nowrap width='100%' colspan = "4">&nbsp;&nbsp;<span class = "SectionHeader" >&nbsp;&nbsp;Currently Selected&nbsp;&nbsp;</span></td>
                                        </tr>
                                        <tr>
                                            <td class = "SmallColHeading">Title</td>
                                            <td align = "center" class = "SmallColHeading">Available to<br/>Transfer</td>
                                            <td align = "center" class = "SmallColHeading"># to<br/>Transfer</td>
                                            <td>&nbsp;</td>
                                        </tr>
                                        <% 
                                            Iterator it2 = list2.iterator();
                                            boolean firstRow = true;
                                            while (it2.hasNext()) {
                                                out.print(form.formatTitleInfo((TransferSearchRecord)it2.next(), true, firstRow));
                                                firstRow = false;
                                            }
                                        %>
                                    </table>
                                    <% } %>
                                </td>  
                            </tr>  
                        <% } %>
                 <!--  end of textbook -->
                 <!--  start of resources -->
                 
                 <%  if (form.getCollectionType() == CollectionType.ASSET) { %>   
                            <tr> 
                                <td colspan = "3">
                                    <% List<TransferSearchRecord> foundResourceList = form.getFoundResourceTitles(false);
                                       if (!foundResourceList.isEmpty()) { %>
                                    <table id = "<%= TransferForm.TABLE_TITLE_SEARCH_RESULTS_RESOURCES %>" border="0" cellpadding="4" cellspacing="0" width = "100%">
                                        <tr>
                                            <td class = "SmallColHeading">Resource Description</td>
                                            <td align = "center" class = "SmallColHeading">Available to<br/>Transfer</td>
                                            <td align = "center" class = "SmallColHeading"># to<br/>Transfer</td>
                                            <td align = "center" class = "SmallColHeading">&nbsp;</td>
                                        </tr>
                                        <% 
                                            Iterator it = foundResourceList.iterator();
                                            boolean firstRow = true;
                                            while (it.hasNext()) {
                                                out.print(form.formatTitleInfo((TransferSearchRecord)it.next(), false, firstRow));
                                                firstRow = false;
                                            }
                                        %>
                                    <% } %>


                                    <% List<TransferSearchRecord> foundResourceTextbookList = form.getFoundResourceTitles(true);
                                       if (!foundResourceTextbookList.isEmpty()) { %>
                                       
                                       <% if (foundResourceList.isEmpty()) {  %>
                                    <table id = "<%= TransferForm.TABLE_TITLE_SEARCH_RESULTS_RESOURCES %>" border="0" cellpadding="4" cellspacing="0" width = "100%">
                                     <% } %>
                                        <tr>
                                            <td class = "SmallColHeading">Textbook Title</td>
                                            <td align = "center" class = "SmallColHeading">Available to<br/>Transfer</td>
                                            <td align = "center" class = "SmallColHeading"># to<br/>Transfer</td>
                                            <td align = "center" class = "SmallColHeading">&nbsp;</td>
                                        </tr>
                                        <% 
                                            Iterator it = foundResourceTextbookList.iterator();
                                            boolean firstRow = true;
                                            while (it.hasNext()) {
                                                out.print(form.formatTitleInfo((TransferSearchRecord)it.next(), false, firstRow));
                                                firstRow = false;
                                            }
                                        %>
                                    <% } %>
                                    <% if (!foundResourceTextbookList.isEmpty() || !foundResourceList.isEmpty()) { %>
                                        <tr>
                                            <td colspan = "3">&nbsp;</td>
                                            <td class="SmallColHeading tdAlignRight" nowrap = "nowrap"><%= form.buildPageLinks() %></td>
                                        </tr>
                                    </table>
                                    <% } %>
                                </td>                            
                            </tr>
                            
                             <tr>
                                <td colspan = "3">
                                    <%
                                        List<TransferSearchRecord> selectedResourceList = form.getCurrentlySelectedResourceTitles(false);
                                        if (!selectedResourceList.isEmpty()) {
                                    %>
                                    <table id = "<%= TransferForm.TABLE_TITLE_CURRENTLY_SELECTED_RESOURCES %>" border="0" cellpadding="4" cellspacing="0" width = "100%">
                                        <tr>
                                            <td background="/images/icons/general/thickline.gif" nowrap width='100%' colspan = "4">&nbsp;&nbsp;<span class = "SectionHeader" >&nbsp;&nbsp;Currently Selected&nbsp;&nbsp;</span></td>
                                        </tr>
                                        <tr>
                                            <td class = "SmallColHeading">Resource Description</td>
                                            <td align = "center" class = "SmallColHeading">Available to<br/>Transfer</td>
                                            <td align = "center" class = "SmallColHeading"># to<br/>Transfer</td>
                                            <td align = "center" class = "SmallColHeading">&nbsp;</td>
                                        </tr>
                                        <% 
                                            Iterator it2 = selectedResourceList.iterator();
                                            boolean firstRow = true;
                                            while (it2.hasNext()) {
                                                out.print(form.formatTitleInfo((TransferSearchRecord)it2.next(), true, firstRow));
                                                firstRow = false;
                                            }
                                        %>
                                   
                                    <% } %>

                                    <%
                                        List<TransferSearchRecord> selectedResourceTextbookList = form.getCurrentlySelectedResourceTitles(true);
                                        if (!selectedResourceTextbookList.isEmpty()) {
                                    %>
                                    <% if (selectedResourceList.isEmpty()) {  %>
                                    <table id = "<%= TransferForm.TABLE_TITLE_CURRENTLY_SELECTED_RESOURCES %>" border="0" cellpadding="4" cellspacing="0" width = "100%">
                                        <tr>
                                            <td background="/images/icons/general/thickline.gif" nowrap width='100%' colspan = "4">&nbsp;&nbsp;<span class = "SectionHeader" >&nbsp;&nbsp;Currently Selected&nbsp;&nbsp;</span></td>
                                        </tr>
                                    <% } %>
                                        <tr>
                                            <td class = "SmallColHeading">Textbook Title</td>
                                            <td align = "center" class = "SmallColHeading">Available to<br/>Transfer</td>
                                            <td align = "center" class = "SmallColHeading"># to<br/>Transfer</td>
                                            <td align = "center" class = "SmallColHeading">&nbsp;</td>
                                        </tr>
                                        <% 
                                            Iterator it2 = selectedResourceTextbookList.iterator();
                                            boolean firstRow = true;
                                            while (it2.hasNext()) {
                                                out.print(form.formatTitleInfo((TransferSearchRecord)it2.next(), true, firstRow));
                                                firstRow = false;
                                            }
                                        %>
                                    <% } %>
                                    <% if (!selectedResourceList.isEmpty() || !selectedResourceTextbookList.isEmpty()) {  %>
                                    </table>
                                    <% } %>
                                </td>  
                            </tr>  
                 
                 
                 
                 
                 
                <% } %>
                 <!--  end of resources -->
                 
                </logic:equal>
                                 
                <logic:equal name="<%=TransferForm.FORM_NAME%>" property="<%=TransferForm.FIELD_TRANSFER_BY%>" value='<%= "" +TransferForm.TRANSFER_BY_FILE%>'>
                    <tr>
                        <td colspan="3" class="ColRowBold">
                                Select a transfer file   
                                <html:file property="<%=TransferForm.FIELD_UPLOAD_FILE%>" size="40"/>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="3" class="ColRowBold" align="center">
                            <%= GenericForm.getLastBackupDisplayMsg(true)%>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="3">
                        <base:imageLine height="1" width="100%"/>
                        </td>
                    </tr>
                </logic:equal>
                
               <% if(!form.isAssetProductType() && form.isTransferToState()){ %>
                <tr>
                        <td colspan="3" align="center" class="ColRowBold">
                            State transfers cannot be stopped.
                        </td>
                    </tr>
                <%} %>
                
                <logic:notEqual name="<%=TransferForm.FORM_NAME%>" property="<%=TransferForm.FIELD_TRANSFER_BY%>" value='<%= "" +TransferForm.TRANSFER_BY_FILE%>'>
                    <tr>
                        <td colspan="3" align="center" class="ColRowBold">
                            Upon transfer, ownership will be immediately changed to the receiving site. 
                        </td>
                    </tr>
                </logic:notEqual>
                
               <% if((form.getTransferBy() == TransferForm.TRANSFER_BY_CATEGORY || 
                     form.getTransferBy() == TransferForm.TRANSFER_BY_LIST) 
                     && form.getCollectionType() != CollectionType.ASSET ){ %>
                    <tr>
                        <td colspan="3" align="center" class="ColRowBold">
                            Copies without barcodes are not included in transfer. 
                        </td>
                    </tr>
                <%} %>
                <tr>
                    <td colspan="3" align="center" class="ColRowBold">
                        <logic:equal name="<%= TransferForm.FORM_NAME %>" property="assetProductType" value="true" scope="request">
                            <base:genericShowHideButton src="/buttons/large/transferitems.gif" 
                                name="<%= TransferForm.BUTTON_TRANSFER_ITEMS %>" 
                                alt="<%= TransferForm.ALT_SUBMIT_TEXT_ITEMS %>"
                                elementID="transferItems2"/>                                
                        </logic:equal>
                        <logic:equal name="<%= TransferForm.FORM_NAME %>" property="assetProductType" value="false" scope="request">                        
                            <base:genericShowHideButton src="/buttons/large/transfercopies.gif" 
                                name="<%= TransferForm.BUTTON_TRANSFER %>" 
                                alt="<%= TransferForm.ALT_SUBMIT_TEXT %>"
                                elementID="transferCopies2"/>   
                        </logic:equal>
                    </td>
                </tr>
            </table>
            </td>
        </tr>
        </base:outlinedTableAndTabsWithinThere>
<% } else {
//we are the stateOffice
%>

    <html:hidden property="<%=TransferForm.BUTTON_CHANGE_SUBMIT%>" value="0"/>
    <html:hidden property="<%=GenericForm.FIELD_COLLECTION_TYPE%>"/>
    <logic:equal name="<%=TransferForm.FORM_NAME%>" property="<%=TransferForm.PARAM_SHOW_CONFIRMATION%>" value="true">
        <base:messageBox showRedBorder="true">
        <tr>
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td valign="baseline" class="Error">
                <p align="center"><%=form.gimmeConfirmationMessage()%></p>
                <div align="center">
                    <base:yesNo/> 
                </div>
            </td>
        </tr>
        </base:messageBox>        
    </logic:equal>
        <base:outlinedTableAndTabsWithinThere id="<%=TransferForm.TABLE_MAIN%>" selectedTab="<%=TransferForm.ID_TAB%>" tabs="<%=form.getTabs()%>">
       <tr>
            <td>
            <table id="<%=TransferForm.TABLE_MAIN_INNER%>" width="100%" border="0" cellspacing="0" cellpadding="4">
                <tr>
                <td colspan="3" class="TableHeading">Transfer <%=CollectionType.getDisplayablePlural(form.getCollectionType()) %>...</td>
                </tr>

                <base:isDistrictUser>
                    <tr>
                    <td class="ColRowBold tdAlignRight">From</td>
                    <td colspan="2" class="ColRowBold">
                        <%=form.getDistrictName() %>
                    </td>
                    </tr>
                </base:isDistrictUser>

            <logic:notEqual name="<%=TransferForm.FORM_NAME%>" property="<%=TransferForm.FIELD_TRANSFER_BY%>" value='<%= "" +TransferForm.TRANSFER_BY_FILE%>'>

                <tr>
                    <td class="ColRowBold tdAlignRight">To</td>
                    <td colspan="2" class="ColRowBold">
                       <base:selectDistrict 
                        includeStateTextbookOffice="false" 
                        selectedDistrictContext="<%=form.getDistrictContext()%>"
                        mustContainTextbookSites="true"  
                        useSelectADistrict="true" 
                        onChangeAction="submitDropDownDistrict()" 
                        name="<%= TransferForm.FIELD_DISTRICT_CONTEXT %>" />
                    </td>
                </tr>
                
                <%if(!StringHelper.isEmpty(form.getDistrictContext()) 
                    && !SelectDistrictTag.SELECT_A_DISTRICT_TEXT.equals(form.getDistrictContext()) 
                    && !SelectDistrictTag.BLANK_SITE.equals(form.getDistrictContext())                   
                 ){%>
                <tr>
                    <td class="ColRowBold tdAlignRight">&nbsp;</td>
                    <td colspan="2">
                        <base:selectSite 
                        useSelectASite="true"
                        name="<%= TransferForm.FIELD_TO_SITEID %>" 
                        selectedSiteID="<%= String.valueOf(form.getToSiteID()) %>" 
                        mode="<%=SelectSiteTag.MODE_GROUP_BY_SITE_TYPE_TEXTBOOK_ONLY %>"
                        includeLibrarySites="false"
                        includeTextbookSites="true"
                        includeMediaSites="false"
                        contextName="<%=form.getDistrictContext()%>"
                        includeAssetSites="false"
                        />
                     </td>   
                </tr>
                <%} %>
            </logic:notEqual>
                
                <tr>
                    <td class="ColRowBold tdAlignRight">Transfer</td>
                    <td colspan="2" class="ColRowBold">
                    
                    
                    
                        <% if (form.isShowTransferByDropdown(false)) { %>
                            <html:select property="<%=TransferForm.FIELD_TRANSFER_BY%>" onchange="submitDropDownMode()"
                                ><html:option value='<%= "" +TransferForm.TRANSFER_BY_BARCODE%>'>by Barcode</html:option>
                                 <html:option value='<%= "" +TransferForm.TRANSFER_BY_LIST%>'>from List</html:option>
                                 <html:option value='<%= "" +TransferForm.TRANSFER_BY_FILE%>'>from Transfer File</html:option>
                                <c:if test = "<%= form.getCollectionType() == CollectionType.ASSET %>" >                               
                                    <html:option value = '<%= "" + TransferForm.TRANSFER_BY_COPY_COUNT %>'>by Item Count</html:option>
                                </c:if>
                                <c:if test = "<%= form.getCollectionType() == CollectionType.TEXTBOOK %>" >                               
                                    <html:option value = '<%= "" + TransferForm.TRANSFER_BY_COPY_COUNT %>'>by Copy Count</html:option>
                                </c:if>
                            </html:select>
                            &nbsp;
                            <logic:equal name="<%=TransferForm.FORM_NAME%>" property="<%=TransferForm.FIELD_TRANSFER_BY%>" value='<%= "" +TransferForm.TRANSFER_BY_LIST%>'>
                               <base:genericButton alt="Pick Titles" absbottom="true" src="/buttons/large/picktitles.gif" name="<%=TransferForm.BUTTON_GO_RESOURCE_LIST%>"/>
                            </logic:equal>
                        <logic:notEqual name="<%=TransferForm.FORM_NAME%>" property="<%=TransferForm.FIELD_TRANSFER_BY%>" value='<%= "" +TransferForm.TRANSFER_BY_LIST%>'>
                            <html:hidden name="<%=TransferForm.FORM_NAME%>" property="<%=TransferForm.FIELD_SELECTED_LIST_ID%>"/>
                        </logic:notEqual>
                    <% } else { %>
                        <html:hidden property="<%=TransferForm.FIELD_TRANSFER_BY%>" value='<%= "" +TransferForm.TRANSFER_BY_BARCODE%>'/>
                        by Barcode
                    <% } %>
                </td>
            </tr>
            <logic:equal name = "<%=TransferForm.FORM_NAME%>" property="<%=TransferForm.FIELD_COLLECTION_TYPE%>" value='<%=CollectionType.TEXTBOOK + ""%>'>    
                <logic:notEqual name = "<%=TransferForm.FORM_NAME%>" property="<%=TransferForm.FIELD_TRANSFER_BY%>" value='<%="" + TransferForm.TRANSFER_BY_FILE%>'>
                    <tr>
                        <td class="ColRowBold tdAlignRight">Order #</td>
                    <td><html:text property = "<%=TransferForm.FIELD_ORDERNUM %>" size = "25" maxlength = "20"/></td>
                    </tr>
                </logic:notEqual>
            </logic:equal>             
              
            <%
            if(form.getTransferReturnList() != null && form.getTransferReturnList().size() > 0 ){
            %>
                <bean:define id="transferReturnList" name="cataloging_servlet_TransferForm" property="transferReturnList" type="ArrayList"/>
            <logic:equal name="<%=TransferForm.FORM_NAME%>" property="<%=TransferForm.FIELD_TRANSFER_BY%>" value='<%= "" +TransferForm.TRANSFER_BY_LIST%>' >
                <tr>
                    <td>
                    &nbsp;
                    </td>
                    <td>
                        <table id="<%=TransferForm.TABLE_RESOURCE_LIST %>" width="100%"  border="0" cellpadding="2" cellspacing="0">
                            <tr>
                                <td class="SmallColHeading">Title</td>
                                <td class="SmallColHeading">Quantity</td>
                             </tr>
                            <logic:iterate name="<%=TransferForm.FORM_NAME%>" indexId="flipper" id="row" property="transferReturnList" type="com.follett.fsc.destiny.client.cataloging.data.StateTransferReturnVO">
                                <base:flipper key="transfer">
                                    <td class="ColRow"><%= ResponseUtils.filter(row.getBibTitle())  %></td>
                                    <td class="ColRow"><%= row.getBibCount()  %></td>
                                 </base:flipper>
                             </logic:iterate>
                         </table>
                     </td>
             </logic:equal>
            <%
            }
            %> 
                <tr>
                    <td colspan="3">
                    <base:imageLine height="1" width="100%"/>
                    </td>
                </tr>

                <logic:equal name="<%=TransferForm.FORM_NAME%>" property="<%=TransferForm.FIELD_TRANSFER_BY%>" value='<%= "" +TransferForm.TRANSFER_BY_BARCODE%>'>
                    <tr>
                    <td>&nbsp;</td>
                    <td colspan="2">
                       <base:barcodeList barcodeType="<%=Barcode.BARCODETYPE_COPY%>"
                           formName="<%=TransferForm.FORM_NAME%>"/>
                    </td>
                    </tr>
    
                    <tr>
                        <td colspan="3">
                        <base:imageLine height="1" width="100%"/>
                        </td>
                    </tr>
                </logic:equal>
                <logic:equal name="<%=TransferForm.FORM_NAME%>" property="<%=TransferForm.FIELD_TRANSFER_BY%>" value='<%= "" +TransferForm.TRANSFER_BY_COPY_COUNT%>'>
                    <logic:equal name="<%=TransferForm.FORM_NAME%>" property="<%=TransferForm.PARAM_DISPLAY_TITLE_SEARCH%>" value="true">
                      
                           <tr>
                                <td class="ColRowBold" colspan="4">Find by
                                     <html:select property="<%=TransferForm.FIELD_SEARCH_BY%>" onchange="clearSearchField()">
                                         <html:option value='<%= "" +TransferForm.SEARCH_BY_TITLE%>'>Textbook title</html:option>
                                         <html:option value='<%= "" +TransferForm.SEARCH_BY_ISBN%>'>ISBN</html:option>
                                         <html:option value='<%= "" +TransferForm.SEARCH_BY_STATE_ID%>'>State/Textbook ID</html:option>
                                    </html:select>
                                        <html:text onkeypress="return trapEnterKey(event, 0);" maxlength = "255" size = "20" property = "<%= TransferForm.FIELD_SEARCH_CRITERIA %>" ></html:text>&nbsp;
                                        <base:goButton absbottom="true" />
                                </td>
                            </tr> 

                        
                    </logic:equal>
                    <logic:equal name="<%=TransferForm.FORM_NAME%>" property="<%=TransferForm.PARAM_DISPLAY_TITLE_SEARCH%>" value="false">
                        <tr>
                            <td class="ColRowBold" colspan="3" align="center">Select a site from which to transfer</td>
                        </tr> 
                    </logic:equal>
                    <tr>
                        <c:if test = "<%= !StringHelper.isEmptyOrWhitespace(form.getSearchCriteria()) %>">
                            <td class = "ColRowBold" colspan="2">Searched for "<%= form.getSearchCriteria() %>"</td>
                        </c:if>
                        <c:if test = "<%= StringHelper.isEmptyOrWhitespace(form.getSearchCriteria()) %>">
                            <td class = "ColRowBold" colspan = "2">&nbsp;</td>                        
                        </c:if>
                        <td class="tdAlignRight"><base:link page='<%= form.buildPrinterFriendlyLink("/cataloging/servlet/handletransferform.do") %>' target="printerFriendly" id="<%=GenericForm.ID_PRINTER_FRIENDLY %>"><base:image src='/buttons/small/printerfriendly.gif' alt="Printer Friendly" align="absbottom"/></base:link></td>
                    </tr>
                    <tr>
                        <c:if test = "<%= form.getCurrentlySelectedTitles().size() > 0 %>">
                            <td class="SmallColHeading" colspan="2">Titles currently selected: <%= form.getCurrentlySelectedTitles().size()%></td>
                        </c:if>
                        <c:if test = "<%= form.getCurrentlySelectedTitles().size() == 0 %>">
                            <td colspan = "2">&nbsp;</td>
                        </c:if>
                        <td class="ColRowBold tdAlignRight">
                                <base:genericShowHideButton src="/buttons/large/transfercopies.gif" 
                                    name="<%= TransferForm.BUTTON_TRANSFER %>" 
                                    alt="<%= TransferForm.ALT_SUBMIT_TEXT %>"
                                    elementID="transferCopies3"/>   
                        </td>
                    </tr>                   
                    <c:if test = "<%= form.getFoundTitles().size() > 0 %>">   
                            <tr>
                                <td class = "SmallColHeading tdAlignRight" colspan = "3" nowrap="nowrap"><%= form.buildPageLinks() %></td>
                            </tr>             
                    </c:if>
                    <tr>
                        <td colspan = "3">
                            <% List<TransferSearchRecord> list = form.getFoundTitles();
                             if (!list.isEmpty()) { %>
                            <table id = "<%= TransferForm.TABLE_TITLE_SEARCH_RESULTS %>" border="0" cellpadding="4" cellspacing="0" width = "100%">
                                <tr>
                                    <td class = "SmallColHeading">Title</td>
                                    <td align = "center" class = "SmallColHeading">Available to<br/>Transfer</td>
                                    <td align = "center" class = "SmallColHeading"># to<br/>Transfer</td>
                                    <td>&nbsp;</td>
                                </tr>
                                <% 
                                    Iterator it = list.iterator();
                                    boolean firstRow = true;
                                    while (it.hasNext()) {
                                        out.print(form.formatTitleInfo((TransferSearchRecord)it.next(), false, firstRow));
                                        firstRow = false;
                                    }
                                %>
                                <tr>
                                    <td colspan = "3">&nbsp;</td>
                                    <td class="SmallColHeading tdAlignRight"  nowrap = "nowrap"><%= form.buildPageLinks() %></td>
                                </tr>
                            </table>
                            <% } %>
                        </td>                            
                    </tr>
                     <tr>
                        <td colspan = "3">
                            <%
                                List<TransferSearchRecord> list2 = form.getCurrentlySelectedTitles();
                            
                            
                                if (list2.size() > 0) {
                            %>
                            <table id = "<%= TransferForm.TABLE_TITLE_CURRENTLY_SELECTED %>" border="0" cellpadding="4" cellspacing="0" width = "100%">
                                <tr>
                                    <td background="/images/icons/general/thickline.gif" nowrap width='100%' colspan = "4">&nbsp;&nbsp;<span class = "SectionHeader" >&nbsp;&nbsp;Currently Selected&nbsp;&nbsp;</span></td>
                                </tr>
                                <tr>
                                    <td class = "SmallColHeading">Title</td>
                                    <td align = "center" class = "SmallColHeading">Available to<br/>Transfer</td>
                                    <td align = "center" class = "SmallColHeading"># to<br/>Transfer</td>
                                    <td>&nbsp;</td>
                                </tr>
                                <% 
                                    Iterator it2 = list2.iterator();
                                    boolean firstRow = true;
                                    while (it2.hasNext()) {
                                        out.print(form.formatTitleInfo((TransferSearchRecord)it2.next(), true, firstRow));
                                        firstRow = false;
                                    }
                                %>
                            </table>
                            <% } %>
                        </td>
                     </tr>    
                </logic:equal>
                <logic:equal name="<%=TransferForm.FORM_NAME%>" property="<%=TransferForm.FIELD_TRANSFER_BY%>" value='<%= "" +TransferForm.TRANSFER_BY_FILE%>'>
                    <tr>
                        <td colspan="3" class="ColRowBold">Select a transfer file   
                                <html:file property="<%=TransferForm.FIELD_UPLOAD_FILE%>" size="40"/>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="3" class="ColRowBold" align="center">
                            <%= GenericForm.getLastBackupDisplayMsg(true)%>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="3">
                        <base:imageLine height="1" width="100%"/>
                        </td>
                    </tr>
                </logic:equal>
                <% if(!form.isAssetProductType() && form.getTransferBy() == TransferForm.TRANSFER_BY_FILE){ %>
                <tr>
                        <td colspan="3" align="center" class="ColRowBold">
                            Upon transfer, ownership will be immediately changed to the receiving sites. 
                        </td>
                    </tr>
                <%} else  if(form.getTransferBy() == TransferForm.TRANSFER_BY_BARCODE
                            || form.getTransferBy() == TransferForm.TRANSFER_BY_COPY_COUNT){ %>
                    <tr>
                        <td colspan="3" align="center" class="ColRowBold">
                            Upon transfer, ownership will be immediately changed to the receiving site. 
                        </td>
                    </tr>
                <%} %>
                <tr>
                    <td colspan="3" align="center" class="ColRowBold">
                        <%
                        if(form.getTransferBy() == TransferForm.TRANSFER_BY_LIST){
                            
                            if(form.getTransferReturnList() != null && form.getTransferReturnList().size() > 0 ){
                        
                        %>
                        <logic:equal name="<%= TransferForm.FORM_NAME %>" property="assetProductType" value="false" scope="request">                        
                                <base:genericShowHideButton src="/buttons/large/transfercopies.gif" 
                                    name="<%= TransferForm.BUTTON_TRANSFER %>" 
                                    alt="<%= TransferForm.ALT_SUBMIT_TEXT %>"
                                    elementID="transferCopies4"/>
                        </logic:equal>
                        <%}
                        }else{%>
                         <logic:equal name="<%= TransferForm.FORM_NAME %>" property="assetProductType" value="false" scope="request">                        
                            <base:genericShowHideButton src="/buttons/large/transfercopies.gif" 
                                name="<%= TransferForm.BUTTON_TRANSFER %>" 
                                alt="<%= TransferForm.ALT_SUBMIT_TEXT %>"
                                elementID="transferCopies5"/>       
                        </logic:equal>
                       <% } %> 
                    </td>
                </tr>
            </table>
            </td>
        </tr>
        </base:outlinedTableAndTabsWithinThere>
      
<%} 
}
%>    
</base:form>

<script language="JavaScript" type="text/javascript">
      <!--
        function submitDropDownMode() {
                document.<%=TransferForm.FORM_NAME%>.<%=TransferForm.BUTTON_CHANGE_SUBMIT%>.value = '<%= TransferForm.SUBMIT_MODE_CHANGED%>';
                document.<%=TransferForm.FORM_NAME%>.submit();
        }
        function submitDropDownSite() {
                document.<%=TransferForm.FORM_NAME%>.<%=TransferForm.BUTTON_CHANGE_SUBMIT%>.value = '<%= TransferForm.SUBMIT_SITE_CHANGED%>';
                document.<%=TransferForm.FORM_NAME%>.submit();
        }        
        function submitDropDownDistrict() {
                document.<%=TransferForm.FORM_NAME%>.<%=TransferForm.BUTTON_CHANGE_SUBMIT%>.value = '<%= TransferForm.SUBMIT_DISTRICT_CHANGED%>';
                document.<%=TransferForm.FORM_NAME%>.submit();
        }
        
        function trapEnterKey(e, fld) {
          var whichCode = (window.Event) ? e.which : e.keyCode;
          if (whichCode == 13) {
             document.<%=TransferForm.FORM_NAME%>.<%=TransferForm.PARAM_ENTER_PRESSED%>.value = "true";
             document.<%=TransferForm.FORM_NAME%>.<%=TransferForm.PARAM_WHERE_WAS_ENTER%>.value=fld;                       
          }
          return whichCode;
        }
        
        function clearSearchField(){
        	document.<%=TransferForm.FORM_NAME%>.<%=TransferForm.FIELD_SEARCH_CRITERIA%>.value = "";
        }
        
        function submitOnTemplateChange() {
            document.<%=TransferForm.FORM_NAME%>.<%=TransferForm.FIELD_ASSET_TEMPLATE_TYPE_CHANGED%>.value = "true";
            document.<%=TransferForm.FORM_NAME%>.submit();
        }
      // -->
    </script>


                    
<c:if test = "<%= form.getTransferBy() == TransferForm.TRANSFER_BY_COPY_COUNT && !form.isPrinterFriendly() && form.isDisplayTitleSearch()%>">
<script language = "JavaScript">
<!--
    document.<%=TransferForm.FORM_NAME%>.<%= TransferForm.FIELD_SEARCH_CRITERIA %>.focus();
-->
</script>
</c:if>
