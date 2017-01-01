<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.data.BaseReportJobParams"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.ShelfListReportForm" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%-- I18n Support --%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ page import="com.follett.fsc.common.MessageHelper"%>


<base:messageBox strutsErrors="true"/>
<bean:define id="form" name="<%= ShelfListReportForm.FORM_NAME %>" type="com.follett.fsc.destiny.client.backoffice.servlet.ShelfListReportForm"/>
<base:form action="/backoffice/servlet/handleshelflistreportform.do">

<base:outlinedTable id="<%= ShelfListReportForm.TABLE_SHELF_LIST_REPORT%>" borderColor='#C0C0C0'>
    <tr>
        <td class="TableHeading" valign="top" colspan="2">
            <nobr><%=MessageHelper.formatMessage("shelflistreport_GenerateAShelfListShowing") %></nobr>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("shelflistreport_IncludeCallNumbers") %>&nbsp;</td>
        <td class="ColRow">
            <html:radio property="<%= ShelfListReportForm.FIELD_CALL_NUM_RANGE %>" value="false"><%=MessageHelper.formatMessage("shelflistreport_AllRangesAndPrefixesInTheCollection") %></html:radio>
        </td>
    </tr>
    <tr>
        <td>&nbsp;
        </td>
        <td class="ColRow">
                <html:radio property="<%= ShelfListReportForm.FIELD_CALL_NUM_RANGE %>" value="true"><%=MessageHelper.formatMessage("shelflistreport_From") %>&nbsp;
                    <html:text property="<%= ShelfListReportForm.FIELD_CALL_NUM_RANGE_FROM %>" size="15" maxlength="30"/>
                    &nbsp;<%=MessageHelper.formatMessage("shelflistreport_To") %>&nbsp;
                    <html:text property="<%= ShelfListReportForm.FIELD_CALL_NUM_RANGE_TO %>" size="15" maxlength="30"/>
                </html:radio>
        </td>
    </tr>
    <tr>
        <td>&nbsp;
        </td>
        <td class="Instruction"><%=MessageHelper.formatMessage("shelflistreport_ToSpecifyACallNumberRangeEnterAtLeastTheFirst3Digi") %></td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("shelflistreport_CountCirculations") %></td>
            <td class="ColRow"> 
            <base:dateRange 
                    dateFrom="<%=form.getDateFrom()%>"
                    dateTo="<%=form.getDateTo()%>"
            />                   
            </td>
    </tr>
    <tr>
        <td class="tdAlignRight">
        &nbsp;
        </td>
        <td class="ColRow">
            <html:checkbox property='<%= ShelfListReportForm.FIELD_INCLUDE_IN_LIBRARY_CIRCS%>'><%=MessageHelper.formatMessage("shelflistreport_IncludeCirculationsFromInLibraryUse") %></html:checkbox>        
        </td>
    </tr>
    <tr>
        <td colspan="2">
        &nbsp;
        </td>
    </tr>
        
    <tr>
        <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("shelflistreport_Show") %></td>
        <td class="ColRow">
            <html:radio property="<%=ShelfListReportForm.FIELD_SHOW_EXTRA_DATA%>" value='<%=""+ShelfListReportForm.RADIO_SHOW_PRICE%>' /><%=MessageHelper.formatMessage("shelflistreport_Price") %></td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">
            &nbsp;
        </td>
        <td class="ColRow">
            <html:radio property="<%=ShelfListReportForm.FIELD_SHOW_EXTRA_DATA%>" value='<%=""+ShelfListReportForm.RADIO_SHOW_PUBYEAR%>' /><%=MessageHelper.formatMessage("shelflistreport_PublicationYear") %></td>
    </tr>
    <base:reportOutputType selectedValue="<%=form.getOutputType()%>" />
    <tr>
        <td class="ColRowBold" colspan="2" align="center">
            <base:reportButton/>
        </td>
    </tr>
</base:outlinedTable>
</base:form>
