<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.Permission"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<script language="JavaScript" type="text/javascript">
  <!--
    function updateMaterial()
    {
        document.forms["cataloging_servlet_TitleEditForm"].elements["updateMaterialType"].value = "Update";
        // TitleEditForm.BUTTON_VALUE_UPDATE

        //Submit the form
        document.forms["cataloging_servlet_TitleEditForm"].submit();
    }
    
    function updateBST()
    {
        document.forms["cataloging_servlet_TitleEditForm"].elements["updateBibSubType"].value = "Update";
        // TitleEditForm.BUTTON_VALUE_UPDATE

        //Submit the form
        document.forms["cataloging_servlet_TitleEditForm"].submit();
    }

    function editTag(tagID)
    {
        document.forms["cataloging_servlet_TitleEditForm"].elements["editTagID"].value = tagID;

        //Submit the form
        document.forms["cataloging_servlet_TitleEditForm"].submit();
    }
    function showQuizRows()
    {
        document.forms["cataloging_servlet_TitleEditForm"].elements["hideLocalQuizzes"].value = "false";
        document.forms["cataloging_servlet_TitleEditForm"].elements["clickedShowLocalQuizzes"].value = "true";

        //Submit the form
        document.forms["cataloging_servlet_TitleEditForm"].submit();
    }
    function findHeadingForTag(tagNumber, tagID)
    {
        document.forms["cataloging_servlet_TitleEditForm"].elements["findHeadingTagID"].value = tagID;
        document.forms["cataloging_servlet_TitleEditForm"].elements["findHeadingTagNumber"].value = tagNumber;

        //Submit the form
        document.forms["cataloging_servlet_TitleEditForm"].submit();
    }
  //-->
</script>

<bean:define id="materialTypesID" name="<%=TitleEditForm.FORM_NAME%>" property="materialTypes"/>
<bean:define id="bibSubTypesID" name="<%=TitleEditForm.FORM_NAME%>" property="bibSubTypes"/>
<%
    TitleEditForm form = (TitleEditForm)request.getAttribute( TitleEditForm.FORM_NAME );
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>

<base:messageBox strutsErrors="true"/>
<base:form action="/cataloging/servlet/handletitleeditform.do">

<% if (request.getAttribute(TitleEditForm.ATTRIBUTE_SHOW_USE_DEFAULTS_CONFIRMATION) != null) { %>
<base:messageBox>
	<tr>
		<td align="center" class="ColRowBold"><%= MessageHelper.formatMessage("titleeditmarcformat_AllChangesMadeToThisTemplateWillBeClearedAndThe") %></td>
	</tr>
	<tr>
		<td align="center" class="ColRow"><%= MessageHelper.formatMessage("titleeditmarcformat_AreYouCertainThatYouWantToRestoreTheDefault") %></td>
	</tr>
	<tr>
		<td align="center" >
			<base:yesNo buttonNoName="<%=TitleEditForm.BUTTON_CANCEL_DEFAULT%>"/>
		</td>
	</tr>
</base:messageBox>
<% } %>

<INPUT type="hidden" name="page" value="6">
<!-- space this similar to brief page -->
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">
<INPUT type="hidden" name="<%= TitleEditForm.BUTTON_NAME_UPDATE_MATERIAL_TYPE%>" value="">
<INPUT type="hidden" name="<%= TitleEditForm.BUTTON_NAME_UPDATE_BIB_SUB_TYPE%>" value="">
<input type="hidden" name="editTagID" value="<%= TitleEditForm.NOT_EDITING_TAG_ID_STRING %>">
<html:hidden property="archiveMaterialType" />
<html:hidden property="changesMade" />
<html:hidden property="editTemplates"/>
<html:hidden property="<%=TitleEditForm.PARAM_HIDE_LOCAL_QUIZZES%>"/>
<html:hidden property="<%=TitleEditForm.PARAM_CLICKED_SHOW_LOCAL_QUIZZES%>"/>

<jsp:include page="/cataloging/titleeditconfirm.jsp" flush="true" />

<table border="0" width="95%" id="<%=TitleEditForm.TABLE_EASY_EDIT_TABS%>" cellpadding="0" cellspacing="0">

    <html:hidden property="findHeadingTagID" />
    <html:hidden property="findHeadingTagNumber" />

<% if (form.isChangesMade() && form.getErrors().size() == 0 && (request.getAttribute(TitleEditForm.ATTRIBUTE_SHOW_USE_DEFAULTS_CONFIRMATION) == null)) { %>
    <tr>
        <td>
            <TABLE id="<%= TitleEditForm.TABLE_UNSAVED_CHANGES %>" align="center" width="100%" frame="box" rules="none" bordercolor="#CC0000" cellpadding="3" cellspacing="1" style="border: 1px single #CC0000;">
                <TR>
                    <TD align="center">
                        <%=MessageBoxTag.getCAUTION_IMAGE_HTML()%>
                    </TD>
                    <TD align="center" class="Error">
                        <%= MessageHelper.formatMessage("titleeditmarcformat_TitleHasUnsavedChanges") %>
                    </TD>
                    <td class="ColRowBold tdAlignRight">
                        <logic:equal name="<%=TitleEditForm.FORM_NAME%>" property="editTemplates" value="false">
                        <SCRIPT language=javascript>
                        <!--
                        function synchPunctuationButtonsExtra() {
                            document.cataloging_servlet_TitleEditForm.checkPunctuationOnSave.checked = document.cataloging_servlet_TitleEditForm.checkPunctuationOnSaveExtra.checked;
                        }
                        -->
                        </script>                    
                        <html:checkbox onclick="synchPunctuationButtonsExtra()" name="<%=TitleEditForm.FORM_NAME%>" property="<%=TitleEditForm.CHECK_PUNCTUATION_ON_SAVE_EXTRA%>"><%= MessageHelper.formatMessage("titleeditmarcformat_CheckPunctuationOnSave") %></html:checkbox>
                        </logic:equal>
                        <br>
                        <base:showHideTag id="onSaveHeader">
                            <base:genericButton alt='<%= MessageHelper.formatMessage("saveTitle") %>' src="/buttons/large/savetitle.gif" onclick="hideElementonSaveHeader()" name="<%=TitleEditForm.BUTTON_NAME_SAVE_TITLE %>"/>
                            <base:imageSpacer width="19" height="16"/>
                            <base:cancelButton name="<%=TitleEditForm.BUTTON_NAME_CANCEL_TITLE %>"/>
                        </base:showHideTag>
                    </TD>
                </TR>
            </TABLE>
      </td>
    </tr>
    <tr>
        <td align="center" class="Error">
            &nbsp;
        </td>
    </tr>
<% } %>




  <tr>
    <td colspan="2">
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value='<%= MessageHelper.formatMessage("saveTitle") %>'  name="saveTitleOnEnter">    
<% // This table can't be less than 100% or the tabs will be misaligned %>
      <base:outlinedTable borderColor='#C0C0C0' width="100%">
        <tr>
           <td><span class = "ColRowBold"><%= MessageHelper.formatMessage("titleeditmarcformat_Title") %>&nbsp;</span><span class="ColRow"><%=form.gimmeFullTitle() %></span></td>
           <td class="tdAlignRight">
                <logic:equal name="<%=TitleEditForm.FORM_NAME%>" property="editTemplates" value="false">
           
                <base:genericButton 
                    name="<%=TitleEditForm.BUTTON_NAME_EASY_EDITOR%>" 
                    src="/buttons/large/useeasyeditor.gif" 
                    alt='<%= MessageHelper.formatMessage("useEasyEditor") %>' absbottom="true"
                />
                </logic:equal>
                <logic:equal name="<%=TitleEditForm.FORM_NAME%>" property="editTemplates" value="true">
                &nbsp;
                </logic:equal>
           </td>
        </tr>
        <tr>
            <td colspan="2"><base:imageLine height="1" width="100%"/></td>
        </tr>
      
      
        <tr><td colspan="2"><table id="<%=TitleEditForm.TABLE_MARC_EDIT%>" border="0" cellpadding="2" cellspacing="0">
        <% int countHeaderRows = 0; %>
        <tr><% countHeaderRows++; %>
            <td class="SmallColHeading tdAlignRight"><b><%= MessageHelper.formatMessage("titleeditmarcformat_MaterialType") %></b></td>
            
            <logic:equal name="<%=TitleEditForm.FORM_NAME%>" property="editTemplates" value="true">
	            <td class="ColRowBold" colspan="5">
	                <bean:write name="<%= TitleEditForm.FORM_NAME%>" property="templateMaterialType"/>
                    <html:hidden property="<%= TitleEditForm.FIELD_TEMPLATE_MATERIAL_TYPE_ID%>"/>
	            </td>
            </logic:equal>
            <logic:notEqual name="<%=TitleEditForm.FORM_NAME%>" property="editTemplates" value="true">
	            <td class="FormElement" colspan="5">
                   <% if (form.checkForFollettShelf() && (form.isShelfBib() || form.isResoldShelfBib())) { %> 
                          <%=    form.getMaterialTypeDescription() %>
                   <% } else { %>
                           <html:select property="<%=TitleEditForm.FIELD_MATERIAL_TYPE%>" onchange="javascript:updateMaterial()">
                               <html:options collection="materialTypesID" property="stringCode" labelProperty="stringDesc"/>
                           </html:select>
                           <base:helpTag helpFileName="d_material_type_title_LM.htm"/>
                   <% } %>
	            </td>
            </logic:notEqual>
                        
            <td colspan="2">
                <base:genericButton alt='<%= MessageHelper.formatMessage("addTag") %>' src="/buttons/large/addtag.gif" name="<%=TitleEditForm.BUTTON_NAME_ADD_TAG%>"/>
            </td>
        </tr>
        <logic:equal name="<%=TitleEditForm.FORM_NAME%>" property="editTemplates" value="true">
        <%if (form.getSubTypesDescriptions().length() > 1) {%>
            <tr><% countHeaderRows++; %>
            <td class="SmallColHeading tdAlignRight" valign="top"><b><%= MessageHelper.formatMessage("titleeditmarcformat_Subtypes") %></b></td>
            <td class="ColRowBold" colspan="7" valign="top">
            
            <%=form.getSubTypesDescriptions() %>    

            </td>
            </tr>
        <%} %>
        </logic:equal>
        <logic:notEqual name="<%=TitleEditForm.FORM_NAME%>" property="editTemplates" value="true">
        <%if (form.getBibSubTypes().size() > 1 && !form.isResoldShelfBib()) {%>
            <tr><% countHeaderRows++; %>
            <td class="SmallColHeading tdAlignRight" valign="top"><b><%= MessageHelper.formatMessage("titleeditmarcformat_Subtype") %></b></td>
            <td class="ColRowBold" colspan="7" valign="top">
                 <html:select property="<%=TitleEditForm.FIELD_BIB_SUBTYPE%>" onchange="javascript:updateBST()">
                     <html:options collection="bibSubTypesID" property="stringCode" labelProperty="stringDesc"/>
                 </html:select>            
            </td>
            </tr>
        <%} %>
        </logic:notEqual>

      <jsp:include page="/cataloging/marctagedit.jsp" flush="true">
        <jsp:param name="myForm" value="<%=TitleEditForm.FORM_NAME%>"/>
        <jsp:param name="countHeaderRows" value="<%=countHeaderRows%>"/>
      </jsp:include>
        <tr>
            <td colspan="8" class="tdAlignRight">
                <base:genericButton alt='<%= MessageHelper.formatMessage("addTag") %>' src="/buttons/large/addtag.gif" name="<%=TitleEditForm.BUTTON_NAME_ADD_TAG%>"/>
            </td>
        </tr>
            <logic:notEqual name="<%= TitleEditForm.FORM_NAME %>" property="editTemplates" value="true">
            <base:spanIfAllowed permission="<%=Permission.CAT_AED_DIGITAL_RESOURCES%>">
                <tr>
                    <td colspan="8">
                        &nbsp;
                    </td>
                </tr>
                <tr>
                    <td colspan="8">
                        <base:imageLine/>
                    </td>
                </tr>
                <tr>
                    <td colspan="8">
                        <base:helpIcons buttonsToOutput="<%=new int[]{HelpIconsTag.ICON_FIND_HEADING, HelpIconsTag.ICON_AED_DIGITAL_RESOURCE} %>"></base:helpIcons>
                    </td>
                </tr>
            </base:spanIfAllowed>
            </logic:notEqual>
        </table></td></tr>
      </base:outlinedTable>
    </td>
  </tr>
  <tr>
    <td>
    <jsp:include page="/cataloging/titlefooter.jsp"/>
    </td>
  </tr>
</table>

</base:form>
