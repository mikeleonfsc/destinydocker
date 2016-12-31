<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.QuickPickSpecs" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.jsptag.EditCopyDropDownTag"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>


<base:messageBox strutsErrors="true"/>
<c:set var="cform" value="<%=request.getAttribute(ImportBibAssignCopyForm.FORM_NAME)%>"/>
<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    ImportBibAssignCopyForm form = (ImportBibAssignCopyForm)request.getAttribute("cataloging_servlet_ImportBibAssignCopyForm");
%>

<bean:define id="circTypesID" name="<%= ImportBibAssignCopyForm.FORM_NAME %>" property="circTypes"/>

<base:form action="/cataloging/servlet/handleimportbibassigncopyform.do">
  <html:hidden property="page"/>
  <html:hidden property="importSiteID"/>
  <html:hidden property="collectionType"/>
  <html:hidden property="addToMyList"/>
        <base:outlinedTable borderColor="#C0C0C0" width="100%">
                <tr>
                    <td colspan="4" class="FormLabel"><%= MessageHelper.formatMessage("importbibassigncopy_AssignCopyInformation") %></td>
                </tr>

                <tr>
                    <td>&nbsp;</td>
                    <td colspan="3">
                    <table id="<%=ImportBibAssignCopyForm.TABLE_DEFAULT_STUFF%>">
                      <tr>
                          <td colspan="4" class="ColRow"><%= MessageHelper.formatMessage("importbibassigncopy_IfMissingAssignTheFollowingInformationToEachCopy") %></td>
                      </tr>
                       <% if (!store.isMediaBookingUser()) { %>
                      <tr>
                        <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("importbibassigncopy_CirculationType") %></td>
                        <td class="ColRow">
                         <html:radio property="<%=ImportBibAssignCopyForm.FIELD_ASSIGN_CIRC_TYPE_MODE%>" value="<%=ImportBibAssignCopyForm.ASSIGN_CIRC_TYPE_STATIC%>">
                         </html:radio>
                        </td>
                        <td>
                        <html:select property="<%= ImportBibAssignCopyForm.FIELD_DEFAULT_CIRC_TYPE %>"
                        onfocus='<%="document." + ImportBibAssignCopyForm.FORM_NAME + "." + ImportBibAssignCopyForm.FIELD_ASSIGN_CIRC_TYPE_MODE + "[0].checked = true"%>'>
                          <html:options collection="circTypesID" property="longID"
                                        labelProperty="stringDesc"/>
                        <base:helpTag helpFileName="d_circ_types_LM_MM.htm"/>
                        </html:select>
                        </td>
                        <td rowspan="2" valign="bottom">
                             <base:genericButton src="/buttons/large/update.gif" alt='<%=MessageHelper.formatMessage("update")%>' name="<%= ImportBibAssignCopyForm.BUTTON_UPDATE_CALL_NUMBER %>"  
                              onclick='<%="document." + ImportBibAssignCopyForm.FORM_NAME + "." + ImportBibAssignCopyForm.FIELD_ASSIGN_CIRC_TYPE_MODE + "[1].checked = true"%>' />
                       </td>
                      </tr>
                       <tr>
                        <td>&nbsp;</td>
                        <td>
                         <html:radio property="<%=ImportBibAssignCopyForm.FIELD_ASSIGN_CIRC_TYPE_MODE%>" value="<%=ImportBibAssignCopyForm.ASSIGN_CIRC_TYPE_BY_CALL_NUMBER%>">
                         </html:radio>
                        </td>
                        <td class="ColRow"><%= MessageHelper.formatMessage("importbibassigncopy_BasedOnCallNumber") %></td>
                      </tr>
                      <tr>
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td>
                                <table cellpadding="0" cellspacing="0">
                                <tr>
                                 <td class="Instruction" nowrap><%= MessageHelper.formatMessage("importbibassigncopy_IfAnIncomingCallNumberIsNotAssigned") %></td>
                                </tr>
                                <tr>
                                 <td class="Instruction" nowrap><%= MessageHelper.formatMessage("importbibassigncopy_ToACirculationTypeTheCirculationType") %></td>
                                </tr>
                                <tr>
                                
                                 <td class="Instruction" nowrap>
                                    <%= MessageHelper.formatMessage("importbibassigncopy_WillBeSetTo0", form.getDefaultCircTypeName()) %> 
                                 </td>
                                </tr>
                                </table>
                            </td>
                            <td>
                                &nbsp;
                           </td>
                      </tr>
                      <%} %> <%--end no media --%>
                          
                      <% if ( store.isDistrictUser() || store.canView(Permission.CAT_CREATE_ASSIGN_CATEGORIES) ) { %>
                          <tr>
                            <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("importbibassigncopy_CopyCategories") %></td>
                            <td class="ColRow" colspan="2">
                                <bean:write name="<%= ImportBibAssignCopyForm.FORM_NAME %>"
                                    property="defaultCategoriesDescriptions"/>
                            </td>
                            <td class="ColRow">
                                <base:genericButton src="/buttons/large/assignbig.gif" alt='<%=MessageHelper.formatMessage("assign")%>' name="<%= ImportBibAssignCopyForm.BUTTON_ASSIGN_CATEGORIES %>" />
                            </td>
                          </tr>
                      <% } %>
                        <html:hidden property="<%=ImportBibAssignCopyForm.PARAM_DEFAULT_CATEGORIES%>"/>
                      <tr>
                        <td class="FormLabel tdAlignRight" valign="top"><%= MessageHelper.formatMessage("importbibassigncopy_Sublocation") %></td>
                        <td class="ColRow" colspan="2">
                            <base:editCopyDropDown fieldName="<%= ImportBibAssignCopyForm.FIELD_DEFAULT_SUBLOCATION%>"
                                                   siteID="<%= form.getImportSiteID() %>"
                                                   currentSelection="${cform.defaultSublocation}"
                                                   controlNum="<%= QuickPickSpecs.CONTROL_NUM_SUBLOCATION %>"/>                                        
                        </td>
                        <td>&nbsp;</td>
                      </tr>

                      <tr>
                        <td class="FormLabel tdAlignRight" valign="top"><%= MessageHelper.formatMessage("importbibassigncopy_Vendor") %></td>
                        <td class="ColRow" colspan="2">
                            <base:editCopyDropDown fieldName="<%= ImportBibAssignCopyForm.FIELD_DEFAULT_VENDOR%>" 
                                                   siteID="<%= form.getImportSiteID() %>" 
                                                   currentSelection="${cform.vendor}"
                                                   controlNum="<%= EditCopyDropDownTag.CONTROL_NUM_VENDOR %>"/>  
                            <base:spanIfAllowed permissions="<%=ImportBibAssignCopyForm.QUICK_PICK_PERMISSION_REQUIRED%>">                  
                                &nbsp;                     
                                <base:genericButton src="/buttons/large/other.gif" absbottom="true" name="<%=ImportBibAssignCopyForm.BUTTON_VENDOR_OTHER%>" alt='<%=MessageHelper.formatMessage("other") %>'/>
                            </base:spanIfAllowed>
                        </td>
                        <td>&nbsp;</td>
                      </tr>
                      <tr>
                        <td class="FormLabel tdAlignRight" valign="top"><%= MessageHelper.formatMessage("importbibassigncopy_FundingSource") %></td>
                        <td class="ColRow" colspan="2">
                        <base:editCopyDropDown fieldName="<%= ImportBibAssignCopyForm.FIELD_DEFAULT_FUNDING_SOURCE%>" 
                                   siteID="<%= form.getImportSiteID() %>" 
                                           currentSelection="${cform.fundingSource}" 
                                       controlNum="<%= QuickPickSpecs.CONTROL_NUM_FUNDINGSOURCE %>"/>  
                        &nbsp;  
                        <base:spanIfAllowed permissions="<%=ImportBibAssignCopyForm.QUICK_PICK_PERMISSION_REQUIRED%>">                  
                        <base:genericButton src="/buttons/large/other.gif" absbottom="true" name="<%=ImportBibAssignCopyForm.BUTTON_FUNDING_SOURCE_OTHER%>" alt='<%=MessageHelper.formatMessage("other") %>'/>
                        </base:spanIfAllowed>
                        </td>
                        <td>&nbsp;</td>
                      </tr>
                      <tr>
                            <td align="center" colspan="2">
                                <base:okButton name="<%= ImportBibAssignCopyForm.BUTTON_NAME_SAVE %>" />
                                <base:cancelButton name="<%= ImportBibAssignCopyForm.BUTTON_NAME_CANCEL %>" />
                            </td>
    </tr>
                    </table>
                    </td>
                </tr>

        </base:outlinedTable>
</base:form>

