<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.EditReadingProgramForm" %>
<%@ page import="com.follett.fsc.destiny.session.cataloging.data.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.QuizDataSpecs" %>
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
    EditReadingProgramForm form = (EditReadingProgramForm)request.getAttribute( EditReadingProgramForm.FORM_NAME );
%>

<base:form action="/cataloging/servlet/handleeditreadingprogramform.do"
    focus="<%=EditReadingProgramForm.FIELD_QUIZ_POINT_VALUE%>">
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">
<html:hidden property="bibID" />
<html:hidden property="quizID" />

<base:outlinedTable borderColor='#C0C0C0' width="90%">
  <tr><td valign="top">
    <table id="<%=EditReadingProgramForm.TABLE_QUIZ_EDIT%>" width="100%">
        <tr>
            <td colspan="2" class="FormLabel"><%= MessageHelper.formatMessage("editreadingprogram_ReadingProgramQuizInformation") %><base:helpTag helpFileName="c_reading_program_information_LM.htm"/>
            </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editreadingprogram_Program") %></td>
            <td>
                <html:select property="<%= EditReadingProgramForm.FIELD_QUIZ_PROGRAM %>">
                    <html:option value="<%=Integer.toString(QuizDataSpecs.READING_PROGRAM_AR)%>"><%=QuizDataSpecs.HTMLDISPLAY_SERVICE_TYPE_ACCELERATED_READER%></html:option>
                    <html:option value="<%=Integer.toString(QuizDataSpecs.READING_PROGRAM_RC)%>"><%=QuizDataSpecs.HTMLDISPLAY_SERVICE_TYPE_READING_COUNTS%></html:option>
                </html:select>
            </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editreadingprogram_PointValue") %></td>
            <td>
                <html:text maxlength="15" size="15" property="<%=EditReadingProgramForm.FIELD_QUIZ_POINT_VALUE%>"/>
            </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editreadingprogram_ReadingLevel") %></td>
            <td>
                <html:text maxlength="15" size="15" property="<%=EditReadingProgramForm.FIELD_QUIZ_READING_LEVEL%>"/>
            </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editreadingprogram_InterestLevel") %></td>
            <td>
                <html:text maxlength="150" size="15" property="<%=EditReadingProgramForm.FIELD_QUIZ_INTEREST_LEVEL%>"/>
            </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editreadingprogram_QuizNumber") %></td>
            <td>
                <html:text maxlength="15" size="15" property="<%=EditReadingProgramForm.FIELD_QUIZ_NUMBER%>"/>
            </td>
        </tr>
    	<base:isDistrictUser>

        <tr>
            <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("editreadingprogram_Site") %></td>
            <td>
                <base:selectSite 
                    name="<%= EditReadingProgramForm.FIELD_QUIZ_SITE_ID %>" 
                    selectedSiteID='<%="" + form.getSiteID()%>'
                    includeLibrarySites="true"
        			includeTextbookSites="false"
        			includeMediaSites="false"
        			includeAssetSites="false"
                    />
            </td>
        </tr>
	    </base:isDistrictUser>
    </table>
 </td>
 <td valign="top" class="ColRowBold tdAlignRight">
    <base:showHideTag id="onSave">
        <table width="100%">
        <tr>
        <td class="tdAlignRight">
            <base:saveButton onclick="hideElementonSave()" name="<%=EditReadingProgramForm.BUTTON_NAME_SAVE_QUIZ%>"/>
        </td>
        </tr>
        <tr>
        <td class="tdAlignRight">
            <base:cancelButton name="<%=EditReadingProgramForm.BUTTON_NAME_CANCEL_QUIZ%>"/>
        </td>
        </tr>
        </table>
    </base:showHideTag>
 </tr>
 </td>
</base:outlinedTable>

</base:form>
