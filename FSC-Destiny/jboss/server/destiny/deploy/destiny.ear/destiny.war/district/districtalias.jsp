<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.district.data.*"%>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@page import="com.follett.fsc.destiny.entity.ejb3.ConfigSiteVO"%>
<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@page import="java.util.*" %>
<%@page import="com.follett.fsc.destiny.entity.ejb3.SiteShortNameAliasVO"%>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    DistrictAliasForm form = (DistrictAliasForm)request.getAttribute(DistrictAliasForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
	String focus = form.getFocus();
    int counter = 0;
    String inputStyleRed = "STYLE=\"color: #CC0000;\"";
%>


<base:messageBox strutsErrors="true"/>

<base:form action="/district/servlet/handledistrictaliasform.do" focus="<%=focus%>">

    <html:hidden property="<%=DistrictAliasForm.PARAM_CHANGES_MADE%>"/>

    <logic:equal name="<%=DistrictAliasForm.FORM_NAME%>" property="<%= DistrictAliasForm.PARAM_SHOW_CONFIRMATION%>" value="true">                   
         <% 
             String[] messageText = new String[]{ MessageHelper.formatMessage("DistrictAliasForm_ConfirmAliasCancel") };

        %>
        <base:confirmBox 
            showWarningIcon="true" filterMessage="false" showPleaseWait="true"
            header='<%=MessageHelper.formatMessage("DistrictAliasForm_ConfirmHeader")%>'
            messageText="<%=messageText%>"
            noName="<%=DistrictAliasForm.BUTTON_CANCEL_NO%>" 
            yesName="<%=DistrictAliasForm.BUTTON_CANCEL_YES%>"/>
     </logic:equal>

    <logic:equal name="<%=DistrictAliasForm.FORM_NAME%>" property="<%= DistrictAliasForm.PARAM_SHOW_CONFIRMATION_SAVE%>" value="true">                   
         <% 
             String[] messageText = new String[]{ MessageHelper.formatMessage("districtalias_ChangesToShortNamesAndAliasesWillBeSaved"),MessageHelper.formatMessage("districtalias_AreYouSure") };

        %>
        <base:confirmBox 
            showWarningIcon="true" filterMessage="false" showPleaseWait="true"
            header='<%=MessageHelper.formatMessage("districtalias_SaveConfirmation")%>'
            messageText="<%=messageText%>"
            noName="<%=DistrictAliasForm.BUTTON_SAVE_NO%>" 
            yesName="<%=DistrictAliasForm.BUTTON_SAVE_YES%>"/>
     </logic:equal>

<base:outlinedTable>
<tr>
    <td class="TableHeading"><%= MessageHelper.formatMessage("DistrictAliasForm_FormTitle") %>               
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true" name="trapEnterKey">
    </td>
</tr>
<tr>
    <td align="center" class="ColRowBold">
        <base:showHideTag id="hideSave">
            <base:saveButton onclick="hideElementhideSave()"/>
            &nbsp;
            <base:genericButton onclick="hideElementhideSave()" src="/buttons/large/cancel.gif" alt='<%= MessageHelper.formatMessage("cancel") %>' name="<%= DistrictAliasForm.BUTTON_CANCEL %>" />
        </base:showHideTag>
    </td>
</tr>
<tr><td>
<table id="<%=DistrictAliasForm.TABLE_SITES %>" width="100%" border="1" cellpadding="2" cellspacing="0"> 
    <tr> <td class="ColRowBold" width="20%"> <%= MessageHelper.formatMessage("DistrictAliasForm_SiteName") %> </td> 
         <td class="ColRowBold" width="10%"> <%= MessageHelper.formatMessage("DistrictAliasForm_SiteShortName") %> </td> 
         <td class="ColRowBold"> <%= MessageHelper.formatMessage("DistrictAliasForm_Aliases") %> </td></tr>
    <% for ( AliasReturn cs: form.getSites()){%>
        <base:flipper key="districtalias">   
        <td class = "ColRow" valign="top"><%=cs.getSiteName() %> </td>
            <td class="ColRow" valign="top"><input <%=cs.isError()? inputStyleRed : "" %> id='<%="E" + cs.getSiteID() + "_ssn" %>' type="text" name='<%="E" + cs.getSiteID() + "_ssn" %>' maxlength="10" size="10" value="<%=cs.getAliasName()%>"></td>
            <td>
        <% counter = 0;
        for ( AliasReturn vo : form.getAliases(cs.getSiteID())){ %>
            <span class="ColRow"><input <%=vo.isError()? inputStyleRed : "" %>type="text" id='<%="E" + cs.getSiteID() + "_" + counter %>' name='<%="E" + cs.getSiteID() + "_" + counter %>' maxlength="10" size="10" value="<%=vo.getAliasName() %>"></span>
        <%  ++counter;
        } %>  
        <span class="ColRow"><input type="text" id='<%="E" + cs.getSiteID() + "_" + counter %>' name='<%="E" + cs.getSiteID() + "_" + counter %>' maxlength="10" size="10" value=""></span>
        </td></base:flipper>
    <%} %>    
    </table>
    </td></tr>
</base:outlinedTable>    
</base:form>
