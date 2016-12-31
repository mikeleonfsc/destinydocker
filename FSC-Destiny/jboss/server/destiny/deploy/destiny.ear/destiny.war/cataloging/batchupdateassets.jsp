<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.BaseCopyLabelForm" %>
<%@ page import="com.follett.fsc.destiny.session.cataloging.data.BaseCopyJobParams" %>
<%@ page import="com.follett.fsc.destiny.util.Barcode" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.BarcodeListTag" %>
<%@ page import="com.follett.fsc.common.MessageHelper"%>

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
<html:hidden property="<%=BatchUpdateAssetsForm.PARAM_SELECT_BY_CHANGED%>" />
<html:hidden name="<%= BatchUpdateAssetsForm.FORM_NAME %>" property="<%= BatchUpdateAssetsForm.FIELD_CUSTODIAN %>"/>
<html:hidden name="<%= BatchUpdateAssetsForm.FORM_NAME %>" property="<%= BatchUpdateAssetsForm.FIELD_UPDATE_BY %>"/>
<html:hidden name="<%= BatchUpdateAssetsForm.FORM_NAME %>" property="<%= BatchUpdateAssetsForm.FIELD_SELECTED_LIST_ID %>"/>
<html:hidden name="<%= BatchUpdateAssetsForm.FORM_NAME %>" property="<%= BarcodeListTag.FIELD_BARCODE_LIST_HIDDEN %>"/>
<html:hidden name="<%= BatchUpdateAssetsForm.FORM_NAME %>" property="<%= BatchUpdateAssetsForm.PARAM_ASSET_ID %>"/>

<base:outlinedTableAndTabsWithinThere id="<%=UpdateCopiesBaseForm.TABLE_MAIN%>"  borderColor="#C0C0C0" selectedTab="<%=BatchUpdateAssetsForm.ID_TAB_BATCH_UPDATE%>" tabs="<%=form.getAssetTabs()%>" >
<tr>
    <td>
        <table border="0" cellspacing="0" cellpadding="0" width="100%" id="<%=BatchUpdateAssetsForm.TABLE_HEADER%>">
            <tr>
                <td class="TableHeading"><%=BatchUpdateAssetsForm.PAGE_TITLE_ASSET%>...</td>
                <td class="tdAlignRight">
                   <base:genericButton src="/icons/general/nextlonger.gif" alt="<%=BatchUpdateAssetsForm.ALT_NEXT%>" name="<%=BatchUpdateAssetsForm.BUTTON_NEXT%>"/>
               </td>
            </tr>
            <tr>
            	<td>&nbsp;</td>
                <td class="tdAlignRight"><base:cancelButton/></td>
            </tr>
            <tr>
                <td colspan="2" class="ColRow"><b>Step 1 of 2: </b>Specify the information to change.</td>
            </tr>
            <tr><td colspan="2">&nbsp;</td></tr>
            <tr>
               <td colspan="2">
                 <base:imageLine height="1" width="100%" />
               </td>
            </tr>
    		    <tr>
    		    	<td valign="top" class="ColRowBold tdAlignRight">Change</td>
    		    	<td>
    		    		<table id="<%=BatchUpdateAssetsForm.TABLE_OPTIONS%>" border="0" cellpadding="3" cellspacing="0">
                            <!-- Asset Description -->
                            <tr>
                                <td class="ColRowBold" valign="middle"><html:checkbox property="<%= BatchUpdateAssetsForm.FIELD_CHANGE_DESCRIPTION %>">&nbsp;Resource Description&nbsp;to</html:checkbox></td>
                                <td valign="middle"><%= form.buildModifierTypeHTML(BaseCopyJobParams.OPTION_ASSET_DESCRIPTION) %></td>
                            </tr>
                            <!-- Condition -->
                            <tr>
                                <td class="ColRowBold" valign="middle"><html:checkbox property="<%= BatchUpdateAssetsForm.FIELD_CHANGE_CONDITION %>">&nbsp;Condition&nbsp;to</html:checkbox></td>
                                <td valign="middle"><%= form.buildModifierTypeHTML(BaseCopyJobParams.OPTION_CONDITION) %><base:image height="27" src="/../icons/general/spacer.gif" /></td>
                            </tr>
    		    			<!-- Custodian -->
    		    			<tr>
    		    				<td class="ColRowBold" valign="middle"><html:checkbox property="<%= BatchUpdateAssetsForm.FIELD_CHANGE_CUSTODIAN %>">&nbsp;Custodian&nbsp;to</html:checkbox></td>
    		    				<td valign="middle"><%= form.buildModifierTypeHTML(BaseCopyJobParams.OPTION_CUSTODIAN) %></td>
    		    			</tr>
                            <!-- Date Acquired -->
                            <tr>
                                <td class="ColRowBold" valign="middle"><html:checkbox property="<%= BatchUpdateAssetsForm.FIELD_CHANGE_DATE_ACQUIRED %>">&nbsp;Date Acquired&nbsp;to</html:checkbox></td>
                                <td valign="middle">
                                <base:date 
                                        buttonName = "<%=BatchUpdateAssetsForm.BUTTON_CHANGE_DATE_ACQUIRED%>"
                                        fieldName = "<%=BatchUpdateAssetsForm.FIELD_DATE_ACQUIRED%>"
                                        dateValue = "<%=form.getDateAcquired()%>"
                                        /> 
                                <base:image height="27" src="/../icons/general/spacer.gif" />
                                </td>                                
                            </tr>
    		    			<!--  Department -->
    		    			<logic:equal name="<%=BatchUpdateAssetsForm.FORM_NAME%>" property="<%=BatchUpdateAssetsForm.PARAM_DISTRICT_USER%>" value="false">
	    		    			<tr>
	    		    				<td class="ColRowBold" valign="middle"><html:checkbox property="<%= BatchUpdateAssetsForm.FIELD_CHANGE_DEPARTMENT %>">&nbsp;Department&nbsp;to</html:checkbox></td>
	    		    				<td valign="middle">
                                        <%= form.buildModifierTypeHTML(BaseCopyJobParams.OPTION_DEPARTMENT) %>
                                        <base:spanIfAllowed permission="<%= Permission.BACK_OFFICE_SITE_ADMINISTRATION %>">
                                            &nbsp;
                                            <base:genericButton absbottom="true" src="/buttons/large/other2.gif" name="<%=BatchUpdateAssetsForm.BUTTON_DEPARTMENT_OTHER%>" alt='<%= MessageHelper.formatMessage("other") %>'/>
                                        </base:spanIfAllowed>
                                        <base:image height="27" src="/../icons/general/spacer.gif" />
                                    </td>                                    
	    		    			</tr>
    		    			</logic:equal>
                            <!-- Funding Source -->
                            <tr>
                                <td class="ColRowBold" valign="middle"><html:checkbox property="<%= BatchUpdateAssetsForm.FIELD_CHANGE_FUNDING_SOURCE %>">&nbsp;Funding Source&nbsp;to</html:checkbox></td>
                                <td valign="middle">
                                    <%= form.buildModifierTypeHTML(BaseCopyJobParams.OPTION_FUNDING_SOURCE) %>
                                    <base:spanIfAllowed permission="<%= Permission.CAT_MANAGE_ASSET_TEMPLATES %>">
                                        &nbsp;
                                        <base:genericButton absbottom="true" src="/buttons/large/other2.gif" name="<%=BatchUpdateAssetsForm.BUTTON_FUNDING_SOURCE_OTHER%>" alt='<%= MessageHelper.formatMessage("other") %>'/>
                                    </base:spanIfAllowed>
                                    <base:image height="27" src="/../icons/general/spacer.gif" />
                                </td>
                            </tr>
    		    			<!-- Home Location -->
    		    			<logic:equal name="<%=BatchUpdateAssetsForm.FORM_NAME%>" property="<%=BatchUpdateAssetsForm.PARAM_DISTRICT_USER%>" value="false">
	    		    			<tr>
	    		    				<td class="ColRowBold" valign="middle"><html:checkbox property="<%= BatchUpdateAssetsForm.FIELD_CHANGE_LOCATION %>">&nbsp;Home Location&nbsp;to</html:checkbox></td>
	    		    				<td valign="middle">
                                        <%= form.buildModifierTypeHTML(BaseCopyJobParams.OPTION_HOME_LOCATION) %>
                                        <base:spanIfAllowed permission="<%= Permission.CAT_MANAGE_LOCATIONS %>">
                                            &nbsp;
                                            <base:genericButton absbottom="true" src="/buttons/large/other2.gif" name="<%=BatchUpdateAssetsForm.BUTTON_LOCATION_OTHER%>" alt='<%= MessageHelper.formatMessage("other") %>'/>
                                        </base:spanIfAllowed>
                                        <base:image height="27" src="/../icons/general/spacer.gif" />
                                    </td>
                                    
	    		    			</tr>
    		    			</logic:equal>
                            <!-- Item Category -->
                            <logic:equal name="<%=BatchUpdateAssetsForm.FORM_NAME%>" property="<%=BatchUpdateAssetsForm.PARAM_DISTRICT_USER%>" value="false">
                                <base:spanIfAllowed permission="<%= Permission.CAT_CREATE_ASSIGN_CATEGORIES_ASSET %>">
                                    <tr>
                                        <td class="ColRowBold" valign="middle"><html:checkbox property="<%= BatchUpdateAssetsForm.FIELD_CHANGE_ITEM_CATEGORIES %>">&nbsp;Item Category&nbsp;to</html:checkbox></td>
                                        <td valign="middle">
                                            <%= form.buildModifierTypeHTML(BaseCopyJobParams.OPTION_ITEM_CATEGORIES) %>
                                            &nbsp;
                                            <base:genericButton absbottom="true" src="/buttons/large/other2.gif" name="<%=BatchUpdateAssetsForm.BUTTON_ITEM_CATEGORIES_OTHER%>" alt='<%= MessageHelper.formatMessage("other") %>'/>
                                            <base:image height="27" src="/../icons/general/spacer.gif" />
                                        </td>
                                    </tr>
                                </base:spanIfAllowed>
                            </logic:equal>
                            <!-- Projected Life-->
                            <tr>
                                <td class="ColRowBold" valign="middle"><html:checkbox property="<%= BatchUpdateAssetsForm.FIELD_CHANGE_PROJECTED_LIFE%>">&nbsp;Projected Life&nbsp;to</html:checkbox></td>
                                <td class="ColRowBold" valign="middle"><%= form.buildModifierTypeHTML(BaseCopyJobParams.OPTION_PROJECTED_LIFE) %><base:image height="27" src="/../icons/general/spacer.gif" /></td>
                            </tr>
                            <!-- Purchase Order -->
                            <tr>
                                <td class="ColRowBold" valign="middle"><html:checkbox property="<%= BatchUpdateAssetsForm.FIELD_CHANGE_PURCHASE_ORDER %>">&nbsp;Purchase Order&nbsp;to</html:checkbox></td>
                                <td valign="middle"><%= form.buildModifierTypeHTML(BaseCopyJobParams.OPTION_PURCHASE_ORDER) %><base:image height="27" src="/../icons/general/spacer.gif" /></td>
                            </tr>
                            <!-- Purchase Price -->
                            <tr>
                                <td class="ColRowBold" valign="middle"><html:checkbox property="<%= BatchUpdateAssetsForm.FIELD_CHANGE_PURCHASE_PRICE %>">&nbsp;Purchase Price&nbsp;to</html:checkbox></td>
                                <td valign="middle"><%= form.buildModifierTypeHTML(BaseCopyJobParams.OPTION_PURCHASE_PRICE) %><base:image height="27" src="/../icons/general/spacer.gif" /></td>
                            </tr>
                            <!-- Salvage Value -->
                            <tr>
                                <td class="ColRowBold" valign="middle"><html:checkbox property="<%= BatchUpdateAssetsForm.FIELD_CHANGE_SALVAGE_VALUE%>">&nbsp;Salvage Value&nbsp;to</html:checkbox></td>
                                <td valign="middle"><%= form.buildModifierTypeHTML(BaseCopyJobParams.OPTION_SALVAGE_VALUE) %><base:image height="27" src="/../icons/general/spacer.gif" /></td>
                            </tr>
    		    			<!--  Status -->
    		    			<tr>
    		    				<td class="ColRowBold" valign="middle"><html:checkbox property="<%= BatchUpdateAssetsForm.FIELD_CHANGE_STATUS %>">&nbsp;Status&nbsp;to</html:checkbox></td>
    		    				<td valign="middle"><%= form.buildModifierTypeHTML(BaseCopyJobParams.OPTION_STATUS) %><base:image height="27" src="/../icons/general/spacer.gif" /></td>
    		    			</tr>
                            
    		    		</table>
    		    	</td>
    		    </tr>

    		    <tr>
    		        <td colspan="2">
    		        <base:imageLine height="1" width="100%" />
    		        </td>
    		    </tr>

            <base:spanIfAllowed permission="<%= Permission.BACK_OFFICE_ADD_HISTORICAL_NOTES %>">
				<tr>
	    		    <td class="ColRowBold tdAlignRight">Add historical note</td>
	    		    <td>
	   		    		<table id="<%=BatchUpdateAssetsForm.TABLE_HISTORICAL_NOTE%>" border="0" cellpadding="3" cellspacing="0">
	   		    			<tr>
					            <td>
					                &nbsp;<html:text property='<%= BatchUpdateAssetsForm.FIELD_HISTORICAL_NOTE %>' maxlength="120" size="70"/>
					            </td>
					        </tr>
					    </table>
				    </td>
				</tr>

    		</base:spanIfAllowed>

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

