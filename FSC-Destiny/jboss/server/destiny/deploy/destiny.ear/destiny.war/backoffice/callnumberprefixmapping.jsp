<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>

<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>

<%
    CallNumberPrefixMappingForm form = (CallNumberPrefixMappingForm)request.getAttribute(CallNumberPrefixMappingForm.FORM_NAME);
%>

<c:set var="form" value="<%=request.getAttribute(CallNumberPrefixMappingForm.FORM_NAME)%>"/>
<base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handlecallnumberprefixmappingform.do" focus="<%=form.getFocusField() %>">

<base:outlinedTable borderColor ="#C0C0C0">
<tr>
    <td>
        <table width="100%" cellpadding="5" cellspacing="0">
            <tr>
                <td class="TableHeading"><%= MessageHelper.formatMessage("callnumberprefixmapping_CallNumberPrefixMappings") %></td>
                <td class="tdAlignRight" valign="top">
                    <table>
                        <tr>
                            <td class="ColRowBold tdAlignRight">
                                <base:showHideTag>
                                    <base:saveButton onclick="hideElement()" /><br><base:cancelButton/>
                                </base:showHideTag>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
            <tr>
                <td colspan="2"><base:imageLine height="1" width="100%"/></td>
            </tr>
            <tr>
                <td class="Instruction" colspan="2"><%= MessageHelper.formatMessage("callnumberprefixmapping_YouCanUseCallNumberPrefixMapsToGroupMultiplePrefix") %><br>
                    <b><%= MessageHelper.formatMessage("callnumberprefixmapping_PleaseNote") %></b>
                    <br><%= MessageHelper.formatMessage("callnumberprefixmapping_ModifyingTheseMappingsWillAffectPendingAndInProgre") %></td>
            </tr>
            <tr>
                <td align="center" colspan="2">
                    <table id=<%=CallNumberPrefixMappingForm.TABLE_PREFIX_MAPPINGS%> border="0">
                        <tr>
                            <td class="SmallColHeading"><%= MessageHelper.formatMessage("callnumberprefixmapping_Use") %></td>
                            <td class="SmallColHeading"><%= MessageHelper.formatMessage("callnumberprefixmapping_WhenThePrefixIs") %></td>
                        </tr>
                        <c:set var="emptyStr" value=""/>
                        <c:set var="i" value="0"/>
                        <c:forEach var="mapping" items="<%=form.getMappings() %>">
                            <c:set var="mappingSubs" value=""/>
                            <c:forEach var="mappingSub" items="${form.mappingSubs[i]}">
                                <c:if test="${mappingSubs != emptyStr}">
                                    <c:set var="mappingSubs" value="${mappingSubs}, ${mappingSub}"/>
                                </c:if>
                                <c:if test="${mappingSubs == emptyStr}">
                                    <c:set var="mappingSubs" value="${mappingSub}"/>
                                </c:if>
                            </c:forEach>
                            <tr>
                                <td>
                                    <input type="text"
                                           value="${mapping}"
                                           name="<%=CallNumberPrefixMappingForm.FIELD_MAPPING_PREFIX%>${i}"
                                           size="<%=CallNumberPrefixMappingForm.SIZE_CALL_NUMBER_PREFIX_ALIAS_TEXT%>"
                                           maxlength="<%=CallNumberPrefixMappingForm.MAX_SIZE_CALL_NUMBER_PREFIX_ALIAS_TEXT%>"/>
                                </td>
                                <td>
                                    <input type="text"
                                           value="${mappingSubs}"
                                           name="<%=CallNumberPrefixMappingForm.FIELD_MAPPING_SUBS_PREFIX%>${i}"
                                           size="<%=CallNumberPrefixMappingForm.SIZE_CALL_NUMBER_PREFIX_TEXT%>"
                                           maxlength="<%=CallNumberPrefixMappingForm.MAX_SIZE_CALL_NUMBER_PREFIX_TEXT%>"/>
                                </td>
                            </tr>
                            <c:set var="i" value="${i + 1}"/>
                        </c:forEach>
                        <tr>
                            <td colspan="2">
                                <base:genericButton src="/buttons/large/addnew.gif"
                                                    alt='<%=MessageHelper.formatMessage("addNew")%>'
                                                    name="<%=CallNumberPrefixMappingForm.BUTTON_ADD_NEW_MAPPING%>"/>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>
    </td>
</tr>
</base:outlinedTable>
</base:form>
