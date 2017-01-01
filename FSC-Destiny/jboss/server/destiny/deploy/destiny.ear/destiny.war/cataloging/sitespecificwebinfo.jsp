<%@page import="com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.SiteSpecificWebInfoForm" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<%@ page import="com.follett.fsc.destiny.util.ObjectHelper"%>
<%@ page import="com.follett.fsc.destiny.util.URLHelper"%>
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
    SiteSpecificWebInfoForm form = (SiteSpecificWebInfoForm)request.getAttribute(SiteSpecificWebInfoForm.FORM_NAME);
%>

<base:form action="/cataloging/servlet/handlesitespecificwebinfoform.do">
<html:hidden property="<%= SiteSpecificWebInfoForm.PARAM_BIB_ID %>"/>   
<html:hidden property="<%= SiteSpecificWebInfoForm.PARAM_SITE_ID %>"/>


<logic:notEmpty  name="<%= SiteSpecificWebInfoForm.FORM_NAME %>" property="<%=SiteSpecificWebInfoForm.PARAM_DELETE_WEBINFO_ID%>">
    <base:messageBox showRedBorder="true">
		<html:hidden property="<%= SiteSpecificWebInfoForm.PARAM_DELETE_WEBINFO_ID%>"/>
       	<tr valign="center">
           <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
           <td class="ColRowBold" align="center"><%= MessageHelper.formatMessage("sitespecificwebinfo_AreYouSureYouWantToDeleteTheSite",ResponseUtils.filter(form.gimmeSelectedWebSite())) %>
 	   	<tr>
       	    <td>&nbsp;</td>
       	    <td valign="baseline" align="center" class="ColRow">
           	    <base:yesNo buttonYesName="<%=SiteSpecificWebInfoForm.BUTTON_CONFIRM_DELETE%>"/>
           	</td>
   	   	</tr>
   	</base:messageBox>
 </logic:notEmpty>

 
<base:outlinedTable borderColor="#c0c0c0" id="<%=SiteSpecificWebInfoForm.TABLE_OUTLINED%>" width="100%">
	<tr>
		<td class="TableHeading" valign="top"><%=MessageHelper.formatMessage("sitespecificwebinfo_UpdateSiteSpecificUrls")%></td>
		<td class="tdAlignRight">		
			<base:genericButton src="/buttons/large/addurl.gif" name="<%= SiteSpecificWebInfoForm.BUTTON_ADD_NEW %>" alt='<%=MessageHelper.formatMessage("sitespecificwebinfo_AddUrl") %>'/>
			<br>
			<base:closeButton withX="true"/>
		</td>
	</tr>
			
    <tr>
        <td width="100%" colspan="2">
            <base:imageLine height="1" width="100%" />
        </td>
    </tr>
    <% boolean outputWritten = false; %>
    <tr>
        <td width="100%" colspan="2">
            <table id=<%= SiteSpecificWebInfoForm.TABLE_LIST %> width="100%" border="0" cellspacing="0" cellpadding="2">
                <logic:iterate id="webSite" name="<%=SiteSpecificWebInfoForm.FORM_NAME %>" property="webSites" type="com.follett.fsc.destiny.entity.ejb3.SiteSpecificWebInfoVO">
                    <% outputWritten = true; %>
                    <base:flipper key="sitespecific">
                          <td class="ColRow">
                             <base:link page="<%=webSite.getElectronicResource() %>" target="_blank">
                                 <%=ResponseUtils.filter(webSite.getElectronicResourceDisplayable()) %>
                             </base:link>
                          </td>
                        <td class="ColRow tdAlignRight">
                            <base:link page='<%= "/cataloging/servlet/presentsitespecificwebinfoaddeditform.do?webInfoID=" + webSite.getWebInfoID()%>' id="<%=SiteSpecificWebInfoForm.ID_BUTTON_EDIT + webSite.getWebInfoID() %>">
                                <base:image src="/icons/general/edit.gif" width="19" height="16" alt='<%=MessageHelper.formatMessage("sitespecificwebinfo_Edit0", ResponseUtils.filter(webSite.getElectronicResourceDisplayable()))%>' />
                            </base:link>
                            &nbsp;
                            <base:link page='<%=form.gimmeDeleteLink(webSite.getWebInfoID())%>' id="<%=SiteSpecificWebInfoForm.ID_BUTTON_DELETE + webSite.getWebInfoID() %>">
                                <base:image src="/icons/general/delete.gif" width="19" height="16" alt='<%=MessageHelper.formatMessage("sitespecificwebinfo_Delete0", ResponseUtils.filter(webSite.getElectronicResourceDisplayable()))%>' />
                            </base:link>
                        </td>
                    </base:flipper>
                </logic:iterate>
            </table>
        </td>
    </tr>
    <% if (outputWritten) { 
        int buttons[] = new int[] {HelpIconsTag.ICON_EDIT, HelpIconsTag.ICON_DELETE};
    %>
    <tr>
        <td width="100%" colspan="2">
            <base:imageLine height="1" width="100%" />
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <base:helpIcons buttonsToOutput="<%=buttons%>"/>
        </td>
    </tr>
    <% } %>
    
    
			
</base:outlinedTable>
</base:form>
