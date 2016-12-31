<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.ManageSiteShippingInfoForm" %>
<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag"%>
<%@page import="com.follett.fsc.common.StringHelper"%>


<%@page import="com.follett.fsc.destiny.entity.ejb3.EmailSpecs"%><script language="JavaScript" type="text/javascript">
<!--

function submitDropDownDistrict() {
    document.<%=ManageSiteShippingInfoForm.FORM_NAME%>.<%=ManageSiteShippingInfoForm.FIELD_CONTEXT_LIMITER_CHANGED%>.value = 'true';
    document.<%=ManageSiteShippingInfoForm.FORM_NAME%>.submit();
}

//-->
</script>
<%
    ManageSiteShippingInfoForm form = (ManageSiteShippingInfoForm)request.getAttribute(ManageSiteShippingInfoForm.FORM_NAME);
    SessionStoreProxy store = form.getSessionStore();
%>


<base:messageBox strutsErrors="true"/>
<base:form action="/backoffice/servlet/handlemanagesiteshippinginfoform.do" method="post">
<html:hidden property="<%= ManageSiteShippingInfoForm.FIELD_CONTEXT_LIMITER_CHANGED %>" value="false"/>
    <base:outlinedTable id="<%=ManageSiteShippingInfoForm.TABLE_MAIN%>"  borderColor="#C0C0C0" width="100%">
        <tr>
            <td class="TableHeading" colspan="3">
            <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=ManageSiteShippingInfoForm.BUTTON_TRAP_ENTER%>"/>  
                Manage Site Shipping Information...
            </td>
        </tr>
        <tr>
            <td width="30%" class = "ColRowBold tdAlignRight" nowrap="nowrap">For</td>
            <td width="50%" class = "ColRow">
                    <base:selectDistrict 
                        mustContainTextbookSites="true"
                        includeStateTextbookOffice="false"
                        includeStatewide="false" 
                        selectedDistrictContext="<%=form.getShippingContextName()%>"
                        mustContainTextbookSites="true"  
                        useSelectAllDistricts="false"
                        useSelectADistrict="true"
                        useUnlimitedText="false" 
                        onChangeAction="submitDropDownDistrict()"
                        printerFriendly="false" 
                        useArchive="false"
                        name="<%= ManageSiteShippingInfoForm.FIELD_SHIPPING_CONTEXT_NAME  %>" /> 
            </td> 
            <td class="SmallColHeading tdAlignRight" width="20%">
                <base:showHideTag id="onSave" >
                    <base:saveButton onclick="hideElementonSave()" absbottom="true"/>
                    <base:cancelButton absbottom="true"/>
                </base:showHideTag>
            </td>
        </tr>
        <% if ( !StringHelper.isEmptyOrWhitespace(form.getShippingContextName()) &&
            !SelectDistrictTag.BLANK_SITE.equals(form.getShippingContextName())) { %>
        <tr>
            <td width="30%" class = "ColRowBold tdAlignRight" nowrap="nowrap">Site&nbsp;Name</td>
            <td>
                   <base:selectSite
                       submitOnChange="true"                    
                       useSelectASite="true"
                       name="<%= ManageSiteShippingInfoForm.FIELD_SITE_ID %>" 
                       selectedSiteID="<%= String.valueOf(form.getSiteID()) %>" 
                       mode="<%=SelectSiteTag.MODE_GROUP_BY_SITE_TYPE_TEXTBOOK_ONLY %>"
                       includeLibrarySites="false"
                       includeTextbookSites="true"
                       includeMediaSites="false"
                       contextName="<%=form.getShippingContextName()%>"
                       includeAssetSites="false"
                       includeAllSites="false"
                   />
            
            </td>
            <td width="20%">&nbsp;</td>
        </tr>
        <% } %>
        <tr> 
            <td colspan="3"> <base:imageLine/></td>
        </tr>
        <tr valign="bottom">
            <td class="FormLabel tdAlignRight" width="30%">            
                State&nbsp;School&nbsp;ID
             </td>
             <td colspan="2" >
                <html:text property="<%=ManageSiteShippingInfoForm.FIELD_STATE_SCHOOL_ID %>" size="30" maxlength="50"/>
             </td>

        </tr>
        <tr>
            <td class="FormLabel tdAlignRight" width="30%">            
                Principal
             </td>
             <td colspan="2" >
                 <html:text property="<%=ManageSiteShippingInfoForm.FIELD_PRINCIPAL%>" size="30" maxlength="40" />
             </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight" width="30%">            
                Coordinator
             </td>
             <td colspan="2">
                 <html:text property="<%=ManageSiteShippingInfoForm.FIELD_COORDINATOR%>" size="30" maxlength="40"/>
             </td>
        </tr>
        <%-- Address fields --%>
        <tr>
            <td class="FormLabel tdAlignRight" width="30%">
                Address
            </td>
            <td colspan="2">
                <html:text property="<%=ManageSiteShippingInfoForm.FIELD_ADDRESS_LINE1%>" size="30" maxlength="90"/>
            </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight" width="30%">
                &nbsp;
            </td>
            <td colspan="2">
                <html:text property="<%=ManageSiteShippingInfoForm.FIELD_ADDRESS_LINE2%>" size="30" maxlength="90"/>
            </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight" width="30%">
                City
            </td>
            <td colspan="2">
                <html:text property="<%=ManageSiteShippingInfoForm.FIELD_CITY%>" size="30" maxlength="90"/>
            </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight" width="30%">
                State/Province
            </td>
            <td colspan="2">
                <html:text property="<%=ManageSiteShippingInfoForm.FIELD_STATE%>" size="30" maxlength="90"/>
            </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight" width="30%">
                Postal&nbsp;Code
            </td>
            <td colspan="2">
                <html:text property="<%=ManageSiteShippingInfoForm.FIELD_ZIP%>" size="20" maxlength="20"/>
            </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight" width="30%">
                Phone&nbsp;Number
            </td>
            <td colspan="2">
                <html:text property="<%=ManageSiteShippingInfoForm.FIELD_PHONE_NUMBER%>" size="20" maxlength="20"/>
            </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight" width="30%">
                Fax&nbsp;Number
            </td>
            <td colspan="2">
                <html:text property="<%=ManageSiteShippingInfoForm.FIELD_FAX_NUMBER%>" size="20" maxlength="20"/>
            </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight" width="30%">
                Email&nbsp;Address
            </td>
            <td colspan="2">
                <html:text property="<%=ManageSiteShippingInfoForm.FIELD_EMAIL_ADDRESS%>" size="20" maxlength='<%="" + EmailSpecs.EMAIL_MAX_LENGTH %>'/>
            </td>
        </tr>
    </base:outlinedTable>
</base:form>
