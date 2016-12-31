<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib prefix="c" uri="/WEB-INF/jstl-core.tld" %>

<%@page import="com.follett.fsc.destiny.client.district.servlet.StopWordsPatronForm"%>
<%@page import="com.follett.fsc.destiny.client.district.servlet.StopWordsBaseForm"%>

<%@page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<base:messageBox strutsErrors="true"/>

<bean:define id="form" name="<%=StopWordsPatronForm.FORM_NAME%>" type="com.follett.fsc.destiny.client.district.servlet.StopWordsPatronForm"/>
<c:set var="myForm" value="<%=request.getAttribute(StopWordsPatronForm.FORM_NAME)%>"/>
<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
%>

<base:form action="/district/servlet/handlestopwordspatronform.do" focus="<%=StopWordsBaseForm.FIELD_STOP_WORD %>">
<html:hidden property="districtMode" />

<c:if test="${form.showRebuildConfirm}">
    <base:messageBox showRedBorder="true">
        <tr valign="top">
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td class="ColRowBold">
                The changes to your Patron stop words have been saved.
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td valign="baseline" align="center" class="ColRow">
                However, your keyword indexes must be rebuilt before searches will reflect these changes. This can be a lengthy process.
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td valign="baseline" align="center" class="ColRow">
                Do you want to rebuild keywords now? (Click "No" if you want to run this process later.)
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td valign="baseline" align="center" class="ColRow">
                <base:yesNo 
                    buttonYesName="<%=StopWordsPatronForm.BUTTON_CONFIRM_REBUILD_YES%>"
                    buttonNoName="<%=StopWordsPatronForm.BUTTON_CONFIRM_REBUILD_NO%>"
                />
            </td>
        </tr>
    </base:messageBox>
</c:if>
  <% // This table can't be less than 100% or the tabs will be misaligned %>
<table align="center" width="95%"><tr><td>
<base:outlinedTableAndTabsWithinThere id="<%=StopWordsPatronForm.TABLE_MAIN%>" selectedTab="<%=StopWordsPatronForm.TAB%>" tabs="<%=form.getTabs()%>" align="center" width="100%">

 <tr>
    <td class="ColRowBold tdAlignRight" valign="top">    
        New Stop Word
    </td>
    <td valign="top">
        <table>
            <tr>
                <td>
                    <html:text property="<%=StopWordsBaseForm.FIELD_STOP_WORD %>" maxlength="20"/>
                    <base:genericButton name="<%=StopWordsBaseForm.BUTTON_ADD_STOP_WORD %>" alt="Add" src="/buttons/small/add.gif" absbottom="true"/>
                </td>
            </tr>
            <tr>
                <td>
                    <c:set var="options" value="${form.listOfUserStopWords}"/>
                    <c:if test="${! empty options}">
                        <select name="<%=StopWordsBaseForm.FIELD_USER_STOP_WORD %>" multiple>
                            <c:forEach var="option" items="${options}">
                                <option value="${option}">${option}</option>
                            </c:forEach>
                        </select>
                        <base:genericButton name="<%=StopWordsBaseForm.BUTTON_REMOVE_STOP_WORD %>" alt="<%=StopWordsBaseForm.ALT_TEXT_REMOVE_STOP_WORD %>" src="/buttons/large/remove.gif" absbottom="true"/>
                    </c:if>
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
            <tr>
                <td class="tdAlignRight">
                    <base:genericButton 
                        name="<%=StopWordsBaseForm.BUTTON_RESTORE%>" 
                        src="/buttons/large/restore.gif" 
                        alt="Restore" 
                    />
                </td>
            </tr>
        </table>
    </td>
 </tr>
</base:outlinedTableAndTabsWithinThere>
</td></tr></table>

</base:form>
