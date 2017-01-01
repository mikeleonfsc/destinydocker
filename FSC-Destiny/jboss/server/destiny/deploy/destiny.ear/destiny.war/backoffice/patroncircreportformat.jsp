<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.PatronCircReportForm" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.PatronCircReportJob" %>
<%@ page import="java.util.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.common.StringHelper"%>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.data.PatronCircReportParameters"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>



<bean:define id="daysLimiterTypeList" name="<%=PatronCircReportForm.FORM_NAME%>" property="daysLimiterTypeList"/>
<bean:define id="form" name="<%=PatronCircReportForm.FORM_NAME%>" type="com.follett.fsc.destiny.client.backoffice.servlet.PatronCircReportForm"/>

<base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handlepatroncircreportform.do">
<html:hidden property="currentPage" value="<%= String.valueOf(PatronCircReportForm.PAGE_FORMAT) %>"/>
<html:hidden property="<%= PatronCircReportForm.FIELD_INCLUDE_TEXTBOOKS %>"/>
<% if (!form.showUnpaidFinesCheckbox()) { %>
<html:hidden property="<%=PatronCircReportForm.FIELD_LIST_UNPAID_FINES%>"/>
<% } %>
<!-- 
<% if (!form.showUnpaidFinesLimiters()) { %>
    <html:hidden property="<%=PatronCircReportForm.FIELD_LIST_UNPAID_OTHER_FINES%>"/>
<% } %>
 -->

<% if (!form.showLibraryFinesCheckbox()) { %>
    <html:hidden property="<%=PatronCircReportForm.FIELD_LIST_UNPAID_LIBRARY_FINES%>"/>
<% } %>
<% if (!form.showTextbookFinesCheckbox()) { %>
    <html:hidden property="<%=PatronCircReportForm.FIELD_LIST_UNPAID_TEXTBOOK_FINES%>"/>
<% } %>
<% if (!form.showAssetFinesCheckbox()) { %>
    <html:hidden property="<%=PatronCircReportForm.FIELD_LIST_UNPAID_ASSET_FINES%>"/>
<% } %>


<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">
    <logic:equal name="<%=PatronCircReportForm.FORM_NAME%>" property="confirmDelete" value="true" >
        <base:imageSpacer width="1" height="3"/>
        <%
            String headerString = MessageHelper.formatMessage("patroncircreportformat_AreYouSureYouWantToDeleteReportNotice", form.getDeleteReportName());
        %>
        <base:messageBox showWarningIcon="true" message="<%=headerString%>">
            <% if (form.getNumberOfFavorites() > 0) { %>
            <tr><td valign="baseline" align="center" class="ColRow" colspan="2"><ul><li><%=MessageHelper.formatMessage("patroncircreportformat_UsersWithThisReport") %>: <%= form.getNumberOfFavorites() %></li></ul></td></tr>
            <% } %>
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2">
                    <base:yesNo 
                        buttonYesName="<%=PatronCircReportForm.BUTTON_CONFIRM_DELETE%>"
                        buttonNoName="<%=PatronCircReportForm.BUTTON_CANCEL_DELETE%>"
                    />
                </td>
            </tr>
        </base:messageBox>
    </logic:equal>
<base:outlinedTable id="<%=PatronCircReportForm.TABLE_MAIN_TABLE%>" cellpadding="3" cellspacing="0" borderColor='#C0C0C0'>
    <tr>
        <td colspan="2" align="center">
            <table id="<%=PatronCircReportForm.TABLE_WIZARD_HEADER%>">
                <tr>
                    <td><base:image src="/tabs/formatactive.gif" alt='<%=MessageHelper.formatMessage("patroncircreportformat_Format") %>'/></td>
                    <% if (!form.isMediaBookingUser()) { %>
                        <td><base:image src="/tabs/limit.gif" alt='<%=MessageHelper.formatMessage("patroncircreportformat_Limit") %>'/></td>
                        <td><base:image src="/tabs/details.gif" alt='<%=MessageHelper.formatMessage("patroncircreportformat_Details") %>'/></td>
                    <% } else { %>
                        <td><base:image src="/tabs/details2.gif" alt='<%=MessageHelper.formatMessage("patroncircreportformat_Details") %>'/></td>
                    <% } %>
                </tr>
            </table>
        </td>
    </tr>

    <logic:notEqual name="<%=PatronCircReportForm.FORM_NAME%>" property="showSavedReportList" value="false" >
        <tr>
            <td colspan="2" class="Instruction"><%=MessageHelper.formatMessage("patroncircreportformat_IsTheReportOrNotice") %> <a href="#NewOne" title='<%=MessageHelper.formatMessage("patroncircreportformat_SetUpANewReportOrNotice") %>'><%=MessageHelper.formatMessage("patroncircreportformat_SetUpANewOne") %></a>.
            </td>
        </tr>

        <tr>
            <td colspan="2"><base:imageLine height="1" width="100%"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <table id="<%=PatronCircReportForm.TABLE_REPORT_LIST%>" cellpadding="5" cellspacing="0" width="100%">
                    <tr>
                        <td class="SmallColHeading"><%=MessageHelper.formatMessage("patroncircreportformat_SavedReportNotices") %></td>
                        <td class="SmallColHeading"><%=MessageHelper.formatMessage("patroncircreportformat_LastRun") %></td>
                        <td class="SmallColHeading tdAlignRight">
                            &nbsp;
                        </td>
                    </tr>

                    <%
                    List reportList = form.getSavedReportList();
                    boolean flipper = true;
                    Iterator itr = reportList.iterator();
                    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );

                    while ( itr.hasNext() ) {
                        BaseSchedulableJobSpecRecord   rec = (BaseSchedulableJobSpecRecord) itr.next();
                        if ( flipper ) {
                            out.println("<tr bgcolor=\"#E8E8E8\">");
                        }
                        else {
                            out.println("<tr>");
                        }
                        flipper = !flipper;
                        %>
                        <td class="ColRow" valign="top">
                            <%= PatronCircReportForm.formatReportDetailsText(store, rec) %>
                        </td>

                        <td class="ColRow" valign="top">
                            <%
                            Timestamp lastRun = rec.getLastRunTime();
                            if ( lastRun == null ) {
                                out.println( "&nbsp;" );
                            } else {
                                String lastRunText = UserContext.getMyContextLocaleHelper().formatDateAndTime(lastRun);
                                if (rec.getJobID() != null &&
                                    form.jobIsDone(store, rec.getJobID())) {
                                    out.println(form.buildJobViewLink(request, response, store, rec.getJobID(),
                                        lastRunText));
                                } else {
                                    out.println(lastRunText);
                                }
                            }
                            %>
                        </td>

                        <td class="ColRow tdAlignRight" valign="top" NOWRAP>
                            <%
                            String addToFavoritesButton = PatronCircReportForm.BUTTON_ADD_TO_FAVORITES_PREFIX + rec.getJobSpecID();
                            String runButton = PatronCircReportForm.BUTTON_RUN_PREFIX + rec.getJobSpecID();
                            String editButton = PatronCircReportForm.BUTTON_EDIT_PREFIX + rec.getJobSpecID();
                            String deleteButton = PatronCircReportForm.BUTTON_DELETE_PREFIX + rec.getJobSpecID();
                            
                            if (store.getLoggedInUserID() != null && !new Long(0).equals(store.getLoggedInUserID()) && !rec.isFavoriteReport()) {
                            %>
                                <base:genericButton src="/icons/general/addtofavorites.gif" name="<%= addToFavoritesButton %>" alt='<%= MessageHelper.formatMessage("savedreports_AddToFavorites") %>'/>
                                &nbsp;
                            <% } %>
                            <base:genericButton src="/buttons/large/run.gif" name="<%= runButton %>" alt='<%= MessageHelper.formatMessage("run") %>'/>
                            &nbsp;
                            <base:genericButton src="/icons/general/edit.gif" name="<%= editButton %>" alt='<%= MessageHelper.formatMessage("savedreports_EditSavedReport") %>'/>
                            &nbsp;
                            <base:genericButton src="/icons/general/delete.gif" name="<%= deleteButton %>" alt='<%= MessageHelper.formatMessage("savedreports_DeleteSavedReport") %>'/>
                        </td>
                        </tr>
                    <% } %>
                    <%if(!reportList.isEmpty() && form.getHelpIcons()!=null){ %>
                        <tr>
                            <td colspan="3">
                                <base:helpIcons buttonsToOutput='<%= form.getHelpIcons() %>'/>
                            </td>
                        </tr>
                    <% } %>
 
                </table>
            </td>
        </tr>

        <tr>
            <td colspan="2">
                <a name="NewOne"><base:imageLine height="1" width="100%"/></a>
            </td>
        </tr>
        <tr>
            <td class="SmallColHeading" colspan="2"><%=MessageHelper.formatMessage("patroncircreportformat_SetUpANewReportOrNotice") %></td>
        </tr>

    </logic:notEqual>

    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top">
            <nobr><%=MessageHelper.formatMessage("patroncircreportformat_Show") %></nobr>
        </td>
        <td class="ColRowBold">
            <% if (!form.isMediaBookingUser()) { %>
                <html:checkbox property="<%=PatronCircReportForm.FIELD_LIST_CHECKOUT_OVERDUES%>"><%=MessageHelper.formatMessage("patroncircreportformat_CheckedOutOverdueMaterials") %></html:checkbox>
            <% } else { %>
                <%=MessageHelper.formatMessage("patroncircreportformat_CheckedOutOverdueMaterials") %>
                <html:hidden property="<%=PatronCircReportForm.FIELD_LIST_CHECKOUT_OVERDUES%>" value="on"/>
            <% } %>
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td class="ColRow">
            &nbsp;&nbsp;<html:radio property="<%=PatronCircReportForm.FIELD_LIST_TYPE%>" value="<%=PatronCircReportJob.LIMIT_CHECKED_OUT_OVERDUE_BY_OVERDUE%>"><%=MessageHelper.formatMessage("patroncircreportformat_AllThatAreCurrentlyOverdue") %></html:radio>
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td class="ColRow">
        <!-- Please do not reformat this html.  As weird as it looks, we need to leave this way to avoid too much white space on 
            the outputted page. -->           
            &nbsp;&nbsp;<html:radio property="<%=PatronCircReportForm.FIELD_LIST_TYPE%>" value="<%=PatronCircReportJob.LIMIT_CHECKED_OUT_OVERDUE_RELATIVE_DATES%>">
            <nobr><%=MessageHelper.formatMessage("patroncircreportformat_ThatAre") %>&nbsp;<html:select 
                    property="daysLimiterType">
                    <html:options collection="daysLimiterTypeList" property="stringCode"
                        labelProperty="stringDesc"/>
                </html:select>&nbsp;<html:text property="daysStart" size="5"
                 maxlength="3"/>&nbsp;<%=MessageHelper.formatMessage("patroncircreportformat_To") %>&nbsp;<html:text property="daysEnd" 
                    size="5" maxlength="3"/>&nbsp;<%=MessageHelper.formatMessage("patroncircreportformat_Days") %>
                <base:helpTag helpFileName="d_materials_overdue_by_due_in_range.htm"/>
                </nobr>
            </html:radio>
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td class="ColRow">
        <!-- Please do not reformat this html.  As weird as it looks, we need to leave this way to avoid too much white space on 
            the outputted page. -->           
            &nbsp;&nbsp;<html:radio property="<%=PatronCircReportForm.FIELD_LIST_TYPE%>" value="<%=PatronCircReportJob.LIMIT_CHECKED_OUT_OVERDUE_BY_DUE_DATE%>">
            <nobr><%=MessageHelper.formatMessage("patroncircreportformat_ThatAreDueFrom") %>&nbsp;<base:dateRange 
                    dateFrom="<%=form.getDateFrom()%>"
                    dateTo="<%=form.getDateTo()%>"
                />
                <base:helpTag helpFileName="d_materials_due_from_date_range.htm"/>
                </nobr>
            </html:radio>
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td class="ColRow">
            &nbsp;&nbsp;<html:radio property="<%=PatronCircReportForm.FIELD_LIST_TYPE%>" value="<%=PatronCircReportJob.LIMIT_CHECKED_OUT_OVERDUE_BY_ALL_CHECKED_OUT%>"><%=MessageHelper.formatMessage("patroncircreportformat_AllThatAreCheckedOut") %></html:radio>
        </td>
    </tr>
    <% if (form.showAssignedAssetsCheckbox()) { %>
    <tr>
        <td>&nbsp;</td>
        <td class="ColRowBold">
            <html:checkbox property="<%=PatronCircReportForm.FIELD_INCLUDE_ASSIGNED_ASSETS%>"><%=MessageHelper.formatMessage("patroncircreportformat_AssetsAssignedToACustodian") %></html:checkbox>
        </td>
    </tr>
    <% } 
    if (form.showLibraryFinesCheckbox()) { %>
    <tr>
        <td>&nbsp;</td>
        <td class="ColRowBold">
            <html:checkbox property="<%=PatronCircReportForm.FIELD_LIST_UNPAID_LIBRARY_FINES%>"><%=MessageHelper.formatMessage("patroncircreportformat_UnpaidLibraryFines") %></html:checkbox>
        </td>
    </tr>
    <% } 
    if (form.showTextbookFinesCheckbox()) { %>
    <tr>
        <td>&nbsp;</td>
        <td class="ColRowBold">
            <html:checkbox property="<%=PatronCircReportForm.FIELD_LIST_UNPAID_TEXTBOOK_FINES%>"><%=MessageHelper.formatMessage("patroncircreportformat_UnpaidTextbookFines") %></html:checkbox>
        </td>
    </tr>
    <% } 
    if (form.showAssetFinesCheckbox()) { %>
    <tr>
        <td>&nbsp;</td>
        <td class="ColRowBold">
            <html:checkbox property="<%=PatronCircReportForm.FIELD_LIST_UNPAID_ASSET_FINES%>"><%=MessageHelper.formatMessage("patroncircreportformat_UnpaidAssetFines") %></html:checkbox>
        </td>
    </tr>
    <% } 
    if (form.showUnpaidFinesLimiters()) { %>
    <tr>
        <td>&nbsp;</td>
        <td class="ColRowBold" nowrap="nowrap">
            <html:checkbox property="<%=PatronCircReportForm.FIELD_LIST_UNPAID_OTHER_FINES%>"><%=MessageHelper.formatMessage("patroncircreportformat_UnpaidPatronFines") %></html:checkbox>
            &nbsp;
            <base:helpTag helpFileName="<%=PatronCircReportForm.HELP_UNPAID_PATRON_FINES %>"  />
        </td>
    </tr>
    <% } %>
    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top"><%=MessageHelper.formatMessage("patroncircreportformat_Format") %></td>
        <td class="ColRow">
            <html:radio property="formatResults" value="<%=PatronCircReportJob.FORMAT_REPORT%>"><%=MessageHelper.formatMessage("patroncircreportformat_Report") %></html:radio>
             -- <%=MessageHelper.formatMessage("patroncircreportformat_Output") %> <html:select property="<%=PatronCircReportForm.FIELD_EXPORT_TYPE%>"><html:option value='<%="" + PatronCircReportParameters.EXPORT_TYPE_PDF%>'>PDF</html:option><html:option value='<%="" + PatronCircReportParameters.EXPORT_TYPE_XLS%>'>Microsoft Excel</html:option></html:select>
        </td>
    </tr>
    <logic:equal name="<%=PatronCircReportForm.FORM_NAME%>" property="emailToHomeroom" value="true" >
        <tr>
            <td>&nbsp;</td>
            <td class="ColRow">
                <html:radio property="formatResults" value="<%=PatronCircReportJob.FORMAT_EMAIL_TO_HOMEROOMS%>"><%=MessageHelper.formatMessage("patroncircreportformat_EmailToHomerooms") %></html:radio>
            </td>
        </tr>
    </logic:equal>
    <tr>
        <td>&nbsp;</td>
        <td class="ColRow">
            <html:radio property="formatResults" value="<%=PatronCircReportJob.FORMAT_NOTICE%>"><%=MessageHelper.formatMessage("patroncircreportformat_Notices") %></html:radio>
            <% if (!form.isMediaBookingUser()) { %>-- <%=MessageHelper.formatMessage("patroncircreportformat_Language") %>:&nbsp;<%=form.renderLanguageOptions()%>
            <% } %>
        </td>
    </tr>
    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <tr>
        <td class="ColRow" colspan="2" align="center">
            <% if (!form.isMediaBookingUser()) { %>
                <base:genericButton src="/buttons/large/continue.gif" alt='<%=MessageHelper.formatMessage("continue") %>' name="<%=PatronCircReportForm.BUTTON_LIMIT%>" />
            <% } else { %>
                <base:genericButton src="/buttons/large/continue.gif" alt='<%=MessageHelper.formatMessage("continue") %>' name="<%=PatronCircReportForm.BUTTON_DETAILS%>" />
            <% } %>
        </td>
    </tr>
</base:outlinedTable>
</base:form>
