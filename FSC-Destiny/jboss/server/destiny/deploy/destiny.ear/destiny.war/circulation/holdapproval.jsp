<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.marc.*" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.HoldApprovalForm" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.HoldSpecs" %>
<%@ page import="com.follett.fsc.common.LocaleHelper" %>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<jsp:include page="/circulation/setsound.jsp"/>

<bean:define id="deliveryMethods" name="<%= HoldApprovalForm.FORM_NAME %>" property="deliveryOptions"/>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    HoldApprovalForm form = (HoldApprovalForm)request.getAttribute("circulation_servlet_HoldApprovalForm");
%>

<base:form action="/circulation/servlet/handleholdapprovalform.do">
  <html:hidden property="holdID"/>
  <c:set var="cForm" value="<%=request.getAttribute(HoldApprovalForm.FORM_NAME)%>"/>
  <!-- Information about the title and patron requesting the hold -->
  <bean:define id="holdInfo" name='<%= HoldApprovalForm.FORM_NAME %>' property="holdInfoVO"  type="com.follett.fsc.destiny.session.circulation.data.HoldInformationValue" scope="request"/>
  <bean:define id="holdValue" name='holdInfo' property="holdValue" type="com.follett.fsc.destiny.entity.ejb3.HoldVO"/>

  <table cellSpacing="1" cellPadding="4" width="100%" bgColor="#c0c0c0" border="0">
  <tbody>
    <tr>
      <td vAlign="top" width="100%" bgColor="#ffffff">

        <table width="100%">
          <tr>
            <td> <!--contents (not buttons) -->
              <table border="0" width="100%">

                <tr>
                  <td valign="top">
                    <!-- material icon -->
                    <%= BibType.getBibTypeIcon(holdInfo.getBibType(), false, holdInfo.getBibSubTypeID(), null, null, null) %>
                  </td>
                  <td width="100%"> <!-- header table -->
                    <table id='<%= HoldApprovalForm.TABLE_HEADER %>'>
                      <tr>
                        <td class="TableHeading" vAlign="top">
                            <bean:write name="holdInfo" property="title"/>
                        </td>
                      </tr>
                      <tr>
                        <td>
                          <span class="ColRowBold"><%= MessageHelper.formatMessage("holdapproval_Patron") %></span><span class="ColRow"><bean:write name="holdInfo" property="patronName"/>
                          (<bean:write name="holdInfo" property="patronType"/>:&nbsp;<bean:write name="holdInfo" property="patronBarcode"/>)</span>
                        </td>

                      </tr>
                      <tr>
                        <td>
                           <span class="ColRowBold"><%= MessageHelper.formatMessage("holdapproval_patron_WantsThisTitleColon_from_date_to_date") %></span>
                           <span class="ColRow">
                            <logic:present name="holdValue" property="reserveStartDate">
                                <%= MessageHelper.formatMessage("holdapproval_from_date_to_date", lh.formatDate(holdValue.getReserveStartDate()) , lh.formatDate(holdValue.getExpireDate()) ) %>
                            </logic:present>
                            <logic:notPresent name="holdValue" property="reserveStartDate"><%= MessageHelper.formatMessage("holdapproval_AsSoonAsPossible") %></logic:notPresent>
                           </span>
                        </td>
                      </tr>
                    </table>
                  </td>
                </tr>

                <tr>
                  <td colspan="2" width="100%">
                    <IMG height="1" src="/images/icons/general/line.gif" width="100%" vspace="2">
                  </td>
                </tr>

                <tr>
                  <td>
                  </td>
                  <td> <!-- approval sites table -->
                    <table id='<%= HoldApprovalForm.TABLE_APPROVAL_LIST %>' width="100%">

                    <!-- if no copies are available -->
                    <logic:equal name="<%=HoldApprovalForm.FORM_NAME%>" property="localCopiesAvailable" value="false">
                        <logic:equal name="<%=HoldApprovalForm.FORM_NAME%>" property="offsiteCopiesAvailable" value="false">
                        <tr>
                            <td class="ColRowBold"><%= MessageHelper.formatMessage("holdapproval_NoCopiesAvailable") %></td>
                        </tr>
                        </logic:equal>
                    </logic:equal>
                    
                    <% int row = 0; // This is the first row in the list %>
                    <!-- local approval sites -->
                    <logic:equal name="<%=HoldApprovalForm.FORM_NAME%>" property="localCopiesAvailable" value="true">
                      <tr>
                        <td colspan="2" class="ColRowBold"><%= MessageHelper.formatMessage("holdapproval_PlaceHoldAt") %></td>
                      </tr>
                      <!-- iterate through all sites -->
                      <logic:iterate id="site" name="<%= HoldApprovalForm.FORM_NAME %>" property="localSites" type="com.follett.fsc.destiny.session.circulation.data.HoldApprovalSiteValue">
                        <tr class="ColRow" valign="bottom">
                          <td>
                            <input type="radio" name="<%=HoldApprovalForm.FIELD_APPROVED_SITE_ID%>" value="<bean:write name="site" property="siteID"/>" <%=(row++==0)? "checked" : "" %>>
                            <bean:write name="site" property="siteName"/>
                          </td>
                          <td valign="bottom">
                            <logic:notPresent name="holdValue" property="reserveStartDate">
                               <%= MessageHelper.formatMessage("holdapproval_n_Of_m_CopiesAvailable", new Long(site.getCopiesAvailable()), new Long(site.getCopiesTotal())) %>
                            </logic:notPresent>
                            <logic:present name="holdValue" property="reserveStartDate">
                                &nbsp;
                            </logic:present>
                          </td>
                        </tr>
                      </logic:iterate>
                      <tr><td colspan="2">&nbsp;</td></tr>                          
                    </logic:equal>

                    <!-- offsite approval sites -->
                    <logic:equal name="<%=HoldApprovalForm.FORM_NAME%>" property="offsiteCopiesAvailable" value="true">
                      <tr>
                            <td>
                                <table border="0" width="100%">                          
                                    <tr>
                                        <td class="ColRowBold"><%= MessageHelper.formatMessage("holdapproval_PlaceILLAt") %></td>
                                        <td class="ColRowBold tdAlignRight">
                                            <c:if test="${cForm.showDeliveryMethod}">
                                                    <%= MessageHelper.formatMessage("holdapproval_DeliveryMethod") %>&nbsp;
                                            </c:if>
                                        </td>                                           
                                    </tr>
                                </table>
                            </td>
                            <td>
                                <c:if test="${cForm.showDeliveryMethod}">                                   
                                    <html:select property="<%=HoldApprovalForm.FIELD_DELIVERY_METHOD_ILL%>">
                                        <html:options collection="deliveryMethods" property="value" labelProperty="desc"/>
                                    </html:select>
                                </c:if>
                            </td>
                      </tr>
                      <% boolean needToSetDefaultRadio = true; %>
                        <logic:notPresent name="holdValue" property="reserveStartDate">                          
                            <tr class="ColRow" valign="bottom">                         
                              <td>                            
                                <input type="radio" name="<%=HoldApprovalForm.FIELD_APPROVED_SITE_ID%>" value="<%=HoldSpecs.SITEID_AUTOMATICALLY_FULFILL_REQUEST%>" checked/>
                                <% needToSetDefaultRadio = false; %>
                                <%= MessageHelper.formatMessage("holdapproval_AutomaticallyFulfillRequest") %>
                              </td>
                              <td valign="bottom">
                                    &nbsp;
                              </td>
                            </tr>
                        </logic:notPresent>
                      <!-- iterate through all sites -->
                      <logic:iterate id="site" name="<%= HoldApprovalForm.FORM_NAME %>" property="offsiteSites" type="com.follett.fsc.destiny.session.circulation.data.HoldApprovalSiteValue">
                        <tr class="ColRow" valign="bottom">
                          <td>
                            <input type="radio" name="<%=HoldApprovalForm.FIELD_APPROVED_SITE_ID%>" value="<bean:write name="site" property="siteID"/>" <%=needToSetDefaultRadio? "checked" : "" %> >
                            <% needToSetDefaultRadio = false; %>
                            <bean:write name="site" property="siteName"/>
                          </td>
                          <td valign="bottom">
                            <logic:notPresent name="holdValue" property="reserveStartDate">
                               <%= MessageHelper.formatMessage("holdapproval_n_Of_m_CopiesAvailable", new Long(site.getCopiesAvailable()), new Long(site.getCopiesTotal())) %>
                            </logic:notPresent>
                            <logic:present name="holdValue" property="reserveStartDate">
                                &nbsp;
                            </logic:present>
                          </td>
                        </tr>
                      </logic:iterate>
                    </logic:equal>
                    
                    </table>
                  </td>
                </tr>
              </table>
            </td>

              <td width="15%" valign="top">
              <!-- Submit options for this form -->
                <table id='<%= HoldApprovalForm.TABLE_SUBMIT_OPTIONS %>' cellspacing="5">
                    <% if (!form.isLocalCopiesAvailable() && !form.isOffsiteCopiesAvailable()) { %>
                        <tr><td align="center">&nbsp;</td></tr>
                    <% } %>
                    <% if (form.isLocalCopiesAvailable() || form.isOffsiteCopiesAvailable()) { %>
                        <tr><td align="center" nowrap class="ColRowBold">
                        <base:showHideTag id="onSave">
                        <logic:present name="<%=HoldApprovalForm.FORM_NAME%>" property="holdID">
                            <base:genericButton src="/buttons/large/approve.gif" onclick="hideElementonSave()" name="<%= HoldApprovalForm.BUTTON_NAME_APPROVE %>" alt='<%= MessageHelper.formatMessage("approve") %>'/>
                        </logic:present>
                        <logic:notPresent name="<%=HoldApprovalForm.FORM_NAME%>" property="holdID">
                            <base:saveButton onclick="hideElementonSave()" name="<%= HoldApprovalForm.BUTTON_NAME_SAVE %>" />
                        </logic:notPresent>
                        </base:showHideTag>
                        </td></tr>
                    <% } %>
                  <tr><td align="center"><base:cancelButton name="<%= HoldApprovalForm.BUTTON_NAME_CANCEL %>"/></tr></td>
                </table>
              </td>
          </tr>
        </table>

      </td>
    </tr>
  </tbody>
  </table>

</base:form>
