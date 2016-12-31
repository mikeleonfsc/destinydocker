<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.destiny.client.backoffice.jsptag.UpdatePatronMergeResultDisplayTag"%>




<base:messageBox strutsErrors="true"/>

<%
    UpdatePatronViewDuplicatesForm form = (UpdatePatronViewDuplicatesForm)request.getAttribute( UpdatePatronViewDuplicatesForm.FORM_NAME );
%>
<!-- ONLY display the table if there was results passed -->

<base:form action="/backoffice/servlet/handleupdatepatronviewduplicatesform.do">
<html:hidden property="<%=UpdatePatronViewDuplicatesForm.FIELD_PATRON_LIST %>"/>

<% if ( form.isConfirmMerge()) { %>
        <base:messageBox showRedBorder="true">
            <tr>
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td align="center" class="ColRowBold">
                <%=form.gimmeConfirmationMessage() %><br/>
                <base:isDistrictUser>
                    <%=form.gimmeDistrictUserMergeMessage() %><br/>
                </base:isDistrictUser>
                <br/><%=MessageHelper.formatMessage("updatepatronviewduplicates_ThisProcessCannotBeStoppedOrReversed") %><br/>
                <%= MessageHelper.formatMessage("updatepatronviewduplicates_AreYouSureYouWantToProceed") %>
            </td>
            </tr>
	        <tr>
	            <td valign="baseline" align="center" class="ColRow" colspan="2">
	                <base:yesNo/>
	            </td>
	        </tr>
        </base:messageBox>
<%} %>


<base:outlinedTable borderColor='#c0c0c0' width="100%" cellpadding="0" id="<%=UpdatePatronViewDuplicatesForm.TABLE_MAIN%>">
    <tr>
        <td class="TableHeading" colspan="2"><%= MessageHelper.formatMessage("updatepatronviewduplicates_MergeDuplicatePatrons") %></td>
        <td class="tdAlignRight">
            <logic:equal name="<%= UpdatePatronViewDuplicatesForm.FORM_NAME %>" property="printerFriendly" value="false">
                <base:genericButton src="/icons/general/previouslonger.gif" name="<%=UpdatePatronViewDuplicatesForm.BUTTON_NAME_PREVIOUS %>" alt='<%=MessageHelper.formatMessage("updatepatronviewduplicates_Previous") %>'/>
                <base:imageSpacer width="44" height="1"/>
            </logic:equal>
            <logic:equal name="<%= UpdatePatronViewDuplicatesForm.FORM_NAME %>" property="printerFriendly" value="true">
                &nbsp;
            </logic:equal>
        </td>
    <tr>
        <td colspan="2">
            &nbsp;
        </td>
        <td class="tdAlignRight">
            <logic:equal name="<%= UpdatePatronViewDuplicatesForm.FORM_NAME %>" property="printerFriendly" value="false">
                <base:genericButton src="/buttons/large/mergepatrons.gif" name="<%=UpdatePatronViewDuplicatesForm.BUTTON_NAME_MERGE %>" alt='<%=MessageHelper.formatMessage("merge") %>'/>
            </logic:equal>
            <logic:equal name="<%= UpdatePatronViewDuplicatesForm.FORM_NAME %>" property="printerFriendly" value="true">
                &nbsp;
            </logic:equal>
        </td>
    </tr>
    <tr>
        <td class="ColRow" colspan="2">
            <b><%= MessageHelper.formatMessage("updatepatronviewduplicates_Step2Of2") %></td>
        <td class="tdAlignRight">
            <logic:equal name="<%= UpdatePatronViewDuplicatesForm.FORM_NAME %>" property="printerFriendly" value="false">
                <base:cancelButton/>
            </logic:equal>
            <logic:equal name="<%= UpdatePatronViewDuplicatesForm.FORM_NAME %>" property="printerFriendly" value="true">
                &nbsp;
            </logic:equal>
        </td>
    </tr>
    <base:isDistrictUser>
        <logic:equal name="<%= UpdatePatronViewDuplicatesForm.FORM_NAME %>" property="printerFriendly" value="false">
            <tr>
               <td colspan="3" class="ColRowBold">
                    <html:radio property="<%=UpdatePatronViewDuplicatesForm.FIELD_KEEP_ONLY_PRIMARY%>" value="false"/>
                    <%=MessageHelper.formatMessage("updatepatronviewduplicates_KeepAllSiteAssociations") %>
               </td>
            </tr>
            <tr>
               <td colspan="3" class="ColRowBold">
                    <html:radio property="<%=UpdatePatronViewDuplicatesForm.FIELD_KEEP_ONLY_PRIMARY%>" value="true"/>
                    <%=MessageHelper.formatMessage("updatepatronviewduplicates_KeepOnlyThePrimarySiteAssociationOfThePreferredPatron") %>
               </td>
            </tr>
        </logic:equal>
    </base:isDistrictUser>
    <tr>
        <td class="ColRow" colspan="3">
            <logic:equal name="<%= UpdatePatronViewDuplicatesForm.FORM_NAME %>" property="printerFriendly" value="false">
                <base:imageLine height="1" width="100%"/>
            </logic:equal>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold" colspan="2">
            <br/><%= MessageHelper.formatMessage("updatepatronviewduplicates_PossibleDuplicatePatrons") %></td>
        <td class="tdAlignRight" valign="bottom">
            <logic:equal name="<%=UpdatePatronViewDuplicatesForm.FORM_NAME%>" property="<%=UpdatePatronViewDuplicatesForm.PRINTER_FRIENDLY_PARAM%>" value="false">
                <base:link page="<%= form.getPrinterFriendlyLink() %>" target="printerFriendly" id="<%= UpdatePatronViewDuplicatesForm.ID_PRINTER_FRIENDLY %>">
                    <base:image src="/buttons/small/printerfriendly.gif" alt='<%= MessageHelper.formatMessage("printable") %>'/>
                </base:link>
            </logic:equal>
            <logic:equal name="<%=UpdatePatronViewDuplicatesForm.FORM_NAME%>" property="<%=UpdatePatronViewDuplicatesForm.PRINTER_FRIENDLY_PARAM%>" value="true">
                &nbsp;
            </logic:equal>
        </td>
    </tr>
    <tr>
        <td colspan="3" class="SmallColHeading">
            <br/><%= MessageHelper.formatMessage("updatepatronviewduplicates_PatronsSelected0",new Long(form.getPatronList().size())) %>
        </td>
    </tr>
    <tr>
        <td class="ColRow" colspan="3">
            <logic:equal name="<%= UpdatePatronViewDuplicatesForm.FORM_NAME %>" property="printerFriendly" value="false">
                <base:imageLine height="1" width="100%"/>
            </logic:equal>
        </td>
    </tr>
    <tr>
        <td colspan="3">
        <table id=<%= UpdatePatronViewDuplicatesForm.TABLE_DUPLICATE_PATRONS %> width="100%">
        
        <logic:iterate  
            indexId="flipper" id="row" 
            name="<%= UpdatePatronViewDuplicatesForm.FORM_NAME %>" 
            property="patronList" 
            type="com.follett.fsc.destiny.session.backoffice.data.FindSitePatronValue">
            <%if (flipper > 0) { %>
                <tr><td width="100%"><base:imageLine printerFriendly="<%=form.isPrinterFriendly() %>"/></td></tr>
            <% } %>
            <tr><td width="100%">    
            <base:updatePatronMergeResultDisplay 
            mode = "<%=UpdatePatronMergeResultDisplayTag.MODE_TO_BE_MERGED_LIST %>"
            patronValue="<%= row %>"
            printerFriendly="<%=form.isPrinterFriendly() %>"/>
            </td></tr>
        </logic:iterate>
        </table>
        </td>
    </tr>
    <tr>
        <td colspan="3" class="SmallColHeading">
            <br/><%= MessageHelper.formatMessage("updatepatronviewduplicates_PatronsSelected0",new Long(form.getPatronList().size())) %>
        </td>
    </tr>
    
</base:outlinedTable>
</base:form>
