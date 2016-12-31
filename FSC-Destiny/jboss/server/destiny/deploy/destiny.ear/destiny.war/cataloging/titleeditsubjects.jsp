<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.jsptag.MarcEditLineTag"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<bean:define id="subjectTypeID" name="<%=TitleEditForm.FORM_NAME%>" property="subjectTypes"/>
<bean:define id="subjectSubcategoriesID" name="<%=TitleEditForm.FORM_NAME%>" property="subjectSubcategories"/>

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
//    SessionStoreProxy handle = SessionStoreProxy.getSessionStore( session, request );
    TitleEditForm form = (TitleEditForm)request.getAttribute( TitleEditForm.FORM_NAME );
%>

<base:form action="/cataloging/servlet/handletitleeditform.do" focus="<%=TitleEditForm.FIELD_SUBJECT_HEADING%>">
<INPUT type="hidden" name="page" value="3">
<!-- space this similar to brief page -->
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">
<html:hidden property="archiveMaterialType" />
<html:hidden property="changesMade" />

<table border="0" width="95%" id="<%=TitleEditForm.TABLE_EASY_EDIT_TABS%>" cellpadding="0" cellspacing="0">
  <jsp:include page="/cataloging/titleedittabs.jsp" flush="true">
      <jsp:param name="callingPage" value="subjects"/>
  </jsp:include>
  <tr>
    <td>
<% // This table can't be less than 100% or the tabs will be misaligned %>
      <base:outlinedTableAndTabsWithinThere borderColor='#C0C0C0' width="100%" selectedTab="<%=form.getSelectedTab()%>" tabs="<%=form.getTabs() %>">
        <tr><td>
        <table id="<%=TitleEditForm.TABLE_SUBJECTS_PAGE%>" width="100%" border="0">
            <tr>
                <td colspan="2">
                    <span class="FormLabel"><%= MessageHelper.formatMessage("titleeditsubjects_Title") %>&nbsp;</span>
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
                <td colspan="3" class="FormLabel"><%= MessageHelper.formatMessage("titleeditsubjects_Subjects") %><base:helpTag helpFileName="d_subject_field_subjects_tab_LM_MM.htm"/>
                </td>
            </tr>
            <tr>
                <td class="FormLabel tdAlignRight">
                    <html:select onchange="this.form.submit()" property="<%=TitleEditForm.FIELD_SUBJECT_TYPE%>">
                      <html:options collection="subjectTypeID" property="longID"
                                    labelProperty="stringDesc"/>
                    </html:select>
                </td>
                <td>
                    <html:text maxlength="1000" size="40" property="<%=TitleEditForm.FIELD_SUBJECT_HEADING%>"/>
                </td>
                <td class="ColRowBold" rowspan="4" valign="top">
                    <base:showHideTag id="onAction">
                        <base:genericButton src="/buttons/large/update.gif" onclick="hideElementonAction()" name="<%=TitleEditForm.BUTTON_NAME_UPDATE_SUBJECT%>" alt='<%= MessageHelper.formatMessage("update") %>'/><br>
                        <% String jsString = "javascript:findHeadingForTag(\"" + form.getSubjectType() + "\", \"" + form.getEditSubjectIndex() + "\")"; %>
                        <a href='<%=jsString%>' id="<%=MarcEditLineTag.ID_FIND_HEADING %>"><base:image src="/buttons/large/findheading.gif" onClick="hideElementonAction()" alt='<%=MessageHelper.formatMessage("findHeading")%>'/></a><br>
                        <logic:notEqual name="<%=TitleEditForm.FORM_NAME%>" property="editSubjectIndex" value="-1">
                            <base:cancelButton name="<%=TitleEditForm.BUTTON_NAME_CANCEL_SUBJECT%>"/>
                        </logic:notEqual>
                    </base:showHideTag>
                </td>
            </tr>
            <tr>
                <td class="FormLabel tdAlignRight">
                    <html:select property="<%=TitleEditForm.FIELD_SUBJECT_SUBCATEGORY_TYPE_1%>">
                      <html:options collection="subjectSubcategoriesID" property="stringCode"
                                    labelProperty="stringDesc"/>
                    </html:select>
                </td>
                <td>
                    <html:text maxlength="1000" size="40" property="<%=TitleEditForm.FIELD_SUBJECT_SUBCATEGORY_1%>"/>
                </td>
            </tr>
            <tr>
                <td class="FormLabel tdAlignRight">
                    <html:select property="<%=TitleEditForm.FIELD_SUBJECT_SUBCATEGORY_TYPE_2%>">
                      <html:options collection="subjectSubcategoriesID" property="stringCode"
                                    labelProperty="stringDesc"/>
                    </html:select>
                </td>
                <td>
                    <html:text maxlength="1000" size="40" property="<%=TitleEditForm.FIELD_SUBJECT_SUBCATEGORY_2%>"/>
                </td>
            </tr>
            <tr>
                <td class="FormLabel tdAlignRight">
                    <html:select property="<%=TitleEditForm.FIELD_SUBJECT_SUBCATEGORY_TYPE_3%>">
                      <html:options collection="subjectSubcategoriesID" property="stringCode"
                                    labelProperty="stringDesc"/>
                    </html:select>
                </td>
                <td>
                    <html:text maxlength="1000" size="40" property="<%=TitleEditForm.FIELD_SUBJECT_SUBCATEGORY_3%>"/>
                </td>
            </tr>
            <tr><td colspan="3">
            <table id="<%=TitleEditForm.TABLE_SUBJECT_LIST%>" width="100%" cellspacing="0" cellpadding="2">
                <logic:equal name="<%=TitleEditForm.FORM_NAME%>" property="subjectsEmpty" value="true">
                    <tr>
                        <td class="FormLabel" colspan="3" align="center"><%= MessageHelper.formatMessage("titleeditsubjects_ThereAreNoSubjectsForThisTitle") %></td>
                    </tr>
                </logic:equal>
                <logic:equal name="<%=TitleEditForm.FORM_NAME%>" property="subjectsEmpty" value="false">
                    <tr>
                        <td class="ColRowBold"><%= MessageHelper.formatMessage("titleeditsubjects_Subjects") %></td>
                    </tr>
<%
                    List list = form.getListOfIDs(TitleEditForm.SUBJECT_TAGS);
                    Iterator itr = list.iterator();

                    while ( itr.hasNext()) {
                        int id = (( Integer) itr.next()).intValue();

                        if (form.getEditSubjectIndex() != id && form.canEditThisSubject(id)) {
                            String editButton = "editSubject" + (StringHelper.rightMost( "0000" + id, 4 ));
                            String deleteButton = "deleteSubject" + (StringHelper.rightMost( "0000" + id, 4 ));
%>
                            <base:flipper key="titleeditsubjects">
                                <td class="ColRow"><%= form.getSubjectTableEntry(id) %>&nbsp;</td>
                                <td NOWRAP>
                                    <base:genericButton src="/icons/general/edit.gif" name="<%= editButton %>" alt='<%= MessageHelper.formatMessage("titleeditsubjects_EditSubject") %>'/>&nbsp;<base:genericButton src="/icons/general/delete.gif" name="<%= deleteButton %>" alt='<%= MessageHelper.formatMessage("titleeditsubjects_DeleteSubject") %>'/>
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
