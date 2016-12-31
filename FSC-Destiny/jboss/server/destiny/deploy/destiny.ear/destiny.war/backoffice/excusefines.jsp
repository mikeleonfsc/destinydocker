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
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>



<%
    ExcuseFinesForm form = (ExcuseFinesForm) request.getAttribute(ExcuseFinesForm.FORM_NAME);
    SessionStoreProxy store = form.getStore();
    Tab[] tabs = BasePatronListForm.getTabs(store);
%>


<base:messageBox strutsErrors="true"/>
<base:form action="/backoffice/servlet/handleexcusefinesform">

<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey"/>
    <logic:equal name="<%=ExcuseFinesForm.FORM_NAME%>" property="<%=ExcuseFinesForm.PARAM_SHOW_CONFIRMATION%>" value="true">
        <%
            String headerStr = form.getConfirmationMessageHeader();
                    String[] messageText = new String[]{
                        MessageHelper.formatMessage("excusefines_AreYouSureYouWantToProceed")
                    };
        %>
        <base:confirmBox 
            showWarningIcon="true" filterMessage="false" showPleaseWait="true"
            header="<%=headerStr%>"
            messageText="<%=messageText%>"
            noName="<%=ExcuseFinesForm.BUTTON_CANCEL_DELETE_FINES%>" 
            yesName="<%=ExcuseFinesForm.BUTTON_CONFIRM_DELETE_FINES%>"/>
     </logic:equal>
    <base:outlinedTableAndTabsWithinThere id="<%=ExcuseFinesForm.TABLE_MAIN%>"
        tabs="<%=tabs%>"
        selectedTabID="<%=IUpdatePatronForm.ID_TAB_EXCUSE_FINES%>"
        selectedTab='<%=MessageHelper.formatMessage("excusefines_TabExcuseFines")%>'
        hideTabsWhenPrinterFriendly="true" borderColor="#C0C0C0" width="100%">
        <tr>
            <td colspan="2" class="TableHeading"><%=MessageHelper.formatMessage("excusefines_ExcuseDelete")%>
            </td>
        </tr>
        <!-- checkboxes for fine types -->
        <%
            if (store.isLibraryProductViewable()) {
        %>
        <tr>
            <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("excusefines_MySitesOutstanding")%></td>
            <td class="ColRow"><html:checkbox
                    property="<%=ExcuseFinesForm.FIELD_LIBRARY_FINES%>"><%=MessageHelper.formatMessage("excusefines_LibraryFines")%></html:checkbox>
            </td>
        </tr>
        <%
            }
        %>
        <%
            if (store.isTextbookProductViewable()) {
        %>
        <tr>
            <td class="ColRowBold tdAlignRight">&nbsp;</td>
            <td class="ColRow"><html:checkbox
                    property="<%=ExcuseFinesForm.FIELD_TEXTBOOK_FINES%>"><%=MessageHelper.formatMessage("excusefines_TextbooksFines")%></html:checkbox>
            </td>
        </tr>
        <%
            }
        %>
        <%
            if (store.isAssetProductViewable()) {
        %>
        <tr>
            <td class="ColRowBold tdAlignRight">&nbsp;</td>
            <td class="ColRow"><html:checkbox
                    property="<%=ExcuseFinesForm.FIELD_ASSET_FINES%>"><%=MessageHelper.formatMessage("excusefines_AssetFines")%></html:checkbox>
            </td>
        </tr>
        <%
            }
        %>
        <!-- We only want to show the Patron Fines checkbox when in View All, Library or Textbook View, not for Asset Only Sites or a Combo's site when Asset View is selected -->
        <%
            if (!store.isAssetSiteOnly() && !store.isAssetProductViewable() || 
                store.isLibraryProductViewable() && store.isTextbookProductViewable() && store.isAssetProductViewable() ||
                store.isLibraryProductViewable() && store.isAssetProductViewable() ||
                store.isTextbookProductViewable() && store.isAssetProductViewable()) {
        %>
        <tr>
            <td class="ColRowBold tdAlignRight">&nbsp;</td>
            <td class="ColRow"><html:checkbox
                    property="<%=ExcuseFinesForm.FIELD_PATRON_FINES%>"><%=MessageHelper.formatMessage("excusefines_PatronFines")%></html:checkbox>
            </td>
        </tr>
        <%
            }
        %>
        <tr>
            <td class="ColRowBold tdAlignRight">&nbsp;</td>
            <td class="ColRow"><html:checkbox
                    property="<%=ExcuseFinesForm.FIELD_REFUNDS%>"><%=MessageHelper.formatMessage("excusefines_Refunds")%></html:checkbox>
            </td>
        </tr>
        <!-- textboxes for fine amount range -->
        <tr>
            <td class="ColRow tdAlignRight">&nbsp;</td>
            <td class="ColRow"><%=MessageHelper.formatMessage("excusefines_WithAValueFrom")%>&nbsp;<html:text
                    property="<%=ExcuseFinesForm.FIELD_AMOUNT_FROM%>" />&nbsp;<%=MessageHelper.formatMessage("excusefines_To")%>&nbsp;<html:text
                    property="<%=ExcuseFinesForm.FIELD_AMOUNT_TO%>" /></td>
        </tr>
        <!-- patrons associated with my site only or include offsite patrons with fines at my site -->
        <tr>
            <td class="ColRowBold tdAlignRight" valign="top"><%=MessageHelper.formatMessage("excusefines_AssociatedWith")%></td>
            <td class="ColRow"><html:select
                    property="<%=ExcuseFinesForm.FIELD_PATRONS_TO_HAVE_FINES_REMOVED%>">
                    <html:option
                        value='<%="" + FineGlobalDeleteJobParams.OPTION_ALL_PATRONS%>'>
                        <%=form.getOptionsDescription(FineGlobalDeleteJobParams.OPTION_ALL_PATRONS)%></html:option>
                    <html:option
                        value='<%="" + FineGlobalDeleteJobParams.OPTION_MY_PATRONS_ONLY%>'>
                        <%=form.getOptionsDescription(FineGlobalDeleteJobParams.OPTION_MY_PATRONS_ONLY)%></html:option>
                </html:select></td>
        </tr>
        <!-- patron limit by drop down (e.g. grad year, grade level, etc.) -->
        <tr>
            <td class="ColRowBold tdAlignRight" valign="top">&nbsp;</td>
            <td class="ColRow"><html:checkbox
                    property="<%=ExcuseFinesForm.FIELD_LIMIT_BY_PATRON_FIELD%>"><%=MessageHelper.formatMessage("excusefines_With")%></html:checkbox>
                &nbsp; <html:select
                    property="<%=ExcuseFinesForm.FIELD_ASSOCIATED_FIELD%>">
                    <html:option
                        value='<%="" + FineGlobalDeleteJobParams.OPTION_GRAD_YEAR%>'>
                        <%=form
                                .getFieldDisplayableForGlobalDelete(FineGlobalDeleteJobParams.OPTION_GRAD_YEAR)%></html:option>
                    <html:option
                        value='<%="" + FineGlobalDeleteJobParams.OPTION_GRADE_LEVEL%>'>
                        <%=form
                                .getFieldDisplayableForGlobalDelete(FineGlobalDeleteJobParams.OPTION_GRADE_LEVEL)%></html:option>
                </html:select> &nbsp;<html:text
                    property="<%=ExcuseFinesForm.FIELD_ASSOCIATED_VALUE%>" /></td>
        </tr>
        <tr valign="top" align="center">
            <td valign="top" colspan="2"><span class="ColRowBold"><%=GenericForm.getLastBackupDisplayMsg(true)%></span>
            </td>
        </tr>
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:genericButton src="/buttons/large/deletebig.gif"
                    name="<%=IUpdatePatronForm.BUTTON_DELETE_FINES%>"
                    alt='<%=MessageHelper.formatMessage("delete")%>' />
            </td>
        </tr>

    </base:outlinedTableAndTabsWithinThere>
</base:form>
