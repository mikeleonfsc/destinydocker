<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*" %>

<%@page import="com.follett.fsc.destiny.client.common.data.Tab"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<base:messageBox strutsErrors="true"/>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    ViewTextbookLoanPoliciesForm form = (ViewTextbookLoanPoliciesForm)request.getAttribute(ViewTextbookLoanPoliciesForm.FORM_NAME);
    String blockOnFinesOverdues = (form.isBlockOnFinesAndOverdues()) ? "Yes" : "No";
    String autoDemoteCondition = (form.isAutoCondition()) ? "Yes" : "No";
    
    Tab[] tabs = null;
    tabs = ViewTextbookLoanPeriodsForm.getTabs(form.getCollectionType(), form.isDistMode());
    
%>

<br>
    <%  // only put DISTRICT MODE on if we are in district mode, otherwise bad things happen
    if (form.isDistMode() ) { %>
        <center><span class="ColRowBold"><%= GenericForm.getLastBackupDisplayMsg(false) %></span></center><br>
        <jsp:include page="/common/msdewarning.jsp" flush="true" />
    <% } %>

    <%if( form.getCollectionType() == CollectionType.ASSET ) {%>
            <base:messageBox showRedBorder="true">
                <tr valign="middle">
                        <td class="ColRowBold" align="center"><%=MessageHelper.formatMessage("viewtextbookloanpolicies_ForTextbookResourcesOnly")%></td>
                </tr>
           </base:messageBox>                    
     <%} %>

<table align="center" border="0" width="95%" id="<%= ViewTextbookLoanPoliciesForm.TABLE_TEXTBOOK_POLICIES_TABS %>" cellpadding="0" cellspacing="0">
    <tr><td>
        <base:outlinedTableAndTabsWithinThere tabs="<%=tabs %>" selectedTab="<%=ViewTextbookLoanPeriodsForm.getLoanPolicyTab(form.getCollectionType()) %>" borderColor="#C0C0C0" id="<%= ViewTextbookLoanPoliciesForm.TABLE_MAIN %>" width="100%">
           <tr><td>
                <%if (form.isDistMode()) {%>
                <table id="tableHeaderTable" width="100%">
                    <tr>
                        <td class="TableHeading">Loan Policies...</td>
                    </tr>
                </table>
                <HR>
                <%}%>
                <table id="outerHeaderTable" width="100%">
                    <tr>
                        <td class="ColRowBold">Circulation
                            <%if( form.isDistMode() ) {%>
                                <base:link page="/backoffice/servlet/presenttextbookeditloanpolicyform.do?districtMode=true&configModeID=1" collectionType="<%=form.getCollectionType()%>">
                                     <img src='<%=UserContext.getMyContextLocaleHelper().getLocalizedImagePath("/icons/general/edit_40.gif")%>' border="0" width="40" height="16" alt="<%= ViewTextbookLoanPoliciesForm.LINK_EDIT_CIRCULATION_POLICIES %>" title="<%= ViewTextbookLoanPoliciesForm.LINK_EDIT_CIRCULATION_POLICIES %>">
                                 </base:link>
                            <%} %>
                        </td>
                        <%if( !form.isDistMode() ) {%>
                        <td class="tdAlignRight">
                            <base:link page="/backoffice/servlet/presenttextbookeditloanpolicyform.do" collectionType="<%=form.getCollectionType()%>">
                                <base:image src="/buttons/large/editpolicies.gif" alt="<%= ViewTextbookLoanPoliciesForm.LINK_EDIT_POLICIES %>"/>
                            </base:link>
                        </td>
                        <%}else { %>
                        <td>&nbsp;</td>
                        <%} %>
                    </tr>
                    <tr>
                        <td>
                        <table id="<%=ViewTextbookLoanPoliciesForm.TABLE_MAX_CHECKOUTS%>">
                            <tr>
                                <td width="60">&nbsp;</td>
                                <td class="ColRowBold tdAlignRight">Max&nbsp;Checkouts</td>
                                <td class="ColRow"><bean:write name="<%= form.FORM_NAME%>" property="<%=ViewTextbookLoanPoliciesForm.FIELD_MAX_CHECKOUTS%>"/></td>
                            </tr>
                                <td width="60">&nbsp;</td>
                                <td class="ColRowBold tdAlignRight">
                                Overdue&nbsp;to&nbsp;Lost</td>
                                <td class="ColRow">
                                	<%=form.getOverdueToLostDisplayable() %>
                            	</td>
                            <tr>
                            </tr>
                            <tr>
                                <td>&nbsp;</td>
                                <td class="ColRowBold tdAlignRight">Block&nbsp;on&nbsp;Fines/Overdues</td>
                                <td class="ColRow">
                                  <%=blockOnFinesOverdues%>
                                </td>
                            </tr>
                        </table>
                    </td><td>&nbsp;</td>
                </tr>
                </table>
                <HR>
                <table id="<%=ViewTextbookLoanPoliciesForm.TABLE_AUTO_CONDITION%>">
                    <tr><td colspan="3" class="ColRowBold">Conditioning
                          <%if( form.isDistMode() ) {%>
                                <base:link page="/backoffice/servlet/presenttextbookeditloanpolicyform.do?districtMode=true&configModeID=2" collectionType="<%=form.getCollectionType()%>">
                                 <img src='<%=UserContext.getMyContextLocaleHelper().getLocalizedImagePath("/icons/general/edit_40.gif")%>' border="0" width="40" height="16" alt="<%= ViewTextbookLoanPoliciesForm.LINK_EDIT_CONDITIONING_POLICIES %>" title="<%= ViewTextbookLoanPoliciesForm.LINK_EDIT_CONDITIONING_POLICIES %>">
                                 </base:link>
                           <%} %>
                        </td>
                    </tr>
                    <tr>
                        <td width="40">&nbsp;</td>
                        <td class="ColRowBold">Automatically&nbsp;Demote&nbsp;Condition</td>
                        <td class="ColRow tdAlignRight">
                          <%=autoDemoteCondition%>
                        </td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
	                  <td colspan="1">&nbsp;</td>
	                  <td colspan="2">
			          <table id="<%=TextbookEditLoanPolicyForm.TABLE_CONDITIONS%>">
					  <tr>
                          <td width="40">&nbsp;</td>
                          <td class="SmallColHeading tdAlignRight">Condition</td>
                          <td class="SmallColHeading">Value</td>
                          <td class="SmallColHeading">
                              <logic:equal name="<%= form.FORM_NAME%>" property="<%=ViewTextbookLoanPoliciesForm.FIELD_AUTO_CONDITION%>" value="true">
                                Demoted After...
                              </logic:equal>&nbsp;
                          </td>
                      </tr>
                      <tr>
                          <td width="40">&nbsp;</td>
                          <td class="ColRowBold tdAlignRight">New</td>
                          <td class="ColRow tdAlignRight">100%</td>
                          <td class="ColRow">
                              <logic:equal name="<%= form.FORM_NAME%>" property="<%=ViewTextbookLoanPoliciesForm.FIELD_AUTO_CONDITION%>" value="true">
                                  <bean:write name="<%=form.FORM_NAME%>" property="<%=ViewTextbookLoanPoliciesForm.FIELD_CONDITION_NEW%>"/>&nbsp;circulations
                              </logic:equal>&nbsp;
                          </td>
                      </tr>
                      <tr>
                          <td width="40">&nbsp;</td>
                          <td class="ColRowBold tdAlignRight">Good</td>
                          <td class="ColRow tdAlignRight">75%</td>
                          <td class="ColRow">
                              <logic:equal name="<%= form.FORM_NAME%>" property="<%=ViewTextbookLoanPoliciesForm.FIELD_AUTO_CONDITION%>" value="true">
                                  <bean:write name="<%=form.FORM_NAME%>" property="<%=ViewTextbookLoanPoliciesForm.FIELD_CONDITION_GOOD%>"/>&nbsp;circulations
                              </logic:equal>&nbsp;
                          </td>
                      </tr>
                      <tr>
                          <td width="40">&nbsp;</td>
                          <td class="ColRowBold tdAlignRight">Fair</td>
                          <td class="ColRow tdAlignRight">50%</td>
                          <td class="ColRow">
                              <logic:equal name="<%= form.FORM_NAME%>" property="<%=ViewTextbookLoanPoliciesForm.FIELD_AUTO_CONDITION%>" value="true">
                                  <bean:write name="<%=form.FORM_NAME%>" property="<%=ViewTextbookLoanPoliciesForm.FIELD_CONDITION_FAIR%>"/>&nbsp;circulations
                              </logic:equal>&nbsp;
                          </td>
                      </tr>
                      <tr>
                          <td width="40">&nbsp;</td>
                          <td class="ColRowBold tdAlignRight">Poor</td>
                          <td class="ColRow tdAlignRight">25%</td>
                          <td class="ColRow">
                              <logic:equal name="<%= form.FORM_NAME%>" property="<%=ViewTextbookLoanPoliciesForm.FIELD_AUTO_CONDITION%>" value="true">
                                  <bean:write name="<%=form.FORM_NAME%>" property="<%=ViewTextbookLoanPoliciesForm.FIELD_CONDITION_POOR%>"/>&nbsp;circulations
                              </logic:equal>&nbsp;
                          </td>
                      </tr>
                      <tr>
                          <td width="40">&nbsp;</td>
                          <td class="ColRowBold tdAlignRight">Unusable</td>
                          <td class="ColRow tdAlignRight">0%</td>
                          <td>&nbsp;</td>
                      </tr>
                      </table>
                      </td>
                    </tr>
                </table>
            </td></tr>

        </base:outlinedTableAndTabsWithinThere>
    </td></tr>
</table>




