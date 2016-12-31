<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.*"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    TransferArchiveForm form = (TransferArchiveForm)request.getAttribute(TransferArchiveForm.FORM_NAME);
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>

<%@page import="com.follett.fsc.destiny.util.Permission"%>

<%@page import="com.follett.fsc.destiny.session.cataloging.ejb.TransferTrackFacadeSpecs"%>
<%@page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.TransferSpecs"%>
<%@page import="com.follett.fsc.common.StringHelper"%>



 

<%@page import="com.follett.fsc.common.consortium.UserContext"%><style>
    :root {
        overflow-y: scroll !important;
    }
    
    .OrderNum {
        width: 80px;
        padding-right: .5em;
    }
    
</style>

<base:form action="/cataloging/servlet/handletransferarchiveform.do">
	<html:hidden property="<%=TransferArchiveForm.PARAM_SORT_INCOMING%>"/>
	<html:hidden property="<%=TransferArchiveForm.PARAM_SORT_OUTGOING%>"/>
	<html:hidden property="<%=TransferArchiveForm.PARAM_SORT_SITE%>"/>
	<html:hidden property="<%=TransferArchiveForm.PARAM_SORT_RETURN%>"/>
    <html:hidden property="<%=TransferArchiveForm.PARAM_SORT_DENIED_RETURN%>"/>
	<html:hidden property="<%=TransferArchiveForm.PARAM_OLD_LIMIT_DATE%>"/>
	<html:hidden property="<%=TransferArchiveForm.PARAM_OLD_LIMIT_DISTRICT%>"/>
	<html:hidden property="<%=TransferArchiveForm.PARAM_OLD_LIMIT_SITE%>"/>
	<html:hidden property="<%=TransferArchiveForm.PARAM_OLD_LIMIT_VIEWXFERDATE%>"/>
    <html:hidden property="<%=TransferArchiveForm.PARAM_DESCEND_INCOMING%>"/>
    <html:hidden property="<%=TransferArchiveForm.PARAM_DESCEND_OUTGOING%>"/>
    <html:hidden property="<%=TransferArchiveForm.PARAM_DESCEND_SITE%>"/>
	<html:hidden property="<%=TransferArchiveForm.PARAM_DESCEND_RETURN%>"/>
    <html:hidden property="<%=TransferArchiveForm.PARAM_DESCEND_DENIED_RETURN%>"/>
	<html:hidden property="<%=TransferArchiveForm.PARAM_CLEAR%>" value = "false"/>
	<html:hidden property="<%=GenericForm.FIELD_COLLECTION_TYPE%>"/>
	<html:hidden property="<%=TransferArchiveForm.FIELD_CONTEXT_LIMITER_CHANGED %>" value="false"/>
    <html:hidden property="<%=TransferArchiveForm.FIELD_HIDDEN_RETURNS %>" styleId = "<%=TransferArchiveForm.FIELD_HIDDEN_RETURNS %>"/>
    <html:hidden property="<%=TransferArchiveForm.FIELD_HIDDEN_INCOMING_TRANSFERS %>" styleId = "<%=TransferArchiveForm.FIELD_HIDDEN_INCOMING_TRANSFERS %>"/>
    <html:hidden property="<%=TransferArchiveForm.FIELD_HIDDEN_OUTGOING_TRANSFERS %>" styleId = "<%=TransferArchiveForm.FIELD_HIDDEN_OUTGOING_TRANSFERS %>"/>
    <html:hidden property="<%=TransferArchiveForm.FIELD_HIDDEN_DENIED_RETURNS %>" styleId = "<%=TransferArchiveForm.FIELD_HIDDEN_DENIED_RETURNS %>"/>
    <html:hidden property="<%=TransferArchiveForm.FIELD_HIDDEN_SITE_TRANSFERS %>" styleId = "<%=TransferArchiveForm.FIELD_HIDDEN_SITE_TRANSFERS %>"/>
    
    <base:messageBox strutsErrors="true"/>
    
    <base:outlinedTableAndTabsWithinThere id="<%=TransferArchiveForm.TABLE_MAIN%>" selectedTab="<%=TransferArchiveForm.ID_TAB%>" tabs="<%=form.getTabs()%>">
       <tr>
            <td class="TableHeading"><%=form.getPageHeader() %></td>
       </tr>
        
    <logic:equal name="<%= TransferArchiveForm.FORM_NAME %>" property="<%= TransferArchiveForm.PARAM_EMPTY_LIST %>" value="true">
        <tr><td class="ColRowBold" align="center">
                <%= form.getNothingToReportMessage() %>
        </td></tr>    
    </logic:equal>
    <logic:equal name="<%= TransferArchiveForm.FORM_NAME %>" property="<%= TransferArchiveForm.PARAM_EMPTY_LIST %>" value="false">
        <%=form.outputLists() %>
    </logic:equal>
    <tr>
        <td><hr/></td>
    </tr>
    <logic:equal name="<%= TransferArchiveForm.FORM_NAME %>" property="<%= TransferArchiveForm.PARAM_EMPTY_LIST %>" value="false">
        <tr>
            <td>
                <table width = "99%" id = "<%= TransferArchiveForm.TABLE_LEGEND %>" >
                    <tr>
                        <td align = "center" class = "SmallColRow" width = "33%"><img src = '<%=UserContext.getMyContextLocaleHelper().getLocalizedImagePath("/icons/general/notetransfer.gif")%>' alt = "View Note" title = "View Note"> = View Note</td>
                        <td align = "center" class = "SmallColRow" width = "33%"><img src = '<%=UserContext.getMyContextLocaleHelper().getLocalizedImagePath("/icons/general/view.gif")%>' alt = "view" title = "view"> = View</td>
                    </tr>
                </table>
            </td>
        </tr>    
    <tr>
        <td><hr/></td>
    </tr>
    </logic:equal>
    
    <tr>
        <td class = "ColRowBold">
            <a name = "customize" style = "color:black">Customize View</a>&nbsp;&nbsp;
            <br/>
            <span class = "ColRow" style = "font-weight: normal">Use the following options to create a customized list.</span>
        </td>
    </tr>   
    <tr>
        <td><table>
            <tr>
                    <td class = "ColRowBold" width = '25%'><a name = "selectSite"></a>
                            View created</td>
                    <td>   <html:select property = "viewXferDateLimiter">
                                <html:option value = "<%= TransferTrackFacadeSpecs.PARAM_AFTER_DATE %>"><%= TransferArchiveForm.OPTION_AFTER_DATE %></html:option>
                                <html:option value = "<%= TransferTrackFacadeSpecs.PARAM_ON_DATE %>"><%= TransferArchiveForm.OPTION_ON_DATE %></html:option>
                                <html:option value = "<%= TransferTrackFacadeSpecs.PARAM_BEFORE_DATE %>"><%= TransferArchiveForm.OPTION_BEFORE_DATE %></html:option>
                            </html:select>&nbsp;
                            <base:date 
                                buttonName = "<%=TransferArchiveForm.BUTTON_CHANGE_DATE%>"
                                fieldName = "<%=TransferArchiveForm.FIELD_LIMIT_DATE%>"
                                dateValue = "<%=form.getLimitDate()%>"
                                altText = "Change Limiter Date"
                            />
                    </td> 
                </tr>
                <tr>
                    <td class = "ColRowBold" valign="top">Limit location</td>
                    <td class = "ColRow">
                        <base:isStateContext>
                            <base:selectDistrict                                 
                                includeStateTextbookOffice="false"
                                includeStatewide="false" 
                                selectedDistrictContext="<%=form.getLimitDistrict()%>"
                                mustContainTextbookSites="true"  
                                useSelectAllDistricts="true"                                
                                useSelectADistrict="false"                                
                                onChangeAction="submitDropDownDistrict()"
                                useArchive = "true" 
                                name="<%= TransferArchiveForm.FIELD_LIMIT_DISTRICT %>" /> 
                        </base:isStateContext>
                        <base:isNotStateContext>
                            <% if (form.getStore().isStateRepositoryRunning()) { %>
                                <base:selectDistrict                                 
                                    includeStateTextbookOffice="true"
                                    includeStatewide="false" 
                                    selectedDistrictContext="<%=form.getLimitDistrict()%>"
                                    mustContainTextbookSites="true"  
                                    useSelectADistrict="true"                                
                                    limitToMyDistirctContext="true"
                                    useSelectAllDistricts="false"
                                    onChangeAction="submitDropDownDistrict()" 
                                    useArchive = "true" 
                                    name="<%= TransferArchiveForm.FIELD_LIMIT_DISTRICT %>" /> 
                                <br/>                            
                            <% } %>
                        </base:isNotStateContext>
                    </td>
                </tr>
                        <% if( form.displaySiteDropdown()) 
                        { %>
                            <tr>
                                <td>&nbsp;</td>
                                <td>                            
                                    <base:selectSite 
                                       useSelectASite="false"
                                       name="<%= TransferArchiveForm.FIELD_LIMIT_SITE %>" 
                                       selectedSiteID="<%= form.getLimitSite() %>" 
                                       mode="<%= SelectSiteTag.MODE_ARCHIVE %>"
                                       includeLibrarySites="false"
                                       includeTextbookSites="true"
                                       includeMediaSites="false"
                                       contextName="<%=form.getLimitDistrict()%>"
                                       includeAssetSites="false"
                                       includeAllSites="true"
                                       includeFromDistrict = "false"
                                />
                             </td>
                          </tr>
                        <% } %>
                <tr>
                    <td colspan = "3">
                        <table width="100%" id="<%= TransferArchiveForm.TABLE_CHECKBOXES %>">
                            <tr>
                                <td class="ColRowBold">
                                    <span style = "font-size:1em">Display:</span>
                                </td>
                                <td nowrap class="ColRow">
                                    <html:checkbox property="<%= TransferArchiveForm.PARAM_DISPLAY_RETURNS %>" styleId = "di2"/> <label for="di2"> Completed Returns</label>
                                </td>
                                <td nowrap class="ColRow">
                                    <html:checkbox property="<%= TransferArchiveForm.PARAM_DISPLAY_DENIED_RETURNS %>" styleId = "di4"/> <label for="di4"> Denied Returns</label>
                                </td>
                                <td nowrap class="ColRow">
                                    <% if  (!form.getStore().isStateContext() && form.getStore().isDistrictUser()) { %>
                                        <html:checkbox property="<%= TransferArchiveForm.PARAM_DISPLAY_SITE_TRANSFERS %>" styleId="di3"/> <label for="di3">Completed Site Transfers</label>&nbsp;&nbsp;
                                    <% } else { %>
                                        &nbsp;
                                    <% } %>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    &nbsp;
                                </td>
                                <td nowrap class="ColRow">
                                    <html:checkbox property="<%= TransferArchiveForm.PARAM_DISPLAY_INCOMING_TRANSFERS %>" styleId="di0"/> <label for="di0">Completed Incoming Transfers</label>&nbsp;&nbsp;
                                </td>
                                <td nowrap class="ColRow">
                                    <html:checkbox property="<%= TransferArchiveForm.PARAM_DISPLAY_OUTGOING_TRANSFERS %>" styleId = "di1"/> <label for="di1"> Completed Outgoing Transfers</label> &nbsp;&nbsp;
                                </td>
                                <td nowrap class="ColRow">
                                    &nbsp;
                                </td>
                             </tr>
                           </table>
                    </td>                                        
                </tr>
                <tr>
                    <td colspan = "3" align = "center"><input type = "image" name = "<%= TransferArchiveForm.BUTTON_UPDATE_VIEW %>" id="<%= TransferArchiveForm.BUTTON_UPDATE_VIEW %>" src = '<%=lh.getLocalizedImagePath("/buttons/large/update.gif")%>' border = "0" alt = "Update" title = "Update"/></td>
                </tr>        
            </table>
        </td>
    </tr>
    </base:outlinedTableAndTabsWithinThere>
    
    <%= SectionHeadingTag.generateShowMoreLessJavascript() %>
    <script language = 'JavaScript'>
    <!--
       function submitDropDownDistrict() {
            document.<%=TransferArchiveForm.FORM_NAME%>.<%=TransferArchiveForm.FIELD_CONTEXT_LIMITER_CHANGED%>.value = 'true';
            document.<%=TransferArchiveForm.FORM_NAME%>.action += "#selectSite";
            document.<%=TransferArchiveForm.FORM_NAME%>.submit();
       }

       var img = document.getElementById("imageCompletedIncomingTransfers");
       if (<%= form.isHiddenCompletedIncomingTransfers() %> && img) {
           showMoreLess(img, "CompletedIncomingTransfers");
       }

       img = document.getElementById("imageCompletedOutgoingTransfers");
       if (<%= form.isHiddenCompletedOutgoingTransfers() %> && img) {
           showMoreLess(img, "CompletedOutgoingTransfers");
       }

       img = document.getElementById("imageCompletedReturns");
       if (<%= form.isHiddenCompletedReturns()%> && img  ) {
           showMoreLess(img, "CompletedReturns");
       }

       img = document.getElementById("imageDeniedReturns");
       if (<%= form.isHiddenDeniedReturns()%> && img  ) {
           showMoreLess(img, "DeniedReturns");
       }

       img = document.getElementById("imageCompletedSiteTransfers");
       if (<%= form.isHiddenCompletedSiteTransfers()%> && img  ) {
           showMoreLess(img, "CompletedSiteTransfers");
       }

       function updateURL(t, h) {            
    	    t.href += "&<%=TransferArchiveForm.FIELD_HIDDEN_RETURNS %>=" + document.<%= TransferArchiveForm.FORM_NAME %>.<%=TransferArchiveForm.FIELD_HIDDEN_RETURNS %>.value;
    	    t.href += "&<%=TransferArchiveForm.FIELD_HIDDEN_INCOMING_TRANSFERS %>=" + document.<%= TransferArchiveForm.FORM_NAME %>.<%=TransferArchiveForm.FIELD_HIDDEN_INCOMING_TRANSFERS %>.value;
    	    t.href += "&<%=TransferArchiveForm.FIELD_HIDDEN_OUTGOING_TRANSFERS %>=" + document.<%= TransferArchiveForm.FORM_NAME %>.<%=TransferArchiveForm.FIELD_HIDDEN_OUTGOING_TRANSFERS %>.value;
    	    t.href += "&<%=TransferArchiveForm.FIELD_HIDDEN_SITE_TRANSFERS %>=" + document.<%= TransferArchiveForm.FORM_NAME %>.<%=TransferArchiveForm.FIELD_HIDDEN_SITE_TRANSFERS %>.value;
    	    t.href += "&<%=TransferArchiveForm.FIELD_HIDDEN_DENIED_RETURNS %>=" + document.<%= TransferArchiveForm.FORM_NAME %>.<%=TransferArchiveForm.FIELD_HIDDEN_DENIED_RETURNS %>.value;
    	    if (h) {
                t.href += "#" + h;
            }
        }
       
    // -->
    </script>
</base:form>


