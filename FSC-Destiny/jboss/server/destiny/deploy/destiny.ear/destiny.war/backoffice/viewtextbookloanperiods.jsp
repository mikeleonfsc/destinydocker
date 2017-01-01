<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="org.apache.struts.util.*" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%@ page import="com.follett.fsc.common.MessageHelper"%>

<bean:define id="systemDateIDs" name="<%=ViewTextbookLoanPeriodsForm.FORM_NAME%>" property="systemDateList"/>
<bean:define id="circTypeIDs" name="<%=ViewTextbookLoanPeriodsForm.FORM_NAME%>" property="circTypeList"/>


<base:messageBox strutsErrors="true"/>

<%!
    String is_default(boolean defaultLoan) {
        if (defaultLoan) {
            return JSPHelper.renderImage("/icons/general/check_19.gif", 19, 16, "Default") + "&nbsp;Default";
        } else {
            return "&nbsp";
        }
    }
%>
<%
    ViewTextbookLoanPeriodsForm form = (ViewTextbookLoanPeriodsForm) request.getAttribute(ViewTextbookLoanPeriodsForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    String addTextbookLoanPeriodLink = "/backoffice/servlet/presenttextbookeditloanperiodform.do?collectionType=" + CollectionType.TEXTBOOK + "&distMode=" + form.isDistMode() + "&doNotClearCrumb=" + String.valueOf(form.isDoNotClearCrumb());
    String addResourceLoanPeriodLink = "/backoffice/servlet/presenttextbookeditloanperiodform.do?collectionType=" + CollectionType.ASSET + "&distMode=" + form.isDistMode() + "&doNotClearCrumb=" + String.valueOf(form.isDoNotClearCrumb());
    String addMediaLoanPeriodLink = "/backoffice/servlet/presenttextbookeditloanperiodform.do?collectionType=" + CollectionType.MEDIA + "&distMode=" + form.isDistMode() + "&doNotClearCrumb=" + String.valueOf(form.isDoNotClearCrumb());
%>

<br>
    <%  // only put DISTRICT MODE on if we are in district mode, otherwise bad things happen
    if (form.isDistMode() ) { %>
        <center><span class="ColRowBold"><%= GenericForm.getLastBackupDisplayMsg(false) %></span></center><br>
        <jsp:include page="/common/msdewarning.jsp" flush="true" />
    <% } %>
<base:form action="/backoffice/servlet/handleviewtextbookloanperiodsform.do">
    <html:hidden property="deleteBeforeConfirm"/>
    <html:hidden property="<%=GenericForm.PARAM_COLLECTION_TYPE%>"/>
    <html:hidden property="<%=ViewTextbookLoanPeriodsForm.FIELD_DISTRICT_MODE %>"/>
    <html:hidden property="<%=ViewTextbookLoanPeriodsForm.FIELD_CONFIRM_PUSH %>"/>
    <html:hidden property="<%=ViewTextbookLoanPeriodsForm.DO_NOT_CLEAR_CRUMB %>"/>
    
    <table border="0" width="95%" id="<%= ViewTextbookLoanPoliciesForm.TABLE_TEXTBOOK_POLICIES_TABS %>" cellpadding="0" cellspacing="0" align="center">
    <tr>
        <td>
        <% if ( form.getDeleteBeforeConfirm() != null ) { %>
            <html:hidden property="<%=ViewTextbookLoanPeriodsForm.FIELD_DATE_COLLECTION_TYPE %>"/>
            <base:messageBox>
            <tr>
                <td>
                <table id="<%=ViewTextbookLoanPeriodsForm.TABLE_DELETE_CONFIRMATION%>" border="0" align="center">
                    <logic:notEqual name="backoffice_servlet_ViewTextbookLoanPeriodsForm" property="<%=TextbookEditLoanPeriodForm.PARAM_COLLECTION_TYPE%>" value="<%=String.valueOf(CollectionType.MEDIA)%>" scope="request" >
                       <% if (form.isShowChangeOtherClassOrCircType()) { %>
                            <tr>
                                <td class="ColRow">
                                    <ul>
                                        <li>This loan period is used by other classes.<br>
                                        Change the assigned loan period to: 
                                            <br><html:select property="<%=ViewTextbookLoanPeriodsForm.FIELD_NEW_SYSTEM_DATE_ID%>">
                                            <html:options collection="systemDateIDs" property="longID" labelProperty="stringDesc"/>
                                            </html:select>
                                        </li>
                                    </ul>
                                </td>
                            </tr>
                        <% }
                       if (form.isShowChangeOtherPatronTypes()) { %>
                            <tr>
                                <td class="ColRow">
                                    <ul>
                                        <li>This loan period is used by other patron types.<br>
                                        Change the assigned loan period to: 
                                            <br><html:select property="<%=ViewTextbookLoanPeriodsForm.FIELD_NEW_PATRON_SYSTEM_DATE_ID%>">
                                            <html:options collection="systemDateIDs" property="longID" labelProperty="stringDesc"/>
                                            </html:select>
                                        </li>
                                    </ul>
                                </td>
                            </tr>
                        <% }
                        if (form.isShowChangeOtherDeptLoc()) { %>
                        <tr>
                            <td class="ColRow">
                                <ul>
                                    <li>
                                    This is your default loan period for the resource template on departments and locations.<br>
                                    Select a new default: 
                                    <br><html:select property="<%=ViewTextbookLoanPeriodsForm.FIELD_NEW_DEPT_LOC_SYSTEM_DATE_ID%>">
                                        <html:options collection="systemDateIDs" property="longID" labelProperty="stringDesc"/>
                                        </html:select>
                                    </li>
                                </ul>
                            </td>
                        </tr>
                        <% }
                       if (form.isShowChangeDefaults()) { %>
                        <tr>
                            <td class="ColRow">
                                <ul>
                                    <li>
                                    This is your default loan period.<br>
                                    Select a new default: 
                                    <br><html:select property="<%=ViewTextbookLoanPeriodsForm.FIELD_NEW_DEFAULT_SYSTEM_DATE_ID%>">
                                        <html:options collection="systemDateIDs" property="longID" labelProperty="stringDesc"/>
                                        </html:select>
                                    </li>
                                </ul>
                            </td>
                        </tr>
                        <% } %>
                    </logic:notEqual>                       
                    <logic:equal name="backoffice_servlet_ViewTextbookLoanPeriodsForm" property="<%=TextbookEditLoanPeriodForm.PARAM_COLLECTION_TYPE%>" value="<%=String.valueOf(CollectionType.MEDIA)%>" scope="request" >
                       <% if (form.isShowChangeOtherClassOrCircType()) { %>
                            <tr>
                                <td class="ColRow">
                                    <ul>
                                        <li>This loan period is in use by media titles.<br>
                                        Change the assigned loan period to: <html:select property="<%=ViewTextbookLoanPeriodsForm.FIELD_NEW_SYSTEM_DATE_ID%>">
                                            <html:options collection="circTypeIDs" property="longID" labelProperty="stringDesc"/>
                                            </html:select>
                                        </li>
                                    </ul>
                                </td>
                            </tr>
                        <% }
                       if (form.isShowChangeDefaults()) { %>
                        <tr>
                            <td class="ColRow">
                                <ul>
                                    <li>
                                <logic:equal name="<%= ViewTextbookLoanPeriodsForm.FORM_NAME %>" property="asset" value="false">
                                    This is your default loan period.<br>
                                </logic:equal>
                                <logic:equal name="<%= ViewTextbookLoanPeriodsForm.FORM_NAME %>" property="asset" value="true">
                                    This is your default loan period for the resource template.<br>
                                </logic:equal>
                                    Select a new default: <html:select property="<%=ViewTextbookLoanPeriodsForm.FIELD_NEW_DEFAULT_SYSTEM_DATE_ID%>">
                                        <html:options collection="circTypeIDs" property="longID" labelProperty="stringDesc"/>
                                        </html:select>
                                    </li>
                                </ul>
                            </td>
                        </tr>
                        <% } %>
                    </logic:equal>
                    
                    <% if(form.isShowChangeMaterialType()) {%>
                    <tr><td class="ColRow">
                        <ul>
                            <li>This loan period is assigned to one or more material types. <br>
                                Change the assigned loan period to: 
                                <html:select property="<%=ViewTextbookLoanPeriodsForm.FIELD_NEW_DEFAULT_SYSTEM_DATE_ID%>">
                                    <html:options collection="circTypeIDs" property="longID" labelProperty="stringDesc"/>
                                </html:select>
                            </li>
                        </ul>
                    </td></tr>
                                    <%} %>  
                                        
                    <tr>
                        <td align="center" class="ColRowBold">Are you sure you want to delete this loan period?</td>
                    </tr>
                    <tr>
                        <td valign="baseline" align="center" class="ColRow">
                            <base:yesNo 
                                buttonYesName="<%=ViewTextbookLoanPeriodsForm.BUTTON_YES%>"
                                buttonNoName="<%=ViewTextbookLoanPeriodsForm.BUTTON_NO%>"
                            />
                        </td>
                    </tr>
                </table>
                </td>
            </tr>
            </base:messageBox>
        <% } else if (form.isConfirmPush()) { %>
            <base:messageBox showRedBorder="true">
                <tr>
                    <td class="ColRowBold" align="center"><%= form.gimmeConfirmPushMessage() %></td>
                
                </tr>
                <tr>
                    <td align = "center">
                        <base:yesNo 
                            buttonYesName="<%=ViewTextbookLoanPeriodsForm.BUTTON_YES%>"
                            buttonNoName="<%=ViewTextbookLoanPeriodsForm.BUTTON_NO%>"
                        />
                    </td>
                </tr>
            </base:messageBox>
        <% } %>
        </td>
    </tr>
    <tr>
        <td>
            <base:outlinedTableAndTabsWithinThere tabs="<%=ViewTextbookLoanPeriodsForm.getTabs(form.getCollectionType(), form.isDistMode()) %>" selectedTab="<%=ViewTextbookLoanPeriodsForm.TAB_LOAN_PERIODS %>" borderColor="#C0C0C0" id="<%= ViewTextbookLoanPeriodsForm.TABLE_MAIN %>" width="100%" cellpadding="4" cellspacing="0">
                    <logic:equal name="backoffice_servlet_ViewTextbookLoanPeriodsForm" property="<%=TextbookEditLoanPeriodForm.PARAM_COLLECTION_TYPE%>" value="<%=String.valueOf(CollectionType.ASSET)%>" scope="request" >
                    <tr>
                       <td colspan="7" class="TableHeading2">
                       <center>Interval Loan Periods</center><br/>
                       Note: Circulation uses the Class Loan period if the patron and resource are assigned to a class. All other checkouts use the template defined policy.
                       </td>
                    </tr>
                    <tr>
                        <td nowrap class="ColRowBold">Description</td>
                        <td nowrap class="ColRowBold">&nbsp;</td>
                        <td nowrap class="ColRowBold">&nbsp;</td>
                        <td nowrap class="ColRowBold">Due</td>
                        <td nowrap class="ColRowBold">Status</td>
                        <td>&nbsp;</td>
                        <td width="208" class="tdAlignRight" nowrap>
                            <base:link page="<%=addResourceLoanPeriodLink%>">
                                <base:image src="/buttons/large/addloanperiod.gif" id = "<%=ViewTextbookLoanPeriodsForm.ID_ADD_RM_PERIOD %>" alt="<%= ViewTextbookLoanPeriodsForm.LINK_ADD_PERIOD %>"/>
                            </base:link>
                        </td>
                    </tr>
                    
                    <logic:iterate indexId="flipper" id="value" name="<%=ViewTextbookLoanPeriodsForm.FORM_NAME%>" property="resourceLoanPeriodList" type="com.follett.fsc.destiny.client.backoffice.data.TextbookLoanPeriodVO">
                        <base:flipper key="loanperiods">
                            <td class="ColRow" valign="top">
                                <%= ResponseUtils.filter(value.getTextbookLoanDescription()) %>
                            </td>
                            <td class="ColRow" valign="top">
                                &nbsp;
                            </td>
                            <td class="ColRow" valign="top">
                                &nbsp;
                            </td>
                            <td class="ColRow" valign="top">
                                <%= ResponseUtils.filter(value.getTextbookDue()) %>
                            </td>
                            
                            <td class="ColRow" valign="top">
                                <%= ResponseUtils.filter(value.getStatus()) %>
                            </td>

                            <td class="Instruction" valign="top">
                            &nbsp;
                            </td>
                            <td class="ColRow tdAlignRight" valign="top">
                                <base:link page='<%=value.getLinkEdit()%>' id='<%="edit" + value.getPeriodID()%>'>
                                    <base:image src="/icons/general/edit.gif" width="19" height="16" alt="<%=ViewTextbookLoanPeriodsForm.LINK_EDIT_PERIOD%>"/>
                                </base:link>
                                <logic:equal name="<%= ViewTextbookLoanPeriodsForm.FORM_NAME %>" property="showResourceDeleteIcon" value="true">
                                    <base:link page='<%=value.getLinkDelete()%>' collectionType="<%=CollectionType.ASSET%>" id='<%="delete" + value.getPeriodID() %>'>
                                        <base:image src="/icons/general/delete.gif" width="19" height="16" alt="<%=ViewTextbookLoanPeriodsForm.LINK_DELETE_PERIOD%>"/>
                                    </base:link>
                                </logic:equal>
                            </td>
                        </base:flipper>
                    </logic:iterate>  <%--  id="value" --%>
                    
                    <tr>
                       <td colspan="6" class="Instruction">
                       * Can be assigned to Departments/Locations or Patron Types only
                       </td>
                       <td class="tdAlignRight">
                        <br>
                        <base:link page="<%=addResourceLoanPeriodLink%>">
                            <base:image src="/buttons/large/addloanperiod.gif" id = "<%=ViewTextbookLoanPeriodsForm.ID_ADD_RM_PERIOD %>" alt="<%= ViewTextbookLoanPeriodsForm.LINK_ADD_PERIOD %>"/>
                        </base:link>
                       </td>
                    </tr>
                    
                    <tr>
                        <td colspan="7">
                            <base:imageLine/>
                        </td>
                    </tr>
                    <tr>
                       <td colspan="7" class="TableHeading2" align="center">
                       Class Loan Periods
                       </td>
                    </tr>
                    
                    
                    <tr>
                        <td nowrap class="ColRowBold">Description</td>
                        <td nowrap class="ColRowBold">
                            Start
                        </td>
                        <td nowrap class="ColRowBold">
                            End
                        </td>
                        <td nowrap class="ColRowBold">Due</td>
                        <td nowrap class="ColRowBold">Status</td>
                        <td>&nbsp;</td>
                        <td width="208" class="tdAlignRight" nowrap>
                        
                        
                            <base:link page="<%=addTextbookLoanPeriodLink%>">
                                <base:image src="/buttons/large/addloanperiod.gif" id = "<%=ViewTextbookLoanPeriodsForm.ID_ADD_TM_PERIOD %>" alt="<%= ViewTextbookLoanPeriodsForm.LINK_ADD_PERIOD %>"/>
                            </base:link>
                        </td>
                    </tr>
    
                    <logic:iterate indexId="flipper" id="value" name="<%=ViewTextbookLoanPeriodsForm.FORM_NAME%>" property="textbookLoanPeriodList" type="com.follett.fsc.destiny.client.backoffice.data.TextbookLoanPeriodVO">
                        <base:flipper key="loanperiods">
                            <td class="ColRow" valign="top">
                                <%= ResponseUtils.filter(value.getTextbookLoanDescription()) %>
                            </td>
                            <td class="ColRow" valign="top">
                                <%= ResponseUtils.filter(value.getClassStart()) %>
                            </td>
                            <td class="ColRow" valign="top">
                                <%= ResponseUtils.filter(value.getClassEnd()) %>
                            </td>
                            <td class="ColRow" valign="top">
                                <%= ResponseUtils.filter(value.getTextbookDue()) %>
                            </td>
                            
                            <td class="ColRow" valign="top">
                                <%= ResponseUtils.filter(value.getStatus()) %>
                            </td>

                            <td class="Instruction" valign="top">
                            &nbsp;
                            </td>
                            <td class="ColRow tdAlignRight" valign="top">
                                <base:link page='<%=value.getLinkEdit()%>' id='<%="edit" + value.getPeriodID()%>'>
                                    <base:image src="/icons/general/edit.gif" width="19" height="16" alt="<%=ViewTextbookLoanPeriodsForm.LINK_EDIT_PERIOD%>"/>
                                </base:link>
                                <logic:equal name="<%= ViewTextbookLoanPeriodsForm.FORM_NAME %>" property="showDeleteIcon" value="true">
                                    <base:link page='<%=value.getLinkDelete()%>' collectionType="<%=form.getCollectionType()%>" id='<%="delete" + value.getPeriodID()%>'>
                                        <base:image src="/icons/general/delete.gif" width="19" height="16" alt="<%=ViewTextbookLoanPeriodsForm.LINK_DELETE_PERIOD%>"/>
                                    </base:link>
                                </logic:equal>
                            </td>
                        </base:flipper>
                    </logic:iterate>  <%--  id="value" --%>

                <tr>
                   <td colspan="6" class="Instruction">
                   * Can be assigned to Classes, Patron Types and Departments/Locations
                   </td>
                    <td class="tdAlignRight">
                    <br>
                    <base:link page="<%=addTextbookLoanPeriodLink%>">
                        <base:image src="/buttons/large/addloanperiod.gif" id = "<%=ViewTextbookLoanPeriodsForm.ID_ADD_TM_PERIOD %>" alt="<%= ViewTextbookLoanPeriodsForm.LINK_ADD_PERIOD %>"/>
                    </base:link>
                </td>                   
                   </tr>
                </logic:equal>
                
                <logic:equal name="backoffice_servlet_ViewTextbookLoanPeriodsForm" property="<%=TextbookEditLoanPeriodForm.PARAM_COLLECTION_TYPE%>" value="<%=String.valueOf(CollectionType.TEXTBOOK)%>" scope="request" >
                    <tr>
                        <td nowrap class="ColRowBold">Description</td>
                        <td nowrap class="ColRowBold">
                            Start
                        </td>
                        <td nowrap class="ColRowBold">
                            End
                        </td>
                        <td nowrap class="ColRowBold">Due</td>
                        <td nowrap class="ColRowBold">Status</td>
                        <td>&nbsp;</td>
                        <td width="208" class="tdAlignRight" nowrap>
                        
                        
                        <base:link page="<%=addTextbookLoanPeriodLink%>">
                            <base:image src="/buttons/large/addloanperiod.gif" alt="<%= ViewTextbookLoanPeriodsForm.LINK_ADD_PERIOD %>"/>
                        </base:link>
                        </td>
                    </tr>
    
                    <logic:iterate indexId="flipper" id="value" name="<%=ViewTextbookLoanPeriodsForm.FORM_NAME%>" property="textbookLoanPeriodList" type="com.follett.fsc.destiny.client.backoffice.data.TextbookLoanPeriodVO">
                        <base:flipper key="loanperiods">
                            <td class="ColRow" valign="top">
                                <%= ResponseUtils.filter(value.getTextbookLoanDescription()) %>
                            </td>
                            <td class="ColRow" valign="top">
                                <%= ResponseUtils.filter(value.getClassStart()) %>
                            </td>
                            <td class="ColRow" valign="top">
                                <%= ResponseUtils.filter(value.getClassEnd()) %>
                            </td>
                            <td class="ColRow" valign="top">
                                <%= ResponseUtils.filter(value.getTextbookDue()) %>
                            </td>
                            
                            <td class="ColRow" valign="top">
                                <%= ResponseUtils.filter(value.getStatus()) %>
                            </td>

                            <td class="Instruction" valign="top">
                            <%= is_default(value.isDefaultLoanPeriod()) %>
                            &nbsp;
                            </td>
                            <td class="ColRow tdAlignRight" valign="top">
                                <base:link page='<%=value.getLinkEdit()%>' id='<%="edit" + value.getPeriodID()%>'>
                                    <base:image src="/icons/general/edit.gif" width="19" height="16" alt="<%=ViewTextbookLoanPeriodsForm.LINK_EDIT_PERIOD%>"/>
                                </base:link>
                                <logic:equal name="<%= ViewTextbookLoanPeriodsForm.FORM_NAME %>" property="showDeleteIcon" value="true">
                                    <base:link page='<%=value.getLinkDelete()%>' collectionType="<%=form.getCollectionType()%>" id='<%="delete" + value.getPeriodID()%>'>
                                        <base:image src="/icons/general/delete.gif" width="19" height="16" alt="<%=ViewTextbookLoanPeriodsForm.LINK_DELETE_PERIOD%>"/>
                                    </base:link>
                                </logic:equal>
                            </td>
                        </base:flipper>
                    </logic:iterate>  <%--  id="value" --%>
                <tr><td colspan="7" class="tdAlignRight">
                    <br>
                    <base:link page="<%=addTextbookLoanPeriodLink%>">
                        <base:image src="/buttons/large/addloanperiod.gif" alt="<%= ViewTextbookLoanPeriodsForm.LINK_ADD_PERIOD %>"/>
                    </base:link>
                </td></tr>
                    
                </logic:equal>
                
                
                
                
                
                
                
                
                
                <logic:equal name="backoffice_servlet_ViewTextbookLoanPeriodsForm" property="<%=TextbookEditLoanPeriodForm.PARAM_COLLECTION_TYPE%>" value="<%=String.valueOf(CollectionType.MEDIA)%>" scope="request" >
                    <tr>
                        <td nowrap class="ColRowBold">Description</td>
                        <td nowrap class="ColRowBold">
                            Loan Period
                        </td>
                        <td nowrap class="ColRowBold">
                            Extendible
                        </td>
                        <td colspan="2">&nbsp;</td>
                        <td>&nbsp;</td>
                        <td width="108" class="tdAlignRight">
                            <base:link page="<%=addMediaLoanPeriodLink%>">
                                <base:image src="/buttons/large/addloanperiod.gif" alt="<%= ViewTextbookLoanPeriodsForm.LINK_ADD_PERIOD %>"/>
                            </base:link>
                        </td>
                    </tr>
                    <logic:iterate indexId="flipper" id="vo" name="<%=ViewTextbookLoanPeriodsForm.FORM_NAME%>" property="mediaLoanPeriodList" type="com.follett.fsc.destiny.client.backoffice.data.MediaLoanPeriodVO">
                        <tr <%=( ( (1 & flipper.intValue())==0)? "bgColor=\"#E8E8E8\"" : "" )%> >
                            <td class="ColRow" valign="top">
                                <%= ResponseUtils.filter(vo.getTextbookLoanDescription()) %>
                            </td>
                            <td class="ColRow" valign="top">
                                <%= ResponseUtils.filter(vo.getLoanPeriod()) %>
                            </td>
                            <td class="ColRow" valign="top">
                                <%= ResponseUtils.filter(vo.getExtendible()) %>
                            </td>
                            <td colspan="2">
                                &nbsp;
                            </td>
                            <td>
                                &nbsp;
                            </td>
                            <td class="ColRow tdAlignRight" valign="top">
                                <base:link page='<%=vo.getLinkEdit()%>' id='<%="edit" + vo.getPeriodID()%>'>
                                    <base:image src="/icons/general/edit.gif" width="19" height="16" alt="<%=ViewTextbookLoanPeriodsForm.LINK_EDIT_PERIOD%>"/>
                                </base:link>
                                <logic:equal name="<%= ViewTextbookLoanPeriodsForm.FORM_NAME %>" property="showDeleteIcon" value="true">
                                    <base:link page='<%=vo.getLinkDelete()%>' collectionType="<%=form.getCollectionType()%>" id='<%="delete" + vo.getPeriodID()%>'>
                                        <base:image src="/icons/general/delete.gif" width="19" height="16" alt="<%=ViewTextbookLoanPeriodsForm.LINK_DELETE_PERIOD%>"/>
                                    </base:link>
                                </logic:equal>
                            </td>
                        </tr>
                    </logic:iterate>  <%--  id="value" --%>
                <tr><td colspan="7" class="tdAlignRight">
                    <br>
                    <base:link page="<%=addMediaLoanPeriodLink%>">
                        <base:image src="/buttons/large/addloanperiod.gif" alt="<%= ViewTextbookLoanPeriodsForm.LINK_ADD_PERIOD %>"/>
                    </base:link>
                </td></tr>
                </logic:equal>
            
            
            
                <c:if test="<%=form.isDistMode()%>">
                    <tr>
                        <td colspan="7">
                            <base:imageLine height="1" width="100%"/>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="7" class="Instruction" align="center">*<%=MessageHelper.formatMessage("siteconfigurationbase_ApplyTheseSettingsAt") %>&nbsp;
                        <base:selectSiteAndSiteType 
                                    name="<%= ViewTextbookLoanPeriodsForm.FIELD_PUSH_TO%>" 
                                    selectedSiteID="<%=form.getPushToSite()%>"
                                    includeForLibrarySites="false"
                                    includeForTextbookSites="<%=form.canShowForTextbook() %>"
                                    includeForAssetSites="<%=form.canShowForAsset() %>"
                                    includeDistrictWarehouse="false"
                                />
                            <base:genericButton src="/buttons/small/push.gif" alt='<%= MessageHelper.formatMessage("push") %>' 
                                name="<%= ViewTextbookLoanPeriodsForm.BUTTON_NAME_PUSH %>" />
                        </td>
                    </tr>
                </c:if>
            </base:outlinedTableAndTabsWithinThere>
        </td>
    </tr>
    </table>

</base:form>



