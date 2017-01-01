<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@page import="com.follett.fsc.destiny.client.common.servlet.GenericForm"%>
<%@page import="com.follett.fsc.destiny.client.circulation.servlet.CopyStatusForm"%>

<%
String formName = request.getParameter("FormName");
int collectionType = Integer.parseInt(request.getParameter("collectionType")); 
Permission[] perm = new Permission[] {Permission.CIRC_FINES_ADD_LIBRARY};
if ( collectionType == CollectionType.TEXTBOOK) {
    perm = new Permission[] {Permission.CIRC_FINES_ADD_TEXTBOOK};
}else if ( collectionType == CollectionType.ASSET) {
    perm = new Permission[] {Permission.CIRC_FINES_ADD_ASSET};
}
%>

<!-- lost copies confirmation -->


<logic:equal name='<%= formName %>' property="confirmLostCopies" value="true">
    <base:messageBox showRedBorder="true">
    <html:hidden property="haveFine"/>
    <tr>
        <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
        <td valign="baseline" class="Error">
                <% if (collectionType == CollectionType.ASSET) { %>
                    <%= MessageHelper.formatMessage("lostcopyprompt_TheItemWillBeMarkedAsLost") %>
                <% } else { %>
                    <%= MessageHelper.formatMessage("lostcopyprompt_TheCopyWillBeMarkedAsLost") %>
                <% } %>
                <br>
                <% if ( perm != null ) { %>
	                <logic:equal name='<%= formName %>' property="mediaBookingUser" value="false">
	                    <logic:equal name='<%= formName %>' property="haveFine" value="true">
                            <logic:equal name='<%= formName %>' property="checkedOut" value="true">
	                        <bean:write name='<%= formName %>' property="currentPatronName"/>
	                        <logic:equal name='<%= formName %>' property="currentPatronVisitor" value="true">
	                            <font color="#cc0000">[<bean:write name='<%= formName %>' property="currentPatronSiteShortName"/>]</font>
	                        </logic:equal>
                            <bean:define id="currentPatronBarcode" name="<%= formName %>" property="currentPatronBarcode" />
                            <%= MessageHelper.formatMessage("lostcopyprompt_BarcodeWillBeChargedAFineOf", currentPatronBarcode) %>
                            <base:spanIfAllowed permissions='<%= perm %>'>    
                                <html:text property="fineAmount" size="12" maxlength="17"/>.
                                <logic:equal name='<%= formName %>' property="stateFineScheduleApplied" value="true">
                                    <!-- I18N DO NO LOCALIZE - Textbook Manager message -->
                                    According to the state fine schedule, a percentage of <bean:write name='<%= formName %>' property="stateFinePercentageDisplayable"/> was applied to the
                                    original price of <bean:write name='<%= formName %>' property="stateFineOriginalPrice"/><logic:notPresent name='<%= formName %>' property ="stateInventoryYearUsed" >.</logic:notPresent>
                                    <logic:present name='<%= formName %>' property ="stateInventoryYearUsed" >
                                      based on Inventory year <bean:write name='<%= formName %>' property="stateInventoryYearUsed"/>.
                                    </logic:present>
                                </logic:equal>
    	                        If you do not want to assess a fine, set the fine amount to zero.
	                        </base:spanIfAllowed>
	                        <base:spanIfNotAllowed permissions='<%= perm %>'>
                                <bean:write name='<%= formName %>' property="fineAmount"/>.
	                            <html:hidden property="fineAmount"/>
                                <logic:equal name='<%= formName %>' property="stateFineScheduleApplied" value="true">
                                    <!-- I18N DO NO LOCALIZE - Textbook Manager message -->
                                    According to the state fine schedule, a percentage of <bean:write name='<%= formName %>' property="stateFinePercentageDisplayable"/> was applied to the
                                    original price of <bean:write name='<%= formName %>' property="stateFineOriginalPrice"/><logic:notPresent name='<%= formName %>' property ="stateInventoryYearUsed" >.</logic:notPresent>                                    <logic:notPresent name='<%= formName %>' property ="stateInventoryYearUsed" >.</logic:notPresent>
                                    <logic:present name='<%= formName %>' property ="stateInventoryYearUsed" >
                                      based on Inventory year <bean:write name='<%= formName %>' property="stateInventoryYearUsed"/>.
                                    </logic:present>
                                </logic:equal>
	                        </base:spanIfNotAllowed>
	                    </logic:equal>
	                </logic:equal>
	                </logic:equal>
                <% } %>
                <logic:equal name='<%= formName %>' property="mediaBookingUser" value="true">
                    <html:hidden property="fineAmount" value="0.00"/>
                </logic:equal>
        </td>
    </tr>
    <logic:notEmpty name='<%= formName %>' property="currencyCodeMessage">
        <html:hidden property="currencyCodeMessage"/>
        <tr><td>&nbsp;</td><td valign="baseline" class="Error"><bean:write filter="false" name='<%= formName %>' property="currencyCodeMessage"/></td></tr>                                
    </logic:notEmpty>
    

    <tr>
        <td align="center" colspan="2" class="ColRowBold">
            <base:showHideTag id="confirmLost">
                <base:okButton name="<%= CopyStatusForm.BUTTON_NAME_MARK_LOST_OK %>" onclick="hideElementconfirmLost()"/><base:cancelButton name="<%= CopyStatusForm.BUTTON_NAME_MARK_LOST_CANCEL %>" onclick="hideElementconfirmLost()"/>
            </base:showHideTag>
        </td>
    </tr>
    </base:messageBox>
</logic:equal>
<!-- lost copies confirmation -->
