<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.RoleSpecs"%>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@page import="com.follett.fsc.destiny.session.district.data.FollettShelfDiscoveryReturn"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%
    AutoDiscoverFollettShelfForm form = (AutoDiscoverFollettShelfForm)request.getAttribute(AutoDiscoverFollettShelfForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true"/>



<base:form action="/backoffice/servlet/handleautodiscoverfollettshelfform.do">

      <br><center><span class="ColRowBold"><%= GenericForm.getLastBackupDisplayMsg(false) %></span></center><br>
      <jsp:include page="/common/msdewarning.jsp" flush="true" />
      <html:hidden property="<%=AutoDiscoverFollettShelfForm.FIELD_CONFIRM_UPDATE %>"/>

    <logic:equal name="<%= AutoDiscoverFollettShelfForm.FORM_NAME %>" property="<%=AutoDiscoverFollettShelfForm.FIELD_CONFIRM_UPDATE %>" value="true">
        <base:messageBox showRedBorder="true">
            <tr valign="center">
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td class="ColRowBold"><%=form.gimmeUpdateConfirmMessage() %></td>
            </tr>
            <tr>
               <td>&nbsp;</td>
               
               <td class="ColRowBold"><%=MessageHelper.formatMessage("autodiscoverfollettshelf_AreYouSureYouWantToContinue")%></td>
            </tr>
            <tr>
               <td>&nbsp;</td>
               <td align="center">
                    <base:yesNo buttonNoName="<%=AutoDiscoverFollettShelfForm.BUTTON_NAME_CONFIRM_UPDATE_NO %>" buttonYesName="<%= AutoDiscoverFollettShelfForm.BUTTON_NAME_CONFIRM_UPDATE_YES %>" />
               </td>
            </tr>
        </base:messageBox>
    </logic:equal>


<base:outlinedTable id="<%=AutoDiscoverFollettShelfForm.TABLE_SITES_AND_STATUSES %>">
    <tr>
        <td class="TableHeading" colspan="3"><%=MessageHelper.formatMessage("autodiscoverfollettshelf_ConnectToFollettshelf")%></td>
    </tr>
     <tr>
        <td colspan="2" class="ColRow tdAlignRight">
            <%=MessageHelper.formatMessage("autodiscoverfollettshelf_ClickingTheGoButtonWillAllowEachSiteAdministratorToSetUpTheirUserNameAndPasswordForTheirFollettshelf")%>
        </td>
        <td class="tdAlignRight">
            <base:showHideTag id="onSave">
                <base:genericButton onclick="hideElementonSave()" absbottom="true" src="/buttons/large/go.gif" alt='<%= MessageHelper.formatMessage("go") %>' name="<%= AutoDiscoverFollettShelfForm.BUTTON_NAME_RUN_UPDATE %>" />
            </base:showHideTag>
        </td>
     </tr>
    <%
        int flipper = 0;
        String lastSiteTypeName = "";
        for(FollettShelfDiscoveryReturn shelf : form.getShelfList()) {
            if(!lastSiteTypeName.equals(shelf.getSiteTypeName())) {
                lastSiteTypeName = shelf.getSiteTypeName();
                %>
                 <tr <%=(flipper++ % 2 == 0 ? " bgcolor=\"#E8E8E8\"" : "") %>>
                    <td class="TableHeading" colspan="3">
                        <%=shelf.getSiteTypeName() %>
                    </td>
                 </tr>
                <%
            }
            %>
              <tr <%=(flipper++ % 2 == 0 ? " bgcolor=\"#E8E8E8\"" : "") %>>
                  <td class="ColRowBold">
                     &nbsp;&nbsp;&nbsp;&nbsp;<%=shelf.getSiteName() %>
                  </td>
                  <td>
                     <% if(shelf.isConnected()) { %>
                        <span class="ColRowBold"><%=MessageHelper.formatMessage("autodiscoverfollettshelf_ThisSiteIsAlreadyConnectedToTheShelf") %></span>
                     <% } else if(shelf.isMediaSite()) { %>
                        <span class="ColRow"><%=MessageHelper.formatMessage("autodiscoverfollettshelf_CannotConnectMediaManagerSitesToFollettshelfFollettEbooksWillBeExported") %></span> 
                     <% } else if(shelf.getTotalBibCount() == 0 || shelf.getDropdown().size() == 0) { %>
                        <span class="ColRow"><%=MessageHelper.formatMessage("autodiscoverfollettshelf_ThisSiteDoesNotContainAnyFollettEbooks") %></span>
                     <% } else if(shelf.getDropdown().size() == 1) { %>
                        <html:hidden property="<%=AutoDiscoverFollettShelfForm.FIELD_SITE_PREFIX + shelf.getSiteID() %>" value="<%=shelf.getDropdown().get(0).getStringCode()%>" />
                        <span class="ColRow"><%=shelf.getDropdown().get(0).getStringDesc() %></span>
                     <% } else if(shelf.getDropdown().size() > 1) { %>
                        <%= JSPHelper.renderDropDown(AutoDiscoverFollettShelfForm.FIELD_SITE_PREFIX + shelf.getSiteID(), null, shelf.getDropdown(), form.gimmeDefaultValue(shelf.getSiteID()), null, "ColRow", null)%>                        
                     <% } %>
                  </td>
                  <td class="ColRowBold">
                     &nbsp;
                  </td>
               </tr>
            <%
        }
    %>
</base:outlinedTable>
   
</base:form>
