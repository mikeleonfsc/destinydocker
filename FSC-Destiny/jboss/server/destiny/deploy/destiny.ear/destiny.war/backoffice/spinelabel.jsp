<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.SpineLabelForm" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.BaseCopyLabelForm" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.data.CopyLabelJobParams" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.BaseLabelForm"%>
<%@page import="com.follett.fsc.destiny.util.printing.PaperStockFactory"%>
<%@page import="com.follett.fsc.common.TimestampHelper"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.remote.data.SpineLabelJobParams"%>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<%@page import="com.follett.fsc.destiny.session.backoffice.remote.data.SpineLabelJobParams"%>
<%@page import="com.follett.fsc.destiny.util.Barcode"%>
<%@page import="com.follett.fsc.destiny.util.Permission"%>
<bean:define id="stocks" name="<%= SpineLabelForm.FORM_NAME %>" property="stockList"/>
<bean:define id="fonts" name="<%= SpineLabelForm.FORM_NAME %>" property="fontList"/>

<base:messageBox strutsErrors="true"/>

<%
    SpineLabelForm form = (SpineLabelForm)request.getAttribute("backoffice_servlet_SpineLabelForm");
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    boolean isInternational = UserContext.getMyContextLocaleHelper().isInternationalProduct();
%>

<base:form action="/backoffice/servlet/handlespinelabelform.do" enctype="multipart/form-data">
<html:hidden property="<%= SpineLabelForm.FIELD_COLLECTION_TYPE %>"/>
<html:hidden property="<%=SpineLabelForm.FIELD_CHANGED_SYMBOLOGY%>"/>
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=BaseCopyLabelForm.BUTTON_TRAP_ENTER%>">

<base:outlinedTable id="<%=SpineLabelForm.TABLE_SPINE_LABEL%>" borderColor='#C0C0C0'>
    <tr>
        <td colspan="2" class="TableHeading" nowrap>
            <%= MessageHelper.formatMessage("spinelabel_CreateSpinePocketLabels") %>
        </td>
    </tr>
    <c:choose>
        <c:when test="<%= form.isDistrictUser() %>">
            <tr>
                <td class="ColRowBold tdAlignRight">
                    <%= MessageHelper.formatMessage("spinelabel_For") %>
                </td>
                <td>
                    <base:selectSite 
                        name='<%= BaseCopyLabelForm.FIELD_SITE_ID %>' 
                        selectedSiteID='<%=form.getSiteID().toString() %>' 
                        includeAllLibraries='true' 
                        submitOnChange='true'
                        includeLibrarySites="true"
            			includeTextbookSites="false"
            			includeMediaSites="false"
            			includeAssetSites="false"
                        />
                </td>
            </tr>
            <tr>
                <td>
                    &nbsp;
                </td>
                <td class="Instruction">
                    <%= MessageHelper.formatMessage("spinelabel_IfYouDoNotSelectSpecificSite") %>
                </td>
            </tr>
        </c:when>
        <c:otherwise>
            <html:hidden property="<%= BaseCopyLabelForm.FIELD_SITE_ID %>" value="<%= store.getSiteID().toString() %>"></html:hidden>
        </c:otherwise>
    </c:choose>
    <c:if test="<%=form.getSiteID()==0 && form.isDistrictUser()%>">
        <tr>
            <td class="ColRowBold tdAlignRight">
               <%= MessageHelper.formatMessage("spinelabel_GroupBy") %>
            </td>
            <td class="ColRow">
                <html:checkbox property="<%=SpineLabelForm.FIELD_GROUP_BY_SITE_NAME%>"/>&nbsp;<%= MessageHelper.formatMessage("spinelabel_Site") %>
            </td>
        </tr>    
    </c:if> 
    <c:if test="<%=form.getSiteID()!=0 && form.isDistrictUser()%>">
        <html:hidden property="<%= SpineLabelForm.FIELD_GROUP_BY_SITE_NAME %>"/>
    </c:if> 
    <tr>
        <td class="ColRowBold tdAlignRight">
        <%= MessageHelper.formatMessage("spinelabel_SortBy") %>
        </td>
        <td class="ColRow">
            <html:select property="<%=SpineLabelForm.FIELD_SELECT_SORT_BY%>">
                <html:option value='<%="" + CopyLabelJobParams.SORT_BY_CALL_NUMBER_AUTHOR%>' ><%= MessageHelper.formatMessage("spinelabel_CallNumber") %></html:option>
                <html:option value='<%="" + CopyLabelJobParams.SORT_BY_DATE_COPIES_ADDED%>'><%= MessageHelper.formatMessage("spinelabel_DateCopiesAdded") %></html:option>
            </html:select>
        </td>    
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">
            <%= MessageHelper.formatMessage("spinelabel_BasedOn") %>
        </td>
        <td class="ColRow">
            <bean:define id="myList" name="<%= SpineLabelForm.FORM_NAME %>" property="<%= SpineLabelForm.FIELD_BASED_ON_LIST %>"/>

            <html:select property="<%= SpineLabelForm.FIELD_BASED_ON_ID %>" onchange="this.form.submit()">
                <html:options collection="myList" property="longID" labelProperty="stringDesc"/>
            </html:select>
            <c:choose>
                <c:when test="<%= form.getLabelsBasedOn() == CopyLabelJobParams.BASED_ON_MYLIST %>">
                    &nbsp;
                    <base:myListSelect name="<%= SpineLabelForm.FIELD_SELECTED_LISTID %>" submitOnChange="false" prompt="" publicList="false" selectedMyListID="<%=form.getSelectedListID()%>"/>
                    <html:hidden property="<%=SpineLabelForm.FIELD_SELECTED_CATEGORYID%>" value='<%= "" + form.getSelectedCategoryID()%>'/>
                </c:when>
                <c:when test="<%= form.getLabelsBasedOn() == CopyLabelJobParams.BASED_ON_CATEGORY %>">
                    &nbsp;
                    <base:categorySelect name="<%= SpineLabelForm.FIELD_SELECTED_CATEGORYID%>" siteID="<%= form.getSiteID() %>" collectionType="<%=form.getCollectionType()%>" selectedCategoryID="<%=form.getSelectedCategoryID()%>" showAllOptionText="false" showDistrictCategories="<%=form.getStore().isDistrictUser()%>"/>
                    <html:hidden property="<%=SpineLabelForm.FIELD_SELECTED_LISTID%>" value='<%= "" + form.getSelectedListID()%>'/>
                </c:when>
                <c:otherwise>
                    <html:hidden property="<%=SpineLabelForm.FIELD_SELECTED_CATEGORYID%>" value='<%= "" + form.getSelectedCategoryID()%>'/>
                    <html:hidden property="<%=SpineLabelForm.FIELD_SELECTED_LISTID%>" value='<%= "" + form.getSelectedListID()%>'/>
                </c:otherwise>
            </c:choose>
        </td>
    </tr>

    <c:if test="<%= form.getLabelsBasedOn() == CopyLabelJobParams.BASED_ON_MYLIST %>">
        <tr>
          <td>&nbsp;</td>
          <td>
            <base:genericButton src="/buttons/large/viewlist.gif" 
                    alt='<%= MessageHelper.formatMessage("viewList") %>'
                    name="<%= BaseCopyLabelForm.BUTTON_VIEW_LIST %>" />
          </td>
        </tr>
    </c:if>

    <c:choose>
        <c:when test="<%= form.getLabelsBasedOn() == CopyLabelJobParams.BASED_ON_BARCODE_LIST %>">
            <tr>
                <td class="ColRowBold tdAlignRight">&nbsp;
                </td>
                <td nowrap>
                    <html:hidden property="<%= BaseCopyLabelForm.FIELD_DATE_ADDED %>"/>
                   <base:barcodeList 
                       formName="<%=SpineLabelForm.FORM_NAME%>"/>
                </td>
            </tr>
        </c:when>
        <c:when test="<%= form.getLabelsBasedOn() == CopyLabelJobParams.BASED_ON_BARCODE_RANGE %>">
            <tr>
                <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("spinelabel_Range")%></td>
                <td class="ColRow" nowrap="nowrap">
                    <html:text property="<%= SpineLabelForm.FIELD_RANGE_FROM%>" maxlength="<%=String.valueOf(Barcode.MAX_LENGTH_SUPPORTED_SYMBOLOGIES)%>"/>
                    <%=MessageHelper.formatMessage("spinelabel_To")%>
                    <html:text property="<%= SpineLabelForm.FIELD_RANGE_TO%>" maxlength="<%=String.valueOf(Barcode.MAX_LENGTH_SUPPORTED_SYMBOLOGIES)%>"/>
                    &nbsp;
                    <base:link id="<%=SpineLabelForm.LINK_CHANGE_SYMBOLOGY%>" permission="<%= Permission.BACK_OFFICE_CHANGE_SITE_PREFERENCES %>"    
                    page="javascript:submitTheForm_ChangeSymbology()" showTextAlways="true" appendCollectionType="false">
                        <%=form.getSymbologyText()%>
                    </base:link>
                </td>
            </tr>
        </c:when>
        <c:otherwise>
            <tr>
                <td class="ColRowBold tdAlignRight">
                    <%= MessageHelper.formatMessage("spinelabel_CopiesAdded") %>
                </td>
                <td>
                    <table>
                        <tr>
                            <td colspan="4" class="ColRow tdAlignRight"><%= MessageHelper.formatMessage("defaulthours_HoursNote", TimestampHelper.addMinutes(TimestampHelper.getNow(true), 481), TimestampHelper.addMinutes(TimestampHelper.getNow(true), 961)) %></td>
                        </tr>                    
                    </table>                
                    <table id="<%=BaseLabelForm.TABLE_DATE_COPIES_ADDED %>">
                        <tr>
                            <td class="ColRow tdAlignRight"> <%= MessageHelper.formatMessage("spinelabel_FromDate") %></td>
                            <td class="ColRow">
                                <base:date 
                                    buttonName = "<%= BaseCopyLabelForm.BUTTON_FROM_DATE_ADDED %>"
                                    fieldName = "<%= BaseCopyLabelForm.FIELD_FROM_DATE_ADDED %>"
                                    dateValue = "<%=form.getFromDateAdded()%>"
                                    altText = '<%= MessageHelper.formatMessage("spinelabel_ChangeDateAdded")%>'
                                 />
                            </td>
                            <td class="ColRow tdAlignRight">
                                <%=MessageHelper.formatMessage("spinelabel_FromTime") %>
                            </td>
                            <td class="ColRow">
                                <base:time 
                                    textFieldName="<%=BaseLabelForm.FIELD_FROM_TIME%>" 
                                    timeValue="<%=form.getFromTime()%>" 
                                />
                            </td>
                         </tr>
                        <tr>
                            <td class="ColRow tdAlignRight"> <%= MessageHelper.formatMessage("spinelabel_ToDate") %></td>
                            <td class="ColRow">
                                <base:date 
                                    buttonName = "<%= BaseCopyLabelForm.BUTTON_TO_DATE_ADDED %>"
                                    fieldName = "<%= BaseCopyLabelForm.FIELD_TO_DATE_ADDED %>"
                                    dateValue = "<%=form.getToDateAdded()%>"
                                    altText = '<%= MessageHelper.formatMessage("spinelabel_ChangeDateAdded")%>'
                                 />
                            </td>
                            <td class="ColRow tdAlignRight">
                                <%=MessageHelper.formatMessage("spinelabel_FromTime") %>
                            </td>                            
                            <td class="ColRow">
                                <base:time 
                                    textFieldName="<%=BaseLabelForm.FIELD_TO_TIME%>" 
                                    timeValue="<%=form.getToTime()%>" 
                                />
                            </td>
                         </tr>
                     </table>
                </td>
            </tr>
        </c:otherwise>
    </c:choose>
    <tr>
        <td colspan="2">
        	<base:imageLine height="1" width="100%"/>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">
            <%=MessageHelper.formatMessage("spinelabel_OutputOptions") %>
        </td>
         <td class="ColRowBold">
             <html:radio name="<%= SpineLabelForm.FORM_NAME %>"
                   property="<%= SpineLabelForm.OPTION_OUTPUT_OPTION %>" 
                   value="<%= Integer.toString(SpineLabelForm.OPTION_EXPORT_TO_EXCEL) %>">
                   <%=MessageHelper.formatMessage("spinelabel_ExportToMicrosoftExcel") %>
             </html:radio>
    </tr>  
    <tr>
        <td>&nbsp;</td>
        <td class="ColRowBold">
             <html:radio name="<%= SpineLabelForm.FORM_NAME %>"
                   property="<%= SpineLabelForm.OPTION_OUTPUT_OPTION %>" 
                   value="<%= Integer.toString(SpineLabelForm.OPTION_USE_LABEL_STOCK) %>">
                   <%= MessageHelper.formatMessage("spinelabel_UseLabelStock") %>
             </html:radio>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("spinelabel_LabelStock") %></td>
        <td>
          <html:select property="<%= BaseCopyLabelForm.FIELD_LABEL_STOCK %>" onchange="this.form.submit()">
            <html:options collection="stocks" property="stringCode"
                          labelProperty="stringDesc"/>
          </html:select>
        </td>
    </tr>
    <c:if test="<%= PaperStockFactory.PAPERSTOCKNAME_SPINEPOCKET_DEMCO_2X6_14971370.equals(form.getLabelStock())  %>">        
        <tr>
            <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("spinelabel_CenterLabel") %></td>
            <td><html:checkbox property="<%= SpineLabelForm.FIELD_CENTER_LABEL %>"></html:checkbox></td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("spinelabel_IncludeCopyBarcodeOnSpinePocket") %></td>
            <td><html:checkbox property="<%= SpineLabelForm.FIELD_INCLUDE_COPY_BARCODE %>"></html:checkbox></td>
        </tr>
        </c:if>
    <tr>
        <td class="ColRowBold tdAlignRight">
        <%= MessageHelper.formatMessage("spinelabel_StartOnLabel") %>
        </td>
        <td>
        <html:text property="<%= BaseCopyLabelForm.FIELD_LABEL_START %>" maxlength="3" size="4"/>
        </td>
    </tr>


    <tr>
        <td class="ColRowBold tdAlignRight">
        <%= MessageHelper.formatMessage("spinelabel_PrinterOffset") %>
        </td>
        <td class="ColRow" nowrap>
            <%= MessageHelper.formatMessage("spinelabel_Horizontal") %>&nbsp;<html:text property="<%= BaseCopyLabelForm.FIELD_HORIZONTAL_OFFSET %>" maxlength="4" size="4"/>
            &nbsp;&nbsp;&nbsp;<%= MessageHelper.formatMessage("spinelabel_Vertical") %>&nbsp;
            <html:text property="<%= BaseCopyLabelForm.FIELD_VERTICAL_OFFSET %>" maxlength="4" size="4"/>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">
        <%= MessageHelper.formatMessage("spinelabel_CallNumberFontSize") %>
        </td>
        <td>
          <html:select property="<%= SpineLabelForm.FIELD_LABEL_CALL_NUMBER_FONT_SIZE %>">
            <html:options collection="fonts" property="stringCode"
                          labelProperty="stringDesc"/>
          </html:select>

        </td>
    </tr>
    <tr>
        <td class = "ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("spinelabel_SpineLabels")%></td>
        <td class="ColRow"><html:checkbox property="<%= SpineLabelForm.FIELD_BREAK_ON_SPACE %>"/>&nbsp;<%=MessageHelper.formatMessage("spinelabel_StartANewLineAtEverySpace")%></td>
    </tr>
        
<%if(!form.arrivedAtViaAddOrEdit()){ %>
    <tr>
        <td colspan = "2" align="center">
            <table >
                <tr><td colspan="2" align="center" class="ColRowBold"><%=MessageHelper.formatMessage("spinelabel_InAdditionToAdjustingYourPrinterOffsets")%></td></tr>
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

</base:outlinedTable>
</base:form>

<SCRIPT LANGUAGE="javascript" TYPE="text/javascript">
<!--
    function submitTheForm_ChangeSymbology() {
        document.<%=SpineLabelForm.FORM_NAME%>.<%=SpineLabelForm.FIELD_CHANGED_SYMBOLOGY%>.value = "true";
        document.<%=SpineLabelForm.FORM_NAME%>.submit();
    }
// -->
</SCRIPT>
