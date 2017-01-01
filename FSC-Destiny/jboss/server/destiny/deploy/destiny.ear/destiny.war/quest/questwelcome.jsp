<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c"%>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn"%>
<%@page import="com.follett.fsc.destiny.client.quest.servlet.QuestWelcomeForm"%>
<%@page import="com.follett.fsc.destiny.client.quest.controllers.BaseAjaxController"%>
<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>

<c:set var="form" value="<%=request.getAttribute(QuestWelcomeForm.FORM_NAME)%>"/>

<base:messageBox strutsErrors="true"/> 
<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );
    String languageStringEnglish =
                LocaleHelper.preferredLanguageToString(LocaleHelper.PreferredLanguage.ENGLISH);
%>

<c:if test="${!form.localErrors}">
<div id = "mainBody" style = "display:none">
    <base:outlinedTable borderColor="#c0c0c0" id="<%=QuestWelcomeForm.TABLE_MAIN %>">
        <tr>
            <td class="TableHeading">
                <%= MessageHelper.formatMessage("questWelcomeForm_destinyQuest") %>
            </td>
        <tr>
        <tr>
            <td class="ColRow">
                <%= MessageHelper.formatMessage("questWelcomeForm_destinyQuestIsAVisuallyEngaginLibrarySearchInterface") %>
                <% if (store.getLanguage().equals(languageStringEnglish)){ %>
                   <%=MessageHelper.formatMessage("questWelcomeForm_destinyQuestForMoreInformation0ClickHere1", "<a href=\"http://www.follettsoftware.com/destinyquest\" target=\"_blank\">", "</a>") %> 
                <% } %>
            </td>
        </tr>
        <tr>
            <td class="ColRow">
                <%= MessageHelper.formatMessage("questWelcomeForm_pleaseNoteDestinyQuestRequires") %>
            </td>
        </tr>        
        <tr>
            <td align="center" class="ColRowBold">
                <base:link id="<%=QuestWelcomeForm.ANCHOR_ENTER_DESTINY_QUEST %>" href = "${form.enterQuestURL}"><%= MessageHelper.formatMessage("questWelcomeForm_beginYourDestinyQuest") %></base:link>
            </td>
        </tr>
    </base:outlinedTable>
</div>
<noscript>
    <div align = "center">
        <base:messageBox message='<%= MessageHelper.formatMessage("questWelcomeForm_youMustEnableJavaScriptToUseDestinyQuest") %>' showWarningIcon="true"/>
    </div>
</noscript>         
<script type="text/javascript">
<!--
    var div = document.getElementById("mainBody");
    div.style.display = "block";
//-->
</script>
</c:if>
