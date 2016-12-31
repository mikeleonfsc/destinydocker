<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.ReadingProgramListForm" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.QuizDataSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.cataloging.data.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<base:messageBox strutsErrors="true"/>
<%
    ReadingProgramListForm form = (ReadingProgramListForm)request.getAttribute( ReadingProgramListForm.FORM_NAME );
    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );
%>

<base:form action="/cataloging/servlet/handlereadingprogramlistform.do">
<html:hidden property="bibID" />

    <logic:present name="<%= ReadingProgramListForm.FORM_NAME%>" property="quizID">
        <html:hidden property="quizID" />
        <html:hidden property="deleteSiteID" />
        <base:imageSpacer width="1" height="3"/>

         <base:confirmBox showWarningIcon="true"
            header='<%= MessageHelper.formatMessage("readingprogramlist_AreYouSureYouWantToDeleteThisQuiz") %>'           
            noName="<%=ReadingProgramListForm.ID_DELETE_NO %>"
          />
      
    </logic:present>

<base:outlinedTable borderColor='#C0C0C0' width="90%">
    <tr><td colspan="2" valign="top">
        <table id="<%=ReadingProgramListForm.TABLE_QUIZ_LIST%>" width="100%" cellspacing="0" cellpadding="2">
            <logic:equal name="<%=ReadingProgramListForm.FORM_NAME%>" property="quizEmpty" value="true">
                <tr>
                    <td class="FormLabel" colspan="3" align="center"><%= MessageHelper.formatMessage("readingprogramlist_ThereAreNoReadingProgramsForThisTitle") %></td>
                </tr>
            </logic:equal>
            <logic:equal name="<%=ReadingProgramListForm.FORM_NAME%>" property="quizEmpty" value="false">
                <tr>
                    <td class="ColRowBold"><%= MessageHelper.formatMessage("readingprogramlist_Program") %></td>
                    <td class="ColRowBold"><%= MessageHelper.formatMessage("readingprogramlist_Points") %></td>
                    <td class="ColRowBold"><%= MessageHelper.formatMessage("readingprogramlist_ReadingLevel") %></td>
                    <td class="ColRowBold"><%= MessageHelper.formatMessage("readingprogramlist_InterestLevel") %></td>
                    <td class="ColRowBold"><%= MessageHelper.formatMessage("readingprogramlist_Quiz") %></td>
                    <base:isDistrictUser>
                        <td class="ColRowBold"><%= MessageHelper.formatMessage("readingprogramlist_Site") %></td>
                        <td class="ColRowBold">&nbsp;</td>
                    </base:isDistrictUser>
    
                    <base:isNotDistrictUser>
                        <td class="ColRow">&nbsp;</td>
                        <td class="ColRow">&nbsp;</td>
                    </base:isNotDistrictUser>
                </tr>
<%
                List list = form.getQuizList();
                Iterator itr = list.iterator();
                while ( itr.hasNext()) {
                    TitleAEQuizPackage value = (TitleAEQuizPackage) itr.next();

                    String editButton = form.createEditLink(ReadingProgramListForm.LINK_PREFIX_EDIT_QUIZ , value.getQuizID());
                    String deleteLink = form.createDeleteLink(value.getQuizID(), value.getSiteID());
                %>
                <base:flipper key="readingprogramlist">
                <%
                    out.println("<td class=\"ColRow\">" + QuizDataSpecs.serviceTypeToString(value.getServiceType()) + "</td>");
                    out.println("<td class=\"ColRow\">" + new QuizPointValue(value.getPoints()).getAsString() + "</td>");
                    out.println("<td class=\"ColRow\">" + new QuizReadingLevel(value.getReadingLevel()).getAsString() + "</td>");
                    out.println("<td class=\"ColRow\">" + HTMLFilterHelper.filter(value.getInterestLevel()) + "</td>");
                    out.println("<td class=\"ColRow\">" + HTMLFilterHelper.filter(value.getQuizNumber()) + "</td>");
                    if (store.isDistrictUser()) {
                        out.println("<td class=\"ColRow\">" + HTMLFilterHelper.filter(value.getSiteLongName()) + "</td>");
                    } else {
                        out.println("<td>&nbsp;</td>");
                    }
                    
                    if (value.getSiteID() != null && value.getSiteID().longValue() != 0) {
%>
                    	<td nowrap class="tdAlignRight">
<%
						if (value.isUserQuiz()) {
%>                   
                            <base:genericButton name="<%=editButton %>" src="/icons/general/edit.gif" alt='<%= MessageHelper.formatMessage("readingprogramlist_EditReadingProgram") %>'></base:genericButton>
<%                       
                    	}
                        if (form.showDeleteLink(value)) {
%>                    
                        <base:link href="<%=deleteLink %>" id="<%=ReadingProgramListForm.LINK_PREFIX_DELETE_QUIZ + value.getQuizID() %>"><base:image src="/icons/general/delete.gif" alt='<%= MessageHelper.formatMessage("readingprogramlist_DeleteReadingProgram") %>'/></base:link>
<%                      
                        } 
%>
                    </td>
<%
                    } else {
%>                        
                    	<td>&nbsp;</td>
<%                       
                    }
%>                    
                    </base:flipper>
<%                    
                }
%>
            </logic:equal>
        </table>
    </td>
    <td valign="top">
        <table width="100%">
        <tr>
        <td class="tdAlignRight">
            <base:genericButton src="/buttons/large/addquiz.gif" name="<%=ReadingProgramListForm.BUTTON_NAME_ADD%>" alt='<%= MessageHelper.formatMessage("addQuiz") %>'/>
        </td>
        </tr>
        <tr>
        <td class="tdAlignRight">
            <base:closeButton name="<%=ReadingProgramListForm.BUTTON_NAME_CLOSE%>"/>
        </td>
        </tr>
        </table>
     </td>
     </tr>
</base:outlinedTable>

</base:form>
