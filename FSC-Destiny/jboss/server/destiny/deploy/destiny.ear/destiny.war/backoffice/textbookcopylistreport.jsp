<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.TextbookCopyListReportForm" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.data.TextbookTitleCopyReportJobParams" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.data.TextbookBaseReportJobParams" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag"%>
<%@page import="org.apache.struts.util.ResponseUtils"%>
<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>


<%@page import="com.follett.fsc.destiny.session.consortium.ejb.ConsortiumFacadeSpecs"%>
<base:messageBox strutsErrors="true"/>

    <SCRIPT LANGUAGE="javascript" TYPE="text/javascript">
    <!--
        function submitTheForm() {
            document.<%=TextbookCopyListReportForm.FORM_NAME%>.submit();
        }
        function trapEnter(e) {
          var whichCode = (window.Event) ? e.which : e.keyCode;
          if (e.keyCode == 13) {
            return false;
          }
          return true;
        }
    // -->
    </SCRIPT>
<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
%>
<%
    TextbookCopyListReportForm form = (TextbookCopyListReportForm)request.getAttribute(TextbookCopyListReportForm.FORM_NAME);
%>

<base:form action="/backoffice/servlet/handletextbookcopylistreportform.do">
<html:hidden property="<%=TextbookCopyListReportForm.BUTTON_CHANGE_SUBMIT%>" value="0"/>
<html:hidden property="<%=TextbookCopyListReportForm.FIELD_COLLECTION_TYPE%>" value='<%= String.valueOf(form.getCollectionType()) %>' />
<html:hidden property="<%=TextbookCopyListReportForm.FIELD_JOB_SPEC_ID%>"/>
<html:hidden property="<%=TextbookCopyListReportForm.FIELD_ACTION%>"/>
<html:hidden property="<%=TextbookCopyListReportForm.PARAM_REPORT_NAME%>"/>
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">

<base:outlinedTableAndTabsWithinThere id="<%=TextbookCopyListReportForm.TABLE_TEXTBOOK_TITLE_COPY_LIST_REPORT%>" borderColor='#C0C0C0' selectedTab="<%=form.getLeftTab().getAltText()%>" selectedTabID="<%=form.getLeftTab().getName() %>" tabs="<%=form.getTabs()%>">
    <tr>
        <td colspan="2" class="TableHeading">
             <%=ResponseUtils.filter(form.getReportHeading())%>
        </td>
    </tr>

    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>

    <base:isStateContext>
        <tr>
            <td class="ColRowBold tdAlignRight" valign="top">
                For
            </td>
            <td class="ColRow">
                <base:selectDistrict 
                    submitOnChange="true"
                    name="<%=TextbookCopyListReportForm.FIELD_DISTRICT_CONTEXT%>" 
                    selectedDistrictContext="<%=form.getDistrictContext() %>"
                    mustContainTextbookSites = "true"
                    includeStateTextbookOffice = "true"
                    includeStatewide = "<%=form.isIncludeStatewide() %>"
                    useSelectADistrict = "true"
                    />
            </td>
        </tr>
        <%if(!StringHelper.isEmpty(form.getDistrictContext())
            && !SelectDistrictTag.VALUE_STATEWIDE.equals(form.getDistrictContext())
            && !form.hasSelectedStateTextbookOffice()
            && !SelectDistrictTag.SELECT_A_DISTRICT_TEXT.equals(form.getDistrictContext()) 
            && !SelectDistrictTag.BLANK_SITE.equals(form.getDistrictContext())
         ){%>
            <tr>
                <td class="ColRowBold tdAlignRight">&nbsp;</td>
                <td colspan="2">
                    <base:selectSite 
                    useSelectASite="true"
                    name="<%= form.FIELD_SITE_ID %>"
                    selectedSiteID="<%= form.getReportSiteID().toString()%>" 
                    mode="<%=SelectSiteTag.MODE_GROUP_BY_SITE_TYPE_TEXTBOOK_ONLY %>"
                    includeLibrarySites="false"
                    includeTextbookSites="true"
                    includeMediaSites="false"
                    contextName="<%=form.getDistrictContext()%>"
                    includeAssetSites="false"
                    includeAllSites="true"
                    onChangeAction="submitDropDown()"
                    />
                 </td>   
            </tr>
        <%} %>        
    </base:isStateContext>
    <base:isNotStateContext>
        <base:isDistrictUser>
        	<tr>
        		<td class="ColRowBold tdAlignRight" valign="top">
        			For
        		</td>
        		<td class="ColRow">
            	    <base:selectSite 
            	        submitOnChange="true" 
                        includeAllLibraries="true" 
            	        name="<%=TextbookCopyListReportForm.FIELD_SITE_ID%>" 
            	        selectedSiteID='<%= form.getReportSiteID().toString()%>'
            	        includeLibrarySites="false"
                		includeTextbookSites="true"
                		includeMediaSites="false"
                		includeAssetSites="false"
            	        />
        		</td>
        	</tr>
        </base:isDistrictUser>
        <base:isNotDistrictUser>
        	<html:hidden property="<%=TextbookCopyListReportForm.FIELD_SITE_ID%>"/>
        </base:isNotDistrictUser>
    </base:isNotStateContext>

    <tr>
        <td class="ColRowBold tdAlignRight" valign="top">
            <nobr>Select &amp; sort by</nobr>
        </td>
        <td class="ColRow">
            <html:select onchange="javascript:submitTheForm()" property="<%=TextbookCopyListReportForm.FIELD_SELECT_AND_SORT_BY%>">
                <html:option value="<%=TextbookTitleCopyReportJobParams.SELECT_SORT_BY_TITLE%>">Title</html:option>
                <html:option value="<%=TextbookBaseReportJobParams.SELECT_SORT_BY_PUBLISHER%>">Publisher</html:option>
                <html:option value="<%=TextbookBaseReportJobParams.SELECT_SORT_BY_VENDOR%>">Vendor</html:option>
                <html:option value="<%=TextbookBaseReportJobParams.SELECT_SORT_BY_ISBN%>">ISBN</html:option>
                <% if(form.showCopyCategoryOption()){ %>
                    <html:option value="<%=TextbookBaseReportJobParams.SELECT_SORT_BY_COPY_CATEGORY%>">Copy Category</html:option>
                <% } %>
                <html:option value="<%=TextbookBaseReportJobParams.SELECT_SORT_BY_DEFAULT_BUDGET_CATEGORY%>">Default Budget Category</html:option>
                <html:option value="<%=TextbookBaseReportJobParams.SELECT_SORT_BY_COPY_BUDGET_CATEGORY%>">Copy Budget Category</html:option>
                <html:option value="<%=TextbookBaseReportJobParams.SELECT_SORT_BY_INSTRUCTIONAL_CLASSIFICATION%>">Instructional Classification</html:option>
                <html:option value="<%=TextbookBaseReportJobParams.SELECT_SORT_BY_TEXTBOOK_SUBJECT%>">Subject</html:option>
            </html:select>
            <%if(form.showFromAndToTextBoxes()){ %>
                <html:hidden property="<%=TextbookCopyListReportForm.FIELD_SELECT_BUDGET_CATEGORY%>" value='<%= form.getBudgetCategory() %>' />
                <html:hidden property="<%=TextbookCopyListReportForm.FIELD_SELECT_INSTRUCTIONAL_CLASSIFICATION%>" value='<%= form.getInstructionalClassification() %>' />
                <html:hidden property="<%=TextbookCopyListReportForm.FIELD_SELECT_TEXTBOOK_SUBJECT%>" value='<%= form.getTextbookSubject() %>' />
                <html:hidden property="<%=TextbookCopyListReportForm.FIELD_SELECT_COPY_CATEGORY%>" value='<%= form.getCopyCategory() %>' />                
                &nbsp;from&nbsp;
                <html:text property="<%=TextbookCopyListReportForm.FIELD_SELECT_AND_SORT_BY_FROM%>" size="9" maxlength="<%=TextbookCopyListReportForm.LENGTH_RANGE_FIELD%>"/>
                &nbsp;to&nbsp;
                <html:text property="<%=TextbookCopyListReportForm.FIELD_SELECT_AND_SORT_BY_TO%>" size="9" maxlength="<%=TextbookCopyListReportForm.LENGTH_RANGE_FIELD%>"/>
            <% } else if(form.showISBN_Textbox()) {%>
                <html:hidden property="<%=TextbookCopyListReportForm.FIELD_SELECT_BUDGET_CATEGORY%>" value='<%= form.getBudgetCategory() %>' />
                <html:hidden property="<%=TextbookCopyListReportForm.FIELD_SELECT_INSTRUCTIONAL_CLASSIFICATION%>" value='<%= form.getInstructionalClassification() %>' />
                <html:hidden property="<%=TextbookCopyListReportForm.FIELD_SELECT_TEXTBOOK_SUBJECT%>" value='<%= form.getTextbookSubject() %>' />
                <html:hidden property="<%=TextbookCopyListReportForm.FIELD_SELECT_COPY_CATEGORY%>" value='<%= form.getCopyCategory() %>' />                
                &nbsp;&nbsp;
                <span onKeyPress="return trapEnter(event);">
                    <html:text property="<%=TextbookCopyListReportForm.FIELD_SELECT_ISBN%>" size="13" maxlength="<%=TextbookCopyListReportForm.LENGTH_RANGE_FIELD%>"/>
                </span>
            <% } else if(form.showCopyCategoryDropDown()) {%>
                <html:hidden property="<%=TextbookCopyListReportForm.FIELD_SELECT_BUDGET_CATEGORY%>" value='<%= form.getBudgetCategory() %>' />
                <html:hidden property="<%=TextbookCopyListReportForm.FIELD_SELECT_INSTRUCTIONAL_CLASSIFICATION%>" value='<%= form.getInstructionalClassification() %>' />
                <html:hidden property="<%=TextbookCopyListReportForm.FIELD_SELECT_TEXTBOOK_SUBJECT%>" value='<%= form.getTextbookSubject() %>' />
                &nbsp;&nbsp;
                <base:copyCategoriesList formName="<%=TextbookCopyListReportForm.FORM_NAME%>" selectedCopyCategory="<%=form.getCopyCategory()%>" 
                    reportSiteID="<%=form.getReportSiteID()%>" collectionType="<%=form.getCollectionType()%>" 
                    fieldName="<%=TextbookCopyListReportForm.FIELD_SELECT_COPY_CATEGORY %>" />
            <% } else if(form.showBudgetCategoryDropDown()) {%>
                <html:hidden property="<%=TextbookCopyListReportForm.FIELD_SELECT_COPY_CATEGORY%>" value='<%= form.getCopyCategory() %>' />            
                &nbsp;&nbsp;
                <base:budgetCategoriesList formName="<%=TextbookCopyListReportForm.FORM_NAME%>" 
                    selectedBudgetCategory="<%=form.getBudgetCategory()%>" 
                    fieldName="<%=TextbookCopyListReportForm.FIELD_SELECT_BUDGET_CATEGORY %>"
                    stateEnvironment="<%=store.isStateRepositoryRunning() && !store.isStateContext() %>"/>
                <html:hidden property="<%=TextbookCopyListReportForm.FIELD_SELECT_INSTRUCTIONAL_CLASSIFICATION%>" value='<%= form.getInstructionalClassification() %>' />
                <html:hidden property="<%=TextbookCopyListReportForm.FIELD_SELECT_TEXTBOOK_SUBJECT%>" value='<%= form.getTextbookSubject() %>' />
            <% } else if(form.showInstructionalClassificationDropDown()) {%>
                <html:hidden property="<%=TextbookCopyListReportForm.FIELD_SELECT_BUDGET_CATEGORY%>" value='<%= form.getBudgetCategory() %>' />
                <html:hidden property="<%=TextbookCopyListReportForm.FIELD_SELECT_TEXTBOOK_SUBJECT%>" value='<%= form.getTextbookSubject() %>' />
                &nbsp;&nbsp;
                <base:instructionalClassificationList formName="<%=TextbookCopyListReportForm.FORM_NAME%>" 
                    selectedInstructionalClassification="<%=form.getInstructionalClassification()%>" 
                    fieldName="<%=TextbookCopyListReportForm.FIELD_SELECT_INSTRUCTIONAL_CLASSIFICATION %>"/>
            <% } else if(form.showTextbookSubjectDropDown()) {%>
                <html:hidden property="<%=TextbookCopyListReportForm.FIELD_SELECT_BUDGET_CATEGORY%>" value='<%= form.getBudgetCategory() %>' />
                &nbsp;&nbsp;
                <base:textbookSubjectList formName="<%=TextbookCopyListReportForm.FORM_NAME%>" 
                    selectedTextbookSubject="<%=form.getTextbookSubject()%>" 
                    fieldName="<%=TextbookCopyListReportForm.FIELD_SELECT_TEXTBOOK_SUBJECT %>"/>
            <% }%>
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td class="ColRow">
            <html:checkbox property="<%=TextbookCopyListReportForm.FIELD_INCLUDE_TE%>">Include Teachers' Editions</html:checkbox>
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td class="ColRow">
            <html:checkbox property="<%=TextbookCopyListReportForm.FIELD_INCLUDE_RK%>">Include Resource Kits</html:checkbox>
        </td>
    </tr>
<% if( store.isStateRepositoryRunning() ) { %>    
    <tr>
        <td>&nbsp;</td>
        <td class="ColRow">
            <html:checkbox property="<%=TextbookCopyListReportForm.FIELD_INCLUDE_BUNDLES%>">Include Bundles</html:checkbox>
        </td>
    </tr>
<% } %>
    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top">
            <nobr>Show Titles</nobr>
        </td>
        <td class="ColRow">
            <html:select onchange="javascript:submitTheForm()" property="<%=TextbookCopyListReportForm.FIELD_SHOW_DETAILS_FOR%>">
                <html:option value="<%=TextbookTitleCopyReportJobParams.SHOW_DETAILS_TITLES_ONLY%>">Only</html:option>
                <html:option value="<%=TextbookTitleCopyReportJobParams.SHOW_DETAILS_ALL_COPIES%>">With all copies</html:option>
                <html:option value="<%=TextbookTitleCopyReportJobParams.SHOW_DETAILS_AVAILABLE_COPIES%>">With available copies</html:option>
                <html:option value="<%=TextbookTitleCopyReportJobParams.SHOW_DETAILS_CHECKED_OUT_COPIES%>">With checked out copies</html:option>
                <html:option value="<%=TextbookTitleCopyReportJobParams.SHOW_DETAILS_COPIES_LOANED_OUT%>">With copies loaned out</html:option>
                <% if( !store.isStateRepositoryRunning() ) { %>    
                <html:option value="<%=TextbookTitleCopyReportJobParams.SHOW_DETAILS_COPIES_ON_ORDER%>">With copies on order</html:option>
                <% } %>
                <html:option value="<%=TextbookTitleCopyReportJobParams.SHOW_DETAILS_COPIES_OUT_FOR_REPAIRS%>">With copies out for repairs</html:option>
                <html:option value="<%=TextbookTitleCopyReportJobParams.SHOW_DETAILS_COPIES_INCOMING_TRANSFERS%>">With incoming transfers</html:option>
                <html:option value="<%=TextbookTitleCopyReportJobParams.SHOW_DETAILS_LOST_COPIES%>">With "lost" copies</html:option>
            </html:select>
        </td>
    </tr>
    <logic:notEqual name="<%=TextbookCopyListReportForm.FORM_NAME%>" property="<%=TextbookCopyListReportForm.FIELD_SHOW_DETAILS_FOR%>" value="<%=TextbookTitleCopyReportJobParams.SHOW_DETAILS_TITLES_ONLY%>" scope="request">
        <tr>
            <td class="ColRowBold tdAlignRight">
                <nobr>Include Conditions</nobr>
            </td>
            <td>
                <table id="<%=TextbookCopyListReportForm.TABLE_INCLUDE_CONDITIONS%>"border="0" cellpadding="0" width="100%">
                    <tr>
                        <td class="ColRow">
                        <html:checkbox property="<%=TextbookCopyListReportForm.FIELD_CONDITION_NEW%>">New</html:checkbox></td>
                        <td class="ColRow">
                        <html:checkbox property="<%=TextbookCopyListReportForm.FIELD_CONDITION_GOOD%>">Good</html:checkbox></td>
                        <td class="ColRow">
                        <html:checkbox property="<%=TextbookCopyListReportForm.FIELD_CONDITION_FAIR%>">Fair</html:checkbox></td>
                        <td class="ColRow">
                        <html:checkbox property="<%=TextbookCopyListReportForm.FIELD_CONDITION_POOR%>">Poor</html:checkbox></td>
                        <td class="ColRow">
                        <html:checkbox property="<%=TextbookCopyListReportForm.FIELD_CONDITION_UNUSABLE%>">Unusable</html:checkbox></td>
                    </tr>
                </table>
            </td>
        </tr>
    </logic:notEqual> <!-- TextbookCopyListReportForm.FIELD_SHOW_DETAILS_FOR -->
    <logic:equal name="<%=TextbookCopyListReportForm.FORM_NAME%>" property="<%=TextbookCopyListReportForm.FIELD_SHOW_DETAILS_FOR%>" value="<%=TextbookTitleCopyReportJobParams.SHOW_DETAILS_TITLES_ONLY%>" scope="request">
        <html:hidden property="<%=TextbookCopyListReportForm.FIELD_CONDITION_NEW%>"/>
        <html:hidden property="<%=TextbookCopyListReportForm.FIELD_CONDITION_GOOD%>"/>
        <html:hidden property="<%=TextbookCopyListReportForm.FIELD_CONDITION_FAIR%>"/>
        <html:hidden property="<%=TextbookCopyListReportForm.FIELD_CONDITION_POOR%>"/>
        <html:hidden property="<%=TextbookCopyListReportForm.FIELD_CONDITION_UNUSABLE%>"/>
    </logic:equal> <!-- TextbookCopyListReportForm.FIELD_SHOW_DETAILS_FOR -->
    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">
            <nobr>Include the following information</nobr>
        </td>
        <td class="ColRow">
        <html:checkbox property="<%=TextbookCopyListReportForm.FIELD_INCLUDE_DEFAULT_BUDGET_CATEGORY%>">Default Budget Category</html:checkbox>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">
            &nbsp;
        </td>
        <td class="ColRow">
            <html:checkbox property="<%=TextbookCopyListReportForm.FIELD_INCLUDE_GRADE_LEVEL%>">Grade Level</html:checkbox>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">
            &nbsp;
        </td>
        <td class="ColRow">
            <html:checkbox property="<%=TextbookCopyListReportForm.FIELD_INCLUDE_INSTRUCTIONAL_CLASSIFICATION%>">Instructional Classification</html:checkbox>
        </td>
    </tr>
        
    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <tr>
        <td colspan="2" align="center">
            <table>
                <tr>
                    <c:choose>
                        <c:when test="<%=TextbookCopyListReportForm.ACTION_RUN.equals(form.getAction()) %>">
                            <td valign="top">
                                <base:genericButton name="<%=TextbookCopyListReportForm.BUTTON_SAVE_AND_RUN%>" alt="Save and Run Report" src="/buttons/large/saveandrun.gif"/>
                            </td>
                            <td>
                                <base:cancelButton/>
                            </td>
                        </c:when>
                        <c:otherwise>
                            <td valign="top">
                                <base:genericButton name="<%=TextbookCopyListReportForm.BUTTON_SAVE_SETUP%>" src="/buttons/large/savesetup.gif" alt="Save Report Setup"/>
                            </td>
                            <td>
                                <base:reportButton/>
                            </td>
                        </c:otherwise>
                    </c:choose>                    
                </tr>
            </table>
        </td>
    </tr>
</base:outlinedTableAndTabsWithinThere>
</base:form>
<script language="javascript">
<!--
function submitDropDown() {
        document.<%=TextbookCopyListReportForm.FORM_NAME%>.submit();
}

        function submitDropDownDistrict() {
                document.<%=TextbookCopyListReportForm.FORM_NAME%>.<%=TextbookCopyListReportForm.BUTTON_CHANGE_SUBMIT%>.value = '<%= TextbookCopyListReportForm.SUBMIT_DISTRICT_CHANGED%>';
                document.<%=TextbookCopyListReportForm.FORM_NAME%>.submit();
        }

    
// -->
</script>
