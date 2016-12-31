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


<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>

<bean:define id="form" name="form" type="com.follett.fsc.destiny.client.cataloging.servlet.RemoveTitlesForm"/>

<base:form action="/cataloging/servlet/handleremovetitles.do">
<c:set var="textbkwithoutcopies" value="<%= RemoveTitlesForm.OPTION_TITLES_WITHOUT_COPIES %>"/>
<c:set var="byadoptionyear" value="<%= RemoveTitlesForm.OPTION_TITLES_BASED_ON_ADOPTION %>"/>

<%
    ActionMessages errors = TagUtils.getInstance().getActionMessages(pageContext, Globals.ERROR_KEY);
    if ((errors == null || errors.size() == 0) && URLHelper.buttonWasPressed(request, RemoveTitlesForm.ID_BUTTON_REMOVE_TITLES)) { 
%>
    <base:messageBox showRedBorder="true">
    <tr>
        <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
        <td valign="baseline" class="Error">
            <c:set var="message">
                <c:choose>
                    <c:when test="${form.removeTypeLibrary}"> 
                        <%= MessageHelper.formatMessage("removetitles_LibraryTitlesWithoutCopies") %>
                    </c:when>
                    <c:when test="${form.removeTypeMedia}"> 
                        <%= MessageHelper.formatMessage("removetitles_MediaTitlesWithoutCopiesWillBeRemoved") %>
                    </c:when>
                    <c:when test="${form.removeTypeTextbook}">
                        <c:choose>
                            <c:when test="${form.textbookOptions==textbkwithoutcopies}">
                                <%= MessageHelper.formatMessage("removetitles_TextbookTitlesWithoutCopiesWillBeRemovedFrom") %>
                            </c:when>
                            <c:otherwise>
                                <%= MessageHelper.formatMessage("removetitles_TextbookTitlesWithAdoptionYear", form.getTbAdoptionYear()) %><br>
                                <base:isStateContext><%= MessageHelper.formatMessage("removetitles_ThisIncludesCopiesWithAStatusOfInTransit") %></base:isStateContext>
                                <base:isNotStateContext><%= MessageHelper.formatMessage("removetitles_ThisIncludesTitlesThatArePartOfAForecastAndCopies") %></base:isNotStateContext>
                            </c:otherwise>
                        </c:choose>                    
                    </c:when>
                </c:choose>
            </c:set>
            <p align="center"> ${message}</p>
            <p align="center"><%= MessageHelper.formatMessage("removetitles_ThisProcessCannotBeReversed") %></p>
            <p align="center"><%= MessageHelper.formatMessage("removetitles_AreYouSureYouWantToProceed") %></p>
            <div align="center">
                <base:yesNo 
                    buttonYesName="${form.constants.BUTTON_CONFIRM_YES}"
                    buttonNoName="${form.constants.BUTTON_CONFIRM_NO}"
                />
            </div>
        </td>
    </tr>
    </base:messageBox>
<%
    }
%>
<base:outlinedTableAndTabsWithinThere id="${form.constants.TABLE_REMOVE_TITLES}"  selectedTab="${form.constants.ID_TAB}" tabs="<%=UpdateTitlesNavigationForm.getTabs()%>" >
    <tr>
      <td class="ColRowBold" align="center" valign = "middle" colspan = "2">
           <% if (LocaleHelper.isInternationalProduct()) { %>
                <%= MessageHelper.formatMessage("removetitles_RemoveAllLibraryTitlesWithoutCopies") %>
           <% } else { %>
               <!-- TODO I18N - IMPORTANT: NOT addressing the following concatenated text; currently, we only need a
                    single sentence for the International product since only Library Manager will exist (see block above);
                    no dropdown is needed for international.  If we ever allow Media/Textbook to be added on the the
                    international product, we'll need to address this concatenation. -->
               <%= MessageHelper.formatMessage("removetitles_RemoveAll") %> 
               <%=form.generateDropDownHtml() %>            
               <c:choose>
                    <c:when test="${form.removeTypeTextbook}">
                       <%= MessageHelper.formatMessage("removetitles_Titles") %> 
                       <c:if test = "${form.textbookOptions==byadoptionyear}">
                        <%= MessageHelper.formatMessage("removetitles_AndCopies") %>
                       </c:if>
                       &nbsp;
                        <html:select onchange="javascript:submitTheForm()" property="<%=RemoveTitlesForm.FIELD_TEXTBOOK_OPTIONS%>">
                            <html:option value='<%="" + RemoveTitlesForm.OPTION_TITLES_WITHOUT_COPIES%>'><%= MessageHelper.formatMessage("removetitles_WithoutCopies") %></html:option>
                            <html:option value='<%="" + RemoveTitlesForm.OPTION_TITLES_BASED_ON_ADOPTION%>'><%= MessageHelper.formatMessage("removetitles_BasedOnYearAdoptionEnds") %></html:option>
                        </html:select>
                    </c:when>
                    <c:otherwise>
                        <%= MessageHelper.formatMessage("removetitles_TitlesWithoutCopies") %>
                    </c:otherwise>
               </c:choose>
           <% } %>
      </td>
    </tr>

    <base:isDistrictUser>
    <tr>
      <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("removetitles_From") %>&nbsp;</td>
      <td class="ColRow">
          <base:isStateContext>
            <html:hidden property="${form.constants.FIELD_SITE_ID}" />
            ${form.stateSiteName}
          </base:isStateContext>
          <base:isNotStateContext>
          <base:selectSite 
                      name="${form.constants.FIELD_SITE_ID}" 
                      submitOnChange="true" 
                      selectedSiteID="${form.siteID}" 
                      includeAllLibraries="true"
                      includeLibrarySites='${form.removeTypeLibrary}'
                      includeTextbookSites='${form.removeTypeTextbook}'
                      includeMediaSites='${form.removeTypeMedia}'
                      includeAssetSites="false"
                      />
          </base:isNotStateContext>
      </td>
    </tr>
    </base:isDistrictUser>
    
    <c:choose>
        <c:when test="${form.textbookOptions==textbkwithoutcopies}">
        <html:hidden property="<%= RemoveTitlesForm.FIELD_TB_FORGIVE_FINES %>" value="on"/>
        <html:hidden property="<%= RemoveTitlesForm.FIELD_TB_REMOVE_CHECKEDOUT_COPIES %>" value="on"/>
    <!-- without copies -->
    
    <tr>
      <td class="tdAlignRight"><html:checkbox property="${form.constants.FIELD_PRESERVE_EBOOKS}"/></td>
      <td class="ColRow">
        <c:choose>
            <c:when test="${form.removeTypeTextbook}"> 
                <%= MessageHelper.formatMessage("removetitles_PreserveETextbooks") %>
            </c:when>
            <c:otherwise>
                <%= MessageHelper.formatMessage("removetitles_PreserveEBooks") %>
            </c:otherwise>
        </c:choose>
      </td>
    </tr>

    <c:choose>
        <c:when test="${(form.removeTypeLibrary || form.removeTypeMedia) && form.displayDigitalMedia}">
            <tr>
              <td class="tdAlignRight"><html:checkbox property="${form.constants.FIELD_PRESERVE_DIGITAL_MEDIA}"/></td>
              <td class="ColRow"><%= MessageHelper.formatMessage("removetitles_PreserveDigitalResourceTitles") %></td>
            </tr>
        </c:when>
        <c:otherwise>
            <html:hidden property="${form.constants.FIELD_PRESERVE_DIGITAL_MEDIA}"/>
        </c:otherwise>
    </c:choose>
    <c:choose>
        <c:when test="${form.removeTypeLibrary || form.removeTypeMedia}">
            <tr>
              <td class="tdAlignRight"><html:checkbox property="${form.constants.FIELD_PRESERVE_856_LINKS}"/></td>
              <td class="ColRow"><%= MessageHelper.formatMessage("removetitles_PreserveTitlesWith856Links") %></td>
            </tr>
        </c:when>
        <c:otherwise>
            <html:hidden property="${form.constants.FIELD_PRESERVE_856_LINKS}"/>
        </c:otherwise>
    </c:choose>
    
    <tr>
        <td class="tdAlignRight"><html:checkbox property="${form.constants.FIELD_PRESERVE_NEWER_TITLES}"/></td>
        <td class="ColRow"><%= MessageHelper.formatMessage("removetitles_PreserveTitlesAddedSince") %><base:date buttonName="${form.constants.BUTTON_CALENDAR}"
                fieldName="${form.constants.FIELD_PRESERVE_NEWER_TITLES_DATE}"
                dateValue="${form.preserveNewerTitlesDate}"
                altText='<%= MessageHelper.formatMessage("datetag_ChangeDate") %>'
            />
        </td>
    </tr>

 <!-- end without copies -->
    </c:when>
    <c:otherwise>
        <html:hidden property="<%= RemoveTitlesForm.FIELD_PRESERVE_EBOOKS %>" value="on"/>
        <html:hidden property="<%= RemoveTitlesForm.FIELD_PRESERVE_NEWER_TITLES %>" value="on"/>
 
 <!-- adoption select -->
    <tr>
        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("removetitles_WhenAdoptionEndsIn") %></td>
        <td>
            <html:text size="5" maxlength="4" property="${form.constants.FIELD_TB_ADOPTION_YEAR}"  />
        </td>
    </tr>
    <!-- If user is logged in to the District Warehouse or the selected site is a District Warehouse, then this -->
    <!-- block of code isn't executed and there will be no FIELD_TB_REMOVE_CHECKEDOUT_COPIES parameter on the request -->
    <!-- This will result in the form parameter tbRemoveCheckedOutCopies being set to false -->
    <% if (!form.getStore().isAtDistrictWarehouse() && !form.selectedSiteIsADistrictWarehouse()) { %>
        <tr>
            <td class="tdAlignRight"><html:checkbox property="${form.constants.FIELD_TB_REMOVE_CHECKEDOUT_COPIES}"/></td>
            <td class="ColRow"><%= MessageHelper.formatMessage("removetitles_RemoveCheckedOutCopies") %></td>
        </tr>
    <% } %>
    <base:isNotStateContext>
        <tr>
          <td class="tdAlignRight"><html:checkbox property="${form.constants.FIELD_TB_FORGIVE_FINES}"/></td>
          <td class="ColRow"><%= MessageHelper.formatMessage("removetitles_ForgiveFinesAssociatedWithDeletedCopies") %></td>
        </tr>
     </base:isNotStateContext>
    <tr>
        <td class="tdAlignRight"><html:checkbox property="${form.constants.FIELD_TB_TRACK_AS_WEEDED}"/></td>
        <td class="ColRow"><%= MessageHelper.formatMessage("removetitles_TrackAsWeeded") %></td>
    </tr>
 <!-- end adoption select -->
      </c:otherwise>
    </c:choose>

    <base:isDistrictUser>
        <base:isStateContext>
            <html:hidden property="${form.constants.FIELD_DELETE_TITLES_WITH_NO_COPIES}" value="true" />
        </base:isStateContext>
        <base:isNotStateContext>
                <c:if test="${form.textbookOptions==textbkwithoutcopies}">
                <tr>
                  <td class="tdAlignRight"><html:checkbox property="${form.constants.FIELD_DELETE_TITLES_WITH_NO_COPIES}"/></td>
                  <td class="ColRow"><%= MessageHelper.formatMessage("removetitles_DeleteTitlesWithNoCopiesLeftInTheDistrict") %></td>
                </tr>
                </c:if>
                <c:if test="${form.textbookOptions!=textbkwithoutcopies}">
                     <html:hidden property="${form.constants.FIELD_DELETE_TITLES_WITH_NO_COPIES}" value="true" />
                </c:if>
        </base:isNotStateContext>
    </base:isDistrictUser>

    <tr>
        <td class="ColRowBold" align="center" valign="top" colspan="2">
            <%= GenericForm.getLastBackupDisplayMsg(true) %>
        </td>
    <tr>


    <tr>
      <td align="center" colspan="2">
        <base:genericButton src="/buttons/large/preview2.gif" name="${form.constants.ID_BUTTON_PREVIEW}" alt='<%= MessageHelper.formatMessage("preview") %>'/>
        <base:genericButton src="/buttons/large/removetitles.gif" name="${form.constants.ID_BUTTON_REMOVE_TITLES}" alt='<%= MessageHelper.formatMessage("remove") %>'/>
      </td>
    </tr>
</base:outlinedTableAndTabsWithinThere>

</base:form>
 <SCRIPT LANGUAGE="javascript" TYPE="text/javascript">
    <!--
        function submitTheForm() {
            document.<%=RemoveTitlesForm.FORM_NAME%>.submit();
        }
    // -->
    </SCRIPT>
