<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@ page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@ page import="com.follett.fsc.destiny.util.ObjectHelper" %>

<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>

<%
    InventoryDetailsForm form = (InventoryDetailsForm)request.getAttribute(InventoryDetailsForm.FORM_NAME);
	String inventoryType = MessageHelper.formatMessage("inventorydetails_0Started1", 
        ResponseUtils.filter(form.getInventoryName()), form.getInventoryStartDate());
	String collectionLabel = form.getPartialCollectionLabel();
    boolean assetSite = form.getCollectionType() == CollectionType.ASSET;
    boolean textbookSite = form.getCollectionType() == CollectionType.TEXTBOOK;
    boolean tmOrRm = ObjectHelper.isIntInArray(form.getCollectionType(), CollectionType.TEXTBOOK, CollectionType.ASSET);
%>

<base:form action="/backoffice/servlet/handleinventorydetailsform.do">
<html:hidden property="collectionType"/>
<html:hidden property="inventoryID"/>
<html:hidden property="siteID"/>
<html:hidden property="siteName"/>
<html:hidden property="<%=InventoryDetailsForm.PARAM_VIEWING_FROM_MEMBER_STANDPOINT %>"/>

    <base:outlinedTable id="<%=InventoryDetailsForm.TABLE_MAIN%>" borderColor='#c0c0c0' width="97%" cellpadding="0" cellspacing="0">
        <tr>
            <td class="TableHeading" colspan="3"><%=inventoryType%></td>
            <td class="tdAlignRight">
				<base:genericButton src="/buttons/large/closex.gif" name="<%= InventoryDetailsForm.BUTTON_CLOSE %>" alt='<%= MessageHelper.formatMessage("close") %>'/>   
			</td>
        </tr>
       
        <tr><td  colspan="4">&nbsp;</td></tr>
        <tr><td colspan="4" width="100%">
        <logic:equal name="backoffice_servlet_InventoryDetailsForm" property="includeCountsTable" value="true">
             <base:imageLine height="1" width="100%"/> 
             <table id="table0" width="100%"> <!-- opening the big textbook table -->
             <tr><td>
             
            <table cellpadding="3" cellspacing="0" id="<%=InventoryDetailsForm.TABLE_COUNTS %>" width="100%">
            <tr> 
                <td class="TableHeading2" align="center" colspan="2" width="50%">
                <% if (assetSite) { %>
                    <%= MessageHelper.formatMessage("inventorydetails_ItemsWithBarcodes") %>
                <% } else if (textbookSite) { %>
                    <%= MessageHelper.formatMessage("inventorydetails_CopiesWithBarcodes") %>
                <% } %>
                </td>
                 <td class="tdAlignRight" colSpan="2">
                    <base:reportButton/>
                 </td>
            </tr>
            <tr>
            	<td class="ColRowBold tdAlignRight" width="50%"><%=collectionLabel%></td>
            	<td class="ColRow" >
            		<bean:write name="backoffice_servlet_InventoryDetailsForm" property="copiesInCollection" />&nbsp;
            	</td>
            	<td  colspan="2" class="tdAlignRight">&nbsp;</td>
            </tr>
            <tr>
            	<td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("inventorydetails_AccountedFor") %></td>
            	<td class="ColRow"><bean:write name="backoffice_servlet_InventoryDetailsForm" property="copiesAccountedFor" />&nbsp;</td>
                <td class="Instruction" colspan="2">
                    <base:showHideTag id="CopiesLostLink" showTextOnNewLine="false">
                        (<%= (assetSite ? MessageHelper.formatMessage("inventorydetails_ItemsLost", form.getCopiesLost()) 
                            :  MessageHelper.formatMessage("inventorydetails_CopiesLost", form.getCopiesLost())) %><%if(form.hideSeeDetailsLink() || "0".equals(form.getCopiesLost())){%>)
                         <%}else if(!form.hideSeeDetailsLink()){%>
                             <logic:notEqual name="backoffice_servlet_InventoryDetailsForm" property="copiesLost" value="0">
                                  [ <base:link id='<%=form.ID_ACCOUNTED_FOR_DETAILS %>' page='<%= form.getLostListLink() %>' onclick="hideElementCopiesLostLink()"><%= MessageHelper.formatMessage("inventorydetails_SeeDetails") %></base:link> ])
                            </logic:notEqual>
                        <%}%>
                    </base:showHideTag>
                </td>
            </tr>
            <tr>
            	<td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("inventorydetails_UnaccountedFor") %></td>
            	<td class="ColRow">
                    <bean:write name="backoffice_servlet_InventoryDetailsForm" property="copiesUnaccountedFor" />&nbsp;
                </td>
                <td class="Instruction">
                    <% if( !form.hideSeeDetailsLink() ){ %>
                    <logic:notEqual name="backoffice_servlet_InventoryDetailsForm" property="copiesUnaccountedFor" value="0">
                                  <base:showHideTag id="UnaccountedLink" showTextOnNewLine="false">
                          [ <base:link id='<%=form.ID_UNACCOUNTED_FOR_DETAILS %>' page='<%= form.getUnaccountedListLink()%>' onclick="hideElementUnaccountedLink()"><%= MessageHelper.formatMessage("inventorydetails_SeeDetails") %></base:link> ]
                                  </base:showHideTag>
                    </logic:notEqual>
                    <logic:equal name="backoffice_servlet_InventoryDetailsForm" property="copiesUnaccountedFor" value="0">
                        &nbsp;
                    </logic:equal>
                    <% } else { %>
                       &nbsp;
                    <%} %>
                </td>
                <td class="tdAlignRight">
                    &nbsp;
            	</td>
            </tr>
            <%if(!tmOrRm){ %>
            <tr>
                <td class="ColRowBold tdAlignRight">
                    <bean:write name="<%=InventoryDetailsForm.FORM_NAME%>" property="totalInCollectionPrompt" />
                </td>
                <td class="ColRow">
                    <bean:write name="<%=InventoryDetailsForm.FORM_NAME%>" property="totalInCollection" />&nbsp;
                </td>
                <td colspan="2">&nbsp;</td>
            </tr>
            
            <%} %>

            <tr>
                <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("inventorydetails_ReportOn") %></td>
                <td colspan="3" class="ColRow">
                    <html:radio property="<%=InventoryDetailsForm.FIELD_RADIO_VIEW%>" value="<%=InventoryDetailsForm.VIEW_ALL_ITEMS%>"/>
                    <% if (assetSite) { %>
                    &nbsp;<%= MessageHelper.formatMessage("inventorydetails_ItemsInTheInventory")%>
                    <% } else { %>
                    &nbsp;<%= MessageHelper.formatMessage("inventorydetails_CopiesInTheInventory")%>
                    <% } %>
                </td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td colspan="3" class="ColRow">
                    <html:radio property="<%=InventoryDetailsForm.FIELD_RADIO_VIEW%>" value="<%=InventoryDetailsForm.VIEW_ACCOUNTED_ITEMS%>"/>
                    <% if (assetSite) { %>
                    &nbsp;<%= MessageHelper.formatMessage("inventorydetails_ItemsThatHaveBeenAccountedFor")%>
                    <% } else { %>
                    &nbsp;<%= MessageHelper.formatMessage("inventorydetails_CopiesThatHaveBeenAccountedFor")%>
                    <% } %>
                </td>    
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td colspan="3" class="ColRow">
                    <html:radio property="<%=InventoryDetailsForm.FIELD_RADIO_VIEW%>" value="<%=InventoryDetailsForm.VIEW_UNACCOUNTED_ITEMS%>"/>
                    <% if (assetSite) { %>
                    &nbsp;<%= MessageHelper.formatMessage("inventorydetails_ItemsThatAreUnaccountedFor")%>
                    <% } else { %>
                    &nbsp;<%= MessageHelper.formatMessage("inventorydetails_CopiesThatAreUnaccountedFor")%>
                    <% } %>
                </td>    
            </tr>
            <tr>
                <td colspan="4" ><base:imageSpacer height="10" width="1"/></td>
            </tr>
            <% if (assetSite) { %>
                <tr>
                    <td>&nbsp;</td>
                    <td colspan="3" class="ColRow">
                    <html:checkbox property="<%=InventoryDetailsForm.FIELD_CHECKBOX_INCLUDE_IMAGE%>"/><%= MessageHelper.formatMessage("inventorydetails_IncludeImagesForUnaccountedForItems") %></td>    
                </tr>
            <% } %>
             </table>
             </td>
             
             </tr> <!-- closes textbook table -->
             </table>
        </logic:equal>
       </td>
       </tr>
       
        <logic:equal name="backoffice_servlet_InventoryDetailsForm" property="includeUnbarcodedCountsTable" value="true">
             
            <tr><td colspan="4" width="100%">
            <base:imageLine height="1" width="100%"/>
            <table id="table1" width="100%"> <!-- opening the big textbook table -->
                 <tr><td>
            
            <table cellpadding="3" cellspacing="0" id="<%=InventoryDetailsForm.TABLE_UNBARCODED_COUNTS %>" width="100%">
             <tr> 
                <td class="TableHeading2" align="center" colspan="2" width="50%">
                <% if (assetSite) { %>
                    <%= MessageHelper.formatMessage("inventorydetails_CountItemsWithoutBarcodes") %>
                <% } else { %>
                    <%= MessageHelper.formatMessage("inventorydetails_CountCopiesWithoutBarcodes") %>
                <% } %>
                </td>
                <td class="ColRowBold" colspan="2" width="50%">&nbsp;</td>
            </tr>
            <tr>
                <td class="ColRowBold tdAlignRight" width="50%">
                    <% if (assetSite) { %>
                        <%= MessageHelper.formatMessage("inventorydetails_TotalResources") %>
                    <% } else { %>
                        <%= MessageHelper.formatMessage("inventorydetails_TotalTitles") %>
                    <% } %>
                </td>
                <td class="ColRow" >
                    <bean:write name="<%=InventoryDetailsForm.FORM_NAME%>" property="unbarcodedTitles" />
                </td>
                <td  colspan="2" class="tdAlignRight">&nbsp;</td>
            </tr>
            <tr>
                <td class="ColRowBold tdAlignRight" width="50%">
                <% if (assetSite) { %>
                    <%= MessageHelper.formatMessage("inventorydetails_ResourcesCounted") %>
                <% } else { %>
                    <%= MessageHelper.formatMessage("inventorydetails_TitlesCounted") %>
                <% } %>
                </td>
                <td class="ColRow" >
                    <bean:write name="<%=InventoryDetailsForm.FORM_NAME%>" property="unbarcodedTitlesCounted" />
                </td>
                <td  colspan="2" class="tdAlignRight">&nbsp;</td>
            </tr>
            <tr>
                <td class="ColRowBold tdAlignRight" width="50%">
                    <% if (assetSite) { %>
                        <%= MessageHelper.formatMessage("inventorydetails_ResourcesWithoutCounts") %>
                    <% } else { %>
                        <%= MessageHelper.formatMessage("inventorydetails_TitlesWithoutCounts") %>
                    <% } %>
                </td>
                <td class="ColRow" >
                    <bean:write name="<%=InventoryDetailsForm.FORM_NAME%>" property="unbarcodedTitlesWithoutCounts" />
                </td>
                <td  colspan="2" class="tdAlignRight">&nbsp;</td>
            </tr>
             </table>
                </td>
             <td colspan="2" width="12%" >&nbsp;
             </td>
             
             </tr> 
             </table>
             
           </td>
           </tr>
        </logic:equal>
     
    </base:outlinedTable>
</base:form>

