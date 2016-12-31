<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.URLHelper" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@page import="com.follett.fsc.destiny.session.cataloging.remote.data.GlobalUpdateTextbookJobParams"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.GlobalUpdateTextbooksForm"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.UpdateTitlesNavigationForm"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page import="org.apache.struts.action.ActionErrors" %>
<%@ page import="org.apache.struts.Globals" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@page import="org.apache.struts.taglib.TagUtils"%>
<%@page import="org.apache.struts.action.ActionMessages"%>


<%
    GlobalUpdateTextbooksForm form = (GlobalUpdateTextbooksForm)request.getAttribute( GlobalUpdateTextbooksForm.FORM_NAME );

    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>
<base:messageBox strutsErrors="true"/>
<base:form action="/cataloging/servlet/handleglobalupdatetextbooks.do">
    <input type="hidden" name="<%=GlobalUpdateTextbooksForm.PARAM_DROP_DOWN_CHANGED %>" value='<%=""+GlobalUpdateTextbooksForm.VALUE_NOT_CHANGED %>'>
<%
    ActionMessages errors = TagUtils.getInstance().getActionMessages(pageContext, Globals.ERROR_KEY);
    if ((errors == null || errors.size() == 0) && URLHelper.buttonWasPressed(request, GlobalUpdateTextbooksForm.BUTTON_UPDATE)) { 
%>
    <base:messageBox showRedBorder="true">
    <tr>
        <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
        <td valign="baseline" class="Error">
            <p align="center">This process cannot be reversed.</p>
            <p align="center">Are you sure you want to proceed?</p>
            <div align="center">
                <base:yesNo 
                    buttonYesName="<%=GlobalUpdateTextbooksForm.BUTTON_CONFIRM_YES%>"
                    buttonNoName="<%=GlobalUpdateTextbooksForm.BUTTON_CONFIRM_NO%>"
                />
            </div>
        </td>
    </tr>
    </base:messageBox>
<%
    }
%>
<base:outlinedTableAndTabsWithinThere 
    id="<%=GlobalUpdateTextbooksForm.TABLE_UPDATE_TITLES%>"  
    selectedTab="<%=GlobalUpdateTextbooksForm.TAB%>" 
    tabs="<%=UpdateTitlesNavigationForm.gimmeTabs()%>" >
    <tr>
      <td class="TableHeading" colspan="2" >
         Update Textbook Titles...
      </td>
    </tr>
    <tr>
    <td class="ColRowBold tdAlignRight">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Based on</td>
        <td>
            <%= form.gimmeBasedOnDropdown() %>
        </td>
    </tr>
    <tr>
    <td colspan="2" width="100%"><base:imageLine></base:imageLine> </td>
    </tr>
    <% if (form.getBasedOnOption()== GlobalUpdateTextbookJobParams.BASED_ON_GLOBAL_CRITERIA){ %>
        <tr>
            <td class="ColRowBold tdAlignRight">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Whose</td>
            <td class="ColRowBold" ><%=form.gimmeOptionDropDown(true) %>&nbsp;is&nbsp;
               <%=form.gimmeOptionEditControl(true) %>
            </td>
        </tr>
    <%} else { %>
        <tr>
        <td valign="bottom" class="ColRowBold tdAlignRight">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Named</td>
        <td>
        <base:myListSelect name="<%=GlobalUpdateTextbooksForm.FIELD_FROM_SELECTED_LISTID%>" 
                           selectedMyListID="<%=form.getFromSelectedListID() %>" 
                           prompt=""
                           alwaysAddSelectAList="true" 
                           publicList="false" 
                           submitOnChange="false"
                            />
         <input type="image" src='<%=lh.getLocalizedImagePath("/buttons/large/viewlist.gif")%>' border="0" align="absbottom"
                               alt="<%= GlobalUpdateTextbooksForm.ALT_VIEW_LIST %>"
                               name="<%= GlobalUpdateTextbooksForm.BUTTON_VIEW_LIST %>" />
        </td>
        </tr>
    <%} %>

    <tr>
        <td class="ColRowBold tdAlignRight">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Change</td>
        <td class="ColRowBold" ><%=form.gimmeOptionDropDown(false) %>&nbsp;to&nbsp;
           <%=form.gimmeOptionEditControl(false) %>
        </td>
    </tr>

    <tr valign="top">
        <td valign="top" colspan="2" align="center" class="ColRowBold">
            <%= GenericForm.getLastBackupDisplayMsg(true) %>
        </td>
    </tr>
    <tr>
      <td align="center" colspan="2">
      &nbsp;
      </td>
    </tr>

    <tr>
      <td align="center" colspan="2">
        <base:genericButton 
            src="/buttons/large/preview2.gif" 
            name="<%=GlobalUpdateTextbooksForm.BUTTON_PREVIEW %>"
            alt="Preview"/>
        <base:genericButton 
            src="/buttons/large/update.gif" 
            name="<%=GlobalUpdateTextbooksForm.BUTTON_UPDATE %>" 
            alt="Update Textbooks"/>
      </td>
    </tr>
</base:outlinedTableAndTabsWithinThere>

</base:form>
 <SCRIPT LANGUAGE="javascript" TYPE="text/javascript">
    <!--
        function submitTheForm(dropdownChanged) {
            document.<%=GlobalUpdateTextbooksForm.FORM_NAME%>.<%=GlobalUpdateTextbooksForm.PARAM_DROP_DOWN_CHANGED%>.value = dropdownChanged;
            document.<%=GlobalUpdateTextbooksForm.FORM_NAME%>.submit();
        }
    // -->
    </SCRIPT>
