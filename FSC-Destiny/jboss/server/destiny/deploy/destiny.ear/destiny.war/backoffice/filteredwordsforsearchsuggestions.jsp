<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.FilteredWordsForSearchSuggestionsForm"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib prefix="c" uri="/WEB-INF/jstl-core.tld" %>


<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>

<bean:define id="form" name="<%=FilteredWordsForSearchSuggestionsForm.FORM_NAME%>" type="com.follett.fsc.destiny.client.backoffice.servlet.FilteredWordsForSearchSuggestionsForm"/>
<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);

    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>

<c:set var="myForm" value="<%=request.getAttribute(FilteredWordsForSearchSuggestionsForm.FORM_NAME)%>"/>

<base:messageBox strutsErrors="true" />
<script language="JavaScript">
<!--
    function trapEnter(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        document.<%=FilteredWordsForSearchSuggestionsForm.FORM_NAME%>.<%=FilteredWordsForSearchSuggestionsForm.FIELD_TRAP_ENTER_PRESSED%>.value=true;
      }
      return true;
    }
//-->
</script>
<base:form action="/backoffice/servlet/handlefilteredwordsforsearchsuggestionsform.do" focus="<%=FilteredWordsForSearchSuggestionsForm.FIELD_FILTERED_WORD %>">
 <html:hidden property="<%= FilteredWordsForSearchSuggestionsForm.FIELD_TRAP_ENTER_PRESSED %>" value="false"/>

<table align="center" width="95%"><tr><td>
<base:outlinedTable id="<%=FilteredWordsForSearchSuggestionsForm.TABLE_MAIN%>" align="center" width="100%" borderColor="#C0C0C0">

 <tr>
    <td valign="top">
        <table id="<%=FilteredWordsForSearchSuggestionsForm.TABLE_DETAIL%>" align="center" width="77%">
            <tr>
                <td class="ColRowBold">
                        <%=MessageHelper.formatMessage("filteredwordsforsearchsuggestions_NewWordToFilter") %> &nbsp;
                    <span onKeyPress="return trapEnter(event);">                
                        <html:text property="<%=FilteredWordsForSearchSuggestionsForm.FIELD_FILTERED_WORD %>" maxlength="80"/>
                    </span>                        
                    <base:genericButton name="<%=FilteredWordsForSearchSuggestionsForm.BUTTON_ADD_FILTERED_WORD %>" alt='<%=MessageHelper.formatMessage("add") %>' src="/buttons/small/add.gif" absbottom="true"/>
                </td>
            </tr>
            </table>
            <table align="center">
            <tr>
                <td class="ColRowBold tdAlignRight" width="78%">
                    <%= MessageHelper.formatMessage("filteredwordsforsearchsuggestions_TheFollowingWordsWillNotBeSuggested") %>
                </td>
            </tr>
            
            <tr align="center">
                <td align="center">
                    <c:set var="options" value="${form.siteFilteredWords}"/>
                    <c:if test="${! empty options}">
                        <select name="<%=FilteredWordsForSearchSuggestionsForm.FIELD_SITE_FILTERED_WORD %>" multiple>
                            <c:forEach var="option" items="${options}">
                                <option value="${option}">${option}</option>
                            </c:forEach>
                        </select>
                        <base:genericButton name="<%=FilteredWordsForSearchSuggestionsForm.BUTTON_REMOVE_FILTERED_WORD %>" alt='<%=MessageHelper.formatMessage("remove") %>' src="/buttons/large/remove.gif" absbottom="true"/>
                    </c:if>
                </td>
            </tr>

            <tr>
                <td>

                </td>
            </tr>
        </table>
    </td>
    <td valign="top" class="tdAlignRight">
        <table>
            <tr>
                <td class="ColRow tdAlignRight" nowrap>
                    <base:saveButton/>
                </td>
            </tr>
            <tr>
                <td class="ColRow tdAlignRight" nowrap>
                    <base:cancelButton/>
                </td>
            </tr>
        </table>
    </td>
 </tr>
</base:outlinedTable>
</td></tr></table>

</base:form>
