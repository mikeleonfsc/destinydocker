<%@page import="com.follett.fsc.destiny.session.cataloging.ejb.AssetTemplateAEDSpecs"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.URLHelper" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="org.apache.struts.action.ActionErrors" %>
<%@ page import="org.apache.struts.Globals" %>
<%@ page import="org.apache.struts.taglib.TagUtils"%>
<%@ page import="org.apache.struts.action.ActionMessages"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.common.StringHelper"%>


<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    GlobalDeleteAssetsForm form = (GlobalDeleteAssetsForm)request.getAttribute(GlobalDeleteAssetsForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handleglobaldeleteassetsform.do" enctype="multipart/form-data">

<%
    ActionMessages errors = TagUtils.getInstance().getActionMessages(pageContext, Globals.ERROR_KEY);
    if ((errors == null || errors.size() == 0) && URLHelper.buttonWasPressed(request, GlobalDeleteAssetsForm.ID_BUTTON_REMOVE_TITLES)) { 
%>
    <base:messageBox showRedBorder="true">
    <tr>
        <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
        <td valign="baseline" class="Error">
            <c:set var="message">
                <% if (StringHelper.equals(form.getRemoveOptions(), form.OPTION_REMOVE_MODE_RESOURCES)) { %>
                    <% if (form.getTextbookOptions() == form.OPTION_TITLES_WITHOUT_COPIES) { %>
                        <%= MessageHelper.formatMessage("globaldeleteassets_TextbookTitlesWithoutCopiesWillBeRemovedFrom") %>
                    <% } else { %>
                        <%= MessageHelper.formatMessage("globaldeleteassets_TextbookTitlesWithAdoptionYear", form.getTbAdoptionYear()) %><br>
                        <base:isStateContext><%= MessageHelper.formatMessage("globaldeleteassets_ThisIncludesCopiesWithAStatusOfInTransit") %></base:isStateContext>
                        <base:isNotStateContext><%= MessageHelper.formatMessage("globaldeleteassets_ThisIncludesTitlesThatArePartOfAForecastAndCopies") %></base:isNotStateContext>
                    <% } %> 
                <% } else { %>
                    <%= MessageHelper.formatMessage("globaldeleteassets_RedemptionCodesWillBeRemovedFrom") %>         
                <% } %>              
            </c:set>
            <p align="center"> ${message}</p>
            <p align="center"><%= MessageHelper.formatMessage("globaldeleteassets_ThisProcessCannotBeReversed") %></p>
            <p align="center"><%= MessageHelper.formatMessage("globaldeleteassets_AreYouSureYouWantToProceed") %></p>
            <div align="center">
                <base:yesNo 
                    buttonYesName="<%=GlobalDeleteAssetsForm.BUTTON_CONFIRM_YES %>"
                    buttonNoName="<%=GlobalDeleteAssetsForm.BUTTON_CONFIRM_NO %>"
                />
            </div>
        </td>
    </tr>
    </base:messageBox>
<%
    }
%>
<base:outlinedTableAndTabsWithinThere id="<%=UpdateCopiesBaseForm.TABLE_MAIN%>"  borderColor="#C0C0C0" selectedTab="<%=GlobalDeleteAssetsForm.ID_TAB_GLOBAL_DELETE%>" tabs="<%=form.getAssetTabs()%>" >
    
<tr>    
<td align="center">
    <table id="<%=GlobalDeleteAssetsForm.TABLE_REMOVE_TITLES %>">

    <base:isDistrictUser>
    <tr>
      <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("removetitles_From") %>&nbsp;</td>
      <td class="ColRow">
          <base:selectSite 
                      name="<%=GlobalDeleteAssetsForm.FIELD_SITE_ID %>" 
                      onChangeAction="javascript:submitTheForm()" 
                      selectedSiteID="<%= form.getSiteID().toString() %>" 
                      includeAllLibraries="true"
                      includeLibrarySites="false"
                      includeTextbookSites="false"
                      includeMediaSites="false"                     
                      includeAssetSites="true"
                      />
      </td>
    </tr>
    </base:isDistrictUser>

    <tr>
        <td class="ColRowBold tdAlignLeft" valign = "middle" colspan = "2">
            <html:radio property="<%= GlobalDeleteAssetsForm.FIELD_REMOVE_MODE_OPTIONS %>" value="<%= GlobalDeleteAssetsForm.OPTION_REMOVE_MODE_RESOURCES %>"></html:radio>
            <% if (form.getTextbookOptions() == form.OPTION_TITLES_WITHOUT_COPIES) { %>
                <%= MessageHelper.formatMessage("globaldeleteassets_Remove") %>
                <!-- Asset Tree dropdown list start -->
                <bean:define id="assets" name="<%= GlobalDeleteAssetsForm.FORM_NAME %>" property="assetTreeOptionList" />
                    <% if (form.getAssetTreeOptionList().size() > 1) { %>
                            <html:select property="<%=GlobalDeleteAssetsForm.FIELD_ASSET_TYPE %>" onchange="javascript:submitTheForm()">
                                <html:options collection="assets" property="longID" labelProperty="stringDesc"/>
                            </html:select>
                    <% } else { %>
                            <%= form.getAssetTreeOptionList().getString(0) %>
                    <% } %>
                <!-- Asset Tree dropdown list end -->
            <% } else { %>    
                <%= MessageHelper.formatMessage("globaldeleteassets_RemoveAllTextbook") %>
                 <html:hidden property="<%= GlobalDeleteAssetsForm.FIELD_ASSET_TYPE %>" value="2"/>
             <% } %>      
            <!-- without copies/ odoption year list start -->       
            <% if (form.isAssetTemplateTextbook()) { %>
                <html:select onchange="javascript:submitTheForm()" property="<%=GlobalDeleteAssetsForm.FIELD_TEXTBOOK_OPTIONS%>">
                    <html:option value='<%="" + GlobalDeleteAssetsForm.OPTION_TITLES_WITHOUT_COPIES%>'><%= MessageHelper.formatMessage("globaldeleteassets_WithoutItems") %></html:option>
                    <html:option value='<%="" + GlobalDeleteAssetsForm.OPTION_TITLES_BASED_ON_ADOPTION%>'><%= MessageHelper.formatMessage("globaldeleteassets_BasedOnYearAdoptionEnds") %></html:option>
                </html:select>
             <!-- without copies/ odoption year list end -->          
             <% } else { %> 
                <%= MessageHelper.formatMessage("globaldeleteassets_WithoutItems") %>
            <% } %>  
        </td>
    </tr>

    <% if (form.getTextbookOptions() == form.OPTION_TITLES_WITHOUT_COPIES) { %>
            <html:hidden property="<%= GlobalDeleteAssetsForm.FIELD_TB_FORGIVE_FINES %>" value="on"/>
            <html:hidden property="<%= GlobalDeleteAssetsForm.FIELD_TB_REMOVE_CHECKEDOUT_COPIES %>" value="on"/>
            <!-- without copies -->
            
            <!-- preserve eTextbooks -->
            <tr>
                <td class="tdAlignRight">&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="<%= GlobalDeleteAssetsForm.FIELD_PRESERVE_EBOOKS %>"/></td>
                <td class="ColRow tdAlignLeft"><%= MessageHelper.formatMessage("globaldeleteassets_PreserveDigitalResources") %></td>
            </tr>   
            <tr>
                <td class="tdAlignRight">&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="<%=GlobalDeleteAssetsForm.FIELD_PRESERVE_NEWER_TITLES %>"/></td>
                <td class="ColRow tdAlignLeft"><%= MessageHelper.formatMessage("globaldeleteassets_PreserveTitlesAddedSince") %><base:date buttonName="<%=GlobalDeleteAssetsForm.BUTTON_CALENDAR %>"
                        fieldName="<%=GlobalDeleteAssetsForm.FIELD_PRESERVE_NEWER_TITLES_DATE %>"
                        dateValue="<%= form.getPreserveNewerTitlesDate() %>"
                        altText='<%= MessageHelper.formatMessage("datetag_ChangeDate") %>'
                    />
                </td>
            </tr>
            <!-- end without copies -->
    <% } else { %>   
            <html:hidden property="<%= GlobalDeleteAssetsForm.FIELD_PRESERVE_NEWER_TITLES %>" value="on"/>
            <html:hidden property="<%= GlobalDeleteAssetsForm.FIELD_PRESERVE_EBOOKS %>" value="off"/>
 
            <!-- adoption select -->
            <tr>
                <td class="ColRowBold tdAlignLeft" valign = "middle" colspan = "2">
                    &nbsp;&nbsp;&nbsp;&nbsp;<%= MessageHelper.formatMessage("globaldeleteassets_WhenAdoptionEndsIn") %>
                    <html:text size="5" maxlength="4" property="<%=GlobalDeleteAssetsForm.FIELD_TB_ADOPTION_YEAR %>"  />
                </td>
            </tr>
            <!-- If user is logged in to the District Warehouse or the selected site is a District Warehouse, then this -->
            <!-- block of code isn't executed and there will be no FIELD_TB_REMOVE_CHECKEDOUT_COPIES parameter on the request -->
            <!-- This will result in the form parameter tbRemoveCheckedOutCopies being set to false -->
            <% if (!form.getStore().isAtDistrictWarehouse() && !form.selectedSiteIsADistrictWarehouse()) { %>
                <tr>
                    <td class="tdAlignRight">&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="<%=GlobalDeleteAssetsForm.FIELD_TB_REMOVE_CHECKEDOUT_COPIES %>"/></td>
                    <td class="ColRow tdAlignLeft"><%= MessageHelper.formatMessage("globaldeleteassets_RemoveCheckedOutItems") %></td>
                </tr>
            <% } %>
            <tr>
              <td class="tdAlignRight">&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="<%=GlobalDeleteAssetsForm.FIELD_TB_FORGIVE_FINES %>"/></td>
              <td class="ColRow tdAlignLeft"><%= MessageHelper.formatMessage("globaldeleteassets_ForgiveFinesAssociatedWithDeletedItems") %></td>
            </tr>
            <!-- end adoption select -->
    <% } %> 

    <base:isDistrictUser>
        <% if (form.getTextbookOptions() == form.OPTION_TITLES_WITHOUT_COPIES) { %>
            <tr>
              <td class="tdAlignRight">&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="<%=GlobalDeleteAssetsForm.FIELD_DELETE_TITLES_WITH_NO_COPIES %>"/></td>
              <td class="ColRow tdAlignLeft"><%= MessageHelper.formatMessage("globaldeleteassets_DeleteTitlesWithNoCopiesLeftInTheDistrict") %></td>
            </tr>
        <% } else { %>   
             <html:hidden property="<%=GlobalDeleteAssetsForm.FIELD_DELETE_TITLES_WITH_NO_COPIES %>" value="false" />
        <% } %>     
    </base:isDistrictUser>

    <tr>
        <td class="ColRowBold tdAlignLeft" valign = "middle" colspan = "2">
            <html:radio property="<%= GlobalDeleteAssetsForm.FIELD_REMOVE_MODE_OPTIONS %>" value="<%= GlobalDeleteAssetsForm.OPTION_REMOVE_MODE_REDEMPTION_CODES %>">
                <%= MessageHelper.formatMessage("globaldeleteassets_RemoveRedemptionCodes") %>
            </html:radio>
            <base:helpTag helpFileName="d_global_delete_redemption_code_RM.htm" />
        </td>
    </tr>
    <tr>
        <td class="tdAlignRight">&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="<%=GlobalDeleteAssetsForm.FIELD_LIMIT_TO_EXPIRED %>"/></td>
        <td class="ColRow tdAlignLeft"><%= MessageHelper.formatMessage("globaldeleteassets_LimitToExpiredRedemptionCodes") %></td>
    </tr>

</table></td>

    <tr>
        <td class="ColRowBold" align="center" valign="top">
            <%= GenericForm.getLastBackupDisplayMsg(true) %>
        </td>
    <tr>



    <tr>
      <td align="center">
        <base:genericButton src="/buttons/large/preview2.gif" name="<%=GlobalDeleteAssetsForm.ID_BUTTON_PREVIEW %>" alt='<%= MessageHelper.formatMessage("preview") %>'/>
        <base:genericButton src="/buttons/large/removetitles.gif" name="<%=GlobalDeleteAssetsForm.ID_BUTTON_REMOVE_TITLES %>" alt='<%= MessageHelper.formatMessage("remove") %>'/>
      </td>
    </tr>
</base:outlinedTableAndTabsWithinThere>

</base:form>
 <SCRIPT LANGUAGE="javascript" TYPE="text/javascript">
    <!--
        function submitTheForm() {
            document.<%=GlobalDeleteAssetsForm.FORM_NAME%>.submit();
        }
    
    
    // -->

    </SCRIPT>
