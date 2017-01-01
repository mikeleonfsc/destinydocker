<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.data.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag" %>
<%@ page import="com.follett.fsc.destiny.client.common.data.Tab"%>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.BasePatronListForm"%>
<%@page import="com.follett.fsc.destiny.client.common.servlet.GenericForm"%>
<%@page import="com.follett.fsc.common.MessageHelper"%>

<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<% 
    RemoveSecondaryAssociationsForm form = (RemoveSecondaryAssociationsForm) request.getAttribute(RemoveSecondaryAssociationsForm.FORM_NAME);
    SessionStoreProxy store = form.getStore(); 
    Tab[] tabs = BasePatronListForm.getTabs(store);    
%>



<bean:define id="optionID" name="<%=RemoveSecondaryAssociationsForm.FORM_NAME%>" property="optionsList" />

<base:messageBox strutsErrors="true"/>
<br>
<base:form action="/backoffice/servlet/handleremovesecondaryassociationsform" enctype="multipart/form-data">

<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey"/>
<base:outlinedTableAndTabsWithinThere id="<%=RemoveSecondaryAssociationsForm.TABLE_MAIN%>" tabs="<%= tabs %>" selectedTab="<%= IUpdatePatronForm.ID_TAB_REMOVE_PAT_ASSOC %>" hideTabsWhenPrinterFriendly="true" borderColor="#C0C0C0" align="left" width="100%">
    <tr>
        <td class="TableHeading">
            <%=MessageHelper.formatMessage("removesecondaryassociations_RemovePatronSecondarySiteAssociations") %>
        </td>
    </tr>
        <logic:equal name="<%= RemoveSecondaryAssociationsForm.FORM_NAME %>" property="<%= RemoveSecondaryAssociationsForm.FIELD_OPTION_FLAG%>" value="<%= RemoveSecondaryAssociationsForm.OPTION_GLOBAL_CRITERIA%>">
            <tr>
                <td valign="baseline" class="ColRow">
                        <%=MessageHelper.formatMessage("removesecondaryassociations_BasedOn") %> 
                        <html:select property="<%= RemoveSecondaryAssociationsForm.FIELD_OPTION_FLAG%>" onchange="this.form.submit(); return false;" >
                            <html:options collection="optionID" property="longID" labelProperty="stringDesc" />
                        </html:select>
                        <%=MessageHelper.formatMessage("removesecondaryassociations_ForPatronsAt") %>
                        <base:selectSite 
                            name="<%= RemoveSecondaryAssociationsForm.FIELD_TARGET_SITE_ID%>"
                            selectedSiteID="<%=form.getTargetSiteID().toString()%>"
                            includeAllSites="true" 
                            includeAssetSites="true" 
                            includeTextbookSites="true" 
                            includeLibrarySites="true" 
                            includeMediaSites="false"
                            includeDistrictWarehouse="false" 
                            />
                </td>
            </tr>
        </logic:equal>
        <logic:equal name="<%= RemoveSecondaryAssociationsForm.FORM_NAME %>" property="<%= RemoveSecondaryAssociationsForm.FIELD_OPTION_FLAG%>" value="<%= RemoveSecondaryAssociationsForm.OPTION_DISTRICT_IDS%>">
            <html:hidden property="<%=RemoveSecondaryAssociationsForm.FIELD_TARGET_SITE_ID %>"/>
            <tr>
                <td valign="baseline" class="ColRow">
                        <%=MessageHelper.formatMessage("removesecondaryassociations_BasedOn") %> 
                        <html:select property="<%= RemoveSecondaryAssociationsForm.FIELD_OPTION_FLAG%>" onchange="this.form.submit(); return false;" >
                            <html:options collection="optionID" property="longID" labelProperty="stringDesc" />
                        </html:select>
                </td>
            </tr>
            <tr>
                <td>
                    <base:imageLine/>
                </td>
            </tr>
            <tr>
               <td>
                  <base:districtIDList formName="<%=RemoveSecondaryAssociationsForm.FORM_NAME%>"/>
               </td>
            </tr>
        </logic:equal>
    <tr>
        <td valign="baseline" class="ColRow">
            <%=MessageHelper.formatMessage("removesecondaryassociations_IfAPatronIsAssociatedWithMoreThanOneSiteRemoveAllSecondarySiteAssociationsRetainThePrimarySiteAssociation") %>
        </td>
    </tr>
    <tr>
        <td>
            <base:imageLine/>
        </td>
    </tr>
    <tr>
        <td valign="baseline" class="ColRowBold">
            <%=MessageHelper.formatMessage("removesecondaryassociations_YouMustPreviewTheResultsBeforeRemovingPatronSecondarySiteAssociations") %> 
        </td>
    </tr>
    <tr>
        <td valign="baseline">
            <span class="ColRow"><%= GenericForm.getLastBackupDisplayMsg(true) %></span>
        </td>
    </tr>
    <tr>
        <td valign="baseline" align="center" class="ColRow">
            <base:genericButton src="/buttons/large/preview2.gif" name="<%=IUpdatePatronForm.BUTTON_REMOVE_PAT_ASSOC%>" alt='<%=MessageHelper.formatMessage("preview")%>'/>
        </td>
    </tr>
    
</base:outlinedTableAndTabsWithinThere>
</base:form>
