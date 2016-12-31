<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.ReadingProgramReportForm" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@page import="com.follett.fsc.destiny.session.backoffice.remote.data.ReadingProgramReportJobParams"%>
<base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handlereadingprogramreportform.do">
<base:outlinedTable id="<%=ReadingProgramReportForm.TABLE_NAME%>" cellpadding="5" cellspacing="0" borderColor='#C0C0C0'>

    <tr>
        <td colspan="2" class="TableHeading"><%=ReadingProgramReportForm.PAGE_TITLE%></td>
    </tr>

    <tr>
        <td class="ColRowBold tdAlignRight" valign="top">
            <nobr>Reading Program</nobr>
        </td>
        <td class="ColRow">
            <html:radio name="<%= ReadingProgramReportForm.FORM_NAME %>" property="<%= ReadingProgramReportForm.OPTION_READING_PROGRAM %>" 
                value="<%= Integer.toString(ReadingProgramReportForm.OPTION_ACCELERATED_READER) %>">Accelerated Reader&reg;
            </html:radio>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top">&nbsp;
        </td>
        <td class="ColRow">
             <html:radio name="<%= ReadingProgramReportForm.FORM_NAME %>" property="<%= ReadingProgramReportForm.OPTION_READING_PROGRAM %>" 
                value="<%= Integer.toString(ReadingProgramReportForm.OPTION_READING_COUNTS) %>">Reading Counts&reg;
            </html:radio>
       </td>
    </tr>

    <tr>
        <td colspan="2"><br></td>
    </tr>
    
    <tr>
        <td class="ColRowBold tdAlignRight" valign="bottom">AR/RC Reading Level</td>
        <td valign="bottom" colspan="2" class="ColRow">
            From&nbsp;<html:text property="<%= ReadingProgramReportForm.FIELD_READING_LEVEL_FROM %>" size="5"/>
            &nbsp;to&nbsp;<html:text property="<%= ReadingProgramReportForm.FIELD_READING_LEVEL_TO %>" size="5"/>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight" valign="bottom">Point Value</td>
        <td valign="bottom" colspan="2" class="ColRow">
            From&nbsp;<html:text property="<%= ReadingProgramReportForm.FIELD_POINT_VALUE_FROM %>" size="5"/>
            &nbsp;to&nbsp;<html:text property="<%= ReadingProgramReportForm.FIELD_POINT_VALUE_TO %>" size="5"/>
        </td>
    </tr>
    
    <tr>
        <td colspan="2"><br></td>
    </tr>    

    <tr>
        <td class="ColRowBold tdAlignRight" valign="top">
            <nobr>Generate the following report</nobr>
        </td>
        <td class="ColRow">
            <html:checkbox name="<%= ReadingProgramReportForm.FORM_NAME %>" property="<%= ReadingProgramReportForm.FIELD_HAVE_QUIZ_NO_TITLE %>" /> Quizzes with No Matching Titles - Sort by&nbsp;
            <html:select property="<%=ReadingProgramReportForm.FIELD_SORT_QUIZ_NO_TITLE%>">
                  <html:option value="<%=String.valueOf(ReadingProgramReportJobParams.SORT_BY_AUTHOR)%>">Author</html:option>
                  <html:option value="<%=String.valueOf(ReadingProgramReportJobParams.SORT_BY_TITLE)%>">Title</html:option>
            </html:select>
        </td>
    </tr>

    <tr>
        <td class="ColRowBold tdAlignRight" valign="top">
            &nbsp;
        </td>
        <td class="ColRow">
            <html:checkbox name="<%= ReadingProgramReportForm.FORM_NAME %>" property="<%= ReadingProgramReportForm.FIELD_HAVE_TITLE_NO_QUIZ %>" /> Titles with No Matching Quizzes - Sort by&nbsp;
            <html:select property="<%=ReadingProgramReportForm.FIELD_SORT_TITLE_NO_QUIZ%>">
                  <html:option value="<%=String.valueOf(ReadingProgramReportJobParams.SORT_BY_AUTHOR)%>">Author</html:option>
                  <html:option value="<%=String.valueOf(ReadingProgramReportJobParams.SORT_BY_CALL_NUMBER)%>">Call Number</html:option>
                  <html:option value="<%=String.valueOf(ReadingProgramReportJobParams.SORT_BY_TITLE)%>">Title</html:option>
            </html:select>
        </td>
    </tr>

    <tr>
        <td class="ColRowBold tdAlignRight" valign="top">
            &nbsp;
        </td>
        <td class="ColRow">
            <html:checkbox name="<%= ReadingProgramReportForm.FORM_NAME %>" property="<%= ReadingProgramReportForm.FIELD_HAVE_TITLE_HAVE_QUIZ %>" /> Titles with Quizzes - Sort by&nbsp;
            <html:select property="<%=ReadingProgramReportForm.FIELD_SORT_TITLE_HAVE_QUIZ%>">
                  <html:option value="<%=String.valueOf(ReadingProgramReportJobParams.SORT_BY_AUTHOR)%>">Author</html:option>
                  <html:option value="<%=String.valueOf(ReadingProgramReportJobParams.SORT_BY_CALL_NUMBER)%>">Call Number</html:option>
                  <html:option value="<%=String.valueOf(ReadingProgramReportJobParams.SORT_BY_TITLE)%>">Title</html:option>
            </html:select>
        </td>
    </tr>

    <tr>
        <td align="center" colspan="2"><span class="ColRowBold">Please Note: </span><span class="ColRow">These reports may not match all of your physical quiz and copy holdings because variations may occur in MARC records, publisher data, and vendor data, any of which could affect the automated matching function.</span></td>
    </tr>

    <tr>
        <td colspan="2" align="center" class="ColRowBold">
            <base:reportButton/>
        </td>
    </tr>
</base:outlinedTable>
</base:form>
