<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@ page import="com.follett.fsc.destiny.client.consortium.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag" %>


<%@page import="com.follett.fsc.common.MessageHelper"%><c:set var="cForm" value="<%=request.getAttribute(ConsortiumMemberAddEditForm.FORM_NAME)%>"/>

<base:messageBox strutsErrors="true"/>

<%
    ConsortiumMemberAddEditForm form = (ConsortiumMemberAddEditForm) request.getAttribute(ConsortiumMemberAddEditForm.FORM_NAME);
    String focusField = ConsortiumMemberAddEditForm.FIELD_DISTRICT_NAME;
    if (form.isShowPassword()) {
        focusField = ConsortiumMemberAddEditForm.FIELD_SA_PASSWORD;
    }
%>

<base:form action="/consortium/servlet/handleconsortiummemberaddeditform.do" method="post" focus="<%=focusField%>">
<logic:equal name="<%=ConsortiumMemberAddEditForm.FORM_NAME %>" property="showPassword" value="true">
    <base:messageBox showWarningIcon="true" message='<%=form.getSAPasswordPromptMessage()%>' filterMessage='false'>
        <tr>
            <td align="center" class="ColRow" colspan="2">
                <logic:equal name="<%=ConsortiumMemberAddEditForm.FORM_NAME %>" property="invalidPassword" value="true">
                    <font color="#cc0000">Invalid password</font>
                </logic:equal>
                <logic:equal name="<%=ConsortiumMemberAddEditForm.FORM_NAME %>" property="invalidPassword" value="false">
                    To continue, please enter the SQL Server Administrator's password:
                </logic:equal>
            </td>
        </tr>
        <tr>
            <td align="center" class="ColRow" colspan="2">
                <input type="password" name="<%=ConsortiumMemberAddEditForm.FIELD_SA_PASSWORD %>" size="14" maxlength="20" autocomplete="off"/>
            </td>
        </tr>
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:showHideTag id="onSQLPassword">
                    <base:okButton onclick="hideElementonSQLPassword()" />
                    <base:cancelButton/>
                </base:showHideTag>
            </td>
        </tr>
    </base:messageBox>
</logic:equal>
<html:hidden property="<%= ConsortiumMemberAddEditForm.PARAM_ADD_TYPE %>" value="<%= ConsortiumMemberAddEditForm.TAB_NEW%>"/>
<table id="" border="0" cellspacing="0" cellpadding="0" align="center" width="100%">

<tr align="center">
    <td>
        <base:outlinedTableAndTabsWithinThere align="center" selectedTab="<%=ConsortiumMemberAddEditForm.TAB_NEW%>" tabs="<%=ConsortiumMemberAddEditForm.tabs%>" borderColor="#c0c0c0" id="<%=ConsortiumMemberAddEditForm.TABLE_TABS %>" width="75%">
            <tr>
                <td class="TableHeading" colspan="2"><%=form.getTabTitle() %></td>
            </tr>
            <tr>
                <td colspan="2" valign="top">
                    <base:imageLine />
                </td>
            </tr>
            <tr>
                <td class="FormLabel tdAlignRight">
                    *Name
                </td>
                <td class ="tdAlignLeft">
                  <html:text property="<%=ConsortiumMemberAddEditForm.FIELD_DISTRICT_NAME %>" maxlength="80" size="30"/>
                </td>
            </tr>
            <tr>
                <td class="FormLabel tdAlignRight">
                    *Customer Number
                </td>
                <td class ="tdAlignLeft">
                  <html:text property="<%=ConsortiumMemberAddEditForm.FIELD_CUST_NUMBER %>" size="14" maxlength="7"/>
                </td>
            </tr>
            <tr>
                <td class="FormLabel tdAlignRight">
                    Group
                </td>
                <td class ="tdAlignLeft">
                  <%=form.getGroupDropDown() %>
                </td>
            </tr>
            <tr>
                <td class="FormLabel tdAlignRight">
                    *Database / Context Name
                </td>
                <td class ="tdAlignLeft">
                  <html:text property="<%=ConsortiumMemberAddEditForm.FIELD_DATABASE %>" maxlength="80" size="30"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" class="Instruction">
                    * = Required Field
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center" class="ColRowBold">
                    <base:showHideTag id="onSave">
                        <c:choose>
                            <c:when test="${cForm.distributedMode}">
                                <base:genericButton src="/buttons/large/next.gif" onclick="hideElementonSave()" name="<%=ConsortiumMemberAddEditForm.BUTTON_NEXT %>" alt="Next" />
                            </c:when>
                            <c:otherwise>
                                <base:saveButton onclick="hideElementonSave()" />
                            </c:otherwise>
                        </c:choose>
                        &nbsp;
                        <base:cancelButton />
                    </base:showHideTag>                
                </td>
            </tr>
        </base:outlinedTableAndTabsWithinThere>
    </td>
</tr>
</table>

</base:form>
