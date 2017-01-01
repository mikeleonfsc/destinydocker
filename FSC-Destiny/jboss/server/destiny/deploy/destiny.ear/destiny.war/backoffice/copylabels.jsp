<%@page import="com.follett.fsc.destiny.client.common.jsptag.ResourceOrTextbookDropDownTag"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.CopyLabelForm" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.BaseCopyLabelForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.ConfigSiteSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.data.CopyLabelJobParams" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.session.common.churchill.DestinyJob" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.BaseLabelForm"%>
<%@ page import="com.follett.fsc.common.TimestampHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>

<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.BaseLabelForm"%>

<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.BarcodeListForm"%>
<%@page import="com.follett.fsc.destiny.util.Barcode"%>
<bean:define id="stocks" name="<%= CopyLabelForm.FORM_NAME %>" property="stockList"/>
<bean:define id="locDeptList" name="<%= CopyLabelForm.FORM_NAME %>" property="<%=CopyLabelForm.PARAM_LOCATION_DEPARTMENT_LIST %>"/>
<bean:define id="bibTypeList" name="<%=CopyLabelForm.FORM_NAME%>" property="<%=CopyLabelForm.FIELD_BIB_TYPE_LIST%>"/>
<base:messageBox strutsErrors="true"/>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    CopyLabelForm form = (CopyLabelForm)request.getAttribute("backoffice_servlet_CopyLabelForm");
    boolean isInternational = UserContext.getMyContextLocaleHelper().isInternationalProduct();
    String selectedTab = "";
    if (form.isUnusedBarcodeMode()) {
        selectedTab = CopyLabelForm.ID_TAB_UNUSED_BARCODES;
    } else {
        selectedTab = CopyLabelForm.ID_TAB_USED_BARCODES;
    }
%>

<base:form action="/backoffice/servlet/handlecopylabelsform.do" enctype="multipart/form-data">
<html:hidden property="<%=CopyLabelForm.FIELD_SITE_ID_CHANGED%>"/>
<html:hidden property="<%=CopyLabelForm.FIELD_CHANGED_SYMBOLOGY%>"/>
<html:hidden property="singleIDToPrint"/>
<html:hidden property="unusedBarcodeMode"/>
<html:hidden property="collectionType"/>
<html:hidden property="displayOptionForResource"/>

<% if (!form.isDistrictUser()) { %>
	<html:hidden property="<%=CopyLabelForm.FIELD_SITE_ID%>"/>
<% } %>

<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=BaseCopyLabelForm.BUTTON_TRAP_ENTER%>">

    <logic:equal name="<%= CopyLabelForm.FORM_NAME %>" property="showConfirmationMessage" value="true">
        <html:hidden property="showConfirmationMessage" />
        <%                         
            String[] messageText = new String[]{
                MessageHelper.formatMessage("copylabels_AreYouSureYouWantToGenerate")
            };                            
        %>       
       <base:confirmBox 
                showWarningIcon="true" 
                header='<%= MessageHelper.formatMessage("copylabels_LabelForUnusedBarcode", form.getNumberOfBarcodes()) %>' 
                messageText="<%=messageText%>" 
                yesName="<%=CopyLabelForm.BUTTON_CONFIRM_YES%>"
                noName="<%=CopyLabelForm.BUTTON_CONFIRM_NO%>"
       />                                
    </logic:equal>

<base:outlinedTableAndTabsWithinThere tabs="<%= form.getTabs() %>" selectedTab="<%= selectedTab %>" id="<%=CopyLabelForm.TABLE_COPY_LABEL%>" borderColor='#C0C0C0' width="100%">
    <tr>
        <td colspan="2" class="TableHeading" nowrap>
            <%= form.printPageHeader() %>
        </td>
    </tr>
    
    <c:choose>
    <c:when test="<%=((form.getCollectionType() == CollectionType.ASSET) && (!form.isUnusedBarcodeMode()))%>">
        <tr>
            <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("copylabels_For") %></td>
            <td>
                <base:resourceOrTextbook displayOptions="<%=form.getDisplayOptionForResourceFor() %>" submitOnChange="<%=!form.isUnusedBarcodeMode() %>" selectedOption="<%=form.getResourcesOrTextbooks()%>" formName="<%=form.FORM_NAME %>"/>
            </td>
        </tr>
   
     </c:when>
       <c:otherwise>
          <html:hidden property="<%=CopyLabelForm.FIELD_RESOURCES_OR_TEXTBOOKS%>"/>
       </c:otherwise>
   </c:choose>     
<logic:equal name="<%=CopyLabelForm.FORM_NAME %>" property="districtUser" value="true" scope="request" >
    <tr>
        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("copylabels_At") %></td>
        <td>
            <% if (store.isStateContext()) { %>
                    <span class="ColRowBold"><%= MessageHelper.formatMessage("copylabels_StateTextbookOffice") %></span>
                    <html:hidden property="<%=CopyLabelForm.FIELD_SITE_ID%>" value="<%=ConfigSiteSpecs.SITE_ID_MY_DISTRICT.toString() %>"/>
                    
            <% } else { %>
                <logic:equal name="<%=CopyLabelForm.FORM_NAME %>" property="unusedBarcodeMode" value="true" scope="request" >
                        <base:selectSite 
                            name='<%= BaseCopyLabelForm.FIELD_SITE_ID %>' 
                            selectedSiteID='<%=form.getSiteID().toString() %>' 
                            includeAllLibraries='false' 
                            submitOnChange="true"
                            includeLibrarySites="<%=form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_LIBRARY %>"
                        	includeTextbookSites="<%=form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK %>"
                        	includeMediaSites="false"
                        	includeAssetSites="<%=form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_ASSET %>"
                            />
                </logic:equal>
                <logic:equal name="<%=CopyLabelForm.FORM_NAME %>" property="unusedBarcodeMode" value="false" scope="request" >
                        <base:selectSite 
                        	onChangeAction="submitTheForm_ResetScreen()"
                            name='<%= BaseCopyLabelForm.FIELD_SITE_ID %>' 
                            selectedSiteID='<%=form.getSiteID().toString() %>' 
                            includeAllLibraries='true' 
                            includeLibrarySites="<%=form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_LIBRARY %>"
                        	includeTextbookSites="<%=form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK %>"
                        	includeMediaSites="false"
                        	includeAssetSites="<%=form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_ASSET %>"
                            />
                </logic:equal>
            <% } %>
        </td>
    </tr>

    <% if (!store.isStateContext()) { %>
        <logic:equal name="<%=CopyLabelForm.FORM_NAME %>" property="unusedBarcodeMode" value="false" scope="request" >
            <tr>
                <td>
                    &nbsp;
                </td>
                <td class="Instruction"><%= MessageHelper.formatMessage("copylabels_IfYouDoNotSelectASpecificSiteYourOutputWillBeLimit") %></td>
            </tr>
        </logic:equal>
    <%} %>
</logic:equal>


    <c:if test="<%=form.getCollectionType() == CollectionType.LIBRARY%>">
            <tr>
                <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("copylabels_LabelsForEachBarcode") %></td>
                <td class="ColRow">
                   <html:text property="<%= CopyLabelForm.FIELD_BARCODE_COUNT %>" maxlength="2" size="2"/>
                </td>    
            </tr>
    
    </c:if>

<logic:equal name="<%=CopyLabelForm.FORM_NAME %>" property="unusedBarcodeMode" value="false" scope="request" >
    <c:if test="<%=form.getCollectionType() == CollectionType.LIBRARY%>">
        <c:if test="<%=form.getSiteID().longValue()==0 && form.isDistrictUser()%>">
            <tr>
                <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("copylabels_GroupBy") %></td>
                <td class="ColRow">
                    <html:checkbox property="<%=CopyLabelForm.FIELD_GROUP_BY_SITE_NAME%>"/>&nbsp;<%= MessageHelper.formatMessage("copylabels_Site") %></td>
            </tr>    
        </c:if> 
        <c:if test="<%=form.getSiteID().longValue()!=0 && form.isDistrictUser()%>">
            <html:hidden property="<%= CopyLabelForm.FIELD_GROUP_BY_SITE_NAME %>"/>
        </c:if> 
        <tr>
            <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("copylabels_SortBy") %></td>
            <td class="ColRow">
                <html:select property="<%=CopyLabelForm.FIELD_SELECT_SORT_BY%>">
                <% if (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_LIBRARY && !store.isMediaBookingUser()) { %>
                        <html:option value='<%="" + CopyLabelJobParams.SORT_BY_BARCODE%>'><%= MessageHelper.formatMessage("copylabels_Barcode") %></html:option>
                <%} %>
                    <html:option value='<%="" + CopyLabelJobParams.SORT_BY_AUTHOR_TITLE%>'><%= MessageHelper.formatMessage("copylabels_AuthorTitle") %></html:option>
                    <html:option value='<%="" + CopyLabelJobParams.SORT_BY_CALL_NUMBER_AUTHOR%>' ><%= MessageHelper.formatMessage("copylabels_CallNumberAuthor") %></html:option>
                    <html:option value='<%="" + CopyLabelJobParams.SORT_BY_TITLE_AUTHOR%>'><%= MessageHelper.formatMessage("copylabels_TitleAuthor") %></html:option>
                    <html:option value='<%="" + CopyLabelJobParams.SORT_BY_DATE_COPIES_ADDED%>'><%= MessageHelper.formatMessage("copylabels_DateTimeCopiesAdded") %></html:option>
                </html:select>
            </td>    
        </tr>
    </c:if>

    <tr>
        
        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("copylabels_SelectBy") %></td>
        
        <td class="ColRow">
            <html:select onchange="javascript:submitTheForm()" property="<%=CopyLabelForm.FIELD_SELECT_BASED_ON%>">
                <% if(form.canViewBooklist() ) { %> 
                <html:option value='<%="" + CopyLabelJobParams.BASED_ON_MYLIST%>'><%= MessageHelper.formatMessage("copylabels_List") %></html:option>
                <% } %>
                <c:if test="<%= form.getSiteID() != null && (form.getCollectionType() == CollectionType.LIBRARY || !DestinyJob.DISTRICT_SITE_ID.equals(form.getSiteID())) %>">
                    <c:choose>
                        <c:when test="<%=form.getCollectionType() == CollectionType.ASSET%>">
                            <html:option value='<%="" + CopyLabelJobParams.BASED_ON_CATEGORY%>'><%= MessageHelper.formatMessage("copylabels_ItemCategory") %></html:option>
                        </c:when>
                        <c:otherwise>
                            <html:option value='<%="" + CopyLabelJobParams.BASED_ON_CATEGORY%>'><%= MessageHelper.formatMessage("copylabels_CopyCategory") %></html:option>
                        </c:otherwise>
                    </c:choose>
                </c:if>
                <c:if test="<%=! ConfigSiteSpecs.SITE_ID_MY_DISTRICT.equals(form.getSiteID()) %>">
	                <html:option value='<%="" + CopyLabelJobParams.BASED_ON_BARCODE_LIST%>'><%= MessageHelper.formatMessage("copylabels_BarcodeList") %></html:option>
                </c:if>
                <c:if test="<%=! (ConfigSiteSpecs.SITE_ID_MY_DISTRICT.equals(form.getSiteID()) || form.getCollectionType() != CollectionType.LIBRARY) %>">
                    <html:option value='<%="" + CopyLabelJobParams.BASED_ON_BARCODE_RANGE%>'><%=MessageHelper.formatMessage("copylabels_BarcodeRange")%></html:option>
                </c:if>
                <c:choose>
                    <c:when test="<%=form.getCollectionType() == CollectionType.ASSET%>">
                        <html:option value='<%="" + CopyLabelJobParams.BASED_ON_DATE_ADDED%>'><%= MessageHelper.formatMessage("copylabels_DateTimeItemsAdded") %></html:option>
                    </c:when>
                    <c:otherwise>
                        <html:option value='<%="" + CopyLabelJobParams.BASED_ON_DATE_ADDED%>'><%= MessageHelper.formatMessage("copylabels_DateTimeCopiesAdded") %></html:option>
                    </c:otherwise>
                </c:choose>
                <% if (form.getCollectionType() == CollectionType.ASSET  && form.getResourcesOrTextbooks() == ResourceOrTextbookDropDownTag.OPTION_RESOURCES_NOT_TEXTBOOKS) { %>
	                <% if (!form.getSiteID().equals(ConfigSiteSpecs.SITE_ID_MY_DISTRICT)) { %>
	                    <html:option value='<%="" + CopyLabelJobParams.BASED_ON_DEPARTMENT%>'><%= MessageHelper.formatMessage("copylabels_Department") %></html:option>
		                <html:option value='<%="" + CopyLabelJobParams.BASED_ON_HOME_LOCATION%>'><%= MessageHelper.formatMessage("copylabels_HomeLocation") %></html:option>
		            <% } %>
                <% } %>
            </html:select>
                <% if (form.getCollectionType() == CollectionType.ASSET && form.getResourcesOrTextbooks() == ResourceOrTextbookDropDownTag.OPTION_RESOURCES_NOT_TEXTBOOKS && 
                    (form.getSelectOptionBasedOn() == CopyLabelJobParams.BASED_ON_DEPARTMENT || form.getSelectOptionBasedOn() == CopyLabelJobParams.BASED_ON_HOME_LOCATION)) { %>
		            &nbsp;
                    <html:select property="<%= CopyLabelForm.FIELD_LOCATION_DEPT_SELECT %>">
               			<html:options collection="locDeptList" property="longID"
                              labelProperty="stringDesc"/>
		            </html:select> 
                <% } %>
           
        </td>  
    </tr>
    
    <c:choose>
        <c:when test="<%=form.getSelectOptionBasedOn() == CopyLabelJobParams.BASED_ON_CATEGORY %>">
            <base:imageSpacer width="12" height="1"/>
            <tr>
                <td>&nbsp;</td>
                <td nowrap>
                 <%-- PUT MY CATEGORY COMBO HERE IF selector is by myCategory --%>
                <base:categorySelect name="<%= CopyLabelForm.FIELD_SELECTED_CATEGORYID%>" siteID="<%= form.getSiteID() %>" 
                 collectionType="<%=form.getCollectionType()%>" selectedCategoryID="<%=form.getSelectedCategoryID()%>"
                 showAllOptionText="false" showDistrictCategories="<%=store.isDistrictUser() %>" />
                </td>
            </tr>
        </c:when>
        <c:when test="<%=form.getSelectOptionBasedOn() == CopyLabelJobParams.BASED_ON_BARCODE_RANGE %>">
            <tr>
                <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("copylabels_Range")%></td>
                <td class="ColRow" nowrap="nowrap">
                    <html:text property="<%= CopyLabelForm.FIELD_RANGE_FROM%>" maxlength="<%=String.valueOf(Barcode.MAX_LENGTH_SUPPORTED_SYMBOLOGIES)%>"/>
                    <%=MessageHelper.formatMessage("copylabels_To")%>
                    <html:text property="<%= CopyLabelForm.FIELD_RANGE_TO%>" maxlength="<%=String.valueOf(Barcode.MAX_LENGTH_SUPPORTED_SYMBOLOGIES)%>"/>
                    &nbsp;
                    <base:link id="<%=CopyLabelForm.LINK_CHANGE_SYMBOLOGY%>" permission="<%= Permission.BACK_OFFICE_CHANGE_SITE_PREFERENCES %>"    
                    page="javascript:submitTheForm_ChangeSymbology()" showTextAlways="true" appendCollectionType="false">
                        <%=form.getSymbologyText()%>
                    </base:link>
                </td>
            </tr>
        </c:when>
        <c:otherwise>
            <input type="hidden" name="<%= CopyLabelForm.FIELD_SELECTED_CATEGORYID%>" value="<%=form.getSelectedCategoryID()%>"/>
        </c:otherwise>
    </c:choose>
      
    <logic:equal name="<%= CopyLabelForm.FORM_NAME %>" property="<%= CopyLabelForm.SHOW_BOOKLIST_BUTTON %>" value="true">
        <base:imageSpacer width="12" height="1"/>
        <tr>
            <td>&nbsp;</td>
            <td nowrap>
             <%-- PUT MY LIST COMBO HERE IF selector is by mylist --%>
            <% if (form.getSelectOptionBasedOn() == CopyLabelJobParams.BASED_ON_MYLIST) { %>
                <base:myListSelect name="<%= CopyLabelForm.FIELD_SELECTED_LISTID%>" prompt="" publicList="false" selectedMyListID="<%=form.getSelectedListID()%>"/>
            <% } else { %>
            <% } %>
                <base:genericButton name="<%=CopyLabelForm.BUTTON_VIEW_LIST%>" src="/buttons/large/viewlist.gif" 
                    alt='<%= MessageHelper.formatMessage("viewList") %>' absbottom="true"></base:genericButton>
            </td>
        </tr>
    </logic:equal>
    <logic:equal name="<%= CopyLabelForm.FORM_NAME %>" property="<%= CopyLabelForm.SHOW_BOOKLIST_BUTTON %>" value="false">
        <input type="hidden" name="<%= CopyLabelForm.FIELD_SELECTED_LISTID%>" value="<%=form.getSelectedListID()%>"/>
    </logic:equal>
    
    <logic:equal name="<%= CopyLabelForm.FORM_NAME %>" property="<%= CopyLabelForm.SHOW_BARCODE_LISTS %>" value="true">
      <tr>
               <td>&nbsp;</td>
               <td>
                  <base:barcodeList  
                      formName="<%=CopyLabelForm.FORM_NAME%>"/>
               </td>
            </tr>
     </logic:equal>
     <logic:equal name="<%= CopyLabelForm.FORM_NAME %>" property="<%= CopyLabelForm.SHOW_BARCODE_LISTS %>" value="false">
             <tr>
               <td class="ColRowBold tdAlignRight">
               <c:choose>
                    <c:when test="<%=form.getCollectionType() == CollectionType.ASSET%>">
                        <%=MessageHelper.formatMessage("copylabels_ItemsAdded") %>
                    </c:when>
                    <c:otherwise>
                        <%=MessageHelper.formatMessage("copylabels_CopiesAdded") %>
                    </c:otherwise>
                </c:choose>
                
                </td>
                 <td>
                    <table>
                        <tr>
                            <td colspan="4" class="ColRow tdAlignRight"><%= MessageHelper.formatMessage("defaulthours_HoursNote", TimestampHelper.addMinutes(TimestampHelper.getNow(true), 481), TimestampHelper.addMinutes(TimestampHelper.getNow(true), 961)) %></td>
                        </tr>                    
                    </table>
                    <table id="<%=BaseLabelForm.TABLE_DATE_COPIES_ADDED %>">
                        <tr>
                            <td class="ColRow tdAlignRight"><%= MessageHelper.formatMessage("copylabels_FromDate") %></td>
                            <td class="ColRow">
                                <base:date 
                                    buttonName = "<%= BaseCopyLabelForm.BUTTON_FROM_DATE_ADDED %>"
                                    fieldName = "<%= BaseCopyLabelForm.FIELD_FROM_DATE_ADDED %>"
                                    dateValue = "<%=form.getFromDateAdded()%>"
                                    altText = '<%= MessageHelper.formatMessage("copylabels_ChangeDateAdded")%>'
                                 />
                            </td>
                            <td class="ColRow tdAlignRight">
                                <%= MessageHelper.formatMessage("copylabels_FromTime") %>
                            </td>
                            <td class="ColRow">
                                <base:time 
                                    textFieldName="<%=BaseLabelForm.FIELD_FROM_TIME%>" 
                                    timeValue="<%=form.getFromTime()%>" 
                                />
                            </td>
                         </tr>
                        <tr>
                            <td class="ColRow tdAlignRight"><%= MessageHelper.formatMessage("copylabels_ToDate") %></td>
                            <td class="ColRow">
                                <base:date 
                                    buttonName = "<%= BaseCopyLabelForm.BUTTON_TO_DATE_ADDED %>"
                                    fieldName = "<%= BaseCopyLabelForm.FIELD_TO_DATE_ADDED %>"
                                    dateValue = "<%=form.getToDateAdded()%>"
                                    altText = '<%= MessageHelper.formatMessage("copylabels_ChangeDateAdded")%>'
                                 />
                            </td>
                            <td class="ColRow tdAlignRight">
                                <%= MessageHelper.formatMessage("copylabels_ToTime") %>
                            </td>
                            <td class="ColRow">
                                <base:time 
                                    textFieldName="<%=BaseLabelForm.FIELD_TO_TIME%>" 
                                    timeValue="<%=form.getToTime()%>" 
                                />
                            </td>
                         </tr>
                     </table>
                </td>
            </tr>
    </logic:equal>   
    
    <c:if test="<%=form.getCollectionType() == CollectionType.LIBRARY%>">
         <tr>
                <td class="ColRowBold tdAlignRight" nowrap><%= MessageHelper.formatMessage("copylabels_MaterialType") %></td>
                <td class="ColRow">
                    <html:select property="<%=CopyLabelForm.FIELD_BIB_TYPE%>">
                        <html:options collection="bibTypeList" property="stringCode" labelProperty="stringDesc"/>
                    </html:select>
                </td>
        </tr>
        <c:if test="<%=!form.isMediaUser() && !form.getSiteID().equals(ConfigSiteSpecs.SITE_ID_MY_DISTRICT)%>">
            <tr>
                <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("copylabels_CirculationTypes") %></td>
                <td>
                <base:circTypesList formName="<%=CopyLabelForm.FORM_NAME%>"/>
                </td>
            </tr>
        </c:if>
    </c:if>
    
     <% if (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_LIBRARY && !store.isMediaBookingUser()) { %>
    <tr>
    
	   <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("copylabels_IncludeTemporaryCopies") %></td>
      
        <td>
        	<html:checkbox property="<%= CopyLabelForm.FIELD_INCLUDE_TEMP_COPIES %>" />
        </td>
	</tr>
        <%} %>
     <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>

</logic:equal>

<logic:equal name="<%=CopyLabelForm.FORM_NAME %>" property="unusedBarcodeMode" value="true" scope="request" >
    <tr>
        <td class="ColRowBold tdAlignRight" nowrap="nowrap"><%= MessageHelper.formatMessage("copylabels_NumberOfBarcodes") %></td>
        <td class="ColRow" nowrap="nowrap">
            <html:text property="<%= CopyLabelForm.FIELD_NUMBER_OF_BARCODES %>" maxlength="3" size="6"/>
        </td>
    </tr>

    <tr>
        <td class="ColRowBold tdAlignRight" valign="top"><%= MessageHelper.formatMessage("copylabels_StartingBarcode") %></td>
        <% String pageURL = "/backoffice/servlet/handlecopylabelsform.do?" + form.FIELD_CHANGED_SYMBOLOGY + "=true"; %>
        <td class="ColRow" valign="top">
            <html:text property="<%= CopyLabelForm.FIELD_STARTING_BARCODE %>" maxlength="14" size="17"/>
            <base:link collectionType = "<%=form.getCollectionType() %>" permissions="<%=new Permission[] {Permission.BACK_OFFICE_CHANGE_SITE_PREFERENCES, Permission.BACK_OFFICE_CHANGE_SITE_PREFERENCES_TEXTBOOK, Permission.BACK_OFFICE_CHANGE_SITE_PREFERENCES_ASSET}%>" 
            page="javascript:submitTheForm_ChangeSymbology()" showTextAlways="true" appendCollectionType="false">
                <%=form.getSymbologyText()%>
            </base:link>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("copylabels_Include") %></td>
        <td nowrap class="ColRow">
        <html:checkbox property="<%= CopyLabelForm.FIELD_SHOW_SITE_NAME %>" />
            <html:select property="<%=CopyLabelForm.FIELD_SITE_OR_DISTRICT_NAME%>">
                    <html:option value='<%="" + CopyLabelJobParams.NAME_SITE%>'><%= MessageHelper.formatMessage("copylabels_SiteName") %></html:option>
                    <html:option value='<%="" + CopyLabelJobParams.NAME_DISTRICT%>'><%= MessageHelper.formatMessage("copylabels_DistrictName") %></html:option>
            </html:select>&nbsp;<%= MessageHelper.formatMessage("copylabels_OnEachLabel") %></td>
    </tr>
</logic:equal>

<logic:equal name="<%=CopyLabelForm.FORM_NAME %>" property="unusedBarcodeMode" value="false" scope="request" >
    <tr>
        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("copylabels_IncludeTheFollowingOnEach") %></td>
        <td nowrap class="ColRow">
        <html:checkbox property="<%= CopyLabelForm.FIELD_SHOW_SITE_NAME %>" />
            <% if(store.isStateContext()){%><%= MessageHelper.formatMessage("copylabels_StateTextbookOffice") %><% } else { %>       
                <html:select property="<%=CopyLabelForm.FIELD_SITE_OR_DISTRICT_NAME%>">
                    <html:option value='<%="" + CopyLabelJobParams.NAME_SITE%>'><%= MessageHelper.formatMessage("copylabels_SiteName") %></html:option>
                    <html:option value='<%="" + CopyLabelJobParams.NAME_DISTRICT%>'><%= MessageHelper.formatMessage("copylabels_DistrictName") %></html:option>
                </html:select>
            <% } %>
	        
        </td>
    </tr>
    
    <% if ( form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_ASSET  && form.getResourcesOrTextbooks() == ResourceOrTextbookDropDownTag.OPTION_RESOURCES_NOT_TEXTBOOKS) { %>
    <tr>
        <td class="ColRow tdAlignRight">
        &nbsp;
        </td>
        <td nowrap class="ColRow">
        <html:checkbox property="<%= CopyLabelForm.FIELD_SHOW_TITLE_DESCRIPTION %>" /><%= MessageHelper.formatMessage("copylabels_AssetName") %></td>
    </tr>

    <% } else { %>    
    <tr>
        <td class="ColRow tdAlignRight">
        &nbsp;
        </td>
        <td nowrap class="ColRow">
        <html:checkbox property="<%= CopyLabelForm.FIELD_SHOW_TITLE_DESCRIPTION %>" /><%= MessageHelper.formatMessage("copylabels_Title") %></td>
    </tr>
    <tr>
        <td class="ColRow tdAlignRight">
        &nbsp;
        </td>
        <td nowrap class="ColRow">
        <html:checkbox property="<%= CopyLabelForm.FIELD_SHOW_AUTHOR %>" /><%= MessageHelper.formatMessage("copylabels_Author") %></td>
    </tr>
    <% } %>
    
    
    <% if (!store.isStateContext()) { %>
        <tr>
            <td class="ColRow tdAlignRight">
            &nbsp;
            </td>
            <td nowrap class="ColRow">
                <% if ( form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_LIBRARY ) { %>
                    <html:checkbox property="<%= CopyLabelForm.FIELD_SHOW_CALL_NUMBER %>" /><%= MessageHelper.formatMessage("copylabels_CallNumber") %><% } else { %>
                        <html:checkbox property="<%= CopyLabelForm.FIELD_SHOW_LOCATION %>" /> <%=form.getLocationLabelText()%>                                            
                <% } %>
            </td>
        </tr>
    <% } %>
</logic:equal>

    <tr>
        <td class="ColRowBold tdAlignRight"><html:radio property="<%=CopyLabelForm.FIELD_TRANSACTION_SCOPE%>" value="<%=Integer.toString(CopyLabelForm.SCOPE_CARD_STOCK)%>"/>
        <%= MessageHelper.formatMessage("copylabels_UseLabelStock") %></td>
        <td>
          <html:select property="<%= BaseCopyLabelForm.FIELD_LABEL_STOCK %>">
            <html:options collection="stocks" property="stringCode"
                          labelProperty="stringDesc"/>
          </html:select>

        </td>
    </tr>

    <tr>
        <td class="ColRowBold tdAlignRight">
        <%= MessageHelper.formatMessage("copylabels_StartOnLabel") %></td>
        <td>
        <html:text property="<%= BaseCopyLabelForm.FIELD_LABEL_START %>" maxlength="3" size="4"/>
        </td>
    </tr>


    <tr>
        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("copylabels_PrinterOffset") %></td>
        <td class="ColRow" nowrap><%= MessageHelper.formatMessage("copylabels_Horizontal") %>&nbsp;<html:text property="<%= BaseCopyLabelForm.FIELD_HORIZONTAL_OFFSET %>" maxlength="4" size="4"/>
            &nbsp;&nbsp;&nbsp;<%= MessageHelper.formatMessage("copylabels_Vertical") %>&nbsp;
            <html:text property="<%= BaseCopyLabelForm.FIELD_VERTICAL_OFFSET %>" maxlength="4" size="4"/>
        </td>
    </tr>
    <tr>
            <td class="ColRowBold tdAlignRight"><html:radio property="<%=CopyLabelForm.FIELD_TRANSACTION_SCOPE%>" value="<%=Integer.toString(CopyLabelForm.SCOPE_EXCEL)%>"/>
            <%=MessageHelper.formatMessage("patronidlabels_ExportToMicrosoftExcel") %></td>
        </tr>
<!-- don't put this html in if we reached here from add or edit copies or items --->
<%if(!form.arrivedAtViaAddOrEdit()){ %>
    <tr>
        <td colspan = "2" align="center">
            <table >
                <tr><td colspan="2" align="center" class="ColRowBold"><%=MessageHelper.formatMessage("copylabel_InAdditionToAdjustingYourPrinterOffsets")%></td></tr>
             <% if (!isInternational) { %>
                <tr><td colspan="2" align="center" class="ColRow"><%=BaseLabelForm.getMessageAligningBarcodesForAssistance()%></td></tr>
             <% } %>
            </table>
        </td>
    </tr>
<%}%> 
<logic:equal name="<%=CopyLabelForm.FORM_NAME %>" property="unusedBarcodeMode" value="true" scope="request" >
    <tr>
        <td class="SmallColRow" colspan="2"><%= MessageHelper.formatMessage("copylabels_RequiredField") %></td>
    </tr>
</logic:equal>
    <tr>
        <td colspan="2" align="center" class="ColRowBold">
        <logic:equal name="<%=CopyLabelForm.FORM_NAME %>" property="unusedBarcodeMode" value="false" scope="request" >
            <base:reportButton/>
        </logic:equal>
        <logic:equal name="<%=CopyLabelForm.FORM_NAME %>" property="unusedBarcodeMode" value="true" scope="request" >
        <% if(form.isFilterOn()) { %>
            <%= MessageHelper.formatMessage("copylabels_ThisSiteHasBarcode") %>
        <% } else { %>
            <base:reportButton/>
        <% } %>
        </logic:equal>
        </td>
    </tr>

</base:outlinedTableAndTabsWithinThere>
</base:form>

<SCRIPT LANGUAGE="javascript" TYPE="text/javascript">
<!--
    function submitTheForm_ChangeSymbology() {
        document.<%=CopyLabelForm.FORM_NAME%>.<%=CopyLabelForm.FIELD_CHANGED_SYMBOLOGY%>.value = "true";
        document.<%=CopyLabelForm.FORM_NAME%>.submit();
    }
    
    function submitTheForm_ResetScreen() {
        document.<%=CopyLabelForm.FORM_NAME%>.<%=CopyLabelForm.FIELD_SITE_ID_CHANGED%>.value = "true";
        document.<%=CopyLabelForm.FORM_NAME%>.submit();
    }
    
    function submitTheForm() {
        document.<%=CopyLabelForm.FORM_NAME%>.submit();
    }
// -->
</SCRIPT>
