<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.CopyCategoryForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.ConfigSiteSpecs" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.util.Barcode" %>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>



<base:messageBox strutsErrors="true"/>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    CopyCategoryForm form = (CopyCategoryForm)request.getAttribute("cataloging_servlet_CopyCategoryForm"); 
    
%>

<base:form action="/cataloging/servlet/handlecopycategoryform.do" enctype="multipart/form-data">
<html:hidden property="<%=CopyCategoryForm.FIELD_CATEGORY_ID %>"/>
<html:hidden property="<%=CopyCategoryForm.FIELD_COLLECTION_TYPE %>"/>
<table id="<%=CopyCategoryForm.TABLE_MAIN%>" cellpadding="0" cellspacing="0" width="95%">
    <tr>

    </tr>
 <tr>
 <td width="100%">
<base:outlinedTable id="<%=CopyCategoryForm.TABLE_COPY_CATEGORY%>" borderColor='#C0C0C0' width="100%">
    <tr>
        <td colspan="2" class="TableHeading" nowrap>
            <%= ResponseUtils.filter(form.printPageHeader()) %>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("copycategory_SelectBy") %></td>
        
        <td class="ColRow">
            <html:select onchange="javascript:submitTheForm()" property="<%=CopyCategoryForm.FIELD_SELECT_BASED_ON%>">
                <% if (form.canViewBooklist()) { %> 
                    <html:option value='<%="" + CopyCategoryForm.BASED_ON_MYLIST%>'><%= MessageHelper.formatMessage("copycategory_List") %></html:option>
                <% } %>
                <c:if test="<%=! store.isDistrictUser() %>">
                    <html:option value='<%="" + CopyCategoryForm.BASED_ON_BARCODE_LIST%>'><%= MessageHelper.formatMessage("copycategory_BarcodeList") %></html:option>
                </c:if>
                <c:choose>
                    <c:when test="<%=form.getCollectionType() == CollectionType.ASSET%>">
                        <html:option value='<%="" + CopyCategoryForm.BASED_ON_DATE_ADDED%>'><%= MessageHelper.formatMessage("copycategory_DateItemsAdded") %></html:option>
                    </c:when>
                    <c:otherwise>
                        <html:option value='<%="" + CopyCategoryForm.BASED_ON_DATE_ADDED%>'><%= MessageHelper.formatMessage("copycategory_DateCopiesAdded") %></html:option>
                    </c:otherwise>
                </c:choose>

            </html:select>                           
        </td>  
    </tr>    
    <c:choose>
        <c:when test="<%=form.getSelectOptionBasedOn() == CopyCategoryForm.BASED_ON_MYLIST %>">
            <base:imageSpacer width="12" height="1"/>
            <tr>
                <td>&nbsp;</td>
                <td nowrap>
                 <%-- PUT MY LIST COMBO HERE IF selector is by mylist --%>
                <% if (form.getSelectOptionBasedOn() == CopyCategoryForm.BASED_ON_MYLIST) { %>
                    <base:myListSelect name="<%= CopyCategoryForm.FIELD_SELECTED_LISTID%>" submitOnChange="false" prompt="" publicList="false" selectedMyListID="<%=form.getSelectedListID()%>"/>
                <% } else { %>
                    <input type="hidden" name="selectedListID" value="<%=form.getSelectedListID()%>"/>
                <% } %>
                    <base:genericButton name="<%=CopyCategoryForm.BUTTON_VIEW_LIST%>" src="/buttons/large/viewlist.gif" 
                        alt='<%=MessageHelper.formatMessage("viewList")%>' absbottom="true"></base:genericButton>
                </td>
            </tr>
        </c:when>
        <c:when test="<%=form.getSelectOptionBasedOn() == CopyCategoryForm.BASED_ON_BARCODE_LIST %>">
            <tr>
               <td>&nbsp;</td>
               <td>
                  <base:barcodeList barcodeType="<%=Barcode.BARCODETYPE_COPY %>" 
                      formName="<%=CopyCategoryForm.FORM_NAME%>"/>
               </td>
            </tr>
        </c:when>
        <c:when test="<%=form.getSelectOptionBasedOn() == CopyCategoryForm.BASED_ON_DATE_ADDED %>">
            <tr>
                <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("copycategory_CopiesAdded") %></td>
                 <td nowrap>
                 <html:select property='<%="" + CopyCategoryForm.FIELD_SELECT_DATE_MODE%>'>
                        <html:option value='<%="" + CopyCategoryForm.DATE_MODE_AFTER_THE_DATE%>'><%= MessageHelper.formatMessage("copycategory_AfterTheDate") %></html:option>
                        <html:option value='<%="" + CopyCategoryForm.DATE_MODE_ON_THIS_DATE%>'><%= MessageHelper.formatMessage("copycategory_OnTheDate") %></html:option>
                        <html:option value='<%="" + CopyCategoryForm.DATE_MODE_BEFORE_THE_DATE%>'><%= MessageHelper.formatMessage("copycategory_BeforeTheDate") %></html:option>
                    </html:select>
                    
                <base:date 
                    buttonName = "<%= CopyCategoryForm.BUTTON_DATE_ADDED %>"
                    fieldName = "<%= CopyCategoryForm.FIELD_DATE_ADDED %>"
                    dateValue = "<%=form.getDateAdded()%>"
                    altText = '<%=MessageHelper.formatMessage("copycategory_ChangeDateAdded")%>'
                     />
                </td>
             </tr>
         </c:when>
     </c:choose>
     <tr><td></td></tr>
     <tr><td></td></tr>
     <tr>
        <td colspan="2" align="center"><base:okButton/>&nbsp;<base:closeButton withX="true" /></td>
     </tr>
     
</base:outlinedTable>

</table>
</base:form>

<SCRIPT LANGUAGE="javascript" TYPE="text/javascript">
<!--
    function submitTheForm() {
        document.<%=CopyCategoryForm.FORM_NAME%>.submit();
    }
// -->
</SCRIPT>
