<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ page import="java.util.List" %>
<%@ page import="com.follett.fsc.destiny.util.marc.BibType" %>
<%@ page import="com.follett.fsc.destiny.util.lookup.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.QuickPickSpecs" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>


<base:messageBox strutsErrors="true"/>
<%
    IndividualUpdateForm form = (IndividualUpdateForm)request.getAttribute(IndividualUpdateForm.FORM_NAME);
%>
<bean:define id="listOfCategories" name="<%= IndividualUpdateForm.FORM_NAME %>" property="categoryList"/>
<bean:define id="listOfCircTypes" name="<%= IndividualUpdateForm.FORM_NAME %>" property="circTypeList"/>

<base:form action="/cataloging/servlet/handleindividualupdateform.do" focus="<%=IndividualUpdateForm.FIELD_BARCODE%>">

<html:hidden name="<%= IndividualUpdateForm.FORM_NAME %>" property="<%= IndividualUpdateForm.FIELD_INDIVIDUAL_UPDATE_DROPDOWN_CHANGED %>"/>
<input type="hidden" name="changedDropDown" />

<base:outlinedTableAndTabsWithinThere  width="100%" id="<%=UpdateCopiesBaseForm.TABLE_MAIN%>"  borderColor="#C0C0C0" selectedTab="<%=IndividualUpdateForm.ID_TAB_INDIVIDUAL_UPDATE%>" tabs="<%=form.getTabs()%>" >
<tr>
    <td>

<table border="0" cellspacing="0" cellpadding="0" id="<%=IndividualUpdateForm.TABLE_HEADER%>">
    <tr>
        <td class="TableHeading" colspan="2"><%= MessageHelper.formatMessage("individualupdatecopies_UpdateIndividualCopies") %></td>
    </tr>
    <base:isMediaSite  showForMedia="false">
        <% if (form.isDistrictCataloger() ) { %>
            <tr>
                <td colspan="4">
                &nbsp;
                </td>
            </tr>
            <tr>
                <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("individualupdatecopies_For") %>&nbsp;</td>
                <td colspan="3">
                    <base:selectSite onChangeAction="submitSiteChange();"
                                     includeFromDistrict="false"
                                     useSelectASite="true"
                                     selectedSiteID="<%=form.getSelectedSiteForDistrict() %>"
                                     includeAllLibraries="false"
                                     includeLibrarySites="true"
                                     collectionType="<%=CollectionType.LIBRARY %>"
                                     name="<%=UpdateCopiesBaseForm.FIELD_SELECTED_SITE_FOR_DISTRICT%>" />
                </td>
            </tr>
            <tr>
                <td colspan="4">
                &nbsp;
                </td>
            </tr>
        <% } %>
    </base:isMediaSite>
    <tr>
        <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("individualupdatecopies_Copy") %>&nbsp;</td>
        <td>
            <html:text property="<%=IndividualUpdateForm.FIELD_BARCODE%>"/>
        </td>
        <td class="ColRowBold">
            <base:isMediaSite  showForMedia="false">
                &nbsp;<%= MessageHelper.formatMessage("individualupdatecopies_FromLibraryMaterials") %>
            </base:isMediaSite>
            <INPUT TYPE="HIDDEN" NAME="<%= IndividualUpdateForm.FIELD_DELETE_FROM %>" VALUE="<%= IndividualUpdateForm.DELETE_FROM_LIBARY%>"/>
        </td>
        <td align="absBottom" class="ColRowBold">
            <base:showHideTag id="onUpdate" showTextOnNewLine="false">
            &nbsp;&nbsp;&nbsp;
                <base:genericButton src="/buttons/large/updatecopies.gif" onclick="hideElementonUpdate()" name="<%= IndividualUpdateForm.BUTTON_GO %>" alt='<%= MessageHelper.formatMessage("update") %>'/>
            </base:showHideTag>
        </td>

    </tr>
    
    <tr><td colspan="4"><base:imageSpacer width="30" height="3"/></td></tr>
    <tr>
        <td>&nbsp;</td>
        <td colspan="3">
            <table border="0" id="<%=IndividualUpdateForm.TABLE_INDIVIDUAL_UPDATE%>">
            <%
                for (int i = 0; i < form.getNumberOfDropDowns(); i++) {
                    String dropDownID = "" + (i + 1);
                %><tr><td class="ColRow tdAlignRight">
                <select size="1" name="<%=form.getIndividualUpdateDropdownName(i)%>" onchange="limiterTypeModified<%= dropDownID %>()"><%
                    List options = form.getIndividualUpdateDropdownOptions(i);
                    for (int j = 0; j < options.size(); j++) {
                        LongStringLookup selectedOption = (LongStringLookup) options.get(j);
                        String selected = "";
                        if ( selectedOption.getLongID().equals(form.getIndividualUpdateSelectedOption(i)) ) {
                        %><option value="<%=selectedOption.getLongID()%>" selected="true"><%=selectedOption.getStringDesc()%></option><%
                        } else {
                        %><option value="<%=selectedOption.getLongID()%>"><%=selectedOption.getStringDesc()%></option><%
                        }
                    }
                    %></select>
                    </td>
                    <td class="ColRowBold" align="center">
                        &nbsp;
                        <% if (form.getIndividualUpdateSelectedOption(i) != null && form.getIndividualUpdateSelectedOption(i).longValue() != 0) { %><%= MessageHelper.formatMessage("individualupdatecopies_To") %>&nbsp;&nbsp;<% } %>
                    </td>
                    <td>
                        <% if (form.getIndividualUpdateSelectedOption(i) == null || form.getIndividualUpdateSelectedOption(i).longValue() == 0) { %>
                            &nbsp;
                        <% } else if (form.getIndividualUpdateSelectedOption(i).longValue() == 1) { %>
                            
                            <base:editCopyDropDown fieldName="<%= form.getIndividualUpdateFieldName(i) %>" 
                                                   siteID="<%= form.getSiteID() %>" 
                                                   currentSelection="<%=form.getIndividualUpdateFieldValue(i)%>" 
                                                   controlNum="<%= QuickPickSpecs.CONTROL_NUM_SUBLOCATION %>"/>
                        <% } else if (form.getIndividualUpdateSelectedOption(i).longValue() == 2) { %>
                                <html:select property="<%= form.getIndividualUpdateFieldName(i) %>">
                                    <html:options collection="listOfCategories" property="longID"
                                          labelProperty="stringDesc"/>
                                </html:select>
                    <% } else { %>
                                <html:select property="<%= form.getIndividualUpdateFieldName(i) %>">
                                    <html:options collection="listOfCircTypes" property="longID"
                                          labelProperty="stringDesc"/>
                                </html:select>
                        <% } %>
                    </td>
                </tr><%
                }
            %>
            </table>
        </td>
    </tr>
</table>


    <bean:define id="recentlyUpdated" name="<%= IndividualUpdateForm.FORM_NAME %>" property="recentlyUpdatedList" type="java.util.Collection"/>
    <logic:notEmpty name="recentlyUpdated">
    <br/>
     <TABLE id="<%=IndividualUpdateForm.TABLE_RECENTLY_UPDATED%>" border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse" bordercolor="#111111" width="100%">
        <TR>
         <TD>
         <TABLE id="<%=IndividualUpdateForm.TABLE_RECENTLY_UPDATED_HEADER%>" border="0" height="18" cellpadding="2" cellspacing="0" bordercolor="#111111" width="100%">
          <TR>
            <base:sectionHeading printerFriendly="false" heading='<%= MessageHelper.formatMessage("individualupdatecopies_MostRecentlyUpdated") %>' tdContent=""/>
          </TR>
         </TABLE>
         </TD>
        </TR>

        <%-- kick out two <TR>s of data for each element, plus a spacer line after --%>
        <% int lineCount = 1; %>
        <logic:iterate id="recentlyUpdatedRow" name="recentlyUpdated" type="com.follett.fsc.destiny.session.cataloging.data.ProcessCopyValue">
           <TR>
             <TD>
              <TABLE id="<%=IndividualUpdateForm.TABLE_RECENTLY_UPDATED_ROW + lineCount++%>" border="0" cellpadding="2" cellspacing="0" style="border-collapse: collapse" bordercolor="#111111" width="100%">

                <TR>
                   <TD width="20"><%=BibType.getBibTypeIcon(recentlyUpdatedRow.getBibType(), false, recentlyUpdatedRow.getBibSubType(), null, recentlyUpdatedRow.getCollectionType(), null, null) %></TD>
                   <td>
                       <span class="ColRowBold"><bean:write name="recentlyUpdatedRow" property="title"/></span>
                       <span class="SmallColRow"> (<%= MessageHelper.formatMessage("individualupdatecopies_Copy") %>: 
                       <base:link permission="<%=Permission.CAT_EDIT_COPIES%>" page='<%="/circulation/servlet/handlecopystatusform.do?copyList=x&searchOption=0&copyID=" + recentlyUpdatedRow.getCopyID()%>' id="<%=IndividualUpdateForm.ID_BUTTON_EDIT_COPY + recentlyUpdatedRow.getCopyID() %>">
                           <bean:write name="recentlyUpdatedRow" property="copyBarcodeDisplayable"/>
                       </base:link><c:if test="${!empty recentlyUpdatedRow.siteShortName}">&nbsp;<font color="#cc0000">[<bean:write name="recentlyUpdatedRow" property="siteShortName"/>]</font></c:if>)</span>
                   </TD>
                   <td class="ColRowBold tdAlignRight"><bean:write name="recentlyUpdatedRow" property="callNumberOrLocation"/></TD>
                   <td class="ColRowBold tdAlignRight">
                        <% if ( !recentlyUpdatedRow.isTemporary() ) { %>
    		                <base:link permission="<%=Permission.CAT_EDIT_COPIES%>" page='<%="/cataloging/servlet/presentcopyeditlibraryform.do?action=edit&textbook=false&copyID=" + recentlyUpdatedRow.getCopyID()%>' id="<%=IndividualUpdateForm.ID_BUTTON_EDIT_COPY + recentlyUpdatedRow.getCopyID() %>">
    		                    <base:image src="/buttons/small/editsmall.gif" alt='<%= MessageHelper.formatMessage("edit") %>'/>
    		                </base:link>
                        <% } %>
                   </TD>
                </TR>
              </TABLE>
             </TD>
            </TR>

            <TR> <!-- separator line -->
             <TD><base:imageLine height="2" width="100%" vspace="4" /></TD>
            </TR>
        </logic:iterate>
    </TABLE>
  </logic:notEmpty>

</td>
</tr>
</base:outlinedTableAndTabsWithinThere>
</base:form>
<script language="JavaScript">
<!--
function limiterTypeModified1() {
    document.<%=IndividualUpdateForm.FORM_NAME%>.<%=IndividualUpdateForm.FIELD_INDIVIDUAL_UPDATE_DROPDOWN_CHANGED%>.value = 1;
    document.<%=IndividualUpdateForm.FORM_NAME%>.submit();
}
function limiterTypeModified2() {
    document.<%=IndividualUpdateForm.FORM_NAME%>.<%=IndividualUpdateForm.FIELD_INDIVIDUAL_UPDATE_DROPDOWN_CHANGED%>.value = 2;
    document.<%=IndividualUpdateForm.FORM_NAME%>.submit();
}
function limiterTypeModified3() {
    document.<%=IndividualUpdateForm.FORM_NAME%>.<%=IndividualUpdateForm.FIELD_INDIVIDUAL_UPDATE_DROPDOWN_CHANGED%>.value = 3;
    document.<%=IndividualUpdateForm.FORM_NAME%>.submit();
}
function submitSiteChange() {
    document.<%=IndividualUpdateForm.FORM_NAME%>.changedDropDown.value="true";    
    document.<%=IndividualUpdateForm.FORM_NAME%>.submit();
}
//-->
</script>
<jsp:include page="/circulation/setsound.jsp"/>
<logic:present name="<%=IndividualUpdateForm.FORM_NAME%>" property="soundFile" scope="request" >
<script language="JavaScript">
<!--
setSound("<bean:write name="<%=IndividualUpdateForm.FORM_NAME%>" property="soundFile"/>");
//-->
</script>
</logic:present>
