<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.BaseCopyLabelForm" %>
<%@ page import="com.follett.fsc.destiny.session.cataloging.data.BaseCopyJobParams" %>
<%@ page import="com.follett.fsc.destiny.util.Barcode" %>

<%@ page import="com.follett.fsc.destiny.util.Permission" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    BatchUpdateAssetsForm form = (BatchUpdateAssetsForm)request.getAttribute(BatchUpdateAssetsForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true"/>
<base:form action="/cataloging/servlet/handlebatchupdateassetsform.do" enctype="multipart/form-data">

<html:hidden property="<%=BatchUpdateAssetsForm.PARAM_PAGE_NUMBER%>"/>
<html:hidden property="<%=BatchUpdateAssetsForm.PARAM_SELECT_BY_CHANGED%>" value="false"/>
<html:hidden name="<%= BatchUpdateAssetsForm.FORM_NAME %>" property="<%= BatchUpdateAssetsForm.FIELD_CHANGE_DEPARTMENT %>"/>
<html:hidden name="<%= BatchUpdateAssetsForm.FORM_NAME %>" property="<%= BatchUpdateAssetsForm.FIELD_CHANGE_CUSTODIAN %>"/>
<html:hidden name="<%= BatchUpdateAssetsForm.FORM_NAME %>" property="<%= BatchUpdateAssetsForm.FIELD_CHANGE_STATUS %>"/>
<html:hidden name="<%= BatchUpdateAssetsForm.FORM_NAME %>" property="<%= BatchUpdateAssetsForm.FIELD_CHANGE_LOCATION %>"/>
<html:hidden name="<%= BatchUpdateAssetsForm.FORM_NAME %>" property="<%= BatchUpdateAssetsForm.FIELD_HISTORICAL_NOTE %>"/>
<html:hidden name="<%= BatchUpdateAssetsForm.FORM_NAME %>" property="<%= BatchUpdateAssetsForm.PARAM_ASSET_ID %>"/>
<html:hidden name="<%= BatchUpdateAssetsForm.FORM_NAME %>" property="<%= BatchUpdateAssetsForm.FIELD_CHANGE_DESCRIPTION %>"/>
<html:hidden name="<%= BatchUpdateAssetsForm.FORM_NAME %>" property="<%= BatchUpdateAssetsForm.FIELD_CHANGE_CONDITION %>"/>
<html:hidden name="<%= BatchUpdateAssetsForm.FORM_NAME %>" property="<%= BatchUpdateAssetsForm.FIELD_CHANGE_FUNDING_SOURCE %>"/>
<html:hidden name="<%= BatchUpdateAssetsForm.FORM_NAME %>" property="<%= BatchUpdateAssetsForm.FIELD_CHANGE_ITEM_CATEGORIES %>"/>
<html:hidden name="<%= BatchUpdateAssetsForm.FORM_NAME %>" property="<%= BatchUpdateAssetsForm.FIELD_CHANGE_PURCHASE_PRICE %>"/>
<html:hidden name="<%= BatchUpdateAssetsForm.FORM_NAME %>" property="<%= BatchUpdateAssetsForm.FIELD_CHANGE_DATE_ACQUIRED%>"/>
<html:hidden name="<%= BatchUpdateAssetsForm.FORM_NAME %>" property="<%= BatchUpdateAssetsForm.FIELD_CHANGE_PURCHASE_ORDER%>"/>
<html:hidden name="<%= BatchUpdateAssetsForm.FORM_NAME %>" property="<%= BatchUpdateAssetsForm.FIELD_CHANGE_SALVAGE_VALUE %>"/>
<html:hidden name="<%= BatchUpdateAssetsForm.FORM_NAME %>" property="<%= BatchUpdateAssetsForm.FIELD_CHANGE_PROJECTED_LIFE %>"/>

<html:hidden name="<%= BatchUpdateAssetsForm.FORM_NAME %>" property="<%= BatchUpdateAssetsForm.FIELD_CUSTODIAN %>"/>
<html:hidden name="<%= BatchUpdateAssetsForm.FORM_NAME %>" property="<%= BatchUpdateAssetsForm.FIELD_DEPARTMENT %>"/>
<html:hidden name="<%= BatchUpdateAssetsForm.FORM_NAME %>" property="<%= BatchUpdateAssetsForm.FIELD_LOCATION %>"/>
<html:hidden name="<%= BatchUpdateAssetsForm.FORM_NAME %>" property="<%= BatchUpdateAssetsForm.FIELD_STATUS %>"/>
<html:hidden name="<%= BatchUpdateAssetsForm.FORM_NAME %>" property="<%= BatchUpdateAssetsForm.FIELD_CONDITION %>"/>
<html:hidden name="<%= BatchUpdateAssetsForm.FORM_NAME %>" property="<%= BatchUpdateAssetsForm.FIELD_FUNDING_SOURCE %>"/>
<html:hidden name="<%= BatchUpdateAssetsForm.FORM_NAME %>" property="<%= BatchUpdateAssetsForm.FIELD_ITEM_CATEGORY%>"/>
<html:hidden name="<%= BatchUpdateAssetsForm.FORM_NAME %>" property="<%= BatchUpdateAssetsForm.FIELD_PURCHASE_PRICE %>"/>
<html:hidden name="<%= BatchUpdateAssetsForm.FORM_NAME %>" property="<%= BatchUpdateAssetsForm.FIELD_DATE_ACQUIRED%>"/>
<html:hidden name="<%= BatchUpdateAssetsForm.FORM_NAME %>" property="<%= BatchUpdateAssetsForm.FIELD_PURCHASE_ORDER%>"/>
<html:hidden name="<%= BatchUpdateAssetsForm.FORM_NAME %>" property="<%= BatchUpdateAssetsForm.FIELD_SALVAGE_VALUE%>"/>
<html:hidden name="<%= BatchUpdateAssetsForm.FORM_NAME %>" property="<%= BatchUpdateAssetsForm.FIELD_PROJECTED_LIFE%>"/>


<base:outlinedTableAndTabsWithinThere id="<%=UpdateCopiesBaseForm.TABLE_MAIN%>"  borderColor="#C0C0C0" selectedTab="<%=BatchUpdateAssetsForm.ID_TAB_BATCH_UPDATE%>" tabs="<%=form.getAssetTabs()%>" >
<tr>
    <td>
        <table border="0" cellspacing="0" cellpadding="0" width="100%" id="<%=BatchUpdateAssetsForm.TABLE_HEADER%>">
            <tr>
                <td class="TableHeading"><%=BatchUpdateAssetsForm.PAGE_TITLE_ASSET%>...</td>
                <td class="tdAlignRight">
                   <base:genericButton src="/icons/general/previouslonger.gif" alt="<%=BatchUpdateAssetsForm.ALT_PREV%>" name="<%=BatchUpdateAssetsForm.BUTTON_PREV%>"/>
               </td>
            </tr>
            <tr>
            	<td>&nbsp;</td>
                <td class="tdAlignRight"><base:cancelButton/></td>
            </tr>
            <tr>
                <td colspan="2" class="ColRow"><b>Step 2 of 2: </b>Create list of items to update.</td>
            </tr>
            <tr>
                <td class="ColRowBold tdAlignRight">Select&nbsp;by&nbsp;&nbsp;</td>
                <td class="ColRowBold">
                    <base:spanIfAllowed permission="<%=Permission.CAT_ACCESS_BOOKLIST_ASSET%>">
	                    <html:select property="<%=BatchUpdateAssetsForm.FIELD_UPDATE_BY%>" onchange="submitDropDown()"
	                        ><html:option value='<%= "" +BatchUpdateAssetsForm.UPDATE_BY_BARCODE%>'>Barcode List</html:option>
	                         <html:option value='<%= "" +BatchUpdateAssetsForm.UPDATE_BY_LIST%>'>List</html:option>
	                    </html:select>
                        &nbsp;
                        <logic:equal name="<%=BatchUpdateAssetsForm.FORM_NAME%>" property="<%=BatchUpdateAssetsForm.FIELD_UPDATE_BY%>" value='<%= "" +BatchUpdateAssetsForm.UPDATE_BY_LIST%>'>
                            <base:myListSelect 
                                name="<%=BatchUpdateAssetsForm.FIELD_SELECTED_LIST_ID%>" 
                                selectedMyListID="<%=form.getSelectedListID() %>" 
                                prompt="" 
                                publicList="false" 
                                submitOnChange="false" />
                        </logic:equal>
                        <logic:notEqual name="<%=BatchUpdateAssetsForm.FORM_NAME%>" property="<%=BatchUpdateAssetsForm.FIELD_UPDATE_BY%>" value='<%= "" +BatchUpdateAssetsForm.UPDATE_BY_LIST%>'>
                            <html:hidden name="<%=BatchUpdateAssetsForm.FORM_NAME%>" property="<%=BatchUpdateAssetsForm.FIELD_SELECTED_LIST_ID%>"/>
                        </logic:notEqual>
                    </base:spanIfAllowed>
                    <base:spanIfNotAllowed permission="<%=Permission.CAT_ACCESS_BOOKLIST_ASSET%>">
                        <html:hidden property="<%=BatchUpdateAssetsForm.FIELD_UPDATE_BY%>" value='<%= "" +BatchUpdateAssetsForm.UPDATE_BY_BARCODE%>'/>
                    	Barcode
                    </base:spanIfNotAllowed>
                </td>
            </tr>
                
            <logic:equal name="<%=BatchUpdateAssetsForm.FORM_NAME%>" property="<%=BatchUpdateAssetsForm.FIELD_UPDATE_BY%>" value='<%= "" +BatchUpdateAssetsForm.UPDATE_BY_LIST%>'>
                <base:spanIfAllowed permission="<%=Permission.CAT_ACCESS_BOOKLIST_ASSET%>">
                    <tr>
                        <td>&nbsp;</td>
                        <td>
                            <base:genericButton src="/buttons/large/viewlist.gif" absbottom="true"
            			     	alt="View List"
            				    name="<%= BatchUpdateAssetsForm.BUTTON_VIEW_LIST %>" />
                        </td>
                    </tr>
                </base:spanIfAllowed>
            </logic:equal>
            
		    <tr>
		        <td colspan="2">
		        <base:imageLine height="1" width="100%" />
		        </td>
		    </tr>
            <logic:equal name="<%=BatchUpdateAssetsForm.FORM_NAME%>" property="<%=BatchUpdateAssetsForm.FIELD_UPDATE_BY%>" value='<%= "" +BatchUpdateAssetsForm.UPDATE_BY_BARCODE%>'>
                <tr>
                <td>&nbsp;</td>
                <td>
                   <base:barcodeList 
                       formName="<%=BatchUpdateAssetsForm.FORM_NAME%>"
                       barcodeType="<%=Barcode.BARCODETYPE_ASSET_ITEM%>"/>
                </td>
                </tr>

    		    <tr>
    		        <td colspan="2">
    		        <base:imageLine height="1" width="100%" />
    		        </td>
    		    </tr>
    		</logic:equal>    		                

            <tr valign="top">
                <td valign="top" colspan="2" align="center" class="ColRowBold">
                    <%= GenericForm.getLastBackupDisplayMsg(true) %>
                </td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRowBold" colspan="2">
                    <base:showHideTag id="hideIt">
					<base:genericButton onclick="hideElementhideIt()" src="/buttons/large/update.gif" name="<%=BatchUpdateAssetsForm.BUTTON_UPDATE_COPIES%>" alt="<%=BatchUpdateAssetsForm.BUTTON_UPDATE_COPIES_ALT_TEXT%>"/>
                    </base:showHideTag>
                </td>
            </tr>
        </table>

    </td>
</tr>
</base:outlinedTableAndTabsWithinThere>
</base:form>

<script language="JavaScript" type="text/javascript">
      <!--
        function submitDropDown() {
                document.<%=BatchUpdateAssetsForm.FORM_NAME%>.<%=BatchUpdateAssetsForm.PARAM_SELECT_BY_CHANGED%>.value = "true";
                document.<%=BatchUpdateAssetsForm.FORM_NAME%>.submit();
        }
      // -->
</script>

