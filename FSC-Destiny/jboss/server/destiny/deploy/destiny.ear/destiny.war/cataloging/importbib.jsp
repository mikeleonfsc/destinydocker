<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CopySpecs" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.QuickPickSpecs" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LookupSpecs"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>


<%@page import="com.follett.fsc.destiny.session.cataloging.ejb.TitleAEDSpecs"%>

<script type="text/javascript">
    function uncheckAuthor() {
        document.<%=ImportBibForm.FORM_NAME%>.<%=ImportBibForm.FIELD_MATCHING_IGNORE_AUTHOR%>.checked = false;
    }

    function selectStrict() {
        document.<%=ImportBibForm.FORM_NAME%>.<%=ImportBibForm.FIELD_MATCHING_RULES%>[0].checked=true;
    }
    
    function disableStrict(relaxDisabale){
        if(relaxDisabale=="disable"){
            document.<%=ImportBibForm.FORM_NAME%>.<%=ImportBibForm.FIELD_MATCHING_RULES%>[1].disabled=true;
            document.<%=ImportBibForm.FORM_NAME%>.<%=ImportBibForm.FIELD_MATCHING_RULES%>[0].checked=true;
        }
        else{
            document.<%=ImportBibForm.FORM_NAME%>.<%=ImportBibForm.FIELD_MATCHING_RULES%>[1].disabled=false;
        }
    }
</script>

<base:messageBox strutsErrors="true"/>
<c:set var="cform" value="<%=request.getAttribute(ImportBibForm.FORM_NAME)%>"/>
<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    ImportBibForm form = (ImportBibForm)request.getAttribute("cataloging_servlet_ImportBibForm");

    boolean isBarcodeFilteringEnabled = form.isFilteringOn();
    boolean isImportReplacementLocked = form.isImportReplacementLocked();
    String autoAssignSite = form.getAutoAssignSite();
%>

<bean:define id="circTypesID" name="<%= ImportBibForm.FORM_NAME %>" property="circTypes"/>

<script language="JavaScript" type="text/javascript">
 <!--
    function submitDropDown() {
        <% if(form.getCollectionType() == CollectionType.LIBRARY) { %>
            document.<%=ImportBibForm.FORM_NAME%>.<%=ImportBibForm.FIELD_AUTO_ASSIGN_SITE%>[1].value="<%=ImportBibForm.AUTO_ASSIGN_SITE_ONE %>";
            document.<%=ImportBibForm.FORM_NAME%>.<%=ImportBibForm.FIELD_DU_CHANGED_SITE%>.value="true";
        <% } %>
       document.<%=ImportBibForm.FORM_NAME%>.submit();
    }
 // -->
</script>

<base:form action="/cataloging/servlet/handleimportbibform.do" enctype="multipart/form-data">
    <html:hidden property="<%= ImportBibForm.FIELD_LOCAL_RELATIVE_FILE %>"/>
    <html:hidden property="<%= ImportBibForm.FIELD_LOCAL_FILENAME_ONLY %>"/>
    <%-- do not use struts for this --%>
    <input type="hidden" value="false" name="<%= ImportBibForm.FIELD_DU_CHANGED_SITE %>"/>
    <c:if test="${cform.confirmUpdate}">
        <%-- Are we confirming an update? --%>
        <base:confirmBox showWarningIcon="true"
            header='<%= MessageHelper.formatMessage("importbib_TheOptionYouSelectedMayResultInDuplicateTitles") %>' 
            messageText="<%= new String[] {GenericForm.getLastBackupDisplayMsg(true) } %>" 
            noName="<%=ImportBibForm.BUTTON_CONFIRM_NO %>"
            />
    </c:if>
    
   <base:isNotDistrictUser>
        <html:hidden property="importSiteID"/>
        <html:hidden property="<%=ImportBibForm.FIELD_AUTO_ASSIGN_SITE%>"/>
  </base:isNotDistrictUser>
   <base:isStateContext>
        <html:hidden property="importSiteID"/>
        <html:hidden property="<%=ImportBibForm.FIELD_AUTO_ASSIGN_SITE%>"/>
  </base:isStateContext>
  <html:hidden property="<%=ImportBibForm.PARAM_COLLECTION_TYPE%>"/>
  <html:hidden property="<%=ImportBibForm.PARAM_IMPORT_FROM_TITLEWAVE%>"/>
  <html:hidden property="<%=ImportBibForm.PARAM_TITLEWAVE_DOWNLOAD_URL%>"/>
  <html:hidden property="<%=ImportBibForm.PARAM_TITLEWAVE_INVOICE%>"/>
  <html:hidden property="<%=ImportBibForm.PARAM_TITLEWAVE_PROD_TYPE%>"/>
  <html:hidden property="<%=ImportBibForm.FIELD_CHANGED_SYMBOLOGY%>"/>
  <logic:equal name="<%=ImportBibForm.FORM_NAME%>" property="showLimitEbooksToSite" value="false">
    <html:hidden property="<%=ImportBibForm.FIELD_LIMIT_EBOOKS_TO_SITE%>"/>
  </logic:equal>
  
  <html:hidden property="importPage"/>
        <base:isNotStateContext>
            <% if (ImportBibForm.AUTO_ASSIGN_SITE_ONE.equals(autoAssignSite) && (isBarcodeFilteringEnabled)) { %>
                <base:barcodeFilterWarning/>
            <% } %>
        </base:isNotStateContext>
        <base:outlinedTableAndTabsWithinThere tabs="<%= form.getTabs()%>" selectedTab="<%= form.getSelectedTab()%>" borderColor="#C0C0C0" width="100%" id="importTable">
           <logic:equal name = "<%= ImportBibForm.FORM_NAME %>" property = "collectionType" value = '<%= "" + CollectionType.ASSET %>' >
            <tr valign="top">
                <td class="TableHeading">
                    Import Textbooks
                </td>
            </tr>
            <tr>
              <td class=ColRowBold><%= MessageHelper.formatMessage("importbib_PleaseNote") %></td>
            </tr>
            <tr>
              <td class=ColRow>
                  <%= MessageHelper.formatMessage("importbib_OnlyUsetThisImportOption") %>
              </td>
            </tr>
            <tr>
                <td vAlign=top>
                    <base:imageLine height="1" width="100%" /> 
                </td>
            </tr>
           </logic:equal>
           <tr>
                <td>
                <table id="importBibBox" width="100%" border="0" cellspacing="0" cellpadding="2">
                    <tr valign="top">
                    <td>
                        <table id="<%=ImportBibForm.TABLE_FORM_BOX%>" width="100%">
                        <tr>
                            <td colspan="4" class="FormLabel"><%= MessageHelper.formatMessage("importbib_TitleMatching") %>
                                <% if (CollectionType.LIBRARY == form.getCollectionType()) { %>
                                <base:helpTag helpFileName="d_import_match_LM.htm"/>
                                <% } else if (CollectionType.TEXTBOOK == form.getCollectionType()) { %>
                                <base:helpTag helpFileName="d_import_match_TM.htm"/>
                                <% } %>
                            </td>
                        </tr>
                        <%if (!isImportReplacementLocked){ %>
                            <tr valign="top">
                                <td>&nbsp;</td>
                                <td class="FormElement tdAlignRight">
                                    <html:radio property="<%=ImportBibForm.FIELD_MATCHING_RULES%>" value="<%= String.valueOf(TitleAEDSpecs.MATCH_TYPE_STRICT)%>"/>
                                </td>
                                <td class="ColRow"><%=form.getStrictMatchingText()%></td>
                                <td>&nbsp;</td>
                            </tr>
                            <c:if test="<%=form.getCollectionType()==CollectionType.LIBRARY%>">
                                <tr valign="top">
                                    <td colspan="2">&nbsp;</td>
                                    <td class="FormElement">
                                        <html:checkbox property="<%=ImportBibForm.FIELD_MATCHING_IGNORE_AUTHOR%>" onclick="selectStrict()"/><%= MessageHelper.formatMessage("importbib_RemoveTheAuthorRequirementFromTheStrictMatching") %></td>                                    
                                </tr>
                            </c:if>
                            <tr valign="top">
                                <td>&nbsp;</td>
                                <td class="FormElement tdAlignRight">
                                    <% if (CollectionType.LIBRARY == form.getCollectionType()) { %>
                                    <html:radio property="<%=ImportBibForm.FIELD_MATCHING_RULES%>" value="<%= String.valueOf(TitleAEDSpecs.MATCH_TYPE_RELAXED)%>" onclick="uncheckAuthor()"/>
                                    <% } else {  %>
                                    <html:radio property="<%=ImportBibForm.FIELD_MATCHING_RULES%>" value="<%= String.valueOf(TitleAEDSpecs.MATCH_TYPE_RELAXED)%>"/>
                                    <% } %>
                                </td>
                                <td class="ColRow"><%=form.getRelaxedMatchingText()%></td>
                                <td>&nbsp;</td>
                            </tr>
                        <%} else {%>
                            <tr valign="top">
                                <td>&nbsp;</td>
                                <td colspan="2" class="ColRow"><%=form.getStrictMatchingText()%></td>
                                <td>&nbsp;<html:hidden property="<%=ImportBibForm.FIELD_MATCHING_RULES%>" value="<%= String.valueOf(TitleAEDSpecs.MATCH_TYPE_STRICT)%>"/></td>
                            </tr>
                        <%} %>
                        <%if (!isImportReplacementLocked){ %>
                            <tr>
                                <td width="60">&nbsp;</td>
                                <td colspan="2" class="FormLabel"><%= MessageHelper.formatMessage("importbib_IfAnIncomingTitleMatchesAnExistingTitle") %></td>
                                <td>&nbsp;</td>
                            </tr>
                            <tr>
                                <td>&nbsp;</td>
                                <td class="FormElement tdAlignRight">
                                    <html:radio property="<%=ImportBibForm.FIELD_SKIP_DUPLICATE_TITLES%>" value="<%= ImportBibForm.VALUE_REPLACE_TITLE%>" onclick="disableStrict('enable');"/>
                                </td>
                                <td class="ColRow">
                                    <%=form.getReplaceText()%>&nbsp;
                                    <% if (CollectionType.LIBRARY == form.getCollectionType()) { %>
                                        <base:helpTag helpFileName="d_import_better_LM.htm"/>
                                    <% } %>&nbsp;
                                </td>
                                <td>&nbsp;</td>
                                <td>&nbsp;</td>
                            </tr>
                            <tr>
                                <td>&nbsp;</td>
                                <td class="FormElement tdAlignRight">
                                    <html:radio property="<%=ImportBibForm.FIELD_SKIP_DUPLICATE_TITLES%>" value="<%= ImportBibForm.VALUE_SKIP_TITLE%>" onclick="disableStrict('enable');"/>
                                </td>
                                <td class="ColRow"><%= MessageHelper.formatMessage("importbib_SkipTheIncomingTitle") %></td>
                                <td>&nbsp;</td>
                            </tr>
                            <% if (!store.isMediaBookingUser() && CollectionType.LIBRARY == form.getCollectionType() ){ %>
                            <tr>
                                <td>&nbsp;</td>
                                <td class="FormElement tdAlignRight">
                                    <html:radio property="<%=ImportBibForm.FIELD_SKIP_DUPLICATE_TITLES%>" value="<%=ImportBibForm.VALUE_ALWAYS_ADD_TITLE%>" onclick="disableStrict('disable');"/>
                                </td>
                                
                                <td class="ColRow">
                                    <%= MessageHelper.formatMessage("importbib_AlwaysAddTheIncomingTitleMayCauseDuplicateTitlesStrictMatchingWillBeUsed")%>&nbsp;
                                    <% if (CollectionType.LIBRARY == form.getCollectionType()) { %>
                                        <base:helpTag helpFileName="d_always_add_LM_import_titles.htm"/>
                                    <% } %>&nbsp;
                                </td>
                                    
                                <td>&nbsp;</td>
                            </tr>
                             <% } %>
                        <%} else {%>
                            <tr>
                                <td>&nbsp;</td>
                                <td colspan="2">
                                    <span class="FormLabel"><%= MessageHelper.formatMessage("importbib_IfAnIncomingTitleMatchesAnExistingTitle") %></span>
                                    <span class="ColRow"> <%= MessageHelper.formatMessage("importbib_SkipTheIncomingTitle") %></span>
                                </td>
                                <td>&nbsp;<html:hidden property="<%=ImportBibForm.FIELD_SKIP_DUPLICATE_TITLES%>" value="<%= ImportBibForm.VALUE_SKIP_TITLE%>"/></td>
                            </tr>
                            <tr><td>&nbsp;</td></tr>
                        <%} %>
                        <base:isDistrictUser>
                            <base:isNotStateContext>
                                <tr>
                                    <td colspan="4" class="FormLabel"><%= MessageHelper.formatMessage("importbib_ThisImportFileContains")%></td>
                                </tr>
                                <% if (CollectionType.LIBRARY == form.getCollectionType()) { %>
                                <tr>
                                    <td>&nbsp;</td>
                                    <td class="FormElement tdAlignRight" valign="top">
                                        <html:radio property="<%=ImportBibForm.FIELD_AUTO_ASSIGN_SITE%>" value="<%=ImportBibForm.AUTO_ASSIGN_SITE_ALL%>"
                                            onclick="this.form.submit();"/>
                                    </td>
                                    <td class="ColRow"><%=MessageHelper.formatMessage("importbib_TitlesAndCopiesForMoreThanOneLibraryInTheDistrictUseTheLibraryQuotshortNamequotInTagAToAssignEachCopyToTheAppropriateCollection") %></td>
                                    <td>&nbsp;</td>
                                </tr>
                                <% } %>
                                <tr>
                                    <td>&nbsp;</td>
                                    <td class="FormElement tdAlignRight">
                                        <% if (CollectionType.LIBRARY == form.getCollectionType()) { %>
                                            <html:radio property="<%=ImportBibForm.FIELD_AUTO_ASSIGN_SITE%>" value="<%=ImportBibForm.AUTO_ASSIGN_SITE_ONE%>"
                                                onclick="this.form.submit();"/>
                                        <% } else { %>
                                            <html:hidden property="<%=ImportBibForm.FIELD_AUTO_ASSIGN_SITE%>" value="<%=ImportBibForm.AUTO_ASSIGN_SITE_ONE%>"/>
                                            &nbsp;
                                        <% } %>
                                    </td>
                                    <td class="ColRow">
                                    <% if (CollectionType.ASSET == form.getCollectionType()) { %>
                                        <%= "Titles and items for" %>
                                    <% } else { %>
                                        <%=MessageHelper.formatMessage("importbib_TitlesAndCopiesFor") %> 
                                    <% } %>
                                         <base:selectSite 
                                            name='<%= ImportBibForm.FIELD_SITEID %>' 
                                            selectedSiteID='<%=form.getImportSiteID().toString() %>' 
                                            useSelectASite='<%=(CollectionType.TEXTBOOK == form.getCollectionType() || CollectionType.ASSET == form.getCollectionType())%>' 
                                            onChangeAction='submitDropDown()'
                                            includeLibrarySites='<%= (CollectionType.LIBRARY == form.getCollectionType()) %>'
                                            includeTextbookSites='<%= (CollectionType.TEXTBOOK == form.getCollectionType()) %>'
                                            includeMediaSites='<%= store.isMediaBookingUser() %>'
                                            includeAssetSites='<%= (CollectionType.ASSET == form.getCollectionType()) %>'
                                            />
                                    </td>
                                    <td>&nbsp;</td>
                                </tr>
                                
                            <% if (CollectionType.LIBRARY == form.getCollectionType() && form.isDisplayImportDistrictEbooks()&&(!form.isFollettShelfIntegrated())) { %>
                                <tr>
                                    <td>&nbsp;</td>
                                    <td class="FormElement tdAlignRight">
                                        <html:radio property="<%=ImportBibForm.FIELD_AUTO_ASSIGN_SITE%>" value="<%=ImportBibForm.AUTO_ASSIGN_SITE_SOME%>"
                                            onclick="this.form.submit();"/>
                                    </td>
                                    <td class="ColRow" style="line-height:40px">
                                    <%=MessageHelper.formatMessage("importbib_FollettEbooksPurchasedForDistrictwideUse") %>
                                             <base:genericButton
                                            src="/buttons/large/assignsites.gif"
                                            alt='<%= MessageHelper.formatMessage("importbib_AssignSites") %>'
                                            name="<%= ImportBibForm.BUTTON_ASSIGN_SITES %>"/>
                                            &nbsp;&nbsp;<%=(!ImportBibForm.AUTO_ASSIGN_SITE_SOME.equals(form.getAutoAssignSite())) ? "" : 
                                                MessageHelper.formatMessage("importbib_NumberOfSitesSelected0", Long.valueOf(form.getSiteIDList().size())) %>
                                    </td>
                                    <td>&nbsp;</td>
                                </tr>
                            <%}%>
                              <% if (CollectionType.LIBRARY == form.getCollectionType()) { %>
                                <tr>
                                    <td>&nbsp;</td>
                                    <td class="FormElement tdAlignRight" valign="top">
                                        <html:radio property="<%=ImportBibForm.FIELD_AUTO_ASSIGN_SITE%>" value="<%=ImportBibForm.AUTO_ASSIGN_SITE_NON_FOLLETT_EBOOKS%>"
                                            onclick="this.form.submit();"/>
                                    </td>
                                    <td class="ColRow"><%=MessageHelper.formatMessage("importbib_TitlesAndCopiesForNonFollettEbooksOnly") %>&nbsp; 
                                        <base:selectSiteType name="<%=form.FIELD_SITE_TYPE_ID%>" 
					                        selectedSiteTypeID="<%=form.getSiteTypeID()%>"  
					                        mode="<%=LookupSpecs.MODE_SEARCH%>" 
					                        includeForMediaSites="false" 
					                        includeForLibrarySites="true" includeForTextbookSites="false" includeForAssetSites="false"
				                          />
			                        </td>
                                    
                                </tr>
                                <% } %>
                            </base:isNotStateContext>
                        </base:isDistrictUser>
                        <tr>
                            <td colspan="4" class="FormLabel">
                            <% if (CollectionType.ASSET == form.getCollectionType()) { %>
                                <%= "Item Matching" %>
                            <% } else { %>
                                <%= MessageHelper.formatMessage("importbib_CopyMatching") %>
                            <% } %>
                            </td>
                        </tr>
                        <%if (!isImportReplacementLocked){ %>
                        <tr>
                            <td>&nbsp;</td>
                            <td class="FormElement tdAlignRight">
                                <html:radio property="<%=ImportBibForm.FIELD_SKIP_DUPLICATE_COPIES%>" value="<%=ImportBibForm.VALUE_SKIP_COPY%>"/>
                            </td>
                            <td class="ColRow">
                            <% if (CollectionType.ASSET == form.getCollectionType()) { %>
                                <%= "Skip the incoming item if its barcode matches an existing item\'s barcode" %>
                            <% } else { %>
                                <%= MessageHelper.formatMessage("importbib_SkipTheIncomingCopyIfItsBarcodeMatchesAnExisting") %>
                            <% } %>
                            </td>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td>&nbsp;</td>
                            <td class="FormElement tdAlignRight">
                                <html:radio property="<%=ImportBibForm.FIELD_SKIP_DUPLICATE_COPIES%>" value="<%=ImportBibForm.VALUE_REPLACE_COPY%>"/>
                            </td>
                            <td class="ColRow">
                            <% if (CollectionType.ASSET == form.getCollectionType()) { %>
                                <%= "Replace the existing item with the incoming item if the barcodes and the titles match" %>
                            <% } else { %>
                                <%= MessageHelper.formatMessage("importbib_ReplaceTheExistingCopyWithTheIncomingCopyIfThe") %>
                            <% } %>
                            </td>
                            <td>&nbsp;</td>
                        </tr>
                        <base:isNotStateContext>
                 
                            <tr>
                                <td>&nbsp;</td>
                                <td class="FormElement tdAlignRight">
                                    <html:radio disabled="<%= isBarcodeFilteringEnabled || ImportBibForm.AUTO_ASSIGN_SITE_ALL.equals(autoAssignSite) || ImportBibForm.AUTO_ASSIGN_SITE_SOME.equals(autoAssignSite) %>" property="<%=ImportBibForm.FIELD_SKIP_DUPLICATE_COPIES%>" value="<%=ImportBibForm.VALUE_ALWAYS_ADD_COPY%>"/>
                                </td>
                                <td class="ColRow">
                                    <% if (CollectionType.ASSET == form.getCollectionType()) { %>
                                        <%= "Always add the incoming item record and assign it the next available barcode" %>
                                    <% } else { %>
                                        <%= MessageHelper.formatMessage("importbib_AlwaysAddTheIncomingCopy") %>
                                    <% } %>
                        <% if (store.isDistrictUser() && (CollectionType.LIBRARY == form.getCollectionType())) { %>
                            <span class="emphasis">(<%= MessageHelper.formatMessage("importbib_YouMayNotUsezThisOption") %>)</span>
                        <% } %>
                                </td>
                                <td>&nbsp;</td>
                            </tr>
                            <tr>
                                <td colspan="2">&nbsp;</td>
                                <td colspan="2">
                                    <table id="<%=ImportBibForm.TABLE_STARTING_BARCODE%>" width="100%" border="0" cellspacing="0" cellpadding="2">
                                        <tr>
                                            <td valign="top" width="123" class="ColRowBold"><%= MessageHelper.formatMessage("importbib_StartingBarcode") %></td>
                                            <td class="ColRow">
                                               <html:radio disabled="<%= isBarcodeFilteringEnabled || ImportBibForm.AUTO_ASSIGN_SITE_ALL.equals(autoAssignSite)  || ImportBibForm.AUTO_ASSIGN_SITE_SOME.equals(autoAssignSite)%>" property="<%=ImportBibForm.FIELD_AUTO_ASSIGN_BARCODE%>" value="false"
                                                    onclick='<%="document." + ImportBibForm.FORM_NAME + "." + ImportBibForm.FIELD_STARTING_BARCODE + ".focus();"%>'/>
                                               <html:text disabled="<%= isBarcodeFilteringEnabled || ImportBibForm.AUTO_ASSIGN_SITE_ALL.equals(autoAssignSite) || ImportBibForm.AUTO_ASSIGN_SITE_SOME.equals(autoAssignSite) %>" property="<%=ImportBibForm.FIELD_STARTING_BARCODE%>" size="14" maxlength="14"
                                                    onfocus='<%="document." + ImportBibForm.FORM_NAME + "." + ImportBibForm.FIELD_AUTO_ASSIGN_BARCODE + "[0].checked = true"%>'
                  /><br>                        
                                               <base:link 
                                                    permissions="<%=new Permission[] {Permission.BACK_OFFICE_CHANGE_SITE_PREFERENCES, Permission.BACK_OFFICE_CHANGE_SITE_PREFERENCES_TEXTBOOK, Permission.BACK_OFFICE_CHANGE_SITE_PREFERENCES_ASSET}%>" 
                                                    page="javascript:submitTheForm_ChangeSymbology()"
                                                    collectionType="<%=form.getCollectionType() %>"
                                                    appendCollectionType="false"
                                                    showTextAlways="true" id="<%=ImportBibForm.ID_CHANGE_BARCODE_SYMBOLOGY %>">
                                                    <%=form.getSymbologyText()%>
                                               </base:link>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>&nbsp;</td>
                                            <td class="ColRow">
                                              <html:radio disabled="<%= isBarcodeFilteringEnabled || ImportBibForm.AUTO_ASSIGN_SITE_ALL.equals(autoAssignSite) || ImportBibForm.AUTO_ASSIGN_SITE_SOME.equals(autoAssignSite)  %>" property="<%=ImportBibForm.FIELD_AUTO_ASSIGN_BARCODE%>" value="true"
                                                    onclick='<%="document." + ImportBibForm.FORM_NAME + "." + ImportBibForm.FIELD_STARTING_BARCODE + ".value = \'\'"%>'/><%= MessageHelper.formatMessage("importbib_AssignNextBarcode") %>
                                            </td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                        </base:isNotStateContext>
                        <%} else {%>
                        <tr>
                            <td>&nbsp;</td>
                            <td colspan="2" class="ColRow">
                            <% if (CollectionType.ASSET == form.getCollectionType()) { %>
                                <%= "Skip the incoming item if its barcode matches an existing item\'s barcode" %>
                            <% } else { %>
                                <%= MessageHelper.formatMessage("importbib_SkipTheIncomingCopyIfItsBarcodeMatchesAnExisting") %>
                            <% } %>
                            </td>
                            <td>&nbsp; <html:hidden property="<%=ImportBibForm.FIELD_SKIP_DUPLICATE_COPIES%>" value="<%=ImportBibForm.VALUE_SKIP_COPY%>"/></td>
                        </tr>
                        <tr><td>&nbsp;</td></tr>
                        <%} %>

                        <!-- End of always adding copies on title only -->

                        <% if (form.isShowAssignCopyInformation(store.isDistrictUser()) ) { %>
                            <tr>
                                <td colspan="4" nowrap="nowrap" class="FormLabel">
                                <% if (CollectionType.ASSET == form.getCollectionType()) { %>
                                    <%= "Assign Item Information" %>
                                <% } else { %>
                                    <%= MessageHelper.formatMessage("importbib_AssignCopyInformation") %>
                                <% } %>
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                <span valign="bottom">
                                <base:genericButton  src="/buttons/large/update.gif" alt='<%=MessageHelper.formatMessage("update")%>' name="<%= ImportBibForm.BUTTON_UPDATE_COPY_INFORMATION %>" /> 
                                </span>
                                </td>
                                
                            </tr>
                            <html:hidden property="<%=ImportBibForm.FIELD_ASSIGN_CIRC_TYPE_MODE%>"></html:hidden>
                            <html:hidden property="<%=ImportBibForm.PARAM_DEFAULT_CATEGORIES%>"/>
                            <html:hidden property="<%= ImportBibForm.FIELD_DEFAULT_FUNDING_SOURCE%>"/>   
                            <html:hidden property="<%= ImportBibForm.FIELD_DEFAULT_VENDOR%>"/>
                            <html:hidden property="<%= ImportBibForm.FIELD_DEFAULT_SUBLOCATION%>"/>                                      
                            <html:hidden property="<%= ImportBibForm.FIELD_DEFAULT_CIRC_TYPE%>"/>                                      
                             
                                <tr>
                                    <td>&nbsp;</td>
                                    <td colspan="3">
                                    <table id="<%=ImportBibForm.TABLE_DEFAULT_STUFF%>">
                                      <tr>
                                      <td colspan="4" class="ColRow">
                                        <% if (CollectionType.ASSET == form.getCollectionType()) { %>
                                            <%= "If missing, assign the following information to each copy that is added or replaced:" %>
                                        <% } else { %>
                                            <%= MessageHelper.formatMessage("importbib_IfMissingAssignTheFollowingInformationToEachCopy") %>
                                        <% } %>
                                      </td>
                                      <tr>
                                      <td align="center" > 
                                        <table id="<%=ImportBibForm.TABLE_CIRC_TYPE_DESCRIPTION%>">
                                            <tr>
                                             <td class="ColRow"> 
                                             <c:choose>
                                                <c:when test="${! empty cform.assignedCopySettings}">
                                                    <bean:write filter="false"  name="<%= ImportBibForm.FORM_NAME %>" property="assignedCopySettings"/>
                                                </c:when>
                                                <c:otherwise>
                                                    <ul><li>
                                                    <% if (CollectionType.ASSET == form.getCollectionType()) { %>
                                                        <%= "No item information selected" %>
                                                    <% } else { %>
                                                        <%= MessageHelper.formatMessage("importbib_NoCopyInformationSelected") %>
                                                    <% } %>
                                                    </li></ul>
                                                </c:otherwise>
                                             </c:choose>
                                             </td>
                                             </tr>
                                         </table>
                                         </td>
                                      </tr>
                                    </table>
                                    </td>
                                </tr>

                        <% } %>   


                        <c:if test="${! cform.confirmUpdate}">
                            <% if (!form.isImportFromTitlewave()) { %>
                            <tr>
                                <td colspan="2" class="FormLabel tdAlignRight" nowrap="nowrap"><%= MessageHelper.formatMessage("importbib_ImportFile") %></td>
                                <td><html:file property="<%=ImportBibForm.FIELD_UPLOAD_FILE%>" size="40"/></td>
                                <td>&nbsp;</td>
                            </tr>
                            <% } %>
                        </c:if>
                        <logic:equal name="<%=ImportBibForm.FORM_NAME%>" property="<%=ImportBibForm.PARAM_COLLECTION_TYPE%>" value='<%=CollectionType.LIBRARY + ""%>'>
                            <logic:equal name="<%=ImportBibForm.FORM_NAME%>" property="showBookList" value="true">
                            <tr valign="bottom">
                                <td>&nbsp;</td>
                                <td class="tdAlignRight"><html:checkbox property="<%=ImportBibForm.FIELD_ADD_TO_MYLIST%>"></html:checkbox></td>
                                <td class="ColRow" nowrap="nowrap"><%= MessageHelper.formatMessage("importbib_AddTheTitlesInTheImportFileTo") %>&nbsp;<base:myListSelect 
                                        name="<%=ImportBibForm.FIELD_SELECTED_LIST_ID%>" 
                                        selectedMyListID="<%=form.getSelectedListID() %>" 
                                        prompt="" 
                                        publicList="false" 
                                        submitOnChange="false" />

                                    <base:genericButton src="/buttons/large/viewlist.gif" absbottom="true"
                                        alt='<%= MessageHelper.formatMessage("viewList") %>'
                                        name="<%= ImportBibForm.BUTTON_VIEW_LIST %>" />
                                </td>
                                <td>&nbsp;</td>
                            </tr>
                            </logic:equal>
                            <logic:equal name="<%=ImportBibForm.FORM_NAME%>" property="showLimitEbooksToSite" value="true">
                            <tr valign="top">
                                <td>&nbsp;</td>
                                <td class="tdAlignRight"><html:checkbox property="<%=ImportBibForm.FIELD_LIMIT_EBOOKS_TO_SITE%>"></html:checkbox></td>
                                <td class="ColRow" nowrap="nowrap"><%= MessageHelper.formatMessage("importbib_ThisFileContainsEbookRecordsForOnlyThisSite") %>
                                    <base:helpTag helpFileName="d_LM_ebook_rcrds_site_only.htm"/>
                                </td>
                                <td>&nbsp;</td>
                            </tr>
                            </logic:equal>
                        </logic:equal>
                        <tr valign="top">
                            <td>&nbsp;</td>
                            <td class="tdAlignRight"><html:checkbox property="<%=ImportBibForm.FIELD_BRIEF%>" ></html:checkbox></td>
                            <td class="ColRow">
                            <% if (CollectionType.ASSET == form.getCollectionType()) { %>
                                <%= "Limit the Job Summary details to errors and warnings (clear this option for a record of every title and item in the import file)." %>
                            <% } else { %>
                                <%= MessageHelper.formatMessage("importbib_LimitTheJobSummaryDetailsToErrorsAndWarningsClear") %>
                            <% } %>
                            </td>
                            <td>&nbsp;</td>
                        </tr>
                        <%if (!isImportReplacementLocked){ %>
                            <logic:equal name="<%=ImportBibForm.FORM_NAME%>" property="<%=ImportBibForm.PARAM_COLLECTION_TYPE%>" value='<%=CollectionType.LIBRARY + ""%>'>
                            <tr valign="top">
                                    <td>&nbsp;</td>
                                    <td class="tdAlignRight"><html:checkbox property="<%=ImportBibForm.FIELD_LIST_POSSIBLE_DUPLICATES%>"></html:checkbox></td>
                                    <td class="ColRow" nowrap="nowrap"><%=MessageHelper.formatMessage("importbib_ListPossibleDuplicateTitlesInTheJobSummaryAfterImport")%>
                                    <base:helpTag helpFileName="d_list_duplicates_LM_import_titles.htm"/>
                                    </td>
                                    <td>&nbsp;</td>
                            </tr>
                            </logic:equal>
                        <%} %>
                        <tr>
                            <td colspan="4" align="center" class="ColRowBold">
                            <base:showHideTag id="onAction">
                               <logic:equal name="<%=ImportBibForm.FORM_NAME%>" property="<%=ImportBibForm.PARAM_COLLECTION_TYPE%>" value='<%=CollectionType.LIBRARY + ""%>'>
                                  <base:genericButton
                                      src="/buttons/large/preview2.gif"
                                      alt='<%= MessageHelper.formatMessage("preview") %>'
                                      name="<%= ImportBibForm.BUTTON_PREVIEW %>"
                                      onclick="hideElementonAction()"/>
                               </logic:equal>
                                <base:genericButton
                                    src="/buttons/large/import.gif"
                                    alt='<%= MessageHelper.formatMessage("import") %>'
                                    name="<%= ImportBibForm.BUTTON_IMPORT %>"
                                    onclick="hideElementonAction()"/>
                                &nbsp; &nbsp;
                            </base:showHideTag>
                            </td>
                        </tr>
                        </table><!-- importformtable -->
                    </td>
                    </tr>
                </table> <!-- importbibbox -->
            </td>
            </tr>
        </base:outlinedTableAndTabsWithinThere>            
</base:form>

<SCRIPT LANGUAGE="javascript" TYPE="text/javascript">
<!--
    function submitTheForm_ChangeSymbology() {
        document.<%=ImportBibForm.FORM_NAME%>.<%=ImportBibForm.FIELD_CHANGED_SYMBOLOGY%>.value = "true";
        document.<%=ImportBibForm.FORM_NAME%>.submit();
    }
// -->
</SCRIPT>
