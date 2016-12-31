<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LookupSpecs" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CopySpecs" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.util.filters.BarcodeFilterFactory" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.QuickPickSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.consortium.ejb.ConsortiumFacadeSpecs" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.NotesListForm"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.jsptag.EditCopyDropDownTag"%>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%-- I18n Support --%>
<%@ taglib uri="/WEB-INF/jstl-format.tld" prefix="fmt"%>


<%-- @include file="/common/trapenter.jsp" --%>
<%-- Delete CopyEditLibraryForm.TABLE_CATEGORIES code and enable the above include after fixing compile jsp --%>

<script language="JavaScript">
<!--
    function trapEnter(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        return false;
      }
      return true;
    }       

    function submitSymbologyChange() {
        document.<%=CopyEditLibraryForm.FORM_NAME%>.submit();
    }
    
//-->
</script>

<logic:equal name="<%=CopyEditLibraryForm.FORM_NAME%>" property="hideFieldsForDistrictEBooks" value="false">
    <bean:define id="circTypesID" name="<%=CopyEditLibraryForm.FORM_NAME%>" property="circTypes"/>
</logic:equal>
<bean:define id="form" name="<%=CopyEditLibraryForm.FORM_NAME%>" type="com.follett.fsc.destiny.client.cataloging.servlet.CopyEditLibraryForm" />
<c:set var="myForm" value='<%=request.getAttribute("cataloging_servlet_CopyEditLibraryForm")%>'/>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    Permission permConfigSite = Permission.BACK_OFFICE_CHANGE_SITE_PREFERENCES;
    Permission permForPrintLabel[] = new Permission[] { Permission.BACK_OFFICE_GENERATE_REPORTS, Permission.DISTRICT_CREATE_DISTRICT_REPORTS};
    boolean isBarcodeFilteringEnabled = form.isFilteringOn();
%>

<base:messageBox strutsErrors="true"/>

<%
    String focus = "";
    if (!CopyEditLibraryForm.RADIO_ASSIGN_NEXT_BARCODE.equals(form.getAssignNextBarcode())) {
    	focus = CopyEditLibraryForm.FIELD_COPY_BARCODE;
    }
%>
<base:form action="/cataloging/servlet/handlecopyeditlibraryform.do" focus="<%=focus%>">

<html:hidden property="<%=CopyEditLibraryForm.PARAM_ORIGINAL_COPY_STATUS%>" />
<html:hidden property="<%=CopyEditLibraryForm.PARAM_ORIGINAL_COPY_BARCODE%>" />
<html:hidden property="unofficialSublocation" />
<html:hidden property="unofficialVendor" />
<html:hidden property="unofficialFundingSource" />
<html:hidden property="copyID" />
<html:hidden property="bibID" />
<html:hidden property="updated" />
<html:hidden property="runJobAlways" />
<input type="hidden" name="changedSiteTypeDropDown"/>
<input type="hidden" name="changedDistrictDropDown"/>

<html:hidden property="title" />
<html:hidden property="author" />
<html:hidden property="defaultCallNumber" />
<html:hidden property="originalSiteID" />
<html:hidden property="lastSiteID" />
<html:hidden property="pageTitle" />
<html:hidden property="action" />
<html:hidden property="actionBackup"/>

    <logic:equal name="<%=CopyEditLibraryForm.FORM_NAME%>" property="showMoveSiteMessage" value="true">
   <%
       String[] messageText = new String[]{ MessageHelper.formatMessage("copyedit_AreYouSureYouWantToMoveThisCopy") };
   %>
        <base:confirmBox showWarningIcon="true"
            header=" ${myForm.moveSiteMessage}"           
            messageText="<%=messageText%>" 
            yesName="<%=CopyEditLibraryForm.BUTTON_CONFIRM_YES%>"
            noName="<%=CopyEditLibraryForm.BUTTON_CONFIRM_NO%>" />
    </logic:equal>


    <logic:equal name="<%=CopyEditLibraryForm.FORM_NAME%>" property="showMultipleCopyAddConfirmation" value="true">
          <%
              String[] messageText = null;
                    if (form.isRunAsJob() && !CopyEditLibraryForm.RADIO_ASSIGN_NEXT_BARCODE.equals(form.getAssignNextBarcode()) && !form.isEmptyBarcode()){
              messageText = new String[]{ MessageHelper.formatMessage("copyedit_BarcodesAlreadyInUseWillBeSkipped"), MessageHelper.formatMessage("copyedit_AreYouSureYouWantToAddTheseCopies")};
                    } else {
              messageText = new String[]{ MessageHelper.formatMessage("copyedit_AreYouSureYouWantToAddTheseCopies") };
                    }
          %>
        <base:confirmBox showWarningIcon="true"
            showPleaseWait="true" 
            alsoCallToHide = "hideElementonSave"          
            header=" ${myForm.multipleCopyAddConfirmationMessage}"           
            messageText="<%=messageText%>"
            yesName="<%=CopyEditLibraryForm.BUTTON_CONFIRM_YES%>"
            noName="<%=CopyEditLibraryForm.BUTTON_CONFIRM_NO%>"/> 

    </logic:equal>

<%
    if (isBarcodeFilteringEnabled) {
%>
    <base:barcodeFilterWarning/>
<%
    }
%>

<table border="0" cellpadding="2" cellspacing="0" width="100%">
  <tr>
    <td>
      <table border="0" cellpadding="2" cellspacing="0" width="100%" id="<%=CopyEditLibraryForm.TABLE_MAIN_COPY_EDIT%>">
        <tr>
          <td colspan="2">
            <%--
                 Don't do cellpadding here or else things will be off center
                 when either author or callnumber is empty.
            --%>
            <table border="0" cellpadding="0" cellspacing="0" align="center" id="<%=CopyEditLibraryForm.TABLE_HEADER%>">
              <tr>
                <td class="TableHeading" align="center" vAlign="top" colspan="5">
                <!-- leave the image here, otherwise it drops the page too far down -->
                <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=CopyEditLibraryForm.BUTTON_TRAP_ENTER_KEY%>">
                <bean:write name="<%=CopyEditLibraryForm.FORM_NAME%>" property="<%=CopyEditLibraryForm.FIELD_TITLE%>"/></td>
              </tr>
              <tr>
                <%-- We only display the author and default call number if they are not blank --%>
                <base:notEmpty name="<%=CopyEditLibraryForm.FORM_NAME%>" property="<%=CopyEditLibraryForm.FIELD_AUTHOR%>">
                  <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("copyedit_Author") %>&nbsp;&nbsp;</td>
                  <td class="SmallColRow"><bean:write name="<%=CopyEditLibraryForm.FORM_NAME%>" property="<%=CopyEditLibraryForm.FIELD_AUTHOR%>"/></td>
                </base:notEmpty>
                <base:empty name="<%=CopyEditLibraryForm.FORM_NAME%>" property="<%=CopyEditLibraryForm.FIELD_AUTHOR%>">
                  <td></td>
                  <td></td>
                </base:empty>
                <%
                    if (!StringHelper.isEmpty(form.getAuthor()) && ! StringHelper.isEmpty(form.getDefaultCallNumber())) {
                %>
                  <td>&nbsp;&nbsp;&nbsp;</td>
                <%
                    } else {
                %>
                  <td></td>
                <%
                    }
                %>
                <base:notEmpty name="<%=CopyEditLibraryForm.FORM_NAME%>" property="<%=CopyEditLibraryForm.FIELD_DEFAULT_CALL_NUMBER%>">
                  <td class="SmallColHeading tdAlignRight"><%= MessageHelper.formatMessage("copyedit_CallNumberFromTitle") %>&nbsp;&nbsp;</td>
                  <td class="SmallColRow"><bean:write name="<%=CopyEditLibraryForm.FORM_NAME%>" property="<%=CopyEditLibraryForm.FIELD_DEFAULT_CALL_NUMBER%>"/></td>
                </base:notEmpty>
                <base:empty name="<%=CopyEditLibraryForm.FORM_NAME%>" property="<%=CopyEditLibraryForm.FIELD_DEFAULT_CALL_NUMBER%>">
                  <td></td>
                  <td></td>
                </base:empty>
              </tr>
            </table>
          </td>
        </tr>
        <tr>
          <td colspan="2"><base:imageLine height="1" width="100%" /></td>
        </tr>
        
    <%-- SITE TYPE / SITE DROP DOWN FUNCTIONALITY!--%>        
	 <base:isDistrictUser>
		<logic:equal name="<%=CopyEditLibraryForm.FORM_NAME%>" property="editInTransit" value="false">
		<logic:equal name="<%=CopyEditLibraryForm.FORM_NAME%>" property="hideFieldsForDistrictEBooks" value="true">
            <html:hidden property="<%=CopyEditLibraryForm.FIELD_COPY_SITE_ID%>"/>
        </logic:equal>
		<logic:equal name="<%=CopyEditLibraryForm.FORM_NAME%>" property="hideFieldsForDistrictEBooks" value="false">
	        <tr>
	            <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("copyedit_SiteType") %></td>
	            <td class="FormElement">
	                <base:selectSiteType name="<%=form.FIELD_SITE_TYPE_ID%>" 
	                    selectedSiteTypeID="<%=form.getSiteTypeID()%>"  
	                    mode="<%=LookupSpecs.MODE_DISTRICT_USER_AECOPY_LIST%>" 
	                    includeForMediaSites="false" 
	                    includeForLibrarySites="true" includeForTextbookSites="false" includeForAssetSites="false"
						onChangeAction="this.form.changedSiteTypeDropDown.value=true; this.form.submit(); return false;" />
	            </td>
	        </tr>
	        <tr>
	          <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("copyedit_SiteName") %></td>
	          <td class="FormElement">
	            <base:selectSite 
	                name="<%=CopyEditLibraryForm.FIELD_COPY_SITE_ID%>" 
	                selectedSiteID='<%=""+form.getCopySiteID()%>' 
	                siteTypeID='<%=form.getSiteTypeID()%>' 
	                onChangeAction="this.form.submit(); return false;"
	                includeLibrarySites='<%=BibMasterSpecs.COLLECTION_TYPE_LIBRARY == form.getCollectionType()%>'
	        		includeTextbookSites='false'
	        		includeMediaSites='<%=BibMasterSpecs.COLLECTION_TYPE_MEDIA == form.getCollectionType()%>'
	        		includeAssetSites="false"
                    />
                <base:helpTag helpFileName="d_choose_site_LM.htm"/>
	          </td>
	        </tr>
		</logic:equal>
		</logic:equal>
        <html:hidden property="<%=CopyEditForm.FIELD_DISTRICT_CONTEXT%>"/>
	 </base:isDistrictUser>
     
	 <base:isNotDistrictUser>
        <html:hidden property="<%=CopyEditLibraryForm.FIELD_COPY_SITE_ID%>" />
	 </base:isNotDistrictUser>
     
    <%-- END SITE TYPE / SITE DROP DOWN FUNCTIONALITY!--%>        
     
    <%-- BEGIN COPY STATUS DROP DOWN --%>        
     
		<tr>
	    	<td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("copyedit_Status") %></td>
	        <%
	            if (form.isStatusEditable()) {
	        %>
	        	<td class="ColRow">
	            	<html:select property="<%=CopyEditLibraryForm.FIELD_COPY_STATUS_AS_LONG%>">
	                    <html:option value='<%=""+CopySpecs.STATUS_AVAILABLE%>'><%=MessageHelper.formatMessage(CopySpecs.KEY_STATUS_AVAILABLE)%></html:option>
	                    <html:option value='<%=""+CopySpecs.STATUS_LOANED_OUT%>'><%=MessageHelper.formatMessage(CopySpecs.KEY_STATUS_LOANED_OUT)%></html:option>
	                    <html:option value='<%=""+CopySpecs.STATUS_ON_ORDER%>'><%=MessageHelper.formatMessage(CopySpecs.KEY_STATUS_ON_ORDER)%></html:option>
	                    <html:option value='<%=""+CopySpecs.STATUS_OUT_FOR_REPAIRS%>'><%=MessageHelper.formatMessage(CopySpecs.KEY_STATUS_OUT_FOR_REPAIRS)%></html:option>

	 					<base:isDistrictUser>
		 					<%
		 					    if (form.isAbleToBeInTransit()) {
		 					%>
		                      	<html:option value='<%=""+CopySpecs.STATUS_IN_TRANSIT%>'><%=MessageHelper.formatMessage(CopySpecs.KEY_STATUS_IN_TRANSIT)%></html:option>
		                    <%
		                        }
		                    %>
	                    </base:isDistrictUser>
	                    
	                </html:select>
	                <base:helpTag helpFileName="d_copy_status_TM.htm"/>
	            </td>
	          <%
	              } else {
	          %>
	            <html:hidden property="<%=CopyEditLibraryForm.FIELD_COPY_STATUS_AS_LONG%>"/>
	            <td class="ColRow">
	                <bean:write name="<%=CopyEditLibraryForm.FORM_NAME%>" property="<%=CopyEditLibraryForm.FIELD_COPY_STATUS%>"/>
	                <base:helpTag helpFileName="d_copy_status_TM.htm"/>
	            </td>
	          <%
	              }
	          %>
		</tr>
        
    <%-- END COPY STATUS DROP DOWN --%>        
        
        <%
            if (form.getCopyID() == null || new Long(0).equals(form.getCopyID())) {
        %>    
            <tr>
              <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("copyedit_NumberOfCopies") %></td>
              <td nowrap>
                <span onKeyPress="return trapEnter(event);" class="ColRow">
                  <html:text disabled="<%=isBarcodeFilteringEnabled%>" property="<%=CopyEditLibraryForm.FIELD_NUMBER_OF_COPIES%>" size="7" maxlength="3"/>
                </span>
              </td>
            </tr>
            <logic:equal name="<%=CopyEditLibraryForm.FORM_NAME%>" property="hideFieldsForDistrictEBooks" value="true">
                <html:hidden property="<%=CopyEditLibraryForm.FIELD_ASSIGN_NEXT_BARCODE%>" />
                <html:hidden property="<%=CopyEditLibraryForm.FIELD_COPY_BARCODE%>" />
            </logic:equal>
            <c:if test="${! form.hideFieldsForDistrictEBooks && !form.shelfBib && !form.resoldShelfBib}">
                <tr>
                  <td class="ColRowBold tdAlignRight" valign="top"><%= MessageHelper.formatMessage("copyedit_StartingBarcode") %></td>
                  <td class="ColRow" nowrap>
                    <logic:equal name="<%=CopyEditLibraryForm.FORM_NAME%>" property="showAutoAssignNextBarcode" value="true">
                        <html:radio property="<%=CopyEditLibraryForm.FIELD_ASSIGN_NEXT_BARCODE%>" value="<%=CopyEditLibraryForm.RADIO_EXPLICIT_BARCODE%>"
                            onclick='<%="document." + CopyEditLibraryForm.FORM_NAME + "." + CopyEditLibraryForm.FIELD_COPY_BARCODE + ".focus();"%>'>
                        </html:radio>
                    </logic:equal>
                    <span onKeyPress="return trapEnter(event);" class="ColRow">
                    <logic:equal name="<%=CopyEditLibraryForm.FORM_NAME%>" property="showAutoAssignNextBarcode" value="true">
                      <html:text property="<%=CopyEditLibraryForm.FIELD_COPY_BARCODE%>" size="17" maxlength='<%=""+CopySpecs.COPY_MAX_COPY_BARCODE_LENGTH%>'
                        onfocus='<%="document." + CopyEditLibraryForm.FORM_NAME + "." + CopyEditLibraryForm.FIELD_ASSIGN_NEXT_BARCODE + "[0].checked = true"%>'                   />
                    </logic:equal>
                    <logic:equal name="<%=CopyEditLibraryForm.FORM_NAME%>" property="showAutoAssignNextBarcode" value="false">
                      <html:text property="<%=CopyEditLibraryForm.FIELD_COPY_BARCODE%>" size="17" maxlength='<%=""+CopySpecs.COPY_MAX_COPY_BARCODE_LENGTH%>'/>
                    </logic:equal>
                      <logic:equal name="<%=CopyEditLibraryForm.FORM_NAME%>" property="showAutoAssignNextBarcode" value="true">
                        <base:helpTag helpFileName="d_starting_barcode_TM.htm"/>
                      </logic:equal>
                    </span>
                    <logic:equal name="<%=CopyEditLibraryForm.FORM_NAME%>" property="showSymbology" value="true">
                        <br>&nbsp;&nbsp;
                        <%
                            String pageValue = "/cataloging/servlet/handlecopyeditlibraryform.do?" + CopyEditLibraryForm.PARAM_SYMBOLOGY + "=true";
                        %>
                        <base:link 
                            permission="<%=permConfigSite%>" 
                            page="<%=pageValue%>" 
                            disableLink="false"
                            showTextAlways="true" 
                            onclick="submitSymbologyChange();" 
                            id="<%=CopyEditForm.ID_LINK_CHANGE_SYMBOLOGY %>"><%=form.getSymbologyText()%>
                        </base:link>
                    </logic:equal>
                  </td>
                </tr>
                <logic:equal name="<%=CopyEditLibraryForm.FORM_NAME%>" property="showAutoAssignNextBarcode" value="true">
                <tr>
                  <td>&nbsp;</td>
                  <td class="ColRow">
                      <html:radio 
                        disabled="<%=isBarcodeFilteringEnabled%>"                  
                        property="<%=CopyEditLibraryForm.FIELD_ASSIGN_NEXT_BARCODE%>" value="<%=CopyEditLibraryForm.RADIO_ASSIGN_NEXT_BARCODE%>"
                        onclick='<%="document." + CopyEditLibraryForm.FORM_NAME + "." + CopyEditLibraryForm.FIELD_COPY_BARCODE + ".value = \'\'"%>'>
                        <%= MessageHelper.formatMessage("copyedit_AssignNextBarcode") %>
                      </html:radio>
                  </td>
                </tr>
                <%
                    if (!isBarcodeFilteringEnabled && !(StringHelper.isEmpty(form.getNextDisplayableBC()))) {
                %>
                <tr>
                  <td>&nbsp;</td>
                  <td class="ColRow">
                      &nbsp;&nbsp;&nbsp;&nbsp;<%= MessageHelper.formatMessage("copyedit_Next",form.getNextDisplayableBC()) %>
                  </td>
                </tr>
                <%
                    }
                %>
            </logic:equal>
            </c:if>
        <%
            } else {
        %>
        <logic:equal name="<%=CopyEditLibraryForm.FORM_NAME%>" property="hideFieldsForDistrictEBooks" value="true">
            <html:hidden property="<%=CopyEditLibraryForm.FIELD_ASSIGN_NEXT_BARCODE%>" />
            <html:hidden property="<%=CopyEditLibraryForm.FIELD_COPY_BARCODE%>" />
        </logic:equal>
        <c:if test="${! form.hideFieldsForDistrictEBooks && !form.shelfBib && !form.resoldShelfBib}">
            <tr>
              <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("copyedit_Barcode") %></td>
              <td nowrap>
                <logic:equal name="<%=CopyEditLibraryForm.FORM_NAME%>" property="showAutoAssignNextBarcode" value="true">
                  <html:radio property="<%=CopyEditLibraryForm.FIELD_ASSIGN_NEXT_BARCODE%>" value="<%=CopyEditLibraryForm.RADIO_EXPLICIT_BARCODE%>"
                    onclick='<%="document." + CopyEditLibraryForm.FORM_NAME + "." + CopyEditLibraryForm.FIELD_COPY_BARCODE + ".focus();"%>'>
                  </html:radio>
                </logic:equal>
                <span onKeyPress="return trapEnter(event);" class="ColRow">
                
                <logic:equal name="<%=CopyEditLibraryForm.FORM_NAME%>" property="showAutoAssignNextBarcode" value="true">
                  <html:text property="<%=CopyEditLibraryForm.FIELD_COPY_BARCODE%>" size="17" maxlength='<%=""+CopySpecs.COPY_MAX_COPY_BARCODE_LENGTH%>'
                    onfocus='<%="document." + CopyEditLibraryForm.FORM_NAME + "." + CopyEditLibraryForm.FIELD_ASSIGN_NEXT_BARCODE + "[0].checked = true"%>'              />
                </logic:equal>
                <logic:equal name="<%=CopyEditLibraryForm.FORM_NAME%>" property="showAutoAssignNextBarcode" value="false">
                  
                   <%
                                         if( Long.valueOf(CopySpecs.STATUS_IN_TRANSIT).equals(form.getCopyStatusAsLong())){
                                     %>
                        
                        <html:hidden property="<%=CopyEditLibraryForm.FIELD_COPY_BARCODE%>"/>
                        <%
                            if(form.getCopyBarcode() != null){
                                            out.println(ResponseUtils.filter(form.getCopyBarcode()));
                                    
                                             } 
                                     }else{
                        %>
                     
                     <html:text property="<%=CopyEditLibraryForm.FIELD_COPY_BARCODE%>" size="17" maxlength='<%=""+CopySpecs.COPY_MAX_COPY_BARCODE_LENGTH%>'/>
                   <%}%>
                  
                  </logic:equal>
                
                  <logic:equal name="<%=CopyEditLibraryForm.FORM_NAME%>" property="showAutoAssignNextBarcode" value="true">
                    <base:helpTag helpFileName="d_starting_barcode_TM.htm"/>
                  </logic:equal>
                </span>
              </td>
            </tr>
            <logic:equal name="<%=CopyEditLibraryForm.FORM_NAME%>" property="showSymbology" value="true">
            <tr>
              <td>&nbsp;</td>
              <td class="ColRow">
                  <html:radio 
                    disabled="<%=isBarcodeFilteringEnabled%>"                  
                    property="<%=CopyEditLibraryForm.FIELD_ASSIGN_NEXT_BARCODE%>" value="<%=CopyEditLibraryForm.RADIO_ASSIGN_NEXT_BARCODE%>"
                    onclick='<%="document." + CopyEditLibraryForm.FORM_NAME + "." + CopyEditLibraryForm.FIELD_COPY_BARCODE + ".value = \'\'"%>'>
                    <%= MessageHelper.formatMessage("copyedit_AssignNextBarcode") %>
                  </html:radio>
              </td>
            </tr>
            <% if (!isBarcodeFilteringEnabled 
                && !StringHelper.isEmpty(form.getReceiveInTransit())
                && !(StringHelper.isEmpty(form.getNextDisplayableBC()))) 
            { %>
            <tr>
              <td>&nbsp;</td>
              <td class="ColRow">
                  &nbsp;&nbsp;&nbsp;&nbsp;<%= MessageHelper.formatMessage("copyedit_Next",form.getNextDisplayableBC()) %>
              </td>
            </tr>
            <%} %>
            </logic:equal>
            </c:if>
        <% } %>
        <tr>
          <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("copyedit_CallNumber") %></td>
          <td class="ColRow">
            <html:text property="<%= CopyEditLibraryForm.FIELD_CALL_NUMBER %>" size="30" maxlength="30"/>
            <base:helpTag helpFileName="d_call_number_LM_MM.htm"/>
          </td>
        </tr>
        <tr>
          <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("copyedit_PurchasePrice") %></td>
          <td class="ColRow">
            <html:text property="<%= CopyEditLibraryForm.FIELD_PRICE %>" size="15" maxlength="15"/>
            <base:helpTag helpFileName="d_purchase_price_LM_MM.htm"/>
          </td>
        </tr>
        <logic:equal name="<%=CopyEditLibraryForm.FORM_NAME%>" property="anyShelfBib" value="true">
            <html:hidden property="<%=CopyEditLibraryForm.FIELD_CIRC_TYPE%>" />
        </logic:equal>
        <logic:equal name="<%=CopyEditLibraryForm.FORM_NAME%>" property="anyShelfBib" value="false">
            <logic:equal name="<%=CopyEditLibraryForm.FORM_NAME%>" property="hideFieldsForDistrictEBooks" value="true">
                <html:hidden property="<%=CopyEditLibraryForm.FIELD_CIRC_TYPE%>" />
            </logic:equal>
            <logic:equal name="<%=CopyEditLibraryForm.FORM_NAME%>" property="hideFieldsForDistrictEBooks" value="false">
            <base:isMediaSite showForMedia="false">
                <tr>
                  <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("copyedit_CirculationType") %></td>
                  <td class="ColRow">
                    <html:select property="<%= CopyEditLibraryForm.FIELD_CIRC_TYPE %>">
                      <html:options collection="circTypesID" property="longID"
                                    labelProperty="stringDesc"/>
                    </html:select>
                    <base:helpTag helpFileName="d_circ_types_LM_MM.htm"/>
                  </td>
                </tr>
            </base:isMediaSite>
            <base:isMediaSite showForMedia="true">
                    <html:hidden property="<%= CopyEditLibraryForm.FIELD_CIRC_TYPE %>"/>
            </base:isMediaSite>
            </logic:equal>
        </logic:equal>
        <tr>
          <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("copyedit_DateAcquired") %></td>
          <td class="ColRow">
            <html:text property="<%= CopyEditLibraryForm.FIELD_DATE_ADDED %>" size="15" maxlength="15"/>
            <base:helpTag helpFileName="d_date_added_LM_MM.htm"/>
          </td>
        </tr>

        <tr>
          <td class="Instruction tdAlignRight"><%= MessageHelper.formatMessage("copyedit_RequiredField") %></td>
          <td class="ColRow">&nbsp;</td>
        </tr>

        <!-- Categories -->
        <logic:equal name="<%=CopyEditLibraryForm.FORM_NAME%>" property="hideFieldsForDistrictEBooks" value="true">
            <html:hidden property="<%=CopyEditLibraryForm.FIELD_CATEGORIES%>" />
        </logic:equal>
        <logic:equal name="<%=CopyEditLibraryForm.FORM_NAME%>" property="hideFieldsForDistrictEBooks" value="false">
        <tr>
          <td colspan="2"><base:imageLine height="1" width="100%"/></td>
        </tr>
        <tr>
          <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("copyedit_CopyCategories") %><base:helpTag helpFileName="d_copy_categories_LM_MM.htm"/>
          </td>
          <td class="FormLabel">
            <table width="100%" border="0" cellpadding="2" cellspacing="0" align="center" id="<%= CopyEditLibraryForm.TABLE_CATEGORIES %>">
              <tr>
                <td class="ColRow">
                  <bean:write name="<%= CopyEditLibraryForm.FORM_NAME %>" property="<%= CopyEditLibraryForm.FIELD_CATEGORIES %>"/>
                </td>
                <td class="tdAlignRight">
                  <base:spanIfAllowed permission='<%=Permission.CAT_CREATE_ASSIGN_CATEGORIES%>'>
                    <base:genericButton src="/buttons/large/update.gif" alt='<%= MessageHelper.formatMessage("update") %>' name="<%= CopyEditLibraryForm.BUTTON_UPDATE_CATEGORIES %>" />
                  </base:spanIfAllowed>
                </td>
              </tr>
            </table>
          </td>
        </tr>
        
        <%-- BEGIN COPY NOTE STUFF --%>        
        </logic:equal>

        <base:spanIfAllowed permissions="<%=CopyEditLibraryForm.VIEW_NOTE_PERM%>" collectionType="<%=form.getCollectionType()%>">
        <tr>
          <td colspan="2"><base:imageLine height="1" width="100%"/></td>
        </tr>
        <tr>
          <td class="ColRowBold tdAlignRight" valign="top"><%= MessageHelper.formatMessage("copyedit_Notes") %><base:helpTag helpFileName="c_notes_make_use_LM_MM_TM_AM.htm"/>
          </td>
          <td>
            <base:spanIfAllowed permissions="<%=CopyEditLibraryForm.ADD_NOTE_PERM%>" collectionType="<%=form.getCollectionType()%>">
                <table width="100%" cellspacing="0" cellpadding="0">
                    <tr><td class="tdAlignRight"><base:genericButton src="/buttons/large/addnote.gif" alt='<%=MessageHelper.formatMessage("addNote") %>' name="<%= CopyEditLibraryForm.BUTTON_ADD_NOTE %>"/></td></tr>
                </table>
            </base:spanIfAllowed>
            <!-- Copy Notes -->
            <%--@todo Why can't we use the nice constants here?  We tried and it doesn't work --%>
            <jsp:include page="/common/shownotes.jsp?supressDefaultHeader" flush="true">
                <jsp:param name="formName" value="<%=CopyEditLibraryForm.FORM_NAME%>"/>
                <jsp:param name="suppressDefaultHeader" value="true"/>
            </jsp:include>
          </td>
        </tr>
        </base:spanIfAllowed>
        <%-- END COPY NOTE STUFF --%>        

        <tr>
          <td colspan="2">
        <A name="<%=CopyEditLibraryForm.ANCHOR_BOTTOM_LINE %>"></A>
          <base:imageLine height="1" width="100%"/></td>
        </tr>
        <!-- Volume Stuff -->
        <tr>
          <td class="ColRowBold tdAlignRight" valign="top"><%= MessageHelper.formatMessage("copyedit_VolumeIssueEtc") %><base:helpTag helpFileName="d_enter_volume_issue.htm"/>
          </td>
          <td>
            <table border="0" cellpadding="2" cellspacing="0">
              <tr>
                <td class="ColRow">&nbsp;</td>
                <td class="SmallColHeading" align="center"><%= MessageHelper.formatMessage("copyedit_Description") %></td>
                <td class="SmallColHeading" align="center"><%= MessageHelper.formatMessage("copyedit_Number") %></td>
              </tr>
              <tr>
                <td class="SmallColHeading tdAlignRight">1</td>
                <td class="ColRow"><html:text property="<%= CopyEditLibraryForm.FIELD_DESCRIPTION_1 %>" size="20" maxlength="20"/></td>
                <td class="ColRow"><html:text property="<%= CopyEditLibraryForm.FIELD_ENUMERATION_1 %>" size="20" maxlength="20"/></td>
              </tr>
              <tr>
                <td class="SmallColHeading tdAlignRight">2</td>
                <td class="ColRow"><html:text property="<%= CopyEditLibraryForm.FIELD_DESCRIPTION_2 %>" size="20" maxlength="20"/></td>
                <td class="ColRow"><html:text property="<%= CopyEditLibraryForm.FIELD_ENUMERATION_2 %>" size="20" maxlength="20"/></td>
              </tr>
              <tr>
                <td class="SmallColHeading tdAlignRight">3</td>
                <td class="ColRow"><html:text property="<%= CopyEditLibraryForm.FIELD_DESCRIPTION_3 %>" size="20" maxlength="20"/></td>
                <td class="ColRow"><html:text property="<%= CopyEditLibraryForm.FIELD_ENUMERATION_3 %>" size="20" maxlength="20"/></td>
              </tr>
            </table>
          </td>
        </tr>
        <tr>
          <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("copyedit_CopyNumber") %></td>
          <td class="ColRow"><html:text property="<%= CopyEditLibraryForm.FIELD_COPY_NUMBER %>" size="6" maxlength="6"/></td>
        </tr>
        <tr>
          <td colspan="2"><base:imageLine height="1" width="100%"/></td>
        </tr>
        <c:if test="${! form.hideFieldsForDistrictEBooks}">
            <tr>
              <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("copyedit_Sublocation") %></td>
              <td class="ColRow">
                  <base:editCopyDropDown fieldName="<%= CopyEditLibraryForm.FIELD_SUB_LOCATION%>" siteID="<%= form.getCopySiteID() %>" currentSelection="<%= form.getSubLocation() %>" unofficialValue="<%= form.getUnofficialSublocation() %>" controlNum="<%= QuickPickSpecs.CONTROL_NUM_SUBLOCATION %>"/>
                  &nbsp;
                  <base:genericButton absbottom="true" src="/buttons/large/other.gif" name="<%=CopyEditLibraryForm.BUTTON_SUB_LOCATION_OTHER%>" alt='<%=MessageHelper.formatMessage("other") %>'/>
              </td>
            </tr>
            <tr>
              <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("copyedit_Vendor") %></td>
                <td class="ColRow">
                     <base:editCopyDropDown fieldName="<%= CopyEditLibraryForm.FIELD_VENDOR%>" siteID="<%= form.getCopySiteID() %>" currentSelection="<%= form.getVendor() %>" unofficialValue="<%= form.getUnofficialVendor() %>" controlNum="<%= EditCopyDropDownTag.CONTROL_NUM_VENDOR %>"/>
                     &nbsp;                     
                     <base:genericButton absbottom="true" src="/buttons/large/other.gif" name="<%=CopyEditLibraryForm.BUTTON_VENDOR_OTHER%>" alt='<%=MessageHelper.formatMessage("other") %>'/>
                </td>
            </tr>
            <tr>
              <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("copyedit_FundingSource") %></td>
                <td class="ColRow"> 
                    <base:editCopyDropDown fieldName="<%= CopyEditLibraryForm.FIELD_FUNDING_SOURCE %>" siteID="<%= form.getCopySiteID() %>" currentSelection="<%= form.getFundingSource() %>" unofficialValue="<%= form.getUnofficialFundingSource() %>" controlNum="<%= QuickPickSpecs.CONTROL_NUM_FUNDINGSOURCE %>"/>
                    &nbsp;                    
                    <base:genericButton absbottom="true" src="/buttons/large/other.gif" name="<%=CopyEditLibraryForm.BUTTON_FUNDING_SOURCE_OTHER%>" alt='<%=MessageHelper.formatMessage("other") %>'/>
              </td>
              <td>
              </td>   
            </tr>
        </c:if>

      </table>
    </td>
    <td valign="top">
        <base:showHideTag id="onSave" classForText="ColRowBold">
            <!-- Save Copy & Cancel buttons go here -->
            <logic:equal name="<%=CopyEditLibraryForm.FORM_NAME%>" property="action" value="<%=CopyEditLibraryForm.ACTION_ADD%>">
                <base:genericButton src="/buttons/large/savecopies.gif" onclick="hideElementonSave()" alt='<%= MessageHelper.formatMessage("saveCopies") %>' name="<%= CopyEditLibraryForm.BUTTON_SAVE_COPY %>" />
            </logic:equal>
            <logic:notEqual name="<%=CopyEditLibraryForm.FORM_NAME%>" property="action" value="<%=CopyEditLibraryForm.ACTION_ADD%>">
                <base:genericButton src="/buttons/large/savecopy.gif" onclick="hideElementonSave()" alt='<%= MessageHelper.formatMessage("saveCopy") %>' name="<%= CopyEditLibraryForm.BUTTON_SAVE_COPY %>" />
            </logic:notEqual>
    	        <br>
            
            <c:if test="${! form.hideFieldsForDistrictEBooks && !form.shelfBib && !form.resoldShelfBib}">
    	        <base:spanIfAllowed permissions="<%=permForPrintLabel%>">
    	            <span class="SmallColHeading"><html:checkbox property="<%=CopyEditLibraryForm.FIELD_PRINT_LABEL_ON_SAVE%>"><%= MessageHelper.formatMessage("copyedit_PrintLabels") %></html:checkbox></span>
    	            <br>
    	        </base:spanIfAllowed>
            </c:if>
            <base:cancelButton onclick="hideElementonSave()"/>
        </base:showHideTag>
    </td>
  </tr>
</table>

</base:form>
