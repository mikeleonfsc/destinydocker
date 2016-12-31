<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.ExtractDataCopiesForm"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.data.ExtractPatronParams"%>
<%@page import="com.follett.fsc.destiny.util.Permission"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>


<base:messageBox strutsErrors="true"/>

<%
    ExtractDataCopiesForm form = (ExtractDataCopiesForm)request.getAttribute(ExtractDataCopiesForm.FORM_NAME);
%>
<base:form action="/backoffice/servlet/handleextractdatacopiesform.do">
    <base:outlinedTable id="<%=ExtractDataCopiesForm.TABLE_MAIN%>" borderColor='#C0C0C0'>
        <tr>
        	<td class="TableHeading" colspan="2"><%= MessageHelper.formatMessage("extractdatacopies_ExtractTitleCopyData") %></td>
        </tr>
        <tr>
            <td class="TableHeading" colspan="2">
                <IMG height="1" vspace="1" src="/images/icons/general/line.gif" width="100%">
            </td>
        </tr>
        <tr>
        	<td class="ColRowBold tdAlignRight" nowrap><%= MessageHelper.formatMessage("extractdatacopies_CallNumbersFrom") %></td>
            <td class="ColRowBold">
                <html:text property="<%= ExtractDataCopiesForm.FIELD_SELECT_BY_START %>" />
            <%=MessageHelper.formatMessage("extractdatacopies_To") %>
                <html:text property="<%= ExtractDataCopiesForm.FIELD_SELECT_BY_END %>" />
        	</td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight">
                &nbsp;
            </td>
            <td class="Instruction"><%= MessageHelper.formatMessage("extractdatacopies_ToSpecifyACallNumberRangeEnterAtLeastTheFirst3Digi") %></td>
        </tr>
        <logic:equal name='<%= ExtractDataCopiesForm.FORM_NAME %>' property="showCheckbox" value="true" scope="request" >
        <tr>
            <td class="ColRowBold tdAlignRight">
                &nbsp;
            </td>
            <td class="ColRow">
                <html:checkbox property="<%=ExtractDataCopiesForm.FIELD_INCLUDE_PATRON_DATA%>"/>&nbsp;<%= MessageHelper.formatMessage("extractdatacopies_IncludeAssociatedPatronData") %><base:helpTag helpFileName="d_extract_copy_data_include_patron_data.htm"/>
            </td>
        </tr>
        </logic:equal>
        <tr>
            <td class="TableHeading" colspan="2">
                <IMG height="1" vspace="1" src="/images/icons/general/line.gif" width="100%">
            </td>
        </tr>
        <tr>
        <td colspan="2" align='center'><base:genericShowHideButton alt='<%= MessageHelper.formatMessage("extract") %>' name="<%=ExtractDataCopiesForm.BUTTON_EXTRACT %>" src="/buttons/large/extract.gif"/></td>
        </tr>
    </base:outlinedTable>
</base:form>
