<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.PatronCircReportForm" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.PatronCircReportJob" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib prefix="c" uri="/WEB-INF/jstl-core.tld" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>



<base:messageBox strutsErrors="true"/>

<bean:define id="patronFieldsID" name="<%=PatronCircReportForm.FORM_NAME%>" property="patronFieldList"/>
<bean:define id="patronInfoList" name="<%=PatronCircReportForm.FORM_NAME%>" property="patronInfoList"/>
<bean:define id="pageLayoutID" name="<%=PatronCircReportForm.FORM_NAME%>" property="pageLayoutFieldList"/>
<bean:define id="form" name="<%=PatronCircReportForm.FORM_NAME%>" type="com.follett.fsc.destiny.client.backoffice.servlet.PatronCircReportForm"/>

<base:form action="/backoffice/servlet/handlepatroncircreportform.do">
<html:hidden property="currentPage" value="<%= String.valueOf(PatronCircReportForm.PAGE_DETAILS) %>"/>
<html:hidden property="<%= PatronCircReportForm.FIELD_INCLUDE_TEXTBOOKS %>"/>
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">
<script type="text/javascript">
// <![CDATA[
function display(obj,id1,id2) {
txt = obj.options[obj.selectedIndex].value;
document.getElementById(id1).style.display = 'none';
document.getElementById(id2).style.display = 'none';

if ( txt.match('Homeroom') ) {
   document.getElementById('display_homeroom').style.display = 'block';
} else {
   document.getElementById('display_nonhomeroom').style.display = 'block';
}
}
// ]]>
</script>    

<base:outlinedTable id="<%=PatronCircReportForm.TABLE_MAIN_TABLE%>" borderColor='#C0C0C0' cellpadding="3">


    <tr>
        <td colspan="3" align="center">
            <table id="<%=PatronCircReportForm.TABLE_WIZARD_HEADER%>">
                <tr>
                    <td><base:genericButton alt='<%=MessageHelper.formatMessage("patroncircreportdetails_Format") %>' src="/tabs/formatpassive.gif" name="format"/></td>
                    <% if (!form.isMediaBookingUser()) { %>
                        <td><base:genericButton alt='<%=MessageHelper.formatMessage("patroncircreportdetails_Limit") %>' src="/tabs/limitpassive.gif" name="limit"/></td>
                        <td><base:image src="/tabs/detailsactive.gif" alt='<%=MessageHelper.formatMessage("patroncircreportdetails_Detail") %>'/></td>
                    <% } else {%>
                        <td><base:image src="/tabs/details2active.gif" alt='<%=MessageHelper.formatMessage("patroncircreportdetails_Detail") %>'/></td>
                        <td>&nbsp;</td>
                    <% } %>
                </tr>
                <tr>
                    <td class="Instruction" align="center" colspan="3">
                    <bean:write name="<%=PatronCircReportForm.FORM_NAME%>" property="subtitle"/>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    <tr>
        <td colspan="3"><base:imageLine height="1" width="100%"/></td>
    </tr>
    
    
    <logic:notEqual name="<%=PatronCircReportForm.FORM_NAME%>" property="formatResults" value="<%=PatronCircReportJob.FORMAT_EMAIL_TO_HOMEROOMS%>" >
        <tr>
            <td class="ColRowBold tdAlignRight" valign="top">
                <nobr><%=MessageHelper.formatMessage("patroncircreportdetails_SelectSortBy") %></nobr>
            </td>
            <td valign="top" colspan="2">
                
            <table id="<%=PatronCircReportForm.TABLE_SELECT_BY_HOUSE %>">
            <tr>
            <td>
                <html:select onchange="display(this,'display_homeroom','display_nonhomeroom');" property="groupByField">
                    <html:options collection="patronFieldsID" property="stringCode"
                        labelProperty="stringDesc"/>
                </html:select>
            </td>
    <!-- Please do not reformat this html.  As weird as it looks, we need to leave this way to avoid too much white space on 
        the outputted page. -->
    <td id="display_nonhomeroom" style="<%=form.gimmeHomeroomDisplay(false) %>" class="ColRow" nowrap>&nbsp;<%=MessageHelper.formatMessage("patroncircreportdetails_From") %>&nbsp;<html:text 
                    property="<%=PatronCircReportForm.FIELD_GROUP_BY_START%>" size="9" 
                    maxlength="<%=PatronCircReportForm.LENGTH_RANGE_FIELD%>"/>&nbsp;<%=MessageHelper.formatMessage("patroncircreportdetails_to") %>&nbsp;<html:text 
                    property="<%=PatronCircReportForm.FIELD_GROUP_BY_END%>" size="9" maxlength="<%=PatronCircReportForm.LENGTH_RANGE_FIELD%>"/>
    
    </td>
    
    <td id="display_homeroom" style="<%=form.gimmeHomeroomDisplay(true) %>" class="ColRow" nowrap>&nbsp;<%=MessageHelper.formatMessage("patroncircreportdetails_From") %>&nbsp;<base:homeroomBySiteDropDown 
    currentSelection="<%=form.getHomeroomIDFrom() %>"
    showOnlyAssignedHomerooms="true"
    displayNameForNoHomeroom='<%=MessageHelper.formatMessage("patroncircreportdetails_AnyHomeroom") %>'
    fieldName="<%=PatronCircReportForm.FIELD_HOMEROOM_ID_FROM %>"/>
    
                &nbsp;<%=MessageHelper.formatMessage("patroncircreportdetails_to") %>&nbsp;
    <base:homeroomBySiteDropDown 
    currentSelection="<%=form.getHomeroomIDTo() %>"
    showOnlyAssignedHomerooms="true"
    displayNameForNoHomeroom='<%=MessageHelper.formatMessage("patroncircreportdetails_AnyHomeroom") %>'    
    fieldName="<%=PatronCircReportForm.FIELD_HOMEROOM_ID_TO %>"/>
    </td>            
        </tr>
        </table>
                
            </td>
            
        </tr>

        <logic:equal name="<%=PatronCircReportForm.FORM_NAME%>" property="formatResults" value="<%=PatronCircReportJob.FORMAT_NOTICE %>" >
            <tr>
                <td colspan="3"><base:imageLine height="1" width="100%"/></td>
            </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("patroncircreportdetails_Distributed") %></td>
                    <td class="ColRow" colspan="2">
                        <html:radio property="<%=PatronCircReportForm.FIELD_DISTRIBUTED%>" value="<%=PatronCircReportJob.NOTICE_FORMAT_INTERNALLY%>"><%=MessageHelper.formatMessage("patroncircreportdetails_Internally") %></html:radio>
                        <base:helpTag helpFileName="d_distributed_internally_vs_mailed.htm"/>
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight">&nbsp;</td>
                    <td class="ColRow" colspan="2">
                        <html:radio property="<%=PatronCircReportForm.FIELD_DISTRIBUTED%>" value="<%=PatronCircReportJob.NOTICE_FORMAT_MAILED%>"><%=MessageHelper.formatMessage("patroncircreportdetails_Mailed") %></html:radio>
                    </td>
                </tr>
                <logic:equal name="<%=PatronCircReportForm.FORM_NAME%>" property="displayEmail" value="true" >
                <tr>
                    <td class="ColRowBold tdAlignRight">&nbsp;</td>
                    <td class="ColRow" colspan="2">
                        <html:radio property="<%=PatronCircReportForm.FIELD_DISTRIBUTED%>" value="<%=PatronCircReportJob.NOTICE_FORMAT_EMAILED%>"
                        onclick='<%="document." + PatronCircReportForm.FORM_NAME + "." + PatronCircReportForm.FIELD_EMAIL_DISPLAY_NAME + ".focus();"%>'><%=MessageHelper.formatMessage("patroncircreportdetails_ViaEmailProvideSenderInformation") %></html:radio>
                    </td>
                </tr>
            <tr>
                <td class="ColRowBold tdAlignRight">&nbsp;</td>
                <td colspan="2">
                    <table border="0" cellpadding="2">
                        <tr>
                            <td>
                               <base:imageSpacer width="12" height="1"/></td>
                            <td class="ColRow tdAlignRight"><%=MessageHelper.formatMessage("patroncircreportdetails_DisplayName") %></td>
                            <td><html:text property="<%=PatronCircReportForm.FIELD_EMAIL_DISPLAY_NAME%>" size="25"
                            onclick='<%="document." + PatronCircReportForm.FORM_NAME + "." + PatronCircReportForm.FIELD_DISTRIBUTED + "[2]" + ".checked = true;"%>'/></td>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td>&nbsp;</td>
                            <td class="ColRow tdAlignRight"><%=MessageHelper.formatMessage("patroncircreportdetails_Email") %></td>
                            <td><html:text property="<%=PatronCircReportForm.FIELD_EMAIL_ADDRESS%>" size="25"
                            onclick='<%="document." + PatronCircReportForm.FORM_NAME + "." + PatronCircReportForm.FIELD_DISTRIBUTED + "[2]" + ".checked = true;"%>'/></td>
                            <td nowrap>
                                &nbsp;
                                <base:genericButton src="/buttons/large/testemail.gif" alt='<%=MessageHelper.formatMessage("testEmail") %>' name="<%=PatronCircReportForm.BUTTON_TEST_EMAIL%>" />
                                <base:helpTag helpFileName="d_email_sender_info.htm"/>
                            </td>
                        </tr>
                        <tr>
                            <td>&nbsp;</td>
                            <td class="ColRow tdAlignRight"><%=MessageHelper.formatMessage("patroncircreportdetails_SendTo") %></td>
                            <td class="ColRow">
                                <html:radio property="<%=PatronCircReportForm.FIELD_SEND_TO_EMAIL%>" value="<%=PatronCircReportJob.PARAM_SEND_TO_EMAIL_BOTH%>"><%=MessageHelper.formatMessage("patroncircreportdetails_EmailOneAndEmailTwo") %></html:radio>
                            </td>
                            <td>&nbsp;</td>
                        </tr>  
                        <tr>
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td class="ColRow">
                                <html:radio property="<%=PatronCircReportForm.FIELD_SEND_TO_EMAIL%>" value="<%=PatronCircReportJob.PARAM_SEND_TO_EMAIL_1%>"><%= MessageHelper.formatMessage("patroncircreportdetails_EmailOne") %></html:radio>
                            </td>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td class="ColRow">
                                <html:radio property="<%=PatronCircReportForm.FIELD_SEND_TO_EMAIL%>" value="<%=PatronCircReportJob.PARAM_SEND_TO_EMAIL_2%>"><%=MessageHelper.formatMessage("patroncircreportdetails_EmailTwo") %></html:radio>
                            </td>
                            <td>&nbsp;</td>
                        </tr>
                    </table>
                </td>
            </tr>
            </logic:equal>
            <logic:equal name="<%=PatronCircReportForm.FORM_NAME%>" property="formatResults" value="<%=PatronCircReportJob.FORMAT_NOTICE %>" >
            <tr>
                <td class="ColRowBold tdAlignRight" valign="top"><nobr><%=MessageHelper.formatMessage("patroncircreportdetails_PageLayout") %></nobr></td>
                <td class="ColRow" colspan="2">
                    <html:select property="pageLayout">
                        <html:options collection="pageLayoutID" property="stringCode"
                            labelProperty="stringDesc"/>
                    </html:select>
                </td>
            </tr>
            </logic:equal>
            <tr>
                <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("patroncircreportdetails_Message") %></td>
                <td class="ColRow" colspan="2"><nobr>
                    <html:text property="<%=PatronCircReportForm.FIELD_GREETING%>" size="20" maxlength="40"/>&nbsp;<%=MessageHelper.formatMessage("patroncircreportdetails_PatronsName") %>
                </nobr>
                </td>
            </tr>
            <tr>
                <td class="ColRowBold tdAlignRight">&nbsp;</td>
                <td class="ColRow" colspan="2">
                    <html:textarea property="<%=PatronCircReportForm.FIELD_MESSAGE%>" rows="4" cols="40"/>
                </td>
            </tr>
            
            <tr>
                <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("patroncircreportdetails_AddressLabel") %></td> 
                <td class="ColRow" colspan="2">
                    <html:checkbox property="<%=PatronCircReportForm.FIELD_PARENT_GUARDIAN%>"/><%=MessageHelper.formatMessage("patroncircreportdetails_ToTheParentOrGuardianOfPatronsName")%>
                </td>
            </tr>
    
        </logic:equal>
    </logic:notEqual>
    <logic:equal name="<%=PatronCircReportForm.FORM_NAME%>" property="formatResults" value="<%=PatronCircReportJob.FORMAT_EMAIL_TO_HOMEROOMS%>" >
        <tr>
            <td class="ColRowBold tdAlignRight" vAlign="top"><%=MessageHelper.formatMessage("patroncircreportdetails_SendTo") %></td>
            <td class="ColRow" valign="top" colspan="2">
                <table id="<%=PatronCircReportForm.TABLE_EMAIL_HOMEROOM%>" cellpadding="0" cellspacing="3">
                    <tr>
                        <td class="ColRow" valign="top">
                            <%=form.getSelectedHomerooms() %>
                        </td>
                        <td valign="top"><base:genericButton absbottom="false" name="<%=PatronCircReportForm.BUTTON_UPDATE%>" src="/buttons/large/update.gif" alt='<%=MessageHelper.formatMessage("update") %>'/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>

        <tr>
            <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("patroncircreportdetails_DisplayName") %></td>
            <td colspan="2"><html:text property="<%=PatronCircReportForm.FIELD_EMAIL_DISPLAY_NAME%>" size="25"/></td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("patroncircreportdetails_Email") %></td>
            <td colspan="2"><html:text property="<%=PatronCircReportForm.FIELD_EMAIL_ADDRESS%>" size="25"/>
                &nbsp;
                <base:genericButton src="/buttons/large/testemail.gif" alt='<%=MessageHelper.formatMessage("testEmail") %>' name="<%=PatronCircReportForm.BUTTON_TEST_EMAIL%>" />
                <base:helpTag helpFileName="d_email_sender_info.htm"/>
            </td>
        </tr>
    </logic:equal>
    <logic:equal name="<%=PatronCircReportForm.FORM_NAME%>" property="outputExcel" value="false" >
        <logic:equal name="<%=PatronCircReportForm.FORM_NAME%>" property="formatResults" value="<%=PatronCircReportJob.FORMAT_REPORT %>" >
            <tr>
                <td>&nbsp;</td>
                <td class="ColRow" colspan="2">
                    <html:checkbox property="<%=PatronCircReportForm.FIELD_START_NEW_PAGE%>"><%=MessageHelper.formatMessage("patroncircreportdetails_StartANewPageForEachGroup") %></html:checkbox>
                </td>
            </tr>
        </logic:equal>
    </logic:equal>

    <tr>
        <td colspan="3"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top"><%=MessageHelper.formatMessage("patroncircreportdetails_AlsoDisplay") %></td>
        <td colspan="2">
            &nbsp;
        </td>
    </tr>
    <tr>
    <% 
        String titleInfo = MessageHelper.formatMessage("patroncircreportdetails_TitleInfo"); 
        boolean selectAllAlreadyDisplayedOnARow = false; 
        boolean clearAllAlreadyDisplayedOnARow = false; 
    %>
       <% if ((form.isOptionIncludeForeignItems()) || ((form.isLibraryProductOnly() && !form.isMediaBookingUser()) || (form.isLibraryProductViewable() && !form.isLibraryProductOnly()))) { %>
        <td class="ColRowItalic tdAlignRight">
            <nobr><%= titleInfo %></nobr>
            <%
                titleInfo = ""; 
                selectAllAlreadyDisplayedOnARow = true; 
            %>
        </td>
        <td class="ColRow">
            <c:choose>
                <c:when test="<%= form.isMediaBookingUser() %>">
                    <html:checkbox property="<%=PatronCircReportForm.FIELD_INCLUDE_TITLE%>"><%=MessageHelper.formatMessage("patroncircreportdetails_TitleForMediaMaterials") %></html:checkbox>
                </c:when>
                <c:otherwise>
                    <html:checkbox property="<%=PatronCircReportForm.FIELD_INCLUDE_TITLE%>"><%=MessageHelper.formatMessage("patroncircreportdetails_TitleForLibraryMaterials") %></html:checkbox>
                </c:otherwise>
            </c:choose>
        </td>
        <td class="tdAlignRight">
            <base:genericButton
                src="/buttons/small/selectall_opaque.gif"
                alt='<%=MessageHelper.formatMessage("selectAll")%>'
                name="<%=PatronCircReportForm.BUTTON_SELECT_ALL%>"/>
        </td>
        
        <% } %>
    </tr>

    <logic:equal name="<%=PatronCircReportForm.FORM_NAME%>" property="optionListCheckedOutOverdues" value="true">
    <tr>
        <td class="ColRowItalic tdAlignRight"><%= titleInfo %></td>
        <td class="ColRow">
            <html:checkbox property="<%=PatronCircReportForm.FIELD_INCLUDE_COPY_PRICE%>"><%=MessageHelper.formatMessage("patroncircreportdetails_PriceOfCheckedOutOverdueMaterials") %></html:checkbox>
        </td>
        <td class="tdAlignRight">
            <% if(!selectAllAlreadyDisplayedOnARow){    
                    selectAllAlreadyDisplayedOnARow = true;            
            %>
                <base:genericButton
                    src="/buttons/small/selectall_opaque.gif"
                    alt='<%=MessageHelper.formatMessage("selectAll")%>'
                    name="<%=PatronCircReportForm.BUTTON_SELECT_ALL%>"/>
            <%      
               } else if (!clearAllAlreadyDisplayedOnARow) {
                    clearAllAlreadyDisplayedOnARow = true;            
            %>
                <base:genericButton
                    src="/buttons/small/clearall_opaque.gif"
                    alt='<%=MessageHelper.formatMessage("clearAll")%>'
                    name="<%=PatronCircReportForm.BUTTON_CLEAR_ALL%>"/>                
            <% } %>
                
        </td>        
    </tr>
    </logic:equal>

    <tr>
        <td class="ColRowItalic tdAlignRight">
            <nobr><%=MessageHelper.formatMessage("patroncircreportdetails_PatronInfo") %></nobr>
        </td>
        <td class="ColRow">
            <html:checkbox property="<%= PatronCircReportForm.FIELD_INCLUDE_PATRON_BARCODE %>"><%=MessageHelper.formatMessage("patroncircreportdetails_Barcode") %></html:checkbox>
        </td>
        <td class="tdAlignRight">
            <% if(!selectAllAlreadyDisplayedOnARow){    
                    selectAllAlreadyDisplayedOnARow = true;            
            %>
                <base:genericButton
                    src="/buttons/small/selectall_opaque.gif"
                    alt='<%=MessageHelper.formatMessage("selectAll")%>'
                    name="<%=PatronCircReportForm.BUTTON_SELECT_ALL%>"/>
            <%      
               } else if (!clearAllAlreadyDisplayedOnARow) {
                    clearAllAlreadyDisplayedOnARow = true;            
            %>
                <base:genericButton
                    src="/buttons/small/clearall_opaque.gif"
                    alt='<%=MessageHelper.formatMessage("clearAll")%>'
                    name="<%=PatronCircReportForm.BUTTON_CLEAR_ALL%>"/>                
            <% } %>
                
        </td>           
    </tr>

    <tr>
        <td>&nbsp;</td>
        <td class="ColRow">
            <html:checkbox property="<%=PatronCircReportForm.FIELD_INCLUDE_PHONE_NUMBER%>"><%=MessageHelper.formatMessage("patroncircreportdetails_PhoneNumber") %></html:checkbox>
        </td>
        <td class="tdAlignRight">
            <% if(!selectAllAlreadyDisplayedOnARow){    
                    selectAllAlreadyDisplayedOnARow = true;            
            %>
                <base:genericButton
                    src="/buttons/small/selectall_opaque.gif"
                    alt='<%=MessageHelper.formatMessage("selectAll")%>'
                    name="<%=PatronCircReportForm.BUTTON_SELECT_ALL%>"/>
            <%      
               } else if (!clearAllAlreadyDisplayedOnARow) {
                    clearAllAlreadyDisplayedOnARow = true;            
            %>
                <base:genericButton
                    src="/buttons/small/clearall_opaque.gif"
                    alt='<%=MessageHelper.formatMessage("clearAll")%>'
                    name="<%=PatronCircReportForm.BUTTON_CLEAR_ALL%>"/>                
            <% } %>
                
        </td>           
    </tr>

    <logic:equal name="<%=PatronCircReportForm.FORM_NAME%>" property="outputExcel" value="false" >
        <logic:equal name="<%=PatronCircReportForm.FORM_NAME%>" property="formatResults" value="<%=PatronCircReportJob.FORMAT_REPORT %>" >
        <tr>
            <td>&nbsp;</td>
            <td class="ColRow" colspan="2">
                <html:checkbox property="<%=PatronCircReportForm.FIELD_SUBTOTAL%>">
                    <% if (!form.isMediaBookingUser()) { %> 
                    <%=MessageHelper.formatMessage("patroncircreportdetails_SubtotalItemsFinesForEachPatron") %>
                    <% } else { %>
                    <%=MessageHelper.formatMessage("patroncircreportdetails_SubtotalItemsForEachPatron") %>
                    <% } %>
                </html:checkbox>
            </td>
        </tr>
        </logic:equal>
    </logic:equal>
    
    <tr>
        <td>&nbsp;</td>
        <td class="ColRow" colspan="2">
            <html:checkbox property="<%=PatronCircReportForm.FIELD_INCLUDE_PATRON_INFO_1%>">
                <html:select property="patronInfo1">
                    <html:options collection="patronInfoList" property="stringCode"
                        labelProperty="stringDesc"/>
                </html:select>
            </html:checkbox>
        </td>
    </tr>

    <tr>
        <td>&nbsp;</td>
        <td class="ColRow" colspan="2">
            <html:checkbox property="<%=PatronCircReportForm.FIELD_INCLUDE_PATRON_INFO_2%>">
                <html:select property="patronInfo2">
                    <html:options collection="patronInfoList" property="stringCode"
                        labelProperty="stringDesc"/>
                </html:select>
            </html:checkbox>
        </td>
    </tr>


    <tr>
        <td colspan="3"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <tr>
        <td class="ColRowBold" colspan="3" align="center">
            <base:showHideTag id="onAction">
                <logic:notPresent name="<%=PatronCircReportForm.FORM_NAME%>" property="reportID">
                    <base:genericButton src="/buttons/large/savesetup.gif" alt='<%=MessageHelper.formatMessage("saveSetup") %>' name="<%=PatronCircReportForm.BUTTON_SAVE_THIS_SETUP%>" />
                    &nbsp;
                    <logic:equal name="<%=PatronCircReportForm.FORM_NAME%>" property="formatResults" value="<%=PatronCircReportJob.FORMAT_REPORT %>">
                        <base:genericButton src="/buttons/large/runreport.gif" onclick="hideElementonAction()" alt='<%=MessageHelper.formatMessage("runReport") %>' name="<%=PatronCircReportForm.BUTTON_RUN%>" />
                    </logic:equal>
                    <logic:equal name="<%=PatronCircReportForm.FORM_NAME%>" property="formatResults" value="<%=PatronCircReportJob.FORMAT_EMAIL_TO_HOMEROOMS %>">
                        <base:genericButton src="/buttons/large/runreport.gif" onclick="hideElementonAction()" alt='<%=MessageHelper.formatMessage("runReport") %>' name="<%=PatronCircReportForm.BUTTON_RUN%>" />
                    </logic:equal>
                    <logic:equal name="<%=PatronCircReportForm.FORM_NAME%>" property="formatResults" value="<%=PatronCircReportJob.FORMAT_NOTICE %>">
                        <base:genericButton src="/buttons/large/runnotices.gif" onclick="hideElementonAction()" alt='<%=MessageHelper.formatMessage("runNotices") %>' name="<%=PatronCircReportForm.BUTTON_RUN%>" />
                    </logic:equal>
                </logic:notPresent>
                <logic:present name="<%=PatronCircReportForm.FORM_NAME%>" property="reportID">
                    <base:genericButton src="/buttons/large/savesetup.gif" alt='<%=MessageHelper.formatMessage("saveSetup") %>' name="<%=PatronCircReportForm.BUTTON_SAVE_THIS_SETUP%>" />
                    &nbsp;
                    <base:genericButton src="/buttons/large/saveandrun.gif" onclick="hideElementonAction()" alt='<%=MessageHelper.formatMessage("saveAndRun") %>' name="<%=PatronCircReportForm.BUTTON_UPDATE_AND_RUN%>" />
                    &nbsp;
                    <logic:equal name="<%=PatronCircReportForm.FORM_NAME%>" property="formatResults" value="<%=PatronCircReportJob.FORMAT_REPORT %>">
                        <base:genericButton src="/buttons/large/runreport.gif" onclick="hideElementonAction()" alt='<%=MessageHelper.formatMessage("runReport") %>' name="<%=PatronCircReportForm.BUTTON_RUN%>" />
                    </logic:equal>
                    <logic:equal name="<%=PatronCircReportForm.FORM_NAME%>" property="formatResults" value="<%=PatronCircReportJob.FORMAT_EMAIL_TO_HOMEROOMS %>">
                        <base:genericButton src="/buttons/large/runreport.gif" onclick="hideElementonAction()" alt='<%=MessageHelper.formatMessage("runReport") %>' name="<%=PatronCircReportForm.BUTTON_RUN%>" />
                    </logic:equal>
                    <logic:equal name="<%=PatronCircReportForm.FORM_NAME%>" property="formatResults" value="<%=PatronCircReportJob.FORMAT_NOTICE %>">
                        <base:genericButton src="/buttons/large/runnotices.gif" onclick="hideElementonAction()" alt='<%=MessageHelper.formatMessage("runNotices") %>' name="<%=PatronCircReportForm.BUTTON_RUN%>" />
                    </logic:equal>
                </logic:present>
            </base:showHideTag>
        </td>
    </tr>
</base:outlinedTable>
</base:form>
