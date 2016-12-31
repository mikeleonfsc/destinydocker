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
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
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
<%@page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%><base:messageBox strutsErrors="true"/>

<%@page import="com.follett.fsc.destiny.session.backoffice.data.PatronGlobalUpdateJobParams"%>

<%
    UpdatePatronIndividualForm form = (UpdatePatronIndividualForm) request.getAttribute(UpdatePatronIndividualForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);

    String focusControl = UpdatePatronIndividualForm.FIELD_SEARCH_STRING;
    if (form.isUploadFileOption() ) {
        focusControl = BarcodeListTag.FIELD_SCAN_ITEM;
    } else if ((form.isBatchMode())) {
        focusControl = UpdatePatronIndividualForm.OPTION_LIST_1_NAME;
    }
    if (form.isPrinterFriendly()) {
        focusControl = "";
    }
    Tab[] tabs = BasePatronListForm.getTabs(store);
%>

<base:form action="/backoffice/servlet/handleupdatepatronindividualform.do" enctype="multipart/form-data" focus="<%=focusControl%>">
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=UpdatePatronIndividualForm.BUTTON_TRAP_ENTER_KEY%>">

    <html:hidden property="<%=UpdatePatronIndividualForm.PARAM_STORED_SEARCH_STRING%>"/>
    <input type="hidden" name="<%=form.FIELD_PATRON_LIST_DISPLAYED%>" value="<%=form.isPatronListDisplayed()%>" />
    <input type="hidden" name="<%=form.FIELD_LAST_SEARCH_STRING%>" value="<%=form.getLastSearchString()%>" />
    <input type="hidden" name="<%=form.FIELD_SELECTION_CHANGED%>"/>
    <html:hidden property="<%=UpdatePatronIndividualForm.PARAM_PATRONS_LIST_OUT%>" />
    <html:hidden property="action" />
    <html:hidden property="<%=UpdatePatronIndividualForm.PARAM_PATRONS_LIST_OUT%>"/>
    <html:hidden property="<%=UpdatePatronIndividualForm.PARAM_PATRON_ID%>"/>
    <html:hidden property="<%=UpdatePatronIndividualForm.PARAM_PATRON_NAME%>"/>
    <html:hidden property="<%=UpdatePatronIndividualForm.PARAM_PATRON_BARCODE%>"/>
    <html:hidden property="<%=UpdatePatronIndividualForm.PARAM_PATRON_TYPE%>"/>
    <html:hidden property="<%=UpdatePatronIndividualForm.CHANGE_TO_ACCESS_LEVEL%>"/>
    
    <%if ( form.getDemoteTeacherWarnings().size() > 0) { %>
    <base:messageBox showRedBorder="true">
    <tr>
        <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
        <td valign="baseline" class="Error">
            <p align="center"><%= MessageHelper.formatMessage("updatepatronindividual_ThisPatronIsCurrentlyAssociatedWithOneOrMoreClass") %>:</p>
            <p align="center"><ul>
                <% Iterator<String> itr = form.getDemoteTeacherWarnings().iterator();
                while ( itr.hasNext() ) {
                    out.print("<center><li>");
                    out.print(ResponseUtils.filter(itr.next()));
                    out.println("</li></center>");
                }
                %>
            </ul>
            </p>
            <p align="center"><%= MessageHelper.formatMessage("updatepatronindividual_AreYouCertainThisPatronIsNotCurrentlyTeaching") %></p>
            <div align="center">
                <base:yesNo
                    buttonYesName="<%=UpdatePatronIndividualForm.BUTTON_DEMOTE_TEACHER_YES%>"
                    buttonNoName="<%=UpdatePatronIndividualForm.BUTTON_DEMOTE_TEACHER_NO%>"
                /> 
            </div>
        </td>
    </tr>
    </base:messageBox>
    <% } %>
    

    <base:outlinedTableAndTabsWithinThere formName="<%=UpdatePatronIndividualForm.FORM_NAME %>" 
            id="tableUpdatePatron" 
            tabs="<%= tabs %>" 
            selectedTab='<%=MessageHelper.formatMessage("updatepatronindividual_TabTopUpdate")%>' 
            selectedTabID="<%=IUpdatePatronForm.ID_TAB_TOP_UPDATE%>"
            hideTabsWhenPrinterFriendly="true" borderColor="#C0C0C0" width="100%">
            <tr>
                <td class="TableHeading" colspan="2"><%= MessageHelper.formatMessage("updatepatronindividual_UpdatePatrons") %></td>
            </tr>
            
            <logic:equal name='<%= UpdatePatronIndividualForm.FORM_NAME %>' property="printerFriendly" value="false">
            <tr>
                <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("updatepatronindividual_BasedOn") %></td>
                <td class="ColRow">
                    <%=UpdatePatronHelper.getUpdateDropDown(UpdatePatronIndividualForm.FORM_NAME, form.getUpdatePatronsType()) %>
                </td>
            </tr>
            </logic:equal>
            <tr>
                <td class="ColRow" colspan="2"><base:imageLine printerFriendly="<%=form.isPrinterFriendly() %>" width="98%" vspace="2"/></td>
            </tr>


            <tr>
                <td class="ColRowBold tdAlignRight" valign="middle">
                    <table cellpadding="2" cellspacing="0">
                        <tbody>
                            <tr>
                                <td>
                                    <%= MessageHelper.formatMessage("updatepatronindividual_Change") %>
                                </td>
                            </tr>
                            <tr><td></td></tr>
                            <tr><td></td></tr>
                        </tbody>
                    </table>            
                </td>
                <td>
                    <table cellpadding="2" cellspacing="0" id="<%=form.TABLE_OPTIONS%>">
                        <tr>
                            <base:patronUpdateList formName="<%=form.FORM_NAME%>" 
                                option="<%=form.getOption1()%>"
                                optionName="<%=form.OPTION_LIST_1_NAME%>" 
                                childOptionName="<%=form.CHILD_OPTION_LIST_1_NAME%>"
                                childOption="<%=form.getChildOption1()%>"
                                selectionChangeFieldName="<%=form.FIELD_SELECTION_CHANGED%>"
                                selectionChangeFieldValue="<%=form.FIELD_SELECTION_CHANGED_VALUE1%>"
                                calendarImageFieldName="<%=form.FIELD_CALENDAR1_IMAGE%>"
                                excludedOptions="<%=form.getExcludedOptions(form.OPTION_LIST_1_NAME)%>"
                                childControlDescriptor='<%=MessageHelper.formatMessage("updatepatronindividual_To")%>'
                                onChildChangeScript="<%=form.gimmeOnChangeScriptNameForOption(form.getOption1())%>"
                                printerFriendly="<%=form.isPrinterFriendly() %>"
                            />
                            <% if (form.showAssetGroup(form.getOption1())) { %>
                                <td class="ColRowBold">
                                    <%= MessageHelper.formatMessage("updatepatronindividual_WithAssetGroup") %>
                                    <%=form.buildAssetGroupList(form.getChildOption1())%>
                                </td>
                            <% } %>
                        </tr>
                        <tr>
                            <base:patronUpdateList formName="<%=form.FORM_NAME%>" 
                                option="<%=form.getOption2()%>"
                                optionName="<%=form.OPTION_LIST_2_NAME%>" 
                                childOptionName="<%=form.CHILD_OPTION_LIST_2_NAME%>"
                                childOption="<%=form.getChildOption2()%>"
                                selectionChangeFieldName="<%=form.FIELD_SELECTION_CHANGED%>"
                                selectionChangeFieldValue="<%=form.FIELD_SELECTION_CHANGED_VALUE2%>"
                                calendarImageFieldName="<%=form.FIELD_CALENDAR2_IMAGE%>"
                                excludedOptions="<%=form.getExcludedOptions(form.OPTION_LIST_2_NAME)%>"
                                childControlDescriptor='<%=MessageHelper.formatMessage("updatepatronindividual_To")%>'
                                onChildChangeScript="<%=form.gimmeOnChangeScriptNameForOption(form.getOption2())%>"
                                printerFriendly="<%=form.isPrinterFriendly() %>"
                            />
                            <% if (form.showAssetGroup(form.getOption2())) { %>
                                <td class="ColRowBold">
                                    <%= MessageHelper.formatMessage("updatepatronindividual_WithAssetGroup") %>
                                    <%=form.buildAssetGroupList(form.getChildOption2())%>
                                </td>
                            <% } %>
                        </tr>
                        <tr>
                            <base:patronUpdateList formName="<%=form.FORM_NAME%>" 
                                option="<%=form.getOption3()%>"
                                optionName="<%=form.OPTION_LIST_3_NAME%>" 
                                childOptionName="<%=form.CHILD_OPTION_LIST_3_NAME%>"
                                childOption="<%=form.getChildOption3()%>"
                                selectionChangeFieldName="<%=form.FIELD_SELECTION_CHANGED%>"
                                selectionChangeFieldValue="<%=form.FIELD_SELECTION_CHANGED_VALUE3%>"
                                calendarImageFieldName="<%=form.FIELD_CALENDAR3_IMAGE%>"
                                excludedOptions="<%=form.getExcludedOptions(form.OPTION_LIST_3_NAME)%>"
                                childControlDescriptor='<%=MessageHelper.formatMessage("updatepatronindividual_To")%>'
                                onChildChangeScript="<%=form.gimmeOnChangeScriptNameForOption(form.getOption3())%>"
                                printerFriendly="<%=form.isPrinterFriendly() %>"
                            />
                            <% if (form.showAssetGroup(form.getOption3())) { %>
                                <td class="ColRowBold">
                                    <%= MessageHelper.formatMessage("updatepatronindividual_WithAssetGroup") %>
                                    <%=form.buildAssetGroupList(form.getChildOption3())%>
                                </td>
                            <% } %>
                        </tr>
                    </table>
                </td>
            </tr>

            <tr>
                <td class="ColRow" colspan="2"><base:imageLine printerFriendly="<%=form.isPrinterFriendly() %>" width="98%" vspace="2"/></td>
            </tr>
            <% if ( !form.isBatchMode() ) { %>
                <tr>
                    <td valign="top" class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("updatepatronindividual_Patron") %></td>
                    <td> 
                        <!--  Circ Find Box starting -->
                        <base:circFindBox 
                            searchString="<%=form.getSearchString()%>"
                            findBoxLabel=""
                            renderUpdateButton="true"
                            textbookMode="false"
                            searchLocalPatronsOnly="true"
                            collectionType="<%=BibMasterSpecs.COLLECTION_TYPE_LIBRARY%>"
                        />
                        <!--  Circ Find Box ending -->
                    </td>
                </tr>
            <% } %>
                
                <%
                    List patronList = (List) request.getAttribute("patronlist");
                    if (patronList != null && patronList.size() > 0) {
                %>
                <tr>
                    <td colspan="2">
                        <A name="<%=UpdatePatronIndividualForm.ANCHOR_PATRON_SEARCH %>"></A>
                        <base:imageLine printerFriendly="<%=form.isPrinterFriendly() %>" height="2" width="100%"/>
                        <jsp:include page="/circulation/patronlist.jsp">
                            <jsp:param name="formName" value="<%= UpdatePatronIndividualForm.FORM_NAME %>"/>
                            <jsp:param name="districtSearch" value="false"/>
                        </jsp:include>
                    </td>
                </tr>
                <br>
                <%
                }
                %>
                
                <% if ( form.isBatchMode() ) { %>
                    <logic:equal name='<%= UpdatePatronIndividualForm.FORM_NAME %>' property="printerFriendly" value="false">
                    <tr><td colspan="2" class="ColRow">&nbsp;</td></tr>
                    <%if ( form.isUploadFileOption() ) { %>
                        <tr>
                            <td class="ColRow">&nbsp;</td>
                            <td>
                               <base:barcodeList barcodeType="<%= Barcode.BARCODETYPE_PATRON %>"
                                   formName="<%=UpdatePatronIndividualForm.FORM_NAME%>"/>
                            </td>
                        </tr>
                    <%} %>
                    </logic:equal>
                    
                    <%if ( !form.isUploadFileOption() ) { %>
                        <logic:equal name='<%= UpdatePatronIndividualForm.FORM_NAME %>' property="printerFriendly" value="false">
                            <tr>
                                <td colspan="2" width="100%" align="Center" >
                                    <table border="0" cellpadding="0" cellspacing="0" width="100%" >
                                        <tr>
                                            <td class="ColRow tdAlignLeft"><%= MessageHelper.formatMessage("updatepatronindividual_FindPatronRecordsWith") %>&nbsp;<html:text property="<%=UpdatePatronIndividualForm.FIELD_SEARCH_STRING %>" size="20" maxlength="90"/>&nbsp;<%= MessageHelper.formatMessage("updatepatronindividual_In") %>
                                                <base:selectPatronByType name="<%=UpdatePatronIndividualForm.FIELD_SEARCH_TYPE %>" selected="<%=form.getSearchType()%>" onlyMyPatrons="true" siteID="<%=store.getSiteID()%>" returnAllEvenIfWeFindAMatchByBarcode="true"/>
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
                    <logic:equal name='<%= UpdatePatronIndividualForm.FORM_NAME %>' property="printerFriendly" value="false">
                         <tr>
                            <td colspan="2">
                                <table id="searchSummary" width="100%" cellspacing="0" cellpadding="2">
                                    <tr>
                                        <td class="ColRowBold">
                                            <%=form.getSearchSummary()%>
                                        </td>
                                        <td class="tdAlignRight">
                                            <base:link page="<%= form.buildPrinterFriendlyLink() %>" target="printerFriendly" id="<%=UpdatePatronIndividualForm.ID_PRINTER_FRIENDLY %>"><base:image src="/buttons/small/printerfriendly.gif" alt='<%= MessageHelper.formatMessage("printable") %>'/></base:link>
                                        </td>
                                   </tr>
                                   <tr>
                                        <td class="SmallColHeading">
                                         <a name="<%=BasePatronListForm.ANCHOR %>"></a>
                                            <%=form.gimmeCurrentlySelectedCountMessage()%>
                                        </td>
                                        <td class="SmallColHeading tdAlignRight">
                                           <base:pageListOutput formName="<%= UpdatePatronIndividualForm.FORM_NAME %>" />
                                        </td>
                                   </tr>
                                </table>
                             </td>
                         </tr>
                        </logic:equal>
                         <tr>
                            <td colspan="2">
                            <html:hidden property="page" value='<%= "" + currentPage %>' />
                            
                                <table id="<%=UpdatePatronMergeDuplicatesForm.TABLE_PATRON_INFO_DETAIL%>" width="100%" cellspacing="0" cellpadding="4" border="0">
                                    <tr>
                                        <td class="SmallColHeading"><%= MessageHelper.formatMessage("updatepatronindividual_LastFirstMiddle") %></td>
                                        <td class="SmallColHeading"><%= MessageHelper.formatMessage("updatepatronindividual_Barcode") %></td>
                                        <td class="SmallColHeading">
                                            <%=PatronSpecs.getDistrictIDPrompt()%>
                                        </td>
                                        <base:isDistrictUser>
                                            <td class="SmallColHeading"><%= MessageHelper.formatMessage("updatepatronindividual_Site") %></td>
                                        </base:isDistrictUser>
                                        <td class="SmallColHeading"><%= MessageHelper.formatMessage("updatepatronindividual_PatronType") %></td>
                                        <td>&nbsp;</td>
                                    </tr>
                                    <logic:iterate offset='<%=""+itemsToSkip%>' length='<%=""+(itemsToPrint - itemsToSkip)%>' indexId="flipper" id="row" name="<%= UpdatePatronIndividualForm.FORM_NAME %>" property="patronsList" type="com.follett.fsc.destiny.session.backoffice.data.FindSitePatronValue">
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
                        <logic:equal name='<%= UpdatePatronIndividualForm.FORM_NAME %>' property="printerFriendly" value="false">
                           <tr>
                                <td colspan="2" class="SmallColHeading tdAlignRight">
                                   <base:pageListOutput formName="<%= UpdatePatronIndividualForm.FORM_NAME %>" topOfPageLinks="false"/>
                                </td>
                           </tr>
                        </logic:equal>
                <%
                } else {
                %>
                      <logic:equal name='<%= UpdatePatronIndividualForm.FORM_NAME %>' property="printerFriendly" value="false">
                         <tr>
                            <td colspan="2">
                                <table id="searchSummary" width="100%" cellspacing="0" cellpadding="2">
                                   <tr>
                                        <td class="SmallColHeading">
                                            <%=form.gimmeCurrentlySelectedCountMessage()%>
                                        </td>
                                        <td class="tdAlignRight">
                                            <base:link page="<%= form.buildPrinterFriendlyLink() %>" target="printerFriendly" id="<%=UpdatePatronIndividualForm.ID_PRINTER_FRIENDLY %>"><base:image src="/buttons/small/printerfriendly.gif" alt='<%= MessageHelper.formatMessage("printable") %>'/></base:link>
                                        </td>
                                   </tr>
                                     
                                </table>
                             </td>
                         </tr>
                        </logic:equal>
                <%
                }
                %>                
                         <tr>
                            <td colspan="2">
                                <base:selectedPatronListOutput form="<%=form%>" />
                            </td>
                         </tr>
                    <% } %>
                    <logic:equal name='<%= UpdatePatronIndividualForm.FORM_NAME %>' property="printerFriendly" value="false">
                        <tr>
                        <td align="center" colspan="2" class="ColRowBold"><%=GenericForm.getLastBackupDisplayMsg(true)%>
                        </td>
                        </tr>
                        <tr>
                            <td colspan="2" align="center" class="ColRowBold">
                                <base:genericShowHideButton src="/buttons/large/updatepatrons.gif" name="<%=UpdatePatronIndividualForm.BUTTON_UPDATE_PATRONS%>" alt='<%=MessageHelper.formatMessage("update")%>' elementID="updatePatrons"/>
                                <br>
                            </td>
                        </tr>
                    </logic:equal>
                <% } %>
                <%
                    if (form.getPatronID() != null) {
                        String statusLink = form.gimmeMostRecentlyUpdatedPatronStatusLink();
                        String editLink = form.gimmeMostRecentlyUpdatedPatronEditLink();
                %>
                <tr>
                    <base:sectionHeading printerFriendly="false" heading='<%=MessageHelper.formatMessage("updatepatronindividual_MostRecentlyUpdated") %>' tdContent="colspan='2'"/>
                </tr>
                <tr><td colspan="2" width="100%">
                    <table width="100%" id="<%=UpdatePatronIndividualForm.TABLE_MOST_RECENTLY_UPDATED %>" cellpadding="0" cellspacing="3">
                    <tr>
                    <td>
                        <span class="ColRow">
                        <%=ResponseUtils.filter(form.getPatronNameDisplay())%>
                        (<%=ResponseUtils.filter(form.getPatronTypeDisplay())%>:
                        <base:link permission="<%=Permission.CIRC_VIEW_PATRON_STATUS%>" page="<%= statusLink %>" id="<%=UpdatePatronIndividualForm.ID_VIEW_PATRON %>">
                            <%=ResponseUtils.filter(form.getPatronBarcodeDisplay())%>)
                        </base:link>
                        <base:spanIfNotAllowed permission='<%= Permission.CIRC_VIEW_PATRON_STATUS %>'>
                            <%=ResponseUtils.filter(form.getPatronBarcodeDisplay())%>)
                        </base:spanIfNotAllowed>
                        </span>
                    </td>
                    <td class="tdAlignRight">
                        <base:link permission="<%=Permission.BACK_OFFICE_ADD_EDIT_PATRONS%>" page="<%= editLink %>" id="<%=UpdatePatronIndividualForm.ID_EDIT_PATRON  %>">
                            <base:image src="/buttons/small/editpatronsmall.gif" alt='<%= MessageHelper.formatMessage("editPatron") %>'/>
                        </base:link>
                    </td>
                    </tr>
                    </table>
                </td></tr>
                <%
                }
                %>
            </base:outlinedTableAndTabsWithinThere>
</base:form>
<script language="JavaScript" type="text/javascript">
<!--
function accessLevelChanged() {
    document.<%=UpdatePatronIndividualForm.FORM_NAME%>.<%=UpdatePatronIndividualForm.CHANGE_TO_ACCESS_LEVEL%>.value = "<%=UpdatePatronIndividualForm.SUBMIT_ACCESS_LEVEL_CHANGED%>";
    document.<%=UpdatePatronIndividualForm.FORM_NAME%>.submit();
}
//-->
</script>
