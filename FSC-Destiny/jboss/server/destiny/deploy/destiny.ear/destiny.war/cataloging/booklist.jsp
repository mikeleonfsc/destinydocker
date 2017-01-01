<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*, com.follett.fsc.destiny.session.common.*" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.jsptag.MyListActionTag" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%
    BookListForm form = (BookListForm)request.getAttribute( "cataloging_servlet_BookListForm" );
    Permission permissionsForBulkAdd[] = new Permission[]{Permission.CAT_BULK_ADD_TO_BOOKLIST, Permission.CAT_BULK_ADD_TO_BOOKLIST_TEXTBOOK,
        Permission.CAT_BULK_ADD_TO_BOOKLIST_ASSET};

    
%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="com.follett.fsc.destiny.entity.AdvancedSearchQueryData"%>
<c:set var="myform" value='<%=request.getAttribute("cataloging_servlet_BookListForm")%>'/>

<jsp:include page="/common/destinyescape.jsp" />
<script language="JavaScript" type="text/javascript">
  <!--
    function appendCheckboxes(urlString)
    {
        var doWork = <%=(form.getPage() != -1)%>;
        bibList = "";
        if ( doWork ) {
            if (document.forms["<%=BookListForm.FORM_NAME%>"].<%=BookListForm.FIELD_DUPLICATE_BIB%>) {
                 for ( i=0 ; i < document.forms["<%=BookListForm.FORM_NAME%>"].<%=BookListForm.FIELD_DUPLICATE_BIB%>.length ; i++ ){ 
                   if (document.forms["<%=BookListForm.FORM_NAME%>"].<%=BookListForm.FIELD_DUPLICATE_BIB%>[i].checked == true) {
                        bibList += "&<%=BookListForm.FIELD_DUPLICATE_SELECT_ON%>=" + document.forms["<%=BookListForm.FORM_NAME%>"].<%=BookListForm.FIELD_DUPLICATE_BIB%>[i].value;
                   } else {
                        bibList += "&<%=BookListForm.FIELD_DUPLICATE_SELECT_OFF%>=" + document.forms["<%=BookListForm.FORM_NAME%>"].<%=BookListForm.FIELD_DUPLICATE_BIB%>[i].value;
                   }
                }
                if (bibList.length <= 0) {
                   if (document.forms["<%=BookListForm.FORM_NAME%>"].<%=BookListForm.FIELD_DUPLICATE_BIB%>.checked == true) {
                        bibList += "&<%=BookListForm.FIELD_DUPLICATE_SELECT_ON%>=" + document.forms["<%=BookListForm.FORM_NAME%>"].<%=BookListForm.FIELD_DUPLICATE_BIB%>.value;
                   } else {
                        bibList += "&<%=BookListForm.FIELD_DUPLICATE_SELECT_OFF%>=" + document.forms["<%=BookListForm.FORM_NAME%>"].<%=BookListForm.FIELD_DUPLICATE_BIB%>.value;
                   }
                }
            }
        }
        window.open(urlString + bibList, "_self");
    }
  //-->
    <!--
        function generateReport() {
            var reportType = document.cataloging_servlet_BookListForm.reportType.value;
            if (reportType == "<%=BookListForm.OPTION_CITATION_LIST%>"){
                generateCitationList();
            } else {
                generateBibliography();
            }
        }
    
        function generateBibliography() {
            //Set the variables dynamically based on the current values on the form
            var reportTitle = document.cataloging_servlet_BookListForm.reportTitle.value;
            var sortOrder = document.cataloging_servlet_BookListForm.bibReportSortOptions.value;
            var collectionType = document.cataloging_servlet_BookListForm.collectionType.value;
            var listID = document.cataloging_servlet_BookListForm.listID.value;
            var showNotes;
            if ( document.cataloging_servlet_BookListForm.showNotes.checked) {
                showNotes = "true";
            } else {
                showNotes = "false";
            }

            //Build the URL based on the fields in the form
            var url = '/cataloging/servlet/presentbibreportform.do?reportTitle=' + destinyEscape(reportTitle) + '&sort=' + sortOrder + '&listID=' + listID + '&showNotes=' + showNotes + '&collectionType=' + collectionType;

            //Open the new window
            window.open(url, 'Bibliography').focus();                   
        }
    // -->
    <!--
        function generateCitationList() {
            //Set the variables dynamically based on the current values on the form
            var reportTitle = document.cataloging_servlet_BookListForm.reportTitle.value;
            var collectionType = document.cataloging_servlet_BookListForm.collectionType.value;
            var citationType = document.cataloging_servlet_BookListForm.citationType.value;

            //Build the URL based on the fields in the form
            var listID = document.cataloging_servlet_BookListForm.listID.value;
            if (collectionType == "<%=CollectionType.LIBRARY %>" || collectionType == "<%=CollectionType.MEDIA%>" || collectionType == "<%=CollectionType.DCPI%>") {
                var url = '/cataloging/servlet/presentcitationreportform.do?reportTitle=' + destinyEscape(reportTitle) + '&collectionType=' + collectionType + '&listID=' + listID + '&citationType=' + citationType;
            } else {
                var url = '/cataloging/servlet/presentwebsitecitationreportform.do?reportTitle=' + destinyEscape(reportTitle) + '&collectionType=' + collectionType + '&listID=' + listID;
            }

            //Open the new window
            window.open(url, 'CitationList').focus();
        }
    // -->
</script>

<script LANGUAGE="javascript" TYPE="text/javascript">
<!--
    function submitTheForm_ResetReportType() {
        document.<%=BookListForm.FORM_NAME%>.<%=BookListForm.FIELD_RESETTING_REPORT_TYPE%>.value = "true";
        document.<%=BookListForm.FORM_NAME%>.submit();
    }
// -->
</script>

<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handlebooklistform.do" styleId="keywordList" disableIntercepter="true">
<html:hidden property="sideLink"/>
<html:hidden property="previousLanguage"/>
<html:hidden property="collectionType"/>
<html:hidden property="citationType"/>
<html:hidden property="<%= BookListForm.PARAM_DIGITAL_CONTENT_MODE %>"/>
<html:hidden property="<%= BookListForm.FIELD_FROM_REPORTS %>"/>
<html:hidden property="<%= BookListForm.FIELD_RESETTING_REPORT_TYPE %>" value="false"/>
<html:hidden property="<%= BookListForm.PARAM_VISUALSEARCH_NODEID%>"/>
<html:hidden property="<%= BookListForm.PARAM_VISUALSEARCH_ELEMENTARY_MODE %>"/>

    <logic:notEqual name="<%= BookListForm.FORM_NAME %>" property="<%=BookListForm.FIELD_LIST_ACTION %>" value='<%= "" + MyListActionTag.OPTION_SAVE_MY_LIST%>'>
    <%-- May or may not need --%>
    <logic:equal name='<%= BookListForm.FORM_NAME %>' property="displayConfirmation" value="true" scope="request" >
    <br>
        <html:hidden property="confirmSource"/>
       
         <base:confirmBox showWarningIcon="true"
            header="${myform.confirmMessage}"
            yesName="<%=BookListForm.BUTTON_NAME_EMPTY%>"
            noName="<%=BookListForm.BUTTON_NAME_CANCEL_CONFIRM%>" />
       
       
    <br>
    </logic:equal>
    
    <table id='<%= BookListForm.TABLE_SELECT_MYLIST %>'>
        <tr>
            <% if ((form.getStore().isUserLoggedIn() || form.isPublicList()) && !form.isFromVisualSearch()) { %>
                <td>
                    <base:myListSelect name='<%= BookListForm.FIELD_LIST_ID %>' submitOnChange="true" prompt='<%=form.getPrompt()%>' publicList="<%=form.isPublicList()%>" selectedMyListID="<%=form.getListID()%>"/>
                </td>
            <% } else { %>
                <html:hidden property="<%= BookListForm.FIELD_LIST_ID %>"/>
            <%} %>
            
            <td>
                <% if(!form.isPublicList() && !form.isFromVisualSearch()){ %>
                    <base:spanIfAllowed permissions="<%= new Permission[] { Permission.CAT_CREATE_MULTIPLE_MYLISTS } %>">
                        &nbsp;<a id="<%=BookListForm.BUTTON_EDIT_LIST%>" href="<%=form.gimmeEditListLink() %>"><base:image src='/buttons/large/edit.gif' alt='<%= MessageHelper.formatMessage("editList")   %>'/></a>
                        &nbsp;&nbsp;<a id="<%=BookListForm.BUTTON_ADD_LIST%>" href="/cataloging/servlet/presentaddeditmylistsform.do"><base:image src='/buttons/large/addlist2.gif' alt='<%= MessageHelper.formatMessage("addList")   %>'/></a>
                    </base:spanIfAllowed>
                <% } %>
            </td>
        </tr>
    </table>
    <% request.setAttribute("parentFormName", BookListForm.FORM_NAME); %>
    <base:outlinedTableAndTabsWithinThere id="<%=BookListForm.TABLE_MYLIST%>"  selectedTab="<%=form.getSelectedTab()%>" tabs="<%=form.getTabs()%>" tabClass="<%=form.getTabClass()%>" >
    <!-- Just before call to BaseSearchResultsData.jsp -->
    <% if(form.isElementaryMode()){ %>
        <jsp:include page="/cataloging/basesearchresultsdata_elem.jsp" flush="true"/>
    <% }else{ %>
        <jsp:include page="/cataloging/basesearchresultsdata.jsp" flush="true"/>
    <% } %>
    <!-- Just after call to BaseSearchResultsData.jsp -->
    
    <%
        boolean renderEmptyList = false;
    
        if (request.getAttribute("MyKeywordList") != null) {
            List keywordList = (List) request.getAttribute("MyKeywordList");
            if ( keywordList.size() > 0 ) { 
                if (form.getCollectionType() != CollectionType.TEXTBOOK && form.getCollectionType() != CollectionType.ASSET) {
                    if(!form.isFromVisualSearch()) { %> 
                      <TR>
                        <TD>
                          <base:imageLine height="2" width="100%" />
                        </TD>
                      </TR> 
                      <TR>
                       <TD>
                        <TABLE id="<%=BookListForm.TABLE_CREATE_BIB_OR_CITATION %>" cellpadding="3" cellspacing="0" border="0" align="center">
                        <TR>
                            <td class="ColRowBold" colspan="2" valign="top" nowrap>
                            <%=MessageHelper.formatMessage("booklist_Create")%>&nbsp;
                                <% if ((form.getCollectionType() == CollectionType.LIBRARY || form.getCollectionType() == CollectionType.MEDIA)  && form.getDigitalContentMode() != AdvancedSearchQueryData.SEARCH_DIGITAL_RESOURCES_ALL) {  %>
                                    <a name="<%=BookListForm.FIELD_RESETTING_REPORT_TYPE %>"></a>
                                    <html:select onchange="javascript:submitTheForm_ResetReportType()" property="<%= BookListForm.FIELD_REPORT_TYPE %>">
                                    <% if (!UserContext.getMyContextLocaleHelper().isInternationalProduct()) { %>
                                        <html:option value="<%=String.valueOf(BookListForm.OPTION_CITATION_LIST)%>"><%=MessageHelper.formatMessage("booklist_CitationList")%></html:option>
                                    <% } %>
                                    <html:option value="<%=String.valueOf(BookListForm.OPTION_BIBLIOGRAPHY)%>"><%=MessageHelper.formatMessage("booklist_Bibliography")%></html:option>
                                    </html:select>
                                <% } else { %>
                                   <input type="hidden" name="<%=BookListForm.FIELD_REPORT_TYPE %>" value="<%=BookListForm.OPTION_CITATION_LIST %>">
                                <% } %>
                            &nbsp;
                                <html:text property="<%=BookListForm.FIELD_REPORT_TITLE%>" size="20" maxlength="50"/>
                            &nbsp;
                                <a href="javascript:generateReport()" id="<%=BookListForm.ID_BUTTON_GO %>">
                                <base:image align="absbottom" src='/buttons/large/go.gif' alt='<%=MessageHelper.formatMessage("go")  %>' name="<%=BookListForm.BUTTON_GENERATE_BIB_REPORT%>" />
                                    </a>
                            </td>
                        </TR>
                        
                        
                            <logic:equal name="<%=BookListForm.FORM_NAME%>" property="<%=BookListForm.FIELD_REPORT_TYPE%>" value='<%=""+BookListForm.OPTION_BIBLIOGRAPHY%>' >
                                <% if (form.getCollectionType() != CollectionType.ONESEARCH && form.getCollectionType() != CollectionType.WPE) { %>
                                    <TR>
                                    <TD class="ColRow" valign="top" nowrap><%=MessageHelper.formatMessage("booklist_SortBy")%>
                                        <html:select property="<%= BookListForm.FIELD_BIB_REPORT_SORT_OPTIONS %>">
                                        <html:option value="<%=String.valueOf(SortHelper.SORTBYCALLNUMBERAUTHORTITLE)%>"><%=MessageHelper.formatMessage("booklist_CallNumberAuthor")%></html:option>
                                        <html:option value="<%=String.valueOf(SortHelper.SORTBYAUTHOR)%>"><%=MessageHelper.formatMessage("booklist_AuthorTitle")%></html:option>
                                        <html:option value="<%=String.valueOf(SortHelper.SORTBYTITLE)%>"><%=MessageHelper.formatMessage("booklist_TitleAuthor")%></html:option>
                                        </html:select>
                                        </TD>
                                        <TD class="ColRow" valign="top" nowrap>
                                       <html:checkbox property="<%= BookListForm.FIELD_SHOW_NOTES %>"><%=MessageHelper.formatMessage("booklist_ShowNotes")%></html:checkbox>
                                        </TD>
                                    </TR>
                                <% } %>
                            </logic:equal>
                        </TABLE>
                       </TD>
                      </TR>
            <%      } %>
            <%  }
            } else {
                renderEmptyList = true;
           }
        } else {
            renderEmptyList = true;
        }        
        if (renderEmptyList) {
            if(!form.isFromVisualSearch()){
            // We've got no entries in our book list...
                // No items in the list and we're in BookList
        %>
            <TR><TD class="PageHeader" align="center">
                <%=MessageHelper.formatMessage("booklist_YourListIsCurrentlyEmpty")%>
            </TD></TR>
            <base:spanIfAllowed useCanDo="true" permissions='<%=permissionsForBulkAdd%>' collectionType='<%=form.getCollectionType()%>'>
            <logic:equal name='<%= BookListForm.FORM_NAME %>' property="buttonDisplayable" value="true">
                <TR><TD>
                    <base:link useCanDo="true" page='<%=form.getScanToBookListLink()%>' permissions='<%=permissionsForBulkAdd%>' collectionType='<%=form.getCollectionType()%>' showTextAlways='false' id="<%=BookListForm.ID_BUTTON_ADD_TO_MYLIST %>">
                    <base:image src='/buttons/small/addtothislist.gif' alt='<%=MessageHelper.formatMessage("addToThisList")  %>' name="<%=BookListForm.BUTTON_ADD_TO_MYLIST%>"/>
                    </base:link>
                </TD></TR>
            </logic:equal>
            </base:spanIfAllowed>
        <%  }else if(!form.isPublicListRemoved()){ %>
            <TR><TD class="pageHeader" align="center">
                <base:messageBox filterMessage="false" showWarningIcon="false" message="<%=form.getNoResultsMessage()%>"/>
            </TD></TR>
        <%  }
        }%>
    </base:outlinedTableAndTabsWithinThere>
    </logic:notEqual>    
</base:form>
