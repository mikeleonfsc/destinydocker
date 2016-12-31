<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>


<base:messageBox strutsErrors="true"/>

<bean:define id="form" name="<%=GlobalDeleteTagForm.FORM_NAME%>" type="com.follett.fsc.destiny.client.cataloging.servlet.GlobalDeleteTagForm" />

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request); 
    int collectionType = store.isMediaBookingUser() ? CollectionType.MEDIA : CollectionType.LIBRARY;    
%>


<base:form action="/cataloging/servlet/handleglobaldeletetag.do">
<html:hidden property="targetTag" />
<html:hidden property="<%=GlobalDeleteTagForm.FIELD_ALLOW_AR_ENTERPRISE %>" />
<html:hidden property="<%=GlobalDeleteTagForm.FIELD_ALLOW_RC_ENTERPRISE %>" />
<html:hidden property="<%=GlobalDeleteTagForm.FIELD_SHOW_PRESERVE_AR %>" />
<html:hidden property="<%=GlobalDeleteTagForm.FIELD_SHOW_PRESERVE_RC %>" />

<logic:equal  name="<%=GlobalDeleteTagForm.FORM_NAME%>" property="<%=GlobalDeleteTagForm.PARAM_SHOW_CONFIRMATION%>" value="true">           
    <base:messageBox showRedBorder="true">
    <tr>
        <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
        <td valign="baseline" class="Error">
            <logic:equal  name="<%=GlobalDeleteTagForm.FORM_NAME%>" property="<%=GlobalDeleteTagForm.FIELD_DELETE_TAG_LIMITER%>" value="<%=GlobalDeleteTagForm.RADIO_ALL_RECORDS%>">           
                <p align="center"><%= MessageHelper.formatMessage("globaldeletetag_YouHaveElectedToDelete",form.getTargetTag()) %></p>
            </logic:equal>
            <logic:equal  name="<%=GlobalDeleteTagForm.FORM_NAME%>" property="<%=GlobalDeleteTagForm.FIELD_DELETE_TAG_LIMITER%>" value="<%=GlobalDeleteTagForm.RADIO_BY_SUBFIELD%>">           
                <p align="center"><%= MessageHelper.formatMessage("globaldeletetag_YouHaveElectedToDeletewhere",form.getTargetTag(),form.getSelectSubfield(),form.getSubfieldContents()) %></p>
            </logic:equal>
            <p align="center"><%= MessageHelper.formatMessage("globaldeletetag_ThisProcessCannotBeReversedAndMayTakeALongTimeTo") %></p>
            <p align="center"><%= MessageHelper.formatMessage("globaldeletetag_AreYouSureYouWantToProceed") %></p>
            <div align="center">
                <base:yesNo/>
            </div>
        </td>
    </tr>
    </base:messageBox>
</logic:equal>


<base:outlinedTableAndTabsWithinThere id="<%=GlobalDeleteTagForm.TABLE_MAIN%>"  selectedTab="<%=GlobalDeleteTagForm.ID_TAB%>" tabs="<%=UpdateTitlesNavigationForm.getTabs()%>" cellpadding="2" >
    <tr>
        <td colspan="2" class="TableHeading"><%= MessageHelper.formatMessage("globaldeletetag_GlobalDeleteTags") %></td>
    </tr>
    <logic:equal name="<%=GlobalDeleteTagForm.FORM_NAME %>" property="showSiteList" value="true" scope="request" >        		
		<tr>
            <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("globaldeletetag_From") %></td>
			<td nowrap class="ColRow">
				<base:selectSite 
				    name="<%= GlobalDeleteTagForm.FIELD_DELETE_TAG_SITE_ID %>" 
				    selectedSiteID="<%=form.getDeleteTagSiteID().toString() %>" 
				    includeAllLibraries="true" 
				    submitOnChange="false"
				    includeLibrarySites="true"
        			includeTextbookSites="false"
        			includeMediaSites="false"
        			includeAssetSites="false"
                    onChangeAction="this.form.submit(); return false;"
				    />
			</td>
		</tr>
	</logic:equal>       		
    
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top" nowrap><%= MessageHelper.formatMessage("globaldeletetag_TagSelection") %></td>
        <td class="ColRow">
            <html:radio property="<%=GlobalDeleteTagForm.FIELD_TAG_SELECTION%>" value="<%=GlobalDeleteTagForm.RADIO_526%>"/><%= MessageHelper.formatMessage("globaldeletetag_526StudyProgramInformation") %></td>
    </tr>
    
    <% if (collectionType == CollectionType.LIBRARY) { %>
        <% if (form.isShowPreserveAR()) { %>
        <tr>
            <td>&nbsp;</td>
            <td class="ColRow">
                <img width="22" height="1" src="/images/icons/general/spacer.gif" border="0">
                <c:if test="<%=!form.isAllowAREnterprise()%>">
                    <% if (GlobalDeleteTagForm.RADIO_BY_SUBFIELD.equals(form.getDeleteTagLimiter())) { %>
                        <html:checkbox property="<%=GlobalDeleteTagForm.FIELD_PRESERVE_AR %>" disabled="true"><font color="#AAAAAA"><%= MessageHelper.formatMessage("globaldeletetag_PreserveAcceleratedReaderServiceQuizzes") %></font></html:checkbox>
                    <% } else { %>
                        <html:checkbox property="<%=GlobalDeleteTagForm.FIELD_PRESERVE_AR %>"><%= MessageHelper.formatMessage("globaldeletetag_PreserveAcceleratedReaderServiceQuizzes") %></html:checkbox>
                    <% } %>
                </c:if>
                <c:if test="<%=form.isAllowAREnterprise()%>">
                     <%= MessageHelper.formatMessage("globaldeletetag_AcceleratedReaderEnterpriseService") %>
                </c:if>
            </td>
        </tr>
        <% } %>
        <% if (form.isShowPreserveRC()) { %>
        <tr>
            <td>&nbsp;</td>
            <td class="ColRow">
                <img width="22" height="1" src="/images/icons/general/spacer.gif" border="0">
                <c:if test="<%=!form.isAllowRCEnterprise()%>">
                    <% if (GlobalDeleteTagForm.RADIO_BY_SUBFIELD.equals(form.getDeleteTagLimiter())) { %>
                        <html:checkbox property="<%=GlobalDeleteTagForm.FIELD_PRESERVE_RC %>" disabled="true"><font color="#AAAAAA"><%= MessageHelper.formatMessage("globaldeletetag_PreserveReadingCountsServiceQuizzes") %></font></html:checkbox>
                    <% } else { %>
                        <html:checkbox property="<%=GlobalDeleteTagForm.FIELD_PRESERVE_RC %>"><%= MessageHelper.formatMessage("globaldeletetag_PreserveReadingCountsServiceQuizzes") %></html:checkbox>
                    <% } %>
                </c:if>
                <c:if test="<%=form.isAllowRCEnterprise()%>">
                    <%= MessageHelper.formatMessage("globaldeletetag_ReadingCountsEnterpriseService") %>
                </c:if>
            </td>
        </tr>
        <% } %>
    <% } %>
        
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top" nowrap>&nbsp;</td>
        <td class="ColRow">
            <html:radio property="<%=GlobalDeleteTagForm.FIELD_TAG_SELECTION%>" value="<%=GlobalDeleteTagForm.RADIO_856%>"/><%= MessageHelper.formatMessage("globaldeletetag_856ElectronicLocation") %></td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top" nowrap>&nbsp;</td>
        <td class="ColRow">
            <html:radio property="<%=GlobalDeleteTagForm.FIELD_TAG_SELECTION%>" value="<%=GlobalDeleteTagForm.RADIO_9XX%>"/><%= MessageHelper.formatMessage("globaldeletetag_9xxEnter9xxTagToDelete") %>&nbsp;<html:text property="<%=GlobalDeleteTagForm.FIELD_VALID_9XX%>" size="3" maxlength="3"/>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top" nowrap><%= MessageHelper.formatMessage("globaldeletetag_DeleteTag") %></td>
        <td class="ColRow">
            <html:radio property="<%=GlobalDeleteTagForm.FIELD_DELETE_TAG_LIMITER%>" value="<%=GlobalDeleteTagForm.RADIO_ALL_RECORDS%>" onclick="this.form.submit(); return false;"/><%= MessageHelper.formatMessage("globaldeletetag_FromAllRecords") %></td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top" nowrap>&nbsp;</td>
        <td class="ColRow">
            <html:radio property="<%=GlobalDeleteTagForm.FIELD_DELETE_TAG_LIMITER%>" value="<%=GlobalDeleteTagForm.RADIO_BY_SUBFIELD%>"  onclick="this.form.submit(); return false;"/>
            <%= MessageHelper.formatMessage("globaldeletetag_IfSubfield") %>&nbsp;<html:text property="<%=GlobalDeleteTagForm.FIELD_SELECT_SUBFIELD %>" size="1" maxlength="1"/>&nbsp;<%=MessageHelper.formatMessage("globaldeletetag_StartsWith") %>&nbsp;<html:textarea property="<%=GlobalDeleteTagForm.FIELD_SUBFIELD_CONTENTS %>" rows="2" cols="20"/>
        </td>
    </tr>
    
    <tr>
        <td colspan="2"><base:imageLine height="2" width="95%" /></td>
    </tr>
    <tr>
        <td class="ColRowBold" align="center" valign="top" colspan="2">
            <%= GenericForm.getLastBackupDisplayMsg(true) %>
        </td>
    <tr>
        <td class="ColRow" colspan="2" align="center">
            <base:genericButton src="/buttons/large/deletebig.gif" alt='<%=MessageHelper.formatMessage("delete")%>' name="<%=GlobalDeleteTagForm.ID_BUTTON_DELETE%>" />
        </td>
    </tr>
</base:outlinedTableAndTabsWithinThere>
</base:form>
