<%@page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.data.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@page import="org.apache.struts.util.ResponseUtils"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.remote.data.OutstandingTextbookObligationsReportJobParams"%><base:messageBox strutsErrors="true"/>


<%
    String formName = OutstandingTextbookObligationsForm.FORM_NAME;
    String formAction = "/backoffice/servlet/handleoutstandingtextbookobligationsform.do";
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    OutstandingTextbookObligationsForm form = (OutstandingTextbookObligationsForm)request.getAttribute(formName);
%>

<base:form action="<%=formAction%>" >
    <script language="JavaScript" type="text/javascript">
  <!--
    function submitSelectByDropdownChange() {    
        document.<%=OutstandingTextbookObligationsForm.FORM_NAME%>.<%=OutstandingTextbookObligationsForm.FIELD_SELECT_BY_DROPDOWN_CHANGED%>.value = true;           
        document.<%=OutstandingTextbookObligationsForm.FORM_NAME%>.submit();
    }
  // -->
    </script>
    
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=OutstandingTextbookObligationsForm.BUTTON_TRAP_ENTER%>">

    <html:hidden property="<%=OutstandingTextbookObligationsForm.FIELD_ACTION%>"/>
    <html:hidden property="<%=OutstandingTextbookObligationsForm.FIELD_JOB_SPEC_ID%>"/>
    <html:hidden property="<%=OutstandingTextbookObligationsForm.PARAM_REPORT_NAME%>"/>
    <html:hidden property="<%=OutstandingTextbookObligationsForm.FIELD_SELECT_BY_DROPDOWN_CHANGED%>" value="false"/>

    <base:outlinedTableAndTabsWithinThere id="<%=OutstandingTextbookObligationsForm.TABLE_MAIN%>" borderColor='#C0C0C0' selectedTab="<%=form.getTabNameForCollectionType()%>" selectedTabID="<%=form.getTabNameForCollectionType()%>" tabs="<%=form.getTabsForCollectionType()%>">
        <tr>
            <td colspan="3" class="TableHeading" nowrap>
                <%=ResponseUtils.filter(form.getReportHeading())%>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight" valign = "top" width = "25%">
                Show
            </td>
            <td class="ColRow" width = "35%" nowrap>
                <html:checkbox property="<%=OutstandingTextbookObligationsForm.FIELD_UNNEEDED_BOOKS%>">
                    Books not needed for current schedule
                </html:checkbox>
                <base:helpTag helpFileName="d_books_not_needed_for_current_schedule.htm"/>
                <br>
                <html:checkbox property="<%=OutstandingTextbookObligationsForm.FIELD_LOST_NO_FINE%>">
                    Lost books with no fine assessed
                </html:checkbox><br>
                <html:checkbox property="<%=OutstandingTextbookObligationsForm.FIELD_LOST_UNPAID_FINE%>">
                    Lost books with unpaid fines
                </html:checkbox>
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight">
                Select by
            </td>
            <td class="ColRow" colspan="2">
                <%= form.getSelectByDropdown() %> &nbsp; 
             <% if (form.getSelectBy() == OutstandingTextbookObligationsReportJobParams.SELECT_BY.SELECT_BY_DATE_ADDED.getVal()) { %>
                   From <base:dateRange
                   fromName ="<%=OutstandingTextbookObligationsForm.FIELD_SELECT_FROM %>" 
                   toName ="<%=OutstandingTextbookObligationsForm.FIELD_SELECT_TO %>" 
                    dateFrom="<%=form.getSelectFrom()%>" 
                    dateTo="<%=form.getSelectTo()%>" />
                    
             <% } else if (form.getSelectBy() == OutstandingTextbookObligationsReportJobParams.SELECT_BY.SELECT_BY_HOMEROOM.getVal()) { %>
                   From&nbsp;
                          <base:homeroomBySiteDropDown siteID="<%=form.getReportSiteID() %>" currentSelection="<%=form.getHomeroomFrom() %>" showOnlyAssignedHomerooms="true" fieldName="<%=BasePatronReportForm.FIELD_HOMEROOM_FROM %>" displayNameForNoHomeroom="Any Homeroom"/>
                    &nbsp;to&nbsp;
                          <base:homeroomBySiteDropDown siteID="<%=form.getReportSiteID() %>" currentSelection="<%=form.getHomeroomTo() %>" showOnlyAssignedHomerooms="true" fieldName="<%=BasePatronReportForm.FIELD_HOMEROOM_TO %>" displayNameForNoHomeroom="Any Homeroom"/>
             <% } else { %>
                    From&nbsp;<html:text property="<%=OutstandingTextbookObligationsForm.FIELD_SELECT_FROM%>"  maxlength="30"/>
                    to&nbsp;<html:text property="<%=OutstandingTextbookObligationsForm.FIELD_SELECT_TO%>" maxlength="30"/>
                <% } %>
            </td>
        </tr>      
        <tr>
            <td class="ColRowBold tdAlignRight" valign = "top">
                Sorted by
            </td>
            <td class="ColRow" colspan="2">
                <html:radio property="<%=OutstandingTextbookObligationsForm.FIELD_SORTED_BY %>" value='<%="" + OutstandingTextbookObligationsForm.SORT_BY_PATRON_NAME%>'>Patron Name</html:radio><br/><br/>
                <html:radio property="<%=OutstandingTextbookObligationsForm.FIELD_SORTED_BY %>" value='<%="" + OutstandingTextbookObligationsForm.SORT_BY_SELECTION%>'></html:radio> 
                    <%= form.getSortByDropdown(true) %> and then by <%= form.getSortByDropdown(false) %> 
            </td>
        </tr>     
        
        <tr>
            <td colspan="3"><base:imageLine height="1" width="100%"/></td>
        </tr>
        
        <tr>
            <td class="ColRowBold" colspan="3">
                Limit the results to...
                <br>
            </td>
        </tr>   
        <tr>
            <td class="ColRowBold tdAlignRight" valign="middle">My&nbsp;Patrons</td>
            <td valign="top" colspan="2">
                <table cellspacing="0" cellpadding="0" border="0"><tr><td valign="top">
                <table cellspacing="0" cellpadding="0" border="0" id="<%=OutstandingTextbookObligationsForm.TABLE_MY_PATRONS%>">
                    <tr>        
                         <td colspan="2" nowrap valign="top">
                            <base:patronTypesList formName="<%= OutstandingTextbookObligationsForm.FORM_NAME %>" allowToSaveWithoutAnyPatronTypesSelected="true"/>
                        </td>
                    </tr>
                    <tr>
                    <td class="ColRow">
                        <html:checkbox property="<%=OutstandingTextbookObligationsForm.FIELD_LIMIT_BY_GRADUATING%>"/>
                    </td>
                    <td class="ColRow" width="100%" nowrap>Graduating in
                        <html:text property="<%=OutstandingTextbookObligationsForm.FIELD_GRAD_YEAR%>" size="4" maxlength="4"/>
                    </td>
                    </tr>
                </table>
                </td><td><base:imageSpacer height="1" width="15"/></td>
                <td valign="top">
                <table cellspacing="0" cellpadding="0" border="0" id="<%=OutstandingTextbookObligationsForm.TABLE_STATUSES%>">
                <tr>
                    <td class="ColRowBold tdAlignRight" valign="top"><nobr>Status</nobr></td>
                    <td class="ColRow">
                        <html:checkbox property="<%= OutstandingTextbookObligationsForm.FIELD_INCLUDE_ACTIVE %>" />
                    </td>
                    <td class="ColRow" width="100%">Active</td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight" valign="top">&nbsp;</td>
                    <td class="ColRow">
                        <html:checkbox property="<%= OutstandingTextbookObligationsForm.FIELD_INCLUDE_INACTIVE %>"/>
                    </td>
                    <td class="ColRow" width="100%">Inactive</td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight" valign="top">&nbsp;</td>
                    <td class="ColRow">
                        <html:checkbox property="<%= OutstandingTextbookObligationsForm.FIELD_INCLUDE_RESTRICTED %>"/>
                    </td>
                    <td class="ColRow" width="100%">Restricted</td>
                </tr>
                </table>
                </td></tr></table>
            </td>
        </tr> 
        <tr>
            <td colspan="3"><base:imageLine height="1" width="100%"/></td>
        </tr>
        
        <tr>
            <td class="ColRowBold tdAlignRight">
                Format
            </td>
            <td colspan="2">
                <html:select property="<%= OutstandingTextbookObligationsForm.FIELD_REPORT_FORMAT %>">
                    <html:option value='<%= "" + OutstandingTextbookObligationsForm.REPORT_FORMAT_PDF %>'>PDF</html:option>
                    <html:option value='<%= "" +OutstandingTextbookObligationsForm.REPORT_FORMAT_EXCEL %>'>Microsoft Excel</html:option>
                </html:select>
            </td>
        </tr>
        <tr>
            <td colspan="3" class="ColRowBold" align="center">
            <table>
                <tr>
                    <c:choose>
                        <c:when test="<%=OutstandingTextbookObligationsForm.ACTION_RUN.equals(form.getAction()) %>">
                            <td valign="top" class="ColRowBold">
                                <base:genericButton name="<%=OutstandingTextbookObligationsForm.BUTTON_SAVE_AND_RUN%>" alt="Save and Run Report" src="/buttons/large/saveandrun.gif"/>
                            </td>
                            <td class="ColRowBold">
                                <base:cancelButton/>
                            </td>
                        </c:when>
                        <c:otherwise>
                        <% if (form.getCollectionType() == CollectionType.TEXTBOOK) { %>
                            <td valign="top" class="ColRowBold">
                                <base:genericButton name="<%=OutstandingTextbookObligationsForm.BUTTON_SAVE_SETUP%>" src="/buttons/large/savesetup.gif" alt="Save Report Setup"/>
                            </td>
                            <td class="ColRowBold">
                                <base:reportButton/>
                            </td>
                         <% } else { %>
                         <td class="ColRowBold" valign="top" align="left">
                              <base:reportButton/>
                            </td>
                            <td>
                            </td>
                         <% }%>
                        </c:otherwise>
                    </c:choose>                    
                </tr>
            </table>
        </td></tr>
    </base:outlinedTableAndTabsWithinThere>
</base:form>
