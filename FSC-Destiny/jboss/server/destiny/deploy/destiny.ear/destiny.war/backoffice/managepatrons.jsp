<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.BaseListForm"%>
<%@ page import="com.follett.fsc.destiny.client.common.PageCalculator" %>
<%@ page import="com.follett.fsc.destiny.session.common.SortHelper"%>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@page import="com.follett.fsc.destiny.session.backoffice.ejb.PatronFindFacadeSpecs"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%>
<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@page import="com.follett.fsc.destiny.util.Permission"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag"%>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>


<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );
    String formName = (String)request.getAttribute(ManagePatronsForm.ATTRIBUTE_FORM_NAME);
    ManagePatronsForm form = (ManagePatronsForm)request.getAttribute(formName);
    List messageList = form.getHoldsMessage();
    if ( messageList != null && messageList.size() > 0 ) { %>

    
<%@page import="com.follett.fsc.destiny.client.common.servlet.GenericForm"%><base:messageBox>
    <tr>
        <td valign="baseline" class="Error">
        <%= MessageHelper.formatMessage("managepatrons_TheFollowingActionsNeedToBeTaken") %>
        <ul>
        <% for ( int x = 0; x < messageList.size(); x++ ) { %>
            <li>
                <%= ResponseUtils.filter( ( String ) messageList.get( x ) ) %>
            </li>
        <% } %>
        </ul>
        </td>
     </tr>
     </base:messageBox>
<%  } else { %>
    <base:messageBox strutsErrors="true"/>
<%  } %>
<%
    String focusString = form.isPrinterFriendly() ? "" : ManagePatronsForm.FIELD_SEARCH;
    String borderColor = form.isPrinterFriendly() ? "" : "#C0C0C0"; 
%>

<base:form action="<%= form.getParentFormAction() %>" focus="<%= focusString%>">
<base:outlinedTable id="<%=ManagePatronsForm.TABLE_OUTLINE %>" borderColor="<%=borderColor %>">

            <html:hidden property="<%=ManagePatronsForm.PARAM_ONLY_MY_PATRONS_CHANGED%>" value="false"/>
            <html:hidden property="<%=ManagePatronsForm.PARAM_STORED_SEARCH%>"/>
            <html:hidden property="descend"/>
            <html:hidden property="oldSortOption"/>
            <logic:equal name='<%= form.getFormName() %>' property="printerFriendly" value="false">
                <tr>
                    <td>
                        <table border="0" cellpadding="0" cellspacing="0">
                            <tr>
                                <td class="FormLabel">
                                    <html:hidden property="action"/><%= MessageHelper.formatMessage("managepatrons_Find") %>&nbsp;</td>
                                <td class="ColRow" nowrap>
                                    <html:text property="searchString" size="20" maxlength="90"/>&nbsp;<%= MessageHelper.formatMessage("managepatrons_In") %>&nbsp;
                                    <base:selectPatronByType name="searchType" selected="<%=form.getSearchType()%>" onlyMyPatrons="<%=!(form.isSearchAcrossDistrict())%>" siteID="<%=form.getSiteID()%>" returnAllEvenIfWeFindAMatchByBarcode="true"/>
                                    &nbsp;&nbsp;
                                </td>
                                <td>
                                    <base:genericButton src="/buttons/large/search.gif" alt='<%= MessageHelper.formatMessage("search") %>' name="<%= ManagePatronsForm.BUTTON_SEARCH %>"/>
                                </td>
                            </tr>
                            <tr>
                                <td>&nbsp;</td>
                                <td class="ColRow">
                                    <% if (form.isShowSearchAcrossDistrict()) { %>
                                        <html:checkbox property="<%= ManagePatronsForm.FIELD_SEARCH_ACROSS_DISTRICT %>"/><%= MessageHelper.formatMessage("managepatrons_SearchAcrossTheDistrict") %><% } else { %>
                                        &nbsp;
                                        <html:hidden property="<%= ManagePatronsForm.FIELD_SEARCH_ACROSS_DISTRICT %>" value="false"/>
                                      <% } %>
                                      &nbsp;&nbsp;
                                      <input type="checkbox" name="<%=ManagePatronsForm.PARAM_LIMIT_TO_ACTIVE_PATRONS%>" value="on"<%=
                                          form.gimmeCheckedForLimitToActivePatrons()%>><%=MessageHelper.formatMessage("managepatrons_OnlyActivePatrons")%>
                                </td>
                                <td>
                                     &nbsp;
                                </td>
                            </tr>
                        </table>
                    </td>
                    <td class="tdAlignRight">
                        <table>
                            <tr>
                                <td class="ColRow" align="center">
                                   <% if (store.canView(Permission.BACK_OFFICE_ADD_EDIT_PATRONS)) { %><%= MessageHelper.formatMessage("managepatrons_Nonexistent") %><br>
                                        <a href="/backoffice/servlet/presenteditpatrongeneralinfoform.do" id="<%= ManagePatronsForm.ID_BUTTON_NEW_PATRON %>">
                                            <base:image src="/buttons/large/newpatrons.gif" alt='<%= MessageHelper.formatMessage("newPatron") %>'/>
                                        </a>
                                        <%} %>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>    
            </logic:equal>
            <%
                if (request.getAttribute("patronlist") != null) {
                    List patronList = (List) request.getAttribute("patronlist");
            
                    int itemsInList = patronList.size();
                    int currentPage = PageCalculator.getCurrentPage(form);
                    int itemsToSkip = PageCalculator.getFirstNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
                    int itemsToPrint = PageCalculator.getOnePastLastNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
            %>
                <html:hidden property="page" value='<%= "" + currentPage %>' />
                <tr><td colspan="3">
                <table id="searchSummary" width="100%" cellspacing="0" cellpadding="2">
                    <logic:equal name='<%= form.getFormName() %>' property="printerFriendly" value="false">
                        <tr>
                            <td class="ColRow">
                                <%= form.getSearchSummary() %>
                            </td>
                            <td>&nbsp;</td>
                            <td class="ColRow tdAlignRight">
                                <logic:equal name='<%= form.getFormName() %>' property="showPrinterFriendly" value="true">
                                   <base:link id="<%=GenericForm.ID_PRINTER_FRIENDLY %>" page="<%= form.getPrinterFriendlyLink() %>" target="printerFriendly"><base:image src="/buttons/small/printerfriendly.gif" alt='<%= MessageHelper.formatMessage("printable") %>'/></base:link>
                               </logic:equal>
                            <td>
                        </tr>
                    </logic:equal>
                        <tr>
                            <td>
                                <%-- print "Patrons 1 - 25 out of 52" --%>
                                <base:searchSummary searchType='<%=MessageHelper.formatMessage("managepatrons_Patrons") %>'
                                    startOfSet = '<%=String.valueOf(itemsToSkip+1)%>'
                                    endOfSet   = '<%=String.valueOf(itemsToPrint)%>'
                                    totalInSet = '<%=String.valueOf(itemsInList)%>'/>
                            </td>
                            <td align="center">
                                <% if (!form.isPrinterFriendly()) { %>
                                    <span class="SmallColHeading"><%= MessageHelper.formatMessage("managepatrons_SortBy") %> </span>
                                    <%= form.gimmeSortComboBox()%>
                                    <base:genericButton src="/buttons/small/smallgo.gif" absbottom="true"  alt='<%= MessageHelper.formatMessage("go") %>' name="<%= ManagePatronsForm.BUTTON_CHANGE_SORT %>" />
                                <% } %>
                            </td>
                            
                            <td class="SmallColHeading tdAlignRight">
                                <logic:equal name='<%= form.getFormName() %>' property="printerFriendly" value="false">
                                    <base:pageListOutput formName="<%= form.getFormName() %>" />
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
                        <table id="PatronFindTable" width="100%" cellspacing="0" cellpadding="4" border="0">
                        <logic:equal name='<%= form.getFormName() %>' property="printerFriendly" value="true">
                            <tr>
                                <td class="SmallColHeading" colspan="4">&nbsp;</td>
                            </tr>
                        </logic:equal>

                        <logic:iterate offset='<%=""+itemsToSkip%>' length='<%=""+(itemsToPrint - itemsToSkip)%>' indexId="flipper" id="row" name="<%= form.getFormName() %>" property="list" type="com.follett.fsc.destiny.session.backoffice.data.FindSitePatronValue">
                            <tr valign="top">
                                <% // Display item here %>
                                <td  colspan="4">
                                    <base:patronSearchResultDisplay patronValue="<%=row %>" printerFriendly="<%=form.isPrinterFriendly() %>"/>
                                </td>
                            </tr>
                            <% if (flipper < itemsToPrint) { %>
                            <tr>
                                <td colspan="4">
                                    <base:imageLine width="100%"  />
                                </td>
                            </tr>
                            <% } %>
                        </logic:iterate>
                    </table>
                    
                </td></tr>
                <logic:equal name='<%= form.getFormName() %>' property="printerFriendly" value="false">
                <tr>
                    <td colspan="4">
                        <table width="100%" cellspacing="0" cellpadding="4" border="0">
                        <tr>
                            <td colspan="4">
                                <% if (store.isDistrictPatronizer()){ %>
                                <base:helpIcons buttonsToOutput="<%=new int[]{HelpIconsTag.ICON_PRIMARY_SITE_PATRON, HelpIconsTag.ICON_ADDITIONAL_SITE_PATRON} %>"/>
                                <% } else if (store.isMediaSite()){ %>
                                <base:helpIcons buttonsToOutput="<%=new int[]{HelpIconsTag.ICON_LOCAL_SITE_PATRON} %>"/>
                                <% } else { %>
                                <base:helpIcons buttonsToOutput="<%=new int[]{HelpIconsTag.ICON_LOCAL_SITE_PATRON, HelpIconsTag.ICON_OFF_SITE_PATRON} %>"/>
                                <% } %>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="4">
                            <hr>
                            </td>
                        </tr>
                            <tr>
                            <td>
                                <%-- print "Patrons 1 - 25 out of 52" --%>
                                <base:searchSummary searchType='<%=MessageHelper.formatMessage("managepatrons_Patrons") %>'
                                    startOfSet = '<%=String.valueOf(itemsToSkip+1)%>'
                                    endOfSet   = '<%=String.valueOf(itemsToPrint)%>'
                                    totalInSet = '<%=String.valueOf(itemsInList)%>'/>
                            </td>
                            <td align="center">
                                &nbsp;
                            </td>
                            <td class="SmallColHeading tdAlignRight">
                                <base:pageListOutput formName="<%= form.getFormName() %>" topOfPageLinks="false" />
                            </td>
                        </tr>
                        </table>
                    </td>
                </tr>
                </logic:equal>
                <%
                    } else {
                %>
            <html:hidden property="sort"/>
                <%
                    } 
                %>


</base:outlinedTable>
</base:form>

