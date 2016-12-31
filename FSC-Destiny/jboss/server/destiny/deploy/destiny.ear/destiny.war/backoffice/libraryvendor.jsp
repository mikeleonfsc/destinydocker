<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.BaseListForm"%>
<%@ page import="com.follett.fsc.destiny.client.common.PageCalculator" %>
<%@ page import="com.follett.fsc.destiny.session.common.SortHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag"%>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>


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
        document.<%=LibraryVendorForm.FORM_NAME%>.clickedSymbologyChange.value = "true";
        document.<%=LibraryVendorForm.FORM_NAME%>.submit();
    }
    
//-->
</script>

<base:messageBox strutsErrors="true"/>

<%
    String formName = LibraryVendorForm.FORM_NAME;
    LibraryVendorForm form = (LibraryVendorForm)request.getAttribute(formName);
    String focusString = form.gimmeFocusControl();
%>


<base:form action="<%= form.getFormAction() %>" focus="<%= focusString%>">

<html:hidden property = "action"/>
<html:hidden property = "vendorNameToDelete"/>
<html:hidden property = "vendorIDToDelete"/>
<html:hidden property = "vendorID"/>
<html:hidden property = "clickedSymbologyChange" value="false"/>
<html:hidden property = "<%= LibraryVendorForm.PARAM_SITEID %>"/>
<html:hidden property = "<%= LibraryVendorForm.ATTRIBUTE_CALLER_FEEDBACK_FIELDNAME %>"/>

<logic:equal name="<%= LibraryVendorForm.FORM_NAME %>" property="<%= LibraryVendorForm.PARAM_ACTION %>" value="<%= LibraryVendorForm.ACTION_DELETE %>">
    <base:imageSpacer width="1" height="3"/>
    <base:messageBox showWarningIcon="true" header = "<%=form.gimmeVendorDeleteMsg()%>">
        <tr>            
            <td colspan = "2" align = "center"><base:yesNo/></td>
        </tr>
    </base:messageBox>         
</logic:equal>

<logic:present name="<%= LibraryVendorForm.FORM_NAME %>" property="<%= LibraryVendorForm.PARAM_CONFIRM_MESSAGE %>">
     <%     
            String[] messageText = new String[]{
                MessageHelper.formatMessage("libraryvendor_AreYouSure")
            };
     %>
    <base:confirmBox showWarningIcon="true" filterMessage="false"
        header="<%=form.getConfirmMessage() %>"           
        messageText="<%=messageText%>"
        additionalInfo="<%=form.getAdditionalConfirmInfo()%>" 
        yesName="<%=LibraryVendorForm.BUTTON_CONFIRM_YES%>"
        noName="<%=LibraryVendorForm.BUTTON_CONFIRM_NO%>" />
</logic:present>


<logic:equal name="<%= LibraryVendorForm.FORM_NAME %>" property="saveSuccessful" value="true">
    <base:messageBox showWarningIcon="false" >
        <tr><td colspan="2" align="center" class="ColRowBold"><%= form.getSuccessMsg() %></td></tr>
    </base:messageBox>
</logic:equal>

<logic:notEqual name="<%= LibraryVendorForm.FORM_NAME %>" property="<%= LibraryVendorForm.PARAM_ACTION %>" value="<%= LibraryVendorForm.ACTION_DELETE %>">
    <table>
            <tr>
               <td class="Instruction" >&nbsp;&nbsp;<%= MessageHelper.formatMessage("libraryvendor_RequiredField") %></td>
            </tr>
    </table>
</logic:notEqual>
 
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterVariable">

<base:outlinedTable id="<%=LibraryVendorForm.TABLE_OUTLINE %>" borderColor="#C0C0C0">
  <logic:notEqual name="<%= LibraryVendorForm.FORM_NAME %>" property="<%= LibraryVendorForm.PARAM_ACTION %>" value="<%= LibraryVendorForm.ACTION_DELETE %>">
      <tr>
            <td width="15%" class="ColRowBold tdAlignRight" nowrap>* <%= form.gimmeEditing() %> <%= MessageHelper.formatMessage("libraryvendor_Vendor") %></td>
            <td width="50%"><html:text property = "<%= LibraryVendorForm.FIELD_VENDOR %>" size = "50" maxlength = "30"/></td>
            <td valign="top">&nbsp;</td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight" nowrap><%= MessageHelper.formatMessage("libraryvendor_StartingBarcode") %></td>
            <td nowrap class = "ColRow"><html:text property = "<%= LibraryVendorForm.FIELD_STARTING_BARCODE %>" size = "30" maxlength = "14"/>&nbsp;[<%= form.gimmeSymbologyLink() %>]</td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight" nowrap><%= MessageHelper.formatMessage("libraryvendor_OfBarcodes") %></td>
            <td><html:text property = "<%= LibraryVendorForm.FIELD_NUM_BARCODES %>" size = "30" maxlength = "6"/></td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td align="center" colspan = "3" class="ColRowBold">
                <base:showHideTag id="onSave">                    
                    <base:saveButton onclick="hideElementonSave()" name="<%= LibraryVendorForm.BUTTON_SAVE %>" />
                    &nbsp;
                    <base:closeButton withX="true" name="<%= LibraryVendorForm.BUTTON_CLOSE %>" />
                </base:showHideTag>
            </td>
        </tr>
        <tr>
            <td colspan = "3" align="center"><base:imageLine height="1" width="98%" vspace="2"/></td>
        </tr>
    </logic:notEqual>
    <tr>
        <td colspan = "3" class="TableHeading"><%= MessageHelper.formatMessage("libraryvendor_CurrentVendors") %></td>
    </tr>
    <tr>
    <logic:equal name = "<%= formName %>" property = "vendorsInList" value="true">
        <td colspan="3">
            <table id = "<%= form.TABLE_DETAIL_ROWS %>" width = "100%" cellspacing="0" cellpadding="2">
                <tr>
                    <td class = "SmallColHeading"><%= MessageHelper.formatMessage("libraryvendor_Vendor") %></td>
                    <td class = "SmallColHeading"><%= MessageHelper.formatMessage("libraryvendor_StartingBarcode") %></td>
                    <td class = "SmallColHeading"><%= MessageHelper.formatMessage("libraryvendor_EndingBarcode") %></td>
                    <td>&nbsp;</td>
                </tr>
                <logic:iterate indexId="flipper" id="row" name="<%= formName %>" property="list" type="com.follett.fsc.destiny.entity.ejb3.LibraryVendorVO">
                    <tr valign="top" <%=( (!form.isShowPrinterFriendly() && (1 & flipper.intValue())==0)? "bgColor=\"#E8E8E8\"" : "" )%> >
                        <td class="ColRow"><%=ResponseUtils.filter(row.getVendorName())%></td>
                        <td class="ColRow">${row.startingBarcode }</td>
                        <td class="ColRow">${row.endingBarcode }</td>
                        <td class="tdAlignRight">
                            <base:link id="<%=LibraryVendorForm.ID_EDIT_PREFIX + row.getVendorID() %>" page='<%= form.buildEditUrl(row) %>'>
                                <base:image src="/icons/general/edit.gif" width="19" height="16" alt='<%= MessageHelper.formatMessage("libraryvendor_Edit", row.getVendorName()) %>' />
                            </base:link>
                            &nbsp;
                            <base:link id="<%=LibraryVendorForm.ID_DELETE_PREFIX + row.getVendorID() %>" page='<%= form.buildDeleteUrl(row) %>'>
                                <base:image src="/icons/general/delete.gif" width="19" height="16" alt='<%= MessageHelper.formatMessage("libraryvendor_Delete", row.getVendorName()) %>' />
                            </base:link>
                        </td>
                    </tr>
                </logic:iterate>
            </table>
       </td>
       </logic:equal>
       <logic:equal name = "<%= formName %>" property = "vendorsInList" value="false">
            <td colspan ="3" align = "center" class = "ColRowBold"><%= MessageHelper.formatMessage("libraryvendor_ThereAreNoVendorsConfigured") %></td>
       </logic:equal>
    </tr>  
</base:outlinedTable>
</base:form>

