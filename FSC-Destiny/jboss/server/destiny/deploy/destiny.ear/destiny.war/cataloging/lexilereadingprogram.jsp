<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<base:messageBox strutsErrors="true"/>
<br>

<%
    LexileReadingProgramForm form = (LexileReadingProgramForm)request.getAttribute(LexileReadingProgramForm.FORM_NAME);
%>


<base:outlinedTableAndTabsWithinThere id="<%=LexileReadingProgramForm.TABLE_MAIN%>"  
    selectedTabID="<%=LexileReadingProgramForm.TAB_ID%>" 
    selectedTab="<%=LexileReadingProgramForm.TAB%>" 
    tabs="<%=ReadingProgramNavigationForm.getTabs(form.getSessionStore())%>" cellpadding="2" >
<tr>
<td>
<base:form action="/cataloging/servlet/handlelexilereadingprogramform.do" method="post">
<% if (form.isShowWarning()) { %>
 
    <base:messageBox showRedBorder="true">
            <tr valign="top">
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td class="ColRowBold">
                    By selecting the 'Delete all Lexile information before updating' checkbox, 
                    subsequent printing of reading program labels based on "Date Reading Program Added/Updated" 
                    will include labels for ALL copies with Lexile measures assigned.    
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
                    <base:noButton name="<%=LexileReadingProgramForm.BUTTON_NO %>"/>
                </td>
            </tr>
        </base:messageBox>
<%} %>
    <table id="<%=LexileReadingProgramForm.TABLE_INNER%>" cellpadding="3" cellspacing="0" border="0" width="100%">
    <tr>
        <td class="TableHeading"><%= MessageHelper.formatMessage("lexilereadingprogram_EnhanceYourCollection") %></td>     
    </tr>
    <tr>
        <td class="ColRow"><%= MessageHelper.formatMessage("lexilereadingprogram_LexileMeasuresCanBeAddedToYourBookAndEbookTitle") %><br></td>
    </tr>
    <tr>
        <td class="ColRow">
            <html:checkbox property="<%=LexileReadingProgramForm.FIELD_REMOVE_BEFORE_IMPORT%>"><%= MessageHelper.formatMessage("lexilereadingprogram_DeleteAllLexileInformationBeforeUpdating") %></html:checkbox>
        </td>
    </tr>
    <tr>
        <td align="center" class="ColRowBold"><%= MessageHelper.formatMessage("lexilereadingprogram_ThisProcessCannotBeReversed", GenericForm.getLastBackupDisplayMsg(false)) %><br></td>
    </tr>
    <tr>
        <td align="center" class="ColRowBold"><%= MessageHelper.formatMessage("lexilereadingprogram_WhenTheProcessHasCompletedGoToTheJobManagerInThe") %><br></td>
    </tr>
    <tr>
        <td align="center" class="FormElement">
            <base:genericButton src="/buttons/large/lexileproceed.gif" name="<%=LexileReadingProgramForm.BUTTON_PROCEED%>" alt='<%= MessageHelper.formatMessage("lexilereadingprogram_Proceed") %>'/>
        </td>
    </tr>
    </table>
</base:form>
</td>
</tr>
</base:outlinedTableAndTabsWithinThere>

