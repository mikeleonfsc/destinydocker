<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.SiteConfigUnavailableHoldsNoticesForm"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%-- I18n Support --%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ page import="com.follett.fsc.common.MessageHelper"%>


<%
    SiteConfigUnavailableHoldsNoticesForm form = (SiteConfigUnavailableHoldsNoticesForm)request.getAttribute(SiteConfigUnavailableHoldsNoticesForm.FORM_NAME);
%>



<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.SiteConfigBaseForm"%><base:messageBox strutsErrors="true"/>
<base:form action="/backoffice/servlet/handlesiteconfigunavailableholdsnoticesform.do" focus="<%=SiteConfigUnavailableHoldsNoticesForm.FIELD_UNAVAILABLE_HOLDS_MESSAGE%>">
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">
    <html:hidden property="localSiteID" />
    <jsp:include page="/common/msdewarning.jsp" flush="true" />
	<base:outlinedTableAndTabsWithinThere id="<%=SiteConfigUnavailableHoldsNoticesForm.TABLE_UNAVAILABLE_HOLDS_MESSAGE%>"  borderColor="#C0C0C0" selectedTabID="<%=SiteConfigBaseForm.ID_TAB_NOTICES %>" selectedTab='<%=MessageHelper.formatMessage("siteconfigbase_TabNotices")%>' tabs="<%=form.getTabs()%>"  width="100%">
        <tr>
			<td colspan="2" class="TableHeading"><%=MessageHelper.formatMessage("siteconfigunavailableholdsnotices_UnavailableBookingMessage") %></td>
		</tr>
		<tr>
			<td colspan="2" class="ColRow"><%=MessageHelper.formatMessage("siteconfigunavailableholdsnotices_WhenItemsAreUnavailableToBePickedThisMessageWillBe") %></td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td align="center" class="ColRow">
			    <html:textarea cols="38" rows="4" property="<%=SiteConfigUnavailableHoldsNoticesForm.FIELD_UNAVAILABLE_HOLDS_MESSAGE%>"/>
		    </td>
		</tr>
		<tr>
		    <td colspan="2" align="center" class="ColRowBold">
                <base:showHideTag id="onSave">
                    <base:saveButton onclick="hideElementonSave()"/>
                </base:showHideTag>
		    </td>
		</tr>
    </base:outlinedTableAndTabsWithinThere>
</base:form>
