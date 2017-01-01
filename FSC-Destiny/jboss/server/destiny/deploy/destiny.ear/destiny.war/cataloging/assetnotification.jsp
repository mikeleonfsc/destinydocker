<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.AssetNotificationForm"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    AssetNotificationForm form = (AssetNotificationForm)request.getAttribute(AssetNotificationForm.FORM_NAME);
%>

<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.AddTitleNavigationForm"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.EmailSpecs"%>
<base:messageBox strutsErrors="true"/>
<base:form action="/cataloging/servlet/handleassetnotificationform.do" focus="<%=AssetNotificationForm.FIELD_MAINTENANCE_MESSAGE%>">
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">
    <jsp:include page="/common/msdewarning.jsp" flush="true" />
	<base:outlinedTableAndTabsWithinThere id="<%=AssetNotificationForm.TABLE_MAIN%>"  borderColor="#C0C0C0" selectedTab="<%=AssetNotificationForm.ID_TAB%>" tabs="<%=AddTitleNavigationForm.getTabsAssetMode()%>"  width="100%">
        <tr>
			<td class="TableHeading">
			    Resource Item Preventive Maintenance Message...
			</td>
		</tr>
		<tr>
			<td class="ColRow">
                When items are in need of maintenance, this message will be emailed automatically to the custodian to alert them.
            </td>
		</tr>
		<tr>
			<td align="center" class="ColRow">
			    <html:textarea cols="38" rows="4" property="<%=AssetNotificationForm.FIELD_MAINTENANCE_MESSAGE%>"/>
		    </td>
		</tr>
		<tr>
            <td>
                <table align="center" id="Bob">
                    <tr>
            			<td class="ColRowBold tdAlignRight">Attention</td>
            			<td class="ColRow">
            			    <html:text property="<%=AssetNotificationForm.FIELD_MAINTENANCE_DISPLAY_NAME%>" size="30" maxlength="50"/>
            		    </td>
            		</tr>
            		<tr>
            			<td class="ColRowBold tdAlignRight">Email</td>
                        <td class="ColRow">
                          <html:text property="<%=AssetNotificationForm.FIELD_MAINTENANCE_FROMEMAIL%>" size="30" maxlength='<%="" + EmailSpecs.EMAIL_MAX_LENGTH %>'/>
                        <base:genericButton absbottom="true" src="/buttons/large/testemail.gif" name="<%= AssetNotificationForm.BUTTON_NAME_TEST_EMAIL %>" alt="Test Email"/>
                        </td>
            		</tr>
                </table>
            </td>
		</tr>
		<tr>
		    <td align="center" class="ColRowBold">
                <base:showHideTag id="onSave">
                    <base:saveButton onclick="hideElementonSave()"/>
                </base:showHideTag>
		    </td>
        </tr>
    </base:outlinedTableAndTabsWithinThere>
</base:form>
