<%@page import="com.follett.fsc.destiny.entity.ejb3.CopySpecs"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.data.BaseCopyJobParams"%>
<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.JSPHelper" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>


<bean:define id="limitersID" name="<%= GlobalUpdateAssetsForm.FORM_NAME %>" property="limiters"/>
<bean:define id="modifiersID" name="<%= GlobalUpdateAssetsForm.FORM_NAME %>" property="modifiers"/>
<base:messageBox strutsErrors="true"/>
<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    GlobalUpdateAssetsForm form = (GlobalUpdateAssetsForm)request.getAttribute(GlobalUpdateAssetsForm.FORM_NAME);
%>
<base:form action="/cataloging/servlet/handleglobalupdateassetsform.do">

<html:hidden name="<%= GlobalUpdateAssetsForm.FORM_NAME %>" property="<%= GlobalUpdateAssetsForm.PARAM_CUSTODIAN_ID_FROM %>"/>
<html:hidden name="<%= GlobalUpdateAssetsForm.FORM_NAME %>" property="<%= GlobalUpdateAssetsForm.PARAM_CUSTODIAN_ID_TO %>"/>

<% String message = "<center>This process cannot be reversed.</center>"; %>

    <logic:equal name="<%=GlobalUpdateAssetsForm.FORM_NAME%>" property="<%= GlobalUpdateAssetsForm.PARAM_SHOW_UPDATE_CONFIRMATION%>" value="true">
        <base:messageBox showWarningIcon="true" message="<%= message %>" filterMessage="false">
            <% if (form.getLimiterType() == BaseCopyJobParams.OPTION_PURCHASE_ORDER) { %>
                <% if ("".equals(form.getPurchaseOrderFrom())) { %>
                    <tr align="center">
                        <td>&nbsp;</td>
                        <td class="ColRowBold" nowrap>Every item with a blank purchase order number will be updated.</td>
                    </tr>
                <% } else { %>
                    <tr align="center">
                        <td>&nbsp;</td>
                        <td class="ColRowBold" nowrap>Every item with purchase order number &quot;<c:out value= "<%= form.getPurchaseOrderFrom() %>" />&quot; will be updated regardless of whether it is part of an open or closed order.</td>
                    </tr>
                    <tr align="center">
                        <td>&nbsp;</td>
                        <td class="ColRowBold" nowrap>If you reuse purchase order numbers, this could affect items from multiple orders.</td>
                    </tr>
                <% } %>
            <% }%>
            <tr align="center">
                <td>&nbsp;</td>
                <td class="ColRowBold">Are you sure you want to proceed?</td>
            </tr>
        <tr>
            <td class="ColRowBold" width="100%" align="center" colspan="2">
                <base:yesNo/>
            </td>
        </tr>
        </base:messageBox>
    </logic:equal>

<html:hidden name="<%= GlobalUpdateAssetsForm.FORM_NAME %>" property="<%= GlobalUpdateAssetsForm.FIELD_SUBMIT_TYPE %>"/>

<base:outlinedTableAndTabsWithinThere id="<%=UpdateCopiesBaseForm.TABLE_MAIN%>"  borderColor="#C0C0C0" selectedTab="<%=GlobalUpdateAssetsForm.ID_TAB_GLOBAL_UPDATE%>" tabs="<%=form.getAssetTabs()%>" >
<tr>
    <td class="TableHeading" colspan="2"><%=GlobalUpdateAssetsForm.PAGE_TITLE_ASSET%>...</td>
</tr>
<tr>
    <td>
        <table id="<%=GlobalUpdateAssetsForm.TABLE_HEADER%>">
            <bean:define id="assets" name="<%= GlobalUpdateAssetsForm.FORM_NAME %>" property="assetTreeOptionList" />
            <tr>
                <td>&nbsp;</td>
                <td valign="top">
                    <table cellpadding="3" id="<%=GlobalUpdateAssetsForm.TABLE_SUBMAIN%>">
				    <base:isDistrictUser>
				    <tr>
				        <td class="ColRowBold tdAlignRight" valign="top">
				            For
				        </td>
				        <td class="ColRow">
				            <base:selectSite 
				                includeAllLibraries="true" 
				                submitOnChange="true" 
				                name="<%=GlobalUpdateAssetsForm.FIELD_SITE_ID%>" 
				                selectedSiteID="<%=form.getForSiteID().toString()%>"
				                includeLibrarySites="false"
				        		includeTextbookSites="false"
				        		includeMediaSites="false"
				        		includeAssetSites="true"
				                />
				        </td>
				    </tr>
				    </base:isDistrictUser>
				    <base:isNotDistrictUser>
						<html:hidden name="<%= GlobalUpdateAssetsForm.FORM_NAME %>" property="<%= GlobalUpdateAssetsForm.FIELD_SITE_ID %>"/>
				    </base:isNotDistrictUser>
                    <tr>
                        <td class="FormLabel tdAlignRight">
                            <%= MessageHelper.formatMessage("globalupdateassets_ForEvery") %>
                        </td>
                        <td colspan="2">
                            <html:select property="<%=GlobalUpdateAssetsForm.FIELD_ASSET_TEMPLATE_ID %>">
                                <html:options collection="assets" property="longID" labelProperty="stringDesc"/>
                            </html:select>
                        </td>
                    </tr>
                    <tr>
                        <td class="ColRowBold tdAlignRight">Whose</td>
                        <td class="ColRowBold">
                            <html:select onchange="limiterTypeModified()" property="<%= GlobalUpdateAssetsForm.FIELD_LIMITER_TYPE %>">
                                <html:options collection="limitersID" property="longID"
                                              labelProperty="stringDesc"/>
                            </html:select>
                            is
                            <logic:equal name="<%=GlobalUpdateAssetsForm.FORM_NAME%>" property="<%= GlobalUpdateAssetsForm.FIELD_LIMITER_TYPE%>" value="<%= String.valueOf(BaseCopyJobParams.OPTION_DATE_ACQUIRED)%>">
                                <base:date 
                                        buttonName = "<%=GlobalUpdateAssetsForm.BUTTON_CHANGE_DATE_ACQUIRED_FROM%>"
                                        fieldName = "<%=GlobalUpdateAssetsForm.FIELD_ACQUIRED_DATE_FROM%>"
                                        dateValue = "<%=form.getDateAcquiredFrom()%>"
                                        /> 
                            </logic:equal>
                            <logic:notEqual name="<%=GlobalUpdateAssetsForm.FORM_NAME%>" property="<%= GlobalUpdateAssetsForm.FIELD_LIMITER_TYPE%>" value="<%= String.valueOf(BaseCopyJobParams.OPTION_DATE_ACQUIRED)%>">
                                <%= form.buildLimiterTypeHTML() %>
                            </logic:notEqual>
                        </td>
                    </tr>


                    <tr>
                        <td class="ColRowBold tdAlignRight">Change</td>
                        <td class="ColRowBold">
                            <html:select onchange="modifierTypeModified()" property="<%= GlobalUpdateAssetsForm.FIELD_MODIFIER_TYPE %>">
                                <html:options collection="modifiersID" property="longID"
                                              labelProperty="stringDesc"/>
                            </html:select>
                            to
                            <logic:equal name="<%=GlobalUpdateAssetsForm.FORM_NAME%>" property="<%= GlobalUpdateAssetsForm.FIELD_MODIFIER_TYPE%>" value="<%= String.valueOf(BaseCopyJobParams.OPTION_DATE_ACQUIRED)%>">
                                <base:date 
                                        buttonName = "<%=GlobalUpdateAssetsForm.BUTTON_CHANGE_DATE_ACQUIRED_TO%>"
                                        fieldName = "<%=GlobalUpdateAssetsForm.FIELD_ACQUIRED_DATE_TO%>"
                                        dateValue = "<%=form.getDateAcquiredTo()%>"
                                        /> 
                            </logic:equal>
                            <logic:notEqual name="<%=GlobalUpdateAssetsForm.FORM_NAME%>" property="<%= GlobalUpdateAssetsForm.FIELD_MODIFIER_TYPE%>" value="<%= String.valueOf(BaseCopyJobParams.OPTION_DATE_ACQUIRED)%>">
                                <%= form.buildModifierTypeHTML() %>
                            </logic:notEqual>
                        <logic:equal name="<%=GlobalUpdateAssetsForm.FORM_NAME%>" property="<%= GlobalUpdateAssetsForm.FIELD_MODIFIER_TYPE%>" value="<%= String.valueOf(BaseCopyJobParams.OPTION_HOME_LOCATION)%>">
                            <base:spanIfAllowed permission="<%= Permission.CAT_MANAGE_LOCATIONS %>">                        
                            &nbsp;
                            <base:genericButton absbottom="true" src="/buttons/large/other.gif" name="<%=GlobalUpdateAssetsForm.BUTTON_HOME_LOCATION_OTHER_TO%>" alt='<%= MessageHelper.formatMessage("other") %>'/>
                            </base:spanIfAllowed>
                        </logic:equal>                            
                        <logic:equal name="<%=GlobalUpdateAssetsForm.FORM_NAME%>" property="<%= GlobalUpdateAssetsForm.FIELD_MODIFIER_TYPE%>" value="<%= String.valueOf(BaseCopyJobParams.OPTION_DEPARTMENT)%>">
                            <base:spanIfAllowed permission="<%= Permission.BACK_OFFICE_SITE_ADMINISTRATION %>">
                            &nbsp;
                            <base:genericButton absbottom="true" src="/buttons/large/other.gif" name="<%=GlobalUpdateAssetsForm.BUTTON_DEPARTMENT_OTHER_TO%>" alt='<%= MessageHelper.formatMessage("other") %>'/>
                            </base:spanIfAllowed>
                        </logic:equal>                            
                        <logic:equal name="<%=GlobalUpdateAssetsForm.FORM_NAME%>" property="<%= GlobalUpdateAssetsForm.FIELD_MODIFIER_TYPE%>" value="<%= String.valueOf(BaseCopyJobParams.OPTION_FUNDING_SOURCE)%>">
                            <base:spanIfAllowed permission="<%= Permission.CAT_MANAGE_ASSET_TEMPLATES %>">
                                &nbsp;
                                <base:genericButton absbottom="true" src="/buttons/large/other.gif" name="<%=GlobalUpdateAssetsForm.BUTTON_FUNDING_SOURCE_OTHER_TO%>" alt='<%= MessageHelper.formatMessage("other") %>'/>
                            </base:spanIfAllowed>
                        </logic:equal>                            
                        <logic:equal name="<%=GlobalUpdateAssetsForm.FORM_NAME%>" property="<%= GlobalUpdateAssetsForm.FIELD_MODIFIER_TYPE%>" value="<%= String.valueOf(BaseCopyJobParams.OPTION_ITEM_CATEGORIES)%>">
                            &nbsp;
                            <base:genericButton absbottom="true" src="/buttons/large/other.gif" name="<%=GlobalUpdateAssetsForm.BUTTON_ITEM_CATEGORIES_OTHER_TO%>" alt='<%= MessageHelper.formatMessage("other") %>'/>
                        </logic:equal>                            
                        </td>
                    </tr>
                    <base:spanIfAllowed permission="<%= Permission.BACK_OFFICE_ADD_HISTORICAL_NOTES %>">
        			<tr>
            		    <td class="ColRowBold tdAlignRight">Add historical note</td>
            		    <td>
           		    		<table id="<%=GlobalUpdateAssetsForm.TABLE_HISTORICAL_NOTE%>" cellpadding="0" cellspacing="0" border="0">
           		    			<tr>
        				            <td>
        				                <html:text property='<%= GlobalUpdateAssetsForm.FIELD_HISTORICAL_NOTE %>' maxlength="120" size="70"/>
        				            </td>
        				        </tr>
        				    </table>
        			    </td>
        			</tr>
            		</base:spanIfAllowed>
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
					<base:genericButton src="/buttons/large/update.gif" name="<%=GlobalUpdateAssetsForm.ID_BUTTON_UPDATE_COPIES%>" alt="<%=GlobalUpdateAssetsForm.BUTTON_UPDATE_COPIES_ALT_TEXT%>"/>
                </td>
            </tr>
        </table>

    </td>
</tr>
</base:outlinedTableAndTabsWithinThere>
<input type="image" name="<%=GlobalUpdateAssetsForm.BUTTON_LIMITER_TYPE_CHANGE_FOR_TEST_ONLY %>" id="<%=GlobalUpdateAssetsForm.BUTTON_LIMITER_TYPE_CHANGE_FOR_TEST_ONLY %>" src="/images/icons/general/spacer.gif" alt="" title="">&nbsp;
<input type="image" name="<%=GlobalUpdateAssetsForm.BUTTON_MODIFIER_TYPE_CHANGE_FOR_TEST_ONLY %>" id="<%=GlobalUpdateAssetsForm.BUTTON_MODIFIER_TYPE_CHANGE_FOR_TEST_ONLY %>" src="/images/icons/general/spacer.gif" alt="" title="">&nbsp;
</base:form>

<script language="javascript">
<!--
function limiterTypeModified() {
    document.<%=GlobalUpdateAssetsForm.FORM_NAME%>.<%=GlobalUpdateAssetsForm.FIELD_SUBMIT_TYPE%>.value = "<%=GlobalUpdateAssetsForm.SUBMIT_TYPE_LIMITER%>";
    document.<%=GlobalUpdateAssetsForm.FORM_NAME%>.submit();
}
function modifierTypeModified() {
        document.<%=GlobalUpdateAssetsForm.FORM_NAME%>.<%=GlobalUpdateAssetsForm.FIELD_SUBMIT_TYPE%>.value = "<%=GlobalUpdateAssetsForm.SUBMIT_TYPE_MODIFIER%>";
        document.<%=GlobalUpdateAssetsForm.FORM_NAME%>.submit();
}
-->
</script>
