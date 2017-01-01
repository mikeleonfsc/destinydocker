<%@page import="com.follett.fsc.destiny.util.ThirdPartyVendorSpecs"%>
<%@page import="com.follett.fsc.destiny.client.common.servlet.VendorReportForm"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>

<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>

<%
    SiteConfigSiteInfoForm form = (SiteConfigSiteInfoForm)request.getAttribute(SiteConfigSiteInfoForm.FORM_NAME);
    SessionStoreProxy store = form.getSessionStore();
    boolean isInternational = UserContext.getMyContextLocaleHelper().isInternationalProduct();
%>
<script language="javascript" type="text/javascript">
<!--
function submitRPS() {
    document.forms["<%= SiteConfigSiteInfoForm.FORM_NAME %>"].<%= BaseDestinyServicesForm.PARAM_CHECKBOX_RPS %>.value = "true";
    document.forms["<%= SiteConfigSiteInfoForm.FORM_NAME %>"].submit();
}
//-->
</script>
    
    <html:hidden property="clearLogoOnSave"/>
    <html:hidden property="previewFileName"/>
        <html:hidden property="<%=SiteConfigSiteInfoForm.FIELD_PRODUCT_TYPE_DISPLAYABLE%>" />
        <html:hidden property="<%=SiteConfigSiteInfoForm.FIELD_SITE_TYPE_DISPLAYABLE%>" />
        <html:hidden property="<%=SiteConfigSiteInfoForm.FIELD_ZONE_DISPLAYABLE%>" />
        <html:hidden property="<%=SiteConfigSiteInfoForm.FIELD_OVERDRIVE_ENABLED%>" />
        <html:hidden property="<%=SiteConfigSiteInfoForm.FIELD_OVERDRIVE_DISTRICT_AUTHENTICATION_NAME%>" />
        <html:hidden property="<%=SiteConfigSiteInfoForm.FIELD_OVERDRIVE_DISTRICT_WEBSITE_ID%>" />
        <table id="<%=SiteConfigSiteInfoForm.TABLE_CONFIG_SITE%>" border="0" width="100%" cellpadding="5" cellspacing="0">
        <tr >
            <td class="FormLabel tdAlignRight">            
                <%=MessageHelper.formatMessage("siteinfo_SiteName") %>
             </td>
             <td>
                <html:text property="<%=SiteConfigSiteInfoForm.FIELD_SITE_NAME %>" size="30" maxlength="80"/>
             </td>
            <td class="SmallColHeading tdAlignRight">
                <base:showHideTag id="onSave">
                    <base:saveButton onclick="hideElementonSave()"/>
                </base:showHideTag>
            </td>
        </tr>
    <% if (!isInternational) { %>
        <tr>
            <td class="FormLabel tdAlignRight">            
                <%=MessageHelper.formatMessage("siteinfo_StateSchoolID") %>
             </td>
             <td class="ColRow" colspan="2">
                <html:text property="<%=SiteConfigSiteInfoForm.FIELD_SITE_STATE_IDENTIFIER %>" size="30" maxlength="50"/>
             </td>
        </tr>
    <% } %>
        <tr >
            <td class="FormLabel tdAlignRight">            
                <%=MessageHelper.formatMessage("siteinfo_ShortName") %>
             </td>
             <td class="ColRow" colspan="2">
                <html:hidden property="<%=SiteConfigSiteInfoForm.FIELD_SHORT_NAME%>" />
            <bean:write     name="<%= SiteConfigSiteInfoForm.FORM_NAME %>" property="<%=SiteConfigSiteInfoForm.FIELD_SHORT_NAME %>"/>
             </td>
        </tr>

       

        <tr> 
            <td class="FormLabel tdAlignRight" nowrap>
                <%=MessageHelper.formatMessage("siteinfo_ProductsInstalled") %>
            </td>
            <td class="ColRow" colspan="2">
                <html:hidden property="<%=SiteConfigSiteInfoForm.FIELD_PRODUCT_TYPE%>" />
                <bean:write name="<%= SiteConfigSiteInfoForm.FORM_NAME %>" property="<%=SiteConfigSiteInfoForm.FIELD_PRODUCT_TYPE_DISPLAYABLE %>"/>
            </td>
        </tr>
        <tr> 
            <td class="FormLabel tdAlignRight" nowrap>
                <%=MessageHelper.formatMessage("siteinfo_SiteType") %>
            </td>
            <td class="ColRow" colspan="2">
                <bean:write name="<%= SiteConfigSiteInfoForm.FORM_NAME %>" property="<%=SiteConfigSiteInfoForm.FIELD_SITE_TYPE_DISPLAYABLE%>"/>
            </td>
        </tr>
        <tr> 
            <td class="FormLabel tdAlignRight" nowrap>
                <%=MessageHelper.formatMessage("siteinfo_Zone") %>
            </td>
            <td class="ColRow" colspan="2">
                <bean:write name="<%= SiteConfigSiteInfoForm.FORM_NAME %>" property="<%=SiteConfigSiteInfoForm.FIELD_ZONE_DISPLAYABLE%>"/>
            </td>
        </tr>

            <%-- Address fields --%>
            <tr>
                <td class="FormLabel tdAlignRight">
                    <%=MessageHelper.formatMessage("siteinfo_Address") %>
                </td>
                <td colspan="2">
                    <html:text property="<%=form.FIELD_ADDRESS_LINE1%>" size="30" maxlength="90"/>
                </td>
            </tr>
            <tr>
                <td class="FormLabel tdAlignRight">
                    &nbsp;
                </td>
                <td colspan="2">
                    <html:text property="<%=form.FIELD_ADDRESS_LINE2%>" size="30" maxlength="90"/>
                </td>
            </tr>
            <tr>
                <td class="FormLabel tdAlignRight">
                    <%=MessageHelper.formatMessage("siteinfo_City") %>
                </td>
                <td colspan="2">
                    <html:text property="<%=form.FIELD_CITY%>" size="30" maxlength="90"/>
                </td>
            </tr>
            <tr>
                <td class="FormLabel tdAlignRight">
                    <%=MessageHelper.formatMessage("siteinfo_StateProvince") %>
                </td>
                <td colspan="2">
                    <html:text property="<%=form.FIELD_STATE%>" size="30" maxlength="90"/>
                </td>
            </tr>
            <tr>
                <td class="FormLabel tdAlignRight">
                    <%=MessageHelper.formatMessage("siteinfo_PostalCode") %>
                </td>
                <td colspan="2">
                    <html:text property="<%=form.FIELD_ZIP%>" size="20" maxlength="20"/>
                </td>
            </tr>

        <tr>
            <td colspan="3"> <base:imageLine/></td>
        </tr>
    

        <% if (isInternational){ %>                                        
        
            <tr>
                <td colspan="2">
                <table cellpadding="1" id="<%=SiteConfigCatalogForm.TABLE_LANGUAGE_BOX %>">
        <tr>
                        <td class="ColRowBold"><a
                            name="theLanguageFocus"></a>&nbsp;&nbsp;
                        <%=MessageHelper.formatMessage("siteinfo_ByDefaultDisplayPagesIn") %> <%=form.buildInternationalProductLanguageCombobox()%>
                        </td>
                    </tr>
                </table>
                </td>
            </tr>        
            <tr>
                <td colspan="3"> <base:imageLine/></td>
            </tr>
       
        <%} %>                                         

        
    
        <tr>
            <td class="FormLabel tdAlignRight">
                <%=MessageHelper.formatMessage("siteinfo_SiteCustomerNumber") %>
            </td>
            <td class="FormLabel" nowrap valign="middle" colspan="2">
                 <html:text property="<%= BaseDestinyServicesForm.FIELD_CUSTOMER_NUMBER %>" size="8" maxlength="7"/>
            </td>
        </tr>

<jsp:include page="/district/services_site.jsp" flush="true" >
    <jsp:param name="mediaSite" value="<%=form.isMedia()%>"/>
</jsp:include>

    <% if (form.isOverdriveEnabled() && store.isLibraryProductSupported()) { %>
         <tr>
             <td colspan="3"> <base:imageLine/></td>
        </tr>    
          <tr>
                <td class="FormLabel tdAlignRight">
                  <%=MessageHelper.formatMessage("siteinfo_OverDriveSettings") %> <base:helpTag helpFileName="d_OD_integration_settings_site.htm"/>
                </td>
          </tr>
              
          <tr>
               <td class="FormLabel tdAlignRight"> <%=MessageHelper.formatMessage("siteinfo_OverDriveWebsiteID") %><span style="font-weight:normal;">&nbsp;<%=form.getDistrictOverdriveWebsiteID() %></span> </td>
               <td colspan="2" class="ColRowBold" valign="middle">
               
                  Override district setting&nbsp;<html:text property="<%=EditDistrictForm.FIELD_OVERDRIVE_WEBSITE_ID%>" size="25" maxlength="200"/>
               </td>
        </tr>

         <tr>
              <td class="FormLabel tdAlignRight"> <%=MessageHelper.formatMessage("siteinfo_OverDriveAuthenticationName") %><span style="font-weight:normal;">&nbsp;<%=form.getDistrictOverdriveAuthenticationName() %></span> </td>
              <td colspan="2" class="ColRowBold" valign="middle">
                  Override district setting&nbsp;<html:text property="<%=EditDistrictForm.FIELD_OVERDRIVE_AUTHENTICATION_NAME%>" size="25" maxlength="200"/>
             </td>
          </tr>
          
          <tr>
              <td>&nbsp;</td>
              <td>
                       <base:link onclick="vendorTest('overDrive');return false;" page="#" target="_blank">
                        <base:image src="/buttons/large/TestConnection.gif" alt="<%= EditDistrictForm.LINK_TEST_OVERDRIVE %>"/>
                    </base:link>
                                            
                  &nbsp;&nbsp;&nbsp; 
                 <base:link page='<%="/common/servlet/presentvendorreport.do?"+VendorReportForm.PARAM_VENDOR_NAME+"="+ThirdPartyVendorSpecs.Vendor.OVERDRIVE.getText()%>' id="<%=EditDistrictForm.ID_OVERDRIVE_RUN_REPORT%>">
                     <base:image src="/buttons/large/runreport.gif" alt="<%= EditDistrictForm.LINK_OVERDRIVE_RUN_REPORT%>"/>
                  </base:link>
               </td>
          
          </tr>
      <%} %>       
                       
        <%if(form.isDistrictUploadStats() && (store.isLibrarySite() && !store.isMediaBookingUser())){%>
            <tr>
                <td class="FormLabel tdAlignRight">
                    <%=MessageHelper.formatMessage("siteinfo_CirculationData") %>
                </td>
                <td class="FormLabel" colspan="2">
                  <html:checkbox property="<%= SiteConfigSiteInfoForm.CHECKBOX_UPLOAD_STATS%>" />
                  &nbsp;<%=MessageHelper.formatMessage("siteinfo_ShareGeneralCirculationDataWithFSC") %>
                  <base:helpTag helpFileName="d_share_abstract_data_legal.htm"/>
                </td>
            </tr>
        <%} %>
        <tr>
            <td colspan="3"> <base:imageLine/></td>
        </tr>

        <tr>
            <td valign="top" class="FormLabel tdAlignRight">
                <%=MessageHelper.formatMessage("siteinfo_Logo") %>
            </td>
            <td colspan="2">
                <table id="<%= SiteConfigSiteInfoForm.TABLE_SITE_LOGO %>" border="0" cellpading="5" cellspacing="0">
                    <tr>
                        <td align="center" valign="top">
                           <img name="District Logo" 
                                alt='<%=MessageHelper.formatMessage("siteinfo_SiteLogo") %>' 
                                title='<%=MessageHelper.formatMessage("siteinfo_SiteLogo") %>' 
                                src="<bean:write name="<%= SiteConfigSiteInfoForm.FORM_NAME %>" property="imageURL"/>" 
                                width="<%= EditDistrictForm.LOGO_WIDTH %>" height="<%= EditDistrictForm.LOGO_HEIGHT %>" border="1">
                        </td>
                        <td valign="top" class="Instruction" colspan="2">
                            &nbsp;<%=MessageHelper.formatMessage("siteinfo_YourLogoMustBe120x54Pixels") %><br>
                            &nbsp;<%=MessageHelper.formatMessage("siteinfo_YouMayNeedToRefreshYourBrowserToSeeTheNewestImage") %>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td>
                &nbsp;
            </td>
            <td colspan="2">
                <table border="0" cellpadding="0" cellspacing="0">
                    <tr>
                        <td>
                            <html:file property="<%= EditDistrictForm.FIELD_UPLOAD_FILE %>"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <base:genericButton 
                                src="/buttons/large/preview2.gif" 
                                name="<%= EditDistrictForm.BUTTON_NAME_PREVIEW %>" 
                                alt='<%=MessageHelper.formatMessage("preview") %>'/>
                            &nbsp;
                            <base:genericButton src="/buttons/large/clear.gif" name="<%= EditDistrictForm.BUTTON_NAME_CLEAR %>" alt='<%=MessageHelper.formatMessage("clear") %>'/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
</table>
 <script language="JavaScript" type="text/javascript">
    
  <!--
  function vendorTest(vendorName) { 
      var overdriveWebsiteID = document.getElementsByName('<%=EditDistrictForm.FIELD_OVERDRIVE_WEBSITE_ID%>')[0].value;
      var overdriveAuthenticationName = document.getElementsByName('<%=EditDistrictForm.FIELD_OVERDRIVE_AUTHENTICATION_NAME%>')[0].value;
      
        window.open('/cataloging/servlet/presentopenthirdpartyvendorresourceform.do?testMode=true&vendorName='+vendorName+'&fromSite=true&overdriveWebsiteID='+ overdriveWebsiteID +'&overdriveAuthenticationName='+ overdriveAuthenticationName, '_blank');
    }
  // -->
    </script>
