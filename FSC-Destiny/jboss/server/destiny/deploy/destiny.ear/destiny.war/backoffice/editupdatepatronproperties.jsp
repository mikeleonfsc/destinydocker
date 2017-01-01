<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.EditBarcodeFiltersForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    EditUpdatePatronPropertiesForm form = (EditUpdatePatronPropertiesForm)request.getAttribute(EditUpdatePatronPropertiesForm.FORM_NAME);
%>

<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.EditUpdatePatronPropertiesForm"%>
<%@page import="com.follett.fsc.common.MessageHelper"%><base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handleeditupdatepatronpropertiesform.do" method="post" focus="<%=EditUpdatePatronPropertiesForm.FIELD_UPDATE_PATRON_PROPERTIES%>">
<table border="0" cellspacing="0" cellpadding="3" align="center" width="90%">
   <tr>
      <td width="100%" align="center">

    <base:outlinedTable borderColor="#c0c0c0" id="<%=EditUpdatePatronPropertiesForm.TABLE_MAIN %>" width="50%">

         <tr valign="top">
            <td class="TableHeading" colspan="2">
                <%= MessageHelper.formatMessage("editupdatepatronproperties_EditUpdatePatronProperties") %>
            </td>
        </tr>
          <tr valign="top">
            <td class="ColRowBold" colspan="2"><%= MessageHelper.formatMessage("editupdatepatronproperties_ModifyingPropertiesCurrentFunctionIncorrectly")%></td>
        </tr>
        <tr>
            <td>
                <textarea name="<%= EditUpdatePatronPropertiesForm.FIELD_UPDATE_PATRON_PROPERTIES %>" wrap=off rows="20" cols="80"><%= form.getUpdatePatronProperties() %></textarea>
            </td>
            <td valign="top" class="ColRowBold tdAlignRight">
                <base:showHideTag id="onSave">
                    <base:saveButton /><br>
                    <base:cancelButton /><br>
                </base:showHideTag>    
            </td>
        </tr>        
    </base:outlinedTable>
        </td>
    </tr>
</table>
</base:form>
