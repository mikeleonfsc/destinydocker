<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.jsptag.MarcEditLineTag"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<bean:define id="interestLevelID" name="<%=TitleEditForm.FORM_NAME%>" property="interestLevels"/>
<bean:define id="noteTypeID" name="<%=TitleEditForm.FORM_NAME%>" property="noteTypes"/>
<bean:define id="lexileCodeList" name="<%=TitleEditForm.FORM_NAME%>" property="lexileCodeList"/>
<bean:define id="fountasAndPinnellCodeList" name="<%=TitleEditForm.FORM_NAME%>" property="fountasAndPinnellCodeList"/>

<script language="JavaScript">
<!--
    function findHeadingForTag(tagNumber, tagID)
    {
        document.forms["cataloging_servlet_TitleEditForm"].elements["findHeadingTagID"].value = tagID;
        document.forms["cataloging_servlet_TitleEditForm"].elements["findHeadingTagNumber"].value = tagNumber;

        //Submit the form
        document.forms["cataloging_servlet_TitleEditForm"].submit();
    }
  //-->
</script>

<base:messageBox strutsErrors="true"/>
<%
    String focusElement = TitleEditForm.FIELD_SERIES_TITLE;
%>
<logic:notEqual name="<%=TitleEditForm.FORM_NAME%>" property="editNoteIndex" value="-1">
<%
    focusElement = TitleEditForm.FIELD_NOTE;
%>
</logic:notEqual>

<%
    TitleEditForm form = (TitleEditForm)request.getAttribute( TitleEditForm.FORM_NAME );
    boolean isInternational = UserContext.getMyContextLocaleHelper().isInternationalProduct();
%>
<base:form action="/cataloging/servlet/handletitleeditform.do" focus="<%= focusElement %>">
<INPUT type="hidden" name="page" value="2">
<!-- space this similar to brief page -->
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">

<html:hidden property="archiveMaterialType" />
<html:hidden property="changesMade" />


<table border="0" width="95%" id="<%=TitleEditForm.TABLE_EASY_EDIT_TABS%>" cellpadding="0" cellspacing="0">

  <jsp:include page="/cataloging/titleedittabs.jsp" flush="true">
      <jsp:param name="callingPage" value="addedDescription"/>
  </jsp:include>

  <tr>
    <td colspan="2" >
<% // This table can't be less than 100% or the tabs will be misaligned %>
      <base:outlinedTableAndTabsWithinThere borderColor='#C0C0C0' width="100%" selectedTab="<%=form.getSelectedTab()%>" tabs="<%=form.getTabs() %>">
        <tr><td>
        <table id="<%=TitleEditForm.TABLE_ADDED_DESCRIPTION_PAGE%>" width="100%">
            <tr>
                <td colspan="2">
                    <span class="FormLabel"><%= MessageHelper.formatMessage("titleeditadddesc_Title") %>&nbsp;</span>
                    <span class="ColRow"><%=form.gimmeFullTitle() %></span>
                </td>
               <td class="tdAlignRight">
                    <base:genericButton 
                        name="<%=TitleEditForm.BUTTON_NAME_MARC_EDITOR%>" 
                        src="/buttons/large/usemarceditor.gif" 
                        alt='<%= MessageHelper.formatMessage("useMarcEditor") %>' absbottom="true"
                    />
               </td>
            </tr>
            <tr>
              <td colspan="3">
                <base:imageLine height="1" width="100%"/>
              </td>
            </tr>
            <tr>
                <td colspan="2" class="FormLabel" nowrap><%= MessageHelper.formatMessage("titleeditadddesc_SeriesInformation") %></td>
                <td class="FormLabel tdAlignRight" rowspan="2">
                    <base:showHideTag id="onFindHeading">
                    <% String jsString = "javascript:findHeadingForTag(\"490\", \"" + form.getSeriesTagID() + "\")"; %>
                        <a href='<%=jsString%>' id="<%=MarcEditLineTag.ID_FIND_HEADING %>"><base:image src="/buttons/large/findheading.gif" onClick="hideElementonFindHeading()" alt='<%=MessageHelper.formatMessage("findHeading")%>'/></a>
                    </base:showHideTag>
                </td>
            </tr>
            <tr>
                <td colspan="2">&nbsp;</td>
            </tr>
            <tr>
                <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("titleeditadddesc_Title") %></td>
                <td colspan="3">
                    <html:text maxlength="1000" size="60" property="<%=TitleEditForm.FIELD_SERIES_TITLE%>"/>
                    <base:helpTag helpFileName="d_series_title_LM_MM.htm"/>
                </td>
            </tr>
            <tr>
                <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("titleeditadddesc_Volume") %></td>
                <td colspan="2">
                    <html:text maxlength="1000" size="60" property="<%=TitleEditForm.FIELD_SERIES_VOLUME%>"/>
                    <base:helpTag helpFileName="d_uniform_title_title_LM.htm"/>
                </td>
            </tr>
            <tr>
              <td colspan="3">
                <base:imageLine height="1" width="100%"/>
              </td>
            </tr>
            <tr>
                <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("titleeditadddesc_InterestLevel") %></td>
                <td colspan="2">
                    <html:select property="<%=TitleEditForm.FIELD_INTEREST_LEVEL%>">
                      <html:options collection="interestLevelID" property="stringCode"
                                    labelProperty="stringDesc"/>
                    </html:select>
                    <base:helpTag helpFileName="d_interest_level_title_LM.htm"/>
                </td>
            </tr>
            <% if (!isInternational) {%>
            <tr>
                <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("titleeditadddesc_Lexile") %></td>
                <td class="ColRow">
                    <html:select property="<%=TitleEditForm.FIELD_LEXILE_CODE%>">
                        <html:options collection="lexileCodeList" property="stringCode" labelProperty="stringDesc"/>
                    </html:select>&nbsp;
                    <html:text property="<%=TitleEditForm.FIELD_LEXILE_MEASURE%>" size="6" maxlength="4"/>
                    <base:helpTag helpFileName="d_lexile_title_LM.htm"/>
                </td>
            </tr>
            <tr>
                <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("titleeditadddesc_FountasAndPinnell") %></td>
                <td class="ColRow">
                    <html:select property="<%=TitleEditForm.FIELD_FOUNTAS_AND_PINNELL%>">
                        <html:options collection="fountasAndPinnellCodeList" property="stringCode" labelProperty="stringDesc"/>
                    </html:select>
                    <base:helpTag helpFileName="d_fountas_pinnell_level_title_LM.htm"/>
                    
                </td>
            </tr>
            <%} else {%>
                <html:hidden property="<%=TitleEditForm.FIELD_INTEREST_LEVEL%>" />
                <html:hidden property="<%=TitleEditForm.FIELD_LEXILE_CODE%>" />
                <html:hidden property="<%=TitleEditForm.FIELD_FOUNTAS_AND_PINNELL%>" />
            <%} %>
            <tr>
              <td colspan="3">
                <base:imageLine height="1" width="100%"/>
              </td>
            </tr>
            <tr>
                <td colspan="3" class="FormLabel"><%= MessageHelper.formatMessage("titleeditadddesc_Notes") %><base:helpTag helpFileName="d_notes_title_LM.htm"/>
                </td>
            </tr>
            <tr>
                <td valign="top" class="tdAlignRight">
                    <html:select property="<%=TitleEditForm.FIELD_NOTE_TYPE%>">
                      <html:options collection="noteTypeID" property="stringCode"
                                    labelProperty="stringDesc"/>
                    </html:select>
                </td>
                <td colspan="2">
                    <table border="0" cellspacing="0" cellpadding="0">
                        <tr>
                        <td valign="top">
                            <html:textarea cols="40" rows="4" property="note"/>
                        </td>
                        <td valign="top">
                            <table border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td valign="top">
                                    &nbsp;
                                    <base:genericButton src="/buttons/large/update.gif" name="<%=TitleEditForm.BUTTON_NAME_UPDATE_NOTE%>" alt='<%= MessageHelper.formatMessage("update") %>'/>
                                </td>
                            </tr>
                            <tr>
                                <td valign="top">
                                &nbsp;
                                <logic:notEqual name="<%=TitleEditForm.FORM_NAME%>" property="editNoteIndex" value="-1">
                                    <base:cancelButton name="<%=TitleEditForm.BUTTON_NAME_CANCEL_NOTE%>"/>
                                </logic:notEqual>
                                </td>
                            </tr>
                            </table>
                        </td>
                        </tr>
                    </table>
                </td>
            </tr>
            <tr><td colspan="3">
            <table id="<%=TitleEditForm.TABLE_NOTE_LIST%>" width="100%" cellspacing="0" cellpadding="2">
                <logic:equal name="<%=TitleEditForm.FORM_NAME%>" property="notesEmpty" value="true">
                    <tr>
                        <td class="FormLabel" colspan="3" align="center"><%= MessageHelper.formatMessage("titleeditadddesc_ThereAreNoNotesForThisTitle") %></td>
                    </tr>
                </logic:equal>
                <logic:equal name="<%=TitleEditForm.FORM_NAME%>" property="notesEmpty" value="false">
                    <tr>
                        <td class="ColRowBold"><%= MessageHelper.formatMessage("titleeditadddesc_Type") %></td>
                        <td class="ColRowBold" colspan="2"><%= MessageHelper.formatMessage("titleeditadddesc_Note") %></td>
                    </tr>
    <%
                    List list = form.getListOfIDs(TitleEditForm.NOTES_TAGS);
                    Iterator itr = list.iterator();

                    while ( itr.hasNext()) {
                        int id = (( Integer) itr.next()).intValue();
                        if (form.getEditNoteIndex() != id && form.canEditThisNote(id)) {
                            String editButton = "editNote" + (StringHelper.rightMost( "0000" + id, 4 ));
                            String deleteButton = "deleteNote" + (StringHelper.rightMost( "0000" + id, 4 ));
    %>
                            <base:flipper key="titleeditadddesc">
                                <td class="ColRow"><%= form.getNoteTypeDescription(id, true) %></td>
                                <td class="ColRow"><%= ResponseUtils.filter(form.getNoteDescription(id, true)) %>&nbsp;</td>
                                <td NOWRAP>
                                    <base:genericButton src="/icons/general/edit.gif" name="<%= editButton %>" alt='<%=MessageHelper.formatMessage("titleeditadddesc_EditNote") %>'/>&nbsp;<base:genericButton src="/icons/general/delete.gif" name="<%= deleteButton %>" alt='<%= MessageHelper.formatMessage("titleeditadddesc_DeleteNote") %>'/>
                                </td>
                            </base:flipper>
    <%
                        }
                    }
    %>
                </logic:equal>
            </table>
            </td></tr>
        </table>
        </td></tr>
      </base:outlinedTableAndTabsWithinThere>
      <tr>
        <td>
        <jsp:include page="/cataloging/titlefooter.jsp"/>
        </td>
      </tr>
    </td>
  </tr>
</table>

</base:form>
