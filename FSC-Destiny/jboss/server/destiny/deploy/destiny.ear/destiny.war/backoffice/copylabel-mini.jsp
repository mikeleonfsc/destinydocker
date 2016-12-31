<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>
<%@ page import="com.follett.fsc.common.StringHelper"%>
<%@ page import="com.follett.fsc.destiny.util.CollectionType"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>


<bean:define id="form" name="<%= CopyLabelForm.FORM_NAME %>"
    type="com.follett.fsc.destiny.client.backoffice.servlet.CopyLabelForm" />
<bean:define id="stocks" name="<%= CopyLabelForm.FORM_NAME %>" property="stockList"/>   

<base:messageBox strutsErrors="true" />

<base:form action="/backoffice/servlet/handlecopylabelform.do">
    <html:hidden property="singleIDToPrint"/>
    <html:hidden property="<%=CopyLabelForm.FIELD_COPIES_ADDED%>"/>
    <html:hidden property="<%=CopyLabelForm.PARAM_TRANSFER_ID%>"/>
    <html:hidden property="<%=CopyLabelForm.PARAM_COLLECTION_TYPE%>"/>
    <html:hidden property="<%= CopyLabelForm.FIELD_PRINT_BARCODE %>" value="on"/>
    <html:hidden property="<%= CopyLabelForm.FIELD_BARCODE_COUNT %>" value="1"/>

    <table id=<%= CopyLabelForm.TABLE_MAIN %> cellSpacing=0 cellPadding=2
        width="100%" border=0>
        <tr>
            <td class="TableHeading2">
                <bean:write name="<%= CopyLabelForm.FORM_NAME %>" property="truncatedTitle"/>
            </td>
        </tr>
        <tr>
            <td class=FormLabel>&nbsp;Barcode labels to print: <%=form.getCopiesAdded()%></td>
        </tr>
        <tr>
            <td class="SmallColHeading">&nbsp;&nbsp; Include the...</td>
        </tr>

        <tr>
            <td class="ColRow" nowrap>&nbsp;&nbsp;&nbsp;&nbsp;
                <html:checkbox property="<%= CopyLabelForm.FIELD_SHOW_SITE_NAME %>"/>Site Name
            </td>
        </tr>
        <tr>
            <td class="ColRow" nowrap>&nbsp;&nbsp;&nbsp;&nbsp;
                <% if (form.getCollectionType() == CollectionType.ASSET) { %>
                    <html:checkbox property="<%= CopyLabelForm.FIELD_SHOW_TITLE_DESCRIPTION %>"/>Resource Name
                <% } else { %>
                    <html:checkbox property="<%= CopyLabelForm.FIELD_SHOW_TITLE_DESCRIPTION %>"/>Title
                <% } %>
            </td>
        </tr>
        <% if (form.getCollectionType() == CollectionType.TEXTBOOK) { %>
        <tr>
            <td class="ColRow" nowrap>&nbsp;&nbsp;&nbsp;&nbsp;
                <html:checkbox property="<%= CopyLabelForm.FIELD_SHOW_AUTHOR %>"/>Author
            </td>
        </tr>
        <% } %>
        <tr>
            <td class="ColRow" nowrap>&nbsp;&nbsp;&nbsp;&nbsp;
                <html:checkbox property="<%= CopyLabelForm.FIELD_SHOW_LOCATION %>"/><% if (form.getCollectionType() == CollectionType.ASSET) { %>Home <% } %>Location
            </td>
        </tr>
        <tr>

          <td class="ColRow" nowrap>&nbsp;Labels 
            <html:select property="<%= BaseCopyLabelForm.FIELD_LABEL_STOCK %>">
                <html:options collection="stocks" property="stringCode" labelProperty="stringDesc"/>
            </html:select>
          </td>
        </tr>
        <tr>

            <td class="ColRow" nowrap>&nbsp;Start on label 
                <html:text property="<%=BaseCopyLabelForm.FIELD_LABEL_START%>" maxlength="3" size="4"/>
            </td>
        </tr>
        <tr>
            <td class="ColRow" nowrap>&nbsp;Offset H:
                <html:text property="<%=BaseCopyLabelForm.FIELD_HORIZONTAL_OFFSET%>" maxlength="4" size="4"/>
                &nbsp;V:
                <html:text property="<%=BaseCopyLabelForm.FIELD_VERTICAL_OFFSET%>" maxlength="4" size="4"/>
            </td>
        </tr>

        <tr>
            <td class="ColRowBold" nowrap align="center">
                <base:reportButton/>
            </td>
        </tr>
    </table>
</base:form>
