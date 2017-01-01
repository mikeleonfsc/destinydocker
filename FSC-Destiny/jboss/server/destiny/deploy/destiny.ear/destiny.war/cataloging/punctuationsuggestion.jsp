<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>


<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<% PunctuationSuggestionForm form = (PunctuationSuggestionForm)request.getAttribute(PunctuationSuggestionForm.FORM_NAME); %>


<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.PunctuationSuggestionForm"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag"%>

<%@page import="com.follett.fsc.destiny.util.marc.MarcHelper"%>
<base:messageBox strutsErrors="true"/> 

<c:set var="form" value="<%=request.getAttribute(PunctuationSuggestionForm.FORM_NAME)%>"/>
<c:set var="container" value="${form.container}"/>

<base:form action="/cataloging/servlet/handlepunctuationsuggestionform.do"> 
<base:outlinedTable borderColor="#c0c0c0" id="<%=PunctuationSuggestionForm.TABLE_MAIN %>">
    <tr>
        <td valign="middle"><span class = "ColRowBold"><%= MessageHelper.formatMessage("punctuationsuggestion_Title") %>&nbsp;</span><span class="ColRow">${form.displayableTitle}</span></td>
        <td nowrap="nowrap" valign="top" class="tdAlignRight">
            <base:genericButton alt='<%= MessageHelper.formatMessage("saveTitle") %>' src="/buttons/large/savetitle.gif" name="<%=PunctuationSuggestionForm.BUTTON_NAME_SAVE_TITLE%>"/>
            <base:imageSpacer width="10" height="16"/>
            <base:cancelButton/>
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <table width="100%" cellspacing="0" cellpadding="2" id = "<%= PunctuationSuggestionForm.TABLE_SUB_MAIN %>">
                <tr>
                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("punctuationsuggestion_Tag") %></td>
                    <td class="SmallColHeading" align="center"><%= MessageHelper.formatMessage("punctuationsuggestion_AcceptSuggestion") %></td>
                </tr>
                <c:forEach var="tag" items="${container.tagList}" varStatus="rowIndex">
                    <c:set var="bgColor" value="${rowIndex.index % 2 == 0 ? \"#E8E8E8\" : \"#FFFFFF\"}"/>
                    <tr bgColor="${bgColor}">
                        <td>
                            <table width="100%" id = "<%= PunctuationSuggestionForm.TABLE_DETAIL_PREFIX%>${rowIndex.index}">
                                <jsp:useBean id="rowIndex" type="javax.servlet.jsp.jstl.core.LoopTagStatus"/>                                
                                <jsp:useBean id="tag" type="com.follett.fsc.destiny.util.marc.MarcPunctuationTag"/>
                                <tr bgColor="${bgColor}" bordercolor="${bgColor}">
                                    <td class="ColRowBold">
                                    <%=(tag.getOriginalTag().getDisplayableTagNumber() + " - " + MarcHelper.getTagDescription(tag.getOriginalTag().getTagNumber()))%>
                                    </td>
                                </tr>
                                <tr bgColor="${bgColor}" bordercolor="${bgColor}">
                                    <td>
                                        <span class="ColRowItalic"><%= MessageHelper.formatMessage("punctuationsuggestion_Original") %></span>
                                        <img src="/images/icons/general/spacer.gif" border="0" width="27" height="1"/>
                                        <span class="ColRow"><%=ResponseUtils.filter(tag.getOriginalTag().getDisplayableWithAllPunctuation())%></span>
                                    </td>
                                </tr>
                                <tr bgColor="${bgColor}" bordercolor="${bgColor}">
                                    <td>
                                        <span class="ColRowItalic"><%= MessageHelper.formatMessage("punctuationsuggestion_Suggestion") %></span>
                                        <img src="/images/icons/general/spacer.gif" border="0" width="4" height="1"/>
                                        <span class="ColRow"><%=ResponseUtils.filter(tag.getModifiedTag().getDisplayableWithAllPunctuation())%></span>
                                    </td>
                                </tr>
                            </table>
                        </td>
                        <td class="ColRow" align="center">
                            <c:if test="${tag.selectedModifiedTag}">
                                <input type="checkbox" name="<%=PunctuationSuggestionForm.FIELD_PREFIX + rowIndex.getIndex()%>" value="on" checked="checked"/>
                            </c:if>
                            <c:if test="${!tag.selectedModifiedTag}">
                                <input type="checkbox" name="<%=PunctuationSuggestionForm.FIELD_PREFIX + rowIndex.getIndex()%>"/>
                            </c:if>
                        </td>
                    </tr>
                </c:forEach>
                <tr>
                    <td colspan="2">
                        <img src="/images/icons/general/line.gif" height="1" width="100%">
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td class="ColRowBold tdAlignRight" vAlign="bottom">
                       <table width="100%">
                          <tr>
                             <td class="tdAlignRight">
                                <base:genericButton name="<%= PunctuationSuggestionForm.BUTTON_NAME_SELECT_ALL %>" src="/buttons/small/selectall.gif" alt='<%= MessageHelper.formatMessage("selectAll") %>'/>&nbsp;
                                <base:genericButton name="<%= PunctuationSuggestionForm.BUTTON_NAME_CLEAR_ALL %>" src="/buttons/small/clearall.gif" alt='<%= MessageHelper.formatMessage("clearAll") %>'/>
                             </td>
                        </tr>
                    </table>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <img src="/images/icons/general/line.gif" height="1" width="100%">
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td nowrap="nowrap" valign="top" class="tdAlignRight">
            <base:genericButton alt='<%= MessageHelper.formatMessage("saveTitle") %>' src="/buttons/large/savetitle.gif" name="<%=PunctuationSuggestionForm.BUTTON_NAME_SAVE_TITLE%>"/>
            <base:imageSpacer width="10" height="16"/>
            <base:cancelButton/>
        </td>
    </tr>
    
</base:outlinedTable>
</base:form>
