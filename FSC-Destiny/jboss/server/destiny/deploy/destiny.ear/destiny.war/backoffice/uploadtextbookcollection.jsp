<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    UploadTextbookCollectionForm form = (UploadTextbookCollectionForm)request.getAttribute(UploadTextbookCollectionForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handleuploadtextbookcollectionform.do">

    <base:outlinedTable id="<%=UploadTextbookCollectionForm.TABLE_OUTLINE_UPLOAD_TEXTBOOKS%>" borderColor="#c0c0c0">
        <tr valign="top">
            <td class="TableHeading" colspan="2">
            As a service to you...
            </td>
        </tr>
        <tr>
            <td class="ColRow" colspan="2">
                Follett School Solutions can analyze your textbook collection,
                which will allow them to:
                <ul>
                    <li>Provide custom catalogs via the <a href="http://www.fes.follett.com" target="_blank">
                        Follett web site</a> to simplify online ordering.
                    <li>Make certain that the books you are using are available from
                        the Follett inventory.
                    <li>Potentially purchase your surplus textbooks, teacher's editions
                       and unused workbooks in exchange for cash or credit (books must
                       meet conditioning criteria guidelines).
                </ul>                
            </td>
        </tr>
        <tr>
            <base:sectionHeading printerFriendly="false" heading="Contact Info" tdContent="colSpan='2'"/>
        </tr>
        <tr>
            <td class="ColRow" colspan="2">
                In order to ensure you receive a timely response concerning your collection analysis, please
                include the following information:
            </td>
        </tr>
        <tr>
            <td class="ColRow tdAlignRight">*Last&nbsp;Name&nbsp;</td>
            <td width="100%">
                <html:text property="<%=UploadTextbookCollectionForm.FIELD_CONTACT_LASTNAME%>" size="30" maxlength="<%=UploadTextbookCollectionForm.LENGTH_CONTACT_LASTNAME%>"/>
            </td>
        </tr>
        <tr>
            <td class="ColRow tdAlignRight">*First&nbsp;Name&nbsp;</td>
            <td width="100%">
                <html:text property="<%=UploadTextbookCollectionForm.FIELD_CONTACT_FIRSTNAME%>" size="30" maxlength="<%=UploadTextbookCollectionForm.LENGTH_CONTACT_FIRSTNAME%>"/>
            </td>
        </tr>
        <tr>
            <td class="ColRow tdAlignRight">*Email&nbsp;</td>
            <td width="100%">
                <html:text property="<%=UploadTextbookCollectionForm.FIELD_CONTACT_EMAIL%>" size="30" maxlength="<%=UploadTextbookCollectionForm.LENGTH_CONTACT_EMAIL%>"/>
            </td>
        </tr>
        <tr>
            <td class="ColRow tdAlignRight">Phone&nbsp;</td>
            <td width="100%">
                <html:text property="<%=UploadTextbookCollectionForm.FIELD_CONTACT_PHONE%>" size="30" maxlength="<%=UploadTextbookCollectionForm.LENGTH_CONTACT_PHONE%>"/>
            </td>
        </tr>
        <tr>
            <td class="Instruction" colspan="2">
            * required
            </td>
        <tr>
            <td colspan="2"><base:imageLine height="1" width="100%"/></td>
        </tr>
        <tr>
            <td class="ColRow" colspan="2">
            <% if (form.getCollectionType() == CollectionType.TEXTBOOK) { %>
                The information uploaded is limited to contact information, the titles of the textbooks in 
                your collection as well as the number and relative condition of each copy.
            <% } else { %>    
                The information uploaded is limited to contact information, the titles of the textbooks in 
                your collection as well as the number and relative condition of each item.
            <% } %>    
            </td>
        </tr>
        <tr>
            <td align="center" class="FormElement" colspan="2">
                <base:genericButton src="/buttons/large/uploadtextbooks.gif"
                    alt="<%=UploadTextbookCollectionForm.ALT_SUBMIT_TEXT %>"
                    name="<%=UploadTextbookCollectionForm.BUTTON_UPLOAD %>" />
            </td>
        </tr>
    </base:outlinedTable>
</base:form>
