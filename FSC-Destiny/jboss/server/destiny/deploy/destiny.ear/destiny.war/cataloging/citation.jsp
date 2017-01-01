<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.CitationForm" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<% CitationForm form = (CitationForm)request.getAttribute(CitationForm.FORM_NAME); %>



<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>



<base:messageBox strutsErrors="true"/> 

<c:set var="form" value="<%=request.getAttribute(CitationForm.FORM_NAME)%>"/>

<base:form action="/cataloging/servlet/handlecitationform.do"> 
<html:hidden property="<%=CitationForm.PARAM_LIST_ID%>"/>
<html:hidden property="<%=CitationForm.PARAM_BIB_ID%>"/>
<html:hidden property="<%=CitationForm.PARAM_DCPI_RECORD_GUID%>"/>
<html:hidden property="<%=CitationForm.PARAM_CITATION_ID%>"/>
<html:hidden property="<%=CitationForm.PARAM_CONTENT_MODE%>"/>
<html:hidden property="<%=CitationForm.PARAM_MATERIAL_TYPE%>"/>
<html:hidden property="<%=CitationForm.FIELD_CITATION_TYPE%>"/>
<base:outlinedTable borderColor="#c0c0c0" id="<%=CitationForm.TABLE_MAIN %>">
	<tr>
		<td class="TableHeading">
            <c:out value="${form.pageHeading}"/>
		</td>
		<td class="tdAlignRight">
	 			<base:saveButton name="<%= CitationForm.BUTTON_NAME_SAVE %>" /><br/>
           		<base:cancelButton name="<%= CitationForm.BUTTON_NAME_CANCEL %>" />
   		</td>      
	<tr>

	<tr>
	    <td colspan="2">    
        	<base:imageLine/>
    	</td>
	</tr>
	<tr>
		<td align="center" colspan="2">
			<table id="<%=CitationForm.TABLE_CITATION %>">
                <c:if test="${form.authorFieldsDisplayable}" >
        			<tr class="SmallColHeading">
        				<td>&nbsp;</td>
        				<td><%= MessageHelper.formatMessage("citation_LastName")   %></td>
        				<td><%=MessageHelper.formatMessage("citation_FirstName")  %></td>
        				<td><%=MessageHelper.formatMessage("citation_Middle") %></td>
        			</tr>
        			<tr>
        				<td class="FormLabel tdAlignRight"><%=form.gimmeFirstAuthor() %></td>
        				<td><html:text property="<%= CitationForm.FIELD_AUTHOR1_LAST_NAME %>" size="20" maxlength="<%=CitationForm.MAX_SIZE_LAST_NAME%>"/></td>
        				<td><html:text property="<%= CitationForm.FIELD_AUTHOR1_FIRST_NAME %>" size="20" maxlength="<%=CitationForm.MAX_SIZE_FIRST_NAME%>"/></td>
        				<td><html:text property="<%= CitationForm.FIELD_AUTHOR1_MIDDLE_INITIAL %>" size="5" maxlength="<%=CitationForm.MAX_SIZE_MIDDLE_INITIAL%>"/></td>
        			</tr>
        			<tr>
        				<td class="FormLabel tdAlignRight"><%=form.gimmeSecondAuthor() %></td>
        				<td><html:text property="<%= CitationForm.FIELD_AUTHOR2_LAST_NAME %>" size="20" maxlength="<%=CitationForm.MAX_SIZE_LAST_NAME%>"/></td>
        				<td><html:text property="<%= CitationForm.FIELD_AUTHOR2_FIRST_NAME %>" size="20" maxlength="<%=CitationForm.MAX_SIZE_FIRST_NAME%>"/></td>
        				<td><html:text property="<%= CitationForm.FIELD_AUTHOR2_MIDDLE_INITIAL%>" size="5" maxlength="<%=CitationForm.MAX_SIZE_MIDDLE_INITIAL%>"/></td>
        			</tr>
        			<tr>
        				<td class="FormLabel tdAlignRight"><%=form.gimmeThirdAuthor() %></td>
        				<td><html:text property="<%= CitationForm.FIELD_AUTHOR3_LAST_NAME %>" size="20" maxlength="<%=CitationForm.MAX_SIZE_LAST_NAME%>"/></td>
        				<td><html:text property="<%= CitationForm.FIELD_AUTHOR3_FIRST_NAME %>" size="20" maxlength="<%=CitationForm.MAX_SIZE_FIRST_NAME%>"/></td>
        				<td><html:text property="<%= CitationForm.FIELD_AUTHOR3_MIDDLE_INITIAL %>" size="5" maxlength="<%=CitationForm.MAX_SIZE_MIDDLE_INITIAL%>"/></td>
        			</tr>
                </c:if>   
                <c:if test="${form.titleFieldDisplayable}" >
    				<tr>
    					<td class="FormLabel tdAlignRight"><%=MessageHelper.formatMessage("citation_Title") %></td>
    					<td colspan="3" class="tdAlignLeft"><html:text property="<%= CitationForm.FIELD_TITLE%>" size="40" maxlength="<%=CitationForm.MAX_SIZE_TITLE%>"/></td>
    				</tr>
                </c:if>   
                <c:if test="${form.publisherLocationDisplayable}" >
    				<tr>
    					<td class="FormLabel tdAlignRight"><%=MessageHelper.formatMessage("citation_PublisherLocation") %></td>
    					<td colspan="3" class="tdAlignLeft"><html:text property="<%= CitationForm.FIELD_PUBLICATION_LOCATION %>" size="20" maxlength="<%=CitationForm.MAX_SIZE_PUBLISHER_LOCATION%>"/></td>
    				</tr>
                </c:if>   
                <c:if test="${form.publisherDisplayable}" >
    				<tr>
    					<td class="FormLabel tdAlignRight"><%=form.gimmePublisher() %></td>
    					<td colspan="3" class="tdAlignLeft"><html:text property="<%= CitationForm.FIELD_PUBLISHER %>" size="20" maxlength="<%=CitationForm.MAX_SIZE_PUBLISHER%>"/></td>
    				</tr>
                </c:if>   
                <c:if test="${form.dateOfCompositionDisplayable}" >
                    <tr>
                        <td class="FormLabel tdAlignRight">
                        <%=form.gimmeDateOfComposition() %>             
                        </td>
                        <td colspan="3" class="tdAlignLeft"><html:text property="<%= CitationForm.FIELD_DATE_OF_COMPOSITION %>" size="8" maxlength="<%=CitationForm.MAX_SIZE_DATE_OF_COMPOSITION%>"/></td>
                    </tr>
                </c:if>   
                <c:if test="${form.copyrightYearDisplayable}" >
                    <tr>
                        <td class="FormLabel tdAlignRight">
                            <%=form.gimmeCopyrightCaption() %>
                        </td>
                        <td colspan="3" class="tdAlignLeft"><html:text property="<%= CitationForm.FIELD_COPYRIGHT_YEAR %>" size="8" maxlength="<%=CitationForm.MAX_SIZE_COPYRIGHT_YEAR%>"/></td>
                    </tr>
                </c:if>   
                    <tr>
                        <td class="FormLabel tdAlignRight">
                            <%=MessageHelper.formatMessage("citation_Medium") %>              
                        </td>
                        <td colspan="3" class="tdAlignLeft"><html:text property="<%= CitationForm.FIELD_MEDIUM %>" size="20" maxlength="<%=CitationForm.MAX_SIZE_MEDIUM%>"/></td>
                    </tr>
				<tr>
					<td class="Instruction tdAlignRight"><%=MessageHelper.formatMessage("citation_RequiredField") %></td>
					<td colspan="3" class="tdAlignLeft">&nbsp;</td>
				</tr>
			</table>
		</td>
	</tr>
</base:outlinedTable>


</base:form>

