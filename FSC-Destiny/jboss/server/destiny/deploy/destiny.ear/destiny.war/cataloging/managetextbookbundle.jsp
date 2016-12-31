<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    ManageTextbookBundleForm form = (ManageTextbookBundleForm)request.getAttribute(ManageTextbookBundleForm.FORM_NAME);
    String unsavedChangesStyle = "";
    if (form.isQuantityEdited()) {
        unsavedChangesStyle = "visibility: show; display: block";
    } else {
        unsavedChangesStyle = "visibility: hidden; display: none";
    }
    String focusControl = form.gimmeOverrideFocusControl();
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>


<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.common.CurrencyValue"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%><bean:define id="searchTypes" name="cataloging_servlet_ManageTextbookBundleForm" property="searchTypes"/>

<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%><script language="JavaScript">
<!--
  function submitDropDown() {
      document.<%=ManageTextbookBundleForm.FORM_NAME%>.<%=ManageTextbookBundleForm.PARAM_SUBMITTED_DROPDOWN%>.value = "true";
      document.<%=ManageTextbookBundleForm.FORM_NAME%>.submit();
  }

function showEdited(e, bibID) {
    var whichCode = (window.Event) ? e.which : e.keyCode;
    if (e.keyCode == 13) {
        document.<%=ManageTextbookBundleForm.FORM_NAME%>.<%=ManageTextbookBundleForm.PARAM_WHERE_WAS_ENTER%>.value=bibID;                       
        document.<%=ManageTextbookBundleForm.FORM_NAME%>.<%=ManageTextbookBundleForm.FIELD_TRAP_ENTER_PRESSED%>.value = "true";
    } else {
        document.<%=ManageTextbookBundleForm.FORM_NAME%>.<%=ManageTextbookBundleForm.PARAM_QUANTITY_EDITED%>.value = "true";
        if (document.layers) { //netscape
            window.document['divUnsavedChanges'].visibility = 'show';
            window.document['divUnsavedChanges'].display = 'block';
        } else if (document.all) { //ie
            document.all['divUnsavedChanges'].style.visibility = 'visible';
            document.all['divUnsavedChanges'].style.display = 'block';
        } else if (document.getElementById) { //other
            document.getElementById('divUnsavedChanges').style.visibility = 'visible';
            document.getElementById('divUnsavedChanges').style.display = 'block';
        }
    }
    return whichCode;
}

function trapEnterKey(e, bibID) {
    var whichCode = (window.Event) ? e.which : e.keyCode;
    if (whichCode == 13) {
      if (bibID == -1) {
          whichCode = 10;
      } else {
          document.<%=ManageTextbookBundleForm.FORM_NAME%>.<%=ManageTextbookBundleForm.PARAM_WHERE_WAS_ENTER%>.value=bibID;                       
          document.<%=ManageTextbookBundleForm.FORM_NAME%>.<%=ManageTextbookBundleForm.FIELD_TRAP_ENTER_PRESSED%>.value = "true";
      }
    }
    return whichCode;
  }

function viewTitle(bibID) {
    document.<%=ManageTextbookBundleForm.FORM_NAME%>.<%=ManageTextbookBundleForm.PARAM_VIEW_BIB_ID%>.value = bibID;
    document.<%=ManageTextbookBundleForm.FORM_NAME%>.submit();
}


//-->
</script>


<base:messageBox strutsErrors="true"/>

<div id="divUnsavedChanges" style="<%=unsavedChangesStyle%>">
    <%
        String message = "Quantities have unsaved changes.</center>";
    %>
    <base:messageBox showWarningIcon="true" filterMessage="false" message='<%=message%>'></base:messageBox>
</div>

<script language="javaScript">
<!--
    window.focus();
// -->
</script>

<base:form action="/cataloging/servlet/handlemanagetextbookbundleform.do" focus="<%=focusControl%>">
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true" name="trapEnterKey">
    <html:hidden property="<%=ManageTextbookBundleForm.FIELD_BIBID%>"/>
    <html:hidden property="<%=ManageTextbookBundleForm.PARAM_SUBMITTED_DROPDOWN%>" value="false"/>
    <html:hidden property="<%=ManageTextbookBundleForm.PARAM_VIEW_BIB_ID%>"/>
    <html:hidden property="<%=ManageTextbookBundleForm.PARAM_QUANTITY_EDITED%>"/>

    <html:hidden property="<%=ManageTextbookBundleForm.PARAM_STORED_SEARCH_TYPE%>"/>
    <html:hidden property="<%=ManageTextbookBundleForm.PARAM_STORED_SEARCH_TEXT%>"/>
    <html:hidden property="<%=ManageTextbookBundleForm.PARAM_STORED_STATE_ID%>"/>
    <html:hidden property="<%=ManageTextbookBundleForm.PARAM_STORED_QUANTITY%>"/>
    <html:hidden property="<%=ManageTextbookBundleForm.PARAM_EXECUTED_SEARCH%>"/>
    <html:hidden property="<%=ManageTextbookBundleForm.PARAM_WHERE_WAS_ENTER%>" value="0"/>
    <html:hidden property="<%=ManageTextbookBundleForm.FIELD_TRAP_ENTER_PRESSED%>" value="false"/>

       <%-- Are we confirming a delete? --%>
    <base:outlinedTable id="<%=ManageTextbookBundleForm.TABLE_OUTLINE_MANAGE_BUNDLES%>" borderColor="#c0c0c0" width="100%">
       <tr>
          <td>
            <table width="100%">
               <tr>
                  <td valign="top">
                     <table id="<%=ManageTextbookBundleForm.TABLE_MANAGE_BUNDLES_HEADER%>" border="0" cellpadding="0" cellspacing="0" width="100%">
                        <tr>
                            <td valign="top" width="100%">
                                <!-- Title information -->
                                <table id="<%=ManageTextbookBundleForm.TABLE_MANAGE_BUNDLES_DETAIL%>" cellpadding="2" cellspacing="0">
                                    <%= form.gimmeTitleInformation() %>
                                </table>
                            </td>
                        </tr>
                     </table> <!-- end of the titleHeader table-->
                  </td>
               </tr>
            </table>
         </td>
      </tr>
      <tr>
         <td>
            <table id="<%=ManageTextbookBundleForm.TABLE_TITLES_SEARCH%>" width="100%" cellpadding="4">
               <tr>
                  <base:sectionHeading printerFriendly="false" heading="Select Titles to Assign" tdContent="width='100%' colSpan='2'"/>
               </tr>
               <tr>
                  <td valign="bottom">
                     <html:select property="<%=ManageTextbookBundleForm.FIELD_BUNDLE_SEARCH_OPTION %>" onchange="submitDropDown()" styleClass="ColRowBold">
                            <html:option value="<%= String.valueOf(ManageTextbookBundleForm.OPTION_CREATE_LIST) %>"><%=ManageTextbookBundleForm.OPTION_CREATE_LIST_DISPLAYABLE%></html:option>
                            <html:option value="<%= String.valueOf(ManageTextbookBundleForm.OPTION_SEARCH_FOR_TITLES) %>"><%=ManageTextbookBundleForm.OPTION_SEARCH_FOR_TITLES_DISPLAYABLE%></html:option>
                     </html:select>&nbsp;
                        
                     <logic:equal name="<%=ManageTextbookBundleForm.FORM_NAME%>" property="<%=ManageTextbookBundleForm.FIELD_BUNDLE_SEARCH_OPTION%>" value='<%= "" +ManageTextbookBundleForm.OPTION_CREATE_LIST%>'>
                        <span class="ColRowBold">State ID:&nbsp;<html:text property="<%=ManageTextbookBundleForm.FIELD_STATE_ID %>" size="21" onkeypress="trapEnterKey(event,0)"/>
                            &nbsp;Quantity:&nbsp;<html:text property="<%=ManageTextbookBundleForm.FIELD_QUANTITY %>" size="4" maxlength="3" onkeypress="trapEnterKey(event,0)"/>
                            <base:genericButton name="<%=ManageTextbookBundleForm.BUTTON_ADD %>" alt="Add" src="/buttons/small/add.gif" absbottom="true" /></span>
                     </logic:equal>
                     <logic:equal name="<%=ManageTextbookBundleForm.FORM_NAME%>" property="<%=ManageTextbookBundleForm.FIELD_BUNDLE_SEARCH_OPTION%>" value='<%= "" +ManageTextbookBundleForm.OPTION_SEARCH_FOR_TITLES%>'>
                        <span class="ColRowBold">Find:&nbsp;<html:text property="<%=ManageTextbookBundleForm.FIELD_SEARCH_TEXT %>" size="21" onkeypress="trapEnterKey(event,0)"/>
                            in &nbsp;<html:select property="<%=ManageTextbookBundleForm.FIELD_SEARCH_TYPE%>">
                                <html:options collection="searchTypes" property="stringCode" labelProperty="stringDesc"/>
                            </html:select>&nbsp;                        
                        <base:genericButton name="<%=ManageTextbookBundleForm.BUTTON_GO %>" alt="Go" src="/buttons/large/go.gif" absbottom="true"/></span>
                     </logic:equal>
                  </td>
                  <td class="tdAlignRight" valign="top">
                     <base:closeButton withX="true"/>
                  </td>
                  
               </tr>
  <%
      if (form.isExecutedSearch()) {
  %>
               <tr>
                  <td colspan="2" class="SmallColHeading">
                     Searched <%=form.getSearchTypeAsString()%> for &quot;<%=JSPHelper.filterHtmlAndNulls(form.getStoredTerm())%>&quot;
                  </td>
               </tr>
               <logic:present name="<%=ManageTextbookBundleForm.FORM_NAME%>" property="bundleSearchResults">
               <tr>
                  <td class="TableHeading" colspan="2">
                     <IMG height="1" vspace="1" src="/icons/general/line.gif" width="100%">
                  </td>
               </tr>
               </logic:present>
               <tr>
                  <td colspan="2">
                     <table id="<%=ManageTextbookBundleForm.TABLE_BUNDLE_SEARCH_RESULTS%>" width="100%" cellpadding="2" cellspacing="0">
                        <logic:present name="<%=ManageTextbookBundleForm.FORM_NAME%>" property="bundleSearchResults">
                           <bean:size id="listSize" name="<%=ManageTextbookBundleForm.FORM_NAME%>" property="bundleSearchResults"/>
                           <logic:notEqual name="listSize" value="0">
                        
                              <tr>
                                 <td class="SmallColHeading">Title<br/>Price / Adoption Year</td>
                                 <td class="SmallColHeading">ISBN<br/>Edition</td>
                                 <td class="SmallColHeading">State / TextbookID<br/>Publisher</td>
                                 <td class="SmallColHeading tdAlignRight">Quantity</td>
                                 <td class="tdAlignRight">
                                    <% if ( form.doINeedASelectButtonWithinThere() ) { %>
                                        <base:genericButton name="<%=ManageTextbookBundleForm.BUTTON_ATTACH_BUNDLES%>" alt="Select" src="/buttons/small/select.gif"/>
                                    <% } else { %>
                                        &nbsp;
                                    <% } %>
                                 </td>
                              </tr>
                              <logic:iterate indexId="flipper" id="record" name="<%=ManageTextbookBundleForm.FORM_NAME%>" property="bundleSearchResults" type="com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord">
                                 <tr valign="top" <%=( ( (1 & flipper.intValue())==0)? "bgColor=\"" + FlipperTag.ROW_GRAY + "\"" : "" )%> >
                                    <td class="ColRow" valign="top">
                                       <a href="javascript:viewTitle(<%=record.getRecID()%>);">
                                            <%=JSPHelper.filterHtmlAndNulls(record.getTitle())%>
                                       </a>
                                        
                                       <br/>
                                       <% if (record.getReplacementPrice() != null) { %>
                                          <%=lh.formatCurrency(record.getReplacementPriceCurrencyValue(), LocaleHelper.CURRENCY_OPTION_DEFAULT)%>
                                       <% } %>
                                       <% if (record.getAdoptionState() != null) { %>
                                        Adoption Year:&nbsp;<%= record.getAdoptionState() %>
                                       <% } %>
                                    </td>                
                                    <td class="ColRow">
                                       <%=JSPHelper.filterHtmlAndNulls(record.getDisplayableISBNOrISSN()) %><br/>
                                       <%=JSPHelper.filterHtmlAndNulls(record.getEdition()) %>
                                    </td>
                                    <td class="ColRow">
                                       <%=JSPHelper.filterHtmlAndNulls(record.getStateTextID()) %><br/>
                                       <%=JSPHelper.filterHtmlAndNulls(record.getPublisher()) %>
                                    </td>
                                    <td class="tdAlignRight">
                                       <% if (record.isBibExistsInBundle()) { %>
                                          <span class="SmallColHeading">Currently Selected</span>
                                       <% } else { %>
                                        <input type="text"
                                               name="<%=ManageTextbookBundleForm.FIELD_BUNDLE_TITLE_SEARCH_QUANTITY_PREFIX + record.getRecID()%>"
                                               value="<%=form.gimmeDisplayQuantity() %>"
                                               size="4"
                                               maxlength="3"
                                               onkeypress="trapEnterKey(event,<%=record.getRecID() %>)"/>
                                       <% } %>
                                    </td>
                                    <td>
                                        &nbsp;
                                    </td>
                                    
                                 </tr>
                              </logic:iterate>
                           </logic:notEqual>
                           <logic:equal name="listSize" value="0">
                              <tr>
                                 <td colspan="5" align="center" class="SmallColHeading">There are no titles found for this search.</td>
                              </tr>
                           </logic:equal>
                        </logic:present>
                    </table>
                 </td>
              </tr>
<% } %>        
<!-- START: This is where the textbook that are bundled will list out -->        
        
                <tr>
                   <base:sectionHeading printerFriendly="false" heading="Assigned Titles" tdContent="width='100%' colSpan='2'"/>
               </tr>
              <tr>
                 <td colspan="2">
                    <table id="<%=ManageTextbookBundleForm.TABLE_BUNDLE_TITLES%>" width="100%" cellpadding="2" cellspacing="0">
                       <bean:size id="listSize" name="<%=ManageTextbookBundleForm.FORM_NAME%>" property="bundledTitlesList"/>
                       <logic:notEqual name="listSize" value="0">
                          <tr>
                             <td class="SmallColHeading">Title</td>
                             <td class="SmallColHeading">ISBN<br/>Edition</td>
                             <td class="SmallColHeading">State / TextbookID<br/>Publisher</td>
                             <td class="SmallColHeading tdAlignRight">Quantity</td>
                             <td class="tdAlignRight">&nbsp;</td>
                          </tr>
                          <logic:iterate indexId="flipper" id="record" name="<%=ManageTextbookBundleForm.FORM_NAME%>" property="bundledTitlesList" type="com.follett.fsc.destiny.session.cataloging.data.BundledTitleVO">
                             <tr valign="top" <%=( ( (1 & flipper.intValue())==0)? "bgColor=\"#E8E8E8\"" : "" )%> >
                                <td class="ColRow" valign="top">
                                   <a href="javascript:viewTitle(<%=record.getBibID()%>);">
                                        <%=JSPHelper.filterHtmlAndNulls(record.getTitle())%>
                                   </a>
                                    
                                   <br/>
                                   <% if (record.getReplacementPrice() != null) { %>
                                      <%=lh.formatCurrency(new CurrencyValue(record.getReplacementPrice(), lh.getRegionFormatCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT)%>
                                   <% } %>
                                   <% if (record.getAdoptionYear() != null) { %>
                                      Adoption Year:&nbsp;<%= record.getAdoptionYear() %>
                                   <% } %>
                                </td>                
                                <td class="ColRow">
                                   <%=JSPHelper.filterHtmlAndNulls(record.getDisplayableIsbnStrippedOfPrefix()) %><br/>
                                   <%=JSPHelper.filterHtmlAndNulls(record.getEdition()) %>
                                </td>
                                <td class="ColRow">
                                   <%=JSPHelper.filterHtmlAndNulls(record.getStateTextbookID()) %><br/>
                                   <%=JSPHelper.filterHtmlAndNulls(record.getPublisher()) %>
                                </td>
                                <td class="ColRowBold tdAlignRight">
                                        <input type="text"
                                               value="${record.quantity}"
                                               name="<%=ManageTextbookBundleForm.FIELD_BUNDLE_TITLE_QUANTITY_PREFIX + record.getBibID()%>"
                                               size="4" onkeypress="showEdited(event,<%=record.getBibID() %>)"
                                               maxlength="3"/>
                                    
                                </td>
                                <td class="tdAlignRight">
                                        <base:link page='<%= form.gimmeRemoveBundleTitleLink(record.getBibID()) %>'>
                                        <base:image src="/icons/general/x.gif" alt="<%=ManageTextbookBundleForm.LINK_REMOVE_BUNDLE_TITLE%>"/>
                                        </base:link>
                                  &nbsp;
                                </td>
                                
                             </tr>
                          </logic:iterate>
                          <tr>
                             <td class="SmallColHeading tdAlignRight" colspan="5">
                                <base:genericButton name="<%=ManageTextbookBundleForm.BUTTON_SAVE_QUANTITY %>" alt="Update Quantities" src="/buttons/large/quantities.gif" absbottom="true"/>
                             </td>
                          </tr>
                       </logic:notEqual>
            
                       <logic:equal name="listSize" value="0">
                          <tr><td colspan="3" align="center" class="SmallColHeading">No textbooks have been assigned to this bundle.</td></tr>
                       </logic:equal>
                    </table>
                 </td>
               </tr>
<!-- END: This is where the textbook that are bundled will list out -->        
            </table>
         </td>
      </tr>
   </base:outlinedTable>
</base:form>



