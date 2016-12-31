<%@page import="com.follett.fsc.destiny.session.cataloging.ejb.AssetSearchFacadeSpecs"%>
<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page
    import="com.follett.fsc.destiny.client.cataloging.servlet.AssetPowerSearchForm"%>
<%@ page
    import="com.follett.fsc.destiny.client.cataloging.servlet.AssetSearchNavigationForm"%>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LookupSpecs"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.SiteTypeSpecs"%>
<%@ page import="com.follett.fsc.destiny.session.cataloging.ejb.AssetSearchFacadeSpecs"%>
<%@ page import="com.follett.fsc.destiny.util.Permission"%>
<%@ page import="java.util.List"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator"%>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>

<%
    AssetPowerSearchForm form = (AssetPowerSearchForm) request
					.getAttribute(AssetPowerSearchForm.FORM_NAME);

    LocaleHelper lh = UserContext.getMyContextLocaleHelper();

			List keywordList = (List) request.getAttribute("MyKeywordList");
			boolean haveResults = (keywordList != null)
					&& (keywordList.size() > 0);
			String focusControl = AssetPowerSearchForm.FIELD_KEYWORD_TEXT;
			if (haveResults) {
				// we don't want to focus on anything in the form if we've got results or if we aren't displaying search criteria
				focusControl = "";
			}

			request.setAttribute("parentFormName",
					"cataloging_servlet_AssetPowerSearchForm");
%>
<script language="JavaScript" type="text/javascript">
  <!--
  function trapEnterKey(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        document.<%=AssetPowerSearchForm.FORM_NAME%>.<%=AssetPowerSearchForm.PARAM_ENTER_KEY_PRESSED%>.value = "true";
        document.<%=AssetPowerSearchForm.FORM_NAME%>.submit();
         doSubmit = false; <!-- needed so there is not another submit from the form. was saubmitting 2x in IE when 'enter' key was used-->
      } else if (e.keyCode == 9) {
          <!-- tab to search button, not clear button -->
          e.preventDefault ? e.preventDefault() : event.returnValue = false;   <!-- ie doesnt have preventDefault, need to use event for IE 8 -->
          document.getElementById('<%=AssetPowerSearchForm.BUTTON_SEARCH%>').focus();
      }
    }
  
    function onSearchTypeChange() {
        document.<%=AssetPowerSearchForm.FORM_NAME%>.<%=AssetPowerSearchForm.PARAM_SEARCH_TYPE_CHANGED%>.value = "true";
        document.<%=AssetPowerSearchForm.FORM_NAME%>.submit();
    
	}
    
    function onLookInChange() {
        document.<%=AssetPowerSearchForm.FORM_NAME%>.<%=AssetPowerSearchForm.PARAM_LOOK_IN_CHANGED%>.value = "true";
        document.<%=AssetPowerSearchForm.FORM_NAME%>.submit();
    
    }
    function submitOnTemplateChange() {
    	document.<%=AssetPowerSearchForm.FORM_NAME%>.<%=AssetPowerSearchForm.PARAM_ASSET_TEMPLATE_TYPE_CHANGED%>.value = "true";
        document.<%=AssetPowerSearchForm.FORM_NAME%>.submit();
    }

	// -->
</script>

    <bean:define id="assets" name="<%=AssetPowerSearchForm.FORM_NAME%>" property="assetTreeOptionList" />
    <bean:define id="searchOptions" name="<%=AssetPowerSearchForm.FORM_NAME%>" property="searchOptions" />
    <bean:define id="locations" name="<%=AssetPowerSearchForm.FORM_NAME%>" property="homeLocationList" />
    <bean:define id="fundingSources" name="<%=AssetPowerSearchForm.FORM_NAME%>" property="fundingSourceList" />
    <bean:define id="departments" name="<%=AssetPowerSearchForm.FORM_NAME%>" property="departmentList" />

    <html:hidden property="<%=AssetPowerSearchForm.PARM_LAST_SORT%>"/>
    <html:hidden property="<%=AssetPowerSearchForm.PARM_DESCEND%>"/>
    <html:hidden property="<%=AssetPowerSearchForm.PARM_DATE_DESCEND%>" />
    <html:hidden property="<%=AssetPowerSearchForm.PARAM_SELECT_ONLY%>" />
    <html:hidden property="<%=AssetPowerSearchForm.PARAM_TO_RETURN%>" />
    <html:hidden property="<%=AssetPowerSearchForm.PARAM_SEARCH_TYPE_CHANGED%>" />
    <html:hidden property="<%=AssetPowerSearchForm.PARAM_LOOK_IN_CHANGED%>" />
    <html:hidden property="<%=AssetPowerSearchForm.PARAM_ASSET_TEMPLATE_TYPE_CHANGED%>" />
    <html:hidden property="<%=AssetPowerSearchForm.PARAM_ENTER_KEY_PRESSED%>" />
    <html:hidden property="<%=AssetPowerSearchForm.PARAM_SEARCH_TYPE_FOR_SEARCH%>" />
    <html:hidden property="<%=AssetPowerSearchForm.PARAM_CUSTODIANID%>" />
    <html:hidden property="<%=AssetPowerSearchForm.PARAM_CUSTODIANID_FOR_SEARCH%>" />
    <html:hidden property="<%=AssetPowerSearchForm.PARAM_ASSET_TEMPLATEID_FOR_SEARCH%>" />
    <html:hidden property="<%=AssetPowerSearchForm.PARAM_HOMELOCATION_ID_FOR_SEARCH%>" />
    <html:hidden property="<%=AssetPowerSearchForm.PARAM_FUNDINGSOURCE_ID_FOR_SEARCH%>" />
    <html:hidden property="<%=AssetPowerSearchForm.PARAM_DEPARTMENT_ID_FOR_SEARCH%>" />
    <html:hidden property="<%=AssetPowerSearchForm.PARAM_KEYWORD_TEXT_FOR_SEARCH%>" />
    <html:hidden property="<%=AssetPowerSearchForm.PARAM_SITEID_FOR_SEARCH%>" />
    <html:hidden property="<%=AssetPowerSearchForm.PARAM_SITE_TYPE_ID_FOR_SEARCH%>" />
    <html:hidden property="<%=AssetPowerSearchForm.PARAM_SEARCH_OPTION_FOR_SEARCH%>" />
    <html:hidden property="<%=AssetPowerSearchForm.PARAM_PURCHASE_PRICE_FOR_SEARCH%>" />
    <html:hidden property="<%=AssetPowerSearchForm.PARAM_PURCHASE_PRICE_MODE_FOR_SEARCH%>" />
    <html:hidden property="<%=AssetPowerSearchForm.PARAM_OLD_SITE_ID%>" />
    <html:hidden property="<%=AssetPowerSearchForm.PARAM_OLD_SITE_TYPE_ID%>" />
    <html:hidden property="<%=AssetPowerSearchForm.PARAM_DATE_FROM_FOR_SEARCH%>" />
    <html:hidden property="<%=AssetPowerSearchForm.PARAM_DATE_TO_FOR_SEARCH%>" />
    <html:hidden property="<%=AssetPowerSearchForm.PARAM_DATE_FROM_FOR_HISTORICAL_SEARCH%>" />
    <html:hidden property="<%=AssetPowerSearchForm.PARAM_DATE_TO_FOR_HISTORICAL_SEARCH%>" />
    <html:hidden property="<%=AssetPowerSearchForm.FIELD_KITS_FOR_SEARCH%>" />
    <html:hidden property="<%=AssetPowerSearchForm.FIELD_TEACHERS_EDITION_FOR_SEARCH%>" />

    <logic:equal name='<%= AssetPowerSearchForm.FORM_NAME %>' property="printerFriendly" value="false">
    <base:outlinedTableAndTabsWithinThere
        id="<%=AssetPowerSearchForm.TABLE_MAIN%>" borderColor="#C0C0C0"
        selectedTab="<%=AssetPowerSearchForm.TAB%>"
        selectedTabID="<%=AssetSearchNavigationForm.ID_TAB_POWER_SEARCH_ASSETS%>"
        tabs="<%=AssetSearchNavigationForm.getTabs(form.getSessionStore(),
					form.getSelectOnly())%>">
      <tr>
        <td class="TableHeading" align="left" colspan="2">Search&nbsp;for&nbsp;Resources&nbsp;and&nbsp;Items</td>
      </tr>
      <tr>
            <td align="center">
                <table border="0" width="65%" id="<%=AssetPowerSearchForm.TABLE_SUB_MAIN%>" cellpadding="10">
                    <!-- Asset template selector -->
                    <tr>
                        <td class="FormLabel tdAlignRight">Find&nbsp;all</td>
                        <% if (form.isDisplayDropdown()) { %>
                            <td width="60%" align="left">
                                <html:select
                                    property="<%=AssetPowerSearchForm.FIELD_ASSET_TEMPLATEID%>" onchange="submitOnTemplateChange()">
                                    <html:options collection="assets"
                                        property="longID" labelProperty="stringDesc" />
                                </html:select>
                             </td>
                        <% } else { %>
                            <td class="ColRow tdAlignLeft" width="60%">
                                <%= form.getAssetTreeOptionList().getString(0) %>
                            </td>
                        <%} %>
                        <td class="ColRowBold"><base:genericButton name="<%=AssetPowerSearchForm.BUTTON_SEARCH%>" src="/buttons/large/search.gif" alt='<%=MessageHelper.formatMessage("search")%>' useNBSP="false"/></td>
                    </tr>
                    <logic:equal name="<%=AssetPowerSearchForm.FORM_NAME%>" property="<%=AssetPowerSearchForm.PARAM_ASSET_TEMPLATE_TEXTBOOK%>" value="true">
                    <tr>
                        <td>&nbsp;</td>
                        <td class="ColRow" colspan="2" align="left">
                        <html:checkbox property="<%=AssetPowerSearchForm.FIELD_TEACHERS_EDITION %>"></html:checkbox>Include Teachers' Editions&nbsp;&nbsp;&nbsp;
                        <html:checkbox property="<%=AssetPowerSearchForm.FIELD_KITS %>"></html:checkbox>Include Resource Kits
                        </td>
                    </tr>
                    </logic:equal>
                    
                    <!--  Search selector -->
                    <tr>
                        <td class="ColRowBold tdAlignRight">
                            Where&nbsp;<%=form.isAssetSearchType() ? "Resource" : "Item"%></td>
                        <td>
                            <table id="<%=AssetPowerSearchForm.TABLE_SEARCH_FIELDS%>">
                                <tr>
                                    <td>
                                        <select name="<%=AssetPowerSearchForm.FIELD_SEARCH_TYPE%>" onchange="onSearchTypeChange()">
                                            <optgroup label="Resource">
                                                <logic:equal name="<%=AssetPowerSearchForm.FORM_NAME%>" property="<%=AssetPowerSearchForm.PARAM_ASSET_TEMPLATE_TEXTBOOK%>" value="true">
                                                    <option value="<%=AssetSearchFacadeSpecs.SEARCH_TYPE_ISBN%>" <%= form.getSearchType() ==  AssetSearchFacadeSpecs.SEARCH_TYPE_ISBN ? "SELECTED" : "" %>>ISBN</option>
                                                    <option value="<%=AssetSearchFacadeSpecs.SEARCH_TYPE_STATE_TEXTBOOK_ID%>" <%= form.getSearchType() ==  AssetSearchFacadeSpecs.SEARCH_TYPE_STATE_TEXTBOOK_ID ? "SELECTED" : "" %>>State/Textbook ID</option>
                                                </logic:equal>
                                            
                                            
                                                <option value="<%=AssetSearchFacadeSpecs.SEARCH_TYPE_KEYWORD%>" <%= form.getSearchType() ==  AssetSearchFacadeSpecs.SEARCH_TYPE_KEYWORD ? "SELECTED" : "" %>>Keyword</option>
                                                <logic:iterate id="extraAssetField" name="<%=AssetPowerSearchForm.FORM_NAME%>" property="extraAssetFields" type="com.follett.fsc.destiny.util.lookup.LongStringLookup">
                                                    <option value="<%=extraAssetField.getLongID().intValue()%>" <%= form.getSearchType() == extraAssetField.getLongID().intValue() ? "SELECTED" : "" %>>-- <%=extraAssetField.getStringDesc() %></option>
                                                </logic:iterate>
                                            </optgroup>
                                            <optgroup label="Item">                                          
                                                <option value="<%=AssetSearchFacadeSpecs.SEARCH_TYPE_BARCODE%>" <%= form.getSearchType() ==  AssetSearchFacadeSpecs.SEARCH_TYPE_BARCODE ? "SELECTED" : "" %>>Barcode</option>
                                                <option value="<%=AssetSearchFacadeSpecs.SEARCH_TYPE_DISTRICT_ID%>" <%= form.getSearchType() ==  AssetSearchFacadeSpecs.SEARCH_TYPE_DISTRICT_ID ? "SELECTED" : "" %>>District Identifier</option>
                                                <option value="<%=AssetSearchFacadeSpecs.SEARCH_TYPE_PURCHASE_ORDER%>" <%= form.getSearchType() ==  AssetSearchFacadeSpecs.SEARCH_TYPE_PURCHASE_ORDER ? "SELECTED" : "" %>>Purchase Order</option>
                                                <option value="<%=AssetSearchFacadeSpecs.SEARCH_TYPE_SERIAL_NUMBER%>" <%= form.getSearchType() ==  AssetSearchFacadeSpecs.SEARCH_TYPE_SERIAL_NUMBER ? "SELECTED" : "" %>>Serial Number</option>
                                            </optgroup>
                                        </select>
                                    </td>
                                    <% if (form.doesSearchTypeNeedContains()) {%>
                                        <td class="ColRow">
                                            <html:select property="<%=AssetPowerSearchForm.FIELD_SEARCH_OPTION%>">
                                                <html:options
                                                    collection="searchOptions"
                                                    property="stringCode"
                                                    labelProperty="stringDesc" />
                                            </html:select>
                                        </td> 
                                    <% } else { %>
                                    <html:hidden property="<%=AssetPowerSearchForm.FIELD_SEARCH_OPTION%>"/>
                                    <%}%>  
                                    <td class="ColRow">
                                        <html:text
                                            property="<%=AssetPowerSearchForm.FIELD_KEYWORD_TEXT%>"
                                            size="50"
                                            onkeydown="return trapEnterKey(event);" />
                                    </td>
                                </tr>
                            </table>
                        </td>
                        <td class="ColRowBold">&nbsp;<base:genericButton name="<%=AssetPowerSearchForm.BUTTON_CLEAR%>"  src="/buttons/large/clear.gif"  alt='<%= MessageHelper.formatMessage("clear") %>' useNBSP="false"/></td>
                    </tr>
                       
                            
                        <!-- TABLE_SEARCH_FIELDS  -->
                    <!--  Site type selector -->
                    <base:isDistrictUser>
                        <tr>
                            <td class="ColRowBold tdAlignRight">Look in</td>
                            <td align="left" colspan="1"><base:selectSiteAndSiteType
                                    name="<%=AssetPowerSearchForm.FIELD_SITE_LIMITER%>"
                                    selectedSiteID="<%=form.getSiteLimiter()%>"
                                    includeForLibrarySites="false"
                                    includeForTextbookSites="false"
                                    includeForAssetSites="true"
                                    onChangeAction="onLookInChange()" />
                            </td>
                        </tr>
                    </base:isDistrictUser>
                    <base:isNotDistrictUser>
                    <base:spanIfAllowed
                            permission="<%=Permission.CAT_ASSET_SEARCH_ALL_ASSET_SITES%>">
                            <tr>
                                <td class="ColRowBold tdAlignRight">Look in</td>
                                <td align="left" colspan="1"><base:selectSiteType
                                        name="<%=AssetPowerSearchForm.FIELD_SITE_TYPE_ID%>"
                                        selectedSiteTypeID="<%=form.getSiteTypeID()%>"
                                        mode="<%=LookupSpecs.MODE_SEARCH_INCLUDE_UNASSIGNED%>"
                                        includeForMediaSites="false"
                                        includeForLibrarySites="false"
                                        includeForTextbookSites="false"
                                        includeForAssetSites="true"
                                        onChangeAction="onLookInChange()" />
                                </td>
                            </tr>
                        </base:spanIfAllowed>
                        <base:spanIfNotAllowed
                            permission="<%=Permission.CAT_ASSET_SEARCH_ALL_ASSET_SITES%>">
                            <input type="hidden"
                                name="<%=AssetPowerSearchForm.FIELD_SITE_TYPE_ID%>"
                                value="<%=SiteTypeSpecs.SITE_TYPE_ID_MY_LIBRARY%>" />
                        </base:spanIfNotAllowed>
                       
                    </base:isNotDistrictUser>
                    <tr>
                        <td class="TableHeading" align="center" colspan="2">Limit your search for <%=form.isAssetSearchType() ? "resources" : "items"%> by...</td>
                    </tr>
                    <tr>
                      <td colspan="2" align="center">
                        <table id="<%=AssetPowerSearchForm.TABLE_LIMITERS%>" cellpadding="5">
                            <% if  (form.isDisplayableHomeLocation()) { %>
                                <tr>
                                <td class="ColRowBold tdAlignRight" nowrap>Home Location</td>
                                    <td valign="top" class="ColRow" align="left">
                                        <html:select property="<%=AssetPowerSearchForm.FIELD_HOMELOCATION_ID%>">
                                            <html:options collection="locations" property="longID" labelProperty="stringDesc" />
                                        </html:select>
                                     </td>  
                                </tr>
                            <% } %>    
                            <tr>
                                <td class="ColRowBold tdAlignRight" nowrap>Custodian</td>
                                <td>
                                    <table id="<%=AssetPowerSearchForm.TABLE_CUSTODIAN%>" border="0" cellpadding="0" cellspacing="0">
                                        <tr>
                                            <td class="ColRow tdAlignLeft" nowrap width="1%"><%=form.getCustodianName() %></td>
                                            <td valign="top" class="ColRow tdAlignLeft" width="1%">
                                                <input type="image" src='<%=lh.getLocalizedImagePath("/buttons/large/selectplus.gif")%>'
                                                    name="<%=AssetPowerSearchForm.BUTTON_CUSTODIAN_SELECT%>"
                                                    id="<%=AssetPowerSearchForm.BUTTON_CUSTODIAN_SELECT%>"
                                                    alt="Select Custodian"
                                                    title="Select Custodian" />
                                             </td>
                                             <% if  (form.getCustodianID() != null) { %>  
                                                 <td class="ColRow"  align="left">&nbsp;&nbsp;
                                                    <input type="image" src='<%=lh.getLocalizedImagePath("/buttons/large/clear.gif")%>' 
                                                        name="<%=AssetPowerSearchForm.BUTTON_CUSTODIAN_CLEAR%>" 
                                                        id="<%=AssetPowerSearchForm.BUTTON_CUSTODIAN_CLEAR%>" 
                                                        alt="Clear Custodian"
                                                         title="Clear Custodian" />
                                                 </td>  
                                             <% } else { %>
                                                 <td  align="left">&nbsp;</td>       
                                             <% } %>
                                         </tr>
                                    </table>
                                </td>
                            </tr>  
                            
                            <tr>
                            <td class="ColRowBold tdAlignRight" nowrap>Funding Source</td>
                                <td valign="top" class="ColRow" align="left">
                                    <html:select property="<%=AssetPowerSearchForm.FIELD_FUNDINGSOURCE_ID%>">
                                        <html:options collection="fundingSources" property="longID" labelProperty="stringDesc"/>
                                    </html:select>
                                </td>  
                            </tr>
                            <tr>
                            <td class="ColRowBold tdAlignRight" nowrap>Department</td>
                                <td valign="top" class="ColRow" align="left">
                                    <html:select property="<%=AssetPowerSearchForm.FIELD_DEPARTMENT_ID%>">
                                        <html:options collection="departments" property="longID" labelProperty="stringDesc"/>
                                    </html:select>
                                </td>  
                            </tr>
                            <tr>
                            <td class="ColRowBold tdAlignRight" nowrap>
                                Purchase Price 
                            </td>
                            <td class="ColRow" colspan="3" align="left">
                                <table id="<%=AssetPowerSearchForm.TABLE_PURCHASE_PRICE%>" border="0" cellpadding="0" cellspacing="0">
                                    <tr>
                                        <td>
                                            <html:select property="<%=AssetPowerSearchForm.FIELD_PURCHASE_PRICE_MODE%>">
                                                <html:option value="<%=String.valueOf(AssetSearchFacadeSpecs.PRICE_GREATER_THAN_EQUAL)%>">Greater than or equal to</html:option>
                                                <html:option value="<%=String.valueOf(AssetSearchFacadeSpecs.PRICE_LESS_THAN)%>">Less than</html:option>
                                            </html:select>
                                        </td>
                                        <td>
                                            &nbsp;<html:text property="<%=AssetPowerSearchForm.FIELD_PURCHASE_PRICE%>" size="10" maxlength="10" onkeydown="return trapEnterKey(event);"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                        </td>
                                   </tr>
                               </table>
                            </td>
                        </tr>
                        <tr>
                            <td class="ColRowBold tdAlignRight">Date Acquired</td>
                            <td class="ColRowBold" valign="bottom" align="left">
                                    <base:dateRange 
                                        dateFrom="<%=form.getDateFrom()%>"
                                        dateTo="<%=form.getDateTo()%>"
                                    />
                            </td>
                        </tr>
                       <base:spanIfAllowed
                          permission="<%=Permission.BACK_OFFICE_VIEW_HISTORICAL_NOTES%>">
                        <tr>
                            <td class="ColRowBold tdAlignRight">Historical Notes</td>
                            <td class="ColRowBold" valign="bottom" >
                              <table id="<%=AssetPowerSearchForm.TABLE_HISTORICAL_NOTE%>" border="0" cellpadding="0" cellspacing="0">
                                    <tr>
                                        <td nowrap>
                                            <html:select property="<%=AssetPowerSearchForm.FIELD_HISTORICALNOTE_SEARCH_TYPE%>">
                                                <html:option value="<%=String.valueOf(AssetSearchFacadeSpecs.HISTORICAL_NOTES_CONTAINS)%>">Contains</html:option>
                                                <html:option value="<%=String.valueOf(AssetSearchFacadeSpecs.HISTORICAL_NOTES_STARTS_WITH)%>">Starts with</html:option>
                                            </html:select>
                                            &nbsp;<html:text property="<%=AssetPowerSearchForm.FIELD_HISTORICALNOTE_SEARCH%>" size="10" maxlength="10" onkeydown="return trapEnterKey(event);"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                        </td>
                                        <td nowrap>
                                            <base:dateRange 
                                                dateFrom="<%=form.getDateFromHistoricalSearch()%>"
                                                dateTo="<%=form.getDateToHistoricalSearch()%>"
                                                buttonFromDate="<%=form.BUTTON_HIST_SEACH_FROM%>"
                                                buttonToDate="<%=form.BUTTON_HIST_SEACH_TO%>"
                                                fromName="<%=form.FIELD_HISTORICALNOTE_DATE_FROM%>"
                                                toName="<%=form.FIELD_HISTORICALNOTE_DATE_TO%>"
                                            />
                                        </td>
                                   </tr>
                               </table>                          
                            </td>
                        </tr>   
                    </base:spanIfAllowed>
                        </table>
                      </td>                    
                      <td class="ColRowBold" valign="bottom"><base:genericButton name="<%=AssetPowerSearchForm.BUTTON_SEARCH%>"  src="/buttons/large/search.gif"  alt='<%= MessageHelper.formatMessage("search") %>' useNBSP="false"/></td>
                    </tr>
                </table>
            </td>
        </tr>

    </base:outlinedTableAndTabsWithinThere>
    </logic:equal>
    
    <script language="JavaScript" type="text/javascript">
    <!--
        var searchType = document.forms["<%=AssetPowerSearchForm.FORM_NAME%>"].elements["<%=AssetPowerSearchForm.FIELD_SEARCH_TYPE%>"];
        if(searchType.value == "<%=String.valueOf(AssetSearchFacadeSpecs.SEARCH_TYPE_BARCODE)%>"){
           var selectControl = document.forms["<%=AssetPowerSearchForm.FORM_NAME%>"].elements["<%=AssetPowerSearchForm.FIELD_KEYWORD_TEXT%>"];
           if (selectControl.type != "hidden" && !selectControl.disabled && selectControl.style.display != "none") {
              selectControl.select();
           }
        }   
    //-->    
    </script>
