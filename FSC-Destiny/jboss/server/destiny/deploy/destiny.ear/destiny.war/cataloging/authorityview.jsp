<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.marc.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%@page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>



<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.apache.struts.util.ResponseUtils"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.jsptag.MarcEditLineTag"%>
<%@page import="com.follett.fsc.common.StringHelper"%><script language="JavaScript" type="text/javascript">
<!--
function editTag(tagID)
{
    document.forms["cataloging_servlet_AuthorityViewForm"].elements["editTagID"].value = tagID;

    //Submit the form
    document.forms["cataloging_servlet_AuthorityViewForm"].submit();
}
//-->
</script>

<base:messageBox strutsErrors="true"/>

<%
    AuthorityViewForm form = (AuthorityViewForm)request.getAttribute( AuthorityViewForm.FORM_NAME );
%>

<base:form action="/cataloging/servlet/handleauthorityviewform.do">
<html:hidden property="<%=AuthorityViewForm.PARM_PAGE_SELECTED %>"/>
<html:hidden property="<%=AuthorityViewForm.PARM_SELECTED_TAB %>"/>
<html:hidden property="<%=AuthorityViewForm.PARM_AUTHORITY_ID %>"/>
<input type="hidden" name="<%= AuthorityViewForm.PARM_EDIT_TAG_ID %>" value="<%= TitleEditForm.NOT_EDITING_TAG_ID_STRING %>">

<logic:equal name="<%=AuthorityViewForm.FORM_NAME%>" property="<%=AuthorityViewForm.PARM_ACTION%>" value="<%=AuthorityViewForm.ACTION_DELETE%>">
    <html:hidden property="<%=AuthorityViewForm.PARM_DELETE_TAG_ID %>"/>
    <base:imageSpacer width="1" height="3"/>
    <base:messageBox showRedBorder="true">
        <tr valign="top">
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>

            <td class="ColRowBold"><bean:write name="<%=AuthorityViewForm.FORM_NAME%>" property="<%=AuthorityViewForm.FIELD_DELETE_CONFIRM_TAG%>"/></td>
        </tr>
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:yesNo 
                    buttonYesName="<%=AuthorityViewForm.BUTTON_NAME_CONFIRM_DELETE_YES%>"
                    buttonNoName="<%=AuthorityViewForm.BUTTON_NAME_CONFIRM_DELETE_NO%>"
                />
            </td>
        </tr>
    </base:messageBox>
    <base:imageSpacer width="1" height="3"/>
</logic:equal>


<table id="<%=AuthorityViewForm.TABLE_MAIN %>" borderColor="#c0c0c0" width="95%">
<tr>
    <td>
      <base:outlinedTableAndTabsWithinThere borderColor='#C0C0C0' width="100%" selectedTab="<%=form.getSelectedTab()%>" tabs="<%=form.getTabs() %>">
        <tr>
            <td>
                <span class = "ColRowBold"><%=MessageHelper.formatMessage("authorityview_AuthorizedHeading")%>&nbsp;</span><span class="ColRow"><%=form.gimmeHeadingName() %></span>
            </td>
            <td class="tdAlignRight" valign="top">
                 <base:closeButton name="<%=AuthorityViewForm.BUTTON_NAME_CLOSE %>"/>
           </td>
        </tr>
        <tr>
            <td colspan="2"><base:imageLine height="1" width="100%"/></td>
        </tr>
        <logic:equal name="<%=AuthorityViewForm.FORM_NAME%>" property="pageSelected" value="<%=String.valueOf(AuthorityViewForm.PAGE_MARC_DISPLAY) %>">
            <tr>
               <td>
                   <table id="<%=AuthorityViewForm.TABLE_MARC_DISPLAY %>" cellpadding="2" cellspacing="0">
                      <!-- Display the leader, without the first 5 bytes -->
                      <% Iterator<MarcVO> tagListIter = form.getTagList().iterator();
                         while(tagListIter.hasNext()) {
                             MarcVO marcVO = tagListIter.next(); 
                             int rowSpan = marcVO.getRowCount();
                             String rowData = ResponseUtils.filter(marcVO.getDisplayableSubfieldData(0));
                             %>
                               <tr>
                                    <td valign="top" class="SmallColHeading tdAlignRight" bgcolor="#e8e8e8" rowspan='<%= rowSpan %>'>
                                       <nobr><b><a name="<%=AuthorityViewForm.PARM_EDIT_TAG_ANCHOR_PREFIX + marcVO.getTagID()%>"></a><%=marcVO.getDisplayableLabel()%></b></nobr>
                                    </td>
                                    <td valign="top" class="ColRow" bgcolor="#e8e8e8" rowspan='<%= rowSpan %>'>
                                        <%=marcVO.getDisplayableTagNumber() %>&nbsp;
                                    </td>
                                    <td valign="top" class="ColRow" rowspan='<%= rowSpan %>'>
                                       &nbsp;<%=form.buildTagData(marcVO, StringHelper.replaceSpacesWithNBSP(marcVO.getDisplayableIndicator1())) %>&nbsp;
                                    </td>
                                    <td valign="top" class="ColRow" rowspan='<%= rowSpan %>'>
                                       &nbsp;<%=form.buildTagData(marcVO, StringHelper.replaceSpacesWithNBSP(marcVO.getDisplayableIndicator2())) %>&nbsp;
                                    </td>
                                    <td valign="top" class="ColRow">
                                       &nbsp;<%=form.buildTagData(marcVO, StringHelper.replaceSpacesWithNBSP(ResponseUtils.filter(marcVO.getDisplayableSubfieldCode(0)))) %>&nbsp;
                                    </td>
                                    <td valign="top" class="ColRow">
                                       <%=form.buildTagData(marcVO, rowData) %>
                                    </td>
                                    
                                    <% if (marcVO.isDeletable() ) { %>
                                       <td valign="top" class="SmallColHeading">
                                          &nbsp;&nbsp;<%=form.getDeleteLink(marcVO) %>
                                       </td>
                                    <% } else { %>
                                       <td class="SmallColHeading">&nbsp;</td>
                                    <% } %>
                                    
                               </tr>
                             <% for (int i = 1; i < marcVO.getRowCount(); i++) { %>
                                <tr>
                                   <td valign="top" class="ColRow">
                                      &nbsp;<%=form.buildTagData(marcVO, ResponseUtils.filter(marcVO.getDisplayableSubfieldCode(i))) %>&nbsp;
                                   </td>
                                   <td valign="top" class="ColRow">
                                       <%
                                        rowData = ResponseUtils.filter(marcVO.getDisplayableSubfieldData(i));
                                        if (marcVO.isNonbreaking()) {
                                            rowData = StringHelper.replaceSpacesWithNBSP(rowData);
                                        }
                                       
                                       %>
                                      <%=form.buildTagData(marcVO, rowData) %>
                                   </td>
                                   <td class="SmallColHeading">&nbsp;</td>
                                </tr>                                    
                             <% } %>

                             <%
                         }
                      %>
                   </table>
               </td>
                <td class= "tdAlignRight" valign="top">
                    <base:genericButton alt='<%= MessageHelper.formatMessage("addTag") %>' src="/buttons/large/addtag.gif" name="<%=AuthorityViewForm.BUTTON_NAME_SHOW_ADD_TAG_DIALOG%>"/>
                </td>
            </tr>
         </logic:equal>
         <logic:notEqual name="<%=AuthorityViewForm.FORM_NAME%>" property="pageSelected" value="<%=String.valueOf(AuthorityViewForm.PAGE_MARC_DISPLAY) %>">
            <base:authorityMarcRender rec="<%=form.getMarc() %>" viewIndex="<%= form.getPageSelected()%>" mainHeadingPage="<%=form.gimmeMainHeadingPage() %>"/> 
         </logic:notEqual>
       </base:outlinedTableAndTabsWithinThere>
    </td>
</tr>
</table>


</base:form>
