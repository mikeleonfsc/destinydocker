<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>

<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.*"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*"%>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CircPolicySpecs"%>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.session.circulation.ejb.CirculationPolicyAEDSpecs" %>
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


<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<script language="JavaScript" type="text/javascript">
<!--

    function openWindow(url,name,features) {
       var win = window.open(url,name,features);
    }
// -->
</script>

<%@page import="com.follett.fsc.common.CurrencyValue"%><bean:define id="circulationTypesID" name="backoffice_servlet_ViewCircTypeForm" property="circulationTypes"/>
<base:messageBox strutsErrors="true"/>
<%
    ViewCircTypeForm form = (ViewCircTypeForm) request.getAttribute(ViewCircTypeForm.FORM_NAME);
	SessionStoreProxy store = form.getStore();
	LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    
    String selectedTab = null;
    String selectedTabID = null;
    
    Tab[] tabs = { 
        new TabUsingLink(MessageHelper.formatMessage("viewpatrontype_TabName"),
            form.gimmePatronTypeTabLink(), 
            true, 
            ViewPatronTypeForm.ID_TAB_NAME), 
        new TabUsingLink(MessageHelper.formatMessage("viewcirctype_TabName"), 
            null,
            true,
            ViewCircTypeForm.ID_TAB_NAME)
    };
    selectedTab = MessageHelper.formatMessage("viewcirctype_TabName");
    selectedTabID = ViewCircTypeForm.ID_TAB_NAME;
%>
<base:form action="/backoffice/servlet/handleviewcirctypeform.do">
    <html:hidden property="<%=GenericForm.PARAM_COLLECTION_TYPE%>"/>
    <html:hidden property="circTypeID"/>
    <html:hidden property="action"/>
    <logic:equal name="<%=ViewCircTypeForm.FORM_NAME%>" property="<%=ViewCircTypeForm.PARAM_DISTRICT_MODE%>" value="true">
      <html:hidden property="<%=ViewCircTypeForm.PARAM_DISTRICT_MODE%>"/>
    </logic:equal>
    <logic:equal name = "<%=ViewCircTypeForm.FORM_NAME %>" property = "action" value = "push">
     <base:messageBox showRedBorder="true">
            <tr valign="center">
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td class="ColRowBold" align="center"><%= MessageHelper.formatMessage("viewcirctype_YourCurrentDistrictSettingsWillBePushedTo") %><base:selectSiteAndSiteType 
                            name="<%= ViewCircTypeForm.FIELD_SITE_LIMITER%>" 
                            selectedSiteID="true"
                            includeForLibrarySites="true"
                            includeForTextbookSites="false"
                            includeForAssetSites="false"
                            includeDistrictWarehouse="false"
                        /></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td class="ColRow" align="center"><%= MessageHelper.formatMessage("viewcirctype_ThisProcessCannotBeReversed") %></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td class="ColRow" align="center"><%= MessageHelper.formatMessage("viewcirctype_AreYouSureYouWantToProceed") %></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td valign="baseline" align="center" class="ColRow">
                    <base:yesNo/>
                </td>
            </tr>
        </base:messageBox>   
    </logic:equal>
    
    <logic:equal name="backoffice_servlet_ViewCircTypeForm" property="action" value="ConfirmDelete">
        <base:messageBox showRedBorder="true">
        <%
        if (form.isLastCirculationType()) {
        %>
        <tr valign="top">
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td class="ColRowBold" align="center"><%= MessageHelper.formatMessage("viewcirctype_YouCannotDeleteYourLastCirculationType") %></td>
        </tr>
        <%
        }
        else {
        %>
        <tr valign="top">
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td class="ColRowBold" align="center"><%= MessageHelper.formatMessage("viewcirctype_TheCirculationTypeWillBeDeleted",ResponseUtils.filter(form.getCircTypeDescription())) %></td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td>
            <table border="0" align="center">
                <% if (form.getNumberOfCopies() > 0) { %>
                <tr>
                    <td class="ColRow">
                        <ul>
                            <li><%= MessageHelper.formatMessage("viewcirctype_CopiesUsingThisCirculationType", Long.valueOf(form.getNumberOfCopies())) %><br><%= MessageHelper.formatMessage("viewcirctype_ChangeCirculationTypeTo")%> <html:select property="<%=ViewCircTypeForm.FIELD_NEW_CIRC_TYPE_ID %>">
                                <html:options collection="circulationTypesID" property="longID" labelProperty="stringDesc"/>
                                </html:select>
                            </li>
                        </ul>
                    </td>
                </tr>
                <% }
                if (form.isDefaultCirculationType()) { %>
               <tr>
                    <td class="ColRow">
                        <ul>
                            <li><%= MessageHelper.formatMessage("viewcirctype_ThisIsYourDefaultCirculationType") %><br><%= MessageHelper.formatMessage("viewcirctype_SelectNewDefault") %> <html:select property="<%=ViewCircTypeForm.FIELD_NEW_DEFAULT_CIRC_TYPE_ID %>">
                                <html:options collection="circulationTypesID" property="longID" labelProperty="stringDesc"/>
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
            <td align="center" class="ColRow"><%= MessageHelper.formatMessage("viewcirctype_AreYouSureYouWantToDeleteThisCirculationType") %></td>
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
</base:form>

<table align="center" border="0" width="95%" cellpadding="0" cellspacing="0">
    <tr><td>
      <base:outlinedTableAndTabsWithinThere id="LoanPoliciesNavigationTabs" width="100%" borderColor='#C0C0C0' selectedTabID = "<%=selectedTabID %>" selectedTab="<%=selectedTab%>" tabs="<%=tabs%>">
        <tr>
            <td style = "font-weight:bold"><%= MessageHelper.formatMessage("viewcirctype_CircTypes") %></td>
            <td class="tdAlignRight">

                <%
                String addPatLink = "/backoffice/servlet/presenteditpatrontypeform.do?action=add";
                String addCircLink = "/backoffice/servlet/presentcirctypeform.do";
                String pushValuesLink = "/backoffice/servlet/handleviewcirctypeform.do?action=push";
                if ( form.isDistMode() ) {
                    addPatLink = URLHelper.addHREFParam(addPatLink, ViewCircTypeForm.PARAM_DISTRICT_MODE, "true");
                    addCircLink = URLHelper.addHREFParam(addCircLink, ViewCircTypeForm.PARAM_DISTRICT_MODE, "true");
                    pushValuesLink = URLHelper.addHREFParam(pushValuesLink, ViewCircTypeForm.PARAM_DISTRICT_MODE, "true");
                }
                %>
                
                <table>
                   <tr>
                      <td>
                        <base:link page="<%=addPatLink %>" collectionType="<%=form.getCollectionType()%>"><base:image src="/buttons/large/addpatrontype.gif" name="<%=ViewPatronTypeForm.ID_ADD_PATRON_TYPE %>" alt='<%= MessageHelper.formatMessage("addPatronType") %>'/></base:link>
                        &nbsp;
                        <base:link page="<%=addCircLink %>" collectionType="<%=form.getCollectionType()%>"><base:image src="/buttons/large/addcirculationtype.gif" name="<%=ViewPatronTypeForm.ID_ADD_CIRC_TYPE %>"alt='<%= MessageHelper.formatMessage("addCirculationType") %>'/></base:link>
                        <logic:equal name="<%=ViewCircTypeForm.FORM_NAME%>" property="<%=ViewCircTypeForm.PARAM_DISTRICT_MODE%>" value="true">
                            &nbsp;
                            <base:link page = "<%=pushValuesLink %>" collectionType = "<%=form.getCollectionType()%>"><base:image src = "/buttons/large/push.gif" name="<%=ViewPatronTypeForm.ID_PUSH %>" alt='<%= MessageHelper.formatMessage("push") %>' /></base:link>
                        </logic:equal>
                      </td>
                   </tr>
                   <% if(form.canShowFollettShelfLink() && form.getFollettShelfLink()!= null) { %>
                   <tr>
                      <td>
                         <span class="ColRow">To add Follett eBook Policies, click <a id="<%=ViewCircTypeForm.ID_FOLLETT_SHELF %>" href="javascript:openWindow('<%=form.getFollettShelfLink() %>','','width=800,height=600,scrollbars=1')">here</a>.</span>
                      </td>
                   </tr>
                   <% } %>
                </table>
            </td>
    </tr>
    <tr><td colspan = "2"><base:imageLine height="2" vspace="4" width="100%"/></td></tr>
    <tr><td colspan="2">                        

            <table id="<%= ViewCircTypeForm.TABLE_LOAN_POLICY %>" width="100%" border="0" cellspacing="5" cellpadding="0">

            <%
                if (form != null) {
                    Iterator iterator = form.getCircTypeList().iterator();
                    int ctCount = 0;

                    while ( iterator.hasNext() ) {

                        HashMap map = ( HashMap ) iterator.next();
                        Long circTypeID = ( Long ) map.get( "circTypeID" );
            %>
                        <tr>
                            <td nowrap>
                                <span class="ColRowBold">
                                <%= ResponseUtils.filter((String) map.get("circTypeDescription")) %>
                                </span>

                                &nbsp;

                                <% if (((Boolean) map.get("hideFromPatron")).booleanValue()) { %>
                                    <span class="ColHeading"><font color="#cc0000"><%= MessageHelper.formatMessage("viewcirctype_Hidden") %></font></span>
                                    <base:helpTag helpFileName="d_hidden_materials.htm"/>
                                <%  } %>

                                &nbsp;

                                <% if (((Boolean) map.get("isDefault")).booleanValue()) { %>
                                    <base:image src="/icons/general/check_19.gif" width="19" height="16" alt='<%= MessageHelper.formatMessage("viewcirctype_DefaultCirculationType" )%>'/> <span class="Instruction"><%= MessageHelper.formatMessage("viewcirctype_DefaultCirculationType") %></span>
                                    <base:helpTag helpFileName="d_default_circulation_type.htm"/>
                                <%  } %>


                            </td>
                            <td class="tdAlignRight">
                                <%
                                String editLink = "/backoffice/servlet/presentcirctypeform.do?action=edit&circTypeID=" + circTypeID.toString();
                                if ( form.isDistMode() ) {
                                    editLink = URLHelper.addHREFParam(editLink, ViewCircTypeForm.PARAM_DISTRICT_MODE, "true");
                                }
                                %>
                                <base:link page='<%= editLink %>' collectionType="<%=form.getCollectionType()%>" id="<%=ViewCircTypeForm.ID_PREFIX_EDIT + circTypeID %>">
                                    <base:image src="/icons/general/edit.gif" alt='<%=MessageHelper.formatMessage("viewcirctype_Edit", ResponseUtils.filter((String) map.get("circTypeDescription"))) %>' width="19" height="16"/>
                                </base:link>
                                &nbsp;
                                <%
                                String deleteLink = "/backoffice/servlet/handleviewcirctypeform.do?action=ConfirmDelete&circTypeID=" + URLHelper.encodeURL(circTypeID.toString()) + "&circTypeDescription=" + URLHelper.encodeURL((String)map.get("circTypeDescription"));
                                if ( form.isDistMode() ) {
                                    deleteLink = URLHelper.addHREFParam(deleteLink, ViewCircTypeForm.PARAM_DISTRICT_MODE, "true");
                                }
                                %>                                
                                <base:link page='<%=deleteLink%>' collectionType="<%=form.getCollectionType()%>" id="<%=ViewCircTypeForm.ID_PREFIX_DELETE + circTypeID %>">
                                    <base:image src="/icons/general/delete.gif" alt='<%=MessageHelper.formatMessage("viewcirctype_Delete", ResponseUtils.filter((String) map.get("circTypeDescription"))) %>' width="19" height="16"/>
                                </base:link>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <table id="<%=ViewCircTypeForm.TABLE_VIEW_DEFAULT_SETTINGS %>" width="100%" border="0" cellspacing="0" cellpadding="2">
                                    <tr>
                                        <td rowspan="5"><base:imageSpacer width="35" height="1"/></td>
                                    </tr>
                                    <tr>
                                        <td nowrap class="ColHeading" colspan="5"><%= MessageHelper.formatMessage("viewcirctype_DefaultSettings") %></td>
                                    </tr>
                                    <tr>
                                        <td nowrap class="ColHeading"><%= MessageHelper.formatMessage("viewcirctype_LoanPeriod") %>&nbsp;</td>
                                        <td class="ColRow">
                                            <%if (((Long)map.get("defaultPeriodType")).longValue() == CircPolicySpecs.PERIOD_TYPE_DAILY) { %>
                                                <%= MessageHelper.formatMessage("viewcirctype_Days", map.get("defaultLoanPeriod")) %>
                                            <% } else if (((Long)map.get("defaultPeriodType")).longValue() == CircPolicySpecs.PERIOD_TYPE_FIXED) { %>
                                                <%= MessageHelper.formatMessage("viewcirctype_Fixed") %>
                                            <% } else { %>
                                                <%= MessageHelper.formatMessage("viewcirctype_Hours", map.get("defaultLoanPeriod")) %>
                                            <% } %>
                                        </td>

                                        <td>
                                            <base:imageSpacer width="25" height="1"/>
                                        </td>
                                        <td nowrap class="ColHeading"><%= MessageHelper.formatMessage("viewcirctype_FineIncrement") %>&nbsp;</td>
                                        <td class="ColRow">
                                            <nobr><%= MessageHelper.formatMessage("viewcirctype_PerDay", lh.formatCurrency(new CurrencyValue((Long)map.get("defaultFineIncrement"), lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT)) %> </nobr>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="ColHeading" nowrap><%= MessageHelper.formatMessage("viewcirctype_GracePeriod") %>&nbsp;</td>
                                        <td class="ColRow">
                                            <%
                                            long pt = ((Long)map.get("defaultPeriodType")).longValue();
                                            if (pt == CircPolicySpecs.PERIOD_TYPE_DAILY || pt == CircPolicySpecs.PERIOD_TYPE_FIXED) { %><%= MessageHelper.formatMessage("viewcirctype_Days", map.get("defaultGracePeriod") )%>
                                            <% } else { %>
                                                <%=(((Long)map.get("defaultGracePeriod")).longValue() == 0) ? MessageHelper.formatMessage("viewcirctype_None") : MessageHelper.formatMessage("viewcirctype_SameDay")%>
                                            <%  } %>
                                        </td>
                                        <td>
                                            <base:imageSpacer width="25" height="1"/>
                                        </td>
                                        <td nowrap class="ColHeading"><%= MessageHelper.formatMessage("viewcirctype_MaxFine") %>&nbsp;</td>
                                        <td class="ColRow">
                                            <%=lh.formatCurrency(new CurrencyValue((Long)map.get("defaultMaxFine"), lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT)%>
                                        </td>
                                    </tr>

                                    <tr>
                                        <td nowrap class="ColHeading"><%= MessageHelper.formatMessage("viewcirctype_Renewable") %>&nbsp;</td>
                                        <td class="ColRow">
                                            <%= MessageHelper.formatMessage("viewcirctype_Times", map.get("defaultMaxRenewals")) %>
                                        </td>
                                        <td>
                                            <base:imageSpacer width="25" height="1"/>
                                        </td>
                                        <td class="ColHeading"><%= MessageHelper.formatMessage("viewcirctype_OverdueToLost") %></td>
                                        <td class="ColRow">
	                                        <%
	                                        	boolean overdueLostEnabled = ((Boolean) map.get("defaultOverdueToLostEnable")).booleanValue();
	                                        	String overdueLostOutput = overdueLostEnabled ?
	                                        		MessageHelper.formatMessage("viewcirctype_Days",
                                                        (Long) map.get("defaultOverdueToLostDays"))
	                                        		: MessageHelper.formatMessage("viewcirctype_NA");
	                                		%>
                                        	<%=overdueLostOutput%>
                                        </td>
                                    </tr>



                                </table>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" class="ColRow">&nbsp;</td>
                        </tr>

                        <tr>
                            <td colspan="2" width="95%">
            <%
                                List patronTypeList = (List) map.get("patronTypes");
                                Iterator patronTypeIterator = patronTypeList.iterator();
            %>
                            <table id='<%="subtypelist_" + ctCount%>' width="100%" border="0" cellspacing="0" cellpadding="2">
                                <% ctCount++; %>
                                <tr>
                                    <td rowspan='<%="" + (patronTypeList.size() + 2)%>'><base:imageSpacer width="35" height="1"/></td>
                                </tr>
                                <tr>
                                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("viewcirctype_PatronType") %></td>
                                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("viewcirctype_CheckoutLimit") %></td>
                                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("viewcirctype_LoanPeriod") %></td>
                                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("viewcirctype_GracePeriod") %></td>
                                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("viewcirctype_Renewable") %></td>
                                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("viewcirctype_FineIncrement") %></td>
                                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("viewcirctype_MaxFine") %></td>
                                </tr>

            <%

                                while ( patronTypeIterator.hasNext()) {
                                    HashMap ptMap = (HashMap) patronTypeIterator.next();
            %>
                                    <base:flipper key="viewcirctype">
                                        <td class="ColRow">
                                            <%=ResponseUtils.filter((String) ptMap.get("patronTypeDescription")) %>
                                        </td>
                                        <td class="ColRow">
                                            <%= (ptMap.get(CirculationPolicyAEDSpecs.MAP_MAXCHECKOUTS) != null
                                                ? ptMap.get(CirculationPolicyAEDSpecs.MAP_MAXCHECKOUTS)
                                                : "") %>
                                        </td>
                                        <td class="ColRow">
                                             <%if (((Long)ptMap.get("periodType")).longValue() == CircPolicySpecs.PERIOD_TYPE_DAILY) {
                                                out.println(MessageHelper.formatMessage("viewcirctype_Days",ptMap.get("loanPeriod")));
                                             } else if (((Long)ptMap.get("periodType")).longValue() == CircPolicySpecs.PERIOD_TYPE_FIXED) {
                                                out.println(MessageHelper.formatMessage("viewcirctype_Fixed"));
                                             } else {
                                                out.println(MessageHelper.formatMessage("viewcirctype_Hours",ptMap.get("loanPeriod")) );
                                             } %>
                                        </td>
                                        <td class="ColRow">
                                            <%if (((Long)ptMap.get("periodType")).longValue() == CircPolicySpecs.PERIOD_TYPE_HOURLY) {
                                                out.println((((Long)ptMap.get("gracePeriod")).longValue() == 0) ? MessageHelper.formatMessage("viewcirctype_None") : MessageHelper.formatMessage("viewcirctype_SameDay"));
                                              } else {
                                                out.println(MessageHelper.formatMessage("viewcirctype_Days", ptMap.get("gracePeriod")));
                                              } %>
                                        </td>
                                        <td class="ColRow">
                                            <%= MessageHelper.formatMessage("viewcirctype_Times", ptMap.get("maxRenewals")) %>
                                        </td>
                                        <td class="ColRow">
                                            <nobr><%= MessageHelper.formatMessage("viewcirctype_PerDay", lh.formatCurrency(new CurrencyValue((Long)ptMap.get("fineIncrement"), lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT)) %></nobr>
                                        </td>
                                        <td class="ColRow">
                                            <%=lh.formatCurrency(new CurrencyValue((Long)ptMap.get("maximumFine"), lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT)%>
                                        </td>
                                    </base:flipper>
            <%
                                }
            %>
                            </table>
                            </td>
                        </tr>

            <%
                        if (iterator.hasNext()) {
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
      </base:outlinedTableAndTabsWithinThere>
  </td></tr>
  <tr>
    <td colspan="2" align="center" class="ColRow">

        <%
        String addPatLink = "/backoffice/servlet/presenteditpatrontypeform.do?action=add";
        String addCircLink = "/backoffice/servlet/presentcirctypeform.do";
        String pushValuesLink = "/backoffice/servlet/handleviewcirctypeform.do?action=" + ViewCircTypeForm.ACTION_PUSH_VALUES;
        if ( form.isDistMode() ) {
            addPatLink = URLHelper.addHREFParam(addPatLink, ViewCircTypeForm.PARAM_DISTRICT_MODE, "true");
            addCircLink = URLHelper.addHREFParam(addCircLink, ViewCircTypeForm.PARAM_DISTRICT_MODE, "true");
            pushValuesLink = URLHelper.addHREFParam(pushValuesLink, ViewPatronTypeForm.PARAM_DISTRICT_MODE, "true");
        }
        %>
        <base:link page="<%=addPatLink %>" collectionType="<%=form.getCollectionType()%>"><base:image src="/buttons/large/addpatrontype.gif" alt='<%= MessageHelper.formatMessage("addPatronType") %>'/></base:link>
        &nbsp;
        <base:link page="<%=addCircLink %>" collectionType="<%=form.getCollectionType()%>"><base:image src="/buttons/large/addcirculationtype.gif" alt='<%= MessageHelper.formatMessage("addCirculationType") %>'/></base:link>
        <logic:equal name="<%=ViewCircTypeForm.FORM_NAME%>" property="<%=ViewCircTypeForm.PARAM_DISTRICT_MODE%>" value="true">
            &nbsp;
            <base:link page = "<%=pushValuesLink %>" collectionType = "<%=form.getCollectionType()%>"><base:image src = "/buttons/large/push.gif" alt = '<%= MessageHelper.formatMessage("push") %>' /></base:link>
        </logic:equal>
    </td>
  </tr>
</table>
