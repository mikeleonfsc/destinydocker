<%@page import="com.follett.fsc.destiny.entity.ejb3.ConfigSiteSpecs"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>

<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.common.MessageHelper"%>
<%
    String formName = null;
    BaseEditSiteForm form = null;
   
    formName = DistrictEditSiteForm.FORM_NAME;
    form = (BaseEditSiteForm)request.getAttribute(formName);
    if  (form == null) {
        formName = SiteConfigSiteInfoForm.FORM_NAME;
        form = (BaseEditSiteForm)request.getAttribute(formName);
    }
    
    boolean mediaSite = form.isMedia();
    boolean isLibraryMedia = (form.isSiteLibrary() || mediaSite );
    boolean isInternationalProduct = LocaleHelper.isInternationalProduct();
%>

    <!-- Javascript fields and code moved to he bottom of the page for page-rendering issues.  CODE NEEDS to be in a <td> tag on this JSP to execute -->
    
    <% if ( isLibraryMedia || form.isSiteTextbook()) { %>
        <% if (isLibraryMedia ) { %>  
            <% if(!isInternationalProduct && SiteConfigSiteInfoForm.FORM_NAME.equals(formName) && !mediaSite) { %>
            <tr>
                <td>&nbsp;</td>
                <td class="FormLabel" nowrap valign="middle" colspan="2">
                  <base:showHideTag id="onUpdate" showTextOnNewLine="false">
                  <html:checkbox property="<%= BaseDestinyServicesForm.CHECKBOX_USE_BIBLIONASIUM %>" 
                    styleId="<%= BaseDestinyServicesForm.ID_USE_BIBLIONASIUM %>" 
                    onclick="redirectUserToAgreementFor('biblionasium',this.checked);"  
                    disabled = "<%= !form.isAaspProduction() %>"
                  />
                  &nbsp;Use Biblionasium 
                  &nbsp;<base:helpTag helpFileName="r_biblionasium_intgrate.htm"/>
                  </base:showHideTag>
                </td>
            </tr>
                <% if(form.isUseBiblionasium() && form.isBiblionasiumAgreementSigned()) { %>
                    <tr>
                        <td>&nbsp;</td>
                        <td class="ColRow" nowrap valign="middle" colspan="2">
                            <p>To complete this integration, you must configure the "Use Biblionasium" <br>access right through Back Office > Access Levels.</p>
                            <p>In order to select your Biblionasium Supervisor you will first need to set <br>their Access level to "Use Biblionasium".</p>
                            Supervisor:   
                            <% if (form.getBiblionasiumSupervisor() != null) {%> 
                                <%=form.getBiblionasiumSupervisor() %> 
                            <% } else { %>
                                Undefined &nbsp;&nbsp;&nbsp; 
                            <%} %>
                            <%if(!ConfigSiteSpecs.SITE_ID_MY_DISTRICT.equals(form.getStore().getSiteID())){%>
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <base:genericButton src="/buttons/large/selectbig.gif" name="<%= BaseDestinyServicesForm.BUTTON_SUPERVISOR_SELECT %>" alt="Select"/>
                            <% } else {%>
                                <% if(form.getBiblionasiumSupervisor() == null){ %>
                                    &nbsp;&nbsp;Please select supervisor at the site level. (BackOffice > Site Configuration > Site Info)
                                <% } else { %>
                                    &nbsp;&nbsp;Please change supervisor at the site level. (BackOffice > Site Configuration > Site Info)
                                <% } %>
                            <% } %>
                                
                        </td>         
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td class="ColRow" nowrap valign="middle" colspan="2">
                            <p>Once a Biblionasium Supervisor is defined, synchronize Destiny and Biblionasium.<br></p>
                            <p><b>Note: </b>For the best Biblionasium experience, assign your student patrons to a <br>Homeroom and specify the grade level for each.</p>
                            <% if (form.getBiblionasiumSupervisor() != null) {%>
                                <base:genericButton src="/buttons/large/synchronize.gif" name="<%= BaseDestinyServicesForm.BUTTON_SYNCHRONIZE_BIBLONASIUM %>" alt="Synchronize" />
                                <html:checkbox property="<%= BaseDestinyServicesForm.CHECKBOX_SYNCHRONIZE_BIBLIONASIUM %>"/> Automatically synchronize every 7 days
                            <% } %>
                        </td>        
                    </tr>
                    <% if ( !mediaSite) { %>
                    <logic:equal name="<%= formName %>" property="showBiblionasiumSyncJobInfo" value="true">
                        <tr>
                            <td>&nbsp;</td>
                            <td valign="middle" nowrap  colspan="2">
                                <table id="<%= BaseDestinyServicesForm.TABLE_BIBLIONASIUM_SYNC_RUN_INFO %>" cellpadding="2" cellspacing="0" border="0" class="Instruction">
                                    <% if ( !form.isShowBiblionasiumSyncScheduled() ) { %>
                                        <logic:notEqual name="<%= formName %>" property="lastBiblionasiumSyncRunTimeLink" value="">
                                            <tr>
                                                <td>
                                                    <base:imageSpacer width="25" height="1"/>
                                                </td>
                                                <td class="tdAlignRight">
                                                    Synchronization Completed:
                                                </td>
                                                <td>
                                                    <%= form.getLastBiblionasiumSyncRunTimeLink() %>
                                                </td>
                                            </tr>
                                        </logic:notEqual>
                                        <logic:notEqual name="<%= formName %>" property="nextBiblionasiumSyncRunTime" value="">
                                            <tr>
                                                <td>
                                                    <base:imageSpacer width="25" height="1"/>
                                                </td>
                                                <td class="tdAlignRight">
                                                    Next Scheduled Synchronization:
                                                </td>
                                                <td>
                                                    <bean:write name="<%= formName %>" property="nextBiblionasiumSyncRunTime"/>
                                                </td>
                                            </tr>
                                        </logic:notEqual>
                                    <% } else { %>
                                        <logic:notEqual name="<%= formName %>" property="nextBiblionasiumSyncRunTime" value="">
                                            <tr>
                                                <td>
                                                    <base:imageSpacer width="25" height="1"/>
                                                </td>
                                                <td class="tdAlignRight">
                                                    Synchronization Scheduled:
                                                </td>
                                                <td>
                                                    <bean:write name="<%= formName %>" property="nextBiblionasiumSyncRunTime"/>
                                                </td>
                                            </tr>
                                        </logic:notEqual>
                                    <% }%>    
                                    <tr>
                                        <td colspan="2">
                                            <base:imageSpacer width="25" height="1"/>
                                        </td>
                                    </tr>
                                    
                                </table>
                            </td>
                        </tr>
                    </logic:equal>
                    <% } %>
                <% } %>
            <% } %>
            
            
            <tr>
                <td>&nbsp;</td>
                <td class="FormLabel" nowrap valign="middle" colspan="2">
                  <html:checkbox property="<%= BaseDestinyServicesForm.CHECKBOX_DIGITAL_RESOURCES %>" />
                  &nbsp;<%=MessageHelper.formatMessage("servicessite_UseDigitalResources") %>&nbsp;<base:helpTag helpFileName="d_digital_resource_providers.htm"/>
                </td>
            </tr>
            
            <% if (!isInternationalProduct) { %>
            <tr>
                <td>&nbsp;</td>
                <td class="FormLabel" nowrap valign="middle" colspan="2">
                  <html:checkbox property="<%= BaseDestinyServicesForm.CHECKBOX_ONE_SEARCH %>" />
                  &nbsp;Use One Search
                </td>
            </tr>
            <% } %>
            
            <% if (!mediaSite && !isInternationalProduct) { %>
                <tr>
                    <td>&nbsp;</td>
                    <td class="FormLabel" nowrap valign="middle" colspan="2">
                      <base:showHideTag id="onFPUpdate" showTextOnNewLine="false">
                      <html:checkbox property="<%= BaseDestinyServicesForm.CHECKBOX_FOUNTAS_PINNELL %>" />
                      &nbsp;Use Fountas and Pinnell&nbsp;<base:helpTag helpFileName="d_fountas_pinnell_subscriber.htm"/>
                      &nbsp;&nbsp;
                          <% if (!(form instanceof DistrictEditSiteForm) || !((DistrictEditSiteForm)form).isAddSite()) { %>
                              <% if ( form.isAllowFountasAndPinnell() ) { %>
                                  <base:genericButton src="/buttons/large/update.gif" onclick="hideElementonFPUpdate()" name="<%= BaseDestinyServicesForm.BUTTON_NAME_UPDATE_FP %>" alt="Update Now" />
                              <% } %>
                          <% } %>                 
                      </base:showHideTag>   
                    </td>
                </tr>
            <% } %>
        <% } %>
        
        <% if ( !mediaSite && !isInternationalProduct) { %>
            <logic:equal name="<%= formName %>" property="showFountasAndPinnellJobInfo" value="true">
                <tr>
                    <td>&nbsp;</td>
                    <td valign="middle" nowrap  colspan="2">
                        <table id="<%= BaseDestinyServicesForm.TABLE_FOUNTAS_PINNELL_RUN_INFO %>" cellpadding="2" cellspacing="0" border="0" class="Instruction">
                            <logic:notEqual name="<%= formName %>" property="lastFountasAndPinnellRunTimeLink" value="">
                            <tr>
                                <td>
                                    <base:imageSpacer width="25" height="1"/>
                                </td>
                                <td class="tdAlignRight">
                                    Last Update Submitted:
                                </td>
                                <td>
                                    <%= form.getLastFountasAndPinnellRunTimeLink() %>
                                </td>
                            </tr>
                            </logic:notEqual>
                            <tr>
                                <td>
                                    <base:imageSpacer width="25" height="1"/>
                                </td>
                                <td class="tdAlignRight">
                                    Next Scheduled Update:
                                </td>
                                <td>
                                    <bean:write name="<%= formName %>" property="nextFountasAndPinnellRunTime"/>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2">
                                    <base:imageSpacer width="25" height="1"/>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </logic:equal>
         <% } %>
         
         <% if (isLibraryMedia && !isInternationalProduct) { %>  
            <% if (!mediaSite) { %>
                <tr>
                    <td>&nbsp;</td>
                    <td class="FormLabel" nowrap valign="middle" colspan="2">
                      <base:showHideTag id="onLexileUpdate" showTextOnNewLine="false">
                      <html:checkbox property="<%= BaseDestinyServicesForm.CHECKBOX_LEXILE_SITE %>" />
                      
                      &nbsp;Use Reading Program Service (RPS) - Lexile&nbsp;<base:helpTag helpFileName="d_lexile_subscriber.htm"/>
                      &nbsp;&nbsp;
                     
                      <% if (!(form instanceof DistrictEditSiteForm) || !((DistrictEditSiteForm)form).isAddSite()) { %>
                        <% if ( form.isAllowLexile() ) { %>
                            <%if( form.isUpdateInProgressLexile() ) { %>
                                 &nbsp;(Update&nbsp;in&nbsp;progress)
                            <%} else { %>
                              <base:genericButton src="/buttons/large/update.gif" onclick="hideElementonLexileUpdate()" name="<%= BaseDestinyServicesForm.BUTTON_NAME_UPDATE_LX %>" alt="Update Now" />
                            <%} %>              
                        <% } %> 
                      <% } %>                 
                      </base:showHideTag>
                    </td>
                </tr>
             <% } %>
         <% } %>
         
         <% if ( !mediaSite && !isInternationalProduct) { %>
            <logic:equal name="<%= formName %>" property="showLexileJobInfo" value="true">
                <tr>
                    <td>&nbsp;</td>
                    <td valign="middle" nowrap  colspan="2">
                        <table id="<%= BaseDestinyServicesForm.TABLE_LEXILE_RUN_INFO %>" cellpadding="2" cellspacing="0" border="0" class="Instruction">
                            <logic:notEqual name="<%= formName %>" property="lastLexileRunTimeLink" value="">
                            <tr>
                                <td>
                                    <base:imageSpacer width="25" height="1"/>
                                </td>
                                <td class="tdAlignRight">
                                    Last Update Submitted:
                                </td>
                                <td>
                                    <%= form.getLastLexileRunTimeLink() %>
                                </td>
                            </tr>
                            </logic:notEqual>
                            <tr>
                                <td>
                                    <base:imageSpacer width="25" height="1"/>
                                </td>
                                <td class="tdAlignRight">
                                    Next Scheduled Update:
                                </td>
                                <td>
                                    <bean:write name="<%= formName %>" property="nextLexileRunTime"/>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2">
                                    <base:imageSpacer width="25" height="1"/>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </logic:equal>
        <% } %>

        <% if ( !mediaSite && form.isSiteLibrary() && !isInternationalProduct) { %>
            <tr>
                <td>&nbsp;</td>
                <td class="FormLabel" nowrap valign="middle" colspan="2">
                  <html:checkbox property="<%= BaseDestinyServicesForm.CHECKBOX_RPS_ARRC %>" onclick="submitRPS()" />
                  &nbsp;Use Reading Program Service (RPS) - AR/RC
                </td>
            </tr>
            
           <% if ( form.isAllowRPSSearchARRC() ) { %>
             <tr>
                <td>&nbsp;</td>
                <td class="FormLabel" nowrap valign="middle" colspan="2">
                   
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                     <html:checkbox property="<%= BaseDestinyServicesForm.CHECKBOX_AR_ENTERPRISE %>" />
                        Accelerated Reader Enterprise subscriber
                     &nbsp;<base:helpTag helpFileName="d_ARE_subscriber.htm"/>                   
                </td>
            </tr>
            
            <tr>
                <td>
                    &nbsp;
                </td>
                <td class="ColRow" colspan="2">
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Days between Accelerated Reader updates <html:text property="<%=BaseDestinyServicesForm.FIELD_AR_INTERVAL %>" size = "2" maxlength = "2"/>
                </td>
            </tr>
            
           
                <% if (form.isOriginalARE()) { %>
                    <tr>
                        <td>&nbsp;</td>
                        <td class="ColRow" nowrap valign="middle" colspan="2">
                          <base:showHideTag id="onAREMasterQuizUpdate" showTextOnNewLine="false">
                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;AR Master Quiz File
                          <%if( form.isUpdateInProgressARE() ) { %>
                          &nbsp;(Update&nbsp;in&nbsp;progress)
                          <%} else { %>
                          <base:genericButton src="/buttons/large/update.gif" onclick="hideElementonAREMasterQuizUpdate()" name="<%= BaseDestinyServicesForm.BUTTON_ARE_MASTER_QUIZ_UPDATE %>" alt="Update Now" />
                            <%} %>
                          </base:showHideTag>
                          
                        </td>
                    </tr>
            
            
            <logic:equal name="<%=formName%>" property="<%=BaseEditSiteForm.FIELD_UPDATE_IN_PROGRESS_ARE %>" value="false">
            
            <tr>
                <td>&nbsp;</td>
                <td valign="middle" nowrap  colspan="2">
                    <table id="<%= BaseDestinyServicesForm.TABLE_MASTER_AR_QUIZ_RUN_INFO %>" cellpadding="2" cellspacing="0" border="0" class="Instruction">
                        <logic:notEqual name="<%=formName %>" property="lastAREMasterQuizRunTimeLink" value="">
                        <tr>
                            <td>
                                <base:imageSpacer width="50" height="1"/>
                            </td>
                            
                            <td class="tdAlignRight">
                                Last Updated:
                            </td>
                            <td>
                                <%= form.getLastAREMasterQuizRunTimeLink() %>
                            </td>
                        </tr>
                        </logic:notEqual>
                        <tr>
                            <td>
                                <base:imageSpacer width="50" height="1"/>
                            </td>
                            <td class="tdAlignRight">
                                Next Scheduled Update:
                            </td>
                            <td>
                                <bean:write name="<%= formName %>" property="nextAREMasterQuizRunTime"/>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
            
            </logic:equal>
                  <% } %>
           
            <%}%> <!--  end of Accelerated Reading Enterprise -->
            
            
           <% if ( form.isAllowRPSSearchARRC() ) { %> <!--  start of Reading counts Enterprise -->
            <tr>
                <td>&nbsp;</td>
                <td class="FormLabel" nowrap valign="middle" colspan="2">
                   
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                     <html:checkbox property="<%= BaseDestinyServicesForm.CHECKBOX_RC_ENTERPRISE %>" />
                        Reading Counts! Enterprise subscriber
                     &nbsp;<base:helpTag helpFileName="d_RCE_subscriber.htm"/>                   
                </td>
            </tr>
            
            <tr>
                <td>
                    &nbsp;
                </td>
                <td class="ColRow" colspan="2">
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Days between Reading Counts! updates <html:text property="<%=BaseDestinyServicesForm.FIELD_RC_INTERVAL %>" size = "2" maxlength = "2"/>
                </td>
            </tr>
            
           
                <% if (form.isOriginalRCE()) { %>
                    <tr>
                        <td>&nbsp;</td>
                        <td class="ColRow" nowrap valign="middle" colspan="2">
                          <base:showHideTag id="onRCEMasterQuizUpdate" showTextOnNewLine="false">
                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;RC Master Quiz File
                          <%if( form.isUpdateInProgressRCE() ) { %>
                          &nbsp;(Update&nbsp;in&nbsp;progress)
                          <%} else { %>
                          <base:genericButton src="/buttons/large/update.gif" onclick="hideElementonRCEMasterQuizUpdate()" name="<%= BaseDestinyServicesForm.BUTTON_RCE_MASTER_QUIZ_UPDATE %>" alt="Update Now" />
                          <%}%>
                          </base:showHideTag>
                          
                        </td>
                    </tr>
            
            
            <logic:equal name="<%=formName%>" property="<%=BaseEditSiteForm.FIELD_UPDATE_IN_PROGRESS_RCE %>" value="false">
            
            <tr>
                <td>&nbsp;</td>
                <td valign="middle" nowrap  colspan="2">
                    <table id="<%= BaseDestinyServicesForm.TABLE_MASTER_RC_QUIZ_RUN_INFO %>" cellpadding="2" cellspacing="0" border="0" class="Instruction">
                        <logic:notEqual name="<%=formName %>" property="lastRCEMasterQuizRunTimeLink" value="">
                        <tr>
                            <td>
                                <base:imageSpacer width="50" height="1"/>
                            </td>
                            
                            <td class="tdAlignRight">
                                Last Updated:
                            </td>
                            <td>
                                <%= form.getLastRCEMasterQuizRunTimeLink() %>
                            </td>
                        </tr>
                        </logic:notEqual>
                        <tr>
                            <td>
                                <base:imageSpacer width="50" height="1"/>
                            </td>
                            <td class="tdAlignRight">
                                Next Scheduled Update:
                            </td>
                            <td>
                                <bean:write name="<%= formName %>" property="nextRCEMasterQuizRunTime"/>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
            
            </logic:equal>
                  <% } %>
           
            <%}%> <!--  end of Reading Counts Enterprise -->
              
            
            
        <% } %> <!-- end Use ReadingProgram Service -->
        <% if(isLibraryMedia && !isInternationalProduct) { %>
            <tr>
                <td>&nbsp;</td>
                <td class="FormLabel" nowrap valign="middle" colspan="2">
                  <html:checkbox property="<%= BaseDestinyServicesForm.CHECKBOX_ACCESS_STATE_STANDARD %>" />
                  &nbsp;Use Standards
                </td>
            </tr>
        <% } %>
        <% if (isLibraryMedia) { %>
            <tr>
                <td>&nbsp;</td>
                <td class="FormLabel" nowrap valign="middle" colspan="2">
                  <html:checkbox property="<%= BaseDestinyServicesForm.CHECKBOX_TITLEPEEK %>" />
              &nbsp;<%=MessageHelper.formatMessage("servicessite_UseTitlePeek") %>
                </td>
            </tr>
        <% } %>
        <% if(isLibraryMedia && !isInternationalProduct) { %>
        <tr>
            <td>&nbsp;</td>
            <td class="FormLabel" nowrap valign="middle" colspan="2">
              <base:showHideTag id="onUpdate" showTextOnNewLine="false">
              <html:checkbox property="<%= BaseDestinyServicesForm.CHECKBOX_WEBPATH_EXRESS %>" />
              &nbsp;Use WebPath Express
              &nbsp;&nbsp;
              <% if (!(form instanceof DistrictEditSiteForm) || !((DistrictEditSiteForm)form).isAddSite()) { %>
                  <% if ( form.isAllowWebPathExpress() ) { %>
                      <base:genericButton src="/buttons/large/update.gif" onclick="hideElementonUpdate()" name="<%= BaseDestinyServicesForm.BUTTON_NAME_UPDATE %>" alt="Update Now" />
                  <% } %>
              <% } %>                 
              
              </base:showHideTag>
            </td>
        </tr>
        <% } %>
        
        <% if (!isInternationalProduct) { %>
            <logic:equal name="<%= formName %>" property="showWebPathJobInfo" value="true">
                <tr>
                    <td>&nbsp;</td>
                    <td valign="middle" nowrap  colspan="2">
                        <table id="<%= BaseDestinyServicesForm.TABLE_WEBPATH_RUN_INFO %>" cellpadding="2" cellspacing="0" border="0" class="Instruction">
                            <logic:notEqual name="<%= formName %>" property="lastWebPathRunTimeLink" value="">
                            <tr>
                                <td>
                                    <base:imageSpacer width="25" height="1"/>
                                </td>
                                <td class="tdAlignRight">
                                    Last Update Submitted:
                                </td>
                                <td>
                                    <%= form.getLastWebPathRunTimeLink() %>
                                </td>
                            </tr>
                            </logic:notEqual>
                            <tr>
                                <td>
                                    <base:imageSpacer width="25" height="1"/>
                                </td>
                                <td class="tdAlignRight">
                                    Next Scheduled Update:
                                </td>
                                <td>
                                    <bean:write name="<%= formName %>" property="nextWebPathRunTime"/>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2">
                                    <base:imageSpacer width="25" height="1"/>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </logic:equal>
       <% } %>
    <% } %>
    
<tr style=""><td>

        <script language="javascript" type="text/javascript">
        function redirectUserToAgreementFor(vendor,checked) {
            var signAgreementAgainIfAlreadySigned = true;
            var editForm = null;
            editForm = document.forms["<%= formName %>"];
            if (checked) {
                if (vendor=='biblionasium') {
                    editForm.<%=BaseDestinyServicesForm.FIELD_USE_BIBLIONASIUM_SELECTED %>.value = true;
                    editForm.<%=BaseDestinyServicesForm.FIELD_FORWARD_TO_AGREEMENT_FOR_VENDOR_SITE%>.value=vendor;
                    editForm.submit();
                }
            } else {
                editForm.<%= BaseDestinyServicesForm.FIELD_USE_BIBLIONASIUM_SELECTED %>.value = false;
            } 
        }
        
        
        </script>
        
            
        <% if ( !form.isAllowRPSSearchARRC() ) { %>
            <html:hidden property="<%=BaseEditSiteForm.FIELD_AR_INTERVAL %>" />
            <html:hidden property="<%=BaseEditSiteForm.FIELD_RC_INTERVAL %>" />
        <% } %>
        
        
            <html:hidden property="<%=BaseEditSiteForm.FIELD_ORIGINAL_RPS %>" />
            <html:hidden property="<%=BaseEditSiteForm.FIELD_ORIGINAL_ARE %>" />
            <html:hidden property="<%=BaseEditSiteForm.FIELD_ORIGINAL_RCE %>" />
            <html:hidden property="<%=BaseEditSiteForm.FIELD_ORIGINAL_FOUNTAS %>" />
            <html:hidden property="<%=BaseEditSiteForm.FIELD_ORIGINAL_LEXILE %>" />
            <html:hidden property="<%=BaseEditSiteForm.FIELD_ORIGINAL_AUTO_SYNC_BIBLIONASIUM %>" />
            <html:hidden property="<%=BaseEditSiteForm.FIELD_UPDATE_IN_PROGRESS_ARE %>" />
            <html:hidden property="<%=BaseEditSiteForm.FIELD_UPDATE_IN_PROGRESS_RCE %>" />
            <html:hidden property="<%=BaseEditSiteForm.FIELD_FORWARD_TO_AGREEMENT_FOR_VENDOR_SITE%>" value="" />
            <html:hidden property="<%=BaseDestinyServicesForm.FIELD_USE_BIBLIONASIUM_SELECTED%>"/>
            <html:hidden property="<%=BaseDestinyServicesForm.FIELD_BIBLIONASIUM_SUPERVISOR_PATRON_ID%>"/>
        <input type="hidden" name="<%= BaseDestinyServicesForm.PARAM_CHECKBOX_RPS %>" value="false"> 

</td></tr>
