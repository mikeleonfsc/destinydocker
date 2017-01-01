<%@page language="java" %>
<%@page contentType="text/html; charset=UTF-8" %>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.OrderListVOTag"%>
<%@page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@page import="com.follett.fsc.common.StringHelper" %>
<%@page import="com.follett.fsc.common.LocaleHelper"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%
    OrdersArchiveForm form = (OrdersArchiveForm)request.getAttribute(OrdersArchiveForm.FORM_NAME);
    boolean printerFriendly = form.isPrinterFriendly();
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>

<%@page import="com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.ejb.OrderFacadeSpecs"%>


<%@page import="com.follett.fsc.destiny.entity.ejb3.OrdersSpecs"%>

<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<c:set var="form" value="<%=form%>" />

<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handleordersarchiveform.do">
<html:hidden property="<%= OrdersArchiveForm.FIELD_CONTEXT_LIMITER_CHANGED %>" value="false"/>
<html:hidden property="<%=OrdersArchiveForm.FIELD_HIDDEN_COMPLETED %>" styleId="hiddenCompleted"/>
<html:hidden property="<%=OrdersArchiveForm.FIELD_HIDDEN_DENIED %>" styleId="hiddenDenied"/>
<html:hidden property="<%=OrdersArchiveForm.PARAM_SORT_STATUS%>"/>
<html:hidden property="<%=OrdersArchiveForm.PARAM_SORT_TYPE   %>"/>
<html:hidden property="<%=OrdersArchiveForm.PARAM_SORT_DESC%>"/>
<html:hidden property="<%=OrdersArchiveForm.PARAM_COLLECTION_TYPE%>" value="<%=String.valueOf(form.getCollectionType())%>" />


<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">

<base:outlinedTableAndTabsWithinThere id="<%=OrdersArchiveForm.TABLE_MAIN%>" selectedTab="<%=OrdersArchiveForm.TAB_ARCHIVE%>" tabs="<%=form.getTabs()%>" width="100%">
    <tr>
        <td>
        <table width="100%"><tr>
            <td class="TableHeading">
            Order Archive
            <%if(!printerFriendly) { %>
                <span class="Instruction">[ <a href="#customize">Customize View</a> ]</span></td>
            <% } else {%>
                &nbsp;
            <% } %>
            </td>
            <td class="tdAlignRight">
                &nbsp;
            </td>
        </tr></table>
        </td>
    </tr>
    
    <% if (form.isAnythingToDisplay()){ %>
    
    <tr>
        <td colspan="2">
            <table width="100%" id=<%=OrdersArchiveForm.TABLE_LISTS %>>
                <tr><td width="100%">
                    <base:orderListVOList tableName="<%= OrdersArchiveForm.TABLE_DENIED_ORDERS %>" 
                        formName="<%= OrdersArchiveForm.FORM_NAME %>"
                        listName="Denied"
                        listStatusType="<%= OrdersSpecs.STATUS_DENIED %>"                        
                        list="<%=form.getOrdersLists().getDeniedList() %>"
                        listCollectionType="<%=form.getCollectionType() %>"
                        showDateAsc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_DATE, OrdersSpecs.STATUS_DENIED, false) %>"         
                        showDateDesc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_DATE, OrdersSpecs.STATUS_DENIED, true) %>"
                        showStatusDateAsc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_STATUS_DATE, OrdersSpecs.STATUS_DENIED, false) %>"
                        showStatusDateDesc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_STATUS_DATE, OrdersSpecs.STATUS_DENIED, true) %>"      
                        showSiteAsc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_SITE, OrdersSpecs.STATUS_DENIED, false) %>"
                        showSiteDesc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_SITE, OrdersSpecs.STATUS_DENIED, true) %>"                        
                        printable="<%=printerFriendly %>"
                        sectionSortDateURL="<%=form.gimmeSortDateURL(OrdersSpecs.STATUS_DENIED) %>"
                        sectionSortSiteURL="<%=form.gimmeSortSiteURL(OrdersSpecs.STATUS_DENIED) %>"
                        sectionSortStatusDateURL="<%=form.gimmeSortStatusDateURL(OrdersSpecs.STATUS_DENIED) %>"
                        archiveOrder="true"
                        />
             
                    <base:orderListVOList tableName="<%= OrdersArchiveForm.TABLE_COMPLETED_ORDERS %>" 
                        formName="<%= OrdersArchiveForm.FORM_NAME %>"
                        listName="Completed"
                        listStatusType="<%= OrdersSpecs.STATUS_COMPLETED %>"
                        list="<%=form.getOrdersLists().getCompletedList() %>"
                        listCollectionType="<%=form.getCollectionType() %>"
                        showDateAsc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_DATE, OrdersSpecs.STATUS_COMPLETED, false) %>"         
                        showDateDesc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_DATE, OrdersSpecs.STATUS_COMPLETED, true) %>"
                        showSiteAsc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_SITE, OrdersSpecs.STATUS_COMPLETED, false) %>"
                        showSiteDesc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_SITE, OrdersSpecs.STATUS_COMPLETED, true) %>"                        
                        showStatusDateAsc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_STATUS_DATE, OrdersSpecs.STATUS_COMPLETED, false) %>"
                        showStatusDateDesc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_STATUS_DATE, OrdersSpecs.STATUS_COMPLETED, true) %>"      
                        showOrderNumAsc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_ORDER_NUMBER, OrdersSpecs.STATUS_COMPLETED, false) %>"
                        showOrderNumDesc="<%=form.showArrow(OrderFacadeSpecs.SORT_BY_ORDER_NUMBER, OrdersSpecs.STATUS_COMPLETED, true) %>"      
                        printable="<%=printerFriendly %>"
                        sectionSortDateURL="<%=form.gimmeSortDateURL(OrdersSpecs.STATUS_COMPLETED) %>"
                        sectionSortStatusDateURL="<%=form.gimmeSortStatusDateURL(OrdersSpecs.STATUS_COMPLETED) %>"
                        sectionSortSiteURL="<%=form.gimmeSortSiteURL(OrdersSpecs.STATUS_COMPLETED) %>"
                        sectionSortOrderNumURL="<%=form.gimmeSortOrderNumURL(OrdersSpecs.STATUS_COMPLETED) %>"
                        archiveOrder="true"
                        />
               </td></tr>
            </table>
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <base:imageLine/>
        </td>
    </tr>     
    <tr align="center">
        <td colspan="2">
            <base:helpIcons buttonsToOutput="<%= form.getHelpIcons() %>"/>
        </td>
    </tr>
    <% } else { %>
        <tr>
            <td class="ColRowBold" colspan = "2" align="center">
            There are no archived orders to report.
            </td>
        </tr>
    <% } %>
    
     <tr>
       <td colspan="2">
         <base:imageLine/>
      </td>
    </tr>
    
    <tr>
        <td class = "ColRowBold">
            <%if(!printerFriendly) { %>
                <a name = "customize" style = "color:black">Customize View</a>&nbsp;
                <br/>
                <span class = "ColRow" style = "font-weight: normal">Use the following options to create a customized list.</span>
            <% } %>
            
        </td>
    </tr>   
    <tr>
        <td>
            <% if(printerFriendly) { %>
                <table align="center" id="<%= OrdersArchiveForm.TABLE_CUSTOMIZE_VIEW%>">
            <% } else { %>
                <table id="<%= OrdersArchiveForm.TABLE_CUSTOMIZE_VIEW%>">
            <% } %>
            <tr>
                    <td class = "ColRowBold" width = '25%' nowrap><a name = "selectSite"></a>
                            View Orders created</td>
                    <td class = "ColRow" >
                    <% if(!printerFriendly) { %>
                            <html:select property = "<%= OrdersArchiveForm.FIELD_DATE_LIMITER %>">
                                <html:option value = '<%= "" + OrdersSpecs.PARAM_AFTER_DATE %>'><%= OrdersArchiveForm.OPTION_AFTER_DATE %></html:option>
                                <html:option value = '<%= "" + OrdersSpecs.PARAM_ON_DATE %>'><%= OrdersArchiveForm.OPTION_ON_DATE %></html:option>
                                <html:option value = '<%= "" + OrdersSpecs.PARAM_BEFORE_DATE %>'><%= OrdersArchiveForm.OPTION_BEFORE_DATE %></html:option>
                            </html:select>&nbsp;
                            <base:date 
                                buttonName = "<%=OrdersArchiveForm.BUTTON_CHANGE_DATE%>"
                                fieldName = "<%=ReturnsListForm.FIELD_LIMIT_DATE%>"
                                dateValue = "<%=form.getLimitDate()%>"
                                altText = "Change Limiter Date"
                            />
                            
                     <% } else { %>
                        <%=form.getCreatedAsString() %>
                     <% } %>
                  </td>
                </tr>
    
    
    <% if(!printerFriendly) { %>
        <base:isStateContext>
        <tr>
            <td class="ColRowBold" nowrap>Limit to Orders from</td>
            <td class="ColRow">
                    <base:selectDistrict 
                        includeStateTextbookOffice="false"
                        includeStatewide="false" 
                        selectedDistrictContext="<%=form.getLimitDistrict()%>"
                        mustContainTextbookSites="true"  
                        useSelectAllDistricts="true"
                        useSelectADistrict="false"
                        useUnlimitedText="true" 
                        onChangeAction="submitDropDownDistrict()"
                        printerFriendly="<%=printerFriendly %>" 
                        name="<%= OrdersArchiveForm.FIELD_LIMIT_DISTRICT %>" /> 
            </td> 
        </tr>
        <% if((!StringHelper.isEmptyOrWhitespace(form.getLimitDistrict()) && !SelectDistrictTag.VALUE_ALL_DISTRICTS.equals(form.getLimitDistrict()))) { %>
        <tr>
            <td class="ColRowBold tdAlignRight">&nbsp;</td>
            <td class="ColRow">
                    <base:selectSite 
                       useSelectASite="false"
                       name="<%= OrdersArchiveForm.FIELD_LIMIT_SITE %>" 
                       selectedSiteID="<%= form.getLimitSite() %>" 
                       mode="<%= form.getSessionStore().isStateContext() ? SelectSiteTag.MODE_GROUP_BY_SITE_TYPE_TEXTBOOK_ONLY : SelectSiteTag.MODE_DEFAULT %>"
                       includeLibrarySites="false"
                       includeTextbookSites="true"
                       includeMediaSites="false"
                       contextName="<%=form.getLimitDistrict()%>"
                       includeAssetSites="false"
                       includeAllSites="true"
                       includeFromDistrict = "false"
                       printerFriendly="<%=printerFriendly %>"
                />
            </td> 
        </tr>
        <% } %>
        </base:isStateContext>
        <base:isNotStateContext>
        <% if (form.getSessionStore().isDistrictUser() || form.getSessionStore().isAtDistrictWarehouse()) { %>
        <tr>
            <td class="ColRowBold tdAlignRight">Limit to Orders from</td>
            <td class="ColRow">
                    <base:selectSite 
                       useSelectASite="false"
                       name="<%= OrdersArchiveForm.FIELD_LIMIT_SITE %>" 
                       selectedSiteID="<%= form.getLimitSite() %>" 
                       mode="<%=SelectSiteTag.MODE_GROUP_BY_SITE_TYPE_ASSET_OR_TEXTBOOK_ONLY%>"
                       includeLibrarySites="false"
                       includeTextbookSites="<%=form.getCollectionType() == CollectionType.TEXTBOOK%>"
                       includeDistrictWarehouse="false"
                       includeMediaSites="false"
                       contextName="<%=UserContext.getMyThreadUserContext().getContextName()%>"
                       includeAssetSites="<%=form.getCollectionType() == CollectionType.ASSET%>"
                       includeAllSites="true"
                       includeFromDistrict = "false"
                       printerFriendly="<%=printerFriendly %>"
                />
            </td> 
        </tr>
        <% } %>
        </base:isNotStateContext>
        <tr>
            <td colspan = "3">
            <table width="100%">
                <tr>
                    <td class="ColRowBold">
                        <span style = "font-size:1em">Display:</span>
                    </td>
                    <td nowrap class="ColRow">
                        <html:checkbox property="<%= OrdersArchiveForm.FIELD_DISPLAY_DENIED %>" styleId="di4"/> <label for="di4">Denied</label>
                    </td>
                    <td nowrap class="ColRow">
                        <html:checkbox property="<%= OrdersArchiveForm.FIELD_DISPLAY_COMPLETED %>" styleId="di6"/> <label for="di6">Completed</label>
                    </td>
                 </tr>
               </table>
            </td>
        </tr>
    <% } else { %>
            <html:hidden property="<%= OrdersArchiveForm.FIELD_DISPLAY_DENIED %>" />
            <html:hidden property="<%= OrdersArchiveForm.FIELD_DISPLAY_COMPLETED %>" />
    <% } %>       
    
<% if(!printerFriendly) { %>
    <tr>
        <td colspan = "3" align = "center"><input type = "image" name = "<%= OrdersArchiveForm.BUTTON_UPDATE_VIEW %>" src = '<%=lh.getLocalizedImagePath("/buttons/large/update.gif")%>' border = "0" alt = "Update" title = "Update"/></td>
    </tr>
<% } %>  
</base:outlinedTableAndTabsWithinThere>

<%= SectionHeadingTag.generateShowMoreLessJavascript() %>
<script language="JavaScript">
<!--
    function submitDropDownDistrict() {
        document.<%=OrdersArchiveForm.FORM_NAME%>.<%=OrdersArchiveForm.FIELD_CONTEXT_LIMITER_CHANGED%>.value = 'true';
        document.<%=OrdersArchiveForm.FORM_NAME%>.action += "#selectSite";
        document.<%=OrdersArchiveForm.FORM_NAME%>.submit();
    }
    var img = document.getElementById("imageCompleted");
    if (<%= form.isHiddenCompleted()%> && img  ) {
        showMoreLess(img, "Completed");
    }
    var img = document.getElementById("imageDenied");
    if (<%= form.isHiddenDenied()%> && img  ) {
        showMoreLess(img, "Denied");
    }

    function updateURL(t, h) {            
        t.href += "&<%=OrdersArchiveForm.FIELD_HIDDEN_DENIED %>=" + document.<%= OrdersArchiveForm.FORM_NAME %>.hiddenDenied.value;
        t.href += "&<%=OrdersArchiveForm.FIELD_HIDDEN_COMPLETED %>=" + document.<%= OrdersArchiveForm.FORM_NAME %>.hiddenCompleted.value;
        if (h) {
            t.href += "#" + h;
        }
    }
// -->
</script>    


</base:form>
