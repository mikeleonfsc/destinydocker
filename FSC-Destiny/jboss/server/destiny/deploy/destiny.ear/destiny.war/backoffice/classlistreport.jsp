<%@page import="com.follett.fsc.destiny.client.common.servlet.GenericForm"%>
<%@page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.ClassListReportForm" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.BaseSaveableReportForm" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.ClassListReportJob" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>


<%@page import="com.follett.fsc.destiny.session.backoffice.remote.data.ClassListReportJobParams"%><base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handleclasslistreportform.do">
<%
    ClassListReportForm form = (ClassListReportForm)request.getAttribute(ClassListReportForm.FORM_NAME);
%>

<base:outlinedTableAndTabsWithinThere id="<%=ClassListReportForm.TABLE_NAME%>" borderColor='#C0C0C0' selectedTab="<%=form.getTabNameForCollectionType()%>" tabs="<%=form.getTabsForCollectionType()%>">


    <html:hidden property="<%=BaseSaveableReportForm.FIELD_ACTION%>"/>
    <html:hidden property="<%=BaseSaveableReportForm.FIELD_JOB_SPEC_ID%>"/>
    <html:hidden property="<%=BaseSaveableReportForm.PARAM_REPORT_NAME%>"/>
    
    <html:hidden property="<%=ClassListReportForm.PARAM_ORIG_SELECT_BY%>" value='<%=""+form.getSelectBy()%>'/>

<bean:define id="textbookOptions" name="<%= ClassListReportForm.FORM_NAME %>" property="textbookOptions"/>
<bean:define id="sectionOptions" name="<%= ClassListReportForm.FORM_NAME %>" property="sectionOptions"/>

    <tr>
        <td colspan="2" class="TableHeading">
            <%=ResponseUtils.filter(form.getReportHeading())%>
        </td>
    </tr>

    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    
    <tr>
        <td class="ColRowBold tdAlignRight">For</td>
        <td class = "ColRow">
            <html:select property="<%= ClassListReportForm.FIELD_REPORT_TYPE %>" onchange="submit()">
                <html:option value = "<%= String.valueOf(ClassListReportJobParams.OPTION_TEACHERS) %>">Teachers</html:option>
                <html:option value = "<%= String.valueOf(ClassListReportJobParams.OPTION_STUDENTS) %>">Students</html:option>
            </html:select>
        </td>
    </tr>
    
    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    
    <% if (form.getReportType() == ClassListReportJobParams.OPTION_TEACHERS) { %>
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top">
            <nobr>Select &amp; Sort by</nobr>
        </td>
        <td class = "ColRowBold" valign = "top">Teacher Name</td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td class="ColRow">
            From <html:text property="<%= ClassListReportForm.FIELD_TEACHER_FROM %>" maxlength="30" size="20"/>
            to <html:text property="<%= ClassListReportForm.FIELD_TEACHER_TO %>" maxlength="30" size="20"/>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top">&nbsp;
        </td>
        <td class="ColRow">
            <html:checkbox property="<%= ClassListReportForm.FIELD_PAGE_BREAK %>" /> Start a new page for each 
            <html:select property="<%=ClassListReportForm.FIELD_PAGE_BREAK_DROPDOWN%>">
                <html:option value='<%=""+ClassListReportJobParams.PAGE_BREAK_DROPDOWN_TYPE_TEACHER_OR_STUDENT%>'>teacher</html:option>
                <html:option value='<%=""+ ClassListReportJobParams.PAGE_BREAK_DROPDOWN_TYPE_SECTION%>'>section/class period</html:option>
            </html:select>            
        </td>
    </tr>

    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>

    <tr>
        <td class="ColRowBold tdAlignRight" valign="top">
            <nobr>Additional options</nobr>
        </td>
        <td class="ColRow">
            Include <html:select property="<%= ClassListReportForm.FIELD_INCLUDE_SECTION_OPTION %>">
                <html:options collection="sectionOptions" property="longID" labelProperty="stringDesc"/>
            </html:select>
        </td>
    </tr>
    <tr>
        <td></td>
        <td class="ColRow">
            Only class periods from
            <html:text property="<%= ClassListReportForm.FIELD_PERIOD_FROM %>" maxlength="2" size="3"/>
            to <html:text property="<%= ClassListReportForm.FIELD_PERIOD_TO %>" maxlength="2" size="3"/>
        </td>
    </tr>


    <tr>
        <td class="ColRowBold tdAlignRight">Show</td>
        <td class="ColRow">
            <html:radio property="<%=ClassListReportForm.FIELD_LIST_CHECKOUTS%>" value="false"/>
            &nbsp;Teachers and their classes only
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td class="ColRow">
            <html:radio property="<%=ClassListReportForm.FIELD_LIST_CHECKOUTS%>" value="true"/>
            &nbsp;Teachers, students and any&nbsp; 
            <bean:define id="textbookOptions" name="<%= ClassListReportForm.FORM_NAME %>" property="textbookOptions"/>
            <html:select property="<%= ClassListReportForm.FIELD_TEXTBOOK_SELECTED_OPTION %>">
                <html:options collection="textbookOptions" property="longID" labelProperty="stringDesc"/>
            </html:select>&nbsp;<%=form.gimmeTextbooksOrResources()%></td>    
    </tr>

    <% } else { // student mode %>
         
    <tr>
        <td class="ColRowBold tdAlignRight">Sections starting</td>
        <td class = "ColRow">
            <base:date 
                buttonName = "<%= ClassListReportForm.BUTTON_CHANGE_SECTION_FROM_DATE%>"
                fieldName  = "<%= ClassListReportForm.FIELD_SECTION_FROM_DATE%>"
                dateValue  = "<%= form.getSectionFromDate()%>"
                altText = "Section From Date"
            /> to 
            <base:date 
                buttonName = "<%= ClassListReportForm.BUTTON_CHANGE_SECTION_TO_DATE%>"
                fieldName  = "<%= ClassListReportForm.FIELD_SECTION_TO_DATE%>"
                dateValue  = "<%= form.getSectionToDate()%>"
                altText = "Section To Date"
            />
        </td>
    </tr>
    
    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
     
    <tr>
        <td class="ColRowBold tdAlignRight">Select by</td>
        <td class = "ColRow">
            <html:select property = "<%= ClassListReportForm.FIELD_SELECT_BY %>" onchange="submit()">
                <html:option value = "<%= String.valueOf(ClassListReportJobParams.OPTION_SELECT_BY_STUDENT) %>">Student Name</html:option>
                <html:option value = "<%= String.valueOf(ClassListReportJobParams.OPTION_SELECT_BY_GRADELEVEL) %>">Grade Level</html:option>
                <html:option value = "<%= String.valueOf(ClassListReportJobParams.OPTION_SELECT_BY_HOMEROOM) %>">Homeroom</html:option>
                <html:option value = "<%= String.valueOf(ClassListReportJobParams.OPTION_SELECT_BY_DATEADDED) %>">Date Student Added</html:option>
            </html:select>         
        </td>
    </tr> 
    
    <% if (form.getSelectBy() == ClassListReportJobParams.OPTION_SELECT_BY_DATEADDED) { %>

    <tr>
        <td>&nbsp;</td>
        <td class = "ColRow">
            <base:date 
                buttonName = "<%= ClassListReportForm.BUTTON_CHANGE_SELECT_BY_FROM_DATE%>"
                fieldName  = "<%= ClassListReportForm.FIELD_STUDENT_FROM%>"
                dateValue  = "<%= form.getStudentFrom()%>"
                altText = "Date Added From Date"
            /> to 
            <base:date 
                buttonName = "<%= ClassListReportForm.BUTTON_CHANGE_SELECT_BY_TO_DATE%>"
                fieldName  = "<%= ClassListReportForm.FIELD_STUDENT_TO%>"
                dateValue  = "<%= form.getStudentTo()%>"
                altText = "Date Added To Date"
            />
        </td>
    </tr>

    <% } else { %>
    <tr>
        <td>&nbsp;</td>
        <td class = "ColRow">
          From <html:text property="<%= ClassListReportForm.FIELD_STUDENT_FROM %>" size = "10" maxlength = "20"/>
            to <html:text property="<%= ClassListReportForm.FIELD_STUDENT_TO %>" size = "10" maxlength = "20"/>
        </td>
    </tr>
    
    <% } %>
    
    <tr>
        <td class="ColRowBold tdAlignRight">Sort by</td>
        <td class = "ColRow">
            <html:select property="<%=ClassListReportForm.FIELD_PRIMARY_STUDENT_SORT %>">
                <html:option value = "<%= String.valueOf(ClassListReportJobParams.SORT_BY_NAME) %>">Student Name</html:option>
                <html:option value = "<%= String.valueOf(ClassListReportJobParams.SORT_BY_GRADE) %>">Grade Level</html:option>
                <html:option value = "<%= String.valueOf(ClassListReportJobParams.SORT_BY_HOMEROOM) %>">Homeroom</html:option>
            </html:select>
            then by
            <html:select property="<%=ClassListReportForm.FIELD_SECONDARY_STUDENT_SORT %>">
                <html:option value = "<%= String.valueOf(ClassListReportJobParams.SORT_BLANK) %>">&nbsp;</html:option>
                <html:option value = "<%= String.valueOf(ClassListReportJobParams.SORT_BY_NAME) %>">Student Name</html:option>
                <html:option value = "<%= String.valueOf(ClassListReportJobParams.SORT_BY_GRADE) %>">Grade Level</html:option>
                <html:option value = "<%= String.valueOf(ClassListReportJobParams.SORT_BY_HOMEROOM) %>">Homeroom</html:option>
            </html:select>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top">&nbsp;
        </td>
        <td class="ColRow">
            <html:checkbox property="<%= ClassListReportForm.FIELD_PAGE_BREAK %>" /> Start a new page for each 
            <html:select property="<%=ClassListReportForm.FIELD_PAGE_BREAK_DROPDOWN%>">
                <html:option value='<%=""+ClassListReportJobParams.PAGE_BREAK_DROPDOWN_TYPE_TEACHER_OR_STUDENT%>'>student</html:option>
                <html:option value='<%=""+ ClassListReportJobParams.PAGE_BREAK_DROPDOWN_TYPE_SECTION%>'>section/class period</html:option>
            </html:select>
        </td>
    </tr>

    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>

    <tr>
        <td class="ColRowBold tdAlignRight">Include</td> 
        <td class = "ColRow"><html:checkbox property="<%= ClassListReportForm.FIELD_INC_STUDENT_BARCODES %>" /> Student Barcode (for scanning)</td>
    </tr>
    
    <% } %>

    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>

    <tr>
        <td colspan="2" align="center" class="ColRowBold">
            <table>
                <tr>
                    <c:choose>
                        <c:when test="<%=ClassListReportForm.ACTION_RUN.equals(form.getAction()) %>">
                            <td valign="top">
                                <base:genericButton name="<%=ClassListReportForm.BUTTON_SAVE_AND_RUN%>" alt="Save and Run Report" src="/buttons/large/saveandrun.gif"/>
                            </td>
                            <td>
                                <base:cancelButton/>
                            </td>
                        </c:when>
                        <c:otherwise>
                        <% if (form.getCollectionType() == CollectionType.TEXTBOOK) { %>
                            <td valign="top">
                                <base:genericButton name="<%=ClassListReportForm.BUTTON_SAVE_SETUP%>" src="/buttons/large/savesetup.gif" alt="Save Report Setup"/>
                            </td>
                            <td>
                                <base:reportButton/>
                            </td>
                         <% } else { %>
                         <td valign="top" align="left">
                              <base:reportButton/>
                            </td>
                            <td>
                            </td>
                         <% }%>
                        </c:otherwise>
                    </c:choose>                    
                </tr>
            </table>
        </td>
    </tr>
</base:outlinedTableAndTabsWithinThere>
</base:form>
