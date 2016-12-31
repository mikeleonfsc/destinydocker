<%@page import="com.follett.fsc.destiny.util.marc.BibType"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LookupSpecs" %>
<%@ page import="com.follett.fsc.destiny.util.*"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.SiteTypeSpecs" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>

<bean:define id="categoriesID" name="<%=VisualSearchEditForm.FORM_NAME%>" property="categories"/>
<bean:define id="materialTypesID" name="<%=VisualSearchEditForm.FORM_NAME%>" property="materialTypes"/>
<bean:define id="subTypesID" name="<%=VisualSearchEditForm.FORM_NAME%>" property="subTypesList"/>
<bean:define id="pubYearLimitersID" name="<%=VisualSearchEditForm.FORM_NAME%>" property="pubYearLimiters"/>

<base:messageBox strutsErrors="true"/>

<%
    VisualSearchEditForm form = (VisualSearchEditForm)request.getAttribute(VisualSearchEditForm.FORM_NAME);
%>


<base:form action="/cataloging/servlet/handlevisualsearcheditform.do" enctype="multipart/form-data">
<input type="hidden" name="<%=PowerSearchVO.PARAM_NAME_REDISPLAY%>" value="false"/>
<html:hidden property="<%= PowerSearchVO.PARAM_PREV_READING_PROGRAM_TYPE %>"/>
<html:hidden property="<%= VisualSearchEditForm.CHECKBOX_LIMIT_ONLINE_RESOURCES_CHECKED %>" value="false"/>
<html:hidden property="parentID" />
<html:hidden property="nodeID" />
<html:hidden property="storedImageName" />
<html:hidden property="isGroup" />
<html:hidden property="isAdd" />
<html:hidden property="parentDescription" />
<html:hidden property="basePath" />
<html:hidden property="siteID" />

<script language="JavaScript" type="text/javascript">
  <!--
    function submitDropDown() {
        document.<%=VisualSearchEditForm.FORM_NAME%>.<%=PowerSearchVO.PARAM_NAME_REDISPLAY%>.value = "true";
        document.<%=VisualSearchEditForm.FORM_NAME%>.submit();
    }
  // -->
</script>

<script language="JavaScript" type="text/javascript">
  <!--
    function submitDropDownOneSearchChange() {
        document.<%=VisualSearchEditForm.FORM_NAME%>.<%=PowerSearchVO.PARAM_NAME_REDISPLAY%>.value = "true";
        document.<%=VisualSearchEditForm.FORM_NAME%>.<%=VisualSearchEditForm.CHECKBOX_LIMIT_ONLINE_RESOURCES_CHECKED%>.value = "true";
        document.<%=VisualSearchEditForm.FORM_NAME%>.submit();
    }
  // -->
</script>


<table id="<%=VisualSearchEditForm.TABLE_VS_EDIT%>" border="0" cellspacing="4" cellpadding="0">
    <tr>
    <td>
    <table id="<%=VisualSearchEditForm.TABLE_VS_IMAGE_NAME%>">

    <tr>
        <td class="ColRow" colspan="2">
            <html:checkbox property="<%=VisualSearchEditForm.CHECKBOX_VISIBLE_IN_VS%>"><%= MessageHelper.formatMessage("visualsearchedit_ButtonIsVisibleInVisualSearch") %></html:checkbox>
            <base:helpTag helpFileName="d_visibility_visual_search_setup.htm"/>
        </td>
    </tr>
    <tr>
        <td class="FormLabel"><%= MessageHelper.formatMessage("visualsearchedit_Name") %></td>
        <td>
            <html:text property="<%=VisualSearchEditForm.FIELD_DESCRIPTION%>" size="30" maxlength="30"/>
            <base:helpTag helpFileName="d_name_visual_search_setup.htm"/>
        </td>
    </tr>
    <tr>
        <td class="FormLabel"><%= MessageHelper.formatMessage("visualsearchedit_ChangeImage") %></td>
        <td>
            <html:file property="<%=VisualSearchEditForm.FIELD_UPLOAD_FILE%>"/>
            <base:helpTag helpFileName="d_image_visual_search_setup.htm"/>
        </td>
    </tr>
    </table>
    </td>
    <!--  next table is the current image -->
    <td valign="top">
    <table id="<%=VisualSearchEditForm.TABLE_VS_CURRENT_IMAGE%>">
    <tr>
        <td class="FormLabel">&nbsp;
          <img name="<%=form.getDescription()%>" alt="<%=form.getDescription()%>" src="<%=form.getImageName()%>" width="80" height="72" />
        </td>
    </tr>
    </table>
    </td>
    <!--  save cancel table" -->
    <td valign="top">
    <table id="<%=VisualSearchEditForm.TABLE_VS_SAVE_CANCEL%>">
    <tr>
        <td class="SmallColHeading">
            <base:showHideTag id="hideSaveCancel">
                <base:saveButton onclick="hideElementhideSaveCancel()"/><br/><base:cancelButton onclick="hideElementhideSaveCancel()"/>
            </base:showHideTag>
        </td>
    </tr>
    </table>
    
    </td>
    </tr>
    
    
    
    <tr>
    <td colspan="3">
    <table  id="<%=VisualSearchEditForm.TABLE_VS_ACTION%>">
    
    
    <% if (!form.getIsGroup()) { %>
        <tr>
            <td class="FormLabel" colspan="4"><%= MessageHelper.formatMessage("visualsearchedit_Action") %><base:helpTag helpFileName="d_action_visual_search_setup.htm"/>
            </td>
        </tr>
        <tr>
          <td class="ColRowBold" colspan="4">
              <base:imageSpacer width="25" height="1"/>
              <html:radio property="<%=VisualSearchEditForm.FIELD_ACTION%>" value="<%=VisualSearchEditForm.ACTION_HYPERLINK%>"/><%= MessageHelper.formatMessage("visualsearchedit_WebsiteURL") %></td>
        </tr>
        <tr>
            <td class="FormLabel" colspan="4">
                <base:imageSpacer width="50" height="1"/>
                <html:text property="<%=VisualSearchEditForm.FIELD_URL%>" size="30" maxlength="1024"/>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold" colspan="4">
                  <base:imageSpacer width="25" height="1"/>
                  <html:radio property="<%=VisualSearchEditForm.FIELD_ACTION%>" value="<%=VisualSearchEditForm.ACTION_CATEGORY%>"/><%= MessageHelper.formatMessage("visualsearchedit_Category") %></td>
        </tr>
        <tr>
            <td class="FormLabel" colspan="4">
                <base:imageSpacer width="50" height="1"/>
                <html:select property="<%= VisualSearchEditForm.FIELD_CATEGORY_ID %>">
                <html:options collection="categoriesID" property="longID"
                    labelProperty="stringDesc"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold" colspan="4">
                  <base:imageSpacer width="25" height="1"/>
                  <html:radio property="<%=VisualSearchEditForm.FIELD_ACTION%>" value="<%=VisualSearchEditForm.ACTION_PUBLIC_LIST%>"/><%= MessageHelper.formatMessage("visualsearchedit_PublicList") %></td>
        </tr>
        <tr>
            <td class="ColRowBold" colspan="4">
                <base:imageSpacer width="50" height="1"/>
                <base:myListSelect name="<%= VisualSearchEditForm.FIELD_LIST_ID %>"
                    submitOnChange="false" prompt=""
                    publicList="true"
                    publicListIncludeMyLists="true"
                    forceIncludeMedia="true"
                    selectedMyListID="<%= form.getListID() %>"
                    descriptionTextOption='<%=MessageHelper.formatMessage("visualsearchedit_SelectAPublicList")%>'
                    inVisualSearch="true"/>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold" colspan="4">
                <base:imageSpacer width="25" height="1"/>
                <html:radio property="<%=VisualSearchEditForm.FIELD_ACTION%>" value="<%=VisualSearchEditForm.ACTION_SEARCH%>"/><%= MessageHelper.formatMessage("visualsearchedit_PowerSearch") %></td>
        </tr>
        
        <!-- This is the begining of the Power Search stuff -->
        <tr>
            <td>
                <base:imageSpacer width="50" height="1"/>
            </td>
            <td colspan="3">
                <% request.setAttribute("powerSearchVO", form.getPowerSearchVO()); %>
                <jsp:include page="/cataloging/powersearch.jsp" flush="true" >
                    <jsp:param name="isMediaSearch" value="<%=form.isMediaBookingUser()%>"/>
                </jsp:include>
            </td>
        </tr>
        <!-- This is the ending of the Power Search stuff -->
        
        <tr>
            <td colspan="4" align="center" class="FormLabel" nowrap="true">
                <base:imageSpacer width="50" height="1"/>
                <base:imageLine width="100%" height="1"/>
            </td>
        </tr>
        <tr>
            <td colspan="4" class="ColRowBold">
                <base:imageSpacer width="50" height="1"/><%= MessageHelper.formatMessage("visualsearchedit_LimitYourSearch") %></td>
        </tr>

        <tr>
            <td>
                <base:imageSpacer width="75" height="1"/>
            </td>
            <td colspan="3">
                <table border="0" cellpadding="2" cellspacing="0" id="<%=VisualSearchEditForm.TABLE_LIMITER%>">
                    <base:spanIfAllowed permission='<%= Permission.CAT_SEARCH_DISTRICT %>'>
                        <tr>
                            <td class="FormLabel tdAlignRight" nowrap><%= MessageHelper.formatMessage("visualsearchedit_LookIn") %></td>
                            <td>
                                <base:selectSiteType
                                    name="<%=VisualSearchEditForm.SEARCH_SITE_TYPE%>"
                                    selectedSiteTypeID="<%=form.getSiteTypeID()%>"
                                    mode="<%=LookupSpecs.MODE_SEARCH %>"
                                    includeForMediaSites="false" 
                                    includeForLibrarySites="true" 
                                    includeForTextbookSites="false"
                                    includeForAssetSites="false"
                                    onChangeAction="submitDropDown()"
                                    />
                            </td>
                        </tr>
                    </base:spanIfAllowed>


                                <tr>
                                    <td valign="top"
                                        class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("visualsearchedit_MaterialType") %></td>
                                    <td class="ColRow"><html:select
                                            property="<%= VisualSearchEditForm.FIELD_MATERIAL_TYPE%>"
                                            onchange="submitDropDown()">
                                            <html:options
                                                collection="materialTypesID"
                                                property="stringCode"
                                                labelProperty="stringDesc" />
                                        </html:select></td>
                                </tr>
                                <%
                                    if ((form.getMaterialType() == BibType.BIBTYPE_EBOOK || form.getMaterialType() == BibType.BIBTYPE_RECORDING_NON_MUSICAL) &&  form.isFollettShelfIntegrated()) {
                                %>
                                <tr>
                                    <td>&nbsp;</td>
                                    <td class="ColRowBold"><html:checkbox
                                            property="<%= VisualSearchEditForm.FIELD_SEARCH_ONLY_FOLLETT_SHELF %>"/>
                                           <%  if (form.getMaterialType() == BibType.BIBTYPE_EBOOK) { %> 
                                                  <%= MessageHelper.formatMessage("visualsearchedit_LimitToFollettEbooks") %>
                                          <% } else if (form.getMaterialType() == BibType.BIBTYPE_RECORDING_NON_MUSICAL) {%>
                                                  <%=MessageHelper.formatMessage("visualsearchedit_LimitToFollettAudiobooks") %> 
                                           <%} %>
                                    </td>
                                </tr>
                                <% }%>
                                <logic:equal
                                    name="<%=VisualSearchEditForm.FORM_NAME%>"
                                    property="subTypesContainData" value="true">
                                    <tr>
                                        <td valign="top"
                                            class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("visualsearchedit_Subtype") %></td>
                                        <td class="ColRow"><html:select
                                                property="<%= VisualSearchEditForm.FIELD_MATERIAL_SUB_TYPE%>">
                                                <html:options
                                                    collection="subTypesID"
                                                    property="longID"
                                                    labelProperty="stringDesc" />
                                            </html:select></td>
                                    </tr>
                                </logic:equal>

                                <tr>
                        <td valign="top" class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("visualsearchedit_PublicationYear") %></td>
                        <td class="ColRow">

                        <html:select property="<%= VisualSearchEditForm.FIELD_PUBYEAR_LIMITER%>">
                          <html:options collection="pubYearLimitersID" property="stringCode"
                                        labelProperty="stringDesc"/>
                        </html:select>&nbsp;
                        <html:text property="<%=VisualSearchEditForm.FIELD_PUBYEAR%>" size="5" maxlength="4"/>
                        </td>
                    </tr>
                   <tr>
                        <td valign="top"
                            class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("advancedsearch_CallNumber") %></td>
                        <td valign="bottom" colspan="2"
                            class="ColRow tdAlignLeft"><%=MessageHelper.formatMessage("visualsearchedit_From") %>&nbsp;<html:text
                            property="<%= VisualSearchEditForm.FIELD_CALL_NUMBER_RANGE_FROM %>"
                            size="10" /> &nbsp;<%=MessageHelper.formatMessage("visualsearchedit_To") %>&nbsp;<html:text
                            property="<%= VisualSearchEditForm.FIELD_CALL_NUMBER_RANGE_TO %>"
                            size="10" /></td>
                   </tr>
                    
                    <% if (SiteTypeSpecs.SITE_TYPE_ID_MY_LIBRARY.equals(form.getSiteTypeID())) { %>
                    <tr>
                        <td valign="middle" class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("visualsearchedit_CirculationType") %></td>
                        <td>
                            <base:circTypesList formName="<%= VisualSearchEditForm.FORM_NAME %>"/>
                        </td>
                    </tr>
                    <% } %>
                </table>
            </td>
        </tr>

        <base:spanIfNotAllowed permission='<%= Permission.CAT_SEARCH_DISTRICT %>'>
            <!-- I cannot search the district so default the selection to My Library-->
            <html:hidden property="<%= VisualSearchEditForm.SEARCH_SITE_TYPE %>" value="<%= SiteTypeSpecs.SITE_TYPE_ID_MY_LIBRARY.toString() %>" />
        </base:spanIfNotAllowed>

            <logic:equal name="<%= form.FORM_NAME %>" property="<%= form.FIELD_DISPLAY_ONE_SEARCH %>" value="true">
            
            <base:spanIfAllowed
                permissions="<%= new Permission[] { Permission.CAT_ONE_SEARCH } %>">
                <tr>
                    <td colspan="4">
                      &nbsp;
                    </td>
                </tr>
                <tr>
                    <td colspan="4">
                            <table>
                                <tr>
                                    <td class="TableHeading">
                                    <base:imageSpacer width="50" height="1"/>
                                    <html:checkbox
                                        onclick="submitDropDownOneSearchChange()"
                                        property="<%=VisualSearchEditForm.FIELD_INCLUDE_ONLINE_RESOURCES%>"></html:checkbox>
                                    <%= MessageHelper.formatMessage("visualsearchedit_IncludeOnlineResources") %>&nbsp;
                                    </td>
                                    <td><base:image src="/icons/general/onesearch.gif"
                                        width="70" height="50" align="absbottom" />
                                    </td>
                                    <td valign="top"><base:helpTag
                                        helpFileName="d_include_online_resources_visual_search_setup.htm" />
                                    </td>
                                </tr>
                            </table>
                    </td>
                </tr>
                
                
                <c:set var="formSearch" value="<%=request.getAttribute(VisualSearchEditForm.FORM_NAME)%>"/>
                
                <c:if test="${formSearch.includeOnlineResources}">
                <tr>
                    <c:choose>
                        <c:when test="${!empty formSearch.oneSearchProcessMessage}">
                            <td colspan="4" class="ColRowBold" align="Center">
                            ${formSearch.oneSearchProcessMessage}
                            </td>
                        </c:when>
                        <c:otherwise>
                            <td>
                                <base:imageSpacer width="50" height="1"/>
                            </td>
                            <td colspan="4">
                            <table id="<%= form.TABLE_ONE_SEARCH_DATABASE_LIST %>" width="100%">
                                <tr>
                                    <td>
                                        <a name="anchor"></a>
                                        <base:genericButton name="<%= form.BUTTON_SELECT_ALL%>" src="/buttons/small/selectall.gif"
                                            alt='<%= MessageHelper.formatMessage("selectAll") %>'/>&nbsp;&nbsp;
                                        <base:genericButton name="<%= form.BUTTON_CLEAR_ALL%>" src="/buttons/small/clearall.gif"
                                            alt='<%= MessageHelper.formatMessage("clearAll") %>'/>&nbsp;&nbsp;
                                    </td>
                                </tr>
                                
                                <c:set var="currentColumn" value="0"/>        
                                <c:set var="nextColumn" value="0"/>                                                                                  
                                <c:forEach var="database" items="${formSearch.oneSearchDatabases}" varStatus="status">  
                                    <c:if test="${currentColumn==0}">                                                
                                            <c:choose> 
                                                <c:when test="${empty database.value}"><%--current database is a heading --%>
                                                    <c:if test="${!status.first}">
                                                        <tr>
                                                            <td colspan="3" align="center" class="FormLabel"> 
                                                                <base:imageLine></base:imageLine>  
                                                            </td>
                                                            <td/>
                                                        </tr>
                                                        <tr>
                                                    </c:if> 
                                                    <tr>                                                       
                                                        <td class="ColHeading">
                                                            <base:image src="${database.imageFile}"/>  
                                                            &nbsp;
                                                            ${database.name}
                                                         </td>
                                                         <td/>
                                                     </tr>
                                                     <c:set var="nextColumn" value="0"/>                                                                 
                                                </c:when>
                                                <c:otherwise><%-- this is a search database --%>
                                                    <tr>
                                                         <td class="ColRow">
                                                             <c:if test="${database.checked}">
                                                               <input type="checkbox" name="${database.value}"  value="on" checked="checked"/>
                                                             </c:if>
                                                             <c:if test="${!database.checked}">
                                                               <input type="checkbox" name="${database.value}"  value="on"/>
                                                             </c:if>
                                                           ${database.name}  
                                                         </td>                                                      
                                                     <c:set var="nextColumn" value="1"/>                                                                 
                                                </c:otherwise> 
                                            </c:choose>
                                    </c:if>                                                
                                    <c:if test="${currentColumn==1}">  
                                        <c:choose> 
                                            <c:when test="${database.value==null}"><%--current database is a heading --%>
                                                    <td>&nbsp;
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td colspan="3" align="center" class="FormLabel">
                                                        <base:imageLine></base:imageLine>  
                                                    </td>
                                                    <td/>
                                                </tr>     
                                                <tr> 
                                                    <td class="ColHeading">
                                                        <base:image src="${database.imageFile}"/>  
                                                        &nbsp;
                                                        ${database.name}
                                                     </td>   
                                                     <td/>
                                                </tr>                                                                                                                                                                             
                                            </c:when>
                                            <c:otherwise><%-- this is a search database --%>   
                                                     <td class="ColRow">
                                                             <c:if test="${database.checked}">
                                                               <input type="checkbox" name="${database.value}"  value="on" checked="checked"/>
                                                             </c:if>
                                                             <c:if test="${!database.checked}">
                                                               <input type="checkbox" name="${database.value}"  value="on"/>
                                                             </c:if>
                                                           ${database.name}  
                                                     </td>     
                                                </tr>                                                                                                                            
                                            </c:otherwise>     
                                        </c:choose>  
                                        <c:set var="nextColumn" value="0"/>                                                                   
                                    </c:if>                                                
                                    <c:if test="${nextColumn == 0}">
                                        <c:set var="currentColumn" value="0"/> 
                                    </c:if>                                                
                                    <c:if test="${nextColumn == 1}">
                                        <c:set var="currentColumn" value="1"/> 
                                    </c:if>                                                
                                </c:forEach>     
                        </table>
                        </td>
                        </c:otherwise>
                    </c:choose>
                </tr>
            </c:if>
        </base:spanIfAllowed>
        </logic:equal>
        
    <% } %>
    </table>
    </td>
    </tr>
</table>

</base:form>
