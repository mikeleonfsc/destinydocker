<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.util.*"%>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.CircPolicyWithDescriptionsValue"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.PatronTypeSpecs"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CircPolicySpecs"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs"%>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="java.sql.Timestamp"%>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.common.LocaleHelper" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@page import="com.follett.fsc.destiny.client.common.data.Tab"%>
<%@page import="com.follett.fsc.destiny.client.common.data.TabUsingLink"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%-- I18n Support --%>
<%@ taglib uri="/WEB-INF/jstl-format.tld" prefix="fmt"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>





<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="com.follett.fsc.common.CurrencyValue"%><bean:define id="defaultSIFStaffID" name="backoffice_servlet_ViewPatronTypeForm" property="staffSIFPatronTypes"/>
<bean:define id="defaultSIFStudentID" name="backoffice_servlet_ViewPatronTypeForm" property="studentSIFPatronTypes"/>
<bean:define id="patronTypesID" name="backoffice_servlet_ViewPatronTypeForm" property="patronTypes"/>
<base:messageBox strutsErrors="true"/>
<script language="JavaScript" type="text/javascript">
<!--

    function openWindow(url,name,features) {
       var win = window.open(url,name,features);
    }
// -->
</script>

<%
    ViewPatronTypeForm form = (ViewPatronTypeForm) request.getAttribute(ViewPatronTypeForm.FORM_NAME);
	SessionStoreProxy store = form.getStore();
	LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    String holdPriorityStrings[] = DisplayFormatter.getHoldPriorityStrings();
    
    Tab[] tabs = null;
    String selectedTab = null;
    String selectedTabID = null;
    
    if (form.getCollectionType()==BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK || form.getCollectionType()==BibMasterSpecs.COLLECTION_TYPE_ASSET) {
        tabs = ViewTextbookLoanPeriodsForm.getTabs(form.getCollectionType(), form.isDistMode());
        selectedTab = ViewTextbookLoanPeriodsForm.TAB_PATRON_TYPES;
    } else {
        tabs = new Tab[] { 
            new TabUsingLink(MessageHelper.formatMessage("viewpatrontype_TabName"), 
                null, 
                true, 
                ViewPatronTypeForm.ID_TAB_NAME), 
            new TabUsingLink(MessageHelper.formatMessage("viewcirctype_TabName"), 
                form.gimmeCircTabLink(), 
                true, 
                ViewCircTypeForm.ID_TAB_NAME)
        };
        selectedTab = MessageHelper.formatMessage("viewpatrontype_TabName");
        selectedTabID = ViewPatronTypeForm.ID_TAB_NAME;
        
    }
%>


<base:form action="/backoffice/servlet/handleviewpatrontypeform.do">
<input type="hidden" name="<%=ViewPatronTypeForm.DROPDOWN_SUBMIT%>" value="false"/>
    <html:hidden property="<%=GenericForm.PARAM_COLLECTION_TYPE%>"/>
    <html:hidden property="patronTypeID"/>
    <html:hidden property="action"/>
    <logic:equal name="<%=ViewPatronTypeForm.FORM_NAME%>" property="<%=ViewPatronTypeForm.PARAM_DISTRICT_MODE%>" value="true">
      <html:hidden property="<%=ViewPatronTypeForm.PARAM_DISTRICT_MODE%>"/>
    </logic:equal>
    <logic:equal name = "<%=ViewPatronTypeForm.FORM_NAME %>" property = "action" value = "push">
     <base:messageBox showRedBorder="true">
            <tr valign="center">
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <%-- AT test29292 requested trues for asset / textbooks etg--%>
                <td class="ColRowBold" align="center"><%= MessageHelper.formatMessage("viewpatrontype_YourCurrentDistrictSettingsWillBePushedTo") %><base:selectSiteAndSiteType 
                            name="<%= ViewPatronTypeForm.FIELD_SITE_LIMITER%>" 
                            selectedSiteID="true"
                            includeForLibrarySites="true"
                            includeForTextbookSites="true"
                            includeForAssetSites="true"
                            includeDistrictWarehouse="false"
                        /></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td class="ColRow" align="center"><%= MessageHelper.formatMessage("viewpatrontype_ThisProcessCannotBeReversed") %></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td class="ColRow" align="center"><%= MessageHelper.formatMessage("viewpatrontype_AreYouSureYouWantToProceed") %></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td valign="baseline" align="center" class="ColRow">
                    <base:yesNo/>
                </td>
            </tr>
        </base:messageBox>   
    </logic:equal>
    <logic:equal name="<%=ViewPatronTypeForm.FORM_NAME%>" property="action" value="ConfirmDelete">
        <base:messageBox showRedBorder="true">
<%
        if (form.isLastPatronType()) {
%>
        <tr valign="top">
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td class="ColRowBold" align="center"><%= MessageHelper.formatMessage("viewpatrontype_YouCannotDeleteYourLastPatronType") %></td>
        </tr>
<%
        } else if (store.allowSIF() && form.isDefaultSIFPatronTypeID()) {
%>
        <tr valign="top">
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td class="ColRowBold" align="center">
            <%= MessageHelper.formatMessage("viewpatrontype_PatronTypeCanNotBeDeletedItIsUsedAsTheDefaultSIF",
                ResponseUtils.filter(form.getPatronTypeDescription()), form.getDisplayableSIFType()) %>
            </td>
        </tr>

        <tr>
            <td>&nbsp;</td>
            <td align="center" class="ColRow"><%= MessageHelper.formatMessage("viewpatrontype_PleaseSelectAReplacementBeforeDeleting") %></td>
        </tr>
<%
        } else {
%>
        <tr valign="top">
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td class="ColRowBold" align="center"><%= MessageHelper.formatMessage("viewpatrontype_PatronTypeWillBeDeleted", ResponseUtils.filter(form.getPatronTypeDescription())) %></td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td>
            <table border="0" align="center">
                <%
                if (form.getNumberOfPatrons() > 0) {
                %>
                <tr>
                    <td class="ColRow">
                        <ul>
                            <li><%= MessageHelper.formatMessage("viewpatrontype_PatronsUsingThisPatronType", Long.valueOf(form.getNumberOfPatrons())) %><br>
                            <%= MessageHelper.formatMessage("viewpatrontype_PatronsChangePatronType") %>&nbsp;<html:select property="<%=ViewPatronTypeForm.FIELD_NEW_PATRON_TYPE_ID %>">
                                <html:options collection="patronTypesID" property="longID" labelProperty="stringDesc"/>
                                </html:select>
                            </li>
                        </ul>
                    </td>
                </tr>
                <%
                }
                if (form.isDefaultPatronType()) { %>
               <tr>
                    <td class="ColRow">
                        <ul>
                            <li><%= MessageHelper.formatMessage("viewpatrontype_ThisIsYourDefaultPatronType") %><br>
                            <%= MessageHelper.formatMessage("viewpatrontype_SelectNewDefault") %>&nbsp;<html:select property="<%=ViewPatronTypeForm.FIELD_NEW_DEFAULT_PATRON_TYPE_ID %>">
                                <html:options collection="patronTypesID" property="longID" labelProperty="stringDesc"/>
                                </html:select>
                            </li>
                        </ul>
                    </td>
                </tr>
                <% } %>
            </table>
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td align="center" class="ColRow"><%= MessageHelper.formatMessage("viewpatrontype_AreYouSureYouWantToDeleteThisPatronType") %></td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td valign="baseline" align="center" class="ColRow">
                <base:yesNo/>
            </td>
        </tr>
<%
            }
%>
        </base:messageBox>
    </logic:equal>


<table align="center" border="0" width="95%" cellpadding="0" cellspacing="0">

    <tr><td>
      <base:outlinedTableAndTabsWithinThere id="LoanPoliciesNavigationTabs" width="100%" borderColor="#C0C0C0" selectedTabID ="<%=selectedTabID %>" selectedTab="<%=selectedTab %>" tabs="<%=tabs%>">
  	    <% if (form.getCollectionType()==BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK
  	    	|| form.getCollectionType()==BibMasterSpecs.COLLECTION_TYPE_ASSET) { %>
          <tr>
             <td colspan="4" class="ColRowBold">
        <% if (form.getCollectionType()==BibMasterSpecs.COLLECTION_TYPE_ASSET) {%>
            <%=MessageHelper.formatMessage("viewpatrontype_DefinePolicyForPatrons")%>
        <% } else { %>
            &nbsp;
        <% } %>
            </td>
            <td class="ColRow tdAlignRight">
                <base:link page="/backoffice/servlet/presenteditpatrontypeform.do?action=add" collectionType="<%=form.getCollectionType()%>"><base:image src="/buttons/large/addpatrontype.gif" name="<%=ViewPatronTypeForm.ID_ADD_PATRON_TYPE%>" alt='<%=MessageHelper.formatMessage("addPatronType") %>'/></base:link>
                <% if (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_ASSET && form.isDistMode()) {
                    String pushValuesLink = "/backoffice/servlet/handleviewpatrontypeform.do?action=push";
                    pushValuesLink = URLHelper.addHREFParam(pushValuesLink, ViewPatronTypeForm.PARAM_DISTRICT_MODE, "true");
                    %>
                        &nbsp;
                        <base:link page = "<%=pushValuesLink %>" collectionType = "<%=form.getCollectionType()%>"><base:image src = "/buttons/large/push.gif" name="<%=ViewPatronTypeForm.ID_PUSH%>" alt='<%= MessageHelper.formatMessage("push") %>' /></base:link>
                
                <% } %>
            </td>
          </tr>
          <tr><td colspan="5"><base:imageLine height="2" vspace="4" width="100%"/></td></tr>
	    <% } %>
        <% if (form.getCollectionType()!=BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK
          && form.getCollectionType()!=BibMasterSpecs.COLLECTION_TYPE_ASSET) { %>
        <tr>
            <td>
                <table width = "100%"> 
                    <tr>
                        <td style = "font-weight:bold"><%= MessageHelper.formatMessage("viewpatrontype_PatronTypes") %></td>
                        <td class="tdAlignRight">
                            <%
                            String addPatLink = "/backoffice/servlet/presenteditpatrontypeform.do?action=add";
                            String addCircLink = "/backoffice/servlet/presentcirctypeform.do";
                            String pushValuesLink = "/backoffice/servlet/handleviewpatrontypeform.do?action=push";
                            if ( form.isDistMode() ) {
                                addPatLink = URLHelper.addHREFParam(addPatLink, ViewPatronTypeForm.PARAM_DISTRICT_MODE, "true");
                                addCircLink = URLHelper.addHREFParam(addCircLink, ViewPatronTypeForm.PARAM_DISTRICT_MODE, "true");
                                pushValuesLink = URLHelper.addHREFParam(pushValuesLink, ViewPatronTypeForm.PARAM_DISTRICT_MODE, "true");
                            }
                            %>
                            <table>
                               <tr>
                                  <td>
                                    <base:link page = "<%=addPatLink %>" collectionType = "<%=form.getCollectionType()%>"><base:image src = "/buttons/large/addpatrontype.gif"  name="<%=ViewPatronTypeForm.ID_ADD_PATRON_TYPE%>" alt='<%=MessageHelper.formatMessage("addPatronType") %>'/></base:link>
                                    &nbsp;
                                    <base:link page = "<%=addCircLink %>" collectionType = "<%=form.getCollectionType()%>"><base:image src = "/buttons/large/addcirculationtype.gif"  name="<%=ViewPatronTypeForm.ID_ADD_CIRC_TYPE%>" alt='<%=MessageHelper.formatMessage("addCirculationType") %>'/></base:link>
                                    <logic:equal name="<%=ViewPatronTypeForm.FORM_NAME%>" property="<%=ViewPatronTypeForm.PARAM_DISTRICT_MODE%>" value="true">
                                        &nbsp;
                                        <base:link page = "<%=pushValuesLink %>" collectionType = "<%=form.getCollectionType()%>"><base:image src = "/buttons/large/push.gif" name="<%=ViewPatronTypeForm.ID_PUSH%>" alt='<%= MessageHelper.formatMessage("push") %>' /></base:link>
                                    </logic:equal>
                                  </td>
                               </tr>
                               <% if(form.canShowFollettShelfLink() && form.getFollettShelfLink() != null) { %>
                               <tr>
                                  <td>
                                     <span class="ColRow">To add Follett eBook Policies, click <a id="<%=ViewPatronTypeForm.ID_FOLLETT_SHELF %>" href="javascript:openWindow('<%=form.getFollettShelfLink() %>','','width=800,height=600,scrollbars=1')">here</a>.</span>
                                  </td>
                               </tr>
                               <% } %>
                            </table>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr><td><base:imageLine height="2" vspace="4" width="100%"/></td></tr>
    <% } %>
        <tr><td colspan="5">

            <table id="<%= ViewPatronTypeForm.TABLE_LOAN_POLICY %>" width="100%" border="0" cellspacing="5" cellpadding="0">

            <%
                if (form != null) {
                    Iterator iterator = form.getPatronTypeList().iterator();
                    int ptCount = 0;

                    while ( iterator.hasNext() ) {

                        PatronTypeWithCircPoliciesValue ptCPValue = (PatronTypeWithCircPoliciesValue) iterator.next();
                        Long patronTypeID = ptCPValue.getPatronTypeValue().getPatronTypeID();
            %>
                        <tr>
                            <td nowrap>
                                <span class="ColRowBold">
                                <%= ResponseUtils.filter(ptCPValue.getPatronTypeValue().getPatronTypeDescription()) %>
                                </span>

                                &nbsp;

                                <% if (store.allowSIF()) { %>
                                    <span class="Instruction">(SIF:
                                        <%= ResponseUtils.filter(PatronTypeSpecs.mapSifTypeDescription(ptCPValue.getPatronTypeValue().getSifType())) %>)
                                    </span>
                                <%  } %>

                                &nbsp;

                                <% if (ptCPValue.isDefaultPatronType()) { %>
                                    <base:image src="/icons/general/check_19.gif" width="19" height="16" alt='<%= MessageHelper.formatMessage("viewpatrontype_DefaultPatronType") %>'/> <span class="Instruction"><%= MessageHelper.formatMessage("viewpatrontype_DefaultPatronType") %></span>
                                    <base:helpTag helpFileName="d_default_patron_type.htm"/>
                                <%  } %>
                            </td>
                            <td class="tdAlignRight">
                                <%
                                    String deleteLink = "/backoffice/servlet/handleviewpatrontypeform.do?action=ConfirmDelete&patronTypeID=" +
                                        URLHelper.encodeURL(patronTypeID.toString());
                                    deleteLink = URLHelper.addHREFParam(deleteLink, "patronTypeDescription", ptCPValue.getPatronTypeValue().getPatronTypeDescription());
                                    deleteLink = URLHelper.addHREFParam(deleteLink, ViewPatronTypeForm.FIELD_DEFAULT_SIF_STAFF_PATRONTYPEID, form.getDefaultSIFStaffPatronTypeID());
                                    deleteLink = URLHelper.addHREFParam(deleteLink, ViewPatronTypeForm.FIELD_DEFAULT_SIF_STUDENT_PATRONTYPEID, form.getDefaultSIFStudentPatronTypeID());
                                    if ( form.isDistMode() ) {
                                        deleteLink = URLHelper.addHREFParam(deleteLink, ViewPatronTypeForm.PARAM_DISTRICT_MODE, "true");
                                    }
                                    String editLink = "/backoffice/servlet/presenteditpatrontypeform.do?action=edit&patronTypeID=" + patronTypeID.toString();
                                    if ( form.isDistMode() ) {
                                        editLink = URLHelper.addHREFParam(editLink, ViewPatronTypeForm.PARAM_DISTRICT_MODE, "true");
                                    }
                                %>
                                <base:link page="<%=editLink%>" collectionType="<%=form.getCollectionType()%>" id="<%=ViewPatronTypeForm.ID_PREFIX_EDIT + patronTypeID %>">
                                    <base:image src="/icons/general/edit.gif" alt='<%= MessageHelper.formatMessage("viewpatrontype_Edit",ResponseUtils.filter(ptCPValue.getPatronTypeValue().getPatronTypeDescription())) %>' width="19" height="16"/>
                                </base:link>
                                &nbsp;
                                <base:link page="<%=deleteLink%>" collectionType="<%=form.getCollectionType()%>" id="<%=ViewPatronTypeForm.ID_PREFIX_DELETE + patronTypeID %>">
                                    <base:image src="/icons/general/delete.gif" alt='<%= MessageHelper.formatMessage("viewpatrontype_Delete",ResponseUtils.filter(ptCPValue.getPatronTypeValue().getPatronTypeDescription())) %>' width="19" height="16"/>
                                </base:link>
                            </td>

                        </tr>
					  <% if (form.getCollectionType()!=BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK
					  	  && form.getCollectionType()!=BibMasterSpecs.COLLECTION_TYPE_ASSET) { %>
                            <tr>
                                <td colspan="2">
                                    <table width="100%" border="0" cellspacing="0" cellpadding="2">
                                        <tr>
                                            <td rowspan="5"><base:imageSpacer width="35" height="1"/></td>
                                        </tr>
                                        <tr>
                                                <td class="ColHeading"><%= MessageHelper.formatMessage("viewpatrontype_MaxCheckouts") %>&nbsp;</td>
                                            <td class="ColRow">
                                                <%= (String.valueOf(ptCPValue.getPatronTypeValue().getMaxCheckouts())) %>
                                            </td>
                                            <td><base:imageSpacer width="45" height="1"/></td>

                                            <td class="ColHeading"><%= MessageHelper.formatMessage("viewpatrontype_MaxHolds") %>&nbsp;</td>
                                            <td class="ColRow">
                                                <%= String.valueOf(ptCPValue.getPatronTypeValue().getMaxHolds()) %>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="ColHeading"><%= MessageHelper.formatMessage("viewpatrontype_FixedDueDate") %>&nbsp;</td>
                                            <td class="ColRow">
                                                <%
                                                    if (ptCPValue.getPatronTypeValue().getFixedDueDate() == null) {
                                                        out.println(MessageHelper.formatMessage("viewpatrontype_None"));
                                                    } else {
                                                        out.println(lh.formatDate(ptCPValue.getPatronTypeValue().getFixedDueDate()));
                                                    }
                                                %>
                                            </td>

                                            <td><base:imageSpacer width="45" height="1"/></td>

                                            <td nowrap class="ColHeading"><%= MessageHelper.formatMessage("viewpatrontype_ReadyHoldsExpireIn") %>&nbsp;</td>
                                            <td class="ColRow">
                                                <%= MessageHelper.formatMessage("viewpatrontype_Days", Long.valueOf(ptCPValue.getPatronTypeValue().getReadyHoldExpire())) %>
                                            </td>
                                        </tr>
                                        
                                        
                                        
                                        <tr>
                                            <td class="ColHeading"><%= MessageHelper.formatMessage("viewpatrontype_CeilingDate") %>&nbsp;</td>
                                            <td class="ColRow">
                                                <%
                                                    if (ptCPValue.getPatronTypeValue().getCeilingDueDate() == null) {
                                                        out.println(MessageHelper.formatMessage("viewpatrontype_None"));
                                                    } else {
                                                        out.println(lh.formatDate(ptCPValue.getPatronTypeValue().getCeilingDueDate()));
                                                    }
                                                %>
                                            </td>
                                            <td><base:imageSpacer width="45" height="1"/></td>

                                            <td nowrap class="ColHeading"><%= MessageHelper.formatMessage("viewpatrontype_PendingHoldsExpireIn") %>&nbsp;</td>
                                            <td class="ColRow">
                                                <%= MessageHelper.formatMessage("viewpatrontype_Days", Long.valueOf(ptCPValue.getPatronTypeValue().getPendingHoldExpire())) %>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="ColHeading" nowrap><%= MessageHelper.formatMessage("viewpatrontype_BlockOnFinesOverdues") %>&nbsp;</td>
                                            <td class="ColRow">
                                                <% if (ptCPValue.getPatronTypeValue().isBlockOnFinesOrOverdues()) { %><%= MessageHelper.formatMessage("viewpatrontype_Yes") %><% } else {%><%= MessageHelper.formatMessage("viewpatrontype_No") %><%} %>
                                            </td>
                                            <td><base:imageSpacer width="45" height="1"/></td>

                                            <td class="ColHeading" nowrap><%= MessageHelper.formatMessage("viewpatrontype_DefaultHoldPriority") %>&nbsp;</td>
                                            <td class="ColRow">
                                                <%= holdPriorityStrings[(int)ptCPValue.getPatronTypeValue().getDefaultPriority()] %>
                                            </td>
                                            
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2" class="ColRow">&nbsp;</td>
                            </tr>
                        <tr>
                            <td colspan="2">

            <%
                                List circPolicyList = ptCPValue.getCircPolicies();
                                Iterator circPolicyIterator = circPolicyList.iterator();

            %>


                            <table id='<%= "subtypelist_" + ptCount %>' width="100%" border="0" cellspacing="0" cellpadding="2">
                                <%ptCount++;%>
                                <tr>
                                    <td rowspan='<%="" + (circPolicyList.size() + 2)%>'><base:imageSpacer width="35" height="1"/></td>
                                </tr>
                                <tr>
                                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("viewpatrontype_CirculationType") %></td>
                                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("viewpatrontype_CheckoutLimit") %></td>
                                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("viewpatrontype_LoanPeriod") %></td>
                                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("viewpatrontype_GracePeriod") %></td>
                                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("viewpatrontype_Renewable") %></td>
                                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("viewpatrontype_FineIncrement") %></td>
                                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("viewpatrontype_MaxFine") %></td>
                                </tr>

            <%
                                while ( circPolicyIterator.hasNext()) {
                                    CircPolicyWithDescriptionsValue circPolicyVO = (CircPolicyWithDescriptionsValue) circPolicyIterator.next();
            %>
                                    <base:flipper key="viewpatrontype">
                                        <td class="ColRow">
                                            <%= ResponseUtils.filter(circPolicyVO.getCircTypeDescription()) %>
                                        </td>
                                        <td class="ColRow">
                                            <%= (circPolicyVO.getCircPolicyValue().getMaxCheckouts() != null
                                                ? circPolicyVO.getCircPolicyValue().getMaxCheckouts()
                                                : "") %>
                                        </td>
                                        <td class="ColRow">
                                            <%if (circPolicyVO.getCircPolicyValue().getPeriodType() == CircPolicySpecs.PERIOD_TYPE_DAILY) { 
                                                out.println( MessageHelper.formatMessage("viewpatrontype_Days", Long.valueOf(circPolicyVO.getCircPolicyValue().getLoanPeriod())));
                                             } else if (circPolicyVO.getCircPolicyValue().getPeriodType() == CircPolicySpecs.PERIOD_TYPE_FIXED) {
                                                out.println(MessageHelper.formatMessage("viewpatrontype_Fixed"));
                                             } else { 
                                                out.println(MessageHelper.formatMessage("viewpatrontype_Hours", Long.valueOf(circPolicyVO.getCircPolicyValue().getLoanPeriod())));
                                             } %>
                                        </td>
                                        <td class="ColRow">
                                            <%if (circPolicyVO.getCircPolicyValue().getPeriodType() == CircPolicySpecs.PERIOD_TYPE_HOURLY) { 
                                                out.println((circPolicyVO.getCircPolicyValue().getGracePeriod() == 0) ? MessageHelper.formatMessage("viewpatrontype_None") : MessageHelper.formatMessage("viewpatrontype_SameDay"));
                                              } else { 
                                                out.println(MessageHelper.formatMessage("viewpatrontype_Days", Long.valueOf(circPolicyVO.getCircPolicyValue().getGracePeriod())));
                                              } %>
                                        </td>
                                        <td class="ColRow">
                                            <%= MessageHelper.formatMessage("viewpatrontype_Times", Long.valueOf(circPolicyVO.getCircPolicyValue().getMaxRenewals())) %>
                                        </td>
                                        <td class="ColRow">
                                            <%=lh.formatCurrency(new CurrencyValue(circPolicyVO.getCircPolicyValue().getFineIncrement(), lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT)%> <nobr><%= MessageHelper.formatMessage("viewpatrontype_PerDay") %></nobr>
                                        </td>
                                        <td class="ColRow">
                                            <%=lh.formatCurrency(new CurrencyValue(circPolicyVO.getCircPolicyValue().getMaximumFine(), lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT)%>
                                        </td>
                                    </base:flipper>
            <%
                                }
            %>
                            </table>
                            </td>
                        </tr>
			            <% } %>
            <%
                    if (iterator.hasNext() ) {
            %>
                        <tr>
                          <td colspan="2">
                            <base:imageLine height="1" width="100%"/>
                          </td>
                        </tr>
            <%
                        }
                    }
                }
            %>
            </table>
        </td></tr>
        <% if (store.allowSIF()) { %>
        <tr>
            <td><base:imageLine height="2" vspace="1" width="100%"/></td>
        </tr>

        <tr>
        <td>
        <table id="<%=ViewPatronTypeForm.TABLE_SIF_DEFAULTS%>" cellpadding="3" border="0" cellspacing="0">
            <tr>
            <td class="ColRowBold" colspan="6"><%= MessageHelper.formatMessage("viewpatrontype_WhenSIFAddsPatronsUseTheSelectedPatronTypes") %></td>
            </tr>
            <tr>
            <td>
                <base:imageSpacer width="25" height="1"/>
            </td>
            <td class="ColRowBold"><%= MessageHelper.formatMessage("viewpatrontype_Staff") %></td>
            <td>
                <html:select property="<%= ViewPatronTypeForm.FIELD_DEFAULT_SIF_STAFF_PATRONTYPEID %>" onchange="submitDropDown()">
                    <html:options collection="defaultSIFStaffID" property="longID" labelProperty="stringDesc"/>
                </html:select>
            </td>
            <td>
                <base:imageSpacer width="25" height="1"/>
            </td>
            <td class="ColRowBold"><%= MessageHelper.formatMessage("viewpatrontype_Students") %></td>
            <td>
                <html:select property="<%= ViewPatronTypeForm.FIELD_DEFAULT_SIF_STUDENT_PATRONTYPEID %>" onchange="submitDropDown()">
                    <html:options collection="defaultSIFStudentID" property="longID" labelProperty="stringDesc"/>
                </html:select>
            </td>
            </tr>

        </table>
        </td>
        </tr>
        <% } %>
  	    <% if (form.getCollectionType()==BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK
  	    	|| form.getCollectionType()==BibMasterSpecs.COLLECTION_TYPE_ASSET) { %>
              <tr><td colspan="5"><base:imageLine height="2" vspace="4" width="100%"/></td></tr>
              <tr>
                <td colspan="5" class="ColRow tdAlignRight">
                    <base:link page="/backoffice/servlet/presenteditpatrontypeform.do?action=add" collectionType="<%=form.getCollectionType()%>"><base:image src="/buttons/large/addpatrontype.gif" alt='<%=MessageHelper.formatMessage("addPatronType")  %>'/></base:link>
                </td>
              </tr>
        <% } %>

      </base:outlinedTableAndTabsWithinThere>
  </td></tr>
  <% if (form.getCollectionType() != BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK && form.getCollectionType() != BibMasterSpecs.COLLECTION_TYPE_ASSET) { %>
  <tr>
    <td colspan="2" align="center" class="ColRow">
        <%
        String addPatLink = "/backoffice/servlet/presenteditpatrontypeform.do?action=add";
        String addCircLink = "/backoffice/servlet/presentcirctypeform.do";
        String pushValuesLink = "/backoffice/servlet/presentviewpatrontypeform.do?action=push";
        if ( form.isDistMode() ) {
            addPatLink = URLHelper.addHREFParam(addPatLink, ViewPatronTypeForm.PARAM_DISTRICT_MODE, "true");
            addCircLink = URLHelper.addHREFParam(addCircLink, ViewPatronTypeForm.PARAM_DISTRICT_MODE, "true");
            pushValuesLink = URLHelper.addHREFParam(pushValuesLink, ViewPatronTypeForm.PARAM_DISTRICT_MODE, "true");
        }
        %>
        <base:link page = "<%=addPatLink %>"     collectionType = "<%=form.getCollectionType()%>"><base:image src = "/buttons/large/addpatrontype.gif" alt = '<%= MessageHelper.formatMessage("addPatronType") %>'/></base:link>
        &nbsp;
        <base:link page = "<%=addCircLink %>"    collectionType = "<%=form.getCollectionType()%>"><base:image src = "/buttons/large/addcirculationtype.gif" alt = '<%= MessageHelper.formatMessage("addCirculationType") %>'/></base:link>
        <logic:equal name="<%=ViewPatronTypeForm.FORM_NAME%>" property="<%=ViewPatronTypeForm.PARAM_DISTRICT_MODE%>" value="true">
            &nbsp;
            <base:link page = "<%=pushValuesLink %>" collectionType = "<%=form.getCollectionType()%>"><base:image src = "/buttons/large/push.gif" alt = '<%= MessageHelper.formatMessage("push") %>' /></base:link>
        </logic:equal>
    </td>
  </tr>
  <% } %>
</table>
</base:form>
<script language="javascript">
<!--
function submitDropDown() {
        document.<%=ViewPatronTypeForm.FORM_NAME%>.<%=ViewPatronTypeForm.DROPDOWN_SUBMIT%>.value = 'true';
        document.<%=ViewPatronTypeForm.FORM_NAME%>.action.value = '';
        document.<%=ViewPatronTypeForm.FORM_NAME%>.submit();
}
// -->
</script>
