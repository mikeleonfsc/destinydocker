<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.CopyLabelForm" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.BaseCopyLabelForm" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%@ page import="com.follett.fsc.common.StringHelper"%>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.data.CopyLabelJobParams" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%@ page import="com.follett.fsc.destiny.util.Barcode" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>


<bean:define id="stocks" name="<%= CopyLabelForm.FORM_NAME %>" property="stockList"/>
<bean:define id="spineStocks" name="<%= CopyLabelForm.FORM_NAME %>" property="spineLabelStocks"/>
<bean:define id="fonts" name="<%= CopyLabelForm.FORM_NAME %>" property="fontList"/>

<base:messageBox strutsErrors="true"/>

<%
    CopyLabelForm form = (CopyLabelForm)request.getAttribute("backoffice_servlet_CopyLabelForm");
    boolean outputtedFirstSection = false;
%>

<base:form action="/backoffice/servlet/handlecopylabelform.do">
<html:hidden property="singleIDToPrint"/>
<html:hidden property="<%=CopyLabelForm.FIELD_COPIES_ADDED%>"/>
<html:hidden property="<%=CopyLabelForm.FIELD_SELECTED_LISTID%>"/>
<html:hidden property="<%= CopyLabelForm.FIELD_INCLUDE_TEMP_COPIES%>" value="true"/>
<html:hidden property="<%= CopyLabelForm.FIELD_ADD_COPIES_AS_JOB %>"/>
<html:hidden property="<%= CopyLabelForm.FIELD_COLLECTION_TYPE %>"/>
<html:hidden property="<%= CopyLabelForm.FIELD_BIB_ID %>"/>
<html:hidden property="<%= CopyLabelForm.FIELD_RECEIVE_COPIES_AS_JOB %>"/>
<html:hidden property="<%= CopyLabelForm.FIELD_ASSET_JOB %>"/>
<base:isDistrictUser>
	<html:hidden property="<%=CopyLabelForm.FIELD_SITE_ID%>"/>
</base:isDistrictUser>

    <logic:equal name="<%= CopyLabelForm.FORM_NAME %>" property="cancelConfirm" value="true">
    <%
    String[] messageText = null;
    if (form.isAddCopiesAsJob()) {
        messageText = new String[]{
            MessageHelper.formatMessage("copylabel_YourCopiesAdded"),
            MessageHelper.formatMessage("copylabel_Proceed")
        };
    } else if (form.isReceiveCopiesAsJob()) {
        messageText = new String[]{
            MessageHelper.formatMessage("copylabel_YourCopiesReceived"),
            MessageHelper.formatMessage("copylabel_Proceed")
        };
    }
    %>
        <base:confirmBox showWarningIcon="true"
            header='<%= MessageHelper.formatMessage("copylabel_BarcodeLabelsPrinted") %>'           
            messageText="<%=messageText%>" 
            yesName="<%=CopyLabelForm.BUTTON_CONFIRM_CANCEL_YES%>"
            noName="<%=CopyLabelForm.BUTTON_CONFIRM_CANCEL_NO%>" />
    </logic:equal>

<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=BaseCopyLabelForm.BUTTON_TRAP_ENTER%>">

<base:outlinedTable id="<%=CopyLabelForm.TABLE_COPY_LABEL%>" borderColor='#C0C0C0'>
    <tr>
        <td colspan="4" vAlign="top" class="TableHeading">
            <bean:write name="<%=CopyLabelForm.FORM_NAME%>" property="title"/>
        </td>
        <td valign="top" class="ColRowBold">
            <base:reportButton/>
        <% if (form.isRunningBaseTextbookCopyJob()) { %>
       		<base:genericButton src="/buttons/large/cancel.gif" alt='<%= MessageHelper.formatMessage("cancel") %>' name="<%= CopyLabelForm.BUTTON_CANCEL %>" />
        <% } %>
        </td>
    </tr>
    <% if ((form.getSingleCopyBarcode() != null || form.isRunningBaseTextbookCopyJob()) 
        && (form.getSingleCopyBarcode() == null || form.getSingleCopyBarcode().length() <= Barcode.MAX_LENGTH_SUPPORTED_SYMBOLOGIES)) { %>
    <tr>
        <td>&nbsp;</td>
        <td class="ColRowBold" colspan="3">
        <% if ( 
            form.getCollectionType() != BibMasterSpecs.COLLECTION_TYPE_LIBRARY &&
            form.getCollectionType() != BibMasterSpecs.COLLECTION_TYPE_MEDIA
            ) { %>
            
            <html:hidden property="<%= CopyLabelForm.FIELD_PRINT_BARCODE %>" value="on"/>
        <% } else { %>
            <html:checkbox property="<%= CopyLabelForm.FIELD_PRINT_BARCODE %>" />
        <% } %>
        <%outputtedFirstSection = true; %>
        <%= MessageHelper.formatMessage("copylabel_PrintBarcodeLabels") %> <html:text property="<%= CopyLabelForm.FIELD_BARCODE_COUNT %>" maxlength="2" size="2"/>
        </td>
        <td>&nbsp;</td>
    </tr>
    <tr>
        <td colspan="2">&nbsp;</td>
        <td valign="top" class="ColRow tdAlignRight"><%= MessageHelper.formatMessage("copylabel_IncludeThe") %></td>
        <td>
            <table id="<%=CopyLabelForm.TABLE_CHECKBOXES%>" border="0" cellspacing="0" cellpadding="0">
        <% if ( form.getCollectionType() != BibMasterSpecs.COLLECTION_TYPE_ASSET ) { %>
                <tr>
                    <td class="ColRow">
                        <html:checkbox property="<%= CopyLabelForm.FIELD_SHOW_SITE_NAME %>" /> 
                            <html:select property="<%=CopyLabelForm.FIELD_SITE_OR_DISTRICT_NAME%>">
                                <html:option value='<%="" + CopyLabelJobParams.NAME_SITE%>'><%= MessageHelper.formatMessage("copylabel_SiteName") %></html:option>
                                <html:option value='<%="" + CopyLabelJobParams.NAME_DISTRICT%>'><%= MessageHelper.formatMessage("copylabel_DistrictName") %></html:option>
                            </html:select>
                    </td>
                    <td class="ColRow">
                        <html:checkbox property="<%= CopyLabelForm.FIELD_SHOW_TITLE_DESCRIPTION %>" /><%= MessageHelper.formatMessage("copylabel_Title") %></td>
                </tr>
                <tr>
                    <td class="ColRow">
                        <html:checkbox property="<%= CopyLabelForm.FIELD_SHOW_AUTHOR %>" /><%= MessageHelper.formatMessage("copylabel_Author") %></td>
                    <td class="ColRow">
                        <% if ( form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK ) { %>
                        <html:checkbox property="<%= CopyLabelForm.FIELD_SHOW_LOCATION %>" /><%= MessageHelper.formatMessage("copylabel_Location") %><% } else { %>
                        <html:checkbox property="<%= CopyLabelForm.FIELD_SHOW_CALL_NUMBER %>" /><%= MessageHelper.formatMessage("copylabel_CallNumber") %><% } %>
                    </td>
                </tr>
        <% } else { %>
                <tr>
                    <td class="ColRow">
                        <html:checkbox property="<%= CopyLabelForm.FIELD_SHOW_SITE_NAME %>" />
				        <html:select property="<%=CopyLabelForm.FIELD_SITE_OR_DISTRICT_NAME%>">
				                <html:option value='<%="" + CopyLabelJobParams.NAME_SITE%>'><%= MessageHelper.formatMessage("copylabel_SiteName") %></html:option>
				                <html:option value='<%="" + CopyLabelJobParams.NAME_DISTRICT%>'><%= MessageHelper.formatMessage("copylabel_DistrictName") %></html:option>
				        </html:select>
                    </td>
                </tr>
                <tr>
                    <td class="ColRow">
                        <html:checkbox property="<%= CopyLabelForm.FIELD_SHOW_TITLE_DESCRIPTION %>" /><%= MessageHelper.formatMessage("copylabel_AssetName") %></td>
                </tr>
                <tr>
                    <td class="ColRow">
                        <html:checkbox property="<%= CopyLabelForm.FIELD_SHOW_LOCATION %>" /><%= MessageHelper.formatMessage("copylabel_HomeLocation") %></td>
                </tr>
        <% } %>
            </table>
        </td>
        <td>&nbsp;</td>
    </tr>
    <tr>
        <td colspan="2">&nbsp;</td>
        <td class="ColRow tdAlignRight"><%= MessageHelper.formatMessage("copylabel_UseLabelStock") %></td>
        <td>
          <html:select property="<%= BaseCopyLabelForm.FIELD_LABEL_STOCK %>">
            <html:options collection="stocks" property="stringCode"
                          labelProperty="stringDesc"/>
          </html:select>

        </td>
        <td>&nbsp;</td>
    </tr>
    <tr>
        <td colspan="2">&nbsp;</td>
        <td class="ColRow tdAlignRight"><%= MessageHelper.formatMessage("copylabel_StartOnLabel") %></td>
        <td>
            <html:text property="<%= BaseCopyLabelForm.FIELD_LABEL_START %>" maxlength="3" size="4"/>
        </td>
        <td>&nbsp;</td>
    </tr>
    <tr>
        <td colspan="2">&nbsp;</td>
        <td class="ColRow tdAlignRight"><%= MessageHelper.formatMessage("copylabel_PrinterOffset") %></td>
        <td class="ColRow" nowrap><%= MessageHelper.formatMessage("copylabel_Horizontal") %>&nbsp;<html:text property="<%= BaseCopyLabelForm.FIELD_HORIZONTAL_OFFSET %>" maxlength="4" size="4"/>
            &nbsp;&nbsp;&nbsp;<%= MessageHelper.formatMessage("copylabel_Vertical") %>&nbsp;
            <html:text property="<%= BaseCopyLabelForm.FIELD_VERTICAL_OFFSET %>" maxlength="4" size="4"/>
        </td>
        <td>&nbsp;</td>
    </tr>
    <% } %>
<!-- spine/pocket labels --->
<% if ( form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_LIBRARY ||
	    form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_MEDIA) { %>
    <logic:equal name='<%=CopyLabelForm.FORM_NAME %>' property="temporaryCopy" value="false" scope="request">
        <tr>
            <td>&nbsp;</td>
            <td class="ColRowBold" colspan="3">
            <% if (outputtedFirstSection && (form.getSingleCopyBarcode() == null || form.getSingleCopyBarcode().length() <= Barcode.MAX_LENGTH_SUPPORTED_SYMBOLOGIES)){ %>
                <html:checkbox property="<%= CopyLabelForm.FIELD_PRINT_SPINE_LABEL %>" />
            <% } else { %>
                <html:hidden property="<%= CopyLabelForm.FIELD_PRINT_SPINE_LABEL %>" value = "true" />
            <%} %><%= MessageHelper.formatMessage("copylabel_Print1SpinePocketLabelQuot", form.getCallNumber()) %></td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td colspan="2">&nbsp;</td>
            <td class="ColRow tdAlignRight"><%= MessageHelper.formatMessage("copylabel_UseLabelStock") %></td>
            <td>
              <html:select property="<%= CopyLabelForm.FIELD_SPINE_LABEL_STOCK %>">
                <html:options collection="spineStocks" property="stringCode"
                              labelProperty="stringDesc"/>
              </html:select>
    
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td colspan="2">&nbsp;</td>
            <td class="ColRow tdAlignRight"><%= MessageHelper.formatMessage("copylabel_StartOnLabel") %></td>
            <td>
                <html:text property="<%= CopyLabelForm.FIELD_SPINE_LABEL_START %>" maxlength="3" size="4"/>
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td colspan="2">&nbsp;</td>
            <td class="ColRow tdAlignRight"><%= MessageHelper.formatMessage("copylabel_PrinterOffset") %></td>
            <td class="ColRow" nowrap><%= MessageHelper.formatMessage("copylabel_Horizontal") %>&nbsp;<html:text property="<%= CopyLabelForm.FIELD_SPINE_HORIZONTAL_OFFSET %>" maxlength="4" size="4"/>
                &nbsp;&nbsp;&nbsp;<%= MessageHelper.formatMessage("copylabel_Vertical") %>&nbsp;
                <html:text property="<%= CopyLabelForm.FIELD_SPINE_VERTICAL_OFFSET %>" maxlength="4" size="4"/>
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td colspan="2">&nbsp;</td>
            <td class="ColRow tdAlignRight">
            <%=MessageHelper.formatMessage("copylabel_CallNumberFontSize")%>
            </td>
            <td>
              <html:select property="<%= CopyLabelForm.FIELD_LABEL_CALL_NUMBER_FONT_SIZE %>">
                <html:options collection="fonts" property="stringCode"
                              labelProperty="stringDesc"/>
              </html:select>
    
            </td>
            <td>&nbsp;</td>
        </tr>    
        <tr>
            <td colspan="2">&nbsp;</td>
            <td class = "ColRow tdAlignRight"><%=MessageHelper.formatMessage("copylabel_SpineLabels") %></td>
            <td class="ColRow"><html:checkbox property="<%= CopyLabelForm.FIELD_BREAK_ON_SPACE %>"></html:checkbox>&nbsp;<%=MessageHelper.formatMessage("copylabel_StartANewLineAtEverySpace") %></td>
            <td>&nbsp;</td>
        </tr>
    </logic:equal>
<% }%>
    
</base:outlinedTable>
</base:form>
