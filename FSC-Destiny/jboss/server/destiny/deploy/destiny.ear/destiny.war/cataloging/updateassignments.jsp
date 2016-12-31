<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.UpdateAssignmentsForm" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@page import="com.follett.fsc.destiny.entity.ejb3.CopySpecs"%>
<base:messageBox strutsErrors="true"/>

<%
    UpdateAssignmentsForm form = (UpdateAssignmentsForm)request.getAttribute(UpdateAssignmentsForm.FORM_NAME);
%>
<BR><BR>
<base:form action="/cataloging/servlet/handleupdateassignmentsform.do" focus="<%=UpdateAssignmentsForm.FIELD_SEARCH_STRING%>">
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" name="trapEnterKey">
<html:hidden property="copyID"/>
<html:hidden property="page"/>
<html:hidden property="<%=UpdateAssignmentsForm.PARAM_VIEW_TYPE%>"/>
<html:hidden property="<%=UpdateAssignmentsForm.PARAM_HIGHLIGHT_COPY_ID%>"/>

<logic:present name="<%=UpdateAssignmentsForm.FORM_NAME%>" property="copyIDToRemove">
        <base:imageSpacer height="3" width="1"/>
        <html:hidden property="copyIDToRemove"/>
        <base:messageBox showRedBorder="true">
            <tr valign="top">
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td class="ColRowBold">
                    <bean:write name="<%=UpdateAssignmentsForm.FORM_NAME%>" property="<%=UpdateAssignmentsForm.PARAM_REMOVE_MESSAGE%>" filter="false"/>
                </td>
            </tr>           
            <tr>
                <td align="center" class="ColRow" colspan="2"><%= MessageHelper.formatMessage("updateassignments_AreYouSureYouWantToRemoveThisAssignment") %></td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2">
                    <base:yesNo/>
                </td>
            </tr>
        </base:messageBox>      
</logic:present>
<base:outlinedTable borderColor="#c0c0c0" id="<%=UpdateAssignmentsForm.TABLE_MAIN%>">
<tr>
<td>
    <table width="100%" id="<%=UpdateAssignmentsForm.TABLE_OUTER_HEADER%>" cellspacing="3" cellpadding="1" border="0">
        <tr>
            <td>
                <table id="<%=UpdateAssignmentsForm.TABLE_HEADER%>" cellspacing="3" cellpadding="1" border="0">
                    <tr>
                        <td class="TableHeading" colspan="2">
                            <bean:write name="<%=UpdateAssignmentsForm.FORM_NAME%>" property="headerTitle"/>
                      </td>
                    </tr>
                    <tr>
                        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("updateassignments_Barcode") %></td>
                        <td class="ColRow">
                            <bean:write name="<%=UpdateAssignmentsForm.FORM_NAME%>" property="copyBarcode"/>
                        </td>
                    </tr>
                    <logic:equal name="<%=UpdateAssignmentsForm.FORM_NAME%>" property="currentCopyIsLicense" value="true">
                    <tr>
                        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("updateassignments_TotalLicenses") %></td>
                        <td class="ColRow">
                            <bean:write name="<%=UpdateAssignmentsForm.FORM_NAME%>" property="totalLicenses"/>
                        </td>
                    </tr>
                    <tr>
                        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("updateassignments_AssignedTo") %></td>
                        <logic:notEqual name="<%=UpdateAssignmentsForm.FORM_NAME%>" property="assignedToManyLicense" value="true">
                            <td class="ColRow">
                        </logic:notEqual>
                        <logic:equal name="<%=UpdateAssignmentsForm.FORM_NAME%>" property="assignedToManyLicense" value="true">
                            <td class="ColRowBold">
                                <font color="#CC0000">  
                        </logic:equal>
                            <bean:write name="<%=UpdateAssignmentsForm.FORM_NAME%>" property="assignedToCount"/>
                        <logic:equal name="<%=UpdateAssignmentsForm.FORM_NAME%>" property="assignedToManyLicense" value="true">
                             </font>
                        </logic:equal>      
                            
                        </td>
                    </tr>
                    </logic:equal>
                </table>
            </td>
            <td class="tdAlignRight" valign="top">
                <base:closeButton absbottom="true" withX="true"/>
            </td>
        </tr>
    </table>      
</td>
</tr>
<% if (form.getAssetTypes().size() > 0) { %>
<tr>
<td width="100%">
    <base:imageLine height="1" width="100%"/>
</td>
</tr>


<!-- Assign Controls Start -->
<tr>
<td width="100%">
   <table id="<%=UpdateAssignmentsForm.TABLE_ASSIGN%>" cellspacing="3" cellpadding="1" border="0">
     <%
         String notFoundMessage = form.getNoResultsMessage();
             if (!StringHelper.isEmpty(notFoundMessage)) {
     %>
         <tr><td colspan="2">
             <base:messageBox filterMessage="false" showWarningIcon="false" message="<%=notFoundMessage%>"/>
         </td></tr>
    <%
        }
    %>
<logic:equal name="<%=UpdateAssignmentsForm.FORM_NAME%>" property="currentCopyIsLicense" value="true">
    <tr>
    <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("updateassignments_AssignTo") %></td>
        <td>
         <html:text property="<%=UpdateAssignmentsForm.FIELD_SEARCH_STRING%>" size="30" maxlength="120"/>
         &nbsp;
         <base:genericButton src="/buttons/large/finditem.gif" alt="<%=UpdateAssignmentsForm.ALT_FIND_ITEM%>" 
            name="<%=UpdateAssignmentsForm.BUTTON_FIND_ITEM%>" />
        </td>
    </tr>
    <tr>
    <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("updateassignments_In") %></td>
    <td>
         <bean:define id="assetTypes" name="<%=UpdateAssignmentsForm.FORM_NAME%>" property="assetTypes"/>
         <html:select property="<%=UpdateAssignmentsForm.FIELD_ASSET_TYPE%>">
                    <html:options collection="assetTypes" property="longID"
                              labelProperty="stringDesc"/>
         </html:select>
    </td>           
    </tr>
</logic:equal>
<logic:notEqual name="<%=UpdateAssignmentsForm.FORM_NAME%>" property="currentCopyIsLicense" value="true">
    <tr>
       <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("updateassignments_Assign") %>&nbsp;</td>
       <td>
          <bean:define id="assetTypes" name="<%=UpdateAssignmentsForm.FORM_NAME%>" property="assetTypes"/>
          <html:select property="<%=UpdateAssignmentsForm.FIELD_ASSET_TYPE%>">
             <html:options collection="assetTypes" property="longID"
                labelProperty="stringDesc"/>
          </html:select>
       </td>        
    </tr>
    <tr>
       <td class="ColRowBold tdAlignRight">&nbsp;</td>
       <td>
          <html:text property="<%=UpdateAssignmentsForm.FIELD_SEARCH_STRING%>" size="30" maxlength="120"/>
          &nbsp;
            <logic:equal name="<%=UpdateAssignmentsForm.FORM_NAME%>" property="<%=UpdateAssignmentsForm.PARAM_VIEW_TYPE%>" value='<%="" + CopySpecs.ASSET_ITEM_TYPE_KIT%>'>
              <base:genericButton src="/buttons/large/finditem.gif" alt="<%=UpdateAssignmentsForm.ALT_FIND_ITEM%>" 
                 name="<%=UpdateAssignmentsForm.BUTTON_FIND_ITEM%>" />
           </logic:equal>
            <logic:notEqual name="<%=UpdateAssignmentsForm.FORM_NAME%>" property="<%=UpdateAssignmentsForm.PARAM_VIEW_TYPE%>" value='<%="" + CopySpecs.ASSET_ITEM_TYPE_KIT%>'>
              <base:genericButton src="/buttons/large/findlicense.gif" alt="<%=UpdateAssignmentsForm.ALT_FIND_LICENSE%>" 
                 name="<%= UpdateAssignmentsForm.BUTTON_FIND_ITEM %>" />
           </logic:notEqual>
       </td>
    </tr>
</logic:notEqual>
    <tr>
    <td class="ColRowBold tdAlignRight">
        &nbsp;
    </td>
    <td class="ColRow">
        <logic:equal name="<%=UpdateAssignmentsForm.FORM_NAME%>" property="districtSearchAllowed" value="true">
        <html:checkbox property="<%=UpdateAssignmentsForm.FIELD_ONLY_MY_ASSETS%>"><bean:write name="<%=UpdateAssignmentsForm.FORM_NAME%>" property="searchDistrictPrompt"/></html:checkbox>
        </logic:equal>  
        <logic:equal name="<%=UpdateAssignmentsForm.FORM_NAME%>" property="districtSearchAllowed" value="false">
        <html:hidden property="<%=UpdateAssignmentsForm.FIELD_ONLY_MY_ASSETS%>" value='<%=""+form.isDefaultHiddenOnlyMyAssets()%>'/>
        </logic:equal>  
    </td>           
    </tr>
   </table>
</td>
</tr>
<% } %>

<!-- Assign Controls End -->


<!-- search hit lists -->

<logic:equal name="<%=UpdateAssignmentsForm.FORM_NAME%>" property="anySearchListsToDisplay" value="true">

<tr><td width="100%">   
  <table id="<%=UpdateAssignmentsForm.TABLE_COPY_FIND %>" width="95%" cellspacing="0" cellpadding="4">

    <logic:equal name="<%=UpdateAssignmentsForm.FORM_NAME%>" property="listFilledWithCopies" value="false">
        <jsp:include page="/common/titlelist.jsp">
            <jsp:param name="formName" value="<%=UpdateAssignmentsForm.FORM_NAME%>"/>
            <jsp:param name="showAvailability" value="false"/>
            <jsp:param name="neverShowAvailability" value="true"/>
        </jsp:include>
    </logic:equal>
    

    <logic:equal name="<%=UpdateAssignmentsForm.FORM_NAME%>" property="listFilledWithCopies" value="true">
       <tr>
           <td colspan="4" class="TableHeading2"><bean:write name="<%=UpdateAssignmentsForm.FORM_NAME%>" property="copyListTitle"/></td>
       </tr>
       <%=form.outputList(form.getList()) %>
        </logic:equal>  
  </table>
</td></tr>            
</logic:equal>

<tr>
<td width="100%">
    <base:imageLine height="1" width="100%"/>
</td>
</tr>



<!-- output list of currently assigned -->

<tr>
<td width="100%">
    <table id="<%=UpdateAssignmentsForm.TABLE_ASSIGNED_LIST_HEADER%>" width="100%" cellpadding="3" cellspacing="0">
        <tr>
            <td class='TableHeading2'>
                <bean:write name="<%=UpdateAssignmentsForm.FORM_NAME%>" property="assignedListHeader"/>
            </td>
            <td class="SmallColHeading tdAlignRight">
                <base:pageListOutput formName="<%=UpdateAssignmentsForm.FORM_NAME%>" />
            </td>
        </tr>
    </table>
</td>
</tr>

<tr>
<td width="100%">
    <table id="<%=UpdateAssignmentsForm.TABLE_ASSIGNED_LIST%>" width="100%" cellpadding="3" cellspacing="0">
        <%form.renderAssignList(out); %>
    </table>
</td>
</tr>

<tr>
<td width="100%">
    <table id="<%=UpdateAssignmentsForm.TABLE_ASSIGNED_LIST_FOOTER%>" width="100%" cellpadding="3" cellspacing="0">
        <tr>
            <td class='TableHeading2'>
                &nbsp;
            </td>
            <td class="SmallColHeading tdAlignRight">
                <base:pageListOutput formName="<%=UpdateAssignmentsForm.FORM_NAME%>" topOfPageLinks="false"/>
            </td>
        </tr>
    </table>
</td>
</tr>


</base:outlinedTable>

</base:form>
