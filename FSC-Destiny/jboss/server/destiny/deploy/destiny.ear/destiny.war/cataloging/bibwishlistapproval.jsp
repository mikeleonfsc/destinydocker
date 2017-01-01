<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ page import="com.follett.fsc.destiny.session.common.HTMLHelper" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="com.follett.fsc.destiny.util.HTMLFilterHelper"%>
<%@ page import="com.follett.fsc.common.StringHelper"%>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>



<%
    BibWishListApprovalForm form = (BibWishListApprovalForm)request.getAttribute(BibWishListApprovalForm.FORM_NAME);
%>

<c:set var="bibwishes" value="<%= form.getWishes() %>" />

<base:form action="/cataloging/servlet/handlebibwishlistapprovalform.do">
<logic:equal name="<%=BibWishListApprovalForm.FORM_NAME %>" property="<%=BibWishListApprovalForm.PARAM_PRINTER_FRIENDLY %>" value="false">
<c:if test="<%=form.getDeleteTitle() != null%>">
    <html:hidden property="<%=BibWishListApprovalForm.PARAM_WISH_BIB_ID%>"/>
    <html:hidden property="<%=BibWishListApprovalForm.PARAM_WISHLIST_ID_TO_DELETE%>"/>
    <base:imageSpacer width="1" height="3"/>
    <base:messageBox showWarningIcon="true" message='<%= MessageHelper.formatMessage("bibwishlistapproval_AreYouSureYouWantToDeleteTheWish",form.getDeleteTitle()) %>'>
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:yesNo/>
            </td>
        </tr>
    </base:messageBox>
</c:if>
</logic:equal>
<br/>
<br/>
<base:outlinedTable id="<%= BibWishListApprovalForm.TABLE_WISH_LIST %>" cellpadding="2" cellspacing="0" width="100%" borderColor="#C0C0C0">
    <tr>
        <td class="TableHeading"><%= MessageHelper.formatMessage("bibwishlistapproval_WishLists") %></td>
        <td class="tdAlignRight">
            <logic:equal name="<%=BibWishListApprovalForm.FORM_NAME %>" property="<%=BibWishListApprovalForm.PARAM_PRINTER_FRIENDLY %>" value="false">
                <base:link page='<%="/cataloging/servlet/presentbibwishlistapprovalform.do?" + BibWishListApprovalForm.PARAM_PRINTER_FRIENDLY + "=true"%>' target="printerFriendly" id="<%=GenericForm.ID_PRINTER_FRIENDLY %>"><base:image align="absbottom" src="/buttons/large/printit.gif" alt='<%=MessageHelper.formatMessage("printIt") %>'/></base:link>
            </logic:equal>
        </td>
    </tr>
    <logic:equal name="<%=BibWishListApprovalForm.FORM_NAME %>" property="<%=BibWishListApprovalForm.PARAM_REPORT %>" value="false">
        <logic:equal name="<%=BibWishListApprovalForm.FORM_NAME %>" property="<%=BibWishListApprovalForm.PARAM_PRINTER_FRIENDLY %>" value="false">
            <tr>
                <td colspan="2" class="Instruction"><%= MessageHelper.formatMessage("bibwishlistapproval_WishListsCanBeViewedInReportsGtLibrary") %></td>
            </tr>
        </logic:equal> 
    </logic:equal> 
    <c:choose>
        <c:when test="${empty bibwishes}">
            <tr>
                <td class="ColRowBold" align="center" colspan="2"><%= MessageHelper.formatMessage("bibwishlistapproval_ThereAreNoWishesToView") %></td>
            </tr>
        </c:when> 
        <c:otherwise>
            <c:forEach items="${bibwishes}" var="bibwish">
                <jsp:useBean id="bibwish" type="com.follett.fsc.destiny.session.cataloging.ejb.data.BibWishListTitleVO"/>
                <logic:equal name="<%=BibWishListApprovalForm.FORM_NAME %>" property="<%=BibWishListApprovalForm.PARAM_PRINTER_FRIENDLY %>" value="false">
                    <tr>
                        <td width="100%" colspan="2">
                            <base:imageLine/>
                        </td>
                    </tr>
                </logic:equal>        
                <tr>
                    <td class="ColRowBold">
                        <logic:equal name="<%=BibWishListApprovalForm.FORM_NAME %>" property="<%=BibWishListApprovalForm.PARAM_PRINTER_FRIENDLY %>" value="false">
                            <% if (bibwish.getBibID().intValue() == 0){ %>
                                <%= HTMLFilterHelper.filter(bibwish.getRequestedTitle())%>
                            <%} else { %>
                                <%= form.getTitleDetailLink(bibwish.getBibTitle(), bibwish.getBibID()) %>
                            <%} %>
                        </logic:equal>                        
                        <logic:equal name="<%=BibWishListApprovalForm.FORM_NAME %>" property="<%=BibWishListApprovalForm.PARAM_PRINTER_FRIENDLY %>" value="true">
                            <% if (bibwish.getBibID().intValue() == 0){ %>
                                <%= HTMLFilterHelper.filter(bibwish.getRequestedTitle())%>
                            <% } else { %>
                                <%= HTMLFilterHelper.filter(bibwish.getBibTitle())%>
                            <% } %>
                        </logic:equal>                        
                    </td>
                    <td class="tdAlignRight" valign="top">
                        <logic:equal name="<%=BibWishListApprovalForm.FORM_NAME %>" property="<%=BibWishListApprovalForm.PARAM_PRINTER_FRIENDLY %>" value="false">
                            <base:link href="<%=form.getDeleteBibWishLink(bibwish) %>" id="<%=BibWishListApprovalForm.ID_REMOVE_WISH + bibwish.getBibID() %>">
                                <base:image src="/buttons/small/remove_70.gif" alt='<%= MessageHelper.formatMessage("remove") %>'/>
                            </base:link>                            
                        </logic:equal>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" class="ColRow">
                    <%if(!StringHelper.isEmpty(bibwish.getRequestedAuthor())){%>
                        <%=ResponseUtils.filter(bibwish.getRequestedAuthor()) %>&nbsp;&nbsp;
                    <%}%>
                    <%if(!StringHelper.isEmpty(bibwish.getRequestedISBN())){ %><%= MessageHelper.formatMessage("bibwishlistapproval_ISBN", bibwish.getRequestedISBN())%>
                    <%}%>
                    </td>
                </tr>
                <c:set var="bibwishentries" value="<%= bibwish.getEntryList() %>" />
                <c:forEach items="${bibwishentries}" var="bibwishentry">
                    <jsp:useBean id="bibwishentry" type="com.follett.fsc.destiny.session.cataloging.ejb.data.BibWishListEntryVO"/>
                    <base:flipper key="bibwishlist">
                        <td colspan="2">
                           <%=form.getWishInformation(bibwishentry, bibwish) %>
                        </td>
                    </base:flipper>
                </c:forEach>
            </c:forEach>
        </c:otherwise>
    </c:choose>
    
</base:outlinedTable>
</base:form>
