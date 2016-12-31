<%@page import="com.follett.fsc.destiny.util.ThirdPartyVendorSpecs"%>
<%@page import="com.follett.fsc.destiny.client.common.servlet.VendorReportForm"%>
<%@page import="com.follett.fsc.destiny.util.DestinySystemProperties"%>
<%@page import="com.follett.fsc.destiny.util.DestinyConfigProperties"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.PatronSpecs"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.BaseHomeForm"%>

<%
    SessionStoreProxy.getSessionStore(request);
    String borderColor = "#C0C0C0";
    EditDistrictForm form = (EditDistrictForm)request.getAttribute(EditDistrictForm.FORM_NAME);
    boolean isInternationalProduct = LocaleHelper.isInternationalProduct();

%>

<%@page import="com.follett.fsc.destiny.entity.ejb3.EmailSpecs"%>

<%@page import="com.follett.fsc.common.StringHelper"%><c:set var="cForm" value="<%=request.getAttribute(EditDistrictForm.FORM_NAME)%>"/>

<script language="JavaScript">
<!--
    function setConfigRosterTypeChange() {
        //alert('Config Aspen SIS Change');
        document.<%=EditDistrictForm.FORM_NAME%>.<%=EditDistrictForm.FIELD_ROSTER_TYPE_CHANGE%>.value = "true";
        document.<%=EditDistrictForm.FORM_NAME%>.submit();
    }
    function redirectUserToAgreementFor(vendor,checked) {
    	var signAgreementAgainIfAlreadySigned = true;
      	var editForm = document.forms['<%=EditDistrictForm.FORM_NAME%>'];
    	if (checked) {
        	if (vendor=='mackin') {
        		if (<%=form.isAgreementSigned("mackin")%> && !signAgreementAgainIfAlreadySigned) {
        			document.getElementById("<%=EditDistrictForm.ID_MACKIN_INTEGRATION_ENABLE%>").checked = true;
        		}else{
        			document.getElementById("<%=EditDistrictForm.ID_MACKIN_INTEGRATION_ENABLE%>").checked = false;
        			editForm.<%=EditDistrictForm.FIELD_FORWARD_TO_AGREEMENT_FOR_VENDOR%>.value=vendor;
        			editForm.submit();
        		}
        		
        	}
        	if (vendor=='bakerandtaylor') {
        		if (<%=form.isAgreementSigned("bakerandtaylor")%> && !signAgreementAgainIfAlreadySigned) {
        			document.getElementById("<%=EditDistrictForm.ID_BAKER_AND_TAYLOR_INTEGRATION_ENABLE%>").checked = true;
        		}else{
        			document.getElementById("<%=EditDistrictForm.ID_BAKER_AND_TAYLOR_INTEGRATION_ENABLE%>").checked = false;
        			editForm.<%=EditDistrictForm.FIELD_FORWARD_TO_AGREEMENT_FOR_VENDOR%>.value=vendor;
        			editForm.submit();
        		}
        		
        	}
        	if (vendor=='overdrive') {
        		if (<%=form.isAgreementSigned("overdrive")%> && !signAgreementAgainIfAlreadySigned) {
        			document.getElementById("<%=EditDistrictForm.ID_OVERDRIVE_INTEGRATION_ENABLE%>").checked = true;
        		}else{
        			document.getElementById("<%=EditDistrictForm.ID_OVERDRIVE_INTEGRATION_ENABLE%>").checked = false;
        			editForm.<%=EditDistrictForm.FIELD_FORWARD_TO_AGREEMENT_FOR_VENDOR%>.value=vendor;
        			editForm.submit();
        		}
        	}
    	}else{
  			editForm.<%=EditDistrictForm.FIELD_DISCONNECT_WARNING%>.value=vendor;
    		editForm.submit();
    	}
    }
    function retainPatronHistoryModeChangedDoSubmit() {
        document.forms['<%=EditDistrictForm.FORM_NAME%>'].<%=EditDistrictForm.FIELD_RETAIN_PATRON_HISTORY_MODE_CHANGED%>.value = true;
        document.forms['<%=EditDistrictForm.FORM_NAME%>'].submit();
    }
    function retainPatronHistoryXYearsChangedDoSubmit() {
    	if (<%=form.isModeRetainPatronHistoryForXYears()%>) {
    		retainPatronHistoryModeChangedDoSubmit();
    	}
    }
-->
</script>

<html:hidden property="<%=EditDistrictForm.PARAM_ORIGINAL_DUPLICATE_BARCODES_TEXTBOOKS%>" />
<html:hidden property="<%=EditDistrictForm.PARAM_ORIGINAL_DUPLICATE_BARCODES_RESOURCES%>" />
<html:hidden property="<%=EditDistrictForm.PARAM_ORIGINAL_CLEAR_PATRON_NOTE_ON_TRANSFER_STATE%>" />
<html:hidden property="<%=EditDistrictForm.PARAM_ORIGINAL_FINE_CURRENCY_UNIT_ID%>" />
<html:hidden property="<%=EditDistrictForm.PARAM_DISTRIBUTED_ADD%>" />
<html:hidden property="<%=EditDistrictForm.FIELD_ROSTER_TYPE_CHANGE%>" value="false"/>
<html:hidden property="<%=EditDistrictForm.PARAM_ORIGINAL_ASPEN_GUID_OR_DISTRICT_NAME %>"/>
<html:hidden property="<%=EditDistrictForm.PARAM_ORIGINAL_ASPEN_ACCESS_TOKEN %>"/>
<html:hidden property="<%=EditDistrictForm.PARAM_SHOW_ASPEN_RECONFIGURE_MESSAGE %>" value="false"/>
<html:hidden property="<%=EditDistrictForm.FIELD_RETAIN_PATRON_HISTORY_MODE_CHANGED %>" value="false"/>
<html:hidden property="<%=EditDistrictForm.PARAM_ORIGINAL_ROSTER_CONFIG_TYPE %>"/>
<html:hidden property="<%=EditDistrictForm.PARAM_EXTERNAL_ROSTER_APP_ID %>"/>

<% if (form.isDisplayHistoryRetentionMessage()) { %>
        <base:messageBox showWarningIcon="true" filterMessage="false" message="<%=form.generateHistoryRetentionMessage() %>">
            <tr>
                <td align="center" class="ColRow" colspan="2">
                <base:okButton></base:okButton>
                </td>
            </tr>
        </base:messageBox>
<% } %>
<%
    if (form.isShowDuplicateTextbookBarcodesConfirmation() || form.isShowDuplicateResourceBarcodesConfirmation() || 
        form.isShowClearPatronNoteOnTransferConfirmation() || form.isShowFineCurrencyChangeConfirmation()) {
%>
        <base:messageBox showWarningIcon="true" filterMessage="false" message="<%=form.generateMessageText()%>">
            <% if(form.isShowFineCurrencyChangeConfirmation()) { %>
                <tr>
                    <td align="center" class="ColRowBold" colspan="2">
                        <BR>During this processing, Destiny will be unavailable.<BR>
                    </td>
                </tr>
            <% } %>
            <tr>
                <td align="center" class="ColRow" colspan="2">
                    <BR>Proceed?<BR><BR>

                    <base:yesNo
                        buttonYesName="<%=EditDistrictForm.BUTTON_CONFIRM_DUPLICATE_MESSAGE_YES %>"
                        buttonNoName="<%=EditDistrictForm.BUTTON_CONFIRM_DUPLICATE_MESSAGE_NO %>"
                    />
                </td>
            </tr>
        </base:messageBox>
<% } %>
<% if (form.isShowAspenDisconnectMessage()) { %>
        <base:messageBox showWarningIcon="true" filterMessage="false" message="<%=form.generateAspenSISDisconnectMessage() %>">
            <tr>
                <td align="center" class="ColRow" colspan="2">
                    <BR>Proceed?<BR><BR>
                    <base:yesNo
                        buttonYesName="<%=EditDistrictForm.BUTTON_CONFIRM_ASPEN_DISCONNNECT_MESSAGE_YES %>"
                        buttonNoName="<%=EditDistrictForm.BUTTON_CONFIRM_ASPEN_DISCONNNECT_MESSAGE_NO %>"
                    />
                </td>
            </tr>
        </base:messageBox>
<% } %>
<% if (form.isShowAspenReconfigureMessage()) { %>
        <base:messageBox showWarningIcon="true" filterMessage="false" message="<%=form.generateAspenSISReconfigureMessage() %>">
            <tr>
                <td align="center" class="ColRow" colspan="2">
                    <BR>Proceed?<BR><BR>
                    <base:yesNo
                        buttonYesName="<%=EditDistrictForm.BUTTON_CONFIRM_ASPEN_RECONFIGURE_MESSAGE_YES %>"
                        buttonNoName="<%=EditDistrictForm.BUTTON_CONFIRM_ASPEN_RECONFIGURE_MESSAGE_NO %>"
                    />
                </td>
            </tr>
        </base:messageBox>
<% } %>
<% if (form.isShowExternalRosterDisconnectMessage()) { %>
        <base:messageBox showWarningIcon="true" filterMessage="false" message="<%=form.generateExternalRosterDisconnectMessage() %>">
            <tr>
                <td align="center" class="ColRow" colspan="2">
                    <BR>Proceed?<BR><BR>
                    <base:yesNo
                        buttonYesName="<%=EditDistrictForm.BUTTON_CONFIRM_EXTERNAL_ROSTER_DISCONNNECT_MESSAGE_YES %>"
                        buttonNoName="<%=EditDistrictForm.BUTTON_CONFIRM_EXTERNAL_ROSTER_DISCONNNECT_MESSAGE_NO %>"
                    />
                </td>
            </tr>
        </base:messageBox>
<% } %>

    <bean:define id="months" name="<%= EditDistrictForm.FORM_NAME %>" property="months"/>
    <bean:define id="destinyLocales" name="<%= EditDistrictForm.FORM_NAME %>" property="destinyLocales"/>
    <bean:define id="fineCurrencyUnits" name="<%= EditDistrictForm.FORM_NAME %>" property="fineCurrencyUnits"/>
    <bean:define id="retainPatronHistoryXYearsOptions" name="<%= EditDistrictForm.FORM_NAME %>" property="retainPatronHistoryXYearsOptions"/>
    <html:hidden property="<%=EditDistrictForm.FIELD_FORWARD_TO_AGREEMENT_FOR_VENDOR%>" value="" />
    <html:hidden property="<%=EditDistrictForm.FIELD_DISCONNECT_WARNING%>" value="" />
    
    <base:outlinedTable borderColor="<%=borderColor%>" id="<%=EditDistrictForm.TABLE_DISTRICT_EDIT%>" width="100%">
        <c:if test="${cForm.distributedAdd}">
            <tr>
                <td class="TableHeading" colspan="3">Add New: Step 2 of 3</td>
            </tr>
            <tr>
                <td class="Instruction" colspan="3">
                    If necessary, Destiny Admin can modify all of the options in this step through Update District Sites.
                </td>
            </tr>
            <tr>
                <td colspan="3">
                    <base:imageLine />
                </td>
            </tr>
        </c:if>
        
        <c:choose>
            <c:when test="${cForm.distributedAdd}">
                <html:hidden property="<%=EditDistrictForm.SITE_OR_DISTRICT_NAME%>" value="${cForm.memberForDistributedAdd.name}"/>
                <tr>
                    <td class="FormLabel tdAlignRight">
                        * MARC&nbsp;Organization&nbsp;Code
                    </td>
                    <td>
                        <html:text property="<%=EditDistrictForm.FIELD_MARC_ORGANIZATION_CODE%>" size="12" maxlength="10"/>
                    </td>
                    <td class="ColRowBold tdAlignRight" nowrap>
                        <base:showHideTag id="Top">
                            <base:genericButton src="/buttons/large/next.gif" onclick="hideElementTop()" name="<%=EditDistrictForm.BUTTON_NEXT %>" alt="Next" />&nbsp;<base:cancelButton/>
                        </base:showHideTag>
                    </td>
                </tr>
                <tr>
                     <td colspan="3"> <base:imageLine/></td>
                </tr>
                <html:hidden property="<%= BaseDestinyServicesForm.FIELD_CUSTOMER_NUMBER %>" value="${cForm.memberForDistributedAdd.customerNumber}"/>
                
            </c:when>
            <c:otherwise>
                <tr>
                    <td class="Instruction" colspan="3">
                        * = Required Field
                    </td>
                </tr>
                <tr >
                    <td class="FormLabel tdAlignRight">            
                        * District&nbsp;Name
                    </td>
                    <td>
                        <html:text property="<%=EditDistrictForm.SITE_OR_DISTRICT_NAME%>" size="30" maxlength="80"/>
                     </td>
                    <td class="ColRowBold tdAlignRight" nowrap>
                        <base:showHideTag id="Top">
                            <base:saveButton onclick="hideElementTop()"/>&nbsp;<base:cancelButton/>
                        </base:showHideTag>
                    </td>
                </tr>
            
                <% if (!isInternationalProduct) { %>
                <tr>
                    <td class="FormLabel tdAlignRight">
                    District&nbsp;State&nbsp;Identification
                    </td>
                    <td colspan="2">
                      <html:text property="<%=EditDistrictForm.FIELD_DISTRICT_STATE_IDENTIFIER%>" size="30" maxlength="50"/>
                    </td>
                </tr>
                <% } %>
                            
                <tr>
                    <td class="FormLabel tdAlignRight">
                    * MARC&nbsp;Organization&nbsp;Code
                    </td>
                    <td colspan="2">
                      <html:text property="<%=EditDistrictForm.FIELD_MARC_ORGANIZATION_CODE%>" size="12" maxlength="10"/>
                    </td>
                </tr>            
            
                <tr>
                    <td colspan="3"> <base:imageLine/></td>
                </tr>
            
                <tr>
                    <td class="FormLabel tdAlignRight">
                        * District&nbsp;Customer&nbsp;Number
                    </td>
                    <td class="FormLabel" nowrap valign="middle" colspan="2">
                      <html:text property="<%= BaseDestinyServicesForm.FIELD_CUSTOMER_NUMBER %>" size="8" maxlength="7"/>
                    </td>
                </tr>            
            </c:otherwise>
        </c:choose>

<jsp:include page="/district/services.jsp" flush="true" />

    <c:if test="${cForm.distributedAdd}">
    <%-- start of SMTP Settings --%>
        <tr>
            <td colspan="3"><img src="/images/icons/general/line.gif" height="1" width="100%"></td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight">
            SMTP&nbsp;(Mail)&nbsp;Server&nbsp;Address
            </td>
            <td colspan="2">
              <html:text property="<%=EditDistrictForm.FIELD_SMTP_SERVER%>" size="30" maxlength="128"/>
            &nbsp;&nbsp;&nbsp;<span class="FormLabel">Port</span>
              <html:text property="<%=EditDistrictForm.FIELD_SMTP_PORT%>" size="5" maxlength="5"/>
            </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight">
            Authentication&nbsp;User&nbsp;ID
            </td>
            <td colspan="2">
              <html:text property="<%=EditDistrictForm.FIELD_SMTP_USERNAME%>" size="20" maxlength="150"/>
            </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight">
            Authentication&nbsp;Password
            </td>
            <td class="ColRow" colspan="2">
                <input type="password" name="<%=EditDistrictForm.FIELD_SMTP_PASSWORD%>" size="20" maxlength="150" autocomplete="off"/>
              &nbsp;<base:genericButton src="/buttons/large/testserver.gif" name="<%= EditDistrictForm.BUTTON_NAME_TEST_SERVER %>" alt="Test Server"/><base:helpTag helpFileName="c_smtp_server.htm"/>
            </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight">
            From/Reply To Display Name
            </td>
            <td colspan="2">
              <html:text property="<%=EditDistrictForm.FIELD_EMAIL_DEFAULT_REPLY_NAME%>" size="30" maxlength='<%="" + EmailSpecs.EMAIL_MAX_LENGTH %>'/>
            </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight">
            From/Reply To Email
            </td>
            <td class="ColRow" colspan="2">
              <html:text property="<%=EditDistrictForm.FIELD_EMAIL_DEFAULT_REPLY_ADDRESS%>" size="30" maxlength='<%="" + EmailSpecs.EMAIL_MAX_LENGTH %>'/>
            <base:genericButton src="/buttons/large/testemail.gif" name="<%= EditDistrictForm.BUTTON_NAME_TEST_EMAIL %>" alt="Test Email"/>
            <base:helpTag helpFileName="c_smtp_server.htm"/>
            </td>
        </tr>
        
    <%-- end of SMTP Settings --%>
    </c:if>
    <%-- start of Roster Configuration --%>
        <tr>
            <td colspan="3"> <base:imageLine/></td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight" valign="top" id="rosterConfigText">
                Student Roster Configuration
            </td>
            <c:choose>
                <c:when test="${cForm.distributedAdd}"> <%-- Don't show the Roster Section if they are using the Consortium District add on the fly feature --%>
                    <td class="FormLabel" colspan="2">
                        <span style="color:#CC0000;">After creating the member, you can enable Aspen SIS integration.</span>
                    </td>
                </c:when>
                <c:when test="<%=EditDistrictForm.RADIO_ROSTER_CONFIG_ASPEN.equals(form.getRosterConfigType()) %>">
                    <td colspan="2">
                      <table width="100%" id="aspenSISConfigTable">
                        <tr>
                            <td  class="ColRow">
                                Aspen SIS
                            </td>
                            <td class="ColRow tdAlignRight" rowspan="2">
                                <br>
                                <base:genericButton src="/buttons/large/reconfigure.gif" name="<%= EditDistrictForm.BUTTON_ASPEN_RECONFIG %>" alt="Reconfigure" />&nbsp;                    
                            </td>
                          </tr>
                          <tr>
                            <td class="ColRow" id="aspenSISDecriptionText">
                              <%-- if Aspen has connected to us, then we will display the prompt for connected as, otherwise we display the guid prompt --%>
                                <% if (StringHelper.isEmptyOrWhitespace(form.getAspenAccessToken())) { %>
                                    Connect to Aspen with          
                                <% } else { %>
                                    Connected to Aspen as
                                <% } %>
                            </td>
                        </tr>
                        <tr>
                            <td class="ColRow" id="aspenSISContextText">
                                &nbsp;&nbsp;&nbsp;&nbsp;Context:&nbsp;<%=form.getAspenDistrictContext()%>
                            </td>
                            <td class = "ColRow  tdAlignRight" rowspan="2">
                                <br>
                                <base:genericButton src="/buttons/large/disconnect.gif" name="<%= EditDistrictForm.BUTTON_ASPEN_DISCONNECT %>" alt="Disconnect" />
                            </td>
                        </tr>
                        
                        <tr>
                            <td class="ColRow" id="aspenSISConfigConnectionText">
                                &nbsp;&nbsp;&nbsp;&nbsp;GUID:&nbsp;<%=form.getAspenGUIDOrDistrictName() %>
                            </td>
                        </tr>
                      </table>
                <%-- end of Aspen Configuration --%>
                    </td>                
                </c:when>
                <c:when test="<%=EditDistrictForm.RADIO_ROSTER_CONFIG_EXTERNAL.equals(form.getRosterConfigType()) %>">
                    <td colspan="2">
                      <table width="100%" id="externalRosterConfigTable">
                        <tr>
                            <td  class="ColRow" valign="top">
                                External Rostering Application
                            </td>
                            <td class="ColRow tdAlignRight" valign="top">
                                <base:link onclick="launchExternalRosterConfiguration();return false;" page="#" target="_blank">
                                    <base:image src="/buttons/large/configure.gif" alt="Configure" name="<%= EditDistrictForm.BUTTON_ROSTER_CONFIGURE %>"/>
                                </base:link>
                                <br/>
                                <br/>
                                <base:genericButton src="/buttons/large/disconnect.gif" name="<%= EditDistrictForm.BUTTON_ROSTER_DISCONNECT %>" alt="Disconnect" />
                            </td>
                          </tr>
                      </table>
                <%-- end of External Configuration --%>
                    </td>                
                </c:when>
                <c:otherwise> <%-- Show Roster Configuration --%>
                    <%--Only Show radio buttons if No Roster/Aspen configuration is in place --%>  
                    <td colspan="2">
                    <table id="rosterTypeRadioButtons">
                        <tr>
                            <td class="ColRow">
                                <html:radio property="<%=EditDistrictForm.FIELD_ROSTER_CONFIG_TYPE%>"
                                    value="<%=EditDistrictForm.RADIO_ROSTER_CONFIG_NONE%>"/>
                            </td>
                            <td class="ColRow">
                                Destiny Configured Only
                            </td>
                        </tr>
                        <tr>
                            <td class="ColRow">
                                <html:radio property="<%=EditDistrictForm.FIELD_ROSTER_CONFIG_TYPE%>"
                                    value="<%=EditDistrictForm.RADIO_ROSTER_CONFIG_ASPEN%>"
                                    onclick="setConfigRosterTypeChange()"/>
                            </td>
                            <td class="ColRow">
                                Aspen SIS
                            </td>
                        </tr>
                        <% if (form.isExternalRosteringApplicationAvailable()) { %>
                            <tr>
                                <td class="ColRow">
                                    <html:radio property="<%=EditDistrictForm.FIELD_ROSTER_CONFIG_TYPE%>"
                                        value="<%=EditDistrictForm.RADIO_ROSTER_CONFIG_EXTERNAL%>"
                                        onclick="setConfigRosterTypeChange()"/>
                                </td>
                                <td class="ColRow">
                                    External Rostering Application
                                </td>
                            </tr>
                        <% } %>
                    </table>
                    </td>
                
                 </c:otherwise>
            </c:choose>        
        </tr>
      
    <%-- end of Roster Configuration --%>  
    
    <%-- start Baker & Taylor --%>
        <tr>
            <td colspan="3"> <base:imageLine/></td>
        </tr>
        
        <tr>
            <td class="FormLabel tdAlignRight" id="BakerAndTaylorConfigText">
                 Baker & Taylor Integration
            </td>
            <td class="FormLabel" id="bakerAndTaylorIntegrationText">
                <html:checkbox disabled="<%=form.showVendorEnabledCheckbox()%>" property="<%= EditDistrictForm.CHECKBOX_BAKER_AND_TAYLOR_INTEGRATION_ENABLED %>"
                    styleId="<%= EditDistrictForm.ID_BAKER_AND_TAYLOR_INTEGRATION_ENABLE %>" onclick="redirectUserToAgreementFor('bakerandtaylor',this.checked);"/>
                &nbsp;Enable Axis 360 Integration
                <base:link onclick="vendorTest('bakerandtaylor');return false;" page="#" target="_blank">
                    <base:image src="/buttons/large/TestConnection.gif" alt="<%= EditDistrictForm.LINK_TEST_BAKER_AND_TAYLOR %>"/>
                </base:link>
                &nbsp;
                <base:link
                    page='<%="/common/servlet/presentvendorreport.do?"+VendorReportForm.PARAM_VENDOR_NAME+"="+ThirdPartyVendorSpecs.Vendor.BAKERANDTAYLOR.getText()%>'
                    id="<%=EditDistrictForm.ID_BAKER_AND_TAYLOR_RUN_REPORT%>">
                    <base:image src="/buttons/large/runreport.gif" alt="<%=EditDistrictForm.LINK_BAKER_AND_TAYLOR_RUN_REPORT%>"/>
                </base:link>
                <base:helpTag helpFileName="c_LM_baker_integrate.htm"/>
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td class="ColRow">
                If you already have Axis 360 patron accounts, select the Destiny field that will be used to match existing Axis 360 accounts.
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td class="ColRow">
                Axis 360 ID:&nbsp;&nbsp;<%=form.getBakerAndTaylorSISFieldDropDown()%>
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td class="ColRow">
                Baker & Taylor integration will only function for the production server.
            </td>
            <td>&nbsp;</td>
        </tr>
    <%-- end Baker & Taylor --%>
    
    
    <%-- start mackin --%>
        <tr>
            <td colspan="3"> <base:imageLine/></td>
        </tr>
        
        <tr>
            <td class="FormLabel tdAlignRight" id="mackinConfigText">
                MackinVIA&trade; Integration
            </td>
            <td class="FormLabel" id="MackinIntegrationText">
                <html:checkbox disabled="<%=form.showVendorEnabledCheckbox()%>" property="<%= EditDistrictForm.CHECKBOX_MACKIN_INTEGRATION_ENABLE %>"
                    styleId="<%= EditDistrictForm.ID_MACKIN_INTEGRATION_ENABLE %>" onclick="redirectUserToAgreementFor('mackin',this.checked);"/>
                &nbsp;Enable MackinVIA&trade; Integration
                <base:link onclick="vendorTest('Mackin');return false;" page="#" target="_blank">
                    <base:image src="/buttons/large/TestConnection.gif" alt="<%= EditDistrictForm.LINK_TEST_MACKIN %>"/>
                </base:link>
                &nbsp;
                <base:link
                    page='<%="/common/servlet/presentvendorreport.do?"+VendorReportForm.PARAM_VENDOR_NAME+"="+ThirdPartyVendorSpecs.Vendor.MACKIN.getText()%>'
                    id="<%=EditDistrictForm.ID_MACKIN_RUN_REPORT%>">
                    <base:image src="/buttons/large/runreport.gif" alt="<%=EditDistrictForm.LINK_MACKIN_RUN_REPORT%>"/>
                </base:link>
                <base:helpTag helpFileName="c_LM_mackin_integrate.htm"/>
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td class="ColRow">
                MackinVIA&trade; integration will only function for the production server.
            </td>
            <td>&nbsp;</td>
        </tr>
    <%-- end mackin --%>
    
    <%-- start overdrive --%>
        <tr>
            <td colspan="3"> <base:imageLine/></td>
        </tr>
        
        <tr>
            <td class="FormLabel tdAlignRight" id="overdriveConfigText">
                OverDrive&reg; Integration
            </td>
            <td class="FormLabel" id="OverdriveIntegrationText">
                <html:checkbox disabled="<%=form.showVendorEnabledCheckbox()%>" property="<%=EditDistrictForm.CHECKBOX_OVERDRIVE_INTEGRATION_ENABLE%>" 
                    styleId="<%=EditDistrictForm.ID_OVERDRIVE_INTEGRATION_ENABLE%>" onclick="redirectUserToAgreementFor('overdrive',this.checked);"/>
                &nbsp;Enable OverDrive&reg; Integration
                <base:link onclick="vendorTest('OverDrive');return false;" page="#" target="_blank">
                    <base:image src="/buttons/large/TestConnection.gif" alt="<%=EditDistrictForm.LINK_TEST_OVERDRIVE%>"/>
                </base:link>
                &nbsp;
                <base:link
                    page='<%="/common/servlet/presentvendorreport.do?"+VendorReportForm.PARAM_VENDOR_NAME+"="+ThirdPartyVendorSpecs.Vendor.OVERDRIVE.getText()%>'
                    id="<%=EditDistrictForm.ID_OVERDRIVE_RUN_REPORT%>">
                    <base:image src="/buttons/large/runreport.gif" alt="<%= EditDistrictForm.LINK_OVERDRIVE_RUN_REPORT%>"/>
                </base:link>
                <base:helpTag helpFileName="c_LM_OD_integrate.htm"/>
                <br/>
                <br/>
                *&nbsp;Website&nbsp;ID&nbsp;<html:text property="<%=EditDistrictForm.FIELD_OVERDRIVE_WEBSITE_ID%>" size="25" maxlength="200"/>
                *&nbsp;Authentication&nbsp;Name&nbsp;<html:text property="<%=EditDistrictForm.FIELD_OVERDRIVE_AUTHENTICATION_NAME%>" size="25" maxlength="200"/>
                Library&nbsp;ID&nbsp;<html:text property="<%=EditDistrictForm.FIELD_OVERDRIVE_LIBRARY_ID%>" size="25" maxlength="200"/>
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td class="ColRow">
                OverDrive&reg; integration will only function for the production server.
            </td>
            <td>&nbsp;</td>
        </tr>
    <%-- end overdrive --%>
    <%-- start sso configuration --%>
        <tr>
            <td colspan="3"> <base:imageLine/></td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight" id="<%=EditDistrictForm.SSO_CONFIGURATION_TEXT%>">
                SSO Configuration
            </td>
            <td class="FormLabel" colspan="2">
                <base:link onclick="launchSSOConfiguration();return false;" page="#" target="_blank">
                    <base:image src="/buttons/large/configure.gif" alt="<%=EditDistrictForm.SSO_CONFIGURATION_BUTTON_ALT_TEXT%>"/>
                </base:link>
            </td>
        </tr>
    <%-- end sso configuration --%>
        <tr>
            <td colspan="3"> <base:imageLine/></td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight">
                Statistical Year Starts In
            </td>
            <td colspan="2">
                <html:select property="<%= EditDistrictForm.FIELD_STAT_YEAR %>">
                    <html:options collection="months" property="stringCode"
                              labelProperty="stringDesc"/>
                </html:select>
            </td>
        </tr>
        
	        <tr>
                <td class="FormLabel tdAlignRight">
	                Fiscal Year Starts In
	            </td>
	            <td colspan="2">
	                <html:select property="<%= EditDistrictForm.FIELD_FISCAL_YEAR %>">
	                    <html:options collection="months" property="stringCode"
	                              labelProperty="stringDesc"/>
	                </html:select>
	            </td>
	        </tr>
        
		      
       <tr>
            <td colspan="3"> <base:imageLine/></td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight">
                Region Format
            </td>
            <td colspan="2">
                <html:select property="<%= EditDistrictForm.FIELD_DESTINY_LOCALE %>">
                    <html:options collection="destinyLocales" property="stringCode" labelProperty="stringDesc"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight">
                Fine Currency
            </td>
            <c:choose>
                <c:when test="${cForm.distributedAdd}">
                    <td class="FormLabel" colspan="2">
                        <span style="color:#CC0000;">United States Dollar (USD) (After creating the member, you can select a different fine currency.)</span>
                    </td>
                </c:when>
                <c:otherwise>
                    <td colspan="2">
                        <html:select property="<%= EditDistrictForm.FIELD_FINE_CURRENCY_UNIT_ID %>">
                            <html:options collection="fineCurrencyUnits" property="longID" labelProperty="stringDesc"/>
                        </html:select>
                    </td>
                </c:otherwise>
            </c:choose>
        </tr>
        <% if (!isInternationalProduct) { %>
        <c:if test="${! cForm.distributedAdd}">
            <tr>
                <td colspan="3"> <base:imageLine/></td>
            </tr>
            <tr>
                <td class="FormLabel tdAlignRight">
                    Textbook Management
                </td>
                <td class="FormLabel" colspan="2">
                  <html:checkbox property="<%= EditDistrictForm.CHECKBOX_DUPLICATE_BARCODES %>" />
                  &nbsp;Prevent duplicate barcodes across the district
                </td>
            </tr>
            <tr>
                <td>
                    &nbsp;
                </td>
                <td class="FormLabel" colspan="2">
                  <html:checkbox property="<%= EditDistrictForm.CHECKBOX_TRANSFER_CHECKEDOUT_TEXTBOOKS %>" />
                  &nbsp;Checked out textbooks will be transferred
                    when patron is transferred
                </td>
            </tr>
        </c:if>
     
        <tr>
            <td>
                &nbsp;
            </td>
            <td class="FormLabel" colspan="2">
              <html:checkbox property="<%= EditDistrictForm.CHECKBOX_ALLOW_RECEIVE_TEXTBOOK_BY_BARCODE_FILE %>" />
              &nbsp;Allow sites to receive textbooks by barcode scan
            </td>
        </tr>

        <tr>
            <td>
                &nbsp;
            </td>
            <td class="FormLabel" colspan="2">
                Customize User-Defined Textbook title field <html:text property="textbookUDFFieldName" size = "25" maxlength = "50"/>
            </td>
        </tr>
        <% } %>
        
        <% if (!isInternationalProduct) { %>
        <c:if test="${! cForm.distributedAdd}">
            <tr>
                <td colspan="3"> <base:imageLine/></td>
            </tr>
            <tr>
                <td class="FormLabel tdAlignRight">
                    Resource Management
                </td>
                <td class="FormLabel" colspan="2">
                  <html:checkbox property="<%= EditDistrictForm.CHECKBOX_DUPLICATE_RESOURCE_BARCODES %>" />
                  &nbsp;Prevent duplicate barcodes across the district
                </td>
            </tr> 
            <tr>     
                <td>
                    &nbsp;
                </td>
                <td class="FormLabel" colspan="2">
                  <html:checkbox property="<%= EditDistrictForm.CHECKBOX_ALLOW_ASSET_TRANSFER_ON_SCAN %>" />
                  &nbsp;Allow sites to receive resources by barcode scan
                </td>
            </tr>
            <tr>
                <td>
                    &nbsp;
                </td>
                <td class="FormLabel" colspan="2">
                  <html:checkbox property="<%= EditDistrictForm.CHECKBOX_ALLOW_SITES_TO_MAKE_TRANSFER_REQUESTS %>" />
                  &nbsp;Allow sites to make transfer requests
                </td>
            </tr>
        </c:if>
        <% } %>

        <tr>
            <td colspan="3">
                <a name="<%=EditDistrictForm.ANCHOR_PATRON_MANAGEMENT%>"/>
                <base:imageLine/>
            </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight">
                Patron Management
            </td>
            <td class="FormLabel" colspan="2">
              <html:checkbox property="<%= EditDistrictForm.CHECKBOX_DISTRICT_ID %>" />
              &nbsp;Require <%=PatronSpecs.getDistrictIDPrompt() %> for patron records
            </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight">
                &nbsp;
            </td>
            <td class="FormLabel" colspan="2">
              <html:checkbox property="<%= EditDistrictForm.CHECKBOX_CLEAR_PATRON_NOTE_ON_TRANSFER %>" />
              &nbsp;Clear patron notes when transferring patrons
            </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight">
                &nbsp;
            </td>
            <td class="FormLabel" colspan="2">
              <html:checkbox property="<%= EditDistrictForm.CHECKBOX_ALLOW_DISTRICT_FINE_PAYMENT %>" />
              &nbsp;Allow fines to be paid/waived at any site
            </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight">
                &nbsp;
            </td>
            <td class="FormLabel" colspan="2">
                Retain patron library checkout history:
            </td>
        </tr>
        <tr valign="top">
            <td class="FormLabel tdAlignRight">
                &nbsp;
            </td>
            <td colspan="2">
                <table id="<%=EditDistrictForm.TABLE_RETAIN_PATRON_HISTORY%>">
                    <tr>
                        <td class="ColRow">
                            &nbsp;&nbsp;<html:radio property="<%=EditDistrictForm.FIELD_RETAIN_PATRON_HISTORY_MODE%>"
                                value="<%=EditDistrictForm.VALUE_RETAIN_PATRON_HISTORY_FOREVER%>"
                                onclick="retainPatronHistoryModeChangedDoSubmit()"/>
                        </td>
                        <td class="ColRow">
                            Forever
                        </td>
                    </tr>
                    <tr>
                        <td class="ColRow">
                            &nbsp;&nbsp;<html:radio property="<%=EditDistrictForm.FIELD_RETAIN_PATRON_HISTORY_MODE%>"
                                value="<%=EditDistrictForm.VALUE_RETAIN_PATRON_HISTORY_FOR_X_YEARS%>"
                                onclick="retainPatronHistoryModeChangedDoSubmit()"/>
                        </td>
                        <td class="ColRow">
                            For&nbsp;
                            <html:select property="<%= EditDistrictForm.FIELD_RETAIN_PATRON_HISTORY_X_YEARS%>"
                                         onchange="retainPatronHistoryXYearsChangedDoSubmit()">
                                <html:options collection="retainPatronHistoryXYearsOptions" property="longID" labelProperty="stringDesc"/>
                            </html:select>
                            &nbsp;completed statistical year(s)
                        </td>
                    </tr>
                    <%if (form.isRetainPatronHistoryShowXYearsWarning()) {%>
                        <tr>
                            <td>
                                &nbsp;
                            </td>
                            <td class="ColRow" align="center">
                                <span style="color:#CC0000;" id="<%= EditDistrictForm.ID_RETAIN_FOR_X_YEARS_WARNING%>">
                                    You have opted to save patron library checkout history for
                                        <%=form.getRetainPatronHistoryXYears()%> statistical year(s).
                                    Older data will be purged annually.<br/>
                                    Please ensure that you have a current system backup.
                                </span>
                            </td>
                        </tr>
                    <%}%>
                    <tr>
                        <td class="ColRow">
                            &nbsp;&nbsp;<html:radio property="<%=EditDistrictForm.FIELD_RETAIN_PATRON_HISTORY_MODE%>"
                                value="<%=EditDistrictForm.VALUE_RETAIN_PATRON_HISTORY_NEVER%>"
                                onclick="retainPatronHistoryModeChangedDoSubmit()"/>
                        </td>
                        <td class="ColRow">
                            Never - store only current checkouts
                            <base:helpTag helpFileName="d_LM_patron_Never_option.htm"/>
                        </td>
                    </tr>
                    <%if (form.isRetainPatronHistoryShowNeverWarning()) {%>
                        <tr>
                            <td>
                                &nbsp;
                            </td>
                            <td class="ColRow" align="center">
                                <span style="color:#CC0000;" id="<%= EditDistrictForm.ID_RETAIN_NEVER_WARNING%>">
                                    You have opted to never save patron library checkout history.
                                    Historical data will be purged nightly.<br/>
                                    Please ensure that you have a current system backup.
                                </span>
                            </td>
                        </tr>
                    <%}%>
                    <%if (form.generatePatronHistoryPurgeJobletStatus() != null) {%>
                        <tr>
                            <td>
                                &nbsp;
                            </td>
                            <td class="ColRowBold">
                                <%=form.generatePatronHistoryPurgeJobletStatus()%>
                            </td>
                        </tr>
                    <%}%>
                </table>
            </td>
        </tr>
        <%if ((form.isDisplayCircStatsUploadOption()) || (form.isDisplayCatalogTextbookUploadOption())) {%>
        <tr>
            <td colspan="3"> <base:imageLine/></td>
        </tr>
        <%}%>
        <%if (form.isDisplayCircStatsUploadOption()){ %>
            <tr>
                <td class="FormLabel tdAlignRight">
                    Circulation Data
                </td>
                <td class="FormLabel" colspan="2">
                  <html:checkbox property="<%= EditDistrictForm.CHECKBOX_UPLOAD_STATS%>" />
                  &nbsp;Share general (anonymous) circulation data with Follett School Solutions, Inc.
                  <base:helpTag helpFileName="c_sharing_abstract_data.htm"/>
                </td>
            </tr>
        <%} %>
        <%if (form.isDisplayCatalogTextbookUploadOption()) {%>
            <tr>
                <td class="FormLabel tdAlignRight">
                    Catalog Data
                </td>
                <td class="FormLabel" colspan="2" id="uploadTextbookText">
                  <html:checkbox property="<%= EditDistrictForm.CHECKBOX_AUTOMATED_UPLOAD_TEXTBOOK_COLLECTION_FOR_ANALYSIS_OPT_IN%>" />
                  &nbsp;Share general Textbook Catalog data with Follett School Solutions, Inc.
                </td>
            </tr>
        <%}%>

        <tr>
            <td colspan="3"> <base:imageLine/></td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight">
                General Settings
            </td>
            <td class="FormLabel" colspan="2">
                Customize User-Defined Alternate Site Type field <html:text property="alternateSiteTypePrompt" size = "25" maxlength = "50"/>
            </td>
        </tr>
        
        <tr>
            <td colspan="3"> <base:imageLine/></td>
        </tr>
        <tr>
                <td class="FormLabel tdAlignRight">
                    Short Names and Aliases
                </td>
                <td class="FormLabel" colspan="2">
                    <base:link page="/district/servlet/presentdistrictaliasform.do" id="<%=EditDistrictForm.ID_EDIT_DISTRICT_ALIAS%>">
                        <base:image src="/buttons/large/aliases.gif" alt="<%= EditDistrictForm.LINK_EDIT_ALIASES%>"/>
                    </base:link>
                </td>
        </tr>
        <c:choose>
            <c:when test="${! cForm.distributedAdd}">
                <tr>
                    <td colspan="3"> <base:imageLine/></td>
                </tr>
                <tr>
                    <td valign="top" class="FormLabel tdAlignRight">
                        Logo for All Pages
                    </td>
                    <td colspan="2">
                        <table id="<%= EditDistrictForm.TABLE_DISTRICT_LOGO %>" border="0" cellpadding="5" cellspacing="0">
                            <tr>
                                <td align="center" valign="top">
                                
                                   <img name="District Logo" alt="District Logo" title="District Logo" src="<bean:write name="<%= EditDistrictForm.FORM_NAME %>" property="logoURL"/>" width="<%= EditDistrictForm.LOGO_WIDTH %>" height="<%= EditDistrictForm.LOGO_HEIGHT %>" border="1">
                                
                                </td>
                                <td valign="top" class="Instruction" colspan="2">
                                 <base:genericButton name="<%=EditDistrictForm.BUTTON_EDIT_LOGO%>" src="/buttons/large/edit.gif" alt="Edit Logo"/>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
                <tr>
                    <td colspan="3"> <base:imageLine/></td>
                </tr>
                <tr>
                    <td valign="top" class="FormLabel tdAlignRight">
                        Image for Standard Welcome Page
                    </td>
                    <td colspan="2">
                        <table id="<%= EditDistrictForm.TABLE_DISTRICT_IMAGE %>" border="0" cellpadding="5" cellspacing="0">
                            <tr>
                                <td align="center" valign="top">
                                
                                   <img name="District Image" alt="District Image" title="District Image" src="<bean:write name="<%= EditDistrictForm.FORM_NAME %>" property="imageURL"/>" width="<%= EditDistrictForm.LOGO_WIDTH %>" height="<%= EditDistrictForm.LOGO_HEIGHT %>" border="1">
                                
                                </td>
                                <td valign="top" class="Instruction" colspan="2">
                                 <base:genericButton name="<%=EditDistrictForm.BUTTON_EDIT_WELCOME_IMAGE%>" src="/buttons/large/edit.gif" alt="Edit Welcome Page Image"/>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
            <tr>
                <td colspan="3"> <base:imageLine/></td>
            </tr>
            <tr>
                <td class="FormLabel tdAlignRight">
                    Customized Welcome Page
                </td>
                <td class="FormLabel" colspan="2">
                  <html:checkbox property="<%= EditDistrictForm.CHECKBOX_USE_ENHANCED_DISTRICT_HOMEPAGE %>" />
                  &nbsp;Display to all users&nbsp;
                <base:link page='/district/servlet/presenthometreeformdistrictedit.do' id="<%=BaseHomeForm.ID_EDIT_PAGE %>">
                <base:image src="/buttons/large/editpage.gif" alt='<%= MessageHelper.formatMessage("editPage") %>' />
                </base:link>
                </td>
            </tr>
            </c:when>
            <c:otherwise>
                <tr>
                    <td colspan="3"> <base:imageLine/></td>
                </tr>
                <tr>
                    <td class="Instruction" colspan="3">* = Required Field</td>
                </tr>
            </c:otherwise>
        </c:choose>
        

</base:outlinedTable>

 <script language="JavaScript" type="text/javascript">
    
  <!--
    function vendorTest(vendorName) {
      var overdriveWebsiteID = document.getElementsByName('<%=EditDistrictForm.FIELD_OVERDRIVE_WEBSITE_ID%>')[0].value;
      var overdriveAuthenticationName = document.getElementsByName('<%=EditDistrictForm.FIELD_OVERDRIVE_AUTHENTICATION_NAME%>')[0].value;
      var overdriveLibraryID = document.getElementsByName('<%=EditDistrictForm.FIELD_OVERDRIVE_LIBRARY_ID%>')[0].value;
      window.open('/cataloging/servlet/presentopenthirdpartyvendorresourceform.do?testMode=true&vendorName='+vendorName+'&overdriveWebsiteID='+ overdriveWebsiteID +'&overdriveAuthenticationName='+ overdriveAuthenticationName+'&overdriveLibraryID='+overdriveLibraryID, '_blank');
    }
    function launchSSOConfiguration() {
      window.open('/cataloging/servlet/presentdistrictlaunchssoconfigurationform.do', '_blank');
    }
    function launchExternalRosterConfiguration() {
        window.open('/cataloging/servlet/presentdistrictlaunchexternalrosterconfigurationform.do', '_blank');
    }
   //-->
    </script>
