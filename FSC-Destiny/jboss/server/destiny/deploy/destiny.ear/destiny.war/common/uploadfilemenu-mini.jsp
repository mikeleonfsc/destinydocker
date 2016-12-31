<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.UploadFileMenuMiniForm" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    UploadFileMenuMiniForm form = (UploadFileMenuMiniForm)request.getAttribute(UploadFileMenuMiniForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );
%>


<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%><base:messageBox strutsErrors="true"/>
<table id="<%=UploadFileMenuMiniForm.TABLE_NAME%>" cellpadding="2" cellspacing="0" border="0" width="100%">
    <tr>
      <td class="ColRowBold"><%= MessageHelper.formatMessage("uploadfilemenu-mini_SelectTheFileTypeToUpload") %></td>
   </tr>
   <% if (form.getCollectionType() == CollectionType.LIBRARY) { %>
   <tr>
      <td class="ColRow">
         <ul>
             <logic:equal name="<%=UploadFileMenuMiniForm.FORM_NAME%>" property="candoLibraryCirculation" value="true">
                <li><base:link page="/circulation/servlet/presentremotecircform.do?l2m=Offline%20Circulation"><%= MessageHelper.formatMessage("uploadfilemenu-mini_Circulation") %></base:link></li>
             </logic:equal>
             <logic:equal name="<%=UploadFileMenuMiniForm.FORM_NAME%>" property="candoLibraryInventory" value="true">
                <li><base:link page='<%= "/backoffice/servlet/presentinventoryform.do?l2m=Inventory&invChooser=false&uploadFile=true&collectionType=" + CollectionType.LIBRARY%>'><%= MessageHelper.formatMessage("uploadfilemenu-mini_Inventory") %></base:link></li>
            </logic:equal>
         </ul>
      </td>
   </tr>
   <% } else if (form.getCollectionType() == CollectionType.TEXTBOOK){ %>
   <tr>
      <td class="ColRow">
         <ul>
            <% if (!store.isStateContext()) { %> 
                <logic:equal name="<%=UploadFileMenuMiniForm.FORM_NAME%>" property="candoTextbookCirculation" value="true">
                    <li><base:link page='<%= "/circulation/servlet/presentremotecircform.do?collectionType=" + CollectionType.TEXTBOOK%>'><%= MessageHelper.formatMessage("uploadfilemenu-mini_Circulation") %></base:link></li>
                </logic:equal>
            <% } %>
            <logic:equal name="<%=UploadFileMenuMiniForm.FORM_NAME%>" property="candoTextbookInventory" value="true">
                <li><base:link page='<%= "/backoffice/servlet/presentinventoryform.do?l2m=Inventory&invChooser=false&uploadFile=true&collectionType=" + CollectionType.TEXTBOOK%>'><%= MessageHelper.formatMessage("uploadfilemenu-mini_Inventory") %></base:link></li>
            </logic:equal>
            <% if (!store.isStateContext()) { %> 
                <logic:equal name="<%=UploadFileMenuMiniForm.FORM_NAME%>" property="candoTextbookTransfer" value="true">
                    <li><base:link page='<%= "/cataloging/servlet/presenttransferform.do?l2m=Transfer%20Textbooks&collectionType=" + CollectionType.TEXTBOOK%>'><%= MessageHelper.formatMessage("uploadfilemenu-mini_TransferTextbook") %></base:link></li>
                </logic:equal>
            <% } %>
         </ul>
      </td>
   </tr>
   <% } else if (form.getCollectionType() == CollectionType.ASSET){ %>
   <tr>
      <td class="ColRow">
         <ul>
            <logic:equal name="<%=UploadFileMenuMiniForm.FORM_NAME%>" property="candoAssetCirculation" value="true">
                <li><base:link page='<%= "/circulation/servlet/presentremotecircform.do?collectionType=" + CollectionType.ASSET%>'><%= MessageHelper.formatMessage("uploadfilemenu-mini_Circulation") %></base:link></li>
            </logic:equal>
            <base:spanIfAllowed permissions='<%= new Permission[] {Permission.BACK_OFFICE_INVENTORY_ASSET_COLLECTION} %>'>
                <li><base:link page='<%= "/backoffice/servlet/presentinventoryform.do?invChooser=false&uploadFile=true&collectionType=" + CollectionType.ASSET%>'><%= MessageHelper.formatMessage("uploadfilemenu-mini_Inventory") %></base:link></li>
            </base:spanIfAllowed>
            <base:spanIfAllowed permissions='<%= new Permission[] {Permission.CAT_TRANSFER_RECEIVE_ASSET_ITEMS} %>'>
				<li><base:link page='<%= "/cataloging/servlet/presenttransferform.do?collectionType=" + CollectionType.ASSET%>'><%= MessageHelper.formatMessage("uploadfilemenu-mini_TransferAssets") %></base:link></li>
            </base:spanIfAllowed>
         </ul>
      </td>
   </tr>
   
   <% } else if (form.getCollectionType() == CollectionType.MEDIA){ %>
   <tr>
      <td class="ColRow">
         <ul>
             <logic:equal name="<%=UploadFileMenuMiniForm.FORM_NAME%>" property="candoMediaCirculation" value="true">
                <li><base:link page='<%= "/circulation/servlet/presentremotecircform.do?l2m=Offline%20Circulation&collectionType=" + CollectionType.MEDIA%>'><%= MessageHelper.formatMessage("uploadfilemenu-mini_Circulation") %></base:link></li>
             </logic:equal>
             <logic:equal name="<%=UploadFileMenuMiniForm.FORM_NAME%>" property="candoMediaInventory" value="true">
                <li><base:link page='<%= "/backoffice/servlet/presentinventoryform.do?l2m=Inventory&invChooser=false&uploadFile=true&collectionType=" + CollectionType.MEDIA%>'><%= MessageHelper.formatMessage("uploadfilemenu-mini_Inventory") %></base:link></li>
            </logic:equal>
         </ul>
      </td>
   </tr>
   
   <% } %>
</table>
