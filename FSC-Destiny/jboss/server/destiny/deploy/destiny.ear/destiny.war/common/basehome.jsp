<%@page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<%@page import="com.follett.fsc.destiny.client.district.servlet.ListSitesForm"%>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.client.common.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.session.common.data.*"%>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="java.util.*"%>
<%@ page import="com.follett.fsc.destiny.util.*"%>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%
    String formName = request.getParameter("formName");
    BaseHomeForm homeForm = (BaseHomeForm)request.getAttribute(formName);
    Boolean fromDistrict =Boolean.FALSE;
    String topPath = "/common";
    String returnTo = "";
    if (Boolean.parseBoolean(request.getParameter("fromDistrict"))) {
        fromDistrict=Boolean.TRUE;
        topPath="/district";
        returnTo = "?returnTo=presentdistrictinfoldapnavigationform.do";
    }
%>
<center>
<table id=<%=BaseHomeForm.TABLE_MAIN%> border="0" cellpadding="3" cellspacing="0" width="90%">

<% 
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);

         if (homeForm.showAASPRegistrationNag(store) && !fromDistrict.booleanValue()) {
    %>
    <tr>
        
        <td align="center">
        <base:form action="/common/servlet/presenthomeform.do" method="get">
                <base:messageBox showRedBorder="true">
                    <tr>
                        <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                        <td class="ColRowBold" align="center"><%=BaseHomeForm.AASP_VERIFY_NAG_MESSAGE %></td>
                    </tr>

                    <tr>
                        <td>&nbsp;</td>
                        <td valign="baseline" align="center" class="ColRow">
                            <base:link href="<%=homeForm.gimmeAASPRegistrationLink() %>" target="_blank" id="<%=ListSitesForm.AASP_REGISTRATION_ID %>">
                                                        <base:image src="/buttons/large/registernow.gif" alt="<%=ListSitesForm.BUTTON_REGISTER_IDENTIFY%>"  />
                                                    </base:link>&nbsp;
                         
                     <base:genericButton src="/buttons/large/remindmelater.gif" name="<%=ListSitesForm.BUTTON_REGISTER_REMIND_LATER%>" alt="<%=ListSitesForm.BUTTON_REGISTER_REMIND_LATER_TEXT%>" />                       
                         
                        </td>
                    </tr>
                </base:messageBox>
                  </base:form>
         
            </td>
    </tr>
    <%
        }
    
    


if (!fromDistrict.booleanValue() || (fromDistrict.booleanValue() && store.isDestinyAdminLoggedIn())) { %>
<tr>
<td class="tdAlignRight" width="100%">
<base:link permission='<%= Permission.HOME_EDIT_PAGE %>' page='<%=topPath+ "/servlet/presenthometreeform.do"%>' id="<%=BaseHomeForm.ID_EDIT_PAGE %>">
<base:image src="/buttons/large/editpage.gif" alt='<%= MessageHelper.formatMessage("editPage") %>' />
</base:link>
</td>
</tr>
<% } %>
<tr>
<td class="TableHeading" align="center">
<bean:write name="<%=formName %>" property="title" />
</td>
</tr>

<tr>
<td class="ColRow tdAlignLeft">
<%if (
    StringHelper.isEmpty(System.getProperty(DestinyConfigProperties.PROPERTY_DISABLE_HOME_PAGE_BODY))) {%>
<bean:write name="<%=formName %>" property="body" filter="false"/>
<%} %>
</td>
</tr>

<%
    if (homeForm.getList().size() > 0) {    // show tables only if we have something to display

    boolean haveRightTable = homeForm.isHaveRightTable();

    String leftTableAttributes="width=\"100%\" align=\"center\"";
    String leftInnerTableAttributes="";
    if (haveRightTable) {
        leftTableAttributes="width=\"50%\"";
        leftInnerTableAttributes="width=\"100%\"";
    }
%>
<tr>
    <td align="center">
    <table id="xxx" cellpadding="3" cellspacing="0" align="center" width="85%">
    <tr valign="top">

<td valign="top" <%=leftTableAttributes%>>
<table id="<%=BaseHomeForm.TABLE_LEFT_LINKS%>" border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse" bordercolor="#111111" <%=leftInnerTableAttributes%>>
<%
        for(HomeGroupTreeItem item:homeForm.getList()) {
            if (item.isLeftSide()) {
                if (!(item instanceof HomeGroupTreeLinkItem)) {
%>
        <tr>
            <td width="100%" class="TableHeading2 tdAlignLeft">&nbsp;<br><base:image
             src="/icons/general/linksection.gif" align="absbottom" width="25" height="16"/>&nbsp;<%= ResponseUtils.filter(item.getDescription()) %>
            </td>
        </tr>
<%
                } else {
                    HomeGroupTreeLinkItem linkItem = (HomeGroupTreeLinkItem) item;
%>
        <tr>
            <td width="100%" class="ColRow tdAlignLeft">
                <ul><li>
                <a href="<%= linkItem.getUrl() %>" target="_window" ><%= ResponseUtils.filter(linkItem.getDescription()) %></a>
                </li></ul>
            </td>
        </tr>
<%
                }
            }
        }
%>
    </table>
</td>

<% if (haveRightTable) { %>

<td valign="top"><base:imageSpacer width="20" height="1"/></td>
<td valign="top" width="50%">
<table id="<%=BaseHomeForm.TABLE_RIGHT_LINKS%>" border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse" bordercolor="#111111" width="100%">
<%
        for(HomeGroupTreeItem item:homeForm.getList()) {        
            if (!item.isLeftSide()) {
                if (!(item instanceof HomeGroupTreeLinkItem)) {
%>
        <tr>
            <td width="100%" class="TableHeading2 tdAlignLeft">&nbsp;<br><base:image
                src="/icons/general/linksection.gif" align="absbottom" width="25" height="16"/>&nbsp;<%= ResponseUtils.filter(item.getDescription()) %>
            </td>
        </tr>
<%
                } else {
                    HomeGroupTreeLinkItem linkItem = (HomeGroupTreeLinkItem) item;
%>
        <tr>
            <td width="100%" class="ColRow tdAlignLeft">
                <ul><li>
                <a href="<%= linkItem.getUrl() %>" target="_window" ><%= ResponseUtils.filter(linkItem.getDescription()) %></a>
                </li></ul>
            </td>
        </tr>
<%
                }
            }
        }
%>
    </table>
</td>
<% } // end block for right table processing %>

</tr>
</table>

</td>
</tr>
<%
    }   // outer IF block (list size > 0)
%>

</table>

</center>
