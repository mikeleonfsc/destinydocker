
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>


<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.util.*"%>
<%@ page import="com.follett.fsc.destiny.util.language.*"%>
<%@ page import="com.follett.fsc.destiny.util.Permission"%>
<%@ page import="com.follett.fsc.destiny.client.common.PageCalculator" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.BaseListForm" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ page import="com.follett.fsc.destiny.client.common.PageCalculator" %>
<%
request.setAttribute("parentFormName", "circulation_servlet_NewHoldForm");
String parentFormName = (String)request.getAttribute("parentFormName");
NewHoldForm form = (NewHoldForm)request.getAttribute(parentFormName);

        int itemsInList = form.getTotalCount();
        int currentPage = PageCalculator.getCurrentPage(form);
        int itemsToSkip = PageCalculator.getFirstNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
        int itemsToPrint = PageCalculator.getOnePastLastNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
        
        
        boolean showBookListDropdown = true;
        
        
%>

                
<%@page import="com.follett.fsc.destiny.entity.AdvancedSearchQueryData"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.BaseListForm" %>

               <tr>
                    <td valign="top">
                        <html:hidden property="page" value='<%= Integer.toString(currentPage) %>' />
                        <html:hidden property="descend"/>
                        <html:hidden property="dateDescend"/>
                        <html:hidden property="totalCount"/>
                        <html:hidden property="lastSort"/>
                        <html:hidden property="prevSearchTerm" value="<%= form.getPrevSearchTerm() %>"/>
                        <table id="<%= NewHoldForm.TABLE_PAGING_HEADER %>" width="100%">
                            <tr>
                            
                                <td colspan="2" valign="bottom">
                                    <span class="ColRowBold">
                                        <%= form.buildHoldILLSearchTermMessage() %>                                   
                                    </span>
                                </td>

                                <td class="tdAlignRight">
                                &nbsp;
                                </td>
                            </tr>
                            <tr>
                                <td nowrap valign="top" colspan="3">
                                    <table id="<%= NewHoldForm.TABLE_RESULT_ACTIONS %>" border="0" cellspacing="0" cellpadding="0" width="100%">
                                        <tr>
                                            <td>
                                                &nbsp;
                                            </td>
                                            <td class="tdAlignRight">

                                               &nbsp;
                                            </td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>


                            <% if (itemsInList == 0) {%>
                            <tr><td>
                            
                                <base:messageBox filterMessage="false" showWarningIcon="false" message='<%="<ul>" + form.getNoResultsMessage() + "</ul>"%>'/>

                            </td></tr>
                            <% } else { %>
                                <tr>
                                <td colspan="3"><base:imageLine height="2" width="100%"/></td>
                                </tr>
                                <tr valign="bottom">
                                    <td colspan="3">
                                      <table id="<%=NewHoldForm.TABLE_PAGING_NUMBER_HEADER %>" border="0" cellpadding="0" width="100%">
                                        <tr>
                                        <td>
                                        <base:searchSummary searchType='Titles' startOfSet='<%="" + ( itemsToSkip + 1 ) %>'
                                            endOfSet= '<%="" + ( itemsToPrint )%>'
                                            totalInSet = '<%="" + ( itemsInList )%>'
                                            />
                                        </td>

                                         <td>
                                                <span class="SmallColHeading"><%= MessageHelper.formatMessage("basesearchresultsdata_SortBy") %> </span>
                                                <%= form.gimmeHoldILLDrawSortComboBox()%>
                                                <base:genericButton src="/buttons/small/smallgo.gif" absbottom="true" alt="Sort" name="<%= NewHoldForm.BUTTON_CHANGE_SORT %>" />
                                        </td>
    <% } %>
    
                                        <td class="SmallColHeading tdAlignRight">
                                            <base:pageListOutput formName="<%=parentFormName%>" displayTabs="true"/>
                                        </td>
                                        </tr>
                                     </table>
                                     </td>
                                </tr>
                                <tr>
                                <td colspan="3"><base:imageLine height="2" width="100%" /></td>
                                </tr>
                            </table> 
<!-- TABLE_PAGING_HEADER -->



                                <table id="<%=NewHoldForm.TABLE_COPY_FIND %>" width="100%" cellspacing="0" cellpadding="2">

                                <!-- This is the main hitlist -->
                                    <jsp:include page="/common/titlelist.jsp">
                                        <jsp:param name="formName" value="<%=parentFormName%>"/>
                                    </jsp:include>


                                </table>

                            
                            <!-- Hitlist Footer -->
                            <table width="100%" id="<%= NewHoldForm.TABLE_PAGING_FOOTER %>">
                                <tr>
                                    <td>
                                        <base:searchSummary searchType='Titles' startOfSet='<%="" + ( itemsToSkip + 1 ) %>'
                                            endOfSet= '<%="" + ( itemsToPrint )%>'
                                            totalInSet = '<%="" + ( itemsInList )%>'
                                            />
                                    </td>
                                    <td class="SmallColHeading tdAlignRight">
                                        <base:pageListOutput formName='<%=parentFormName%>' topOfPageLinks="false" displayTabs="false"/>
                                    </td>
                                </tr>

                        
                    </td>
                </tr>

                
