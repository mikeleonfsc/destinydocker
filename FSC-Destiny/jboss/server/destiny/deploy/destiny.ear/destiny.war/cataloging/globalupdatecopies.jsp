<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.jsptag.EditCopyDropDownTag"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.session.cataloging.data.BaseCopyJobParams" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.QuickPickSpecs" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>


<bean:define id="limitersID" name="<%= GlobalUpdateForm.FORM_NAME %>" property="limiters"/>
<bean:define id="modifiersID" name="<%= GlobalUpdateForm.FORM_NAME %>" property="modifiers"/>
<bean:define id="form" name="<%=GlobalUpdateForm.FORM_NAME%>" type="com.follett.fsc.destiny.client.cataloging.servlet.GlobalUpdateForm"/> 
<c:set var="cform" value="<%=request.getAttribute(GlobalUpdateForm.FORM_NAME)%>"/>
<c:set var="OPTION_SUB_LOCATION" value="<%=BaseCopyJobParams.OPTION_SUB_LOCATION%>"/>                                                                                                               
<c:set var="OPTION_FUNDING_SOURCE" value="<%=BaseCopyJobParams.OPTION_FUNDING_SOURCE%>"/>                        
<c:set var="OPTION_VENDOR" value="<%=BaseCopyJobParams.OPTION_VENDOR%>"/> 
       
<base:messageBox strutsErrors="true"/>
<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);    
    
%>
<base:form action="/cataloging/servlet/handleglobalupdateform.do">
<input type="hidden" name="changedDropDown" />

    <logic:equal name="<%=GlobalUpdateForm.FORM_NAME%>" property="<%= GlobalUpdateForm.PARAM_SHOW_UPDATE_CONFIRMATION%>" value="true">
        <base:messageBox showWarningIcon="true" message='<%= MessageHelper.formatMessage("globalupdatecopies_ThisProcessCannotBeReversed") %>'>
        <tr align="center" width="100%">
            <td>&nbsp;</td>
            <td class="ColRowBold"><%= MessageHelper.formatMessage("globalupdatecopies_AreYouSureYouWantToProceed") %></td>
        </tr>
        <tr>
            <td class="ColRowBold" width="100%" align="center" colspan="2">
                <base:yesNo/>
            </td>
        </tr>
        </base:messageBox>      
    </logic:equal>

<html:hidden name="<%= GlobalUpdateForm.FORM_NAME %>" property="<%= GlobalUpdateForm.FIELD_SUBMIT_TYPE %>"/>
<html:hidden property="collectionType"/>

<base:outlinedTableAndTabsWithinThere  width="100%" id="<%=UpdateCopiesBaseForm.TABLE_MAIN%>"  borderColor="#C0C0C0" selectedTab="<%=GlobalUpdateForm.ID_TAB_GLOBAL_UPDATE%>" tabs="<%=form.getTabs()%>" >
<tr>
    <td>
        <table border="0" cellspacing="0" cellpadding="0" width="100%" id="<%=GlobalUpdateForm.TABLE_HEADER%>">
            <tr>
                <base:isMediaSite showForMedia="false">
                    <td class="TableHeading" colspan="2"><%= MessageHelper.formatMessage("globalupdatecopies_UpdateEveryLibraryCopy") %></td>
                </base:isMediaSite>
                <base:isMediaSite showForMedia="True">
                    <td class="TableHeading" colspan="2"><%= MessageHelper.formatMessage("globalupdatecopies_UpdateEveryCopy") %></td>
                </base:isMediaSite>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td valign="top">
                    <table border="0" cellpadding="3" cellspacing="0" id="<%=GlobalUpdateForm.TABLE_SUBMAIN%>">
                    <base:isMediaSite showForMedia="false">
                        <% if (form.isDistrictCataloger() ) { %>
                            <tr>
                                <td colspan="2">&nbsp;</td>
                            </tr>
                            <tr>
                                <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("globalupdatecopies_From") %>&nbsp;</td>
                                <td>
                                    <base:selectSite onChangeAction="submitSiteChange();"
                                                     includeFromDistrict="false"
                                                     useSelectASite="true"
                                                     selectedSiteID="<%=form.getSelectedSiteForDistrict() %>"
                                                     includeAllLibraries="false"
                                                     includeLibrarySites="true"
                                                     collectionType="<%=CollectionType.LIBRARY %>"
                                                     name="<%=UpdateCopiesBaseForm.FIELD_SELECTED_SITE_FOR_DISTRICT%>" />
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2">&nbsp;</td>
                            </tr>
                        <% } %>
                    </base:isMediaSite>
                    <% if (form.isDisplayDropdowns()) { %>
                    <tr>
                        <td class="ColRowBold"><%= MessageHelper.formatMessage("globalupdatecopies_With") %></td>
                        <td class="ColRowBold">
                            <html:select onchange="limiterTypeModified()" property="<%= GlobalUpdateForm.FIELD_LIMITER_TYPE %>">
                                <html:options collection="limitersID" property="longID"
                                              labelProperty="stringDesc"/>
                            </html:select>
                            :
                            <%= form.buildLimiterTypeHTML(store) %>
                        </td>
                    </tr>


                    <tr>
                        <td class="ColRowBold"><%= MessageHelper.formatMessage("globalupdatecopies_Make") %></td>
                        <td class="ColRowBold">
                            <html:select onchange="modifierTypeModified()" property="<%= GlobalUpdateForm.FIELD_MODIFIER_TYPE %>">
                                <html:options collection="modifiersID" property="longID"
                                              labelProperty="stringDesc"/>
                            </html:select>
                            :
                                
                            <c:choose>
                                <c:when test="${cform.modifierType == OPTION_SUB_LOCATION}">
                                   <base:editCopyDropDown fieldName="<%= GlobalUpdateForm.FIELD_MODIFIER_ENTRY %>" 
                                                   siteID="<%= form.getSiteID() %>"
                                                   currentSelection="${cform.modifierEntry}" 
                                                   controlNum="<%= QuickPickSpecs.CONTROL_NUM_SUBLOCATION %>"/>
                                </c:when>
                                <c:when test="${cform.modifierType == OPTION_FUNDING_SOURCE}">
                                   <base:editCopyDropDown fieldName="<%= GlobalUpdateForm.FIELD_MODIFIER_ENTRY %>" 
                                                   siteID="<%= form.getSiteID() %>"
                                                   currentSelection="${cform.modifierEntry}" 
                                                   controlNum="<%= QuickPickSpecs.CONTROL_NUM_FUNDINGSOURCE %>"/>
                                </c:when>
                                <c:when test="${cform.modifierType == OPTION_VENDOR}">
                                   <base:editCopyDropDown fieldName="<%= GlobalUpdateForm.FIELD_MODIFIER_ENTRY %>" 
                                                   siteID="<%= form.getSiteID() %>" 
                                                   currentSelection="${cform.modifierEntry}" 
                                                   controlNum="<%= EditCopyDropDownTag.CONTROL_NUM_VENDOR %>"/>                                                   
                                </c:when>                                                                                                                           
                                <c:otherwise>                                                                     
                                    <%= form.buildModifierTypeHTML(store) %>
                                </c:otherwise>
                            </c:choose>     
                        </td>
                    </tr>
                    <%} %>
                    </table>
                </td>
            </tr>
            <tr valign="top">
                <td valign="top" colspan="2" align="center" class="ColRowBold">
                    <%= GenericForm.getLastBackupDisplayMsg(true) %>
                </td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2">
                    <base:genericButton src="/buttons/large/updatecopies.gif" name="<%=GlobalUpdateForm.ID_BUTTON_UPDATE_COPIES%>" alt='<%=MessageHelper.formatMessage("update")%>'/>
                </td>
            </tr>
        </table>

    </td>
</tr>
</base:outlinedTableAndTabsWithinThere>
</base:form>

<script language="javascript">
<!--
function limiterTypeModified() {
        document.<%=GlobalUpdateForm.FORM_NAME%>.<%=GlobalUpdateForm.FIELD_SUBMIT_TYPE%>.value = "<%=GlobalUpdateForm.SUBMIT_TYPE_LIMITER%>";
        document.<%=GlobalUpdateForm.FORM_NAME%>.submit();
}
function modifierTypeModified() {
        document.<%=GlobalUpdateForm.FORM_NAME%>.<%=GlobalUpdateForm.FIELD_SUBMIT_TYPE%>.value = "<%=GlobalUpdateForm.SUBMIT_TYPE_MODIFIER%>";
        document.<%=GlobalUpdateForm.FORM_NAME%>.submit();
}
function submitSiteChange() {
    document.<%=GlobalUpdateForm.FORM_NAME%>.changedDropDown.value="true";    
    document.<%=GlobalUpdateForm.FORM_NAME%>.submit();
}
-->
</script>
