<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@ page import="com.follett.fsc.common.StringStringLookup"%>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.CircPolicyWithDescriptionsValue"%>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb.*"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CircPolicySpecs"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CircPolicyVO"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>


<bean:define id="form" name="<%=EditPatronTypeForm.FORM_NAME%>" type="com.follett.fsc.destiny.client.backoffice.servlet.EditPatronTypeForm"/>
<bean:define id="prioritiesID" name="<%= EditPatronTypeForm.FORM_NAME %>" property="prioritiesCollection"/>
<bean:define id="sifTypes" name="<%= EditPatronTypeForm.FORM_NAME %>" property="sifTypeList"/>
<bean:define id="periodTypes" name="<%=EditPatronTypeForm.FORM_NAME%>" property="periodTypes"/>
<bean:define id="gracePeriodOptions" name="<%=EditPatronTypeForm.FORM_NAME%>" property="gracePeriodOptions"/>

<base:messageBox strutsErrors="true"/>
<%    
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request); 
%>


<base:form action="/backoffice/servlet/handleeditpatrontypeform.do" focus="patronTypeDescription">

    <html:hidden property="<%=EditPatronTypeForm.PARAMETER_PATRON_TYPE_ID%>"/>
    <html:hidden property="<%=EditPatronTypeForm.PARAMETER_WAS_DEFAULT_PATRON_TYPE%>"/>
    <html:hidden property="<%=EditPatronTypeForm.PARAMETER_ORIGINAL_PATRON_TYPE_DESC%>"/>
    <html:hidden property="<%=GenericForm.PARAM_COLLECTION_TYPE%>"/>
    <logic:equal name="<%=EditPatronTypeForm.FORM_NAME%>" property="<%=EditPatronTypeForm.PARAM_DISTRICT_MODE%>" value="true">
      <html:hidden property="<%=EditPatronTypeForm.PARAM_DISTRICT_MODE%>"/>
    </logic:equal>
    
    <input type="hidden" name="<%=EditPatronTypeForm.BUTTON_CHANGE_SUBMIT%>" value=""/>

    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">
   <table align="center" border="0" width="95%" cellpadding="0" cellspacing="0"><tr><td>
    <base:outlinedTable borderColor='#C0C0C0'>
        <tr><td>
            <table id="patrontypeinfo" border="0" cellspacing="5" cellpadding="0">
                <tr>
                    <td valign="middle" class="ColHeading tdAlignRight"><%= MessageHelper.formatMessage("editpatrontype_PatronType") %></td>
                    <td valign="middle" colspan="2" class="ColRow">
                        <nobr>
                        <html:text property="patronTypeDescription" size="30" maxlength="30"/>
                        <base:helpTag helpFileName="d_patron_type.htm"/>
                        </nobr>
                    </td>
                    <td valign="middle" colspan="2" class="ColHeading">
                        <% if (store.allowSIF()) { %>
                            <nobr>
                                SIF
                                <html:select property="<%= EditPatronTypeForm.FIELD_SIF_TYPE %>">
                                    <html:options collection="sifTypes" property="longID"
                                               labelProperty="stringDesc"/>
                                </html:select>
                            </nobr>
                        <% } else { %>
                            <html:hidden property="<%= EditPatronTypeForm.FIELD_SIF_TYPE %>"/>
                        <%}%>
                    </td>

                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td colspan="4" class="ColRow">
                        <logic:equal name="<%=EditPatronTypeForm.FORM_NAME%>" property="<%=EditPatronTypeForm.PARAMETER_WAS_DEFAULT_PATRON_TYPE%>" value="true">
                            <nobr>
                            <html:hidden property="<%=EditPatronTypeForm.FIELD_IS_DEFAULT_PATRON_TYPE%>" value="true"/>
                            <base:image src="/icons/general/check_19.gif" width="19" height="16" alt='<%= MessageHelper.formatMessage("editpatrontype_DefaultPatronType") %>'/>
                            <%= MessageHelper.formatMessage("editpatrontype_DefaultPatronType") %>
                            <base:helpTag helpFileName="d_default_patron_type.htm"/>
                            </nobr>
                        </logic:equal>

                        <logic:equal name="<%=EditPatronTypeForm.FORM_NAME%>" property="<%=EditPatronTypeForm.PARAMETER_WAS_DEFAULT_PATRON_TYPE%>" value="false">
                            <nobr>
                            <html:checkbox property="<%=EditPatronTypeForm.FIELD_IS_DEFAULT_PATRON_TYPE%>">&nbsp;<%= MessageHelper.formatMessage("editpatrontype_MakeThisTheDefault") %></html:checkbox>
                            <base:helpTag helpFileName="d_default_patron_type.htm"/>
                            </nobr>
                        </logic:equal>
                    </td>
                </tr>
                <% if (form.getCollectionType()==BibMasterSpecs.COLLECTION_TYPE_LIBRARY) { %>
                    <tr>
                        <td class="ColHeading tdAlignRight"><%= MessageHelper.formatMessage("editpatrontype_MaxCheckouts") %></td>
                        <td class="ColRow"><html:text property="<%=EditPatronTypeForm.FIELD_MAX_CHECKOUTS%>" size="4" maxlength="3"/>
                            &nbsp;
                            <base:helpTag helpFileName="d_max_checkouts.htm"/>
                        </td>
                        <td class="ColHeading tdAlignRight"><base:imageSpacer width="1" height="5"/></td>
                        
                        <td class="ColHeading tdAlignRight"><%= MessageHelper.formatMessage("editpatrontype_MaxHolds") %></td>
                        <td class="ColRow"><html:text property="<%=EditPatronTypeForm.FIELD_MAX_HOLDS%>" size="4" maxlength="3"/></td>
                    </tr>
                    <tr>
                        <td class="ColHeading tdAlignRight"><%= MessageHelper.formatMessage("editpatrontype_FixedDate") %></td>
                        <td class="ColRow">
                            <base:date 
                            	buttonName = "<%=EditPatronTypeForm.BUTTON_CHANGE_FIXED_DATE%>"
    							fieldName = "<%=EditPatronTypeForm.FIELD_FIXED_DUE_DATE%>"
    							dateValue="<%=form.getFixedDueDate()%>"
    							altText = '<%= MessageHelper.formatMessage("editpatrontype_ChangeFixedDate") %>'
							/>
                            <base:helpTag helpFileName="d_fixed_date.htm"/>
                        </td>

                        <td class="ColHeading tdAlignRight"><base:imageSpacer width="5" height="1"/></td>
                        
                        <td class="ColHeading tdAlignRight"><%= MessageHelper.formatMessage("editpatrontype_ReadyHoldsExpireIn") %></td>
                        <td class="ColRow"><html:text property="<%=EditPatronTypeForm.FIELD_READY_EXPIRATION%>" size="4" maxlength="3"/>
                            <nobr>
                            <%= MessageHelper.formatMessage("editpatrontype_days") %>
                            <base:helpTag helpFileName="d_ready_hold_expiration.htm"/>
                            </nobr>
                        </td>
                    </tr>
                    <tr>
                        <td class="ColHeading tdAlignRight"><%= MessageHelper.formatMessage("editpatrontype_CeilingDate") %></td>
                        <td class="ColRow">
                            <base:date 
                            	buttonName = "<%=EditPatronTypeForm.BUTTON_CHANGE_CEILING_DATE%>"
    							fieldName = "<%=EditPatronTypeForm.FIELD_CEILING_DUE_DATE%>"
    							dateValue="<%=form.getCeilingDueDate()%>"
    							altText = '<%= MessageHelper.formatMessage("editpatrontype_ChangeCeilingDate") %>'
							/>
                            <base:helpTag helpFileName="d_ceiling_date.htm"/>
                        </td>

                        <td class="ColHeading tdAlignRight"><base:imageSpacer width="5" height="1"/></td>
                        
                        <td class="ColHeading tdAlignRight"><%= MessageHelper.formatMessage("editpatrontype_PendingHoldsExpireIn") %></td>
                        <td class="ColRow"><html:text property="<%=EditPatronTypeForm.FIELD_PENDING_EXPIRATION%>" size="4" maxlength="3"/>
                            <nobr>
                            <%= MessageHelper.formatMessage("editpatrontype_days") %>
                            <base:helpTag helpFileName="d_pending_hold_expiration.htm"/>
                            </nobr>
                        </td>
                    </tr>
                    <tr>
                        <td class="ColHeading tdAlignRight">&nbsp;</td>
                        <td class="ColRow">&nbsp;</td>
                        <td class="ColHeading tdAlignRight"><base:imageSpacer width="5" height="1"/></td>
                        <td class="ColHeading tdAlignRight"><%= MessageHelper.formatMessage("editpatrontype_DefaultHoldPriority") %></td>
                        <td class="ColRow">
                            <html:select property="<%=EditPatronTypeForm.FIELD_DEFAULT_PRIORITY%>">
                                <html:options collection="prioritiesID" property="longID"
                                              labelProperty="stringDesc"/>
                            </html:select>&nbsp;<base:helpTag helpFileName="d_hold_priority.htm"/>
                        </td>
                    </tr>
                    <tr>
                        <td valign="top" class="tdAlignRight" >
                            <html:checkbox property="<%=EditPatronTypeForm.FIELD_BLOCK_ON_FINES_OR_OVERDUES%>"></html:checkbox>
                        </td>
                        <td colspan="4">
                            <span class="ColHeading"><%= MessageHelper.formatMessage("editpatrontype_BlockCheckOutsAndRenewalsIfThePatronHasFinesOrOver") %></span>
                            <span class="ColRow">&nbsp;<%= MessageHelper.formatMessage("editpatrontype_OverrideAvailable") %></span>&nbsp;<base:helpTag helpFileName="d_block_transactions.htm"/>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="5">
                            &nbsp;
                        </td>
                    </tr>
                </table>
                <table id="circpolicies" width="100%" border="0" cellspacing="0" cellpadding="2">
                <tr>
                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("editpatrontype_CirculationType") %></td>
                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("editpatrontype_CheckoutLimit") %></td>
                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("editpatrontype_LoanPeriod") %></td>
                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("editpatrontype_GracePeriod") %></td>
                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("editpatrontype_Renewable") %></td>
                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("editpatrontype_FineIncrement") %></td>
                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("editpatrontype_MaxFine") %></td>
                </tr>

                <%
                if (form != null) {
                    Iterator iter = ObjectHelper.getIterator(form.getCpVOs());

                    boolean flipper = true;
                    while (iter.hasNext()) {
                        CircPolicyWithDescriptionsValue wrapperVO = (CircPolicyWithDescriptionsValue)iter.next();
                        CircPolicyVO cpVO = wrapperVO.getCircPolicyValue();
                        String circTypeID = cpVO.getCircTypeID().toString();
                        String periodType = ""+cpVO.getPeriodType();

                        if ( flipper ) {
                            out.println("<tr bgcolor=\"#E8E8E8\">");
                        }
                        else {
                            out.println("<tr>");
                        }
                        flipper = !flipper;

                %>
                            <td class="ColRow">
                                <%= ResponseUtils.filter(wrapperVO.getCircTypeDescription()) %>
                            </td>
                            <td class="ColRow" nowrap>
                                <input type="text" name="<%=EditPatronTypeForm.FIELD_CHECKOUT_LIMIT_PREFIX + circTypeID%>"
                                       size="2" maxlength="3"
                                       value="<%= form.getCircTypeValues().get(EditPatronTypeForm.FIELD_CHECKOUT_LIMIT_PREFIX + circTypeID) %>">
                            </td>
                            <td class="ColRow" nowrap>
                                <% if ( !(""+CircPolicySpecs.PERIOD_TYPE_FIXED).equals(periodType)) {%>
                                    <input type="text" name="<%=EditPatronTypeForm.FIELD_LOAN_PERIOD_PREFIX + circTypeID%>"
                                           size="2" maxlength="3"
                                       value="<%= form.getCircTypeValues().get(EditPatronTypeForm.FIELD_LOAN_PERIOD_PREFIX + circTypeID) %>">
                                <% } else { %>
                                    <input type="hidden" name="<%=EditPatronTypeForm.FIELD_LOAN_PERIOD_PREFIX + circTypeID%>"
                                       value="<%= form.getCircTypeValues().get(EditPatronTypeForm.FIELD_LOAN_PERIOD_PREFIX + circTypeID) %>">
                                <% } %>
                            
                                <select name="periodType_<%=circTypeID%>" onchange="submitDropDown(<%=circTypeID%>)"><%
                                    List options = form.getPeriodTypes();
                                     
                                    for (int j = 0; j < options.size(); j++) {
                                        StringStringLookup selectedOption = (StringStringLookup) options.get(j);
                                        String selected = "";
                                        
                                        if ( selectedOption.getStringCode().equals(periodType)) {
                                            %><option value="<%=Long.parseLong(selectedOption.getStringCode())%>" selected="true"><%=selectedOption.getStringDesc()%></option><%
                                        } else {
                                            %><option value="<%=Long.parseLong(selectedOption.getStringCode())%>"><%=selectedOption.getStringDesc()%></option><%
                                        }
                                    } %>
                                </select>
                            </td>
                            <td class="ColRow" nowrap>
                                <% if(!(""+CircPolicySpecs.PERIOD_TYPE_HOURLY).equals(periodType)) {%>
                                    <input type="text" name="<%=EditPatronTypeForm.FIELD_GRACE_PERIOD_PREFIX + circTypeID%>"
                                           size="2" maxlength="3"
                                           value="<%= form.getCircTypeValues().get(EditPatronTypeForm.FIELD_GRACE_PERIOD_PREFIX + circTypeID) %>">&nbsp;<nobr><%= MessageHelper.formatMessage("editpatrontype_days") %></nobr>
                                <% } else { %>
                                    <select name="<%=EditPatronTypeForm.FIELD_GRACE_PERIOD_PREFIX + circTypeID%>"><%
                                            options = form.getGracePeriodOptions();
                                        
                                        for (int j = 0; j < options.size(); j++) {
                                            StringStringLookup selectedOption = (StringStringLookup) options.get(j);
                                            String selected = "";
                                            
                                            if ( selectedOption.getStringCode().equals(""+cpVO.getGracePeriod())) {
                                                %><option value="<%=Long.parseLong(selectedOption.getStringCode())%>" selected="true"><%=selectedOption.getStringDesc()%></option><%
                                            } else {
                                                %><option value="<%=Long.parseLong(selectedOption.getStringCode())%>"><%=selectedOption.getStringDesc()%></option><%
                                            }
                                        } %>
                                    </select>
                                <% } %>
                            </td>
                            <td class="ColRow" nowrap>
                            <% if((""+CircPolicySpecs.PERIOD_TYPE_FIXED).equals(periodType)) {%>
                                <input type="hidden" name="<%=EditPatronTypeForm.FIELD_MAX_RENEWALS_PREFIX + circTypeID%>"
                                       value="0">
                                <nobr><%= MessageHelper.formatMessage("editpatrontype_0Times") %></nobr>
                            <% } else { %>
                                <input type="text" name="<%=EditPatronTypeForm.FIELD_MAX_RENEWALS_PREFIX + circTypeID%>"
                                       size="2" maxlength="3"
                                       value="<%= form.getCircTypeValues().get(EditPatronTypeForm.FIELD_MAX_RENEWALS_PREFIX + circTypeID) %>">
                                <nobr><%= MessageHelper.formatMessage("editpatrontype_Times") %></nobr>
                            <% } %>
                            </td>
                            
                            <td class="ColRow" nowrap>
                                <input type="text" name="<%=EditPatronTypeForm.FIELD_FINE_INCREMENT_PREFIX + circTypeID %>"
                                       size="11" maxlength="20"
                                       value="<%= form.getCircTypeValues().get(EditPatronTypeForm.FIELD_FINE_INCREMENT_PREFIX + circTypeID) %>"><nobr><%= MessageHelper.formatMessage("editpatrontype_daily") %></nobr>
                            </td>
                            <td class="ColRow" nowrap>
                                <input type="text" name="<%=EditPatronTypeForm.FIELD_MAX_FINE_PREFIX + circTypeID %>"
                                       size="12" maxlength="20"
                                       value="<%= form.getCircTypeValues().get(EditPatronTypeForm.FIELD_MAX_FINE_PREFIX + circTypeID) %>">
                            </td>
                        </tr>
                <%
                    }
                }
            }
            %>
            <% if (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK ||
            	form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_ASSET) { %>
                <html:hidden property="maxCheckouts"/>
                <html:hidden property="readyExpiration"/>
                <html:hidden property="maxHolds"/>
                <html:hidden property="pendingExpiration"/>
                <html:hidden property="ceilingDueDate"/>
                <html:hidden property="defaultPriority"/>
                <html:hidden property="blockOnFinesOrOverdues"/>
                <%
                if (form != null) {
                    Iterator iter = ObjectHelper.getIterator(form.getCpVOs());

                    while (iter.hasNext()) {
                        CircPolicyWithDescriptionsValue wrapperVO = (CircPolicyWithDescriptionsValue)iter.next();
                        CircPolicyVO cpVO = wrapperVO.getCircPolicyValue();
                        String circTypeID = cpVO.getCircTypeID().toString();
                        String periodType = ""+cpVO.getPeriodType();
        		%>
                        <input type="hidden" name="<%=EditPatronTypeForm.FIELD_LOAN_PERIOD_PREFIX + circTypeID%>"
                           value="<%= form.getCircTypeValues().get(EditPatronTypeForm.FIELD_LOAN_PERIOD_PREFIX + circTypeID) %>">
                        <input type="hidden" name="periodType_<%=circTypeID%>" value="<%= periodType %>">

                        <% if(!(""+CircPolicySpecs.PERIOD_TYPE_HOURLY).equals(periodType)) {%>
                            <input type="hidden" name="<%=EditPatronTypeForm.FIELD_GRACE_PERIOD_PREFIX + circTypeID%>"
                                   value="<%= form.getCircTypeValues().get(EditPatronTypeForm.FIELD_GRACE_PERIOD_PREFIX + circTypeID) %>">
                        <% } else { %>
                            <input type="hidden" name="<%=EditPatronTypeForm.FIELD_GRACE_PERIOD_PREFIX + circTypeID%>"
                                   value='<%= ""+cpVO.getGracePeriod() %>'>
                        <% } %>
                        <% if((""+CircPolicySpecs.PERIOD_TYPE_FIXED).equals(periodType)) {%>
                            <input type="hidden" name="<%=EditPatronTypeForm.FIELD_MAX_RENEWALS_PREFIX + circTypeID%>"
                                   value="0">
                        <% } else { %>
                            <input type="hidden" name="<%=EditPatronTypeForm.FIELD_MAX_RENEWALS_PREFIX + circTypeID%>"
                                   value="<%= form.getCircTypeValues().get(EditPatronTypeForm.FIELD_MAX_RENEWALS_PREFIX + circTypeID) %>">
                        <% } %>
                        <input type="hidden" name="<%=EditPatronTypeForm.FIELD_FINE_INCREMENT_PREFIX + circTypeID %>"
                               value="<%= form.getCircTypeValues().get(EditPatronTypeForm.FIELD_FINE_INCREMENT_PREFIX + circTypeID) %>">
                        <input type="hidden" name="<%=EditPatronTypeForm.FIELD_MAX_FINE_PREFIX + circTypeID %>"
                               value="<%= form.getCircTypeValues().get(EditPatronTypeForm.FIELD_MAX_FINE_PREFIX + circTypeID) %>">
                <%
                    }
                }
            }
            %>
            
            
            <% if (form.getCollectionType() != BibMasterSpecs.COLLECTION_TYPE_ASSET) { %>
                <tr>
                    <td align="center" class="ColRowBold" colspan="7">
                        <base:showHideTag id="onSave">
                            <base:saveButton onclick="hideElementonSave()" name="<%= EditPatronTypeForm.BUTTON_NAME_SAVE %>"/>
                            <base:cancelButton/>                        
                        </base:showHideTag>
                    </td>
                </tr>
            <% } %>
            </table>
        </td></tr>
        <% if (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_ASSET) { %>
            <tr>
                <td ><base:imageLine height="2" width="100%"/></td>
            </tr>
            <tr>
                <td width="100%">
                <table><tr> <th></th><th></th><th></th>
                 <td   width="30%" class="ColRowBold"> <%= MessageHelper.formatMessage("editpatrontype_CanCheckOut") %> </td>
                    <td width="40%" align="center" class="ColRowBold">   
                    <base:showHideTag id="onSave">
                        <base:saveButton onclick="hideElementonSave()" name="<%= EditPatronTypeForm.BUTTON_NAME_SAVE %>" />
                        <base:cancelButton name="<%= EditPatronTypeForm.BUTTON_NAME_CANCEL %>" />
                    </base:showHideTag>
                    </td><td width="30%" class="ColRowBold"></td></tr></table>
                </td>
            </tr>
			<tr>
				<td width="100%">
					<%form.outputList(out);%>
				</td>
			</tr>	
        	
            <tr>
                <td align="center" class="ColRowBold">
                    <base:showHideTag id="onSave">
                        <base:saveButton onclick="hideElementonSave()" name="<%= EditPatronTypeForm.BUTTON_NAME_SAVE %>" />
                        <base:cancelButton name="<%= EditPatronTypeForm.BUTTON_NAME_CANCEL %>" />
                    </base:showHideTag>
                </td>
            </tr>
        <% } %>
        
      </base:outlinedTable>
    </td></tr></table>
</base:form>

<script language="JavaScript" type="text/javascript">
  <!--

    function submitDropDown(circTypeID) {
            document.<%=EditPatronTypeForm.FORM_NAME%>.<%=EditPatronTypeForm.BUTTON_CHANGE_SUBMIT%>.value = circTypeID;
            document.<%=EditPatronTypeForm.FORM_NAME%>.submit();
    }
  // -->
</script>
