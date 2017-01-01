<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.destiny.util.ObjectHelper"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@page import="com.follett.fsc.destiny.entity.ejb3.LocationVO"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    LocationAEDForm form = (LocationAEDForm)request.getAttribute(LocationAEDForm.FORM_NAME);
%>



<base:messageBox strutsErrors="true"/>

<script language="JavaScript">
<!--
    function trapEnter(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        return false;
      }
      return true;
    }
//-->
</script>

<base:form action="/backoffice/servlet/handlelocationaedform.do" focus="<%= LocationAEDForm.FIELD_DESCRIPTION %>">
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">
    <jsp:include page="/common/msdewarning.jsp" flush="true" />
    
    
    <logic:equal name="<%= LocationAEDForm.FORM_NAME %>" property="action" value="<%= LocationAEDForm.ACTION_DELETE %>">
        <html:hidden property="<%= LocationAEDForm.FIELD_LOCATION_ID %>"/>
        <logic:notEmpty name="<%= LocationAEDForm.FORM_NAME %>" property="blockReassignMessageText">
            <base:messageBox showRedBorder="true">
                <tr valign="center">
                    <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                    <td class="ColRowBold" align="center">
                        <%= form.getBlockReassignMessageText() %>
                    </td>
                </tr>
            </base:messageBox>
        </logic:notEmpty>
        <logic:empty name="<%= LocationAEDForm.FORM_NAME %>" property="blockReassignMessageText">
            <base:messageBox showRedBorder="true">
            <tr valign="center">
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
    
                <logic:equal name="<%= LocationAEDForm.FORM_NAME %>" property="reassignNeeded" value="true">
                    <bean:define id="associatedList" name="<%= LocationAEDForm.FORM_NAME %>" property="<%= form.FIELD_REASSIGN_LIST %>"/>
    
                    <td class="ColRowBold" align="center">
                        <%= form.getReassignMessageText() %>
                        <html:select property="<%= LocationAEDForm.FIELD_REASSIGN_TO_ID %>">
                            <html:options collection="associatedList" property="longID" labelProperty="stringDesc"/>
                        </html:select>.
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                </logic:equal>
                <td class="ColRowBold" align="center">Are you sure you want to delete "<bean:write name="<%= LocationAEDForm.FORM_NAME %>" property="<%= LocationAEDForm.FIELD_DESCRIPTION %>"/>"?</td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td valign="baseline" align="center" class="ColRow">
                    <base:yesNo 
                        buttonYesName="<%=LocationAEDForm.BUTTON_CONFIRM_DELETE%>"
                    />
                </td>
            </tr>
            </base:messageBox>
        </logic:empty>

    </logic:equal>
    

<!-- If I am editing, I need a hidden field -->
<logic:equal name="<%= LocationAEDForm.FORM_NAME %>" property="editing" value="true">
    <html:hidden property="locationID"/>
</logic:equal>
<!-- Always propagate a collection type, even though most forms will not use it -->
<html:hidden property="collectionType"/>
<html:hidden property="<%=LocationAEDForm.PARAM_FROM_SITE_CONFIG%>"/>

<%-- 
    The following code adjust the alignment of the table when 
    displayed from a location that doesn't support the level2menu.
--%>
<base:outlinedTable id="<%=LocationAEDForm.TABLE_MAIN%>" borderColor="#C0C0C0" width="95%">

<logic:equal name="<%= LocationAEDForm.FORM_NAME %>" property="showAddEditControls" value="false">
    <html:hidden property="<%= form.FIELD_DESCRIPTION %>"/>
</logic:equal>
<logic:equal name="<%= LocationAEDForm.FORM_NAME %>" property="showAddEditControls" value="true">
<tr>
    <td>
        <table id=<%= LocationAEDForm.TABLE_EDIT %> width="100%" border="0" cellspacing="0" cellpadding="0">
            <% String message = (String) request.getAttribute(LocationAEDForm.FIELD_MESSAGE);
            if (message != null) {
            %>
            <tr>
                <td colspan="3" class="ColRowBold" valign="top">
                    <%=message%>
                </td>
            </tr>            
            <%
            }
            %>
            <tr>
                <td class="ColRowBold tdAlignRight">
                <logic:equal name="<%= LocationAEDForm.FORM_NAME %>" property="editing" value="false">
                    Add Location&nbsp;
                </logic:equal>
                <logic:equal name="<%= LocationAEDForm.FORM_NAME %>" property="editing" value="true">
                    Edit Location&nbsp;
                </logic:equal>
                </td>
                
                <td>
                    <html:text property="<%= LocationAEDForm.FIELD_DESCRIPTION %>" size="40" maxlength="<%= form.getDescriptionMaxLength() %>"/>
                </td>
                
                <td align="center" class="ColRowBold">
                    <base:showHideTag id="onSave">                    
                        <base:saveButton onclick="hideElementonSave()" name="<%= LocationAEDForm.BUTTON_NAME_SAVE %>" />
                        <br/>
                        <base:cancelButton name="<%= LocationAEDForm.BUTTON_NAME_CANCEL %>" />
                    </base:showHideTag>
                </td>
            </tr>
        <% if (form.isAssetSite()) { %>
            <tr>
                <td class="ColRowBold tdAlignRight">
                Barcode&nbsp;
                </td>
                <td colspan="2" class="ColRow">
                    <logic:equal name="<%= LocationAEDForm.FORM_NAME %>" property="editing" value="false">
                        <html:radio property="<%= LocationAEDForm.FIELD_ASSIGN_NEXT_BARCODE %>" value="<%= LocationAEDForm.RADIO_EXPLICIT_BARCODE %>"
                            onclick='<%="document." + LocationAEDForm.FORM_NAME + "." + LocationAEDForm.FIELD_BARCODE + ".focus();"%>'>
                        </html:radio>
                    </logic:equal>
                    <span onKeyPress="return trapEnter(event);">
                        <logic:equal name="<%= LocationAEDForm.FORM_NAME %>" property="editing" value="false">
                            <html:text property="<%= LocationAEDForm.FIELD_BARCODE %>" size="20" maxlength="14"
                                onfocus='<%="document." + LocationAEDForm.FORM_NAME + "." + LocationAEDForm.FIELD_ASSIGN_NEXT_BARCODE + "[0].checked = true"%>'
                            />
                        </logic:equal>
                        <logic:equal name="<%= LocationAEDForm.FORM_NAME %>" property="editing" value="true">
                            <html:text property="<%= LocationAEDForm.FIELD_BARCODE %>" size="20" maxlength="14"/>
                        </logic:equal>
                    </span>

                </td>
            </tr>

            <!-- When editing, don't show the assign next (hokey looking in jsp code) -->
            <logic:equal name="<%= LocationAEDForm.FORM_NAME %>" property="editing" value="false">
            <tr>
                <td>&nbsp;</td>
                <td colspan="2" valign="top" class="ColRow">
                    <html:radio property="<%= LocationAEDForm.FIELD_ASSIGN_NEXT_BARCODE%>" value="<%= LocationAEDForm.RADIO_ASSIGN_NEXT_BARCODE %>"
                        onclick='<%="document." + LocationAEDForm.FORM_NAME + "." + LocationAEDForm.FIELD_BARCODE + ".value = \'\'"%>'>
                        Assign next barcode
                    </html:radio>
                </td>
            </tr>
            </logic:equal>
        <% } else { %>
            <html:hidden property="<%= LocationAEDForm.FIELD_ASSIGN_NEXT_BARCODE %>"/>
            <html:hidden property="<%= LocationAEDForm.FIELD_BARCODE %>"/>
        <% } %>
        </table>
    </td>
</tr>
<tr>
    <td>
        <base:imageLine height="1" width="100%"/>
    </td>
</tr>
</logic:equal>

<tr>
    <td>
        <table width="100%">
            <tr>
                <td class="TableHeading">
                    Current Locations...
                </td>
                <td class="tdAlignRight">
                    <% if (form.isAssetSite()) { %>
                        <base:spanIfAllowed permission="<%= Permission.BACK_OFFICE_GENERATE_REPORTS_ASSET %>">
                        <base:link page='<%= "/backoffice/servlet/presentlocationlabelform.do" %>'>
                            <base:image src="/buttons/large/printlabels.gif" alt="<%= LocationAEDForm.ALT_PRINT_LABELS %>"/>
                        </base:link>
                        </base:spanIfAllowed>
                    <% } else { %>
                        &nbsp;
                    <% } %>
                </td>
            </tr>
        </table>
    </td>
</tr>

<tr><td>
    <table id=<%= LocationAEDForm.TABLE_LIST %> width="100%" border="0" cellspacing="0" cellpadding="2">
    <%
    //List is a list of value objects
    Collection list = form.getResultList();
    Iterator iter = ObjectHelper.getIterator(list);
    LocationVO value = null;
    while (iter.hasNext()) {
        value = (LocationVO) iter.next();
    %>
        <base:flipper key="locationaed">
            <td class="ColRow"><%= ResponseUtils.filter(value.getName())%></td>
            <td class="ColRow">
            <% if(form.isAssetSite() && value.getBarcode() != null) { %>
                <%= ResponseUtils.filter(value.getBarcode())%>
            <% } else { %>
                &nbsp;
            <% } %>
            </td>
            <td class="ColRow tdAlignRight">
                <base:link id="<%=LocationAEDForm.ID_EDIT_PREFIX + value.getLocationID() %>"  page='<%= "/backoffice/servlet/handlelocationaedform.do?action=" +  LocationAEDForm.ACTION_EDIT + "&locationID=" + value.getLocationID() + "&"+ LocationAEDForm.PARAM_FROM_SITE_CONFIG +"=" + form.isFromSiteConfig() + "&collectionType=" + form.getCollectionType() %>'>
                    <base:image src="/icons/general/edit.gif" width="19" height="16" alt='<%="Edit " + ResponseUtils.filter(value.getName()) %>'/>
                </base:link>
                &nbsp;
                <base:link id="<%=LocationAEDForm.ID_DELETE_PREFIX + value.getLocationID() %>" page='<%= "/backoffice/servlet/handlelocationaedform.do?action=" +  LocationAEDForm.ACTION_DELETE + "&locationID=" + value.getLocationID() + "&" + LocationAEDForm.PARAM_FROM_SITE_CONFIG+"=" + form.isFromSiteConfig() + "&collectionType=" + form.getCollectionType() %>'>
                    <base:image src="/icons/general/delete.gif" width="19" height="16" alt='<%="Delete " + ResponseUtils.filter(value.getName()) %>'/>
                </base:link>
            </td>
        </base:flipper>
    <% } %>
    </table>
    </td>
</tr>
</base:outlinedTable>
</base:form>
