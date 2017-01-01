<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@ page import="java.util.*"%>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.util.*"%>
<%@ page import="com.follett.fsc.destiny.session.common.*"%>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.*"%>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.ManageQuestCommentsForm" %>
<%@ page import="com.follett.fsc.common.LocaleHelper" %>
<%@ page import="com.follett.fsc.destiny.util.URLHelper" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@page import="com.follett.fsc.destiny.entity.ejb3.FollettEBookBookingVO"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="com.follett.fsc.destiny.session.common.data.MyQuestConversationVO"%>
<%@page import="com.follett.fsc.common.consortium.ContextManager"%>
<%@page import="com.follett.fsc.destiny.session.common.data.MyQuestViewAllCommentVO"%>
<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag"%><base:messageBox strutsErrors="true"/>


<%
    ManageQuestCommentsForm form = (ManageQuestCommentsForm)request.getAttribute(ManageQuestCommentsForm.FORM_NAME);

%>

<base:form action="/circulation/servlet/handlemanagequestcommentsform.do">
    <html:hidden property="<%=ManageQuestCommentsForm.HIDDEN_SELECTED_ID%>"/>
    <html:hidden property="<%=ManageQuestCommentsForm.HIDDEN_SELECTED_TYPE%>"/>
    <html:hidden property="<%=ManageQuestCommentsForm.HIDDEN_PATRON_NAME%>"/>
    <base:outlinedTable id="<%=ManageQuestCommentsForm.TABLE_MAIN%>" borderColor="<%=OutlinedTableTag.OUTLINE_GRAY %>">
        <tr>
            <td class="TableHeading" colspan="4" valign="top">
                <%= MessageHelper.formatMessage("managequestcomments_RecommendationsandMyQuestCommentsFor",  ResponseUtils.filter(form.getPatronName())) %>
            </td>
        </tr>
        
        <% if(form.getConversations().size() > 0) { %>
            <tr>
                <td class="SmallColHeading" valign="top">
                    <%= form.getResultsHeader() %>
                </td>
                <td class="SmallColHeading tdAlignRight" colspan="3">
                    <base:pageListOutput formName="<%=ManageQuestCommentsForm.FORM_NAME%>" topOfPageLinks="true"/>
                </td>
            </tr>
            <tr>
                <td colspan="4">
                    <base:imageLine />
                </td>
            </tr>
            <tr>
                <td class="SmallColHeading" valign="top">
                    <%= MessageHelper.formatMessage("managequestcomments_Description")%>
                </td>
                <td class="SmallColHeading" valign="top">
                    <%= MessageHelper.formatMessage("managequestcomments_Participant")%>
                </td>
                <td class="SmallColHeading" colspan="2" valign="top">
                    <%= MessageHelper.formatMessage("managequestcomments_Date")%>
                </td>
            </tr>
            <% for(MyQuestConversationVO c : form.getConversations()){ %>
                <%  boolean isSelected =    !StringHelper.isEmpty(form.getSelectedType()) && MyQuestConversationVO.Type.valueOf(form.getSelectedType()) == c.getType() &&
                                            form.getSelectedID() != null && form.getSelectedID().equals(c.getVoID());

                    boolean isRecommendation = c.getType() == MyQuestConversationVO.Type.Reccomendation; 
                    String hiddenConvStyle = (c.isHidden() && isRecommendation) ? "style='color: #999;'":""; 
                %> 
                <base:flipper key="key">
                    <td class="ColRow" valign="top" <%=hiddenConvStyle%> ><%= c.getDescription() %>
                        <%= (!StringHelper.isEmptyOrWhitespace(c.getComment()))
                                ? "<br/>&nbsp;&nbsp;&nbsp;&nbsp;"+MessageHelper.formatMessage("managequestcomments_Comment")+"&nbsp;"+ c.getComment()
                                : "" %>
                    </td>
                    <td class="ColRow" valign="top" <%=hiddenConvStyle%> ><%= c.getParticipant() %></td>
                    <td class="ColRow" valign="top" <%=hiddenConvStyle%> nowrap><%= UserContext.getMyContextLocaleHelper().formatDateAndTime(c.getDate()) %></td> 
                    <td class="ColRow" valign="top" align="center" <%=hiddenConvStyle%> nowrap>
                    
                    <a name="<%= (isRecommendation ? ManageQuestCommentsForm.ANCHOR_RECOMMENDATION : ManageQuestCommentsForm.ANCHOR_CONVERSATION) + c.getVoID() %>"></a>

                    <% if(c.getType() == MyQuestConversationVO.Type.Conversation){ %>
                        <base:genericButton 
                            name="<%=ManageQuestCommentsForm.PREFIX_CONVERSATION+c.getVoID()%>"
                            src='<%= isSelected ? "/buttons/small/showless.gif" : "/buttons/small/showmore.gif" %>' />
                    <% } else { %>
                        <base:genericButton 
                            alt='<%=MessageHelper.formatMessage( !c.isHidden() ? "hide" : "show" ) %>'
                            name="<%= ManageQuestCommentsForm.PREFIX_HIDE_RECOMMENDATION+c.getVoID() %>"
                            src='<%= (c.isHidden()) ? "/buttons/small/show.gif" : "/buttons/small/hide.gif" %>' />
                    <% } %>
                    </td>
                </base:flipper>
                <% if(isSelected) { %>
                    <tr>
                        <td colspan="4" align="right" valign="top">
                            <% if(c.getComments() == null || c.getComments().size() == 0) { %>
                                <%= MessageHelper.formatMessage("managequestcomments_NoComments")%>
                            <% } else { %>
                                <table id="<%= ManageQuestCommentsForm.PREFIX_TABLE_CONVERSATION + c.getVoID() %>" width="98%" cellpadding="2" cellspacing="0">
                                    <tbody>
                                        <tr>
                                            <td class="SmallColHeading tdAlignLeft" valign="top">
                                                <%= MessageHelper.formatMessage("managequestcomments_Participant")%>
                                            </td>
                                            <td class="SmallColHeading tdAlignLeft" valign="top">
                                                <%= MessageHelper.formatMessage("managequestcomments_Description")%>
                                            </td>
                                            <td class="SmallColHeading tdAlignLeft"  valign="top" nowrap>
                                                <%= MessageHelper.formatMessage("managequestcomments_Date")%>
                                            </td>
                                            <td class="SmallColHeading tdAlignLeft"  valign="top" colspan="2" nowrap>
                                                <base:genericButton 
                                                    alt='<%=MessageHelper.formatMessage( "hideAll" ) %>'
                                                    name="<%=ManageQuestCommentsForm.PREFIX_HIDE_CONVERSATION + c.getVoID()%>"
                                                    src="/buttons/small/hideall.gif" />
                                                <base:genericButton 
                                                    alt='<%=MessageHelper.formatMessage( "showAll" ) %>'
                                                    name="<%=ManageQuestCommentsForm.PREFIX_SHOW_CONVERSATION + c.getVoID()%>"
                                                    src="/buttons/small/showall.gif" />
                                            </td>
                                        </tr>
                                        <% for(MyQuestViewAllCommentVO comment : c.getComments()){ 
                                            String hiddenStyle = (comment.isHidden()) ? "style='color: #999;'":""; 
                                        %>
                                            <base:flipper key="comment">
                                                <td class="ColRow tdAlignLeft" valign="top" <%=hiddenStyle%> ><%= ResponseUtils.filter(comment.getPatronName()) %></td> 
                                                <td class="ColRow tdAlignLeft" valign="top" <%=hiddenStyle%> ><%= comment.getCommentData() %></td> 
                                                <td class="ColRow tdAlignLeft" valign="top" <%=hiddenStyle%> nowrap><%= UserContext.getMyContextLocaleHelper().formatDateAndTime(comment.getCreated()) %></td> 
                                                <td class="ColRow tdAlignLeft" valign="top">
                                                    <a name="<%= ManageQuestCommentsForm.ANCHOR_COMMENT + comment.getCommentID() %>"></a> 

                                                    <base:genericButton 
                                                        alt='<%=MessageHelper.formatMessage( !comment.isHidden() ? "hide" : "show" ) %>'
                                                        name="<%= ManageQuestCommentsForm.PREFIX_HIDE_COMMENT+comment.getCommentID() %>"
                                                        src='<%= (comment.isHidden()) ? "/buttons/small/show.gif" : "/buttons/small/hide.gif" %>' />
                                                </td>
                                            </base:flipper>
                                        <% } %>
                                    </tbody>
                                </table>
                            <% } %>
                        <td>
                    </tr>
                <% } %>
            <% } %>
            <tr>
                <td colspan="4">
                    <base:imageLine />
                </td>
            </tr>
            <tr>
                <td class="SmallColHeading">
                    <%= form.getResultsHeader() %>
                </td>
                <td class="SmallColHeading tdAlignRight" colspan="3">
                    <base:pageListOutput formName="<%=ManageQuestCommentsForm.FORM_NAME%>" topOfPageLinks="false"/>
                </td>
            </tr>
        <% } else {%>
            <tr valign="bottom">
                <td align="center" class="SmallColHeading" colspan="4">
                    <%= MessageHelper.formatMessage("managequestcomments_NoCommentsForThisPatrons")%>
                </td>
            </tr>
        <% } %>    
    </base:outlinedTable>
</base:form>
