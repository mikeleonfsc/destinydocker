<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.*"%>
<%@ page import="com.follett.fsc.destiny.session.common.lookup.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.session.district.ejb.ConfigDistrictFacadeSpecs" %>
<%@ page import="com.follett.fsc.common.StringStringLookup"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb.*"%>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CircPolicySpecs"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>

<bean:define id="periodTypes" name="<%=CircTypeForm.FORM_NAME%>" property="periodTypes"/>
<bean:define id="gracePeriodOptions" name="<%=CircTypeForm.FORM_NAME%>" property="gracePeriodOptions"/>
<bean:define id="form" name="backoffice_servlet_CircTypeForm" type="com.follett.fsc.destiny.client.backoffice.servlet.CircTypeForm"/>

<base:messageBox strutsErrors="true"/>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
%>
<base:form action="/backoffice/servlet/handlecirctypeform.do" focus="circTypeDescription">

    <html:hidden property="circTypeID" />
    <html:hidden property="wasDefaultCircType"/>
    <html:hidden property="originalCircTypeDescription"/>
    <logic:equal name="<%=CircTypeForm.FORM_NAME%>" property="<%=CircTypeForm.PARAM_DISTRICT_MODE%>" value="true">
      <html:hidden property="<%=CircTypeForm.PARAM_DISTRICT_MODE%>"/>
    </logic:equal>
    <input type="hidden" name="<%=CircTypeForm.BUTTON_CHANGE_SUBMIT%>" value=""/>
  <table align="center" width="95%"><tr><td>
    <base:outlinedTable borderColor='#C0C0C0'>
        <tr><td>
            <table id="circtypeinfo" border="0" cellspacing="2" cellpadding="2">
                <tr>
                    <td class="ColHeading tdAlignRight"><%= MessageHelper.formatMessage("circtype_CirculationType") %></td>
                    <td  class="ColRow" nowrap>
                        <html:text property="<%=CircTypeForm.FIELD_DESCRIPTION%>" size="28" maxlength="30"/>
                        <base:helpTag helpFileName="d_circulation_type.htm"/>
                    </td>
                    <td colspan="3">
                    <base:genericButton src="/buttons/large/callnumber.gif" name="<%=CircTypeForm.BUTTON_UPDATE_CALLNUMBER %>" alt='<%= MessageHelper.formatMessage("updatePatterns") %>'/>
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td colspan="4" nowrap>
                        <logic:equal name="backoffice_servlet_CircTypeForm" property="wasDefaultCircType" value="true" scope="request" >
                            <html:hidden property="<%=CircTypeForm.FIELD_IS_DEFAULT%>" value="true"/>
                            <base:image src="/icons/general/check_19.gif" width="19" height="16" alt='<%= MessageHelper.formatMessage("circtype_DefaultCirculationType") %>'/>
                            <span class="ColRow">
                            <%= MessageHelper.formatMessage("circtype_DefaultCirculationType") %>
                            <base:helpTag helpFileName="d_default_circulation_type.htm"/>
                            </span>
                        </logic:equal>

                        <logic:equal name="backoffice_servlet_CircTypeForm" property="wasDefaultCircType" value="false" scope="request" >
                            <html:checkbox property="<%=CircTypeForm.FIELD_IS_DEFAULT%>"><span
                                class="ColRow"><%= MessageHelper.formatMessage("circtype_MakeThisTheDefault") %>
                            <base:helpTag helpFileName="d_default_circulation_type.htm"/>
                            </span>
                            </html:checkbox>
                        </logic:equal>
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td colspan="4"nowrap>
                    <%
                    BooleanStringValue bsValue = new BooleanStringValue(true,"");
                    if (!form.isDistMode() && form.getCircTypeID()!=null) {
	                    bsValue = ConfigDistrictFacadeSpecs.canDoLengthyTask(ConfigDistrictFacadeSpecs.LENGTHY_TASK_MODIFY_HIDDEN);
	                }
                    %>
                     <span class="ColRow">
                        <html:checkbox disabled="<%=!bsValue.isBoolValue()%>" property="<%=CircTypeForm.FIELD_IS_HIDDEN%>"/><%= MessageHelper.formatMessage("circtype_Hidden") %>
                        <base:helpTag helpFileName="d_hidden_materials.htm"/>
                     </span>
                    <% if ( !bsValue.isBoolValue() ) { %>
                     <html:hidden property="<%=CircTypeForm.FIELD_IS_HIDDEN%>"/>
                     <span class="Instruction">
                        <%=bsValue.getMessage()%>
                     </span>
                    <% } %>
                    </td>
                </tr>

                <tr>
                    <td class="ColHeading" colspan="5" nowrap><%= MessageHelper.formatMessage("circtype_DefaultSettings") %><base:helpTag helpFileName="d_default_settings.htm"/>
                    </td>
                </tr>
                <tr>
                    <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("circtype_LoanPeriod") %>&nbsp;</td>
                    <td class="ColRow" nowrap>
                        <% if (!form.getDefaultPeriodType().equals( "" + CircPolicySpecs.PERIOD_TYPE_FIXED)) {%>
                            <html:text property="<%=CircTypeForm.FIELD_DEFAULT_LOAN_PERIOD%>" size="4" maxlength="3"/> 
                        <% } else { %>
                            <html:hidden property="<%=CircTypeForm.FIELD_DEFAULT_LOAN_PERIOD%>"/>
                        <% } %>
                        <html:select property="<%=CircTypeForm.FIELD_DEFAULT_PERIOD_TYPE%>" onchange="submitDropDown(0)">
                            <html:options collection="periodTypes" property="stringCode"
                                          labelProperty="stringDesc"/>
                         </html:select> 
                        <base:helpTag helpFileName="d_loan_period_LM.htm"/>
                    </td>
                    <td class="SmallColHeading tdAlignRight" colspan="1">&nbsp;</td>
                    <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("circtype_FineIncrement") %>&nbsp;</td>
                    <td class="ColRow" nowrap>
                        <html:text property="<%=CircTypeForm.FIELD_DEFAULT_FINE_INCR%>" size="11" maxlength="11"/> <%= MessageHelper.formatMessage("circtype_PerDay") %>
                        <base:helpTag helpFileName="d_fine_increment.htm"/>
                    </td>
                </tr>
                <tr>
                    <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("circtype_GracePeriod") %>&nbsp;</td>
                    <td class="ColRow" nowrap>
                        <% if ( form.getDefaultPeriodType().equals(String.valueOf(CircPolicySpecs.PERIOD_TYPE_HOURLY))) {%>
                             <html:select property="<%=CircTypeForm.FIELD_DEFAULT_GRACE_PERIOD%>">
                                <html:options collection="gracePeriodOptions" property="stringCode"
                                              labelProperty="stringDesc"/>
                             </html:select>
                        <% } else { %> 
                             <html:text property="<%=CircTypeForm.FIELD_DEFAULT_GRACE_PERIOD%>" size="3" maxlength="3"/> <%= MessageHelper.formatMessage("circtype_Days") %>
                        <% } %>
                        
                        <base:helpTag helpFileName="d_grace_period.htm"/>
                    </td>
                    <td class="SmallColHeading tdAlignRight" colspan="1">&nbsp;</td>
                    <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("circtype_MaxFine") %>&nbsp;</td>
                    <td class="ColRow" nowrap>
                        <html:text property="<%=CircTypeForm.FIELD_DEFAULT_MAX_FINE%>" size="12" maxlength="17"/>
                        <base:helpTag helpFileName="d_max_fine.htm"/>
                    </td>
                </tr>

                <tr>
                    <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("circtype_Renewable") %>&nbsp;</td>
                    <td class="ColRow" nowrap>
                        <% if (!form.getDefaultPeriodType().equals( "" + CircPolicySpecs.PERIOD_TYPE_FIXED)) {%>
                            <html:text property="<%=CircTypeForm.FIELD_DEFAULT_MAX_RENEWALS%>" size="3" maxlength="3"/> <%= MessageHelper.formatMessage("circtype_Times") %>
                        <% } else { %>
                            <input type="hidden" name="<%=CircTypeForm.FIELD_DEFAULT_MAX_RENEWALS%>" value="0"><%= MessageHelper.formatMessage("circtype_0Times") %>
                        <% } %>
                        <base:helpTag helpFileName="d_renewable.htm"/>
                    </td>
                    <td class="SmallColHeading tdAlignRight" colspan="1">&nbsp;</td>
                    <td class="SmallColHeading tdAlignRight" nowrap>
                    	<html:checkbox property="<%=CircTypeForm.FIELD_ENABLE_OVERDUE_TO_LOST%>"/><%= MessageHelper.formatMessage("circtype_OverdueToLost") %></td>
                    <td class="ColRow">
                    	<html:text property="<%= CircTypeForm.FIELD_OVERDUE_TO_LOST_DAYS %>" size="3" maxlength="3"/> <%= MessageHelper.formatMessage("circtype_Days") %>
                    	<base:helpTag helpFileName="d_overrdue_lost.htm"/>
					</td>
                </tr>

                <tr>
                    <td colspan="5">
                        &nbsp;
                    </td>
                </tr>

                <bean:define id="form" name="backoffice_servlet_CircTypeForm" type="com.follett.fsc.destiny.client.backoffice.servlet.CircTypeForm"/>

            </table>
        </td></tr>

        <tr><td>
            <table id="circtypepolicyinfo" border="0" cellspacing="0" cellpadding="2" width="100%">
                <tr>
                    <td class="BreadcrumbBold"><%= MessageHelper.formatMessage("circtype_PatronType") %></td>
                    <td class="BreadcrumbBold"><%= MessageHelper.formatMessage("circtype_CheckoutLimit") %></td>
                    <td class="BreadcrumbBold"><%= MessageHelper.formatMessage("circtype_LoanPeriod") %></td>
                    <td class="BreadcrumbBold"><%= MessageHelper.formatMessage("circtype_GracePeriod") %></td>
                    <td class="BreadcrumbBold"><%= MessageHelper.formatMessage("circtype_Renewable") %></td>
                    <td class="BreadcrumbBold"><%= MessageHelper.formatMessage("circtype_FineIncrement") %></td>
                    <td class="BreadcrumbBold"><%= MessageHelper.formatMessage("circtype_MaxFine") %></td>
                </tr>

                <%
                List circPolicyList = form.getCircPolicyList();
                int size = circPolicyList.size();

                for ( int x = 0; x < size; x++ ) {
                    CircPolicyClientVO circPolicyClientVO = ( CircPolicyClientVO ) circPolicyList.get( x );
                    if ( ( x & 1 ) == 0 ) {
                        out.println("<tr bgcolor=\"#E8E8E8\">");
                    }
                    else {
                        out.println("<tr>");
                    }
                %>
                    <td class="ColRow">
                    <%=ResponseUtils.filter(circPolicyClientVO.getPatronTypeDescription())%>
                    </td>


                    <%
                        Long patronTypeID = circPolicyClientVO.getPatronTypeID();
                        String loanPeriodValue = form.getPTLoanPeriod(patronTypeID);
                        String periodTypeValue = form.getPTPeriodType(patronTypeID);
                        String gracePeriodValue = form.getPTGracePeriod(patronTypeID);
                        String fineIncrementValue = form.getPTFineIncrement(patronTypeID);
                        String maximumFineValue = form.getPTMaximumFine(patronTypeID);
                        String maxRenewableValue = form.getPTMaxRenewals(patronTypeID);
                        String checkoutLimit = form.getPTCheckoutLimit(patronTypeID);
                        boolean includeFixed = (circPolicyClientVO.getFixedDueDate() != null || circPolicyClientVO.getPeriodType() == CircPolicySpecs.PERIOD_TYPE_FIXED);
                    %>
                    <td class="ColRow" nowrap>
                        <input type="text" name="<%=CircTypeForm.FIELD_CHECKOUT_LIMIT_PREFIX + patronTypeID.toString()%>"
                               size="2" maxlength="3"
                               value="<%=checkoutLimit%>">
                    </td>
                    <td class="ColRow" nowrap>
                    <% if ( !periodTypeValue.equals(""+CircPolicySpecs.PERIOD_TYPE_FIXED)) {%>
                        <input type="text" name="<%=CircTypeForm.FIELD_LOAN_PERIOD_PREFIX + patronTypeID.toString()%>"
                               size="2" maxlength="3"
                               value="<%=loanPeriodValue%>">                    
                    <% } else { %>
                        <input type="hidden" name="<%=CircTypeForm.FIELD_LOAN_PERIOD_PREFIX + patronTypeID.toString()%>"
                               value="<%=loanPeriodValue%>">                    
                    <% } %>
                    <select name="<%=CircTypeForm.FIELD_PERIOD_TYPE_PREFIX + patronTypeID.toString()%>" onchange="submitDropDown(<%=patronTypeID.toString()%>)"><%
                        List options = form.getPeriodTypesForPatron(includeFixed);
                         
                        for (int j = 0; j < options.size(); j++) {
                            StringStringLookup selectedOption = (StringStringLookup) options.get(j);
                            String selected = "";
                            
                            if ( selectedOption.getStringCode().equals(periodTypeValue)) {
                                %><option value="<%=Long.parseLong(selectedOption.getStringCode())%>" selected="true"><%=selectedOption.getStringDesc()%></option><%
                            } else {
                                %><option value="<%=Long.parseLong(selectedOption.getStringCode())%>"><%=selectedOption.getStringDesc()%></option><%
                            }
                        }
                        %>
                    </select>
                    </td>
                    <td class="ColRow" nowrap>
                        <% if(periodTypeValue.equals(""+CircPolicySpecs.PERIOD_TYPE_HOURLY)) {%>
                            <select name="<%=CircTypeForm.FIELD_GRACE_PERIOD_PREFIX + patronTypeID.toString()%>"><%
                                options = form.getGracePeriodOptions();
                                
                                for (int j = 0; j < options.size(); j++) {
                                    StringStringLookup selectedOption = (StringStringLookup) options.get(j);
                                    String selected = "";
                                    
                                    if ( selectedOption.getStringCode().equals(gracePeriodValue)) {
                                        %><option value="<%=Long.parseLong(selectedOption.getStringCode())%>" selected="true"><%=selectedOption.getStringDesc()%></option><%
                                    } else {
                                        %><option value="<%=Long.parseLong(selectedOption.getStringCode())%>"><%=selectedOption.getStringDesc()%></option><%
                                    }
                                }%>
                            </select>
                        <% } else { %>
                            <input type="text" name="<%=CircTypeForm.FIELD_GRACE_PERIOD_PREFIX + patronTypeID.toString()%>"
                                   size="2" maxlength="3"
                                   value="<%=gracePeriodValue%>"><nobr><%= MessageHelper.formatMessage("circtype_Days") %></nobr>
                        <% } %>
                    </td>

                    <td class="ColRow" nowrap>
                    <% if ( periodTypeValue.equals(""+CircPolicySpecs.PERIOD_TYPE_FIXED)) { %>
                        0<input type="hidden" name="<%=CircTypeForm.FIELD_MAX_RENEWALS_PREFIX + patronTypeID.toString()%>"
                               value="0">
                    <% } else { %>
                        <input type="text" name="<%=CircTypeForm.FIELD_MAX_RENEWALS_PREFIX + patronTypeID.toString()%>"
                               size="2" maxlength="3"
                               value="<%=maxRenewableValue%>"><nobr><%= MessageHelper.formatMessage("circtype_Times") %></nobr>
                    <% } %>
                    </td>

                    <td class="ColRow" nowrap>
                    <input type="text" name="<%=CircTypeForm.FIELD_FINE_INCREMENT_PREFIX + patronTypeID%>"
                           size="11" maxlength="20"
                           value="<%=fineIncrementValue%>"><nobr><%= MessageHelper.formatMessage("circtype_Daily") %></nobr>
                    </td>
                    <td class="ColRow" nowrap>
                    <input type="text" name="<%=CircTypeForm.FIELD_MAX_FINE_PREFIX + patronTypeID.toString()%>"
                           size="12" maxlength="20"
                           value="<%=maximumFineValue%>">
                    </td>
                </tr>

                <%} %>


                <tr>
                    <td align="center" class="ColRowBold" colspan="6">
                        <base:showHideTag id="onSave">
                            <base:saveButton onclick="hideElementonSave()"/>
                            <base:cancelButton/>
                        </base:showHideTag>
                    </td>
                </tr>
            </table>
        </td>
    </tr>

      </base:outlinedTable>
      </td></tr></table>
</base:form>

<script language="JavaScript" type="text/javascript">
  <!--

    function submitDropDown(patronTypeID) {
            document.<%=CircTypeForm.FORM_NAME%>.<%=CircTypeForm.BUTTON_CHANGE_SUBMIT%>.value = patronTypeID;
            document.<%=CircTypeForm.FORM_NAME%>.submit();
    }
  // -->
</script>
