<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.PatronLabelForm" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.BaseLabelForm" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.pluginreports.PatronBarcodeLabelReportParameters" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.BaseCopyLabelForm"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>


<bean:define id="stocks" name="<%= PatronLabelForm.FORM_NAME %>" property="stockList"/>
<bean:define id="commandSheetTypes" name="<%= PatronLabelForm.FORM_NAME %>" property="commandSheetList"/>

<base:messageBox strutsErrors="true"/>

<%
    PatronLabelForm form = (PatronLabelForm)request.getAttribute("backoffice_servlet_PatronLabelForm");
    boolean isInternational = UserContext.getMyContextLocaleHelper().isInternationalProduct();
%>

<base:form action="/backoffice/servlet/handlepatronlabelform.do" enctype="multipart/form-data">

<html:hidden property="singleIDToPrint"/>
<html:hidden property="districtUser"/>
<html:hidden property="singlePatronName"/>
<html:hidden property="<%=PatronLabelForm.FIELD_HIDE_SITE_DROPDOWN %>"/>
<html:hidden property="<%=PatronLabelForm.FIELD_LAST_SITEID %>"/>
<html:hidden property="<%=PatronLabelForm.FIELD_PREVIOUS_SITEID %>"/>
<html:hidden property="<%=PatronLabelForm.FIELD_SELECTED_PATRON_IDS %>"/>

<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=BaseLabelForm.BUTTON_TRAP_ENTER%>">
<base:outlinedTableAndTabsWithinThere tabs="<%= form.getTabs() %>" selectedTab="<%= PatronLabelForm.ID_TAB_USED_BARCODES %>" id="<%=PatronLabelForm.TABLE_PATRON_LABEL%>" borderColor='#C0C0C0' width="100%">

    <tr>
        <td colspan="2" class="TableHeading" nowrap>
            <% if (form.getSingleIDToPrint() == null) { %>
                <%=MessageHelper.formatMessage("patronlabel_PrintUsedPatronBarcodes") %>
            <% } else { %><%=MessageHelper.formatMessage("patronlabel_PrintLabelForPatron", ResponseUtils.filter(form.getSinglePatronName())) %>
            <% } %>
        </td>
    </tr>

<% if (form.getSingleIDToPrint() == null) { %>
    <logic:equal name="backoffice_servlet_PatronLabelForm" property="districtUser" value="true" scope="request" >
    <tr>
        <td class="ColRowBold tdAlignRight" nowrap><%=MessageHelper.formatMessage("patronlabel_For") %></td>
        <td nowrap>
        <base:selectSite 
            name='<%= BaseLabelForm.FIELD_SITE_ID %>' 
            selectedSiteID='<%=form.getSiteID().toString() %>' 
            submitOnChange="true" 
            includeAllLibraries='false'
            includeLibrarySites="true"
            includeTextbookSites="true"
            includeMediaSites="true"
            mode="<%=SelectSiteTag.MODE_MEDIA%>"
            includeAssetSites="true"
            includeDistrictWarehouse="false"
            />
        </td>
    </tr>
    </logic:equal>
    <logic:equal name="backoffice_servlet_PatronLabelForm" property="districtUser" value="false" scope="request" >
        <html:hidden property="siteID"/>
    </logic:equal>

    <tr>
        <td class="ColRowBold tdAlignRight" nowrap><%=MessageHelper.formatMessage("patronlabel_SelectBy") %></td>
        <td class="ColRow" nowrap>
             <%=form.populateSelectBy()%>
        </td>
    </tr>

    <tr>
        <c:choose>
            <c:when test="<%=form.getSelectBy() == PatronBarcodeLabelReportParameters.SELECT_BY_LIST_OF_PATRONS%>">
                <td class="ColRowBold tdAlignRight" nowrap>&nbsp;</td>
                <td class="ColRow" nowrap>
                <%= form.gimmePatronsSelectedLabel() %>
                    <base:genericButton src="/buttons/large/update.gif" name="<%=PatronLabelForm.BUTTON_UPDATE_PATRONS_SELECTED %>" alt='<%=MessageHelper.formatMessage("patronlabel_UpdatePatronsSelected")%>'/>
                </td>
            </c:when>
            <c:when test="<%=form.getSelectBy() == PatronBarcodeLabelReportParameters.SELECT_BY_DATE_ADDED%>">
                <td class="ColRowBold tdAlignRight" nowrap><%=MessageHelper.formatMessage("patronlabel_PatronsAdded") %></td>
                <td class="ColRow" nowrap>
                    <html:select property='<%="" + PatronLabelForm.FIELD_DATE_MODE%>' value='<%="" + form.getDateMode()%>'>
                        <html:option value='<%="" + PatronBarcodeLabelReportParameters.DATE_MODE_AFTER_THE_DATE%>'><%=MessageHelper.formatMessage("patronlabel_AfterTheDate") %></html:option>
                        <html:option value='<%="" + PatronBarcodeLabelReportParameters.DATE_MODE_ON_THIS_DATE%>'><%=MessageHelper.formatMessage("patronlabel_OnTheDate") %></html:option>
                        <html:option value='<%="" + PatronBarcodeLabelReportParameters.DATE_MODE_BEFORE_THE_DATE%>'><%=MessageHelper.formatMessage("patronlabel_BeforeTheDate") %></html:option>
                    </html:select>
                    <base:date 
                        buttonName = "<%= BaseLabelForm.BUTTON_DATE_ADDED %>"
                        fieldName = "<%= BaseLabelForm.FIELD_DATE_ADDED %>"
                        dateValue = "<%=form.getDateAdded()%>"
                        altText = '<%= MessageHelper.formatMessage("patronlabel_ChangeDateAdded")%>'
                     />
                </td>
            </c:when>
            <c:when test="<%=form.getSelectBy() == PatronBarcodeLabelReportParameters.SELECT_BY_HOMEROOM%>">
                <td class="ColRowBold tdAlignRight" nowrap>&nbsp;</td>
                <td class="ColRow" nowrap><%=MessageHelper.formatMessage("patronlabel_From") %><base:homeroomBySiteDropDown siteID="<%=form.getSiteID() %>" currentSelection="<%=form.getHomeroomFrom() %>" showOnlyAssignedHomerooms="true" fieldName="<%=PatronLabelForm.FIELD_HOMEROOM_FROM %>" displayNameForNoHomeroom='<%=MessageHelper.formatMessage("patronlabel_AnyHomeroom")%>'/>
                     <%=MessageHelper.formatMessage("patronlabel_To") %> 
                          <base:homeroomBySiteDropDown siteID="<%=form.getSiteID() %>" currentSelection="<%=form.getHomeroomTo() %>" showOnlyAssignedHomerooms="true" fieldName="<%=PatronLabelForm.FIELD_HOMEROOM_TO %>" displayNameForNoHomeroom='<%=MessageHelper.formatMessage("patronlabel_AnyHomeroom")%>'/>
                </td>
            </c:when>
            <c:when test="<%=form.getSelectBy() == PatronBarcodeLabelReportParameters.SELECT_BY_PATRON_BARCODE_LIST%>">
                <td class="ColRowBold tdAlignRight" nowrap>&nbsp;</td>
                <td nowrap>
                  <base:barcodeList formName="<%=PatronLabelForm.FORM_NAME%>"/>
                </td>
            </c:when>
            <c:otherwise>
                <td class="ColRowBold tdAlignRight" nowrap>&nbsp;</td>
                <td class="ColRow" nowrap>
                <c:set var="size" value="20" />
                <c:set var="maxlength" value="90" />
                <c:if test="<%=form.getSelectBy() == PatronBarcodeLabelReportParameters.SELECT_BY_GRAD_YEAR%>">
                    <c:set var="size" value="4" />
                    <c:set var="maxlength" value="4" />
                </c:if>
                
                     <%=MessageHelper.formatMessage("patronlabel_From") %>
                          <html:text property="<%=PatronLabelForm.FIELD_SELECT_FROM%>" size="${size}" maxlength="${maxlength}"/>
                     <%=MessageHelper.formatMessage("patronlabel_To") %>
                          <html:text property="<%=PatronLabelForm.FIELD_SELECT_TO%>" size="${size}" maxlength="${maxlength}"/>
                </td>
            </c:otherwise>
        </c:choose>
    </tr>


    <tr>
        <td class="ColRowBold tdAlignRight" nowrap><%=MessageHelper.formatMessage("patronlabel_SortedBy") %></td>
        <td class="ColRow" nowrap>
             <html:radio property="<%=PatronLabelForm.FIELD_SORT_BY%>" value="<%=PatronLabelForm.SORT_BY_PATRON_NAME%>"/><%=MessageHelper.formatMessage("patronlabel_PatronName") %></td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td class="ColRow" nowrap>

            <html:radio property="<%=PatronLabelForm.FIELD_SORT_BY%>" value="<%=PatronLabelForm.SORT_BY_USER_DEFINED%>"/>

            <bean:define id="userDefines" name="<%=PatronLabelForm.FORM_NAME%>" property="userDefinesAvailable"/>
            <bean:define id="userDefinesWithBlank" name="<%=PatronLabelForm.FORM_NAME%>" property="userDefinesAvailableWithBlank"/>
            <html:select onchange="userDefineSortSelected()" property="<%=PatronLabelForm.FIELD_SORT_PRIMARY%>" >
            <html:options collection="userDefines" property="stringCode"
                    labelProperty="stringDesc"/></html:select>
            <%=MessageHelper.formatMessage("patronlabel_AndThenBy") %>
            <html:select property="<%=PatronLabelForm.FIELD_SORT_SECONDARY%>" onchange="userDefineSortSelected()">
            <html:options collection="userDefinesWithBlank" property="stringCode"
                    labelProperty="stringDesc"/></html:select>

        </td>
    </tr>
    <c:choose>
        <c:when test="<%=form.getSelectBy() != PatronBarcodeLabelReportParameters.SELECT_BY_LIST_OF_PATRONS%>">
            <tr>
        <td class="ColRowBold tdAlignRight" valign="top" nowrap><%=MessageHelper.formatMessage("patronlabel_LimitedToPatrons") %></td>
        <td valign="top" nowrap>
                    <table id=<%=PatronLabelForm.TABLE_CHECK_BOX%> cellSpacing=0 cellPadding=0 border=0 style="border-collapse: collapse" bordercolor="#111111">
                        <tr>
                        <td class="ColRow"><%=MessageHelper.formatMessage("patronlabel_OfTheseTypes") %></td>
                        <td class="ColRow">...</td>
                        <td class="ColRow"><%=MessageHelper.formatMessage("patronlabel_WithTheseStatuses") %></td>
                        </tr>
                        <tr>
                            <td valign="top">
                                <base:patronTypesList formName="<%=PatronLabelForm.FORM_NAME%>" allowToSaveWithoutAnyPatronTypesSelected="false"></base:patronTypesList>
                            </td>
                            <td>&nbsp;</td>
                            <td class="ColRow" valign="top">
                        &nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox name="<%= PatronLabelForm.FORM_NAME %>" property="<%= PatronLabelForm.FIELD_INCLUDE_ACTIVE %>"><%=MessageHelper.formatMessage("patronlabel_Active") %></html:checkbox><br>
                        &nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox name="<%= PatronLabelForm.FORM_NAME %>" property="<%= PatronLabelForm.FIELD_INCLUDE_RESTRICTED %>"><%=MessageHelper.formatMessage("patronlabel_Restricted") %></html:checkbox><br>
                        &nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox name="<%= PatronLabelForm.FORM_NAME %>" property="<%= PatronLabelForm.FIELD_INCLUDE_INACTIVE %>"><%=MessageHelper.formatMessage("patronlabel_Inactive") %></html:checkbox><br>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
        </c:when>
        <c:otherwise>
            <html:hidden property="<%=PatronLabelForm.FIELD_INCLUDE_ACTIVE %>"/>
            <html:hidden property="<%=PatronLabelForm.FIELD_INCLUDE_INACTIVE %>"/>
            <html:hidden property="<%=PatronLabelForm.FIELD_INCLUDE_RESTRICTED %>"/>
        </c:otherwise>
    </c:choose>
    <tr>
        <td class="ColRowBold tdAlignRight" nowrap><%=MessageHelper.formatMessage("patronlabel_IncludeTheFollowing") %></td>
        <td class="ColRow" nowrap>
            <html:checkbox property="<%=PatronLabelForm.FIELD_INCLUDE_DISPLAYABLE_BARCODE%>" name="<%=PatronLabelForm.FORM_NAME%>"/><%=MessageHelper.formatMessage("patronlabel_BarcodeNumber") %></td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight" nowrap><%=MessageHelper.formatMessage("patronlabel_FormattedFor") %></td>
        <td class="ColRow" nowrap>
            <html:radio property="<%=PatronLabelForm.FIELD_FORMATTED_FOR%>" value="<%=PatronLabelForm.FORMATTED_FOR_BARCODE_LABELS%>"/><%=MessageHelper.formatMessage("patronlabel_BarcodeLabels") %></td>
    </tr>
<% } %> <%-- The following block is always displayed even in single ID print mode --%>
<% if (form.getSingleIDToPrint() != null) { %>
    <%if (form.isDistrictUser()  && !form.getSingleIDToPrint().equals(new Long(0))){ %>
        <%if (form.isHideSiteDropdown()) { %>
            <html:hidden property="<%=PatronLabelForm.FIELD_PATRON_SITEID %>"/>
        <%} else { %>
            <tr>
                <td class="ColRowBold tdAlignRight" nowrap><%=MessageHelper.formatMessage("patronlabel_PrintLabelsFor") %></td>
                <td class="ColRow" nowrap>&nbsp;&nbsp;&nbsp;
                    <%=form.getSitesDropdown() %>
                </td>
            </tr>
        <%} %>
    <%} %>
    <tr>
        <td class="ColRowBold tdAlignRight" nowrap><%=MessageHelper.formatMessage("patronlabel_IncludeTheFollowing") %></td>
        <td class="ColRow" nowrap>&nbsp;&nbsp;&nbsp;
            <html:checkbox property="<%=PatronLabelForm.FIELD_INCLUDE_DISPLAYABLE_BARCODE%>" name="<%=PatronLabelForm.FORM_NAME%>"/><%=MessageHelper.formatMessage("patronlabel_BarcodeNumber") %></td>
    </tr>
		<tr>

			<td class="ColRowBold tdAlignRight">&nbsp;&nbsp;&nbsp;&nbsp;<html:radio styleId="<%=PatronLabelForm.ID_EXCEL_SINGLE%>"
					property="<%=PatronLabelForm.FIELD_TRANSACTION_SCOPE%>"
					value="<%=Integer.toString(PatronLabelForm.SCOPE_EXCEL)%>" /> <%=MessageHelper.formatMessage("patronlabel_ExportToMicrosoftExcel") %></td>
		</tr>
		<tr>        
        <td class="ColRowBold tdAlignRight" nowrap><html:radio styleId="<%=PatronLabelForm.ID_STOCK_SINGLE%>" property="<%=PatronLabelForm.FIELD_TRANSACTION_SCOPE%>" value="<%=Integer.toString(PatronLabelForm.SCOPE_CARD_STOCK)%>"/><%=MessageHelper.formatMessage("patronlabel_UseLabelStock") %></td>
        <td class="ColRow" nowrap>&nbsp;&nbsp;&nbsp;
            <html:select property="<%= BaseLabelForm.FIELD_LABEL_STOCK %>">
                <html:options collection="stocks" property="stringCode"
                              labelProperty="stringDesc"/>
            </html:select>
        </td>
    </tr>
<% } else { %>
    <tr>        
        <td class="ColRowBold tdAlignRight">&nbsp;</td>
        <td>
            <table cellspacing="1" cellpadding="0" border="0">
					<tr>
					<td class="ColRowBold" colspan="2">&nbsp;&nbsp;&nbsp;&nbsp;<html:radio styleId="<%=PatronLabelForm.ID_EXCEL_MULTI%>" property="<%=PatronLabelForm.FIELD_TRANSACTION_SCOPE%>" value="<%=Integer.toString(PatronLabelForm.SCOPE_EXCEL)%>" />
						<%=MessageHelper.formatMessage("patronlabel_ExportToMicrosoftExcel")%></td>
					</tr>
					<tr>
                    <td class="ColRowBold">&nbsp;&nbsp;&nbsp;&nbsp;<html:radio styleId="<%=PatronLabelForm.ID_STOCK_MULTI%>" property="<%=PatronLabelForm.FIELD_TRANSACTION_SCOPE%>" value="<%=Integer.toString(PatronLabelForm.SCOPE_CARD_STOCK)%>"/>
                    <%=MessageHelper.formatMessage("patronlabel_UseLabelStock") %>&nbsp;</td>
                    <td class="tdAlignRight">
                        <html:select property="<%= BaseLabelForm.FIELD_LABEL_STOCK %>">
                            <html:options collection="stocks" property="stringCode"
                                          labelProperty="stringDesc"/>
                        </html:select>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
<% } %>
    <tr>
        <td>&nbsp;</td>
        <td class="ColRow" nowrap>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=MessageHelper.formatMessage("patronlabel_StartOnLabel") %><html:text property="<%= BaseLabelForm.FIELD_LABEL_START %>" maxlength="3" size="4"/>
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td class="ColRow" nowrap>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=MessageHelper.formatMessage("patronlabel_PrinterOffsetHorizontal") %>&nbsp;<html:text property="<%= BaseLabelForm.FIELD_HORIZONTAL_OFFSET %>" maxlength="4" size="4"/>
            &nbsp;&nbsp;&nbsp;<%=MessageHelper.formatMessage("patronlabel_Vertical") %>&nbsp;
            <html:text property="<%= BaseLabelForm.FIELD_VERTICAL_OFFSET %>" maxlength="4" size="4"/>
        </td>
    </tr>
   
<% if (form.getSingleIDToPrint() == null) { %>
<base:isMediaSite showForMedia="false">
    <tr>
        <td>&nbsp;</td>
        <td class="ColRow" nowrap>
            <html:radio property="<%=PatronLabelForm.FIELD_FORMATTED_FOR%>" value="<%=PatronLabelForm.FORMATTED_FOR_CIRC_DESK%>"/><%=MessageHelper.formatMessage("patronlabel_UseAtTheCirculationDesk") %></td>
    </tr>

    <tr>
        <td>&nbsp;</td>
        <td class="ColRow" nowrap>
            &nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="<%=PatronLabelForm.FIELD_START_NEW_PAGE%>"/><%=MessageHelper.formatMessage("patronlabel_StartANewPageForEachGroup") %></td>
    </tr>
</base:isMediaSite>
    <% if (form.gimmeOkayToUseCircCommands()) { %>
    
    <tr>
        <td>&nbsp;</td>
        <td class="ColRow" nowrap>
            &nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="<%=PatronLabelForm.FIELD_INCLUDE_COMMAND_BARCODES%>"/><%=MessageHelper.formatMessage("patronlabel_Include") %><% if (form.isShowCommandSheetTypeDropDown()) { %>
                <html:select property="<%= PatronLabelForm.FIELD_COMMAND_SHEET_TYPE %>">
                <html:options collection="commandSheetTypes" property="stringCode"
                              labelProperty="stringDesc"/>
            </html:select>
            <%} else {%>
                <html:hidden property="<%=PatronLabelForm.FIELD_COMMAND_SHEET_TYPE%>"/>
            <%} %>
            <%=MessageHelper.formatMessage("patronlabel_CirculationCommandBarcodes") %>
        </td>
    </tr>
    
    <% } else { %>
       <html:hidden property="<%=PatronLabelForm.FIELD_INCLUDE_COMMAND_BARCODES%>" value="false"/>
    <% } %>
    
<% } %>

<!-- don't put this html in if we reached here from add or edit copies or items --->
<%if(!form.arrivedAtViaAddOrEdit()){ %>
    <tr>
        <td colspan = "2" align="center">
            <table >
                <tr><td colspan="2" align="center" class="ColRowBold"><%=MessageHelper.formatMessage("patronlabel_InAdditionToAdjustingYourPrinterOffsets")%></td></tr>
            <% if (!isInternational) { %>
                <tr><td colspan="2" align="center" class="ColRow"><%=BaseLabelForm.getMessageAligningBarcodesForAssistance()%></td></tr>
            <% } %>
            </table>
        </td>
    </tr>
<%}%> 

    <tr>
        <td colspan="2" align="center" class="ColRowBold">
            <base:reportButton/>
        </td>
    </tr>

</base:outlinedTableAndTabsWithinThere>
</base:form>
<script language="JavaScript" type="text/javascript">
 
function userDefineSortSelected() {
    document.<%=PatronLabelForm.FORM_NAME%>.<%=PatronLabelForm.FIELD_SORT_BY%>[1].checked = true;
}
 
</script>
