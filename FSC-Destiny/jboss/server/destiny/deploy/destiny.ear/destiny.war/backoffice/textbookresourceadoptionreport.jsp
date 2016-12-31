<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.BaseSaveableReportForm"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.TextbookResourceAdoptionReportForm" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.data.TextbookResourceAdoptionReportJobParams" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>

<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<% 
    TextbookResourceAdoptionReportForm form = (TextbookResourceAdoptionReportForm) request.getAttribute(TextbookResourceAdoptionReportForm.FORM_NAME);
%>


<base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handletextbookresourceadoptionreportform.do">
<html:hidden property="<%=TextbookResourceAdoptionReportForm.FIELD_ACTION%>"/>
<html:hidden property="<%=TextbookResourceAdoptionReportForm.FIELD_JOB_SPEC_ID%>"/>
<html:hidden property="<%=TextbookResourceAdoptionReportForm.PARAM_REPORT_NAME%>"/>
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">

<base:outlinedTable id="<%=TextbookResourceAdoptionReportForm.TABLE_TEXTBOOK_RESOURCE_ADOPTION_REPORT%>" cellpadding="5" cellspacing="0" borderColor='#C0C0C0'>
    <tr>
        <td colspan="2" class="TableHeading">
            List textbook adoption information....
        </td>
    </tr>

    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>

    <tr>
        <td class="ColRowBold tdAlignRight" valign="top">
            <nobr>Select &amp; sort by</nobr>
        </td>
        <td class="ColRow">
            <html:select property="<%=TextbookResourceAdoptionReportForm.FIELD_SELECT_AND_SORT_BY%>">
                <html:option value="<%=TextbookResourceAdoptionReportJobParams.SELECT_SORT_BY_TITLE%>">Title</html:option>
                <html:option value="<%=TextbookResourceAdoptionReportJobParams.SELECT_SORT_BY_PUBLISHER%>">Publisher</html:option>
                <html:option value="<%=TextbookResourceAdoptionReportJobParams.SELECT_SORT_BY_VENDOR%>">Vendor</html:option>
            </html:select>
            &nbsp;from&nbsp;
            <html:text property="<%=TextbookResourceAdoptionReportForm.FIELD_SELECT_AND_SORT_BY_FROM%>" size="9" maxlength="<%=TextbookResourceAdoptionReportForm.LENGTH_RANGE_FIELD%>"/>
            &nbsp;to&nbsp;
            <html:text property="<%=TextbookResourceAdoptionReportForm.FIELD_SELECT_AND_SORT_BY_TO%>" size="9" maxlength="<%=TextbookResourceAdoptionReportForm.LENGTH_RANGE_FIELD%>"/>
        </td>
    </tr>

    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top">
            <nobr>Show</nobr>
        </td>
        <td class="ColRow">
            <html:radio property="<%=TextbookResourceAdoptionReportForm.FIELD_SHOW_DETAILS_FOR%>" value="<%=TextbookResourceAdoptionReportJobParams.SHOW_DETAILS_TITLES_ONLY%>">Titles only</html:radio>
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td class="ColRow">
            <html:radio property="<%=TextbookResourceAdoptionReportForm.FIELD_SHOW_DETAILS_FOR%>" value="<%=TextbookResourceAdoptionReportJobParams.SHOW_DETAILS_ALL_COPIES%>">Titles and all items</html:radio>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight" valign="top">
            <nobr>Limit by</nobr>
        </td>
        <td class="ColRow">
            <html:select property="<%=TextbookResourceAdoptionReportForm.FIELD_LIMIT_BY%>">
                <html:option value="<%=TextbookResourceAdoptionReportJobParams.LIMITER_STATE_ADOPTION%>">State Adoption</html:option>
                <html:option value="<%=TextbookResourceAdoptionReportJobParams.LIMITER_DISTRICT_ADOPTION%>">District Adoption</html:option>
                <html:option value="<%=TextbookResourceAdoptionReportJobParams.LIMITER_END_ADOPTION%>">End Adoption</html:option>
            </html:select>
            &nbsp;from&nbsp;
            <html:text property="<%=TextbookResourceAdoptionReportForm.FIELD_LIMIT_BY_FROM%>" size="9" maxlength="<%=TextbookResourceAdoptionReportForm.LENGTH_LIMIT_FIELD%>"/>
            &nbsp;to&nbsp;
            <html:text property="<%=TextbookResourceAdoptionReportForm.FIELD_LIMIT_BY_TO%>" size="9" maxlength="<%=TextbookResourceAdoptionReportForm.LENGTH_LIMIT_FIELD%>"/>
        </td>
    </tr>
    <tr>
        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
    </tr>
    <tr>
        <td class="ColRowBold" colspan="3" align="center">
            <table>
                <tr>
                    <td>
                        <base:reportButton/>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
</base:outlinedTable>
</base:form>
