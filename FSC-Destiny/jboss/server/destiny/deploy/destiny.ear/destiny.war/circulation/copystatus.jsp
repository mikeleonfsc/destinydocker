<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CopySpecs" %>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.destiny.client.common.PageCalculator" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.BaseListForm" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.BaseSearchResultsForm" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page import="com.follett.fsc.destiny.util.CollectionType"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%
    CopyStatusForm form = (CopyStatusForm)request.getAttribute( CopyStatusForm.FORM_NAME );

    LocaleHelper lh = UserContext.getMyContextLocaleHelper();

    String focus = "";

    if (form.isShowFindPrompt()) {
        focus = CopyStatusForm.FIELD_SEARCH_STRING;
    }
%>

<%
String parentFormName = CopyStatusForm.FORM_NAME;
        int itemsInList = 0;
        int currentPage = 0;
        int itemsToSkip = 0;
        int itemsToPrint = 0;
        boolean tooManyHits = false;
    if (request.getAttribute("copylist") != null) {
        itemsInList = form.getTotalCopies();
        currentPage = PageCalculator.getCurrentPage(form);
        itemsToSkip = PageCalculator.getFirstNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
        itemsToPrint = PageCalculator.getOnePastLastNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
        tooManyHits = false;
    }
%>

<bean:define id="searchOptions" name="circulation_servlet_CopyStatusForm" property="searchOptions"/>

<base:messageBox strutsErrors="true"/>

<jsp:include page="/circulation/setsound.jsp"/>

<base:form action="/circulation/servlet/handlecopystatusform.do" focus="<%=focus%>">
<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
%>
<html:hidden property="showFindPrompt" />
<html:hidden property="copyID" />
<html:hidden property="copyNoteID" />
<html:hidden property="deleteNoteID" />
<html:hidden property="collectionType" />
<html:hidden property="showSelectAsset" />
<html:hidden property="page" value='<%= Integer.toString(currentPage) %>' />
<html:hidden property="totalCount" />
<html:hidden property="prevSearchTerm" value='<%= form.getPrevSearchTerm() %>' />

    <jsp:include page="/circulation/lostcopyprompt.jsp" flush="true" >
    <jsp:param name="FormName" value='<%=CopyStatusForm.FORM_NAME%>'/>
    <jsp:param name="collectionType" value='<%="" + form.getCollectionType()%>'/>
</jsp:include>

<jsp:include page="/circulation/stolencopyprompt.jsp" flush="true" >
    <jsp:param name="FormName" value='<%=CopyStatusForm.FORM_NAME%>'/>
    <jsp:param name="collectionType" value='<%="" + form.getCollectionType()%>'/>
</jsp:include>

<!-- delete note confirmation -->
<logic:equal name='<%=CopyStatusForm.FORM_NAME%>' property="deleteNote" value="true">
     <base:confirmBox 
                showWarningIcon="true" 
                header='<%= MessageHelper.formatMessage("copystatus_AreYouSureYouWantToSeleteThisNote") %>' 
                yesName="<%=CopyStatusForm.BUTTON_NAME_DELETE_NOTE_YES %>"
                noName="<%=CopyStatusForm.BUTTON_NAME_DELETE_NOTE_NO %>"/>
</logic:equal>
<!-- delete note confirmation -->

<logic:present name='<%=CopyStatusForm.FORM_NAME%>' property="<%=CopyStatusForm.PARAM_TRANSFER_COPY_LIST%>" >
    <base:imageSpacer width="1" height="3"/>
    <center>
    <base:messageBox>
    <base:transferOnScan formName="<%=CopyStatusForm.FORM_NAME%>"></base:transferOnScan>
    </base:messageBox>
    </center>
</logic:present>
<logic:equal name='<%=CopyStatusForm.FORM_NAME%>' property="showFindPrompt" value="true" scope="request" >
    <table id="<%=CopyStatusForm.TABLE_FIELDENTRY%>" border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td class="FormLabel">
                <%
                    if (CollectionType.ASSET == form.getCollectionType()) {
                %>Find Item<%
                    } else {
                %><%= MessageHelper.formatMessage("copystatus_FindCopy") %><%
                    }
                %>
            </td>
            <td class="ColRow">
                &nbsp;
                <html:text property='<%=CopyStatusForm.FIELD_SEARCH_STRING%>' maxlength="1000"/>
            </td>
            <%
                if (!store.isMediaBookingUser() && (CollectionType.ASSET != form.getCollectionType())) {
            %>
                <td class="ColRow">&nbsp;
                    <%
                        if ( store.canView(Permission.CIRC_VIEW_COPY_STATUS) && store.canView(Permission.CIRC_VIEW_COPY_STATUS_TEXTBOOK) ){
                    %>
                        <b>in&nbsp;</b>
                        <html:select property="<%=CopyStatusForm.FIELD_SEARCH_OPTION%>">
                            <html:options collection="searchOptions" property="longID" labelProperty="stringDesc"/>
                        </html:select>
                    <%
                        } else {
                    %>
                        <html:hidden property="<%=CopyStatusForm.FIELD_SEARCH_OPTION%>"/>
                        <B>
                        <%=form.getSearchOptionDescription()%>
                        </B>
                    <%
                        }
                    %>
                </td>
             <%
                 } else {
             %>
                <html:hidden property="<%=CopyStatusForm.FIELD_SEARCH_OPTION%>" />
             <%
                 }
             %>
            <td>
                &nbsp;
                <base:goButton/>
            </td>
            <% if (form.isShowSelectAsset()) { %>
                <td align='right'>
                    &nbsp;
                    <base:cancelButton/>
                </td>
            <% } %>
        </tr>
    </table>
</logic:equal>



<!-- TABLE PAGING HEADER -->
<%
    if (request.getAttribute("copylist") != null) {
%>
    <br>
    <% if (form.isShowSelectAsset()){ %>
    <table id="<%= BaseSearchResultsForm.TABLE_PAGING_HEADER %>" width="100%">
        <tr>
            <td colspan="3"><base:imageLine height="2" width="100%" /></td>
        </tr>
        <tr valign="bottom">
            <td colspan="3">
                <table
                    id="<%=BaseSearchResultsForm.TABLE_PAGING_NUMBER_HEADER %>"
                    border="0" cellpadding="0" width="100%">
                    <tr>
                        <td><base:searchSummary
                                searchType='Items'
                                startOfSet='<%="" + ( itemsToSkip + 1 ) %>'
                                endOfSet='<%="" + ( itemsToPrint )%>'
                                totalInSet='<%="" + ( itemsInList )%>'
                                tooManyHits='<%= "" + ( tooManyHits ) %>' />
                        </td>

                        <td class="SmallColHeading tdAlignRight">
                                <base:pageListOutput formName="<%=parentFormName%>" displayTabs="false" />
                        </td>

                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td colspan="3"><base:imageLine height="2" width="100%" /></td>
        </tr>
    </table>
    <% } %>
    <img src="/images/icons/general/line.gif" height="2" width="100%">

        <logic:equal name='<%=CopyStatusForm.FORM_NAME%>' property="<%=CopyStatusForm.FIELD_COLLECTION_TYPE%>" value='<%=""+CollectionType.ASSET%>' scope="request" >
    <table id="CopyFindTable" width="100%" cellspacing="0" cellpadding="4">

            <tr>
                <% if (form.isShowSelectAsset()){ %>
                <td class="SmallColHeading">Barcode<br>&nbsp;&nbsp;&nbsp;(Serial Number)</td>
                <% } else { %>
                <td class="SmallColHeading">Barcode</td>
                <% } %>
                <td class="SmallColHeading">Description</td>
                <td class="SmallColHeading">Status</td>
                <td class="SmallColHeading">Location</td>
                <% if(store.isDistrictUser()){ %>
                    <td class="SmallColHeading">Site</td>
                <%} %>
            </tr>
        
            <logic:iterate indexId="flipper" id="row" name="<%=CopyStatusForm.FORM_NAME%>" property="list" type="com.follett.fsc.destiny.session.common.data.CopyFindVO">
                <tr valign="top" <%=( ( (1 & flipper.intValue())==0)? "bgColor=\"#E8E8E8\"" : "" )%> >
                    <%
                        // Display item here
                    %>
                    <td class="ColRow"><%=form.getCopyBarcodeLink(row)%></td>
                    <base:td clazz="ColRow" filtered="true"><%=row.getTitle()%></base:td>
                    <% if (row.getCopyBarcode() == null) { %>
                    <td class="ColRow"><%=form.getCopyStatusLink(row)%></td>
                    <% } else { %>
                    <base:td clazz="ColRow" filtered="true"><%=CodeAsStringHelper.statusAsString(row.getStatus(), row.getDateDue())%></base:td>
                    <% } %>
                    <base:td clazz="ColRow" filtered="true"><%=row.getLocation()%></base:td>
                    <% if(store.isDistrictUser()){ %>
                        <base:td clazz="ColRow" filtered="true"><%=form.getSiteName(row.getSiteID())%></base:td>
                    <% } %>
                    <logic:equal name='<%=CopyStatusForm.FORM_NAME%>' property="showSelectAsset" value="true" scope="request" >
                        <base:td>
                            <input type="image" src='<%=lh.getLocalizedImagePath("/buttons/small/selectsmall.gif")%>' name="<%=form.buildSelectButtonID(row)%>" id="<%=form.buildSelectButtonID(row)%>" alt="Select" title="Select" align="absbottom">
                        </base:td>
                    </logic:equal>
                </tr>
            </logic:iterate>
            </table>
        <% if (form.isShowSelectAsset()){ %>
        <table width="100%"
            id="<%= BaseSearchResultsForm.TABLE_PAGING_FOOTER %>">
            <tr>
                <td>
                <base:searchSummary
                        searchType='Items'
                        startOfSet='<%="" + ( itemsToSkip + 1 ) %>'
                        endOfSet='<%="" + ( itemsToPrint )%>'
                        totalInSet='<%="" + ( itemsInList )%>'
                        tooManyHits='<%="" + ( tooManyHits )%>' />
                </td>
                
                <td class="SmallColHeading tdAlignRight">
                        <base:pageListOutput formName="<%=parentFormName%>" displayTabs="false" />
                </td>
            </tr>
        </table>
        <% } %>
    </logic:equal>

        <logic:notEqual name='<%=CopyStatusForm.FORM_NAME%>' property="<%=CopyStatusForm.FIELD_COLLECTION_TYPE%>" value='<%=""+CollectionType.ASSET%>' scope="request" >
          <table id="CopyFindTable" width="100%" cellspacing="0" cellpadding="4"> 
            <tr>
                <td class="SmallColHeading"><%= MessageHelper.formatMessage("copystatus_Barcode") %></td>
                <td class="SmallColHeading"><%= MessageHelper.formatMessage("copystatus_Title") %></td>
                <td class="SmallColHeading"><%= MessageHelper.formatMessage("copystatus_Author") %></td>
                <td class="SmallColHeading"><%= MessageHelper.formatMessage("copystatus_CopyStatus") %></td>
                <logic:equal name='<%=CopyStatusForm.FORM_NAME%>' property="<%=CopyStatusForm.FIELD_SEARCH_OPTION%>" value='<%=""+CopyStatusForm.SEARCH_OPTION_LIBRARY%>' scope="request" >
                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("copystatus_Call") %></td>
                </logic:equal>
                <logic:equal name='<%=CopyStatusForm.FORM_NAME%>' property="<%=CopyStatusForm.FIELD_SEARCH_OPTION%>" value='<%=""+CopyStatusForm.SEARCH_OPTION_TEXTBOOK%>' scope="request" >
                    <td class="SmallColHeading">Condition</td>
                    <td class="SmallColHeading">Location</td>
                </logic:equal>
            </tr>
        
            <logic:iterate indexId="flipper" id="row" name="<%=CopyStatusForm.FORM_NAME%>" property="list" type="com.follett.fsc.destiny.session.common.data.CopyFindVO">
                <tr valign="top" <%=( ( (1 & flipper.intValue())==0)? "bgColor=\"#E8E8E8\"" : "" )%> >
                    <%
                        // Display item here
                    %>
                    <td class="ColRow"><%=form.getCopyBarcodeLink(row)%></td>
                    <base:td clazz="ColRow" filtered="true"><%=row.getTitle()%></base:td>
                    <base:td clazz="ColRow" filtered="true"><%=row.getAuthor()%></base:td>
                    <base:td clazz="ColRow" filtered="true"><%=CodeAsStringHelper.statusAsString(row.getStatus(), row.getDateDue())%></base:td>
                    <%
                        if (form.getSearchOption()==CopyStatusForm.SEARCH_OPTION_LIBRARY) {
                    %>
                        <base:td clazz="ColRow" filtered="true"><%=row.getCallNumber()%></base:td>
                    <%
                        } else {
                    %>
                        <base:td clazz="ColRow" filtered="true"><%=row.getCopyCondition()%></base:td>
                        <base:td clazz="ColRow" filtered="true"><%=row.getLocation()%></base:td>
                    <%
                        }
                    %>
                </tr>
            </logic:iterate>
        
    </table>
        </logic:notEqual>
<%
    }
%>
<logic:equal name='<%=CopyStatusForm.FORM_NAME%>' property="copyDeleted" value="false" scope="request" >
<logic:equal name='<%=CopyStatusForm.FORM_NAME%>' property="haveCopyToDisplay" value="true" scope="request" >
    <table width="98%" cellpadding="0" cellspacing="0" border="0">
    <tr>
    <td valign="top">
        <table id='<%=CopyStatusForm.TABLE_COPY_INFORMATION%>' border="0" cellpadding="2" width="98%" cellspacing="0">
          <TR>
            <TD vAlign=top colspan="5">
            <table id='<%=CopyStatusForm.TABLE_COPY_TITLE%>' border="0" cellpadding="2" cellspacing="0" align="center">
              <tr>
                <td vAlign=top colspan="4" align="center">
                    <a class="TitleLink" href="<%=form.getTitleDetailLink() %>">
                    <%= ResponseUtils.filter(form.getTitle()) %><em class="iconTitleSearch">&nbsp;</em></a>
                    <!-- do NOT reformat the line above.  the em, nbsp, and ending anchor tags MUST not have any spaces
                    or carriage returns between them or else Internet Explorer will not parse correctly.  TPL, CS Aug. 8, 2009 -->
                <logic:equal name='<%=CopyStatusForm.FORM_NAME%>' property="temporaryCopy" value="true" scope="request">
                    <base:image src="/icons/materialtype/temp.gif" width="19" height="16" alt='<%= MessageHelper.formatMessage("copystatus_Temporary") %>'/>
                </logic:equal>
                </td>
              </tr>
              <%
                  if (CollectionType.ASSET != form.getCollectionType()) {
              %>
                  <tr>
                    <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("copystatus_Author") %></td>
                    <td class=SmallColRow><bean:write name='<%=CopyStatusForm.FORM_NAME%>' property="author"/>&nbsp;</td>
                    <logic:equal name='<%=CopyStatusForm.FORM_NAME%>' property="copyTextbook" value="false" scope="request" >
                        <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("copystatus_CallNumber") %></td>
                        <td class=SmallColRow><bean:write name='<%=CopyStatusForm.FORM_NAME%>' property="callNumber"/>&nbsp;</td>
                    </logic:equal>
                    <logic:equal name='<%=CopyStatusForm.FORM_NAME%>' property="copyTextbook" value="true" scope="request" >
                        <td class="SmallColHeading tdAlignRight">Location</td>
                        <td class=SmallColRow><bean:write name='<%=CopyStatusForm.FORM_NAME%>' property="location"/>&nbsp;</td>
                    </logic:equal>
                  </tr>
               <%
                   }
               %>
               <%
                   if(store.isDistrictUser()){
               %>
                 <tr>              
                 <%
                                    if (CollectionType.ASSET != form.getCollectionType()) {
                                %>
                    <td class="SmallColHeading tdAlignRight"  colspan="1" ><%= MessageHelper.formatMessage("copystatus_Site") %></td>
                    <td class=SmallColRow colspan="3"><bean:write name='<%=CopyStatusForm.FORM_NAME%>' property="siteName"/></td>                    
                 <%
                                          }else{
                                      %>
                    <td class="SmallColHeading tdAlignRight"  colspan="2" ><%= MessageHelper.formatMessage("copystatus_Site") %></td>
                    <td class=SmallColRow colspan="2"><bean:write name='<%=CopyStatusForm.FORM_NAME%>' property="siteName"/></td>                    
                 <%
                                         }
                                     %>
                 </tr>               
               <%
                                   }
                               %>
            </table>
            </TD>
          </TR>
          <TR valign="top">
            <TD class=SmallColRowl colspan="5">
              <img border="0" src="/images/icons/general/line.gif" width="100%" height="1">
            </TD>
          </TR>
          <TR>
            <TD colspan="5" align="center">
              <base:displayMultiColumns tableName="<%=CopyStatusForm.TABLE_COPY_INFORMATION%>" columns="<%=form.getCopyStatusColumns()%>"/>          
            </TD>
          </TR>
          <c:if test="<%=form.isShowComponentsLink()%>">
          <TR>
            <TD class="SmallColHeading" colspan="5">
                <base:spanIfAllowed permissions="<%=new Permission[] {Permission.CAT_EDIT_TEXTBOOK_COPIES, Permission.CAT_ASSET_EDIT_ASSET_ITEM}%>">
                <base:link page='<%=form.getComponentListLink()%>'>
                    <base:image src="/icons/materialtype/kit.gif"/><%= MessageHelper.formatMessage("copystatus_ComponentsIncluded") %></base:link>
                </base:spanIfAllowed>
                <base:spanIfNotAllowed permissions="<%=new Permission[] {Permission.CAT_EDIT_TEXTBOOK_COPIES, Permission.CAT_ASSET_EDIT_ASSET_ITEM}%>">
                <%= MessageHelper.formatMessage("copystatus_ComponentsIncluded") %></base:spanIfNotAllowed>
            </TD>
          </TR>
          </c:if>
          <c:if test="<%=form.isShowContainerInfo()%>">
          <TR>
            <TD class="SmallColHeading" colspan="5" id="<%=CopyStatusForm.ID_CELL_CONTAINER_INFO %>">
                <%=form.gimmeContainerInfo() %>
            </TD>
          </TR>
          </c:if>
        </table>
    </td>
    <td valign="top" class="tdAlignRight">
        <table id="<%=CopyStatusForm.TABLE_COPY_ACTIONS%>" border="0" cellpadding="0" cellspacing="4" class="tdAlignRight" style="border-collapse: collapse" bordercolor="#111111">
          <tr>
            <td class="tdAlignRight">
              <logic:equal name='<%=CopyStatusForm.FORM_NAME%>' property="editable" value="true" scope="request">
              <%
                  Permission[] permsToUse;
                    if ( form.isCopyTextbook() ) {
                      permsToUse = new Permission[] { Permission.CAT_EDIT_TEXTBOOK_COPIES };
                    } else if ( form.isCopyLibrary() ) {
                      permsToUse = new Permission[] { Permission.CAT_EDIT_COPIES };
                    } else if (form.isCopyAsset() ) {
                      permsToUse = new Permission[] { Permission.CAT_ASSET_EDIT_ASSET_ITEM };
                    } else {
                        permsToUse = new Permission[] {};
                    }
              %>
              <base:link permissions='<%=permsToUse%>' id="<%=CopyStatusForm.ID_LINK_EDIT_COPY %>" page='<%=form.getEditCopyLink()%>'>
                <% if (CollectionType.ASSET == form.getCollectionType()) { %>
                <logic:equal name='<%=CopyStatusForm.FORM_NAME%>' property="license" value="true">
                    <base:image src="/buttons/large/editlicense.gif" alt="Edit License" vspace="3"/>
                </logic:equal>
                <logic:equal name='<%=CopyStatusForm.FORM_NAME%>' property="media" value="true">
                    <base:image src="/buttons/large/editmedia.gif" alt="Edit Media"  vspace="3"/>
                </logic:equal>
                <logic:notEqual name='<%=CopyStatusForm.FORM_NAME%>' property="software" value="true">
                    <base:image src="/buttons/large/edititem.gif" alt="Edit Item"  vspace="3"/>
                </logic:notEqual>
                <% } else { %>
                  <base:image src="/buttons/large/editcopy.gif" alt='<%=MessageHelper.formatMessage("editCopy") %>' vspace="3" />
                <% } %>
              </base:link>&nbsp;
              </logic:equal>
            </td>
          </tr>
          <% if (CollectionType.ASSET == form.getCollectionType()) { %>
            <logic:equal name='<%=CopyStatusForm.FORM_NAME%>' property="resourceContainer" value="true">
                <tr>
                    <td class="tdAlignRight">
                        <base:link permission='<%=Permission.CAT_ASSET_EDIT_ASSET_ITEM%>' id="<%=CopyStatusForm.ID_LINK_INCLUDE_ITEMS %>" page='<%=form.getIncludeItemsLink()%>'>
                            <base:image src="/buttons/large/includeitems.gif" alt="Include items"/>
                        </base:link>&nbsp;
                    </td>
                </tr>
            </logic:equal>
          <% } %>
          <logic:equal name='<%=CopyStatusForm.FORM_NAME%>' property="follettEBook" value="false" scope="request" >
              <logic:equal name='<%=CopyStatusForm.FORM_NAME%>' property="copyTextbook" value="false" scope="request" >
                <logic:equal name='<%=CopyStatusForm.FORM_NAME%>' property="copyAsset" value="false" scope="request" >
                  <tr>
                    <td class="tdAlignRight">
                    <%=form.buildHoldQueueLink(request, response, application)%>&nbsp;
                    </td>
                  </tr>
                </logic:equal>
              </logic:equal>
          </logic:equal>
          <logic:equal name='<%=CopyStatusForm.FORM_NAME%>' property="follettEBook" value="true" scope="request" >
              <logic:equal name='<%=CopyStatusForm.FORM_NAME%>' property="copyTextbook" value="false" scope="request" >
                <logic:equal name='<%=CopyStatusForm.FORM_NAME%>' property="copyAsset" value="false" scope="request" >
                  <tr>
                    <td class="tdAlignRight">
                    <%=form.buildAddFollettEBookBookingLink(request, response, application)%>&nbsp;
                    </td>
                  </tr>
                </logic:equal>
              </logic:equal>
          </logic:equal>
          <logic:equal name='<%=CopyStatusForm.FORM_NAME%>' property="showUpdateAssignment" value="true" >          
          <tr>
            <td class="tdAlignRight">
                <base:link permission='<%=Permission.CAT_MANAGE_SOFTWARE_ASSIGNMENTS%>' page='<%=form.getUpdateAssignmentLink()%>'>
                <base:image src="/buttons/large/assignments.gif" alt='<%=MessageHelper.formatMessage("updateAssignments")%>'/>
                </base:link>&nbsp;
            </td>
          </tr>
          </logic:equal>
          <tr>
            <%
                Permission[] permsToUse;
                          if ( form.isCopyTextbook()  ) {
                            permsToUse = new Permission[] { Permission.CIRC_MARK_COPIES_LOST_TEXTBOOK };
                          } else if ( form.isCopyLibrary() ) {
                            permsToUse = new Permission[] { Permission.CIRC_MARK_COPIES_LOST };
                          } else if (form.isCopyAsset() ) {
                            permsToUse = new Permission[] { Permission.CIRC_MARK_ASSET_LOST };
                          } else {
                            permsToUse = new Permission[] {};
                          }
            %>
            <logic:notEqual name='<%=CopyStatusForm.FORM_NAME%>' property="license" value="true">
            <logic:equal name='<%=CopyStatusForm.FORM_NAME%>' property="stateCopyAtSite" value="false">
            <logic:equal name='<%=CopyStatusForm.FORM_NAME%>' property="follettEBook" value="false" scope="request" >
            <logic:equal name='<%=CopyStatusForm.FORM_NAME%>' property="consumable" value="false">
            <logic:equal name='<%=CopyStatusForm.FORM_NAME%>' property="digital" value="false">
                <%
                    if (form.getCopyStatusAsLong().longValue() != CopySpecs.STATUS_LOST
                            && form.getCopyStatusAsLong().longValue() != CopySpecs.STATUS_ON_ORDER
                            && form.getCopyStatusAsLong().longValue() != CopySpecs.STATUS_IN_TRANSIT) {
                %>
                  <base:spanIfAllowed permissions='<%=permsToUse%>'>
                    <td class="tdAlignRight">
                      <base:genericButton src="/buttons/large/marklost.gif" alt='<%=MessageHelper.formatMessage("markLost") %>' name='<%=CopyStatusForm.BUTTON_NAME_MARKLOST%>' />
                    </td>
                  </base:spanIfAllowed>
                <%
                    }
                %>
            </logic:equal>
            </logic:equal>
            </logic:equal>
            </logic:equal>
            </logic:notEqual>
          </tr>
          
        <%
                      if (CollectionType.ASSET == form.getCollectionType()) {
                  %>  
        <base:spanIfAllowed permissions="<%=new Permission[]{Permission.CIRC_MARK_ASSET_LOST}%>" collectionType="<%=form.getCollectionType()%>" >
            <tr>
                <logic:notEqual name='<%=CopyStatusForm.FORM_NAME%>' property="license" value="true">
                <logic:equal name='<%=CopyStatusForm.FORM_NAME%>' property="follettEBook" value="false" scope="request" >
                <logic:equal name='<%=CopyStatusForm.FORM_NAME%>' property="consumable" value="false">
                <logic:equal name='<%=CopyStatusForm.FORM_NAME%>' property="digital" value="false">
                    <%
                        if (form.getCopyStatusAsLong().longValue() != CopySpecs.STATUS_ASSET_STOLEN
                                    && form.getCopyStatusAsLong().longValue() != CopySpecs.STATUS_ON_ORDER
                                            && form.getCopyStatusAsLong().longValue() != CopySpecs.STATUS_IN_TRANSIT) {
                    %>
                      <base:spanIfAllowed permissions='<%=permsToUse%>'>
                        <td class="tdAlignRight">
                          <base:genericButton  src="/buttons/large/markstolen.gif" alt="Mark Stolen" name='<%=CopyStatusForm.BUTTON_NAME_MARKSTOLEN%>' />
                        </td>
                      </base:spanIfAllowed>
                    <%
                        }
                    %>
                </logic:equal>
                </logic:equal>
                </logic:equal>
                </logic:notEqual>
            </tr>
        </base:spanIfAllowed>
        <%
            }
        %>
        
          <logic:equal name='<%=CopyStatusForm.FORM_NAME%>' property="showViewHistoryButton" value="true" scope="request" >
            <tr>
                <td class="tdAlignRight">&nbsp;</td>
            </tr>
            <tr>
                <td class="tdAlignRight">
                  <base:genericButton src="/buttons/large/viewhistory.gif" alt='<%= MessageHelper.formatMessage("viewHistory") %>' name="<%=CopyStatusForm.BUTTON_NAME_VIEWHISTORY%>"/>
                </td>
            </tr>
          </logic:equal> <%-- end show history button --%>
          
          <tr>
            <td class="ColRow tdAlignRight">
                <logic:equal name='<%=CopyStatusForm.FORM_NAME%>' property="showPrintLabel" value="true" scope="request" >
                    <base:link id="<%=CopyStatusForm.ID_LINK_PRINT_LABEL %>" page='<%="/backoffice/servlet/presentcopylabelform.do?copiesAdded=1&singleIDToPrint=" + form.getCopyID() + "&collectionType=" + form.getCollectionType()%>'>
                    <base:image src="/buttons/large/printlabels.gif" alt='<%=MessageHelper.formatMessage("printLabels") %>'/>
                    </base:link>&nbsp;
                </logic:equal>
            </td>
          </tr>
          <logic:equal name='<%=CopyStatusForm.FORM_NAME%>' property="copyTextbook" value="true" scope="request" >
              <tr>
                    <td class="tdAlignRight">&nbsp;</td>
              </tr>
              <tr>
                  <td class="tdAlignRight">&nbsp;</td>
              </tr>
              <tr>
                    <td class="tdAlignRight">&nbsp;</td>
              </tr>
          </logic:equal>
        </table>
    </td>
    </tr>

    </table>

    <%--Current Checkout--%>
<br>

<logic:notEqual name='<%=CopyStatusForm.FORM_NAME%>'  property="<%=CopyStatusForm.PARAM_ASSET_ITEM_TYPE%>" value='<%=""+CopySpecs.ASSET_ITEM_TYPE_SOFTWARE_LICENSE%>'><!-- Beginning of section to exclude for licenses -->
<base:isNotStateContext>
<table id="checkoutTables" border="0" cellpadding="0" cellspacing="0" width="95%">
    <tr>
        <td valign="top" width="50%">
            <base:outlinedTable borderColor="#c0c0c0">
                <tr valign="top">
                    <td>
                        <%=form.getCurrentCheckoutTable() %>
                    </td>
                </tr>
            </base:outlinedTable>
        </td>
        <td valign="top" width="50%">
            <base:outlinedTable borderColor="#c0c0c0" width="100%">
                <tr valign="top">
                    <td>
                        <%=form.getPreviousCheckoutTable() %>
                    </td>
                </tr>
            </base:outlinedTable>
        </td>
    </tr>
</table>
</base:isNotStateContext>

    <base:spanIfAllowed permissions="<%= new Permission[]{Permission.CIRC_VIEW_ITEM_STATUS, Permission.CAT_VIEW_COPY_NOTES, Permission.CAT_VIEW_COPY_NOTES_TEXTBOOK, Permission.CAT_ADD_COPIES, Permission.CAT_EDIT_COPIES, Permission.BACK_OFFICE_INVENTORY_ASSET_COLLECTION } %>" collectionType="<%=form.getCollectionType()%>" >
        <!-- Copy Notes -->
        <logic:equal name='<%= CopyStatusForm.FORM_NAME %>' property="temporaryCopy" value="false">
            <logic:equal name='<%= CopyStatusForm.FORM_NAME %>' property="license" value="false">
                <jsp:include page="/common/shownotes.jsp" flush="true">
                    <jsp:param name="formName" value='<%= CopyStatusForm.FORM_NAME %>'/>
                </jsp:include>
            </logic:equal>
        </logic:equal>
    </base:spanIfAllowed>
        <br/>
      
      
        <!-- Hisotical Notes -->
    <logic:equal value="true" name="<%=CopyStatusForm.FORM_NAME%>" property="viewAssetHistoryNotes">
     
                <jsp:include page="/common/assethistoricalnotes.jsp" flush="true">
                    <jsp:param name="formName" value='<%= CopyStatusForm.FORM_NAME %>'/>
                     <jsp:param name="formType" value="com.follett.fsc.destiny.client.circulation.servlet.CopyStatusForm"/>
                </jsp:include>
        
    </logic:equal>
        
    <br>
    <logic:equal name='<%= CopyStatusForm.FORM_NAME %>' property="copyTextbook" value="false" scope="request" >
        <base:outlinedTable borderColor="#c0c0c0">
            <tr valign="top">
                <td>
                    <table id="circStatTable" width="100%">
                        <tr>
                            <!-- box header and special information -->
                            <td colspan="4" class="ColRowBold"><%= MessageHelper.formatMessage("copystatus_CirculationStatistics") %><br></td>
                        </tr>
                        <tr>
                            <td>
                                <span class="ColHeading"><%= MessageHelper.formatMessage("copystatus_CurrentMonth") %></span>
                                <span class="ColRow">
                                    &nbsp;&nbsp;
                                    <bean:write name='<%= CopyStatusForm.FORM_NAME %>' property="thisMonth"/>
                                </span>
                            </td>

                            <td>
                                <span class="ColHeading"><%= MessageHelper.formatMessage("copystatus_CurrentYear") %></span>
                                <span class="ColRow">
                                    &nbsp;&nbsp;
                                    <bean:write name='<%= CopyStatusForm.FORM_NAME %>' property="thisYear"/>
                                </span>
                            </td>

                            <td>
                                <span class="ColHeading"><%= MessageHelper.formatMessage("copystatus_PreviousYear") %></span>
                                <span class="ColRow">
                                    &nbsp;&nbsp;
                                    <bean:write name='<%= CopyStatusForm.FORM_NAME %>' property="lastYear"/>
                                </span>
                            </td>

                            <td>
                                <span class="ColHeading"><%= MessageHelper.formatMessage("copystatus_Total") %></span>
                                <span class="ColRow">
                                    &nbsp;&nbsp;
                                    <bean:write name='<%= CopyStatusForm.FORM_NAME %>' property="total"/>
                                </span>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
        </base:outlinedTable>
    </logic:equal> <!-- End of CopyTextbook False -->
</logic:notEqual>     <!-- End of section to exclude for licenses -->

</logic:equal>
</logic:equal> <!-- copy has been deleted -->
<logic:present name="circulation_servlet_CopyStatusForm" property="soundFile" scope="request" >

<script language="JavaScript">
<!--
setSound("<bean:write name="circulation_servlet_CopyStatusForm" property="soundFile"/>");
//-->
 </script>
</logic:present>
</base:form>
