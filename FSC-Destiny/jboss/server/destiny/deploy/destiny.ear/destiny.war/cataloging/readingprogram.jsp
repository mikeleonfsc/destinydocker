<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib prefix="c" uri="/WEB-INF/jstl-core.tld" %>
<%@ taglib prefix="fn" uri="/WEB-INF/jstl-function.tld" %>

<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.cataloging.remote.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<c:set var="form" value="<%=request.getAttribute(ReadingProgramForm.FORM_NAME)%>"/>

<base:messageBox strutsErrors="true"/>
<br>

<%
    ReadingProgramForm form = (ReadingProgramForm)request.getAttribute(ReadingProgramForm.FORM_NAME);
%>


<base:outlinedTableAndTabsWithinThere id="<%=ReadingProgramForm.TABLE_MAIN%>"  
    selectedTab="<%=ReadingProgramForm.ID_TAB%>" 
    tabs="<%=ReadingProgramNavigationForm.getTabs(form.getSessionStore())%>" cellpadding="2" >
<tr>
<td>
<base:form action="/cataloging/servlet/handlereadingprogramform.do" method="post">
<% if (form.isShowWarning()) { %>
 
    <base:messageBox showRedBorder="true">
            <tr valign="top">
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td class="ColRowBold">
                    By selecting the 'Delete all quizzes of the selected program before updating' checkbox, 
                    subsequent printing of reading program labels based on "Date Reading Program Added/Updated" 
                    will include labels for ALL copies with quizzes assigned based on the new file you uploaded.  
                    Printing labels for only newly added titles is not an option.    
                </td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td valign="baseline" align="center" class="ColRowBold">
                Do you want to proceed? <br>
                </td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td valign="baseline" align="center" class="ColRow">
                    
                    <base:yesButton/>
                    <base:noButton name="<%=ReadingProgramForm.BUTTON_NO %>"/>
                </td>
            </tr>
        </base:messageBox>
<%} %>
    <table id="<%=ReadingProgramForm.TABLE_REPORT_MENU%>" cellpadding="3" cellspacing="0" border="0" width="100%">
        <tr>
            <td class="ColRowBold">1.</td>
            <td class="ColRowBold">
                <base:link page="${form.uploadURL}" target="new" id="<%=ReadingProgramForm.ID_LINK_UPLOAD %>">
                    ${form.uploadLinkText}
                </base:link>
            </td>
        </tr>
        <tr>
            <td>
                <base:imageSpacer width="25" height="1"/>
            </td>
            <c:choose>
            <c:when test="${form.AREUser}">
            <td class="Instruction"><%= MessageHelper.formatMessage("readingprogram_ClickThisLinkToUploadAReadingCountsRegQuizFileIt") %><br>
                <b><%= MessageHelper.formatMessage("readingprogram_NOTEAcceleratedReaderRegEnterpriseSubscribersDo") %></b>
            </td>
            </c:when>
            <c:when test="${form.RCEUser}">
            <td class="Instruction"><%= MessageHelper.formatMessage("readingprogram_ClickThisLinkToUploadAnAcceleratedReaderRegQuiz") %><br>
                <b><%= MessageHelper.formatMessage("readingprogram_NOTEReadingCountsRegEnterpriseSubscribersDoNot") %></b>
            </td>
            </c:when>
            <c:otherwise>
            <td class="Instruction"><%= MessageHelper.formatMessage("readingprogram_ClickThisLinkToUploadAnAcceleratedReaderRegOr") %></td>
            </c:otherwise>
            </c:choose>
        </tr>

        <tr>
                <c:choose>
                    <c:when test="${form.AREUser}">
                        <td class="ColRowBold">2.</td>
                        <input type="hidden" name="<%=ReadingProgramForm.FIELD_READING_PROGRAM%>" value="<%=ReadingProgramForm.RADIO_READING_PROGRAM_READING_COUNTS%>">
                        <td class ="ColRow" ><%= MessageHelper.formatMessage("readingprogram_DownloadReadingCountsRegProgramInfo") %><base:imageSpacer width="25" height="1"/>
                        </td>
                    </c:when>
                    <c:when test="${form.RCEUser}">
                         <td class="ColRowBold">2.</td>
                        <input type="hidden" name="<%=ReadingProgramForm.FIELD_READING_PROGRAM%>" value="<%=ReadingProgramForm.RADIO_READING_PROGRAM_ACCELERATED_READER%>">
                        <td class ="ColRow" ><%= MessageHelper.formatMessage("readingprogram_DownloadAcceleratedReaderRegProgramInfo") %><base:imageSpacer width="25" height="1"/>
                        </td>
                    </c:when>
                </c:choose>
        </tr>
                <c:choose>
                    <c:when test="${form.AREUser}">
                        <tr>
                        <td>&nbsp;</td>
                            <td class="Instruction"><%= MessageHelper.formatMessage("readingprogram_DownloadTheReadingCountsRegReadingProgram") %></td>
                        </tr>
                    </c:when>
                    <c:when test="${form.RCEUser}">
                        <tr>
                        <td>&nbsp;</td>
                            <td class="Instruction"><%= MessageHelper.formatMessage("readingprogram_DownloadTheAcceleratedReaderRegReadingProgram") %></td>
                        </tr>
                    </c:when>
                </c:choose>
        <% if ( ! form.isAREUser() && ! form.isRCEUser() ) { %>
        
            <tr>
            <td class="ColRowBold">2.</td>
                <td class="ColRow">
                    <html:radio property="<%=ReadingProgramForm.FIELD_READING_PROGRAM%>" value="<%=ReadingProgramForm.RADIO_READING_PROGRAM_ACCELERATED_READER%>"><nobr><%=MessageHelper.formatMessage("readingprogram_DownloadAcceleratedReaderReadingProgramInfo")%></html:radio>
                </td>
            </tr>
            <tr>
                <td>
                    <base:imageSpacer width="25" height="1"/>
                </td>
                <td class="Instruction"><%= MessageHelper.formatMessage("readingprogram_DownloadTheAcceleratedReaderRegReadingProgram") %></td>
            </tr>
            <tr>
                <td>
                    <base:imageSpacer width="25" height="1"/>
                </td>
                <td class="ColRow">
                    <html:radio property="<%=ReadingProgramForm.FIELD_READING_PROGRAM%>" value="<%=ReadingProgramForm.RADIO_READING_PROGRAM_READING_COUNTS%>"><nobr><%=MessageHelper.formatMessage("readingprogram_DownloadReadingCountsRegProgramInfo")%></html:radio>
                </td>
            </tr>
            <tr>
                <td>
                    <base:imageSpacer width="25" height="1"/>
                </td>
                <td class="Instruction"><%= MessageHelper.formatMessage("readingprogram_DownloadTheReadingCountsRegReadingProgram") %></td>
            </tr>
            <% } %>
        
        <tr>
            <td>
                <base:imageSpacer width="25" height="1"/>
            </td>
            <td class="ColRow">
                <html:checkbox property="<%=ReadingProgramForm.FIELD_REMOVE_BEFORE_IMPORT%>"><%= MessageHelper.formatMessage("readingprogram_DeleteAllQuizzesOfTheSelectedProgramBefore") %></html:checkbox>
            </td>
        </tr>
        <tr>
            <td>
                <base:imageSpacer width="25" height="1"/>
            </td>
            <td class="Instruction">
			<%= MessageHelper.formatMessage("readingprogram_SelectThisOptionOnly") %>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center" class="FormElement">
                <base:genericButton src="/buttons/large/download.gif" name="<%=ReadingProgramForm.BUTTON_IMPORT%>" alt='<%= MessageHelper.formatMessage("readingprogram_Download") %>'/>
            </td>
        </tr>
    </table>
</base:form>
</td>
</tr>
</base:outlinedTableAndTabsWithinThere>

