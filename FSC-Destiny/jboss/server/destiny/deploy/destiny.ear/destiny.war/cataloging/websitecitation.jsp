<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.WebSiteCitationForm" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>

<base:messageBox strutsErrors="true"/> 
<%
WebSiteCitationForm form =
(WebSiteCitationForm)request.getAttribute(WebSiteCitationForm.FORM_NAME);
%>
<c:set var="form" value="<%=request.getAttribute(WebSiteCitationForm.FORM_NAME)%>"/>

<base:form action="/cataloging/servlet/handlewebsitecitationform.do"> 
<html:hidden property="<%=WebSiteCitationForm.FIELD_LIST_ID%>"/>
<html:hidden property="<%=WebSiteCitationForm.FIELD_RESOURCE_ID%>"/>
<html:hidden property="<%=WebSiteCitationForm.FIELD_URL%>"/>
<html:hidden property="<%=WebSiteCitationForm.FIELD_DEEP_LINK%>"/>
<base:outlinedTable borderColor="#c0c0c0" id="<%=WebSiteCitationForm.TABLE_MAIN %>">
	<tr>
		<td class="TableHeading">
			<c:choose>
				<c:when test="${form.deepLink}">
					<%= MessageHelper.formatMessage("websitecitation_EditLibrarySubscriptionServiceCitation") %>
				</c:when>
				<c:otherwise>
					<%= MessageHelper.formatMessage("websitecitation_EditWebSiteCitation") %>
				</c:otherwise>	
			</c:choose>
		</td>
		<td class="tdAlignRight">
	 			<base:saveButton name="<%= WebSiteCitationForm.BUTTON_NAME_SAVE %>" /><br/>
           		<base:cancelButton name="<%= WebSiteCitationForm.BUTTON_NAME_CANCEL %>" />
   		</td>      
	<tr>

	<tr>
	    <td colspan="2">    
        	<base:imageLine/>
    	</td>
	</tr>
	<tr>
		<td align="center" colspan="2">
			<table id="<%=WebSiteCitationForm.TABLE_CITATION %>">
				<tr class="SmallColHeading">
					<td>&nbsp;</td>
					<td><%=MessageHelper.formatMessage("websitecitation_LastName")  %></td>
					<td><%=MessageHelper.formatMessage("websitecitation_FirstName")  %></td>
					<td><%=MessageHelper.formatMessage("websitecitation_Initial") %></td>
				</tr>
				<tr>
					<td class="FormLabel tdAlignRight"><%=MessageHelper.formatMessage("websitecitation_1stAuthor") %></td>
					<td><html:text property="<%= WebSiteCitationForm.FIELD_AUTHOR1_LAST_NAME %>" size="20" maxlength="42"/></td>
					<td><html:text property="<%= WebSiteCitationForm.FIELD_AUTHOR1_FIRST_NAME %>" size="20" maxlength="42"/></td>
					<td><html:text property="<%= WebSiteCitationForm.FIELD_AUTHOR1_INITIAL %>" size="5" maxlength="5"/></td>
				</tr>
				<tr>
					<td class="FormLabel tdAlignRight"><%=MessageHelper.formatMessage("websitecitation_2ndAuthor") %></td>
					<td><html:text property="<%= WebSiteCitationForm.FIELD_AUTHOR2_LAST_NAME %>" size="20" maxlength="42"/></td>
					<td><html:text property="<%= WebSiteCitationForm.FIELD_AUTHOR2_FIRST_NAME %>" size="20" maxlength="42"/></td>
					<td><html:text property="<%= WebSiteCitationForm.FIELD_AUTHOR2_INITIAL %>" size="5" maxlength="5"/></td>
				</tr>
				<tr>
					<td class="FormLabel tdAlignRight"><%=MessageHelper.formatMessage("websitecitation_3rdAuthor") %></td>
					<td><html:text property="<%= WebSiteCitationForm.FIELD_AUTHOR3_LAST_NAME %>" size="20" maxlength="42"/></td>
					<td><html:text property="<%= WebSiteCitationForm.FIELD_AUTHOR3_FIRST_NAME %>" size="20" maxlength="42"/></td>
					<td><html:text property="<%= WebSiteCitationForm.FIELD_AUTHOR3_INITIAL %>" size="5" maxlength="5"/></td>
				</tr>
				<tr>
					<td class="FormLabel tdAlignRight"><%=MessageHelper.formatMessage("websitecitation_Organization") %></td>
					<td><html:text property="<%= WebSiteCitationForm.FIELD_ORGANIZATION %>" size="20" maxlength="150"/></td>
					<td class="ColRow"><%=MessageHelper.formatMessage("websitecitation_IfNoAuthor") %></td>
				</tr>
				<tr>
					<td class="FormLabel tdAlignRight">* <%=MessageHelper.formatMessage("websitecitation_DocumentTitle") %></td>
					<td colspan="3"><html:text property="<%= WebSiteCitationForm.FIELD_DOCUMENT_TITLE %>" size="40" maxlength="150"/></td>
				</tr>
				<c:if test="${! form.deepLink}">
					<tr>
						<td class="FormLabel tdAlignRight"><%=MessageHelper.formatMessage("websitecitation_TitleOfWebSite") %></td>
						<td colspan="3"><html:text property="<%= WebSiteCitationForm.FIELD_TITLE_WEBSITE %>" size="20" maxlength="150"/></td>
					</tr>
				</c:if>
				<c:if test="${form.deepLink}">
					<tr>
						<td class="FormLabel tdAlignRight"><%=MessageHelper.formatMessage("websitecitation_NameOfPeriodical") %></td>
						<td colspan="3"><html:text property="<%= WebSiteCitationForm.FIELD_NAME_OF_PERIODICAL %>" size="40" maxlength="<%=WebSiteCitationForm.MAX_SIZE_NAME_OF_PERIODICAL%>"/></td>
					</tr>
				</c:if>
				<tr>
					<td class="FormLabel"align ="right">
						<%=MessageHelper.formatMessage("websitecitation_PublicationDateCopyrightLastUpdate") %>				
					</td>
					<td colspan="3"><html:text property="<%= WebSiteCitationForm.FIELD_DATE %>" size="20" maxlength="80"/></td>
				</tr>
				<c:if test="${form.deepLink}">
    					<tr>
    						<td class="FormLabel"align ="right">
    							<%=MessageHelper.formatMessage("websitecitation_NameOfDatabase") %>
    						</td>
    						<td colspan="3"><html:text property="<%= WebSiteCitationForm.FIELD_NAME_OF_DATABASE %>" size="20" maxlength="128"/></td>
    					</tr>
    					<tr>
    						<td class="FormLabel"align ="right">
    							<%=MessageHelper.formatMessage("websitecitation_NameOfService") %>
    						</td>
    						<td colspan="3"><html:text property="<%= WebSiteCitationForm.FIELD_NAME_OF_SERVICE %>" size="20" maxlength="128"/></td>
    					</tr>
    					<tr>
    						<td class="FormLabel"align ="right">
    							<%=MessageHelper.formatMessage("websitecitation_NameOfLibrary") %>
    						</td>
    						<td colspan="3"><html:text property="<%= WebSiteCitationForm.FIELD_NAME_OF_LIBRARY %>" size="20" maxlength="240"/></td>
    					</tr>
    					<tr>
    						<td class="FormLabel"align ="right">
    							<%=MessageHelper.formatMessage("websitecitation_LocationOfLibrary") %>
    						</td>
    						<td colspan="3"><html:text property="<%= WebSiteCitationForm.FIELD_LOCATION_OF_LIBRARY %>" size="20" maxlength="180"/></td>
    					</tr>
			    </c:if>
				<tr>
					<td class="FormLabel tdAlignRight"><%=MessageHelper.formatMessage("websitecitation_Medium") %></td>
					<td colspan="3"><html:text property="<%= WebSiteCitationForm.FIELD_MEDIUM %>" size="20" maxlength="<%=WebSiteCitationForm.MAX_SIZE_MEDIUM%>"/></td>
				</tr>
				<tr>
					<td class="FormLabel tdAlignRight"><%=MessageHelper.formatMessage("websitecitation_AccessDate") %></td>
					<td colspan="3"><html:text property="<%= WebSiteCitationForm.FIELD_ACCESS_DATE %>" size="20" maxlength="80"/></td>
				</tr>
				<tr>
					<td class="FormLabel tdAlignRight"><%=MessageHelper.formatMessage("websitecitation_URL") %></td>
					<td colspan="3" class="ColRow">${form.displayableURL}</td>
				</tr>
				<tr>
					<td class="Instruction tdAlignRight"><%=MessageHelper.formatMessage("websitecitation_RequiredField") %></td>
					<td colspan="3">&nbsp;</td>
				</tr>
			</table>
		</td>
	</tr>
</base:outlinedTable>


</base:form>

