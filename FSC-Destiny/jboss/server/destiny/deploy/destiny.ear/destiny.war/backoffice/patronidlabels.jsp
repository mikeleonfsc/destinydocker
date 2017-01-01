<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.data.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.SitePatronSpecs"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag" %>
<%@ page import="com.follett.fsc.destiny.util.Barcode" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.SitePatronSpecs"%>
<%@ page import="org.apache.struts.util.ResponseUtils"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>



<base:messageBox strutsErrors="true"/>

<%
    String formName = PatronIDLabelForm.FORM_NAME;
    String formAction = "/backoffice/servlet/handlepatronidlabelform.do";
    String pageTitle = MessageHelper.formatMessage("patronidlabels_PatronIDCards");
    BasePatronReportForm form = (BasePatronReportForm)request.getAttribute(formName);
    PatronIDLabelForm patronForm = (PatronIDLabelForm)request.getAttribute(PatronIDLabelForm.FORM_NAME);
    boolean disableForExcel = false;
    
    if (form == null) {
        formName = PatronNameListForm.FORM_NAME;
        formAction = "/backoffice/servlet/handlepatronnamelistform.do";
        form = (BasePatronReportForm)request.getAttribute(formName);
        pageTitle = MessageHelper.formatMessage("patronnamelist_PatronNames");
    }    
    if (patronForm == null) {
    	// do nothing, jsp is shared - disableForExcel already set to false; 
    } else {
    	disableForExcel = patronForm.disableForExcel();
    }
%>

<script language="JavaScript" type="text/javascript">
      function disableCheckboxes() {
    	  document.<%=PatronIDLabelForm.FORM_NAME%>.<%=PatronIDLabelForm.FIELD_INCLUDE_PATRON_PICTURE%>.checked = false;
          document.<%=PatronIDLabelForm.FORM_NAME%>.<%=PatronIDLabelForm.FIELD_INCLUDE_PATRON_PICTURE%>.disabled = true;
    	  document.<%=PatronIDLabelForm.FORM_NAME%>.<%=PatronIDLabelForm.FIELD_INCLUDE_BARCODE_FOR_SCANNING%>.checked = false;
          document.<%=PatronIDLabelForm.FORM_NAME%>.<%=PatronIDLabelForm.FIELD_INCLUDE_BARCODE_FOR_SCANNING%>.disabled = true;
    	}
      function enableCheckboxes() {
    	  document.<%=PatronIDLabelForm.FORM_NAME%>.<%=PatronIDLabelForm.FIELD_INCLUDE_PATRON_PICTURE%>.checked = false;
          document.<%=PatronIDLabelForm.FORM_NAME%>.<%=PatronIDLabelForm.FIELD_INCLUDE_PATRON_PICTURE%>.disabled = false;
    	  document.<%=PatronIDLabelForm.FORM_NAME%>.<%=PatronIDLabelForm.FIELD_INCLUDE_BARCODE_FOR_SCANNING%>.checked = false;
          document.<%=PatronIDLabelForm.FORM_NAME%>.<%=PatronIDLabelForm.FIELD_INCLUDE_BARCODE_FOR_SCANNING%>.disabled = false;
    	}

</script>

<bean:define id="gradYearOptionList" name="<%=formName%>" property="<%=BasePatronReportForm.FIELD_GRAD_YEAR_TYPE_LIST%>"/>
<bean:define id="selectByList" name="<%=formName%>" property="<%=BasePatronReportForm.FIELD_SELECT_BY_LIST%>"/>

<% if (formName.equals(PatronNameListForm.FORM_NAME)) { %>
    <bean:define id="acceptableUsePolicyList" name="<%=formName%>" property="<%=PatronNameListForm.FIELD_ACCEPTABLE_USE_POLICY_LIST%>"/>
<% } %>

<base:form action="<%=formAction%>" enctype="multipart/form-data">
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true" name="trapEnterKey">
    <html:hidden property="<%=BasePatronReportForm.FIELD_LAST_SITE_ID%>"/>
	<base:outlinedTable id="<%=BasePatronReportForm.TABLE_PATRON_ID_LABELS%>" borderColor='#C0C0C0'>
	    <tr>
	        <td colspan="2" class="TableHeading" nowrap>
	            <%=pageTitle%>
	        </td>
	    </tr>
	    <tr>
	        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
	    </tr>
    <base:isDistrictUser>
        <tr>
            <td class="ColRowBold tdAlignRight" valign="top"><%=MessageHelper.formatMessage("patronidlabels_For") %></td>
            <td class="ColRow">
                <base:selectSite
                    submitOnChange="true" 
                    name="<%=BasePatronReportForm.FIELD_REPORT_SITE_ID%>" 
                    selectedSiteID='<%= form.getReportSiteID().toString()%>'
                    includeLibrarySites="true"
        			includeTextbookSites="true"
        			includeMediaSites="true"
		            mode="<%=SelectSiteTag.MODE_MEDIA%>"
        			includeAssetSites="true"
                    includeDistrictWarehouse="false"
                    />
            </td>
        </tr>
	    <tr>
	        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
	    </tr>
    </base:isDistrictUser>
    <base:isNotDistrictUser>
    
        <html:hidden property="<%=BasePatronReportForm.FIELD_REPORT_SITE_ID%>"/>
    </base:isNotDistrictUser>
	    
	    <tr>
	        <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("patronidlabels_SelectBy") %></td>
		    <td class="ColRow">
                <html:select property="<%=BasePatronReportForm.FIELD_SELECT_BY%>" onchange="this.form.submit()">
                    <html:options collection="selectByList" property="longID" labelProperty="stringDesc"/>
                </html:select>
		    </td>
	    </tr>
        <logic:notEqual name="<%=formName%>" property="<%=BasePatronReportForm.FIELD_SELECT_BY%>" value="<%=String.valueOf(BasePatronReportJobParams.SELECT_BY_BARCODE_LIST)%>">
    	    <tr>
	        <td class="ColRowBold tdAlignRight">
	            &nbsp;
	        </td>

            <%if ( form.getSelectBy() != null && form.getSelectBy().intValue() == BasePatronReportJobParams.SELECT_BY_ACCEPTABLE_USE_POLICY ) { %>
				<td>
					<html:select property="<%=PatronNameListForm.FIELD_ACCEPTABLE_USE_POLICY%>" >
                        <html:options collection="acceptableUsePolicyList" property="longID" labelProperty="stringDesc"/>
                    </html:select>
                </td>
            <% } else if ( form.getSelectBy() != null && form.getSelectBy().intValue() == BasePatronReportJobParams.SELECT_BY_HOMEROOM ) { %>
                <td class="ColRow"><%=MessageHelper.formatMessage("patronidlabels_From") %>&nbsp;<base:homeroomBySiteDropDown siteID="<%=form.getReportSiteID() %>" currentSelection="<%=form.getHomeroomFrom() %>" showOnlyAssignedHomerooms="true" fieldName="<%=BasePatronReportForm.FIELD_HOMEROOM_FROM %>" displayNameForNoHomeroom='<%=MessageHelper.formatMessage("patronidlabels_AnyHomeroom")%>'/>
                    &nbsp;<%=MessageHelper.formatMessage("patronidlabels_To")%>&nbsp;
                          <base:homeroomBySiteDropDown siteID="<%=form.getReportSiteID() %>" currentSelection="<%=form.getHomeroomTo() %>" showOnlyAssignedHomerooms="true" fieldName="<%=BasePatronReportForm.FIELD_HOMEROOM_TO %>" displayNameForNoHomeroom='<%=MessageHelper.formatMessage("patronidlabels_AnyHomeroom")%>'/>
                </td>
            <% } else { %>
		    	<td class="ColRow"><%=MessageHelper.formatMessage("patronidlabels_From") %>&nbsp;<html:text property="<%=BasePatronReportForm.FIELD_SELECT_BY_FROM%>" size="15" maxlength="<%=String.valueOf(SitePatronSpecs.LENGTH_HOMEROOM)%>"/>
                	&nbsp;<%=MessageHelper.formatMessage("patronidlabels_To")%>&nbsp;
                	<html:text property="<%=BasePatronReportForm.FIELD_SELECT_BY_TO%>" size="15" maxlength="<%=String.valueOf(SitePatronSpecs.LENGTH_HOMEROOM)%>"/>
		    	</td>
			<% } %>
		    
		    </tr>
		</logic:notEqual>
        <logic:equal name="<%=formName%>" property="<%=BasePatronReportForm.FIELD_SELECT_BY%>" value="<%=String.valueOf(BasePatronReportJobParams.SELECT_BY_BARCODE_LIST)%>">
		    <tr>
		        <td colspan="2">
		        <base:imageLine height="1" width="100%"/>
		        </td>
		    </tr>
		    <tr>
		    <td>&nbsp;</td>
            <td class="ColRow" nowrap>
               <base:barcodeList barcodeType="<%=Barcode.BARCODETYPE_PATRON%>" 
                   formName="<%=formName%>"/>
                <html:hidden property="<%=BasePatronReportForm.FIELD_SELECT_BY_FROM%>"/>
                <html:hidden property="<%=BasePatronReportForm.FIELD_SELECT_BY_TO%>"/>
            </td>
            </tr>
		</logic:equal>
        <% if (formName.equals(PatronNameListForm.FORM_NAME) && !form.isMediaSite()) { %>
        <tr>
            <td class="ColRowBold tdAlignRight" colspan="1"><%=MessageHelper.formatMessage("patronidlabels_Show") %></td>
            <td class="ColRow">
                <html:checkbox property="<%=PatronNameListForm.FIELD_SHOW_ALL_SITE_ASSOCIATIONS%>"/><%=MessageHelper.formatMessage("patronidlabels_AllSiteAssociations") %></td>
        </tr>
        <% } %>
        <tr>
            <td colspan="2">
            <base:imageLine height="1" width="100%"/>
            </td>
        </tr>  
	    <tr>
	        <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("patronidlabels_LimitTo") %></td>
	        <td class="ColRowBold"><%=MessageHelper.formatMessage("patronidlabels_PatronTypesAmpStatuses") %></td>
	    </tr>
	    <tr>
	        <td class="ColRow">&nbsp;</td>
	        <td valign="top">
	            <table id="<%=BasePatronReportForm.TABLE_LIMIT_TO%>" cellpadding="0" cellspacing="0">
    	            <tr>
                        <td valign="top">
                            <base:patronTypesList formName="<%=formName%>" allowToSaveWithoutAnyPatronTypesSelected="false"></base:patronTypesList>
                        </td>
                        <td class="ColRow" valign="top"><base:imageSpacer width="40" height="1"/></td>
                        <td valign="top" class="ColRow">
                            <html:checkbox name="<%=formName%>" property="<%=BasePatronReportForm.FIELD_INCLUDE_ACTIVE%>"><%=MessageHelper.formatMessage("patronidlabels_Active") %></html:checkbox><br>
                            <html:checkbox name="<%=formName%>" property="<%=BasePatronReportForm.FIELD_INCLUDE_INACTIVE%>"><%=MessageHelper.formatMessage("patronidlabels_Inactive") %></html:checkbox><br>
                            <html:checkbox name="<%=formName%>" property="<%=BasePatronReportForm.FIELD_INCLUDE_RESTRICTED%>"><%=MessageHelper.formatMessage("patronidlabels_Restricted") %></html:checkbox><br>
                        </td>
                    </tr>
                    <% if (formName.equals(PatronNameListForm.FORM_NAME) && !form.isMediaSite()) { %>
                    <tr>
                        <td class="ColRow" colspan="3">
                            <html:checkbox property="<%=PatronNameListForm.FIELD_LIMIT_TO_PATRONS_WITH_MULTIPLE_SITE_ASSOCIATIONS%>"/><%=MessageHelper.formatMessage("patronidlabels_PatronsWithMultipleSiteAssociations") %></td>
                    </tr>
                    <% } %>
                </table>
	        </td>
	    </tr>
		<tr>
		    <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("patronidlabels_GraduationYear") %></td>
		    <td class="ColRow">
                <html:select property="<%=BasePatronReportForm.FIELD_GRAD_YEAR_TYPE %>">
                    <html:options collection="gradYearOptionList" property="longID" labelProperty="stringDesc"/>
                </html:select>&nbsp;
                <html:text property="<%=BasePatronReportForm.FIELD_GRAD_YEAR%>" size="4" maxlength="4"/>
		    </td>
		</tr>
	    <tr>
	        <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("patronidlabels_CardExpires") %></td>
	        <td class="ColRow"><%=MessageHelper.formatMessage("patronidlabels_From") %>&nbsp;<base:dateRange 
					dateFrom="<%=form.getDateFrom()%>"
					dateTo="<%=form.getDateTo()%>"
					hideButtonsForMac = "false"
				/>
            </td>
        </tr>
	    <% if (PatronIDLabelForm.FORM_NAME.equals(formName)) { %>
<bean:define id="nameFormatOptions" name="<%=formName%>" property="<%=PatronIDLabelForm.FIELD_NAME_FORMAT_OPTIONS%>"/>
<bean:define id="stocks" name="<%=formName%>" property="stockList"/>
<bean:define id="optionalList" name="<%=formName%>" property="<%=PatronIDLabelForm.FIELD_OPTIONAL_LIST%>"/>
	    <tr>
	        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
	    </tr>
        <tr>
            <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("patronidlabels_FormatName") %></td>
            <td class="ColRow">
                <html:select property="<%=PatronIDLabelForm.FIELD_NAME_FORMAT%>">
                    <html:options collection="nameFormatOptions" property="longID" labelProperty="stringDesc"/>
                </html:select>
            </td>
        </tr>
		<tr>
			<td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("patronidlabels_IncludeTheFollowing") %></td>
			<td class="ColRow">
	        	<html:checkbox property="<%=PatronIDLabelForm.FIELD_INCLUDE_PATRON_PICTURE%>" disabled="<%=disableForExcel%>"><%=MessageHelper.formatMessage("patronidlabels_PatronPicture") %></html:checkbox>
			</td>
		</tr>
		<tr>
			<td>
				&nbsp;
			</td>
			<td class="ColRow">
	        	<html:checkbox property="<%=PatronIDLabelForm.FIELD_INCLUDE_BARCODE_FOR_SCANNING%>" disabled="<%=disableForExcel%>"><%=MessageHelper.formatMessage("patronidlabels_BarcodeForScanning") %></html:checkbox>
			</td>
		</tr>
        <tr>
            <td>
                &nbsp;
            </td>
            <td class="ColRow">
                <html:checkbox property="<%=PatronIDLabelForm.FIELD_INCLUDE_DISPLAYABLE_BARCODE%>"><%=MessageHelper.formatMessage("patronidlabels_BarcodeNumber") %></html:checkbox>
            </td>
        </tr>
		<tr>
		    <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("patronidlabels_OptionalLine1") %></td>
		    <td class="ColRow">
                <html:select property="<%=PatronIDLabelForm.FIELD_OPTIONAL_LINE_1 %>">
                    <html:options collection="optionalList" property="longID" labelProperty="stringDesc"/>
                </html:select>
		    </td>
		</tr>
		<tr>
		    <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("patronidlabels_OptionalLine2") %></td>
		    <td class="ColRow">
                <html:select property="<%=PatronIDLabelForm.FIELD_OPTIONAL_LINE_2 %>">
                    <html:options collection="optionalList" property="longID" labelProperty="stringDesc"/>
                </html:select>
		    </td>
		</tr>
		<tr>
		    <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("patronidlabels_OptionalLine3") %></td>
		    <td class="ColRow">
                <html:select property="<%=PatronIDLabelForm.FIELD_OPTIONAL_LINE_3 %>">
                    <html:options collection="optionalList" property="longID" labelProperty="stringDesc"/>
                </html:select>
		    </td>
		</tr>
	    <tr>
	        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
	    </tr>
	    <tr>
	        <td class="ColRowBold tdAlignRight"><html:radio property="<%=PatronIDLabelForm.FIELD_TRANSACTION_SCOPE%>" value="<%=Integer.toString(PatronIDLabelForm.SCOPE_CARD_STOCK)%>" onchange="enableCheckboxes()"/>
	        <%=MessageHelper.formatMessage("patronidlabels_UseCardStock") %></td>
	        <td>
	        	<html:select property="<%=PatronIDLabelForm.FIELD_LABEL_STOCK%>">
	            	<html:options collection="stocks" property="stringCode" labelProperty="stringDesc"/>
				</html:select>
	        </td>
	    </tr>
	    <tr>
	        <td class="ColRow tdAlignRight">
	            &nbsp;
	        </td>
	        <td class="ColRow" nowrap><%=MessageHelper.formatMessage("patronidlabels_StartOnLabel") %>&nbsp;<html:text property="<%=PatronIDLabelForm.FIELD_LABEL_START%>" maxlength="3" size="4"/>
	        </td>
	    </tr>
	    <tr>
	        <td class="ColRow tdAlignRight">
	        	&nbsp;
	        </td>
	        <td class="ColRow" nowrap><%=MessageHelper.formatMessage("patronidlabels_PrinterOffsetHorizontal") %>&nbsp;<html:text property="<%=PatronIDLabelForm.FIELD_HORIZONTAL_OFFSET%>" maxlength="4" size="4"/>
	            &nbsp;&nbsp;&nbsp;
	            <%=MessageHelper.formatMessage("patronidlabels_Vertical") %>&nbsp;<html:text property="<%=PatronIDLabelForm.FIELD_VERTICAL_OFFSET%>" maxlength="4" size="4"/>
	        </td>
	    </tr>
	    <tr>
	        <td class="ColRowBold tdAlignRight"><html:radio property="<%=PatronIDLabelForm.FIELD_TRANSACTION_SCOPE%>" value="<%=Integer.toString(PatronIDLabelForm.SCOPE_EXCEL)%>" onchange="disableCheckboxes()"/>
	        <%=MessageHelper.formatMessage("patronidlabels_ExportToMicrosoftExcel") %></td>
	    </tr>
	    <% } else { %>
	    <%-- Yes, this looks hokey BUT it allows us to reuse a bunch of other stuff on the 
	         PatronIDLabelsForm so get off me, Dog! --%>
    	<html:hidden property="<%=BaseLabelForm.FIELD_LABEL_STOCK%>"/>
    	
        <logic:equal name="<%=formName%>" property="<%=PatronNameListForm.CALC_DISPLAY_PAGE_BREAK_OPTION%>" value="true">
		<tr>
			<td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("patronidlabels_IncludePageBreaks") %></td>
			<td class="ColRow">
	        	<html:checkbox property="<%=PatronNameListForm.FIELD_INCLUDE_PAGE_BREAKS%>"/>
			</td>
		</tr>
		</logic:equal>
	    <% } %>
	    <tr>
	        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
	    </tr>
		<tr><td colspan="2" class="ColRowBold" align="center">
		    <base:reportButton/>
		</td></tr>
	</base:outlinedTable>
</base:form>
