<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.SiteSpecificSubjectsForm" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<%@ page import="com.follett.fsc.destiny.util.ObjectHelper"%>
<%@ page import="com.follett.fsc.destiny.util.URLHelper"%>
<%@ page import="com.follett.fsc.destiny.session.cataloging.ejb.data.SiteSpecificSubjectVO"%>
<%@ page import="com.follett.fsc.common.StringHelper"%>
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
    SiteSpecificSubjectsForm form = (SiteSpecificSubjectsForm)request.getAttribute(SiteSpecificSubjectsForm.FORM_NAME);
%>

<base:form action="/cataloging/servlet/handlesitespecificsubjectsform.do">
<html:hidden property="<%= SiteSpecificSubjectsForm.PARAM_BIB_ID %>"/>   


<logic:notEmpty  name="<%= SiteSpecificSubjectsForm.FORM_NAME %>" property="<%=SiteSpecificSubjectsForm.PARAM_DELETE_TAG_ID%>">
    <base:messageBox showRedBorder="true">
		<html:hidden property="<%= SiteSpecificSubjectsForm.PARAM_DELETE_TAG_ID%>"/>   
       	<tr valign="center">
           <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
           <td class="ColRowBold" align="center"><%= MessageHelper.formatMessage("sitespecificsubjects_AreYouSureYouWantToDeleteTheSite",ResponseUtils.filter(form.getSubjectHeading())) %>
 	   	<tr>
       	    <td>&nbsp;</td>
       	    <td valign="baseline" align="center" class="ColRow">
           	    <base:yesNo buttonYesName="<%=SiteSpecificSubjectsForm.BUTTON_CONFIRM_DELETE%>"/>
           	</td>
   	   	</tr>
   	</base:messageBox>
 </logic:notEmpty>

 
<base:outlinedTable borderColor="#c0c0c0" id="<%=SiteSpecificSubjectsForm.TABLE_OUTLINED%>" width="100%">
	<tr>
		<td class="TableHeading" valign="top"><%= MessageHelper.formatMessage("sitespecificsubjects_UpdateSiteSpecificSubjects") %></td>
		<td class="tdAlignRight">		
			<base:genericButton src="/buttons/large/addsubjects.gif" name="<%= SiteSpecificSubjectsForm.BUTTON_ADD_NEW %>" alt='<%= MessageHelper.formatMessage("addSubject") %>'/>
			<br>
			<base:closeButton withX="true"/>
		</td>
	</tr>
			
	<tr>
		<td width="100%" colspan="2">
			<base:imageLine height="1" width="100%" />
		</td>
	</tr>
			
	<tr>
		<td colspan="2">
			<table id=<%= SiteSpecificSubjectsForm.TABLE_LIST %> width="100%" border="0" cellspacing="0" cellpadding="2">
			    <%
			    //List is a list of value objects

			    Iterator iter = ObjectHelper.getIterator(form.getSiteSpecificSubjectsList());
			    SiteSpecificSubjectVO value = null;
			    while (iter.hasNext()) {
			        value = (SiteSpecificSubjectVO) iter.next();
			    %>
                    <base:flipper key="sitespecific">
                        <td class="ColRow"><%= ResponseUtils.filter(StringHelper.truncate(value.getSubjectHeading(), 135, true) )%></td>
                        
                        
                        <td class="ColRow tdAlignRight">
                            <base:link page='<%= "/cataloging/servlet/presentsitespecificsubjectsaddeditform.do?bibID=" + form.getBibID() + "&tagID=" + value.getTagID()%>' id="<%=SiteSpecificSubjectsForm.ID_BUTTON_EDIT + value.getTagID() %>">
                                <base:image src="/icons/general/edit.gif" width="19" height="16" alt='<%=MessageHelper.formatMessage("sitespecificsubjects_Edit0", ResponseUtils.filter(value.getSubjectHeading()))%>' />
                            </base:link>
                            &nbsp;
                            <base:link page='<%= "/cataloging/servlet/handlesitespecificsubjectsform.do?bibID=" + form.getBibID() + "&deleteTagID=" + value.getTagID()+"&subjectHeading=" + URLHelper.encodeURL(value.getSubjectHeading())%>' id="<%=SiteSpecificSubjectsForm.ID_BUTTON_DELETE + value.getTagID() %>">
                                <base:image src="/icons/general/delete.gif" width="19" height="16" alt='<%=MessageHelper.formatMessage("sitespecificsubjects_Delete0", ResponseUtils.filter(value.getSubjectHeading()))%>' />
                            </base:link>
                        </td>
                    </base:flipper>
			    <% } %>
			</table>
		</td>
	</tr>
</base:outlinedTable>        
</base:form>

