<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.SiteConfigurationBaseForm" %> 
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.SiteConfigBaseForm"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<%
    SiteConfigurationBaseForm form = (SiteConfigurationBaseForm)request.getAttribute(SiteConfigurationBaseForm.FORM_NAME);
%>


<bean:define id="libraryLoanPeriodTypeOptions" name="<%= SiteConfigurationBaseForm.FORM_NAME %>" property="<%= SiteConfigurationBaseForm.FIELD_LIBRARY_LOAN_PERIOD_TYPE_OPTIONS %>"/>
<html:hidden property="<%=SiteConfigurationBaseForm.FIELD_LIBRARY_LOAN_PERIOD_TYPE_ORIGINAL%>"/>

<tr>
    <td>
        <table id="<%=SiteConfigurationBaseForm.TABLE_DISTRICT_RESOURCE%>" width="100%" cellpadding="5" cellspacing="0"> 
         
          <tr>
                <td class="TableHeading" valign="top">&nbsp;<%=MessageHelper.formatMessage("siteconfigcircdistrictresource_LoanPolicies") %></td>
          </tr>
          
          <tr>
            <td>
                <base:imageLine height="1" width="100%"/>
            </td>
          </tr>  
          <tr>
            <td class="ColRowBold">
                <html:checkbox name="<%=SiteConfigurationBaseForm.FORM_NAME%>" 
                property="<%=SiteConfigurationBaseForm.FIELD_CIRC_ALLOW_LIB_CHECKOUT %>"/>
                <%=MessageHelper.formatMessage("siteconfigcircdistrictresource_AllowLibraryMaterialsToCirculateToAllPatrons") %>&nbsp;<base:helpTag helpFileName="d_allow_to_circ_LM.htm"/>
            </td>
          </tr>
           <tr>
            <td class="ColRow">
                &nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox name="<%=SiteConfigurationBaseForm.FORM_NAME%>" 
                property="<%=SiteConfigurationBaseForm.FIELD_CIRC_ALLOW_LIB_RENEWS %>"/>
                <%=MessageHelper.formatMessage("siteconfigcircdistrictresource_AllowLibraryMaterialsToBeRenewedAt") %>&nbsp;<base:helpTag helpFileName="d_allow_renewals_LM.htm"/>
            </td>
          </tr>  
          <tr>
            <td class="ColRowBold" colspan="2"><%=MessageHelper.formatMessage("siteconfigcircdistrictresource_CalculateLibraryLoanPeriodsBasedOn") + "&nbsp;" %>
                    <html:select property="<%= SiteConfigurationBaseForm.FIELD_LIBRARY_LOAN_PERIOD_TYPE %>">
                        <html:options collection="libraryLoanPeriodTypeOptions" property="longID" labelProperty="stringDesc"/>
                    </html:select>
                <%="&nbsp;" + MessageHelper.formatMessage("siteconfigcircdistrictresource_Days") %>
                <base:helpTag helpFileName="d_calculate_loan_periods_LM.htm"/>
            </td>
          </tr>
          <% if (!UserContext.getMyContextLocaleHelper().isInternationalProduct()) { %>
          <tr>
            <td>
                <base:imageLine height="1" width="100%"/>
            </td>
          </tr>
          <tr>
                <td class="ColRowBold" colspan="2"><%=MessageHelper.formatMessage("siteconfigcircdistrictresource_AllowTextbooksToBeCheckedOut") %>&nbsp;<base:helpTag helpFileName="d_allow_textbooks_to_be_chkd_out_TM.htm"/>
                </td>
            </tr>
            <tr>
                <td class="ColRow" colspan="2">
                &nbsp;&nbsp;&nbsp;&nbsp;
                <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_ALLOW_TEXTBOOK_CIRC_TO_PATRON%>"><%=MessageHelper.formatMessage("siteconfigcircdistrictresource_ToPatron") %></html:checkbox>
                </td>
            </tr>
            <tr>
                <td class="ColRow" colspan="2">
                &nbsp;&nbsp;&nbsp;&nbsp;
                <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_ALLOW_TEXTBOOK_CIRC_TO_CLASS%>"><%=MessageHelper.formatMessage("siteconfigcircdistrictresource_ByClass") %></html:checkbox>
                </td>
            </tr>
            <tr>
                <td class="ColRow" colspan="2">
                &nbsp;&nbsp;&nbsp;&nbsp;
                <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_ALLOW_TEXTBOOK_CIRC_TO_TEACHER%>"><%=MessageHelper.formatMessage("siteconfigcircdistrictresource_ToTeacher") %></html:checkbox>
                </td>
            </tr>
          
            <tr>
                <td class="ColRowBold" colspan="2">
                    <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_ALLOW_TEXTBOOK_CONSUMABLE_CHECKOUT%>"><%=MessageHelper.formatMessage("siteconfigcirc_AllowConsumableTextbooksToBeCheckedOut")%></html:checkbox>
                </td>
            </tr>

            <tr>
                <td class="ColRowBold" colspan="2">
                    <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_ALLOW_TEXTBOOK_CHECKOUT_BY_ISBN%>"><%=MessageHelper.formatMessage("siteconfigcirc_AllowTextbookCheckoutByISBN")%></html:checkbox>
                </td>
            </tr>
          
          <tr>
            <td class="ColRowBold">
                <html:checkbox name="<%=SiteConfigurationBaseForm.FORM_NAME%>" 
                property="<%=SiteConfigurationBaseForm.FIELD_CIRC_ALLOW_TEXTBOOK_CHECKOUT %>"/>
                <%=MessageHelper.formatMessage("siteconfigcircdistrictresource_AllowTextbooksToCirculateToAll") %>&nbsp;<base:helpTag helpFileName="d_allow_to_circ_TM.htm"/>
            </td>
          </tr>
          <tr>
            <td class="ColRowBold">
                <html:checkbox name="<%=SiteConfigurationBaseForm.FORM_NAME%>" 
                property="<%=SiteConfigurationBaseForm.FIELD_CIRC_ALERT_DUPLICATE_TEXTBOOK_CHECKOUT %>"/>
                <%=MessageHelper.formatMessage("siteconfigcircdistrictresource_AlertDuringCheckOutIfPatronAlreadyCurrentCheck") %>&nbsp;<base:helpTag helpFileName="d_alert_checkout_TM.htm"/>
            </td>
          </tr>
          <tr>
            <td class="ColRowBold">
                <html:checkbox name="<%=SiteConfigurationBaseForm.FORM_NAME%>" 
                property="<%=SiteConfigurationBaseForm.FIELD_CIRC_PREFERRED_FOLLETT_CLASSIC_TEXTBOOK_PREFIX %>"/>
                <%=MessageHelper.formatMessage("siteconfigcircdistrictresource_SetPreferredFollettClassicTextbookPrefix") %>&quot;&nbsp;<base:helpTag helpFileName="d_set_preferred_follett_classic_TM.htm"/>
            </td>
          </tr>
            
          
          <tr>
            <td>
                <base:imageLine height="1" width="100%"/>
            </td>
          </tr>  
          <tr>
            <td class="ColRowBold">
                <html:checkbox name="<%=SiteConfigurationBaseForm.FORM_NAME%>" 
                property="<%=SiteConfigurationBaseForm.FIELD_CIRC_ALLOW_ASSET_CHECKOUT %>"/>
                <%=MessageHelper.formatMessage("siteconfigcircdistrictresource_AllowAssetsToCirculateToAnyPatronDepartmentLocatio") %>
                <base:helpTag helpFileName="d_allow_to_circ_AM.htm"/>
            </td>
          </tr>  
          <tr>
            <td class="ColRowBold">
                <html:checkbox name="<%=SiteConfigurationBaseForm.FORM_NAME%>" 
                property="<%=SiteConfigurationBaseForm.FIELD_CIRC_ALERT_DUPLICATE_ASSET_CHECKOUT %>"/>
                <%=MessageHelper.formatMessage("siteconfigcircdistrictresource_AlertDuringCheckOutIfPatronHasResourceCheckedOut") %>&nbsp;
                <base:helpTag helpFileName="d_alert_checkout_rm.htm"/>
            </td>
          </tr>
          <tr>
            <td class="ColRowBold">
                <html:checkbox name="<%=SiteConfigurationBaseForm.FORM_NAME%>" 
                property="<%=SiteConfigurationBaseForm.FIELD_CIRC_ALLOW_ASSIGN_LICENSE %>"/><%=MessageHelper.formatMessage("siteconfigcircdistrictresource_AllowOtherSitesToAssignThisSitesSoftwareLicensesTo") %></td>
          </tr>  
          <tr>
            <td class="ColRowBold">
                <html:checkbox name="<%=SiteConfigurationBaseForm.FORM_NAME%>" 
                property="<%=SiteConfigurationBaseForm.FIELD_ALLOW_UNBARCODED_RESOURCES_TO_CHECKOUT %>"/><%=MessageHelper.formatMessage("siteconfigcircdistrictresource_AllowUnbarcodedResourcesCheckout") %></td>
          </tr>
          <tr>
            <td class="ColRowBold">
                <html:checkbox name="<%=SiteConfigurationBaseForm.FORM_NAME%>" 
                property="<%=SiteConfigurationBaseForm.FIELD_ALLOW_CONSUMABLE_RESOURCES_TO_CHECKOUT %>"/><%=MessageHelper.formatMessage("siteconfigcircdistrictresource_AllowConsumableResourcesCheckout") %></td>
          </tr>
         </table>
          <%} else {%>
              <html:hidden property="<%=SiteConfigurationBaseForm.FIELD_ALLOW_TEXTBOOK_CIRC_TO_PATRON%>"/>
              <html:hidden property="<%=SiteConfigurationBaseForm.FIELD_ALLOW_TEXTBOOK_CIRC_TO_CLASS%>"/>
              <html:hidden property="<%=SiteConfigurationBaseForm.FIELD_ALLOW_TEXTBOOK_CIRC_TO_TEACHER%>"/>
              <html:hidden property="<%=SiteConfigurationBaseForm.FIELD_CIRC_ALLOW_TEXTBOOK_CHECKOUT %>"/>
              <html:hidden property="<%=SiteConfigurationBaseForm.FIELD_CIRC_ALERT_DUPLICATE_TEXTBOOK_CHECKOUT %>"/>
              <html:hidden property="<%=SiteConfigurationBaseForm.FIELD_CIRC_PREFERRED_FOLLETT_CLASSIC_TEXTBOOK_PREFIX %>"/>
              <html:hidden property="<%=SiteConfigurationBaseForm.FIELD_CIRC_ALLOW_ASSET_CHECKOUT %>"/>
              <html:hidden property="<%=SiteConfigurationBaseForm.FIELD_CIRC_ALLOW_ASSIGN_LICENSE %>"/>
          <%} %>         

    </td>
</tr>
