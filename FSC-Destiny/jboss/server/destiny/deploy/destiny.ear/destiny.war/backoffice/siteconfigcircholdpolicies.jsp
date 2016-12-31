<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.SiteConfigurationBaseForm" %> 

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>


<%
    SiteConfigurationBaseForm form = (SiteConfigurationBaseForm)request.getAttribute(SiteConfigurationBaseForm.FORM_NAME);
%>

<bean:define id="deliveryMethods" name="<%= SiteConfigurationBaseForm.FORM_NAME %>" property="deliveryOptions"/>

<tr>
    <td>
        <table id="<%=SiteConfigurationBaseForm.TABLE_HOLD_POLICIES%>" width="100%" cellpadding="5" cellspacing="0"> 
        <tr>
            <td class="TableHeading" valign="top">&nbsp;<%=MessageHelper.formatMessage("siteconfigcircholdpolicies_HoldReservePolicies") %></td>
        </tr>

        <tr>
            <td><base:imageLine height="1" width="100%" /></td>
        </tr>
        <tr>
            <td class="ColRowBold"><%=MessageHelper.formatMessage("siteconfigcircholdpolicies_ReadyReservations") %>
                &nbsp;<html:text property="<%=SiteConfigurationBaseForm.FIELD_CIRC_HOLDS_RESERVE_LEAD_TIME%>" size="2" maxlength="2"/>&nbsp;<%=MessageHelper.formatMessage("siteconfigcircholdpolicies_OpenDaysInAdvanceOfTheRequestedStartDate") %>
                <base:helpTag helpFileName="d_ready_reservations.htm"/>
            </td>
        </tr>
        <tr>
            <td><base:imageLine height="1" width="100%" /></td>
        </tr>
        <tr>
            <td class="ColRowBold">
                <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_CIRC_HOLDS_EXPIRED_FLAG%>"><%=MessageHelper.formatMessage("siteconfigcircholdpolicies_AutomaticallyDeleteExpiredHoldsAfter") %></html:checkbox>&nbsp;
                <html:text property="<%=SiteConfigurationBaseForm.FIELD_CIRC_HOLDS_EXPIRED_DAYS%>" size="2" maxlength="2"/>&nbsp;<%=MessageHelper.formatMessage("siteconfigcircholdpolicies_CalendarDays") %>
                <base:helpTag helpFileName="d_automatically_delete_expired_holds_LM.htm"/>
            </td>
        </tr>
        <tr>
            <td><base:imageLine height="1" width="100%" /></td>
        </tr>
        <tr>
            <td class="ColRowBold"><%=MessageHelper.formatMessage("siteconfigcircholdpolicies_SetTheDefaultInterlibraryLoanDeliveryMethodTo") %>&nbsp;<html:select property="<%=SiteConfigurationBaseForm.FIELD_DELIVERY_METHOD_TYPE_ILL%>" value ="<%=form.getDefaultILLdeliveryMethod()%>">
                    <html:options collection="deliveryMethods" property="value" labelProperty="desc"/>
                </html:select>
                <base:helpTag helpFileName="d_default_interlibrary_loan_delivery_method.htm"/>
            </td>
        </tr>
        </table>
    </td>
</tr>    
