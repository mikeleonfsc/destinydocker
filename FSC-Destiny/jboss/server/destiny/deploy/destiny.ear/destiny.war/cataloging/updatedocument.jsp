<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.UpdateDocumentForm" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.util.ObjectHelper"%>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<%@ page import="com.follett.fsc.destiny.session.cataloging.ejb.data.DocumentVO"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.JobSummaryForm"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.destiny.util.Permission"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<base:messageBox strutsErrors="true"/>

<%
    UpdateDocumentForm form = (UpdateDocumentForm)request.getAttribute(UpdateDocumentForm.FORM_NAME);
%>

<base:form action="/cataloging/servlet/handleupdatedocumentform.do">
<html:hidden property="<%= UpdateDocumentForm.PARAM_COPY_ID %>"/>   
<html:hidden property="<%= UpdateDocumentForm.PARAM_BIB_ID %>"/>   


<logic:notEmpty  name="<%= UpdateDocumentForm.FORM_NAME %>" property="<%=UpdateDocumentForm.PARAM_DELETE_ID%>">
    <base:messageBox showRedBorder="true">
		<html:hidden property="<%= UpdateDocumentForm.PARAM_DELETE_ID%>"/>   
       	<tr valign="center">
           <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
           <td class="ColRowBold" align="center"><%= MessageHelper.formatMessage("updatedocument_DoYouWantToDelete", ResponseUtils.filter(form.getDeleteName()))%>
 	   	<tr>
       	    <td>&nbsp;</td>
       	    <td valign="baseline" align="center" class="ColRow">
           	    <base:yesNo buttonYesName="<%=UpdateDocumentForm.BUTTON_CONFIRM_DELETE%>"/>
           	</td>
   	   	</tr>
   	</base:messageBox>
 </logic:notEmpty>

 
<base:outlinedTable borderColor="#c0c0c0" id="<%=UpdateDocumentForm.TABLE_OUTLINED%>" width="100%">
	<tr>
		<td class="TableHeading">
			<%=form.gimmePageTitle() %>
		</td>
		<td class="tdAlignRight">		
			<base:closeButton/>
		</td>
	</tr>
    <%
        if( form.canAddEditDocumentation()) {
    %>
	<tr>
		<td class="tdAlignRight" colspan="2">
			<base:genericButton src="/buttons/large/addnew.gif" name="<%= UpdateDocumentForm.BUTTON_ADD_NEW %>" alt='<%= MessageHelper.formatMessage("addNew") %>'/>  
        </td>
	</tr>
	<% } %>		
    <% 
    Iterator iter = ObjectHelper.getIterator(form.getDocumentList());
    if ( iter.hasNext() ) {
    %>
	<tr>
		<td width="100%" colspan="2">
			<base:imageLine height="1" width="100%" />
		</td>
	</tr>
	<% } %>		
	<tr>
		<td colspan="2">
			<table id=<%= UpdateDocumentForm.TABLE_LIST %> width="100%" border="0" cellspacing="0" cellpadding="2">
            
                <% if (iter.hasNext()) { %>
                   <tr>
                        <td>&nbsp;</td>
                        <td align="center" class="ColRowBold"><%= MessageHelper.formatMessage("updatedigitalresource_DisplaysInMyInfo") %></td>
                        <td>&nbsp;</td>
                    </tr>
                <% } %>     
			    <%
			    //List is a list of value objects
			    DocumentVO value = null;
                int flipper  =0;
			    while (iter.hasNext()) {
			        value = (DocumentVO) iter.next();
			    %>
                    <base:flipper key="updatedocument">
                        <%flipper=1; %>
    		            <td class="ColRow"><%= ResponseUtils.filter(value.getDocumentName())%></td>
                        <td align="center">
                            <% if (value.isAllowMyInfoView()) { %> <base:image
                                src="/icons/general/check.gif" /> <% } else { %>
                            &nbsp; <% } %>
                        </td>
    		            <td class="ColRow tdAlignRight">
    		                <base:link page='<%=form.gimmeJobSummaryLink(value) %>'
                                target="view document" id="<%=UpdateDocumentForm.ID_BUTTON_VIEW + value.getDocumentID() %>">
    		                    <base:image src="/icons/general/view.gif" width="19" height="16" alt='<%=MessageHelper.formatMessage("updatedocument_View", ResponseUtils.filter(value.getDocumentName()))%>'/>
    		                </base:link>
                            <%
                                if( form.canAddEditDocumentation()) {
                            %>
    		                &nbsp;
    		                <base:link page='<%= form.gimmeEditLink(value)%>' id="<%=UpdateDocumentForm.ID_BUTTON_EDIT + value.getDocumentID() %>">
    		                    <base:image src="/icons/general/edit.gif" width="19" height="16" alt='<%=MessageHelper.formatMessage("updatedocument_Edit", ResponseUtils.filter(value.getDocumentName()))%>'/>
    		                </base:link>
                            <% } %>  
                            <%
                                if( form.canDeleteDocumentation()) {
                            %>
        		                &nbsp;
        		                <base:genericButton src="/icons/general/delete.gif" name="<%= UpdateDocumentForm.BUTTON_DELETE_PREFIX + value.getDocumentID()%>" alt='<%= MessageHelper.formatMessage("updatedocument_Delete", value.getDocumentName()) %>'/>
    		                <% } %>  
                        </td>
                        
                        </base:flipper>
                <% } %>
			</table>
		</td>
	</tr>

<%    
    if (flipper > 0) {
%>        
    <tr>
        <td width="100%" colspan="2">
            <base:imageLine height="1" width="100%" />
        </td>
    </tr>
    <tr>
        <td width="100%" colspan="2">
            <base:helpIcons buttonsToOutput='<%= form.gimmeHelpIcons() %>'/>
        </td>
    </tr>    
<% } %>

</base:outlinedTable>        
</base:form>

