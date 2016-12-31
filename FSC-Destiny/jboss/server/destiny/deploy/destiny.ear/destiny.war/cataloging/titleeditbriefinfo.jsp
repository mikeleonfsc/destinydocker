<%@page import="com.follett.fsc.common.StringHelper"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.jsptag.MarcEditLineTag"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>

<%-- @include file="/common/trapenter.jsp" --%>
<%-- Delete this code and enable the above include after fixing compile jsp --%>

<script language="JavaScript">
<!--
    function trapEnter(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        return false;
      }
      return true;
    }
    function findHeadingForTag(tagNumber, tagID)
    {
        document.forms["cataloging_servlet_TitleEditForm"].elements["findHeadingTagID"].value = tagID;
        document.forms["cataloging_servlet_TitleEditForm"].elements["findHeadingTagNumber"].value = tagNumber;

        //Submit the form
        document.forms["cataloging_servlet_TitleEditForm"].submit();
    }
    
    function updateMaterial()
    {
        document.forms["cataloging_servlet_TitleEditForm"].elements["updateMaterialType"].value = "Update";
        // TitleEditForm.BUTTON_VALUE_UPDATE

        //Submit the form
        document.forms["cataloging_servlet_TitleEditForm"].submit();
    }    
    
  //-->
</script>

<bean:define id="materialTypesID" name="<%=TitleEditForm.FORM_NAME%>" property="materialTypes"/>
<bean:define id="bibSubTypesID" name="<%=TitleEditForm.FORM_NAME%>" property="bibSubTypes"/>

<base:messageBox strutsErrors="true"/>
<%
    TitleEditForm form = (TitleEditForm)request.getAttribute( TitleEditForm.FORM_NAME );
%>


<base:form action="/cataloging/servlet/handletitleeditform.do" focus="title">
    <INPUT type="hidden" name="page" value="1">

    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">
    <INPUT type="hidden" name="<%= TitleEditForm.BUTTON_NAME_UPDATE_MATERIAL_TYPE%>" value="">
    <html:hidden property="archiveMaterialType" />
    <html:hidden property="action" />
    <html:hidden property="duplicateBibID" />
    <html:hidden property="changesMade" />

  <jsp:include page="/cataloging/titleeditconfirm.jsp" flush="true" />


<table border="0" width="95%" id="<%=TitleEditForm.TABLE_EASY_EDIT_TABS%>" cellpadding="0" cellspacing="0">
  <jsp:include page="/cataloging/titleedittabs.jsp" flush="true">
      <jsp:param name="callingPage" value="briefInformation"/>
  </jsp:include>

  <tr>
    <td>
      <base:outlinedTableAndTabsWithinThere cellpadding="3" borderColor='#C0C0C0' id="<%=TitleEditForm.TABLE_BRIEF_INFO_PAGE%>" width="100%" selectedTabID="<%=form.getSelectedTab()%>" selectedTab="<%=form.getSelectedTab()%>" tabs="<%=form.getTabs() %>">
        <tr>
          <td class="FormLabel"><%= MessageHelper.formatMessage("titleeditbriefinfo_TitleInformation") %></td>
           <td class="tdAlignRight">
                <base:genericButton 
                    name="<%=TitleEditForm.BUTTON_NAME_MARC_EDITOR%>" 
                    src="/buttons/large/usemarceditor.gif" 
                    alt='<%= MessageHelper.formatMessage("useMarcEditor") %>' absbottom="true"
                />
           </td>
        </tr>
        <logic:equal name="<%=TitleEditForm.FORM_NAME%>" property="hiddenFieldInMarc" value="true">
            <tr>
                <td colspan="2" class="Instruction tdAlignRight"><%= MessageHelper.formatMessage("titleeditbriefinfo_ThisTitleHasMoreInformationAvailableFromTheMARC") %></td>
            </tr>
        </logic:equal>
        <tr>
           <td>&nbsp;</td>
           <td class="Instruction"><%= MessageHelper.formatMessage("titleeditbriefinfo_LeadingArticle") %></td>
        </tr>
        <tr>
          <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("titleeditbriefinfo_Title") %></td>
          <td class="ColRow">
            <html:text property="<%=TitleEditForm.FIELD_TITLE_ARTICLE%>" size="4" maxlength="8"/>
            <html:text property="<%=TitleEditForm.FIELD_TITLE%>" size="60" maxlength="1000"/>
            <base:helpTag helpFileName="d_title_field_brief_title_tab_LM_MM.htm"/>
          </td>
        </tr>
        <tr>
          <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("titleeditbriefinfo_Subtitle") %></td>
          <td class="ColRow">
            <html:text property="<%=TitleEditForm.FIELD_SUBTITLE%>" size="60" maxlength="1000"/>
            <base:helpTag helpFileName="d_subtitle_title_LM.htm"/>
          </td>
        </tr>
        <tr>
          <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("titleeditbriefinfo_Authors") %></td>
          <td class="ColRow">
            <html:text property="<%=TitleEditForm.FIELD_RESPONSIBILITY%>" size="60" maxlength="1000"/>
            <base:helpTag helpFileName="d_responsibility_title_LM.htm"/>
          </td>
        </tr>
        <tr>
          <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("titleeditbriefinfo_Edition") %></td>
          <td class="ColRow">
              <html:text property="<%=TitleEditForm.FIELD_EDITION%>" size="60" maxlength="1000"/>
              <base:helpTag helpFileName="d_edition_title_LM.htm"/>
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <base:imageLine height="1" width="100%"/>
          </td>
        </tr>
        <tr>
          <td colspan="2" class="FormLabel"><%= MessageHelper.formatMessage("titleeditbriefinfo_StandardNumbers") %></td>
        </tr>
        <tr>
          <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("titleeditbriefinfo_LCCN") %></td>
          <td>
            <table cellpadding="3" cellspacing="0" border="0">
                <tr>
                    <td>
                      <html:text property="<%=TitleEditForm.FIELD_LCCN%>" size="16" maxlength="1000"/>
                    </td>
                    <td class="FormLabel"><%= MessageHelper.formatMessage("titleeditbriefinfo_ISBN") %></td>
                    <td>
                        <span onKeyPress="return trapEnter(event);">
                            <html:text property="<%=TitleEditForm.FIELD_ISBN%>" size="16" maxlength="1000"/>
                        </span>
                    </td>
                    <td class="FormLabel"><%= MessageHelper.formatMessage("titleeditbriefinfo_ISSN") %></td>
                    <td>
                      <html:text property="<%=TitleEditForm.FIELD_ISSN%>" size="16" maxlength="1000"/>
                    </td>
                </tr>
            </table>
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <base:imageLine height="1" width="100%"/>
          </td>
        </tr>
        <tr>
          <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("titleeditbriefinfo_MaterialType") %></td>
          <td class="FormElement">
          <% if (form.checkForFollettShelf() && (form.isShelfBib() || form.isResoldShelfBib())) { %> 
             <%=    form.getMaterialTypeDescription() %>
            <% } else { %>
            <html:select property="<%=TitleEditForm.FIELD_MATERIAL_TYPE%>"  onchange="javascript:updateMaterial()">
              <html:options collection="materialTypesID" property="stringCode"
                            labelProperty="stringDesc"/>
            </html:select>
            <base:helpTag helpFileName="d_material_type_title_LM.htm"/>
            <% } %>
          </td>
        </tr>
        <%if (form.getBibSubTypes().size() > 1 && !form.isResoldShelfBib()) {%>
            <tr>
            <td class="FormLabel tdAlignRight" valign="top"><b><%= MessageHelper.formatMessage("titleeditbriefinfo_Subtype") %></b></td>
            <td class="FormElement" colspan="7" valign="top">
                 <html:select property="<%=TitleEditForm.FIELD_BIB_SUBTYPE%>">
                     <html:options collection="bibSubTypesID" property="stringCode" labelProperty="stringDesc"/>
                 </html:select>            
            </td>
            </tr>
        <%} %>
        <%if (form.isDigitalTitle()) { %> 
            <tr>
            <td>&nbsp;</td>
            <td class="Instruction" valign="top" colspan="8"><font color="#cc0000">This is a <%=form.getDigitalContentProviderName() %> title.</font></td>
            </tr>
        <%} %>        
        <tr>
          <td colspan="2">
            <base:imageLine height="1" width="100%"/>
          </td>
        </tr>
        <tr>
          <td class="FormLabel"><%= MessageHelper.formatMessage("titleeditbriefinfo_Author") %></td>
          <td class="FormLabel tdAlignRight" rowspan="2">
            <base:showHideTag id="onFindHeading">
                <% String jsString = "javascript:findHeadingForTag(\"100\", \"" + form.getAuthorTagID() + "\")"; %>
                <a href='<%=jsString%>' id="<%=MarcEditLineTag.ID_FIND_HEADING %>"><base:image src="/buttons/large/findheading.gif" onClick="hideElementonFindHeading()" alt='<%=MessageHelper.formatMessage("findHeading")%>'/></a>
            </base:showHideTag>
          </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
        </tr>
        <tr>
          <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("titleeditbriefinfo_Name") %></td>
          <td class="ColRow">
            <html:text property="<%=TitleEditForm.FIELD_AUTHOR%>" size="60" maxlength="1000"/>
            <base:helpTag helpFileName="d_author_name_LM_MM.htm"/>
          </td>
        </tr>
        <tr>
          <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("titleeditbriefinfo_Dates") %></td>
          <td class="ColRow">
            <html:text property="<%=TitleEditForm.FIELD_AUTHOR_DATES%>" size="60" maxlength="1000"/>
            <base:helpTag helpFileName="d_dates_title_LM.htm"/>
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <base:imageLine height="1" width="100%"/>
          </td>
        </tr>
        <tr>
          <td colspan="2" class="FormLabel"><%= MessageHelper.formatMessage("titleeditbriefinfo_PublicationInformation") %></td>
        </tr>
        <tr>
          <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("titleeditbriefinfo_Place") %></td>
          <td class="ColRow">
            <html:text property="<%=TitleEditForm.FIELD_PLACE%>" size="60" maxlength="1000"/>
            <base:helpTag helpFileName="d_place_of_publication_title_LM.htm"/>
          </td>
        </tr>
        <tr>
          <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("titleeditbriefinfo_Publisher") %></td>
          <td class="ColRow">
            <html:text property="<%=TitleEditForm.FIELD_PUBLISHER%>" size="60" maxlength="1000"/>
            <base:helpTag helpFileName="d_publisher_title_LM.htm"/>
          </td>
        </tr>
        <tr>
          <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("titleeditbriefinfo_Date") %></td>
          <td class="ColRow">
            <html:text property="<%=TitleEditForm.FIELD_PUBDATE%>" size="60" maxlength="1000"/>
            <base:helpTag helpFileName="d_date_title_LM.htm"/>
          </td>
        </tr>
        <% if (form.getMarc().doesConformToRda()) { %>
            <tr>
              <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("titleeditbriefinfo_Copyright") %></td>
              <td class="ColRow">
                <html:text property="<%=TitleEditForm.FIELD_COPYRIGHT%>" size="60" maxlength="1000"/>
              </td>
            </tr>
        <% } %>
        <tr>
          <td colspan="6">
            <base:imageLine height="1" width="100%"/>
          </td>
        </tr>
        <tr>
          <td colspan="2" class="FormLabel"><%= MessageHelper.formatMessage("titleeditbriefinfo_PhysicalDescription") %></td>
        </tr>
        <tr>
          <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("titleeditbriefinfo_Extent") %></td>
          <td class="ColRow">
            <html:text property="<%=TitleEditForm.FIELD_EXTENT%>" size="60" maxlength="1000"/>
            <base:helpTag helpFileName="d_extent_title_LM.htm"/>
          </td>
        </tr>
        <tr>
          <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("titleeditbriefinfo_OtherDetails") %></td>
          <td class="ColRow">
            <html:text property="<%=TitleEditForm.FIELD_OTHER_DETAIL%>" size="60" maxlength="1000"/>
            <base:helpTag helpFileName="d_other_details_title_LM.htm"/>
          </td>
        </tr>
        <tr>
          <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("titleeditbriefinfo_Size") %></td>
          <td class="ColRow">
            <html:text property="<%=TitleEditForm.FIELD_SIZE%>" size="60" maxlength="1000"/>
            <base:helpTag helpFileName="d_size_title_LM.htm"/>
          </td>
        </tr>
        <tr>
            <td class="Instruction"><%= MessageHelper.formatMessage("titleeditbriefinfo_RequiredField") %></td>
        </tr>
      </base:outlinedTableAndTabsWithinThere>
    </td>
  </tr>
    <tr>
        <td>
        <jsp:include page="/cataloging/titlefooter.jsp"/>
        </td>
    </tr>
</table>

</base:form>
