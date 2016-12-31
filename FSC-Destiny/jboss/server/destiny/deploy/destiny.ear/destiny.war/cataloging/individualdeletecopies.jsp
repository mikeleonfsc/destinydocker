<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="com.follett.fsc.destiny.util.marc.BibType" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>


<%
    IndividualDeleteForm form = (IndividualDeleteForm)request.getAttribute(IndividualDeleteForm.FORM_NAME);
%>

<%@page import="com.follett.fsc.destiny.util.CollectionType"%>

<%@page import="com.follett.fsc.destiny.session.cataloging.data.ProcessCopyValue"%><base:messageBox strutsErrors="true"/>
<base:form action="/cataloging/servlet/handleindividualdeleteform.do" focus="<%=IndividualDeleteForm.FIELD_BARCODE%>">

    <logic:notEmpty name="<%= IndividualDeleteForm.FORM_NAME %>" property="confirmMessages">
        <%
            List msgList = form.getConfirmMessages();
            boolean deleteAborted = form.isDeleteAborted();
        %>
        <base:imageSpacer width="1" height="3"/>
        
        <base:messageBox showWarningIcon="true" message="<%=(String)msgList.get(0)%>">
        <% if (form.isDistrictCataloger()) {%>
            <html:hidden property="<%=IndividualDeleteForm.FIELD_SELECTED_COPY_SITEID_TO_DELETE%>"/>
        <%} %>
        <%  if (!deleteAborted )  {%>
        <tr valign="top">
            <td colspan="2">
                <% if (msgList.size() > 1 ) { %>
                    <table id="<%=IndividualDeleteForm.TABLE_DELETE_OR_UPDATE_COPY_ACTION%>" border="0" align="center" width="100%">
                    <tr>
                        <td valign="baseline" class="Error">
                        <%= MessageHelper.formatMessage("individualdeletecopies_IfThisCopyIsDeleted") %>
                        <ul>
                        <% Iterator itr = msgList.iterator();
                           itr.next();
                           while ( itr.hasNext() ) { %>
                            <li>
                                <%=(String)itr.next()%>
                            </li>
                        <% } %>
                        </ul>
                        </td></tr>
                    </table>
                <% } %>
            </td>
        </tr>
        <tr>
            <td align="center" class="ColRow" colspan="2"><%= MessageHelper.formatMessage("individualdeletecopies_AreYouSureYouWantToDeleteThisCopy") %></td>
        </tr>
        <tr>
            <td align="center" class="Instruction" colspan="2"><%= MessageHelper.formatMessage("individualdeletecopies_YouMayWantToPrintThisPageForYourRecordsBefore") %></td>
            </tr>
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:yesNo/> 
            </td>
        </tr>
        <% } %>
        </base:messageBox>

    </logic:notEmpty>
    <logic:notEmpty name="<%= IndividualDeleteForm.FORM_NAME %>" property="multipleCopiesFound">
        <html:hidden property="<%=form.FIELD_MULTIPLE_COPIES_MESSAGE %>" value="true"/>
        <%
            List<ProcessCopyValue> pcvList = form.getMultipleCopiesFound();
        %>
        <base:messageBox message='<%= MessageHelper.formatMessage("individualdeletecopies_FoundMoreThanOneCopyInTheDistrictWithRequested") %>' showWarningIcon="true">
            <tr valign="top">
                <td class="ColRow" colspan="2">
                    <% if (pcvList.size() > 1 ) { %>
                        <table id="<%=IndividualDeleteForm.TABLE_DELETE_OR_UPDATE_COPY_ACTION%>" border="0" align="center" width="100%">
                        <tr>
                            <td valign="baseline" class="Error"><%= MessageHelper.formatMessage("individualdeletecopies_PleaseSelectACopyToDelete") %><br>
                             <ul style="list-style-type: none">
                            <% Iterator<ProcessCopyValue> itr = pcvList.iterator();
                               while ( itr.hasNext() ) { %>
                                    <% ProcessCopyValue pcv = itr.next(); %>
                                    <li>
                                    <html:radio property="<%=IndividualDeleteForm.FIELD_SELECTED_COPY_SITEID_TO_DELETE%>" value="<%=Long.toString(pcv.getSiteID())%>"/>
                                    &nbsp;
                                    <%= pcv.getTitle() %>
                                    &nbsp;(<%= pcv.getSiteShortName() %>)
                                    </li>
                            <% } %>
                            </ul>
                            </td></tr>
                        </table>
                    <% } %>
                </td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2">
                    <base:okButton/>&nbsp;<base:cancelButton/> 
                </td>
            </tr>        
        </base:messageBox>
        
    </logic:notEmpty>

<base:outlinedTableAndTabsWithinThere width="100%" id="<%=UpdateCopiesBaseForm.TABLE_MAIN%>"  borderColor="#C0C0C0" selectedTab="<%=IndividualDeleteForm.ID_TAB_INDIVIDUAL_DELETE%>" tabs="<%=form.getTabs()%>" >
<tr>
    <td>

<table border="0" cellspacing="1" cellpadding="1" id="<%=IndividualDeleteForm.TABLE_HEADER%>">
    <tr>
        <td class="TableHeading" colspan="3"><%= MessageHelper.formatMessage("individualdeletecopies_DeleteIndividualCopies") %></td>
    </tr>
    <% if (form.isDistrictCataloger() ) { %>
    <tr>
        <td>&nbsp;</td>
        <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("individualdeletecopies_From") %>&nbsp;</td>
        <td colspan="4">
            <base:selectSite selectedSiteID="<%=form.getSelectedSiteForDistrict() %>" includeAllLibraries="true" includeLibrarySites="true" collectionType="<%=CollectionType.LIBRARY %>" name="<%=UpdateCopiesBaseForm.FIELD_SELECTED_SITE_FOR_DISTRICT%>" />
        </td>
    </tr>
    <% } %>
    <tr>
        <td>&nbsp;</td>
        <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("individualdeletecopies_DeleteCopy") %>&nbsp;</td>
        <td>
            <html:text property="<%=IndividualDeleteForm.FIELD_BARCODE%>"/>&nbsp;
        </td>
        <base:isMediaSite showForMedia="false">
            <logic:equal name="<%=IndividualDeleteForm.FORM_NAME%>" property="productModeBoth" value="true">
                <td class="ColRowBold">
                        <%= MessageHelper.formatMessage("individualdeletecopies_FromLC") %>&nbsp;&nbsp;
                        
                        <logic:equal name="<%=IndividualDeleteForm.FORM_NAME%>" property="displayDropdown" value="true">
                            <bean:define id="deleteOptions" name="<%= IndividualDeleteForm.FORM_NAME %>" property="deleteOptions"/>
                            <html:select property="<%= IndividualDeleteForm.FIELD_DELETE_FROM %>">
                                <html:options collection="deleteOptions" property="longID" labelProperty="stringDesc"/>
                            </html:select>
                        </logic:equal>
                        
                        <logic:equal name="<%=IndividualDeleteForm.FORM_NAME%>" property="displayDropdown" value="false">
                            <html:hidden property="deleteFrom"/>
                            <bean:write name="<%=IndividualDeleteForm.FORM_NAME%>" property="deleteFromDisplayable"/>&nbsp;
                        </logic:equal>
                </td>
            </logic:equal>
            <logic:equal name="<%=IndividualDeleteForm.FORM_NAME%>" property="productModeBoth" value="false">
                <html:hidden property="deleteFrom"/>
            </logic:equal>
        </base:isMediaSite>
        <base:isMediaSite showForMedia="true">
            <html:hidden property="deleteFrom" value='<%=""+IndividualDeleteForm.DELETE_FROM_LIBARY%>'/>
        </base:isMediaSite>
        <td class="ColRowBold">
            <html:checkbox property="<%=IndividualDeleteForm.FIELD_TRACK_AS_WEEDED%>"/><%= MessageHelper.formatMessage("individualdeletecopies_TrackAsWeeded") %>&nbsp;</td>
        <td align="absBottom">
            <base:goButton name="<%= IndividualDeleteForm.BUTTON_GO %>"/>
        </td>

    </tr>
    
    
</table>


    <bean:define id="recentlyDeleted" name="<%= IndividualDeleteForm.FORM_NAME %>" property="recentlyDeletedList" type="java.util.Collection"/>
    <logic:notEmpty name="recentlyDeleted">

     <TABLE id="<%=IndividualDeleteForm.TABLE_RECENTLY_DELETED%>" border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse" bordercolor="#111111" width="97%">
        <TR>
         <TD>
         <TABLE id="<%=IndividualDeleteForm.TABLE_RECENTLY_DELETED_HEADER%>" border="0" height="18" cellpadding="2" cellspacing="0" bordercolor="#111111" width="100%">
          <TR>
            <base:sectionHeading printerFriendly="false" heading='<%=MessageHelper.formatMessage("individualdeletecopies_MostRecentlyDeleted") %>' tdContent=""/>
          </TR>
         </TABLE>
         </TD>
        </TR>

        <%-- kick out two <TR>s of data for each element, plus a spacer line after --%>
        <% int lineCount = 1; %>
        <logic:iterate id="recentlyDeletedRow" name="recentlyDeleted" type="com.follett.fsc.destiny.session.cataloging.data.ProcessCopyValue">
           <TR>
             <TD>
              <TABLE id="<%=IndividualDeleteForm.TABLE_RECENTLY_DELETED_ROW + lineCount++%>" border="0" cellpadding="2" cellspacing="0" style="border-collapse: collapse" bordercolor="#111111" width="100%">

                <TR>
               
                   <TD width="20"><%=BibType.getBibTypeIcon(recentlyDeletedRow.getBibType(), false, recentlyDeletedRow.getBibSubType(), null, recentlyDeletedRow.getCollectionType(), null, null) %></TD>
                   <td>
                       <span class="ColRowBold"><bean:write name="recentlyDeletedRow" property="title"/></span>
                       <span class="SmallColRow">(<%= MessageHelper.formatMessage("individualdeletecopies_Copy", recentlyDeletedRow.getCopyBarcodeDisplayable()) %><c:if test="${!empty recentlyDeletedRow.siteShortName}">&nbsp;<font color="#cc0000">[<bean:write name="recentlyDeletedRow" property="siteShortName"/>]</font></c:if>)</span>
                       <logic:equal name="recentlyDeletedRow" property="bibMasterDeleted" value="true"><span class="ColRow"><%= MessageHelper.formatMessage("individualdeletecopies_TitleDeleted") %></span></logic:equal>
                   </TD>
                   <td class="ColRowBold tdAlignRight"><bean:write name="recentlyDeletedRow" property="callNumberOrLocation"/></TD>
                </TR>

                <logic:equal name="recentlyDeletedRow" property="checkedOut" value="true">
                <TR>
                   <TD>&nbsp;</TD>
                   <TD Colspan="2" valign="bottom">
                     <span class="ColRow"><%= MessageHelper.formatMessage("individualdeletecopies_CheckedOut", recentlyDeletedRow.getCheckedOutDate(), recentlyDeletedRow.getPatronName()) %></span>
                     <span class="SmallColRow">(<bean:write name="recentlyDeletedRow" property="patronTypeDescription"/>:&nbsp;
                       <base:link permission="<%=Permission.CIRC_VIEW_PATRON_STATUS%>" showTextAlways="true" page='<%="/circulation/servlet/handlepatroninfoform.do?patronID=" + recentlyDeletedRow.getPatronID()%>'>
                          <bean:write name="recentlyDeletedRow" property="patronBarcode"/>
                       </base:link>
                       )
                     </span>
                   </TD>
                </TR>
                </logic:equal>

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

<jsp:include page="/circulation/setsound.jsp"/>
<logic:present name="<%=IndividualDeleteForm.FORM_NAME%>" property="soundFile" scope="request" >
<script language="JavaScript">
<!--
setSound("<bean:write name="<%=IndividualDeleteForm.FORM_NAME%>" property="soundFile"/>");
//-->
 </script>
</logic:present>
