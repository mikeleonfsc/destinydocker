<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    AddBarcodeFilterForm form = (AddBarcodeFilterForm)request.getAttribute(AddBarcodeFilterForm.FORM_NAME);
%>
<c:set var="cForm" value="<%=request.getAttribute(AddBarcodeFilterForm.FORM_NAME)%>"/>
<base:messageBox strutsErrors="true"/>

<base:form action="/district/servlet/handleaddbarcodefilterform.do" enctype="multipart/form-data">
    <html:hidden property="siteID" />
    <html:hidden property="collectionType" />

<table border="0" cellspacing="0" cellpadding="3" align="center" width="90%">
<tr>
    <td width="100%">
        <base:outlinedTable borderColor="#c0c0c0" id="<%=AddBarcodeFilterForm.TABLE_MAIN %>" width="100%">
            <tr>
                <td class="TableHeading">
                    Add Filter for <%=CollectionType.getDisplayable(form.getCollectionType())%> Manager
                </td>
                <td class="ColRow tdAlignRight">
                    <base:showHideTag>
                        <base:saveButton onclick="hideElement()"/>
                        <base:cancelButton/>
                    </base:showHideTag>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <base:imageLine/>
                </td>
            </tr>
            <c:if test="${cForm.multipleProductTypes}">
                <tr>
                    <td class="ColRow">
                        <html:radio property="<%=AddBarcodeFilterForm.FIELD_RADIO_MODE%>" value="<%=AddBarcodeFilterForm.RADIO_OPTION_DUPLICATE%>" /> 
                        Duplicate <%=form.gimmeDuplicateProductType()%> Manager Filter
                    </td>
                </tr>
            </c:if>
            <tr>
                <td class="ColRow">
                    <c:choose>
                        <c:when test="${cForm.multipleProductTypes}">
                            <html:radio property="<%=AddBarcodeFilterForm.FIELD_RADIO_MODE%>" value="<%=AddBarcodeFilterForm.RADIO_OPTION_FILE_UPLOAD%>"/>
                            <html:file property="<%=AddBarcodeFilterForm.FIELD_UPLOAD_FILE%>" onfocus="document.district_servlet_AddBarcodeFilterForm.radioMode[1].checked = true" size="30"/>
                        </c:when>
                        <c:otherwise>
                            <html:hidden property="<%=AddBarcodeFilterForm.FIELD_RADIO_MODE%>" value="<%=AddBarcodeFilterForm.RADIO_OPTION_FILE_UPLOAD%>"/>
                            <html:file property="<%=AddBarcodeFilterForm.FIELD_UPLOAD_FILE%>" size="30"/>
                        </c:otherwise>
                    </c:choose>
                </td>
            </tr>
            
        </base:outlinedTable>
        </td>
    </tr>
</table>
</base:form>
