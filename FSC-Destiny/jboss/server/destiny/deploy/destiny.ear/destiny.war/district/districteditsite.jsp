<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.*" %>
<%@ page import="com.follett.fsc.destiny.session.district.ejb.ConfigDistrictFacadeSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.common.lookup.BooleanStringValue" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.ConfigSiteSpecs" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.SiteTypeSpecs" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="org.apache.struts.action.ActionErrors" %>
<%@ page import="org.apache.struts.Globals" %>

<%@page import="org.apache.struts.taglib.TagUtils"%>
<%@page import="org.apache.struts.action.ActionMessages"%>
<%@page import="com.follett.fsc.common.LocaleHelper"%>

<base:messageBox strutsErrors="true"/>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    DistrictEditSiteForm form = (DistrictEditSiteForm)request.getAttribute(DistrictEditSiteForm.FORM_NAME);
    boolean isInternationalProduct = LocaleHelper.isInternationalProduct();
%>

<base:form action="/district/servlet/handledistricteditsiteform.do" enctype="multipart/form-data" focus="<%=DistrictEditSiteForm.FIELD_SITE_NAME%>" method="post">
    <html:hidden property="siteID" />
    <html:hidden property="addSite" />
    <html:hidden property="breadcrumbText" />
    <html:hidden property="previewFileName" />
    <html:hidden property="currentLogoFileName" />
    <html:hidden property="clearLogoOnSave" />
    <html:hidden property="resubmittingToSelf" />
    <html:hidden property="mediaCollection" />
    <html:hidden property="media" />
    <html:hidden property="prevCustomerNumber" />    
    <html:hidden property="districtWarehouse" />    
    <input type="hidden" name="<%=DistrictEditSiteForm.PRODUCT_CHANGE_SUBMIT%>" value="false"/>
    
    
<script language="JavaScript" type="text/javascript">
  <!--
    function submitDropDown() {
            document.<%=DistrictEditSiteForm.FORM_NAME%>.<%=DistrictEditSiteForm.PRODUCT_CHANGE_SUBMIT%>.value = "true";
            document.<%=DistrictEditSiteForm.FORM_NAME%>.submit();
            hideElementhideSave();
    }
  // -->
</script>
    

<%-- Confirmation for adding a Media Booking site --%>
<%
    ActionMessages errors = TagUtils.getInstance().getActionMessages(pageContext, Globals.ERROR_KEY);
    if ((errors == null || errors.size() == 0) && form.isMediaBookingSiteAdd()) { 
%>
    <base:messageBox showRedBorder="true">
    <tr>
        <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
        <td valign="baseline" class="Error">
            <p align="center"><%= form.getMediaCollectionSiteTypeName() %> sites are used as media-booking repositories for the district.</p>
            <p align="center">Are you certain you want to add a <%= form.getMediaCollectionSiteTypeName() %> site?</p>
            <div align="center">
            	<base:yesNo 
                        buttonYesName="<%=DistrictEditSiteForm.BUTTON_CONFIRM_ADD_YES%>"
                        buttonNoName="<%=DistrictEditSiteForm.BUTTON_CONFIRM_ADD_NO%>"
                />
            </div>
        <html:hidden property="<%=DistrictEditSiteForm.PARAM_BUTTONPRESSEDONCONFIRM%>" />
        </td>
    </tr>
    </base:messageBox>
<%
    }
%>
<script language="javascript" type="text/javascript">
//<!--
function submitRPS() {
	document.forms["<%= DistrictEditSiteForm.FORM_NAME %>"].<%= BaseDestinyServicesForm.PARAM_CHECKBOX_RPS %>.value = "true";
    document.forms["<%= DistrictEditSiteForm.FORM_NAME %>"].submit();
}
//-->
</script>
        

<table border="0" cellspacing="0" cellpadding="3" align="center">
<tr>
    <td>
        <base:outlinedTable borderColor="#c0c0c0" id="<%=DistrictEditSiteForm.TABLE_SITE%>" width="100%">
        <tr>
            <td class="FormLabel tdAlignRight">
                Site&nbsp;Name
            </td>
            <td colspan="2">
              <html:text property="<%=DistrictEditSiteForm.FIELD_SITE_NAME%>" size="30" maxlength="80"/>
            </td>
        </tr>

        <% if (!isInternationalProduct) { %>
        <tr>
            <td class="FormLabel tdAlignRight">
                State&nbsp;School&nbsp;ID
            </td>
            <td colspan="2">
              <html:text property="<%=DistrictEditSiteForm.FIELD_SITE_STATE_IDENTIFIER%>" size="30" maxlength="50"/>
            </td>
        </tr>
        <% } %>
        
        <tr> 
            <td class="FormLabel tdAlignRight">
                Short&nbsp;Name
            </td>
            <td colspan="2">
                <html:text property="<%=DistrictEditSiteForm.FIELD_SHORT_NAME %>" size="<%=Integer.toString(ConfigSiteSpecs.MAX_SIZE_SITE_SHORT_NAME)%>" maxlength="<%=Integer.toString(ConfigSiteSpecs.MAX_SIZE_SITE_SHORT_NAME)%>"/>
                <% if(!form.isAddSite()) { %>
                 <base:genericButton src="/buttons/large/aliases.gif" name="<%= DistrictEditSiteForm.BUTTON_ALIAS %>" alt="Aliases" absbottom="true"/>
                 <base:helpTag helpFileName="d_alias_district.htm"/>
                <% } else { %>
                &nbsp;<span class="FormLabel tdAlignRight">Alias</span>&nbsp;
                <html:text property="<%=DistrictEditSiteForm.FIELD_ALIAS %>" size="<%=Integer.toString(ConfigSiteSpecs.MAX_SIZE_SITE_SHORT_NAME)%>" maxlength="<%=Integer.toString(ConfigSiteSpecs.MAX_SIZE_SITE_SHORT_NAME)%>"/>
                <% } %>
            </td>
        </tr>
        
        <% if(!form.isAddSite() && !form.isSiteAMediaSite() && !isInternationalProduct && !form.isDistrictWarehouse()) { %>
	        <tr>
                <td class="FormLabel tdAlignRight" valign="middle">
			        Products Installed
			    </td>
			  	<td nowrap="nowrap" colspan="2">
                    <table id="<%=DistrictEditSiteForm.TABLE_PRODUCT_INSTALLED%>" cellpadding="3" cellspacing="0" border="0">
                    <tr>
                    <td valign="top"><%=form.getProductsInstalledLabel()%>
                    </td>
                    <td class="ColRow" valign="top">
                        <% if(form.isBarcodeFilteringEnabled()){ %>            
                            <base:genericButton src="/buttons/large/barcodes.gif" name="<%= DistrictEditSiteForm.BUTTON_BARCODES %>" alt="Barcode Filtering" absbottom="true"/>
                        <% } %>
                    </td>
                    </tr>
                    </table>
			    </td>
	        </tr>
	     <% } %>
        
        <% if (isInternationalProduct ||
            !form.isOriginallyLibraryManager() ||
            !form.isOriginallyTextbookManager() ||
            !form.isOriginallyAssetManager()) { %>
        <tr> 
            <td class="FormLabel tdAlignRight" nowrap>
                <% if (!isInternationalProduct) { %>
				<% if(form.isSiteAMediaSite() || form.isDistrictWarehouse()) { %>
                	Product Type
                <% } else if( !form.isAddSite() ) { %>
                	Add
                <% } else { %>
                	Products
                <% } %>
                <% } else { %>
                    Product
                <% } %>
            </td>
            <td colspan="2">
                <logic:equal name="<%= DistrictEditSiteForm.FORM_NAME %>" property="siteAMediaSite" value="true">
                <table id="<%=DistrictEditSiteForm.TABLE_PRODUCT_INSTALLED%>" cellpadding="3" cellspacing="0" border="0">
                <tr>
                <td class="ColRow">
                Media Manager
                <html:hidden property="<%=DistrictEditSiteForm.FIELD_LIBRARY_MANAGER%>" value="true" />
                <html:hidden property="<%=DistrictEditSiteForm.FIELD_TEXTBOOK_MANAGER%>" value="false" />
                <html:hidden property="<%=DistrictEditSiteForm.FIELD_ASSET_MANAGER%>" value="false" />
                </td>
                <td class="ColRow">
                    <% if(form.isBarcodeFilteringEnabled()){ %>            
                        <base:genericButton src="/buttons/large/barcodes.gif" name="<%= DistrictEditSiteForm.BUTTON_BARCODES %>" alt="Barcode Filtering" absbottom="true"/>
                    <% } %>
                </td>
                </tr>
                </table>
                </logic:equal>
                
                <logic:equal name="<%= DistrictEditSiteForm.FORM_NAME %>" property="districtWarehouse" value="true">
                    <table id="<%=DistrictEditSiteForm.TABLE_PRODUCT_INSTALLED%>" cellpadding="3" cellspacing="0" border="0">
                        <tr>
                            <td>
                               <span class="ColRow">
                                <% if(form.isTextbookManagerAllowed() && !form.isOriginallyTextbookManager()) { %>
                                    <html:checkbox property="<%= DistrictEditSiteForm.FIELD_TEXTBOOK_MANAGER %>"  onclick="submitDropDown()">Textbook Manager</html:checkbox><br>
                                <% } else if (!form.isTextbookManagerAllowed()) { %>
                                    <html:checkbox disabled="true" property="<%= DistrictEditSiteForm.FIELD_TEXTBOOK_MANAGER %>">Textbook Manager *</html:checkbox><br>
                                    </span><span class="Instruction">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;* Unable to add Textbook Manager. Textbook Resources already exist.</span><span class="ColRow">
                                    <br>
                                <% } else { %>
                                    <html:hidden property="<%=DistrictEditSiteForm.FIELD_TEXTBOOK_MANAGER%>"/>Textbook Manager<br>
                                <% } %>
                                <% if(!form.isOriginallyAssetManager()) { %>
                                    <html:checkbox property="<%= DistrictEditSiteForm.FIELD_ASSET_MANAGER %>" onclick="submitDropDown()">Resource Manager</html:checkbox>
                                <% } else { %>
                                    <html:hidden property="<%=DistrictEditSiteForm.FIELD_ASSET_MANAGER%>"/>Resource Manager
                                <% } %>
                                <html:hidden property="<%=DistrictEditSiteForm.FIELD_LIBRARY_MANAGER%>" value="false" />
                                </span>
                            </td>
                            <td class="ColRow">
                                <% if(form.isBarcodeFilteringEnabled()){ %>            
                                    <base:genericButton src="/buttons/large/barcodes.gif" name="<%= DistrictEditSiteForm.BUTTON_BARCODES %>" alt="Barcode Filtering" absbottom="true"/>
                                <% } %>
                            </td>
                        </tr>
                    </table>
                </logic:equal>
                
                <span class="ColRow">
                <% if ((!form.isSiteAMediaSite()) && (!form.isDistrictWarehouse())) { %>
                    <% if (!isInternationalProduct) { %>
					<% if(!form.isOriginallyLibraryManager()) { %>
						<html:checkbox property="<%= DistrictEditSiteForm.FIELD_LIBRARY_MANAGER %>"  onclick="submitDropDown()">Library Manager</html:checkbox><br>
				    <% } else { %>
                	 	<html:hidden property="<%=DistrictEditSiteForm.FIELD_LIBRARY_MANAGER%>"/>
				    <% } %>

                    <% if(form.isTextbookManagerAllowed()) { %>
    					<% if(!form.isOriginallyTextbookManager()) { %>
    						<html:checkbox property="<%= DistrictEditSiteForm.FIELD_TEXTBOOK_MANAGER %>" onclick="submitDropDown()">Textbook Manager</html:checkbox><br>
    				    <% } else { %>
                    	 	<html:hidden property="<%=DistrictEditSiteForm.FIELD_TEXTBOOK_MANAGER%>"/>
                        <% } %>
                    <% } else { %>
                        <html:hidden property="<%=DistrictEditSiteForm.FIELD_TEXTBOOK_MANAGER%>"/>
                        &nbsp;&nbsp;&nbsp;&nbsp;Textbook Manager *
                        <br></span><span class="Instruction">* Unable to add Textbook Manager. Textbook Resources already exist.</span><span class="ColRow">
                        <br>
                    <% } %>

					<% if(!form.isOriginallyAssetManager()) { %>
						<html:checkbox property="<%= DistrictEditSiteForm.FIELD_ASSET_MANAGER %>" onclick="submitDropDown()">Resource Manager</html:checkbox>
				    <% } else { %>
                	 	<html:hidden property="<%=DistrictEditSiteForm.FIELD_ASSET_MANAGER%>"/>
				    <% } %>
                    <% } else { %>
                        Library Manager
                        <html:hidden property="<%=DistrictEditSiteForm.FIELD_LIBRARY_MANAGER%>" value="true" />
                        <html:hidden property="<%=DistrictEditSiteForm.FIELD_TEXTBOOK_MANAGER%>" value="false" />
                        <html:hidden property="<%=DistrictEditSiteForm.FIELD_ASSET_MANAGER%>" value="false" />
                    <% } %>
            	 	<html:hidden property="<%=DistrictEditSiteForm.FIELD_ORIGINALLY_LIBRARY_MANAGER%>"/>
	        	 	<html:hidden property="<%=DistrictEditSiteForm.FIELD_ORIGINALLY_TEXTBOOK_MANAGER%>"/>
            	 	<html:hidden property="<%=DistrictEditSiteForm.FIELD_ORIGINALLY_ASSET_MANAGER%>"/>
                <% } %>
                </span>
            </td>
        </tr>
        <% } else { %>
       	 	<html:hidden property="<%=DistrictEditSiteForm.FIELD_ORIGINALLY_LIBRARY_MANAGER%>"/>
    	 	<html:hidden property="<%=DistrictEditSiteForm.FIELD_ORIGINALLY_TEXTBOOK_MANAGER%>"/>
    	 	<html:hidden property="<%=DistrictEditSiteForm.FIELD_ORIGINALLY_ASSET_MANAGER%>"/>
        	<html:hidden property="<%=DistrictEditSiteForm.FIELD_LIBRARY_MANAGER%>"/>
      	 	<html:hidden property="<%=DistrictEditSiteForm.FIELD_TEXTBOOK_MANAGER%>"/>
       	 	<html:hidden property="<%=DistrictEditSiteForm.FIELD_ASSET_MANAGER%>"/>
        <% } %>
        <tr>
            <td class="FormLabel tdAlignRight" valign="top">
                Site&nbsp;Type
            </td>
            <td valign="top" Colspan="2">
                <% if (SiteTypeSpecs.SITE_TYPE_ID_DISTRICT_MEDIA.equals(form.getSiteTypeID())) { %>
                    <span class="ColRow"><%= ResponseUtils.filter(form.getMediaCollectionSiteTypeName()) %></span>
                    <html:hidden property="<%=form.FIELD_SITE_TYPE_ID%>"/>
                <% } else if(SiteTypeSpecs.SITE_TYPE_ID_DISTRICT_WAREHOUSE.equals(form.getSiteTypeID())) { %>
                    <span class="ColRow"><%= ResponseUtils.filter(form.getDistrictWarehouseSiteTypeName()) %></span>
                    <html:hidden property="<%=form.FIELD_SITE_TYPE_ID%>"/>                    
                <% } else { %>
                    <%
                    BooleanStringValue bsValue = new BooleanStringValue(true,"");
                    if(form.getSiteID()!=null) {
                        bsValue = ConfigDistrictFacadeSpecs.canDoLengthyTask(ConfigDistrictFacadeSpecs.LENGTHY_TASK_CHANGE_SITES_SITE_TYPE);
    	            }
                    if ( bsValue.isBoolValue() ) { %> 
                        <base:selectSiteType name="<%=form.FIELD_SITE_TYPE_ID%>" selectedSiteTypeID="<%=form.getSiteTypeID()%>"  mode="<%=LookupSpecs.MODE_EDIT%>" includeForMediaSites="false" includeForLibrarySites="true" includeForTextbookSites="true"  includeForAssetSites="false"/>
                    <% } else { %>
                       <span class="ColRow"><%=form.getDisplayableSiteType()%></span><BR>
                       <span class="Instruction"><%=bsValue.getMessage()%></span>
                       <html:hidden property="<%=form.FIELD_SITE_TYPE_ID%>"/>
                    <% } %>
                <% } %>
            </td>
        </tr>

		<tr>
          <td class="FormLabel tdAlignRight" valign="top">
            Zone
          </td>
          <td class="ColRow" valign="top">
            <bean:define id="zoneList" name="<%= DistrictEditSiteForm.FORM_NAME %>" property="zoneList"/>
            <html:select property="<%= DistrictEditSiteForm.FIELD_ZONE_ID %>">
                <html:options collection="zoneList" property="longID" labelProperty="stringDesc"/>
            </html:select>
          </td>
          <td class="ColRow" width="50%" valign="top">
            <base:showHideTag id="Other" showTextOnNewLine="false">
                <base:genericButton src="/buttons/large/other.gif" name="<%= DistrictEditSiteForm.BUTTON_ZONE_OTHER %>" alt="Other" absbottom="true" onclick="hideElementOther()"/>
            </base:showHideTag>
          </td>
		</tr>
        <% if (form.isTextbookManager() || form.isAssetManager()) { %>
		<tr>
          <td class="FormLabel tdAlignRight" valign="top">
            
            <%=form.getAlternateSiteTypePrompt()%>
          </td>
          <td class="ColRow" valign="top">
            <bean:define id="alternateSiteTypeID" name="<%=DistrictEditSiteForm.FORM_NAME%>" property="alternateSiteTypeList"/>
            <html:select property="<%= DistrictEditSiteForm.FIELD_ALTERNATE_SITE_TYPE_ID %>">
                      <html:options collection="alternateSiteTypeID" property="longID" labelProperty="stringDesc"/>
            </html:select>
         </td> 
         <td class="ColRow" width="50%" valign="top">    
            <base:showHideTag id="OtherAlternate" showTextOnNewLine="false">
                <base:genericButton src="/buttons/large/other.gif" name="<%= DistrictEditSiteForm.BUTTON_ALTERNATE_SITE_TYPE_OTHER %>" alt="Other" absbottom="true" onclick="hideElementOtherAlternate()"/>
            </base:showHideTag>
          </td>
		</tr>
        <% } %>
        <%-- Address fields --%>
        <tr>
            <td class="FormLabel tdAlignRight">
                Address
            </td>
            <td colspan="2">
                <html:text property="<%=form.FIELD_ADDRESS_LINE1%>" size="30" maxlength="90"/>
            </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight">
                &nbsp;
            </td>
            <td colspan="2">
                <html:text property="<%=form.FIELD_ADDRESS_LINE2%>" size="30" maxlength="90"/>
            </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight">
                City
            </td>
            <td colspan="2">
                <html:text property="<%=form.FIELD_CITY%>" size="30" maxlength="90"/>
            </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight">
                State/Province
            </td>
            <td colspan="2">
                <html:text property="<%=form.FIELD_STATE%>" size="30" maxlength="90"/>
            </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight">
                Postal&nbsp;Code
            </td>
            <td colspan="2">
                <html:text property="<%=form.FIELD_ZIP%>" size="20" maxlength="20"/>
            </td>
        </tr>
        
        <tr>
            <td colspan="3"><base:imageLine/></td>
        </tr>
    
        <tr>
            <td class="FormLabel tdAlignRight">
                Site&nbsp;Customer&nbsp;Number
            </td>
            <td class="FormLabel" nowrap valign="middle" colspan="2">
              <html:text property="<%= BaseDestinyServicesForm.FIELD_CUSTOMER_NUMBER %>" size="8" maxlength="7"/>
            </td>
        </tr>
        <logic:equal name="<%= DistrictEditSiteForm.FORM_NAME %>" property="showServices" value="true">
            <jsp:include page="/district/services_site.jsp" flush="true" >
                <jsp:param name="mediaSite" value="<%=form.isMedia()%>"/>
            </jsp:include>
        </logic:equal>
        
        <tr>
            <td colspan="3"> <base:imageLine/></td>
        </tr>
        <tr>
            <td colspan="3"><base:imageLine/></td>
        </tr>

        <tr>
            <td>
                &nbsp;
            </td>
            <td colspan="2">
                <table id="<%= DistrictEditSiteForm.TABLE_SITE_LOGO %>" border="0" cellpading="5" cellspacing="0">
                    <tr>
                        <td align="center" valign="top">
                           <img name="Site Logo" alt="Site Logo" src="<bean:write name="<%= DistrictEditSiteForm.FORM_NAME %>" property="imageURL"/>" width="<%= EditDistrictForm.LOGO_WIDTH %>" title="<bean:write name="<%= DistrictEditSiteForm.FORM_NAME %>" property="imageURL"/>" width="<%= EditDistrictForm.LOGO_WIDTH %>"  height="<%= EditDistrictForm.LOGO_HEIGHT %>" border="1">
                        </td>
                        <td valign="top" class="Instruction">
                            &nbsp;Your logo must be 120 X 54 pixels.<br>
                            &nbsp;A transparent background is recommended.<br>
                            &nbsp;Browser refresh may be required to see the newest image.
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight">
                Logo
            </td>
            <td class="ColRowBold" colspan="2">
            <base:showHideTag id="hidePreviewClear">
                <table border="0" cellpading="0" cellspacing="0">
                    <tr>
                        <td>
                            <html:file property="<%= DistrictEditSiteForm.FIELD_UPLOAD_FILE %>"/>
                        </td>
                        <td>
                            &nbsp;
                            <base:genericButton onclick="hideElementhidePreviewClear()" src="/buttons/large/preview2.gif" name="<%= DistrictEditSiteForm.BUTTON_NAME_PREVIEW %>" alt="Preview"/>
                        </td>
                        <td>
                            &nbsp;
                            <base:genericButton onclick="hideElementhidePreviewClear()" src="/buttons/large/clear.gif" name="<%= DistrictEditSiteForm.BUTTON_NAME_CLEAR %>" alt="Clear"/>
                        </td>
                    </tr>
                </table>
                </base:showHideTag>
            </td>
        </tr>


        </base:outlinedTable>
    </td>
</tr>
<tr>
    <td align="center" class="ColRowBold">
        <base:showHideTag id="hideSave">
    		<base:saveButton onclick="hideElementhideSave()"/>
    		&nbsp;
    		<base:cancelButton onclick="hideElementhideSave()"/>
		</base:showHideTag>
    </td>
</tr>
</table>

</base:form>
