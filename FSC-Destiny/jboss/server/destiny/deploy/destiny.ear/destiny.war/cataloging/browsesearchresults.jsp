<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.cataloging.data.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%
    BrowseSearchResultsForm form = (BrowseSearchResultsForm)request.getAttribute(BrowseSearchResultsForm.FORM_NAME);
    String browsePrev = form.getBrowsePrevious();
    String browseNext = form.getBrowseNext();
    boolean havePrevNextButtons = !StringHelper.isEmpty(browsePrev); // if have previous we assume have next
%>

<%-- We put a dummy form in here so that the spacing that it creates matches the spacing on the search tab--%>
<form  name="<%=BrowseSearchResultsForm.FORM_NAME%>">
</form>

<table width="95%" id="<%=BrowseSearchResultsForm.TABLE_MAIN%>" border="0" cellpadding="0" cellspacing="0">
    <tr>
        <td colspan="1">
            <base:outlinedTable borderColor='#c0c0c0' width="100%" cellpadding="0">
                <tr>
                <td>
                    <table id="<%=BrowseSearchResultsForm.TABLE_HEADER%>" width="100%">
                        <tr>
                            <td width="21">
                                <%if(havePrevNextButtons) {%>
                                    <base:link page='<%= form.getPreviousLink(request, response) %>' id="<%=BrowseSearchResultsForm.ID_BUTTON_PREVIOUS %>">
                                        <base:image src="/icons/general/previous.gif" width="21" height="26" alt='<%= MessageHelper.formatMessage("browsesearchresults_Previous",  browsePrev) %>'/>
                                    </base:link>
                                <%}%>
                            </td>
                            <td><span class="ColRowBold"><%=form.getSearchSummary()%>&nbsp;</span>
                                <span class="SmallColRow"><br>[<a href="<%=form.getLinkFollowingDescURL()%>" id="<%=BrowseSearchResultsForm.ID_LINK_REFINE_SEARCH %>"><%= MessageHelper.formatMessage("browsesearchresults_RefineYourSearch")%></a>]</span>
                            </td>
                            <td class="tdAlignRight" width="21">
                                <%if(havePrevNextButtons) {%>
                                    <base:link page='<%= form.getNextLink(request, response) %>' id="<%=BrowseSearchResultsForm.ID_BUTTON_NEXT %>">
                                        <base:image src="/icons/general/next.gif" width="21" height="26" alt='<%= MessageHelper.formatMessage("browsesearchresults_Next",  browseNext) %>' />                                    
                                    </base:link>
                                <%}%>
                            </td>
                        </tr>
                    </table>
                </td>
                </tr>
                <tr> <!-- DO NOT break this like apart for better readibility it messes up how the page renders-->
                <td align="center"><base:imageLine width="100%" height="1"/></td>
                </tr>
                <tr>
                    <td>
                        <table id="<%=BrowseSearchResultsForm.TABLE_BROWSE_RESULTS%>" width="100%" cellspacing="3">
<%                          List firstBrowseList = form.getFirstColumn();
                            List secondBrowseList = form.getSecondColumn();

                        if (firstBrowseList.size() == 0){
%>                          <tr><td class="ColRowBold"><%= MessageHelper.formatMessage("browsesearchresults_NoMatchesFound")%></td></tr>
<%                      } else {
                            for(int pos = 0; pos < firstBrowseList.size(); pos++) {
                                BrowseResultValue value = (BrowseResultValue) firstBrowseList.get(pos);
%>
                                <tr><%=form.renderBrowseItemLink(request, response, value)%>
                                    <td width="9" class="tdAlignRight" valign="top">&nbsp;</td>
<%
                                    if(secondBrowseList.size() > pos) {
                                        value = (BrowseResultValue) secondBrowseList.get(pos);
%>
                                     <%=form.renderBrowseItemLink(request, response, value)%>
<%                                  } else {
                                    %>  <td width="9" class="tdAlignRight" valign="top">&nbsp;</td> <%
                                    }
%>
                                </tr>
<%
                            } // end while have more browse results
                        } // end if browse list not empty
                %></table> <!-- TABLE_BROWSE_RESULTS -->
                </td>
            </tr><%
        if (havePrevNextButtons) { // if have previous we assume have next
            %><tr><td><table id="<%=BrowseSearchResultsForm.TABLE_PREV_NEXT%>" border="0" cellpadding="0" cellspacing="0" width="100%">
                        <tr><td valign="middle" width="21"><base:link page='<%= form.getPreviousLink(request, response) %>' id="<%=BrowseSearchResultsForm.ID_BUTTON_PREVIOUS %>">
                                        <base:image src="/icons/general/previous.gif" width="21" height="26" alt='<%= MessageHelper.formatMessage("browsesearchresults_Previous",  browsePrev) %>'/>
                                </base:link>
                            </td>
                            <td valign="middle" class="SmallColRow">
                                &nbsp;<%=browsePrev%>
                            </td>
                            <td valign="middle" class="SmallColRow tdAlignRight">
                                <%=browseNext%>&nbsp;
                            </td>
                            <td valign="middle" class="tdAlignRight" width="21">
                                <base:link page='<%= form.getNextLink(request, response) %>' id="<%=BrowseSearchResultsForm.ID_BUTTON_NEXT %>">
                                        <base:image src="/icons/general/next.gif" width="21" height="26" alt='<%=MessageHelper.formatMessage("browsesearchresults_Next",  browseNext) %>' />                                    
                                </base:link></td></tr>
                    </table>  <!-- TABLE_PREV_NEXT -->
                </td>
            </tr>
<%      } // value != null
%>
            </base:outlinedTable>
        </td>
    </tr>
</table> <!-- TABLE_MAIN -->
