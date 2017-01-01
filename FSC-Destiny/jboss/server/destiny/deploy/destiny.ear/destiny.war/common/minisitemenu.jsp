<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.MiniSiteMenuForm" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%><base:messageBox strutsErrors="true"/>

<table id="<%=MiniSiteMenuForm.TABLE_NAME%>" cellpadding="2" cellspacing="0" border="0" width="100%">

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );
 %>
<% if (!store.isStateContext()) { %> 
<logic:equal name="<%=MiniSiteMenuForm.FORM_NAME%>" property="mediaSite" value="true">
<base:spanIfAllowed permissions='<%= new Permission[] {Permission.CIRC_CHECKIN, Permission.BACK_OFFICE_INVENTORY_LIBRARY_COLLECTION} %>'>
   <tr>
       <td>
           <table id="<%=MiniSiteMenuForm.TABLE_LIBRARY%>" cellpadding="0" border="0" width="100%">
               <tr>
                  <td class="ColRowBold"><base:image src="/icons/general/home.gif" width="18" height="16"/>Media Manager</td>
               </tr>
               <tr>
                  <td class="ColRow">
                     <ul>
                        <base:spanIfAllowed permissions='<%= new Permission[] {Permission.CIRC_CHECKIN} %>'>
                        <li><base:link page="/circulation/servlet/presentcheckinform.do?l2m=Check%20In">Check In</base:link></li>
                        </base:spanIfAllowed>
                        <base:spanIfAllowed permissions='<%= new Permission[] {Permission.BACK_OFFICE_INVENTORY_LIBRARY_COLLECTION} %>'>
                        <li><base:link page='<%= "/backoffice/servlet/presentinventoryform.do?l2m=Inventory&uploadFile=false&invChooser=true&collectionType=" + BibMasterSpecs.COLLECTION_TYPE_MEDIA%>'>Inventory</base:link></li>
                        </base:spanIfAllowed>
                        <logic:equal name="<%=MiniSiteMenuForm.FORM_NAME%>" property="canUploadMediaFiles" value="true">
                            <li><base:link page='<%="/common/servlet/presentuploadfilemenuminiform.do?collectionType=" + BibMasterSpecs.COLLECTION_TYPE_MEDIA%>'>Upload File</base:link></li>
                        </logic:equal>
                     </ul>
                  </td>
               </tr>
            </table>
        </td>
    </tr>
</base:spanIfAllowed>
</logic:equal>
<logic:equal name="<%=MiniSiteMenuForm.FORM_NAME%>" property="mediaSite" value="false">                
<base:spanIfAllowed permissions='<%= new Permission[] {Permission.CIRC_CHECKOUT, Permission.CIRC_CHECKIN, Permission.BACK_OFFICE_INVENTORY_LIBRARY_COLLECTION} %>'>
   <tr>
       <td>
           <table id="<%=MiniSiteMenuForm.TABLE_LIBRARY%>" cellpadding="0" border="0" width="100%">
               <tr>
                  <td class="ColRowBold"><base:image src="/icons/general/home.gif" width="18" height="16"/>Library Manager</td>
               </tr>
               <tr>
                  <td class="ColRow">
                     <ul>
                        <base:spanIfAllowed permissions='<%= new Permission[] {Permission.CIRC_CHECKOUT} %>'>
                        <li><base:link  page="/circulation/servlet/presentcheckoutform.do?l2m=Check%20Out">Check Out</base:link></li>
                        </base:spanIfAllowed>
                        <base:spanIfAllowed permissions='<%= new Permission[] {Permission.CIRC_CHECKIN} %>'>
                        <li><base:link page="/circulation/servlet/presentcheckinform.do?l2m=Check%20In">Check In</base:link></li>
                        </base:spanIfAllowed>
                        <base:spanIfAllowed permissions='<%= new Permission[] {Permission.BACK_OFFICE_INVENTORY_LIBRARY_COLLECTION} %>'>
                        <li><base:link page='<%= "/backoffice/servlet/presentinventoryform.do?l2m=Inventory&invChooser=true&uploadFile=false&collectionType=" + BibMasterSpecs.COLLECTION_TYPE_LIBRARY%>'>Inventory</base:link></li>
                        </base:spanIfAllowed>
                        <logic:equal name="<%=MiniSiteMenuForm.FORM_NAME%>" property="canUploadLibraryFiles" value="true">
                            <li><base:link page='<%= "/common/servlet/presentuploadfilemenuminiform.do?collectionType=" + BibMasterSpecs.COLLECTION_TYPE_LIBRARY %>'>Upload File</base:link></li>
                        </logic:equal>
                     </ul>
                  </td>
               </tr>
            </table>
        </td>
    </tr>
</base:spanIfAllowed>
<base:spanIfAllowed permissions='<%= new Permission[] {Permission.CIRC_CHECKOUT_TEXTBOOK, Permission.CIRC_CHECKIN_TEXTBOOK, Permission.BACK_OFFICE_INVENTORY_TEXTBOOK_COLLECTION, Permission.CAT_TRANSFER_RECEIVE_TEXTBOOK_COPIES} %>'>
   <tr>
       <td>
           <table id="<%=MiniSiteMenuForm.TABLE_TEXTBOOK%>" cellpadding="0" border="0" width="100%">
               <tr>
                  <td class="ColRowBold"><base:image src="/icons/general/home.gif" width="18" height="16"/>Textbook Manager</td>
               </tr>
                <tr>
                    <td class="ColRow">
                       <ul>
                        <base:spanIfAllowed permissions='<%= new Permission[] {Permission.CIRC_CHECKOUT_TEXTBOOK} %>'>
                          <li><base:link page="/circulation/servlet/presentcheckoutform.do?collectionType=1">Check Out to Patron</base:link></li>
                          <li><base:link page="/circulation/servlet/presentcheckoutform.do?collectionType=1&toClassMode=true">Check Out by Class</base:link></li>
                          <li><base:link page="/circulation/servlet/presentcheckoutform.do?collectionType=1&toTeacherMode=true">Check Out to Teacher</base:link></li>
                        </base:spanIfAllowed>
                        <base:spanIfAllowed permissions='<%= new Permission[] {Permission.CIRC_CHECKIN_TEXTBOOK} %>'>
                          <li><base:link page='<%="/circulation/servlet/presentcheckinform.do?l2m=Check%20In%20Text&collectionType=" + BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK%>'>Check In</base:link></li>
                        </base:spanIfAllowed>
                        <base:spanIfAllowed permissions='<%= new Permission[] {Permission.BACK_OFFICE_INVENTORY_TEXTBOOK_COLLECTION} %>'>
                          <li><base:link page='<%= "/backoffice/servlet/presentinventoryform.do?l2m=Inventory&invChooser=true&uploadFile=false&collectionType=" + BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK%>'>Inventory</base:link></li>
                        </base:spanIfAllowed>
                        <base:spanIfAllowed permissions='<%= new Permission[] {Permission.CAT_TRANSFER_RECEIVE_TEXTBOOK_COPIES} %>'>
                            <li><base:link page='<%= "/cataloging/servlet/presenttransferform.do?barcodeListOnly=true&collectionType=" + BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK%>'>Transfer Textbooks</base:link></li>
                        </base:spanIfAllowed>
                        <base:spanIfAllowed permissions='<%= new Permission[] {Permission.CAT_TRANSFER_RECEIVE_TEXTBOOK_COPIES} %>'>
                          <li><base:link page='<%= "/cataloging/servlet/presentreceiveitemstrackform.do?collectionType=" + BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK%>'>Receive Textbooks</base:link></li>
                        </base:spanIfAllowed>
                        <logic:equal name="<%=MiniSiteMenuForm.FORM_NAME%>" property="canUploadTextbookFiles" value="true">
                            <li><base:link page='<%= "/common/servlet/presentuploadfilemenuminiform.do?collectionType=" + BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK%>'>Upload File</base:link></li>
                        </logic:equal>
                       </ul>            
                    </td>
                </tr>
            </table>
        </td>
    </tr>
</base:spanIfAllowed>   
<base:spanIfAllowed permissions='<%= new Permission[] {Permission.BACK_OFFICE_INVENTORY_ASSET_COLLECTION, Permission.CAT_TRANSFER_RECEIVE_ASSET_ITEMS, Permission.CIRC_ASSET_CHECKOUT, Permission.CIRC_ASSET_CHECKIN} %>'>
   <tr>
       <td>
           <table id="<%=MiniSiteMenuForm.TABLE_ASSET%>" cellpadding="0" border="0" width="100%">
               <tr>
                  <td class="ColRowBold"><base:image src="/icons/general/home.gif" width="18" height="16"/>Resource Manager</td>
               </tr>
                <tr>
                    <td class="ColRow">
                       <ul>
						<base:spanIfAllowed permissions='<%= new Permission[] {Permission.CIRC_ASSET_CHECKOUT} %>'>
							<li><base:link page='<%="/circulation/servlet/presentcheckoutform.do?l2m=Check%20Out&collectionType=" + BibMasterSpecs.COLLECTION_TYPE_ASSET%>'>Check Out to Patron</base:link></li>
							<li><base:link page='<%="/circulation/servlet/presentcheckouttodepartmentform.do?l2m=Check%20Out&collectionType=" + BibMasterSpecs.COLLECTION_TYPE_ASSET%>'>Check Out to Department</base:link></li>
							<li><base:link page='<%="/circulation/servlet/presentcheckouttolocationform.do?l2m=Check%20Out&collectionType=" + BibMasterSpecs.COLLECTION_TYPE_ASSET%>'>Check Out to Location</base:link></li>
						</base:spanIfAllowed>
						<base:spanIfAllowed permissions='<%= new Permission[] {Permission.CIRC_ASSET_CHECKIN} %>'>
							<li><base:link page='<%="/circulation/servlet/presentcheckinform.do?l2m=Check%20In&collectionType=" + BibMasterSpecs.COLLECTION_TYPE_ASSET%>'>Check In</base:link></li>
						</base:spanIfAllowed>
						<base:spanIfAllowed permissions='<%= new Permission[] {Permission.BACK_OFFICE_INVENTORY_ASSET_COLLECTION} %>'>
                          <li><base:link page='<%= "/backoffice/servlet/presentinventoryform.do?l2m=Inventory&invChooser=true&uploadFile=false&collectionType=" + BibMasterSpecs.COLLECTION_TYPE_ASSET%>'>Inventory</base:link></li>
						</base:spanIfAllowed>
						<base:spanIfAllowed permissions='<%= new Permission[] {Permission.CAT_TRANSFER_RECEIVE_ASSET_ITEMS} %>'>
                            <li><base:link page='<%= "/cataloging/servlet/presenttransferform.do?barcodeListOnly=true&collectionType=" + BibMasterSpecs.COLLECTION_TYPE_ASSET%>'>Transfer Resources</base:link></li>
						</base:spanIfAllowed>
						<base:spanIfAllowed permissions='<%= new Permission[] {Permission.CAT_TRANSFER_RECEIVE_ASSET_ITEMS, Permission.CAT_MANAGE_RECEIVE_ASSET_ITEMS_WITHOUT_BARCODES} %>'>
                          <li><base:link page='<%= "/cataloging/servlet/presentreceiveitemstrackform.do?collectionType=" + BibMasterSpecs.COLLECTION_TYPE_ASSET%>'>Receive Resources</base:link></li>
						</base:spanIfAllowed>
						<base:spanIfAllowed permissions='<%= new Permission[] {Permission.CAT_TRANSFER_RECEIVE_ASSET_ITEMS, Permission.BACK_OFFICE_INVENTORY_ASSET_COLLECTION} %>'>
                        <logic:equal name="<%=MiniSiteMenuForm.FORM_NAME%>" property="canUploadAssetFiles" value="true">
                          <li><base:link page='<%= "/common/servlet/presentuploadfilemenuminiform.do?collectionType=" + BibMasterSpecs.COLLECTION_TYPE_ASSET%>'>Upload File</base:link></li>
                        </logic:equal>
						</base:spanIfAllowed>
						
                       </ul>            
                    </td>
                </tr>
            </table>
        </td>
    </tr>
</base:spanIfAllowed>
</logic:equal>
<% } else { %>
    <% if (store.canViewAny(new Permission[] { Permission.BACK_OFFICE_INVENTORY_TEXTBOOK_COLLECTION })) { %>
       <tr>
           <td>
               <table id="<%=MiniSiteMenuForm.TABLE_TEXTBOOK%>" cellpadding="0" border="0" width="100%">
                   <tr>
                      <td class="ColRowBold"><base:image src="/icons/general/home.gif" width="18" height="16"/>Textbook Manager</td>
                   </tr>
                    <tr>
                        <td class="ColRow">
                           <ul>
                            <li><base:link page='<%= "/backoffice/servlet/presentinventoryform.do?l2m=Inventory&invChooser=true&uploadFile=false&collectionType=" + BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK%>'>Inventory</base:link></li>
                            <logic:equal name="<%=MiniSiteMenuForm.FORM_NAME%>" property="canUploadTextbookFiles" value="true">
                                <li><base:link page='<%= "/common/servlet/presentuploadfilemenuminiform.do?collectionType=" + BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK%>'>Upload File</base:link></li>
                            </logic:equal>
                           </ul>            
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    <% } else { %>
        <tr><td class="ColRowBold">You do not have permission to access this application.</td></tr>
    <% } %>
<% } %>
</table>
