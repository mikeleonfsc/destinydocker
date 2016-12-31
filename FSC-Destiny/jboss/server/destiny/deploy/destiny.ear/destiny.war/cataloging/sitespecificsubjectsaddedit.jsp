<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.SiteSpecificSubjectsAddEditForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.BaseFileUploadForm" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<bean:define id="subjectSubcategoriesID" name="<%=SiteSpecificSubjectsAddEditForm.FORM_NAME%>" property="subjectSubcategories"/>

<base:messageBox strutsErrors="true"/>

<%
    SiteSpecificSubjectsAddEditForm form = (SiteSpecificSubjectsAddEditForm)request.getAttribute(SiteSpecificSubjectsAddEditForm.FORM_NAME);
%>

<base:form action="/cataloging/servlet/handlesitespecificsubjectsaddeditform.do" focus="<%=SiteSpecificSubjectsAddEditForm.FIELD_SITE_SPECIFIC_HEADING%>">
<html:hidden property="<%= SiteSpecificSubjectsAddEditForm.PARM_ACTION %>"/>
<html:hidden property="<%= SiteSpecificSubjectsAddEditForm.PARM_BIB_ID %>"/>
<html:hidden property="<%= SiteSpecificSubjectsAddEditForm.PARM_EDIT_MODE %>"/>
<html:hidden property="<%= SiteSpecificSubjectsAddEditForm.PARM_TAG_ID %>"/>
<html:hidden property="<%= SiteSpecificSubjectsAddEditForm.PARM_TAG_NUMBER %>"/>

	<base:outlinedTable  borderColor="#c0c0c0"  width="100%">
		<tr>
			<td>
				<table id="<%=SiteSpecificSubjectsAddEditForm.TABLE_VALUES%>" >
					<tr>
	    		        <td class="FormLabel tdAlignRight" nowrap><%= MessageHelper.formatMessage("sitespecificsubjectsaddedit_SiteSpecificHeading") %></td>
    	        		<td>
			            	<html:text property="<%=SiteSpecificSubjectsAddEditForm.FIELD_SITE_SPECIFIC_HEADING%>" size="30" maxlength="50"/>
            			</td>					
					</tr>
					<tr>
						<td class="tdAlignRight">
                            <html:select property="<%= SiteSpecificSubjectsAddEditForm.FIELD_OPTION_1_LIST_VALUE %>">
                                <html:options collection="subjectSubcategoriesID" property="stringCode" labelProperty="stringDesc"/>
                            </html:select>
						</td>
						<td>
							<html:text property="<%=SiteSpecificSubjectsAddEditForm.FIELD_OPTION_1_TEXT_VALUE%>" size="30" maxlength="50"/>						
						</td>						
					</tr>
					<tr>
						<td class="tdAlignRight">
                            <html:select property="<%= SiteSpecificSubjectsAddEditForm.FIELD_OPTION_2_LIST_VALUE %>">
                                <html:options collection="subjectSubcategoriesID" property="stringCode" labelProperty="stringDesc"/>
                            </html:select>												
						</td>
						<td>
							<html:text property="<%=SiteSpecificSubjectsAddEditForm.FIELD_OPTION_2_TEXT_VALUE%>" size="30" maxlength="50"/>						
						</td>						
					</tr>
					<tr>
						<td class="tdAlignRight">
                            <html:select property="<%= SiteSpecificSubjectsAddEditForm.FIELD_OPTION_3_LIST_VALUE %>">
                                <html:options collection="subjectSubcategoriesID" property="stringCode" labelProperty="stringDesc"/>
                            </html:select>												
						</td>
						<td>
							<html:text property="<%=SiteSpecificSubjectsAddEditForm.FIELD_OPTION_3_TEXT_VALUE%>" size="30" maxlength="50"/>						
						</td>						
					</tr>
				</table>
			</td>
            <td valign="top" class="ColRowBold tdAlignRight">
                <base:showHideTag id="onSave">
                    <table name="<%=SiteSpecificSubjectsAddEditForm.TABLE_BUTTONS%>">
                    	<tr>
                            <td>
                                <base:saveButton onclick="hideElementonSave()"/> 
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <base:cancelButton/> 
                            </td>
                        </tr>
                        <tr>
                            <td>&nbsp;</td>
                        </tr>
                        <tr valign="bottom">
                            <td>
                                <base:genericButton alt='<%=MessageHelper.formatMessage("findHeading")%>' onclick="hideElementonSave()" name="<%=SiteSpecificSubjectsAddEditForm.BUTTON_FIND_HEADING%>" src="/buttons/large/findheading.gif">
                                </base:genericButton>
                            </td>
                        </tr>        
                    </table>
                </base:showHideTag>
            </td>
            
            
       </tr>
       
	</base:outlinedTable>
</base:form>
<!-- end of page -->
