<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ page import="java.util.List" %>
<%@ page import="com.follett.fsc.destiny.util.lookup.*" %>
<%@ page import="com.follett.fsc.destiny.session.cataloging.data.ProcessCopyValue"%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<base:messageBox strutsErrors="true"/>

<bean:define id="listOfStatuses" name="<%= IndividualUpdateAssetsForm.FORM_NAME %>" property="statusesList"/>
<bean:define id="listOfHomeLocations" name="<%= IndividualUpdateAssetsForm.FORM_NAME %>" property="homeLocationsList"/>
<bean:define id="listOfDepartments" name="<%= IndividualUpdateAssetsForm.FORM_NAME %>" property="departmentsList"/>
<bean:define id="listOfFundingSources" name="<%= IndividualUpdateAssetsForm.FORM_NAME %>" property="fundingSourceList"/>
<bean:define id="listOfItemCategories" name="<%= IndividualUpdateAssetsForm.FORM_NAME %>" property="itemCategoriesList"/>
<bean:define id="listOfItemConditions" name="<%= IndividualUpdateAssetsForm.FORM_NAME %>" property="conditionsList"/>

<%
    IndividualUpdateAssetsForm form = (IndividualUpdateAssetsForm) request.getAttribute(IndividualUpdateAssetsForm.FORM_NAME);
%>

<base:form action="/cataloging/servlet/handleindividualupdateassetsform.do" focus="<%=IndividualUpdateAssetsForm.FIELD_BARCODE%>">

<html:hidden name="<%= IndividualUpdateAssetsForm.FORM_NAME %>" property="<%=IndividualUpdateAssetsForm.PARAM_CUSTODIAN_ID%>"  />
<html:hidden name="<%= IndividualUpdateAssetsForm.FORM_NAME %>" property="focusOnSerial"/>
<html:hidden name="<%= IndividualUpdateAssetsForm.FORM_NAME %>" property="<%=IndividualUpdateAssetsForm.FIELD_LAST_VALUE_SELECTED%>"/>
<html:hidden name="<%= IndividualUpdateAssetsForm.FORM_NAME %>" property="barcodeFocus"/>

<%-- @include file="/common/trapenter.jsp" --%>
<%-- Delete this code and enable the above include after fixing compile jsp --%>
<script language="JavaScript">
<!--
    function trapEnter(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13 ) {
        return false;
      }
      return true;
    }
//-->
</script>
    <html:hidden property="<%=IndividualUpdateAssetsForm.FIELD_MULTIPLE_COPIES_MESSAGE%>" value="true"/>
    <logic:notEmpty name="<%= IndividualUpdateAssetsForm.FORM_NAME %>" property="pcvList">
        <base:messageBox message='<%=MessageHelper.formatMessage("individualupdateassetitems_FoundMoreThanOneItemInTheDistrictWithRequested")%>' showWarningIcon="true">
            <tr valign="top">
                <td class="ColRow" colspan="2">    
                    <table id="<%=IndividualUpdateAssetsForm.TABLE_DELETE_OR_UPDATE_COPY_ACTION%>" border="0" align="center" width="100%">
                        <tr>
                            <td valign="baseline" class="Error"><%= MessageHelper.formatMessage("individualupdateassetitems_PleaseSelectAnItemToUpdate") %><br>
                                 <ul style="list-style-type: none">
                                    <logic:iterate id="pcv" name="<%= IndividualUpdateAssetsForm.FORM_NAME %>" property="pcvList" type="com.follett.fsc.destiny.session.cataloging.data.ProcessCopyValue">
                                        <li>
                                            <html:radio property="<%=IndividualUpdateAssetsForm.FIELD_SELECTED_COPYID_TO_UPDATE%>" value="<%=pcv.getCopyID().toString()%>"/>
                                            &nbsp;
                                            <%= pcv.getTitle() %>
                                            &nbsp;(<%= pcv.getSiteShortName() %>)
                                        </li>
                                    </logic:iterate>
                                </ul>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2">
                    <base:okButton/>&nbsp;<base:cancelButton/> 
                </td>
            </tr>        
        </base:messageBox>        
    </logic:notEmpty>

<base:outlinedTableAndTabsWithinThere id="<%=UpdateCopiesBaseForm.TABLE_MAIN%>"  borderColor="#C0C0C0" selectedTab="<%=IndividualUpdateAssetsForm.ID_TAB_INDIVIDUAL_UPDATE%>" tabs="<%=form.getAssetTabs()%>" >
        <tr>
            <td>
                <table border="0" cellspacing="0" cellpadding="2" id="<%=IndividualUpdateAssetsForm.TABLE_HEADER%>">            
                        <tr>
                            <td class="TableHeading" colspan="2">
                                Specify information to change and scan barcode...
                            </td>
                        </tr>
                        <tr>
                            <td class="FormLabel">Resource Barcode</td>
                            <td align="absBottom" nowrap class="ColRowBold"><base:showHideTag
                                    id="onUpdate" showTextOnNewLine="false">
                                    &nbsp;
                                    
                                    <logic:equal name="<%=IndividualUpdateAssetsForm.FORM_NAME%>" property="trapEnter" value="true">
                                        <span onKeyPress="return trapEnter(event);">
                                        <html:text property="<%=IndividualUpdateAssetsForm.FIELD_BARCODE%>" />
                                        </span>
                                    </logic:equal>  
                                    
                                    <logic:equal name="<%=IndividualUpdateAssetsForm.FORM_NAME%>" property="trapEnter" value="false">
                                        <html:text property="<%=IndividualUpdateAssetsForm.FIELD_BARCODE%>" />
                                    </logic:equal>  
                                    
                                        <base:genericButton
                                            src="/buttons/large/update.gif"
                                            onclick="hideElementonUpdate()"
                                            absbottom="true"
                                            name="<%= IndividualUpdateAssetsForm.BUTTON_GO %>"
                                            alt="Update" 
                                            />
                                </base:showHideTag>
                            </td>
                        </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td colspan="2">
                            <table border="0"
                                id="<%=IndividualUpdateAssetsForm.TABLE_INDIVIDUAL_UPDATE%>">
                                <logic:iterate id="dropdownsObj" name="<%=IndividualUpdateAssetsForm.FORM_NAME%>" property="dropdownList" indexId="index">
                                    <tr valign="middle">
                                        <td>
                                            <html:select name="<%=IndividualUpdateAssetsForm.FORM_NAME%>" property="dropdownList[${index}].selected" onchange="limiterTypeModified(this)" >                                            
                                                <html:optionsCollection name="dropdownsObj" property="options" value="key" label="value" />
                                            </html:select>
                                        </td>
                                        <td class="ColRowBold" align="center">
                                            &nbsp;
                                            <logic:notEqual name="<%=IndividualUpdateAssetsForm.FORM_NAME%>" property="dropdownList[${index}].selected" value="<%=IndividualUpdateAssetsForm.VALUE_INDIVIDUAL_UNDEFINED%>">
                                                to &nbsp;&nbsp;
                                            </logic:notEqual>                                            
                                        </td>
                                        
                                        
                                        <td valign="middle">
                                            <logic:equal name="<%=IndividualUpdateAssetsForm.FORM_NAME%>" property="dropdownList[${index}].selected" value="<%=IndividualUpdateAssetsForm.VALUE_INDIVIDUAL_STATUS%>">
                                                <a name="<%=IndividualUpdateAssetsForm.ANCHOR_SELECT%><%=IndividualUpdateAssetsForm.VALUE_INDIVIDUAL_STATUS%>"></a>
                                                <html:select property="<%=IndividualUpdateAssetsForm.FIELD_STATUS_ID%>">
                                                    <html:options collection="listOfStatuses" property="longID"
                                                          labelProperty="stringDesc"/>
                                                </html:select>
                                            </logic:equal>                                            
                                            
                                            <logic:equal name="<%=IndividualUpdateAssetsForm.FORM_NAME%>" property="dropdownList[${index}].selected" value="<%=IndividualUpdateAssetsForm.VALUE_INDIVIDUAL_HOME_LOCATION%>">
                                                <a name="<%=IndividualUpdateAssetsForm.ANCHOR_SELECT%><%=IndividualUpdateAssetsForm.VALUE_INDIVIDUAL_HOME_LOCATION%>"></a>
                                                 <table id="<%=IndividualUpdateAssetsForm.TABLE_LOCATION%>" border="0" cellspacing="0" cellpadding="0">
                                                    <tr>
                                                        <td valign="center" class="ColRow">
                                                            <html:select property="<%=IndividualUpdateAssetsForm.FIELD_LOCATION_ID%>">
                                                                <html:options collection="listOfHomeLocations" property="longID"
                                                                labelProperty="stringDesc"/>
                                                            </html:select>
                                                        </td>
                                                        <td valign="center" class="ColRow">
                                                            <base:spanIfAllowed permission="<%= Permission.CAT_MANAGE_LOCATIONS %>">
                                                                <base:genericButton absbottom="true" src="/buttons/large/other2.gif" name="<%=IndividualUpdateAssetsForm.BUTTON_LOCATION_OTHER%>" alt='<%= MessageHelper.formatMessage("other") %>'/>
                                                            </base:spanIfAllowed>
                                                        </td>
                                                    </tr>
                                                 </table>
                                             </logic:equal>

                                            <logic:equal name="<%=IndividualUpdateAssetsForm.FORM_NAME%>" property="dropdownList[${index}].selected" value="<%=IndividualUpdateAssetsForm.VALUE_INDIVIDUAL_CUSTODIAN%>">
                                                <a name="<%=IndividualUpdateAssetsForm.ANCHOR_SELECT%><%=IndividualUpdateAssetsForm.VALUE_INDIVIDUAL_CUSTODIAN%>"></a>
                                                    <table id="<%=IndividualUpdateAssetsForm.TABLE_CUSTODIAN%>" border="0" cellspacing="0" cellpadding="0">
                                                        <tr>
                                                            <td valign="center" class="ColRow">
                                                                <bean:write name="<%= IndividualUpdateAssetsForm.FORM_NAME %>" property="<%= IndividualUpdateAssetsForm.FIELD_CUSTODIAN_NAME %>" filter="true"/>
                                                            </td>
                                                            <td valign="center">
                                                                &nbsp;&nbsp;<base:genericButton src="/buttons/large/selectbig.gif" alt="<%= IndividualUpdateAssetsForm.ALT_TEXT_CUSTODIAN %>" name="<%= IndividualUpdateAssetsForm.BUTTON_NAME_CUSTODIAN %>" />
                                                            </td>
                                                            <logic:present name="<%= IndividualUpdateAssetsForm.FORM_NAME %>" property="<%= IndividualUpdateAssetsForm.PARAM_CUSTODIAN_ID %>">
                                                                <td valign="center">
                                                                    &nbsp;&nbsp;<base:genericButton src="/buttons/large/clear.gif" alt="<%= IndividualUpdateAssetsForm.ALT_TEXT_CUSTODIAN_CLEAR %>" name="<%= IndividualUpdateAssetsForm.BUTTON_NAME_CUSTODIAN_CLEAR %>" />
                                                                </td>   
                                                            </logic:present>
                                                        </tr>
                                                    </table>
                                             </logic:equal>

                                            <logic:equal name="<%=IndividualUpdateAssetsForm.FORM_NAME%>" property="dropdownList[${index}].selected" value="<%=IndividualUpdateAssetsForm.VALUE_INDIVIDUAL_DEPARTMENT%>">
                                                    <a name="<%=IndividualUpdateAssetsForm.ANCHOR_SELECT%><%=IndividualUpdateAssetsForm.VALUE_INDIVIDUAL_DEPARTMENT%>"></a>
                                                    <table id="<%=IndividualUpdateAssetsForm.TABLE_DEPARTMENT%>" border="0" cellspacing="0" cellpadding="0">
                                                        <tr>
                                                            <td valign="center">
                                                                <html:select property="siteDeptID">
                                                                    <html:options collection="listOfDepartments" property="longID"
                                                                    labelProperty="stringDesc"/>
                                                                </html:select>
                                                            </td>
                                                            <td valign="center">                                                                
                                                                <base:spanIfAllowed permission="<%= Permission.BACK_OFFICE_SITE_ADMINISTRATION %>">
                                                                    <base:genericButton absbottom="true" src="/buttons/large/other2.gif" name="<%=IndividualUpdateAssetsForm.BUTTON_DEPARTMENT_OTHER%>" alt='<%= MessageHelper.formatMessage("other") %>' />
                                                                </base:spanIfAllowed>
                                                            </td>
                                                        </tr>
                                                    </table>
                                            </logic:equal>
                                                    
                                            <logic:equal name="<%=IndividualUpdateAssetsForm.FORM_NAME%>" property="dropdownList[${index}].selected" value="<%=IndividualUpdateAssetsForm.VALUE_INDIVIDUAL_DISTRICT_ID%>">
                                                <a name="<%=IndividualUpdateAssetsForm.ANCHOR_SELECT%><%=IndividualUpdateAssetsForm.VALUE_INDIVIDUAL_DISTRICT_ID%>"></a>
                                                
                                               <c:choose>
                                                <c:when test='<%= form.getBarcodeFocus().equals("true") %>'>
                                                    <html:text property="<%=IndividualUpdateAssetsForm.FIELD_DISTRICT_ID%>" maxlength="50"/>
                                                </c:when>
                                                <c:otherwise>
                                                    <span onKeyPress="return trapEnter(event);">
                                                    <html:text property="<%=IndividualUpdateAssetsForm.FIELD_DISTRICT_ID%>" maxlength="50"/>
                                                    </span>
                                                </c:otherwise>
                                                </c:choose>                                                
                                            </logic:equal>
                                            
                                            <logic:equal name="<%=IndividualUpdateAssetsForm.FORM_NAME%>" property="dropdownList[${index}].selected" value="<%=IndividualUpdateAssetsForm.VALUE_INDIVIDUAL_SERIAL_NUMBER%>">
                                               <a name="<%=IndividualUpdateAssetsForm.ANCHOR_SELECT%><%=IndividualUpdateAssetsForm.VALUE_INDIVIDUAL_SERIAL_NUMBER%>"></a>
                                               <c:choose>
                                                <c:when test='<%= form.getBarcodeFocus().equals("true") %>'>
                                                    <html:text property="<%=IndividualUpdateAssetsForm.FIELD_SERIAL_NUMBER%>" maxlength="50"/>
                                                </c:when>
                                                <c:otherwise>
                                                    <span onKeyPress="return trapEnter(event);">
                                                    <html:text property="<%=IndividualUpdateAssetsForm.FIELD_SERIAL_NUMBER%>" maxlength="50"/>
                                                    </span>
                                                </c:otherwise>
                                                </c:choose>
                                            </logic:equal>
                                            
                                            <logic:equal name="<%=IndividualUpdateAssetsForm.FORM_NAME%>" property="dropdownList[${index}].selected" value="<%=IndividualUpdateAssetsForm.VALUE_INDIVIDUAL_FUNDING_SOURCE%>">
                                                    <a name="<%=IndividualUpdateAssetsForm.ANCHOR_SELECT%><%=IndividualUpdateAssetsForm.VALUE_INDIVIDUAL_FUNDING_SOURCE%>"></a>
                                                    <table id="<%=IndividualUpdateAssetsForm.TABLE_FUNDING_SOURCE%>" border="0" cellspacing="0" cellpadding="0">
                                                        <tr>
                                                            <td valign="center">
                                                                <html:select property="fundingSource">
                                                                    <html:options collection="listOfFundingSources" property="longID" labelProperty="stringDesc"/>
                                                                </html:select>
                                                            </td>
                                                            <td valign="center">
                                                                <base:spanIfAllowed permission="<%= Permission.CAT_MANAGE_ASSET_TEMPLATES %>">
                                                                    <base:genericButton absbottom="true" src="/buttons/large/other2.gif" name="<%=IndividualUpdateAssetsForm.BUTTON_FUNDING_SOURCE_OTHER%>" alt='<%= MessageHelper.formatMessage("other")%>'/>
                                                                </base:spanIfAllowed>
                                                            </td>
                                                        </tr>
                                                    </table>                                   
                                            </logic:equal>                                            
                                            

                                            <logic:equal name="<%=IndividualUpdateAssetsForm.FORM_NAME%>" property="dropdownList[${index}].selected" value="<%=IndividualUpdateAssetsForm.VALUE_INDIVIDUAL_ITEM_CATEGORY%>">
                                                    <a name="<%=IndividualUpdateAssetsForm.ANCHOR_SELECT%><%=IndividualUpdateAssetsForm.VALUE_INDIVIDUAL_ITEM_CATEGORY%>"></a>
                                                    <table id="<%=IndividualUpdateAssetsForm.TABLE_ITEM_CATEGORY%>" border="0" cellspacing="0" cellpadding="0">
                                                        <tr>
                                                            <td valign="center">
                                                                <html:select property="itemCategory">
                                                                    <html:options collection="listOfItemCategories" property="longID" labelProperty="stringDesc"/>
                                                                </html:select>
                                                            </td>
                                                            <td valign="center">
                                                                <base:genericButton absbottom="true" src="/buttons/large/other2.gif" name="<%=IndividualUpdateAssetsForm.BUTTON_ITEM_CATEGORIES_OTHER%>" alt='<%= MessageHelper.formatMessage("other")%>'/>
                                                            </td>
                                                        </tr>
                                                    </table>    
                                            </logic:equal>                                                                                        
                                            
                                            <logic:equal name="<%=IndividualUpdateAssetsForm.FORM_NAME%>" property="dropdownList[${index}].selected" value="<%=IndividualUpdateAssetsForm.VALUE_INDIVIDUAL_PURCHASE_PRICE%>">
                                                    <a name="<%=IndividualUpdateAssetsForm.ANCHOR_SELECT%><%=IndividualUpdateAssetsForm.VALUE_INDIVIDUAL_PURCHASE_PRICE%>"></a>
                                                        <span onKeyPress="return trapEnter(event);">
                                                        <html:text property="<%=IndividualUpdateAssetsForm.FIELD_PURCHASE_PRICE%>" maxlength="16"/>
                                                        </span>
                                            </logic:equal>
                                            
                                            <logic:equal name="<%=IndividualUpdateAssetsForm.FORM_NAME%>" property="dropdownList[${index}].selected" value="<%=IndividualUpdateAssetsForm.VALUE_INDIVIDUAL_DATE_ACQUIRED%>">
                                                    <a name="<%=IndividualUpdateAssetsForm.ANCHOR_SELECT%><%=IndividualUpdateAssetsForm.VALUE_INDIVIDUAL_DATE_ACQUIRED%>"></a>
                                                    <span onKeyPress="return trapEnter(event);">
                                                <base:date 
                                                        buttonName = "<%=IndividualUpdateAssetsForm.BUTTON_CHANGE_DATE_ACQUIRED%>"
                                                        fieldName = "<%=IndividualUpdateAssetsForm.FIELD_DATE_ACQUIRED%>"
                                                        dateValue = "<%=form.getDateAcquired()%>"
                                                        />
                                                    </span>                                                    
                                            </logic:equal>
                                            
                                            <logic:equal name="<%=IndividualUpdateAssetsForm.FORM_NAME%>" property="dropdownList[${index}].selected" value="<%=IndividualUpdateAssetsForm.VALUE_INDIVIDUAL_PURCHASE_ORDER%>">
                                                    <a name="<%=IndividualUpdateAssetsForm.ANCHOR_SELECT%><%=IndividualUpdateAssetsForm.VALUE_INDIVIDUAL_PURCHASE_ORDER%>"></a>
                                                    <span onKeyPress="return trapEnter(event);">
                                                        <html:text property="<%=IndividualUpdateAssetsForm.FIELD_PURCHASE_ORDER%>" maxlength="20"/>
                                                    </span>
                                            </logic:equal>
                                             
                                            <logic:equal name="<%=IndividualUpdateAssetsForm.FORM_NAME%>" property="dropdownList[${index}].selected" value="<%=IndividualUpdateAssetsForm.VALUE_INDIVIDUAL_SALVAGE_VALUE%>">
                                                    <a name="<%=IndividualUpdateAssetsForm.ANCHOR_SELECT%><%=IndividualUpdateAssetsForm.VALUE_INDIVIDUAL_SALVAGE_VALUE%>"/>
                                                    <span onKeyPress="return trapEnter(event);">
                                                        <html:text property="<%=IndividualUpdateAssetsForm.FIELD_SALVAGE_VALUE%>" maxlength="16"/>
                                                    </span>
                                            </logic:equal>
                                            
                                            <logic:equal name="<%=IndividualUpdateAssetsForm.FORM_NAME%>" property="dropdownList[${index}].selected" value="<%=IndividualUpdateAssetsForm.VALUE_INDIVIDUAL_PROJECTED_LIFE%>">
                                                    <a name="<%=IndividualUpdateAssetsForm.ANCHOR_SELECT%><%=IndividualUpdateAssetsForm.VALUE_INDIVIDUAL_PROJECTED_LIFE%>"></a>
                                                    <span onKeyPress="return trapEnter(event);">
                                                        <html:text property="<%=IndividualUpdateAssetsForm.FIELD_PROJECTED_LIFE%>" maxlength="3"/>
                                                    </span>
                                            </logic:equal>
                                            
                                            <logic:equal name="<%=IndividualUpdateAssetsForm.FORM_NAME%>" property="dropdownList[${index}].selected" value="<%=IndividualUpdateAssetsForm.VALUE_INDIVIDUAL_CONDITION%>">
                                                <a name="<%=IndividualUpdateAssetsForm.ANCHOR_SELECT%><%=IndividualUpdateAssetsForm.VALUE_INDIVIDUAL_CONDITION%>"></a>
                                                <html:select
                                                    property="<%=IndividualUpdateAssetsForm.FIELD_CONDITION_ID%>" onchange="submitOnConditionChange()">
                                                    <html:options collection="listOfItemConditions" property="longID" labelProperty="stringDesc" />
                                                </html:select>
                                                <% if (form.showConditionNote()) { %>
                                                    <span class="Instruction">* Textbooks set to this condition will not be auto-conditioned.</span>
                                                <% } %>
                                            </logic:equal>

                                        </td>
                                        
                                        
                                    </tr>
                                </logic:iterate>
                            </table>
                        </td>
                    </tr>
                    
                    <base:spanIfAllowed permission="<%= Permission.BACK_OFFICE_ADD_HISTORICAL_NOTES %>">
                        <tr>
                            <td class="ColRowBold">Add historical note</td>
                            <td valign="middle">
                                <table
                                    id="<%=IndividualUpdateAssetsForm.TABLE_HISTORICAL_NOTE%>"
                                    border="0" cellpadding="3" cellspacing="0">
                                    <tr valign="middle">
                                        <td valign="middle"><html:text
                                                property='<%= IndividualUpdateAssetsForm.FIELD_HISTORICAL_NOTE %>'
                                                maxlength="120" size="50" />
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                    </base:spanIfAllowed>                    

            </table>


    <bean:define id="recentlyUpdated" name="<%= IndividualUpdateAssetsForm.FORM_NAME %>" property="recentlyUpdatedAssetList" type="java.util.Collection"/>
     
    <logic:notEmpty name="recentlyUpdated">
    <br/>
     <TABLE id="<%=IndividualUpdateAssetsForm.TABLE_RECENTLY_UPDATED%>" border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse" bordercolor="#111111" width="100%">
        <TR>
         <TD>
         <TABLE id="<%=IndividualUpdateAssetsForm.TABLE_RECENTLY_UPDATED_HEADER%>" border="0" height="18" cellpadding="2" cellspacing="0" bordercolor="#111111" width="100%">
          <TR>
            <base:sectionHeading printerFriendly="false" heading="Most Recently Updated" tdContent=""/>
          </TR>
         </TABLE>
         </TD>
        </TR>

        <!-- kick out two <TR>s of data for each element, plus a spacer line after -->
        <%int lineCount = 1;%>
        <logic:iterate id="recentlyUpdatedRow" name="recentlyUpdated" type="com.follett.fsc.destiny.session.cataloging.data.ProcessCopyValue">
           <TR>
             <TD>
              <TABLE id="<%=IndividualUpdateAssetsForm.TABLE_RECENTLY_UPDATED_ROW + lineCount++%>" border="0" cellpadding="2" cellspacing="0" style="border-collapse: collapse" bordercolor="#111111" width="100%">

                <TR>
                   <TD width="20">&nbsp;</TD>
                   <td>
                       <span class="ColRowBold"><bean:write name="recentlyUpdatedRow" property="title"/></span>
                       <span class="SmallColRow">&nbsp;
                       (<%=form.getDistrictUserSiteNameDisplay(recentlyUpdatedRow.getSiteShortName())%>Item: 
                       <base:link showTextAlways="true" page='<%="/circulation/servlet/handlecopystatusform.do?copyList=x&searchOption=0&showFindPrompt=false&copyID="
                                    + recentlyUpdatedRow.getCopyID()%>' permission="<%=Permission.CIRC_VIEW_ITEM_STATUS%>" id="<%=IndividualUpdateAssetsForm.ID_LINK_COPY_STATUS%>">
                           <bean:write name="recentlyUpdatedRow" property="copyBarcodeDisplayable"/></base:link>)</span>
                   </TD>
                   <TD colspan="2" class="ColRowBold tdAlignRight"><bean:write name="recentlyUpdatedRow" property="callNumberOrLocation"/></TD>
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
function limiterTypeModified(a) {
    document.<%=IndividualUpdateAssetsForm.FORM_NAME%>.<%=IndividualUpdateAssetsForm.FIELD_LAST_VALUE_SELECTED%>.value = a.value;
    document.<%=IndividualUpdateAssetsForm.FORM_NAME%>.submit();    
}

window.onload = onLoad;

function onLoad()
{
	// Set focus to SerialNumber field
    var focusOnSerial = document.<%=IndividualUpdateAssetsForm.FORM_NAME%>.focusOnSerial.value;
    if(focusOnSerial == '1')
    {
        document.<%=IndividualUpdateAssetsForm.FORM_NAME%>.elements['serialNumber'].focus();

    }
    else if (focusOnSerial == '2') 
    {
        document.<%=IndividualUpdateAssetsForm.FORM_NAME%>.elements['districtID'].focus();
    }
}
function submitOnConditionChange() {
    document.<%=IndividualUpdateAssetsForm.FORM_NAME%>.submit();    
}
//-->
</script>
<jsp:include page="/circulation/setsound.jsp"/>
<logic:present name="<%=IndividualUpdateAssetsForm.FORM_NAME%>" property="soundFile" scope="request" >
<script language="JavaScript">
<!--
setSound("<bean:write name="<%=IndividualUpdateAssetsForm.FORM_NAME%>" property="soundFile"/>");
//-->
</script>
</logic:present>
