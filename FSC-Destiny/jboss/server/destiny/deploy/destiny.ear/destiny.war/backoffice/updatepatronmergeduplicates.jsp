<%@page import="com.follett.fsc.destiny.client.common.DisplayHelper"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.BaseListForm"%>
<%@ page import="com.follett.fsc.destiny.client.common.PageCalculator" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.PatronSpecs" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>


<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@page import="com.follett.fsc.destiny.client.common.data.Tab"%>
<%@page import="com.follett.fsc.destiny.client.circulation.servlet.BasePatronListForm"%>


<%@page import="com.follett.fsc.destiny.client.backoffice.jsptag.UpdatePatronMergeResultDisplayTag"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%><base:messageBox strutsErrors="true"/>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
	String formName = (String)request.getAttribute(PatronLookupForm.ATTRIBUTE_FORM_NAME);
    UpdatePatronMergeDuplicatesForm form = (UpdatePatronMergeDuplicatesForm)request.getAttribute(formName);
    String focusControl = "";
    if( !form.isPrinterFriendly()){
        focusControl = UpdatePatronMergeDuplicatesForm.FIELD_SEARCH;
    }
    Tab[] tabs = BasePatronListForm.getTabs(store);
%>
<base:form action="/backoffice/servlet/handleupdatepatronmergeduplicatesform.do" focus="<%=focusControl%>">

<logic:equal name='<%= form.getFormName() %>' property="printerFriendly" value="false">
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=form.BUTTON_TRAP_ENTER_KEY%>">
</logic:equal>

    <html:hidden property="<%=PatronLookupForm.PARAM_ONLY_MY_PATRONS_CHANGED%>" value="false"/>
    <html:hidden property="<%=PatronLookupForm.PARAM_STORED_SEARCH%>"/>
    
    <html:hidden property="<%=UpdatePatronMergeDuplicatesForm.FIELD_SHOW_LESS_KEY%>"/>
    <html:hidden property="<%=UpdatePatronMergeResultDisplayTag.RADIO_PREFERRED_RECORD%>"/>
 
    <base:outlinedTableAndTabsWithinThere id="tableUpdatePatron" formName="<%= UpdatePatronMergeDuplicatesForm.FORM_NAME %>" tabs="<%= tabs %>" selectedTabID="<%= IUpdatePatronForm.ID_TAB_MERGE_DUPLICATES %>" selectedTab='<%=MessageHelper.formatMessage("updatepatronmergeduplicates_MergeDuplicates") %>' hideTabsWhenPrinterFriendly="true" borderColor="#C0C0C0" width="100%">
    <tr>
        <td class="TableHeading"><%= MessageHelper.formatMessage("updatepatronmergeduplicates_MergeDuplicatePatrons") %></td>
        
        <td class="tdAlignRight">
        <% if (form.getSelectedPatronsList() != null && form.getSelectedPatronsList().size() > 1 ) { 
        %>
            <logic:equal name='<%= form.getFormName() %>' property="printerFriendly" value="false">
                <base:genericButton src="/icons/general/nextlonger.gif" alt='<%=MessageHelper.formatMessage("updatepatronmergeduplicates_Next")%>' name="<%=UpdatePatronMergeDuplicatesForm.BUTTON_NEXT%>"/>
            </logic:equal>
        <% 
            } 
        %>
        </td>
    </tr>
    <tr>
        <td class="ColRow"> 
                <%= MessageHelper.formatMessage("updatepatronmergeduplicates_Step1Of2", "<b>", "</b>") %></td>
        <td class="tdAlignRight">
            <logic:equal name='<%= form.getFormName() %>' property="printerFriendly" value="false">
                <base:cancelButton/>
            </logic:equal>
        </td>
    </tr>
    <tr>
        <td colSpan="2">
                <base:imageLine printerFriendly="<%=form.isPrinterFriendly() %>"   height="1" width="100%"/>
        </td>
    </tr>
    <tr>
        <td colspan="2" width="100%">
            <html:hidden property="<%=UpdatePatronMergeDuplicatesForm.PARAM_PATRONS_LIST_OUT%>"/>
            <logic:equal name='<%= form.getFormName() %>' property="printerFriendly" value="false">
	            <html:hidden property="action"/>
                <center>
                <table border="0" cellpadding="0" cellspacing="0" >
                    <tr>
                        <td class="ColRow tdAlignLeft">
                            <html:radio property="<%=UpdatePatronMergeDuplicatesForm.FIELD_FIND_DUPLICATE_PATRONS%>" value="false" 
                                onclick='<%="document." + UpdatePatronMergeDuplicatesForm.FORM_NAME + "." + UpdatePatronMergeDuplicatesForm.FIELD_SEARCH + ".focus();"%>'
                            />
                            <%= MessageHelper.formatMessage("updatepatronmergeduplicates_FindPatronRecordsWith") %>&nbsp;
                            <html:text property="<%=UpdatePatronMergeDuplicatesForm.FIELD_SEARCH %>" size="20" maxlength="90"
                                onclick='<%="document." + UpdatePatronMergeDuplicatesForm.FORM_NAME + "." + UpdatePatronMergeDuplicatesForm.FIELD_FIND_DUPLICATE_PATRONS + "[0].checked = true"%>'
                            />&nbsp;<%= MessageHelper.formatMessage("updatepatronmergeduplicates_In") %>
                            <base:selectPatronByType name="<%=UpdatePatronMergeDuplicatesForm.FIELD_SEARCH_TYPE %>" selected="<%=form.getSearchType()%>" onlyMyPatrons="<%=!form.isDistrictUser()%>" siteID="<%=form.getSiteID()%>" returnAllEvenIfWeFindAMatchByBarcode="true"/>
                        </td>
                    </tr>
                    <tr>
                        <td class="ColRow tdAlignLeft">
                            <html:radio property="<%=UpdatePatronMergeDuplicatesForm.FIELD_FIND_DUPLICATE_PATRONS%>" value="true" />
                            <%= MessageHelper.formatMessage("updatepatronmergeduplicates_FindPossibleDuplicatedPatronRecords") %>
                        </td>
                    </tr>
                    <tr>
                        <td class="ColRow tdAlignLeft" colspan="2">
                            &nbsp;<input type="image" src='<%=UserContext.getMyContextLocaleHelper().getLocalizedImagePath("/buttons/large/search.gif")%>' border="0" alt="Search" name="<%= PatronLookupForm.BUTTON_SEARCH %>" align="absbottom" />
                        </td>
                    </tr>
                </table>
                </center>
            </logic:equal>
            
<%
    List patronList = (List) request.getAttribute("patronlist");
    if (patronList != null && patronList.size() > 0) {

        int itemsInList = patronList.size();
        int currentPage = PageCalculator.getCurrentPage(form);
        int itemsToSkip = PageCalculator.getFirstNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
        int itemsToPrint = PageCalculator.getOnePastLastNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
%>
                
                <html:hidden property="page" value='<%= "" + currentPage %>' />
                <%--<base:imageLine printerFriendly="<%=form.isPrinterFriendly() %>"  height="1" width="100%"/>--%>
                <table id="<%=UpdatePatronMergeDuplicatesForm.TABLE_SEARCH_SUMMARY %>" width="100%" cellspacing="0" cellpadding="2">
                    <logic:equal name='<%= form.getFormName() %>' property="printerFriendly" value="false">
                        <tr><td colspan="2" class="ColRow">&nbsp;</td></tr>
                        <tr>
                            <td class="ColRowBold">
                                <%= form.getSearchSummary() %>
                            </td>
                            <td class="tdAlignRight" valign="middle" >
                                 <logic:equal name='<%= form.getFormName() %>' property="showPrinterFriendly" value="true">
                                        <logic:present name='<%= form.getFormName() %>' property="printerFriendlyLink">
                                        <base:link page="<%= form.getPrinterFriendlyLink() %>" target="printerFriendly" id="<%=UpdatePatronMergeDuplicatesForm.ID_PRINTER_FRIENDLY %>"><base:image src="/buttons/small/printerfriendly.gif" alt='<%= MessageHelper.formatMessage("printable") %>'/></base:link>
                                        </logic:present>
                                </logic:equal>
                            <td>
                        </tr>
                    </logic:equal>
                    <tr>
                        <td class="SmallColHeading tdAlignLeft" >
                           <%=form.gimmeCurrentlySelectedCountMessage() %>
                        </td>
                        <td class="SmallColHeading tdAlignRight">
                            <logic:equal name='<%= form.getFormName() %>' property="printerFriendly" value="false">
                                <logic:equal name='<%= form.getFormName() %>' property="<%=UpdatePatronMergeDuplicatesForm.FIELD_FIND_DUPLICATE_PATRONS%>" value="true" >
                                   <base:listOutput formName="<%= form.getFormName() %>" />
                                </logic:equal>
                                <logic:equal name='<%= form.getFormName() %>' property="<%=UpdatePatronMergeDuplicatesForm.FIELD_FIND_DUPLICATE_PATRONS%>" value="false" >
                                   <base:pageListOutput formName="<%= form.getFormName() %>" />
                                </logic:equal>
                            </logic:equal>
                            <logic:equal name='<%= form.getFormName() %>' property="printerFriendly" value="true">
                                &nbsp;
                            </logic:equal>
                        </td>
                    </tr>
                </table>
                <logic:equal name='<%= form.getFormName() %>' property="printerFriendly" value="false">
                    <hr>
                </logic:equal>
                
                <logic:equal name='<%= form.getFormName() %>' property="<%=UpdatePatronMergeDuplicatesForm.FIELD_FIND_DUPLICATE_PATRONS%>" value="false" >
                    <table id=<%=UpdatePatronMergeDuplicatesForm.TABLE_PATRON_INFO_DETAIL%> width="100%" cellspacing="0" cellpadding="4" border="0">
                        <%boolean patronOutput = false; %>
                        <logic:iterate offset='<%=""+itemsToSkip%>' length='<%=""+(itemsToPrint - itemsToSkip)%>' indexId="flipper" id="row" name="<%= form.getFormName() %>" property="list" type="com.follett.fsc.destiny.session.backoffice.data.FindSitePatronValue">
                            <% if (patronOutput) { %>
                                <tr><td><base:imageLine printerFriendly="<%=form.isPrinterFriendly() %>"/></td></tr>
                            <% } else {
                                patronOutput = true;
                            }%>
                        <tr><td>
                            <base:updatePatronMergeResultDisplay 
                                mode = "<%=UpdatePatronMergeResultDisplayTag.MODE_SEARCH_LIST %>"
                                patronValue="<%= row %>"
                                printerFriendly="<%=form.isPrinterFriendly() %>"/>
                        </td></tr>
                        </logic:iterate>
                    </table>
                </logic:equal>
                <logic:equal name='<%=form.getFormName()%>' property="<%=UpdatePatronMergeDuplicatesForm.FIELD_FIND_DUPLICATE_PATRONS%>" value="true" >
                    <table id="<%=UpdatePatronMergeDuplicatesForm.TABLE_PATRON_DUPLICATE%>" width="100%" cellspacing="0" cellpadding="4" border="0">
                        <tr>
                            <td class="SmallColHeading"><%= MessageHelper.formatMessage("updatepatronmergeduplicates_Patron") %></td>
                            <td class="SmallColHeading" align="center"><%= MessageHelper.formatMessage("updatepatronmergeduplicates_PossibleDuplicates") %></td>
                            <td class="SmallColHeading">
                                &nbsp;
                            </td>
                        </tr>
                        <logic:iterate indexId="flipper" id="listRow" name="<%=form.getFormName()%>" property="duplicatePatronList" type="com.follett.fsc.destiny.session.backoffice.data.FindPatronListValue">
                            <tr valign="top" <%=( ( !form.isPrinterFriendly() && (1 & flipper.intValue())==0)? "bgColor=\"#E8E8E8\"" : "" )%> >
                                    <td class="ColRow"><%=ResponseUtils.filter(listRow.getName())%>
                                        <a name="<%=UpdatePatronMergeDuplicatesForm.ANCHOR_BASE_DUPLICATE_PATRON%><%=flipper.intValue()%>"></a>
                                            
                                       
                                    </td>
                                <td class="ColRow" align="center"><%=listRow.getPossibleDuplicatesCountAsString()%></td>
                                
                                <%
                                                                    if(!form.isPrinterFriendly()){
                                                                %>
                                <td class="SmallColRow"><a class="DetailLink" href="<%=form.gimmeShowLinkForDuplicates(listRow, flipper.intValue())%>">
                                    <%
                                        if (listRow.isShowLess()) {
                                    %>
                                            <%= MessageHelper.formatMessage("updatepatronmergeduplicates_ShowLess") %>&nbsp;<base:image src="/icons/general/showless.gif"  alt='<%= MessageHelper.formatMessage("updatepatronmergeduplicates_ShowLess") %>'/>
                                    <%
                                        } else {
                                    %>
                                             <%= MessageHelper.formatMessage("updatepatronmergeduplicates_ShowMore") %>&nbsp;<base:image src="/icons/general/showmore.gif"  alt='<%= MessageHelper.formatMessage("updatepatronmergeduplicates_ShowMore") %>'/>
                                    <%
                                        }
                                    %>
                                </a></td>
                                <%
                                    }else{
                                %>
                                <td>&nbsp;</td>
                                <%
                                    }
                                %>
                                
                            </tr>
                            <c:if test="${listRow.showLess}">
                            <tr>
                            <td colspan="3">
                                <table id=<%=UpdatePatronMergeDuplicatesForm.TABLE_PATRON_INFO_DETAIL%> width="100%" cellspacing="0" cellpadding="4" border="0">
                                    <logic:iterate indexId="subflipper" id="dRow" collection="<%=listRow.getFindPatronList()%>" type="com.follett.fsc.destiny.session.backoffice.data.FindSitePatronValue">
                                        <% if ( subflipper > 0 ) { %>
                                            <tr><td><base:imageLine printerFriendly="<%=form.isPrinterFriendly() %>"/></td></tr>
                                        <% } %>
                                    <tr><td>    
                                        <base:updatePatronMergeResultDisplay 
                                            mode = "<%=UpdatePatronMergeResultDisplayTag.MODE_SEARCH_LIST %>"
                                            patronValue="<%= dRow %>"
                                            printerFriendly="<%=form.isPrinterFriendly() %>"/>
                                    </td></tr>
                                    </logic:iterate>
                                </table>
                                </td>
                                </tr>
                            </c:if>
                        </logic:iterate>
                    </table>
                </logic:equal>

<logic:equal name='<%= form.getFormName() %>' property="printerFriendly" value="false">
    <table width="100%" cellspacing="0" cellpadding="2">
        <tr>
            <td>
            &nbsp;
            </td>
            <td class="SmallColHeading tdAlignRight">
                <logic:equal name='<%= form.getFormName() %>' property="printerFriendly" value="false">
                    <logic:equal name='<%= form.getFormName() %>' property="<%=UpdatePatronMergeDuplicatesForm.FIELD_FIND_DUPLICATE_PATRONS%>" value="true" >
                         <base:listOutput formName="<%= form.getFormName() %>" />
                    </logic:equal>
                    <logic:equal name='<%= form.getFormName() %>' property="<%=UpdatePatronMergeDuplicatesForm.FIELD_FIND_DUPLICATE_PATRONS%>" value="false" >
                         <base:pageListOutput formName="<%= form.getFormName() %>" topOfPageLinks="false"/>
                    </logic:equal>
                </logic:equal>
                <logic:equal name='<%= form.getFormName() %>' property="printerFriendly" value="true">
                    &nbsp;
                </logic:equal>
            </td>
        </tr>
    </table>
</logic:equal>
<% 
    } else {
%>
    <table id="searchSummary" width="100%" cellspacing="0" cellpadding="2">
        <tr>
            <td colspan = "2">
                &nbsp;
            </td>
        </tr>
        <tr>
            <td class="SmallColHeading" colspan="2">
                <%= MessageHelper.formatMessage("updatepatronmergeduplicates_PatronsCurrentlySelected0", new Long(form.getSelectedPatronsList().size())) %>
            </td>
         </tr>
    </table>
<%}%>


 
    <table id="<%=UpdatePatronMergeDuplicatesForm.TABLE_CURRENTLY_ASSIGNED %>" width="100%">
    <tr>
    <base:sectionHeading   printerFriendly="<%=form.isPrinterFriendly() %>" 
        heading='<%= MessageHelper.formatMessage("updatepatronmergeduplicates_CurrentlySelected") %>' />
    </tr>
    
    <% if ( form.getSelectedPatronsList().isEmpty() ) { %>
        <tr>
        <td align="center" class="SmallColHeading"><%= MessageHelper.formatMessage("updatepatronmergeduplicates_NoPatronsSelected") %></td>
        </tr>
    <% } else { %>
        <logic:iterate 
        indexId="subflipper2" 
        id="selectedRow" 
        collection="<%=form.getSelectedPatronsList()%>" 
        type="com.follett.fsc.destiny.session.backoffice.data.FindSitePatronValue">
        
        <% if ( subflipper2 > 0 ) { %>
            <tr><td><base:imageLine printerFriendly="<%=form.isPrinterFriendly() %>"/></td></tr>
        <% } %>
        <tr>
        <td>
        <base:updatePatronMergeResultDisplay 
        mode = "<%=UpdatePatronMergeResultDisplayTag.MODE_SELECTED_LIST %>"
        patronValue="<%= selectedRow %>"
        printerFriendly="<%=form.isPrinterFriendly() %>"/>
        </td>
        </tr>
        </logic:iterate>
        
    <%}%>
    </table>



</td></tr>
<tr>
    <td colSpan="2">
        <base:imageLine printerFriendly="<%=form.isPrinterFriendly() %>" height="1" width="100%"/>
        <br/>
    </td>
</tr>
</base:outlinedTableAndTabsWithinThere>
</base:form>
