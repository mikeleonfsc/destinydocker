<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.ConfigSiteSpecs" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="java.util.*" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<base:messageBox strutsErrors="true"/>
<%
    TextbookEditLoanPolicyForm form = (TextbookEditLoanPolicyForm)request.getAttribute(TextbookEditLoanPolicyForm.FORM_NAME);
%>

<base:form action="/backoffice/servlet/handletextbookeditloanpolicyform.do">
    <%  // only put DISTRICT MODE on if we are in district mode, otherwise bad things happen
    if (form.isDistrictMode() ) { %>
        <center><span class="ColRowBold"><%= GenericForm.getLastBackupDisplayMsg(false) %></span></center><br>
        <jsp:include page="/common/msdewarning.jsp" flush="true" />
        <html:hidden property="districtMode"/>    

        <logic:equal name="<%= TextbookEditLoanPolicyForm.FORM_NAME%>" property="confirm" value="true">
                <base:messageBox showRedBorder="true">
                <tr valign="center">
                    <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                    <td class="ColRowBold" align="center"><%= form.gimmeConfirmPushMessage() %></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td valign="baseline" align="center" class="ColRow">
                        <base:yesNo/>
                    </td>
                </tr>
                </base:messageBox>
        </logic:equal>
          
    <% } %>


    <html:hidden property="<%=GenericForm.PARAM_COLLECTION_TYPE%>"/>
    <html:hidden property="<%=TextbookEditLoanPolicyForm.PARAM_CONFIG_MODE_ID%>"/>
    
    <logic:equal name="<%=TextbookEditLoanPolicyForm.FORM_NAME%>"
         property="<%=TextbookEditLoanPolicyForm.PARAM_CONFIG_MODE_ID%>" 
            value="<%=TextbookEditLoanPolicyForm.CONFIG_MODE_SHOW_CONDITIONING%>">
        <html:hidden property="<%=TextbookEditLoanPolicyForm.FIELD_MAX_CHECKOUTS%>"/>
        <html:hidden property="<%=TextbookEditLoanPolicyForm.FIELD_OVERDUE_TO_LOST_ENABLED%>"/>
        <html:hidden property="<%=TextbookEditLoanPolicyForm.FIELD_OVERDUE_TO_LOST_DAYS%>"/>
        <html:hidden property="<%=TextbookEditLoanPolicyForm.FIELD_BLOCK_ON_FINES_AND_OVERDUES%>"/>
    </logic:equal>
    
    <logic:equal name="<%=TextbookEditLoanPolicyForm.FORM_NAME%>"
         property="<%=TextbookEditLoanPolicyForm.PARAM_CONFIG_MODE_ID%>" 
            value="<%=TextbookEditLoanPolicyForm.CONFIG_MODE_SHOW_CIRCULATION%>">
        <html:hidden property="<%=TextbookEditLoanPolicyForm.FIELD_AUTO_CONDITION%>"/>
        <html:hidden property="<%=TextbookEditLoanPolicyForm.FIELD_CONDITION_NEW%>"/>
        <html:hidden property="<%=TextbookEditLoanPolicyForm.FIELD_CONDITION_GOOD%>"/>
        <html:hidden property="<%=TextbookEditLoanPolicyForm.FIELD_CONDITION_FAIR%>"/>
        <html:hidden property="<%=TextbookEditLoanPolicyForm.FIELD_CONDITION_POOR%>"/>
        
    </logic:equal>

    <logic:equal name="<%=TextbookEditLoanPolicyForm.FORM_NAME%>"
         property="<%=TextbookEditLoanPolicyForm.PARAM_DISTRICT_MODE%>" value="true">
        <html:hidden property="<%=TextbookEditLoanPolicyForm.PARAM_DISTRICT_MODE%>"/>
    </logic:equal>

    <logic:equal name="<%=TextbookEditLoanPolicyForm.FORM_NAME%>"
         property="<%=TextbookEditLoanPolicyForm.PARAM_CONFIG_MODE_ID%>" 
            value="<%=TextbookEditLoanPolicyForm.CONFIG_MODE_SHOW_ALL%>">
            
        <logic:equal name="<%=TextbookEditLoanPolicyForm.FORM_NAME%>"
                property="<%=TextbookEditLoanPolicyForm.FIELD_AUTO_CONDITION%>" value="false">
            <html:hidden property="<%=TextbookEditLoanPolicyForm.FIELD_CONDITION_NEW%>"/>
            <html:hidden property="<%=TextbookEditLoanPolicyForm.FIELD_CONDITION_GOOD%>"/>
            <html:hidden property="<%=TextbookEditLoanPolicyForm.FIELD_CONDITION_FAIR%>"/>
            <html:hidden property="<%=TextbookEditLoanPolicyForm.FIELD_CONDITION_POOR%>"/>
        </logic:equal>
        
    </logic:equal>
    <logic:equal name="<%=TextbookEditLoanPolicyForm.FORM_NAME%>"
         property="<%=TextbookEditLoanPolicyForm.PARAM_CONFIG_MODE_ID%>" 
            value="<%=TextbookEditLoanPolicyForm.CONFIG_MODE_SHOW_CONDITIONING%>">
            
        <logic:equal name="<%=TextbookEditLoanPolicyForm.FORM_NAME%>"
                property="<%=TextbookEditLoanPolicyForm.FIELD_AUTO_CONDITION%>" value="false">
            <html:hidden property="<%=TextbookEditLoanPolicyForm.FIELD_CONDITION_NEW%>"/>
            <html:hidden property="<%=TextbookEditLoanPolicyForm.FIELD_CONDITION_GOOD%>"/>
            <html:hidden property="<%=TextbookEditLoanPolicyForm.FIELD_CONDITION_FAIR%>"/>
            <html:hidden property="<%=TextbookEditLoanPolicyForm.FIELD_CONDITION_POOR%>"/>
        </logic:equal>
        
    </logic:equal>
    <%if( form.getCollectionType() == CollectionType.ASSET ) {%>
                        <base:messageBox showRedBorder="true">
                            <tr valign="middle">
                                <td class="ColRowBold" align="center"><%=MessageHelper.formatMessage("textbookeditloanpolicy_ForTextbookResourcesOnly")%>
                                </td>
                            </tr>
                        </base:messageBox>                    
                    <%} %>      

    <base:outlinedTable id="<%=TextbookEditLoanPolicyForm.TABLE_MAIN %>" >
       <tr><td>
            <%
              if( (form.getConfigModeID().equals(TextbookEditLoanPolicyForm.CONFIG_MODE_SHOW_ALL)) ||
              (form.getConfigModeID().equals(TextbookEditLoanPolicyForm.CONFIG_MODE_SHOW_CIRCULATION)) ) {
            %>
                <%if (form.isDistrictMode()) {%>
                    <table id="circulationHeaderTable" width="100%">
                    <tr>
                        <td class="TableHeading">Textbook Circulation...</td>
                    </tr>
                    </table>
                    <HR>
                <%}%>
            <table id="<%=TextbookEditLoanPolicyForm.TABLE_MAX_CHECKOUTS%>">
                <%if (!form.isDistrictMode()){%>
                <tr>
                    <td colspan="2" class="ColRowBold">Circulation</td>
                </tr>
                <%}%>
                <tr>
                    <td width="60">&nbsp;</td>
                    <td class="ColRowBold">Max&nbsp;Checkouts
                    <html:text property="<%=TextbookEditLoanPolicyForm.FIELD_MAX_CHECKOUTS%>" size="6" maxlength="3"/>
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight">
                      <html:checkbox property="<%=TextbookEditLoanPolicyForm.FIELD_OVERDUE_TO_LOST_ENABLED%>"></html:checkbox>
                    </td>
                    <td class="ColRowBold">
                         Overdue&nbsp;to&nbsp;Lost
                        <html:text property="<%=TextbookEditLoanPolicyForm.FIELD_OVERDUE_TO_LOST_DAYS%>" size="3" maxlength="3"/>
                        days
                        <base:helpTag helpFileName="d_overrdue_lost.htm"/>
                    </td>
                </tr>
                <tr>
                    <td class="tdAlignRight"><html:checkbox property="<%=TextbookEditLoanPolicyForm.FIELD_BLOCK_ON_FINES_AND_OVERDUES%>"></html:checkbox></td>
                    <td>
                        <span class="ColRowBold">Block checkouts and renewals if the patron has fines or overdue textbooks</span>
                        <span class="ColRow"> (override available)</span>
                    </td>
                </tr>
            </table>
            <logic:equal name="<%=TextbookEditLoanPolicyForm.FORM_NAME%>"
                         property="<%=TextbookEditLoanPolicyForm.PARAM_DISTRICT_MODE%>" value="false">
                <HR>
            </logic:equal>
            <%
            }
            %>
            
            <%
              if( (form.getConfigModeID().equals(TextbookEditLoanPolicyForm.CONFIG_MODE_SHOW_ALL)) ||
              (form.getConfigModeID().equals(TextbookEditLoanPolicyForm.CONFIG_MODE_SHOW_CONDITIONING)) ) {
            %>
                <%if (form.isDistrictMode()) {%>
                    <table id="circulationHeaderTable" width="100%">
                    <tr>
                        <td class="TableHeading">Textbook Conditioning...</td>
                    </tr>
                    </table>
                    <HR>
                <%}%>
            <table id="<%=TextbookEditLoanPolicyForm.TABLE_AUTO_CONDITION%>">
                <%if(!form.isDistrictMode()) { %>
                    <tr><td colspan="3" class="ColRowBold">Conditioning</td></tr>
                <%}%>
                <tr>
                    <td width="40">&nbsp;</td>
                    <td class="ColRowBold" valign="top">
                      <html:checkbox property="<%=TextbookEditLoanPolicyForm.FIELD_AUTO_CONDITION%>"
                                     onclick="form.submit()"/>
                    </td>
                    <td class="ColRowBold">Automatically demote the condition of textbooks based on the number of times they are circulated
                    </td>
                </tr>
                <tr>
                    <td colspan="2">&nbsp;</td>
                    <td>
                       <table id="<%=TextbookEditLoanPolicyForm.TABLE_CONDITIONS%>">
                          <tr>
                              <td class="SmallColHeading tdAlignRight">Condition</td>
                              <td class="SmallColHeading">Value</td>
                              <td class="SmallColHeading">
                                  <logic:equal name="<%= TextbookEditLoanPolicyForm.FORM_NAME%>" property="<%=TextbookEditLoanPolicyForm.FIELD_AUTO_CONDITION%>" value="true">
                                      Demoted After...
                                  </logic:equal>&nbsp;
                              </td>
                          </tr>
                          <tr>
                              <td class="ColRowBold tdAlignRight">New</td>
                              <td class="ColRow tdAlignRight"><%=ConfigSiteSpecs.TEXTBOOK_CONDITION_PRICE_NEW_DISPLAYABLE%></td>
                              <td class="ColRow">
                                  <logic:equal name="<%= TextbookEditLoanPolicyForm.FORM_NAME%>" property="<%=TextbookEditLoanPolicyForm.FIELD_AUTO_CONDITION%>" value="true">
                                      <html:text property="<%=TextbookEditLoanPolicyForm.FIELD_CONDITION_NEW%>" size="3" maxlength="2"/>&nbsp;circulations
                                  </logic:equal>&nbsp;
                              </td>
                          </tr>
                          <tr>
                              <td class="ColRowBold tdAlignRight">Good</td>
                              <td class="ColRow tdAlignRight"><%=ConfigSiteSpecs.TEXTBOOK_CONDITION_PRICE_GOOD_DISPLAYABLE%></td>
                              <td class="ColRow">
                                  <logic:equal name="<%= TextbookEditLoanPolicyForm.FORM_NAME%>" property="<%=TextbookEditLoanPolicyForm.FIELD_AUTO_CONDITION%>" value="true">
                                      <html:text property="<%=TextbookEditLoanPolicyForm.FIELD_CONDITION_GOOD%>" size="3" maxlength="2"/>&nbsp;circulations
                                  </logic:equal>&nbsp;
                              </td>
                          </tr>
                          <tr>
                              <td class="ColRowBold tdAlignRight">Fair</td>
                              <td class="ColRow tdAlignRight"><%=ConfigSiteSpecs.TEXTBOOK_CONDITION_PRICE_FAIR_DISPLAYABLE%></td>
                              <td class="ColRow">
                                  <logic:equal name="<%= TextbookEditLoanPolicyForm.FORM_NAME%>" property="<%=TextbookEditLoanPolicyForm.FIELD_AUTO_CONDITION%>" value="true">
                                      <html:text property="<%=TextbookEditLoanPolicyForm.FIELD_CONDITION_FAIR%>" size="3" maxlength="2"/>&nbsp;circulations
                                  </logic:equal>&nbsp;
                              </td>
                          </tr>
                          <tr>
                              <td class="ColRowBold tdAlignRight">Poor</td>
                              <td class="ColRow tdAlignRight"><%=ConfigSiteSpecs.TEXTBOOK_CONDITION_PRICE_POOR_DISPLAYABLE%></td>
                              <td class="ColRow">
                                  <logic:equal name="<%= TextbookEditLoanPolicyForm.FORM_NAME%>" property="<%=TextbookEditLoanPolicyForm.FIELD_AUTO_CONDITION%>" value="true">
                                      <html:text property="<%=TextbookEditLoanPolicyForm.FIELD_CONDITION_POOR%>" size="3" maxlength="2"/>&nbsp;circulations
                                  </logic:equal>&nbsp;
                              </td>
                          </tr>
                          <tr>
                              <td class="ColRowBold tdAlignRight">Unusable</td>
                              <td class="ColRow tdAlignRight"><%=ConfigSiteSpecs.TEXTBOOK_CONDITION_PRICE_UNUSABLE_DISPLAYABLE%></td>
                              <td class="ColRow">&nbsp;</td>
                          </tr>
                       </table>
                    </td>
                </tr>
            </table>
            <%}%>
            
        </td></tr>
        <logic:equal name="<%=TextbookEditLoanPolicyForm.FORM_NAME%>"
                     property="<%=TextbookEditLoanPolicyForm.PARAM_DISTRICT_MODE%>" value="true">
            <tr><td>
                    <base:imageLine height="1" width="100%"/>
            </td></tr>
            <tr><td align="center" class="ColRow">
            These settings will only be applied to new sites.*
            </td></tr>    
        </logic:equal>    
        <tr><td align="center" class="ColRowBold">
           <base:showHideTag id="onSave">
               <base:saveButton onclick="hideElementonSave()" name="<%= TextbookEditLoanPolicyForm.BUTTON_NAME_SAVE %>"/>
               &nbsp;
               <base:cancelButton />
           </base:showHideTag>
        </td></tr>
        <logic:equal name="<%=TextbookEditLoanPolicyForm.FORM_NAME%>"
                     property="<%=TextbookEditLoanPolicyForm.PARAM_DISTRICT_MODE%>" value="true">
            <tr>
                <td>
                    <base:imageLine height="1" width="100%"/>
                </td>
            </tr>
            <tr>
                <td class="Instruction" align="center">
                    *Apply these settings at
                        <base:selectSiteAndSiteType 
                            name="<%= TextbookEditLoanPolicyForm.FIELD_SITE_LIMITER%>" 
                            selectedSiteID="<%=form.getSiteLimiter()%>"
                            includeForLibrarySites="false"
                            includeForTextbookSites="<%=form.checkForTextbooks() %>"
                            includeForAssetSites="<%=form.checkForAssets() %>"
                            includeDistrictWarehouse="false"
                        />
                    <base:genericButton src="/buttons/small/push.gif" alt="<%= TextbookEditLoanPolicyForm.ALT_BUTTON_PUSH %>" 
                        name="<%= TextbookEditLoanPolicyForm.BUTTON_NAME_PUSH %>" />
                </td>
            </tr>
            <tr>
                <td class="Instruction" align="center">
                    <b>Note: </b>Pushing configuration options does not save 
                            them as the defaults for new sites.
                    
                </td>
            </tr>
        </logic:equal>
    </base:outlinedTable>
</base:form>

